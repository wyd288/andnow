package com.fanyi.andnow.dao.basedata;

import com.fanyi.andnow.entity.basedata.User;

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
    int deleteUserByPk(Integer pkUser);

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
    User selectUserByPk(Integer pkUser);

    /**
     * 根据主键更新用户
     * @param user 用户
     * @return
     */
    int updateUserByPk(User user);

    /**
     * 查询用户数量
     * @return
     */
    int selectUserCount();

    /**
     * 根据用户编码和密码获取登陆用户
     * @param code  用户编码
     * @param password  用户密码
     * @return  用户
     */
    User selectLoginUser(String code,String password);

    /**
     *
     * @return
     */
    List<User> selectAllUser();

}