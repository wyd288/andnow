package com.fanyi.andnow.mysql.vo;

import java.util.Date;

public class UserVO {
    private Integer pkUser;

    private Integer pkGroup;

    private Integer pkOrg;

    private String code;

    private String name;

    private String password;

    private Integer pwdlevel;

    private String pwdparam;

    private Integer identityverifycode;

    private Date enabledate;

    private Date disabledate;

    private Integer islocked;

    private Integer pkPsndoc;

    private Integer doctype;

    private Integer usertype;

    private Date pkUsergroup;

    private Integer enablestate;

    private String note;

    private Integer creator;

    private Date creationtime;

    private Integer modifier;

    private Date modifiedtime;

    private Integer dr;

    private Date ts;

    public Integer getPkUser() {
        return pkUser;
    }

    public void setPkUser(Integer pkUser) {
        this.pkUser = pkUser;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getPwdlevel() {
        return pwdlevel;
    }

    public void setPwdlevel(Integer pwdlevel) {
        this.pwdlevel = pwdlevel;
    }

    public String getPwdparam() {
        return pwdparam;
    }

    public void setPwdparam(String pwdparam) {
        this.pwdparam = pwdparam == null ? null : pwdparam.trim();
    }

    public Integer getIdentityverifycode() {
        return identityverifycode;
    }

    public void setIdentityverifycode(Integer identityverifycode) {
        this.identityverifycode = identityverifycode;
    }

    public Date getEnabledate() {
        return enabledate;
    }

    public void setEnabledate(Date enabledate) {
        this.enabledate = enabledate;
    }

    public Date getDisabledate() {
        return disabledate;
    }

    public void setDisabledate(Date disabledate) {
        this.disabledate = disabledate;
    }

    public Integer getIslocked() {
        return islocked;
    }

    public void setIslocked(Integer islocked) {
        this.islocked = islocked;
    }

    public Integer getPkPsndoc() {
        return pkPsndoc;
    }

    public void setPkPsndoc(Integer pkPsndoc) {
        this.pkPsndoc = pkPsndoc;
    }

    public Integer getDoctype() {
        return doctype;
    }

    public void setDoctype(Integer doctype) {
        this.doctype = doctype;
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public Date getPkUsergroup() {
        return pkUsergroup;
    }

    public void setPkUsergroup(Date pkUsergroup) {
        this.pkUsergroup = pkUsergroup;
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