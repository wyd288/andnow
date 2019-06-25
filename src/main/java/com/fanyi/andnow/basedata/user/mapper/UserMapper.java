package com.fanyi.andnow.basedata.user.mapper;

import com.fanyi.andnow.common.vo.basedata.UserVO;
import com.fanyi.andnow.basedata.user.service.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

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