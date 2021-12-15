package com.zz.interceptor;

import com.zz.util.TokenUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * 请求拦截器
 */
@Slf4j
@Component
public class AuthHandlerInterceptor implements HandlerInterceptor {
    @Autowired
    TokenUtil tokenUtil;

    /**
     * 刷新时间
     */
    @Value("${token.refreshTime}")
    private Long refreshTime;
    /**
     * 过期时间
     */
    @Value("${token.expiresTime}")
    private Long expiresTime;

    @Override
    public  boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object object)
            throws Exception {
        log.info("=======进入拦截器========");
        // 如果不是映射到方法直接通过,可以访问资源.
        if (!(object instanceof HandlerMethod)) {
            return true;
        }
        //为空就返回错误
        String token = httpServletRequest.getHeader("Authorization");
        if (null == token || "".equals(token.trim())) {
            return false;
        }

        log.info("==============token:" + token);
        Map<String, String> map = tokenUtil.parseToken(token);
        String userId = map.get("userId");
        String userRole = map.get("userRole");
        long timeOfUse = System.currentTimeMillis() - Long.parseLong(map.get("timeStamp"));

        if (timeOfUse < refreshTime) {
            //判断 token 是否过期
            log.info("token验证成功");
            return true;
        }else if (timeOfUse >= refreshTime && timeOfUse < expiresTime) {
            //超过token刷新时间，刷新 token
            httpServletResponse.setHeader("token",tokenUtil.getToken(userId,userRole));
            log.info("token刷新成功");
            return true;
        }else {
            //token过期就返回 token 无效.
            throw new RuntimeException("token过期");
        }

    }
}
