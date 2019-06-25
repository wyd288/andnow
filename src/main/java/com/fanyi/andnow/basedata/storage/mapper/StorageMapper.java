package com.fanyi.andnow.basedata.storage.mapper;

import com.fanyi.andnow.common.vo.basedata.StorageVO;
import com.fanyi.andnow.basedata.storage.service.StorageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StorageMapper {
    int countByExample(StorageExample example);

    int deleteByExample(StorageExample example);

    int deleteByPrimaryKey(Integer pkStorage);

    int insert(StorageVO record);

    int insertSelective(StorageVO record);

    List<StorageVO> selectByExample(StorageExample example);

    StorageVO selectByPrimaryKey(Integer pkStorage);

    int updateByExampleSelective(@Param("record") StorageVO record, @Param("example") StorageExample example);

    int updateByExample(@Param("record") StorageVO record, @Param("example") StorageExample example);

    int updateByPrimaryKeySelective(StorageVO record);

    int updateByPrimaryKey(StorageVO record);
}