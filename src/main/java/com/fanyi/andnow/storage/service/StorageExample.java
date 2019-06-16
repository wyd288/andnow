package com.fanyi.andnow.storage.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StorageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StorageExample() {
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

        public Criteria andPkStorageIsNull() {
            addCriterion("pk_storage is null");
            return (Criteria) this;
        }

        public Criteria andPkStorageIsNotNull() {
            addCriterion("pk_storage is not null");
            return (Criteria) this;
        }

        public Criteria andPkStorageEqualTo(Integer value) {
            addCriterion("pk_storage =", value, "pkStorage");
            return (Criteria) this;
        }

        public Criteria andPkStorageNotEqualTo(Integer value) {
            addCriterion("pk_storage <>", value, "pkStorage");
            return (Criteria) this;
        }

        public Criteria andPkStorageGreaterThan(Integer value) {
            addCriterion("pk_storage >", value, "pkStorage");
            return (Criteria) this;
        }

        public Criteria andPkStorageGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_storage >=", value, "pkStorage");
            return (Criteria) this;
        }

        public Criteria andPkStorageLessThan(Integer value) {
            addCriterion("pk_storage <", value, "pkStorage");
            return (Criteria) this;
        }

        public Criteria andPkStorageLessThanOrEqualTo(Integer value) {
            addCriterion("pk_storage <=", value, "pkStorage");
            return (Criteria) this;
        }

        public Criteria andPkStorageIn(List<Integer> values) {
            addCriterion("pk_storage in", values, "pkStorage");
            return (Criteria) this;
        }

        public Criteria andPkStorageNotIn(List<Integer> values) {
            addCriterion("pk_storage not in", values, "pkStorage");
            return (Criteria) this;
        }

        public Criteria andPkStorageBetween(Integer value1, Integer value2) {
            addCriterion("pk_storage between", value1, value2, "pkStorage");
            return (Criteria) this;
        }

        public Criteria andPkStorageNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_storage not between", value1, value2, "pkStorage");
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

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andCsflagIsNull() {
            addCriterion("csflag is null");
            return (Criteria) this;
        }

        public Criteria andCsflagIsNotNull() {
            addCriterion("csflag is not null");
            return (Criteria) this;
        }

        public Criteria andCsflagEqualTo(Boolean value) {
            addCriterion("csflag =", value, "csflag");
            return (Criteria) this;
        }

        public Criteria andCsflagNotEqualTo(Boolean value) {
            addCriterion("csflag <>", value, "csflag");
            return (Criteria) this;
        }

        public Criteria andCsflagGreaterThan(Boolean value) {
            addCriterion("csflag >", value, "csflag");
            return (Criteria) this;
        }

        public Criteria andCsflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("csflag >=", value, "csflag");
            return (Criteria) this;
        }

        public Criteria andCsflagLessThan(Boolean value) {
            addCriterion("csflag <", value, "csflag");
            return (Criteria) this;
        }

        public Criteria andCsflagLessThanOrEqualTo(Boolean value) {
            addCriterion("csflag <=", value, "csflag");
            return (Criteria) this;
        }

        public Criteria andCsflagIn(List<Boolean> values) {
            addCriterion("csflag in", values, "csflag");
            return (Criteria) this;
        }

        public Criteria andCsflagNotIn(List<Boolean> values) {
            addCriterion("csflag not in", values, "csflag");
            return (Criteria) this;
        }

        public Criteria andCsflagBetween(Boolean value1, Boolean value2) {
            addCriterion("csflag between", value1, value2, "csflag");
            return (Criteria) this;
        }

        public Criteria andCsflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("csflag not between", value1, value2, "csflag");
            return (Criteria) this;
        }

        public Criteria andIsgubstoreIsNull() {
            addCriterion("isgubstore is null");
            return (Criteria) this;
        }

        public Criteria andIsgubstoreIsNotNull() {
            addCriterion("isgubstore is not null");
            return (Criteria) this;
        }

        public Criteria andIsgubstoreEqualTo(Boolean value) {
            addCriterion("isgubstore =", value, "isgubstore");
            return (Criteria) this;
        }

        public Criteria andIsgubstoreNotEqualTo(Boolean value) {
            addCriterion("isgubstore <>", value, "isgubstore");
            return (Criteria) this;
        }

        public Criteria andIsgubstoreGreaterThan(Boolean value) {
            addCriterion("isgubstore >", value, "isgubstore");
            return (Criteria) this;
        }

        public Criteria andIsgubstoreGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isgubstore >=", value, "isgubstore");
            return (Criteria) this;
        }

        public Criteria andIsgubstoreLessThan(Boolean value) {
            addCriterion("isgubstore <", value, "isgubstore");
            return (Criteria) this;
        }

        public Criteria andIsgubstoreLessThanOrEqualTo(Boolean value) {
            addCriterion("isgubstore <=", value, "isgubstore");
            return (Criteria) this;
        }

        public Criteria andIsgubstoreIn(List<Boolean> values) {
            addCriterion("isgubstore in", values, "isgubstore");
            return (Criteria) this;
        }

        public Criteria andIsgubstoreNotIn(List<Boolean> values) {
            addCriterion("isgubstore not in", values, "isgubstore");
            return (Criteria) this;
        }

        public Criteria andIsgubstoreBetween(Boolean value1, Boolean value2) {
            addCriterion("isgubstore between", value1, value2, "isgubstore");
            return (Criteria) this;
        }

        public Criteria andIsgubstoreNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isgubstore not between", value1, value2, "isgubstore");
            return (Criteria) this;
        }

        public Criteria andIsprostoreIsNull() {
            addCriterion("isprostore is null");
            return (Criteria) this;
        }

        public Criteria andIsprostoreIsNotNull() {
            addCriterion("isprostore is not null");
            return (Criteria) this;
        }

        public Criteria andIsprostoreEqualTo(Boolean value) {
            addCriterion("isprostore =", value, "isprostore");
            return (Criteria) this;
        }

        public Criteria andIsprostoreNotEqualTo(Boolean value) {
            addCriterion("isprostore <>", value, "isprostore");
            return (Criteria) this;
        }

        public Criteria andIsprostoreGreaterThan(Boolean value) {
            addCriterion("isprostore >", value, "isprostore");
            return (Criteria) this;
        }

        public Criteria andIsprostoreGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isprostore >=", value, "isprostore");
            return (Criteria) this;
        }

        public Criteria andIsprostoreLessThan(Boolean value) {
            addCriterion("isprostore <", value, "isprostore");
            return (Criteria) this;
        }

        public Criteria andIsprostoreLessThanOrEqualTo(Boolean value) {
            addCriterion("isprostore <=", value, "isprostore");
            return (Criteria) this;
        }

        public Criteria andIsprostoreIn(List<Boolean> values) {
            addCriterion("isprostore in", values, "isprostore");
            return (Criteria) this;
        }

        public Criteria andIsprostoreNotIn(List<Boolean> values) {
            addCriterion("isprostore not in", values, "isprostore");
            return (Criteria) this;
        }

        public Criteria andIsprostoreBetween(Boolean value1, Boolean value2) {
            addCriterion("isprostore between", value1, value2, "isprostore");
            return (Criteria) this;
        }

        public Criteria andIsprostoreNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isprostore not between", value1, value2, "isprostore");
            return (Criteria) this;
        }

        public Criteria andIsonthewaystoreIsNull() {
            addCriterion("isonthewaystore is null");
            return (Criteria) this;
        }

        public Criteria andIsonthewaystoreIsNotNull() {
            addCriterion("isonthewaystore is not null");
            return (Criteria) this;
        }

        public Criteria andIsonthewaystoreEqualTo(Boolean value) {
            addCriterion("isonthewaystore =", value, "isonthewaystore");
            return (Criteria) this;
        }

        public Criteria andIsonthewaystoreNotEqualTo(Boolean value) {
            addCriterion("isonthewaystore <>", value, "isonthewaystore");
            return (Criteria) this;
        }

        public Criteria andIsonthewaystoreGreaterThan(Boolean value) {
            addCriterion("isonthewaystore >", value, "isonthewaystore");
            return (Criteria) this;
        }

        public Criteria andIsonthewaystoreGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isonthewaystore >=", value, "isonthewaystore");
            return (Criteria) this;
        }

        public Criteria andIsonthewaystoreLessThan(Boolean value) {
            addCriterion("isonthewaystore <", value, "isonthewaystore");
            return (Criteria) this;
        }

        public Criteria andIsonthewaystoreLessThanOrEqualTo(Boolean value) {
            addCriterion("isonthewaystore <=", value, "isonthewaystore");
            return (Criteria) this;
        }

        public Criteria andIsonthewaystoreIn(List<Boolean> values) {
            addCriterion("isonthewaystore in", values, "isonthewaystore");
            return (Criteria) this;
        }

        public Criteria andIsonthewaystoreNotIn(List<Boolean> values) {
            addCriterion("isonthewaystore not in", values, "isonthewaystore");
            return (Criteria) this;
        }

        public Criteria andIsonthewaystoreBetween(Boolean value1, Boolean value2) {
            addCriterion("isonthewaystore between", value1, value2, "isonthewaystore");
            return (Criteria) this;
        }

        public Criteria andIsonthewaystoreNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isonthewaystore not between", value1, value2, "isonthewaystore");
            return (Criteria) this;
        }

        public Criteria andIsdirectstoreIsNull() {
            addCriterion("isdirectstore is null");
            return (Criteria) this;
        }

        public Criteria andIsdirectstoreIsNotNull() {
            addCriterion("isdirectstore is not null");
            return (Criteria) this;
        }

        public Criteria andIsdirectstoreEqualTo(Boolean value) {
            addCriterion("isdirectstore =", value, "isdirectstore");
            return (Criteria) this;
        }

        public Criteria andIsdirectstoreNotEqualTo(Boolean value) {
            addCriterion("isdirectstore <>", value, "isdirectstore");
            return (Criteria) this;
        }

        public Criteria andIsdirectstoreGreaterThan(Boolean value) {
            addCriterion("isdirectstore >", value, "isdirectstore");
            return (Criteria) this;
        }

        public Criteria andIsdirectstoreGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isdirectstore >=", value, "isdirectstore");
            return (Criteria) this;
        }

        public Criteria andIsdirectstoreLessThan(Boolean value) {
            addCriterion("isdirectstore <", value, "isdirectstore");
            return (Criteria) this;
        }

        public Criteria andIsdirectstoreLessThanOrEqualTo(Boolean value) {
            addCriterion("isdirectstore <=", value, "isdirectstore");
            return (Criteria) this;
        }

        public Criteria andIsdirectstoreIn(List<Boolean> values) {
            addCriterion("isdirectstore in", values, "isdirectstore");
            return (Criteria) this;
        }

        public Criteria andIsdirectstoreNotIn(List<Boolean> values) {
            addCriterion("isdirectstore not in", values, "isdirectstore");
            return (Criteria) this;
        }

        public Criteria andIsdirectstoreBetween(Boolean value1, Boolean value2) {
            addCriterion("isdirectstore between", value1, value2, "isdirectstore");
            return (Criteria) this;
        }

        public Criteria andIsdirectstoreNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isdirectstore not between", value1, value2, "isdirectstore");
            return (Criteria) this;
        }

        public Criteria andIsagentstoreIsNull() {
            addCriterion("isagentstore is null");
            return (Criteria) this;
        }

        public Criteria andIsagentstoreIsNotNull() {
            addCriterion("isagentstore is not null");
            return (Criteria) this;
        }

        public Criteria andIsagentstoreEqualTo(Boolean value) {
            addCriterion("isagentstore =", value, "isagentstore");
            return (Criteria) this;
        }

        public Criteria andIsagentstoreNotEqualTo(Boolean value) {
            addCriterion("isagentstore <>", value, "isagentstore");
            return (Criteria) this;
        }

        public Criteria andIsagentstoreGreaterThan(Boolean value) {
            addCriterion("isagentstore >", value, "isagentstore");
            return (Criteria) this;
        }

        public Criteria andIsagentstoreGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isagentstore >=", value, "isagentstore");
            return (Criteria) this;
        }

        public Criteria andIsagentstoreLessThan(Boolean value) {
            addCriterion("isagentstore <", value, "isagentstore");
            return (Criteria) this;
        }

        public Criteria andIsagentstoreLessThanOrEqualTo(Boolean value) {
            addCriterion("isagentstore <=", value, "isagentstore");
            return (Criteria) this;
        }

        public Criteria andIsagentstoreIn(List<Boolean> values) {
            addCriterion("isagentstore in", values, "isagentstore");
            return (Criteria) this;
        }

        public Criteria andIsagentstoreNotIn(List<Boolean> values) {
            addCriterion("isagentstore not in", values, "isagentstore");
            return (Criteria) this;
        }

        public Criteria andIsagentstoreBetween(Boolean value1, Boolean value2) {
            addCriterion("isagentstore between", value1, value2, "isagentstore");
            return (Criteria) this;
        }

        public Criteria andIsagentstoreNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isagentstore not between", value1, value2, "isagentstore");
            return (Criteria) this;
        }

        public Criteria andIsretailstoreIsNull() {
            addCriterion("isretailstore is null");
            return (Criteria) this;
        }

        public Criteria andIsretailstoreIsNotNull() {
            addCriterion("isretailstore is not null");
            return (Criteria) this;
        }

        public Criteria andIsretailstoreEqualTo(Boolean value) {
            addCriterion("isretailstore =", value, "isretailstore");
            return (Criteria) this;
        }

        public Criteria andIsretailstoreNotEqualTo(Boolean value) {
            addCriterion("isretailstore <>", value, "isretailstore");
            return (Criteria) this;
        }

        public Criteria andIsretailstoreGreaterThan(Boolean value) {
            addCriterion("isretailstore >", value, "isretailstore");
            return (Criteria) this;
        }

        public Criteria andIsretailstoreGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isretailstore >=", value, "isretailstore");
            return (Criteria) this;
        }

        public Criteria andIsretailstoreLessThan(Boolean value) {
            addCriterion("isretailstore <", value, "isretailstore");
            return (Criteria) this;
        }

        public Criteria andIsretailstoreLessThanOrEqualTo(Boolean value) {
            addCriterion("isretailstore <=", value, "isretailstore");
            return (Criteria) this;
        }

        public Criteria andIsretailstoreIn(List<Boolean> values) {
            addCriterion("isretailstore in", values, "isretailstore");
            return (Criteria) this;
        }

        public Criteria andIsretailstoreNotIn(List<Boolean> values) {
            addCriterion("isretailstore not in", values, "isretailstore");
            return (Criteria) this;
        }

        public Criteria andIsretailstoreBetween(Boolean value1, Boolean value2) {
            addCriterion("isretailstore between", value1, value2, "isretailstore");
            return (Criteria) this;
        }

        public Criteria andIsretailstoreNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isretailstore not between", value1, value2, "isretailstore");
            return (Criteria) this;
        }

        public Criteria andIsshopstoreIsNull() {
            addCriterion("isshopstore is null");
            return (Criteria) this;
        }

        public Criteria andIsshopstoreIsNotNull() {
            addCriterion("isshopstore is not null");
            return (Criteria) this;
        }

        public Criteria andIsshopstoreEqualTo(Boolean value) {
            addCriterion("isshopstore =", value, "isshopstore");
            return (Criteria) this;
        }

        public Criteria andIsshopstoreNotEqualTo(Boolean value) {
            addCriterion("isshopstore <>", value, "isshopstore");
            return (Criteria) this;
        }

        public Criteria andIsshopstoreGreaterThan(Boolean value) {
            addCriterion("isshopstore >", value, "isshopstore");
            return (Criteria) this;
        }

        public Criteria andIsshopstoreGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isshopstore >=", value, "isshopstore");
            return (Criteria) this;
        }

        public Criteria andIsshopstoreLessThan(Boolean value) {
            addCriterion("isshopstore <", value, "isshopstore");
            return (Criteria) this;
        }

        public Criteria andIsshopstoreLessThanOrEqualTo(Boolean value) {
            addCriterion("isshopstore <=", value, "isshopstore");
            return (Criteria) this;
        }

        public Criteria andIsshopstoreIn(List<Boolean> values) {
            addCriterion("isshopstore in", values, "isshopstore");
            return (Criteria) this;
        }

        public Criteria andIsshopstoreNotIn(List<Boolean> values) {
            addCriterion("isshopstore not in", values, "isshopstore");
            return (Criteria) this;
        }

        public Criteria andIsshopstoreBetween(Boolean value1, Boolean value2) {
            addCriterion("isshopstore between", value1, value2, "isshopstore");
            return (Criteria) this;
        }

        public Criteria andIsshopstoreNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isshopstore not between", value1, value2, "isshopstore");
            return (Criteria) this;
        }

        public Criteria andIskptaxstoreIsNull() {
            addCriterion("iskptaxstore is null");
            return (Criteria) this;
        }

        public Criteria andIskptaxstoreIsNotNull() {
            addCriterion("iskptaxstore is not null");
            return (Criteria) this;
        }

        public Criteria andIskptaxstoreEqualTo(Boolean value) {
            addCriterion("iskptaxstore =", value, "iskptaxstore");
            return (Criteria) this;
        }

        public Criteria andIskptaxstoreNotEqualTo(Boolean value) {
            addCriterion("iskptaxstore <>", value, "iskptaxstore");
            return (Criteria) this;
        }

        public Criteria andIskptaxstoreGreaterThan(Boolean value) {
            addCriterion("iskptaxstore >", value, "iskptaxstore");
            return (Criteria) this;
        }

        public Criteria andIskptaxstoreGreaterThanOrEqualTo(Boolean value) {
            addCriterion("iskptaxstore >=", value, "iskptaxstore");
            return (Criteria) this;
        }

        public Criteria andIskptaxstoreLessThan(Boolean value) {
            addCriterion("iskptaxstore <", value, "iskptaxstore");
            return (Criteria) this;
        }

        public Criteria andIskptaxstoreLessThanOrEqualTo(Boolean value) {
            addCriterion("iskptaxstore <=", value, "iskptaxstore");
            return (Criteria) this;
        }

        public Criteria andIskptaxstoreIn(List<Boolean> values) {
            addCriterion("iskptaxstore in", values, "iskptaxstore");
            return (Criteria) this;
        }

        public Criteria andIskptaxstoreNotIn(List<Boolean> values) {
            addCriterion("iskptaxstore not in", values, "iskptaxstore");
            return (Criteria) this;
        }

        public Criteria andIskptaxstoreBetween(Boolean value1, Boolean value2) {
            addCriterion("iskptaxstore between", value1, value2, "iskptaxstore");
            return (Criteria) this;
        }

        public Criteria andIskptaxstoreNotBetween(Boolean value1, Boolean value2) {
            addCriterion("iskptaxstore not between", value1, value2, "iskptaxstore");
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