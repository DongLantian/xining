package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class XjsoildustExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XjsoildustExample() {
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

        public Criteria andSdIdIsNull() {
            addCriterion("sd_id is null");
            return (Criteria) this;
        }

        public Criteria andSdIdIsNotNull() {
            addCriterion("sd_id is not null");
            return (Criteria) this;
        }

        public Criteria andSdIdEqualTo(Integer value) {
            addCriterion("sd_id =", value, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdNotEqualTo(Integer value) {
            addCriterion("sd_id <>", value, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdGreaterThan(Integer value) {
            addCriterion("sd_id >", value, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sd_id >=", value, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdLessThan(Integer value) {
            addCriterion("sd_id <", value, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdLessThanOrEqualTo(Integer value) {
            addCriterion("sd_id <=", value, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdIn(List<Integer> values) {
            addCriterion("sd_id in", values, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdNotIn(List<Integer> values) {
            addCriterion("sd_id not in", values, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdBetween(Integer value1, Integer value2) {
            addCriterion("sd_id between", value1, value2, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sd_id not between", value1, value2, "sdId");
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

        public Criteria andSdYearIsNull() {
            addCriterion("sd_year is null");
            return (Criteria) this;
        }

        public Criteria andSdYearIsNotNull() {
            addCriterion("sd_year is not null");
            return (Criteria) this;
        }

        public Criteria andSdYearEqualTo(String value) {
            addCriterion("sd_year =", value, "sdYear");
            return (Criteria) this;
        }

        public Criteria andSdYearNotEqualTo(String value) {
            addCriterion("sd_year <>", value, "sdYear");
            return (Criteria) this;
        }

        public Criteria andSdYearGreaterThan(String value) {
            addCriterion("sd_year >", value, "sdYear");
            return (Criteria) this;
        }

        public Criteria andSdYearGreaterThanOrEqualTo(String value) {
            addCriterion("sd_year >=", value, "sdYear");
            return (Criteria) this;
        }

        public Criteria andSdYearLessThan(String value) {
            addCriterion("sd_year <", value, "sdYear");
            return (Criteria) this;
        }

        public Criteria andSdYearLessThanOrEqualTo(String value) {
            addCriterion("sd_year <=", value, "sdYear");
            return (Criteria) this;
        }

        public Criteria andSdYearLike(String value) {
            addCriterion("sd_year like", value, "sdYear");
            return (Criteria) this;
        }

        public Criteria andSdYearNotLike(String value) {
            addCriterion("sd_year not like", value, "sdYear");
            return (Criteria) this;
        }

        public Criteria andSdYearIn(List<String> values) {
            addCriterion("sd_year in", values, "sdYear");
            return (Criteria) this;
        }

        public Criteria andSdYearNotIn(List<String> values) {
            addCriterion("sd_year not in", values, "sdYear");
            return (Criteria) this;
        }

        public Criteria andSdYearBetween(String value1, String value2) {
            addCriterion("sd_year between", value1, value2, "sdYear");
            return (Criteria) this;
        }

        public Criteria andSdYearNotBetween(String value1, String value2) {
            addCriterion("sd_year not between", value1, value2, "sdYear");
            return (Criteria) this;
        }

        public Criteria andSdTakemeasuresIsNull() {
            addCriterion("sd_takemeasures is null");
            return (Criteria) this;
        }

        public Criteria andSdTakemeasuresIsNotNull() {
            addCriterion("sd_takemeasures is not null");
            return (Criteria) this;
        }

        public Criteria andSdTakemeasuresEqualTo(String value) {
            addCriterion("sd_takemeasures =", value, "sdTakemeasures");
            return (Criteria) this;
        }

        public Criteria andSdTakemeasuresNotEqualTo(String value) {
            addCriterion("sd_takemeasures <>", value, "sdTakemeasures");
            return (Criteria) this;
        }

        public Criteria andSdTakemeasuresGreaterThan(String value) {
            addCriterion("sd_takemeasures >", value, "sdTakemeasures");
            return (Criteria) this;
        }

        public Criteria andSdTakemeasuresGreaterThanOrEqualTo(String value) {
            addCriterion("sd_takemeasures >=", value, "sdTakemeasures");
            return (Criteria) this;
        }

        public Criteria andSdTakemeasuresLessThan(String value) {
            addCriterion("sd_takemeasures <", value, "sdTakemeasures");
            return (Criteria) this;
        }

        public Criteria andSdTakemeasuresLessThanOrEqualTo(String value) {
            addCriterion("sd_takemeasures <=", value, "sdTakemeasures");
            return (Criteria) this;
        }

        public Criteria andSdTakemeasuresLike(String value) {
            addCriterion("sd_takemeasures like", value, "sdTakemeasures");
            return (Criteria) this;
        }

        public Criteria andSdTakemeasuresNotLike(String value) {
            addCriterion("sd_takemeasures not like", value, "sdTakemeasures");
            return (Criteria) this;
        }

        public Criteria andSdTakemeasuresIn(List<String> values) {
            addCriterion("sd_takemeasures in", values, "sdTakemeasures");
            return (Criteria) this;
        }

        public Criteria andSdTakemeasuresNotIn(List<String> values) {
            addCriterion("sd_takemeasures not in", values, "sdTakemeasures");
            return (Criteria) this;
        }

        public Criteria andSdTakemeasuresBetween(String value1, String value2) {
            addCriterion("sd_takemeasures between", value1, value2, "sdTakemeasures");
            return (Criteria) this;
        }

        public Criteria andSdTakemeasuresNotBetween(String value1, String value2) {
            addCriterion("sd_takemeasures not between", value1, value2, "sdTakemeasures");
            return (Criteria) this;
        }

        public Criteria andSdUtypeIsNull() {
            addCriterion("sd_utype is null");
            return (Criteria) this;
        }

        public Criteria andSdUtypeIsNotNull() {
            addCriterion("sd_utype is not null");
            return (Criteria) this;
        }

        public Criteria andSdUtypeEqualTo(String value) {
            addCriterion("sd_utype =", value, "sdUtype");
            return (Criteria) this;
        }

        public Criteria andSdUtypeNotEqualTo(String value) {
            addCriterion("sd_utype <>", value, "sdUtype");
            return (Criteria) this;
        }

        public Criteria andSdUtypeGreaterThan(String value) {
            addCriterion("sd_utype >", value, "sdUtype");
            return (Criteria) this;
        }

        public Criteria andSdUtypeGreaterThanOrEqualTo(String value) {
            addCriterion("sd_utype >=", value, "sdUtype");
            return (Criteria) this;
        }

        public Criteria andSdUtypeLessThan(String value) {
            addCriterion("sd_utype <", value, "sdUtype");
            return (Criteria) this;
        }

        public Criteria andSdUtypeLessThanOrEqualTo(String value) {
            addCriterion("sd_utype <=", value, "sdUtype");
            return (Criteria) this;
        }

        public Criteria andSdUtypeLike(String value) {
            addCriterion("sd_utype like", value, "sdUtype");
            return (Criteria) this;
        }

        public Criteria andSdUtypeNotLike(String value) {
            addCriterion("sd_utype not like", value, "sdUtype");
            return (Criteria) this;
        }

        public Criteria andSdUtypeIn(List<String> values) {
            addCriterion("sd_utype in", values, "sdUtype");
            return (Criteria) this;
        }

        public Criteria andSdUtypeNotIn(List<String> values) {
            addCriterion("sd_utype not in", values, "sdUtype");
            return (Criteria) this;
        }

        public Criteria andSdUtypeBetween(String value1, String value2) {
            addCriterion("sd_utype between", value1, value2, "sdUtype");
            return (Criteria) this;
        }

        public Criteria andSdUtypeNotBetween(String value1, String value2) {
            addCriterion("sd_utype not between", value1, value2, "sdUtype");
            return (Criteria) this;
        }

        public Criteria andSdSoiltypeIsNull() {
            addCriterion("sd_soiltype is null");
            return (Criteria) this;
        }

        public Criteria andSdSoiltypeIsNotNull() {
            addCriterion("sd_soiltype is not null");
            return (Criteria) this;
        }

        public Criteria andSdSoiltypeEqualTo(String value) {
            addCriterion("sd_soiltype =", value, "sdSoiltype");
            return (Criteria) this;
        }

        public Criteria andSdSoiltypeNotEqualTo(String value) {
            addCriterion("sd_soiltype <>", value, "sdSoiltype");
            return (Criteria) this;
        }

        public Criteria andSdSoiltypeGreaterThan(String value) {
            addCriterion("sd_soiltype >", value, "sdSoiltype");
            return (Criteria) this;
        }

        public Criteria andSdSoiltypeGreaterThanOrEqualTo(String value) {
            addCriterion("sd_soiltype >=", value, "sdSoiltype");
            return (Criteria) this;
        }

        public Criteria andSdSoiltypeLessThan(String value) {
            addCriterion("sd_soiltype <", value, "sdSoiltype");
            return (Criteria) this;
        }

        public Criteria andSdSoiltypeLessThanOrEqualTo(String value) {
            addCriterion("sd_soiltype <=", value, "sdSoiltype");
            return (Criteria) this;
        }

        public Criteria andSdSoiltypeLike(String value) {
            addCriterion("sd_soiltype like", value, "sdSoiltype");
            return (Criteria) this;
        }

        public Criteria andSdSoiltypeNotLike(String value) {
            addCriterion("sd_soiltype not like", value, "sdSoiltype");
            return (Criteria) this;
        }

        public Criteria andSdSoiltypeIn(List<String> values) {
            addCriterion("sd_soiltype in", values, "sdSoiltype");
            return (Criteria) this;
        }

        public Criteria andSdSoiltypeNotIn(List<String> values) {
            addCriterion("sd_soiltype not in", values, "sdSoiltype");
            return (Criteria) this;
        }

        public Criteria andSdSoiltypeBetween(String value1, String value2) {
            addCriterion("sd_soiltype between", value1, value2, "sdSoiltype");
            return (Criteria) this;
        }

        public Criteria andSdSoiltypeNotBetween(String value1, String value2) {
            addCriterion("sd_soiltype not between", value1, value2, "sdSoiltype");
            return (Criteria) this;
        }

        public Criteria andSdAreaIsNull() {
            addCriterion("sd_area is null");
            return (Criteria) this;
        }

        public Criteria andSdAreaIsNotNull() {
            addCriterion("sd_area is not null");
            return (Criteria) this;
        }

        public Criteria andSdAreaEqualTo(Double value) {
            addCriterion("sd_area =", value, "sdArea");
            return (Criteria) this;
        }

        public Criteria andSdAreaNotEqualTo(Double value) {
            addCriterion("sd_area <>", value, "sdArea");
            return (Criteria) this;
        }

        public Criteria andSdAreaGreaterThan(Double value) {
            addCriterion("sd_area >", value, "sdArea");
            return (Criteria) this;
        }

        public Criteria andSdAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("sd_area >=", value, "sdArea");
            return (Criteria) this;
        }

        public Criteria andSdAreaLessThan(Double value) {
            addCriterion("sd_area <", value, "sdArea");
            return (Criteria) this;
        }

        public Criteria andSdAreaLessThanOrEqualTo(Double value) {
            addCriterion("sd_area <=", value, "sdArea");
            return (Criteria) this;
        }

        public Criteria andSdAreaIn(List<Double> values) {
            addCriterion("sd_area in", values, "sdArea");
            return (Criteria) this;
        }

        public Criteria andSdAreaNotIn(List<Double> values) {
            addCriterion("sd_area not in", values, "sdArea");
            return (Criteria) this;
        }

        public Criteria andSdAreaBetween(Double value1, Double value2) {
            addCriterion("sd_area between", value1, value2, "sdArea");
            return (Criteria) this;
        }

        public Criteria andSdAreaNotBetween(Double value1, Double value2) {
            addCriterion("sd_area not between", value1, value2, "sdArea");
            return (Criteria) this;
        }

        public Criteria andSoilindexpm25IsNull() {
            addCriterion("soilindexpm25 is null");
            return (Criteria) this;
        }

        public Criteria andSoilindexpm25IsNotNull() {
            addCriterion("soilindexpm25 is not null");
            return (Criteria) this;
        }

        public Criteria andSoilindexpm25EqualTo(Double value) {
            addCriterion("soilindexpm25 =", value, "soilindexpm25");
            return (Criteria) this;
        }

        public Criteria andSoilindexpm25NotEqualTo(Double value) {
            addCriterion("soilindexpm25 <>", value, "soilindexpm25");
            return (Criteria) this;
        }

        public Criteria andSoilindexpm25GreaterThan(Double value) {
            addCriterion("soilindexpm25 >", value, "soilindexpm25");
            return (Criteria) this;
        }

        public Criteria andSoilindexpm25GreaterThanOrEqualTo(Double value) {
            addCriterion("soilindexpm25 >=", value, "soilindexpm25");
            return (Criteria) this;
        }

        public Criteria andSoilindexpm25LessThan(Double value) {
            addCriterion("soilindexpm25 <", value, "soilindexpm25");
            return (Criteria) this;
        }

        public Criteria andSoilindexpm25LessThanOrEqualTo(Double value) {
            addCriterion("soilindexpm25 <=", value, "soilindexpm25");
            return (Criteria) this;
        }

        public Criteria andSoilindexpm25In(List<Double> values) {
            addCriterion("soilindexpm25 in", values, "soilindexpm25");
            return (Criteria) this;
        }

        public Criteria andSoilindexpm25NotIn(List<Double> values) {
            addCriterion("soilindexpm25 not in", values, "soilindexpm25");
            return (Criteria) this;
        }

        public Criteria andSoilindexpm25Between(Double value1, Double value2) {
            addCriterion("soilindexpm25 between", value1, value2, "soilindexpm25");
            return (Criteria) this;
        }

        public Criteria andSoilindexpm25NotBetween(Double value1, Double value2) {
            addCriterion("soilindexpm25 not between", value1, value2, "soilindexpm25");
            return (Criteria) this;
        }

        public Criteria andSoilindexpm10IsNull() {
            addCriterion("soilindexpm10 is null");
            return (Criteria) this;
        }

        public Criteria andSoilindexpm10IsNotNull() {
            addCriterion("soilindexpm10 is not null");
            return (Criteria) this;
        }

        public Criteria andSoilindexpm10EqualTo(Double value) {
            addCriterion("soilindexpm10 =", value, "soilindexpm10");
            return (Criteria) this;
        }

        public Criteria andSoilindexpm10NotEqualTo(Double value) {
            addCriterion("soilindexpm10 <>", value, "soilindexpm10");
            return (Criteria) this;
        }

        public Criteria andSoilindexpm10GreaterThan(Double value) {
            addCriterion("soilindexpm10 >", value, "soilindexpm10");
            return (Criteria) this;
        }

        public Criteria andSoilindexpm10GreaterThanOrEqualTo(Double value) {
            addCriterion("soilindexpm10 >=", value, "soilindexpm10");
            return (Criteria) this;
        }

        public Criteria andSoilindexpm10LessThan(Double value) {
            addCriterion("soilindexpm10 <", value, "soilindexpm10");
            return (Criteria) this;
        }

        public Criteria andSoilindexpm10LessThanOrEqualTo(Double value) {
            addCriterion("soilindexpm10 <=", value, "soilindexpm10");
            return (Criteria) this;
        }

        public Criteria andSoilindexpm10In(List<Double> values) {
            addCriterion("soilindexpm10 in", values, "soilindexpm10");
            return (Criteria) this;
        }

        public Criteria andSoilindexpm10NotIn(List<Double> values) {
            addCriterion("soilindexpm10 not in", values, "soilindexpm10");
            return (Criteria) this;
        }

        public Criteria andSoilindexpm10Between(Double value1, Double value2) {
            addCriterion("soilindexpm10 between", value1, value2, "soilindexpm10");
            return (Criteria) this;
        }

        public Criteria andSoilindexpm10NotBetween(Double value1, Double value2) {
            addCriterion("soilindexpm10 not between", value1, value2, "soilindexpm10");
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