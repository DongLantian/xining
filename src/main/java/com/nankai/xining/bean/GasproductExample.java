package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class GasproductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GasproductExample() {
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

        public Criteria andProductidIsNull() {
            addCriterion("productid is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productid is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Integer value) {
            addCriterion("productid =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Integer value) {
            addCriterion("productid <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Integer value) {
            addCriterion("productid >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productid >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Integer value) {
            addCriterion("productid <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Integer value) {
            addCriterion("productid <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Integer> values) {
            addCriterion("productid in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Integer> values) {
            addCriterion("productid not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Integer value1, Integer value2) {
            addCriterion("productid between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Integer value1, Integer value2) {
            addCriterion("productid not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNull() {
            addCriterion("productname is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("productname is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("productname =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("productname <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("productname >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("productname >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("productname <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("productname <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("productname like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("productname not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("productname in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("productname not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("productname between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("productname not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andDownprocessIsNull() {
            addCriterion("downprocess is null");
            return (Criteria) this;
        }

        public Criteria andDownprocessIsNotNull() {
            addCriterion("downprocess is not null");
            return (Criteria) this;
        }

        public Criteria andDownprocessEqualTo(String value) {
            addCriterion("downprocess =", value, "downprocess");
            return (Criteria) this;
        }

        public Criteria andDownprocessNotEqualTo(String value) {
            addCriterion("downprocess <>", value, "downprocess");
            return (Criteria) this;
        }

        public Criteria andDownprocessGreaterThan(String value) {
            addCriterion("downprocess >", value, "downprocess");
            return (Criteria) this;
        }

        public Criteria andDownprocessGreaterThanOrEqualTo(String value) {
            addCriterion("downprocess >=", value, "downprocess");
            return (Criteria) this;
        }

        public Criteria andDownprocessLessThan(String value) {
            addCriterion("downprocess <", value, "downprocess");
            return (Criteria) this;
        }

        public Criteria andDownprocessLessThanOrEqualTo(String value) {
            addCriterion("downprocess <=", value, "downprocess");
            return (Criteria) this;
        }

        public Criteria andDownprocessLike(String value) {
            addCriterion("downprocess like", value, "downprocess");
            return (Criteria) this;
        }

        public Criteria andDownprocessNotLike(String value) {
            addCriterion("downprocess not like", value, "downprocess");
            return (Criteria) this;
        }

        public Criteria andDownprocessIn(List<String> values) {
            addCriterion("downprocess in", values, "downprocess");
            return (Criteria) this;
        }

        public Criteria andDownprocessNotIn(List<String> values) {
            addCriterion("downprocess not in", values, "downprocess");
            return (Criteria) this;
        }

        public Criteria andDownprocessBetween(String value1, String value2) {
            addCriterion("downprocess between", value1, value2, "downprocess");
            return (Criteria) this;
        }

        public Criteria andDownprocessNotBetween(String value1, String value2) {
            addCriterion("downprocess not between", value1, value2, "downprocess");
            return (Criteria) this;
        }

        public Criteria andConsumptionIsNull() {
            addCriterion("consumption is null");
            return (Criteria) this;
        }

        public Criteria andConsumptionIsNotNull() {
            addCriterion("consumption is not null");
            return (Criteria) this;
        }

        public Criteria andConsumptionEqualTo(Double value) {
            addCriterion("consumption =", value, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionNotEqualTo(Double value) {
            addCriterion("consumption <>", value, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionGreaterThan(Double value) {
            addCriterion("consumption >", value, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionGreaterThanOrEqualTo(Double value) {
            addCriterion("consumption >=", value, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionLessThan(Double value) {
            addCriterion("consumption <", value, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionLessThanOrEqualTo(Double value) {
            addCriterion("consumption <=", value, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionIn(List<Double> values) {
            addCriterion("consumption in", values, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionNotIn(List<Double> values) {
            addCriterion("consumption not in", values, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionBetween(Double value1, Double value2) {
            addCriterion("consumption between", value1, value2, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionNotBetween(Double value1, Double value2) {
            addCriterion("consumption not between", value1, value2, "consumption");
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