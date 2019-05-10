package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class NaturalLanduseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NaturalLanduseExample() {
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

        public Criteria andRowIsNull() {
            addCriterion("row is null");
            return (Criteria) this;
        }

        public Criteria andRowIsNotNull() {
            addCriterion("row is not null");
            return (Criteria) this;
        }

        public Criteria andRowEqualTo(Integer value) {
            addCriterion("row =", value, "row");
            return (Criteria) this;
        }

        public Criteria andRowNotEqualTo(Integer value) {
            addCriterion("row <>", value, "row");
            return (Criteria) this;
        }

        public Criteria andRowGreaterThan(Integer value) {
            addCriterion("row >", value, "row");
            return (Criteria) this;
        }

        public Criteria andRowGreaterThanOrEqualTo(Integer value) {
            addCriterion("row >=", value, "row");
            return (Criteria) this;
        }

        public Criteria andRowLessThan(Integer value) {
            addCriterion("row <", value, "row");
            return (Criteria) this;
        }

        public Criteria andRowLessThanOrEqualTo(Integer value) {
            addCriterion("row <=", value, "row");
            return (Criteria) this;
        }

        public Criteria andRowIn(List<Integer> values) {
            addCriterion("row in", values, "row");
            return (Criteria) this;
        }

        public Criteria andRowNotIn(List<Integer> values) {
            addCriterion("row not in", values, "row");
            return (Criteria) this;
        }

        public Criteria andRowBetween(Integer value1, Integer value2) {
            addCriterion("row between", value1, value2, "row");
            return (Criteria) this;
        }

        public Criteria andRowNotBetween(Integer value1, Integer value2) {
            addCriterion("row not between", value1, value2, "row");
            return (Criteria) this;
        }

        public Criteria andColIsNull() {
            addCriterion("col is null");
            return (Criteria) this;
        }

        public Criteria andColIsNotNull() {
            addCriterion("col is not null");
            return (Criteria) this;
        }

        public Criteria andColEqualTo(Integer value) {
            addCriterion("col =", value, "col");
            return (Criteria) this;
        }

        public Criteria andColNotEqualTo(Integer value) {
            addCriterion("col <>", value, "col");
            return (Criteria) this;
        }

        public Criteria andColGreaterThan(Integer value) {
            addCriterion("col >", value, "col");
            return (Criteria) this;
        }

        public Criteria andColGreaterThanOrEqualTo(Integer value) {
            addCriterion("col >=", value, "col");
            return (Criteria) this;
        }

        public Criteria andColLessThan(Integer value) {
            addCriterion("col <", value, "col");
            return (Criteria) this;
        }

        public Criteria andColLessThanOrEqualTo(Integer value) {
            addCriterion("col <=", value, "col");
            return (Criteria) this;
        }

        public Criteria andColIn(List<Integer> values) {
            addCriterion("col in", values, "col");
            return (Criteria) this;
        }

        public Criteria andColNotIn(List<Integer> values) {
            addCriterion("col not in", values, "col");
            return (Criteria) this;
        }

        public Criteria andColBetween(Integer value1, Integer value2) {
            addCriterion("col between", value1, value2, "col");
            return (Criteria) this;
        }

        public Criteria andColNotBetween(Integer value1, Integer value2) {
            addCriterion("col not between", value1, value2, "col");
            return (Criteria) this;
        }

        public Criteria andLandcodeIsNull() {
            addCriterion("landcode is null");
            return (Criteria) this;
        }

        public Criteria andLandcodeIsNotNull() {
            addCriterion("landcode is not null");
            return (Criteria) this;
        }

        public Criteria andLandcodeEqualTo(String value) {
            addCriterion("landcode =", value, "landcode");
            return (Criteria) this;
        }

        public Criteria andLandcodeNotEqualTo(String value) {
            addCriterion("landcode <>", value, "landcode");
            return (Criteria) this;
        }

        public Criteria andLandcodeGreaterThan(String value) {
            addCriterion("landcode >", value, "landcode");
            return (Criteria) this;
        }

        public Criteria andLandcodeGreaterThanOrEqualTo(String value) {
            addCriterion("landcode >=", value, "landcode");
            return (Criteria) this;
        }

        public Criteria andLandcodeLessThan(String value) {
            addCriterion("landcode <", value, "landcode");
            return (Criteria) this;
        }

        public Criteria andLandcodeLessThanOrEqualTo(String value) {
            addCriterion("landcode <=", value, "landcode");
            return (Criteria) this;
        }

        public Criteria andLandcodeLike(String value) {
            addCriterion("landcode like", value, "landcode");
            return (Criteria) this;
        }

        public Criteria andLandcodeNotLike(String value) {
            addCriterion("landcode not like", value, "landcode");
            return (Criteria) this;
        }

        public Criteria andLandcodeIn(List<String> values) {
            addCriterion("landcode in", values, "landcode");
            return (Criteria) this;
        }

        public Criteria andLandcodeNotIn(List<String> values) {
            addCriterion("landcode not in", values, "landcode");
            return (Criteria) this;
        }

        public Criteria andLandcodeBetween(String value1, String value2) {
            addCriterion("landcode between", value1, value2, "landcode");
            return (Criteria) this;
        }

        public Criteria andLandcodeNotBetween(String value1, String value2) {
            addCriterion("landcode not between", value1, value2, "landcode");
            return (Criteria) this;
        }

        public Criteria andProportionIsNull() {
            addCriterion("proportion is null");
            return (Criteria) this;
        }

        public Criteria andProportionIsNotNull() {
            addCriterion("proportion is not null");
            return (Criteria) this;
        }

        public Criteria andProportionEqualTo(Double value) {
            addCriterion("proportion =", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionNotEqualTo(Double value) {
            addCriterion("proportion <>", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionGreaterThan(Double value) {
            addCriterion("proportion >", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionGreaterThanOrEqualTo(Double value) {
            addCriterion("proportion >=", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionLessThan(Double value) {
            addCriterion("proportion <", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionLessThanOrEqualTo(Double value) {
            addCriterion("proportion <=", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionIn(List<Double> values) {
            addCriterion("proportion in", values, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionNotIn(List<Double> values) {
            addCriterion("proportion not in", values, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionBetween(Double value1, Double value2) {
            addCriterion("proportion between", value1, value2, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionNotBetween(Double value1, Double value2) {
            addCriterion("proportion not between", value1, value2, "proportion");
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