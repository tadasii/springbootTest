package com.zz.controller.base;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GlobalExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(ExceptionHandler.class);

    public GlobalExceptionHandler() {

    }

    @ExceptionHandler
    public void baseErrorHandler(HttpServletResponse response,Exception exception){
        logger.info("全局异常处理开始");
        Map<String,Object> respMap = new HashMap<>();
        response.setCharacterEncoding("UTF-8");
        respMap.put("code","99");
        respMap.put("message", exception.getMessage());
        try {
            response.getWriter().write(JSON.toJSONString(respMap));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
