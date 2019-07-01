package com.fanyi.andnow.organization.org.service;

import com.fanyi.andnow.common.vo.organization.Organization;
import com.fanyi.andnow.organization.org.mapper.OrganizationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 组织服务层实现类
 *
 * @author wangyds
 * @date 2019/7/1
 */
@Service
public class OrgServiceImpl implements OrgService {

    @Autowired
    private OrganizationMapper organizationMapper;

    @Override
    public boolean addGroup(Organization org) {
        int row = organizationMapper.insertOrg(org);
        if(row > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean saveGroup(Organization org) {
        int row = organizationMapper.updateOrgByPrimaryKey(org);
        if(row > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean removeGroup(Integer pkOrg) {
        int row = organizationMapper.deleteOrgByPrimaryKey(pkOrg);
        if(row > 0){
            return true;
        }
        return false;
    }

    @Override
    public Organization getGroupByPrimaryKey(Integer pkOrg) {
        return organizationMapper.selectOrgByPrimaryKey(pkOrg);
    }

    @Override
    public List<Organization> getAllGroup() {
        return organizationMapper.selectAllOrg();
    }
}
