package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class ProfileNoxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProfileNoxExample() {
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

        public Criteria andNoxIdIsNull() {
            addCriterion("NOX_ID is null");
            return (Criteria) this;
        }

        public Criteria andNoxIdIsNotNull() {
            addCriterion("NOX_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNoxIdEqualTo(Integer value) {
            addCriterion("NOX_ID =", value, "noxId");
            return (Criteria) this;
        }

        public Criteria andNoxIdNotEqualTo(Integer value) {
            addCriterion("NOX_ID <>", value, "noxId");
            return (Criteria) this;
        }

        public Criteria andNoxIdGreaterThan(Integer value) {
            addCriterion("NOX_ID >", value, "noxId");
            return (Criteria) this;
        }

        public Criteria andNoxIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("NOX_ID >=", value, "noxId");
            return (Criteria) this;
        }

        public Criteria andNoxIdLessThan(Integer value) {
            addCriterion("NOX_ID <", value, "noxId");
            return (Criteria) this;
        }

        public Criteria andNoxIdLessThanOrEqualTo(Integer value) {
            addCriterion("NOX_ID <=", value, "noxId");
            return (Criteria) this;
        }

        public Criteria andNoxIdIn(List<Integer> values) {
            addCriterion("NOX_ID in", values, "noxId");
            return (Criteria) this;
        }

        public Criteria andNoxIdNotIn(List<Integer> values) {
            addCriterion("NOX_ID not in", values, "noxId");
            return (Criteria) this;
        }

        public Criteria andNoxIdBetween(Integer value1, Integer value2) {
            addCriterion("NOX_ID between", value1, value2, "noxId");
            return (Criteria) this;
        }

        public Criteria andNoxIdNotBetween(Integer value1, Integer value2) {
            addCriterion("NOX_ID not between", value1, value2, "noxId");
            return (Criteria) this;
        }

        public Criteria andNoMolecularIsNull() {
            addCriterion("NO_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andNoMolecularIsNotNull() {
            addCriterion("NO_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andNoMolecularEqualTo(Double value) {
            addCriterion("NO_MOLECULAR =", value, "noMolecular");
            return (Criteria) this;
        }

        public Criteria andNoMolecularNotEqualTo(Double value) {
            addCriterion("NO_MOLECULAR <>", value, "noMolecular");
            return (Criteria) this;
        }

        public Criteria andNoMolecularGreaterThan(Double value) {
            addCriterion("NO_MOLECULAR >", value, "noMolecular");
            return (Criteria) this;
        }

        public Criteria andNoMolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("NO_MOLECULAR >=", value, "noMolecular");
            return (Criteria) this;
        }

        public Criteria andNoMolecularLessThan(Double value) {
            addCriterion("NO_MOLECULAR <", value, "noMolecular");
            return (Criteria) this;
        }

        public Criteria andNoMolecularLessThanOrEqualTo(Double value) {
            addCriterion("NO_MOLECULAR <=", value, "noMolecular");
            return (Criteria) this;
        }

        public Criteria andNoMolecularIn(List<Double> values) {
            addCriterion("NO_MOLECULAR in", values, "noMolecular");
            return (Criteria) this;
        }

        public Criteria andNoMolecularNotIn(List<Double> values) {
            addCriterion("NO_MOLECULAR not in", values, "noMolecular");
            return (Criteria) this;
        }

        public Criteria andNoMolecularBetween(Double value1, Double value2) {
            addCriterion("NO_MOLECULAR between", value1, value2, "noMolecular");
            return (Criteria) this;
        }

        public Criteria andNoMolecularNotBetween(Double value1, Double value2) {
            addCriterion("NO_MOLECULAR not between", value1, value2, "noMolecular");
            return (Criteria) this;
        }

        public Criteria andNoDenominatorIsNull() {
            addCriterion("NO_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andNoDenominatorIsNotNull() {
            addCriterion("NO_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andNoDenominatorEqualTo(Double value) {
            addCriterion("NO_DENOMINATOR =", value, "noDenominator");
            return (Criteria) this;
        }

        public Criteria andNoDenominatorNotEqualTo(Double value) {
            addCriterion("NO_DENOMINATOR <>", value, "noDenominator");
            return (Criteria) this;
        }

        public Criteria andNoDenominatorGreaterThan(Double value) {
            addCriterion("NO_DENOMINATOR >", value, "noDenominator");
            return (Criteria) this;
        }

        public Criteria andNoDenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("NO_DENOMINATOR >=", value, "noDenominator");
            return (Criteria) this;
        }

        public Criteria andNoDenominatorLessThan(Double value) {
            addCriterion("NO_DENOMINATOR <", value, "noDenominator");
            return (Criteria) this;
        }

        public Criteria andNoDenominatorLessThanOrEqualTo(Double value) {
            addCriterion("NO_DENOMINATOR <=", value, "noDenominator");
            return (Criteria) this;
        }

        public Criteria andNoDenominatorIn(List<Double> values) {
            addCriterion("NO_DENOMINATOR in", values, "noDenominator");
            return (Criteria) this;
        }

        public Criteria andNoDenominatorNotIn(List<Double> values) {
            addCriterion("NO_DENOMINATOR not in", values, "noDenominator");
            return (Criteria) this;
        }

        public Criteria andNoDenominatorBetween(Double value1, Double value2) {
            addCriterion("NO_DENOMINATOR between", value1, value2, "noDenominator");
            return (Criteria) this;
        }

        public Criteria andNoDenominatorNotBetween(Double value1, Double value2) {
            addCriterion("NO_DENOMINATOR not between", value1, value2, "noDenominator");
            return (Criteria) this;
        }

        public Criteria andNoRateIsNull() {
            addCriterion("NO_RATE is null");
            return (Criteria) this;
        }

        public Criteria andNoRateIsNotNull() {
            addCriterion("NO_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andNoRateEqualTo(Double value) {
            addCriterion("NO_RATE =", value, "noRate");
            return (Criteria) this;
        }

        public Criteria andNoRateNotEqualTo(Double value) {
            addCriterion("NO_RATE <>", value, "noRate");
            return (Criteria) this;
        }

        public Criteria andNoRateGreaterThan(Double value) {
            addCriterion("NO_RATE >", value, "noRate");
            return (Criteria) this;
        }

        public Criteria andNoRateGreaterThanOrEqualTo(Double value) {
            addCriterion("NO_RATE >=", value, "noRate");
            return (Criteria) this;
        }

        public Criteria andNoRateLessThan(Double value) {
            addCriterion("NO_RATE <", value, "noRate");
            return (Criteria) this;
        }

        public Criteria andNoRateLessThanOrEqualTo(Double value) {
            addCriterion("NO_RATE <=", value, "noRate");
            return (Criteria) this;
        }

        public Criteria andNoRateIn(List<Double> values) {
            addCriterion("NO_RATE in", values, "noRate");
            return (Criteria) this;
        }

        public Criteria andNoRateNotIn(List<Double> values) {
            addCriterion("NO_RATE not in", values, "noRate");
            return (Criteria) this;
        }

        public Criteria andNoRateBetween(Double value1, Double value2) {
            addCriterion("NO_RATE between", value1, value2, "noRate");
            return (Criteria) this;
        }

        public Criteria andNoRateNotBetween(Double value1, Double value2) {
            addCriterion("NO_RATE not between", value1, value2, "noRate");
            return (Criteria) this;
        }

        public Criteria andNo2MolecularIsNull() {
            addCriterion("NO2_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andNo2MolecularIsNotNull() {
            addCriterion("NO2_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andNo2MolecularEqualTo(Double value) {
            addCriterion("NO2_MOLECULAR =", value, "no2Molecular");
            return (Criteria) this;
        }

        public Criteria andNo2MolecularNotEqualTo(Double value) {
            addCriterion("NO2_MOLECULAR <>", value, "no2Molecular");
            return (Criteria) this;
        }

        public Criteria andNo2MolecularGreaterThan(Double value) {
            addCriterion("NO2_MOLECULAR >", value, "no2Molecular");
            return (Criteria) this;
        }

        public Criteria andNo2MolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("NO2_MOLECULAR >=", value, "no2Molecular");
            return (Criteria) this;
        }

        public Criteria andNo2MolecularLessThan(Double value) {
            addCriterion("NO2_MOLECULAR <", value, "no2Molecular");
            return (Criteria) this;
        }

        public Criteria andNo2MolecularLessThanOrEqualTo(Double value) {
            addCriterion("NO2_MOLECULAR <=", value, "no2Molecular");
            return (Criteria) this;
        }

        public Criteria andNo2MolecularIn(List<Double> values) {
            addCriterion("NO2_MOLECULAR in", values, "no2Molecular");
            return (Criteria) this;
        }

        public Criteria andNo2MolecularNotIn(List<Double> values) {
            addCriterion("NO2_MOLECULAR not in", values, "no2Molecular");
            return (Criteria) this;
        }

        public Criteria andNo2MolecularBetween(Double value1, Double value2) {
            addCriterion("NO2_MOLECULAR between", value1, value2, "no2Molecular");
            return (Criteria) this;
        }

        public Criteria andNo2MolecularNotBetween(Double value1, Double value2) {
            addCriterion("NO2_MOLECULAR not between", value1, value2, "no2Molecular");
            return (Criteria) this;
        }

        public Criteria andNo2DenominatorIsNull() {
            addCriterion("NO2_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andNo2DenominatorIsNotNull() {
            addCriterion("NO2_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andNo2DenominatorEqualTo(Double value) {
            addCriterion("NO2_DENOMINATOR =", value, "no2Denominator");
            return (Criteria) this;
        }

        public Criteria andNo2DenominatorNotEqualTo(Double value) {
            addCriterion("NO2_DENOMINATOR <>", value, "no2Denominator");
            return (Criteria) this;
        }

        public Criteria andNo2DenominatorGreaterThan(Double value) {
            addCriterion("NO2_DENOMINATOR >", value, "no2Denominator");
            return (Criteria) this;
        }

        public Criteria andNo2DenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("NO2_DENOMINATOR >=", value, "no2Denominator");
            return (Criteria) this;
        }

        public Criteria andNo2DenominatorLessThan(Double value) {
            addCriterion("NO2_DENOMINATOR <", value, "no2Denominator");
            return (Criteria) this;
        }

        public Criteria andNo2DenominatorLessThanOrEqualTo(Double value) {
            addCriterion("NO2_DENOMINATOR <=", value, "no2Denominator");
            return (Criteria) this;
        }

        public Criteria andNo2DenominatorIn(List<Double> values) {
            addCriterion("NO2_DENOMINATOR in", values, "no2Denominator");
            return (Criteria) this;
        }

        public Criteria andNo2DenominatorNotIn(List<Double> values) {
            addCriterion("NO2_DENOMINATOR not in", values, "no2Denominator");
            return (Criteria) this;
        }

        public Criteria andNo2DenominatorBetween(Double value1, Double value2) {
            addCriterion("NO2_DENOMINATOR between", value1, value2, "no2Denominator");
            return (Criteria) this;
        }

        public Criteria andNo2DenominatorNotBetween(Double value1, Double value2) {
            addCriterion("NO2_DENOMINATOR not between", value1, value2, "no2Denominator");
            return (Criteria) this;
        }

        public Criteria andNo2RateIsNull() {
            addCriterion("NO2_RATE is null");
            return (Criteria) this;
        }

        public Criteria andNo2RateIsNotNull() {
            addCriterion("NO2_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andNo2RateEqualTo(Double value) {
            addCriterion("NO2_RATE =", value, "no2Rate");
            return (Criteria) this;
        }

        public Criteria andNo2RateNotEqualTo(Double value) {
            addCriterion("NO2_RATE <>", value, "no2Rate");
            return (Criteria) this;
        }

        public Criteria andNo2RateGreaterThan(Double value) {
            addCriterion("NO2_RATE >", value, "no2Rate");
            return (Criteria) this;
        }

        public Criteria andNo2RateGreaterThanOrEqualTo(Double value) {
            addCriterion("NO2_RATE >=", value, "no2Rate");
            return (Criteria) this;
        }

        public Criteria andNo2RateLessThan(Double value) {
            addCriterion("NO2_RATE <", value, "no2Rate");
            return (Criteria) this;
        }

        public Criteria andNo2RateLessThanOrEqualTo(Double value) {
            addCriterion("NO2_RATE <=", value, "no2Rate");
            return (Criteria) this;
        }

        public Criteria andNo2RateIn(List<Double> values) {
            addCriterion("NO2_RATE in", values, "no2Rate");
            return (Criteria) this;
        }

        public Criteria andNo2RateNotIn(List<Double> values) {
            addCriterion("NO2_RATE not in", values, "no2Rate");
            return (Criteria) this;
        }

        public Criteria andNo2RateBetween(Double value1, Double value2) {
            addCriterion("NO2_RATE between", value1, value2, "no2Rate");
            return (Criteria) this;
        }

        public Criteria andNo2RateNotBetween(Double value1, Double value2) {
            addCriterion("NO2_RATE not between", value1, value2, "no2Rate");
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