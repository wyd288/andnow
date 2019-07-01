package com.fanyi.andnow.organization.org.mapper;

import com.fanyi.andnow.common.vo.organization.Organization;
import com.fanyi.andnow.organization.org.service.OrganizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationMapper {
    int countByExample(OrganizationExample example);

    int deleteByExample(OrganizationExample example);

    int deleteByPrimaryKey(Integer pkOrg);

    int insert(Organization group);

    int insertSelective(Organization group);

    List<Organization> selectByExample(OrganizationExample example);

    Organization selectByPrimaryKey(Integer pkOrg);

    int updateByExampleSelective(@Param("group") Organization group, @Param("example") OrganizationExample example);

    int updateByExample(@Param("group") Organization group, @Param("example") OrganizationExample example);

    int updateByPrimaryKeySelective(Organization group);

    int updateByPrimaryKey(Organization group);
}