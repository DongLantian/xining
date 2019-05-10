package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class MytempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MytempExample() {
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

        public Criteria andSourceTypeIsNull() {
            addCriterion("source_type is null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNotNull() {
            addCriterion("source_type is not null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeEqualTo(String value) {
            addCriterion("source_type =", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotEqualTo(String value) {
            addCriterion("source_type <>", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThan(String value) {
            addCriterion("source_type >", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("source_type >=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThan(String value) {
            addCriterion("source_type <", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThanOrEqualTo(String value) {
            addCriterion("source_type <=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLike(String value) {
            addCriterion("source_type like", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotLike(String value) {
            addCriterion("source_type not like", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIn(List<String> values) {
            addCriterion("source_type in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotIn(List<String> values) {
            addCriterion("source_type not in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeBetween(String value1, String value2) {
            addCriterion("source_type between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotBetween(String value1, String value2) {
            addCriterion("source_type not between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("MODEL is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("MODEL =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("MODEL <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("MODEL >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("MODEL <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("MODEL <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("MODEL like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("MODEL not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("MODEL in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("MODEL not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("MODEL between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("MODEL not between", value1, value2, "model");
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
            addCriterion("county_Id is null");
            return (Criteria) this;
        }

        public Criteria andCountyIdIsNotNull() {
            addCriterion("county_Id is not null");
            return (Criteria) this;
        }

        public Criteria andCountyIdEqualTo(String value) {
            addCriterion("county_Id =", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotEqualTo(String value) {
            addCriterion("county_Id <>", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdGreaterThan(String value) {
            addCriterion("county_Id >", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdGreaterThanOrEqualTo(String value) {
            addCriterion("county_Id >=", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLessThan(String value) {
            addCriterion("county_Id <", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLessThanOrEqualTo(String value) {
            addCriterion("county_Id <=", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLike(String value) {
            addCriterion("county_Id like", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotLike(String value) {
            addCriterion("county_Id not like", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdIn(List<String> values) {
            addCriterion("county_Id in", values, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotIn(List<String> values) {
            addCriterion("county_Id not in", values, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdBetween(String value1, String value2) {
            addCriterion("county_Id between", value1, value2, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotBetween(String value1, String value2) {
            addCriterion("county_Id not between", value1, value2, "countyId");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIsNull() {
            addCriterion("factory_name is null");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIsNotNull() {
            addCriterion("factory_name is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryNameEqualTo(String value) {
            addCriterion("factory_name =", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotEqualTo(String value) {
            addCriterion("factory_name <>", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameGreaterThan(String value) {
            addCriterion("factory_name >", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("factory_name >=", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLessThan(String value) {
            addCriterion("factory_name <", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLessThanOrEqualTo(String value) {
            addCriterion("factory_name <=", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLike(String value) {
            addCriterion("factory_name like", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotLike(String value) {
            addCriterion("factory_name not like", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIn(List<String> values) {
            addCriterion("factory_name in", values, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotIn(List<String> values) {
            addCriterion("factory_name not in", values, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameBetween(String value1, String value2) {
            addCriterion("factory_name between", value1, value2, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotBetween(String value1, String value2) {
            addCriterion("factory_name not between", value1, value2, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNo1IsNull() {
            addCriterion("factory_no1 is null");
            return (Criteria) this;
        }

        public Criteria andFactoryNo1IsNotNull() {
            addCriterion("factory_no1 is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryNo1EqualTo(String value) {
            addCriterion("factory_no1 =", value, "factoryNo1");
            return (Criteria) this;
        }

        public Criteria andFactoryNo1NotEqualTo(String value) {
            addCriterion("factory_no1 <>", value, "factoryNo1");
            return (Criteria) this;
        }

        public Criteria andFactoryNo1GreaterThan(String value) {
            addCriterion("factory_no1 >", value, "factoryNo1");
            return (Criteria) this;
        }

        public Criteria andFactoryNo1GreaterThanOrEqualTo(String value) {
            addCriterion("factory_no1 >=", value, "factoryNo1");
            return (Criteria) this;
        }

        public Criteria andFactoryNo1LessThan(String value) {
            addCriterion("factory_no1 <", value, "factoryNo1");
            return (Criteria) this;
        }

        public Criteria andFactoryNo1LessThanOrEqualTo(String value) {
            addCriterion("factory_no1 <=", value, "factoryNo1");
            return (Criteria) this;
        }

        public Criteria andFactoryNo1Like(String value) {
            addCriterion("factory_no1 like", value, "factoryNo1");
            return (Criteria) this;
        }

        public Criteria andFactoryNo1NotLike(String value) {
            addCriterion("factory_no1 not like", value, "factoryNo1");
            return (Criteria) this;
        }

        public Criteria andFactoryNo1In(List<String> values) {
            addCriterion("factory_no1 in", values, "factoryNo1");
            return (Criteria) this;
        }

        public Criteria andFactoryNo1NotIn(List<String> values) {
            addCriterion("factory_no1 not in", values, "factoryNo1");
            return (Criteria) this;
        }

        public Criteria andFactoryNo1Between(String value1, String value2) {
            addCriterion("factory_no1 between", value1, value2, "factoryNo1");
            return (Criteria) this;
        }

        public Criteria andFactoryNo1NotBetween(String value1, String value2) {
            addCriterion("factory_no1 not between", value1, value2, "factoryNo1");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIsNull() {
            addCriterion("industry_id is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIsNotNull() {
            addCriterion("industry_id is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryIdEqualTo(String value) {
            addCriterion("industry_id =", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotEqualTo(String value) {
            addCriterion("industry_id <>", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdGreaterThan(String value) {
            addCriterion("industry_id >", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdGreaterThanOrEqualTo(String value) {
            addCriterion("industry_id >=", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdLessThan(String value) {
            addCriterion("industry_id <", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdLessThanOrEqualTo(String value) {
            addCriterion("industry_id <=", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdLike(String value) {
            addCriterion("industry_id like", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotLike(String value) {
            addCriterion("industry_id not like", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIn(List<String> values) {
            addCriterion("industry_id in", values, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotIn(List<String> values) {
            addCriterion("industry_id not in", values, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdBetween(String value1, String value2) {
            addCriterion("industry_id between", value1, value2, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotBetween(String value1, String value2) {
            addCriterion("industry_id not between", value1, value2, "industryId");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andFactoryLongitudeIsNull() {
            addCriterion("factory_longitude is null");
            return (Criteria) this;
        }

        public Criteria andFactoryLongitudeIsNotNull() {
            addCriterion("factory_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryLongitudeEqualTo(Double value) {
            addCriterion("factory_longitude =", value, "factoryLongitude");
            return (Criteria) this;
        }

        public Criteria andFactoryLongitudeNotEqualTo(Double value) {
            addCriterion("factory_longitude <>", value, "factoryLongitude");
            return (Criteria) this;
        }

        public Criteria andFactoryLongitudeGreaterThan(Double value) {
            addCriterion("factory_longitude >", value, "factoryLongitude");
            return (Criteria) this;
        }

        public Criteria andFactoryLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("factory_longitude >=", value, "factoryLongitude");
            return (Criteria) this;
        }

        public Criteria andFactoryLongitudeLessThan(Double value) {
            addCriterion("factory_longitude <", value, "factoryLongitude");
            return (Criteria) this;
        }

        public Criteria andFactoryLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("factory_longitude <=", value, "factoryLongitude");
            return (Criteria) this;
        }

        public Criteria andFactoryLongitudeIn(List<Double> values) {
            addCriterion("factory_longitude in", values, "factoryLongitude");
            return (Criteria) this;
        }

        public Criteria andFactoryLongitudeNotIn(List<Double> values) {
            addCriterion("factory_longitude not in", values, "factoryLongitude");
            return (Criteria) this;
        }

        public Criteria andFactoryLongitudeBetween(Double value1, Double value2) {
            addCriterion("factory_longitude between", value1, value2, "factoryLongitude");
            return (Criteria) this;
        }

        public Criteria andFactoryLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("factory_longitude not between", value1, value2, "factoryLongitude");
            return (Criteria) this;
        }

        public Criteria andFactoryLatitudeIsNull() {
            addCriterion("factory_latitude is null");
            return (Criteria) this;
        }

        public Criteria andFactoryLatitudeIsNotNull() {
            addCriterion("factory_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryLatitudeEqualTo(Double value) {
            addCriterion("factory_latitude =", value, "factoryLatitude");
            return (Criteria) this;
        }

        public Criteria andFactoryLatitudeNotEqualTo(Double value) {
            addCriterion("factory_latitude <>", value, "factoryLatitude");
            return (Criteria) this;
        }

        public Criteria andFactoryLatitudeGreaterThan(Double value) {
            addCriterion("factory_latitude >", value, "factoryLatitude");
            return (Criteria) this;
        }

        public Criteria andFactoryLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("factory_latitude >=", value, "factoryLatitude");
            return (Criteria) this;
        }

        public Criteria andFactoryLatitudeLessThan(Double value) {
            addCriterion("factory_latitude <", value, "factoryLatitude");
            return (Criteria) this;
        }

        public Criteria andFactoryLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("factory_latitude <=", value, "factoryLatitude");
            return (Criteria) this;
        }

        public Criteria andFactoryLatitudeIn(List<Double> values) {
            addCriterion("factory_latitude in", values, "factoryLatitude");
            return (Criteria) this;
        }

        public Criteria andFactoryLatitudeNotIn(List<Double> values) {
            addCriterion("factory_latitude not in", values, "factoryLatitude");
            return (Criteria) this;
        }

        public Criteria andFactoryLatitudeBetween(Double value1, Double value2) {
            addCriterion("factory_latitude between", value1, value2, "factoryLatitude");
            return (Criteria) this;
        }

        public Criteria andFactoryLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("factory_latitude not between", value1, value2, "factoryLatitude");
            return (Criteria) this;
        }

        public Criteria andTboilerNumIsNull() {
            addCriterion("TBOILER_NUM is null");
            return (Criteria) this;
        }

        public Criteria andTboilerNumIsNotNull() {
            addCriterion("TBOILER_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andTboilerNumEqualTo(Integer value) {
            addCriterion("TBOILER_NUM =", value, "tboilerNum");
            return (Criteria) this;
        }

        public Criteria andTboilerNumNotEqualTo(Integer value) {
            addCriterion("TBOILER_NUM <>", value, "tboilerNum");
            return (Criteria) this;
        }

        public Criteria andTboilerNumGreaterThan(Integer value) {
            addCriterion("TBOILER_NUM >", value, "tboilerNum");
            return (Criteria) this;
        }

        public Criteria andTboilerNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("TBOILER_NUM >=", value, "tboilerNum");
            return (Criteria) this;
        }

        public Criteria andTboilerNumLessThan(Integer value) {
            addCriterion("TBOILER_NUM <", value, "tboilerNum");
            return (Criteria) this;
        }

        public Criteria andTboilerNumLessThanOrEqualTo(Integer value) {
            addCriterion("TBOILER_NUM <=", value, "tboilerNum");
            return (Criteria) this;
        }

        public Criteria andTboilerNumIn(List<Integer> values) {
            addCriterion("TBOILER_NUM in", values, "tboilerNum");
            return (Criteria) this;
        }

        public Criteria andTboilerNumNotIn(List<Integer> values) {
            addCriterion("TBOILER_NUM not in", values, "tboilerNum");
            return (Criteria) this;
        }

        public Criteria andTboilerNumBetween(Integer value1, Integer value2) {
            addCriterion("TBOILER_NUM between", value1, value2, "tboilerNum");
            return (Criteria) this;
        }

        public Criteria andTboilerNumNotBetween(Integer value1, Integer value2) {
            addCriterion("TBOILER_NUM not between", value1, value2, "tboilerNum");
            return (Criteria) this;
        }

        public Criteria andTboilerTonsIsNull() {
            addCriterion("TBOILER_TONS is null");
            return (Criteria) this;
        }

        public Criteria andTboilerTonsIsNotNull() {
            addCriterion("TBOILER_TONS is not null");
            return (Criteria) this;
        }

        public Criteria andTboilerTonsEqualTo(Double value) {
            addCriterion("TBOILER_TONS =", value, "tboilerTons");
            return (Criteria) this;
        }

        public Criteria andTboilerTonsNotEqualTo(Double value) {
            addCriterion("TBOILER_TONS <>", value, "tboilerTons");
            return (Criteria) this;
        }

        public Criteria andTboilerTonsGreaterThan(Double value) {
            addCriterion("TBOILER_TONS >", value, "tboilerTons");
            return (Criteria) this;
        }

        public Criteria andTboilerTonsGreaterThanOrEqualTo(Double value) {
            addCriterion("TBOILER_TONS >=", value, "tboilerTons");
            return (Criteria) this;
        }

        public Criteria andTboilerTonsLessThan(Double value) {
            addCriterion("TBOILER_TONS <", value, "tboilerTons");
            return (Criteria) this;
        }

        public Criteria andTboilerTonsLessThanOrEqualTo(Double value) {
            addCriterion("TBOILER_TONS <=", value, "tboilerTons");
            return (Criteria) this;
        }

        public Criteria andTboilerTonsIn(List<Double> values) {
            addCriterion("TBOILER_TONS in", values, "tboilerTons");
            return (Criteria) this;
        }

        public Criteria andTboilerTonsNotIn(List<Double> values) {
            addCriterion("TBOILER_TONS not in", values, "tboilerTons");
            return (Criteria) this;
        }

        public Criteria andTboilerTonsBetween(Double value1, Double value2) {
            addCriterion("TBOILER_TONS between", value1, value2, "tboilerTons");
            return (Criteria) this;
        }

        public Criteria andTboilerTonsNotBetween(Double value1, Double value2) {
            addCriterion("TBOILER_TONS not between", value1, value2, "tboilerTons");
            return (Criteria) this;
        }

        public Criteria andNoIsNull() {
            addCriterion("NO is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("NO is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(Integer value) {
            addCriterion("NO =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(Integer value) {
            addCriterion("NO <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(Integer value) {
            addCriterion("NO >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("NO >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(Integer value) {
            addCriterion("NO <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(Integer value) {
            addCriterion("NO <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<Integer> values) {
            addCriterion("NO in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<Integer> values) {
            addCriterion("NO not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(Integer value1, Integer value2) {
            addCriterion("NO between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(Integer value1, Integer value2) {
            addCriterion("NO not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andTonsIsNull() {
            addCriterion("TONS is null");
            return (Criteria) this;
        }

        public Criteria andTonsIsNotNull() {
            addCriterion("TONS is not null");
            return (Criteria) this;
        }

        public Criteria andTonsEqualTo(Double value) {
            addCriterion("TONS =", value, "tons");
            return (Criteria) this;
        }

        public Criteria andTonsNotEqualTo(Double value) {
            addCriterion("TONS <>", value, "tons");
            return (Criteria) this;
        }

        public Criteria andTonsGreaterThan(Double value) {
            addCriterion("TONS >", value, "tons");
            return (Criteria) this;
        }

        public Criteria andTonsGreaterThanOrEqualTo(Double value) {
            addCriterion("TONS >=", value, "tons");
            return (Criteria) this;
        }

        public Criteria andTonsLessThan(Double value) {
            addCriterion("TONS <", value, "tons");
            return (Criteria) this;
        }

        public Criteria andTonsLessThanOrEqualTo(Double value) {
            addCriterion("TONS <=", value, "tons");
            return (Criteria) this;
        }

        public Criteria andTonsIn(List<Double> values) {
            addCriterion("TONS in", values, "tons");
            return (Criteria) this;
        }

        public Criteria andTonsNotIn(List<Double> values) {
            addCriterion("TONS not in", values, "tons");
            return (Criteria) this;
        }

        public Criteria andTonsBetween(Double value1, Double value2) {
            addCriterion("TONS between", value1, value2, "tons");
            return (Criteria) this;
        }

        public Criteria andTonsNotBetween(Double value1, Double value2) {
            addCriterion("TONS not between", value1, value2, "tons");
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

        public Criteria andFueltypeIsNull() {
            addCriterion("FUELTYPE is null");
            return (Criteria) this;
        }

        public Criteria andFueltypeIsNotNull() {
            addCriterion("FUELTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFueltypeEqualTo(String value) {
            addCriterion("FUELTYPE =", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeNotEqualTo(String value) {
            addCriterion("FUELTYPE <>", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeGreaterThan(String value) {
            addCriterion("FUELTYPE >", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeGreaterThanOrEqualTo(String value) {
            addCriterion("FUELTYPE >=", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeLessThan(String value) {
            addCriterion("FUELTYPE <", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeLessThanOrEqualTo(String value) {
            addCriterion("FUELTYPE <=", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeLike(String value) {
            addCriterion("FUELTYPE like", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeNotLike(String value) {
            addCriterion("FUELTYPE not like", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeIn(List<String> values) {
            addCriterion("FUELTYPE in", values, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeNotIn(List<String> values) {
            addCriterion("FUELTYPE not in", values, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeBetween(String value1, String value2) {
            addCriterion("FUELTYPE between", value1, value2, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeNotBetween(String value1, String value2) {
            addCriterion("FUELTYPE not between", value1, value2, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFuelAusageIsNull() {
            addCriterion("FUEL_AUSAGE is null");
            return (Criteria) this;
        }

        public Criteria andFuelAusageIsNotNull() {
            addCriterion("FUEL_AUSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andFuelAusageEqualTo(Double value) {
            addCriterion("FUEL_AUSAGE =", value, "fuelAusage");
            return (Criteria) this;
        }

        public Criteria andFuelAusageNotEqualTo(Double value) {
            addCriterion("FUEL_AUSAGE <>", value, "fuelAusage");
            return (Criteria) this;
        }

        public Criteria andFuelAusageGreaterThan(Double value) {
            addCriterion("FUEL_AUSAGE >", value, "fuelAusage");
            return (Criteria) this;
        }

        public Criteria andFuelAusageGreaterThanOrEqualTo(Double value) {
            addCriterion("FUEL_AUSAGE >=", value, "fuelAusage");
            return (Criteria) this;
        }

        public Criteria andFuelAusageLessThan(Double value) {
            addCriterion("FUEL_AUSAGE <", value, "fuelAusage");
            return (Criteria) this;
        }

        public Criteria andFuelAusageLessThanOrEqualTo(Double value) {
            addCriterion("FUEL_AUSAGE <=", value, "fuelAusage");
            return (Criteria) this;
        }

        public Criteria andFuelAusageIn(List<Double> values) {
            addCriterion("FUEL_AUSAGE in", values, "fuelAusage");
            return (Criteria) this;
        }

        public Criteria andFuelAusageNotIn(List<Double> values) {
            addCriterion("FUEL_AUSAGE not in", values, "fuelAusage");
            return (Criteria) this;
        }

        public Criteria andFuelAusageBetween(Double value1, Double value2) {
            addCriterion("FUEL_AUSAGE between", value1, value2, "fuelAusage");
            return (Criteria) this;
        }

        public Criteria andFuelAusageNotBetween(Double value1, Double value2) {
            addCriterion("FUEL_AUSAGE not between", value1, value2, "fuelAusage");
            return (Criteria) this;
        }

        public Criteria andExfNoIsNull() {
            addCriterion("EXF_NO is null");
            return (Criteria) this;
        }

        public Criteria andExfNoIsNotNull() {
            addCriterion("EXF_NO is not null");
            return (Criteria) this;
        }

        public Criteria andExfNoEqualTo(String value) {
            addCriterion("EXF_NO =", value, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoNotEqualTo(String value) {
            addCriterion("EXF_NO <>", value, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoGreaterThan(String value) {
            addCriterion("EXF_NO >", value, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoGreaterThanOrEqualTo(String value) {
            addCriterion("EXF_NO >=", value, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoLessThan(String value) {
            addCriterion("EXF_NO <", value, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoLessThanOrEqualTo(String value) {
            addCriterion("EXF_NO <=", value, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoLike(String value) {
            addCriterion("EXF_NO like", value, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoNotLike(String value) {
            addCriterion("EXF_NO not like", value, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoIn(List<String> values) {
            addCriterion("EXF_NO in", values, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoNotIn(List<String> values) {
            addCriterion("EXF_NO not in", values, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoBetween(String value1, String value2) {
            addCriterion("EXF_NO between", value1, value2, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoNotBetween(String value1, String value2) {
            addCriterion("EXF_NO not between", value1, value2, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfHeightIsNull() {
            addCriterion("EXF_HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andExfHeightIsNotNull() {
            addCriterion("EXF_HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andExfHeightEqualTo(Double value) {
            addCriterion("EXF_HEIGHT =", value, "exfHeight");
            return (Criteria) this;
        }

        public Criteria andExfHeightNotEqualTo(Double value) {
            addCriterion("EXF_HEIGHT <>", value, "exfHeight");
            return (Criteria) this;
        }

        public Criteria andExfHeightGreaterThan(Double value) {
            addCriterion("EXF_HEIGHT >", value, "exfHeight");
            return (Criteria) this;
        }

        public Criteria andExfHeightGreaterThanOrEqualTo(Double value) {
            addCriterion("EXF_HEIGHT >=", value, "exfHeight");
            return (Criteria) this;
        }

        public Criteria andExfHeightLessThan(Double value) {
            addCriterion("EXF_HEIGHT <", value, "exfHeight");
            return (Criteria) this;
        }

        public Criteria andExfHeightLessThanOrEqualTo(Double value) {
            addCriterion("EXF_HEIGHT <=", value, "exfHeight");
            return (Criteria) this;
        }

        public Criteria andExfHeightIn(List<Double> values) {
            addCriterion("EXF_HEIGHT in", values, "exfHeight");
            return (Criteria) this;
        }

        public Criteria andExfHeightNotIn(List<Double> values) {
            addCriterion("EXF_HEIGHT not in", values, "exfHeight");
            return (Criteria) this;
        }

        public Criteria andExfHeightBetween(Double value1, Double value2) {
            addCriterion("EXF_HEIGHT between", value1, value2, "exfHeight");
            return (Criteria) this;
        }

        public Criteria andExfHeightNotBetween(Double value1, Double value2) {
            addCriterion("EXF_HEIGHT not between", value1, value2, "exfHeight");
            return (Criteria) this;
        }

        public Criteria andSmokeOutdIsNull() {
            addCriterion("SMOKE_OUTD is null");
            return (Criteria) this;
        }

        public Criteria andSmokeOutdIsNotNull() {
            addCriterion("SMOKE_OUTD is not null");
            return (Criteria) this;
        }

        public Criteria andSmokeOutdEqualTo(Double value) {
            addCriterion("SMOKE_OUTD =", value, "smokeOutd");
            return (Criteria) this;
        }

        public Criteria andSmokeOutdNotEqualTo(Double value) {
            addCriterion("SMOKE_OUTD <>", value, "smokeOutd");
            return (Criteria) this;
        }

        public Criteria andSmokeOutdGreaterThan(Double value) {
            addCriterion("SMOKE_OUTD >", value, "smokeOutd");
            return (Criteria) this;
        }

        public Criteria andSmokeOutdGreaterThanOrEqualTo(Double value) {
            addCriterion("SMOKE_OUTD >=", value, "smokeOutd");
            return (Criteria) this;
        }

        public Criteria andSmokeOutdLessThan(Double value) {
            addCriterion("SMOKE_OUTD <", value, "smokeOutd");
            return (Criteria) this;
        }

        public Criteria andSmokeOutdLessThanOrEqualTo(Double value) {
            addCriterion("SMOKE_OUTD <=", value, "smokeOutd");
            return (Criteria) this;
        }

        public Criteria andSmokeOutdIn(List<Double> values) {
            addCriterion("SMOKE_OUTD in", values, "smokeOutd");
            return (Criteria) this;
        }

        public Criteria andSmokeOutdNotIn(List<Double> values) {
            addCriterion("SMOKE_OUTD not in", values, "smokeOutd");
            return (Criteria) this;
        }

        public Criteria andSmokeOutdBetween(Double value1, Double value2) {
            addCriterion("SMOKE_OUTD between", value1, value2, "smokeOutd");
            return (Criteria) this;
        }

        public Criteria andSmokeOutdNotBetween(Double value1, Double value2) {
            addCriterion("SMOKE_OUTD not between", value1, value2, "smokeOutd");
            return (Criteria) this;
        }

        public Criteria andSmokeOUtteMIsNull() {
            addCriterion("SMOKE_O_UTTE_M is null");
            return (Criteria) this;
        }

        public Criteria andSmokeOUtteMIsNotNull() {
            addCriterion("SMOKE_O_UTTE_M is not null");
            return (Criteria) this;
        }

        public Criteria andSmokeOUtteMEqualTo(Double value) {
            addCriterion("SMOKE_O_UTTE_M =", value, "smokeOUtteM");
            return (Criteria) this;
        }

        public Criteria andSmokeOUtteMNotEqualTo(Double value) {
            addCriterion("SMOKE_O_UTTE_M <>", value, "smokeOUtteM");
            return (Criteria) this;
        }

        public Criteria andSmokeOUtteMGreaterThan(Double value) {
            addCriterion("SMOKE_O_UTTE_M >", value, "smokeOUtteM");
            return (Criteria) this;
        }

        public Criteria andSmokeOUtteMGreaterThanOrEqualTo(Double value) {
            addCriterion("SMOKE_O_UTTE_M >=", value, "smokeOUtteM");
            return (Criteria) this;
        }

        public Criteria andSmokeOUtteMLessThan(Double value) {
            addCriterion("SMOKE_O_UTTE_M <", value, "smokeOUtteM");
            return (Criteria) this;
        }

        public Criteria andSmokeOUtteMLessThanOrEqualTo(Double value) {
            addCriterion("SMOKE_O_UTTE_M <=", value, "smokeOUtteM");
            return (Criteria) this;
        }

        public Criteria andSmokeOUtteMIn(List<Double> values) {
            addCriterion("SMOKE_O_UTTE_M in", values, "smokeOUtteM");
            return (Criteria) this;
        }

        public Criteria andSmokeOUtteMNotIn(List<Double> values) {
            addCriterion("SMOKE_O_UTTE_M not in", values, "smokeOUtteM");
            return (Criteria) this;
        }

        public Criteria andSmokeOUtteMBetween(Double value1, Double value2) {
            addCriterion("SMOKE_O_UTTE_M between", value1, value2, "smokeOUtteM");
            return (Criteria) this;
        }

        public Criteria andSmokeOUtteMNotBetween(Double value1, Double value2) {
            addCriterion("SMOKE_O_UTTE_M not between", value1, value2, "smokeOUtteM");
            return (Criteria) this;
        }

        public Criteria andSmokeOutvIsNull() {
            addCriterion("SMOKE_OUTV is null");
            return (Criteria) this;
        }

        public Criteria andSmokeOutvIsNotNull() {
            addCriterion("SMOKE_OUTV is not null");
            return (Criteria) this;
        }

        public Criteria andSmokeOutvEqualTo(Double value) {
            addCriterion("SMOKE_OUTV =", value, "smokeOutv");
            return (Criteria) this;
        }

        public Criteria andSmokeOutvNotEqualTo(Double value) {
            addCriterion("SMOKE_OUTV <>", value, "smokeOutv");
            return (Criteria) this;
        }

        public Criteria andSmokeOutvGreaterThan(Double value) {
            addCriterion("SMOKE_OUTV >", value, "smokeOutv");
            return (Criteria) this;
        }

        public Criteria andSmokeOutvGreaterThanOrEqualTo(Double value) {
            addCriterion("SMOKE_OUTV >=", value, "smokeOutv");
            return (Criteria) this;
        }

        public Criteria andSmokeOutvLessThan(Double value) {
            addCriterion("SMOKE_OUTV <", value, "smokeOutv");
            return (Criteria) this;
        }

        public Criteria andSmokeOutvLessThanOrEqualTo(Double value) {
            addCriterion("SMOKE_OUTV <=", value, "smokeOutv");
            return (Criteria) this;
        }

        public Criteria andSmokeOutvIn(List<Double> values) {
            addCriterion("SMOKE_OUTV in", values, "smokeOutv");
            return (Criteria) this;
        }

        public Criteria andSmokeOutvNotIn(List<Double> values) {
            addCriterion("SMOKE_OUTV not in", values, "smokeOutv");
            return (Criteria) this;
        }

        public Criteria andSmokeOutvBetween(Double value1, Double value2) {
            addCriterion("SMOKE_OUTV between", value1, value2, "smokeOutv");
            return (Criteria) this;
        }

        public Criteria andSmokeOutvNotBetween(Double value1, Double value2) {
            addCriterion("SMOKE_OUTV not between", value1, value2, "smokeOutv");
            return (Criteria) this;
        }

        public Criteria andExfMaterialIsNull() {
            addCriterion("EXF_MATERIAL is null");
            return (Criteria) this;
        }

        public Criteria andExfMaterialIsNotNull() {
            addCriterion("EXF_MATERIAL is not null");
            return (Criteria) this;
        }

        public Criteria andExfMaterialEqualTo(String value) {
            addCriterion("EXF_MATERIAL =", value, "exfMaterial");
            return (Criteria) this;
        }

        public Criteria andExfMaterialNotEqualTo(String value) {
            addCriterion("EXF_MATERIAL <>", value, "exfMaterial");
            return (Criteria) this;
        }

        public Criteria andExfMaterialGreaterThan(String value) {
            addCriterion("EXF_MATERIAL >", value, "exfMaterial");
            return (Criteria) this;
        }

        public Criteria andExfMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("EXF_MATERIAL >=", value, "exfMaterial");
            return (Criteria) this;
        }

        public Criteria andExfMaterialLessThan(String value) {
            addCriterion("EXF_MATERIAL <", value, "exfMaterial");
            return (Criteria) this;
        }

        public Criteria andExfMaterialLessThanOrEqualTo(String value) {
            addCriterion("EXF_MATERIAL <=", value, "exfMaterial");
            return (Criteria) this;
        }

        public Criteria andExfMaterialLike(String value) {
            addCriterion("EXF_MATERIAL like", value, "exfMaterial");
            return (Criteria) this;
        }

        public Criteria andExfMaterialNotLike(String value) {
            addCriterion("EXF_MATERIAL not like", value, "exfMaterial");
            return (Criteria) this;
        }

        public Criteria andExfMaterialIn(List<String> values) {
            addCriterion("EXF_MATERIAL in", values, "exfMaterial");
            return (Criteria) this;
        }

        public Criteria andExfMaterialNotIn(List<String> values) {
            addCriterion("EXF_MATERIAL not in", values, "exfMaterial");
            return (Criteria) this;
        }

        public Criteria andExfMaterialBetween(String value1, String value2) {
            addCriterion("EXF_MATERIAL between", value1, value2, "exfMaterial");
            return (Criteria) this;
        }

        public Criteria andExfMaterialNotBetween(String value1, String value2) {
            addCriterion("EXF_MATERIAL not between", value1, value2, "exfMaterial");
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

        public Criteria andVocIsNull() {
            addCriterion("voc is null");
            return (Criteria) this;
        }

        public Criteria andVocIsNotNull() {
            addCriterion("voc is not null");
            return (Criteria) this;
        }

        public Criteria andVocEqualTo(Double value) {
            addCriterion("voc =", value, "voc");
            return (Criteria) this;
        }

        public Criteria andVocNotEqualTo(Double value) {
            addCriterion("voc <>", value, "voc");
            return (Criteria) this;
        }

        public Criteria andVocGreaterThan(Double value) {
            addCriterion("voc >", value, "voc");
            return (Criteria) this;
        }

        public Criteria andVocGreaterThanOrEqualTo(Double value) {
            addCriterion("voc >=", value, "voc");
            return (Criteria) this;
        }

        public Criteria andVocLessThan(Double value) {
            addCriterion("voc <", value, "voc");
            return (Criteria) this;
        }

        public Criteria andVocLessThanOrEqualTo(Double value) {
            addCriterion("voc <=", value, "voc");
            return (Criteria) this;
        }

        public Criteria andVocIn(List<Double> values) {
            addCriterion("voc in", values, "voc");
            return (Criteria) this;
        }

        public Criteria andVocNotIn(List<Double> values) {
            addCriterion("voc not in", values, "voc");
            return (Criteria) this;
        }

        public Criteria andVocBetween(Double value1, Double value2) {
            addCriterion("voc between", value1, value2, "voc");
            return (Criteria) this;
        }

        public Criteria andVocNotBetween(Double value1, Double value2) {
            addCriterion("voc not between", value1, value2, "voc");
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