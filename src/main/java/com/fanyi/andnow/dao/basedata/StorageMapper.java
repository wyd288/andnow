package com.fanyi.andnow.dao.basedata;

import com.fanyi.andnow.entity.basedata.Storage;


public interface StorageMapper {

    int deleteByPrimaryKey(Integer pkStorage);

    int insert(Storage group);

    int insertSelective(Storage group);


    Storage selectByPrimaryKey(Integer pkStorage);


    int updateByPrimaryKeySelective(Storage group);

    int updateByPrimaryKey(Storage group);
}