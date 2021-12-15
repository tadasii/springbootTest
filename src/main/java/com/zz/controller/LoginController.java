package com.zz.controller;

import com.zz.entity.User;
import com.zz.service.UserService;
import com.zz.util.TokenUtil;
import com.zz.vo.TokenOutVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录控制层
 * @author makejava
 * @since 2021-12-02 21:52:27
 */
@RestController
public class LoginController {

    @Autowired
    TokenUtil tokenUtil;
    @Autowired
    UserService userService;

    @PostMapping("/login")
    public TokenOutVo login(@RequestBody User user){
        // 先验证用户的账号密码,账号密码验证通过之后，生成Token
        String role = "ROLE_ADMIN";
        User user1 = userService.queryById(user.getId());
        String token = "";
        if(user1!=null&& StringUtils.equals(user1.getPassword(),user.getPassword())){
             token = tokenUtil.getToken(user.getId()+"",role);
        }else{
            throw new RuntimeException("用户id或者密码错误");
        }
        TokenOutVo tokenOutVo = new TokenOutVo();
        tokenOutVo.setToken(token);
        return tokenOutVo;
    }
}
