package com.fanyi.andnow.controller.common;

import com.fanyi.andnow.service.basedata.UserService;
import com.fanyi.andnow.entity.basedata.User;
import org.apache.ibatis.annotations.Param;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 登陆页面控制类
 *
 * @author andnow
 * @date 2019/7/10
 */
@RestController
public class LoginController {

    @Resource
    private UserService userService;

    /**
     * 获取登陆用户信息
     * @param code  用户编码
     * @param password  用户编码
     * @return  返回用户主键
     */
    @GetMapping("/login")
    public Integer doLogin(@Param("code") String code, @Param("password") String password){
        User user = userService.getLoginUser(code,password);
        if(user != null){
            return user.getPkUser();
        }
        return -1;
    }
}
