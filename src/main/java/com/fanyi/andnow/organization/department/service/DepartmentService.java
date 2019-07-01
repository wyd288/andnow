package com.fanyi.andnow.organization.department.service;

import com.fanyi.andnow.common.vo.organization.Department;

import java.util.List;

/**
 * 此处文件添加描述
 *
 * @author wangyds
 * @date 2019/7/1
 */
public interface DepartmentService {
    /**
     * 添加集团信息
     * @param department 集团信息
     * @return 成功返回true，失败返回false
     */
    boolean addDepartment(Department department);

    /**
     * 修改/保存集团信息
     * @param department 集团信息
     * @return 成功返回true， 失败返回false
     */
    boolean saveDepartment(Department department);

    /**
     * 逻辑删除集团信息
     * @param pkDept 集团信息主键
     * @return 成功返回true， 失败返回false
     */
    boolean removeDepartmentByPrimaryKey(Integer pkDept);

    /**
     * 根据主键查询集团信息
     * @param pkDept 集团信息主键
     * @return 集团信息
     */
    Department getDepartmentByPrimaryKey(Integer pkDept);

    /**
     * 查询所有集团信息
     * @return 集团信息集合
     */
    List<Department> getAllDepartment();
}
