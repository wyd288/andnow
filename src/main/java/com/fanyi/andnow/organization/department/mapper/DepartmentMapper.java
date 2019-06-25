package com.fanyi.andnow.organization.department.mapper;

import com.fanyi.andnow.common.vo.organization.DepartmentVO;
import com.fanyi.andnow.organization.department.service.DepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentMapper {
    int countByExample(DepartmentExample example);

    int deleteByExample(DepartmentExample example);

    int deleteByPrimaryKey(Integer pkDept);

    int insert(DepartmentVO record);

    int insertSelective(DepartmentVO record);

    List<DepartmentVO> selectByExample(DepartmentExample example);

    DepartmentVO selectByPrimaryKey(Integer pkDept);

    int updateByExampleSelective(@Param("record") DepartmentVO record, @Param("example") DepartmentExample example);

    int updateByExample(@Param("record") DepartmentVO record, @Param("example") DepartmentExample example);

    int updateByPrimaryKeySelective(DepartmentVO record);

    int updateByPrimaryKey(DepartmentVO record);
}