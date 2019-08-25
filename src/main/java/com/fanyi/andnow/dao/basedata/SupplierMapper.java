package com.fanyi.andnow.dao.basedata;

import com.fanyi.andnow.entity.basedata.Supplier;

public interface SupplierMapper {


    int deleteByPrimaryKey(Integer pkSupplier);

    int insert(Supplier group);

    int insertSelective(Supplier group);



    Supplier selectByPrimaryKey(Integer pkSupplier);

    int updateByPrimaryKeySelective(Supplier group);

    int updateByPrimaryKey(Supplier group);
}