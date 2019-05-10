package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class NonroadMachineryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NonroadMachineryExample() {
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

        public Criteria andCountyIdIsNull() {
            addCriterion("county_id is null");
            return (Criteria) this;
        }

        public Criteria andCountyIdIsNotNull() {
            addCriterion("county_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountyIdEqualTo(String value) {
            addCriterion("county_id =", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotEqualTo(String value) {
            addCriterion("county_id <>", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdGreaterThan(String value) {
            addCriterion("county_id >", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdGreaterThanOrEqualTo(String value) {
            addCriterion("county_id >=", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLessThan(String value) {
            addCriterion("county_id <", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLessThanOrEqualTo(String value) {
            addCriterion("county_id <=", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLike(String value) {
            addCriterion("county_id like", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotLike(String value) {
            addCriterion("county_id not like", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdIn(List<String> values) {
            addCriterion("county_id in", values, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotIn(List<String> values) {
            addCriterion("county_id not in", values, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdBetween(String value1, String value2) {
            addCriterion("county_id between", value1, value2, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotBetween(String value1, String value2) {
            addCriterion("county_id not between", value1, value2, "countyId");
            return (Criteria) this;
        }

        public Criteria andSccCodeIsNull() {
            addCriterion("scc_code is null");
            return (Criteria) this;
        }

        public Criteria andSccCodeIsNotNull() {
            addCriterion("scc_code is not null");
            return (Criteria) this;
        }

        public Criteria andSccCodeEqualTo(String value) {
            addCriterion("scc_code =", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeNotEqualTo(String value) {
            addCriterion("scc_code <>", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeGreaterThan(String value) {
            addCriterion("scc_code >", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeGreaterThanOrEqualTo(String value) {
            addCriterion("scc_code >=", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeLessThan(String value) {
            addCriterion("scc_code <", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeLessThanOrEqualTo(String value) {
            addCriterion("scc_code <=", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeLike(String value) {
            addCriterion("scc_code like", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeNotLike(String value) {
            addCriterion("scc_code not like", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeIn(List<String> values) {
            addCriterion("scc_code in", values, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeNotIn(List<String> values) {
            addCriterion("scc_code not in", values, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeBetween(String value1, String value2) {
            addCriterion("scc_code between", value1, value2, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeNotBetween(String value1, String value2) {
            addCriterion("scc_code not between", value1, value2, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSourceDescripIsNull() {
            addCriterion("source_descrip is null");
            return (Criteria) this;
        }

        public Criteria andSourceDescripIsNotNull() {
            addCriterion("source_descrip is not null");
            return (Criteria) this;
        }

        public Criteria andSourceDescripEqualTo(String value) {
            addCriterion("source_descrip =", value, "sourceDescrip");
            return (Criteria) this;
        }

        public Criteria andSourceDescripNotEqualTo(String value) {
            addCriterion("source_descrip <>", value, "sourceDescrip");
            return (Criteria) this;
        }

        public Criteria andSourceDescripGreaterThan(String value) {
            addCriterion("source_descrip >", value, "sourceDescrip");
            return (Criteria) this;
        }

        public Criteria andSourceDescripGreaterThanOrEqualTo(String value) {
            addCriterion("source_descrip >=", value, "sourceDescrip");
            return (Criteria) this;
        }

        public Criteria andSourceDescripLessThan(String value) {
            addCriterion("source_descrip <", value, "sourceDescrip");
            return (Criteria) this;
        }

        public Criteria andSourceDescripLessThanOrEqualTo(String value) {
            addCriterion("source_descrip <=", value, "sourceDescrip");
            return (Criteria) this;
        }

        public Criteria andSourceDescripLike(String value) {
            addCriterion("source_descrip like", value, "sourceDescrip");
            return (Criteria) this;
        }

        public Criteria andSourceDescripNotLike(String value) {
            addCriterion("source_descrip not like", value, "sourceDescrip");
            return (Criteria) this;
        }

        public Criteria andSourceDescripIn(List<String> values) {
            addCriterion("source_descrip in", values, "sourceDescrip");
            return (Criteria) this;
        }

        public Criteria andSourceDescripNotIn(List<String> values) {
            addCriterion("source_descrip not in", values, "sourceDescrip");
            return (Criteria) this;
        }

        public Criteria andSourceDescripBetween(String value1, String value2) {
            addCriterion("source_descrip between", value1, value2, "sourceDescrip");
            return (Criteria) this;
        }

        public Criteria andSourceDescripNotBetween(String value1, String value2) {
            addCriterion("source_descrip not between", value1, value2, "sourceDescrip");
            return (Criteria) this;
        }

        public Criteria andNonroadTypeIsNull() {
            addCriterion("nonroad_type is null");
            return (Criteria) this;
        }

        public Criteria andNonroadTypeIsNotNull() {
            addCriterion("nonroad_type is not null");
            return (Criteria) this;
        }

        public Criteria andNonroadTypeEqualTo(String value) {
            addCriterion("nonroad_type =", value, "nonroadType");
            return (Criteria) this;
        }

        public Criteria andNonroadTypeNotEqualTo(String value) {
            addCriterion("nonroad_type <>", value, "nonroadType");
            return (Criteria) this;
        }

        public Criteria andNonroadTypeGreaterThan(String value) {
            addCriterion("nonroad_type >", value, "nonroadType");
            return (Criteria) this;
        }

        public Criteria andNonroadTypeGreaterThanOrEqualTo(String value) {
            addCriterion("nonroad_type >=", value, "nonroadType");
            return (Criteria) this;
        }

        public Criteria andNonroadTypeLessThan(String value) {
            addCriterion("nonroad_type <", value, "nonroadType");
            return (Criteria) this;
        }

        public Criteria andNonroadTypeLessThanOrEqualTo(String value) {
            addCriterion("nonroad_type <=", value, "nonroadType");
            return (Criteria) this;
        }

        public Criteria andNonroadTypeLike(String value) {
            addCriterion("nonroad_type like", value, "nonroadType");
            return (Criteria) this;
        }

        public Criteria andNonroadTypeNotLike(String value) {
            addCriterion("nonroad_type not like", value, "nonroadType");
            return (Criteria) this;
        }

        public Criteria andNonroadTypeIn(List<String> values) {
            addCriterion("nonroad_type in", values, "nonroadType");
            return (Criteria) this;
        }

        public Criteria andNonroadTypeNotIn(List<String> values) {
            addCriterion("nonroad_type not in", values, "nonroadType");
            return (Criteria) this;
        }

        public Criteria andNonroadTypeBetween(String value1, String value2) {
            addCriterion("nonroad_type between", value1, value2, "nonroadType");
            return (Criteria) this;
        }

        public Criteria andNonroadTypeNotBetween(String value1, String value2) {
            addCriterion("nonroad_type not between", value1, value2, "nonroadType");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIsNull() {
            addCriterion("fuel_type is null");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIsNotNull() {
            addCriterion("fuel_type is not null");
            return (Criteria) this;
        }

        public Criteria andFuelTypeEqualTo(String value) {
            addCriterion("fuel_type =", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotEqualTo(String value) {
            addCriterion("fuel_type <>", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeGreaterThan(String value) {
            addCriterion("fuel_type >", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("fuel_type >=", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeLessThan(String value) {
            addCriterion("fuel_type <", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeLessThanOrEqualTo(String value) {
            addCriterion("fuel_type <=", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeLike(String value) {
            addCriterion("fuel_type like", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotLike(String value) {
            addCriterion("fuel_type not like", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIn(List<String> values) {
            addCriterion("fuel_type in", values, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotIn(List<String> values) {
            addCriterion("fuel_type not in", values, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeBetween(String value1, String value2) {
            addCriterion("fuel_type between", value1, value2, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotBetween(String value1, String value2) {
            addCriterion("fuel_type not between", value1, value2, "fuelType");
            return (Criteria) this;
        }

        public Criteria andHoldingsIsNull() {
            addCriterion("holdings is null");
            return (Criteria) this;
        }

        public Criteria andHoldingsIsNotNull() {
            addCriterion("holdings is not null");
            return (Criteria) this;
        }

        public Criteria andHoldingsEqualTo(Integer value) {
            addCriterion("holdings =", value, "holdings");
            return (Criteria) this;
        }

        public Criteria andHoldingsNotEqualTo(Integer value) {
            addCriterion("holdings <>", value, "holdings");
            return (Criteria) this;
        }

        public Criteria andHoldingsGreaterThan(Integer value) {
            addCriterion("holdings >", value, "holdings");
            return (Criteria) this;
        }

        public Criteria andHoldingsGreaterThanOrEqualTo(Integer value) {
            addCriterion("holdings >=", value, "holdings");
            return (Criteria) this;
        }

        public Criteria andHoldingsLessThan(Integer value) {
            addCriterion("holdings <", value, "holdings");
            return (Criteria) this;
        }

        public Criteria andHoldingsLessThanOrEqualTo(Integer value) {
            addCriterion("holdings <=", value, "holdings");
            return (Criteria) this;
        }

        public Criteria andHoldingsIn(List<Integer> values) {
            addCriterion("holdings in", values, "holdings");
            return (Criteria) this;
        }

        public Criteria andHoldingsNotIn(List<Integer> values) {
            addCriterion("holdings not in", values, "holdings");
            return (Criteria) this;
        }

        public Criteria andHoldingsBetween(Integer value1, Integer value2) {
            addCriterion("holdings between", value1, value2, "holdings");
            return (Criteria) this;
        }

        public Criteria andHoldingsNotBetween(Integer value1, Integer value2) {
            addCriterion("holdings not between", value1, value2, "holdings");
            return (Criteria) this;
        }

        public Criteria andUseHoursIsNull() {
            addCriterion("use_hours is null");
            return (Criteria) this;
        }

        public Criteria andUseHoursIsNotNull() {
            addCriterion("use_hours is not null");
            return (Criteria) this;
        }

        public Criteria andUseHoursEqualTo(Double value) {
            addCriterion("use_hours =", value, "useHours");
            return (Criteria) this;
        }

        public Criteria andUseHoursNotEqualTo(Double value) {
            addCriterion("use_hours <>", value, "useHours");
            return (Criteria) this;
        }

        public Criteria andUseHoursGreaterThan(Double value) {
            addCriterion("use_hours >", value, "useHours");
            return (Criteria) this;
        }

        public Criteria andUseHoursGreaterThanOrEqualTo(Double value) {
            addCriterion("use_hours >=", value, "useHours");
            return (Criteria) this;
        }

        public Criteria andUseHoursLessThan(Double value) {
            addCriterion("use_hours <", value, "useHours");
            return (Criteria) this;
        }

        public Criteria andUseHoursLessThanOrEqualTo(Double value) {
            addCriterion("use_hours <=", value, "useHours");
            return (Criteria) this;
        }

        public Criteria andUseHoursIn(List<Double> values) {
            addCriterion("use_hours in", values, "useHours");
            return (Criteria) this;
        }

        public Criteria andUseHoursNotIn(List<Double> values) {
            addCriterion("use_hours not in", values, "useHours");
            return (Criteria) this;
        }

        public Criteria andUseHoursBetween(Double value1, Double value2) {
            addCriterion("use_hours between", value1, value2, "useHours");
            return (Criteria) this;
        }

        public Criteria andUseHoursNotBetween(Double value1, Double value2) {
            addCriterion("use_hours not between", value1, value2, "useHours");
            return (Criteria) this;
        }

        public Criteria andFuelAnnualUsageIsNull() {
            addCriterion("fuel_annual_usage is null");
            return (Criteria) this;
        }

        public Criteria andFuelAnnualUsageIsNotNull() {
            addCriterion("fuel_annual_usage is not null");
            return (Criteria) this;
        }

        public Criteria andFuelAnnualUsageEqualTo(Double value) {
            addCriterion("fuel_annual_usage =", value, "fuelAnnualUsage");
            return (Criteria) this;
        }

        public Criteria andFuelAnnualUsageNotEqualTo(Double value) {
            addCriterion("fuel_annual_usage <>", value, "fuelAnnualUsage");
            return (Criteria) this;
        }

        public Criteria andFuelAnnualUsageGreaterThan(Double value) {
            addCriterion("fuel_annual_usage >", value, "fuelAnnualUsage");
            return (Criteria) this;
        }

        public Criteria andFuelAnnualUsageGreaterThanOrEqualTo(Double value) {
            addCriterion("fuel_annual_usage >=", value, "fuelAnnualUsage");
            return (Criteria) this;
        }

        public Criteria andFuelAnnualUsageLessThan(Double value) {
            addCriterion("fuel_annual_usage <", value, "fuelAnnualUsage");
            return (Criteria) this;
        }

        public Criteria andFuelAnnualUsageLessThanOrEqualTo(Double value) {
            addCriterion("fuel_annual_usage <=", value, "fuelAnnualUsage");
            return (Criteria) this;
        }

        public Criteria andFuelAnnualUsageIn(List<Double> values) {
            addCriterion("fuel_annual_usage in", values, "fuelAnnualUsage");
            return (Criteria) this;
        }

        public Criteria andFuelAnnualUsageNotIn(List<Double> values) {
            addCriterion("fuel_annual_usage not in", values, "fuelAnnualUsage");
            return (Criteria) this;
        }

        public Criteria andFuelAnnualUsageBetween(Double value1, Double value2) {
            addCriterion("fuel_annual_usage between", value1, value2, "fuelAnnualUsage");
            return (Criteria) this;
        }

        public Criteria andFuelAnnualUsageNotBetween(Double value1, Double value2) {
            addCriterion("fuel_annual_usage not between", value1, value2, "fuelAnnualUsage");
            return (Criteria) this;
        }

        public Criteria andFuelSulfurContentIsNull() {
            addCriterion("fuel_sulfur_content is null");
            return (Criteria) this;
        }

        public Criteria andFuelSulfurContentIsNotNull() {
            addCriterion("fuel_sulfur_content is not null");
            return (Criteria) this;
        }

        public Criteria andFuelSulfurContentEqualTo(Double value) {
            addCriterion("fuel_sulfur_content =", value, "fuelSulfurContent");
            return (Criteria) this;
        }

        public Criteria andFuelSulfurContentNotEqualTo(Double value) {
            addCriterion("fuel_sulfur_content <>", value, "fuelSulfurContent");
            return (Criteria) this;
        }

        public Criteria andFuelSulfurContentGreaterThan(Double value) {
            addCriterion("fuel_sulfur_content >", value, "fuelSulfurContent");
            return (Criteria) this;
        }

        public Criteria andFuelSulfurContentGreaterThanOrEqualTo(Double value) {
            addCriterion("fuel_sulfur_content >=", value, "fuelSulfurContent");
            return (Criteria) this;
        }

        public Criteria andFuelSulfurContentLessThan(Double value) {
            addCriterion("fuel_sulfur_content <", value, "fuelSulfurContent");
            return (Criteria) this;
        }

        public Criteria andFuelSulfurContentLessThanOrEqualTo(Double value) {
            addCriterion("fuel_sulfur_content <=", value, "fuelSulfurContent");
            return (Criteria) this;
        }

        public Criteria andFuelSulfurContentIn(List<Double> values) {
            addCriterion("fuel_sulfur_content in", values, "fuelSulfurContent");
            return (Criteria) this;
        }

        public Criteria andFuelSulfurContentNotIn(List<Double> values) {
            addCriterion("fuel_sulfur_content not in", values, "fuelSulfurContent");
            return (Criteria) this;
        }

        public Criteria andFuelSulfurContentBetween(Double value1, Double value2) {
            addCriterion("fuel_sulfur_content between", value1, value2, "fuelSulfurContent");
            return (Criteria) this;
        }

        public Criteria andFuelSulfurContentNotBetween(Double value1, Double value2) {
            addCriterion("fuel_sulfur_content not between", value1, value2, "fuelSulfurContent");
            return (Criteria) this;
        }

        public Criteria andAnnalAverageMileageIsNull() {
            addCriterion("annal_average_mileage is null");
            return (Criteria) this;
        }

        public Criteria andAnnalAverageMileageIsNotNull() {
            addCriterion("annal_average_mileage is not null");
            return (Criteria) this;
        }

        public Criteria andAnnalAverageMileageEqualTo(Double value) {
            addCriterion("annal_average_mileage =", value, "annalAverageMileage");
            return (Criteria) this;
        }

        public Criteria andAnnalAverageMileageNotEqualTo(Double value) {
            addCriterion("annal_average_mileage <>", value, "annalAverageMileage");
            return (Criteria) this;
        }

        public Criteria andAnnalAverageMileageGreaterThan(Double value) {
            addCriterion("annal_average_mileage >", value, "annalAverageMileage");
            return (Criteria) this;
        }

        public Criteria andAnnalAverageMileageGreaterThanOrEqualTo(Double value) {
            addCriterion("annal_average_mileage >=", value, "annalAverageMileage");
            return (Criteria) this;
        }

        public Criteria andAnnalAverageMileageLessThan(Double value) {
            addCriterion("annal_average_mileage <", value, "annalAverageMileage");
            return (Criteria) this;
        }

        public Criteria andAnnalAverageMileageLessThanOrEqualTo(Double value) {
            addCriterion("annal_average_mileage <=", value, "annalAverageMileage");
            return (Criteria) this;
        }

        public Criteria andAnnalAverageMileageIn(List<Double> values) {
            addCriterion("annal_average_mileage in", values, "annalAverageMileage");
            return (Criteria) this;
        }

        public Criteria andAnnalAverageMileageNotIn(List<Double> values) {
            addCriterion("annal_average_mileage not in", values, "annalAverageMileage");
            return (Criteria) this;
        }

        public Criteria andAnnalAverageMileageBetween(Double value1, Double value2) {
            addCriterion("annal_average_mileage between", value1, value2, "annalAverageMileage");
            return (Criteria) this;
        }

        public Criteria andAnnalAverageMileageNotBetween(Double value1, Double value2) {
            addCriterion("annal_average_mileage not between", value1, value2, "annalAverageMileage");
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

        public Criteria andVocsEmissionIsNull() {
            addCriterion("vocs_emission is null");
            return (Criteria) this;
        }

        public Criteria andVocsEmissionIsNotNull() {
            addCriterion("vocs_emission is not null");
            return (Criteria) this;
        }

        public Criteria andVocsEmissionEqualTo(Double value) {
            addCriterion("vocs_emission =", value, "vocsEmission");
            return (Criteria) this;
        }

        public Criteria andVocsEmissionNotEqualTo(Double value) {
            addCriterion("vocs_emission <>", value, "vocsEmission");
            return (Criteria) this;
        }

        public Criteria andVocsEmissionGreaterThan(Double value) {
            addCriterion("vocs_emission >", value, "vocsEmission");
            return (Criteria) this;
        }

        public Criteria andVocsEmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("vocs_emission >=", value, "vocsEmission");
            return (Criteria) this;
        }

        public Criteria andVocsEmissionLessThan(Double value) {
            addCriterion("vocs_emission <", value, "vocsEmission");
            return (Criteria) this;
        }

        public Criteria andVocsEmissionLessThanOrEqualTo(Double value) {
            addCriterion("vocs_emission <=", value, "vocsEmission");
            return (Criteria) this;
        }

        public Criteria andVocsEmissionIn(List<Double> values) {
            addCriterion("vocs_emission in", values, "vocsEmission");
            return (Criteria) this;
        }

        public Criteria andVocsEmissionNotIn(List<Double> values) {
            addCriterion("vocs_emission not in", values, "vocsEmission");
            return (Criteria) this;
        }

        public Criteria andVocsEmissionBetween(Double value1, Double value2) {
            addCriterion("vocs_emission between", value1, value2, "vocsEmission");
            return (Criteria) this;
        }

        public Criteria andVocsEmissionNotBetween(Double value1, Double value2) {
            addCriterion("vocs_emission not between", value1, value2, "vocsEmission");
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