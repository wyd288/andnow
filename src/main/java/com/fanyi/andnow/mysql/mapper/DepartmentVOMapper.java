package com.fanyi.andnow.mysql.mapper;

import com.fanyi.andnow.mysql.vo.DepartmentVO;
import com.fanyi.andnow.mysql.vo.DepartmentVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentVOMapper {
    int countByExample(DepartmentVOExample example);

    int deleteByExample(DepartmentVOExample example);

    int deleteByPrimaryKey(Integer pkDept);

    int insert(DepartmentVO record);

    int insertSelective(DepartmentVO record);

    List<DepartmentVO> selectByExample(DepartmentVOExample example);

    DepartmentVO selectByPrimaryKey(Integer pkDept);

    int updateByExampleSelective(@Param("record") DepartmentVO record, @Param("example") DepartmentVOExample example);

    int updateByExample(@Param("record") DepartmentVO record, @Param("example") DepartmentVOExample example);

    int updateByPrimaryKeySelective(DepartmentVO record);

    int updateByPrimaryKey(DepartmentVO record);
}