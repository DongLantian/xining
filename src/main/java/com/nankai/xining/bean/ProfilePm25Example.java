package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class ProfilePm25Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProfilePm25Example() {
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

        public Criteria andPm25IdIsNull() {
            addCriterion("PM25_ID is null");
            return (Criteria) this;
        }

        public Criteria andPm25IdIsNotNull() {
            addCriterion("PM25_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPm25IdEqualTo(Integer value) {
            addCriterion("PM25_ID =", value, "pm25Id");
            return (Criteria) this;
        }

        public Criteria andPm25IdNotEqualTo(Integer value) {
            addCriterion("PM25_ID <>", value, "pm25Id");
            return (Criteria) this;
        }

        public Criteria andPm25IdGreaterThan(Integer value) {
            addCriterion("PM25_ID >", value, "pm25Id");
            return (Criteria) this;
        }

        public Criteria andPm25IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PM25_ID >=", value, "pm25Id");
            return (Criteria) this;
        }

        public Criteria andPm25IdLessThan(Integer value) {
            addCriterion("PM25_ID <", value, "pm25Id");
            return (Criteria) this;
        }

        public Criteria andPm25IdLessThanOrEqualTo(Integer value) {
            addCriterion("PM25_ID <=", value, "pm25Id");
            return (Criteria) this;
        }

        public Criteria andPm25IdIn(List<Integer> values) {
            addCriterion("PM25_ID in", values, "pm25Id");
            return (Criteria) this;
        }

        public Criteria andPm25IdNotIn(List<Integer> values) {
            addCriterion("PM25_ID not in", values, "pm25Id");
            return (Criteria) this;
        }

        public Criteria andPm25IdBetween(Integer value1, Integer value2) {
            addCriterion("PM25_ID between", value1, value2, "pm25Id");
            return (Criteria) this;
        }

        public Criteria andPm25IdNotBetween(Integer value1, Integer value2) {
            addCriterion("PM25_ID not between", value1, value2, "pm25Id");
            return (Criteria) this;
        }

        public Criteria andPso4MolecularIsNull() {
            addCriterion("PSO4_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andPso4MolecularIsNotNull() {
            addCriterion("PSO4_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andPso4MolecularEqualTo(Double value) {
            addCriterion("PSO4_MOLECULAR =", value, "pso4Molecular");
            return (Criteria) this;
        }

        public Criteria andPso4MolecularNotEqualTo(Double value) {
            addCriterion("PSO4_MOLECULAR <>", value, "pso4Molecular");
            return (Criteria) this;
        }

        public Criteria andPso4MolecularGreaterThan(Double value) {
            addCriterion("PSO4_MOLECULAR >", value, "pso4Molecular");
            return (Criteria) this;
        }

        public Criteria andPso4MolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("PSO4_MOLECULAR >=", value, "pso4Molecular");
            return (Criteria) this;
        }

        public Criteria andPso4MolecularLessThan(Double value) {
            addCriterion("PSO4_MOLECULAR <", value, "pso4Molecular");
            return (Criteria) this;
        }

        public Criteria andPso4MolecularLessThanOrEqualTo(Double value) {
            addCriterion("PSO4_MOLECULAR <=", value, "pso4Molecular");
            return (Criteria) this;
        }

        public Criteria andPso4MolecularIn(List<Double> values) {
            addCriterion("PSO4_MOLECULAR in", values, "pso4Molecular");
            return (Criteria) this;
        }

        public Criteria andPso4MolecularNotIn(List<Double> values) {
            addCriterion("PSO4_MOLECULAR not in", values, "pso4Molecular");
            return (Criteria) this;
        }

        public Criteria andPso4MolecularBetween(Double value1, Double value2) {
            addCriterion("PSO4_MOLECULAR between", value1, value2, "pso4Molecular");
            return (Criteria) this;
        }

        public Criteria andPso4MolecularNotBetween(Double value1, Double value2) {
            addCriterion("PSO4_MOLECULAR not between", value1, value2, "pso4Molecular");
            return (Criteria) this;
        }

        public Criteria andPso4DenominatorIsNull() {
            addCriterion("PSO4_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andPso4DenominatorIsNotNull() {
            addCriterion("PSO4_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andPso4DenominatorEqualTo(Double value) {
            addCriterion("PSO4_DENOMINATOR =", value, "pso4Denominator");
            return (Criteria) this;
        }

        public Criteria andPso4DenominatorNotEqualTo(Double value) {
            addCriterion("PSO4_DENOMINATOR <>", value, "pso4Denominator");
            return (Criteria) this;
        }

        public Criteria andPso4DenominatorGreaterThan(Double value) {
            addCriterion("PSO4_DENOMINATOR >", value, "pso4Denominator");
            return (Criteria) this;
        }

        public Criteria andPso4DenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("PSO4_DENOMINATOR >=", value, "pso4Denominator");
            return (Criteria) this;
        }

        public Criteria andPso4DenominatorLessThan(Double value) {
            addCriterion("PSO4_DENOMINATOR <", value, "pso4Denominator");
            return (Criteria) this;
        }

        public Criteria andPso4DenominatorLessThanOrEqualTo(Double value) {
            addCriterion("PSO4_DENOMINATOR <=", value, "pso4Denominator");
            return (Criteria) this;
        }

        public Criteria andPso4DenominatorIn(List<Double> values) {
            addCriterion("PSO4_DENOMINATOR in", values, "pso4Denominator");
            return (Criteria) this;
        }

        public Criteria andPso4DenominatorNotIn(List<Double> values) {
            addCriterion("PSO4_DENOMINATOR not in", values, "pso4Denominator");
            return (Criteria) this;
        }

        public Criteria andPso4DenominatorBetween(Double value1, Double value2) {
            addCriterion("PSO4_DENOMINATOR between", value1, value2, "pso4Denominator");
            return (Criteria) this;
        }

        public Criteria andPso4DenominatorNotBetween(Double value1, Double value2) {
            addCriterion("PSO4_DENOMINATOR not between", value1, value2, "pso4Denominator");
            return (Criteria) this;
        }

        public Criteria andPso4RateIsNull() {
            addCriterion("PSO4_RATE is null");
            return (Criteria) this;
        }

        public Criteria andPso4RateIsNotNull() {
            addCriterion("PSO4_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andPso4RateEqualTo(Double value) {
            addCriterion("PSO4_RATE =", value, "pso4Rate");
            return (Criteria) this;
        }

        public Criteria andPso4RateNotEqualTo(Double value) {
            addCriterion("PSO4_RATE <>", value, "pso4Rate");
            return (Criteria) this;
        }

        public Criteria andPso4RateGreaterThan(Double value) {
            addCriterion("PSO4_RATE >", value, "pso4Rate");
            return (Criteria) this;
        }

        public Criteria andPso4RateGreaterThanOrEqualTo(Double value) {
            addCriterion("PSO4_RATE >=", value, "pso4Rate");
            return (Criteria) this;
        }

        public Criteria andPso4RateLessThan(Double value) {
            addCriterion("PSO4_RATE <", value, "pso4Rate");
            return (Criteria) this;
        }

        public Criteria andPso4RateLessThanOrEqualTo(Double value) {
            addCriterion("PSO4_RATE <=", value, "pso4Rate");
            return (Criteria) this;
        }

        public Criteria andPso4RateIn(List<Double> values) {
            addCriterion("PSO4_RATE in", values, "pso4Rate");
            return (Criteria) this;
        }

        public Criteria andPso4RateNotIn(List<Double> values) {
            addCriterion("PSO4_RATE not in", values, "pso4Rate");
            return (Criteria) this;
        }

        public Criteria andPso4RateBetween(Double value1, Double value2) {
            addCriterion("PSO4_RATE between", value1, value2, "pso4Rate");
            return (Criteria) this;
        }

        public Criteria andPso4RateNotBetween(Double value1, Double value2) {
            addCriterion("PSO4_RATE not between", value1, value2, "pso4Rate");
            return (Criteria) this;
        }

        public Criteria andPno3MolecularIsNull() {
            addCriterion("PNO3_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andPno3MolecularIsNotNull() {
            addCriterion("PNO3_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andPno3MolecularEqualTo(Double value) {
            addCriterion("PNO3_MOLECULAR =", value, "pno3Molecular");
            return (Criteria) this;
        }

        public Criteria andPno3MolecularNotEqualTo(Double value) {
            addCriterion("PNO3_MOLECULAR <>", value, "pno3Molecular");
            return (Criteria) this;
        }

        public Criteria andPno3MolecularGreaterThan(Double value) {
            addCriterion("PNO3_MOLECULAR >", value, "pno3Molecular");
            return (Criteria) this;
        }

        public Criteria andPno3MolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("PNO3_MOLECULAR >=", value, "pno3Molecular");
            return (Criteria) this;
        }

        public Criteria andPno3MolecularLessThan(Double value) {
            addCriterion("PNO3_MOLECULAR <", value, "pno3Molecular");
            return (Criteria) this;
        }

        public Criteria andPno3MolecularLessThanOrEqualTo(Double value) {
            addCriterion("PNO3_MOLECULAR <=", value, "pno3Molecular");
            return (Criteria) this;
        }

        public Criteria andPno3MolecularIn(List<Double> values) {
            addCriterion("PNO3_MOLECULAR in", values, "pno3Molecular");
            return (Criteria) this;
        }

        public Criteria andPno3MolecularNotIn(List<Double> values) {
            addCriterion("PNO3_MOLECULAR not in", values, "pno3Molecular");
            return (Criteria) this;
        }

        public Criteria andPno3MolecularBetween(Double value1, Double value2) {
            addCriterion("PNO3_MOLECULAR between", value1, value2, "pno3Molecular");
            return (Criteria) this;
        }

        public Criteria andPno3MolecularNotBetween(Double value1, Double value2) {
            addCriterion("PNO3_MOLECULAR not between", value1, value2, "pno3Molecular");
            return (Criteria) this;
        }

        public Criteria andPno3DenominatorIsNull() {
            addCriterion("PNO3_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andPno3DenominatorIsNotNull() {
            addCriterion("PNO3_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andPno3DenominatorEqualTo(Double value) {
            addCriterion("PNO3_DENOMINATOR =", value, "pno3Denominator");
            return (Criteria) this;
        }

        public Criteria andPno3DenominatorNotEqualTo(Double value) {
            addCriterion("PNO3_DENOMINATOR <>", value, "pno3Denominator");
            return (Criteria) this;
        }

        public Criteria andPno3DenominatorGreaterThan(Double value) {
            addCriterion("PNO3_DENOMINATOR >", value, "pno3Denominator");
            return (Criteria) this;
        }

        public Criteria andPno3DenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("PNO3_DENOMINATOR >=", value, "pno3Denominator");
            return (Criteria) this;
        }

        public Criteria andPno3DenominatorLessThan(Double value) {
            addCriterion("PNO3_DENOMINATOR <", value, "pno3Denominator");
            return (Criteria) this;
        }

        public Criteria andPno3DenominatorLessThanOrEqualTo(Double value) {
            addCriterion("PNO3_DENOMINATOR <=", value, "pno3Denominator");
            return (Criteria) this;
        }

        public Criteria andPno3DenominatorIn(List<Double> values) {
            addCriterion("PNO3_DENOMINATOR in", values, "pno3Denominator");
            return (Criteria) this;
        }

        public Criteria andPno3DenominatorNotIn(List<Double> values) {
            addCriterion("PNO3_DENOMINATOR not in", values, "pno3Denominator");
            return (Criteria) this;
        }

        public Criteria andPno3DenominatorBetween(Double value1, Double value2) {
            addCriterion("PNO3_DENOMINATOR between", value1, value2, "pno3Denominator");
            return (Criteria) this;
        }

        public Criteria andPno3DenominatorNotBetween(Double value1, Double value2) {
            addCriterion("PNO3_DENOMINATOR not between", value1, value2, "pno3Denominator");
            return (Criteria) this;
        }

        public Criteria andPno3RateIsNull() {
            addCriterion("PNO3_RATE is null");
            return (Criteria) this;
        }

        public Criteria andPno3RateIsNotNull() {
            addCriterion("PNO3_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andPno3RateEqualTo(Double value) {
            addCriterion("PNO3_RATE =", value, "pno3Rate");
            return (Criteria) this;
        }

        public Criteria andPno3RateNotEqualTo(Double value) {
            addCriterion("PNO3_RATE <>", value, "pno3Rate");
            return (Criteria) this;
        }

        public Criteria andPno3RateGreaterThan(Double value) {
            addCriterion("PNO3_RATE >", value, "pno3Rate");
            return (Criteria) this;
        }

        public Criteria andPno3RateGreaterThanOrEqualTo(Double value) {
            addCriterion("PNO3_RATE >=", value, "pno3Rate");
            return (Criteria) this;
        }

        public Criteria andPno3RateLessThan(Double value) {
            addCriterion("PNO3_RATE <", value, "pno3Rate");
            return (Criteria) this;
        }

        public Criteria andPno3RateLessThanOrEqualTo(Double value) {
            addCriterion("PNO3_RATE <=", value, "pno3Rate");
            return (Criteria) this;
        }

        public Criteria andPno3RateIn(List<Double> values) {
            addCriterion("PNO3_RATE in", values, "pno3Rate");
            return (Criteria) this;
        }

        public Criteria andPno3RateNotIn(List<Double> values) {
            addCriterion("PNO3_RATE not in", values, "pno3Rate");
            return (Criteria) this;
        }

        public Criteria andPno3RateBetween(Double value1, Double value2) {
            addCriterion("PNO3_RATE between", value1, value2, "pno3Rate");
            return (Criteria) this;
        }

        public Criteria andPno3RateNotBetween(Double value1, Double value2) {
            addCriterion("PNO3_RATE not between", value1, value2, "pno3Rate");
            return (Criteria) this;
        }

        public Criteria andPecMolecularIsNull() {
            addCriterion("PEC_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andPecMolecularIsNotNull() {
            addCriterion("PEC_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andPecMolecularEqualTo(Double value) {
            addCriterion("PEC_MOLECULAR =", value, "pecMolecular");
            return (Criteria) this;
        }

        public Criteria andPecMolecularNotEqualTo(Double value) {
            addCriterion("PEC_MOLECULAR <>", value, "pecMolecular");
            return (Criteria) this;
        }

        public Criteria andPecMolecularGreaterThan(Double value) {
            addCriterion("PEC_MOLECULAR >", value, "pecMolecular");
            return (Criteria) this;
        }

        public Criteria andPecMolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("PEC_MOLECULAR >=", value, "pecMolecular");
            return (Criteria) this;
        }

        public Criteria andPecMolecularLessThan(Double value) {
            addCriterion("PEC_MOLECULAR <", value, "pecMolecular");
            return (Criteria) this;
        }

        public Criteria andPecMolecularLessThanOrEqualTo(Double value) {
            addCriterion("PEC_MOLECULAR <=", value, "pecMolecular");
            return (Criteria) this;
        }

        public Criteria andPecMolecularIn(List<Double> values) {
            addCriterion("PEC_MOLECULAR in", values, "pecMolecular");
            return (Criteria) this;
        }

        public Criteria andPecMolecularNotIn(List<Double> values) {
            addCriterion("PEC_MOLECULAR not in", values, "pecMolecular");
            return (Criteria) this;
        }

        public Criteria andPecMolecularBetween(Double value1, Double value2) {
            addCriterion("PEC_MOLECULAR between", value1, value2, "pecMolecular");
            return (Criteria) this;
        }

        public Criteria andPecMolecularNotBetween(Double value1, Double value2) {
            addCriterion("PEC_MOLECULAR not between", value1, value2, "pecMolecular");
            return (Criteria) this;
        }

        public Criteria andPecDenominatorIsNull() {
            addCriterion("PEC_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andPecDenominatorIsNotNull() {
            addCriterion("PEC_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andPecDenominatorEqualTo(Double value) {
            addCriterion("PEC_DENOMINATOR =", value, "pecDenominator");
            return (Criteria) this;
        }

        public Criteria andPecDenominatorNotEqualTo(Double value) {
            addCriterion("PEC_DENOMINATOR <>", value, "pecDenominator");
            return (Criteria) this;
        }

        public Criteria andPecDenominatorGreaterThan(Double value) {
            addCriterion("PEC_DENOMINATOR >", value, "pecDenominator");
            return (Criteria) this;
        }

        public Criteria andPecDenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("PEC_DENOMINATOR >=", value, "pecDenominator");
            return (Criteria) this;
        }

        public Criteria andPecDenominatorLessThan(Double value) {
            addCriterion("PEC_DENOMINATOR <", value, "pecDenominator");
            return (Criteria) this;
        }

        public Criteria andPecDenominatorLessThanOrEqualTo(Double value) {
            addCriterion("PEC_DENOMINATOR <=", value, "pecDenominator");
            return (Criteria) this;
        }

        public Criteria andPecDenominatorIn(List<Double> values) {
            addCriterion("PEC_DENOMINATOR in", values, "pecDenominator");
            return (Criteria) this;
        }

        public Criteria andPecDenominatorNotIn(List<Double> values) {
            addCriterion("PEC_DENOMINATOR not in", values, "pecDenominator");
            return (Criteria) this;
        }

        public Criteria andPecDenominatorBetween(Double value1, Double value2) {
            addCriterion("PEC_DENOMINATOR between", value1, value2, "pecDenominator");
            return (Criteria) this;
        }

        public Criteria andPecDenominatorNotBetween(Double value1, Double value2) {
            addCriterion("PEC_DENOMINATOR not between", value1, value2, "pecDenominator");
            return (Criteria) this;
        }

        public Criteria andPecRateIsNull() {
            addCriterion("PEC_RATE is null");
            return (Criteria) this;
        }

        public Criteria andPecRateIsNotNull() {
            addCriterion("PEC_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andPecRateEqualTo(Double value) {
            addCriterion("PEC_RATE =", value, "pecRate");
            return (Criteria) this;
        }

        public Criteria andPecRateNotEqualTo(Double value) {
            addCriterion("PEC_RATE <>", value, "pecRate");
            return (Criteria) this;
        }

        public Criteria andPecRateGreaterThan(Double value) {
            addCriterion("PEC_RATE >", value, "pecRate");
            return (Criteria) this;
        }

        public Criteria andPecRateGreaterThanOrEqualTo(Double value) {
            addCriterion("PEC_RATE >=", value, "pecRate");
            return (Criteria) this;
        }

        public Criteria andPecRateLessThan(Double value) {
            addCriterion("PEC_RATE <", value, "pecRate");
            return (Criteria) this;
        }

        public Criteria andPecRateLessThanOrEqualTo(Double value) {
            addCriterion("PEC_RATE <=", value, "pecRate");
            return (Criteria) this;
        }

        public Criteria andPecRateIn(List<Double> values) {
            addCriterion("PEC_RATE in", values, "pecRate");
            return (Criteria) this;
        }

        public Criteria andPecRateNotIn(List<Double> values) {
            addCriterion("PEC_RATE not in", values, "pecRate");
            return (Criteria) this;
        }

        public Criteria andPecRateBetween(Double value1, Double value2) {
            addCriterion("PEC_RATE between", value1, value2, "pecRate");
            return (Criteria) this;
        }

        public Criteria andPecRateNotBetween(Double value1, Double value2) {
            addCriterion("PEC_RATE not between", value1, value2, "pecRate");
            return (Criteria) this;
        }

        public Criteria andPocMolecularIsNull() {
            addCriterion("POC_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andPocMolecularIsNotNull() {
            addCriterion("POC_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andPocMolecularEqualTo(Double value) {
            addCriterion("POC_MOLECULAR =", value, "pocMolecular");
            return (Criteria) this;
        }

        public Criteria andPocMolecularNotEqualTo(Double value) {
            addCriterion("POC_MOLECULAR <>", value, "pocMolecular");
            return (Criteria) this;
        }

        public Criteria andPocMolecularGreaterThan(Double value) {
            addCriterion("POC_MOLECULAR >", value, "pocMolecular");
            return (Criteria) this;
        }

        public Criteria andPocMolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("POC_MOLECULAR >=", value, "pocMolecular");
            return (Criteria) this;
        }

        public Criteria andPocMolecularLessThan(Double value) {
            addCriterion("POC_MOLECULAR <", value, "pocMolecular");
            return (Criteria) this;
        }

        public Criteria andPocMolecularLessThanOrEqualTo(Double value) {
            addCriterion("POC_MOLECULAR <=", value, "pocMolecular");
            return (Criteria) this;
        }

        public Criteria andPocMolecularIn(List<Double> values) {
            addCriterion("POC_MOLECULAR in", values, "pocMolecular");
            return (Criteria) this;
        }

        public Criteria andPocMolecularNotIn(List<Double> values) {
            addCriterion("POC_MOLECULAR not in", values, "pocMolecular");
            return (Criteria) this;
        }

        public Criteria andPocMolecularBetween(Double value1, Double value2) {
            addCriterion("POC_MOLECULAR between", value1, value2, "pocMolecular");
            return (Criteria) this;
        }

        public Criteria andPocMolecularNotBetween(Double value1, Double value2) {
            addCriterion("POC_MOLECULAR not between", value1, value2, "pocMolecular");
            return (Criteria) this;
        }

        public Criteria andPocDenominatorIsNull() {
            addCriterion("POC_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andPocDenominatorIsNotNull() {
            addCriterion("POC_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andPocDenominatorEqualTo(Double value) {
            addCriterion("POC_DENOMINATOR =", value, "pocDenominator");
            return (Criteria) this;
        }

        public Criteria andPocDenominatorNotEqualTo(Double value) {
            addCriterion("POC_DENOMINATOR <>", value, "pocDenominator");
            return (Criteria) this;
        }

        public Criteria andPocDenominatorGreaterThan(Double value) {
            addCriterion("POC_DENOMINATOR >", value, "pocDenominator");
            return (Criteria) this;
        }

        public Criteria andPocDenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("POC_DENOMINATOR >=", value, "pocDenominator");
            return (Criteria) this;
        }

        public Criteria andPocDenominatorLessThan(Double value) {
            addCriterion("POC_DENOMINATOR <", value, "pocDenominator");
            return (Criteria) this;
        }

        public Criteria andPocDenominatorLessThanOrEqualTo(Double value) {
            addCriterion("POC_DENOMINATOR <=", value, "pocDenominator");
            return (Criteria) this;
        }

        public Criteria andPocDenominatorIn(List<Double> values) {
            addCriterion("POC_DENOMINATOR in", values, "pocDenominator");
            return (Criteria) this;
        }

        public Criteria andPocDenominatorNotIn(List<Double> values) {
            addCriterion("POC_DENOMINATOR not in", values, "pocDenominator");
            return (Criteria) this;
        }

        public Criteria andPocDenominatorBetween(Double value1, Double value2) {
            addCriterion("POC_DENOMINATOR between", value1, value2, "pocDenominator");
            return (Criteria) this;
        }

        public Criteria andPocDenominatorNotBetween(Double value1, Double value2) {
            addCriterion("POC_DENOMINATOR not between", value1, value2, "pocDenominator");
            return (Criteria) this;
        }

        public Criteria andPocRateIsNull() {
            addCriterion("POC_RATE is null");
            return (Criteria) this;
        }

        public Criteria andPocRateIsNotNull() {
            addCriterion("POC_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andPocRateEqualTo(Double value) {
            addCriterion("POC_RATE =", value, "pocRate");
            return (Criteria) this;
        }

        public Criteria andPocRateNotEqualTo(Double value) {
            addCriterion("POC_RATE <>", value, "pocRate");
            return (Criteria) this;
        }

        public Criteria andPocRateGreaterThan(Double value) {
            addCriterion("POC_RATE >", value, "pocRate");
            return (Criteria) this;
        }

        public Criteria andPocRateGreaterThanOrEqualTo(Double value) {
            addCriterion("POC_RATE >=", value, "pocRate");
            return (Criteria) this;
        }

        public Criteria andPocRateLessThan(Double value) {
            addCriterion("POC_RATE <", value, "pocRate");
            return (Criteria) this;
        }

        public Criteria andPocRateLessThanOrEqualTo(Double value) {
            addCriterion("POC_RATE <=", value, "pocRate");
            return (Criteria) this;
        }

        public Criteria andPocRateIn(List<Double> values) {
            addCriterion("POC_RATE in", values, "pocRate");
            return (Criteria) this;
        }

        public Criteria andPocRateNotIn(List<Double> values) {
            addCriterion("POC_RATE not in", values, "pocRate");
            return (Criteria) this;
        }

        public Criteria andPocRateBetween(Double value1, Double value2) {
            addCriterion("POC_RATE between", value1, value2, "pocRate");
            return (Criteria) this;
        }

        public Criteria andPocRateNotBetween(Double value1, Double value2) {
            addCriterion("POC_RATE not between", value1, value2, "pocRate");
            return (Criteria) this;
        }

        public Criteria andPmothrMolecularIsNull() {
            addCriterion("PMOTHR_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andPmothrMolecularIsNotNull() {
            addCriterion("PMOTHR_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andPmothrMolecularEqualTo(Double value) {
            addCriterion("PMOTHR_MOLECULAR =", value, "pmothrMolecular");
            return (Criteria) this;
        }

        public Criteria andPmothrMolecularNotEqualTo(Double value) {
            addCriterion("PMOTHR_MOLECULAR <>", value, "pmothrMolecular");
            return (Criteria) this;
        }

        public Criteria andPmothrMolecularGreaterThan(Double value) {
            addCriterion("PMOTHR_MOLECULAR >", value, "pmothrMolecular");
            return (Criteria) this;
        }

        public Criteria andPmothrMolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("PMOTHR_MOLECULAR >=", value, "pmothrMolecular");
            return (Criteria) this;
        }

        public Criteria andPmothrMolecularLessThan(Double value) {
            addCriterion("PMOTHR_MOLECULAR <", value, "pmothrMolecular");
            return (Criteria) this;
        }

        public Criteria andPmothrMolecularLessThanOrEqualTo(Double value) {
            addCriterion("PMOTHR_MOLECULAR <=", value, "pmothrMolecular");
            return (Criteria) this;
        }

        public Criteria andPmothrMolecularIn(List<Double> values) {
            addCriterion("PMOTHR_MOLECULAR in", values, "pmothrMolecular");
            return (Criteria) this;
        }

        public Criteria andPmothrMolecularNotIn(List<Double> values) {
            addCriterion("PMOTHR_MOLECULAR not in", values, "pmothrMolecular");
            return (Criteria) this;
        }

        public Criteria andPmothrMolecularBetween(Double value1, Double value2) {
            addCriterion("PMOTHR_MOLECULAR between", value1, value2, "pmothrMolecular");
            return (Criteria) this;
        }

        public Criteria andPmothrMolecularNotBetween(Double value1, Double value2) {
            addCriterion("PMOTHR_MOLECULAR not between", value1, value2, "pmothrMolecular");
            return (Criteria) this;
        }

        public Criteria andPmothrDenominatorIsNull() {
            addCriterion("PMOTHR_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andPmothrDenominatorIsNotNull() {
            addCriterion("PMOTHR_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andPmothrDenominatorEqualTo(Double value) {
            addCriterion("PMOTHR_DENOMINATOR =", value, "pmothrDenominator");
            return (Criteria) this;
        }

        public Criteria andPmothrDenominatorNotEqualTo(Double value) {
            addCriterion("PMOTHR_DENOMINATOR <>", value, "pmothrDenominator");
            return (Criteria) this;
        }

        public Criteria andPmothrDenominatorGreaterThan(Double value) {
            addCriterion("PMOTHR_DENOMINATOR >", value, "pmothrDenominator");
            return (Criteria) this;
        }

        public Criteria andPmothrDenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("PMOTHR_DENOMINATOR >=", value, "pmothrDenominator");
            return (Criteria) this;
        }

        public Criteria andPmothrDenominatorLessThan(Double value) {
            addCriterion("PMOTHR_DENOMINATOR <", value, "pmothrDenominator");
            return (Criteria) this;
        }

        public Criteria andPmothrDenominatorLessThanOrEqualTo(Double value) {
            addCriterion("PMOTHR_DENOMINATOR <=", value, "pmothrDenominator");
            return (Criteria) this;
        }

        public Criteria andPmothrDenominatorIn(List<Double> values) {
            addCriterion("PMOTHR_DENOMINATOR in", values, "pmothrDenominator");
            return (Criteria) this;
        }

        public Criteria andPmothrDenominatorNotIn(List<Double> values) {
            addCriterion("PMOTHR_DENOMINATOR not in", values, "pmothrDenominator");
            return (Criteria) this;
        }

        public Criteria andPmothrDenominatorBetween(Double value1, Double value2) {
            addCriterion("PMOTHR_DENOMINATOR between", value1, value2, "pmothrDenominator");
            return (Criteria) this;
        }

        public Criteria andPmothrDenominatorNotBetween(Double value1, Double value2) {
            addCriterion("PMOTHR_DENOMINATOR not between", value1, value2, "pmothrDenominator");
            return (Criteria) this;
        }

        public Criteria andPmothrRateIsNull() {
            addCriterion("PMOTHR_RATE is null");
            return (Criteria) this;
        }

        public Criteria andPmothrRateIsNotNull() {
            addCriterion("PMOTHR_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andPmothrRateEqualTo(Double value) {
            addCriterion("PMOTHR_RATE =", value, "pmothrRate");
            return (Criteria) this;
        }

        public Criteria andPmothrRateNotEqualTo(Double value) {
            addCriterion("PMOTHR_RATE <>", value, "pmothrRate");
            return (Criteria) this;
        }

        public Criteria andPmothrRateGreaterThan(Double value) {
            addCriterion("PMOTHR_RATE >", value, "pmothrRate");
            return (Criteria) this;
        }

        public Criteria andPmothrRateGreaterThanOrEqualTo(Double value) {
            addCriterion("PMOTHR_RATE >=", value, "pmothrRate");
            return (Criteria) this;
        }

        public Criteria andPmothrRateLessThan(Double value) {
            addCriterion("PMOTHR_RATE <", value, "pmothrRate");
            return (Criteria) this;
        }

        public Criteria andPmothrRateLessThanOrEqualTo(Double value) {
            addCriterion("PMOTHR_RATE <=", value, "pmothrRate");
            return (Criteria) this;
        }

        public Criteria andPmothrRateIn(List<Double> values) {
            addCriterion("PMOTHR_RATE in", values, "pmothrRate");
            return (Criteria) this;
        }

        public Criteria andPmothrRateNotIn(List<Double> values) {
            addCriterion("PMOTHR_RATE not in", values, "pmothrRate");
            return (Criteria) this;
        }

        public Criteria andPmothrRateBetween(Double value1, Double value2) {
            addCriterion("PMOTHR_RATE between", value1, value2, "pmothrRate");
            return (Criteria) this;
        }

        public Criteria andPmothrRateNotBetween(Double value1, Double value2) {
            addCriterion("PMOTHR_RATE not between", value1, value2, "pmothrRate");
            return (Criteria) this;
        }

        public Criteria andPcaMolecularIsNull() {
            addCriterion("PCA_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andPcaMolecularIsNotNull() {
            addCriterion("PCA_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andPcaMolecularEqualTo(Double value) {
            addCriterion("PCA_MOLECULAR =", value, "pcaMolecular");
            return (Criteria) this;
        }

        public Criteria andPcaMolecularNotEqualTo(Double value) {
            addCriterion("PCA_MOLECULAR <>", value, "pcaMolecular");
            return (Criteria) this;
        }

        public Criteria andPcaMolecularGreaterThan(Double value) {
            addCriterion("PCA_MOLECULAR >", value, "pcaMolecular");
            return (Criteria) this;
        }

        public Criteria andPcaMolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("PCA_MOLECULAR >=", value, "pcaMolecular");
            return (Criteria) this;
        }

        public Criteria andPcaMolecularLessThan(Double value) {
            addCriterion("PCA_MOLECULAR <", value, "pcaMolecular");
            return (Criteria) this;
        }

        public Criteria andPcaMolecularLessThanOrEqualTo(Double value) {
            addCriterion("PCA_MOLECULAR <=", value, "pcaMolecular");
            return (Criteria) this;
        }

        public Criteria andPcaMolecularIn(List<Double> values) {
            addCriterion("PCA_MOLECULAR in", values, "pcaMolecular");
            return (Criteria) this;
        }

        public Criteria andPcaMolecularNotIn(List<Double> values) {
            addCriterion("PCA_MOLECULAR not in", values, "pcaMolecular");
            return (Criteria) this;
        }

        public Criteria andPcaMolecularBetween(Double value1, Double value2) {
            addCriterion("PCA_MOLECULAR between", value1, value2, "pcaMolecular");
            return (Criteria) this;
        }

        public Criteria andPcaMolecularNotBetween(Double value1, Double value2) {
            addCriterion("PCA_MOLECULAR not between", value1, value2, "pcaMolecular");
            return (Criteria) this;
        }

        public Criteria andPcaDenominatorIsNull() {
            addCriterion("PCA_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andPcaDenominatorIsNotNull() {
            addCriterion("PCA_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andPcaDenominatorEqualTo(Double value) {
            addCriterion("PCA_DENOMINATOR =", value, "pcaDenominator");
            return (Criteria) this;
        }

        public Criteria andPcaDenominatorNotEqualTo(Double value) {
            addCriterion("PCA_DENOMINATOR <>", value, "pcaDenominator");
            return (Criteria) this;
        }

        public Criteria andPcaDenominatorGreaterThan(Double value) {
            addCriterion("PCA_DENOMINATOR >", value, "pcaDenominator");
            return (Criteria) this;
        }

        public Criteria andPcaDenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("PCA_DENOMINATOR >=", value, "pcaDenominator");
            return (Criteria) this;
        }

        public Criteria andPcaDenominatorLessThan(Double value) {
            addCriterion("PCA_DENOMINATOR <", value, "pcaDenominator");
            return (Criteria) this;
        }

        public Criteria andPcaDenominatorLessThanOrEqualTo(Double value) {
            addCriterion("PCA_DENOMINATOR <=", value, "pcaDenominator");
            return (Criteria) this;
        }

        public Criteria andPcaDenominatorIn(List<Double> values) {
            addCriterion("PCA_DENOMINATOR in", values, "pcaDenominator");
            return (Criteria) this;
        }

        public Criteria andPcaDenominatorNotIn(List<Double> values) {
            addCriterion("PCA_DENOMINATOR not in", values, "pcaDenominator");
            return (Criteria) this;
        }

        public Criteria andPcaDenominatorBetween(Double value1, Double value2) {
            addCriterion("PCA_DENOMINATOR between", value1, value2, "pcaDenominator");
            return (Criteria) this;
        }

        public Criteria andPcaDenominatorNotBetween(Double value1, Double value2) {
            addCriterion("PCA_DENOMINATOR not between", value1, value2, "pcaDenominator");
            return (Criteria) this;
        }

        public Criteria andPcaRateIsNull() {
            addCriterion("PCA_RATE is null");
            return (Criteria) this;
        }

        public Criteria andPcaRateIsNotNull() {
            addCriterion("PCA_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andPcaRateEqualTo(Double value) {
            addCriterion("PCA_RATE =", value, "pcaRate");
            return (Criteria) this;
        }

        public Criteria andPcaRateNotEqualTo(Double value) {
            addCriterion("PCA_RATE <>", value, "pcaRate");
            return (Criteria) this;
        }

        public Criteria andPcaRateGreaterThan(Double value) {
            addCriterion("PCA_RATE >", value, "pcaRate");
            return (Criteria) this;
        }

        public Criteria andPcaRateGreaterThanOrEqualTo(Double value) {
            addCriterion("PCA_RATE >=", value, "pcaRate");
            return (Criteria) this;
        }

        public Criteria andPcaRateLessThan(Double value) {
            addCriterion("PCA_RATE <", value, "pcaRate");
            return (Criteria) this;
        }

        public Criteria andPcaRateLessThanOrEqualTo(Double value) {
            addCriterion("PCA_RATE <=", value, "pcaRate");
            return (Criteria) this;
        }

        public Criteria andPcaRateIn(List<Double> values) {
            addCriterion("PCA_RATE in", values, "pcaRate");
            return (Criteria) this;
        }

        public Criteria andPcaRateNotIn(List<Double> values) {
            addCriterion("PCA_RATE not in", values, "pcaRate");
            return (Criteria) this;
        }

        public Criteria andPcaRateBetween(Double value1, Double value2) {
            addCriterion("PCA_RATE between", value1, value2, "pcaRate");
            return (Criteria) this;
        }

        public Criteria andPcaRateNotBetween(Double value1, Double value2) {
            addCriterion("PCA_RATE not between", value1, value2, "pcaRate");
            return (Criteria) this;
        }

        public Criteria andPmgMolecularIsNull() {
            addCriterion("PMG_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andPmgMolecularIsNotNull() {
            addCriterion("PMG_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andPmgMolecularEqualTo(Double value) {
            addCriterion("PMG_MOLECULAR =", value, "pmgMolecular");
            return (Criteria) this;
        }

        public Criteria andPmgMolecularNotEqualTo(Double value) {
            addCriterion("PMG_MOLECULAR <>", value, "pmgMolecular");
            return (Criteria) this;
        }

        public Criteria andPmgMolecularGreaterThan(Double value) {
            addCriterion("PMG_MOLECULAR >", value, "pmgMolecular");
            return (Criteria) this;
        }

        public Criteria andPmgMolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("PMG_MOLECULAR >=", value, "pmgMolecular");
            return (Criteria) this;
        }

        public Criteria andPmgMolecularLessThan(Double value) {
            addCriterion("PMG_MOLECULAR <", value, "pmgMolecular");
            return (Criteria) this;
        }

        public Criteria andPmgMolecularLessThanOrEqualTo(Double value) {
            addCriterion("PMG_MOLECULAR <=", value, "pmgMolecular");
            return (Criteria) this;
        }

        public Criteria andPmgMolecularIn(List<Double> values) {
            addCriterion("PMG_MOLECULAR in", values, "pmgMolecular");
            return (Criteria) this;
        }

        public Criteria andPmgMolecularNotIn(List<Double> values) {
            addCriterion("PMG_MOLECULAR not in", values, "pmgMolecular");
            return (Criteria) this;
        }

        public Criteria andPmgMolecularBetween(Double value1, Double value2) {
            addCriterion("PMG_MOLECULAR between", value1, value2, "pmgMolecular");
            return (Criteria) this;
        }

        public Criteria andPmgMolecularNotBetween(Double value1, Double value2) {
            addCriterion("PMG_MOLECULAR not between", value1, value2, "pmgMolecular");
            return (Criteria) this;
        }

        public Criteria andPmgDenominatorIsNull() {
            addCriterion("PMG_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andPmgDenominatorIsNotNull() {
            addCriterion("PMG_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andPmgDenominatorEqualTo(Double value) {
            addCriterion("PMG_DENOMINATOR =", value, "pmgDenominator");
            return (Criteria) this;
        }

        public Criteria andPmgDenominatorNotEqualTo(Double value) {
            addCriterion("PMG_DENOMINATOR <>", value, "pmgDenominator");
            return (Criteria) this;
        }

        public Criteria andPmgDenominatorGreaterThan(Double value) {
            addCriterion("PMG_DENOMINATOR >", value, "pmgDenominator");
            return (Criteria) this;
        }

        public Criteria andPmgDenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("PMG_DENOMINATOR >=", value, "pmgDenominator");
            return (Criteria) this;
        }

        public Criteria andPmgDenominatorLessThan(Double value) {
            addCriterion("PMG_DENOMINATOR <", value, "pmgDenominator");
            return (Criteria) this;
        }

        public Criteria andPmgDenominatorLessThanOrEqualTo(Double value) {
            addCriterion("PMG_DENOMINATOR <=", value, "pmgDenominator");
            return (Criteria) this;
        }

        public Criteria andPmgDenominatorIn(List<Double> values) {
            addCriterion("PMG_DENOMINATOR in", values, "pmgDenominator");
            return (Criteria) this;
        }

        public Criteria andPmgDenominatorNotIn(List<Double> values) {
            addCriterion("PMG_DENOMINATOR not in", values, "pmgDenominator");
            return (Criteria) this;
        }

        public Criteria andPmgDenominatorBetween(Double value1, Double value2) {
            addCriterion("PMG_DENOMINATOR between", value1, value2, "pmgDenominator");
            return (Criteria) this;
        }

        public Criteria andPmgDenominatorNotBetween(Double value1, Double value2) {
            addCriterion("PMG_DENOMINATOR not between", value1, value2, "pmgDenominator");
            return (Criteria) this;
        }

        public Criteria andPmgRateIsNull() {
            addCriterion("PMG_RATE is null");
            return (Criteria) this;
        }

        public Criteria andPmgRateIsNotNull() {
            addCriterion("PMG_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andPmgRateEqualTo(Double value) {
            addCriterion("PMG_RATE =", value, "pmgRate");
            return (Criteria) this;
        }

        public Criteria andPmgRateNotEqualTo(Double value) {
            addCriterion("PMG_RATE <>", value, "pmgRate");
            return (Criteria) this;
        }

        public Criteria andPmgRateGreaterThan(Double value) {
            addCriterion("PMG_RATE >", value, "pmgRate");
            return (Criteria) this;
        }

        public Criteria andPmgRateGreaterThanOrEqualTo(Double value) {
            addCriterion("PMG_RATE >=", value, "pmgRate");
            return (Criteria) this;
        }

        public Criteria andPmgRateLessThan(Double value) {
            addCriterion("PMG_RATE <", value, "pmgRate");
            return (Criteria) this;
        }

        public Criteria andPmgRateLessThanOrEqualTo(Double value) {
            addCriterion("PMG_RATE <=", value, "pmgRate");
            return (Criteria) this;
        }

        public Criteria andPmgRateIn(List<Double> values) {
            addCriterion("PMG_RATE in", values, "pmgRate");
            return (Criteria) this;
        }

        public Criteria andPmgRateNotIn(List<Double> values) {
            addCriterion("PMG_RATE not in", values, "pmgRate");
            return (Criteria) this;
        }

        public Criteria andPmgRateBetween(Double value1, Double value2) {
            addCriterion("PMG_RATE between", value1, value2, "pmgRate");
            return (Criteria) this;
        }

        public Criteria andPmgRateNotBetween(Double value1, Double value2) {
            addCriterion("PMG_RATE not between", value1, value2, "pmgRate");
            return (Criteria) this;
        }

        public Criteria andPkMolecularIsNull() {
            addCriterion("PK_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andPkMolecularIsNotNull() {
            addCriterion("PK_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andPkMolecularEqualTo(Double value) {
            addCriterion("PK_MOLECULAR =", value, "pkMolecular");
            return (Criteria) this;
        }

        public Criteria andPkMolecularNotEqualTo(Double value) {
            addCriterion("PK_MOLECULAR <>", value, "pkMolecular");
            return (Criteria) this;
        }

        public Criteria andPkMolecularGreaterThan(Double value) {
            addCriterion("PK_MOLECULAR >", value, "pkMolecular");
            return (Criteria) this;
        }

        public Criteria andPkMolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("PK_MOLECULAR >=", value, "pkMolecular");
            return (Criteria) this;
        }

        public Criteria andPkMolecularLessThan(Double value) {
            addCriterion("PK_MOLECULAR <", value, "pkMolecular");
            return (Criteria) this;
        }

        public Criteria andPkMolecularLessThanOrEqualTo(Double value) {
            addCriterion("PK_MOLECULAR <=", value, "pkMolecular");
            return (Criteria) this;
        }

        public Criteria andPkMolecularIn(List<Double> values) {
            addCriterion("PK_MOLECULAR in", values, "pkMolecular");
            return (Criteria) this;
        }

        public Criteria andPkMolecularNotIn(List<Double> values) {
            addCriterion("PK_MOLECULAR not in", values, "pkMolecular");
            return (Criteria) this;
        }

        public Criteria andPkMolecularBetween(Double value1, Double value2) {
            addCriterion("PK_MOLECULAR between", value1, value2, "pkMolecular");
            return (Criteria) this;
        }

        public Criteria andPkMolecularNotBetween(Double value1, Double value2) {
            addCriterion("PK_MOLECULAR not between", value1, value2, "pkMolecular");
            return (Criteria) this;
        }

        public Criteria andPkDenominatorIsNull() {
            addCriterion("PK_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andPkDenominatorIsNotNull() {
            addCriterion("PK_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andPkDenominatorEqualTo(Double value) {
            addCriterion("PK_DENOMINATOR =", value, "pkDenominator");
            return (Criteria) this;
        }

        public Criteria andPkDenominatorNotEqualTo(Double value) {
            addCriterion("PK_DENOMINATOR <>", value, "pkDenominator");
            return (Criteria) this;
        }

        public Criteria andPkDenominatorGreaterThan(Double value) {
            addCriterion("PK_DENOMINATOR >", value, "pkDenominator");
            return (Criteria) this;
        }

        public Criteria andPkDenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("PK_DENOMINATOR >=", value, "pkDenominator");
            return (Criteria) this;
        }

        public Criteria andPkDenominatorLessThan(Double value) {
            addCriterion("PK_DENOMINATOR <", value, "pkDenominator");
            return (Criteria) this;
        }

        public Criteria andPkDenominatorLessThanOrEqualTo(Double value) {
            addCriterion("PK_DENOMINATOR <=", value, "pkDenominator");
            return (Criteria) this;
        }

        public Criteria andPkDenominatorIn(List<Double> values) {
            addCriterion("PK_DENOMINATOR in", values, "pkDenominator");
            return (Criteria) this;
        }

        public Criteria andPkDenominatorNotIn(List<Double> values) {
            addCriterion("PK_DENOMINATOR not in", values, "pkDenominator");
            return (Criteria) this;
        }

        public Criteria andPkDenominatorBetween(Double value1, Double value2) {
            addCriterion("PK_DENOMINATOR between", value1, value2, "pkDenominator");
            return (Criteria) this;
        }

        public Criteria andPkDenominatorNotBetween(Double value1, Double value2) {
            addCriterion("PK_DENOMINATOR not between", value1, value2, "pkDenominator");
            return (Criteria) this;
        }

        public Criteria andPkRateIsNull() {
            addCriterion("PK_RATE is null");
            return (Criteria) this;
        }

        public Criteria andPkRateIsNotNull() {
            addCriterion("PK_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andPkRateEqualTo(Double value) {
            addCriterion("PK_RATE =", value, "pkRate");
            return (Criteria) this;
        }

        public Criteria andPkRateNotEqualTo(Double value) {
            addCriterion("PK_RATE <>", value, "pkRate");
            return (Criteria) this;
        }

        public Criteria andPkRateGreaterThan(Double value) {
            addCriterion("PK_RATE >", value, "pkRate");
            return (Criteria) this;
        }

        public Criteria andPkRateGreaterThanOrEqualTo(Double value) {
            addCriterion("PK_RATE >=", value, "pkRate");
            return (Criteria) this;
        }

        public Criteria andPkRateLessThan(Double value) {
            addCriterion("PK_RATE <", value, "pkRate");
            return (Criteria) this;
        }

        public Criteria andPkRateLessThanOrEqualTo(Double value) {
            addCriterion("PK_RATE <=", value, "pkRate");
            return (Criteria) this;
        }

        public Criteria andPkRateIn(List<Double> values) {
            addCriterion("PK_RATE in", values, "pkRate");
            return (Criteria) this;
        }

        public Criteria andPkRateNotIn(List<Double> values) {
            addCriterion("PK_RATE not in", values, "pkRate");
            return (Criteria) this;
        }

        public Criteria andPkRateBetween(Double value1, Double value2) {
            addCriterion("PK_RATE between", value1, value2, "pkRate");
            return (Criteria) this;
        }

        public Criteria andPkRateNotBetween(Double value1, Double value2) {
            addCriterion("PK_RATE not between", value1, value2, "pkRate");
            return (Criteria) this;
        }

        public Criteria andPncomMolecularIsNull() {
            addCriterion("PNCOM_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andPncomMolecularIsNotNull() {
            addCriterion("PNCOM_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andPncomMolecularEqualTo(Double value) {
            addCriterion("PNCOM_MOLECULAR =", value, "pncomMolecular");
            return (Criteria) this;
        }

        public Criteria andPncomMolecularNotEqualTo(Double value) {
            addCriterion("PNCOM_MOLECULAR <>", value, "pncomMolecular");
            return (Criteria) this;
        }

        public Criteria andPncomMolecularGreaterThan(Double value) {
            addCriterion("PNCOM_MOLECULAR >", value, "pncomMolecular");
            return (Criteria) this;
        }

        public Criteria andPncomMolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("PNCOM_MOLECULAR >=", value, "pncomMolecular");
            return (Criteria) this;
        }

        public Criteria andPncomMolecularLessThan(Double value) {
            addCriterion("PNCOM_MOLECULAR <", value, "pncomMolecular");
            return (Criteria) this;
        }

        public Criteria andPncomMolecularLessThanOrEqualTo(Double value) {
            addCriterion("PNCOM_MOLECULAR <=", value, "pncomMolecular");
            return (Criteria) this;
        }

        public Criteria andPncomMolecularIn(List<Double> values) {
            addCriterion("PNCOM_MOLECULAR in", values, "pncomMolecular");
            return (Criteria) this;
        }

        public Criteria andPncomMolecularNotIn(List<Double> values) {
            addCriterion("PNCOM_MOLECULAR not in", values, "pncomMolecular");
            return (Criteria) this;
        }

        public Criteria andPncomMolecularBetween(Double value1, Double value2) {
            addCriterion("PNCOM_MOLECULAR between", value1, value2, "pncomMolecular");
            return (Criteria) this;
        }

        public Criteria andPncomMolecularNotBetween(Double value1, Double value2) {
            addCriterion("PNCOM_MOLECULAR not between", value1, value2, "pncomMolecular");
            return (Criteria) this;
        }

        public Criteria andPncomDenominatorIsNull() {
            addCriterion("PNCOM_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andPncomDenominatorIsNotNull() {
            addCriterion("PNCOM_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andPncomDenominatorEqualTo(Double value) {
            addCriterion("PNCOM_DENOMINATOR =", value, "pncomDenominator");
            return (Criteria) this;
        }

        public Criteria andPncomDenominatorNotEqualTo(Double value) {
            addCriterion("PNCOM_DENOMINATOR <>", value, "pncomDenominator");
            return (Criteria) this;
        }

        public Criteria andPncomDenominatorGreaterThan(Double value) {
            addCriterion("PNCOM_DENOMINATOR >", value, "pncomDenominator");
            return (Criteria) this;
        }

        public Criteria andPncomDenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("PNCOM_DENOMINATOR >=", value, "pncomDenominator");
            return (Criteria) this;
        }

        public Criteria andPncomDenominatorLessThan(Double value) {
            addCriterion("PNCOM_DENOMINATOR <", value, "pncomDenominator");
            return (Criteria) this;
        }

        public Criteria andPncomDenominatorLessThanOrEqualTo(Double value) {
            addCriterion("PNCOM_DENOMINATOR <=", value, "pncomDenominator");
            return (Criteria) this;
        }

        public Criteria andPncomDenominatorIn(List<Double> values) {
            addCriterion("PNCOM_DENOMINATOR in", values, "pncomDenominator");
            return (Criteria) this;
        }

        public Criteria andPncomDenominatorNotIn(List<Double> values) {
            addCriterion("PNCOM_DENOMINATOR not in", values, "pncomDenominator");
            return (Criteria) this;
        }

        public Criteria andPncomDenominatorBetween(Double value1, Double value2) {
            addCriterion("PNCOM_DENOMINATOR between", value1, value2, "pncomDenominator");
            return (Criteria) this;
        }

        public Criteria andPncomDenominatorNotBetween(Double value1, Double value2) {
            addCriterion("PNCOM_DENOMINATOR not between", value1, value2, "pncomDenominator");
            return (Criteria) this;
        }

        public Criteria andPncomRateIsNull() {
            addCriterion("PNCOM_RATE is null");
            return (Criteria) this;
        }

        public Criteria andPncomRateIsNotNull() {
            addCriterion("PNCOM_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andPncomRateEqualTo(Double value) {
            addCriterion("PNCOM_RATE =", value, "pncomRate");
            return (Criteria) this;
        }

        public Criteria andPncomRateNotEqualTo(Double value) {
            addCriterion("PNCOM_RATE <>", value, "pncomRate");
            return (Criteria) this;
        }

        public Criteria andPncomRateGreaterThan(Double value) {
            addCriterion("PNCOM_RATE >", value, "pncomRate");
            return (Criteria) this;
        }

        public Criteria andPncomRateGreaterThanOrEqualTo(Double value) {
            addCriterion("PNCOM_RATE >=", value, "pncomRate");
            return (Criteria) this;
        }

        public Criteria andPncomRateLessThan(Double value) {
            addCriterion("PNCOM_RATE <", value, "pncomRate");
            return (Criteria) this;
        }

        public Criteria andPncomRateLessThanOrEqualTo(Double value) {
            addCriterion("PNCOM_RATE <=", value, "pncomRate");
            return (Criteria) this;
        }

        public Criteria andPncomRateIn(List<Double> values) {
            addCriterion("PNCOM_RATE in", values, "pncomRate");
            return (Criteria) this;
        }

        public Criteria andPncomRateNotIn(List<Double> values) {
            addCriterion("PNCOM_RATE not in", values, "pncomRate");
            return (Criteria) this;
        }

        public Criteria andPncomRateBetween(Double value1, Double value2) {
            addCriterion("PNCOM_RATE between", value1, value2, "pncomRate");
            return (Criteria) this;
        }

        public Criteria andPncomRateNotBetween(Double value1, Double value2) {
            addCriterion("PNCOM_RATE not between", value1, value2, "pncomRate");
            return (Criteria) this;
        }

        public Criteria andPfeMolecularIsNull() {
            addCriterion("PFE_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andPfeMolecularIsNotNull() {
            addCriterion("PFE_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andPfeMolecularEqualTo(Double value) {
            addCriterion("PFE_MOLECULAR =", value, "pfeMolecular");
            return (Criteria) this;
        }

        public Criteria andPfeMolecularNotEqualTo(Double value) {
            addCriterion("PFE_MOLECULAR <>", value, "pfeMolecular");
            return (Criteria) this;
        }

        public Criteria andPfeMolecularGreaterThan(Double value) {
            addCriterion("PFE_MOLECULAR >", value, "pfeMolecular");
            return (Criteria) this;
        }

        public Criteria andPfeMolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("PFE_MOLECULAR >=", value, "pfeMolecular");
            return (Criteria) this;
        }

        public Criteria andPfeMolecularLessThan(Double value) {
            addCriterion("PFE_MOLECULAR <", value, "pfeMolecular");
            return (Criteria) this;
        }

        public Criteria andPfeMolecularLessThanOrEqualTo(Double value) {
            addCriterion("PFE_MOLECULAR <=", value, "pfeMolecular");
            return (Criteria) this;
        }

        public Criteria andPfeMolecularIn(List<Double> values) {
            addCriterion("PFE_MOLECULAR in", values, "pfeMolecular");
            return (Criteria) this;
        }

        public Criteria andPfeMolecularNotIn(List<Double> values) {
            addCriterion("PFE_MOLECULAR not in", values, "pfeMolecular");
            return (Criteria) this;
        }

        public Criteria andPfeMolecularBetween(Double value1, Double value2) {
            addCriterion("PFE_MOLECULAR between", value1, value2, "pfeMolecular");
            return (Criteria) this;
        }

        public Criteria andPfeMolecularNotBetween(Double value1, Double value2) {
            addCriterion("PFE_MOLECULAR not between", value1, value2, "pfeMolecular");
            return (Criteria) this;
        }

        public Criteria andPfeDenominatorIsNull() {
            addCriterion("PFE_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andPfeDenominatorIsNotNull() {
            addCriterion("PFE_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andPfeDenominatorEqualTo(Double value) {
            addCriterion("PFE_DENOMINATOR =", value, "pfeDenominator");
            return (Criteria) this;
        }

        public Criteria andPfeDenominatorNotEqualTo(Double value) {
            addCriterion("PFE_DENOMINATOR <>", value, "pfeDenominator");
            return (Criteria) this;
        }

        public Criteria andPfeDenominatorGreaterThan(Double value) {
            addCriterion("PFE_DENOMINATOR >", value, "pfeDenominator");
            return (Criteria) this;
        }

        public Criteria andPfeDenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("PFE_DENOMINATOR >=", value, "pfeDenominator");
            return (Criteria) this;
        }

        public Criteria andPfeDenominatorLessThan(Double value) {
            addCriterion("PFE_DENOMINATOR <", value, "pfeDenominator");
            return (Criteria) this;
        }

        public Criteria andPfeDenominatorLessThanOrEqualTo(Double value) {
            addCriterion("PFE_DENOMINATOR <=", value, "pfeDenominator");
            return (Criteria) this;
        }

        public Criteria andPfeDenominatorIn(List<Double> values) {
            addCriterion("PFE_DENOMINATOR in", values, "pfeDenominator");
            return (Criteria) this;
        }

        public Criteria andPfeDenominatorNotIn(List<Double> values) {
            addCriterion("PFE_DENOMINATOR not in", values, "pfeDenominator");
            return (Criteria) this;
        }

        public Criteria andPfeDenominatorBetween(Double value1, Double value2) {
            addCriterion("PFE_DENOMINATOR between", value1, value2, "pfeDenominator");
            return (Criteria) this;
        }

        public Criteria andPfeDenominatorNotBetween(Double value1, Double value2) {
            addCriterion("PFE_DENOMINATOR not between", value1, value2, "pfeDenominator");
            return (Criteria) this;
        }

        public Criteria andPfeRateIsNull() {
            addCriterion("PFE_RATE is null");
            return (Criteria) this;
        }

        public Criteria andPfeRateIsNotNull() {
            addCriterion("PFE_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andPfeRateEqualTo(Double value) {
            addCriterion("PFE_RATE =", value, "pfeRate");
            return (Criteria) this;
        }

        public Criteria andPfeRateNotEqualTo(Double value) {
            addCriterion("PFE_RATE <>", value, "pfeRate");
            return (Criteria) this;
        }

        public Criteria andPfeRateGreaterThan(Double value) {
            addCriterion("PFE_RATE >", value, "pfeRate");
            return (Criteria) this;
        }

        public Criteria andPfeRateGreaterThanOrEqualTo(Double value) {
            addCriterion("PFE_RATE >=", value, "pfeRate");
            return (Criteria) this;
        }

        public Criteria andPfeRateLessThan(Double value) {
            addCriterion("PFE_RATE <", value, "pfeRate");
            return (Criteria) this;
        }

        public Criteria andPfeRateLessThanOrEqualTo(Double value) {
            addCriterion("PFE_RATE <=", value, "pfeRate");
            return (Criteria) this;
        }

        public Criteria andPfeRateIn(List<Double> values) {
            addCriterion("PFE_RATE in", values, "pfeRate");
            return (Criteria) this;
        }

        public Criteria andPfeRateNotIn(List<Double> values) {
            addCriterion("PFE_RATE not in", values, "pfeRate");
            return (Criteria) this;
        }

        public Criteria andPfeRateBetween(Double value1, Double value2) {
            addCriterion("PFE_RATE between", value1, value2, "pfeRate");
            return (Criteria) this;
        }

        public Criteria andPfeRateNotBetween(Double value1, Double value2) {
            addCriterion("PFE_RATE not between", value1, value2, "pfeRate");
            return (Criteria) this;
        }

        public Criteria andPalMolecularIsNull() {
            addCriterion("PAL_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andPalMolecularIsNotNull() {
            addCriterion("PAL_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andPalMolecularEqualTo(Double value) {
            addCriterion("PAL_MOLECULAR =", value, "palMolecular");
            return (Criteria) this;
        }

        public Criteria andPalMolecularNotEqualTo(Double value) {
            addCriterion("PAL_MOLECULAR <>", value, "palMolecular");
            return (Criteria) this;
        }

        public Criteria andPalMolecularGreaterThan(Double value) {
            addCriterion("PAL_MOLECULAR >", value, "palMolecular");
            return (Criteria) this;
        }

        public Criteria andPalMolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("PAL_MOLECULAR >=", value, "palMolecular");
            return (Criteria) this;
        }

        public Criteria andPalMolecularLessThan(Double value) {
            addCriterion("PAL_MOLECULAR <", value, "palMolecular");
            return (Criteria) this;
        }

        public Criteria andPalMolecularLessThanOrEqualTo(Double value) {
            addCriterion("PAL_MOLECULAR <=", value, "palMolecular");
            return (Criteria) this;
        }

        public Criteria andPalMolecularIn(List<Double> values) {
            addCriterion("PAL_MOLECULAR in", values, "palMolecular");
            return (Criteria) this;
        }

        public Criteria andPalMolecularNotIn(List<Double> values) {
            addCriterion("PAL_MOLECULAR not in", values, "palMolecular");
            return (Criteria) this;
        }

        public Criteria andPalMolecularBetween(Double value1, Double value2) {
            addCriterion("PAL_MOLECULAR between", value1, value2, "palMolecular");
            return (Criteria) this;
        }

        public Criteria andPalMolecularNotBetween(Double value1, Double value2) {
            addCriterion("PAL_MOLECULAR not between", value1, value2, "palMolecular");
            return (Criteria) this;
        }

        public Criteria andPalDenominatorIsNull() {
            addCriterion("PAL_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andPalDenominatorIsNotNull() {
            addCriterion("PAL_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andPalDenominatorEqualTo(Double value) {
            addCriterion("PAL_DENOMINATOR =", value, "palDenominator");
            return (Criteria) this;
        }

        public Criteria andPalDenominatorNotEqualTo(Double value) {
            addCriterion("PAL_DENOMINATOR <>", value, "palDenominator");
            return (Criteria) this;
        }

        public Criteria andPalDenominatorGreaterThan(Double value) {
            addCriterion("PAL_DENOMINATOR >", value, "palDenominator");
            return (Criteria) this;
        }

        public Criteria andPalDenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("PAL_DENOMINATOR >=", value, "palDenominator");
            return (Criteria) this;
        }

        public Criteria andPalDenominatorLessThan(Double value) {
            addCriterion("PAL_DENOMINATOR <", value, "palDenominator");
            return (Criteria) this;
        }

        public Criteria andPalDenominatorLessThanOrEqualTo(Double value) {
            addCriterion("PAL_DENOMINATOR <=", value, "palDenominator");
            return (Criteria) this;
        }

        public Criteria andPalDenominatorIn(List<Double> values) {
            addCriterion("PAL_DENOMINATOR in", values, "palDenominator");
            return (Criteria) this;
        }

        public Criteria andPalDenominatorNotIn(List<Double> values) {
            addCriterion("PAL_DENOMINATOR not in", values, "palDenominator");
            return (Criteria) this;
        }

        public Criteria andPalDenominatorBetween(Double value1, Double value2) {
            addCriterion("PAL_DENOMINATOR between", value1, value2, "palDenominator");
            return (Criteria) this;
        }

        public Criteria andPalDenominatorNotBetween(Double value1, Double value2) {
            addCriterion("PAL_DENOMINATOR not between", value1, value2, "palDenominator");
            return (Criteria) this;
        }

        public Criteria andPalRateIsNull() {
            addCriterion("PAL_RATE is null");
            return (Criteria) this;
        }

        public Criteria andPalRateIsNotNull() {
            addCriterion("PAL_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andPalRateEqualTo(Double value) {
            addCriterion("PAL_RATE =", value, "palRate");
            return (Criteria) this;
        }

        public Criteria andPalRateNotEqualTo(Double value) {
            addCriterion("PAL_RATE <>", value, "palRate");
            return (Criteria) this;
        }

        public Criteria andPalRateGreaterThan(Double value) {
            addCriterion("PAL_RATE >", value, "palRate");
            return (Criteria) this;
        }

        public Criteria andPalRateGreaterThanOrEqualTo(Double value) {
            addCriterion("PAL_RATE >=", value, "palRate");
            return (Criteria) this;
        }

        public Criteria andPalRateLessThan(Double value) {
            addCriterion("PAL_RATE <", value, "palRate");
            return (Criteria) this;
        }

        public Criteria andPalRateLessThanOrEqualTo(Double value) {
            addCriterion("PAL_RATE <=", value, "palRate");
            return (Criteria) this;
        }

        public Criteria andPalRateIn(List<Double> values) {
            addCriterion("PAL_RATE in", values, "palRate");
            return (Criteria) this;
        }

        public Criteria andPalRateNotIn(List<Double> values) {
            addCriterion("PAL_RATE not in", values, "palRate");
            return (Criteria) this;
        }

        public Criteria andPalRateBetween(Double value1, Double value2) {
            addCriterion("PAL_RATE between", value1, value2, "palRate");
            return (Criteria) this;
        }

        public Criteria andPalRateNotBetween(Double value1, Double value2) {
            addCriterion("PAL_RATE not between", value1, value2, "palRate");
            return (Criteria) this;
        }

        public Criteria andPsiMolecularIsNull() {
            addCriterion("PSI_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andPsiMolecularIsNotNull() {
            addCriterion("PSI_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andPsiMolecularEqualTo(Double value) {
            addCriterion("PSI_MOLECULAR =", value, "psiMolecular");
            return (Criteria) this;
        }

        public Criteria andPsiMolecularNotEqualTo(Double value) {
            addCriterion("PSI_MOLECULAR <>", value, "psiMolecular");
            return (Criteria) this;
        }

        public Criteria andPsiMolecularGreaterThan(Double value) {
            addCriterion("PSI_MOLECULAR >", value, "psiMolecular");
            return (Criteria) this;
        }

        public Criteria andPsiMolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("PSI_MOLECULAR >=", value, "psiMolecular");
            return (Criteria) this;
        }

        public Criteria andPsiMolecularLessThan(Double value) {
            addCriterion("PSI_MOLECULAR <", value, "psiMolecular");
            return (Criteria) this;
        }

        public Criteria andPsiMolecularLessThanOrEqualTo(Double value) {
            addCriterion("PSI_MOLECULAR <=", value, "psiMolecular");
            return (Criteria) this;
        }

        public Criteria andPsiMolecularIn(List<Double> values) {
            addCriterion("PSI_MOLECULAR in", values, "psiMolecular");
            return (Criteria) this;
        }

        public Criteria andPsiMolecularNotIn(List<Double> values) {
            addCriterion("PSI_MOLECULAR not in", values, "psiMolecular");
            return (Criteria) this;
        }

        public Criteria andPsiMolecularBetween(Double value1, Double value2) {
            addCriterion("PSI_MOLECULAR between", value1, value2, "psiMolecular");
            return (Criteria) this;
        }

        public Criteria andPsiMolecularNotBetween(Double value1, Double value2) {
            addCriterion("PSI_MOLECULAR not between", value1, value2, "psiMolecular");
            return (Criteria) this;
        }

        public Criteria andPsiDenominatorIsNull() {
            addCriterion("PSI_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andPsiDenominatorIsNotNull() {
            addCriterion("PSI_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andPsiDenominatorEqualTo(Double value) {
            addCriterion("PSI_DENOMINATOR =", value, "psiDenominator");
            return (Criteria) this;
        }

        public Criteria andPsiDenominatorNotEqualTo(Double value) {
            addCriterion("PSI_DENOMINATOR <>", value, "psiDenominator");
            return (Criteria) this;
        }

        public Criteria andPsiDenominatorGreaterThan(Double value) {
            addCriterion("PSI_DENOMINATOR >", value, "psiDenominator");
            return (Criteria) this;
        }

        public Criteria andPsiDenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("PSI_DENOMINATOR >=", value, "psiDenominator");
            return (Criteria) this;
        }

        public Criteria andPsiDenominatorLessThan(Double value) {
            addCriterion("PSI_DENOMINATOR <", value, "psiDenominator");
            return (Criteria) this;
        }

        public Criteria andPsiDenominatorLessThanOrEqualTo(Double value) {
            addCriterion("PSI_DENOMINATOR <=", value, "psiDenominator");
            return (Criteria) this;
        }

        public Criteria andPsiDenominatorIn(List<Double> values) {
            addCriterion("PSI_DENOMINATOR in", values, "psiDenominator");
            return (Criteria) this;
        }

        public Criteria andPsiDenominatorNotIn(List<Double> values) {
            addCriterion("PSI_DENOMINATOR not in", values, "psiDenominator");
            return (Criteria) this;
        }

        public Criteria andPsiDenominatorBetween(Double value1, Double value2) {
            addCriterion("PSI_DENOMINATOR between", value1, value2, "psiDenominator");
            return (Criteria) this;
        }

        public Criteria andPsiDenominatorNotBetween(Double value1, Double value2) {
            addCriterion("PSI_DENOMINATOR not between", value1, value2, "psiDenominator");
            return (Criteria) this;
        }

        public Criteria andPsiRateIsNull() {
            addCriterion("PSI_RATE is null");
            return (Criteria) this;
        }

        public Criteria andPsiRateIsNotNull() {
            addCriterion("PSI_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andPsiRateEqualTo(Double value) {
            addCriterion("PSI_RATE =", value, "psiRate");
            return (Criteria) this;
        }

        public Criteria andPsiRateNotEqualTo(Double value) {
            addCriterion("PSI_RATE <>", value, "psiRate");
            return (Criteria) this;
        }

        public Criteria andPsiRateGreaterThan(Double value) {
            addCriterion("PSI_RATE >", value, "psiRate");
            return (Criteria) this;
        }

        public Criteria andPsiRateGreaterThanOrEqualTo(Double value) {
            addCriterion("PSI_RATE >=", value, "psiRate");
            return (Criteria) this;
        }

        public Criteria andPsiRateLessThan(Double value) {
            addCriterion("PSI_RATE <", value, "psiRate");
            return (Criteria) this;
        }

        public Criteria andPsiRateLessThanOrEqualTo(Double value) {
            addCriterion("PSI_RATE <=", value, "psiRate");
            return (Criteria) this;
        }

        public Criteria andPsiRateIn(List<Double> values) {
            addCriterion("PSI_RATE in", values, "psiRate");
            return (Criteria) this;
        }

        public Criteria andPsiRateNotIn(List<Double> values) {
            addCriterion("PSI_RATE not in", values, "psiRate");
            return (Criteria) this;
        }

        public Criteria andPsiRateBetween(Double value1, Double value2) {
            addCriterion("PSI_RATE between", value1, value2, "psiRate");
            return (Criteria) this;
        }

        public Criteria andPsiRateNotBetween(Double value1, Double value2) {
            addCriterion("PSI_RATE not between", value1, value2, "psiRate");
            return (Criteria) this;
        }

        public Criteria andPtiMolecularIsNull() {
            addCriterion("PTI_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andPtiMolecularIsNotNull() {
            addCriterion("PTI_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andPtiMolecularEqualTo(Double value) {
            addCriterion("PTI_MOLECULAR =", value, "ptiMolecular");
            return (Criteria) this;
        }

        public Criteria andPtiMolecularNotEqualTo(Double value) {
            addCriterion("PTI_MOLECULAR <>", value, "ptiMolecular");
            return (Criteria) this;
        }

        public Criteria andPtiMolecularGreaterThan(Double value) {
            addCriterion("PTI_MOLECULAR >", value, "ptiMolecular");
            return (Criteria) this;
        }

        public Criteria andPtiMolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("PTI_MOLECULAR >=", value, "ptiMolecular");
            return (Criteria) this;
        }

        public Criteria andPtiMolecularLessThan(Double value) {
            addCriterion("PTI_MOLECULAR <", value, "ptiMolecular");
            return (Criteria) this;
        }

        public Criteria andPtiMolecularLessThanOrEqualTo(Double value) {
            addCriterion("PTI_MOLECULAR <=", value, "ptiMolecular");
            return (Criteria) this;
        }

        public Criteria andPtiMolecularIn(List<Double> values) {
            addCriterion("PTI_MOLECULAR in", values, "ptiMolecular");
            return (Criteria) this;
        }

        public Criteria andPtiMolecularNotIn(List<Double> values) {
            addCriterion("PTI_MOLECULAR not in", values, "ptiMolecular");
            return (Criteria) this;
        }

        public Criteria andPtiMolecularBetween(Double value1, Double value2) {
            addCriterion("PTI_MOLECULAR between", value1, value2, "ptiMolecular");
            return (Criteria) this;
        }

        public Criteria andPtiMolecularNotBetween(Double value1, Double value2) {
            addCriterion("PTI_MOLECULAR not between", value1, value2, "ptiMolecular");
            return (Criteria) this;
        }

        public Criteria andPtiDenominatorIsNull() {
            addCriterion("PTI_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andPtiDenominatorIsNotNull() {
            addCriterion("PTI_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andPtiDenominatorEqualTo(Double value) {
            addCriterion("PTI_DENOMINATOR =", value, "ptiDenominator");
            return (Criteria) this;
        }

        public Criteria andPtiDenominatorNotEqualTo(Double value) {
            addCriterion("PTI_DENOMINATOR <>", value, "ptiDenominator");
            return (Criteria) this;
        }

        public Criteria andPtiDenominatorGreaterThan(Double value) {
            addCriterion("PTI_DENOMINATOR >", value, "ptiDenominator");
            return (Criteria) this;
        }

        public Criteria andPtiDenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("PTI_DENOMINATOR >=", value, "ptiDenominator");
            return (Criteria) this;
        }

        public Criteria andPtiDenominatorLessThan(Double value) {
            addCriterion("PTI_DENOMINATOR <", value, "ptiDenominator");
            return (Criteria) this;
        }

        public Criteria andPtiDenominatorLessThanOrEqualTo(Double value) {
            addCriterion("PTI_DENOMINATOR <=", value, "ptiDenominator");
            return (Criteria) this;
        }

        public Criteria andPtiDenominatorIn(List<Double> values) {
            addCriterion("PTI_DENOMINATOR in", values, "ptiDenominator");
            return (Criteria) this;
        }

        public Criteria andPtiDenominatorNotIn(List<Double> values) {
            addCriterion("PTI_DENOMINATOR not in", values, "ptiDenominator");
            return (Criteria) this;
        }

        public Criteria andPtiDenominatorBetween(Double value1, Double value2) {
            addCriterion("PTI_DENOMINATOR between", value1, value2, "ptiDenominator");
            return (Criteria) this;
        }

        public Criteria andPtiDenominatorNotBetween(Double value1, Double value2) {
            addCriterion("PTI_DENOMINATOR not between", value1, value2, "ptiDenominator");
            return (Criteria) this;
        }

        public Criteria andPtiRateIsNull() {
            addCriterion("PTI_RATE is null");
            return (Criteria) this;
        }

        public Criteria andPtiRateIsNotNull() {
            addCriterion("PTI_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andPtiRateEqualTo(Double value) {
            addCriterion("PTI_RATE =", value, "ptiRate");
            return (Criteria) this;
        }

        public Criteria andPtiRateNotEqualTo(Double value) {
            addCriterion("PTI_RATE <>", value, "ptiRate");
            return (Criteria) this;
        }

        public Criteria andPtiRateGreaterThan(Double value) {
            addCriterion("PTI_RATE >", value, "ptiRate");
            return (Criteria) this;
        }

        public Criteria andPtiRateGreaterThanOrEqualTo(Double value) {
            addCriterion("PTI_RATE >=", value, "ptiRate");
            return (Criteria) this;
        }

        public Criteria andPtiRateLessThan(Double value) {
            addCriterion("PTI_RATE <", value, "ptiRate");
            return (Criteria) this;
        }

        public Criteria andPtiRateLessThanOrEqualTo(Double value) {
            addCriterion("PTI_RATE <=", value, "ptiRate");
            return (Criteria) this;
        }

        public Criteria andPtiRateIn(List<Double> values) {
            addCriterion("PTI_RATE in", values, "ptiRate");
            return (Criteria) this;
        }

        public Criteria andPtiRateNotIn(List<Double> values) {
            addCriterion("PTI_RATE not in", values, "ptiRate");
            return (Criteria) this;
        }

        public Criteria andPtiRateBetween(Double value1, Double value2) {
            addCriterion("PTI_RATE between", value1, value2, "ptiRate");
            return (Criteria) this;
        }

        public Criteria andPtiRateNotBetween(Double value1, Double value2) {
            addCriterion("PTI_RATE not between", value1, value2, "ptiRate");
            return (Criteria) this;
        }

        public Criteria andPmnMolecularIsNull() {
            addCriterion("PMN_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andPmnMolecularIsNotNull() {
            addCriterion("PMN_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andPmnMolecularEqualTo(Double value) {
            addCriterion("PMN_MOLECULAR =", value, "pmnMolecular");
            return (Criteria) this;
        }

        public Criteria andPmnMolecularNotEqualTo(Double value) {
            addCriterion("PMN_MOLECULAR <>", value, "pmnMolecular");
            return (Criteria) this;
        }

        public Criteria andPmnMolecularGreaterThan(Double value) {
            addCriterion("PMN_MOLECULAR >", value, "pmnMolecular");
            return (Criteria) this;
        }

        public Criteria andPmnMolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("PMN_MOLECULAR >=", value, "pmnMolecular");
            return (Criteria) this;
        }

        public Criteria andPmnMolecularLessThan(Double value) {
            addCriterion("PMN_MOLECULAR <", value, "pmnMolecular");
            return (Criteria) this;
        }

        public Criteria andPmnMolecularLessThanOrEqualTo(Double value) {
            addCriterion("PMN_MOLECULAR <=", value, "pmnMolecular");
            return (Criteria) this;
        }

        public Criteria andPmnMolecularIn(List<Double> values) {
            addCriterion("PMN_MOLECULAR in", values, "pmnMolecular");
            return (Criteria) this;
        }

        public Criteria andPmnMolecularNotIn(List<Double> values) {
            addCriterion("PMN_MOLECULAR not in", values, "pmnMolecular");
            return (Criteria) this;
        }

        public Criteria andPmnMolecularBetween(Double value1, Double value2) {
            addCriterion("PMN_MOLECULAR between", value1, value2, "pmnMolecular");
            return (Criteria) this;
        }

        public Criteria andPmnMolecularNotBetween(Double value1, Double value2) {
            addCriterion("PMN_MOLECULAR not between", value1, value2, "pmnMolecular");
            return (Criteria) this;
        }

        public Criteria andPmnDenominatorIsNull() {
            addCriterion("PMN_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andPmnDenominatorIsNotNull() {
            addCriterion("PMN_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andPmnDenominatorEqualTo(Double value) {
            addCriterion("PMN_DENOMINATOR =", value, "pmnDenominator");
            return (Criteria) this;
        }

        public Criteria andPmnDenominatorNotEqualTo(Double value) {
            addCriterion("PMN_DENOMINATOR <>", value, "pmnDenominator");
            return (Criteria) this;
        }

        public Criteria andPmnDenominatorGreaterThan(Double value) {
            addCriterion("PMN_DENOMINATOR >", value, "pmnDenominator");
            return (Criteria) this;
        }

        public Criteria andPmnDenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("PMN_DENOMINATOR >=", value, "pmnDenominator");
            return (Criteria) this;
        }

        public Criteria andPmnDenominatorLessThan(Double value) {
            addCriterion("PMN_DENOMINATOR <", value, "pmnDenominator");
            return (Criteria) this;
        }

        public Criteria andPmnDenominatorLessThanOrEqualTo(Double value) {
            addCriterion("PMN_DENOMINATOR <=", value, "pmnDenominator");
            return (Criteria) this;
        }

        public Criteria andPmnDenominatorIn(List<Double> values) {
            addCriterion("PMN_DENOMINATOR in", values, "pmnDenominator");
            return (Criteria) this;
        }

        public Criteria andPmnDenominatorNotIn(List<Double> values) {
            addCriterion("PMN_DENOMINATOR not in", values, "pmnDenominator");
            return (Criteria) this;
        }

        public Criteria andPmnDenominatorBetween(Double value1, Double value2) {
            addCriterion("PMN_DENOMINATOR between", value1, value2, "pmnDenominator");
            return (Criteria) this;
        }

        public Criteria andPmnDenominatorNotBetween(Double value1, Double value2) {
            addCriterion("PMN_DENOMINATOR not between", value1, value2, "pmnDenominator");
            return (Criteria) this;
        }

        public Criteria andPmnRateIsNull() {
            addCriterion("PMN_RATE is null");
            return (Criteria) this;
        }

        public Criteria andPmnRateIsNotNull() {
            addCriterion("PMN_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andPmnRateEqualTo(Double value) {
            addCriterion("PMN_RATE =", value, "pmnRate");
            return (Criteria) this;
        }

        public Criteria andPmnRateNotEqualTo(Double value) {
            addCriterion("PMN_RATE <>", value, "pmnRate");
            return (Criteria) this;
        }

        public Criteria andPmnRateGreaterThan(Double value) {
            addCriterion("PMN_RATE >", value, "pmnRate");
            return (Criteria) this;
        }

        public Criteria andPmnRateGreaterThanOrEqualTo(Double value) {
            addCriterion("PMN_RATE >=", value, "pmnRate");
            return (Criteria) this;
        }

        public Criteria andPmnRateLessThan(Double value) {
            addCriterion("PMN_RATE <", value, "pmnRate");
            return (Criteria) this;
        }

        public Criteria andPmnRateLessThanOrEqualTo(Double value) {
            addCriterion("PMN_RATE <=", value, "pmnRate");
            return (Criteria) this;
        }

        public Criteria andPmnRateIn(List<Double> values) {
            addCriterion("PMN_RATE in", values, "pmnRate");
            return (Criteria) this;
        }

        public Criteria andPmnRateNotIn(List<Double> values) {
            addCriterion("PMN_RATE not in", values, "pmnRate");
            return (Criteria) this;
        }

        public Criteria andPmnRateBetween(Double value1, Double value2) {
            addCriterion("PMN_RATE between", value1, value2, "pmnRate");
            return (Criteria) this;
        }

        public Criteria andPmnRateNotBetween(Double value1, Double value2) {
            addCriterion("PMN_RATE not between", value1, value2, "pmnRate");
            return (Criteria) this;
        }

        public Criteria andPclMolecularIsNull() {
            addCriterion("PCL_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andPclMolecularIsNotNull() {
            addCriterion("PCL_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andPclMolecularEqualTo(Double value) {
            addCriterion("PCL_MOLECULAR =", value, "pclMolecular");
            return (Criteria) this;
        }

        public Criteria andPclMolecularNotEqualTo(Double value) {
            addCriterion("PCL_MOLECULAR <>", value, "pclMolecular");
            return (Criteria) this;
        }

        public Criteria andPclMolecularGreaterThan(Double value) {
            addCriterion("PCL_MOLECULAR >", value, "pclMolecular");
            return (Criteria) this;
        }

        public Criteria andPclMolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("PCL_MOLECULAR >=", value, "pclMolecular");
            return (Criteria) this;
        }

        public Criteria andPclMolecularLessThan(Double value) {
            addCriterion("PCL_MOLECULAR <", value, "pclMolecular");
            return (Criteria) this;
        }

        public Criteria andPclMolecularLessThanOrEqualTo(Double value) {
            addCriterion("PCL_MOLECULAR <=", value, "pclMolecular");
            return (Criteria) this;
        }

        public Criteria andPclMolecularIn(List<Double> values) {
            addCriterion("PCL_MOLECULAR in", values, "pclMolecular");
            return (Criteria) this;
        }

        public Criteria andPclMolecularNotIn(List<Double> values) {
            addCriterion("PCL_MOLECULAR not in", values, "pclMolecular");
            return (Criteria) this;
        }

        public Criteria andPclMolecularBetween(Double value1, Double value2) {
            addCriterion("PCL_MOLECULAR between", value1, value2, "pclMolecular");
            return (Criteria) this;
        }

        public Criteria andPclMolecularNotBetween(Double value1, Double value2) {
            addCriterion("PCL_MOLECULAR not between", value1, value2, "pclMolecular");
            return (Criteria) this;
        }

        public Criteria andPclDenominatorIsNull() {
            addCriterion("PCL_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andPclDenominatorIsNotNull() {
            addCriterion("PCL_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andPclDenominatorEqualTo(Double value) {
            addCriterion("PCL_DENOMINATOR =", value, "pclDenominator");
            return (Criteria) this;
        }

        public Criteria andPclDenominatorNotEqualTo(Double value) {
            addCriterion("PCL_DENOMINATOR <>", value, "pclDenominator");
            return (Criteria) this;
        }

        public Criteria andPclDenominatorGreaterThan(Double value) {
            addCriterion("PCL_DENOMINATOR >", value, "pclDenominator");
            return (Criteria) this;
        }

        public Criteria andPclDenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("PCL_DENOMINATOR >=", value, "pclDenominator");
            return (Criteria) this;
        }

        public Criteria andPclDenominatorLessThan(Double value) {
            addCriterion("PCL_DENOMINATOR <", value, "pclDenominator");
            return (Criteria) this;
        }

        public Criteria andPclDenominatorLessThanOrEqualTo(Double value) {
            addCriterion("PCL_DENOMINATOR <=", value, "pclDenominator");
            return (Criteria) this;
        }

        public Criteria andPclDenominatorIn(List<Double> values) {
            addCriterion("PCL_DENOMINATOR in", values, "pclDenominator");
            return (Criteria) this;
        }

        public Criteria andPclDenominatorNotIn(List<Double> values) {
            addCriterion("PCL_DENOMINATOR not in", values, "pclDenominator");
            return (Criteria) this;
        }

        public Criteria andPclDenominatorBetween(Double value1, Double value2) {
            addCriterion("PCL_DENOMINATOR between", value1, value2, "pclDenominator");
            return (Criteria) this;
        }

        public Criteria andPclDenominatorNotBetween(Double value1, Double value2) {
            addCriterion("PCL_DENOMINATOR not between", value1, value2, "pclDenominator");
            return (Criteria) this;
        }

        public Criteria andPclRateIsNull() {
            addCriterion("PCL_RATE is null");
            return (Criteria) this;
        }

        public Criteria andPclRateIsNotNull() {
            addCriterion("PCL_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andPclRateEqualTo(Double value) {
            addCriterion("PCL_RATE =", value, "pclRate");
            return (Criteria) this;
        }

        public Criteria andPclRateNotEqualTo(Double value) {
            addCriterion("PCL_RATE <>", value, "pclRate");
            return (Criteria) this;
        }

        public Criteria andPclRateGreaterThan(Double value) {
            addCriterion("PCL_RATE >", value, "pclRate");
            return (Criteria) this;
        }

        public Criteria andPclRateGreaterThanOrEqualTo(Double value) {
            addCriterion("PCL_RATE >=", value, "pclRate");
            return (Criteria) this;
        }

        public Criteria andPclRateLessThan(Double value) {
            addCriterion("PCL_RATE <", value, "pclRate");
            return (Criteria) this;
        }

        public Criteria andPclRateLessThanOrEqualTo(Double value) {
            addCriterion("PCL_RATE <=", value, "pclRate");
            return (Criteria) this;
        }

        public Criteria andPclRateIn(List<Double> values) {
            addCriterion("PCL_RATE in", values, "pclRate");
            return (Criteria) this;
        }

        public Criteria andPclRateNotIn(List<Double> values) {
            addCriterion("PCL_RATE not in", values, "pclRate");
            return (Criteria) this;
        }

        public Criteria andPclRateBetween(Double value1, Double value2) {
            addCriterion("PCL_RATE between", value1, value2, "pclRate");
            return (Criteria) this;
        }

        public Criteria andPclRateNotBetween(Double value1, Double value2) {
            addCriterion("PCL_RATE not between", value1, value2, "pclRate");
            return (Criteria) this;
        }

        public Criteria andPnh4MolecularIsNull() {
            addCriterion("PNH4_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andPnh4MolecularIsNotNull() {
            addCriterion("PNH4_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andPnh4MolecularEqualTo(Double value) {
            addCriterion("PNH4_MOLECULAR =", value, "pnh4Molecular");
            return (Criteria) this;
        }

        public Criteria andPnh4MolecularNotEqualTo(Double value) {
            addCriterion("PNH4_MOLECULAR <>", value, "pnh4Molecular");
            return (Criteria) this;
        }

        public Criteria andPnh4MolecularGreaterThan(Double value) {
            addCriterion("PNH4_MOLECULAR >", value, "pnh4Molecular");
            return (Criteria) this;
        }

        public Criteria andPnh4MolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("PNH4_MOLECULAR >=", value, "pnh4Molecular");
            return (Criteria) this;
        }

        public Criteria andPnh4MolecularLessThan(Double value) {
            addCriterion("PNH4_MOLECULAR <", value, "pnh4Molecular");
            return (Criteria) this;
        }

        public Criteria andPnh4MolecularLessThanOrEqualTo(Double value) {
            addCriterion("PNH4_MOLECULAR <=", value, "pnh4Molecular");
            return (Criteria) this;
        }

        public Criteria andPnh4MolecularIn(List<Double> values) {
            addCriterion("PNH4_MOLECULAR in", values, "pnh4Molecular");
            return (Criteria) this;
        }

        public Criteria andPnh4MolecularNotIn(List<Double> values) {
            addCriterion("PNH4_MOLECULAR not in", values, "pnh4Molecular");
            return (Criteria) this;
        }

        public Criteria andPnh4MolecularBetween(Double value1, Double value2) {
            addCriterion("PNH4_MOLECULAR between", value1, value2, "pnh4Molecular");
            return (Criteria) this;
        }

        public Criteria andPnh4MolecularNotBetween(Double value1, Double value2) {
            addCriterion("PNH4_MOLECULAR not between", value1, value2, "pnh4Molecular");
            return (Criteria) this;
        }

        public Criteria andPnh4DenominatorIsNull() {
            addCriterion("PNH4_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andPnh4DenominatorIsNotNull() {
            addCriterion("PNH4_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andPnh4DenominatorEqualTo(Double value) {
            addCriterion("PNH4_DENOMINATOR =", value, "pnh4Denominator");
            return (Criteria) this;
        }

        public Criteria andPnh4DenominatorNotEqualTo(Double value) {
            addCriterion("PNH4_DENOMINATOR <>", value, "pnh4Denominator");
            return (Criteria) this;
        }

        public Criteria andPnh4DenominatorGreaterThan(Double value) {
            addCriterion("PNH4_DENOMINATOR >", value, "pnh4Denominator");
            return (Criteria) this;
        }

        public Criteria andPnh4DenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("PNH4_DENOMINATOR >=", value, "pnh4Denominator");
            return (Criteria) this;
        }

        public Criteria andPnh4DenominatorLessThan(Double value) {
            addCriterion("PNH4_DENOMINATOR <", value, "pnh4Denominator");
            return (Criteria) this;
        }

        public Criteria andPnh4DenominatorLessThanOrEqualTo(Double value) {
            addCriterion("PNH4_DENOMINATOR <=", value, "pnh4Denominator");
            return (Criteria) this;
        }

        public Criteria andPnh4DenominatorIn(List<Double> values) {
            addCriterion("PNH4_DENOMINATOR in", values, "pnh4Denominator");
            return (Criteria) this;
        }

        public Criteria andPnh4DenominatorNotIn(List<Double> values) {
            addCriterion("PNH4_DENOMINATOR not in", values, "pnh4Denominator");
            return (Criteria) this;
        }

        public Criteria andPnh4DenominatorBetween(Double value1, Double value2) {
            addCriterion("PNH4_DENOMINATOR between", value1, value2, "pnh4Denominator");
            return (Criteria) this;
        }

        public Criteria andPnh4DenominatorNotBetween(Double value1, Double value2) {
            addCriterion("PNH4_DENOMINATOR not between", value1, value2, "pnh4Denominator");
            return (Criteria) this;
        }

        public Criteria andPnh4RateIsNull() {
            addCriterion("PNH4_RATE is null");
            return (Criteria) this;
        }

        public Criteria andPnh4RateIsNotNull() {
            addCriterion("PNH4_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andPnh4RateEqualTo(Double value) {
            addCriterion("PNH4_RATE =", value, "pnh4Rate");
            return (Criteria) this;
        }

        public Criteria andPnh4RateNotEqualTo(Double value) {
            addCriterion("PNH4_RATE <>", value, "pnh4Rate");
            return (Criteria) this;
        }

        public Criteria andPnh4RateGreaterThan(Double value) {
            addCriterion("PNH4_RATE >", value, "pnh4Rate");
            return (Criteria) this;
        }

        public Criteria andPnh4RateGreaterThanOrEqualTo(Double value) {
            addCriterion("PNH4_RATE >=", value, "pnh4Rate");
            return (Criteria) this;
        }

        public Criteria andPnh4RateLessThan(Double value) {
            addCriterion("PNH4_RATE <", value, "pnh4Rate");
            return (Criteria) this;
        }

        public Criteria andPnh4RateLessThanOrEqualTo(Double value) {
            addCriterion("PNH4_RATE <=", value, "pnh4Rate");
            return (Criteria) this;
        }

        public Criteria andPnh4RateIn(List<Double> values) {
            addCriterion("PNH4_RATE in", values, "pnh4Rate");
            return (Criteria) this;
        }

        public Criteria andPnh4RateNotIn(List<Double> values) {
            addCriterion("PNH4_RATE not in", values, "pnh4Rate");
            return (Criteria) this;
        }

        public Criteria andPnh4RateBetween(Double value1, Double value2) {
            addCriterion("PNH4_RATE between", value1, value2, "pnh4Rate");
            return (Criteria) this;
        }

        public Criteria andPnh4RateNotBetween(Double value1, Double value2) {
            addCriterion("PNH4_RATE not between", value1, value2, "pnh4Rate");
            return (Criteria) this;
        }

        public Criteria andPnaMolecularIsNull() {
            addCriterion("PNA_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andPnaMolecularIsNotNull() {
            addCriterion("PNA_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andPnaMolecularEqualTo(Double value) {
            addCriterion("PNA_MOLECULAR =", value, "pnaMolecular");
            return (Criteria) this;
        }

        public Criteria andPnaMolecularNotEqualTo(Double value) {
            addCriterion("PNA_MOLECULAR <>", value, "pnaMolecular");
            return (Criteria) this;
        }

        public Criteria andPnaMolecularGreaterThan(Double value) {
            addCriterion("PNA_MOLECULAR >", value, "pnaMolecular");
            return (Criteria) this;
        }

        public Criteria andPnaMolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("PNA_MOLECULAR >=", value, "pnaMolecular");
            return (Criteria) this;
        }

        public Criteria andPnaMolecularLessThan(Double value) {
            addCriterion("PNA_MOLECULAR <", value, "pnaMolecular");
            return (Criteria) this;
        }

        public Criteria andPnaMolecularLessThanOrEqualTo(Double value) {
            addCriterion("PNA_MOLECULAR <=", value, "pnaMolecular");
            return (Criteria) this;
        }

        public Criteria andPnaMolecularIn(List<Double> values) {
            addCriterion("PNA_MOLECULAR in", values, "pnaMolecular");
            return (Criteria) this;
        }

        public Criteria andPnaMolecularNotIn(List<Double> values) {
            addCriterion("PNA_MOLECULAR not in", values, "pnaMolecular");
            return (Criteria) this;
        }

        public Criteria andPnaMolecularBetween(Double value1, Double value2) {
            addCriterion("PNA_MOLECULAR between", value1, value2, "pnaMolecular");
            return (Criteria) this;
        }

        public Criteria andPnaMolecularNotBetween(Double value1, Double value2) {
            addCriterion("PNA_MOLECULAR not between", value1, value2, "pnaMolecular");
            return (Criteria) this;
        }

        public Criteria andPnaDenominatorIsNull() {
            addCriterion("PNA_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andPnaDenominatorIsNotNull() {
            addCriterion("PNA_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andPnaDenominatorEqualTo(Double value) {
            addCriterion("PNA_DENOMINATOR =", value, "pnaDenominator");
            return (Criteria) this;
        }

        public Criteria andPnaDenominatorNotEqualTo(Double value) {
            addCriterion("PNA_DENOMINATOR <>", value, "pnaDenominator");
            return (Criteria) this;
        }

        public Criteria andPnaDenominatorGreaterThan(Double value) {
            addCriterion("PNA_DENOMINATOR >", value, "pnaDenominator");
            return (Criteria) this;
        }

        public Criteria andPnaDenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("PNA_DENOMINATOR >=", value, "pnaDenominator");
            return (Criteria) this;
        }

        public Criteria andPnaDenominatorLessThan(Double value) {
            addCriterion("PNA_DENOMINATOR <", value, "pnaDenominator");
            return (Criteria) this;
        }

        public Criteria andPnaDenominatorLessThanOrEqualTo(Double value) {
            addCriterion("PNA_DENOMINATOR <=", value, "pnaDenominator");
            return (Criteria) this;
        }

        public Criteria andPnaDenominatorIn(List<Double> values) {
            addCriterion("PNA_DENOMINATOR in", values, "pnaDenominator");
            return (Criteria) this;
        }

        public Criteria andPnaDenominatorNotIn(List<Double> values) {
            addCriterion("PNA_DENOMINATOR not in", values, "pnaDenominator");
            return (Criteria) this;
        }

        public Criteria andPnaDenominatorBetween(Double value1, Double value2) {
            addCriterion("PNA_DENOMINATOR between", value1, value2, "pnaDenominator");
            return (Criteria) this;
        }

        public Criteria andPnaDenominatorNotBetween(Double value1, Double value2) {
            addCriterion("PNA_DENOMINATOR not between", value1, value2, "pnaDenominator");
            return (Criteria) this;
        }

        public Criteria andPnaRateIsNull() {
            addCriterion("PNA_RATE is null");
            return (Criteria) this;
        }

        public Criteria andPnaRateIsNotNull() {
            addCriterion("PNA_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andPnaRateEqualTo(Double value) {
            addCriterion("PNA_RATE =", value, "pnaRate");
            return (Criteria) this;
        }

        public Criteria andPnaRateNotEqualTo(Double value) {
            addCriterion("PNA_RATE <>", value, "pnaRate");
            return (Criteria) this;
        }

        public Criteria andPnaRateGreaterThan(Double value) {
            addCriterion("PNA_RATE >", value, "pnaRate");
            return (Criteria) this;
        }

        public Criteria andPnaRateGreaterThanOrEqualTo(Double value) {
            addCriterion("PNA_RATE >=", value, "pnaRate");
            return (Criteria) this;
        }

        public Criteria andPnaRateLessThan(Double value) {
            addCriterion("PNA_RATE <", value, "pnaRate");
            return (Criteria) this;
        }

        public Criteria andPnaRateLessThanOrEqualTo(Double value) {
            addCriterion("PNA_RATE <=", value, "pnaRate");
            return (Criteria) this;
        }

        public Criteria andPnaRateIn(List<Double> values) {
            addCriterion("PNA_RATE in", values, "pnaRate");
            return (Criteria) this;
        }

        public Criteria andPnaRateNotIn(List<Double> values) {
            addCriterion("PNA_RATE not in", values, "pnaRate");
            return (Criteria) this;
        }

        public Criteria andPnaRateBetween(Double value1, Double value2) {
            addCriterion("PNA_RATE between", value1, value2, "pnaRate");
            return (Criteria) this;
        }

        public Criteria andPnaRateNotBetween(Double value1, Double value2) {
            addCriterion("PNA_RATE not between", value1, value2, "pnaRate");
            return (Criteria) this;
        }

        public Criteria andPh2oMolecularIsNull() {
            addCriterion("PH2O_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andPh2oMolecularIsNotNull() {
            addCriterion("PH2O_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andPh2oMolecularEqualTo(Double value) {
            addCriterion("PH2O_MOLECULAR =", value, "ph2oMolecular");
            return (Criteria) this;
        }

        public Criteria andPh2oMolecularNotEqualTo(Double value) {
            addCriterion("PH2O_MOLECULAR <>", value, "ph2oMolecular");
            return (Criteria) this;
        }

        public Criteria andPh2oMolecularGreaterThan(Double value) {
            addCriterion("PH2O_MOLECULAR >", value, "ph2oMolecular");
            return (Criteria) this;
        }

        public Criteria andPh2oMolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("PH2O_MOLECULAR >=", value, "ph2oMolecular");
            return (Criteria) this;
        }

        public Criteria andPh2oMolecularLessThan(Double value) {
            addCriterion("PH2O_MOLECULAR <", value, "ph2oMolecular");
            return (Criteria) this;
        }

        public Criteria andPh2oMolecularLessThanOrEqualTo(Double value) {
            addCriterion("PH2O_MOLECULAR <=", value, "ph2oMolecular");
            return (Criteria) this;
        }

        public Criteria andPh2oMolecularIn(List<Double> values) {
            addCriterion("PH2O_MOLECULAR in", values, "ph2oMolecular");
            return (Criteria) this;
        }

        public Criteria andPh2oMolecularNotIn(List<Double> values) {
            addCriterion("PH2O_MOLECULAR not in", values, "ph2oMolecular");
            return (Criteria) this;
        }

        public Criteria andPh2oMolecularBetween(Double value1, Double value2) {
            addCriterion("PH2O_MOLECULAR between", value1, value2, "ph2oMolecular");
            return (Criteria) this;
        }

        public Criteria andPh2oMolecularNotBetween(Double value1, Double value2) {
            addCriterion("PH2O_MOLECULAR not between", value1, value2, "ph2oMolecular");
            return (Criteria) this;
        }

        public Criteria andPh2oDenominatorIsNull() {
            addCriterion("PH2O_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andPh2oDenominatorIsNotNull() {
            addCriterion("PH2O_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andPh2oDenominatorEqualTo(Double value) {
            addCriterion("PH2O_DENOMINATOR =", value, "ph2oDenominator");
            return (Criteria) this;
        }

        public Criteria andPh2oDenominatorNotEqualTo(Double value) {
            addCriterion("PH2O_DENOMINATOR <>", value, "ph2oDenominator");
            return (Criteria) this;
        }

        public Criteria andPh2oDenominatorGreaterThan(Double value) {
            addCriterion("PH2O_DENOMINATOR >", value, "ph2oDenominator");
            return (Criteria) this;
        }

        public Criteria andPh2oDenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("PH2O_DENOMINATOR >=", value, "ph2oDenominator");
            return (Criteria) this;
        }

        public Criteria andPh2oDenominatorLessThan(Double value) {
            addCriterion("PH2O_DENOMINATOR <", value, "ph2oDenominator");
            return (Criteria) this;
        }

        public Criteria andPh2oDenominatorLessThanOrEqualTo(Double value) {
            addCriterion("PH2O_DENOMINATOR <=", value, "ph2oDenominator");
            return (Criteria) this;
        }

        public Criteria andPh2oDenominatorIn(List<Double> values) {
            addCriterion("PH2O_DENOMINATOR in", values, "ph2oDenominator");
            return (Criteria) this;
        }

        public Criteria andPh2oDenominatorNotIn(List<Double> values) {
            addCriterion("PH2O_DENOMINATOR not in", values, "ph2oDenominator");
            return (Criteria) this;
        }

        public Criteria andPh2oDenominatorBetween(Double value1, Double value2) {
            addCriterion("PH2O_DENOMINATOR between", value1, value2, "ph2oDenominator");
            return (Criteria) this;
        }

        public Criteria andPh2oDenominatorNotBetween(Double value1, Double value2) {
            addCriterion("PH2O_DENOMINATOR not between", value1, value2, "ph2oDenominator");
            return (Criteria) this;
        }

        public Criteria andPh2oRateIsNull() {
            addCriterion("PH2O_RATE is null");
            return (Criteria) this;
        }

        public Criteria andPh2oRateIsNotNull() {
            addCriterion("PH2O_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andPh2oRateEqualTo(Double value) {
            addCriterion("PH2O_RATE =", value, "ph2oRate");
            return (Criteria) this;
        }

        public Criteria andPh2oRateNotEqualTo(Double value) {
            addCriterion("PH2O_RATE <>", value, "ph2oRate");
            return (Criteria) this;
        }

        public Criteria andPh2oRateGreaterThan(Double value) {
            addCriterion("PH2O_RATE >", value, "ph2oRate");
            return (Criteria) this;
        }

        public Criteria andPh2oRateGreaterThanOrEqualTo(Double value) {
            addCriterion("PH2O_RATE >=", value, "ph2oRate");
            return (Criteria) this;
        }

        public Criteria andPh2oRateLessThan(Double value) {
            addCriterion("PH2O_RATE <", value, "ph2oRate");
            return (Criteria) this;
        }

        public Criteria andPh2oRateLessThanOrEqualTo(Double value) {
            addCriterion("PH2O_RATE <=", value, "ph2oRate");
            return (Criteria) this;
        }

        public Criteria andPh2oRateIn(List<Double> values) {
            addCriterion("PH2O_RATE in", values, "ph2oRate");
            return (Criteria) this;
        }

        public Criteria andPh2oRateNotIn(List<Double> values) {
            addCriterion("PH2O_RATE not in", values, "ph2oRate");
            return (Criteria) this;
        }

        public Criteria andPh2oRateBetween(Double value1, Double value2) {
            addCriterion("PH2O_RATE between", value1, value2, "ph2oRate");
            return (Criteria) this;
        }

        public Criteria andPh2oRateNotBetween(Double value1, Double value2) {
            addCriterion("PH2O_RATE not between", value1, value2, "ph2oRate");
            return (Criteria) this;
        }

        public Criteria andPmcMolecularIsNull() {
            addCriterion("PMC_MOLECULAR is null");
            return (Criteria) this;
        }

        public Criteria andPmcMolecularIsNotNull() {
            addCriterion("PMC_MOLECULAR is not null");
            return (Criteria) this;
        }

        public Criteria andPmcMolecularEqualTo(Double value) {
            addCriterion("PMC_MOLECULAR =", value, "pmcMolecular");
            return (Criteria) this;
        }

        public Criteria andPmcMolecularNotEqualTo(Double value) {
            addCriterion("PMC_MOLECULAR <>", value, "pmcMolecular");
            return (Criteria) this;
        }

        public Criteria andPmcMolecularGreaterThan(Double value) {
            addCriterion("PMC_MOLECULAR >", value, "pmcMolecular");
            return (Criteria) this;
        }

        public Criteria andPmcMolecularGreaterThanOrEqualTo(Double value) {
            addCriterion("PMC_MOLECULAR >=", value, "pmcMolecular");
            return (Criteria) this;
        }

        public Criteria andPmcMolecularLessThan(Double value) {
            addCriterion("PMC_MOLECULAR <", value, "pmcMolecular");
            return (Criteria) this;
        }

        public Criteria andPmcMolecularLessThanOrEqualTo(Double value) {
            addCriterion("PMC_MOLECULAR <=", value, "pmcMolecular");
            return (Criteria) this;
        }

        public Criteria andPmcMolecularIn(List<Double> values) {
            addCriterion("PMC_MOLECULAR in", values, "pmcMolecular");
            return (Criteria) this;
        }

        public Criteria andPmcMolecularNotIn(List<Double> values) {
            addCriterion("PMC_MOLECULAR not in", values, "pmcMolecular");
            return (Criteria) this;
        }

        public Criteria andPmcMolecularBetween(Double value1, Double value2) {
            addCriterion("PMC_MOLECULAR between", value1, value2, "pmcMolecular");
            return (Criteria) this;
        }

        public Criteria andPmcMolecularNotBetween(Double value1, Double value2) {
            addCriterion("PMC_MOLECULAR not between", value1, value2, "pmcMolecular");
            return (Criteria) this;
        }

        public Criteria andPmcDenominatorIsNull() {
            addCriterion("PMC_DENOMINATOR is null");
            return (Criteria) this;
        }

        public Criteria andPmcDenominatorIsNotNull() {
            addCriterion("PMC_DENOMINATOR is not null");
            return (Criteria) this;
        }

        public Criteria andPmcDenominatorEqualTo(Double value) {
            addCriterion("PMC_DENOMINATOR =", value, "pmcDenominator");
            return (Criteria) this;
        }

        public Criteria andPmcDenominatorNotEqualTo(Double value) {
            addCriterion("PMC_DENOMINATOR <>", value, "pmcDenominator");
            return (Criteria) this;
        }

        public Criteria andPmcDenominatorGreaterThan(Double value) {
            addCriterion("PMC_DENOMINATOR >", value, "pmcDenominator");
            return (Criteria) this;
        }

        public Criteria andPmcDenominatorGreaterThanOrEqualTo(Double value) {
            addCriterion("PMC_DENOMINATOR >=", value, "pmcDenominator");
            return (Criteria) this;
        }

        public Criteria andPmcDenominatorLessThan(Double value) {
            addCriterion("PMC_DENOMINATOR <", value, "pmcDenominator");
            return (Criteria) this;
        }

        public Criteria andPmcDenominatorLessThanOrEqualTo(Double value) {
            addCriterion("PMC_DENOMINATOR <=", value, "pmcDenominator");
            return (Criteria) this;
        }

        public Criteria andPmcDenominatorIn(List<Double> values) {
            addCriterion("PMC_DENOMINATOR in", values, "pmcDenominator");
            return (Criteria) this;
        }

        public Criteria andPmcDenominatorNotIn(List<Double> values) {
            addCriterion("PMC_DENOMINATOR not in", values, "pmcDenominator");
            return (Criteria) this;
        }

        public Criteria andPmcDenominatorBetween(Double value1, Double value2) {
            addCriterion("PMC_DENOMINATOR between", value1, value2, "pmcDenominator");
            return (Criteria) this;
        }

        public Criteria andPmcDenominatorNotBetween(Double value1, Double value2) {
            addCriterion("PMC_DENOMINATOR not between", value1, value2, "pmcDenominator");
            return (Criteria) this;
        }

        public Criteria andPmcRateIsNull() {
            addCriterion("PMC_RATE is null");
            return (Criteria) this;
        }

        public Criteria andPmcRateIsNotNull() {
            addCriterion("PMC_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andPmcRateEqualTo(Double value) {
            addCriterion("PMC_RATE =", value, "pmcRate");
            return (Criteria) this;
        }

        public Criteria andPmcRateNotEqualTo(Double value) {
            addCriterion("PMC_RATE <>", value, "pmcRate");
            return (Criteria) this;
        }

        public Criteria andPmcRateGreaterThan(Double value) {
            addCriterion("PMC_RATE >", value, "pmcRate");
            return (Criteria) this;
        }

        public Criteria andPmcRateGreaterThanOrEqualTo(Double value) {
            addCriterion("PMC_RATE >=", value, "pmcRate");
            return (Criteria) this;
        }

        public Criteria andPmcRateLessThan(Double value) {
            addCriterion("PMC_RATE <", value, "pmcRate");
            return (Criteria) this;
        }

        public Criteria andPmcRateLessThanOrEqualTo(Double value) {
            addCriterion("PMC_RATE <=", value, "pmcRate");
            return (Criteria) this;
        }

        public Criteria andPmcRateIn(List<Double> values) {
            addCriterion("PMC_RATE in", values, "pmcRate");
            return (Criteria) this;
        }

        public Criteria andPmcRateNotIn(List<Double> values) {
            addCriterion("PMC_RATE not in", values, "pmcRate");
            return (Criteria) this;
        }

        public Criteria andPmcRateBetween(Double value1, Double value2) {
            addCriterion("PMC_RATE between", value1, value2, "pmcRate");
            return (Criteria) this;
        }

        public Criteria andPmcRateNotBetween(Double value1, Double value2) {
            addCriterion("PMC_RATE not between", value1, value2, "pmcRate");
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