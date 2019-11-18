package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FYardDustSourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FYardDustSourceExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andWindDustidIsNull() {
            addCriterion("wind_dustid is null");
            return (Criteria) this;
        }

        public Criteria andWindDustidIsNotNull() {
            addCriterion("wind_dustid is not null");
            return (Criteria) this;
        }

        public Criteria andWindDustidEqualTo(Integer value) {
            addCriterion("wind_dustid =", value, "windDustid");
            return (Criteria) this;
        }

        public Criteria andWindDustidNotEqualTo(Integer value) {
            addCriterion("wind_dustid <>", value, "windDustid");
            return (Criteria) this;
        }

        public Criteria andWindDustidGreaterThan(Integer value) {
            addCriterion("wind_dustid >", value, "windDustid");
            return (Criteria) this;
        }

        public Criteria andWindDustidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wind_dustid >=", value, "windDustid");
            return (Criteria) this;
        }

        public Criteria andWindDustidLessThan(Integer value) {
            addCriterion("wind_dustid <", value, "windDustid");
            return (Criteria) this;
        }

        public Criteria andWindDustidLessThanOrEqualTo(Integer value) {
            addCriterion("wind_dustid <=", value, "windDustid");
            return (Criteria) this;
        }

        public Criteria andWindDustidIn(List<Integer> values) {
            addCriterion("wind_dustid in", values, "windDustid");
            return (Criteria) this;
        }

        public Criteria andWindDustidNotIn(List<Integer> values) {
            addCriterion("wind_dustid not in", values, "windDustid");
            return (Criteria) this;
        }

        public Criteria andWindDustidBetween(Integer value1, Integer value2) {
            addCriterion("wind_dustid between", value1, value2, "windDustid");
            return (Criteria) this;
        }

        public Criteria andWindDustidNotBetween(Integer value1, Integer value2) {
            addCriterion("wind_dustid not between", value1, value2, "windDustid");
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

        public Criteria andLongitude1IsNull() {
            addCriterion("longitude1 is null");
            return (Criteria) this;
        }

        public Criteria andLongitude1IsNotNull() {
            addCriterion("longitude1 is not null");
            return (Criteria) this;
        }

        public Criteria andLongitude1EqualTo(Double value) {
            addCriterion("longitude1 =", value, "longitude1");
            return (Criteria) this;
        }

        public Criteria andLongitude1NotEqualTo(Double value) {
            addCriterion("longitude1 <>", value, "longitude1");
            return (Criteria) this;
        }

        public Criteria andLongitude1GreaterThan(Double value) {
            addCriterion("longitude1 >", value, "longitude1");
            return (Criteria) this;
        }

        public Criteria andLongitude1GreaterThanOrEqualTo(Double value) {
            addCriterion("longitude1 >=", value, "longitude1");
            return (Criteria) this;
        }

        public Criteria andLongitude1LessThan(Double value) {
            addCriterion("longitude1 <", value, "longitude1");
            return (Criteria) this;
        }

        public Criteria andLongitude1LessThanOrEqualTo(Double value) {
            addCriterion("longitude1 <=", value, "longitude1");
            return (Criteria) this;
        }

        public Criteria andLongitude1In(List<Double> values) {
            addCriterion("longitude1 in", values, "longitude1");
            return (Criteria) this;
        }

        public Criteria andLongitude1NotIn(List<Double> values) {
            addCriterion("longitude1 not in", values, "longitude1");
            return (Criteria) this;
        }

        public Criteria andLongitude1Between(Double value1, Double value2) {
            addCriterion("longitude1 between", value1, value2, "longitude1");
            return (Criteria) this;
        }

        public Criteria andLongitude1NotBetween(Double value1, Double value2) {
            addCriterion("longitude1 not between", value1, value2, "longitude1");
            return (Criteria) this;
        }

        public Criteria andLatitude1IsNull() {
            addCriterion("latitude1 is null");
            return (Criteria) this;
        }

        public Criteria andLatitude1IsNotNull() {
            addCriterion("latitude1 is not null");
            return (Criteria) this;
        }

        public Criteria andLatitude1EqualTo(Double value) {
            addCriterion("latitude1 =", value, "latitude1");
            return (Criteria) this;
        }

        public Criteria andLatitude1NotEqualTo(Double value) {
            addCriterion("latitude1 <>", value, "latitude1");
            return (Criteria) this;
        }

        public Criteria andLatitude1GreaterThan(Double value) {
            addCriterion("latitude1 >", value, "latitude1");
            return (Criteria) this;
        }

        public Criteria andLatitude1GreaterThanOrEqualTo(Double value) {
            addCriterion("latitude1 >=", value, "latitude1");
            return (Criteria) this;
        }

        public Criteria andLatitude1LessThan(Double value) {
            addCriterion("latitude1 <", value, "latitude1");
            return (Criteria) this;
        }

        public Criteria andLatitude1LessThanOrEqualTo(Double value) {
            addCriterion("latitude1 <=", value, "latitude1");
            return (Criteria) this;
        }

        public Criteria andLatitude1In(List<Double> values) {
            addCriterion("latitude1 in", values, "latitude1");
            return (Criteria) this;
        }

        public Criteria andLatitude1NotIn(List<Double> values) {
            addCriterion("latitude1 not in", values, "latitude1");
            return (Criteria) this;
        }

        public Criteria andLatitude1Between(Double value1, Double value2) {
            addCriterion("latitude1 between", value1, value2, "latitude1");
            return (Criteria) this;
        }

        public Criteria andLatitude1NotBetween(Double value1, Double value2) {
            addCriterion("latitude1 not between", value1, value2, "latitude1");
            return (Criteria) this;
        }

        public Criteria andLongitude2IsNull() {
            addCriterion("longitude2 is null");
            return (Criteria) this;
        }

        public Criteria andLongitude2IsNotNull() {
            addCriterion("longitude2 is not null");
            return (Criteria) this;
        }

        public Criteria andLongitude2EqualTo(Double value) {
            addCriterion("longitude2 =", value, "longitude2");
            return (Criteria) this;
        }

        public Criteria andLongitude2NotEqualTo(Double value) {
            addCriterion("longitude2 <>", value, "longitude2");
            return (Criteria) this;
        }

        public Criteria andLongitude2GreaterThan(Double value) {
            addCriterion("longitude2 >", value, "longitude2");
            return (Criteria) this;
        }

        public Criteria andLongitude2GreaterThanOrEqualTo(Double value) {
            addCriterion("longitude2 >=", value, "longitude2");
            return (Criteria) this;
        }

        public Criteria andLongitude2LessThan(Double value) {
            addCriterion("longitude2 <", value, "longitude2");
            return (Criteria) this;
        }

        public Criteria andLongitude2LessThanOrEqualTo(Double value) {
            addCriterion("longitude2 <=", value, "longitude2");
            return (Criteria) this;
        }

        public Criteria andLongitude2In(List<Double> values) {
            addCriterion("longitude2 in", values, "longitude2");
            return (Criteria) this;
        }

        public Criteria andLongitude2NotIn(List<Double> values) {
            addCriterion("longitude2 not in", values, "longitude2");
            return (Criteria) this;
        }

        public Criteria andLongitude2Between(Double value1, Double value2) {
            addCriterion("longitude2 between", value1, value2, "longitude2");
            return (Criteria) this;
        }

        public Criteria andLongitude2NotBetween(Double value1, Double value2) {
            addCriterion("longitude2 not between", value1, value2, "longitude2");
            return (Criteria) this;
        }

        public Criteria andLatitude2IsNull() {
            addCriterion("latitude2 is null");
            return (Criteria) this;
        }

        public Criteria andLatitude2IsNotNull() {
            addCriterion("latitude2 is not null");
            return (Criteria) this;
        }

        public Criteria andLatitude2EqualTo(Double value) {
            addCriterion("latitude2 =", value, "latitude2");
            return (Criteria) this;
        }

        public Criteria andLatitude2NotEqualTo(Double value) {
            addCriterion("latitude2 <>", value, "latitude2");
            return (Criteria) this;
        }

        public Criteria andLatitude2GreaterThan(Double value) {
            addCriterion("latitude2 >", value, "latitude2");
            return (Criteria) this;
        }

        public Criteria andLatitude2GreaterThanOrEqualTo(Double value) {
            addCriterion("latitude2 >=", value, "latitude2");
            return (Criteria) this;
        }

        public Criteria andLatitude2LessThan(Double value) {
            addCriterion("latitude2 <", value, "latitude2");
            return (Criteria) this;
        }

        public Criteria andLatitude2LessThanOrEqualTo(Double value) {
            addCriterion("latitude2 <=", value, "latitude2");
            return (Criteria) this;
        }

        public Criteria andLatitude2In(List<Double> values) {
            addCriterion("latitude2 in", values, "latitude2");
            return (Criteria) this;
        }

        public Criteria andLatitude2NotIn(List<Double> values) {
            addCriterion("latitude2 not in", values, "latitude2");
            return (Criteria) this;
        }

        public Criteria andLatitude2Between(Double value1, Double value2) {
            addCriterion("latitude2 between", value1, value2, "latitude2");
            return (Criteria) this;
        }

        public Criteria andLatitude2NotBetween(Double value1, Double value2) {
            addCriterion("latitude2 not between", value1, value2, "latitude2");
            return (Criteria) this;
        }

        public Criteria andLongitude3IsNull() {
            addCriterion("longitude3 is null");
            return (Criteria) this;
        }

        public Criteria andLongitude3IsNotNull() {
            addCriterion("longitude3 is not null");
            return (Criteria) this;
        }

        public Criteria andLongitude3EqualTo(Double value) {
            addCriterion("longitude3 =", value, "longitude3");
            return (Criteria) this;
        }

        public Criteria andLongitude3NotEqualTo(Double value) {
            addCriterion("longitude3 <>", value, "longitude3");
            return (Criteria) this;
        }

        public Criteria andLongitude3GreaterThan(Double value) {
            addCriterion("longitude3 >", value, "longitude3");
            return (Criteria) this;
        }

        public Criteria andLongitude3GreaterThanOrEqualTo(Double value) {
            addCriterion("longitude3 >=", value, "longitude3");
            return (Criteria) this;
        }

        public Criteria andLongitude3LessThan(Double value) {
            addCriterion("longitude3 <", value, "longitude3");
            return (Criteria) this;
        }

        public Criteria andLongitude3LessThanOrEqualTo(Double value) {
            addCriterion("longitude3 <=", value, "longitude3");
            return (Criteria) this;
        }

        public Criteria andLongitude3In(List<Double> values) {
            addCriterion("longitude3 in", values, "longitude3");
            return (Criteria) this;
        }

        public Criteria andLongitude3NotIn(List<Double> values) {
            addCriterion("longitude3 not in", values, "longitude3");
            return (Criteria) this;
        }

        public Criteria andLongitude3Between(Double value1, Double value2) {
            addCriterion("longitude3 between", value1, value2, "longitude3");
            return (Criteria) this;
        }

        public Criteria andLongitude3NotBetween(Double value1, Double value2) {
            addCriterion("longitude3 not between", value1, value2, "longitude3");
            return (Criteria) this;
        }

        public Criteria andLatitude3IsNull() {
            addCriterion("latitude3 is null");
            return (Criteria) this;
        }

        public Criteria andLatitude3IsNotNull() {
            addCriterion("latitude3 is not null");
            return (Criteria) this;
        }

        public Criteria andLatitude3EqualTo(Double value) {
            addCriterion("latitude3 =", value, "latitude3");
            return (Criteria) this;
        }

        public Criteria andLatitude3NotEqualTo(Double value) {
            addCriterion("latitude3 <>", value, "latitude3");
            return (Criteria) this;
        }

        public Criteria andLatitude3GreaterThan(Double value) {
            addCriterion("latitude3 >", value, "latitude3");
            return (Criteria) this;
        }

        public Criteria andLatitude3GreaterThanOrEqualTo(Double value) {
            addCriterion("latitude3 >=", value, "latitude3");
            return (Criteria) this;
        }

        public Criteria andLatitude3LessThan(Double value) {
            addCriterion("latitude3 <", value, "latitude3");
            return (Criteria) this;
        }

        public Criteria andLatitude3LessThanOrEqualTo(Double value) {
            addCriterion("latitude3 <=", value, "latitude3");
            return (Criteria) this;
        }

        public Criteria andLatitude3In(List<Double> values) {
            addCriterion("latitude3 in", values, "latitude3");
            return (Criteria) this;
        }

        public Criteria andLatitude3NotIn(List<Double> values) {
            addCriterion("latitude3 not in", values, "latitude3");
            return (Criteria) this;
        }

        public Criteria andLatitude3Between(Double value1, Double value2) {
            addCriterion("latitude3 between", value1, value2, "latitude3");
            return (Criteria) this;
        }

        public Criteria andLatitude3NotBetween(Double value1, Double value2) {
            addCriterion("latitude3 not between", value1, value2, "latitude3");
            return (Criteria) this;
        }

        public Criteria andLongitude4IsNull() {
            addCriterion("longitude4 is null");
            return (Criteria) this;
        }

        public Criteria andLongitude4IsNotNull() {
            addCriterion("longitude4 is not null");
            return (Criteria) this;
        }

        public Criteria andLongitude4EqualTo(Double value) {
            addCriterion("longitude4 =", value, "longitude4");
            return (Criteria) this;
        }

        public Criteria andLongitude4NotEqualTo(Double value) {
            addCriterion("longitude4 <>", value, "longitude4");
            return (Criteria) this;
        }

        public Criteria andLongitude4GreaterThan(Double value) {
            addCriterion("longitude4 >", value, "longitude4");
            return (Criteria) this;
        }

        public Criteria andLongitude4GreaterThanOrEqualTo(Double value) {
            addCriterion("longitude4 >=", value, "longitude4");
            return (Criteria) this;
        }

        public Criteria andLongitude4LessThan(Double value) {
            addCriterion("longitude4 <", value, "longitude4");
            return (Criteria) this;
        }

        public Criteria andLongitude4LessThanOrEqualTo(Double value) {
            addCriterion("longitude4 <=", value, "longitude4");
            return (Criteria) this;
        }

        public Criteria andLongitude4In(List<Double> values) {
            addCriterion("longitude4 in", values, "longitude4");
            return (Criteria) this;
        }

        public Criteria andLongitude4NotIn(List<Double> values) {
            addCriterion("longitude4 not in", values, "longitude4");
            return (Criteria) this;
        }

        public Criteria andLongitude4Between(Double value1, Double value2) {
            addCriterion("longitude4 between", value1, value2, "longitude4");
            return (Criteria) this;
        }

        public Criteria andLongitude4NotBetween(Double value1, Double value2) {
            addCriterion("longitude4 not between", value1, value2, "longitude4");
            return (Criteria) this;
        }

        public Criteria andLatitude4IsNull() {
            addCriterion("latitude4 is null");
            return (Criteria) this;
        }

        public Criteria andLatitude4IsNotNull() {
            addCriterion("latitude4 is not null");
            return (Criteria) this;
        }

        public Criteria andLatitude4EqualTo(Double value) {
            addCriterion("latitude4 =", value, "latitude4");
            return (Criteria) this;
        }

        public Criteria andLatitude4NotEqualTo(Double value) {
            addCriterion("latitude4 <>", value, "latitude4");
            return (Criteria) this;
        }

        public Criteria andLatitude4GreaterThan(Double value) {
            addCriterion("latitude4 >", value, "latitude4");
            return (Criteria) this;
        }

        public Criteria andLatitude4GreaterThanOrEqualTo(Double value) {
            addCriterion("latitude4 >=", value, "latitude4");
            return (Criteria) this;
        }

        public Criteria andLatitude4LessThan(Double value) {
            addCriterion("latitude4 <", value, "latitude4");
            return (Criteria) this;
        }

        public Criteria andLatitude4LessThanOrEqualTo(Double value) {
            addCriterion("latitude4 <=", value, "latitude4");
            return (Criteria) this;
        }

        public Criteria andLatitude4In(List<Double> values) {
            addCriterion("latitude4 in", values, "latitude4");
            return (Criteria) this;
        }

        public Criteria andLatitude4NotIn(List<Double> values) {
            addCriterion("latitude4 not in", values, "latitude4");
            return (Criteria) this;
        }

        public Criteria andLatitude4Between(Double value1, Double value2) {
            addCriterion("latitude4 between", value1, value2, "latitude4");
            return (Criteria) this;
        }

        public Criteria andLatitude4NotBetween(Double value1, Double value2) {
            addCriterion("latitude4 not between", value1, value2, "latitude4");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIsNull() {
            addCriterion("material_type is null");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIsNotNull() {
            addCriterion("material_type is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeEqualTo(String value) {
            addCriterion("material_type =", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotEqualTo(String value) {
            addCriterion("material_type <>", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeGreaterThan(String value) {
            addCriterion("material_type >", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeGreaterThanOrEqualTo(String value) {
            addCriterion("material_type >=", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeLessThan(String value) {
            addCriterion("material_type <", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeLessThanOrEqualTo(String value) {
            addCriterion("material_type <=", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeLike(String value) {
            addCriterion("material_type like", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotLike(String value) {
            addCriterion("material_type not like", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIn(List<String> values) {
            addCriterion("material_type in", values, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotIn(List<String> values) {
            addCriterion("material_type not in", values, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeBetween(String value1, String value2) {
            addCriterion("material_type between", value1, value2, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotBetween(String value1, String value2) {
            addCriterion("material_type not between", value1, value2, "materialType");
            return (Criteria) this;
        }

        public Criteria andWindSpeedIsNull() {
            addCriterion("wind_speed is null");
            return (Criteria) this;
        }

        public Criteria andWindSpeedIsNotNull() {
            addCriterion("wind_speed is not null");
            return (Criteria) this;
        }

        public Criteria andWindSpeedEqualTo(Double value) {
            addCriterion("wind_speed =", value, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedNotEqualTo(Double value) {
            addCriterion("wind_speed <>", value, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedGreaterThan(Double value) {
            addCriterion("wind_speed >", value, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedGreaterThanOrEqualTo(Double value) {
            addCriterion("wind_speed >=", value, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedLessThan(Double value) {
            addCriterion("wind_speed <", value, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedLessThanOrEqualTo(Double value) {
            addCriterion("wind_speed <=", value, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedIn(List<Double> values) {
            addCriterion("wind_speed in", values, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedNotIn(List<Double> values) {
            addCriterion("wind_speed not in", values, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedBetween(Double value1, Double value2) {
            addCriterion("wind_speed between", value1, value2, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedNotBetween(Double value1, Double value2) {
            addCriterion("wind_speed not between", value1, value2, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andMaterialCapacityIsNull() {
            addCriterion("material_capacity is null");
            return (Criteria) this;
        }

        public Criteria andMaterialCapacityIsNotNull() {
            addCriterion("material_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialCapacityEqualTo(Double value) {
            addCriterion("material_capacity =", value, "materialCapacity");
            return (Criteria) this;
        }

        public Criteria andMaterialCapacityNotEqualTo(Double value) {
            addCriterion("material_capacity <>", value, "materialCapacity");
            return (Criteria) this;
        }

        public Criteria andMaterialCapacityGreaterThan(Double value) {
            addCriterion("material_capacity >", value, "materialCapacity");
            return (Criteria) this;
        }

        public Criteria andMaterialCapacityGreaterThanOrEqualTo(Double value) {
            addCriterion("material_capacity >=", value, "materialCapacity");
            return (Criteria) this;
        }

        public Criteria andMaterialCapacityLessThan(Double value) {
            addCriterion("material_capacity <", value, "materialCapacity");
            return (Criteria) this;
        }

        public Criteria andMaterialCapacityLessThanOrEqualTo(Double value) {
            addCriterion("material_capacity <=", value, "materialCapacity");
            return (Criteria) this;
        }

        public Criteria andMaterialCapacityIn(List<Double> values) {
            addCriterion("material_capacity in", values, "materialCapacity");
            return (Criteria) this;
        }

        public Criteria andMaterialCapacityNotIn(List<Double> values) {
            addCriterion("material_capacity not in", values, "materialCapacity");
            return (Criteria) this;
        }

        public Criteria andMaterialCapacityBetween(Double value1, Double value2) {
            addCriterion("material_capacity between", value1, value2, "materialCapacity");
            return (Criteria) this;
        }

        public Criteria andMaterialCapacityNotBetween(Double value1, Double value2) {
            addCriterion("material_capacity not between", value1, value2, "materialCapacity");
            return (Criteria) this;
        }

        public Criteria andLoadingCountIsNull() {
            addCriterion("loading_count is null");
            return (Criteria) this;
        }

        public Criteria andLoadingCountIsNotNull() {
            addCriterion("loading_count is not null");
            return (Criteria) this;
        }

        public Criteria andLoadingCountEqualTo(Double value) {
            addCriterion("loading_count =", value, "loadingCount");
            return (Criteria) this;
        }

        public Criteria andLoadingCountNotEqualTo(Double value) {
            addCriterion("loading_count <>", value, "loadingCount");
            return (Criteria) this;
        }

        public Criteria andLoadingCountGreaterThan(Double value) {
            addCriterion("loading_count >", value, "loadingCount");
            return (Criteria) this;
        }

        public Criteria andLoadingCountGreaterThanOrEqualTo(Double value) {
            addCriterion("loading_count >=", value, "loadingCount");
            return (Criteria) this;
        }

        public Criteria andLoadingCountLessThan(Double value) {
            addCriterion("loading_count <", value, "loadingCount");
            return (Criteria) this;
        }

        public Criteria andLoadingCountLessThanOrEqualTo(Double value) {
            addCriterion("loading_count <=", value, "loadingCount");
            return (Criteria) this;
        }

        public Criteria andLoadingCountIn(List<Double> values) {
            addCriterion("loading_count in", values, "loadingCount");
            return (Criteria) this;
        }

        public Criteria andLoadingCountNotIn(List<Double> values) {
            addCriterion("loading_count not in", values, "loadingCount");
            return (Criteria) this;
        }

        public Criteria andLoadingCountBetween(Double value1, Double value2) {
            addCriterion("loading_count between", value1, value2, "loadingCount");
            return (Criteria) this;
        }

        public Criteria andLoadingCountNotBetween(Double value1, Double value2) {
            addCriterion("loading_count not between", value1, value2, "loadingCount");
            return (Criteria) this;
        }

        public Criteria andLoadingStartIsNull() {
            addCriterion("loading_start is null");
            return (Criteria) this;
        }

        public Criteria andLoadingStartIsNotNull() {
            addCriterion("loading_start is not null");
            return (Criteria) this;
        }

        public Criteria andLoadingStartEqualTo(Date value) {
            addCriterionForJDBCTime("loading_start =", value, "loadingStart");
            return (Criteria) this;
        }

        public Criteria andLoadingStartNotEqualTo(Date value) {
            addCriterionForJDBCTime("loading_start <>", value, "loadingStart");
            return (Criteria) this;
        }

        public Criteria andLoadingStartGreaterThan(Date value) {
            addCriterionForJDBCTime("loading_start >", value, "loadingStart");
            return (Criteria) this;
        }

        public Criteria andLoadingStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("loading_start >=", value, "loadingStart");
            return (Criteria) this;
        }

        public Criteria andLoadingStartLessThan(Date value) {
            addCriterionForJDBCTime("loading_start <", value, "loadingStart");
            return (Criteria) this;
        }

        public Criteria andLoadingStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("loading_start <=", value, "loadingStart");
            return (Criteria) this;
        }

        public Criteria andLoadingStartIn(List<Date> values) {
            addCriterionForJDBCTime("loading_start in", values, "loadingStart");
            return (Criteria) this;
        }

        public Criteria andLoadingStartNotIn(List<Date> values) {
            addCriterionForJDBCTime("loading_start not in", values, "loadingStart");
            return (Criteria) this;
        }

        public Criteria andLoadingStartBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("loading_start between", value1, value2, "loadingStart");
            return (Criteria) this;
        }

        public Criteria andLoadingStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("loading_start not between", value1, value2, "loadingStart");
            return (Criteria) this;
        }

        public Criteria andLoadingTimeIsNull() {
            addCriterion("loading_time is null");
            return (Criteria) this;
        }

        public Criteria andLoadingTimeIsNotNull() {
            addCriterion("loading_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoadingTimeEqualTo(Date value) {
            addCriterionForJDBCTime("loading_time =", value, "loadingTime");
            return (Criteria) this;
        }

        public Criteria andLoadingTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("loading_time <>", value, "loadingTime");
            return (Criteria) this;
        }

        public Criteria andLoadingTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("loading_time >", value, "loadingTime");
            return (Criteria) this;
        }

        public Criteria andLoadingTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("loading_time >=", value, "loadingTime");
            return (Criteria) this;
        }

        public Criteria andLoadingTimeLessThan(Date value) {
            addCriterionForJDBCTime("loading_time <", value, "loadingTime");
            return (Criteria) this;
        }

        public Criteria andLoadingTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("loading_time <=", value, "loadingTime");
            return (Criteria) this;
        }

        public Criteria andLoadingTimeIn(List<Date> values) {
            addCriterionForJDBCTime("loading_time in", values, "loadingTime");
            return (Criteria) this;
        }

        public Criteria andLoadingTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("loading_time not in", values, "loadingTime");
            return (Criteria) this;
        }

        public Criteria andLoadingTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("loading_time between", value1, value2, "loadingTime");
            return (Criteria) this;
        }

        public Criteria andLoadingTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("loading_time not between", value1, value2, "loadingTime");
            return (Criteria) this;
        }

        public Criteria andLoadingCapacityIsNull() {
            addCriterion("loading_capacity is null");
            return (Criteria) this;
        }

        public Criteria andLoadingCapacityIsNotNull() {
            addCriterion("loading_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andLoadingCapacityEqualTo(Double value) {
            addCriterion("loading_capacity =", value, "loadingCapacity");
            return (Criteria) this;
        }

        public Criteria andLoadingCapacityNotEqualTo(Double value) {
            addCriterion("loading_capacity <>", value, "loadingCapacity");
            return (Criteria) this;
        }

        public Criteria andLoadingCapacityGreaterThan(Double value) {
            addCriterion("loading_capacity >", value, "loadingCapacity");
            return (Criteria) this;
        }

        public Criteria andLoadingCapacityGreaterThanOrEqualTo(Double value) {
            addCriterion("loading_capacity >=", value, "loadingCapacity");
            return (Criteria) this;
        }

        public Criteria andLoadingCapacityLessThan(Double value) {
            addCriterion("loading_capacity <", value, "loadingCapacity");
            return (Criteria) this;
        }

        public Criteria andLoadingCapacityLessThanOrEqualTo(Double value) {
            addCriterion("loading_capacity <=", value, "loadingCapacity");
            return (Criteria) this;
        }

        public Criteria andLoadingCapacityIn(List<Double> values) {
            addCriterion("loading_capacity in", values, "loadingCapacity");
            return (Criteria) this;
        }

        public Criteria andLoadingCapacityNotIn(List<Double> values) {
            addCriterion("loading_capacity not in", values, "loadingCapacity");
            return (Criteria) this;
        }

        public Criteria andLoadingCapacityBetween(Double value1, Double value2) {
            addCriterion("loading_capacity between", value1, value2, "loadingCapacity");
            return (Criteria) this;
        }

        public Criteria andLoadingCapacityNotBetween(Double value1, Double value2) {
            addCriterion("loading_capacity not between", value1, value2, "loadingCapacity");
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

        public Criteria andMoistureMateriaIsNull() {
            addCriterion("moisture_materia is null");
            return (Criteria) this;
        }

        public Criteria andMoistureMateriaIsNotNull() {
            addCriterion("moisture_materia is not null");
            return (Criteria) this;
        }

        public Criteria andMoistureMateriaEqualTo(Double value) {
            addCriterion("moisture_materia =", value, "moistureMateria");
            return (Criteria) this;
        }

        public Criteria andMoistureMateriaNotEqualTo(Double value) {
            addCriterion("moisture_materia <>", value, "moistureMateria");
            return (Criteria) this;
        }

        public Criteria andMoistureMateriaGreaterThan(Double value) {
            addCriterion("moisture_materia >", value, "moistureMateria");
            return (Criteria) this;
        }

        public Criteria andMoistureMateriaGreaterThanOrEqualTo(Double value) {
            addCriterion("moisture_materia >=", value, "moistureMateria");
            return (Criteria) this;
        }

        public Criteria andMoistureMateriaLessThan(Double value) {
            addCriterion("moisture_materia <", value, "moistureMateria");
            return (Criteria) this;
        }

        public Criteria andMoistureMateriaLessThanOrEqualTo(Double value) {
            addCriterion("moisture_materia <=", value, "moistureMateria");
            return (Criteria) this;
        }

        public Criteria andMoistureMateriaIn(List<Double> values) {
            addCriterion("moisture_materia in", values, "moistureMateria");
            return (Criteria) this;
        }

        public Criteria andMoistureMateriaNotIn(List<Double> values) {
            addCriterion("moisture_materia not in", values, "moistureMateria");
            return (Criteria) this;
        }

        public Criteria andMoistureMateriaBetween(Double value1, Double value2) {
            addCriterion("moisture_materia between", value1, value2, "moistureMateria");
            return (Criteria) this;
        }

        public Criteria andMoistureMateriaNotBetween(Double value1, Double value2) {
            addCriterion("moisture_materia not between", value1, value2, "moistureMateria");
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

        public Criteria andHeapAreaIsNull() {
            addCriterion("heap_area is null");
            return (Criteria) this;
        }

        public Criteria andHeapAreaIsNotNull() {
            addCriterion("heap_area is not null");
            return (Criteria) this;
        }

        public Criteria andHeapAreaEqualTo(Double value) {
            addCriterion("heap_area =", value, "heapArea");
            return (Criteria) this;
        }

        public Criteria andHeapAreaNotEqualTo(Double value) {
            addCriterion("heap_area <>", value, "heapArea");
            return (Criteria) this;
        }

        public Criteria andHeapAreaGreaterThan(Double value) {
            addCriterion("heap_area >", value, "heapArea");
            return (Criteria) this;
        }

        public Criteria andHeapAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("heap_area >=", value, "heapArea");
            return (Criteria) this;
        }

        public Criteria andHeapAreaLessThan(Double value) {
            addCriterion("heap_area <", value, "heapArea");
            return (Criteria) this;
        }

        public Criteria andHeapAreaLessThanOrEqualTo(Double value) {
            addCriterion("heap_area <=", value, "heapArea");
            return (Criteria) this;
        }

        public Criteria andHeapAreaIn(List<Double> values) {
            addCriterion("heap_area in", values, "heapArea");
            return (Criteria) this;
        }

        public Criteria andHeapAreaNotIn(List<Double> values) {
            addCriterion("heap_area not in", values, "heapArea");
            return (Criteria) this;
        }

        public Criteria andHeapAreaBetween(Double value1, Double value2) {
            addCriterion("heap_area between", value1, value2, "heapArea");
            return (Criteria) this;
        }

        public Criteria andHeapAreaNotBetween(Double value1, Double value2) {
            addCriterion("heap_area not between", value1, value2, "heapArea");
            return (Criteria) this;
        }

        public Criteria andHeapCoveredIsNull() {
            addCriterion("heap_covered is null");
            return (Criteria) this;
        }

        public Criteria andHeapCoveredIsNotNull() {
            addCriterion("heap_covered is not null");
            return (Criteria) this;
        }

        public Criteria andHeapCoveredEqualTo(Double value) {
            addCriterion("heap_covered =", value, "heapCovered");
            return (Criteria) this;
        }

        public Criteria andHeapCoveredNotEqualTo(Double value) {
            addCriterion("heap_covered <>", value, "heapCovered");
            return (Criteria) this;
        }

        public Criteria andHeapCoveredGreaterThan(Double value) {
            addCriterion("heap_covered >", value, "heapCovered");
            return (Criteria) this;
        }

        public Criteria andHeapCoveredGreaterThanOrEqualTo(Double value) {
            addCriterion("heap_covered >=", value, "heapCovered");
            return (Criteria) this;
        }

        public Criteria andHeapCoveredLessThan(Double value) {
            addCriterion("heap_covered <", value, "heapCovered");
            return (Criteria) this;
        }

        public Criteria andHeapCoveredLessThanOrEqualTo(Double value) {
            addCriterion("heap_covered <=", value, "heapCovered");
            return (Criteria) this;
        }

        public Criteria andHeapCoveredIn(List<Double> values) {
            addCriterion("heap_covered in", values, "heapCovered");
            return (Criteria) this;
        }

        public Criteria andHeapCoveredNotIn(List<Double> values) {
            addCriterion("heap_covered not in", values, "heapCovered");
            return (Criteria) this;
        }

        public Criteria andHeapCoveredBetween(Double value1, Double value2) {
            addCriterion("heap_covered between", value1, value2, "heapCovered");
            return (Criteria) this;
        }

        public Criteria andHeapCoveredNotBetween(Double value1, Double value2) {
            addCriterion("heap_covered not between", value1, value2, "heapCovered");
            return (Criteria) this;
        }

        public Criteria andHeapHeighIsNull() {
            addCriterion("heap_heigh is null");
            return (Criteria) this;
        }

        public Criteria andHeapHeighIsNotNull() {
            addCriterion("heap_heigh is not null");
            return (Criteria) this;
        }

        public Criteria andHeapHeighEqualTo(Double value) {
            addCriterion("heap_heigh =", value, "heapHeigh");
            return (Criteria) this;
        }

        public Criteria andHeapHeighNotEqualTo(Double value) {
            addCriterion("heap_heigh <>", value, "heapHeigh");
            return (Criteria) this;
        }

        public Criteria andHeapHeighGreaterThan(Double value) {
            addCriterion("heap_heigh >", value, "heapHeigh");
            return (Criteria) this;
        }

        public Criteria andHeapHeighGreaterThanOrEqualTo(Double value) {
            addCriterion("heap_heigh >=", value, "heapHeigh");
            return (Criteria) this;
        }

        public Criteria andHeapHeighLessThan(Double value) {
            addCriterion("heap_heigh <", value, "heapHeigh");
            return (Criteria) this;
        }

        public Criteria andHeapHeighLessThanOrEqualTo(Double value) {
            addCriterion("heap_heigh <=", value, "heapHeigh");
            return (Criteria) this;
        }

        public Criteria andHeapHeighIn(List<Double> values) {
            addCriterion("heap_heigh in", values, "heapHeigh");
            return (Criteria) this;
        }

        public Criteria andHeapHeighNotIn(List<Double> values) {
            addCriterion("heap_heigh not in", values, "heapHeigh");
            return (Criteria) this;
        }

        public Criteria andHeapHeighBetween(Double value1, Double value2) {
            addCriterion("heap_heigh between", value1, value2, "heapHeigh");
            return (Criteria) this;
        }

        public Criteria andHeapHeighNotBetween(Double value1, Double value2) {
            addCriterion("heap_heigh not between", value1, value2, "heapHeigh");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andControlMeasures1IsNull() {
            addCriterion("control_measures1 is null");
            return (Criteria) this;
        }

        public Criteria andControlMeasures1IsNotNull() {
            addCriterion("control_measures1 is not null");
            return (Criteria) this;
        }

        public Criteria andControlMeasures1EqualTo(String value) {
            addCriterion("control_measures1 =", value, "controlMeasures1");
            return (Criteria) this;
        }

        public Criteria andControlMeasures1NotEqualTo(String value) {
            addCriterion("control_measures1 <>", value, "controlMeasures1");
            return (Criteria) this;
        }

        public Criteria andControlMeasures1GreaterThan(String value) {
            addCriterion("control_measures1 >", value, "controlMeasures1");
            return (Criteria) this;
        }

        public Criteria andControlMeasures1GreaterThanOrEqualTo(String value) {
            addCriterion("control_measures1 >=", value, "controlMeasures1");
            return (Criteria) this;
        }

        public Criteria andControlMeasures1LessThan(String value) {
            addCriterion("control_measures1 <", value, "controlMeasures1");
            return (Criteria) this;
        }

        public Criteria andControlMeasures1LessThanOrEqualTo(String value) {
            addCriterion("control_measures1 <=", value, "controlMeasures1");
            return (Criteria) this;
        }

        public Criteria andControlMeasures1Like(String value) {
            addCriterion("control_measures1 like", value, "controlMeasures1");
            return (Criteria) this;
        }

        public Criteria andControlMeasures1NotLike(String value) {
            addCriterion("control_measures1 not like", value, "controlMeasures1");
            return (Criteria) this;
        }

        public Criteria andControlMeasures1In(List<String> values) {
            addCriterion("control_measures1 in", values, "controlMeasures1");
            return (Criteria) this;
        }

        public Criteria andControlMeasures1NotIn(List<String> values) {
            addCriterion("control_measures1 not in", values, "controlMeasures1");
            return (Criteria) this;
        }

        public Criteria andControlMeasures1Between(String value1, String value2) {
            addCriterion("control_measures1 between", value1, value2, "controlMeasures1");
            return (Criteria) this;
        }

        public Criteria andControlMeasures1NotBetween(String value1, String value2) {
            addCriterion("control_measures1 not between", value1, value2, "controlMeasures1");
            return (Criteria) this;
        }

        public Criteria andMaterialType1IsNull() {
            addCriterion("material_type1 is null");
            return (Criteria) this;
        }

        public Criteria andMaterialType1IsNotNull() {
            addCriterion("material_type1 is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialType1EqualTo(String value) {
            addCriterion("material_type1 =", value, "materialType1");
            return (Criteria) this;
        }

        public Criteria andMaterialType1NotEqualTo(String value) {
            addCriterion("material_type1 <>", value, "materialType1");
            return (Criteria) this;
        }

        public Criteria andMaterialType1GreaterThan(String value) {
            addCriterion("material_type1 >", value, "materialType1");
            return (Criteria) this;
        }

        public Criteria andMaterialType1GreaterThanOrEqualTo(String value) {
            addCriterion("material_type1 >=", value, "materialType1");
            return (Criteria) this;
        }

        public Criteria andMaterialType1LessThan(String value) {
            addCriterion("material_type1 <", value, "materialType1");
            return (Criteria) this;
        }

        public Criteria andMaterialType1LessThanOrEqualTo(String value) {
            addCriterion("material_type1 <=", value, "materialType1");
            return (Criteria) this;
        }

        public Criteria andMaterialType1Like(String value) {
            addCriterion("material_type1 like", value, "materialType1");
            return (Criteria) this;
        }

        public Criteria andMaterialType1NotLike(String value) {
            addCriterion("material_type1 not like", value, "materialType1");
            return (Criteria) this;
        }

        public Criteria andMaterialType1In(List<String> values) {
            addCriterion("material_type1 in", values, "materialType1");
            return (Criteria) this;
        }

        public Criteria andMaterialType1NotIn(List<String> values) {
            addCriterion("material_type1 not in", values, "materialType1");
            return (Criteria) this;
        }

        public Criteria andMaterialType1Between(String value1, String value2) {
            addCriterion("material_type1 between", value1, value2, "materialType1");
            return (Criteria) this;
        }

        public Criteria andMaterialType1NotBetween(String value1, String value2) {
            addCriterion("material_type1 not between", value1, value2, "materialType1");
            return (Criteria) this;
        }

        public Criteria andPm10Emission1IsNull() {
            addCriterion("pm10_emission1 is null");
            return (Criteria) this;
        }

        public Criteria andPm10Emission1IsNotNull() {
            addCriterion("pm10_emission1 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10Emission1EqualTo(Double value) {
            addCriterion("pm10_emission1 =", value, "pm10Emission1");
            return (Criteria) this;
        }

        public Criteria andPm10Emission1NotEqualTo(Double value) {
            addCriterion("pm10_emission1 <>", value, "pm10Emission1");
            return (Criteria) this;
        }

        public Criteria andPm10Emission1GreaterThan(Double value) {
            addCriterion("pm10_emission1 >", value, "pm10Emission1");
            return (Criteria) this;
        }

        public Criteria andPm10Emission1GreaterThanOrEqualTo(Double value) {
            addCriterion("pm10_emission1 >=", value, "pm10Emission1");
            return (Criteria) this;
        }

        public Criteria andPm10Emission1LessThan(Double value) {
            addCriterion("pm10_emission1 <", value, "pm10Emission1");
            return (Criteria) this;
        }

        public Criteria andPm10Emission1LessThanOrEqualTo(Double value) {
            addCriterion("pm10_emission1 <=", value, "pm10Emission1");
            return (Criteria) this;
        }

        public Criteria andPm10Emission1In(List<Double> values) {
            addCriterion("pm10_emission1 in", values, "pm10Emission1");
            return (Criteria) this;
        }

        public Criteria andPm10Emission1NotIn(List<Double> values) {
            addCriterion("pm10_emission1 not in", values, "pm10Emission1");
            return (Criteria) this;
        }

        public Criteria andPm10Emission1Between(Double value1, Double value2) {
            addCriterion("pm10_emission1 between", value1, value2, "pm10Emission1");
            return (Criteria) this;
        }

        public Criteria andPm10Emission1NotBetween(Double value1, Double value2) {
            addCriterion("pm10_emission1 not between", value1, value2, "pm10Emission1");
            return (Criteria) this;
        }

        public Criteria andPm25Emission1IsNull() {
            addCriterion("pm25_emission1 is null");
            return (Criteria) this;
        }

        public Criteria andPm25Emission1IsNotNull() {
            addCriterion("pm25_emission1 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25Emission1EqualTo(Double value) {
            addCriterion("pm25_emission1 =", value, "pm25Emission1");
            return (Criteria) this;
        }

        public Criteria andPm25Emission1NotEqualTo(Double value) {
            addCriterion("pm25_emission1 <>", value, "pm25Emission1");
            return (Criteria) this;
        }

        public Criteria andPm25Emission1GreaterThan(Double value) {
            addCriterion("pm25_emission1 >", value, "pm25Emission1");
            return (Criteria) this;
        }

        public Criteria andPm25Emission1GreaterThanOrEqualTo(Double value) {
            addCriterion("pm25_emission1 >=", value, "pm25Emission1");
            return (Criteria) this;
        }

        public Criteria andPm25Emission1LessThan(Double value) {
            addCriterion("pm25_emission1 <", value, "pm25Emission1");
            return (Criteria) this;
        }

        public Criteria andPm25Emission1LessThanOrEqualTo(Double value) {
            addCriterion("pm25_emission1 <=", value, "pm25Emission1");
            return (Criteria) this;
        }

        public Criteria andPm25Emission1In(List<Double> values) {
            addCriterion("pm25_emission1 in", values, "pm25Emission1");
            return (Criteria) this;
        }

        public Criteria andPm25Emission1NotIn(List<Double> values) {
            addCriterion("pm25_emission1 not in", values, "pm25Emission1");
            return (Criteria) this;
        }

        public Criteria andPm25Emission1Between(Double value1, Double value2) {
            addCriterion("pm25_emission1 between", value1, value2, "pm25Emission1");
            return (Criteria) this;
        }

        public Criteria andPm25Emission1NotBetween(Double value1, Double value2) {
            addCriterion("pm25_emission1 not between", value1, value2, "pm25Emission1");
            return (Criteria) this;
        }

        public Criteria andOcEmission1IsNull() {
            addCriterion("oc_emission1 is null");
            return (Criteria) this;
        }

        public Criteria andOcEmission1IsNotNull() {
            addCriterion("oc_emission1 is not null");
            return (Criteria) this;
        }

        public Criteria andOcEmission1EqualTo(Double value) {
            addCriterion("oc_emission1 =", value, "ocEmission1");
            return (Criteria) this;
        }

        public Criteria andOcEmission1NotEqualTo(Double value) {
            addCriterion("oc_emission1 <>", value, "ocEmission1");
            return (Criteria) this;
        }

        public Criteria andOcEmission1GreaterThan(Double value) {
            addCriterion("oc_emission1 >", value, "ocEmission1");
            return (Criteria) this;
        }

        public Criteria andOcEmission1GreaterThanOrEqualTo(Double value) {
            addCriterion("oc_emission1 >=", value, "ocEmission1");
            return (Criteria) this;
        }

        public Criteria andOcEmission1LessThan(Double value) {
            addCriterion("oc_emission1 <", value, "ocEmission1");
            return (Criteria) this;
        }

        public Criteria andOcEmission1LessThanOrEqualTo(Double value) {
            addCriterion("oc_emission1 <=", value, "ocEmission1");
            return (Criteria) this;
        }

        public Criteria andOcEmission1In(List<Double> values) {
            addCriterion("oc_emission1 in", values, "ocEmission1");
            return (Criteria) this;
        }

        public Criteria andOcEmission1NotIn(List<Double> values) {
            addCriterion("oc_emission1 not in", values, "ocEmission1");
            return (Criteria) this;
        }

        public Criteria andOcEmission1Between(Double value1, Double value2) {
            addCriterion("oc_emission1 between", value1, value2, "ocEmission1");
            return (Criteria) this;
        }

        public Criteria andOcEmission1NotBetween(Double value1, Double value2) {
            addCriterion("oc_emission1 not between", value1, value2, "ocEmission1");
            return (Criteria) this;
        }

        public Criteria andBcEmission1IsNull() {
            addCriterion("bc_emission1 is null");
            return (Criteria) this;
        }

        public Criteria andBcEmission1IsNotNull() {
            addCriterion("bc_emission1 is not null");
            return (Criteria) this;
        }

        public Criteria andBcEmission1EqualTo(Double value) {
            addCriterion("bc_emission1 =", value, "bcEmission1");
            return (Criteria) this;
        }

        public Criteria andBcEmission1NotEqualTo(Double value) {
            addCriterion("bc_emission1 <>", value, "bcEmission1");
            return (Criteria) this;
        }

        public Criteria andBcEmission1GreaterThan(Double value) {
            addCriterion("bc_emission1 >", value, "bcEmission1");
            return (Criteria) this;
        }

        public Criteria andBcEmission1GreaterThanOrEqualTo(Double value) {
            addCriterion("bc_emission1 >=", value, "bcEmission1");
            return (Criteria) this;
        }

        public Criteria andBcEmission1LessThan(Double value) {
            addCriterion("bc_emission1 <", value, "bcEmission1");
            return (Criteria) this;
        }

        public Criteria andBcEmission1LessThanOrEqualTo(Double value) {
            addCriterion("bc_emission1 <=", value, "bcEmission1");
            return (Criteria) this;
        }

        public Criteria andBcEmission1In(List<Double> values) {
            addCriterion("bc_emission1 in", values, "bcEmission1");
            return (Criteria) this;
        }

        public Criteria andBcEmission1NotIn(List<Double> values) {
            addCriterion("bc_emission1 not in", values, "bcEmission1");
            return (Criteria) this;
        }

        public Criteria andBcEmission1Between(Double value1, Double value2) {
            addCriterion("bc_emission1 between", value1, value2, "bcEmission1");
            return (Criteria) this;
        }

        public Criteria andBcEmission1NotBetween(Double value1, Double value2) {
            addCriterion("bc_emission1 not between", value1, value2, "bcEmission1");
            return (Criteria) this;
        }

        public Criteria andScccode1IsNull() {
            addCriterion("scccode1 is null");
            return (Criteria) this;
        }

        public Criteria andScccode1IsNotNull() {
            addCriterion("scccode1 is not null");
            return (Criteria) this;
        }

        public Criteria andScccode1EqualTo(String value) {
            addCriterion("scccode1 =", value, "scccode1");
            return (Criteria) this;
        }

        public Criteria andScccode1NotEqualTo(String value) {
            addCriterion("scccode1 <>", value, "scccode1");
            return (Criteria) this;
        }

        public Criteria andScccode1GreaterThan(String value) {
            addCriterion("scccode1 >", value, "scccode1");
            return (Criteria) this;
        }

        public Criteria andScccode1GreaterThanOrEqualTo(String value) {
            addCriterion("scccode1 >=", value, "scccode1");
            return (Criteria) this;
        }

        public Criteria andScccode1LessThan(String value) {
            addCriterion("scccode1 <", value, "scccode1");
            return (Criteria) this;
        }

        public Criteria andScccode1LessThanOrEqualTo(String value) {
            addCriterion("scccode1 <=", value, "scccode1");
            return (Criteria) this;
        }

        public Criteria andScccode1Like(String value) {
            addCriterion("scccode1 like", value, "scccode1");
            return (Criteria) this;
        }

        public Criteria andScccode1NotLike(String value) {
            addCriterion("scccode1 not like", value, "scccode1");
            return (Criteria) this;
        }

        public Criteria andScccode1In(List<String> values) {
            addCriterion("scccode1 in", values, "scccode1");
            return (Criteria) this;
        }

        public Criteria andScccode1NotIn(List<String> values) {
            addCriterion("scccode1 not in", values, "scccode1");
            return (Criteria) this;
        }

        public Criteria andScccode1Between(String value1, String value2) {
            addCriterion("scccode1 between", value1, value2, "scccode1");
            return (Criteria) this;
        }

        public Criteria andScccode1NotBetween(String value1, String value2) {
            addCriterion("scccode1 not between", value1, value2, "scccode1");
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