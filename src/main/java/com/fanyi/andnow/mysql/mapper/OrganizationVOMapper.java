package com.fanyi.andnow.mysql.mapper;

import com.fanyi.andnow.mysql.vo.OrganizationVO;
import com.fanyi.andnow.mysql.vo.OrganizationVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationVOMapper {
    int countByExample(OrganizationVOExample example);

    int deleteByExample(OrganizationVOExample example);

    int deleteByPrimaryKey(Integer pkOrg);

    int insert(OrganizationVO record);

    int insertSelective(OrganizationVO record);

    List<OrganizationVO> selectByExample(OrganizationVOExample example);

    OrganizationVO selectByPrimaryKey(Integer pkOrg);

    int updateByExampleSelective(@Param("record") OrganizationVO record, @Param("example") OrganizationVOExample example);

    int updateByExample(@Param("record") OrganizationVO record, @Param("example") OrganizationVOExample example);

    int updateByPrimaryKeySelective(OrganizationVO record);

    int updateByPrimaryKey(OrganizationVO record);
}