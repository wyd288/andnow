package com.fanyi.andnow.organization.org.mapper;

import com.fanyi.andnow.common.vo.organization.OrganizationVO;
import com.fanyi.andnow.organization.org.service.OrganizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationMapper {
    int countByExample(OrganizationExample example);

    int deleteByExample(OrganizationExample example);

    int deleteByPrimaryKey(Integer pkOrg);

    int insert(OrganizationVO record);

    int insertSelective(OrganizationVO record);

    List<OrganizationVO> selectByExample(OrganizationExample example);

    OrganizationVO selectByPrimaryKey(Integer pkOrg);

    int updateByExampleSelective(@Param("record") OrganizationVO record, @Param("example") OrganizationExample example);

    int updateByExample(@Param("record") OrganizationVO record, @Param("example") OrganizationExample example);

    int updateByPrimaryKeySelective(OrganizationVO record);

    int updateByPrimaryKey(OrganizationVO record);
}