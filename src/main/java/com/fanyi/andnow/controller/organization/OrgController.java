package com.fanyi.andnow.controller.organization;

import com.fanyi.andnow.entity.organization.Organization;
import com.fanyi.andnow.service.organization.OrgService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 组织控制器
 *
 * @author wangyds
 * @date 2019/6/25
 */
@RestController
public class OrgController {

    @Resource
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
