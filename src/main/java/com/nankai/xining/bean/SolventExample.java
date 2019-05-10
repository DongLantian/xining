package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SolventExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SolventExample() {
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

        public Criteria andSolventIdIsNull() {
            addCriterion("solvent_id is null");
            return (Criteria) this;
        }

        public Criteria andSolventIdIsNotNull() {
            addCriterion("solvent_id is not null");
            return (Criteria) this;
        }

        public Criteria andSolventIdEqualTo(Integer value) {
            addCriterion("solvent_id =", value, "solventId");
            return (Criteria) this;
        }

        public Criteria andSolventIdNotEqualTo(Integer value) {
            addCriterion("solvent_id <>", value, "solventId");
            return (Criteria) this;
        }

        public Criteria andSolventIdGreaterThan(Integer value) {
            addCriterion("solvent_id >", value, "solventId");
            return (Criteria) this;
        }

        public Criteria andSolventIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("solvent_id >=", value, "solventId");
            return (Criteria) this;
        }

        public Criteria andSolventIdLessThan(Integer value) {
            addCriterion("solvent_id <", value, "solventId");
            return (Criteria) this;
        }

        public Criteria andSolventIdLessThanOrEqualTo(Integer value) {
            addCriterion("solvent_id <=", value, "solventId");
            return (Criteria) this;
        }

        public Criteria andSolventIdIn(List<Integer> values) {
            addCriterion("solvent_id in", values, "solventId");
            return (Criteria) this;
        }

        public Criteria andSolventIdNotIn(List<Integer> values) {
            addCriterion("solvent_id not in", values, "solventId");
            return (Criteria) this;
        }

        public Criteria andSolventIdBetween(Integer value1, Integer value2) {
            addCriterion("solvent_id between", value1, value2, "solventId");
            return (Criteria) this;
        }

        public Criteria andSolventIdNotBetween(Integer value1, Integer value2) {
            addCriterion("solvent_id not between", value1, value2, "solventId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdIsNull() {
            addCriterion("factory_id is null");
            return (Criteria) this;
        }

        public Criteria andFactoryIdIsNotNull() {
            addCriterion("factory_id is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryIdEqualTo(Integer value) {
            addCriterion("factory_id =", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotEqualTo(Integer value) {
            addCriterion("factory_id <>", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdGreaterThan(Integer value) {
            addCriterion("factory_id >", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("factory_id >=", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdLessThan(Integer value) {
            addCriterion("factory_id <", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("factory_id <=", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdIn(List<Integer> values) {
            addCriterion("factory_id in", values, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotIn(List<Integer> values) {
            addCriterion("factory_id not in", values, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdBetween(Integer value1, Integer value2) {
            addCriterion("factory_id between", value1, value2, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("factory_id not between", value1, value2, "factoryId");
            return (Criteria) this;
        }

        public Criteria andLastChangedTimeIsNull() {
            addCriterion("last_changed_time is null");
            return (Criteria) this;
        }

        public Criteria andLastChangedTimeIsNotNull() {
            addCriterion("last_changed_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastChangedTimeEqualTo(Date value) {
            addCriterion("last_changed_time =", value, "lastChangedTime");
            return (Criteria) this;
        }

        public Criteria andLastChangedTimeNotEqualTo(Date value) {
            addCriterion("last_changed_time <>", value, "lastChangedTime");
            return (Criteria) this;
        }

        public Criteria andLastChangedTimeGreaterThan(Date value) {
            addCriterion("last_changed_time >", value, "lastChangedTime");
            return (Criteria) this;
        }

        public Criteria andLastChangedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_changed_time >=", value, "lastChangedTime");
            return (Criteria) this;
        }

        public Criteria andLastChangedTimeLessThan(Date value) {
            addCriterion("last_changed_time <", value, "lastChangedTime");
            return (Criteria) this;
        }

        public Criteria andLastChangedTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_changed_time <=", value, "lastChangedTime");
            return (Criteria) this;
        }

        public Criteria andLastChangedTimeIn(List<Date> values) {
            addCriterion("last_changed_time in", values, "lastChangedTime");
            return (Criteria) this;
        }

        public Criteria andLastChangedTimeNotIn(List<Date> values) {
            addCriterion("last_changed_time not in", values, "lastChangedTime");
            return (Criteria) this;
        }

        public Criteria andLastChangedTimeBetween(Date value1, Date value2) {
            addCriterion("last_changed_time between", value1, value2, "lastChangedTime");
            return (Criteria) this;
        }

        public Criteria andLastChangedTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_changed_time not between", value1, value2, "lastChangedTime");
            return (Criteria) this;
        }

        public Criteria andTYearIsNull() {
            addCriterion("t_year is null");
            return (Criteria) this;
        }

        public Criteria andTYearIsNotNull() {
            addCriterion("t_year is not null");
            return (Criteria) this;
        }

        public Criteria andTYearEqualTo(String value) {
            addCriterion("t_year =", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearNotEqualTo(String value) {
            addCriterion("t_year <>", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearGreaterThan(String value) {
            addCriterion("t_year >", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearGreaterThanOrEqualTo(String value) {
            addCriterion("t_year >=", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearLessThan(String value) {
            addCriterion("t_year <", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearLessThanOrEqualTo(String value) {
            addCriterion("t_year <=", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearLike(String value) {
            addCriterion("t_year like", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearNotLike(String value) {
            addCriterion("t_year not like", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearIn(List<String> values) {
            addCriterion("t_year in", values, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearNotIn(List<String> values) {
            addCriterion("t_year not in", values, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearBetween(String value1, String value2) {
            addCriterion("t_year between", value1, value2, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearNotBetween(String value1, String value2) {
            addCriterion("t_year not between", value1, value2, "tYear");
            return (Criteria) this;
        }

        public Criteria andLastCheckedTimeIsNull() {
            addCriterion("last_checked_time is null");
            return (Criteria) this;
        }

        public Criteria andLastCheckedTimeIsNotNull() {
            addCriterion("last_checked_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastCheckedTimeEqualTo(Date value) {
            addCriterion("last_checked_time =", value, "lastCheckedTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckedTimeNotEqualTo(Date value) {
            addCriterion("last_checked_time <>", value, "lastCheckedTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckedTimeGreaterThan(Date value) {
            addCriterion("last_checked_time >", value, "lastCheckedTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_checked_time >=", value, "lastCheckedTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckedTimeLessThan(Date value) {
            addCriterion("last_checked_time <", value, "lastCheckedTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckedTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_checked_time <=", value, "lastCheckedTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckedTimeIn(List<Date> values) {
            addCriterion("last_checked_time in", values, "lastCheckedTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckedTimeNotIn(List<Date> values) {
            addCriterion("last_checked_time not in", values, "lastCheckedTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckedTimeBetween(Date value1, Date value2) {
            addCriterion("last_checked_time between", value1, value2, "lastCheckedTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckedTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_checked_time not between", value1, value2, "lastCheckedTime");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNull() {
            addCriterion("total_num is null");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNotNull() {
            addCriterion("total_num is not null");
            return (Criteria) this;
        }

        public Criteria andTotalNumEqualTo(Integer value) {
            addCriterion("total_num =", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotEqualTo(Integer value) {
            addCriterion("total_num <>", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThan(Integer value) {
            addCriterion("total_num >", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_num >=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThan(Integer value) {
            addCriterion("total_num <", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThanOrEqualTo(Integer value) {
            addCriterion("total_num <=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumIn(List<Integer> values) {
            addCriterion("total_num in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotIn(List<Integer> values) {
            addCriterion("total_num not in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumBetween(Integer value1, Integer value2) {
            addCriterion("total_num between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("total_num not between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
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