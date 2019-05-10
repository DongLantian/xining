package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class FellReferenceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FellReferenceExample() {
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

        public Criteria andNkMIsNull() {
            addCriterion("nk_m is null");
            return (Criteria) this;
        }

        public Criteria andNkMIsNotNull() {
            addCriterion("nk_m is not null");
            return (Criteria) this;
        }

        public Criteria andNkMEqualTo(String value) {
            addCriterion("nk_m =", value, "nkM");
            return (Criteria) this;
        }

        public Criteria andNkMNotEqualTo(String value) {
            addCriterion("nk_m <>", value, "nkM");
            return (Criteria) this;
        }

        public Criteria andNkMGreaterThan(String value) {
            addCriterion("nk_m >", value, "nkM");
            return (Criteria) this;
        }

        public Criteria andNkMGreaterThanOrEqualTo(String value) {
            addCriterion("nk_m >=", value, "nkM");
            return (Criteria) this;
        }

        public Criteria andNkMLessThan(String value) {
            addCriterion("nk_m <", value, "nkM");
            return (Criteria) this;
        }

        public Criteria andNkMLessThanOrEqualTo(String value) {
            addCriterion("nk_m <=", value, "nkM");
            return (Criteria) this;
        }

        public Criteria andNkMLike(String value) {
            addCriterion("nk_m like", value, "nkM");
            return (Criteria) this;
        }

        public Criteria andNkMNotLike(String value) {
            addCriterion("nk_m not like", value, "nkM");
            return (Criteria) this;
        }

        public Criteria andNkMIn(List<String> values) {
            addCriterion("nk_m in", values, "nkM");
            return (Criteria) this;
        }

        public Criteria andNkMNotIn(List<String> values) {
            addCriterion("nk_m not in", values, "nkM");
            return (Criteria) this;
        }

        public Criteria andNkMBetween(String value1, String value2) {
            addCriterion("nk_m between", value1, value2, "nkM");
            return (Criteria) this;
        }

        public Criteria andNkMNotBetween(String value1, String value2) {
            addCriterion("nk_m not between", value1, value2, "nkM");
            return (Criteria) this;
        }

        public Criteria andNkValueIsNull() {
            addCriterion("nk_value is null");
            return (Criteria) this;
        }

        public Criteria andNkValueIsNotNull() {
            addCriterion("nk_value is not null");
            return (Criteria) this;
        }

        public Criteria andNkValueEqualTo(Double value) {
            addCriterion("nk_value =", value, "nkValue");
            return (Criteria) this;
        }

        public Criteria andNkValueNotEqualTo(Double value) {
            addCriterion("nk_value <>", value, "nkValue");
            return (Criteria) this;
        }

        public Criteria andNkValueGreaterThan(Double value) {
            addCriterion("nk_value >", value, "nkValue");
            return (Criteria) this;
        }

        public Criteria andNkValueGreaterThanOrEqualTo(Double value) {
            addCriterion("nk_value >=", value, "nkValue");
            return (Criteria) this;
        }

        public Criteria andNkValueLessThan(Double value) {
            addCriterion("nk_value <", value, "nkValue");
            return (Criteria) this;
        }

        public Criteria andNkValueLessThanOrEqualTo(Double value) {
            addCriterion("nk_value <=", value, "nkValue");
            return (Criteria) this;
        }

        public Criteria andNkValueIn(List<Double> values) {
            addCriterion("nk_value in", values, "nkValue");
            return (Criteria) this;
        }

        public Criteria andNkValueNotIn(List<Double> values) {
            addCriterion("nk_value not in", values, "nkValue");
            return (Criteria) this;
        }

        public Criteria andNkValueBetween(Double value1, Double value2) {
            addCriterion("nk_value between", value1, value2, "nkValue");
            return (Criteria) this;
        }

        public Criteria andNkValueNotBetween(Double value1, Double value2) {
            addCriterion("nk_value not between", value1, value2, "nkValue");
            return (Criteria) this;
        }

        public Criteria andNkUnitIsNull() {
            addCriterion("nk_unit is null");
            return (Criteria) this;
        }

        public Criteria andNkUnitIsNotNull() {
            addCriterion("nk_unit is not null");
            return (Criteria) this;
        }

        public Criteria andNkUnitEqualTo(String value) {
            addCriterion("nk_unit =", value, "nkUnit");
            return (Criteria) this;
        }

        public Criteria andNkUnitNotEqualTo(String value) {
            addCriterion("nk_unit <>", value, "nkUnit");
            return (Criteria) this;
        }

        public Criteria andNkUnitGreaterThan(String value) {
            addCriterion("nk_unit >", value, "nkUnit");
            return (Criteria) this;
        }

        public Criteria andNkUnitGreaterThanOrEqualTo(String value) {
            addCriterion("nk_unit >=", value, "nkUnit");
            return (Criteria) this;
        }

        public Criteria andNkUnitLessThan(String value) {
            addCriterion("nk_unit <", value, "nkUnit");
            return (Criteria) this;
        }

        public Criteria andNkUnitLessThanOrEqualTo(String value) {
            addCriterion("nk_unit <=", value, "nkUnit");
            return (Criteria) this;
        }

        public Criteria andNkUnitLike(String value) {
            addCriterion("nk_unit like", value, "nkUnit");
            return (Criteria) this;
        }

        public Criteria andNkUnitNotLike(String value) {
            addCriterion("nk_unit not like", value, "nkUnit");
            return (Criteria) this;
        }

        public Criteria andNkUnitIn(List<String> values) {
            addCriterion("nk_unit in", values, "nkUnit");
            return (Criteria) this;
        }

        public Criteria andNkUnitNotIn(List<String> values) {
            addCriterion("nk_unit not in", values, "nkUnit");
            return (Criteria) this;
        }

        public Criteria andNkUnitBetween(String value1, String value2) {
            addCriterion("nk_unit between", value1, value2, "nkUnit");
            return (Criteria) this;
        }

        public Criteria andNkUnitNotBetween(String value1, String value2) {
            addCriterion("nk_unit not between", value1, value2, "nkUnit");
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