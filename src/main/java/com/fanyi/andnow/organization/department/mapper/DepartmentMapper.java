package com.fanyi.andnow.organization.department.mapper;

import com.fanyi.andnow.common.vo.organization.Department;
import com.fanyi.andnow.organization.department.service.DepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentMapper {
    int countByExample(DepartmentExample example);

    int deleteByExample(DepartmentExample example);

    int deleteByPrimaryKey(Integer pkDept);

    int insert(Department group);

    int insertSelective(Department group);

    List<Department> selectByExample(DepartmentExample example);

    Department selectByPrimaryKey(Integer pkDept);

    int updateByExampleSelective(@Param("group") Department group, @Param("example") DepartmentExample example);

    int updateByExample(@Param("group") Department group, @Param("example") DepartmentExample example);

    int updateByPrimaryKeySelective(Department group);

    int updateByPrimaryKey(Department group);
}