package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class SoildriftingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SoildriftingExample() {
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

        public Criteria andSdSoiltypeIsNull() {
            addCriterion("sd_soiltype is null");
            return (Criteria) this;
        }

        public Criteria andSdSoiltypeIsNotNull() {
            addCriterion("sd_soiltype is not null");
            return (Criteria) this;
        }

        public Criteria andSdSoiltypeEqualTo(String value) {
            addCriterion("sd_soiltype =", value, "sdSoiltype");
            return (Criteria) this;
        }

        public Criteria andSdSoiltypeNotEqualTo(String value) {
            addCriterion("sd_soiltype <>", value, "sdSoiltype");
            return (Criteria) this;
        }

        public Criteria andSdSoiltypeGreaterThan(String value) {
            addCriterion("sd_soiltype >", value, "sdSoiltype");
            return (Criteria) this;
        }

        public Criteria andSdSoiltypeGreaterThanOrEqualTo(String value) {
            addCriterion("sd_soiltype >=", value, "sdSoiltype");
            return (Criteria) this;
        }

        public Criteria andSdSoiltypeLessThan(String value) {
            addCriterion("sd_soiltype <", value, "sdSoiltype");
            return (Criteria) this;
        }

        public Criteria andSdSoiltypeLessThanOrEqualTo(String value) {
            addCriterion("sd_soiltype <=", value, "sdSoiltype");
            return (Criteria) this;
        }

        public Criteria andSdSoiltypeLike(String value) {
            addCriterion("sd_soiltype like", value, "sdSoiltype");
            return (Criteria) this;
        }

        public Criteria andSdSoiltypeNotLike(String value) {
            addCriterion("sd_soiltype not like", value, "sdSoiltype");
            return (Criteria) this;
        }

        public Criteria andSdSoiltypeIn(List<String> values) {
            addCriterion("sd_soiltype in", values, "sdSoiltype");
            return (Criteria) this;
        }

        public Criteria andSdSoiltypeNotIn(List<String> values) {
            addCriterion("sd_soiltype not in", values, "sdSoiltype");
            return (Criteria) this;
        }

        public Criteria andSdSoiltypeBetween(String value1, String value2) {
            addCriterion("sd_soiltype between", value1, value2, "sdSoiltype");
            return (Criteria) this;
        }

        public Criteria andSdSoiltypeNotBetween(String value1, String value2) {
            addCriterion("sd_soiltype not between", value1, value2, "sdSoiltype");
            return (Criteria) this;
        }

        public Criteria andSoiltypeSubIsNull() {
            addCriterion("soiltype_sub is null");
            return (Criteria) this;
        }

        public Criteria andSoiltypeSubIsNotNull() {
            addCriterion("soiltype_sub is not null");
            return (Criteria) this;
        }

        public Criteria andSoiltypeSubEqualTo(String value) {
            addCriterion("soiltype_sub =", value, "soiltypeSub");
            return (Criteria) this;
        }

        public Criteria andSoiltypeSubNotEqualTo(String value) {
            addCriterion("soiltype_sub <>", value, "soiltypeSub");
            return (Criteria) this;
        }

        public Criteria andSoiltypeSubGreaterThan(String value) {
            addCriterion("soiltype_sub >", value, "soiltypeSub");
            return (Criteria) this;
        }

        public Criteria andSoiltypeSubGreaterThanOrEqualTo(String value) {
            addCriterion("soiltype_sub >=", value, "soiltypeSub");
            return (Criteria) this;
        }

        public Criteria andSoiltypeSubLessThan(String value) {
            addCriterion("soiltype_sub <", value, "soiltypeSub");
            return (Criteria) this;
        }

        public Criteria andSoiltypeSubLessThanOrEqualTo(String value) {
            addCriterion("soiltype_sub <=", value, "soiltypeSub");
            return (Criteria) this;
        }

        public Criteria andSoiltypeSubLike(String value) {
            addCriterion("soiltype_sub like", value, "soiltypeSub");
            return (Criteria) this;
        }

        public Criteria andSoiltypeSubNotLike(String value) {
            addCriterion("soiltype_sub not like", value, "soiltypeSub");
            return (Criteria) this;
        }

        public Criteria andSoiltypeSubIn(List<String> values) {
            addCriterion("soiltype_sub in", values, "soiltypeSub");
            return (Criteria) this;
        }

        public Criteria andSoiltypeSubNotIn(List<String> values) {
            addCriterion("soiltype_sub not in", values, "soiltypeSub");
            return (Criteria) this;
        }

        public Criteria andSoiltypeSubBetween(String value1, String value2) {
            addCriterion("soiltype_sub between", value1, value2, "soiltypeSub");
            return (Criteria) this;
        }

        public Criteria andSoiltypeSubNotBetween(String value1, String value2) {
            addCriterion("soiltype_sub not between", value1, value2, "soiltypeSub");
            return (Criteria) this;
        }

        public Criteria andTspindexIsNull() {
            addCriterion("tspindex is null");
            return (Criteria) this;
        }

        public Criteria andTspindexIsNotNull() {
            addCriterion("tspindex is not null");
            return (Criteria) this;
        }

        public Criteria andTspindexEqualTo(Integer value) {
            addCriterion("tspindex =", value, "tspindex");
            return (Criteria) this;
        }

        public Criteria andTspindexNotEqualTo(Integer value) {
            addCriterion("tspindex <>", value, "tspindex");
            return (Criteria) this;
        }

        public Criteria andTspindexGreaterThan(Integer value) {
            addCriterion("tspindex >", value, "tspindex");
            return (Criteria) this;
        }

        public Criteria andTspindexGreaterThanOrEqualTo(Integer value) {
            addCriterion("tspindex >=", value, "tspindex");
            return (Criteria) this;
        }

        public Criteria andTspindexLessThan(Integer value) {
            addCriterion("tspindex <", value, "tspindex");
            return (Criteria) this;
        }

        public Criteria andTspindexLessThanOrEqualTo(Integer value) {
            addCriterion("tspindex <=", value, "tspindex");
            return (Criteria) this;
        }

        public Criteria andTspindexIn(List<Integer> values) {
            addCriterion("tspindex in", values, "tspindex");
            return (Criteria) this;
        }

        public Criteria andTspindexNotIn(List<Integer> values) {
            addCriterion("tspindex not in", values, "tspindex");
            return (Criteria) this;
        }

        public Criteria andTspindexBetween(Integer value1, Integer value2) {
            addCriterion("tspindex between", value1, value2, "tspindex");
            return (Criteria) this;
        }

        public Criteria andTspindexNotBetween(Integer value1, Integer value2) {
            addCriterion("tspindex not between", value1, value2, "tspindex");
            return (Criteria) this;
        }

        public Criteria andPm10indexIsNull() {
            addCriterion("pm10index is null");
            return (Criteria) this;
        }

        public Criteria andPm10indexIsNotNull() {
            addCriterion("pm10index is not null");
            return (Criteria) this;
        }

        public Criteria andPm10indexEqualTo(Integer value) {
            addCriterion("pm10index =", value, "pm10index");
            return (Criteria) this;
        }

        public Criteria andPm10indexNotEqualTo(Integer value) {
            addCriterion("pm10index <>", value, "pm10index");
            return (Criteria) this;
        }

        public Criteria andPm10indexGreaterThan(Integer value) {
            addCriterion("pm10index >", value, "pm10index");
            return (Criteria) this;
        }

        public Criteria andPm10indexGreaterThanOrEqualTo(Integer value) {
            addCriterion("pm10index >=", value, "pm10index");
            return (Criteria) this;
        }

        public Criteria andPm10indexLessThan(Integer value) {
            addCriterion("pm10index <", value, "pm10index");
            return (Criteria) this;
        }

        public Criteria andPm10indexLessThanOrEqualTo(Integer value) {
            addCriterion("pm10index <=", value, "pm10index");
            return (Criteria) this;
        }

        public Criteria andPm10indexIn(List<Integer> values) {
            addCriterion("pm10index in", values, "pm10index");
            return (Criteria) this;
        }

        public Criteria andPm10indexNotIn(List<Integer> values) {
            addCriterion("pm10index not in", values, "pm10index");
            return (Criteria) this;
        }

        public Criteria andPm10indexBetween(Integer value1, Integer value2) {
            addCriterion("pm10index between", value1, value2, "pm10index");
            return (Criteria) this;
        }

        public Criteria andPm10indexNotBetween(Integer value1, Integer value2) {
            addCriterion("pm10index not between", value1, value2, "pm10index");
            return (Criteria) this;
        }

        public Criteria andPm25indexIsNull() {
            addCriterion("pm25index is null");
            return (Criteria) this;
        }

        public Criteria andPm25indexIsNotNull() {
            addCriterion("pm25index is not null");
            return (Criteria) this;
        }

        public Criteria andPm25indexEqualTo(Integer value) {
            addCriterion("pm25index =", value, "pm25index");
            return (Criteria) this;
        }

        public Criteria andPm25indexNotEqualTo(Integer value) {
            addCriterion("pm25index <>", value, "pm25index");
            return (Criteria) this;
        }

        public Criteria andPm25indexGreaterThan(Integer value) {
            addCriterion("pm25index >", value, "pm25index");
            return (Criteria) this;
        }

        public Criteria andPm25indexGreaterThanOrEqualTo(Integer value) {
            addCriterion("pm25index >=", value, "pm25index");
            return (Criteria) this;
        }

        public Criteria andPm25indexLessThan(Integer value) {
            addCriterion("pm25index <", value, "pm25index");
            return (Criteria) this;
        }

        public Criteria andPm25indexLessThanOrEqualTo(Integer value) {
            addCriterion("pm25index <=", value, "pm25index");
            return (Criteria) this;
        }

        public Criteria andPm25indexIn(List<Integer> values) {
            addCriterion("pm25index in", values, "pm25index");
            return (Criteria) this;
        }

        public Criteria andPm25indexNotIn(List<Integer> values) {
            addCriterion("pm25index not in", values, "pm25index");
            return (Criteria) this;
        }

        public Criteria andPm25indexBetween(Integer value1, Integer value2) {
            addCriterion("pm25index between", value1, value2, "pm25index");
            return (Criteria) this;
        }

        public Criteria andPm25indexNotBetween(Integer value1, Integer value2) {
            addCriterion("pm25index not between", value1, value2, "pm25index");
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