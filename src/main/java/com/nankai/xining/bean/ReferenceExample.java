package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class ReferenceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReferenceExample() {
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

        public Criteria andKTspIsNull() {
            addCriterion("k_tsp is null");
            return (Criteria) this;
        }

        public Criteria andKTspIsNotNull() {
            addCriterion("k_tsp is not null");
            return (Criteria) this;
        }

        public Criteria andKTspEqualTo(Double value) {
            addCriterion("k_tsp =", value, "kTsp");
            return (Criteria) this;
        }

        public Criteria andKTspNotEqualTo(Double value) {
            addCriterion("k_tsp <>", value, "kTsp");
            return (Criteria) this;
        }

        public Criteria andKTspGreaterThan(Double value) {
            addCriterion("k_tsp >", value, "kTsp");
            return (Criteria) this;
        }

        public Criteria andKTspGreaterThanOrEqualTo(Double value) {
            addCriterion("k_tsp >=", value, "kTsp");
            return (Criteria) this;
        }

        public Criteria andKTspLessThan(Double value) {
            addCriterion("k_tsp <", value, "kTsp");
            return (Criteria) this;
        }

        public Criteria andKTspLessThanOrEqualTo(Double value) {
            addCriterion("k_tsp <=", value, "kTsp");
            return (Criteria) this;
        }

        public Criteria andKTspIn(List<Double> values) {
            addCriterion("k_tsp in", values, "kTsp");
            return (Criteria) this;
        }

        public Criteria andKTspNotIn(List<Double> values) {
            addCriterion("k_tsp not in", values, "kTsp");
            return (Criteria) this;
        }

        public Criteria andKTspBetween(Double value1, Double value2) {
            addCriterion("k_tsp between", value1, value2, "kTsp");
            return (Criteria) this;
        }

        public Criteria andKTspNotBetween(Double value1, Double value2) {
            addCriterion("k_tsp not between", value1, value2, "kTsp");
            return (Criteria) this;
        }

        public Criteria andKPm10IsNull() {
            addCriterion("k_pm10 is null");
            return (Criteria) this;
        }

        public Criteria andKPm10IsNotNull() {
            addCriterion("k_pm10 is not null");
            return (Criteria) this;
        }

        public Criteria andKPm10EqualTo(Double value) {
            addCriterion("k_pm10 =", value, "kPm10");
            return (Criteria) this;
        }

        public Criteria andKPm10NotEqualTo(Double value) {
            addCriterion("k_pm10 <>", value, "kPm10");
            return (Criteria) this;
        }

        public Criteria andKPm10GreaterThan(Double value) {
            addCriterion("k_pm10 >", value, "kPm10");
            return (Criteria) this;
        }

        public Criteria andKPm10GreaterThanOrEqualTo(Double value) {
            addCriterion("k_pm10 >=", value, "kPm10");
            return (Criteria) this;
        }

        public Criteria andKPm10LessThan(Double value) {
            addCriterion("k_pm10 <", value, "kPm10");
            return (Criteria) this;
        }

        public Criteria andKPm10LessThanOrEqualTo(Double value) {
            addCriterion("k_pm10 <=", value, "kPm10");
            return (Criteria) this;
        }

        public Criteria andKPm10In(List<Double> values) {
            addCriterion("k_pm10 in", values, "kPm10");
            return (Criteria) this;
        }

        public Criteria andKPm10NotIn(List<Double> values) {
            addCriterion("k_pm10 not in", values, "kPm10");
            return (Criteria) this;
        }

        public Criteria andKPm10Between(Double value1, Double value2) {
            addCriterion("k_pm10 between", value1, value2, "kPm10");
            return (Criteria) this;
        }

        public Criteria andKPm10NotBetween(Double value1, Double value2) {
            addCriterion("k_pm10 not between", value1, value2, "kPm10");
            return (Criteria) this;
        }

        public Criteria andKPm25IsNull() {
            addCriterion("k_pm25 is null");
            return (Criteria) this;
        }

        public Criteria andKPm25IsNotNull() {
            addCriterion("k_pm25 is not null");
            return (Criteria) this;
        }

        public Criteria andKPm25EqualTo(Double value) {
            addCriterion("k_pm25 =", value, "kPm25");
            return (Criteria) this;
        }

        public Criteria andKPm25NotEqualTo(Double value) {
            addCriterion("k_pm25 <>", value, "kPm25");
            return (Criteria) this;
        }

        public Criteria andKPm25GreaterThan(Double value) {
            addCriterion("k_pm25 >", value, "kPm25");
            return (Criteria) this;
        }

        public Criteria andKPm25GreaterThanOrEqualTo(Double value) {
            addCriterion("k_pm25 >=", value, "kPm25");
            return (Criteria) this;
        }

        public Criteria andKPm25LessThan(Double value) {
            addCriterion("k_pm25 <", value, "kPm25");
            return (Criteria) this;
        }

        public Criteria andKPm25LessThanOrEqualTo(Double value) {
            addCriterion("k_pm25 <=", value, "kPm25");
            return (Criteria) this;
        }

        public Criteria andKPm25In(List<Double> values) {
            addCriterion("k_pm25 in", values, "kPm25");
            return (Criteria) this;
        }

        public Criteria andKPm25NotIn(List<Double> values) {
            addCriterion("k_pm25 not in", values, "kPm25");
            return (Criteria) this;
        }

        public Criteria andKPm25Between(Double value1, Double value2) {
            addCriterion("k_pm25 between", value1, value2, "kPm25");
            return (Criteria) this;
        }

        public Criteria andKPm25NotBetween(Double value1, Double value2) {
            addCriterion("k_pm25 not between", value1, value2, "kPm25");
            return (Criteria) this;
        }

        public Criteria andVkcIsNull() {
            addCriterion("vkc is null");
            return (Criteria) this;
        }

        public Criteria andVkcIsNotNull() {
            addCriterion("vkc is not null");
            return (Criteria) this;
        }

        public Criteria andVkcEqualTo(Double value) {
            addCriterion("vkc =", value, "vkc");
            return (Criteria) this;
        }

        public Criteria andVkcNotEqualTo(Double value) {
            addCriterion("vkc <>", value, "vkc");
            return (Criteria) this;
        }

        public Criteria andVkcGreaterThan(Double value) {
            addCriterion("vkc >", value, "vkc");
            return (Criteria) this;
        }

        public Criteria andVkcGreaterThanOrEqualTo(Double value) {
            addCriterion("vkc >=", value, "vkc");
            return (Criteria) this;
        }

        public Criteria andVkcLessThan(Double value) {
            addCriterion("vkc <", value, "vkc");
            return (Criteria) this;
        }

        public Criteria andVkcLessThanOrEqualTo(Double value) {
            addCriterion("vkc <=", value, "vkc");
            return (Criteria) this;
        }

        public Criteria andVkcIn(List<Double> values) {
            addCriterion("vkc in", values, "vkc");
            return (Criteria) this;
        }

        public Criteria andVkcNotIn(List<Double> values) {
            addCriterion("vkc not in", values, "vkc");
            return (Criteria) this;
        }

        public Criteria andVkcBetween(Double value1, Double value2) {
            addCriterion("vkc between", value1, value2, "vkc");
            return (Criteria) this;
        }

        public Criteria andVkcNotBetween(Double value1, Double value2) {
            addCriterion("vkc not between", value1, value2, "vkc");
            return (Criteria) this;
        }

        public Criteria andVelocityHeightIsNull() {
            addCriterion("velocity_height is null");
            return (Criteria) this;
        }

        public Criteria andVelocityHeightIsNotNull() {
            addCriterion("velocity_height is not null");
            return (Criteria) this;
        }

        public Criteria andVelocityHeightEqualTo(Double value) {
            addCriterion("velocity_height =", value, "velocityHeight");
            return (Criteria) this;
        }

        public Criteria andVelocityHeightNotEqualTo(Double value) {
            addCriterion("velocity_height <>", value, "velocityHeight");
            return (Criteria) this;
        }

        public Criteria andVelocityHeightGreaterThan(Double value) {
            addCriterion("velocity_height >", value, "velocityHeight");
            return (Criteria) this;
        }

        public Criteria andVelocityHeightGreaterThanOrEqualTo(Double value) {
            addCriterion("velocity_height >=", value, "velocityHeight");
            return (Criteria) this;
        }

        public Criteria andVelocityHeightLessThan(Double value) {
            addCriterion("velocity_height <", value, "velocityHeight");
            return (Criteria) this;
        }

        public Criteria andVelocityHeightLessThanOrEqualTo(Double value) {
            addCriterion("velocity_height <=", value, "velocityHeight");
            return (Criteria) this;
        }

        public Criteria andVelocityHeightIn(List<Double> values) {
            addCriterion("velocity_height in", values, "velocityHeight");
            return (Criteria) this;
        }

        public Criteria andVelocityHeightNotIn(List<Double> values) {
            addCriterion("velocity_height not in", values, "velocityHeight");
            return (Criteria) this;
        }

        public Criteria andVelocityHeightBetween(Double value1, Double value2) {
            addCriterion("velocity_height between", value1, value2, "velocityHeight");
            return (Criteria) this;
        }

        public Criteria andVelocityHeightNotBetween(Double value1, Double value2) {
            addCriterion("velocity_height not between", value1, value2, "velocityHeight");
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