package com.fanyi.andnow.dao.basedata;

import com.fanyi.andnow.entity.basedata.Psnjob;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PsnjobMapper {

    /**
     * 查询所有工作信息
     * @return List（工作信息）
     */
    List<Psnjob> selectPsnjobList();

    /**
     * 查询单个工作信息
     * @param pk
     * @return Psnjob
     */
    Psnjob selectPsnjobOne(Integer pk);

    /**
     * 添加工作信息
     * @param psnjob
     * @return 大于0成功小于0失败
     */
    int insertPsnjob(Psnjob psnjob);

    /**
     * 更新工作信息
     * @param psnjob
     * @return 大于0成功小于0失败
     */
    int updatePsnjob(Psnjob psnjob);

    /**
     * 查询工作数量
     * @return int（数量）
     */
    int selectPsnjobCount();

    /**
     * 根据主键删除工作信息
     * @param pk
     * @return 大于0成功小于0失败
     */
    int deletePsnjobBypk(Integer pk);

    /**
     * 物理删除工作信息
     * @return 大于0成功小于0失败
     */
    int deletePsnjob();

}