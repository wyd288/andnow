package com.fanyi.andnow.common.vo;

import java.util.Date;

public class Supplier {
    private Integer pkSupplier;

    private Integer pkGroup;

    private Integer pkOrg;

    private String code;

    private String name;

    private String version;

    private String address;

    private String shortname;

    private String ename;

    private String mencode;

    private Integer pkCountry;

    private Integer pkTimezone;

    private Integer trade;

    private Integer suppliertype;

    private Integer pkSuperior;

    private Date establishdate;

    private Integer pkSupplierclass;

    private Boolean iscustomer;

    private String taxpayerid;

    private Double registeredfund;

    private Integer pkCurrtype;

    private String legalbody;

    private String buslicense;

    private String supcountrytaxes;

    private String postalcode;

    private String website;

    private Byte supplierstate;

    private String suplinkman;

    private String suobankacc;

    private String tel;

    private String fax;

    private String email;

    private Byte enablestate;

    private String note;

    private Integer creator;

    private Date creationtime;

    private Integer modifier;

    private Date modifiedtime;

    private Boolean dr;

    private Date ts;

    public Integer getPkSupplier() {
        return pkSupplier;
    }

    public void setPkSupplier(Integer pkSupplier) {
        this.pkSupplier = pkSupplier;
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

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname == null ? null : shortname.trim();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getMencode() {
        return mencode;
    }

    public void setMencode(String mencode) {
        this.mencode = mencode == null ? null : mencode.trim();
    }

    public Integer getPkCountry() {
        return pkCountry;
    }

    public void setPkCountry(Integer pkCountry) {
        this.pkCountry = pkCountry;
    }

    public Integer getPkTimezone() {
        return pkTimezone;
    }

    public void setPkTimezone(Integer pkTimezone) {
        this.pkTimezone = pkTimezone;
    }

    public Integer getTrade() {
        return trade;
    }

    public void setTrade(Integer trade) {
        this.trade = trade;
    }

    public Integer getSuppliertype() {
        return suppliertype;
    }

    public void setSuppliertype(Integer suppliertype) {
        this.suppliertype = suppliertype;
    }

    public Integer getPkSuperior() {
        return pkSuperior;
    }

    public void setPkSuperior(Integer pkSuperior) {
        this.pkSuperior = pkSuperior;
    }

    public Date getEstablishdate() {
        return establishdate;
    }

    public void setEstablishdate(Date establishdate) {
        this.establishdate = establishdate;
    }

    public Integer getPkSupplierclass() {
        return pkSupplierclass;
    }

    public void setPkSupplierclass(Integer pkSupplierclass) {
        this.pkSupplierclass = pkSupplierclass;
    }

    public Boolean getIscustomer() {
        return iscustomer;
    }

    public void setIscustomer(Boolean iscustomer) {
        this.iscustomer = iscustomer;
    }

    public String getTaxpayerid() {
        return taxpayerid;
    }

    public void setTaxpayerid(String taxpayerid) {
        this.taxpayerid = taxpayerid == null ? null : taxpayerid.trim();
    }

    public Double getRegisteredfund() {
        return registeredfund;
    }

    public void setRegisteredfund(Double registeredfund) {
        this.registeredfund = registeredfund;
    }

    public Integer getPkCurrtype() {
        return pkCurrtype;
    }

    public void setPkCurrtype(Integer pkCurrtype) {
        this.pkCurrtype = pkCurrtype;
    }

    public String getLegalbody() {
        return legalbody;
    }

    public void setLegalbody(String legalbody) {
        this.legalbody = legalbody == null ? null : legalbody.trim();
    }

    public String getBuslicense() {
        return buslicense;
    }

    public void setBuslicense(String buslicense) {
        this.buslicense = buslicense == null ? null : buslicense.trim();
    }

    public String getSupcountrytaxes() {
        return supcountrytaxes;
    }

    public void setSupcountrytaxes(String supcountrytaxes) {
        this.supcountrytaxes = supcountrytaxes == null ? null : supcountrytaxes.trim();
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode == null ? null : postalcode.trim();
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }

    public Byte getSupplierstate() {
        return supplierstate;
    }

    public void setSupplierstate(Byte supplierstate) {
        this.supplierstate = supplierstate;
    }

    public String getSuplinkman() {
        return suplinkman;
    }

    public void setSuplinkman(String suplinkman) {
        this.suplinkman = suplinkman == null ? null : suplinkman.trim();
    }

    public String getSuobankacc() {
        return suobankacc;
    }

    public void setSuobankacc(String suobankacc) {
        this.suobankacc = suobankacc == null ? null : suobankacc.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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