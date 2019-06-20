package com.fanyi.andnow.mysql.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserVOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserVOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPkUserIsNull() {
            addCriterion("pk_user is null");
            return (Criteria) this;
        }

        public Criteria andPkUserIsNotNull() {
            addCriterion("pk_user is not null");
            return (Criteria) this;
        }

        public Criteria andPkUserEqualTo(Integer value) {
            addCriterion("pk_user =", value, "pkUser");
            return (Criteria) this;
        }

        public Criteria andPkUserNotEqualTo(Integer value) {
            addCriterion("pk_user <>", value, "pkUser");
            return (Criteria) this;
        }

        public Criteria andPkUserGreaterThan(Integer value) {
            addCriterion("pk_user >", value, "pkUser");
            return (Criteria) this;
        }

        public Criteria andPkUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_user >=", value, "pkUser");
            return (Criteria) this;
        }

        public Criteria andPkUserLessThan(Integer value) {
            addCriterion("pk_user <", value, "pkUser");
            return (Criteria) this;
        }

        public Criteria andPkUserLessThanOrEqualTo(Integer value) {
            addCriterion("pk_user <=", value, "pkUser");
            return (Criteria) this;
        }

        public Criteria andPkUserIn(List<Integer> values) {
            addCriterion("pk_user in", values, "pkUser");
            return (Criteria) this;
        }

        public Criteria andPkUserNotIn(List<Integer> values) {
            addCriterion("pk_user not in", values, "pkUser");
            return (Criteria) this;
        }

        public Criteria andPkUserBetween(Integer value1, Integer value2) {
            addCriterion("pk_user between", value1, value2, "pkUser");
            return (Criteria) this;
        }

        public Criteria andPkUserNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_user not between", value1, value2, "pkUser");
            return (Criteria) this;
        }

        public Criteria andPkGroupIsNull() {
            addCriterion("pk_group is null");
            return (Criteria) this;
        }

        public Criteria andPkGroupIsNotNull() {
            addCriterion("pk_group is not null");
            return (Criteria) this;
        }

        public Criteria andPkGroupEqualTo(Integer value) {
            addCriterion("pk_group =", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupNotEqualTo(Integer value) {
            addCriterion("pk_group <>", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupGreaterThan(Integer value) {
            addCriterion("pk_group >", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_group >=", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupLessThan(Integer value) {
            addCriterion("pk_group <", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupLessThanOrEqualTo(Integer value) {
            addCriterion("pk_group <=", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupIn(List<Integer> values) {
            addCriterion("pk_group in", values, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupNotIn(List<Integer> values) {
            addCriterion("pk_group not in", values, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupBetween(Integer value1, Integer value2) {
            addCriterion("pk_group between", value1, value2, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_group not between", value1, value2, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkOrgIsNull() {
            addCriterion("pk_org is null");
            return (Criteria) this;
        }

        public Criteria andPkOrgIsNotNull() {
            addCriterion("pk_org is not null");
            return (Criteria) this;
        }

        public Criteria andPkOrgEqualTo(Integer value) {
            addCriterion("pk_org =", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgNotEqualTo(Integer value) {
            addCriterion("pk_org <>", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgGreaterThan(Integer value) {
            addCriterion("pk_org >", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_org >=", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgLessThan(Integer value) {
            addCriterion("pk_org <", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgLessThanOrEqualTo(Integer value) {
            addCriterion("pk_org <=", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgIn(List<Integer> values) {
            addCriterion("pk_org in", values, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgNotIn(List<Integer> values) {
            addCriterion("pk_org not in", values, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgBetween(Integer value1, Integer value2) {
            addCriterion("pk_org between", value1, value2, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_org not between", value1, value2, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPwdlevelIsNull() {
            addCriterion("pwdlevel is null");
            return (Criteria) this;
        }

        public Criteria andPwdlevelIsNotNull() {
            addCriterion("pwdlevel is not null");
            return (Criteria) this;
        }

        public Criteria andPwdlevelEqualTo(Integer value) {
            addCriterion("pwdlevel =", value, "pwdlevel");
            return (Criteria) this;
        }

        public Criteria andPwdlevelNotEqualTo(Integer value) {
            addCriterion("pwdlevel <>", value, "pwdlevel");
            return (Criteria) this;
        }

        public Criteria andPwdlevelGreaterThan(Integer value) {
            addCriterion("pwdlevel >", value, "pwdlevel");
            return (Criteria) this;
        }

        public Criteria andPwdlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("pwdlevel >=", value, "pwdlevel");
            return (Criteria) this;
        }

        public Criteria andPwdlevelLessThan(Integer value) {
            addCriterion("pwdlevel <", value, "pwdlevel");
            return (Criteria) this;
        }

        public Criteria andPwdlevelLessThanOrEqualTo(Integer value) {
            addCriterion("pwdlevel <=", value, "pwdlevel");
            return (Criteria) this;
        }

        public Criteria andPwdlevelIn(List<Integer> values) {
            addCriterion("pwdlevel in", values, "pwdlevel");
            return (Criteria) this;
        }

        public Criteria andPwdlevelNotIn(List<Integer> values) {
            addCriterion("pwdlevel not in", values, "pwdlevel");
            return (Criteria) this;
        }

        public Criteria andPwdlevelBetween(Integer value1, Integer value2) {
            addCriterion("pwdlevel between", value1, value2, "pwdlevel");
            return (Criteria) this;
        }

        public Criteria andPwdlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("pwdlevel not between", value1, value2, "pwdlevel");
            return (Criteria) this;
        }

        public Criteria andPwdparamIsNull() {
            addCriterion("pwdparam is null");
            return (Criteria) this;
        }

        public Criteria andPwdparamIsNotNull() {
            addCriterion("pwdparam is not null");
            return (Criteria) this;
        }

        public Criteria andPwdparamEqualTo(String value) {
            addCriterion("pwdparam =", value, "pwdparam");
            return (Criteria) this;
        }

        public Criteria andPwdparamNotEqualTo(String value) {
            addCriterion("pwdparam <>", value, "pwdparam");
            return (Criteria) this;
        }

        public Criteria andPwdparamGreaterThan(String value) {
            addCriterion("pwdparam >", value, "pwdparam");
            return (Criteria) this;
        }

        public Criteria andPwdparamGreaterThanOrEqualTo(String value) {
            addCriterion("pwdparam >=", value, "pwdparam");
            return (Criteria) this;
        }

        public Criteria andPwdparamLessThan(String value) {
            addCriterion("pwdparam <", value, "pwdparam");
            return (Criteria) this;
        }

        public Criteria andPwdparamLessThanOrEqualTo(String value) {
            addCriterion("pwdparam <=", value, "pwdparam");
            return (Criteria) this;
        }

        public Criteria andPwdparamLike(String value) {
            addCriterion("pwdparam like", value, "pwdparam");
            return (Criteria) this;
        }

        public Criteria andPwdparamNotLike(String value) {
            addCriterion("pwdparam not like", value, "pwdparam");
            return (Criteria) this;
        }

        public Criteria andPwdparamIn(List<String> values) {
            addCriterion("pwdparam in", values, "pwdparam");
            return (Criteria) this;
        }

        public Criteria andPwdparamNotIn(List<String> values) {
            addCriterion("pwdparam not in", values, "pwdparam");
            return (Criteria) this;
        }

        public Criteria andPwdparamBetween(String value1, String value2) {
            addCriterion("pwdparam between", value1, value2, "pwdparam");
            return (Criteria) this;
        }

        public Criteria andPwdparamNotBetween(String value1, String value2) {
            addCriterion("pwdparam not between", value1, value2, "pwdparam");
            return (Criteria) this;
        }

        public Criteria andIdentityverifycodeIsNull() {
            addCriterion("identityverifycode is null");
            return (Criteria) this;
        }

        public Criteria andIdentityverifycodeIsNotNull() {
            addCriterion("identityverifycode is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityverifycodeEqualTo(Integer value) {
            addCriterion("identityverifycode =", value, "identityverifycode");
            return (Criteria) this;
        }

        public Criteria andIdentityverifycodeNotEqualTo(Integer value) {
            addCriterion("identityverifycode <>", value, "identityverifycode");
            return (Criteria) this;
        }

        public Criteria andIdentityverifycodeGreaterThan(Integer value) {
            addCriterion("identityverifycode >", value, "identityverifycode");
            return (Criteria) this;
        }

        public Criteria andIdentityverifycodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("identityverifycode >=", value, "identityverifycode");
            return (Criteria) this;
        }

        public Criteria andIdentityverifycodeLessThan(Integer value) {
            addCriterion("identityverifycode <", value, "identityverifycode");
            return (Criteria) this;
        }

        public Criteria andIdentityverifycodeLessThanOrEqualTo(Integer value) {
            addCriterion("identityverifycode <=", value, "identityverifycode");
            return (Criteria) this;
        }

        public Criteria andIdentityverifycodeIn(List<Integer> values) {
            addCriterion("identityverifycode in", values, "identityverifycode");
            return (Criteria) this;
        }

        public Criteria andIdentityverifycodeNotIn(List<Integer> values) {
            addCriterion("identityverifycode not in", values, "identityverifycode");
            return (Criteria) this;
        }

        public Criteria andIdentityverifycodeBetween(Integer value1, Integer value2) {
            addCriterion("identityverifycode between", value1, value2, "identityverifycode");
            return (Criteria) this;
        }

        public Criteria andIdentityverifycodeNotBetween(Integer value1, Integer value2) {
            addCriterion("identityverifycode not between", value1, value2, "identityverifycode");
            return (Criteria) this;
        }

        public Criteria andEnabledateIsNull() {
            addCriterion("enabledate is null");
            return (Criteria) this;
        }

        public Criteria andEnabledateIsNotNull() {
            addCriterion("enabledate is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledateEqualTo(Date value) {
            addCriterionForJDBCDate("enabledate =", value, "enabledate");
            return (Criteria) this;
        }

        public Criteria andEnabledateNotEqualTo(Date value) {
            addCriterionForJDBCDate("enabledate <>", value, "enabledate");
            return (Criteria) this;
        }

        public Criteria andEnabledateGreaterThan(Date value) {
            addCriterionForJDBCDate("enabledate >", value, "enabledate");
            return (Criteria) this;
        }

        public Criteria andEnabledateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("enabledate >=", value, "enabledate");
            return (Criteria) this;
        }

        public Criteria andEnabledateLessThan(Date value) {
            addCriterionForJDBCDate("enabledate <", value, "enabledate");
            return (Criteria) this;
        }

        public Criteria andEnabledateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("enabledate <=", value, "enabledate");
            return (Criteria) this;
        }

        public Criteria andEnabledateIn(List<Date> values) {
            addCriterionForJDBCDate("enabledate in", values, "enabledate");
            return (Criteria) this;
        }

        public Criteria andEnabledateNotIn(List<Date> values) {
            addCriterionForJDBCDate("enabledate not in", values, "enabledate");
            return (Criteria) this;
        }

        public Criteria andEnabledateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("enabledate between", value1, value2, "enabledate");
            return (Criteria) this;
        }

        public Criteria andEnabledateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("enabledate not between", value1, value2, "enabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateIsNull() {
            addCriterion("disabledate is null");
            return (Criteria) this;
        }

        public Criteria andDisabledateIsNotNull() {
            addCriterion("disabledate is not null");
            return (Criteria) this;
        }

        public Criteria andDisabledateEqualTo(Date value) {
            addCriterionForJDBCDate("disabledate =", value, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateNotEqualTo(Date value) {
            addCriterionForJDBCDate("disabledate <>", value, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateGreaterThan(Date value) {
            addCriterionForJDBCDate("disabledate >", value, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("disabledate >=", value, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateLessThan(Date value) {
            addCriterionForJDBCDate("disabledate <", value, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("disabledate <=", value, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateIn(List<Date> values) {
            addCriterionForJDBCDate("disabledate in", values, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateNotIn(List<Date> values) {
            addCriterionForJDBCDate("disabledate not in", values, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("disabledate between", value1, value2, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("disabledate not between", value1, value2, "disabledate");
            return (Criteria) this;
        }

        public Criteria andIslockedIsNull() {
            addCriterion("islocked is null");
            return (Criteria) this;
        }

        public Criteria andIslockedIsNotNull() {
            addCriterion("islocked is not null");
            return (Criteria) this;
        }

        public Criteria andIslockedEqualTo(Integer value) {
            addCriterion("islocked =", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedNotEqualTo(Integer value) {
            addCriterion("islocked <>", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedGreaterThan(Integer value) {
            addCriterion("islocked >", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedGreaterThanOrEqualTo(Integer value) {
            addCriterion("islocked >=", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedLessThan(Integer value) {
            addCriterion("islocked <", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedLessThanOrEqualTo(Integer value) {
            addCriterion("islocked <=", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedIn(List<Integer> values) {
            addCriterion("islocked in", values, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedNotIn(List<Integer> values) {
            addCriterion("islocked not in", values, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedBetween(Integer value1, Integer value2) {
            addCriterion("islocked between", value1, value2, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedNotBetween(Integer value1, Integer value2) {
            addCriterion("islocked not between", value1, value2, "islocked");
            return (Criteria) this;
        }

        public Criteria andPkPsndocIsNull() {
            addCriterion("pk_psndoc is null");
            return (Criteria) this;
        }

        public Criteria andPkPsndocIsNotNull() {
            addCriterion("pk_psndoc is not null");
            return (Criteria) this;
        }

        public Criteria andPkPsndocEqualTo(Integer value) {
            addCriterion("pk_psndoc =", value, "pkPsndoc");
            return (Criteria) this;
        }

        public Criteria andPkPsndocNotEqualTo(Integer value) {
            addCriterion("pk_psndoc <>", value, "pkPsndoc");
            return (Criteria) this;
        }

        public Criteria andPkPsndocGreaterThan(Integer value) {
            addCriterion("pk_psndoc >", value, "pkPsndoc");
            return (Criteria) this;
        }

        public Criteria andPkPsndocGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_psndoc >=", value, "pkPsndoc");
            return (Criteria) this;
        }

        public Criteria andPkPsndocLessThan(Integer value) {
            addCriterion("pk_psndoc <", value, "pkPsndoc");
            return (Criteria) this;
        }

        public Criteria andPkPsndocLessThanOrEqualTo(Integer value) {
            addCriterion("pk_psndoc <=", value, "pkPsndoc");
            return (Criteria) this;
        }

        public Criteria andPkPsndocIn(List<Integer> values) {
            addCriterion("pk_psndoc in", values, "pkPsndoc");
            return (Criteria) this;
        }

        public Criteria andPkPsndocNotIn(List<Integer> values) {
            addCriterion("pk_psndoc not in", values, "pkPsndoc");
            return (Criteria) this;
        }

        public Criteria andPkPsndocBetween(Integer value1, Integer value2) {
            addCriterion("pk_psndoc between", value1, value2, "pkPsndoc");
            return (Criteria) this;
        }

        public Criteria andPkPsndocNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_psndoc not between", value1, value2, "pkPsndoc");
            return (Criteria) this;
        }

        public Criteria andDoctypeIsNull() {
            addCriterion("doctype is null");
            return (Criteria) this;
        }

        public Criteria andDoctypeIsNotNull() {
            addCriterion("doctype is not null");
            return (Criteria) this;
        }

        public Criteria andDoctypeEqualTo(Integer value) {
            addCriterion("doctype =", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeNotEqualTo(Integer value) {
            addCriterion("doctype <>", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeGreaterThan(Integer value) {
            addCriterion("doctype >", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctype >=", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeLessThan(Integer value) {
            addCriterion("doctype <", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeLessThanOrEqualTo(Integer value) {
            addCriterion("doctype <=", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeIn(List<Integer> values) {
            addCriterion("doctype in", values, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeNotIn(List<Integer> values) {
            addCriterion("doctype not in", values, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeBetween(Integer value1, Integer value2) {
            addCriterion("doctype between", value1, value2, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeNotBetween(Integer value1, Integer value2) {
            addCriterion("doctype not between", value1, value2, "doctype");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNull() {
            addCriterion("usertype is null");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNotNull() {
            addCriterion("usertype is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypeEqualTo(Integer value) {
            addCriterion("usertype =", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotEqualTo(Integer value) {
            addCriterion("usertype <>", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThan(Integer value) {
            addCriterion("usertype >", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("usertype >=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThan(Integer value) {
            addCriterion("usertype <", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThanOrEqualTo(Integer value) {
            addCriterion("usertype <=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeIn(List<Integer> values) {
            addCriterion("usertype in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotIn(List<Integer> values) {
            addCriterion("usertype not in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeBetween(Integer value1, Integer value2) {
            addCriterion("usertype between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotBetween(Integer value1, Integer value2) {
            addCriterion("usertype not between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andPkUsergroupIsNull() {
            addCriterion("pk_usergroup is null");
            return (Criteria) this;
        }

        public Criteria andPkUsergroupIsNotNull() {
            addCriterion("pk_usergroup is not null");
            return (Criteria) this;
        }

        public Criteria andPkUsergroupEqualTo(Date value) {
            addCriterionForJDBCDate("pk_usergroup =", value, "pkUsergroup");
            return (Criteria) this;
        }

        public Criteria andPkUsergroupNotEqualTo(Date value) {
            addCriterionForJDBCDate("pk_usergroup <>", value, "pkUsergroup");
            return (Criteria) this;
        }

        public Criteria andPkUsergroupGreaterThan(Date value) {
            addCriterionForJDBCDate("pk_usergroup >", value, "pkUsergroup");
            return (Criteria) this;
        }

        public Criteria andPkUsergroupGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pk_usergroup >=", value, "pkUsergroup");
            return (Criteria) this;
        }

        public Criteria andPkUsergroupLessThan(Date value) {
            addCriterionForJDBCDate("pk_usergroup <", value, "pkUsergroup");
            return (Criteria) this;
        }

        public Criteria andPkUsergroupLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pk_usergroup <=", value, "pkUsergroup");
            return (Criteria) this;
        }

        public Criteria andPkUsergroupIn(List<Date> values) {
            addCriterionForJDBCDate("pk_usergroup in", values, "pkUsergroup");
            return (Criteria) this;
        }

        public Criteria andPkUsergroupNotIn(List<Date> values) {
            addCriterionForJDBCDate("pk_usergroup not in", values, "pkUsergroup");
            return (Criteria) this;
        }

        public Criteria andPkUsergroupBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pk_usergroup between", value1, value2, "pkUsergroup");
            return (Criteria) this;
        }

        public Criteria andPkUsergroupNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pk_usergroup not between", value1, value2, "pkUsergroup");
            return (Criteria) this;
        }

        public Criteria andEnablestateIsNull() {
            addCriterion("enablestate is null");
            return (Criteria) this;
        }

        public Criteria andEnablestateIsNotNull() {
            addCriterion("enablestate is not null");
            return (Criteria) this;
        }

        public Criteria andEnablestateEqualTo(Integer value) {
            addCriterion("enablestate =", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateNotEqualTo(Integer value) {
            addCriterion("enablestate <>", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateGreaterThan(Integer value) {
            addCriterion("enablestate >", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("enablestate >=", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateLessThan(Integer value) {
            addCriterion("enablestate <", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateLessThanOrEqualTo(Integer value) {
            addCriterion("enablestate <=", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateIn(List<Integer> values) {
            addCriterion("enablestate in", values, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateNotIn(List<Integer> values) {
            addCriterion("enablestate not in", values, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateBetween(Integer value1, Integer value2) {
            addCriterion("enablestate between", value1, value2, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateNotBetween(Integer value1, Integer value2) {
            addCriterion("enablestate not between", value1, value2, "enablestate");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(Integer value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(Integer value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(Integer value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(Integer value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(Integer value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<Integer> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<Integer> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(Integer value1, Integer value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(Integer value1, Integer value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNull() {
            addCriterion("creationtime is null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNotNull() {
            addCriterion("creationtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeEqualTo(Date value) {
            addCriterion("creationtime =", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotEqualTo(Date value) {
            addCriterion("creationtime <>", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThan(Date value) {
            addCriterion("creationtime >", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creationtime >=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThan(Date value) {
            addCriterion("creationtime <", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThanOrEqualTo(Date value) {
            addCriterion("creationtime <=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIn(List<Date> values) {
            addCriterion("creationtime in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotIn(List<Date> values) {
            addCriterion("creationtime not in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeBetween(Date value1, Date value2) {
            addCriterion("creationtime between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotBetween(Date value1, Date value2) {
            addCriterion("creationtime not between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(Integer value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(Integer value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(Integer value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(Integer value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(Integer value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(Integer value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<Integer> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<Integer> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(Integer value1, Integer value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(Integer value1, Integer value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeIsNull() {
            addCriterion("modifiedtime is null");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeIsNotNull() {
            addCriterion("modifiedtime is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeEqualTo(Date value) {
            addCriterion("modifiedtime =", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotEqualTo(Date value) {
            addCriterion("modifiedtime <>", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeGreaterThan(Date value) {
            addCriterion("modifiedtime >", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modifiedtime >=", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeLessThan(Date value) {
            addCriterion("modifiedtime <", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeLessThanOrEqualTo(Date value) {
            addCriterion("modifiedtime <=", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeIn(List<Date> values) {
            addCriterion("modifiedtime in", values, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotIn(List<Date> values) {
            addCriterion("modifiedtime not in", values, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeBetween(Date value1, Date value2) {
            addCriterion("modifiedtime between", value1, value2, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotBetween(Date value1, Date value2) {
            addCriterion("modifiedtime not between", value1, value2, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andDrIsNull() {
            addCriterion("dr is null");
            return (Criteria) this;
        }

        public Criteria andDrIsNotNull() {
            addCriterion("dr is not null");
            return (Criteria) this;
        }

        public Criteria andDrEqualTo(Integer value) {
            addCriterion("dr =", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotEqualTo(Integer value) {
            addCriterion("dr <>", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrGreaterThan(Integer value) {
            addCriterion("dr >", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrGreaterThanOrEqualTo(Integer value) {
            addCriterion("dr >=", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLessThan(Integer value) {
            addCriterion("dr <", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLessThanOrEqualTo(Integer value) {
            addCriterion("dr <=", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrIn(List<Integer> values) {
            addCriterion("dr in", values, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotIn(List<Integer> values) {
            addCriterion("dr not in", values, "dr");
            return (Criteria) this;
        }

        public Criteria andDrBetween(Integer value1, Integer value2) {
            addCriterion("dr between", value1, value2, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotBetween(Integer value1, Integer value2) {
            addCriterion("dr not between", value1, value2, "dr");
            return (Criteria) this;
        }

        public Criteria andTsIsNull() {
            addCriterion("ts is null");
            return (Criteria) this;
        }

        public Criteria andTsIsNotNull() {
            addCriterion("ts is not null");
            return (Criteria) this;
        }

        public Criteria andTsEqualTo(Date value) {
            addCriterion("ts =", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotEqualTo(Date value) {
            addCriterion("ts <>", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThan(Date value) {
            addCriterion("ts >", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThanOrEqualTo(Date value) {
            addCriterion("ts >=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThan(Date value) {
            addCriterion("ts <", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThanOrEqualTo(Date value) {
            addCriterion("ts <=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsIn(List<Date> values) {
            addCriterion("ts in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotIn(List<Date> values) {
            addCriterion("ts not in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsBetween(Date value1, Date value2) {
            addCriterion("ts between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotBetween(Date value1, Date value2) {
            addCriterion("ts not between", value1, value2, "ts");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}