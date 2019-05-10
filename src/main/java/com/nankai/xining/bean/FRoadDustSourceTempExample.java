package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class FRoadDustSourceTempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FRoadDustSourceTempExample() {
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

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
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

        public Criteria andCarFlowEqualTo(Integer value) {
            addCriterion("car_flow =", value, "carFlow");
            return (Criteria) this;
        }

        public Criteria andCarFlowNotEqualTo(Integer value) {
            addCriterion("car_flow <>", value, "carFlow");
            return (Criteria) this;
        }

        public Criteria andCarFlowGreaterThan(Integer value) {
            addCriterion("car_flow >", value, "carFlow");
            return (Criteria) this;
        }

        public Criteria andCarFlowGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_flow >=", value, "carFlow");
            return (Criteria) this;
        }

        public Criteria andCarFlowLessThan(Integer value) {
            addCriterion("car_flow <", value, "carFlow");
            return (Criteria) this;
        }

        public Criteria andCarFlowLessThanOrEqualTo(Integer value) {
            addCriterion("car_flow <=", value, "carFlow");
            return (Criteria) this;
        }

        public Criteria andCarFlowIn(List<Integer> values) {
            addCriterion("car_flow in", values, "carFlow");
            return (Criteria) this;
        }

        public Criteria andCarFlowNotIn(List<Integer> values) {
            addCriterion("car_flow not in", values, "carFlow");
            return (Criteria) this;
        }

        public Criteria andCarFlowBetween(Integer value1, Integer value2) {
            addCriterion("car_flow between", value1, value2, "carFlow");
            return (Criteria) this;
        }

        public Criteria andCarFlowNotBetween(Integer value1, Integer value2) {
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

        public Criteria andClearTimeInstallIsNull() {
            addCriterion("clear_time_install is null");
            return (Criteria) this;
        }

        public Criteria andClearTimeInstallIsNotNull() {
            addCriterion("clear_time_install is not null");
            return (Criteria) this;
        }

        public Criteria andClearTimeInstallEqualTo(Double value) {
            addCriterion("clear_time_install =", value, "clearTimeInstall");
            return (Criteria) this;
        }

        public Criteria andClearTimeInstallNotEqualTo(Double value) {
            addCriterion("clear_time_install <>", value, "clearTimeInstall");
            return (Criteria) this;
        }

        public Criteria andClearTimeInstallGreaterThan(Double value) {
            addCriterion("clear_time_install >", value, "clearTimeInstall");
            return (Criteria) this;
        }

        public Criteria andClearTimeInstallGreaterThanOrEqualTo(Double value) {
            addCriterion("clear_time_install >=", value, "clearTimeInstall");
            return (Criteria) this;
        }

        public Criteria andClearTimeInstallLessThan(Double value) {
            addCriterion("clear_time_install <", value, "clearTimeInstall");
            return (Criteria) this;
        }

        public Criteria andClearTimeInstallLessThanOrEqualTo(Double value) {
            addCriterion("clear_time_install <=", value, "clearTimeInstall");
            return (Criteria) this;
        }

        public Criteria andClearTimeInstallIn(List<Double> values) {
            addCriterion("clear_time_install in", values, "clearTimeInstall");
            return (Criteria) this;
        }

        public Criteria andClearTimeInstallNotIn(List<Double> values) {
            addCriterion("clear_time_install not in", values, "clearTimeInstall");
            return (Criteria) this;
        }

        public Criteria andClearTimeInstallBetween(Double value1, Double value2) {
            addCriterion("clear_time_install between", value1, value2, "clearTimeInstall");
            return (Criteria) this;
        }

        public Criteria andClearTimeInstallNotBetween(Double value1, Double value2) {
            addCriterion("clear_time_install not between", value1, value2, "clearTimeInstall");
            return (Criteria) this;
        }

        public Criteria andClearTimeUninstallIsNull() {
            addCriterion("clear_time_uninstall is null");
            return (Criteria) this;
        }

        public Criteria andClearTimeUninstallIsNotNull() {
            addCriterion("clear_time_uninstall is not null");
            return (Criteria) this;
        }

        public Criteria andClearTimeUninstallEqualTo(Double value) {
            addCriterion("clear_time_uninstall =", value, "clearTimeUninstall");
            return (Criteria) this;
        }

        public Criteria andClearTimeUninstallNotEqualTo(Double value) {
            addCriterion("clear_time_uninstall <>", value, "clearTimeUninstall");
            return (Criteria) this;
        }

        public Criteria andClearTimeUninstallGreaterThan(Double value) {
            addCriterion("clear_time_uninstall >", value, "clearTimeUninstall");
            return (Criteria) this;
        }

        public Criteria andClearTimeUninstallGreaterThanOrEqualTo(Double value) {
            addCriterion("clear_time_uninstall >=", value, "clearTimeUninstall");
            return (Criteria) this;
        }

        public Criteria andClearTimeUninstallLessThan(Double value) {
            addCriterion("clear_time_uninstall <", value, "clearTimeUninstall");
            return (Criteria) this;
        }

        public Criteria andClearTimeUninstallLessThanOrEqualTo(Double value) {
            addCriterion("clear_time_uninstall <=", value, "clearTimeUninstall");
            return (Criteria) this;
        }

        public Criteria andClearTimeUninstallIn(List<Double> values) {
            addCriterion("clear_time_uninstall in", values, "clearTimeUninstall");
            return (Criteria) this;
        }

        public Criteria andClearTimeUninstallNotIn(List<Double> values) {
            addCriterion("clear_time_uninstall not in", values, "clearTimeUninstall");
            return (Criteria) this;
        }

        public Criteria andClearTimeUninstallBetween(Double value1, Double value2) {
            addCriterion("clear_time_uninstall between", value1, value2, "clearTimeUninstall");
            return (Criteria) this;
        }

        public Criteria andClearTimeUninstallNotBetween(Double value1, Double value2) {
            addCriterion("clear_time_uninstall not between", value1, value2, "clearTimeUninstall");
            return (Criteria) this;
        }

        public Criteria andSweepSpringIsNull() {
            addCriterion("sweep_spring is null");
            return (Criteria) this;
        }

        public Criteria andSweepSpringIsNotNull() {
            addCriterion("sweep_spring is not null");
            return (Criteria) this;
        }

        public Criteria andSweepSpringEqualTo(Double value) {
            addCriterion("sweep_spring =", value, "sweepSpring");
            return (Criteria) this;
        }

        public Criteria andSweepSpringNotEqualTo(Double value) {
            addCriterion("sweep_spring <>", value, "sweepSpring");
            return (Criteria) this;
        }

        public Criteria andSweepSpringGreaterThan(Double value) {
            addCriterion("sweep_spring >", value, "sweepSpring");
            return (Criteria) this;
        }

        public Criteria andSweepSpringGreaterThanOrEqualTo(Double value) {
            addCriterion("sweep_spring >=", value, "sweepSpring");
            return (Criteria) this;
        }

        public Criteria andSweepSpringLessThan(Double value) {
            addCriterion("sweep_spring <", value, "sweepSpring");
            return (Criteria) this;
        }

        public Criteria andSweepSpringLessThanOrEqualTo(Double value) {
            addCriterion("sweep_spring <=", value, "sweepSpring");
            return (Criteria) this;
        }

        public Criteria andSweepSpringIn(List<Double> values) {
            addCriterion("sweep_spring in", values, "sweepSpring");
            return (Criteria) this;
        }

        public Criteria andSweepSpringNotIn(List<Double> values) {
            addCriterion("sweep_spring not in", values, "sweepSpring");
            return (Criteria) this;
        }

        public Criteria andSweepSpringBetween(Double value1, Double value2) {
            addCriterion("sweep_spring between", value1, value2, "sweepSpring");
            return (Criteria) this;
        }

        public Criteria andSweepSpringNotBetween(Double value1, Double value2) {
            addCriterion("sweep_spring not between", value1, value2, "sweepSpring");
            return (Criteria) this;
        }

        public Criteria andSweepSummerIsNull() {
            addCriterion("sweep_summer is null");
            return (Criteria) this;
        }

        public Criteria andSweepSummerIsNotNull() {
            addCriterion("sweep_summer is not null");
            return (Criteria) this;
        }

        public Criteria andSweepSummerEqualTo(Double value) {
            addCriterion("sweep_summer =", value, "sweepSummer");
            return (Criteria) this;
        }

        public Criteria andSweepSummerNotEqualTo(Double value) {
            addCriterion("sweep_summer <>", value, "sweepSummer");
            return (Criteria) this;
        }

        public Criteria andSweepSummerGreaterThan(Double value) {
            addCriterion("sweep_summer >", value, "sweepSummer");
            return (Criteria) this;
        }

        public Criteria andSweepSummerGreaterThanOrEqualTo(Double value) {
            addCriterion("sweep_summer >=", value, "sweepSummer");
            return (Criteria) this;
        }

        public Criteria andSweepSummerLessThan(Double value) {
            addCriterion("sweep_summer <", value, "sweepSummer");
            return (Criteria) this;
        }

        public Criteria andSweepSummerLessThanOrEqualTo(Double value) {
            addCriterion("sweep_summer <=", value, "sweepSummer");
            return (Criteria) this;
        }

        public Criteria andSweepSummerIn(List<Double> values) {
            addCriterion("sweep_summer in", values, "sweepSummer");
            return (Criteria) this;
        }

        public Criteria andSweepSummerNotIn(List<Double> values) {
            addCriterion("sweep_summer not in", values, "sweepSummer");
            return (Criteria) this;
        }

        public Criteria andSweepSummerBetween(Double value1, Double value2) {
            addCriterion("sweep_summer between", value1, value2, "sweepSummer");
            return (Criteria) this;
        }

        public Criteria andSweepSummerNotBetween(Double value1, Double value2) {
            addCriterion("sweep_summer not between", value1, value2, "sweepSummer");
            return (Criteria) this;
        }

        public Criteria andSweepFallIsNull() {
            addCriterion("sweep_fall is null");
            return (Criteria) this;
        }

        public Criteria andSweepFallIsNotNull() {
            addCriterion("sweep_fall is not null");
            return (Criteria) this;
        }

        public Criteria andSweepFallEqualTo(Double value) {
            addCriterion("sweep_fall =", value, "sweepFall");
            return (Criteria) this;
        }

        public Criteria andSweepFallNotEqualTo(Double value) {
            addCriterion("sweep_fall <>", value, "sweepFall");
            return (Criteria) this;
        }

        public Criteria andSweepFallGreaterThan(Double value) {
            addCriterion("sweep_fall >", value, "sweepFall");
            return (Criteria) this;
        }

        public Criteria andSweepFallGreaterThanOrEqualTo(Double value) {
            addCriterion("sweep_fall >=", value, "sweepFall");
            return (Criteria) this;
        }

        public Criteria andSweepFallLessThan(Double value) {
            addCriterion("sweep_fall <", value, "sweepFall");
            return (Criteria) this;
        }

        public Criteria andSweepFallLessThanOrEqualTo(Double value) {
            addCriterion("sweep_fall <=", value, "sweepFall");
            return (Criteria) this;
        }

        public Criteria andSweepFallIn(List<Double> values) {
            addCriterion("sweep_fall in", values, "sweepFall");
            return (Criteria) this;
        }

        public Criteria andSweepFallNotIn(List<Double> values) {
            addCriterion("sweep_fall not in", values, "sweepFall");
            return (Criteria) this;
        }

        public Criteria andSweepFallBetween(Double value1, Double value2) {
            addCriterion("sweep_fall between", value1, value2, "sweepFall");
            return (Criteria) this;
        }

        public Criteria andSweepFallNotBetween(Double value1, Double value2) {
            addCriterion("sweep_fall not between", value1, value2, "sweepFall");
            return (Criteria) this;
        }

        public Criteria andWaterTimesSpringIsNull() {
            addCriterion("water_times_spring is null");
            return (Criteria) this;
        }

        public Criteria andWaterTimesSpringIsNotNull() {
            addCriterion("water_times_spring is not null");
            return (Criteria) this;
        }

        public Criteria andWaterTimesSpringEqualTo(Double value) {
            addCriterion("water_times_spring =", value, "waterTimesSpring");
            return (Criteria) this;
        }

        public Criteria andWaterTimesSpringNotEqualTo(Double value) {
            addCriterion("water_times_spring <>", value, "waterTimesSpring");
            return (Criteria) this;
        }

        public Criteria andWaterTimesSpringGreaterThan(Double value) {
            addCriterion("water_times_spring >", value, "waterTimesSpring");
            return (Criteria) this;
        }

        public Criteria andWaterTimesSpringGreaterThanOrEqualTo(Double value) {
            addCriterion("water_times_spring >=", value, "waterTimesSpring");
            return (Criteria) this;
        }

        public Criteria andWaterTimesSpringLessThan(Double value) {
            addCriterion("water_times_spring <", value, "waterTimesSpring");
            return (Criteria) this;
        }

        public Criteria andWaterTimesSpringLessThanOrEqualTo(Double value) {
            addCriterion("water_times_spring <=", value, "waterTimesSpring");
            return (Criteria) this;
        }

        public Criteria andWaterTimesSpringIn(List<Double> values) {
            addCriterion("water_times_spring in", values, "waterTimesSpring");
            return (Criteria) this;
        }

        public Criteria andWaterTimesSpringNotIn(List<Double> values) {
            addCriterion("water_times_spring not in", values, "waterTimesSpring");
            return (Criteria) this;
        }

        public Criteria andWaterTimesSpringBetween(Double value1, Double value2) {
            addCriterion("water_times_spring between", value1, value2, "waterTimesSpring");
            return (Criteria) this;
        }

        public Criteria andWaterTimesSpringNotBetween(Double value1, Double value2) {
            addCriterion("water_times_spring not between", value1, value2, "waterTimesSpring");
            return (Criteria) this;
        }

        public Criteria andWaterTimesSummerIsNull() {
            addCriterion("water_times_summer is null");
            return (Criteria) this;
        }

        public Criteria andWaterTimesSummerIsNotNull() {
            addCriterion("water_times_summer is not null");
            return (Criteria) this;
        }

        public Criteria andWaterTimesSummerEqualTo(Double value) {
            addCriterion("water_times_summer =", value, "waterTimesSummer");
            return (Criteria) this;
        }

        public Criteria andWaterTimesSummerNotEqualTo(Double value) {
            addCriterion("water_times_summer <>", value, "waterTimesSummer");
            return (Criteria) this;
        }

        public Criteria andWaterTimesSummerGreaterThan(Double value) {
            addCriterion("water_times_summer >", value, "waterTimesSummer");
            return (Criteria) this;
        }

        public Criteria andWaterTimesSummerGreaterThanOrEqualTo(Double value) {
            addCriterion("water_times_summer >=", value, "waterTimesSummer");
            return (Criteria) this;
        }

        public Criteria andWaterTimesSummerLessThan(Double value) {
            addCriterion("water_times_summer <", value, "waterTimesSummer");
            return (Criteria) this;
        }

        public Criteria andWaterTimesSummerLessThanOrEqualTo(Double value) {
            addCriterion("water_times_summer <=", value, "waterTimesSummer");
            return (Criteria) this;
        }

        public Criteria andWaterTimesSummerIn(List<Double> values) {
            addCriterion("water_times_summer in", values, "waterTimesSummer");
            return (Criteria) this;
        }

        public Criteria andWaterTimesSummerNotIn(List<Double> values) {
            addCriterion("water_times_summer not in", values, "waterTimesSummer");
            return (Criteria) this;
        }

        public Criteria andWaterTimesSummerBetween(Double value1, Double value2) {
            addCriterion("water_times_summer between", value1, value2, "waterTimesSummer");
            return (Criteria) this;
        }

        public Criteria andWaterTimesSummerNotBetween(Double value1, Double value2) {
            addCriterion("water_times_summer not between", value1, value2, "waterTimesSummer");
            return (Criteria) this;
        }

        public Criteria andWaterTimesFallIsNull() {
            addCriterion("water_times_fall is null");
            return (Criteria) this;
        }

        public Criteria andWaterTimesFallIsNotNull() {
            addCriterion("water_times_fall is not null");
            return (Criteria) this;
        }

        public Criteria andWaterTimesFallEqualTo(Double value) {
            addCriterion("water_times_fall =", value, "waterTimesFall");
            return (Criteria) this;
        }

        public Criteria andWaterTimesFallNotEqualTo(Double value) {
            addCriterion("water_times_fall <>", value, "waterTimesFall");
            return (Criteria) this;
        }

        public Criteria andWaterTimesFallGreaterThan(Double value) {
            addCriterion("water_times_fall >", value, "waterTimesFall");
            return (Criteria) this;
        }

        public Criteria andWaterTimesFallGreaterThanOrEqualTo(Double value) {
            addCriterion("water_times_fall >=", value, "waterTimesFall");
            return (Criteria) this;
        }

        public Criteria andWaterTimesFallLessThan(Double value) {
            addCriterion("water_times_fall <", value, "waterTimesFall");
            return (Criteria) this;
        }

        public Criteria andWaterTimesFallLessThanOrEqualTo(Double value) {
            addCriterion("water_times_fall <=", value, "waterTimesFall");
            return (Criteria) this;
        }

        public Criteria andWaterTimesFallIn(List<Double> values) {
            addCriterion("water_times_fall in", values, "waterTimesFall");
            return (Criteria) this;
        }

        public Criteria andWaterTimesFallNotIn(List<Double> values) {
            addCriterion("water_times_fall not in", values, "waterTimesFall");
            return (Criteria) this;
        }

        public Criteria andWaterTimesFallBetween(Double value1, Double value2) {
            addCriterion("water_times_fall between", value1, value2, "waterTimesFall");
            return (Criteria) this;
        }

        public Criteria andWaterTimesFallNotBetween(Double value1, Double value2) {
            addCriterion("water_times_fall not between", value1, value2, "waterTimesFall");
            return (Criteria) this;
        }

        public Criteria andDustSuppressionIsNull() {
            addCriterion("dust_suppression is null");
            return (Criteria) this;
        }

        public Criteria andDustSuppressionIsNotNull() {
            addCriterion("dust_suppression is not null");
            return (Criteria) this;
        }

        public Criteria andDustSuppressionEqualTo(Integer value) {
            addCriterion("dust_suppression =", value, "dustSuppression");
            return (Criteria) this;
        }

        public Criteria andDustSuppressionNotEqualTo(Integer value) {
            addCriterion("dust_suppression <>", value, "dustSuppression");
            return (Criteria) this;
        }

        public Criteria andDustSuppressionGreaterThan(Integer value) {
            addCriterion("dust_suppression >", value, "dustSuppression");
            return (Criteria) this;
        }

        public Criteria andDustSuppressionGreaterThanOrEqualTo(Integer value) {
            addCriterion("dust_suppression >=", value, "dustSuppression");
            return (Criteria) this;
        }

        public Criteria andDustSuppressionLessThan(Integer value) {
            addCriterion("dust_suppression <", value, "dustSuppression");
            return (Criteria) this;
        }

        public Criteria andDustSuppressionLessThanOrEqualTo(Integer value) {
            addCriterion("dust_suppression <=", value, "dustSuppression");
            return (Criteria) this;
        }

        public Criteria andDustSuppressionIn(List<Integer> values) {
            addCriterion("dust_suppression in", values, "dustSuppression");
            return (Criteria) this;
        }

        public Criteria andDustSuppressionNotIn(List<Integer> values) {
            addCriterion("dust_suppression not in", values, "dustSuppression");
            return (Criteria) this;
        }

        public Criteria andDustSuppressionBetween(Integer value1, Integer value2) {
            addCriterion("dust_suppression between", value1, value2, "dustSuppression");
            return (Criteria) this;
        }

        public Criteria andDustSuppressionNotBetween(Integer value1, Integer value2) {
            addCriterion("dust_suppression not between", value1, value2, "dustSuppression");
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