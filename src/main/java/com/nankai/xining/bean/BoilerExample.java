package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class BoilerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BoilerExample() {
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

        public Criteria andTboilerIdIsNull() {
            addCriterion("TBOILER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTboilerIdIsNotNull() {
            addCriterion("TBOILER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTboilerIdEqualTo(Integer value) {
            addCriterion("TBOILER_ID =", value, "tboilerId");
            return (Criteria) this;
        }

        public Criteria andTboilerIdNotEqualTo(Integer value) {
            addCriterion("TBOILER_ID <>", value, "tboilerId");
            return (Criteria) this;
        }

        public Criteria andTboilerIdGreaterThan(Integer value) {
            addCriterion("TBOILER_ID >", value, "tboilerId");
            return (Criteria) this;
        }

        public Criteria andTboilerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TBOILER_ID >=", value, "tboilerId");
            return (Criteria) this;
        }

        public Criteria andTboilerIdLessThan(Integer value) {
            addCriterion("TBOILER_ID <", value, "tboilerId");
            return (Criteria) this;
        }

        public Criteria andTboilerIdLessThanOrEqualTo(Integer value) {
            addCriterion("TBOILER_ID <=", value, "tboilerId");
            return (Criteria) this;
        }

        public Criteria andTboilerIdIn(List<Integer> values) {
            addCriterion("TBOILER_ID in", values, "tboilerId");
            return (Criteria) this;
        }

        public Criteria andTboilerIdNotIn(List<Integer> values) {
            addCriterion("TBOILER_ID not in", values, "tboilerId");
            return (Criteria) this;
        }

        public Criteria andTboilerIdBetween(Integer value1, Integer value2) {
            addCriterion("TBOILER_ID between", value1, value2, "tboilerId");
            return (Criteria) this;
        }

        public Criteria andTboilerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TBOILER_ID not between", value1, value2, "tboilerId");
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

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andFunctionDecIsNull() {
            addCriterion("FUNCTION_DEC is null");
            return (Criteria) this;
        }

        public Criteria andFunctionDecIsNotNull() {
            addCriterion("FUNCTION_DEC is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionDecEqualTo(String value) {
            addCriterion("FUNCTION_DEC =", value, "functionDec");
            return (Criteria) this;
        }

        public Criteria andFunctionDecNotEqualTo(String value) {
            addCriterion("FUNCTION_DEC <>", value, "functionDec");
            return (Criteria) this;
        }

        public Criteria andFunctionDecGreaterThan(String value) {
            addCriterion("FUNCTION_DEC >", value, "functionDec");
            return (Criteria) this;
        }

        public Criteria andFunctionDecGreaterThanOrEqualTo(String value) {
            addCriterion("FUNCTION_DEC >=", value, "functionDec");
            return (Criteria) this;
        }

        public Criteria andFunctionDecLessThan(String value) {
            addCriterion("FUNCTION_DEC <", value, "functionDec");
            return (Criteria) this;
        }

        public Criteria andFunctionDecLessThanOrEqualTo(String value) {
            addCriterion("FUNCTION_DEC <=", value, "functionDec");
            return (Criteria) this;
        }

        public Criteria andFunctionDecLike(String value) {
            addCriterion("FUNCTION_DEC like", value, "functionDec");
            return (Criteria) this;
        }

        public Criteria andFunctionDecNotLike(String value) {
            addCriterion("FUNCTION_DEC not like", value, "functionDec");
            return (Criteria) this;
        }

        public Criteria andFunctionDecIn(List<String> values) {
            addCriterion("FUNCTION_DEC in", values, "functionDec");
            return (Criteria) this;
        }

        public Criteria andFunctionDecNotIn(List<String> values) {
            addCriterion("FUNCTION_DEC not in", values, "functionDec");
            return (Criteria) this;
        }

        public Criteria andFunctionDecBetween(String value1, String value2) {
            addCriterion("FUNCTION_DEC between", value1, value2, "functionDec");
            return (Criteria) this;
        }

        public Criteria andFunctionDecNotBetween(String value1, String value2) {
            addCriterion("FUNCTION_DEC not between", value1, value2, "functionDec");
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

        public Criteria andFueltypeDecIsNull() {
            addCriterion("FUELTYPE_DEC is null");
            return (Criteria) this;
        }

        public Criteria andFueltypeDecIsNotNull() {
            addCriterion("FUELTYPE_DEC is not null");
            return (Criteria) this;
        }

        public Criteria andFueltypeDecEqualTo(String value) {
            addCriterion("FUELTYPE_DEC =", value, "fueltypeDec");
            return (Criteria) this;
        }

        public Criteria andFueltypeDecNotEqualTo(String value) {
            addCriterion("FUELTYPE_DEC <>", value, "fueltypeDec");
            return (Criteria) this;
        }

        public Criteria andFueltypeDecGreaterThan(String value) {
            addCriterion("FUELTYPE_DEC >", value, "fueltypeDec");
            return (Criteria) this;
        }

        public Criteria andFueltypeDecGreaterThanOrEqualTo(String value) {
            addCriterion("FUELTYPE_DEC >=", value, "fueltypeDec");
            return (Criteria) this;
        }

        public Criteria andFueltypeDecLessThan(String value) {
            addCriterion("FUELTYPE_DEC <", value, "fueltypeDec");
            return (Criteria) this;
        }

        public Criteria andFueltypeDecLessThanOrEqualTo(String value) {
            addCriterion("FUELTYPE_DEC <=", value, "fueltypeDec");
            return (Criteria) this;
        }

        public Criteria andFueltypeDecLike(String value) {
            addCriterion("FUELTYPE_DEC like", value, "fueltypeDec");
            return (Criteria) this;
        }

        public Criteria andFueltypeDecNotLike(String value) {
            addCriterion("FUELTYPE_DEC not like", value, "fueltypeDec");
            return (Criteria) this;
        }

        public Criteria andFueltypeDecIn(List<String> values) {
            addCriterion("FUELTYPE_DEC in", values, "fueltypeDec");
            return (Criteria) this;
        }

        public Criteria andFueltypeDecNotIn(List<String> values) {
            addCriterion("FUELTYPE_DEC not in", values, "fueltypeDec");
            return (Criteria) this;
        }

        public Criteria andFueltypeDecBetween(String value1, String value2) {
            addCriterion("FUELTYPE_DEC between", value1, value2, "fueltypeDec");
            return (Criteria) this;
        }

        public Criteria andFueltypeDecNotBetween(String value1, String value2) {
            addCriterion("FUELTYPE_DEC not between", value1, value2, "fueltypeDec");
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

        public Criteria andCombustionsystemIsNull() {
            addCriterion("COMBUSTIONSYSTEM is null");
            return (Criteria) this;
        }

        public Criteria andCombustionsystemIsNotNull() {
            addCriterion("COMBUSTIONSYSTEM is not null");
            return (Criteria) this;
        }

        public Criteria andCombustionsystemEqualTo(String value) {
            addCriterion("COMBUSTIONSYSTEM =", value, "combustionsystem");
            return (Criteria) this;
        }

        public Criteria andCombustionsystemNotEqualTo(String value) {
            addCriterion("COMBUSTIONSYSTEM <>", value, "combustionsystem");
            return (Criteria) this;
        }

        public Criteria andCombustionsystemGreaterThan(String value) {
            addCriterion("COMBUSTIONSYSTEM >", value, "combustionsystem");
            return (Criteria) this;
        }

        public Criteria andCombustionsystemGreaterThanOrEqualTo(String value) {
            addCriterion("COMBUSTIONSYSTEM >=", value, "combustionsystem");
            return (Criteria) this;
        }

        public Criteria andCombustionsystemLessThan(String value) {
            addCriterion("COMBUSTIONSYSTEM <", value, "combustionsystem");
            return (Criteria) this;
        }

        public Criteria andCombustionsystemLessThanOrEqualTo(String value) {
            addCriterion("COMBUSTIONSYSTEM <=", value, "combustionsystem");
            return (Criteria) this;
        }

        public Criteria andCombustionsystemLike(String value) {
            addCriterion("COMBUSTIONSYSTEM like", value, "combustionsystem");
            return (Criteria) this;
        }

        public Criteria andCombustionsystemNotLike(String value) {
            addCriterion("COMBUSTIONSYSTEM not like", value, "combustionsystem");
            return (Criteria) this;
        }

        public Criteria andCombustionsystemIn(List<String> values) {
            addCriterion("COMBUSTIONSYSTEM in", values, "combustionsystem");
            return (Criteria) this;
        }

        public Criteria andCombustionsystemNotIn(List<String> values) {
            addCriterion("COMBUSTIONSYSTEM not in", values, "combustionsystem");
            return (Criteria) this;
        }

        public Criteria andCombustionsystemBetween(String value1, String value2) {
            addCriterion("COMBUSTIONSYSTEM between", value1, value2, "combustionsystem");
            return (Criteria) this;
        }

        public Criteria andCombustionsystemNotBetween(String value1, String value2) {
            addCriterion("COMBUSTIONSYSTEM not between", value1, value2, "combustionsystem");
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

        public Criteria andFuelAusageunitIsNull() {
            addCriterion("FUEL_AUSAGEUNIT is null");
            return (Criteria) this;
        }

        public Criteria andFuelAusageunitIsNotNull() {
            addCriterion("FUEL_AUSAGEUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andFuelAusageunitEqualTo(String value) {
            addCriterion("FUEL_AUSAGEUNIT =", value, "fuelAusageunit");
            return (Criteria) this;
        }

        public Criteria andFuelAusageunitNotEqualTo(String value) {
            addCriterion("FUEL_AUSAGEUNIT <>", value, "fuelAusageunit");
            return (Criteria) this;
        }

        public Criteria andFuelAusageunitGreaterThan(String value) {
            addCriterion("FUEL_AUSAGEUNIT >", value, "fuelAusageunit");
            return (Criteria) this;
        }

        public Criteria andFuelAusageunitGreaterThanOrEqualTo(String value) {
            addCriterion("FUEL_AUSAGEUNIT >=", value, "fuelAusageunit");
            return (Criteria) this;
        }

        public Criteria andFuelAusageunitLessThan(String value) {
            addCriterion("FUEL_AUSAGEUNIT <", value, "fuelAusageunit");
            return (Criteria) this;
        }

        public Criteria andFuelAusageunitLessThanOrEqualTo(String value) {
            addCriterion("FUEL_AUSAGEUNIT <=", value, "fuelAusageunit");
            return (Criteria) this;
        }

        public Criteria andFuelAusageunitLike(String value) {
            addCriterion("FUEL_AUSAGEUNIT like", value, "fuelAusageunit");
            return (Criteria) this;
        }

        public Criteria andFuelAusageunitNotLike(String value) {
            addCriterion("FUEL_AUSAGEUNIT not like", value, "fuelAusageunit");
            return (Criteria) this;
        }

        public Criteria andFuelAusageunitIn(List<String> values) {
            addCriterion("FUEL_AUSAGEUNIT in", values, "fuelAusageunit");
            return (Criteria) this;
        }

        public Criteria andFuelAusageunitNotIn(List<String> values) {
            addCriterion("FUEL_AUSAGEUNIT not in", values, "fuelAusageunit");
            return (Criteria) this;
        }

        public Criteria andFuelAusageunitBetween(String value1, String value2) {
            addCriterion("FUEL_AUSAGEUNIT between", value1, value2, "fuelAusageunit");
            return (Criteria) this;
        }

        public Criteria andFuelAusageunitNotBetween(String value1, String value2) {
            addCriterion("FUEL_AUSAGEUNIT not between", value1, value2, "fuelAusageunit");
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

        public Criteria andExfNoIsNull() {
            addCriterion("EXF_NO is null");
            return (Criteria) this;
        }

        public Criteria andExfNoIsNotNull() {
            addCriterion("EXF_NO is not null");
            return (Criteria) this;
        }

        public Criteria andExfNoEqualTo(Integer value) {
            addCriterion("EXF_NO =", value, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoNotEqualTo(Integer value) {
            addCriterion("EXF_NO <>", value, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoGreaterThan(Integer value) {
            addCriterion("EXF_NO >", value, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXF_NO >=", value, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoLessThan(Integer value) {
            addCriterion("EXF_NO <", value, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoLessThanOrEqualTo(Integer value) {
            addCriterion("EXF_NO <=", value, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoIn(List<Integer> values) {
            addCriterion("EXF_NO in", values, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoNotIn(List<Integer> values) {
            addCriterion("EXF_NO not in", values, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoBetween(Integer value1, Integer value2) {
            addCriterion("EXF_NO between", value1, value2, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoNotBetween(Integer value1, Integer value2) {
            addCriterion("EXF_NO not between", value1, value2, "exfNo");
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

        public Criteria andDustremoveIdIsNull() {
            addCriterion("dustremove_id is null");
            return (Criteria) this;
        }

        public Criteria andDustremoveIdIsNotNull() {
            addCriterion("dustremove_id is not null");
            return (Criteria) this;
        }

        public Criteria andDustremoveIdEqualTo(Integer value) {
            addCriterion("dustremove_id =", value, "dustremoveId");
            return (Criteria) this;
        }

        public Criteria andDustremoveIdNotEqualTo(Integer value) {
            addCriterion("dustremove_id <>", value, "dustremoveId");
            return (Criteria) this;
        }

        public Criteria andDustremoveIdGreaterThan(Integer value) {
            addCriterion("dustremove_id >", value, "dustremoveId");
            return (Criteria) this;
        }

        public Criteria andDustremoveIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dustremove_id >=", value, "dustremoveId");
            return (Criteria) this;
        }

        public Criteria andDustremoveIdLessThan(Integer value) {
            addCriterion("dustremove_id <", value, "dustremoveId");
            return (Criteria) this;
        }

        public Criteria andDustremoveIdLessThanOrEqualTo(Integer value) {
            addCriterion("dustremove_id <=", value, "dustremoveId");
            return (Criteria) this;
        }

        public Criteria andDustremoveIdIn(List<Integer> values) {
            addCriterion("dustremove_id in", values, "dustremoveId");
            return (Criteria) this;
        }

        public Criteria andDustremoveIdNotIn(List<Integer> values) {
            addCriterion("dustremove_id not in", values, "dustremoveId");
            return (Criteria) this;
        }

        public Criteria andDustremoveIdBetween(Integer value1, Integer value2) {
            addCriterion("dustremove_id between", value1, value2, "dustremoveId");
            return (Criteria) this;
        }

        public Criteria andDustremoveIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dustremove_id not between", value1, value2, "dustremoveId");
            return (Criteria) this;
        }

        public Criteria andDustremoveDecIsNull() {
            addCriterion("dustremove_dec is null");
            return (Criteria) this;
        }

        public Criteria andDustremoveDecIsNotNull() {
            addCriterion("dustremove_dec is not null");
            return (Criteria) this;
        }

        public Criteria andDustremoveDecEqualTo(String value) {
            addCriterion("dustremove_dec =", value, "dustremoveDec");
            return (Criteria) this;
        }

        public Criteria andDustremoveDecNotEqualTo(String value) {
            addCriterion("dustremove_dec <>", value, "dustremoveDec");
            return (Criteria) this;
        }

        public Criteria andDustremoveDecGreaterThan(String value) {
            addCriterion("dustremove_dec >", value, "dustremoveDec");
            return (Criteria) this;
        }

        public Criteria andDustremoveDecGreaterThanOrEqualTo(String value) {
            addCriterion("dustremove_dec >=", value, "dustremoveDec");
            return (Criteria) this;
        }

        public Criteria andDustremoveDecLessThan(String value) {
            addCriterion("dustremove_dec <", value, "dustremoveDec");
            return (Criteria) this;
        }

        public Criteria andDustremoveDecLessThanOrEqualTo(String value) {
            addCriterion("dustremove_dec <=", value, "dustremoveDec");
            return (Criteria) this;
        }

        public Criteria andDustremoveDecLike(String value) {
            addCriterion("dustremove_dec like", value, "dustremoveDec");
            return (Criteria) this;
        }

        public Criteria andDustremoveDecNotLike(String value) {
            addCriterion("dustremove_dec not like", value, "dustremoveDec");
            return (Criteria) this;
        }

        public Criteria andDustremoveDecIn(List<String> values) {
            addCriterion("dustremove_dec in", values, "dustremoveDec");
            return (Criteria) this;
        }

        public Criteria andDustremoveDecNotIn(List<String> values) {
            addCriterion("dustremove_dec not in", values, "dustremoveDec");
            return (Criteria) this;
        }

        public Criteria andDustremoveDecBetween(String value1, String value2) {
            addCriterion("dustremove_dec between", value1, value2, "dustremoveDec");
            return (Criteria) this;
        }

        public Criteria andDustremoveDecNotBetween(String value1, String value2) {
            addCriterion("dustremove_dec not between", value1, value2, "dustremoveDec");
            return (Criteria) this;
        }

        public Criteria andNitreremoveDecIsNull() {
            addCriterion("nitreremove_dec is null");
            return (Criteria) this;
        }

        public Criteria andNitreremoveDecIsNotNull() {
            addCriterion("nitreremove_dec is not null");
            return (Criteria) this;
        }

        public Criteria andNitreremoveDecEqualTo(String value) {
            addCriterion("nitreremove_dec =", value, "nitreremoveDec");
            return (Criteria) this;
        }

        public Criteria andNitreremoveDecNotEqualTo(String value) {
            addCriterion("nitreremove_dec <>", value, "nitreremoveDec");
            return (Criteria) this;
        }

        public Criteria andNitreremoveDecGreaterThan(String value) {
            addCriterion("nitreremove_dec >", value, "nitreremoveDec");
            return (Criteria) this;
        }

        public Criteria andNitreremoveDecGreaterThanOrEqualTo(String value) {
            addCriterion("nitreremove_dec >=", value, "nitreremoveDec");
            return (Criteria) this;
        }

        public Criteria andNitreremoveDecLessThan(String value) {
            addCriterion("nitreremove_dec <", value, "nitreremoveDec");
            return (Criteria) this;
        }

        public Criteria andNitreremoveDecLessThanOrEqualTo(String value) {
            addCriterion("nitreremove_dec <=", value, "nitreremoveDec");
            return (Criteria) this;
        }

        public Criteria andNitreremoveDecLike(String value) {
            addCriterion("nitreremove_dec like", value, "nitreremoveDec");
            return (Criteria) this;
        }

        public Criteria andNitreremoveDecNotLike(String value) {
            addCriterion("nitreremove_dec not like", value, "nitreremoveDec");
            return (Criteria) this;
        }

        public Criteria andNitreremoveDecIn(List<String> values) {
            addCriterion("nitreremove_dec in", values, "nitreremoveDec");
            return (Criteria) this;
        }

        public Criteria andNitreremoveDecNotIn(List<String> values) {
            addCriterion("nitreremove_dec not in", values, "nitreremoveDec");
            return (Criteria) this;
        }

        public Criteria andNitreremoveDecBetween(String value1, String value2) {
            addCriterion("nitreremove_dec between", value1, value2, "nitreremoveDec");
            return (Criteria) this;
        }

        public Criteria andNitreremoveDecNotBetween(String value1, String value2) {
            addCriterion("nitreremove_dec not between", value1, value2, "nitreremoveDec");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveDecIsNull() {
            addCriterion("sulphurremove_dec is null");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveDecIsNotNull() {
            addCriterion("sulphurremove_dec is not null");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveDecEqualTo(String value) {
            addCriterion("sulphurremove_dec =", value, "sulphurremoveDec");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveDecNotEqualTo(String value) {
            addCriterion("sulphurremove_dec <>", value, "sulphurremoveDec");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveDecGreaterThan(String value) {
            addCriterion("sulphurremove_dec >", value, "sulphurremoveDec");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveDecGreaterThanOrEqualTo(String value) {
            addCriterion("sulphurremove_dec >=", value, "sulphurremoveDec");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveDecLessThan(String value) {
            addCriterion("sulphurremove_dec <", value, "sulphurremoveDec");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveDecLessThanOrEqualTo(String value) {
            addCriterion("sulphurremove_dec <=", value, "sulphurremoveDec");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveDecLike(String value) {
            addCriterion("sulphurremove_dec like", value, "sulphurremoveDec");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveDecNotLike(String value) {
            addCriterion("sulphurremove_dec not like", value, "sulphurremoveDec");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveDecIn(List<String> values) {
            addCriterion("sulphurremove_dec in", values, "sulphurremoveDec");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveDecNotIn(List<String> values) {
            addCriterion("sulphurremove_dec not in", values, "sulphurremoveDec");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveDecBetween(String value1, String value2) {
            addCriterion("sulphurremove_dec between", value1, value2, "sulphurremoveDec");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveDecNotBetween(String value1, String value2) {
            addCriterion("sulphurremove_dec not between", value1, value2, "sulphurremoveDec");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveIdIsNull() {
            addCriterion("sulphurremove_id is null");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveIdIsNotNull() {
            addCriterion("sulphurremove_id is not null");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveIdEqualTo(Integer value) {
            addCriterion("sulphurremove_id =", value, "sulphurremoveId");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveIdNotEqualTo(Integer value) {
            addCriterion("sulphurremove_id <>", value, "sulphurremoveId");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveIdGreaterThan(Integer value) {
            addCriterion("sulphurremove_id >", value, "sulphurremoveId");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sulphurremove_id >=", value, "sulphurremoveId");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveIdLessThan(Integer value) {
            addCriterion("sulphurremove_id <", value, "sulphurremoveId");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveIdLessThanOrEqualTo(Integer value) {
            addCriterion("sulphurremove_id <=", value, "sulphurremoveId");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveIdIn(List<Integer> values) {
            addCriterion("sulphurremove_id in", values, "sulphurremoveId");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveIdNotIn(List<Integer> values) {
            addCriterion("sulphurremove_id not in", values, "sulphurremoveId");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveIdBetween(Integer value1, Integer value2) {
            addCriterion("sulphurremove_id between", value1, value2, "sulphurremoveId");
            return (Criteria) this;
        }

        public Criteria andSulphurremoveIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sulphurremove_id not between", value1, value2, "sulphurremoveId");
            return (Criteria) this;
        }

        public Criteria andNitreremoveIdIsNull() {
            addCriterion("nitreremove_id is null");
            return (Criteria) this;
        }

        public Criteria andNitreremoveIdIsNotNull() {
            addCriterion("nitreremove_id is not null");
            return (Criteria) this;
        }

        public Criteria andNitreremoveIdEqualTo(Integer value) {
            addCriterion("nitreremove_id =", value, "nitreremoveId");
            return (Criteria) this;
        }

        public Criteria andNitreremoveIdNotEqualTo(Integer value) {
            addCriterion("nitreremove_id <>", value, "nitreremoveId");
            return (Criteria) this;
        }

        public Criteria andNitreremoveIdGreaterThan(Integer value) {
            addCriterion("nitreremove_id >", value, "nitreremoveId");
            return (Criteria) this;
        }

        public Criteria andNitreremoveIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("nitreremove_id >=", value, "nitreremoveId");
            return (Criteria) this;
        }

        public Criteria andNitreremoveIdLessThan(Integer value) {
            addCriterion("nitreremove_id <", value, "nitreremoveId");
            return (Criteria) this;
        }

        public Criteria andNitreremoveIdLessThanOrEqualTo(Integer value) {
            addCriterion("nitreremove_id <=", value, "nitreremoveId");
            return (Criteria) this;
        }

        public Criteria andNitreremoveIdIn(List<Integer> values) {
            addCriterion("nitreremove_id in", values, "nitreremoveId");
            return (Criteria) this;
        }

        public Criteria andNitreremoveIdNotIn(List<Integer> values) {
            addCriterion("nitreremove_id not in", values, "nitreremoveId");
            return (Criteria) this;
        }

        public Criteria andNitreremoveIdBetween(Integer value1, Integer value2) {
            addCriterion("nitreremove_id between", value1, value2, "nitreremoveId");
            return (Criteria) this;
        }

        public Criteria andNitreremoveIdNotBetween(Integer value1, Integer value2) {
            addCriterion("nitreremove_id not between", value1, value2, "nitreremoveId");
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

        public Criteria andMachineNoIsNull() {
            addCriterion("machine_no is null");
            return (Criteria) this;
        }

        public Criteria andMachineNoIsNotNull() {
            addCriterion("machine_no is not null");
            return (Criteria) this;
        }

        public Criteria andMachineNoEqualTo(String value) {
            addCriterion("machine_no =", value, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoNotEqualTo(String value) {
            addCriterion("machine_no <>", value, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoGreaterThan(String value) {
            addCriterion("machine_no >", value, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoGreaterThanOrEqualTo(String value) {
            addCriterion("machine_no >=", value, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoLessThan(String value) {
            addCriterion("machine_no <", value, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoLessThanOrEqualTo(String value) {
            addCriterion("machine_no <=", value, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoLike(String value) {
            addCriterion("machine_no like", value, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoNotLike(String value) {
            addCriterion("machine_no not like", value, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoIn(List<String> values) {
            addCriterion("machine_no in", values, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoNotIn(List<String> values) {
            addCriterion("machine_no not in", values, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoBetween(String value1, String value2) {
            addCriterion("machine_no between", value1, value2, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoNotBetween(String value1, String value2) {
            addCriterion("machine_no not between", value1, value2, "machineNo");
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

        public Criteria andInstalledCapacityIsNull() {
            addCriterion("installed_capacity is null");
            return (Criteria) this;
        }

        public Criteria andInstalledCapacityIsNotNull() {
            addCriterion("installed_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andInstalledCapacityEqualTo(Double value) {
            addCriterion("installed_capacity =", value, "installedCapacity");
            return (Criteria) this;
        }

        public Criteria andInstalledCapacityNotEqualTo(Double value) {
            addCriterion("installed_capacity <>", value, "installedCapacity");
            return (Criteria) this;
        }

        public Criteria andInstalledCapacityGreaterThan(Double value) {
            addCriterion("installed_capacity >", value, "installedCapacity");
            return (Criteria) this;
        }

        public Criteria andInstalledCapacityGreaterThanOrEqualTo(Double value) {
            addCriterion("installed_capacity >=", value, "installedCapacity");
            return (Criteria) this;
        }

        public Criteria andInstalledCapacityLessThan(Double value) {
            addCriterion("installed_capacity <", value, "installedCapacity");
            return (Criteria) this;
        }

        public Criteria andInstalledCapacityLessThanOrEqualTo(Double value) {
            addCriterion("installed_capacity <=", value, "installedCapacity");
            return (Criteria) this;
        }

        public Criteria andInstalledCapacityIn(List<Double> values) {
            addCriterion("installed_capacity in", values, "installedCapacity");
            return (Criteria) this;
        }

        public Criteria andInstalledCapacityNotIn(List<Double> values) {
            addCriterion("installed_capacity not in", values, "installedCapacity");
            return (Criteria) this;
        }

        public Criteria andInstalledCapacityBetween(Double value1, Double value2) {
            addCriterion("installed_capacity between", value1, value2, "installedCapacity");
            return (Criteria) this;
        }

        public Criteria andInstalledCapacityNotBetween(Double value1, Double value2) {
            addCriterion("installed_capacity not between", value1, value2, "installedCapacity");
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