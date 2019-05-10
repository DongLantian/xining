package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class DustconExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DustconExample() {
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

        public Criteria andDcIdIsNull() {
            addCriterion("dc_id is null");
            return (Criteria) this;
        }

        public Criteria andDcIdIsNotNull() {
            addCriterion("dc_id is not null");
            return (Criteria) this;
        }

        public Criteria andDcIdEqualTo(Integer value) {
            addCriterion("dc_id =", value, "dcId");
            return (Criteria) this;
        }

        public Criteria andDcIdNotEqualTo(Integer value) {
            addCriterion("dc_id <>", value, "dcId");
            return (Criteria) this;
        }

        public Criteria andDcIdGreaterThan(Integer value) {
            addCriterion("dc_id >", value, "dcId");
            return (Criteria) this;
        }

        public Criteria andDcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dc_id >=", value, "dcId");
            return (Criteria) this;
        }

        public Criteria andDcIdLessThan(Integer value) {
            addCriterion("dc_id <", value, "dcId");
            return (Criteria) this;
        }

        public Criteria andDcIdLessThanOrEqualTo(Integer value) {
            addCriterion("dc_id <=", value, "dcId");
            return (Criteria) this;
        }

        public Criteria andDcIdIn(List<Integer> values) {
            addCriterion("dc_id in", values, "dcId");
            return (Criteria) this;
        }

        public Criteria andDcIdNotIn(List<Integer> values) {
            addCriterion("dc_id not in", values, "dcId");
            return (Criteria) this;
        }

        public Criteria andDcIdBetween(Integer value1, Integer value2) {
            addCriterion("dc_id between", value1, value2, "dcId");
            return (Criteria) this;
        }

        public Criteria andDcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dc_id not between", value1, value2, "dcId");
            return (Criteria) this;
        }

        public Criteria andControlnameIsNull() {
            addCriterion("controlname is null");
            return (Criteria) this;
        }

        public Criteria andControlnameIsNotNull() {
            addCriterion("controlname is not null");
            return (Criteria) this;
        }

        public Criteria andControlnameEqualTo(String value) {
            addCriterion("controlname =", value, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameNotEqualTo(String value) {
            addCriterion("controlname <>", value, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameGreaterThan(String value) {
            addCriterion("controlname >", value, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameGreaterThanOrEqualTo(String value) {
            addCriterion("controlname >=", value, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameLessThan(String value) {
            addCriterion("controlname <", value, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameLessThanOrEqualTo(String value) {
            addCriterion("controlname <=", value, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameLike(String value) {
            addCriterion("controlname like", value, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameNotLike(String value) {
            addCriterion("controlname not like", value, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameIn(List<String> values) {
            addCriterion("controlname in", values, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameNotIn(List<String> values) {
            addCriterion("controlname not in", values, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameBetween(String value1, String value2) {
            addCriterion("controlname between", value1, value2, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameNotBetween(String value1, String value2) {
            addCriterion("controlname not between", value1, value2, "controlname");
            return (Criteria) this;
        }

        public Criteria andObjectIsNull() {
            addCriterion("object is null");
            return (Criteria) this;
        }

        public Criteria andObjectIsNotNull() {
            addCriterion("object is not null");
            return (Criteria) this;
        }

        public Criteria andObjectEqualTo(Integer value) {
            addCriterion("object =", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectNotEqualTo(Integer value) {
            addCriterion("object <>", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectGreaterThan(Integer value) {
            addCriterion("object >", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectGreaterThanOrEqualTo(Integer value) {
            addCriterion("object >=", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectLessThan(Integer value) {
            addCriterion("object <", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectLessThanOrEqualTo(Integer value) {
            addCriterion("object <=", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectIn(List<Integer> values) {
            addCriterion("object in", values, "object");
            return (Criteria) this;
        }

        public Criteria andObjectNotIn(List<Integer> values) {
            addCriterion("object not in", values, "object");
            return (Criteria) this;
        }

        public Criteria andObjectBetween(Integer value1, Integer value2) {
            addCriterion("object between", value1, value2, "object");
            return (Criteria) this;
        }

        public Criteria andObjectNotBetween(Integer value1, Integer value2) {
            addCriterion("object not between", value1, value2, "object");
            return (Criteria) this;
        }

        public Criteria andDcTspeffiIsNull() {
            addCriterion("dc_tspeffi is null");
            return (Criteria) this;
        }

        public Criteria andDcTspeffiIsNotNull() {
            addCriterion("dc_tspeffi is not null");
            return (Criteria) this;
        }

        public Criteria andDcTspeffiEqualTo(Double value) {
            addCriterion("dc_tspeffi =", value, "dcTspeffi");
            return (Criteria) this;
        }

        public Criteria andDcTspeffiNotEqualTo(Double value) {
            addCriterion("dc_tspeffi <>", value, "dcTspeffi");
            return (Criteria) this;
        }

        public Criteria andDcTspeffiGreaterThan(Double value) {
            addCriterion("dc_tspeffi >", value, "dcTspeffi");
            return (Criteria) this;
        }

        public Criteria andDcTspeffiGreaterThanOrEqualTo(Double value) {
            addCriterion("dc_tspeffi >=", value, "dcTspeffi");
            return (Criteria) this;
        }

        public Criteria andDcTspeffiLessThan(Double value) {
            addCriterion("dc_tspeffi <", value, "dcTspeffi");
            return (Criteria) this;
        }

        public Criteria andDcTspeffiLessThanOrEqualTo(Double value) {
            addCriterion("dc_tspeffi <=", value, "dcTspeffi");
            return (Criteria) this;
        }

        public Criteria andDcTspeffiIn(List<Double> values) {
            addCriterion("dc_tspeffi in", values, "dcTspeffi");
            return (Criteria) this;
        }

        public Criteria andDcTspeffiNotIn(List<Double> values) {
            addCriterion("dc_tspeffi not in", values, "dcTspeffi");
            return (Criteria) this;
        }

        public Criteria andDcTspeffiBetween(Double value1, Double value2) {
            addCriterion("dc_tspeffi between", value1, value2, "dcTspeffi");
            return (Criteria) this;
        }

        public Criteria andDcTspeffiNotBetween(Double value1, Double value2) {
            addCriterion("dc_tspeffi not between", value1, value2, "dcTspeffi");
            return (Criteria) this;
        }

        public Criteria andDcPm25effiIsNull() {
            addCriterion("dc_pm25effi is null");
            return (Criteria) this;
        }

        public Criteria andDcPm25effiIsNotNull() {
            addCriterion("dc_pm25effi is not null");
            return (Criteria) this;
        }

        public Criteria andDcPm25effiEqualTo(Double value) {
            addCriterion("dc_pm25effi =", value, "dcPm25effi");
            return (Criteria) this;
        }

        public Criteria andDcPm25effiNotEqualTo(Double value) {
            addCriterion("dc_pm25effi <>", value, "dcPm25effi");
            return (Criteria) this;
        }

        public Criteria andDcPm25effiGreaterThan(Double value) {
            addCriterion("dc_pm25effi >", value, "dcPm25effi");
            return (Criteria) this;
        }

        public Criteria andDcPm25effiGreaterThanOrEqualTo(Double value) {
            addCriterion("dc_pm25effi >=", value, "dcPm25effi");
            return (Criteria) this;
        }

        public Criteria andDcPm25effiLessThan(Double value) {
            addCriterion("dc_pm25effi <", value, "dcPm25effi");
            return (Criteria) this;
        }

        public Criteria andDcPm25effiLessThanOrEqualTo(Double value) {
            addCriterion("dc_pm25effi <=", value, "dcPm25effi");
            return (Criteria) this;
        }

        public Criteria andDcPm25effiIn(List<Double> values) {
            addCriterion("dc_pm25effi in", values, "dcPm25effi");
            return (Criteria) this;
        }

        public Criteria andDcPm25effiNotIn(List<Double> values) {
            addCriterion("dc_pm25effi not in", values, "dcPm25effi");
            return (Criteria) this;
        }

        public Criteria andDcPm25effiBetween(Double value1, Double value2) {
            addCriterion("dc_pm25effi between", value1, value2, "dcPm25effi");
            return (Criteria) this;
        }

        public Criteria andDcPm25effiNotBetween(Double value1, Double value2) {
            addCriterion("dc_pm25effi not between", value1, value2, "dcPm25effi");
            return (Criteria) this;
        }

        public Criteria andDcPm10effiIsNull() {
            addCriterion("dc_pm10effi is null");
            return (Criteria) this;
        }

        public Criteria andDcPm10effiIsNotNull() {
            addCriterion("dc_pm10effi is not null");
            return (Criteria) this;
        }

        public Criteria andDcPm10effiEqualTo(Double value) {
            addCriterion("dc_pm10effi =", value, "dcPm10effi");
            return (Criteria) this;
        }

        public Criteria andDcPm10effiNotEqualTo(Double value) {
            addCriterion("dc_pm10effi <>", value, "dcPm10effi");
            return (Criteria) this;
        }

        public Criteria andDcPm10effiGreaterThan(Double value) {
            addCriterion("dc_pm10effi >", value, "dcPm10effi");
            return (Criteria) this;
        }

        public Criteria andDcPm10effiGreaterThanOrEqualTo(Double value) {
            addCriterion("dc_pm10effi >=", value, "dcPm10effi");
            return (Criteria) this;
        }

        public Criteria andDcPm10effiLessThan(Double value) {
            addCriterion("dc_pm10effi <", value, "dcPm10effi");
            return (Criteria) this;
        }

        public Criteria andDcPm10effiLessThanOrEqualTo(Double value) {
            addCriterion("dc_pm10effi <=", value, "dcPm10effi");
            return (Criteria) this;
        }

        public Criteria andDcPm10effiIn(List<Double> values) {
            addCriterion("dc_pm10effi in", values, "dcPm10effi");
            return (Criteria) this;
        }

        public Criteria andDcPm10effiNotIn(List<Double> values) {
            addCriterion("dc_pm10effi not in", values, "dcPm10effi");
            return (Criteria) this;
        }

        public Criteria andDcPm10effiBetween(Double value1, Double value2) {
            addCriterion("dc_pm10effi between", value1, value2, "dcPm10effi");
            return (Criteria) this;
        }

        public Criteria andDcPm10effiNotBetween(Double value1, Double value2) {
            addCriterion("dc_pm10effi not between", value1, value2, "dcPm10effi");
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

        public Criteria andDusttypeEqualTo(Integer value) {
            addCriterion("dusttype =", value, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeNotEqualTo(Integer value) {
            addCriterion("dusttype <>", value, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeGreaterThan(Integer value) {
            addCriterion("dusttype >", value, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dusttype >=", value, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeLessThan(Integer value) {
            addCriterion("dusttype <", value, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeLessThanOrEqualTo(Integer value) {
            addCriterion("dusttype <=", value, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeIn(List<Integer> values) {
            addCriterion("dusttype in", values, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeNotIn(List<Integer> values) {
            addCriterion("dusttype not in", values, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeBetween(Integer value1, Integer value2) {
            addCriterion("dusttype between", value1, value2, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeNotBetween(Integer value1, Integer value2) {
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