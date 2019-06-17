package com.fanyi.andnow.storage.mapper;

import com.fanyi.andnow.common.vo.StorageVO;
import com.fanyi.andnow.storage.service.StorageExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
/**
 * 仓库数据层
 *
 * @author wangyds
 * @date 2019/6/17 9:58
 */
@Mapper
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