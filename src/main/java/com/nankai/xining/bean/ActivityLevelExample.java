package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class ActivityLevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityLevelExample() {
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

        public Criteria andActivitysIdIsNull() {
            addCriterion("ACTIVITYS_ID is null");
            return (Criteria) this;
        }

        public Criteria andActivitysIdIsNotNull() {
            addCriterion("ACTIVITYS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andActivitysIdEqualTo(String value) {
            addCriterion("ACTIVITYS_ID =", value, "activitysId");
            return (Criteria) this;
        }

        public Criteria andActivitysIdNotEqualTo(String value) {
            addCriterion("ACTIVITYS_ID <>", value, "activitysId");
            return (Criteria) this;
        }

        public Criteria andActivitysIdGreaterThan(String value) {
            addCriterion("ACTIVITYS_ID >", value, "activitysId");
            return (Criteria) this;
        }

        public Criteria andActivitysIdGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITYS_ID >=", value, "activitysId");
            return (Criteria) this;
        }

        public Criteria andActivitysIdLessThan(String value) {
            addCriterion("ACTIVITYS_ID <", value, "activitysId");
            return (Criteria) this;
        }

        public Criteria andActivitysIdLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITYS_ID <=", value, "activitysId");
            return (Criteria) this;
        }

        public Criteria andActivitysIdLike(String value) {
            addCriterion("ACTIVITYS_ID like", value, "activitysId");
            return (Criteria) this;
        }

        public Criteria andActivitysIdNotLike(String value) {
            addCriterion("ACTIVITYS_ID not like", value, "activitysId");
            return (Criteria) this;
        }

        public Criteria andActivitysIdIn(List<String> values) {
            addCriterion("ACTIVITYS_ID in", values, "activitysId");
            return (Criteria) this;
        }

        public Criteria andActivitysIdNotIn(List<String> values) {
            addCriterion("ACTIVITYS_ID not in", values, "activitysId");
            return (Criteria) this;
        }

        public Criteria andActivitysIdBetween(String value1, String value2) {
            addCriterion("ACTIVITYS_ID between", value1, value2, "activitysId");
            return (Criteria) this;
        }

        public Criteria andActivitysIdNotBetween(String value1, String value2) {
            addCriterion("ACTIVITYS_ID not between", value1, value2, "activitysId");
            return (Criteria) this;
        }

        public Criteria andActivitysQuantityIsNull() {
            addCriterion("ACTIVITYS_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andActivitysQuantityIsNotNull() {
            addCriterion("ACTIVITYS_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andActivitysQuantityEqualTo(Integer value) {
            addCriterion("ACTIVITYS_QUANTITY =", value, "activitysQuantity");
            return (Criteria) this;
        }

        public Criteria andActivitysQuantityNotEqualTo(Integer value) {
            addCriterion("ACTIVITYS_QUANTITY <>", value, "activitysQuantity");
            return (Criteria) this;
        }

        public Criteria andActivitysQuantityGreaterThan(Integer value) {
            addCriterion("ACTIVITYS_QUANTITY >", value, "activitysQuantity");
            return (Criteria) this;
        }

        public Criteria andActivitysQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACTIVITYS_QUANTITY >=", value, "activitysQuantity");
            return (Criteria) this;
        }

        public Criteria andActivitysQuantityLessThan(Integer value) {
            addCriterion("ACTIVITYS_QUANTITY <", value, "activitysQuantity");
            return (Criteria) this;
        }

        public Criteria andActivitysQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("ACTIVITYS_QUANTITY <=", value, "activitysQuantity");
            return (Criteria) this;
        }

        public Criteria andActivitysQuantityIn(List<Integer> values) {
            addCriterion("ACTIVITYS_QUANTITY in", values, "activitysQuantity");
            return (Criteria) this;
        }

        public Criteria andActivitysQuantityNotIn(List<Integer> values) {
            addCriterion("ACTIVITYS_QUANTITY not in", values, "activitysQuantity");
            return (Criteria) this;
        }

        public Criteria andActivitysQuantityBetween(Integer value1, Integer value2) {
            addCriterion("ACTIVITYS_QUANTITY between", value1, value2, "activitysQuantity");
            return (Criteria) this;
        }

        public Criteria andActivitysQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("ACTIVITYS_QUANTITY not between", value1, value2, "activitysQuantity");
            return (Criteria) this;
        }

        public Criteria andLevel1NameIsNull() {
            addCriterion("LEVEL1_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLevel1NameIsNotNull() {
            addCriterion("LEVEL1_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLevel1NameEqualTo(String value) {
            addCriterion("LEVEL1_NAME =", value, "level1Name");
            return (Criteria) this;
        }

        public Criteria andLevel1NameNotEqualTo(String value) {
            addCriterion("LEVEL1_NAME <>", value, "level1Name");
            return (Criteria) this;
        }

        public Criteria andLevel1NameGreaterThan(String value) {
            addCriterion("LEVEL1_NAME >", value, "level1Name");
            return (Criteria) this;
        }

        public Criteria andLevel1NameGreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL1_NAME >=", value, "level1Name");
            return (Criteria) this;
        }

        public Criteria andLevel1NameLessThan(String value) {
            addCriterion("LEVEL1_NAME <", value, "level1Name");
            return (Criteria) this;
        }

        public Criteria andLevel1NameLessThanOrEqualTo(String value) {
            addCriterion("LEVEL1_NAME <=", value, "level1Name");
            return (Criteria) this;
        }

        public Criteria andLevel1NameLike(String value) {
            addCriterion("LEVEL1_NAME like", value, "level1Name");
            return (Criteria) this;
        }

        public Criteria andLevel1NameNotLike(String value) {
            addCriterion("LEVEL1_NAME not like", value, "level1Name");
            return (Criteria) this;
        }

        public Criteria andLevel1NameIn(List<String> values) {
            addCriterion("LEVEL1_NAME in", values, "level1Name");
            return (Criteria) this;
        }

        public Criteria andLevel1NameNotIn(List<String> values) {
            addCriterion("LEVEL1_NAME not in", values, "level1Name");
            return (Criteria) this;
        }

        public Criteria andLevel1NameBetween(String value1, String value2) {
            addCriterion("LEVEL1_NAME between", value1, value2, "level1Name");
            return (Criteria) this;
        }

        public Criteria andLevel1NameNotBetween(String value1, String value2) {
            addCriterion("LEVEL1_NAME not between", value1, value2, "level1Name");
            return (Criteria) this;
        }

        public Criteria andLevel2NameIsNull() {
            addCriterion("LEVEL2_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLevel2NameIsNotNull() {
            addCriterion("LEVEL2_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLevel2NameEqualTo(String value) {
            addCriterion("LEVEL2_NAME =", value, "level2Name");
            return (Criteria) this;
        }

        public Criteria andLevel2NameNotEqualTo(String value) {
            addCriterion("LEVEL2_NAME <>", value, "level2Name");
            return (Criteria) this;
        }

        public Criteria andLevel2NameGreaterThan(String value) {
            addCriterion("LEVEL2_NAME >", value, "level2Name");
            return (Criteria) this;
        }

        public Criteria andLevel2NameGreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL2_NAME >=", value, "level2Name");
            return (Criteria) this;
        }

        public Criteria andLevel2NameLessThan(String value) {
            addCriterion("LEVEL2_NAME <", value, "level2Name");
            return (Criteria) this;
        }

        public Criteria andLevel2NameLessThanOrEqualTo(String value) {
            addCriterion("LEVEL2_NAME <=", value, "level2Name");
            return (Criteria) this;
        }

        public Criteria andLevel2NameLike(String value) {
            addCriterion("LEVEL2_NAME like", value, "level2Name");
            return (Criteria) this;
        }

        public Criteria andLevel2NameNotLike(String value) {
            addCriterion("LEVEL2_NAME not like", value, "level2Name");
            return (Criteria) this;
        }

        public Criteria andLevel2NameIn(List<String> values) {
            addCriterion("LEVEL2_NAME in", values, "level2Name");
            return (Criteria) this;
        }

        public Criteria andLevel2NameNotIn(List<String> values) {
            addCriterion("LEVEL2_NAME not in", values, "level2Name");
            return (Criteria) this;
        }

        public Criteria andLevel2NameBetween(String value1, String value2) {
            addCriterion("LEVEL2_NAME between", value1, value2, "level2Name");
            return (Criteria) this;
        }

        public Criteria andLevel2NameNotBetween(String value1, String value2) {
            addCriterion("LEVEL2_NAME not between", value1, value2, "level2Name");
            return (Criteria) this;
        }

        public Criteria andLevel3NameIsNull() {
            addCriterion("LEVEL3_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLevel3NameIsNotNull() {
            addCriterion("LEVEL3_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLevel3NameEqualTo(String value) {
            addCriterion("LEVEL3_NAME =", value, "level3Name");
            return (Criteria) this;
        }

        public Criteria andLevel3NameNotEqualTo(String value) {
            addCriterion("LEVEL3_NAME <>", value, "level3Name");
            return (Criteria) this;
        }

        public Criteria andLevel3NameGreaterThan(String value) {
            addCriterion("LEVEL3_NAME >", value, "level3Name");
            return (Criteria) this;
        }

        public Criteria andLevel3NameGreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL3_NAME >=", value, "level3Name");
            return (Criteria) this;
        }

        public Criteria andLevel3NameLessThan(String value) {
            addCriterion("LEVEL3_NAME <", value, "level3Name");
            return (Criteria) this;
        }

        public Criteria andLevel3NameLessThanOrEqualTo(String value) {
            addCriterion("LEVEL3_NAME <=", value, "level3Name");
            return (Criteria) this;
        }

        public Criteria andLevel3NameLike(String value) {
            addCriterion("LEVEL3_NAME like", value, "level3Name");
            return (Criteria) this;
        }

        public Criteria andLevel3NameNotLike(String value) {
            addCriterion("LEVEL3_NAME not like", value, "level3Name");
            return (Criteria) this;
        }

        public Criteria andLevel3NameIn(List<String> values) {
            addCriterion("LEVEL3_NAME in", values, "level3Name");
            return (Criteria) this;
        }

        public Criteria andLevel3NameNotIn(List<String> values) {
            addCriterion("LEVEL3_NAME not in", values, "level3Name");
            return (Criteria) this;
        }

        public Criteria andLevel3NameBetween(String value1, String value2) {
            addCriterion("LEVEL3_NAME between", value1, value2, "level3Name");
            return (Criteria) this;
        }

        public Criteria andLevel3NameNotBetween(String value1, String value2) {
            addCriterion("LEVEL3_NAME not between", value1, value2, "level3Name");
            return (Criteria) this;
        }

        public Criteria andLevel4NameIsNull() {
            addCriterion("LEVEL4_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLevel4NameIsNotNull() {
            addCriterion("LEVEL4_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLevel4NameEqualTo(String value) {
            addCriterion("LEVEL4_NAME =", value, "level4Name");
            return (Criteria) this;
        }

        public Criteria andLevel4NameNotEqualTo(String value) {
            addCriterion("LEVEL4_NAME <>", value, "level4Name");
            return (Criteria) this;
        }

        public Criteria andLevel4NameGreaterThan(String value) {
            addCriterion("LEVEL4_NAME >", value, "level4Name");
            return (Criteria) this;
        }

        public Criteria andLevel4NameGreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL4_NAME >=", value, "level4Name");
            return (Criteria) this;
        }

        public Criteria andLevel4NameLessThan(String value) {
            addCriterion("LEVEL4_NAME <", value, "level4Name");
            return (Criteria) this;
        }

        public Criteria andLevel4NameLessThanOrEqualTo(String value) {
            addCriterion("LEVEL4_NAME <=", value, "level4Name");
            return (Criteria) this;
        }

        public Criteria andLevel4NameLike(String value) {
            addCriterion("LEVEL4_NAME like", value, "level4Name");
            return (Criteria) this;
        }

        public Criteria andLevel4NameNotLike(String value) {
            addCriterion("LEVEL4_NAME not like", value, "level4Name");
            return (Criteria) this;
        }

        public Criteria andLevel4NameIn(List<String> values) {
            addCriterion("LEVEL4_NAME in", values, "level4Name");
            return (Criteria) this;
        }

        public Criteria andLevel4NameNotIn(List<String> values) {
            addCriterion("LEVEL4_NAME not in", values, "level4Name");
            return (Criteria) this;
        }

        public Criteria andLevel4NameBetween(String value1, String value2) {
            addCriterion("LEVEL4_NAME between", value1, value2, "level4Name");
            return (Criteria) this;
        }

        public Criteria andLevel4NameNotBetween(String value1, String value2) {
            addCriterion("LEVEL4_NAME not between", value1, value2, "level4Name");
            return (Criteria) this;
        }

        public Criteria andLevel5NameIsNull() {
            addCriterion("LEVEL5_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLevel5NameIsNotNull() {
            addCriterion("LEVEL5_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLevel5NameEqualTo(String value) {
            addCriterion("LEVEL5_NAME =", value, "level5Name");
            return (Criteria) this;
        }

        public Criteria andLevel5NameNotEqualTo(String value) {
            addCriterion("LEVEL5_NAME <>", value, "level5Name");
            return (Criteria) this;
        }

        public Criteria andLevel5NameGreaterThan(String value) {
            addCriterion("LEVEL5_NAME >", value, "level5Name");
            return (Criteria) this;
        }

        public Criteria andLevel5NameGreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL5_NAME >=", value, "level5Name");
            return (Criteria) this;
        }

        public Criteria andLevel5NameLessThan(String value) {
            addCriterion("LEVEL5_NAME <", value, "level5Name");
            return (Criteria) this;
        }

        public Criteria andLevel5NameLessThanOrEqualTo(String value) {
            addCriterion("LEVEL5_NAME <=", value, "level5Name");
            return (Criteria) this;
        }

        public Criteria andLevel5NameLike(String value) {
            addCriterion("LEVEL5_NAME like", value, "level5Name");
            return (Criteria) this;
        }

        public Criteria andLevel5NameNotLike(String value) {
            addCriterion("LEVEL5_NAME not like", value, "level5Name");
            return (Criteria) this;
        }

        public Criteria andLevel5NameIn(List<String> values) {
            addCriterion("LEVEL5_NAME in", values, "level5Name");
            return (Criteria) this;
        }

        public Criteria andLevel5NameNotIn(List<String> values) {
            addCriterion("LEVEL5_NAME not in", values, "level5Name");
            return (Criteria) this;
        }

        public Criteria andLevel5NameBetween(String value1, String value2) {
            addCriterion("LEVEL5_NAME between", value1, value2, "level5Name");
            return (Criteria) this;
        }

        public Criteria andLevel5NameNotBetween(String value1, String value2) {
            addCriterion("LEVEL5_NAME not between", value1, value2, "level5Name");
            return (Criteria) this;
        }

        public Criteria andLevel6NameIsNull() {
            addCriterion("LEVEL6_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLevel6NameIsNotNull() {
            addCriterion("LEVEL6_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLevel6NameEqualTo(String value) {
            addCriterion("LEVEL6_NAME =", value, "level6Name");
            return (Criteria) this;
        }

        public Criteria andLevel6NameNotEqualTo(String value) {
            addCriterion("LEVEL6_NAME <>", value, "level6Name");
            return (Criteria) this;
        }

        public Criteria andLevel6NameGreaterThan(String value) {
            addCriterion("LEVEL6_NAME >", value, "level6Name");
            return (Criteria) this;
        }

        public Criteria andLevel6NameGreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL6_NAME >=", value, "level6Name");
            return (Criteria) this;
        }

        public Criteria andLevel6NameLessThan(String value) {
            addCriterion("LEVEL6_NAME <", value, "level6Name");
            return (Criteria) this;
        }

        public Criteria andLevel6NameLessThanOrEqualTo(String value) {
            addCriterion("LEVEL6_NAME <=", value, "level6Name");
            return (Criteria) this;
        }

        public Criteria andLevel6NameLike(String value) {
            addCriterion("LEVEL6_NAME like", value, "level6Name");
            return (Criteria) this;
        }

        public Criteria andLevel6NameNotLike(String value) {
            addCriterion("LEVEL6_NAME not like", value, "level6Name");
            return (Criteria) this;
        }

        public Criteria andLevel6NameIn(List<String> values) {
            addCriterion("LEVEL6_NAME in", values, "level6Name");
            return (Criteria) this;
        }

        public Criteria andLevel6NameNotIn(List<String> values) {
            addCriterion("LEVEL6_NAME not in", values, "level6Name");
            return (Criteria) this;
        }

        public Criteria andLevel6NameBetween(String value1, String value2) {
            addCriterion("LEVEL6_NAME between", value1, value2, "level6Name");
            return (Criteria) this;
        }

        public Criteria andLevel6NameNotBetween(String value1, String value2) {
            addCriterion("LEVEL6_NAME not between", value1, value2, "level6Name");
            return (Criteria) this;
        }

        public Criteria andLevel7NameIsNull() {
            addCriterion("LEVEL7_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLevel7NameIsNotNull() {
            addCriterion("LEVEL7_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLevel7NameEqualTo(String value) {
            addCriterion("LEVEL7_NAME =", value, "level7Name");
            return (Criteria) this;
        }

        public Criteria andLevel7NameNotEqualTo(String value) {
            addCriterion("LEVEL7_NAME <>", value, "level7Name");
            return (Criteria) this;
        }

        public Criteria andLevel7NameGreaterThan(String value) {
            addCriterion("LEVEL7_NAME >", value, "level7Name");
            return (Criteria) this;
        }

        public Criteria andLevel7NameGreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL7_NAME >=", value, "level7Name");
            return (Criteria) this;
        }

        public Criteria andLevel7NameLessThan(String value) {
            addCriterion("LEVEL7_NAME <", value, "level7Name");
            return (Criteria) this;
        }

        public Criteria andLevel7NameLessThanOrEqualTo(String value) {
            addCriterion("LEVEL7_NAME <=", value, "level7Name");
            return (Criteria) this;
        }

        public Criteria andLevel7NameLike(String value) {
            addCriterion("LEVEL7_NAME like", value, "level7Name");
            return (Criteria) this;
        }

        public Criteria andLevel7NameNotLike(String value) {
            addCriterion("LEVEL7_NAME not like", value, "level7Name");
            return (Criteria) this;
        }

        public Criteria andLevel7NameIn(List<String> values) {
            addCriterion("LEVEL7_NAME in", values, "level7Name");
            return (Criteria) this;
        }

        public Criteria andLevel7NameNotIn(List<String> values) {
            addCriterion("LEVEL7_NAME not in", values, "level7Name");
            return (Criteria) this;
        }

        public Criteria andLevel7NameBetween(String value1, String value2) {
            addCriterion("LEVEL7_NAME between", value1, value2, "level7Name");
            return (Criteria) this;
        }

        public Criteria andLevel7NameNotBetween(String value1, String value2) {
            addCriterion("LEVEL7_NAME not between", value1, value2, "level7Name");
            return (Criteria) this;
        }

        public Criteria andLevel8NameIsNull() {
            addCriterion("LEVEL8_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLevel8NameIsNotNull() {
            addCriterion("LEVEL8_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLevel8NameEqualTo(String value) {
            addCriterion("LEVEL8_NAME =", value, "level8Name");
            return (Criteria) this;
        }

        public Criteria andLevel8NameNotEqualTo(String value) {
            addCriterion("LEVEL8_NAME <>", value, "level8Name");
            return (Criteria) this;
        }

        public Criteria andLevel8NameGreaterThan(String value) {
            addCriterion("LEVEL8_NAME >", value, "level8Name");
            return (Criteria) this;
        }

        public Criteria andLevel8NameGreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL8_NAME >=", value, "level8Name");
            return (Criteria) this;
        }

        public Criteria andLevel8NameLessThan(String value) {
            addCriterion("LEVEL8_NAME <", value, "level8Name");
            return (Criteria) this;
        }

        public Criteria andLevel8NameLessThanOrEqualTo(String value) {
            addCriterion("LEVEL8_NAME <=", value, "level8Name");
            return (Criteria) this;
        }

        public Criteria andLevel8NameLike(String value) {
            addCriterion("LEVEL8_NAME like", value, "level8Name");
            return (Criteria) this;
        }

        public Criteria andLevel8NameNotLike(String value) {
            addCriterion("LEVEL8_NAME not like", value, "level8Name");
            return (Criteria) this;
        }

        public Criteria andLevel8NameIn(List<String> values) {
            addCriterion("LEVEL8_NAME in", values, "level8Name");
            return (Criteria) this;
        }

        public Criteria andLevel8NameNotIn(List<String> values) {
            addCriterion("LEVEL8_NAME not in", values, "level8Name");
            return (Criteria) this;
        }

        public Criteria andLevel8NameBetween(String value1, String value2) {
            addCriterion("LEVEL8_NAME between", value1, value2, "level8Name");
            return (Criteria) this;
        }

        public Criteria andLevel8NameNotBetween(String value1, String value2) {
            addCriterion("LEVEL8_NAME not between", value1, value2, "level8Name");
            return (Criteria) this;
        }

        public Criteria andLevel9NameIsNull() {
            addCriterion("LEVEL9_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLevel9NameIsNotNull() {
            addCriterion("LEVEL9_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLevel9NameEqualTo(String value) {
            addCriterion("LEVEL9_NAME =", value, "level9Name");
            return (Criteria) this;
        }

        public Criteria andLevel9NameNotEqualTo(String value) {
            addCriterion("LEVEL9_NAME <>", value, "level9Name");
            return (Criteria) this;
        }

        public Criteria andLevel9NameGreaterThan(String value) {
            addCriterion("LEVEL9_NAME >", value, "level9Name");
            return (Criteria) this;
        }

        public Criteria andLevel9NameGreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL9_NAME >=", value, "level9Name");
            return (Criteria) this;
        }

        public Criteria andLevel9NameLessThan(String value) {
            addCriterion("LEVEL9_NAME <", value, "level9Name");
            return (Criteria) this;
        }

        public Criteria andLevel9NameLessThanOrEqualTo(String value) {
            addCriterion("LEVEL9_NAME <=", value, "level9Name");
            return (Criteria) this;
        }

        public Criteria andLevel9NameLike(String value) {
            addCriterion("LEVEL9_NAME like", value, "level9Name");
            return (Criteria) this;
        }

        public Criteria andLevel9NameNotLike(String value) {
            addCriterion("LEVEL9_NAME not like", value, "level9Name");
            return (Criteria) this;
        }

        public Criteria andLevel9NameIn(List<String> values) {
            addCriterion("LEVEL9_NAME in", values, "level9Name");
            return (Criteria) this;
        }

        public Criteria andLevel9NameNotIn(List<String> values) {
            addCriterion("LEVEL9_NAME not in", values, "level9Name");
            return (Criteria) this;
        }

        public Criteria andLevel9NameBetween(String value1, String value2) {
            addCriterion("LEVEL9_NAME between", value1, value2, "level9Name");
            return (Criteria) this;
        }

        public Criteria andLevel9NameNotBetween(String value1, String value2) {
            addCriterion("LEVEL9_NAME not between", value1, value2, "level9Name");
            return (Criteria) this;
        }

        public Criteria andLevel10NameIsNull() {
            addCriterion("LEVEL10_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLevel10NameIsNotNull() {
            addCriterion("LEVEL10_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLevel10NameEqualTo(String value) {
            addCriterion("LEVEL10_NAME =", value, "level10Name");
            return (Criteria) this;
        }

        public Criteria andLevel10NameNotEqualTo(String value) {
            addCriterion("LEVEL10_NAME <>", value, "level10Name");
            return (Criteria) this;
        }

        public Criteria andLevel10NameGreaterThan(String value) {
            addCriterion("LEVEL10_NAME >", value, "level10Name");
            return (Criteria) this;
        }

        public Criteria andLevel10NameGreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL10_NAME >=", value, "level10Name");
            return (Criteria) this;
        }

        public Criteria andLevel10NameLessThan(String value) {
            addCriterion("LEVEL10_NAME <", value, "level10Name");
            return (Criteria) this;
        }

        public Criteria andLevel10NameLessThanOrEqualTo(String value) {
            addCriterion("LEVEL10_NAME <=", value, "level10Name");
            return (Criteria) this;
        }

        public Criteria andLevel10NameLike(String value) {
            addCriterion("LEVEL10_NAME like", value, "level10Name");
            return (Criteria) this;
        }

        public Criteria andLevel10NameNotLike(String value) {
            addCriterion("LEVEL10_NAME not like", value, "level10Name");
            return (Criteria) this;
        }

        public Criteria andLevel10NameIn(List<String> values) {
            addCriterion("LEVEL10_NAME in", values, "level10Name");
            return (Criteria) this;
        }

        public Criteria andLevel10NameNotIn(List<String> values) {
            addCriterion("LEVEL10_NAME not in", values, "level10Name");
            return (Criteria) this;
        }

        public Criteria andLevel10NameBetween(String value1, String value2) {
            addCriterion("LEVEL10_NAME between", value1, value2, "level10Name");
            return (Criteria) this;
        }

        public Criteria andLevel10NameNotBetween(String value1, String value2) {
            addCriterion("LEVEL10_NAME not between", value1, value2, "level10Name");
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