package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class RepastBarbecueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepastBarbecueExample() {
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

        public Criteria andFactoryidIsNull() {
            addCriterion("factoryid is null");
            return (Criteria) this;
        }

        public Criteria andFactoryidIsNotNull() {
            addCriterion("factoryid is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryidEqualTo(Integer value) {
            addCriterion("factoryid =", value, "factoryid");
            return (Criteria) this;
        }

        public Criteria andFactoryidNotEqualTo(Integer value) {
            addCriterion("factoryid <>", value, "factoryid");
            return (Criteria) this;
        }

        public Criteria andFactoryidGreaterThan(Integer value) {
            addCriterion("factoryid >", value, "factoryid");
            return (Criteria) this;
        }

        public Criteria andFactoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("factoryid >=", value, "factoryid");
            return (Criteria) this;
        }

        public Criteria andFactoryidLessThan(Integer value) {
            addCriterion("factoryid <", value, "factoryid");
            return (Criteria) this;
        }

        public Criteria andFactoryidLessThanOrEqualTo(Integer value) {
            addCriterion("factoryid <=", value, "factoryid");
            return (Criteria) this;
        }

        public Criteria andFactoryidIn(List<Integer> values) {
            addCriterion("factoryid in", values, "factoryid");
            return (Criteria) this;
        }

        public Criteria andFactoryidNotIn(List<Integer> values) {
            addCriterion("factoryid not in", values, "factoryid");
            return (Criteria) this;
        }

        public Criteria andFactoryidBetween(Integer value1, Integer value2) {
            addCriterion("factoryid between", value1, value2, "factoryid");
            return (Criteria) this;
        }

        public Criteria andFactoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("factoryid not between", value1, value2, "factoryid");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("year like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("year not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andScccodeIsNull() {
            addCriterion("scccode is null");
            return (Criteria) this;
        }

        public Criteria andScccodeIsNotNull() {
            addCriterion("scccode is not null");
            return (Criteria) this;
        }

        public Criteria andScccodeEqualTo(String value) {
            addCriterion("scccode =", value, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeNotEqualTo(String value) {
            addCriterion("scccode <>", value, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeGreaterThan(String value) {
            addCriterion("scccode >", value, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeGreaterThanOrEqualTo(String value) {
            addCriterion("scccode >=", value, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeLessThan(String value) {
            addCriterion("scccode <", value, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeLessThanOrEqualTo(String value) {
            addCriterion("scccode <=", value, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeLike(String value) {
            addCriterion("scccode like", value, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeNotLike(String value) {
            addCriterion("scccode not like", value, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeIn(List<String> values) {
            addCriterion("scccode in", values, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeNotIn(List<String> values) {
            addCriterion("scccode not in", values, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeBetween(String value1, String value2) {
            addCriterion("scccode between", value1, value2, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeNotBetween(String value1, String value2) {
            addCriterion("scccode not between", value1, value2, "scccode");
            return (Criteria) this;
        }

        public Criteria andAnnualRuntimeIsNull() {
            addCriterion("annual_runtime is null");
            return (Criteria) this;
        }

        public Criteria andAnnualRuntimeIsNotNull() {
            addCriterion("annual_runtime is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualRuntimeEqualTo(Integer value) {
            addCriterion("annual_runtime =", value, "annualRuntime");
            return (Criteria) this;
        }

        public Criteria andAnnualRuntimeNotEqualTo(Integer value) {
            addCriterion("annual_runtime <>", value, "annualRuntime");
            return (Criteria) this;
        }

        public Criteria andAnnualRuntimeGreaterThan(Integer value) {
            addCriterion("annual_runtime >", value, "annualRuntime");
            return (Criteria) this;
        }

        public Criteria andAnnualRuntimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("annual_runtime >=", value, "annualRuntime");
            return (Criteria) this;
        }

        public Criteria andAnnualRuntimeLessThan(Integer value) {
            addCriterion("annual_runtime <", value, "annualRuntime");
            return (Criteria) this;
        }

        public Criteria andAnnualRuntimeLessThanOrEqualTo(Integer value) {
            addCriterion("annual_runtime <=", value, "annualRuntime");
            return (Criteria) this;
        }

        public Criteria andAnnualRuntimeIn(List<Integer> values) {
            addCriterion("annual_runtime in", values, "annualRuntime");
            return (Criteria) this;
        }

        public Criteria andAnnualRuntimeNotIn(List<Integer> values) {
            addCriterion("annual_runtime not in", values, "annualRuntime");
            return (Criteria) this;
        }

        public Criteria andAnnualRuntimeBetween(Integer value1, Integer value2) {
            addCriterion("annual_runtime between", value1, value2, "annualRuntime");
            return (Criteria) this;
        }

        public Criteria andAnnualRuntimeNotBetween(Integer value1, Integer value2) {
            addCriterion("annual_runtime not between", value1, value2, "annualRuntime");
            return (Criteria) this;
        }

        public Criteria andDayRunntimeIsNull() {
            addCriterion("day_runntime is null");
            return (Criteria) this;
        }

        public Criteria andDayRunntimeIsNotNull() {
            addCriterion("day_runntime is not null");
            return (Criteria) this;
        }

        public Criteria andDayRunntimeEqualTo(Double value) {
            addCriterion("day_runntime =", value, "dayRunntime");
            return (Criteria) this;
        }

        public Criteria andDayRunntimeNotEqualTo(Double value) {
            addCriterion("day_runntime <>", value, "dayRunntime");
            return (Criteria) this;
        }

        public Criteria andDayRunntimeGreaterThan(Double value) {
            addCriterion("day_runntime >", value, "dayRunntime");
            return (Criteria) this;
        }

        public Criteria andDayRunntimeGreaterThanOrEqualTo(Double value) {
            addCriterion("day_runntime >=", value, "dayRunntime");
            return (Criteria) this;
        }

        public Criteria andDayRunntimeLessThan(Double value) {
            addCriterion("day_runntime <", value, "dayRunntime");
            return (Criteria) this;
        }

        public Criteria andDayRunntimeLessThanOrEqualTo(Double value) {
            addCriterion("day_runntime <=", value, "dayRunntime");
            return (Criteria) this;
        }

        public Criteria andDayRunntimeIn(List<Double> values) {
            addCriterion("day_runntime in", values, "dayRunntime");
            return (Criteria) this;
        }

        public Criteria andDayRunntimeNotIn(List<Double> values) {
            addCriterion("day_runntime not in", values, "dayRunntime");
            return (Criteria) this;
        }

        public Criteria andDayRunntimeBetween(Double value1, Double value2) {
            addCriterion("day_runntime between", value1, value2, "dayRunntime");
            return (Criteria) this;
        }

        public Criteria andDayRunntimeNotBetween(Double value1, Double value2) {
            addCriterion("day_runntime not between", value1, value2, "dayRunntime");
            return (Criteria) this;
        }

        public Criteria andPmEmfIsNull() {
            addCriterion("pm_emf is null");
            return (Criteria) this;
        }

        public Criteria andPmEmfIsNotNull() {
            addCriterion("pm_emf is not null");
            return (Criteria) this;
        }

        public Criteria andPmEmfEqualTo(Double value) {
            addCriterion("pm_emf =", value, "pmEmf");
            return (Criteria) this;
        }

        public Criteria andPmEmfNotEqualTo(Double value) {
            addCriterion("pm_emf <>", value, "pmEmf");
            return (Criteria) this;
        }

        public Criteria andPmEmfGreaterThan(Double value) {
            addCriterion("pm_emf >", value, "pmEmf");
            return (Criteria) this;
        }

        public Criteria andPmEmfGreaterThanOrEqualTo(Double value) {
            addCriterion("pm_emf >=", value, "pmEmf");
            return (Criteria) this;
        }

        public Criteria andPmEmfLessThan(Double value) {
            addCriterion("pm_emf <", value, "pmEmf");
            return (Criteria) this;
        }

        public Criteria andPmEmfLessThanOrEqualTo(Double value) {
            addCriterion("pm_emf <=", value, "pmEmf");
            return (Criteria) this;
        }

        public Criteria andPmEmfIn(List<Double> values) {
            addCriterion("pm_emf in", values, "pmEmf");
            return (Criteria) this;
        }

        public Criteria andPmEmfNotIn(List<Double> values) {
            addCriterion("pm_emf not in", values, "pmEmf");
            return (Criteria) this;
        }

        public Criteria andPmEmfBetween(Double value1, Double value2) {
            addCriterion("pm_emf between", value1, value2, "pmEmf");
            return (Criteria) this;
        }

        public Criteria andPmEmfNotBetween(Double value1, Double value2) {
            addCriterion("pm_emf not between", value1, value2, "pmEmf");
            return (Criteria) this;
        }

        public Criteria andPmEmfunitIsNull() {
            addCriterion("pm_emfunit is null");
            return (Criteria) this;
        }

        public Criteria andPmEmfunitIsNotNull() {
            addCriterion("pm_emfunit is not null");
            return (Criteria) this;
        }

        public Criteria andPmEmfunitEqualTo(String value) {
            addCriterion("pm_emfunit =", value, "pmEmfunit");
            return (Criteria) this;
        }

        public Criteria andPmEmfunitNotEqualTo(String value) {
            addCriterion("pm_emfunit <>", value, "pmEmfunit");
            return (Criteria) this;
        }

        public Criteria andPmEmfunitGreaterThan(String value) {
            addCriterion("pm_emfunit >", value, "pmEmfunit");
            return (Criteria) this;
        }

        public Criteria andPmEmfunitGreaterThanOrEqualTo(String value) {
            addCriterion("pm_emfunit >=", value, "pmEmfunit");
            return (Criteria) this;
        }

        public Criteria andPmEmfunitLessThan(String value) {
            addCriterion("pm_emfunit <", value, "pmEmfunit");
            return (Criteria) this;
        }

        public Criteria andPmEmfunitLessThanOrEqualTo(String value) {
            addCriterion("pm_emfunit <=", value, "pmEmfunit");
            return (Criteria) this;
        }

        public Criteria andPmEmfunitLike(String value) {
            addCriterion("pm_emfunit like", value, "pmEmfunit");
            return (Criteria) this;
        }

        public Criteria andPmEmfunitNotLike(String value) {
            addCriterion("pm_emfunit not like", value, "pmEmfunit");
            return (Criteria) this;
        }

        public Criteria andPmEmfunitIn(List<String> values) {
            addCriterion("pm_emfunit in", values, "pmEmfunit");
            return (Criteria) this;
        }

        public Criteria andPmEmfunitNotIn(List<String> values) {
            addCriterion("pm_emfunit not in", values, "pmEmfunit");
            return (Criteria) this;
        }

        public Criteria andPmEmfunitBetween(String value1, String value2) {
            addCriterion("pm_emfunit between", value1, value2, "pmEmfunit");
            return (Criteria) this;
        }

        public Criteria andPmEmfunitNotBetween(String value1, String value2) {
            addCriterion("pm_emfunit not between", value1, value2, "pmEmfunit");
            return (Criteria) this;
        }

        public Criteria andPm10EmfIsNull() {
            addCriterion("pm10_emf is null");
            return (Criteria) this;
        }

        public Criteria andPm10EmfIsNotNull() {
            addCriterion("pm10_emf is not null");
            return (Criteria) this;
        }

        public Criteria andPm10EmfEqualTo(Double value) {
            addCriterion("pm10_emf =", value, "pm10Emf");
            return (Criteria) this;
        }

        public Criteria andPm10EmfNotEqualTo(Double value) {
            addCriterion("pm10_emf <>", value, "pm10Emf");
            return (Criteria) this;
        }

        public Criteria andPm10EmfGreaterThan(Double value) {
            addCriterion("pm10_emf >", value, "pm10Emf");
            return (Criteria) this;
        }

        public Criteria andPm10EmfGreaterThanOrEqualTo(Double value) {
            addCriterion("pm10_emf >=", value, "pm10Emf");
            return (Criteria) this;
        }

        public Criteria andPm10EmfLessThan(Double value) {
            addCriterion("pm10_emf <", value, "pm10Emf");
            return (Criteria) this;
        }

        public Criteria andPm10EmfLessThanOrEqualTo(Double value) {
            addCriterion("pm10_emf <=", value, "pm10Emf");
            return (Criteria) this;
        }

        public Criteria andPm10EmfIn(List<Double> values) {
            addCriterion("pm10_emf in", values, "pm10Emf");
            return (Criteria) this;
        }

        public Criteria andPm10EmfNotIn(List<Double> values) {
            addCriterion("pm10_emf not in", values, "pm10Emf");
            return (Criteria) this;
        }

        public Criteria andPm10EmfBetween(Double value1, Double value2) {
            addCriterion("pm10_emf between", value1, value2, "pm10Emf");
            return (Criteria) this;
        }

        public Criteria andPm10EmfNotBetween(Double value1, Double value2) {
            addCriterion("pm10_emf not between", value1, value2, "pm10Emf");
            return (Criteria) this;
        }

        public Criteria andPm10EmfunitIsNull() {
            addCriterion("pm10_emfunit is null");
            return (Criteria) this;
        }

        public Criteria andPm10EmfunitIsNotNull() {
            addCriterion("pm10_emfunit is not null");
            return (Criteria) this;
        }

        public Criteria andPm10EmfunitEqualTo(String value) {
            addCriterion("pm10_emfunit =", value, "pm10Emfunit");
            return (Criteria) this;
        }

        public Criteria andPm10EmfunitNotEqualTo(String value) {
            addCriterion("pm10_emfunit <>", value, "pm10Emfunit");
            return (Criteria) this;
        }

        public Criteria andPm10EmfunitGreaterThan(String value) {
            addCriterion("pm10_emfunit >", value, "pm10Emfunit");
            return (Criteria) this;
        }

        public Criteria andPm10EmfunitGreaterThanOrEqualTo(String value) {
            addCriterion("pm10_emfunit >=", value, "pm10Emfunit");
            return (Criteria) this;
        }

        public Criteria andPm10EmfunitLessThan(String value) {
            addCriterion("pm10_emfunit <", value, "pm10Emfunit");
            return (Criteria) this;
        }

        public Criteria andPm10EmfunitLessThanOrEqualTo(String value) {
            addCriterion("pm10_emfunit <=", value, "pm10Emfunit");
            return (Criteria) this;
        }

        public Criteria andPm10EmfunitLike(String value) {
            addCriterion("pm10_emfunit like", value, "pm10Emfunit");
            return (Criteria) this;
        }

        public Criteria andPm10EmfunitNotLike(String value) {
            addCriterion("pm10_emfunit not like", value, "pm10Emfunit");
            return (Criteria) this;
        }

        public Criteria andPm10EmfunitIn(List<String> values) {
            addCriterion("pm10_emfunit in", values, "pm10Emfunit");
            return (Criteria) this;
        }

        public Criteria andPm10EmfunitNotIn(List<String> values) {
            addCriterion("pm10_emfunit not in", values, "pm10Emfunit");
            return (Criteria) this;
        }

        public Criteria andPm10EmfunitBetween(String value1, String value2) {
            addCriterion("pm10_emfunit between", value1, value2, "pm10Emfunit");
            return (Criteria) this;
        }

        public Criteria andPm10EmfunitNotBetween(String value1, String value2) {
            addCriterion("pm10_emfunit not between", value1, value2, "pm10Emfunit");
            return (Criteria) this;
        }

        public Criteria andPm25EmfIsNull() {
            addCriterion("pm25_emf is null");
            return (Criteria) this;
        }

        public Criteria andPm25EmfIsNotNull() {
            addCriterion("pm25_emf is not null");
            return (Criteria) this;
        }

        public Criteria andPm25EmfEqualTo(Double value) {
            addCriterion("pm25_emf =", value, "pm25Emf");
            return (Criteria) this;
        }

        public Criteria andPm25EmfNotEqualTo(Double value) {
            addCriterion("pm25_emf <>", value, "pm25Emf");
            return (Criteria) this;
        }

        public Criteria andPm25EmfGreaterThan(Double value) {
            addCriterion("pm25_emf >", value, "pm25Emf");
            return (Criteria) this;
        }

        public Criteria andPm25EmfGreaterThanOrEqualTo(Double value) {
            addCriterion("pm25_emf >=", value, "pm25Emf");
            return (Criteria) this;
        }

        public Criteria andPm25EmfLessThan(Double value) {
            addCriterion("pm25_emf <", value, "pm25Emf");
            return (Criteria) this;
        }

        public Criteria andPm25EmfLessThanOrEqualTo(Double value) {
            addCriterion("pm25_emf <=", value, "pm25Emf");
            return (Criteria) this;
        }

        public Criteria andPm25EmfIn(List<Double> values) {
            addCriterion("pm25_emf in", values, "pm25Emf");
            return (Criteria) this;
        }

        public Criteria andPm25EmfNotIn(List<Double> values) {
            addCriterion("pm25_emf not in", values, "pm25Emf");
            return (Criteria) this;
        }

        public Criteria andPm25EmfBetween(Double value1, Double value2) {
            addCriterion("pm25_emf between", value1, value2, "pm25Emf");
            return (Criteria) this;
        }

        public Criteria andPm25EmfNotBetween(Double value1, Double value2) {
            addCriterion("pm25_emf not between", value1, value2, "pm25Emf");
            return (Criteria) this;
        }

        public Criteria andPm25EmfunitIsNull() {
            addCriterion("pm25_emfunit is null");
            return (Criteria) this;
        }

        public Criteria andPm25EmfunitIsNotNull() {
            addCriterion("pm25_emfunit is not null");
            return (Criteria) this;
        }

        public Criteria andPm25EmfunitEqualTo(String value) {
            addCriterion("pm25_emfunit =", value, "pm25Emfunit");
            return (Criteria) this;
        }

        public Criteria andPm25EmfunitNotEqualTo(String value) {
            addCriterion("pm25_emfunit <>", value, "pm25Emfunit");
            return (Criteria) this;
        }

        public Criteria andPm25EmfunitGreaterThan(String value) {
            addCriterion("pm25_emfunit >", value, "pm25Emfunit");
            return (Criteria) this;
        }

        public Criteria andPm25EmfunitGreaterThanOrEqualTo(String value) {
            addCriterion("pm25_emfunit >=", value, "pm25Emfunit");
            return (Criteria) this;
        }

        public Criteria andPm25EmfunitLessThan(String value) {
            addCriterion("pm25_emfunit <", value, "pm25Emfunit");
            return (Criteria) this;
        }

        public Criteria andPm25EmfunitLessThanOrEqualTo(String value) {
            addCriterion("pm25_emfunit <=", value, "pm25Emfunit");
            return (Criteria) this;
        }

        public Criteria andPm25EmfunitLike(String value) {
            addCriterion("pm25_emfunit like", value, "pm25Emfunit");
            return (Criteria) this;
        }

        public Criteria andPm25EmfunitNotLike(String value) {
            addCriterion("pm25_emfunit not like", value, "pm25Emfunit");
            return (Criteria) this;
        }

        public Criteria andPm25EmfunitIn(List<String> values) {
            addCriterion("pm25_emfunit in", values, "pm25Emfunit");
            return (Criteria) this;
        }

        public Criteria andPm25EmfunitNotIn(List<String> values) {
            addCriterion("pm25_emfunit not in", values, "pm25Emfunit");
            return (Criteria) this;
        }

        public Criteria andPm25EmfunitBetween(String value1, String value2) {
            addCriterion("pm25_emfunit between", value1, value2, "pm25Emfunit");
            return (Criteria) this;
        }

        public Criteria andPm25EmfunitNotBetween(String value1, String value2) {
            addCriterion("pm25_emfunit not between", value1, value2, "pm25Emfunit");
            return (Criteria) this;
        }

        public Criteria andSo2EmfIsNull() {
            addCriterion("so2_emf is null");
            return (Criteria) this;
        }

        public Criteria andSo2EmfIsNotNull() {
            addCriterion("so2_emf is not null");
            return (Criteria) this;
        }

        public Criteria andSo2EmfEqualTo(Double value) {
            addCriterion("so2_emf =", value, "so2Emf");
            return (Criteria) this;
        }

        public Criteria andSo2EmfNotEqualTo(Double value) {
            addCriterion("so2_emf <>", value, "so2Emf");
            return (Criteria) this;
        }

        public Criteria andSo2EmfGreaterThan(Double value) {
            addCriterion("so2_emf >", value, "so2Emf");
            return (Criteria) this;
        }

        public Criteria andSo2EmfGreaterThanOrEqualTo(Double value) {
            addCriterion("so2_emf >=", value, "so2Emf");
            return (Criteria) this;
        }

        public Criteria andSo2EmfLessThan(Double value) {
            addCriterion("so2_emf <", value, "so2Emf");
            return (Criteria) this;
        }

        public Criteria andSo2EmfLessThanOrEqualTo(Double value) {
            addCriterion("so2_emf <=", value, "so2Emf");
            return (Criteria) this;
        }

        public Criteria andSo2EmfIn(List<Double> values) {
            addCriterion("so2_emf in", values, "so2Emf");
            return (Criteria) this;
        }

        public Criteria andSo2EmfNotIn(List<Double> values) {
            addCriterion("so2_emf not in", values, "so2Emf");
            return (Criteria) this;
        }

        public Criteria andSo2EmfBetween(Double value1, Double value2) {
            addCriterion("so2_emf between", value1, value2, "so2Emf");
            return (Criteria) this;
        }

        public Criteria andSo2EmfNotBetween(Double value1, Double value2) {
            addCriterion("so2_emf not between", value1, value2, "so2Emf");
            return (Criteria) this;
        }

        public Criteria andSo2EmfunitIsNull() {
            addCriterion("so2_emfunit is null");
            return (Criteria) this;
        }

        public Criteria andSo2EmfunitIsNotNull() {
            addCriterion("so2_emfunit is not null");
            return (Criteria) this;
        }

        public Criteria andSo2EmfunitEqualTo(String value) {
            addCriterion("so2_emfunit =", value, "so2Emfunit");
            return (Criteria) this;
        }

        public Criteria andSo2EmfunitNotEqualTo(String value) {
            addCriterion("so2_emfunit <>", value, "so2Emfunit");
            return (Criteria) this;
        }

        public Criteria andSo2EmfunitGreaterThan(String value) {
            addCriterion("so2_emfunit >", value, "so2Emfunit");
            return (Criteria) this;
        }

        public Criteria andSo2EmfunitGreaterThanOrEqualTo(String value) {
            addCriterion("so2_emfunit >=", value, "so2Emfunit");
            return (Criteria) this;
        }

        public Criteria andSo2EmfunitLessThan(String value) {
            addCriterion("so2_emfunit <", value, "so2Emfunit");
            return (Criteria) this;
        }

        public Criteria andSo2EmfunitLessThanOrEqualTo(String value) {
            addCriterion("so2_emfunit <=", value, "so2Emfunit");
            return (Criteria) this;
        }

        public Criteria andSo2EmfunitLike(String value) {
            addCriterion("so2_emfunit like", value, "so2Emfunit");
            return (Criteria) this;
        }

        public Criteria andSo2EmfunitNotLike(String value) {
            addCriterion("so2_emfunit not like", value, "so2Emfunit");
            return (Criteria) this;
        }

        public Criteria andSo2EmfunitIn(List<String> values) {
            addCriterion("so2_emfunit in", values, "so2Emfunit");
            return (Criteria) this;
        }

        public Criteria andSo2EmfunitNotIn(List<String> values) {
            addCriterion("so2_emfunit not in", values, "so2Emfunit");
            return (Criteria) this;
        }

        public Criteria andSo2EmfunitBetween(String value1, String value2) {
            addCriterion("so2_emfunit between", value1, value2, "so2Emfunit");
            return (Criteria) this;
        }

        public Criteria andSo2EmfunitNotBetween(String value1, String value2) {
            addCriterion("so2_emfunit not between", value1, value2, "so2Emfunit");
            return (Criteria) this;
        }

        public Criteria andNoxEmfIsNull() {
            addCriterion("nox_emf is null");
            return (Criteria) this;
        }

        public Criteria andNoxEmfIsNotNull() {
            addCriterion("nox_emf is not null");
            return (Criteria) this;
        }

        public Criteria andNoxEmfEqualTo(Double value) {
            addCriterion("nox_emf =", value, "noxEmf");
            return (Criteria) this;
        }

        public Criteria andNoxEmfNotEqualTo(Double value) {
            addCriterion("nox_emf <>", value, "noxEmf");
            return (Criteria) this;
        }

        public Criteria andNoxEmfGreaterThan(Double value) {
            addCriterion("nox_emf >", value, "noxEmf");
            return (Criteria) this;
        }

        public Criteria andNoxEmfGreaterThanOrEqualTo(Double value) {
            addCriterion("nox_emf >=", value, "noxEmf");
            return (Criteria) this;
        }

        public Criteria andNoxEmfLessThan(Double value) {
            addCriterion("nox_emf <", value, "noxEmf");
            return (Criteria) this;
        }

        public Criteria andNoxEmfLessThanOrEqualTo(Double value) {
            addCriterion("nox_emf <=", value, "noxEmf");
            return (Criteria) this;
        }

        public Criteria andNoxEmfIn(List<Double> values) {
            addCriterion("nox_emf in", values, "noxEmf");
            return (Criteria) this;
        }

        public Criteria andNoxEmfNotIn(List<Double> values) {
            addCriterion("nox_emf not in", values, "noxEmf");
            return (Criteria) this;
        }

        public Criteria andNoxEmfBetween(Double value1, Double value2) {
            addCriterion("nox_emf between", value1, value2, "noxEmf");
            return (Criteria) this;
        }

        public Criteria andNoxEmfNotBetween(Double value1, Double value2) {
            addCriterion("nox_emf not between", value1, value2, "noxEmf");
            return (Criteria) this;
        }

        public Criteria andNoxEmfunitIsNull() {
            addCriterion("nox_emfunit is null");
            return (Criteria) this;
        }

        public Criteria andNoxEmfunitIsNotNull() {
            addCriterion("nox_emfunit is not null");
            return (Criteria) this;
        }

        public Criteria andNoxEmfunitEqualTo(String value) {
            addCriterion("nox_emfunit =", value, "noxEmfunit");
            return (Criteria) this;
        }

        public Criteria andNoxEmfunitNotEqualTo(String value) {
            addCriterion("nox_emfunit <>", value, "noxEmfunit");
            return (Criteria) this;
        }

        public Criteria andNoxEmfunitGreaterThan(String value) {
            addCriterion("nox_emfunit >", value, "noxEmfunit");
            return (Criteria) this;
        }

        public Criteria andNoxEmfunitGreaterThanOrEqualTo(String value) {
            addCriterion("nox_emfunit >=", value, "noxEmfunit");
            return (Criteria) this;
        }

        public Criteria andNoxEmfunitLessThan(String value) {
            addCriterion("nox_emfunit <", value, "noxEmfunit");
            return (Criteria) this;
        }

        public Criteria andNoxEmfunitLessThanOrEqualTo(String value) {
            addCriterion("nox_emfunit <=", value, "noxEmfunit");
            return (Criteria) this;
        }

        public Criteria andNoxEmfunitLike(String value) {
            addCriterion("nox_emfunit like", value, "noxEmfunit");
            return (Criteria) this;
        }

        public Criteria andNoxEmfunitNotLike(String value) {
            addCriterion("nox_emfunit not like", value, "noxEmfunit");
            return (Criteria) this;
        }

        public Criteria andNoxEmfunitIn(List<String> values) {
            addCriterion("nox_emfunit in", values, "noxEmfunit");
            return (Criteria) this;
        }

        public Criteria andNoxEmfunitNotIn(List<String> values) {
            addCriterion("nox_emfunit not in", values, "noxEmfunit");
            return (Criteria) this;
        }

        public Criteria andNoxEmfunitBetween(String value1, String value2) {
            addCriterion("nox_emfunit between", value1, value2, "noxEmfunit");
            return (Criteria) this;
        }

        public Criteria andNoxEmfunitNotBetween(String value1, String value2) {
            addCriterion("nox_emfunit not between", value1, value2, "noxEmfunit");
            return (Criteria) this;
        }

        public Criteria andCoEmfIsNull() {
            addCriterion("co_emf is null");
            return (Criteria) this;
        }

        public Criteria andCoEmfIsNotNull() {
            addCriterion("co_emf is not null");
            return (Criteria) this;
        }

        public Criteria andCoEmfEqualTo(Double value) {
            addCriterion("co_emf =", value, "coEmf");
            return (Criteria) this;
        }

        public Criteria andCoEmfNotEqualTo(Double value) {
            addCriterion("co_emf <>", value, "coEmf");
            return (Criteria) this;
        }

        public Criteria andCoEmfGreaterThan(Double value) {
            addCriterion("co_emf >", value, "coEmf");
            return (Criteria) this;
        }

        public Criteria andCoEmfGreaterThanOrEqualTo(Double value) {
            addCriterion("co_emf >=", value, "coEmf");
            return (Criteria) this;
        }

        public Criteria andCoEmfLessThan(Double value) {
            addCriterion("co_emf <", value, "coEmf");
            return (Criteria) this;
        }

        public Criteria andCoEmfLessThanOrEqualTo(Double value) {
            addCriterion("co_emf <=", value, "coEmf");
            return (Criteria) this;
        }

        public Criteria andCoEmfIn(List<Double> values) {
            addCriterion("co_emf in", values, "coEmf");
            return (Criteria) this;
        }

        public Criteria andCoEmfNotIn(List<Double> values) {
            addCriterion("co_emf not in", values, "coEmf");
            return (Criteria) this;
        }

        public Criteria andCoEmfBetween(Double value1, Double value2) {
            addCriterion("co_emf between", value1, value2, "coEmf");
            return (Criteria) this;
        }

        public Criteria andCoEmfNotBetween(Double value1, Double value2) {
            addCriterion("co_emf not between", value1, value2, "coEmf");
            return (Criteria) this;
        }

        public Criteria andCoEmfunitIsNull() {
            addCriterion("co_emfunit is null");
            return (Criteria) this;
        }

        public Criteria andCoEmfunitIsNotNull() {
            addCriterion("co_emfunit is not null");
            return (Criteria) this;
        }

        public Criteria andCoEmfunitEqualTo(String value) {
            addCriterion("co_emfunit =", value, "coEmfunit");
            return (Criteria) this;
        }

        public Criteria andCoEmfunitNotEqualTo(String value) {
            addCriterion("co_emfunit <>", value, "coEmfunit");
            return (Criteria) this;
        }

        public Criteria andCoEmfunitGreaterThan(String value) {
            addCriterion("co_emfunit >", value, "coEmfunit");
            return (Criteria) this;
        }

        public Criteria andCoEmfunitGreaterThanOrEqualTo(String value) {
            addCriterion("co_emfunit >=", value, "coEmfunit");
            return (Criteria) this;
        }

        public Criteria andCoEmfunitLessThan(String value) {
            addCriterion("co_emfunit <", value, "coEmfunit");
            return (Criteria) this;
        }

        public Criteria andCoEmfunitLessThanOrEqualTo(String value) {
            addCriterion("co_emfunit <=", value, "coEmfunit");
            return (Criteria) this;
        }

        public Criteria andCoEmfunitLike(String value) {
            addCriterion("co_emfunit like", value, "coEmfunit");
            return (Criteria) this;
        }

        public Criteria andCoEmfunitNotLike(String value) {
            addCriterion("co_emfunit not like", value, "coEmfunit");
            return (Criteria) this;
        }

        public Criteria andCoEmfunitIn(List<String> values) {
            addCriterion("co_emfunit in", values, "coEmfunit");
            return (Criteria) this;
        }

        public Criteria andCoEmfunitNotIn(List<String> values) {
            addCriterion("co_emfunit not in", values, "coEmfunit");
            return (Criteria) this;
        }

        public Criteria andCoEmfunitBetween(String value1, String value2) {
            addCriterion("co_emfunit between", value1, value2, "coEmfunit");
            return (Criteria) this;
        }

        public Criteria andCoEmfunitNotBetween(String value1, String value2) {
            addCriterion("co_emfunit not between", value1, value2, "coEmfunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmfIsNull() {
            addCriterion("nh3_emf is null");
            return (Criteria) this;
        }

        public Criteria andNh3EmfIsNotNull() {
            addCriterion("nh3_emf is not null");
            return (Criteria) this;
        }

        public Criteria andNh3EmfEqualTo(Double value) {
            addCriterion("nh3_emf =", value, "nh3Emf");
            return (Criteria) this;
        }

        public Criteria andNh3EmfNotEqualTo(Double value) {
            addCriterion("nh3_emf <>", value, "nh3Emf");
            return (Criteria) this;
        }

        public Criteria andNh3EmfGreaterThan(Double value) {
            addCriterion("nh3_emf >", value, "nh3Emf");
            return (Criteria) this;
        }

        public Criteria andNh3EmfGreaterThanOrEqualTo(Double value) {
            addCriterion("nh3_emf >=", value, "nh3Emf");
            return (Criteria) this;
        }

        public Criteria andNh3EmfLessThan(Double value) {
            addCriterion("nh3_emf <", value, "nh3Emf");
            return (Criteria) this;
        }

        public Criteria andNh3EmfLessThanOrEqualTo(Double value) {
            addCriterion("nh3_emf <=", value, "nh3Emf");
            return (Criteria) this;
        }

        public Criteria andNh3EmfIn(List<Double> values) {
            addCriterion("nh3_emf in", values, "nh3Emf");
            return (Criteria) this;
        }

        public Criteria andNh3EmfNotIn(List<Double> values) {
            addCriterion("nh3_emf not in", values, "nh3Emf");
            return (Criteria) this;
        }

        public Criteria andNh3EmfBetween(Double value1, Double value2) {
            addCriterion("nh3_emf between", value1, value2, "nh3Emf");
            return (Criteria) this;
        }

        public Criteria andNh3EmfNotBetween(Double value1, Double value2) {
            addCriterion("nh3_emf not between", value1, value2, "nh3Emf");
            return (Criteria) this;
        }

        public Criteria andNh3EmfunitIsNull() {
            addCriterion("nh3_emfunit is null");
            return (Criteria) this;
        }

        public Criteria andNh3EmfunitIsNotNull() {
            addCriterion("nh3_emfunit is not null");
            return (Criteria) this;
        }

        public Criteria andNh3EmfunitEqualTo(String value) {
            addCriterion("nh3_emfunit =", value, "nh3Emfunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmfunitNotEqualTo(String value) {
            addCriterion("nh3_emfunit <>", value, "nh3Emfunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmfunitGreaterThan(String value) {
            addCriterion("nh3_emfunit >", value, "nh3Emfunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmfunitGreaterThanOrEqualTo(String value) {
            addCriterion("nh3_emfunit >=", value, "nh3Emfunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmfunitLessThan(String value) {
            addCriterion("nh3_emfunit <", value, "nh3Emfunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmfunitLessThanOrEqualTo(String value) {
            addCriterion("nh3_emfunit <=", value, "nh3Emfunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmfunitLike(String value) {
            addCriterion("nh3_emfunit like", value, "nh3Emfunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmfunitNotLike(String value) {
            addCriterion("nh3_emfunit not like", value, "nh3Emfunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmfunitIn(List<String> values) {
            addCriterion("nh3_emfunit in", values, "nh3Emfunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmfunitNotIn(List<String> values) {
            addCriterion("nh3_emfunit not in", values, "nh3Emfunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmfunitBetween(String value1, String value2) {
            addCriterion("nh3_emfunit between", value1, value2, "nh3Emfunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmfunitNotBetween(String value1, String value2) {
            addCriterion("nh3_emfunit not between", value1, value2, "nh3Emfunit");
            return (Criteria) this;
        }

        public Criteria andVocEmfIsNull() {
            addCriterion("voc_emf is null");
            return (Criteria) this;
        }

        public Criteria andVocEmfIsNotNull() {
            addCriterion("voc_emf is not null");
            return (Criteria) this;
        }

        public Criteria andVocEmfEqualTo(Double value) {
            addCriterion("voc_emf =", value, "vocEmf");
            return (Criteria) this;
        }

        public Criteria andVocEmfNotEqualTo(Double value) {
            addCriterion("voc_emf <>", value, "vocEmf");
            return (Criteria) this;
        }

        public Criteria andVocEmfGreaterThan(Double value) {
            addCriterion("voc_emf >", value, "vocEmf");
            return (Criteria) this;
        }

        public Criteria andVocEmfGreaterThanOrEqualTo(Double value) {
            addCriterion("voc_emf >=", value, "vocEmf");
            return (Criteria) this;
        }

        public Criteria andVocEmfLessThan(Double value) {
            addCriterion("voc_emf <", value, "vocEmf");
            return (Criteria) this;
        }

        public Criteria andVocEmfLessThanOrEqualTo(Double value) {
            addCriterion("voc_emf <=", value, "vocEmf");
            return (Criteria) this;
        }

        public Criteria andVocEmfIn(List<Double> values) {
            addCriterion("voc_emf in", values, "vocEmf");
            return (Criteria) this;
        }

        public Criteria andVocEmfNotIn(List<Double> values) {
            addCriterion("voc_emf not in", values, "vocEmf");
            return (Criteria) this;
        }

        public Criteria andVocEmfBetween(Double value1, Double value2) {
            addCriterion("voc_emf between", value1, value2, "vocEmf");
            return (Criteria) this;
        }

        public Criteria andVocEmfNotBetween(Double value1, Double value2) {
            addCriterion("voc_emf not between", value1, value2, "vocEmf");
            return (Criteria) this;
        }

        public Criteria andVocEmfunitIsNull() {
            addCriterion("voc_emfunit is null");
            return (Criteria) this;
        }

        public Criteria andVocEmfunitIsNotNull() {
            addCriterion("voc_emfunit is not null");
            return (Criteria) this;
        }

        public Criteria andVocEmfunitEqualTo(String value) {
            addCriterion("voc_emfunit =", value, "vocEmfunit");
            return (Criteria) this;
        }

        public Criteria andVocEmfunitNotEqualTo(String value) {
            addCriterion("voc_emfunit <>", value, "vocEmfunit");
            return (Criteria) this;
        }

        public Criteria andVocEmfunitGreaterThan(String value) {
            addCriterion("voc_emfunit >", value, "vocEmfunit");
            return (Criteria) this;
        }

        public Criteria andVocEmfunitGreaterThanOrEqualTo(String value) {
            addCriterion("voc_emfunit >=", value, "vocEmfunit");
            return (Criteria) this;
        }

        public Criteria andVocEmfunitLessThan(String value) {
            addCriterion("voc_emfunit <", value, "vocEmfunit");
            return (Criteria) this;
        }

        public Criteria andVocEmfunitLessThanOrEqualTo(String value) {
            addCriterion("voc_emfunit <=", value, "vocEmfunit");
            return (Criteria) this;
        }

        public Criteria andVocEmfunitLike(String value) {
            addCriterion("voc_emfunit like", value, "vocEmfunit");
            return (Criteria) this;
        }

        public Criteria andVocEmfunitNotLike(String value) {
            addCriterion("voc_emfunit not like", value, "vocEmfunit");
            return (Criteria) this;
        }

        public Criteria andVocEmfunitIn(List<String> values) {
            addCriterion("voc_emfunit in", values, "vocEmfunit");
            return (Criteria) this;
        }

        public Criteria andVocEmfunitNotIn(List<String> values) {
            addCriterion("voc_emfunit not in", values, "vocEmfunit");
            return (Criteria) this;
        }

        public Criteria andVocEmfunitBetween(String value1, String value2) {
            addCriterion("voc_emfunit between", value1, value2, "vocEmfunit");
            return (Criteria) this;
        }

        public Criteria andVocEmfunitNotBetween(String value1, String value2) {
            addCriterion("voc_emfunit not between", value1, value2, "vocEmfunit");
            return (Criteria) this;
        }

        public Criteria andOcEmfIsNull() {
            addCriterion("oc_emf is null");
            return (Criteria) this;
        }

        public Criteria andOcEmfIsNotNull() {
            addCriterion("oc_emf is not null");
            return (Criteria) this;
        }

        public Criteria andOcEmfEqualTo(Double value) {
            addCriterion("oc_emf =", value, "ocEmf");
            return (Criteria) this;
        }

        public Criteria andOcEmfNotEqualTo(Double value) {
            addCriterion("oc_emf <>", value, "ocEmf");
            return (Criteria) this;
        }

        public Criteria andOcEmfGreaterThan(Double value) {
            addCriterion("oc_emf >", value, "ocEmf");
            return (Criteria) this;
        }

        public Criteria andOcEmfGreaterThanOrEqualTo(Double value) {
            addCriterion("oc_emf >=", value, "ocEmf");
            return (Criteria) this;
        }

        public Criteria andOcEmfLessThan(Double value) {
            addCriterion("oc_emf <", value, "ocEmf");
            return (Criteria) this;
        }

        public Criteria andOcEmfLessThanOrEqualTo(Double value) {
            addCriterion("oc_emf <=", value, "ocEmf");
            return (Criteria) this;
        }

        public Criteria andOcEmfIn(List<Double> values) {
            addCriterion("oc_emf in", values, "ocEmf");
            return (Criteria) this;
        }

        public Criteria andOcEmfNotIn(List<Double> values) {
            addCriterion("oc_emf not in", values, "ocEmf");
            return (Criteria) this;
        }

        public Criteria andOcEmfBetween(Double value1, Double value2) {
            addCriterion("oc_emf between", value1, value2, "ocEmf");
            return (Criteria) this;
        }

        public Criteria andOcEmfNotBetween(Double value1, Double value2) {
            addCriterion("oc_emf not between", value1, value2, "ocEmf");
            return (Criteria) this;
        }

        public Criteria andOcEmfunitIsNull() {
            addCriterion("oc_emfunit is null");
            return (Criteria) this;
        }

        public Criteria andOcEmfunitIsNotNull() {
            addCriterion("oc_emfunit is not null");
            return (Criteria) this;
        }

        public Criteria andOcEmfunitEqualTo(String value) {
            addCriterion("oc_emfunit =", value, "ocEmfunit");
            return (Criteria) this;
        }

        public Criteria andOcEmfunitNotEqualTo(String value) {
            addCriterion("oc_emfunit <>", value, "ocEmfunit");
            return (Criteria) this;
        }

        public Criteria andOcEmfunitGreaterThan(String value) {
            addCriterion("oc_emfunit >", value, "ocEmfunit");
            return (Criteria) this;
        }

        public Criteria andOcEmfunitGreaterThanOrEqualTo(String value) {
            addCriterion("oc_emfunit >=", value, "ocEmfunit");
            return (Criteria) this;
        }

        public Criteria andOcEmfunitLessThan(String value) {
            addCriterion("oc_emfunit <", value, "ocEmfunit");
            return (Criteria) this;
        }

        public Criteria andOcEmfunitLessThanOrEqualTo(String value) {
            addCriterion("oc_emfunit <=", value, "ocEmfunit");
            return (Criteria) this;
        }

        public Criteria andOcEmfunitLike(String value) {
            addCriterion("oc_emfunit like", value, "ocEmfunit");
            return (Criteria) this;
        }

        public Criteria andOcEmfunitNotLike(String value) {
            addCriterion("oc_emfunit not like", value, "ocEmfunit");
            return (Criteria) this;
        }

        public Criteria andOcEmfunitIn(List<String> values) {
            addCriterion("oc_emfunit in", values, "ocEmfunit");
            return (Criteria) this;
        }

        public Criteria andOcEmfunitNotIn(List<String> values) {
            addCriterion("oc_emfunit not in", values, "ocEmfunit");
            return (Criteria) this;
        }

        public Criteria andOcEmfunitBetween(String value1, String value2) {
            addCriterion("oc_emfunit between", value1, value2, "ocEmfunit");
            return (Criteria) this;
        }

        public Criteria andOcEmfunitNotBetween(String value1, String value2) {
            addCriterion("oc_emfunit not between", value1, value2, "ocEmfunit");
            return (Criteria) this;
        }

        public Criteria andBcEmfIsNull() {
            addCriterion("bc_emf is null");
            return (Criteria) this;
        }

        public Criteria andBcEmfIsNotNull() {
            addCriterion("bc_emf is not null");
            return (Criteria) this;
        }

        public Criteria andBcEmfEqualTo(Double value) {
            addCriterion("bc_emf =", value, "bcEmf");
            return (Criteria) this;
        }

        public Criteria andBcEmfNotEqualTo(Double value) {
            addCriterion("bc_emf <>", value, "bcEmf");
            return (Criteria) this;
        }

        public Criteria andBcEmfGreaterThan(Double value) {
            addCriterion("bc_emf >", value, "bcEmf");
            return (Criteria) this;
        }

        public Criteria andBcEmfGreaterThanOrEqualTo(Double value) {
            addCriterion("bc_emf >=", value, "bcEmf");
            return (Criteria) this;
        }

        public Criteria andBcEmfLessThan(Double value) {
            addCriterion("bc_emf <", value, "bcEmf");
            return (Criteria) this;
        }

        public Criteria andBcEmfLessThanOrEqualTo(Double value) {
            addCriterion("bc_emf <=", value, "bcEmf");
            return (Criteria) this;
        }

        public Criteria andBcEmfIn(List<Double> values) {
            addCriterion("bc_emf in", values, "bcEmf");
            return (Criteria) this;
        }

        public Criteria andBcEmfNotIn(List<Double> values) {
            addCriterion("bc_emf not in", values, "bcEmf");
            return (Criteria) this;
        }

        public Criteria andBcEmfBetween(Double value1, Double value2) {
            addCriterion("bc_emf between", value1, value2, "bcEmf");
            return (Criteria) this;
        }

        public Criteria andBcEmfNotBetween(Double value1, Double value2) {
            addCriterion("bc_emf not between", value1, value2, "bcEmf");
            return (Criteria) this;
        }

        public Criteria andBcEmfunitIsNull() {
            addCriterion("bc_emfunit is null");
            return (Criteria) this;
        }

        public Criteria andBcEmfunitIsNotNull() {
            addCriterion("bc_emfunit is not null");
            return (Criteria) this;
        }

        public Criteria andBcEmfunitEqualTo(String value) {
            addCriterion("bc_emfunit =", value, "bcEmfunit");
            return (Criteria) this;
        }

        public Criteria andBcEmfunitNotEqualTo(String value) {
            addCriterion("bc_emfunit <>", value, "bcEmfunit");
            return (Criteria) this;
        }

        public Criteria andBcEmfunitGreaterThan(String value) {
            addCriterion("bc_emfunit >", value, "bcEmfunit");
            return (Criteria) this;
        }

        public Criteria andBcEmfunitGreaterThanOrEqualTo(String value) {
            addCriterion("bc_emfunit >=", value, "bcEmfunit");
            return (Criteria) this;
        }

        public Criteria andBcEmfunitLessThan(String value) {
            addCriterion("bc_emfunit <", value, "bcEmfunit");
            return (Criteria) this;
        }

        public Criteria andBcEmfunitLessThanOrEqualTo(String value) {
            addCriterion("bc_emfunit <=", value, "bcEmfunit");
            return (Criteria) this;
        }

        public Criteria andBcEmfunitLike(String value) {
            addCriterion("bc_emfunit like", value, "bcEmfunit");
            return (Criteria) this;
        }

        public Criteria andBcEmfunitNotLike(String value) {
            addCriterion("bc_emfunit not like", value, "bcEmfunit");
            return (Criteria) this;
        }

        public Criteria andBcEmfunitIn(List<String> values) {
            addCriterion("bc_emfunit in", values, "bcEmfunit");
            return (Criteria) this;
        }

        public Criteria andBcEmfunitNotIn(List<String> values) {
            addCriterion("bc_emfunit not in", values, "bcEmfunit");
            return (Criteria) this;
        }

        public Criteria andBcEmfunitBetween(String value1, String value2) {
            addCriterion("bc_emfunit between", value1, value2, "bcEmfunit");
            return (Criteria) this;
        }

        public Criteria andBcEmfunitNotBetween(String value1, String value2) {
            addCriterion("bc_emfunit not between", value1, value2, "bcEmfunit");
            return (Criteria) this;
        }

        public Criteria andPmEmissionIsNull() {
            addCriterion("pm_emission is null");
            return (Criteria) this;
        }

        public Criteria andPmEmissionIsNotNull() {
            addCriterion("pm_emission is not null");
            return (Criteria) this;
        }

        public Criteria andPmEmissionEqualTo(Double value) {
            addCriterion("pm_emission =", value, "pmEmission");
            return (Criteria) this;
        }

        public Criteria andPmEmissionNotEqualTo(Double value) {
            addCriterion("pm_emission <>", value, "pmEmission");
            return (Criteria) this;
        }

        public Criteria andPmEmissionGreaterThan(Double value) {
            addCriterion("pm_emission >", value, "pmEmission");
            return (Criteria) this;
        }

        public Criteria andPmEmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("pm_emission >=", value, "pmEmission");
            return (Criteria) this;
        }

        public Criteria andPmEmissionLessThan(Double value) {
            addCriterion("pm_emission <", value, "pmEmission");
            return (Criteria) this;
        }

        public Criteria andPmEmissionLessThanOrEqualTo(Double value) {
            addCriterion("pm_emission <=", value, "pmEmission");
            return (Criteria) this;
        }

        public Criteria andPmEmissionIn(List<Double> values) {
            addCriterion("pm_emission in", values, "pmEmission");
            return (Criteria) this;
        }

        public Criteria andPmEmissionNotIn(List<Double> values) {
            addCriterion("pm_emission not in", values, "pmEmission");
            return (Criteria) this;
        }

        public Criteria andPmEmissionBetween(Double value1, Double value2) {
            addCriterion("pm_emission between", value1, value2, "pmEmission");
            return (Criteria) this;
        }

        public Criteria andPmEmissionNotBetween(Double value1, Double value2) {
            addCriterion("pm_emission not between", value1, value2, "pmEmission");
            return (Criteria) this;
        }

        public Criteria andPmEmiunitIsNull() {
            addCriterion("pm_emiunit is null");
            return (Criteria) this;
        }

        public Criteria andPmEmiunitIsNotNull() {
            addCriterion("pm_emiunit is not null");
            return (Criteria) this;
        }

        public Criteria andPmEmiunitEqualTo(String value) {
            addCriterion("pm_emiunit =", value, "pmEmiunit");
            return (Criteria) this;
        }

        public Criteria andPmEmiunitNotEqualTo(String value) {
            addCriterion("pm_emiunit <>", value, "pmEmiunit");
            return (Criteria) this;
        }

        public Criteria andPmEmiunitGreaterThan(String value) {
            addCriterion("pm_emiunit >", value, "pmEmiunit");
            return (Criteria) this;
        }

        public Criteria andPmEmiunitGreaterThanOrEqualTo(String value) {
            addCriterion("pm_emiunit >=", value, "pmEmiunit");
            return (Criteria) this;
        }

        public Criteria andPmEmiunitLessThan(String value) {
            addCriterion("pm_emiunit <", value, "pmEmiunit");
            return (Criteria) this;
        }

        public Criteria andPmEmiunitLessThanOrEqualTo(String value) {
            addCriterion("pm_emiunit <=", value, "pmEmiunit");
            return (Criteria) this;
        }

        public Criteria andPmEmiunitLike(String value) {
            addCriterion("pm_emiunit like", value, "pmEmiunit");
            return (Criteria) this;
        }

        public Criteria andPmEmiunitNotLike(String value) {
            addCriterion("pm_emiunit not like", value, "pmEmiunit");
            return (Criteria) this;
        }

        public Criteria andPmEmiunitIn(List<String> values) {
            addCriterion("pm_emiunit in", values, "pmEmiunit");
            return (Criteria) this;
        }

        public Criteria andPmEmiunitNotIn(List<String> values) {
            addCriterion("pm_emiunit not in", values, "pmEmiunit");
            return (Criteria) this;
        }

        public Criteria andPmEmiunitBetween(String value1, String value2) {
            addCriterion("pm_emiunit between", value1, value2, "pmEmiunit");
            return (Criteria) this;
        }

        public Criteria andPmEmiunitNotBetween(String value1, String value2) {
            addCriterion("pm_emiunit not between", value1, value2, "pmEmiunit");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionIsNull() {
            addCriterion("pm10_emission is null");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionIsNotNull() {
            addCriterion("pm10_emission is not null");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionEqualTo(Double value) {
            addCriterion("pm10_emission =", value, "pm10Emission");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionNotEqualTo(Double value) {
            addCriterion("pm10_emission <>", value, "pm10Emission");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionGreaterThan(Double value) {
            addCriterion("pm10_emission >", value, "pm10Emission");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("pm10_emission >=", value, "pm10Emission");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionLessThan(Double value) {
            addCriterion("pm10_emission <", value, "pm10Emission");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionLessThanOrEqualTo(Double value) {
            addCriterion("pm10_emission <=", value, "pm10Emission");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionIn(List<Double> values) {
            addCriterion("pm10_emission in", values, "pm10Emission");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionNotIn(List<Double> values) {
            addCriterion("pm10_emission not in", values, "pm10Emission");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionBetween(Double value1, Double value2) {
            addCriterion("pm10_emission between", value1, value2, "pm10Emission");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionNotBetween(Double value1, Double value2) {
            addCriterion("pm10_emission not between", value1, value2, "pm10Emission");
            return (Criteria) this;
        }

        public Criteria andPm10EmiunitIsNull() {
            addCriterion("pm10_emiunit is null");
            return (Criteria) this;
        }

        public Criteria andPm10EmiunitIsNotNull() {
            addCriterion("pm10_emiunit is not null");
            return (Criteria) this;
        }

        public Criteria andPm10EmiunitEqualTo(String value) {
            addCriterion("pm10_emiunit =", value, "pm10Emiunit");
            return (Criteria) this;
        }

        public Criteria andPm10EmiunitNotEqualTo(String value) {
            addCriterion("pm10_emiunit <>", value, "pm10Emiunit");
            return (Criteria) this;
        }

        public Criteria andPm10EmiunitGreaterThan(String value) {
            addCriterion("pm10_emiunit >", value, "pm10Emiunit");
            return (Criteria) this;
        }

        public Criteria andPm10EmiunitGreaterThanOrEqualTo(String value) {
            addCriterion("pm10_emiunit >=", value, "pm10Emiunit");
            return (Criteria) this;
        }

        public Criteria andPm10EmiunitLessThan(String value) {
            addCriterion("pm10_emiunit <", value, "pm10Emiunit");
            return (Criteria) this;
        }

        public Criteria andPm10EmiunitLessThanOrEqualTo(String value) {
            addCriterion("pm10_emiunit <=", value, "pm10Emiunit");
            return (Criteria) this;
        }

        public Criteria andPm10EmiunitLike(String value) {
            addCriterion("pm10_emiunit like", value, "pm10Emiunit");
            return (Criteria) this;
        }

        public Criteria andPm10EmiunitNotLike(String value) {
            addCriterion("pm10_emiunit not like", value, "pm10Emiunit");
            return (Criteria) this;
        }

        public Criteria andPm10EmiunitIn(List<String> values) {
            addCriterion("pm10_emiunit in", values, "pm10Emiunit");
            return (Criteria) this;
        }

        public Criteria andPm10EmiunitNotIn(List<String> values) {
            addCriterion("pm10_emiunit not in", values, "pm10Emiunit");
            return (Criteria) this;
        }

        public Criteria andPm10EmiunitBetween(String value1, String value2) {
            addCriterion("pm10_emiunit between", value1, value2, "pm10Emiunit");
            return (Criteria) this;
        }

        public Criteria andPm10EmiunitNotBetween(String value1, String value2) {
            addCriterion("pm10_emiunit not between", value1, value2, "pm10Emiunit");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionIsNull() {
            addCriterion("pm25_emission is null");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionIsNotNull() {
            addCriterion("pm25_emission is not null");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionEqualTo(Double value) {
            addCriterion("pm25_emission =", value, "pm25Emission");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionNotEqualTo(Double value) {
            addCriterion("pm25_emission <>", value, "pm25Emission");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionGreaterThan(Double value) {
            addCriterion("pm25_emission >", value, "pm25Emission");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("pm25_emission >=", value, "pm25Emission");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionLessThan(Double value) {
            addCriterion("pm25_emission <", value, "pm25Emission");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionLessThanOrEqualTo(Double value) {
            addCriterion("pm25_emission <=", value, "pm25Emission");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionIn(List<Double> values) {
            addCriterion("pm25_emission in", values, "pm25Emission");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionNotIn(List<Double> values) {
            addCriterion("pm25_emission not in", values, "pm25Emission");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionBetween(Double value1, Double value2) {
            addCriterion("pm25_emission between", value1, value2, "pm25Emission");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionNotBetween(Double value1, Double value2) {
            addCriterion("pm25_emission not between", value1, value2, "pm25Emission");
            return (Criteria) this;
        }

        public Criteria andPm25EmiunitIsNull() {
            addCriterion("pm25_emiunit is null");
            return (Criteria) this;
        }

        public Criteria andPm25EmiunitIsNotNull() {
            addCriterion("pm25_emiunit is not null");
            return (Criteria) this;
        }

        public Criteria andPm25EmiunitEqualTo(String value) {
            addCriterion("pm25_emiunit =", value, "pm25Emiunit");
            return (Criteria) this;
        }

        public Criteria andPm25EmiunitNotEqualTo(String value) {
            addCriterion("pm25_emiunit <>", value, "pm25Emiunit");
            return (Criteria) this;
        }

        public Criteria andPm25EmiunitGreaterThan(String value) {
            addCriterion("pm25_emiunit >", value, "pm25Emiunit");
            return (Criteria) this;
        }

        public Criteria andPm25EmiunitGreaterThanOrEqualTo(String value) {
            addCriterion("pm25_emiunit >=", value, "pm25Emiunit");
            return (Criteria) this;
        }

        public Criteria andPm25EmiunitLessThan(String value) {
            addCriterion("pm25_emiunit <", value, "pm25Emiunit");
            return (Criteria) this;
        }

        public Criteria andPm25EmiunitLessThanOrEqualTo(String value) {
            addCriterion("pm25_emiunit <=", value, "pm25Emiunit");
            return (Criteria) this;
        }

        public Criteria andPm25EmiunitLike(String value) {
            addCriterion("pm25_emiunit like", value, "pm25Emiunit");
            return (Criteria) this;
        }

        public Criteria andPm25EmiunitNotLike(String value) {
            addCriterion("pm25_emiunit not like", value, "pm25Emiunit");
            return (Criteria) this;
        }

        public Criteria andPm25EmiunitIn(List<String> values) {
            addCriterion("pm25_emiunit in", values, "pm25Emiunit");
            return (Criteria) this;
        }

        public Criteria andPm25EmiunitNotIn(List<String> values) {
            addCriterion("pm25_emiunit not in", values, "pm25Emiunit");
            return (Criteria) this;
        }

        public Criteria andPm25EmiunitBetween(String value1, String value2) {
            addCriterion("pm25_emiunit between", value1, value2, "pm25Emiunit");
            return (Criteria) this;
        }

        public Criteria andPm25EmiunitNotBetween(String value1, String value2) {
            addCriterion("pm25_emiunit not between", value1, value2, "pm25Emiunit");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionIsNull() {
            addCriterion("so2_emission is null");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionIsNotNull() {
            addCriterion("so2_emission is not null");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionEqualTo(Double value) {
            addCriterion("so2_emission =", value, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionNotEqualTo(Double value) {
            addCriterion("so2_emission <>", value, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionGreaterThan(Double value) {
            addCriterion("so2_emission >", value, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("so2_emission >=", value, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionLessThan(Double value) {
            addCriterion("so2_emission <", value, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionLessThanOrEqualTo(Double value) {
            addCriterion("so2_emission <=", value, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionIn(List<Double> values) {
            addCriterion("so2_emission in", values, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionNotIn(List<Double> values) {
            addCriterion("so2_emission not in", values, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionBetween(Double value1, Double value2) {
            addCriterion("so2_emission between", value1, value2, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionNotBetween(Double value1, Double value2) {
            addCriterion("so2_emission not between", value1, value2, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmiunitIsNull() {
            addCriterion("so2_emiunit is null");
            return (Criteria) this;
        }

        public Criteria andSo2EmiunitIsNotNull() {
            addCriterion("so2_emiunit is not null");
            return (Criteria) this;
        }

        public Criteria andSo2EmiunitEqualTo(String value) {
            addCriterion("so2_emiunit =", value, "so2Emiunit");
            return (Criteria) this;
        }

        public Criteria andSo2EmiunitNotEqualTo(String value) {
            addCriterion("so2_emiunit <>", value, "so2Emiunit");
            return (Criteria) this;
        }

        public Criteria andSo2EmiunitGreaterThan(String value) {
            addCriterion("so2_emiunit >", value, "so2Emiunit");
            return (Criteria) this;
        }

        public Criteria andSo2EmiunitGreaterThanOrEqualTo(String value) {
            addCriterion("so2_emiunit >=", value, "so2Emiunit");
            return (Criteria) this;
        }

        public Criteria andSo2EmiunitLessThan(String value) {
            addCriterion("so2_emiunit <", value, "so2Emiunit");
            return (Criteria) this;
        }

        public Criteria andSo2EmiunitLessThanOrEqualTo(String value) {
            addCriterion("so2_emiunit <=", value, "so2Emiunit");
            return (Criteria) this;
        }

        public Criteria andSo2EmiunitLike(String value) {
            addCriterion("so2_emiunit like", value, "so2Emiunit");
            return (Criteria) this;
        }

        public Criteria andSo2EmiunitNotLike(String value) {
            addCriterion("so2_emiunit not like", value, "so2Emiunit");
            return (Criteria) this;
        }

        public Criteria andSo2EmiunitIn(List<String> values) {
            addCriterion("so2_emiunit in", values, "so2Emiunit");
            return (Criteria) this;
        }

        public Criteria andSo2EmiunitNotIn(List<String> values) {
            addCriterion("so2_emiunit not in", values, "so2Emiunit");
            return (Criteria) this;
        }

        public Criteria andSo2EmiunitBetween(String value1, String value2) {
            addCriterion("so2_emiunit between", value1, value2, "so2Emiunit");
            return (Criteria) this;
        }

        public Criteria andSo2EmiunitNotBetween(String value1, String value2) {
            addCriterion("so2_emiunit not between", value1, value2, "so2Emiunit");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionIsNull() {
            addCriterion("nox_emission is null");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionIsNotNull() {
            addCriterion("nox_emission is not null");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionEqualTo(Double value) {
            addCriterion("nox_emission =", value, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionNotEqualTo(Double value) {
            addCriterion("nox_emission <>", value, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionGreaterThan(Double value) {
            addCriterion("nox_emission >", value, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("nox_emission >=", value, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionLessThan(Double value) {
            addCriterion("nox_emission <", value, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionLessThanOrEqualTo(Double value) {
            addCriterion("nox_emission <=", value, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionIn(List<Double> values) {
            addCriterion("nox_emission in", values, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionNotIn(List<Double> values) {
            addCriterion("nox_emission not in", values, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionBetween(Double value1, Double value2) {
            addCriterion("nox_emission between", value1, value2, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionNotBetween(Double value1, Double value2) {
            addCriterion("nox_emission not between", value1, value2, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmiunitIsNull() {
            addCriterion("nox_emiunit is null");
            return (Criteria) this;
        }

        public Criteria andNoxEmiunitIsNotNull() {
            addCriterion("nox_emiunit is not null");
            return (Criteria) this;
        }

        public Criteria andNoxEmiunitEqualTo(String value) {
            addCriterion("nox_emiunit =", value, "noxEmiunit");
            return (Criteria) this;
        }

        public Criteria andNoxEmiunitNotEqualTo(String value) {
            addCriterion("nox_emiunit <>", value, "noxEmiunit");
            return (Criteria) this;
        }

        public Criteria andNoxEmiunitGreaterThan(String value) {
            addCriterion("nox_emiunit >", value, "noxEmiunit");
            return (Criteria) this;
        }

        public Criteria andNoxEmiunitGreaterThanOrEqualTo(String value) {
            addCriterion("nox_emiunit >=", value, "noxEmiunit");
            return (Criteria) this;
        }

        public Criteria andNoxEmiunitLessThan(String value) {
            addCriterion("nox_emiunit <", value, "noxEmiunit");
            return (Criteria) this;
        }

        public Criteria andNoxEmiunitLessThanOrEqualTo(String value) {
            addCriterion("nox_emiunit <=", value, "noxEmiunit");
            return (Criteria) this;
        }

        public Criteria andNoxEmiunitLike(String value) {
            addCriterion("nox_emiunit like", value, "noxEmiunit");
            return (Criteria) this;
        }

        public Criteria andNoxEmiunitNotLike(String value) {
            addCriterion("nox_emiunit not like", value, "noxEmiunit");
            return (Criteria) this;
        }

        public Criteria andNoxEmiunitIn(List<String> values) {
            addCriterion("nox_emiunit in", values, "noxEmiunit");
            return (Criteria) this;
        }

        public Criteria andNoxEmiunitNotIn(List<String> values) {
            addCriterion("nox_emiunit not in", values, "noxEmiunit");
            return (Criteria) this;
        }

        public Criteria andNoxEmiunitBetween(String value1, String value2) {
            addCriterion("nox_emiunit between", value1, value2, "noxEmiunit");
            return (Criteria) this;
        }

        public Criteria andNoxEmiunitNotBetween(String value1, String value2) {
            addCriterion("nox_emiunit not between", value1, value2, "noxEmiunit");
            return (Criteria) this;
        }

        public Criteria andCoEmissionIsNull() {
            addCriterion("co_emission is null");
            return (Criteria) this;
        }

        public Criteria andCoEmissionIsNotNull() {
            addCriterion("co_emission is not null");
            return (Criteria) this;
        }

        public Criteria andCoEmissionEqualTo(Double value) {
            addCriterion("co_emission =", value, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionNotEqualTo(Double value) {
            addCriterion("co_emission <>", value, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionGreaterThan(Double value) {
            addCriterion("co_emission >", value, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("co_emission >=", value, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionLessThan(Double value) {
            addCriterion("co_emission <", value, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionLessThanOrEqualTo(Double value) {
            addCriterion("co_emission <=", value, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionIn(List<Double> values) {
            addCriterion("co_emission in", values, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionNotIn(List<Double> values) {
            addCriterion("co_emission not in", values, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionBetween(Double value1, Double value2) {
            addCriterion("co_emission between", value1, value2, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionNotBetween(Double value1, Double value2) {
            addCriterion("co_emission not between", value1, value2, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmiunitIsNull() {
            addCriterion("co_emiunit is null");
            return (Criteria) this;
        }

        public Criteria andCoEmiunitIsNotNull() {
            addCriterion("co_emiunit is not null");
            return (Criteria) this;
        }

        public Criteria andCoEmiunitEqualTo(String value) {
            addCriterion("co_emiunit =", value, "coEmiunit");
            return (Criteria) this;
        }

        public Criteria andCoEmiunitNotEqualTo(String value) {
            addCriterion("co_emiunit <>", value, "coEmiunit");
            return (Criteria) this;
        }

        public Criteria andCoEmiunitGreaterThan(String value) {
            addCriterion("co_emiunit >", value, "coEmiunit");
            return (Criteria) this;
        }

        public Criteria andCoEmiunitGreaterThanOrEqualTo(String value) {
            addCriterion("co_emiunit >=", value, "coEmiunit");
            return (Criteria) this;
        }

        public Criteria andCoEmiunitLessThan(String value) {
            addCriterion("co_emiunit <", value, "coEmiunit");
            return (Criteria) this;
        }

        public Criteria andCoEmiunitLessThanOrEqualTo(String value) {
            addCriterion("co_emiunit <=", value, "coEmiunit");
            return (Criteria) this;
        }

        public Criteria andCoEmiunitLike(String value) {
            addCriterion("co_emiunit like", value, "coEmiunit");
            return (Criteria) this;
        }

        public Criteria andCoEmiunitNotLike(String value) {
            addCriterion("co_emiunit not like", value, "coEmiunit");
            return (Criteria) this;
        }

        public Criteria andCoEmiunitIn(List<String> values) {
            addCriterion("co_emiunit in", values, "coEmiunit");
            return (Criteria) this;
        }

        public Criteria andCoEmiunitNotIn(List<String> values) {
            addCriterion("co_emiunit not in", values, "coEmiunit");
            return (Criteria) this;
        }

        public Criteria andCoEmiunitBetween(String value1, String value2) {
            addCriterion("co_emiunit between", value1, value2, "coEmiunit");
            return (Criteria) this;
        }

        public Criteria andCoEmiunitNotBetween(String value1, String value2) {
            addCriterion("co_emiunit not between", value1, value2, "coEmiunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionIsNull() {
            addCriterion("nh3_emission is null");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionIsNotNull() {
            addCriterion("nh3_emission is not null");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionEqualTo(Double value) {
            addCriterion("nh3_emission =", value, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionNotEqualTo(Double value) {
            addCriterion("nh3_emission <>", value, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionGreaterThan(Double value) {
            addCriterion("nh3_emission >", value, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("nh3_emission >=", value, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionLessThan(Double value) {
            addCriterion("nh3_emission <", value, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionLessThanOrEqualTo(Double value) {
            addCriterion("nh3_emission <=", value, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionIn(List<Double> values) {
            addCriterion("nh3_emission in", values, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionNotIn(List<Double> values) {
            addCriterion("nh3_emission not in", values, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionBetween(Double value1, Double value2) {
            addCriterion("nh3_emission between", value1, value2, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionNotBetween(Double value1, Double value2) {
            addCriterion("nh3_emission not between", value1, value2, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmiunitIsNull() {
            addCriterion("nh3_emiunit is null");
            return (Criteria) this;
        }

        public Criteria andNh3EmiunitIsNotNull() {
            addCriterion("nh3_emiunit is not null");
            return (Criteria) this;
        }

        public Criteria andNh3EmiunitEqualTo(String value) {
            addCriterion("nh3_emiunit =", value, "nh3Emiunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmiunitNotEqualTo(String value) {
            addCriterion("nh3_emiunit <>", value, "nh3Emiunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmiunitGreaterThan(String value) {
            addCriterion("nh3_emiunit >", value, "nh3Emiunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmiunitGreaterThanOrEqualTo(String value) {
            addCriterion("nh3_emiunit >=", value, "nh3Emiunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmiunitLessThan(String value) {
            addCriterion("nh3_emiunit <", value, "nh3Emiunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmiunitLessThanOrEqualTo(String value) {
            addCriterion("nh3_emiunit <=", value, "nh3Emiunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmiunitLike(String value) {
            addCriterion("nh3_emiunit like", value, "nh3Emiunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmiunitNotLike(String value) {
            addCriterion("nh3_emiunit not like", value, "nh3Emiunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmiunitIn(List<String> values) {
            addCriterion("nh3_emiunit in", values, "nh3Emiunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmiunitNotIn(List<String> values) {
            addCriterion("nh3_emiunit not in", values, "nh3Emiunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmiunitBetween(String value1, String value2) {
            addCriterion("nh3_emiunit between", value1, value2, "nh3Emiunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmiunitNotBetween(String value1, String value2) {
            addCriterion("nh3_emiunit not between", value1, value2, "nh3Emiunit");
            return (Criteria) this;
        }

        public Criteria andVocEmissionIsNull() {
            addCriterion("voc_emission is null");
            return (Criteria) this;
        }

        public Criteria andVocEmissionIsNotNull() {
            addCriterion("voc_emission is not null");
            return (Criteria) this;
        }

        public Criteria andVocEmissionEqualTo(Double value) {
            addCriterion("voc_emission =", value, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionNotEqualTo(Double value) {
            addCriterion("voc_emission <>", value, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionGreaterThan(Double value) {
            addCriterion("voc_emission >", value, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("voc_emission >=", value, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionLessThan(Double value) {
            addCriterion("voc_emission <", value, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionLessThanOrEqualTo(Double value) {
            addCriterion("voc_emission <=", value, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionIn(List<Double> values) {
            addCriterion("voc_emission in", values, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionNotIn(List<Double> values) {
            addCriterion("voc_emission not in", values, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionBetween(Double value1, Double value2) {
            addCriterion("voc_emission between", value1, value2, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionNotBetween(Double value1, Double value2) {
            addCriterion("voc_emission not between", value1, value2, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmiunitIsNull() {
            addCriterion("voc_emiunit is null");
            return (Criteria) this;
        }

        public Criteria andVocEmiunitIsNotNull() {
            addCriterion("voc_emiunit is not null");
            return (Criteria) this;
        }

        public Criteria andVocEmiunitEqualTo(String value) {
            addCriterion("voc_emiunit =", value, "vocEmiunit");
            return (Criteria) this;
        }

        public Criteria andVocEmiunitNotEqualTo(String value) {
            addCriterion("voc_emiunit <>", value, "vocEmiunit");
            return (Criteria) this;
        }

        public Criteria andVocEmiunitGreaterThan(String value) {
            addCriterion("voc_emiunit >", value, "vocEmiunit");
            return (Criteria) this;
        }

        public Criteria andVocEmiunitGreaterThanOrEqualTo(String value) {
            addCriterion("voc_emiunit >=", value, "vocEmiunit");
            return (Criteria) this;
        }

        public Criteria andVocEmiunitLessThan(String value) {
            addCriterion("voc_emiunit <", value, "vocEmiunit");
            return (Criteria) this;
        }

        public Criteria andVocEmiunitLessThanOrEqualTo(String value) {
            addCriterion("voc_emiunit <=", value, "vocEmiunit");
            return (Criteria) this;
        }

        public Criteria andVocEmiunitLike(String value) {
            addCriterion("voc_emiunit like", value, "vocEmiunit");
            return (Criteria) this;
        }

        public Criteria andVocEmiunitNotLike(String value) {
            addCriterion("voc_emiunit not like", value, "vocEmiunit");
            return (Criteria) this;
        }

        public Criteria andVocEmiunitIn(List<String> values) {
            addCriterion("voc_emiunit in", values, "vocEmiunit");
            return (Criteria) this;
        }

        public Criteria andVocEmiunitNotIn(List<String> values) {
            addCriterion("voc_emiunit not in", values, "vocEmiunit");
            return (Criteria) this;
        }

        public Criteria andVocEmiunitBetween(String value1, String value2) {
            addCriterion("voc_emiunit between", value1, value2, "vocEmiunit");
            return (Criteria) this;
        }

        public Criteria andVocEmiunitNotBetween(String value1, String value2) {
            addCriterion("voc_emiunit not between", value1, value2, "vocEmiunit");
            return (Criteria) this;
        }

        public Criteria andOcEmissionIsNull() {
            addCriterion("oc_emission is null");
            return (Criteria) this;
        }

        public Criteria andOcEmissionIsNotNull() {
            addCriterion("oc_emission is not null");
            return (Criteria) this;
        }

        public Criteria andOcEmissionEqualTo(Double value) {
            addCriterion("oc_emission =", value, "ocEmission");
            return (Criteria) this;
        }

        public Criteria andOcEmissionNotEqualTo(Double value) {
            addCriterion("oc_emission <>", value, "ocEmission");
            return (Criteria) this;
        }

        public Criteria andOcEmissionGreaterThan(Double value) {
            addCriterion("oc_emission >", value, "ocEmission");
            return (Criteria) this;
        }

        public Criteria andOcEmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("oc_emission >=", value, "ocEmission");
            return (Criteria) this;
        }

        public Criteria andOcEmissionLessThan(Double value) {
            addCriterion("oc_emission <", value, "ocEmission");
            return (Criteria) this;
        }

        public Criteria andOcEmissionLessThanOrEqualTo(Double value) {
            addCriterion("oc_emission <=", value, "ocEmission");
            return (Criteria) this;
        }

        public Criteria andOcEmissionIn(List<Double> values) {
            addCriterion("oc_emission in", values, "ocEmission");
            return (Criteria) this;
        }

        public Criteria andOcEmissionNotIn(List<Double> values) {
            addCriterion("oc_emission not in", values, "ocEmission");
            return (Criteria) this;
        }

        public Criteria andOcEmissionBetween(Double value1, Double value2) {
            addCriterion("oc_emission between", value1, value2, "ocEmission");
            return (Criteria) this;
        }

        public Criteria andOcEmissionNotBetween(Double value1, Double value2) {
            addCriterion("oc_emission not between", value1, value2, "ocEmission");
            return (Criteria) this;
        }

        public Criteria andOcEmiunitIsNull() {
            addCriterion("oc_emiunit is null");
            return (Criteria) this;
        }

        public Criteria andOcEmiunitIsNotNull() {
            addCriterion("oc_emiunit is not null");
            return (Criteria) this;
        }

        public Criteria andOcEmiunitEqualTo(String value) {
            addCriterion("oc_emiunit =", value, "ocEmiunit");
            return (Criteria) this;
        }

        public Criteria andOcEmiunitNotEqualTo(String value) {
            addCriterion("oc_emiunit <>", value, "ocEmiunit");
            return (Criteria) this;
        }

        public Criteria andOcEmiunitGreaterThan(String value) {
            addCriterion("oc_emiunit >", value, "ocEmiunit");
            return (Criteria) this;
        }

        public Criteria andOcEmiunitGreaterThanOrEqualTo(String value) {
            addCriterion("oc_emiunit >=", value, "ocEmiunit");
            return (Criteria) this;
        }

        public Criteria andOcEmiunitLessThan(String value) {
            addCriterion("oc_emiunit <", value, "ocEmiunit");
            return (Criteria) this;
        }

        public Criteria andOcEmiunitLessThanOrEqualTo(String value) {
            addCriterion("oc_emiunit <=", value, "ocEmiunit");
            return (Criteria) this;
        }

        public Criteria andOcEmiunitLike(String value) {
            addCriterion("oc_emiunit like", value, "ocEmiunit");
            return (Criteria) this;
        }

        public Criteria andOcEmiunitNotLike(String value) {
            addCriterion("oc_emiunit not like", value, "ocEmiunit");
            return (Criteria) this;
        }

        public Criteria andOcEmiunitIn(List<String> values) {
            addCriterion("oc_emiunit in", values, "ocEmiunit");
            return (Criteria) this;
        }

        public Criteria andOcEmiunitNotIn(List<String> values) {
            addCriterion("oc_emiunit not in", values, "ocEmiunit");
            return (Criteria) this;
        }

        public Criteria andOcEmiunitBetween(String value1, String value2) {
            addCriterion("oc_emiunit between", value1, value2, "ocEmiunit");
            return (Criteria) this;
        }

        public Criteria andOcEmiunitNotBetween(String value1, String value2) {
            addCriterion("oc_emiunit not between", value1, value2, "ocEmiunit");
            return (Criteria) this;
        }

        public Criteria andBcEmissionIsNull() {
            addCriterion("bc_emission is null");
            return (Criteria) this;
        }

        public Criteria andBcEmissionIsNotNull() {
            addCriterion("bc_emission is not null");
            return (Criteria) this;
        }

        public Criteria andBcEmissionEqualTo(Double value) {
            addCriterion("bc_emission =", value, "bcEmission");
            return (Criteria) this;
        }

        public Criteria andBcEmissionNotEqualTo(Double value) {
            addCriterion("bc_emission <>", value, "bcEmission");
            return (Criteria) this;
        }

        public Criteria andBcEmissionGreaterThan(Double value) {
            addCriterion("bc_emission >", value, "bcEmission");
            return (Criteria) this;
        }

        public Criteria andBcEmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("bc_emission >=", value, "bcEmission");
            return (Criteria) this;
        }

        public Criteria andBcEmissionLessThan(Double value) {
            addCriterion("bc_emission <", value, "bcEmission");
            return (Criteria) this;
        }

        public Criteria andBcEmissionLessThanOrEqualTo(Double value) {
            addCriterion("bc_emission <=", value, "bcEmission");
            return (Criteria) this;
        }

        public Criteria andBcEmissionIn(List<Double> values) {
            addCriterion("bc_emission in", values, "bcEmission");
            return (Criteria) this;
        }

        public Criteria andBcEmissionNotIn(List<Double> values) {
            addCriterion("bc_emission not in", values, "bcEmission");
            return (Criteria) this;
        }

        public Criteria andBcEmissionBetween(Double value1, Double value2) {
            addCriterion("bc_emission between", value1, value2, "bcEmission");
            return (Criteria) this;
        }

        public Criteria andBcEmissionNotBetween(Double value1, Double value2) {
            addCriterion("bc_emission not between", value1, value2, "bcEmission");
            return (Criteria) this;
        }

        public Criteria andBcEmiunitIsNull() {
            addCriterion("bc_emiunit is null");
            return (Criteria) this;
        }

        public Criteria andBcEmiunitIsNotNull() {
            addCriterion("bc_emiunit is not null");
            return (Criteria) this;
        }

        public Criteria andBcEmiunitEqualTo(String value) {
            addCriterion("bc_emiunit =", value, "bcEmiunit");
            return (Criteria) this;
        }

        public Criteria andBcEmiunitNotEqualTo(String value) {
            addCriterion("bc_emiunit <>", value, "bcEmiunit");
            return (Criteria) this;
        }

        public Criteria andBcEmiunitGreaterThan(String value) {
            addCriterion("bc_emiunit >", value, "bcEmiunit");
            return (Criteria) this;
        }

        public Criteria andBcEmiunitGreaterThanOrEqualTo(String value) {
            addCriterion("bc_emiunit >=", value, "bcEmiunit");
            return (Criteria) this;
        }

        public Criteria andBcEmiunitLessThan(String value) {
            addCriterion("bc_emiunit <", value, "bcEmiunit");
            return (Criteria) this;
        }

        public Criteria andBcEmiunitLessThanOrEqualTo(String value) {
            addCriterion("bc_emiunit <=", value, "bcEmiunit");
            return (Criteria) this;
        }

        public Criteria andBcEmiunitLike(String value) {
            addCriterion("bc_emiunit like", value, "bcEmiunit");
            return (Criteria) this;
        }

        public Criteria andBcEmiunitNotLike(String value) {
            addCriterion("bc_emiunit not like", value, "bcEmiunit");
            return (Criteria) this;
        }

        public Criteria andBcEmiunitIn(List<String> values) {
            addCriterion("bc_emiunit in", values, "bcEmiunit");
            return (Criteria) this;
        }

        public Criteria andBcEmiunitNotIn(List<String> values) {
            addCriterion("bc_emiunit not in", values, "bcEmiunit");
            return (Criteria) this;
        }

        public Criteria andBcEmiunitBetween(String value1, String value2) {
            addCriterion("bc_emiunit between", value1, value2, "bcEmiunit");
            return (Criteria) this;
        }

        public Criteria andBcEmiunitNotBetween(String value1, String value2) {
            addCriterion("bc_emiunit not between", value1, value2, "bcEmiunit");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Boolean value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Boolean value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Boolean value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Boolean value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Boolean> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Boolean> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andGasConsumptionIsNull() {
            addCriterion("gas_consumption is null");
            return (Criteria) this;
        }

        public Criteria andGasConsumptionIsNotNull() {
            addCriterion("gas_consumption is not null");
            return (Criteria) this;
        }

        public Criteria andGasConsumptionEqualTo(Double value) {
            addCriterion("gas_consumption =", value, "gasConsumption");
            return (Criteria) this;
        }

        public Criteria andGasConsumptionNotEqualTo(Double value) {
            addCriterion("gas_consumption <>", value, "gasConsumption");
            return (Criteria) this;
        }

        public Criteria andGasConsumptionGreaterThan(Double value) {
            addCriterion("gas_consumption >", value, "gasConsumption");
            return (Criteria) this;
        }

        public Criteria andGasConsumptionGreaterThanOrEqualTo(Double value) {
            addCriterion("gas_consumption >=", value, "gasConsumption");
            return (Criteria) this;
        }

        public Criteria andGasConsumptionLessThan(Double value) {
            addCriterion("gas_consumption <", value, "gasConsumption");
            return (Criteria) this;
        }

        public Criteria andGasConsumptionLessThanOrEqualTo(Double value) {
            addCriterion("gas_consumption <=", value, "gasConsumption");
            return (Criteria) this;
        }

        public Criteria andGasConsumptionIn(List<Double> values) {
            addCriterion("gas_consumption in", values, "gasConsumption");
            return (Criteria) this;
        }

        public Criteria andGasConsumptionNotIn(List<Double> values) {
            addCriterion("gas_consumption not in", values, "gasConsumption");
            return (Criteria) this;
        }

        public Criteria andGasConsumptionBetween(Double value1, Double value2) {
            addCriterion("gas_consumption between", value1, value2, "gasConsumption");
            return (Criteria) this;
        }

        public Criteria andGasConsumptionNotBetween(Double value1, Double value2) {
            addCriterion("gas_consumption not between", value1, value2, "gasConsumption");
            return (Criteria) this;
        }

        public Criteria andCoalConsumptionIsNull() {
            addCriterion("coal_consumption is null");
            return (Criteria) this;
        }

        public Criteria andCoalConsumptionIsNotNull() {
            addCriterion("coal_consumption is not null");
            return (Criteria) this;
        }

        public Criteria andCoalConsumptionEqualTo(Double value) {
            addCriterion("coal_consumption =", value, "coalConsumption");
            return (Criteria) this;
        }

        public Criteria andCoalConsumptionNotEqualTo(Double value) {
            addCriterion("coal_consumption <>", value, "coalConsumption");
            return (Criteria) this;
        }

        public Criteria andCoalConsumptionGreaterThan(Double value) {
            addCriterion("coal_consumption >", value, "coalConsumption");
            return (Criteria) this;
        }

        public Criteria andCoalConsumptionGreaterThanOrEqualTo(Double value) {
            addCriterion("coal_consumption >=", value, "coalConsumption");
            return (Criteria) this;
        }

        public Criteria andCoalConsumptionLessThan(Double value) {
            addCriterion("coal_consumption <", value, "coalConsumption");
            return (Criteria) this;
        }

        public Criteria andCoalConsumptionLessThanOrEqualTo(Double value) {
            addCriterion("coal_consumption <=", value, "coalConsumption");
            return (Criteria) this;
        }

        public Criteria andCoalConsumptionIn(List<Double> values) {
            addCriterion("coal_consumption in", values, "coalConsumption");
            return (Criteria) this;
        }

        public Criteria andCoalConsumptionNotIn(List<Double> values) {
            addCriterion("coal_consumption not in", values, "coalConsumption");
            return (Criteria) this;
        }

        public Criteria andCoalConsumptionBetween(Double value1, Double value2) {
            addCriterion("coal_consumption between", value1, value2, "coalConsumption");
            return (Criteria) this;
        }

        public Criteria andCoalConsumptionNotBetween(Double value1, Double value2) {
            addCriterion("coal_consumption not between", value1, value2, "coalConsumption");
            return (Criteria) this;
        }

        public Criteria andPowerConsumptionIsNull() {
            addCriterion("power_consumption is null");
            return (Criteria) this;
        }

        public Criteria andPowerConsumptionIsNotNull() {
            addCriterion("power_consumption is not null");
            return (Criteria) this;
        }

        public Criteria andPowerConsumptionEqualTo(Double value) {
            addCriterion("power_consumption =", value, "powerConsumption");
            return (Criteria) this;
        }

        public Criteria andPowerConsumptionNotEqualTo(Double value) {
            addCriterion("power_consumption <>", value, "powerConsumption");
            return (Criteria) this;
        }

        public Criteria andPowerConsumptionGreaterThan(Double value) {
            addCriterion("power_consumption >", value, "powerConsumption");
            return (Criteria) this;
        }

        public Criteria andPowerConsumptionGreaterThanOrEqualTo(Double value) {
            addCriterion("power_consumption >=", value, "powerConsumption");
            return (Criteria) this;
        }

        public Criteria andPowerConsumptionLessThan(Double value) {
            addCriterion("power_consumption <", value, "powerConsumption");
            return (Criteria) this;
        }

        public Criteria andPowerConsumptionLessThanOrEqualTo(Double value) {
            addCriterion("power_consumption <=", value, "powerConsumption");
            return (Criteria) this;
        }

        public Criteria andPowerConsumptionIn(List<Double> values) {
            addCriterion("power_consumption in", values, "powerConsumption");
            return (Criteria) this;
        }

        public Criteria andPowerConsumptionNotIn(List<Double> values) {
            addCriterion("power_consumption not in", values, "powerConsumption");
            return (Criteria) this;
        }

        public Criteria andPowerConsumptionBetween(Double value1, Double value2) {
            addCriterion("power_consumption between", value1, value2, "powerConsumption");
            return (Criteria) this;
        }

        public Criteria andPowerConsumptionNotBetween(Double value1, Double value2) {
            addCriterion("power_consumption not between", value1, value2, "powerConsumption");
            return (Criteria) this;
        }

        public Criteria andMethanolConsumptionIsNull() {
            addCriterion("methanol_consumption is null");
            return (Criteria) this;
        }

        public Criteria andMethanolConsumptionIsNotNull() {
            addCriterion("methanol_consumption is not null");
            return (Criteria) this;
        }

        public Criteria andMethanolConsumptionEqualTo(Double value) {
            addCriterion("methanol_consumption =", value, "methanolConsumption");
            return (Criteria) this;
        }

        public Criteria andMethanolConsumptionNotEqualTo(Double value) {
            addCriterion("methanol_consumption <>", value, "methanolConsumption");
            return (Criteria) this;
        }

        public Criteria andMethanolConsumptionGreaterThan(Double value) {
            addCriterion("methanol_consumption >", value, "methanolConsumption");
            return (Criteria) this;
        }

        public Criteria andMethanolConsumptionGreaterThanOrEqualTo(Double value) {
            addCriterion("methanol_consumption >=", value, "methanolConsumption");
            return (Criteria) this;
        }

        public Criteria andMethanolConsumptionLessThan(Double value) {
            addCriterion("methanol_consumption <", value, "methanolConsumption");
            return (Criteria) this;
        }

        public Criteria andMethanolConsumptionLessThanOrEqualTo(Double value) {
            addCriterion("methanol_consumption <=", value, "methanolConsumption");
            return (Criteria) this;
        }

        public Criteria andMethanolConsumptionIn(List<Double> values) {
            addCriterion("methanol_consumption in", values, "methanolConsumption");
            return (Criteria) this;
        }

        public Criteria andMethanolConsumptionNotIn(List<Double> values) {
            addCriterion("methanol_consumption not in", values, "methanolConsumption");
            return (Criteria) this;
        }

        public Criteria andMethanolConsumptionBetween(Double value1, Double value2) {
            addCriterion("methanol_consumption between", value1, value2, "methanolConsumption");
            return (Criteria) this;
        }

        public Criteria andMethanolConsumptionNotBetween(Double value1, Double value2) {
            addCriterion("methanol_consumption not between", value1, value2, "methanolConsumption");
            return (Criteria) this;
        }

        public Criteria andOtherConsumptionIsNull() {
            addCriterion("other_consumption is null");
            return (Criteria) this;
        }

        public Criteria andOtherConsumptionIsNotNull() {
            addCriterion("other_consumption is not null");
            return (Criteria) this;
        }

        public Criteria andOtherConsumptionEqualTo(Double value) {
            addCriterion("other_consumption =", value, "otherConsumption");
            return (Criteria) this;
        }

        public Criteria andOtherConsumptionNotEqualTo(Double value) {
            addCriterion("other_consumption <>", value, "otherConsumption");
            return (Criteria) this;
        }

        public Criteria andOtherConsumptionGreaterThan(Double value) {
            addCriterion("other_consumption >", value, "otherConsumption");
            return (Criteria) this;
        }

        public Criteria andOtherConsumptionGreaterThanOrEqualTo(Double value) {
            addCriterion("other_consumption >=", value, "otherConsumption");
            return (Criteria) this;
        }

        public Criteria andOtherConsumptionLessThan(Double value) {
            addCriterion("other_consumption <", value, "otherConsumption");
            return (Criteria) this;
        }

        public Criteria andOtherConsumptionLessThanOrEqualTo(Double value) {
            addCriterion("other_consumption <=", value, "otherConsumption");
            return (Criteria) this;
        }

        public Criteria andOtherConsumptionIn(List<Double> values) {
            addCriterion("other_consumption in", values, "otherConsumption");
            return (Criteria) this;
        }

        public Criteria andOtherConsumptionNotIn(List<Double> values) {
            addCriterion("other_consumption not in", values, "otherConsumption");
            return (Criteria) this;
        }

        public Criteria andOtherConsumptionBetween(Double value1, Double value2) {
            addCriterion("other_consumption between", value1, value2, "otherConsumption");
            return (Criteria) this;
        }

        public Criteria andOtherConsumptionNotBetween(Double value1, Double value2) {
            addCriterion("other_consumption not between", value1, value2, "otherConsumption");
            return (Criteria) this;
        }

        public Criteria andOtherConunitIsNull() {
            addCriterion("other_conunit is null");
            return (Criteria) this;
        }

        public Criteria andOtherConunitIsNotNull() {
            addCriterion("other_conunit is not null");
            return (Criteria) this;
        }

        public Criteria andOtherConunitEqualTo(String value) {
            addCriterion("other_conunit =", value, "otherConunit");
            return (Criteria) this;
        }

        public Criteria andOtherConunitNotEqualTo(String value) {
            addCriterion("other_conunit <>", value, "otherConunit");
            return (Criteria) this;
        }

        public Criteria andOtherConunitGreaterThan(String value) {
            addCriterion("other_conunit >", value, "otherConunit");
            return (Criteria) this;
        }

        public Criteria andOtherConunitGreaterThanOrEqualTo(String value) {
            addCriterion("other_conunit >=", value, "otherConunit");
            return (Criteria) this;
        }

        public Criteria andOtherConunitLessThan(String value) {
            addCriterion("other_conunit <", value, "otherConunit");
            return (Criteria) this;
        }

        public Criteria andOtherConunitLessThanOrEqualTo(String value) {
            addCriterion("other_conunit <=", value, "otherConunit");
            return (Criteria) this;
        }

        public Criteria andOtherConunitLike(String value) {
            addCriterion("other_conunit like", value, "otherConunit");
            return (Criteria) this;
        }

        public Criteria andOtherConunitNotLike(String value) {
            addCriterion("other_conunit not like", value, "otherConunit");
            return (Criteria) this;
        }

        public Criteria andOtherConunitIn(List<String> values) {
            addCriterion("other_conunit in", values, "otherConunit");
            return (Criteria) this;
        }

        public Criteria andOtherConunitNotIn(List<String> values) {
            addCriterion("other_conunit not in", values, "otherConunit");
            return (Criteria) this;
        }

        public Criteria andOtherConunitBetween(String value1, String value2) {
            addCriterion("other_conunit between", value1, value2, "otherConunit");
            return (Criteria) this;
        }

        public Criteria andOtherConunitNotBetween(String value1, String value2) {
            addCriterion("other_conunit not between", value1, value2, "otherConunit");
            return (Criteria) this;
        }

        public Criteria andMealConsumptionIsNull() {
            addCriterion("meal_consumption is null");
            return (Criteria) this;
        }

        public Criteria andMealConsumptionIsNotNull() {
            addCriterion("meal_consumption is not null");
            return (Criteria) this;
        }

        public Criteria andMealConsumptionEqualTo(Double value) {
            addCriterion("meal_consumption =", value, "mealConsumption");
            return (Criteria) this;
        }

        public Criteria andMealConsumptionNotEqualTo(Double value) {
            addCriterion("meal_consumption <>", value, "mealConsumption");
            return (Criteria) this;
        }

        public Criteria andMealConsumptionGreaterThan(Double value) {
            addCriterion("meal_consumption >", value, "mealConsumption");
            return (Criteria) this;
        }

        public Criteria andMealConsumptionGreaterThanOrEqualTo(Double value) {
            addCriterion("meal_consumption >=", value, "mealConsumption");
            return (Criteria) this;
        }

        public Criteria andMealConsumptionLessThan(Double value) {
            addCriterion("meal_consumption <", value, "mealConsumption");
            return (Criteria) this;
        }

        public Criteria andMealConsumptionLessThanOrEqualTo(Double value) {
            addCriterion("meal_consumption <=", value, "mealConsumption");
            return (Criteria) this;
        }

        public Criteria andMealConsumptionIn(List<Double> values) {
            addCriterion("meal_consumption in", values, "mealConsumption");
            return (Criteria) this;
        }

        public Criteria andMealConsumptionNotIn(List<Double> values) {
            addCriterion("meal_consumption not in", values, "mealConsumption");
            return (Criteria) this;
        }

        public Criteria andMealConsumptionBetween(Double value1, Double value2) {
            addCriterion("meal_consumption between", value1, value2, "mealConsumption");
            return (Criteria) this;
        }

        public Criteria andMealConsumptionNotBetween(Double value1, Double value2) {
            addCriterion("meal_consumption not between", value1, value2, "mealConsumption");
            return (Criteria) this;
        }

        public Criteria andSourceDiscripIsNull() {
            addCriterion("source_discrip is null");
            return (Criteria) this;
        }

        public Criteria andSourceDiscripIsNotNull() {
            addCriterion("source_discrip is not null");
            return (Criteria) this;
        }

        public Criteria andSourceDiscripEqualTo(String value) {
            addCriterion("source_discrip =", value, "sourceDiscrip");
            return (Criteria) this;
        }

        public Criteria andSourceDiscripNotEqualTo(String value) {
            addCriterion("source_discrip <>", value, "sourceDiscrip");
            return (Criteria) this;
        }

        public Criteria andSourceDiscripGreaterThan(String value) {
            addCriterion("source_discrip >", value, "sourceDiscrip");
            return (Criteria) this;
        }

        public Criteria andSourceDiscripGreaterThanOrEqualTo(String value) {
            addCriterion("source_discrip >=", value, "sourceDiscrip");
            return (Criteria) this;
        }

        public Criteria andSourceDiscripLessThan(String value) {
            addCriterion("source_discrip <", value, "sourceDiscrip");
            return (Criteria) this;
        }

        public Criteria andSourceDiscripLessThanOrEqualTo(String value) {
            addCriterion("source_discrip <=", value, "sourceDiscrip");
            return (Criteria) this;
        }

        public Criteria andSourceDiscripLike(String value) {
            addCriterion("source_discrip like", value, "sourceDiscrip");
            return (Criteria) this;
        }

        public Criteria andSourceDiscripNotLike(String value) {
            addCriterion("source_discrip not like", value, "sourceDiscrip");
            return (Criteria) this;
        }

        public Criteria andSourceDiscripIn(List<String> values) {
            addCriterion("source_discrip in", values, "sourceDiscrip");
            return (Criteria) this;
        }

        public Criteria andSourceDiscripNotIn(List<String> values) {
            addCriterion("source_discrip not in", values, "sourceDiscrip");
            return (Criteria) this;
        }

        public Criteria andSourceDiscripBetween(String value1, String value2) {
            addCriterion("source_discrip between", value1, value2, "sourceDiscrip");
            return (Criteria) this;
        }

        public Criteria andSourceDiscripNotBetween(String value1, String value2) {
            addCriterion("source_discrip not between", value1, value2, "sourceDiscrip");
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