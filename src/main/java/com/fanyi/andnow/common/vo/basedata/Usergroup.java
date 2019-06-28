package com.fanyi.andnow.common.vo.basedata;

import lombok.Data;

import java.util.Date;
/**
 * 用户组实体类
 *
 * @author wangyds
 * @date 2019/6/25
 */
@Data
public class Usergroup {
    private Integer pkUsergroup;

    private String code;

    private String name;

    private String innercode;

    private Integer pkSuperior;

    private String version;

    private Byte enablestate;

    private String note;

    private Integer creator;

    private Date creationtime;

    private Integer modifier;

    private Date modifiedtime;

    private Byte dr;

    private Date ts;


}