package com.fanyi.andnow.organization.group.mapper;

import com.fanyi.andnow.common.vo.organization.GroupVO;
import com.fanyi.andnow.organization.group.service.GroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupMapper {
    int countByExample(GroupExample example);

    int deleteByExample(GroupExample example);

    int deleteByPrimaryKey(Integer pkGroup);

    int insert(GroupVO record);

    int insertSelective(GroupVO record);

    List<GroupVO> selectByExample(GroupExample example);

    GroupVO selectByPrimaryKey(Integer pkGroup);

    int updateByExampleSelective(@Param("record") GroupVO record, @Param("example") GroupExample example);

    int updateByExample(@Param("record") GroupVO record, @Param("example") GroupExample example);

    int updateByPrimaryKeySelective(GroupVO record);

    int updateByPrimaryKey(GroupVO record);
}