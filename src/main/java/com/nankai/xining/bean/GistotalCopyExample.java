package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class GistotalCopyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GistotalCopyExample() {
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

        public Criteria andSourcetypeIsNull() {
            addCriterion("sourcetype is null");
            return (Criteria) this;
        }

        public Criteria andSourcetypeIsNotNull() {
            addCriterion("sourcetype is not null");
            return (Criteria) this;
        }

        public Criteria andSourcetypeEqualTo(String value) {
            addCriterion("sourcetype =", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotEqualTo(String value) {
            addCriterion("sourcetype <>", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeGreaterThan(String value) {
            addCriterion("sourcetype >", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeGreaterThanOrEqualTo(String value) {
            addCriterion("sourcetype >=", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeLessThan(String value) {
            addCriterion("sourcetype <", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeLessThanOrEqualTo(String value) {
            addCriterion("sourcetype <=", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeLike(String value) {
            addCriterion("sourcetype like", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotLike(String value) {
            addCriterion("sourcetype not like", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeIn(List<String> values) {
            addCriterion("sourcetype in", values, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotIn(List<String> values) {
            addCriterion("sourcetype not in", values, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeBetween(String value1, String value2) {
            addCriterion("sourcetype between", value1, value2, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotBetween(String value1, String value2) {
            addCriterion("sourcetype not between", value1, value2, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSo2IsNull() {
            addCriterion("so2 is null");
            return (Criteria) this;
        }

        public Criteria andSo2IsNotNull() {
            addCriterion("so2 is not null");
            return (Criteria) this;
        }

        public Criteria andSo2EqualTo(Double value) {
            addCriterion("so2 =", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2NotEqualTo(Double value) {
            addCriterion("so2 <>", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2GreaterThan(Double value) {
            addCriterion("so2 >", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2GreaterThanOrEqualTo(Double value) {
            addCriterion("so2 >=", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2LessThan(Double value) {
            addCriterion("so2 <", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2LessThanOrEqualTo(Double value) {
            addCriterion("so2 <=", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2In(List<Double> values) {
            addCriterion("so2 in", values, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2NotIn(List<Double> values) {
            addCriterion("so2 not in", values, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2Between(Double value1, Double value2) {
            addCriterion("so2 between", value1, value2, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2NotBetween(Double value1, Double value2) {
            addCriterion("so2 not between", value1, value2, "so2");
            return (Criteria) this;
        }

        public Criteria andVocsIsNull() {
            addCriterion("vocs is null");
            return (Criteria) this;
        }

        public Criteria andVocsIsNotNull() {
            addCriterion("vocs is not null");
            return (Criteria) this;
        }

        public Criteria andVocsEqualTo(Double value) {
            addCriterion("vocs =", value, "vocs");
            return (Criteria) this;
        }

        public Criteria andVocsNotEqualTo(Double value) {
            addCriterion("vocs <>", value, "vocs");
            return (Criteria) this;
        }

        public Criteria andVocsGreaterThan(Double value) {
            addCriterion("vocs >", value, "vocs");
            return (Criteria) this;
        }

        public Criteria andVocsGreaterThanOrEqualTo(Double value) {
            addCriterion("vocs >=", value, "vocs");
            return (Criteria) this;
        }

        public Criteria andVocsLessThan(Double value) {
            addCriterion("vocs <", value, "vocs");
            return (Criteria) this;
        }

        public Criteria andVocsLessThanOrEqualTo(Double value) {
            addCriterion("vocs <=", value, "vocs");
            return (Criteria) this;
        }

        public Criteria andVocsIn(List<Double> values) {
            addCriterion("vocs in", values, "vocs");
            return (Criteria) this;
        }

        public Criteria andVocsNotIn(List<Double> values) {
            addCriterion("vocs not in", values, "vocs");
            return (Criteria) this;
        }

        public Criteria andVocsBetween(Double value1, Double value2) {
            addCriterion("vocs between", value1, value2, "vocs");
            return (Criteria) this;
        }

        public Criteria andVocsNotBetween(Double value1, Double value2) {
            addCriterion("vocs not between", value1, value2, "vocs");
            return (Criteria) this;
        }

        public Criteria andCoIsNull() {
            addCriterion("co is null");
            return (Criteria) this;
        }

        public Criteria andCoIsNotNull() {
            addCriterion("co is not null");
            return (Criteria) this;
        }

        public Criteria andCoEqualTo(Double value) {
            addCriterion("co =", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoNotEqualTo(Double value) {
            addCriterion("co <>", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoGreaterThan(Double value) {
            addCriterion("co >", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoGreaterThanOrEqualTo(Double value) {
            addCriterion("co >=", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoLessThan(Double value) {
            addCriterion("co <", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoLessThanOrEqualTo(Double value) {
            addCriterion("co <=", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoIn(List<Double> values) {
            addCriterion("co in", values, "co");
            return (Criteria) this;
        }

        public Criteria andCoNotIn(List<Double> values) {
            addCriterion("co not in", values, "co");
            return (Criteria) this;
        }

        public Criteria andCoBetween(Double value1, Double value2) {
            addCriterion("co between", value1, value2, "co");
            return (Criteria) this;
        }

        public Criteria andCoNotBetween(Double value1, Double value2) {
            addCriterion("co not between", value1, value2, "co");
            return (Criteria) this;
        }

        public Criteria andNh3IsNull() {
            addCriterion("nh3 is null");
            return (Criteria) this;
        }

        public Criteria andNh3IsNotNull() {
            addCriterion("nh3 is not null");
            return (Criteria) this;
        }

        public Criteria andNh3EqualTo(Double value) {
            addCriterion("nh3 =", value, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3NotEqualTo(Double value) {
            addCriterion("nh3 <>", value, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3GreaterThan(Double value) {
            addCriterion("nh3 >", value, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3GreaterThanOrEqualTo(Double value) {
            addCriterion("nh3 >=", value, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3LessThan(Double value) {
            addCriterion("nh3 <", value, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3LessThanOrEqualTo(Double value) {
            addCriterion("nh3 <=", value, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3In(List<Double> values) {
            addCriterion("nh3 in", values, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3NotIn(List<Double> values) {
            addCriterion("nh3 not in", values, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3Between(Double value1, Double value2) {
            addCriterion("nh3 between", value1, value2, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3NotBetween(Double value1, Double value2) {
            addCriterion("nh3 not between", value1, value2, "nh3");
            return (Criteria) this;
        }

        public Criteria andPmIsNull() {
            addCriterion("pm is null");
            return (Criteria) this;
        }

        public Criteria andPmIsNotNull() {
            addCriterion("pm is not null");
            return (Criteria) this;
        }

        public Criteria andPmEqualTo(Double value) {
            addCriterion("pm =", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmNotEqualTo(Double value) {
            addCriterion("pm <>", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmGreaterThan(Double value) {
            addCriterion("pm >", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmGreaterThanOrEqualTo(Double value) {
            addCriterion("pm >=", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmLessThan(Double value) {
            addCriterion("pm <", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmLessThanOrEqualTo(Double value) {
            addCriterion("pm <=", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmIn(List<Double> values) {
            addCriterion("pm in", values, "pm");
            return (Criteria) this;
        }

        public Criteria andPmNotIn(List<Double> values) {
            addCriterion("pm not in", values, "pm");
            return (Criteria) this;
        }

        public Criteria andPmBetween(Double value1, Double value2) {
            addCriterion("pm between", value1, value2, "pm");
            return (Criteria) this;
        }

        public Criteria andPmNotBetween(Double value1, Double value2) {
            addCriterion("pm not between", value1, value2, "pm");
            return (Criteria) this;
        }

        public Criteria andPm25IsNull() {
            addCriterion("pm25 is null");
            return (Criteria) this;
        }

        public Criteria andPm25IsNotNull() {
            addCriterion("pm25 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25EqualTo(Double value) {
            addCriterion("pm25 =", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25NotEqualTo(Double value) {
            addCriterion("pm25 <>", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25GreaterThan(Double value) {
            addCriterion("pm25 >", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25GreaterThanOrEqualTo(Double value) {
            addCriterion("pm25 >=", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25LessThan(Double value) {
            addCriterion("pm25 <", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25LessThanOrEqualTo(Double value) {
            addCriterion("pm25 <=", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25In(List<Double> values) {
            addCriterion("pm25 in", values, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25NotIn(List<Double> values) {
            addCriterion("pm25 not in", values, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25Between(Double value1, Double value2) {
            addCriterion("pm25 between", value1, value2, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25NotBetween(Double value1, Double value2) {
            addCriterion("pm25 not between", value1, value2, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm10IsNull() {
            addCriterion("pm10 is null");
            return (Criteria) this;
        }

        public Criteria andPm10IsNotNull() {
            addCriterion("pm10 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10EqualTo(Double value) {
            addCriterion("pm10 =", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10NotEqualTo(Double value) {
            addCriterion("pm10 <>", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10GreaterThan(Double value) {
            addCriterion("pm10 >", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10GreaterThanOrEqualTo(Double value) {
            addCriterion("pm10 >=", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10LessThan(Double value) {
            addCriterion("pm10 <", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10LessThanOrEqualTo(Double value) {
            addCriterion("pm10 <=", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10In(List<Double> values) {
            addCriterion("pm10 in", values, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10NotIn(List<Double> values) {
            addCriterion("pm10 not in", values, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10Between(Double value1, Double value2) {
            addCriterion("pm10 between", value1, value2, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10NotBetween(Double value1, Double value2) {
            addCriterion("pm10 not between", value1, value2, "pm10");
            return (Criteria) this;
        }

        public Criteria andNoxIsNull() {
            addCriterion("nox is null");
            return (Criteria) this;
        }

        public Criteria andNoxIsNotNull() {
            addCriterion("nox is not null");
            return (Criteria) this;
        }

        public Criteria andNoxEqualTo(Double value) {
            addCriterion("nox =", value, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxNotEqualTo(Double value) {
            addCriterion("nox <>", value, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxGreaterThan(Double value) {
            addCriterion("nox >", value, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxGreaterThanOrEqualTo(Double value) {
            addCriterion("nox >=", value, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxLessThan(Double value) {
            addCriterion("nox <", value, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxLessThanOrEqualTo(Double value) {
            addCriterion("nox <=", value, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxIn(List<Double> values) {
            addCriterion("nox in", values, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxNotIn(List<Double> values) {
            addCriterion("nox not in", values, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxBetween(Double value1, Double value2) {
            addCriterion("nox between", value1, value2, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxNotBetween(Double value1, Double value2) {
            addCriterion("nox not between", value1, value2, "nox");
            return (Criteria) this;
        }

        public Criteria andBcIsNull() {
            addCriterion("bc is null");
            return (Criteria) this;
        }

        public Criteria andBcIsNotNull() {
            addCriterion("bc is not null");
            return (Criteria) this;
        }

        public Criteria andBcEqualTo(Double value) {
            addCriterion("bc =", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcNotEqualTo(Double value) {
            addCriterion("bc <>", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcGreaterThan(Double value) {
            addCriterion("bc >", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcGreaterThanOrEqualTo(Double value) {
            addCriterion("bc >=", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcLessThan(Double value) {
            addCriterion("bc <", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcLessThanOrEqualTo(Double value) {
            addCriterion("bc <=", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcIn(List<Double> values) {
            addCriterion("bc in", values, "bc");
            return (Criteria) this;
        }

        public Criteria andBcNotIn(List<Double> values) {
            addCriterion("bc not in", values, "bc");
            return (Criteria) this;
        }

        public Criteria andBcBetween(Double value1, Double value2) {
            addCriterion("bc between", value1, value2, "bc");
            return (Criteria) this;
        }

        public Criteria andBcNotBetween(Double value1, Double value2) {
            addCriterion("bc not between", value1, value2, "bc");
            return (Criteria) this;
        }

        public Criteria andOcIsNull() {
            addCriterion("oc is null");
            return (Criteria) this;
        }

        public Criteria andOcIsNotNull() {
            addCriterion("oc is not null");
            return (Criteria) this;
        }

        public Criteria andOcEqualTo(Double value) {
            addCriterion("oc =", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcNotEqualTo(Double value) {
            addCriterion("oc <>", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcGreaterThan(Double value) {
            addCriterion("oc >", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcGreaterThanOrEqualTo(Double value) {
            addCriterion("oc >=", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcLessThan(Double value) {
            addCriterion("oc <", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcLessThanOrEqualTo(Double value) {
            addCriterion("oc <=", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcIn(List<Double> values) {
            addCriterion("oc in", values, "oc");
            return (Criteria) this;
        }

        public Criteria andOcNotIn(List<Double> values) {
            addCriterion("oc not in", values, "oc");
            return (Criteria) this;
        }

        public Criteria andOcBetween(Double value1, Double value2) {
            addCriterion("oc between", value1, value2, "oc");
            return (Criteria) this;
        }

        public Criteria andOcNotBetween(Double value1, Double value2) {
            addCriterion("oc not between", value1, value2, "oc");
            return (Criteria) this;
        }

        public Criteria andHcIsNull() {
            addCriterion("hc is null");
            return (Criteria) this;
        }

        public Criteria andHcIsNotNull() {
            addCriterion("hc is not null");
            return (Criteria) this;
        }

        public Criteria andHcEqualTo(Double value) {
            addCriterion("hc =", value, "hc");
            return (Criteria) this;
        }

        public Criteria andHcNotEqualTo(Double value) {
            addCriterion("hc <>", value, "hc");
            return (Criteria) this;
        }

        public Criteria andHcGreaterThan(Double value) {
            addCriterion("hc >", value, "hc");
            return (Criteria) this;
        }

        public Criteria andHcGreaterThanOrEqualTo(Double value) {
            addCriterion("hc >=", value, "hc");
            return (Criteria) this;
        }

        public Criteria andHcLessThan(Double value) {
            addCriterion("hc <", value, "hc");
            return (Criteria) this;
        }

        public Criteria andHcLessThanOrEqualTo(Double value) {
            addCriterion("hc <=", value, "hc");
            return (Criteria) this;
        }

        public Criteria andHcIn(List<Double> values) {
            addCriterion("hc in", values, "hc");
            return (Criteria) this;
        }

        public Criteria andHcNotIn(List<Double> values) {
            addCriterion("hc not in", values, "hc");
            return (Criteria) this;
        }

        public Criteria andHcBetween(Double value1, Double value2) {
            addCriterion("hc between", value1, value2, "hc");
            return (Criteria) this;
        }

        public Criteria andHcNotBetween(Double value1, Double value2) {
            addCriterion("hc not between", value1, value2, "hc");
            return (Criteria) this;
        }

        public Criteria andEcIsNull() {
            addCriterion("ec is null");
            return (Criteria) this;
        }

        public Criteria andEcIsNotNull() {
            addCriterion("ec is not null");
            return (Criteria) this;
        }

        public Criteria andEcEqualTo(Double value) {
            addCriterion("ec =", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcNotEqualTo(Double value) {
            addCriterion("ec <>", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcGreaterThan(Double value) {
            addCriterion("ec >", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcGreaterThanOrEqualTo(Double value) {
            addCriterion("ec >=", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcLessThan(Double value) {
            addCriterion("ec <", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcLessThanOrEqualTo(Double value) {
            addCriterion("ec <=", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcIn(List<Double> values) {
            addCriterion("ec in", values, "ec");
            return (Criteria) this;
        }

        public Criteria andEcNotIn(List<Double> values) {
            addCriterion("ec not in", values, "ec");
            return (Criteria) this;
        }

        public Criteria andEcBetween(Double value1, Double value2) {
            addCriterion("ec between", value1, value2, "ec");
            return (Criteria) this;
        }

        public Criteria andEcNotBetween(Double value1, Double value2) {
            addCriterion("ec not between", value1, value2, "ec");
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