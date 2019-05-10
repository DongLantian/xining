package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class KilnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KilnExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andExhustIdIsNull() {
            addCriterion("EXHUST_ID is null");
            return (Criteria) this;
        }

        public Criteria andExhustIdIsNotNull() {
            addCriterion("EXHUST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExhustIdEqualTo(Integer value) {
            addCriterion("EXHUST_ID =", value, "exhustId");
            return (Criteria) this;
        }

        public Criteria andExhustIdNotEqualTo(Integer value) {
            addCriterion("EXHUST_ID <>", value, "exhustId");
            return (Criteria) this;
        }

        public Criteria andExhustIdGreaterThan(Integer value) {
            addCriterion("EXHUST_ID >", value, "exhustId");
            return (Criteria) this;
        }

        public Criteria andExhustIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXHUST_ID >=", value, "exhustId");
            return (Criteria) this;
        }

        public Criteria andExhustIdLessThan(Integer value) {
            addCriterion("EXHUST_ID <", value, "exhustId");
            return (Criteria) this;
        }

        public Criteria andExhustIdLessThanOrEqualTo(Integer value) {
            addCriterion("EXHUST_ID <=", value, "exhustId");
            return (Criteria) this;
        }

        public Criteria andExhustIdIn(List<Integer> values) {
            addCriterion("EXHUST_ID in", values, "exhustId");
            return (Criteria) this;
        }

        public Criteria andExhustIdNotIn(List<Integer> values) {
            addCriterion("EXHUST_ID not in", values, "exhustId");
            return (Criteria) this;
        }

        public Criteria andExhustIdBetween(Integer value1, Integer value2) {
            addCriterion("EXHUST_ID between", value1, value2, "exhustId");
            return (Criteria) this;
        }

        public Criteria andExhustIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EXHUST_ID not between", value1, value2, "exhustId");
            return (Criteria) this;
        }

        public Criteria andTkilnIdIsNull() {
            addCriterion("TKILN_ID is null");
            return (Criteria) this;
        }

        public Criteria andTkilnIdIsNotNull() {
            addCriterion("TKILN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTkilnIdEqualTo(Integer value) {
            addCriterion("TKILN_ID =", value, "tkilnId");
            return (Criteria) this;
        }

        public Criteria andTkilnIdNotEqualTo(Integer value) {
            addCriterion("TKILN_ID <>", value, "tkilnId");
            return (Criteria) this;
        }

        public Criteria andTkilnIdGreaterThan(Integer value) {
            addCriterion("TKILN_ID >", value, "tkilnId");
            return (Criteria) this;
        }

        public Criteria andTkilnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TKILN_ID >=", value, "tkilnId");
            return (Criteria) this;
        }

        public Criteria andTkilnIdLessThan(Integer value) {
            addCriterion("TKILN_ID <", value, "tkilnId");
            return (Criteria) this;
        }

        public Criteria andTkilnIdLessThanOrEqualTo(Integer value) {
            addCriterion("TKILN_ID <=", value, "tkilnId");
            return (Criteria) this;
        }

        public Criteria andTkilnIdIn(List<Integer> values) {
            addCriterion("TKILN_ID in", values, "tkilnId");
            return (Criteria) this;
        }

        public Criteria andTkilnIdNotIn(List<Integer> values) {
            addCriterion("TKILN_ID not in", values, "tkilnId");
            return (Criteria) this;
        }

        public Criteria andTkilnIdBetween(Integer value1, Integer value2) {
            addCriterion("TKILN_ID between", value1, value2, "tkilnId");
            return (Criteria) this;
        }

        public Criteria andTkilnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TKILN_ID not between", value1, value2, "tkilnId");
            return (Criteria) this;
        }

        public Criteria andNkNoIsNull() {
            addCriterion("NK_NO is null");
            return (Criteria) this;
        }

        public Criteria andNkNoIsNotNull() {
            addCriterion("NK_NO is not null");
            return (Criteria) this;
        }

        public Criteria andNkNoEqualTo(Integer value) {
            addCriterion("NK_NO =", value, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoNotEqualTo(Integer value) {
            addCriterion("NK_NO <>", value, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoGreaterThan(Integer value) {
            addCriterion("NK_NO >", value, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("NK_NO >=", value, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoLessThan(Integer value) {
            addCriterion("NK_NO <", value, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoLessThanOrEqualTo(Integer value) {
            addCriterion("NK_NO <=", value, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoIn(List<Integer> values) {
            addCriterion("NK_NO in", values, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoNotIn(List<Integer> values) {
            addCriterion("NK_NO not in", values, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoBetween(Integer value1, Integer value2) {
            addCriterion("NK_NO between", value1, value2, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoNotBetween(Integer value1, Integer value2) {
            addCriterion("NK_NO not between", value1, value2, "nkNo");
            return (Criteria) this;
        }

        public Criteria andKilnNoIsNull() {
            addCriterion("KILN_NO is null");
            return (Criteria) this;
        }

        public Criteria andKilnNoIsNotNull() {
            addCriterion("KILN_NO is not null");
            return (Criteria) this;
        }

        public Criteria andKilnNoEqualTo(String value) {
            addCriterion("KILN_NO =", value, "kilnNo");
            return (Criteria) this;
        }

        public Criteria andKilnNoNotEqualTo(String value) {
            addCriterion("KILN_NO <>", value, "kilnNo");
            return (Criteria) this;
        }

        public Criteria andKilnNoGreaterThan(String value) {
            addCriterion("KILN_NO >", value, "kilnNo");
            return (Criteria) this;
        }

        public Criteria andKilnNoGreaterThanOrEqualTo(String value) {
            addCriterion("KILN_NO >=", value, "kilnNo");
            return (Criteria) this;
        }

        public Criteria andKilnNoLessThan(String value) {
            addCriterion("KILN_NO <", value, "kilnNo");
            return (Criteria) this;
        }

        public Criteria andKilnNoLessThanOrEqualTo(String value) {
            addCriterion("KILN_NO <=", value, "kilnNo");
            return (Criteria) this;
        }

        public Criteria andKilnNoLike(String value) {
            addCriterion("KILN_NO like", value, "kilnNo");
            return (Criteria) this;
        }

        public Criteria andKilnNoNotLike(String value) {
            addCriterion("KILN_NO not like", value, "kilnNo");
            return (Criteria) this;
        }

        public Criteria andKilnNoIn(List<String> values) {
            addCriterion("KILN_NO in", values, "kilnNo");
            return (Criteria) this;
        }

        public Criteria andKilnNoNotIn(List<String> values) {
            addCriterion("KILN_NO not in", values, "kilnNo");
            return (Criteria) this;
        }

        public Criteria andKilnNoBetween(String value1, String value2) {
            addCriterion("KILN_NO between", value1, value2, "kilnNo");
            return (Criteria) this;
        }

        public Criteria andKilnNoNotBetween(String value1, String value2) {
            addCriterion("KILN_NO not between", value1, value2, "kilnNo");
            return (Criteria) this;
        }

        public Criteria andFunctionDecIsNull() {
            addCriterion("FUNCTION_Dec is null");
            return (Criteria) this;
        }

        public Criteria andFunctionDecIsNotNull() {
            addCriterion("FUNCTION_Dec is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionDecEqualTo(String value) {
            addCriterion("FUNCTION_Dec =", value, "functionDec");
            return (Criteria) this;
        }

        public Criteria andFunctionDecNotEqualTo(String value) {
            addCriterion("FUNCTION_Dec <>", value, "functionDec");
            return (Criteria) this;
        }

        public Criteria andFunctionDecGreaterThan(String value) {
            addCriterion("FUNCTION_Dec >", value, "functionDec");
            return (Criteria) this;
        }

        public Criteria andFunctionDecGreaterThanOrEqualTo(String value) {
            addCriterion("FUNCTION_Dec >=", value, "functionDec");
            return (Criteria) this;
        }

        public Criteria andFunctionDecLessThan(String value) {
            addCriterion("FUNCTION_Dec <", value, "functionDec");
            return (Criteria) this;
        }

        public Criteria andFunctionDecLessThanOrEqualTo(String value) {
            addCriterion("FUNCTION_Dec <=", value, "functionDec");
            return (Criteria) this;
        }

        public Criteria andFunctionDecLike(String value) {
            addCriterion("FUNCTION_Dec like", value, "functionDec");
            return (Criteria) this;
        }

        public Criteria andFunctionDecNotLike(String value) {
            addCriterion("FUNCTION_Dec not like", value, "functionDec");
            return (Criteria) this;
        }

        public Criteria andFunctionDecIn(List<String> values) {
            addCriterion("FUNCTION_Dec in", values, "functionDec");
            return (Criteria) this;
        }

        public Criteria andFunctionDecNotIn(List<String> values) {
            addCriterion("FUNCTION_Dec not in", values, "functionDec");
            return (Criteria) this;
        }

        public Criteria andFunctionDecBetween(String value1, String value2) {
            addCriterion("FUNCTION_Dec between", value1, value2, "functionDec");
            return (Criteria) this;
        }

        public Criteria andFunctionDecNotBetween(String value1, String value2) {
            addCriterion("FUNCTION_Dec not between", value1, value2, "functionDec");
            return (Criteria) this;
        }

        public Criteria andFunctioIsNull() {
            addCriterion("FUNCTIO is null");
            return (Criteria) this;
        }

        public Criteria andFunctioIsNotNull() {
            addCriterion("FUNCTIO is not null");
            return (Criteria) this;
        }

        public Criteria andFunctioEqualTo(String value) {
            addCriterion("FUNCTIO =", value, "functio");
            return (Criteria) this;
        }

        public Criteria andFunctioNotEqualTo(String value) {
            addCriterion("FUNCTIO <>", value, "functio");
            return (Criteria) this;
        }

        public Criteria andFunctioGreaterThan(String value) {
            addCriterion("FUNCTIO >", value, "functio");
            return (Criteria) this;
        }

        public Criteria andFunctioGreaterThanOrEqualTo(String value) {
            addCriterion("FUNCTIO >=", value, "functio");
            return (Criteria) this;
        }

        public Criteria andFunctioLessThan(String value) {
            addCriterion("FUNCTIO <", value, "functio");
            return (Criteria) this;
        }

        public Criteria andFunctioLessThanOrEqualTo(String value) {
            addCriterion("FUNCTIO <=", value, "functio");
            return (Criteria) this;
        }

        public Criteria andFunctioLike(String value) {
            addCriterion("FUNCTIO like", value, "functio");
            return (Criteria) this;
        }

        public Criteria andFunctioNotLike(String value) {
            addCriterion("FUNCTIO not like", value, "functio");
            return (Criteria) this;
        }

        public Criteria andFunctioIn(List<String> values) {
            addCriterion("FUNCTIO in", values, "functio");
            return (Criteria) this;
        }

        public Criteria andFunctioNotIn(List<String> values) {
            addCriterion("FUNCTIO not in", values, "functio");
            return (Criteria) this;
        }

        public Criteria andFunctioBetween(String value1, String value2) {
            addCriterion("FUNCTIO between", value1, value2, "functio");
            return (Criteria) this;
        }

        public Criteria andFunctioNotBetween(String value1, String value2) {
            addCriterion("FUNCTIO not between", value1, value2, "functio");
            return (Criteria) this;
        }

        public Criteria andModelDecIsNull() {
            addCriterion("MODEL_DEC is null");
            return (Criteria) this;
        }

        public Criteria andModelDecIsNotNull() {
            addCriterion("MODEL_DEC is not null");
            return (Criteria) this;
        }

        public Criteria andModelDecEqualTo(String value) {
            addCriterion("MODEL_DEC =", value, "modelDec");
            return (Criteria) this;
        }

        public Criteria andModelDecNotEqualTo(String value) {
            addCriterion("MODEL_DEC <>", value, "modelDec");
            return (Criteria) this;
        }

        public Criteria andModelDecGreaterThan(String value) {
            addCriterion("MODEL_DEC >", value, "modelDec");
            return (Criteria) this;
        }

        public Criteria andModelDecGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL_DEC >=", value, "modelDec");
            return (Criteria) this;
        }

        public Criteria andModelDecLessThan(String value) {
            addCriterion("MODEL_DEC <", value, "modelDec");
            return (Criteria) this;
        }

        public Criteria andModelDecLessThanOrEqualTo(String value) {
            addCriterion("MODEL_DEC <=", value, "modelDec");
            return (Criteria) this;
        }

        public Criteria andModelDecLike(String value) {
            addCriterion("MODEL_DEC like", value, "modelDec");
            return (Criteria) this;
        }

        public Criteria andModelDecNotLike(String value) {
            addCriterion("MODEL_DEC not like", value, "modelDec");
            return (Criteria) this;
        }

        public Criteria andModelDecIn(List<String> values) {
            addCriterion("MODEL_DEC in", values, "modelDec");
            return (Criteria) this;
        }

        public Criteria andModelDecNotIn(List<String> values) {
            addCriterion("MODEL_DEC not in", values, "modelDec");
            return (Criteria) this;
        }

        public Criteria andModelDecBetween(String value1, String value2) {
            addCriterion("MODEL_DEC between", value1, value2, "modelDec");
            return (Criteria) this;
        }

        public Criteria andModelDecNotBetween(String value1, String value2) {
            addCriterion("MODEL_DEC not between", value1, value2, "modelDec");
            return (Criteria) this;
        }

        public Criteria andKilnModelIsNull() {
            addCriterion("KILN_MODEL is null");
            return (Criteria) this;
        }

        public Criteria andKilnModelIsNotNull() {
            addCriterion("KILN_MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andKilnModelEqualTo(String value) {
            addCriterion("KILN_MODEL =", value, "kilnModel");
            return (Criteria) this;
        }

        public Criteria andKilnModelNotEqualTo(String value) {
            addCriterion("KILN_MODEL <>", value, "kilnModel");
            return (Criteria) this;
        }

        public Criteria andKilnModelGreaterThan(String value) {
            addCriterion("KILN_MODEL >", value, "kilnModel");
            return (Criteria) this;
        }

        public Criteria andKilnModelGreaterThanOrEqualTo(String value) {
            addCriterion("KILN_MODEL >=", value, "kilnModel");
            return (Criteria) this;
        }

        public Criteria andKilnModelLessThan(String value) {
            addCriterion("KILN_MODEL <", value, "kilnModel");
            return (Criteria) this;
        }

        public Criteria andKilnModelLessThanOrEqualTo(String value) {
            addCriterion("KILN_MODEL <=", value, "kilnModel");
            return (Criteria) this;
        }

        public Criteria andKilnModelLike(String value) {
            addCriterion("KILN_MODEL like", value, "kilnModel");
            return (Criteria) this;
        }

        public Criteria andKilnModelNotLike(String value) {
            addCriterion("KILN_MODEL not like", value, "kilnModel");
            return (Criteria) this;
        }

        public Criteria andKilnModelIn(List<String> values) {
            addCriterion("KILN_MODEL in", values, "kilnModel");
            return (Criteria) this;
        }

        public Criteria andKilnModelNotIn(List<String> values) {
            addCriterion("KILN_MODEL not in", values, "kilnModel");
            return (Criteria) this;
        }

        public Criteria andKilnModelBetween(String value1, String value2) {
            addCriterion("KILN_MODEL between", value1, value2, "kilnModel");
            return (Criteria) this;
        }

        public Criteria andKilnModelNotBetween(String value1, String value2) {
            addCriterion("KILN_MODEL not between", value1, value2, "kilnModel");
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

        public Criteria andFueltypeDecIsNull() {
            addCriterion("fueltype_dec is null");
            return (Criteria) this;
        }

        public Criteria andFueltypeDecIsNotNull() {
            addCriterion("fueltype_dec is not null");
            return (Criteria) this;
        }

        public Criteria andFueltypeDecEqualTo(String value) {
            addCriterion("fueltype_dec =", value, "fueltypeDec");
            return (Criteria) this;
        }

        public Criteria andFueltypeDecNotEqualTo(String value) {
            addCriterion("fueltype_dec <>", value, "fueltypeDec");
            return (Criteria) this;
        }

        public Criteria andFueltypeDecGreaterThan(String value) {
            addCriterion("fueltype_dec >", value, "fueltypeDec");
            return (Criteria) this;
        }

        public Criteria andFueltypeDecGreaterThanOrEqualTo(String value) {
            addCriterion("fueltype_dec >=", value, "fueltypeDec");
            return (Criteria) this;
        }

        public Criteria andFueltypeDecLessThan(String value) {
            addCriterion("fueltype_dec <", value, "fueltypeDec");
            return (Criteria) this;
        }

        public Criteria andFueltypeDecLessThanOrEqualTo(String value) {
            addCriterion("fueltype_dec <=", value, "fueltypeDec");
            return (Criteria) this;
        }

        public Criteria andFueltypeDecLike(String value) {
            addCriterion("fueltype_dec like", value, "fueltypeDec");
            return (Criteria) this;
        }

        public Criteria andFueltypeDecNotLike(String value) {
            addCriterion("fueltype_dec not like", value, "fueltypeDec");
            return (Criteria) this;
        }

        public Criteria andFueltypeDecIn(List<String> values) {
            addCriterion("fueltype_dec in", values, "fueltypeDec");
            return (Criteria) this;
        }

        public Criteria andFueltypeDecNotIn(List<String> values) {
            addCriterion("fueltype_dec not in", values, "fueltypeDec");
            return (Criteria) this;
        }

        public Criteria andFueltypeDecBetween(String value1, String value2) {
            addCriterion("fueltype_dec between", value1, value2, "fueltypeDec");
            return (Criteria) this;
        }

        public Criteria andFueltypeDecNotBetween(String value1, String value2) {
            addCriterion("fueltype_dec not between", value1, value2, "fueltypeDec");
            return (Criteria) this;
        }

        public Criteria andFueltypeIsNull() {
            addCriterion("fueltype is null");
            return (Criteria) this;
        }

        public Criteria andFueltypeIsNotNull() {
            addCriterion("fueltype is not null");
            return (Criteria) this;
        }

        public Criteria andFueltypeEqualTo(String value) {
            addCriterion("fueltype =", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeNotEqualTo(String value) {
            addCriterion("fueltype <>", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeGreaterThan(String value) {
            addCriterion("fueltype >", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeGreaterThanOrEqualTo(String value) {
            addCriterion("fueltype >=", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeLessThan(String value) {
            addCriterion("fueltype <", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeLessThanOrEqualTo(String value) {
            addCriterion("fueltype <=", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeLike(String value) {
            addCriterion("fueltype like", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeNotLike(String value) {
            addCriterion("fueltype not like", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeIn(List<String> values) {
            addCriterion("fueltype in", values, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeNotIn(List<String> values) {
            addCriterion("fueltype not in", values, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeBetween(String value1, String value2) {
            addCriterion("fueltype between", value1, value2, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeNotBetween(String value1, String value2) {
            addCriterion("fueltype not between", value1, value2, "fueltype");
            return (Criteria) this;
        }

        public Criteria andKilnFuelAusageIsNull() {
            addCriterion("KILN_FUEL_AUSAGE is null");
            return (Criteria) this;
        }

        public Criteria andKilnFuelAusageIsNotNull() {
            addCriterion("KILN_FUEL_AUSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andKilnFuelAusageEqualTo(Double value) {
            addCriterion("KILN_FUEL_AUSAGE =", value, "kilnFuelAusage");
            return (Criteria) this;
        }

        public Criteria andKilnFuelAusageNotEqualTo(Double value) {
            addCriterion("KILN_FUEL_AUSAGE <>", value, "kilnFuelAusage");
            return (Criteria) this;
        }

        public Criteria andKilnFuelAusageGreaterThan(Double value) {
            addCriterion("KILN_FUEL_AUSAGE >", value, "kilnFuelAusage");
            return (Criteria) this;
        }

        public Criteria andKilnFuelAusageGreaterThanOrEqualTo(Double value) {
            addCriterion("KILN_FUEL_AUSAGE >=", value, "kilnFuelAusage");
            return (Criteria) this;
        }

        public Criteria andKilnFuelAusageLessThan(Double value) {
            addCriterion("KILN_FUEL_AUSAGE <", value, "kilnFuelAusage");
            return (Criteria) this;
        }

        public Criteria andKilnFuelAusageLessThanOrEqualTo(Double value) {
            addCriterion("KILN_FUEL_AUSAGE <=", value, "kilnFuelAusage");
            return (Criteria) this;
        }

        public Criteria andKilnFuelAusageIn(List<Double> values) {
            addCriterion("KILN_FUEL_AUSAGE in", values, "kilnFuelAusage");
            return (Criteria) this;
        }

        public Criteria andKilnFuelAusageNotIn(List<Double> values) {
            addCriterion("KILN_FUEL_AUSAGE not in", values, "kilnFuelAusage");
            return (Criteria) this;
        }

        public Criteria andKilnFuelAusageBetween(Double value1, Double value2) {
            addCriterion("KILN_FUEL_AUSAGE between", value1, value2, "kilnFuelAusage");
            return (Criteria) this;
        }

        public Criteria andKilnFuelAusageNotBetween(Double value1, Double value2) {
            addCriterion("KILN_FUEL_AUSAGE not between", value1, value2, "kilnFuelAusage");
            return (Criteria) this;
        }

        public Criteria andKilnFuelAusageunitIsNull() {
            addCriterion("KILN_FUEL_AUSAGEUNIT is null");
            return (Criteria) this;
        }

        public Criteria andKilnFuelAusageunitIsNotNull() {
            addCriterion("KILN_FUEL_AUSAGEUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andKilnFuelAusageunitEqualTo(String value) {
            addCriterion("KILN_FUEL_AUSAGEUNIT =", value, "kilnFuelAusageunit");
            return (Criteria) this;
        }

        public Criteria andKilnFuelAusageunitNotEqualTo(String value) {
            addCriterion("KILN_FUEL_AUSAGEUNIT <>", value, "kilnFuelAusageunit");
            return (Criteria) this;
        }

        public Criteria andKilnFuelAusageunitGreaterThan(String value) {
            addCriterion("KILN_FUEL_AUSAGEUNIT >", value, "kilnFuelAusageunit");
            return (Criteria) this;
        }

        public Criteria andKilnFuelAusageunitGreaterThanOrEqualTo(String value) {
            addCriterion("KILN_FUEL_AUSAGEUNIT >=", value, "kilnFuelAusageunit");
            return (Criteria) this;
        }

        public Criteria andKilnFuelAusageunitLessThan(String value) {
            addCriterion("KILN_FUEL_AUSAGEUNIT <", value, "kilnFuelAusageunit");
            return (Criteria) this;
        }

        public Criteria andKilnFuelAusageunitLessThanOrEqualTo(String value) {
            addCriterion("KILN_FUEL_AUSAGEUNIT <=", value, "kilnFuelAusageunit");
            return (Criteria) this;
        }

        public Criteria andKilnFuelAusageunitLike(String value) {
            addCriterion("KILN_FUEL_AUSAGEUNIT like", value, "kilnFuelAusageunit");
            return (Criteria) this;
        }

        public Criteria andKilnFuelAusageunitNotLike(String value) {
            addCriterion("KILN_FUEL_AUSAGEUNIT not like", value, "kilnFuelAusageunit");
            return (Criteria) this;
        }

        public Criteria andKilnFuelAusageunitIn(List<String> values) {
            addCriterion("KILN_FUEL_AUSAGEUNIT in", values, "kilnFuelAusageunit");
            return (Criteria) this;
        }

        public Criteria andKilnFuelAusageunitNotIn(List<String> values) {
            addCriterion("KILN_FUEL_AUSAGEUNIT not in", values, "kilnFuelAusageunit");
            return (Criteria) this;
        }

        public Criteria andKilnFuelAusageunitBetween(String value1, String value2) {
            addCriterion("KILN_FUEL_AUSAGEUNIT between", value1, value2, "kilnFuelAusageunit");
            return (Criteria) this;
        }

        public Criteria andKilnFuelAusageunitNotBetween(String value1, String value2) {
            addCriterion("KILN_FUEL_AUSAGEUNIT not between", value1, value2, "kilnFuelAusageunit");
            return (Criteria) this;
        }

        public Criteria andNitreremovedecIsNull() {
            addCriterion("NITREREMOVEDEC is null");
            return (Criteria) this;
        }

        public Criteria andNitreremovedecIsNotNull() {
            addCriterion("NITREREMOVEDEC is not null");
            return (Criteria) this;
        }

        public Criteria andNitreremovedecEqualTo(String value) {
            addCriterion("NITREREMOVEDEC =", value, "nitreremovedec");
            return (Criteria) this;
        }

        public Criteria andNitreremovedecNotEqualTo(String value) {
            addCriterion("NITREREMOVEDEC <>", value, "nitreremovedec");
            return (Criteria) this;
        }

        public Criteria andNitreremovedecGreaterThan(String value) {
            addCriterion("NITREREMOVEDEC >", value, "nitreremovedec");
            return (Criteria) this;
        }

        public Criteria andNitreremovedecGreaterThanOrEqualTo(String value) {
            addCriterion("NITREREMOVEDEC >=", value, "nitreremovedec");
            return (Criteria) this;
        }

        public Criteria andNitreremovedecLessThan(String value) {
            addCriterion("NITREREMOVEDEC <", value, "nitreremovedec");
            return (Criteria) this;
        }

        public Criteria andNitreremovedecLessThanOrEqualTo(String value) {
            addCriterion("NITREREMOVEDEC <=", value, "nitreremovedec");
            return (Criteria) this;
        }

        public Criteria andNitreremovedecLike(String value) {
            addCriterion("NITREREMOVEDEC like", value, "nitreremovedec");
            return (Criteria) this;
        }

        public Criteria andNitreremovedecNotLike(String value) {
            addCriterion("NITREREMOVEDEC not like", value, "nitreremovedec");
            return (Criteria) this;
        }

        public Criteria andNitreremovedecIn(List<String> values) {
            addCriterion("NITREREMOVEDEC in", values, "nitreremovedec");
            return (Criteria) this;
        }

        public Criteria andNitreremovedecNotIn(List<String> values) {
            addCriterion("NITREREMOVEDEC not in", values, "nitreremovedec");
            return (Criteria) this;
        }

        public Criteria andNitreremovedecBetween(String value1, String value2) {
            addCriterion("NITREREMOVEDEC between", value1, value2, "nitreremovedec");
            return (Criteria) this;
        }

        public Criteria andNitreremovedecNotBetween(String value1, String value2) {
            addCriterion("NITREREMOVEDEC not between", value1, value2, "nitreremovedec");
            return (Criteria) this;
        }

        public Criteria andNitreremoveidIsNull() {
            addCriterion("NITREREMOVEID is null");
            return (Criteria) this;
        }

        public Criteria andNitreremoveidIsNotNull() {
            addCriterion("NITREREMOVEID is not null");
            return (Criteria) this;
        }

        public Criteria andNitreremoveidEqualTo(Integer value) {
            addCriterion("NITREREMOVEID =", value, "nitreremoveid");
            return (Criteria) this;
        }

        public Criteria andNitreremoveidNotEqualTo(Integer value) {
            addCriterion("NITREREMOVEID <>", value, "nitreremoveid");
            return (Criteria) this;
        }

        public Criteria andNitreremoveidGreaterThan(Integer value) {
            addCriterion("NITREREMOVEID >", value, "nitreremoveid");
            return (Criteria) this;
        }

        public Criteria andNitreremoveidGreaterThanOrEqualTo(Integer value) {
            addCriterion("NITREREMOVEID >=", value, "nitreremoveid");
            return (Criteria) this;
        }

        public Criteria andNitreremoveidLessThan(Integer value) {
            addCriterion("NITREREMOVEID <", value, "nitreremoveid");
            return (Criteria) this;
        }

        public Criteria andNitreremoveidLessThanOrEqualTo(Integer value) {
            addCriterion("NITREREMOVEID <=", value, "nitreremoveid");
            return (Criteria) this;
        }

        public Criteria andNitreremoveidIn(List<Integer> values) {
            addCriterion("NITREREMOVEID in", values, "nitreremoveid");
            return (Criteria) this;
        }

        public Criteria andNitreremoveidNotIn(List<Integer> values) {
            addCriterion("NITREREMOVEID not in", values, "nitreremoveid");
            return (Criteria) this;
        }

        public Criteria andNitreremoveidBetween(Integer value1, Integer value2) {
            addCriterion("NITREREMOVEID between", value1, value2, "nitreremoveid");
            return (Criteria) this;
        }

        public Criteria andNitreremoveidNotBetween(Integer value1, Integer value2) {
            addCriterion("NITREREMOVEID not between", value1, value2, "nitreremoveid");
            return (Criteria) this;
        }

        public Criteria andDustremovedecIsNull() {
            addCriterion("DUSTREMOVEDEC is null");
            return (Criteria) this;
        }

        public Criteria andDustremovedecIsNotNull() {
            addCriterion("DUSTREMOVEDEC is not null");
            return (Criteria) this;
        }

        public Criteria andDustremovedecEqualTo(String value) {
            addCriterion("DUSTREMOVEDEC =", value, "dustremovedec");
            return (Criteria) this;
        }

        public Criteria andDustremovedecNotEqualTo(String value) {
            addCriterion("DUSTREMOVEDEC <>", value, "dustremovedec");
            return (Criteria) this;
        }

        public Criteria andDustremovedecGreaterThan(String value) {
            addCriterion("DUSTREMOVEDEC >", value, "dustremovedec");
            return (Criteria) this;
        }

        public Criteria andDustremovedecGreaterThanOrEqualTo(String value) {
            addCriterion("DUSTREMOVEDEC >=", value, "dustremovedec");
            return (Criteria) this;
        }

        public Criteria andDustremovedecLessThan(String value) {
            addCriterion("DUSTREMOVEDEC <", value, "dustremovedec");
            return (Criteria) this;
        }

        public Criteria andDustremovedecLessThanOrEqualTo(String value) {
            addCriterion("DUSTREMOVEDEC <=", value, "dustremovedec");
            return (Criteria) this;
        }

        public Criteria andDustremovedecLike(String value) {
            addCriterion("DUSTREMOVEDEC like", value, "dustremovedec");
            return (Criteria) this;
        }

        public Criteria andDustremovedecNotLike(String value) {
            addCriterion("DUSTREMOVEDEC not like", value, "dustremovedec");
            return (Criteria) this;
        }

        public Criteria andDustremovedecIn(List<String> values) {
            addCriterion("DUSTREMOVEDEC in", values, "dustremovedec");
            return (Criteria) this;
        }

        public Criteria andDustremovedecNotIn(List<String> values) {
            addCriterion("DUSTREMOVEDEC not in", values, "dustremovedec");
            return (Criteria) this;
        }

        public Criteria andDustremovedecBetween(String value1, String value2) {
            addCriterion("DUSTREMOVEDEC between", value1, value2, "dustremovedec");
            return (Criteria) this;
        }

        public Criteria andDustremovedecNotBetween(String value1, String value2) {
            addCriterion("DUSTREMOVEDEC not between", value1, value2, "dustremovedec");
            return (Criteria) this;
        }

        public Criteria andDustremoveidIsNull() {
            addCriterion("DUSTREMOVEID is null");
            return (Criteria) this;
        }

        public Criteria andDustremoveidIsNotNull() {
            addCriterion("DUSTREMOVEID is not null");
            return (Criteria) this;
        }

        public Criteria andDustremoveidEqualTo(Integer value) {
            addCriterion("DUSTREMOVEID =", value, "dustremoveid");
            return (Criteria) this;
        }

        public Criteria andDustremoveidNotEqualTo(Integer value) {
            addCriterion("DUSTREMOVEID <>", value, "dustremoveid");
            return (Criteria) this;
        }

        public Criteria andDustremoveidGreaterThan(Integer value) {
            addCriterion("DUSTREMOVEID >", value, "dustremoveid");
            return (Criteria) this;
        }

        public Criteria andDustremoveidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DUSTREMOVEID >=", value, "dustremoveid");
            return (Criteria) this;
        }

        public Criteria andDustremoveidLessThan(Integer value) {
            addCriterion("DUSTREMOVEID <", value, "dustremoveid");
            return (Criteria) this;
        }

        public Criteria andDustremoveidLessThanOrEqualTo(Integer value) {
            addCriterion("DUSTREMOVEID <=", value, "dustremoveid");
            return (Criteria) this;
        }

        public Criteria andDustremoveidIn(List<Integer> values) {
            addCriterion("DUSTREMOVEID in", values, "dustremoveid");
            return (Criteria) this;
        }

        public Criteria andDustremoveidNotIn(List<Integer> values) {
            addCriterion("DUSTREMOVEID not in", values, "dustremoveid");
            return (Criteria) this;
        }

        public Criteria andDustremoveidBetween(Integer value1, Integer value2) {
            addCriterion("DUSTREMOVEID between", value1, value2, "dustremoveid");
            return (Criteria) this;
        }

        public Criteria andDustremoveidNotBetween(Integer value1, Integer value2) {
            addCriterion("DUSTREMOVEID not between", value1, value2, "dustremoveid");
            return (Criteria) this;
        }

        public Criteria andSulphurremovedecIsNull() {
            addCriterion("SULPHURREMOVEDEC is null");
            return (Criteria) this;
        }

        public Criteria andSulphurremovedecIsNotNull() {
            addCriterion("SULPHURREMOVEDEC is not null");
            return (Criteria) this;
        }

        public Criteria andSulphurremovedecEqualTo(String value) {
            addCriterion("SULPHURREMOVEDEC =", value, "sulphurremovedec");
            return (Criteria) this;
        }

        public Criteria andSulphurremovedecNotEqualTo(String value) {
            addCriterion("SULPHURREMOVEDEC <>", value, "sulphurremovedec");
            return (Criteria) this;
        }

        public Criteria andSulphurremovedecGreaterThan(String value) {
            addCriterion("SULPHURREMOVEDEC >", value, "sulphurremovedec");
            return (Criteria) this;
        }

        public Criteria andSulphurremovedecGreaterThanOrEqualTo(String value) {
            addCriterion("SULPHURREMOVEDEC >=", value, "sulphurremovedec");
            return (Criteria) this;
        }

        public Criteria andSulphurremovedecLessThan(String value) {
            addCriterion("SULPHURREMOVEDEC <", value, "sulphurremovedec");
            return (Criteria) this;
        }

        public Criteria andSulphurremovedecLessThanOrEqualTo(String value) {
            addCriterion("SULPHURREMOVEDEC <=", value, "sulphurremovedec");
            return (Criteria) this;
        }

        public Criteria andSulphurremovedecLike(String value) {
            addCriterion("SULPHURREMOVEDEC like", value, "sulphurremovedec");
            return (Criteria) this;
        }

        public Criteria andSulphurremovedecNotLike(String value) {
            addCriterion("SULPHURREMOVEDEC not like", value, "sulphurremovedec");
            return (Criteria) this;
        }

        public Criteria andSulphurremovedecIn(List<String> values) {
            addCriterion("SULPHURREMOVEDEC in", values, "sulphurremovedec");
            return (Criteria) this;
        }

        public Criteria andSulphurremovedecNotIn(List<String> values) {
            addCriterion("SULPHURREMOVEDEC not in", values, "sulphurremovedec");
            return (Criteria) this;
        }

        public Criteria andSulphurremovedecBetween(String value1, String value2) {
            addCriterion("SULPHURREMOVEDEC between", value1, value2, "sulphurremovedec");
            return (Criteria) this;
        }

        public Criteria andSulphurremovedecNotBetween(String value1, String value2) {
            addCriterion("SULPHURREMOVEDEC not between", value1, value2, "sulphurremovedec");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveidIsNull() {
            addCriterion("SULPHURREMOVEID is null");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveidIsNotNull() {
            addCriterion("SULPHURREMOVEID is not null");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveidEqualTo(Integer value) {
            addCriterion("SULPHURREMOVEID =", value, "sulphurremoveid");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveidNotEqualTo(Integer value) {
            addCriterion("SULPHURREMOVEID <>", value, "sulphurremoveid");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveidGreaterThan(Integer value) {
            addCriterion("SULPHURREMOVEID >", value, "sulphurremoveid");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SULPHURREMOVEID >=", value, "sulphurremoveid");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveidLessThan(Integer value) {
            addCriterion("SULPHURREMOVEID <", value, "sulphurremoveid");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveidLessThanOrEqualTo(Integer value) {
            addCriterion("SULPHURREMOVEID <=", value, "sulphurremoveid");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveidIn(List<Integer> values) {
            addCriterion("SULPHURREMOVEID in", values, "sulphurremoveid");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveidNotIn(List<Integer> values) {
            addCriterion("SULPHURREMOVEID not in", values, "sulphurremoveid");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveidBetween(Integer value1, Integer value2) {
            addCriterion("SULPHURREMOVEID between", value1, value2, "sulphurremoveid");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveidNotBetween(Integer value1, Integer value2) {
            addCriterion("SULPHURREMOVEID not between", value1, value2, "sulphurremoveid");
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

        public Criteria andExfNoEqualTo(Byte value) {
            addCriterion("EXF_NO =", value, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoNotEqualTo(Byte value) {
            addCriterion("EXF_NO <>", value, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoGreaterThan(Byte value) {
            addCriterion("EXF_NO >", value, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoGreaterThanOrEqualTo(Byte value) {
            addCriterion("EXF_NO >=", value, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoLessThan(Byte value) {
            addCriterion("EXF_NO <", value, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoLessThanOrEqualTo(Byte value) {
            addCriterion("EXF_NO <=", value, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoIn(List<Byte> values) {
            addCriterion("EXF_NO in", values, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoNotIn(List<Byte> values) {
            addCriterion("EXF_NO not in", values, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoBetween(Byte value1, Byte value2) {
            addCriterion("EXF_NO between", value1, value2, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoNotBetween(Byte value1, Byte value2) {
            addCriterion("EXF_NO not between", value1, value2, "exfNo");
            return (Criteria) this;
        }

        public Criteria andCoalashIsNull() {
            addCriterion("COALASH is null");
            return (Criteria) this;
        }

        public Criteria andCoalashIsNotNull() {
            addCriterion("COALASH is not null");
            return (Criteria) this;
        }

        public Criteria andCoalashEqualTo(Double value) {
            addCriterion("COALASH =", value, "coalash");
            return (Criteria) this;
        }

        public Criteria andCoalashNotEqualTo(Double value) {
            addCriterion("COALASH <>", value, "coalash");
            return (Criteria) this;
        }

        public Criteria andCoalashGreaterThan(Double value) {
            addCriterion("COALASH >", value, "coalash");
            return (Criteria) this;
        }

        public Criteria andCoalashGreaterThanOrEqualTo(Double value) {
            addCriterion("COALASH >=", value, "coalash");
            return (Criteria) this;
        }

        public Criteria andCoalashLessThan(Double value) {
            addCriterion("COALASH <", value, "coalash");
            return (Criteria) this;
        }

        public Criteria andCoalashLessThanOrEqualTo(Double value) {
            addCriterion("COALASH <=", value, "coalash");
            return (Criteria) this;
        }

        public Criteria andCoalashIn(List<Double> values) {
            addCriterion("COALASH in", values, "coalash");
            return (Criteria) this;
        }

        public Criteria andCoalashNotIn(List<Double> values) {
            addCriterion("COALASH not in", values, "coalash");
            return (Criteria) this;
        }

        public Criteria andCoalashBetween(Double value1, Double value2) {
            addCriterion("COALASH between", value1, value2, "coalash");
            return (Criteria) this;
        }

        public Criteria andCoalashNotBetween(Double value1, Double value2) {
            addCriterion("COALASH not between", value1, value2, "coalash");
            return (Criteria) this;
        }

        public Criteria andCoalVolatilisationIsNull() {
            addCriterion("coal_volatilisation is null");
            return (Criteria) this;
        }

        public Criteria andCoalVolatilisationIsNotNull() {
            addCriterion("coal_volatilisation is not null");
            return (Criteria) this;
        }

        public Criteria andCoalVolatilisationEqualTo(Double value) {
            addCriterion("coal_volatilisation =", value, "coalVolatilisation");
            return (Criteria) this;
        }

        public Criteria andCoalVolatilisationNotEqualTo(Double value) {
            addCriterion("coal_volatilisation <>", value, "coalVolatilisation");
            return (Criteria) this;
        }

        public Criteria andCoalVolatilisationGreaterThan(Double value) {
            addCriterion("coal_volatilisation >", value, "coalVolatilisation");
            return (Criteria) this;
        }

        public Criteria andCoalVolatilisationGreaterThanOrEqualTo(Double value) {
            addCriterion("coal_volatilisation >=", value, "coalVolatilisation");
            return (Criteria) this;
        }

        public Criteria andCoalVolatilisationLessThan(Double value) {
            addCriterion("coal_volatilisation <", value, "coalVolatilisation");
            return (Criteria) this;
        }

        public Criteria andCoalVolatilisationLessThanOrEqualTo(Double value) {
            addCriterion("coal_volatilisation <=", value, "coalVolatilisation");
            return (Criteria) this;
        }

        public Criteria andCoalVolatilisationIn(List<Double> values) {
            addCriterion("coal_volatilisation in", values, "coalVolatilisation");
            return (Criteria) this;
        }

        public Criteria andCoalVolatilisationNotIn(List<Double> values) {
            addCriterion("coal_volatilisation not in", values, "coalVolatilisation");
            return (Criteria) this;
        }

        public Criteria andCoalVolatilisationBetween(Double value1, Double value2) {
            addCriterion("coal_volatilisation between", value1, value2, "coalVolatilisation");
            return (Criteria) this;
        }

        public Criteria andCoalVolatilisationNotBetween(Double value1, Double value2) {
            addCriterion("coal_volatilisation not between", value1, value2, "coalVolatilisation");
            return (Criteria) this;
        }

        public Criteria andCoalsulfurIsNull() {
            addCriterion("COALSULFUR is null");
            return (Criteria) this;
        }

        public Criteria andCoalsulfurIsNotNull() {
            addCriterion("COALSULFUR is not null");
            return (Criteria) this;
        }

        public Criteria andCoalsulfurEqualTo(Double value) {
            addCriterion("COALSULFUR =", value, "coalsulfur");
            return (Criteria) this;
        }

        public Criteria andCoalsulfurNotEqualTo(Double value) {
            addCriterion("COALSULFUR <>", value, "coalsulfur");
            return (Criteria) this;
        }

        public Criteria andCoalsulfurGreaterThan(Double value) {
            addCriterion("COALSULFUR >", value, "coalsulfur");
            return (Criteria) this;
        }

        public Criteria andCoalsulfurGreaterThanOrEqualTo(Double value) {
            addCriterion("COALSULFUR >=", value, "coalsulfur");
            return (Criteria) this;
        }

        public Criteria andCoalsulfurLessThan(Double value) {
            addCriterion("COALSULFUR <", value, "coalsulfur");
            return (Criteria) this;
        }

        public Criteria andCoalsulfurLessThanOrEqualTo(Double value) {
            addCriterion("COALSULFUR <=", value, "coalsulfur");
            return (Criteria) this;
        }

        public Criteria andCoalsulfurIn(List<Double> values) {
            addCriterion("COALSULFUR in", values, "coalsulfur");
            return (Criteria) this;
        }

        public Criteria andCoalsulfurNotIn(List<Double> values) {
            addCriterion("COALSULFUR not in", values, "coalsulfur");
            return (Criteria) this;
        }

        public Criteria andCoalsulfurBetween(Double value1, Double value2) {
            addCriterion("COALSULFUR between", value1, value2, "coalsulfur");
            return (Criteria) this;
        }

        public Criteria andCoalsulfurNotBetween(Double value1, Double value2) {
            addCriterion("COALSULFUR not between", value1, value2, "coalsulfur");
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

        public Criteria andPm10IsNull() {
            addCriterion("PM10 is null");
            return (Criteria) this;
        }

        public Criteria andPm10IsNotNull() {
            addCriterion("PM10 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10EqualTo(Double value) {
            addCriterion("PM10 =", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10NotEqualTo(Double value) {
            addCriterion("PM10 <>", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10GreaterThan(Double value) {
            addCriterion("PM10 >", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10GreaterThanOrEqualTo(Double value) {
            addCriterion("PM10 >=", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10LessThan(Double value) {
            addCriterion("PM10 <", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10LessThanOrEqualTo(Double value) {
            addCriterion("PM10 <=", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10In(List<Double> values) {
            addCriterion("PM10 in", values, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10NotIn(List<Double> values) {
            addCriterion("PM10 not in", values, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10Between(Double value1, Double value2) {
            addCriterion("PM10 between", value1, value2, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10NotBetween(Double value1, Double value2) {
            addCriterion("PM10 not between", value1, value2, "pm10");
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

        public Criteria andPm25IsNull() {
            addCriterion("PM25 is null");
            return (Criteria) this;
        }

        public Criteria andPm25IsNotNull() {
            addCriterion("PM25 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25EqualTo(Double value) {
            addCriterion("PM25 =", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25NotEqualTo(Double value) {
            addCriterion("PM25 <>", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25GreaterThan(Double value) {
            addCriterion("PM25 >", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25GreaterThanOrEqualTo(Double value) {
            addCriterion("PM25 >=", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25LessThan(Double value) {
            addCriterion("PM25 <", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25LessThanOrEqualTo(Double value) {
            addCriterion("PM25 <=", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25In(List<Double> values) {
            addCriterion("PM25 in", values, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25NotIn(List<Double> values) {
            addCriterion("PM25 not in", values, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25Between(Double value1, Double value2) {
            addCriterion("PM25 between", value1, value2, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25NotBetween(Double value1, Double value2) {
            addCriterion("PM25 not between", value1, value2, "pm25");
            return (Criteria) this;
        }

        public Criteria andFactorCoIsNull() {
            addCriterion("factor_CO is null");
            return (Criteria) this;
        }

        public Criteria andFactorCoIsNotNull() {
            addCriterion("factor_CO is not null");
            return (Criteria) this;
        }

        public Criteria andFactorCoEqualTo(Double value) {
            addCriterion("factor_CO =", value, "factorCo");
            return (Criteria) this;
        }

        public Criteria andFactorCoNotEqualTo(Double value) {
            addCriterion("factor_CO <>", value, "factorCo");
            return (Criteria) this;
        }

        public Criteria andFactorCoGreaterThan(Double value) {
            addCriterion("factor_CO >", value, "factorCo");
            return (Criteria) this;
        }

        public Criteria andFactorCoGreaterThanOrEqualTo(Double value) {
            addCriterion("factor_CO >=", value, "factorCo");
            return (Criteria) this;
        }

        public Criteria andFactorCoLessThan(Double value) {
            addCriterion("factor_CO <", value, "factorCo");
            return (Criteria) this;
        }

        public Criteria andFactorCoLessThanOrEqualTo(Double value) {
            addCriterion("factor_CO <=", value, "factorCo");
            return (Criteria) this;
        }

        public Criteria andFactorCoIn(List<Double> values) {
            addCriterion("factor_CO in", values, "factorCo");
            return (Criteria) this;
        }

        public Criteria andFactorCoNotIn(List<Double> values) {
            addCriterion("factor_CO not in", values, "factorCo");
            return (Criteria) this;
        }

        public Criteria andFactorCoBetween(Double value1, Double value2) {
            addCriterion("factor_CO between", value1, value2, "factorCo");
            return (Criteria) this;
        }

        public Criteria andFactorCoNotBetween(Double value1, Double value2) {
            addCriterion("factor_CO not between", value1, value2, "factorCo");
            return (Criteria) this;
        }

        public Criteria andCoIsNull() {
            addCriterion("CO is null");
            return (Criteria) this;
        }

        public Criteria andCoIsNotNull() {
            addCriterion("CO is not null");
            return (Criteria) this;
        }

        public Criteria andCoEqualTo(Double value) {
            addCriterion("CO =", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoNotEqualTo(Double value) {
            addCriterion("CO <>", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoGreaterThan(Double value) {
            addCriterion("CO >", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoGreaterThanOrEqualTo(Double value) {
            addCriterion("CO >=", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoLessThan(Double value) {
            addCriterion("CO <", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoLessThanOrEqualTo(Double value) {
            addCriterion("CO <=", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoIn(List<Double> values) {
            addCriterion("CO in", values, "co");
            return (Criteria) this;
        }

        public Criteria andCoNotIn(List<Double> values) {
            addCriterion("CO not in", values, "co");
            return (Criteria) this;
        }

        public Criteria andCoBetween(Double value1, Double value2) {
            addCriterion("CO between", value1, value2, "co");
            return (Criteria) this;
        }

        public Criteria andCoNotBetween(Double value1, Double value2) {
            addCriterion("CO not between", value1, value2, "co");
            return (Criteria) this;
        }

        public Criteria andFactorVocIsNull() {
            addCriterion("factor_VOC is null");
            return (Criteria) this;
        }

        public Criteria andFactorVocIsNotNull() {
            addCriterion("factor_VOC is not null");
            return (Criteria) this;
        }

        public Criteria andFactorVocEqualTo(Double value) {
            addCriterion("factor_VOC =", value, "factorVoc");
            return (Criteria) this;
        }

        public Criteria andFactorVocNotEqualTo(Double value) {
            addCriterion("factor_VOC <>", value, "factorVoc");
            return (Criteria) this;
        }

        public Criteria andFactorVocGreaterThan(Double value) {
            addCriterion("factor_VOC >", value, "factorVoc");
            return (Criteria) this;
        }

        public Criteria andFactorVocGreaterThanOrEqualTo(Double value) {
            addCriterion("factor_VOC >=", value, "factorVoc");
            return (Criteria) this;
        }

        public Criteria andFactorVocLessThan(Double value) {
            addCriterion("factor_VOC <", value, "factorVoc");
            return (Criteria) this;
        }

        public Criteria andFactorVocLessThanOrEqualTo(Double value) {
            addCriterion("factor_VOC <=", value, "factorVoc");
            return (Criteria) this;
        }

        public Criteria andFactorVocIn(List<Double> values) {
            addCriterion("factor_VOC in", values, "factorVoc");
            return (Criteria) this;
        }

        public Criteria andFactorVocNotIn(List<Double> values) {
            addCriterion("factor_VOC not in", values, "factorVoc");
            return (Criteria) this;
        }

        public Criteria andFactorVocBetween(Double value1, Double value2) {
            addCriterion("factor_VOC between", value1, value2, "factorVoc");
            return (Criteria) this;
        }

        public Criteria andFactorVocNotBetween(Double value1, Double value2) {
            addCriterion("factor_VOC not between", value1, value2, "factorVoc");
            return (Criteria) this;
        }

        public Criteria andVocIsNull() {
            addCriterion("VOC is null");
            return (Criteria) this;
        }

        public Criteria andVocIsNotNull() {
            addCriterion("VOC is not null");
            return (Criteria) this;
        }

        public Criteria andVocEqualTo(Double value) {
            addCriterion("VOC =", value, "voc");
            return (Criteria) this;
        }

        public Criteria andVocNotEqualTo(Double value) {
            addCriterion("VOC <>", value, "voc");
            return (Criteria) this;
        }

        public Criteria andVocGreaterThan(Double value) {
            addCriterion("VOC >", value, "voc");
            return (Criteria) this;
        }

        public Criteria andVocGreaterThanOrEqualTo(Double value) {
            addCriterion("VOC >=", value, "voc");
            return (Criteria) this;
        }

        public Criteria andVocLessThan(Double value) {
            addCriterion("VOC <", value, "voc");
            return (Criteria) this;
        }

        public Criteria andVocLessThanOrEqualTo(Double value) {
            addCriterion("VOC <=", value, "voc");
            return (Criteria) this;
        }

        public Criteria andVocIn(List<Double> values) {
            addCriterion("VOC in", values, "voc");
            return (Criteria) this;
        }

        public Criteria andVocNotIn(List<Double> values) {
            addCriterion("VOC not in", values, "voc");
            return (Criteria) this;
        }

        public Criteria andVocBetween(Double value1, Double value2) {
            addCriterion("VOC between", value1, value2, "voc");
            return (Criteria) this;
        }

        public Criteria andVocNotBetween(Double value1, Double value2) {
            addCriterion("VOC not between", value1, value2, "voc");
            return (Criteria) this;
        }

        public Criteria andFactorPmIsNull() {
            addCriterion("factor_PM is null");
            return (Criteria) this;
        }

        public Criteria andFactorPmIsNotNull() {
            addCriterion("factor_PM is not null");
            return (Criteria) this;
        }

        public Criteria andFactorPmEqualTo(Double value) {
            addCriterion("factor_PM =", value, "factorPm");
            return (Criteria) this;
        }

        public Criteria andFactorPmNotEqualTo(Double value) {
            addCriterion("factor_PM <>", value, "factorPm");
            return (Criteria) this;
        }

        public Criteria andFactorPmGreaterThan(Double value) {
            addCriterion("factor_PM >", value, "factorPm");
            return (Criteria) this;
        }

        public Criteria andFactorPmGreaterThanOrEqualTo(Double value) {
            addCriterion("factor_PM >=", value, "factorPm");
            return (Criteria) this;
        }

        public Criteria andFactorPmLessThan(Double value) {
            addCriterion("factor_PM <", value, "factorPm");
            return (Criteria) this;
        }

        public Criteria andFactorPmLessThanOrEqualTo(Double value) {
            addCriterion("factor_PM <=", value, "factorPm");
            return (Criteria) this;
        }

        public Criteria andFactorPmIn(List<Double> values) {
            addCriterion("factor_PM in", values, "factorPm");
            return (Criteria) this;
        }

        public Criteria andFactorPmNotIn(List<Double> values) {
            addCriterion("factor_PM not in", values, "factorPm");
            return (Criteria) this;
        }

        public Criteria andFactorPmBetween(Double value1, Double value2) {
            addCriterion("factor_PM between", value1, value2, "factorPm");
            return (Criteria) this;
        }

        public Criteria andFactorPmNotBetween(Double value1, Double value2) {
            addCriterion("factor_PM not between", value1, value2, "factorPm");
            return (Criteria) this;
        }

        public Criteria andPmIsNull() {
            addCriterion("PM is null");
            return (Criteria) this;
        }

        public Criteria andPmIsNotNull() {
            addCriterion("PM is not null");
            return (Criteria) this;
        }

        public Criteria andPmEqualTo(Double value) {
            addCriterion("PM =", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmNotEqualTo(Double value) {
            addCriterion("PM <>", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmGreaterThan(Double value) {
            addCriterion("PM >", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmGreaterThanOrEqualTo(Double value) {
            addCriterion("PM >=", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmLessThan(Double value) {
            addCriterion("PM <", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmLessThanOrEqualTo(Double value) {
            addCriterion("PM <=", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmIn(List<Double> values) {
            addCriterion("PM in", values, "pm");
            return (Criteria) this;
        }

        public Criteria andPmNotIn(List<Double> values) {
            addCriterion("PM not in", values, "pm");
            return (Criteria) this;
        }

        public Criteria andPmBetween(Double value1, Double value2) {
            addCriterion("PM between", value1, value2, "pm");
            return (Criteria) this;
        }

        public Criteria andPmNotBetween(Double value1, Double value2) {
            addCriterion("PM not between", value1, value2, "pm");
            return (Criteria) this;
        }

        public Criteria andFactorSo2IsNull() {
            addCriterion("factor_SO2 is null");
            return (Criteria) this;
        }

        public Criteria andFactorSo2IsNotNull() {
            addCriterion("factor_SO2 is not null");
            return (Criteria) this;
        }

        public Criteria andFactorSo2EqualTo(Double value) {
            addCriterion("factor_SO2 =", value, "factorSo2");
            return (Criteria) this;
        }

        public Criteria andFactorSo2NotEqualTo(Double value) {
            addCriterion("factor_SO2 <>", value, "factorSo2");
            return (Criteria) this;
        }

        public Criteria andFactorSo2GreaterThan(Double value) {
            addCriterion("factor_SO2 >", value, "factorSo2");
            return (Criteria) this;
        }

        public Criteria andFactorSo2GreaterThanOrEqualTo(Double value) {
            addCriterion("factor_SO2 >=", value, "factorSo2");
            return (Criteria) this;
        }

        public Criteria andFactorSo2LessThan(Double value) {
            addCriterion("factor_SO2 <", value, "factorSo2");
            return (Criteria) this;
        }

        public Criteria andFactorSo2LessThanOrEqualTo(Double value) {
            addCriterion("factor_SO2 <=", value, "factorSo2");
            return (Criteria) this;
        }

        public Criteria andFactorSo2In(List<Double> values) {
            addCriterion("factor_SO2 in", values, "factorSo2");
            return (Criteria) this;
        }

        public Criteria andFactorSo2NotIn(List<Double> values) {
            addCriterion("factor_SO2 not in", values, "factorSo2");
            return (Criteria) this;
        }

        public Criteria andFactorSo2Between(Double value1, Double value2) {
            addCriterion("factor_SO2 between", value1, value2, "factorSo2");
            return (Criteria) this;
        }

        public Criteria andFactorSo2NotBetween(Double value1, Double value2) {
            addCriterion("factor_SO2 not between", value1, value2, "factorSo2");
            return (Criteria) this;
        }

        public Criteria andSo2IsNull() {
            addCriterion("SO2 is null");
            return (Criteria) this;
        }

        public Criteria andSo2IsNotNull() {
            addCriterion("SO2 is not null");
            return (Criteria) this;
        }

        public Criteria andSo2EqualTo(Double value) {
            addCriterion("SO2 =", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2NotEqualTo(Double value) {
            addCriterion("SO2 <>", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2GreaterThan(Double value) {
            addCriterion("SO2 >", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2GreaterThanOrEqualTo(Double value) {
            addCriterion("SO2 >=", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2LessThan(Double value) {
            addCriterion("SO2 <", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2LessThanOrEqualTo(Double value) {
            addCriterion("SO2 <=", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2In(List<Double> values) {
            addCriterion("SO2 in", values, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2NotIn(List<Double> values) {
            addCriterion("SO2 not in", values, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2Between(Double value1, Double value2) {
            addCriterion("SO2 between", value1, value2, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2NotBetween(Double value1, Double value2) {
            addCriterion("SO2 not between", value1, value2, "so2");
            return (Criteria) this;
        }

        public Criteria andFactorNoxIsNull() {
            addCriterion("factor_NOX is null");
            return (Criteria) this;
        }

        public Criteria andFactorNoxIsNotNull() {
            addCriterion("factor_NOX is not null");
            return (Criteria) this;
        }

        public Criteria andFactorNoxEqualTo(Double value) {
            addCriterion("factor_NOX =", value, "factorNox");
            return (Criteria) this;
        }

        public Criteria andFactorNoxNotEqualTo(Double value) {
            addCriterion("factor_NOX <>", value, "factorNox");
            return (Criteria) this;
        }

        public Criteria andFactorNoxGreaterThan(Double value) {
            addCriterion("factor_NOX >", value, "factorNox");
            return (Criteria) this;
        }

        public Criteria andFactorNoxGreaterThanOrEqualTo(Double value) {
            addCriterion("factor_NOX >=", value, "factorNox");
            return (Criteria) this;
        }

        public Criteria andFactorNoxLessThan(Double value) {
            addCriterion("factor_NOX <", value, "factorNox");
            return (Criteria) this;
        }

        public Criteria andFactorNoxLessThanOrEqualTo(Double value) {
            addCriterion("factor_NOX <=", value, "factorNox");
            return (Criteria) this;
        }

        public Criteria andFactorNoxIn(List<Double> values) {
            addCriterion("factor_NOX in", values, "factorNox");
            return (Criteria) this;
        }

        public Criteria andFactorNoxNotIn(List<Double> values) {
            addCriterion("factor_NOX not in", values, "factorNox");
            return (Criteria) this;
        }

        public Criteria andFactorNoxBetween(Double value1, Double value2) {
            addCriterion("factor_NOX between", value1, value2, "factorNox");
            return (Criteria) this;
        }

        public Criteria andFactorNoxNotBetween(Double value1, Double value2) {
            addCriterion("factor_NOX not between", value1, value2, "factorNox");
            return (Criteria) this;
        }

        public Criteria andNoxIsNull() {
            addCriterion("NOX is null");
            return (Criteria) this;
        }

        public Criteria andNoxIsNotNull() {
            addCriterion("NOX is not null");
            return (Criteria) this;
        }

        public Criteria andNoxEqualTo(Double value) {
            addCriterion("NOX =", value, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxNotEqualTo(Double value) {
            addCriterion("NOX <>", value, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxGreaterThan(Double value) {
            addCriterion("NOX >", value, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxGreaterThanOrEqualTo(Double value) {
            addCriterion("NOX >=", value, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxLessThan(Double value) {
            addCriterion("NOX <", value, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxLessThanOrEqualTo(Double value) {
            addCriterion("NOX <=", value, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxIn(List<Double> values) {
            addCriterion("NOX in", values, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxNotIn(List<Double> values) {
            addCriterion("NOX not in", values, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxBetween(Double value1, Double value2) {
            addCriterion("NOX between", value1, value2, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxNotBetween(Double value1, Double value2) {
            addCriterion("NOX not between", value1, value2, "nox");
            return (Criteria) this;
        }

        public Criteria andFactorNh3IsNull() {
            addCriterion("factor_NH3 is null");
            return (Criteria) this;
        }

        public Criteria andFactorNh3IsNotNull() {
            addCriterion("factor_NH3 is not null");
            return (Criteria) this;
        }

        public Criteria andFactorNh3EqualTo(Double value) {
            addCriterion("factor_NH3 =", value, "factorNh3");
            return (Criteria) this;
        }

        public Criteria andFactorNh3NotEqualTo(Double value) {
            addCriterion("factor_NH3 <>", value, "factorNh3");
            return (Criteria) this;
        }

        public Criteria andFactorNh3GreaterThan(Double value) {
            addCriterion("factor_NH3 >", value, "factorNh3");
            return (Criteria) this;
        }

        public Criteria andFactorNh3GreaterThanOrEqualTo(Double value) {
            addCriterion("factor_NH3 >=", value, "factorNh3");
            return (Criteria) this;
        }

        public Criteria andFactorNh3LessThan(Double value) {
            addCriterion("factor_NH3 <", value, "factorNh3");
            return (Criteria) this;
        }

        public Criteria andFactorNh3LessThanOrEqualTo(Double value) {
            addCriterion("factor_NH3 <=", value, "factorNh3");
            return (Criteria) this;
        }

        public Criteria andFactorNh3In(List<Double> values) {
            addCriterion("factor_NH3 in", values, "factorNh3");
            return (Criteria) this;
        }

        public Criteria andFactorNh3NotIn(List<Double> values) {
            addCriterion("factor_NH3 not in", values, "factorNh3");
            return (Criteria) this;
        }

        public Criteria andFactorNh3Between(Double value1, Double value2) {
            addCriterion("factor_NH3 between", value1, value2, "factorNh3");
            return (Criteria) this;
        }

        public Criteria andFactorNh3NotBetween(Double value1, Double value2) {
            addCriterion("factor_NH3 not between", value1, value2, "factorNh3");
            return (Criteria) this;
        }

        public Criteria andNh3IsNull() {
            addCriterion("NH3 is null");
            return (Criteria) this;
        }

        public Criteria andNh3IsNotNull() {
            addCriterion("NH3 is not null");
            return (Criteria) this;
        }

        public Criteria andNh3EqualTo(Double value) {
            addCriterion("NH3 =", value, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3NotEqualTo(Double value) {
            addCriterion("NH3 <>", value, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3GreaterThan(Double value) {
            addCriterion("NH3 >", value, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3GreaterThanOrEqualTo(Double value) {
            addCriterion("NH3 >=", value, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3LessThan(Double value) {
            addCriterion("NH3 <", value, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3LessThanOrEqualTo(Double value) {
            addCriterion("NH3 <=", value, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3In(List<Double> values) {
            addCriterion("NH3 in", values, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3NotIn(List<Double> values) {
            addCriterion("NH3 not in", values, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3Between(Double value1, Double value2) {
            addCriterion("NH3 between", value1, value2, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3NotBetween(Double value1, Double value2) {
            addCriterion("NH3 not between", value1, value2, "nh3");
            return (Criteria) this;
        }

        public Criteria andFactorOcIsNull() {
            addCriterion("factor_OC is null");
            return (Criteria) this;
        }

        public Criteria andFactorOcIsNotNull() {
            addCriterion("factor_OC is not null");
            return (Criteria) this;
        }

        public Criteria andFactorOcEqualTo(Double value) {
            addCriterion("factor_OC =", value, "factorOc");
            return (Criteria) this;
        }

        public Criteria andFactorOcNotEqualTo(Double value) {
            addCriterion("factor_OC <>", value, "factorOc");
            return (Criteria) this;
        }

        public Criteria andFactorOcGreaterThan(Double value) {
            addCriterion("factor_OC >", value, "factorOc");
            return (Criteria) this;
        }

        public Criteria andFactorOcGreaterThanOrEqualTo(Double value) {
            addCriterion("factor_OC >=", value, "factorOc");
            return (Criteria) this;
        }

        public Criteria andFactorOcLessThan(Double value) {
            addCriterion("factor_OC <", value, "factorOc");
            return (Criteria) this;
        }

        public Criteria andFactorOcLessThanOrEqualTo(Double value) {
            addCriterion("factor_OC <=", value, "factorOc");
            return (Criteria) this;
        }

        public Criteria andFactorOcIn(List<Double> values) {
            addCriterion("factor_OC in", values, "factorOc");
            return (Criteria) this;
        }

        public Criteria andFactorOcNotIn(List<Double> values) {
            addCriterion("factor_OC not in", values, "factorOc");
            return (Criteria) this;
        }

        public Criteria andFactorOcBetween(Double value1, Double value2) {
            addCriterion("factor_OC between", value1, value2, "factorOc");
            return (Criteria) this;
        }

        public Criteria andFactorOcNotBetween(Double value1, Double value2) {
            addCriterion("factor_OC not between", value1, value2, "factorOc");
            return (Criteria) this;
        }

        public Criteria andOcIsNull() {
            addCriterion("OC is null");
            return (Criteria) this;
        }

        public Criteria andOcIsNotNull() {
            addCriterion("OC is not null");
            return (Criteria) this;
        }

        public Criteria andOcEqualTo(Double value) {
            addCriterion("OC =", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcNotEqualTo(Double value) {
            addCriterion("OC <>", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcGreaterThan(Double value) {
            addCriterion("OC >", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcGreaterThanOrEqualTo(Double value) {
            addCriterion("OC >=", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcLessThan(Double value) {
            addCriterion("OC <", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcLessThanOrEqualTo(Double value) {
            addCriterion("OC <=", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcIn(List<Double> values) {
            addCriterion("OC in", values, "oc");
            return (Criteria) this;
        }

        public Criteria andOcNotIn(List<Double> values) {
            addCriterion("OC not in", values, "oc");
            return (Criteria) this;
        }

        public Criteria andOcBetween(Double value1, Double value2) {
            addCriterion("OC between", value1, value2, "oc");
            return (Criteria) this;
        }

        public Criteria andOcNotBetween(Double value1, Double value2) {
            addCriterion("OC not between", value1, value2, "oc");
            return (Criteria) this;
        }

        public Criteria andFactorBcIsNull() {
            addCriterion("factor_BC is null");
            return (Criteria) this;
        }

        public Criteria andFactorBcIsNotNull() {
            addCriterion("factor_BC is not null");
            return (Criteria) this;
        }

        public Criteria andFactorBcEqualTo(Double value) {
            addCriterion("factor_BC =", value, "factorBc");
            return (Criteria) this;
        }

        public Criteria andFactorBcNotEqualTo(Double value) {
            addCriterion("factor_BC <>", value, "factorBc");
            return (Criteria) this;
        }

        public Criteria andFactorBcGreaterThan(Double value) {
            addCriterion("factor_BC >", value, "factorBc");
            return (Criteria) this;
        }

        public Criteria andFactorBcGreaterThanOrEqualTo(Double value) {
            addCriterion("factor_BC >=", value, "factorBc");
            return (Criteria) this;
        }

        public Criteria andFactorBcLessThan(Double value) {
            addCriterion("factor_BC <", value, "factorBc");
            return (Criteria) this;
        }

        public Criteria andFactorBcLessThanOrEqualTo(Double value) {
            addCriterion("factor_BC <=", value, "factorBc");
            return (Criteria) this;
        }

        public Criteria andFactorBcIn(List<Double> values) {
            addCriterion("factor_BC in", values, "factorBc");
            return (Criteria) this;
        }

        public Criteria andFactorBcNotIn(List<Double> values) {
            addCriterion("factor_BC not in", values, "factorBc");
            return (Criteria) this;
        }

        public Criteria andFactorBcBetween(Double value1, Double value2) {
            addCriterion("factor_BC between", value1, value2, "factorBc");
            return (Criteria) this;
        }

        public Criteria andFactorBcNotBetween(Double value1, Double value2) {
            addCriterion("factor_BC not between", value1, value2, "factorBc");
            return (Criteria) this;
        }

        public Criteria andBcIsNull() {
            addCriterion("BC is null");
            return (Criteria) this;
        }

        public Criteria andBcIsNotNull() {
            addCriterion("BC is not null");
            return (Criteria) this;
        }

        public Criteria andBcEqualTo(Double value) {
            addCriterion("BC =", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcNotEqualTo(Double value) {
            addCriterion("BC <>", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcGreaterThan(Double value) {
            addCriterion("BC >", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcGreaterThanOrEqualTo(Double value) {
            addCriterion("BC >=", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcLessThan(Double value) {
            addCriterion("BC <", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcLessThanOrEqualTo(Double value) {
            addCriterion("BC <=", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcIn(List<Double> values) {
            addCriterion("BC in", values, "bc");
            return (Criteria) this;
        }

        public Criteria andBcNotIn(List<Double> values) {
            addCriterion("BC not in", values, "bc");
            return (Criteria) this;
        }

        public Criteria andBcBetween(Double value1, Double value2) {
            addCriterion("BC between", value1, value2, "bc");
            return (Criteria) this;
        }

        public Criteria andBcNotBetween(Double value1, Double value2) {
            addCriterion("BC not between", value1, value2, "bc");
            return (Criteria) this;
        }

        public Criteria andScccodeIsNull() {
            addCriterion("SCCCODE is null");
            return (Criteria) this;
        }

        public Criteria andScccodeIsNotNull() {
            addCriterion("SCCCODE is not null");
            return (Criteria) this;
        }

        public Criteria andScccodeEqualTo(String value) {
            addCriterion("SCCCODE =", value, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeNotEqualTo(String value) {
            addCriterion("SCCCODE <>", value, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeGreaterThan(String value) {
            addCriterion("SCCCODE >", value, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeGreaterThanOrEqualTo(String value) {
            addCriterion("SCCCODE >=", value, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeLessThan(String value) {
            addCriterion("SCCCODE <", value, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeLessThanOrEqualTo(String value) {
            addCriterion("SCCCODE <=", value, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeLike(String value) {
            addCriterion("SCCCODE like", value, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeNotLike(String value) {
            addCriterion("SCCCODE not like", value, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeIn(List<String> values) {
            addCriterion("SCCCODE in", values, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeNotIn(List<String> values) {
            addCriterion("SCCCODE not in", values, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeBetween(String value1, String value2) {
            addCriterion("SCCCODE between", value1, value2, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeNotBetween(String value1, String value2) {
            addCriterion("SCCCODE not between", value1, value2, "scccode");
            return (Criteria) this;
        }

        public Criteria andFeiqitiIsNull() {
            addCriterion("feiqiti is null");
            return (Criteria) this;
        }

        public Criteria andFeiqitiIsNotNull() {
            addCriterion("feiqiti is not null");
            return (Criteria) this;
        }

        public Criteria andFeiqitiEqualTo(Double value) {
            addCriterion("feiqiti =", value, "feiqiti");
            return (Criteria) this;
        }

        public Criteria andFeiqitiNotEqualTo(Double value) {
            addCriterion("feiqiti <>", value, "feiqiti");
            return (Criteria) this;
        }

        public Criteria andFeiqitiGreaterThan(Double value) {
            addCriterion("feiqiti >", value, "feiqiti");
            return (Criteria) this;
        }

        public Criteria andFeiqitiGreaterThanOrEqualTo(Double value) {
            addCriterion("feiqiti >=", value, "feiqiti");
            return (Criteria) this;
        }

        public Criteria andFeiqitiLessThan(Double value) {
            addCriterion("feiqiti <", value, "feiqiti");
            return (Criteria) this;
        }

        public Criteria andFeiqitiLessThanOrEqualTo(Double value) {
            addCriterion("feiqiti <=", value, "feiqiti");
            return (Criteria) this;
        }

        public Criteria andFeiqitiIn(List<Double> values) {
            addCriterion("feiqiti in", values, "feiqiti");
            return (Criteria) this;
        }

        public Criteria andFeiqitiNotIn(List<Double> values) {
            addCriterion("feiqiti not in", values, "feiqiti");
            return (Criteria) this;
        }

        public Criteria andFeiqitiBetween(Double value1, Double value2) {
            addCriterion("feiqiti between", value1, value2, "feiqiti");
            return (Criteria) this;
        }

        public Criteria andFeiqitiNotBetween(Double value1, Double value2) {
            addCriterion("feiqiti not between", value1, value2, "feiqiti");
            return (Criteria) this;
        }

        public Criteria andSo2outIsNull() {
            addCriterion("so2out is null");
            return (Criteria) this;
        }

        public Criteria andSo2outIsNotNull() {
            addCriterion("so2out is not null");
            return (Criteria) this;
        }

        public Criteria andSo2outEqualTo(Double value) {
            addCriterion("so2out =", value, "so2out");
            return (Criteria) this;
        }

        public Criteria andSo2outNotEqualTo(Double value) {
            addCriterion("so2out <>", value, "so2out");
            return (Criteria) this;
        }

        public Criteria andSo2outGreaterThan(Double value) {
            addCriterion("so2out >", value, "so2out");
            return (Criteria) this;
        }

        public Criteria andSo2outGreaterThanOrEqualTo(Double value) {
            addCriterion("so2out >=", value, "so2out");
            return (Criteria) this;
        }

        public Criteria andSo2outLessThan(Double value) {
            addCriterion("so2out <", value, "so2out");
            return (Criteria) this;
        }

        public Criteria andSo2outLessThanOrEqualTo(Double value) {
            addCriterion("so2out <=", value, "so2out");
            return (Criteria) this;
        }

        public Criteria andSo2outIn(List<Double> values) {
            addCriterion("so2out in", values, "so2out");
            return (Criteria) this;
        }

        public Criteria andSo2outNotIn(List<Double> values) {
            addCriterion("so2out not in", values, "so2out");
            return (Criteria) this;
        }

        public Criteria andSo2outBetween(Double value1, Double value2) {
            addCriterion("so2out between", value1, value2, "so2out");
            return (Criteria) this;
        }

        public Criteria andSo2outNotBetween(Double value1, Double value2) {
            addCriterion("so2out not between", value1, value2, "so2out");
            return (Criteria) this;
        }

        public Criteria andPmoutIsNull() {
            addCriterion("pmout is null");
            return (Criteria) this;
        }

        public Criteria andPmoutIsNotNull() {
            addCriterion("pmout is not null");
            return (Criteria) this;
        }

        public Criteria andPmoutEqualTo(Double value) {
            addCriterion("pmout =", value, "pmout");
            return (Criteria) this;
        }

        public Criteria andPmoutNotEqualTo(Double value) {
            addCriterion("pmout <>", value, "pmout");
            return (Criteria) this;
        }

        public Criteria andPmoutGreaterThan(Double value) {
            addCriterion("pmout >", value, "pmout");
            return (Criteria) this;
        }

        public Criteria andPmoutGreaterThanOrEqualTo(Double value) {
            addCriterion("pmout >=", value, "pmout");
            return (Criteria) this;
        }

        public Criteria andPmoutLessThan(Double value) {
            addCriterion("pmout <", value, "pmout");
            return (Criteria) this;
        }

        public Criteria andPmoutLessThanOrEqualTo(Double value) {
            addCriterion("pmout <=", value, "pmout");
            return (Criteria) this;
        }

        public Criteria andPmoutIn(List<Double> values) {
            addCriterion("pmout in", values, "pmout");
            return (Criteria) this;
        }

        public Criteria andPmoutNotIn(List<Double> values) {
            addCriterion("pmout not in", values, "pmout");
            return (Criteria) this;
        }

        public Criteria andPmoutBetween(Double value1, Double value2) {
            addCriterion("pmout between", value1, value2, "pmout");
            return (Criteria) this;
        }

        public Criteria andPmoutNotBetween(Double value1, Double value2) {
            addCriterion("pmout not between", value1, value2, "pmout");
            return (Criteria) this;
        }

        public Criteria andNoxoutIsNull() {
            addCriterion("noxout is null");
            return (Criteria) this;
        }

        public Criteria andNoxoutIsNotNull() {
            addCriterion("noxout is not null");
            return (Criteria) this;
        }

        public Criteria andNoxoutEqualTo(Double value) {
            addCriterion("noxout =", value, "noxout");
            return (Criteria) this;
        }

        public Criteria andNoxoutNotEqualTo(Double value) {
            addCriterion("noxout <>", value, "noxout");
            return (Criteria) this;
        }

        public Criteria andNoxoutGreaterThan(Double value) {
            addCriterion("noxout >", value, "noxout");
            return (Criteria) this;
        }

        public Criteria andNoxoutGreaterThanOrEqualTo(Double value) {
            addCriterion("noxout >=", value, "noxout");
            return (Criteria) this;
        }

        public Criteria andNoxoutLessThan(Double value) {
            addCriterion("noxout <", value, "noxout");
            return (Criteria) this;
        }

        public Criteria andNoxoutLessThanOrEqualTo(Double value) {
            addCriterion("noxout <=", value, "noxout");
            return (Criteria) this;
        }

        public Criteria andNoxoutIn(List<Double> values) {
            addCriterion("noxout in", values, "noxout");
            return (Criteria) this;
        }

        public Criteria andNoxoutNotIn(List<Double> values) {
            addCriterion("noxout not in", values, "noxout");
            return (Criteria) this;
        }

        public Criteria andNoxoutBetween(Double value1, Double value2) {
            addCriterion("noxout between", value1, value2, "noxout");
            return (Criteria) this;
        }

        public Criteria andNoxoutNotBetween(Double value1, Double value2) {
            addCriterion("noxout not between", value1, value2, "noxout");
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