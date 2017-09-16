package com.mmb.controller;

import com.mmb.model.Result;
import com.mmb.util.ResultConstant;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录/验证中心
 * Created by hubin on 2017/9/15.
 */
@RestController
public class LoginController {

    @RequestMapping("/register")
    public Result register() {
        return new Result(ResultConstant.SUCCESS, "注册成功");
    }

    @RequestMapping("/forget")
    public Result forget() {
        return new Result(ResultConstant.SUCCESS, "注册成功");
    }

//    @RequestMapping("/login")
//    public Result login(@RequestParam String username,@RequestParam String password) {
//        return new Result(ResultConstant.SUCCESS, "注册成功");
//    }

    @RequestMapping("/logout")
    public Result logout(@RequestParam String username,@RequestParam String password) {
        return new Result(ResultConstant.SUCCESS, "注册成功");
    }



}


