package com.fanyi.andnow.controller.basedata;


import com.fanyi.andnow.service.basedata.UserService;
import com.fanyi.andnow.entity.basedata.User;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
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

    @Resource
    private UserService userService;

    /**
     * 根据主键获取用户信息
     * @param pkUser 用户主键
     * @return
     */
    @GetMapping(value="/{pkUser}")
    public User getUser(@PathVariable("pkUser") Integer pkUser){

        return userService.getUser(pkUser);
    }

    /**
     * 添加用户信息
     * @param user（用户）
     * @return int （大于0成功，小于0失败。）
     */
    @PostMapping("/add")
    public int addUser(@RequestBody User user){
        if(user == null){
            return -1;
        }
        return userService.addUser(user);
    }

    @GetMapping("/count")
    public int getUserCount(){
        return userService.getUserCount();
    }



    @GetMapping("/all")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

}
