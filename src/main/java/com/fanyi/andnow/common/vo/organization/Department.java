package com.fanyi.andnow.common.vo.organization;

import lombok.Data;

import java.util.Date;
/**
 * 部门实体类
 *
 * @author wangyds
 * @date 2019/6/25
 */
@Data
public class Department {
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

    private Byte enablestate;

    private String note;

    private Integer creator;

    private Date creationtime;

    private Integer modifier;

    private Date modifiedtime;

    private Byte dr;

    private Date ts;

}