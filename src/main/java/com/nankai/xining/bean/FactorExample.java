package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class FactorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FactorExample() {
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

        public Criteria andFactoridIsNull() {
            addCriterion("factorid is null");
            return (Criteria) this;
        }

        public Criteria andFactoridIsNotNull() {
            addCriterion("factorid is not null");
            return (Criteria) this;
        }

        public Criteria andFactoridEqualTo(Integer value) {
            addCriterion("factorid =", value, "factorid");
            return (Criteria) this;
        }

        public Criteria andFactoridNotEqualTo(Integer value) {
            addCriterion("factorid <>", value, "factorid");
            return (Criteria) this;
        }

        public Criteria andFactoridGreaterThan(Integer value) {
            addCriterion("factorid >", value, "factorid");
            return (Criteria) this;
        }

        public Criteria andFactoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("factorid >=", value, "factorid");
            return (Criteria) this;
        }

        public Criteria andFactoridLessThan(Integer value) {
            addCriterion("factorid <", value, "factorid");
            return (Criteria) this;
        }

        public Criteria andFactoridLessThanOrEqualTo(Integer value) {
            addCriterion("factorid <=", value, "factorid");
            return (Criteria) this;
        }

        public Criteria andFactoridIn(List<Integer> values) {
            addCriterion("factorid in", values, "factorid");
            return (Criteria) this;
        }

        public Criteria andFactoridNotIn(List<Integer> values) {
            addCriterion("factorid not in", values, "factorid");
            return (Criteria) this;
        }

        public Criteria andFactoridBetween(Integer value1, Integer value2) {
            addCriterion("factorid between", value1, value2, "factorid");
            return (Criteria) this;
        }

        public Criteria andFactoridNotBetween(Integer value1, Integer value2) {
            addCriterion("factorid not between", value1, value2, "factorid");
            return (Criteria) this;
        }

        public Criteria andIspaveIsNull() {
            addCriterion("ispave is null");
            return (Criteria) this;
        }

        public Criteria andIspaveIsNotNull() {
            addCriterion("ispave is not null");
            return (Criteria) this;
        }

        public Criteria andIspaveEqualTo(Boolean value) {
            addCriterion("ispave =", value, "ispave");
            return (Criteria) this;
        }

        public Criteria andIspaveNotEqualTo(Boolean value) {
            addCriterion("ispave <>", value, "ispave");
            return (Criteria) this;
        }

        public Criteria andIspaveGreaterThan(Boolean value) {
            addCriterion("ispave >", value, "ispave");
            return (Criteria) this;
        }

        public Criteria andIspaveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ispave >=", value, "ispave");
            return (Criteria) this;
        }

        public Criteria andIspaveLessThan(Boolean value) {
            addCriterion("ispave <", value, "ispave");
            return (Criteria) this;
        }

        public Criteria andIspaveLessThanOrEqualTo(Boolean value) {
            addCriterion("ispave <=", value, "ispave");
            return (Criteria) this;
        }

        public Criteria andIspaveIn(List<Boolean> values) {
            addCriterion("ispave in", values, "ispave");
            return (Criteria) this;
        }

        public Criteria andIspaveNotIn(List<Boolean> values) {
            addCriterion("ispave not in", values, "ispave");
            return (Criteria) this;
        }

        public Criteria andIspaveBetween(Boolean value1, Boolean value2) {
            addCriterion("ispave between", value1, value2, "ispave");
            return (Criteria) this;
        }

        public Criteria andIspaveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ispave not between", value1, value2, "ispave");
            return (Criteria) this;
        }

        public Criteria andCyDusttypeIsNull() {
            addCriterion("cy_dusttype is null");
            return (Criteria) this;
        }

        public Criteria andCyDusttypeIsNotNull() {
            addCriterion("cy_dusttype is not null");
            return (Criteria) this;
        }

        public Criteria andCyDusttypeEqualTo(String value) {
            addCriterion("cy_dusttype =", value, "cyDusttype");
            return (Criteria) this;
        }

        public Criteria andCyDusttypeNotEqualTo(String value) {
            addCriterion("cy_dusttype <>", value, "cyDusttype");
            return (Criteria) this;
        }

        public Criteria andCyDusttypeGreaterThan(String value) {
            addCriterion("cy_dusttype >", value, "cyDusttype");
            return (Criteria) this;
        }

        public Criteria andCyDusttypeGreaterThanOrEqualTo(String value) {
            addCriterion("cy_dusttype >=", value, "cyDusttype");
            return (Criteria) this;
        }

        public Criteria andCyDusttypeLessThan(String value) {
            addCriterion("cy_dusttype <", value, "cyDusttype");
            return (Criteria) this;
        }

        public Criteria andCyDusttypeLessThanOrEqualTo(String value) {
            addCriterion("cy_dusttype <=", value, "cyDusttype");
            return (Criteria) this;
        }

        public Criteria andCyDusttypeLike(String value) {
            addCriterion("cy_dusttype like", value, "cyDusttype");
            return (Criteria) this;
        }

        public Criteria andCyDusttypeNotLike(String value) {
            addCriterion("cy_dusttype not like", value, "cyDusttype");
            return (Criteria) this;
        }

        public Criteria andCyDusttypeIn(List<String> values) {
            addCriterion("cy_dusttype in", values, "cyDusttype");
            return (Criteria) this;
        }

        public Criteria andCyDusttypeNotIn(List<String> values) {
            addCriterion("cy_dusttype not in", values, "cyDusttype");
            return (Criteria) this;
        }

        public Criteria andCyDusttypeBetween(String value1, String value2) {
            addCriterion("cy_dusttype between", value1, value2, "cyDusttype");
            return (Criteria) this;
        }

        public Criteria andCyDusttypeNotBetween(String value1, String value2) {
            addCriterion("cy_dusttype not between", value1, value2, "cyDusttype");
            return (Criteria) this;
        }

        public Criteria andPm25factorIsNull() {
            addCriterion("pm25factor is null");
            return (Criteria) this;
        }

        public Criteria andPm25factorIsNotNull() {
            addCriterion("pm25factor is not null");
            return (Criteria) this;
        }

        public Criteria andPm25factorEqualTo(Double value) {
            addCriterion("pm25factor =", value, "pm25factor");
            return (Criteria) this;
        }

        public Criteria andPm25factorNotEqualTo(Double value) {
            addCriterion("pm25factor <>", value, "pm25factor");
            return (Criteria) this;
        }

        public Criteria andPm25factorGreaterThan(Double value) {
            addCriterion("pm25factor >", value, "pm25factor");
            return (Criteria) this;
        }

        public Criteria andPm25factorGreaterThanOrEqualTo(Double value) {
            addCriterion("pm25factor >=", value, "pm25factor");
            return (Criteria) this;
        }

        public Criteria andPm25factorLessThan(Double value) {
            addCriterion("pm25factor <", value, "pm25factor");
            return (Criteria) this;
        }

        public Criteria andPm25factorLessThanOrEqualTo(Double value) {
            addCriterion("pm25factor <=", value, "pm25factor");
            return (Criteria) this;
        }

        public Criteria andPm25factorIn(List<Double> values) {
            addCriterion("pm25factor in", values, "pm25factor");
            return (Criteria) this;
        }

        public Criteria andPm25factorNotIn(List<Double> values) {
            addCriterion("pm25factor not in", values, "pm25factor");
            return (Criteria) this;
        }

        public Criteria andPm25factorBetween(Double value1, Double value2) {
            addCriterion("pm25factor between", value1, value2, "pm25factor");
            return (Criteria) this;
        }

        public Criteria andPm25factorNotBetween(Double value1, Double value2) {
            addCriterion("pm25factor not between", value1, value2, "pm25factor");
            return (Criteria) this;
        }

        public Criteria andPm10factorIsNull() {
            addCriterion("pm10factor is null");
            return (Criteria) this;
        }

        public Criteria andPm10factorIsNotNull() {
            addCriterion("pm10factor is not null");
            return (Criteria) this;
        }

        public Criteria andPm10factorEqualTo(Double value) {
            addCriterion("pm10factor =", value, "pm10factor");
            return (Criteria) this;
        }

        public Criteria andPm10factorNotEqualTo(Double value) {
            addCriterion("pm10factor <>", value, "pm10factor");
            return (Criteria) this;
        }

        public Criteria andPm10factorGreaterThan(Double value) {
            addCriterion("pm10factor >", value, "pm10factor");
            return (Criteria) this;
        }

        public Criteria andPm10factorGreaterThanOrEqualTo(Double value) {
            addCriterion("pm10factor >=", value, "pm10factor");
            return (Criteria) this;
        }

        public Criteria andPm10factorLessThan(Double value) {
            addCriterion("pm10factor <", value, "pm10factor");
            return (Criteria) this;
        }

        public Criteria andPm10factorLessThanOrEqualTo(Double value) {
            addCriterion("pm10factor <=", value, "pm10factor");
            return (Criteria) this;
        }

        public Criteria andPm10factorIn(List<Double> values) {
            addCriterion("pm10factor in", values, "pm10factor");
            return (Criteria) this;
        }

        public Criteria andPm10factorNotIn(List<Double> values) {
            addCriterion("pm10factor not in", values, "pm10factor");
            return (Criteria) this;
        }

        public Criteria andPm10factorBetween(Double value1, Double value2) {
            addCriterion("pm10factor between", value1, value2, "pm10factor");
            return (Criteria) this;
        }

        public Criteria andPm10factorNotBetween(Double value1, Double value2) {
            addCriterion("pm10factor not between", value1, value2, "pm10factor");
            return (Criteria) this;
        }

        public Criteria andDusttypeIsNull() {
            addCriterion("dusttype is null");
            return (Criteria) this;
        }

        public Criteria andDusttypeIsNotNull() {
            addCriterion("dusttype is not null");
            return (Criteria) this;
        }

        public Criteria andDusttypeEqualTo(Byte value) {
            addCriterion("dusttype =", value, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeNotEqualTo(Byte value) {
            addCriterion("dusttype <>", value, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeGreaterThan(Byte value) {
            addCriterion("dusttype >", value, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("dusttype >=", value, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeLessThan(Byte value) {
            addCriterion("dusttype <", value, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeLessThanOrEqualTo(Byte value) {
            addCriterion("dusttype <=", value, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeIn(List<Byte> values) {
            addCriterion("dusttype in", values, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeNotIn(List<Byte> values) {
            addCriterion("dusttype not in", values, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeBetween(Byte value1, Byte value2) {
            addCriterion("dusttype between", value1, value2, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeNotBetween(Byte value1, Byte value2) {
            addCriterion("dusttype not between", value1, value2, "dusttype");
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