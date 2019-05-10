package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class CarNumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarNumExample() {
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

        public Criteria andCartypeIsNull() {
            addCriterion("cartype is null");
            return (Criteria) this;
        }

        public Criteria andCartypeIsNotNull() {
            addCriterion("cartype is not null");
            return (Criteria) this;
        }

        public Criteria andCartypeEqualTo(String value) {
            addCriterion("cartype =", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotEqualTo(String value) {
            addCriterion("cartype <>", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeGreaterThan(String value) {
            addCriterion("cartype >", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeGreaterThanOrEqualTo(String value) {
            addCriterion("cartype >=", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLessThan(String value) {
            addCriterion("cartype <", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLessThanOrEqualTo(String value) {
            addCriterion("cartype <=", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLike(String value) {
            addCriterion("cartype like", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotLike(String value) {
            addCriterion("cartype not like", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeIn(List<String> values) {
            addCriterion("cartype in", values, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotIn(List<String> values) {
            addCriterion("cartype not in", values, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeBetween(String value1, String value2) {
            addCriterion("cartype between", value1, value2, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotBetween(String value1, String value2) {
            addCriterion("cartype not between", value1, value2, "cartype");
            return (Criteria) this;
        }

        public Criteria andUsetypeIsNull() {
            addCriterion("usetype is null");
            return (Criteria) this;
        }

        public Criteria andUsetypeIsNotNull() {
            addCriterion("usetype is not null");
            return (Criteria) this;
        }

        public Criteria andUsetypeEqualTo(String value) {
            addCriterion("usetype =", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeNotEqualTo(String value) {
            addCriterion("usetype <>", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeGreaterThan(String value) {
            addCriterion("usetype >", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeGreaterThanOrEqualTo(String value) {
            addCriterion("usetype >=", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeLessThan(String value) {
            addCriterion("usetype <", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeLessThanOrEqualTo(String value) {
            addCriterion("usetype <=", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeLike(String value) {
            addCriterion("usetype like", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeNotLike(String value) {
            addCriterion("usetype not like", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeIn(List<String> values) {
            addCriterion("usetype in", values, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeNotIn(List<String> values) {
            addCriterion("usetype not in", values, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeBetween(String value1, String value2) {
            addCriterion("usetype between", value1, value2, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeNotBetween(String value1, String value2) {
            addCriterion("usetype not between", value1, value2, "usetype");
            return (Criteria) this;
        }

        public Criteria andFueltypeIsNull() {
            addCriterion("fueltype is null");
            return (Criteria) this;
        }

        public Criteria andFueltypeIsNotNull() {
            addCriterion("fueltype is not null");
            return (Criteria) this;
        }

        public Criteria andFueltypeEqualTo(String value) {
            addCriterion("fueltype =", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeNotEqualTo(String value) {
            addCriterion("fueltype <>", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeGreaterThan(String value) {
            addCriterion("fueltype >", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeGreaterThanOrEqualTo(String value) {
            addCriterion("fueltype >=", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeLessThan(String value) {
            addCriterion("fueltype <", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeLessThanOrEqualTo(String value) {
            addCriterion("fueltype <=", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeLike(String value) {
            addCriterion("fueltype like", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeNotLike(String value) {
            addCriterion("fueltype not like", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeIn(List<String> values) {
            addCriterion("fueltype in", values, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeNotIn(List<String> values) {
            addCriterion("fueltype not in", values, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeBetween(String value1, String value2) {
            addCriterion("fueltype between", value1, value2, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeNotBetween(String value1, String value2) {
            addCriterion("fueltype not between", value1, value2, "fueltype");
            return (Criteria) this;
        }

        public Criteria andGuo0IsNull() {
            addCriterion("guo0 is null");
            return (Criteria) this;
        }

        public Criteria andGuo0IsNotNull() {
            addCriterion("guo0 is not null");
            return (Criteria) this;
        }

        public Criteria andGuo0EqualTo(Integer value) {
            addCriterion("guo0 =", value, "guo0");
            return (Criteria) this;
        }

        public Criteria andGuo0NotEqualTo(Integer value) {
            addCriterion("guo0 <>", value, "guo0");
            return (Criteria) this;
        }

        public Criteria andGuo0GreaterThan(Integer value) {
            addCriterion("guo0 >", value, "guo0");
            return (Criteria) this;
        }

        public Criteria andGuo0GreaterThanOrEqualTo(Integer value) {
            addCriterion("guo0 >=", value, "guo0");
            return (Criteria) this;
        }

        public Criteria andGuo0LessThan(Integer value) {
            addCriterion("guo0 <", value, "guo0");
            return (Criteria) this;
        }

        public Criteria andGuo0LessThanOrEqualTo(Integer value) {
            addCriterion("guo0 <=", value, "guo0");
            return (Criteria) this;
        }

        public Criteria andGuo0In(List<Integer> values) {
            addCriterion("guo0 in", values, "guo0");
            return (Criteria) this;
        }

        public Criteria andGuo0NotIn(List<Integer> values) {
            addCriterion("guo0 not in", values, "guo0");
            return (Criteria) this;
        }

        public Criteria andGuo0Between(Integer value1, Integer value2) {
            addCriterion("guo0 between", value1, value2, "guo0");
            return (Criteria) this;
        }

        public Criteria andGuo0NotBetween(Integer value1, Integer value2) {
            addCriterion("guo0 not between", value1, value2, "guo0");
            return (Criteria) this;
        }

        public Criteria andGuo1IsNull() {
            addCriterion("guo1 is null");
            return (Criteria) this;
        }

        public Criteria andGuo1IsNotNull() {
            addCriterion("guo1 is not null");
            return (Criteria) this;
        }

        public Criteria andGuo1EqualTo(Integer value) {
            addCriterion("guo1 =", value, "guo1");
            return (Criteria) this;
        }

        public Criteria andGuo1NotEqualTo(Integer value) {
            addCriterion("guo1 <>", value, "guo1");
            return (Criteria) this;
        }

        public Criteria andGuo1GreaterThan(Integer value) {
            addCriterion("guo1 >", value, "guo1");
            return (Criteria) this;
        }

        public Criteria andGuo1GreaterThanOrEqualTo(Integer value) {
            addCriterion("guo1 >=", value, "guo1");
            return (Criteria) this;
        }

        public Criteria andGuo1LessThan(Integer value) {
            addCriterion("guo1 <", value, "guo1");
            return (Criteria) this;
        }

        public Criteria andGuo1LessThanOrEqualTo(Integer value) {
            addCriterion("guo1 <=", value, "guo1");
            return (Criteria) this;
        }

        public Criteria andGuo1In(List<Integer> values) {
            addCriterion("guo1 in", values, "guo1");
            return (Criteria) this;
        }

        public Criteria andGuo1NotIn(List<Integer> values) {
            addCriterion("guo1 not in", values, "guo1");
            return (Criteria) this;
        }

        public Criteria andGuo1Between(Integer value1, Integer value2) {
            addCriterion("guo1 between", value1, value2, "guo1");
            return (Criteria) this;
        }

        public Criteria andGuo1NotBetween(Integer value1, Integer value2) {
            addCriterion("guo1 not between", value1, value2, "guo1");
            return (Criteria) this;
        }

        public Criteria andGuo2IsNull() {
            addCriterion("guo2 is null");
            return (Criteria) this;
        }

        public Criteria andGuo2IsNotNull() {
            addCriterion("guo2 is not null");
            return (Criteria) this;
        }

        public Criteria andGuo2EqualTo(Integer value) {
            addCriterion("guo2 =", value, "guo2");
            return (Criteria) this;
        }

        public Criteria andGuo2NotEqualTo(Integer value) {
            addCriterion("guo2 <>", value, "guo2");
            return (Criteria) this;
        }

        public Criteria andGuo2GreaterThan(Integer value) {
            addCriterion("guo2 >", value, "guo2");
            return (Criteria) this;
        }

        public Criteria andGuo2GreaterThanOrEqualTo(Integer value) {
            addCriterion("guo2 >=", value, "guo2");
            return (Criteria) this;
        }

        public Criteria andGuo2LessThan(Integer value) {
            addCriterion("guo2 <", value, "guo2");
            return (Criteria) this;
        }

        public Criteria andGuo2LessThanOrEqualTo(Integer value) {
            addCriterion("guo2 <=", value, "guo2");
            return (Criteria) this;
        }

        public Criteria andGuo2In(List<Integer> values) {
            addCriterion("guo2 in", values, "guo2");
            return (Criteria) this;
        }

        public Criteria andGuo2NotIn(List<Integer> values) {
            addCriterion("guo2 not in", values, "guo2");
            return (Criteria) this;
        }

        public Criteria andGuo2Between(Integer value1, Integer value2) {
            addCriterion("guo2 between", value1, value2, "guo2");
            return (Criteria) this;
        }

        public Criteria andGuo2NotBetween(Integer value1, Integer value2) {
            addCriterion("guo2 not between", value1, value2, "guo2");
            return (Criteria) this;
        }

        public Criteria andGuo3IsNull() {
            addCriterion("guo3 is null");
            return (Criteria) this;
        }

        public Criteria andGuo3IsNotNull() {
            addCriterion("guo3 is not null");
            return (Criteria) this;
        }

        public Criteria andGuo3EqualTo(Integer value) {
            addCriterion("guo3 =", value, "guo3");
            return (Criteria) this;
        }

        public Criteria andGuo3NotEqualTo(Integer value) {
            addCriterion("guo3 <>", value, "guo3");
            return (Criteria) this;
        }

        public Criteria andGuo3GreaterThan(Integer value) {
            addCriterion("guo3 >", value, "guo3");
            return (Criteria) this;
        }

        public Criteria andGuo3GreaterThanOrEqualTo(Integer value) {
            addCriterion("guo3 >=", value, "guo3");
            return (Criteria) this;
        }

        public Criteria andGuo3LessThan(Integer value) {
            addCriterion("guo3 <", value, "guo3");
            return (Criteria) this;
        }

        public Criteria andGuo3LessThanOrEqualTo(Integer value) {
            addCriterion("guo3 <=", value, "guo3");
            return (Criteria) this;
        }

        public Criteria andGuo3In(List<Integer> values) {
            addCriterion("guo3 in", values, "guo3");
            return (Criteria) this;
        }

        public Criteria andGuo3NotIn(List<Integer> values) {
            addCriterion("guo3 not in", values, "guo3");
            return (Criteria) this;
        }

        public Criteria andGuo3Between(Integer value1, Integer value2) {
            addCriterion("guo3 between", value1, value2, "guo3");
            return (Criteria) this;
        }

        public Criteria andGuo3NotBetween(Integer value1, Integer value2) {
            addCriterion("guo3 not between", value1, value2, "guo3");
            return (Criteria) this;
        }

        public Criteria andGuo4IsNull() {
            addCriterion("guo4 is null");
            return (Criteria) this;
        }

        public Criteria andGuo4IsNotNull() {
            addCriterion("guo4 is not null");
            return (Criteria) this;
        }

        public Criteria andGuo4EqualTo(Integer value) {
            addCriterion("guo4 =", value, "guo4");
            return (Criteria) this;
        }

        public Criteria andGuo4NotEqualTo(Integer value) {
            addCriterion("guo4 <>", value, "guo4");
            return (Criteria) this;
        }

        public Criteria andGuo4GreaterThan(Integer value) {
            addCriterion("guo4 >", value, "guo4");
            return (Criteria) this;
        }

        public Criteria andGuo4GreaterThanOrEqualTo(Integer value) {
            addCriterion("guo4 >=", value, "guo4");
            return (Criteria) this;
        }

        public Criteria andGuo4LessThan(Integer value) {
            addCriterion("guo4 <", value, "guo4");
            return (Criteria) this;
        }

        public Criteria andGuo4LessThanOrEqualTo(Integer value) {
            addCriterion("guo4 <=", value, "guo4");
            return (Criteria) this;
        }

        public Criteria andGuo4In(List<Integer> values) {
            addCriterion("guo4 in", values, "guo4");
            return (Criteria) this;
        }

        public Criteria andGuo4NotIn(List<Integer> values) {
            addCriterion("guo4 not in", values, "guo4");
            return (Criteria) this;
        }

        public Criteria andGuo4Between(Integer value1, Integer value2) {
            addCriterion("guo4 between", value1, value2, "guo4");
            return (Criteria) this;
        }

        public Criteria andGuo4NotBetween(Integer value1, Integer value2) {
            addCriterion("guo4 not between", value1, value2, "guo4");
            return (Criteria) this;
        }

        public Criteria andGuo5IsNull() {
            addCriterion("guo5 is null");
            return (Criteria) this;
        }

        public Criteria andGuo5IsNotNull() {
            addCriterion("guo5 is not null");
            return (Criteria) this;
        }

        public Criteria andGuo5EqualTo(Integer value) {
            addCriterion("guo5 =", value, "guo5");
            return (Criteria) this;
        }

        public Criteria andGuo5NotEqualTo(Integer value) {
            addCriterion("guo5 <>", value, "guo5");
            return (Criteria) this;
        }

        public Criteria andGuo5GreaterThan(Integer value) {
            addCriterion("guo5 >", value, "guo5");
            return (Criteria) this;
        }

        public Criteria andGuo5GreaterThanOrEqualTo(Integer value) {
            addCriterion("guo5 >=", value, "guo5");
            return (Criteria) this;
        }

        public Criteria andGuo5LessThan(Integer value) {
            addCriterion("guo5 <", value, "guo5");
            return (Criteria) this;
        }

        public Criteria andGuo5LessThanOrEqualTo(Integer value) {
            addCriterion("guo5 <=", value, "guo5");
            return (Criteria) this;
        }

        public Criteria andGuo5In(List<Integer> values) {
            addCriterion("guo5 in", values, "guo5");
            return (Criteria) this;
        }

        public Criteria andGuo5NotIn(List<Integer> values) {
            addCriterion("guo5 not in", values, "guo5");
            return (Criteria) this;
        }

        public Criteria andGuo5Between(Integer value1, Integer value2) {
            addCriterion("guo5 between", value1, value2, "guo5");
            return (Criteria) this;
        }

        public Criteria andGuo5NotBetween(Integer value1, Integer value2) {
            addCriterion("guo5 not between", value1, value2, "guo5");
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