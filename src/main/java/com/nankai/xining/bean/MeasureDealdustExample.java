package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class MeasureDealdustExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MeasureDealdustExample() {
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

        public Criteria andDealdustidIsNull() {
            addCriterion("dealdustid is null");
            return (Criteria) this;
        }

        public Criteria andDealdustidIsNotNull() {
            addCriterion("dealdustid is not null");
            return (Criteria) this;
        }

        public Criteria andDealdustidEqualTo(Integer value) {
            addCriterion("dealdustid =", value, "dealdustid");
            return (Criteria) this;
        }

        public Criteria andDealdustidNotEqualTo(Integer value) {
            addCriterion("dealdustid <>", value, "dealdustid");
            return (Criteria) this;
        }

        public Criteria andDealdustidGreaterThan(Integer value) {
            addCriterion("dealdustid >", value, "dealdustid");
            return (Criteria) this;
        }

        public Criteria andDealdustidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dealdustid >=", value, "dealdustid");
            return (Criteria) this;
        }

        public Criteria andDealdustidLessThan(Integer value) {
            addCriterion("dealdustid <", value, "dealdustid");
            return (Criteria) this;
        }

        public Criteria andDealdustidLessThanOrEqualTo(Integer value) {
            addCriterion("dealdustid <=", value, "dealdustid");
            return (Criteria) this;
        }

        public Criteria andDealdustidIn(List<Integer> values) {
            addCriterion("dealdustid in", values, "dealdustid");
            return (Criteria) this;
        }

        public Criteria andDealdustidNotIn(List<Integer> values) {
            addCriterion("dealdustid not in", values, "dealdustid");
            return (Criteria) this;
        }

        public Criteria andDealdustidBetween(Integer value1, Integer value2) {
            addCriterion("dealdustid between", value1, value2, "dealdustid");
            return (Criteria) this;
        }

        public Criteria andDealdustidNotBetween(Integer value1, Integer value2) {
            addCriterion("dealdustid not between", value1, value2, "dealdustid");
            return (Criteria) this;
        }

        public Criteria andDealtypeIsNull() {
            addCriterion("dealtype is null");
            return (Criteria) this;
        }

        public Criteria andDealtypeIsNotNull() {
            addCriterion("dealtype is not null");
            return (Criteria) this;
        }

        public Criteria andDealtypeEqualTo(String value) {
            addCriterion("dealtype =", value, "dealtype");
            return (Criteria) this;
        }

        public Criteria andDealtypeNotEqualTo(String value) {
            addCriterion("dealtype <>", value, "dealtype");
            return (Criteria) this;
        }

        public Criteria andDealtypeGreaterThan(String value) {
            addCriterion("dealtype >", value, "dealtype");
            return (Criteria) this;
        }

        public Criteria andDealtypeGreaterThanOrEqualTo(String value) {
            addCriterion("dealtype >=", value, "dealtype");
            return (Criteria) this;
        }

        public Criteria andDealtypeLessThan(String value) {
            addCriterion("dealtype <", value, "dealtype");
            return (Criteria) this;
        }

        public Criteria andDealtypeLessThanOrEqualTo(String value) {
            addCriterion("dealtype <=", value, "dealtype");
            return (Criteria) this;
        }

        public Criteria andDealtypeLike(String value) {
            addCriterion("dealtype like", value, "dealtype");
            return (Criteria) this;
        }

        public Criteria andDealtypeNotLike(String value) {
            addCriterion("dealtype not like", value, "dealtype");
            return (Criteria) this;
        }

        public Criteria andDealtypeIn(List<String> values) {
            addCriterion("dealtype in", values, "dealtype");
            return (Criteria) this;
        }

        public Criteria andDealtypeNotIn(List<String> values) {
            addCriterion("dealtype not in", values, "dealtype");
            return (Criteria) this;
        }

        public Criteria andDealtypeBetween(String value1, String value2) {
            addCriterion("dealtype between", value1, value2, "dealtype");
            return (Criteria) this;
        }

        public Criteria andDealtypeNotBetween(String value1, String value2) {
            addCriterion("dealtype not between", value1, value2, "dealtype");
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