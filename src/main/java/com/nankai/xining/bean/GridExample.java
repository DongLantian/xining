package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class GridExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GridExample() {
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

        public Criteria andGrididIsNull() {
            addCriterion("gridid is null");
            return (Criteria) this;
        }

        public Criteria andGrididIsNotNull() {
            addCriterion("gridid is not null");
            return (Criteria) this;
        }

        public Criteria andGrididEqualTo(String value) {
            addCriterion("gridid =", value, "gridid");
            return (Criteria) this;
        }

        public Criteria andGrididNotEqualTo(String value) {
            addCriterion("gridid <>", value, "gridid");
            return (Criteria) this;
        }

        public Criteria andGrididGreaterThan(String value) {
            addCriterion("gridid >", value, "gridid");
            return (Criteria) this;
        }

        public Criteria andGrididGreaterThanOrEqualTo(String value) {
            addCriterion("gridid >=", value, "gridid");
            return (Criteria) this;
        }

        public Criteria andGrididLessThan(String value) {
            addCriterion("gridid <", value, "gridid");
            return (Criteria) this;
        }

        public Criteria andGrididLessThanOrEqualTo(String value) {
            addCriterion("gridid <=", value, "gridid");
            return (Criteria) this;
        }

        public Criteria andGrididLike(String value) {
            addCriterion("gridid like", value, "gridid");
            return (Criteria) this;
        }

        public Criteria andGrididNotLike(String value) {
            addCriterion("gridid not like", value, "gridid");
            return (Criteria) this;
        }

        public Criteria andGrididIn(List<String> values) {
            addCriterion("gridid in", values, "gridid");
            return (Criteria) this;
        }

        public Criteria andGrididNotIn(List<String> values) {
            addCriterion("gridid not in", values, "gridid");
            return (Criteria) this;
        }

        public Criteria andGrididBetween(String value1, String value2) {
            addCriterion("gridid between", value1, value2, "gridid");
            return (Criteria) this;
        }

        public Criteria andGrididNotBetween(String value1, String value2) {
            addCriterion("gridid not between", value1, value2, "gridid");
            return (Criteria) this;
        }

        public Criteria andCountyidIsNull() {
            addCriterion("countyid is null");
            return (Criteria) this;
        }

        public Criteria andCountyidIsNotNull() {
            addCriterion("countyid is not null");
            return (Criteria) this;
        }

        public Criteria andCountyidEqualTo(String value) {
            addCriterion("countyid =", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidNotEqualTo(String value) {
            addCriterion("countyid <>", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidGreaterThan(String value) {
            addCriterion("countyid >", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidGreaterThanOrEqualTo(String value) {
            addCriterion("countyid >=", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidLessThan(String value) {
            addCriterion("countyid <", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidLessThanOrEqualTo(String value) {
            addCriterion("countyid <=", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidLike(String value) {
            addCriterion("countyid like", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidNotLike(String value) {
            addCriterion("countyid not like", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidIn(List<String> values) {
            addCriterion("countyid in", values, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidNotIn(List<String> values) {
            addCriterion("countyid not in", values, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidBetween(String value1, String value2) {
            addCriterion("countyid between", value1, value2, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidNotBetween(String value1, String value2) {
            addCriterion("countyid not between", value1, value2, "countyid");
            return (Criteria) this;
        }

        public Criteria andColIsNull() {
            addCriterion("col is null");
            return (Criteria) this;
        }

        public Criteria andColIsNotNull() {
            addCriterion("col is not null");
            return (Criteria) this;
        }

        public Criteria andColEqualTo(String value) {
            addCriterion("col =", value, "col");
            return (Criteria) this;
        }

        public Criteria andColNotEqualTo(String value) {
            addCriterion("col <>", value, "col");
            return (Criteria) this;
        }

        public Criteria andColGreaterThan(String value) {
            addCriterion("col >", value, "col");
            return (Criteria) this;
        }

        public Criteria andColGreaterThanOrEqualTo(String value) {
            addCriterion("col >=", value, "col");
            return (Criteria) this;
        }

        public Criteria andColLessThan(String value) {
            addCriterion("col <", value, "col");
            return (Criteria) this;
        }

        public Criteria andColLessThanOrEqualTo(String value) {
            addCriterion("col <=", value, "col");
            return (Criteria) this;
        }

        public Criteria andColLike(String value) {
            addCriterion("col like", value, "col");
            return (Criteria) this;
        }

        public Criteria andColNotLike(String value) {
            addCriterion("col not like", value, "col");
            return (Criteria) this;
        }

        public Criteria andColIn(List<String> values) {
            addCriterion("col in", values, "col");
            return (Criteria) this;
        }

        public Criteria andColNotIn(List<String> values) {
            addCriterion("col not in", values, "col");
            return (Criteria) this;
        }

        public Criteria andColBetween(String value1, String value2) {
            addCriterion("col between", value1, value2, "col");
            return (Criteria) this;
        }

        public Criteria andColNotBetween(String value1, String value2) {
            addCriterion("col not between", value1, value2, "col");
            return (Criteria) this;
        }

        public Criteria andRowIsNull() {
            addCriterion("row is null");
            return (Criteria) this;
        }

        public Criteria andRowIsNotNull() {
            addCriterion("row is not null");
            return (Criteria) this;
        }

        public Criteria andRowEqualTo(String value) {
            addCriterion("row =", value, "row");
            return (Criteria) this;
        }

        public Criteria andRowNotEqualTo(String value) {
            addCriterion("row <>", value, "row");
            return (Criteria) this;
        }

        public Criteria andRowGreaterThan(String value) {
            addCriterion("row >", value, "row");
            return (Criteria) this;
        }

        public Criteria andRowGreaterThanOrEqualTo(String value) {
            addCriterion("row >=", value, "row");
            return (Criteria) this;
        }

        public Criteria andRowLessThan(String value) {
            addCriterion("row <", value, "row");
            return (Criteria) this;
        }

        public Criteria andRowLessThanOrEqualTo(String value) {
            addCriterion("row <=", value, "row");
            return (Criteria) this;
        }

        public Criteria andRowLike(String value) {
            addCriterion("row like", value, "row");
            return (Criteria) this;
        }

        public Criteria andRowNotLike(String value) {
            addCriterion("row not like", value, "row");
            return (Criteria) this;
        }

        public Criteria andRowIn(List<String> values) {
            addCriterion("row in", values, "row");
            return (Criteria) this;
        }

        public Criteria andRowNotIn(List<String> values) {
            addCriterion("row not in", values, "row");
            return (Criteria) this;
        }

        public Criteria andRowBetween(String value1, String value2) {
            addCriterion("row between", value1, value2, "row");
            return (Criteria) this;
        }

        public Criteria andRowNotBetween(String value1, String value2) {
            addCriterion("row not between", value1, value2, "row");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(Double value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(Double value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(Double value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(Double value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(Double value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(Double value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<Double> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<Double> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(Double value1, Double value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(Double value1, Double value2) {
            addCriterion("rate not between", value1, value2, "rate");
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