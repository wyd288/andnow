package com.fanyi.andnow.entity.basedata;

import lombok.Data;

import java.util.Date;
/**
 * 供应商实体类
 *
 * @author wangyds
 * @date 2019/6/25
 */
@Data
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

    private Byte iscustomer;

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

    private Byte dr;

    private Date ts;


}