package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class RoadMoveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoadMoveExample() {
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

        public Criteria andCountyCityIsNull() {
            addCriterion("county_city is null");
            return (Criteria) this;
        }

        public Criteria andCountyCityIsNotNull() {
            addCriterion("county_city is not null");
            return (Criteria) this;
        }

        public Criteria andCountyCityEqualTo(String value) {
            addCriterion("county_city =", value, "countyCity");
            return (Criteria) this;
        }

        public Criteria andCountyCityNotEqualTo(String value) {
            addCriterion("county_city <>", value, "countyCity");
            return (Criteria) this;
        }

        public Criteria andCountyCityGreaterThan(String value) {
            addCriterion("county_city >", value, "countyCity");
            return (Criteria) this;
        }

        public Criteria andCountyCityGreaterThanOrEqualTo(String value) {
            addCriterion("county_city >=", value, "countyCity");
            return (Criteria) this;
        }

        public Criteria andCountyCityLessThan(String value) {
            addCriterion("county_city <", value, "countyCity");
            return (Criteria) this;
        }

        public Criteria andCountyCityLessThanOrEqualTo(String value) {
            addCriterion("county_city <=", value, "countyCity");
            return (Criteria) this;
        }

        public Criteria andCountyCityLike(String value) {
            addCriterion("county_city like", value, "countyCity");
            return (Criteria) this;
        }

        public Criteria andCountyCityNotLike(String value) {
            addCriterion("county_city not like", value, "countyCity");
            return (Criteria) this;
        }

        public Criteria andCountyCityIn(List<String> values) {
            addCriterion("county_city in", values, "countyCity");
            return (Criteria) this;
        }

        public Criteria andCountyCityNotIn(List<String> values) {
            addCriterion("county_city not in", values, "countyCity");
            return (Criteria) this;
        }

        public Criteria andCountyCityBetween(String value1, String value2) {
            addCriterion("county_city between", value1, value2, "countyCity");
            return (Criteria) this;
        }

        public Criteria andCountyCityNotBetween(String value1, String value2) {
            addCriterion("county_city not between", value1, value2, "countyCity");
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

        public Criteria andAverageMileIsNull() {
            addCriterion("average_mile is null");
            return (Criteria) this;
        }

        public Criteria andAverageMileIsNotNull() {
            addCriterion("average_mile is not null");
            return (Criteria) this;
        }

        public Criteria andAverageMileEqualTo(Double value) {
            addCriterion("average_mile =", value, "averageMile");
            return (Criteria) this;
        }

        public Criteria andAverageMileNotEqualTo(Double value) {
            addCriterion("average_mile <>", value, "averageMile");
            return (Criteria) this;
        }

        public Criteria andAverageMileGreaterThan(Double value) {
            addCriterion("average_mile >", value, "averageMile");
            return (Criteria) this;
        }

        public Criteria andAverageMileGreaterThanOrEqualTo(Double value) {
            addCriterion("average_mile >=", value, "averageMile");
            return (Criteria) this;
        }

        public Criteria andAverageMileLessThan(Double value) {
            addCriterion("average_mile <", value, "averageMile");
            return (Criteria) this;
        }

        public Criteria andAverageMileLessThanOrEqualTo(Double value) {
            addCriterion("average_mile <=", value, "averageMile");
            return (Criteria) this;
        }

        public Criteria andAverageMileIn(List<Double> values) {
            addCriterion("average_mile in", values, "averageMile");
            return (Criteria) this;
        }

        public Criteria andAverageMileNotIn(List<Double> values) {
            addCriterion("average_mile not in", values, "averageMile");
            return (Criteria) this;
        }

        public Criteria andAverageMileBetween(Double value1, Double value2) {
            addCriterion("average_mile between", value1, value2, "averageMile");
            return (Criteria) this;
        }

        public Criteria andAverageMileNotBetween(Double value1, Double value2) {
            addCriterion("average_mile not between", value1, value2, "averageMile");
            return (Criteria) this;
        }

        public Criteria andCarAmountIsNull() {
            addCriterion("car_amount is null");
            return (Criteria) this;
        }

        public Criteria andCarAmountIsNotNull() {
            addCriterion("car_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCarAmountEqualTo(Double value) {
            addCriterion("car_amount =", value, "carAmount");
            return (Criteria) this;
        }

        public Criteria andCarAmountNotEqualTo(Double value) {
            addCriterion("car_amount <>", value, "carAmount");
            return (Criteria) this;
        }

        public Criteria andCarAmountGreaterThan(Double value) {
            addCriterion("car_amount >", value, "carAmount");
            return (Criteria) this;
        }

        public Criteria andCarAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("car_amount >=", value, "carAmount");
            return (Criteria) this;
        }

        public Criteria andCarAmountLessThan(Double value) {
            addCriterion("car_amount <", value, "carAmount");
            return (Criteria) this;
        }

        public Criteria andCarAmountLessThanOrEqualTo(Double value) {
            addCriterion("car_amount <=", value, "carAmount");
            return (Criteria) this;
        }

        public Criteria andCarAmountIn(List<Double> values) {
            addCriterion("car_amount in", values, "carAmount");
            return (Criteria) this;
        }

        public Criteria andCarAmountNotIn(List<Double> values) {
            addCriterion("car_amount not in", values, "carAmount");
            return (Criteria) this;
        }

        public Criteria andCarAmountBetween(Double value1, Double value2) {
            addCriterion("car_amount between", value1, value2, "carAmount");
            return (Criteria) this;
        }

        public Criteria andCarAmountNotBetween(Double value1, Double value2) {
            addCriterion("car_amount not between", value1, value2, "carAmount");
            return (Criteria) this;
        }

        public Criteria andCarSpeedIsNull() {
            addCriterion("car_speed is null");
            return (Criteria) this;
        }

        public Criteria andCarSpeedIsNotNull() {
            addCriterion("car_speed is not null");
            return (Criteria) this;
        }

        public Criteria andCarSpeedEqualTo(Double value) {
            addCriterion("car_speed =", value, "carSpeed");
            return (Criteria) this;
        }

        public Criteria andCarSpeedNotEqualTo(Double value) {
            addCriterion("car_speed <>", value, "carSpeed");
            return (Criteria) this;
        }

        public Criteria andCarSpeedGreaterThan(Double value) {
            addCriterion("car_speed >", value, "carSpeed");
            return (Criteria) this;
        }

        public Criteria andCarSpeedGreaterThanOrEqualTo(Double value) {
            addCriterion("car_speed >=", value, "carSpeed");
            return (Criteria) this;
        }

        public Criteria andCarSpeedLessThan(Double value) {
            addCriterion("car_speed <", value, "carSpeed");
            return (Criteria) this;
        }

        public Criteria andCarSpeedLessThanOrEqualTo(Double value) {
            addCriterion("car_speed <=", value, "carSpeed");
            return (Criteria) this;
        }

        public Criteria andCarSpeedIn(List<Double> values) {
            addCriterion("car_speed in", values, "carSpeed");
            return (Criteria) this;
        }

        public Criteria andCarSpeedNotIn(List<Double> values) {
            addCriterion("car_speed not in", values, "carSpeed");
            return (Criteria) this;
        }

        public Criteria andCarSpeedBetween(Double value1, Double value2) {
            addCriterion("car_speed between", value1, value2, "carSpeed");
            return (Criteria) this;
        }

        public Criteria andCarSpeedNotBetween(Double value1, Double value2) {
            addCriterion("car_speed not between", value1, value2, "carSpeed");
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

        public Criteria andCarFuelamountIsNull() {
            addCriterion("car_fuelamount is null");
            return (Criteria) this;
        }

        public Criteria andCarFuelamountIsNotNull() {
            addCriterion("car_fuelamount is not null");
            return (Criteria) this;
        }

        public Criteria andCarFuelamountEqualTo(Double value) {
            addCriterion("car_fuelamount =", value, "carFuelamount");
            return (Criteria) this;
        }

        public Criteria andCarFuelamountNotEqualTo(Double value) {
            addCriterion("car_fuelamount <>", value, "carFuelamount");
            return (Criteria) this;
        }

        public Criteria andCarFuelamountGreaterThan(Double value) {
            addCriterion("car_fuelamount >", value, "carFuelamount");
            return (Criteria) this;
        }

        public Criteria andCarFuelamountGreaterThanOrEqualTo(Double value) {
            addCriterion("car_fuelamount >=", value, "carFuelamount");
            return (Criteria) this;
        }

        public Criteria andCarFuelamountLessThan(Double value) {
            addCriterion("car_fuelamount <", value, "carFuelamount");
            return (Criteria) this;
        }

        public Criteria andCarFuelamountLessThanOrEqualTo(Double value) {
            addCriterion("car_fuelamount <=", value, "carFuelamount");
            return (Criteria) this;
        }

        public Criteria andCarFuelamountIn(List<Double> values) {
            addCriterion("car_fuelamount in", values, "carFuelamount");
            return (Criteria) this;
        }

        public Criteria andCarFuelamountNotIn(List<Double> values) {
            addCriterion("car_fuelamount not in", values, "carFuelamount");
            return (Criteria) this;
        }

        public Criteria andCarFuelamountBetween(Double value1, Double value2) {
            addCriterion("car_fuelamount between", value1, value2, "carFuelamount");
            return (Criteria) this;
        }

        public Criteria andCarFuelamountNotBetween(Double value1, Double value2) {
            addCriterion("car_fuelamount not between", value1, value2, "carFuelamount");
            return (Criteria) this;
        }

        public Criteria andOrvrPercentageIsNull() {
            addCriterion("orvr_percentage is null");
            return (Criteria) this;
        }

        public Criteria andOrvrPercentageIsNotNull() {
            addCriterion("orvr_percentage is not null");
            return (Criteria) this;
        }

        public Criteria andOrvrPercentageEqualTo(Double value) {
            addCriterion("orvr_percentage =", value, "orvrPercentage");
            return (Criteria) this;
        }

        public Criteria andOrvrPercentageNotEqualTo(Double value) {
            addCriterion("orvr_percentage <>", value, "orvrPercentage");
            return (Criteria) this;
        }

        public Criteria andOrvrPercentageGreaterThan(Double value) {
            addCriterion("orvr_percentage >", value, "orvrPercentage");
            return (Criteria) this;
        }

        public Criteria andOrvrPercentageGreaterThanOrEqualTo(Double value) {
            addCriterion("orvr_percentage >=", value, "orvrPercentage");
            return (Criteria) this;
        }

        public Criteria andOrvrPercentageLessThan(Double value) {
            addCriterion("orvr_percentage <", value, "orvrPercentage");
            return (Criteria) this;
        }

        public Criteria andOrvrPercentageLessThanOrEqualTo(Double value) {
            addCriterion("orvr_percentage <=", value, "orvrPercentage");
            return (Criteria) this;
        }

        public Criteria andOrvrPercentageIn(List<Double> values) {
            addCriterion("orvr_percentage in", values, "orvrPercentage");
            return (Criteria) this;
        }

        public Criteria andOrvrPercentageNotIn(List<Double> values) {
            addCriterion("orvr_percentage not in", values, "orvrPercentage");
            return (Criteria) this;
        }

        public Criteria andOrvrPercentageBetween(Double value1, Double value2) {
            addCriterion("orvr_percentage between", value1, value2, "orvrPercentage");
            return (Criteria) this;
        }

        public Criteria andOrvrPercentageNotBetween(Double value1, Double value2) {
            addCriterion("orvr_percentage not between", value1, value2, "orvrPercentage");
            return (Criteria) this;
        }

        public Criteria andAverageSamountIsNull() {
            addCriterion("average_samount is null");
            return (Criteria) this;
        }

        public Criteria andAverageSamountIsNotNull() {
            addCriterion("average_samount is not null");
            return (Criteria) this;
        }

        public Criteria andAverageSamountEqualTo(Double value) {
            addCriterion("average_samount =", value, "averageSamount");
            return (Criteria) this;
        }

        public Criteria andAverageSamountNotEqualTo(Double value) {
            addCriterion("average_samount <>", value, "averageSamount");
            return (Criteria) this;
        }

        public Criteria andAverageSamountGreaterThan(Double value) {
            addCriterion("average_samount >", value, "averageSamount");
            return (Criteria) this;
        }

        public Criteria andAverageSamountGreaterThanOrEqualTo(Double value) {
            addCriterion("average_samount >=", value, "averageSamount");
            return (Criteria) this;
        }

        public Criteria andAverageSamountLessThan(Double value) {
            addCriterion("average_samount <", value, "averageSamount");
            return (Criteria) this;
        }

        public Criteria andAverageSamountLessThanOrEqualTo(Double value) {
            addCriterion("average_samount <=", value, "averageSamount");
            return (Criteria) this;
        }

        public Criteria andAverageSamountIn(List<Double> values) {
            addCriterion("average_samount in", values, "averageSamount");
            return (Criteria) this;
        }

        public Criteria andAverageSamountNotIn(List<Double> values) {
            addCriterion("average_samount not in", values, "averageSamount");
            return (Criteria) this;
        }

        public Criteria andAverageSamountBetween(Double value1, Double value2) {
            addCriterion("average_samount between", value1, value2, "averageSamount");
            return (Criteria) this;
        }

        public Criteria andAverageSamountNotBetween(Double value1, Double value2) {
            addCriterion("average_samount not between", value1, value2, "averageSamount");
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

        public Criteria andEcEmissionIsNull() {
            addCriterion("ec_emission is null");
            return (Criteria) this;
        }

        public Criteria andEcEmissionIsNotNull() {
            addCriterion("ec_emission is not null");
            return (Criteria) this;
        }

        public Criteria andEcEmissionEqualTo(Double value) {
            addCriterion("ec_emission =", value, "ecEmission");
            return (Criteria) this;
        }

        public Criteria andEcEmissionNotEqualTo(Double value) {
            addCriterion("ec_emission <>", value, "ecEmission");
            return (Criteria) this;
        }

        public Criteria andEcEmissionGreaterThan(Double value) {
            addCriterion("ec_emission >", value, "ecEmission");
            return (Criteria) this;
        }

        public Criteria andEcEmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("ec_emission >=", value, "ecEmission");
            return (Criteria) this;
        }

        public Criteria andEcEmissionLessThan(Double value) {
            addCriterion("ec_emission <", value, "ecEmission");
            return (Criteria) this;
        }

        public Criteria andEcEmissionLessThanOrEqualTo(Double value) {
            addCriterion("ec_emission <=", value, "ecEmission");
            return (Criteria) this;
        }

        public Criteria andEcEmissionIn(List<Double> values) {
            addCriterion("ec_emission in", values, "ecEmission");
            return (Criteria) this;
        }

        public Criteria andEcEmissionNotIn(List<Double> values) {
            addCriterion("ec_emission not in", values, "ecEmission");
            return (Criteria) this;
        }

        public Criteria andEcEmissionBetween(Double value1, Double value2) {
            addCriterion("ec_emission between", value1, value2, "ecEmission");
            return (Criteria) this;
        }

        public Criteria andEcEmissionNotBetween(Double value1, Double value2) {
            addCriterion("ec_emission not between", value1, value2, "ecEmission");
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

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("flag not between", value1, value2, "flag");
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