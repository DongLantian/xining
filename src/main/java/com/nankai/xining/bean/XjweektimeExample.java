package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class XjweektimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XjweektimeExample() {
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

        public Criteria andWeekIdIsNull() {
            addCriterion("week_id is null");
            return (Criteria) this;
        }

        public Criteria andWeekIdIsNotNull() {
            addCriterion("week_id is not null");
            return (Criteria) this;
        }

        public Criteria andWeekIdEqualTo(Integer value) {
            addCriterion("week_id =", value, "weekId");
            return (Criteria) this;
        }

        public Criteria andWeekIdNotEqualTo(Integer value) {
            addCriterion("week_id <>", value, "weekId");
            return (Criteria) this;
        }

        public Criteria andWeekIdGreaterThan(Integer value) {
            addCriterion("week_id >", value, "weekId");
            return (Criteria) this;
        }

        public Criteria andWeekIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("week_id >=", value, "weekId");
            return (Criteria) this;
        }

        public Criteria andWeekIdLessThan(Integer value) {
            addCriterion("week_id <", value, "weekId");
            return (Criteria) this;
        }

        public Criteria andWeekIdLessThanOrEqualTo(Integer value) {
            addCriterion("week_id <=", value, "weekId");
            return (Criteria) this;
        }

        public Criteria andWeekIdIn(List<Integer> values) {
            addCriterion("week_id in", values, "weekId");
            return (Criteria) this;
        }

        public Criteria andWeekIdNotIn(List<Integer> values) {
            addCriterion("week_id not in", values, "weekId");
            return (Criteria) this;
        }

        public Criteria andWeekIdBetween(Integer value1, Integer value2) {
            addCriterion("week_id between", value1, value2, "weekId");
            return (Criteria) this;
        }

        public Criteria andWeekIdNotBetween(Integer value1, Integer value2) {
            addCriterion("week_id not between", value1, value2, "weekId");
            return (Criteria) this;
        }

        public Criteria andMondayIsNull() {
            addCriterion("monday is null");
            return (Criteria) this;
        }

        public Criteria andMondayIsNotNull() {
            addCriterion("monday is not null");
            return (Criteria) this;
        }

        public Criteria andMondayEqualTo(Integer value) {
            addCriterion("monday =", value, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayNotEqualTo(Integer value) {
            addCriterion("monday <>", value, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayGreaterThan(Integer value) {
            addCriterion("monday >", value, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayGreaterThanOrEqualTo(Integer value) {
            addCriterion("monday >=", value, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayLessThan(Integer value) {
            addCriterion("monday <", value, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayLessThanOrEqualTo(Integer value) {
            addCriterion("monday <=", value, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayIn(List<Integer> values) {
            addCriterion("monday in", values, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayNotIn(List<Integer> values) {
            addCriterion("monday not in", values, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayBetween(Integer value1, Integer value2) {
            addCriterion("monday between", value1, value2, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayNotBetween(Integer value1, Integer value2) {
            addCriterion("monday not between", value1, value2, "monday");
            return (Criteria) this;
        }

        public Criteria andTuesdayIsNull() {
            addCriterion("tuesday is null");
            return (Criteria) this;
        }

        public Criteria andTuesdayIsNotNull() {
            addCriterion("tuesday is not null");
            return (Criteria) this;
        }

        public Criteria andTuesdayEqualTo(Integer value) {
            addCriterion("tuesday =", value, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayNotEqualTo(Integer value) {
            addCriterion("tuesday <>", value, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayGreaterThan(Integer value) {
            addCriterion("tuesday >", value, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("tuesday >=", value, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayLessThan(Integer value) {
            addCriterion("tuesday <", value, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayLessThanOrEqualTo(Integer value) {
            addCriterion("tuesday <=", value, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayIn(List<Integer> values) {
            addCriterion("tuesday in", values, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayNotIn(List<Integer> values) {
            addCriterion("tuesday not in", values, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayBetween(Integer value1, Integer value2) {
            addCriterion("tuesday between", value1, value2, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayNotBetween(Integer value1, Integer value2) {
            addCriterion("tuesday not between", value1, value2, "tuesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayIsNull() {
            addCriterion("wednesday is null");
            return (Criteria) this;
        }

        public Criteria andWednesdayIsNotNull() {
            addCriterion("wednesday is not null");
            return (Criteria) this;
        }

        public Criteria andWednesdayEqualTo(Integer value) {
            addCriterion("wednesday =", value, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayNotEqualTo(Integer value) {
            addCriterion("wednesday <>", value, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayGreaterThan(Integer value) {
            addCriterion("wednesday >", value, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("wednesday >=", value, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayLessThan(Integer value) {
            addCriterion("wednesday <", value, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayLessThanOrEqualTo(Integer value) {
            addCriterion("wednesday <=", value, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayIn(List<Integer> values) {
            addCriterion("wednesday in", values, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayNotIn(List<Integer> values) {
            addCriterion("wednesday not in", values, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayBetween(Integer value1, Integer value2) {
            addCriterion("wednesday between", value1, value2, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayNotBetween(Integer value1, Integer value2) {
            addCriterion("wednesday not between", value1, value2, "wednesday");
            return (Criteria) this;
        }

        public Criteria andThursdayIsNull() {
            addCriterion("thursday is null");
            return (Criteria) this;
        }

        public Criteria andThursdayIsNotNull() {
            addCriterion("thursday is not null");
            return (Criteria) this;
        }

        public Criteria andThursdayEqualTo(Integer value) {
            addCriterion("thursday =", value, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayNotEqualTo(Integer value) {
            addCriterion("thursday <>", value, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayGreaterThan(Integer value) {
            addCriterion("thursday >", value, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("thursday >=", value, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayLessThan(Integer value) {
            addCriterion("thursday <", value, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayLessThanOrEqualTo(Integer value) {
            addCriterion("thursday <=", value, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayIn(List<Integer> values) {
            addCriterion("thursday in", values, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayNotIn(List<Integer> values) {
            addCriterion("thursday not in", values, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayBetween(Integer value1, Integer value2) {
            addCriterion("thursday between", value1, value2, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayNotBetween(Integer value1, Integer value2) {
            addCriterion("thursday not between", value1, value2, "thursday");
            return (Criteria) this;
        }

        public Criteria andFridayIsNull() {
            addCriterion("friday is null");
            return (Criteria) this;
        }

        public Criteria andFridayIsNotNull() {
            addCriterion("friday is not null");
            return (Criteria) this;
        }

        public Criteria andFridayEqualTo(Integer value) {
            addCriterion("friday =", value, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayNotEqualTo(Integer value) {
            addCriterion("friday <>", value, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayGreaterThan(Integer value) {
            addCriterion("friday >", value, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayGreaterThanOrEqualTo(Integer value) {
            addCriterion("friday >=", value, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayLessThan(Integer value) {
            addCriterion("friday <", value, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayLessThanOrEqualTo(Integer value) {
            addCriterion("friday <=", value, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayIn(List<Integer> values) {
            addCriterion("friday in", values, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayNotIn(List<Integer> values) {
            addCriterion("friday not in", values, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayBetween(Integer value1, Integer value2) {
            addCriterion("friday between", value1, value2, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayNotBetween(Integer value1, Integer value2) {
            addCriterion("friday not between", value1, value2, "friday");
            return (Criteria) this;
        }

        public Criteria andSaturdayIsNull() {
            addCriterion("saturday is null");
            return (Criteria) this;
        }

        public Criteria andSaturdayIsNotNull() {
            addCriterion("saturday is not null");
            return (Criteria) this;
        }

        public Criteria andSaturdayEqualTo(Integer value) {
            addCriterion("saturday =", value, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayNotEqualTo(Integer value) {
            addCriterion("saturday <>", value, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayGreaterThan(Integer value) {
            addCriterion("saturday >", value, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("saturday >=", value, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayLessThan(Integer value) {
            addCriterion("saturday <", value, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayLessThanOrEqualTo(Integer value) {
            addCriterion("saturday <=", value, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayIn(List<Integer> values) {
            addCriterion("saturday in", values, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayNotIn(List<Integer> values) {
            addCriterion("saturday not in", values, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayBetween(Integer value1, Integer value2) {
            addCriterion("saturday between", value1, value2, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayNotBetween(Integer value1, Integer value2) {
            addCriterion("saturday not between", value1, value2, "saturday");
            return (Criteria) this;
        }

        public Criteria andSundayIsNull() {
            addCriterion("sunday is null");
            return (Criteria) this;
        }

        public Criteria andSundayIsNotNull() {
            addCriterion("sunday is not null");
            return (Criteria) this;
        }

        public Criteria andSundayEqualTo(Integer value) {
            addCriterion("sunday =", value, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayNotEqualTo(Integer value) {
            addCriterion("sunday <>", value, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayGreaterThan(Integer value) {
            addCriterion("sunday >", value, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayGreaterThanOrEqualTo(Integer value) {
            addCriterion("sunday >=", value, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayLessThan(Integer value) {
            addCriterion("sunday <", value, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayLessThanOrEqualTo(Integer value) {
            addCriterion("sunday <=", value, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayIn(List<Integer> values) {
            addCriterion("sunday in", values, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayNotIn(List<Integer> values) {
            addCriterion("sunday not in", values, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayBetween(Integer value1, Integer value2) {
            addCriterion("sunday between", value1, value2, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayNotBetween(Integer value1, Integer value2) {
            addCriterion("sunday not between", value1, value2, "sunday");
            return (Criteria) this;
        }

        public Criteria andTotalWeekIsNull() {
            addCriterion("total_week is null");
            return (Criteria) this;
        }

        public Criteria andTotalWeekIsNotNull() {
            addCriterion("total_week is not null");
            return (Criteria) this;
        }

        public Criteria andTotalWeekEqualTo(Integer value) {
            addCriterion("total_week =", value, "totalWeek");
            return (Criteria) this;
        }

        public Criteria andTotalWeekNotEqualTo(Integer value) {
            addCriterion("total_week <>", value, "totalWeek");
            return (Criteria) this;
        }

        public Criteria andTotalWeekGreaterThan(Integer value) {
            addCriterion("total_week >", value, "totalWeek");
            return (Criteria) this;
        }

        public Criteria andTotalWeekGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_week >=", value, "totalWeek");
            return (Criteria) this;
        }

        public Criteria andTotalWeekLessThan(Integer value) {
            addCriterion("total_week <", value, "totalWeek");
            return (Criteria) this;
        }

        public Criteria andTotalWeekLessThanOrEqualTo(Integer value) {
            addCriterion("total_week <=", value, "totalWeek");
            return (Criteria) this;
        }

        public Criteria andTotalWeekIn(List<Integer> values) {
            addCriterion("total_week in", values, "totalWeek");
            return (Criteria) this;
        }

        public Criteria andTotalWeekNotIn(List<Integer> values) {
            addCriterion("total_week not in", values, "totalWeek");
            return (Criteria) this;
        }

        public Criteria andTotalWeekBetween(Integer value1, Integer value2) {
            addCriterion("total_week between", value1, value2, "totalWeek");
            return (Criteria) this;
        }

        public Criteria andTotalWeekNotBetween(Integer value1, Integer value2) {
            addCriterion("total_week not between", value1, value2, "totalWeek");
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