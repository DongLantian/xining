package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class NaturalNowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NaturalNowExample() {
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

        public Criteria andNtIdIsNull() {
            addCriterion("nt_id is null");
            return (Criteria) this;
        }

        public Criteria andNtIdIsNotNull() {
            addCriterion("nt_id is not null");
            return (Criteria) this;
        }

        public Criteria andNtIdEqualTo(Integer value) {
            addCriterion("nt_id =", value, "ntId");
            return (Criteria) this;
        }

        public Criteria andNtIdNotEqualTo(Integer value) {
            addCriterion("nt_id <>", value, "ntId");
            return (Criteria) this;
        }

        public Criteria andNtIdGreaterThan(Integer value) {
            addCriterion("nt_id >", value, "ntId");
            return (Criteria) this;
        }

        public Criteria andNtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("nt_id >=", value, "ntId");
            return (Criteria) this;
        }

        public Criteria andNtIdLessThan(Integer value) {
            addCriterion("nt_id <", value, "ntId");
            return (Criteria) this;
        }

        public Criteria andNtIdLessThanOrEqualTo(Integer value) {
            addCriterion("nt_id <=", value, "ntId");
            return (Criteria) this;
        }

        public Criteria andNtIdIn(List<Integer> values) {
            addCriterion("nt_id in", values, "ntId");
            return (Criteria) this;
        }

        public Criteria andNtIdNotIn(List<Integer> values) {
            addCriterion("nt_id not in", values, "ntId");
            return (Criteria) this;
        }

        public Criteria andNtIdBetween(Integer value1, Integer value2) {
            addCriterion("nt_id between", value1, value2, "ntId");
            return (Criteria) this;
        }

        public Criteria andNtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("nt_id not between", value1, value2, "ntId");
            return (Criteria) this;
        }

        public Criteria andNtYearIsNull() {
            addCriterion("nt_year is null");
            return (Criteria) this;
        }

        public Criteria andNtYearIsNotNull() {
            addCriterion("nt_year is not null");
            return (Criteria) this;
        }

        public Criteria andNtYearEqualTo(Integer value) {
            addCriterion("nt_year =", value, "ntYear");
            return (Criteria) this;
        }

        public Criteria andNtYearNotEqualTo(Integer value) {
            addCriterion("nt_year <>", value, "ntYear");
            return (Criteria) this;
        }

        public Criteria andNtYearGreaterThan(Integer value) {
            addCriterion("nt_year >", value, "ntYear");
            return (Criteria) this;
        }

        public Criteria andNtYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("nt_year >=", value, "ntYear");
            return (Criteria) this;
        }

        public Criteria andNtYearLessThan(Integer value) {
            addCriterion("nt_year <", value, "ntYear");
            return (Criteria) this;
        }

        public Criteria andNtYearLessThanOrEqualTo(Integer value) {
            addCriterion("nt_year <=", value, "ntYear");
            return (Criteria) this;
        }

        public Criteria andNtYearIn(List<Integer> values) {
            addCriterion("nt_year in", values, "ntYear");
            return (Criteria) this;
        }

        public Criteria andNtYearNotIn(List<Integer> values) {
            addCriterion("nt_year not in", values, "ntYear");
            return (Criteria) this;
        }

        public Criteria andNtYearBetween(Integer value1, Integer value2) {
            addCriterion("nt_year between", value1, value2, "ntYear");
            return (Criteria) this;
        }

        public Criteria andNtYearNotBetween(Integer value1, Integer value2) {
            addCriterion("nt_year not between", value1, value2, "ntYear");
            return (Criteria) this;
        }

        public Criteria andNtDayIsNull() {
            addCriterion("nt_day is null");
            return (Criteria) this;
        }

        public Criteria andNtDayIsNotNull() {
            addCriterion("nt_day is not null");
            return (Criteria) this;
        }

        public Criteria andNtDayEqualTo(Integer value) {
            addCriterion("nt_day =", value, "ntDay");
            return (Criteria) this;
        }

        public Criteria andNtDayNotEqualTo(Integer value) {
            addCriterion("nt_day <>", value, "ntDay");
            return (Criteria) this;
        }

        public Criteria andNtDayGreaterThan(Integer value) {
            addCriterion("nt_day >", value, "ntDay");
            return (Criteria) this;
        }

        public Criteria andNtDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("nt_day >=", value, "ntDay");
            return (Criteria) this;
        }

        public Criteria andNtDayLessThan(Integer value) {
            addCriterion("nt_day <", value, "ntDay");
            return (Criteria) this;
        }

        public Criteria andNtDayLessThanOrEqualTo(Integer value) {
            addCriterion("nt_day <=", value, "ntDay");
            return (Criteria) this;
        }

        public Criteria andNtDayIn(List<Integer> values) {
            addCriterion("nt_day in", values, "ntDay");
            return (Criteria) this;
        }

        public Criteria andNtDayNotIn(List<Integer> values) {
            addCriterion("nt_day not in", values, "ntDay");
            return (Criteria) this;
        }

        public Criteria andNtDayBetween(Integer value1, Integer value2) {
            addCriterion("nt_day between", value1, value2, "ntDay");
            return (Criteria) this;
        }

        public Criteria andNtDayNotBetween(Integer value1, Integer value2) {
            addCriterion("nt_day not between", value1, value2, "ntDay");
            return (Criteria) this;
        }

        public Criteria andNtHourIsNull() {
            addCriterion("nt_hour is null");
            return (Criteria) this;
        }

        public Criteria andNtHourIsNotNull() {
            addCriterion("nt_hour is not null");
            return (Criteria) this;
        }

        public Criteria andNtHourEqualTo(Integer value) {
            addCriterion("nt_hour =", value, "ntHour");
            return (Criteria) this;
        }

        public Criteria andNtHourNotEqualTo(Integer value) {
            addCriterion("nt_hour <>", value, "ntHour");
            return (Criteria) this;
        }

        public Criteria andNtHourGreaterThan(Integer value) {
            addCriterion("nt_hour >", value, "ntHour");
            return (Criteria) this;
        }

        public Criteria andNtHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("nt_hour >=", value, "ntHour");
            return (Criteria) this;
        }

        public Criteria andNtHourLessThan(Integer value) {
            addCriterion("nt_hour <", value, "ntHour");
            return (Criteria) this;
        }

        public Criteria andNtHourLessThanOrEqualTo(Integer value) {
            addCriterion("nt_hour <=", value, "ntHour");
            return (Criteria) this;
        }

        public Criteria andNtHourIn(List<Integer> values) {
            addCriterion("nt_hour in", values, "ntHour");
            return (Criteria) this;
        }

        public Criteria andNtHourNotIn(List<Integer> values) {
            addCriterion("nt_hour not in", values, "ntHour");
            return (Criteria) this;
        }

        public Criteria andNtHourBetween(Integer value1, Integer value2) {
            addCriterion("nt_hour between", value1, value2, "ntHour");
            return (Criteria) this;
        }

        public Criteria andNtHourNotBetween(Integer value1, Integer value2) {
            addCriterion("nt_hour not between", value1, value2, "ntHour");
            return (Criteria) this;
        }

        public Criteria andNtRowIsNull() {
            addCriterion("nt_row is null");
            return (Criteria) this;
        }

        public Criteria andNtRowIsNotNull() {
            addCriterion("nt_row is not null");
            return (Criteria) this;
        }

        public Criteria andNtRowEqualTo(Integer value) {
            addCriterion("nt_row =", value, "ntRow");
            return (Criteria) this;
        }

        public Criteria andNtRowNotEqualTo(Integer value) {
            addCriterion("nt_row <>", value, "ntRow");
            return (Criteria) this;
        }

        public Criteria andNtRowGreaterThan(Integer value) {
            addCriterion("nt_row >", value, "ntRow");
            return (Criteria) this;
        }

        public Criteria andNtRowGreaterThanOrEqualTo(Integer value) {
            addCriterion("nt_row >=", value, "ntRow");
            return (Criteria) this;
        }

        public Criteria andNtRowLessThan(Integer value) {
            addCriterion("nt_row <", value, "ntRow");
            return (Criteria) this;
        }

        public Criteria andNtRowLessThanOrEqualTo(Integer value) {
            addCriterion("nt_row <=", value, "ntRow");
            return (Criteria) this;
        }

        public Criteria andNtRowIn(List<Integer> values) {
            addCriterion("nt_row in", values, "ntRow");
            return (Criteria) this;
        }

        public Criteria andNtRowNotIn(List<Integer> values) {
            addCriterion("nt_row not in", values, "ntRow");
            return (Criteria) this;
        }

        public Criteria andNtRowBetween(Integer value1, Integer value2) {
            addCriterion("nt_row between", value1, value2, "ntRow");
            return (Criteria) this;
        }

        public Criteria andNtRowNotBetween(Integer value1, Integer value2) {
            addCriterion("nt_row not between", value1, value2, "ntRow");
            return (Criteria) this;
        }

        public Criteria andNtColIsNull() {
            addCriterion("nt_col is null");
            return (Criteria) this;
        }

        public Criteria andNtColIsNotNull() {
            addCriterion("nt_col is not null");
            return (Criteria) this;
        }

        public Criteria andNtColEqualTo(Integer value) {
            addCriterion("nt_col =", value, "ntCol");
            return (Criteria) this;
        }

        public Criteria andNtColNotEqualTo(Integer value) {
            addCriterion("nt_col <>", value, "ntCol");
            return (Criteria) this;
        }

        public Criteria andNtColGreaterThan(Integer value) {
            addCriterion("nt_col >", value, "ntCol");
            return (Criteria) this;
        }

        public Criteria andNtColGreaterThanOrEqualTo(Integer value) {
            addCriterion("nt_col >=", value, "ntCol");
            return (Criteria) this;
        }

        public Criteria andNtColLessThan(Integer value) {
            addCriterion("nt_col <", value, "ntCol");
            return (Criteria) this;
        }

        public Criteria andNtColLessThanOrEqualTo(Integer value) {
            addCriterion("nt_col <=", value, "ntCol");
            return (Criteria) this;
        }

        public Criteria andNtColIn(List<Integer> values) {
            addCriterion("nt_col in", values, "ntCol");
            return (Criteria) this;
        }

        public Criteria andNtColNotIn(List<Integer> values) {
            addCriterion("nt_col not in", values, "ntCol");
            return (Criteria) this;
        }

        public Criteria andNtColBetween(Integer value1, Integer value2) {
            addCriterion("nt_col between", value1, value2, "ntCol");
            return (Criteria) this;
        }

        public Criteria andNtColNotBetween(Integer value1, Integer value2) {
            addCriterion("nt_col not between", value1, value2, "ntCol");
            return (Criteria) this;
        }

        public Criteria andNtAreaIsNull() {
            addCriterion("nt_area is null");
            return (Criteria) this;
        }

        public Criteria andNtAreaIsNotNull() {
            addCriterion("nt_area is not null");
            return (Criteria) this;
        }

        public Criteria andNtAreaEqualTo(Double value) {
            addCriterion("nt_area =", value, "ntArea");
            return (Criteria) this;
        }

        public Criteria andNtAreaNotEqualTo(Double value) {
            addCriterion("nt_area <>", value, "ntArea");
            return (Criteria) this;
        }

        public Criteria andNtAreaGreaterThan(Double value) {
            addCriterion("nt_area >", value, "ntArea");
            return (Criteria) this;
        }

        public Criteria andNtAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("nt_area >=", value, "ntArea");
            return (Criteria) this;
        }

        public Criteria andNtAreaLessThan(Double value) {
            addCriterion("nt_area <", value, "ntArea");
            return (Criteria) this;
        }

        public Criteria andNtAreaLessThanOrEqualTo(Double value) {
            addCriterion("nt_area <=", value, "ntArea");
            return (Criteria) this;
        }

        public Criteria andNtAreaIn(List<Double> values) {
            addCriterion("nt_area in", values, "ntArea");
            return (Criteria) this;
        }

        public Criteria andNtAreaNotIn(List<Double> values) {
            addCriterion("nt_area not in", values, "ntArea");
            return (Criteria) this;
        }

        public Criteria andNtAreaBetween(Double value1, Double value2) {
            addCriterion("nt_area between", value1, value2, "ntArea");
            return (Criteria) this;
        }

        public Criteria andNtAreaNotBetween(Double value1, Double value2) {
            addCriterion("nt_area not between", value1, value2, "ntArea");
            return (Criteria) this;
        }

        public Criteria andNtNoIsNull() {
            addCriterion("nt_no is null");
            return (Criteria) this;
        }

        public Criteria andNtNoIsNotNull() {
            addCriterion("nt_no is not null");
            return (Criteria) this;
        }

        public Criteria andNtNoEqualTo(Double value) {
            addCriterion("nt_no =", value, "ntNo");
            return (Criteria) this;
        }

        public Criteria andNtNoNotEqualTo(Double value) {
            addCriterion("nt_no <>", value, "ntNo");
            return (Criteria) this;
        }

        public Criteria andNtNoGreaterThan(Double value) {
            addCriterion("nt_no >", value, "ntNo");
            return (Criteria) this;
        }

        public Criteria andNtNoGreaterThanOrEqualTo(Double value) {
            addCriterion("nt_no >=", value, "ntNo");
            return (Criteria) this;
        }

        public Criteria andNtNoLessThan(Double value) {
            addCriterion("nt_no <", value, "ntNo");
            return (Criteria) this;
        }

        public Criteria andNtNoLessThanOrEqualTo(Double value) {
            addCriterion("nt_no <=", value, "ntNo");
            return (Criteria) this;
        }

        public Criteria andNtNoIn(List<Double> values) {
            addCriterion("nt_no in", values, "ntNo");
            return (Criteria) this;
        }

        public Criteria andNtNoNotIn(List<Double> values) {
            addCriterion("nt_no not in", values, "ntNo");
            return (Criteria) this;
        }

        public Criteria andNtNoBetween(Double value1, Double value2) {
            addCriterion("nt_no between", value1, value2, "ntNo");
            return (Criteria) this;
        }

        public Criteria andNtNoNotBetween(Double value1, Double value2) {
            addCriterion("nt_no not between", value1, value2, "ntNo");
            return (Criteria) this;
        }

        public Criteria andNtNh3IsNull() {
            addCriterion("nt_nh3 is null");
            return (Criteria) this;
        }

        public Criteria andNtNh3IsNotNull() {
            addCriterion("nt_nh3 is not null");
            return (Criteria) this;
        }

        public Criteria andNtNh3EqualTo(Double value) {
            addCriterion("nt_nh3 =", value, "ntNh3");
            return (Criteria) this;
        }

        public Criteria andNtNh3NotEqualTo(Double value) {
            addCriterion("nt_nh3 <>", value, "ntNh3");
            return (Criteria) this;
        }

        public Criteria andNtNh3GreaterThan(Double value) {
            addCriterion("nt_nh3 >", value, "ntNh3");
            return (Criteria) this;
        }

        public Criteria andNtNh3GreaterThanOrEqualTo(Double value) {
            addCriterion("nt_nh3 >=", value, "ntNh3");
            return (Criteria) this;
        }

        public Criteria andNtNh3LessThan(Double value) {
            addCriterion("nt_nh3 <", value, "ntNh3");
            return (Criteria) this;
        }

        public Criteria andNtNh3LessThanOrEqualTo(Double value) {
            addCriterion("nt_nh3 <=", value, "ntNh3");
            return (Criteria) this;
        }

        public Criteria andNtNh3In(List<Double> values) {
            addCriterion("nt_nh3 in", values, "ntNh3");
            return (Criteria) this;
        }

        public Criteria andNtNh3NotIn(List<Double> values) {
            addCriterion("nt_nh3 not in", values, "ntNh3");
            return (Criteria) this;
        }

        public Criteria andNtNh3Between(Double value1, Double value2) {
            addCriterion("nt_nh3 between", value1, value2, "ntNh3");
            return (Criteria) this;
        }

        public Criteria andNtNh3NotBetween(Double value1, Double value2) {
            addCriterion("nt_nh3 not between", value1, value2, "ntNh3");
            return (Criteria) this;
        }

        public Criteria andNtCoIsNull() {
            addCriterion("nt_co is null");
            return (Criteria) this;
        }

        public Criteria andNtCoIsNotNull() {
            addCriterion("nt_co is not null");
            return (Criteria) this;
        }

        public Criteria andNtCoEqualTo(Double value) {
            addCriterion("nt_co =", value, "ntCo");
            return (Criteria) this;
        }

        public Criteria andNtCoNotEqualTo(Double value) {
            addCriterion("nt_co <>", value, "ntCo");
            return (Criteria) this;
        }

        public Criteria andNtCoGreaterThan(Double value) {
            addCriterion("nt_co >", value, "ntCo");
            return (Criteria) this;
        }

        public Criteria andNtCoGreaterThanOrEqualTo(Double value) {
            addCriterion("nt_co >=", value, "ntCo");
            return (Criteria) this;
        }

        public Criteria andNtCoLessThan(Double value) {
            addCriterion("nt_co <", value, "ntCo");
            return (Criteria) this;
        }

        public Criteria andNtCoLessThanOrEqualTo(Double value) {
            addCriterion("nt_co <=", value, "ntCo");
            return (Criteria) this;
        }

        public Criteria andNtCoIn(List<Double> values) {
            addCriterion("nt_co in", values, "ntCo");
            return (Criteria) this;
        }

        public Criteria andNtCoNotIn(List<Double> values) {
            addCriterion("nt_co not in", values, "ntCo");
            return (Criteria) this;
        }

        public Criteria andNtCoBetween(Double value1, Double value2) {
            addCriterion("nt_co between", value1, value2, "ntCo");
            return (Criteria) this;
        }

        public Criteria andNtCoNotBetween(Double value1, Double value2) {
            addCriterion("nt_co not between", value1, value2, "ntCo");
            return (Criteria) this;
        }

        public Criteria andNtIsopIsNull() {
            addCriterion("nt_isop is null");
            return (Criteria) this;
        }

        public Criteria andNtIsopIsNotNull() {
            addCriterion("nt_isop is not null");
            return (Criteria) this;
        }

        public Criteria andNtIsopEqualTo(Double value) {
            addCriterion("nt_isop =", value, "ntIsop");
            return (Criteria) this;
        }

        public Criteria andNtIsopNotEqualTo(Double value) {
            addCriterion("nt_isop <>", value, "ntIsop");
            return (Criteria) this;
        }

        public Criteria andNtIsopGreaterThan(Double value) {
            addCriterion("nt_isop >", value, "ntIsop");
            return (Criteria) this;
        }

        public Criteria andNtIsopGreaterThanOrEqualTo(Double value) {
            addCriterion("nt_isop >=", value, "ntIsop");
            return (Criteria) this;
        }

        public Criteria andNtIsopLessThan(Double value) {
            addCriterion("nt_isop <", value, "ntIsop");
            return (Criteria) this;
        }

        public Criteria andNtIsopLessThanOrEqualTo(Double value) {
            addCriterion("nt_isop <=", value, "ntIsop");
            return (Criteria) this;
        }

        public Criteria andNtIsopIn(List<Double> values) {
            addCriterion("nt_isop in", values, "ntIsop");
            return (Criteria) this;
        }

        public Criteria andNtIsopNotIn(List<Double> values) {
            addCriterion("nt_isop not in", values, "ntIsop");
            return (Criteria) this;
        }

        public Criteria andNtIsopBetween(Double value1, Double value2) {
            addCriterion("nt_isop between", value1, value2, "ntIsop");
            return (Criteria) this;
        }

        public Criteria andNtIsopNotBetween(Double value1, Double value2) {
            addCriterion("nt_isop not between", value1, value2, "ntIsop");
            return (Criteria) this;
        }

        public Criteria andNtOleIsNull() {
            addCriterion("nt_ole is null");
            return (Criteria) this;
        }

        public Criteria andNtOleIsNotNull() {
            addCriterion("nt_ole is not null");
            return (Criteria) this;
        }

        public Criteria andNtOleEqualTo(Double value) {
            addCriterion("nt_ole =", value, "ntOle");
            return (Criteria) this;
        }

        public Criteria andNtOleNotEqualTo(Double value) {
            addCriterion("nt_ole <>", value, "ntOle");
            return (Criteria) this;
        }

        public Criteria andNtOleGreaterThan(Double value) {
            addCriterion("nt_ole >", value, "ntOle");
            return (Criteria) this;
        }

        public Criteria andNtOleGreaterThanOrEqualTo(Double value) {
            addCriterion("nt_ole >=", value, "ntOle");
            return (Criteria) this;
        }

        public Criteria andNtOleLessThan(Double value) {
            addCriterion("nt_ole <", value, "ntOle");
            return (Criteria) this;
        }

        public Criteria andNtOleLessThanOrEqualTo(Double value) {
            addCriterion("nt_ole <=", value, "ntOle");
            return (Criteria) this;
        }

        public Criteria andNtOleIn(List<Double> values) {
            addCriterion("nt_ole in", values, "ntOle");
            return (Criteria) this;
        }

        public Criteria andNtOleNotIn(List<Double> values) {
            addCriterion("nt_ole not in", values, "ntOle");
            return (Criteria) this;
        }

        public Criteria andNtOleBetween(Double value1, Double value2) {
            addCriterion("nt_ole between", value1, value2, "ntOle");
            return (Criteria) this;
        }

        public Criteria andNtOleNotBetween(Double value1, Double value2) {
            addCriterion("nt_ole not between", value1, value2, "ntOle");
            return (Criteria) this;
        }

        public Criteria andNtParIsNull() {
            addCriterion("nt_par is null");
            return (Criteria) this;
        }

        public Criteria andNtParIsNotNull() {
            addCriterion("nt_par is not null");
            return (Criteria) this;
        }

        public Criteria andNtParEqualTo(Double value) {
            addCriterion("nt_par =", value, "ntPar");
            return (Criteria) this;
        }

        public Criteria andNtParNotEqualTo(Double value) {
            addCriterion("nt_par <>", value, "ntPar");
            return (Criteria) this;
        }

        public Criteria andNtParGreaterThan(Double value) {
            addCriterion("nt_par >", value, "ntPar");
            return (Criteria) this;
        }

        public Criteria andNtParGreaterThanOrEqualTo(Double value) {
            addCriterion("nt_par >=", value, "ntPar");
            return (Criteria) this;
        }

        public Criteria andNtParLessThan(Double value) {
            addCriterion("nt_par <", value, "ntPar");
            return (Criteria) this;
        }

        public Criteria andNtParLessThanOrEqualTo(Double value) {
            addCriterion("nt_par <=", value, "ntPar");
            return (Criteria) this;
        }

        public Criteria andNtParIn(List<Double> values) {
            addCriterion("nt_par in", values, "ntPar");
            return (Criteria) this;
        }

        public Criteria andNtParNotIn(List<Double> values) {
            addCriterion("nt_par not in", values, "ntPar");
            return (Criteria) this;
        }

        public Criteria andNtParBetween(Double value1, Double value2) {
            addCriterion("nt_par between", value1, value2, "ntPar");
            return (Criteria) this;
        }

        public Criteria andNtParNotBetween(Double value1, Double value2) {
            addCriterion("nt_par not between", value1, value2, "ntPar");
            return (Criteria) this;
        }

        public Criteria andNtXylIsNull() {
            addCriterion("nt_xyl is null");
            return (Criteria) this;
        }

        public Criteria andNtXylIsNotNull() {
            addCriterion("nt_xyl is not null");
            return (Criteria) this;
        }

        public Criteria andNtXylEqualTo(Double value) {
            addCriterion("nt_xyl =", value, "ntXyl");
            return (Criteria) this;
        }

        public Criteria andNtXylNotEqualTo(Double value) {
            addCriterion("nt_xyl <>", value, "ntXyl");
            return (Criteria) this;
        }

        public Criteria andNtXylGreaterThan(Double value) {
            addCriterion("nt_xyl >", value, "ntXyl");
            return (Criteria) this;
        }

        public Criteria andNtXylGreaterThanOrEqualTo(Double value) {
            addCriterion("nt_xyl >=", value, "ntXyl");
            return (Criteria) this;
        }

        public Criteria andNtXylLessThan(Double value) {
            addCriterion("nt_xyl <", value, "ntXyl");
            return (Criteria) this;
        }

        public Criteria andNtXylLessThanOrEqualTo(Double value) {
            addCriterion("nt_xyl <=", value, "ntXyl");
            return (Criteria) this;
        }

        public Criteria andNtXylIn(List<Double> values) {
            addCriterion("nt_xyl in", values, "ntXyl");
            return (Criteria) this;
        }

        public Criteria andNtXylNotIn(List<Double> values) {
            addCriterion("nt_xyl not in", values, "ntXyl");
            return (Criteria) this;
        }

        public Criteria andNtXylBetween(Double value1, Double value2) {
            addCriterion("nt_xyl between", value1, value2, "ntXyl");
            return (Criteria) this;
        }

        public Criteria andNtXylNotBetween(Double value1, Double value2) {
            addCriterion("nt_xyl not between", value1, value2, "ntXyl");
            return (Criteria) this;
        }

        public Criteria andNtFormIsNull() {
            addCriterion("nt_form is null");
            return (Criteria) this;
        }

        public Criteria andNtFormIsNotNull() {
            addCriterion("nt_form is not null");
            return (Criteria) this;
        }

        public Criteria andNtFormEqualTo(Double value) {
            addCriterion("nt_form =", value, "ntForm");
            return (Criteria) this;
        }

        public Criteria andNtFormNotEqualTo(Double value) {
            addCriterion("nt_form <>", value, "ntForm");
            return (Criteria) this;
        }

        public Criteria andNtFormGreaterThan(Double value) {
            addCriterion("nt_form >", value, "ntForm");
            return (Criteria) this;
        }

        public Criteria andNtFormGreaterThanOrEqualTo(Double value) {
            addCriterion("nt_form >=", value, "ntForm");
            return (Criteria) this;
        }

        public Criteria andNtFormLessThan(Double value) {
            addCriterion("nt_form <", value, "ntForm");
            return (Criteria) this;
        }

        public Criteria andNtFormLessThanOrEqualTo(Double value) {
            addCriterion("nt_form <=", value, "ntForm");
            return (Criteria) this;
        }

        public Criteria andNtFormIn(List<Double> values) {
            addCriterion("nt_form in", values, "ntForm");
            return (Criteria) this;
        }

        public Criteria andNtFormNotIn(List<Double> values) {
            addCriterion("nt_form not in", values, "ntForm");
            return (Criteria) this;
        }

        public Criteria andNtFormBetween(Double value1, Double value2) {
            addCriterion("nt_form between", value1, value2, "ntForm");
            return (Criteria) this;
        }

        public Criteria andNtFormNotBetween(Double value1, Double value2) {
            addCriterion("nt_form not between", value1, value2, "ntForm");
            return (Criteria) this;
        }

        public Criteria andNtAld2IsNull() {
            addCriterion("nt_ald2 is null");
            return (Criteria) this;
        }

        public Criteria andNtAld2IsNotNull() {
            addCriterion("nt_ald2 is not null");
            return (Criteria) this;
        }

        public Criteria andNtAld2EqualTo(Double value) {
            addCriterion("nt_ald2 =", value, "ntAld2");
            return (Criteria) this;
        }

        public Criteria andNtAld2NotEqualTo(Double value) {
            addCriterion("nt_ald2 <>", value, "ntAld2");
            return (Criteria) this;
        }

        public Criteria andNtAld2GreaterThan(Double value) {
            addCriterion("nt_ald2 >", value, "ntAld2");
            return (Criteria) this;
        }

        public Criteria andNtAld2GreaterThanOrEqualTo(Double value) {
            addCriterion("nt_ald2 >=", value, "ntAld2");
            return (Criteria) this;
        }

        public Criteria andNtAld2LessThan(Double value) {
            addCriterion("nt_ald2 <", value, "ntAld2");
            return (Criteria) this;
        }

        public Criteria andNtAld2LessThanOrEqualTo(Double value) {
            addCriterion("nt_ald2 <=", value, "ntAld2");
            return (Criteria) this;
        }

        public Criteria andNtAld2In(List<Double> values) {
            addCriterion("nt_ald2 in", values, "ntAld2");
            return (Criteria) this;
        }

        public Criteria andNtAld2NotIn(List<Double> values) {
            addCriterion("nt_ald2 not in", values, "ntAld2");
            return (Criteria) this;
        }

        public Criteria andNtAld2Between(Double value1, Double value2) {
            addCriterion("nt_ald2 between", value1, value2, "ntAld2");
            return (Criteria) this;
        }

        public Criteria andNtAld2NotBetween(Double value1, Double value2) {
            addCriterion("nt_ald2 not between", value1, value2, "ntAld2");
            return (Criteria) this;
        }

        public Criteria andNtEthIsNull() {
            addCriterion("nt_eth is null");
            return (Criteria) this;
        }

        public Criteria andNtEthIsNotNull() {
            addCriterion("nt_eth is not null");
            return (Criteria) this;
        }

        public Criteria andNtEthEqualTo(Double value) {
            addCriterion("nt_eth =", value, "ntEth");
            return (Criteria) this;
        }

        public Criteria andNtEthNotEqualTo(Double value) {
            addCriterion("nt_eth <>", value, "ntEth");
            return (Criteria) this;
        }

        public Criteria andNtEthGreaterThan(Double value) {
            addCriterion("nt_eth >", value, "ntEth");
            return (Criteria) this;
        }

        public Criteria andNtEthGreaterThanOrEqualTo(Double value) {
            addCriterion("nt_eth >=", value, "ntEth");
            return (Criteria) this;
        }

        public Criteria andNtEthLessThan(Double value) {
            addCriterion("nt_eth <", value, "ntEth");
            return (Criteria) this;
        }

        public Criteria andNtEthLessThanOrEqualTo(Double value) {
            addCriterion("nt_eth <=", value, "ntEth");
            return (Criteria) this;
        }

        public Criteria andNtEthIn(List<Double> values) {
            addCriterion("nt_eth in", values, "ntEth");
            return (Criteria) this;
        }

        public Criteria andNtEthNotIn(List<Double> values) {
            addCriterion("nt_eth not in", values, "ntEth");
            return (Criteria) this;
        }

        public Criteria andNtEthBetween(Double value1, Double value2) {
            addCriterion("nt_eth between", value1, value2, "ntEth");
            return (Criteria) this;
        }

        public Criteria andNtEthNotBetween(Double value1, Double value2) {
            addCriterion("nt_eth not between", value1, value2, "ntEth");
            return (Criteria) this;
        }

        public Criteria andNtMeohIsNull() {
            addCriterion("nt_meoh is null");
            return (Criteria) this;
        }

        public Criteria andNtMeohIsNotNull() {
            addCriterion("nt_meoh is not null");
            return (Criteria) this;
        }

        public Criteria andNtMeohEqualTo(Double value) {
            addCriterion("nt_meoh =", value, "ntMeoh");
            return (Criteria) this;
        }

        public Criteria andNtMeohNotEqualTo(Double value) {
            addCriterion("nt_meoh <>", value, "ntMeoh");
            return (Criteria) this;
        }

        public Criteria andNtMeohGreaterThan(Double value) {
            addCriterion("nt_meoh >", value, "ntMeoh");
            return (Criteria) this;
        }

        public Criteria andNtMeohGreaterThanOrEqualTo(Double value) {
            addCriterion("nt_meoh >=", value, "ntMeoh");
            return (Criteria) this;
        }

        public Criteria andNtMeohLessThan(Double value) {
            addCriterion("nt_meoh <", value, "ntMeoh");
            return (Criteria) this;
        }

        public Criteria andNtMeohLessThanOrEqualTo(Double value) {
            addCriterion("nt_meoh <=", value, "ntMeoh");
            return (Criteria) this;
        }

        public Criteria andNtMeohIn(List<Double> values) {
            addCriterion("nt_meoh in", values, "ntMeoh");
            return (Criteria) this;
        }

        public Criteria andNtMeohNotIn(List<Double> values) {
            addCriterion("nt_meoh not in", values, "ntMeoh");
            return (Criteria) this;
        }

        public Criteria andNtMeohBetween(Double value1, Double value2) {
            addCriterion("nt_meoh between", value1, value2, "ntMeoh");
            return (Criteria) this;
        }

        public Criteria andNtMeohNotBetween(Double value1, Double value2) {
            addCriterion("nt_meoh not between", value1, value2, "ntMeoh");
            return (Criteria) this;
        }

        public Criteria andNtEtohIsNull() {
            addCriterion("nt_etoh is null");
            return (Criteria) this;
        }

        public Criteria andNtEtohIsNotNull() {
            addCriterion("nt_etoh is not null");
            return (Criteria) this;
        }

        public Criteria andNtEtohEqualTo(Double value) {
            addCriterion("nt_etoh =", value, "ntEtoh");
            return (Criteria) this;
        }

        public Criteria andNtEtohNotEqualTo(Double value) {
            addCriterion("nt_etoh <>", value, "ntEtoh");
            return (Criteria) this;
        }

        public Criteria andNtEtohGreaterThan(Double value) {
            addCriterion("nt_etoh >", value, "ntEtoh");
            return (Criteria) this;
        }

        public Criteria andNtEtohGreaterThanOrEqualTo(Double value) {
            addCriterion("nt_etoh >=", value, "ntEtoh");
            return (Criteria) this;
        }

        public Criteria andNtEtohLessThan(Double value) {
            addCriterion("nt_etoh <", value, "ntEtoh");
            return (Criteria) this;
        }

        public Criteria andNtEtohLessThanOrEqualTo(Double value) {
            addCriterion("nt_etoh <=", value, "ntEtoh");
            return (Criteria) this;
        }

        public Criteria andNtEtohIn(List<Double> values) {
            addCriterion("nt_etoh in", values, "ntEtoh");
            return (Criteria) this;
        }

        public Criteria andNtEtohNotIn(List<Double> values) {
            addCriterion("nt_etoh not in", values, "ntEtoh");
            return (Criteria) this;
        }

        public Criteria andNtEtohBetween(Double value1, Double value2) {
            addCriterion("nt_etoh between", value1, value2, "ntEtoh");
            return (Criteria) this;
        }

        public Criteria andNtEtohNotBetween(Double value1, Double value2) {
            addCriterion("nt_etoh not between", value1, value2, "ntEtoh");
            return (Criteria) this;
        }

        public Criteria andNtNrIsNull() {
            addCriterion("nt_nr is null");
            return (Criteria) this;
        }

        public Criteria andNtNrIsNotNull() {
            addCriterion("nt_nr is not null");
            return (Criteria) this;
        }

        public Criteria andNtNrEqualTo(Double value) {
            addCriterion("nt_nr =", value, "ntNr");
            return (Criteria) this;
        }

        public Criteria andNtNrNotEqualTo(Double value) {
            addCriterion("nt_nr <>", value, "ntNr");
            return (Criteria) this;
        }

        public Criteria andNtNrGreaterThan(Double value) {
            addCriterion("nt_nr >", value, "ntNr");
            return (Criteria) this;
        }

        public Criteria andNtNrGreaterThanOrEqualTo(Double value) {
            addCriterion("nt_nr >=", value, "ntNr");
            return (Criteria) this;
        }

        public Criteria andNtNrLessThan(Double value) {
            addCriterion("nt_nr <", value, "ntNr");
            return (Criteria) this;
        }

        public Criteria andNtNrLessThanOrEqualTo(Double value) {
            addCriterion("nt_nr <=", value, "ntNr");
            return (Criteria) this;
        }

        public Criteria andNtNrIn(List<Double> values) {
            addCriterion("nt_nr in", values, "ntNr");
            return (Criteria) this;
        }

        public Criteria andNtNrNotIn(List<Double> values) {
            addCriterion("nt_nr not in", values, "ntNr");
            return (Criteria) this;
        }

        public Criteria andNtNrBetween(Double value1, Double value2) {
            addCriterion("nt_nr between", value1, value2, "ntNr");
            return (Criteria) this;
        }

        public Criteria andNtNrNotBetween(Double value1, Double value2) {
            addCriterion("nt_nr not between", value1, value2, "ntNr");
            return (Criteria) this;
        }

        public Criteria andNtTerpIsNull() {
            addCriterion("nt_terp is null");
            return (Criteria) this;
        }

        public Criteria andNtTerpIsNotNull() {
            addCriterion("nt_terp is not null");
            return (Criteria) this;
        }

        public Criteria andNtTerpEqualTo(Double value) {
            addCriterion("nt_terp =", value, "ntTerp");
            return (Criteria) this;
        }

        public Criteria andNtTerpNotEqualTo(Double value) {
            addCriterion("nt_terp <>", value, "ntTerp");
            return (Criteria) this;
        }

        public Criteria andNtTerpGreaterThan(Double value) {
            addCriterion("nt_terp >", value, "ntTerp");
            return (Criteria) this;
        }

        public Criteria andNtTerpGreaterThanOrEqualTo(Double value) {
            addCriterion("nt_terp >=", value, "ntTerp");
            return (Criteria) this;
        }

        public Criteria andNtTerpLessThan(Double value) {
            addCriterion("nt_terp <", value, "ntTerp");
            return (Criteria) this;
        }

        public Criteria andNtTerpLessThanOrEqualTo(Double value) {
            addCriterion("nt_terp <=", value, "ntTerp");
            return (Criteria) this;
        }

        public Criteria andNtTerpIn(List<Double> values) {
            addCriterion("nt_terp in", values, "ntTerp");
            return (Criteria) this;
        }

        public Criteria andNtTerpNotIn(List<Double> values) {
            addCriterion("nt_terp not in", values, "ntTerp");
            return (Criteria) this;
        }

        public Criteria andNtTerpBetween(Double value1, Double value2) {
            addCriterion("nt_terp between", value1, value2, "ntTerp");
            return (Criteria) this;
        }

        public Criteria andNtTerpNotBetween(Double value1, Double value2) {
            addCriterion("nt_terp not between", value1, value2, "ntTerp");
            return (Criteria) this;
        }

        public Criteria andNtAldxIsNull() {
            addCriterion("nt_aldx is null");
            return (Criteria) this;
        }

        public Criteria andNtAldxIsNotNull() {
            addCriterion("nt_aldx is not null");
            return (Criteria) this;
        }

        public Criteria andNtAldxEqualTo(Double value) {
            addCriterion("nt_aldx =", value, "ntAldx");
            return (Criteria) this;
        }

        public Criteria andNtAldxNotEqualTo(Double value) {
            addCriterion("nt_aldx <>", value, "ntAldx");
            return (Criteria) this;
        }

        public Criteria andNtAldxGreaterThan(Double value) {
            addCriterion("nt_aldx >", value, "ntAldx");
            return (Criteria) this;
        }

        public Criteria andNtAldxGreaterThanOrEqualTo(Double value) {
            addCriterion("nt_aldx >=", value, "ntAldx");
            return (Criteria) this;
        }

        public Criteria andNtAldxLessThan(Double value) {
            addCriterion("nt_aldx <", value, "ntAldx");
            return (Criteria) this;
        }

        public Criteria andNtAldxLessThanOrEqualTo(Double value) {
            addCriterion("nt_aldx <=", value, "ntAldx");
            return (Criteria) this;
        }

        public Criteria andNtAldxIn(List<Double> values) {
            addCriterion("nt_aldx in", values, "ntAldx");
            return (Criteria) this;
        }

        public Criteria andNtAldxNotIn(List<Double> values) {
            addCriterion("nt_aldx not in", values, "ntAldx");
            return (Criteria) this;
        }

        public Criteria andNtAldxBetween(Double value1, Double value2) {
            addCriterion("nt_aldx between", value1, value2, "ntAldx");
            return (Criteria) this;
        }

        public Criteria andNtAldxNotBetween(Double value1, Double value2) {
            addCriterion("nt_aldx not between", value1, value2, "ntAldx");
            return (Criteria) this;
        }

        public Criteria andNtEthaIsNull() {
            addCriterion("nt_etha is null");
            return (Criteria) this;
        }

        public Criteria andNtEthaIsNotNull() {
            addCriterion("nt_etha is not null");
            return (Criteria) this;
        }

        public Criteria andNtEthaEqualTo(Double value) {
            addCriterion("nt_etha =", value, "ntEtha");
            return (Criteria) this;
        }

        public Criteria andNtEthaNotEqualTo(Double value) {
            addCriterion("nt_etha <>", value, "ntEtha");
            return (Criteria) this;
        }

        public Criteria andNtEthaGreaterThan(Double value) {
            addCriterion("nt_etha >", value, "ntEtha");
            return (Criteria) this;
        }

        public Criteria andNtEthaGreaterThanOrEqualTo(Double value) {
            addCriterion("nt_etha >=", value, "ntEtha");
            return (Criteria) this;
        }

        public Criteria andNtEthaLessThan(Double value) {
            addCriterion("nt_etha <", value, "ntEtha");
            return (Criteria) this;
        }

        public Criteria andNtEthaLessThanOrEqualTo(Double value) {
            addCriterion("nt_etha <=", value, "ntEtha");
            return (Criteria) this;
        }

        public Criteria andNtEthaIn(List<Double> values) {
            addCriterion("nt_etha in", values, "ntEtha");
            return (Criteria) this;
        }

        public Criteria andNtEthaNotIn(List<Double> values) {
            addCriterion("nt_etha not in", values, "ntEtha");
            return (Criteria) this;
        }

        public Criteria andNtEthaBetween(Double value1, Double value2) {
            addCriterion("nt_etha between", value1, value2, "ntEtha");
            return (Criteria) this;
        }

        public Criteria andNtEthaNotBetween(Double value1, Double value2) {
            addCriterion("nt_etha not between", value1, value2, "ntEtha");
            return (Criteria) this;
        }

        public Criteria andNtIoleIsNull() {
            addCriterion("nt_iole is null");
            return (Criteria) this;
        }

        public Criteria andNtIoleIsNotNull() {
            addCriterion("nt_iole is not null");
            return (Criteria) this;
        }

        public Criteria andNtIoleEqualTo(Double value) {
            addCriterion("nt_iole =", value, "ntIole");
            return (Criteria) this;
        }

        public Criteria andNtIoleNotEqualTo(Double value) {
            addCriterion("nt_iole <>", value, "ntIole");
            return (Criteria) this;
        }

        public Criteria andNtIoleGreaterThan(Double value) {
            addCriterion("nt_iole >", value, "ntIole");
            return (Criteria) this;
        }

        public Criteria andNtIoleGreaterThanOrEqualTo(Double value) {
            addCriterion("nt_iole >=", value, "ntIole");
            return (Criteria) this;
        }

        public Criteria andNtIoleLessThan(Double value) {
            addCriterion("nt_iole <", value, "ntIole");
            return (Criteria) this;
        }

        public Criteria andNtIoleLessThanOrEqualTo(Double value) {
            addCriterion("nt_iole <=", value, "ntIole");
            return (Criteria) this;
        }

        public Criteria andNtIoleIn(List<Double> values) {
            addCriterion("nt_iole in", values, "ntIole");
            return (Criteria) this;
        }

        public Criteria andNtIoleNotIn(List<Double> values) {
            addCriterion("nt_iole not in", values, "ntIole");
            return (Criteria) this;
        }

        public Criteria andNtIoleBetween(Double value1, Double value2) {
            addCriterion("nt_iole between", value1, value2, "ntIole");
            return (Criteria) this;
        }

        public Criteria andNtIoleNotBetween(Double value1, Double value2) {
            addCriterion("nt_iole not between", value1, value2, "ntIole");
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