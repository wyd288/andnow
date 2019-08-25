package com.fanyi.andnow.controller.basedata;

import com.fanyi.andnow.service.basedata.MaterialService;
import com.fanyi.andnow.entity.basedata.Material;
import org.apache.ibatis.annotations.Param;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 物料控制层
 *
 * @author yutao
 * @date 2019/6/16  18:50
 */
@RestController
public class MaterialController {

    @Resource
    private MaterialService materialService;

    /**
     * 查询所有物料
     * @return List<Material> 物料清单
     */
    @PostMapping("/getMaterialList")
    public List<Material> getMaterialList() {
        return materialService.getMaterialList();
    }

    /**
     * 添加物料信息
     * @param material
     * @return Boolean true or false
     */
    @PostMapping("/addMaterial")
    public Boolean addMaterial(@RequestBody Material material) {
        // 返回成功失败
         if (materialService.addMaterial(material) > 0) {
             return true;
         } else {
             return false;
         }
    }

    /**
     * 更新物料信息
     * @param material
     * @return Boolean true or false
     */
    @PostMapping("/saveMaterial")
    public Boolean saveMaterialByPk(@RequestBody  Material material) {
        // 返回成功失败
        if (materialService.saveMaterialByPk(material) > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 删除物料信息
     * @param materialPk
     * @return
     */
    @PostMapping("/removeMaterial")
    public Boolean removeMaterial(@Param("pkMaterial") Integer materialPk) {
        if (materialService.removeMaterialByPk(materialPk) > 0) {
            return true;
        } else {
            return false;
        }
    }

}
