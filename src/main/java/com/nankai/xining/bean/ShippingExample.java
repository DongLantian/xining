package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class ShippingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShippingExample() {
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

        public Criteria andShippingTypeIsNull() {
            addCriterion("shipping_type is null");
            return (Criteria) this;
        }

        public Criteria andShippingTypeIsNotNull() {
            addCriterion("shipping_type is not null");
            return (Criteria) this;
        }

        public Criteria andShippingTypeEqualTo(String value) {
            addCriterion("shipping_type =", value, "shippingType");
            return (Criteria) this;
        }

        public Criteria andShippingTypeNotEqualTo(String value) {
            addCriterion("shipping_type <>", value, "shippingType");
            return (Criteria) this;
        }

        public Criteria andShippingTypeGreaterThan(String value) {
            addCriterion("shipping_type >", value, "shippingType");
            return (Criteria) this;
        }

        public Criteria andShippingTypeGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_type >=", value, "shippingType");
            return (Criteria) this;
        }

        public Criteria andShippingTypeLessThan(String value) {
            addCriterion("shipping_type <", value, "shippingType");
            return (Criteria) this;
        }

        public Criteria andShippingTypeLessThanOrEqualTo(String value) {
            addCriterion("shipping_type <=", value, "shippingType");
            return (Criteria) this;
        }

        public Criteria andShippingTypeLike(String value) {
            addCriterion("shipping_type like", value, "shippingType");
            return (Criteria) this;
        }

        public Criteria andShippingTypeNotLike(String value) {
            addCriterion("shipping_type not like", value, "shippingType");
            return (Criteria) this;
        }

        public Criteria andShippingTypeIn(List<String> values) {
            addCriterion("shipping_type in", values, "shippingType");
            return (Criteria) this;
        }

        public Criteria andShippingTypeNotIn(List<String> values) {
            addCriterion("shipping_type not in", values, "shippingType");
            return (Criteria) this;
        }

        public Criteria andShippingTypeBetween(String value1, String value2) {
            addCriterion("shipping_type between", value1, value2, "shippingType");
            return (Criteria) this;
        }

        public Criteria andShippingTypeNotBetween(String value1, String value2) {
            addCriterion("shipping_type not between", value1, value2, "shippingType");
            return (Criteria) this;
        }

        public Criteria andTotalThroughputIsNull() {
            addCriterion("total_throughput is null");
            return (Criteria) this;
        }

        public Criteria andTotalThroughputIsNotNull() {
            addCriterion("total_throughput is not null");
            return (Criteria) this;
        }

        public Criteria andTotalThroughputEqualTo(Double value) {
            addCriterion("total_throughput =", value, "totalThroughput");
            return (Criteria) this;
        }

        public Criteria andTotalThroughputNotEqualTo(Double value) {
            addCriterion("total_throughput <>", value, "totalThroughput");
            return (Criteria) this;
        }

        public Criteria andTotalThroughputGreaterThan(Double value) {
            addCriterion("total_throughput >", value, "totalThroughput");
            return (Criteria) this;
        }

        public Criteria andTotalThroughputGreaterThanOrEqualTo(Double value) {
            addCriterion("total_throughput >=", value, "totalThroughput");
            return (Criteria) this;
        }

        public Criteria andTotalThroughputLessThan(Double value) {
            addCriterion("total_throughput <", value, "totalThroughput");
            return (Criteria) this;
        }

        public Criteria andTotalThroughputLessThanOrEqualTo(Double value) {
            addCriterion("total_throughput <=", value, "totalThroughput");
            return (Criteria) this;
        }

        public Criteria andTotalThroughputIn(List<Double> values) {
            addCriterion("total_throughput in", values, "totalThroughput");
            return (Criteria) this;
        }

        public Criteria andTotalThroughputNotIn(List<Double> values) {
            addCriterion("total_throughput not in", values, "totalThroughput");
            return (Criteria) this;
        }

        public Criteria andTotalThroughputBetween(Double value1, Double value2) {
            addCriterion("total_throughput between", value1, value2, "totalThroughput");
            return (Criteria) this;
        }

        public Criteria andTotalThroughputNotBetween(Double value1, Double value2) {
            addCriterion("total_throughput not between", value1, value2, "totalThroughput");
            return (Criteria) this;
        }

        public Criteria andCircularFlowIsNull() {
            addCriterion("circular_flow is null");
            return (Criteria) this;
        }

        public Criteria andCircularFlowIsNotNull() {
            addCriterion("circular_flow is not null");
            return (Criteria) this;
        }

        public Criteria andCircularFlowEqualTo(Double value) {
            addCriterion("circular_flow =", value, "circularFlow");
            return (Criteria) this;
        }

        public Criteria andCircularFlowNotEqualTo(Double value) {
            addCriterion("circular_flow <>", value, "circularFlow");
            return (Criteria) this;
        }

        public Criteria andCircularFlowGreaterThan(Double value) {
            addCriterion("circular_flow >", value, "circularFlow");
            return (Criteria) this;
        }

        public Criteria andCircularFlowGreaterThanOrEqualTo(Double value) {
            addCriterion("circular_flow >=", value, "circularFlow");
            return (Criteria) this;
        }

        public Criteria andCircularFlowLessThan(Double value) {
            addCriterion("circular_flow <", value, "circularFlow");
            return (Criteria) this;
        }

        public Criteria andCircularFlowLessThanOrEqualTo(Double value) {
            addCriterion("circular_flow <=", value, "circularFlow");
            return (Criteria) this;
        }

        public Criteria andCircularFlowIn(List<Double> values) {
            addCriterion("circular_flow in", values, "circularFlow");
            return (Criteria) this;
        }

        public Criteria andCircularFlowNotIn(List<Double> values) {
            addCriterion("circular_flow not in", values, "circularFlow");
            return (Criteria) this;
        }

        public Criteria andCircularFlowBetween(Double value1, Double value2) {
            addCriterion("circular_flow between", value1, value2, "circularFlow");
            return (Criteria) this;
        }

        public Criteria andCircularFlowNotBetween(Double value1, Double value2) {
            addCriterion("circular_flow not between", value1, value2, "circularFlow");
            return (Criteria) this;
        }

        public Criteria andAverageWeightIsNull() {
            addCriterion("average_weight is null");
            return (Criteria) this;
        }

        public Criteria andAverageWeightIsNotNull() {
            addCriterion("average_weight is not null");
            return (Criteria) this;
        }

        public Criteria andAverageWeightEqualTo(Double value) {
            addCriterion("average_weight =", value, "averageWeight");
            return (Criteria) this;
        }

        public Criteria andAverageWeightNotEqualTo(Double value) {
            addCriterion("average_weight <>", value, "averageWeight");
            return (Criteria) this;
        }

        public Criteria andAverageWeightGreaterThan(Double value) {
            addCriterion("average_weight >", value, "averageWeight");
            return (Criteria) this;
        }

        public Criteria andAverageWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("average_weight >=", value, "averageWeight");
            return (Criteria) this;
        }

        public Criteria andAverageWeightLessThan(Double value) {
            addCriterion("average_weight <", value, "averageWeight");
            return (Criteria) this;
        }

        public Criteria andAverageWeightLessThanOrEqualTo(Double value) {
            addCriterion("average_weight <=", value, "averageWeight");
            return (Criteria) this;
        }

        public Criteria andAverageWeightIn(List<Double> values) {
            addCriterion("average_weight in", values, "averageWeight");
            return (Criteria) this;
        }

        public Criteria andAverageWeightNotIn(List<Double> values) {
            addCriterion("average_weight not in", values, "averageWeight");
            return (Criteria) this;
        }

        public Criteria andAverageWeightBetween(Double value1, Double value2) {
            addCriterion("average_weight between", value1, value2, "averageWeight");
            return (Criteria) this;
        }

        public Criteria andAverageWeightNotBetween(Double value1, Double value2) {
            addCriterion("average_weight not between", value1, value2, "averageWeight");
            return (Criteria) this;
        }

        public Criteria andNavigationDistanceIsNull() {
            addCriterion("navigation_distance is null");
            return (Criteria) this;
        }

        public Criteria andNavigationDistanceIsNotNull() {
            addCriterion("navigation_distance is not null");
            return (Criteria) this;
        }

        public Criteria andNavigationDistanceEqualTo(Double value) {
            addCriterion("navigation_distance =", value, "navigationDistance");
            return (Criteria) this;
        }

        public Criteria andNavigationDistanceNotEqualTo(Double value) {
            addCriterion("navigation_distance <>", value, "navigationDistance");
            return (Criteria) this;
        }

        public Criteria andNavigationDistanceGreaterThan(Double value) {
            addCriterion("navigation_distance >", value, "navigationDistance");
            return (Criteria) this;
        }

        public Criteria andNavigationDistanceGreaterThanOrEqualTo(Double value) {
            addCriterion("navigation_distance >=", value, "navigationDistance");
            return (Criteria) this;
        }

        public Criteria andNavigationDistanceLessThan(Double value) {
            addCriterion("navigation_distance <", value, "navigationDistance");
            return (Criteria) this;
        }

        public Criteria andNavigationDistanceLessThanOrEqualTo(Double value) {
            addCriterion("navigation_distance <=", value, "navigationDistance");
            return (Criteria) this;
        }

        public Criteria andNavigationDistanceIn(List<Double> values) {
            addCriterion("navigation_distance in", values, "navigationDistance");
            return (Criteria) this;
        }

        public Criteria andNavigationDistanceNotIn(List<Double> values) {
            addCriterion("navigation_distance not in", values, "navigationDistance");
            return (Criteria) this;
        }

        public Criteria andNavigationDistanceBetween(Double value1, Double value2) {
            addCriterion("navigation_distance between", value1, value2, "navigationDistance");
            return (Criteria) this;
        }

        public Criteria andNavigationDistanceNotBetween(Double value1, Double value2) {
            addCriterion("navigation_distance not between", value1, value2, "navigationDistance");
            return (Criteria) this;
        }

        public Criteria andCircularFlowConsuptionIsNull() {
            addCriterion("circular_flow_consuption is null");
            return (Criteria) this;
        }

        public Criteria andCircularFlowConsuptionIsNotNull() {
            addCriterion("circular_flow_consuption is not null");
            return (Criteria) this;
        }

        public Criteria andCircularFlowConsuptionEqualTo(Double value) {
            addCriterion("circular_flow_consuption =", value, "circularFlowConsuption");
            return (Criteria) this;
        }

        public Criteria andCircularFlowConsuptionNotEqualTo(Double value) {
            addCriterion("circular_flow_consuption <>", value, "circularFlowConsuption");
            return (Criteria) this;
        }

        public Criteria andCircularFlowConsuptionGreaterThan(Double value) {
            addCriterion("circular_flow_consuption >", value, "circularFlowConsuption");
            return (Criteria) this;
        }

        public Criteria andCircularFlowConsuptionGreaterThanOrEqualTo(Double value) {
            addCriterion("circular_flow_consuption >=", value, "circularFlowConsuption");
            return (Criteria) this;
        }

        public Criteria andCircularFlowConsuptionLessThan(Double value) {
            addCriterion("circular_flow_consuption <", value, "circularFlowConsuption");
            return (Criteria) this;
        }

        public Criteria andCircularFlowConsuptionLessThanOrEqualTo(Double value) {
            addCriterion("circular_flow_consuption <=", value, "circularFlowConsuption");
            return (Criteria) this;
        }

        public Criteria andCircularFlowConsuptionIn(List<Double> values) {
            addCriterion("circular_flow_consuption in", values, "circularFlowConsuption");
            return (Criteria) this;
        }

        public Criteria andCircularFlowConsuptionNotIn(List<Double> values) {
            addCriterion("circular_flow_consuption not in", values, "circularFlowConsuption");
            return (Criteria) this;
        }

        public Criteria andCircularFlowConsuptionBetween(Double value1, Double value2) {
            addCriterion("circular_flow_consuption between", value1, value2, "circularFlowConsuption");
            return (Criteria) this;
        }

        public Criteria andCircularFlowConsuptionNotBetween(Double value1, Double value2) {
            addCriterion("circular_flow_consuption not between", value1, value2, "circularFlowConsuption");
            return (Criteria) this;
        }

        public Criteria andRatioIsNull() {
            addCriterion("ratio is null");
            return (Criteria) this;
        }

        public Criteria andRatioIsNotNull() {
            addCriterion("ratio is not null");
            return (Criteria) this;
        }

        public Criteria andRatioEqualTo(Double value) {
            addCriterion("ratio =", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotEqualTo(Double value) {
            addCriterion("ratio <>", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioGreaterThan(Double value) {
            addCriterion("ratio >", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioGreaterThanOrEqualTo(Double value) {
            addCriterion("ratio >=", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioLessThan(Double value) {
            addCriterion("ratio <", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioLessThanOrEqualTo(Double value) {
            addCriterion("ratio <=", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioIn(List<Double> values) {
            addCriterion("ratio in", values, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotIn(List<Double> values) {
            addCriterion("ratio not in", values, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioBetween(Double value1, Double value2) {
            addCriterion("ratio between", value1, value2, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotBetween(Double value1, Double value2) {
            addCriterion("ratio not between", value1, value2, "ratio");
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

        public Criteria andHcEmissionIsNull() {
            addCriterion("hc_emission is null");
            return (Criteria) this;
        }

        public Criteria andHcEmissionIsNotNull() {
            addCriterion("hc_emission is not null");
            return (Criteria) this;
        }

        public Criteria andHcEmissionEqualTo(Double value) {
            addCriterion("hc_emission =", value, "hcEmission");
            return (Criteria) this;
        }

        public Criteria andHcEmissionNotEqualTo(Double value) {
            addCriterion("hc_emission <>", value, "hcEmission");
            return (Criteria) this;
        }

        public Criteria andHcEmissionGreaterThan(Double value) {
            addCriterion("hc_emission >", value, "hcEmission");
            return (Criteria) this;
        }

        public Criteria andHcEmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("hc_emission >=", value, "hcEmission");
            return (Criteria) this;
        }

        public Criteria andHcEmissionLessThan(Double value) {
            addCriterion("hc_emission <", value, "hcEmission");
            return (Criteria) this;
        }

        public Criteria andHcEmissionLessThanOrEqualTo(Double value) {
            addCriterion("hc_emission <=", value, "hcEmission");
            return (Criteria) this;
        }

        public Criteria andHcEmissionIn(List<Double> values) {
            addCriterion("hc_emission in", values, "hcEmission");
            return (Criteria) this;
        }

        public Criteria andHcEmissionNotIn(List<Double> values) {
            addCriterion("hc_emission not in", values, "hcEmission");
            return (Criteria) this;
        }

        public Criteria andHcEmissionBetween(Double value1, Double value2) {
            addCriterion("hc_emission between", value1, value2, "hcEmission");
            return (Criteria) this;
        }

        public Criteria andHcEmissionNotBetween(Double value1, Double value2) {
            addCriterion("hc_emission not between", value1, value2, "hcEmission");
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