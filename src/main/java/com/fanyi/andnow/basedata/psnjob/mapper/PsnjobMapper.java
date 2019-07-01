package com.fanyi.andnow.basedata.psnjob.mapper;

import com.fanyi.andnow.common.vo.basedata.Psnjob;
import com.fanyi.andnow.basedata.psnjob.service.PsnjobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PsnjobMapper {
    int countByExample(PsnjobExample example);

    int deleteByExample(PsnjobExample example);

    int deleteByPrimaryKey(Integer pkPsnjob);

    int insert(Psnjob group);

    int insertSelective(Psnjob group);

    List<Psnjob> selectByExample(PsnjobExample example);

    Psnjob selectByPrimaryKey(Integer pkPsnjob);

    int updateByExampleSelective(@Param("group") Psnjob group, @Param("example") PsnjobExample example);

    int updateByExample(@Param("group") Psnjob group, @Param("example") PsnjobExample example);

    int updateByPrimaryKeySelective(Psnjob group);

    int updateByPrimaryKey(Psnjob group);
}