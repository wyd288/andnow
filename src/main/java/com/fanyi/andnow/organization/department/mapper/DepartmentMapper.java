package com.fanyi.andnow.organization.department.mapper;

import com.fanyi.andnow.common.vo.organization.Department;
import com.fanyi.andnow.organization.department.service.DepartmentExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
/**
 * 部门数据映射层
 *
 * @author wangyds
 * @date 2019/7/1
 */
@Mapper
public interface DepartmentMapper {
    /**
     * 新增部门信息
     * @param department 部门信息
     * @return 返回影响行数
     */
    int insertDepartment(Department department);

    /**
     * 逻辑删除部门信息
     * @param pkDept 部门主键
     * @return 返回影响行数
     */
    int deleteDepartmentByPrimaryKey(Integer pkDept);

    /**
     * 查询部门信息
     * @param pkDept 部门主键
     * @return 返回查找到的部门信息
     */
    Department selectDepartmentByPrimaryKey(Integer pkDept);

    /**
     * 根据主键更新部门信息，更新不为null的项
     * @param department 部门信息
     * @return 返回影响行数
     */
    int updateDepartmentByPrimaryKey(Department department);

    /**
     * 查询所有未逻辑删除的部门信息
     * @return
     */
    List<Department> selectAllDepartment();
    
}