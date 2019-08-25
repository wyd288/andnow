package com.fanyi.andnow.controller.organization;

import com.fanyi.andnow.entity.organization.Department;
import com.fanyi.andnow.service.organization.DepartmentService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 部门控制器
 *
 * @author wangyds
 * @date 2019/6/25
 */
@RestController
public class DepartmentController {

    @Resource
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
