package com.fanyi.andnow.dao.organization;

import com.fanyi.andnow.entity.organization.Group;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/**
 * 集团信息数据层
 *
 * @author wangyds
 * @date 2019/7/1
 */
@Mapper
public interface GroupMapper {
    /**
     * 新增集团信息
     * @param group 集团信息
     * @return 返回影响行数
     */
    int insertGroup(Group group);

    /**
     * 逻辑删除集团信息
     * @param pkGroup 集团主键
     * @return 返回影响行数
     */
    int deleteGroupByPrimaryKey(Integer pkGroup);

    /**
     * 查询集团信息
     * @param pkGroup 集团主键
     * @return 返回查找到的集团信息
     */
    Group selectGroupByPrimaryKey(Integer pkGroup);

    /**
     * 根据主键更新集团信息，更新不为null的项
     * @param group 集团信息
     * @return 返回影响行数
     */
    int updateGroupByPrimaryKey(Group group);

    /**
     * 查询所有未逻辑删除的集团信息
     * @return
     */
    List<Group> selectAllGroup();

}