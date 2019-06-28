package com.fanyi.andnow.basedata.user.service;

import com.fanyi.andnow.common.vo.basedata.User;

/**
 * 用户服务层
 *
 * @author wangyds
 * @date 2019/6/17 9:13
 */
public interface UserService {

    /**
     * 获取所有用户
     * @return
     */
    User getUser();

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

}
