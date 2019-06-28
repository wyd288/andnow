package com.fanyi.andnow.basedata.user.mapper;

import com.fanyi.andnow.common.vo.basedata.User;
import com.fanyi.andnow.basedata.user.service.UserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/**
 * 用户映射关系
 *
 * @author wangyds
 * @date 2019/6/25
 */
@Mapper
public interface UserMapper {
    /**
     * 根据主键删除用户
     * @param pkUser  用户主键
     * @return
     */
    int deleteUserByPrimaryKey(Integer pkUser);

    /**
     * 物理删除已逻辑删除的数据
     * @return
     */
    int clearDeletedData();

    /**
     * 新增用户
     * @param user  用户
     * @return
     */
    int insertUser(User user);

    /**
     * 根据主键选择用户
     * @param pkUser  用户主键
     * @return
     */
    User selectUserByPrimaryKey(Integer pkUser);

    /**
     * 根据主键更新用户
     * @param user 用户
     * @return
     */
    int updateUserByPrimaryKey(User user);

    /**
     * 查询用户数量
     * @return
     */
    int selectUserCount();


}