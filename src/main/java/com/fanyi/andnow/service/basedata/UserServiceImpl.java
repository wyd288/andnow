package com.fanyi.andnow.service.basedata;

import com.fanyi.andnow.dao.basedata.UserMapper;
import com.fanyi.andnow.entity.basedata.User;
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
        if(pkUser == null || pkUser < 0){
            return null;
        }
        return userMapper.selectUserByPk(pkUser);
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
        if(code.isEmpty() || password.isEmpty()){
            return null;
        }
        User loginUser = userMapper.selectLoginUser(code,password);
        return loginUser;
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.selectAllUser();
    }


}
