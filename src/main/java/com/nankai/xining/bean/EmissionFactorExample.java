package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class EmissionFactorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmissionFactorExample() {
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

        public Criteria andFactorsIdIsNull() {
            addCriterion("FACTORS_ID is null");
            return (Criteria) this;
        }

        public Criteria andFactorsIdIsNotNull() {
            addCriterion("FACTORS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFactorsIdEqualTo(String value) {
            addCriterion("FACTORS_ID =", value, "factorsId");
            return (Criteria) this;
        }

        public Criteria andFactorsIdNotEqualTo(String value) {
            addCriterion("FACTORS_ID <>", value, "factorsId");
            return (Criteria) this;
        }

        public Criteria andFactorsIdGreaterThan(String value) {
            addCriterion("FACTORS_ID >", value, "factorsId");
            return (Criteria) this;
        }

        public Criteria andFactorsIdGreaterThanOrEqualTo(String value) {
            addCriterion("FACTORS_ID >=", value, "factorsId");
            return (Criteria) this;
        }

        public Criteria andFactorsIdLessThan(String value) {
            addCriterion("FACTORS_ID <", value, "factorsId");
            return (Criteria) this;
        }

        public Criteria andFactorsIdLessThanOrEqualTo(String value) {
            addCriterion("FACTORS_ID <=", value, "factorsId");
            return (Criteria) this;
        }

        public Criteria andFactorsIdLike(String value) {
            addCriterion("FACTORS_ID like", value, "factorsId");
            return (Criteria) this;
        }

        public Criteria andFactorsIdNotLike(String value) {
            addCriterion("FACTORS_ID not like", value, "factorsId");
            return (Criteria) this;
        }

        public Criteria andFactorsIdIn(List<String> values) {
            addCriterion("FACTORS_ID in", values, "factorsId");
            return (Criteria) this;
        }

        public Criteria andFactorsIdNotIn(List<String> values) {
            addCriterion("FACTORS_ID not in", values, "factorsId");
            return (Criteria) this;
        }

        public Criteria andFactorsIdBetween(String value1, String value2) {
            addCriterion("FACTORS_ID between", value1, value2, "factorsId");
            return (Criteria) this;
        }

        public Criteria andFactorsIdNotBetween(String value1, String value2) {
            addCriterion("FACTORS_ID not between", value1, value2, "factorsId");
            return (Criteria) this;
        }

        public Criteria andFactorsQuantityIsNull() {
            addCriterion("FACTORS_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andFactorsQuantityIsNotNull() {
            addCriterion("FACTORS_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andFactorsQuantityEqualTo(Integer value) {
            addCriterion("FACTORS_QUANTITY =", value, "factorsQuantity");
            return (Criteria) this;
        }

        public Criteria andFactorsQuantityNotEqualTo(Integer value) {
            addCriterion("FACTORS_QUANTITY <>", value, "factorsQuantity");
            return (Criteria) this;
        }

        public Criteria andFactorsQuantityGreaterThan(Integer value) {
            addCriterion("FACTORS_QUANTITY >", value, "factorsQuantity");
            return (Criteria) this;
        }

        public Criteria andFactorsQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("FACTORS_QUANTITY >=", value, "factorsQuantity");
            return (Criteria) this;
        }

        public Criteria andFactorsQuantityLessThan(Integer value) {
            addCriterion("FACTORS_QUANTITY <", value, "factorsQuantity");
            return (Criteria) this;
        }

        public Criteria andFactorsQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("FACTORS_QUANTITY <=", value, "factorsQuantity");
            return (Criteria) this;
        }

        public Criteria andFactorsQuantityIn(List<Integer> values) {
            addCriterion("FACTORS_QUANTITY in", values, "factorsQuantity");
            return (Criteria) this;
        }

        public Criteria andFactorsQuantityNotIn(List<Integer> values) {
            addCriterion("FACTORS_QUANTITY not in", values, "factorsQuantity");
            return (Criteria) this;
        }

        public Criteria andFactorsQuantityBetween(Integer value1, Integer value2) {
            addCriterion("FACTORS_QUANTITY between", value1, value2, "factorsQuantity");
            return (Criteria) this;
        }

        public Criteria andFactorsQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("FACTORS_QUANTITY not between", value1, value2, "factorsQuantity");
            return (Criteria) this;
        }

        public Criteria andFactorsDiscritionsIsNull() {
            addCriterion("FACTORS_DISCRITIONS is null");
            return (Criteria) this;
        }

        public Criteria andFactorsDiscritionsIsNotNull() {
            addCriterion("FACTORS_DISCRITIONS is not null");
            return (Criteria) this;
        }

        public Criteria andFactorsDiscritionsEqualTo(String value) {
            addCriterion("FACTORS_DISCRITIONS =", value, "factorsDiscritions");
            return (Criteria) this;
        }

        public Criteria andFactorsDiscritionsNotEqualTo(String value) {
            addCriterion("FACTORS_DISCRITIONS <>", value, "factorsDiscritions");
            return (Criteria) this;
        }

        public Criteria andFactorsDiscritionsGreaterThan(String value) {
            addCriterion("FACTORS_DISCRITIONS >", value, "factorsDiscritions");
            return (Criteria) this;
        }

        public Criteria andFactorsDiscritionsGreaterThanOrEqualTo(String value) {
            addCriterion("FACTORS_DISCRITIONS >=", value, "factorsDiscritions");
            return (Criteria) this;
        }

        public Criteria andFactorsDiscritionsLessThan(String value) {
            addCriterion("FACTORS_DISCRITIONS <", value, "factorsDiscritions");
            return (Criteria) this;
        }

        public Criteria andFactorsDiscritionsLessThanOrEqualTo(String value) {
            addCriterion("FACTORS_DISCRITIONS <=", value, "factorsDiscritions");
            return (Criteria) this;
        }

        public Criteria andFactorsDiscritionsLike(String value) {
            addCriterion("FACTORS_DISCRITIONS like", value, "factorsDiscritions");
            return (Criteria) this;
        }

        public Criteria andFactorsDiscritionsNotLike(String value) {
            addCriterion("FACTORS_DISCRITIONS not like", value, "factorsDiscritions");
            return (Criteria) this;
        }

        public Criteria andFactorsDiscritionsIn(List<String> values) {
            addCriterion("FACTORS_DISCRITIONS in", values, "factorsDiscritions");
            return (Criteria) this;
        }

        public Criteria andFactorsDiscritionsNotIn(List<String> values) {
            addCriterion("FACTORS_DISCRITIONS not in", values, "factorsDiscritions");
            return (Criteria) this;
        }

        public Criteria andFactorsDiscritionsBetween(String value1, String value2) {
            addCriterion("FACTORS_DISCRITIONS between", value1, value2, "factorsDiscritions");
            return (Criteria) this;
        }

        public Criteria andFactorsDiscritionsNotBetween(String value1, String value2) {
            addCriterion("FACTORS_DISCRITIONS not between", value1, value2, "factorsDiscritions");
            return (Criteria) this;
        }

        public Criteria andFactor1NameIsNull() {
            addCriterion("FACTOR1_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFactor1NameIsNotNull() {
            addCriterion("FACTOR1_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFactor1NameEqualTo(String value) {
            addCriterion("FACTOR1_NAME =", value, "factor1Name");
            return (Criteria) this;
        }

        public Criteria andFactor1NameNotEqualTo(String value) {
            addCriterion("FACTOR1_NAME <>", value, "factor1Name");
            return (Criteria) this;
        }

        public Criteria andFactor1NameGreaterThan(String value) {
            addCriterion("FACTOR1_NAME >", value, "factor1Name");
            return (Criteria) this;
        }

        public Criteria andFactor1NameGreaterThanOrEqualTo(String value) {
            addCriterion("FACTOR1_NAME >=", value, "factor1Name");
            return (Criteria) this;
        }

        public Criteria andFactor1NameLessThan(String value) {
            addCriterion("FACTOR1_NAME <", value, "factor1Name");
            return (Criteria) this;
        }

        public Criteria andFactor1NameLessThanOrEqualTo(String value) {
            addCriterion("FACTOR1_NAME <=", value, "factor1Name");
            return (Criteria) this;
        }

        public Criteria andFactor1NameLike(String value) {
            addCriterion("FACTOR1_NAME like", value, "factor1Name");
            return (Criteria) this;
        }

        public Criteria andFactor1NameNotLike(String value) {
            addCriterion("FACTOR1_NAME not like", value, "factor1Name");
            return (Criteria) this;
        }

        public Criteria andFactor1NameIn(List<String> values) {
            addCriterion("FACTOR1_NAME in", values, "factor1Name");
            return (Criteria) this;
        }

        public Criteria andFactor1NameNotIn(List<String> values) {
            addCriterion("FACTOR1_NAME not in", values, "factor1Name");
            return (Criteria) this;
        }

        public Criteria andFactor1NameBetween(String value1, String value2) {
            addCriterion("FACTOR1_NAME between", value1, value2, "factor1Name");
            return (Criteria) this;
        }

        public Criteria andFactor1NameNotBetween(String value1, String value2) {
            addCriterion("FACTOR1_NAME not between", value1, value2, "factor1Name");
            return (Criteria) this;
        }

        public Criteria andFactor2NameIsNull() {
            addCriterion("FACTOR2_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFactor2NameIsNotNull() {
            addCriterion("FACTOR2_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFactor2NameEqualTo(String value) {
            addCriterion("FACTOR2_NAME =", value, "factor2Name");
            return (Criteria) this;
        }

        public Criteria andFactor2NameNotEqualTo(String value) {
            addCriterion("FACTOR2_NAME <>", value, "factor2Name");
            return (Criteria) this;
        }

        public Criteria andFactor2NameGreaterThan(String value) {
            addCriterion("FACTOR2_NAME >", value, "factor2Name");
            return (Criteria) this;
        }

        public Criteria andFactor2NameGreaterThanOrEqualTo(String value) {
            addCriterion("FACTOR2_NAME >=", value, "factor2Name");
            return (Criteria) this;
        }

        public Criteria andFactor2NameLessThan(String value) {
            addCriterion("FACTOR2_NAME <", value, "factor2Name");
            return (Criteria) this;
        }

        public Criteria andFactor2NameLessThanOrEqualTo(String value) {
            addCriterion("FACTOR2_NAME <=", value, "factor2Name");
            return (Criteria) this;
        }

        public Criteria andFactor2NameLike(String value) {
            addCriterion("FACTOR2_NAME like", value, "factor2Name");
            return (Criteria) this;
        }

        public Criteria andFactor2NameNotLike(String value) {
            addCriterion("FACTOR2_NAME not like", value, "factor2Name");
            return (Criteria) this;
        }

        public Criteria andFactor2NameIn(List<String> values) {
            addCriterion("FACTOR2_NAME in", values, "factor2Name");
            return (Criteria) this;
        }

        public Criteria andFactor2NameNotIn(List<String> values) {
            addCriterion("FACTOR2_NAME not in", values, "factor2Name");
            return (Criteria) this;
        }

        public Criteria andFactor2NameBetween(String value1, String value2) {
            addCriterion("FACTOR2_NAME between", value1, value2, "factor2Name");
            return (Criteria) this;
        }

        public Criteria andFactor2NameNotBetween(String value1, String value2) {
            addCriterion("FACTOR2_NAME not between", value1, value2, "factor2Name");
            return (Criteria) this;
        }

        public Criteria andFactor3NameIsNull() {
            addCriterion("FACTOR3_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFactor3NameIsNotNull() {
            addCriterion("FACTOR3_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFactor3NameEqualTo(String value) {
            addCriterion("FACTOR3_NAME =", value, "factor3Name");
            return (Criteria) this;
        }

        public Criteria andFactor3NameNotEqualTo(String value) {
            addCriterion("FACTOR3_NAME <>", value, "factor3Name");
            return (Criteria) this;
        }

        public Criteria andFactor3NameGreaterThan(String value) {
            addCriterion("FACTOR3_NAME >", value, "factor3Name");
            return (Criteria) this;
        }

        public Criteria andFactor3NameGreaterThanOrEqualTo(String value) {
            addCriterion("FACTOR3_NAME >=", value, "factor3Name");
            return (Criteria) this;
        }

        public Criteria andFactor3NameLessThan(String value) {
            addCriterion("FACTOR3_NAME <", value, "factor3Name");
            return (Criteria) this;
        }

        public Criteria andFactor3NameLessThanOrEqualTo(String value) {
            addCriterion("FACTOR3_NAME <=", value, "factor3Name");
            return (Criteria) this;
        }

        public Criteria andFactor3NameLike(String value) {
            addCriterion("FACTOR3_NAME like", value, "factor3Name");
            return (Criteria) this;
        }

        public Criteria andFactor3NameNotLike(String value) {
            addCriterion("FACTOR3_NAME not like", value, "factor3Name");
            return (Criteria) this;
        }

        public Criteria andFactor3NameIn(List<String> values) {
            addCriterion("FACTOR3_NAME in", values, "factor3Name");
            return (Criteria) this;
        }

        public Criteria andFactor3NameNotIn(List<String> values) {
            addCriterion("FACTOR3_NAME not in", values, "factor3Name");
            return (Criteria) this;
        }

        public Criteria andFactor3NameBetween(String value1, String value2) {
            addCriterion("FACTOR3_NAME between", value1, value2, "factor3Name");
            return (Criteria) this;
        }

        public Criteria andFactor3NameNotBetween(String value1, String value2) {
            addCriterion("FACTOR3_NAME not between", value1, value2, "factor3Name");
            return (Criteria) this;
        }

        public Criteria andFactor4NameIsNull() {
            addCriterion("FACTOR4_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFactor4NameIsNotNull() {
            addCriterion("FACTOR4_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFactor4NameEqualTo(String value) {
            addCriterion("FACTOR4_NAME =", value, "factor4Name");
            return (Criteria) this;
        }

        public Criteria andFactor4NameNotEqualTo(String value) {
            addCriterion("FACTOR4_NAME <>", value, "factor4Name");
            return (Criteria) this;
        }

        public Criteria andFactor4NameGreaterThan(String value) {
            addCriterion("FACTOR4_NAME >", value, "factor4Name");
            return (Criteria) this;
        }

        public Criteria andFactor4NameGreaterThanOrEqualTo(String value) {
            addCriterion("FACTOR4_NAME >=", value, "factor4Name");
            return (Criteria) this;
        }

        public Criteria andFactor4NameLessThan(String value) {
            addCriterion("FACTOR4_NAME <", value, "factor4Name");
            return (Criteria) this;
        }

        public Criteria andFactor4NameLessThanOrEqualTo(String value) {
            addCriterion("FACTOR4_NAME <=", value, "factor4Name");
            return (Criteria) this;
        }

        public Criteria andFactor4NameLike(String value) {
            addCriterion("FACTOR4_NAME like", value, "factor4Name");
            return (Criteria) this;
        }

        public Criteria andFactor4NameNotLike(String value) {
            addCriterion("FACTOR4_NAME not like", value, "factor4Name");
            return (Criteria) this;
        }

        public Criteria andFactor4NameIn(List<String> values) {
            addCriterion("FACTOR4_NAME in", values, "factor4Name");
            return (Criteria) this;
        }

        public Criteria andFactor4NameNotIn(List<String> values) {
            addCriterion("FACTOR4_NAME not in", values, "factor4Name");
            return (Criteria) this;
        }

        public Criteria andFactor4NameBetween(String value1, String value2) {
            addCriterion("FACTOR4_NAME between", value1, value2, "factor4Name");
            return (Criteria) this;
        }

        public Criteria andFactor4NameNotBetween(String value1, String value2) {
            addCriterion("FACTOR4_NAME not between", value1, value2, "factor4Name");
            return (Criteria) this;
        }

        public Criteria andFactor5NameIsNull() {
            addCriterion("FACTOR5_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFactor5NameIsNotNull() {
            addCriterion("FACTOR5_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFactor5NameEqualTo(String value) {
            addCriterion("FACTOR5_NAME =", value, "factor5Name");
            return (Criteria) this;
        }

        public Criteria andFactor5NameNotEqualTo(String value) {
            addCriterion("FACTOR5_NAME <>", value, "factor5Name");
            return (Criteria) this;
        }

        public Criteria andFactor5NameGreaterThan(String value) {
            addCriterion("FACTOR5_NAME >", value, "factor5Name");
            return (Criteria) this;
        }

        public Criteria andFactor5NameGreaterThanOrEqualTo(String value) {
            addCriterion("FACTOR5_NAME >=", value, "factor5Name");
            return (Criteria) this;
        }

        public Criteria andFactor5NameLessThan(String value) {
            addCriterion("FACTOR5_NAME <", value, "factor5Name");
            return (Criteria) this;
        }

        public Criteria andFactor5NameLessThanOrEqualTo(String value) {
            addCriterion("FACTOR5_NAME <=", value, "factor5Name");
            return (Criteria) this;
        }

        public Criteria andFactor5NameLike(String value) {
            addCriterion("FACTOR5_NAME like", value, "factor5Name");
            return (Criteria) this;
        }

        public Criteria andFactor5NameNotLike(String value) {
            addCriterion("FACTOR5_NAME not like", value, "factor5Name");
            return (Criteria) this;
        }

        public Criteria andFactor5NameIn(List<String> values) {
            addCriterion("FACTOR5_NAME in", values, "factor5Name");
            return (Criteria) this;
        }

        public Criteria andFactor5NameNotIn(List<String> values) {
            addCriterion("FACTOR5_NAME not in", values, "factor5Name");
            return (Criteria) this;
        }

        public Criteria andFactor5NameBetween(String value1, String value2) {
            addCriterion("FACTOR5_NAME between", value1, value2, "factor5Name");
            return (Criteria) this;
        }

        public Criteria andFactor5NameNotBetween(String value1, String value2) {
            addCriterion("FACTOR5_NAME not between", value1, value2, "factor5Name");
            return (Criteria) this;
        }

        public Criteria andFactor6NameIsNull() {
            addCriterion("FACTOR6_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFactor6NameIsNotNull() {
            addCriterion("FACTOR6_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFactor6NameEqualTo(String value) {
            addCriterion("FACTOR6_NAME =", value, "factor6Name");
            return (Criteria) this;
        }

        public Criteria andFactor6NameNotEqualTo(String value) {
            addCriterion("FACTOR6_NAME <>", value, "factor6Name");
            return (Criteria) this;
        }

        public Criteria andFactor6NameGreaterThan(String value) {
            addCriterion("FACTOR6_NAME >", value, "factor6Name");
            return (Criteria) this;
        }

        public Criteria andFactor6NameGreaterThanOrEqualTo(String value) {
            addCriterion("FACTOR6_NAME >=", value, "factor6Name");
            return (Criteria) this;
        }

        public Criteria andFactor6NameLessThan(String value) {
            addCriterion("FACTOR6_NAME <", value, "factor6Name");
            return (Criteria) this;
        }

        public Criteria andFactor6NameLessThanOrEqualTo(String value) {
            addCriterion("FACTOR6_NAME <=", value, "factor6Name");
            return (Criteria) this;
        }

        public Criteria andFactor6NameLike(String value) {
            addCriterion("FACTOR6_NAME like", value, "factor6Name");
            return (Criteria) this;
        }

        public Criteria andFactor6NameNotLike(String value) {
            addCriterion("FACTOR6_NAME not like", value, "factor6Name");
            return (Criteria) this;
        }

        public Criteria andFactor6NameIn(List<String> values) {
            addCriterion("FACTOR6_NAME in", values, "factor6Name");
            return (Criteria) this;
        }

        public Criteria andFactor6NameNotIn(List<String> values) {
            addCriterion("FACTOR6_NAME not in", values, "factor6Name");
            return (Criteria) this;
        }

        public Criteria andFactor6NameBetween(String value1, String value2) {
            addCriterion("FACTOR6_NAME between", value1, value2, "factor6Name");
            return (Criteria) this;
        }

        public Criteria andFactor6NameNotBetween(String value1, String value2) {
            addCriterion("FACTOR6_NAME not between", value1, value2, "factor6Name");
            return (Criteria) this;
        }

        public Criteria andFactor7NameIsNull() {
            addCriterion("FACTOR7_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFactor7NameIsNotNull() {
            addCriterion("FACTOR7_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFactor7NameEqualTo(String value) {
            addCriterion("FACTOR7_NAME =", value, "factor7Name");
            return (Criteria) this;
        }

        public Criteria andFactor7NameNotEqualTo(String value) {
            addCriterion("FACTOR7_NAME <>", value, "factor7Name");
            return (Criteria) this;
        }

        public Criteria andFactor7NameGreaterThan(String value) {
            addCriterion("FACTOR7_NAME >", value, "factor7Name");
            return (Criteria) this;
        }

        public Criteria andFactor7NameGreaterThanOrEqualTo(String value) {
            addCriterion("FACTOR7_NAME >=", value, "factor7Name");
            return (Criteria) this;
        }

        public Criteria andFactor7NameLessThan(String value) {
            addCriterion("FACTOR7_NAME <", value, "factor7Name");
            return (Criteria) this;
        }

        public Criteria andFactor7NameLessThanOrEqualTo(String value) {
            addCriterion("FACTOR7_NAME <=", value, "factor7Name");
            return (Criteria) this;
        }

        public Criteria andFactor7NameLike(String value) {
            addCriterion("FACTOR7_NAME like", value, "factor7Name");
            return (Criteria) this;
        }

        public Criteria andFactor7NameNotLike(String value) {
            addCriterion("FACTOR7_NAME not like", value, "factor7Name");
            return (Criteria) this;
        }

        public Criteria andFactor7NameIn(List<String> values) {
            addCriterion("FACTOR7_NAME in", values, "factor7Name");
            return (Criteria) this;
        }

        public Criteria andFactor7NameNotIn(List<String> values) {
            addCriterion("FACTOR7_NAME not in", values, "factor7Name");
            return (Criteria) this;
        }

        public Criteria andFactor7NameBetween(String value1, String value2) {
            addCriterion("FACTOR7_NAME between", value1, value2, "factor7Name");
            return (Criteria) this;
        }

        public Criteria andFactor7NameNotBetween(String value1, String value2) {
            addCriterion("FACTOR7_NAME not between", value1, value2, "factor7Name");
            return (Criteria) this;
        }

        public Criteria andFactor8NameIsNull() {
            addCriterion("FACTOR8_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFactor8NameIsNotNull() {
            addCriterion("FACTOR8_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFactor8NameEqualTo(String value) {
            addCriterion("FACTOR8_NAME =", value, "factor8Name");
            return (Criteria) this;
        }

        public Criteria andFactor8NameNotEqualTo(String value) {
            addCriterion("FACTOR8_NAME <>", value, "factor8Name");
            return (Criteria) this;
        }

        public Criteria andFactor8NameGreaterThan(String value) {
            addCriterion("FACTOR8_NAME >", value, "factor8Name");
            return (Criteria) this;
        }

        public Criteria andFactor8NameGreaterThanOrEqualTo(String value) {
            addCriterion("FACTOR8_NAME >=", value, "factor8Name");
            return (Criteria) this;
        }

        public Criteria andFactor8NameLessThan(String value) {
            addCriterion("FACTOR8_NAME <", value, "factor8Name");
            return (Criteria) this;
        }

        public Criteria andFactor8NameLessThanOrEqualTo(String value) {
            addCriterion("FACTOR8_NAME <=", value, "factor8Name");
            return (Criteria) this;
        }

        public Criteria andFactor8NameLike(String value) {
            addCriterion("FACTOR8_NAME like", value, "factor8Name");
            return (Criteria) this;
        }

        public Criteria andFactor8NameNotLike(String value) {
            addCriterion("FACTOR8_NAME not like", value, "factor8Name");
            return (Criteria) this;
        }

        public Criteria andFactor8NameIn(List<String> values) {
            addCriterion("FACTOR8_NAME in", values, "factor8Name");
            return (Criteria) this;
        }

        public Criteria andFactor8NameNotIn(List<String> values) {
            addCriterion("FACTOR8_NAME not in", values, "factor8Name");
            return (Criteria) this;
        }

        public Criteria andFactor8NameBetween(String value1, String value2) {
            addCriterion("FACTOR8_NAME between", value1, value2, "factor8Name");
            return (Criteria) this;
        }

        public Criteria andFactor8NameNotBetween(String value1, String value2) {
            addCriterion("FACTOR8_NAME not between", value1, value2, "factor8Name");
            return (Criteria) this;
        }

        public Criteria andFactor9NameIsNull() {
            addCriterion("FACTOR9_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFactor9NameIsNotNull() {
            addCriterion("FACTOR9_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFactor9NameEqualTo(String value) {
            addCriterion("FACTOR9_NAME =", value, "factor9Name");
            return (Criteria) this;
        }

        public Criteria andFactor9NameNotEqualTo(String value) {
            addCriterion("FACTOR9_NAME <>", value, "factor9Name");
            return (Criteria) this;
        }

        public Criteria andFactor9NameGreaterThan(String value) {
            addCriterion("FACTOR9_NAME >", value, "factor9Name");
            return (Criteria) this;
        }

        public Criteria andFactor9NameGreaterThanOrEqualTo(String value) {
            addCriterion("FACTOR9_NAME >=", value, "factor9Name");
            return (Criteria) this;
        }

        public Criteria andFactor9NameLessThan(String value) {
            addCriterion("FACTOR9_NAME <", value, "factor9Name");
            return (Criteria) this;
        }

        public Criteria andFactor9NameLessThanOrEqualTo(String value) {
            addCriterion("FACTOR9_NAME <=", value, "factor9Name");
            return (Criteria) this;
        }

        public Criteria andFactor9NameLike(String value) {
            addCriterion("FACTOR9_NAME like", value, "factor9Name");
            return (Criteria) this;
        }

        public Criteria andFactor9NameNotLike(String value) {
            addCriterion("FACTOR9_NAME not like", value, "factor9Name");
            return (Criteria) this;
        }

        public Criteria andFactor9NameIn(List<String> values) {
            addCriterion("FACTOR9_NAME in", values, "factor9Name");
            return (Criteria) this;
        }

        public Criteria andFactor9NameNotIn(List<String> values) {
            addCriterion("FACTOR9_NAME not in", values, "factor9Name");
            return (Criteria) this;
        }

        public Criteria andFactor9NameBetween(String value1, String value2) {
            addCriterion("FACTOR9_NAME between", value1, value2, "factor9Name");
            return (Criteria) this;
        }

        public Criteria andFactor9NameNotBetween(String value1, String value2) {
            addCriterion("FACTOR9_NAME not between", value1, value2, "factor9Name");
            return (Criteria) this;
        }

        public Criteria andFactor10NameIsNull() {
            addCriterion("FACTOR10_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFactor10NameIsNotNull() {
            addCriterion("FACTOR10_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFactor10NameEqualTo(String value) {
            addCriterion("FACTOR10_NAME =", value, "factor10Name");
            return (Criteria) this;
        }

        public Criteria andFactor10NameNotEqualTo(String value) {
            addCriterion("FACTOR10_NAME <>", value, "factor10Name");
            return (Criteria) this;
        }

        public Criteria andFactor10NameGreaterThan(String value) {
            addCriterion("FACTOR10_NAME >", value, "factor10Name");
            return (Criteria) this;
        }

        public Criteria andFactor10NameGreaterThanOrEqualTo(String value) {
            addCriterion("FACTOR10_NAME >=", value, "factor10Name");
            return (Criteria) this;
        }

        public Criteria andFactor10NameLessThan(String value) {
            addCriterion("FACTOR10_NAME <", value, "factor10Name");
            return (Criteria) this;
        }

        public Criteria andFactor10NameLessThanOrEqualTo(String value) {
            addCriterion("FACTOR10_NAME <=", value, "factor10Name");
            return (Criteria) this;
        }

        public Criteria andFactor10NameLike(String value) {
            addCriterion("FACTOR10_NAME like", value, "factor10Name");
            return (Criteria) this;
        }

        public Criteria andFactor10NameNotLike(String value) {
            addCriterion("FACTOR10_NAME not like", value, "factor10Name");
            return (Criteria) this;
        }

        public Criteria andFactor10NameIn(List<String> values) {
            addCriterion("FACTOR10_NAME in", values, "factor10Name");
            return (Criteria) this;
        }

        public Criteria andFactor10NameNotIn(List<String> values) {
            addCriterion("FACTOR10_NAME not in", values, "factor10Name");
            return (Criteria) this;
        }

        public Criteria andFactor10NameBetween(String value1, String value2) {
            addCriterion("FACTOR10_NAME between", value1, value2, "factor10Name");
            return (Criteria) this;
        }

        public Criteria andFactor10NameNotBetween(String value1, String value2) {
            addCriterion("FACTOR10_NAME not between", value1, value2, "factor10Name");
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