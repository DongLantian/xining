package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class FueltypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FueltypeExample() {
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

        public Criteria andFueltypeidIsNull() {
            addCriterion("fueltypeid is null");
            return (Criteria) this;
        }

        public Criteria andFueltypeidIsNotNull() {
            addCriterion("fueltypeid is not null");
            return (Criteria) this;
        }

        public Criteria andFueltypeidEqualTo(Integer value) {
            addCriterion("fueltypeid =", value, "fueltypeid");
            return (Criteria) this;
        }

        public Criteria andFueltypeidNotEqualTo(Integer value) {
            addCriterion("fueltypeid <>", value, "fueltypeid");
            return (Criteria) this;
        }

        public Criteria andFueltypeidGreaterThan(Integer value) {
            addCriterion("fueltypeid >", value, "fueltypeid");
            return (Criteria) this;
        }

        public Criteria andFueltypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fueltypeid >=", value, "fueltypeid");
            return (Criteria) this;
        }

        public Criteria andFueltypeidLessThan(Integer value) {
            addCriterion("fueltypeid <", value, "fueltypeid");
            return (Criteria) this;
        }

        public Criteria andFueltypeidLessThanOrEqualTo(Integer value) {
            addCriterion("fueltypeid <=", value, "fueltypeid");
            return (Criteria) this;
        }

        public Criteria andFueltypeidIn(List<Integer> values) {
            addCriterion("fueltypeid in", values, "fueltypeid");
            return (Criteria) this;
        }

        public Criteria andFueltypeidNotIn(List<Integer> values) {
            addCriterion("fueltypeid not in", values, "fueltypeid");
            return (Criteria) this;
        }

        public Criteria andFueltypeidBetween(Integer value1, Integer value2) {
            addCriterion("fueltypeid between", value1, value2, "fueltypeid");
            return (Criteria) this;
        }

        public Criteria andFueltypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("fueltypeid not between", value1, value2, "fueltypeid");
            return (Criteria) this;
        }

        public Criteria andFuelnameIsNull() {
            addCriterion("fuelname is null");
            return (Criteria) this;
        }

        public Criteria andFuelnameIsNotNull() {
            addCriterion("fuelname is not null");
            return (Criteria) this;
        }

        public Criteria andFuelnameEqualTo(String value) {
            addCriterion("fuelname =", value, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameNotEqualTo(String value) {
            addCriterion("fuelname <>", value, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameGreaterThan(String value) {
            addCriterion("fuelname >", value, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameGreaterThanOrEqualTo(String value) {
            addCriterion("fuelname >=", value, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameLessThan(String value) {
            addCriterion("fuelname <", value, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameLessThanOrEqualTo(String value) {
            addCriterion("fuelname <=", value, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameLike(String value) {
            addCriterion("fuelname like", value, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameNotLike(String value) {
            addCriterion("fuelname not like", value, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameIn(List<String> values) {
            addCriterion("fuelname in", values, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameNotIn(List<String> values) {
            addCriterion("fuelname not in", values, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameBetween(String value1, String value2) {
            addCriterion("fuelname between", value1, value2, "fuelname");
            return (Criteria) this;
        }

        public Criteria andFuelnameNotBetween(String value1, String value2) {
            addCriterion("fuelname not between", value1, value2, "fuelname");
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