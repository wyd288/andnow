package com.fanyi.andnow.common.vo.basedata;

import lombok.Data;

import java.util.Date;
/**
 * 用户实体类
 *
 * @author wangyds
 * @date 2019/6/25
 */
@Data
public class User {
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


}