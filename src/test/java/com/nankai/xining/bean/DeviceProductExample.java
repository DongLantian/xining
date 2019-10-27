package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class DeviceProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceProductExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNkNoIsNull() {
            addCriterion("nk_no is null");
            return (Criteria) this;
        }

        public Criteria andNkNoIsNotNull() {
            addCriterion("nk_no is not null");
            return (Criteria) this;
        }

        public Criteria andNkNoEqualTo(Integer value) {
            addCriterion("nk_no =", value, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoNotEqualTo(Integer value) {
            addCriterion("nk_no <>", value, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoGreaterThan(Integer value) {
            addCriterion("nk_no >", value, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("nk_no >=", value, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoLessThan(Integer value) {
            addCriterion("nk_no <", value, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoLessThanOrEqualTo(Integer value) {
            addCriterion("nk_no <=", value, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoIn(List<Integer> values) {
            addCriterion("nk_no in", values, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoNotIn(List<Integer> values) {
            addCriterion("nk_no not in", values, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoBetween(Integer value1, Integer value2) {
            addCriterion("nk_no between", value1, value2, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoNotBetween(Integer value1, Integer value2) {
            addCriterion("nk_no not between", value1, value2, "nkNo");
            return (Criteria) this;
        }

        public Criteria andDevicetotalIdIsNull() {
            addCriterion("devicetotal_id is null");
            return (Criteria) this;
        }

        public Criteria andDevicetotalIdIsNotNull() {
            addCriterion("devicetotal_id is not null");
            return (Criteria) this;
        }

        public Criteria andDevicetotalIdEqualTo(Integer value) {
            addCriterion("devicetotal_id =", value, "devicetotalId");
            return (Criteria) this;
        }

        public Criteria andDevicetotalIdNotEqualTo(Integer value) {
            addCriterion("devicetotal_id <>", value, "devicetotalId");
            return (Criteria) this;
        }

        public Criteria andDevicetotalIdGreaterThan(Integer value) {
            addCriterion("devicetotal_id >", value, "devicetotalId");
            return (Criteria) this;
        }

        public Criteria andDevicetotalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("devicetotal_id >=", value, "devicetotalId");
            return (Criteria) this;
        }

        public Criteria andDevicetotalIdLessThan(Integer value) {
            addCriterion("devicetotal_id <", value, "devicetotalId");
            return (Criteria) this;
        }

        public Criteria andDevicetotalIdLessThanOrEqualTo(Integer value) {
            addCriterion("devicetotal_id <=", value, "devicetotalId");
            return (Criteria) this;
        }

        public Criteria andDevicetotalIdIn(List<Integer> values) {
            addCriterion("devicetotal_id in", values, "devicetotalId");
            return (Criteria) this;
        }

        public Criteria andDevicetotalIdNotIn(List<Integer> values) {
            addCriterion("devicetotal_id not in", values, "devicetotalId");
            return (Criteria) this;
        }

        public Criteria andDevicetotalIdBetween(Integer value1, Integer value2) {
            addCriterion("devicetotal_id between", value1, value2, "devicetotalId");
            return (Criteria) this;
        }

        public Criteria andDevicetotalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("devicetotal_id not between", value1, value2, "devicetotalId");
            return (Criteria) this;
        }

        public Criteria andDeviceNoIsNull() {
            addCriterion("device_no is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNoIsNotNull() {
            addCriterion("device_no is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNoEqualTo(Integer value) {
            addCriterion("device_no =", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoNotEqualTo(Integer value) {
            addCriterion("device_no <>", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoGreaterThan(Integer value) {
            addCriterion("device_no >", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_no >=", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoLessThan(Integer value) {
            addCriterion("device_no <", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoLessThanOrEqualTo(Integer value) {
            addCriterion("device_no <=", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoIn(List<Integer> values) {
            addCriterion("device_no in", values, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoNotIn(List<Integer> values) {
            addCriterion("device_no not in", values, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoBetween(Integer value1, Integer value2) {
            addCriterion("device_no between", value1, value2, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoNotBetween(Integer value1, Integer value2) {
            addCriterion("device_no not between", value1, value2, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNull() {
            addCriterion("device_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("device_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(Integer value) {
            addCriterion("device_id =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(Integer value) {
            addCriterion("device_id <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(Integer value) {
            addCriterion("device_id >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_id >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(Integer value) {
            addCriterion("device_id <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(Integer value) {
            addCriterion("device_id <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<Integer> values) {
            addCriterion("device_id in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<Integer> values) {
            addCriterion("device_id not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(Integer value1, Integer value2) {
            addCriterion("device_id between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("device_id not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andActivitiesCategoryDecIsNull() {
            addCriterion("activities_category_dec is null");
            return (Criteria) this;
        }

        public Criteria andActivitiesCategoryDecIsNotNull() {
            addCriterion("activities_category_dec is not null");
            return (Criteria) this;
        }

        public Criteria andActivitiesCategoryDecEqualTo(String value) {
            addCriterion("activities_category_dec =", value, "activitiesCategoryDec");
            return (Criteria) this;
        }

        public Criteria andActivitiesCategoryDecNotEqualTo(String value) {
            addCriterion("activities_category_dec <>", value, "activitiesCategoryDec");
            return (Criteria) this;
        }

        public Criteria andActivitiesCategoryDecGreaterThan(String value) {
            addCriterion("activities_category_dec >", value, "activitiesCategoryDec");
            return (Criteria) this;
        }

        public Criteria andActivitiesCategoryDecGreaterThanOrEqualTo(String value) {
            addCriterion("activities_category_dec >=", value, "activitiesCategoryDec");
            return (Criteria) this;
        }

        public Criteria andActivitiesCategoryDecLessThan(String value) {
            addCriterion("activities_category_dec <", value, "activitiesCategoryDec");
            return (Criteria) this;
        }

        public Criteria andActivitiesCategoryDecLessThanOrEqualTo(String value) {
            addCriterion("activities_category_dec <=", value, "activitiesCategoryDec");
            return (Criteria) this;
        }

        public Criteria andActivitiesCategoryDecLike(String value) {
            addCriterion("activities_category_dec like", value, "activitiesCategoryDec");
            return (Criteria) this;
        }

        public Criteria andActivitiesCategoryDecNotLike(String value) {
            addCriterion("activities_category_dec not like", value, "activitiesCategoryDec");
            return (Criteria) this;
        }

        public Criteria andActivitiesCategoryDecIn(List<String> values) {
            addCriterion("activities_category_dec in", values, "activitiesCategoryDec");
            return (Criteria) this;
        }

        public Criteria andActivitiesCategoryDecNotIn(List<String> values) {
            addCriterion("activities_category_dec not in", values, "activitiesCategoryDec");
            return (Criteria) this;
        }

        public Criteria andActivitiesCategoryDecBetween(String value1, String value2) {
            addCriterion("activities_category_dec between", value1, value2, "activitiesCategoryDec");
            return (Criteria) this;
        }

        public Criteria andActivitiesCategoryDecNotBetween(String value1, String value2) {
            addCriterion("activities_category_dec not between", value1, value2, "activitiesCategoryDec");
            return (Criteria) this;
        }

        public Criteria andActivitiesCategoryIsNull() {
            addCriterion("activities_category is null");
            return (Criteria) this;
        }

        public Criteria andActivitiesCategoryIsNotNull() {
            addCriterion("activities_category is not null");
            return (Criteria) this;
        }

        public Criteria andActivitiesCategoryEqualTo(String value) {
            addCriterion("activities_category =", value, "activitiesCategory");
            return (Criteria) this;
        }

        public Criteria andActivitiesCategoryNotEqualTo(String value) {
            addCriterion("activities_category <>", value, "activitiesCategory");
            return (Criteria) this;
        }

        public Criteria andActivitiesCategoryGreaterThan(String value) {
            addCriterion("activities_category >", value, "activitiesCategory");
            return (Criteria) this;
        }

        public Criteria andActivitiesCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("activities_category >=", value, "activitiesCategory");
            return (Criteria) this;
        }

        public Criteria andActivitiesCategoryLessThan(String value) {
            addCriterion("activities_category <", value, "activitiesCategory");
            return (Criteria) this;
        }

        public Criteria andActivitiesCategoryLessThanOrEqualTo(String value) {
            addCriterion("activities_category <=", value, "activitiesCategory");
            return (Criteria) this;
        }

        public Criteria andActivitiesCategoryLike(String value) {
            addCriterion("activities_category like", value, "activitiesCategory");
            return (Criteria) this;
        }

        public Criteria andActivitiesCategoryNotLike(String value) {
            addCriterion("activities_category not like", value, "activitiesCategory");
            return (Criteria) this;
        }

        public Criteria andActivitiesCategoryIn(List<String> values) {
            addCriterion("activities_category in", values, "activitiesCategory");
            return (Criteria) this;
        }

        public Criteria andActivitiesCategoryNotIn(List<String> values) {
            addCriterion("activities_category not in", values, "activitiesCategory");
            return (Criteria) this;
        }

        public Criteria andActivitiesCategoryBetween(String value1, String value2) {
            addCriterion("activities_category between", value1, value2, "activitiesCategory");
            return (Criteria) this;
        }

        public Criteria andActivitiesCategoryNotBetween(String value1, String value2) {
            addCriterion("activities_category not between", value1, value2, "activitiesCategory");
            return (Criteria) this;
        }

        public Criteria andNameCategoryDecIsNull() {
            addCriterion("name_category_dec is null");
            return (Criteria) this;
        }

        public Criteria andNameCategoryDecIsNotNull() {
            addCriterion("name_category_dec is not null");
            return (Criteria) this;
        }

        public Criteria andNameCategoryDecEqualTo(String value) {
            addCriterion("name_category_dec =", value, "nameCategoryDec");
            return (Criteria) this;
        }

        public Criteria andNameCategoryDecNotEqualTo(String value) {
            addCriterion("name_category_dec <>", value, "nameCategoryDec");
            return (Criteria) this;
        }

        public Criteria andNameCategoryDecGreaterThan(String value) {
            addCriterion("name_category_dec >", value, "nameCategoryDec");
            return (Criteria) this;
        }

        public Criteria andNameCategoryDecGreaterThanOrEqualTo(String value) {
            addCriterion("name_category_dec >=", value, "nameCategoryDec");
            return (Criteria) this;
        }

        public Criteria andNameCategoryDecLessThan(String value) {
            addCriterion("name_category_dec <", value, "nameCategoryDec");
            return (Criteria) this;
        }

        public Criteria andNameCategoryDecLessThanOrEqualTo(String value) {
            addCriterion("name_category_dec <=", value, "nameCategoryDec");
            return (Criteria) this;
        }

        public Criteria andNameCategoryDecLike(String value) {
            addCriterion("name_category_dec like", value, "nameCategoryDec");
            return (Criteria) this;
        }

        public Criteria andNameCategoryDecNotLike(String value) {
            addCriterion("name_category_dec not like", value, "nameCategoryDec");
            return (Criteria) this;
        }

        public Criteria andNameCategoryDecIn(List<String> values) {
            addCriterion("name_category_dec in", values, "nameCategoryDec");
            return (Criteria) this;
        }

        public Criteria andNameCategoryDecNotIn(List<String> values) {
            addCriterion("name_category_dec not in", values, "nameCategoryDec");
            return (Criteria) this;
        }

        public Criteria andNameCategoryDecBetween(String value1, String value2) {
            addCriterion("name_category_dec between", value1, value2, "nameCategoryDec");
            return (Criteria) this;
        }

        public Criteria andNameCategoryDecNotBetween(String value1, String value2) {
            addCriterion("name_category_dec not between", value1, value2, "nameCategoryDec");
            return (Criteria) this;
        }

        public Criteria andNameCategoryIsNull() {
            addCriterion("name_category is null");
            return (Criteria) this;
        }

        public Criteria andNameCategoryIsNotNull() {
            addCriterion("name_category is not null");
            return (Criteria) this;
        }

        public Criteria andNameCategoryEqualTo(String value) {
            addCriterion("name_category =", value, "nameCategory");
            return (Criteria) this;
        }

        public Criteria andNameCategoryNotEqualTo(String value) {
            addCriterion("name_category <>", value, "nameCategory");
            return (Criteria) this;
        }

        public Criteria andNameCategoryGreaterThan(String value) {
            addCriterion("name_category >", value, "nameCategory");
            return (Criteria) this;
        }

        public Criteria andNameCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("name_category >=", value, "nameCategory");
            return (Criteria) this;
        }

        public Criteria andNameCategoryLessThan(String value) {
            addCriterion("name_category <", value, "nameCategory");
            return (Criteria) this;
        }

        public Criteria andNameCategoryLessThanOrEqualTo(String value) {
            addCriterion("name_category <=", value, "nameCategory");
            return (Criteria) this;
        }

        public Criteria andNameCategoryLike(String value) {
            addCriterion("name_category like", value, "nameCategory");
            return (Criteria) this;
        }

        public Criteria andNameCategoryNotLike(String value) {
            addCriterion("name_category not like", value, "nameCategory");
            return (Criteria) this;
        }

        public Criteria andNameCategoryIn(List<String> values) {
            addCriterion("name_category in", values, "nameCategory");
            return (Criteria) this;
        }

        public Criteria andNameCategoryNotIn(List<String> values) {
            addCriterion("name_category not in", values, "nameCategory");
            return (Criteria) this;
        }

        public Criteria andNameCategoryBetween(String value1, String value2) {
            addCriterion("name_category between", value1, value2, "nameCategory");
            return (Criteria) this;
        }

        public Criteria andNameCategoryNotBetween(String value1, String value2) {
            addCriterion("name_category not between", value1, value2, "nameCategory");
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

        public Criteria andDrainageProcessDecIsNull() {
            addCriterion("drainage_process_dec is null");
            return (Criteria) this;
        }

        public Criteria andDrainageProcessDecIsNotNull() {
            addCriterion("drainage_process_dec is not null");
            return (Criteria) this;
        }

        public Criteria andDrainageProcessDecEqualTo(String value) {
            addCriterion("drainage_process_dec =", value, "drainageProcessDec");
            return (Criteria) this;
        }

        public Criteria andDrainageProcessDecNotEqualTo(String value) {
            addCriterion("drainage_process_dec <>", value, "drainageProcessDec");
            return (Criteria) this;
        }

        public Criteria andDrainageProcessDecGreaterThan(String value) {
            addCriterion("drainage_process_dec >", value, "drainageProcessDec");
            return (Criteria) this;
        }

        public Criteria andDrainageProcessDecGreaterThanOrEqualTo(String value) {
            addCriterion("drainage_process_dec >=", value, "drainageProcessDec");
            return (Criteria) this;
        }

        public Criteria andDrainageProcessDecLessThan(String value) {
            addCriterion("drainage_process_dec <", value, "drainageProcessDec");
            return (Criteria) this;
        }

        public Criteria andDrainageProcessDecLessThanOrEqualTo(String value) {
            addCriterion("drainage_process_dec <=", value, "drainageProcessDec");
            return (Criteria) this;
        }

        public Criteria andDrainageProcessDecLike(String value) {
            addCriterion("drainage_process_dec like", value, "drainageProcessDec");
            return (Criteria) this;
        }

        public Criteria andDrainageProcessDecNotLike(String value) {
            addCriterion("drainage_process_dec not like", value, "drainageProcessDec");
            return (Criteria) this;
        }

        public Criteria andDrainageProcessDecIn(List<String> values) {
            addCriterion("drainage_process_dec in", values, "drainageProcessDec");
            return (Criteria) this;
        }

        public Criteria andDrainageProcessDecNotIn(List<String> values) {
            addCriterion("drainage_process_dec not in", values, "drainageProcessDec");
            return (Criteria) this;
        }

        public Criteria andDrainageProcessDecBetween(String value1, String value2) {
            addCriterion("drainage_process_dec between", value1, value2, "drainageProcessDec");
            return (Criteria) this;
        }

        public Criteria andDrainageProcessDecNotBetween(String value1, String value2) {
            addCriterion("drainage_process_dec not between", value1, value2, "drainageProcessDec");
            return (Criteria) this;
        }

        public Criteria andDrainageProcessIsNull() {
            addCriterion("drainage_process is null");
            return (Criteria) this;
        }

        public Criteria andDrainageProcessIsNotNull() {
            addCriterion("drainage_process is not null");
            return (Criteria) this;
        }

        public Criteria andDrainageProcessEqualTo(String value) {
            addCriterion("drainage_process =", value, "drainageProcess");
            return (Criteria) this;
        }

        public Criteria andDrainageProcessNotEqualTo(String value) {
            addCriterion("drainage_process <>", value, "drainageProcess");
            return (Criteria) this;
        }

        public Criteria andDrainageProcessGreaterThan(String value) {
            addCriterion("drainage_process >", value, "drainageProcess");
            return (Criteria) this;
        }

        public Criteria andDrainageProcessGreaterThanOrEqualTo(String value) {
            addCriterion("drainage_process >=", value, "drainageProcess");
            return (Criteria) this;
        }

        public Criteria andDrainageProcessLessThan(String value) {
            addCriterion("drainage_process <", value, "drainageProcess");
            return (Criteria) this;
        }

        public Criteria andDrainageProcessLessThanOrEqualTo(String value) {
            addCriterion("drainage_process <=", value, "drainageProcess");
            return (Criteria) this;
        }

        public Criteria andDrainageProcessLike(String value) {
            addCriterion("drainage_process like", value, "drainageProcess");
            return (Criteria) this;
        }

        public Criteria andDrainageProcessNotLike(String value) {
            addCriterion("drainage_process not like", value, "drainageProcess");
            return (Criteria) this;
        }

        public Criteria andDrainageProcessIn(List<String> values) {
            addCriterion("drainage_process in", values, "drainageProcess");
            return (Criteria) this;
        }

        public Criteria andDrainageProcessNotIn(List<String> values) {
            addCriterion("drainage_process not in", values, "drainageProcess");
            return (Criteria) this;
        }

        public Criteria andDrainageProcessBetween(String value1, String value2) {
            addCriterion("drainage_process between", value1, value2, "drainageProcess");
            return (Criteria) this;
        }

        public Criteria andDrainageProcessNotBetween(String value1, String value2) {
            addCriterion("drainage_process not between", value1, value2, "drainageProcess");
            return (Criteria) this;
        }

        public Criteria andUintIsNull() {
            addCriterion("uint is null");
            return (Criteria) this;
        }

        public Criteria andUintIsNotNull() {
            addCriterion("uint is not null");
            return (Criteria) this;
        }

        public Criteria andUintEqualTo(String value) {
            addCriterion("uint =", value, "uint");
            return (Criteria) this;
        }

        public Criteria andUintNotEqualTo(String value) {
            addCriterion("uint <>", value, "uint");
            return (Criteria) this;
        }

        public Criteria andUintGreaterThan(String value) {
            addCriterion("uint >", value, "uint");
            return (Criteria) this;
        }

        public Criteria andUintGreaterThanOrEqualTo(String value) {
            addCriterion("uint >=", value, "uint");
            return (Criteria) this;
        }

        public Criteria andUintLessThan(String value) {
            addCriterion("uint <", value, "uint");
            return (Criteria) this;
        }

        public Criteria andUintLessThanOrEqualTo(String value) {
            addCriterion("uint <=", value, "uint");
            return (Criteria) this;
        }

        public Criteria andUintLike(String value) {
            addCriterion("uint like", value, "uint");
            return (Criteria) this;
        }

        public Criteria andUintNotLike(String value) {
            addCriterion("uint not like", value, "uint");
            return (Criteria) this;
        }

        public Criteria andUintIn(List<String> values) {
            addCriterion("uint in", values, "uint");
            return (Criteria) this;
        }

        public Criteria andUintNotIn(List<String> values) {
            addCriterion("uint not in", values, "uint");
            return (Criteria) this;
        }

        public Criteria andUintBetween(String value1, String value2) {
            addCriterion("uint between", value1, value2, "uint");
            return (Criteria) this;
        }

        public Criteria andUintNotBetween(String value1, String value2) {
            addCriterion("uint not between", value1, value2, "uint");
            return (Criteria) this;
        }

        public Criteria andAnnualOutputIsNull() {
            addCriterion("annual_output is null");
            return (Criteria) this;
        }

        public Criteria andAnnualOutputIsNotNull() {
            addCriterion("annual_output is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualOutputEqualTo(Double value) {
            addCriterion("annual_output =", value, "annualOutput");
            return (Criteria) this;
        }

        public Criteria andAnnualOutputNotEqualTo(Double value) {
            addCriterion("annual_output <>", value, "annualOutput");
            return (Criteria) this;
        }

        public Criteria andAnnualOutputGreaterThan(Double value) {
            addCriterion("annual_output >", value, "annualOutput");
            return (Criteria) this;
        }

        public Criteria andAnnualOutputGreaterThanOrEqualTo(Double value) {
            addCriterion("annual_output >=", value, "annualOutput");
            return (Criteria) this;
        }

        public Criteria andAnnualOutputLessThan(Double value) {
            addCriterion("annual_output <", value, "annualOutput");
            return (Criteria) this;
        }

        public Criteria andAnnualOutputLessThanOrEqualTo(Double value) {
            addCriterion("annual_output <=", value, "annualOutput");
            return (Criteria) this;
        }

        public Criteria andAnnualOutputIn(List<Double> values) {
            addCriterion("annual_output in", values, "annualOutput");
            return (Criteria) this;
        }

        public Criteria andAnnualOutputNotIn(List<Double> values) {
            addCriterion("annual_output not in", values, "annualOutput");
            return (Criteria) this;
        }

        public Criteria andAnnualOutputBetween(Double value1, Double value2) {
            addCriterion("annual_output between", value1, value2, "annualOutput");
            return (Criteria) this;
        }

        public Criteria andAnnualOutputNotBetween(Double value1, Double value2) {
            addCriterion("annual_output not between", value1, value2, "annualOutput");
            return (Criteria) this;
        }

        public Criteria andSccCodeIsNull() {
            addCriterion("scc_code is null");
            return (Criteria) this;
        }

        public Criteria andSccCodeIsNotNull() {
            addCriterion("scc_code is not null");
            return (Criteria) this;
        }

        public Criteria andSccCodeEqualTo(String value) {
            addCriterion("scc_code =", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeNotEqualTo(String value) {
            addCriterion("scc_code <>", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeGreaterThan(String value) {
            addCriterion("scc_code >", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeGreaterThanOrEqualTo(String value) {
            addCriterion("scc_code >=", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeLessThan(String value) {
            addCriterion("scc_code <", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeLessThanOrEqualTo(String value) {
            addCriterion("scc_code <=", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeLike(String value) {
            addCriterion("scc_code like", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeNotLike(String value) {
            addCriterion("scc_code not like", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeIn(List<String> values) {
            addCriterion("scc_code in", values, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeNotIn(List<String> values) {
            addCriterion("scc_code not in", values, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeBetween(String value1, String value2) {
            addCriterion("scc_code between", value1, value2, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeNotBetween(String value1, String value2) {
            addCriterion("scc_code not between", value1, value2, "sccCode");
            return (Criteria) this;
        }

        public Criteria andFactorStatusIsNull() {
            addCriterion("factor_status is null");
            return (Criteria) this;
        }

        public Criteria andFactorStatusIsNotNull() {
            addCriterion("factor_status is not null");
            return (Criteria) this;
        }

        public Criteria andFactorStatusEqualTo(Byte value) {
            addCriterion("factor_status =", value, "factorStatus");
            return (Criteria) this;
        }

        public Criteria andFactorStatusNotEqualTo(Byte value) {
            addCriterion("factor_status <>", value, "factorStatus");
            return (Criteria) this;
        }

        public Criteria andFactorStatusGreaterThan(Byte value) {
            addCriterion("factor_status >", value, "factorStatus");
            return (Criteria) this;
        }

        public Criteria andFactorStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("factor_status >=", value, "factorStatus");
            return (Criteria) this;
        }

        public Criteria andFactorStatusLessThan(Byte value) {
            addCriterion("factor_status <", value, "factorStatus");
            return (Criteria) this;
        }

        public Criteria andFactorStatusLessThanOrEqualTo(Byte value) {
            addCriterion("factor_status <=", value, "factorStatus");
            return (Criteria) this;
        }

        public Criteria andFactorStatusIn(List<Byte> values) {
            addCriterion("factor_status in", values, "factorStatus");
            return (Criteria) this;
        }

        public Criteria andFactorStatusNotIn(List<Byte> values) {
            addCriterion("factor_status not in", values, "factorStatus");
            return (Criteria) this;
        }

        public Criteria andFactorStatusBetween(Byte value1, Byte value2) {
            addCriterion("factor_status between", value1, value2, "factorStatus");
            return (Criteria) this;
        }

        public Criteria andFactorStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("factor_status not between", value1, value2, "factorStatus");
            return (Criteria) this;
        }

        public Criteria andFactorNoxIsNull() {
            addCriterion("factor_nox is null");
            return (Criteria) this;
        }

        public Criteria andFactorNoxIsNotNull() {
            addCriterion("factor_nox is not null");
            return (Criteria) this;
        }

        public Criteria andFactorNoxEqualTo(Double value) {
            addCriterion("factor_nox =", value, "factorNox");
            return (Criteria) this;
        }

        public Criteria andFactorNoxNotEqualTo(Double value) {
            addCriterion("factor_nox <>", value, "factorNox");
            return (Criteria) this;
        }

        public Criteria andFactorNoxGreaterThan(Double value) {
            addCriterion("factor_nox >", value, "factorNox");
            return (Criteria) this;
        }

        public Criteria andFactorNoxGreaterThanOrEqualTo(Double value) {
            addCriterion("factor_nox >=", value, "factorNox");
            return (Criteria) this;
        }

        public Criteria andFactorNoxLessThan(Double value) {
            addCriterion("factor_nox <", value, "factorNox");
            return (Criteria) this;
        }

        public Criteria andFactorNoxLessThanOrEqualTo(Double value) {
            addCriterion("factor_nox <=", value, "factorNox");
            return (Criteria) this;
        }

        public Criteria andFactorNoxIn(List<Double> values) {
            addCriterion("factor_nox in", values, "factorNox");
            return (Criteria) this;
        }

        public Criteria andFactorNoxNotIn(List<Double> values) {
            addCriterion("factor_nox not in", values, "factorNox");
            return (Criteria) this;
        }

        public Criteria andFactorNoxBetween(Double value1, Double value2) {
            addCriterion("factor_nox between", value1, value2, "factorNox");
            return (Criteria) this;
        }

        public Criteria andFactorNoxNotBetween(Double value1, Double value2) {
            addCriterion("factor_nox not between", value1, value2, "factorNox");
            return (Criteria) this;
        }

        public Criteria andNoxIsNull() {
            addCriterion("nox is null");
            return (Criteria) this;
        }

        public Criteria andNoxIsNotNull() {
            addCriterion("nox is not null");
            return (Criteria) this;
        }

        public Criteria andNoxEqualTo(Double value) {
            addCriterion("nox =", value, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxNotEqualTo(Double value) {
            addCriterion("nox <>", value, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxGreaterThan(Double value) {
            addCriterion("nox >", value, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxGreaterThanOrEqualTo(Double value) {
            addCriterion("nox >=", value, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxLessThan(Double value) {
            addCriterion("nox <", value, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxLessThanOrEqualTo(Double value) {
            addCriterion("nox <=", value, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxIn(List<Double> values) {
            addCriterion("nox in", values, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxNotIn(List<Double> values) {
            addCriterion("nox not in", values, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxBetween(Double value1, Double value2) {
            addCriterion("nox between", value1, value2, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxNotBetween(Double value1, Double value2) {
            addCriterion("nox not between", value1, value2, "nox");
            return (Criteria) this;
        }

        public Criteria andFactorCoIsNull() {
            addCriterion("factor_co is null");
            return (Criteria) this;
        }

        public Criteria andFactorCoIsNotNull() {
            addCriterion("factor_co is not null");
            return (Criteria) this;
        }

        public Criteria andFactorCoEqualTo(Double value) {
            addCriterion("factor_co =", value, "factorCo");
            return (Criteria) this;
        }

        public Criteria andFactorCoNotEqualTo(Double value) {
            addCriterion("factor_co <>", value, "factorCo");
            return (Criteria) this;
        }

        public Criteria andFactorCoGreaterThan(Double value) {
            addCriterion("factor_co >", value, "factorCo");
            return (Criteria) this;
        }

        public Criteria andFactorCoGreaterThanOrEqualTo(Double value) {
            addCriterion("factor_co >=", value, "factorCo");
            return (Criteria) this;
        }

        public Criteria andFactorCoLessThan(Double value) {
            addCriterion("factor_co <", value, "factorCo");
            return (Criteria) this;
        }

        public Criteria andFactorCoLessThanOrEqualTo(Double value) {
            addCriterion("factor_co <=", value, "factorCo");
            return (Criteria) this;
        }

        public Criteria andFactorCoIn(List<Double> values) {
            addCriterion("factor_co in", values, "factorCo");
            return (Criteria) this;
        }

        public Criteria andFactorCoNotIn(List<Double> values) {
            addCriterion("factor_co not in", values, "factorCo");
            return (Criteria) this;
        }

        public Criteria andFactorCoBetween(Double value1, Double value2) {
            addCriterion("factor_co between", value1, value2, "factorCo");
            return (Criteria) this;
        }

        public Criteria andFactorCoNotBetween(Double value1, Double value2) {
            addCriterion("factor_co not between", value1, value2, "factorCo");
            return (Criteria) this;
        }

        public Criteria andCoIsNull() {
            addCriterion("co is null");
            return (Criteria) this;
        }

        public Criteria andCoIsNotNull() {
            addCriterion("co is not null");
            return (Criteria) this;
        }

        public Criteria andCoEqualTo(Double value) {
            addCriterion("co =", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoNotEqualTo(Double value) {
            addCriterion("co <>", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoGreaterThan(Double value) {
            addCriterion("co >", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoGreaterThanOrEqualTo(Double value) {
            addCriterion("co >=", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoLessThan(Double value) {
            addCriterion("co <", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoLessThanOrEqualTo(Double value) {
            addCriterion("co <=", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoIn(List<Double> values) {
            addCriterion("co in", values, "co");
            return (Criteria) this;
        }

        public Criteria andCoNotIn(List<Double> values) {
            addCriterion("co not in", values, "co");
            return (Criteria) this;
        }

        public Criteria andCoBetween(Double value1, Double value2) {
            addCriterion("co between", value1, value2, "co");
            return (Criteria) this;
        }

        public Criteria andCoNotBetween(Double value1, Double value2) {
            addCriterion("co not between", value1, value2, "co");
            return (Criteria) this;
        }

        public Criteria andFactorPm10IsNull() {
            addCriterion("factor_pm10 is null");
            return (Criteria) this;
        }

        public Criteria andFactorPm10IsNotNull() {
            addCriterion("factor_pm10 is not null");
            return (Criteria) this;
        }

        public Criteria andFactorPm10EqualTo(Double value) {
            addCriterion("factor_pm10 =", value, "factorPm10");
            return (Criteria) this;
        }

        public Criteria andFactorPm10NotEqualTo(Double value) {
            addCriterion("factor_pm10 <>", value, "factorPm10");
            return (Criteria) this;
        }

        public Criteria andFactorPm10GreaterThan(Double value) {
            addCriterion("factor_pm10 >", value, "factorPm10");
            return (Criteria) this;
        }

        public Criteria andFactorPm10GreaterThanOrEqualTo(Double value) {
            addCriterion("factor_pm10 >=", value, "factorPm10");
            return (Criteria) this;
        }

        public Criteria andFactorPm10LessThan(Double value) {
            addCriterion("factor_pm10 <", value, "factorPm10");
            return (Criteria) this;
        }

        public Criteria andFactorPm10LessThanOrEqualTo(Double value) {
            addCriterion("factor_pm10 <=", value, "factorPm10");
            return (Criteria) this;
        }

        public Criteria andFactorPm10In(List<Double> values) {
            addCriterion("factor_pm10 in", values, "factorPm10");
            return (Criteria) this;
        }

        public Criteria andFactorPm10NotIn(List<Double> values) {
            addCriterion("factor_pm10 not in", values, "factorPm10");
            return (Criteria) this;
        }

        public Criteria andFactorPm10Between(Double value1, Double value2) {
            addCriterion("factor_pm10 between", value1, value2, "factorPm10");
            return (Criteria) this;
        }

        public Criteria andFactorPm10NotBetween(Double value1, Double value2) {
            addCriterion("factor_pm10 not between", value1, value2, "factorPm10");
            return (Criteria) this;
        }

        public Criteria andPm10IsNull() {
            addCriterion("pm10 is null");
            return (Criteria) this;
        }

        public Criteria andPm10IsNotNull() {
            addCriterion("pm10 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10EqualTo(Double value) {
            addCriterion("pm10 =", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10NotEqualTo(Double value) {
            addCriterion("pm10 <>", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10GreaterThan(Double value) {
            addCriterion("pm10 >", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10GreaterThanOrEqualTo(Double value) {
            addCriterion("pm10 >=", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10LessThan(Double value) {
            addCriterion("pm10 <", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10LessThanOrEqualTo(Double value) {
            addCriterion("pm10 <=", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10In(List<Double> values) {
            addCriterion("pm10 in", values, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10NotIn(List<Double> values) {
            addCriterion("pm10 not in", values, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10Between(Double value1, Double value2) {
            addCriterion("pm10 between", value1, value2, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10NotBetween(Double value1, Double value2) {
            addCriterion("pm10 not between", value1, value2, "pm10");
            return (Criteria) this;
        }

        public Criteria andFactorPm25IsNull() {
            addCriterion("factor_pm25 is null");
            return (Criteria) this;
        }

        public Criteria andFactorPm25IsNotNull() {
            addCriterion("factor_pm25 is not null");
            return (Criteria) this;
        }

        public Criteria andFactorPm25EqualTo(Double value) {
            addCriterion("factor_pm25 =", value, "factorPm25");
            return (Criteria) this;
        }

        public Criteria andFactorPm25NotEqualTo(Double value) {
            addCriterion("factor_pm25 <>", value, "factorPm25");
            return (Criteria) this;
        }

        public Criteria andFactorPm25GreaterThan(Double value) {
            addCriterion("factor_pm25 >", value, "factorPm25");
            return (Criteria) this;
        }

        public Criteria andFactorPm25GreaterThanOrEqualTo(Double value) {
            addCriterion("factor_pm25 >=", value, "factorPm25");
            return (Criteria) this;
        }

        public Criteria andFactorPm25LessThan(Double value) {
            addCriterion("factor_pm25 <", value, "factorPm25");
            return (Criteria) this;
        }

        public Criteria andFactorPm25LessThanOrEqualTo(Double value) {
            addCriterion("factor_pm25 <=", value, "factorPm25");
            return (Criteria) this;
        }

        public Criteria andFactorPm25In(List<Double> values) {
            addCriterion("factor_pm25 in", values, "factorPm25");
            return (Criteria) this;
        }

        public Criteria andFactorPm25NotIn(List<Double> values) {
            addCriterion("factor_pm25 not in", values, "factorPm25");
            return (Criteria) this;
        }

        public Criteria andFactorPm25Between(Double value1, Double value2) {
            addCriterion("factor_pm25 between", value1, value2, "factorPm25");
            return (Criteria) this;
        }

        public Criteria andFactorPm25NotBetween(Double value1, Double value2) {
            addCriterion("factor_pm25 not between", value1, value2, "factorPm25");
            return (Criteria) this;
        }

        public Criteria andPm25IsNull() {
            addCriterion("pm25 is null");
            return (Criteria) this;
        }

        public Criteria andPm25IsNotNull() {
            addCriterion("pm25 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25EqualTo(Double value) {
            addCriterion("pm25 =", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25NotEqualTo(Double value) {
            addCriterion("pm25 <>", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25GreaterThan(Double value) {
            addCriterion("pm25 >", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25GreaterThanOrEqualTo(Double value) {
            addCriterion("pm25 >=", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25LessThan(Double value) {
            addCriterion("pm25 <", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25LessThanOrEqualTo(Double value) {
            addCriterion("pm25 <=", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25In(List<Double> values) {
            addCriterion("pm25 in", values, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25NotIn(List<Double> values) {
            addCriterion("pm25 not in", values, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25Between(Double value1, Double value2) {
            addCriterion("pm25 between", value1, value2, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25NotBetween(Double value1, Double value2) {
            addCriterion("pm25 not between", value1, value2, "pm25");
            return (Criteria) this;
        }

        public Criteria andFactorPmIsNull() {
            addCriterion("factor_pm is null");
            return (Criteria) this;
        }

        public Criteria andFactorPmIsNotNull() {
            addCriterion("factor_pm is not null");
            return (Criteria) this;
        }

        public Criteria andFactorPmEqualTo(Double value) {
            addCriterion("factor_pm =", value, "factorPm");
            return (Criteria) this;
        }

        public Criteria andFactorPmNotEqualTo(Double value) {
            addCriterion("factor_pm <>", value, "factorPm");
            return (Criteria) this;
        }

        public Criteria andFactorPmGreaterThan(Double value) {
            addCriterion("factor_pm >", value, "factorPm");
            return (Criteria) this;
        }

        public Criteria andFactorPmGreaterThanOrEqualTo(Double value) {
            addCriterion("factor_pm >=", value, "factorPm");
            return (Criteria) this;
        }

        public Criteria andFactorPmLessThan(Double value) {
            addCriterion("factor_pm <", value, "factorPm");
            return (Criteria) this;
        }

        public Criteria andFactorPmLessThanOrEqualTo(Double value) {
            addCriterion("factor_pm <=", value, "factorPm");
            return (Criteria) this;
        }

        public Criteria andFactorPmIn(List<Double> values) {
            addCriterion("factor_pm in", values, "factorPm");
            return (Criteria) this;
        }

        public Criteria andFactorPmNotIn(List<Double> values) {
            addCriterion("factor_pm not in", values, "factorPm");
            return (Criteria) this;
        }

        public Criteria andFactorPmBetween(Double value1, Double value2) {
            addCriterion("factor_pm between", value1, value2, "factorPm");
            return (Criteria) this;
        }

        public Criteria andFactorPmNotBetween(Double value1, Double value2) {
            addCriterion("factor_pm not between", value1, value2, "factorPm");
            return (Criteria) this;
        }

        public Criteria andPmIsNull() {
            addCriterion("pm is null");
            return (Criteria) this;
        }

        public Criteria andPmIsNotNull() {
            addCriterion("pm is not null");
            return (Criteria) this;
        }

        public Criteria andPmEqualTo(Double value) {
            addCriterion("pm =", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmNotEqualTo(Double value) {
            addCriterion("pm <>", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmGreaterThan(Double value) {
            addCriterion("pm >", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmGreaterThanOrEqualTo(Double value) {
            addCriterion("pm >=", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmLessThan(Double value) {
            addCriterion("pm <", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmLessThanOrEqualTo(Double value) {
            addCriterion("pm <=", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmIn(List<Double> values) {
            addCriterion("pm in", values, "pm");
            return (Criteria) this;
        }

        public Criteria andPmNotIn(List<Double> values) {
            addCriterion("pm not in", values, "pm");
            return (Criteria) this;
        }

        public Criteria andPmBetween(Double value1, Double value2) {
            addCriterion("pm between", value1, value2, "pm");
            return (Criteria) this;
        }

        public Criteria andPmNotBetween(Double value1, Double value2) {
            addCriterion("pm not between", value1, value2, "pm");
            return (Criteria) this;
        }

        public Criteria andFactorSo2IsNull() {
            addCriterion("factor_so2 is null");
            return (Criteria) this;
        }

        public Criteria andFactorSo2IsNotNull() {
            addCriterion("factor_so2 is not null");
            return (Criteria) this;
        }

        public Criteria andFactorSo2EqualTo(Double value) {
            addCriterion("factor_so2 =", value, "factorSo2");
            return (Criteria) this;
        }

        public Criteria andFactorSo2NotEqualTo(Double value) {
            addCriterion("factor_so2 <>", value, "factorSo2");
            return (Criteria) this;
        }

        public Criteria andFactorSo2GreaterThan(Double value) {
            addCriterion("factor_so2 >", value, "factorSo2");
            return (Criteria) this;
        }

        public Criteria andFactorSo2GreaterThanOrEqualTo(Double value) {
            addCriterion("factor_so2 >=", value, "factorSo2");
            return (Criteria) this;
        }

        public Criteria andFactorSo2LessThan(Double value) {
            addCriterion("factor_so2 <", value, "factorSo2");
            return (Criteria) this;
        }

        public Criteria andFactorSo2LessThanOrEqualTo(Double value) {
            addCriterion("factor_so2 <=", value, "factorSo2");
            return (Criteria) this;
        }

        public Criteria andFactorSo2In(List<Double> values) {
            addCriterion("factor_so2 in", values, "factorSo2");
            return (Criteria) this;
        }

        public Criteria andFactorSo2NotIn(List<Double> values) {
            addCriterion("factor_so2 not in", values, "factorSo2");
            return (Criteria) this;
        }

        public Criteria andFactorSo2Between(Double value1, Double value2) {
            addCriterion("factor_so2 between", value1, value2, "factorSo2");
            return (Criteria) this;
        }

        public Criteria andFactorSo2NotBetween(Double value1, Double value2) {
            addCriterion("factor_so2 not between", value1, value2, "factorSo2");
            return (Criteria) this;
        }

        public Criteria andSo2IsNull() {
            addCriterion("so2 is null");
            return (Criteria) this;
        }

        public Criteria andSo2IsNotNull() {
            addCriterion("so2 is not null");
            return (Criteria) this;
        }

        public Criteria andSo2EqualTo(Double value) {
            addCriterion("so2 =", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2NotEqualTo(Double value) {
            addCriterion("so2 <>", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2GreaterThan(Double value) {
            addCriterion("so2 >", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2GreaterThanOrEqualTo(Double value) {
            addCriterion("so2 >=", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2LessThan(Double value) {
            addCriterion("so2 <", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2LessThanOrEqualTo(Double value) {
            addCriterion("so2 <=", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2In(List<Double> values) {
            addCriterion("so2 in", values, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2NotIn(List<Double> values) {
            addCriterion("so2 not in", values, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2Between(Double value1, Double value2) {
            addCriterion("so2 between", value1, value2, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2NotBetween(Double value1, Double value2) {
            addCriterion("so2 not between", value1, value2, "so2");
            return (Criteria) this;
        }

        public Criteria andFactorVocIsNull() {
            addCriterion("factor_voc is null");
            return (Criteria) this;
        }

        public Criteria andFactorVocIsNotNull() {
            addCriterion("factor_voc is not null");
            return (Criteria) this;
        }

        public Criteria andFactorVocEqualTo(Double value) {
            addCriterion("factor_voc =", value, "factorVoc");
            return (Criteria) this;
        }

        public Criteria andFactorVocNotEqualTo(Double value) {
            addCriterion("factor_voc <>", value, "factorVoc");
            return (Criteria) this;
        }

        public Criteria andFactorVocGreaterThan(Double value) {
            addCriterion("factor_voc >", value, "factorVoc");
            return (Criteria) this;
        }

        public Criteria andFactorVocGreaterThanOrEqualTo(Double value) {
            addCriterion("factor_voc >=", value, "factorVoc");
            return (Criteria) this;
        }

        public Criteria andFactorVocLessThan(Double value) {
            addCriterion("factor_voc <", value, "factorVoc");
            return (Criteria) this;
        }

        public Criteria andFactorVocLessThanOrEqualTo(Double value) {
            addCriterion("factor_voc <=", value, "factorVoc");
            return (Criteria) this;
        }

        public Criteria andFactorVocIn(List<Double> values) {
            addCriterion("factor_voc in", values, "factorVoc");
            return (Criteria) this;
        }

        public Criteria andFactorVocNotIn(List<Double> values) {
            addCriterion("factor_voc not in", values, "factorVoc");
            return (Criteria) this;
        }

        public Criteria andFactorVocBetween(Double value1, Double value2) {
            addCriterion("factor_voc between", value1, value2, "factorVoc");
            return (Criteria) this;
        }

        public Criteria andFactorVocNotBetween(Double value1, Double value2) {
            addCriterion("factor_voc not between", value1, value2, "factorVoc");
            return (Criteria) this;
        }

        public Criteria andVocIsNull() {
            addCriterion("voc is null");
            return (Criteria) this;
        }

        public Criteria andVocIsNotNull() {
            addCriterion("voc is not null");
            return (Criteria) this;
        }

        public Criteria andVocEqualTo(Double value) {
            addCriterion("voc =", value, "voc");
            return (Criteria) this;
        }

        public Criteria andVocNotEqualTo(Double value) {
            addCriterion("voc <>", value, "voc");
            return (Criteria) this;
        }

        public Criteria andVocGreaterThan(Double value) {
            addCriterion("voc >", value, "voc");
            return (Criteria) this;
        }

        public Criteria andVocGreaterThanOrEqualTo(Double value) {
            addCriterion("voc >=", value, "voc");
            return (Criteria) this;
        }

        public Criteria andVocLessThan(Double value) {
            addCriterion("voc <", value, "voc");
            return (Criteria) this;
        }

        public Criteria andVocLessThanOrEqualTo(Double value) {
            addCriterion("voc <=", value, "voc");
            return (Criteria) this;
        }

        public Criteria andVocIn(List<Double> values) {
            addCriterion("voc in", values, "voc");
            return (Criteria) this;
        }

        public Criteria andVocNotIn(List<Double> values) {
            addCriterion("voc not in", values, "voc");
            return (Criteria) this;
        }

        public Criteria andVocBetween(Double value1, Double value2) {
            addCriterion("voc between", value1, value2, "voc");
            return (Criteria) this;
        }

        public Criteria andVocNotBetween(Double value1, Double value2) {
            addCriterion("voc not between", value1, value2, "voc");
            return (Criteria) this;
        }

        public Criteria andFactorNh3IsNull() {
            addCriterion("factor_nh3 is null");
            return (Criteria) this;
        }

        public Criteria andFactorNh3IsNotNull() {
            addCriterion("factor_nh3 is not null");
            return (Criteria) this;
        }

        public Criteria andFactorNh3EqualTo(Double value) {
            addCriterion("factor_nh3 =", value, "factorNh3");
            return (Criteria) this;
        }

        public Criteria andFactorNh3NotEqualTo(Double value) {
            addCriterion("factor_nh3 <>", value, "factorNh3");
            return (Criteria) this;
        }

        public Criteria andFactorNh3GreaterThan(Double value) {
            addCriterion("factor_nh3 >", value, "factorNh3");
            return (Criteria) this;
        }

        public Criteria andFactorNh3GreaterThanOrEqualTo(Double value) {
            addCriterion("factor_nh3 >=", value, "factorNh3");
            return (Criteria) this;
        }

        public Criteria andFactorNh3LessThan(Double value) {
            addCriterion("factor_nh3 <", value, "factorNh3");
            return (Criteria) this;
        }

        public Criteria andFactorNh3LessThanOrEqualTo(Double value) {
            addCriterion("factor_nh3 <=", value, "factorNh3");
            return (Criteria) this;
        }

        public Criteria andFactorNh3In(List<Double> values) {
            addCriterion("factor_nh3 in", values, "factorNh3");
            return (Criteria) this;
        }

        public Criteria andFactorNh3NotIn(List<Double> values) {
            addCriterion("factor_nh3 not in", values, "factorNh3");
            return (Criteria) this;
        }

        public Criteria andFactorNh3Between(Double value1, Double value2) {
            addCriterion("factor_nh3 between", value1, value2, "factorNh3");
            return (Criteria) this;
        }

        public Criteria andFactorNh3NotBetween(Double value1, Double value2) {
            addCriterion("factor_nh3 not between", value1, value2, "factorNh3");
            return (Criteria) this;
        }

        public Criteria andNh3IsNull() {
            addCriterion("nh3 is null");
            return (Criteria) this;
        }

        public Criteria andNh3IsNotNull() {
            addCriterion("nh3 is not null");
            return (Criteria) this;
        }

        public Criteria andNh3EqualTo(Double value) {
            addCriterion("nh3 =", value, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3NotEqualTo(Double value) {
            addCriterion("nh3 <>", value, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3GreaterThan(Double value) {
            addCriterion("nh3 >", value, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3GreaterThanOrEqualTo(Double value) {
            addCriterion("nh3 >=", value, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3LessThan(Double value) {
            addCriterion("nh3 <", value, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3LessThanOrEqualTo(Double value) {
            addCriterion("nh3 <=", value, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3In(List<Double> values) {
            addCriterion("nh3 in", values, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3NotIn(List<Double> values) {
            addCriterion("nh3 not in", values, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3Between(Double value1, Double value2) {
            addCriterion("nh3 between", value1, value2, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3NotBetween(Double value1, Double value2) {
            addCriterion("nh3 not between", value1, value2, "nh3");
            return (Criteria) this;
        }

        public Criteria andFactorOcIsNull() {
            addCriterion("factor_oc is null");
            return (Criteria) this;
        }

        public Criteria andFactorOcIsNotNull() {
            addCriterion("factor_oc is not null");
            return (Criteria) this;
        }

        public Criteria andFactorOcEqualTo(Double value) {
            addCriterion("factor_oc =", value, "factorOc");
            return (Criteria) this;
        }

        public Criteria andFactorOcNotEqualTo(Double value) {
            addCriterion("factor_oc <>", value, "factorOc");
            return (Criteria) this;
        }

        public Criteria andFactorOcGreaterThan(Double value) {
            addCriterion("factor_oc >", value, "factorOc");
            return (Criteria) this;
        }

        public Criteria andFactorOcGreaterThanOrEqualTo(Double value) {
            addCriterion("factor_oc >=", value, "factorOc");
            return (Criteria) this;
        }

        public Criteria andFactorOcLessThan(Double value) {
            addCriterion("factor_oc <", value, "factorOc");
            return (Criteria) this;
        }

        public Criteria andFactorOcLessThanOrEqualTo(Double value) {
            addCriterion("factor_oc <=", value, "factorOc");
            return (Criteria) this;
        }

        public Criteria andFactorOcIn(List<Double> values) {
            addCriterion("factor_oc in", values, "factorOc");
            return (Criteria) this;
        }

        public Criteria andFactorOcNotIn(List<Double> values) {
            addCriterion("factor_oc not in", values, "factorOc");
            return (Criteria) this;
        }

        public Criteria andFactorOcBetween(Double value1, Double value2) {
            addCriterion("factor_oc between", value1, value2, "factorOc");
            return (Criteria) this;
        }

        public Criteria andFactorOcNotBetween(Double value1, Double value2) {
            addCriterion("factor_oc not between", value1, value2, "factorOc");
            return (Criteria) this;
        }

        public Criteria andOcIsNull() {
            addCriterion("oc is null");
            return (Criteria) this;
        }

        public Criteria andOcIsNotNull() {
            addCriterion("oc is not null");
            return (Criteria) this;
        }

        public Criteria andOcEqualTo(Double value) {
            addCriterion("oc =", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcNotEqualTo(Double value) {
            addCriterion("oc <>", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcGreaterThan(Double value) {
            addCriterion("oc >", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcGreaterThanOrEqualTo(Double value) {
            addCriterion("oc >=", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcLessThan(Double value) {
            addCriterion("oc <", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcLessThanOrEqualTo(Double value) {
            addCriterion("oc <=", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcIn(List<Double> values) {
            addCriterion("oc in", values, "oc");
            return (Criteria) this;
        }

        public Criteria andOcNotIn(List<Double> values) {
            addCriterion("oc not in", values, "oc");
            return (Criteria) this;
        }

        public Criteria andOcBetween(Double value1, Double value2) {
            addCriterion("oc between", value1, value2, "oc");
            return (Criteria) this;
        }

        public Criteria andOcNotBetween(Double value1, Double value2) {
            addCriterion("oc not between", value1, value2, "oc");
            return (Criteria) this;
        }

        public Criteria andFactorBcIsNull() {
            addCriterion("factor_bc is null");
            return (Criteria) this;
        }

        public Criteria andFactorBcIsNotNull() {
            addCriterion("factor_bc is not null");
            return (Criteria) this;
        }

        public Criteria andFactorBcEqualTo(Double value) {
            addCriterion("factor_bc =", value, "factorBc");
            return (Criteria) this;
        }

        public Criteria andFactorBcNotEqualTo(Double value) {
            addCriterion("factor_bc <>", value, "factorBc");
            return (Criteria) this;
        }

        public Criteria andFactorBcGreaterThan(Double value) {
            addCriterion("factor_bc >", value, "factorBc");
            return (Criteria) this;
        }

        public Criteria andFactorBcGreaterThanOrEqualTo(Double value) {
            addCriterion("factor_bc >=", value, "factorBc");
            return (Criteria) this;
        }

        public Criteria andFactorBcLessThan(Double value) {
            addCriterion("factor_bc <", value, "factorBc");
            return (Criteria) this;
        }

        public Criteria andFactorBcLessThanOrEqualTo(Double value) {
            addCriterion("factor_bc <=", value, "factorBc");
            return (Criteria) this;
        }

        public Criteria andFactorBcIn(List<Double> values) {
            addCriterion("factor_bc in", values, "factorBc");
            return (Criteria) this;
        }

        public Criteria andFactorBcNotIn(List<Double> values) {
            addCriterion("factor_bc not in", values, "factorBc");
            return (Criteria) this;
        }

        public Criteria andFactorBcBetween(Double value1, Double value2) {
            addCriterion("factor_bc between", value1, value2, "factorBc");
            return (Criteria) this;
        }

        public Criteria andFactorBcNotBetween(Double value1, Double value2) {
            addCriterion("factor_bc not between", value1, value2, "factorBc");
            return (Criteria) this;
        }

        public Criteria andBcIsNull() {
            addCriterion("bc is null");
            return (Criteria) this;
        }

        public Criteria andBcIsNotNull() {
            addCriterion("bc is not null");
            return (Criteria) this;
        }

        public Criteria andBcEqualTo(Double value) {
            addCriterion("bc =", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcNotEqualTo(Double value) {
            addCriterion("bc <>", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcGreaterThan(Double value) {
            addCriterion("bc >", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcGreaterThanOrEqualTo(Double value) {
            addCriterion("bc >=", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcLessThan(Double value) {
            addCriterion("bc <", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcLessThanOrEqualTo(Double value) {
            addCriterion("bc <=", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcIn(List<Double> values) {
            addCriterion("bc in", values, "bc");
            return (Criteria) this;
        }

        public Criteria andBcNotIn(List<Double> values) {
            addCriterion("bc not in", values, "bc");
            return (Criteria) this;
        }

        public Criteria andBcBetween(Double value1, Double value2) {
            addCriterion("bc between", value1, value2, "bc");
            return (Criteria) this;
        }

        public Criteria andBcNotBetween(Double value1, Double value2) {
            addCriterion("bc not between", value1, value2, "bc");
            return (Criteria) this;
        }

        public Criteria andJanUseamountIsNull() {
            addCriterion("Jan_useamount is null");
            return (Criteria) this;
        }

        public Criteria andJanUseamountIsNotNull() {
            addCriterion("Jan_useamount is not null");
            return (Criteria) this;
        }

        public Criteria andJanUseamountEqualTo(Double value) {
            addCriterion("Jan_useamount =", value, "janUseamount");
            return (Criteria) this;
        }

        public Criteria andJanUseamountNotEqualTo(Double value) {
            addCriterion("Jan_useamount <>", value, "janUseamount");
            return (Criteria) this;
        }

        public Criteria andJanUseamountGreaterThan(Double value) {
            addCriterion("Jan_useamount >", value, "janUseamount");
            return (Criteria) this;
        }

        public Criteria andJanUseamountGreaterThanOrEqualTo(Double value) {
            addCriterion("Jan_useamount >=", value, "janUseamount");
            return (Criteria) this;
        }

        public Criteria andJanUseamountLessThan(Double value) {
            addCriterion("Jan_useamount <", value, "janUseamount");
            return (Criteria) this;
        }

        public Criteria andJanUseamountLessThanOrEqualTo(Double value) {
            addCriterion("Jan_useamount <=", value, "janUseamount");
            return (Criteria) this;
        }

        public Criteria andJanUseamountIn(List<Double> values) {
            addCriterion("Jan_useamount in", values, "janUseamount");
            return (Criteria) this;
        }

        public Criteria andJanUseamountNotIn(List<Double> values) {
            addCriterion("Jan_useamount not in", values, "janUseamount");
            return (Criteria) this;
        }

        public Criteria andJanUseamountBetween(Double value1, Double value2) {
            addCriterion("Jan_useamount between", value1, value2, "janUseamount");
            return (Criteria) this;
        }

        public Criteria andJanUseamountNotBetween(Double value1, Double value2) {
            addCriterion("Jan_useamount not between", value1, value2, "janUseamount");
            return (Criteria) this;
        }

        public Criteria andFebUseamountIsNull() {
            addCriterion("Feb_useamount is null");
            return (Criteria) this;
        }

        public Criteria andFebUseamountIsNotNull() {
            addCriterion("Feb_useamount is not null");
            return (Criteria) this;
        }

        public Criteria andFebUseamountEqualTo(Double value) {
            addCriterion("Feb_useamount =", value, "febUseamount");
            return (Criteria) this;
        }

        public Criteria andFebUseamountNotEqualTo(Double value) {
            addCriterion("Feb_useamount <>", value, "febUseamount");
            return (Criteria) this;
        }

        public Criteria andFebUseamountGreaterThan(Double value) {
            addCriterion("Feb_useamount >", value, "febUseamount");
            return (Criteria) this;
        }

        public Criteria andFebUseamountGreaterThanOrEqualTo(Double value) {
            addCriterion("Feb_useamount >=", value, "febUseamount");
            return (Criteria) this;
        }

        public Criteria andFebUseamountLessThan(Double value) {
            addCriterion("Feb_useamount <", value, "febUseamount");
            return (Criteria) this;
        }

        public Criteria andFebUseamountLessThanOrEqualTo(Double value) {
            addCriterion("Feb_useamount <=", value, "febUseamount");
            return (Criteria) this;
        }

        public Criteria andFebUseamountIn(List<Double> values) {
            addCriterion("Feb_useamount in", values, "febUseamount");
            return (Criteria) this;
        }

        public Criteria andFebUseamountNotIn(List<Double> values) {
            addCriterion("Feb_useamount not in", values, "febUseamount");
            return (Criteria) this;
        }

        public Criteria andFebUseamountBetween(Double value1, Double value2) {
            addCriterion("Feb_useamount between", value1, value2, "febUseamount");
            return (Criteria) this;
        }

        public Criteria andFebUseamountNotBetween(Double value1, Double value2) {
            addCriterion("Feb_useamount not between", value1, value2, "febUseamount");
            return (Criteria) this;
        }

        public Criteria andMarUseamountIsNull() {
            addCriterion("Mar_useamount is null");
            return (Criteria) this;
        }

        public Criteria andMarUseamountIsNotNull() {
            addCriterion("Mar_useamount is not null");
            return (Criteria) this;
        }

        public Criteria andMarUseamountEqualTo(Double value) {
            addCriterion("Mar_useamount =", value, "marUseamount");
            return (Criteria) this;
        }

        public Criteria andMarUseamountNotEqualTo(Double value) {
            addCriterion("Mar_useamount <>", value, "marUseamount");
            return (Criteria) this;
        }

        public Criteria andMarUseamountGreaterThan(Double value) {
            addCriterion("Mar_useamount >", value, "marUseamount");
            return (Criteria) this;
        }

        public Criteria andMarUseamountGreaterThanOrEqualTo(Double value) {
            addCriterion("Mar_useamount >=", value, "marUseamount");
            return (Criteria) this;
        }

        public Criteria andMarUseamountLessThan(Double value) {
            addCriterion("Mar_useamount <", value, "marUseamount");
            return (Criteria) this;
        }

        public Criteria andMarUseamountLessThanOrEqualTo(Double value) {
            addCriterion("Mar_useamount <=", value, "marUseamount");
            return (Criteria) this;
        }

        public Criteria andMarUseamountIn(List<Double> values) {
            addCriterion("Mar_useamount in", values, "marUseamount");
            return (Criteria) this;
        }

        public Criteria andMarUseamountNotIn(List<Double> values) {
            addCriterion("Mar_useamount not in", values, "marUseamount");
            return (Criteria) this;
        }

        public Criteria andMarUseamountBetween(Double value1, Double value2) {
            addCriterion("Mar_useamount between", value1, value2, "marUseamount");
            return (Criteria) this;
        }

        public Criteria andMarUseamountNotBetween(Double value1, Double value2) {
            addCriterion("Mar_useamount not between", value1, value2, "marUseamount");
            return (Criteria) this;
        }

        public Criteria andAprUseamountIsNull() {
            addCriterion("Apr_useamount is null");
            return (Criteria) this;
        }

        public Criteria andAprUseamountIsNotNull() {
            addCriterion("Apr_useamount is not null");
            return (Criteria) this;
        }

        public Criteria andAprUseamountEqualTo(Double value) {
            addCriterion("Apr_useamount =", value, "aprUseamount");
            return (Criteria) this;
        }

        public Criteria andAprUseamountNotEqualTo(Double value) {
            addCriterion("Apr_useamount <>", value, "aprUseamount");
            return (Criteria) this;
        }

        public Criteria andAprUseamountGreaterThan(Double value) {
            addCriterion("Apr_useamount >", value, "aprUseamount");
            return (Criteria) this;
        }

        public Criteria andAprUseamountGreaterThanOrEqualTo(Double value) {
            addCriterion("Apr_useamount >=", value, "aprUseamount");
            return (Criteria) this;
        }

        public Criteria andAprUseamountLessThan(Double value) {
            addCriterion("Apr_useamount <", value, "aprUseamount");
            return (Criteria) this;
        }

        public Criteria andAprUseamountLessThanOrEqualTo(Double value) {
            addCriterion("Apr_useamount <=", value, "aprUseamount");
            return (Criteria) this;
        }

        public Criteria andAprUseamountIn(List<Double> values) {
            addCriterion("Apr_useamount in", values, "aprUseamount");
            return (Criteria) this;
        }

        public Criteria andAprUseamountNotIn(List<Double> values) {
            addCriterion("Apr_useamount not in", values, "aprUseamount");
            return (Criteria) this;
        }

        public Criteria andAprUseamountBetween(Double value1, Double value2) {
            addCriterion("Apr_useamount between", value1, value2, "aprUseamount");
            return (Criteria) this;
        }

        public Criteria andAprUseamountNotBetween(Double value1, Double value2) {
            addCriterion("Apr_useamount not between", value1, value2, "aprUseamount");
            return (Criteria) this;
        }

        public Criteria andMayUseamountIsNull() {
            addCriterion("May_useamount is null");
            return (Criteria) this;
        }

        public Criteria andMayUseamountIsNotNull() {
            addCriterion("May_useamount is not null");
            return (Criteria) this;
        }

        public Criteria andMayUseamountEqualTo(Double value) {
            addCriterion("May_useamount =", value, "mayUseamount");
            return (Criteria) this;
        }

        public Criteria andMayUseamountNotEqualTo(Double value) {
            addCriterion("May_useamount <>", value, "mayUseamount");
            return (Criteria) this;
        }

        public Criteria andMayUseamountGreaterThan(Double value) {
            addCriterion("May_useamount >", value, "mayUseamount");
            return (Criteria) this;
        }

        public Criteria andMayUseamountGreaterThanOrEqualTo(Double value) {
            addCriterion("May_useamount >=", value, "mayUseamount");
            return (Criteria) this;
        }

        public Criteria andMayUseamountLessThan(Double value) {
            addCriterion("May_useamount <", value, "mayUseamount");
            return (Criteria) this;
        }

        public Criteria andMayUseamountLessThanOrEqualTo(Double value) {
            addCriterion("May_useamount <=", value, "mayUseamount");
            return (Criteria) this;
        }

        public Criteria andMayUseamountIn(List<Double> values) {
            addCriterion("May_useamount in", values, "mayUseamount");
            return (Criteria) this;
        }

        public Criteria andMayUseamountNotIn(List<Double> values) {
            addCriterion("May_useamount not in", values, "mayUseamount");
            return (Criteria) this;
        }

        public Criteria andMayUseamountBetween(Double value1, Double value2) {
            addCriterion("May_useamount between", value1, value2, "mayUseamount");
            return (Criteria) this;
        }

        public Criteria andMayUseamountNotBetween(Double value1, Double value2) {
            addCriterion("May_useamount not between", value1, value2, "mayUseamount");
            return (Criteria) this;
        }

        public Criteria andJuneUseamountIsNull() {
            addCriterion("June_useamount is null");
            return (Criteria) this;
        }

        public Criteria andJuneUseamountIsNotNull() {
            addCriterion("June_useamount is not null");
            return (Criteria) this;
        }

        public Criteria andJuneUseamountEqualTo(Double value) {
            addCriterion("June_useamount =", value, "juneUseamount");
            return (Criteria) this;
        }

        public Criteria andJuneUseamountNotEqualTo(Double value) {
            addCriterion("June_useamount <>", value, "juneUseamount");
            return (Criteria) this;
        }

        public Criteria andJuneUseamountGreaterThan(Double value) {
            addCriterion("June_useamount >", value, "juneUseamount");
            return (Criteria) this;
        }

        public Criteria andJuneUseamountGreaterThanOrEqualTo(Double value) {
            addCriterion("June_useamount >=", value, "juneUseamount");
            return (Criteria) this;
        }

        public Criteria andJuneUseamountLessThan(Double value) {
            addCriterion("June_useamount <", value, "juneUseamount");
            return (Criteria) this;
        }

        public Criteria andJuneUseamountLessThanOrEqualTo(Double value) {
            addCriterion("June_useamount <=", value, "juneUseamount");
            return (Criteria) this;
        }

        public Criteria andJuneUseamountIn(List<Double> values) {
            addCriterion("June_useamount in", values, "juneUseamount");
            return (Criteria) this;
        }

        public Criteria andJuneUseamountNotIn(List<Double> values) {
            addCriterion("June_useamount not in", values, "juneUseamount");
            return (Criteria) this;
        }

        public Criteria andJuneUseamountBetween(Double value1, Double value2) {
            addCriterion("June_useamount between", value1, value2, "juneUseamount");
            return (Criteria) this;
        }

        public Criteria andJuneUseamountNotBetween(Double value1, Double value2) {
            addCriterion("June_useamount not between", value1, value2, "juneUseamount");
            return (Criteria) this;
        }

        public Criteria andJulyUseamountIsNull() {
            addCriterion("July_useamount is null");
            return (Criteria) this;
        }

        public Criteria andJulyUseamountIsNotNull() {
            addCriterion("July_useamount is not null");
            return (Criteria) this;
        }

        public Criteria andJulyUseamountEqualTo(Double value) {
            addCriterion("July_useamount =", value, "julyUseamount");
            return (Criteria) this;
        }

        public Criteria andJulyUseamountNotEqualTo(Double value) {
            addCriterion("July_useamount <>", value, "julyUseamount");
            return (Criteria) this;
        }

        public Criteria andJulyUseamountGreaterThan(Double value) {
            addCriterion("July_useamount >", value, "julyUseamount");
            return (Criteria) this;
        }

        public Criteria andJulyUseamountGreaterThanOrEqualTo(Double value) {
            addCriterion("July_useamount >=", value, "julyUseamount");
            return (Criteria) this;
        }

        public Criteria andJulyUseamountLessThan(Double value) {
            addCriterion("July_useamount <", value, "julyUseamount");
            return (Criteria) this;
        }

        public Criteria andJulyUseamountLessThanOrEqualTo(Double value) {
            addCriterion("July_useamount <=", value, "julyUseamount");
            return (Criteria) this;
        }

        public Criteria andJulyUseamountIn(List<Double> values) {
            addCriterion("July_useamount in", values, "julyUseamount");
            return (Criteria) this;
        }

        public Criteria andJulyUseamountNotIn(List<Double> values) {
            addCriterion("July_useamount not in", values, "julyUseamount");
            return (Criteria) this;
        }

        public Criteria andJulyUseamountBetween(Double value1, Double value2) {
            addCriterion("July_useamount between", value1, value2, "julyUseamount");
            return (Criteria) this;
        }

        public Criteria andJulyUseamountNotBetween(Double value1, Double value2) {
            addCriterion("July_useamount not between", value1, value2, "julyUseamount");
            return (Criteria) this;
        }

        public Criteria andAugUseamountIsNull() {
            addCriterion("aug_useamount is null");
            return (Criteria) this;
        }

        public Criteria andAugUseamountIsNotNull() {
            addCriterion("aug_useamount is not null");
            return (Criteria) this;
        }

        public Criteria andAugUseamountEqualTo(Double value) {
            addCriterion("aug_useamount =", value, "augUseamount");
            return (Criteria) this;
        }

        public Criteria andAugUseamountNotEqualTo(Double value) {
            addCriterion("aug_useamount <>", value, "augUseamount");
            return (Criteria) this;
        }

        public Criteria andAugUseamountGreaterThan(Double value) {
            addCriterion("aug_useamount >", value, "augUseamount");
            return (Criteria) this;
        }

        public Criteria andAugUseamountGreaterThanOrEqualTo(Double value) {
            addCriterion("aug_useamount >=", value, "augUseamount");
            return (Criteria) this;
        }

        public Criteria andAugUseamountLessThan(Double value) {
            addCriterion("aug_useamount <", value, "augUseamount");
            return (Criteria) this;
        }

        public Criteria andAugUseamountLessThanOrEqualTo(Double value) {
            addCriterion("aug_useamount <=", value, "augUseamount");
            return (Criteria) this;
        }

        public Criteria andAugUseamountIn(List<Double> values) {
            addCriterion("aug_useamount in", values, "augUseamount");
            return (Criteria) this;
        }

        public Criteria andAugUseamountNotIn(List<Double> values) {
            addCriterion("aug_useamount not in", values, "augUseamount");
            return (Criteria) this;
        }

        public Criteria andAugUseamountBetween(Double value1, Double value2) {
            addCriterion("aug_useamount between", value1, value2, "augUseamount");
            return (Criteria) this;
        }

        public Criteria andAugUseamountNotBetween(Double value1, Double value2) {
            addCriterion("aug_useamount not between", value1, value2, "augUseamount");
            return (Criteria) this;
        }

        public Criteria andSeptUseamountIsNull() {
            addCriterion("sept_useamount is null");
            return (Criteria) this;
        }

        public Criteria andSeptUseamountIsNotNull() {
            addCriterion("sept_useamount is not null");
            return (Criteria) this;
        }

        public Criteria andSeptUseamountEqualTo(Double value) {
            addCriterion("sept_useamount =", value, "septUseamount");
            return (Criteria) this;
        }

        public Criteria andSeptUseamountNotEqualTo(Double value) {
            addCriterion("sept_useamount <>", value, "septUseamount");
            return (Criteria) this;
        }

        public Criteria andSeptUseamountGreaterThan(Double value) {
            addCriterion("sept_useamount >", value, "septUseamount");
            return (Criteria) this;
        }

        public Criteria andSeptUseamountGreaterThanOrEqualTo(Double value) {
            addCriterion("sept_useamount >=", value, "septUseamount");
            return (Criteria) this;
        }

        public Criteria andSeptUseamountLessThan(Double value) {
            addCriterion("sept_useamount <", value, "septUseamount");
            return (Criteria) this;
        }

        public Criteria andSeptUseamountLessThanOrEqualTo(Double value) {
            addCriterion("sept_useamount <=", value, "septUseamount");
            return (Criteria) this;
        }

        public Criteria andSeptUseamountIn(List<Double> values) {
            addCriterion("sept_useamount in", values, "septUseamount");
            return (Criteria) this;
        }

        public Criteria andSeptUseamountNotIn(List<Double> values) {
            addCriterion("sept_useamount not in", values, "septUseamount");
            return (Criteria) this;
        }

        public Criteria andSeptUseamountBetween(Double value1, Double value2) {
            addCriterion("sept_useamount between", value1, value2, "septUseamount");
            return (Criteria) this;
        }

        public Criteria andSeptUseamountNotBetween(Double value1, Double value2) {
            addCriterion("sept_useamount not between", value1, value2, "septUseamount");
            return (Criteria) this;
        }

        public Criteria andOctUseAmountIsNull() {
            addCriterion("oct_use_amount is null");
            return (Criteria) this;
        }

        public Criteria andOctUseAmountIsNotNull() {
            addCriterion("oct_use_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOctUseAmountEqualTo(Double value) {
            addCriterion("oct_use_amount =", value, "octUseAmount");
            return (Criteria) this;
        }

        public Criteria andOctUseAmountNotEqualTo(Double value) {
            addCriterion("oct_use_amount <>", value, "octUseAmount");
            return (Criteria) this;
        }

        public Criteria andOctUseAmountGreaterThan(Double value) {
            addCriterion("oct_use_amount >", value, "octUseAmount");
            return (Criteria) this;
        }

        public Criteria andOctUseAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("oct_use_amount >=", value, "octUseAmount");
            return (Criteria) this;
        }

        public Criteria andOctUseAmountLessThan(Double value) {
            addCriterion("oct_use_amount <", value, "octUseAmount");
            return (Criteria) this;
        }

        public Criteria andOctUseAmountLessThanOrEqualTo(Double value) {
            addCriterion("oct_use_amount <=", value, "octUseAmount");
            return (Criteria) this;
        }

        public Criteria andOctUseAmountIn(List<Double> values) {
            addCriterion("oct_use_amount in", values, "octUseAmount");
            return (Criteria) this;
        }

        public Criteria andOctUseAmountNotIn(List<Double> values) {
            addCriterion("oct_use_amount not in", values, "octUseAmount");
            return (Criteria) this;
        }

        public Criteria andOctUseAmountBetween(Double value1, Double value2) {
            addCriterion("oct_use_amount between", value1, value2, "octUseAmount");
            return (Criteria) this;
        }

        public Criteria andOctUseAmountNotBetween(Double value1, Double value2) {
            addCriterion("oct_use_amount not between", value1, value2, "octUseAmount");
            return (Criteria) this;
        }

        public Criteria andNovUseamountIsNull() {
            addCriterion("nov_useamount is null");
            return (Criteria) this;
        }

        public Criteria andNovUseamountIsNotNull() {
            addCriterion("nov_useamount is not null");
            return (Criteria) this;
        }

        public Criteria andNovUseamountEqualTo(Double value) {
            addCriterion("nov_useamount =", value, "novUseamount");
            return (Criteria) this;
        }

        public Criteria andNovUseamountNotEqualTo(Double value) {
            addCriterion("nov_useamount <>", value, "novUseamount");
            return (Criteria) this;
        }

        public Criteria andNovUseamountGreaterThan(Double value) {
            addCriterion("nov_useamount >", value, "novUseamount");
            return (Criteria) this;
        }

        public Criteria andNovUseamountGreaterThanOrEqualTo(Double value) {
            addCriterion("nov_useamount >=", value, "novUseamount");
            return (Criteria) this;
        }

        public Criteria andNovUseamountLessThan(Double value) {
            addCriterion("nov_useamount <", value, "novUseamount");
            return (Criteria) this;
        }

        public Criteria andNovUseamountLessThanOrEqualTo(Double value) {
            addCriterion("nov_useamount <=", value, "novUseamount");
            return (Criteria) this;
        }

        public Criteria andNovUseamountIn(List<Double> values) {
            addCriterion("nov_useamount in", values, "novUseamount");
            return (Criteria) this;
        }

        public Criteria andNovUseamountNotIn(List<Double> values) {
            addCriterion("nov_useamount not in", values, "novUseamount");
            return (Criteria) this;
        }

        public Criteria andNovUseamountBetween(Double value1, Double value2) {
            addCriterion("nov_useamount between", value1, value2, "novUseamount");
            return (Criteria) this;
        }

        public Criteria andNovUseamountNotBetween(Double value1, Double value2) {
            addCriterion("nov_useamount not between", value1, value2, "novUseamount");
            return (Criteria) this;
        }

        public Criteria andDecUseamountIsNull() {
            addCriterion("dec_useamount is null");
            return (Criteria) this;
        }

        public Criteria andDecUseamountIsNotNull() {
            addCriterion("dec_useamount is not null");
            return (Criteria) this;
        }

        public Criteria andDecUseamountEqualTo(Double value) {
            addCriterion("dec_useamount =", value, "decUseamount");
            return (Criteria) this;
        }

        public Criteria andDecUseamountNotEqualTo(Double value) {
            addCriterion("dec_useamount <>", value, "decUseamount");
            return (Criteria) this;
        }

        public Criteria andDecUseamountGreaterThan(Double value) {
            addCriterion("dec_useamount >", value, "decUseamount");
            return (Criteria) this;
        }

        public Criteria andDecUseamountGreaterThanOrEqualTo(Double value) {
            addCriterion("dec_useamount >=", value, "decUseamount");
            return (Criteria) this;
        }

        public Criteria andDecUseamountLessThan(Double value) {
            addCriterion("dec_useamount <", value, "decUseamount");
            return (Criteria) this;
        }

        public Criteria andDecUseamountLessThanOrEqualTo(Double value) {
            addCriterion("dec_useamount <=", value, "decUseamount");
            return (Criteria) this;
        }

        public Criteria andDecUseamountIn(List<Double> values) {
            addCriterion("dec_useamount in", values, "decUseamount");
            return (Criteria) this;
        }

        public Criteria andDecUseamountNotIn(List<Double> values) {
            addCriterion("dec_useamount not in", values, "decUseamount");
            return (Criteria) this;
        }

        public Criteria andDecUseamountBetween(Double value1, Double value2) {
            addCriterion("dec_useamount between", value1, value2, "decUseamount");
            return (Criteria) this;
        }

        public Criteria andDecUseamountNotBetween(Double value1, Double value2) {
            addCriterion("dec_useamount not between", value1, value2, "decUseamount");
            return (Criteria) this;
        }

        public Criteria andDanweiIsNull() {
            addCriterion("danwei is null");
            return (Criteria) this;
        }

        public Criteria andDanweiIsNotNull() {
            addCriterion("danwei is not null");
            return (Criteria) this;
        }

        public Criteria andDanweiEqualTo(String value) {
            addCriterion("danwei =", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiNotEqualTo(String value) {
            addCriterion("danwei <>", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiGreaterThan(String value) {
            addCriterion("danwei >", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiGreaterThanOrEqualTo(String value) {
            addCriterion("danwei >=", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiLessThan(String value) {
            addCriterion("danwei <", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiLessThanOrEqualTo(String value) {
            addCriterion("danwei <=", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiLike(String value) {
            addCriterion("danwei like", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiNotLike(String value) {
            addCriterion("danwei not like", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiIn(List<String> values) {
            addCriterion("danwei in", values, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiNotIn(List<String> values) {
            addCriterion("danwei not in", values, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiBetween(String value1, String value2) {
            addCriterion("danwei between", value1, value2, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiNotBetween(String value1, String value2) {
            addCriterion("danwei not between", value1, value2, "danwei");
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