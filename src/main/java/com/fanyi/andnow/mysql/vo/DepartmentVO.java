package com.fanyi.andnow.mysql.vo;

import java.util.Date;

public class DepartmentVO {
    private Integer pkDept;

    private String code;

    private String name;

    private String mencode;

    private String innercode;

    private String shortname;

    private Integer pkGroup;

    private Integer pkOrg;

    private Integer pkSuperior;

    private Integer depttype;

    private Integer principal;

    private String tel;

    private String address;

    private String introduction;

    private String countryarea;

    private Date establishdate;

    private String version;

    private String ename;

    private Date cancledate;

    private Integer enablestate;

    private String note;

    private Integer creator;

    private Date creationtime;

    private Integer modifier;

    private Date modifiedtime;

    private Integer dr;

    private Date ts;

    public Integer getPkDept() {
        return pkDept;
    }

    public void setPkDept(Integer pkDept) {
        this.pkDept = pkDept;
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

    public String getMencode() {
        return mencode;
    }

    public void setMencode(String mencode) {
        this.mencode = mencode == null ? null : mencode.trim();
    }

    public String getInnercode() {
        return innercode;
    }

    public void setInnercode(String innercode) {
        this.innercode = innercode == null ? null : innercode.trim();
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname == null ? null : shortname.trim();
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

    public Integer getPkSuperior() {
        return pkSuperior;
    }

    public void setPkSuperior(Integer pkSuperior) {
        this.pkSuperior = pkSuperior;
    }

    public Integer getDepttype() {
        return depttype;
    }

    public void setDepttype(Integer depttype) {
        this.depttype = depttype;
    }

    public Integer getPrincipal() {
        return principal;
    }

    public void setPrincipal(Integer principal) {
        this.principal = principal;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getCountryarea() {
        return countryarea;
    }

    public void setCountryarea(String countryarea) {
        this.countryarea = countryarea == null ? null : countryarea.trim();
    }

    public Date getEstablishdate() {
        return establishdate;
    }

    public void setEstablishdate(Date establishdate) {
        this.establishdate = establishdate;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public Date getCancledate() {
        return cancledate;
    }

    public void setCancledate(Date cancledate) {
        this.cancledate = cancledate;
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