package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class LanduseinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LanduseinfoExample() {
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

        public Criteria andLandnameIsNull() {
            addCriterion("landname is null");
            return (Criteria) this;
        }

        public Criteria andLandnameIsNotNull() {
            addCriterion("landname is not null");
            return (Criteria) this;
        }

        public Criteria andLandnameEqualTo(String value) {
            addCriterion("landname =", value, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameNotEqualTo(String value) {
            addCriterion("landname <>", value, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameGreaterThan(String value) {
            addCriterion("landname >", value, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameGreaterThanOrEqualTo(String value) {
            addCriterion("landname >=", value, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameLessThan(String value) {
            addCriterion("landname <", value, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameLessThanOrEqualTo(String value) {
            addCriterion("landname <=", value, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameLike(String value) {
            addCriterion("landname like", value, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameNotLike(String value) {
            addCriterion("landname not like", value, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameIn(List<String> values) {
            addCriterion("landname in", values, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameNotIn(List<String> values) {
            addCriterion("landname not in", values, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameBetween(String value1, String value2) {
            addCriterion("landname between", value1, value2, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameNotBetween(String value1, String value2) {
            addCriterion("landname not between", value1, value2, "landname");
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