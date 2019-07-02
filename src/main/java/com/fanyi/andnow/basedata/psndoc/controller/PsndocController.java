package com.fanyi.andnow.basedata.psndoc.controller;

import com.fanyi.andnow.basedata.psndoc.service.PsndocService;
import com.fanyi.andnow.common.vo.basedata.Psndoc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 人员基本信息控制器
 *
 * @author wangyds
 * @date 2019/6/25
 */
@RestController
public class PsndocController {

    @Autowired
    private PsndocService psndocService;

    /**
     * 查询所有人员信息
     * @return List（所有人员信息）
     */
    @PostMapping("/getPsndocList")
    public List<Psndoc> getPsndocList() {
        return psndocService.getPsndocList();
    }

    /**
     * 添加人员信息
     * @param psndoc
     * @return true or false
     */
    @PostMapping("/addPsndoc")
    public boolean addPsndoc(@RequestBody Psndoc psndoc) {
        if (psndocService.addPsndoc(psndoc) > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 更新人员信息
     * @param psndoc
     * @return true or false
     */
    @PostMapping("/savePsndoc")
    public boolean savePsndoc(@RequestBody Psndoc psndoc) {
        if (psndocService.savePsndoc(psndoc) > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 获取人员数量
     * @return int（人员数量）
     */
    @PostMapping("/getPsndocCount")
    public int getPsndocCount() {
        return psndocService.getPsndocCount();
    }

    /**
     * 获取单个人员信息
     * @param pk
     * @return Psndoc
     */
    @PostMapping("/getPsndocOne")
    public Psndoc getPsndocOne(Integer pk) {
        return psndocService.getPsndocOne(pk);
    }

    /**
     * 删除人员信息
     * @param pk
     * @return true or false
     */
    @PostMapping("/removePsndoc")
    public boolean removePsndoc(Integer pk) {
        if (psndocService.removePsndoc(pk) > 0) {
            return true;
        } else {
            return false;
        }
    }
}
