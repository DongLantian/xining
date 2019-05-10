package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class GasrawmaterialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GasrawmaterialExample() {
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

        public Criteria andMaterialidIsNull() {
            addCriterion("materialid is null");
            return (Criteria) this;
        }

        public Criteria andMaterialidIsNotNull() {
            addCriterion("materialid is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialidEqualTo(Integer value) {
            addCriterion("materialid =", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidNotEqualTo(Integer value) {
            addCriterion("materialid <>", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidGreaterThan(Integer value) {
            addCriterion("materialid >", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidGreaterThanOrEqualTo(Integer value) {
            addCriterion("materialid >=", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidLessThan(Integer value) {
            addCriterion("materialid <", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidLessThanOrEqualTo(Integer value) {
            addCriterion("materialid <=", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidIn(List<Integer> values) {
            addCriterion("materialid in", values, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidNotIn(List<Integer> values) {
            addCriterion("materialid not in", values, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidBetween(Integer value1, Integer value2) {
            addCriterion("materialid between", value1, value2, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidNotBetween(Integer value1, Integer value2) {
            addCriterion("materialid not between", value1, value2, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialnameIsNull() {
            addCriterion("materialname is null");
            return (Criteria) this;
        }

        public Criteria andMaterialnameIsNotNull() {
            addCriterion("materialname is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialnameEqualTo(String value) {
            addCriterion("materialname =", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotEqualTo(String value) {
            addCriterion("materialname <>", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameGreaterThan(String value) {
            addCriterion("materialname >", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameGreaterThanOrEqualTo(String value) {
            addCriterion("materialname >=", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameLessThan(String value) {
            addCriterion("materialname <", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameLessThanOrEqualTo(String value) {
            addCriterion("materialname <=", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameLike(String value) {
            addCriterion("materialname like", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotLike(String value) {
            addCriterion("materialname not like", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameIn(List<String> values) {
            addCriterion("materialname in", values, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotIn(List<String> values) {
            addCriterion("materialname not in", values, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameBetween(String value1, String value2) {
            addCriterion("materialname between", value1, value2, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotBetween(String value1, String value2) {
            addCriterion("materialname not between", value1, value2, "materialname");
            return (Criteria) this;
        }

        public Criteria andProcessIsNull() {
            addCriterion("process is null");
            return (Criteria) this;
        }

        public Criteria andProcessIsNotNull() {
            addCriterion("process is not null");
            return (Criteria) this;
        }

        public Criteria andProcessEqualTo(String value) {
            addCriterion("process =", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotEqualTo(String value) {
            addCriterion("process <>", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessGreaterThan(String value) {
            addCriterion("process >", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessGreaterThanOrEqualTo(String value) {
            addCriterion("process >=", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessLessThan(String value) {
            addCriterion("process <", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessLessThanOrEqualTo(String value) {
            addCriterion("process <=", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessLike(String value) {
            addCriterion("process like", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotLike(String value) {
            addCriterion("process not like", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessIn(List<String> values) {
            addCriterion("process in", values, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotIn(List<String> values) {
            addCriterion("process not in", values, "process");
            return (Criteria) this;
        }

        public Criteria andProcessBetween(String value1, String value2) {
            addCriterion("process between", value1, value2, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotBetween(String value1, String value2) {
            addCriterion("process not between", value1, value2, "process");
            return (Criteria) this;
        }

        public Criteria andRawproductionIsNull() {
            addCriterion("rawproduction is null");
            return (Criteria) this;
        }

        public Criteria andRawproductionIsNotNull() {
            addCriterion("rawproduction is not null");
            return (Criteria) this;
        }

        public Criteria andRawproductionEqualTo(Double value) {
            addCriterion("rawproduction =", value, "rawproduction");
            return (Criteria) this;
        }

        public Criteria andRawproductionNotEqualTo(Double value) {
            addCriterion("rawproduction <>", value, "rawproduction");
            return (Criteria) this;
        }

        public Criteria andRawproductionGreaterThan(Double value) {
            addCriterion("rawproduction >", value, "rawproduction");
            return (Criteria) this;
        }

        public Criteria andRawproductionGreaterThanOrEqualTo(Double value) {
            addCriterion("rawproduction >=", value, "rawproduction");
            return (Criteria) this;
        }

        public Criteria andRawproductionLessThan(Double value) {
            addCriterion("rawproduction <", value, "rawproduction");
            return (Criteria) this;
        }

        public Criteria andRawproductionLessThanOrEqualTo(Double value) {
            addCriterion("rawproduction <=", value, "rawproduction");
            return (Criteria) this;
        }

        public Criteria andRawproductionIn(List<Double> values) {
            addCriterion("rawproduction in", values, "rawproduction");
            return (Criteria) this;
        }

        public Criteria andRawproductionNotIn(List<Double> values) {
            addCriterion("rawproduction not in", values, "rawproduction");
            return (Criteria) this;
        }

        public Criteria andRawproductionBetween(Double value1, Double value2) {
            addCriterion("rawproduction between", value1, value2, "rawproduction");
            return (Criteria) this;
        }

        public Criteria andRawproductionNotBetween(Double value1, Double value2) {
            addCriterion("rawproduction not between", value1, value2, "rawproduction");
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

        public Criteria andGassurveyidIsNull() {
            addCriterion("gassurveyid is null");
            return (Criteria) this;
        }

        public Criteria andGassurveyidIsNotNull() {
            addCriterion("gassurveyid is not null");
            return (Criteria) this;
        }

        public Criteria andGassurveyidEqualTo(Integer value) {
            addCriterion("gassurveyid =", value, "gassurveyid");
            return (Criteria) this;
        }

        public Criteria andGassurveyidNotEqualTo(Integer value) {
            addCriterion("gassurveyid <>", value, "gassurveyid");
            return (Criteria) this;
        }

        public Criteria andGassurveyidGreaterThan(Integer value) {
            addCriterion("gassurveyid >", value, "gassurveyid");
            return (Criteria) this;
        }

        public Criteria andGassurveyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gassurveyid >=", value, "gassurveyid");
            return (Criteria) this;
        }

        public Criteria andGassurveyidLessThan(Integer value) {
            addCriterion("gassurveyid <", value, "gassurveyid");
            return (Criteria) this;
        }

        public Criteria andGassurveyidLessThanOrEqualTo(Integer value) {
            addCriterion("gassurveyid <=", value, "gassurveyid");
            return (Criteria) this;
        }

        public Criteria andGassurveyidIn(List<Integer> values) {
            addCriterion("gassurveyid in", values, "gassurveyid");
            return (Criteria) this;
        }

        public Criteria andGassurveyidNotIn(List<Integer> values) {
            addCriterion("gassurveyid not in", values, "gassurveyid");
            return (Criteria) this;
        }

        public Criteria andGassurveyidBetween(Integer value1, Integer value2) {
            addCriterion("gassurveyid between", value1, value2, "gassurveyid");
            return (Criteria) this;
        }

        public Criteria andGassurveyidNotBetween(Integer value1, Integer value2) {
            addCriterion("gassurveyid not between", value1, value2, "gassurveyid");
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