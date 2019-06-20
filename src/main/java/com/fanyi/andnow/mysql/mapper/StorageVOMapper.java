package com.fanyi.andnow.mysql.mapper;

import com.fanyi.andnow.mysql.vo.StorageVO;
import com.fanyi.andnow.mysql.vo.StorageVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StorageVOMapper {
    int countByExample(StorageVOExample example);

    int deleteByExample(StorageVOExample example);

    int deleteByPrimaryKey(Integer pkStorage);

    int insert(StorageVO record);

    int insertSelective(StorageVO record);

    List<StorageVO> selectByExample(StorageVOExample example);

    StorageVO selectByPrimaryKey(Integer pkStorage);

    int updateByExampleSelective(@Param("record") StorageVO record, @Param("example") StorageVOExample example);

    int updateByExample(@Param("record") StorageVO record, @Param("example") StorageVOExample example);

    int updateByPrimaryKeySelective(StorageVO record);

    int updateByPrimaryKey(StorageVO record);
}