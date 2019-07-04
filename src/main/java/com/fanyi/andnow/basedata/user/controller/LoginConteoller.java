package com.fanyi.andnow.basedata.user.controller;

import com.fanyi.andnow.basedata.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 登陆/注册控制器
 *
 * @author wangyds
 * @date 2019/7/4
 */
@Controller
public class LoginConteoller {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/")
    public String getOneUser() {
        return "login";
    }
}
