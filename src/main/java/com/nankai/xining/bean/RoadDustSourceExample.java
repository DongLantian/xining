package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class RoadDustSourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoadDustSourceExample() {
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

        public Criteria andRoadDustidIsNull() {
            addCriterion("road_dustid is null");
            return (Criteria) this;
        }

        public Criteria andRoadDustidIsNotNull() {
            addCriterion("road_dustid is not null");
            return (Criteria) this;
        }

        public Criteria andRoadDustidEqualTo(Integer value) {
            addCriterion("road_dustid =", value, "roadDustid");
            return (Criteria) this;
        }

        public Criteria andRoadDustidNotEqualTo(Integer value) {
            addCriterion("road_dustid <>", value, "roadDustid");
            return (Criteria) this;
        }

        public Criteria andRoadDustidGreaterThan(Integer value) {
            addCriterion("road_dustid >", value, "roadDustid");
            return (Criteria) this;
        }

        public Criteria andRoadDustidGreaterThanOrEqualTo(Integer value) {
            addCriterion("road_dustid >=", value, "roadDustid");
            return (Criteria) this;
        }

        public Criteria andRoadDustidLessThan(Integer value) {
            addCriterion("road_dustid <", value, "roadDustid");
            return (Criteria) this;
        }

        public Criteria andRoadDustidLessThanOrEqualTo(Integer value) {
            addCriterion("road_dustid <=", value, "roadDustid");
            return (Criteria) this;
        }

        public Criteria andRoadDustidIn(List<Integer> values) {
            addCriterion("road_dustid in", values, "roadDustid");
            return (Criteria) this;
        }

        public Criteria andRoadDustidNotIn(List<Integer> values) {
            addCriterion("road_dustid not in", values, "roadDustid");
            return (Criteria) this;
        }

        public Criteria andRoadDustidBetween(Integer value1, Integer value2) {
            addCriterion("road_dustid between", value1, value2, "roadDustid");
            return (Criteria) this;
        }

        public Criteria andRoadDustidNotBetween(Integer value1, Integer value2) {
            addCriterion("road_dustid not between", value1, value2, "roadDustid");
            return (Criteria) this;
        }

        public Criteria andSccIsNull() {
            addCriterion("scc is null");
            return (Criteria) this;
        }

        public Criteria andSccIsNotNull() {
            addCriterion("scc is not null");
            return (Criteria) this;
        }

        public Criteria andSccEqualTo(String value) {
            addCriterion("scc =", value, "scc");
            return (Criteria) this;
        }

        public Criteria andSccNotEqualTo(String value) {
            addCriterion("scc <>", value, "scc");
            return (Criteria) this;
        }

        public Criteria andSccGreaterThan(String value) {
            addCriterion("scc >", value, "scc");
            return (Criteria) this;
        }

        public Criteria andSccGreaterThanOrEqualTo(String value) {
            addCriterion("scc >=", value, "scc");
            return (Criteria) this;
        }

        public Criteria andSccLessThan(String value) {
            addCriterion("scc <", value, "scc");
            return (Criteria) this;
        }

        public Criteria andSccLessThanOrEqualTo(String value) {
            addCriterion("scc <=", value, "scc");
            return (Criteria) this;
        }

        public Criteria andSccLike(String value) {
            addCriterion("scc like", value, "scc");
            return (Criteria) this;
        }

        public Criteria andSccNotLike(String value) {
            addCriterion("scc not like", value, "scc");
            return (Criteria) this;
        }

        public Criteria andSccIn(List<String> values) {
            addCriterion("scc in", values, "scc");
            return (Criteria) this;
        }

        public Criteria andSccNotIn(List<String> values) {
            addCriterion("scc not in", values, "scc");
            return (Criteria) this;
        }

        public Criteria andSccBetween(String value1, String value2) {
            addCriterion("scc between", value1, value2, "scc");
            return (Criteria) this;
        }

        public Criteria andSccNotBetween(String value1, String value2) {
            addCriterion("scc not between", value1, value2, "scc");
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

        public Criteria andStartLongitudeIsNull() {
            addCriterion("start_longitude is null");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeIsNotNull() {
            addCriterion("start_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeEqualTo(Double value) {
            addCriterion("start_longitude =", value, "startLongitude");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeNotEqualTo(Double value) {
            addCriterion("start_longitude <>", value, "startLongitude");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeGreaterThan(Double value) {
            addCriterion("start_longitude >", value, "startLongitude");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("start_longitude >=", value, "startLongitude");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeLessThan(Double value) {
            addCriterion("start_longitude <", value, "startLongitude");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("start_longitude <=", value, "startLongitude");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeIn(List<Double> values) {
            addCriterion("start_longitude in", values, "startLongitude");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeNotIn(List<Double> values) {
            addCriterion("start_longitude not in", values, "startLongitude");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeBetween(Double value1, Double value2) {
            addCriterion("start_longitude between", value1, value2, "startLongitude");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("start_longitude not between", value1, value2, "startLongitude");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeIsNull() {
            addCriterion("start_latitude is null");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeIsNotNull() {
            addCriterion("start_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeEqualTo(Double value) {
            addCriterion("start_latitude =", value, "startLatitude");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeNotEqualTo(Double value) {
            addCriterion("start_latitude <>", value, "startLatitude");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeGreaterThan(Double value) {
            addCriterion("start_latitude >", value, "startLatitude");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("start_latitude >=", value, "startLatitude");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeLessThan(Double value) {
            addCriterion("start_latitude <", value, "startLatitude");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("start_latitude <=", value, "startLatitude");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeIn(List<Double> values) {
            addCriterion("start_latitude in", values, "startLatitude");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeNotIn(List<Double> values) {
            addCriterion("start_latitude not in", values, "startLatitude");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeBetween(Double value1, Double value2) {
            addCriterion("start_latitude between", value1, value2, "startLatitude");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("start_latitude not between", value1, value2, "startLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeIsNull() {
            addCriterion("end_longitude is null");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeIsNotNull() {
            addCriterion("end_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeEqualTo(Double value) {
            addCriterion("end_longitude =", value, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeNotEqualTo(Double value) {
            addCriterion("end_longitude <>", value, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeGreaterThan(Double value) {
            addCriterion("end_longitude >", value, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("end_longitude >=", value, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeLessThan(Double value) {
            addCriterion("end_longitude <", value, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("end_longitude <=", value, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeIn(List<Double> values) {
            addCriterion("end_longitude in", values, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeNotIn(List<Double> values) {
            addCriterion("end_longitude not in", values, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeBetween(Double value1, Double value2) {
            addCriterion("end_longitude between", value1, value2, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("end_longitude not between", value1, value2, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeIsNull() {
            addCriterion("end_latitude is null");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeIsNotNull() {
            addCriterion("end_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeEqualTo(Double value) {
            addCriterion("end_latitude =", value, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeNotEqualTo(Double value) {
            addCriterion("end_latitude <>", value, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeGreaterThan(Double value) {
            addCriterion("end_latitude >", value, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("end_latitude >=", value, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeLessThan(Double value) {
            addCriterion("end_latitude <", value, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("end_latitude <=", value, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeIn(List<Double> values) {
            addCriterion("end_latitude in", values, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeNotIn(List<Double> values) {
            addCriterion("end_latitude not in", values, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeBetween(Double value1, Double value2) {
            addCriterion("end_latitude between", value1, value2, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("end_latitude not between", value1, value2, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andRoadTypeIsNull() {
            addCriterion("road_type is null");
            return (Criteria) this;
        }

        public Criteria andRoadTypeIsNotNull() {
            addCriterion("road_type is not null");
            return (Criteria) this;
        }

        public Criteria andRoadTypeEqualTo(String value) {
            addCriterion("road_type =", value, "roadType");
            return (Criteria) this;
        }

        public Criteria andRoadTypeNotEqualTo(String value) {
            addCriterion("road_type <>", value, "roadType");
            return (Criteria) this;
        }

        public Criteria andRoadTypeGreaterThan(String value) {
            addCriterion("road_type >", value, "roadType");
            return (Criteria) this;
        }

        public Criteria andRoadTypeGreaterThanOrEqualTo(String value) {
            addCriterion("road_type >=", value, "roadType");
            return (Criteria) this;
        }

        public Criteria andRoadTypeLessThan(String value) {
            addCriterion("road_type <", value, "roadType");
            return (Criteria) this;
        }

        public Criteria andRoadTypeLessThanOrEqualTo(String value) {
            addCriterion("road_type <=", value, "roadType");
            return (Criteria) this;
        }

        public Criteria andRoadTypeLike(String value) {
            addCriterion("road_type like", value, "roadType");
            return (Criteria) this;
        }

        public Criteria andRoadTypeNotLike(String value) {
            addCriterion("road_type not like", value, "roadType");
            return (Criteria) this;
        }

        public Criteria andRoadTypeIn(List<String> values) {
            addCriterion("road_type in", values, "roadType");
            return (Criteria) this;
        }

        public Criteria andRoadTypeNotIn(List<String> values) {
            addCriterion("road_type not in", values, "roadType");
            return (Criteria) this;
        }

        public Criteria andRoadTypeBetween(String value1, String value2) {
            addCriterion("road_type between", value1, value2, "roadType");
            return (Criteria) this;
        }

        public Criteria andRoadTypeNotBetween(String value1, String value2) {
            addCriterion("road_type not between", value1, value2, "roadType");
            return (Criteria) this;
        }

        public Criteria andPathLengthIsNull() {
            addCriterion("path_length is null");
            return (Criteria) this;
        }

        public Criteria andPathLengthIsNotNull() {
            addCriterion("path_length is not null");
            return (Criteria) this;
        }

        public Criteria andPathLengthEqualTo(Double value) {
            addCriterion("path_length =", value, "pathLength");
            return (Criteria) this;
        }

        public Criteria andPathLengthNotEqualTo(Double value) {
            addCriterion("path_length <>", value, "pathLength");
            return (Criteria) this;
        }

        public Criteria andPathLengthGreaterThan(Double value) {
            addCriterion("path_length >", value, "pathLength");
            return (Criteria) this;
        }

        public Criteria andPathLengthGreaterThanOrEqualTo(Double value) {
            addCriterion("path_length >=", value, "pathLength");
            return (Criteria) this;
        }

        public Criteria andPathLengthLessThan(Double value) {
            addCriterion("path_length <", value, "pathLength");
            return (Criteria) this;
        }

        public Criteria andPathLengthLessThanOrEqualTo(Double value) {
            addCriterion("path_length <=", value, "pathLength");
            return (Criteria) this;
        }

        public Criteria andPathLengthIn(List<Double> values) {
            addCriterion("path_length in", values, "pathLength");
            return (Criteria) this;
        }

        public Criteria andPathLengthNotIn(List<Double> values) {
            addCriterion("path_length not in", values, "pathLength");
            return (Criteria) this;
        }

        public Criteria andPathLengthBetween(Double value1, Double value2) {
            addCriterion("path_length between", value1, value2, "pathLength");
            return (Criteria) this;
        }

        public Criteria andPathLengthNotBetween(Double value1, Double value2) {
            addCriterion("path_length not between", value1, value2, "pathLength");
            return (Criteria) this;
        }

        public Criteria andIspaveIsNull() {
            addCriterion("ispave is null");
            return (Criteria) this;
        }

        public Criteria andIspaveIsNotNull() {
            addCriterion("ispave is not null");
            return (Criteria) this;
        }

        public Criteria andIspaveEqualTo(String value) {
            addCriterion("ispave =", value, "ispave");
            return (Criteria) this;
        }

        public Criteria andIspaveNotEqualTo(String value) {
            addCriterion("ispave <>", value, "ispave");
            return (Criteria) this;
        }

        public Criteria andIspaveGreaterThan(String value) {
            addCriterion("ispave >", value, "ispave");
            return (Criteria) this;
        }

        public Criteria andIspaveGreaterThanOrEqualTo(String value) {
            addCriterion("ispave >=", value, "ispave");
            return (Criteria) this;
        }

        public Criteria andIspaveLessThan(String value) {
            addCriterion("ispave <", value, "ispave");
            return (Criteria) this;
        }

        public Criteria andIspaveLessThanOrEqualTo(String value) {
            addCriterion("ispave <=", value, "ispave");
            return (Criteria) this;
        }

        public Criteria andIspaveLike(String value) {
            addCriterion("ispave like", value, "ispave");
            return (Criteria) this;
        }

        public Criteria andIspaveNotLike(String value) {
            addCriterion("ispave not like", value, "ispave");
            return (Criteria) this;
        }

        public Criteria andIspaveIn(List<String> values) {
            addCriterion("ispave in", values, "ispave");
            return (Criteria) this;
        }

        public Criteria andIspaveNotIn(List<String> values) {
            addCriterion("ispave not in", values, "ispave");
            return (Criteria) this;
        }

        public Criteria andIspaveBetween(String value1, String value2) {
            addCriterion("ispave between", value1, value2, "ispave");
            return (Criteria) this;
        }

        public Criteria andIspaveNotBetween(String value1, String value2) {
            addCriterion("ispave not between", value1, value2, "ispave");
            return (Criteria) this;
        }

        public Criteria andAverWidthIsNull() {
            addCriterion("aver_width is null");
            return (Criteria) this;
        }

        public Criteria andAverWidthIsNotNull() {
            addCriterion("aver_width is not null");
            return (Criteria) this;
        }

        public Criteria andAverWidthEqualTo(Double value) {
            addCriterion("aver_width =", value, "averWidth");
            return (Criteria) this;
        }

        public Criteria andAverWidthNotEqualTo(Double value) {
            addCriterion("aver_width <>", value, "averWidth");
            return (Criteria) this;
        }

        public Criteria andAverWidthGreaterThan(Double value) {
            addCriterion("aver_width >", value, "averWidth");
            return (Criteria) this;
        }

        public Criteria andAverWidthGreaterThanOrEqualTo(Double value) {
            addCriterion("aver_width >=", value, "averWidth");
            return (Criteria) this;
        }

        public Criteria andAverWidthLessThan(Double value) {
            addCriterion("aver_width <", value, "averWidth");
            return (Criteria) this;
        }

        public Criteria andAverWidthLessThanOrEqualTo(Double value) {
            addCriterion("aver_width <=", value, "averWidth");
            return (Criteria) this;
        }

        public Criteria andAverWidthIn(List<Double> values) {
            addCriterion("aver_width in", values, "averWidth");
            return (Criteria) this;
        }

        public Criteria andAverWidthNotIn(List<Double> values) {
            addCriterion("aver_width not in", values, "averWidth");
            return (Criteria) this;
        }

        public Criteria andAverWidthBetween(Double value1, Double value2) {
            addCriterion("aver_width between", value1, value2, "averWidth");
            return (Criteria) this;
        }

        public Criteria andAverWidthNotBetween(Double value1, Double value2) {
            addCriterion("aver_width not between", value1, value2, "averWidth");
            return (Criteria) this;
        }

        public Criteria andAverWeightIsNull() {
            addCriterion("aver_weight is null");
            return (Criteria) this;
        }

        public Criteria andAverWeightIsNotNull() {
            addCriterion("aver_weight is not null");
            return (Criteria) this;
        }

        public Criteria andAverWeightEqualTo(Double value) {
            addCriterion("aver_weight =", value, "averWeight");
            return (Criteria) this;
        }

        public Criteria andAverWeightNotEqualTo(Double value) {
            addCriterion("aver_weight <>", value, "averWeight");
            return (Criteria) this;
        }

        public Criteria andAverWeightGreaterThan(Double value) {
            addCriterion("aver_weight >", value, "averWeight");
            return (Criteria) this;
        }

        public Criteria andAverWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("aver_weight >=", value, "averWeight");
            return (Criteria) this;
        }

        public Criteria andAverWeightLessThan(Double value) {
            addCriterion("aver_weight <", value, "averWeight");
            return (Criteria) this;
        }

        public Criteria andAverWeightLessThanOrEqualTo(Double value) {
            addCriterion("aver_weight <=", value, "averWeight");
            return (Criteria) this;
        }

        public Criteria andAverWeightIn(List<Double> values) {
            addCriterion("aver_weight in", values, "averWeight");
            return (Criteria) this;
        }

        public Criteria andAverWeightNotIn(List<Double> values) {
            addCriterion("aver_weight not in", values, "averWeight");
            return (Criteria) this;
        }

        public Criteria andAverWeightBetween(Double value1, Double value2) {
            addCriterion("aver_weight between", value1, value2, "averWeight");
            return (Criteria) this;
        }

        public Criteria andAverWeightNotBetween(Double value1, Double value2) {
            addCriterion("aver_weight not between", value1, value2, "averWeight");
            return (Criteria) this;
        }

        public Criteria andCarFlowIsNull() {
            addCriterion("car_flow is null");
            return (Criteria) this;
        }

        public Criteria andCarFlowIsNotNull() {
            addCriterion("car_flow is not null");
            return (Criteria) this;
        }

        public Criteria andCarFlowEqualTo(Double value) {
            addCriterion("car_flow =", value, "carFlow");
            return (Criteria) this;
        }

        public Criteria andCarFlowNotEqualTo(Double value) {
            addCriterion("car_flow <>", value, "carFlow");
            return (Criteria) this;
        }

        public Criteria andCarFlowGreaterThan(Double value) {
            addCriterion("car_flow >", value, "carFlow");
            return (Criteria) this;
        }

        public Criteria andCarFlowGreaterThanOrEqualTo(Double value) {
            addCriterion("car_flow >=", value, "carFlow");
            return (Criteria) this;
        }

        public Criteria andCarFlowLessThan(Double value) {
            addCriterion("car_flow <", value, "carFlow");
            return (Criteria) this;
        }

        public Criteria andCarFlowLessThanOrEqualTo(Double value) {
            addCriterion("car_flow <=", value, "carFlow");
            return (Criteria) this;
        }

        public Criteria andCarFlowIn(List<Double> values) {
            addCriterion("car_flow in", values, "carFlow");
            return (Criteria) this;
        }

        public Criteria andCarFlowNotIn(List<Double> values) {
            addCriterion("car_flow not in", values, "carFlow");
            return (Criteria) this;
        }

        public Criteria andCarFlowBetween(Double value1, Double value2) {
            addCriterion("car_flow between", value1, value2, "carFlow");
            return (Criteria) this;
        }

        public Criteria andCarFlowNotBetween(Double value1, Double value2) {
            addCriterion("car_flow not between", value1, value2, "carFlow");
            return (Criteria) this;
        }

        public Criteria andAverSpeedIsNull() {
            addCriterion("aver_speed is null");
            return (Criteria) this;
        }

        public Criteria andAverSpeedIsNotNull() {
            addCriterion("aver_speed is not null");
            return (Criteria) this;
        }

        public Criteria andAverSpeedEqualTo(Double value) {
            addCriterion("aver_speed =", value, "averSpeed");
            return (Criteria) this;
        }

        public Criteria andAverSpeedNotEqualTo(Double value) {
            addCriterion("aver_speed <>", value, "averSpeed");
            return (Criteria) this;
        }

        public Criteria andAverSpeedGreaterThan(Double value) {
            addCriterion("aver_speed >", value, "averSpeed");
            return (Criteria) this;
        }

        public Criteria andAverSpeedGreaterThanOrEqualTo(Double value) {
            addCriterion("aver_speed >=", value, "averSpeed");
            return (Criteria) this;
        }

        public Criteria andAverSpeedLessThan(Double value) {
            addCriterion("aver_speed <", value, "averSpeed");
            return (Criteria) this;
        }

        public Criteria andAverSpeedLessThanOrEqualTo(Double value) {
            addCriterion("aver_speed <=", value, "averSpeed");
            return (Criteria) this;
        }

        public Criteria andAverSpeedIn(List<Double> values) {
            addCriterion("aver_speed in", values, "averSpeed");
            return (Criteria) this;
        }

        public Criteria andAverSpeedNotIn(List<Double> values) {
            addCriterion("aver_speed not in", values, "averSpeed");
            return (Criteria) this;
        }

        public Criteria andAverSpeedBetween(Double value1, Double value2) {
            addCriterion("aver_speed between", value1, value2, "averSpeed");
            return (Criteria) this;
        }

        public Criteria andAverSpeedNotBetween(Double value1, Double value2) {
            addCriterion("aver_speed not between", value1, value2, "averSpeed");
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

        public Criteria andPm10FactorsIsNull() {
            addCriterion("pm10_factors is null");
            return (Criteria) this;
        }

        public Criteria andPm10FactorsIsNotNull() {
            addCriterion("pm10_factors is not null");
            return (Criteria) this;
        }

        public Criteria andPm10FactorsEqualTo(Double value) {
            addCriterion("pm10_factors =", value, "pm10Factors");
            return (Criteria) this;
        }

        public Criteria andPm10FactorsNotEqualTo(Double value) {
            addCriterion("pm10_factors <>", value, "pm10Factors");
            return (Criteria) this;
        }

        public Criteria andPm10FactorsGreaterThan(Double value) {
            addCriterion("pm10_factors >", value, "pm10Factors");
            return (Criteria) this;
        }

        public Criteria andPm10FactorsGreaterThanOrEqualTo(Double value) {
            addCriterion("pm10_factors >=", value, "pm10Factors");
            return (Criteria) this;
        }

        public Criteria andPm10FactorsLessThan(Double value) {
            addCriterion("pm10_factors <", value, "pm10Factors");
            return (Criteria) this;
        }

        public Criteria andPm10FactorsLessThanOrEqualTo(Double value) {
            addCriterion("pm10_factors <=", value, "pm10Factors");
            return (Criteria) this;
        }

        public Criteria andPm10FactorsIn(List<Double> values) {
            addCriterion("pm10_factors in", values, "pm10Factors");
            return (Criteria) this;
        }

        public Criteria andPm10FactorsNotIn(List<Double> values) {
            addCriterion("pm10_factors not in", values, "pm10Factors");
            return (Criteria) this;
        }

        public Criteria andPm10FactorsBetween(Double value1, Double value2) {
            addCriterion("pm10_factors between", value1, value2, "pm10Factors");
            return (Criteria) this;
        }

        public Criteria andPm10FactorsNotBetween(Double value1, Double value2) {
            addCriterion("pm10_factors not between", value1, value2, "pm10Factors");
            return (Criteria) this;
        }

        public Criteria andPm25FactorsIsNull() {
            addCriterion("pm25_factors is null");
            return (Criteria) this;
        }

        public Criteria andPm25FactorsIsNotNull() {
            addCriterion("pm25_factors is not null");
            return (Criteria) this;
        }

        public Criteria andPm25FactorsEqualTo(Double value) {
            addCriterion("pm25_factors =", value, "pm25Factors");
            return (Criteria) this;
        }

        public Criteria andPm25FactorsNotEqualTo(Double value) {
            addCriterion("pm25_factors <>", value, "pm25Factors");
            return (Criteria) this;
        }

        public Criteria andPm25FactorsGreaterThan(Double value) {
            addCriterion("pm25_factors >", value, "pm25Factors");
            return (Criteria) this;
        }

        public Criteria andPm25FactorsGreaterThanOrEqualTo(Double value) {
            addCriterion("pm25_factors >=", value, "pm25Factors");
            return (Criteria) this;
        }

        public Criteria andPm25FactorsLessThan(Double value) {
            addCriterion("pm25_factors <", value, "pm25Factors");
            return (Criteria) this;
        }

        public Criteria andPm25FactorsLessThanOrEqualTo(Double value) {
            addCriterion("pm25_factors <=", value, "pm25Factors");
            return (Criteria) this;
        }

        public Criteria andPm25FactorsIn(List<Double> values) {
            addCriterion("pm25_factors in", values, "pm25Factors");
            return (Criteria) this;
        }

        public Criteria andPm25FactorsNotIn(List<Double> values) {
            addCriterion("pm25_factors not in", values, "pm25Factors");
            return (Criteria) this;
        }

        public Criteria andPm25FactorsBetween(Double value1, Double value2) {
            addCriterion("pm25_factors between", value1, value2, "pm25Factors");
            return (Criteria) this;
        }

        public Criteria andPm25FactorsNotBetween(Double value1, Double value2) {
            addCriterion("pm25_factors not between", value1, value2, "pm25Factors");
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