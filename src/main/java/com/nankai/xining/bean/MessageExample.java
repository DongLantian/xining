package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andMIdIsNull() {
            addCriterion("m_id is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("m_id is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(Integer value) {
            addCriterion("m_id =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(Integer value) {
            addCriterion("m_id <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(Integer value) {
            addCriterion("m_id >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_id >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(Integer value) {
            addCriterion("m_id <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_id <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<Integer> values) {
            addCriterion("m_id in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<Integer> values) {
            addCriterion("m_id not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(Integer value1, Integer value2) {
            addCriterion("m_id between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m_id not between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMFromIsNull() {
            addCriterion("m_from is null");
            return (Criteria) this;
        }

        public Criteria andMFromIsNotNull() {
            addCriterion("m_from is not null");
            return (Criteria) this;
        }

        public Criteria andMFromEqualTo(Integer value) {
            addCriterion("m_from =", value, "mFrom");
            return (Criteria) this;
        }

        public Criteria andMFromNotEqualTo(Integer value) {
            addCriterion("m_from <>", value, "mFrom");
            return (Criteria) this;
        }

        public Criteria andMFromGreaterThan(Integer value) {
            addCriterion("m_from >", value, "mFrom");
            return (Criteria) this;
        }

        public Criteria andMFromGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_from >=", value, "mFrom");
            return (Criteria) this;
        }

        public Criteria andMFromLessThan(Integer value) {
            addCriterion("m_from <", value, "mFrom");
            return (Criteria) this;
        }

        public Criteria andMFromLessThanOrEqualTo(Integer value) {
            addCriterion("m_from <=", value, "mFrom");
            return (Criteria) this;
        }

        public Criteria andMFromIn(List<Integer> values) {
            addCriterion("m_from in", values, "mFrom");
            return (Criteria) this;
        }

        public Criteria andMFromNotIn(List<Integer> values) {
            addCriterion("m_from not in", values, "mFrom");
            return (Criteria) this;
        }

        public Criteria andMFromBetween(Integer value1, Integer value2) {
            addCriterion("m_from between", value1, value2, "mFrom");
            return (Criteria) this;
        }

        public Criteria andMFromNotBetween(Integer value1, Integer value2) {
            addCriterion("m_from not between", value1, value2, "mFrom");
            return (Criteria) this;
        }

        public Criteria andMToIsNull() {
            addCriterion("m_to is null");
            return (Criteria) this;
        }

        public Criteria andMToIsNotNull() {
            addCriterion("m_to is not null");
            return (Criteria) this;
        }

        public Criteria andMToEqualTo(Integer value) {
            addCriterion("m_to =", value, "mTo");
            return (Criteria) this;
        }

        public Criteria andMToNotEqualTo(Integer value) {
            addCriterion("m_to <>", value, "mTo");
            return (Criteria) this;
        }

        public Criteria andMToGreaterThan(Integer value) {
            addCriterion("m_to >", value, "mTo");
            return (Criteria) this;
        }

        public Criteria andMToGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_to >=", value, "mTo");
            return (Criteria) this;
        }

        public Criteria andMToLessThan(Integer value) {
            addCriterion("m_to <", value, "mTo");
            return (Criteria) this;
        }

        public Criteria andMToLessThanOrEqualTo(Integer value) {
            addCriterion("m_to <=", value, "mTo");
            return (Criteria) this;
        }

        public Criteria andMToIn(List<Integer> values) {
            addCriterion("m_to in", values, "mTo");
            return (Criteria) this;
        }

        public Criteria andMToNotIn(List<Integer> values) {
            addCriterion("m_to not in", values, "mTo");
            return (Criteria) this;
        }

        public Criteria andMToBetween(Integer value1, Integer value2) {
            addCriterion("m_to between", value1, value2, "mTo");
            return (Criteria) this;
        }

        public Criteria andMToNotBetween(Integer value1, Integer value2) {
            addCriterion("m_to not between", value1, value2, "mTo");
            return (Criteria) this;
        }

        public Criteria andMTimeIsNull() {
            addCriterion("m_time is null");
            return (Criteria) this;
        }

        public Criteria andMTimeIsNotNull() {
            addCriterion("m_time is not null");
            return (Criteria) this;
        }

        public Criteria andMTimeEqualTo(Date value) {
            addCriterion("m_time =", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeNotEqualTo(Date value) {
            addCriterion("m_time <>", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeGreaterThan(Date value) {
            addCriterion("m_time >", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("m_time >=", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeLessThan(Date value) {
            addCriterion("m_time <", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeLessThanOrEqualTo(Date value) {
            addCriterion("m_time <=", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeIn(List<Date> values) {
            addCriterion("m_time in", values, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeNotIn(List<Date> values) {
            addCriterion("m_time not in", values, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeBetween(Date value1, Date value2) {
            addCriterion("m_time between", value1, value2, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeNotBetween(Date value1, Date value2) {
            addCriterion("m_time not between", value1, value2, "mTime");
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