package com.fanyi.andnow.basedata.usergroup.mapper;

import com.fanyi.andnow.common.vo.basedata.UserGroup;
import com.fanyi.andnow.basedata.usergroup.service.UsergroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsergroupMapper {
    int countByExample(UsergroupExample example);

    int deleteByExample(UsergroupExample example);

    int deleteByPrimaryKey(Integer pkUsergroup);

    int insert(UserGroup group);

    int insertSelective(UserGroup group);

    List<UserGroup> selectByExample(UsergroupExample example);

    UserGroup selectByPrimaryKey(Integer pkUsergroup);

    int updateByExampleSelective(@Param("group") UserGroup group, @Param("example") UsergroupExample example);

    int updateByExample(@Param("group") UserGroup group, @Param("example") UsergroupExample example);

    int updateByPrimaryKeySelective(UserGroup group);

    int updateByPrimaryKey(UserGroup group);
}