package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class ScatteredCoalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScatteredCoalExample() {
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

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("year like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("year not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andCountyIdIsNull() {
            addCriterion("county_id is null");
            return (Criteria) this;
        }

        public Criteria andCountyIdIsNotNull() {
            addCriterion("county_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountyIdEqualTo(String value) {
            addCriterion("county_id =", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotEqualTo(String value) {
            addCriterion("county_id <>", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdGreaterThan(String value) {
            addCriterion("county_id >", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdGreaterThanOrEqualTo(String value) {
            addCriterion("county_id >=", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLessThan(String value) {
            addCriterion("county_id <", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLessThanOrEqualTo(String value) {
            addCriterion("county_id <=", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLike(String value) {
            addCriterion("county_id like", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotLike(String value) {
            addCriterion("county_id not like", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdIn(List<String> values) {
            addCriterion("county_id in", values, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotIn(List<String> values) {
            addCriterion("county_id not in", values, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdBetween(String value1, String value2) {
            addCriterion("county_id between", value1, value2, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotBetween(String value1, String value2) {
            addCriterion("county_id not between", value1, value2, "countyId");
            return (Criteria) this;
        }

        public Criteria andActivityLevelIsNull() {
            addCriterion("activity_level is null");
            return (Criteria) this;
        }

        public Criteria andActivityLevelIsNotNull() {
            addCriterion("activity_level is not null");
            return (Criteria) this;
        }

        public Criteria andActivityLevelEqualTo(String value) {
            addCriterion("activity_level =", value, "activityLevel");
            return (Criteria) this;
        }

        public Criteria andActivityLevelNotEqualTo(String value) {
            addCriterion("activity_level <>", value, "activityLevel");
            return (Criteria) this;
        }

        public Criteria andActivityLevelGreaterThan(String value) {
            addCriterion("activity_level >", value, "activityLevel");
            return (Criteria) this;
        }

        public Criteria andActivityLevelGreaterThanOrEqualTo(String value) {
            addCriterion("activity_level >=", value, "activityLevel");
            return (Criteria) this;
        }

        public Criteria andActivityLevelLessThan(String value) {
            addCriterion("activity_level <", value, "activityLevel");
            return (Criteria) this;
        }

        public Criteria andActivityLevelLessThanOrEqualTo(String value) {
            addCriterion("activity_level <=", value, "activityLevel");
            return (Criteria) this;
        }

        public Criteria andActivityLevelLike(String value) {
            addCriterion("activity_level like", value, "activityLevel");
            return (Criteria) this;
        }

        public Criteria andActivityLevelNotLike(String value) {
            addCriterion("activity_level not like", value, "activityLevel");
            return (Criteria) this;
        }

        public Criteria andActivityLevelIn(List<String> values) {
            addCriterion("activity_level in", values, "activityLevel");
            return (Criteria) this;
        }

        public Criteria andActivityLevelNotIn(List<String> values) {
            addCriterion("activity_level not in", values, "activityLevel");
            return (Criteria) this;
        }

        public Criteria andActivityLevelBetween(String value1, String value2) {
            addCriterion("activity_level between", value1, value2, "activityLevel");
            return (Criteria) this;
        }

        public Criteria andActivityLevelNotBetween(String value1, String value2) {
            addCriterion("activity_level not between", value1, value2, "activityLevel");
            return (Criteria) this;
        }

        public Criteria andFuelMeteringUnitIsNull() {
            addCriterion("fuel_metering_unit is null");
            return (Criteria) this;
        }

        public Criteria andFuelMeteringUnitIsNotNull() {
            addCriterion("fuel_metering_unit is not null");
            return (Criteria) this;
        }

        public Criteria andFuelMeteringUnitEqualTo(String value) {
            addCriterion("fuel_metering_unit =", value, "fuelMeteringUnit");
            return (Criteria) this;
        }

        public Criteria andFuelMeteringUnitNotEqualTo(String value) {
            addCriterion("fuel_metering_unit <>", value, "fuelMeteringUnit");
            return (Criteria) this;
        }

        public Criteria andFuelMeteringUnitGreaterThan(String value) {
            addCriterion("fuel_metering_unit >", value, "fuelMeteringUnit");
            return (Criteria) this;
        }

        public Criteria andFuelMeteringUnitGreaterThanOrEqualTo(String value) {
            addCriterion("fuel_metering_unit >=", value, "fuelMeteringUnit");
            return (Criteria) this;
        }

        public Criteria andFuelMeteringUnitLessThan(String value) {
            addCriterion("fuel_metering_unit <", value, "fuelMeteringUnit");
            return (Criteria) this;
        }

        public Criteria andFuelMeteringUnitLessThanOrEqualTo(String value) {
            addCriterion("fuel_metering_unit <=", value, "fuelMeteringUnit");
            return (Criteria) this;
        }

        public Criteria andFuelMeteringUnitLike(String value) {
            addCriterion("fuel_metering_unit like", value, "fuelMeteringUnit");
            return (Criteria) this;
        }

        public Criteria andFuelMeteringUnitNotLike(String value) {
            addCriterion("fuel_metering_unit not like", value, "fuelMeteringUnit");
            return (Criteria) this;
        }

        public Criteria andFuelMeteringUnitIn(List<String> values) {
            addCriterion("fuel_metering_unit in", values, "fuelMeteringUnit");
            return (Criteria) this;
        }

        public Criteria andFuelMeteringUnitNotIn(List<String> values) {
            addCriterion("fuel_metering_unit not in", values, "fuelMeteringUnit");
            return (Criteria) this;
        }

        public Criteria andFuelMeteringUnitBetween(String value1, String value2) {
            addCriterion("fuel_metering_unit between", value1, value2, "fuelMeteringUnit");
            return (Criteria) this;
        }

        public Criteria andFuelMeteringUnitNotBetween(String value1, String value2) {
            addCriterion("fuel_metering_unit not between", value1, value2, "fuelMeteringUnit");
            return (Criteria) this;
        }

        public Criteria andActivityLevelNumIsNull() {
            addCriterion("activity_level_num is null");
            return (Criteria) this;
        }

        public Criteria andActivityLevelNumIsNotNull() {
            addCriterion("activity_level_num is not null");
            return (Criteria) this;
        }

        public Criteria andActivityLevelNumEqualTo(Double value) {
            addCriterion("activity_level_num =", value, "activityLevelNum");
            return (Criteria) this;
        }

        public Criteria andActivityLevelNumNotEqualTo(Double value) {
            addCriterion("activity_level_num <>", value, "activityLevelNum");
            return (Criteria) this;
        }

        public Criteria andActivityLevelNumGreaterThan(Double value) {
            addCriterion("activity_level_num >", value, "activityLevelNum");
            return (Criteria) this;
        }

        public Criteria andActivityLevelNumGreaterThanOrEqualTo(Double value) {
            addCriterion("activity_level_num >=", value, "activityLevelNum");
            return (Criteria) this;
        }

        public Criteria andActivityLevelNumLessThan(Double value) {
            addCriterion("activity_level_num <", value, "activityLevelNum");
            return (Criteria) this;
        }

        public Criteria andActivityLevelNumLessThanOrEqualTo(Double value) {
            addCriterion("activity_level_num <=", value, "activityLevelNum");
            return (Criteria) this;
        }

        public Criteria andActivityLevelNumIn(List<Double> values) {
            addCriterion("activity_level_num in", values, "activityLevelNum");
            return (Criteria) this;
        }

        public Criteria andActivityLevelNumNotIn(List<Double> values) {
            addCriterion("activity_level_num not in", values, "activityLevelNum");
            return (Criteria) this;
        }

        public Criteria andActivityLevelNumBetween(Double value1, Double value2) {
            addCriterion("activity_level_num between", value1, value2, "activityLevelNum");
            return (Criteria) this;
        }

        public Criteria andActivityLevelNumNotBetween(Double value1, Double value2) {
            addCriterion("activity_level_num not between", value1, value2, "activityLevelNum");
            return (Criteria) this;
        }

        public Criteria andControlMeasureIsNull() {
            addCriterion("control_measure is null");
            return (Criteria) this;
        }

        public Criteria andControlMeasureIsNotNull() {
            addCriterion("control_measure is not null");
            return (Criteria) this;
        }

        public Criteria andControlMeasureEqualTo(String value) {
            addCriterion("control_measure =", value, "controlMeasure");
            return (Criteria) this;
        }

        public Criteria andControlMeasureNotEqualTo(String value) {
            addCriterion("control_measure <>", value, "controlMeasure");
            return (Criteria) this;
        }

        public Criteria andControlMeasureGreaterThan(String value) {
            addCriterion("control_measure >", value, "controlMeasure");
            return (Criteria) this;
        }

        public Criteria andControlMeasureGreaterThanOrEqualTo(String value) {
            addCriterion("control_measure >=", value, "controlMeasure");
            return (Criteria) this;
        }

        public Criteria andControlMeasureLessThan(String value) {
            addCriterion("control_measure <", value, "controlMeasure");
            return (Criteria) this;
        }

        public Criteria andControlMeasureLessThanOrEqualTo(String value) {
            addCriterion("control_measure <=", value, "controlMeasure");
            return (Criteria) this;
        }

        public Criteria andControlMeasureLike(String value) {
            addCriterion("control_measure like", value, "controlMeasure");
            return (Criteria) this;
        }

        public Criteria andControlMeasureNotLike(String value) {
            addCriterion("control_measure not like", value, "controlMeasure");
            return (Criteria) this;
        }

        public Criteria andControlMeasureIn(List<String> values) {
            addCriterion("control_measure in", values, "controlMeasure");
            return (Criteria) this;
        }

        public Criteria andControlMeasureNotIn(List<String> values) {
            addCriterion("control_measure not in", values, "controlMeasure");
            return (Criteria) this;
        }

        public Criteria andControlMeasureBetween(String value1, String value2) {
            addCriterion("control_measure between", value1, value2, "controlMeasure");
            return (Criteria) this;
        }

        public Criteria andControlMeasureNotBetween(String value1, String value2) {
            addCriterion("control_measure not between", value1, value2, "controlMeasure");
            return (Criteria) this;
        }

        public Criteria andSulfurContentIsNull() {
            addCriterion("sulfur_content is null");
            return (Criteria) this;
        }

        public Criteria andSulfurContentIsNotNull() {
            addCriterion("sulfur_content is not null");
            return (Criteria) this;
        }

        public Criteria andSulfurContentEqualTo(Double value) {
            addCriterion("sulfur_content =", value, "sulfurContent");
            return (Criteria) this;
        }

        public Criteria andSulfurContentNotEqualTo(Double value) {
            addCriterion("sulfur_content <>", value, "sulfurContent");
            return (Criteria) this;
        }

        public Criteria andSulfurContentGreaterThan(Double value) {
            addCriterion("sulfur_content >", value, "sulfurContent");
            return (Criteria) this;
        }

        public Criteria andSulfurContentGreaterThanOrEqualTo(Double value) {
            addCriterion("sulfur_content >=", value, "sulfurContent");
            return (Criteria) this;
        }

        public Criteria andSulfurContentLessThan(Double value) {
            addCriterion("sulfur_content <", value, "sulfurContent");
            return (Criteria) this;
        }

        public Criteria andSulfurContentLessThanOrEqualTo(Double value) {
            addCriterion("sulfur_content <=", value, "sulfurContent");
            return (Criteria) this;
        }

        public Criteria andSulfurContentIn(List<Double> values) {
            addCriterion("sulfur_content in", values, "sulfurContent");
            return (Criteria) this;
        }

        public Criteria andSulfurContentNotIn(List<Double> values) {
            addCriterion("sulfur_content not in", values, "sulfurContent");
            return (Criteria) this;
        }

        public Criteria andSulfurContentBetween(Double value1, Double value2) {
            addCriterion("sulfur_content between", value1, value2, "sulfurContent");
            return (Criteria) this;
        }

        public Criteria andSulfurContentNotBetween(Double value1, Double value2) {
            addCriterion("sulfur_content not between", value1, value2, "sulfurContent");
            return (Criteria) this;
        }

        public Criteria andAshContentIsNull() {
            addCriterion("ash_content is null");
            return (Criteria) this;
        }

        public Criteria andAshContentIsNotNull() {
            addCriterion("ash_content is not null");
            return (Criteria) this;
        }

        public Criteria andAshContentEqualTo(Double value) {
            addCriterion("ash_content =", value, "ashContent");
            return (Criteria) this;
        }

        public Criteria andAshContentNotEqualTo(Double value) {
            addCriterion("ash_content <>", value, "ashContent");
            return (Criteria) this;
        }

        public Criteria andAshContentGreaterThan(Double value) {
            addCriterion("ash_content >", value, "ashContent");
            return (Criteria) this;
        }

        public Criteria andAshContentGreaterThanOrEqualTo(Double value) {
            addCriterion("ash_content >=", value, "ashContent");
            return (Criteria) this;
        }

        public Criteria andAshContentLessThan(Double value) {
            addCriterion("ash_content <", value, "ashContent");
            return (Criteria) this;
        }

        public Criteria andAshContentLessThanOrEqualTo(Double value) {
            addCriterion("ash_content <=", value, "ashContent");
            return (Criteria) this;
        }

        public Criteria andAshContentIn(List<Double> values) {
            addCriterion("ash_content in", values, "ashContent");
            return (Criteria) this;
        }

        public Criteria andAshContentNotIn(List<Double> values) {
            addCriterion("ash_content not in", values, "ashContent");
            return (Criteria) this;
        }

        public Criteria andAshContentBetween(Double value1, Double value2) {
            addCriterion("ash_content between", value1, value2, "ashContent");
            return (Criteria) this;
        }

        public Criteria andAshContentNotBetween(Double value1, Double value2) {
            addCriterion("ash_content not between", value1, value2, "ashContent");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionIsNull() {
            addCriterion("pm25_emission is null");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionIsNotNull() {
            addCriterion("pm25_emission is not null");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionEqualTo(Double value) {
            addCriterion("pm25_emission =", value, "pm25Emission");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionNotEqualTo(Double value) {
            addCriterion("pm25_emission <>", value, "pm25Emission");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionGreaterThan(Double value) {
            addCriterion("pm25_emission >", value, "pm25Emission");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("pm25_emission >=", value, "pm25Emission");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionLessThan(Double value) {
            addCriterion("pm25_emission <", value, "pm25Emission");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionLessThanOrEqualTo(Double value) {
            addCriterion("pm25_emission <=", value, "pm25Emission");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionIn(List<Double> values) {
            addCriterion("pm25_emission in", values, "pm25Emission");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionNotIn(List<Double> values) {
            addCriterion("pm25_emission not in", values, "pm25Emission");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionBetween(Double value1, Double value2) {
            addCriterion("pm25_emission between", value1, value2, "pm25Emission");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionNotBetween(Double value1, Double value2) {
            addCriterion("pm25_emission not between", value1, value2, "pm25Emission");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionIsNull() {
            addCriterion("pm10_emission is null");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionIsNotNull() {
            addCriterion("pm10_emission is not null");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionEqualTo(Double value) {
            addCriterion("pm10_emission =", value, "pm10Emission");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionNotEqualTo(Double value) {
            addCriterion("pm10_emission <>", value, "pm10Emission");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionGreaterThan(Double value) {
            addCriterion("pm10_emission >", value, "pm10Emission");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("pm10_emission >=", value, "pm10Emission");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionLessThan(Double value) {
            addCriterion("pm10_emission <", value, "pm10Emission");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionLessThanOrEqualTo(Double value) {
            addCriterion("pm10_emission <=", value, "pm10Emission");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionIn(List<Double> values) {
            addCriterion("pm10_emission in", values, "pm10Emission");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionNotIn(List<Double> values) {
            addCriterion("pm10_emission not in", values, "pm10Emission");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionBetween(Double value1, Double value2) {
            addCriterion("pm10_emission between", value1, value2, "pm10Emission");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionNotBetween(Double value1, Double value2) {
            addCriterion("pm10_emission not between", value1, value2, "pm10Emission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionIsNull() {
            addCriterion("co_emission is null");
            return (Criteria) this;
        }

        public Criteria andCoEmissionIsNotNull() {
            addCriterion("co_emission is not null");
            return (Criteria) this;
        }

        public Criteria andCoEmissionEqualTo(Double value) {
            addCriterion("co_emission =", value, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionNotEqualTo(Double value) {
            addCriterion("co_emission <>", value, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionGreaterThan(Double value) {
            addCriterion("co_emission >", value, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("co_emission >=", value, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionLessThan(Double value) {
            addCriterion("co_emission <", value, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionLessThanOrEqualTo(Double value) {
            addCriterion("co_emission <=", value, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionIn(List<Double> values) {
            addCriterion("co_emission in", values, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionNotIn(List<Double> values) {
            addCriterion("co_emission not in", values, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionBetween(Double value1, Double value2) {
            addCriterion("co_emission between", value1, value2, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionNotBetween(Double value1, Double value2) {
            addCriterion("co_emission not between", value1, value2, "coEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionIsNull() {
            addCriterion("voc_emission is null");
            return (Criteria) this;
        }

        public Criteria andVocEmissionIsNotNull() {
            addCriterion("voc_emission is not null");
            return (Criteria) this;
        }

        public Criteria andVocEmissionEqualTo(Double value) {
            addCriterion("voc_emission =", value, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionNotEqualTo(Double value) {
            addCriterion("voc_emission <>", value, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionGreaterThan(Double value) {
            addCriterion("voc_emission >", value, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("voc_emission >=", value, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionLessThan(Double value) {
            addCriterion("voc_emission <", value, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionLessThanOrEqualTo(Double value) {
            addCriterion("voc_emission <=", value, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionIn(List<Double> values) {
            addCriterion("voc_emission in", values, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionNotIn(List<Double> values) {
            addCriterion("voc_emission not in", values, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionBetween(Double value1, Double value2) {
            addCriterion("voc_emission between", value1, value2, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionNotBetween(Double value1, Double value2) {
            addCriterion("voc_emission not between", value1, value2, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionIsNull() {
            addCriterion("so2_emission is null");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionIsNotNull() {
            addCriterion("so2_emission is not null");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionEqualTo(Double value) {
            addCriterion("so2_emission =", value, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionNotEqualTo(Double value) {
            addCriterion("so2_emission <>", value, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionGreaterThan(Double value) {
            addCriterion("so2_emission >", value, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("so2_emission >=", value, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionLessThan(Double value) {
            addCriterion("so2_emission <", value, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionLessThanOrEqualTo(Double value) {
            addCriterion("so2_emission <=", value, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionIn(List<Double> values) {
            addCriterion("so2_emission in", values, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionNotIn(List<Double> values) {
            addCriterion("so2_emission not in", values, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionBetween(Double value1, Double value2) {
            addCriterion("so2_emission between", value1, value2, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionNotBetween(Double value1, Double value2) {
            addCriterion("so2_emission not between", value1, value2, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionIsNull() {
            addCriterion("nox_emission is null");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionIsNotNull() {
            addCriterion("nox_emission is not null");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionEqualTo(Double value) {
            addCriterion("nox_emission =", value, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionNotEqualTo(Double value) {
            addCriterion("nox_emission <>", value, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionGreaterThan(Double value) {
            addCriterion("nox_emission >", value, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("nox_emission >=", value, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionLessThan(Double value) {
            addCriterion("nox_emission <", value, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionLessThanOrEqualTo(Double value) {
            addCriterion("nox_emission <=", value, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionIn(List<Double> values) {
            addCriterion("nox_emission in", values, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionNotIn(List<Double> values) {
            addCriterion("nox_emission not in", values, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionBetween(Double value1, Double value2) {
            addCriterion("nox_emission between", value1, value2, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionNotBetween(Double value1, Double value2) {
            addCriterion("nox_emission not between", value1, value2, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionIsNull() {
            addCriterion("nh3_emission is null");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionIsNotNull() {
            addCriterion("nh3_emission is not null");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionEqualTo(Double value) {
            addCriterion("nh3_emission =", value, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionNotEqualTo(Double value) {
            addCriterion("nh3_emission <>", value, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionGreaterThan(Double value) {
            addCriterion("nh3_emission >", value, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("nh3_emission >=", value, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionLessThan(Double value) {
            addCriterion("nh3_emission <", value, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionLessThanOrEqualTo(Double value) {
            addCriterion("nh3_emission <=", value, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionIn(List<Double> values) {
            addCriterion("nh3_emission in", values, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionNotIn(List<Double> values) {
            addCriterion("nh3_emission not in", values, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionBetween(Double value1, Double value2) {
            addCriterion("nh3_emission between", value1, value2, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionNotBetween(Double value1, Double value2) {
            addCriterion("nh3_emission not between", value1, value2, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andOcEmissionIsNull() {
            addCriterion("oc_emission is null");
            return (Criteria) this;
        }

        public Criteria andOcEmissionIsNotNull() {
            addCriterion("oc_emission is not null");
            return (Criteria) this;
        }

        public Criteria andOcEmissionEqualTo(Double value) {
            addCriterion("oc_emission =", value, "ocEmission");
            return (Criteria) this;
        }

        public Criteria andOcEmissionNotEqualTo(Double value) {
            addCriterion("oc_emission <>", value, "ocEmission");
            return (Criteria) this;
        }

        public Criteria andOcEmissionGreaterThan(Double value) {
            addCriterion("oc_emission >", value, "ocEmission");
            return (Criteria) this;
        }

        public Criteria andOcEmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("oc_emission >=", value, "ocEmission");
            return (Criteria) this;
        }

        public Criteria andOcEmissionLessThan(Double value) {
            addCriterion("oc_emission <", value, "ocEmission");
            return (Criteria) this;
        }

        public Criteria andOcEmissionLessThanOrEqualTo(Double value) {
            addCriterion("oc_emission <=", value, "ocEmission");
            return (Criteria) this;
        }

        public Criteria andOcEmissionIn(List<Double> values) {
            addCriterion("oc_emission in", values, "ocEmission");
            return (Criteria) this;
        }

        public Criteria andOcEmissionNotIn(List<Double> values) {
            addCriterion("oc_emission not in", values, "ocEmission");
            return (Criteria) this;
        }

        public Criteria andOcEmissionBetween(Double value1, Double value2) {
            addCriterion("oc_emission between", value1, value2, "ocEmission");
            return (Criteria) this;
        }

        public Criteria andOcEmissionNotBetween(Double value1, Double value2) {
            addCriterion("oc_emission not between", value1, value2, "ocEmission");
            return (Criteria) this;
        }

        public Criteria andBcEmissionIsNull() {
            addCriterion("bc_emission is null");
            return (Criteria) this;
        }

        public Criteria andBcEmissionIsNotNull() {
            addCriterion("bc_emission is not null");
            return (Criteria) this;
        }

        public Criteria andBcEmissionEqualTo(Double value) {
            addCriterion("bc_emission =", value, "bcEmission");
            return (Criteria) this;
        }

        public Criteria andBcEmissionNotEqualTo(Double value) {
            addCriterion("bc_emission <>", value, "bcEmission");
            return (Criteria) this;
        }

        public Criteria andBcEmissionGreaterThan(Double value) {
            addCriterion("bc_emission >", value, "bcEmission");
            return (Criteria) this;
        }

        public Criteria andBcEmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("bc_emission >=", value, "bcEmission");
            return (Criteria) this;
        }

        public Criteria andBcEmissionLessThan(Double value) {
            addCriterion("bc_emission <", value, "bcEmission");
            return (Criteria) this;
        }

        public Criteria andBcEmissionLessThanOrEqualTo(Double value) {
            addCriterion("bc_emission <=", value, "bcEmission");
            return (Criteria) this;
        }

        public Criteria andBcEmissionIn(List<Double> values) {
            addCriterion("bc_emission in", values, "bcEmission");
            return (Criteria) this;
        }

        public Criteria andBcEmissionNotIn(List<Double> values) {
            addCriterion("bc_emission not in", values, "bcEmission");
            return (Criteria) this;
        }

        public Criteria andBcEmissionBetween(Double value1, Double value2) {
            addCriterion("bc_emission between", value1, value2, "bcEmission");
            return (Criteria) this;
        }

        public Criteria andBcEmissionNotBetween(Double value1, Double value2) {
            addCriterion("bc_emission not between", value1, value2, "bcEmission");
            return (Criteria) this;
        }

        public Criteria andSourceDescriptionIsNull() {
            addCriterion("source_description is null");
            return (Criteria) this;
        }

        public Criteria andSourceDescriptionIsNotNull() {
            addCriterion("source_description is not null");
            return (Criteria) this;
        }

        public Criteria andSourceDescriptionEqualTo(String value) {
            addCriterion("source_description =", value, "sourceDescription");
            return (Criteria) this;
        }

        public Criteria andSourceDescriptionNotEqualTo(String value) {
            addCriterion("source_description <>", value, "sourceDescription");
            return (Criteria) this;
        }

        public Criteria andSourceDescriptionGreaterThan(String value) {
            addCriterion("source_description >", value, "sourceDescription");
            return (Criteria) this;
        }

        public Criteria andSourceDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("source_description >=", value, "sourceDescription");
            return (Criteria) this;
        }

        public Criteria andSourceDescriptionLessThan(String value) {
            addCriterion("source_description <", value, "sourceDescription");
            return (Criteria) this;
        }

        public Criteria andSourceDescriptionLessThanOrEqualTo(String value) {
            addCriterion("source_description <=", value, "sourceDescription");
            return (Criteria) this;
        }

        public Criteria andSourceDescriptionLike(String value) {
            addCriterion("source_description like", value, "sourceDescription");
            return (Criteria) this;
        }

        public Criteria andSourceDescriptionNotLike(String value) {
            addCriterion("source_description not like", value, "sourceDescription");
            return (Criteria) this;
        }

        public Criteria andSourceDescriptionIn(List<String> values) {
            addCriterion("source_description in", values, "sourceDescription");
            return (Criteria) this;
        }

        public Criteria andSourceDescriptionNotIn(List<String> values) {
            addCriterion("source_description not in", values, "sourceDescription");
            return (Criteria) this;
        }

        public Criteria andSourceDescriptionBetween(String value1, String value2) {
            addCriterion("source_description between", value1, value2, "sourceDescription");
            return (Criteria) this;
        }

        public Criteria andSourceDescriptionNotBetween(String value1, String value2) {
            addCriterion("source_description not between", value1, value2, "sourceDescription");
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