package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class GridDetailedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GridDetailedExample() {
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

        public Criteria andGrididIsNull() {
            addCriterion("gridid is null");
            return (Criteria) this;
        }

        public Criteria andGrididIsNotNull() {
            addCriterion("gridid is not null");
            return (Criteria) this;
        }

        public Criteria andGrididEqualTo(Integer value) {
            addCriterion("gridid =", value, "gridid");
            return (Criteria) this;
        }

        public Criteria andGrididNotEqualTo(Integer value) {
            addCriterion("gridid <>", value, "gridid");
            return (Criteria) this;
        }

        public Criteria andGrididGreaterThan(Integer value) {
            addCriterion("gridid >", value, "gridid");
            return (Criteria) this;
        }

        public Criteria andGrididGreaterThanOrEqualTo(Integer value) {
            addCriterion("gridid >=", value, "gridid");
            return (Criteria) this;
        }

        public Criteria andGrididLessThan(Integer value) {
            addCriterion("gridid <", value, "gridid");
            return (Criteria) this;
        }

        public Criteria andGrididLessThanOrEqualTo(Integer value) {
            addCriterion("gridid <=", value, "gridid");
            return (Criteria) this;
        }

        public Criteria andGrididIn(List<Integer> values) {
            addCriterion("gridid in", values, "gridid");
            return (Criteria) this;
        }

        public Criteria andGrididNotIn(List<Integer> values) {
            addCriterion("gridid not in", values, "gridid");
            return (Criteria) this;
        }

        public Criteria andGrididBetween(Integer value1, Integer value2) {
            addCriterion("gridid between", value1, value2, "gridid");
            return (Criteria) this;
        }

        public Criteria andGrididNotBetween(Integer value1, Integer value2) {
            addCriterion("gridid not between", value1, value2, "gridid");
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

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andRowIsNull() {
            addCriterion("row is null");
            return (Criteria) this;
        }

        public Criteria andRowIsNotNull() {
            addCriterion("row is not null");
            return (Criteria) this;
        }

        public Criteria andRowEqualTo(Integer value) {
            addCriterion("row =", value, "row");
            return (Criteria) this;
        }

        public Criteria andRowNotEqualTo(Integer value) {
            addCriterion("row <>", value, "row");
            return (Criteria) this;
        }

        public Criteria andRowGreaterThan(Integer value) {
            addCriterion("row >", value, "row");
            return (Criteria) this;
        }

        public Criteria andRowGreaterThanOrEqualTo(Integer value) {
            addCriterion("row >=", value, "row");
            return (Criteria) this;
        }

        public Criteria andRowLessThan(Integer value) {
            addCriterion("row <", value, "row");
            return (Criteria) this;
        }

        public Criteria andRowLessThanOrEqualTo(Integer value) {
            addCriterion("row <=", value, "row");
            return (Criteria) this;
        }

        public Criteria andRowIn(List<Integer> values) {
            addCriterion("row in", values, "row");
            return (Criteria) this;
        }

        public Criteria andRowNotIn(List<Integer> values) {
            addCriterion("row not in", values, "row");
            return (Criteria) this;
        }

        public Criteria andRowBetween(Integer value1, Integer value2) {
            addCriterion("row between", value1, value2, "row");
            return (Criteria) this;
        }

        public Criteria andRowNotBetween(Integer value1, Integer value2) {
            addCriterion("row not between", value1, value2, "row");
            return (Criteria) this;
        }

        public Criteria andColIsNull() {
            addCriterion("col is null");
            return (Criteria) this;
        }

        public Criteria andColIsNotNull() {
            addCriterion("col is not null");
            return (Criteria) this;
        }

        public Criteria andColEqualTo(Integer value) {
            addCriterion("col =", value, "col");
            return (Criteria) this;
        }

        public Criteria andColNotEqualTo(Integer value) {
            addCriterion("col <>", value, "col");
            return (Criteria) this;
        }

        public Criteria andColGreaterThan(Integer value) {
            addCriterion("col >", value, "col");
            return (Criteria) this;
        }

        public Criteria andColGreaterThanOrEqualTo(Integer value) {
            addCriterion("col >=", value, "col");
            return (Criteria) this;
        }

        public Criteria andColLessThan(Integer value) {
            addCriterion("col <", value, "col");
            return (Criteria) this;
        }

        public Criteria andColLessThanOrEqualTo(Integer value) {
            addCriterion("col <=", value, "col");
            return (Criteria) this;
        }

        public Criteria andColIn(List<Integer> values) {
            addCriterion("col in", values, "col");
            return (Criteria) this;
        }

        public Criteria andColNotIn(List<Integer> values) {
            addCriterion("col not in", values, "col");
            return (Criteria) this;
        }

        public Criteria andColBetween(Integer value1, Integer value2) {
            addCriterion("col between", value1, value2, "col");
            return (Criteria) this;
        }

        public Criteria andColNotBetween(Integer value1, Integer value2) {
            addCriterion("col not between", value1, value2, "col");
            return (Criteria) this;
        }

        public Criteria andPm10a1IsNull() {
            addCriterion("pm10A1 is null");
            return (Criteria) this;
        }

        public Criteria andPm10a1IsNotNull() {
            addCriterion("pm10A1 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10a1EqualTo(Double value) {
            addCriterion("pm10A1 =", value, "pm10a1");
            return (Criteria) this;
        }

        public Criteria andPm10a1NotEqualTo(Double value) {
            addCriterion("pm10A1 <>", value, "pm10a1");
            return (Criteria) this;
        }

        public Criteria andPm10a1GreaterThan(Double value) {
            addCriterion("pm10A1 >", value, "pm10a1");
            return (Criteria) this;
        }

        public Criteria andPm10a1GreaterThanOrEqualTo(Double value) {
            addCriterion("pm10A1 >=", value, "pm10a1");
            return (Criteria) this;
        }

        public Criteria andPm10a1LessThan(Double value) {
            addCriterion("pm10A1 <", value, "pm10a1");
            return (Criteria) this;
        }

        public Criteria andPm10a1LessThanOrEqualTo(Double value) {
            addCriterion("pm10A1 <=", value, "pm10a1");
            return (Criteria) this;
        }

        public Criteria andPm10a1In(List<Double> values) {
            addCriterion("pm10A1 in", values, "pm10a1");
            return (Criteria) this;
        }

        public Criteria andPm10a1NotIn(List<Double> values) {
            addCriterion("pm10A1 not in", values, "pm10a1");
            return (Criteria) this;
        }

        public Criteria andPm10a1Between(Double value1, Double value2) {
            addCriterion("pm10A1 between", value1, value2, "pm10a1");
            return (Criteria) this;
        }

        public Criteria andPm10a1NotBetween(Double value1, Double value2) {
            addCriterion("pm10A1 not between", value1, value2, "pm10a1");
            return (Criteria) this;
        }

        public Criteria andPm10a2IsNull() {
            addCriterion("pm10A2 is null");
            return (Criteria) this;
        }

        public Criteria andPm10a2IsNotNull() {
            addCriterion("pm10A2 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10a2EqualTo(Double value) {
            addCriterion("pm10A2 =", value, "pm10a2");
            return (Criteria) this;
        }

        public Criteria andPm10a2NotEqualTo(Double value) {
            addCriterion("pm10A2 <>", value, "pm10a2");
            return (Criteria) this;
        }

        public Criteria andPm10a2GreaterThan(Double value) {
            addCriterion("pm10A2 >", value, "pm10a2");
            return (Criteria) this;
        }

        public Criteria andPm10a2GreaterThanOrEqualTo(Double value) {
            addCriterion("pm10A2 >=", value, "pm10a2");
            return (Criteria) this;
        }

        public Criteria andPm10a2LessThan(Double value) {
            addCriterion("pm10A2 <", value, "pm10a2");
            return (Criteria) this;
        }

        public Criteria andPm10a2LessThanOrEqualTo(Double value) {
            addCriterion("pm10A2 <=", value, "pm10a2");
            return (Criteria) this;
        }

        public Criteria andPm10a2In(List<Double> values) {
            addCriterion("pm10A2 in", values, "pm10a2");
            return (Criteria) this;
        }

        public Criteria andPm10a2NotIn(List<Double> values) {
            addCriterion("pm10A2 not in", values, "pm10a2");
            return (Criteria) this;
        }

        public Criteria andPm10a2Between(Double value1, Double value2) {
            addCriterion("pm10A2 between", value1, value2, "pm10a2");
            return (Criteria) this;
        }

        public Criteria andPm10a2NotBetween(Double value1, Double value2) {
            addCriterion("pm10A2 not between", value1, value2, "pm10a2");
            return (Criteria) this;
        }

        public Criteria andPm10a3IsNull() {
            addCriterion("pm10A3 is null");
            return (Criteria) this;
        }

        public Criteria andPm10a3IsNotNull() {
            addCriterion("pm10A3 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10a3EqualTo(Double value) {
            addCriterion("pm10A3 =", value, "pm10a3");
            return (Criteria) this;
        }

        public Criteria andPm10a3NotEqualTo(Double value) {
            addCriterion("pm10A3 <>", value, "pm10a3");
            return (Criteria) this;
        }

        public Criteria andPm10a3GreaterThan(Double value) {
            addCriterion("pm10A3 >", value, "pm10a3");
            return (Criteria) this;
        }

        public Criteria andPm10a3GreaterThanOrEqualTo(Double value) {
            addCriterion("pm10A3 >=", value, "pm10a3");
            return (Criteria) this;
        }

        public Criteria andPm10a3LessThan(Double value) {
            addCriterion("pm10A3 <", value, "pm10a3");
            return (Criteria) this;
        }

        public Criteria andPm10a3LessThanOrEqualTo(Double value) {
            addCriterion("pm10A3 <=", value, "pm10a3");
            return (Criteria) this;
        }

        public Criteria andPm10a3In(List<Double> values) {
            addCriterion("pm10A3 in", values, "pm10a3");
            return (Criteria) this;
        }

        public Criteria andPm10a3NotIn(List<Double> values) {
            addCriterion("pm10A3 not in", values, "pm10a3");
            return (Criteria) this;
        }

        public Criteria andPm10a3Between(Double value1, Double value2) {
            addCriterion("pm10A3 between", value1, value2, "pm10a3");
            return (Criteria) this;
        }

        public Criteria andPm10a3NotBetween(Double value1, Double value2) {
            addCriterion("pm10A3 not between", value1, value2, "pm10a3");
            return (Criteria) this;
        }

        public Criteria andPm10a4IsNull() {
            addCriterion("pm10A4 is null");
            return (Criteria) this;
        }

        public Criteria andPm10a4IsNotNull() {
            addCriterion("pm10A4 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10a4EqualTo(Double value) {
            addCriterion("pm10A4 =", value, "pm10a4");
            return (Criteria) this;
        }

        public Criteria andPm10a4NotEqualTo(Double value) {
            addCriterion("pm10A4 <>", value, "pm10a4");
            return (Criteria) this;
        }

        public Criteria andPm10a4GreaterThan(Double value) {
            addCriterion("pm10A4 >", value, "pm10a4");
            return (Criteria) this;
        }

        public Criteria andPm10a4GreaterThanOrEqualTo(Double value) {
            addCriterion("pm10A4 >=", value, "pm10a4");
            return (Criteria) this;
        }

        public Criteria andPm10a4LessThan(Double value) {
            addCriterion("pm10A4 <", value, "pm10a4");
            return (Criteria) this;
        }

        public Criteria andPm10a4LessThanOrEqualTo(Double value) {
            addCriterion("pm10A4 <=", value, "pm10a4");
            return (Criteria) this;
        }

        public Criteria andPm10a4In(List<Double> values) {
            addCriterion("pm10A4 in", values, "pm10a4");
            return (Criteria) this;
        }

        public Criteria andPm10a4NotIn(List<Double> values) {
            addCriterion("pm10A4 not in", values, "pm10a4");
            return (Criteria) this;
        }

        public Criteria andPm10a4Between(Double value1, Double value2) {
            addCriterion("pm10A4 between", value1, value2, "pm10a4");
            return (Criteria) this;
        }

        public Criteria andPm10a4NotBetween(Double value1, Double value2) {
            addCriterion("pm10A4 not between", value1, value2, "pm10a4");
            return (Criteria) this;
        }

        public Criteria andPm10a5IsNull() {
            addCriterion("pm10A5 is null");
            return (Criteria) this;
        }

        public Criteria andPm10a5IsNotNull() {
            addCriterion("pm10A5 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10a5EqualTo(Double value) {
            addCriterion("pm10A5 =", value, "pm10a5");
            return (Criteria) this;
        }

        public Criteria andPm10a5NotEqualTo(Double value) {
            addCriterion("pm10A5 <>", value, "pm10a5");
            return (Criteria) this;
        }

        public Criteria andPm10a5GreaterThan(Double value) {
            addCriterion("pm10A5 >", value, "pm10a5");
            return (Criteria) this;
        }

        public Criteria andPm10a5GreaterThanOrEqualTo(Double value) {
            addCriterion("pm10A5 >=", value, "pm10a5");
            return (Criteria) this;
        }

        public Criteria andPm10a5LessThan(Double value) {
            addCriterion("pm10A5 <", value, "pm10a5");
            return (Criteria) this;
        }

        public Criteria andPm10a5LessThanOrEqualTo(Double value) {
            addCriterion("pm10A5 <=", value, "pm10a5");
            return (Criteria) this;
        }

        public Criteria andPm10a5In(List<Double> values) {
            addCriterion("pm10A5 in", values, "pm10a5");
            return (Criteria) this;
        }

        public Criteria andPm10a5NotIn(List<Double> values) {
            addCriterion("pm10A5 not in", values, "pm10a5");
            return (Criteria) this;
        }

        public Criteria andPm10a5Between(Double value1, Double value2) {
            addCriterion("pm10A5 between", value1, value2, "pm10a5");
            return (Criteria) this;
        }

        public Criteria andPm10a5NotBetween(Double value1, Double value2) {
            addCriterion("pm10A5 not between", value1, value2, "pm10a5");
            return (Criteria) this;
        }

        public Criteria andPm10a6IsNull() {
            addCriterion("pm10A6 is null");
            return (Criteria) this;
        }

        public Criteria andPm10a6IsNotNull() {
            addCriterion("pm10A6 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10a6EqualTo(Double value) {
            addCriterion("pm10A6 =", value, "pm10a6");
            return (Criteria) this;
        }

        public Criteria andPm10a6NotEqualTo(Double value) {
            addCriterion("pm10A6 <>", value, "pm10a6");
            return (Criteria) this;
        }

        public Criteria andPm10a6GreaterThan(Double value) {
            addCriterion("pm10A6 >", value, "pm10a6");
            return (Criteria) this;
        }

        public Criteria andPm10a6GreaterThanOrEqualTo(Double value) {
            addCriterion("pm10A6 >=", value, "pm10a6");
            return (Criteria) this;
        }

        public Criteria andPm10a6LessThan(Double value) {
            addCriterion("pm10A6 <", value, "pm10a6");
            return (Criteria) this;
        }

        public Criteria andPm10a6LessThanOrEqualTo(Double value) {
            addCriterion("pm10A6 <=", value, "pm10a6");
            return (Criteria) this;
        }

        public Criteria andPm10a6In(List<Double> values) {
            addCriterion("pm10A6 in", values, "pm10a6");
            return (Criteria) this;
        }

        public Criteria andPm10a6NotIn(List<Double> values) {
            addCriterion("pm10A6 not in", values, "pm10a6");
            return (Criteria) this;
        }

        public Criteria andPm10a6Between(Double value1, Double value2) {
            addCriterion("pm10A6 between", value1, value2, "pm10a6");
            return (Criteria) this;
        }

        public Criteria andPm10a6NotBetween(Double value1, Double value2) {
            addCriterion("pm10A6 not between", value1, value2, "pm10a6");
            return (Criteria) this;
        }

        public Criteria andPm10a7IsNull() {
            addCriterion("pm10A7 is null");
            return (Criteria) this;
        }

        public Criteria andPm10a7IsNotNull() {
            addCriterion("pm10A7 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10a7EqualTo(Double value) {
            addCriterion("pm10A7 =", value, "pm10a7");
            return (Criteria) this;
        }

        public Criteria andPm10a7NotEqualTo(Double value) {
            addCriterion("pm10A7 <>", value, "pm10a7");
            return (Criteria) this;
        }

        public Criteria andPm10a7GreaterThan(Double value) {
            addCriterion("pm10A7 >", value, "pm10a7");
            return (Criteria) this;
        }

        public Criteria andPm10a7GreaterThanOrEqualTo(Double value) {
            addCriterion("pm10A7 >=", value, "pm10a7");
            return (Criteria) this;
        }

        public Criteria andPm10a7LessThan(Double value) {
            addCriterion("pm10A7 <", value, "pm10a7");
            return (Criteria) this;
        }

        public Criteria andPm10a7LessThanOrEqualTo(Double value) {
            addCriterion("pm10A7 <=", value, "pm10a7");
            return (Criteria) this;
        }

        public Criteria andPm10a7In(List<Double> values) {
            addCriterion("pm10A7 in", values, "pm10a7");
            return (Criteria) this;
        }

        public Criteria andPm10a7NotIn(List<Double> values) {
            addCriterion("pm10A7 not in", values, "pm10a7");
            return (Criteria) this;
        }

        public Criteria andPm10a7Between(Double value1, Double value2) {
            addCriterion("pm10A7 between", value1, value2, "pm10a7");
            return (Criteria) this;
        }

        public Criteria andPm10a7NotBetween(Double value1, Double value2) {
            addCriterion("pm10A7 not between", value1, value2, "pm10a7");
            return (Criteria) this;
        }

        public Criteria andPm10a8IsNull() {
            addCriterion("pm10A8 is null");
            return (Criteria) this;
        }

        public Criteria andPm10a8IsNotNull() {
            addCriterion("pm10A8 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10a8EqualTo(Double value) {
            addCriterion("pm10A8 =", value, "pm10a8");
            return (Criteria) this;
        }

        public Criteria andPm10a8NotEqualTo(Double value) {
            addCriterion("pm10A8 <>", value, "pm10a8");
            return (Criteria) this;
        }

        public Criteria andPm10a8GreaterThan(Double value) {
            addCriterion("pm10A8 >", value, "pm10a8");
            return (Criteria) this;
        }

        public Criteria andPm10a8GreaterThanOrEqualTo(Double value) {
            addCriterion("pm10A8 >=", value, "pm10a8");
            return (Criteria) this;
        }

        public Criteria andPm10a8LessThan(Double value) {
            addCriterion("pm10A8 <", value, "pm10a8");
            return (Criteria) this;
        }

        public Criteria andPm10a8LessThanOrEqualTo(Double value) {
            addCriterion("pm10A8 <=", value, "pm10a8");
            return (Criteria) this;
        }

        public Criteria andPm10a8In(List<Double> values) {
            addCriterion("pm10A8 in", values, "pm10a8");
            return (Criteria) this;
        }

        public Criteria andPm10a8NotIn(List<Double> values) {
            addCriterion("pm10A8 not in", values, "pm10a8");
            return (Criteria) this;
        }

        public Criteria andPm10a8Between(Double value1, Double value2) {
            addCriterion("pm10A8 between", value1, value2, "pm10a8");
            return (Criteria) this;
        }

        public Criteria andPm10a8NotBetween(Double value1, Double value2) {
            addCriterion("pm10A8 not between", value1, value2, "pm10a8");
            return (Criteria) this;
        }

        public Criteria andPm10a9IsNull() {
            addCriterion("pm10A9 is null");
            return (Criteria) this;
        }

        public Criteria andPm10a9IsNotNull() {
            addCriterion("pm10A9 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10a9EqualTo(Double value) {
            addCriterion("pm10A9 =", value, "pm10a9");
            return (Criteria) this;
        }

        public Criteria andPm10a9NotEqualTo(Double value) {
            addCriterion("pm10A9 <>", value, "pm10a9");
            return (Criteria) this;
        }

        public Criteria andPm10a9GreaterThan(Double value) {
            addCriterion("pm10A9 >", value, "pm10a9");
            return (Criteria) this;
        }

        public Criteria andPm10a9GreaterThanOrEqualTo(Double value) {
            addCriterion("pm10A9 >=", value, "pm10a9");
            return (Criteria) this;
        }

        public Criteria andPm10a9LessThan(Double value) {
            addCriterion("pm10A9 <", value, "pm10a9");
            return (Criteria) this;
        }

        public Criteria andPm10a9LessThanOrEqualTo(Double value) {
            addCriterion("pm10A9 <=", value, "pm10a9");
            return (Criteria) this;
        }

        public Criteria andPm10a9In(List<Double> values) {
            addCriterion("pm10A9 in", values, "pm10a9");
            return (Criteria) this;
        }

        public Criteria andPm10a9NotIn(List<Double> values) {
            addCriterion("pm10A9 not in", values, "pm10a9");
            return (Criteria) this;
        }

        public Criteria andPm10a9Between(Double value1, Double value2) {
            addCriterion("pm10A9 between", value1, value2, "pm10a9");
            return (Criteria) this;
        }

        public Criteria andPm10a9NotBetween(Double value1, Double value2) {
            addCriterion("pm10A9 not between", value1, value2, "pm10a9");
            return (Criteria) this;
        }

        public Criteria andPm10a10IsNull() {
            addCriterion("pm10A10 is null");
            return (Criteria) this;
        }

        public Criteria andPm10a10IsNotNull() {
            addCriterion("pm10A10 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10a10EqualTo(Double value) {
            addCriterion("pm10A10 =", value, "pm10a10");
            return (Criteria) this;
        }

        public Criteria andPm10a10NotEqualTo(Double value) {
            addCriterion("pm10A10 <>", value, "pm10a10");
            return (Criteria) this;
        }

        public Criteria andPm10a10GreaterThan(Double value) {
            addCriterion("pm10A10 >", value, "pm10a10");
            return (Criteria) this;
        }

        public Criteria andPm10a10GreaterThanOrEqualTo(Double value) {
            addCriterion("pm10A10 >=", value, "pm10a10");
            return (Criteria) this;
        }

        public Criteria andPm10a10LessThan(Double value) {
            addCriterion("pm10A10 <", value, "pm10a10");
            return (Criteria) this;
        }

        public Criteria andPm10a10LessThanOrEqualTo(Double value) {
            addCriterion("pm10A10 <=", value, "pm10a10");
            return (Criteria) this;
        }

        public Criteria andPm10a10In(List<Double> values) {
            addCriterion("pm10A10 in", values, "pm10a10");
            return (Criteria) this;
        }

        public Criteria andPm10a10NotIn(List<Double> values) {
            addCriterion("pm10A10 not in", values, "pm10a10");
            return (Criteria) this;
        }

        public Criteria andPm10a10Between(Double value1, Double value2) {
            addCriterion("pm10A10 between", value1, value2, "pm10a10");
            return (Criteria) this;
        }

        public Criteria andPm10a10NotBetween(Double value1, Double value2) {
            addCriterion("pm10A10 not between", value1, value2, "pm10a10");
            return (Criteria) this;
        }

        public Criteria andPm10a11IsNull() {
            addCriterion("pm10A11 is null");
            return (Criteria) this;
        }

        public Criteria andPm10a11IsNotNull() {
            addCriterion("pm10A11 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10a11EqualTo(Double value) {
            addCriterion("pm10A11 =", value, "pm10a11");
            return (Criteria) this;
        }

        public Criteria andPm10a11NotEqualTo(Double value) {
            addCriterion("pm10A11 <>", value, "pm10a11");
            return (Criteria) this;
        }

        public Criteria andPm10a11GreaterThan(Double value) {
            addCriterion("pm10A11 >", value, "pm10a11");
            return (Criteria) this;
        }

        public Criteria andPm10a11GreaterThanOrEqualTo(Double value) {
            addCriterion("pm10A11 >=", value, "pm10a11");
            return (Criteria) this;
        }

        public Criteria andPm10a11LessThan(Double value) {
            addCriterion("pm10A11 <", value, "pm10a11");
            return (Criteria) this;
        }

        public Criteria andPm10a11LessThanOrEqualTo(Double value) {
            addCriterion("pm10A11 <=", value, "pm10a11");
            return (Criteria) this;
        }

        public Criteria andPm10a11In(List<Double> values) {
            addCriterion("pm10A11 in", values, "pm10a11");
            return (Criteria) this;
        }

        public Criteria andPm10a11NotIn(List<Double> values) {
            addCriterion("pm10A11 not in", values, "pm10a11");
            return (Criteria) this;
        }

        public Criteria andPm10a11Between(Double value1, Double value2) {
            addCriterion("pm10A11 between", value1, value2, "pm10a11");
            return (Criteria) this;
        }

        public Criteria andPm10a11NotBetween(Double value1, Double value2) {
            addCriterion("pm10A11 not between", value1, value2, "pm10a11");
            return (Criteria) this;
        }

        public Criteria andPm10a12IsNull() {
            addCriterion("pm10A12 is null");
            return (Criteria) this;
        }

        public Criteria andPm10a12IsNotNull() {
            addCriterion("pm10A12 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10a12EqualTo(Double value) {
            addCriterion("pm10A12 =", value, "pm10a12");
            return (Criteria) this;
        }

        public Criteria andPm10a12NotEqualTo(Double value) {
            addCriterion("pm10A12 <>", value, "pm10a12");
            return (Criteria) this;
        }

        public Criteria andPm10a12GreaterThan(Double value) {
            addCriterion("pm10A12 >", value, "pm10a12");
            return (Criteria) this;
        }

        public Criteria andPm10a12GreaterThanOrEqualTo(Double value) {
            addCriterion("pm10A12 >=", value, "pm10a12");
            return (Criteria) this;
        }

        public Criteria andPm10a12LessThan(Double value) {
            addCriterion("pm10A12 <", value, "pm10a12");
            return (Criteria) this;
        }

        public Criteria andPm10a12LessThanOrEqualTo(Double value) {
            addCriterion("pm10A12 <=", value, "pm10a12");
            return (Criteria) this;
        }

        public Criteria andPm10a12In(List<Double> values) {
            addCriterion("pm10A12 in", values, "pm10a12");
            return (Criteria) this;
        }

        public Criteria andPm10a12NotIn(List<Double> values) {
            addCriterion("pm10A12 not in", values, "pm10a12");
            return (Criteria) this;
        }

        public Criteria andPm10a12Between(Double value1, Double value2) {
            addCriterion("pm10A12 between", value1, value2, "pm10a12");
            return (Criteria) this;
        }

        public Criteria andPm10a12NotBetween(Double value1, Double value2) {
            addCriterion("pm10A12 not between", value1, value2, "pm10a12");
            return (Criteria) this;
        }

        public Criteria andPm10a13IsNull() {
            addCriterion("pm10A13 is null");
            return (Criteria) this;
        }

        public Criteria andPm10a13IsNotNull() {
            addCriterion("pm10A13 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10a13EqualTo(Double value) {
            addCriterion("pm10A13 =", value, "pm10a13");
            return (Criteria) this;
        }

        public Criteria andPm10a13NotEqualTo(Double value) {
            addCriterion("pm10A13 <>", value, "pm10a13");
            return (Criteria) this;
        }

        public Criteria andPm10a13GreaterThan(Double value) {
            addCriterion("pm10A13 >", value, "pm10a13");
            return (Criteria) this;
        }

        public Criteria andPm10a13GreaterThanOrEqualTo(Double value) {
            addCriterion("pm10A13 >=", value, "pm10a13");
            return (Criteria) this;
        }

        public Criteria andPm10a13LessThan(Double value) {
            addCriterion("pm10A13 <", value, "pm10a13");
            return (Criteria) this;
        }

        public Criteria andPm10a13LessThanOrEqualTo(Double value) {
            addCriterion("pm10A13 <=", value, "pm10a13");
            return (Criteria) this;
        }

        public Criteria andPm10a13In(List<Double> values) {
            addCriterion("pm10A13 in", values, "pm10a13");
            return (Criteria) this;
        }

        public Criteria andPm10a13NotIn(List<Double> values) {
            addCriterion("pm10A13 not in", values, "pm10a13");
            return (Criteria) this;
        }

        public Criteria andPm10a13Between(Double value1, Double value2) {
            addCriterion("pm10A13 between", value1, value2, "pm10a13");
            return (Criteria) this;
        }

        public Criteria andPm10a13NotBetween(Double value1, Double value2) {
            addCriterion("pm10A13 not between", value1, value2, "pm10a13");
            return (Criteria) this;
        }

        public Criteria andPm10a14IsNull() {
            addCriterion("pm10A14 is null");
            return (Criteria) this;
        }

        public Criteria andPm10a14IsNotNull() {
            addCriterion("pm10A14 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10a14EqualTo(Double value) {
            addCriterion("pm10A14 =", value, "pm10a14");
            return (Criteria) this;
        }

        public Criteria andPm10a14NotEqualTo(Double value) {
            addCriterion("pm10A14 <>", value, "pm10a14");
            return (Criteria) this;
        }

        public Criteria andPm10a14GreaterThan(Double value) {
            addCriterion("pm10A14 >", value, "pm10a14");
            return (Criteria) this;
        }

        public Criteria andPm10a14GreaterThanOrEqualTo(Double value) {
            addCriterion("pm10A14 >=", value, "pm10a14");
            return (Criteria) this;
        }

        public Criteria andPm10a14LessThan(Double value) {
            addCriterion("pm10A14 <", value, "pm10a14");
            return (Criteria) this;
        }

        public Criteria andPm10a14LessThanOrEqualTo(Double value) {
            addCriterion("pm10A14 <=", value, "pm10a14");
            return (Criteria) this;
        }

        public Criteria andPm10a14In(List<Double> values) {
            addCriterion("pm10A14 in", values, "pm10a14");
            return (Criteria) this;
        }

        public Criteria andPm10a14NotIn(List<Double> values) {
            addCriterion("pm10A14 not in", values, "pm10a14");
            return (Criteria) this;
        }

        public Criteria andPm10a14Between(Double value1, Double value2) {
            addCriterion("pm10A14 between", value1, value2, "pm10a14");
            return (Criteria) this;
        }

        public Criteria andPm10a14NotBetween(Double value1, Double value2) {
            addCriterion("pm10A14 not between", value1, value2, "pm10a14");
            return (Criteria) this;
        }

        public Criteria andPm10a15IsNull() {
            addCriterion("pm10A15 is null");
            return (Criteria) this;
        }

        public Criteria andPm10a15IsNotNull() {
            addCriterion("pm10A15 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10a15EqualTo(Double value) {
            addCriterion("pm10A15 =", value, "pm10a15");
            return (Criteria) this;
        }

        public Criteria andPm10a15NotEqualTo(Double value) {
            addCriterion("pm10A15 <>", value, "pm10a15");
            return (Criteria) this;
        }

        public Criteria andPm10a15GreaterThan(Double value) {
            addCriterion("pm10A15 >", value, "pm10a15");
            return (Criteria) this;
        }

        public Criteria andPm10a15GreaterThanOrEqualTo(Double value) {
            addCriterion("pm10A15 >=", value, "pm10a15");
            return (Criteria) this;
        }

        public Criteria andPm10a15LessThan(Double value) {
            addCriterion("pm10A15 <", value, "pm10a15");
            return (Criteria) this;
        }

        public Criteria andPm10a15LessThanOrEqualTo(Double value) {
            addCriterion("pm10A15 <=", value, "pm10a15");
            return (Criteria) this;
        }

        public Criteria andPm10a15In(List<Double> values) {
            addCriterion("pm10A15 in", values, "pm10a15");
            return (Criteria) this;
        }

        public Criteria andPm10a15NotIn(List<Double> values) {
            addCriterion("pm10A15 not in", values, "pm10a15");
            return (Criteria) this;
        }

        public Criteria andPm10a15Between(Double value1, Double value2) {
            addCriterion("pm10A15 between", value1, value2, "pm10a15");
            return (Criteria) this;
        }

        public Criteria andPm10a15NotBetween(Double value1, Double value2) {
            addCriterion("pm10A15 not between", value1, value2, "pm10a15");
            return (Criteria) this;
        }

        public Criteria andPm10a16IsNull() {
            addCriterion("pm10A16 is null");
            return (Criteria) this;
        }

        public Criteria andPm10a16IsNotNull() {
            addCriterion("pm10A16 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10a16EqualTo(Double value) {
            addCriterion("pm10A16 =", value, "pm10a16");
            return (Criteria) this;
        }

        public Criteria andPm10a16NotEqualTo(Double value) {
            addCriterion("pm10A16 <>", value, "pm10a16");
            return (Criteria) this;
        }

        public Criteria andPm10a16GreaterThan(Double value) {
            addCriterion("pm10A16 >", value, "pm10a16");
            return (Criteria) this;
        }

        public Criteria andPm10a16GreaterThanOrEqualTo(Double value) {
            addCriterion("pm10A16 >=", value, "pm10a16");
            return (Criteria) this;
        }

        public Criteria andPm10a16LessThan(Double value) {
            addCriterion("pm10A16 <", value, "pm10a16");
            return (Criteria) this;
        }

        public Criteria andPm10a16LessThanOrEqualTo(Double value) {
            addCriterion("pm10A16 <=", value, "pm10a16");
            return (Criteria) this;
        }

        public Criteria andPm10a16In(List<Double> values) {
            addCriterion("pm10A16 in", values, "pm10a16");
            return (Criteria) this;
        }

        public Criteria andPm10a16NotIn(List<Double> values) {
            addCriterion("pm10A16 not in", values, "pm10a16");
            return (Criteria) this;
        }

        public Criteria andPm10a16Between(Double value1, Double value2) {
            addCriterion("pm10A16 between", value1, value2, "pm10a16");
            return (Criteria) this;
        }

        public Criteria andPm10a16NotBetween(Double value1, Double value2) {
            addCriterion("pm10A16 not between", value1, value2, "pm10a16");
            return (Criteria) this;
        }

        public Criteria andPm10a17IsNull() {
            addCriterion("pm10A17 is null");
            return (Criteria) this;
        }

        public Criteria andPm10a17IsNotNull() {
            addCriterion("pm10A17 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10a17EqualTo(Double value) {
            addCriterion("pm10A17 =", value, "pm10a17");
            return (Criteria) this;
        }

        public Criteria andPm10a17NotEqualTo(Double value) {
            addCriterion("pm10A17 <>", value, "pm10a17");
            return (Criteria) this;
        }

        public Criteria andPm10a17GreaterThan(Double value) {
            addCriterion("pm10A17 >", value, "pm10a17");
            return (Criteria) this;
        }

        public Criteria andPm10a17GreaterThanOrEqualTo(Double value) {
            addCriterion("pm10A17 >=", value, "pm10a17");
            return (Criteria) this;
        }

        public Criteria andPm10a17LessThan(Double value) {
            addCriterion("pm10A17 <", value, "pm10a17");
            return (Criteria) this;
        }

        public Criteria andPm10a17LessThanOrEqualTo(Double value) {
            addCriterion("pm10A17 <=", value, "pm10a17");
            return (Criteria) this;
        }

        public Criteria andPm10a17In(List<Double> values) {
            addCriterion("pm10A17 in", values, "pm10a17");
            return (Criteria) this;
        }

        public Criteria andPm10a17NotIn(List<Double> values) {
            addCriterion("pm10A17 not in", values, "pm10a17");
            return (Criteria) this;
        }

        public Criteria andPm10a17Between(Double value1, Double value2) {
            addCriterion("pm10A17 between", value1, value2, "pm10a17");
            return (Criteria) this;
        }

        public Criteria andPm10a17NotBetween(Double value1, Double value2) {
            addCriterion("pm10A17 not between", value1, value2, "pm10a17");
            return (Criteria) this;
        }

        public Criteria andPm10a18IsNull() {
            addCriterion("pm10A18 is null");
            return (Criteria) this;
        }

        public Criteria andPm10a18IsNotNull() {
            addCriterion("pm10A18 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10a18EqualTo(Double value) {
            addCriterion("pm10A18 =", value, "pm10a18");
            return (Criteria) this;
        }

        public Criteria andPm10a18NotEqualTo(Double value) {
            addCriterion("pm10A18 <>", value, "pm10a18");
            return (Criteria) this;
        }

        public Criteria andPm10a18GreaterThan(Double value) {
            addCriterion("pm10A18 >", value, "pm10a18");
            return (Criteria) this;
        }

        public Criteria andPm10a18GreaterThanOrEqualTo(Double value) {
            addCriterion("pm10A18 >=", value, "pm10a18");
            return (Criteria) this;
        }

        public Criteria andPm10a18LessThan(Double value) {
            addCriterion("pm10A18 <", value, "pm10a18");
            return (Criteria) this;
        }

        public Criteria andPm10a18LessThanOrEqualTo(Double value) {
            addCriterion("pm10A18 <=", value, "pm10a18");
            return (Criteria) this;
        }

        public Criteria andPm10a18In(List<Double> values) {
            addCriterion("pm10A18 in", values, "pm10a18");
            return (Criteria) this;
        }

        public Criteria andPm10a18NotIn(List<Double> values) {
            addCriterion("pm10A18 not in", values, "pm10a18");
            return (Criteria) this;
        }

        public Criteria andPm10a18Between(Double value1, Double value2) {
            addCriterion("pm10A18 between", value1, value2, "pm10a18");
            return (Criteria) this;
        }

        public Criteria andPm10a18NotBetween(Double value1, Double value2) {
            addCriterion("pm10A18 not between", value1, value2, "pm10a18");
            return (Criteria) this;
        }

        public Criteria andPm10a19IsNull() {
            addCriterion("pm10A19 is null");
            return (Criteria) this;
        }

        public Criteria andPm10a19IsNotNull() {
            addCriterion("pm10A19 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10a19EqualTo(Double value) {
            addCriterion("pm10A19 =", value, "pm10a19");
            return (Criteria) this;
        }

        public Criteria andPm10a19NotEqualTo(Double value) {
            addCriterion("pm10A19 <>", value, "pm10a19");
            return (Criteria) this;
        }

        public Criteria andPm10a19GreaterThan(Double value) {
            addCriterion("pm10A19 >", value, "pm10a19");
            return (Criteria) this;
        }

        public Criteria andPm10a19GreaterThanOrEqualTo(Double value) {
            addCriterion("pm10A19 >=", value, "pm10a19");
            return (Criteria) this;
        }

        public Criteria andPm10a19LessThan(Double value) {
            addCriterion("pm10A19 <", value, "pm10a19");
            return (Criteria) this;
        }

        public Criteria andPm10a19LessThanOrEqualTo(Double value) {
            addCriterion("pm10A19 <=", value, "pm10a19");
            return (Criteria) this;
        }

        public Criteria andPm10a19In(List<Double> values) {
            addCriterion("pm10A19 in", values, "pm10a19");
            return (Criteria) this;
        }

        public Criteria andPm10a19NotIn(List<Double> values) {
            addCriterion("pm10A19 not in", values, "pm10a19");
            return (Criteria) this;
        }

        public Criteria andPm10a19Between(Double value1, Double value2) {
            addCriterion("pm10A19 between", value1, value2, "pm10a19");
            return (Criteria) this;
        }

        public Criteria andPm10a19NotBetween(Double value1, Double value2) {
            addCriterion("pm10A19 not between", value1, value2, "pm10a19");
            return (Criteria) this;
        }

        public Criteria andPm10a20IsNull() {
            addCriterion("pm10A20 is null");
            return (Criteria) this;
        }

        public Criteria andPm10a20IsNotNull() {
            addCriterion("pm10A20 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10a20EqualTo(Double value) {
            addCriterion("pm10A20 =", value, "pm10a20");
            return (Criteria) this;
        }

        public Criteria andPm10a20NotEqualTo(Double value) {
            addCriterion("pm10A20 <>", value, "pm10a20");
            return (Criteria) this;
        }

        public Criteria andPm10a20GreaterThan(Double value) {
            addCriterion("pm10A20 >", value, "pm10a20");
            return (Criteria) this;
        }

        public Criteria andPm10a20GreaterThanOrEqualTo(Double value) {
            addCriterion("pm10A20 >=", value, "pm10a20");
            return (Criteria) this;
        }

        public Criteria andPm10a20LessThan(Double value) {
            addCriterion("pm10A20 <", value, "pm10a20");
            return (Criteria) this;
        }

        public Criteria andPm10a20LessThanOrEqualTo(Double value) {
            addCriterion("pm10A20 <=", value, "pm10a20");
            return (Criteria) this;
        }

        public Criteria andPm10a20In(List<Double> values) {
            addCriterion("pm10A20 in", values, "pm10a20");
            return (Criteria) this;
        }

        public Criteria andPm10a20NotIn(List<Double> values) {
            addCriterion("pm10A20 not in", values, "pm10a20");
            return (Criteria) this;
        }

        public Criteria andPm10a20Between(Double value1, Double value2) {
            addCriterion("pm10A20 between", value1, value2, "pm10a20");
            return (Criteria) this;
        }

        public Criteria andPm10a20NotBetween(Double value1, Double value2) {
            addCriterion("pm10A20 not between", value1, value2, "pm10a20");
            return (Criteria) this;
        }

        public Criteria andPm10a21IsNull() {
            addCriterion("pm10A21 is null");
            return (Criteria) this;
        }

        public Criteria andPm10a21IsNotNull() {
            addCriterion("pm10A21 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10a21EqualTo(Double value) {
            addCriterion("pm10A21 =", value, "pm10a21");
            return (Criteria) this;
        }

        public Criteria andPm10a21NotEqualTo(Double value) {
            addCriterion("pm10A21 <>", value, "pm10a21");
            return (Criteria) this;
        }

        public Criteria andPm10a21GreaterThan(Double value) {
            addCriterion("pm10A21 >", value, "pm10a21");
            return (Criteria) this;
        }

        public Criteria andPm10a21GreaterThanOrEqualTo(Double value) {
            addCriterion("pm10A21 >=", value, "pm10a21");
            return (Criteria) this;
        }

        public Criteria andPm10a21LessThan(Double value) {
            addCriterion("pm10A21 <", value, "pm10a21");
            return (Criteria) this;
        }

        public Criteria andPm10a21LessThanOrEqualTo(Double value) {
            addCriterion("pm10A21 <=", value, "pm10a21");
            return (Criteria) this;
        }

        public Criteria andPm10a21In(List<Double> values) {
            addCriterion("pm10A21 in", values, "pm10a21");
            return (Criteria) this;
        }

        public Criteria andPm10a21NotIn(List<Double> values) {
            addCriterion("pm10A21 not in", values, "pm10a21");
            return (Criteria) this;
        }

        public Criteria andPm10a21Between(Double value1, Double value2) {
            addCriterion("pm10A21 between", value1, value2, "pm10a21");
            return (Criteria) this;
        }

        public Criteria andPm10a21NotBetween(Double value1, Double value2) {
            addCriterion("pm10A21 not between", value1, value2, "pm10a21");
            return (Criteria) this;
        }

        public Criteria andPm10a22IsNull() {
            addCriterion("pm10A22 is null");
            return (Criteria) this;
        }

        public Criteria andPm10a22IsNotNull() {
            addCriterion("pm10A22 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10a22EqualTo(Double value) {
            addCriterion("pm10A22 =", value, "pm10a22");
            return (Criteria) this;
        }

        public Criteria andPm10a22NotEqualTo(Double value) {
            addCriterion("pm10A22 <>", value, "pm10a22");
            return (Criteria) this;
        }

        public Criteria andPm10a22GreaterThan(Double value) {
            addCriterion("pm10A22 >", value, "pm10a22");
            return (Criteria) this;
        }

        public Criteria andPm10a22GreaterThanOrEqualTo(Double value) {
            addCriterion("pm10A22 >=", value, "pm10a22");
            return (Criteria) this;
        }

        public Criteria andPm10a22LessThan(Double value) {
            addCriterion("pm10A22 <", value, "pm10a22");
            return (Criteria) this;
        }

        public Criteria andPm10a22LessThanOrEqualTo(Double value) {
            addCriterion("pm10A22 <=", value, "pm10a22");
            return (Criteria) this;
        }

        public Criteria andPm10a22In(List<Double> values) {
            addCriterion("pm10A22 in", values, "pm10a22");
            return (Criteria) this;
        }

        public Criteria andPm10a22NotIn(List<Double> values) {
            addCriterion("pm10A22 not in", values, "pm10a22");
            return (Criteria) this;
        }

        public Criteria andPm10a22Between(Double value1, Double value2) {
            addCriterion("pm10A22 between", value1, value2, "pm10a22");
            return (Criteria) this;
        }

        public Criteria andPm10a22NotBetween(Double value1, Double value2) {
            addCriterion("pm10A22 not between", value1, value2, "pm10a22");
            return (Criteria) this;
        }

        public Criteria andPm10a23IsNull() {
            addCriterion("pm10A23 is null");
            return (Criteria) this;
        }

        public Criteria andPm10a23IsNotNull() {
            addCriterion("pm10A23 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10a23EqualTo(Double value) {
            addCriterion("pm10A23 =", value, "pm10a23");
            return (Criteria) this;
        }

        public Criteria andPm10a23NotEqualTo(Double value) {
            addCriterion("pm10A23 <>", value, "pm10a23");
            return (Criteria) this;
        }

        public Criteria andPm10a23GreaterThan(Double value) {
            addCriterion("pm10A23 >", value, "pm10a23");
            return (Criteria) this;
        }

        public Criteria andPm10a23GreaterThanOrEqualTo(Double value) {
            addCriterion("pm10A23 >=", value, "pm10a23");
            return (Criteria) this;
        }

        public Criteria andPm10a23LessThan(Double value) {
            addCriterion("pm10A23 <", value, "pm10a23");
            return (Criteria) this;
        }

        public Criteria andPm10a23LessThanOrEqualTo(Double value) {
            addCriterion("pm10A23 <=", value, "pm10a23");
            return (Criteria) this;
        }

        public Criteria andPm10a23In(List<Double> values) {
            addCriterion("pm10A23 in", values, "pm10a23");
            return (Criteria) this;
        }

        public Criteria andPm10a23NotIn(List<Double> values) {
            addCriterion("pm10A23 not in", values, "pm10a23");
            return (Criteria) this;
        }

        public Criteria andPm10a23Between(Double value1, Double value2) {
            addCriterion("pm10A23 between", value1, value2, "pm10a23");
            return (Criteria) this;
        }

        public Criteria andPm10a23NotBetween(Double value1, Double value2) {
            addCriterion("pm10A23 not between", value1, value2, "pm10a23");
            return (Criteria) this;
        }

        public Criteria andPm10a24IsNull() {
            addCriterion("pm10A24 is null");
            return (Criteria) this;
        }

        public Criteria andPm10a24IsNotNull() {
            addCriterion("pm10A24 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10a24EqualTo(Double value) {
            addCriterion("pm10A24 =", value, "pm10a24");
            return (Criteria) this;
        }

        public Criteria andPm10a24NotEqualTo(Double value) {
            addCriterion("pm10A24 <>", value, "pm10a24");
            return (Criteria) this;
        }

        public Criteria andPm10a24GreaterThan(Double value) {
            addCriterion("pm10A24 >", value, "pm10a24");
            return (Criteria) this;
        }

        public Criteria andPm10a24GreaterThanOrEqualTo(Double value) {
            addCriterion("pm10A24 >=", value, "pm10a24");
            return (Criteria) this;
        }

        public Criteria andPm10a24LessThan(Double value) {
            addCriterion("pm10A24 <", value, "pm10a24");
            return (Criteria) this;
        }

        public Criteria andPm10a24LessThanOrEqualTo(Double value) {
            addCriterion("pm10A24 <=", value, "pm10a24");
            return (Criteria) this;
        }

        public Criteria andPm10a24In(List<Double> values) {
            addCriterion("pm10A24 in", values, "pm10a24");
            return (Criteria) this;
        }

        public Criteria andPm10a24NotIn(List<Double> values) {
            addCriterion("pm10A24 not in", values, "pm10a24");
            return (Criteria) this;
        }

        public Criteria andPm10a24Between(Double value1, Double value2) {
            addCriterion("pm10A24 between", value1, value2, "pm10a24");
            return (Criteria) this;
        }

        public Criteria andPm10a24NotBetween(Double value1, Double value2) {
            addCriterion("pm10A24 not between", value1, value2, "pm10a24");
            return (Criteria) this;
        }

        public Criteria andPm25a1IsNull() {
            addCriterion("pm25A1 is null");
            return (Criteria) this;
        }

        public Criteria andPm25a1IsNotNull() {
            addCriterion("pm25A1 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25a1EqualTo(Double value) {
            addCriterion("pm25A1 =", value, "pm25a1");
            return (Criteria) this;
        }

        public Criteria andPm25a1NotEqualTo(Double value) {
            addCriterion("pm25A1 <>", value, "pm25a1");
            return (Criteria) this;
        }

        public Criteria andPm25a1GreaterThan(Double value) {
            addCriterion("pm25A1 >", value, "pm25a1");
            return (Criteria) this;
        }

        public Criteria andPm25a1GreaterThanOrEqualTo(Double value) {
            addCriterion("pm25A1 >=", value, "pm25a1");
            return (Criteria) this;
        }

        public Criteria andPm25a1LessThan(Double value) {
            addCriterion("pm25A1 <", value, "pm25a1");
            return (Criteria) this;
        }

        public Criteria andPm25a1LessThanOrEqualTo(Double value) {
            addCriterion("pm25A1 <=", value, "pm25a1");
            return (Criteria) this;
        }

        public Criteria andPm25a1In(List<Double> values) {
            addCriterion("pm25A1 in", values, "pm25a1");
            return (Criteria) this;
        }

        public Criteria andPm25a1NotIn(List<Double> values) {
            addCriterion("pm25A1 not in", values, "pm25a1");
            return (Criteria) this;
        }

        public Criteria andPm25a1Between(Double value1, Double value2) {
            addCriterion("pm25A1 between", value1, value2, "pm25a1");
            return (Criteria) this;
        }

        public Criteria andPm25a1NotBetween(Double value1, Double value2) {
            addCriterion("pm25A1 not between", value1, value2, "pm25a1");
            return (Criteria) this;
        }

        public Criteria andPm25a2IsNull() {
            addCriterion("pm25A2 is null");
            return (Criteria) this;
        }

        public Criteria andPm25a2IsNotNull() {
            addCriterion("pm25A2 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25a2EqualTo(Double value) {
            addCriterion("pm25A2 =", value, "pm25a2");
            return (Criteria) this;
        }

        public Criteria andPm25a2NotEqualTo(Double value) {
            addCriterion("pm25A2 <>", value, "pm25a2");
            return (Criteria) this;
        }

        public Criteria andPm25a2GreaterThan(Double value) {
            addCriterion("pm25A2 >", value, "pm25a2");
            return (Criteria) this;
        }

        public Criteria andPm25a2GreaterThanOrEqualTo(Double value) {
            addCriterion("pm25A2 >=", value, "pm25a2");
            return (Criteria) this;
        }

        public Criteria andPm25a2LessThan(Double value) {
            addCriterion("pm25A2 <", value, "pm25a2");
            return (Criteria) this;
        }

        public Criteria andPm25a2LessThanOrEqualTo(Double value) {
            addCriterion("pm25A2 <=", value, "pm25a2");
            return (Criteria) this;
        }

        public Criteria andPm25a2In(List<Double> values) {
            addCriterion("pm25A2 in", values, "pm25a2");
            return (Criteria) this;
        }

        public Criteria andPm25a2NotIn(List<Double> values) {
            addCriterion("pm25A2 not in", values, "pm25a2");
            return (Criteria) this;
        }

        public Criteria andPm25a2Between(Double value1, Double value2) {
            addCriterion("pm25A2 between", value1, value2, "pm25a2");
            return (Criteria) this;
        }

        public Criteria andPm25a2NotBetween(Double value1, Double value2) {
            addCriterion("pm25A2 not between", value1, value2, "pm25a2");
            return (Criteria) this;
        }

        public Criteria andPm25a3IsNull() {
            addCriterion("pm25A3 is null");
            return (Criteria) this;
        }

        public Criteria andPm25a3IsNotNull() {
            addCriterion("pm25A3 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25a3EqualTo(Double value) {
            addCriterion("pm25A3 =", value, "pm25a3");
            return (Criteria) this;
        }

        public Criteria andPm25a3NotEqualTo(Double value) {
            addCriterion("pm25A3 <>", value, "pm25a3");
            return (Criteria) this;
        }

        public Criteria andPm25a3GreaterThan(Double value) {
            addCriterion("pm25A3 >", value, "pm25a3");
            return (Criteria) this;
        }

        public Criteria andPm25a3GreaterThanOrEqualTo(Double value) {
            addCriterion("pm25A3 >=", value, "pm25a3");
            return (Criteria) this;
        }

        public Criteria andPm25a3LessThan(Double value) {
            addCriterion("pm25A3 <", value, "pm25a3");
            return (Criteria) this;
        }

        public Criteria andPm25a3LessThanOrEqualTo(Double value) {
            addCriterion("pm25A3 <=", value, "pm25a3");
            return (Criteria) this;
        }

        public Criteria andPm25a3In(List<Double> values) {
            addCriterion("pm25A3 in", values, "pm25a3");
            return (Criteria) this;
        }

        public Criteria andPm25a3NotIn(List<Double> values) {
            addCriterion("pm25A3 not in", values, "pm25a3");
            return (Criteria) this;
        }

        public Criteria andPm25a3Between(Double value1, Double value2) {
            addCriterion("pm25A3 between", value1, value2, "pm25a3");
            return (Criteria) this;
        }

        public Criteria andPm25a3NotBetween(Double value1, Double value2) {
            addCriterion("pm25A3 not between", value1, value2, "pm25a3");
            return (Criteria) this;
        }

        public Criteria andPm25a4IsNull() {
            addCriterion("pm25A4 is null");
            return (Criteria) this;
        }

        public Criteria andPm25a4IsNotNull() {
            addCriterion("pm25A4 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25a4EqualTo(Double value) {
            addCriterion("pm25A4 =", value, "pm25a4");
            return (Criteria) this;
        }

        public Criteria andPm25a4NotEqualTo(Double value) {
            addCriterion("pm25A4 <>", value, "pm25a4");
            return (Criteria) this;
        }

        public Criteria andPm25a4GreaterThan(Double value) {
            addCriterion("pm25A4 >", value, "pm25a4");
            return (Criteria) this;
        }

        public Criteria andPm25a4GreaterThanOrEqualTo(Double value) {
            addCriterion("pm25A4 >=", value, "pm25a4");
            return (Criteria) this;
        }

        public Criteria andPm25a4LessThan(Double value) {
            addCriterion("pm25A4 <", value, "pm25a4");
            return (Criteria) this;
        }

        public Criteria andPm25a4LessThanOrEqualTo(Double value) {
            addCriterion("pm25A4 <=", value, "pm25a4");
            return (Criteria) this;
        }

        public Criteria andPm25a4In(List<Double> values) {
            addCriterion("pm25A4 in", values, "pm25a4");
            return (Criteria) this;
        }

        public Criteria andPm25a4NotIn(List<Double> values) {
            addCriterion("pm25A4 not in", values, "pm25a4");
            return (Criteria) this;
        }

        public Criteria andPm25a4Between(Double value1, Double value2) {
            addCriterion("pm25A4 between", value1, value2, "pm25a4");
            return (Criteria) this;
        }

        public Criteria andPm25a4NotBetween(Double value1, Double value2) {
            addCriterion("pm25A4 not between", value1, value2, "pm25a4");
            return (Criteria) this;
        }

        public Criteria andPm25a5IsNull() {
            addCriterion("pm25A5 is null");
            return (Criteria) this;
        }

        public Criteria andPm25a5IsNotNull() {
            addCriterion("pm25A5 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25a5EqualTo(Double value) {
            addCriterion("pm25A5 =", value, "pm25a5");
            return (Criteria) this;
        }

        public Criteria andPm25a5NotEqualTo(Double value) {
            addCriterion("pm25A5 <>", value, "pm25a5");
            return (Criteria) this;
        }

        public Criteria andPm25a5GreaterThan(Double value) {
            addCriterion("pm25A5 >", value, "pm25a5");
            return (Criteria) this;
        }

        public Criteria andPm25a5GreaterThanOrEqualTo(Double value) {
            addCriterion("pm25A5 >=", value, "pm25a5");
            return (Criteria) this;
        }

        public Criteria andPm25a5LessThan(Double value) {
            addCriterion("pm25A5 <", value, "pm25a5");
            return (Criteria) this;
        }

        public Criteria andPm25a5LessThanOrEqualTo(Double value) {
            addCriterion("pm25A5 <=", value, "pm25a5");
            return (Criteria) this;
        }

        public Criteria andPm25a5In(List<Double> values) {
            addCriterion("pm25A5 in", values, "pm25a5");
            return (Criteria) this;
        }

        public Criteria andPm25a5NotIn(List<Double> values) {
            addCriterion("pm25A5 not in", values, "pm25a5");
            return (Criteria) this;
        }

        public Criteria andPm25a5Between(Double value1, Double value2) {
            addCriterion("pm25A5 between", value1, value2, "pm25a5");
            return (Criteria) this;
        }

        public Criteria andPm25a5NotBetween(Double value1, Double value2) {
            addCriterion("pm25A5 not between", value1, value2, "pm25a5");
            return (Criteria) this;
        }

        public Criteria andPm25a6IsNull() {
            addCriterion("pm25A6 is null");
            return (Criteria) this;
        }

        public Criteria andPm25a6IsNotNull() {
            addCriterion("pm25A6 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25a6EqualTo(Double value) {
            addCriterion("pm25A6 =", value, "pm25a6");
            return (Criteria) this;
        }

        public Criteria andPm25a6NotEqualTo(Double value) {
            addCriterion("pm25A6 <>", value, "pm25a6");
            return (Criteria) this;
        }

        public Criteria andPm25a6GreaterThan(Double value) {
            addCriterion("pm25A6 >", value, "pm25a6");
            return (Criteria) this;
        }

        public Criteria andPm25a6GreaterThanOrEqualTo(Double value) {
            addCriterion("pm25A6 >=", value, "pm25a6");
            return (Criteria) this;
        }

        public Criteria andPm25a6LessThan(Double value) {
            addCriterion("pm25A6 <", value, "pm25a6");
            return (Criteria) this;
        }

        public Criteria andPm25a6LessThanOrEqualTo(Double value) {
            addCriterion("pm25A6 <=", value, "pm25a6");
            return (Criteria) this;
        }

        public Criteria andPm25a6In(List<Double> values) {
            addCriterion("pm25A6 in", values, "pm25a6");
            return (Criteria) this;
        }

        public Criteria andPm25a6NotIn(List<Double> values) {
            addCriterion("pm25A6 not in", values, "pm25a6");
            return (Criteria) this;
        }

        public Criteria andPm25a6Between(Double value1, Double value2) {
            addCriterion("pm25A6 between", value1, value2, "pm25a6");
            return (Criteria) this;
        }

        public Criteria andPm25a6NotBetween(Double value1, Double value2) {
            addCriterion("pm25A6 not between", value1, value2, "pm25a6");
            return (Criteria) this;
        }

        public Criteria andPm25a7IsNull() {
            addCriterion("pm25A7 is null");
            return (Criteria) this;
        }

        public Criteria andPm25a7IsNotNull() {
            addCriterion("pm25A7 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25a7EqualTo(Double value) {
            addCriterion("pm25A7 =", value, "pm25a7");
            return (Criteria) this;
        }

        public Criteria andPm25a7NotEqualTo(Double value) {
            addCriterion("pm25A7 <>", value, "pm25a7");
            return (Criteria) this;
        }

        public Criteria andPm25a7GreaterThan(Double value) {
            addCriterion("pm25A7 >", value, "pm25a7");
            return (Criteria) this;
        }

        public Criteria andPm25a7GreaterThanOrEqualTo(Double value) {
            addCriterion("pm25A7 >=", value, "pm25a7");
            return (Criteria) this;
        }

        public Criteria andPm25a7LessThan(Double value) {
            addCriterion("pm25A7 <", value, "pm25a7");
            return (Criteria) this;
        }

        public Criteria andPm25a7LessThanOrEqualTo(Double value) {
            addCriterion("pm25A7 <=", value, "pm25a7");
            return (Criteria) this;
        }

        public Criteria andPm25a7In(List<Double> values) {
            addCriterion("pm25A7 in", values, "pm25a7");
            return (Criteria) this;
        }

        public Criteria andPm25a7NotIn(List<Double> values) {
            addCriterion("pm25A7 not in", values, "pm25a7");
            return (Criteria) this;
        }

        public Criteria andPm25a7Between(Double value1, Double value2) {
            addCriterion("pm25A7 between", value1, value2, "pm25a7");
            return (Criteria) this;
        }

        public Criteria andPm25a7NotBetween(Double value1, Double value2) {
            addCriterion("pm25A7 not between", value1, value2, "pm25a7");
            return (Criteria) this;
        }

        public Criteria andPm25a8IsNull() {
            addCriterion("pm25A8 is null");
            return (Criteria) this;
        }

        public Criteria andPm25a8IsNotNull() {
            addCriterion("pm25A8 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25a8EqualTo(Double value) {
            addCriterion("pm25A8 =", value, "pm25a8");
            return (Criteria) this;
        }

        public Criteria andPm25a8NotEqualTo(Double value) {
            addCriterion("pm25A8 <>", value, "pm25a8");
            return (Criteria) this;
        }

        public Criteria andPm25a8GreaterThan(Double value) {
            addCriterion("pm25A8 >", value, "pm25a8");
            return (Criteria) this;
        }

        public Criteria andPm25a8GreaterThanOrEqualTo(Double value) {
            addCriterion("pm25A8 >=", value, "pm25a8");
            return (Criteria) this;
        }

        public Criteria andPm25a8LessThan(Double value) {
            addCriterion("pm25A8 <", value, "pm25a8");
            return (Criteria) this;
        }

        public Criteria andPm25a8LessThanOrEqualTo(Double value) {
            addCriterion("pm25A8 <=", value, "pm25a8");
            return (Criteria) this;
        }

        public Criteria andPm25a8In(List<Double> values) {
            addCriterion("pm25A8 in", values, "pm25a8");
            return (Criteria) this;
        }

        public Criteria andPm25a8NotIn(List<Double> values) {
            addCriterion("pm25A8 not in", values, "pm25a8");
            return (Criteria) this;
        }

        public Criteria andPm25a8Between(Double value1, Double value2) {
            addCriterion("pm25A8 between", value1, value2, "pm25a8");
            return (Criteria) this;
        }

        public Criteria andPm25a8NotBetween(Double value1, Double value2) {
            addCriterion("pm25A8 not between", value1, value2, "pm25a8");
            return (Criteria) this;
        }

        public Criteria andPm25a9IsNull() {
            addCriterion("pm25A9 is null");
            return (Criteria) this;
        }

        public Criteria andPm25a9IsNotNull() {
            addCriterion("pm25A9 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25a9EqualTo(Double value) {
            addCriterion("pm25A9 =", value, "pm25a9");
            return (Criteria) this;
        }

        public Criteria andPm25a9NotEqualTo(Double value) {
            addCriterion("pm25A9 <>", value, "pm25a9");
            return (Criteria) this;
        }

        public Criteria andPm25a9GreaterThan(Double value) {
            addCriterion("pm25A9 >", value, "pm25a9");
            return (Criteria) this;
        }

        public Criteria andPm25a9GreaterThanOrEqualTo(Double value) {
            addCriterion("pm25A9 >=", value, "pm25a9");
            return (Criteria) this;
        }

        public Criteria andPm25a9LessThan(Double value) {
            addCriterion("pm25A9 <", value, "pm25a9");
            return (Criteria) this;
        }

        public Criteria andPm25a9LessThanOrEqualTo(Double value) {
            addCriterion("pm25A9 <=", value, "pm25a9");
            return (Criteria) this;
        }

        public Criteria andPm25a9In(List<Double> values) {
            addCriterion("pm25A9 in", values, "pm25a9");
            return (Criteria) this;
        }

        public Criteria andPm25a9NotIn(List<Double> values) {
            addCriterion("pm25A9 not in", values, "pm25a9");
            return (Criteria) this;
        }

        public Criteria andPm25a9Between(Double value1, Double value2) {
            addCriterion("pm25A9 between", value1, value2, "pm25a9");
            return (Criteria) this;
        }

        public Criteria andPm25a9NotBetween(Double value1, Double value2) {
            addCriterion("pm25A9 not between", value1, value2, "pm25a9");
            return (Criteria) this;
        }

        public Criteria andPm25a10IsNull() {
            addCriterion("pm25A10 is null");
            return (Criteria) this;
        }

        public Criteria andPm25a10IsNotNull() {
            addCriterion("pm25A10 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25a10EqualTo(Double value) {
            addCriterion("pm25A10 =", value, "pm25a10");
            return (Criteria) this;
        }

        public Criteria andPm25a10NotEqualTo(Double value) {
            addCriterion("pm25A10 <>", value, "pm25a10");
            return (Criteria) this;
        }

        public Criteria andPm25a10GreaterThan(Double value) {
            addCriterion("pm25A10 >", value, "pm25a10");
            return (Criteria) this;
        }

        public Criteria andPm25a10GreaterThanOrEqualTo(Double value) {
            addCriterion("pm25A10 >=", value, "pm25a10");
            return (Criteria) this;
        }

        public Criteria andPm25a10LessThan(Double value) {
            addCriterion("pm25A10 <", value, "pm25a10");
            return (Criteria) this;
        }

        public Criteria andPm25a10LessThanOrEqualTo(Double value) {
            addCriterion("pm25A10 <=", value, "pm25a10");
            return (Criteria) this;
        }

        public Criteria andPm25a10In(List<Double> values) {
            addCriterion("pm25A10 in", values, "pm25a10");
            return (Criteria) this;
        }

        public Criteria andPm25a10NotIn(List<Double> values) {
            addCriterion("pm25A10 not in", values, "pm25a10");
            return (Criteria) this;
        }

        public Criteria andPm25a10Between(Double value1, Double value2) {
            addCriterion("pm25A10 between", value1, value2, "pm25a10");
            return (Criteria) this;
        }

        public Criteria andPm25a10NotBetween(Double value1, Double value2) {
            addCriterion("pm25A10 not between", value1, value2, "pm25a10");
            return (Criteria) this;
        }

        public Criteria andPm25a11IsNull() {
            addCriterion("pm25A11 is null");
            return (Criteria) this;
        }

        public Criteria andPm25a11IsNotNull() {
            addCriterion("pm25A11 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25a11EqualTo(Double value) {
            addCriterion("pm25A11 =", value, "pm25a11");
            return (Criteria) this;
        }

        public Criteria andPm25a11NotEqualTo(Double value) {
            addCriterion("pm25A11 <>", value, "pm25a11");
            return (Criteria) this;
        }

        public Criteria andPm25a11GreaterThan(Double value) {
            addCriterion("pm25A11 >", value, "pm25a11");
            return (Criteria) this;
        }

        public Criteria andPm25a11GreaterThanOrEqualTo(Double value) {
            addCriterion("pm25A11 >=", value, "pm25a11");
            return (Criteria) this;
        }

        public Criteria andPm25a11LessThan(Double value) {
            addCriterion("pm25A11 <", value, "pm25a11");
            return (Criteria) this;
        }

        public Criteria andPm25a11LessThanOrEqualTo(Double value) {
            addCriterion("pm25A11 <=", value, "pm25a11");
            return (Criteria) this;
        }

        public Criteria andPm25a11In(List<Double> values) {
            addCriterion("pm25A11 in", values, "pm25a11");
            return (Criteria) this;
        }

        public Criteria andPm25a11NotIn(List<Double> values) {
            addCriterion("pm25A11 not in", values, "pm25a11");
            return (Criteria) this;
        }

        public Criteria andPm25a11Between(Double value1, Double value2) {
            addCriterion("pm25A11 between", value1, value2, "pm25a11");
            return (Criteria) this;
        }

        public Criteria andPm25a11NotBetween(Double value1, Double value2) {
            addCriterion("pm25A11 not between", value1, value2, "pm25a11");
            return (Criteria) this;
        }

        public Criteria andPm25a12IsNull() {
            addCriterion("pm25A12 is null");
            return (Criteria) this;
        }

        public Criteria andPm25a12IsNotNull() {
            addCriterion("pm25A12 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25a12EqualTo(Double value) {
            addCriterion("pm25A12 =", value, "pm25a12");
            return (Criteria) this;
        }

        public Criteria andPm25a12NotEqualTo(Double value) {
            addCriterion("pm25A12 <>", value, "pm25a12");
            return (Criteria) this;
        }

        public Criteria andPm25a12GreaterThan(Double value) {
            addCriterion("pm25A12 >", value, "pm25a12");
            return (Criteria) this;
        }

        public Criteria andPm25a12GreaterThanOrEqualTo(Double value) {
            addCriterion("pm25A12 >=", value, "pm25a12");
            return (Criteria) this;
        }

        public Criteria andPm25a12LessThan(Double value) {
            addCriterion("pm25A12 <", value, "pm25a12");
            return (Criteria) this;
        }

        public Criteria andPm25a12LessThanOrEqualTo(Double value) {
            addCriterion("pm25A12 <=", value, "pm25a12");
            return (Criteria) this;
        }

        public Criteria andPm25a12In(List<Double> values) {
            addCriterion("pm25A12 in", values, "pm25a12");
            return (Criteria) this;
        }

        public Criteria andPm25a12NotIn(List<Double> values) {
            addCriterion("pm25A12 not in", values, "pm25a12");
            return (Criteria) this;
        }

        public Criteria andPm25a12Between(Double value1, Double value2) {
            addCriterion("pm25A12 between", value1, value2, "pm25a12");
            return (Criteria) this;
        }

        public Criteria andPm25a12NotBetween(Double value1, Double value2) {
            addCriterion("pm25A12 not between", value1, value2, "pm25a12");
            return (Criteria) this;
        }

        public Criteria andPm25a13IsNull() {
            addCriterion("pm25A13 is null");
            return (Criteria) this;
        }

        public Criteria andPm25a13IsNotNull() {
            addCriterion("pm25A13 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25a13EqualTo(Double value) {
            addCriterion("pm25A13 =", value, "pm25a13");
            return (Criteria) this;
        }

        public Criteria andPm25a13NotEqualTo(Double value) {
            addCriterion("pm25A13 <>", value, "pm25a13");
            return (Criteria) this;
        }

        public Criteria andPm25a13GreaterThan(Double value) {
            addCriterion("pm25A13 >", value, "pm25a13");
            return (Criteria) this;
        }

        public Criteria andPm25a13GreaterThanOrEqualTo(Double value) {
            addCriterion("pm25A13 >=", value, "pm25a13");
            return (Criteria) this;
        }

        public Criteria andPm25a13LessThan(Double value) {
            addCriterion("pm25A13 <", value, "pm25a13");
            return (Criteria) this;
        }

        public Criteria andPm25a13LessThanOrEqualTo(Double value) {
            addCriterion("pm25A13 <=", value, "pm25a13");
            return (Criteria) this;
        }

        public Criteria andPm25a13In(List<Double> values) {
            addCriterion("pm25A13 in", values, "pm25a13");
            return (Criteria) this;
        }

        public Criteria andPm25a13NotIn(List<Double> values) {
            addCriterion("pm25A13 not in", values, "pm25a13");
            return (Criteria) this;
        }

        public Criteria andPm25a13Between(Double value1, Double value2) {
            addCriterion("pm25A13 between", value1, value2, "pm25a13");
            return (Criteria) this;
        }

        public Criteria andPm25a13NotBetween(Double value1, Double value2) {
            addCriterion("pm25A13 not between", value1, value2, "pm25a13");
            return (Criteria) this;
        }

        public Criteria andPm25a14IsNull() {
            addCriterion("pm25A14 is null");
            return (Criteria) this;
        }

        public Criteria andPm25a14IsNotNull() {
            addCriterion("pm25A14 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25a14EqualTo(Double value) {
            addCriterion("pm25A14 =", value, "pm25a14");
            return (Criteria) this;
        }

        public Criteria andPm25a14NotEqualTo(Double value) {
            addCriterion("pm25A14 <>", value, "pm25a14");
            return (Criteria) this;
        }

        public Criteria andPm25a14GreaterThan(Double value) {
            addCriterion("pm25A14 >", value, "pm25a14");
            return (Criteria) this;
        }

        public Criteria andPm25a14GreaterThanOrEqualTo(Double value) {
            addCriterion("pm25A14 >=", value, "pm25a14");
            return (Criteria) this;
        }

        public Criteria andPm25a14LessThan(Double value) {
            addCriterion("pm25A14 <", value, "pm25a14");
            return (Criteria) this;
        }

        public Criteria andPm25a14LessThanOrEqualTo(Double value) {
            addCriterion("pm25A14 <=", value, "pm25a14");
            return (Criteria) this;
        }

        public Criteria andPm25a14In(List<Double> values) {
            addCriterion("pm25A14 in", values, "pm25a14");
            return (Criteria) this;
        }

        public Criteria andPm25a14NotIn(List<Double> values) {
            addCriterion("pm25A14 not in", values, "pm25a14");
            return (Criteria) this;
        }

        public Criteria andPm25a14Between(Double value1, Double value2) {
            addCriterion("pm25A14 between", value1, value2, "pm25a14");
            return (Criteria) this;
        }

        public Criteria andPm25a14NotBetween(Double value1, Double value2) {
            addCriterion("pm25A14 not between", value1, value2, "pm25a14");
            return (Criteria) this;
        }

        public Criteria andPm25a15IsNull() {
            addCriterion("pm25A15 is null");
            return (Criteria) this;
        }

        public Criteria andPm25a15IsNotNull() {
            addCriterion("pm25A15 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25a15EqualTo(Double value) {
            addCriterion("pm25A15 =", value, "pm25a15");
            return (Criteria) this;
        }

        public Criteria andPm25a15NotEqualTo(Double value) {
            addCriterion("pm25A15 <>", value, "pm25a15");
            return (Criteria) this;
        }

        public Criteria andPm25a15GreaterThan(Double value) {
            addCriterion("pm25A15 >", value, "pm25a15");
            return (Criteria) this;
        }

        public Criteria andPm25a15GreaterThanOrEqualTo(Double value) {
            addCriterion("pm25A15 >=", value, "pm25a15");
            return (Criteria) this;
        }

        public Criteria andPm25a15LessThan(Double value) {
            addCriterion("pm25A15 <", value, "pm25a15");
            return (Criteria) this;
        }

        public Criteria andPm25a15LessThanOrEqualTo(Double value) {
            addCriterion("pm25A15 <=", value, "pm25a15");
            return (Criteria) this;
        }

        public Criteria andPm25a15In(List<Double> values) {
            addCriterion("pm25A15 in", values, "pm25a15");
            return (Criteria) this;
        }

        public Criteria andPm25a15NotIn(List<Double> values) {
            addCriterion("pm25A15 not in", values, "pm25a15");
            return (Criteria) this;
        }

        public Criteria andPm25a15Between(Double value1, Double value2) {
            addCriterion("pm25A15 between", value1, value2, "pm25a15");
            return (Criteria) this;
        }

        public Criteria andPm25a15NotBetween(Double value1, Double value2) {
            addCriterion("pm25A15 not between", value1, value2, "pm25a15");
            return (Criteria) this;
        }

        public Criteria andPm25a16IsNull() {
            addCriterion("pm25A16 is null");
            return (Criteria) this;
        }

        public Criteria andPm25a16IsNotNull() {
            addCriterion("pm25A16 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25a16EqualTo(Double value) {
            addCriterion("pm25A16 =", value, "pm25a16");
            return (Criteria) this;
        }

        public Criteria andPm25a16NotEqualTo(Double value) {
            addCriterion("pm25A16 <>", value, "pm25a16");
            return (Criteria) this;
        }

        public Criteria andPm25a16GreaterThan(Double value) {
            addCriterion("pm25A16 >", value, "pm25a16");
            return (Criteria) this;
        }

        public Criteria andPm25a16GreaterThanOrEqualTo(Double value) {
            addCriterion("pm25A16 >=", value, "pm25a16");
            return (Criteria) this;
        }

        public Criteria andPm25a16LessThan(Double value) {
            addCriterion("pm25A16 <", value, "pm25a16");
            return (Criteria) this;
        }

        public Criteria andPm25a16LessThanOrEqualTo(Double value) {
            addCriterion("pm25A16 <=", value, "pm25a16");
            return (Criteria) this;
        }

        public Criteria andPm25a16In(List<Double> values) {
            addCriterion("pm25A16 in", values, "pm25a16");
            return (Criteria) this;
        }

        public Criteria andPm25a16NotIn(List<Double> values) {
            addCriterion("pm25A16 not in", values, "pm25a16");
            return (Criteria) this;
        }

        public Criteria andPm25a16Between(Double value1, Double value2) {
            addCriterion("pm25A16 between", value1, value2, "pm25a16");
            return (Criteria) this;
        }

        public Criteria andPm25a16NotBetween(Double value1, Double value2) {
            addCriterion("pm25A16 not between", value1, value2, "pm25a16");
            return (Criteria) this;
        }

        public Criteria andPm25a17IsNull() {
            addCriterion("pm25A17 is null");
            return (Criteria) this;
        }

        public Criteria andPm25a17IsNotNull() {
            addCriterion("pm25A17 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25a17EqualTo(Double value) {
            addCriterion("pm25A17 =", value, "pm25a17");
            return (Criteria) this;
        }

        public Criteria andPm25a17NotEqualTo(Double value) {
            addCriterion("pm25A17 <>", value, "pm25a17");
            return (Criteria) this;
        }

        public Criteria andPm25a17GreaterThan(Double value) {
            addCriterion("pm25A17 >", value, "pm25a17");
            return (Criteria) this;
        }

        public Criteria andPm25a17GreaterThanOrEqualTo(Double value) {
            addCriterion("pm25A17 >=", value, "pm25a17");
            return (Criteria) this;
        }

        public Criteria andPm25a17LessThan(Double value) {
            addCriterion("pm25A17 <", value, "pm25a17");
            return (Criteria) this;
        }

        public Criteria andPm25a17LessThanOrEqualTo(Double value) {
            addCriterion("pm25A17 <=", value, "pm25a17");
            return (Criteria) this;
        }

        public Criteria andPm25a17In(List<Double> values) {
            addCriterion("pm25A17 in", values, "pm25a17");
            return (Criteria) this;
        }

        public Criteria andPm25a17NotIn(List<Double> values) {
            addCriterion("pm25A17 not in", values, "pm25a17");
            return (Criteria) this;
        }

        public Criteria andPm25a17Between(Double value1, Double value2) {
            addCriterion("pm25A17 between", value1, value2, "pm25a17");
            return (Criteria) this;
        }

        public Criteria andPm25a17NotBetween(Double value1, Double value2) {
            addCriterion("pm25A17 not between", value1, value2, "pm25a17");
            return (Criteria) this;
        }

        public Criteria andPm25a18IsNull() {
            addCriterion("pm25A18 is null");
            return (Criteria) this;
        }

        public Criteria andPm25a18IsNotNull() {
            addCriterion("pm25A18 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25a18EqualTo(Double value) {
            addCriterion("pm25A18 =", value, "pm25a18");
            return (Criteria) this;
        }

        public Criteria andPm25a18NotEqualTo(Double value) {
            addCriterion("pm25A18 <>", value, "pm25a18");
            return (Criteria) this;
        }

        public Criteria andPm25a18GreaterThan(Double value) {
            addCriterion("pm25A18 >", value, "pm25a18");
            return (Criteria) this;
        }

        public Criteria andPm25a18GreaterThanOrEqualTo(Double value) {
            addCriterion("pm25A18 >=", value, "pm25a18");
            return (Criteria) this;
        }

        public Criteria andPm25a18LessThan(Double value) {
            addCriterion("pm25A18 <", value, "pm25a18");
            return (Criteria) this;
        }

        public Criteria andPm25a18LessThanOrEqualTo(Double value) {
            addCriterion("pm25A18 <=", value, "pm25a18");
            return (Criteria) this;
        }

        public Criteria andPm25a18In(List<Double> values) {
            addCriterion("pm25A18 in", values, "pm25a18");
            return (Criteria) this;
        }

        public Criteria andPm25a18NotIn(List<Double> values) {
            addCriterion("pm25A18 not in", values, "pm25a18");
            return (Criteria) this;
        }

        public Criteria andPm25a18Between(Double value1, Double value2) {
            addCriterion("pm25A18 between", value1, value2, "pm25a18");
            return (Criteria) this;
        }

        public Criteria andPm25a18NotBetween(Double value1, Double value2) {
            addCriterion("pm25A18 not between", value1, value2, "pm25a18");
            return (Criteria) this;
        }

        public Criteria andPm25a19IsNull() {
            addCriterion("pm25A19 is null");
            return (Criteria) this;
        }

        public Criteria andPm25a19IsNotNull() {
            addCriterion("pm25A19 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25a19EqualTo(Double value) {
            addCriterion("pm25A19 =", value, "pm25a19");
            return (Criteria) this;
        }

        public Criteria andPm25a19NotEqualTo(Double value) {
            addCriterion("pm25A19 <>", value, "pm25a19");
            return (Criteria) this;
        }

        public Criteria andPm25a19GreaterThan(Double value) {
            addCriterion("pm25A19 >", value, "pm25a19");
            return (Criteria) this;
        }

        public Criteria andPm25a19GreaterThanOrEqualTo(Double value) {
            addCriterion("pm25A19 >=", value, "pm25a19");
            return (Criteria) this;
        }

        public Criteria andPm25a19LessThan(Double value) {
            addCriterion("pm25A19 <", value, "pm25a19");
            return (Criteria) this;
        }

        public Criteria andPm25a19LessThanOrEqualTo(Double value) {
            addCriterion("pm25A19 <=", value, "pm25a19");
            return (Criteria) this;
        }

        public Criteria andPm25a19In(List<Double> values) {
            addCriterion("pm25A19 in", values, "pm25a19");
            return (Criteria) this;
        }

        public Criteria andPm25a19NotIn(List<Double> values) {
            addCriterion("pm25A19 not in", values, "pm25a19");
            return (Criteria) this;
        }

        public Criteria andPm25a19Between(Double value1, Double value2) {
            addCriterion("pm25A19 between", value1, value2, "pm25a19");
            return (Criteria) this;
        }

        public Criteria andPm25a19NotBetween(Double value1, Double value2) {
            addCriterion("pm25A19 not between", value1, value2, "pm25a19");
            return (Criteria) this;
        }

        public Criteria andPm25a20IsNull() {
            addCriterion("pm25A20 is null");
            return (Criteria) this;
        }

        public Criteria andPm25a20IsNotNull() {
            addCriterion("pm25A20 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25a20EqualTo(Double value) {
            addCriterion("pm25A20 =", value, "pm25a20");
            return (Criteria) this;
        }

        public Criteria andPm25a20NotEqualTo(Double value) {
            addCriterion("pm25A20 <>", value, "pm25a20");
            return (Criteria) this;
        }

        public Criteria andPm25a20GreaterThan(Double value) {
            addCriterion("pm25A20 >", value, "pm25a20");
            return (Criteria) this;
        }

        public Criteria andPm25a20GreaterThanOrEqualTo(Double value) {
            addCriterion("pm25A20 >=", value, "pm25a20");
            return (Criteria) this;
        }

        public Criteria andPm25a20LessThan(Double value) {
            addCriterion("pm25A20 <", value, "pm25a20");
            return (Criteria) this;
        }

        public Criteria andPm25a20LessThanOrEqualTo(Double value) {
            addCriterion("pm25A20 <=", value, "pm25a20");
            return (Criteria) this;
        }

        public Criteria andPm25a20In(List<Double> values) {
            addCriterion("pm25A20 in", values, "pm25a20");
            return (Criteria) this;
        }

        public Criteria andPm25a20NotIn(List<Double> values) {
            addCriterion("pm25A20 not in", values, "pm25a20");
            return (Criteria) this;
        }

        public Criteria andPm25a20Between(Double value1, Double value2) {
            addCriterion("pm25A20 between", value1, value2, "pm25a20");
            return (Criteria) this;
        }

        public Criteria andPm25a20NotBetween(Double value1, Double value2) {
            addCriterion("pm25A20 not between", value1, value2, "pm25a20");
            return (Criteria) this;
        }

        public Criteria andPm25a21IsNull() {
            addCriterion("pm25A21 is null");
            return (Criteria) this;
        }

        public Criteria andPm25a21IsNotNull() {
            addCriterion("pm25A21 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25a21EqualTo(Double value) {
            addCriterion("pm25A21 =", value, "pm25a21");
            return (Criteria) this;
        }

        public Criteria andPm25a21NotEqualTo(Double value) {
            addCriterion("pm25A21 <>", value, "pm25a21");
            return (Criteria) this;
        }

        public Criteria andPm25a21GreaterThan(Double value) {
            addCriterion("pm25A21 >", value, "pm25a21");
            return (Criteria) this;
        }

        public Criteria andPm25a21GreaterThanOrEqualTo(Double value) {
            addCriterion("pm25A21 >=", value, "pm25a21");
            return (Criteria) this;
        }

        public Criteria andPm25a21LessThan(Double value) {
            addCriterion("pm25A21 <", value, "pm25a21");
            return (Criteria) this;
        }

        public Criteria andPm25a21LessThanOrEqualTo(Double value) {
            addCriterion("pm25A21 <=", value, "pm25a21");
            return (Criteria) this;
        }

        public Criteria andPm25a21In(List<Double> values) {
            addCriterion("pm25A21 in", values, "pm25a21");
            return (Criteria) this;
        }

        public Criteria andPm25a21NotIn(List<Double> values) {
            addCriterion("pm25A21 not in", values, "pm25a21");
            return (Criteria) this;
        }

        public Criteria andPm25a21Between(Double value1, Double value2) {
            addCriterion("pm25A21 between", value1, value2, "pm25a21");
            return (Criteria) this;
        }

        public Criteria andPm25a21NotBetween(Double value1, Double value2) {
            addCriterion("pm25A21 not between", value1, value2, "pm25a21");
            return (Criteria) this;
        }

        public Criteria andPm25a22IsNull() {
            addCriterion("pm25A22 is null");
            return (Criteria) this;
        }

        public Criteria andPm25a22IsNotNull() {
            addCriterion("pm25A22 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25a22EqualTo(Double value) {
            addCriterion("pm25A22 =", value, "pm25a22");
            return (Criteria) this;
        }

        public Criteria andPm25a22NotEqualTo(Double value) {
            addCriterion("pm25A22 <>", value, "pm25a22");
            return (Criteria) this;
        }

        public Criteria andPm25a22GreaterThan(Double value) {
            addCriterion("pm25A22 >", value, "pm25a22");
            return (Criteria) this;
        }

        public Criteria andPm25a22GreaterThanOrEqualTo(Double value) {
            addCriterion("pm25A22 >=", value, "pm25a22");
            return (Criteria) this;
        }

        public Criteria andPm25a22LessThan(Double value) {
            addCriterion("pm25A22 <", value, "pm25a22");
            return (Criteria) this;
        }

        public Criteria andPm25a22LessThanOrEqualTo(Double value) {
            addCriterion("pm25A22 <=", value, "pm25a22");
            return (Criteria) this;
        }

        public Criteria andPm25a22In(List<Double> values) {
            addCriterion("pm25A22 in", values, "pm25a22");
            return (Criteria) this;
        }

        public Criteria andPm25a22NotIn(List<Double> values) {
            addCriterion("pm25A22 not in", values, "pm25a22");
            return (Criteria) this;
        }

        public Criteria andPm25a22Between(Double value1, Double value2) {
            addCriterion("pm25A22 between", value1, value2, "pm25a22");
            return (Criteria) this;
        }

        public Criteria andPm25a22NotBetween(Double value1, Double value2) {
            addCriterion("pm25A22 not between", value1, value2, "pm25a22");
            return (Criteria) this;
        }

        public Criteria andPm25a23IsNull() {
            addCriterion("pm25A23 is null");
            return (Criteria) this;
        }

        public Criteria andPm25a23IsNotNull() {
            addCriterion("pm25A23 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25a23EqualTo(Double value) {
            addCriterion("pm25A23 =", value, "pm25a23");
            return (Criteria) this;
        }

        public Criteria andPm25a23NotEqualTo(Double value) {
            addCriterion("pm25A23 <>", value, "pm25a23");
            return (Criteria) this;
        }

        public Criteria andPm25a23GreaterThan(Double value) {
            addCriterion("pm25A23 >", value, "pm25a23");
            return (Criteria) this;
        }

        public Criteria andPm25a23GreaterThanOrEqualTo(Double value) {
            addCriterion("pm25A23 >=", value, "pm25a23");
            return (Criteria) this;
        }

        public Criteria andPm25a23LessThan(Double value) {
            addCriterion("pm25A23 <", value, "pm25a23");
            return (Criteria) this;
        }

        public Criteria andPm25a23LessThanOrEqualTo(Double value) {
            addCriterion("pm25A23 <=", value, "pm25a23");
            return (Criteria) this;
        }

        public Criteria andPm25a23In(List<Double> values) {
            addCriterion("pm25A23 in", values, "pm25a23");
            return (Criteria) this;
        }

        public Criteria andPm25a23NotIn(List<Double> values) {
            addCriterion("pm25A23 not in", values, "pm25a23");
            return (Criteria) this;
        }

        public Criteria andPm25a23Between(Double value1, Double value2) {
            addCriterion("pm25A23 between", value1, value2, "pm25a23");
            return (Criteria) this;
        }

        public Criteria andPm25a23NotBetween(Double value1, Double value2) {
            addCriterion("pm25A23 not between", value1, value2, "pm25a23");
            return (Criteria) this;
        }

        public Criteria andPm25a24IsNull() {
            addCriterion("pm25A24 is null");
            return (Criteria) this;
        }

        public Criteria andPm25a24IsNotNull() {
            addCriterion("pm25A24 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25a24EqualTo(Double value) {
            addCriterion("pm25A24 =", value, "pm25a24");
            return (Criteria) this;
        }

        public Criteria andPm25a24NotEqualTo(Double value) {
            addCriterion("pm25A24 <>", value, "pm25a24");
            return (Criteria) this;
        }

        public Criteria andPm25a24GreaterThan(Double value) {
            addCriterion("pm25A24 >", value, "pm25a24");
            return (Criteria) this;
        }

        public Criteria andPm25a24GreaterThanOrEqualTo(Double value) {
            addCriterion("pm25A24 >=", value, "pm25a24");
            return (Criteria) this;
        }

        public Criteria andPm25a24LessThan(Double value) {
            addCriterion("pm25A24 <", value, "pm25a24");
            return (Criteria) this;
        }

        public Criteria andPm25a24LessThanOrEqualTo(Double value) {
            addCriterion("pm25A24 <=", value, "pm25a24");
            return (Criteria) this;
        }

        public Criteria andPm25a24In(List<Double> values) {
            addCriterion("pm25A24 in", values, "pm25a24");
            return (Criteria) this;
        }

        public Criteria andPm25a24NotIn(List<Double> values) {
            addCriterion("pm25A24 not in", values, "pm25a24");
            return (Criteria) this;
        }

        public Criteria andPm25a24Between(Double value1, Double value2) {
            addCriterion("pm25A24 between", value1, value2, "pm25a24");
            return (Criteria) this;
        }

        public Criteria andPm25a24NotBetween(Double value1, Double value2) {
            addCriterion("pm25A24 not between", value1, value2, "pm25a24");
            return (Criteria) this;
        }

        public Criteria andHca1IsNull() {
            addCriterion("hcA1 is null");
            return (Criteria) this;
        }

        public Criteria andHca1IsNotNull() {
            addCriterion("hcA1 is not null");
            return (Criteria) this;
        }

        public Criteria andHca1EqualTo(Double value) {
            addCriterion("hcA1 =", value, "hca1");
            return (Criteria) this;
        }

        public Criteria andHca1NotEqualTo(Double value) {
            addCriterion("hcA1 <>", value, "hca1");
            return (Criteria) this;
        }

        public Criteria andHca1GreaterThan(Double value) {
            addCriterion("hcA1 >", value, "hca1");
            return (Criteria) this;
        }

        public Criteria andHca1GreaterThanOrEqualTo(Double value) {
            addCriterion("hcA1 >=", value, "hca1");
            return (Criteria) this;
        }

        public Criteria andHca1LessThan(Double value) {
            addCriterion("hcA1 <", value, "hca1");
            return (Criteria) this;
        }

        public Criteria andHca1LessThanOrEqualTo(Double value) {
            addCriterion("hcA1 <=", value, "hca1");
            return (Criteria) this;
        }

        public Criteria andHca1In(List<Double> values) {
            addCriterion("hcA1 in", values, "hca1");
            return (Criteria) this;
        }

        public Criteria andHca1NotIn(List<Double> values) {
            addCriterion("hcA1 not in", values, "hca1");
            return (Criteria) this;
        }

        public Criteria andHca1Between(Double value1, Double value2) {
            addCriterion("hcA1 between", value1, value2, "hca1");
            return (Criteria) this;
        }

        public Criteria andHca1NotBetween(Double value1, Double value2) {
            addCriterion("hcA1 not between", value1, value2, "hca1");
            return (Criteria) this;
        }

        public Criteria andHca2IsNull() {
            addCriterion("hcA2 is null");
            return (Criteria) this;
        }

        public Criteria andHca2IsNotNull() {
            addCriterion("hcA2 is not null");
            return (Criteria) this;
        }

        public Criteria andHca2EqualTo(Double value) {
            addCriterion("hcA2 =", value, "hca2");
            return (Criteria) this;
        }

        public Criteria andHca2NotEqualTo(Double value) {
            addCriterion("hcA2 <>", value, "hca2");
            return (Criteria) this;
        }

        public Criteria andHca2GreaterThan(Double value) {
            addCriterion("hcA2 >", value, "hca2");
            return (Criteria) this;
        }

        public Criteria andHca2GreaterThanOrEqualTo(Double value) {
            addCriterion("hcA2 >=", value, "hca2");
            return (Criteria) this;
        }

        public Criteria andHca2LessThan(Double value) {
            addCriterion("hcA2 <", value, "hca2");
            return (Criteria) this;
        }

        public Criteria andHca2LessThanOrEqualTo(Double value) {
            addCriterion("hcA2 <=", value, "hca2");
            return (Criteria) this;
        }

        public Criteria andHca2In(List<Double> values) {
            addCriterion("hcA2 in", values, "hca2");
            return (Criteria) this;
        }

        public Criteria andHca2NotIn(List<Double> values) {
            addCriterion("hcA2 not in", values, "hca2");
            return (Criteria) this;
        }

        public Criteria andHca2Between(Double value1, Double value2) {
            addCriterion("hcA2 between", value1, value2, "hca2");
            return (Criteria) this;
        }

        public Criteria andHca2NotBetween(Double value1, Double value2) {
            addCriterion("hcA2 not between", value1, value2, "hca2");
            return (Criteria) this;
        }

        public Criteria andHca3IsNull() {
            addCriterion("hcA3 is null");
            return (Criteria) this;
        }

        public Criteria andHca3IsNotNull() {
            addCriterion("hcA3 is not null");
            return (Criteria) this;
        }

        public Criteria andHca3EqualTo(Double value) {
            addCriterion("hcA3 =", value, "hca3");
            return (Criteria) this;
        }

        public Criteria andHca3NotEqualTo(Double value) {
            addCriterion("hcA3 <>", value, "hca3");
            return (Criteria) this;
        }

        public Criteria andHca3GreaterThan(Double value) {
            addCriterion("hcA3 >", value, "hca3");
            return (Criteria) this;
        }

        public Criteria andHca3GreaterThanOrEqualTo(Double value) {
            addCriterion("hcA3 >=", value, "hca3");
            return (Criteria) this;
        }

        public Criteria andHca3LessThan(Double value) {
            addCriterion("hcA3 <", value, "hca3");
            return (Criteria) this;
        }

        public Criteria andHca3LessThanOrEqualTo(Double value) {
            addCriterion("hcA3 <=", value, "hca3");
            return (Criteria) this;
        }

        public Criteria andHca3In(List<Double> values) {
            addCriterion("hcA3 in", values, "hca3");
            return (Criteria) this;
        }

        public Criteria andHca3NotIn(List<Double> values) {
            addCriterion("hcA3 not in", values, "hca3");
            return (Criteria) this;
        }

        public Criteria andHca3Between(Double value1, Double value2) {
            addCriterion("hcA3 between", value1, value2, "hca3");
            return (Criteria) this;
        }

        public Criteria andHca3NotBetween(Double value1, Double value2) {
            addCriterion("hcA3 not between", value1, value2, "hca3");
            return (Criteria) this;
        }

        public Criteria andHca4IsNull() {
            addCriterion("hcA4 is null");
            return (Criteria) this;
        }

        public Criteria andHca4IsNotNull() {
            addCriterion("hcA4 is not null");
            return (Criteria) this;
        }

        public Criteria andHca4EqualTo(Double value) {
            addCriterion("hcA4 =", value, "hca4");
            return (Criteria) this;
        }

        public Criteria andHca4NotEqualTo(Double value) {
            addCriterion("hcA4 <>", value, "hca4");
            return (Criteria) this;
        }

        public Criteria andHca4GreaterThan(Double value) {
            addCriterion("hcA4 >", value, "hca4");
            return (Criteria) this;
        }

        public Criteria andHca4GreaterThanOrEqualTo(Double value) {
            addCriterion("hcA4 >=", value, "hca4");
            return (Criteria) this;
        }

        public Criteria andHca4LessThan(Double value) {
            addCriterion("hcA4 <", value, "hca4");
            return (Criteria) this;
        }

        public Criteria andHca4LessThanOrEqualTo(Double value) {
            addCriterion("hcA4 <=", value, "hca4");
            return (Criteria) this;
        }

        public Criteria andHca4In(List<Double> values) {
            addCriterion("hcA4 in", values, "hca4");
            return (Criteria) this;
        }

        public Criteria andHca4NotIn(List<Double> values) {
            addCriterion("hcA4 not in", values, "hca4");
            return (Criteria) this;
        }

        public Criteria andHca4Between(Double value1, Double value2) {
            addCriterion("hcA4 between", value1, value2, "hca4");
            return (Criteria) this;
        }

        public Criteria andHca4NotBetween(Double value1, Double value2) {
            addCriterion("hcA4 not between", value1, value2, "hca4");
            return (Criteria) this;
        }

        public Criteria andHca5IsNull() {
            addCriterion("hcA5 is null");
            return (Criteria) this;
        }

        public Criteria andHca5IsNotNull() {
            addCriterion("hcA5 is not null");
            return (Criteria) this;
        }

        public Criteria andHca5EqualTo(Double value) {
            addCriterion("hcA5 =", value, "hca5");
            return (Criteria) this;
        }

        public Criteria andHca5NotEqualTo(Double value) {
            addCriterion("hcA5 <>", value, "hca5");
            return (Criteria) this;
        }

        public Criteria andHca5GreaterThan(Double value) {
            addCriterion("hcA5 >", value, "hca5");
            return (Criteria) this;
        }

        public Criteria andHca5GreaterThanOrEqualTo(Double value) {
            addCriterion("hcA5 >=", value, "hca5");
            return (Criteria) this;
        }

        public Criteria andHca5LessThan(Double value) {
            addCriterion("hcA5 <", value, "hca5");
            return (Criteria) this;
        }

        public Criteria andHca5LessThanOrEqualTo(Double value) {
            addCriterion("hcA5 <=", value, "hca5");
            return (Criteria) this;
        }

        public Criteria andHca5In(List<Double> values) {
            addCriterion("hcA5 in", values, "hca5");
            return (Criteria) this;
        }

        public Criteria andHca5NotIn(List<Double> values) {
            addCriterion("hcA5 not in", values, "hca5");
            return (Criteria) this;
        }

        public Criteria andHca5Between(Double value1, Double value2) {
            addCriterion("hcA5 between", value1, value2, "hca5");
            return (Criteria) this;
        }

        public Criteria andHca5NotBetween(Double value1, Double value2) {
            addCriterion("hcA5 not between", value1, value2, "hca5");
            return (Criteria) this;
        }

        public Criteria andHca6IsNull() {
            addCriterion("hcA6 is null");
            return (Criteria) this;
        }

        public Criteria andHca6IsNotNull() {
            addCriterion("hcA6 is not null");
            return (Criteria) this;
        }

        public Criteria andHca6EqualTo(Double value) {
            addCriterion("hcA6 =", value, "hca6");
            return (Criteria) this;
        }

        public Criteria andHca6NotEqualTo(Double value) {
            addCriterion("hcA6 <>", value, "hca6");
            return (Criteria) this;
        }

        public Criteria andHca6GreaterThan(Double value) {
            addCriterion("hcA6 >", value, "hca6");
            return (Criteria) this;
        }

        public Criteria andHca6GreaterThanOrEqualTo(Double value) {
            addCriterion("hcA6 >=", value, "hca6");
            return (Criteria) this;
        }

        public Criteria andHca6LessThan(Double value) {
            addCriterion("hcA6 <", value, "hca6");
            return (Criteria) this;
        }

        public Criteria andHca6LessThanOrEqualTo(Double value) {
            addCriterion("hcA6 <=", value, "hca6");
            return (Criteria) this;
        }

        public Criteria andHca6In(List<Double> values) {
            addCriterion("hcA6 in", values, "hca6");
            return (Criteria) this;
        }

        public Criteria andHca6NotIn(List<Double> values) {
            addCriterion("hcA6 not in", values, "hca6");
            return (Criteria) this;
        }

        public Criteria andHca6Between(Double value1, Double value2) {
            addCriterion("hcA6 between", value1, value2, "hca6");
            return (Criteria) this;
        }

        public Criteria andHca6NotBetween(Double value1, Double value2) {
            addCriterion("hcA6 not between", value1, value2, "hca6");
            return (Criteria) this;
        }

        public Criteria andHca7IsNull() {
            addCriterion("hcA7 is null");
            return (Criteria) this;
        }

        public Criteria andHca7IsNotNull() {
            addCriterion("hcA7 is not null");
            return (Criteria) this;
        }

        public Criteria andHca7EqualTo(Double value) {
            addCriterion("hcA7 =", value, "hca7");
            return (Criteria) this;
        }

        public Criteria andHca7NotEqualTo(Double value) {
            addCriterion("hcA7 <>", value, "hca7");
            return (Criteria) this;
        }

        public Criteria andHca7GreaterThan(Double value) {
            addCriterion("hcA7 >", value, "hca7");
            return (Criteria) this;
        }

        public Criteria andHca7GreaterThanOrEqualTo(Double value) {
            addCriterion("hcA7 >=", value, "hca7");
            return (Criteria) this;
        }

        public Criteria andHca7LessThan(Double value) {
            addCriterion("hcA7 <", value, "hca7");
            return (Criteria) this;
        }

        public Criteria andHca7LessThanOrEqualTo(Double value) {
            addCriterion("hcA7 <=", value, "hca7");
            return (Criteria) this;
        }

        public Criteria andHca7In(List<Double> values) {
            addCriterion("hcA7 in", values, "hca7");
            return (Criteria) this;
        }

        public Criteria andHca7NotIn(List<Double> values) {
            addCriterion("hcA7 not in", values, "hca7");
            return (Criteria) this;
        }

        public Criteria andHca7Between(Double value1, Double value2) {
            addCriterion("hcA7 between", value1, value2, "hca7");
            return (Criteria) this;
        }

        public Criteria andHca7NotBetween(Double value1, Double value2) {
            addCriterion("hcA7 not between", value1, value2, "hca7");
            return (Criteria) this;
        }

        public Criteria andHca8IsNull() {
            addCriterion("hcA8 is null");
            return (Criteria) this;
        }

        public Criteria andHca8IsNotNull() {
            addCriterion("hcA8 is not null");
            return (Criteria) this;
        }

        public Criteria andHca8EqualTo(Double value) {
            addCriterion("hcA8 =", value, "hca8");
            return (Criteria) this;
        }

        public Criteria andHca8NotEqualTo(Double value) {
            addCriterion("hcA8 <>", value, "hca8");
            return (Criteria) this;
        }

        public Criteria andHca8GreaterThan(Double value) {
            addCriterion("hcA8 >", value, "hca8");
            return (Criteria) this;
        }

        public Criteria andHca8GreaterThanOrEqualTo(Double value) {
            addCriterion("hcA8 >=", value, "hca8");
            return (Criteria) this;
        }

        public Criteria andHca8LessThan(Double value) {
            addCriterion("hcA8 <", value, "hca8");
            return (Criteria) this;
        }

        public Criteria andHca8LessThanOrEqualTo(Double value) {
            addCriterion("hcA8 <=", value, "hca8");
            return (Criteria) this;
        }

        public Criteria andHca8In(List<Double> values) {
            addCriterion("hcA8 in", values, "hca8");
            return (Criteria) this;
        }

        public Criteria andHca8NotIn(List<Double> values) {
            addCriterion("hcA8 not in", values, "hca8");
            return (Criteria) this;
        }

        public Criteria andHca8Between(Double value1, Double value2) {
            addCriterion("hcA8 between", value1, value2, "hca8");
            return (Criteria) this;
        }

        public Criteria andHca8NotBetween(Double value1, Double value2) {
            addCriterion("hcA8 not between", value1, value2, "hca8");
            return (Criteria) this;
        }

        public Criteria andHca9IsNull() {
            addCriterion("hcA9 is null");
            return (Criteria) this;
        }

        public Criteria andHca9IsNotNull() {
            addCriterion("hcA9 is not null");
            return (Criteria) this;
        }

        public Criteria andHca9EqualTo(Double value) {
            addCriterion("hcA9 =", value, "hca9");
            return (Criteria) this;
        }

        public Criteria andHca9NotEqualTo(Double value) {
            addCriterion("hcA9 <>", value, "hca9");
            return (Criteria) this;
        }

        public Criteria andHca9GreaterThan(Double value) {
            addCriterion("hcA9 >", value, "hca9");
            return (Criteria) this;
        }

        public Criteria andHca9GreaterThanOrEqualTo(Double value) {
            addCriterion("hcA9 >=", value, "hca9");
            return (Criteria) this;
        }

        public Criteria andHca9LessThan(Double value) {
            addCriterion("hcA9 <", value, "hca9");
            return (Criteria) this;
        }

        public Criteria andHca9LessThanOrEqualTo(Double value) {
            addCriterion("hcA9 <=", value, "hca9");
            return (Criteria) this;
        }

        public Criteria andHca9In(List<Double> values) {
            addCriterion("hcA9 in", values, "hca9");
            return (Criteria) this;
        }

        public Criteria andHca9NotIn(List<Double> values) {
            addCriterion("hcA9 not in", values, "hca9");
            return (Criteria) this;
        }

        public Criteria andHca9Between(Double value1, Double value2) {
            addCriterion("hcA9 between", value1, value2, "hca9");
            return (Criteria) this;
        }

        public Criteria andHca9NotBetween(Double value1, Double value2) {
            addCriterion("hcA9 not between", value1, value2, "hca9");
            return (Criteria) this;
        }

        public Criteria andHca10IsNull() {
            addCriterion("hcA10 is null");
            return (Criteria) this;
        }

        public Criteria andHca10IsNotNull() {
            addCriterion("hcA10 is not null");
            return (Criteria) this;
        }

        public Criteria andHca10EqualTo(Double value) {
            addCriterion("hcA10 =", value, "hca10");
            return (Criteria) this;
        }

        public Criteria andHca10NotEqualTo(Double value) {
            addCriterion("hcA10 <>", value, "hca10");
            return (Criteria) this;
        }

        public Criteria andHca10GreaterThan(Double value) {
            addCriterion("hcA10 >", value, "hca10");
            return (Criteria) this;
        }

        public Criteria andHca10GreaterThanOrEqualTo(Double value) {
            addCriterion("hcA10 >=", value, "hca10");
            return (Criteria) this;
        }

        public Criteria andHca10LessThan(Double value) {
            addCriterion("hcA10 <", value, "hca10");
            return (Criteria) this;
        }

        public Criteria andHca10LessThanOrEqualTo(Double value) {
            addCriterion("hcA10 <=", value, "hca10");
            return (Criteria) this;
        }

        public Criteria andHca10In(List<Double> values) {
            addCriterion("hcA10 in", values, "hca10");
            return (Criteria) this;
        }

        public Criteria andHca10NotIn(List<Double> values) {
            addCriterion("hcA10 not in", values, "hca10");
            return (Criteria) this;
        }

        public Criteria andHca10Between(Double value1, Double value2) {
            addCriterion("hcA10 between", value1, value2, "hca10");
            return (Criteria) this;
        }

        public Criteria andHca10NotBetween(Double value1, Double value2) {
            addCriterion("hcA10 not between", value1, value2, "hca10");
            return (Criteria) this;
        }

        public Criteria andHca11IsNull() {
            addCriterion("hcA11 is null");
            return (Criteria) this;
        }

        public Criteria andHca11IsNotNull() {
            addCriterion("hcA11 is not null");
            return (Criteria) this;
        }

        public Criteria andHca11EqualTo(Double value) {
            addCriterion("hcA11 =", value, "hca11");
            return (Criteria) this;
        }

        public Criteria andHca11NotEqualTo(Double value) {
            addCriterion("hcA11 <>", value, "hca11");
            return (Criteria) this;
        }

        public Criteria andHca11GreaterThan(Double value) {
            addCriterion("hcA11 >", value, "hca11");
            return (Criteria) this;
        }

        public Criteria andHca11GreaterThanOrEqualTo(Double value) {
            addCriterion("hcA11 >=", value, "hca11");
            return (Criteria) this;
        }

        public Criteria andHca11LessThan(Double value) {
            addCriterion("hcA11 <", value, "hca11");
            return (Criteria) this;
        }

        public Criteria andHca11LessThanOrEqualTo(Double value) {
            addCriterion("hcA11 <=", value, "hca11");
            return (Criteria) this;
        }

        public Criteria andHca11In(List<Double> values) {
            addCriterion("hcA11 in", values, "hca11");
            return (Criteria) this;
        }

        public Criteria andHca11NotIn(List<Double> values) {
            addCriterion("hcA11 not in", values, "hca11");
            return (Criteria) this;
        }

        public Criteria andHca11Between(Double value1, Double value2) {
            addCriterion("hcA11 between", value1, value2, "hca11");
            return (Criteria) this;
        }

        public Criteria andHca11NotBetween(Double value1, Double value2) {
            addCriterion("hcA11 not between", value1, value2, "hca11");
            return (Criteria) this;
        }

        public Criteria andHca12IsNull() {
            addCriterion("hcA12 is null");
            return (Criteria) this;
        }

        public Criteria andHca12IsNotNull() {
            addCriterion("hcA12 is not null");
            return (Criteria) this;
        }

        public Criteria andHca12EqualTo(Double value) {
            addCriterion("hcA12 =", value, "hca12");
            return (Criteria) this;
        }

        public Criteria andHca12NotEqualTo(Double value) {
            addCriterion("hcA12 <>", value, "hca12");
            return (Criteria) this;
        }

        public Criteria andHca12GreaterThan(Double value) {
            addCriterion("hcA12 >", value, "hca12");
            return (Criteria) this;
        }

        public Criteria andHca12GreaterThanOrEqualTo(Double value) {
            addCriterion("hcA12 >=", value, "hca12");
            return (Criteria) this;
        }

        public Criteria andHca12LessThan(Double value) {
            addCriterion("hcA12 <", value, "hca12");
            return (Criteria) this;
        }

        public Criteria andHca12LessThanOrEqualTo(Double value) {
            addCriterion("hcA12 <=", value, "hca12");
            return (Criteria) this;
        }

        public Criteria andHca12In(List<Double> values) {
            addCriterion("hcA12 in", values, "hca12");
            return (Criteria) this;
        }

        public Criteria andHca12NotIn(List<Double> values) {
            addCriterion("hcA12 not in", values, "hca12");
            return (Criteria) this;
        }

        public Criteria andHca12Between(Double value1, Double value2) {
            addCriterion("hcA12 between", value1, value2, "hca12");
            return (Criteria) this;
        }

        public Criteria andHca12NotBetween(Double value1, Double value2) {
            addCriterion("hcA12 not between", value1, value2, "hca12");
            return (Criteria) this;
        }

        public Criteria andHca13IsNull() {
            addCriterion("hcA13 is null");
            return (Criteria) this;
        }

        public Criteria andHca13IsNotNull() {
            addCriterion("hcA13 is not null");
            return (Criteria) this;
        }

        public Criteria andHca13EqualTo(Double value) {
            addCriterion("hcA13 =", value, "hca13");
            return (Criteria) this;
        }

        public Criteria andHca13NotEqualTo(Double value) {
            addCriterion("hcA13 <>", value, "hca13");
            return (Criteria) this;
        }

        public Criteria andHca13GreaterThan(Double value) {
            addCriterion("hcA13 >", value, "hca13");
            return (Criteria) this;
        }

        public Criteria andHca13GreaterThanOrEqualTo(Double value) {
            addCriterion("hcA13 >=", value, "hca13");
            return (Criteria) this;
        }

        public Criteria andHca13LessThan(Double value) {
            addCriterion("hcA13 <", value, "hca13");
            return (Criteria) this;
        }

        public Criteria andHca13LessThanOrEqualTo(Double value) {
            addCriterion("hcA13 <=", value, "hca13");
            return (Criteria) this;
        }

        public Criteria andHca13In(List<Double> values) {
            addCriterion("hcA13 in", values, "hca13");
            return (Criteria) this;
        }

        public Criteria andHca13NotIn(List<Double> values) {
            addCriterion("hcA13 not in", values, "hca13");
            return (Criteria) this;
        }

        public Criteria andHca13Between(Double value1, Double value2) {
            addCriterion("hcA13 between", value1, value2, "hca13");
            return (Criteria) this;
        }

        public Criteria andHca13NotBetween(Double value1, Double value2) {
            addCriterion("hcA13 not between", value1, value2, "hca13");
            return (Criteria) this;
        }

        public Criteria andHca14IsNull() {
            addCriterion("hcA14 is null");
            return (Criteria) this;
        }

        public Criteria andHca14IsNotNull() {
            addCriterion("hcA14 is not null");
            return (Criteria) this;
        }

        public Criteria andHca14EqualTo(Double value) {
            addCriterion("hcA14 =", value, "hca14");
            return (Criteria) this;
        }

        public Criteria andHca14NotEqualTo(Double value) {
            addCriterion("hcA14 <>", value, "hca14");
            return (Criteria) this;
        }

        public Criteria andHca14GreaterThan(Double value) {
            addCriterion("hcA14 >", value, "hca14");
            return (Criteria) this;
        }

        public Criteria andHca14GreaterThanOrEqualTo(Double value) {
            addCriterion("hcA14 >=", value, "hca14");
            return (Criteria) this;
        }

        public Criteria andHca14LessThan(Double value) {
            addCriterion("hcA14 <", value, "hca14");
            return (Criteria) this;
        }

        public Criteria andHca14LessThanOrEqualTo(Double value) {
            addCriterion("hcA14 <=", value, "hca14");
            return (Criteria) this;
        }

        public Criteria andHca14In(List<Double> values) {
            addCriterion("hcA14 in", values, "hca14");
            return (Criteria) this;
        }

        public Criteria andHca14NotIn(List<Double> values) {
            addCriterion("hcA14 not in", values, "hca14");
            return (Criteria) this;
        }

        public Criteria andHca14Between(Double value1, Double value2) {
            addCriterion("hcA14 between", value1, value2, "hca14");
            return (Criteria) this;
        }

        public Criteria andHca14NotBetween(Double value1, Double value2) {
            addCriterion("hcA14 not between", value1, value2, "hca14");
            return (Criteria) this;
        }

        public Criteria andHca15IsNull() {
            addCriterion("hcA15 is null");
            return (Criteria) this;
        }

        public Criteria andHca15IsNotNull() {
            addCriterion("hcA15 is not null");
            return (Criteria) this;
        }

        public Criteria andHca15EqualTo(Double value) {
            addCriterion("hcA15 =", value, "hca15");
            return (Criteria) this;
        }

        public Criteria andHca15NotEqualTo(Double value) {
            addCriterion("hcA15 <>", value, "hca15");
            return (Criteria) this;
        }

        public Criteria andHca15GreaterThan(Double value) {
            addCriterion("hcA15 >", value, "hca15");
            return (Criteria) this;
        }

        public Criteria andHca15GreaterThanOrEqualTo(Double value) {
            addCriterion("hcA15 >=", value, "hca15");
            return (Criteria) this;
        }

        public Criteria andHca15LessThan(Double value) {
            addCriterion("hcA15 <", value, "hca15");
            return (Criteria) this;
        }

        public Criteria andHca15LessThanOrEqualTo(Double value) {
            addCriterion("hcA15 <=", value, "hca15");
            return (Criteria) this;
        }

        public Criteria andHca15In(List<Double> values) {
            addCriterion("hcA15 in", values, "hca15");
            return (Criteria) this;
        }

        public Criteria andHca15NotIn(List<Double> values) {
            addCriterion("hcA15 not in", values, "hca15");
            return (Criteria) this;
        }

        public Criteria andHca15Between(Double value1, Double value2) {
            addCriterion("hcA15 between", value1, value2, "hca15");
            return (Criteria) this;
        }

        public Criteria andHca15NotBetween(Double value1, Double value2) {
            addCriterion("hcA15 not between", value1, value2, "hca15");
            return (Criteria) this;
        }

        public Criteria andHca16IsNull() {
            addCriterion("hcA16 is null");
            return (Criteria) this;
        }

        public Criteria andHca16IsNotNull() {
            addCriterion("hcA16 is not null");
            return (Criteria) this;
        }

        public Criteria andHca16EqualTo(Double value) {
            addCriterion("hcA16 =", value, "hca16");
            return (Criteria) this;
        }

        public Criteria andHca16NotEqualTo(Double value) {
            addCriterion("hcA16 <>", value, "hca16");
            return (Criteria) this;
        }

        public Criteria andHca16GreaterThan(Double value) {
            addCriterion("hcA16 >", value, "hca16");
            return (Criteria) this;
        }

        public Criteria andHca16GreaterThanOrEqualTo(Double value) {
            addCriterion("hcA16 >=", value, "hca16");
            return (Criteria) this;
        }

        public Criteria andHca16LessThan(Double value) {
            addCriterion("hcA16 <", value, "hca16");
            return (Criteria) this;
        }

        public Criteria andHca16LessThanOrEqualTo(Double value) {
            addCriterion("hcA16 <=", value, "hca16");
            return (Criteria) this;
        }

        public Criteria andHca16In(List<Double> values) {
            addCriterion("hcA16 in", values, "hca16");
            return (Criteria) this;
        }

        public Criteria andHca16NotIn(List<Double> values) {
            addCriterion("hcA16 not in", values, "hca16");
            return (Criteria) this;
        }

        public Criteria andHca16Between(Double value1, Double value2) {
            addCriterion("hcA16 between", value1, value2, "hca16");
            return (Criteria) this;
        }

        public Criteria andHca16NotBetween(Double value1, Double value2) {
            addCriterion("hcA16 not between", value1, value2, "hca16");
            return (Criteria) this;
        }

        public Criteria andHca17IsNull() {
            addCriterion("hcA17 is null");
            return (Criteria) this;
        }

        public Criteria andHca17IsNotNull() {
            addCriterion("hcA17 is not null");
            return (Criteria) this;
        }

        public Criteria andHca17EqualTo(Double value) {
            addCriterion("hcA17 =", value, "hca17");
            return (Criteria) this;
        }

        public Criteria andHca17NotEqualTo(Double value) {
            addCriterion("hcA17 <>", value, "hca17");
            return (Criteria) this;
        }

        public Criteria andHca17GreaterThan(Double value) {
            addCriterion("hcA17 >", value, "hca17");
            return (Criteria) this;
        }

        public Criteria andHca17GreaterThanOrEqualTo(Double value) {
            addCriterion("hcA17 >=", value, "hca17");
            return (Criteria) this;
        }

        public Criteria andHca17LessThan(Double value) {
            addCriterion("hcA17 <", value, "hca17");
            return (Criteria) this;
        }

        public Criteria andHca17LessThanOrEqualTo(Double value) {
            addCriterion("hcA17 <=", value, "hca17");
            return (Criteria) this;
        }

        public Criteria andHca17In(List<Double> values) {
            addCriterion("hcA17 in", values, "hca17");
            return (Criteria) this;
        }

        public Criteria andHca17NotIn(List<Double> values) {
            addCriterion("hcA17 not in", values, "hca17");
            return (Criteria) this;
        }

        public Criteria andHca17Between(Double value1, Double value2) {
            addCriterion("hcA17 between", value1, value2, "hca17");
            return (Criteria) this;
        }

        public Criteria andHca17NotBetween(Double value1, Double value2) {
            addCriterion("hcA17 not between", value1, value2, "hca17");
            return (Criteria) this;
        }

        public Criteria andHca18IsNull() {
            addCriterion("hcA18 is null");
            return (Criteria) this;
        }

        public Criteria andHca18IsNotNull() {
            addCriterion("hcA18 is not null");
            return (Criteria) this;
        }

        public Criteria andHca18EqualTo(Double value) {
            addCriterion("hcA18 =", value, "hca18");
            return (Criteria) this;
        }

        public Criteria andHca18NotEqualTo(Double value) {
            addCriterion("hcA18 <>", value, "hca18");
            return (Criteria) this;
        }

        public Criteria andHca18GreaterThan(Double value) {
            addCriterion("hcA18 >", value, "hca18");
            return (Criteria) this;
        }

        public Criteria andHca18GreaterThanOrEqualTo(Double value) {
            addCriterion("hcA18 >=", value, "hca18");
            return (Criteria) this;
        }

        public Criteria andHca18LessThan(Double value) {
            addCriterion("hcA18 <", value, "hca18");
            return (Criteria) this;
        }

        public Criteria andHca18LessThanOrEqualTo(Double value) {
            addCriterion("hcA18 <=", value, "hca18");
            return (Criteria) this;
        }

        public Criteria andHca18In(List<Double> values) {
            addCriterion("hcA18 in", values, "hca18");
            return (Criteria) this;
        }

        public Criteria andHca18NotIn(List<Double> values) {
            addCriterion("hcA18 not in", values, "hca18");
            return (Criteria) this;
        }

        public Criteria andHca18Between(Double value1, Double value2) {
            addCriterion("hcA18 between", value1, value2, "hca18");
            return (Criteria) this;
        }

        public Criteria andHca18NotBetween(Double value1, Double value2) {
            addCriterion("hcA18 not between", value1, value2, "hca18");
            return (Criteria) this;
        }

        public Criteria andHca19IsNull() {
            addCriterion("hcA19 is null");
            return (Criteria) this;
        }

        public Criteria andHca19IsNotNull() {
            addCriterion("hcA19 is not null");
            return (Criteria) this;
        }

        public Criteria andHca19EqualTo(Double value) {
            addCriterion("hcA19 =", value, "hca19");
            return (Criteria) this;
        }

        public Criteria andHca19NotEqualTo(Double value) {
            addCriterion("hcA19 <>", value, "hca19");
            return (Criteria) this;
        }

        public Criteria andHca19GreaterThan(Double value) {
            addCriterion("hcA19 >", value, "hca19");
            return (Criteria) this;
        }

        public Criteria andHca19GreaterThanOrEqualTo(Double value) {
            addCriterion("hcA19 >=", value, "hca19");
            return (Criteria) this;
        }

        public Criteria andHca19LessThan(Double value) {
            addCriterion("hcA19 <", value, "hca19");
            return (Criteria) this;
        }

        public Criteria andHca19LessThanOrEqualTo(Double value) {
            addCriterion("hcA19 <=", value, "hca19");
            return (Criteria) this;
        }

        public Criteria andHca19In(List<Double> values) {
            addCriterion("hcA19 in", values, "hca19");
            return (Criteria) this;
        }

        public Criteria andHca19NotIn(List<Double> values) {
            addCriterion("hcA19 not in", values, "hca19");
            return (Criteria) this;
        }

        public Criteria andHca19Between(Double value1, Double value2) {
            addCriterion("hcA19 between", value1, value2, "hca19");
            return (Criteria) this;
        }

        public Criteria andHca19NotBetween(Double value1, Double value2) {
            addCriterion("hcA19 not between", value1, value2, "hca19");
            return (Criteria) this;
        }

        public Criteria andHca20IsNull() {
            addCriterion("hcA20 is null");
            return (Criteria) this;
        }

        public Criteria andHca20IsNotNull() {
            addCriterion("hcA20 is not null");
            return (Criteria) this;
        }

        public Criteria andHca20EqualTo(Double value) {
            addCriterion("hcA20 =", value, "hca20");
            return (Criteria) this;
        }

        public Criteria andHca20NotEqualTo(Double value) {
            addCriterion("hcA20 <>", value, "hca20");
            return (Criteria) this;
        }

        public Criteria andHca20GreaterThan(Double value) {
            addCriterion("hcA20 >", value, "hca20");
            return (Criteria) this;
        }

        public Criteria andHca20GreaterThanOrEqualTo(Double value) {
            addCriterion("hcA20 >=", value, "hca20");
            return (Criteria) this;
        }

        public Criteria andHca20LessThan(Double value) {
            addCriterion("hcA20 <", value, "hca20");
            return (Criteria) this;
        }

        public Criteria andHca20LessThanOrEqualTo(Double value) {
            addCriterion("hcA20 <=", value, "hca20");
            return (Criteria) this;
        }

        public Criteria andHca20In(List<Double> values) {
            addCriterion("hcA20 in", values, "hca20");
            return (Criteria) this;
        }

        public Criteria andHca20NotIn(List<Double> values) {
            addCriterion("hcA20 not in", values, "hca20");
            return (Criteria) this;
        }

        public Criteria andHca20Between(Double value1, Double value2) {
            addCriterion("hcA20 between", value1, value2, "hca20");
            return (Criteria) this;
        }

        public Criteria andHca20NotBetween(Double value1, Double value2) {
            addCriterion("hcA20 not between", value1, value2, "hca20");
            return (Criteria) this;
        }

        public Criteria andHca21IsNull() {
            addCriterion("hcA21 is null");
            return (Criteria) this;
        }

        public Criteria andHca21IsNotNull() {
            addCriterion("hcA21 is not null");
            return (Criteria) this;
        }

        public Criteria andHca21EqualTo(Double value) {
            addCriterion("hcA21 =", value, "hca21");
            return (Criteria) this;
        }

        public Criteria andHca21NotEqualTo(Double value) {
            addCriterion("hcA21 <>", value, "hca21");
            return (Criteria) this;
        }

        public Criteria andHca21GreaterThan(Double value) {
            addCriterion("hcA21 >", value, "hca21");
            return (Criteria) this;
        }

        public Criteria andHca21GreaterThanOrEqualTo(Double value) {
            addCriterion("hcA21 >=", value, "hca21");
            return (Criteria) this;
        }

        public Criteria andHca21LessThan(Double value) {
            addCriterion("hcA21 <", value, "hca21");
            return (Criteria) this;
        }

        public Criteria andHca21LessThanOrEqualTo(Double value) {
            addCriterion("hcA21 <=", value, "hca21");
            return (Criteria) this;
        }

        public Criteria andHca21In(List<Double> values) {
            addCriterion("hcA21 in", values, "hca21");
            return (Criteria) this;
        }

        public Criteria andHca21NotIn(List<Double> values) {
            addCriterion("hcA21 not in", values, "hca21");
            return (Criteria) this;
        }

        public Criteria andHca21Between(Double value1, Double value2) {
            addCriterion("hcA21 between", value1, value2, "hca21");
            return (Criteria) this;
        }

        public Criteria andHca21NotBetween(Double value1, Double value2) {
            addCriterion("hcA21 not between", value1, value2, "hca21");
            return (Criteria) this;
        }

        public Criteria andHca22IsNull() {
            addCriterion("hcA22 is null");
            return (Criteria) this;
        }

        public Criteria andHca22IsNotNull() {
            addCriterion("hcA22 is not null");
            return (Criteria) this;
        }

        public Criteria andHca22EqualTo(Double value) {
            addCriterion("hcA22 =", value, "hca22");
            return (Criteria) this;
        }

        public Criteria andHca22NotEqualTo(Double value) {
            addCriterion("hcA22 <>", value, "hca22");
            return (Criteria) this;
        }

        public Criteria andHca22GreaterThan(Double value) {
            addCriterion("hcA22 >", value, "hca22");
            return (Criteria) this;
        }

        public Criteria andHca22GreaterThanOrEqualTo(Double value) {
            addCriterion("hcA22 >=", value, "hca22");
            return (Criteria) this;
        }

        public Criteria andHca22LessThan(Double value) {
            addCriterion("hcA22 <", value, "hca22");
            return (Criteria) this;
        }

        public Criteria andHca22LessThanOrEqualTo(Double value) {
            addCriterion("hcA22 <=", value, "hca22");
            return (Criteria) this;
        }

        public Criteria andHca22In(List<Double> values) {
            addCriterion("hcA22 in", values, "hca22");
            return (Criteria) this;
        }

        public Criteria andHca22NotIn(List<Double> values) {
            addCriterion("hcA22 not in", values, "hca22");
            return (Criteria) this;
        }

        public Criteria andHca22Between(Double value1, Double value2) {
            addCriterion("hcA22 between", value1, value2, "hca22");
            return (Criteria) this;
        }

        public Criteria andHca22NotBetween(Double value1, Double value2) {
            addCriterion("hcA22 not between", value1, value2, "hca22");
            return (Criteria) this;
        }

        public Criteria andHca23IsNull() {
            addCriterion("hcA23 is null");
            return (Criteria) this;
        }

        public Criteria andHca23IsNotNull() {
            addCriterion("hcA23 is not null");
            return (Criteria) this;
        }

        public Criteria andHca23EqualTo(Double value) {
            addCriterion("hcA23 =", value, "hca23");
            return (Criteria) this;
        }

        public Criteria andHca23NotEqualTo(Double value) {
            addCriterion("hcA23 <>", value, "hca23");
            return (Criteria) this;
        }

        public Criteria andHca23GreaterThan(Double value) {
            addCriterion("hcA23 >", value, "hca23");
            return (Criteria) this;
        }

        public Criteria andHca23GreaterThanOrEqualTo(Double value) {
            addCriterion("hcA23 >=", value, "hca23");
            return (Criteria) this;
        }

        public Criteria andHca23LessThan(Double value) {
            addCriterion("hcA23 <", value, "hca23");
            return (Criteria) this;
        }

        public Criteria andHca23LessThanOrEqualTo(Double value) {
            addCriterion("hcA23 <=", value, "hca23");
            return (Criteria) this;
        }

        public Criteria andHca23In(List<Double> values) {
            addCriterion("hcA23 in", values, "hca23");
            return (Criteria) this;
        }

        public Criteria andHca23NotIn(List<Double> values) {
            addCriterion("hcA23 not in", values, "hca23");
            return (Criteria) this;
        }

        public Criteria andHca23Between(Double value1, Double value2) {
            addCriterion("hcA23 between", value1, value2, "hca23");
            return (Criteria) this;
        }

        public Criteria andHca23NotBetween(Double value1, Double value2) {
            addCriterion("hcA23 not between", value1, value2, "hca23");
            return (Criteria) this;
        }

        public Criteria andHca24IsNull() {
            addCriterion("hcA24 is null");
            return (Criteria) this;
        }

        public Criteria andHca24IsNotNull() {
            addCriterion("hcA24 is not null");
            return (Criteria) this;
        }

        public Criteria andHca24EqualTo(Double value) {
            addCriterion("hcA24 =", value, "hca24");
            return (Criteria) this;
        }

        public Criteria andHca24NotEqualTo(Double value) {
            addCriterion("hcA24 <>", value, "hca24");
            return (Criteria) this;
        }

        public Criteria andHca24GreaterThan(Double value) {
            addCriterion("hcA24 >", value, "hca24");
            return (Criteria) this;
        }

        public Criteria andHca24GreaterThanOrEqualTo(Double value) {
            addCriterion("hcA24 >=", value, "hca24");
            return (Criteria) this;
        }

        public Criteria andHca24LessThan(Double value) {
            addCriterion("hcA24 <", value, "hca24");
            return (Criteria) this;
        }

        public Criteria andHca24LessThanOrEqualTo(Double value) {
            addCriterion("hcA24 <=", value, "hca24");
            return (Criteria) this;
        }

        public Criteria andHca24In(List<Double> values) {
            addCriterion("hcA24 in", values, "hca24");
            return (Criteria) this;
        }

        public Criteria andHca24NotIn(List<Double> values) {
            addCriterion("hcA24 not in", values, "hca24");
            return (Criteria) this;
        }

        public Criteria andHca24Between(Double value1, Double value2) {
            addCriterion("hcA24 between", value1, value2, "hca24");
            return (Criteria) this;
        }

        public Criteria andHca24NotBetween(Double value1, Double value2) {
            addCriterion("hcA24 not between", value1, value2, "hca24");
            return (Criteria) this;
        }

        public Criteria andNoa1IsNull() {
            addCriterion("noA1 is null");
            return (Criteria) this;
        }

        public Criteria andNoa1IsNotNull() {
            addCriterion("noA1 is not null");
            return (Criteria) this;
        }

        public Criteria andNoa1EqualTo(Double value) {
            addCriterion("noA1 =", value, "noa1");
            return (Criteria) this;
        }

        public Criteria andNoa1NotEqualTo(Double value) {
            addCriterion("noA1 <>", value, "noa1");
            return (Criteria) this;
        }

        public Criteria andNoa1GreaterThan(Double value) {
            addCriterion("noA1 >", value, "noa1");
            return (Criteria) this;
        }

        public Criteria andNoa1GreaterThanOrEqualTo(Double value) {
            addCriterion("noA1 >=", value, "noa1");
            return (Criteria) this;
        }

        public Criteria andNoa1LessThan(Double value) {
            addCriterion("noA1 <", value, "noa1");
            return (Criteria) this;
        }

        public Criteria andNoa1LessThanOrEqualTo(Double value) {
            addCriterion("noA1 <=", value, "noa1");
            return (Criteria) this;
        }

        public Criteria andNoa1In(List<Double> values) {
            addCriterion("noA1 in", values, "noa1");
            return (Criteria) this;
        }

        public Criteria andNoa1NotIn(List<Double> values) {
            addCriterion("noA1 not in", values, "noa1");
            return (Criteria) this;
        }

        public Criteria andNoa1Between(Double value1, Double value2) {
            addCriterion("noA1 between", value1, value2, "noa1");
            return (Criteria) this;
        }

        public Criteria andNoa1NotBetween(Double value1, Double value2) {
            addCriterion("noA1 not between", value1, value2, "noa1");
            return (Criteria) this;
        }

        public Criteria andNoa2IsNull() {
            addCriterion("noA2 is null");
            return (Criteria) this;
        }

        public Criteria andNoa2IsNotNull() {
            addCriterion("noA2 is not null");
            return (Criteria) this;
        }

        public Criteria andNoa2EqualTo(Double value) {
            addCriterion("noA2 =", value, "noa2");
            return (Criteria) this;
        }

        public Criteria andNoa2NotEqualTo(Double value) {
            addCriterion("noA2 <>", value, "noa2");
            return (Criteria) this;
        }

        public Criteria andNoa2GreaterThan(Double value) {
            addCriterion("noA2 >", value, "noa2");
            return (Criteria) this;
        }

        public Criteria andNoa2GreaterThanOrEqualTo(Double value) {
            addCriterion("noA2 >=", value, "noa2");
            return (Criteria) this;
        }

        public Criteria andNoa2LessThan(Double value) {
            addCriterion("noA2 <", value, "noa2");
            return (Criteria) this;
        }

        public Criteria andNoa2LessThanOrEqualTo(Double value) {
            addCriterion("noA2 <=", value, "noa2");
            return (Criteria) this;
        }

        public Criteria andNoa2In(List<Double> values) {
            addCriterion("noA2 in", values, "noa2");
            return (Criteria) this;
        }

        public Criteria andNoa2NotIn(List<Double> values) {
            addCriterion("noA2 not in", values, "noa2");
            return (Criteria) this;
        }

        public Criteria andNoa2Between(Double value1, Double value2) {
            addCriterion("noA2 between", value1, value2, "noa2");
            return (Criteria) this;
        }

        public Criteria andNoa2NotBetween(Double value1, Double value2) {
            addCriterion("noA2 not between", value1, value2, "noa2");
            return (Criteria) this;
        }

        public Criteria andNoa3IsNull() {
            addCriterion("noA3 is null");
            return (Criteria) this;
        }

        public Criteria andNoa3IsNotNull() {
            addCriterion("noA3 is not null");
            return (Criteria) this;
        }

        public Criteria andNoa3EqualTo(Double value) {
            addCriterion("noA3 =", value, "noa3");
            return (Criteria) this;
        }

        public Criteria andNoa3NotEqualTo(Double value) {
            addCriterion("noA3 <>", value, "noa3");
            return (Criteria) this;
        }

        public Criteria andNoa3GreaterThan(Double value) {
            addCriterion("noA3 >", value, "noa3");
            return (Criteria) this;
        }

        public Criteria andNoa3GreaterThanOrEqualTo(Double value) {
            addCriterion("noA3 >=", value, "noa3");
            return (Criteria) this;
        }

        public Criteria andNoa3LessThan(Double value) {
            addCriterion("noA3 <", value, "noa3");
            return (Criteria) this;
        }

        public Criteria andNoa3LessThanOrEqualTo(Double value) {
            addCriterion("noA3 <=", value, "noa3");
            return (Criteria) this;
        }

        public Criteria andNoa3In(List<Double> values) {
            addCriterion("noA3 in", values, "noa3");
            return (Criteria) this;
        }

        public Criteria andNoa3NotIn(List<Double> values) {
            addCriterion("noA3 not in", values, "noa3");
            return (Criteria) this;
        }

        public Criteria andNoa3Between(Double value1, Double value2) {
            addCriterion("noA3 between", value1, value2, "noa3");
            return (Criteria) this;
        }

        public Criteria andNoa3NotBetween(Double value1, Double value2) {
            addCriterion("noA3 not between", value1, value2, "noa3");
            return (Criteria) this;
        }

        public Criteria andNoa4IsNull() {
            addCriterion("noA4 is null");
            return (Criteria) this;
        }

        public Criteria andNoa4IsNotNull() {
            addCriterion("noA4 is not null");
            return (Criteria) this;
        }

        public Criteria andNoa4EqualTo(Double value) {
            addCriterion("noA4 =", value, "noa4");
            return (Criteria) this;
        }

        public Criteria andNoa4NotEqualTo(Double value) {
            addCriterion("noA4 <>", value, "noa4");
            return (Criteria) this;
        }

        public Criteria andNoa4GreaterThan(Double value) {
            addCriterion("noA4 >", value, "noa4");
            return (Criteria) this;
        }

        public Criteria andNoa4GreaterThanOrEqualTo(Double value) {
            addCriterion("noA4 >=", value, "noa4");
            return (Criteria) this;
        }

        public Criteria andNoa4LessThan(Double value) {
            addCriterion("noA4 <", value, "noa4");
            return (Criteria) this;
        }

        public Criteria andNoa4LessThanOrEqualTo(Double value) {
            addCriterion("noA4 <=", value, "noa4");
            return (Criteria) this;
        }

        public Criteria andNoa4In(List<Double> values) {
            addCriterion("noA4 in", values, "noa4");
            return (Criteria) this;
        }

        public Criteria andNoa4NotIn(List<Double> values) {
            addCriterion("noA4 not in", values, "noa4");
            return (Criteria) this;
        }

        public Criteria andNoa4Between(Double value1, Double value2) {
            addCriterion("noA4 between", value1, value2, "noa4");
            return (Criteria) this;
        }

        public Criteria andNoa4NotBetween(Double value1, Double value2) {
            addCriterion("noA4 not between", value1, value2, "noa4");
            return (Criteria) this;
        }

        public Criteria andNoa5IsNull() {
            addCriterion("noA5 is null");
            return (Criteria) this;
        }

        public Criteria andNoa5IsNotNull() {
            addCriterion("noA5 is not null");
            return (Criteria) this;
        }

        public Criteria andNoa5EqualTo(Double value) {
            addCriterion("noA5 =", value, "noa5");
            return (Criteria) this;
        }

        public Criteria andNoa5NotEqualTo(Double value) {
            addCriterion("noA5 <>", value, "noa5");
            return (Criteria) this;
        }

        public Criteria andNoa5GreaterThan(Double value) {
            addCriterion("noA5 >", value, "noa5");
            return (Criteria) this;
        }

        public Criteria andNoa5GreaterThanOrEqualTo(Double value) {
            addCriterion("noA5 >=", value, "noa5");
            return (Criteria) this;
        }

        public Criteria andNoa5LessThan(Double value) {
            addCriterion("noA5 <", value, "noa5");
            return (Criteria) this;
        }

        public Criteria andNoa5LessThanOrEqualTo(Double value) {
            addCriterion("noA5 <=", value, "noa5");
            return (Criteria) this;
        }

        public Criteria andNoa5In(List<Double> values) {
            addCriterion("noA5 in", values, "noa5");
            return (Criteria) this;
        }

        public Criteria andNoa5NotIn(List<Double> values) {
            addCriterion("noA5 not in", values, "noa5");
            return (Criteria) this;
        }

        public Criteria andNoa5Between(Double value1, Double value2) {
            addCriterion("noA5 between", value1, value2, "noa5");
            return (Criteria) this;
        }

        public Criteria andNoa5NotBetween(Double value1, Double value2) {
            addCriterion("noA5 not between", value1, value2, "noa5");
            return (Criteria) this;
        }

        public Criteria andNoa6IsNull() {
            addCriterion("noA6 is null");
            return (Criteria) this;
        }

        public Criteria andNoa6IsNotNull() {
            addCriterion("noA6 is not null");
            return (Criteria) this;
        }

        public Criteria andNoa6EqualTo(Double value) {
            addCriterion("noA6 =", value, "noa6");
            return (Criteria) this;
        }

        public Criteria andNoa6NotEqualTo(Double value) {
            addCriterion("noA6 <>", value, "noa6");
            return (Criteria) this;
        }

        public Criteria andNoa6GreaterThan(Double value) {
            addCriterion("noA6 >", value, "noa6");
            return (Criteria) this;
        }

        public Criteria andNoa6GreaterThanOrEqualTo(Double value) {
            addCriterion("noA6 >=", value, "noa6");
            return (Criteria) this;
        }

        public Criteria andNoa6LessThan(Double value) {
            addCriterion("noA6 <", value, "noa6");
            return (Criteria) this;
        }

        public Criteria andNoa6LessThanOrEqualTo(Double value) {
            addCriterion("noA6 <=", value, "noa6");
            return (Criteria) this;
        }

        public Criteria andNoa6In(List<Double> values) {
            addCriterion("noA6 in", values, "noa6");
            return (Criteria) this;
        }

        public Criteria andNoa6NotIn(List<Double> values) {
            addCriterion("noA6 not in", values, "noa6");
            return (Criteria) this;
        }

        public Criteria andNoa6Between(Double value1, Double value2) {
            addCriterion("noA6 between", value1, value2, "noa6");
            return (Criteria) this;
        }

        public Criteria andNoa6NotBetween(Double value1, Double value2) {
            addCriterion("noA6 not between", value1, value2, "noa6");
            return (Criteria) this;
        }

        public Criteria andNoa7IsNull() {
            addCriterion("noA7 is null");
            return (Criteria) this;
        }

        public Criteria andNoa7IsNotNull() {
            addCriterion("noA7 is not null");
            return (Criteria) this;
        }

        public Criteria andNoa7EqualTo(Double value) {
            addCriterion("noA7 =", value, "noa7");
            return (Criteria) this;
        }

        public Criteria andNoa7NotEqualTo(Double value) {
            addCriterion("noA7 <>", value, "noa7");
            return (Criteria) this;
        }

        public Criteria andNoa7GreaterThan(Double value) {
            addCriterion("noA7 >", value, "noa7");
            return (Criteria) this;
        }

        public Criteria andNoa7GreaterThanOrEqualTo(Double value) {
            addCriterion("noA7 >=", value, "noa7");
            return (Criteria) this;
        }

        public Criteria andNoa7LessThan(Double value) {
            addCriterion("noA7 <", value, "noa7");
            return (Criteria) this;
        }

        public Criteria andNoa7LessThanOrEqualTo(Double value) {
            addCriterion("noA7 <=", value, "noa7");
            return (Criteria) this;
        }

        public Criteria andNoa7In(List<Double> values) {
            addCriterion("noA7 in", values, "noa7");
            return (Criteria) this;
        }

        public Criteria andNoa7NotIn(List<Double> values) {
            addCriterion("noA7 not in", values, "noa7");
            return (Criteria) this;
        }

        public Criteria andNoa7Between(Double value1, Double value2) {
            addCriterion("noA7 between", value1, value2, "noa7");
            return (Criteria) this;
        }

        public Criteria andNoa7NotBetween(Double value1, Double value2) {
            addCriterion("noA7 not between", value1, value2, "noa7");
            return (Criteria) this;
        }

        public Criteria andNoa8IsNull() {
            addCriterion("noA8 is null");
            return (Criteria) this;
        }

        public Criteria andNoa8IsNotNull() {
            addCriterion("noA8 is not null");
            return (Criteria) this;
        }

        public Criteria andNoa8EqualTo(Double value) {
            addCriterion("noA8 =", value, "noa8");
            return (Criteria) this;
        }

        public Criteria andNoa8NotEqualTo(Double value) {
            addCriterion("noA8 <>", value, "noa8");
            return (Criteria) this;
        }

        public Criteria andNoa8GreaterThan(Double value) {
            addCriterion("noA8 >", value, "noa8");
            return (Criteria) this;
        }

        public Criteria andNoa8GreaterThanOrEqualTo(Double value) {
            addCriterion("noA8 >=", value, "noa8");
            return (Criteria) this;
        }

        public Criteria andNoa8LessThan(Double value) {
            addCriterion("noA8 <", value, "noa8");
            return (Criteria) this;
        }

        public Criteria andNoa8LessThanOrEqualTo(Double value) {
            addCriterion("noA8 <=", value, "noa8");
            return (Criteria) this;
        }

        public Criteria andNoa8In(List<Double> values) {
            addCriterion("noA8 in", values, "noa8");
            return (Criteria) this;
        }

        public Criteria andNoa8NotIn(List<Double> values) {
            addCriterion("noA8 not in", values, "noa8");
            return (Criteria) this;
        }

        public Criteria andNoa8Between(Double value1, Double value2) {
            addCriterion("noA8 between", value1, value2, "noa8");
            return (Criteria) this;
        }

        public Criteria andNoa8NotBetween(Double value1, Double value2) {
            addCriterion("noA8 not between", value1, value2, "noa8");
            return (Criteria) this;
        }

        public Criteria andNoa9IsNull() {
            addCriterion("noA9 is null");
            return (Criteria) this;
        }

        public Criteria andNoa9IsNotNull() {
            addCriterion("noA9 is not null");
            return (Criteria) this;
        }

        public Criteria andNoa9EqualTo(Double value) {
            addCriterion("noA9 =", value, "noa9");
            return (Criteria) this;
        }

        public Criteria andNoa9NotEqualTo(Double value) {
            addCriterion("noA9 <>", value, "noa9");
            return (Criteria) this;
        }

        public Criteria andNoa9GreaterThan(Double value) {
            addCriterion("noA9 >", value, "noa9");
            return (Criteria) this;
        }

        public Criteria andNoa9GreaterThanOrEqualTo(Double value) {
            addCriterion("noA9 >=", value, "noa9");
            return (Criteria) this;
        }

        public Criteria andNoa9LessThan(Double value) {
            addCriterion("noA9 <", value, "noa9");
            return (Criteria) this;
        }

        public Criteria andNoa9LessThanOrEqualTo(Double value) {
            addCriterion("noA9 <=", value, "noa9");
            return (Criteria) this;
        }

        public Criteria andNoa9In(List<Double> values) {
            addCriterion("noA9 in", values, "noa9");
            return (Criteria) this;
        }

        public Criteria andNoa9NotIn(List<Double> values) {
            addCriterion("noA9 not in", values, "noa9");
            return (Criteria) this;
        }

        public Criteria andNoa9Between(Double value1, Double value2) {
            addCriterion("noA9 between", value1, value2, "noa9");
            return (Criteria) this;
        }

        public Criteria andNoa9NotBetween(Double value1, Double value2) {
            addCriterion("noA9 not between", value1, value2, "noa9");
            return (Criteria) this;
        }

        public Criteria andNoa10IsNull() {
            addCriterion("noA10 is null");
            return (Criteria) this;
        }

        public Criteria andNoa10IsNotNull() {
            addCriterion("noA10 is not null");
            return (Criteria) this;
        }

        public Criteria andNoa10EqualTo(Double value) {
            addCriterion("noA10 =", value, "noa10");
            return (Criteria) this;
        }

        public Criteria andNoa10NotEqualTo(Double value) {
            addCriterion("noA10 <>", value, "noa10");
            return (Criteria) this;
        }

        public Criteria andNoa10GreaterThan(Double value) {
            addCriterion("noA10 >", value, "noa10");
            return (Criteria) this;
        }

        public Criteria andNoa10GreaterThanOrEqualTo(Double value) {
            addCriterion("noA10 >=", value, "noa10");
            return (Criteria) this;
        }

        public Criteria andNoa10LessThan(Double value) {
            addCriterion("noA10 <", value, "noa10");
            return (Criteria) this;
        }

        public Criteria andNoa10LessThanOrEqualTo(Double value) {
            addCriterion("noA10 <=", value, "noa10");
            return (Criteria) this;
        }

        public Criteria andNoa10In(List<Double> values) {
            addCriterion("noA10 in", values, "noa10");
            return (Criteria) this;
        }

        public Criteria andNoa10NotIn(List<Double> values) {
            addCriterion("noA10 not in", values, "noa10");
            return (Criteria) this;
        }

        public Criteria andNoa10Between(Double value1, Double value2) {
            addCriterion("noA10 between", value1, value2, "noa10");
            return (Criteria) this;
        }

        public Criteria andNoa10NotBetween(Double value1, Double value2) {
            addCriterion("noA10 not between", value1, value2, "noa10");
            return (Criteria) this;
        }

        public Criteria andNoa11IsNull() {
            addCriterion("noA11 is null");
            return (Criteria) this;
        }

        public Criteria andNoa11IsNotNull() {
            addCriterion("noA11 is not null");
            return (Criteria) this;
        }

        public Criteria andNoa11EqualTo(Double value) {
            addCriterion("noA11 =", value, "noa11");
            return (Criteria) this;
        }

        public Criteria andNoa11NotEqualTo(Double value) {
            addCriterion("noA11 <>", value, "noa11");
            return (Criteria) this;
        }

        public Criteria andNoa11GreaterThan(Double value) {
            addCriterion("noA11 >", value, "noa11");
            return (Criteria) this;
        }

        public Criteria andNoa11GreaterThanOrEqualTo(Double value) {
            addCriterion("noA11 >=", value, "noa11");
            return (Criteria) this;
        }

        public Criteria andNoa11LessThan(Double value) {
            addCriterion("noA11 <", value, "noa11");
            return (Criteria) this;
        }

        public Criteria andNoa11LessThanOrEqualTo(Double value) {
            addCriterion("noA11 <=", value, "noa11");
            return (Criteria) this;
        }

        public Criteria andNoa11In(List<Double> values) {
            addCriterion("noA11 in", values, "noa11");
            return (Criteria) this;
        }

        public Criteria andNoa11NotIn(List<Double> values) {
            addCriterion("noA11 not in", values, "noa11");
            return (Criteria) this;
        }

        public Criteria andNoa11Between(Double value1, Double value2) {
            addCriterion("noA11 between", value1, value2, "noa11");
            return (Criteria) this;
        }

        public Criteria andNoa11NotBetween(Double value1, Double value2) {
            addCriterion("noA11 not between", value1, value2, "noa11");
            return (Criteria) this;
        }

        public Criteria andNoa12IsNull() {
            addCriterion("noA12 is null");
            return (Criteria) this;
        }

        public Criteria andNoa12IsNotNull() {
            addCriterion("noA12 is not null");
            return (Criteria) this;
        }

        public Criteria andNoa12EqualTo(Double value) {
            addCriterion("noA12 =", value, "noa12");
            return (Criteria) this;
        }

        public Criteria andNoa12NotEqualTo(Double value) {
            addCriterion("noA12 <>", value, "noa12");
            return (Criteria) this;
        }

        public Criteria andNoa12GreaterThan(Double value) {
            addCriterion("noA12 >", value, "noa12");
            return (Criteria) this;
        }

        public Criteria andNoa12GreaterThanOrEqualTo(Double value) {
            addCriterion("noA12 >=", value, "noa12");
            return (Criteria) this;
        }

        public Criteria andNoa12LessThan(Double value) {
            addCriterion("noA12 <", value, "noa12");
            return (Criteria) this;
        }

        public Criteria andNoa12LessThanOrEqualTo(Double value) {
            addCriterion("noA12 <=", value, "noa12");
            return (Criteria) this;
        }

        public Criteria andNoa12In(List<Double> values) {
            addCriterion("noA12 in", values, "noa12");
            return (Criteria) this;
        }

        public Criteria andNoa12NotIn(List<Double> values) {
            addCriterion("noA12 not in", values, "noa12");
            return (Criteria) this;
        }

        public Criteria andNoa12Between(Double value1, Double value2) {
            addCriterion("noA12 between", value1, value2, "noa12");
            return (Criteria) this;
        }

        public Criteria andNoa12NotBetween(Double value1, Double value2) {
            addCriterion("noA12 not between", value1, value2, "noa12");
            return (Criteria) this;
        }

        public Criteria andNoa13IsNull() {
            addCriterion("noA13 is null");
            return (Criteria) this;
        }

        public Criteria andNoa13IsNotNull() {
            addCriterion("noA13 is not null");
            return (Criteria) this;
        }

        public Criteria andNoa13EqualTo(Double value) {
            addCriterion("noA13 =", value, "noa13");
            return (Criteria) this;
        }

        public Criteria andNoa13NotEqualTo(Double value) {
            addCriterion("noA13 <>", value, "noa13");
            return (Criteria) this;
        }

        public Criteria andNoa13GreaterThan(Double value) {
            addCriterion("noA13 >", value, "noa13");
            return (Criteria) this;
        }

        public Criteria andNoa13GreaterThanOrEqualTo(Double value) {
            addCriterion("noA13 >=", value, "noa13");
            return (Criteria) this;
        }

        public Criteria andNoa13LessThan(Double value) {
            addCriterion("noA13 <", value, "noa13");
            return (Criteria) this;
        }

        public Criteria andNoa13LessThanOrEqualTo(Double value) {
            addCriterion("noA13 <=", value, "noa13");
            return (Criteria) this;
        }

        public Criteria andNoa13In(List<Double> values) {
            addCriterion("noA13 in", values, "noa13");
            return (Criteria) this;
        }

        public Criteria andNoa13NotIn(List<Double> values) {
            addCriterion("noA13 not in", values, "noa13");
            return (Criteria) this;
        }

        public Criteria andNoa13Between(Double value1, Double value2) {
            addCriterion("noA13 between", value1, value2, "noa13");
            return (Criteria) this;
        }

        public Criteria andNoa13NotBetween(Double value1, Double value2) {
            addCriterion("noA13 not between", value1, value2, "noa13");
            return (Criteria) this;
        }

        public Criteria andNoa14IsNull() {
            addCriterion("noA14 is null");
            return (Criteria) this;
        }

        public Criteria andNoa14IsNotNull() {
            addCriterion("noA14 is not null");
            return (Criteria) this;
        }

        public Criteria andNoa14EqualTo(Double value) {
            addCriterion("noA14 =", value, "noa14");
            return (Criteria) this;
        }

        public Criteria andNoa14NotEqualTo(Double value) {
            addCriterion("noA14 <>", value, "noa14");
            return (Criteria) this;
        }

        public Criteria andNoa14GreaterThan(Double value) {
            addCriterion("noA14 >", value, "noa14");
            return (Criteria) this;
        }

        public Criteria andNoa14GreaterThanOrEqualTo(Double value) {
            addCriterion("noA14 >=", value, "noa14");
            return (Criteria) this;
        }

        public Criteria andNoa14LessThan(Double value) {
            addCriterion("noA14 <", value, "noa14");
            return (Criteria) this;
        }

        public Criteria andNoa14LessThanOrEqualTo(Double value) {
            addCriterion("noA14 <=", value, "noa14");
            return (Criteria) this;
        }

        public Criteria andNoa14In(List<Double> values) {
            addCriterion("noA14 in", values, "noa14");
            return (Criteria) this;
        }

        public Criteria andNoa14NotIn(List<Double> values) {
            addCriterion("noA14 not in", values, "noa14");
            return (Criteria) this;
        }

        public Criteria andNoa14Between(Double value1, Double value2) {
            addCriterion("noA14 between", value1, value2, "noa14");
            return (Criteria) this;
        }

        public Criteria andNoa14NotBetween(Double value1, Double value2) {
            addCriterion("noA14 not between", value1, value2, "noa14");
            return (Criteria) this;
        }

        public Criteria andNoa15IsNull() {
            addCriterion("noA15 is null");
            return (Criteria) this;
        }

        public Criteria andNoa15IsNotNull() {
            addCriterion("noA15 is not null");
            return (Criteria) this;
        }

        public Criteria andNoa15EqualTo(Double value) {
            addCriterion("noA15 =", value, "noa15");
            return (Criteria) this;
        }

        public Criteria andNoa15NotEqualTo(Double value) {
            addCriterion("noA15 <>", value, "noa15");
            return (Criteria) this;
        }

        public Criteria andNoa15GreaterThan(Double value) {
            addCriterion("noA15 >", value, "noa15");
            return (Criteria) this;
        }

        public Criteria andNoa15GreaterThanOrEqualTo(Double value) {
            addCriterion("noA15 >=", value, "noa15");
            return (Criteria) this;
        }

        public Criteria andNoa15LessThan(Double value) {
            addCriterion("noA15 <", value, "noa15");
            return (Criteria) this;
        }

        public Criteria andNoa15LessThanOrEqualTo(Double value) {
            addCriterion("noA15 <=", value, "noa15");
            return (Criteria) this;
        }

        public Criteria andNoa15In(List<Double> values) {
            addCriterion("noA15 in", values, "noa15");
            return (Criteria) this;
        }

        public Criteria andNoa15NotIn(List<Double> values) {
            addCriterion("noA15 not in", values, "noa15");
            return (Criteria) this;
        }

        public Criteria andNoa15Between(Double value1, Double value2) {
            addCriterion("noA15 between", value1, value2, "noa15");
            return (Criteria) this;
        }

        public Criteria andNoa15NotBetween(Double value1, Double value2) {
            addCriterion("noA15 not between", value1, value2, "noa15");
            return (Criteria) this;
        }

        public Criteria andNoa16IsNull() {
            addCriterion("noA16 is null");
            return (Criteria) this;
        }

        public Criteria andNoa16IsNotNull() {
            addCriterion("noA16 is not null");
            return (Criteria) this;
        }

        public Criteria andNoa16EqualTo(Double value) {
            addCriterion("noA16 =", value, "noa16");
            return (Criteria) this;
        }

        public Criteria andNoa16NotEqualTo(Double value) {
            addCriterion("noA16 <>", value, "noa16");
            return (Criteria) this;
        }

        public Criteria andNoa16GreaterThan(Double value) {
            addCriterion("noA16 >", value, "noa16");
            return (Criteria) this;
        }

        public Criteria andNoa16GreaterThanOrEqualTo(Double value) {
            addCriterion("noA16 >=", value, "noa16");
            return (Criteria) this;
        }

        public Criteria andNoa16LessThan(Double value) {
            addCriterion("noA16 <", value, "noa16");
            return (Criteria) this;
        }

        public Criteria andNoa16LessThanOrEqualTo(Double value) {
            addCriterion("noA16 <=", value, "noa16");
            return (Criteria) this;
        }

        public Criteria andNoa16In(List<Double> values) {
            addCriterion("noA16 in", values, "noa16");
            return (Criteria) this;
        }

        public Criteria andNoa16NotIn(List<Double> values) {
            addCriterion("noA16 not in", values, "noa16");
            return (Criteria) this;
        }

        public Criteria andNoa16Between(Double value1, Double value2) {
            addCriterion("noA16 between", value1, value2, "noa16");
            return (Criteria) this;
        }

        public Criteria andNoa16NotBetween(Double value1, Double value2) {
            addCriterion("noA16 not between", value1, value2, "noa16");
            return (Criteria) this;
        }

        public Criteria andNoa17IsNull() {
            addCriterion("noA17 is null");
            return (Criteria) this;
        }

        public Criteria andNoa17IsNotNull() {
            addCriterion("noA17 is not null");
            return (Criteria) this;
        }

        public Criteria andNoa17EqualTo(Double value) {
            addCriterion("noA17 =", value, "noa17");
            return (Criteria) this;
        }

        public Criteria andNoa17NotEqualTo(Double value) {
            addCriterion("noA17 <>", value, "noa17");
            return (Criteria) this;
        }

        public Criteria andNoa17GreaterThan(Double value) {
            addCriterion("noA17 >", value, "noa17");
            return (Criteria) this;
        }

        public Criteria andNoa17GreaterThanOrEqualTo(Double value) {
            addCriterion("noA17 >=", value, "noa17");
            return (Criteria) this;
        }

        public Criteria andNoa17LessThan(Double value) {
            addCriterion("noA17 <", value, "noa17");
            return (Criteria) this;
        }

        public Criteria andNoa17LessThanOrEqualTo(Double value) {
            addCriterion("noA17 <=", value, "noa17");
            return (Criteria) this;
        }

        public Criteria andNoa17In(List<Double> values) {
            addCriterion("noA17 in", values, "noa17");
            return (Criteria) this;
        }

        public Criteria andNoa17NotIn(List<Double> values) {
            addCriterion("noA17 not in", values, "noa17");
            return (Criteria) this;
        }

        public Criteria andNoa17Between(Double value1, Double value2) {
            addCriterion("noA17 between", value1, value2, "noa17");
            return (Criteria) this;
        }

        public Criteria andNoa17NotBetween(Double value1, Double value2) {
            addCriterion("noA17 not between", value1, value2, "noa17");
            return (Criteria) this;
        }

        public Criteria andNoa18IsNull() {
            addCriterion("noA18 is null");
            return (Criteria) this;
        }

        public Criteria andNoa18IsNotNull() {
            addCriterion("noA18 is not null");
            return (Criteria) this;
        }

        public Criteria andNoa18EqualTo(Double value) {
            addCriterion("noA18 =", value, "noa18");
            return (Criteria) this;
        }

        public Criteria andNoa18NotEqualTo(Double value) {
            addCriterion("noA18 <>", value, "noa18");
            return (Criteria) this;
        }

        public Criteria andNoa18GreaterThan(Double value) {
            addCriterion("noA18 >", value, "noa18");
            return (Criteria) this;
        }

        public Criteria andNoa18GreaterThanOrEqualTo(Double value) {
            addCriterion("noA18 >=", value, "noa18");
            return (Criteria) this;
        }

        public Criteria andNoa18LessThan(Double value) {
            addCriterion("noA18 <", value, "noa18");
            return (Criteria) this;
        }

        public Criteria andNoa18LessThanOrEqualTo(Double value) {
            addCriterion("noA18 <=", value, "noa18");
            return (Criteria) this;
        }

        public Criteria andNoa18In(List<Double> values) {
            addCriterion("noA18 in", values, "noa18");
            return (Criteria) this;
        }

        public Criteria andNoa18NotIn(List<Double> values) {
            addCriterion("noA18 not in", values, "noa18");
            return (Criteria) this;
        }

        public Criteria andNoa18Between(Double value1, Double value2) {
            addCriterion("noA18 between", value1, value2, "noa18");
            return (Criteria) this;
        }

        public Criteria andNoa18NotBetween(Double value1, Double value2) {
            addCriterion("noA18 not between", value1, value2, "noa18");
            return (Criteria) this;
        }

        public Criteria andNoa19IsNull() {
            addCriterion("noA19 is null");
            return (Criteria) this;
        }

        public Criteria andNoa19IsNotNull() {
            addCriterion("noA19 is not null");
            return (Criteria) this;
        }

        public Criteria andNoa19EqualTo(Double value) {
            addCriterion("noA19 =", value, "noa19");
            return (Criteria) this;
        }

        public Criteria andNoa19NotEqualTo(Double value) {
            addCriterion("noA19 <>", value, "noa19");
            return (Criteria) this;
        }

        public Criteria andNoa19GreaterThan(Double value) {
            addCriterion("noA19 >", value, "noa19");
            return (Criteria) this;
        }

        public Criteria andNoa19GreaterThanOrEqualTo(Double value) {
            addCriterion("noA19 >=", value, "noa19");
            return (Criteria) this;
        }

        public Criteria andNoa19LessThan(Double value) {
            addCriterion("noA19 <", value, "noa19");
            return (Criteria) this;
        }

        public Criteria andNoa19LessThanOrEqualTo(Double value) {
            addCriterion("noA19 <=", value, "noa19");
            return (Criteria) this;
        }

        public Criteria andNoa19In(List<Double> values) {
            addCriterion("noA19 in", values, "noa19");
            return (Criteria) this;
        }

        public Criteria andNoa19NotIn(List<Double> values) {
            addCriterion("noA19 not in", values, "noa19");
            return (Criteria) this;
        }

        public Criteria andNoa19Between(Double value1, Double value2) {
            addCriterion("noA19 between", value1, value2, "noa19");
            return (Criteria) this;
        }

        public Criteria andNoa19NotBetween(Double value1, Double value2) {
            addCriterion("noA19 not between", value1, value2, "noa19");
            return (Criteria) this;
        }

        public Criteria andNoa20IsNull() {
            addCriterion("noA20 is null");
            return (Criteria) this;
        }

        public Criteria andNoa20IsNotNull() {
            addCriterion("noA20 is not null");
            return (Criteria) this;
        }

        public Criteria andNoa20EqualTo(Double value) {
            addCriterion("noA20 =", value, "noa20");
            return (Criteria) this;
        }

        public Criteria andNoa20NotEqualTo(Double value) {
            addCriterion("noA20 <>", value, "noa20");
            return (Criteria) this;
        }

        public Criteria andNoa20GreaterThan(Double value) {
            addCriterion("noA20 >", value, "noa20");
            return (Criteria) this;
        }

        public Criteria andNoa20GreaterThanOrEqualTo(Double value) {
            addCriterion("noA20 >=", value, "noa20");
            return (Criteria) this;
        }

        public Criteria andNoa20LessThan(Double value) {
            addCriterion("noA20 <", value, "noa20");
            return (Criteria) this;
        }

        public Criteria andNoa20LessThanOrEqualTo(Double value) {
            addCriterion("noA20 <=", value, "noa20");
            return (Criteria) this;
        }

        public Criteria andNoa20In(List<Double> values) {
            addCriterion("noA20 in", values, "noa20");
            return (Criteria) this;
        }

        public Criteria andNoa20NotIn(List<Double> values) {
            addCriterion("noA20 not in", values, "noa20");
            return (Criteria) this;
        }

        public Criteria andNoa20Between(Double value1, Double value2) {
            addCriterion("noA20 between", value1, value2, "noa20");
            return (Criteria) this;
        }

        public Criteria andNoa20NotBetween(Double value1, Double value2) {
            addCriterion("noA20 not between", value1, value2, "noa20");
            return (Criteria) this;
        }

        public Criteria andNoa21IsNull() {
            addCriterion("noA21 is null");
            return (Criteria) this;
        }

        public Criteria andNoa21IsNotNull() {
            addCriterion("noA21 is not null");
            return (Criteria) this;
        }

        public Criteria andNoa21EqualTo(Double value) {
            addCriterion("noA21 =", value, "noa21");
            return (Criteria) this;
        }

        public Criteria andNoa21NotEqualTo(Double value) {
            addCriterion("noA21 <>", value, "noa21");
            return (Criteria) this;
        }

        public Criteria andNoa21GreaterThan(Double value) {
            addCriterion("noA21 >", value, "noa21");
            return (Criteria) this;
        }

        public Criteria andNoa21GreaterThanOrEqualTo(Double value) {
            addCriterion("noA21 >=", value, "noa21");
            return (Criteria) this;
        }

        public Criteria andNoa21LessThan(Double value) {
            addCriterion("noA21 <", value, "noa21");
            return (Criteria) this;
        }

        public Criteria andNoa21LessThanOrEqualTo(Double value) {
            addCriterion("noA21 <=", value, "noa21");
            return (Criteria) this;
        }

        public Criteria andNoa21In(List<Double> values) {
            addCriterion("noA21 in", values, "noa21");
            return (Criteria) this;
        }

        public Criteria andNoa21NotIn(List<Double> values) {
            addCriterion("noA21 not in", values, "noa21");
            return (Criteria) this;
        }

        public Criteria andNoa21Between(Double value1, Double value2) {
            addCriterion("noA21 between", value1, value2, "noa21");
            return (Criteria) this;
        }

        public Criteria andNoa21NotBetween(Double value1, Double value2) {
            addCriterion("noA21 not between", value1, value2, "noa21");
            return (Criteria) this;
        }

        public Criteria andNoa22IsNull() {
            addCriterion("noA22 is null");
            return (Criteria) this;
        }

        public Criteria andNoa22IsNotNull() {
            addCriterion("noA22 is not null");
            return (Criteria) this;
        }

        public Criteria andNoa22EqualTo(Double value) {
            addCriterion("noA22 =", value, "noa22");
            return (Criteria) this;
        }

        public Criteria andNoa22NotEqualTo(Double value) {
            addCriterion("noA22 <>", value, "noa22");
            return (Criteria) this;
        }

        public Criteria andNoa22GreaterThan(Double value) {
            addCriterion("noA22 >", value, "noa22");
            return (Criteria) this;
        }

        public Criteria andNoa22GreaterThanOrEqualTo(Double value) {
            addCriterion("noA22 >=", value, "noa22");
            return (Criteria) this;
        }

        public Criteria andNoa22LessThan(Double value) {
            addCriterion("noA22 <", value, "noa22");
            return (Criteria) this;
        }

        public Criteria andNoa22LessThanOrEqualTo(Double value) {
            addCriterion("noA22 <=", value, "noa22");
            return (Criteria) this;
        }

        public Criteria andNoa22In(List<Double> values) {
            addCriterion("noA22 in", values, "noa22");
            return (Criteria) this;
        }

        public Criteria andNoa22NotIn(List<Double> values) {
            addCriterion("noA22 not in", values, "noa22");
            return (Criteria) this;
        }

        public Criteria andNoa22Between(Double value1, Double value2) {
            addCriterion("noA22 between", value1, value2, "noa22");
            return (Criteria) this;
        }

        public Criteria andNoa22NotBetween(Double value1, Double value2) {
            addCriterion("noA22 not between", value1, value2, "noa22");
            return (Criteria) this;
        }

        public Criteria andNoa23IsNull() {
            addCriterion("noA23 is null");
            return (Criteria) this;
        }

        public Criteria andNoa23IsNotNull() {
            addCriterion("noA23 is not null");
            return (Criteria) this;
        }

        public Criteria andNoa23EqualTo(Double value) {
            addCriterion("noA23 =", value, "noa23");
            return (Criteria) this;
        }

        public Criteria andNoa23NotEqualTo(Double value) {
            addCriterion("noA23 <>", value, "noa23");
            return (Criteria) this;
        }

        public Criteria andNoa23GreaterThan(Double value) {
            addCriterion("noA23 >", value, "noa23");
            return (Criteria) this;
        }

        public Criteria andNoa23GreaterThanOrEqualTo(Double value) {
            addCriterion("noA23 >=", value, "noa23");
            return (Criteria) this;
        }

        public Criteria andNoa23LessThan(Double value) {
            addCriterion("noA23 <", value, "noa23");
            return (Criteria) this;
        }

        public Criteria andNoa23LessThanOrEqualTo(Double value) {
            addCriterion("noA23 <=", value, "noa23");
            return (Criteria) this;
        }

        public Criteria andNoa23In(List<Double> values) {
            addCriterion("noA23 in", values, "noa23");
            return (Criteria) this;
        }

        public Criteria andNoa23NotIn(List<Double> values) {
            addCriterion("noA23 not in", values, "noa23");
            return (Criteria) this;
        }

        public Criteria andNoa23Between(Double value1, Double value2) {
            addCriterion("noA23 between", value1, value2, "noa23");
            return (Criteria) this;
        }

        public Criteria andNoa23NotBetween(Double value1, Double value2) {
            addCriterion("noA23 not between", value1, value2, "noa23");
            return (Criteria) this;
        }

        public Criteria andNoa24IsNull() {
            addCriterion("noA24 is null");
            return (Criteria) this;
        }

        public Criteria andNoa24IsNotNull() {
            addCriterion("noA24 is not null");
            return (Criteria) this;
        }

        public Criteria andNoa24EqualTo(Double value) {
            addCriterion("noA24 =", value, "noa24");
            return (Criteria) this;
        }

        public Criteria andNoa24NotEqualTo(Double value) {
            addCriterion("noA24 <>", value, "noa24");
            return (Criteria) this;
        }

        public Criteria andNoa24GreaterThan(Double value) {
            addCriterion("noA24 >", value, "noa24");
            return (Criteria) this;
        }

        public Criteria andNoa24GreaterThanOrEqualTo(Double value) {
            addCriterion("noA24 >=", value, "noa24");
            return (Criteria) this;
        }

        public Criteria andNoa24LessThan(Double value) {
            addCriterion("noA24 <", value, "noa24");
            return (Criteria) this;
        }

        public Criteria andNoa24LessThanOrEqualTo(Double value) {
            addCriterion("noA24 <=", value, "noa24");
            return (Criteria) this;
        }

        public Criteria andNoa24In(List<Double> values) {
            addCriterion("noA24 in", values, "noa24");
            return (Criteria) this;
        }

        public Criteria andNoa24NotIn(List<Double> values) {
            addCriterion("noA24 not in", values, "noa24");
            return (Criteria) this;
        }

        public Criteria andNoa24Between(Double value1, Double value2) {
            addCriterion("noA24 between", value1, value2, "noa24");
            return (Criteria) this;
        }

        public Criteria andNoa24NotBetween(Double value1, Double value2) {
            addCriterion("noA24 not between", value1, value2, "noa24");
            return (Criteria) this;
        }

        public Criteria andCoa1IsNull() {
            addCriterion("coA1 is null");
            return (Criteria) this;
        }

        public Criteria andCoa1IsNotNull() {
            addCriterion("coA1 is not null");
            return (Criteria) this;
        }

        public Criteria andCoa1EqualTo(Double value) {
            addCriterion("coA1 =", value, "coa1");
            return (Criteria) this;
        }

        public Criteria andCoa1NotEqualTo(Double value) {
            addCriterion("coA1 <>", value, "coa1");
            return (Criteria) this;
        }

        public Criteria andCoa1GreaterThan(Double value) {
            addCriterion("coA1 >", value, "coa1");
            return (Criteria) this;
        }

        public Criteria andCoa1GreaterThanOrEqualTo(Double value) {
            addCriterion("coA1 >=", value, "coa1");
            return (Criteria) this;
        }

        public Criteria andCoa1LessThan(Double value) {
            addCriterion("coA1 <", value, "coa1");
            return (Criteria) this;
        }

        public Criteria andCoa1LessThanOrEqualTo(Double value) {
            addCriterion("coA1 <=", value, "coa1");
            return (Criteria) this;
        }

        public Criteria andCoa1In(List<Double> values) {
            addCriterion("coA1 in", values, "coa1");
            return (Criteria) this;
        }

        public Criteria andCoa1NotIn(List<Double> values) {
            addCriterion("coA1 not in", values, "coa1");
            return (Criteria) this;
        }

        public Criteria andCoa1Between(Double value1, Double value2) {
            addCriterion("coA1 between", value1, value2, "coa1");
            return (Criteria) this;
        }

        public Criteria andCoa1NotBetween(Double value1, Double value2) {
            addCriterion("coA1 not between", value1, value2, "coa1");
            return (Criteria) this;
        }

        public Criteria andCoa2IsNull() {
            addCriterion("coA2 is null");
            return (Criteria) this;
        }

        public Criteria andCoa2IsNotNull() {
            addCriterion("coA2 is not null");
            return (Criteria) this;
        }

        public Criteria andCoa2EqualTo(Double value) {
            addCriterion("coA2 =", value, "coa2");
            return (Criteria) this;
        }

        public Criteria andCoa2NotEqualTo(Double value) {
            addCriterion("coA2 <>", value, "coa2");
            return (Criteria) this;
        }

        public Criteria andCoa2GreaterThan(Double value) {
            addCriterion("coA2 >", value, "coa2");
            return (Criteria) this;
        }

        public Criteria andCoa2GreaterThanOrEqualTo(Double value) {
            addCriterion("coA2 >=", value, "coa2");
            return (Criteria) this;
        }

        public Criteria andCoa2LessThan(Double value) {
            addCriterion("coA2 <", value, "coa2");
            return (Criteria) this;
        }

        public Criteria andCoa2LessThanOrEqualTo(Double value) {
            addCriterion("coA2 <=", value, "coa2");
            return (Criteria) this;
        }

        public Criteria andCoa2In(List<Double> values) {
            addCriterion("coA2 in", values, "coa2");
            return (Criteria) this;
        }

        public Criteria andCoa2NotIn(List<Double> values) {
            addCriterion("coA2 not in", values, "coa2");
            return (Criteria) this;
        }

        public Criteria andCoa2Between(Double value1, Double value2) {
            addCriterion("coA2 between", value1, value2, "coa2");
            return (Criteria) this;
        }

        public Criteria andCoa2NotBetween(Double value1, Double value2) {
            addCriterion("coA2 not between", value1, value2, "coa2");
            return (Criteria) this;
        }

        public Criteria andCoa3IsNull() {
            addCriterion("coA3 is null");
            return (Criteria) this;
        }

        public Criteria andCoa3IsNotNull() {
            addCriterion("coA3 is not null");
            return (Criteria) this;
        }

        public Criteria andCoa3EqualTo(Double value) {
            addCriterion("coA3 =", value, "coa3");
            return (Criteria) this;
        }

        public Criteria andCoa3NotEqualTo(Double value) {
            addCriterion("coA3 <>", value, "coa3");
            return (Criteria) this;
        }

        public Criteria andCoa3GreaterThan(Double value) {
            addCriterion("coA3 >", value, "coa3");
            return (Criteria) this;
        }

        public Criteria andCoa3GreaterThanOrEqualTo(Double value) {
            addCriterion("coA3 >=", value, "coa3");
            return (Criteria) this;
        }

        public Criteria andCoa3LessThan(Double value) {
            addCriterion("coA3 <", value, "coa3");
            return (Criteria) this;
        }

        public Criteria andCoa3LessThanOrEqualTo(Double value) {
            addCriterion("coA3 <=", value, "coa3");
            return (Criteria) this;
        }

        public Criteria andCoa3In(List<Double> values) {
            addCriterion("coA3 in", values, "coa3");
            return (Criteria) this;
        }

        public Criteria andCoa3NotIn(List<Double> values) {
            addCriterion("coA3 not in", values, "coa3");
            return (Criteria) this;
        }

        public Criteria andCoa3Between(Double value1, Double value2) {
            addCriterion("coA3 between", value1, value2, "coa3");
            return (Criteria) this;
        }

        public Criteria andCoa3NotBetween(Double value1, Double value2) {
            addCriterion("coA3 not between", value1, value2, "coa3");
            return (Criteria) this;
        }

        public Criteria andCoa4IsNull() {
            addCriterion("coA4 is null");
            return (Criteria) this;
        }

        public Criteria andCoa4IsNotNull() {
            addCriterion("coA4 is not null");
            return (Criteria) this;
        }

        public Criteria andCoa4EqualTo(Double value) {
            addCriterion("coA4 =", value, "coa4");
            return (Criteria) this;
        }

        public Criteria andCoa4NotEqualTo(Double value) {
            addCriterion("coA4 <>", value, "coa4");
            return (Criteria) this;
        }

        public Criteria andCoa4GreaterThan(Double value) {
            addCriterion("coA4 >", value, "coa4");
            return (Criteria) this;
        }

        public Criteria andCoa4GreaterThanOrEqualTo(Double value) {
            addCriterion("coA4 >=", value, "coa4");
            return (Criteria) this;
        }

        public Criteria andCoa4LessThan(Double value) {
            addCriterion("coA4 <", value, "coa4");
            return (Criteria) this;
        }

        public Criteria andCoa4LessThanOrEqualTo(Double value) {
            addCriterion("coA4 <=", value, "coa4");
            return (Criteria) this;
        }

        public Criteria andCoa4In(List<Double> values) {
            addCriterion("coA4 in", values, "coa4");
            return (Criteria) this;
        }

        public Criteria andCoa4NotIn(List<Double> values) {
            addCriterion("coA4 not in", values, "coa4");
            return (Criteria) this;
        }

        public Criteria andCoa4Between(Double value1, Double value2) {
            addCriterion("coA4 between", value1, value2, "coa4");
            return (Criteria) this;
        }

        public Criteria andCoa4NotBetween(Double value1, Double value2) {
            addCriterion("coA4 not between", value1, value2, "coa4");
            return (Criteria) this;
        }

        public Criteria andCoa5IsNull() {
            addCriterion("coA5 is null");
            return (Criteria) this;
        }

        public Criteria andCoa5IsNotNull() {
            addCriterion("coA5 is not null");
            return (Criteria) this;
        }

        public Criteria andCoa5EqualTo(Double value) {
            addCriterion("coA5 =", value, "coa5");
            return (Criteria) this;
        }

        public Criteria andCoa5NotEqualTo(Double value) {
            addCriterion("coA5 <>", value, "coa5");
            return (Criteria) this;
        }

        public Criteria andCoa5GreaterThan(Double value) {
            addCriterion("coA5 >", value, "coa5");
            return (Criteria) this;
        }

        public Criteria andCoa5GreaterThanOrEqualTo(Double value) {
            addCriterion("coA5 >=", value, "coa5");
            return (Criteria) this;
        }

        public Criteria andCoa5LessThan(Double value) {
            addCriterion("coA5 <", value, "coa5");
            return (Criteria) this;
        }

        public Criteria andCoa5LessThanOrEqualTo(Double value) {
            addCriterion("coA5 <=", value, "coa5");
            return (Criteria) this;
        }

        public Criteria andCoa5In(List<Double> values) {
            addCriterion("coA5 in", values, "coa5");
            return (Criteria) this;
        }

        public Criteria andCoa5NotIn(List<Double> values) {
            addCriterion("coA5 not in", values, "coa5");
            return (Criteria) this;
        }

        public Criteria andCoa5Between(Double value1, Double value2) {
            addCriterion("coA5 between", value1, value2, "coa5");
            return (Criteria) this;
        }

        public Criteria andCoa5NotBetween(Double value1, Double value2) {
            addCriterion("coA5 not between", value1, value2, "coa5");
            return (Criteria) this;
        }

        public Criteria andCoa6IsNull() {
            addCriterion("coA6 is null");
            return (Criteria) this;
        }

        public Criteria andCoa6IsNotNull() {
            addCriterion("coA6 is not null");
            return (Criteria) this;
        }

        public Criteria andCoa6EqualTo(Double value) {
            addCriterion("coA6 =", value, "coa6");
            return (Criteria) this;
        }

        public Criteria andCoa6NotEqualTo(Double value) {
            addCriterion("coA6 <>", value, "coa6");
            return (Criteria) this;
        }

        public Criteria andCoa6GreaterThan(Double value) {
            addCriterion("coA6 >", value, "coa6");
            return (Criteria) this;
        }

        public Criteria andCoa6GreaterThanOrEqualTo(Double value) {
            addCriterion("coA6 >=", value, "coa6");
            return (Criteria) this;
        }

        public Criteria andCoa6LessThan(Double value) {
            addCriterion("coA6 <", value, "coa6");
            return (Criteria) this;
        }

        public Criteria andCoa6LessThanOrEqualTo(Double value) {
            addCriterion("coA6 <=", value, "coa6");
            return (Criteria) this;
        }

        public Criteria andCoa6In(List<Double> values) {
            addCriterion("coA6 in", values, "coa6");
            return (Criteria) this;
        }

        public Criteria andCoa6NotIn(List<Double> values) {
            addCriterion("coA6 not in", values, "coa6");
            return (Criteria) this;
        }

        public Criteria andCoa6Between(Double value1, Double value2) {
            addCriterion("coA6 between", value1, value2, "coa6");
            return (Criteria) this;
        }

        public Criteria andCoa6NotBetween(Double value1, Double value2) {
            addCriterion("coA6 not between", value1, value2, "coa6");
            return (Criteria) this;
        }

        public Criteria andCoa7IsNull() {
            addCriterion("coA7 is null");
            return (Criteria) this;
        }

        public Criteria andCoa7IsNotNull() {
            addCriterion("coA7 is not null");
            return (Criteria) this;
        }

        public Criteria andCoa7EqualTo(Double value) {
            addCriterion("coA7 =", value, "coa7");
            return (Criteria) this;
        }

        public Criteria andCoa7NotEqualTo(Double value) {
            addCriterion("coA7 <>", value, "coa7");
            return (Criteria) this;
        }

        public Criteria andCoa7GreaterThan(Double value) {
            addCriterion("coA7 >", value, "coa7");
            return (Criteria) this;
        }

        public Criteria andCoa7GreaterThanOrEqualTo(Double value) {
            addCriterion("coA7 >=", value, "coa7");
            return (Criteria) this;
        }

        public Criteria andCoa7LessThan(Double value) {
            addCriterion("coA7 <", value, "coa7");
            return (Criteria) this;
        }

        public Criteria andCoa7LessThanOrEqualTo(Double value) {
            addCriterion("coA7 <=", value, "coa7");
            return (Criteria) this;
        }

        public Criteria andCoa7In(List<Double> values) {
            addCriterion("coA7 in", values, "coa7");
            return (Criteria) this;
        }

        public Criteria andCoa7NotIn(List<Double> values) {
            addCriterion("coA7 not in", values, "coa7");
            return (Criteria) this;
        }

        public Criteria andCoa7Between(Double value1, Double value2) {
            addCriterion("coA7 between", value1, value2, "coa7");
            return (Criteria) this;
        }

        public Criteria andCoa7NotBetween(Double value1, Double value2) {
            addCriterion("coA7 not between", value1, value2, "coa7");
            return (Criteria) this;
        }

        public Criteria andCoa8IsNull() {
            addCriterion("coA8 is null");
            return (Criteria) this;
        }

        public Criteria andCoa8IsNotNull() {
            addCriterion("coA8 is not null");
            return (Criteria) this;
        }

        public Criteria andCoa8EqualTo(Double value) {
            addCriterion("coA8 =", value, "coa8");
            return (Criteria) this;
        }

        public Criteria andCoa8NotEqualTo(Double value) {
            addCriterion("coA8 <>", value, "coa8");
            return (Criteria) this;
        }

        public Criteria andCoa8GreaterThan(Double value) {
            addCriterion("coA8 >", value, "coa8");
            return (Criteria) this;
        }

        public Criteria andCoa8GreaterThanOrEqualTo(Double value) {
            addCriterion("coA8 >=", value, "coa8");
            return (Criteria) this;
        }

        public Criteria andCoa8LessThan(Double value) {
            addCriterion("coA8 <", value, "coa8");
            return (Criteria) this;
        }

        public Criteria andCoa8LessThanOrEqualTo(Double value) {
            addCriterion("coA8 <=", value, "coa8");
            return (Criteria) this;
        }

        public Criteria andCoa8In(List<Double> values) {
            addCriterion("coA8 in", values, "coa8");
            return (Criteria) this;
        }

        public Criteria andCoa8NotIn(List<Double> values) {
            addCriterion("coA8 not in", values, "coa8");
            return (Criteria) this;
        }

        public Criteria andCoa8Between(Double value1, Double value2) {
            addCriterion("coA8 between", value1, value2, "coa8");
            return (Criteria) this;
        }

        public Criteria andCoa8NotBetween(Double value1, Double value2) {
            addCriterion("coA8 not between", value1, value2, "coa8");
            return (Criteria) this;
        }

        public Criteria andCoa9IsNull() {
            addCriterion("coA9 is null");
            return (Criteria) this;
        }

        public Criteria andCoa9IsNotNull() {
            addCriterion("coA9 is not null");
            return (Criteria) this;
        }

        public Criteria andCoa9EqualTo(Double value) {
            addCriterion("coA9 =", value, "coa9");
            return (Criteria) this;
        }

        public Criteria andCoa9NotEqualTo(Double value) {
            addCriterion("coA9 <>", value, "coa9");
            return (Criteria) this;
        }

        public Criteria andCoa9GreaterThan(Double value) {
            addCriterion("coA9 >", value, "coa9");
            return (Criteria) this;
        }

        public Criteria andCoa9GreaterThanOrEqualTo(Double value) {
            addCriterion("coA9 >=", value, "coa9");
            return (Criteria) this;
        }

        public Criteria andCoa9LessThan(Double value) {
            addCriterion("coA9 <", value, "coa9");
            return (Criteria) this;
        }

        public Criteria andCoa9LessThanOrEqualTo(Double value) {
            addCriterion("coA9 <=", value, "coa9");
            return (Criteria) this;
        }

        public Criteria andCoa9In(List<Double> values) {
            addCriterion("coA9 in", values, "coa9");
            return (Criteria) this;
        }

        public Criteria andCoa9NotIn(List<Double> values) {
            addCriterion("coA9 not in", values, "coa9");
            return (Criteria) this;
        }

        public Criteria andCoa9Between(Double value1, Double value2) {
            addCriterion("coA9 between", value1, value2, "coa9");
            return (Criteria) this;
        }

        public Criteria andCoa9NotBetween(Double value1, Double value2) {
            addCriterion("coA9 not between", value1, value2, "coa9");
            return (Criteria) this;
        }

        public Criteria andCoa10IsNull() {
            addCriterion("coA10 is null");
            return (Criteria) this;
        }

        public Criteria andCoa10IsNotNull() {
            addCriterion("coA10 is not null");
            return (Criteria) this;
        }

        public Criteria andCoa10EqualTo(Double value) {
            addCriterion("coA10 =", value, "coa10");
            return (Criteria) this;
        }

        public Criteria andCoa10NotEqualTo(Double value) {
            addCriterion("coA10 <>", value, "coa10");
            return (Criteria) this;
        }

        public Criteria andCoa10GreaterThan(Double value) {
            addCriterion("coA10 >", value, "coa10");
            return (Criteria) this;
        }

        public Criteria andCoa10GreaterThanOrEqualTo(Double value) {
            addCriterion("coA10 >=", value, "coa10");
            return (Criteria) this;
        }

        public Criteria andCoa10LessThan(Double value) {
            addCriterion("coA10 <", value, "coa10");
            return (Criteria) this;
        }

        public Criteria andCoa10LessThanOrEqualTo(Double value) {
            addCriterion("coA10 <=", value, "coa10");
            return (Criteria) this;
        }

        public Criteria andCoa10In(List<Double> values) {
            addCriterion("coA10 in", values, "coa10");
            return (Criteria) this;
        }

        public Criteria andCoa10NotIn(List<Double> values) {
            addCriterion("coA10 not in", values, "coa10");
            return (Criteria) this;
        }

        public Criteria andCoa10Between(Double value1, Double value2) {
            addCriterion("coA10 between", value1, value2, "coa10");
            return (Criteria) this;
        }

        public Criteria andCoa10NotBetween(Double value1, Double value2) {
            addCriterion("coA10 not between", value1, value2, "coa10");
            return (Criteria) this;
        }

        public Criteria andCoa11IsNull() {
            addCriterion("coA11 is null");
            return (Criteria) this;
        }

        public Criteria andCoa11IsNotNull() {
            addCriterion("coA11 is not null");
            return (Criteria) this;
        }

        public Criteria andCoa11EqualTo(Double value) {
            addCriterion("coA11 =", value, "coa11");
            return (Criteria) this;
        }

        public Criteria andCoa11NotEqualTo(Double value) {
            addCriterion("coA11 <>", value, "coa11");
            return (Criteria) this;
        }

        public Criteria andCoa11GreaterThan(Double value) {
            addCriterion("coA11 >", value, "coa11");
            return (Criteria) this;
        }

        public Criteria andCoa11GreaterThanOrEqualTo(Double value) {
            addCriterion("coA11 >=", value, "coa11");
            return (Criteria) this;
        }

        public Criteria andCoa11LessThan(Double value) {
            addCriterion("coA11 <", value, "coa11");
            return (Criteria) this;
        }

        public Criteria andCoa11LessThanOrEqualTo(Double value) {
            addCriterion("coA11 <=", value, "coa11");
            return (Criteria) this;
        }

        public Criteria andCoa11In(List<Double> values) {
            addCriterion("coA11 in", values, "coa11");
            return (Criteria) this;
        }

        public Criteria andCoa11NotIn(List<Double> values) {
            addCriterion("coA11 not in", values, "coa11");
            return (Criteria) this;
        }

        public Criteria andCoa11Between(Double value1, Double value2) {
            addCriterion("coA11 between", value1, value2, "coa11");
            return (Criteria) this;
        }

        public Criteria andCoa11NotBetween(Double value1, Double value2) {
            addCriterion("coA11 not between", value1, value2, "coa11");
            return (Criteria) this;
        }

        public Criteria andCoa12IsNull() {
            addCriterion("coA12 is null");
            return (Criteria) this;
        }

        public Criteria andCoa12IsNotNull() {
            addCriterion("coA12 is not null");
            return (Criteria) this;
        }

        public Criteria andCoa12EqualTo(Double value) {
            addCriterion("coA12 =", value, "coa12");
            return (Criteria) this;
        }

        public Criteria andCoa12NotEqualTo(Double value) {
            addCriterion("coA12 <>", value, "coa12");
            return (Criteria) this;
        }

        public Criteria andCoa12GreaterThan(Double value) {
            addCriterion("coA12 >", value, "coa12");
            return (Criteria) this;
        }

        public Criteria andCoa12GreaterThanOrEqualTo(Double value) {
            addCriterion("coA12 >=", value, "coa12");
            return (Criteria) this;
        }

        public Criteria andCoa12LessThan(Double value) {
            addCriterion("coA12 <", value, "coa12");
            return (Criteria) this;
        }

        public Criteria andCoa12LessThanOrEqualTo(Double value) {
            addCriterion("coA12 <=", value, "coa12");
            return (Criteria) this;
        }

        public Criteria andCoa12In(List<Double> values) {
            addCriterion("coA12 in", values, "coa12");
            return (Criteria) this;
        }

        public Criteria andCoa12NotIn(List<Double> values) {
            addCriterion("coA12 not in", values, "coa12");
            return (Criteria) this;
        }

        public Criteria andCoa12Between(Double value1, Double value2) {
            addCriterion("coA12 between", value1, value2, "coa12");
            return (Criteria) this;
        }

        public Criteria andCoa12NotBetween(Double value1, Double value2) {
            addCriterion("coA12 not between", value1, value2, "coa12");
            return (Criteria) this;
        }

        public Criteria andCoa13IsNull() {
            addCriterion("coA13 is null");
            return (Criteria) this;
        }

        public Criteria andCoa13IsNotNull() {
            addCriterion("coA13 is not null");
            return (Criteria) this;
        }

        public Criteria andCoa13EqualTo(Double value) {
            addCriterion("coA13 =", value, "coa13");
            return (Criteria) this;
        }

        public Criteria andCoa13NotEqualTo(Double value) {
            addCriterion("coA13 <>", value, "coa13");
            return (Criteria) this;
        }

        public Criteria andCoa13GreaterThan(Double value) {
            addCriterion("coA13 >", value, "coa13");
            return (Criteria) this;
        }

        public Criteria andCoa13GreaterThanOrEqualTo(Double value) {
            addCriterion("coA13 >=", value, "coa13");
            return (Criteria) this;
        }

        public Criteria andCoa13LessThan(Double value) {
            addCriterion("coA13 <", value, "coa13");
            return (Criteria) this;
        }

        public Criteria andCoa13LessThanOrEqualTo(Double value) {
            addCriterion("coA13 <=", value, "coa13");
            return (Criteria) this;
        }

        public Criteria andCoa13In(List<Double> values) {
            addCriterion("coA13 in", values, "coa13");
            return (Criteria) this;
        }

        public Criteria andCoa13NotIn(List<Double> values) {
            addCriterion("coA13 not in", values, "coa13");
            return (Criteria) this;
        }

        public Criteria andCoa13Between(Double value1, Double value2) {
            addCriterion("coA13 between", value1, value2, "coa13");
            return (Criteria) this;
        }

        public Criteria andCoa13NotBetween(Double value1, Double value2) {
            addCriterion("coA13 not between", value1, value2, "coa13");
            return (Criteria) this;
        }

        public Criteria andCoa14IsNull() {
            addCriterion("coA14 is null");
            return (Criteria) this;
        }

        public Criteria andCoa14IsNotNull() {
            addCriterion("coA14 is not null");
            return (Criteria) this;
        }

        public Criteria andCoa14EqualTo(Double value) {
            addCriterion("coA14 =", value, "coa14");
            return (Criteria) this;
        }

        public Criteria andCoa14NotEqualTo(Double value) {
            addCriterion("coA14 <>", value, "coa14");
            return (Criteria) this;
        }

        public Criteria andCoa14GreaterThan(Double value) {
            addCriterion("coA14 >", value, "coa14");
            return (Criteria) this;
        }

        public Criteria andCoa14GreaterThanOrEqualTo(Double value) {
            addCriterion("coA14 >=", value, "coa14");
            return (Criteria) this;
        }

        public Criteria andCoa14LessThan(Double value) {
            addCriterion("coA14 <", value, "coa14");
            return (Criteria) this;
        }

        public Criteria andCoa14LessThanOrEqualTo(Double value) {
            addCriterion("coA14 <=", value, "coa14");
            return (Criteria) this;
        }

        public Criteria andCoa14In(List<Double> values) {
            addCriterion("coA14 in", values, "coa14");
            return (Criteria) this;
        }

        public Criteria andCoa14NotIn(List<Double> values) {
            addCriterion("coA14 not in", values, "coa14");
            return (Criteria) this;
        }

        public Criteria andCoa14Between(Double value1, Double value2) {
            addCriterion("coA14 between", value1, value2, "coa14");
            return (Criteria) this;
        }

        public Criteria andCoa14NotBetween(Double value1, Double value2) {
            addCriterion("coA14 not between", value1, value2, "coa14");
            return (Criteria) this;
        }

        public Criteria andCoa15IsNull() {
            addCriterion("coA15 is null");
            return (Criteria) this;
        }

        public Criteria andCoa15IsNotNull() {
            addCriterion("coA15 is not null");
            return (Criteria) this;
        }

        public Criteria andCoa15EqualTo(Double value) {
            addCriterion("coA15 =", value, "coa15");
            return (Criteria) this;
        }

        public Criteria andCoa15NotEqualTo(Double value) {
            addCriterion("coA15 <>", value, "coa15");
            return (Criteria) this;
        }

        public Criteria andCoa15GreaterThan(Double value) {
            addCriterion("coA15 >", value, "coa15");
            return (Criteria) this;
        }

        public Criteria andCoa15GreaterThanOrEqualTo(Double value) {
            addCriterion("coA15 >=", value, "coa15");
            return (Criteria) this;
        }

        public Criteria andCoa15LessThan(Double value) {
            addCriterion("coA15 <", value, "coa15");
            return (Criteria) this;
        }

        public Criteria andCoa15LessThanOrEqualTo(Double value) {
            addCriterion("coA15 <=", value, "coa15");
            return (Criteria) this;
        }

        public Criteria andCoa15In(List<Double> values) {
            addCriterion("coA15 in", values, "coa15");
            return (Criteria) this;
        }

        public Criteria andCoa15NotIn(List<Double> values) {
            addCriterion("coA15 not in", values, "coa15");
            return (Criteria) this;
        }

        public Criteria andCoa15Between(Double value1, Double value2) {
            addCriterion("coA15 between", value1, value2, "coa15");
            return (Criteria) this;
        }

        public Criteria andCoa15NotBetween(Double value1, Double value2) {
            addCriterion("coA15 not between", value1, value2, "coa15");
            return (Criteria) this;
        }

        public Criteria andCoa16IsNull() {
            addCriterion("coA16 is null");
            return (Criteria) this;
        }

        public Criteria andCoa16IsNotNull() {
            addCriterion("coA16 is not null");
            return (Criteria) this;
        }

        public Criteria andCoa16EqualTo(Double value) {
            addCriterion("coA16 =", value, "coa16");
            return (Criteria) this;
        }

        public Criteria andCoa16NotEqualTo(Double value) {
            addCriterion("coA16 <>", value, "coa16");
            return (Criteria) this;
        }

        public Criteria andCoa16GreaterThan(Double value) {
            addCriterion("coA16 >", value, "coa16");
            return (Criteria) this;
        }

        public Criteria andCoa16GreaterThanOrEqualTo(Double value) {
            addCriterion("coA16 >=", value, "coa16");
            return (Criteria) this;
        }

        public Criteria andCoa16LessThan(Double value) {
            addCriterion("coA16 <", value, "coa16");
            return (Criteria) this;
        }

        public Criteria andCoa16LessThanOrEqualTo(Double value) {
            addCriterion("coA16 <=", value, "coa16");
            return (Criteria) this;
        }

        public Criteria andCoa16In(List<Double> values) {
            addCriterion("coA16 in", values, "coa16");
            return (Criteria) this;
        }

        public Criteria andCoa16NotIn(List<Double> values) {
            addCriterion("coA16 not in", values, "coa16");
            return (Criteria) this;
        }

        public Criteria andCoa16Between(Double value1, Double value2) {
            addCriterion("coA16 between", value1, value2, "coa16");
            return (Criteria) this;
        }

        public Criteria andCoa16NotBetween(Double value1, Double value2) {
            addCriterion("coA16 not between", value1, value2, "coa16");
            return (Criteria) this;
        }

        public Criteria andCoa17IsNull() {
            addCriterion("coA17 is null");
            return (Criteria) this;
        }

        public Criteria andCoa17IsNotNull() {
            addCriterion("coA17 is not null");
            return (Criteria) this;
        }

        public Criteria andCoa17EqualTo(Double value) {
            addCriterion("coA17 =", value, "coa17");
            return (Criteria) this;
        }

        public Criteria andCoa17NotEqualTo(Double value) {
            addCriterion("coA17 <>", value, "coa17");
            return (Criteria) this;
        }

        public Criteria andCoa17GreaterThan(Double value) {
            addCriterion("coA17 >", value, "coa17");
            return (Criteria) this;
        }

        public Criteria andCoa17GreaterThanOrEqualTo(Double value) {
            addCriterion("coA17 >=", value, "coa17");
            return (Criteria) this;
        }

        public Criteria andCoa17LessThan(Double value) {
            addCriterion("coA17 <", value, "coa17");
            return (Criteria) this;
        }

        public Criteria andCoa17LessThanOrEqualTo(Double value) {
            addCriterion("coA17 <=", value, "coa17");
            return (Criteria) this;
        }

        public Criteria andCoa17In(List<Double> values) {
            addCriterion("coA17 in", values, "coa17");
            return (Criteria) this;
        }

        public Criteria andCoa17NotIn(List<Double> values) {
            addCriterion("coA17 not in", values, "coa17");
            return (Criteria) this;
        }

        public Criteria andCoa17Between(Double value1, Double value2) {
            addCriterion("coA17 between", value1, value2, "coa17");
            return (Criteria) this;
        }

        public Criteria andCoa17NotBetween(Double value1, Double value2) {
            addCriterion("coA17 not between", value1, value2, "coa17");
            return (Criteria) this;
        }

        public Criteria andCoa18IsNull() {
            addCriterion("coA18 is null");
            return (Criteria) this;
        }

        public Criteria andCoa18IsNotNull() {
            addCriterion("coA18 is not null");
            return (Criteria) this;
        }

        public Criteria andCoa18EqualTo(Double value) {
            addCriterion("coA18 =", value, "coa18");
            return (Criteria) this;
        }

        public Criteria andCoa18NotEqualTo(Double value) {
            addCriterion("coA18 <>", value, "coa18");
            return (Criteria) this;
        }

        public Criteria andCoa18GreaterThan(Double value) {
            addCriterion("coA18 >", value, "coa18");
            return (Criteria) this;
        }

        public Criteria andCoa18GreaterThanOrEqualTo(Double value) {
            addCriterion("coA18 >=", value, "coa18");
            return (Criteria) this;
        }

        public Criteria andCoa18LessThan(Double value) {
            addCriterion("coA18 <", value, "coa18");
            return (Criteria) this;
        }

        public Criteria andCoa18LessThanOrEqualTo(Double value) {
            addCriterion("coA18 <=", value, "coa18");
            return (Criteria) this;
        }

        public Criteria andCoa18In(List<Double> values) {
            addCriterion("coA18 in", values, "coa18");
            return (Criteria) this;
        }

        public Criteria andCoa18NotIn(List<Double> values) {
            addCriterion("coA18 not in", values, "coa18");
            return (Criteria) this;
        }

        public Criteria andCoa18Between(Double value1, Double value2) {
            addCriterion("coA18 between", value1, value2, "coa18");
            return (Criteria) this;
        }

        public Criteria andCoa18NotBetween(Double value1, Double value2) {
            addCriterion("coA18 not between", value1, value2, "coa18");
            return (Criteria) this;
        }

        public Criteria andCoa19IsNull() {
            addCriterion("coA19 is null");
            return (Criteria) this;
        }

        public Criteria andCoa19IsNotNull() {
            addCriterion("coA19 is not null");
            return (Criteria) this;
        }

        public Criteria andCoa19EqualTo(Double value) {
            addCriterion("coA19 =", value, "coa19");
            return (Criteria) this;
        }

        public Criteria andCoa19NotEqualTo(Double value) {
            addCriterion("coA19 <>", value, "coa19");
            return (Criteria) this;
        }

        public Criteria andCoa19GreaterThan(Double value) {
            addCriterion("coA19 >", value, "coa19");
            return (Criteria) this;
        }

        public Criteria andCoa19GreaterThanOrEqualTo(Double value) {
            addCriterion("coA19 >=", value, "coa19");
            return (Criteria) this;
        }

        public Criteria andCoa19LessThan(Double value) {
            addCriterion("coA19 <", value, "coa19");
            return (Criteria) this;
        }

        public Criteria andCoa19LessThanOrEqualTo(Double value) {
            addCriterion("coA19 <=", value, "coa19");
            return (Criteria) this;
        }

        public Criteria andCoa19In(List<Double> values) {
            addCriterion("coA19 in", values, "coa19");
            return (Criteria) this;
        }

        public Criteria andCoa19NotIn(List<Double> values) {
            addCriterion("coA19 not in", values, "coa19");
            return (Criteria) this;
        }

        public Criteria andCoa19Between(Double value1, Double value2) {
            addCriterion("coA19 between", value1, value2, "coa19");
            return (Criteria) this;
        }

        public Criteria andCoa19NotBetween(Double value1, Double value2) {
            addCriterion("coA19 not between", value1, value2, "coa19");
            return (Criteria) this;
        }

        public Criteria andCoa20IsNull() {
            addCriterion("coA20 is null");
            return (Criteria) this;
        }

        public Criteria andCoa20IsNotNull() {
            addCriterion("coA20 is not null");
            return (Criteria) this;
        }

        public Criteria andCoa20EqualTo(Double value) {
            addCriterion("coA20 =", value, "coa20");
            return (Criteria) this;
        }

        public Criteria andCoa20NotEqualTo(Double value) {
            addCriterion("coA20 <>", value, "coa20");
            return (Criteria) this;
        }

        public Criteria andCoa20GreaterThan(Double value) {
            addCriterion("coA20 >", value, "coa20");
            return (Criteria) this;
        }

        public Criteria andCoa20GreaterThanOrEqualTo(Double value) {
            addCriterion("coA20 >=", value, "coa20");
            return (Criteria) this;
        }

        public Criteria andCoa20LessThan(Double value) {
            addCriterion("coA20 <", value, "coa20");
            return (Criteria) this;
        }

        public Criteria andCoa20LessThanOrEqualTo(Double value) {
            addCriterion("coA20 <=", value, "coa20");
            return (Criteria) this;
        }

        public Criteria andCoa20In(List<Double> values) {
            addCriterion("coA20 in", values, "coa20");
            return (Criteria) this;
        }

        public Criteria andCoa20NotIn(List<Double> values) {
            addCriterion("coA20 not in", values, "coa20");
            return (Criteria) this;
        }

        public Criteria andCoa20Between(Double value1, Double value2) {
            addCriterion("coA20 between", value1, value2, "coa20");
            return (Criteria) this;
        }

        public Criteria andCoa20NotBetween(Double value1, Double value2) {
            addCriterion("coA20 not between", value1, value2, "coa20");
            return (Criteria) this;
        }

        public Criteria andCoa21IsNull() {
            addCriterion("coA21 is null");
            return (Criteria) this;
        }

        public Criteria andCoa21IsNotNull() {
            addCriterion("coA21 is not null");
            return (Criteria) this;
        }

        public Criteria andCoa21EqualTo(Double value) {
            addCriterion("coA21 =", value, "coa21");
            return (Criteria) this;
        }

        public Criteria andCoa21NotEqualTo(Double value) {
            addCriterion("coA21 <>", value, "coa21");
            return (Criteria) this;
        }

        public Criteria andCoa21GreaterThan(Double value) {
            addCriterion("coA21 >", value, "coa21");
            return (Criteria) this;
        }

        public Criteria andCoa21GreaterThanOrEqualTo(Double value) {
            addCriterion("coA21 >=", value, "coa21");
            return (Criteria) this;
        }

        public Criteria andCoa21LessThan(Double value) {
            addCriterion("coA21 <", value, "coa21");
            return (Criteria) this;
        }

        public Criteria andCoa21LessThanOrEqualTo(Double value) {
            addCriterion("coA21 <=", value, "coa21");
            return (Criteria) this;
        }

        public Criteria andCoa21In(List<Double> values) {
            addCriterion("coA21 in", values, "coa21");
            return (Criteria) this;
        }

        public Criteria andCoa21NotIn(List<Double> values) {
            addCriterion("coA21 not in", values, "coa21");
            return (Criteria) this;
        }

        public Criteria andCoa21Between(Double value1, Double value2) {
            addCriterion("coA21 between", value1, value2, "coa21");
            return (Criteria) this;
        }

        public Criteria andCoa21NotBetween(Double value1, Double value2) {
            addCriterion("coA21 not between", value1, value2, "coa21");
            return (Criteria) this;
        }

        public Criteria andCoa22IsNull() {
            addCriterion("coA22 is null");
            return (Criteria) this;
        }

        public Criteria andCoa22IsNotNull() {
            addCriterion("coA22 is not null");
            return (Criteria) this;
        }

        public Criteria andCoa22EqualTo(Double value) {
            addCriterion("coA22 =", value, "coa22");
            return (Criteria) this;
        }

        public Criteria andCoa22NotEqualTo(Double value) {
            addCriterion("coA22 <>", value, "coa22");
            return (Criteria) this;
        }

        public Criteria andCoa22GreaterThan(Double value) {
            addCriterion("coA22 >", value, "coa22");
            return (Criteria) this;
        }

        public Criteria andCoa22GreaterThanOrEqualTo(Double value) {
            addCriterion("coA22 >=", value, "coa22");
            return (Criteria) this;
        }

        public Criteria andCoa22LessThan(Double value) {
            addCriterion("coA22 <", value, "coa22");
            return (Criteria) this;
        }

        public Criteria andCoa22LessThanOrEqualTo(Double value) {
            addCriterion("coA22 <=", value, "coa22");
            return (Criteria) this;
        }

        public Criteria andCoa22In(List<Double> values) {
            addCriterion("coA22 in", values, "coa22");
            return (Criteria) this;
        }

        public Criteria andCoa22NotIn(List<Double> values) {
            addCriterion("coA22 not in", values, "coa22");
            return (Criteria) this;
        }

        public Criteria andCoa22Between(Double value1, Double value2) {
            addCriterion("coA22 between", value1, value2, "coa22");
            return (Criteria) this;
        }

        public Criteria andCoa22NotBetween(Double value1, Double value2) {
            addCriterion("coA22 not between", value1, value2, "coa22");
            return (Criteria) this;
        }

        public Criteria andCoa23IsNull() {
            addCriterion("coA23 is null");
            return (Criteria) this;
        }

        public Criteria andCoa23IsNotNull() {
            addCriterion("coA23 is not null");
            return (Criteria) this;
        }

        public Criteria andCoa23EqualTo(Double value) {
            addCriterion("coA23 =", value, "coa23");
            return (Criteria) this;
        }

        public Criteria andCoa23NotEqualTo(Double value) {
            addCriterion("coA23 <>", value, "coa23");
            return (Criteria) this;
        }

        public Criteria andCoa23GreaterThan(Double value) {
            addCriterion("coA23 >", value, "coa23");
            return (Criteria) this;
        }

        public Criteria andCoa23GreaterThanOrEqualTo(Double value) {
            addCriterion("coA23 >=", value, "coa23");
            return (Criteria) this;
        }

        public Criteria andCoa23LessThan(Double value) {
            addCriterion("coA23 <", value, "coa23");
            return (Criteria) this;
        }

        public Criteria andCoa23LessThanOrEqualTo(Double value) {
            addCriterion("coA23 <=", value, "coa23");
            return (Criteria) this;
        }

        public Criteria andCoa23In(List<Double> values) {
            addCriterion("coA23 in", values, "coa23");
            return (Criteria) this;
        }

        public Criteria andCoa23NotIn(List<Double> values) {
            addCriterion("coA23 not in", values, "coa23");
            return (Criteria) this;
        }

        public Criteria andCoa23Between(Double value1, Double value2) {
            addCriterion("coA23 between", value1, value2, "coa23");
            return (Criteria) this;
        }

        public Criteria andCoa23NotBetween(Double value1, Double value2) {
            addCriterion("coA23 not between", value1, value2, "coa23");
            return (Criteria) this;
        }

        public Criteria andCoa24IsNull() {
            addCriterion("coA24 is null");
            return (Criteria) this;
        }

        public Criteria andCoa24IsNotNull() {
            addCriterion("coA24 is not null");
            return (Criteria) this;
        }

        public Criteria andCoa24EqualTo(Double value) {
            addCriterion("coA24 =", value, "coa24");
            return (Criteria) this;
        }

        public Criteria andCoa24NotEqualTo(Double value) {
            addCriterion("coA24 <>", value, "coa24");
            return (Criteria) this;
        }

        public Criteria andCoa24GreaterThan(Double value) {
            addCriterion("coA24 >", value, "coa24");
            return (Criteria) this;
        }

        public Criteria andCoa24GreaterThanOrEqualTo(Double value) {
            addCriterion("coA24 >=", value, "coa24");
            return (Criteria) this;
        }

        public Criteria andCoa24LessThan(Double value) {
            addCriterion("coA24 <", value, "coa24");
            return (Criteria) this;
        }

        public Criteria andCoa24LessThanOrEqualTo(Double value) {
            addCriterion("coA24 <=", value, "coa24");
            return (Criteria) this;
        }

        public Criteria andCoa24In(List<Double> values) {
            addCriterion("coA24 in", values, "coa24");
            return (Criteria) this;
        }

        public Criteria andCoa24NotIn(List<Double> values) {
            addCriterion("coA24 not in", values, "coa24");
            return (Criteria) this;
        }

        public Criteria andCoa24Between(Double value1, Double value2) {
            addCriterion("coA24 between", value1, value2, "coa24");
            return (Criteria) this;
        }

        public Criteria andCoa24NotBetween(Double value1, Double value2) {
            addCriterion("coA24 not between", value1, value2, "coa24");
            return (Criteria) this;
        }

        public Criteria andSo2a1IsNull() {
            addCriterion("so2A1 is null");
            return (Criteria) this;
        }

        public Criteria andSo2a1IsNotNull() {
            addCriterion("so2A1 is not null");
            return (Criteria) this;
        }

        public Criteria andSo2a1EqualTo(Double value) {
            addCriterion("so2A1 =", value, "so2a1");
            return (Criteria) this;
        }

        public Criteria andSo2a1NotEqualTo(Double value) {
            addCriterion("so2A1 <>", value, "so2a1");
            return (Criteria) this;
        }

        public Criteria andSo2a1GreaterThan(Double value) {
            addCriterion("so2A1 >", value, "so2a1");
            return (Criteria) this;
        }

        public Criteria andSo2a1GreaterThanOrEqualTo(Double value) {
            addCriterion("so2A1 >=", value, "so2a1");
            return (Criteria) this;
        }

        public Criteria andSo2a1LessThan(Double value) {
            addCriterion("so2A1 <", value, "so2a1");
            return (Criteria) this;
        }

        public Criteria andSo2a1LessThanOrEqualTo(Double value) {
            addCriterion("so2A1 <=", value, "so2a1");
            return (Criteria) this;
        }

        public Criteria andSo2a1In(List<Double> values) {
            addCriterion("so2A1 in", values, "so2a1");
            return (Criteria) this;
        }

        public Criteria andSo2a1NotIn(List<Double> values) {
            addCriterion("so2A1 not in", values, "so2a1");
            return (Criteria) this;
        }

        public Criteria andSo2a1Between(Double value1, Double value2) {
            addCriterion("so2A1 between", value1, value2, "so2a1");
            return (Criteria) this;
        }

        public Criteria andSo2a1NotBetween(Double value1, Double value2) {
            addCriterion("so2A1 not between", value1, value2, "so2a1");
            return (Criteria) this;
        }

        public Criteria andSo2a2IsNull() {
            addCriterion("so2A2 is null");
            return (Criteria) this;
        }

        public Criteria andSo2a2IsNotNull() {
            addCriterion("so2A2 is not null");
            return (Criteria) this;
        }

        public Criteria andSo2a2EqualTo(Double value) {
            addCriterion("so2A2 =", value, "so2a2");
            return (Criteria) this;
        }

        public Criteria andSo2a2NotEqualTo(Double value) {
            addCriterion("so2A2 <>", value, "so2a2");
            return (Criteria) this;
        }

        public Criteria andSo2a2GreaterThan(Double value) {
            addCriterion("so2A2 >", value, "so2a2");
            return (Criteria) this;
        }

        public Criteria andSo2a2GreaterThanOrEqualTo(Double value) {
            addCriterion("so2A2 >=", value, "so2a2");
            return (Criteria) this;
        }

        public Criteria andSo2a2LessThan(Double value) {
            addCriterion("so2A2 <", value, "so2a2");
            return (Criteria) this;
        }

        public Criteria andSo2a2LessThanOrEqualTo(Double value) {
            addCriterion("so2A2 <=", value, "so2a2");
            return (Criteria) this;
        }

        public Criteria andSo2a2In(List<Double> values) {
            addCriterion("so2A2 in", values, "so2a2");
            return (Criteria) this;
        }

        public Criteria andSo2a2NotIn(List<Double> values) {
            addCriterion("so2A2 not in", values, "so2a2");
            return (Criteria) this;
        }

        public Criteria andSo2a2Between(Double value1, Double value2) {
            addCriterion("so2A2 between", value1, value2, "so2a2");
            return (Criteria) this;
        }

        public Criteria andSo2a2NotBetween(Double value1, Double value2) {
            addCriterion("so2A2 not between", value1, value2, "so2a2");
            return (Criteria) this;
        }

        public Criteria andSo2a3IsNull() {
            addCriterion("so2A3 is null");
            return (Criteria) this;
        }

        public Criteria andSo2a3IsNotNull() {
            addCriterion("so2A3 is not null");
            return (Criteria) this;
        }

        public Criteria andSo2a3EqualTo(Double value) {
            addCriterion("so2A3 =", value, "so2a3");
            return (Criteria) this;
        }

        public Criteria andSo2a3NotEqualTo(Double value) {
            addCriterion("so2A3 <>", value, "so2a3");
            return (Criteria) this;
        }

        public Criteria andSo2a3GreaterThan(Double value) {
            addCriterion("so2A3 >", value, "so2a3");
            return (Criteria) this;
        }

        public Criteria andSo2a3GreaterThanOrEqualTo(Double value) {
            addCriterion("so2A3 >=", value, "so2a3");
            return (Criteria) this;
        }

        public Criteria andSo2a3LessThan(Double value) {
            addCriterion("so2A3 <", value, "so2a3");
            return (Criteria) this;
        }

        public Criteria andSo2a3LessThanOrEqualTo(Double value) {
            addCriterion("so2A3 <=", value, "so2a3");
            return (Criteria) this;
        }

        public Criteria andSo2a3In(List<Double> values) {
            addCriterion("so2A3 in", values, "so2a3");
            return (Criteria) this;
        }

        public Criteria andSo2a3NotIn(List<Double> values) {
            addCriterion("so2A3 not in", values, "so2a3");
            return (Criteria) this;
        }

        public Criteria andSo2a3Between(Double value1, Double value2) {
            addCriterion("so2A3 between", value1, value2, "so2a3");
            return (Criteria) this;
        }

        public Criteria andSo2a3NotBetween(Double value1, Double value2) {
            addCriterion("so2A3 not between", value1, value2, "so2a3");
            return (Criteria) this;
        }

        public Criteria andSo2a4IsNull() {
            addCriterion("so2A4 is null");
            return (Criteria) this;
        }

        public Criteria andSo2a4IsNotNull() {
            addCriterion("so2A4 is not null");
            return (Criteria) this;
        }

        public Criteria andSo2a4EqualTo(Double value) {
            addCriterion("so2A4 =", value, "so2a4");
            return (Criteria) this;
        }

        public Criteria andSo2a4NotEqualTo(Double value) {
            addCriterion("so2A4 <>", value, "so2a4");
            return (Criteria) this;
        }

        public Criteria andSo2a4GreaterThan(Double value) {
            addCriterion("so2A4 >", value, "so2a4");
            return (Criteria) this;
        }

        public Criteria andSo2a4GreaterThanOrEqualTo(Double value) {
            addCriterion("so2A4 >=", value, "so2a4");
            return (Criteria) this;
        }

        public Criteria andSo2a4LessThan(Double value) {
            addCriterion("so2A4 <", value, "so2a4");
            return (Criteria) this;
        }

        public Criteria andSo2a4LessThanOrEqualTo(Double value) {
            addCriterion("so2A4 <=", value, "so2a4");
            return (Criteria) this;
        }

        public Criteria andSo2a4In(List<Double> values) {
            addCriterion("so2A4 in", values, "so2a4");
            return (Criteria) this;
        }

        public Criteria andSo2a4NotIn(List<Double> values) {
            addCriterion("so2A4 not in", values, "so2a4");
            return (Criteria) this;
        }

        public Criteria andSo2a4Between(Double value1, Double value2) {
            addCriterion("so2A4 between", value1, value2, "so2a4");
            return (Criteria) this;
        }

        public Criteria andSo2a4NotBetween(Double value1, Double value2) {
            addCriterion("so2A4 not between", value1, value2, "so2a4");
            return (Criteria) this;
        }

        public Criteria andSo2a5IsNull() {
            addCriterion("so2A5 is null");
            return (Criteria) this;
        }

        public Criteria andSo2a5IsNotNull() {
            addCriterion("so2A5 is not null");
            return (Criteria) this;
        }

        public Criteria andSo2a5EqualTo(Double value) {
            addCriterion("so2A5 =", value, "so2a5");
            return (Criteria) this;
        }

        public Criteria andSo2a5NotEqualTo(Double value) {
            addCriterion("so2A5 <>", value, "so2a5");
            return (Criteria) this;
        }

        public Criteria andSo2a5GreaterThan(Double value) {
            addCriterion("so2A5 >", value, "so2a5");
            return (Criteria) this;
        }

        public Criteria andSo2a5GreaterThanOrEqualTo(Double value) {
            addCriterion("so2A5 >=", value, "so2a5");
            return (Criteria) this;
        }

        public Criteria andSo2a5LessThan(Double value) {
            addCriterion("so2A5 <", value, "so2a5");
            return (Criteria) this;
        }

        public Criteria andSo2a5LessThanOrEqualTo(Double value) {
            addCriterion("so2A5 <=", value, "so2a5");
            return (Criteria) this;
        }

        public Criteria andSo2a5In(List<Double> values) {
            addCriterion("so2A5 in", values, "so2a5");
            return (Criteria) this;
        }

        public Criteria andSo2a5NotIn(List<Double> values) {
            addCriterion("so2A5 not in", values, "so2a5");
            return (Criteria) this;
        }

        public Criteria andSo2a5Between(Double value1, Double value2) {
            addCriterion("so2A5 between", value1, value2, "so2a5");
            return (Criteria) this;
        }

        public Criteria andSo2a5NotBetween(Double value1, Double value2) {
            addCriterion("so2A5 not between", value1, value2, "so2a5");
            return (Criteria) this;
        }

        public Criteria andSo2a6IsNull() {
            addCriterion("so2A6 is null");
            return (Criteria) this;
        }

        public Criteria andSo2a6IsNotNull() {
            addCriterion("so2A6 is not null");
            return (Criteria) this;
        }

        public Criteria andSo2a6EqualTo(Double value) {
            addCriterion("so2A6 =", value, "so2a6");
            return (Criteria) this;
        }

        public Criteria andSo2a6NotEqualTo(Double value) {
            addCriterion("so2A6 <>", value, "so2a6");
            return (Criteria) this;
        }

        public Criteria andSo2a6GreaterThan(Double value) {
            addCriterion("so2A6 >", value, "so2a6");
            return (Criteria) this;
        }

        public Criteria andSo2a6GreaterThanOrEqualTo(Double value) {
            addCriterion("so2A6 >=", value, "so2a6");
            return (Criteria) this;
        }

        public Criteria andSo2a6LessThan(Double value) {
            addCriterion("so2A6 <", value, "so2a6");
            return (Criteria) this;
        }

        public Criteria andSo2a6LessThanOrEqualTo(Double value) {
            addCriterion("so2A6 <=", value, "so2a6");
            return (Criteria) this;
        }

        public Criteria andSo2a6In(List<Double> values) {
            addCriterion("so2A6 in", values, "so2a6");
            return (Criteria) this;
        }

        public Criteria andSo2a6NotIn(List<Double> values) {
            addCriterion("so2A6 not in", values, "so2a6");
            return (Criteria) this;
        }

        public Criteria andSo2a6Between(Double value1, Double value2) {
            addCriterion("so2A6 between", value1, value2, "so2a6");
            return (Criteria) this;
        }

        public Criteria andSo2a6NotBetween(Double value1, Double value2) {
            addCriterion("so2A6 not between", value1, value2, "so2a6");
            return (Criteria) this;
        }

        public Criteria andSo2a7IsNull() {
            addCriterion("so2A7 is null");
            return (Criteria) this;
        }

        public Criteria andSo2a7IsNotNull() {
            addCriterion("so2A7 is not null");
            return (Criteria) this;
        }

        public Criteria andSo2a7EqualTo(Double value) {
            addCriterion("so2A7 =", value, "so2a7");
            return (Criteria) this;
        }

        public Criteria andSo2a7NotEqualTo(Double value) {
            addCriterion("so2A7 <>", value, "so2a7");
            return (Criteria) this;
        }

        public Criteria andSo2a7GreaterThan(Double value) {
            addCriterion("so2A7 >", value, "so2a7");
            return (Criteria) this;
        }

        public Criteria andSo2a7GreaterThanOrEqualTo(Double value) {
            addCriterion("so2A7 >=", value, "so2a7");
            return (Criteria) this;
        }

        public Criteria andSo2a7LessThan(Double value) {
            addCriterion("so2A7 <", value, "so2a7");
            return (Criteria) this;
        }

        public Criteria andSo2a7LessThanOrEqualTo(Double value) {
            addCriterion("so2A7 <=", value, "so2a7");
            return (Criteria) this;
        }

        public Criteria andSo2a7In(List<Double> values) {
            addCriterion("so2A7 in", values, "so2a7");
            return (Criteria) this;
        }

        public Criteria andSo2a7NotIn(List<Double> values) {
            addCriterion("so2A7 not in", values, "so2a7");
            return (Criteria) this;
        }

        public Criteria andSo2a7Between(Double value1, Double value2) {
            addCriterion("so2A7 between", value1, value2, "so2a7");
            return (Criteria) this;
        }

        public Criteria andSo2a7NotBetween(Double value1, Double value2) {
            addCriterion("so2A7 not between", value1, value2, "so2a7");
            return (Criteria) this;
        }

        public Criteria andSo2a8IsNull() {
            addCriterion("so2A8 is null");
            return (Criteria) this;
        }

        public Criteria andSo2a8IsNotNull() {
            addCriterion("so2A8 is not null");
            return (Criteria) this;
        }

        public Criteria andSo2a8EqualTo(Double value) {
            addCriterion("so2A8 =", value, "so2a8");
            return (Criteria) this;
        }

        public Criteria andSo2a8NotEqualTo(Double value) {
            addCriterion("so2A8 <>", value, "so2a8");
            return (Criteria) this;
        }

        public Criteria andSo2a8GreaterThan(Double value) {
            addCriterion("so2A8 >", value, "so2a8");
            return (Criteria) this;
        }

        public Criteria andSo2a8GreaterThanOrEqualTo(Double value) {
            addCriterion("so2A8 >=", value, "so2a8");
            return (Criteria) this;
        }

        public Criteria andSo2a8LessThan(Double value) {
            addCriterion("so2A8 <", value, "so2a8");
            return (Criteria) this;
        }

        public Criteria andSo2a8LessThanOrEqualTo(Double value) {
            addCriterion("so2A8 <=", value, "so2a8");
            return (Criteria) this;
        }

        public Criteria andSo2a8In(List<Double> values) {
            addCriterion("so2A8 in", values, "so2a8");
            return (Criteria) this;
        }

        public Criteria andSo2a8NotIn(List<Double> values) {
            addCriterion("so2A8 not in", values, "so2a8");
            return (Criteria) this;
        }

        public Criteria andSo2a8Between(Double value1, Double value2) {
            addCriterion("so2A8 between", value1, value2, "so2a8");
            return (Criteria) this;
        }

        public Criteria andSo2a8NotBetween(Double value1, Double value2) {
            addCriterion("so2A8 not between", value1, value2, "so2a8");
            return (Criteria) this;
        }

        public Criteria andSo2a9IsNull() {
            addCriterion("so2A9 is null");
            return (Criteria) this;
        }

        public Criteria andSo2a9IsNotNull() {
            addCriterion("so2A9 is not null");
            return (Criteria) this;
        }

        public Criteria andSo2a9EqualTo(Double value) {
            addCriterion("so2A9 =", value, "so2a9");
            return (Criteria) this;
        }

        public Criteria andSo2a9NotEqualTo(Double value) {
            addCriterion("so2A9 <>", value, "so2a9");
            return (Criteria) this;
        }

        public Criteria andSo2a9GreaterThan(Double value) {
            addCriterion("so2A9 >", value, "so2a9");
            return (Criteria) this;
        }

        public Criteria andSo2a9GreaterThanOrEqualTo(Double value) {
            addCriterion("so2A9 >=", value, "so2a9");
            return (Criteria) this;
        }

        public Criteria andSo2a9LessThan(Double value) {
            addCriterion("so2A9 <", value, "so2a9");
            return (Criteria) this;
        }

        public Criteria andSo2a9LessThanOrEqualTo(Double value) {
            addCriterion("so2A9 <=", value, "so2a9");
            return (Criteria) this;
        }

        public Criteria andSo2a9In(List<Double> values) {
            addCriterion("so2A9 in", values, "so2a9");
            return (Criteria) this;
        }

        public Criteria andSo2a9NotIn(List<Double> values) {
            addCriterion("so2A9 not in", values, "so2a9");
            return (Criteria) this;
        }

        public Criteria andSo2a9Between(Double value1, Double value2) {
            addCriterion("so2A9 between", value1, value2, "so2a9");
            return (Criteria) this;
        }

        public Criteria andSo2a9NotBetween(Double value1, Double value2) {
            addCriterion("so2A9 not between", value1, value2, "so2a9");
            return (Criteria) this;
        }

        public Criteria andSo2a10IsNull() {
            addCriterion("so2A10 is null");
            return (Criteria) this;
        }

        public Criteria andSo2a10IsNotNull() {
            addCriterion("so2A10 is not null");
            return (Criteria) this;
        }

        public Criteria andSo2a10EqualTo(Double value) {
            addCriterion("so2A10 =", value, "so2a10");
            return (Criteria) this;
        }

        public Criteria andSo2a10NotEqualTo(Double value) {
            addCriterion("so2A10 <>", value, "so2a10");
            return (Criteria) this;
        }

        public Criteria andSo2a10GreaterThan(Double value) {
            addCriterion("so2A10 >", value, "so2a10");
            return (Criteria) this;
        }

        public Criteria andSo2a10GreaterThanOrEqualTo(Double value) {
            addCriterion("so2A10 >=", value, "so2a10");
            return (Criteria) this;
        }

        public Criteria andSo2a10LessThan(Double value) {
            addCriterion("so2A10 <", value, "so2a10");
            return (Criteria) this;
        }

        public Criteria andSo2a10LessThanOrEqualTo(Double value) {
            addCriterion("so2A10 <=", value, "so2a10");
            return (Criteria) this;
        }

        public Criteria andSo2a10In(List<Double> values) {
            addCriterion("so2A10 in", values, "so2a10");
            return (Criteria) this;
        }

        public Criteria andSo2a10NotIn(List<Double> values) {
            addCriterion("so2A10 not in", values, "so2a10");
            return (Criteria) this;
        }

        public Criteria andSo2a10Between(Double value1, Double value2) {
            addCriterion("so2A10 between", value1, value2, "so2a10");
            return (Criteria) this;
        }

        public Criteria andSo2a10NotBetween(Double value1, Double value2) {
            addCriterion("so2A10 not between", value1, value2, "so2a10");
            return (Criteria) this;
        }

        public Criteria andSo2a11IsNull() {
            addCriterion("so2A11 is null");
            return (Criteria) this;
        }

        public Criteria andSo2a11IsNotNull() {
            addCriterion("so2A11 is not null");
            return (Criteria) this;
        }

        public Criteria andSo2a11EqualTo(Double value) {
            addCriterion("so2A11 =", value, "so2a11");
            return (Criteria) this;
        }

        public Criteria andSo2a11NotEqualTo(Double value) {
            addCriterion("so2A11 <>", value, "so2a11");
            return (Criteria) this;
        }

        public Criteria andSo2a11GreaterThan(Double value) {
            addCriterion("so2A11 >", value, "so2a11");
            return (Criteria) this;
        }

        public Criteria andSo2a11GreaterThanOrEqualTo(Double value) {
            addCriterion("so2A11 >=", value, "so2a11");
            return (Criteria) this;
        }

        public Criteria andSo2a11LessThan(Double value) {
            addCriterion("so2A11 <", value, "so2a11");
            return (Criteria) this;
        }

        public Criteria andSo2a11LessThanOrEqualTo(Double value) {
            addCriterion("so2A11 <=", value, "so2a11");
            return (Criteria) this;
        }

        public Criteria andSo2a11In(List<Double> values) {
            addCriterion("so2A11 in", values, "so2a11");
            return (Criteria) this;
        }

        public Criteria andSo2a11NotIn(List<Double> values) {
            addCriterion("so2A11 not in", values, "so2a11");
            return (Criteria) this;
        }

        public Criteria andSo2a11Between(Double value1, Double value2) {
            addCriterion("so2A11 between", value1, value2, "so2a11");
            return (Criteria) this;
        }

        public Criteria andSo2a11NotBetween(Double value1, Double value2) {
            addCriterion("so2A11 not between", value1, value2, "so2a11");
            return (Criteria) this;
        }

        public Criteria andSo2a12IsNull() {
            addCriterion("so2A12 is null");
            return (Criteria) this;
        }

        public Criteria andSo2a12IsNotNull() {
            addCriterion("so2A12 is not null");
            return (Criteria) this;
        }

        public Criteria andSo2a12EqualTo(Double value) {
            addCriterion("so2A12 =", value, "so2a12");
            return (Criteria) this;
        }

        public Criteria andSo2a12NotEqualTo(Double value) {
            addCriterion("so2A12 <>", value, "so2a12");
            return (Criteria) this;
        }

        public Criteria andSo2a12GreaterThan(Double value) {
            addCriterion("so2A12 >", value, "so2a12");
            return (Criteria) this;
        }

        public Criteria andSo2a12GreaterThanOrEqualTo(Double value) {
            addCriterion("so2A12 >=", value, "so2a12");
            return (Criteria) this;
        }

        public Criteria andSo2a12LessThan(Double value) {
            addCriterion("so2A12 <", value, "so2a12");
            return (Criteria) this;
        }

        public Criteria andSo2a12LessThanOrEqualTo(Double value) {
            addCriterion("so2A12 <=", value, "so2a12");
            return (Criteria) this;
        }

        public Criteria andSo2a12In(List<Double> values) {
            addCriterion("so2A12 in", values, "so2a12");
            return (Criteria) this;
        }

        public Criteria andSo2a12NotIn(List<Double> values) {
            addCriterion("so2A12 not in", values, "so2a12");
            return (Criteria) this;
        }

        public Criteria andSo2a12Between(Double value1, Double value2) {
            addCriterion("so2A12 between", value1, value2, "so2a12");
            return (Criteria) this;
        }

        public Criteria andSo2a12NotBetween(Double value1, Double value2) {
            addCriterion("so2A12 not between", value1, value2, "so2a12");
            return (Criteria) this;
        }

        public Criteria andSo2a13IsNull() {
            addCriterion("so2A13 is null");
            return (Criteria) this;
        }

        public Criteria andSo2a13IsNotNull() {
            addCriterion("so2A13 is not null");
            return (Criteria) this;
        }

        public Criteria andSo2a13EqualTo(Double value) {
            addCriterion("so2A13 =", value, "so2a13");
            return (Criteria) this;
        }

        public Criteria andSo2a13NotEqualTo(Double value) {
            addCriterion("so2A13 <>", value, "so2a13");
            return (Criteria) this;
        }

        public Criteria andSo2a13GreaterThan(Double value) {
            addCriterion("so2A13 >", value, "so2a13");
            return (Criteria) this;
        }

        public Criteria andSo2a13GreaterThanOrEqualTo(Double value) {
            addCriterion("so2A13 >=", value, "so2a13");
            return (Criteria) this;
        }

        public Criteria andSo2a13LessThan(Double value) {
            addCriterion("so2A13 <", value, "so2a13");
            return (Criteria) this;
        }

        public Criteria andSo2a13LessThanOrEqualTo(Double value) {
            addCriterion("so2A13 <=", value, "so2a13");
            return (Criteria) this;
        }

        public Criteria andSo2a13In(List<Double> values) {
            addCriterion("so2A13 in", values, "so2a13");
            return (Criteria) this;
        }

        public Criteria andSo2a13NotIn(List<Double> values) {
            addCriterion("so2A13 not in", values, "so2a13");
            return (Criteria) this;
        }

        public Criteria andSo2a13Between(Double value1, Double value2) {
            addCriterion("so2A13 between", value1, value2, "so2a13");
            return (Criteria) this;
        }

        public Criteria andSo2a13NotBetween(Double value1, Double value2) {
            addCriterion("so2A13 not between", value1, value2, "so2a13");
            return (Criteria) this;
        }

        public Criteria andSo2a14IsNull() {
            addCriterion("so2A14 is null");
            return (Criteria) this;
        }

        public Criteria andSo2a14IsNotNull() {
            addCriterion("so2A14 is not null");
            return (Criteria) this;
        }

        public Criteria andSo2a14EqualTo(Double value) {
            addCriterion("so2A14 =", value, "so2a14");
            return (Criteria) this;
        }

        public Criteria andSo2a14NotEqualTo(Double value) {
            addCriterion("so2A14 <>", value, "so2a14");
            return (Criteria) this;
        }

        public Criteria andSo2a14GreaterThan(Double value) {
            addCriterion("so2A14 >", value, "so2a14");
            return (Criteria) this;
        }

        public Criteria andSo2a14GreaterThanOrEqualTo(Double value) {
            addCriterion("so2A14 >=", value, "so2a14");
            return (Criteria) this;
        }

        public Criteria andSo2a14LessThan(Double value) {
            addCriterion("so2A14 <", value, "so2a14");
            return (Criteria) this;
        }

        public Criteria andSo2a14LessThanOrEqualTo(Double value) {
            addCriterion("so2A14 <=", value, "so2a14");
            return (Criteria) this;
        }

        public Criteria andSo2a14In(List<Double> values) {
            addCriterion("so2A14 in", values, "so2a14");
            return (Criteria) this;
        }

        public Criteria andSo2a14NotIn(List<Double> values) {
            addCriterion("so2A14 not in", values, "so2a14");
            return (Criteria) this;
        }

        public Criteria andSo2a14Between(Double value1, Double value2) {
            addCriterion("so2A14 between", value1, value2, "so2a14");
            return (Criteria) this;
        }

        public Criteria andSo2a14NotBetween(Double value1, Double value2) {
            addCriterion("so2A14 not between", value1, value2, "so2a14");
            return (Criteria) this;
        }

        public Criteria andSo2a15IsNull() {
            addCriterion("so2A15 is null");
            return (Criteria) this;
        }

        public Criteria andSo2a15IsNotNull() {
            addCriterion("so2A15 is not null");
            return (Criteria) this;
        }

        public Criteria andSo2a15EqualTo(Double value) {
            addCriterion("so2A15 =", value, "so2a15");
            return (Criteria) this;
        }

        public Criteria andSo2a15NotEqualTo(Double value) {
            addCriterion("so2A15 <>", value, "so2a15");
            return (Criteria) this;
        }

        public Criteria andSo2a15GreaterThan(Double value) {
            addCriterion("so2A15 >", value, "so2a15");
            return (Criteria) this;
        }

        public Criteria andSo2a15GreaterThanOrEqualTo(Double value) {
            addCriterion("so2A15 >=", value, "so2a15");
            return (Criteria) this;
        }

        public Criteria andSo2a15LessThan(Double value) {
            addCriterion("so2A15 <", value, "so2a15");
            return (Criteria) this;
        }

        public Criteria andSo2a15LessThanOrEqualTo(Double value) {
            addCriterion("so2A15 <=", value, "so2a15");
            return (Criteria) this;
        }

        public Criteria andSo2a15In(List<Double> values) {
            addCriterion("so2A15 in", values, "so2a15");
            return (Criteria) this;
        }

        public Criteria andSo2a15NotIn(List<Double> values) {
            addCriterion("so2A15 not in", values, "so2a15");
            return (Criteria) this;
        }

        public Criteria andSo2a15Between(Double value1, Double value2) {
            addCriterion("so2A15 between", value1, value2, "so2a15");
            return (Criteria) this;
        }

        public Criteria andSo2a15NotBetween(Double value1, Double value2) {
            addCriterion("so2A15 not between", value1, value2, "so2a15");
            return (Criteria) this;
        }

        public Criteria andSo2a16IsNull() {
            addCriterion("so2A16 is null");
            return (Criteria) this;
        }

        public Criteria andSo2a16IsNotNull() {
            addCriterion("so2A16 is not null");
            return (Criteria) this;
        }

        public Criteria andSo2a16EqualTo(Double value) {
            addCriterion("so2A16 =", value, "so2a16");
            return (Criteria) this;
        }

        public Criteria andSo2a16NotEqualTo(Double value) {
            addCriterion("so2A16 <>", value, "so2a16");
            return (Criteria) this;
        }

        public Criteria andSo2a16GreaterThan(Double value) {
            addCriterion("so2A16 >", value, "so2a16");
            return (Criteria) this;
        }

        public Criteria andSo2a16GreaterThanOrEqualTo(Double value) {
            addCriterion("so2A16 >=", value, "so2a16");
            return (Criteria) this;
        }

        public Criteria andSo2a16LessThan(Double value) {
            addCriterion("so2A16 <", value, "so2a16");
            return (Criteria) this;
        }

        public Criteria andSo2a16LessThanOrEqualTo(Double value) {
            addCriterion("so2A16 <=", value, "so2a16");
            return (Criteria) this;
        }

        public Criteria andSo2a16In(List<Double> values) {
            addCriterion("so2A16 in", values, "so2a16");
            return (Criteria) this;
        }

        public Criteria andSo2a16NotIn(List<Double> values) {
            addCriterion("so2A16 not in", values, "so2a16");
            return (Criteria) this;
        }

        public Criteria andSo2a16Between(Double value1, Double value2) {
            addCriterion("so2A16 between", value1, value2, "so2a16");
            return (Criteria) this;
        }

        public Criteria andSo2a16NotBetween(Double value1, Double value2) {
            addCriterion("so2A16 not between", value1, value2, "so2a16");
            return (Criteria) this;
        }

        public Criteria andSo2a17IsNull() {
            addCriterion("so2A17 is null");
            return (Criteria) this;
        }

        public Criteria andSo2a17IsNotNull() {
            addCriterion("so2A17 is not null");
            return (Criteria) this;
        }

        public Criteria andSo2a17EqualTo(Double value) {
            addCriterion("so2A17 =", value, "so2a17");
            return (Criteria) this;
        }

        public Criteria andSo2a17NotEqualTo(Double value) {
            addCriterion("so2A17 <>", value, "so2a17");
            return (Criteria) this;
        }

        public Criteria andSo2a17GreaterThan(Double value) {
            addCriterion("so2A17 >", value, "so2a17");
            return (Criteria) this;
        }

        public Criteria andSo2a17GreaterThanOrEqualTo(Double value) {
            addCriterion("so2A17 >=", value, "so2a17");
            return (Criteria) this;
        }

        public Criteria andSo2a17LessThan(Double value) {
            addCriterion("so2A17 <", value, "so2a17");
            return (Criteria) this;
        }

        public Criteria andSo2a17LessThanOrEqualTo(Double value) {
            addCriterion("so2A17 <=", value, "so2a17");
            return (Criteria) this;
        }

        public Criteria andSo2a17In(List<Double> values) {
            addCriterion("so2A17 in", values, "so2a17");
            return (Criteria) this;
        }

        public Criteria andSo2a17NotIn(List<Double> values) {
            addCriterion("so2A17 not in", values, "so2a17");
            return (Criteria) this;
        }

        public Criteria andSo2a17Between(Double value1, Double value2) {
            addCriterion("so2A17 between", value1, value2, "so2a17");
            return (Criteria) this;
        }

        public Criteria andSo2a17NotBetween(Double value1, Double value2) {
            addCriterion("so2A17 not between", value1, value2, "so2a17");
            return (Criteria) this;
        }

        public Criteria andSo2a18IsNull() {
            addCriterion("so2A18 is null");
            return (Criteria) this;
        }

        public Criteria andSo2a18IsNotNull() {
            addCriterion("so2A18 is not null");
            return (Criteria) this;
        }

        public Criteria andSo2a18EqualTo(Double value) {
            addCriterion("so2A18 =", value, "so2a18");
            return (Criteria) this;
        }

        public Criteria andSo2a18NotEqualTo(Double value) {
            addCriterion("so2A18 <>", value, "so2a18");
            return (Criteria) this;
        }

        public Criteria andSo2a18GreaterThan(Double value) {
            addCriterion("so2A18 >", value, "so2a18");
            return (Criteria) this;
        }

        public Criteria andSo2a18GreaterThanOrEqualTo(Double value) {
            addCriterion("so2A18 >=", value, "so2a18");
            return (Criteria) this;
        }

        public Criteria andSo2a18LessThan(Double value) {
            addCriterion("so2A18 <", value, "so2a18");
            return (Criteria) this;
        }

        public Criteria andSo2a18LessThanOrEqualTo(Double value) {
            addCriterion("so2A18 <=", value, "so2a18");
            return (Criteria) this;
        }

        public Criteria andSo2a18In(List<Double> values) {
            addCriterion("so2A18 in", values, "so2a18");
            return (Criteria) this;
        }

        public Criteria andSo2a18NotIn(List<Double> values) {
            addCriterion("so2A18 not in", values, "so2a18");
            return (Criteria) this;
        }

        public Criteria andSo2a18Between(Double value1, Double value2) {
            addCriterion("so2A18 between", value1, value2, "so2a18");
            return (Criteria) this;
        }

        public Criteria andSo2a18NotBetween(Double value1, Double value2) {
            addCriterion("so2A18 not between", value1, value2, "so2a18");
            return (Criteria) this;
        }

        public Criteria andSo2a19IsNull() {
            addCriterion("so2A19 is null");
            return (Criteria) this;
        }

        public Criteria andSo2a19IsNotNull() {
            addCriterion("so2A19 is not null");
            return (Criteria) this;
        }

        public Criteria andSo2a19EqualTo(Double value) {
            addCriterion("so2A19 =", value, "so2a19");
            return (Criteria) this;
        }

        public Criteria andSo2a19NotEqualTo(Double value) {
            addCriterion("so2A19 <>", value, "so2a19");
            return (Criteria) this;
        }

        public Criteria andSo2a19GreaterThan(Double value) {
            addCriterion("so2A19 >", value, "so2a19");
            return (Criteria) this;
        }

        public Criteria andSo2a19GreaterThanOrEqualTo(Double value) {
            addCriterion("so2A19 >=", value, "so2a19");
            return (Criteria) this;
        }

        public Criteria andSo2a19LessThan(Double value) {
            addCriterion("so2A19 <", value, "so2a19");
            return (Criteria) this;
        }

        public Criteria andSo2a19LessThanOrEqualTo(Double value) {
            addCriterion("so2A19 <=", value, "so2a19");
            return (Criteria) this;
        }

        public Criteria andSo2a19In(List<Double> values) {
            addCriterion("so2A19 in", values, "so2a19");
            return (Criteria) this;
        }

        public Criteria andSo2a19NotIn(List<Double> values) {
            addCriterion("so2A19 not in", values, "so2a19");
            return (Criteria) this;
        }

        public Criteria andSo2a19Between(Double value1, Double value2) {
            addCriterion("so2A19 between", value1, value2, "so2a19");
            return (Criteria) this;
        }

        public Criteria andSo2a19NotBetween(Double value1, Double value2) {
            addCriterion("so2A19 not between", value1, value2, "so2a19");
            return (Criteria) this;
        }

        public Criteria andSo2a20IsNull() {
            addCriterion("so2A20 is null");
            return (Criteria) this;
        }

        public Criteria andSo2a20IsNotNull() {
            addCriterion("so2A20 is not null");
            return (Criteria) this;
        }

        public Criteria andSo2a20EqualTo(Double value) {
            addCriterion("so2A20 =", value, "so2a20");
            return (Criteria) this;
        }

        public Criteria andSo2a20NotEqualTo(Double value) {
            addCriterion("so2A20 <>", value, "so2a20");
            return (Criteria) this;
        }

        public Criteria andSo2a20GreaterThan(Double value) {
            addCriterion("so2A20 >", value, "so2a20");
            return (Criteria) this;
        }

        public Criteria andSo2a20GreaterThanOrEqualTo(Double value) {
            addCriterion("so2A20 >=", value, "so2a20");
            return (Criteria) this;
        }

        public Criteria andSo2a20LessThan(Double value) {
            addCriterion("so2A20 <", value, "so2a20");
            return (Criteria) this;
        }

        public Criteria andSo2a20LessThanOrEqualTo(Double value) {
            addCriterion("so2A20 <=", value, "so2a20");
            return (Criteria) this;
        }

        public Criteria andSo2a20In(List<Double> values) {
            addCriterion("so2A20 in", values, "so2a20");
            return (Criteria) this;
        }

        public Criteria andSo2a20NotIn(List<Double> values) {
            addCriterion("so2A20 not in", values, "so2a20");
            return (Criteria) this;
        }

        public Criteria andSo2a20Between(Double value1, Double value2) {
            addCriterion("so2A20 between", value1, value2, "so2a20");
            return (Criteria) this;
        }

        public Criteria andSo2a20NotBetween(Double value1, Double value2) {
            addCriterion("so2A20 not between", value1, value2, "so2a20");
            return (Criteria) this;
        }

        public Criteria andSo2a21IsNull() {
            addCriterion("so2A21 is null");
            return (Criteria) this;
        }

        public Criteria andSo2a21IsNotNull() {
            addCriterion("so2A21 is not null");
            return (Criteria) this;
        }

        public Criteria andSo2a21EqualTo(Double value) {
            addCriterion("so2A21 =", value, "so2a21");
            return (Criteria) this;
        }

        public Criteria andSo2a21NotEqualTo(Double value) {
            addCriterion("so2A21 <>", value, "so2a21");
            return (Criteria) this;
        }

        public Criteria andSo2a21GreaterThan(Double value) {
            addCriterion("so2A21 >", value, "so2a21");
            return (Criteria) this;
        }

        public Criteria andSo2a21GreaterThanOrEqualTo(Double value) {
            addCriterion("so2A21 >=", value, "so2a21");
            return (Criteria) this;
        }

        public Criteria andSo2a21LessThan(Double value) {
            addCriterion("so2A21 <", value, "so2a21");
            return (Criteria) this;
        }

        public Criteria andSo2a21LessThanOrEqualTo(Double value) {
            addCriterion("so2A21 <=", value, "so2a21");
            return (Criteria) this;
        }

        public Criteria andSo2a21In(List<Double> values) {
            addCriterion("so2A21 in", values, "so2a21");
            return (Criteria) this;
        }

        public Criteria andSo2a21NotIn(List<Double> values) {
            addCriterion("so2A21 not in", values, "so2a21");
            return (Criteria) this;
        }

        public Criteria andSo2a21Between(Double value1, Double value2) {
            addCriterion("so2A21 between", value1, value2, "so2a21");
            return (Criteria) this;
        }

        public Criteria andSo2a21NotBetween(Double value1, Double value2) {
            addCriterion("so2A21 not between", value1, value2, "so2a21");
            return (Criteria) this;
        }

        public Criteria andSo2a22IsNull() {
            addCriterion("so2A22 is null");
            return (Criteria) this;
        }

        public Criteria andSo2a22IsNotNull() {
            addCriterion("so2A22 is not null");
            return (Criteria) this;
        }

        public Criteria andSo2a22EqualTo(Double value) {
            addCriterion("so2A22 =", value, "so2a22");
            return (Criteria) this;
        }

        public Criteria andSo2a22NotEqualTo(Double value) {
            addCriterion("so2A22 <>", value, "so2a22");
            return (Criteria) this;
        }

        public Criteria andSo2a22GreaterThan(Double value) {
            addCriterion("so2A22 >", value, "so2a22");
            return (Criteria) this;
        }

        public Criteria andSo2a22GreaterThanOrEqualTo(Double value) {
            addCriterion("so2A22 >=", value, "so2a22");
            return (Criteria) this;
        }

        public Criteria andSo2a22LessThan(Double value) {
            addCriterion("so2A22 <", value, "so2a22");
            return (Criteria) this;
        }

        public Criteria andSo2a22LessThanOrEqualTo(Double value) {
            addCriterion("so2A22 <=", value, "so2a22");
            return (Criteria) this;
        }

        public Criteria andSo2a22In(List<Double> values) {
            addCriterion("so2A22 in", values, "so2a22");
            return (Criteria) this;
        }

        public Criteria andSo2a22NotIn(List<Double> values) {
            addCriterion("so2A22 not in", values, "so2a22");
            return (Criteria) this;
        }

        public Criteria andSo2a22Between(Double value1, Double value2) {
            addCriterion("so2A22 between", value1, value2, "so2a22");
            return (Criteria) this;
        }

        public Criteria andSo2a22NotBetween(Double value1, Double value2) {
            addCriterion("so2A22 not between", value1, value2, "so2a22");
            return (Criteria) this;
        }

        public Criteria andSo2a23IsNull() {
            addCriterion("so2A23 is null");
            return (Criteria) this;
        }

        public Criteria andSo2a23IsNotNull() {
            addCriterion("so2A23 is not null");
            return (Criteria) this;
        }

        public Criteria andSo2a23EqualTo(Double value) {
            addCriterion("so2A23 =", value, "so2a23");
            return (Criteria) this;
        }

        public Criteria andSo2a23NotEqualTo(Double value) {
            addCriterion("so2A23 <>", value, "so2a23");
            return (Criteria) this;
        }

        public Criteria andSo2a23GreaterThan(Double value) {
            addCriterion("so2A23 >", value, "so2a23");
            return (Criteria) this;
        }

        public Criteria andSo2a23GreaterThanOrEqualTo(Double value) {
            addCriterion("so2A23 >=", value, "so2a23");
            return (Criteria) this;
        }

        public Criteria andSo2a23LessThan(Double value) {
            addCriterion("so2A23 <", value, "so2a23");
            return (Criteria) this;
        }

        public Criteria andSo2a23LessThanOrEqualTo(Double value) {
            addCriterion("so2A23 <=", value, "so2a23");
            return (Criteria) this;
        }

        public Criteria andSo2a23In(List<Double> values) {
            addCriterion("so2A23 in", values, "so2a23");
            return (Criteria) this;
        }

        public Criteria andSo2a23NotIn(List<Double> values) {
            addCriterion("so2A23 not in", values, "so2a23");
            return (Criteria) this;
        }

        public Criteria andSo2a23Between(Double value1, Double value2) {
            addCriterion("so2A23 between", value1, value2, "so2a23");
            return (Criteria) this;
        }

        public Criteria andSo2a23NotBetween(Double value1, Double value2) {
            addCriterion("so2A23 not between", value1, value2, "so2a23");
            return (Criteria) this;
        }

        public Criteria andSo2a24IsNull() {
            addCriterion("so2A24 is null");
            return (Criteria) this;
        }

        public Criteria andSo2a24IsNotNull() {
            addCriterion("so2A24 is not null");
            return (Criteria) this;
        }

        public Criteria andSo2a24EqualTo(Double value) {
            addCriterion("so2A24 =", value, "so2a24");
            return (Criteria) this;
        }

        public Criteria andSo2a24NotEqualTo(Double value) {
            addCriterion("so2A24 <>", value, "so2a24");
            return (Criteria) this;
        }

        public Criteria andSo2a24GreaterThan(Double value) {
            addCriterion("so2A24 >", value, "so2a24");
            return (Criteria) this;
        }

        public Criteria andSo2a24GreaterThanOrEqualTo(Double value) {
            addCriterion("so2A24 >=", value, "so2a24");
            return (Criteria) this;
        }

        public Criteria andSo2a24LessThan(Double value) {
            addCriterion("so2A24 <", value, "so2a24");
            return (Criteria) this;
        }

        public Criteria andSo2a24LessThanOrEqualTo(Double value) {
            addCriterion("so2A24 <=", value, "so2a24");
            return (Criteria) this;
        }

        public Criteria andSo2a24In(List<Double> values) {
            addCriterion("so2A24 in", values, "so2a24");
            return (Criteria) this;
        }

        public Criteria andSo2a24NotIn(List<Double> values) {
            addCriterion("so2A24 not in", values, "so2a24");
            return (Criteria) this;
        }

        public Criteria andSo2a24Between(Double value1, Double value2) {
            addCriterion("so2A24 between", value1, value2, "so2a24");
            return (Criteria) this;
        }

        public Criteria andSo2a24NotBetween(Double value1, Double value2) {
            addCriterion("so2A24 not between", value1, value2, "so2a24");
            return (Criteria) this;
        }

        public Criteria andBca1IsNull() {
            addCriterion("bcA1 is null");
            return (Criteria) this;
        }

        public Criteria andBca1IsNotNull() {
            addCriterion("bcA1 is not null");
            return (Criteria) this;
        }

        public Criteria andBca1EqualTo(Double value) {
            addCriterion("bcA1 =", value, "bca1");
            return (Criteria) this;
        }

        public Criteria andBca1NotEqualTo(Double value) {
            addCriterion("bcA1 <>", value, "bca1");
            return (Criteria) this;
        }

        public Criteria andBca1GreaterThan(Double value) {
            addCriterion("bcA1 >", value, "bca1");
            return (Criteria) this;
        }

        public Criteria andBca1GreaterThanOrEqualTo(Double value) {
            addCriterion("bcA1 >=", value, "bca1");
            return (Criteria) this;
        }

        public Criteria andBca1LessThan(Double value) {
            addCriterion("bcA1 <", value, "bca1");
            return (Criteria) this;
        }

        public Criteria andBca1LessThanOrEqualTo(Double value) {
            addCriterion("bcA1 <=", value, "bca1");
            return (Criteria) this;
        }

        public Criteria andBca1In(List<Double> values) {
            addCriterion("bcA1 in", values, "bca1");
            return (Criteria) this;
        }

        public Criteria andBca1NotIn(List<Double> values) {
            addCriterion("bcA1 not in", values, "bca1");
            return (Criteria) this;
        }

        public Criteria andBca1Between(Double value1, Double value2) {
            addCriterion("bcA1 between", value1, value2, "bca1");
            return (Criteria) this;
        }

        public Criteria andBca1NotBetween(Double value1, Double value2) {
            addCriterion("bcA1 not between", value1, value2, "bca1");
            return (Criteria) this;
        }

        public Criteria andBca2IsNull() {
            addCriterion("bcA2 is null");
            return (Criteria) this;
        }

        public Criteria andBca2IsNotNull() {
            addCriterion("bcA2 is not null");
            return (Criteria) this;
        }

        public Criteria andBca2EqualTo(Double value) {
            addCriterion("bcA2 =", value, "bca2");
            return (Criteria) this;
        }

        public Criteria andBca2NotEqualTo(Double value) {
            addCriterion("bcA2 <>", value, "bca2");
            return (Criteria) this;
        }

        public Criteria andBca2GreaterThan(Double value) {
            addCriterion("bcA2 >", value, "bca2");
            return (Criteria) this;
        }

        public Criteria andBca2GreaterThanOrEqualTo(Double value) {
            addCriterion("bcA2 >=", value, "bca2");
            return (Criteria) this;
        }

        public Criteria andBca2LessThan(Double value) {
            addCriterion("bcA2 <", value, "bca2");
            return (Criteria) this;
        }

        public Criteria andBca2LessThanOrEqualTo(Double value) {
            addCriterion("bcA2 <=", value, "bca2");
            return (Criteria) this;
        }

        public Criteria andBca2In(List<Double> values) {
            addCriterion("bcA2 in", values, "bca2");
            return (Criteria) this;
        }

        public Criteria andBca2NotIn(List<Double> values) {
            addCriterion("bcA2 not in", values, "bca2");
            return (Criteria) this;
        }

        public Criteria andBca2Between(Double value1, Double value2) {
            addCriterion("bcA2 between", value1, value2, "bca2");
            return (Criteria) this;
        }

        public Criteria andBca2NotBetween(Double value1, Double value2) {
            addCriterion("bcA2 not between", value1, value2, "bca2");
            return (Criteria) this;
        }

        public Criteria andBca3IsNull() {
            addCriterion("bcA3 is null");
            return (Criteria) this;
        }

        public Criteria andBca3IsNotNull() {
            addCriterion("bcA3 is not null");
            return (Criteria) this;
        }

        public Criteria andBca3EqualTo(Double value) {
            addCriterion("bcA3 =", value, "bca3");
            return (Criteria) this;
        }

        public Criteria andBca3NotEqualTo(Double value) {
            addCriterion("bcA3 <>", value, "bca3");
            return (Criteria) this;
        }

        public Criteria andBca3GreaterThan(Double value) {
            addCriterion("bcA3 >", value, "bca3");
            return (Criteria) this;
        }

        public Criteria andBca3GreaterThanOrEqualTo(Double value) {
            addCriterion("bcA3 >=", value, "bca3");
            return (Criteria) this;
        }

        public Criteria andBca3LessThan(Double value) {
            addCriterion("bcA3 <", value, "bca3");
            return (Criteria) this;
        }

        public Criteria andBca3LessThanOrEqualTo(Double value) {
            addCriterion("bcA3 <=", value, "bca3");
            return (Criteria) this;
        }

        public Criteria andBca3In(List<Double> values) {
            addCriterion("bcA3 in", values, "bca3");
            return (Criteria) this;
        }

        public Criteria andBca3NotIn(List<Double> values) {
            addCriterion("bcA3 not in", values, "bca3");
            return (Criteria) this;
        }

        public Criteria andBca3Between(Double value1, Double value2) {
            addCriterion("bcA3 between", value1, value2, "bca3");
            return (Criteria) this;
        }

        public Criteria andBca3NotBetween(Double value1, Double value2) {
            addCriterion("bcA3 not between", value1, value2, "bca3");
            return (Criteria) this;
        }

        public Criteria andBca4IsNull() {
            addCriterion("bcA4 is null");
            return (Criteria) this;
        }

        public Criteria andBca4IsNotNull() {
            addCriterion("bcA4 is not null");
            return (Criteria) this;
        }

        public Criteria andBca4EqualTo(Double value) {
            addCriterion("bcA4 =", value, "bca4");
            return (Criteria) this;
        }

        public Criteria andBca4NotEqualTo(Double value) {
            addCriterion("bcA4 <>", value, "bca4");
            return (Criteria) this;
        }

        public Criteria andBca4GreaterThan(Double value) {
            addCriterion("bcA4 >", value, "bca4");
            return (Criteria) this;
        }

        public Criteria andBca4GreaterThanOrEqualTo(Double value) {
            addCriterion("bcA4 >=", value, "bca4");
            return (Criteria) this;
        }

        public Criteria andBca4LessThan(Double value) {
            addCriterion("bcA4 <", value, "bca4");
            return (Criteria) this;
        }

        public Criteria andBca4LessThanOrEqualTo(Double value) {
            addCriterion("bcA4 <=", value, "bca4");
            return (Criteria) this;
        }

        public Criteria andBca4In(List<Double> values) {
            addCriterion("bcA4 in", values, "bca4");
            return (Criteria) this;
        }

        public Criteria andBca4NotIn(List<Double> values) {
            addCriterion("bcA4 not in", values, "bca4");
            return (Criteria) this;
        }

        public Criteria andBca4Between(Double value1, Double value2) {
            addCriterion("bcA4 between", value1, value2, "bca4");
            return (Criteria) this;
        }

        public Criteria andBca4NotBetween(Double value1, Double value2) {
            addCriterion("bcA4 not between", value1, value2, "bca4");
            return (Criteria) this;
        }

        public Criteria andBca5IsNull() {
            addCriterion("bcA5 is null");
            return (Criteria) this;
        }

        public Criteria andBca5IsNotNull() {
            addCriterion("bcA5 is not null");
            return (Criteria) this;
        }

        public Criteria andBca5EqualTo(Double value) {
            addCriterion("bcA5 =", value, "bca5");
            return (Criteria) this;
        }

        public Criteria andBca5NotEqualTo(Double value) {
            addCriterion("bcA5 <>", value, "bca5");
            return (Criteria) this;
        }

        public Criteria andBca5GreaterThan(Double value) {
            addCriterion("bcA5 >", value, "bca5");
            return (Criteria) this;
        }

        public Criteria andBca5GreaterThanOrEqualTo(Double value) {
            addCriterion("bcA5 >=", value, "bca5");
            return (Criteria) this;
        }

        public Criteria andBca5LessThan(Double value) {
            addCriterion("bcA5 <", value, "bca5");
            return (Criteria) this;
        }

        public Criteria andBca5LessThanOrEqualTo(Double value) {
            addCriterion("bcA5 <=", value, "bca5");
            return (Criteria) this;
        }

        public Criteria andBca5In(List<Double> values) {
            addCriterion("bcA5 in", values, "bca5");
            return (Criteria) this;
        }

        public Criteria andBca5NotIn(List<Double> values) {
            addCriterion("bcA5 not in", values, "bca5");
            return (Criteria) this;
        }

        public Criteria andBca5Between(Double value1, Double value2) {
            addCriterion("bcA5 between", value1, value2, "bca5");
            return (Criteria) this;
        }

        public Criteria andBca5NotBetween(Double value1, Double value2) {
            addCriterion("bcA5 not between", value1, value2, "bca5");
            return (Criteria) this;
        }

        public Criteria andBca6IsNull() {
            addCriterion("bcA6 is null");
            return (Criteria) this;
        }

        public Criteria andBca6IsNotNull() {
            addCriterion("bcA6 is not null");
            return (Criteria) this;
        }

        public Criteria andBca6EqualTo(Double value) {
            addCriterion("bcA6 =", value, "bca6");
            return (Criteria) this;
        }

        public Criteria andBca6NotEqualTo(Double value) {
            addCriterion("bcA6 <>", value, "bca6");
            return (Criteria) this;
        }

        public Criteria andBca6GreaterThan(Double value) {
            addCriterion("bcA6 >", value, "bca6");
            return (Criteria) this;
        }

        public Criteria andBca6GreaterThanOrEqualTo(Double value) {
            addCriterion("bcA6 >=", value, "bca6");
            return (Criteria) this;
        }

        public Criteria andBca6LessThan(Double value) {
            addCriterion("bcA6 <", value, "bca6");
            return (Criteria) this;
        }

        public Criteria andBca6LessThanOrEqualTo(Double value) {
            addCriterion("bcA6 <=", value, "bca6");
            return (Criteria) this;
        }

        public Criteria andBca6In(List<Double> values) {
            addCriterion("bcA6 in", values, "bca6");
            return (Criteria) this;
        }

        public Criteria andBca6NotIn(List<Double> values) {
            addCriterion("bcA6 not in", values, "bca6");
            return (Criteria) this;
        }

        public Criteria andBca6Between(Double value1, Double value2) {
            addCriterion("bcA6 between", value1, value2, "bca6");
            return (Criteria) this;
        }

        public Criteria andBca6NotBetween(Double value1, Double value2) {
            addCriterion("bcA6 not between", value1, value2, "bca6");
            return (Criteria) this;
        }

        public Criteria andBca7IsNull() {
            addCriterion("bcA7 is null");
            return (Criteria) this;
        }

        public Criteria andBca7IsNotNull() {
            addCriterion("bcA7 is not null");
            return (Criteria) this;
        }

        public Criteria andBca7EqualTo(Double value) {
            addCriterion("bcA7 =", value, "bca7");
            return (Criteria) this;
        }

        public Criteria andBca7NotEqualTo(Double value) {
            addCriterion("bcA7 <>", value, "bca7");
            return (Criteria) this;
        }

        public Criteria andBca7GreaterThan(Double value) {
            addCriterion("bcA7 >", value, "bca7");
            return (Criteria) this;
        }

        public Criteria andBca7GreaterThanOrEqualTo(Double value) {
            addCriterion("bcA7 >=", value, "bca7");
            return (Criteria) this;
        }

        public Criteria andBca7LessThan(Double value) {
            addCriterion("bcA7 <", value, "bca7");
            return (Criteria) this;
        }

        public Criteria andBca7LessThanOrEqualTo(Double value) {
            addCriterion("bcA7 <=", value, "bca7");
            return (Criteria) this;
        }

        public Criteria andBca7In(List<Double> values) {
            addCriterion("bcA7 in", values, "bca7");
            return (Criteria) this;
        }

        public Criteria andBca7NotIn(List<Double> values) {
            addCriterion("bcA7 not in", values, "bca7");
            return (Criteria) this;
        }

        public Criteria andBca7Between(Double value1, Double value2) {
            addCriterion("bcA7 between", value1, value2, "bca7");
            return (Criteria) this;
        }

        public Criteria andBca7NotBetween(Double value1, Double value2) {
            addCriterion("bcA7 not between", value1, value2, "bca7");
            return (Criteria) this;
        }

        public Criteria andBca8IsNull() {
            addCriterion("bcA8 is null");
            return (Criteria) this;
        }

        public Criteria andBca8IsNotNull() {
            addCriterion("bcA8 is not null");
            return (Criteria) this;
        }

        public Criteria andBca8EqualTo(Double value) {
            addCriterion("bcA8 =", value, "bca8");
            return (Criteria) this;
        }

        public Criteria andBca8NotEqualTo(Double value) {
            addCriterion("bcA8 <>", value, "bca8");
            return (Criteria) this;
        }

        public Criteria andBca8GreaterThan(Double value) {
            addCriterion("bcA8 >", value, "bca8");
            return (Criteria) this;
        }

        public Criteria andBca8GreaterThanOrEqualTo(Double value) {
            addCriterion("bcA8 >=", value, "bca8");
            return (Criteria) this;
        }

        public Criteria andBca8LessThan(Double value) {
            addCriterion("bcA8 <", value, "bca8");
            return (Criteria) this;
        }

        public Criteria andBca8LessThanOrEqualTo(Double value) {
            addCriterion("bcA8 <=", value, "bca8");
            return (Criteria) this;
        }

        public Criteria andBca8In(List<Double> values) {
            addCriterion("bcA8 in", values, "bca8");
            return (Criteria) this;
        }

        public Criteria andBca8NotIn(List<Double> values) {
            addCriterion("bcA8 not in", values, "bca8");
            return (Criteria) this;
        }

        public Criteria andBca8Between(Double value1, Double value2) {
            addCriterion("bcA8 between", value1, value2, "bca8");
            return (Criteria) this;
        }

        public Criteria andBca8NotBetween(Double value1, Double value2) {
            addCriterion("bcA8 not between", value1, value2, "bca8");
            return (Criteria) this;
        }

        public Criteria andBca9IsNull() {
            addCriterion("bcA9 is null");
            return (Criteria) this;
        }

        public Criteria andBca9IsNotNull() {
            addCriterion("bcA9 is not null");
            return (Criteria) this;
        }

        public Criteria andBca9EqualTo(Double value) {
            addCriterion("bcA9 =", value, "bca9");
            return (Criteria) this;
        }

        public Criteria andBca9NotEqualTo(Double value) {
            addCriterion("bcA9 <>", value, "bca9");
            return (Criteria) this;
        }

        public Criteria andBca9GreaterThan(Double value) {
            addCriterion("bcA9 >", value, "bca9");
            return (Criteria) this;
        }

        public Criteria andBca9GreaterThanOrEqualTo(Double value) {
            addCriterion("bcA9 >=", value, "bca9");
            return (Criteria) this;
        }

        public Criteria andBca9LessThan(Double value) {
            addCriterion("bcA9 <", value, "bca9");
            return (Criteria) this;
        }

        public Criteria andBca9LessThanOrEqualTo(Double value) {
            addCriterion("bcA9 <=", value, "bca9");
            return (Criteria) this;
        }

        public Criteria andBca9In(List<Double> values) {
            addCriterion("bcA9 in", values, "bca9");
            return (Criteria) this;
        }

        public Criteria andBca9NotIn(List<Double> values) {
            addCriterion("bcA9 not in", values, "bca9");
            return (Criteria) this;
        }

        public Criteria andBca9Between(Double value1, Double value2) {
            addCriterion("bcA9 between", value1, value2, "bca9");
            return (Criteria) this;
        }

        public Criteria andBca9NotBetween(Double value1, Double value2) {
            addCriterion("bcA9 not between", value1, value2, "bca9");
            return (Criteria) this;
        }

        public Criteria andBca10IsNull() {
            addCriterion("bcA10 is null");
            return (Criteria) this;
        }

        public Criteria andBca10IsNotNull() {
            addCriterion("bcA10 is not null");
            return (Criteria) this;
        }

        public Criteria andBca10EqualTo(Double value) {
            addCriterion("bcA10 =", value, "bca10");
            return (Criteria) this;
        }

        public Criteria andBca10NotEqualTo(Double value) {
            addCriterion("bcA10 <>", value, "bca10");
            return (Criteria) this;
        }

        public Criteria andBca10GreaterThan(Double value) {
            addCriterion("bcA10 >", value, "bca10");
            return (Criteria) this;
        }

        public Criteria andBca10GreaterThanOrEqualTo(Double value) {
            addCriterion("bcA10 >=", value, "bca10");
            return (Criteria) this;
        }

        public Criteria andBca10LessThan(Double value) {
            addCriterion("bcA10 <", value, "bca10");
            return (Criteria) this;
        }

        public Criteria andBca10LessThanOrEqualTo(Double value) {
            addCriterion("bcA10 <=", value, "bca10");
            return (Criteria) this;
        }

        public Criteria andBca10In(List<Double> values) {
            addCriterion("bcA10 in", values, "bca10");
            return (Criteria) this;
        }

        public Criteria andBca10NotIn(List<Double> values) {
            addCriterion("bcA10 not in", values, "bca10");
            return (Criteria) this;
        }

        public Criteria andBca10Between(Double value1, Double value2) {
            addCriterion("bcA10 between", value1, value2, "bca10");
            return (Criteria) this;
        }

        public Criteria andBca10NotBetween(Double value1, Double value2) {
            addCriterion("bcA10 not between", value1, value2, "bca10");
            return (Criteria) this;
        }

        public Criteria andBca11IsNull() {
            addCriterion("bcA11 is null");
            return (Criteria) this;
        }

        public Criteria andBca11IsNotNull() {
            addCriterion("bcA11 is not null");
            return (Criteria) this;
        }

        public Criteria andBca11EqualTo(Double value) {
            addCriterion("bcA11 =", value, "bca11");
            return (Criteria) this;
        }

        public Criteria andBca11NotEqualTo(Double value) {
            addCriterion("bcA11 <>", value, "bca11");
            return (Criteria) this;
        }

        public Criteria andBca11GreaterThan(Double value) {
            addCriterion("bcA11 >", value, "bca11");
            return (Criteria) this;
        }

        public Criteria andBca11GreaterThanOrEqualTo(Double value) {
            addCriterion("bcA11 >=", value, "bca11");
            return (Criteria) this;
        }

        public Criteria andBca11LessThan(Double value) {
            addCriterion("bcA11 <", value, "bca11");
            return (Criteria) this;
        }

        public Criteria andBca11LessThanOrEqualTo(Double value) {
            addCriterion("bcA11 <=", value, "bca11");
            return (Criteria) this;
        }

        public Criteria andBca11In(List<Double> values) {
            addCriterion("bcA11 in", values, "bca11");
            return (Criteria) this;
        }

        public Criteria andBca11NotIn(List<Double> values) {
            addCriterion("bcA11 not in", values, "bca11");
            return (Criteria) this;
        }

        public Criteria andBca11Between(Double value1, Double value2) {
            addCriterion("bcA11 between", value1, value2, "bca11");
            return (Criteria) this;
        }

        public Criteria andBca11NotBetween(Double value1, Double value2) {
            addCriterion("bcA11 not between", value1, value2, "bca11");
            return (Criteria) this;
        }

        public Criteria andBca12IsNull() {
            addCriterion("bcA12 is null");
            return (Criteria) this;
        }

        public Criteria andBca12IsNotNull() {
            addCriterion("bcA12 is not null");
            return (Criteria) this;
        }

        public Criteria andBca12EqualTo(Double value) {
            addCriterion("bcA12 =", value, "bca12");
            return (Criteria) this;
        }

        public Criteria andBca12NotEqualTo(Double value) {
            addCriterion("bcA12 <>", value, "bca12");
            return (Criteria) this;
        }

        public Criteria andBca12GreaterThan(Double value) {
            addCriterion("bcA12 >", value, "bca12");
            return (Criteria) this;
        }

        public Criteria andBca12GreaterThanOrEqualTo(Double value) {
            addCriterion("bcA12 >=", value, "bca12");
            return (Criteria) this;
        }

        public Criteria andBca12LessThan(Double value) {
            addCriterion("bcA12 <", value, "bca12");
            return (Criteria) this;
        }

        public Criteria andBca12LessThanOrEqualTo(Double value) {
            addCriterion("bcA12 <=", value, "bca12");
            return (Criteria) this;
        }

        public Criteria andBca12In(List<Double> values) {
            addCriterion("bcA12 in", values, "bca12");
            return (Criteria) this;
        }

        public Criteria andBca12NotIn(List<Double> values) {
            addCriterion("bcA12 not in", values, "bca12");
            return (Criteria) this;
        }

        public Criteria andBca12Between(Double value1, Double value2) {
            addCriterion("bcA12 between", value1, value2, "bca12");
            return (Criteria) this;
        }

        public Criteria andBca12NotBetween(Double value1, Double value2) {
            addCriterion("bcA12 not between", value1, value2, "bca12");
            return (Criteria) this;
        }

        public Criteria andBca13IsNull() {
            addCriterion("bcA13 is null");
            return (Criteria) this;
        }

        public Criteria andBca13IsNotNull() {
            addCriterion("bcA13 is not null");
            return (Criteria) this;
        }

        public Criteria andBca13EqualTo(Double value) {
            addCriterion("bcA13 =", value, "bca13");
            return (Criteria) this;
        }

        public Criteria andBca13NotEqualTo(Double value) {
            addCriterion("bcA13 <>", value, "bca13");
            return (Criteria) this;
        }

        public Criteria andBca13GreaterThan(Double value) {
            addCriterion("bcA13 >", value, "bca13");
            return (Criteria) this;
        }

        public Criteria andBca13GreaterThanOrEqualTo(Double value) {
            addCriterion("bcA13 >=", value, "bca13");
            return (Criteria) this;
        }

        public Criteria andBca13LessThan(Double value) {
            addCriterion("bcA13 <", value, "bca13");
            return (Criteria) this;
        }

        public Criteria andBca13LessThanOrEqualTo(Double value) {
            addCriterion("bcA13 <=", value, "bca13");
            return (Criteria) this;
        }

        public Criteria andBca13In(List<Double> values) {
            addCriterion("bcA13 in", values, "bca13");
            return (Criteria) this;
        }

        public Criteria andBca13NotIn(List<Double> values) {
            addCriterion("bcA13 not in", values, "bca13");
            return (Criteria) this;
        }

        public Criteria andBca13Between(Double value1, Double value2) {
            addCriterion("bcA13 between", value1, value2, "bca13");
            return (Criteria) this;
        }

        public Criteria andBca13NotBetween(Double value1, Double value2) {
            addCriterion("bcA13 not between", value1, value2, "bca13");
            return (Criteria) this;
        }

        public Criteria andBca14IsNull() {
            addCriterion("bcA14 is null");
            return (Criteria) this;
        }

        public Criteria andBca14IsNotNull() {
            addCriterion("bcA14 is not null");
            return (Criteria) this;
        }

        public Criteria andBca14EqualTo(Double value) {
            addCriterion("bcA14 =", value, "bca14");
            return (Criteria) this;
        }

        public Criteria andBca14NotEqualTo(Double value) {
            addCriterion("bcA14 <>", value, "bca14");
            return (Criteria) this;
        }

        public Criteria andBca14GreaterThan(Double value) {
            addCriterion("bcA14 >", value, "bca14");
            return (Criteria) this;
        }

        public Criteria andBca14GreaterThanOrEqualTo(Double value) {
            addCriterion("bcA14 >=", value, "bca14");
            return (Criteria) this;
        }

        public Criteria andBca14LessThan(Double value) {
            addCriterion("bcA14 <", value, "bca14");
            return (Criteria) this;
        }

        public Criteria andBca14LessThanOrEqualTo(Double value) {
            addCriterion("bcA14 <=", value, "bca14");
            return (Criteria) this;
        }

        public Criteria andBca14In(List<Double> values) {
            addCriterion("bcA14 in", values, "bca14");
            return (Criteria) this;
        }

        public Criteria andBca14NotIn(List<Double> values) {
            addCriterion("bcA14 not in", values, "bca14");
            return (Criteria) this;
        }

        public Criteria andBca14Between(Double value1, Double value2) {
            addCriterion("bcA14 between", value1, value2, "bca14");
            return (Criteria) this;
        }

        public Criteria andBca14NotBetween(Double value1, Double value2) {
            addCriterion("bcA14 not between", value1, value2, "bca14");
            return (Criteria) this;
        }

        public Criteria andBca15IsNull() {
            addCriterion("bcA15 is null");
            return (Criteria) this;
        }

        public Criteria andBca15IsNotNull() {
            addCriterion("bcA15 is not null");
            return (Criteria) this;
        }

        public Criteria andBca15EqualTo(Double value) {
            addCriterion("bcA15 =", value, "bca15");
            return (Criteria) this;
        }

        public Criteria andBca15NotEqualTo(Double value) {
            addCriterion("bcA15 <>", value, "bca15");
            return (Criteria) this;
        }

        public Criteria andBca15GreaterThan(Double value) {
            addCriterion("bcA15 >", value, "bca15");
            return (Criteria) this;
        }

        public Criteria andBca15GreaterThanOrEqualTo(Double value) {
            addCriterion("bcA15 >=", value, "bca15");
            return (Criteria) this;
        }

        public Criteria andBca15LessThan(Double value) {
            addCriterion("bcA15 <", value, "bca15");
            return (Criteria) this;
        }

        public Criteria andBca15LessThanOrEqualTo(Double value) {
            addCriterion("bcA15 <=", value, "bca15");
            return (Criteria) this;
        }

        public Criteria andBca15In(List<Double> values) {
            addCriterion("bcA15 in", values, "bca15");
            return (Criteria) this;
        }

        public Criteria andBca15NotIn(List<Double> values) {
            addCriterion("bcA15 not in", values, "bca15");
            return (Criteria) this;
        }

        public Criteria andBca15Between(Double value1, Double value2) {
            addCriterion("bcA15 between", value1, value2, "bca15");
            return (Criteria) this;
        }

        public Criteria andBca15NotBetween(Double value1, Double value2) {
            addCriterion("bcA15 not between", value1, value2, "bca15");
            return (Criteria) this;
        }

        public Criteria andBca16IsNull() {
            addCriterion("bcA16 is null");
            return (Criteria) this;
        }

        public Criteria andBca16IsNotNull() {
            addCriterion("bcA16 is not null");
            return (Criteria) this;
        }

        public Criteria andBca16EqualTo(Double value) {
            addCriterion("bcA16 =", value, "bca16");
            return (Criteria) this;
        }

        public Criteria andBca16NotEqualTo(Double value) {
            addCriterion("bcA16 <>", value, "bca16");
            return (Criteria) this;
        }

        public Criteria andBca16GreaterThan(Double value) {
            addCriterion("bcA16 >", value, "bca16");
            return (Criteria) this;
        }

        public Criteria andBca16GreaterThanOrEqualTo(Double value) {
            addCriterion("bcA16 >=", value, "bca16");
            return (Criteria) this;
        }

        public Criteria andBca16LessThan(Double value) {
            addCriterion("bcA16 <", value, "bca16");
            return (Criteria) this;
        }

        public Criteria andBca16LessThanOrEqualTo(Double value) {
            addCriterion("bcA16 <=", value, "bca16");
            return (Criteria) this;
        }

        public Criteria andBca16In(List<Double> values) {
            addCriterion("bcA16 in", values, "bca16");
            return (Criteria) this;
        }

        public Criteria andBca16NotIn(List<Double> values) {
            addCriterion("bcA16 not in", values, "bca16");
            return (Criteria) this;
        }

        public Criteria andBca16Between(Double value1, Double value2) {
            addCriterion("bcA16 between", value1, value2, "bca16");
            return (Criteria) this;
        }

        public Criteria andBca16NotBetween(Double value1, Double value2) {
            addCriterion("bcA16 not between", value1, value2, "bca16");
            return (Criteria) this;
        }

        public Criteria andBca17IsNull() {
            addCriterion("bcA17 is null");
            return (Criteria) this;
        }

        public Criteria andBca17IsNotNull() {
            addCriterion("bcA17 is not null");
            return (Criteria) this;
        }

        public Criteria andBca17EqualTo(Double value) {
            addCriterion("bcA17 =", value, "bca17");
            return (Criteria) this;
        }

        public Criteria andBca17NotEqualTo(Double value) {
            addCriterion("bcA17 <>", value, "bca17");
            return (Criteria) this;
        }

        public Criteria andBca17GreaterThan(Double value) {
            addCriterion("bcA17 >", value, "bca17");
            return (Criteria) this;
        }

        public Criteria andBca17GreaterThanOrEqualTo(Double value) {
            addCriterion("bcA17 >=", value, "bca17");
            return (Criteria) this;
        }

        public Criteria andBca17LessThan(Double value) {
            addCriterion("bcA17 <", value, "bca17");
            return (Criteria) this;
        }

        public Criteria andBca17LessThanOrEqualTo(Double value) {
            addCriterion("bcA17 <=", value, "bca17");
            return (Criteria) this;
        }

        public Criteria andBca17In(List<Double> values) {
            addCriterion("bcA17 in", values, "bca17");
            return (Criteria) this;
        }

        public Criteria andBca17NotIn(List<Double> values) {
            addCriterion("bcA17 not in", values, "bca17");
            return (Criteria) this;
        }

        public Criteria andBca17Between(Double value1, Double value2) {
            addCriterion("bcA17 between", value1, value2, "bca17");
            return (Criteria) this;
        }

        public Criteria andBca17NotBetween(Double value1, Double value2) {
            addCriterion("bcA17 not between", value1, value2, "bca17");
            return (Criteria) this;
        }

        public Criteria andBca18IsNull() {
            addCriterion("bcA18 is null");
            return (Criteria) this;
        }

        public Criteria andBca18IsNotNull() {
            addCriterion("bcA18 is not null");
            return (Criteria) this;
        }

        public Criteria andBca18EqualTo(Double value) {
            addCriterion("bcA18 =", value, "bca18");
            return (Criteria) this;
        }

        public Criteria andBca18NotEqualTo(Double value) {
            addCriterion("bcA18 <>", value, "bca18");
            return (Criteria) this;
        }

        public Criteria andBca18GreaterThan(Double value) {
            addCriterion("bcA18 >", value, "bca18");
            return (Criteria) this;
        }

        public Criteria andBca18GreaterThanOrEqualTo(Double value) {
            addCriterion("bcA18 >=", value, "bca18");
            return (Criteria) this;
        }

        public Criteria andBca18LessThan(Double value) {
            addCriterion("bcA18 <", value, "bca18");
            return (Criteria) this;
        }

        public Criteria andBca18LessThanOrEqualTo(Double value) {
            addCriterion("bcA18 <=", value, "bca18");
            return (Criteria) this;
        }

        public Criteria andBca18In(List<Double> values) {
            addCriterion("bcA18 in", values, "bca18");
            return (Criteria) this;
        }

        public Criteria andBca18NotIn(List<Double> values) {
            addCriterion("bcA18 not in", values, "bca18");
            return (Criteria) this;
        }

        public Criteria andBca18Between(Double value1, Double value2) {
            addCriterion("bcA18 between", value1, value2, "bca18");
            return (Criteria) this;
        }

        public Criteria andBca18NotBetween(Double value1, Double value2) {
            addCriterion("bcA18 not between", value1, value2, "bca18");
            return (Criteria) this;
        }

        public Criteria andBca19IsNull() {
            addCriterion("bcA19 is null");
            return (Criteria) this;
        }

        public Criteria andBca19IsNotNull() {
            addCriterion("bcA19 is not null");
            return (Criteria) this;
        }

        public Criteria andBca19EqualTo(Double value) {
            addCriterion("bcA19 =", value, "bca19");
            return (Criteria) this;
        }

        public Criteria andBca19NotEqualTo(Double value) {
            addCriterion("bcA19 <>", value, "bca19");
            return (Criteria) this;
        }

        public Criteria andBca19GreaterThan(Double value) {
            addCriterion("bcA19 >", value, "bca19");
            return (Criteria) this;
        }

        public Criteria andBca19GreaterThanOrEqualTo(Double value) {
            addCriterion("bcA19 >=", value, "bca19");
            return (Criteria) this;
        }

        public Criteria andBca19LessThan(Double value) {
            addCriterion("bcA19 <", value, "bca19");
            return (Criteria) this;
        }

        public Criteria andBca19LessThanOrEqualTo(Double value) {
            addCriterion("bcA19 <=", value, "bca19");
            return (Criteria) this;
        }

        public Criteria andBca19In(List<Double> values) {
            addCriterion("bcA19 in", values, "bca19");
            return (Criteria) this;
        }

        public Criteria andBca19NotIn(List<Double> values) {
            addCriterion("bcA19 not in", values, "bca19");
            return (Criteria) this;
        }

        public Criteria andBca19Between(Double value1, Double value2) {
            addCriterion("bcA19 between", value1, value2, "bca19");
            return (Criteria) this;
        }

        public Criteria andBca19NotBetween(Double value1, Double value2) {
            addCriterion("bcA19 not between", value1, value2, "bca19");
            return (Criteria) this;
        }

        public Criteria andBca20IsNull() {
            addCriterion("bcA20 is null");
            return (Criteria) this;
        }

        public Criteria andBca20IsNotNull() {
            addCriterion("bcA20 is not null");
            return (Criteria) this;
        }

        public Criteria andBca20EqualTo(Double value) {
            addCriterion("bcA20 =", value, "bca20");
            return (Criteria) this;
        }

        public Criteria andBca20NotEqualTo(Double value) {
            addCriterion("bcA20 <>", value, "bca20");
            return (Criteria) this;
        }

        public Criteria andBca20GreaterThan(Double value) {
            addCriterion("bcA20 >", value, "bca20");
            return (Criteria) this;
        }

        public Criteria andBca20GreaterThanOrEqualTo(Double value) {
            addCriterion("bcA20 >=", value, "bca20");
            return (Criteria) this;
        }

        public Criteria andBca20LessThan(Double value) {
            addCriterion("bcA20 <", value, "bca20");
            return (Criteria) this;
        }

        public Criteria andBca20LessThanOrEqualTo(Double value) {
            addCriterion("bcA20 <=", value, "bca20");
            return (Criteria) this;
        }

        public Criteria andBca20In(List<Double> values) {
            addCriterion("bcA20 in", values, "bca20");
            return (Criteria) this;
        }

        public Criteria andBca20NotIn(List<Double> values) {
            addCriterion("bcA20 not in", values, "bca20");
            return (Criteria) this;
        }

        public Criteria andBca20Between(Double value1, Double value2) {
            addCriterion("bcA20 between", value1, value2, "bca20");
            return (Criteria) this;
        }

        public Criteria andBca20NotBetween(Double value1, Double value2) {
            addCriterion("bcA20 not between", value1, value2, "bca20");
            return (Criteria) this;
        }

        public Criteria andBca21IsNull() {
            addCriterion("bcA21 is null");
            return (Criteria) this;
        }

        public Criteria andBca21IsNotNull() {
            addCriterion("bcA21 is not null");
            return (Criteria) this;
        }

        public Criteria andBca21EqualTo(Double value) {
            addCriterion("bcA21 =", value, "bca21");
            return (Criteria) this;
        }

        public Criteria andBca21NotEqualTo(Double value) {
            addCriterion("bcA21 <>", value, "bca21");
            return (Criteria) this;
        }

        public Criteria andBca21GreaterThan(Double value) {
            addCriterion("bcA21 >", value, "bca21");
            return (Criteria) this;
        }

        public Criteria andBca21GreaterThanOrEqualTo(Double value) {
            addCriterion("bcA21 >=", value, "bca21");
            return (Criteria) this;
        }

        public Criteria andBca21LessThan(Double value) {
            addCriterion("bcA21 <", value, "bca21");
            return (Criteria) this;
        }

        public Criteria andBca21LessThanOrEqualTo(Double value) {
            addCriterion("bcA21 <=", value, "bca21");
            return (Criteria) this;
        }

        public Criteria andBca21In(List<Double> values) {
            addCriterion("bcA21 in", values, "bca21");
            return (Criteria) this;
        }

        public Criteria andBca21NotIn(List<Double> values) {
            addCriterion("bcA21 not in", values, "bca21");
            return (Criteria) this;
        }

        public Criteria andBca21Between(Double value1, Double value2) {
            addCriterion("bcA21 between", value1, value2, "bca21");
            return (Criteria) this;
        }

        public Criteria andBca21NotBetween(Double value1, Double value2) {
            addCriterion("bcA21 not between", value1, value2, "bca21");
            return (Criteria) this;
        }

        public Criteria andBca22IsNull() {
            addCriterion("bcA22 is null");
            return (Criteria) this;
        }

        public Criteria andBca22IsNotNull() {
            addCriterion("bcA22 is not null");
            return (Criteria) this;
        }

        public Criteria andBca22EqualTo(Double value) {
            addCriterion("bcA22 =", value, "bca22");
            return (Criteria) this;
        }

        public Criteria andBca22NotEqualTo(Double value) {
            addCriterion("bcA22 <>", value, "bca22");
            return (Criteria) this;
        }

        public Criteria andBca22GreaterThan(Double value) {
            addCriterion("bcA22 >", value, "bca22");
            return (Criteria) this;
        }

        public Criteria andBca22GreaterThanOrEqualTo(Double value) {
            addCriterion("bcA22 >=", value, "bca22");
            return (Criteria) this;
        }

        public Criteria andBca22LessThan(Double value) {
            addCriterion("bcA22 <", value, "bca22");
            return (Criteria) this;
        }

        public Criteria andBca22LessThanOrEqualTo(Double value) {
            addCriterion("bcA22 <=", value, "bca22");
            return (Criteria) this;
        }

        public Criteria andBca22In(List<Double> values) {
            addCriterion("bcA22 in", values, "bca22");
            return (Criteria) this;
        }

        public Criteria andBca22NotIn(List<Double> values) {
            addCriterion("bcA22 not in", values, "bca22");
            return (Criteria) this;
        }

        public Criteria andBca22Between(Double value1, Double value2) {
            addCriterion("bcA22 between", value1, value2, "bca22");
            return (Criteria) this;
        }

        public Criteria andBca22NotBetween(Double value1, Double value2) {
            addCriterion("bcA22 not between", value1, value2, "bca22");
            return (Criteria) this;
        }

        public Criteria andBca23IsNull() {
            addCriterion("bcA23 is null");
            return (Criteria) this;
        }

        public Criteria andBca23IsNotNull() {
            addCriterion("bcA23 is not null");
            return (Criteria) this;
        }

        public Criteria andBca23EqualTo(Double value) {
            addCriterion("bcA23 =", value, "bca23");
            return (Criteria) this;
        }

        public Criteria andBca23NotEqualTo(Double value) {
            addCriterion("bcA23 <>", value, "bca23");
            return (Criteria) this;
        }

        public Criteria andBca23GreaterThan(Double value) {
            addCriterion("bcA23 >", value, "bca23");
            return (Criteria) this;
        }

        public Criteria andBca23GreaterThanOrEqualTo(Double value) {
            addCriterion("bcA23 >=", value, "bca23");
            return (Criteria) this;
        }

        public Criteria andBca23LessThan(Double value) {
            addCriterion("bcA23 <", value, "bca23");
            return (Criteria) this;
        }

        public Criteria andBca23LessThanOrEqualTo(Double value) {
            addCriterion("bcA23 <=", value, "bca23");
            return (Criteria) this;
        }

        public Criteria andBca23In(List<Double> values) {
            addCriterion("bcA23 in", values, "bca23");
            return (Criteria) this;
        }

        public Criteria andBca23NotIn(List<Double> values) {
            addCriterion("bcA23 not in", values, "bca23");
            return (Criteria) this;
        }

        public Criteria andBca23Between(Double value1, Double value2) {
            addCriterion("bcA23 between", value1, value2, "bca23");
            return (Criteria) this;
        }

        public Criteria andBca23NotBetween(Double value1, Double value2) {
            addCriterion("bcA23 not between", value1, value2, "bca23");
            return (Criteria) this;
        }

        public Criteria andBca24IsNull() {
            addCriterion("bcA24 is null");
            return (Criteria) this;
        }

        public Criteria andBca24IsNotNull() {
            addCriterion("bcA24 is not null");
            return (Criteria) this;
        }

        public Criteria andBca24EqualTo(Double value) {
            addCriterion("bcA24 =", value, "bca24");
            return (Criteria) this;
        }

        public Criteria andBca24NotEqualTo(Double value) {
            addCriterion("bcA24 <>", value, "bca24");
            return (Criteria) this;
        }

        public Criteria andBca24GreaterThan(Double value) {
            addCriterion("bcA24 >", value, "bca24");
            return (Criteria) this;
        }

        public Criteria andBca24GreaterThanOrEqualTo(Double value) {
            addCriterion("bcA24 >=", value, "bca24");
            return (Criteria) this;
        }

        public Criteria andBca24LessThan(Double value) {
            addCriterion("bcA24 <", value, "bca24");
            return (Criteria) this;
        }

        public Criteria andBca24LessThanOrEqualTo(Double value) {
            addCriterion("bcA24 <=", value, "bca24");
            return (Criteria) this;
        }

        public Criteria andBca24In(List<Double> values) {
            addCriterion("bcA24 in", values, "bca24");
            return (Criteria) this;
        }

        public Criteria andBca24NotIn(List<Double> values) {
            addCriterion("bcA24 not in", values, "bca24");
            return (Criteria) this;
        }

        public Criteria andBca24Between(Double value1, Double value2) {
            addCriterion("bcA24 between", value1, value2, "bca24");
            return (Criteria) this;
        }

        public Criteria andBca24NotBetween(Double value1, Double value2) {
            addCriterion("bcA24 not between", value1, value2, "bca24");
            return (Criteria) this;
        }

        public Criteria andOca1IsNull() {
            addCriterion("ocA1 is null");
            return (Criteria) this;
        }

        public Criteria andOca1IsNotNull() {
            addCriterion("ocA1 is not null");
            return (Criteria) this;
        }

        public Criteria andOca1EqualTo(Double value) {
            addCriterion("ocA1 =", value, "oca1");
            return (Criteria) this;
        }

        public Criteria andOca1NotEqualTo(Double value) {
            addCriterion("ocA1 <>", value, "oca1");
            return (Criteria) this;
        }

        public Criteria andOca1GreaterThan(Double value) {
            addCriterion("ocA1 >", value, "oca1");
            return (Criteria) this;
        }

        public Criteria andOca1GreaterThanOrEqualTo(Double value) {
            addCriterion("ocA1 >=", value, "oca1");
            return (Criteria) this;
        }

        public Criteria andOca1LessThan(Double value) {
            addCriterion("ocA1 <", value, "oca1");
            return (Criteria) this;
        }

        public Criteria andOca1LessThanOrEqualTo(Double value) {
            addCriterion("ocA1 <=", value, "oca1");
            return (Criteria) this;
        }

        public Criteria andOca1In(List<Double> values) {
            addCriterion("ocA1 in", values, "oca1");
            return (Criteria) this;
        }

        public Criteria andOca1NotIn(List<Double> values) {
            addCriterion("ocA1 not in", values, "oca1");
            return (Criteria) this;
        }

        public Criteria andOca1Between(Double value1, Double value2) {
            addCriterion("ocA1 between", value1, value2, "oca1");
            return (Criteria) this;
        }

        public Criteria andOca1NotBetween(Double value1, Double value2) {
            addCriterion("ocA1 not between", value1, value2, "oca1");
            return (Criteria) this;
        }

        public Criteria andOca2IsNull() {
            addCriterion("ocA2 is null");
            return (Criteria) this;
        }

        public Criteria andOca2IsNotNull() {
            addCriterion("ocA2 is not null");
            return (Criteria) this;
        }

        public Criteria andOca2EqualTo(Double value) {
            addCriterion("ocA2 =", value, "oca2");
            return (Criteria) this;
        }

        public Criteria andOca2NotEqualTo(Double value) {
            addCriterion("ocA2 <>", value, "oca2");
            return (Criteria) this;
        }

        public Criteria andOca2GreaterThan(Double value) {
            addCriterion("ocA2 >", value, "oca2");
            return (Criteria) this;
        }

        public Criteria andOca2GreaterThanOrEqualTo(Double value) {
            addCriterion("ocA2 >=", value, "oca2");
            return (Criteria) this;
        }

        public Criteria andOca2LessThan(Double value) {
            addCriterion("ocA2 <", value, "oca2");
            return (Criteria) this;
        }

        public Criteria andOca2LessThanOrEqualTo(Double value) {
            addCriterion("ocA2 <=", value, "oca2");
            return (Criteria) this;
        }

        public Criteria andOca2In(List<Double> values) {
            addCriterion("ocA2 in", values, "oca2");
            return (Criteria) this;
        }

        public Criteria andOca2NotIn(List<Double> values) {
            addCriterion("ocA2 not in", values, "oca2");
            return (Criteria) this;
        }

        public Criteria andOca2Between(Double value1, Double value2) {
            addCriterion("ocA2 between", value1, value2, "oca2");
            return (Criteria) this;
        }

        public Criteria andOca2NotBetween(Double value1, Double value2) {
            addCriterion("ocA2 not between", value1, value2, "oca2");
            return (Criteria) this;
        }

        public Criteria andOca3IsNull() {
            addCriterion("ocA3 is null");
            return (Criteria) this;
        }

        public Criteria andOca3IsNotNull() {
            addCriterion("ocA3 is not null");
            return (Criteria) this;
        }

        public Criteria andOca3EqualTo(Double value) {
            addCriterion("ocA3 =", value, "oca3");
            return (Criteria) this;
        }

        public Criteria andOca3NotEqualTo(Double value) {
            addCriterion("ocA3 <>", value, "oca3");
            return (Criteria) this;
        }

        public Criteria andOca3GreaterThan(Double value) {
            addCriterion("ocA3 >", value, "oca3");
            return (Criteria) this;
        }

        public Criteria andOca3GreaterThanOrEqualTo(Double value) {
            addCriterion("ocA3 >=", value, "oca3");
            return (Criteria) this;
        }

        public Criteria andOca3LessThan(Double value) {
            addCriterion("ocA3 <", value, "oca3");
            return (Criteria) this;
        }

        public Criteria andOca3LessThanOrEqualTo(Double value) {
            addCriterion("ocA3 <=", value, "oca3");
            return (Criteria) this;
        }

        public Criteria andOca3In(List<Double> values) {
            addCriterion("ocA3 in", values, "oca3");
            return (Criteria) this;
        }

        public Criteria andOca3NotIn(List<Double> values) {
            addCriterion("ocA3 not in", values, "oca3");
            return (Criteria) this;
        }

        public Criteria andOca3Between(Double value1, Double value2) {
            addCriterion("ocA3 between", value1, value2, "oca3");
            return (Criteria) this;
        }

        public Criteria andOca3NotBetween(Double value1, Double value2) {
            addCriterion("ocA3 not between", value1, value2, "oca3");
            return (Criteria) this;
        }

        public Criteria andOca4IsNull() {
            addCriterion("ocA4 is null");
            return (Criteria) this;
        }

        public Criteria andOca4IsNotNull() {
            addCriterion("ocA4 is not null");
            return (Criteria) this;
        }

        public Criteria andOca4EqualTo(Double value) {
            addCriterion("ocA4 =", value, "oca4");
            return (Criteria) this;
        }

        public Criteria andOca4NotEqualTo(Double value) {
            addCriterion("ocA4 <>", value, "oca4");
            return (Criteria) this;
        }

        public Criteria andOca4GreaterThan(Double value) {
            addCriterion("ocA4 >", value, "oca4");
            return (Criteria) this;
        }

        public Criteria andOca4GreaterThanOrEqualTo(Double value) {
            addCriterion("ocA4 >=", value, "oca4");
            return (Criteria) this;
        }

        public Criteria andOca4LessThan(Double value) {
            addCriterion("ocA4 <", value, "oca4");
            return (Criteria) this;
        }

        public Criteria andOca4LessThanOrEqualTo(Double value) {
            addCriterion("ocA4 <=", value, "oca4");
            return (Criteria) this;
        }

        public Criteria andOca4In(List<Double> values) {
            addCriterion("ocA4 in", values, "oca4");
            return (Criteria) this;
        }

        public Criteria andOca4NotIn(List<Double> values) {
            addCriterion("ocA4 not in", values, "oca4");
            return (Criteria) this;
        }

        public Criteria andOca4Between(Double value1, Double value2) {
            addCriterion("ocA4 between", value1, value2, "oca4");
            return (Criteria) this;
        }

        public Criteria andOca4NotBetween(Double value1, Double value2) {
            addCriterion("ocA4 not between", value1, value2, "oca4");
            return (Criteria) this;
        }

        public Criteria andOca5IsNull() {
            addCriterion("ocA5 is null");
            return (Criteria) this;
        }

        public Criteria andOca5IsNotNull() {
            addCriterion("ocA5 is not null");
            return (Criteria) this;
        }

        public Criteria andOca5EqualTo(Double value) {
            addCriterion("ocA5 =", value, "oca5");
            return (Criteria) this;
        }

        public Criteria andOca5NotEqualTo(Double value) {
            addCriterion("ocA5 <>", value, "oca5");
            return (Criteria) this;
        }

        public Criteria andOca5GreaterThan(Double value) {
            addCriterion("ocA5 >", value, "oca5");
            return (Criteria) this;
        }

        public Criteria andOca5GreaterThanOrEqualTo(Double value) {
            addCriterion("ocA5 >=", value, "oca5");
            return (Criteria) this;
        }

        public Criteria andOca5LessThan(Double value) {
            addCriterion("ocA5 <", value, "oca5");
            return (Criteria) this;
        }

        public Criteria andOca5LessThanOrEqualTo(Double value) {
            addCriterion("ocA5 <=", value, "oca5");
            return (Criteria) this;
        }

        public Criteria andOca5In(List<Double> values) {
            addCriterion("ocA5 in", values, "oca5");
            return (Criteria) this;
        }

        public Criteria andOca5NotIn(List<Double> values) {
            addCriterion("ocA5 not in", values, "oca5");
            return (Criteria) this;
        }

        public Criteria andOca5Between(Double value1, Double value2) {
            addCriterion("ocA5 between", value1, value2, "oca5");
            return (Criteria) this;
        }

        public Criteria andOca5NotBetween(Double value1, Double value2) {
            addCriterion("ocA5 not between", value1, value2, "oca5");
            return (Criteria) this;
        }

        public Criteria andOca6IsNull() {
            addCriterion("ocA6 is null");
            return (Criteria) this;
        }

        public Criteria andOca6IsNotNull() {
            addCriterion("ocA6 is not null");
            return (Criteria) this;
        }

        public Criteria andOca6EqualTo(Double value) {
            addCriterion("ocA6 =", value, "oca6");
            return (Criteria) this;
        }

        public Criteria andOca6NotEqualTo(Double value) {
            addCriterion("ocA6 <>", value, "oca6");
            return (Criteria) this;
        }

        public Criteria andOca6GreaterThan(Double value) {
            addCriterion("ocA6 >", value, "oca6");
            return (Criteria) this;
        }

        public Criteria andOca6GreaterThanOrEqualTo(Double value) {
            addCriterion("ocA6 >=", value, "oca6");
            return (Criteria) this;
        }

        public Criteria andOca6LessThan(Double value) {
            addCriterion("ocA6 <", value, "oca6");
            return (Criteria) this;
        }

        public Criteria andOca6LessThanOrEqualTo(Double value) {
            addCriterion("ocA6 <=", value, "oca6");
            return (Criteria) this;
        }

        public Criteria andOca6In(List<Double> values) {
            addCriterion("ocA6 in", values, "oca6");
            return (Criteria) this;
        }

        public Criteria andOca6NotIn(List<Double> values) {
            addCriterion("ocA6 not in", values, "oca6");
            return (Criteria) this;
        }

        public Criteria andOca6Between(Double value1, Double value2) {
            addCriterion("ocA6 between", value1, value2, "oca6");
            return (Criteria) this;
        }

        public Criteria andOca6NotBetween(Double value1, Double value2) {
            addCriterion("ocA6 not between", value1, value2, "oca6");
            return (Criteria) this;
        }

        public Criteria andOca7IsNull() {
            addCriterion("ocA7 is null");
            return (Criteria) this;
        }

        public Criteria andOca7IsNotNull() {
            addCriterion("ocA7 is not null");
            return (Criteria) this;
        }

        public Criteria andOca7EqualTo(Double value) {
            addCriterion("ocA7 =", value, "oca7");
            return (Criteria) this;
        }

        public Criteria andOca7NotEqualTo(Double value) {
            addCriterion("ocA7 <>", value, "oca7");
            return (Criteria) this;
        }

        public Criteria andOca7GreaterThan(Double value) {
            addCriterion("ocA7 >", value, "oca7");
            return (Criteria) this;
        }

        public Criteria andOca7GreaterThanOrEqualTo(Double value) {
            addCriterion("ocA7 >=", value, "oca7");
            return (Criteria) this;
        }

        public Criteria andOca7LessThan(Double value) {
            addCriterion("ocA7 <", value, "oca7");
            return (Criteria) this;
        }

        public Criteria andOca7LessThanOrEqualTo(Double value) {
            addCriterion("ocA7 <=", value, "oca7");
            return (Criteria) this;
        }

        public Criteria andOca7In(List<Double> values) {
            addCriterion("ocA7 in", values, "oca7");
            return (Criteria) this;
        }

        public Criteria andOca7NotIn(List<Double> values) {
            addCriterion("ocA7 not in", values, "oca7");
            return (Criteria) this;
        }

        public Criteria andOca7Between(Double value1, Double value2) {
            addCriterion("ocA7 between", value1, value2, "oca7");
            return (Criteria) this;
        }

        public Criteria andOca7NotBetween(Double value1, Double value2) {
            addCriterion("ocA7 not between", value1, value2, "oca7");
            return (Criteria) this;
        }

        public Criteria andOca8IsNull() {
            addCriterion("ocA8 is null");
            return (Criteria) this;
        }

        public Criteria andOca8IsNotNull() {
            addCriterion("ocA8 is not null");
            return (Criteria) this;
        }

        public Criteria andOca8EqualTo(Double value) {
            addCriterion("ocA8 =", value, "oca8");
            return (Criteria) this;
        }

        public Criteria andOca8NotEqualTo(Double value) {
            addCriterion("ocA8 <>", value, "oca8");
            return (Criteria) this;
        }

        public Criteria andOca8GreaterThan(Double value) {
            addCriterion("ocA8 >", value, "oca8");
            return (Criteria) this;
        }

        public Criteria andOca8GreaterThanOrEqualTo(Double value) {
            addCriterion("ocA8 >=", value, "oca8");
            return (Criteria) this;
        }

        public Criteria andOca8LessThan(Double value) {
            addCriterion("ocA8 <", value, "oca8");
            return (Criteria) this;
        }

        public Criteria andOca8LessThanOrEqualTo(Double value) {
            addCriterion("ocA8 <=", value, "oca8");
            return (Criteria) this;
        }

        public Criteria andOca8In(List<Double> values) {
            addCriterion("ocA8 in", values, "oca8");
            return (Criteria) this;
        }

        public Criteria andOca8NotIn(List<Double> values) {
            addCriterion("ocA8 not in", values, "oca8");
            return (Criteria) this;
        }

        public Criteria andOca8Between(Double value1, Double value2) {
            addCriterion("ocA8 between", value1, value2, "oca8");
            return (Criteria) this;
        }

        public Criteria andOca8NotBetween(Double value1, Double value2) {
            addCriterion("ocA8 not between", value1, value2, "oca8");
            return (Criteria) this;
        }

        public Criteria andOca9IsNull() {
            addCriterion("ocA9 is null");
            return (Criteria) this;
        }

        public Criteria andOca9IsNotNull() {
            addCriterion("ocA9 is not null");
            return (Criteria) this;
        }

        public Criteria andOca9EqualTo(Double value) {
            addCriterion("ocA9 =", value, "oca9");
            return (Criteria) this;
        }

        public Criteria andOca9NotEqualTo(Double value) {
            addCriterion("ocA9 <>", value, "oca9");
            return (Criteria) this;
        }

        public Criteria andOca9GreaterThan(Double value) {
            addCriterion("ocA9 >", value, "oca9");
            return (Criteria) this;
        }

        public Criteria andOca9GreaterThanOrEqualTo(Double value) {
            addCriterion("ocA9 >=", value, "oca9");
            return (Criteria) this;
        }

        public Criteria andOca9LessThan(Double value) {
            addCriterion("ocA9 <", value, "oca9");
            return (Criteria) this;
        }

        public Criteria andOca9LessThanOrEqualTo(Double value) {
            addCriterion("ocA9 <=", value, "oca9");
            return (Criteria) this;
        }

        public Criteria andOca9In(List<Double> values) {
            addCriterion("ocA9 in", values, "oca9");
            return (Criteria) this;
        }

        public Criteria andOca9NotIn(List<Double> values) {
            addCriterion("ocA9 not in", values, "oca9");
            return (Criteria) this;
        }

        public Criteria andOca9Between(Double value1, Double value2) {
            addCriterion("ocA9 between", value1, value2, "oca9");
            return (Criteria) this;
        }

        public Criteria andOca9NotBetween(Double value1, Double value2) {
            addCriterion("ocA9 not between", value1, value2, "oca9");
            return (Criteria) this;
        }

        public Criteria andOca10IsNull() {
            addCriterion("ocA10 is null");
            return (Criteria) this;
        }

        public Criteria andOca10IsNotNull() {
            addCriterion("ocA10 is not null");
            return (Criteria) this;
        }

        public Criteria andOca10EqualTo(Double value) {
            addCriterion("ocA10 =", value, "oca10");
            return (Criteria) this;
        }

        public Criteria andOca10NotEqualTo(Double value) {
            addCriterion("ocA10 <>", value, "oca10");
            return (Criteria) this;
        }

        public Criteria andOca10GreaterThan(Double value) {
            addCriterion("ocA10 >", value, "oca10");
            return (Criteria) this;
        }

        public Criteria andOca10GreaterThanOrEqualTo(Double value) {
            addCriterion("ocA10 >=", value, "oca10");
            return (Criteria) this;
        }

        public Criteria andOca10LessThan(Double value) {
            addCriterion("ocA10 <", value, "oca10");
            return (Criteria) this;
        }

        public Criteria andOca10LessThanOrEqualTo(Double value) {
            addCriterion("ocA10 <=", value, "oca10");
            return (Criteria) this;
        }

        public Criteria andOca10In(List<Double> values) {
            addCriterion("ocA10 in", values, "oca10");
            return (Criteria) this;
        }

        public Criteria andOca10NotIn(List<Double> values) {
            addCriterion("ocA10 not in", values, "oca10");
            return (Criteria) this;
        }

        public Criteria andOca10Between(Double value1, Double value2) {
            addCriterion("ocA10 between", value1, value2, "oca10");
            return (Criteria) this;
        }

        public Criteria andOca10NotBetween(Double value1, Double value2) {
            addCriterion("ocA10 not between", value1, value2, "oca10");
            return (Criteria) this;
        }

        public Criteria andOca11IsNull() {
            addCriterion("ocA11 is null");
            return (Criteria) this;
        }

        public Criteria andOca11IsNotNull() {
            addCriterion("ocA11 is not null");
            return (Criteria) this;
        }

        public Criteria andOca11EqualTo(Double value) {
            addCriterion("ocA11 =", value, "oca11");
            return (Criteria) this;
        }

        public Criteria andOca11NotEqualTo(Double value) {
            addCriterion("ocA11 <>", value, "oca11");
            return (Criteria) this;
        }

        public Criteria andOca11GreaterThan(Double value) {
            addCriterion("ocA11 >", value, "oca11");
            return (Criteria) this;
        }

        public Criteria andOca11GreaterThanOrEqualTo(Double value) {
            addCriterion("ocA11 >=", value, "oca11");
            return (Criteria) this;
        }

        public Criteria andOca11LessThan(Double value) {
            addCriterion("ocA11 <", value, "oca11");
            return (Criteria) this;
        }

        public Criteria andOca11LessThanOrEqualTo(Double value) {
            addCriterion("ocA11 <=", value, "oca11");
            return (Criteria) this;
        }

        public Criteria andOca11In(List<Double> values) {
            addCriterion("ocA11 in", values, "oca11");
            return (Criteria) this;
        }

        public Criteria andOca11NotIn(List<Double> values) {
            addCriterion("ocA11 not in", values, "oca11");
            return (Criteria) this;
        }

        public Criteria andOca11Between(Double value1, Double value2) {
            addCriterion("ocA11 between", value1, value2, "oca11");
            return (Criteria) this;
        }

        public Criteria andOca11NotBetween(Double value1, Double value2) {
            addCriterion("ocA11 not between", value1, value2, "oca11");
            return (Criteria) this;
        }

        public Criteria andOca12IsNull() {
            addCriterion("ocA12 is null");
            return (Criteria) this;
        }

        public Criteria andOca12IsNotNull() {
            addCriterion("ocA12 is not null");
            return (Criteria) this;
        }

        public Criteria andOca12EqualTo(Double value) {
            addCriterion("ocA12 =", value, "oca12");
            return (Criteria) this;
        }

        public Criteria andOca12NotEqualTo(Double value) {
            addCriterion("ocA12 <>", value, "oca12");
            return (Criteria) this;
        }

        public Criteria andOca12GreaterThan(Double value) {
            addCriterion("ocA12 >", value, "oca12");
            return (Criteria) this;
        }

        public Criteria andOca12GreaterThanOrEqualTo(Double value) {
            addCriterion("ocA12 >=", value, "oca12");
            return (Criteria) this;
        }

        public Criteria andOca12LessThan(Double value) {
            addCriterion("ocA12 <", value, "oca12");
            return (Criteria) this;
        }

        public Criteria andOca12LessThanOrEqualTo(Double value) {
            addCriterion("ocA12 <=", value, "oca12");
            return (Criteria) this;
        }

        public Criteria andOca12In(List<Double> values) {
            addCriterion("ocA12 in", values, "oca12");
            return (Criteria) this;
        }

        public Criteria andOca12NotIn(List<Double> values) {
            addCriterion("ocA12 not in", values, "oca12");
            return (Criteria) this;
        }

        public Criteria andOca12Between(Double value1, Double value2) {
            addCriterion("ocA12 between", value1, value2, "oca12");
            return (Criteria) this;
        }

        public Criteria andOca12NotBetween(Double value1, Double value2) {
            addCriterion("ocA12 not between", value1, value2, "oca12");
            return (Criteria) this;
        }

        public Criteria andOca13IsNull() {
            addCriterion("ocA13 is null");
            return (Criteria) this;
        }

        public Criteria andOca13IsNotNull() {
            addCriterion("ocA13 is not null");
            return (Criteria) this;
        }

        public Criteria andOca13EqualTo(Double value) {
            addCriterion("ocA13 =", value, "oca13");
            return (Criteria) this;
        }

        public Criteria andOca13NotEqualTo(Double value) {
            addCriterion("ocA13 <>", value, "oca13");
            return (Criteria) this;
        }

        public Criteria andOca13GreaterThan(Double value) {
            addCriterion("ocA13 >", value, "oca13");
            return (Criteria) this;
        }

        public Criteria andOca13GreaterThanOrEqualTo(Double value) {
            addCriterion("ocA13 >=", value, "oca13");
            return (Criteria) this;
        }

        public Criteria andOca13LessThan(Double value) {
            addCriterion("ocA13 <", value, "oca13");
            return (Criteria) this;
        }

        public Criteria andOca13LessThanOrEqualTo(Double value) {
            addCriterion("ocA13 <=", value, "oca13");
            return (Criteria) this;
        }

        public Criteria andOca13In(List<Double> values) {
            addCriterion("ocA13 in", values, "oca13");
            return (Criteria) this;
        }

        public Criteria andOca13NotIn(List<Double> values) {
            addCriterion("ocA13 not in", values, "oca13");
            return (Criteria) this;
        }

        public Criteria andOca13Between(Double value1, Double value2) {
            addCriterion("ocA13 between", value1, value2, "oca13");
            return (Criteria) this;
        }

        public Criteria andOca13NotBetween(Double value1, Double value2) {
            addCriterion("ocA13 not between", value1, value2, "oca13");
            return (Criteria) this;
        }

        public Criteria andOca14IsNull() {
            addCriterion("ocA14 is null");
            return (Criteria) this;
        }

        public Criteria andOca14IsNotNull() {
            addCriterion("ocA14 is not null");
            return (Criteria) this;
        }

        public Criteria andOca14EqualTo(Double value) {
            addCriterion("ocA14 =", value, "oca14");
            return (Criteria) this;
        }

        public Criteria andOca14NotEqualTo(Double value) {
            addCriterion("ocA14 <>", value, "oca14");
            return (Criteria) this;
        }

        public Criteria andOca14GreaterThan(Double value) {
            addCriterion("ocA14 >", value, "oca14");
            return (Criteria) this;
        }

        public Criteria andOca14GreaterThanOrEqualTo(Double value) {
            addCriterion("ocA14 >=", value, "oca14");
            return (Criteria) this;
        }

        public Criteria andOca14LessThan(Double value) {
            addCriterion("ocA14 <", value, "oca14");
            return (Criteria) this;
        }

        public Criteria andOca14LessThanOrEqualTo(Double value) {
            addCriterion("ocA14 <=", value, "oca14");
            return (Criteria) this;
        }

        public Criteria andOca14In(List<Double> values) {
            addCriterion("ocA14 in", values, "oca14");
            return (Criteria) this;
        }

        public Criteria andOca14NotIn(List<Double> values) {
            addCriterion("ocA14 not in", values, "oca14");
            return (Criteria) this;
        }

        public Criteria andOca14Between(Double value1, Double value2) {
            addCriterion("ocA14 between", value1, value2, "oca14");
            return (Criteria) this;
        }

        public Criteria andOca14NotBetween(Double value1, Double value2) {
            addCriterion("ocA14 not between", value1, value2, "oca14");
            return (Criteria) this;
        }

        public Criteria andOca15IsNull() {
            addCriterion("ocA15 is null");
            return (Criteria) this;
        }

        public Criteria andOca15IsNotNull() {
            addCriterion("ocA15 is not null");
            return (Criteria) this;
        }

        public Criteria andOca15EqualTo(Double value) {
            addCriterion("ocA15 =", value, "oca15");
            return (Criteria) this;
        }

        public Criteria andOca15NotEqualTo(Double value) {
            addCriterion("ocA15 <>", value, "oca15");
            return (Criteria) this;
        }

        public Criteria andOca15GreaterThan(Double value) {
            addCriterion("ocA15 >", value, "oca15");
            return (Criteria) this;
        }

        public Criteria andOca15GreaterThanOrEqualTo(Double value) {
            addCriterion("ocA15 >=", value, "oca15");
            return (Criteria) this;
        }

        public Criteria andOca15LessThan(Double value) {
            addCriterion("ocA15 <", value, "oca15");
            return (Criteria) this;
        }

        public Criteria andOca15LessThanOrEqualTo(Double value) {
            addCriterion("ocA15 <=", value, "oca15");
            return (Criteria) this;
        }

        public Criteria andOca15In(List<Double> values) {
            addCriterion("ocA15 in", values, "oca15");
            return (Criteria) this;
        }

        public Criteria andOca15NotIn(List<Double> values) {
            addCriterion("ocA15 not in", values, "oca15");
            return (Criteria) this;
        }

        public Criteria andOca15Between(Double value1, Double value2) {
            addCriterion("ocA15 between", value1, value2, "oca15");
            return (Criteria) this;
        }

        public Criteria andOca15NotBetween(Double value1, Double value2) {
            addCriterion("ocA15 not between", value1, value2, "oca15");
            return (Criteria) this;
        }

        public Criteria andOca16IsNull() {
            addCriterion("ocA16 is null");
            return (Criteria) this;
        }

        public Criteria andOca16IsNotNull() {
            addCriterion("ocA16 is not null");
            return (Criteria) this;
        }

        public Criteria andOca16EqualTo(Double value) {
            addCriterion("ocA16 =", value, "oca16");
            return (Criteria) this;
        }

        public Criteria andOca16NotEqualTo(Double value) {
            addCriterion("ocA16 <>", value, "oca16");
            return (Criteria) this;
        }

        public Criteria andOca16GreaterThan(Double value) {
            addCriterion("ocA16 >", value, "oca16");
            return (Criteria) this;
        }

        public Criteria andOca16GreaterThanOrEqualTo(Double value) {
            addCriterion("ocA16 >=", value, "oca16");
            return (Criteria) this;
        }

        public Criteria andOca16LessThan(Double value) {
            addCriterion("ocA16 <", value, "oca16");
            return (Criteria) this;
        }

        public Criteria andOca16LessThanOrEqualTo(Double value) {
            addCriterion("ocA16 <=", value, "oca16");
            return (Criteria) this;
        }

        public Criteria andOca16In(List<Double> values) {
            addCriterion("ocA16 in", values, "oca16");
            return (Criteria) this;
        }

        public Criteria andOca16NotIn(List<Double> values) {
            addCriterion("ocA16 not in", values, "oca16");
            return (Criteria) this;
        }

        public Criteria andOca16Between(Double value1, Double value2) {
            addCriterion("ocA16 between", value1, value2, "oca16");
            return (Criteria) this;
        }

        public Criteria andOca16NotBetween(Double value1, Double value2) {
            addCriterion("ocA16 not between", value1, value2, "oca16");
            return (Criteria) this;
        }

        public Criteria andOca17IsNull() {
            addCriterion("ocA17 is null");
            return (Criteria) this;
        }

        public Criteria andOca17IsNotNull() {
            addCriterion("ocA17 is not null");
            return (Criteria) this;
        }

        public Criteria andOca17EqualTo(Double value) {
            addCriterion("ocA17 =", value, "oca17");
            return (Criteria) this;
        }

        public Criteria andOca17NotEqualTo(Double value) {
            addCriterion("ocA17 <>", value, "oca17");
            return (Criteria) this;
        }

        public Criteria andOca17GreaterThan(Double value) {
            addCriterion("ocA17 >", value, "oca17");
            return (Criteria) this;
        }

        public Criteria andOca17GreaterThanOrEqualTo(Double value) {
            addCriterion("ocA17 >=", value, "oca17");
            return (Criteria) this;
        }

        public Criteria andOca17LessThan(Double value) {
            addCriterion("ocA17 <", value, "oca17");
            return (Criteria) this;
        }

        public Criteria andOca17LessThanOrEqualTo(Double value) {
            addCriterion("ocA17 <=", value, "oca17");
            return (Criteria) this;
        }

        public Criteria andOca17In(List<Double> values) {
            addCriterion("ocA17 in", values, "oca17");
            return (Criteria) this;
        }

        public Criteria andOca17NotIn(List<Double> values) {
            addCriterion("ocA17 not in", values, "oca17");
            return (Criteria) this;
        }

        public Criteria andOca17Between(Double value1, Double value2) {
            addCriterion("ocA17 between", value1, value2, "oca17");
            return (Criteria) this;
        }

        public Criteria andOca17NotBetween(Double value1, Double value2) {
            addCriterion("ocA17 not between", value1, value2, "oca17");
            return (Criteria) this;
        }

        public Criteria andOca18IsNull() {
            addCriterion("ocA18 is null");
            return (Criteria) this;
        }

        public Criteria andOca18IsNotNull() {
            addCriterion("ocA18 is not null");
            return (Criteria) this;
        }

        public Criteria andOca18EqualTo(Double value) {
            addCriterion("ocA18 =", value, "oca18");
            return (Criteria) this;
        }

        public Criteria andOca18NotEqualTo(Double value) {
            addCriterion("ocA18 <>", value, "oca18");
            return (Criteria) this;
        }

        public Criteria andOca18GreaterThan(Double value) {
            addCriterion("ocA18 >", value, "oca18");
            return (Criteria) this;
        }

        public Criteria andOca18GreaterThanOrEqualTo(Double value) {
            addCriterion("ocA18 >=", value, "oca18");
            return (Criteria) this;
        }

        public Criteria andOca18LessThan(Double value) {
            addCriterion("ocA18 <", value, "oca18");
            return (Criteria) this;
        }

        public Criteria andOca18LessThanOrEqualTo(Double value) {
            addCriterion("ocA18 <=", value, "oca18");
            return (Criteria) this;
        }

        public Criteria andOca18In(List<Double> values) {
            addCriterion("ocA18 in", values, "oca18");
            return (Criteria) this;
        }

        public Criteria andOca18NotIn(List<Double> values) {
            addCriterion("ocA18 not in", values, "oca18");
            return (Criteria) this;
        }

        public Criteria andOca18Between(Double value1, Double value2) {
            addCriterion("ocA18 between", value1, value2, "oca18");
            return (Criteria) this;
        }

        public Criteria andOca18NotBetween(Double value1, Double value2) {
            addCriterion("ocA18 not between", value1, value2, "oca18");
            return (Criteria) this;
        }

        public Criteria andOca19IsNull() {
            addCriterion("ocA19 is null");
            return (Criteria) this;
        }

        public Criteria andOca19IsNotNull() {
            addCriterion("ocA19 is not null");
            return (Criteria) this;
        }

        public Criteria andOca19EqualTo(Double value) {
            addCriterion("ocA19 =", value, "oca19");
            return (Criteria) this;
        }

        public Criteria andOca19NotEqualTo(Double value) {
            addCriterion("ocA19 <>", value, "oca19");
            return (Criteria) this;
        }

        public Criteria andOca19GreaterThan(Double value) {
            addCriterion("ocA19 >", value, "oca19");
            return (Criteria) this;
        }

        public Criteria andOca19GreaterThanOrEqualTo(Double value) {
            addCriterion("ocA19 >=", value, "oca19");
            return (Criteria) this;
        }

        public Criteria andOca19LessThan(Double value) {
            addCriterion("ocA19 <", value, "oca19");
            return (Criteria) this;
        }

        public Criteria andOca19LessThanOrEqualTo(Double value) {
            addCriterion("ocA19 <=", value, "oca19");
            return (Criteria) this;
        }

        public Criteria andOca19In(List<Double> values) {
            addCriterion("ocA19 in", values, "oca19");
            return (Criteria) this;
        }

        public Criteria andOca19NotIn(List<Double> values) {
            addCriterion("ocA19 not in", values, "oca19");
            return (Criteria) this;
        }

        public Criteria andOca19Between(Double value1, Double value2) {
            addCriterion("ocA19 between", value1, value2, "oca19");
            return (Criteria) this;
        }

        public Criteria andOca19NotBetween(Double value1, Double value2) {
            addCriterion("ocA19 not between", value1, value2, "oca19");
            return (Criteria) this;
        }

        public Criteria andOca20IsNull() {
            addCriterion("ocA20 is null");
            return (Criteria) this;
        }

        public Criteria andOca20IsNotNull() {
            addCriterion("ocA20 is not null");
            return (Criteria) this;
        }

        public Criteria andOca20EqualTo(Double value) {
            addCriterion("ocA20 =", value, "oca20");
            return (Criteria) this;
        }

        public Criteria andOca20NotEqualTo(Double value) {
            addCriterion("ocA20 <>", value, "oca20");
            return (Criteria) this;
        }

        public Criteria andOca20GreaterThan(Double value) {
            addCriterion("ocA20 >", value, "oca20");
            return (Criteria) this;
        }

        public Criteria andOca20GreaterThanOrEqualTo(Double value) {
            addCriterion("ocA20 >=", value, "oca20");
            return (Criteria) this;
        }

        public Criteria andOca20LessThan(Double value) {
            addCriterion("ocA20 <", value, "oca20");
            return (Criteria) this;
        }

        public Criteria andOca20LessThanOrEqualTo(Double value) {
            addCriterion("ocA20 <=", value, "oca20");
            return (Criteria) this;
        }

        public Criteria andOca20In(List<Double> values) {
            addCriterion("ocA20 in", values, "oca20");
            return (Criteria) this;
        }

        public Criteria andOca20NotIn(List<Double> values) {
            addCriterion("ocA20 not in", values, "oca20");
            return (Criteria) this;
        }

        public Criteria andOca20Between(Double value1, Double value2) {
            addCriterion("ocA20 between", value1, value2, "oca20");
            return (Criteria) this;
        }

        public Criteria andOca20NotBetween(Double value1, Double value2) {
            addCriterion("ocA20 not between", value1, value2, "oca20");
            return (Criteria) this;
        }

        public Criteria andOca21IsNull() {
            addCriterion("ocA21 is null");
            return (Criteria) this;
        }

        public Criteria andOca21IsNotNull() {
            addCriterion("ocA21 is not null");
            return (Criteria) this;
        }

        public Criteria andOca21EqualTo(Double value) {
            addCriterion("ocA21 =", value, "oca21");
            return (Criteria) this;
        }

        public Criteria andOca21NotEqualTo(Double value) {
            addCriterion("ocA21 <>", value, "oca21");
            return (Criteria) this;
        }

        public Criteria andOca21GreaterThan(Double value) {
            addCriterion("ocA21 >", value, "oca21");
            return (Criteria) this;
        }

        public Criteria andOca21GreaterThanOrEqualTo(Double value) {
            addCriterion("ocA21 >=", value, "oca21");
            return (Criteria) this;
        }

        public Criteria andOca21LessThan(Double value) {
            addCriterion("ocA21 <", value, "oca21");
            return (Criteria) this;
        }

        public Criteria andOca21LessThanOrEqualTo(Double value) {
            addCriterion("ocA21 <=", value, "oca21");
            return (Criteria) this;
        }

        public Criteria andOca21In(List<Double> values) {
            addCriterion("ocA21 in", values, "oca21");
            return (Criteria) this;
        }

        public Criteria andOca21NotIn(List<Double> values) {
            addCriterion("ocA21 not in", values, "oca21");
            return (Criteria) this;
        }

        public Criteria andOca21Between(Double value1, Double value2) {
            addCriterion("ocA21 between", value1, value2, "oca21");
            return (Criteria) this;
        }

        public Criteria andOca21NotBetween(Double value1, Double value2) {
            addCriterion("ocA21 not between", value1, value2, "oca21");
            return (Criteria) this;
        }

        public Criteria andOca22IsNull() {
            addCriterion("ocA22 is null");
            return (Criteria) this;
        }

        public Criteria andOca22IsNotNull() {
            addCriterion("ocA22 is not null");
            return (Criteria) this;
        }

        public Criteria andOca22EqualTo(Double value) {
            addCriterion("ocA22 =", value, "oca22");
            return (Criteria) this;
        }

        public Criteria andOca22NotEqualTo(Double value) {
            addCriterion("ocA22 <>", value, "oca22");
            return (Criteria) this;
        }

        public Criteria andOca22GreaterThan(Double value) {
            addCriterion("ocA22 >", value, "oca22");
            return (Criteria) this;
        }

        public Criteria andOca22GreaterThanOrEqualTo(Double value) {
            addCriterion("ocA22 >=", value, "oca22");
            return (Criteria) this;
        }

        public Criteria andOca22LessThan(Double value) {
            addCriterion("ocA22 <", value, "oca22");
            return (Criteria) this;
        }

        public Criteria andOca22LessThanOrEqualTo(Double value) {
            addCriterion("ocA22 <=", value, "oca22");
            return (Criteria) this;
        }

        public Criteria andOca22In(List<Double> values) {
            addCriterion("ocA22 in", values, "oca22");
            return (Criteria) this;
        }

        public Criteria andOca22NotIn(List<Double> values) {
            addCriterion("ocA22 not in", values, "oca22");
            return (Criteria) this;
        }

        public Criteria andOca22Between(Double value1, Double value2) {
            addCriterion("ocA22 between", value1, value2, "oca22");
            return (Criteria) this;
        }

        public Criteria andOca22NotBetween(Double value1, Double value2) {
            addCriterion("ocA22 not between", value1, value2, "oca22");
            return (Criteria) this;
        }

        public Criteria andOca23IsNull() {
            addCriterion("ocA23 is null");
            return (Criteria) this;
        }

        public Criteria andOca23IsNotNull() {
            addCriterion("ocA23 is not null");
            return (Criteria) this;
        }

        public Criteria andOca23EqualTo(Double value) {
            addCriterion("ocA23 =", value, "oca23");
            return (Criteria) this;
        }

        public Criteria andOca23NotEqualTo(Double value) {
            addCriterion("ocA23 <>", value, "oca23");
            return (Criteria) this;
        }

        public Criteria andOca23GreaterThan(Double value) {
            addCriterion("ocA23 >", value, "oca23");
            return (Criteria) this;
        }

        public Criteria andOca23GreaterThanOrEqualTo(Double value) {
            addCriterion("ocA23 >=", value, "oca23");
            return (Criteria) this;
        }

        public Criteria andOca23LessThan(Double value) {
            addCriterion("ocA23 <", value, "oca23");
            return (Criteria) this;
        }

        public Criteria andOca23LessThanOrEqualTo(Double value) {
            addCriterion("ocA23 <=", value, "oca23");
            return (Criteria) this;
        }

        public Criteria andOca23In(List<Double> values) {
            addCriterion("ocA23 in", values, "oca23");
            return (Criteria) this;
        }

        public Criteria andOca23NotIn(List<Double> values) {
            addCriterion("ocA23 not in", values, "oca23");
            return (Criteria) this;
        }

        public Criteria andOca23Between(Double value1, Double value2) {
            addCriterion("ocA23 between", value1, value2, "oca23");
            return (Criteria) this;
        }

        public Criteria andOca23NotBetween(Double value1, Double value2) {
            addCriterion("ocA23 not between", value1, value2, "oca23");
            return (Criteria) this;
        }

        public Criteria andOca24IsNull() {
            addCriterion("ocA24 is null");
            return (Criteria) this;
        }

        public Criteria andOca24IsNotNull() {
            addCriterion("ocA24 is not null");
            return (Criteria) this;
        }

        public Criteria andOca24EqualTo(Double value) {
            addCriterion("ocA24 =", value, "oca24");
            return (Criteria) this;
        }

        public Criteria andOca24NotEqualTo(Double value) {
            addCriterion("ocA24 <>", value, "oca24");
            return (Criteria) this;
        }

        public Criteria andOca24GreaterThan(Double value) {
            addCriterion("ocA24 >", value, "oca24");
            return (Criteria) this;
        }

        public Criteria andOca24GreaterThanOrEqualTo(Double value) {
            addCriterion("ocA24 >=", value, "oca24");
            return (Criteria) this;
        }

        public Criteria andOca24LessThan(Double value) {
            addCriterion("ocA24 <", value, "oca24");
            return (Criteria) this;
        }

        public Criteria andOca24LessThanOrEqualTo(Double value) {
            addCriterion("ocA24 <=", value, "oca24");
            return (Criteria) this;
        }

        public Criteria andOca24In(List<Double> values) {
            addCriterion("ocA24 in", values, "oca24");
            return (Criteria) this;
        }

        public Criteria andOca24NotIn(List<Double> values) {
            addCriterion("ocA24 not in", values, "oca24");
            return (Criteria) this;
        }

        public Criteria andOca24Between(Double value1, Double value2) {
            addCriterion("ocA24 between", value1, value2, "oca24");
            return (Criteria) this;
        }

        public Criteria andOca24NotBetween(Double value1, Double value2) {
            addCriterion("ocA24 not between", value1, value2, "oca24");
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