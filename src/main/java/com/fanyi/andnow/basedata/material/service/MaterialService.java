package com.fanyi.andnow.basedata.material.service;

import com.fanyi.andnow.common.vo.basedata.Material;

import java.util.List;

/**
 * 物料业务层
 * @author yutao
 * @date 20190628
 */
public interface MaterialService {

    /**
     * 查询所有物料
     * @return 物料清单
     */
    List<Material> getMaterialList();

    /**
     * 添加物料信息
     * @param material
     * @return int(大于0成功 小于0失败)
     */
    int addMaterial(Material material);

    /**
     * 更新物料信息
     * @param material
     * @return int(大于0成功 小于0失败)
     */
    int saveMaterialByPk(Material material);

    /**
     * 删除物料信息
     * @param pkMaterial
     * @return int(大于0成功 小于0失败)
     */
    int removeMaterialByPk(Integer pkMaterial);

    /**
     * 获取单个物料
     * @param pk
     * @return Material
     */
    Material getmaterialOne(Integer pk);

    /**
     * 获取物料数量
     * @return int（物料数量）
     */
    int getMaterialCount();

}
