package com.fanyi.andnow.user.service;

import com.fanyi.andnow.common.vo.UserVO;

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
    UserVO getUser();

}
