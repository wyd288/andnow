package com.fanyi.andnow.basedata.material.controller;

import com.fanyi.andnow.basedata.material.service.MaterialService;
import com.fanyi.andnow.common.vo.basedata.Material;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 物料控制层
 *
 * @author yutao
 * @date 2019/6/16  18:50
 */
@RestController
public class MaterialController {

    @Autowired
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
     * @return String (成功 or 失败)
     */
    @PostMapping("/addMaterial")
    public String addMaterial(@RequestBody Material material) {
        // 返回成功失败
         if (materialService.addMaterial(material) > 0) {
             return "成功";
         } else {
             return "失败";
         }
    }

    /**
     * 更新物料信息
     * @param material
     * @return String (成功 or 失败)
     */
    @PostMapping("/saveMaterial")
    public String saveMaterialByPk(@RequestBody  Material material) {
        // 返回成功失败
        if (materialService.saveMaterialByPk(material) > 0) {
            return "成功";
        } else {
            return "失败";
        }

    }

}
