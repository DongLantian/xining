package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class XjroaddustExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XjroaddustExample() {
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

        public Criteria andRdIdIsNull() {
            addCriterion("rd_id is null");
            return (Criteria) this;
        }

        public Criteria andRdIdIsNotNull() {
            addCriterion("rd_id is not null");
            return (Criteria) this;
        }

        public Criteria andRdIdEqualTo(Integer value) {
            addCriterion("rd_id =", value, "rdId");
            return (Criteria) this;
        }

        public Criteria andRdIdNotEqualTo(Integer value) {
            addCriterion("rd_id <>", value, "rdId");
            return (Criteria) this;
        }

        public Criteria andRdIdGreaterThan(Integer value) {
            addCriterion("rd_id >", value, "rdId");
            return (Criteria) this;
        }

        public Criteria andRdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rd_id >=", value, "rdId");
            return (Criteria) this;
        }

        public Criteria andRdIdLessThan(Integer value) {
            addCriterion("rd_id <", value, "rdId");
            return (Criteria) this;
        }

        public Criteria andRdIdLessThanOrEqualTo(Integer value) {
            addCriterion("rd_id <=", value, "rdId");
            return (Criteria) this;
        }

        public Criteria andRdIdIn(List<Integer> values) {
            addCriterion("rd_id in", values, "rdId");
            return (Criteria) this;
        }

        public Criteria andRdIdNotIn(List<Integer> values) {
            addCriterion("rd_id not in", values, "rdId");
            return (Criteria) this;
        }

        public Criteria andRdIdBetween(Integer value1, Integer value2) {
            addCriterion("rd_id between", value1, value2, "rdId");
            return (Criteria) this;
        }

        public Criteria andRdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rd_id not between", value1, value2, "rdId");
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

        public Criteria andPathnameIsNull() {
            addCriterion("pathname is null");
            return (Criteria) this;
        }

        public Criteria andPathnameIsNotNull() {
            addCriterion("pathname is not null");
            return (Criteria) this;
        }

        public Criteria andPathnameEqualTo(String value) {
            addCriterion("pathname =", value, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameNotEqualTo(String value) {
            addCriterion("pathname <>", value, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameGreaterThan(String value) {
            addCriterion("pathname >", value, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameGreaterThanOrEqualTo(String value) {
            addCriterion("pathname >=", value, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameLessThan(String value) {
            addCriterion("pathname <", value, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameLessThanOrEqualTo(String value) {
            addCriterion("pathname <=", value, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameLike(String value) {
            addCriterion("pathname like", value, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameNotLike(String value) {
            addCriterion("pathname not like", value, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameIn(List<String> values) {
            addCriterion("pathname in", values, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameNotIn(List<String> values) {
            addCriterion("pathname not in", values, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameBetween(String value1, String value2) {
            addCriterion("pathname between", value1, value2, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameNotBetween(String value1, String value2) {
            addCriterion("pathname not between", value1, value2, "pathname");
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

        public Criteria andRoadtypeIsNull() {
            addCriterion("roadtype is null");
            return (Criteria) this;
        }

        public Criteria andRoadtypeIsNotNull() {
            addCriterion("roadtype is not null");
            return (Criteria) this;
        }

        public Criteria andRoadtypeEqualTo(String value) {
            addCriterion("roadtype =", value, "roadtype");
            return (Criteria) this;
        }

        public Criteria andRoadtypeNotEqualTo(String value) {
            addCriterion("roadtype <>", value, "roadtype");
            return (Criteria) this;
        }

        public Criteria andRoadtypeGreaterThan(String value) {
            addCriterion("roadtype >", value, "roadtype");
            return (Criteria) this;
        }

        public Criteria andRoadtypeGreaterThanOrEqualTo(String value) {
            addCriterion("roadtype >=", value, "roadtype");
            return (Criteria) this;
        }

        public Criteria andRoadtypeLessThan(String value) {
            addCriterion("roadtype <", value, "roadtype");
            return (Criteria) this;
        }

        public Criteria andRoadtypeLessThanOrEqualTo(String value) {
            addCriterion("roadtype <=", value, "roadtype");
            return (Criteria) this;
        }

        public Criteria andRoadtypeLike(String value) {
            addCriterion("roadtype like", value, "roadtype");
            return (Criteria) this;
        }

        public Criteria andRoadtypeNotLike(String value) {
            addCriterion("roadtype not like", value, "roadtype");
            return (Criteria) this;
        }

        public Criteria andRoadtypeIn(List<String> values) {
            addCriterion("roadtype in", values, "roadtype");
            return (Criteria) this;
        }

        public Criteria andRoadtypeNotIn(List<String> values) {
            addCriterion("roadtype not in", values, "roadtype");
            return (Criteria) this;
        }

        public Criteria andRoadtypeBetween(String value1, String value2) {
            addCriterion("roadtype between", value1, value2, "roadtype");
            return (Criteria) this;
        }

        public Criteria andRoadtypeNotBetween(String value1, String value2) {
            addCriterion("roadtype not between", value1, value2, "roadtype");
            return (Criteria) this;
        }

        public Criteria andPathlengthIsNull() {
            addCriterion("pathlength is null");
            return (Criteria) this;
        }

        public Criteria andPathlengthIsNotNull() {
            addCriterion("pathlength is not null");
            return (Criteria) this;
        }

        public Criteria andPathlengthEqualTo(Double value) {
            addCriterion("pathlength =", value, "pathlength");
            return (Criteria) this;
        }

        public Criteria andPathlengthNotEqualTo(Double value) {
            addCriterion("pathlength <>", value, "pathlength");
            return (Criteria) this;
        }

        public Criteria andPathlengthGreaterThan(Double value) {
            addCriterion("pathlength >", value, "pathlength");
            return (Criteria) this;
        }

        public Criteria andPathlengthGreaterThanOrEqualTo(Double value) {
            addCriterion("pathlength >=", value, "pathlength");
            return (Criteria) this;
        }

        public Criteria andPathlengthLessThan(Double value) {
            addCriterion("pathlength <", value, "pathlength");
            return (Criteria) this;
        }

        public Criteria andPathlengthLessThanOrEqualTo(Double value) {
            addCriterion("pathlength <=", value, "pathlength");
            return (Criteria) this;
        }

        public Criteria andPathlengthIn(List<Double> values) {
            addCriterion("pathlength in", values, "pathlength");
            return (Criteria) this;
        }

        public Criteria andPathlengthNotIn(List<Double> values) {
            addCriterion("pathlength not in", values, "pathlength");
            return (Criteria) this;
        }

        public Criteria andPathlengthBetween(Double value1, Double value2) {
            addCriterion("pathlength between", value1, value2, "pathlength");
            return (Criteria) this;
        }

        public Criteria andPathlengthNotBetween(Double value1, Double value2) {
            addCriterion("pathlength not between", value1, value2, "pathlength");
            return (Criteria) this;
        }

        public Criteria andAverwidthIsNull() {
            addCriterion("averwidth is null");
            return (Criteria) this;
        }

        public Criteria andAverwidthIsNotNull() {
            addCriterion("averwidth is not null");
            return (Criteria) this;
        }

        public Criteria andAverwidthEqualTo(Double value) {
            addCriterion("averwidth =", value, "averwidth");
            return (Criteria) this;
        }

        public Criteria andAverwidthNotEqualTo(Double value) {
            addCriterion("averwidth <>", value, "averwidth");
            return (Criteria) this;
        }

        public Criteria andAverwidthGreaterThan(Double value) {
            addCriterion("averwidth >", value, "averwidth");
            return (Criteria) this;
        }

        public Criteria andAverwidthGreaterThanOrEqualTo(Double value) {
            addCriterion("averwidth >=", value, "averwidth");
            return (Criteria) this;
        }

        public Criteria andAverwidthLessThan(Double value) {
            addCriterion("averwidth <", value, "averwidth");
            return (Criteria) this;
        }

        public Criteria andAverwidthLessThanOrEqualTo(Double value) {
            addCriterion("averwidth <=", value, "averwidth");
            return (Criteria) this;
        }

        public Criteria andAverwidthIn(List<Double> values) {
            addCriterion("averwidth in", values, "averwidth");
            return (Criteria) this;
        }

        public Criteria andAverwidthNotIn(List<Double> values) {
            addCriterion("averwidth not in", values, "averwidth");
            return (Criteria) this;
        }

        public Criteria andAverwidthBetween(Double value1, Double value2) {
            addCriterion("averwidth between", value1, value2, "averwidth");
            return (Criteria) this;
        }

        public Criteria andAverwidthNotBetween(Double value1, Double value2) {
            addCriterion("averwidth not between", value1, value2, "averwidth");
            return (Criteria) this;
        }

        public Criteria andAverweightIsNull() {
            addCriterion("averweight is null");
            return (Criteria) this;
        }

        public Criteria andAverweightIsNotNull() {
            addCriterion("averweight is not null");
            return (Criteria) this;
        }

        public Criteria andAverweightEqualTo(Double value) {
            addCriterion("averweight =", value, "averweight");
            return (Criteria) this;
        }

        public Criteria andAverweightNotEqualTo(Double value) {
            addCriterion("averweight <>", value, "averweight");
            return (Criteria) this;
        }

        public Criteria andAverweightGreaterThan(Double value) {
            addCriterion("averweight >", value, "averweight");
            return (Criteria) this;
        }

        public Criteria andAverweightGreaterThanOrEqualTo(Double value) {
            addCriterion("averweight >=", value, "averweight");
            return (Criteria) this;
        }

        public Criteria andAverweightLessThan(Double value) {
            addCriterion("averweight <", value, "averweight");
            return (Criteria) this;
        }

        public Criteria andAverweightLessThanOrEqualTo(Double value) {
            addCriterion("averweight <=", value, "averweight");
            return (Criteria) this;
        }

        public Criteria andAverweightIn(List<Double> values) {
            addCriterion("averweight in", values, "averweight");
            return (Criteria) this;
        }

        public Criteria andAverweightNotIn(List<Double> values) {
            addCriterion("averweight not in", values, "averweight");
            return (Criteria) this;
        }

        public Criteria andAverweightBetween(Double value1, Double value2) {
            addCriterion("averweight between", value1, value2, "averweight");
            return (Criteria) this;
        }

        public Criteria andAverweightNotBetween(Double value1, Double value2) {
            addCriterion("averweight not between", value1, value2, "averweight");
            return (Criteria) this;
        }

        public Criteria andCarflowIsNull() {
            addCriterion("carflow is null");
            return (Criteria) this;
        }

        public Criteria andCarflowIsNotNull() {
            addCriterion("carflow is not null");
            return (Criteria) this;
        }

        public Criteria andCarflowEqualTo(Double value) {
            addCriterion("carflow =", value, "carflow");
            return (Criteria) this;
        }

        public Criteria andCarflowNotEqualTo(Double value) {
            addCriterion("carflow <>", value, "carflow");
            return (Criteria) this;
        }

        public Criteria andCarflowGreaterThan(Double value) {
            addCriterion("carflow >", value, "carflow");
            return (Criteria) this;
        }

        public Criteria andCarflowGreaterThanOrEqualTo(Double value) {
            addCriterion("carflow >=", value, "carflow");
            return (Criteria) this;
        }

        public Criteria andCarflowLessThan(Double value) {
            addCriterion("carflow <", value, "carflow");
            return (Criteria) this;
        }

        public Criteria andCarflowLessThanOrEqualTo(Double value) {
            addCriterion("carflow <=", value, "carflow");
            return (Criteria) this;
        }

        public Criteria andCarflowIn(List<Double> values) {
            addCriterion("carflow in", values, "carflow");
            return (Criteria) this;
        }

        public Criteria andCarflowNotIn(List<Double> values) {
            addCriterion("carflow not in", values, "carflow");
            return (Criteria) this;
        }

        public Criteria andCarflowBetween(Double value1, Double value2) {
            addCriterion("carflow between", value1, value2, "carflow");
            return (Criteria) this;
        }

        public Criteria andCarflowNotBetween(Double value1, Double value2) {
            addCriterion("carflow not between", value1, value2, "carflow");
            return (Criteria) this;
        }

        public Criteria andAverspeedIsNull() {
            addCriterion("averspeed is null");
            return (Criteria) this;
        }

        public Criteria andAverspeedIsNotNull() {
            addCriterion("averspeed is not null");
            return (Criteria) this;
        }

        public Criteria andAverspeedEqualTo(Double value) {
            addCriterion("averspeed =", value, "averspeed");
            return (Criteria) this;
        }

        public Criteria andAverspeedNotEqualTo(Double value) {
            addCriterion("averspeed <>", value, "averspeed");
            return (Criteria) this;
        }

        public Criteria andAverspeedGreaterThan(Double value) {
            addCriterion("averspeed >", value, "averspeed");
            return (Criteria) this;
        }

        public Criteria andAverspeedGreaterThanOrEqualTo(Double value) {
            addCriterion("averspeed >=", value, "averspeed");
            return (Criteria) this;
        }

        public Criteria andAverspeedLessThan(Double value) {
            addCriterion("averspeed <", value, "averspeed");
            return (Criteria) this;
        }

        public Criteria andAverspeedLessThanOrEqualTo(Double value) {
            addCriterion("averspeed <=", value, "averspeed");
            return (Criteria) this;
        }

        public Criteria andAverspeedIn(List<Double> values) {
            addCriterion("averspeed in", values, "averspeed");
            return (Criteria) this;
        }

        public Criteria andAverspeedNotIn(List<Double> values) {
            addCriterion("averspeed not in", values, "averspeed");
            return (Criteria) this;
        }

        public Criteria andAverspeedBetween(Double value1, Double value2) {
            addCriterion("averspeed between", value1, value2, "averspeed");
            return (Criteria) this;
        }

        public Criteria andAverspeedNotBetween(Double value1, Double value2) {
            addCriterion("averspeed not between", value1, value2, "averspeed");
            return (Criteria) this;
        }

        public Criteria andDirtratioIsNull() {
            addCriterion("dirtratio is null");
            return (Criteria) this;
        }

        public Criteria andDirtratioIsNotNull() {
            addCriterion("dirtratio is not null");
            return (Criteria) this;
        }

        public Criteria andDirtratioEqualTo(Double value) {
            addCriterion("dirtratio =", value, "dirtratio");
            return (Criteria) this;
        }

        public Criteria andDirtratioNotEqualTo(Double value) {
            addCriterion("dirtratio <>", value, "dirtratio");
            return (Criteria) this;
        }

        public Criteria andDirtratioGreaterThan(Double value) {
            addCriterion("dirtratio >", value, "dirtratio");
            return (Criteria) this;
        }

        public Criteria andDirtratioGreaterThanOrEqualTo(Double value) {
            addCriterion("dirtratio >=", value, "dirtratio");
            return (Criteria) this;
        }

        public Criteria andDirtratioLessThan(Double value) {
            addCriterion("dirtratio <", value, "dirtratio");
            return (Criteria) this;
        }

        public Criteria andDirtratioLessThanOrEqualTo(Double value) {
            addCriterion("dirtratio <=", value, "dirtratio");
            return (Criteria) this;
        }

        public Criteria andDirtratioIn(List<Double> values) {
            addCriterion("dirtratio in", values, "dirtratio");
            return (Criteria) this;
        }

        public Criteria andDirtratioNotIn(List<Double> values) {
            addCriterion("dirtratio not in", values, "dirtratio");
            return (Criteria) this;
        }

        public Criteria andDirtratioBetween(Double value1, Double value2) {
            addCriterion("dirtratio between", value1, value2, "dirtratio");
            return (Criteria) this;
        }

        public Criteria andDirtratioNotBetween(Double value1, Double value2) {
            addCriterion("dirtratio not between", value1, value2, "dirtratio");
            return (Criteria) this;
        }

        public Criteria andWaterratioIsNull() {
            addCriterion("waterratio is null");
            return (Criteria) this;
        }

        public Criteria andWaterratioIsNotNull() {
            addCriterion("waterratio is not null");
            return (Criteria) this;
        }

        public Criteria andWaterratioEqualTo(Double value) {
            addCriterion("waterratio =", value, "waterratio");
            return (Criteria) this;
        }

        public Criteria andWaterratioNotEqualTo(Double value) {
            addCriterion("waterratio <>", value, "waterratio");
            return (Criteria) this;
        }

        public Criteria andWaterratioGreaterThan(Double value) {
            addCriterion("waterratio >", value, "waterratio");
            return (Criteria) this;
        }

        public Criteria andWaterratioGreaterThanOrEqualTo(Double value) {
            addCriterion("waterratio >=", value, "waterratio");
            return (Criteria) this;
        }

        public Criteria andWaterratioLessThan(Double value) {
            addCriterion("waterratio <", value, "waterratio");
            return (Criteria) this;
        }

        public Criteria andWaterratioLessThanOrEqualTo(Double value) {
            addCriterion("waterratio <=", value, "waterratio");
            return (Criteria) this;
        }

        public Criteria andWaterratioIn(List<Double> values) {
            addCriterion("waterratio in", values, "waterratio");
            return (Criteria) this;
        }

        public Criteria andWaterratioNotIn(List<Double> values) {
            addCriterion("waterratio not in", values, "waterratio");
            return (Criteria) this;
        }

        public Criteria andWaterratioBetween(Double value1, Double value2) {
            addCriterion("waterratio between", value1, value2, "waterratio");
            return (Criteria) this;
        }

        public Criteria andWaterratioNotBetween(Double value1, Double value2) {
            addCriterion("waterratio not between", value1, value2, "waterratio");
            return (Criteria) this;
        }

        public Criteria andRoadloadIsNull() {
            addCriterion("roadload is null");
            return (Criteria) this;
        }

        public Criteria andRoadloadIsNotNull() {
            addCriterion("roadload is not null");
            return (Criteria) this;
        }

        public Criteria andRoadloadEqualTo(Double value) {
            addCriterion("roadload =", value, "roadload");
            return (Criteria) this;
        }

        public Criteria andRoadloadNotEqualTo(Double value) {
            addCriterion("roadload <>", value, "roadload");
            return (Criteria) this;
        }

        public Criteria andRoadloadGreaterThan(Double value) {
            addCriterion("roadload >", value, "roadload");
            return (Criteria) this;
        }

        public Criteria andRoadloadGreaterThanOrEqualTo(Double value) {
            addCriterion("roadload >=", value, "roadload");
            return (Criteria) this;
        }

        public Criteria andRoadloadLessThan(Double value) {
            addCriterion("roadload <", value, "roadload");
            return (Criteria) this;
        }

        public Criteria andRoadloadLessThanOrEqualTo(Double value) {
            addCriterion("roadload <=", value, "roadload");
            return (Criteria) this;
        }

        public Criteria andRoadloadIn(List<Double> values) {
            addCriterion("roadload in", values, "roadload");
            return (Criteria) this;
        }

        public Criteria andRoadloadNotIn(List<Double> values) {
            addCriterion("roadload not in", values, "roadload");
            return (Criteria) this;
        }

        public Criteria andRoadloadBetween(Double value1, Double value2) {
            addCriterion("roadload between", value1, value2, "roadload");
            return (Criteria) this;
        }

        public Criteria andRoadloadNotBetween(Double value1, Double value2) {
            addCriterion("roadload not between", value1, value2, "roadload");
            return (Criteria) this;
        }

        public Criteria andControlnameIsNull() {
            addCriterion("controlname is null");
            return (Criteria) this;
        }

        public Criteria andControlnameIsNotNull() {
            addCriterion("controlname is not null");
            return (Criteria) this;
        }

        public Criteria andControlnameEqualTo(String value) {
            addCriterion("controlname =", value, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameNotEqualTo(String value) {
            addCriterion("controlname <>", value, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameGreaterThan(String value) {
            addCriterion("controlname >", value, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameGreaterThanOrEqualTo(String value) {
            addCriterion("controlname >=", value, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameLessThan(String value) {
            addCriterion("controlname <", value, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameLessThanOrEqualTo(String value) {
            addCriterion("controlname <=", value, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameLike(String value) {
            addCriterion("controlname like", value, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameNotLike(String value) {
            addCriterion("controlname not like", value, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameIn(List<String> values) {
            addCriterion("controlname in", values, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameNotIn(List<String> values) {
            addCriterion("controlname not in", values, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameBetween(String value1, String value2) {
            addCriterion("controlname between", value1, value2, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameNotBetween(String value1, String value2) {
            addCriterion("controlname not between", value1, value2, "controlname");
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

        public Criteria andPm25MaxIsNull() {
            addCriterion("pm25_max is null");
            return (Criteria) this;
        }

        public Criteria andPm25MaxIsNotNull() {
            addCriterion("pm25_max is not null");
            return (Criteria) this;
        }

        public Criteria andPm25MaxEqualTo(Double value) {
            addCriterion("pm25_max =", value, "pm25Max");
            return (Criteria) this;
        }

        public Criteria andPm25MaxNotEqualTo(Double value) {
            addCriterion("pm25_max <>", value, "pm25Max");
            return (Criteria) this;
        }

        public Criteria andPm25MaxGreaterThan(Double value) {
            addCriterion("pm25_max >", value, "pm25Max");
            return (Criteria) this;
        }

        public Criteria andPm25MaxGreaterThanOrEqualTo(Double value) {
            addCriterion("pm25_max >=", value, "pm25Max");
            return (Criteria) this;
        }

        public Criteria andPm25MaxLessThan(Double value) {
            addCriterion("pm25_max <", value, "pm25Max");
            return (Criteria) this;
        }

        public Criteria andPm25MaxLessThanOrEqualTo(Double value) {
            addCriterion("pm25_max <=", value, "pm25Max");
            return (Criteria) this;
        }

        public Criteria andPm25MaxIn(List<Double> values) {
            addCriterion("pm25_max in", values, "pm25Max");
            return (Criteria) this;
        }

        public Criteria andPm25MaxNotIn(List<Double> values) {
            addCriterion("pm25_max not in", values, "pm25Max");
            return (Criteria) this;
        }

        public Criteria andPm25MaxBetween(Double value1, Double value2) {
            addCriterion("pm25_max between", value1, value2, "pm25Max");
            return (Criteria) this;
        }

        public Criteria andPm25MaxNotBetween(Double value1, Double value2) {
            addCriterion("pm25_max not between", value1, value2, "pm25Max");
            return (Criteria) this;
        }

        public Criteria andPm10MaxIsNull() {
            addCriterion("pm10_max is null");
            return (Criteria) this;
        }

        public Criteria andPm10MaxIsNotNull() {
            addCriterion("pm10_max is not null");
            return (Criteria) this;
        }

        public Criteria andPm10MaxEqualTo(Double value) {
            addCriterion("pm10_max =", value, "pm10Max");
            return (Criteria) this;
        }

        public Criteria andPm10MaxNotEqualTo(Double value) {
            addCriterion("pm10_max <>", value, "pm10Max");
            return (Criteria) this;
        }

        public Criteria andPm10MaxGreaterThan(Double value) {
            addCriterion("pm10_max >", value, "pm10Max");
            return (Criteria) this;
        }

        public Criteria andPm10MaxGreaterThanOrEqualTo(Double value) {
            addCriterion("pm10_max >=", value, "pm10Max");
            return (Criteria) this;
        }

        public Criteria andPm10MaxLessThan(Double value) {
            addCriterion("pm10_max <", value, "pm10Max");
            return (Criteria) this;
        }

        public Criteria andPm10MaxLessThanOrEqualTo(Double value) {
            addCriterion("pm10_max <=", value, "pm10Max");
            return (Criteria) this;
        }

        public Criteria andPm10MaxIn(List<Double> values) {
            addCriterion("pm10_max in", values, "pm10Max");
            return (Criteria) this;
        }

        public Criteria andPm10MaxNotIn(List<Double> values) {
            addCriterion("pm10_max not in", values, "pm10Max");
            return (Criteria) this;
        }

        public Criteria andPm10MaxBetween(Double value1, Double value2) {
            addCriterion("pm10_max between", value1, value2, "pm10Max");
            return (Criteria) this;
        }

        public Criteria andPm10MaxNotBetween(Double value1, Double value2) {
            addCriterion("pm10_max not between", value1, value2, "pm10Max");
            return (Criteria) this;
        }

        public Criteria andVocMaxIsNull() {
            addCriterion("voc_max is null");
            return (Criteria) this;
        }

        public Criteria andVocMaxIsNotNull() {
            addCriterion("voc_max is not null");
            return (Criteria) this;
        }

        public Criteria andVocMaxEqualTo(Double value) {
            addCriterion("voc_max =", value, "vocMax");
            return (Criteria) this;
        }

        public Criteria andVocMaxNotEqualTo(Double value) {
            addCriterion("voc_max <>", value, "vocMax");
            return (Criteria) this;
        }

        public Criteria andVocMaxGreaterThan(Double value) {
            addCriterion("voc_max >", value, "vocMax");
            return (Criteria) this;
        }

        public Criteria andVocMaxGreaterThanOrEqualTo(Double value) {
            addCriterion("voc_max >=", value, "vocMax");
            return (Criteria) this;
        }

        public Criteria andVocMaxLessThan(Double value) {
            addCriterion("voc_max <", value, "vocMax");
            return (Criteria) this;
        }

        public Criteria andVocMaxLessThanOrEqualTo(Double value) {
            addCriterion("voc_max <=", value, "vocMax");
            return (Criteria) this;
        }

        public Criteria andVocMaxIn(List<Double> values) {
            addCriterion("voc_max in", values, "vocMax");
            return (Criteria) this;
        }

        public Criteria andVocMaxNotIn(List<Double> values) {
            addCriterion("voc_max not in", values, "vocMax");
            return (Criteria) this;
        }

        public Criteria andVocMaxBetween(Double value1, Double value2) {
            addCriterion("voc_max between", value1, value2, "vocMax");
            return (Criteria) this;
        }

        public Criteria andVocMaxNotBetween(Double value1, Double value2) {
            addCriterion("voc_max not between", value1, value2, "vocMax");
            return (Criteria) this;
        }

        public Criteria andNh3MaxIsNull() {
            addCriterion("nh3_max is null");
            return (Criteria) this;
        }

        public Criteria andNh3MaxIsNotNull() {
            addCriterion("nh3_max is not null");
            return (Criteria) this;
        }

        public Criteria andNh3MaxEqualTo(Double value) {
            addCriterion("nh3_max =", value, "nh3Max");
            return (Criteria) this;
        }

        public Criteria andNh3MaxNotEqualTo(Double value) {
            addCriterion("nh3_max <>", value, "nh3Max");
            return (Criteria) this;
        }

        public Criteria andNh3MaxGreaterThan(Double value) {
            addCriterion("nh3_max >", value, "nh3Max");
            return (Criteria) this;
        }

        public Criteria andNh3MaxGreaterThanOrEqualTo(Double value) {
            addCriterion("nh3_max >=", value, "nh3Max");
            return (Criteria) this;
        }

        public Criteria andNh3MaxLessThan(Double value) {
            addCriterion("nh3_max <", value, "nh3Max");
            return (Criteria) this;
        }

        public Criteria andNh3MaxLessThanOrEqualTo(Double value) {
            addCriterion("nh3_max <=", value, "nh3Max");
            return (Criteria) this;
        }

        public Criteria andNh3MaxIn(List<Double> values) {
            addCriterion("nh3_max in", values, "nh3Max");
            return (Criteria) this;
        }

        public Criteria andNh3MaxNotIn(List<Double> values) {
            addCriterion("nh3_max not in", values, "nh3Max");
            return (Criteria) this;
        }

        public Criteria andNh3MaxBetween(Double value1, Double value2) {
            addCriterion("nh3_max between", value1, value2, "nh3Max");
            return (Criteria) this;
        }

        public Criteria andNh3MaxNotBetween(Double value1, Double value2) {
            addCriterion("nh3_max not between", value1, value2, "nh3Max");
            return (Criteria) this;
        }

        public Criteria andSo2MaxIsNull() {
            addCriterion("so2_max is null");
            return (Criteria) this;
        }

        public Criteria andSo2MaxIsNotNull() {
            addCriterion("so2_max is not null");
            return (Criteria) this;
        }

        public Criteria andSo2MaxEqualTo(Double value) {
            addCriterion("so2_max =", value, "so2Max");
            return (Criteria) this;
        }

        public Criteria andSo2MaxNotEqualTo(Double value) {
            addCriterion("so2_max <>", value, "so2Max");
            return (Criteria) this;
        }

        public Criteria andSo2MaxGreaterThan(Double value) {
            addCriterion("so2_max >", value, "so2Max");
            return (Criteria) this;
        }

        public Criteria andSo2MaxGreaterThanOrEqualTo(Double value) {
            addCriterion("so2_max >=", value, "so2Max");
            return (Criteria) this;
        }

        public Criteria andSo2MaxLessThan(Double value) {
            addCriterion("so2_max <", value, "so2Max");
            return (Criteria) this;
        }

        public Criteria andSo2MaxLessThanOrEqualTo(Double value) {
            addCriterion("so2_max <=", value, "so2Max");
            return (Criteria) this;
        }

        public Criteria andSo2MaxIn(List<Double> values) {
            addCriterion("so2_max in", values, "so2Max");
            return (Criteria) this;
        }

        public Criteria andSo2MaxNotIn(List<Double> values) {
            addCriterion("so2_max not in", values, "so2Max");
            return (Criteria) this;
        }

        public Criteria andSo2MaxBetween(Double value1, Double value2) {
            addCriterion("so2_max between", value1, value2, "so2Max");
            return (Criteria) this;
        }

        public Criteria andSo2MaxNotBetween(Double value1, Double value2) {
            addCriterion("so2_max not between", value1, value2, "so2Max");
            return (Criteria) this;
        }

        public Criteria andCoMaxIsNull() {
            addCriterion("co_max is null");
            return (Criteria) this;
        }

        public Criteria andCoMaxIsNotNull() {
            addCriterion("co_max is not null");
            return (Criteria) this;
        }

        public Criteria andCoMaxEqualTo(Double value) {
            addCriterion("co_max =", value, "coMax");
            return (Criteria) this;
        }

        public Criteria andCoMaxNotEqualTo(Double value) {
            addCriterion("co_max <>", value, "coMax");
            return (Criteria) this;
        }

        public Criteria andCoMaxGreaterThan(Double value) {
            addCriterion("co_max >", value, "coMax");
            return (Criteria) this;
        }

        public Criteria andCoMaxGreaterThanOrEqualTo(Double value) {
            addCriterion("co_max >=", value, "coMax");
            return (Criteria) this;
        }

        public Criteria andCoMaxLessThan(Double value) {
            addCriterion("co_max <", value, "coMax");
            return (Criteria) this;
        }

        public Criteria andCoMaxLessThanOrEqualTo(Double value) {
            addCriterion("co_max <=", value, "coMax");
            return (Criteria) this;
        }

        public Criteria andCoMaxIn(List<Double> values) {
            addCriterion("co_max in", values, "coMax");
            return (Criteria) this;
        }

        public Criteria andCoMaxNotIn(List<Double> values) {
            addCriterion("co_max not in", values, "coMax");
            return (Criteria) this;
        }

        public Criteria andCoMaxBetween(Double value1, Double value2) {
            addCriterion("co_max between", value1, value2, "coMax");
            return (Criteria) this;
        }

        public Criteria andCoMaxNotBetween(Double value1, Double value2) {
            addCriterion("co_max not between", value1, value2, "coMax");
            return (Criteria) this;
        }

        public Criteria andOcMaxIsNull() {
            addCriterion("oc_max is null");
            return (Criteria) this;
        }

        public Criteria andOcMaxIsNotNull() {
            addCriterion("oc_max is not null");
            return (Criteria) this;
        }

        public Criteria andOcMaxEqualTo(Double value) {
            addCriterion("oc_max =", value, "ocMax");
            return (Criteria) this;
        }

        public Criteria andOcMaxNotEqualTo(Double value) {
            addCriterion("oc_max <>", value, "ocMax");
            return (Criteria) this;
        }

        public Criteria andOcMaxGreaterThan(Double value) {
            addCriterion("oc_max >", value, "ocMax");
            return (Criteria) this;
        }

        public Criteria andOcMaxGreaterThanOrEqualTo(Double value) {
            addCriterion("oc_max >=", value, "ocMax");
            return (Criteria) this;
        }

        public Criteria andOcMaxLessThan(Double value) {
            addCriterion("oc_max <", value, "ocMax");
            return (Criteria) this;
        }

        public Criteria andOcMaxLessThanOrEqualTo(Double value) {
            addCriterion("oc_max <=", value, "ocMax");
            return (Criteria) this;
        }

        public Criteria andOcMaxIn(List<Double> values) {
            addCriterion("oc_max in", values, "ocMax");
            return (Criteria) this;
        }

        public Criteria andOcMaxNotIn(List<Double> values) {
            addCriterion("oc_max not in", values, "ocMax");
            return (Criteria) this;
        }

        public Criteria andOcMaxBetween(Double value1, Double value2) {
            addCriterion("oc_max between", value1, value2, "ocMax");
            return (Criteria) this;
        }

        public Criteria andOcMaxNotBetween(Double value1, Double value2) {
            addCriterion("oc_max not between", value1, value2, "ocMax");
            return (Criteria) this;
        }

        public Criteria andBcMaxIsNull() {
            addCriterion("bc_max is null");
            return (Criteria) this;
        }

        public Criteria andBcMaxIsNotNull() {
            addCriterion("bc_max is not null");
            return (Criteria) this;
        }

        public Criteria andBcMaxEqualTo(Double value) {
            addCriterion("bc_max =", value, "bcMax");
            return (Criteria) this;
        }

        public Criteria andBcMaxNotEqualTo(Double value) {
            addCriterion("bc_max <>", value, "bcMax");
            return (Criteria) this;
        }

        public Criteria andBcMaxGreaterThan(Double value) {
            addCriterion("bc_max >", value, "bcMax");
            return (Criteria) this;
        }

        public Criteria andBcMaxGreaterThanOrEqualTo(Double value) {
            addCriterion("bc_max >=", value, "bcMax");
            return (Criteria) this;
        }

        public Criteria andBcMaxLessThan(Double value) {
            addCriterion("bc_max <", value, "bcMax");
            return (Criteria) this;
        }

        public Criteria andBcMaxLessThanOrEqualTo(Double value) {
            addCriterion("bc_max <=", value, "bcMax");
            return (Criteria) this;
        }

        public Criteria andBcMaxIn(List<Double> values) {
            addCriterion("bc_max in", values, "bcMax");
            return (Criteria) this;
        }

        public Criteria andBcMaxNotIn(List<Double> values) {
            addCriterion("bc_max not in", values, "bcMax");
            return (Criteria) this;
        }

        public Criteria andBcMaxBetween(Double value1, Double value2) {
            addCriterion("bc_max between", value1, value2, "bcMax");
            return (Criteria) this;
        }

        public Criteria andBcMaxNotBetween(Double value1, Double value2) {
            addCriterion("bc_max not between", value1, value2, "bcMax");
            return (Criteria) this;
        }

        public Criteria andNoxMaxIsNull() {
            addCriterion("nox_max is null");
            return (Criteria) this;
        }

        public Criteria andNoxMaxIsNotNull() {
            addCriterion("nox_max is not null");
            return (Criteria) this;
        }

        public Criteria andNoxMaxEqualTo(Double value) {
            addCriterion("nox_max =", value, "noxMax");
            return (Criteria) this;
        }

        public Criteria andNoxMaxNotEqualTo(Double value) {
            addCriterion("nox_max <>", value, "noxMax");
            return (Criteria) this;
        }

        public Criteria andNoxMaxGreaterThan(Double value) {
            addCriterion("nox_max >", value, "noxMax");
            return (Criteria) this;
        }

        public Criteria andNoxMaxGreaterThanOrEqualTo(Double value) {
            addCriterion("nox_max >=", value, "noxMax");
            return (Criteria) this;
        }

        public Criteria andNoxMaxLessThan(Double value) {
            addCriterion("nox_max <", value, "noxMax");
            return (Criteria) this;
        }

        public Criteria andNoxMaxLessThanOrEqualTo(Double value) {
            addCriterion("nox_max <=", value, "noxMax");
            return (Criteria) this;
        }

        public Criteria andNoxMaxIn(List<Double> values) {
            addCriterion("nox_max in", values, "noxMax");
            return (Criteria) this;
        }

        public Criteria andNoxMaxNotIn(List<Double> values) {
            addCriterion("nox_max not in", values, "noxMax");
            return (Criteria) this;
        }

        public Criteria andNoxMaxBetween(Double value1, Double value2) {
            addCriterion("nox_max between", value1, value2, "noxMax");
            return (Criteria) this;
        }

        public Criteria andNoxMaxNotBetween(Double value1, Double value2) {
            addCriterion("nox_max not between", value1, value2, "noxMax");
            return (Criteria) this;
        }

        public Criteria andPm25UnitIsNull() {
            addCriterion("pm25_unit is null");
            return (Criteria) this;
        }

        public Criteria andPm25UnitIsNotNull() {
            addCriterion("pm25_unit is not null");
            return (Criteria) this;
        }

        public Criteria andPm25UnitEqualTo(String value) {
            addCriterion("pm25_unit =", value, "pm25Unit");
            return (Criteria) this;
        }

        public Criteria andPm25UnitNotEqualTo(String value) {
            addCriterion("pm25_unit <>", value, "pm25Unit");
            return (Criteria) this;
        }

        public Criteria andPm25UnitGreaterThan(String value) {
            addCriterion("pm25_unit >", value, "pm25Unit");
            return (Criteria) this;
        }

        public Criteria andPm25UnitGreaterThanOrEqualTo(String value) {
            addCriterion("pm25_unit >=", value, "pm25Unit");
            return (Criteria) this;
        }

        public Criteria andPm25UnitLessThan(String value) {
            addCriterion("pm25_unit <", value, "pm25Unit");
            return (Criteria) this;
        }

        public Criteria andPm25UnitLessThanOrEqualTo(String value) {
            addCriterion("pm25_unit <=", value, "pm25Unit");
            return (Criteria) this;
        }

        public Criteria andPm25UnitLike(String value) {
            addCriterion("pm25_unit like", value, "pm25Unit");
            return (Criteria) this;
        }

        public Criteria andPm25UnitNotLike(String value) {
            addCriterion("pm25_unit not like", value, "pm25Unit");
            return (Criteria) this;
        }

        public Criteria andPm25UnitIn(List<String> values) {
            addCriterion("pm25_unit in", values, "pm25Unit");
            return (Criteria) this;
        }

        public Criteria andPm25UnitNotIn(List<String> values) {
            addCriterion("pm25_unit not in", values, "pm25Unit");
            return (Criteria) this;
        }

        public Criteria andPm25UnitBetween(String value1, String value2) {
            addCriterion("pm25_unit between", value1, value2, "pm25Unit");
            return (Criteria) this;
        }

        public Criteria andPm25UnitNotBetween(String value1, String value2) {
            addCriterion("pm25_unit not between", value1, value2, "pm25Unit");
            return (Criteria) this;
        }

        public Criteria andPm10UnitIsNull() {
            addCriterion("pm10_unit is null");
            return (Criteria) this;
        }

        public Criteria andPm10UnitIsNotNull() {
            addCriterion("pm10_unit is not null");
            return (Criteria) this;
        }

        public Criteria andPm10UnitEqualTo(String value) {
            addCriterion("pm10_unit =", value, "pm10Unit");
            return (Criteria) this;
        }

        public Criteria andPm10UnitNotEqualTo(String value) {
            addCriterion("pm10_unit <>", value, "pm10Unit");
            return (Criteria) this;
        }

        public Criteria andPm10UnitGreaterThan(String value) {
            addCriterion("pm10_unit >", value, "pm10Unit");
            return (Criteria) this;
        }

        public Criteria andPm10UnitGreaterThanOrEqualTo(String value) {
            addCriterion("pm10_unit >=", value, "pm10Unit");
            return (Criteria) this;
        }

        public Criteria andPm10UnitLessThan(String value) {
            addCriterion("pm10_unit <", value, "pm10Unit");
            return (Criteria) this;
        }

        public Criteria andPm10UnitLessThanOrEqualTo(String value) {
            addCriterion("pm10_unit <=", value, "pm10Unit");
            return (Criteria) this;
        }

        public Criteria andPm10UnitLike(String value) {
            addCriterion("pm10_unit like", value, "pm10Unit");
            return (Criteria) this;
        }

        public Criteria andPm10UnitNotLike(String value) {
            addCriterion("pm10_unit not like", value, "pm10Unit");
            return (Criteria) this;
        }

        public Criteria andPm10UnitIn(List<String> values) {
            addCriterion("pm10_unit in", values, "pm10Unit");
            return (Criteria) this;
        }

        public Criteria andPm10UnitNotIn(List<String> values) {
            addCriterion("pm10_unit not in", values, "pm10Unit");
            return (Criteria) this;
        }

        public Criteria andPm10UnitBetween(String value1, String value2) {
            addCriterion("pm10_unit between", value1, value2, "pm10Unit");
            return (Criteria) this;
        }

        public Criteria andPm10UnitNotBetween(String value1, String value2) {
            addCriterion("pm10_unit not between", value1, value2, "pm10Unit");
            return (Criteria) this;
        }

        public Criteria andVocUnitIsNull() {
            addCriterion("voc_unit is null");
            return (Criteria) this;
        }

        public Criteria andVocUnitIsNotNull() {
            addCriterion("voc_unit is not null");
            return (Criteria) this;
        }

        public Criteria andVocUnitEqualTo(String value) {
            addCriterion("voc_unit =", value, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitNotEqualTo(String value) {
            addCriterion("voc_unit <>", value, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitGreaterThan(String value) {
            addCriterion("voc_unit >", value, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitGreaterThanOrEqualTo(String value) {
            addCriterion("voc_unit >=", value, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitLessThan(String value) {
            addCriterion("voc_unit <", value, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitLessThanOrEqualTo(String value) {
            addCriterion("voc_unit <=", value, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitLike(String value) {
            addCriterion("voc_unit like", value, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitNotLike(String value) {
            addCriterion("voc_unit not like", value, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitIn(List<String> values) {
            addCriterion("voc_unit in", values, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitNotIn(List<String> values) {
            addCriterion("voc_unit not in", values, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitBetween(String value1, String value2) {
            addCriterion("voc_unit between", value1, value2, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitNotBetween(String value1, String value2) {
            addCriterion("voc_unit not between", value1, value2, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitIsNull() {
            addCriterion("nh3_unit is null");
            return (Criteria) this;
        }

        public Criteria andNh3UnitIsNotNull() {
            addCriterion("nh3_unit is not null");
            return (Criteria) this;
        }

        public Criteria andNh3UnitEqualTo(String value) {
            addCriterion("nh3_unit =", value, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitNotEqualTo(String value) {
            addCriterion("nh3_unit <>", value, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitGreaterThan(String value) {
            addCriterion("nh3_unit >", value, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitGreaterThanOrEqualTo(String value) {
            addCriterion("nh3_unit >=", value, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitLessThan(String value) {
            addCriterion("nh3_unit <", value, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitLessThanOrEqualTo(String value) {
            addCriterion("nh3_unit <=", value, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitLike(String value) {
            addCriterion("nh3_unit like", value, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitNotLike(String value) {
            addCriterion("nh3_unit not like", value, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitIn(List<String> values) {
            addCriterion("nh3_unit in", values, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitNotIn(List<String> values) {
            addCriterion("nh3_unit not in", values, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitBetween(String value1, String value2) {
            addCriterion("nh3_unit between", value1, value2, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitNotBetween(String value1, String value2) {
            addCriterion("nh3_unit not between", value1, value2, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andSo2UnitIsNull() {
            addCriterion("so2_unit is null");
            return (Criteria) this;
        }

        public Criteria andSo2UnitIsNotNull() {
            addCriterion("so2_unit is not null");
            return (Criteria) this;
        }

        public Criteria andSo2UnitEqualTo(String value) {
            addCriterion("so2_unit =", value, "so2Unit");
            return (Criteria) this;
        }

        public Criteria andSo2UnitNotEqualTo(String value) {
            addCriterion("so2_unit <>", value, "so2Unit");
            return (Criteria) this;
        }

        public Criteria andSo2UnitGreaterThan(String value) {
            addCriterion("so2_unit >", value, "so2Unit");
            return (Criteria) this;
        }

        public Criteria andSo2UnitGreaterThanOrEqualTo(String value) {
            addCriterion("so2_unit >=", value, "so2Unit");
            return (Criteria) this;
        }

        public Criteria andSo2UnitLessThan(String value) {
            addCriterion("so2_unit <", value, "so2Unit");
            return (Criteria) this;
        }

        public Criteria andSo2UnitLessThanOrEqualTo(String value) {
            addCriterion("so2_unit <=", value, "so2Unit");
            return (Criteria) this;
        }

        public Criteria andSo2UnitLike(String value) {
            addCriterion("so2_unit like", value, "so2Unit");
            return (Criteria) this;
        }

        public Criteria andSo2UnitNotLike(String value) {
            addCriterion("so2_unit not like", value, "so2Unit");
            return (Criteria) this;
        }

        public Criteria andSo2UnitIn(List<String> values) {
            addCriterion("so2_unit in", values, "so2Unit");
            return (Criteria) this;
        }

        public Criteria andSo2UnitNotIn(List<String> values) {
            addCriterion("so2_unit not in", values, "so2Unit");
            return (Criteria) this;
        }

        public Criteria andSo2UnitBetween(String value1, String value2) {
            addCriterion("so2_unit between", value1, value2, "so2Unit");
            return (Criteria) this;
        }

        public Criteria andSo2UnitNotBetween(String value1, String value2) {
            addCriterion("so2_unit not between", value1, value2, "so2Unit");
            return (Criteria) this;
        }

        public Criteria andCoUnitIsNull() {
            addCriterion("co_unit is null");
            return (Criteria) this;
        }

        public Criteria andCoUnitIsNotNull() {
            addCriterion("co_unit is not null");
            return (Criteria) this;
        }

        public Criteria andCoUnitEqualTo(String value) {
            addCriterion("co_unit =", value, "coUnit");
            return (Criteria) this;
        }

        public Criteria andCoUnitNotEqualTo(String value) {
            addCriterion("co_unit <>", value, "coUnit");
            return (Criteria) this;
        }

        public Criteria andCoUnitGreaterThan(String value) {
            addCriterion("co_unit >", value, "coUnit");
            return (Criteria) this;
        }

        public Criteria andCoUnitGreaterThanOrEqualTo(String value) {
            addCriterion("co_unit >=", value, "coUnit");
            return (Criteria) this;
        }

        public Criteria andCoUnitLessThan(String value) {
            addCriterion("co_unit <", value, "coUnit");
            return (Criteria) this;
        }

        public Criteria andCoUnitLessThanOrEqualTo(String value) {
            addCriterion("co_unit <=", value, "coUnit");
            return (Criteria) this;
        }

        public Criteria andCoUnitLike(String value) {
            addCriterion("co_unit like", value, "coUnit");
            return (Criteria) this;
        }

        public Criteria andCoUnitNotLike(String value) {
            addCriterion("co_unit not like", value, "coUnit");
            return (Criteria) this;
        }

        public Criteria andCoUnitIn(List<String> values) {
            addCriterion("co_unit in", values, "coUnit");
            return (Criteria) this;
        }

        public Criteria andCoUnitNotIn(List<String> values) {
            addCriterion("co_unit not in", values, "coUnit");
            return (Criteria) this;
        }

        public Criteria andCoUnitBetween(String value1, String value2) {
            addCriterion("co_unit between", value1, value2, "coUnit");
            return (Criteria) this;
        }

        public Criteria andCoUnitNotBetween(String value1, String value2) {
            addCriterion("co_unit not between", value1, value2, "coUnit");
            return (Criteria) this;
        }

        public Criteria andOcUnitIsNull() {
            addCriterion("oc_unit is null");
            return (Criteria) this;
        }

        public Criteria andOcUnitIsNotNull() {
            addCriterion("oc_unit is not null");
            return (Criteria) this;
        }

        public Criteria andOcUnitEqualTo(String value) {
            addCriterion("oc_unit =", value, "ocUnit");
            return (Criteria) this;
        }

        public Criteria andOcUnitNotEqualTo(String value) {
            addCriterion("oc_unit <>", value, "ocUnit");
            return (Criteria) this;
        }

        public Criteria andOcUnitGreaterThan(String value) {
            addCriterion("oc_unit >", value, "ocUnit");
            return (Criteria) this;
        }

        public Criteria andOcUnitGreaterThanOrEqualTo(String value) {
            addCriterion("oc_unit >=", value, "ocUnit");
            return (Criteria) this;
        }

        public Criteria andOcUnitLessThan(String value) {
            addCriterion("oc_unit <", value, "ocUnit");
            return (Criteria) this;
        }

        public Criteria andOcUnitLessThanOrEqualTo(String value) {
            addCriterion("oc_unit <=", value, "ocUnit");
            return (Criteria) this;
        }

        public Criteria andOcUnitLike(String value) {
            addCriterion("oc_unit like", value, "ocUnit");
            return (Criteria) this;
        }

        public Criteria andOcUnitNotLike(String value) {
            addCriterion("oc_unit not like", value, "ocUnit");
            return (Criteria) this;
        }

        public Criteria andOcUnitIn(List<String> values) {
            addCriterion("oc_unit in", values, "ocUnit");
            return (Criteria) this;
        }

        public Criteria andOcUnitNotIn(List<String> values) {
            addCriterion("oc_unit not in", values, "ocUnit");
            return (Criteria) this;
        }

        public Criteria andOcUnitBetween(String value1, String value2) {
            addCriterion("oc_unit between", value1, value2, "ocUnit");
            return (Criteria) this;
        }

        public Criteria andOcUnitNotBetween(String value1, String value2) {
            addCriterion("oc_unit not between", value1, value2, "ocUnit");
            return (Criteria) this;
        }

        public Criteria andBcUnitIsNull() {
            addCriterion("bc_unit is null");
            return (Criteria) this;
        }

        public Criteria andBcUnitIsNotNull() {
            addCriterion("bc_unit is not null");
            return (Criteria) this;
        }

        public Criteria andBcUnitEqualTo(String value) {
            addCriterion("bc_unit =", value, "bcUnit");
            return (Criteria) this;
        }

        public Criteria andBcUnitNotEqualTo(String value) {
            addCriterion("bc_unit <>", value, "bcUnit");
            return (Criteria) this;
        }

        public Criteria andBcUnitGreaterThan(String value) {
            addCriterion("bc_unit >", value, "bcUnit");
            return (Criteria) this;
        }

        public Criteria andBcUnitGreaterThanOrEqualTo(String value) {
            addCriterion("bc_unit >=", value, "bcUnit");
            return (Criteria) this;
        }

        public Criteria andBcUnitLessThan(String value) {
            addCriterion("bc_unit <", value, "bcUnit");
            return (Criteria) this;
        }

        public Criteria andBcUnitLessThanOrEqualTo(String value) {
            addCriterion("bc_unit <=", value, "bcUnit");
            return (Criteria) this;
        }

        public Criteria andBcUnitLike(String value) {
            addCriterion("bc_unit like", value, "bcUnit");
            return (Criteria) this;
        }

        public Criteria andBcUnitNotLike(String value) {
            addCriterion("bc_unit not like", value, "bcUnit");
            return (Criteria) this;
        }

        public Criteria andBcUnitIn(List<String> values) {
            addCriterion("bc_unit in", values, "bcUnit");
            return (Criteria) this;
        }

        public Criteria andBcUnitNotIn(List<String> values) {
            addCriterion("bc_unit not in", values, "bcUnit");
            return (Criteria) this;
        }

        public Criteria andBcUnitBetween(String value1, String value2) {
            addCriterion("bc_unit between", value1, value2, "bcUnit");
            return (Criteria) this;
        }

        public Criteria andBcUnitNotBetween(String value1, String value2) {
            addCriterion("bc_unit not between", value1, value2, "bcUnit");
            return (Criteria) this;
        }

        public Criteria andNoxUnitIsNull() {
            addCriterion("nox_unit is null");
            return (Criteria) this;
        }

        public Criteria andNoxUnitIsNotNull() {
            addCriterion("nox_unit is not null");
            return (Criteria) this;
        }

        public Criteria andNoxUnitEqualTo(String value) {
            addCriterion("nox_unit =", value, "noxUnit");
            return (Criteria) this;
        }

        public Criteria andNoxUnitNotEqualTo(String value) {
            addCriterion("nox_unit <>", value, "noxUnit");
            return (Criteria) this;
        }

        public Criteria andNoxUnitGreaterThan(String value) {
            addCriterion("nox_unit >", value, "noxUnit");
            return (Criteria) this;
        }

        public Criteria andNoxUnitGreaterThanOrEqualTo(String value) {
            addCriterion("nox_unit >=", value, "noxUnit");
            return (Criteria) this;
        }

        public Criteria andNoxUnitLessThan(String value) {
            addCriterion("nox_unit <", value, "noxUnit");
            return (Criteria) this;
        }

        public Criteria andNoxUnitLessThanOrEqualTo(String value) {
            addCriterion("nox_unit <=", value, "noxUnit");
            return (Criteria) this;
        }

        public Criteria andNoxUnitLike(String value) {
            addCriterion("nox_unit like", value, "noxUnit");
            return (Criteria) this;
        }

        public Criteria andNoxUnitNotLike(String value) {
            addCriterion("nox_unit not like", value, "noxUnit");
            return (Criteria) this;
        }

        public Criteria andNoxUnitIn(List<String> values) {
            addCriterion("nox_unit in", values, "noxUnit");
            return (Criteria) this;
        }

        public Criteria andNoxUnitNotIn(List<String> values) {
            addCriterion("nox_unit not in", values, "noxUnit");
            return (Criteria) this;
        }

        public Criteria andNoxUnitBetween(String value1, String value2) {
            addCriterion("nox_unit between", value1, value2, "noxUnit");
            return (Criteria) this;
        }

        public Criteria andNoxUnitNotBetween(String value1, String value2) {
            addCriterion("nox_unit not between", value1, value2, "noxUnit");
            return (Criteria) this;
        }

        public Criteria andNodustdayIsNull() {
            addCriterion("nodustday is null");
            return (Criteria) this;
        }

        public Criteria andNodustdayIsNotNull() {
            addCriterion("nodustday is not null");
            return (Criteria) this;
        }

        public Criteria andNodustdayEqualTo(Integer value) {
            addCriterion("nodustday =", value, "nodustday");
            return (Criteria) this;
        }

        public Criteria andNodustdayNotEqualTo(Integer value) {
            addCriterion("nodustday <>", value, "nodustday");
            return (Criteria) this;
        }

        public Criteria andNodustdayGreaterThan(Integer value) {
            addCriterion("nodustday >", value, "nodustday");
            return (Criteria) this;
        }

        public Criteria andNodustdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("nodustday >=", value, "nodustday");
            return (Criteria) this;
        }

        public Criteria andNodustdayLessThan(Integer value) {
            addCriterion("nodustday <", value, "nodustday");
            return (Criteria) this;
        }

        public Criteria andNodustdayLessThanOrEqualTo(Integer value) {
            addCriterion("nodustday <=", value, "nodustday");
            return (Criteria) this;
        }

        public Criteria andNodustdayIn(List<Integer> values) {
            addCriterion("nodustday in", values, "nodustday");
            return (Criteria) this;
        }

        public Criteria andNodustdayNotIn(List<Integer> values) {
            addCriterion("nodustday not in", values, "nodustday");
            return (Criteria) this;
        }

        public Criteria andNodustdayBetween(Integer value1, Integer value2) {
            addCriterion("nodustday between", value1, value2, "nodustday");
            return (Criteria) this;
        }

        public Criteria andNodustdayNotBetween(Integer value1, Integer value2) {
            addCriterion("nodustday not between", value1, value2, "nodustday");
            return (Criteria) this;
        }

        public Criteria andSccDescribeIsNull() {
            addCriterion("scc_describe is null");
            return (Criteria) this;
        }

        public Criteria andSccDescribeIsNotNull() {
            addCriterion("scc_describe is not null");
            return (Criteria) this;
        }

        public Criteria andSccDescribeEqualTo(String value) {
            addCriterion("scc_describe =", value, "sccDescribe");
            return (Criteria) this;
        }

        public Criteria andSccDescribeNotEqualTo(String value) {
            addCriterion("scc_describe <>", value, "sccDescribe");
            return (Criteria) this;
        }

        public Criteria andSccDescribeGreaterThan(String value) {
            addCriterion("scc_describe >", value, "sccDescribe");
            return (Criteria) this;
        }

        public Criteria andSccDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("scc_describe >=", value, "sccDescribe");
            return (Criteria) this;
        }

        public Criteria andSccDescribeLessThan(String value) {
            addCriterion("scc_describe <", value, "sccDescribe");
            return (Criteria) this;
        }

        public Criteria andSccDescribeLessThanOrEqualTo(String value) {
            addCriterion("scc_describe <=", value, "sccDescribe");
            return (Criteria) this;
        }

        public Criteria andSccDescribeLike(String value) {
            addCriterion("scc_describe like", value, "sccDescribe");
            return (Criteria) this;
        }

        public Criteria andSccDescribeNotLike(String value) {
            addCriterion("scc_describe not like", value, "sccDescribe");
            return (Criteria) this;
        }

        public Criteria andSccDescribeIn(List<String> values) {
            addCriterion("scc_describe in", values, "sccDescribe");
            return (Criteria) this;
        }

        public Criteria andSccDescribeNotIn(List<String> values) {
            addCriterion("scc_describe not in", values, "sccDescribe");
            return (Criteria) this;
        }

        public Criteria andSccDescribeBetween(String value1, String value2) {
            addCriterion("scc_describe between", value1, value2, "sccDescribe");
            return (Criteria) this;
        }

        public Criteria andSccDescribeNotBetween(String value1, String value2) {
            addCriterion("scc_describe not between", value1, value2, "sccDescribe");
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