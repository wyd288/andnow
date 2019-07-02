package com.fanyi.andnow.basedata.psndoc.service;

import com.fanyi.andnow.common.vo.basedata.Psndoc;

import java.util.List;

public interface PsndocService {

    /**
     * 查询所有人员信息
     * @return List（所有人员信息）
     */
    List<Psndoc> getPsndocList();

    /**
     * 添加人员信息
     * @param psndoc
     * @return int（大于0成功小于0失败）
     */
    int addPsndoc(Psndoc psndoc);

    /**
     * 更新人员信息
     * @param psndoc
     * @return int（大于0成功小于0失败）
     */
    int savePsndoc(Psndoc psndoc);

    /**
     * 根据主键查询
     * @param pk
     * @return Psndoc
     */
    Psndoc getPsndocOne(Integer pk);

    /**
     * 根据主键删除人员信息
     * @param pk
     * @return int（大于0成功小于0失败）
     */
    int removePsndoc(Integer pk);

    /**
     *  获取人员数量
     * @return int（人员数量）
     */
    int getPsndocCount();
}
