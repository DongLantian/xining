package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class DeviceTempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceTempExample() {
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

        public Criteria andProductrawtotalIdIsNull() {
            addCriterion("productrawtotal_id is null");
            return (Criteria) this;
        }

        public Criteria andProductrawtotalIdIsNotNull() {
            addCriterion("productrawtotal_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductrawtotalIdEqualTo(Integer value) {
            addCriterion("productrawtotal_id =", value, "productrawtotalId");
            return (Criteria) this;
        }

        public Criteria andProductrawtotalIdNotEqualTo(Integer value) {
            addCriterion("productrawtotal_id <>", value, "productrawtotalId");
            return (Criteria) this;
        }

        public Criteria andProductrawtotalIdGreaterThan(Integer value) {
            addCriterion("productrawtotal_id >", value, "productrawtotalId");
            return (Criteria) this;
        }

        public Criteria andProductrawtotalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("productrawtotal_id >=", value, "productrawtotalId");
            return (Criteria) this;
        }

        public Criteria andProductrawtotalIdLessThan(Integer value) {
            addCriterion("productrawtotal_id <", value, "productrawtotalId");
            return (Criteria) this;
        }

        public Criteria andProductrawtotalIdLessThanOrEqualTo(Integer value) {
            addCriterion("productrawtotal_id <=", value, "productrawtotalId");
            return (Criteria) this;
        }

        public Criteria andProductrawtotalIdIn(List<Integer> values) {
            addCriterion("productrawtotal_id in", values, "productrawtotalId");
            return (Criteria) this;
        }

        public Criteria andProductrawtotalIdNotIn(List<Integer> values) {
            addCriterion("productrawtotal_id not in", values, "productrawtotalId");
            return (Criteria) this;
        }

        public Criteria andProductrawtotalIdBetween(Integer value1, Integer value2) {
            addCriterion("productrawtotal_id between", value1, value2, "productrawtotalId");
            return (Criteria) this;
        }

        public Criteria andProductrawtotalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("productrawtotal_id not between", value1, value2, "productrawtotalId");
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

        public Criteria andDeviceNoIsNull() {
            addCriterion("device_no is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNoIsNotNull() {
            addCriterion("device_no is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNoEqualTo(String value) {
            addCriterion("device_no =", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoNotEqualTo(String value) {
            addCriterion("device_no <>", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoGreaterThan(String value) {
            addCriterion("device_no >", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoGreaterThanOrEqualTo(String value) {
            addCriterion("device_no >=", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoLessThan(String value) {
            addCriterion("device_no <", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoLessThanOrEqualTo(String value) {
            addCriterion("device_no <=", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoLike(String value) {
            addCriterion("device_no like", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoNotLike(String value) {
            addCriterion("device_no not like", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoIn(List<String> values) {
            addCriterion("device_no in", values, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoNotIn(List<String> values) {
            addCriterion("device_no not in", values, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoBetween(String value1, String value2) {
            addCriterion("device_no between", value1, value2, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoNotBetween(String value1, String value2) {
            addCriterion("device_no not between", value1, value2, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceFlowIsNull() {
            addCriterion("device_flow is null");
            return (Criteria) this;
        }

        public Criteria andDeviceFlowIsNotNull() {
            addCriterion("device_flow is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceFlowEqualTo(String value) {
            addCriterion("device_flow =", value, "deviceFlow");
            return (Criteria) this;
        }

        public Criteria andDeviceFlowNotEqualTo(String value) {
            addCriterion("device_flow <>", value, "deviceFlow");
            return (Criteria) this;
        }

        public Criteria andDeviceFlowGreaterThan(String value) {
            addCriterion("device_flow >", value, "deviceFlow");
            return (Criteria) this;
        }

        public Criteria andDeviceFlowGreaterThanOrEqualTo(String value) {
            addCriterion("device_flow >=", value, "deviceFlow");
            return (Criteria) this;
        }

        public Criteria andDeviceFlowLessThan(String value) {
            addCriterion("device_flow <", value, "deviceFlow");
            return (Criteria) this;
        }

        public Criteria andDeviceFlowLessThanOrEqualTo(String value) {
            addCriterion("device_flow <=", value, "deviceFlow");
            return (Criteria) this;
        }

        public Criteria andDeviceFlowLike(String value) {
            addCriterion("device_flow like", value, "deviceFlow");
            return (Criteria) this;
        }

        public Criteria andDeviceFlowNotLike(String value) {
            addCriterion("device_flow not like", value, "deviceFlow");
            return (Criteria) this;
        }

        public Criteria andDeviceFlowIn(List<String> values) {
            addCriterion("device_flow in", values, "deviceFlow");
            return (Criteria) this;
        }

        public Criteria andDeviceFlowNotIn(List<String> values) {
            addCriterion("device_flow not in", values, "deviceFlow");
            return (Criteria) this;
        }

        public Criteria andDeviceFlowBetween(String value1, String value2) {
            addCriterion("device_flow between", value1, value2, "deviceFlow");
            return (Criteria) this;
        }

        public Criteria andDeviceFlowNotBetween(String value1, String value2) {
            addCriterion("device_flow not between", value1, value2, "deviceFlow");
            return (Criteria) this;
        }

        public Criteria andDesignPowerIsNull() {
            addCriterion("design_power is null");
            return (Criteria) this;
        }

        public Criteria andDesignPowerIsNotNull() {
            addCriterion("design_power is not null");
            return (Criteria) this;
        }

        public Criteria andDesignPowerEqualTo(Double value) {
            addCriterion("design_power =", value, "designPower");
            return (Criteria) this;
        }

        public Criteria andDesignPowerNotEqualTo(Double value) {
            addCriterion("design_power <>", value, "designPower");
            return (Criteria) this;
        }

        public Criteria andDesignPowerGreaterThan(Double value) {
            addCriterion("design_power >", value, "designPower");
            return (Criteria) this;
        }

        public Criteria andDesignPowerGreaterThanOrEqualTo(Double value) {
            addCriterion("design_power >=", value, "designPower");
            return (Criteria) this;
        }

        public Criteria andDesignPowerLessThan(Double value) {
            addCriterion("design_power <", value, "designPower");
            return (Criteria) this;
        }

        public Criteria andDesignPowerLessThanOrEqualTo(Double value) {
            addCriterion("design_power <=", value, "designPower");
            return (Criteria) this;
        }

        public Criteria andDesignPowerIn(List<Double> values) {
            addCriterion("design_power in", values, "designPower");
            return (Criteria) this;
        }

        public Criteria andDesignPowerNotIn(List<Double> values) {
            addCriterion("design_power not in", values, "designPower");
            return (Criteria) this;
        }

        public Criteria andDesignPowerBetween(Double value1, Double value2) {
            addCriterion("design_power between", value1, value2, "designPower");
            return (Criteria) this;
        }

        public Criteria andDesignPowerNotBetween(Double value1, Double value2) {
            addCriterion("design_power not between", value1, value2, "designPower");
            return (Criteria) this;
        }

        public Criteria andPracticalPowerIsNull() {
            addCriterion("practical_power is null");
            return (Criteria) this;
        }

        public Criteria andPracticalPowerIsNotNull() {
            addCriterion("practical_power is not null");
            return (Criteria) this;
        }

        public Criteria andPracticalPowerEqualTo(Double value) {
            addCriterion("practical_power =", value, "practicalPower");
            return (Criteria) this;
        }

        public Criteria andPracticalPowerNotEqualTo(Double value) {
            addCriterion("practical_power <>", value, "practicalPower");
            return (Criteria) this;
        }

        public Criteria andPracticalPowerGreaterThan(Double value) {
            addCriterion("practical_power >", value, "practicalPower");
            return (Criteria) this;
        }

        public Criteria andPracticalPowerGreaterThanOrEqualTo(Double value) {
            addCriterion("practical_power >=", value, "practicalPower");
            return (Criteria) this;
        }

        public Criteria andPracticalPowerLessThan(Double value) {
            addCriterion("practical_power <", value, "practicalPower");
            return (Criteria) this;
        }

        public Criteria andPracticalPowerLessThanOrEqualTo(Double value) {
            addCriterion("practical_power <=", value, "practicalPower");
            return (Criteria) this;
        }

        public Criteria andPracticalPowerIn(List<Double> values) {
            addCriterion("practical_power in", values, "practicalPower");
            return (Criteria) this;
        }

        public Criteria andPracticalPowerNotIn(List<Double> values) {
            addCriterion("practical_power not in", values, "practicalPower");
            return (Criteria) this;
        }

        public Criteria andPracticalPowerBetween(Double value1, Double value2) {
            addCriterion("practical_power between", value1, value2, "practicalPower");
            return (Criteria) this;
        }

        public Criteria andPracticalPowerNotBetween(Double value1, Double value2) {
            addCriterion("practical_power not between", value1, value2, "practicalPower");
            return (Criteria) this;
        }

        public Criteria andExhustIdIsNull() {
            addCriterion("EXHUST_ID is null");
            return (Criteria) this;
        }

        public Criteria andExhustIdIsNotNull() {
            addCriterion("EXHUST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExhustIdEqualTo(Integer value) {
            addCriterion("EXHUST_ID =", value, "exhustId");
            return (Criteria) this;
        }

        public Criteria andExhustIdNotEqualTo(Integer value) {
            addCriterion("EXHUST_ID <>", value, "exhustId");
            return (Criteria) this;
        }

        public Criteria andExhustIdGreaterThan(Integer value) {
            addCriterion("EXHUST_ID >", value, "exhustId");
            return (Criteria) this;
        }

        public Criteria andExhustIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXHUST_ID >=", value, "exhustId");
            return (Criteria) this;
        }

        public Criteria andExhustIdLessThan(Integer value) {
            addCriterion("EXHUST_ID <", value, "exhustId");
            return (Criteria) this;
        }

        public Criteria andExhustIdLessThanOrEqualTo(Integer value) {
            addCriterion("EXHUST_ID <=", value, "exhustId");
            return (Criteria) this;
        }

        public Criteria andExhustIdIn(List<Integer> values) {
            addCriterion("EXHUST_ID in", values, "exhustId");
            return (Criteria) this;
        }

        public Criteria andExhustIdNotIn(List<Integer> values) {
            addCriterion("EXHUST_ID not in", values, "exhustId");
            return (Criteria) this;
        }

        public Criteria andExhustIdBetween(Integer value1, Integer value2) {
            addCriterion("EXHUST_ID between", value1, value2, "exhustId");
            return (Criteria) this;
        }

        public Criteria andExhustIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EXHUST_ID not between", value1, value2, "exhustId");
            return (Criteria) this;
        }

        public Criteria andExhustNoIsNull() {
            addCriterion("EXHUST_NO is null");
            return (Criteria) this;
        }

        public Criteria andExhustNoIsNotNull() {
            addCriterion("EXHUST_NO is not null");
            return (Criteria) this;
        }

        public Criteria andExhustNoEqualTo(Integer value) {
            addCriterion("EXHUST_NO =", value, "exhustNo");
            return (Criteria) this;
        }

        public Criteria andExhustNoNotEqualTo(Integer value) {
            addCriterion("EXHUST_NO <>", value, "exhustNo");
            return (Criteria) this;
        }

        public Criteria andExhustNoGreaterThan(Integer value) {
            addCriterion("EXHUST_NO >", value, "exhustNo");
            return (Criteria) this;
        }

        public Criteria andExhustNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXHUST_NO >=", value, "exhustNo");
            return (Criteria) this;
        }

        public Criteria andExhustNoLessThan(Integer value) {
            addCriterion("EXHUST_NO <", value, "exhustNo");
            return (Criteria) this;
        }

        public Criteria andExhustNoLessThanOrEqualTo(Integer value) {
            addCriterion("EXHUST_NO <=", value, "exhustNo");
            return (Criteria) this;
        }

        public Criteria andExhustNoIn(List<Integer> values) {
            addCriterion("EXHUST_NO in", values, "exhustNo");
            return (Criteria) this;
        }

        public Criteria andExhustNoNotIn(List<Integer> values) {
            addCriterion("EXHUST_NO not in", values, "exhustNo");
            return (Criteria) this;
        }

        public Criteria andExhustNoBetween(Integer value1, Integer value2) {
            addCriterion("EXHUST_NO between", value1, value2, "exhustNo");
            return (Criteria) this;
        }

        public Criteria andExhustNoNotBetween(Integer value1, Integer value2) {
            addCriterion("EXHUST_NO not between", value1, value2, "exhustNo");
            return (Criteria) this;
        }

        public Criteria andYearrunDaysIsNull() {
            addCriterion("yearrun_days is null");
            return (Criteria) this;
        }

        public Criteria andYearrunDaysIsNotNull() {
            addCriterion("yearrun_days is not null");
            return (Criteria) this;
        }

        public Criteria andYearrunDaysEqualTo(Integer value) {
            addCriterion("yearrun_days =", value, "yearrunDays");
            return (Criteria) this;
        }

        public Criteria andYearrunDaysNotEqualTo(Integer value) {
            addCriterion("yearrun_days <>", value, "yearrunDays");
            return (Criteria) this;
        }

        public Criteria andYearrunDaysGreaterThan(Integer value) {
            addCriterion("yearrun_days >", value, "yearrunDays");
            return (Criteria) this;
        }

        public Criteria andYearrunDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("yearrun_days >=", value, "yearrunDays");
            return (Criteria) this;
        }

        public Criteria andYearrunDaysLessThan(Integer value) {
            addCriterion("yearrun_days <", value, "yearrunDays");
            return (Criteria) this;
        }

        public Criteria andYearrunDaysLessThanOrEqualTo(Integer value) {
            addCriterion("yearrun_days <=", value, "yearrunDays");
            return (Criteria) this;
        }

        public Criteria andYearrunDaysIn(List<Integer> values) {
            addCriterion("yearrun_days in", values, "yearrunDays");
            return (Criteria) this;
        }

        public Criteria andYearrunDaysNotIn(List<Integer> values) {
            addCriterion("yearrun_days not in", values, "yearrunDays");
            return (Criteria) this;
        }

        public Criteria andYearrunDaysBetween(Integer value1, Integer value2) {
            addCriterion("yearrun_days between", value1, value2, "yearrunDays");
            return (Criteria) this;
        }

        public Criteria andYearrunDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("yearrun_days not between", value1, value2, "yearrunDays");
            return (Criteria) this;
        }

        public Criteria andDesignUnitIsNull() {
            addCriterion("design_unit is null");
            return (Criteria) this;
        }

        public Criteria andDesignUnitIsNotNull() {
            addCriterion("design_unit is not null");
            return (Criteria) this;
        }

        public Criteria andDesignUnitEqualTo(String value) {
            addCriterion("design_unit =", value, "designUnit");
            return (Criteria) this;
        }

        public Criteria andDesignUnitNotEqualTo(String value) {
            addCriterion("design_unit <>", value, "designUnit");
            return (Criteria) this;
        }

        public Criteria andDesignUnitGreaterThan(String value) {
            addCriterion("design_unit >", value, "designUnit");
            return (Criteria) this;
        }

        public Criteria andDesignUnitGreaterThanOrEqualTo(String value) {
            addCriterion("design_unit >=", value, "designUnit");
            return (Criteria) this;
        }

        public Criteria andDesignUnitLessThan(String value) {
            addCriterion("design_unit <", value, "designUnit");
            return (Criteria) this;
        }

        public Criteria andDesignUnitLessThanOrEqualTo(String value) {
            addCriterion("design_unit <=", value, "designUnit");
            return (Criteria) this;
        }

        public Criteria andDesignUnitLike(String value) {
            addCriterion("design_unit like", value, "designUnit");
            return (Criteria) this;
        }

        public Criteria andDesignUnitNotLike(String value) {
            addCriterion("design_unit not like", value, "designUnit");
            return (Criteria) this;
        }

        public Criteria andDesignUnitIn(List<String> values) {
            addCriterion("design_unit in", values, "designUnit");
            return (Criteria) this;
        }

        public Criteria andDesignUnitNotIn(List<String> values) {
            addCriterion("design_unit not in", values, "designUnit");
            return (Criteria) this;
        }

        public Criteria andDesignUnitBetween(String value1, String value2) {
            addCriterion("design_unit between", value1, value2, "designUnit");
            return (Criteria) this;
        }

        public Criteria andDesignUnitNotBetween(String value1, String value2) {
            addCriterion("design_unit not between", value1, value2, "designUnit");
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