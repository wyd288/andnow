package com.fanyi.andnow.basedata.user.service;

import com.fanyi.andnow.basedata.user.mapper.UserMapper;
import com.fanyi.andnow.common.vo.basedata.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 此处文件添加描述
 *
 * @author wangyds
 * @date 2019/6/17 9:15
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser() {

        return userMapper.selectUserByPrimaryKey(1);
    }

    @Override
    public int addUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public int getUserCount() {
        return userMapper.selectUserCount();
    }



}
