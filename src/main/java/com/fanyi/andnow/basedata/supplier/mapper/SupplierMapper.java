package com.fanyi.andnow.basedata.supplier.mapper;

import com.fanyi.andnow.common.vo.basedata.SupplierVO;
import com.fanyi.andnow.basedata.supplier.service.SupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierMapper {
    int countByExample(SupplierExample example);

    int deleteByExample(SupplierExample example);

    int deleteByPrimaryKey(Integer pkSupplier);

    int insert(SupplierVO record);

    int insertSelective(SupplierVO record);

    List<SupplierVO> selectByExample(SupplierExample example);

    SupplierVO selectByPrimaryKey(Integer pkSupplier);

    int updateByExampleSelective(@Param("record") SupplierVO record, @Param("example") SupplierExample example);

    int updateByExample(@Param("record") SupplierVO record, @Param("example") SupplierExample example);

    int updateByPrimaryKeySelective(SupplierVO record);

    int updateByPrimaryKey(SupplierVO record);
}