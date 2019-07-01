package com.fanyi.andnow.organization.org.controller;

import com.fanyi.andnow.common.vo.organization.Organization;
import com.fanyi.andnow.organization.org.service.OrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 组织控制器
 *
 * @author wangyds
 * @date 2019/6/25
 */
@RestController
public class OrgController {

    @Autowired
    private OrgService orgService;

    @GetMapping("/getOrg/{pkOrg}")
    public Organization getOrgByPrimaryKey(@PathVariable Integer pkOrg){
        return orgService.getOrgByPrimaryKey(pkOrg);
    }

    @GetMapping("/getAllOrg")
    public List<Organization> getAllOrg(){
        return orgService.getAllOrg();
    }





}
