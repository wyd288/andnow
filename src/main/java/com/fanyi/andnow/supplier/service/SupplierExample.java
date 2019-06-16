package com.fanyi.andnow.supplier.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierExample() {
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

        public Criteria andPkSupplierIsNull() {
            addCriterion("pk_supplier is null");
            return (Criteria) this;
        }

        public Criteria andPkSupplierIsNotNull() {
            addCriterion("pk_supplier is not null");
            return (Criteria) this;
        }

        public Criteria andPkSupplierEqualTo(Integer value) {
            addCriterion("pk_supplier =", value, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierNotEqualTo(Integer value) {
            addCriterion("pk_supplier <>", value, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierGreaterThan(Integer value) {
            addCriterion("pk_supplier >", value, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_supplier >=", value, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierLessThan(Integer value) {
            addCriterion("pk_supplier <", value, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierLessThanOrEqualTo(Integer value) {
            addCriterion("pk_supplier <=", value, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierIn(List<Integer> values) {
            addCriterion("pk_supplier in", values, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierNotIn(List<Integer> values) {
            addCriterion("pk_supplier not in", values, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierBetween(Integer value1, Integer value2) {
            addCriterion("pk_supplier between", value1, value2, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_supplier not between", value1, value2, "pkSupplier");
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

        public Criteria andPkCountryIsNull() {
            addCriterion("pk_country is null");
            return (Criteria) this;
        }

        public Criteria andPkCountryIsNotNull() {
            addCriterion("pk_country is not null");
            return (Criteria) this;
        }

        public Criteria andPkCountryEqualTo(Integer value) {
            addCriterion("pk_country =", value, "pkCountry");
            return (Criteria) this;
        }

        public Criteria andPkCountryNotEqualTo(Integer value) {
            addCriterion("pk_country <>", value, "pkCountry");
            return (Criteria) this;
        }

        public Criteria andPkCountryGreaterThan(Integer value) {
            addCriterion("pk_country >", value, "pkCountry");
            return (Criteria) this;
        }

        public Criteria andPkCountryGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_country >=", value, "pkCountry");
            return (Criteria) this;
        }

        public Criteria andPkCountryLessThan(Integer value) {
            addCriterion("pk_country <", value, "pkCountry");
            return (Criteria) this;
        }

        public Criteria andPkCountryLessThanOrEqualTo(Integer value) {
            addCriterion("pk_country <=", value, "pkCountry");
            return (Criteria) this;
        }

        public Criteria andPkCountryIn(List<Integer> values) {
            addCriterion("pk_country in", values, "pkCountry");
            return (Criteria) this;
        }

        public Criteria andPkCountryNotIn(List<Integer> values) {
            addCriterion("pk_country not in", values, "pkCountry");
            return (Criteria) this;
        }

        public Criteria andPkCountryBetween(Integer value1, Integer value2) {
            addCriterion("pk_country between", value1, value2, "pkCountry");
            return (Criteria) this;
        }

        public Criteria andPkCountryNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_country not between", value1, value2, "pkCountry");
            return (Criteria) this;
        }

        public Criteria andPkTimezoneIsNull() {
            addCriterion("pk_timezone is null");
            return (Criteria) this;
        }

        public Criteria andPkTimezoneIsNotNull() {
            addCriterion("pk_timezone is not null");
            return (Criteria) this;
        }

        public Criteria andPkTimezoneEqualTo(Integer value) {
            addCriterion("pk_timezone =", value, "pkTimezone");
            return (Criteria) this;
        }

        public Criteria andPkTimezoneNotEqualTo(Integer value) {
            addCriterion("pk_timezone <>", value, "pkTimezone");
            return (Criteria) this;
        }

        public Criteria andPkTimezoneGreaterThan(Integer value) {
            addCriterion("pk_timezone >", value, "pkTimezone");
            return (Criteria) this;
        }

        public Criteria andPkTimezoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_timezone >=", value, "pkTimezone");
            return (Criteria) this;
        }

        public Criteria andPkTimezoneLessThan(Integer value) {
            addCriterion("pk_timezone <", value, "pkTimezone");
            return (Criteria) this;
        }

        public Criteria andPkTimezoneLessThanOrEqualTo(Integer value) {
            addCriterion("pk_timezone <=", value, "pkTimezone");
            return (Criteria) this;
        }

        public Criteria andPkTimezoneIn(List<Integer> values) {
            addCriterion("pk_timezone in", values, "pkTimezone");
            return (Criteria) this;
        }

        public Criteria andPkTimezoneNotIn(List<Integer> values) {
            addCriterion("pk_timezone not in", values, "pkTimezone");
            return (Criteria) this;
        }

        public Criteria andPkTimezoneBetween(Integer value1, Integer value2) {
            addCriterion("pk_timezone between", value1, value2, "pkTimezone");
            return (Criteria) this;
        }

        public Criteria andPkTimezoneNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_timezone not between", value1, value2, "pkTimezone");
            return (Criteria) this;
        }

        public Criteria andTradeIsNull() {
            addCriterion("trade is null");
            return (Criteria) this;
        }

        public Criteria andTradeIsNotNull() {
            addCriterion("trade is not null");
            return (Criteria) this;
        }

        public Criteria andTradeEqualTo(Integer value) {
            addCriterion("trade =", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotEqualTo(Integer value) {
            addCriterion("trade <>", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeGreaterThan(Integer value) {
            addCriterion("trade >", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade >=", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeLessThan(Integer value) {
            addCriterion("trade <", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeLessThanOrEqualTo(Integer value) {
            addCriterion("trade <=", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeIn(List<Integer> values) {
            addCriterion("trade in", values, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotIn(List<Integer> values) {
            addCriterion("trade not in", values, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeBetween(Integer value1, Integer value2) {
            addCriterion("trade between", value1, value2, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotBetween(Integer value1, Integer value2) {
            addCriterion("trade not between", value1, value2, "trade");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeIsNull() {
            addCriterion("suppliertype is null");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeIsNotNull() {
            addCriterion("suppliertype is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeEqualTo(Integer value) {
            addCriterion("suppliertype =", value, "suppliertype");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeNotEqualTo(Integer value) {
            addCriterion("suppliertype <>", value, "suppliertype");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeGreaterThan(Integer value) {
            addCriterion("suppliertype >", value, "suppliertype");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("suppliertype >=", value, "suppliertype");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeLessThan(Integer value) {
            addCriterion("suppliertype <", value, "suppliertype");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeLessThanOrEqualTo(Integer value) {
            addCriterion("suppliertype <=", value, "suppliertype");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeIn(List<Integer> values) {
            addCriterion("suppliertype in", values, "suppliertype");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeNotIn(List<Integer> values) {
            addCriterion("suppliertype not in", values, "suppliertype");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeBetween(Integer value1, Integer value2) {
            addCriterion("suppliertype between", value1, value2, "suppliertype");
            return (Criteria) this;
        }

        public Criteria andSuppliertypeNotBetween(Integer value1, Integer value2) {
            addCriterion("suppliertype not between", value1, value2, "suppliertype");
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

        public Criteria andPkSupplierclassIsNull() {
            addCriterion("pk_supplierclass is null");
            return (Criteria) this;
        }

        public Criteria andPkSupplierclassIsNotNull() {
            addCriterion("pk_supplierclass is not null");
            return (Criteria) this;
        }

        public Criteria andPkSupplierclassEqualTo(Integer value) {
            addCriterion("pk_supplierclass =", value, "pkSupplierclass");
            return (Criteria) this;
        }

        public Criteria andPkSupplierclassNotEqualTo(Integer value) {
            addCriterion("pk_supplierclass <>", value, "pkSupplierclass");
            return (Criteria) this;
        }

        public Criteria andPkSupplierclassGreaterThan(Integer value) {
            addCriterion("pk_supplierclass >", value, "pkSupplierclass");
            return (Criteria) this;
        }

        public Criteria andPkSupplierclassGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_supplierclass >=", value, "pkSupplierclass");
            return (Criteria) this;
        }

        public Criteria andPkSupplierclassLessThan(Integer value) {
            addCriterion("pk_supplierclass <", value, "pkSupplierclass");
            return (Criteria) this;
        }

        public Criteria andPkSupplierclassLessThanOrEqualTo(Integer value) {
            addCriterion("pk_supplierclass <=", value, "pkSupplierclass");
            return (Criteria) this;
        }

        public Criteria andPkSupplierclassIn(List<Integer> values) {
            addCriterion("pk_supplierclass in", values, "pkSupplierclass");
            return (Criteria) this;
        }

        public Criteria andPkSupplierclassNotIn(List<Integer> values) {
            addCriterion("pk_supplierclass not in", values, "pkSupplierclass");
            return (Criteria) this;
        }

        public Criteria andPkSupplierclassBetween(Integer value1, Integer value2) {
            addCriterion("pk_supplierclass between", value1, value2, "pkSupplierclass");
            return (Criteria) this;
        }

        public Criteria andPkSupplierclassNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_supplierclass not between", value1, value2, "pkSupplierclass");
            return (Criteria) this;
        }

        public Criteria andIscustomerIsNull() {
            addCriterion("iscustomer is null");
            return (Criteria) this;
        }

        public Criteria andIscustomerIsNotNull() {
            addCriterion("iscustomer is not null");
            return (Criteria) this;
        }

        public Criteria andIscustomerEqualTo(Boolean value) {
            addCriterion("iscustomer =", value, "iscustomer");
            return (Criteria) this;
        }

        public Criteria andIscustomerNotEqualTo(Boolean value) {
            addCriterion("iscustomer <>", value, "iscustomer");
            return (Criteria) this;
        }

        public Criteria andIscustomerGreaterThan(Boolean value) {
            addCriterion("iscustomer >", value, "iscustomer");
            return (Criteria) this;
        }

        public Criteria andIscustomerGreaterThanOrEqualTo(Boolean value) {
            addCriterion("iscustomer >=", value, "iscustomer");
            return (Criteria) this;
        }

        public Criteria andIscustomerLessThan(Boolean value) {
            addCriterion("iscustomer <", value, "iscustomer");
            return (Criteria) this;
        }

        public Criteria andIscustomerLessThanOrEqualTo(Boolean value) {
            addCriterion("iscustomer <=", value, "iscustomer");
            return (Criteria) this;
        }

        public Criteria andIscustomerIn(List<Boolean> values) {
            addCriterion("iscustomer in", values, "iscustomer");
            return (Criteria) this;
        }

        public Criteria andIscustomerNotIn(List<Boolean> values) {
            addCriterion("iscustomer not in", values, "iscustomer");
            return (Criteria) this;
        }

        public Criteria andIscustomerBetween(Boolean value1, Boolean value2) {
            addCriterion("iscustomer between", value1, value2, "iscustomer");
            return (Criteria) this;
        }

        public Criteria andIscustomerNotBetween(Boolean value1, Boolean value2) {
            addCriterion("iscustomer not between", value1, value2, "iscustomer");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridIsNull() {
            addCriterion("taxpayerid is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridIsNotNull() {
            addCriterion("taxpayerid is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridEqualTo(String value) {
            addCriterion("taxpayerid =", value, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridNotEqualTo(String value) {
            addCriterion("taxpayerid <>", value, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridGreaterThan(String value) {
            addCriterion("taxpayerid >", value, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridGreaterThanOrEqualTo(String value) {
            addCriterion("taxpayerid >=", value, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridLessThan(String value) {
            addCriterion("taxpayerid <", value, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridLessThanOrEqualTo(String value) {
            addCriterion("taxpayerid <=", value, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridLike(String value) {
            addCriterion("taxpayerid like", value, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridNotLike(String value) {
            addCriterion("taxpayerid not like", value, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridIn(List<String> values) {
            addCriterion("taxpayerid in", values, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridNotIn(List<String> values) {
            addCriterion("taxpayerid not in", values, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridBetween(String value1, String value2) {
            addCriterion("taxpayerid between", value1, value2, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridNotBetween(String value1, String value2) {
            addCriterion("taxpayerid not between", value1, value2, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andRegisteredfundIsNull() {
            addCriterion("registeredfund is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredfundIsNotNull() {
            addCriterion("registeredfund is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredfundEqualTo(Double value) {
            addCriterion("registeredfund =", value, "registeredfund");
            return (Criteria) this;
        }

        public Criteria andRegisteredfundNotEqualTo(Double value) {
            addCriterion("registeredfund <>", value, "registeredfund");
            return (Criteria) this;
        }

        public Criteria andRegisteredfundGreaterThan(Double value) {
            addCriterion("registeredfund >", value, "registeredfund");
            return (Criteria) this;
        }

        public Criteria andRegisteredfundGreaterThanOrEqualTo(Double value) {
            addCriterion("registeredfund >=", value, "registeredfund");
            return (Criteria) this;
        }

        public Criteria andRegisteredfundLessThan(Double value) {
            addCriterion("registeredfund <", value, "registeredfund");
            return (Criteria) this;
        }

        public Criteria andRegisteredfundLessThanOrEqualTo(Double value) {
            addCriterion("registeredfund <=", value, "registeredfund");
            return (Criteria) this;
        }

        public Criteria andRegisteredfundIn(List<Double> values) {
            addCriterion("registeredfund in", values, "registeredfund");
            return (Criteria) this;
        }

        public Criteria andRegisteredfundNotIn(List<Double> values) {
            addCriterion("registeredfund not in", values, "registeredfund");
            return (Criteria) this;
        }

        public Criteria andRegisteredfundBetween(Double value1, Double value2) {
            addCriterion("registeredfund between", value1, value2, "registeredfund");
            return (Criteria) this;
        }

        public Criteria andRegisteredfundNotBetween(Double value1, Double value2) {
            addCriterion("registeredfund not between", value1, value2, "registeredfund");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeIsNull() {
            addCriterion("pk_currtype is null");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeIsNotNull() {
            addCriterion("pk_currtype is not null");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeEqualTo(Integer value) {
            addCriterion("pk_currtype =", value, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeNotEqualTo(Integer value) {
            addCriterion("pk_currtype <>", value, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeGreaterThan(Integer value) {
            addCriterion("pk_currtype >", value, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_currtype >=", value, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeLessThan(Integer value) {
            addCriterion("pk_currtype <", value, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeLessThanOrEqualTo(Integer value) {
            addCriterion("pk_currtype <=", value, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeIn(List<Integer> values) {
            addCriterion("pk_currtype in", values, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeNotIn(List<Integer> values) {
            addCriterion("pk_currtype not in", values, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeBetween(Integer value1, Integer value2) {
            addCriterion("pk_currtype between", value1, value2, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_currtype not between", value1, value2, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andLegalbodyIsNull() {
            addCriterion("legalbody is null");
            return (Criteria) this;
        }

        public Criteria andLegalbodyIsNotNull() {
            addCriterion("legalbody is not null");
            return (Criteria) this;
        }

        public Criteria andLegalbodyEqualTo(String value) {
            addCriterion("legalbody =", value, "legalbody");
            return (Criteria) this;
        }

        public Criteria andLegalbodyNotEqualTo(String value) {
            addCriterion("legalbody <>", value, "legalbody");
            return (Criteria) this;
        }

        public Criteria andLegalbodyGreaterThan(String value) {
            addCriterion("legalbody >", value, "legalbody");
            return (Criteria) this;
        }

        public Criteria andLegalbodyGreaterThanOrEqualTo(String value) {
            addCriterion("legalbody >=", value, "legalbody");
            return (Criteria) this;
        }

        public Criteria andLegalbodyLessThan(String value) {
            addCriterion("legalbody <", value, "legalbody");
            return (Criteria) this;
        }

        public Criteria andLegalbodyLessThanOrEqualTo(String value) {
            addCriterion("legalbody <=", value, "legalbody");
            return (Criteria) this;
        }

        public Criteria andLegalbodyLike(String value) {
            addCriterion("legalbody like", value, "legalbody");
            return (Criteria) this;
        }

        public Criteria andLegalbodyNotLike(String value) {
            addCriterion("legalbody not like", value, "legalbody");
            return (Criteria) this;
        }

        public Criteria andLegalbodyIn(List<String> values) {
            addCriterion("legalbody in", values, "legalbody");
            return (Criteria) this;
        }

        public Criteria andLegalbodyNotIn(List<String> values) {
            addCriterion("legalbody not in", values, "legalbody");
            return (Criteria) this;
        }

        public Criteria andLegalbodyBetween(String value1, String value2) {
            addCriterion("legalbody between", value1, value2, "legalbody");
            return (Criteria) this;
        }

        public Criteria andLegalbodyNotBetween(String value1, String value2) {
            addCriterion("legalbody not between", value1, value2, "legalbody");
            return (Criteria) this;
        }

        public Criteria andBuslicenseIsNull() {
            addCriterion("buslicense is null");
            return (Criteria) this;
        }

        public Criteria andBuslicenseIsNotNull() {
            addCriterion("buslicense is not null");
            return (Criteria) this;
        }

        public Criteria andBuslicenseEqualTo(String value) {
            addCriterion("buslicense =", value, "buslicense");
            return (Criteria) this;
        }

        public Criteria andBuslicenseNotEqualTo(String value) {
            addCriterion("buslicense <>", value, "buslicense");
            return (Criteria) this;
        }

        public Criteria andBuslicenseGreaterThan(String value) {
            addCriterion("buslicense >", value, "buslicense");
            return (Criteria) this;
        }

        public Criteria andBuslicenseGreaterThanOrEqualTo(String value) {
            addCriterion("buslicense >=", value, "buslicense");
            return (Criteria) this;
        }

        public Criteria andBuslicenseLessThan(String value) {
            addCriterion("buslicense <", value, "buslicense");
            return (Criteria) this;
        }

        public Criteria andBuslicenseLessThanOrEqualTo(String value) {
            addCriterion("buslicense <=", value, "buslicense");
            return (Criteria) this;
        }

        public Criteria andBuslicenseLike(String value) {
            addCriterion("buslicense like", value, "buslicense");
            return (Criteria) this;
        }

        public Criteria andBuslicenseNotLike(String value) {
            addCriterion("buslicense not like", value, "buslicense");
            return (Criteria) this;
        }

        public Criteria andBuslicenseIn(List<String> values) {
            addCriterion("buslicense in", values, "buslicense");
            return (Criteria) this;
        }

        public Criteria andBuslicenseNotIn(List<String> values) {
            addCriterion("buslicense not in", values, "buslicense");
            return (Criteria) this;
        }

        public Criteria andBuslicenseBetween(String value1, String value2) {
            addCriterion("buslicense between", value1, value2, "buslicense");
            return (Criteria) this;
        }

        public Criteria andBuslicenseNotBetween(String value1, String value2) {
            addCriterion("buslicense not between", value1, value2, "buslicense");
            return (Criteria) this;
        }

        public Criteria andSupcountrytaxesIsNull() {
            addCriterion("supcountrytaxes is null");
            return (Criteria) this;
        }

        public Criteria andSupcountrytaxesIsNotNull() {
            addCriterion("supcountrytaxes is not null");
            return (Criteria) this;
        }

        public Criteria andSupcountrytaxesEqualTo(String value) {
            addCriterion("supcountrytaxes =", value, "supcountrytaxes");
            return (Criteria) this;
        }

        public Criteria andSupcountrytaxesNotEqualTo(String value) {
            addCriterion("supcountrytaxes <>", value, "supcountrytaxes");
            return (Criteria) this;
        }

        public Criteria andSupcountrytaxesGreaterThan(String value) {
            addCriterion("supcountrytaxes >", value, "supcountrytaxes");
            return (Criteria) this;
        }

        public Criteria andSupcountrytaxesGreaterThanOrEqualTo(String value) {
            addCriterion("supcountrytaxes >=", value, "supcountrytaxes");
            return (Criteria) this;
        }

        public Criteria andSupcountrytaxesLessThan(String value) {
            addCriterion("supcountrytaxes <", value, "supcountrytaxes");
            return (Criteria) this;
        }

        public Criteria andSupcountrytaxesLessThanOrEqualTo(String value) {
            addCriterion("supcountrytaxes <=", value, "supcountrytaxes");
            return (Criteria) this;
        }

        public Criteria andSupcountrytaxesLike(String value) {
            addCriterion("supcountrytaxes like", value, "supcountrytaxes");
            return (Criteria) this;
        }

        public Criteria andSupcountrytaxesNotLike(String value) {
            addCriterion("supcountrytaxes not like", value, "supcountrytaxes");
            return (Criteria) this;
        }

        public Criteria andSupcountrytaxesIn(List<String> values) {
            addCriterion("supcountrytaxes in", values, "supcountrytaxes");
            return (Criteria) this;
        }

        public Criteria andSupcountrytaxesNotIn(List<String> values) {
            addCriterion("supcountrytaxes not in", values, "supcountrytaxes");
            return (Criteria) this;
        }

        public Criteria andSupcountrytaxesBetween(String value1, String value2) {
            addCriterion("supcountrytaxes between", value1, value2, "supcountrytaxes");
            return (Criteria) this;
        }

        public Criteria andSupcountrytaxesNotBetween(String value1, String value2) {
            addCriterion("supcountrytaxes not between", value1, value2, "supcountrytaxes");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIsNull() {
            addCriterion("postalcode is null");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIsNotNull() {
            addCriterion("postalcode is not null");
            return (Criteria) this;
        }

        public Criteria andPostalcodeEqualTo(String value) {
            addCriterion("postalcode =", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotEqualTo(String value) {
            addCriterion("postalcode <>", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeGreaterThan(String value) {
            addCriterion("postalcode >", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeGreaterThanOrEqualTo(String value) {
            addCriterion("postalcode >=", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLessThan(String value) {
            addCriterion("postalcode <", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLessThanOrEqualTo(String value) {
            addCriterion("postalcode <=", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLike(String value) {
            addCriterion("postalcode like", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotLike(String value) {
            addCriterion("postalcode not like", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIn(List<String> values) {
            addCriterion("postalcode in", values, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotIn(List<String> values) {
            addCriterion("postalcode not in", values, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeBetween(String value1, String value2) {
            addCriterion("postalcode between", value1, value2, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotBetween(String value1, String value2) {
            addCriterion("postalcode not between", value1, value2, "postalcode");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNull() {
            addCriterion("website is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNotNull() {
            addCriterion("website is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteEqualTo(String value) {
            addCriterion("website =", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotEqualTo(String value) {
            addCriterion("website <>", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThan(String value) {
            addCriterion("website >", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("website >=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThan(String value) {
            addCriterion("website <", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThanOrEqualTo(String value) {
            addCriterion("website <=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLike(String value) {
            addCriterion("website like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotLike(String value) {
            addCriterion("website not like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteIn(List<String> values) {
            addCriterion("website in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotIn(List<String> values) {
            addCriterion("website not in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteBetween(String value1, String value2) {
            addCriterion("website between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotBetween(String value1, String value2) {
            addCriterion("website not between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andSupplierstateIsNull() {
            addCriterion("supplierstate is null");
            return (Criteria) this;
        }

        public Criteria andSupplierstateIsNotNull() {
            addCriterion("supplierstate is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierstateEqualTo(Byte value) {
            addCriterion("supplierstate =", value, "supplierstate");
            return (Criteria) this;
        }

        public Criteria andSupplierstateNotEqualTo(Byte value) {
            addCriterion("supplierstate <>", value, "supplierstate");
            return (Criteria) this;
        }

        public Criteria andSupplierstateGreaterThan(Byte value) {
            addCriterion("supplierstate >", value, "supplierstate");
            return (Criteria) this;
        }

        public Criteria andSupplierstateGreaterThanOrEqualTo(Byte value) {
            addCriterion("supplierstate >=", value, "supplierstate");
            return (Criteria) this;
        }

        public Criteria andSupplierstateLessThan(Byte value) {
            addCriterion("supplierstate <", value, "supplierstate");
            return (Criteria) this;
        }

        public Criteria andSupplierstateLessThanOrEqualTo(Byte value) {
            addCriterion("supplierstate <=", value, "supplierstate");
            return (Criteria) this;
        }

        public Criteria andSupplierstateIn(List<Byte> values) {
            addCriterion("supplierstate in", values, "supplierstate");
            return (Criteria) this;
        }

        public Criteria andSupplierstateNotIn(List<Byte> values) {
            addCriterion("supplierstate not in", values, "supplierstate");
            return (Criteria) this;
        }

        public Criteria andSupplierstateBetween(Byte value1, Byte value2) {
            addCriterion("supplierstate between", value1, value2, "supplierstate");
            return (Criteria) this;
        }

        public Criteria andSupplierstateNotBetween(Byte value1, Byte value2) {
            addCriterion("supplierstate not between", value1, value2, "supplierstate");
            return (Criteria) this;
        }

        public Criteria andSuplinkmanIsNull() {
            addCriterion("suplinkman is null");
            return (Criteria) this;
        }

        public Criteria andSuplinkmanIsNotNull() {
            addCriterion("suplinkman is not null");
            return (Criteria) this;
        }

        public Criteria andSuplinkmanEqualTo(String value) {
            addCriterion("suplinkman =", value, "suplinkman");
            return (Criteria) this;
        }

        public Criteria andSuplinkmanNotEqualTo(String value) {
            addCriterion("suplinkman <>", value, "suplinkman");
            return (Criteria) this;
        }

        public Criteria andSuplinkmanGreaterThan(String value) {
            addCriterion("suplinkman >", value, "suplinkman");
            return (Criteria) this;
        }

        public Criteria andSuplinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("suplinkman >=", value, "suplinkman");
            return (Criteria) this;
        }

        public Criteria andSuplinkmanLessThan(String value) {
            addCriterion("suplinkman <", value, "suplinkman");
            return (Criteria) this;
        }

        public Criteria andSuplinkmanLessThanOrEqualTo(String value) {
            addCriterion("suplinkman <=", value, "suplinkman");
            return (Criteria) this;
        }

        public Criteria andSuplinkmanLike(String value) {
            addCriterion("suplinkman like", value, "suplinkman");
            return (Criteria) this;
        }

        public Criteria andSuplinkmanNotLike(String value) {
            addCriterion("suplinkman not like", value, "suplinkman");
            return (Criteria) this;
        }

        public Criteria andSuplinkmanIn(List<String> values) {
            addCriterion("suplinkman in", values, "suplinkman");
            return (Criteria) this;
        }

        public Criteria andSuplinkmanNotIn(List<String> values) {
            addCriterion("suplinkman not in", values, "suplinkman");
            return (Criteria) this;
        }

        public Criteria andSuplinkmanBetween(String value1, String value2) {
            addCriterion("suplinkman between", value1, value2, "suplinkman");
            return (Criteria) this;
        }

        public Criteria andSuplinkmanNotBetween(String value1, String value2) {
            addCriterion("suplinkman not between", value1, value2, "suplinkman");
            return (Criteria) this;
        }

        public Criteria andSuobankaccIsNull() {
            addCriterion("suobankacc is null");
            return (Criteria) this;
        }

        public Criteria andSuobankaccIsNotNull() {
            addCriterion("suobankacc is not null");
            return (Criteria) this;
        }

        public Criteria andSuobankaccEqualTo(String value) {
            addCriterion("suobankacc =", value, "suobankacc");
            return (Criteria) this;
        }

        public Criteria andSuobankaccNotEqualTo(String value) {
            addCriterion("suobankacc <>", value, "suobankacc");
            return (Criteria) this;
        }

        public Criteria andSuobankaccGreaterThan(String value) {
            addCriterion("suobankacc >", value, "suobankacc");
            return (Criteria) this;
        }

        public Criteria andSuobankaccGreaterThanOrEqualTo(String value) {
            addCriterion("suobankacc >=", value, "suobankacc");
            return (Criteria) this;
        }

        public Criteria andSuobankaccLessThan(String value) {
            addCriterion("suobankacc <", value, "suobankacc");
            return (Criteria) this;
        }

        public Criteria andSuobankaccLessThanOrEqualTo(String value) {
            addCriterion("suobankacc <=", value, "suobankacc");
            return (Criteria) this;
        }

        public Criteria andSuobankaccLike(String value) {
            addCriterion("suobankacc like", value, "suobankacc");
            return (Criteria) this;
        }

        public Criteria andSuobankaccNotLike(String value) {
            addCriterion("suobankacc not like", value, "suobankacc");
            return (Criteria) this;
        }

        public Criteria andSuobankaccIn(List<String> values) {
            addCriterion("suobankacc in", values, "suobankacc");
            return (Criteria) this;
        }

        public Criteria andSuobankaccNotIn(List<String> values) {
            addCriterion("suobankacc not in", values, "suobankacc");
            return (Criteria) this;
        }

        public Criteria andSuobankaccBetween(String value1, String value2) {
            addCriterion("suobankacc between", value1, value2, "suobankacc");
            return (Criteria) this;
        }

        public Criteria andSuobankaccNotBetween(String value1, String value2) {
            addCriterion("suobankacc not between", value1, value2, "suobankacc");
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

        public Criteria andFaxIsNull() {
            addCriterion("fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("fax not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
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