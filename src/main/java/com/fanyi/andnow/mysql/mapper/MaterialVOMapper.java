package com.fanyi.andnow.mysql.mapper;

import com.fanyi.andnow.mysql.vo.MaterialVO;
import com.fanyi.andnow.mysql.vo.MaterialVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialVOMapper {
    int countByExample(MaterialVOExample example);

    int deleteByExample(MaterialVOExample example);

    int deleteByPrimaryKey(Integer pkMaterial);

    int insert(MaterialVO record);

    int insertSelective(MaterialVO record);

    List<MaterialVO> selectByExample(MaterialVOExample example);

    MaterialVO selectByPrimaryKey(Integer pkMaterial);

    int updateByExampleSelective(@Param("record") MaterialVO record, @Param("example") MaterialVOExample example);

    int updateByExample(@Param("record") MaterialVO record, @Param("example") MaterialVOExample example);

    int updateByPrimaryKeySelective(MaterialVO record);

    int updateByPrimaryKey(MaterialVO record);
}