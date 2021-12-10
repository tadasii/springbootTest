package com.zz.config;

import com.zz.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
@Order(1)
public class CommonResponseBodyAdvice implements ResponseBodyAdvice {
    @Autowired
    private Environment environment;

    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
//        Class retType = returnType.getParameterType();
//        return ResponseVo.class.isAssignableFrom(retType);
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        Map<String,Object> respMap = new HashMap<>();
        respMap.put("code","00");
        respMap.put("message","success");
        respMap.put("data",o);
        return respMap;
    }
}
