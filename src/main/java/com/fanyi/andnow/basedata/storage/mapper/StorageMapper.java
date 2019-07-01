package com.fanyi.andnow.basedata.storage.mapper;

import com.fanyi.andnow.common.vo.basedata.Storage;
import com.fanyi.andnow.basedata.storage.service.StorageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StorageMapper {
    int countByExample(StorageExample example);

    int deleteByExample(StorageExample example);

    int deleteByPrimaryKey(Integer pkStorage);

    int insert(Storage group);

    int insertSelective(Storage group);

    List<Storage> selectByExample(StorageExample example);

    Storage selectByPrimaryKey(Integer pkStorage);

    int updateByExampleSelective(@Param("group") Storage group, @Param("example") StorageExample example);

    int updateByExample(@Param("group") Storage group, @Param("example") StorageExample example);

    int updateByPrimaryKeySelective(Storage group);

    int updateByPrimaryKey(Storage group);
}