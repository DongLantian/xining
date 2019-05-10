package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class DustremoveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DustremoveExample() {
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

        public Criteria andDustRemoveIdIsNull() {
            addCriterion("dust_remove_id is null");
            return (Criteria) this;
        }

        public Criteria andDustRemoveIdIsNotNull() {
            addCriterion("dust_remove_id is not null");
            return (Criteria) this;
        }

        public Criteria andDustRemoveIdEqualTo(String value) {
            addCriterion("dust_remove_id =", value, "dustRemoveId");
            return (Criteria) this;
        }

        public Criteria andDustRemoveIdNotEqualTo(String value) {
            addCriterion("dust_remove_id <>", value, "dustRemoveId");
            return (Criteria) this;
        }

        public Criteria andDustRemoveIdGreaterThan(String value) {
            addCriterion("dust_remove_id >", value, "dustRemoveId");
            return (Criteria) this;
        }

        public Criteria andDustRemoveIdGreaterThanOrEqualTo(String value) {
            addCriterion("dust_remove_id >=", value, "dustRemoveId");
            return (Criteria) this;
        }

        public Criteria andDustRemoveIdLessThan(String value) {
            addCriterion("dust_remove_id <", value, "dustRemoveId");
            return (Criteria) this;
        }

        public Criteria andDustRemoveIdLessThanOrEqualTo(String value) {
            addCriterion("dust_remove_id <=", value, "dustRemoveId");
            return (Criteria) this;
        }

        public Criteria andDustRemoveIdLike(String value) {
            addCriterion("dust_remove_id like", value, "dustRemoveId");
            return (Criteria) this;
        }

        public Criteria andDustRemoveIdNotLike(String value) {
            addCriterion("dust_remove_id not like", value, "dustRemoveId");
            return (Criteria) this;
        }

        public Criteria andDustRemoveIdIn(List<String> values) {
            addCriterion("dust_remove_id in", values, "dustRemoveId");
            return (Criteria) this;
        }

        public Criteria andDustRemoveIdNotIn(List<String> values) {
            addCriterion("dust_remove_id not in", values, "dustRemoveId");
            return (Criteria) this;
        }

        public Criteria andDustRemoveIdBetween(String value1, String value2) {
            addCriterion("dust_remove_id between", value1, value2, "dustRemoveId");
            return (Criteria) this;
        }

        public Criteria andDustRemoveIdNotBetween(String value1, String value2) {
            addCriterion("dust_remove_id not between", value1, value2, "dustRemoveId");
            return (Criteria) this;
        }

        public Criteria andDustRemoveNameIsNull() {
            addCriterion("dust_remove_name is null");
            return (Criteria) this;
        }

        public Criteria andDustRemoveNameIsNotNull() {
            addCriterion("dust_remove_name is not null");
            return (Criteria) this;
        }

        public Criteria andDustRemoveNameEqualTo(String value) {
            addCriterion("dust_remove_name =", value, "dustRemoveName");
            return (Criteria) this;
        }

        public Criteria andDustRemoveNameNotEqualTo(String value) {
            addCriterion("dust_remove_name <>", value, "dustRemoveName");
            return (Criteria) this;
        }

        public Criteria andDustRemoveNameGreaterThan(String value) {
            addCriterion("dust_remove_name >", value, "dustRemoveName");
            return (Criteria) this;
        }

        public Criteria andDustRemoveNameGreaterThanOrEqualTo(String value) {
            addCriterion("dust_remove_name >=", value, "dustRemoveName");
            return (Criteria) this;
        }

        public Criteria andDustRemoveNameLessThan(String value) {
            addCriterion("dust_remove_name <", value, "dustRemoveName");
            return (Criteria) this;
        }

        public Criteria andDustRemoveNameLessThanOrEqualTo(String value) {
            addCriterion("dust_remove_name <=", value, "dustRemoveName");
            return (Criteria) this;
        }

        public Criteria andDustRemoveNameLike(String value) {
            addCriterion("dust_remove_name like", value, "dustRemoveName");
            return (Criteria) this;
        }

        public Criteria andDustRemoveNameNotLike(String value) {
            addCriterion("dust_remove_name not like", value, "dustRemoveName");
            return (Criteria) this;
        }

        public Criteria andDustRemoveNameIn(List<String> values) {
            addCriterion("dust_remove_name in", values, "dustRemoveName");
            return (Criteria) this;
        }

        public Criteria andDustRemoveNameNotIn(List<String> values) {
            addCriterion("dust_remove_name not in", values, "dustRemoveName");
            return (Criteria) this;
        }

        public Criteria andDustRemoveNameBetween(String value1, String value2) {
            addCriterion("dust_remove_name between", value1, value2, "dustRemoveName");
            return (Criteria) this;
        }

        public Criteria andDustRemoveNameNotBetween(String value1, String value2) {
            addCriterion("dust_remove_name not between", value1, value2, "dustRemoveName");
            return (Criteria) this;
        }

        public Criteria andPmRemoveEffiIsNull() {
            addCriterion("pm_remove_effi is null");
            return (Criteria) this;
        }

        public Criteria andPmRemoveEffiIsNotNull() {
            addCriterion("pm_remove_effi is not null");
            return (Criteria) this;
        }

        public Criteria andPmRemoveEffiEqualTo(Double value) {
            addCriterion("pm_remove_effi =", value, "pmRemoveEffi");
            return (Criteria) this;
        }

        public Criteria andPmRemoveEffiNotEqualTo(Double value) {
            addCriterion("pm_remove_effi <>", value, "pmRemoveEffi");
            return (Criteria) this;
        }

        public Criteria andPmRemoveEffiGreaterThan(Double value) {
            addCriterion("pm_remove_effi >", value, "pmRemoveEffi");
            return (Criteria) this;
        }

        public Criteria andPmRemoveEffiGreaterThanOrEqualTo(Double value) {
            addCriterion("pm_remove_effi >=", value, "pmRemoveEffi");
            return (Criteria) this;
        }

        public Criteria andPmRemoveEffiLessThan(Double value) {
            addCriterion("pm_remove_effi <", value, "pmRemoveEffi");
            return (Criteria) this;
        }

        public Criteria andPmRemoveEffiLessThanOrEqualTo(Double value) {
            addCriterion("pm_remove_effi <=", value, "pmRemoveEffi");
            return (Criteria) this;
        }

        public Criteria andPmRemoveEffiIn(List<Double> values) {
            addCriterion("pm_remove_effi in", values, "pmRemoveEffi");
            return (Criteria) this;
        }

        public Criteria andPmRemoveEffiNotIn(List<Double> values) {
            addCriterion("pm_remove_effi not in", values, "pmRemoveEffi");
            return (Criteria) this;
        }

        public Criteria andPmRemoveEffiBetween(Double value1, Double value2) {
            addCriterion("pm_remove_effi between", value1, value2, "pmRemoveEffi");
            return (Criteria) this;
        }

        public Criteria andPmRemoveEffiNotBetween(Double value1, Double value2) {
            addCriterion("pm_remove_effi not between", value1, value2, "pmRemoveEffi");
            return (Criteria) this;
        }

        public Criteria andPm10RemoveEffiIsNull() {
            addCriterion("pm10_remove_effi is null");
            return (Criteria) this;
        }

        public Criteria andPm10RemoveEffiIsNotNull() {
            addCriterion("pm10_remove_effi is not null");
            return (Criteria) this;
        }

        public Criteria andPm10RemoveEffiEqualTo(Double value) {
            addCriterion("pm10_remove_effi =", value, "pm10RemoveEffi");
            return (Criteria) this;
        }

        public Criteria andPm10RemoveEffiNotEqualTo(Double value) {
            addCriterion("pm10_remove_effi <>", value, "pm10RemoveEffi");
            return (Criteria) this;
        }

        public Criteria andPm10RemoveEffiGreaterThan(Double value) {
            addCriterion("pm10_remove_effi >", value, "pm10RemoveEffi");
            return (Criteria) this;
        }

        public Criteria andPm10RemoveEffiGreaterThanOrEqualTo(Double value) {
            addCriterion("pm10_remove_effi >=", value, "pm10RemoveEffi");
            return (Criteria) this;
        }

        public Criteria andPm10RemoveEffiLessThan(Double value) {
            addCriterion("pm10_remove_effi <", value, "pm10RemoveEffi");
            return (Criteria) this;
        }

        public Criteria andPm10RemoveEffiLessThanOrEqualTo(Double value) {
            addCriterion("pm10_remove_effi <=", value, "pm10RemoveEffi");
            return (Criteria) this;
        }

        public Criteria andPm10RemoveEffiIn(List<Double> values) {
            addCriterion("pm10_remove_effi in", values, "pm10RemoveEffi");
            return (Criteria) this;
        }

        public Criteria andPm10RemoveEffiNotIn(List<Double> values) {
            addCriterion("pm10_remove_effi not in", values, "pm10RemoveEffi");
            return (Criteria) this;
        }

        public Criteria andPm10RemoveEffiBetween(Double value1, Double value2) {
            addCriterion("pm10_remove_effi between", value1, value2, "pm10RemoveEffi");
            return (Criteria) this;
        }

        public Criteria andPm10RemoveEffiNotBetween(Double value1, Double value2) {
            addCriterion("pm10_remove_effi not between", value1, value2, "pm10RemoveEffi");
            return (Criteria) this;
        }

        public Criteria andPm25RemoveEffiIsNull() {
            addCriterion("pm25_remove_effi is null");
            return (Criteria) this;
        }

        public Criteria andPm25RemoveEffiIsNotNull() {
            addCriterion("pm25_remove_effi is not null");
            return (Criteria) this;
        }

        public Criteria andPm25RemoveEffiEqualTo(Double value) {
            addCriterion("pm25_remove_effi =", value, "pm25RemoveEffi");
            return (Criteria) this;
        }

        public Criteria andPm25RemoveEffiNotEqualTo(Double value) {
            addCriterion("pm25_remove_effi <>", value, "pm25RemoveEffi");
            return (Criteria) this;
        }

        public Criteria andPm25RemoveEffiGreaterThan(Double value) {
            addCriterion("pm25_remove_effi >", value, "pm25RemoveEffi");
            return (Criteria) this;
        }

        public Criteria andPm25RemoveEffiGreaterThanOrEqualTo(Double value) {
            addCriterion("pm25_remove_effi >=", value, "pm25RemoveEffi");
            return (Criteria) this;
        }

        public Criteria andPm25RemoveEffiLessThan(Double value) {
            addCriterion("pm25_remove_effi <", value, "pm25RemoveEffi");
            return (Criteria) this;
        }

        public Criteria andPm25RemoveEffiLessThanOrEqualTo(Double value) {
            addCriterion("pm25_remove_effi <=", value, "pm25RemoveEffi");
            return (Criteria) this;
        }

        public Criteria andPm25RemoveEffiIn(List<Double> values) {
            addCriterion("pm25_remove_effi in", values, "pm25RemoveEffi");
            return (Criteria) this;
        }

        public Criteria andPm25RemoveEffiNotIn(List<Double> values) {
            addCriterion("pm25_remove_effi not in", values, "pm25RemoveEffi");
            return (Criteria) this;
        }

        public Criteria andPm25RemoveEffiBetween(Double value1, Double value2) {
            addCriterion("pm25_remove_effi between", value1, value2, "pm25RemoveEffi");
            return (Criteria) this;
        }

        public Criteria andPm25RemoveEffiNotBetween(Double value1, Double value2) {
            addCriterion("pm25_remove_effi not between", value1, value2, "pm25RemoveEffi");
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