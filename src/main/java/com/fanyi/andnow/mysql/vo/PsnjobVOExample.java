package com.fanyi.andnow.mysql.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PsnjobVOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PsnjobVOExample() {
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

        public Criteria andPkPsnjobIsNull() {
            addCriterion("pk_psnjob is null");
            return (Criteria) this;
        }

        public Criteria andPkPsnjobIsNotNull() {
            addCriterion("pk_psnjob is not null");
            return (Criteria) this;
        }

        public Criteria andPkPsnjobEqualTo(Integer value) {
            addCriterion("pk_psnjob =", value, "pkPsnjob");
            return (Criteria) this;
        }

        public Criteria andPkPsnjobNotEqualTo(Integer value) {
            addCriterion("pk_psnjob <>", value, "pkPsnjob");
            return (Criteria) this;
        }

        public Criteria andPkPsnjobGreaterThan(Integer value) {
            addCriterion("pk_psnjob >", value, "pkPsnjob");
            return (Criteria) this;
        }

        public Criteria andPkPsnjobGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_psnjob >=", value, "pkPsnjob");
            return (Criteria) this;
        }

        public Criteria andPkPsnjobLessThan(Integer value) {
            addCriterion("pk_psnjob <", value, "pkPsnjob");
            return (Criteria) this;
        }

        public Criteria andPkPsnjobLessThanOrEqualTo(Integer value) {
            addCriterion("pk_psnjob <=", value, "pkPsnjob");
            return (Criteria) this;
        }

        public Criteria andPkPsnjobIn(List<Integer> values) {
            addCriterion("pk_psnjob in", values, "pkPsnjob");
            return (Criteria) this;
        }

        public Criteria andPkPsnjobNotIn(List<Integer> values) {
            addCriterion("pk_psnjob not in", values, "pkPsnjob");
            return (Criteria) this;
        }

        public Criteria andPkPsnjobBetween(Integer value1, Integer value2) {
            addCriterion("pk_psnjob between", value1, value2, "pkPsnjob");
            return (Criteria) this;
        }

        public Criteria andPkPsnjobNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_psnjob not between", value1, value2, "pkPsnjob");
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

        public Criteria andPsncodeIsNull() {
            addCriterion("psncode is null");
            return (Criteria) this;
        }

        public Criteria andPsncodeIsNotNull() {
            addCriterion("psncode is not null");
            return (Criteria) this;
        }

        public Criteria andPsncodeEqualTo(String value) {
            addCriterion("psncode =", value, "psncode");
            return (Criteria) this;
        }

        public Criteria andPsncodeNotEqualTo(String value) {
            addCriterion("psncode <>", value, "psncode");
            return (Criteria) this;
        }

        public Criteria andPsncodeGreaterThan(String value) {
            addCriterion("psncode >", value, "psncode");
            return (Criteria) this;
        }

        public Criteria andPsncodeGreaterThanOrEqualTo(String value) {
            addCriterion("psncode >=", value, "psncode");
            return (Criteria) this;
        }

        public Criteria andPsncodeLessThan(String value) {
            addCriterion("psncode <", value, "psncode");
            return (Criteria) this;
        }

        public Criteria andPsncodeLessThanOrEqualTo(String value) {
            addCriterion("psncode <=", value, "psncode");
            return (Criteria) this;
        }

        public Criteria andPsncodeLike(String value) {
            addCriterion("psncode like", value, "psncode");
            return (Criteria) this;
        }

        public Criteria andPsncodeNotLike(String value) {
            addCriterion("psncode not like", value, "psncode");
            return (Criteria) this;
        }

        public Criteria andPsncodeIn(List<String> values) {
            addCriterion("psncode in", values, "psncode");
            return (Criteria) this;
        }

        public Criteria andPsncodeNotIn(List<String> values) {
            addCriterion("psncode not in", values, "psncode");
            return (Criteria) this;
        }

        public Criteria andPsncodeBetween(String value1, String value2) {
            addCriterion("psncode between", value1, value2, "psncode");
            return (Criteria) this;
        }

        public Criteria andPsncodeNotBetween(String value1, String value2) {
            addCriterion("psncode not between", value1, value2, "psncode");
            return (Criteria) this;
        }

        public Criteria andPkPsnclIsNull() {
            addCriterion("pk_psncl is null");
            return (Criteria) this;
        }

        public Criteria andPkPsnclIsNotNull() {
            addCriterion("pk_psncl is not null");
            return (Criteria) this;
        }

        public Criteria andPkPsnclEqualTo(Integer value) {
            addCriterion("pk_psncl =", value, "pkPsncl");
            return (Criteria) this;
        }

        public Criteria andPkPsnclNotEqualTo(Integer value) {
            addCriterion("pk_psncl <>", value, "pkPsncl");
            return (Criteria) this;
        }

        public Criteria andPkPsnclGreaterThan(Integer value) {
            addCriterion("pk_psncl >", value, "pkPsncl");
            return (Criteria) this;
        }

        public Criteria andPkPsnclGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_psncl >=", value, "pkPsncl");
            return (Criteria) this;
        }

        public Criteria andPkPsnclLessThan(Integer value) {
            addCriterion("pk_psncl <", value, "pkPsncl");
            return (Criteria) this;
        }

        public Criteria andPkPsnclLessThanOrEqualTo(Integer value) {
            addCriterion("pk_psncl <=", value, "pkPsncl");
            return (Criteria) this;
        }

        public Criteria andPkPsnclIn(List<Integer> values) {
            addCriterion("pk_psncl in", values, "pkPsncl");
            return (Criteria) this;
        }

        public Criteria andPkPsnclNotIn(List<Integer> values) {
            addCriterion("pk_psncl not in", values, "pkPsncl");
            return (Criteria) this;
        }

        public Criteria andPkPsnclBetween(Integer value1, Integer value2) {
            addCriterion("pk_psncl between", value1, value2, "pkPsncl");
            return (Criteria) this;
        }

        public Criteria andPkPsnclNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_psncl not between", value1, value2, "pkPsncl");
            return (Criteria) this;
        }

        public Criteria andPkDeptIsNull() {
            addCriterion("pk_dept is null");
            return (Criteria) this;
        }

        public Criteria andPkDeptIsNotNull() {
            addCriterion("pk_dept is not null");
            return (Criteria) this;
        }

        public Criteria andPkDeptEqualTo(Integer value) {
            addCriterion("pk_dept =", value, "pkDept");
            return (Criteria) this;
        }

        public Criteria andPkDeptNotEqualTo(Integer value) {
            addCriterion("pk_dept <>", value, "pkDept");
            return (Criteria) this;
        }

        public Criteria andPkDeptGreaterThan(Integer value) {
            addCriterion("pk_dept >", value, "pkDept");
            return (Criteria) this;
        }

        public Criteria andPkDeptGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_dept >=", value, "pkDept");
            return (Criteria) this;
        }

        public Criteria andPkDeptLessThan(Integer value) {
            addCriterion("pk_dept <", value, "pkDept");
            return (Criteria) this;
        }

        public Criteria andPkDeptLessThanOrEqualTo(Integer value) {
            addCriterion("pk_dept <=", value, "pkDept");
            return (Criteria) this;
        }

        public Criteria andPkDeptIn(List<Integer> values) {
            addCriterion("pk_dept in", values, "pkDept");
            return (Criteria) this;
        }

        public Criteria andPkDeptNotIn(List<Integer> values) {
            addCriterion("pk_dept not in", values, "pkDept");
            return (Criteria) this;
        }

        public Criteria andPkDeptBetween(Integer value1, Integer value2) {
            addCriterion("pk_dept between", value1, value2, "pkDept");
            return (Criteria) this;
        }

        public Criteria andPkDeptNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_dept not between", value1, value2, "pkDept");
            return (Criteria) this;
        }

        public Criteria andStartdutydateIsNull() {
            addCriterion("startdutydate is null");
            return (Criteria) this;
        }

        public Criteria andStartdutydateIsNotNull() {
            addCriterion("startdutydate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdutydateEqualTo(Date value) {
            addCriterionForJDBCDate("startdutydate =", value, "startdutydate");
            return (Criteria) this;
        }

        public Criteria andStartdutydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("startdutydate <>", value, "startdutydate");
            return (Criteria) this;
        }

        public Criteria andStartdutydateGreaterThan(Date value) {
            addCriterionForJDBCDate("startdutydate >", value, "startdutydate");
            return (Criteria) this;
        }

        public Criteria andStartdutydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startdutydate >=", value, "startdutydate");
            return (Criteria) this;
        }

        public Criteria andStartdutydateLessThan(Date value) {
            addCriterionForJDBCDate("startdutydate <", value, "startdutydate");
            return (Criteria) this;
        }

        public Criteria andStartdutydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startdutydate <=", value, "startdutydate");
            return (Criteria) this;
        }

        public Criteria andStartdutydateIn(List<Date> values) {
            addCriterionForJDBCDate("startdutydate in", values, "startdutydate");
            return (Criteria) this;
        }

        public Criteria andStartdutydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("startdutydate not in", values, "startdutydate");
            return (Criteria) this;
        }

        public Criteria andStartdutydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startdutydate between", value1, value2, "startdutydate");
            return (Criteria) this;
        }

        public Criteria andStartdutydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startdutydate not between", value1, value2, "startdutydate");
            return (Criteria) this;
        }

        public Criteria andEnddutydateIsNull() {
            addCriterion("enddutydate is null");
            return (Criteria) this;
        }

        public Criteria andEnddutydateIsNotNull() {
            addCriterion("enddutydate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddutydateEqualTo(Date value) {
            addCriterionForJDBCDate("enddutydate =", value, "enddutydate");
            return (Criteria) this;
        }

        public Criteria andEnddutydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("enddutydate <>", value, "enddutydate");
            return (Criteria) this;
        }

        public Criteria andEnddutydateGreaterThan(Date value) {
            addCriterionForJDBCDate("enddutydate >", value, "enddutydate");
            return (Criteria) this;
        }

        public Criteria andEnddutydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("enddutydate >=", value, "enddutydate");
            return (Criteria) this;
        }

        public Criteria andEnddutydateLessThan(Date value) {
            addCriterionForJDBCDate("enddutydate <", value, "enddutydate");
            return (Criteria) this;
        }

        public Criteria andEnddutydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("enddutydate <=", value, "enddutydate");
            return (Criteria) this;
        }

        public Criteria andEnddutydateIn(List<Date> values) {
            addCriterionForJDBCDate("enddutydate in", values, "enddutydate");
            return (Criteria) this;
        }

        public Criteria andEnddutydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("enddutydate not in", values, "enddutydate");
            return (Criteria) this;
        }

        public Criteria andEnddutydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("enddutydate between", value1, value2, "enddutydate");
            return (Criteria) this;
        }

        public Criteria andEnddutydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("enddutydate not between", value1, value2, "enddutydate");
            return (Criteria) this;
        }

        public Criteria andPkJobIsNull() {
            addCriterion("pk_job is null");
            return (Criteria) this;
        }

        public Criteria andPkJobIsNotNull() {
            addCriterion("pk_job is not null");
            return (Criteria) this;
        }

        public Criteria andPkJobEqualTo(String value) {
            addCriterion("pk_job =", value, "pkJob");
            return (Criteria) this;
        }

        public Criteria andPkJobNotEqualTo(String value) {
            addCriterion("pk_job <>", value, "pkJob");
            return (Criteria) this;
        }

        public Criteria andPkJobGreaterThan(String value) {
            addCriterion("pk_job >", value, "pkJob");
            return (Criteria) this;
        }

        public Criteria andPkJobGreaterThanOrEqualTo(String value) {
            addCriterion("pk_job >=", value, "pkJob");
            return (Criteria) this;
        }

        public Criteria andPkJobLessThan(String value) {
            addCriterion("pk_job <", value, "pkJob");
            return (Criteria) this;
        }

        public Criteria andPkJobLessThanOrEqualTo(String value) {
            addCriterion("pk_job <=", value, "pkJob");
            return (Criteria) this;
        }

        public Criteria andPkJobLike(String value) {
            addCriterion("pk_job like", value, "pkJob");
            return (Criteria) this;
        }

        public Criteria andPkJobNotLike(String value) {
            addCriterion("pk_job not like", value, "pkJob");
            return (Criteria) this;
        }

        public Criteria andPkJobIn(List<String> values) {
            addCriterion("pk_job in", values, "pkJob");
            return (Criteria) this;
        }

        public Criteria andPkJobNotIn(List<String> values) {
            addCriterion("pk_job not in", values, "pkJob");
            return (Criteria) this;
        }

        public Criteria andPkJobBetween(String value1, String value2) {
            addCriterion("pk_job between", value1, value2, "pkJob");
            return (Criteria) this;
        }

        public Criteria andPkJobNotBetween(String value1, String value2) {
            addCriterion("pk_job not between", value1, value2, "pkJob");
            return (Criteria) this;
        }

        public Criteria andJobnameIsNull() {
            addCriterion("jobname is null");
            return (Criteria) this;
        }

        public Criteria andJobnameIsNotNull() {
            addCriterion("jobname is not null");
            return (Criteria) this;
        }

        public Criteria andJobnameEqualTo(String value) {
            addCriterion("jobname =", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotEqualTo(String value) {
            addCriterion("jobname <>", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThan(String value) {
            addCriterion("jobname >", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThanOrEqualTo(String value) {
            addCriterion("jobname >=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThan(String value) {
            addCriterion("jobname <", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThanOrEqualTo(String value) {
            addCriterion("jobname <=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLike(String value) {
            addCriterion("jobname like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotLike(String value) {
            addCriterion("jobname not like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameIn(List<String> values) {
            addCriterion("jobname in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotIn(List<String> values) {
            addCriterion("jobname not in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameBetween(String value1, String value2) {
            addCriterion("jobname between", value1, value2, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotBetween(String value1, String value2) {
            addCriterion("jobname not between", value1, value2, "jobname");
            return (Criteria) this;
        }

        public Criteria andPkPostIsNull() {
            addCriterion("pk_post is null");
            return (Criteria) this;
        }

        public Criteria andPkPostIsNotNull() {
            addCriterion("pk_post is not null");
            return (Criteria) this;
        }

        public Criteria andPkPostEqualTo(Integer value) {
            addCriterion("pk_post =", value, "pkPost");
            return (Criteria) this;
        }

        public Criteria andPkPostNotEqualTo(Integer value) {
            addCriterion("pk_post <>", value, "pkPost");
            return (Criteria) this;
        }

        public Criteria andPkPostGreaterThan(Integer value) {
            addCriterion("pk_post >", value, "pkPost");
            return (Criteria) this;
        }

        public Criteria andPkPostGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_post >=", value, "pkPost");
            return (Criteria) this;
        }

        public Criteria andPkPostLessThan(Integer value) {
            addCriterion("pk_post <", value, "pkPost");
            return (Criteria) this;
        }

        public Criteria andPkPostLessThanOrEqualTo(Integer value) {
            addCriterion("pk_post <=", value, "pkPost");
            return (Criteria) this;
        }

        public Criteria andPkPostIn(List<Integer> values) {
            addCriterion("pk_post in", values, "pkPost");
            return (Criteria) this;
        }

        public Criteria andPkPostNotIn(List<Integer> values) {
            addCriterion("pk_post not in", values, "pkPost");
            return (Criteria) this;
        }

        public Criteria andPkPostBetween(Integer value1, Integer value2) {
            addCriterion("pk_post between", value1, value2, "pkPost");
            return (Criteria) this;
        }

        public Criteria andPkPostNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_post not between", value1, value2, "pkPost");
            return (Criteria) this;
        }

        public Criteria andShoworderIsNull() {
            addCriterion("showorder is null");
            return (Criteria) this;
        }

        public Criteria andShoworderIsNotNull() {
            addCriterion("showorder is not null");
            return (Criteria) this;
        }

        public Criteria andShoworderEqualTo(Integer value) {
            addCriterion("showorder =", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderNotEqualTo(Integer value) {
            addCriterion("showorder <>", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderGreaterThan(Integer value) {
            addCriterion("showorder >", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderGreaterThanOrEqualTo(Integer value) {
            addCriterion("showorder >=", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderLessThan(Integer value) {
            addCriterion("showorder <", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderLessThanOrEqualTo(Integer value) {
            addCriterion("showorder <=", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderIn(List<Integer> values) {
            addCriterion("showorder in", values, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderNotIn(List<Integer> values) {
            addCriterion("showorder not in", values, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderBetween(Integer value1, Integer value2) {
            addCriterion("showorder between", value1, value2, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderNotBetween(Integer value1, Integer value2) {
            addCriterion("showorder not between", value1, value2, "showorder");
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