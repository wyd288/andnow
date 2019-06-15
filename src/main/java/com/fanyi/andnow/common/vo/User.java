package com.fanyi.andnow.common.vo;

import java.util.Date;
import java.util.Objects;

/**
 * 用户实体类
 *
 * @author wangyds
 * @date 2019/06/13
 */
public class User {

    /**
     * 用户主键
     */
    private Integer pk_user;

    /**
     * 集团
     */
    private Integer pk_group;

    /**
     * 组织
     */
    private Integer pk_org;

    /**
     * 用户编码
     */
    private String code;

    /**
     * 用户名称
     */
    private String name;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户性别
     */
    private Integer sex;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 用户地址
     */
    private String address;

    /**
     * 备注
     */
    private String note;

    /**
     *  创建人员
     */
    private Integer creator;

    /**
     * 创建时间
     */
    private Date creationtime;

    /**
     * 修改人员
     */
    private Integer modifier;

    /**
     * 修改时间
     */
    private Date modifiedtime;

    /**
     * 删除标记
     */
    private Integer dr;

    /**
     * 时间戳
     */
    private Date ts	;

    public User() {
    }


    public Integer getPk_user() {
        return pk_user;
    }

    public void setPk_user(Integer pk_user) {
        this.pk_user = pk_user;
    }

    public Integer getPk_group() {
        return pk_group;
    }

    public void setPk_group(Integer pk_group) {
        this.pk_group = pk_group;
    }

    public Integer getPk_org() {
        return pk_org;
    }

    public void setPk_org(Integer pk_org) {
        this.pk_org = pk_org;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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

    public Integer getDr() {
        return dr;
    }

    public void setDr(Integer dr) {
        this.dr = dr;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(pk_user, user.pk_user) &&
                Objects.equals(pk_group, user.pk_group) &&
                Objects.equals(pk_org, user.pk_org) &&
                Objects.equals(code, user.code) &&
                Objects.equals(name, user.name) &&
                Objects.equals(password, user.password) &&
                Objects.equals(sex, user.sex) &&
                Objects.equals(birthday, user.birthday) &&
                Objects.equals(phone, user.phone) &&
                Objects.equals(address, user.address) &&
                Objects.equals(note, user.note) &&
                Objects.equals(creator, user.creator) &&
                Objects.equals(creationtime, user.creationtime) &&
                Objects.equals(modifier, user.modifier) &&
                Objects.equals(modifiedtime, user.modifiedtime) &&
                Objects.equals(dr, user.dr) &&
                Objects.equals(ts, user.ts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pk_user, pk_group, pk_org, code, name, password, sex, birthday, phone, address, note, creator, creationtime, modifier, modifiedtime, dr, ts);
    }

    @Override
    public String toString() {
        return "User{" +
                "pk_user=" + pk_user +
                ", pk_group=" + pk_group +
                ", pk_org=" + pk_org +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", note='" + note + '\'' +
                ", creator=" + creator +
                ", creationtime=" + creationtime +
                ", modifier=" + modifier +
                ", modifiedtime=" + modifiedtime +
                ", dr=" + dr +
                ", ts=" + ts +
                '}';
    }
}
