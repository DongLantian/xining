package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FConstructionDustSourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FConstructionDustSourceExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andConstructDustidIsNull() {
            addCriterion("construct_dustid is null");
            return (Criteria) this;
        }

        public Criteria andConstructDustidIsNotNull() {
            addCriterion("construct_dustid is not null");
            return (Criteria) this;
        }

        public Criteria andConstructDustidEqualTo(Integer value) {
            addCriterion("construct_dustid =", value, "constructDustid");
            return (Criteria) this;
        }

        public Criteria andConstructDustidNotEqualTo(Integer value) {
            addCriterion("construct_dustid <>", value, "constructDustid");
            return (Criteria) this;
        }

        public Criteria andConstructDustidGreaterThan(Integer value) {
            addCriterion("construct_dustid >", value, "constructDustid");
            return (Criteria) this;
        }

        public Criteria andConstructDustidGreaterThanOrEqualTo(Integer value) {
            addCriterion("construct_dustid >=", value, "constructDustid");
            return (Criteria) this;
        }

        public Criteria andConstructDustidLessThan(Integer value) {
            addCriterion("construct_dustid <", value, "constructDustid");
            return (Criteria) this;
        }

        public Criteria andConstructDustidLessThanOrEqualTo(Integer value) {
            addCriterion("construct_dustid <=", value, "constructDustid");
            return (Criteria) this;
        }

        public Criteria andConstructDustidIn(List<Integer> values) {
            addCriterion("construct_dustid in", values, "constructDustid");
            return (Criteria) this;
        }

        public Criteria andConstructDustidNotIn(List<Integer> values) {
            addCriterion("construct_dustid not in", values, "constructDustid");
            return (Criteria) this;
        }

        public Criteria andConstructDustidBetween(Integer value1, Integer value2) {
            addCriterion("construct_dustid between", value1, value2, "constructDustid");
            return (Criteria) this;
        }

        public Criteria andConstructDustidNotBetween(Integer value1, Integer value2) {
            addCriterion("construct_dustid not between", value1, value2, "constructDustid");
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

        public Criteria andConstructStateIsNull() {
            addCriterion("construct_state is null");
            return (Criteria) this;
        }

        public Criteria andConstructStateIsNotNull() {
            addCriterion("construct_state is not null");
            return (Criteria) this;
        }

        public Criteria andConstructStateEqualTo(String value) {
            addCriterion("construct_state =", value, "constructState");
            return (Criteria) this;
        }

        public Criteria andConstructStateNotEqualTo(String value) {
            addCriterion("construct_state <>", value, "constructState");
            return (Criteria) this;
        }

        public Criteria andConstructStateGreaterThan(String value) {
            addCriterion("construct_state >", value, "constructState");
            return (Criteria) this;
        }

        public Criteria andConstructStateGreaterThanOrEqualTo(String value) {
            addCriterion("construct_state >=", value, "constructState");
            return (Criteria) this;
        }

        public Criteria andConstructStateLessThan(String value) {
            addCriterion("construct_state <", value, "constructState");
            return (Criteria) this;
        }

        public Criteria andConstructStateLessThanOrEqualTo(String value) {
            addCriterion("construct_state <=", value, "constructState");
            return (Criteria) this;
        }

        public Criteria andConstructStateLike(String value) {
            addCriterion("construct_state like", value, "constructState");
            return (Criteria) this;
        }

        public Criteria andConstructStateNotLike(String value) {
            addCriterion("construct_state not like", value, "constructState");
            return (Criteria) this;
        }

        public Criteria andConstructStateIn(List<String> values) {
            addCriterion("construct_state in", values, "constructState");
            return (Criteria) this;
        }

        public Criteria andConstructStateNotIn(List<String> values) {
            addCriterion("construct_state not in", values, "constructState");
            return (Criteria) this;
        }

        public Criteria andConstructStateBetween(String value1, String value2) {
            addCriterion("construct_state between", value1, value2, "constructState");
            return (Criteria) this;
        }

        public Criteria andConstructStateNotBetween(String value1, String value2) {
            addCriterion("construct_state not between", value1, value2, "constructState");
            return (Criteria) this;
        }

        public Criteria andConstructAreaIsNull() {
            addCriterion("construct_area is null");
            return (Criteria) this;
        }

        public Criteria andConstructAreaIsNotNull() {
            addCriterion("construct_area is not null");
            return (Criteria) this;
        }

        public Criteria andConstructAreaEqualTo(Double value) {
            addCriterion("construct_area =", value, "constructArea");
            return (Criteria) this;
        }

        public Criteria andConstructAreaNotEqualTo(Double value) {
            addCriterion("construct_area <>", value, "constructArea");
            return (Criteria) this;
        }

        public Criteria andConstructAreaGreaterThan(Double value) {
            addCriterion("construct_area >", value, "constructArea");
            return (Criteria) this;
        }

        public Criteria andConstructAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("construct_area >=", value, "constructArea");
            return (Criteria) this;
        }

        public Criteria andConstructAreaLessThan(Double value) {
            addCriterion("construct_area <", value, "constructArea");
            return (Criteria) this;
        }

        public Criteria andConstructAreaLessThanOrEqualTo(Double value) {
            addCriterion("construct_area <=", value, "constructArea");
            return (Criteria) this;
        }

        public Criteria andConstructAreaIn(List<Double> values) {
            addCriterion("construct_area in", values, "constructArea");
            return (Criteria) this;
        }

        public Criteria andConstructAreaNotIn(List<Double> values) {
            addCriterion("construct_area not in", values, "constructArea");
            return (Criteria) this;
        }

        public Criteria andConstructAreaBetween(Double value1, Double value2) {
            addCriterion("construct_area between", value1, value2, "constructArea");
            return (Criteria) this;
        }

        public Criteria andConstructAreaNotBetween(Double value1, Double value2) {
            addCriterion("construct_area not between", value1, value2, "constructArea");
            return (Criteria) this;
        }

        public Criteria andConstructMonthsIsNull() {
            addCriterion("construct_months is null");
            return (Criteria) this;
        }

        public Criteria andConstructMonthsIsNotNull() {
            addCriterion("construct_months is not null");
            return (Criteria) this;
        }

        public Criteria andConstructMonthsEqualTo(String value) {
            addCriterion("construct_months =", value, "constructMonths");
            return (Criteria) this;
        }

        public Criteria andConstructMonthsNotEqualTo(String value) {
            addCriterion("construct_months <>", value, "constructMonths");
            return (Criteria) this;
        }

        public Criteria andConstructMonthsGreaterThan(String value) {
            addCriterion("construct_months >", value, "constructMonths");
            return (Criteria) this;
        }

        public Criteria andConstructMonthsGreaterThanOrEqualTo(String value) {
            addCriterion("construct_months >=", value, "constructMonths");
            return (Criteria) this;
        }

        public Criteria andConstructMonthsLessThan(String value) {
            addCriterion("construct_months <", value, "constructMonths");
            return (Criteria) this;
        }

        public Criteria andConstructMonthsLessThanOrEqualTo(String value) {
            addCriterion("construct_months <=", value, "constructMonths");
            return (Criteria) this;
        }

        public Criteria andConstructMonthsLike(String value) {
            addCriterion("construct_months like", value, "constructMonths");
            return (Criteria) this;
        }

        public Criteria andConstructMonthsNotLike(String value) {
            addCriterion("construct_months not like", value, "constructMonths");
            return (Criteria) this;
        }

        public Criteria andConstructMonthsIn(List<String> values) {
            addCriterion("construct_months in", values, "constructMonths");
            return (Criteria) this;
        }

        public Criteria andConstructMonthsNotIn(List<String> values) {
            addCriterion("construct_months not in", values, "constructMonths");
            return (Criteria) this;
        }

        public Criteria andConstructMonthsBetween(String value1, String value2) {
            addCriterion("construct_months between", value1, value2, "constructMonths");
            return (Criteria) this;
        }

        public Criteria andConstructMonthsNotBetween(String value1, String value2) {
            addCriterion("construct_months not between", value1, value2, "constructMonths");
            return (Criteria) this;
        }

        public Criteria andControlMeasuresIsNull() {
            addCriterion("control_measures is null");
            return (Criteria) this;
        }

        public Criteria andControlMeasuresIsNotNull() {
            addCriterion("control_measures is not null");
            return (Criteria) this;
        }

        public Criteria andControlMeasuresEqualTo(String value) {
            addCriterion("control_measures =", value, "controlMeasures");
            return (Criteria) this;
        }

        public Criteria andControlMeasuresNotEqualTo(String value) {
            addCriterion("control_measures <>", value, "controlMeasures");
            return (Criteria) this;
        }

        public Criteria andControlMeasuresGreaterThan(String value) {
            addCriterion("control_measures >", value, "controlMeasures");
            return (Criteria) this;
        }

        public Criteria andControlMeasuresGreaterThanOrEqualTo(String value) {
            addCriterion("control_measures >=", value, "controlMeasures");
            return (Criteria) this;
        }

        public Criteria andControlMeasuresLessThan(String value) {
            addCriterion("control_measures <", value, "controlMeasures");
            return (Criteria) this;
        }

        public Criteria andControlMeasuresLessThanOrEqualTo(String value) {
            addCriterion("control_measures <=", value, "controlMeasures");
            return (Criteria) this;
        }

        public Criteria andControlMeasuresLike(String value) {
            addCriterion("control_measures like", value, "controlMeasures");
            return (Criteria) this;
        }

        public Criteria andControlMeasuresNotLike(String value) {
            addCriterion("control_measures not like", value, "controlMeasures");
            return (Criteria) this;
        }

        public Criteria andControlMeasuresIn(List<String> values) {
            addCriterion("control_measures in", values, "controlMeasures");
            return (Criteria) this;
        }

        public Criteria andControlMeasuresNotIn(List<String> values) {
            addCriterion("control_measures not in", values, "controlMeasures");
            return (Criteria) this;
        }

        public Criteria andControlMeasuresBetween(String value1, String value2) {
            addCriterion("control_measures between", value1, value2, "controlMeasures");
            return (Criteria) this;
        }

        public Criteria andControlMeasuresNotBetween(String value1, String value2) {
            addCriterion("control_measures not between", value1, value2, "controlMeasures");
            return (Criteria) this;
        }

        public Criteria andFinishareaIsNull() {
            addCriterion("finisharea is null");
            return (Criteria) this;
        }

        public Criteria andFinishareaIsNotNull() {
            addCriterion("finisharea is not null");
            return (Criteria) this;
        }

        public Criteria andFinishareaEqualTo(Double value) {
            addCriterion("finisharea =", value, "finisharea");
            return (Criteria) this;
        }

        public Criteria andFinishareaNotEqualTo(Double value) {
            addCriterion("finisharea <>", value, "finisharea");
            return (Criteria) this;
        }

        public Criteria andFinishareaGreaterThan(Double value) {
            addCriterion("finisharea >", value, "finisharea");
            return (Criteria) this;
        }

        public Criteria andFinishareaGreaterThanOrEqualTo(Double value) {
            addCriterion("finisharea >=", value, "finisharea");
            return (Criteria) this;
        }

        public Criteria andFinishareaLessThan(Double value) {
            addCriterion("finisharea <", value, "finisharea");
            return (Criteria) this;
        }

        public Criteria andFinishareaLessThanOrEqualTo(Double value) {
            addCriterion("finisharea <=", value, "finisharea");
            return (Criteria) this;
        }

        public Criteria andFinishareaIn(List<Double> values) {
            addCriterion("finisharea in", values, "finisharea");
            return (Criteria) this;
        }

        public Criteria andFinishareaNotIn(List<Double> values) {
            addCriterion("finisharea not in", values, "finisharea");
            return (Criteria) this;
        }

        public Criteria andFinishareaBetween(Double value1, Double value2) {
            addCriterion("finisharea between", value1, value2, "finisharea");
            return (Criteria) this;
        }

        public Criteria andFinishareaNotBetween(Double value1, Double value2) {
            addCriterion("finisharea not between", value1, value2, "finisharea");
            return (Criteria) this;
        }

        public Criteria andNowkgareaIsNull() {
            addCriterion("nowkgarea is null");
            return (Criteria) this;
        }

        public Criteria andNowkgareaIsNotNull() {
            addCriterion("nowkgarea is not null");
            return (Criteria) this;
        }

        public Criteria andNowkgareaEqualTo(Double value) {
            addCriterion("nowkgarea =", value, "nowkgarea");
            return (Criteria) this;
        }

        public Criteria andNowkgareaNotEqualTo(Double value) {
            addCriterion("nowkgarea <>", value, "nowkgarea");
            return (Criteria) this;
        }

        public Criteria andNowkgareaGreaterThan(Double value) {
            addCriterion("nowkgarea >", value, "nowkgarea");
            return (Criteria) this;
        }

        public Criteria andNowkgareaGreaterThanOrEqualTo(Double value) {
            addCriterion("nowkgarea >=", value, "nowkgarea");
            return (Criteria) this;
        }

        public Criteria andNowkgareaLessThan(Double value) {
            addCriterion("nowkgarea <", value, "nowkgarea");
            return (Criteria) this;
        }

        public Criteria andNowkgareaLessThanOrEqualTo(Double value) {
            addCriterion("nowkgarea <=", value, "nowkgarea");
            return (Criteria) this;
        }

        public Criteria andNowkgareaIn(List<Double> values) {
            addCriterion("nowkgarea in", values, "nowkgarea");
            return (Criteria) this;
        }

        public Criteria andNowkgareaNotIn(List<Double> values) {
            addCriterion("nowkgarea not in", values, "nowkgarea");
            return (Criteria) this;
        }

        public Criteria andNowkgareaBetween(Double value1, Double value2) {
            addCriterion("nowkgarea between", value1, value2, "nowkgarea");
            return (Criteria) this;
        }

        public Criteria andNowkgareaNotBetween(Double value1, Double value2) {
            addCriterion("nowkgarea not between", value1, value2, "nowkgarea");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startdate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startdate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterionForJDBCDate("startdate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("startdate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("startdate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startdate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterionForJDBCDate("startdate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startdate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterionForJDBCDate("startdate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("startdate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startdate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startdate not between", value1, value2, "startdate");
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

        public Criteria andLongitude1IsNull() {
            addCriterion("LONGITUDE1 is null");
            return (Criteria) this;
        }

        public Criteria andLongitude1IsNotNull() {
            addCriterion("LONGITUDE1 is not null");
            return (Criteria) this;
        }

        public Criteria andLongitude1EqualTo(Double value) {
            addCriterion("LONGITUDE1 =", value, "longitude1");
            return (Criteria) this;
        }

        public Criteria andLongitude1NotEqualTo(Double value) {
            addCriterion("LONGITUDE1 <>", value, "longitude1");
            return (Criteria) this;
        }

        public Criteria andLongitude1GreaterThan(Double value) {
            addCriterion("LONGITUDE1 >", value, "longitude1");
            return (Criteria) this;
        }

        public Criteria andLongitude1GreaterThanOrEqualTo(Double value) {
            addCriterion("LONGITUDE1 >=", value, "longitude1");
            return (Criteria) this;
        }

        public Criteria andLongitude1LessThan(Double value) {
            addCriterion("LONGITUDE1 <", value, "longitude1");
            return (Criteria) this;
        }

        public Criteria andLongitude1LessThanOrEqualTo(Double value) {
            addCriterion("LONGITUDE1 <=", value, "longitude1");
            return (Criteria) this;
        }

        public Criteria andLongitude1In(List<Double> values) {
            addCriterion("LONGITUDE1 in", values, "longitude1");
            return (Criteria) this;
        }

        public Criteria andLongitude1NotIn(List<Double> values) {
            addCriterion("LONGITUDE1 not in", values, "longitude1");
            return (Criteria) this;
        }

        public Criteria andLongitude1Between(Double value1, Double value2) {
            addCriterion("LONGITUDE1 between", value1, value2, "longitude1");
            return (Criteria) this;
        }

        public Criteria andLongitude1NotBetween(Double value1, Double value2) {
            addCriterion("LONGITUDE1 not between", value1, value2, "longitude1");
            return (Criteria) this;
        }

        public Criteria andLatitude1IsNull() {
            addCriterion("LATITUDE1 is null");
            return (Criteria) this;
        }

        public Criteria andLatitude1IsNotNull() {
            addCriterion("LATITUDE1 is not null");
            return (Criteria) this;
        }

        public Criteria andLatitude1EqualTo(Double value) {
            addCriterion("LATITUDE1 =", value, "latitude1");
            return (Criteria) this;
        }

        public Criteria andLatitude1NotEqualTo(Double value) {
            addCriterion("LATITUDE1 <>", value, "latitude1");
            return (Criteria) this;
        }

        public Criteria andLatitude1GreaterThan(Double value) {
            addCriterion("LATITUDE1 >", value, "latitude1");
            return (Criteria) this;
        }

        public Criteria andLatitude1GreaterThanOrEqualTo(Double value) {
            addCriterion("LATITUDE1 >=", value, "latitude1");
            return (Criteria) this;
        }

        public Criteria andLatitude1LessThan(Double value) {
            addCriterion("LATITUDE1 <", value, "latitude1");
            return (Criteria) this;
        }

        public Criteria andLatitude1LessThanOrEqualTo(Double value) {
            addCriterion("LATITUDE1 <=", value, "latitude1");
            return (Criteria) this;
        }

        public Criteria andLatitude1In(List<Double> values) {
            addCriterion("LATITUDE1 in", values, "latitude1");
            return (Criteria) this;
        }

        public Criteria andLatitude1NotIn(List<Double> values) {
            addCriterion("LATITUDE1 not in", values, "latitude1");
            return (Criteria) this;
        }

        public Criteria andLatitude1Between(Double value1, Double value2) {
            addCriterion("LATITUDE1 between", value1, value2, "latitude1");
            return (Criteria) this;
        }

        public Criteria andLatitude1NotBetween(Double value1, Double value2) {
            addCriterion("LATITUDE1 not between", value1, value2, "latitude1");
            return (Criteria) this;
        }

        public Criteria andLongitude2IsNull() {
            addCriterion("LONGITUDE2 is null");
            return (Criteria) this;
        }

        public Criteria andLongitude2IsNotNull() {
            addCriterion("LONGITUDE2 is not null");
            return (Criteria) this;
        }

        public Criteria andLongitude2EqualTo(Double value) {
            addCriterion("LONGITUDE2 =", value, "longitude2");
            return (Criteria) this;
        }

        public Criteria andLongitude2NotEqualTo(Double value) {
            addCriterion("LONGITUDE2 <>", value, "longitude2");
            return (Criteria) this;
        }

        public Criteria andLongitude2GreaterThan(Double value) {
            addCriterion("LONGITUDE2 >", value, "longitude2");
            return (Criteria) this;
        }

        public Criteria andLongitude2GreaterThanOrEqualTo(Double value) {
            addCriterion("LONGITUDE2 >=", value, "longitude2");
            return (Criteria) this;
        }

        public Criteria andLongitude2LessThan(Double value) {
            addCriterion("LONGITUDE2 <", value, "longitude2");
            return (Criteria) this;
        }

        public Criteria andLongitude2LessThanOrEqualTo(Double value) {
            addCriterion("LONGITUDE2 <=", value, "longitude2");
            return (Criteria) this;
        }

        public Criteria andLongitude2In(List<Double> values) {
            addCriterion("LONGITUDE2 in", values, "longitude2");
            return (Criteria) this;
        }

        public Criteria andLongitude2NotIn(List<Double> values) {
            addCriterion("LONGITUDE2 not in", values, "longitude2");
            return (Criteria) this;
        }

        public Criteria andLongitude2Between(Double value1, Double value2) {
            addCriterion("LONGITUDE2 between", value1, value2, "longitude2");
            return (Criteria) this;
        }

        public Criteria andLongitude2NotBetween(Double value1, Double value2) {
            addCriterion("LONGITUDE2 not between", value1, value2, "longitude2");
            return (Criteria) this;
        }

        public Criteria andLatitude2IsNull() {
            addCriterion("LATITUDE2 is null");
            return (Criteria) this;
        }

        public Criteria andLatitude2IsNotNull() {
            addCriterion("LATITUDE2 is not null");
            return (Criteria) this;
        }

        public Criteria andLatitude2EqualTo(Double value) {
            addCriterion("LATITUDE2 =", value, "latitude2");
            return (Criteria) this;
        }

        public Criteria andLatitude2NotEqualTo(Double value) {
            addCriterion("LATITUDE2 <>", value, "latitude2");
            return (Criteria) this;
        }

        public Criteria andLatitude2GreaterThan(Double value) {
            addCriterion("LATITUDE2 >", value, "latitude2");
            return (Criteria) this;
        }

        public Criteria andLatitude2GreaterThanOrEqualTo(Double value) {
            addCriterion("LATITUDE2 >=", value, "latitude2");
            return (Criteria) this;
        }

        public Criteria andLatitude2LessThan(Double value) {
            addCriterion("LATITUDE2 <", value, "latitude2");
            return (Criteria) this;
        }

        public Criteria andLatitude2LessThanOrEqualTo(Double value) {
            addCriterion("LATITUDE2 <=", value, "latitude2");
            return (Criteria) this;
        }

        public Criteria andLatitude2In(List<Double> values) {
            addCriterion("LATITUDE2 in", values, "latitude2");
            return (Criteria) this;
        }

        public Criteria andLatitude2NotIn(List<Double> values) {
            addCriterion("LATITUDE2 not in", values, "latitude2");
            return (Criteria) this;
        }

        public Criteria andLatitude2Between(Double value1, Double value2) {
            addCriterion("LATITUDE2 between", value1, value2, "latitude2");
            return (Criteria) this;
        }

        public Criteria andLatitude2NotBetween(Double value1, Double value2) {
            addCriterion("LATITUDE2 not between", value1, value2, "latitude2");
            return (Criteria) this;
        }

        public Criteria andLongitude3IsNull() {
            addCriterion("LONGITUDE3 is null");
            return (Criteria) this;
        }

        public Criteria andLongitude3IsNotNull() {
            addCriterion("LONGITUDE3 is not null");
            return (Criteria) this;
        }

        public Criteria andLongitude3EqualTo(Double value) {
            addCriterion("LONGITUDE3 =", value, "longitude3");
            return (Criteria) this;
        }

        public Criteria andLongitude3NotEqualTo(Double value) {
            addCriterion("LONGITUDE3 <>", value, "longitude3");
            return (Criteria) this;
        }

        public Criteria andLongitude3GreaterThan(Double value) {
            addCriterion("LONGITUDE3 >", value, "longitude3");
            return (Criteria) this;
        }

        public Criteria andLongitude3GreaterThanOrEqualTo(Double value) {
            addCriterion("LONGITUDE3 >=", value, "longitude3");
            return (Criteria) this;
        }

        public Criteria andLongitude3LessThan(Double value) {
            addCriterion("LONGITUDE3 <", value, "longitude3");
            return (Criteria) this;
        }

        public Criteria andLongitude3LessThanOrEqualTo(Double value) {
            addCriterion("LONGITUDE3 <=", value, "longitude3");
            return (Criteria) this;
        }

        public Criteria andLongitude3In(List<Double> values) {
            addCriterion("LONGITUDE3 in", values, "longitude3");
            return (Criteria) this;
        }

        public Criteria andLongitude3NotIn(List<Double> values) {
            addCriterion("LONGITUDE3 not in", values, "longitude3");
            return (Criteria) this;
        }

        public Criteria andLongitude3Between(Double value1, Double value2) {
            addCriterion("LONGITUDE3 between", value1, value2, "longitude3");
            return (Criteria) this;
        }

        public Criteria andLongitude3NotBetween(Double value1, Double value2) {
            addCriterion("LONGITUDE3 not between", value1, value2, "longitude3");
            return (Criteria) this;
        }

        public Criteria andLatitude3IsNull() {
            addCriterion("LATITUDE3 is null");
            return (Criteria) this;
        }

        public Criteria andLatitude3IsNotNull() {
            addCriterion("LATITUDE3 is not null");
            return (Criteria) this;
        }

        public Criteria andLatitude3EqualTo(Double value) {
            addCriterion("LATITUDE3 =", value, "latitude3");
            return (Criteria) this;
        }

        public Criteria andLatitude3NotEqualTo(Double value) {
            addCriterion("LATITUDE3 <>", value, "latitude3");
            return (Criteria) this;
        }

        public Criteria andLatitude3GreaterThan(Double value) {
            addCriterion("LATITUDE3 >", value, "latitude3");
            return (Criteria) this;
        }

        public Criteria andLatitude3GreaterThanOrEqualTo(Double value) {
            addCriterion("LATITUDE3 >=", value, "latitude3");
            return (Criteria) this;
        }

        public Criteria andLatitude3LessThan(Double value) {
            addCriterion("LATITUDE3 <", value, "latitude3");
            return (Criteria) this;
        }

        public Criteria andLatitude3LessThanOrEqualTo(Double value) {
            addCriterion("LATITUDE3 <=", value, "latitude3");
            return (Criteria) this;
        }

        public Criteria andLatitude3In(List<Double> values) {
            addCriterion("LATITUDE3 in", values, "latitude3");
            return (Criteria) this;
        }

        public Criteria andLatitude3NotIn(List<Double> values) {
            addCriterion("LATITUDE3 not in", values, "latitude3");
            return (Criteria) this;
        }

        public Criteria andLatitude3Between(Double value1, Double value2) {
            addCriterion("LATITUDE3 between", value1, value2, "latitude3");
            return (Criteria) this;
        }

        public Criteria andLatitude3NotBetween(Double value1, Double value2) {
            addCriterion("LATITUDE3 not between", value1, value2, "latitude3");
            return (Criteria) this;
        }

        public Criteria andLongitude4IsNull() {
            addCriterion("LONGITUDE4 is null");
            return (Criteria) this;
        }

        public Criteria andLongitude4IsNotNull() {
            addCriterion("LONGITUDE4 is not null");
            return (Criteria) this;
        }

        public Criteria andLongitude4EqualTo(Double value) {
            addCriterion("LONGITUDE4 =", value, "longitude4");
            return (Criteria) this;
        }

        public Criteria andLongitude4NotEqualTo(Double value) {
            addCriterion("LONGITUDE4 <>", value, "longitude4");
            return (Criteria) this;
        }

        public Criteria andLongitude4GreaterThan(Double value) {
            addCriterion("LONGITUDE4 >", value, "longitude4");
            return (Criteria) this;
        }

        public Criteria andLongitude4GreaterThanOrEqualTo(Double value) {
            addCriterion("LONGITUDE4 >=", value, "longitude4");
            return (Criteria) this;
        }

        public Criteria andLongitude4LessThan(Double value) {
            addCriterion("LONGITUDE4 <", value, "longitude4");
            return (Criteria) this;
        }

        public Criteria andLongitude4LessThanOrEqualTo(Double value) {
            addCriterion("LONGITUDE4 <=", value, "longitude4");
            return (Criteria) this;
        }

        public Criteria andLongitude4In(List<Double> values) {
            addCriterion("LONGITUDE4 in", values, "longitude4");
            return (Criteria) this;
        }

        public Criteria andLongitude4NotIn(List<Double> values) {
            addCriterion("LONGITUDE4 not in", values, "longitude4");
            return (Criteria) this;
        }

        public Criteria andLongitude4Between(Double value1, Double value2) {
            addCriterion("LONGITUDE4 between", value1, value2, "longitude4");
            return (Criteria) this;
        }

        public Criteria andLongitude4NotBetween(Double value1, Double value2) {
            addCriterion("LONGITUDE4 not between", value1, value2, "longitude4");
            return (Criteria) this;
        }

        public Criteria andLatitude4IsNull() {
            addCriterion("LATITUDE4 is null");
            return (Criteria) this;
        }

        public Criteria andLatitude4IsNotNull() {
            addCriterion("LATITUDE4 is not null");
            return (Criteria) this;
        }

        public Criteria andLatitude4EqualTo(Double value) {
            addCriterion("LATITUDE4 =", value, "latitude4");
            return (Criteria) this;
        }

        public Criteria andLatitude4NotEqualTo(Double value) {
            addCriterion("LATITUDE4 <>", value, "latitude4");
            return (Criteria) this;
        }

        public Criteria andLatitude4GreaterThan(Double value) {
            addCriterion("LATITUDE4 >", value, "latitude4");
            return (Criteria) this;
        }

        public Criteria andLatitude4GreaterThanOrEqualTo(Double value) {
            addCriterion("LATITUDE4 >=", value, "latitude4");
            return (Criteria) this;
        }

        public Criteria andLatitude4LessThan(Double value) {
            addCriterion("LATITUDE4 <", value, "latitude4");
            return (Criteria) this;
        }

        public Criteria andLatitude4LessThanOrEqualTo(Double value) {
            addCriterion("LATITUDE4 <=", value, "latitude4");
            return (Criteria) this;
        }

        public Criteria andLatitude4In(List<Double> values) {
            addCriterion("LATITUDE4 in", values, "latitude4");
            return (Criteria) this;
        }

        public Criteria andLatitude4NotIn(List<Double> values) {
            addCriterion("LATITUDE4 not in", values, "latitude4");
            return (Criteria) this;
        }

        public Criteria andLatitude4Between(Double value1, Double value2) {
            addCriterion("LATITUDE4 between", value1, value2, "latitude4");
            return (Criteria) this;
        }

        public Criteria andLatitude4NotBetween(Double value1, Double value2) {
            addCriterion("LATITUDE4 not between", value1, value2, "latitude4");
            return (Criteria) this;
        }

        public Criteria andConstructionTypeIsNull() {
            addCriterion("construction_type is null");
            return (Criteria) this;
        }

        public Criteria andConstructionTypeIsNotNull() {
            addCriterion("construction_type is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionTypeEqualTo(String value) {
            addCriterion("construction_type =", value, "constructionType");
            return (Criteria) this;
        }

        public Criteria andConstructionTypeNotEqualTo(String value) {
            addCriterion("construction_type <>", value, "constructionType");
            return (Criteria) this;
        }

        public Criteria andConstructionTypeGreaterThan(String value) {
            addCriterion("construction_type >", value, "constructionType");
            return (Criteria) this;
        }

        public Criteria andConstructionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("construction_type >=", value, "constructionType");
            return (Criteria) this;
        }

        public Criteria andConstructionTypeLessThan(String value) {
            addCriterion("construction_type <", value, "constructionType");
            return (Criteria) this;
        }

        public Criteria andConstructionTypeLessThanOrEqualTo(String value) {
            addCriterion("construction_type <=", value, "constructionType");
            return (Criteria) this;
        }

        public Criteria andConstructionTypeLike(String value) {
            addCriterion("construction_type like", value, "constructionType");
            return (Criteria) this;
        }

        public Criteria andConstructionTypeNotLike(String value) {
            addCriterion("construction_type not like", value, "constructionType");
            return (Criteria) this;
        }

        public Criteria andConstructionTypeIn(List<String> values) {
            addCriterion("construction_type in", values, "constructionType");
            return (Criteria) this;
        }

        public Criteria andConstructionTypeNotIn(List<String> values) {
            addCriterion("construction_type not in", values, "constructionType");
            return (Criteria) this;
        }

        public Criteria andConstructionTypeBetween(String value1, String value2) {
            addCriterion("construction_type between", value1, value2, "constructionType");
            return (Criteria) this;
        }

        public Criteria andConstructionTypeNotBetween(String value1, String value2) {
            addCriterion("construction_type not between", value1, value2, "constructionType");
            return (Criteria) this;
        }

        public Criteria andFinishdateIsNull() {
            addCriterion("finishdate is null");
            return (Criteria) this;
        }

        public Criteria andFinishdateIsNotNull() {
            addCriterion("finishdate is not null");
            return (Criteria) this;
        }

        public Criteria andFinishdateEqualTo(Date value) {
            addCriterionForJDBCDate("finishdate =", value, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("finishdate <>", value, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateGreaterThan(Date value) {
            addCriterionForJDBCDate("finishdate >", value, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("finishdate >=", value, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateLessThan(Date value) {
            addCriterionForJDBCDate("finishdate <", value, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("finishdate <=", value, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateIn(List<Date> values) {
            addCriterionForJDBCDate("finishdate in", values, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("finishdate not in", values, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("finishdate between", value1, value2, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("finishdate not between", value1, value2, "finishdate");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
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