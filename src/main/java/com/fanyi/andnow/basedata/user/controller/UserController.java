package com.fanyi.andnow.basedata.user.controller;


import com.fanyi.andnow.basedata.user.service.UserService;
import com.fanyi.andnow.common.vo.basedata.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * 用户控制层
 *
 * @author wangyds
 * @date 2019/6/17 8:58
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 前端获取数据测试接口
     * @param res
     * @return
     */
    @GetMapping(value="/getUser")
    public User getUsers(HttpServletResponse res){
        User user ;
        user = userService.getUser();
        return user;
    }

    /**
     * 添加用户
     * @param user（用户）
     * @return int （大于0成功，小于0失败。）
     */
    @PostMapping("/addUser")
    public int addUserVo(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/getUserCount")
    public int getUserCount(){
        return userService.getUserCount();
    }


}
