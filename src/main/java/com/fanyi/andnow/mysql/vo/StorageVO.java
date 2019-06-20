package com.fanyi.andnow.mysql.vo;

import java.util.Date;

public class StorageVO {
    private Integer pkStorage;

    private Integer pkGroup;

    private Integer pkOrg;

    private String code;

    private String name;

    private String version;

    private String address;

    private Integer principal;

    private String phone;

    private Integer csflag;

    private Integer isgubstore;

    private Integer isprostore;

    private Integer isonthewaystore;

    private Integer isdirectstore;

    private Integer isagentstore;

    private Integer isretailstore;

    private Integer isshopstore;

    private Integer iskptaxstore;

    private Integer enablestate;

    private String note;

    private Integer creator;

    private Date creationtime;

    private Integer modifier;

    private Date modifiedtime;

    private Integer dr;

    private Date ts;

    public Integer getPkStorage() {
        return pkStorage;
    }

    public void setPkStorage(Integer pkStorage) {
        this.pkStorage = pkStorage;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getCsflag() {
        return csflag;
    }

    public void setCsflag(Integer csflag) {
        this.csflag = csflag;
    }

    public Integer getIsgubstore() {
        return isgubstore;
    }

    public void setIsgubstore(Integer isgubstore) {
        this.isgubstore = isgubstore;
    }

    public Integer getIsprostore() {
        return isprostore;
    }

    public void setIsprostore(Integer isprostore) {
        this.isprostore = isprostore;
    }

    public Integer getIsonthewaystore() {
        return isonthewaystore;
    }

    public void setIsonthewaystore(Integer isonthewaystore) {
        this.isonthewaystore = isonthewaystore;
    }

    public Integer getIsdirectstore() {
        return isdirectstore;
    }

    public void setIsdirectstore(Integer isdirectstore) {
        this.isdirectstore = isdirectstore;
    }

    public Integer getIsagentstore() {
        return isagentstore;
    }

    public void setIsagentstore(Integer isagentstore) {
        this.isagentstore = isagentstore;
    }

    public Integer getIsretailstore() {
        return isretailstore;
    }

    public void setIsretailstore(Integer isretailstore) {
        this.isretailstore = isretailstore;
    }

    public Integer getIsshopstore() {
        return isshopstore;
    }

    public void setIsshopstore(Integer isshopstore) {
        this.isshopstore = isshopstore;
    }

    public Integer getIskptaxstore() {
        return iskptaxstore;
    }

    public void setIskptaxstore(Integer iskptaxstore) {
        this.iskptaxstore = iskptaxstore;
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
}