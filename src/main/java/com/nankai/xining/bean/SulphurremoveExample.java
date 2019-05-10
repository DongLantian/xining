package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class SulphurremoveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SulphurremoveExample() {
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

        public Criteria andSulphurRemoveIdIsNull() {
            addCriterion("sulphur_remove_id is null");
            return (Criteria) this;
        }

        public Criteria andSulphurRemoveIdIsNotNull() {
            addCriterion("sulphur_remove_id is not null");
            return (Criteria) this;
        }

        public Criteria andSulphurRemoveIdEqualTo(String value) {
            addCriterion("sulphur_remove_id =", value, "sulphurRemoveId");
            return (Criteria) this;
        }

        public Criteria andSulphurRemoveIdNotEqualTo(String value) {
            addCriterion("sulphur_remove_id <>", value, "sulphurRemoveId");
            return (Criteria) this;
        }

        public Criteria andSulphurRemoveIdGreaterThan(String value) {
            addCriterion("sulphur_remove_id >", value, "sulphurRemoveId");
            return (Criteria) this;
        }

        public Criteria andSulphurRemoveIdGreaterThanOrEqualTo(String value) {
            addCriterion("sulphur_remove_id >=", value, "sulphurRemoveId");
            return (Criteria) this;
        }

        public Criteria andSulphurRemoveIdLessThan(String value) {
            addCriterion("sulphur_remove_id <", value, "sulphurRemoveId");
            return (Criteria) this;
        }

        public Criteria andSulphurRemoveIdLessThanOrEqualTo(String value) {
            addCriterion("sulphur_remove_id <=", value, "sulphurRemoveId");
            return (Criteria) this;
        }

        public Criteria andSulphurRemoveIdLike(String value) {
            addCriterion("sulphur_remove_id like", value, "sulphurRemoveId");
            return (Criteria) this;
        }

        public Criteria andSulphurRemoveIdNotLike(String value) {
            addCriterion("sulphur_remove_id not like", value, "sulphurRemoveId");
            return (Criteria) this;
        }

        public Criteria andSulphurRemoveIdIn(List<String> values) {
            addCriterion("sulphur_remove_id in", values, "sulphurRemoveId");
            return (Criteria) this;
        }

        public Criteria andSulphurRemoveIdNotIn(List<String> values) {
            addCriterion("sulphur_remove_id not in", values, "sulphurRemoveId");
            return (Criteria) this;
        }

        public Criteria andSulphurRemoveIdBetween(String value1, String value2) {
            addCriterion("sulphur_remove_id between", value1, value2, "sulphurRemoveId");
            return (Criteria) this;
        }

        public Criteria andSulphurRemoveIdNotBetween(String value1, String value2) {
            addCriterion("sulphur_remove_id not between", value1, value2, "sulphurRemoveId");
            return (Criteria) this;
        }

        public Criteria andSulphurClassifyIsNull() {
            addCriterion("sulphur_classify is null");
            return (Criteria) this;
        }

        public Criteria andSulphurClassifyIsNotNull() {
            addCriterion("sulphur_classify is not null");
            return (Criteria) this;
        }

        public Criteria andSulphurClassifyEqualTo(String value) {
            addCriterion("sulphur_classify =", value, "sulphurClassify");
            return (Criteria) this;
        }

        public Criteria andSulphurClassifyNotEqualTo(String value) {
            addCriterion("sulphur_classify <>", value, "sulphurClassify");
            return (Criteria) this;
        }

        public Criteria andSulphurClassifyGreaterThan(String value) {
            addCriterion("sulphur_classify >", value, "sulphurClassify");
            return (Criteria) this;
        }

        public Criteria andSulphurClassifyGreaterThanOrEqualTo(String value) {
            addCriterion("sulphur_classify >=", value, "sulphurClassify");
            return (Criteria) this;
        }

        public Criteria andSulphurClassifyLessThan(String value) {
            addCriterion("sulphur_classify <", value, "sulphurClassify");
            return (Criteria) this;
        }

        public Criteria andSulphurClassifyLessThanOrEqualTo(String value) {
            addCriterion("sulphur_classify <=", value, "sulphurClassify");
            return (Criteria) this;
        }

        public Criteria andSulphurClassifyLike(String value) {
            addCriterion("sulphur_classify like", value, "sulphurClassify");
            return (Criteria) this;
        }

        public Criteria andSulphurClassifyNotLike(String value) {
            addCriterion("sulphur_classify not like", value, "sulphurClassify");
            return (Criteria) this;
        }

        public Criteria andSulphurClassifyIn(List<String> values) {
            addCriterion("sulphur_classify in", values, "sulphurClassify");
            return (Criteria) this;
        }

        public Criteria andSulphurClassifyNotIn(List<String> values) {
            addCriterion("sulphur_classify not in", values, "sulphurClassify");
            return (Criteria) this;
        }

        public Criteria andSulphurClassifyBetween(String value1, String value2) {
            addCriterion("sulphur_classify between", value1, value2, "sulphurClassify");
            return (Criteria) this;
        }

        public Criteria andSulphurClassifyNotBetween(String value1, String value2) {
            addCriterion("sulphur_classify not between", value1, value2, "sulphurClassify");
            return (Criteria) this;
        }

        public Criteria andSulphurMethodIsNull() {
            addCriterion("sulphur_method is null");
            return (Criteria) this;
        }

        public Criteria andSulphurMethodIsNotNull() {
            addCriterion("sulphur_method is not null");
            return (Criteria) this;
        }

        public Criteria andSulphurMethodEqualTo(String value) {
            addCriterion("sulphur_method =", value, "sulphurMethod");
            return (Criteria) this;
        }

        public Criteria andSulphurMethodNotEqualTo(String value) {
            addCriterion("sulphur_method <>", value, "sulphurMethod");
            return (Criteria) this;
        }

        public Criteria andSulphurMethodGreaterThan(String value) {
            addCriterion("sulphur_method >", value, "sulphurMethod");
            return (Criteria) this;
        }

        public Criteria andSulphurMethodGreaterThanOrEqualTo(String value) {
            addCriterion("sulphur_method >=", value, "sulphurMethod");
            return (Criteria) this;
        }

        public Criteria andSulphurMethodLessThan(String value) {
            addCriterion("sulphur_method <", value, "sulphurMethod");
            return (Criteria) this;
        }

        public Criteria andSulphurMethodLessThanOrEqualTo(String value) {
            addCriterion("sulphur_method <=", value, "sulphurMethod");
            return (Criteria) this;
        }

        public Criteria andSulphurMethodLike(String value) {
            addCriterion("sulphur_method like", value, "sulphurMethod");
            return (Criteria) this;
        }

        public Criteria andSulphurMethodNotLike(String value) {
            addCriterion("sulphur_method not like", value, "sulphurMethod");
            return (Criteria) this;
        }

        public Criteria andSulphurMethodIn(List<String> values) {
            addCriterion("sulphur_method in", values, "sulphurMethod");
            return (Criteria) this;
        }

        public Criteria andSulphurMethodNotIn(List<String> values) {
            addCriterion("sulphur_method not in", values, "sulphurMethod");
            return (Criteria) this;
        }

        public Criteria andSulphurMethodBetween(String value1, String value2) {
            addCriterion("sulphur_method between", value1, value2, "sulphurMethod");
            return (Criteria) this;
        }

        public Criteria andSulphurMethodNotBetween(String value1, String value2) {
            addCriterion("sulphur_method not between", value1, value2, "sulphurMethod");
            return (Criteria) this;
        }

        public Criteria andSulphurRemoveEffiIsNull() {
            addCriterion("sulphur_remove_effi is null");
            return (Criteria) this;
        }

        public Criteria andSulphurRemoveEffiIsNotNull() {
            addCriterion("sulphur_remove_effi is not null");
            return (Criteria) this;
        }

        public Criteria andSulphurRemoveEffiEqualTo(Double value) {
            addCriterion("sulphur_remove_effi =", value, "sulphurRemoveEffi");
            return (Criteria) this;
        }

        public Criteria andSulphurRemoveEffiNotEqualTo(Double value) {
            addCriterion("sulphur_remove_effi <>", value, "sulphurRemoveEffi");
            return (Criteria) this;
        }

        public Criteria andSulphurRemoveEffiGreaterThan(Double value) {
            addCriterion("sulphur_remove_effi >", value, "sulphurRemoveEffi");
            return (Criteria) this;
        }

        public Criteria andSulphurRemoveEffiGreaterThanOrEqualTo(Double value) {
            addCriterion("sulphur_remove_effi >=", value, "sulphurRemoveEffi");
            return (Criteria) this;
        }

        public Criteria andSulphurRemoveEffiLessThan(Double value) {
            addCriterion("sulphur_remove_effi <", value, "sulphurRemoveEffi");
            return (Criteria) this;
        }

        public Criteria andSulphurRemoveEffiLessThanOrEqualTo(Double value) {
            addCriterion("sulphur_remove_effi <=", value, "sulphurRemoveEffi");
            return (Criteria) this;
        }

        public Criteria andSulphurRemoveEffiIn(List<Double> values) {
            addCriterion("sulphur_remove_effi in", values, "sulphurRemoveEffi");
            return (Criteria) this;
        }

        public Criteria andSulphurRemoveEffiNotIn(List<Double> values) {
            addCriterion("sulphur_remove_effi not in", values, "sulphurRemoveEffi");
            return (Criteria) this;
        }

        public Criteria andSulphurRemoveEffiBetween(Double value1, Double value2) {
            addCriterion("sulphur_remove_effi between", value1, value2, "sulphurRemoveEffi");
            return (Criteria) this;
        }

        public Criteria andSulphurRemoveEffiNotBetween(Double value1, Double value2) {
            addCriterion("sulphur_remove_effi not between", value1, value2, "sulphurRemoveEffi");
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