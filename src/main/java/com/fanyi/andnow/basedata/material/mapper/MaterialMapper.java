package com.fanyi.andnow.basedata.material.mapper;

import com.fanyi.andnow.common.vo.basedata.Material;
import com.fanyi.andnow.basedata.material.service.MaterialExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 物料映射关系
 * @author yutao
 * @date 20190628
 */
@Mapper
public interface MaterialMapper {

    /**
     * 查询所有物料
     * @return List<Material>
     */
    List<Material> selectMaterial();

    /**
     * 添加物料
     * @param material
     * @return int （大于0成功，小于0失败）
     */
    int insertMaterial(Material material);

    /**
     * 更新物料信息
     * @param material
     * @return int （大于0成功，小于0失败）
     */
    int updateMaterialByPk(Material material);

    /**
     * 删除物料信息（根据主键）
     * @param pkMaterial
     * @return int （大于0成功，小于0失败）
     */
    int deleteMaterialByPk(Integer pkMaterial);

    /**
     * 查询物料数量
     * @return int (物料数量)
     */
    int selectMaterialCount();

}