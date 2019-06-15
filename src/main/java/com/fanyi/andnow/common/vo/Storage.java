package com.fanyi.andnow.common.vo;

import java.util.Date;
import java.util.Objects;

/**
 * 仓库实体类
 * @author wangyds
 * @date 2019/6/15 20:41
 */
public class Storage {

    /**
     * 仓库主键
     */
    private Integer pk_storage;

    /**
     * 集团
     */
    private Integer pk_group;

    /**
     * 组织
     */
    private Integer pk_org;

    /**
     * 仓库编码
     */
    private String code;

    /**
     * 仓库名称
     */
    private String name;

    /**
     * 版本
     */
    private String version;

    /**
     * 仓库地址
     */
    private String address;

    /**
     * 负责人
     */
    private  Integer principal;

    /**
     * 负责人电话
     */
    private String phone;

    /**
     * 货位管理标志
     */
    private Boolean csflag;

    /**
     * 废品仓库标志
     */
    private Boolean isgubstore;

    /**
     * 生产仓库标志
     */
    private Boolean isprostore;

    /**
     * 在途仓库标志
     */
    private Boolean isonthewaystore;

    /**
     * 直运仓库标志
     */
    private Boolean isdirrectstore;

    /**
     * 代储仓库标志
     */
    private Boolean isagentstore;

    /**
     * 零售仓库标志
     */
    private Boolean isretailstore;

    /**
     * 门店仓库标志
     */
    private Boolean isshopstore;

    /**
     * 保税仓库标志
     */
    private Boolean iskptaxstore;

    /**
     * 启用状态
     */
    private String enablestate;

    /**
     * 备注
     */
    private String note;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    private Date creationtime;

    /**
     * 修改人
     */
    private Integer modifier;

    /**
     * 修改时间
     */
    private Date modifiedtime;

    /**
     * 删除标记
     */
    private Integer dr;

    /**
     * 时间戳
     */
    private Date ts;

    public Integer getPk_storage() {
        return pk_storage;
    }

    public void setPk_storage(Integer pk_storage) {
        this.pk_storage = pk_storage;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPrincipal() {
        return principal;
    }

    public void setPrincipal(Integer principal) {
        this.principal = principal;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getCsflag() {
        return csflag;
    }

    public void setCsflag(Boolean csflag) {
        this.csflag = csflag;
    }

    public Boolean getIsgubstore() {
        return isgubstore;
    }

    public void setIsgubstore(Boolean isgubstore) {
        this.isgubstore = isgubstore;
    }

    public Boolean getIsprostore() {
        return isprostore;
    }

    public void setIsprostore(Boolean isprostore) {
        this.isprostore = isprostore;
    }

    public Boolean getIsonthewaystore() {
        return isonthewaystore;
    }

    public void setIsonthewaystore(Boolean isonthewaystore) {
        this.isonthewaystore = isonthewaystore;
    }

    public Boolean getIsdirrectstore() {
        return isdirrectstore;
    }

    public void setIsdirrectstore(Boolean isdirrectstore) {
        this.isdirrectstore = isdirrectstore;
    }

    public Boolean getIsagentstore() {
        return isagentstore;
    }

    public void setIsagentstore(Boolean isagentstore) {
        this.isagentstore = isagentstore;
    }

    public Boolean getIsretailstore() {
        return isretailstore;
    }

    public void setIsretailstore(Boolean isretailstore) {
        this.isretailstore = isretailstore;
    }

    public Boolean getIsshopstore() {
        return isshopstore;
    }

    public void setIsshopstore(Boolean isshopstore) {
        this.isshopstore = isshopstore;
    }

    public Boolean getIskptaxstore() {
        return iskptaxstore;
    }

    public void setIskptaxstore(Boolean iskptaxstore) {
        this.iskptaxstore = iskptaxstore;
    }

    public String getEnablestate() {
        return enablestate;
    }

    public void setEnablestate(String enablestate) {
        this.enablestate = enablestate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
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
        Storage storage = (Storage) o;
        return Objects.equals(pk_storage, storage.pk_storage) &&
                Objects.equals(pk_group, storage.pk_group) &&
                Objects.equals(pk_org, storage.pk_org) &&
                Objects.equals(code, storage.code) &&
                Objects.equals(name, storage.name) &&
                Objects.equals(version, storage.version) &&
                Objects.equals(address, storage.address) &&
                Objects.equals(principal, storage.principal) &&
                Objects.equals(phone, storage.phone) &&
                Objects.equals(csflag, storage.csflag) &&
                Objects.equals(isgubstore, storage.isgubstore) &&
                Objects.equals(isprostore, storage.isprostore) &&
                Objects.equals(isonthewaystore, storage.isonthewaystore) &&
                Objects.equals(isdirrectstore, storage.isdirrectstore) &&
                Objects.equals(isagentstore, storage.isagentstore) &&
                Objects.equals(isretailstore, storage.isretailstore) &&
                Objects.equals(isshopstore, storage.isshopstore) &&
                Objects.equals(iskptaxstore, storage.iskptaxstore) &&
                Objects.equals(enablestate, storage.enablestate) &&
                Objects.equals(note, storage.note) &&
                Objects.equals(creator, storage.creator) &&
                Objects.equals(creationtime, storage.creationtime) &&
                Objects.equals(modifier, storage.modifier) &&
                Objects.equals(modifiedtime, storage.modifiedtime) &&
                Objects.equals(dr, storage.dr) &&
                Objects.equals(ts, storage.ts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pk_storage, pk_group, pk_org, code, name, version, address, principal, phone, csflag, isgubstore, isprostore, isonthewaystore, isdirrectstore, isagentstore, isretailstore, isshopstore, iskptaxstore, enablestate, note, creator, creationtime, modifier, modifiedtime, dr, ts);
    }

    @Override
    public String toString() {
        return "Storage{" +
                "pk_storage=" + pk_storage +
                ", pk_group=" + pk_group +
                ", pk_org=" + pk_org +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", address='" + address + '\'' +
                ", principal=" + principal +
                ", phone='" + phone + '\'' +
                ", csflag=" + csflag +
                ", isgubstore=" + isgubstore +
                ", isprostore=" + isprostore +
                ", isonthewaystore=" + isonthewaystore +
                ", isdirrectstore=" + isdirrectstore +
                ", isagentstore=" + isagentstore +
                ", isretailstore=" + isretailstore +
                ", isshopstore=" + isshopstore +
                ", iskptaxstore=" + iskptaxstore +
                ", enablestate='" + enablestate + '\'' +
                ", note='" + note + '\'' +
                ", creator='" + creator + '\'' +
                ", creationtime=" + creationtime +
                ", modifier=" + modifier +
                ", modifiedtime=" + modifiedtime +
                ", dr=" + dr +
                ", ts=" + ts +
                '}';
    }
}
