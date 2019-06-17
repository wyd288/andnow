package com.fanyi.andnow.supplier.mapper;

import com.fanyi.andnow.common.vo.SupplierVO;
import com.fanyi.andnow.supplier.service.SupplierExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
/**
 * 供应商数据层
 *
 * @author wangyds
 * @date 2019/6/17 9:58
 */
@Mapper
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