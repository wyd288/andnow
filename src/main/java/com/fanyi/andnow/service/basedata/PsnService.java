package com.fanyi.andnow.service.basedata;

import com.fanyi.andnow.entity.basedata.Psnjob;

import java.util.List;

public interface PsnService {

    /**
     * 查询所有工作信息
     * @return List（所有工作信息）
     */
    List<Psnjob> getPsnjobList();

    /**
     * 查询单个工作信息
     * @param pk
     * @return Psnjob
     */
    Psnjob getPsnjobOne(Integer pk);

    /**
     * 添加工作信息
     * @param psnjob
     * @return int （大于0成功小于0失败）
     */
    int addPsnjob(Psnjob psnjob);

    /**
     * 更新工作信息
     * @param psnjob
     * @return int （大于0成功小于0失败）
     */
    int savePsnjob(Psnjob psnjob);

    /**
     * 查询工作信息数量
     * @return int（工作数量）
     */
    int getPsnjobCount();

    /**
     * 根据主键删除工作信息
     * @param pk
     * @return int （大于0成功小于0失败）
     */
    int removePsnjob(Integer pk);

    /**
     *
     * @return
     */
    int removePsnjob();

}
