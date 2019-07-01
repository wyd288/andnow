package com.fanyi.andnow.basedata.usergroup.mapper;

import com.fanyi.andnow.common.vo.basedata.Usergroup;
import com.fanyi.andnow.basedata.usergroup.service.UsergroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsergroupMapper {
    int countByExample(UsergroupExample example);

    int deleteByExample(UsergroupExample example);

    int deleteByPrimaryKey(Integer pkUsergroup);

    int insert(Usergroup group);

    int insertSelective(Usergroup group);

    List<Usergroup> selectByExample(UsergroupExample example);

    Usergroup selectByPrimaryKey(Integer pkUsergroup);

    int updateByExampleSelective(@Param("group") Usergroup group, @Param("example") UsergroupExample example);

    int updateByExample(@Param("group") Usergroup group, @Param("example") UsergroupExample example);

    int updateByPrimaryKeySelective(Usergroup group);

    int updateByPrimaryKey(Usergroup group);
}