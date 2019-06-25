package com.fanyi.andnow.common.vo.basedata;

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

    private Byte csflag;

    private Byte isgubstore;

    private Byte isprostore;

    private Byte isonthewaystore;

    private Byte isdirectstore;

    private Byte isagentstore;

    private Byte isretailstore;

    private Byte isshopstore;

    private Byte iskptaxstore;

    private Byte enablestate;

    private String note;

    private Integer creator;

    private Date creationtime;

    private Integer modifier;

    private Date modifiedtime;

    private Byte dr;

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

    public Byte getCsflag() {
        return csflag;
    }

    public void setCsflag(Byte csflag) {
        this.csflag = csflag;
    }

    public Byte getIsgubstore() {
        return isgubstore;
    }

    public void setIsgubstore(Byte isgubstore) {
        this.isgubstore = isgubstore;
    }

    public Byte getIsprostore() {
        return isprostore;
    }

    public void setIsprostore(Byte isprostore) {
        this.isprostore = isprostore;
    }

    public Byte getIsonthewaystore() {
        return isonthewaystore;
    }

    public void setIsonthewaystore(Byte isonthewaystore) {
        this.isonthewaystore = isonthewaystore;
    }

    public Byte getIsdirectstore() {
        return isdirectstore;
    }

    public void setIsdirectstore(Byte isdirectstore) {
        this.isdirectstore = isdirectstore;
    }

    public Byte getIsagentstore() {
        return isagentstore;
    }

    public void setIsagentstore(Byte isagentstore) {
        this.isagentstore = isagentstore;
    }

    public Byte getIsretailstore() {
        return isretailstore;
    }

    public void setIsretailstore(Byte isretailstore) {
        this.isretailstore = isretailstore;
    }

    public Byte getIsshopstore() {
        return isshopstore;
    }

    public void setIsshopstore(Byte isshopstore) {
        this.isshopstore = isshopstore;
    }

    public Byte getIskptaxstore() {
        return iskptaxstore;
    }

    public void setIskptaxstore(Byte iskptaxstore) {
        this.iskptaxstore = iskptaxstore;
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

    public Byte getDr() {
        return dr;
    }

    public void setDr(Byte dr) {
        this.dr = dr;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }
}