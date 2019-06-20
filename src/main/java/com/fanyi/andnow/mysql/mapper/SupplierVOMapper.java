package com.fanyi.andnow.mysql.mapper;

import com.fanyi.andnow.mysql.vo.SupplierVO;
import com.fanyi.andnow.mysql.vo.SupplierVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierVOMapper {
    int countByExample(SupplierVOExample example);

    int deleteByExample(SupplierVOExample example);

    int deleteByPrimaryKey(Integer pkSupplier);

    int insert(SupplierVO record);

    int insertSelective(SupplierVO record);

    List<SupplierVO> selectByExample(SupplierVOExample example);

    SupplierVO selectByPrimaryKey(Integer pkSupplier);

    int updateByExampleSelective(@Param("record") SupplierVO record, @Param("example") SupplierVOExample example);

    int updateByExample(@Param("record") SupplierVO record, @Param("example") SupplierVOExample example);

    int updateByPrimaryKeySelective(SupplierVO record);

    int updateByPrimaryKey(SupplierVO record);
}