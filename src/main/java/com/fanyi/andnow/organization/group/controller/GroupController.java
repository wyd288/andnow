package com.fanyi.andnow.organization.group.controller;

import com.fanyi.andnow.common.vo.organization.Group;
import com.fanyi.andnow.organization.group.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 集团控制器
 *
 * @author wangyds
 * @date 2019/6/25
 */
@RestController
public class GroupController {

    @Autowired
    private GroupService groupService;

    @GetMapping("/getAllGroup")
    public List<Group> getAllGroup(){
        return groupService.getAllGroup();
    }

    @GetMapping("/getGroup/{pkGroup}")
    public Group getGroupByPrimaryKey(@PathVariable Integer pkGroup){
        return groupService.getGroupByPrimaryKey(pkGroup);
    }


}
