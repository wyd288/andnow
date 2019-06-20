package com.fanyi.andnow.mysql.mapper;

import com.fanyi.andnow.mysql.vo.GroupVO;
import com.fanyi.andnow.mysql.vo.GroupVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupVOMapper {
    int countByExample(GroupVOExample example);

    int deleteByExample(GroupVOExample example);

    int deleteByPrimaryKey(Integer pkGroup);

    int insert(GroupVO record);

    int insertSelective(GroupVO record);

    List<GroupVO> selectByExample(GroupVOExample example);

    GroupVO selectByPrimaryKey(Integer pkGroup);

    int updateByExampleSelective(@Param("record") GroupVO record, @Param("example") GroupVOExample example);

    int updateByExample(@Param("record") GroupVO record, @Param("example") GroupVOExample example);

    int updateByPrimaryKeySelective(GroupVO record);

    int updateByPrimaryKey(GroupVO record);
}