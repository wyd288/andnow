package com.fanyi.andnow.basedata.psnjob.controller;

import com.fanyi.andnow.basedata.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginConteoller {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/test")
    public String getOneUser() {
        return "login";
    }
}
