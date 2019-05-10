package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class NongmuWeightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NongmuWeightExample() {
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

        public Criteria andFishnetIdIsNull() {
            addCriterion("Fishnet_ID is null");
            return (Criteria) this;
        }

        public Criteria andFishnetIdIsNotNull() {
            addCriterion("Fishnet_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFishnetIdEqualTo(Integer value) {
            addCriterion("Fishnet_ID =", value, "fishnetId");
            return (Criteria) this;
        }

        public Criteria andFishnetIdNotEqualTo(Integer value) {
            addCriterion("Fishnet_ID <>", value, "fishnetId");
            return (Criteria) this;
        }

        public Criteria andFishnetIdGreaterThan(Integer value) {
            addCriterion("Fishnet_ID >", value, "fishnetId");
            return (Criteria) this;
        }

        public Criteria andFishnetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Fishnet_ID >=", value, "fishnetId");
            return (Criteria) this;
        }

        public Criteria andFishnetIdLessThan(Integer value) {
            addCriterion("Fishnet_ID <", value, "fishnetId");
            return (Criteria) this;
        }

        public Criteria andFishnetIdLessThanOrEqualTo(Integer value) {
            addCriterion("Fishnet_ID <=", value, "fishnetId");
            return (Criteria) this;
        }

        public Criteria andFishnetIdIn(List<Integer> values) {
            addCriterion("Fishnet_ID in", values, "fishnetId");
            return (Criteria) this;
        }

        public Criteria andFishnetIdNotIn(List<Integer> values) {
            addCriterion("Fishnet_ID not in", values, "fishnetId");
            return (Criteria) this;
        }

        public Criteria andFishnetIdBetween(Integer value1, Integer value2) {
            addCriterion("Fishnet_ID between", value1, value2, "fishnetId");
            return (Criteria) this;
        }

        public Criteria andFishnetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Fishnet_ID not between", value1, value2, "fishnetId");
            return (Criteria) this;
        }

        public Criteria andNongtianWeightIsNull() {
            addCriterion("nongtian_weight is null");
            return (Criteria) this;
        }

        public Criteria andNongtianWeightIsNotNull() {
            addCriterion("nongtian_weight is not null");
            return (Criteria) this;
        }

        public Criteria andNongtianWeightEqualTo(Double value) {
            addCriterion("nongtian_weight =", value, "nongtianWeight");
            return (Criteria) this;
        }

        public Criteria andNongtianWeightNotEqualTo(Double value) {
            addCriterion("nongtian_weight <>", value, "nongtianWeight");
            return (Criteria) this;
        }

        public Criteria andNongtianWeightGreaterThan(Double value) {
            addCriterion("nongtian_weight >", value, "nongtianWeight");
            return (Criteria) this;
        }

        public Criteria andNongtianWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("nongtian_weight >=", value, "nongtianWeight");
            return (Criteria) this;
        }

        public Criteria andNongtianWeightLessThan(Double value) {
            addCriterion("nongtian_weight <", value, "nongtianWeight");
            return (Criteria) this;
        }

        public Criteria andNongtianWeightLessThanOrEqualTo(Double value) {
            addCriterion("nongtian_weight <=", value, "nongtianWeight");
            return (Criteria) this;
        }

        public Criteria andNongtianWeightIn(List<Double> values) {
            addCriterion("nongtian_weight in", values, "nongtianWeight");
            return (Criteria) this;
        }

        public Criteria andNongtianWeightNotIn(List<Double> values) {
            addCriterion("nongtian_weight not in", values, "nongtianWeight");
            return (Criteria) this;
        }

        public Criteria andNongtianWeightBetween(Double value1, Double value2) {
            addCriterion("nongtian_weight between", value1, value2, "nongtianWeight");
            return (Criteria) this;
        }

        public Criteria andNongtianWeightNotBetween(Double value1, Double value2) {
            addCriterion("nongtian_weight not between", value1, value2, "nongtianWeight");
            return (Criteria) this;
        }

        public Criteria andNongtianCountyIsNull() {
            addCriterion("nongtian_county is null");
            return (Criteria) this;
        }

        public Criteria andNongtianCountyIsNotNull() {
            addCriterion("nongtian_county is not null");
            return (Criteria) this;
        }

        public Criteria andNongtianCountyEqualTo(String value) {
            addCriterion("nongtian_county =", value, "nongtianCounty");
            return (Criteria) this;
        }

        public Criteria andNongtianCountyNotEqualTo(String value) {
            addCriterion("nongtian_county <>", value, "nongtianCounty");
            return (Criteria) this;
        }

        public Criteria andNongtianCountyGreaterThan(String value) {
            addCriterion("nongtian_county >", value, "nongtianCounty");
            return (Criteria) this;
        }

        public Criteria andNongtianCountyGreaterThanOrEqualTo(String value) {
            addCriterion("nongtian_county >=", value, "nongtianCounty");
            return (Criteria) this;
        }

        public Criteria andNongtianCountyLessThan(String value) {
            addCriterion("nongtian_county <", value, "nongtianCounty");
            return (Criteria) this;
        }

        public Criteria andNongtianCountyLessThanOrEqualTo(String value) {
            addCriterion("nongtian_county <=", value, "nongtianCounty");
            return (Criteria) this;
        }

        public Criteria andNongtianCountyLike(String value) {
            addCriterion("nongtian_county like", value, "nongtianCounty");
            return (Criteria) this;
        }

        public Criteria andNongtianCountyNotLike(String value) {
            addCriterion("nongtian_county not like", value, "nongtianCounty");
            return (Criteria) this;
        }

        public Criteria andNongtianCountyIn(List<String> values) {
            addCriterion("nongtian_county in", values, "nongtianCounty");
            return (Criteria) this;
        }

        public Criteria andNongtianCountyNotIn(List<String> values) {
            addCriterion("nongtian_county not in", values, "nongtianCounty");
            return (Criteria) this;
        }

        public Criteria andNongtianCountyBetween(String value1, String value2) {
            addCriterion("nongtian_county between", value1, value2, "nongtianCounty");
            return (Criteria) this;
        }

        public Criteria andNongtianCountyNotBetween(String value1, String value2) {
            addCriterion("nongtian_county not between", value1, value2, "nongtianCounty");
            return (Criteria) this;
        }

        public Criteria andFreestockWeightIsNull() {
            addCriterion("freestock_weight is null");
            return (Criteria) this;
        }

        public Criteria andFreestockWeightIsNotNull() {
            addCriterion("freestock_weight is not null");
            return (Criteria) this;
        }

        public Criteria andFreestockWeightEqualTo(Double value) {
            addCriterion("freestock_weight =", value, "freestockWeight");
            return (Criteria) this;
        }

        public Criteria andFreestockWeightNotEqualTo(Double value) {
            addCriterion("freestock_weight <>", value, "freestockWeight");
            return (Criteria) this;
        }

        public Criteria andFreestockWeightGreaterThan(Double value) {
            addCriterion("freestock_weight >", value, "freestockWeight");
            return (Criteria) this;
        }

        public Criteria andFreestockWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("freestock_weight >=", value, "freestockWeight");
            return (Criteria) this;
        }

        public Criteria andFreestockWeightLessThan(Double value) {
            addCriterion("freestock_weight <", value, "freestockWeight");
            return (Criteria) this;
        }

        public Criteria andFreestockWeightLessThanOrEqualTo(Double value) {
            addCriterion("freestock_weight <=", value, "freestockWeight");
            return (Criteria) this;
        }

        public Criteria andFreestockWeightIn(List<Double> values) {
            addCriterion("freestock_weight in", values, "freestockWeight");
            return (Criteria) this;
        }

        public Criteria andFreestockWeightNotIn(List<Double> values) {
            addCriterion("freestock_weight not in", values, "freestockWeight");
            return (Criteria) this;
        }

        public Criteria andFreestockWeightBetween(Double value1, Double value2) {
            addCriterion("freestock_weight between", value1, value2, "freestockWeight");
            return (Criteria) this;
        }

        public Criteria andFreestockWeightNotBetween(Double value1, Double value2) {
            addCriterion("freestock_weight not between", value1, value2, "freestockWeight");
            return (Criteria) this;
        }

        public Criteria andFreestockCountyIsNull() {
            addCriterion("freestock_county is null");
            return (Criteria) this;
        }

        public Criteria andFreestockCountyIsNotNull() {
            addCriterion("freestock_county is not null");
            return (Criteria) this;
        }

        public Criteria andFreestockCountyEqualTo(String value) {
            addCriterion("freestock_county =", value, "freestockCounty");
            return (Criteria) this;
        }

        public Criteria andFreestockCountyNotEqualTo(String value) {
            addCriterion("freestock_county <>", value, "freestockCounty");
            return (Criteria) this;
        }

        public Criteria andFreestockCountyGreaterThan(String value) {
            addCriterion("freestock_county >", value, "freestockCounty");
            return (Criteria) this;
        }

        public Criteria andFreestockCountyGreaterThanOrEqualTo(String value) {
            addCriterion("freestock_county >=", value, "freestockCounty");
            return (Criteria) this;
        }

        public Criteria andFreestockCountyLessThan(String value) {
            addCriterion("freestock_county <", value, "freestockCounty");
            return (Criteria) this;
        }

        public Criteria andFreestockCountyLessThanOrEqualTo(String value) {
            addCriterion("freestock_county <=", value, "freestockCounty");
            return (Criteria) this;
        }

        public Criteria andFreestockCountyLike(String value) {
            addCriterion("freestock_county like", value, "freestockCounty");
            return (Criteria) this;
        }

        public Criteria andFreestockCountyNotLike(String value) {
            addCriterion("freestock_county not like", value, "freestockCounty");
            return (Criteria) this;
        }

        public Criteria andFreestockCountyIn(List<String> values) {
            addCriterion("freestock_county in", values, "freestockCounty");
            return (Criteria) this;
        }

        public Criteria andFreestockCountyNotIn(List<String> values) {
            addCriterion("freestock_county not in", values, "freestockCounty");
            return (Criteria) this;
        }

        public Criteria andFreestockCountyBetween(String value1, String value2) {
            addCriterion("freestock_county between", value1, value2, "freestockCounty");
            return (Criteria) this;
        }

        public Criteria andFreestockCountyNotBetween(String value1, String value2) {
            addCriterion("freestock_county not between", value1, value2, "freestockCounty");
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

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("year not between", value1, value2, "year");
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