package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class XjyearweatherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XjyearweatherExample() {
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

        public Criteria andYwIdIsNull() {
            addCriterion("yw_id is null");
            return (Criteria) this;
        }

        public Criteria andYwIdIsNotNull() {
            addCriterion("yw_id is not null");
            return (Criteria) this;
        }

        public Criteria andYwIdEqualTo(Integer value) {
            addCriterion("yw_id =", value, "ywId");
            return (Criteria) this;
        }

        public Criteria andYwIdNotEqualTo(Integer value) {
            addCriterion("yw_id <>", value, "ywId");
            return (Criteria) this;
        }

        public Criteria andYwIdGreaterThan(Integer value) {
            addCriterion("yw_id >", value, "ywId");
            return (Criteria) this;
        }

        public Criteria andYwIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("yw_id >=", value, "ywId");
            return (Criteria) this;
        }

        public Criteria andYwIdLessThan(Integer value) {
            addCriterion("yw_id <", value, "ywId");
            return (Criteria) this;
        }

        public Criteria andYwIdLessThanOrEqualTo(Integer value) {
            addCriterion("yw_id <=", value, "ywId");
            return (Criteria) this;
        }

        public Criteria andYwIdIn(List<Integer> values) {
            addCriterion("yw_id in", values, "ywId");
            return (Criteria) this;
        }

        public Criteria andYwIdNotIn(List<Integer> values) {
            addCriterion("yw_id not in", values, "ywId");
            return (Criteria) this;
        }

        public Criteria andYwIdBetween(Integer value1, Integer value2) {
            addCriterion("yw_id between", value1, value2, "ywId");
            return (Criteria) this;
        }

        public Criteria andYwIdNotBetween(Integer value1, Integer value2) {
            addCriterion("yw_id not between", value1, value2, "ywId");
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

        public Criteria andYRainfallIsNull() {
            addCriterion("y_rainfall is null");
            return (Criteria) this;
        }

        public Criteria andYRainfallIsNotNull() {
            addCriterion("y_rainfall is not null");
            return (Criteria) this;
        }

        public Criteria andYRainfallEqualTo(Double value) {
            addCriterion("y_rainfall =", value, "yRainfall");
            return (Criteria) this;
        }

        public Criteria andYRainfallNotEqualTo(Double value) {
            addCriterion("y_rainfall <>", value, "yRainfall");
            return (Criteria) this;
        }

        public Criteria andYRainfallGreaterThan(Double value) {
            addCriterion("y_rainfall >", value, "yRainfall");
            return (Criteria) this;
        }

        public Criteria andYRainfallGreaterThanOrEqualTo(Double value) {
            addCriterion("y_rainfall >=", value, "yRainfall");
            return (Criteria) this;
        }

        public Criteria andYRainfallLessThan(Double value) {
            addCriterion("y_rainfall <", value, "yRainfall");
            return (Criteria) this;
        }

        public Criteria andYRainfallLessThanOrEqualTo(Double value) {
            addCriterion("y_rainfall <=", value, "yRainfall");
            return (Criteria) this;
        }

        public Criteria andYRainfallIn(List<Double> values) {
            addCriterion("y_rainfall in", values, "yRainfall");
            return (Criteria) this;
        }

        public Criteria andYRainfallNotIn(List<Double> values) {
            addCriterion("y_rainfall not in", values, "yRainfall");
            return (Criteria) this;
        }

        public Criteria andYRainfallBetween(Double value1, Double value2) {
            addCriterion("y_rainfall between", value1, value2, "yRainfall");
            return (Criteria) this;
        }

        public Criteria andYRainfallNotBetween(Double value1, Double value2) {
            addCriterion("y_rainfall not between", value1, value2, "yRainfall");
            return (Criteria) this;
        }

        public Criteria andYTempIsNull() {
            addCriterion("y_temp is null");
            return (Criteria) this;
        }

        public Criteria andYTempIsNotNull() {
            addCriterion("y_temp is not null");
            return (Criteria) this;
        }

        public Criteria andYTempEqualTo(Double value) {
            addCriterion("y_temp =", value, "yTemp");
            return (Criteria) this;
        }

        public Criteria andYTempNotEqualTo(Double value) {
            addCriterion("y_temp <>", value, "yTemp");
            return (Criteria) this;
        }

        public Criteria andYTempGreaterThan(Double value) {
            addCriterion("y_temp >", value, "yTemp");
            return (Criteria) this;
        }

        public Criteria andYTempGreaterThanOrEqualTo(Double value) {
            addCriterion("y_temp >=", value, "yTemp");
            return (Criteria) this;
        }

        public Criteria andYTempLessThan(Double value) {
            addCriterion("y_temp <", value, "yTemp");
            return (Criteria) this;
        }

        public Criteria andYTempLessThanOrEqualTo(Double value) {
            addCriterion("y_temp <=", value, "yTemp");
            return (Criteria) this;
        }

        public Criteria andYTempIn(List<Double> values) {
            addCriterion("y_temp in", values, "yTemp");
            return (Criteria) this;
        }

        public Criteria andYTempNotIn(List<Double> values) {
            addCriterion("y_temp not in", values, "yTemp");
            return (Criteria) this;
        }

        public Criteria andYTempBetween(Double value1, Double value2) {
            addCriterion("y_temp between", value1, value2, "yTemp");
            return (Criteria) this;
        }

        public Criteria andYTempNotBetween(Double value1, Double value2) {
            addCriterion("y_temp not between", value1, value2, "yTemp");
            return (Criteria) this;
        }

        public Criteria andYPorationIsNull() {
            addCriterion("y_poration is null");
            return (Criteria) this;
        }

        public Criteria andYPorationIsNotNull() {
            addCriterion("y_poration is not null");
            return (Criteria) this;
        }

        public Criteria andYPorationEqualTo(Double value) {
            addCriterion("y_poration =", value, "yPoration");
            return (Criteria) this;
        }

        public Criteria andYPorationNotEqualTo(Double value) {
            addCriterion("y_poration <>", value, "yPoration");
            return (Criteria) this;
        }

        public Criteria andYPorationGreaterThan(Double value) {
            addCriterion("y_poration >", value, "yPoration");
            return (Criteria) this;
        }

        public Criteria andYPorationGreaterThanOrEqualTo(Double value) {
            addCriterion("y_poration >=", value, "yPoration");
            return (Criteria) this;
        }

        public Criteria andYPorationLessThan(Double value) {
            addCriterion("y_poration <", value, "yPoration");
            return (Criteria) this;
        }

        public Criteria andYPorationLessThanOrEqualTo(Double value) {
            addCriterion("y_poration <=", value, "yPoration");
            return (Criteria) this;
        }

        public Criteria andYPorationIn(List<Double> values) {
            addCriterion("y_poration in", values, "yPoration");
            return (Criteria) this;
        }

        public Criteria andYPorationNotIn(List<Double> values) {
            addCriterion("y_poration not in", values, "yPoration");
            return (Criteria) this;
        }

        public Criteria andYPorationBetween(Double value1, Double value2) {
            addCriterion("y_poration between", value1, value2, "yPoration");
            return (Criteria) this;
        }

        public Criteria andYPorationNotBetween(Double value1, Double value2) {
            addCriterion("y_poration not between", value1, value2, "yPoration");
            return (Criteria) this;
        }

        public Criteria andYWindrateIsNull() {
            addCriterion("y_windrate is null");
            return (Criteria) this;
        }

        public Criteria andYWindrateIsNotNull() {
            addCriterion("y_windrate is not null");
            return (Criteria) this;
        }

        public Criteria andYWindrateEqualTo(Double value) {
            addCriterion("y_windrate =", value, "yWindrate");
            return (Criteria) this;
        }

        public Criteria andYWindrateNotEqualTo(Double value) {
            addCriterion("y_windrate <>", value, "yWindrate");
            return (Criteria) this;
        }

        public Criteria andYWindrateGreaterThan(Double value) {
            addCriterion("y_windrate >", value, "yWindrate");
            return (Criteria) this;
        }

        public Criteria andYWindrateGreaterThanOrEqualTo(Double value) {
            addCriterion("y_windrate >=", value, "yWindrate");
            return (Criteria) this;
        }

        public Criteria andYWindrateLessThan(Double value) {
            addCriterion("y_windrate <", value, "yWindrate");
            return (Criteria) this;
        }

        public Criteria andYWindrateLessThanOrEqualTo(Double value) {
            addCriterion("y_windrate <=", value, "yWindrate");
            return (Criteria) this;
        }

        public Criteria andYWindrateIn(List<Double> values) {
            addCriterion("y_windrate in", values, "yWindrate");
            return (Criteria) this;
        }

        public Criteria andYWindrateNotIn(List<Double> values) {
            addCriterion("y_windrate not in", values, "yWindrate");
            return (Criteria) this;
        }

        public Criteria andYWindrateBetween(Double value1, Double value2) {
            addCriterion("y_windrate between", value1, value2, "yWindrate");
            return (Criteria) this;
        }

        public Criteria andYWindrateNotBetween(Double value1, Double value2) {
            addCriterion("y_windrate not between", value1, value2, "yWindrate");
            return (Criteria) this;
        }

        public Criteria andRainfallThresholdIsNull() {
            addCriterion("rainfall_threshold is null");
            return (Criteria) this;
        }

        public Criteria andRainfallThresholdIsNotNull() {
            addCriterion("rainfall_threshold is not null");
            return (Criteria) this;
        }

        public Criteria andRainfallThresholdEqualTo(Integer value) {
            addCriterion("rainfall_threshold =", value, "rainfallThreshold");
            return (Criteria) this;
        }

        public Criteria andRainfallThresholdNotEqualTo(Integer value) {
            addCriterion("rainfall_threshold <>", value, "rainfallThreshold");
            return (Criteria) this;
        }

        public Criteria andRainfallThresholdGreaterThan(Integer value) {
            addCriterion("rainfall_threshold >", value, "rainfallThreshold");
            return (Criteria) this;
        }

        public Criteria andRainfallThresholdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rainfall_threshold >=", value, "rainfallThreshold");
            return (Criteria) this;
        }

        public Criteria andRainfallThresholdLessThan(Integer value) {
            addCriterion("rainfall_threshold <", value, "rainfallThreshold");
            return (Criteria) this;
        }

        public Criteria andRainfallThresholdLessThanOrEqualTo(Integer value) {
            addCriterion("rainfall_threshold <=", value, "rainfallThreshold");
            return (Criteria) this;
        }

        public Criteria andRainfallThresholdIn(List<Integer> values) {
            addCriterion("rainfall_threshold in", values, "rainfallThreshold");
            return (Criteria) this;
        }

        public Criteria andRainfallThresholdNotIn(List<Integer> values) {
            addCriterion("rainfall_threshold not in", values, "rainfallThreshold");
            return (Criteria) this;
        }

        public Criteria andRainfallThresholdBetween(Integer value1, Integer value2) {
            addCriterion("rainfall_threshold between", value1, value2, "rainfallThreshold");
            return (Criteria) this;
        }

        public Criteria andRainfallThresholdNotBetween(Integer value1, Integer value2) {
            addCriterion("rainfall_threshold not between", value1, value2, "rainfallThreshold");
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