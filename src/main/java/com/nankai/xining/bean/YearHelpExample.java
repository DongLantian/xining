package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class YearHelpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YearHelpExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOldYearIsNull() {
            addCriterion("OLD_YEAR is null");
            return (Criteria) this;
        }

        public Criteria andOldYearIsNotNull() {
            addCriterion("OLD_YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andOldYearEqualTo(String value) {
            addCriterion("OLD_YEAR =", value, "oldYear");
            return (Criteria) this;
        }

        public Criteria andOldYearNotEqualTo(String value) {
            addCriterion("OLD_YEAR <>", value, "oldYear");
            return (Criteria) this;
        }

        public Criteria andOldYearGreaterThan(String value) {
            addCriterion("OLD_YEAR >", value, "oldYear");
            return (Criteria) this;
        }

        public Criteria andOldYearGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_YEAR >=", value, "oldYear");
            return (Criteria) this;
        }

        public Criteria andOldYearLessThan(String value) {
            addCriterion("OLD_YEAR <", value, "oldYear");
            return (Criteria) this;
        }

        public Criteria andOldYearLessThanOrEqualTo(String value) {
            addCriterion("OLD_YEAR <=", value, "oldYear");
            return (Criteria) this;
        }

        public Criteria andOldYearLike(String value) {
            addCriterion("OLD_YEAR like", value, "oldYear");
            return (Criteria) this;
        }

        public Criteria andOldYearNotLike(String value) {
            addCriterion("OLD_YEAR not like", value, "oldYear");
            return (Criteria) this;
        }

        public Criteria andOldYearIn(List<String> values) {
            addCriterion("OLD_YEAR in", values, "oldYear");
            return (Criteria) this;
        }

        public Criteria andOldYearNotIn(List<String> values) {
            addCriterion("OLD_YEAR not in", values, "oldYear");
            return (Criteria) this;
        }

        public Criteria andOldYearBetween(String value1, String value2) {
            addCriterion("OLD_YEAR between", value1, value2, "oldYear");
            return (Criteria) this;
        }

        public Criteria andOldYearNotBetween(String value1, String value2) {
            addCriterion("OLD_YEAR not between", value1, value2, "oldYear");
            return (Criteria) this;
        }

        public Criteria andCurYearIsNull() {
            addCriterion("CUR_YEAR is null");
            return (Criteria) this;
        }

        public Criteria andCurYearIsNotNull() {
            addCriterion("CUR_YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andCurYearEqualTo(String value) {
            addCriterion("CUR_YEAR =", value, "curYear");
            return (Criteria) this;
        }

        public Criteria andCurYearNotEqualTo(String value) {
            addCriterion("CUR_YEAR <>", value, "curYear");
            return (Criteria) this;
        }

        public Criteria andCurYearGreaterThan(String value) {
            addCriterion("CUR_YEAR >", value, "curYear");
            return (Criteria) this;
        }

        public Criteria andCurYearGreaterThanOrEqualTo(String value) {
            addCriterion("CUR_YEAR >=", value, "curYear");
            return (Criteria) this;
        }

        public Criteria andCurYearLessThan(String value) {
            addCriterion("CUR_YEAR <", value, "curYear");
            return (Criteria) this;
        }

        public Criteria andCurYearLessThanOrEqualTo(String value) {
            addCriterion("CUR_YEAR <=", value, "curYear");
            return (Criteria) this;
        }

        public Criteria andCurYearLike(String value) {
            addCriterion("CUR_YEAR like", value, "curYear");
            return (Criteria) this;
        }

        public Criteria andCurYearNotLike(String value) {
            addCriterion("CUR_YEAR not like", value, "curYear");
            return (Criteria) this;
        }

        public Criteria andCurYearIn(List<String> values) {
            addCriterion("CUR_YEAR in", values, "curYear");
            return (Criteria) this;
        }

        public Criteria andCurYearNotIn(List<String> values) {
            addCriterion("CUR_YEAR not in", values, "curYear");
            return (Criteria) this;
        }

        public Criteria andCurYearBetween(String value1, String value2) {
            addCriterion("CUR_YEAR between", value1, value2, "curYear");
            return (Criteria) this;
        }

        public Criteria andCurYearNotBetween(String value1, String value2) {
            addCriterion("CUR_YEAR not between", value1, value2, "curYear");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("STARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("STARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterionForJDBCTime("STARTTIME =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("STARTTIME <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterionForJDBCTime("STARTTIME >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("STARTTIME >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterionForJDBCTime("STARTTIME <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("STARTTIME <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterionForJDBCTime("STARTTIME in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("STARTTIME not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("STARTTIME between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("STARTTIME not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
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