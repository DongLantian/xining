package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class LoadingoperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoadingoperExample() {
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

        public Criteria andOperaidIsNull() {
            addCriterion("operaid is null");
            return (Criteria) this;
        }

        public Criteria andOperaidIsNotNull() {
            addCriterion("operaid is not null");
            return (Criteria) this;
        }

        public Criteria andOperaidEqualTo(Integer value) {
            addCriterion("operaid =", value, "operaid");
            return (Criteria) this;
        }

        public Criteria andOperaidNotEqualTo(Integer value) {
            addCriterion("operaid <>", value, "operaid");
            return (Criteria) this;
        }

        public Criteria andOperaidGreaterThan(Integer value) {
            addCriterion("operaid >", value, "operaid");
            return (Criteria) this;
        }

        public Criteria andOperaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("operaid >=", value, "operaid");
            return (Criteria) this;
        }

        public Criteria andOperaidLessThan(Integer value) {
            addCriterion("operaid <", value, "operaid");
            return (Criteria) this;
        }

        public Criteria andOperaidLessThanOrEqualTo(Integer value) {
            addCriterion("operaid <=", value, "operaid");
            return (Criteria) this;
        }

        public Criteria andOperaidIn(List<Integer> values) {
            addCriterion("operaid in", values, "operaid");
            return (Criteria) this;
        }

        public Criteria andOperaidNotIn(List<Integer> values) {
            addCriterion("operaid not in", values, "operaid");
            return (Criteria) this;
        }

        public Criteria andOperaidBetween(Integer value1, Integer value2) {
            addCriterion("operaid between", value1, value2, "operaid");
            return (Criteria) this;
        }

        public Criteria andOperaidNotBetween(Integer value1, Integer value2) {
            addCriterion("operaid not between", value1, value2, "operaid");
            return (Criteria) this;
        }

        public Criteria andTransidIsNull() {
            addCriterion("transid is null");
            return (Criteria) this;
        }

        public Criteria andTransidIsNotNull() {
            addCriterion("transid is not null");
            return (Criteria) this;
        }

        public Criteria andTransidEqualTo(Integer value) {
            addCriterion("transid =", value, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidNotEqualTo(Integer value) {
            addCriterion("transid <>", value, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidGreaterThan(Integer value) {
            addCriterion("transid >", value, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidGreaterThanOrEqualTo(Integer value) {
            addCriterion("transid >=", value, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidLessThan(Integer value) {
            addCriterion("transid <", value, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidLessThanOrEqualTo(Integer value) {
            addCriterion("transid <=", value, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidIn(List<Integer> values) {
            addCriterion("transid in", values, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidNotIn(List<Integer> values) {
            addCriterion("transid not in", values, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidBetween(Integer value1, Integer value2) {
            addCriterion("transid between", value1, value2, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidNotBetween(Integer value1, Integer value2) {
            addCriterion("transid not between", value1, value2, "transid");
            return (Criteria) this;
        }

        public Criteria andOperateschemaIsNull() {
            addCriterion("operateschema is null");
            return (Criteria) this;
        }

        public Criteria andOperateschemaIsNotNull() {
            addCriterion("operateschema is not null");
            return (Criteria) this;
        }

        public Criteria andOperateschemaEqualTo(String value) {
            addCriterion("operateschema =", value, "operateschema");
            return (Criteria) this;
        }

        public Criteria andOperateschemaNotEqualTo(String value) {
            addCriterion("operateschema <>", value, "operateschema");
            return (Criteria) this;
        }

        public Criteria andOperateschemaGreaterThan(String value) {
            addCriterion("operateschema >", value, "operateschema");
            return (Criteria) this;
        }

        public Criteria andOperateschemaGreaterThanOrEqualTo(String value) {
            addCriterion("operateschema >=", value, "operateschema");
            return (Criteria) this;
        }

        public Criteria andOperateschemaLessThan(String value) {
            addCriterion("operateschema <", value, "operateschema");
            return (Criteria) this;
        }

        public Criteria andOperateschemaLessThanOrEqualTo(String value) {
            addCriterion("operateschema <=", value, "operateschema");
            return (Criteria) this;
        }

        public Criteria andOperateschemaLike(String value) {
            addCriterion("operateschema like", value, "operateschema");
            return (Criteria) this;
        }

        public Criteria andOperateschemaNotLike(String value) {
            addCriterion("operateschema not like", value, "operateschema");
            return (Criteria) this;
        }

        public Criteria andOperateschemaIn(List<String> values) {
            addCriterion("operateschema in", values, "operateschema");
            return (Criteria) this;
        }

        public Criteria andOperateschemaNotIn(List<String> values) {
            addCriterion("operateschema not in", values, "operateschema");
            return (Criteria) this;
        }

        public Criteria andOperateschemaBetween(String value1, String value2) {
            addCriterion("operateschema between", value1, value2, "operateschema");
            return (Criteria) this;
        }

        public Criteria andOperateschemaNotBetween(String value1, String value2) {
            addCriterion("operateschema not between", value1, value2, "operateschema");
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