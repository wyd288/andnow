package com.fanyi.andnow.common.vo.basedata;

import lombok.Data;

import java.util.Date;
/**
 * 人员工作信息实体类
 *
 * @author wangyds
 * @date 2019/6/25
 */
@Data
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


}