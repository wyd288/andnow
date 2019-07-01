package com.fanyi.andnow.organization.department.service;

import com.fanyi.andnow.common.vo.organization.Department;
import com.fanyi.andnow.organization.department.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 此处文件添加描述
 *
 * @author wangyds
 * @date 2019/7/1
 */
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public boolean addDepartment(Department department) {
        int row = departmentMapper.insertDepartment(department);
        if(row > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean saveDepartment(Department department) {
        int row = departmentMapper.updateDepartmentByPrimaryKey(department);
        if(row > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean removeDepartmentByPrimaryKey(Integer pkDept) {
        int row = departmentMapper.deleteDepartmentByPrimaryKey(pkDept);
        if(row > 0){
            return true;
        }
        return false;
    }

    @Override
    public Department getDepartmentByPrimaryKey(Integer pkDept) {
        return departmentMapper.selectDepartmentByPrimaryKey(pkDept);
    }

    @Override
    public List<Department> getAllDepartment() {
        return departmentMapper.selectAllDepartment();
    }
}
