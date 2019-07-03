package com.fanyi.andnow.basedata.psnjob.mapper;

import com.fanyi.andnow.common.vo.basedata.Psnjob;
import com.fanyi.andnow.basedata.psnjob.service.PsnjobExample;
import java.util.List;

import com.sun.imageio.plugins.common.I18NImpl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
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