package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class NitreremoveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NitreremoveExample() {
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

        public Criteria andNitreRemoveIdIsNull() {
            addCriterion("nitre_remove_id is null");
            return (Criteria) this;
        }

        public Criteria andNitreRemoveIdIsNotNull() {
            addCriterion("nitre_remove_id is not null");
            return (Criteria) this;
        }

        public Criteria andNitreRemoveIdEqualTo(String value) {
            addCriterion("nitre_remove_id =", value, "nitreRemoveId");
            return (Criteria) this;
        }

        public Criteria andNitreRemoveIdNotEqualTo(String value) {
            addCriterion("nitre_remove_id <>", value, "nitreRemoveId");
            return (Criteria) this;
        }

        public Criteria andNitreRemoveIdGreaterThan(String value) {
            addCriterion("nitre_remove_id >", value, "nitreRemoveId");
            return (Criteria) this;
        }

        public Criteria andNitreRemoveIdGreaterThanOrEqualTo(String value) {
            addCriterion("nitre_remove_id >=", value, "nitreRemoveId");
            return (Criteria) this;
        }

        public Criteria andNitreRemoveIdLessThan(String value) {
            addCriterion("nitre_remove_id <", value, "nitreRemoveId");
            return (Criteria) this;
        }

        public Criteria andNitreRemoveIdLessThanOrEqualTo(String value) {
            addCriterion("nitre_remove_id <=", value, "nitreRemoveId");
            return (Criteria) this;
        }

        public Criteria andNitreRemoveIdLike(String value) {
            addCriterion("nitre_remove_id like", value, "nitreRemoveId");
            return (Criteria) this;
        }

        public Criteria andNitreRemoveIdNotLike(String value) {
            addCriterion("nitre_remove_id not like", value, "nitreRemoveId");
            return (Criteria) this;
        }

        public Criteria andNitreRemoveIdIn(List<String> values) {
            addCriterion("nitre_remove_id in", values, "nitreRemoveId");
            return (Criteria) this;
        }

        public Criteria andNitreRemoveIdNotIn(List<String> values) {
            addCriterion("nitre_remove_id not in", values, "nitreRemoveId");
            return (Criteria) this;
        }

        public Criteria andNitreRemoveIdBetween(String value1, String value2) {
            addCriterion("nitre_remove_id between", value1, value2, "nitreRemoveId");
            return (Criteria) this;
        }

        public Criteria andNitreRemoveIdNotBetween(String value1, String value2) {
            addCriterion("nitre_remove_id not between", value1, value2, "nitreRemoveId");
            return (Criteria) this;
        }

        public Criteria andNitreMethodIsNull() {
            addCriterion("nitre_method is null");
            return (Criteria) this;
        }

        public Criteria andNitreMethodIsNotNull() {
            addCriterion("nitre_method is not null");
            return (Criteria) this;
        }

        public Criteria andNitreMethodEqualTo(String value) {
            addCriterion("nitre_method =", value, "nitreMethod");
            return (Criteria) this;
        }

        public Criteria andNitreMethodNotEqualTo(String value) {
            addCriterion("nitre_method <>", value, "nitreMethod");
            return (Criteria) this;
        }

        public Criteria andNitreMethodGreaterThan(String value) {
            addCriterion("nitre_method >", value, "nitreMethod");
            return (Criteria) this;
        }

        public Criteria andNitreMethodGreaterThanOrEqualTo(String value) {
            addCriterion("nitre_method >=", value, "nitreMethod");
            return (Criteria) this;
        }

        public Criteria andNitreMethodLessThan(String value) {
            addCriterion("nitre_method <", value, "nitreMethod");
            return (Criteria) this;
        }

        public Criteria andNitreMethodLessThanOrEqualTo(String value) {
            addCriterion("nitre_method <=", value, "nitreMethod");
            return (Criteria) this;
        }

        public Criteria andNitreMethodLike(String value) {
            addCriterion("nitre_method like", value, "nitreMethod");
            return (Criteria) this;
        }

        public Criteria andNitreMethodNotLike(String value) {
            addCriterion("nitre_method not like", value, "nitreMethod");
            return (Criteria) this;
        }

        public Criteria andNitreMethodIn(List<String> values) {
            addCriterion("nitre_method in", values, "nitreMethod");
            return (Criteria) this;
        }

        public Criteria andNitreMethodNotIn(List<String> values) {
            addCriterion("nitre_method not in", values, "nitreMethod");
            return (Criteria) this;
        }

        public Criteria andNitreMethodBetween(String value1, String value2) {
            addCriterion("nitre_method between", value1, value2, "nitreMethod");
            return (Criteria) this;
        }

        public Criteria andNitreMethodNotBetween(String value1, String value2) {
            addCriterion("nitre_method not between", value1, value2, "nitreMethod");
            return (Criteria) this;
        }

        public Criteria andNoxRemoveEffiIsNull() {
            addCriterion("NOX_remove_effi is null");
            return (Criteria) this;
        }

        public Criteria andNoxRemoveEffiIsNotNull() {
            addCriterion("NOX_remove_effi is not null");
            return (Criteria) this;
        }

        public Criteria andNoxRemoveEffiEqualTo(Double value) {
            addCriterion("NOX_remove_effi =", value, "noxRemoveEffi");
            return (Criteria) this;
        }

        public Criteria andNoxRemoveEffiNotEqualTo(Double value) {
            addCriterion("NOX_remove_effi <>", value, "noxRemoveEffi");
            return (Criteria) this;
        }

        public Criteria andNoxRemoveEffiGreaterThan(Double value) {
            addCriterion("NOX_remove_effi >", value, "noxRemoveEffi");
            return (Criteria) this;
        }

        public Criteria andNoxRemoveEffiGreaterThanOrEqualTo(Double value) {
            addCriterion("NOX_remove_effi >=", value, "noxRemoveEffi");
            return (Criteria) this;
        }

        public Criteria andNoxRemoveEffiLessThan(Double value) {
            addCriterion("NOX_remove_effi <", value, "noxRemoveEffi");
            return (Criteria) this;
        }

        public Criteria andNoxRemoveEffiLessThanOrEqualTo(Double value) {
            addCriterion("NOX_remove_effi <=", value, "noxRemoveEffi");
            return (Criteria) this;
        }

        public Criteria andNoxRemoveEffiIn(List<Double> values) {
            addCriterion("NOX_remove_effi in", values, "noxRemoveEffi");
            return (Criteria) this;
        }

        public Criteria andNoxRemoveEffiNotIn(List<Double> values) {
            addCriterion("NOX_remove_effi not in", values, "noxRemoveEffi");
            return (Criteria) this;
        }

        public Criteria andNoxRemoveEffiBetween(Double value1, Double value2) {
            addCriterion("NOX_remove_effi between", value1, value2, "noxRemoveEffi");
            return (Criteria) this;
        }

        public Criteria andNoxRemoveEffiNotBetween(Double value1, Double value2) {
            addCriterion("NOX_remove_effi not between", value1, value2, "noxRemoveEffi");
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