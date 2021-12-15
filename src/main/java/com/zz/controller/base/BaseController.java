package com.zz.controller.base;

import com.zz.dao.UserDao;
import com.zz.entity.User;
import com.zz.util.TokenUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Component
public class BaseController extends GlobalExceptionHandler{
    @Autowired
    TokenUtil tokenUtil;
    @Autowired
    UserDao userDao;

    @Autowired
    private HttpServletRequest request;

    public User getUser(){
        User user = new User();
        String token = request.getHeader("Authorization");
        if(StringUtils.isNotEmpty(token)){
            Map<String, String> map = tokenUtil.parseToken(token);
            String userId = map.get("userId");
            int id = Integer.valueOf(userId);
            user = userDao.queryById(id);
        }
        return user;
    }
}
