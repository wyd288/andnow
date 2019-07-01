package com.fanyi.andnow.basedata.supplier.mapper;

import com.fanyi.andnow.common.vo.basedata.Supplier;
import com.fanyi.andnow.basedata.supplier.service.SupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierMapper {
    int countByExample(SupplierExample example);

    int deleteByExample(SupplierExample example);

    int deleteByPrimaryKey(Integer pkSupplier);

    int insert(Supplier group);

    int insertSelective(Supplier group);

    List<Supplier> selectByExample(SupplierExample example);

    Supplier selectByPrimaryKey(Integer pkSupplier);

    int updateByExampleSelective(@Param("group") Supplier group, @Param("example") SupplierExample example);

    int updateByExample(@Param("group") Supplier group, @Param("example") SupplierExample example);

    int updateByPrimaryKeySelective(Supplier group);

    int updateByPrimaryKey(Supplier group);
}