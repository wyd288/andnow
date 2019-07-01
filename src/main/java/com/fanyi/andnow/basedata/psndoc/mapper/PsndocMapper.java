package com.fanyi.andnow.basedata.psndoc.mapper;

import com.fanyi.andnow.common.vo.basedata.Psndoc;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface PsndocMapper {

    /**
     * 添加人员信息
     * @param psndoc
     * @return int（大于0成功小于0失败）
     */
    int insertPsndc(Psndoc psndoc);

    /**
     * 查询所有人员信息
     * @return List (所有人员信息)
     */
    List<Psndoc> selectPsndocList();

    /**
     * 根据主键查询个人信息
     * @param pk
     * @return Psndoc
     */
    Psndoc selectByPrimaryKey(Integer pk);

    /**
     * 更新人员信息
     * @param psndoc
     * @return int（大于0成功小于0失败）
     */
    int updateByPsndoc(Psndoc psndoc);

    /**
     * 根据主键删除人员信息
     * @param pk
     * @return int（大于0成功小于0失败）
     */
    int deletePsndocByPrimaryKey(Integer pk);

}