package com.fanyi.andnow.common.vo.basedata;

import lombok.Data;

import java.util.Date;
/**
 * 物料实体类
 *
 * @author wangyds
 * @date 2019/6/25
 */
@Data
public class MaterialVO {
    private Integer pkMaterial;

    private Integer pkGroup;

    private Integer pkOrg;

    private String code;

    private String name;

    private String version;

    private String specification;

    private String type;

    private String shortname;

    private String mnecode;

    private Integer pkMeasdoc;

    private Integer pkMarbasclass;

    private Integer pkProdline;

    private Integer pkBrand;

    private Double discountflag;

    private Double unitlenth;

    private Double unitheight;

    private Double unitwidth;

    private Double unitvolume;

    private Double unitweight;

    private Long retailprice;

    private Long costprice;

    private Byte enablestate;

    private String note;

    private Integer creator;

    private Date creationtime;

    private Integer modifier;

    private Date modifiedtime;

    private Byte dr;

    private Date ts;

}