package com.fanyi.andnow.service.organization;

import com.fanyi.andnow.entity.organization.Group;
import com.fanyi.andnow.dao.organization.GroupMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 集团服务层
 *
 * @author wangyds
 * @date 2019/7/1
 */
@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupMapper groupMapper;

    @Override
    public boolean addGroup(Group group) {
        int row = groupMapper.insertGroup(group);
        if(row > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean saveGroup(Group group) {
        int row = groupMapper.updateGroupByPrimaryKey(group);
        if(row > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean removeGroupByPrimaryKey(Integer pkGroup) {
        int row = groupMapper.deleteGroupByPrimaryKey(pkGroup);
        if(row > 0){
            return true;
        }
        return false;
    }

    @Override
    public Group getGroupByPrimaryKey(Integer pkGroup) {
        return groupMapper.selectGroupByPrimaryKey(pkGroup);
    }

    @Override
    public List<Group> getAllGroup() {
        return groupMapper.selectAllGroup();
    }
}
