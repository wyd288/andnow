package com.fanyi.andnow.basedata.psnjob.mapper;

import com.fanyi.andnow.common.vo.basedata.PsnjobVO;
import com.fanyi.andnow.basedata.psnjob.service.PsnjobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PsnjobMapper {
    int countByExample(PsnjobExample example);

    int deleteByExample(PsnjobExample example);

    int deleteByPrimaryKey(Integer pkPsnjob);

    int insert(PsnjobVO record);

    int insertSelective(PsnjobVO record);

    List<PsnjobVO> selectByExample(PsnjobExample example);

    PsnjobVO selectByPrimaryKey(Integer pkPsnjob);

    int updateByExampleSelective(@Param("record") PsnjobVO record, @Param("example") PsnjobExample example);

    int updateByExample(@Param("record") PsnjobVO record, @Param("example") PsnjobExample example);

    int updateByPrimaryKeySelective(PsnjobVO record);

    int updateByPrimaryKey(PsnjobVO record);
}