package com.fanyi.andnow.common.vo.basedata;

import lombok.Data;

import java.util.Date;
/**
 * 仓库实体类
 *
 * @author wangyds
 * @date 2019/6/25
 */
@Data
public class Storage {
    private Integer pkStorage;

    private Integer pkGroup;

    private Integer pkOrg;

    private String code;

    private String name;

    private String version;

    private String address;

    private Integer principal;

    private String phone;

    private Byte csflag;

    private Byte isgubstore;

    private Byte isprostore;

    private Byte isonthewaystore;

    private Byte isdirectstore;

    private Byte isagentstore;

    private Byte isretailstore;

    private Byte isshopstore;

    private Byte iskptaxstore;

    private Byte enablestate;

    private String note;

    private Integer creator;

    private Date creationtime;

    private Integer modifier;

    private Date modifiedtime;

    private Byte dr;

    private Date ts;

}