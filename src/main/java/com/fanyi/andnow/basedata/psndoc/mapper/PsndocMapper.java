package com.fanyi.andnow.basedata.psndoc.mapper;

import com.fanyi.andnow.common.vo.basedata.Psndoc;
import com.fanyi.andnow.basedata.psndoc.service.PsndocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PsndocMapper {
    int countByExample(PsndocExample example);

    int deleteByExample(PsndocExample example);

    int deleteByPrimaryKey(Integer pkPsndoc);

    int insert(Psndoc group);

    int insertSelective(Psndoc group);

    List<Psndoc> selectByExample(PsndocExample example);

    Psndoc selectByPrimaryKey(Integer pkPsndoc);

    int updateByExampleSelective(@Param("group") Psndoc group, @Param("example") PsndocExample example);

    int updateByExample(@Param("group") Psndoc group, @Param("example") PsndocExample example);

    int updateByPrimaryKeySelective(Psndoc group);

    int updateByPrimaryKey(Psndoc group);
}