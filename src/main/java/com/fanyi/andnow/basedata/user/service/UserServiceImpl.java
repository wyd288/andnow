package com.fanyi.andnow.basedata.user.service;

import com.fanyi.andnow.basedata.user.mapper.UserMapper;
import com.fanyi.andnow.common.vo.basedata.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


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
    public User getUser(Integer pkUser) {

        return userMapper.selectUserByPrimaryKey(pkUser);
    }

    @Override
    public int addUser(User user) {
        User userTemp = user;
        userTemp.setPkGroup(1);
        userTemp.setPkOrg(1);
        userTemp.setName("测试名称");
        userTemp.setCreator(1);
        userTemp.setCreationtime(new Date());
        userTemp.setTs(new Date());
        return userMapper.insertUser(user);
    }

    @Override
    public int getUserCount() {
        return userMapper.selectUserCount();
    }

    @Override
    public int saveUser(User user) {
        return 0;
    }

    @Override
    public User getLoginUser(String code, String password) {
        return userMapper.selectLoginUser(code,password);
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.selectAllUser();
    }


}
