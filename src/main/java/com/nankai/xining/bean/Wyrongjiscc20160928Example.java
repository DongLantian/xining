package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class Wyrongjiscc20160928Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Wyrongjiscc20160928Example() {
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

        public Criteria andEpaSccIsNull() {
            addCriterion("epa-scc is null");
            return (Criteria) this;
        }

        public Criteria andEpaSccIsNotNull() {
            addCriterion("epa-scc is not null");
            return (Criteria) this;
        }

        public Criteria andEpaSccEqualTo(String value) {
            addCriterion("epa-scc =", value, "epaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccNotEqualTo(String value) {
            addCriterion("epa-scc <>", value, "epaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccGreaterThan(String value) {
            addCriterion("epa-scc >", value, "epaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccGreaterThanOrEqualTo(String value) {
            addCriterion("epa-scc >=", value, "epaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccLessThan(String value) {
            addCriterion("epa-scc <", value, "epaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccLessThanOrEqualTo(String value) {
            addCriterion("epa-scc <=", value, "epaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccLike(String value) {
            addCriterion("epa-scc like", value, "epaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccNotLike(String value) {
            addCriterion("epa-scc not like", value, "epaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccIn(List<String> values) {
            addCriterion("epa-scc in", values, "epaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccNotIn(List<String> values) {
            addCriterion("epa-scc not in", values, "epaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccBetween(String value1, String value2) {
            addCriterion("epa-scc between", value1, value2, "epaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccNotBetween(String value1, String value2) {
            addCriterion("epa-scc not between", value1, value2, "epaScc");
            return (Criteria) this;
        }

        public Criteria andScc1IsNull() {
            addCriterion("scc1 is null");
            return (Criteria) this;
        }

        public Criteria andScc1IsNotNull() {
            addCriterion("scc1 is not null");
            return (Criteria) this;
        }

        public Criteria andScc1EqualTo(String value) {
            addCriterion("scc1 =", value, "scc1");
            return (Criteria) this;
        }

        public Criteria andScc1NotEqualTo(String value) {
            addCriterion("scc1 <>", value, "scc1");
            return (Criteria) this;
        }

        public Criteria andScc1GreaterThan(String value) {
            addCriterion("scc1 >", value, "scc1");
            return (Criteria) this;
        }

        public Criteria andScc1GreaterThanOrEqualTo(String value) {
            addCriterion("scc1 >=", value, "scc1");
            return (Criteria) this;
        }

        public Criteria andScc1LessThan(String value) {
            addCriterion("scc1 <", value, "scc1");
            return (Criteria) this;
        }

        public Criteria andScc1LessThanOrEqualTo(String value) {
            addCriterion("scc1 <=", value, "scc1");
            return (Criteria) this;
        }

        public Criteria andScc1Like(String value) {
            addCriterion("scc1 like", value, "scc1");
            return (Criteria) this;
        }

        public Criteria andScc1NotLike(String value) {
            addCriterion("scc1 not like", value, "scc1");
            return (Criteria) this;
        }

        public Criteria andScc1In(List<String> values) {
            addCriterion("scc1 in", values, "scc1");
            return (Criteria) this;
        }

        public Criteria andScc1NotIn(List<String> values) {
            addCriterion("scc1 not in", values, "scc1");
            return (Criteria) this;
        }

        public Criteria andScc1Between(String value1, String value2) {
            addCriterion("scc1 between", value1, value2, "scc1");
            return (Criteria) this;
        }

        public Criteria andScc1NotBetween(String value1, String value2) {
            addCriterion("scc1 not between", value1, value2, "scc1");
            return (Criteria) this;
        }

        public Criteria andScc1desIsNull() {
            addCriterion("scc1des is null");
            return (Criteria) this;
        }

        public Criteria andScc1desIsNotNull() {
            addCriterion("scc1des is not null");
            return (Criteria) this;
        }

        public Criteria andScc1desEqualTo(String value) {
            addCriterion("scc1des =", value, "scc1des");
            return (Criteria) this;
        }

        public Criteria andScc1desNotEqualTo(String value) {
            addCriterion("scc1des <>", value, "scc1des");
            return (Criteria) this;
        }

        public Criteria andScc1desGreaterThan(String value) {
            addCriterion("scc1des >", value, "scc1des");
            return (Criteria) this;
        }

        public Criteria andScc1desGreaterThanOrEqualTo(String value) {
            addCriterion("scc1des >=", value, "scc1des");
            return (Criteria) this;
        }

        public Criteria andScc1desLessThan(String value) {
            addCriterion("scc1des <", value, "scc1des");
            return (Criteria) this;
        }

        public Criteria andScc1desLessThanOrEqualTo(String value) {
            addCriterion("scc1des <=", value, "scc1des");
            return (Criteria) this;
        }

        public Criteria andScc1desLike(String value) {
            addCriterion("scc1des like", value, "scc1des");
            return (Criteria) this;
        }

        public Criteria andScc1desNotLike(String value) {
            addCriterion("scc1des not like", value, "scc1des");
            return (Criteria) this;
        }

        public Criteria andScc1desIn(List<String> values) {
            addCriterion("scc1des in", values, "scc1des");
            return (Criteria) this;
        }

        public Criteria andScc1desNotIn(List<String> values) {
            addCriterion("scc1des not in", values, "scc1des");
            return (Criteria) this;
        }

        public Criteria andScc1desBetween(String value1, String value2) {
            addCriterion("scc1des between", value1, value2, "scc1des");
            return (Criteria) this;
        }

        public Criteria andScc1desNotBetween(String value1, String value2) {
            addCriterion("scc1des not between", value1, value2, "scc1des");
            return (Criteria) this;
        }

        public Criteria andScc2IsNull() {
            addCriterion("scc2 is null");
            return (Criteria) this;
        }

        public Criteria andScc2IsNotNull() {
            addCriterion("scc2 is not null");
            return (Criteria) this;
        }

        public Criteria andScc2EqualTo(String value) {
            addCriterion("scc2 =", value, "scc2");
            return (Criteria) this;
        }

        public Criteria andScc2NotEqualTo(String value) {
            addCriterion("scc2 <>", value, "scc2");
            return (Criteria) this;
        }

        public Criteria andScc2GreaterThan(String value) {
            addCriterion("scc2 >", value, "scc2");
            return (Criteria) this;
        }

        public Criteria andScc2GreaterThanOrEqualTo(String value) {
            addCriterion("scc2 >=", value, "scc2");
            return (Criteria) this;
        }

        public Criteria andScc2LessThan(String value) {
            addCriterion("scc2 <", value, "scc2");
            return (Criteria) this;
        }

        public Criteria andScc2LessThanOrEqualTo(String value) {
            addCriterion("scc2 <=", value, "scc2");
            return (Criteria) this;
        }

        public Criteria andScc2Like(String value) {
            addCriterion("scc2 like", value, "scc2");
            return (Criteria) this;
        }

        public Criteria andScc2NotLike(String value) {
            addCriterion("scc2 not like", value, "scc2");
            return (Criteria) this;
        }

        public Criteria andScc2In(List<String> values) {
            addCriterion("scc2 in", values, "scc2");
            return (Criteria) this;
        }

        public Criteria andScc2NotIn(List<String> values) {
            addCriterion("scc2 not in", values, "scc2");
            return (Criteria) this;
        }

        public Criteria andScc2Between(String value1, String value2) {
            addCriterion("scc2 between", value1, value2, "scc2");
            return (Criteria) this;
        }

        public Criteria andScc2NotBetween(String value1, String value2) {
            addCriterion("scc2 not between", value1, value2, "scc2");
            return (Criteria) this;
        }

        public Criteria andScc2desIsNull() {
            addCriterion("scc2des is null");
            return (Criteria) this;
        }

        public Criteria andScc2desIsNotNull() {
            addCriterion("scc2des is not null");
            return (Criteria) this;
        }

        public Criteria andScc2desEqualTo(String value) {
            addCriterion("scc2des =", value, "scc2des");
            return (Criteria) this;
        }

        public Criteria andScc2desNotEqualTo(String value) {
            addCriterion("scc2des <>", value, "scc2des");
            return (Criteria) this;
        }

        public Criteria andScc2desGreaterThan(String value) {
            addCriterion("scc2des >", value, "scc2des");
            return (Criteria) this;
        }

        public Criteria andScc2desGreaterThanOrEqualTo(String value) {
            addCriterion("scc2des >=", value, "scc2des");
            return (Criteria) this;
        }

        public Criteria andScc2desLessThan(String value) {
            addCriterion("scc2des <", value, "scc2des");
            return (Criteria) this;
        }

        public Criteria andScc2desLessThanOrEqualTo(String value) {
            addCriterion("scc2des <=", value, "scc2des");
            return (Criteria) this;
        }

        public Criteria andScc2desLike(String value) {
            addCriterion("scc2des like", value, "scc2des");
            return (Criteria) this;
        }

        public Criteria andScc2desNotLike(String value) {
            addCriterion("scc2des not like", value, "scc2des");
            return (Criteria) this;
        }

        public Criteria andScc2desIn(List<String> values) {
            addCriterion("scc2des in", values, "scc2des");
            return (Criteria) this;
        }

        public Criteria andScc2desNotIn(List<String> values) {
            addCriterion("scc2des not in", values, "scc2des");
            return (Criteria) this;
        }

        public Criteria andScc2desBetween(String value1, String value2) {
            addCriterion("scc2des between", value1, value2, "scc2des");
            return (Criteria) this;
        }

        public Criteria andScc2desNotBetween(String value1, String value2) {
            addCriterion("scc2des not between", value1, value2, "scc2des");
            return (Criteria) this;
        }

        public Criteria andScc3IsNull() {
            addCriterion("scc3 is null");
            return (Criteria) this;
        }

        public Criteria andScc3IsNotNull() {
            addCriterion("scc3 is not null");
            return (Criteria) this;
        }

        public Criteria andScc3EqualTo(String value) {
            addCriterion("scc3 =", value, "scc3");
            return (Criteria) this;
        }

        public Criteria andScc3NotEqualTo(String value) {
            addCriterion("scc3 <>", value, "scc3");
            return (Criteria) this;
        }

        public Criteria andScc3GreaterThan(String value) {
            addCriterion("scc3 >", value, "scc3");
            return (Criteria) this;
        }

        public Criteria andScc3GreaterThanOrEqualTo(String value) {
            addCriterion("scc3 >=", value, "scc3");
            return (Criteria) this;
        }

        public Criteria andScc3LessThan(String value) {
            addCriterion("scc3 <", value, "scc3");
            return (Criteria) this;
        }

        public Criteria andScc3LessThanOrEqualTo(String value) {
            addCriterion("scc3 <=", value, "scc3");
            return (Criteria) this;
        }

        public Criteria andScc3Like(String value) {
            addCriterion("scc3 like", value, "scc3");
            return (Criteria) this;
        }

        public Criteria andScc3NotLike(String value) {
            addCriterion("scc3 not like", value, "scc3");
            return (Criteria) this;
        }

        public Criteria andScc3In(List<String> values) {
            addCriterion("scc3 in", values, "scc3");
            return (Criteria) this;
        }

        public Criteria andScc3NotIn(List<String> values) {
            addCriterion("scc3 not in", values, "scc3");
            return (Criteria) this;
        }

        public Criteria andScc3Between(String value1, String value2) {
            addCriterion("scc3 between", value1, value2, "scc3");
            return (Criteria) this;
        }

        public Criteria andScc3NotBetween(String value1, String value2) {
            addCriterion("scc3 not between", value1, value2, "scc3");
            return (Criteria) this;
        }

        public Criteria andScc3desIsNull() {
            addCriterion("scc3des is null");
            return (Criteria) this;
        }

        public Criteria andScc3desIsNotNull() {
            addCriterion("scc3des is not null");
            return (Criteria) this;
        }

        public Criteria andScc3desEqualTo(String value) {
            addCriterion("scc3des =", value, "scc3des");
            return (Criteria) this;
        }

        public Criteria andScc3desNotEqualTo(String value) {
            addCriterion("scc3des <>", value, "scc3des");
            return (Criteria) this;
        }

        public Criteria andScc3desGreaterThan(String value) {
            addCriterion("scc3des >", value, "scc3des");
            return (Criteria) this;
        }

        public Criteria andScc3desGreaterThanOrEqualTo(String value) {
            addCriterion("scc3des >=", value, "scc3des");
            return (Criteria) this;
        }

        public Criteria andScc3desLessThan(String value) {
            addCriterion("scc3des <", value, "scc3des");
            return (Criteria) this;
        }

        public Criteria andScc3desLessThanOrEqualTo(String value) {
            addCriterion("scc3des <=", value, "scc3des");
            return (Criteria) this;
        }

        public Criteria andScc3desLike(String value) {
            addCriterion("scc3des like", value, "scc3des");
            return (Criteria) this;
        }

        public Criteria andScc3desNotLike(String value) {
            addCriterion("scc3des not like", value, "scc3des");
            return (Criteria) this;
        }

        public Criteria andScc3desIn(List<String> values) {
            addCriterion("scc3des in", values, "scc3des");
            return (Criteria) this;
        }

        public Criteria andScc3desNotIn(List<String> values) {
            addCriterion("scc3des not in", values, "scc3des");
            return (Criteria) this;
        }

        public Criteria andScc3desBetween(String value1, String value2) {
            addCriterion("scc3des between", value1, value2, "scc3des");
            return (Criteria) this;
        }

        public Criteria andScc3desNotBetween(String value1, String value2) {
            addCriterion("scc3des not between", value1, value2, "scc3des");
            return (Criteria) this;
        }

        public Criteria andScc4IsNull() {
            addCriterion("scc4 is null");
            return (Criteria) this;
        }

        public Criteria andScc4IsNotNull() {
            addCriterion("scc4 is not null");
            return (Criteria) this;
        }

        public Criteria andScc4EqualTo(String value) {
            addCriterion("scc4 =", value, "scc4");
            return (Criteria) this;
        }

        public Criteria andScc4NotEqualTo(String value) {
            addCriterion("scc4 <>", value, "scc4");
            return (Criteria) this;
        }

        public Criteria andScc4GreaterThan(String value) {
            addCriterion("scc4 >", value, "scc4");
            return (Criteria) this;
        }

        public Criteria andScc4GreaterThanOrEqualTo(String value) {
            addCriterion("scc4 >=", value, "scc4");
            return (Criteria) this;
        }

        public Criteria andScc4LessThan(String value) {
            addCriterion("scc4 <", value, "scc4");
            return (Criteria) this;
        }

        public Criteria andScc4LessThanOrEqualTo(String value) {
            addCriterion("scc4 <=", value, "scc4");
            return (Criteria) this;
        }

        public Criteria andScc4Like(String value) {
            addCriterion("scc4 like", value, "scc4");
            return (Criteria) this;
        }

        public Criteria andScc4NotLike(String value) {
            addCriterion("scc4 not like", value, "scc4");
            return (Criteria) this;
        }

        public Criteria andScc4In(List<String> values) {
            addCriterion("scc4 in", values, "scc4");
            return (Criteria) this;
        }

        public Criteria andScc4NotIn(List<String> values) {
            addCriterion("scc4 not in", values, "scc4");
            return (Criteria) this;
        }

        public Criteria andScc4Between(String value1, String value2) {
            addCriterion("scc4 between", value1, value2, "scc4");
            return (Criteria) this;
        }

        public Criteria andScc4NotBetween(String value1, String value2) {
            addCriterion("scc4 not between", value1, value2, "scc4");
            return (Criteria) this;
        }

        public Criteria andScc4desIsNull() {
            addCriterion("scc4des is null");
            return (Criteria) this;
        }

        public Criteria andScc4desIsNotNull() {
            addCriterion("scc4des is not null");
            return (Criteria) this;
        }

        public Criteria andScc4desEqualTo(String value) {
            addCriterion("scc4des =", value, "scc4des");
            return (Criteria) this;
        }

        public Criteria andScc4desNotEqualTo(String value) {
            addCriterion("scc4des <>", value, "scc4des");
            return (Criteria) this;
        }

        public Criteria andScc4desGreaterThan(String value) {
            addCriterion("scc4des >", value, "scc4des");
            return (Criteria) this;
        }

        public Criteria andScc4desGreaterThanOrEqualTo(String value) {
            addCriterion("scc4des >=", value, "scc4des");
            return (Criteria) this;
        }

        public Criteria andScc4desLessThan(String value) {
            addCriterion("scc4des <", value, "scc4des");
            return (Criteria) this;
        }

        public Criteria andScc4desLessThanOrEqualTo(String value) {
            addCriterion("scc4des <=", value, "scc4des");
            return (Criteria) this;
        }

        public Criteria andScc4desLike(String value) {
            addCriterion("scc4des like", value, "scc4des");
            return (Criteria) this;
        }

        public Criteria andScc4desNotLike(String value) {
            addCriterion("scc4des not like", value, "scc4des");
            return (Criteria) this;
        }

        public Criteria andScc4desIn(List<String> values) {
            addCriterion("scc4des in", values, "scc4des");
            return (Criteria) this;
        }

        public Criteria andScc4desNotIn(List<String> values) {
            addCriterion("scc4des not in", values, "scc4des");
            return (Criteria) this;
        }

        public Criteria andScc4desBetween(String value1, String value2) {
            addCriterion("scc4des between", value1, value2, "scc4des");
            return (Criteria) this;
        }

        public Criteria andScc4desNotBetween(String value1, String value2) {
            addCriterion("scc4des not between", value1, value2, "scc4des");
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