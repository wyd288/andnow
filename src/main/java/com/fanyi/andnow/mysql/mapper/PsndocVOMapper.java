package com.fanyi.andnow.mysql.mapper;

import com.fanyi.andnow.mysql.vo.PsndocVO;
import com.fanyi.andnow.mysql.vo.PsndocVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PsndocVOMapper {
    int countByExample(PsndocVOExample example);

    int deleteByExample(PsndocVOExample example);

    int deleteByPrimaryKey(Integer pkPsndoc);

    int insert(PsndocVO record);

    int insertSelective(PsndocVO record);

    List<PsndocVO> selectByExample(PsndocVOExample example);

    PsndocVO selectByPrimaryKey(Integer pkPsndoc);

    int updateByExampleSelective(@Param("record") PsndocVO record, @Param("example") PsndocVOExample example);

    int updateByExample(@Param("record") PsndocVO record, @Param("example") PsndocVOExample example);

    int updateByPrimaryKeySelective(PsndocVO record);

    int updateByPrimaryKey(PsndocVO record);
}