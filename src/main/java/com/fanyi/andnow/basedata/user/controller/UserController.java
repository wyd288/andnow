package com.fanyi.andnow.basedata.user.controller;


import com.fanyi.andnow.basedata.user.service.UserService;
import com.fanyi.andnow.common.vo.basedata.UserVO;
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
    @RequestMapping(value="getUser",method= RequestMethod.GET)
    public UserVO getUsers(HttpServletResponse res){
        UserVO user ;
        user = userService.getUser();
        return user;
    }

    /**
     * 添加用户
     * @param userVO（用户）
     * @return int （大于0成功，小于0失败。）
     */
    @PostMapping("/insertUser")
    public int insertUserVo(@RequestBody UserVO userVO){
        return userService.insertUser(userVO);
    }



}
