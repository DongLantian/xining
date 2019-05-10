package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class RongjiRawExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RongjiRawExample() {
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

        public Criteria andNkNoIsNull() {
            addCriterion("nk_no is null");
            return (Criteria) this;
        }

        public Criteria andNkNoIsNotNull() {
            addCriterion("nk_no is not null");
            return (Criteria) this;
        }

        public Criteria andNkNoEqualTo(Integer value) {
            addCriterion("nk_no =", value, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoNotEqualTo(Integer value) {
            addCriterion("nk_no <>", value, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoGreaterThan(Integer value) {
            addCriterion("nk_no >", value, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("nk_no >=", value, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoLessThan(Integer value) {
            addCriterion("nk_no <", value, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoLessThanOrEqualTo(Integer value) {
            addCriterion("nk_no <=", value, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoIn(List<Integer> values) {
            addCriterion("nk_no in", values, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoNotIn(List<Integer> values) {
            addCriterion("nk_no not in", values, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoBetween(Integer value1, Integer value2) {
            addCriterion("nk_no between", value1, value2, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoNotBetween(Integer value1, Integer value2) {
            addCriterion("nk_no not between", value1, value2, "nkNo");
            return (Criteria) this;
        }

        public Criteria andMnameIsNull() {
            addCriterion("mname is null");
            return (Criteria) this;
        }

        public Criteria andMnameIsNotNull() {
            addCriterion("mname is not null");
            return (Criteria) this;
        }

        public Criteria andMnameEqualTo(String value) {
            addCriterion("mname =", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotEqualTo(String value) {
            addCriterion("mname <>", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThan(String value) {
            addCriterion("mname >", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThanOrEqualTo(String value) {
            addCriterion("mname >=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThan(String value) {
            addCriterion("mname <", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThanOrEqualTo(String value) {
            addCriterion("mname <=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLike(String value) {
            addCriterion("mname like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotLike(String value) {
            addCriterion("mname not like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameIn(List<String> values) {
            addCriterion("mname in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotIn(List<String> values) {
            addCriterion("mname not in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameBetween(String value1, String value2) {
            addCriterion("mname between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotBetween(String value1, String value2) {
            addCriterion("mname not between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andMusageIsNull() {
            addCriterion("musage is null");
            return (Criteria) this;
        }

        public Criteria andMusageIsNotNull() {
            addCriterion("musage is not null");
            return (Criteria) this;
        }

        public Criteria andMusageEqualTo(Double value) {
            addCriterion("musage =", value, "musage");
            return (Criteria) this;
        }

        public Criteria andMusageNotEqualTo(Double value) {
            addCriterion("musage <>", value, "musage");
            return (Criteria) this;
        }

        public Criteria andMusageGreaterThan(Double value) {
            addCriterion("musage >", value, "musage");
            return (Criteria) this;
        }

        public Criteria andMusageGreaterThanOrEqualTo(Double value) {
            addCriterion("musage >=", value, "musage");
            return (Criteria) this;
        }

        public Criteria andMusageLessThan(Double value) {
            addCriterion("musage <", value, "musage");
            return (Criteria) this;
        }

        public Criteria andMusageLessThanOrEqualTo(Double value) {
            addCriterion("musage <=", value, "musage");
            return (Criteria) this;
        }

        public Criteria andMusageIn(List<Double> values) {
            addCriterion("musage in", values, "musage");
            return (Criteria) this;
        }

        public Criteria andMusageNotIn(List<Double> values) {
            addCriterion("musage not in", values, "musage");
            return (Criteria) this;
        }

        public Criteria andMusageBetween(Double value1, Double value2) {
            addCriterion("musage between", value1, value2, "musage");
            return (Criteria) this;
        }

        public Criteria andMusageNotBetween(Double value1, Double value2) {
            addCriterion("musage not between", value1, value2, "musage");
            return (Criteria) this;
        }

        public Criteria andScc2DecIsNull() {
            addCriterion("scc2_dec is null");
            return (Criteria) this;
        }

        public Criteria andScc2DecIsNotNull() {
            addCriterion("scc2_dec is not null");
            return (Criteria) this;
        }

        public Criteria andScc2DecEqualTo(String value) {
            addCriterion("scc2_dec =", value, "scc2Dec");
            return (Criteria) this;
        }

        public Criteria andScc2DecNotEqualTo(String value) {
            addCriterion("scc2_dec <>", value, "scc2Dec");
            return (Criteria) this;
        }

        public Criteria andScc2DecGreaterThan(String value) {
            addCriterion("scc2_dec >", value, "scc2Dec");
            return (Criteria) this;
        }

        public Criteria andScc2DecGreaterThanOrEqualTo(String value) {
            addCriterion("scc2_dec >=", value, "scc2Dec");
            return (Criteria) this;
        }

        public Criteria andScc2DecLessThan(String value) {
            addCriterion("scc2_dec <", value, "scc2Dec");
            return (Criteria) this;
        }

        public Criteria andScc2DecLessThanOrEqualTo(String value) {
            addCriterion("scc2_dec <=", value, "scc2Dec");
            return (Criteria) this;
        }

        public Criteria andScc2DecLike(String value) {
            addCriterion("scc2_dec like", value, "scc2Dec");
            return (Criteria) this;
        }

        public Criteria andScc2DecNotLike(String value) {
            addCriterion("scc2_dec not like", value, "scc2Dec");
            return (Criteria) this;
        }

        public Criteria andScc2DecIn(List<String> values) {
            addCriterion("scc2_dec in", values, "scc2Dec");
            return (Criteria) this;
        }

        public Criteria andScc2DecNotIn(List<String> values) {
            addCriterion("scc2_dec not in", values, "scc2Dec");
            return (Criteria) this;
        }

        public Criteria andScc2DecBetween(String value1, String value2) {
            addCriterion("scc2_dec between", value1, value2, "scc2Dec");
            return (Criteria) this;
        }

        public Criteria andScc2DecNotBetween(String value1, String value2) {
            addCriterion("scc2_dec not between", value1, value2, "scc2Dec");
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

        public Criteria andScc4DecIsNull() {
            addCriterion("scc4_dec is null");
            return (Criteria) this;
        }

        public Criteria andScc4DecIsNotNull() {
            addCriterion("scc4_dec is not null");
            return (Criteria) this;
        }

        public Criteria andScc4DecEqualTo(String value) {
            addCriterion("scc4_dec =", value, "scc4Dec");
            return (Criteria) this;
        }

        public Criteria andScc4DecNotEqualTo(String value) {
            addCriterion("scc4_dec <>", value, "scc4Dec");
            return (Criteria) this;
        }

        public Criteria andScc4DecGreaterThan(String value) {
            addCriterion("scc4_dec >", value, "scc4Dec");
            return (Criteria) this;
        }

        public Criteria andScc4DecGreaterThanOrEqualTo(String value) {
            addCriterion("scc4_dec >=", value, "scc4Dec");
            return (Criteria) this;
        }

        public Criteria andScc4DecLessThan(String value) {
            addCriterion("scc4_dec <", value, "scc4Dec");
            return (Criteria) this;
        }

        public Criteria andScc4DecLessThanOrEqualTo(String value) {
            addCriterion("scc4_dec <=", value, "scc4Dec");
            return (Criteria) this;
        }

        public Criteria andScc4DecLike(String value) {
            addCriterion("scc4_dec like", value, "scc4Dec");
            return (Criteria) this;
        }

        public Criteria andScc4DecNotLike(String value) {
            addCriterion("scc4_dec not like", value, "scc4Dec");
            return (Criteria) this;
        }

        public Criteria andScc4DecIn(List<String> values) {
            addCriterion("scc4_dec in", values, "scc4Dec");
            return (Criteria) this;
        }

        public Criteria andScc4DecNotIn(List<String> values) {
            addCriterion("scc4_dec not in", values, "scc4Dec");
            return (Criteria) this;
        }

        public Criteria andScc4DecBetween(String value1, String value2) {
            addCriterion("scc4_dec between", value1, value2, "scc4Dec");
            return (Criteria) this;
        }

        public Criteria andScc4DecNotBetween(String value1, String value2) {
            addCriterion("scc4_dec not between", value1, value2, "scc4Dec");
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

        public Criteria andSccCodeIsNull() {
            addCriterion("scc_code is null");
            return (Criteria) this;
        }

        public Criteria andSccCodeIsNotNull() {
            addCriterion("scc_code is not null");
            return (Criteria) this;
        }

        public Criteria andSccCodeEqualTo(String value) {
            addCriterion("scc_code =", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeNotEqualTo(String value) {
            addCriterion("scc_code <>", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeGreaterThan(String value) {
            addCriterion("scc_code >", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeGreaterThanOrEqualTo(String value) {
            addCriterion("scc_code >=", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeLessThan(String value) {
            addCriterion("scc_code <", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeLessThanOrEqualTo(String value) {
            addCriterion("scc_code <=", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeLike(String value) {
            addCriterion("scc_code like", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeNotLike(String value) {
            addCriterion("scc_code not like", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeIn(List<String> values) {
            addCriterion("scc_code in", values, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeNotIn(List<String> values) {
            addCriterion("scc_code not in", values, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeBetween(String value1, String value2) {
            addCriterion("scc_code between", value1, value2, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeNotBetween(String value1, String value2) {
            addCriterion("scc_code not between", value1, value2, "sccCode");
            return (Criteria) this;
        }

        public Criteria andScc3DecIsNull() {
            addCriterion("scc3_dec is null");
            return (Criteria) this;
        }

        public Criteria andScc3DecIsNotNull() {
            addCriterion("scc3_dec is not null");
            return (Criteria) this;
        }

        public Criteria andScc3DecEqualTo(String value) {
            addCriterion("scc3_dec =", value, "scc3Dec");
            return (Criteria) this;
        }

        public Criteria andScc3DecNotEqualTo(String value) {
            addCriterion("scc3_dec <>", value, "scc3Dec");
            return (Criteria) this;
        }

        public Criteria andScc3DecGreaterThan(String value) {
            addCriterion("scc3_dec >", value, "scc3Dec");
            return (Criteria) this;
        }

        public Criteria andScc3DecGreaterThanOrEqualTo(String value) {
            addCriterion("scc3_dec >=", value, "scc3Dec");
            return (Criteria) this;
        }

        public Criteria andScc3DecLessThan(String value) {
            addCriterion("scc3_dec <", value, "scc3Dec");
            return (Criteria) this;
        }

        public Criteria andScc3DecLessThanOrEqualTo(String value) {
            addCriterion("scc3_dec <=", value, "scc3Dec");
            return (Criteria) this;
        }

        public Criteria andScc3DecLike(String value) {
            addCriterion("scc3_dec like", value, "scc3Dec");
            return (Criteria) this;
        }

        public Criteria andScc3DecNotLike(String value) {
            addCriterion("scc3_dec not like", value, "scc3Dec");
            return (Criteria) this;
        }

        public Criteria andScc3DecIn(List<String> values) {
            addCriterion("scc3_dec in", values, "scc3Dec");
            return (Criteria) this;
        }

        public Criteria andScc3DecNotIn(List<String> values) {
            addCriterion("scc3_dec not in", values, "scc3Dec");
            return (Criteria) this;
        }

        public Criteria andScc3DecBetween(String value1, String value2) {
            addCriterion("scc3_dec between", value1, value2, "scc3Dec");
            return (Criteria) this;
        }

        public Criteria andScc3DecNotBetween(String value1, String value2) {
            addCriterion("scc3_dec not between", value1, value2, "scc3Dec");
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

        public Criteria andDeviceNoIsNull() {
            addCriterion("device_no is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNoIsNotNull() {
            addCriterion("device_no is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNoEqualTo(String value) {
            addCriterion("device_no =", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoNotEqualTo(String value) {
            addCriterion("device_no <>", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoGreaterThan(String value) {
            addCriterion("device_no >", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoGreaterThanOrEqualTo(String value) {
            addCriterion("device_no >=", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoLessThan(String value) {
            addCriterion("device_no <", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoLessThanOrEqualTo(String value) {
            addCriterion("device_no <=", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoLike(String value) {
            addCriterion("device_no like", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoNotLike(String value) {
            addCriterion("device_no not like", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoIn(List<String> values) {
            addCriterion("device_no in", values, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoNotIn(List<String> values) {
            addCriterion("device_no not in", values, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoBetween(String value1, String value2) {
            addCriterion("device_no between", value1, value2, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoNotBetween(String value1, String value2) {
            addCriterion("device_no not between", value1, value2, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDevicetotalIdIsNull() {
            addCriterion("devicetotal_id is null");
            return (Criteria) this;
        }

        public Criteria andDevicetotalIdIsNotNull() {
            addCriterion("devicetotal_id is not null");
            return (Criteria) this;
        }

        public Criteria andDevicetotalIdEqualTo(Integer value) {
            addCriterion("devicetotal_id =", value, "devicetotalId");
            return (Criteria) this;
        }

        public Criteria andDevicetotalIdNotEqualTo(Integer value) {
            addCriterion("devicetotal_id <>", value, "devicetotalId");
            return (Criteria) this;
        }

        public Criteria andDevicetotalIdGreaterThan(Integer value) {
            addCriterion("devicetotal_id >", value, "devicetotalId");
            return (Criteria) this;
        }

        public Criteria andDevicetotalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("devicetotal_id >=", value, "devicetotalId");
            return (Criteria) this;
        }

        public Criteria andDevicetotalIdLessThan(Integer value) {
            addCriterion("devicetotal_id <", value, "devicetotalId");
            return (Criteria) this;
        }

        public Criteria andDevicetotalIdLessThanOrEqualTo(Integer value) {
            addCriterion("devicetotal_id <=", value, "devicetotalId");
            return (Criteria) this;
        }

        public Criteria andDevicetotalIdIn(List<Integer> values) {
            addCriterion("devicetotal_id in", values, "devicetotalId");
            return (Criteria) this;
        }

        public Criteria andDevicetotalIdNotIn(List<Integer> values) {
            addCriterion("devicetotal_id not in", values, "devicetotalId");
            return (Criteria) this;
        }

        public Criteria andDevicetotalIdBetween(Integer value1, Integer value2) {
            addCriterion("devicetotal_id between", value1, value2, "devicetotalId");
            return (Criteria) this;
        }

        public Criteria andDevicetotalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("devicetotal_id not between", value1, value2, "devicetotalId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNull() {
            addCriterion("device_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("device_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(String value) {
            addCriterion("device_id =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(String value) {
            addCriterion("device_id <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(String value) {
            addCriterion("device_id >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(String value) {
            addCriterion("device_id >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(String value) {
            addCriterion("device_id <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(String value) {
            addCriterion("device_id <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLike(String value) {
            addCriterion("device_id like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotLike(String value) {
            addCriterion("device_id not like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<String> values) {
            addCriterion("device_id in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<String> values) {
            addCriterion("device_id not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(String value1, String value2) {
            addCriterion("device_id between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(String value1, String value2) {
            addCriterion("device_id not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andFactorNoxIsNull() {
            addCriterion("factor_nox is null");
            return (Criteria) this;
        }

        public Criteria andFactorNoxIsNotNull() {
            addCriterion("factor_nox is not null");
            return (Criteria) this;
        }

        public Criteria andFactorNoxEqualTo(Double value) {
            addCriterion("factor_nox =", value, "factorNox");
            return (Criteria) this;
        }

        public Criteria andFactorNoxNotEqualTo(Double value) {
            addCriterion("factor_nox <>", value, "factorNox");
            return (Criteria) this;
        }

        public Criteria andFactorNoxGreaterThan(Double value) {
            addCriterion("factor_nox >", value, "factorNox");
            return (Criteria) this;
        }

        public Criteria andFactorNoxGreaterThanOrEqualTo(Double value) {
            addCriterion("factor_nox >=", value, "factorNox");
            return (Criteria) this;
        }

        public Criteria andFactorNoxLessThan(Double value) {
            addCriterion("factor_nox <", value, "factorNox");
            return (Criteria) this;
        }

        public Criteria andFactorNoxLessThanOrEqualTo(Double value) {
            addCriterion("factor_nox <=", value, "factorNox");
            return (Criteria) this;
        }

        public Criteria andFactorNoxIn(List<Double> values) {
            addCriterion("factor_nox in", values, "factorNox");
            return (Criteria) this;
        }

        public Criteria andFactorNoxNotIn(List<Double> values) {
            addCriterion("factor_nox not in", values, "factorNox");
            return (Criteria) this;
        }

        public Criteria andFactorNoxBetween(Double value1, Double value2) {
            addCriterion("factor_nox between", value1, value2, "factorNox");
            return (Criteria) this;
        }

        public Criteria andFactorNoxNotBetween(Double value1, Double value2) {
            addCriterion("factor_nox not between", value1, value2, "factorNox");
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

        public Criteria andFactorCoIsNull() {
            addCriterion("factor_co is null");
            return (Criteria) this;
        }

        public Criteria andFactorCoIsNotNull() {
            addCriterion("factor_co is not null");
            return (Criteria) this;
        }

        public Criteria andFactorCoEqualTo(Double value) {
            addCriterion("factor_co =", value, "factorCo");
            return (Criteria) this;
        }

        public Criteria andFactorCoNotEqualTo(Double value) {
            addCriterion("factor_co <>", value, "factorCo");
            return (Criteria) this;
        }

        public Criteria andFactorCoGreaterThan(Double value) {
            addCriterion("factor_co >", value, "factorCo");
            return (Criteria) this;
        }

        public Criteria andFactorCoGreaterThanOrEqualTo(Double value) {
            addCriterion("factor_co >=", value, "factorCo");
            return (Criteria) this;
        }

        public Criteria andFactorCoLessThan(Double value) {
            addCriterion("factor_co <", value, "factorCo");
            return (Criteria) this;
        }

        public Criteria andFactorCoLessThanOrEqualTo(Double value) {
            addCriterion("factor_co <=", value, "factorCo");
            return (Criteria) this;
        }

        public Criteria andFactorCoIn(List<Double> values) {
            addCriterion("factor_co in", values, "factorCo");
            return (Criteria) this;
        }

        public Criteria andFactorCoNotIn(List<Double> values) {
            addCriterion("factor_co not in", values, "factorCo");
            return (Criteria) this;
        }

        public Criteria andFactorCoBetween(Double value1, Double value2) {
            addCriterion("factor_co between", value1, value2, "factorCo");
            return (Criteria) this;
        }

        public Criteria andFactorCoNotBetween(Double value1, Double value2) {
            addCriterion("factor_co not between", value1, value2, "factorCo");
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

        public Criteria andFactorPm10IsNull() {
            addCriterion("factor_pm10 is null");
            return (Criteria) this;
        }

        public Criteria andFactorPm10IsNotNull() {
            addCriterion("factor_pm10 is not null");
            return (Criteria) this;
        }

        public Criteria andFactorPm10EqualTo(Double value) {
            addCriterion("factor_pm10 =", value, "factorPm10");
            return (Criteria) this;
        }

        public Criteria andFactorPm10NotEqualTo(Double value) {
            addCriterion("factor_pm10 <>", value, "factorPm10");
            return (Criteria) this;
        }

        public Criteria andFactorPm10GreaterThan(Double value) {
            addCriterion("factor_pm10 >", value, "factorPm10");
            return (Criteria) this;
        }

        public Criteria andFactorPm10GreaterThanOrEqualTo(Double value) {
            addCriterion("factor_pm10 >=", value, "factorPm10");
            return (Criteria) this;
        }

        public Criteria andFactorPm10LessThan(Double value) {
            addCriterion("factor_pm10 <", value, "factorPm10");
            return (Criteria) this;
        }

        public Criteria andFactorPm10LessThanOrEqualTo(Double value) {
            addCriterion("factor_pm10 <=", value, "factorPm10");
            return (Criteria) this;
        }

        public Criteria andFactorPm10In(List<Double> values) {
            addCriterion("factor_pm10 in", values, "factorPm10");
            return (Criteria) this;
        }

        public Criteria andFactorPm10NotIn(List<Double> values) {
            addCriterion("factor_pm10 not in", values, "factorPm10");
            return (Criteria) this;
        }

        public Criteria andFactorPm10Between(Double value1, Double value2) {
            addCriterion("factor_pm10 between", value1, value2, "factorPm10");
            return (Criteria) this;
        }

        public Criteria andFactorPm10NotBetween(Double value1, Double value2) {
            addCriterion("factor_pm10 not between", value1, value2, "factorPm10");
            return (Criteria) this;
        }

        public Criteria andFactorPmIsNull() {
            addCriterion("factor_pm is null");
            return (Criteria) this;
        }

        public Criteria andFactorPmIsNotNull() {
            addCriterion("factor_pm is not null");
            return (Criteria) this;
        }

        public Criteria andFactorPmEqualTo(Double value) {
            addCriterion("factor_pm =", value, "factorPm");
            return (Criteria) this;
        }

        public Criteria andFactorPmNotEqualTo(Double value) {
            addCriterion("factor_pm <>", value, "factorPm");
            return (Criteria) this;
        }

        public Criteria andFactorPmGreaterThan(Double value) {
            addCriterion("factor_pm >", value, "factorPm");
            return (Criteria) this;
        }

        public Criteria andFactorPmGreaterThanOrEqualTo(Double value) {
            addCriterion("factor_pm >=", value, "factorPm");
            return (Criteria) this;
        }

        public Criteria andFactorPmLessThan(Double value) {
            addCriterion("factor_pm <", value, "factorPm");
            return (Criteria) this;
        }

        public Criteria andFactorPmLessThanOrEqualTo(Double value) {
            addCriterion("factor_pm <=", value, "factorPm");
            return (Criteria) this;
        }

        public Criteria andFactorPmIn(List<Double> values) {
            addCriterion("factor_pm in", values, "factorPm");
            return (Criteria) this;
        }

        public Criteria andFactorPmNotIn(List<Double> values) {
            addCriterion("factor_pm not in", values, "factorPm");
            return (Criteria) this;
        }

        public Criteria andFactorPmBetween(Double value1, Double value2) {
            addCriterion("factor_pm between", value1, value2, "factorPm");
            return (Criteria) this;
        }

        public Criteria andFactorPmNotBetween(Double value1, Double value2) {
            addCriterion("factor_pm not between", value1, value2, "factorPm");
            return (Criteria) this;
        }

        public Criteria andFactorPm25IsNull() {
            addCriterion("factor_pm25 is null");
            return (Criteria) this;
        }

        public Criteria andFactorPm25IsNotNull() {
            addCriterion("factor_pm25 is not null");
            return (Criteria) this;
        }

        public Criteria andFactorPm25EqualTo(Double value) {
            addCriterion("factor_pm25 =", value, "factorPm25");
            return (Criteria) this;
        }

        public Criteria andFactorPm25NotEqualTo(Double value) {
            addCriterion("factor_pm25 <>", value, "factorPm25");
            return (Criteria) this;
        }

        public Criteria andFactorPm25GreaterThan(Double value) {
            addCriterion("factor_pm25 >", value, "factorPm25");
            return (Criteria) this;
        }

        public Criteria andFactorPm25GreaterThanOrEqualTo(Double value) {
            addCriterion("factor_pm25 >=", value, "factorPm25");
            return (Criteria) this;
        }

        public Criteria andFactorPm25LessThan(Double value) {
            addCriterion("factor_pm25 <", value, "factorPm25");
            return (Criteria) this;
        }

        public Criteria andFactorPm25LessThanOrEqualTo(Double value) {
            addCriterion("factor_pm25 <=", value, "factorPm25");
            return (Criteria) this;
        }

        public Criteria andFactorPm25In(List<Double> values) {
            addCriterion("factor_pm25 in", values, "factorPm25");
            return (Criteria) this;
        }

        public Criteria andFactorPm25NotIn(List<Double> values) {
            addCriterion("factor_pm25 not in", values, "factorPm25");
            return (Criteria) this;
        }

        public Criteria andFactorPm25Between(Double value1, Double value2) {
            addCriterion("factor_pm25 between", value1, value2, "factorPm25");
            return (Criteria) this;
        }

        public Criteria andFactorPm25NotBetween(Double value1, Double value2) {
            addCriterion("factor_pm25 not between", value1, value2, "factorPm25");
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

        public Criteria andFactorSo2IsNull() {
            addCriterion("factor_so2 is null");
            return (Criteria) this;
        }

        public Criteria andFactorSo2IsNotNull() {
            addCriterion("factor_so2 is not null");
            return (Criteria) this;
        }

        public Criteria andFactorSo2EqualTo(Double value) {
            addCriterion("factor_so2 =", value, "factorSo2");
            return (Criteria) this;
        }

        public Criteria andFactorSo2NotEqualTo(Double value) {
            addCriterion("factor_so2 <>", value, "factorSo2");
            return (Criteria) this;
        }

        public Criteria andFactorSo2GreaterThan(Double value) {
            addCriterion("factor_so2 >", value, "factorSo2");
            return (Criteria) this;
        }

        public Criteria andFactorSo2GreaterThanOrEqualTo(Double value) {
            addCriterion("factor_so2 >=", value, "factorSo2");
            return (Criteria) this;
        }

        public Criteria andFactorSo2LessThan(Double value) {
            addCriterion("factor_so2 <", value, "factorSo2");
            return (Criteria) this;
        }

        public Criteria andFactorSo2LessThanOrEqualTo(Double value) {
            addCriterion("factor_so2 <=", value, "factorSo2");
            return (Criteria) this;
        }

        public Criteria andFactorSo2In(List<Double> values) {
            addCriterion("factor_so2 in", values, "factorSo2");
            return (Criteria) this;
        }

        public Criteria andFactorSo2NotIn(List<Double> values) {
            addCriterion("factor_so2 not in", values, "factorSo2");
            return (Criteria) this;
        }

        public Criteria andFactorSo2Between(Double value1, Double value2) {
            addCriterion("factor_so2 between", value1, value2, "factorSo2");
            return (Criteria) this;
        }

        public Criteria andFactorSo2NotBetween(Double value1, Double value2) {
            addCriterion("factor_so2 not between", value1, value2, "factorSo2");
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

        public Criteria andFactorVocIsNull() {
            addCriterion("factor_voc is null");
            return (Criteria) this;
        }

        public Criteria andFactorVocIsNotNull() {
            addCriterion("factor_voc is not null");
            return (Criteria) this;
        }

        public Criteria andFactorVocEqualTo(Double value) {
            addCriterion("factor_voc =", value, "factorVoc");
            return (Criteria) this;
        }

        public Criteria andFactorVocNotEqualTo(Double value) {
            addCriterion("factor_voc <>", value, "factorVoc");
            return (Criteria) this;
        }

        public Criteria andFactorVocGreaterThan(Double value) {
            addCriterion("factor_voc >", value, "factorVoc");
            return (Criteria) this;
        }

        public Criteria andFactorVocGreaterThanOrEqualTo(Double value) {
            addCriterion("factor_voc >=", value, "factorVoc");
            return (Criteria) this;
        }

        public Criteria andFactorVocLessThan(Double value) {
            addCriterion("factor_voc <", value, "factorVoc");
            return (Criteria) this;
        }

        public Criteria andFactorVocLessThanOrEqualTo(Double value) {
            addCriterion("factor_voc <=", value, "factorVoc");
            return (Criteria) this;
        }

        public Criteria andFactorVocIn(List<Double> values) {
            addCriterion("factor_voc in", values, "factorVoc");
            return (Criteria) this;
        }

        public Criteria andFactorVocNotIn(List<Double> values) {
            addCriterion("factor_voc not in", values, "factorVoc");
            return (Criteria) this;
        }

        public Criteria andFactorVocBetween(Double value1, Double value2) {
            addCriterion("factor_voc between", value1, value2, "factorVoc");
            return (Criteria) this;
        }

        public Criteria andFactorVocNotBetween(Double value1, Double value2) {
            addCriterion("factor_voc not between", value1, value2, "factorVoc");
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

        public Criteria andFactorNh3IsNull() {
            addCriterion("factor_nh3 is null");
            return (Criteria) this;
        }

        public Criteria andFactorNh3IsNotNull() {
            addCriterion("factor_nh3 is not null");
            return (Criteria) this;
        }

        public Criteria andFactorNh3EqualTo(Double value) {
            addCriterion("factor_nh3 =", value, "factorNh3");
            return (Criteria) this;
        }

        public Criteria andFactorNh3NotEqualTo(Double value) {
            addCriterion("factor_nh3 <>", value, "factorNh3");
            return (Criteria) this;
        }

        public Criteria andFactorNh3GreaterThan(Double value) {
            addCriterion("factor_nh3 >", value, "factorNh3");
            return (Criteria) this;
        }

        public Criteria andFactorNh3GreaterThanOrEqualTo(Double value) {
            addCriterion("factor_nh3 >=", value, "factorNh3");
            return (Criteria) this;
        }

        public Criteria andFactorNh3LessThan(Double value) {
            addCriterion("factor_nh3 <", value, "factorNh3");
            return (Criteria) this;
        }

        public Criteria andFactorNh3LessThanOrEqualTo(Double value) {
            addCriterion("factor_nh3 <=", value, "factorNh3");
            return (Criteria) this;
        }

        public Criteria andFactorNh3In(List<Double> values) {
            addCriterion("factor_nh3 in", values, "factorNh3");
            return (Criteria) this;
        }

        public Criteria andFactorNh3NotIn(List<Double> values) {
            addCriterion("factor_nh3 not in", values, "factorNh3");
            return (Criteria) this;
        }

        public Criteria andFactorNh3Between(Double value1, Double value2) {
            addCriterion("factor_nh3 between", value1, value2, "factorNh3");
            return (Criteria) this;
        }

        public Criteria andFactorNh3NotBetween(Double value1, Double value2) {
            addCriterion("factor_nh3 not between", value1, value2, "factorNh3");
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

        public Criteria andFactorOcIsNull() {
            addCriterion("factor_oc is null");
            return (Criteria) this;
        }

        public Criteria andFactorOcIsNotNull() {
            addCriterion("factor_oc is not null");
            return (Criteria) this;
        }

        public Criteria andFactorOcEqualTo(Double value) {
            addCriterion("factor_oc =", value, "factorOc");
            return (Criteria) this;
        }

        public Criteria andFactorOcNotEqualTo(Double value) {
            addCriterion("factor_oc <>", value, "factorOc");
            return (Criteria) this;
        }

        public Criteria andFactorOcGreaterThan(Double value) {
            addCriterion("factor_oc >", value, "factorOc");
            return (Criteria) this;
        }

        public Criteria andFactorOcGreaterThanOrEqualTo(Double value) {
            addCriterion("factor_oc >=", value, "factorOc");
            return (Criteria) this;
        }

        public Criteria andFactorOcLessThan(Double value) {
            addCriterion("factor_oc <", value, "factorOc");
            return (Criteria) this;
        }

        public Criteria andFactorOcLessThanOrEqualTo(Double value) {
            addCriterion("factor_oc <=", value, "factorOc");
            return (Criteria) this;
        }

        public Criteria andFactorOcIn(List<Double> values) {
            addCriterion("factor_oc in", values, "factorOc");
            return (Criteria) this;
        }

        public Criteria andFactorOcNotIn(List<Double> values) {
            addCriterion("factor_oc not in", values, "factorOc");
            return (Criteria) this;
        }

        public Criteria andFactorOcBetween(Double value1, Double value2) {
            addCriterion("factor_oc between", value1, value2, "factorOc");
            return (Criteria) this;
        }

        public Criteria andFactorOcNotBetween(Double value1, Double value2) {
            addCriterion("factor_oc not between", value1, value2, "factorOc");
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

        public Criteria andFactorBcIsNull() {
            addCriterion("factor_bc is null");
            return (Criteria) this;
        }

        public Criteria andFactorBcIsNotNull() {
            addCriterion("factor_bc is not null");
            return (Criteria) this;
        }

        public Criteria andFactorBcEqualTo(Double value) {
            addCriterion("factor_bc =", value, "factorBc");
            return (Criteria) this;
        }

        public Criteria andFactorBcNotEqualTo(Double value) {
            addCriterion("factor_bc <>", value, "factorBc");
            return (Criteria) this;
        }

        public Criteria andFactorBcGreaterThan(Double value) {
            addCriterion("factor_bc >", value, "factorBc");
            return (Criteria) this;
        }

        public Criteria andFactorBcGreaterThanOrEqualTo(Double value) {
            addCriterion("factor_bc >=", value, "factorBc");
            return (Criteria) this;
        }

        public Criteria andFactorBcLessThan(Double value) {
            addCriterion("factor_bc <", value, "factorBc");
            return (Criteria) this;
        }

        public Criteria andFactorBcLessThanOrEqualTo(Double value) {
            addCriterion("factor_bc <=", value, "factorBc");
            return (Criteria) this;
        }

        public Criteria andFactorBcIn(List<Double> values) {
            addCriterion("factor_bc in", values, "factorBc");
            return (Criteria) this;
        }

        public Criteria andFactorBcNotIn(List<Double> values) {
            addCriterion("factor_bc not in", values, "factorBc");
            return (Criteria) this;
        }

        public Criteria andFactorBcBetween(Double value1, Double value2) {
            addCriterion("factor_bc between", value1, value2, "factorBc");
            return (Criteria) this;
        }

        public Criteria andFactorBcNotBetween(Double value1, Double value2) {
            addCriterion("factor_bc not between", value1, value2, "factorBc");
            return (Criteria) this;
        }

        public Criteria andFactorStatusIsNull() {
            addCriterion("factor_status is null");
            return (Criteria) this;
        }

        public Criteria andFactorStatusIsNotNull() {
            addCriterion("factor_status is not null");
            return (Criteria) this;
        }

        public Criteria andFactorStatusEqualTo(Byte value) {
            addCriterion("factor_status =", value, "factorStatus");
            return (Criteria) this;
        }

        public Criteria andFactorStatusNotEqualTo(Byte value) {
            addCriterion("factor_status <>", value, "factorStatus");
            return (Criteria) this;
        }

        public Criteria andFactorStatusGreaterThan(Byte value) {
            addCriterion("factor_status >", value, "factorStatus");
            return (Criteria) this;
        }

        public Criteria andFactorStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("factor_status >=", value, "factorStatus");
            return (Criteria) this;
        }

        public Criteria andFactorStatusLessThan(Byte value) {
            addCriterion("factor_status <", value, "factorStatus");
            return (Criteria) this;
        }

        public Criteria andFactorStatusLessThanOrEqualTo(Byte value) {
            addCriterion("factor_status <=", value, "factorStatus");
            return (Criteria) this;
        }

        public Criteria andFactorStatusIn(List<Byte> values) {
            addCriterion("factor_status in", values, "factorStatus");
            return (Criteria) this;
        }

        public Criteria andFactorStatusNotIn(List<Byte> values) {
            addCriterion("factor_status not in", values, "factorStatus");
            return (Criteria) this;
        }

        public Criteria andFactorStatusBetween(Byte value1, Byte value2) {
            addCriterion("factor_status between", value1, value2, "factorStatus");
            return (Criteria) this;
        }

        public Criteria andFactorStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("factor_status not between", value1, value2, "factorStatus");
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

        public Criteria andJanUseamountIsNull() {
            addCriterion("Jan_useamount is null");
            return (Criteria) this;
        }

        public Criteria andJanUseamountIsNotNull() {
            addCriterion("Jan_useamount is not null");
            return (Criteria) this;
        }

        public Criteria andJanUseamountEqualTo(Double value) {
            addCriterion("Jan_useamount =", value, "janUseamount");
            return (Criteria) this;
        }

        public Criteria andJanUseamountNotEqualTo(Double value) {
            addCriterion("Jan_useamount <>", value, "janUseamount");
            return (Criteria) this;
        }

        public Criteria andJanUseamountGreaterThan(Double value) {
            addCriterion("Jan_useamount >", value, "janUseamount");
            return (Criteria) this;
        }

        public Criteria andJanUseamountGreaterThanOrEqualTo(Double value) {
            addCriterion("Jan_useamount >=", value, "janUseamount");
            return (Criteria) this;
        }

        public Criteria andJanUseamountLessThan(Double value) {
            addCriterion("Jan_useamount <", value, "janUseamount");
            return (Criteria) this;
        }

        public Criteria andJanUseamountLessThanOrEqualTo(Double value) {
            addCriterion("Jan_useamount <=", value, "janUseamount");
            return (Criteria) this;
        }

        public Criteria andJanUseamountIn(List<Double> values) {
            addCriterion("Jan_useamount in", values, "janUseamount");
            return (Criteria) this;
        }

        public Criteria andJanUseamountNotIn(List<Double> values) {
            addCriterion("Jan_useamount not in", values, "janUseamount");
            return (Criteria) this;
        }

        public Criteria andJanUseamountBetween(Double value1, Double value2) {
            addCriterion("Jan_useamount between", value1, value2, "janUseamount");
            return (Criteria) this;
        }

        public Criteria andJanUseamountNotBetween(Double value1, Double value2) {
            addCriterion("Jan_useamount not between", value1, value2, "janUseamount");
            return (Criteria) this;
        }

        public Criteria andFebUseamountIsNull() {
            addCriterion("Feb_useamount is null");
            return (Criteria) this;
        }

        public Criteria andFebUseamountIsNotNull() {
            addCriterion("Feb_useamount is not null");
            return (Criteria) this;
        }

        public Criteria andFebUseamountEqualTo(Double value) {
            addCriterion("Feb_useamount =", value, "febUseamount");
            return (Criteria) this;
        }

        public Criteria andFebUseamountNotEqualTo(Double value) {
            addCriterion("Feb_useamount <>", value, "febUseamount");
            return (Criteria) this;
        }

        public Criteria andFebUseamountGreaterThan(Double value) {
            addCriterion("Feb_useamount >", value, "febUseamount");
            return (Criteria) this;
        }

        public Criteria andFebUseamountGreaterThanOrEqualTo(Double value) {
            addCriterion("Feb_useamount >=", value, "febUseamount");
            return (Criteria) this;
        }

        public Criteria andFebUseamountLessThan(Double value) {
            addCriterion("Feb_useamount <", value, "febUseamount");
            return (Criteria) this;
        }

        public Criteria andFebUseamountLessThanOrEqualTo(Double value) {
            addCriterion("Feb_useamount <=", value, "febUseamount");
            return (Criteria) this;
        }

        public Criteria andFebUseamountIn(List<Double> values) {
            addCriterion("Feb_useamount in", values, "febUseamount");
            return (Criteria) this;
        }

        public Criteria andFebUseamountNotIn(List<Double> values) {
            addCriterion("Feb_useamount not in", values, "febUseamount");
            return (Criteria) this;
        }

        public Criteria andFebUseamountBetween(Double value1, Double value2) {
            addCriterion("Feb_useamount between", value1, value2, "febUseamount");
            return (Criteria) this;
        }

        public Criteria andFebUseamountNotBetween(Double value1, Double value2) {
            addCriterion("Feb_useamount not between", value1, value2, "febUseamount");
            return (Criteria) this;
        }

        public Criteria andMarUseamountIsNull() {
            addCriterion("Mar_useamount is null");
            return (Criteria) this;
        }

        public Criteria andMarUseamountIsNotNull() {
            addCriterion("Mar_useamount is not null");
            return (Criteria) this;
        }

        public Criteria andMarUseamountEqualTo(Double value) {
            addCriterion("Mar_useamount =", value, "marUseamount");
            return (Criteria) this;
        }

        public Criteria andMarUseamountNotEqualTo(Double value) {
            addCriterion("Mar_useamount <>", value, "marUseamount");
            return (Criteria) this;
        }

        public Criteria andMarUseamountGreaterThan(Double value) {
            addCriterion("Mar_useamount >", value, "marUseamount");
            return (Criteria) this;
        }

        public Criteria andMarUseamountGreaterThanOrEqualTo(Double value) {
            addCriterion("Mar_useamount >=", value, "marUseamount");
            return (Criteria) this;
        }

        public Criteria andMarUseamountLessThan(Double value) {
            addCriterion("Mar_useamount <", value, "marUseamount");
            return (Criteria) this;
        }

        public Criteria andMarUseamountLessThanOrEqualTo(Double value) {
            addCriterion("Mar_useamount <=", value, "marUseamount");
            return (Criteria) this;
        }

        public Criteria andMarUseamountIn(List<Double> values) {
            addCriterion("Mar_useamount in", values, "marUseamount");
            return (Criteria) this;
        }

        public Criteria andMarUseamountNotIn(List<Double> values) {
            addCriterion("Mar_useamount not in", values, "marUseamount");
            return (Criteria) this;
        }

        public Criteria andMarUseamountBetween(Double value1, Double value2) {
            addCriterion("Mar_useamount between", value1, value2, "marUseamount");
            return (Criteria) this;
        }

        public Criteria andMarUseamountNotBetween(Double value1, Double value2) {
            addCriterion("Mar_useamount not between", value1, value2, "marUseamount");
            return (Criteria) this;
        }

        public Criteria andAprUseamountIsNull() {
            addCriterion("Apr_useamount is null");
            return (Criteria) this;
        }

        public Criteria andAprUseamountIsNotNull() {
            addCriterion("Apr_useamount is not null");
            return (Criteria) this;
        }

        public Criteria andAprUseamountEqualTo(Double value) {
            addCriterion("Apr_useamount =", value, "aprUseamount");
            return (Criteria) this;
        }

        public Criteria andAprUseamountNotEqualTo(Double value) {
            addCriterion("Apr_useamount <>", value, "aprUseamount");
            return (Criteria) this;
        }

        public Criteria andAprUseamountGreaterThan(Double value) {
            addCriterion("Apr_useamount >", value, "aprUseamount");
            return (Criteria) this;
        }

        public Criteria andAprUseamountGreaterThanOrEqualTo(Double value) {
            addCriterion("Apr_useamount >=", value, "aprUseamount");
            return (Criteria) this;
        }

        public Criteria andAprUseamountLessThan(Double value) {
            addCriterion("Apr_useamount <", value, "aprUseamount");
            return (Criteria) this;
        }

        public Criteria andAprUseamountLessThanOrEqualTo(Double value) {
            addCriterion("Apr_useamount <=", value, "aprUseamount");
            return (Criteria) this;
        }

        public Criteria andAprUseamountIn(List<Double> values) {
            addCriterion("Apr_useamount in", values, "aprUseamount");
            return (Criteria) this;
        }

        public Criteria andAprUseamountNotIn(List<Double> values) {
            addCriterion("Apr_useamount not in", values, "aprUseamount");
            return (Criteria) this;
        }

        public Criteria andAprUseamountBetween(Double value1, Double value2) {
            addCriterion("Apr_useamount between", value1, value2, "aprUseamount");
            return (Criteria) this;
        }

        public Criteria andAprUseamountNotBetween(Double value1, Double value2) {
            addCriterion("Apr_useamount not between", value1, value2, "aprUseamount");
            return (Criteria) this;
        }

        public Criteria andMayUseamountIsNull() {
            addCriterion("May_useamount is null");
            return (Criteria) this;
        }

        public Criteria andMayUseamountIsNotNull() {
            addCriterion("May_useamount is not null");
            return (Criteria) this;
        }

        public Criteria andMayUseamountEqualTo(Double value) {
            addCriterion("May_useamount =", value, "mayUseamount");
            return (Criteria) this;
        }

        public Criteria andMayUseamountNotEqualTo(Double value) {
            addCriterion("May_useamount <>", value, "mayUseamount");
            return (Criteria) this;
        }

        public Criteria andMayUseamountGreaterThan(Double value) {
            addCriterion("May_useamount >", value, "mayUseamount");
            return (Criteria) this;
        }

        public Criteria andMayUseamountGreaterThanOrEqualTo(Double value) {
            addCriterion("May_useamount >=", value, "mayUseamount");
            return (Criteria) this;
        }

        public Criteria andMayUseamountLessThan(Double value) {
            addCriterion("May_useamount <", value, "mayUseamount");
            return (Criteria) this;
        }

        public Criteria andMayUseamountLessThanOrEqualTo(Double value) {
            addCriterion("May_useamount <=", value, "mayUseamount");
            return (Criteria) this;
        }

        public Criteria andMayUseamountIn(List<Double> values) {
            addCriterion("May_useamount in", values, "mayUseamount");
            return (Criteria) this;
        }

        public Criteria andMayUseamountNotIn(List<Double> values) {
            addCriterion("May_useamount not in", values, "mayUseamount");
            return (Criteria) this;
        }

        public Criteria andMayUseamountBetween(Double value1, Double value2) {
            addCriterion("May_useamount between", value1, value2, "mayUseamount");
            return (Criteria) this;
        }

        public Criteria andMayUseamountNotBetween(Double value1, Double value2) {
            addCriterion("May_useamount not between", value1, value2, "mayUseamount");
            return (Criteria) this;
        }

        public Criteria andJuneUseamountIsNull() {
            addCriterion("June_useamount is null");
            return (Criteria) this;
        }

        public Criteria andJuneUseamountIsNotNull() {
            addCriterion("June_useamount is not null");
            return (Criteria) this;
        }

        public Criteria andJuneUseamountEqualTo(Double value) {
            addCriterion("June_useamount =", value, "juneUseamount");
            return (Criteria) this;
        }

        public Criteria andJuneUseamountNotEqualTo(Double value) {
            addCriterion("June_useamount <>", value, "juneUseamount");
            return (Criteria) this;
        }

        public Criteria andJuneUseamountGreaterThan(Double value) {
            addCriterion("June_useamount >", value, "juneUseamount");
            return (Criteria) this;
        }

        public Criteria andJuneUseamountGreaterThanOrEqualTo(Double value) {
            addCriterion("June_useamount >=", value, "juneUseamount");
            return (Criteria) this;
        }

        public Criteria andJuneUseamountLessThan(Double value) {
            addCriterion("June_useamount <", value, "juneUseamount");
            return (Criteria) this;
        }

        public Criteria andJuneUseamountLessThanOrEqualTo(Double value) {
            addCriterion("June_useamount <=", value, "juneUseamount");
            return (Criteria) this;
        }

        public Criteria andJuneUseamountIn(List<Double> values) {
            addCriterion("June_useamount in", values, "juneUseamount");
            return (Criteria) this;
        }

        public Criteria andJuneUseamountNotIn(List<Double> values) {
            addCriterion("June_useamount not in", values, "juneUseamount");
            return (Criteria) this;
        }

        public Criteria andJuneUseamountBetween(Double value1, Double value2) {
            addCriterion("June_useamount between", value1, value2, "juneUseamount");
            return (Criteria) this;
        }

        public Criteria andJuneUseamountNotBetween(Double value1, Double value2) {
            addCriterion("June_useamount not between", value1, value2, "juneUseamount");
            return (Criteria) this;
        }

        public Criteria andJulyUseamountIsNull() {
            addCriterion("July_useamount is null");
            return (Criteria) this;
        }

        public Criteria andJulyUseamountIsNotNull() {
            addCriterion("July_useamount is not null");
            return (Criteria) this;
        }

        public Criteria andJulyUseamountEqualTo(Double value) {
            addCriterion("July_useamount =", value, "julyUseamount");
            return (Criteria) this;
        }

        public Criteria andJulyUseamountNotEqualTo(Double value) {
            addCriterion("July_useamount <>", value, "julyUseamount");
            return (Criteria) this;
        }

        public Criteria andJulyUseamountGreaterThan(Double value) {
            addCriterion("July_useamount >", value, "julyUseamount");
            return (Criteria) this;
        }

        public Criteria andJulyUseamountGreaterThanOrEqualTo(Double value) {
            addCriterion("July_useamount >=", value, "julyUseamount");
            return (Criteria) this;
        }

        public Criteria andJulyUseamountLessThan(Double value) {
            addCriterion("July_useamount <", value, "julyUseamount");
            return (Criteria) this;
        }

        public Criteria andJulyUseamountLessThanOrEqualTo(Double value) {
            addCriterion("July_useamount <=", value, "julyUseamount");
            return (Criteria) this;
        }

        public Criteria andJulyUseamountIn(List<Double> values) {
            addCriterion("July_useamount in", values, "julyUseamount");
            return (Criteria) this;
        }

        public Criteria andJulyUseamountNotIn(List<Double> values) {
            addCriterion("July_useamount not in", values, "julyUseamount");
            return (Criteria) this;
        }

        public Criteria andJulyUseamountBetween(Double value1, Double value2) {
            addCriterion("July_useamount between", value1, value2, "julyUseamount");
            return (Criteria) this;
        }

        public Criteria andJulyUseamountNotBetween(Double value1, Double value2) {
            addCriterion("July_useamount not between", value1, value2, "julyUseamount");
            return (Criteria) this;
        }

        public Criteria andAugUseamountIsNull() {
            addCriterion("aug_useamount is null");
            return (Criteria) this;
        }

        public Criteria andAugUseamountIsNotNull() {
            addCriterion("aug_useamount is not null");
            return (Criteria) this;
        }

        public Criteria andAugUseamountEqualTo(Double value) {
            addCriterion("aug_useamount =", value, "augUseamount");
            return (Criteria) this;
        }

        public Criteria andAugUseamountNotEqualTo(Double value) {
            addCriterion("aug_useamount <>", value, "augUseamount");
            return (Criteria) this;
        }

        public Criteria andAugUseamountGreaterThan(Double value) {
            addCriterion("aug_useamount >", value, "augUseamount");
            return (Criteria) this;
        }

        public Criteria andAugUseamountGreaterThanOrEqualTo(Double value) {
            addCriterion("aug_useamount >=", value, "augUseamount");
            return (Criteria) this;
        }

        public Criteria andAugUseamountLessThan(Double value) {
            addCriterion("aug_useamount <", value, "augUseamount");
            return (Criteria) this;
        }

        public Criteria andAugUseamountLessThanOrEqualTo(Double value) {
            addCriterion("aug_useamount <=", value, "augUseamount");
            return (Criteria) this;
        }

        public Criteria andAugUseamountIn(List<Double> values) {
            addCriterion("aug_useamount in", values, "augUseamount");
            return (Criteria) this;
        }

        public Criteria andAugUseamountNotIn(List<Double> values) {
            addCriterion("aug_useamount not in", values, "augUseamount");
            return (Criteria) this;
        }

        public Criteria andAugUseamountBetween(Double value1, Double value2) {
            addCriterion("aug_useamount between", value1, value2, "augUseamount");
            return (Criteria) this;
        }

        public Criteria andAugUseamountNotBetween(Double value1, Double value2) {
            addCriterion("aug_useamount not between", value1, value2, "augUseamount");
            return (Criteria) this;
        }

        public Criteria andSeptUseamountIsNull() {
            addCriterion("sept_useamount is null");
            return (Criteria) this;
        }

        public Criteria andSeptUseamountIsNotNull() {
            addCriterion("sept_useamount is not null");
            return (Criteria) this;
        }

        public Criteria andSeptUseamountEqualTo(Double value) {
            addCriterion("sept_useamount =", value, "septUseamount");
            return (Criteria) this;
        }

        public Criteria andSeptUseamountNotEqualTo(Double value) {
            addCriterion("sept_useamount <>", value, "septUseamount");
            return (Criteria) this;
        }

        public Criteria andSeptUseamountGreaterThan(Double value) {
            addCriterion("sept_useamount >", value, "septUseamount");
            return (Criteria) this;
        }

        public Criteria andSeptUseamountGreaterThanOrEqualTo(Double value) {
            addCriterion("sept_useamount >=", value, "septUseamount");
            return (Criteria) this;
        }

        public Criteria andSeptUseamountLessThan(Double value) {
            addCriterion("sept_useamount <", value, "septUseamount");
            return (Criteria) this;
        }

        public Criteria andSeptUseamountLessThanOrEqualTo(Double value) {
            addCriterion("sept_useamount <=", value, "septUseamount");
            return (Criteria) this;
        }

        public Criteria andSeptUseamountIn(List<Double> values) {
            addCriterion("sept_useamount in", values, "septUseamount");
            return (Criteria) this;
        }

        public Criteria andSeptUseamountNotIn(List<Double> values) {
            addCriterion("sept_useamount not in", values, "septUseamount");
            return (Criteria) this;
        }

        public Criteria andSeptUseamountBetween(Double value1, Double value2) {
            addCriterion("sept_useamount between", value1, value2, "septUseamount");
            return (Criteria) this;
        }

        public Criteria andSeptUseamountNotBetween(Double value1, Double value2) {
            addCriterion("sept_useamount not between", value1, value2, "septUseamount");
            return (Criteria) this;
        }

        public Criteria andOctUseAmountIsNull() {
            addCriterion("oct_use_amount is null");
            return (Criteria) this;
        }

        public Criteria andOctUseAmountIsNotNull() {
            addCriterion("oct_use_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOctUseAmountEqualTo(Double value) {
            addCriterion("oct_use_amount =", value, "octUseAmount");
            return (Criteria) this;
        }

        public Criteria andOctUseAmountNotEqualTo(Double value) {
            addCriterion("oct_use_amount <>", value, "octUseAmount");
            return (Criteria) this;
        }

        public Criteria andOctUseAmountGreaterThan(Double value) {
            addCriterion("oct_use_amount >", value, "octUseAmount");
            return (Criteria) this;
        }

        public Criteria andOctUseAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("oct_use_amount >=", value, "octUseAmount");
            return (Criteria) this;
        }

        public Criteria andOctUseAmountLessThan(Double value) {
            addCriterion("oct_use_amount <", value, "octUseAmount");
            return (Criteria) this;
        }

        public Criteria andOctUseAmountLessThanOrEqualTo(Double value) {
            addCriterion("oct_use_amount <=", value, "octUseAmount");
            return (Criteria) this;
        }

        public Criteria andOctUseAmountIn(List<Double> values) {
            addCriterion("oct_use_amount in", values, "octUseAmount");
            return (Criteria) this;
        }

        public Criteria andOctUseAmountNotIn(List<Double> values) {
            addCriterion("oct_use_amount not in", values, "octUseAmount");
            return (Criteria) this;
        }

        public Criteria andOctUseAmountBetween(Double value1, Double value2) {
            addCriterion("oct_use_amount between", value1, value2, "octUseAmount");
            return (Criteria) this;
        }

        public Criteria andOctUseAmountNotBetween(Double value1, Double value2) {
            addCriterion("oct_use_amount not between", value1, value2, "octUseAmount");
            return (Criteria) this;
        }

        public Criteria andNovUseamountIsNull() {
            addCriterion("nov_useamount is null");
            return (Criteria) this;
        }

        public Criteria andNovUseamountIsNotNull() {
            addCriterion("nov_useamount is not null");
            return (Criteria) this;
        }

        public Criteria andNovUseamountEqualTo(Double value) {
            addCriterion("nov_useamount =", value, "novUseamount");
            return (Criteria) this;
        }

        public Criteria andNovUseamountNotEqualTo(Double value) {
            addCriterion("nov_useamount <>", value, "novUseamount");
            return (Criteria) this;
        }

        public Criteria andNovUseamountGreaterThan(Double value) {
            addCriterion("nov_useamount >", value, "novUseamount");
            return (Criteria) this;
        }

        public Criteria andNovUseamountGreaterThanOrEqualTo(Double value) {
            addCriterion("nov_useamount >=", value, "novUseamount");
            return (Criteria) this;
        }

        public Criteria andNovUseamountLessThan(Double value) {
            addCriterion("nov_useamount <", value, "novUseamount");
            return (Criteria) this;
        }

        public Criteria andNovUseamountLessThanOrEqualTo(Double value) {
            addCriterion("nov_useamount <=", value, "novUseamount");
            return (Criteria) this;
        }

        public Criteria andNovUseamountIn(List<Double> values) {
            addCriterion("nov_useamount in", values, "novUseamount");
            return (Criteria) this;
        }

        public Criteria andNovUseamountNotIn(List<Double> values) {
            addCriterion("nov_useamount not in", values, "novUseamount");
            return (Criteria) this;
        }

        public Criteria andNovUseamountBetween(Double value1, Double value2) {
            addCriterion("nov_useamount between", value1, value2, "novUseamount");
            return (Criteria) this;
        }

        public Criteria andNovUseamountNotBetween(Double value1, Double value2) {
            addCriterion("nov_useamount not between", value1, value2, "novUseamount");
            return (Criteria) this;
        }

        public Criteria andDecUseamountIsNull() {
            addCriterion("dec_useamount is null");
            return (Criteria) this;
        }

        public Criteria andDecUseamountIsNotNull() {
            addCriterion("dec_useamount is not null");
            return (Criteria) this;
        }

        public Criteria andDecUseamountEqualTo(Double value) {
            addCriterion("dec_useamount =", value, "decUseamount");
            return (Criteria) this;
        }

        public Criteria andDecUseamountNotEqualTo(Double value) {
            addCriterion("dec_useamount <>", value, "decUseamount");
            return (Criteria) this;
        }

        public Criteria andDecUseamountGreaterThan(Double value) {
            addCriterion("dec_useamount >", value, "decUseamount");
            return (Criteria) this;
        }

        public Criteria andDecUseamountGreaterThanOrEqualTo(Double value) {
            addCriterion("dec_useamount >=", value, "decUseamount");
            return (Criteria) this;
        }

        public Criteria andDecUseamountLessThan(Double value) {
            addCriterion("dec_useamount <", value, "decUseamount");
            return (Criteria) this;
        }

        public Criteria andDecUseamountLessThanOrEqualTo(Double value) {
            addCriterion("dec_useamount <=", value, "decUseamount");
            return (Criteria) this;
        }

        public Criteria andDecUseamountIn(List<Double> values) {
            addCriterion("dec_useamount in", values, "decUseamount");
            return (Criteria) this;
        }

        public Criteria andDecUseamountNotIn(List<Double> values) {
            addCriterion("dec_useamount not in", values, "decUseamount");
            return (Criteria) this;
        }

        public Criteria andDecUseamountBetween(Double value1, Double value2) {
            addCriterion("dec_useamount between", value1, value2, "decUseamount");
            return (Criteria) this;
        }

        public Criteria andDecUseamountNotBetween(Double value1, Double value2) {
            addCriterion("dec_useamount not between", value1, value2, "decUseamount");
            return (Criteria) this;
        }

        public Criteria andGasNoIsNull() {
            addCriterion("gas_no is null");
            return (Criteria) this;
        }

        public Criteria andGasNoIsNotNull() {
            addCriterion("gas_no is not null");
            return (Criteria) this;
        }

        public Criteria andGasNoEqualTo(Integer value) {
            addCriterion("gas_no =", value, "gasNo");
            return (Criteria) this;
        }

        public Criteria andGasNoNotEqualTo(Integer value) {
            addCriterion("gas_no <>", value, "gasNo");
            return (Criteria) this;
        }

        public Criteria andGasNoGreaterThan(Integer value) {
            addCriterion("gas_no >", value, "gasNo");
            return (Criteria) this;
        }

        public Criteria andGasNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("gas_no >=", value, "gasNo");
            return (Criteria) this;
        }

        public Criteria andGasNoLessThan(Integer value) {
            addCriterion("gas_no <", value, "gasNo");
            return (Criteria) this;
        }

        public Criteria andGasNoLessThanOrEqualTo(Integer value) {
            addCriterion("gas_no <=", value, "gasNo");
            return (Criteria) this;
        }

        public Criteria andGasNoIn(List<Integer> values) {
            addCriterion("gas_no in", values, "gasNo");
            return (Criteria) this;
        }

        public Criteria andGasNoNotIn(List<Integer> values) {
            addCriterion("gas_no not in", values, "gasNo");
            return (Criteria) this;
        }

        public Criteria andGasNoBetween(Integer value1, Integer value2) {
            addCriterion("gas_no between", value1, value2, "gasNo");
            return (Criteria) this;
        }

        public Criteria andGasNoNotBetween(Integer value1, Integer value2) {
            addCriterion("gas_no not between", value1, value2, "gasNo");
            return (Criteria) this;
        }

        public Criteria andGasPreIsNull() {
            addCriterion("gas_pre is null");
            return (Criteria) this;
        }

        public Criteria andGasPreIsNotNull() {
            addCriterion("gas_pre is not null");
            return (Criteria) this;
        }

        public Criteria andGasPreEqualTo(Double value) {
            addCriterion("gas_pre =", value, "gasPre");
            return (Criteria) this;
        }

        public Criteria andGasPreNotEqualTo(Double value) {
            addCriterion("gas_pre <>", value, "gasPre");
            return (Criteria) this;
        }

        public Criteria andGasPreGreaterThan(Double value) {
            addCriterion("gas_pre >", value, "gasPre");
            return (Criteria) this;
        }

        public Criteria andGasPreGreaterThanOrEqualTo(Double value) {
            addCriterion("gas_pre >=", value, "gasPre");
            return (Criteria) this;
        }

        public Criteria andGasPreLessThan(Double value) {
            addCriterion("gas_pre <", value, "gasPre");
            return (Criteria) this;
        }

        public Criteria andGasPreLessThanOrEqualTo(Double value) {
            addCriterion("gas_pre <=", value, "gasPre");
            return (Criteria) this;
        }

        public Criteria andGasPreIn(List<Double> values) {
            addCriterion("gas_pre in", values, "gasPre");
            return (Criteria) this;
        }

        public Criteria andGasPreNotIn(List<Double> values) {
            addCriterion("gas_pre not in", values, "gasPre");
            return (Criteria) this;
        }

        public Criteria andGasPreBetween(Double value1, Double value2) {
            addCriterion("gas_pre between", value1, value2, "gasPre");
            return (Criteria) this;
        }

        public Criteria andGasPreNotBetween(Double value1, Double value2) {
            addCriterion("gas_pre not between", value1, value2, "gasPre");
            return (Criteria) this;
        }

        public Criteria andGasVocsIsNull() {
            addCriterion("gas_vocs is null");
            return (Criteria) this;
        }

        public Criteria andGasVocsIsNotNull() {
            addCriterion("gas_vocs is not null");
            return (Criteria) this;
        }

        public Criteria andGasVocsEqualTo(Double value) {
            addCriterion("gas_vocs =", value, "gasVocs");
            return (Criteria) this;
        }

        public Criteria andGasVocsNotEqualTo(Double value) {
            addCriterion("gas_vocs <>", value, "gasVocs");
            return (Criteria) this;
        }

        public Criteria andGasVocsGreaterThan(Double value) {
            addCriterion("gas_vocs >", value, "gasVocs");
            return (Criteria) this;
        }

        public Criteria andGasVocsGreaterThanOrEqualTo(Double value) {
            addCriterion("gas_vocs >=", value, "gasVocs");
            return (Criteria) this;
        }

        public Criteria andGasVocsLessThan(Double value) {
            addCriterion("gas_vocs <", value, "gasVocs");
            return (Criteria) this;
        }

        public Criteria andGasVocsLessThanOrEqualTo(Double value) {
            addCriterion("gas_vocs <=", value, "gasVocs");
            return (Criteria) this;
        }

        public Criteria andGasVocsIn(List<Double> values) {
            addCriterion("gas_vocs in", values, "gasVocs");
            return (Criteria) this;
        }

        public Criteria andGasVocsNotIn(List<Double> values) {
            addCriterion("gas_vocs not in", values, "gasVocs");
            return (Criteria) this;
        }

        public Criteria andGasVocsBetween(Double value1, Double value2) {
            addCriterion("gas_vocs between", value1, value2, "gasVocs");
            return (Criteria) this;
        }

        public Criteria andGasVocsNotBetween(Double value1, Double value2) {
            addCriterion("gas_vocs not between", value1, value2, "gasVocs");
            return (Criteria) this;
        }

        public Criteria andTreatNoIsNull() {
            addCriterion("treat_no is null");
            return (Criteria) this;
        }

        public Criteria andTreatNoIsNotNull() {
            addCriterion("treat_no is not null");
            return (Criteria) this;
        }

        public Criteria andTreatNoEqualTo(Integer value) {
            addCriterion("treat_no =", value, "treatNo");
            return (Criteria) this;
        }

        public Criteria andTreatNoNotEqualTo(Integer value) {
            addCriterion("treat_no <>", value, "treatNo");
            return (Criteria) this;
        }

        public Criteria andTreatNoGreaterThan(Integer value) {
            addCriterion("treat_no >", value, "treatNo");
            return (Criteria) this;
        }

        public Criteria andTreatNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("treat_no >=", value, "treatNo");
            return (Criteria) this;
        }

        public Criteria andTreatNoLessThan(Integer value) {
            addCriterion("treat_no <", value, "treatNo");
            return (Criteria) this;
        }

        public Criteria andTreatNoLessThanOrEqualTo(Integer value) {
            addCriterion("treat_no <=", value, "treatNo");
            return (Criteria) this;
        }

        public Criteria andTreatNoIn(List<Integer> values) {
            addCriterion("treat_no in", values, "treatNo");
            return (Criteria) this;
        }

        public Criteria andTreatNoNotIn(List<Integer> values) {
            addCriterion("treat_no not in", values, "treatNo");
            return (Criteria) this;
        }

        public Criteria andTreatNoBetween(Integer value1, Integer value2) {
            addCriterion("treat_no between", value1, value2, "treatNo");
            return (Criteria) this;
        }

        public Criteria andTreatNoNotBetween(Integer value1, Integer value2) {
            addCriterion("treat_no not between", value1, value2, "treatNo");
            return (Criteria) this;
        }

        public Criteria andTreatPreIsNull() {
            addCriterion("treat_pre is null");
            return (Criteria) this;
        }

        public Criteria andTreatPreIsNotNull() {
            addCriterion("treat_pre is not null");
            return (Criteria) this;
        }

        public Criteria andTreatPreEqualTo(Double value) {
            addCriterion("treat_pre =", value, "treatPre");
            return (Criteria) this;
        }

        public Criteria andTreatPreNotEqualTo(Double value) {
            addCriterion("treat_pre <>", value, "treatPre");
            return (Criteria) this;
        }

        public Criteria andTreatPreGreaterThan(Double value) {
            addCriterion("treat_pre >", value, "treatPre");
            return (Criteria) this;
        }

        public Criteria andTreatPreGreaterThanOrEqualTo(Double value) {
            addCriterion("treat_pre >=", value, "treatPre");
            return (Criteria) this;
        }

        public Criteria andTreatPreLessThan(Double value) {
            addCriterion("treat_pre <", value, "treatPre");
            return (Criteria) this;
        }

        public Criteria andTreatPreLessThanOrEqualTo(Double value) {
            addCriterion("treat_pre <=", value, "treatPre");
            return (Criteria) this;
        }

        public Criteria andTreatPreIn(List<Double> values) {
            addCriterion("treat_pre in", values, "treatPre");
            return (Criteria) this;
        }

        public Criteria andTreatPreNotIn(List<Double> values) {
            addCriterion("treat_pre not in", values, "treatPre");
            return (Criteria) this;
        }

        public Criteria andTreatPreBetween(Double value1, Double value2) {
            addCriterion("treat_pre between", value1, value2, "treatPre");
            return (Criteria) this;
        }

        public Criteria andTreatPreNotBetween(Double value1, Double value2) {
            addCriterion("treat_pre not between", value1, value2, "treatPre");
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