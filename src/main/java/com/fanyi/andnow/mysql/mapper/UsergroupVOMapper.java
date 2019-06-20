package com.fanyi.andnow.mysql.mapper;

import com.fanyi.andnow.mysql.vo.UsergroupVO;
import com.fanyi.andnow.mysql.vo.UsergroupVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsergroupVOMapper {
    int countByExample(UsergroupVOExample example);

    int deleteByExample(UsergroupVOExample example);

    int deleteByPrimaryKey(Integer pkUsergroup);

    int insert(UsergroupVO record);

    int insertSelective(UsergroupVO record);

    List<UsergroupVO> selectByExample(UsergroupVOExample example);

    UsergroupVO selectByPrimaryKey(Integer pkUsergroup);

    int updateByExampleSelective(@Param("record") UsergroupVO record, @Param("example") UsergroupVOExample example);

    int updateByExample(@Param("record") UsergroupVO record, @Param("example") UsergroupVOExample example);

    int updateByPrimaryKeySelective(UsergroupVO record);

    int updateByPrimaryKey(UsergroupVO record);
}