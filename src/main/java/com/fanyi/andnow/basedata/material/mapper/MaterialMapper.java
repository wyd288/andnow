package com.fanyi.andnow.basedata.material.mapper;

import com.fanyi.andnow.common.vo.basedata.MaterialVO;
import com.fanyi.andnow.basedata.material.service.MaterialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialMapper {
    int countByExample(MaterialExample example);

    int deleteByExample(MaterialExample example);

    int deleteByPrimaryKey(Integer pkMaterial);

    int insert(MaterialVO record);

    int insertSelective(MaterialVO record);

    List<MaterialVO> selectByExample(MaterialExample example);

    MaterialVO selectByPrimaryKey(Integer pkMaterial);

    int updateByExampleSelective(@Param("record") MaterialVO record, @Param("example") MaterialExample example);

    int updateByExample(@Param("record") MaterialVO record, @Param("example") MaterialExample example);

    int updateByPrimaryKeySelective(MaterialVO record);

    int updateByPrimaryKey(MaterialVO record);
}