package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class CountyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CountyExample() {
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

        public Criteria andCountyIdIsNull() {
            addCriterion("COUNTY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCountyIdIsNotNull() {
            addCriterion("COUNTY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCountyIdEqualTo(String value) {
            addCriterion("COUNTY_ID =", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotEqualTo(String value) {
            addCriterion("COUNTY_ID <>", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdGreaterThan(String value) {
            addCriterion("COUNTY_ID >", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTY_ID >=", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLessThan(String value) {
            addCriterion("COUNTY_ID <", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLessThanOrEqualTo(String value) {
            addCriterion("COUNTY_ID <=", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLike(String value) {
            addCriterion("COUNTY_ID like", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotLike(String value) {
            addCriterion("COUNTY_ID not like", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdIn(List<String> values) {
            addCriterion("COUNTY_ID in", values, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotIn(List<String> values) {
            addCriterion("COUNTY_ID not in", values, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdBetween(String value1, String value2) {
            addCriterion("COUNTY_ID between", value1, value2, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotBetween(String value1, String value2) {
            addCriterion("COUNTY_ID not between", value1, value2, "countyId");
            return (Criteria) this;
        }

        public Criteria andProviceCodeIsNull() {
            addCriterion("provice_code is null");
            return (Criteria) this;
        }

        public Criteria andProviceCodeIsNotNull() {
            addCriterion("provice_code is not null");
            return (Criteria) this;
        }

        public Criteria andProviceCodeEqualTo(String value) {
            addCriterion("provice_code =", value, "proviceCode");
            return (Criteria) this;
        }

        public Criteria andProviceCodeNotEqualTo(String value) {
            addCriterion("provice_code <>", value, "proviceCode");
            return (Criteria) this;
        }

        public Criteria andProviceCodeGreaterThan(String value) {
            addCriterion("provice_code >", value, "proviceCode");
            return (Criteria) this;
        }

        public Criteria andProviceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("provice_code >=", value, "proviceCode");
            return (Criteria) this;
        }

        public Criteria andProviceCodeLessThan(String value) {
            addCriterion("provice_code <", value, "proviceCode");
            return (Criteria) this;
        }

        public Criteria andProviceCodeLessThanOrEqualTo(String value) {
            addCriterion("provice_code <=", value, "proviceCode");
            return (Criteria) this;
        }

        public Criteria andProviceCodeLike(String value) {
            addCriterion("provice_code like", value, "proviceCode");
            return (Criteria) this;
        }

        public Criteria andProviceCodeNotLike(String value) {
            addCriterion("provice_code not like", value, "proviceCode");
            return (Criteria) this;
        }

        public Criteria andProviceCodeIn(List<String> values) {
            addCriterion("provice_code in", values, "proviceCode");
            return (Criteria) this;
        }

        public Criteria andProviceCodeNotIn(List<String> values) {
            addCriterion("provice_code not in", values, "proviceCode");
            return (Criteria) this;
        }

        public Criteria andProviceCodeBetween(String value1, String value2) {
            addCriterion("provice_code between", value1, value2, "proviceCode");
            return (Criteria) this;
        }

        public Criteria andProviceCodeNotBetween(String value1, String value2) {
            addCriterion("provice_code not between", value1, value2, "proviceCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("city_code is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("city_code is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("city_code =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("city_code <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("city_code >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("city_code >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("city_code <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("city_code <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("city_code like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("city_code not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("city_code in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("city_code not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("city_code between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("city_code not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCountyNameIsNull() {
            addCriterion("COUNTY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCountyNameIsNotNull() {
            addCriterion("COUNTY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCountyNameEqualTo(String value) {
            addCriterion("COUNTY_NAME =", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameNotEqualTo(String value) {
            addCriterion("COUNTY_NAME <>", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameGreaterThan(String value) {
            addCriterion("COUNTY_NAME >", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTY_NAME >=", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameLessThan(String value) {
            addCriterion("COUNTY_NAME <", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameLessThanOrEqualTo(String value) {
            addCriterion("COUNTY_NAME <=", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameLike(String value) {
            addCriterion("COUNTY_NAME like", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameNotLike(String value) {
            addCriterion("COUNTY_NAME not like", value, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameIn(List<String> values) {
            addCriterion("COUNTY_NAME in", values, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameNotIn(List<String> values) {
            addCriterion("COUNTY_NAME not in", values, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameBetween(String value1, String value2) {
            addCriterion("COUNTY_NAME between", value1, value2, "countyName");
            return (Criteria) this;
        }

        public Criteria andCountyNameNotBetween(String value1, String value2) {
            addCriterion("COUNTY_NAME not between", value1, value2, "countyName");
            return (Criteria) this;
        }

        public Criteria andTotalgridsIsNull() {
            addCriterion("TOTALGRIDS is null");
            return (Criteria) this;
        }

        public Criteria andTotalgridsIsNotNull() {
            addCriterion("TOTALGRIDS is not null");
            return (Criteria) this;
        }

        public Criteria andTotalgridsEqualTo(Integer value) {
            addCriterion("TOTALGRIDS =", value, "totalgrids");
            return (Criteria) this;
        }

        public Criteria andTotalgridsNotEqualTo(Integer value) {
            addCriterion("TOTALGRIDS <>", value, "totalgrids");
            return (Criteria) this;
        }

        public Criteria andTotalgridsGreaterThan(Integer value) {
            addCriterion("TOTALGRIDS >", value, "totalgrids");
            return (Criteria) this;
        }

        public Criteria andTotalgridsGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOTALGRIDS >=", value, "totalgrids");
            return (Criteria) this;
        }

        public Criteria andTotalgridsLessThan(Integer value) {
            addCriterion("TOTALGRIDS <", value, "totalgrids");
            return (Criteria) this;
        }

        public Criteria andTotalgridsLessThanOrEqualTo(Integer value) {
            addCriterion("TOTALGRIDS <=", value, "totalgrids");
            return (Criteria) this;
        }

        public Criteria andTotalgridsIn(List<Integer> values) {
            addCriterion("TOTALGRIDS in", values, "totalgrids");
            return (Criteria) this;
        }

        public Criteria andTotalgridsNotIn(List<Integer> values) {
            addCriterion("TOTALGRIDS not in", values, "totalgrids");
            return (Criteria) this;
        }

        public Criteria andTotalgridsBetween(Integer value1, Integer value2) {
            addCriterion("TOTALGRIDS between", value1, value2, "totalgrids");
            return (Criteria) this;
        }

        public Criteria andTotalgridsNotBetween(Integer value1, Integer value2) {
            addCriterion("TOTALGRIDS not between", value1, value2, "totalgrids");
            return (Criteria) this;
        }

        public Criteria andXmaxIsNull() {
            addCriterion("XMAX is null");
            return (Criteria) this;
        }

        public Criteria andXmaxIsNotNull() {
            addCriterion("XMAX is not null");
            return (Criteria) this;
        }

        public Criteria andXmaxEqualTo(Double value) {
            addCriterion("XMAX =", value, "xmax");
            return (Criteria) this;
        }

        public Criteria andXmaxNotEqualTo(Double value) {
            addCriterion("XMAX <>", value, "xmax");
            return (Criteria) this;
        }

        public Criteria andXmaxGreaterThan(Double value) {
            addCriterion("XMAX >", value, "xmax");
            return (Criteria) this;
        }

        public Criteria andXmaxGreaterThanOrEqualTo(Double value) {
            addCriterion("XMAX >=", value, "xmax");
            return (Criteria) this;
        }

        public Criteria andXmaxLessThan(Double value) {
            addCriterion("XMAX <", value, "xmax");
            return (Criteria) this;
        }

        public Criteria andXmaxLessThanOrEqualTo(Double value) {
            addCriterion("XMAX <=", value, "xmax");
            return (Criteria) this;
        }

        public Criteria andXmaxIn(List<Double> values) {
            addCriterion("XMAX in", values, "xmax");
            return (Criteria) this;
        }

        public Criteria andXmaxNotIn(List<Double> values) {
            addCriterion("XMAX not in", values, "xmax");
            return (Criteria) this;
        }

        public Criteria andXmaxBetween(Double value1, Double value2) {
            addCriterion("XMAX between", value1, value2, "xmax");
            return (Criteria) this;
        }

        public Criteria andXmaxNotBetween(Double value1, Double value2) {
            addCriterion("XMAX not between", value1, value2, "xmax");
            return (Criteria) this;
        }

        public Criteria andXminIsNull() {
            addCriterion("XMIN is null");
            return (Criteria) this;
        }

        public Criteria andXminIsNotNull() {
            addCriterion("XMIN is not null");
            return (Criteria) this;
        }

        public Criteria andXminEqualTo(Double value) {
            addCriterion("XMIN =", value, "xmin");
            return (Criteria) this;
        }

        public Criteria andXminNotEqualTo(Double value) {
            addCriterion("XMIN <>", value, "xmin");
            return (Criteria) this;
        }

        public Criteria andXminGreaterThan(Double value) {
            addCriterion("XMIN >", value, "xmin");
            return (Criteria) this;
        }

        public Criteria andXminGreaterThanOrEqualTo(Double value) {
            addCriterion("XMIN >=", value, "xmin");
            return (Criteria) this;
        }

        public Criteria andXminLessThan(Double value) {
            addCriterion("XMIN <", value, "xmin");
            return (Criteria) this;
        }

        public Criteria andXminLessThanOrEqualTo(Double value) {
            addCriterion("XMIN <=", value, "xmin");
            return (Criteria) this;
        }

        public Criteria andXminIn(List<Double> values) {
            addCriterion("XMIN in", values, "xmin");
            return (Criteria) this;
        }

        public Criteria andXminNotIn(List<Double> values) {
            addCriterion("XMIN not in", values, "xmin");
            return (Criteria) this;
        }

        public Criteria andXminBetween(Double value1, Double value2) {
            addCriterion("XMIN between", value1, value2, "xmin");
            return (Criteria) this;
        }

        public Criteria andXminNotBetween(Double value1, Double value2) {
            addCriterion("XMIN not between", value1, value2, "xmin");
            return (Criteria) this;
        }

        public Criteria andYmaxIsNull() {
            addCriterion("YMAX is null");
            return (Criteria) this;
        }

        public Criteria andYmaxIsNotNull() {
            addCriterion("YMAX is not null");
            return (Criteria) this;
        }

        public Criteria andYmaxEqualTo(Double value) {
            addCriterion("YMAX =", value, "ymax");
            return (Criteria) this;
        }

        public Criteria andYmaxNotEqualTo(Double value) {
            addCriterion("YMAX <>", value, "ymax");
            return (Criteria) this;
        }

        public Criteria andYmaxGreaterThan(Double value) {
            addCriterion("YMAX >", value, "ymax");
            return (Criteria) this;
        }

        public Criteria andYmaxGreaterThanOrEqualTo(Double value) {
            addCriterion("YMAX >=", value, "ymax");
            return (Criteria) this;
        }

        public Criteria andYmaxLessThan(Double value) {
            addCriterion("YMAX <", value, "ymax");
            return (Criteria) this;
        }

        public Criteria andYmaxLessThanOrEqualTo(Double value) {
            addCriterion("YMAX <=", value, "ymax");
            return (Criteria) this;
        }

        public Criteria andYmaxIn(List<Double> values) {
            addCriterion("YMAX in", values, "ymax");
            return (Criteria) this;
        }

        public Criteria andYmaxNotIn(List<Double> values) {
            addCriterion("YMAX not in", values, "ymax");
            return (Criteria) this;
        }

        public Criteria andYmaxBetween(Double value1, Double value2) {
            addCriterion("YMAX between", value1, value2, "ymax");
            return (Criteria) this;
        }

        public Criteria andYmaxNotBetween(Double value1, Double value2) {
            addCriterion("YMAX not between", value1, value2, "ymax");
            return (Criteria) this;
        }

        public Criteria andYminIsNull() {
            addCriterion("YMIN is null");
            return (Criteria) this;
        }

        public Criteria andYminIsNotNull() {
            addCriterion("YMIN is not null");
            return (Criteria) this;
        }

        public Criteria andYminEqualTo(Double value) {
            addCriterion("YMIN =", value, "ymin");
            return (Criteria) this;
        }

        public Criteria andYminNotEqualTo(Double value) {
            addCriterion("YMIN <>", value, "ymin");
            return (Criteria) this;
        }

        public Criteria andYminGreaterThan(Double value) {
            addCriterion("YMIN >", value, "ymin");
            return (Criteria) this;
        }

        public Criteria andYminGreaterThanOrEqualTo(Double value) {
            addCriterion("YMIN >=", value, "ymin");
            return (Criteria) this;
        }

        public Criteria andYminLessThan(Double value) {
            addCriterion("YMIN <", value, "ymin");
            return (Criteria) this;
        }

        public Criteria andYminLessThanOrEqualTo(Double value) {
            addCriterion("YMIN <=", value, "ymin");
            return (Criteria) this;
        }

        public Criteria andYminIn(List<Double> values) {
            addCriterion("YMIN in", values, "ymin");
            return (Criteria) this;
        }

        public Criteria andYminNotIn(List<Double> values) {
            addCriterion("YMIN not in", values, "ymin");
            return (Criteria) this;
        }

        public Criteria andYminBetween(Double value1, Double value2) {
            addCriterion("YMIN between", value1, value2, "ymin");
            return (Criteria) this;
        }

        public Criteria andYminNotBetween(Double value1, Double value2) {
            addCriterion("YMIN not between", value1, value2, "ymin");
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