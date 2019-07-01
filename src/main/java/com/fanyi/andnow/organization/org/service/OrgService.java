package com.fanyi.andnow.organization.org.service;



import com.fanyi.andnow.common.vo.organization.Organization;

import java.util.List;

/**
 * 组织服务层接口
 *
 * @author wangyds
 * @date 2019/7/1
 */
public interface OrgService {

    /**
     * 添加组织信息
     * @param org 组织信息
     * @return 成功返回true，失败返回false
     */
    boolean addOrg(Organization org);

    /**
     * 修改/保存组织信息
     * @param org 组织信息
     * @return 成功返回true， 失败返回false
     */
    boolean saveOrg(Organization org);

    /**
     * 逻辑删除组织信息
     * @param pkOrg 组织信息主键
     * @return 成功返回true， 失败返回false
     */
    boolean removeOrgByPrimaryKey(Integer pkOrg);

    /**
     * 根据主键查询组织信息
     * @param pkOrg 组织信息主键
     * @return 组织信息
     */
    Organization getOrgByPrimaryKey(Integer pkOrg);

    /**
     * 查询所有组织信息
     * @return 组织信息集合
     */
    List<Organization> getAllOrg();



}
