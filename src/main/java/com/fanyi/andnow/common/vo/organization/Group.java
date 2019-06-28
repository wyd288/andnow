package com.fanyi.andnow.common.vo.organization;

import lombok.Data;

import java.util.Date;
/**
 * 集团实体类
 *
 * @author wangyds
 * @date 2019/6/25
 */
@Data
public class Group {
    private Integer pkGroup;

    private String code;

    private String name;

    private String mencode;

    private String innercode;

    private String shortname;

    private Integer pkSuperior;

    private String service;

    private String introduction;

    private String countryarea;

    private String address;

    private String tel;

    private String fax;

    private Date establishdate;

    private String version;

    private String ename;

    private Integer pkCountry;

    private Integer pkTimezone;

    private Byte enablestate;

    private String note;

    private Integer creator;

    private Date creationtime;

    private Integer modifier;

    private Date modifiedtime;

    private Byte dr;

    private Date ts;


}