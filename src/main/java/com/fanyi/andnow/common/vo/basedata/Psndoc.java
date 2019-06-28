package com.fanyi.andnow.common.vo.basedata;

import lombok.Data;

import java.util.Date;
/**
 * 人员基本信息实体类
 *
 * @author wangyds
 * @date 2019/6/25
 */
@Data
public class Psndoc {
    private Integer pkPsndoc;

    private Integer pkGroup;

    private Integer pkOrg;

    private String code;

    private String name;

    private String usedname;

    private String lastname;

    private String firstname;

    private String nikename;

    private String mnecode;

    private Date joinworkdate;

    private Integer pkPsnjob;

    private Byte sex;

    private Date birthday;

    private Byte cardtype;

    private String idcard;

    private String phone;

    private String officephone;

    private String homephone;

    private String email;

    private String address;

    private Byte enablestate;

    private String note;

    private Integer creator;

    private Date creationtime;

    private Integer modifier;

    private Date modifiedtime;

    private Byte dr;

    private Date ts;


}