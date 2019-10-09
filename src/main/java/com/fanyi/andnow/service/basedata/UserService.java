package com.fanyi.andnow.service.basedata;

import com.fanyi.andnow.entity.basedata.User;

import java.util.List;

/**
 * 用户服务层
 *
 * @author wangyds
 * @date 2019/6/17 9:13
 */
public interface UserService {

    /**
     * 获取所有用户
     * @param pkUser 用户主键
     * @return
     */
    User getUser(Integer pkUser);

    /**
     * 添加用户
     * @param user
     * @return int （大于0成功，小于0失败。）
     */
    int addUser(User user);

    /**
     * 获取用户数量
     * @return
     */
    int getUserCount();

    /**
     * 保存用户
     * @param user  用户
     * @return
     */
    int saveUser(User user);

    /**
     * 根据用户编码和密码获取登陆用户
     * @param code  用户编码
     * @param password  用户密码
     * @return  用户
     */
    User getLoginUser(String code,String password);

    /**
     * 获取所有用户信息
     * @return
     */
    List<User> getAllUser();
}
