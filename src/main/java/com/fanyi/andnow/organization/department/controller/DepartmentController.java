package com.fanyi.andnow.organization.department.controller;

import com.fanyi.andnow.common.vo.organization.Department;
import com.fanyi.andnow.organization.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 部门控制器
 *
 * @author wangyds
 * @date 2019/6/25
 */
@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/getDept/{pkDept}")
    public Department getDepartmentByPrimaryKey(@PathVariable Integer pkDept){
        return departmentService.getDepartmentByPrimaryKey(pkDept);
    }

    @GetMapping("/getAllDepartment")
    public List<Department> getAllDepartment(){
        return departmentService.getAllDepartment();
    }



}
