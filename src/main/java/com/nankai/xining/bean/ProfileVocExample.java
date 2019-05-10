package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class ProfileVocExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProfileVocExample() {
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

        public Criteria andVocIdIsNull() {
            addCriterion("VOC_ID is null");
            return (Criteria) this;
        }

        public Criteria andVocIdIsNotNull() {
            addCriterion("VOC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVocIdEqualTo(Integer value) {
            addCriterion("VOC_ID =", value, "vocId");
            return (Criteria) this;
        }

        public Criteria andVocIdNotEqualTo(Integer value) {
            addCriterion("VOC_ID <>", value, "vocId");
            return (Criteria) this;
        }

        public Criteria andVocIdGreaterThan(Integer value) {
            addCriterion("VOC_ID >", value, "vocId");
            return (Criteria) this;
        }

        public Criteria andVocIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("VOC_ID >=", value, "vocId");
            return (Criteria) this;
        }

        public Criteria andVocIdLessThan(Integer value) {
            addCriterion("VOC_ID <", value, "vocId");
            return (Criteria) this;
        }

        public Criteria andVocIdLessThanOrEqualTo(Integer value) {
            addCriterion("VOC_ID <=", value, "vocId");
            return (Criteria) this;
        }

        public Criteria andVocIdIn(List<Integer> values) {
            addCriterion("VOC_ID in", values, "vocId");
            return (Criteria) this;
        }

        public Criteria andVocIdNotIn(List<Integer> values) {
            addCriterion("VOC_ID not in", values, "vocId");
            return (Criteria) this;
        }

        public Criteria andVocIdBetween(Integer value1, Integer value2) {
            addCriterion("VOC_ID between", value1, value2, "vocId");
            return (Criteria) this;
        }

        public Criteria andVocIdNotBetween(Integer value1, Integer value2) {
            addCriterion("VOC_ID not between", value1, value2, "vocId");
            return (Criteria) this;
        }

        public Criteria andFormMolecularIsNull() {
            addCriterion("FORM_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andFormMolecularIsNotNull() {
            addCriterion("FORM_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andFormMolecularEqualTo(Double value) {
            addCriterion("FORM_MOLECULAR =", value, "formMolecular");
            return (Criteria) this;
        }

        public Criteria andFormMolecularNotEqualTo(Double value) {
            addCriterion("FORM_MOLECULAR <>", value, "formMolecular");
            return (Criteria) this;
        }

        public Criteria andFormMolecularGreaterThan(Double value) {
            addCriterion("FORM_MOLECULAR >", value, "formMolecular");
            return (Criteria) this;
        }

        public Criteria andFormMolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("FORM_MOLECULAR >=", value, "formMolecular");
            return (Criteria) this;
        }

        public Criteria andFormMolecularLessThan(Double value) {
            addCriterion("FORM_MOLECULAR <", value, "formMolecular");
            return (Criteria) this;
        }

        public Criteria andFormMolecularLessThanOrEqualTo(Double value) {
            addCriterion("FORM_MOLECULAR <=", value, "formMolecular");
            return (Criteria) this;
        }

        public Criteria andFormMolecularIn(List<Double> values) {
            addCriterion("FORM_MOLECULAR in", values, "formMolecular");
            return (Criteria) this;
        }

        public Criteria andFormMolecularNotIn(List<Double> values) {
            addCriterion("FORM_MOLECULAR not in", values, "formMolecular");
            return (Criteria) this;
        }

        public Criteria andFormMolecularBetween(Double value1, Double value2) {
            addCriterion("FORM_MOLECULAR between", value1, value2, "formMolecular");
            return (Criteria) this;
        }

        public Criteria andFormMolecularNotBetween(Double value1, Double value2) {
            addCriterion("FORM_MOLECULAR not between", value1, value2, "formMolecular");
            return (Criteria) this;
        }

        public Criteria andFormDenominatorIsNull() {
            addCriterion("FORM_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andFormDenominatorIsNotNull() {
            addCriterion("FORM_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andFormDenominatorEqualTo(Double value) {
            addCriterion("FORM_DENOMINATOR =", value, "formDenominator");
            return (Criteria) this;
        }

        public Criteria andFormDenominatorNotEqualTo(Double value) {
            addCriterion("FORM_DENOMINATOR <>", value, "formDenominator");
            return (Criteria) this;
        }

        public Criteria andFormDenominatorGreaterThan(Double value) {
            addCriterion("FORM_DENOMINATOR >", value, "formDenominator");
            return (Criteria) this;
        }

        public Criteria andFormDenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("FORM_DENOMINATOR >=", value, "formDenominator");
            return (Criteria) this;
        }

        public Criteria andFormDenominatorLessThan(Double value) {
            addCriterion("FORM_DENOMINATOR <", value, "formDenominator");
            return (Criteria) this;
        }

        public Criteria andFormDenominatorLessThanOrEqualTo(Double value) {
            addCriterion("FORM_DENOMINATOR <=", value, "formDenominator");
            return (Criteria) this;
        }

        public Criteria andFormDenominatorIn(List<Double> values) {
            addCriterion("FORM_DENOMINATOR in", values, "formDenominator");
            return (Criteria) this;
        }

        public Criteria andFormDenominatorNotIn(List<Double> values) {
            addCriterion("FORM_DENOMINATOR not in", values, "formDenominator");
            return (Criteria) this;
        }

        public Criteria andFormDenominatorBetween(Double value1, Double value2) {
            addCriterion("FORM_DENOMINATOR between", value1, value2, "formDenominator");
            return (Criteria) this;
        }

        public Criteria andFormDenominatorNotBetween(Double value1, Double value2) {
            addCriterion("FORM_DENOMINATOR not between", value1, value2, "formDenominator");
            return (Criteria) this;
        }

        public Criteria andFormRateIsNull() {
            addCriterion("FORM_RATE is null");
            return (Criteria) this;
        }

        public Criteria andFormRateIsNotNull() {
            addCriterion("FORM_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andFormRateEqualTo(Double value) {
            addCriterion("FORM_RATE =", value, "formRate");
            return (Criteria) this;
        }

        public Criteria andFormRateNotEqualTo(Double value) {
            addCriterion("FORM_RATE <>", value, "formRate");
            return (Criteria) this;
        }

        public Criteria andFormRateGreaterThan(Double value) {
            addCriterion("FORM_RATE >", value, "formRate");
            return (Criteria) this;
        }

        public Criteria andFormRateGreaterThanOrEqualTo(Double value) {
            addCriterion("FORM_RATE >=", value, "formRate");
            return (Criteria) this;
        }

        public Criteria andFormRateLessThan(Double value) {
            addCriterion("FORM_RATE <", value, "formRate");
            return (Criteria) this;
        }

        public Criteria andFormRateLessThanOrEqualTo(Double value) {
            addCriterion("FORM_RATE <=", value, "formRate");
            return (Criteria) this;
        }

        public Criteria andFormRateIn(List<Double> values) {
            addCriterion("FORM_RATE in", values, "formRate");
            return (Criteria) this;
        }

        public Criteria andFormRateNotIn(List<Double> values) {
            addCriterion("FORM_RATE not in", values, "formRate");
            return (Criteria) this;
        }

        public Criteria andFormRateBetween(Double value1, Double value2) {
            addCriterion("FORM_RATE between", value1, value2, "formRate");
            return (Criteria) this;
        }

        public Criteria andFormRateNotBetween(Double value1, Double value2) {
            addCriterion("FORM_RATE not between", value1, value2, "formRate");
            return (Criteria) this;
        }

        public Criteria andAld2MolecularIsNull() {
            addCriterion("ALD2_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andAld2MolecularIsNotNull() {
            addCriterion("ALD2_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andAld2MolecularEqualTo(Double value) {
            addCriterion("ALD2_MOLECULAR =", value, "ald2Molecular");
            return (Criteria) this;
        }

        public Criteria andAld2MolecularNotEqualTo(Double value) {
            addCriterion("ALD2_MOLECULAR <>", value, "ald2Molecular");
            return (Criteria) this;
        }

        public Criteria andAld2MolecularGreaterThan(Double value) {
            addCriterion("ALD2_MOLECULAR >", value, "ald2Molecular");
            return (Criteria) this;
        }

        public Criteria andAld2MolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("ALD2_MOLECULAR >=", value, "ald2Molecular");
            return (Criteria) this;
        }

        public Criteria andAld2MolecularLessThan(Double value) {
            addCriterion("ALD2_MOLECULAR <", value, "ald2Molecular");
            return (Criteria) this;
        }

        public Criteria andAld2MolecularLessThanOrEqualTo(Double value) {
            addCriterion("ALD2_MOLECULAR <=", value, "ald2Molecular");
            return (Criteria) this;
        }

        public Criteria andAld2MolecularIn(List<Double> values) {
            addCriterion("ALD2_MOLECULAR in", values, "ald2Molecular");
            return (Criteria) this;
        }

        public Criteria andAld2MolecularNotIn(List<Double> values) {
            addCriterion("ALD2_MOLECULAR not in", values, "ald2Molecular");
            return (Criteria) this;
        }

        public Criteria andAld2MolecularBetween(Double value1, Double value2) {
            addCriterion("ALD2_MOLECULAR between", value1, value2, "ald2Molecular");
            return (Criteria) this;
        }

        public Criteria andAld2MolecularNotBetween(Double value1, Double value2) {
            addCriterion("ALD2_MOLECULAR not between", value1, value2, "ald2Molecular");
            return (Criteria) this;
        }

        public Criteria andAld2DenominatorIsNull() {
            addCriterion("ALD2_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andAld2DenominatorIsNotNull() {
            addCriterion("ALD2_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andAld2DenominatorEqualTo(Double value) {
            addCriterion("ALD2_DENOMINATOR =", value, "ald2Denominator");
            return (Criteria) this;
        }

        public Criteria andAld2DenominatorNotEqualTo(Double value) {
            addCriterion("ALD2_DENOMINATOR <>", value, "ald2Denominator");
            return (Criteria) this;
        }

        public Criteria andAld2DenominatorGreaterThan(Double value) {
            addCriterion("ALD2_DENOMINATOR >", value, "ald2Denominator");
            return (Criteria) this;
        }

        public Criteria andAld2DenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("ALD2_DENOMINATOR >=", value, "ald2Denominator");
            return (Criteria) this;
        }

        public Criteria andAld2DenominatorLessThan(Double value) {
            addCriterion("ALD2_DENOMINATOR <", value, "ald2Denominator");
            return (Criteria) this;
        }

        public Criteria andAld2DenominatorLessThanOrEqualTo(Double value) {
            addCriterion("ALD2_DENOMINATOR <=", value, "ald2Denominator");
            return (Criteria) this;
        }

        public Criteria andAld2DenominatorIn(List<Double> values) {
            addCriterion("ALD2_DENOMINATOR in", values, "ald2Denominator");
            return (Criteria) this;
        }

        public Criteria andAld2DenominatorNotIn(List<Double> values) {
            addCriterion("ALD2_DENOMINATOR not in", values, "ald2Denominator");
            return (Criteria) this;
        }

        public Criteria andAld2DenominatorBetween(Double value1, Double value2) {
            addCriterion("ALD2_DENOMINATOR between", value1, value2, "ald2Denominator");
            return (Criteria) this;
        }

        public Criteria andAld2DenominatorNotBetween(Double value1, Double value2) {
            addCriterion("ALD2_DENOMINATOR not between", value1, value2, "ald2Denominator");
            return (Criteria) this;
        }

        public Criteria andAld2RateIsNull() {
            addCriterion("ALD2_RATE is null");
            return (Criteria) this;
        }

        public Criteria andAld2RateIsNotNull() {
            addCriterion("ALD2_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andAld2RateEqualTo(Double value) {
            addCriterion("ALD2_RATE =", value, "ald2Rate");
            return (Criteria) this;
        }

        public Criteria andAld2RateNotEqualTo(Double value) {
            addCriterion("ALD2_RATE <>", value, "ald2Rate");
            return (Criteria) this;
        }

        public Criteria andAld2RateGreaterThan(Double value) {
            addCriterion("ALD2_RATE >", value, "ald2Rate");
            return (Criteria) this;
        }

        public Criteria andAld2RateGreaterThanOrEqualTo(Double value) {
            addCriterion("ALD2_RATE >=", value, "ald2Rate");
            return (Criteria) this;
        }

        public Criteria andAld2RateLessThan(Double value) {
            addCriterion("ALD2_RATE <", value, "ald2Rate");
            return (Criteria) this;
        }

        public Criteria andAld2RateLessThanOrEqualTo(Double value) {
            addCriterion("ALD2_RATE <=", value, "ald2Rate");
            return (Criteria) this;
        }

        public Criteria andAld2RateIn(List<Double> values) {
            addCriterion("ALD2_RATE in", values, "ald2Rate");
            return (Criteria) this;
        }

        public Criteria andAld2RateNotIn(List<Double> values) {
            addCriterion("ALD2_RATE not in", values, "ald2Rate");
            return (Criteria) this;
        }

        public Criteria andAld2RateBetween(Double value1, Double value2) {
            addCriterion("ALD2_RATE between", value1, value2, "ald2Rate");
            return (Criteria) this;
        }

        public Criteria andAld2RateNotBetween(Double value1, Double value2) {
            addCriterion("ALD2_RATE not between", value1, value2, "ald2Rate");
            return (Criteria) this;
        }

        public Criteria andAldxMolecularIsNull() {
            addCriterion("ALDX_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andAldxMolecularIsNotNull() {
            addCriterion("ALDX_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andAldxMolecularEqualTo(Double value) {
            addCriterion("ALDX_MOLECULAR =", value, "aldxMolecular");
            return (Criteria) this;
        }

        public Criteria andAldxMolecularNotEqualTo(Double value) {
            addCriterion("ALDX_MOLECULAR <>", value, "aldxMolecular");
            return (Criteria) this;
        }

        public Criteria andAldxMolecularGreaterThan(Double value) {
            addCriterion("ALDX_MOLECULAR >", value, "aldxMolecular");
            return (Criteria) this;
        }

        public Criteria andAldxMolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("ALDX_MOLECULAR >=", value, "aldxMolecular");
            return (Criteria) this;
        }

        public Criteria andAldxMolecularLessThan(Double value) {
            addCriterion("ALDX_MOLECULAR <", value, "aldxMolecular");
            return (Criteria) this;
        }

        public Criteria andAldxMolecularLessThanOrEqualTo(Double value) {
            addCriterion("ALDX_MOLECULAR <=", value, "aldxMolecular");
            return (Criteria) this;
        }

        public Criteria andAldxMolecularIn(List<Double> values) {
            addCriterion("ALDX_MOLECULAR in", values, "aldxMolecular");
            return (Criteria) this;
        }

        public Criteria andAldxMolecularNotIn(List<Double> values) {
            addCriterion("ALDX_MOLECULAR not in", values, "aldxMolecular");
            return (Criteria) this;
        }

        public Criteria andAldxMolecularBetween(Double value1, Double value2) {
            addCriterion("ALDX_MOLECULAR between", value1, value2, "aldxMolecular");
            return (Criteria) this;
        }

        public Criteria andAldxMolecularNotBetween(Double value1, Double value2) {
            addCriterion("ALDX_MOLECULAR not between", value1, value2, "aldxMolecular");
            return (Criteria) this;
        }

        public Criteria andAldxDenominatorIsNull() {
            addCriterion("ALDX_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andAldxDenominatorIsNotNull() {
            addCriterion("ALDX_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andAldxDenominatorEqualTo(Double value) {
            addCriterion("ALDX_DENOMINATOR =", value, "aldxDenominator");
            return (Criteria) this;
        }

        public Criteria andAldxDenominatorNotEqualTo(Double value) {
            addCriterion("ALDX_DENOMINATOR <>", value, "aldxDenominator");
            return (Criteria) this;
        }

        public Criteria andAldxDenominatorGreaterThan(Double value) {
            addCriterion("ALDX_DENOMINATOR >", value, "aldxDenominator");
            return (Criteria) this;
        }

        public Criteria andAldxDenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("ALDX_DENOMINATOR >=", value, "aldxDenominator");
            return (Criteria) this;
        }

        public Criteria andAldxDenominatorLessThan(Double value) {
            addCriterion("ALDX_DENOMINATOR <", value, "aldxDenominator");
            return (Criteria) this;
        }

        public Criteria andAldxDenominatorLessThanOrEqualTo(Double value) {
            addCriterion("ALDX_DENOMINATOR <=", value, "aldxDenominator");
            return (Criteria) this;
        }

        public Criteria andAldxDenominatorIn(List<Double> values) {
            addCriterion("ALDX_DENOMINATOR in", values, "aldxDenominator");
            return (Criteria) this;
        }

        public Criteria andAldxDenominatorNotIn(List<Double> values) {
            addCriterion("ALDX_DENOMINATOR not in", values, "aldxDenominator");
            return (Criteria) this;
        }

        public Criteria andAldxDenominatorBetween(Double value1, Double value2) {
            addCriterion("ALDX_DENOMINATOR between", value1, value2, "aldxDenominator");
            return (Criteria) this;
        }

        public Criteria andAldxDenominatorNotBetween(Double value1, Double value2) {
            addCriterion("ALDX_DENOMINATOR not between", value1, value2, "aldxDenominator");
            return (Criteria) this;
        }

        public Criteria andAldxRateIsNull() {
            addCriterion("ALDX_RATE is null");
            return (Criteria) this;
        }

        public Criteria andAldxRateIsNotNull() {
            addCriterion("ALDX_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andAldxRateEqualTo(Double value) {
            addCriterion("ALDX_RATE =", value, "aldxRate");
            return (Criteria) this;
        }

        public Criteria andAldxRateNotEqualTo(Double value) {
            addCriterion("ALDX_RATE <>", value, "aldxRate");
            return (Criteria) this;
        }

        public Criteria andAldxRateGreaterThan(Double value) {
            addCriterion("ALDX_RATE >", value, "aldxRate");
            return (Criteria) this;
        }

        public Criteria andAldxRateGreaterThanOrEqualTo(Double value) {
            addCriterion("ALDX_RATE >=", value, "aldxRate");
            return (Criteria) this;
        }

        public Criteria andAldxRateLessThan(Double value) {
            addCriterion("ALDX_RATE <", value, "aldxRate");
            return (Criteria) this;
        }

        public Criteria andAldxRateLessThanOrEqualTo(Double value) {
            addCriterion("ALDX_RATE <=", value, "aldxRate");
            return (Criteria) this;
        }

        public Criteria andAldxRateIn(List<Double> values) {
            addCriterion("ALDX_RATE in", values, "aldxRate");
            return (Criteria) this;
        }

        public Criteria andAldxRateNotIn(List<Double> values) {
            addCriterion("ALDX_RATE not in", values, "aldxRate");
            return (Criteria) this;
        }

        public Criteria andAldxRateBetween(Double value1, Double value2) {
            addCriterion("ALDX_RATE between", value1, value2, "aldxRate");
            return (Criteria) this;
        }

        public Criteria andAldxRateNotBetween(Double value1, Double value2) {
            addCriterion("ALDX_RATE not between", value1, value2, "aldxRate");
            return (Criteria) this;
        }

        public Criteria andEtohMolecularIsNull() {
            addCriterion("ETOH_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andEtohMolecularIsNotNull() {
            addCriterion("ETOH_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andEtohMolecularEqualTo(Double value) {
            addCriterion("ETOH_MOLECULAR =", value, "etohMolecular");
            return (Criteria) this;
        }

        public Criteria andEtohMolecularNotEqualTo(Double value) {
            addCriterion("ETOH_MOLECULAR <>", value, "etohMolecular");
            return (Criteria) this;
        }

        public Criteria andEtohMolecularGreaterThan(Double value) {
            addCriterion("ETOH_MOLECULAR >", value, "etohMolecular");
            return (Criteria) this;
        }

        public Criteria andEtohMolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("ETOH_MOLECULAR >=", value, "etohMolecular");
            return (Criteria) this;
        }

        public Criteria andEtohMolecularLessThan(Double value) {
            addCriterion("ETOH_MOLECULAR <", value, "etohMolecular");
            return (Criteria) this;
        }

        public Criteria andEtohMolecularLessThanOrEqualTo(Double value) {
            addCriterion("ETOH_MOLECULAR <=", value, "etohMolecular");
            return (Criteria) this;
        }

        public Criteria andEtohMolecularIn(List<Double> values) {
            addCriterion("ETOH_MOLECULAR in", values, "etohMolecular");
            return (Criteria) this;
        }

        public Criteria andEtohMolecularNotIn(List<Double> values) {
            addCriterion("ETOH_MOLECULAR not in", values, "etohMolecular");
            return (Criteria) this;
        }

        public Criteria andEtohMolecularBetween(Double value1, Double value2) {
            addCriterion("ETOH_MOLECULAR between", value1, value2, "etohMolecular");
            return (Criteria) this;
        }

        public Criteria andEtohMolecularNotBetween(Double value1, Double value2) {
            addCriterion("ETOH_MOLECULAR not between", value1, value2, "etohMolecular");
            return (Criteria) this;
        }

        public Criteria andEtohDenominatorIsNull() {
            addCriterion("ETOH_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andEtohDenominatorIsNotNull() {
            addCriterion("ETOH_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andEtohDenominatorEqualTo(Double value) {
            addCriterion("ETOH_DENOMINATOR =", value, "etohDenominator");
            return (Criteria) this;
        }

        public Criteria andEtohDenominatorNotEqualTo(Double value) {
            addCriterion("ETOH_DENOMINATOR <>", value, "etohDenominator");
            return (Criteria) this;
        }

        public Criteria andEtohDenominatorGreaterThan(Double value) {
            addCriterion("ETOH_DENOMINATOR >", value, "etohDenominator");
            return (Criteria) this;
        }

        public Criteria andEtohDenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("ETOH_DENOMINATOR >=", value, "etohDenominator");
            return (Criteria) this;
        }

        public Criteria andEtohDenominatorLessThan(Double value) {
            addCriterion("ETOH_DENOMINATOR <", value, "etohDenominator");
            return (Criteria) this;
        }

        public Criteria andEtohDenominatorLessThanOrEqualTo(Double value) {
            addCriterion("ETOH_DENOMINATOR <=", value, "etohDenominator");
            return (Criteria) this;
        }

        public Criteria andEtohDenominatorIn(List<Double> values) {
            addCriterion("ETOH_DENOMINATOR in", values, "etohDenominator");
            return (Criteria) this;
        }

        public Criteria andEtohDenominatorNotIn(List<Double> values) {
            addCriterion("ETOH_DENOMINATOR not in", values, "etohDenominator");
            return (Criteria) this;
        }

        public Criteria andEtohDenominatorBetween(Double value1, Double value2) {
            addCriterion("ETOH_DENOMINATOR between", value1, value2, "etohDenominator");
            return (Criteria) this;
        }

        public Criteria andEtohDenominatorNotBetween(Double value1, Double value2) {
            addCriterion("ETOH_DENOMINATOR not between", value1, value2, "etohDenominator");
            return (Criteria) this;
        }

        public Criteria andEtohRateIsNull() {
            addCriterion("ETOH_RATE is null");
            return (Criteria) this;
        }

        public Criteria andEtohRateIsNotNull() {
            addCriterion("ETOH_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andEtohRateEqualTo(Double value) {
            addCriterion("ETOH_RATE =", value, "etohRate");
            return (Criteria) this;
        }

        public Criteria andEtohRateNotEqualTo(Double value) {
            addCriterion("ETOH_RATE <>", value, "etohRate");
            return (Criteria) this;
        }

        public Criteria andEtohRateGreaterThan(Double value) {
            addCriterion("ETOH_RATE >", value, "etohRate");
            return (Criteria) this;
        }

        public Criteria andEtohRateGreaterThanOrEqualTo(Double value) {
            addCriterion("ETOH_RATE >=", value, "etohRate");
            return (Criteria) this;
        }

        public Criteria andEtohRateLessThan(Double value) {
            addCriterion("ETOH_RATE <", value, "etohRate");
            return (Criteria) this;
        }

        public Criteria andEtohRateLessThanOrEqualTo(Double value) {
            addCriterion("ETOH_RATE <=", value, "etohRate");
            return (Criteria) this;
        }

        public Criteria andEtohRateIn(List<Double> values) {
            addCriterion("ETOH_RATE in", values, "etohRate");
            return (Criteria) this;
        }

        public Criteria andEtohRateNotIn(List<Double> values) {
            addCriterion("ETOH_RATE not in", values, "etohRate");
            return (Criteria) this;
        }

        public Criteria andEtohRateBetween(Double value1, Double value2) {
            addCriterion("ETOH_RATE between", value1, value2, "etohRate");
            return (Criteria) this;
        }

        public Criteria andEtohRateNotBetween(Double value1, Double value2) {
            addCriterion("ETOH_RATE not between", value1, value2, "etohRate");
            return (Criteria) this;
        }

        public Criteria andCh4MolecularIsNull() {
            addCriterion("CH4_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andCh4MolecularIsNotNull() {
            addCriterion("CH4_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andCh4MolecularEqualTo(Double value) {
            addCriterion("CH4_MOLECULAR =", value, "ch4Molecular");
            return (Criteria) this;
        }

        public Criteria andCh4MolecularNotEqualTo(Double value) {
            addCriterion("CH4_MOLECULAR <>", value, "ch4Molecular");
            return (Criteria) this;
        }

        public Criteria andCh4MolecularGreaterThan(Double value) {
            addCriterion("CH4_MOLECULAR >", value, "ch4Molecular");
            return (Criteria) this;
        }

        public Criteria andCh4MolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("CH4_MOLECULAR >=", value, "ch4Molecular");
            return (Criteria) this;
        }

        public Criteria andCh4MolecularLessThan(Double value) {
            addCriterion("CH4_MOLECULAR <", value, "ch4Molecular");
            return (Criteria) this;
        }

        public Criteria andCh4MolecularLessThanOrEqualTo(Double value) {
            addCriterion("CH4_MOLECULAR <=", value, "ch4Molecular");
            return (Criteria) this;
        }

        public Criteria andCh4MolecularIn(List<Double> values) {
            addCriterion("CH4_MOLECULAR in", values, "ch4Molecular");
            return (Criteria) this;
        }

        public Criteria andCh4MolecularNotIn(List<Double> values) {
            addCriterion("CH4_MOLECULAR not in", values, "ch4Molecular");
            return (Criteria) this;
        }

        public Criteria andCh4MolecularBetween(Double value1, Double value2) {
            addCriterion("CH4_MOLECULAR between", value1, value2, "ch4Molecular");
            return (Criteria) this;
        }

        public Criteria andCh4MolecularNotBetween(Double value1, Double value2) {
            addCriterion("CH4_MOLECULAR not between", value1, value2, "ch4Molecular");
            return (Criteria) this;
        }

        public Criteria andCh4DenominatorIsNull() {
            addCriterion("CH4_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andCh4DenominatorIsNotNull() {
            addCriterion("CH4_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCh4DenominatorEqualTo(Double value) {
            addCriterion("CH4_DENOMINATOR =", value, "ch4Denominator");
            return (Criteria) this;
        }

        public Criteria andCh4DenominatorNotEqualTo(Double value) {
            addCriterion("CH4_DENOMINATOR <>", value, "ch4Denominator");
            return (Criteria) this;
        }

        public Criteria andCh4DenominatorGreaterThan(Double value) {
            addCriterion("CH4_DENOMINATOR >", value, "ch4Denominator");
            return (Criteria) this;
        }

        public Criteria andCh4DenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("CH4_DENOMINATOR >=", value, "ch4Denominator");
            return (Criteria) this;
        }

        public Criteria andCh4DenominatorLessThan(Double value) {
            addCriterion("CH4_DENOMINATOR <", value, "ch4Denominator");
            return (Criteria) this;
        }

        public Criteria andCh4DenominatorLessThanOrEqualTo(Double value) {
            addCriterion("CH4_DENOMINATOR <=", value, "ch4Denominator");
            return (Criteria) this;
        }

        public Criteria andCh4DenominatorIn(List<Double> values) {
            addCriterion("CH4_DENOMINATOR in", values, "ch4Denominator");
            return (Criteria) this;
        }

        public Criteria andCh4DenominatorNotIn(List<Double> values) {
            addCriterion("CH4_DENOMINATOR not in", values, "ch4Denominator");
            return (Criteria) this;
        }

        public Criteria andCh4DenominatorBetween(Double value1, Double value2) {
            addCriterion("CH4_DENOMINATOR between", value1, value2, "ch4Denominator");
            return (Criteria) this;
        }

        public Criteria andCh4DenominatorNotBetween(Double value1, Double value2) {
            addCriterion("CH4_DENOMINATOR not between", value1, value2, "ch4Denominator");
            return (Criteria) this;
        }

        public Criteria andCh4RateIsNull() {
            addCriterion("CH4_RATE is null");
            return (Criteria) this;
        }

        public Criteria andCh4RateIsNotNull() {
            addCriterion("CH4_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andCh4RateEqualTo(Double value) {
            addCriterion("CH4_RATE =", value, "ch4Rate");
            return (Criteria) this;
        }

        public Criteria andCh4RateNotEqualTo(Double value) {
            addCriterion("CH4_RATE <>", value, "ch4Rate");
            return (Criteria) this;
        }

        public Criteria andCh4RateGreaterThan(Double value) {
            addCriterion("CH4_RATE >", value, "ch4Rate");
            return (Criteria) this;
        }

        public Criteria andCh4RateGreaterThanOrEqualTo(Double value) {
            addCriterion("CH4_RATE >=", value, "ch4Rate");
            return (Criteria) this;
        }

        public Criteria andCh4RateLessThan(Double value) {
            addCriterion("CH4_RATE <", value, "ch4Rate");
            return (Criteria) this;
        }

        public Criteria andCh4RateLessThanOrEqualTo(Double value) {
            addCriterion("CH4_RATE <=", value, "ch4Rate");
            return (Criteria) this;
        }

        public Criteria andCh4RateIn(List<Double> values) {
            addCriterion("CH4_RATE in", values, "ch4Rate");
            return (Criteria) this;
        }

        public Criteria andCh4RateNotIn(List<Double> values) {
            addCriterion("CH4_RATE not in", values, "ch4Rate");
            return (Criteria) this;
        }

        public Criteria andCh4RateBetween(Double value1, Double value2) {
            addCriterion("CH4_RATE between", value1, value2, "ch4Rate");
            return (Criteria) this;
        }

        public Criteria andCh4RateNotBetween(Double value1, Double value2) {
            addCriterion("CH4_RATE not between", value1, value2, "ch4Rate");
            return (Criteria) this;
        }

        public Criteria andMeohMolecularIsNull() {
            addCriterion("MEOH_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andMeohMolecularIsNotNull() {
            addCriterion("MEOH_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andMeohMolecularEqualTo(Double value) {
            addCriterion("MEOH_MOLECULAR =", value, "meohMolecular");
            return (Criteria) this;
        }

        public Criteria andMeohMolecularNotEqualTo(Double value) {
            addCriterion("MEOH_MOLECULAR <>", value, "meohMolecular");
            return (Criteria) this;
        }

        public Criteria andMeohMolecularGreaterThan(Double value) {
            addCriterion("MEOH_MOLECULAR >", value, "meohMolecular");
            return (Criteria) this;
        }

        public Criteria andMeohMolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("MEOH_MOLECULAR >=", value, "meohMolecular");
            return (Criteria) this;
        }

        public Criteria andMeohMolecularLessThan(Double value) {
            addCriterion("MEOH_MOLECULAR <", value, "meohMolecular");
            return (Criteria) this;
        }

        public Criteria andMeohMolecularLessThanOrEqualTo(Double value) {
            addCriterion("MEOH_MOLECULAR <=", value, "meohMolecular");
            return (Criteria) this;
        }

        public Criteria andMeohMolecularIn(List<Double> values) {
            addCriterion("MEOH_MOLECULAR in", values, "meohMolecular");
            return (Criteria) this;
        }

        public Criteria andMeohMolecularNotIn(List<Double> values) {
            addCriterion("MEOH_MOLECULAR not in", values, "meohMolecular");
            return (Criteria) this;
        }

        public Criteria andMeohMolecularBetween(Double value1, Double value2) {
            addCriterion("MEOH_MOLECULAR between", value1, value2, "meohMolecular");
            return (Criteria) this;
        }

        public Criteria andMeohMolecularNotBetween(Double value1, Double value2) {
            addCriterion("MEOH_MOLECULAR not between", value1, value2, "meohMolecular");
            return (Criteria) this;
        }

        public Criteria andMeohDenominatorIsNull() {
            addCriterion("MEOH_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andMeohDenominatorIsNotNull() {
            addCriterion("MEOH_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andMeohDenominatorEqualTo(Double value) {
            addCriterion("MEOH_DENOMINATOR =", value, "meohDenominator");
            return (Criteria) this;
        }

        public Criteria andMeohDenominatorNotEqualTo(Double value) {
            addCriterion("MEOH_DENOMINATOR <>", value, "meohDenominator");
            return (Criteria) this;
        }

        public Criteria andMeohDenominatorGreaterThan(Double value) {
            addCriterion("MEOH_DENOMINATOR >", value, "meohDenominator");
            return (Criteria) this;
        }

        public Criteria andMeohDenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("MEOH_DENOMINATOR >=", value, "meohDenominator");
            return (Criteria) this;
        }

        public Criteria andMeohDenominatorLessThan(Double value) {
            addCriterion("MEOH_DENOMINATOR <", value, "meohDenominator");
            return (Criteria) this;
        }

        public Criteria andMeohDenominatorLessThanOrEqualTo(Double value) {
            addCriterion("MEOH_DENOMINATOR <=", value, "meohDenominator");
            return (Criteria) this;
        }

        public Criteria andMeohDenominatorIn(List<Double> values) {
            addCriterion("MEOH_DENOMINATOR in", values, "meohDenominator");
            return (Criteria) this;
        }

        public Criteria andMeohDenominatorNotIn(List<Double> values) {
            addCriterion("MEOH_DENOMINATOR not in", values, "meohDenominator");
            return (Criteria) this;
        }

        public Criteria andMeohDenominatorBetween(Double value1, Double value2) {
            addCriterion("MEOH_DENOMINATOR between", value1, value2, "meohDenominator");
            return (Criteria) this;
        }

        public Criteria andMeohDenominatorNotBetween(Double value1, Double value2) {
            addCriterion("MEOH_DENOMINATOR not between", value1, value2, "meohDenominator");
            return (Criteria) this;
        }

        public Criteria andMeohRateIsNull() {
            addCriterion("MEOH_RATE is null");
            return (Criteria) this;
        }

        public Criteria andMeohRateIsNotNull() {
            addCriterion("MEOH_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andMeohRateEqualTo(Double value) {
            addCriterion("MEOH_RATE =", value, "meohRate");
            return (Criteria) this;
        }

        public Criteria andMeohRateNotEqualTo(Double value) {
            addCriterion("MEOH_RATE <>", value, "meohRate");
            return (Criteria) this;
        }

        public Criteria andMeohRateGreaterThan(Double value) {
            addCriterion("MEOH_RATE >", value, "meohRate");
            return (Criteria) this;
        }

        public Criteria andMeohRateGreaterThanOrEqualTo(Double value) {
            addCriterion("MEOH_RATE >=", value, "meohRate");
            return (Criteria) this;
        }

        public Criteria andMeohRateLessThan(Double value) {
            addCriterion("MEOH_RATE <", value, "meohRate");
            return (Criteria) this;
        }

        public Criteria andMeohRateLessThanOrEqualTo(Double value) {
            addCriterion("MEOH_RATE <=", value, "meohRate");
            return (Criteria) this;
        }

        public Criteria andMeohRateIn(List<Double> values) {
            addCriterion("MEOH_RATE in", values, "meohRate");
            return (Criteria) this;
        }

        public Criteria andMeohRateNotIn(List<Double> values) {
            addCriterion("MEOH_RATE not in", values, "meohRate");
            return (Criteria) this;
        }

        public Criteria andMeohRateBetween(Double value1, Double value2) {
            addCriterion("MEOH_RATE between", value1, value2, "meohRate");
            return (Criteria) this;
        }

        public Criteria andMeohRateNotBetween(Double value1, Double value2) {
            addCriterion("MEOH_RATE not between", value1, value2, "meohRate");
            return (Criteria) this;
        }

        public Criteria andEthaMolecularIsNull() {
            addCriterion("ETHA_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andEthaMolecularIsNotNull() {
            addCriterion("ETHA_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andEthaMolecularEqualTo(Double value) {
            addCriterion("ETHA_MOLECULAR =", value, "ethaMolecular");
            return (Criteria) this;
        }

        public Criteria andEthaMolecularNotEqualTo(Double value) {
            addCriterion("ETHA_MOLECULAR <>", value, "ethaMolecular");
            return (Criteria) this;
        }

        public Criteria andEthaMolecularGreaterThan(Double value) {
            addCriterion("ETHA_MOLECULAR >", value, "ethaMolecular");
            return (Criteria) this;
        }

        public Criteria andEthaMolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("ETHA_MOLECULAR >=", value, "ethaMolecular");
            return (Criteria) this;
        }

        public Criteria andEthaMolecularLessThan(Double value) {
            addCriterion("ETHA_MOLECULAR <", value, "ethaMolecular");
            return (Criteria) this;
        }

        public Criteria andEthaMolecularLessThanOrEqualTo(Double value) {
            addCriterion("ETHA_MOLECULAR <=", value, "ethaMolecular");
            return (Criteria) this;
        }

        public Criteria andEthaMolecularIn(List<Double> values) {
            addCriterion("ETHA_MOLECULAR in", values, "ethaMolecular");
            return (Criteria) this;
        }

        public Criteria andEthaMolecularNotIn(List<Double> values) {
            addCriterion("ETHA_MOLECULAR not in", values, "ethaMolecular");
            return (Criteria) this;
        }

        public Criteria andEthaMolecularBetween(Double value1, Double value2) {
            addCriterion("ETHA_MOLECULAR between", value1, value2, "ethaMolecular");
            return (Criteria) this;
        }

        public Criteria andEthaMolecularNotBetween(Double value1, Double value2) {
            addCriterion("ETHA_MOLECULAR not between", value1, value2, "ethaMolecular");
            return (Criteria) this;
        }

        public Criteria andEthaDenominatorIsNull() {
            addCriterion("ETHA_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andEthaDenominatorIsNotNull() {
            addCriterion("ETHA_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andEthaDenominatorEqualTo(Double value) {
            addCriterion("ETHA_DENOMINATOR =", value, "ethaDenominator");
            return (Criteria) this;
        }

        public Criteria andEthaDenominatorNotEqualTo(Double value) {
            addCriterion("ETHA_DENOMINATOR <>", value, "ethaDenominator");
            return (Criteria) this;
        }

        public Criteria andEthaDenominatorGreaterThan(Double value) {
            addCriterion("ETHA_DENOMINATOR >", value, "ethaDenominator");
            return (Criteria) this;
        }

        public Criteria andEthaDenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("ETHA_DENOMINATOR >=", value, "ethaDenominator");
            return (Criteria) this;
        }

        public Criteria andEthaDenominatorLessThan(Double value) {
            addCriterion("ETHA_DENOMINATOR <", value, "ethaDenominator");
            return (Criteria) this;
        }

        public Criteria andEthaDenominatorLessThanOrEqualTo(Double value) {
            addCriterion("ETHA_DENOMINATOR <=", value, "ethaDenominator");
            return (Criteria) this;
        }

        public Criteria andEthaDenominatorIn(List<Double> values) {
            addCriterion("ETHA_DENOMINATOR in", values, "ethaDenominator");
            return (Criteria) this;
        }

        public Criteria andEthaDenominatorNotIn(List<Double> values) {
            addCriterion("ETHA_DENOMINATOR not in", values, "ethaDenominator");
            return (Criteria) this;
        }

        public Criteria andEthaDenominatorBetween(Double value1, Double value2) {
            addCriterion("ETHA_DENOMINATOR between", value1, value2, "ethaDenominator");
            return (Criteria) this;
        }

        public Criteria andEthaDenominatorNotBetween(Double value1, Double value2) {
            addCriterion("ETHA_DENOMINATOR not between", value1, value2, "ethaDenominator");
            return (Criteria) this;
        }

        public Criteria andEthaRateIsNull() {
            addCriterion("ETHA_RATE is null");
            return (Criteria) this;
        }

        public Criteria andEthaRateIsNotNull() {
            addCriterion("ETHA_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andEthaRateEqualTo(Double value) {
            addCriterion("ETHA_RATE =", value, "ethaRate");
            return (Criteria) this;
        }

        public Criteria andEthaRateNotEqualTo(Double value) {
            addCriterion("ETHA_RATE <>", value, "ethaRate");
            return (Criteria) this;
        }

        public Criteria andEthaRateGreaterThan(Double value) {
            addCriterion("ETHA_RATE >", value, "ethaRate");
            return (Criteria) this;
        }

        public Criteria andEthaRateGreaterThanOrEqualTo(Double value) {
            addCriterion("ETHA_RATE >=", value, "ethaRate");
            return (Criteria) this;
        }

        public Criteria andEthaRateLessThan(Double value) {
            addCriterion("ETHA_RATE <", value, "ethaRate");
            return (Criteria) this;
        }

        public Criteria andEthaRateLessThanOrEqualTo(Double value) {
            addCriterion("ETHA_RATE <=", value, "ethaRate");
            return (Criteria) this;
        }

        public Criteria andEthaRateIn(List<Double> values) {
            addCriterion("ETHA_RATE in", values, "ethaRate");
            return (Criteria) this;
        }

        public Criteria andEthaRateNotIn(List<Double> values) {
            addCriterion("ETHA_RATE not in", values, "ethaRate");
            return (Criteria) this;
        }

        public Criteria andEthaRateBetween(Double value1, Double value2) {
            addCriterion("ETHA_RATE between", value1, value2, "ethaRate");
            return (Criteria) this;
        }

        public Criteria andEthaRateNotBetween(Double value1, Double value2) {
            addCriterion("ETHA_RATE not between", value1, value2, "ethaRate");
            return (Criteria) this;
        }

        public Criteria andParMolecularIsNull() {
            addCriterion("PAR_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andParMolecularIsNotNull() {
            addCriterion("PAR_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andParMolecularEqualTo(Double value) {
            addCriterion("PAR_MOLECULAR =", value, "parMolecular");
            return (Criteria) this;
        }

        public Criteria andParMolecularNotEqualTo(Double value) {
            addCriterion("PAR_MOLECULAR <>", value, "parMolecular");
            return (Criteria) this;
        }

        public Criteria andParMolecularGreaterThan(Double value) {
            addCriterion("PAR_MOLECULAR >", value, "parMolecular");
            return (Criteria) this;
        }

        public Criteria andParMolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("PAR_MOLECULAR >=", value, "parMolecular");
            return (Criteria) this;
        }

        public Criteria andParMolecularLessThan(Double value) {
            addCriterion("PAR_MOLECULAR <", value, "parMolecular");
            return (Criteria) this;
        }

        public Criteria andParMolecularLessThanOrEqualTo(Double value) {
            addCriterion("PAR_MOLECULAR <=", value, "parMolecular");
            return (Criteria) this;
        }

        public Criteria andParMolecularIn(List<Double> values) {
            addCriterion("PAR_MOLECULAR in", values, "parMolecular");
            return (Criteria) this;
        }

        public Criteria andParMolecularNotIn(List<Double> values) {
            addCriterion("PAR_MOLECULAR not in", values, "parMolecular");
            return (Criteria) this;
        }

        public Criteria andParMolecularBetween(Double value1, Double value2) {
            addCriterion("PAR_MOLECULAR between", value1, value2, "parMolecular");
            return (Criteria) this;
        }

        public Criteria andParMolecularNotBetween(Double value1, Double value2) {
            addCriterion("PAR_MOLECULAR not between", value1, value2, "parMolecular");
            return (Criteria) this;
        }

        public Criteria andParDenominatorIsNull() {
            addCriterion("PAR_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andParDenominatorIsNotNull() {
            addCriterion("PAR_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andParDenominatorEqualTo(Double value) {
            addCriterion("PAR_DENOMINATOR =", value, "parDenominator");
            return (Criteria) this;
        }

        public Criteria andParDenominatorNotEqualTo(Double value) {
            addCriterion("PAR_DENOMINATOR <>", value, "parDenominator");
            return (Criteria) this;
        }

        public Criteria andParDenominatorGreaterThan(Double value) {
            addCriterion("PAR_DENOMINATOR >", value, "parDenominator");
            return (Criteria) this;
        }

        public Criteria andParDenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("PAR_DENOMINATOR >=", value, "parDenominator");
            return (Criteria) this;
        }

        public Criteria andParDenominatorLessThan(Double value) {
            addCriterion("PAR_DENOMINATOR <", value, "parDenominator");
            return (Criteria) this;
        }

        public Criteria andParDenominatorLessThanOrEqualTo(Double value) {
            addCriterion("PAR_DENOMINATOR <=", value, "parDenominator");
            return (Criteria) this;
        }

        public Criteria andParDenominatorIn(List<Double> values) {
            addCriterion("PAR_DENOMINATOR in", values, "parDenominator");
            return (Criteria) this;
        }

        public Criteria andParDenominatorNotIn(List<Double> values) {
            addCriterion("PAR_DENOMINATOR not in", values, "parDenominator");
            return (Criteria) this;
        }

        public Criteria andParDenominatorBetween(Double value1, Double value2) {
            addCriterion("PAR_DENOMINATOR between", value1, value2, "parDenominator");
            return (Criteria) this;
        }

        public Criteria andParDenominatorNotBetween(Double value1, Double value2) {
            addCriterion("PAR_DENOMINATOR not between", value1, value2, "parDenominator");
            return (Criteria) this;
        }

        public Criteria andParRateIsNull() {
            addCriterion("PAR_RATE is null");
            return (Criteria) this;
        }

        public Criteria andParRateIsNotNull() {
            addCriterion("PAR_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andParRateEqualTo(Double value) {
            addCriterion("PAR_RATE =", value, "parRate");
            return (Criteria) this;
        }

        public Criteria andParRateNotEqualTo(Double value) {
            addCriterion("PAR_RATE <>", value, "parRate");
            return (Criteria) this;
        }

        public Criteria andParRateGreaterThan(Double value) {
            addCriterion("PAR_RATE >", value, "parRate");
            return (Criteria) this;
        }

        public Criteria andParRateGreaterThanOrEqualTo(Double value) {
            addCriterion("PAR_RATE >=", value, "parRate");
            return (Criteria) this;
        }

        public Criteria andParRateLessThan(Double value) {
            addCriterion("PAR_RATE <", value, "parRate");
            return (Criteria) this;
        }

        public Criteria andParRateLessThanOrEqualTo(Double value) {
            addCriterion("PAR_RATE <=", value, "parRate");
            return (Criteria) this;
        }

        public Criteria andParRateIn(List<Double> values) {
            addCriterion("PAR_RATE in", values, "parRate");
            return (Criteria) this;
        }

        public Criteria andParRateNotIn(List<Double> values) {
            addCriterion("PAR_RATE not in", values, "parRate");
            return (Criteria) this;
        }

        public Criteria andParRateBetween(Double value1, Double value2) {
            addCriterion("PAR_RATE between", value1, value2, "parRate");
            return (Criteria) this;
        }

        public Criteria andParRateNotBetween(Double value1, Double value2) {
            addCriterion("PAR_RATE not between", value1, value2, "parRate");
            return (Criteria) this;
        }

        public Criteria andEthMolecularIsNull() {
            addCriterion("ETH_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andEthMolecularIsNotNull() {
            addCriterion("ETH_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andEthMolecularEqualTo(Double value) {
            addCriterion("ETH_MOLECULAR =", value, "ethMolecular");
            return (Criteria) this;
        }

        public Criteria andEthMolecularNotEqualTo(Double value) {
            addCriterion("ETH_MOLECULAR <>", value, "ethMolecular");
            return (Criteria) this;
        }

        public Criteria andEthMolecularGreaterThan(Double value) {
            addCriterion("ETH_MOLECULAR >", value, "ethMolecular");
            return (Criteria) this;
        }

        public Criteria andEthMolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("ETH_MOLECULAR >=", value, "ethMolecular");
            return (Criteria) this;
        }

        public Criteria andEthMolecularLessThan(Double value) {
            addCriterion("ETH_MOLECULAR <", value, "ethMolecular");
            return (Criteria) this;
        }

        public Criteria andEthMolecularLessThanOrEqualTo(Double value) {
            addCriterion("ETH_MOLECULAR <=", value, "ethMolecular");
            return (Criteria) this;
        }

        public Criteria andEthMolecularIn(List<Double> values) {
            addCriterion("ETH_MOLECULAR in", values, "ethMolecular");
            return (Criteria) this;
        }

        public Criteria andEthMolecularNotIn(List<Double> values) {
            addCriterion("ETH_MOLECULAR not in", values, "ethMolecular");
            return (Criteria) this;
        }

        public Criteria andEthMolecularBetween(Double value1, Double value2) {
            addCriterion("ETH_MOLECULAR between", value1, value2, "ethMolecular");
            return (Criteria) this;
        }

        public Criteria andEthMolecularNotBetween(Double value1, Double value2) {
            addCriterion("ETH_MOLECULAR not between", value1, value2, "ethMolecular");
            return (Criteria) this;
        }

        public Criteria andEthDenominatorIsNull() {
            addCriterion("ETH_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andEthDenominatorIsNotNull() {
            addCriterion("ETH_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andEthDenominatorEqualTo(Double value) {
            addCriterion("ETH_DENOMINATOR =", value, "ethDenominator");
            return (Criteria) this;
        }

        public Criteria andEthDenominatorNotEqualTo(Double value) {
            addCriterion("ETH_DENOMINATOR <>", value, "ethDenominator");
            return (Criteria) this;
        }

        public Criteria andEthDenominatorGreaterThan(Double value) {
            addCriterion("ETH_DENOMINATOR >", value, "ethDenominator");
            return (Criteria) this;
        }

        public Criteria andEthDenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("ETH_DENOMINATOR >=", value, "ethDenominator");
            return (Criteria) this;
        }

        public Criteria andEthDenominatorLessThan(Double value) {
            addCriterion("ETH_DENOMINATOR <", value, "ethDenominator");
            return (Criteria) this;
        }

        public Criteria andEthDenominatorLessThanOrEqualTo(Double value) {
            addCriterion("ETH_DENOMINATOR <=", value, "ethDenominator");
            return (Criteria) this;
        }

        public Criteria andEthDenominatorIn(List<Double> values) {
            addCriterion("ETH_DENOMINATOR in", values, "ethDenominator");
            return (Criteria) this;
        }

        public Criteria andEthDenominatorNotIn(List<Double> values) {
            addCriterion("ETH_DENOMINATOR not in", values, "ethDenominator");
            return (Criteria) this;
        }

        public Criteria andEthDenominatorBetween(Double value1, Double value2) {
            addCriterion("ETH_DENOMINATOR between", value1, value2, "ethDenominator");
            return (Criteria) this;
        }

        public Criteria andEthDenominatorNotBetween(Double value1, Double value2) {
            addCriterion("ETH_DENOMINATOR not between", value1, value2, "ethDenominator");
            return (Criteria) this;
        }

        public Criteria andEthRateIsNull() {
            addCriterion("ETH_RATE is null");
            return (Criteria) this;
        }

        public Criteria andEthRateIsNotNull() {
            addCriterion("ETH_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andEthRateEqualTo(Double value) {
            addCriterion("ETH_RATE =", value, "ethRate");
            return (Criteria) this;
        }

        public Criteria andEthRateNotEqualTo(Double value) {
            addCriterion("ETH_RATE <>", value, "ethRate");
            return (Criteria) this;
        }

        public Criteria andEthRateGreaterThan(Double value) {
            addCriterion("ETH_RATE >", value, "ethRate");
            return (Criteria) this;
        }

        public Criteria andEthRateGreaterThanOrEqualTo(Double value) {
            addCriterion("ETH_RATE >=", value, "ethRate");
            return (Criteria) this;
        }

        public Criteria andEthRateLessThan(Double value) {
            addCriterion("ETH_RATE <", value, "ethRate");
            return (Criteria) this;
        }

        public Criteria andEthRateLessThanOrEqualTo(Double value) {
            addCriterion("ETH_RATE <=", value, "ethRate");
            return (Criteria) this;
        }

        public Criteria andEthRateIn(List<Double> values) {
            addCriterion("ETH_RATE in", values, "ethRate");
            return (Criteria) this;
        }

        public Criteria andEthRateNotIn(List<Double> values) {
            addCriterion("ETH_RATE not in", values, "ethRate");
            return (Criteria) this;
        }

        public Criteria andEthRateBetween(Double value1, Double value2) {
            addCriterion("ETH_RATE between", value1, value2, "ethRate");
            return (Criteria) this;
        }

        public Criteria andEthRateNotBetween(Double value1, Double value2) {
            addCriterion("ETH_RATE not between", value1, value2, "ethRate");
            return (Criteria) this;
        }

        public Criteria andOleMolecularIsNull() {
            addCriterion("OLE_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andOleMolecularIsNotNull() {
            addCriterion("OLE_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andOleMolecularEqualTo(Double value) {
            addCriterion("OLE_MOLECULAR =", value, "oleMolecular");
            return (Criteria) this;
        }

        public Criteria andOleMolecularNotEqualTo(Double value) {
            addCriterion("OLE_MOLECULAR <>", value, "oleMolecular");
            return (Criteria) this;
        }

        public Criteria andOleMolecularGreaterThan(Double value) {
            addCriterion("OLE_MOLECULAR >", value, "oleMolecular");
            return (Criteria) this;
        }

        public Criteria andOleMolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("OLE_MOLECULAR >=", value, "oleMolecular");
            return (Criteria) this;
        }

        public Criteria andOleMolecularLessThan(Double value) {
            addCriterion("OLE_MOLECULAR <", value, "oleMolecular");
            return (Criteria) this;
        }

        public Criteria andOleMolecularLessThanOrEqualTo(Double value) {
            addCriterion("OLE_MOLECULAR <=", value, "oleMolecular");
            return (Criteria) this;
        }

        public Criteria andOleMolecularIn(List<Double> values) {
            addCriterion("OLE_MOLECULAR in", values, "oleMolecular");
            return (Criteria) this;
        }

        public Criteria andOleMolecularNotIn(List<Double> values) {
            addCriterion("OLE_MOLECULAR not in", values, "oleMolecular");
            return (Criteria) this;
        }

        public Criteria andOleMolecularBetween(Double value1, Double value2) {
            addCriterion("OLE_MOLECULAR between", value1, value2, "oleMolecular");
            return (Criteria) this;
        }

        public Criteria andOleMolecularNotBetween(Double value1, Double value2) {
            addCriterion("OLE_MOLECULAR not between", value1, value2, "oleMolecular");
            return (Criteria) this;
        }

        public Criteria andOleDenominatorIsNull() {
            addCriterion("OLE_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andOleDenominatorIsNotNull() {
            addCriterion("OLE_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andOleDenominatorEqualTo(Double value) {
            addCriterion("OLE_DENOMINATOR =", value, "oleDenominator");
            return (Criteria) this;
        }

        public Criteria andOleDenominatorNotEqualTo(Double value) {
            addCriterion("OLE_DENOMINATOR <>", value, "oleDenominator");
            return (Criteria) this;
        }

        public Criteria andOleDenominatorGreaterThan(Double value) {
            addCriterion("OLE_DENOMINATOR >", value, "oleDenominator");
            return (Criteria) this;
        }

        public Criteria andOleDenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("OLE_DENOMINATOR >=", value, "oleDenominator");
            return (Criteria) this;
        }

        public Criteria andOleDenominatorLessThan(Double value) {
            addCriterion("OLE_DENOMINATOR <", value, "oleDenominator");
            return (Criteria) this;
        }

        public Criteria andOleDenominatorLessThanOrEqualTo(Double value) {
            addCriterion("OLE_DENOMINATOR <=", value, "oleDenominator");
            return (Criteria) this;
        }

        public Criteria andOleDenominatorIn(List<Double> values) {
            addCriterion("OLE_DENOMINATOR in", values, "oleDenominator");
            return (Criteria) this;
        }

        public Criteria andOleDenominatorNotIn(List<Double> values) {
            addCriterion("OLE_DENOMINATOR not in", values, "oleDenominator");
            return (Criteria) this;
        }

        public Criteria andOleDenominatorBetween(Double value1, Double value2) {
            addCriterion("OLE_DENOMINATOR between", value1, value2, "oleDenominator");
            return (Criteria) this;
        }

        public Criteria andOleDenominatorNotBetween(Double value1, Double value2) {
            addCriterion("OLE_DENOMINATOR not between", value1, value2, "oleDenominator");
            return (Criteria) this;
        }

        public Criteria andOleRateIsNull() {
            addCriterion("OLE_RATE is null");
            return (Criteria) this;
        }

        public Criteria andOleRateIsNotNull() {
            addCriterion("OLE_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andOleRateEqualTo(Double value) {
            addCriterion("OLE_RATE =", value, "oleRate");
            return (Criteria) this;
        }

        public Criteria andOleRateNotEqualTo(Double value) {
            addCriterion("OLE_RATE <>", value, "oleRate");
            return (Criteria) this;
        }

        public Criteria andOleRateGreaterThan(Double value) {
            addCriterion("OLE_RATE >", value, "oleRate");
            return (Criteria) this;
        }

        public Criteria andOleRateGreaterThanOrEqualTo(Double value) {
            addCriterion("OLE_RATE >=", value, "oleRate");
            return (Criteria) this;
        }

        public Criteria andOleRateLessThan(Double value) {
            addCriterion("OLE_RATE <", value, "oleRate");
            return (Criteria) this;
        }

        public Criteria andOleRateLessThanOrEqualTo(Double value) {
            addCriterion("OLE_RATE <=", value, "oleRate");
            return (Criteria) this;
        }

        public Criteria andOleRateIn(List<Double> values) {
            addCriterion("OLE_RATE in", values, "oleRate");
            return (Criteria) this;
        }

        public Criteria andOleRateNotIn(List<Double> values) {
            addCriterion("OLE_RATE not in", values, "oleRate");
            return (Criteria) this;
        }

        public Criteria andOleRateBetween(Double value1, Double value2) {
            addCriterion("OLE_RATE between", value1, value2, "oleRate");
            return (Criteria) this;
        }

        public Criteria andOleRateNotBetween(Double value1, Double value2) {
            addCriterion("OLE_RATE not between", value1, value2, "oleRate");
            return (Criteria) this;
        }

        public Criteria andIoleMolecularIsNull() {
            addCriterion("IOLE_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andIoleMolecularIsNotNull() {
            addCriterion("IOLE_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andIoleMolecularEqualTo(Double value) {
            addCriterion("IOLE_MOLECULAR =", value, "ioleMolecular");
            return (Criteria) this;
        }

        public Criteria andIoleMolecularNotEqualTo(Double value) {
            addCriterion("IOLE_MOLECULAR <>", value, "ioleMolecular");
            return (Criteria) this;
        }

        public Criteria andIoleMolecularGreaterThan(Double value) {
            addCriterion("IOLE_MOLECULAR >", value, "ioleMolecular");
            return (Criteria) this;
        }

        public Criteria andIoleMolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("IOLE_MOLECULAR >=", value, "ioleMolecular");
            return (Criteria) this;
        }

        public Criteria andIoleMolecularLessThan(Double value) {
            addCriterion("IOLE_MOLECULAR <", value, "ioleMolecular");
            return (Criteria) this;
        }

        public Criteria andIoleMolecularLessThanOrEqualTo(Double value) {
            addCriterion("IOLE_MOLECULAR <=", value, "ioleMolecular");
            return (Criteria) this;
        }

        public Criteria andIoleMolecularIn(List<Double> values) {
            addCriterion("IOLE_MOLECULAR in", values, "ioleMolecular");
            return (Criteria) this;
        }

        public Criteria andIoleMolecularNotIn(List<Double> values) {
            addCriterion("IOLE_MOLECULAR not in", values, "ioleMolecular");
            return (Criteria) this;
        }

        public Criteria andIoleMolecularBetween(Double value1, Double value2) {
            addCriterion("IOLE_MOLECULAR between", value1, value2, "ioleMolecular");
            return (Criteria) this;
        }

        public Criteria andIoleMolecularNotBetween(Double value1, Double value2) {
            addCriterion("IOLE_MOLECULAR not between", value1, value2, "ioleMolecular");
            return (Criteria) this;
        }

        public Criteria andIoleDenominatorIsNull() {
            addCriterion("IOLE_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andIoleDenominatorIsNotNull() {
            addCriterion("IOLE_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andIoleDenominatorEqualTo(Double value) {
            addCriterion("IOLE_DENOMINATOR =", value, "ioleDenominator");
            return (Criteria) this;
        }

        public Criteria andIoleDenominatorNotEqualTo(Double value) {
            addCriterion("IOLE_DENOMINATOR <>", value, "ioleDenominator");
            return (Criteria) this;
        }

        public Criteria andIoleDenominatorGreaterThan(Double value) {
            addCriterion("IOLE_DENOMINATOR >", value, "ioleDenominator");
            return (Criteria) this;
        }

        public Criteria andIoleDenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("IOLE_DENOMINATOR >=", value, "ioleDenominator");
            return (Criteria) this;
        }

        public Criteria andIoleDenominatorLessThan(Double value) {
            addCriterion("IOLE_DENOMINATOR <", value, "ioleDenominator");
            return (Criteria) this;
        }

        public Criteria andIoleDenominatorLessThanOrEqualTo(Double value) {
            addCriterion("IOLE_DENOMINATOR <=", value, "ioleDenominator");
            return (Criteria) this;
        }

        public Criteria andIoleDenominatorIn(List<Double> values) {
            addCriterion("IOLE_DENOMINATOR in", values, "ioleDenominator");
            return (Criteria) this;
        }

        public Criteria andIoleDenominatorNotIn(List<Double> values) {
            addCriterion("IOLE_DENOMINATOR not in", values, "ioleDenominator");
            return (Criteria) this;
        }

        public Criteria andIoleDenominatorBetween(Double value1, Double value2) {
            addCriterion("IOLE_DENOMINATOR between", value1, value2, "ioleDenominator");
            return (Criteria) this;
        }

        public Criteria andIoleDenominatorNotBetween(Double value1, Double value2) {
            addCriterion("IOLE_DENOMINATOR not between", value1, value2, "ioleDenominator");
            return (Criteria) this;
        }

        public Criteria andIoleRateIsNull() {
            addCriterion("IOLE_RATE is null");
            return (Criteria) this;
        }

        public Criteria andIoleRateIsNotNull() {
            addCriterion("IOLE_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andIoleRateEqualTo(Double value) {
            addCriterion("IOLE_RATE =", value, "ioleRate");
            return (Criteria) this;
        }

        public Criteria andIoleRateNotEqualTo(Double value) {
            addCriterion("IOLE_RATE <>", value, "ioleRate");
            return (Criteria) this;
        }

        public Criteria andIoleRateGreaterThan(Double value) {
            addCriterion("IOLE_RATE >", value, "ioleRate");
            return (Criteria) this;
        }

        public Criteria andIoleRateGreaterThanOrEqualTo(Double value) {
            addCriterion("IOLE_RATE >=", value, "ioleRate");
            return (Criteria) this;
        }

        public Criteria andIoleRateLessThan(Double value) {
            addCriterion("IOLE_RATE <", value, "ioleRate");
            return (Criteria) this;
        }

        public Criteria andIoleRateLessThanOrEqualTo(Double value) {
            addCriterion("IOLE_RATE <=", value, "ioleRate");
            return (Criteria) this;
        }

        public Criteria andIoleRateIn(List<Double> values) {
            addCriterion("IOLE_RATE in", values, "ioleRate");
            return (Criteria) this;
        }

        public Criteria andIoleRateNotIn(List<Double> values) {
            addCriterion("IOLE_RATE not in", values, "ioleRate");
            return (Criteria) this;
        }

        public Criteria andIoleRateBetween(Double value1, Double value2) {
            addCriterion("IOLE_RATE between", value1, value2, "ioleRate");
            return (Criteria) this;
        }

        public Criteria andIoleRateNotBetween(Double value1, Double value2) {
            addCriterion("IOLE_RATE not between", value1, value2, "ioleRate");
            return (Criteria) this;
        }

        public Criteria andIsopMolecularIsNull() {
            addCriterion("ISOP_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andIsopMolecularIsNotNull() {
            addCriterion("ISOP_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andIsopMolecularEqualTo(Double value) {
            addCriterion("ISOP_MOLECULAR =", value, "isopMolecular");
            return (Criteria) this;
        }

        public Criteria andIsopMolecularNotEqualTo(Double value) {
            addCriterion("ISOP_MOLECULAR <>", value, "isopMolecular");
            return (Criteria) this;
        }

        public Criteria andIsopMolecularGreaterThan(Double value) {
            addCriterion("ISOP_MOLECULAR >", value, "isopMolecular");
            return (Criteria) this;
        }

        public Criteria andIsopMolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("ISOP_MOLECULAR >=", value, "isopMolecular");
            return (Criteria) this;
        }

        public Criteria andIsopMolecularLessThan(Double value) {
            addCriterion("ISOP_MOLECULAR <", value, "isopMolecular");
            return (Criteria) this;
        }

        public Criteria andIsopMolecularLessThanOrEqualTo(Double value) {
            addCriterion("ISOP_MOLECULAR <=", value, "isopMolecular");
            return (Criteria) this;
        }

        public Criteria andIsopMolecularIn(List<Double> values) {
            addCriterion("ISOP_MOLECULAR in", values, "isopMolecular");
            return (Criteria) this;
        }

        public Criteria andIsopMolecularNotIn(List<Double> values) {
            addCriterion("ISOP_MOLECULAR not in", values, "isopMolecular");
            return (Criteria) this;
        }

        public Criteria andIsopMolecularBetween(Double value1, Double value2) {
            addCriterion("ISOP_MOLECULAR between", value1, value2, "isopMolecular");
            return (Criteria) this;
        }

        public Criteria andIsopMolecularNotBetween(Double value1, Double value2) {
            addCriterion("ISOP_MOLECULAR not between", value1, value2, "isopMolecular");
            return (Criteria) this;
        }

        public Criteria andIsopDenominatorIsNull() {
            addCriterion("ISOP_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andIsopDenominatorIsNotNull() {
            addCriterion("ISOP_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andIsopDenominatorEqualTo(Double value) {
            addCriterion("ISOP_DENOMINATOR =", value, "isopDenominator");
            return (Criteria) this;
        }

        public Criteria andIsopDenominatorNotEqualTo(Double value) {
            addCriterion("ISOP_DENOMINATOR <>", value, "isopDenominator");
            return (Criteria) this;
        }

        public Criteria andIsopDenominatorGreaterThan(Double value) {
            addCriterion("ISOP_DENOMINATOR >", value, "isopDenominator");
            return (Criteria) this;
        }

        public Criteria andIsopDenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("ISOP_DENOMINATOR >=", value, "isopDenominator");
            return (Criteria) this;
        }

        public Criteria andIsopDenominatorLessThan(Double value) {
            addCriterion("ISOP_DENOMINATOR <", value, "isopDenominator");
            return (Criteria) this;
        }

        public Criteria andIsopDenominatorLessThanOrEqualTo(Double value) {
            addCriterion("ISOP_DENOMINATOR <=", value, "isopDenominator");
            return (Criteria) this;
        }

        public Criteria andIsopDenominatorIn(List<Double> values) {
            addCriterion("ISOP_DENOMINATOR in", values, "isopDenominator");
            return (Criteria) this;
        }

        public Criteria andIsopDenominatorNotIn(List<Double> values) {
            addCriterion("ISOP_DENOMINATOR not in", values, "isopDenominator");
            return (Criteria) this;
        }

        public Criteria andIsopDenominatorBetween(Double value1, Double value2) {
            addCriterion("ISOP_DENOMINATOR between", value1, value2, "isopDenominator");
            return (Criteria) this;
        }

        public Criteria andIsopDenominatorNotBetween(Double value1, Double value2) {
            addCriterion("ISOP_DENOMINATOR not between", value1, value2, "isopDenominator");
            return (Criteria) this;
        }

        public Criteria andIsopRateIsNull() {
            addCriterion("ISOP_RATE is null");
            return (Criteria) this;
        }

        public Criteria andIsopRateIsNotNull() {
            addCriterion("ISOP_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andIsopRateEqualTo(Double value) {
            addCriterion("ISOP_RATE =", value, "isopRate");
            return (Criteria) this;
        }

        public Criteria andIsopRateNotEqualTo(Double value) {
            addCriterion("ISOP_RATE <>", value, "isopRate");
            return (Criteria) this;
        }

        public Criteria andIsopRateGreaterThan(Double value) {
            addCriterion("ISOP_RATE >", value, "isopRate");
            return (Criteria) this;
        }

        public Criteria andIsopRateGreaterThanOrEqualTo(Double value) {
            addCriterion("ISOP_RATE >=", value, "isopRate");
            return (Criteria) this;
        }

        public Criteria andIsopRateLessThan(Double value) {
            addCriterion("ISOP_RATE <", value, "isopRate");
            return (Criteria) this;
        }

        public Criteria andIsopRateLessThanOrEqualTo(Double value) {
            addCriterion("ISOP_RATE <=", value, "isopRate");
            return (Criteria) this;
        }

        public Criteria andIsopRateIn(List<Double> values) {
            addCriterion("ISOP_RATE in", values, "isopRate");
            return (Criteria) this;
        }

        public Criteria andIsopRateNotIn(List<Double> values) {
            addCriterion("ISOP_RATE not in", values, "isopRate");
            return (Criteria) this;
        }

        public Criteria andIsopRateBetween(Double value1, Double value2) {
            addCriterion("ISOP_RATE between", value1, value2, "isopRate");
            return (Criteria) this;
        }

        public Criteria andIsopRateNotBetween(Double value1, Double value2) {
            addCriterion("ISOP_RATE not between", value1, value2, "isopRate");
            return (Criteria) this;
        }

        public Criteria andTerpMolecularIsNull() {
            addCriterion("TERP_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andTerpMolecularIsNotNull() {
            addCriterion("TERP_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andTerpMolecularEqualTo(Double value) {
            addCriterion("TERP_MOLECULAR =", value, "terpMolecular");
            return (Criteria) this;
        }

        public Criteria andTerpMolecularNotEqualTo(Double value) {
            addCriterion("TERP_MOLECULAR <>", value, "terpMolecular");
            return (Criteria) this;
        }

        public Criteria andTerpMolecularGreaterThan(Double value) {
            addCriterion("TERP_MOLECULAR >", value, "terpMolecular");
            return (Criteria) this;
        }

        public Criteria andTerpMolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("TERP_MOLECULAR >=", value, "terpMolecular");
            return (Criteria) this;
        }

        public Criteria andTerpMolecularLessThan(Double value) {
            addCriterion("TERP_MOLECULAR <", value, "terpMolecular");
            return (Criteria) this;
        }

        public Criteria andTerpMolecularLessThanOrEqualTo(Double value) {
            addCriterion("TERP_MOLECULAR <=", value, "terpMolecular");
            return (Criteria) this;
        }

        public Criteria andTerpMolecularIn(List<Double> values) {
            addCriterion("TERP_MOLECULAR in", values, "terpMolecular");
            return (Criteria) this;
        }

        public Criteria andTerpMolecularNotIn(List<Double> values) {
            addCriterion("TERP_MOLECULAR not in", values, "terpMolecular");
            return (Criteria) this;
        }

        public Criteria andTerpMolecularBetween(Double value1, Double value2) {
            addCriterion("TERP_MOLECULAR between", value1, value2, "terpMolecular");
            return (Criteria) this;
        }

        public Criteria andTerpMolecularNotBetween(Double value1, Double value2) {
            addCriterion("TERP_MOLECULAR not between", value1, value2, "terpMolecular");
            return (Criteria) this;
        }

        public Criteria andTerpDenominatorIsNull() {
            addCriterion("TERP_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andTerpDenominatorIsNotNull() {
            addCriterion("TERP_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andTerpDenominatorEqualTo(Double value) {
            addCriterion("TERP_DENOMINATOR =", value, "terpDenominator");
            return (Criteria) this;
        }

        public Criteria andTerpDenominatorNotEqualTo(Double value) {
            addCriterion("TERP_DENOMINATOR <>", value, "terpDenominator");
            return (Criteria) this;
        }

        public Criteria andTerpDenominatorGreaterThan(Double value) {
            addCriterion("TERP_DENOMINATOR >", value, "terpDenominator");
            return (Criteria) this;
        }

        public Criteria andTerpDenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("TERP_DENOMINATOR >=", value, "terpDenominator");
            return (Criteria) this;
        }

        public Criteria andTerpDenominatorLessThan(Double value) {
            addCriterion("TERP_DENOMINATOR <", value, "terpDenominator");
            return (Criteria) this;
        }

        public Criteria andTerpDenominatorLessThanOrEqualTo(Double value) {
            addCriterion("TERP_DENOMINATOR <=", value, "terpDenominator");
            return (Criteria) this;
        }

        public Criteria andTerpDenominatorIn(List<Double> values) {
            addCriterion("TERP_DENOMINATOR in", values, "terpDenominator");
            return (Criteria) this;
        }

        public Criteria andTerpDenominatorNotIn(List<Double> values) {
            addCriterion("TERP_DENOMINATOR not in", values, "terpDenominator");
            return (Criteria) this;
        }

        public Criteria andTerpDenominatorBetween(Double value1, Double value2) {
            addCriterion("TERP_DENOMINATOR between", value1, value2, "terpDenominator");
            return (Criteria) this;
        }

        public Criteria andTerpDenominatorNotBetween(Double value1, Double value2) {
            addCriterion("TERP_DENOMINATOR not between", value1, value2, "terpDenominator");
            return (Criteria) this;
        }

        public Criteria andTerpRateIsNull() {
            addCriterion("TERP_RATE is null");
            return (Criteria) this;
        }

        public Criteria andTerpRateIsNotNull() {
            addCriterion("TERP_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andTerpRateEqualTo(Double value) {
            addCriterion("TERP_RATE =", value, "terpRate");
            return (Criteria) this;
        }

        public Criteria andTerpRateNotEqualTo(Double value) {
            addCriterion("TERP_RATE <>", value, "terpRate");
            return (Criteria) this;
        }

        public Criteria andTerpRateGreaterThan(Double value) {
            addCriterion("TERP_RATE >", value, "terpRate");
            return (Criteria) this;
        }

        public Criteria andTerpRateGreaterThanOrEqualTo(Double value) {
            addCriterion("TERP_RATE >=", value, "terpRate");
            return (Criteria) this;
        }

        public Criteria andTerpRateLessThan(Double value) {
            addCriterion("TERP_RATE <", value, "terpRate");
            return (Criteria) this;
        }

        public Criteria andTerpRateLessThanOrEqualTo(Double value) {
            addCriterion("TERP_RATE <=", value, "terpRate");
            return (Criteria) this;
        }

        public Criteria andTerpRateIn(List<Double> values) {
            addCriterion("TERP_RATE in", values, "terpRate");
            return (Criteria) this;
        }

        public Criteria andTerpRateNotIn(List<Double> values) {
            addCriterion("TERP_RATE not in", values, "terpRate");
            return (Criteria) this;
        }

        public Criteria andTerpRateBetween(Double value1, Double value2) {
            addCriterion("TERP_RATE between", value1, value2, "terpRate");
            return (Criteria) this;
        }

        public Criteria andTerpRateNotBetween(Double value1, Double value2) {
            addCriterion("TERP_RATE not between", value1, value2, "terpRate");
            return (Criteria) this;
        }

        public Criteria andTolMolecularIsNull() {
            addCriterion("TOL_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andTolMolecularIsNotNull() {
            addCriterion("TOL_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andTolMolecularEqualTo(Double value) {
            addCriterion("TOL_MOLECULAR =", value, "tolMolecular");
            return (Criteria) this;
        }

        public Criteria andTolMolecularNotEqualTo(Double value) {
            addCriterion("TOL_MOLECULAR <>", value, "tolMolecular");
            return (Criteria) this;
        }

        public Criteria andTolMolecularGreaterThan(Double value) {
            addCriterion("TOL_MOLECULAR >", value, "tolMolecular");
            return (Criteria) this;
        }

        public Criteria andTolMolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("TOL_MOLECULAR >=", value, "tolMolecular");
            return (Criteria) this;
        }

        public Criteria andTolMolecularLessThan(Double value) {
            addCriterion("TOL_MOLECULAR <", value, "tolMolecular");
            return (Criteria) this;
        }

        public Criteria andTolMolecularLessThanOrEqualTo(Double value) {
            addCriterion("TOL_MOLECULAR <=", value, "tolMolecular");
            return (Criteria) this;
        }

        public Criteria andTolMolecularIn(List<Double> values) {
            addCriterion("TOL_MOLECULAR in", values, "tolMolecular");
            return (Criteria) this;
        }

        public Criteria andTolMolecularNotIn(List<Double> values) {
            addCriterion("TOL_MOLECULAR not in", values, "tolMolecular");
            return (Criteria) this;
        }

        public Criteria andTolMolecularBetween(Double value1, Double value2) {
            addCriterion("TOL_MOLECULAR between", value1, value2, "tolMolecular");
            return (Criteria) this;
        }

        public Criteria andTolMolecularNotBetween(Double value1, Double value2) {
            addCriterion("TOL_MOLECULAR not between", value1, value2, "tolMolecular");
            return (Criteria) this;
        }

        public Criteria andTolDenominatorIsNull() {
            addCriterion("TOL_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andTolDenominatorIsNotNull() {
            addCriterion("TOL_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andTolDenominatorEqualTo(Double value) {
            addCriterion("TOL_DENOMINATOR =", value, "tolDenominator");
            return (Criteria) this;
        }

        public Criteria andTolDenominatorNotEqualTo(Double value) {
            addCriterion("TOL_DENOMINATOR <>", value, "tolDenominator");
            return (Criteria) this;
        }

        public Criteria andTolDenominatorGreaterThan(Double value) {
            addCriterion("TOL_DENOMINATOR >", value, "tolDenominator");
            return (Criteria) this;
        }

        public Criteria andTolDenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("TOL_DENOMINATOR >=", value, "tolDenominator");
            return (Criteria) this;
        }

        public Criteria andTolDenominatorLessThan(Double value) {
            addCriterion("TOL_DENOMINATOR <", value, "tolDenominator");
            return (Criteria) this;
        }

        public Criteria andTolDenominatorLessThanOrEqualTo(Double value) {
            addCriterion("TOL_DENOMINATOR <=", value, "tolDenominator");
            return (Criteria) this;
        }

        public Criteria andTolDenominatorIn(List<Double> values) {
            addCriterion("TOL_DENOMINATOR in", values, "tolDenominator");
            return (Criteria) this;
        }

        public Criteria andTolDenominatorNotIn(List<Double> values) {
            addCriterion("TOL_DENOMINATOR not in", values, "tolDenominator");
            return (Criteria) this;
        }

        public Criteria andTolDenominatorBetween(Double value1, Double value2) {
            addCriterion("TOL_DENOMINATOR between", value1, value2, "tolDenominator");
            return (Criteria) this;
        }

        public Criteria andTolDenominatorNotBetween(Double value1, Double value2) {
            addCriterion("TOL_DENOMINATOR not between", value1, value2, "tolDenominator");
            return (Criteria) this;
        }

        public Criteria andTolRateIsNull() {
            addCriterion("TOL_RATE is null");
            return (Criteria) this;
        }

        public Criteria andTolRateIsNotNull() {
            addCriterion("TOL_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andTolRateEqualTo(Double value) {
            addCriterion("TOL_RATE =", value, "tolRate");
            return (Criteria) this;
        }

        public Criteria andTolRateNotEqualTo(Double value) {
            addCriterion("TOL_RATE <>", value, "tolRate");
            return (Criteria) this;
        }

        public Criteria andTolRateGreaterThan(Double value) {
            addCriterion("TOL_RATE >", value, "tolRate");
            return (Criteria) this;
        }

        public Criteria andTolRateGreaterThanOrEqualTo(Double value) {
            addCriterion("TOL_RATE >=", value, "tolRate");
            return (Criteria) this;
        }

        public Criteria andTolRateLessThan(Double value) {
            addCriterion("TOL_RATE <", value, "tolRate");
            return (Criteria) this;
        }

        public Criteria andTolRateLessThanOrEqualTo(Double value) {
            addCriterion("TOL_RATE <=", value, "tolRate");
            return (Criteria) this;
        }

        public Criteria andTolRateIn(List<Double> values) {
            addCriterion("TOL_RATE in", values, "tolRate");
            return (Criteria) this;
        }

        public Criteria andTolRateNotIn(List<Double> values) {
            addCriterion("TOL_RATE not in", values, "tolRate");
            return (Criteria) this;
        }

        public Criteria andTolRateBetween(Double value1, Double value2) {
            addCriterion("TOL_RATE between", value1, value2, "tolRate");
            return (Criteria) this;
        }

        public Criteria andTolRateNotBetween(Double value1, Double value2) {
            addCriterion("TOL_RATE not between", value1, value2, "tolRate");
            return (Criteria) this;
        }

        public Criteria andXylMolecularIsNull() {
            addCriterion("XYL_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andXylMolecularIsNotNull() {
            addCriterion("XYL_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andXylMolecularEqualTo(Double value) {
            addCriterion("XYL_MOLECULAR =", value, "xylMolecular");
            return (Criteria) this;
        }

        public Criteria andXylMolecularNotEqualTo(Double value) {
            addCriterion("XYL_MOLECULAR <>", value, "xylMolecular");
            return (Criteria) this;
        }

        public Criteria andXylMolecularGreaterThan(Double value) {
            addCriterion("XYL_MOLECULAR >", value, "xylMolecular");
            return (Criteria) this;
        }

        public Criteria andXylMolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("XYL_MOLECULAR >=", value, "xylMolecular");
            return (Criteria) this;
        }

        public Criteria andXylMolecularLessThan(Double value) {
            addCriterion("XYL_MOLECULAR <", value, "xylMolecular");
            return (Criteria) this;
        }

        public Criteria andXylMolecularLessThanOrEqualTo(Double value) {
            addCriterion("XYL_MOLECULAR <=", value, "xylMolecular");
            return (Criteria) this;
        }

        public Criteria andXylMolecularIn(List<Double> values) {
            addCriterion("XYL_MOLECULAR in", values, "xylMolecular");
            return (Criteria) this;
        }

        public Criteria andXylMolecularNotIn(List<Double> values) {
            addCriterion("XYL_MOLECULAR not in", values, "xylMolecular");
            return (Criteria) this;
        }

        public Criteria andXylMolecularBetween(Double value1, Double value2) {
            addCriterion("XYL_MOLECULAR between", value1, value2, "xylMolecular");
            return (Criteria) this;
        }

        public Criteria andXylMolecularNotBetween(Double value1, Double value2) {
            addCriterion("XYL_MOLECULAR not between", value1, value2, "xylMolecular");
            return (Criteria) this;
        }

        public Criteria andXylDenominatorIsNull() {
            addCriterion("XYL_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andXylDenominatorIsNotNull() {
            addCriterion("XYL_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andXylDenominatorEqualTo(Double value) {
            addCriterion("XYL_DENOMINATOR =", value, "xylDenominator");
            return (Criteria) this;
        }

        public Criteria andXylDenominatorNotEqualTo(Double value) {
            addCriterion("XYL_DENOMINATOR <>", value, "xylDenominator");
            return (Criteria) this;
        }

        public Criteria andXylDenominatorGreaterThan(Double value) {
            addCriterion("XYL_DENOMINATOR >", value, "xylDenominator");
            return (Criteria) this;
        }

        public Criteria andXylDenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("XYL_DENOMINATOR >=", value, "xylDenominator");
            return (Criteria) this;
        }

        public Criteria andXylDenominatorLessThan(Double value) {
            addCriterion("XYL_DENOMINATOR <", value, "xylDenominator");
            return (Criteria) this;
        }

        public Criteria andXylDenominatorLessThanOrEqualTo(Double value) {
            addCriterion("XYL_DENOMINATOR <=", value, "xylDenominator");
            return (Criteria) this;
        }

        public Criteria andXylDenominatorIn(List<Double> values) {
            addCriterion("XYL_DENOMINATOR in", values, "xylDenominator");
            return (Criteria) this;
        }

        public Criteria andXylDenominatorNotIn(List<Double> values) {
            addCriterion("XYL_DENOMINATOR not in", values, "xylDenominator");
            return (Criteria) this;
        }

        public Criteria andXylDenominatorBetween(Double value1, Double value2) {
            addCriterion("XYL_DENOMINATOR between", value1, value2, "xylDenominator");
            return (Criteria) this;
        }

        public Criteria andXylDenominatorNotBetween(Double value1, Double value2) {
            addCriterion("XYL_DENOMINATOR not between", value1, value2, "xylDenominator");
            return (Criteria) this;
        }

        public Criteria andXylRateIsNull() {
            addCriterion("XYL_RATE is null");
            return (Criteria) this;
        }

        public Criteria andXylRateIsNotNull() {
            addCriterion("XYL_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andXylRateEqualTo(Double value) {
            addCriterion("XYL_RATE =", value, "xylRate");
            return (Criteria) this;
        }

        public Criteria andXylRateNotEqualTo(Double value) {
            addCriterion("XYL_RATE <>", value, "xylRate");
            return (Criteria) this;
        }

        public Criteria andXylRateGreaterThan(Double value) {
            addCriterion("XYL_RATE >", value, "xylRate");
            return (Criteria) this;
        }

        public Criteria andXylRateGreaterThanOrEqualTo(Double value) {
            addCriterion("XYL_RATE >=", value, "xylRate");
            return (Criteria) this;
        }

        public Criteria andXylRateLessThan(Double value) {
            addCriterion("XYL_RATE <", value, "xylRate");
            return (Criteria) this;
        }

        public Criteria andXylRateLessThanOrEqualTo(Double value) {
            addCriterion("XYL_RATE <=", value, "xylRate");
            return (Criteria) this;
        }

        public Criteria andXylRateIn(List<Double> values) {
            addCriterion("XYL_RATE in", values, "xylRate");
            return (Criteria) this;
        }

        public Criteria andXylRateNotIn(List<Double> values) {
            addCriterion("XYL_RATE not in", values, "xylRate");
            return (Criteria) this;
        }

        public Criteria andXylRateBetween(Double value1, Double value2) {
            addCriterion("XYL_RATE between", value1, value2, "xylRate");
            return (Criteria) this;
        }

        public Criteria andXylRateNotBetween(Double value1, Double value2) {
            addCriterion("XYL_RATE not between", value1, value2, "xylRate");
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