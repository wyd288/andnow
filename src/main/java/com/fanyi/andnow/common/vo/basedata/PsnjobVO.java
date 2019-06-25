package com.fanyi.andnow.common.vo.basedata;

import java.util.Date;

public class PsnjobVO {
    private Integer pkPsnjob;

    private Integer pkGroup;

    private Integer pkOrg;

    private String psncode;

    private Integer pkPsncl;

    private Integer pkDept;

    private Date startdutydate;

    private Date enddutydate;

    private String pkJob;

    private String jobname;

    private Integer pkPost;

    private Integer showorder;

    private Byte enablestate;

    private String note;

    private Integer creator;

    private Date creationtime;

    private Integer modifier;

    private Date modifiedtime;

    private Byte dr;

    private Date ts;

    public Integer getPkPsnjob() {
        return pkPsnjob;
    }

    public void setPkPsnjob(Integer pkPsnjob) {
        this.pkPsnjob = pkPsnjob;
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

    public String getPsncode() {
        return psncode;
    }

    public void setPsncode(String psncode) {
        this.psncode = psncode == null ? null : psncode.trim();
    }

    public Integer getPkPsncl() {
        return pkPsncl;
    }

    public void setPkPsncl(Integer pkPsncl) {
        this.pkPsncl = pkPsncl;
    }

    public Integer getPkDept() {
        return pkDept;
    }

    public void setPkDept(Integer pkDept) {
        this.pkDept = pkDept;
    }

    public Date getStartdutydate() {
        return startdutydate;
    }

    public void setStartdutydate(Date startdutydate) {
        this.startdutydate = startdutydate;
    }

    public Date getEnddutydate() {
        return enddutydate;
    }

    public void setEnddutydate(Date enddutydate) {
        this.enddutydate = enddutydate;
    }

    public String getPkJob() {
        return pkJob;
    }

    public void setPkJob(String pkJob) {
        this.pkJob = pkJob == null ? null : pkJob.trim();
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    public Integer getPkPost() {
        return pkPost;
    }

    public void setPkPost(Integer pkPost) {
        this.pkPost = pkPost;
    }

    public Integer getShoworder() {
        return showorder;
    }

    public void setShoworder(Integer showorder) {
        this.showorder = showorder;
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