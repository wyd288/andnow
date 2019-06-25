package com.fanyi.andnow.basedata.usergroup.mapper;

import com.fanyi.andnow.common.vo.basedata.UsergroupVO;
import com.fanyi.andnow.basedata.usergroup.service.UsergroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsergroupMapper {
    int countByExample(UsergroupExample example);

    int deleteByExample(UsergroupExample example);

    int deleteByPrimaryKey(Integer pkUsergroup);

    int insert(UsergroupVO record);

    int insertSelective(UsergroupVO record);

    List<UsergroupVO> selectByExample(UsergroupExample example);

    UsergroupVO selectByPrimaryKey(Integer pkUsergroup);

    int updateByExampleSelective(@Param("record") UsergroupVO record, @Param("example") UsergroupExample example);

    int updateByExample(@Param("record") UsergroupVO record, @Param("example") UsergroupExample example);

    int updateByPrimaryKeySelective(UsergroupVO record);

    int updateByPrimaryKey(UsergroupVO record);
}