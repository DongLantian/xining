package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FactoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FactoryExample() {
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

        public Criteria andFactoryIdIsNull() {
            addCriterion("factory_id is null");
            return (Criteria) this;
        }

        public Criteria andFactoryIdIsNotNull() {
            addCriterion("factory_id is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryIdEqualTo(Integer value) {
            addCriterion("factory_id =", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotEqualTo(Integer value) {
            addCriterion("factory_id <>", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdGreaterThan(Integer value) {
            addCriterion("factory_id >", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("factory_id >=", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdLessThan(Integer value) {
            addCriterion("factory_id <", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("factory_id <=", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdIn(List<Integer> values) {
            addCriterion("factory_id in", values, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotIn(List<Integer> values) {
            addCriterion("factory_id not in", values, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdBetween(Integer value1, Integer value2) {
            addCriterion("factory_id between", value1, value2, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("factory_id not between", value1, value2, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryNoIsNull() {
            addCriterion("factory_no is null");
            return (Criteria) this;
        }

        public Criteria andFactoryNoIsNotNull() {
            addCriterion("factory_no is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryNoEqualTo(String value) {
            addCriterion("factory_no =", value, "factoryNo");
            return (Criteria) this;
        }

        public Criteria andFactoryNoNotEqualTo(String value) {
            addCriterion("factory_no <>", value, "factoryNo");
            return (Criteria) this;
        }

        public Criteria andFactoryNoGreaterThan(String value) {
            addCriterion("factory_no >", value, "factoryNo");
            return (Criteria) this;
        }

        public Criteria andFactoryNoGreaterThanOrEqualTo(String value) {
            addCriterion("factory_no >=", value, "factoryNo");
            return (Criteria) this;
        }

        public Criteria andFactoryNoLessThan(String value) {
            addCriterion("factory_no <", value, "factoryNo");
            return (Criteria) this;
        }

        public Criteria andFactoryNoLessThanOrEqualTo(String value) {
            addCriterion("factory_no <=", value, "factoryNo");
            return (Criteria) this;
        }

        public Criteria andFactoryNoLike(String value) {
            addCriterion("factory_no like", value, "factoryNo");
            return (Criteria) this;
        }

        public Criteria andFactoryNoNotLike(String value) {
            addCriterion("factory_no not like", value, "factoryNo");
            return (Criteria) this;
        }

        public Criteria andFactoryNoIn(List<String> values) {
            addCriterion("factory_no in", values, "factoryNo");
            return (Criteria) this;
        }

        public Criteria andFactoryNoNotIn(List<String> values) {
            addCriterion("factory_no not in", values, "factoryNo");
            return (Criteria) this;
        }

        public Criteria andFactoryNoBetween(String value1, String value2) {
            addCriterion("factory_no between", value1, value2, "factoryNo");
            return (Criteria) this;
        }

        public Criteria andFactoryNoNotBetween(String value1, String value2) {
            addCriterion("factory_no not between", value1, value2, "factoryNo");
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

        public Criteria andFactoryNo2IsNull() {
            addCriterion("factory_no2 is null");
            return (Criteria) this;
        }

        public Criteria andFactoryNo2IsNotNull() {
            addCriterion("factory_no2 is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryNo2EqualTo(String value) {
            addCriterion("factory_no2 =", value, "factoryNo2");
            return (Criteria) this;
        }

        public Criteria andFactoryNo2NotEqualTo(String value) {
            addCriterion("factory_no2 <>", value, "factoryNo2");
            return (Criteria) this;
        }

        public Criteria andFactoryNo2GreaterThan(String value) {
            addCriterion("factory_no2 >", value, "factoryNo2");
            return (Criteria) this;
        }

        public Criteria andFactoryNo2GreaterThanOrEqualTo(String value) {
            addCriterion("factory_no2 >=", value, "factoryNo2");
            return (Criteria) this;
        }

        public Criteria andFactoryNo2LessThan(String value) {
            addCriterion("factory_no2 <", value, "factoryNo2");
            return (Criteria) this;
        }

        public Criteria andFactoryNo2LessThanOrEqualTo(String value) {
            addCriterion("factory_no2 <=", value, "factoryNo2");
            return (Criteria) this;
        }

        public Criteria andFactoryNo2Like(String value) {
            addCriterion("factory_no2 like", value, "factoryNo2");
            return (Criteria) this;
        }

        public Criteria andFactoryNo2NotLike(String value) {
            addCriterion("factory_no2 not like", value, "factoryNo2");
            return (Criteria) this;
        }

        public Criteria andFactoryNo2In(List<String> values) {
            addCriterion("factory_no2 in", values, "factoryNo2");
            return (Criteria) this;
        }

        public Criteria andFactoryNo2NotIn(List<String> values) {
            addCriterion("factory_no2 not in", values, "factoryNo2");
            return (Criteria) this;
        }

        public Criteria andFactoryNo2Between(String value1, String value2) {
            addCriterion("factory_no2 between", value1, value2, "factoryNo2");
            return (Criteria) this;
        }

        public Criteria andFactoryNo2NotBetween(String value1, String value2) {
            addCriterion("factory_no2 not between", value1, value2, "factoryNo2");
            return (Criteria) this;
        }

        public Criteria andLegalpersonIsNull() {
            addCriterion("legalperson is null");
            return (Criteria) this;
        }

        public Criteria andLegalpersonIsNotNull() {
            addCriterion("legalperson is not null");
            return (Criteria) this;
        }

        public Criteria andLegalpersonEqualTo(String value) {
            addCriterion("legalperson =", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNotEqualTo(String value) {
            addCriterion("legalperson <>", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonGreaterThan(String value) {
            addCriterion("legalperson >", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonGreaterThanOrEqualTo(String value) {
            addCriterion("legalperson >=", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonLessThan(String value) {
            addCriterion("legalperson <", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonLessThanOrEqualTo(String value) {
            addCriterion("legalperson <=", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonLike(String value) {
            addCriterion("legalperson like", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNotLike(String value) {
            addCriterion("legalperson not like", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonIn(List<String> values) {
            addCriterion("legalperson in", values, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNotIn(List<String> values) {
            addCriterion("legalperson not in", values, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonBetween(String value1, String value2) {
            addCriterion("legalperson between", value1, value2, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNotBetween(String value1, String value2) {
            addCriterion("legalperson not between", value1, value2, "legalperson");
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

        public Criteria andFactoryUsednameIsNull() {
            addCriterion("factory_usedname is null");
            return (Criteria) this;
        }

        public Criteria andFactoryUsednameIsNotNull() {
            addCriterion("factory_usedname is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryUsednameEqualTo(String value) {
            addCriterion("factory_usedname =", value, "factoryUsedname");
            return (Criteria) this;
        }

        public Criteria andFactoryUsednameNotEqualTo(String value) {
            addCriterion("factory_usedname <>", value, "factoryUsedname");
            return (Criteria) this;
        }

        public Criteria andFactoryUsednameGreaterThan(String value) {
            addCriterion("factory_usedname >", value, "factoryUsedname");
            return (Criteria) this;
        }

        public Criteria andFactoryUsednameGreaterThanOrEqualTo(String value) {
            addCriterion("factory_usedname >=", value, "factoryUsedname");
            return (Criteria) this;
        }

        public Criteria andFactoryUsednameLessThan(String value) {
            addCriterion("factory_usedname <", value, "factoryUsedname");
            return (Criteria) this;
        }

        public Criteria andFactoryUsednameLessThanOrEqualTo(String value) {
            addCriterion("factory_usedname <=", value, "factoryUsedname");
            return (Criteria) this;
        }

        public Criteria andFactoryUsednameLike(String value) {
            addCriterion("factory_usedname like", value, "factoryUsedname");
            return (Criteria) this;
        }

        public Criteria andFactoryUsednameNotLike(String value) {
            addCriterion("factory_usedname not like", value, "factoryUsedname");
            return (Criteria) this;
        }

        public Criteria andFactoryUsednameIn(List<String> values) {
            addCriterion("factory_usedname in", values, "factoryUsedname");
            return (Criteria) this;
        }

        public Criteria andFactoryUsednameNotIn(List<String> values) {
            addCriterion("factory_usedname not in", values, "factoryUsedname");
            return (Criteria) this;
        }

        public Criteria andFactoryUsednameBetween(String value1, String value2) {
            addCriterion("factory_usedname between", value1, value2, "factoryUsedname");
            return (Criteria) this;
        }

        public Criteria andFactoryUsednameNotBetween(String value1, String value2) {
            addCriterion("factory_usedname not between", value1, value2, "factoryUsedname");
            return (Criteria) this;
        }

        public Criteria andFactorySizeIsNull() {
            addCriterion("factory_size is null");
            return (Criteria) this;
        }

        public Criteria andFactorySizeIsNotNull() {
            addCriterion("factory_size is not null");
            return (Criteria) this;
        }

        public Criteria andFactorySizeEqualTo(String value) {
            addCriterion("factory_size =", value, "factorySize");
            return (Criteria) this;
        }

        public Criteria andFactorySizeNotEqualTo(String value) {
            addCriterion("factory_size <>", value, "factorySize");
            return (Criteria) this;
        }

        public Criteria andFactorySizeGreaterThan(String value) {
            addCriterion("factory_size >", value, "factorySize");
            return (Criteria) this;
        }

        public Criteria andFactorySizeGreaterThanOrEqualTo(String value) {
            addCriterion("factory_size >=", value, "factorySize");
            return (Criteria) this;
        }

        public Criteria andFactorySizeLessThan(String value) {
            addCriterion("factory_size <", value, "factorySize");
            return (Criteria) this;
        }

        public Criteria andFactorySizeLessThanOrEqualTo(String value) {
            addCriterion("factory_size <=", value, "factorySize");
            return (Criteria) this;
        }

        public Criteria andFactorySizeLike(String value) {
            addCriterion("factory_size like", value, "factorySize");
            return (Criteria) this;
        }

        public Criteria andFactorySizeNotLike(String value) {
            addCriterion("factory_size not like", value, "factorySize");
            return (Criteria) this;
        }

        public Criteria andFactorySizeIn(List<String> values) {
            addCriterion("factory_size in", values, "factorySize");
            return (Criteria) this;
        }

        public Criteria andFactorySizeNotIn(List<String> values) {
            addCriterion("factory_size not in", values, "factorySize");
            return (Criteria) this;
        }

        public Criteria andFactorySizeBetween(String value1, String value2) {
            addCriterion("factory_size between", value1, value2, "factorySize");
            return (Criteria) this;
        }

        public Criteria andFactorySizeNotBetween(String value1, String value2) {
            addCriterion("factory_size not between", value1, value2, "factorySize");
            return (Criteria) this;
        }

        public Criteria andCountyCityDecIsNull() {
            addCriterion("county_city_dec is null");
            return (Criteria) this;
        }

        public Criteria andCountyCityDecIsNotNull() {
            addCriterion("county_city_dec is not null");
            return (Criteria) this;
        }

        public Criteria andCountyCityDecEqualTo(String value) {
            addCriterion("county_city_dec =", value, "countyCityDec");
            return (Criteria) this;
        }

        public Criteria andCountyCityDecNotEqualTo(String value) {
            addCriterion("county_city_dec <>", value, "countyCityDec");
            return (Criteria) this;
        }

        public Criteria andCountyCityDecGreaterThan(String value) {
            addCriterion("county_city_dec >", value, "countyCityDec");
            return (Criteria) this;
        }

        public Criteria andCountyCityDecGreaterThanOrEqualTo(String value) {
            addCriterion("county_city_dec >=", value, "countyCityDec");
            return (Criteria) this;
        }

        public Criteria andCountyCityDecLessThan(String value) {
            addCriterion("county_city_dec <", value, "countyCityDec");
            return (Criteria) this;
        }

        public Criteria andCountyCityDecLessThanOrEqualTo(String value) {
            addCriterion("county_city_dec <=", value, "countyCityDec");
            return (Criteria) this;
        }

        public Criteria andCountyCityDecLike(String value) {
            addCriterion("county_city_dec like", value, "countyCityDec");
            return (Criteria) this;
        }

        public Criteria andCountyCityDecNotLike(String value) {
            addCriterion("county_city_dec not like", value, "countyCityDec");
            return (Criteria) this;
        }

        public Criteria andCountyCityDecIn(List<String> values) {
            addCriterion("county_city_dec in", values, "countyCityDec");
            return (Criteria) this;
        }

        public Criteria andCountyCityDecNotIn(List<String> values) {
            addCriterion("county_city_dec not in", values, "countyCityDec");
            return (Criteria) this;
        }

        public Criteria andCountyCityDecBetween(String value1, String value2) {
            addCriterion("county_city_dec between", value1, value2, "countyCityDec");
            return (Criteria) this;
        }

        public Criteria andCountyCityDecNotBetween(String value1, String value2) {
            addCriterion("county_city_dec not between", value1, value2, "countyCityDec");
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

        public Criteria andTotalValueIsNull() {
            addCriterion("total_value is null");
            return (Criteria) this;
        }

        public Criteria andTotalValueIsNotNull() {
            addCriterion("total_value is not null");
            return (Criteria) this;
        }

        public Criteria andTotalValueEqualTo(Double value) {
            addCriterion("total_value =", value, "totalValue");
            return (Criteria) this;
        }

        public Criteria andTotalValueNotEqualTo(Double value) {
            addCriterion("total_value <>", value, "totalValue");
            return (Criteria) this;
        }

        public Criteria andTotalValueGreaterThan(Double value) {
            addCriterion("total_value >", value, "totalValue");
            return (Criteria) this;
        }

        public Criteria andTotalValueGreaterThanOrEqualTo(Double value) {
            addCriterion("total_value >=", value, "totalValue");
            return (Criteria) this;
        }

        public Criteria andTotalValueLessThan(Double value) {
            addCriterion("total_value <", value, "totalValue");
            return (Criteria) this;
        }

        public Criteria andTotalValueLessThanOrEqualTo(Double value) {
            addCriterion("total_value <=", value, "totalValue");
            return (Criteria) this;
        }

        public Criteria andTotalValueIn(List<Double> values) {
            addCriterion("total_value in", values, "totalValue");
            return (Criteria) this;
        }

        public Criteria andTotalValueNotIn(List<Double> values) {
            addCriterion("total_value not in", values, "totalValue");
            return (Criteria) this;
        }

        public Criteria andTotalValueBetween(Double value1, Double value2) {
            addCriterion("total_value between", value1, value2, "totalValue");
            return (Criteria) this;
        }

        public Criteria andTotalValueNotBetween(Double value1, Double value2) {
            addCriterion("total_value not between", value1, value2, "totalValue");
            return (Criteria) this;
        }

        public Criteria andCountyNameIsNull() {
            addCriterion("county_name is null");
            return (Criteria) this;
        }

        public Criteria andCountyNameIsNotNull() {
            addCriterion("county_name is not null");
            return (Criteria) this;
        }

        public Criteria andCountyNameEqualTo(String value) {
            addCriterion("county_name =", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameNotEqualTo(String value) {
            addCriterion("county_name <>", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameGreaterThan(String value) {
            addCriterion("county_name >", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameGreaterThanOrEqualTo(String value) {
            addCriterion("county_name >=", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameLessThan(String value) {
            addCriterion("county_name <", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameLessThanOrEqualTo(String value) {
            addCriterion("county_name <=", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameLike(String value) {
            addCriterion("county_name like", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameNotLike(String value) {
            addCriterion("county_name not like", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameIn(List<String> values) {
            addCriterion("county_name in", values, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameNotIn(List<String> values) {
            addCriterion("county_name not in", values, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameBetween(String value1, String value2) {
            addCriterion("county_name between", value1, value2, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameNotBetween(String value1, String value2) {
            addCriterion("county_name not between", value1, value2, "countyName");
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

        public Criteria andIndustryBigidIsNull() {
            addCriterion("industry_bigid is null");
            return (Criteria) this;
        }

        public Criteria andIndustryBigidIsNotNull() {
            addCriterion("industry_bigid is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryBigidEqualTo(String value) {
            addCriterion("industry_bigid =", value, "industryBigid");
            return (Criteria) this;
        }

        public Criteria andIndustryBigidNotEqualTo(String value) {
            addCriterion("industry_bigid <>", value, "industryBigid");
            return (Criteria) this;
        }

        public Criteria andIndustryBigidGreaterThan(String value) {
            addCriterion("industry_bigid >", value, "industryBigid");
            return (Criteria) this;
        }

        public Criteria andIndustryBigidGreaterThanOrEqualTo(String value) {
            addCriterion("industry_bigid >=", value, "industryBigid");
            return (Criteria) this;
        }

        public Criteria andIndustryBigidLessThan(String value) {
            addCriterion("industry_bigid <", value, "industryBigid");
            return (Criteria) this;
        }

        public Criteria andIndustryBigidLessThanOrEqualTo(String value) {
            addCriterion("industry_bigid <=", value, "industryBigid");
            return (Criteria) this;
        }

        public Criteria andIndustryBigidLike(String value) {
            addCriterion("industry_bigid like", value, "industryBigid");
            return (Criteria) this;
        }

        public Criteria andIndustryBigidNotLike(String value) {
            addCriterion("industry_bigid not like", value, "industryBigid");
            return (Criteria) this;
        }

        public Criteria andIndustryBigidIn(List<String> values) {
            addCriterion("industry_bigid in", values, "industryBigid");
            return (Criteria) this;
        }

        public Criteria andIndustryBigidNotIn(List<String> values) {
            addCriterion("industry_bigid not in", values, "industryBigid");
            return (Criteria) this;
        }

        public Criteria andIndustryBigidBetween(String value1, String value2) {
            addCriterion("industry_bigid between", value1, value2, "industryBigid");
            return (Criteria) this;
        }

        public Criteria andIndustryBigidNotBetween(String value1, String value2) {
            addCriterion("industry_bigid not between", value1, value2, "industryBigid");
            return (Criteria) this;
        }

        public Criteria andIndustryNameIsNull() {
            addCriterion("industry_name is null");
            return (Criteria) this;
        }

        public Criteria andIndustryNameIsNotNull() {
            addCriterion("industry_name is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryNameEqualTo(String value) {
            addCriterion("industry_name =", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameNotEqualTo(String value) {
            addCriterion("industry_name <>", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameGreaterThan(String value) {
            addCriterion("industry_name >", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameGreaterThanOrEqualTo(String value) {
            addCriterion("industry_name >=", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameLessThan(String value) {
            addCriterion("industry_name <", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameLessThanOrEqualTo(String value) {
            addCriterion("industry_name <=", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameLike(String value) {
            addCriterion("industry_name like", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameNotLike(String value) {
            addCriterion("industry_name not like", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameIn(List<String> values) {
            addCriterion("industry_name in", values, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameNotIn(List<String> values) {
            addCriterion("industry_name not in", values, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameBetween(String value1, String value2) {
            addCriterion("industry_name between", value1, value2, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameNotBetween(String value1, String value2) {
            addCriterion("industry_name not between", value1, value2, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryBignameIsNull() {
            addCriterion("industry_bigname is null");
            return (Criteria) this;
        }

        public Criteria andIndustryBignameIsNotNull() {
            addCriterion("industry_bigname is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryBignameEqualTo(String value) {
            addCriterion("industry_bigname =", value, "industryBigname");
            return (Criteria) this;
        }

        public Criteria andIndustryBignameNotEqualTo(String value) {
            addCriterion("industry_bigname <>", value, "industryBigname");
            return (Criteria) this;
        }

        public Criteria andIndustryBignameGreaterThan(String value) {
            addCriterion("industry_bigname >", value, "industryBigname");
            return (Criteria) this;
        }

        public Criteria andIndustryBignameGreaterThanOrEqualTo(String value) {
            addCriterion("industry_bigname >=", value, "industryBigname");
            return (Criteria) this;
        }

        public Criteria andIndustryBignameLessThan(String value) {
            addCriterion("industry_bigname <", value, "industryBigname");
            return (Criteria) this;
        }

        public Criteria andIndustryBignameLessThanOrEqualTo(String value) {
            addCriterion("industry_bigname <=", value, "industryBigname");
            return (Criteria) this;
        }

        public Criteria andIndustryBignameLike(String value) {
            addCriterion("industry_bigname like", value, "industryBigname");
            return (Criteria) this;
        }

        public Criteria andIndustryBignameNotLike(String value) {
            addCriterion("industry_bigname not like", value, "industryBigname");
            return (Criteria) this;
        }

        public Criteria andIndustryBignameIn(List<String> values) {
            addCriterion("industry_bigname in", values, "industryBigname");
            return (Criteria) this;
        }

        public Criteria andIndustryBignameNotIn(List<String> values) {
            addCriterion("industry_bigname not in", values, "industryBigname");
            return (Criteria) this;
        }

        public Criteria andIndustryBignameBetween(String value1, String value2) {
            addCriterion("industry_bigname between", value1, value2, "industryBigname");
            return (Criteria) this;
        }

        public Criteria andIndustryBignameNotBetween(String value1, String value2) {
            addCriterion("industry_bigname not between", value1, value2, "industryBigname");
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

        public Criteria andAddressdetailIsNull() {
            addCriterion("addressdetail is null");
            return (Criteria) this;
        }

        public Criteria andAddressdetailIsNotNull() {
            addCriterion("addressdetail is not null");
            return (Criteria) this;
        }

        public Criteria andAddressdetailEqualTo(String value) {
            addCriterion("addressdetail =", value, "addressdetail");
            return (Criteria) this;
        }

        public Criteria andAddressdetailNotEqualTo(String value) {
            addCriterion("addressdetail <>", value, "addressdetail");
            return (Criteria) this;
        }

        public Criteria andAddressdetailGreaterThan(String value) {
            addCriterion("addressdetail >", value, "addressdetail");
            return (Criteria) this;
        }

        public Criteria andAddressdetailGreaterThanOrEqualTo(String value) {
            addCriterion("addressdetail >=", value, "addressdetail");
            return (Criteria) this;
        }

        public Criteria andAddressdetailLessThan(String value) {
            addCriterion("addressdetail <", value, "addressdetail");
            return (Criteria) this;
        }

        public Criteria andAddressdetailLessThanOrEqualTo(String value) {
            addCriterion("addressdetail <=", value, "addressdetail");
            return (Criteria) this;
        }

        public Criteria andAddressdetailLike(String value) {
            addCriterion("addressdetail like", value, "addressdetail");
            return (Criteria) this;
        }

        public Criteria andAddressdetailNotLike(String value) {
            addCriterion("addressdetail not like", value, "addressdetail");
            return (Criteria) this;
        }

        public Criteria andAddressdetailIn(List<String> values) {
            addCriterion("addressdetail in", values, "addressdetail");
            return (Criteria) this;
        }

        public Criteria andAddressdetailNotIn(List<String> values) {
            addCriterion("addressdetail not in", values, "addressdetail");
            return (Criteria) this;
        }

        public Criteria andAddressdetailBetween(String value1, String value2) {
            addCriterion("addressdetail between", value1, value2, "addressdetail");
            return (Criteria) this;
        }

        public Criteria andAddressdetailNotBetween(String value1, String value2) {
            addCriterion("addressdetail not between", value1, value2, "addressdetail");
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

        public Criteria andCountyRegisterCityDecIsNull() {
            addCriterion("county_register_city_dec is null");
            return (Criteria) this;
        }

        public Criteria andCountyRegisterCityDecIsNotNull() {
            addCriterion("county_register_city_dec is not null");
            return (Criteria) this;
        }

        public Criteria andCountyRegisterCityDecEqualTo(String value) {
            addCriterion("county_register_city_dec =", value, "countyRegisterCityDec");
            return (Criteria) this;
        }

        public Criteria andCountyRegisterCityDecNotEqualTo(String value) {
            addCriterion("county_register_city_dec <>", value, "countyRegisterCityDec");
            return (Criteria) this;
        }

        public Criteria andCountyRegisterCityDecGreaterThan(String value) {
            addCriterion("county_register_city_dec >", value, "countyRegisterCityDec");
            return (Criteria) this;
        }

        public Criteria andCountyRegisterCityDecGreaterThanOrEqualTo(String value) {
            addCriterion("county_register_city_dec >=", value, "countyRegisterCityDec");
            return (Criteria) this;
        }

        public Criteria andCountyRegisterCityDecLessThan(String value) {
            addCriterion("county_register_city_dec <", value, "countyRegisterCityDec");
            return (Criteria) this;
        }

        public Criteria andCountyRegisterCityDecLessThanOrEqualTo(String value) {
            addCriterion("county_register_city_dec <=", value, "countyRegisterCityDec");
            return (Criteria) this;
        }

        public Criteria andCountyRegisterCityDecLike(String value) {
            addCriterion("county_register_city_dec like", value, "countyRegisterCityDec");
            return (Criteria) this;
        }

        public Criteria andCountyRegisterCityDecNotLike(String value) {
            addCriterion("county_register_city_dec not like", value, "countyRegisterCityDec");
            return (Criteria) this;
        }

        public Criteria andCountyRegisterCityDecIn(List<String> values) {
            addCriterion("county_register_city_dec in", values, "countyRegisterCityDec");
            return (Criteria) this;
        }

        public Criteria andCountyRegisterCityDecNotIn(List<String> values) {
            addCriterion("county_register_city_dec not in", values, "countyRegisterCityDec");
            return (Criteria) this;
        }

        public Criteria andCountyRegisterCityDecBetween(String value1, String value2) {
            addCriterion("county_register_city_dec between", value1, value2, "countyRegisterCityDec");
            return (Criteria) this;
        }

        public Criteria andCountyRegisterCityDecNotBetween(String value1, String value2) {
            addCriterion("county_register_city_dec not between", value1, value2, "countyRegisterCityDec");
            return (Criteria) this;
        }

        public Criteria andCountyRegisterCityIsNull() {
            addCriterion("county_register_city is null");
            return (Criteria) this;
        }

        public Criteria andCountyRegisterCityIsNotNull() {
            addCriterion("county_register_city is not null");
            return (Criteria) this;
        }

        public Criteria andCountyRegisterCityEqualTo(String value) {
            addCriterion("county_register_city =", value, "countyRegisterCity");
            return (Criteria) this;
        }

        public Criteria andCountyRegisterCityNotEqualTo(String value) {
            addCriterion("county_register_city <>", value, "countyRegisterCity");
            return (Criteria) this;
        }

        public Criteria andCountyRegisterCityGreaterThan(String value) {
            addCriterion("county_register_city >", value, "countyRegisterCity");
            return (Criteria) this;
        }

        public Criteria andCountyRegisterCityGreaterThanOrEqualTo(String value) {
            addCriterion("county_register_city >=", value, "countyRegisterCity");
            return (Criteria) this;
        }

        public Criteria andCountyRegisterCityLessThan(String value) {
            addCriterion("county_register_city <", value, "countyRegisterCity");
            return (Criteria) this;
        }

        public Criteria andCountyRegisterCityLessThanOrEqualTo(String value) {
            addCriterion("county_register_city <=", value, "countyRegisterCity");
            return (Criteria) this;
        }

        public Criteria andCountyRegisterCityLike(String value) {
            addCriterion("county_register_city like", value, "countyRegisterCity");
            return (Criteria) this;
        }

        public Criteria andCountyRegisterCityNotLike(String value) {
            addCriterion("county_register_city not like", value, "countyRegisterCity");
            return (Criteria) this;
        }

        public Criteria andCountyRegisterCityIn(List<String> values) {
            addCriterion("county_register_city in", values, "countyRegisterCity");
            return (Criteria) this;
        }

        public Criteria andCountyRegisterCityNotIn(List<String> values) {
            addCriterion("county_register_city not in", values, "countyRegisterCity");
            return (Criteria) this;
        }

        public Criteria andCountyRegisterCityBetween(String value1, String value2) {
            addCriterion("county_register_city between", value1, value2, "countyRegisterCity");
            return (Criteria) this;
        }

        public Criteria andCountyRegisterCityNotBetween(String value1, String value2) {
            addCriterion("county_register_city not between", value1, value2, "countyRegisterCity");
            return (Criteria) this;
        }

        public Criteria andAregisterdetailIsNull() {
            addCriterion("aregisterdetail is null");
            return (Criteria) this;
        }

        public Criteria andAregisterdetailIsNotNull() {
            addCriterion("aregisterdetail is not null");
            return (Criteria) this;
        }

        public Criteria andAregisterdetailEqualTo(String value) {
            addCriterion("aregisterdetail =", value, "aregisterdetail");
            return (Criteria) this;
        }

        public Criteria andAregisterdetailNotEqualTo(String value) {
            addCriterion("aregisterdetail <>", value, "aregisterdetail");
            return (Criteria) this;
        }

        public Criteria andAregisterdetailGreaterThan(String value) {
            addCriterion("aregisterdetail >", value, "aregisterdetail");
            return (Criteria) this;
        }

        public Criteria andAregisterdetailGreaterThanOrEqualTo(String value) {
            addCriterion("aregisterdetail >=", value, "aregisterdetail");
            return (Criteria) this;
        }

        public Criteria andAregisterdetailLessThan(String value) {
            addCriterion("aregisterdetail <", value, "aregisterdetail");
            return (Criteria) this;
        }

        public Criteria andAregisterdetailLessThanOrEqualTo(String value) {
            addCriterion("aregisterdetail <=", value, "aregisterdetail");
            return (Criteria) this;
        }

        public Criteria andAregisterdetailLike(String value) {
            addCriterion("aregisterdetail like", value, "aregisterdetail");
            return (Criteria) this;
        }

        public Criteria andAregisterdetailNotLike(String value) {
            addCriterion("aregisterdetail not like", value, "aregisterdetail");
            return (Criteria) this;
        }

        public Criteria andAregisterdetailIn(List<String> values) {
            addCriterion("aregisterdetail in", values, "aregisterdetail");
            return (Criteria) this;
        }

        public Criteria andAregisterdetailNotIn(List<String> values) {
            addCriterion("aregisterdetail not in", values, "aregisterdetail");
            return (Criteria) this;
        }

        public Criteria andAregisterdetailBetween(String value1, String value2) {
            addCriterion("aregisterdetail between", value1, value2, "aregisterdetail");
            return (Criteria) this;
        }

        public Criteria andAregisterdetailNotBetween(String value1, String value2) {
            addCriterion("aregisterdetail not between", value1, value2, "aregisterdetail");
            return (Criteria) this;
        }

        public Criteria andPowerAmountIsNull() {
            addCriterion("power_amount is null");
            return (Criteria) this;
        }

        public Criteria andPowerAmountIsNotNull() {
            addCriterion("power_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPowerAmountEqualTo(Double value) {
            addCriterion("power_amount =", value, "powerAmount");
            return (Criteria) this;
        }

        public Criteria andPowerAmountNotEqualTo(Double value) {
            addCriterion("power_amount <>", value, "powerAmount");
            return (Criteria) this;
        }

        public Criteria andPowerAmountGreaterThan(Double value) {
            addCriterion("power_amount >", value, "powerAmount");
            return (Criteria) this;
        }

        public Criteria andPowerAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("power_amount >=", value, "powerAmount");
            return (Criteria) this;
        }

        public Criteria andPowerAmountLessThan(Double value) {
            addCriterion("power_amount <", value, "powerAmount");
            return (Criteria) this;
        }

        public Criteria andPowerAmountLessThanOrEqualTo(Double value) {
            addCriterion("power_amount <=", value, "powerAmount");
            return (Criteria) this;
        }

        public Criteria andPowerAmountIn(List<Double> values) {
            addCriterion("power_amount in", values, "powerAmount");
            return (Criteria) this;
        }

        public Criteria andPowerAmountNotIn(List<Double> values) {
            addCriterion("power_amount not in", values, "powerAmount");
            return (Criteria) this;
        }

        public Criteria andPowerAmountBetween(Double value1, Double value2) {
            addCriterion("power_amount between", value1, value2, "powerAmount");
            return (Criteria) this;
        }

        public Criteria andPowerAmountNotBetween(Double value1, Double value2) {
            addCriterion("power_amount not between", value1, value2, "powerAmount");
            return (Criteria) this;
        }

        public Criteria andAddressRegisterIsNull() {
            addCriterion("address_register is null");
            return (Criteria) this;
        }

        public Criteria andAddressRegisterIsNotNull() {
            addCriterion("address_register is not null");
            return (Criteria) this;
        }

        public Criteria andAddressRegisterEqualTo(String value) {
            addCriterion("address_register =", value, "addressRegister");
            return (Criteria) this;
        }

        public Criteria andAddressRegisterNotEqualTo(String value) {
            addCriterion("address_register <>", value, "addressRegister");
            return (Criteria) this;
        }

        public Criteria andAddressRegisterGreaterThan(String value) {
            addCriterion("address_register >", value, "addressRegister");
            return (Criteria) this;
        }

        public Criteria andAddressRegisterGreaterThanOrEqualTo(String value) {
            addCriterion("address_register >=", value, "addressRegister");
            return (Criteria) this;
        }

        public Criteria andAddressRegisterLessThan(String value) {
            addCriterion("address_register <", value, "addressRegister");
            return (Criteria) this;
        }

        public Criteria andAddressRegisterLessThanOrEqualTo(String value) {
            addCriterion("address_register <=", value, "addressRegister");
            return (Criteria) this;
        }

        public Criteria andAddressRegisterLike(String value) {
            addCriterion("address_register like", value, "addressRegister");
            return (Criteria) this;
        }

        public Criteria andAddressRegisterNotLike(String value) {
            addCriterion("address_register not like", value, "addressRegister");
            return (Criteria) this;
        }

        public Criteria andAddressRegisterIn(List<String> values) {
            addCriterion("address_register in", values, "addressRegister");
            return (Criteria) this;
        }

        public Criteria andAddressRegisterNotIn(List<String> values) {
            addCriterion("address_register not in", values, "addressRegister");
            return (Criteria) this;
        }

        public Criteria andAddressRegisterBetween(String value1, String value2) {
            addCriterion("address_register between", value1, value2, "addressRegister");
            return (Criteria) this;
        }

        public Criteria andAddressRegisterNotBetween(String value1, String value2) {
            addCriterion("address_register not between", value1, value2, "addressRegister");
            return (Criteria) this;
        }

        public Criteria andCountyidRegisterDecIsNull() {
            addCriterion("countyid_register_dec is null");
            return (Criteria) this;
        }

        public Criteria andCountyidRegisterDecIsNotNull() {
            addCriterion("countyid_register_dec is not null");
            return (Criteria) this;
        }

        public Criteria andCountyidRegisterDecEqualTo(String value) {
            addCriterion("countyid_register_dec =", value, "countyidRegisterDec");
            return (Criteria) this;
        }

        public Criteria andCountyidRegisterDecNotEqualTo(String value) {
            addCriterion("countyid_register_dec <>", value, "countyidRegisterDec");
            return (Criteria) this;
        }

        public Criteria andCountyidRegisterDecGreaterThan(String value) {
            addCriterion("countyid_register_dec >", value, "countyidRegisterDec");
            return (Criteria) this;
        }

        public Criteria andCountyidRegisterDecGreaterThanOrEqualTo(String value) {
            addCriterion("countyid_register_dec >=", value, "countyidRegisterDec");
            return (Criteria) this;
        }

        public Criteria andCountyidRegisterDecLessThan(String value) {
            addCriterion("countyid_register_dec <", value, "countyidRegisterDec");
            return (Criteria) this;
        }

        public Criteria andCountyidRegisterDecLessThanOrEqualTo(String value) {
            addCriterion("countyid_register_dec <=", value, "countyidRegisterDec");
            return (Criteria) this;
        }

        public Criteria andCountyidRegisterDecLike(String value) {
            addCriterion("countyid_register_dec like", value, "countyidRegisterDec");
            return (Criteria) this;
        }

        public Criteria andCountyidRegisterDecNotLike(String value) {
            addCriterion("countyid_register_dec not like", value, "countyidRegisterDec");
            return (Criteria) this;
        }

        public Criteria andCountyidRegisterDecIn(List<String> values) {
            addCriterion("countyid_register_dec in", values, "countyidRegisterDec");
            return (Criteria) this;
        }

        public Criteria andCountyidRegisterDecNotIn(List<String> values) {
            addCriterion("countyid_register_dec not in", values, "countyidRegisterDec");
            return (Criteria) this;
        }

        public Criteria andCountyidRegisterDecBetween(String value1, String value2) {
            addCriterion("countyid_register_dec between", value1, value2, "countyidRegisterDec");
            return (Criteria) this;
        }

        public Criteria andCountyidRegisterDecNotBetween(String value1, String value2) {
            addCriterion("countyid_register_dec not between", value1, value2, "countyidRegisterDec");
            return (Criteria) this;
        }

        public Criteria andCountyidRegisterIsNull() {
            addCriterion("countyid_register is null");
            return (Criteria) this;
        }

        public Criteria andCountyidRegisterIsNotNull() {
            addCriterion("countyid_register is not null");
            return (Criteria) this;
        }

        public Criteria andCountyidRegisterEqualTo(String value) {
            addCriterion("countyid_register =", value, "countyidRegister");
            return (Criteria) this;
        }

        public Criteria andCountyidRegisterNotEqualTo(String value) {
            addCriterion("countyid_register <>", value, "countyidRegister");
            return (Criteria) this;
        }

        public Criteria andCountyidRegisterGreaterThan(String value) {
            addCriterion("countyid_register >", value, "countyidRegister");
            return (Criteria) this;
        }

        public Criteria andCountyidRegisterGreaterThanOrEqualTo(String value) {
            addCriterion("countyid_register >=", value, "countyidRegister");
            return (Criteria) this;
        }

        public Criteria andCountyidRegisterLessThan(String value) {
            addCriterion("countyid_register <", value, "countyidRegister");
            return (Criteria) this;
        }

        public Criteria andCountyidRegisterLessThanOrEqualTo(String value) {
            addCriterion("countyid_register <=", value, "countyidRegister");
            return (Criteria) this;
        }

        public Criteria andCountyidRegisterLike(String value) {
            addCriterion("countyid_register like", value, "countyidRegister");
            return (Criteria) this;
        }

        public Criteria andCountyidRegisterNotLike(String value) {
            addCriterion("countyid_register not like", value, "countyidRegister");
            return (Criteria) this;
        }

        public Criteria andCountyidRegisterIn(List<String> values) {
            addCriterion("countyid_register in", values, "countyidRegister");
            return (Criteria) this;
        }

        public Criteria andCountyidRegisterNotIn(List<String> values) {
            addCriterion("countyid_register not in", values, "countyidRegister");
            return (Criteria) this;
        }

        public Criteria andCountyidRegisterBetween(String value1, String value2) {
            addCriterion("countyid_register between", value1, value2, "countyidRegister");
            return (Criteria) this;
        }

        public Criteria andCountyidRegisterNotBetween(String value1, String value2) {
            addCriterion("countyid_register not between", value1, value2, "countyidRegister");
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

        public Criteria andGasequTypeIsNull() {
            addCriterion("gasequ_type is null");
            return (Criteria) this;
        }

        public Criteria andGasequTypeIsNotNull() {
            addCriterion("gasequ_type is not null");
            return (Criteria) this;
        }

        public Criteria andGasequTypeEqualTo(String value) {
            addCriterion("gasequ_type =", value, "gasequType");
            return (Criteria) this;
        }

        public Criteria andGasequTypeNotEqualTo(String value) {
            addCriterion("gasequ_type <>", value, "gasequType");
            return (Criteria) this;
        }

        public Criteria andGasequTypeGreaterThan(String value) {
            addCriterion("gasequ_type >", value, "gasequType");
            return (Criteria) this;
        }

        public Criteria andGasequTypeGreaterThanOrEqualTo(String value) {
            addCriterion("gasequ_type >=", value, "gasequType");
            return (Criteria) this;
        }

        public Criteria andGasequTypeLessThan(String value) {
            addCriterion("gasequ_type <", value, "gasequType");
            return (Criteria) this;
        }

        public Criteria andGasequTypeLessThanOrEqualTo(String value) {
            addCriterion("gasequ_type <=", value, "gasequType");
            return (Criteria) this;
        }

        public Criteria andGasequTypeLike(String value) {
            addCriterion("gasequ_type like", value, "gasequType");
            return (Criteria) this;
        }

        public Criteria andGasequTypeNotLike(String value) {
            addCriterion("gasequ_type not like", value, "gasequType");
            return (Criteria) this;
        }

        public Criteria andGasequTypeIn(List<String> values) {
            addCriterion("gasequ_type in", values, "gasequType");
            return (Criteria) this;
        }

        public Criteria andGasequTypeNotIn(List<String> values) {
            addCriterion("gasequ_type not in", values, "gasequType");
            return (Criteria) this;
        }

        public Criteria andGasequTypeBetween(String value1, String value2) {
            addCriterion("gasequ_type between", value1, value2, "gasequType");
            return (Criteria) this;
        }

        public Criteria andGasequTypeNotBetween(String value1, String value2) {
            addCriterion("gasequ_type not between", value1, value2, "gasequType");
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

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Boolean value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Boolean value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Boolean value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Boolean value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Boolean> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Boolean> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andLastChangedTimeIsNull() {
            addCriterion("last_changed_time is null");
            return (Criteria) this;
        }

        public Criteria andLastChangedTimeIsNotNull() {
            addCriterion("last_changed_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastChangedTimeEqualTo(Date value) {
            addCriterion("last_changed_time =", value, "lastChangedTime");
            return (Criteria) this;
        }

        public Criteria andLastChangedTimeNotEqualTo(Date value) {
            addCriterion("last_changed_time <>", value, "lastChangedTime");
            return (Criteria) this;
        }

        public Criteria andLastChangedTimeGreaterThan(Date value) {
            addCriterion("last_changed_time >", value, "lastChangedTime");
            return (Criteria) this;
        }

        public Criteria andLastChangedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_changed_time >=", value, "lastChangedTime");
            return (Criteria) this;
        }

        public Criteria andLastChangedTimeLessThan(Date value) {
            addCriterion("last_changed_time <", value, "lastChangedTime");
            return (Criteria) this;
        }

        public Criteria andLastChangedTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_changed_time <=", value, "lastChangedTime");
            return (Criteria) this;
        }

        public Criteria andLastChangedTimeIn(List<Date> values) {
            addCriterion("last_changed_time in", values, "lastChangedTime");
            return (Criteria) this;
        }

        public Criteria andLastChangedTimeNotIn(List<Date> values) {
            addCriterion("last_changed_time not in", values, "lastChangedTime");
            return (Criteria) this;
        }

        public Criteria andLastChangedTimeBetween(Date value1, Date value2) {
            addCriterion("last_changed_time between", value1, value2, "lastChangedTime");
            return (Criteria) this;
        }

        public Criteria andLastChangedTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_changed_time not between", value1, value2, "lastChangedTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andFillingTimeIsNull() {
            addCriterion("filling_time is null");
            return (Criteria) this;
        }

        public Criteria andFillingTimeIsNotNull() {
            addCriterion("filling_time is not null");
            return (Criteria) this;
        }

        public Criteria andFillingTimeEqualTo(Date value) {
            addCriterion("filling_time =", value, "fillingTime");
            return (Criteria) this;
        }

        public Criteria andFillingTimeNotEqualTo(Date value) {
            addCriterion("filling_time <>", value, "fillingTime");
            return (Criteria) this;
        }

        public Criteria andFillingTimeGreaterThan(Date value) {
            addCriterion("filling_time >", value, "fillingTime");
            return (Criteria) this;
        }

        public Criteria andFillingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("filling_time >=", value, "fillingTime");
            return (Criteria) this;
        }

        public Criteria andFillingTimeLessThan(Date value) {
            addCriterion("filling_time <", value, "fillingTime");
            return (Criteria) this;
        }

        public Criteria andFillingTimeLessThanOrEqualTo(Date value) {
            addCriterion("filling_time <=", value, "fillingTime");
            return (Criteria) this;
        }

        public Criteria andFillingTimeIn(List<Date> values) {
            addCriterion("filling_time in", values, "fillingTime");
            return (Criteria) this;
        }

        public Criteria andFillingTimeNotIn(List<Date> values) {
            addCriterion("filling_time not in", values, "fillingTime");
            return (Criteria) this;
        }

        public Criteria andFillingTimeBetween(Date value1, Date value2) {
            addCriterion("filling_time between", value1, value2, "fillingTime");
            return (Criteria) this;
        }

        public Criteria andFillingTimeNotBetween(Date value1, Date value2) {
            addCriterion("filling_time not between", value1, value2, "fillingTime");
            return (Criteria) this;
        }

        public Criteria andDevicestatusIsNull() {
            addCriterion("devicestatus is null");
            return (Criteria) this;
        }

        public Criteria andDevicestatusIsNotNull() {
            addCriterion("devicestatus is not null");
            return (Criteria) this;
        }

        public Criteria andDevicestatusEqualTo(Integer value) {
            addCriterion("devicestatus =", value, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andDevicestatusNotEqualTo(Integer value) {
            addCriterion("devicestatus <>", value, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andDevicestatusGreaterThan(Integer value) {
            addCriterion("devicestatus >", value, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andDevicestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("devicestatus >=", value, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andDevicestatusLessThan(Integer value) {
            addCriterion("devicestatus <", value, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andDevicestatusLessThanOrEqualTo(Integer value) {
            addCriterion("devicestatus <=", value, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andDevicestatusIn(List<Integer> values) {
            addCriterion("devicestatus in", values, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andDevicestatusNotIn(List<Integer> values) {
            addCriterion("devicestatus not in", values, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andDevicestatusBetween(Integer value1, Integer value2) {
            addCriterion("devicestatus between", value1, value2, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andDevicestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("devicestatus not between", value1, value2, "devicestatus");
            return (Criteria) this;
        }

        public Criteria andBoilerstatusIsNull() {
            addCriterion("boilerstatus is null");
            return (Criteria) this;
        }

        public Criteria andBoilerstatusIsNotNull() {
            addCriterion("boilerstatus is not null");
            return (Criteria) this;
        }

        public Criteria andBoilerstatusEqualTo(Integer value) {
            addCriterion("boilerstatus =", value, "boilerstatus");
            return (Criteria) this;
        }

        public Criteria andBoilerstatusNotEqualTo(Integer value) {
            addCriterion("boilerstatus <>", value, "boilerstatus");
            return (Criteria) this;
        }

        public Criteria andBoilerstatusGreaterThan(Integer value) {
            addCriterion("boilerstatus >", value, "boilerstatus");
            return (Criteria) this;
        }

        public Criteria andBoilerstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("boilerstatus >=", value, "boilerstatus");
            return (Criteria) this;
        }

        public Criteria andBoilerstatusLessThan(Integer value) {
            addCriterion("boilerstatus <", value, "boilerstatus");
            return (Criteria) this;
        }

        public Criteria andBoilerstatusLessThanOrEqualTo(Integer value) {
            addCriterion("boilerstatus <=", value, "boilerstatus");
            return (Criteria) this;
        }

        public Criteria andBoilerstatusIn(List<Integer> values) {
            addCriterion("boilerstatus in", values, "boilerstatus");
            return (Criteria) this;
        }

        public Criteria andBoilerstatusNotIn(List<Integer> values) {
            addCriterion("boilerstatus not in", values, "boilerstatus");
            return (Criteria) this;
        }

        public Criteria andBoilerstatusBetween(Integer value1, Integer value2) {
            addCriterion("boilerstatus between", value1, value2, "boilerstatus");
            return (Criteria) this;
        }

        public Criteria andBoilerstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("boilerstatus not between", value1, value2, "boilerstatus");
            return (Criteria) this;
        }

        public Criteria andKilnstatusIsNull() {
            addCriterion("kilnstatus is null");
            return (Criteria) this;
        }

        public Criteria andKilnstatusIsNotNull() {
            addCriterion("kilnstatus is not null");
            return (Criteria) this;
        }

        public Criteria andKilnstatusEqualTo(Integer value) {
            addCriterion("kilnstatus =", value, "kilnstatus");
            return (Criteria) this;
        }

        public Criteria andKilnstatusNotEqualTo(Integer value) {
            addCriterion("kilnstatus <>", value, "kilnstatus");
            return (Criteria) this;
        }

        public Criteria andKilnstatusGreaterThan(Integer value) {
            addCriterion("kilnstatus >", value, "kilnstatus");
            return (Criteria) this;
        }

        public Criteria andKilnstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("kilnstatus >=", value, "kilnstatus");
            return (Criteria) this;
        }

        public Criteria andKilnstatusLessThan(Integer value) {
            addCriterion("kilnstatus <", value, "kilnstatus");
            return (Criteria) this;
        }

        public Criteria andKilnstatusLessThanOrEqualTo(Integer value) {
            addCriterion("kilnstatus <=", value, "kilnstatus");
            return (Criteria) this;
        }

        public Criteria andKilnstatusIn(List<Integer> values) {
            addCriterion("kilnstatus in", values, "kilnstatus");
            return (Criteria) this;
        }

        public Criteria andKilnstatusNotIn(List<Integer> values) {
            addCriterion("kilnstatus not in", values, "kilnstatus");
            return (Criteria) this;
        }

        public Criteria andKilnstatusBetween(Integer value1, Integer value2) {
            addCriterion("kilnstatus between", value1, value2, "kilnstatus");
            return (Criteria) this;
        }

        public Criteria andKilnstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("kilnstatus not between", value1, value2, "kilnstatus");
            return (Criteria) this;
        }

        public Criteria andYearDaysIsNull() {
            addCriterion("Year_days is null");
            return (Criteria) this;
        }

        public Criteria andYearDaysIsNotNull() {
            addCriterion("Year_days is not null");
            return (Criteria) this;
        }

        public Criteria andYearDaysEqualTo(Integer value) {
            addCriterion("Year_days =", value, "yearDays");
            return (Criteria) this;
        }

        public Criteria andYearDaysNotEqualTo(Integer value) {
            addCriterion("Year_days <>", value, "yearDays");
            return (Criteria) this;
        }

        public Criteria andYearDaysGreaterThan(Integer value) {
            addCriterion("Year_days >", value, "yearDays");
            return (Criteria) this;
        }

        public Criteria andYearDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("Year_days >=", value, "yearDays");
            return (Criteria) this;
        }

        public Criteria andYearDaysLessThan(Integer value) {
            addCriterion("Year_days <", value, "yearDays");
            return (Criteria) this;
        }

        public Criteria andYearDaysLessThanOrEqualTo(Integer value) {
            addCriterion("Year_days <=", value, "yearDays");
            return (Criteria) this;
        }

        public Criteria andYearDaysIn(List<Integer> values) {
            addCriterion("Year_days in", values, "yearDays");
            return (Criteria) this;
        }

        public Criteria andYearDaysNotIn(List<Integer> values) {
            addCriterion("Year_days not in", values, "yearDays");
            return (Criteria) this;
        }

        public Criteria andYearDaysBetween(Integer value1, Integer value2) {
            addCriterion("Year_days between", value1, value2, "yearDays");
            return (Criteria) this;
        }

        public Criteria andYearDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("Year_days not between", value1, value2, "yearDays");
            return (Criteria) this;
        }

        public Criteria andDaysHoursIsNull() {
            addCriterion("Days_hours is null");
            return (Criteria) this;
        }

        public Criteria andDaysHoursIsNotNull() {
            addCriterion("Days_hours is not null");
            return (Criteria) this;
        }

        public Criteria andDaysHoursEqualTo(Integer value) {
            addCriterion("Days_hours =", value, "daysHours");
            return (Criteria) this;
        }

        public Criteria andDaysHoursNotEqualTo(Integer value) {
            addCriterion("Days_hours <>", value, "daysHours");
            return (Criteria) this;
        }

        public Criteria andDaysHoursGreaterThan(Integer value) {
            addCriterion("Days_hours >", value, "daysHours");
            return (Criteria) this;
        }

        public Criteria andDaysHoursGreaterThanOrEqualTo(Integer value) {
            addCriterion("Days_hours >=", value, "daysHours");
            return (Criteria) this;
        }

        public Criteria andDaysHoursLessThan(Integer value) {
            addCriterion("Days_hours <", value, "daysHours");
            return (Criteria) this;
        }

        public Criteria andDaysHoursLessThanOrEqualTo(Integer value) {
            addCriterion("Days_hours <=", value, "daysHours");
            return (Criteria) this;
        }

        public Criteria andDaysHoursIn(List<Integer> values) {
            addCriterion("Days_hours in", values, "daysHours");
            return (Criteria) this;
        }

        public Criteria andDaysHoursNotIn(List<Integer> values) {
            addCriterion("Days_hours not in", values, "daysHours");
            return (Criteria) this;
        }

        public Criteria andDaysHoursBetween(Integer value1, Integer value2) {
            addCriterion("Days_hours between", value1, value2, "daysHours");
            return (Criteria) this;
        }

        public Criteria andDaysHoursNotBetween(Integer value1, Integer value2) {
            addCriterion("Days_hours not between", value1, value2, "daysHours");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("CITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("CITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("CITY_NAME =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("CITY_NAME <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("CITY_NAME >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_NAME >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("CITY_NAME <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("CITY_NAME <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("CITY_NAME like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("CITY_NAME not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("CITY_NAME in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("CITY_NAME not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("CITY_NAME between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("CITY_NAME not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("CITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("CITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("CITY_ID =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("CITY_ID <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("CITY_ID >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CITY_ID >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("CITY_ID <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("CITY_ID <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("CITY_ID in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("CITY_ID not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("CITY_ID between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CITY_ID not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andTotalOutputIsNull() {
            addCriterion("total_output is null");
            return (Criteria) this;
        }

        public Criteria andTotalOutputIsNotNull() {
            addCriterion("total_output is not null");
            return (Criteria) this;
        }

        public Criteria andTotalOutputEqualTo(Double value) {
            addCriterion("total_output =", value, "totalOutput");
            return (Criteria) this;
        }

        public Criteria andTotalOutputNotEqualTo(Double value) {
            addCriterion("total_output <>", value, "totalOutput");
            return (Criteria) this;
        }

        public Criteria andTotalOutputGreaterThan(Double value) {
            addCriterion("total_output >", value, "totalOutput");
            return (Criteria) this;
        }

        public Criteria andTotalOutputGreaterThanOrEqualTo(Double value) {
            addCriterion("total_output >=", value, "totalOutput");
            return (Criteria) this;
        }

        public Criteria andTotalOutputLessThan(Double value) {
            addCriterion("total_output <", value, "totalOutput");
            return (Criteria) this;
        }

        public Criteria andTotalOutputLessThanOrEqualTo(Double value) {
            addCriterion("total_output <=", value, "totalOutput");
            return (Criteria) this;
        }

        public Criteria andTotalOutputIn(List<Double> values) {
            addCriterion("total_output in", values, "totalOutput");
            return (Criteria) this;
        }

        public Criteria andTotalOutputNotIn(List<Double> values) {
            addCriterion("total_output not in", values, "totalOutput");
            return (Criteria) this;
        }

        public Criteria andTotalOutputBetween(Double value1, Double value2) {
            addCriterion("total_output between", value1, value2, "totalOutput");
            return (Criteria) this;
        }

        public Criteria andTotalOutputNotBetween(Double value1, Double value2) {
            addCriterion("total_output not between", value1, value2, "totalOutput");
            return (Criteria) this;
        }

        public Criteria andFactorystatusIsNull() {
            addCriterion("factorystatus is null");
            return (Criteria) this;
        }

        public Criteria andFactorystatusIsNotNull() {
            addCriterion("factorystatus is not null");
            return (Criteria) this;
        }

        public Criteria andFactorystatusEqualTo(Integer value) {
            addCriterion("factorystatus =", value, "factorystatus");
            return (Criteria) this;
        }

        public Criteria andFactorystatusNotEqualTo(Integer value) {
            addCriterion("factorystatus <>", value, "factorystatus");
            return (Criteria) this;
        }

        public Criteria andFactorystatusGreaterThan(Integer value) {
            addCriterion("factorystatus >", value, "factorystatus");
            return (Criteria) this;
        }

        public Criteria andFactorystatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("factorystatus >=", value, "factorystatus");
            return (Criteria) this;
        }

        public Criteria andFactorystatusLessThan(Integer value) {
            addCriterion("factorystatus <", value, "factorystatus");
            return (Criteria) this;
        }

        public Criteria andFactorystatusLessThanOrEqualTo(Integer value) {
            addCriterion("factorystatus <=", value, "factorystatus");
            return (Criteria) this;
        }

        public Criteria andFactorystatusIn(List<Integer> values) {
            addCriterion("factorystatus in", values, "factorystatus");
            return (Criteria) this;
        }

        public Criteria andFactorystatusNotIn(List<Integer> values) {
            addCriterion("factorystatus not in", values, "factorystatus");
            return (Criteria) this;
        }

        public Criteria andFactorystatusBetween(Integer value1, Integer value2) {
            addCriterion("factorystatus between", value1, value2, "factorystatus");
            return (Criteria) this;
        }

        public Criteria andFactorystatusNotBetween(Integer value1, Integer value2) {
            addCriterion("factorystatus not between", value1, value2, "factorystatus");
            return (Criteria) this;
        }

        public Criteria andExhauststatusIsNull() {
            addCriterion("exhauststatus is null");
            return (Criteria) this;
        }

        public Criteria andExhauststatusIsNotNull() {
            addCriterion("exhauststatus is not null");
            return (Criteria) this;
        }

        public Criteria andExhauststatusEqualTo(Integer value) {
            addCriterion("exhauststatus =", value, "exhauststatus");
            return (Criteria) this;
        }

        public Criteria andExhauststatusNotEqualTo(Integer value) {
            addCriterion("exhauststatus <>", value, "exhauststatus");
            return (Criteria) this;
        }

        public Criteria andExhauststatusGreaterThan(Integer value) {
            addCriterion("exhauststatus >", value, "exhauststatus");
            return (Criteria) this;
        }

        public Criteria andExhauststatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("exhauststatus >=", value, "exhauststatus");
            return (Criteria) this;
        }

        public Criteria andExhauststatusLessThan(Integer value) {
            addCriterion("exhauststatus <", value, "exhauststatus");
            return (Criteria) this;
        }

        public Criteria andExhauststatusLessThanOrEqualTo(Integer value) {
            addCriterion("exhauststatus <=", value, "exhauststatus");
            return (Criteria) this;
        }

        public Criteria andExhauststatusIn(List<Integer> values) {
            addCriterion("exhauststatus in", values, "exhauststatus");
            return (Criteria) this;
        }

        public Criteria andExhauststatusNotIn(List<Integer> values) {
            addCriterion("exhauststatus not in", values, "exhauststatus");
            return (Criteria) this;
        }

        public Criteria andExhauststatusBetween(Integer value1, Integer value2) {
            addCriterion("exhauststatus between", value1, value2, "exhauststatus");
            return (Criteria) this;
        }

        public Criteria andExhauststatusNotBetween(Integer value1, Integer value2) {
            addCriterion("exhauststatus not between", value1, value2, "exhauststatus");
            return (Criteria) this;
        }

        public Criteria andStatusdecIsNull() {
            addCriterion("statusdec is null");
            return (Criteria) this;
        }

        public Criteria andStatusdecIsNotNull() {
            addCriterion("statusdec is not null");
            return (Criteria) this;
        }

        public Criteria andStatusdecEqualTo(String value) {
            addCriterion("statusdec =", value, "statusdec");
            return (Criteria) this;
        }

        public Criteria andStatusdecNotEqualTo(String value) {
            addCriterion("statusdec <>", value, "statusdec");
            return (Criteria) this;
        }

        public Criteria andStatusdecGreaterThan(String value) {
            addCriterion("statusdec >", value, "statusdec");
            return (Criteria) this;
        }

        public Criteria andStatusdecGreaterThanOrEqualTo(String value) {
            addCriterion("statusdec >=", value, "statusdec");
            return (Criteria) this;
        }

        public Criteria andStatusdecLessThan(String value) {
            addCriterion("statusdec <", value, "statusdec");
            return (Criteria) this;
        }

        public Criteria andStatusdecLessThanOrEqualTo(String value) {
            addCriterion("statusdec <=", value, "statusdec");
            return (Criteria) this;
        }

        public Criteria andStatusdecLike(String value) {
            addCriterion("statusdec like", value, "statusdec");
            return (Criteria) this;
        }

        public Criteria andStatusdecNotLike(String value) {
            addCriterion("statusdec not like", value, "statusdec");
            return (Criteria) this;
        }

        public Criteria andStatusdecIn(List<String> values) {
            addCriterion("statusdec in", values, "statusdec");
            return (Criteria) this;
        }

        public Criteria andStatusdecNotIn(List<String> values) {
            addCriterion("statusdec not in", values, "statusdec");
            return (Criteria) this;
        }

        public Criteria andStatusdecBetween(String value1, String value2) {
            addCriterion("statusdec between", value1, value2, "statusdec");
            return (Criteria) this;
        }

        public Criteria andStatusdecNotBetween(String value1, String value2) {
            addCriterion("statusdec not between", value1, value2, "statusdec");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andExhaustNumIsNull() {
            addCriterion("exhaust_num is null");
            return (Criteria) this;
        }

        public Criteria andExhaustNumIsNotNull() {
            addCriterion("exhaust_num is not null");
            return (Criteria) this;
        }

        public Criteria andExhaustNumEqualTo(Integer value) {
            addCriterion("exhaust_num =", value, "exhaustNum");
            return (Criteria) this;
        }

        public Criteria andExhaustNumNotEqualTo(Integer value) {
            addCriterion("exhaust_num <>", value, "exhaustNum");
            return (Criteria) this;
        }

        public Criteria andExhaustNumGreaterThan(Integer value) {
            addCriterion("exhaust_num >", value, "exhaustNum");
            return (Criteria) this;
        }

        public Criteria andExhaustNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("exhaust_num >=", value, "exhaustNum");
            return (Criteria) this;
        }

        public Criteria andExhaustNumLessThan(Integer value) {
            addCriterion("exhaust_num <", value, "exhaustNum");
            return (Criteria) this;
        }

        public Criteria andExhaustNumLessThanOrEqualTo(Integer value) {
            addCriterion("exhaust_num <=", value, "exhaustNum");
            return (Criteria) this;
        }

        public Criteria andExhaustNumIn(List<Integer> values) {
            addCriterion("exhaust_num in", values, "exhaustNum");
            return (Criteria) this;
        }

        public Criteria andExhaustNumNotIn(List<Integer> values) {
            addCriterion("exhaust_num not in", values, "exhaustNum");
            return (Criteria) this;
        }

        public Criteria andExhaustNumBetween(Integer value1, Integer value2) {
            addCriterion("exhaust_num between", value1, value2, "exhaustNum");
            return (Criteria) this;
        }

        public Criteria andExhaustNumNotBetween(Integer value1, Integer value2) {
            addCriterion("exhaust_num not between", value1, value2, "exhaustNum");
            return (Criteria) this;
        }

        public Criteria andImportantIsNull() {
            addCriterion("important is null");
            return (Criteria) this;
        }

        public Criteria andImportantIsNotNull() {
            addCriterion("important is not null");
            return (Criteria) this;
        }

        public Criteria andImportantEqualTo(Integer value) {
            addCriterion("important =", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantNotEqualTo(Integer value) {
            addCriterion("important <>", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantGreaterThan(Integer value) {
            addCriterion("important >", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantGreaterThanOrEqualTo(Integer value) {
            addCriterion("important >=", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantLessThan(Integer value) {
            addCriterion("important <", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantLessThanOrEqualTo(Integer value) {
            addCriterion("important <=", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantIn(List<Integer> values) {
            addCriterion("important in", values, "important");
            return (Criteria) this;
        }

        public Criteria andImportantNotIn(List<Integer> values) {
            addCriterion("important not in", values, "important");
            return (Criteria) this;
        }

        public Criteria andImportantBetween(Integer value1, Integer value2) {
            addCriterion("important between", value1, value2, "important");
            return (Criteria) this;
        }

        public Criteria andImportantNotBetween(Integer value1, Integer value2) {
            addCriterion("important not between", value1, value2, "important");
            return (Criteria) this;
        }

        public Criteria andShihuaflagIsNull() {
            addCriterion("shihuaflag is null");
            return (Criteria) this;
        }

        public Criteria andShihuaflagIsNotNull() {
            addCriterion("shihuaflag is not null");
            return (Criteria) this;
        }

        public Criteria andShihuaflagEqualTo(Integer value) {
            addCriterion("shihuaflag =", value, "shihuaflag");
            return (Criteria) this;
        }

        public Criteria andShihuaflagNotEqualTo(Integer value) {
            addCriterion("shihuaflag <>", value, "shihuaflag");
            return (Criteria) this;
        }

        public Criteria andShihuaflagGreaterThan(Integer value) {
            addCriterion("shihuaflag >", value, "shihuaflag");
            return (Criteria) this;
        }

        public Criteria andShihuaflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("shihuaflag >=", value, "shihuaflag");
            return (Criteria) this;
        }

        public Criteria andShihuaflagLessThan(Integer value) {
            addCriterion("shihuaflag <", value, "shihuaflag");
            return (Criteria) this;
        }

        public Criteria andShihuaflagLessThanOrEqualTo(Integer value) {
            addCriterion("shihuaflag <=", value, "shihuaflag");
            return (Criteria) this;
        }

        public Criteria andShihuaflagIn(List<Integer> values) {
            addCriterion("shihuaflag in", values, "shihuaflag");
            return (Criteria) this;
        }

        public Criteria andShihuaflagNotIn(List<Integer> values) {
            addCriterion("shihuaflag not in", values, "shihuaflag");
            return (Criteria) this;
        }

        public Criteria andShihuaflagBetween(Integer value1, Integer value2) {
            addCriterion("shihuaflag between", value1, value2, "shihuaflag");
            return (Criteria) this;
        }

        public Criteria andShihuaflagNotBetween(Integer value1, Integer value2) {
            addCriterion("shihuaflag not between", value1, value2, "shihuaflag");
            return (Criteria) this;
        }

        public Criteria andFeiqnubIsNull() {
            addCriterion("feiqnub is null");
            return (Criteria) this;
        }

        public Criteria andFeiqnubIsNotNull() {
            addCriterion("feiqnub is not null");
            return (Criteria) this;
        }

        public Criteria andFeiqnubEqualTo(Integer value) {
            addCriterion("feiqnub =", value, "feiqnub");
            return (Criteria) this;
        }

        public Criteria andFeiqnubNotEqualTo(Integer value) {
            addCriterion("feiqnub <>", value, "feiqnub");
            return (Criteria) this;
        }

        public Criteria andFeiqnubGreaterThan(Integer value) {
            addCriterion("feiqnub >", value, "feiqnub");
            return (Criteria) this;
        }

        public Criteria andFeiqnubGreaterThanOrEqualTo(Integer value) {
            addCriterion("feiqnub >=", value, "feiqnub");
            return (Criteria) this;
        }

        public Criteria andFeiqnubLessThan(Integer value) {
            addCriterion("feiqnub <", value, "feiqnub");
            return (Criteria) this;
        }

        public Criteria andFeiqnubLessThanOrEqualTo(Integer value) {
            addCriterion("feiqnub <=", value, "feiqnub");
            return (Criteria) this;
        }

        public Criteria andFeiqnubIn(List<Integer> values) {
            addCriterion("feiqnub in", values, "feiqnub");
            return (Criteria) this;
        }

        public Criteria andFeiqnubNotIn(List<Integer> values) {
            addCriterion("feiqnub not in", values, "feiqnub");
            return (Criteria) this;
        }

        public Criteria andFeiqnubBetween(Integer value1, Integer value2) {
            addCriterion("feiqnub between", value1, value2, "feiqnub");
            return (Criteria) this;
        }

        public Criteria andFeiqnubNotBetween(Integer value1, Integer value2) {
            addCriterion("feiqnub not between", value1, value2, "feiqnub");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameIsNull() {
            addCriterion("principal_name is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameIsNotNull() {
            addCriterion("principal_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameEqualTo(String value) {
            addCriterion("principal_name =", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameNotEqualTo(String value) {
            addCriterion("principal_name <>", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameGreaterThan(String value) {
            addCriterion("principal_name >", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameGreaterThanOrEqualTo(String value) {
            addCriterion("principal_name >=", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameLessThan(String value) {
            addCriterion("principal_name <", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameLessThanOrEqualTo(String value) {
            addCriterion("principal_name <=", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameLike(String value) {
            addCriterion("principal_name like", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameNotLike(String value) {
            addCriterion("principal_name not like", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameIn(List<String> values) {
            addCriterion("principal_name in", values, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameNotIn(List<String> values) {
            addCriterion("principal_name not in", values, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameBetween(String value1, String value2) {
            addCriterion("principal_name between", value1, value2, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameNotBetween(String value1, String value2) {
            addCriterion("principal_name not between", value1, value2, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneIsNull() {
            addCriterion("principal_phone is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneIsNotNull() {
            addCriterion("principal_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneEqualTo(String value) {
            addCriterion("principal_phone =", value, "principalPhone");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneNotEqualTo(String value) {
            addCriterion("principal_phone <>", value, "principalPhone");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneGreaterThan(String value) {
            addCriterion("principal_phone >", value, "principalPhone");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("principal_phone >=", value, "principalPhone");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneLessThan(String value) {
            addCriterion("principal_phone <", value, "principalPhone");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneLessThanOrEqualTo(String value) {
            addCriterion("principal_phone <=", value, "principalPhone");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneLike(String value) {
            addCriterion("principal_phone like", value, "principalPhone");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneNotLike(String value) {
            addCriterion("principal_phone not like", value, "principalPhone");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneIn(List<String> values) {
            addCriterion("principal_phone in", values, "principalPhone");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneNotIn(List<String> values) {
            addCriterion("principal_phone not in", values, "principalPhone");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneBetween(String value1, String value2) {
            addCriterion("principal_phone between", value1, value2, "principalPhone");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneNotBetween(String value1, String value2) {
            addCriterion("principal_phone not between", value1, value2, "principalPhone");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileIsNull() {
            addCriterion("principal_mobile is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileIsNotNull() {
            addCriterion("principal_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileEqualTo(String value) {
            addCriterion("principal_mobile =", value, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileNotEqualTo(String value) {
            addCriterion("principal_mobile <>", value, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileGreaterThan(String value) {
            addCriterion("principal_mobile >", value, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileGreaterThanOrEqualTo(String value) {
            addCriterion("principal_mobile >=", value, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileLessThan(String value) {
            addCriterion("principal_mobile <", value, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileLessThanOrEqualTo(String value) {
            addCriterion("principal_mobile <=", value, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileLike(String value) {
            addCriterion("principal_mobile like", value, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileNotLike(String value) {
            addCriterion("principal_mobile not like", value, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileIn(List<String> values) {
            addCriterion("principal_mobile in", values, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileNotIn(List<String> values) {
            addCriterion("principal_mobile not in", values, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileBetween(String value1, String value2) {
            addCriterion("principal_mobile between", value1, value2, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileNotBetween(String value1, String value2) {
            addCriterion("principal_mobile not between", value1, value2, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalEmailIsNull() {
            addCriterion("principal_email is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalEmailIsNotNull() {
            addCriterion("principal_email is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalEmailEqualTo(String value) {
            addCriterion("principal_email =", value, "principalEmail");
            return (Criteria) this;
        }

        public Criteria andPrincipalEmailNotEqualTo(String value) {
            addCriterion("principal_email <>", value, "principalEmail");
            return (Criteria) this;
        }

        public Criteria andPrincipalEmailGreaterThan(String value) {
            addCriterion("principal_email >", value, "principalEmail");
            return (Criteria) this;
        }

        public Criteria andPrincipalEmailGreaterThanOrEqualTo(String value) {
            addCriterion("principal_email >=", value, "principalEmail");
            return (Criteria) this;
        }

        public Criteria andPrincipalEmailLessThan(String value) {
            addCriterion("principal_email <", value, "principalEmail");
            return (Criteria) this;
        }

        public Criteria andPrincipalEmailLessThanOrEqualTo(String value) {
            addCriterion("principal_email <=", value, "principalEmail");
            return (Criteria) this;
        }

        public Criteria andPrincipalEmailLike(String value) {
            addCriterion("principal_email like", value, "principalEmail");
            return (Criteria) this;
        }

        public Criteria andPrincipalEmailNotLike(String value) {
            addCriterion("principal_email not like", value, "principalEmail");
            return (Criteria) this;
        }

        public Criteria andPrincipalEmailIn(List<String> values) {
            addCriterion("principal_email in", values, "principalEmail");
            return (Criteria) this;
        }

        public Criteria andPrincipalEmailNotIn(List<String> values) {
            addCriterion("principal_email not in", values, "principalEmail");
            return (Criteria) this;
        }

        public Criteria andPrincipalEmailBetween(String value1, String value2) {
            addCriterion("principal_email between", value1, value2, "principalEmail");
            return (Criteria) this;
        }

        public Criteria andPrincipalEmailNotBetween(String value1, String value2) {
            addCriterion("principal_email not between", value1, value2, "principalEmail");
            return (Criteria) this;
        }

        public Criteria andLat1IsNull() {
            addCriterion("lat1 is null");
            return (Criteria) this;
        }

        public Criteria andLat1IsNotNull() {
            addCriterion("lat1 is not null");
            return (Criteria) this;
        }

        public Criteria andLat1EqualTo(Double value) {
            addCriterion("lat1 =", value, "lat1");
            return (Criteria) this;
        }

        public Criteria andLat1NotEqualTo(Double value) {
            addCriterion("lat1 <>", value, "lat1");
            return (Criteria) this;
        }

        public Criteria andLat1GreaterThan(Double value) {
            addCriterion("lat1 >", value, "lat1");
            return (Criteria) this;
        }

        public Criteria andLat1GreaterThanOrEqualTo(Double value) {
            addCriterion("lat1 >=", value, "lat1");
            return (Criteria) this;
        }

        public Criteria andLat1LessThan(Double value) {
            addCriterion("lat1 <", value, "lat1");
            return (Criteria) this;
        }

        public Criteria andLat1LessThanOrEqualTo(Double value) {
            addCriterion("lat1 <=", value, "lat1");
            return (Criteria) this;
        }

        public Criteria andLat1In(List<Double> values) {
            addCriterion("lat1 in", values, "lat1");
            return (Criteria) this;
        }

        public Criteria andLat1NotIn(List<Double> values) {
            addCriterion("lat1 not in", values, "lat1");
            return (Criteria) this;
        }

        public Criteria andLat1Between(Double value1, Double value2) {
            addCriterion("lat1 between", value1, value2, "lat1");
            return (Criteria) this;
        }

        public Criteria andLat1NotBetween(Double value1, Double value2) {
            addCriterion("lat1 not between", value1, value2, "lat1");
            return (Criteria) this;
        }

        public Criteria andLon1IsNull() {
            addCriterion("lon1 is null");
            return (Criteria) this;
        }

        public Criteria andLon1IsNotNull() {
            addCriterion("lon1 is not null");
            return (Criteria) this;
        }

        public Criteria andLon1EqualTo(Double value) {
            addCriterion("lon1 =", value, "lon1");
            return (Criteria) this;
        }

        public Criteria andLon1NotEqualTo(Double value) {
            addCriterion("lon1 <>", value, "lon1");
            return (Criteria) this;
        }

        public Criteria andLon1GreaterThan(Double value) {
            addCriterion("lon1 >", value, "lon1");
            return (Criteria) this;
        }

        public Criteria andLon1GreaterThanOrEqualTo(Double value) {
            addCriterion("lon1 >=", value, "lon1");
            return (Criteria) this;
        }

        public Criteria andLon1LessThan(Double value) {
            addCriterion("lon1 <", value, "lon1");
            return (Criteria) this;
        }

        public Criteria andLon1LessThanOrEqualTo(Double value) {
            addCriterion("lon1 <=", value, "lon1");
            return (Criteria) this;
        }

        public Criteria andLon1In(List<Double> values) {
            addCriterion("lon1 in", values, "lon1");
            return (Criteria) this;
        }

        public Criteria andLon1NotIn(List<Double> values) {
            addCriterion("lon1 not in", values, "lon1");
            return (Criteria) this;
        }

        public Criteria andLon1Between(Double value1, Double value2) {
            addCriterion("lon1 between", value1, value2, "lon1");
            return (Criteria) this;
        }

        public Criteria andLon1NotBetween(Double value1, Double value2) {
            addCriterion("lon1 not between", value1, value2, "lon1");
            return (Criteria) this;
        }

        public Criteria andLat2IsNull() {
            addCriterion("lat2 is null");
            return (Criteria) this;
        }

        public Criteria andLat2IsNotNull() {
            addCriterion("lat2 is not null");
            return (Criteria) this;
        }

        public Criteria andLat2EqualTo(Double value) {
            addCriterion("lat2 =", value, "lat2");
            return (Criteria) this;
        }

        public Criteria andLat2NotEqualTo(Double value) {
            addCriterion("lat2 <>", value, "lat2");
            return (Criteria) this;
        }

        public Criteria andLat2GreaterThan(Double value) {
            addCriterion("lat2 >", value, "lat2");
            return (Criteria) this;
        }

        public Criteria andLat2GreaterThanOrEqualTo(Double value) {
            addCriterion("lat2 >=", value, "lat2");
            return (Criteria) this;
        }

        public Criteria andLat2LessThan(Double value) {
            addCriterion("lat2 <", value, "lat2");
            return (Criteria) this;
        }

        public Criteria andLat2LessThanOrEqualTo(Double value) {
            addCriterion("lat2 <=", value, "lat2");
            return (Criteria) this;
        }

        public Criteria andLat2In(List<Double> values) {
            addCriterion("lat2 in", values, "lat2");
            return (Criteria) this;
        }

        public Criteria andLat2NotIn(List<Double> values) {
            addCriterion("lat2 not in", values, "lat2");
            return (Criteria) this;
        }

        public Criteria andLat2Between(Double value1, Double value2) {
            addCriterion("lat2 between", value1, value2, "lat2");
            return (Criteria) this;
        }

        public Criteria andLat2NotBetween(Double value1, Double value2) {
            addCriterion("lat2 not between", value1, value2, "lat2");
            return (Criteria) this;
        }

        public Criteria andLon2IsNull() {
            addCriterion("lon2 is null");
            return (Criteria) this;
        }

        public Criteria andLon2IsNotNull() {
            addCriterion("lon2 is not null");
            return (Criteria) this;
        }

        public Criteria andLon2EqualTo(Double value) {
            addCriterion("lon2 =", value, "lon2");
            return (Criteria) this;
        }

        public Criteria andLon2NotEqualTo(Double value) {
            addCriterion("lon2 <>", value, "lon2");
            return (Criteria) this;
        }

        public Criteria andLon2GreaterThan(Double value) {
            addCriterion("lon2 >", value, "lon2");
            return (Criteria) this;
        }

        public Criteria andLon2GreaterThanOrEqualTo(Double value) {
            addCriterion("lon2 >=", value, "lon2");
            return (Criteria) this;
        }

        public Criteria andLon2LessThan(Double value) {
            addCriterion("lon2 <", value, "lon2");
            return (Criteria) this;
        }

        public Criteria andLon2LessThanOrEqualTo(Double value) {
            addCriterion("lon2 <=", value, "lon2");
            return (Criteria) this;
        }

        public Criteria andLon2In(List<Double> values) {
            addCriterion("lon2 in", values, "lon2");
            return (Criteria) this;
        }

        public Criteria andLon2NotIn(List<Double> values) {
            addCriterion("lon2 not in", values, "lon2");
            return (Criteria) this;
        }

        public Criteria andLon2Between(Double value1, Double value2) {
            addCriterion("lon2 between", value1, value2, "lon2");
            return (Criteria) this;
        }

        public Criteria andLon2NotBetween(Double value1, Double value2) {
            addCriterion("lon2 not between", value1, value2, "lon2");
            return (Criteria) this;
        }

        public Criteria andLat3IsNull() {
            addCriterion("lat3 is null");
            return (Criteria) this;
        }

        public Criteria andLat3IsNotNull() {
            addCriterion("lat3 is not null");
            return (Criteria) this;
        }

        public Criteria andLat3EqualTo(Double value) {
            addCriterion("lat3 =", value, "lat3");
            return (Criteria) this;
        }

        public Criteria andLat3NotEqualTo(Double value) {
            addCriterion("lat3 <>", value, "lat3");
            return (Criteria) this;
        }

        public Criteria andLat3GreaterThan(Double value) {
            addCriterion("lat3 >", value, "lat3");
            return (Criteria) this;
        }

        public Criteria andLat3GreaterThanOrEqualTo(Double value) {
            addCriterion("lat3 >=", value, "lat3");
            return (Criteria) this;
        }

        public Criteria andLat3LessThan(Double value) {
            addCriterion("lat3 <", value, "lat3");
            return (Criteria) this;
        }

        public Criteria andLat3LessThanOrEqualTo(Double value) {
            addCriterion("lat3 <=", value, "lat3");
            return (Criteria) this;
        }

        public Criteria andLat3In(List<Double> values) {
            addCriterion("lat3 in", values, "lat3");
            return (Criteria) this;
        }

        public Criteria andLat3NotIn(List<Double> values) {
            addCriterion("lat3 not in", values, "lat3");
            return (Criteria) this;
        }

        public Criteria andLat3Between(Double value1, Double value2) {
            addCriterion("lat3 between", value1, value2, "lat3");
            return (Criteria) this;
        }

        public Criteria andLat3NotBetween(Double value1, Double value2) {
            addCriterion("lat3 not between", value1, value2, "lat3");
            return (Criteria) this;
        }

        public Criteria andLon3IsNull() {
            addCriterion("lon3 is null");
            return (Criteria) this;
        }

        public Criteria andLon3IsNotNull() {
            addCriterion("lon3 is not null");
            return (Criteria) this;
        }

        public Criteria andLon3EqualTo(Double value) {
            addCriterion("lon3 =", value, "lon3");
            return (Criteria) this;
        }

        public Criteria andLon3NotEqualTo(Double value) {
            addCriterion("lon3 <>", value, "lon3");
            return (Criteria) this;
        }

        public Criteria andLon3GreaterThan(Double value) {
            addCriterion("lon3 >", value, "lon3");
            return (Criteria) this;
        }

        public Criteria andLon3GreaterThanOrEqualTo(Double value) {
            addCriterion("lon3 >=", value, "lon3");
            return (Criteria) this;
        }

        public Criteria andLon3LessThan(Double value) {
            addCriterion("lon3 <", value, "lon3");
            return (Criteria) this;
        }

        public Criteria andLon3LessThanOrEqualTo(Double value) {
            addCriterion("lon3 <=", value, "lon3");
            return (Criteria) this;
        }

        public Criteria andLon3In(List<Double> values) {
            addCriterion("lon3 in", values, "lon3");
            return (Criteria) this;
        }

        public Criteria andLon3NotIn(List<Double> values) {
            addCriterion("lon3 not in", values, "lon3");
            return (Criteria) this;
        }

        public Criteria andLon3Between(Double value1, Double value2) {
            addCriterion("lon3 between", value1, value2, "lon3");
            return (Criteria) this;
        }

        public Criteria andLon3NotBetween(Double value1, Double value2) {
            addCriterion("lon3 not between", value1, value2, "lon3");
            return (Criteria) this;
        }

        public Criteria andLat4IsNull() {
            addCriterion("lat4 is null");
            return (Criteria) this;
        }

        public Criteria andLat4IsNotNull() {
            addCriterion("lat4 is not null");
            return (Criteria) this;
        }

        public Criteria andLat4EqualTo(Double value) {
            addCriterion("lat4 =", value, "lat4");
            return (Criteria) this;
        }

        public Criteria andLat4NotEqualTo(Double value) {
            addCriterion("lat4 <>", value, "lat4");
            return (Criteria) this;
        }

        public Criteria andLat4GreaterThan(Double value) {
            addCriterion("lat4 >", value, "lat4");
            return (Criteria) this;
        }

        public Criteria andLat4GreaterThanOrEqualTo(Double value) {
            addCriterion("lat4 >=", value, "lat4");
            return (Criteria) this;
        }

        public Criteria andLat4LessThan(Double value) {
            addCriterion("lat4 <", value, "lat4");
            return (Criteria) this;
        }

        public Criteria andLat4LessThanOrEqualTo(Double value) {
            addCriterion("lat4 <=", value, "lat4");
            return (Criteria) this;
        }

        public Criteria andLat4In(List<Double> values) {
            addCriterion("lat4 in", values, "lat4");
            return (Criteria) this;
        }

        public Criteria andLat4NotIn(List<Double> values) {
            addCriterion("lat4 not in", values, "lat4");
            return (Criteria) this;
        }

        public Criteria andLat4Between(Double value1, Double value2) {
            addCriterion("lat4 between", value1, value2, "lat4");
            return (Criteria) this;
        }

        public Criteria andLat4NotBetween(Double value1, Double value2) {
            addCriterion("lat4 not between", value1, value2, "lat4");
            return (Criteria) this;
        }

        public Criteria andLon4IsNull() {
            addCriterion("lon4 is null");
            return (Criteria) this;
        }

        public Criteria andLon4IsNotNull() {
            addCriterion("lon4 is not null");
            return (Criteria) this;
        }

        public Criteria andLon4EqualTo(Double value) {
            addCriterion("lon4 =", value, "lon4");
            return (Criteria) this;
        }

        public Criteria andLon4NotEqualTo(Double value) {
            addCriterion("lon4 <>", value, "lon4");
            return (Criteria) this;
        }

        public Criteria andLon4GreaterThan(Double value) {
            addCriterion("lon4 >", value, "lon4");
            return (Criteria) this;
        }

        public Criteria andLon4GreaterThanOrEqualTo(Double value) {
            addCriterion("lon4 >=", value, "lon4");
            return (Criteria) this;
        }

        public Criteria andLon4LessThan(Double value) {
            addCriterion("lon4 <", value, "lon4");
            return (Criteria) this;
        }

        public Criteria andLon4LessThanOrEqualTo(Double value) {
            addCriterion("lon4 <=", value, "lon4");
            return (Criteria) this;
        }

        public Criteria andLon4In(List<Double> values) {
            addCriterion("lon4 in", values, "lon4");
            return (Criteria) this;
        }

        public Criteria andLon4NotIn(List<Double> values) {
            addCriterion("lon4 not in", values, "lon4");
            return (Criteria) this;
        }

        public Criteria andLon4Between(Double value1, Double value2) {
            addCriterion("lon4 between", value1, value2, "lon4");
            return (Criteria) this;
        }

        public Criteria andLon4NotBetween(Double value1, Double value2) {
            addCriterion("lon4 not between", value1, value2, "lon4");
            return (Criteria) this;
        }

        public Criteria andLat5IsNull() {
            addCriterion("lat5 is null");
            return (Criteria) this;
        }

        public Criteria andLat5IsNotNull() {
            addCriterion("lat5 is not null");
            return (Criteria) this;
        }

        public Criteria andLat5EqualTo(Double value) {
            addCriterion("lat5 =", value, "lat5");
            return (Criteria) this;
        }

        public Criteria andLat5NotEqualTo(Double value) {
            addCriterion("lat5 <>", value, "lat5");
            return (Criteria) this;
        }

        public Criteria andLat5GreaterThan(Double value) {
            addCriterion("lat5 >", value, "lat5");
            return (Criteria) this;
        }

        public Criteria andLat5GreaterThanOrEqualTo(Double value) {
            addCriterion("lat5 >=", value, "lat5");
            return (Criteria) this;
        }

        public Criteria andLat5LessThan(Double value) {
            addCriterion("lat5 <", value, "lat5");
            return (Criteria) this;
        }

        public Criteria andLat5LessThanOrEqualTo(Double value) {
            addCriterion("lat5 <=", value, "lat5");
            return (Criteria) this;
        }

        public Criteria andLat5In(List<Double> values) {
            addCriterion("lat5 in", values, "lat5");
            return (Criteria) this;
        }

        public Criteria andLat5NotIn(List<Double> values) {
            addCriterion("lat5 not in", values, "lat5");
            return (Criteria) this;
        }

        public Criteria andLat5Between(Double value1, Double value2) {
            addCriterion("lat5 between", value1, value2, "lat5");
            return (Criteria) this;
        }

        public Criteria andLat5NotBetween(Double value1, Double value2) {
            addCriterion("lat5 not between", value1, value2, "lat5");
            return (Criteria) this;
        }

        public Criteria andLon5IsNull() {
            addCriterion("lon5 is null");
            return (Criteria) this;
        }

        public Criteria andLon5IsNotNull() {
            addCriterion("lon5 is not null");
            return (Criteria) this;
        }

        public Criteria andLon5EqualTo(Double value) {
            addCriterion("lon5 =", value, "lon5");
            return (Criteria) this;
        }

        public Criteria andLon5NotEqualTo(Double value) {
            addCriterion("lon5 <>", value, "lon5");
            return (Criteria) this;
        }

        public Criteria andLon5GreaterThan(Double value) {
            addCriterion("lon5 >", value, "lon5");
            return (Criteria) this;
        }

        public Criteria andLon5GreaterThanOrEqualTo(Double value) {
            addCriterion("lon5 >=", value, "lon5");
            return (Criteria) this;
        }

        public Criteria andLon5LessThan(Double value) {
            addCriterion("lon5 <", value, "lon5");
            return (Criteria) this;
        }

        public Criteria andLon5LessThanOrEqualTo(Double value) {
            addCriterion("lon5 <=", value, "lon5");
            return (Criteria) this;
        }

        public Criteria andLon5In(List<Double> values) {
            addCriterion("lon5 in", values, "lon5");
            return (Criteria) this;
        }

        public Criteria andLon5NotIn(List<Double> values) {
            addCriterion("lon5 not in", values, "lon5");
            return (Criteria) this;
        }

        public Criteria andLon5Between(Double value1, Double value2) {
            addCriterion("lon5 between", value1, value2, "lon5");
            return (Criteria) this;
        }

        public Criteria andLon5NotBetween(Double value1, Double value2) {
            addCriterion("lon5 not between", value1, value2, "lon5");
            return (Criteria) this;
        }

        public Criteria andLat6IsNull() {
            addCriterion("lat6 is null");
            return (Criteria) this;
        }

        public Criteria andLat6IsNotNull() {
            addCriterion("lat6 is not null");
            return (Criteria) this;
        }

        public Criteria andLat6EqualTo(Double value) {
            addCriterion("lat6 =", value, "lat6");
            return (Criteria) this;
        }

        public Criteria andLat6NotEqualTo(Double value) {
            addCriterion("lat6 <>", value, "lat6");
            return (Criteria) this;
        }

        public Criteria andLat6GreaterThan(Double value) {
            addCriterion("lat6 >", value, "lat6");
            return (Criteria) this;
        }

        public Criteria andLat6GreaterThanOrEqualTo(Double value) {
            addCriterion("lat6 >=", value, "lat6");
            return (Criteria) this;
        }

        public Criteria andLat6LessThan(Double value) {
            addCriterion("lat6 <", value, "lat6");
            return (Criteria) this;
        }

        public Criteria andLat6LessThanOrEqualTo(Double value) {
            addCriterion("lat6 <=", value, "lat6");
            return (Criteria) this;
        }

        public Criteria andLat6In(List<Double> values) {
            addCriterion("lat6 in", values, "lat6");
            return (Criteria) this;
        }

        public Criteria andLat6NotIn(List<Double> values) {
            addCriterion("lat6 not in", values, "lat6");
            return (Criteria) this;
        }

        public Criteria andLat6Between(Double value1, Double value2) {
            addCriterion("lat6 between", value1, value2, "lat6");
            return (Criteria) this;
        }

        public Criteria andLat6NotBetween(Double value1, Double value2) {
            addCriterion("lat6 not between", value1, value2, "lat6");
            return (Criteria) this;
        }

        public Criteria andLon6IsNull() {
            addCriterion("lon6 is null");
            return (Criteria) this;
        }

        public Criteria andLon6IsNotNull() {
            addCriterion("lon6 is not null");
            return (Criteria) this;
        }

        public Criteria andLon6EqualTo(Double value) {
            addCriterion("lon6 =", value, "lon6");
            return (Criteria) this;
        }

        public Criteria andLon6NotEqualTo(Double value) {
            addCriterion("lon6 <>", value, "lon6");
            return (Criteria) this;
        }

        public Criteria andLon6GreaterThan(Double value) {
            addCriterion("lon6 >", value, "lon6");
            return (Criteria) this;
        }

        public Criteria andLon6GreaterThanOrEqualTo(Double value) {
            addCriterion("lon6 >=", value, "lon6");
            return (Criteria) this;
        }

        public Criteria andLon6LessThan(Double value) {
            addCriterion("lon6 <", value, "lon6");
            return (Criteria) this;
        }

        public Criteria andLon6LessThanOrEqualTo(Double value) {
            addCriterion("lon6 <=", value, "lon6");
            return (Criteria) this;
        }

        public Criteria andLon6In(List<Double> values) {
            addCriterion("lon6 in", values, "lon6");
            return (Criteria) this;
        }

        public Criteria andLon6NotIn(List<Double> values) {
            addCriterion("lon6 not in", values, "lon6");
            return (Criteria) this;
        }

        public Criteria andLon6Between(Double value1, Double value2) {
            addCriterion("lon6 between", value1, value2, "lon6");
            return (Criteria) this;
        }

        public Criteria andLon6NotBetween(Double value1, Double value2) {
            addCriterion("lon6 not between", value1, value2, "lon6");
            return (Criteria) this;
        }

        public Criteria andLat7IsNull() {
            addCriterion("lat7 is null");
            return (Criteria) this;
        }

        public Criteria andLat7IsNotNull() {
            addCriterion("lat7 is not null");
            return (Criteria) this;
        }

        public Criteria andLat7EqualTo(Double value) {
            addCriterion("lat7 =", value, "lat7");
            return (Criteria) this;
        }

        public Criteria andLat7NotEqualTo(Double value) {
            addCriterion("lat7 <>", value, "lat7");
            return (Criteria) this;
        }

        public Criteria andLat7GreaterThan(Double value) {
            addCriterion("lat7 >", value, "lat7");
            return (Criteria) this;
        }

        public Criteria andLat7GreaterThanOrEqualTo(Double value) {
            addCriterion("lat7 >=", value, "lat7");
            return (Criteria) this;
        }

        public Criteria andLat7LessThan(Double value) {
            addCriterion("lat7 <", value, "lat7");
            return (Criteria) this;
        }

        public Criteria andLat7LessThanOrEqualTo(Double value) {
            addCriterion("lat7 <=", value, "lat7");
            return (Criteria) this;
        }

        public Criteria andLat7In(List<Double> values) {
            addCriterion("lat7 in", values, "lat7");
            return (Criteria) this;
        }

        public Criteria andLat7NotIn(List<Double> values) {
            addCriterion("lat7 not in", values, "lat7");
            return (Criteria) this;
        }

        public Criteria andLat7Between(Double value1, Double value2) {
            addCriterion("lat7 between", value1, value2, "lat7");
            return (Criteria) this;
        }

        public Criteria andLat7NotBetween(Double value1, Double value2) {
            addCriterion("lat7 not between", value1, value2, "lat7");
            return (Criteria) this;
        }

        public Criteria andLon7IsNull() {
            addCriterion("lon7 is null");
            return (Criteria) this;
        }

        public Criteria andLon7IsNotNull() {
            addCriterion("lon7 is not null");
            return (Criteria) this;
        }

        public Criteria andLon7EqualTo(Double value) {
            addCriterion("lon7 =", value, "lon7");
            return (Criteria) this;
        }

        public Criteria andLon7NotEqualTo(Double value) {
            addCriterion("lon7 <>", value, "lon7");
            return (Criteria) this;
        }

        public Criteria andLon7GreaterThan(Double value) {
            addCriterion("lon7 >", value, "lon7");
            return (Criteria) this;
        }

        public Criteria andLon7GreaterThanOrEqualTo(Double value) {
            addCriterion("lon7 >=", value, "lon7");
            return (Criteria) this;
        }

        public Criteria andLon7LessThan(Double value) {
            addCriterion("lon7 <", value, "lon7");
            return (Criteria) this;
        }

        public Criteria andLon7LessThanOrEqualTo(Double value) {
            addCriterion("lon7 <=", value, "lon7");
            return (Criteria) this;
        }

        public Criteria andLon7In(List<Double> values) {
            addCriterion("lon7 in", values, "lon7");
            return (Criteria) this;
        }

        public Criteria andLon7NotIn(List<Double> values) {
            addCriterion("lon7 not in", values, "lon7");
            return (Criteria) this;
        }

        public Criteria andLon7Between(Double value1, Double value2) {
            addCriterion("lon7 between", value1, value2, "lon7");
            return (Criteria) this;
        }

        public Criteria andLon7NotBetween(Double value1, Double value2) {
            addCriterion("lon7 not between", value1, value2, "lon7");
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