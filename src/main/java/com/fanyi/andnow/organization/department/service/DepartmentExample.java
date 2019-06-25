package com.fanyi.andnow.organization.department.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartmentExample() {
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

        public Criteria andMencodeIsNull() {
            addCriterion("mencode is null");
            return (Criteria) this;
        }

        public Criteria andMencodeIsNotNull() {
            addCriterion("mencode is not null");
            return (Criteria) this;
        }

        public Criteria andMencodeEqualTo(String value) {
            addCriterion("mencode =", value, "mencode");
            return (Criteria) this;
        }

        public Criteria andMencodeNotEqualTo(String value) {
            addCriterion("mencode <>", value, "mencode");
            return (Criteria) this;
        }

        public Criteria andMencodeGreaterThan(String value) {
            addCriterion("mencode >", value, "mencode");
            return (Criteria) this;
        }

        public Criteria andMencodeGreaterThanOrEqualTo(String value) {
            addCriterion("mencode >=", value, "mencode");
            return (Criteria) this;
        }

        public Criteria andMencodeLessThan(String value) {
            addCriterion("mencode <", value, "mencode");
            return (Criteria) this;
        }

        public Criteria andMencodeLessThanOrEqualTo(String value) {
            addCriterion("mencode <=", value, "mencode");
            return (Criteria) this;
        }

        public Criteria andMencodeLike(String value) {
            addCriterion("mencode like", value, "mencode");
            return (Criteria) this;
        }

        public Criteria andMencodeNotLike(String value) {
            addCriterion("mencode not like", value, "mencode");
            return (Criteria) this;
        }

        public Criteria andMencodeIn(List<String> values) {
            addCriterion("mencode in", values, "mencode");
            return (Criteria) this;
        }

        public Criteria andMencodeNotIn(List<String> values) {
            addCriterion("mencode not in", values, "mencode");
            return (Criteria) this;
        }

        public Criteria andMencodeBetween(String value1, String value2) {
            addCriterion("mencode between", value1, value2, "mencode");
            return (Criteria) this;
        }

        public Criteria andMencodeNotBetween(String value1, String value2) {
            addCriterion("mencode not between", value1, value2, "mencode");
            return (Criteria) this;
        }

        public Criteria andInnercodeIsNull() {
            addCriterion("innercode is null");
            return (Criteria) this;
        }

        public Criteria andInnercodeIsNotNull() {
            addCriterion("innercode is not null");
            return (Criteria) this;
        }

        public Criteria andInnercodeEqualTo(String value) {
            addCriterion("innercode =", value, "innercode");
            return (Criteria) this;
        }

        public Criteria andInnercodeNotEqualTo(String value) {
            addCriterion("innercode <>", value, "innercode");
            return (Criteria) this;
        }

        public Criteria andInnercodeGreaterThan(String value) {
            addCriterion("innercode >", value, "innercode");
            return (Criteria) this;
        }

        public Criteria andInnercodeGreaterThanOrEqualTo(String value) {
            addCriterion("innercode >=", value, "innercode");
            return (Criteria) this;
        }

        public Criteria andInnercodeLessThan(String value) {
            addCriterion("innercode <", value, "innercode");
            return (Criteria) this;
        }

        public Criteria andInnercodeLessThanOrEqualTo(String value) {
            addCriterion("innercode <=", value, "innercode");
            return (Criteria) this;
        }

        public Criteria andInnercodeLike(String value) {
            addCriterion("innercode like", value, "innercode");
            return (Criteria) this;
        }

        public Criteria andInnercodeNotLike(String value) {
            addCriterion("innercode not like", value, "innercode");
            return (Criteria) this;
        }

        public Criteria andInnercodeIn(List<String> values) {
            addCriterion("innercode in", values, "innercode");
            return (Criteria) this;
        }

        public Criteria andInnercodeNotIn(List<String> values) {
            addCriterion("innercode not in", values, "innercode");
            return (Criteria) this;
        }

        public Criteria andInnercodeBetween(String value1, String value2) {
            addCriterion("innercode between", value1, value2, "innercode");
            return (Criteria) this;
        }

        public Criteria andInnercodeNotBetween(String value1, String value2) {
            addCriterion("innercode not between", value1, value2, "innercode");
            return (Criteria) this;
        }

        public Criteria andShortnameIsNull() {
            addCriterion("shortname is null");
            return (Criteria) this;
        }

        public Criteria andShortnameIsNotNull() {
            addCriterion("shortname is not null");
            return (Criteria) this;
        }

        public Criteria andShortnameEqualTo(String value) {
            addCriterion("shortname =", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotEqualTo(String value) {
            addCriterion("shortname <>", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThan(String value) {
            addCriterion("shortname >", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThanOrEqualTo(String value) {
            addCriterion("shortname >=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThan(String value) {
            addCriterion("shortname <", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThanOrEqualTo(String value) {
            addCriterion("shortname <=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLike(String value) {
            addCriterion("shortname like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotLike(String value) {
            addCriterion("shortname not like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameIn(List<String> values) {
            addCriterion("shortname in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotIn(List<String> values) {
            addCriterion("shortname not in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameBetween(String value1, String value2) {
            addCriterion("shortname between", value1, value2, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotBetween(String value1, String value2) {
            addCriterion("shortname not between", value1, value2, "shortname");
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

        public Criteria andPkSuperiorIsNull() {
            addCriterion("pk_superior is null");
            return (Criteria) this;
        }

        public Criteria andPkSuperiorIsNotNull() {
            addCriterion("pk_superior is not null");
            return (Criteria) this;
        }

        public Criteria andPkSuperiorEqualTo(Integer value) {
            addCriterion("pk_superior =", value, "pkSuperior");
            return (Criteria) this;
        }

        public Criteria andPkSuperiorNotEqualTo(Integer value) {
            addCriterion("pk_superior <>", value, "pkSuperior");
            return (Criteria) this;
        }

        public Criteria andPkSuperiorGreaterThan(Integer value) {
            addCriterion("pk_superior >", value, "pkSuperior");
            return (Criteria) this;
        }

        public Criteria andPkSuperiorGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_superior >=", value, "pkSuperior");
            return (Criteria) this;
        }

        public Criteria andPkSuperiorLessThan(Integer value) {
            addCriterion("pk_superior <", value, "pkSuperior");
            return (Criteria) this;
        }

        public Criteria andPkSuperiorLessThanOrEqualTo(Integer value) {
            addCriterion("pk_superior <=", value, "pkSuperior");
            return (Criteria) this;
        }

        public Criteria andPkSuperiorIn(List<Integer> values) {
            addCriterion("pk_superior in", values, "pkSuperior");
            return (Criteria) this;
        }

        public Criteria andPkSuperiorNotIn(List<Integer> values) {
            addCriterion("pk_superior not in", values, "pkSuperior");
            return (Criteria) this;
        }

        public Criteria andPkSuperiorBetween(Integer value1, Integer value2) {
            addCriterion("pk_superior between", value1, value2, "pkSuperior");
            return (Criteria) this;
        }

        public Criteria andPkSuperiorNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_superior not between", value1, value2, "pkSuperior");
            return (Criteria) this;
        }

        public Criteria andDepttypeIsNull() {
            addCriterion("depttype is null");
            return (Criteria) this;
        }

        public Criteria andDepttypeIsNotNull() {
            addCriterion("depttype is not null");
            return (Criteria) this;
        }

        public Criteria andDepttypeEqualTo(Integer value) {
            addCriterion("depttype =", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeNotEqualTo(Integer value) {
            addCriterion("depttype <>", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeGreaterThan(Integer value) {
            addCriterion("depttype >", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("depttype >=", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeLessThan(Integer value) {
            addCriterion("depttype <", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeLessThanOrEqualTo(Integer value) {
            addCriterion("depttype <=", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeIn(List<Integer> values) {
            addCriterion("depttype in", values, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeNotIn(List<Integer> values) {
            addCriterion("depttype not in", values, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeBetween(Integer value1, Integer value2) {
            addCriterion("depttype between", value1, value2, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("depttype not between", value1, value2, "depttype");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNull() {
            addCriterion("principal is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNotNull() {
            addCriterion("principal is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalEqualTo(Integer value) {
            addCriterion("principal =", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotEqualTo(Integer value) {
            addCriterion("principal <>", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThan(Integer value) {
            addCriterion("principal >", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThanOrEqualTo(Integer value) {
            addCriterion("principal >=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThan(Integer value) {
            addCriterion("principal <", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThanOrEqualTo(Integer value) {
            addCriterion("principal <=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalIn(List<Integer> values) {
            addCriterion("principal in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotIn(List<Integer> values) {
            addCriterion("principal not in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalBetween(Integer value1, Integer value2) {
            addCriterion("principal between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotBetween(Integer value1, Integer value2) {
            addCriterion("principal not between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andCountryareaIsNull() {
            addCriterion("countryarea is null");
            return (Criteria) this;
        }

        public Criteria andCountryareaIsNotNull() {
            addCriterion("countryarea is not null");
            return (Criteria) this;
        }

        public Criteria andCountryareaEqualTo(String value) {
            addCriterion("countryarea =", value, "countryarea");
            return (Criteria) this;
        }

        public Criteria andCountryareaNotEqualTo(String value) {
            addCriterion("countryarea <>", value, "countryarea");
            return (Criteria) this;
        }

        public Criteria andCountryareaGreaterThan(String value) {
            addCriterion("countryarea >", value, "countryarea");
            return (Criteria) this;
        }

        public Criteria andCountryareaGreaterThanOrEqualTo(String value) {
            addCriterion("countryarea >=", value, "countryarea");
            return (Criteria) this;
        }

        public Criteria andCountryareaLessThan(String value) {
            addCriterion("countryarea <", value, "countryarea");
            return (Criteria) this;
        }

        public Criteria andCountryareaLessThanOrEqualTo(String value) {
            addCriterion("countryarea <=", value, "countryarea");
            return (Criteria) this;
        }

        public Criteria andCountryareaLike(String value) {
            addCriterion("countryarea like", value, "countryarea");
            return (Criteria) this;
        }

        public Criteria andCountryareaNotLike(String value) {
            addCriterion("countryarea not like", value, "countryarea");
            return (Criteria) this;
        }

        public Criteria andCountryareaIn(List<String> values) {
            addCriterion("countryarea in", values, "countryarea");
            return (Criteria) this;
        }

        public Criteria andCountryareaNotIn(List<String> values) {
            addCriterion("countryarea not in", values, "countryarea");
            return (Criteria) this;
        }

        public Criteria andCountryareaBetween(String value1, String value2) {
            addCriterion("countryarea between", value1, value2, "countryarea");
            return (Criteria) this;
        }

        public Criteria andCountryareaNotBetween(String value1, String value2) {
            addCriterion("countryarea not between", value1, value2, "countryarea");
            return (Criteria) this;
        }

        public Criteria andEstablishdateIsNull() {
            addCriterion("establishdate is null");
            return (Criteria) this;
        }

        public Criteria andEstablishdateIsNotNull() {
            addCriterion("establishdate is not null");
            return (Criteria) this;
        }

        public Criteria andEstablishdateEqualTo(Date value) {
            addCriterion("establishdate =", value, "establishdate");
            return (Criteria) this;
        }

        public Criteria andEstablishdateNotEqualTo(Date value) {
            addCriterion("establishdate <>", value, "establishdate");
            return (Criteria) this;
        }

        public Criteria andEstablishdateGreaterThan(Date value) {
            addCriterion("establishdate >", value, "establishdate");
            return (Criteria) this;
        }

        public Criteria andEstablishdateGreaterThanOrEqualTo(Date value) {
            addCriterion("establishdate >=", value, "establishdate");
            return (Criteria) this;
        }

        public Criteria andEstablishdateLessThan(Date value) {
            addCriterion("establishdate <", value, "establishdate");
            return (Criteria) this;
        }

        public Criteria andEstablishdateLessThanOrEqualTo(Date value) {
            addCriterion("establishdate <=", value, "establishdate");
            return (Criteria) this;
        }

        public Criteria andEstablishdateIn(List<Date> values) {
            addCriterion("establishdate in", values, "establishdate");
            return (Criteria) this;
        }

        public Criteria andEstablishdateNotIn(List<Date> values) {
            addCriterion("establishdate not in", values, "establishdate");
            return (Criteria) this;
        }

        public Criteria andEstablishdateBetween(Date value1, Date value2) {
            addCriterion("establishdate between", value1, value2, "establishdate");
            return (Criteria) this;
        }

        public Criteria andEstablishdateNotBetween(Date value1, Date value2) {
            addCriterion("establishdate not between", value1, value2, "establishdate");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andEnameIsNull() {
            addCriterion("ename is null");
            return (Criteria) this;
        }

        public Criteria andEnameIsNotNull() {
            addCriterion("ename is not null");
            return (Criteria) this;
        }

        public Criteria andEnameEqualTo(String value) {
            addCriterion("ename =", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotEqualTo(String value) {
            addCriterion("ename <>", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThan(String value) {
            addCriterion("ename >", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThanOrEqualTo(String value) {
            addCriterion("ename >=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThan(String value) {
            addCriterion("ename <", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThanOrEqualTo(String value) {
            addCriterion("ename <=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLike(String value) {
            addCriterion("ename like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotLike(String value) {
            addCriterion("ename not like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameIn(List<String> values) {
            addCriterion("ename in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotIn(List<String> values) {
            addCriterion("ename not in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameBetween(String value1, String value2) {
            addCriterion("ename between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotBetween(String value1, String value2) {
            addCriterion("ename not between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andCancledateIsNull() {
            addCriterion("cancledate is null");
            return (Criteria) this;
        }

        public Criteria andCancledateIsNotNull() {
            addCriterion("cancledate is not null");
            return (Criteria) this;
        }

        public Criteria andCancledateEqualTo(Date value) {
            addCriterion("cancledate =", value, "cancledate");
            return (Criteria) this;
        }

        public Criteria andCancledateNotEqualTo(Date value) {
            addCriterion("cancledate <>", value, "cancledate");
            return (Criteria) this;
        }

        public Criteria andCancledateGreaterThan(Date value) {
            addCriterion("cancledate >", value, "cancledate");
            return (Criteria) this;
        }

        public Criteria andCancledateGreaterThanOrEqualTo(Date value) {
            addCriterion("cancledate >=", value, "cancledate");
            return (Criteria) this;
        }

        public Criteria andCancledateLessThan(Date value) {
            addCriterion("cancledate <", value, "cancledate");
            return (Criteria) this;
        }

        public Criteria andCancledateLessThanOrEqualTo(Date value) {
            addCriterion("cancledate <=", value, "cancledate");
            return (Criteria) this;
        }

        public Criteria andCancledateIn(List<Date> values) {
            addCriterion("cancledate in", values, "cancledate");
            return (Criteria) this;
        }

        public Criteria andCancledateNotIn(List<Date> values) {
            addCriterion("cancledate not in", values, "cancledate");
            return (Criteria) this;
        }

        public Criteria andCancledateBetween(Date value1, Date value2) {
            addCriterion("cancledate between", value1, value2, "cancledate");
            return (Criteria) this;
        }

        public Criteria andCancledateNotBetween(Date value1, Date value2) {
            addCriterion("cancledate not between", value1, value2, "cancledate");
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

        public Criteria andEnablestateEqualTo(Byte value) {
            addCriterion("enablestate =", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateNotEqualTo(Byte value) {
            addCriterion("enablestate <>", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateGreaterThan(Byte value) {
            addCriterion("enablestate >", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateGreaterThanOrEqualTo(Byte value) {
            addCriterion("enablestate >=", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateLessThan(Byte value) {
            addCriterion("enablestate <", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateLessThanOrEqualTo(Byte value) {
            addCriterion("enablestate <=", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateIn(List<Byte> values) {
            addCriterion("enablestate in", values, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateNotIn(List<Byte> values) {
            addCriterion("enablestate not in", values, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateBetween(Byte value1, Byte value2) {
            addCriterion("enablestate between", value1, value2, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateNotBetween(Byte value1, Byte value2) {
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

        public Criteria andDrEqualTo(Byte value) {
            addCriterion("dr =", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotEqualTo(Byte value) {
            addCriterion("dr <>", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrGreaterThan(Byte value) {
            addCriterion("dr >", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrGreaterThanOrEqualTo(Byte value) {
            addCriterion("dr >=", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLessThan(Byte value) {
            addCriterion("dr <", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLessThanOrEqualTo(Byte value) {
            addCriterion("dr <=", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrIn(List<Byte> values) {
            addCriterion("dr in", values, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotIn(List<Byte> values) {
            addCriterion("dr not in", values, "dr");
            return (Criteria) this;
        }

        public Criteria andDrBetween(Byte value1, Byte value2) {
            addCriterion("dr between", value1, value2, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotBetween(Byte value1, Byte value2) {
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