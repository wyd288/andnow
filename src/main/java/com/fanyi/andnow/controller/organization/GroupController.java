package com.fanyi.andnow.controller.organization;

import com.fanyi.andnow.entity.organization.Group;
import com.fanyi.andnow.service.organization.GroupService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 集团控制器
 *
 * @author wangyds
 * @date 2019/6/25
 */
@RestController
public class GroupController {

    @Resource
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
