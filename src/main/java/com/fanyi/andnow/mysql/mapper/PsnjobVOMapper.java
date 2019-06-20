package com.fanyi.andnow.mysql.mapper;

import com.fanyi.andnow.mysql.vo.PsnjobVO;
import com.fanyi.andnow.mysql.vo.PsnjobVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PsnjobVOMapper {
    int countByExample(PsnjobVOExample example);

    int deleteByExample(PsnjobVOExample example);

    int deleteByPrimaryKey(Integer pkPsnjob);

    int insert(PsnjobVO record);

    int insertSelective(PsnjobVO record);

    List<PsnjobVO> selectByExample(PsnjobVOExample example);

    PsnjobVO selectByPrimaryKey(Integer pkPsnjob);

    int updateByExampleSelective(@Param("record") PsnjobVO record, @Param("example") PsnjobVOExample example);

    int updateByExample(@Param("record") PsnjobVO record, @Param("example") PsnjobVOExample example);

    int updateByPrimaryKeySelective(PsnjobVO record);

    int updateByPrimaryKey(PsnjobVO record);
}