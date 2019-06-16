package com.fanyi.andnow.material.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MaterialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaterialExample() {
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

        public Criteria andPkMaterialIsNull() {
            addCriterion("pk_material is null");
            return (Criteria) this;
        }

        public Criteria andPkMaterialIsNotNull() {
            addCriterion("pk_material is not null");
            return (Criteria) this;
        }

        public Criteria andPkMaterialEqualTo(Integer value) {
            addCriterion("pk_material =", value, "pkMaterial");
            return (Criteria) this;
        }

        public Criteria andPkMaterialNotEqualTo(Integer value) {
            addCriterion("pk_material <>", value, "pkMaterial");
            return (Criteria) this;
        }

        public Criteria andPkMaterialGreaterThan(Integer value) {
            addCriterion("pk_material >", value, "pkMaterial");
            return (Criteria) this;
        }

        public Criteria andPkMaterialGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_material >=", value, "pkMaterial");
            return (Criteria) this;
        }

        public Criteria andPkMaterialLessThan(Integer value) {
            addCriterion("pk_material <", value, "pkMaterial");
            return (Criteria) this;
        }

        public Criteria andPkMaterialLessThanOrEqualTo(Integer value) {
            addCriterion("pk_material <=", value, "pkMaterial");
            return (Criteria) this;
        }

        public Criteria andPkMaterialIn(List<Integer> values) {
            addCriterion("pk_material in", values, "pkMaterial");
            return (Criteria) this;
        }

        public Criteria andPkMaterialNotIn(List<Integer> values) {
            addCriterion("pk_material not in", values, "pkMaterial");
            return (Criteria) this;
        }

        public Criteria andPkMaterialBetween(Integer value1, Integer value2) {
            addCriterion("pk_material between", value1, value2, "pkMaterial");
            return (Criteria) this;
        }

        public Criteria andPkMaterialNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_material not between", value1, value2, "pkMaterial");
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

        public Criteria andSpecificationIsNull() {
            addCriterion("specification is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNotNull() {
            addCriterion("specification is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationEqualTo(String value) {
            addCriterion("specification =", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotEqualTo(String value) {
            addCriterion("specification <>", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThan(String value) {
            addCriterion("specification >", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("specification >=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThan(String value) {
            addCriterion("specification <", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThanOrEqualTo(String value) {
            addCriterion("specification <=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLike(String value) {
            addCriterion("specification like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotLike(String value) {
            addCriterion("specification not like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationIn(List<String> values) {
            addCriterion("specification in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotIn(List<String> values) {
            addCriterion("specification not in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationBetween(String value1, String value2) {
            addCriterion("specification between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotBetween(String value1, String value2) {
            addCriterion("specification not between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andMnecodeIsNull() {
            addCriterion("mnecode is null");
            return (Criteria) this;
        }

        public Criteria andMnecodeIsNotNull() {
            addCriterion("mnecode is not null");
            return (Criteria) this;
        }

        public Criteria andMnecodeEqualTo(String value) {
            addCriterion("mnecode =", value, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeNotEqualTo(String value) {
            addCriterion("mnecode <>", value, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeGreaterThan(String value) {
            addCriterion("mnecode >", value, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeGreaterThanOrEqualTo(String value) {
            addCriterion("mnecode >=", value, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeLessThan(String value) {
            addCriterion("mnecode <", value, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeLessThanOrEqualTo(String value) {
            addCriterion("mnecode <=", value, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeLike(String value) {
            addCriterion("mnecode like", value, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeNotLike(String value) {
            addCriterion("mnecode not like", value, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeIn(List<String> values) {
            addCriterion("mnecode in", values, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeNotIn(List<String> values) {
            addCriterion("mnecode not in", values, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeBetween(String value1, String value2) {
            addCriterion("mnecode between", value1, value2, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeNotBetween(String value1, String value2) {
            addCriterion("mnecode not between", value1, value2, "mnecode");
            return (Criteria) this;
        }

        public Criteria andPkMeasdocIsNull() {
            addCriterion("pk_measdoc is null");
            return (Criteria) this;
        }

        public Criteria andPkMeasdocIsNotNull() {
            addCriterion("pk_measdoc is not null");
            return (Criteria) this;
        }

        public Criteria andPkMeasdocEqualTo(Integer value) {
            addCriterion("pk_measdoc =", value, "pkMeasdoc");
            return (Criteria) this;
        }

        public Criteria andPkMeasdocNotEqualTo(Integer value) {
            addCriterion("pk_measdoc <>", value, "pkMeasdoc");
            return (Criteria) this;
        }

        public Criteria andPkMeasdocGreaterThan(Integer value) {
            addCriterion("pk_measdoc >", value, "pkMeasdoc");
            return (Criteria) this;
        }

        public Criteria andPkMeasdocGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_measdoc >=", value, "pkMeasdoc");
            return (Criteria) this;
        }

        public Criteria andPkMeasdocLessThan(Integer value) {
            addCriterion("pk_measdoc <", value, "pkMeasdoc");
            return (Criteria) this;
        }

        public Criteria andPkMeasdocLessThanOrEqualTo(Integer value) {
            addCriterion("pk_measdoc <=", value, "pkMeasdoc");
            return (Criteria) this;
        }

        public Criteria andPkMeasdocIn(List<Integer> values) {
            addCriterion("pk_measdoc in", values, "pkMeasdoc");
            return (Criteria) this;
        }

        public Criteria andPkMeasdocNotIn(List<Integer> values) {
            addCriterion("pk_measdoc not in", values, "pkMeasdoc");
            return (Criteria) this;
        }

        public Criteria andPkMeasdocBetween(Integer value1, Integer value2) {
            addCriterion("pk_measdoc between", value1, value2, "pkMeasdoc");
            return (Criteria) this;
        }

        public Criteria andPkMeasdocNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_measdoc not between", value1, value2, "pkMeasdoc");
            return (Criteria) this;
        }

        public Criteria andPkMarbasclassIsNull() {
            addCriterion("pk_marbasclass is null");
            return (Criteria) this;
        }

        public Criteria andPkMarbasclassIsNotNull() {
            addCriterion("pk_marbasclass is not null");
            return (Criteria) this;
        }

        public Criteria andPkMarbasclassEqualTo(Integer value) {
            addCriterion("pk_marbasclass =", value, "pkMarbasclass");
            return (Criteria) this;
        }

        public Criteria andPkMarbasclassNotEqualTo(Integer value) {
            addCriterion("pk_marbasclass <>", value, "pkMarbasclass");
            return (Criteria) this;
        }

        public Criteria andPkMarbasclassGreaterThan(Integer value) {
            addCriterion("pk_marbasclass >", value, "pkMarbasclass");
            return (Criteria) this;
        }

        public Criteria andPkMarbasclassGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_marbasclass >=", value, "pkMarbasclass");
            return (Criteria) this;
        }

        public Criteria andPkMarbasclassLessThan(Integer value) {
            addCriterion("pk_marbasclass <", value, "pkMarbasclass");
            return (Criteria) this;
        }

        public Criteria andPkMarbasclassLessThanOrEqualTo(Integer value) {
            addCriterion("pk_marbasclass <=", value, "pkMarbasclass");
            return (Criteria) this;
        }

        public Criteria andPkMarbasclassIn(List<Integer> values) {
            addCriterion("pk_marbasclass in", values, "pkMarbasclass");
            return (Criteria) this;
        }

        public Criteria andPkMarbasclassNotIn(List<Integer> values) {
            addCriterion("pk_marbasclass not in", values, "pkMarbasclass");
            return (Criteria) this;
        }

        public Criteria andPkMarbasclassBetween(Integer value1, Integer value2) {
            addCriterion("pk_marbasclass between", value1, value2, "pkMarbasclass");
            return (Criteria) this;
        }

        public Criteria andPkMarbasclassNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_marbasclass not between", value1, value2, "pkMarbasclass");
            return (Criteria) this;
        }

        public Criteria andPkProdlineIsNull() {
            addCriterion("pk_prodline is null");
            return (Criteria) this;
        }

        public Criteria andPkProdlineIsNotNull() {
            addCriterion("pk_prodline is not null");
            return (Criteria) this;
        }

        public Criteria andPkProdlineEqualTo(Integer value) {
            addCriterion("pk_prodline =", value, "pkProdline");
            return (Criteria) this;
        }

        public Criteria andPkProdlineNotEqualTo(Integer value) {
            addCriterion("pk_prodline <>", value, "pkProdline");
            return (Criteria) this;
        }

        public Criteria andPkProdlineGreaterThan(Integer value) {
            addCriterion("pk_prodline >", value, "pkProdline");
            return (Criteria) this;
        }

        public Criteria andPkProdlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_prodline >=", value, "pkProdline");
            return (Criteria) this;
        }

        public Criteria andPkProdlineLessThan(Integer value) {
            addCriterion("pk_prodline <", value, "pkProdline");
            return (Criteria) this;
        }

        public Criteria andPkProdlineLessThanOrEqualTo(Integer value) {
            addCriterion("pk_prodline <=", value, "pkProdline");
            return (Criteria) this;
        }

        public Criteria andPkProdlineIn(List<Integer> values) {
            addCriterion("pk_prodline in", values, "pkProdline");
            return (Criteria) this;
        }

        public Criteria andPkProdlineNotIn(List<Integer> values) {
            addCriterion("pk_prodline not in", values, "pkProdline");
            return (Criteria) this;
        }

        public Criteria andPkProdlineBetween(Integer value1, Integer value2) {
            addCriterion("pk_prodline between", value1, value2, "pkProdline");
            return (Criteria) this;
        }

        public Criteria andPkProdlineNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_prodline not between", value1, value2, "pkProdline");
            return (Criteria) this;
        }

        public Criteria andPkBrandIsNull() {
            addCriterion("pk_brand is null");
            return (Criteria) this;
        }

        public Criteria andPkBrandIsNotNull() {
            addCriterion("pk_brand is not null");
            return (Criteria) this;
        }

        public Criteria andPkBrandEqualTo(Integer value) {
            addCriterion("pk_brand =", value, "pkBrand");
            return (Criteria) this;
        }

        public Criteria andPkBrandNotEqualTo(Integer value) {
            addCriterion("pk_brand <>", value, "pkBrand");
            return (Criteria) this;
        }

        public Criteria andPkBrandGreaterThan(Integer value) {
            addCriterion("pk_brand >", value, "pkBrand");
            return (Criteria) this;
        }

        public Criteria andPkBrandGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_brand >=", value, "pkBrand");
            return (Criteria) this;
        }

        public Criteria andPkBrandLessThan(Integer value) {
            addCriterion("pk_brand <", value, "pkBrand");
            return (Criteria) this;
        }

        public Criteria andPkBrandLessThanOrEqualTo(Integer value) {
            addCriterion("pk_brand <=", value, "pkBrand");
            return (Criteria) this;
        }

        public Criteria andPkBrandIn(List<Integer> values) {
            addCriterion("pk_brand in", values, "pkBrand");
            return (Criteria) this;
        }

        public Criteria andPkBrandNotIn(List<Integer> values) {
            addCriterion("pk_brand not in", values, "pkBrand");
            return (Criteria) this;
        }

        public Criteria andPkBrandBetween(Integer value1, Integer value2) {
            addCriterion("pk_brand between", value1, value2, "pkBrand");
            return (Criteria) this;
        }

        public Criteria andPkBrandNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_brand not between", value1, value2, "pkBrand");
            return (Criteria) this;
        }

        public Criteria andDiscountflagIsNull() {
            addCriterion("discountflag is null");
            return (Criteria) this;
        }

        public Criteria andDiscountflagIsNotNull() {
            addCriterion("discountflag is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountflagEqualTo(Double value) {
            addCriterion("discountflag =", value, "discountflag");
            return (Criteria) this;
        }

        public Criteria andDiscountflagNotEqualTo(Double value) {
            addCriterion("discountflag <>", value, "discountflag");
            return (Criteria) this;
        }

        public Criteria andDiscountflagGreaterThan(Double value) {
            addCriterion("discountflag >", value, "discountflag");
            return (Criteria) this;
        }

        public Criteria andDiscountflagGreaterThanOrEqualTo(Double value) {
            addCriterion("discountflag >=", value, "discountflag");
            return (Criteria) this;
        }

        public Criteria andDiscountflagLessThan(Double value) {
            addCriterion("discountflag <", value, "discountflag");
            return (Criteria) this;
        }

        public Criteria andDiscountflagLessThanOrEqualTo(Double value) {
            addCriterion("discountflag <=", value, "discountflag");
            return (Criteria) this;
        }

        public Criteria andDiscountflagIn(List<Double> values) {
            addCriterion("discountflag in", values, "discountflag");
            return (Criteria) this;
        }

        public Criteria andDiscountflagNotIn(List<Double> values) {
            addCriterion("discountflag not in", values, "discountflag");
            return (Criteria) this;
        }

        public Criteria andDiscountflagBetween(Double value1, Double value2) {
            addCriterion("discountflag between", value1, value2, "discountflag");
            return (Criteria) this;
        }

        public Criteria andDiscountflagNotBetween(Double value1, Double value2) {
            addCriterion("discountflag not between", value1, value2, "discountflag");
            return (Criteria) this;
        }

        public Criteria andUnitlenthIsNull() {
            addCriterion("unitlenth is null");
            return (Criteria) this;
        }

        public Criteria andUnitlenthIsNotNull() {
            addCriterion("unitlenth is not null");
            return (Criteria) this;
        }

        public Criteria andUnitlenthEqualTo(Double value) {
            addCriterion("unitlenth =", value, "unitlenth");
            return (Criteria) this;
        }

        public Criteria andUnitlenthNotEqualTo(Double value) {
            addCriterion("unitlenth <>", value, "unitlenth");
            return (Criteria) this;
        }

        public Criteria andUnitlenthGreaterThan(Double value) {
            addCriterion("unitlenth >", value, "unitlenth");
            return (Criteria) this;
        }

        public Criteria andUnitlenthGreaterThanOrEqualTo(Double value) {
            addCriterion("unitlenth >=", value, "unitlenth");
            return (Criteria) this;
        }

        public Criteria andUnitlenthLessThan(Double value) {
            addCriterion("unitlenth <", value, "unitlenth");
            return (Criteria) this;
        }

        public Criteria andUnitlenthLessThanOrEqualTo(Double value) {
            addCriterion("unitlenth <=", value, "unitlenth");
            return (Criteria) this;
        }

        public Criteria andUnitlenthIn(List<Double> values) {
            addCriterion("unitlenth in", values, "unitlenth");
            return (Criteria) this;
        }

        public Criteria andUnitlenthNotIn(List<Double> values) {
            addCriterion("unitlenth not in", values, "unitlenth");
            return (Criteria) this;
        }

        public Criteria andUnitlenthBetween(Double value1, Double value2) {
            addCriterion("unitlenth between", value1, value2, "unitlenth");
            return (Criteria) this;
        }

        public Criteria andUnitlenthNotBetween(Double value1, Double value2) {
            addCriterion("unitlenth not between", value1, value2, "unitlenth");
            return (Criteria) this;
        }

        public Criteria andUnitheightIsNull() {
            addCriterion("unitheight is null");
            return (Criteria) this;
        }

        public Criteria andUnitheightIsNotNull() {
            addCriterion("unitheight is not null");
            return (Criteria) this;
        }

        public Criteria andUnitheightEqualTo(Double value) {
            addCriterion("unitheight =", value, "unitheight");
            return (Criteria) this;
        }

        public Criteria andUnitheightNotEqualTo(Double value) {
            addCriterion("unitheight <>", value, "unitheight");
            return (Criteria) this;
        }

        public Criteria andUnitheightGreaterThan(Double value) {
            addCriterion("unitheight >", value, "unitheight");
            return (Criteria) this;
        }

        public Criteria andUnitheightGreaterThanOrEqualTo(Double value) {
            addCriterion("unitheight >=", value, "unitheight");
            return (Criteria) this;
        }

        public Criteria andUnitheightLessThan(Double value) {
            addCriterion("unitheight <", value, "unitheight");
            return (Criteria) this;
        }

        public Criteria andUnitheightLessThanOrEqualTo(Double value) {
            addCriterion("unitheight <=", value, "unitheight");
            return (Criteria) this;
        }

        public Criteria andUnitheightIn(List<Double> values) {
            addCriterion("unitheight in", values, "unitheight");
            return (Criteria) this;
        }

        public Criteria andUnitheightNotIn(List<Double> values) {
            addCriterion("unitheight not in", values, "unitheight");
            return (Criteria) this;
        }

        public Criteria andUnitheightBetween(Double value1, Double value2) {
            addCriterion("unitheight between", value1, value2, "unitheight");
            return (Criteria) this;
        }

        public Criteria andUnitheightNotBetween(Double value1, Double value2) {
            addCriterion("unitheight not between", value1, value2, "unitheight");
            return (Criteria) this;
        }

        public Criteria andUnitwidthIsNull() {
            addCriterion("unitwidth is null");
            return (Criteria) this;
        }

        public Criteria andUnitwidthIsNotNull() {
            addCriterion("unitwidth is not null");
            return (Criteria) this;
        }

        public Criteria andUnitwidthEqualTo(Double value) {
            addCriterion("unitwidth =", value, "unitwidth");
            return (Criteria) this;
        }

        public Criteria andUnitwidthNotEqualTo(Double value) {
            addCriterion("unitwidth <>", value, "unitwidth");
            return (Criteria) this;
        }

        public Criteria andUnitwidthGreaterThan(Double value) {
            addCriterion("unitwidth >", value, "unitwidth");
            return (Criteria) this;
        }

        public Criteria andUnitwidthGreaterThanOrEqualTo(Double value) {
            addCriterion("unitwidth >=", value, "unitwidth");
            return (Criteria) this;
        }

        public Criteria andUnitwidthLessThan(Double value) {
            addCriterion("unitwidth <", value, "unitwidth");
            return (Criteria) this;
        }

        public Criteria andUnitwidthLessThanOrEqualTo(Double value) {
            addCriterion("unitwidth <=", value, "unitwidth");
            return (Criteria) this;
        }

        public Criteria andUnitwidthIn(List<Double> values) {
            addCriterion("unitwidth in", values, "unitwidth");
            return (Criteria) this;
        }

        public Criteria andUnitwidthNotIn(List<Double> values) {
            addCriterion("unitwidth not in", values, "unitwidth");
            return (Criteria) this;
        }

        public Criteria andUnitwidthBetween(Double value1, Double value2) {
            addCriterion("unitwidth between", value1, value2, "unitwidth");
            return (Criteria) this;
        }

        public Criteria andUnitwidthNotBetween(Double value1, Double value2) {
            addCriterion("unitwidth not between", value1, value2, "unitwidth");
            return (Criteria) this;
        }

        public Criteria andUnitvolumeIsNull() {
            addCriterion("unitvolume is null");
            return (Criteria) this;
        }

        public Criteria andUnitvolumeIsNotNull() {
            addCriterion("unitvolume is not null");
            return (Criteria) this;
        }

        public Criteria andUnitvolumeEqualTo(Double value) {
            addCriterion("unitvolume =", value, "unitvolume");
            return (Criteria) this;
        }

        public Criteria andUnitvolumeNotEqualTo(Double value) {
            addCriterion("unitvolume <>", value, "unitvolume");
            return (Criteria) this;
        }

        public Criteria andUnitvolumeGreaterThan(Double value) {
            addCriterion("unitvolume >", value, "unitvolume");
            return (Criteria) this;
        }

        public Criteria andUnitvolumeGreaterThanOrEqualTo(Double value) {
            addCriterion("unitvolume >=", value, "unitvolume");
            return (Criteria) this;
        }

        public Criteria andUnitvolumeLessThan(Double value) {
            addCriterion("unitvolume <", value, "unitvolume");
            return (Criteria) this;
        }

        public Criteria andUnitvolumeLessThanOrEqualTo(Double value) {
            addCriterion("unitvolume <=", value, "unitvolume");
            return (Criteria) this;
        }

        public Criteria andUnitvolumeIn(List<Double> values) {
            addCriterion("unitvolume in", values, "unitvolume");
            return (Criteria) this;
        }

        public Criteria andUnitvolumeNotIn(List<Double> values) {
            addCriterion("unitvolume not in", values, "unitvolume");
            return (Criteria) this;
        }

        public Criteria andUnitvolumeBetween(Double value1, Double value2) {
            addCriterion("unitvolume between", value1, value2, "unitvolume");
            return (Criteria) this;
        }

        public Criteria andUnitvolumeNotBetween(Double value1, Double value2) {
            addCriterion("unitvolume not between", value1, value2, "unitvolume");
            return (Criteria) this;
        }

        public Criteria andUnitweightIsNull() {
            addCriterion("unitweight is null");
            return (Criteria) this;
        }

        public Criteria andUnitweightIsNotNull() {
            addCriterion("unitweight is not null");
            return (Criteria) this;
        }

        public Criteria andUnitweightEqualTo(Double value) {
            addCriterion("unitweight =", value, "unitweight");
            return (Criteria) this;
        }

        public Criteria andUnitweightNotEqualTo(Double value) {
            addCriterion("unitweight <>", value, "unitweight");
            return (Criteria) this;
        }

        public Criteria andUnitweightGreaterThan(Double value) {
            addCriterion("unitweight >", value, "unitweight");
            return (Criteria) this;
        }

        public Criteria andUnitweightGreaterThanOrEqualTo(Double value) {
            addCriterion("unitweight >=", value, "unitweight");
            return (Criteria) this;
        }

        public Criteria andUnitweightLessThan(Double value) {
            addCriterion("unitweight <", value, "unitweight");
            return (Criteria) this;
        }

        public Criteria andUnitweightLessThanOrEqualTo(Double value) {
            addCriterion("unitweight <=", value, "unitweight");
            return (Criteria) this;
        }

        public Criteria andUnitweightIn(List<Double> values) {
            addCriterion("unitweight in", values, "unitweight");
            return (Criteria) this;
        }

        public Criteria andUnitweightNotIn(List<Double> values) {
            addCriterion("unitweight not in", values, "unitweight");
            return (Criteria) this;
        }

        public Criteria andUnitweightBetween(Double value1, Double value2) {
            addCriterion("unitweight between", value1, value2, "unitweight");
            return (Criteria) this;
        }

        public Criteria andUnitweightNotBetween(Double value1, Double value2) {
            addCriterion("unitweight not between", value1, value2, "unitweight");
            return (Criteria) this;
        }

        public Criteria andRetailpriceIsNull() {
            addCriterion("retailprice is null");
            return (Criteria) this;
        }

        public Criteria andRetailpriceIsNotNull() {
            addCriterion("retailprice is not null");
            return (Criteria) this;
        }

        public Criteria andRetailpriceEqualTo(BigDecimal value) {
            addCriterion("retailprice =", value, "retailprice");
            return (Criteria) this;
        }

        public Criteria andRetailpriceNotEqualTo(BigDecimal value) {
            addCriterion("retailprice <>", value, "retailprice");
            return (Criteria) this;
        }

        public Criteria andRetailpriceGreaterThan(BigDecimal value) {
            addCriterion("retailprice >", value, "retailprice");
            return (Criteria) this;
        }

        public Criteria andRetailpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("retailprice >=", value, "retailprice");
            return (Criteria) this;
        }

        public Criteria andRetailpriceLessThan(BigDecimal value) {
            addCriterion("retailprice <", value, "retailprice");
            return (Criteria) this;
        }

        public Criteria andRetailpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("retailprice <=", value, "retailprice");
            return (Criteria) this;
        }

        public Criteria andRetailpriceIn(List<BigDecimal> values) {
            addCriterion("retailprice in", values, "retailprice");
            return (Criteria) this;
        }

        public Criteria andRetailpriceNotIn(List<BigDecimal> values) {
            addCriterion("retailprice not in", values, "retailprice");
            return (Criteria) this;
        }

        public Criteria andRetailpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("retailprice between", value1, value2, "retailprice");
            return (Criteria) this;
        }

        public Criteria andRetailpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("retailprice not between", value1, value2, "retailprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceIsNull() {
            addCriterion("costprice is null");
            return (Criteria) this;
        }

        public Criteria andCostpriceIsNotNull() {
            addCriterion("costprice is not null");
            return (Criteria) this;
        }

        public Criteria andCostpriceEqualTo(BigDecimal value) {
            addCriterion("costprice =", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotEqualTo(BigDecimal value) {
            addCriterion("costprice <>", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceGreaterThan(BigDecimal value) {
            addCriterion("costprice >", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("costprice >=", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceLessThan(BigDecimal value) {
            addCriterion("costprice <", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("costprice <=", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceIn(List<BigDecimal> values) {
            addCriterion("costprice in", values, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotIn(List<BigDecimal> values) {
            addCriterion("costprice not in", values, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("costprice between", value1, value2, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("costprice not between", value1, value2, "costprice");
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

        public Criteria andDrEqualTo(Boolean value) {
            addCriterion("dr =", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotEqualTo(Boolean value) {
            addCriterion("dr <>", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrGreaterThan(Boolean value) {
            addCriterion("dr >", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrGreaterThanOrEqualTo(Boolean value) {
            addCriterion("dr >=", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLessThan(Boolean value) {
            addCriterion("dr <", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLessThanOrEqualTo(Boolean value) {
            addCriterion("dr <=", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrIn(List<Boolean> values) {
            addCriterion("dr in", values, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotIn(List<Boolean> values) {
            addCriterion("dr not in", values, "dr");
            return (Criteria) this;
        }

        public Criteria andDrBetween(Boolean value1, Boolean value2) {
            addCriterion("dr between", value1, value2, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotBetween(Boolean value1, Boolean value2) {
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