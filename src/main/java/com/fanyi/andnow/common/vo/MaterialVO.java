package com.fanyi.andnow.common.vo;

import java.math.BigDecimal;
import java.util.Date;
/**
 * 物料实体类
 *
 * @author wangyds
 * @date 2019/6/17 8:56
 */
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

    private BigDecimal retailprice;

    private BigDecimal costprice;

    private Byte enablestate;

    private String note;

    private Integer creator;

    private Date creationtime;

    private Integer modifier;

    private Date modifiedtime;

    private Boolean dr;

    private Date ts;

    public Integer getPkMaterial() {
        return pkMaterial;
    }

    public void setPkMaterial(Integer pkMaterial) {
        this.pkMaterial = pkMaterial;
    }

    public Integer getPkGroup() {
        return pkGroup;
    }

    public void setPkGroup(Integer pkGroup) {
        this.pkGroup = pkGroup;
    }

    public Integer getPkOrg() {
        return pkOrg;
    }

    public void setPkOrg(Integer pkOrg) {
        this.pkOrg = pkOrg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname == null ? null : shortname.trim();
    }

    public String getMnecode() {
        return mnecode;
    }

    public void setMnecode(String mnecode) {
        this.mnecode = mnecode == null ? null : mnecode.trim();
    }

    public Integer getPkMeasdoc() {
        return pkMeasdoc;
    }

    public void setPkMeasdoc(Integer pkMeasdoc) {
        this.pkMeasdoc = pkMeasdoc;
    }

    public Integer getPkMarbasclass() {
        return pkMarbasclass;
    }

    public void setPkMarbasclass(Integer pkMarbasclass) {
        this.pkMarbasclass = pkMarbasclass;
    }

    public Integer getPkProdline() {
        return pkProdline;
    }

    public void setPkProdline(Integer pkProdline) {
        this.pkProdline = pkProdline;
    }

    public Integer getPkBrand() {
        return pkBrand;
    }

    public void setPkBrand(Integer pkBrand) {
        this.pkBrand = pkBrand;
    }

    public Double getDiscountflag() {
        return discountflag;
    }

    public void setDiscountflag(Double discountflag) {
        this.discountflag = discountflag;
    }

    public Double getUnitlenth() {
        return unitlenth;
    }

    public void setUnitlenth(Double unitlenth) {
        this.unitlenth = unitlenth;
    }

    public Double getUnitheight() {
        return unitheight;
    }

    public void setUnitheight(Double unitheight) {
        this.unitheight = unitheight;
    }

    public Double getUnitwidth() {
        return unitwidth;
    }

    public void setUnitwidth(Double unitwidth) {
        this.unitwidth = unitwidth;
    }

    public Double getUnitvolume() {
        return unitvolume;
    }

    public void setUnitvolume(Double unitvolume) {
        this.unitvolume = unitvolume;
    }

    public Double getUnitweight() {
        return unitweight;
    }

    public void setUnitweight(Double unitweight) {
        this.unitweight = unitweight;
    }

    public BigDecimal getRetailprice() {
        return retailprice;
    }

    public void setRetailprice(BigDecimal retailprice) {
        this.retailprice = retailprice;
    }

    public BigDecimal getCostprice() {
        return costprice;
    }

    public void setCostprice(BigDecimal costprice) {
        this.costprice = costprice;
    }

    public Byte getEnablestate() {
        return enablestate;
    }

    public void setEnablestate(Byte enablestate) {
        this.enablestate = enablestate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    public Integer getModifier() {
        return modifier;
    }

    public void setModifier(Integer modifier) {
        this.modifier = modifier;
    }

    public Date getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(Date modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    public Boolean getDr() {
        return dr;
    }

    public void setDr(Boolean dr) {
        this.dr = dr;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }
}