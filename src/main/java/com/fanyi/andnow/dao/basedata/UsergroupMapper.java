package com.fanyi.andnow.dao.basedata;

import com.fanyi.andnow.entity.basedata.UserGroup;

public interface UsergroupMapper {


    int deleteByPrimaryKey(Integer pkUsergroup);

    int insert(UserGroup group);

    int insertSelective(UserGroup group);



    UserGroup selectByPrimaryKey(Integer pkUsergroup);


    int updateByPrimaryKeySelective(UserGroup group);

    int updateByPrimaryKey(UserGroup group);
}