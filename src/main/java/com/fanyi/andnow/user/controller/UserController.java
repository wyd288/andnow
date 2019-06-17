package com.fanyi.andnow.user.controller;

import com.fanyi.andnow.common.vo.UserVO;
import com.fanyi.andnow.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * 用户控制层
 *
 * @author wangyds
 * @date 2019/6/17 8:58
 */
@RestController
@ResponseBody
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
        UserVO user = null;
        user = userService.getUser();
        return user;
    }




}
