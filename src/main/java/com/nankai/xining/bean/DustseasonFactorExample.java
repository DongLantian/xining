package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class DustseasonFactorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DustseasonFactorExample() {
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

        public Criteria andDsIdIsNull() {
            addCriterion("ds_id is null");
            return (Criteria) this;
        }

        public Criteria andDsIdIsNotNull() {
            addCriterion("ds_id is not null");
            return (Criteria) this;
        }

        public Criteria andDsIdEqualTo(Integer value) {
            addCriterion("ds_id =", value, "dsId");
            return (Criteria) this;
        }

        public Criteria andDsIdNotEqualTo(Integer value) {
            addCriterion("ds_id <>", value, "dsId");
            return (Criteria) this;
        }

        public Criteria andDsIdGreaterThan(Integer value) {
            addCriterion("ds_id >", value, "dsId");
            return (Criteria) this;
        }

        public Criteria andDsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ds_id >=", value, "dsId");
            return (Criteria) this;
        }

        public Criteria andDsIdLessThan(Integer value) {
            addCriterion("ds_id <", value, "dsId");
            return (Criteria) this;
        }

        public Criteria andDsIdLessThanOrEqualTo(Integer value) {
            addCriterion("ds_id <=", value, "dsId");
            return (Criteria) this;
        }

        public Criteria andDsIdIn(List<Integer> values) {
            addCriterion("ds_id in", values, "dsId");
            return (Criteria) this;
        }

        public Criteria andDsIdNotIn(List<Integer> values) {
            addCriterion("ds_id not in", values, "dsId");
            return (Criteria) this;
        }

        public Criteria andDsIdBetween(Integer value1, Integer value2) {
            addCriterion("ds_id between", value1, value2, "dsId");
            return (Criteria) this;
        }

        public Criteria andDsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ds_id not between", value1, value2, "dsId");
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

        public Criteria andSeasonIsNull() {
            addCriterion("season is null");
            return (Criteria) this;
        }

        public Criteria andSeasonIsNotNull() {
            addCriterion("season is not null");
            return (Criteria) this;
        }

        public Criteria andSeasonEqualTo(String value) {
            addCriterion("season =", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotEqualTo(String value) {
            addCriterion("season <>", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonGreaterThan(String value) {
            addCriterion("season >", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonGreaterThanOrEqualTo(String value) {
            addCriterion("season >=", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonLessThan(String value) {
            addCriterion("season <", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonLessThanOrEqualTo(String value) {
            addCriterion("season <=", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonLike(String value) {
            addCriterion("season like", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotLike(String value) {
            addCriterion("season not like", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonIn(List<String> values) {
            addCriterion("season in", values, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotIn(List<String> values) {
            addCriterion("season not in", values, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonBetween(String value1, String value2) {
            addCriterion("season between", value1, value2, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotBetween(String value1, String value2) {
            addCriterion("season not between", value1, value2, "season");
            return (Criteria) this;
        }

        public Criteria andSoilindexIsNull() {
            addCriterion("soilindex is null");
            return (Criteria) this;
        }

        public Criteria andSoilindexIsNotNull() {
            addCriterion("soilindex is not null");
            return (Criteria) this;
        }

        public Criteria andSoilindexEqualTo(Double value) {
            addCriterion("soilindex =", value, "soilindex");
            return (Criteria) this;
        }

        public Criteria andSoilindexNotEqualTo(Double value) {
            addCriterion("soilindex <>", value, "soilindex");
            return (Criteria) this;
        }

        public Criteria andSoilindexGreaterThan(Double value) {
            addCriterion("soilindex >", value, "soilindex");
            return (Criteria) this;
        }

        public Criteria andSoilindexGreaterThanOrEqualTo(Double value) {
            addCriterion("soilindex >=", value, "soilindex");
            return (Criteria) this;
        }

        public Criteria andSoilindexLessThan(Double value) {
            addCriterion("soilindex <", value, "soilindex");
            return (Criteria) this;
        }

        public Criteria andSoilindexLessThanOrEqualTo(Double value) {
            addCriterion("soilindex <=", value, "soilindex");
            return (Criteria) this;
        }

        public Criteria andSoilindexIn(List<Double> values) {
            addCriterion("soilindex in", values, "soilindex");
            return (Criteria) this;
        }

        public Criteria andSoilindexNotIn(List<Double> values) {
            addCriterion("soilindex not in", values, "soilindex");
            return (Criteria) this;
        }

        public Criteria andSoilindexBetween(Double value1, Double value2) {
            addCriterion("soilindex between", value1, value2, "soilindex");
            return (Criteria) this;
        }

        public Criteria andSoilindexNotBetween(Double value1, Double value2) {
            addCriterion("soilindex not between", value1, value2, "soilindex");
            return (Criteria) this;
        }

        public Criteria andSurindexIsNull() {
            addCriterion("surindex is null");
            return (Criteria) this;
        }

        public Criteria andSurindexIsNotNull() {
            addCriterion("surindex is not null");
            return (Criteria) this;
        }

        public Criteria andSurindexEqualTo(Double value) {
            addCriterion("surindex =", value, "surindex");
            return (Criteria) this;
        }

        public Criteria andSurindexNotEqualTo(Double value) {
            addCriterion("surindex <>", value, "surindex");
            return (Criteria) this;
        }

        public Criteria andSurindexGreaterThan(Double value) {
            addCriterion("surindex >", value, "surindex");
            return (Criteria) this;
        }

        public Criteria andSurindexGreaterThanOrEqualTo(Double value) {
            addCriterion("surindex >=", value, "surindex");
            return (Criteria) this;
        }

        public Criteria andSurindexLessThan(Double value) {
            addCriterion("surindex <", value, "surindex");
            return (Criteria) this;
        }

        public Criteria andSurindexLessThanOrEqualTo(Double value) {
            addCriterion("surindex <=", value, "surindex");
            return (Criteria) this;
        }

        public Criteria andSurindexIn(List<Double> values) {
            addCriterion("surindex in", values, "surindex");
            return (Criteria) this;
        }

        public Criteria andSurindexNotIn(List<Double> values) {
            addCriterion("surindex not in", values, "surindex");
            return (Criteria) this;
        }

        public Criteria andSurindexBetween(Double value1, Double value2) {
            addCriterion("surindex between", value1, value2, "surindex");
            return (Criteria) this;
        }

        public Criteria andSurindexNotBetween(Double value1, Double value2) {
            addCriterion("surindex not between", value1, value2, "surindex");
            return (Criteria) this;
        }

        public Criteria andNoindexIsNull() {
            addCriterion("noindex is null");
            return (Criteria) this;
        }

        public Criteria andNoindexIsNotNull() {
            addCriterion("noindex is not null");
            return (Criteria) this;
        }

        public Criteria andNoindexEqualTo(Double value) {
            addCriterion("noindex =", value, "noindex");
            return (Criteria) this;
        }

        public Criteria andNoindexNotEqualTo(Double value) {
            addCriterion("noindex <>", value, "noindex");
            return (Criteria) this;
        }

        public Criteria andNoindexGreaterThan(Double value) {
            addCriterion("noindex >", value, "noindex");
            return (Criteria) this;
        }

        public Criteria andNoindexGreaterThanOrEqualTo(Double value) {
            addCriterion("noindex >=", value, "noindex");
            return (Criteria) this;
        }

        public Criteria andNoindexLessThan(Double value) {
            addCriterion("noindex <", value, "noindex");
            return (Criteria) this;
        }

        public Criteria andNoindexLessThanOrEqualTo(Double value) {
            addCriterion("noindex <=", value, "noindex");
            return (Criteria) this;
        }

        public Criteria andNoindexIn(List<Double> values) {
            addCriterion("noindex in", values, "noindex");
            return (Criteria) this;
        }

        public Criteria andNoindexNotIn(List<Double> values) {
            addCriterion("noindex not in", values, "noindex");
            return (Criteria) this;
        }

        public Criteria andNoindexBetween(Double value1, Double value2) {
            addCriterion("noindex between", value1, value2, "noindex");
            return (Criteria) this;
        }

        public Criteria andNoindexNotBetween(Double value1, Double value2) {
            addCriterion("noindex not between", value1, value2, "noindex");
            return (Criteria) this;
        }

        public Criteria andPindexIsNull() {
            addCriterion("pindex is null");
            return (Criteria) this;
        }

        public Criteria andPindexIsNotNull() {
            addCriterion("pindex is not null");
            return (Criteria) this;
        }

        public Criteria andPindexEqualTo(Double value) {
            addCriterion("pindex =", value, "pindex");
            return (Criteria) this;
        }

        public Criteria andPindexNotEqualTo(Double value) {
            addCriterion("pindex <>", value, "pindex");
            return (Criteria) this;
        }

        public Criteria andPindexGreaterThan(Double value) {
            addCriterion("pindex >", value, "pindex");
            return (Criteria) this;
        }

        public Criteria andPindexGreaterThanOrEqualTo(Double value) {
            addCriterion("pindex >=", value, "pindex");
            return (Criteria) this;
        }

        public Criteria andPindexLessThan(Double value) {
            addCriterion("pindex <", value, "pindex");
            return (Criteria) this;
        }

        public Criteria andPindexLessThanOrEqualTo(Double value) {
            addCriterion("pindex <=", value, "pindex");
            return (Criteria) this;
        }

        public Criteria andPindexIn(List<Double> values) {
            addCriterion("pindex in", values, "pindex");
            return (Criteria) this;
        }

        public Criteria andPindexNotIn(List<Double> values) {
            addCriterion("pindex not in", values, "pindex");
            return (Criteria) this;
        }

        public Criteria andPindexBetween(Double value1, Double value2) {
            addCriterion("pindex between", value1, value2, "pindex");
            return (Criteria) this;
        }

        public Criteria andPindexNotBetween(Double value1, Double value2) {
            addCriterion("pindex not between", value1, value2, "pindex");
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

        public Criteria andLoadIsNull() {
            addCriterion("load is null");
            return (Criteria) this;
        }

        public Criteria andLoadIsNotNull() {
            addCriterion("load is not null");
            return (Criteria) this;
        }

        public Criteria andLoadEqualTo(Double value) {
            addCriterion("load =", value, "load");
            return (Criteria) this;
        }

        public Criteria andLoadNotEqualTo(Double value) {
            addCriterion("load <>", value, "load");
            return (Criteria) this;
        }

        public Criteria andLoadGreaterThan(Double value) {
            addCriterion("load >", value, "load");
            return (Criteria) this;
        }

        public Criteria andLoadGreaterThanOrEqualTo(Double value) {
            addCriterion("load >=", value, "load");
            return (Criteria) this;
        }

        public Criteria andLoadLessThan(Double value) {
            addCriterion("load <", value, "load");
            return (Criteria) this;
        }

        public Criteria andLoadLessThanOrEqualTo(Double value) {
            addCriterion("load <=", value, "load");
            return (Criteria) this;
        }

        public Criteria andLoadIn(List<Double> values) {
            addCriterion("load in", values, "load");
            return (Criteria) this;
        }

        public Criteria andLoadNotIn(List<Double> values) {
            addCriterion("load not in", values, "load");
            return (Criteria) this;
        }

        public Criteria andLoadBetween(Double value1, Double value2) {
            addCriterion("load between", value1, value2, "load");
            return (Criteria) this;
        }

        public Criteria andLoadNotBetween(Double value1, Double value2) {
            addCriterion("load not between", value1, value2, "load");
            return (Criteria) this;
        }

        public Criteria andPathtypeIsNull() {
            addCriterion("pathtype is null");
            return (Criteria) this;
        }

        public Criteria andPathtypeIsNotNull() {
            addCriterion("pathtype is not null");
            return (Criteria) this;
        }

        public Criteria andPathtypeEqualTo(String value) {
            addCriterion("pathtype =", value, "pathtype");
            return (Criteria) this;
        }

        public Criteria andPathtypeNotEqualTo(String value) {
            addCriterion("pathtype <>", value, "pathtype");
            return (Criteria) this;
        }

        public Criteria andPathtypeGreaterThan(String value) {
            addCriterion("pathtype >", value, "pathtype");
            return (Criteria) this;
        }

        public Criteria andPathtypeGreaterThanOrEqualTo(String value) {
            addCriterion("pathtype >=", value, "pathtype");
            return (Criteria) this;
        }

        public Criteria andPathtypeLessThan(String value) {
            addCriterion("pathtype <", value, "pathtype");
            return (Criteria) this;
        }

        public Criteria andPathtypeLessThanOrEqualTo(String value) {
            addCriterion("pathtype <=", value, "pathtype");
            return (Criteria) this;
        }

        public Criteria andPathtypeLike(String value) {
            addCriterion("pathtype like", value, "pathtype");
            return (Criteria) this;
        }

        public Criteria andPathtypeNotLike(String value) {
            addCriterion("pathtype not like", value, "pathtype");
            return (Criteria) this;
        }

        public Criteria andPathtypeIn(List<String> values) {
            addCriterion("pathtype in", values, "pathtype");
            return (Criteria) this;
        }

        public Criteria andPathtypeNotIn(List<String> values) {
            addCriterion("pathtype not in", values, "pathtype");
            return (Criteria) this;
        }

        public Criteria andPathtypeBetween(String value1, String value2) {
            addCriterion("pathtype between", value1, value2, "pathtype");
            return (Criteria) this;
        }

        public Criteria andPathtypeNotBetween(String value1, String value2) {
            addCriterion("pathtype not between", value1, value2, "pathtype");
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

        public Criteria andIspaveEqualTo(Boolean value) {
            addCriterion("ispave =", value, "ispave");
            return (Criteria) this;
        }

        public Criteria andIspaveNotEqualTo(Boolean value) {
            addCriterion("ispave <>", value, "ispave");
            return (Criteria) this;
        }

        public Criteria andIspaveGreaterThan(Boolean value) {
            addCriterion("ispave >", value, "ispave");
            return (Criteria) this;
        }

        public Criteria andIspaveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ispave >=", value, "ispave");
            return (Criteria) this;
        }

        public Criteria andIspaveLessThan(Boolean value) {
            addCriterion("ispave <", value, "ispave");
            return (Criteria) this;
        }

        public Criteria andIspaveLessThanOrEqualTo(Boolean value) {
            addCriterion("ispave <=", value, "ispave");
            return (Criteria) this;
        }

        public Criteria andIspaveIn(List<Boolean> values) {
            addCriterion("ispave in", values, "ispave");
            return (Criteria) this;
        }

        public Criteria andIspaveNotIn(List<Boolean> values) {
            addCriterion("ispave not in", values, "ispave");
            return (Criteria) this;
        }

        public Criteria andIspaveBetween(Boolean value1, Boolean value2) {
            addCriterion("ispave between", value1, value2, "ispave");
            return (Criteria) this;
        }

        public Criteria andIspaveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ispave not between", value1, value2, "ispave");
            return (Criteria) this;
        }

        public Criteria andWindThresholdIsNull() {
            addCriterion("wind_threshold is null");
            return (Criteria) this;
        }

        public Criteria andWindThresholdIsNotNull() {
            addCriterion("wind_threshold is not null");
            return (Criteria) this;
        }

        public Criteria andWindThresholdEqualTo(Double value) {
            addCriterion("wind_threshold =", value, "windThreshold");
            return (Criteria) this;
        }

        public Criteria andWindThresholdNotEqualTo(Double value) {
            addCriterion("wind_threshold <>", value, "windThreshold");
            return (Criteria) this;
        }

        public Criteria andWindThresholdGreaterThan(Double value) {
            addCriterion("wind_threshold >", value, "windThreshold");
            return (Criteria) this;
        }

        public Criteria andWindThresholdGreaterThanOrEqualTo(Double value) {
            addCriterion("wind_threshold >=", value, "windThreshold");
            return (Criteria) this;
        }

        public Criteria andWindThresholdLessThan(Double value) {
            addCriterion("wind_threshold <", value, "windThreshold");
            return (Criteria) this;
        }

        public Criteria andWindThresholdLessThanOrEqualTo(Double value) {
            addCriterion("wind_threshold <=", value, "windThreshold");
            return (Criteria) this;
        }

        public Criteria andWindThresholdIn(List<Double> values) {
            addCriterion("wind_threshold in", values, "windThreshold");
            return (Criteria) this;
        }

        public Criteria andWindThresholdNotIn(List<Double> values) {
            addCriterion("wind_threshold not in", values, "windThreshold");
            return (Criteria) this;
        }

        public Criteria andWindThresholdBetween(Double value1, Double value2) {
            addCriterion("wind_threshold between", value1, value2, "windThreshold");
            return (Criteria) this;
        }

        public Criteria andWindThresholdNotBetween(Double value1, Double value2) {
            addCriterion("wind_threshold not between", value1, value2, "windThreshold");
            return (Criteria) this;
        }

        public Criteria andUwindValueIsNull() {
            addCriterion("uwind_value is null");
            return (Criteria) this;
        }

        public Criteria andUwindValueIsNotNull() {
            addCriterion("uwind_value is not null");
            return (Criteria) this;
        }

        public Criteria andUwindValueEqualTo(Double value) {
            addCriterion("uwind_value =", value, "uwindValue");
            return (Criteria) this;
        }

        public Criteria andUwindValueNotEqualTo(Double value) {
            addCriterion("uwind_value <>", value, "uwindValue");
            return (Criteria) this;
        }

        public Criteria andUwindValueGreaterThan(Double value) {
            addCriterion("uwind_value >", value, "uwindValue");
            return (Criteria) this;
        }

        public Criteria andUwindValueGreaterThanOrEqualTo(Double value) {
            addCriterion("uwind_value >=", value, "uwindValue");
            return (Criteria) this;
        }

        public Criteria andUwindValueLessThan(Double value) {
            addCriterion("uwind_value <", value, "uwindValue");
            return (Criteria) this;
        }

        public Criteria andUwindValueLessThanOrEqualTo(Double value) {
            addCriterion("uwind_value <=", value, "uwindValue");
            return (Criteria) this;
        }

        public Criteria andUwindValueIn(List<Double> values) {
            addCriterion("uwind_value in", values, "uwindValue");
            return (Criteria) this;
        }

        public Criteria andUwindValueNotIn(List<Double> values) {
            addCriterion("uwind_value not in", values, "uwindValue");
            return (Criteria) this;
        }

        public Criteria andUwindValueBetween(Double value1, Double value2) {
            addCriterion("uwind_value between", value1, value2, "uwindValue");
            return (Criteria) this;
        }

        public Criteria andUwindValueNotBetween(Double value1, Double value2) {
            addCriterion("uwind_value not between", value1, value2, "uwindValue");
            return (Criteria) this;
        }

        public Criteria andMWindnumIsNull() {
            addCriterion("m_windnum is null");
            return (Criteria) this;
        }

        public Criteria andMWindnumIsNotNull() {
            addCriterion("m_windnum is not null");
            return (Criteria) this;
        }

        public Criteria andMWindnumEqualTo(Integer value) {
            addCriterion("m_windnum =", value, "mWindnum");
            return (Criteria) this;
        }

        public Criteria andMWindnumNotEqualTo(Integer value) {
            addCriterion("m_windnum <>", value, "mWindnum");
            return (Criteria) this;
        }

        public Criteria andMWindnumGreaterThan(Integer value) {
            addCriterion("m_windnum >", value, "mWindnum");
            return (Criteria) this;
        }

        public Criteria andMWindnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_windnum >=", value, "mWindnum");
            return (Criteria) this;
        }

        public Criteria andMWindnumLessThan(Integer value) {
            addCriterion("m_windnum <", value, "mWindnum");
            return (Criteria) this;
        }

        public Criteria andMWindnumLessThanOrEqualTo(Integer value) {
            addCriterion("m_windnum <=", value, "mWindnum");
            return (Criteria) this;
        }

        public Criteria andMWindnumIn(List<Integer> values) {
            addCriterion("m_windnum in", values, "mWindnum");
            return (Criteria) this;
        }

        public Criteria andMWindnumNotIn(List<Integer> values) {
            addCriterion("m_windnum not in", values, "mWindnum");
            return (Criteria) this;
        }

        public Criteria andMWindnumBetween(Integer value1, Integer value2) {
            addCriterion("m_windnum between", value1, value2, "mWindnum");
            return (Criteria) this;
        }

        public Criteria andMWindnumNotBetween(Integer value1, Integer value2) {
            addCriterion("m_windnum not between", value1, value2, "mWindnum");
            return (Criteria) this;
        }

        public Criteria andDusttypeIsNull() {
            addCriterion("dusttype is null");
            return (Criteria) this;
        }

        public Criteria andDusttypeIsNotNull() {
            addCriterion("dusttype is not null");
            return (Criteria) this;
        }

        public Criteria andDusttypeEqualTo(Byte value) {
            addCriterion("dusttype =", value, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeNotEqualTo(Byte value) {
            addCriterion("dusttype <>", value, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeGreaterThan(Byte value) {
            addCriterion("dusttype >", value, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("dusttype >=", value, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeLessThan(Byte value) {
            addCriterion("dusttype <", value, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeLessThanOrEqualTo(Byte value) {
            addCriterion("dusttype <=", value, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeIn(List<Byte> values) {
            addCriterion("dusttype in", values, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeNotIn(List<Byte> values) {
            addCriterion("dusttype not in", values, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeBetween(Byte value1, Byte value2) {
            addCriterion("dusttype between", value1, value2, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeNotBetween(Byte value1, Byte value2) {
            addCriterion("dusttype not between", value1, value2, "dusttype");
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