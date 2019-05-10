package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class FeiqiTempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FeiqiTempExample() {
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

        public Criteria andNknoIsNull() {
            addCriterion("nkno is null");
            return (Criteria) this;
        }

        public Criteria andNknoIsNotNull() {
            addCriterion("nkno is not null");
            return (Criteria) this;
        }

        public Criteria andNknoEqualTo(Integer value) {
            addCriterion("nkno =", value, "nkno");
            return (Criteria) this;
        }

        public Criteria andNknoNotEqualTo(Integer value) {
            addCriterion("nkno <>", value, "nkno");
            return (Criteria) this;
        }

        public Criteria andNknoGreaterThan(Integer value) {
            addCriterion("nkno >", value, "nkno");
            return (Criteria) this;
        }

        public Criteria andNknoGreaterThanOrEqualTo(Integer value) {
            addCriterion("nkno >=", value, "nkno");
            return (Criteria) this;
        }

        public Criteria andNknoLessThan(Integer value) {
            addCriterion("nkno <", value, "nkno");
            return (Criteria) this;
        }

        public Criteria andNknoLessThanOrEqualTo(Integer value) {
            addCriterion("nkno <=", value, "nkno");
            return (Criteria) this;
        }

        public Criteria andNknoIn(List<Integer> values) {
            addCriterion("nkno in", values, "nkno");
            return (Criteria) this;
        }

        public Criteria andNknoNotIn(List<Integer> values) {
            addCriterion("nkno not in", values, "nkno");
            return (Criteria) this;
        }

        public Criteria andNknoBetween(Integer value1, Integer value2) {
            addCriterion("nkno between", value1, value2, "nkno");
            return (Criteria) this;
        }

        public Criteria andNknoNotBetween(Integer value1, Integer value2) {
            addCriterion("nkno not between", value1, value2, "nkno");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNull() {
            addCriterion("device_name is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNotNull() {
            addCriterion("device_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameEqualTo(String value) {
            addCriterion("device_name =", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotEqualTo(String value) {
            addCriterion("device_name <>", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThan(String value) {
            addCriterion("device_name >", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThanOrEqualTo(String value) {
            addCriterion("device_name >=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThan(String value) {
            addCriterion("device_name <", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThanOrEqualTo(String value) {
            addCriterion("device_name <=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLike(String value) {
            addCriterion("device_name like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotLike(String value) {
            addCriterion("device_name not like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIn(List<String> values) {
            addCriterion("device_name in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotIn(List<String> values) {
            addCriterion("device_name not in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameBetween(String value1, String value2) {
            addCriterion("device_name between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotBetween(String value1, String value2) {
            addCriterion("device_name not between", value1, value2, "deviceName");
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

        public Criteria andWatterIsNull() {
            addCriterion("watter is null");
            return (Criteria) this;
        }

        public Criteria andWatterIsNotNull() {
            addCriterion("watter is not null");
            return (Criteria) this;
        }

        public Criteria andWatterEqualTo(Double value) {
            addCriterion("watter =", value, "watter");
            return (Criteria) this;
        }

        public Criteria andWatterNotEqualTo(Double value) {
            addCriterion("watter <>", value, "watter");
            return (Criteria) this;
        }

        public Criteria andWatterGreaterThan(Double value) {
            addCriterion("watter >", value, "watter");
            return (Criteria) this;
        }

        public Criteria andWatterGreaterThanOrEqualTo(Double value) {
            addCriterion("watter >=", value, "watter");
            return (Criteria) this;
        }

        public Criteria andWatterLessThan(Double value) {
            addCriterion("watter <", value, "watter");
            return (Criteria) this;
        }

        public Criteria andWatterLessThanOrEqualTo(Double value) {
            addCriterion("watter <=", value, "watter");
            return (Criteria) this;
        }

        public Criteria andWatterIn(List<Double> values) {
            addCriterion("watter in", values, "watter");
            return (Criteria) this;
        }

        public Criteria andWatterNotIn(List<Double> values) {
            addCriterion("watter not in", values, "watter");
            return (Criteria) this;
        }

        public Criteria andWatterBetween(Double value1, Double value2) {
            addCriterion("watter between", value1, value2, "watter");
            return (Criteria) this;
        }

        public Criteria andWatterNotBetween(Double value1, Double value2) {
            addCriterion("watter not between", value1, value2, "watter");
            return (Criteria) this;
        }

        public Criteria andTianIsNull() {
            addCriterion("tian is null");
            return (Criteria) this;
        }

        public Criteria andTianIsNotNull() {
            addCriterion("tian is not null");
            return (Criteria) this;
        }

        public Criteria andTianEqualTo(Double value) {
            addCriterion("tian =", value, "tian");
            return (Criteria) this;
        }

        public Criteria andTianNotEqualTo(Double value) {
            addCriterion("tian <>", value, "tian");
            return (Criteria) this;
        }

        public Criteria andTianGreaterThan(Double value) {
            addCriterion("tian >", value, "tian");
            return (Criteria) this;
        }

        public Criteria andTianGreaterThanOrEqualTo(Double value) {
            addCriterion("tian >=", value, "tian");
            return (Criteria) this;
        }

        public Criteria andTianLessThan(Double value) {
            addCriterion("tian <", value, "tian");
            return (Criteria) this;
        }

        public Criteria andTianLessThanOrEqualTo(Double value) {
            addCriterion("tian <=", value, "tian");
            return (Criteria) this;
        }

        public Criteria andTianIn(List<Double> values) {
            addCriterion("tian in", values, "tian");
            return (Criteria) this;
        }

        public Criteria andTianNotIn(List<Double> values) {
            addCriterion("tian not in", values, "tian");
            return (Criteria) this;
        }

        public Criteria andTianBetween(Double value1, Double value2) {
            addCriterion("tian between", value1, value2, "tian");
            return (Criteria) this;
        }

        public Criteria andTianNotBetween(Double value1, Double value2) {
            addCriterion("tian not between", value1, value2, "tian");
            return (Criteria) this;
        }

        public Criteria andFenIsNull() {
            addCriterion("fen is null");
            return (Criteria) this;
        }

        public Criteria andFenIsNotNull() {
            addCriterion("fen is not null");
            return (Criteria) this;
        }

        public Criteria andFenEqualTo(Double value) {
            addCriterion("fen =", value, "fen");
            return (Criteria) this;
        }

        public Criteria andFenNotEqualTo(Double value) {
            addCriterion("fen <>", value, "fen");
            return (Criteria) this;
        }

        public Criteria andFenGreaterThan(Double value) {
            addCriterion("fen >", value, "fen");
            return (Criteria) this;
        }

        public Criteria andFenGreaterThanOrEqualTo(Double value) {
            addCriterion("fen >=", value, "fen");
            return (Criteria) this;
        }

        public Criteria andFenLessThan(Double value) {
            addCriterion("fen <", value, "fen");
            return (Criteria) this;
        }

        public Criteria andFenLessThanOrEqualTo(Double value) {
            addCriterion("fen <=", value, "fen");
            return (Criteria) this;
        }

        public Criteria andFenIn(List<Double> values) {
            addCriterion("fen in", values, "fen");
            return (Criteria) this;
        }

        public Criteria andFenNotIn(List<Double> values) {
            addCriterion("fen not in", values, "fen");
            return (Criteria) this;
        }

        public Criteria andFenBetween(Double value1, Double value2) {
            addCriterion("fen between", value1, value2, "fen");
            return (Criteria) this;
        }

        public Criteria andFenNotBetween(Double value1, Double value2) {
            addCriterion("fen not between", value1, value2, "fen");
            return (Criteria) this;
        }

        public Criteria andDuiIsNull() {
            addCriterion("dui is null");
            return (Criteria) this;
        }

        public Criteria andDuiIsNotNull() {
            addCriterion("dui is not null");
            return (Criteria) this;
        }

        public Criteria andDuiEqualTo(Double value) {
            addCriterion("dui =", value, "dui");
            return (Criteria) this;
        }

        public Criteria andDuiNotEqualTo(Double value) {
            addCriterion("dui <>", value, "dui");
            return (Criteria) this;
        }

        public Criteria andDuiGreaterThan(Double value) {
            addCriterion("dui >", value, "dui");
            return (Criteria) this;
        }

        public Criteria andDuiGreaterThanOrEqualTo(Double value) {
            addCriterion("dui >=", value, "dui");
            return (Criteria) this;
        }

        public Criteria andDuiLessThan(Double value) {
            addCriterion("dui <", value, "dui");
            return (Criteria) this;
        }

        public Criteria andDuiLessThanOrEqualTo(Double value) {
            addCriterion("dui <=", value, "dui");
            return (Criteria) this;
        }

        public Criteria andDuiIn(List<Double> values) {
            addCriterion("dui in", values, "dui");
            return (Criteria) this;
        }

        public Criteria andDuiNotIn(List<Double> values) {
            addCriterion("dui not in", values, "dui");
            return (Criteria) this;
        }

        public Criteria andDuiBetween(Double value1, Double value2) {
            addCriterion("dui between", value1, value2, "dui");
            return (Criteria) this;
        }

        public Criteria andDuiNotBetween(Double value1, Double value2) {
            addCriterion("dui not between", value1, value2, "dui");
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

        public Criteria andStatusDecIsNull() {
            addCriterion("status_dec is null");
            return (Criteria) this;
        }

        public Criteria andStatusDecIsNotNull() {
            addCriterion("status_dec is not null");
            return (Criteria) this;
        }

        public Criteria andStatusDecEqualTo(String value) {
            addCriterion("status_dec =", value, "statusDec");
            return (Criteria) this;
        }

        public Criteria andStatusDecNotEqualTo(String value) {
            addCriterion("status_dec <>", value, "statusDec");
            return (Criteria) this;
        }

        public Criteria andStatusDecGreaterThan(String value) {
            addCriterion("status_dec >", value, "statusDec");
            return (Criteria) this;
        }

        public Criteria andStatusDecGreaterThanOrEqualTo(String value) {
            addCriterion("status_dec >=", value, "statusDec");
            return (Criteria) this;
        }

        public Criteria andStatusDecLessThan(String value) {
            addCriterion("status_dec <", value, "statusDec");
            return (Criteria) this;
        }

        public Criteria andStatusDecLessThanOrEqualTo(String value) {
            addCriterion("status_dec <=", value, "statusDec");
            return (Criteria) this;
        }

        public Criteria andStatusDecLike(String value) {
            addCriterion("status_dec like", value, "statusDec");
            return (Criteria) this;
        }

        public Criteria andStatusDecNotLike(String value) {
            addCriterion("status_dec not like", value, "statusDec");
            return (Criteria) this;
        }

        public Criteria andStatusDecIn(List<String> values) {
            addCriterion("status_dec in", values, "statusDec");
            return (Criteria) this;
        }

        public Criteria andStatusDecNotIn(List<String> values) {
            addCriterion("status_dec not in", values, "statusDec");
            return (Criteria) this;
        }

        public Criteria andStatusDecBetween(String value1, String value2) {
            addCriterion("status_dec between", value1, value2, "statusDec");
            return (Criteria) this;
        }

        public Criteria andStatusDecNotBetween(String value1, String value2) {
            addCriterion("status_dec not between", value1, value2, "statusDec");
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