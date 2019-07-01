package com.fanyi.andnow.organization.group.service;

import com.fanyi.andnow.common.vo.organization.Group;

import java.util.List;

/**
 * 此处文件添加描述
 *
 * @author wangyds
 * @date 2019/7/1
 */
public interface GroupService {
    /**
     * 添加集团信息
     * @param group 集团信息
     * @return 成功返回true，失败返回false
     */
    boolean addGroup(Group group);

    /**
     * 修改/保存集团信息
     * @param group 集团信息
     * @return 成功返回true， 失败返回false
     */
    boolean saveGroup(Group group);

    /**
     * 逻辑删除集团信息
     * @param pkGroup 集团信息主键
     * @return 成功返回true， 失败返回false
     */
    boolean removeGroup(Integer pkGroup);

    /**
     * 根据主键查询集团信息
     * @param pkGroup 集团信息主键
     * @return 集团信息
     */
    Group getGroupByPrimaryKey(Integer pkGroup);

    /**
     * 查询所有集团信息
     * @return 集团信息集合
     */
    List<Group> getAllGroup();

}
