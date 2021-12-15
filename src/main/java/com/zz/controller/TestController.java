package com.zz.controller;

import com.github.pagehelper.PageInfo;
import com.zz.controller.base.BaseController;
import com.zz.entity.User;
import com.zz.service.UserService;
import com.zz.vo.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * 测试层
 * @author 张正
 * @since 2021-12-02 21:52:27
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController extends BaseController {
    @Autowired
    UserService userService;

    /**
     * 测试异常
     */
    @PostMapping("/exception")
    public void exception(){
        throw new RuntimeException("出现异常");
    }

    /**
     * 测试成功
     * @return
     */
    @PostMapping("/success")
    public User success(){
        return  new User();
    }

    /**
     * 测试响应头
     */
    @PostMapping("/header")
    public User header(@RequestBody User user){
        return  new User();
    }

    @PostMapping("/queryByPage")
    public Page<User> queryByPage(@RequestBody User user, PageRequest pageRequest) {
        return this.userService.queryByPage(user, pageRequest);
    }

    /**
     * 跳转到应用列表页面
     * @param pageNo 要显示第几页内容
     * @param pageSize 一页显示多少条
     * @return
     */
    @RequestMapping("/list")
    public PageInfo<User> list(@RequestParam(value="pageNo",defaultValue="1")int pageNo,
                               @RequestParam(value="pageSize",defaultValue="10")int pageSize) {
        log.info("pageNo={},pageSize={}",pageNo,pageSize);
        PageInfo<User> page = userService.getUserPage(pageNo,pageSize);
        return  page;
    }

    @PostMapping("/user")
    public User user(){
        User user=getUser();
        return user;
    }

}
