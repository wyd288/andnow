package com.fanyi.andnow.basedata.psndoc.mapper;

import com.fanyi.andnow.common.vo.basedata.PsndocVO;
import com.fanyi.andnow.basedata.psndoc.service.PsndocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PsndocMapper {
    int countByExample(PsndocExample example);

    int deleteByExample(PsndocExample example);

    int deleteByPrimaryKey(Integer pkPsndoc);

    int insert(PsndocVO record);

    int insertSelective(PsndocVO record);

    List<PsndocVO> selectByExample(PsndocExample example);

    PsndocVO selectByPrimaryKey(Integer pkPsndoc);

    int updateByExampleSelective(@Param("record") PsndocVO record, @Param("example") PsndocExample example);

    int updateByExample(@Param("record") PsndocVO record, @Param("example") PsndocExample example);

    int updateByPrimaryKeySelective(PsndocVO record);

    int updateByPrimaryKey(PsndocVO record);
}