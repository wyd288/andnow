package com.fanyi.andnow.user.mapper;

import com.fanyi.andnow.common.vo.UserVO;
import com.fanyi.andnow.user.service.UserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 用户数据层
 *
 * @author wangyds
 * @date 2019/6/17 9:18
 */
@Mapper
public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer pkUser);

    int insert(UserVO record);

    int insertSelective(UserVO record);

    List<UserVO> selectByExample(UserExample example);

    UserVO selectByPrimaryKey(Integer pkUser);

    int updateByExampleSelective(@Param("record") UserVO record, @Param("example") UserExample example);

    int updateByExample(@Param("record") UserVO record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(UserVO record);

    int updateByPrimaryKey(UserVO record);
}