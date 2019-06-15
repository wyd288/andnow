package com.fanyi.andnow.common.vo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

/**
 * 物料实体类
 * @author wangyds
 * @date 2019/6/15 20:33
 */
public class Material {

    private	Integer	pk_material	;
    private	Integer	pk_group	;
    private	Integer	pk_org	;
    private	String	code	;
    private	String	name	;
    private	String	version	;
    private	String	specification	;
    private	String	type	;
    private	String	shortname	;
    private	String	mnecode	;
    private	Integer	pk_measdoc	;
    private	Integer	pk_marbasclass	;
    private	Integer	pk_prodline	;
    private	Integer	pk_brand	;
    private	Double	discountflag	;
    private	Double	unitlenth	;
    private	Double	unitheight	;
    private	Double	unitwidth	;
    private	Double	unitvolume	;
    private	Double	unitweight	;
    private	BigDecimal	retailprice	;
    private BigDecimal costprice	;
    private	Integer	enablestate	;
    private	String	note	;
    private	Integer	creator	;
    private Date creationtime	;
    private	Integer	modifier	;
    private	Date	modifiedtime	;
    private	Integer	dr	;
    private	Date	ts	;

    public Material() {
    }

    public Integer getPk_material() {
        return pk_material;
    }

    public void setPk_material(Integer pk_material) {
        this.pk_material = pk_material;
    }

    public Integer getPk_group() {
        return pk_group;
    }

    public void setPk_group(Integer pk_group) {
        this.pk_group = pk_group;
    }

    public Integer getPk_org() {
        return pk_org;
    }

    public void setPk_org(Integer pk_org) {
        this.pk_org = pk_org;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getMnecode() {
        return mnecode;
    }

    public void setMnecode(String mnecode) {
        this.mnecode = mnecode;
    }

    public Integer getPk_measdoc() {
        return pk_measdoc;
    }

    public void setPk_measdoc(Integer pk_measdoc) {
        this.pk_measdoc = pk_measdoc;
    }

    public Integer getPk_marbasclass() {
        return pk_marbasclass;
    }

    public void setPk_marbasclass(Integer pk_marbasclass) {
        this.pk_marbasclass = pk_marbasclass;
    }

    public Integer getPk_prodline() {
        return pk_prodline;
    }

    public void setPk_prodline(Integer pk_prodline) {
        this.pk_prodline = pk_prodline;
    }

    public Integer getPk_brand() {
        return pk_brand;
    }

    public void setPk_brand(Integer pk_brand) {
        this.pk_brand = pk_brand;
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

    public Integer getEnablestate() {
        return enablestate;
    }

    public void setEnablestate(Integer enablestate) {
        this.enablestate = enablestate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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

    public Integer getDr() {
        return dr;
    }

    public void setDr(Integer dr) {
        this.dr = dr;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Material material = (Material) o;
        return Objects.equals(pk_material, material.pk_material) &&
                Objects.equals(pk_group, material.pk_group) &&
                Objects.equals(pk_org, material.pk_org) &&
                Objects.equals(code, material.code) &&
                Objects.equals(name, material.name) &&
                Objects.equals(version, material.version) &&
                Objects.equals(specification, material.specification) &&
                Objects.equals(type, material.type) &&
                Objects.equals(shortname, material.shortname) &&
                Objects.equals(mnecode, material.mnecode) &&
                Objects.equals(pk_measdoc, material.pk_measdoc) &&
                Objects.equals(pk_marbasclass, material.pk_marbasclass) &&
                Objects.equals(pk_prodline, material.pk_prodline) &&
                Objects.equals(pk_brand, material.pk_brand) &&
                Objects.equals(discountflag, material.discountflag) &&
                Objects.equals(unitlenth, material.unitlenth) &&
                Objects.equals(unitheight, material.unitheight) &&
                Objects.equals(unitwidth, material.unitwidth) &&
                Objects.equals(unitvolume, material.unitvolume) &&
                Objects.equals(unitweight, material.unitweight) &&
                Objects.equals(retailprice, material.retailprice) &&
                Objects.equals(costprice, material.costprice) &&
                Objects.equals(enablestate, material.enablestate) &&
                Objects.equals(note, material.note) &&
                Objects.equals(creator, material.creator) &&
                Objects.equals(creationtime, material.creationtime) &&
                Objects.equals(modifier, material.modifier) &&
                Objects.equals(modifiedtime, material.modifiedtime) &&
                Objects.equals(dr, material.dr) &&
                Objects.equals(ts, material.ts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pk_material, pk_group, pk_org, code, name, version, specification, type, shortname, mnecode, pk_measdoc, pk_marbasclass, pk_prodline, pk_brand, discountflag, unitlenth, unitheight, unitwidth, unitvolume, unitweight, retailprice, costprice, enablestate, note, creator, creationtime, modifier, modifiedtime, dr, ts);
    }

    @Override
    public String toString() {
        return "Material{" +
                "pk_material=" + pk_material +
                ", pk_group=" + pk_group +
                ", pk_org=" + pk_org +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", specification='" + specification + '\'' +
                ", type='" + type + '\'' +
                ", shortname='" + shortname + '\'' +
                ", mnecode='" + mnecode + '\'' +
                ", pk_measdoc=" + pk_measdoc +
                ", pk_marbasclass=" + pk_marbasclass +
                ", pk_prodline=" + pk_prodline +
                ", pk_brand=" + pk_brand +
                ", discountflag=" + discountflag +
                ", unitlenth=" + unitlenth +
                ", unitheight=" + unitheight +
                ", unitwidth=" + unitwidth +
                ", unitvolume=" + unitvolume +
                ", unitweight=" + unitweight +
                ", retailprice=" + retailprice +
                ", costprice=" + costprice +
                ", enablestate=" + enablestate +
                ", note='" + note + '\'' +
                ", creator=" + creator +
                ", creationtime=" + creationtime +
                ", modifier=" + modifier +
                ", modifiedtime=" + modifiedtime +
                ", dr=" + dr +
                ", ts=" + ts +
                '}';
    }
}
