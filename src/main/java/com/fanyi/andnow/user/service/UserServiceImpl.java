package com.fanyi.andnow.user.service;

import com.fanyi.andnow.common.vo.UserVO;
import com.fanyi.andnow.user.mapper.UserMapper;
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
    public UserVO getUser() {

        return userMapper.selectByPrimaryKey(1);
    }
}
