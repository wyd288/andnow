package com.fanyi.andnow.basedata.user.controller;


import com.fanyi.andnow.basedata.user.service.UserService;
import com.fanyi.andnow.common.vo.basedata.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 用户控制层
 *
 * @author wangyds
 * @date 2019/6/17 8:58
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 前端获取数据测试接口
     * @param res
     * @return
     */
    @GetMapping(value="/get")
    public User getUsers(){
        return userService.getUser();
    }

    /**
     * 添加用户信息
     * @param user（用户）
     * @return int （大于0成功，小于0失败。）
     */
    @PostMapping("/add")
    public int addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/count")
    public int getUserCount(){
        return userService.getUserCount();
    }

    @GetMapping("/login")
    public User getLoginUser(@Param("code") String code,@Param("password") String password){
        return userService.getLoginUser(code,password);
    }

    @GetMapping("/all")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

}
