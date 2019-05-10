package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TotalBoilerTempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TotalBoilerTempExample() {
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

        public Criteria andFactoryIdIsNull() {
            addCriterion("FACTORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andFactoryIdIsNotNull() {
            addCriterion("FACTORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryIdEqualTo(Integer value) {
            addCriterion("FACTORY_ID =", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotEqualTo(Integer value) {
            addCriterion("FACTORY_ID <>", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdGreaterThan(Integer value) {
            addCriterion("FACTORY_ID >", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FACTORY_ID >=", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdLessThan(Integer value) {
            addCriterion("FACTORY_ID <", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("FACTORY_ID <=", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdIn(List<Integer> values) {
            addCriterion("FACTORY_ID in", values, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotIn(List<Integer> values) {
            addCriterion("FACTORY_ID not in", values, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdBetween(Integer value1, Integer value2) {
            addCriterion("FACTORY_ID between", value1, value2, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FACTORY_ID not between", value1, value2, "factoryId");
            return (Criteria) this;
        }

        public Criteria andTboilerNumIsNull() {
            addCriterion("TBOILER_NUM is null");
            return (Criteria) this;
        }

        public Criteria andTboilerNumIsNotNull() {
            addCriterion("TBOILER_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andTboilerNumEqualTo(Integer value) {
            addCriterion("TBOILER_NUM =", value, "tboilerNum");
            return (Criteria) this;
        }

        public Criteria andTboilerNumNotEqualTo(Integer value) {
            addCriterion("TBOILER_NUM <>", value, "tboilerNum");
            return (Criteria) this;
        }

        public Criteria andTboilerNumGreaterThan(Integer value) {
            addCriterion("TBOILER_NUM >", value, "tboilerNum");
            return (Criteria) this;
        }

        public Criteria andTboilerNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("TBOILER_NUM >=", value, "tboilerNum");
            return (Criteria) this;
        }

        public Criteria andTboilerNumLessThan(Integer value) {
            addCriterion("TBOILER_NUM <", value, "tboilerNum");
            return (Criteria) this;
        }

        public Criteria andTboilerNumLessThanOrEqualTo(Integer value) {
            addCriterion("TBOILER_NUM <=", value, "tboilerNum");
            return (Criteria) this;
        }

        public Criteria andTboilerNumIn(List<Integer> values) {
            addCriterion("TBOILER_NUM in", values, "tboilerNum");
            return (Criteria) this;
        }

        public Criteria andTboilerNumNotIn(List<Integer> values) {
            addCriterion("TBOILER_NUM not in", values, "tboilerNum");
            return (Criteria) this;
        }

        public Criteria andTboilerNumBetween(Integer value1, Integer value2) {
            addCriterion("TBOILER_NUM between", value1, value2, "tboilerNum");
            return (Criteria) this;
        }

        public Criteria andTboilerNumNotBetween(Integer value1, Integer value2) {
            addCriterion("TBOILER_NUM not between", value1, value2, "tboilerNum");
            return (Criteria) this;
        }

        public Criteria andTboilerTonsIsNull() {
            addCriterion("TBOILER_TONS is null");
            return (Criteria) this;
        }

        public Criteria andTboilerTonsIsNotNull() {
            addCriterion("TBOILER_TONS is not null");
            return (Criteria) this;
        }

        public Criteria andTboilerTonsEqualTo(Double value) {
            addCriterion("TBOILER_TONS =", value, "tboilerTons");
            return (Criteria) this;
        }

        public Criteria andTboilerTonsNotEqualTo(Double value) {
            addCriterion("TBOILER_TONS <>", value, "tboilerTons");
            return (Criteria) this;
        }

        public Criteria andTboilerTonsGreaterThan(Double value) {
            addCriterion("TBOILER_TONS >", value, "tboilerTons");
            return (Criteria) this;
        }

        public Criteria andTboilerTonsGreaterThanOrEqualTo(Double value) {
            addCriterion("TBOILER_TONS >=", value, "tboilerTons");
            return (Criteria) this;
        }

        public Criteria andTboilerTonsLessThan(Double value) {
            addCriterion("TBOILER_TONS <", value, "tboilerTons");
            return (Criteria) this;
        }

        public Criteria andTboilerTonsLessThanOrEqualTo(Double value) {
            addCriterion("TBOILER_TONS <=", value, "tboilerTons");
            return (Criteria) this;
        }

        public Criteria andTboilerTonsIn(List<Double> values) {
            addCriterion("TBOILER_TONS in", values, "tboilerTons");
            return (Criteria) this;
        }

        public Criteria andTboilerTonsNotIn(List<Double> values) {
            addCriterion("TBOILER_TONS not in", values, "tboilerTons");
            return (Criteria) this;
        }

        public Criteria andTboilerTonsBetween(Double value1, Double value2) {
            addCriterion("TBOILER_TONS between", value1, value2, "tboilerTons");
            return (Criteria) this;
        }

        public Criteria andTboilerTonsNotBetween(Double value1, Double value2) {
            addCriterion("TBOILER_TONS not between", value1, value2, "tboilerTons");
            return (Criteria) this;
        }

        public Criteria andTboilerFunctionDecIsNull() {
            addCriterion("TBOILER_FUNCTION_DEC is null");
            return (Criteria) this;
        }

        public Criteria andTboilerFunctionDecIsNotNull() {
            addCriterion("TBOILER_FUNCTION_DEC is not null");
            return (Criteria) this;
        }

        public Criteria andTboilerFunctionDecEqualTo(String value) {
            addCriterion("TBOILER_FUNCTION_DEC =", value, "tboilerFunctionDec");
            return (Criteria) this;
        }

        public Criteria andTboilerFunctionDecNotEqualTo(String value) {
            addCriterion("TBOILER_FUNCTION_DEC <>", value, "tboilerFunctionDec");
            return (Criteria) this;
        }

        public Criteria andTboilerFunctionDecGreaterThan(String value) {
            addCriterion("TBOILER_FUNCTION_DEC >", value, "tboilerFunctionDec");
            return (Criteria) this;
        }

        public Criteria andTboilerFunctionDecGreaterThanOrEqualTo(String value) {
            addCriterion("TBOILER_FUNCTION_DEC >=", value, "tboilerFunctionDec");
            return (Criteria) this;
        }

        public Criteria andTboilerFunctionDecLessThan(String value) {
            addCriterion("TBOILER_FUNCTION_DEC <", value, "tboilerFunctionDec");
            return (Criteria) this;
        }

        public Criteria andTboilerFunctionDecLessThanOrEqualTo(String value) {
            addCriterion("TBOILER_FUNCTION_DEC <=", value, "tboilerFunctionDec");
            return (Criteria) this;
        }

        public Criteria andTboilerFunctionDecLike(String value) {
            addCriterion("TBOILER_FUNCTION_DEC like", value, "tboilerFunctionDec");
            return (Criteria) this;
        }

        public Criteria andTboilerFunctionDecNotLike(String value) {
            addCriterion("TBOILER_FUNCTION_DEC not like", value, "tboilerFunctionDec");
            return (Criteria) this;
        }

        public Criteria andTboilerFunctionDecIn(List<String> values) {
            addCriterion("TBOILER_FUNCTION_DEC in", values, "tboilerFunctionDec");
            return (Criteria) this;
        }

        public Criteria andTboilerFunctionDecNotIn(List<String> values) {
            addCriterion("TBOILER_FUNCTION_DEC not in", values, "tboilerFunctionDec");
            return (Criteria) this;
        }

        public Criteria andTboilerFunctionDecBetween(String value1, String value2) {
            addCriterion("TBOILER_FUNCTION_DEC between", value1, value2, "tboilerFunctionDec");
            return (Criteria) this;
        }

        public Criteria andTboilerFunctionDecNotBetween(String value1, String value2) {
            addCriterion("TBOILER_FUNCTION_DEC not between", value1, value2, "tboilerFunctionDec");
            return (Criteria) this;
        }

        public Criteria andTboilerFunctionIsNull() {
            addCriterion("TBOILER_FUNCTION is null");
            return (Criteria) this;
        }

        public Criteria andTboilerFunctionIsNotNull() {
            addCriterion("TBOILER_FUNCTION is not null");
            return (Criteria) this;
        }

        public Criteria andTboilerFunctionEqualTo(String value) {
            addCriterion("TBOILER_FUNCTION =", value, "tboilerFunction");
            return (Criteria) this;
        }

        public Criteria andTboilerFunctionNotEqualTo(String value) {
            addCriterion("TBOILER_FUNCTION <>", value, "tboilerFunction");
            return (Criteria) this;
        }

        public Criteria andTboilerFunctionGreaterThan(String value) {
            addCriterion("TBOILER_FUNCTION >", value, "tboilerFunction");
            return (Criteria) this;
        }

        public Criteria andTboilerFunctionGreaterThanOrEqualTo(String value) {
            addCriterion("TBOILER_FUNCTION >=", value, "tboilerFunction");
            return (Criteria) this;
        }

        public Criteria andTboilerFunctionLessThan(String value) {
            addCriterion("TBOILER_FUNCTION <", value, "tboilerFunction");
            return (Criteria) this;
        }

        public Criteria andTboilerFunctionLessThanOrEqualTo(String value) {
            addCriterion("TBOILER_FUNCTION <=", value, "tboilerFunction");
            return (Criteria) this;
        }

        public Criteria andTboilerFunctionLike(String value) {
            addCriterion("TBOILER_FUNCTION like", value, "tboilerFunction");
            return (Criteria) this;
        }

        public Criteria andTboilerFunctionNotLike(String value) {
            addCriterion("TBOILER_FUNCTION not like", value, "tboilerFunction");
            return (Criteria) this;
        }

        public Criteria andTboilerFunctionIn(List<String> values) {
            addCriterion("TBOILER_FUNCTION in", values, "tboilerFunction");
            return (Criteria) this;
        }

        public Criteria andTboilerFunctionNotIn(List<String> values) {
            addCriterion("TBOILER_FUNCTION not in", values, "tboilerFunction");
            return (Criteria) this;
        }

        public Criteria andTboilerFunctionBetween(String value1, String value2) {
            addCriterion("TBOILER_FUNCTION between", value1, value2, "tboilerFunction");
            return (Criteria) this;
        }

        public Criteria andTboilerFunctionNotBetween(String value1, String value2) {
            addCriterion("TBOILER_FUNCTION not between", value1, value2, "tboilerFunction");
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

        public Criteria andTboilerStatusIsNull() {
            addCriterion("TBOILER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTboilerStatusIsNotNull() {
            addCriterion("TBOILER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTboilerStatusEqualTo(Byte value) {
            addCriterion("TBOILER_STATUS =", value, "tboilerStatus");
            return (Criteria) this;
        }

        public Criteria andTboilerStatusNotEqualTo(Byte value) {
            addCriterion("TBOILER_STATUS <>", value, "tboilerStatus");
            return (Criteria) this;
        }

        public Criteria andTboilerStatusGreaterThan(Byte value) {
            addCriterion("TBOILER_STATUS >", value, "tboilerStatus");
            return (Criteria) this;
        }

        public Criteria andTboilerStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("TBOILER_STATUS >=", value, "tboilerStatus");
            return (Criteria) this;
        }

        public Criteria andTboilerStatusLessThan(Byte value) {
            addCriterion("TBOILER_STATUS <", value, "tboilerStatus");
            return (Criteria) this;
        }

        public Criteria andTboilerStatusLessThanOrEqualTo(Byte value) {
            addCriterion("TBOILER_STATUS <=", value, "tboilerStatus");
            return (Criteria) this;
        }

        public Criteria andTboilerStatusIn(List<Byte> values) {
            addCriterion("TBOILER_STATUS in", values, "tboilerStatus");
            return (Criteria) this;
        }

        public Criteria andTboilerStatusNotIn(List<Byte> values) {
            addCriterion("TBOILER_STATUS not in", values, "tboilerStatus");
            return (Criteria) this;
        }

        public Criteria andTboilerStatusBetween(Byte value1, Byte value2) {
            addCriterion("TBOILER_STATUS between", value1, value2, "tboilerStatus");
            return (Criteria) this;
        }

        public Criteria andTboilerStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("TBOILER_STATUS not between", value1, value2, "tboilerStatus");
            return (Criteria) this;
        }

        public Criteria andChimneyNumIsNull() {
            addCriterion("CHIMNEY_NUM is null");
            return (Criteria) this;
        }

        public Criteria andChimneyNumIsNotNull() {
            addCriterion("CHIMNEY_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andChimneyNumEqualTo(Integer value) {
            addCriterion("CHIMNEY_NUM =", value, "chimneyNum");
            return (Criteria) this;
        }

        public Criteria andChimneyNumNotEqualTo(Integer value) {
            addCriterion("CHIMNEY_NUM <>", value, "chimneyNum");
            return (Criteria) this;
        }

        public Criteria andChimneyNumGreaterThan(Integer value) {
            addCriterion("CHIMNEY_NUM >", value, "chimneyNum");
            return (Criteria) this;
        }

        public Criteria andChimneyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHIMNEY_NUM >=", value, "chimneyNum");
            return (Criteria) this;
        }

        public Criteria andChimneyNumLessThan(Integer value) {
            addCriterion("CHIMNEY_NUM <", value, "chimneyNum");
            return (Criteria) this;
        }

        public Criteria andChimneyNumLessThanOrEqualTo(Integer value) {
            addCriterion("CHIMNEY_NUM <=", value, "chimneyNum");
            return (Criteria) this;
        }

        public Criteria andChimneyNumIn(List<Integer> values) {
            addCriterion("CHIMNEY_NUM in", values, "chimneyNum");
            return (Criteria) this;
        }

        public Criteria andChimneyNumNotIn(List<Integer> values) {
            addCriterion("CHIMNEY_NUM not in", values, "chimneyNum");
            return (Criteria) this;
        }

        public Criteria andChimneyNumBetween(Integer value1, Integer value2) {
            addCriterion("CHIMNEY_NUM between", value1, value2, "chimneyNum");
            return (Criteria) this;
        }

        public Criteria andChimneyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("CHIMNEY_NUM not between", value1, value2, "chimneyNum");
            return (Criteria) this;
        }

        public Criteria andTboilerFueltypeDecIsNull() {
            addCriterion("TBOILER_FUELTYPE_DEC is null");
            return (Criteria) this;
        }

        public Criteria andTboilerFueltypeDecIsNotNull() {
            addCriterion("TBOILER_FUELTYPE_DEC is not null");
            return (Criteria) this;
        }

        public Criteria andTboilerFueltypeDecEqualTo(String value) {
            addCriterion("TBOILER_FUELTYPE_DEC =", value, "tboilerFueltypeDec");
            return (Criteria) this;
        }

        public Criteria andTboilerFueltypeDecNotEqualTo(String value) {
            addCriterion("TBOILER_FUELTYPE_DEC <>", value, "tboilerFueltypeDec");
            return (Criteria) this;
        }

        public Criteria andTboilerFueltypeDecGreaterThan(String value) {
            addCriterion("TBOILER_FUELTYPE_DEC >", value, "tboilerFueltypeDec");
            return (Criteria) this;
        }

        public Criteria andTboilerFueltypeDecGreaterThanOrEqualTo(String value) {
            addCriterion("TBOILER_FUELTYPE_DEC >=", value, "tboilerFueltypeDec");
            return (Criteria) this;
        }

        public Criteria andTboilerFueltypeDecLessThan(String value) {
            addCriterion("TBOILER_FUELTYPE_DEC <", value, "tboilerFueltypeDec");
            return (Criteria) this;
        }

        public Criteria andTboilerFueltypeDecLessThanOrEqualTo(String value) {
            addCriterion("TBOILER_FUELTYPE_DEC <=", value, "tboilerFueltypeDec");
            return (Criteria) this;
        }

        public Criteria andTboilerFueltypeDecLike(String value) {
            addCriterion("TBOILER_FUELTYPE_DEC like", value, "tboilerFueltypeDec");
            return (Criteria) this;
        }

        public Criteria andTboilerFueltypeDecNotLike(String value) {
            addCriterion("TBOILER_FUELTYPE_DEC not like", value, "tboilerFueltypeDec");
            return (Criteria) this;
        }

        public Criteria andTboilerFueltypeDecIn(List<String> values) {
            addCriterion("TBOILER_FUELTYPE_DEC in", values, "tboilerFueltypeDec");
            return (Criteria) this;
        }

        public Criteria andTboilerFueltypeDecNotIn(List<String> values) {
            addCriterion("TBOILER_FUELTYPE_DEC not in", values, "tboilerFueltypeDec");
            return (Criteria) this;
        }

        public Criteria andTboilerFueltypeDecBetween(String value1, String value2) {
            addCriterion("TBOILER_FUELTYPE_DEC between", value1, value2, "tboilerFueltypeDec");
            return (Criteria) this;
        }

        public Criteria andTboilerFueltypeDecNotBetween(String value1, String value2) {
            addCriterion("TBOILER_FUELTYPE_DEC not between", value1, value2, "tboilerFueltypeDec");
            return (Criteria) this;
        }

        public Criteria andTboilerFueltypeIsNull() {
            addCriterion("TBOILER_FUELTYPE is null");
            return (Criteria) this;
        }

        public Criteria andTboilerFueltypeIsNotNull() {
            addCriterion("TBOILER_FUELTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTboilerFueltypeEqualTo(String value) {
            addCriterion("TBOILER_FUELTYPE =", value, "tboilerFueltype");
            return (Criteria) this;
        }

        public Criteria andTboilerFueltypeNotEqualTo(String value) {
            addCriterion("TBOILER_FUELTYPE <>", value, "tboilerFueltype");
            return (Criteria) this;
        }

        public Criteria andTboilerFueltypeGreaterThan(String value) {
            addCriterion("TBOILER_FUELTYPE >", value, "tboilerFueltype");
            return (Criteria) this;
        }

        public Criteria andTboilerFueltypeGreaterThanOrEqualTo(String value) {
            addCriterion("TBOILER_FUELTYPE >=", value, "tboilerFueltype");
            return (Criteria) this;
        }

        public Criteria andTboilerFueltypeLessThan(String value) {
            addCriterion("TBOILER_FUELTYPE <", value, "tboilerFueltype");
            return (Criteria) this;
        }

        public Criteria andTboilerFueltypeLessThanOrEqualTo(String value) {
            addCriterion("TBOILER_FUELTYPE <=", value, "tboilerFueltype");
            return (Criteria) this;
        }

        public Criteria andTboilerFueltypeLike(String value) {
            addCriterion("TBOILER_FUELTYPE like", value, "tboilerFueltype");
            return (Criteria) this;
        }

        public Criteria andTboilerFueltypeNotLike(String value) {
            addCriterion("TBOILER_FUELTYPE not like", value, "tboilerFueltype");
            return (Criteria) this;
        }

        public Criteria andTboilerFueltypeIn(List<String> values) {
            addCriterion("TBOILER_FUELTYPE in", values, "tboilerFueltype");
            return (Criteria) this;
        }

        public Criteria andTboilerFueltypeNotIn(List<String> values) {
            addCriterion("TBOILER_FUELTYPE not in", values, "tboilerFueltype");
            return (Criteria) this;
        }

        public Criteria andTboilerFueltypeBetween(String value1, String value2) {
            addCriterion("TBOILER_FUELTYPE between", value1, value2, "tboilerFueltype");
            return (Criteria) this;
        }

        public Criteria andTboilerFueltypeNotBetween(String value1, String value2) {
            addCriterion("TBOILER_FUELTYPE not between", value1, value2, "tboilerFueltype");
            return (Criteria) this;
        }

        public Criteria andTboilerFuelausageIsNull() {
            addCriterion("TBOILER_FUELAUSAGE is null");
            return (Criteria) this;
        }

        public Criteria andTboilerFuelausageIsNotNull() {
            addCriterion("TBOILER_FUELAUSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andTboilerFuelausageEqualTo(Double value) {
            addCriterion("TBOILER_FUELAUSAGE =", value, "tboilerFuelausage");
            return (Criteria) this;
        }

        public Criteria andTboilerFuelausageNotEqualTo(Double value) {
            addCriterion("TBOILER_FUELAUSAGE <>", value, "tboilerFuelausage");
            return (Criteria) this;
        }

        public Criteria andTboilerFuelausageGreaterThan(Double value) {
            addCriterion("TBOILER_FUELAUSAGE >", value, "tboilerFuelausage");
            return (Criteria) this;
        }

        public Criteria andTboilerFuelausageGreaterThanOrEqualTo(Double value) {
            addCriterion("TBOILER_FUELAUSAGE >=", value, "tboilerFuelausage");
            return (Criteria) this;
        }

        public Criteria andTboilerFuelausageLessThan(Double value) {
            addCriterion("TBOILER_FUELAUSAGE <", value, "tboilerFuelausage");
            return (Criteria) this;
        }

        public Criteria andTboilerFuelausageLessThanOrEqualTo(Double value) {
            addCriterion("TBOILER_FUELAUSAGE <=", value, "tboilerFuelausage");
            return (Criteria) this;
        }

        public Criteria andTboilerFuelausageIn(List<Double> values) {
            addCriterion("TBOILER_FUELAUSAGE in", values, "tboilerFuelausage");
            return (Criteria) this;
        }

        public Criteria andTboilerFuelausageNotIn(List<Double> values) {
            addCriterion("TBOILER_FUELAUSAGE not in", values, "tboilerFuelausage");
            return (Criteria) this;
        }

        public Criteria andTboilerFuelausageBetween(Double value1, Double value2) {
            addCriterion("TBOILER_FUELAUSAGE between", value1, value2, "tboilerFuelausage");
            return (Criteria) this;
        }

        public Criteria andTboilerFuelausageNotBetween(Double value1, Double value2) {
            addCriterion("TBOILER_FUELAUSAGE not between", value1, value2, "tboilerFuelausage");
            return (Criteria) this;
        }

        public Criteria andTboilerFuelunitIsNull() {
            addCriterion("TBOILER_FUELUNIT is null");
            return (Criteria) this;
        }

        public Criteria andTboilerFuelunitIsNotNull() {
            addCriterion("TBOILER_FUELUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andTboilerFuelunitEqualTo(String value) {
            addCriterion("TBOILER_FUELUNIT =", value, "tboilerFuelunit");
            return (Criteria) this;
        }

        public Criteria andTboilerFuelunitNotEqualTo(String value) {
            addCriterion("TBOILER_FUELUNIT <>", value, "tboilerFuelunit");
            return (Criteria) this;
        }

        public Criteria andTboilerFuelunitGreaterThan(String value) {
            addCriterion("TBOILER_FUELUNIT >", value, "tboilerFuelunit");
            return (Criteria) this;
        }

        public Criteria andTboilerFuelunitGreaterThanOrEqualTo(String value) {
            addCriterion("TBOILER_FUELUNIT >=", value, "tboilerFuelunit");
            return (Criteria) this;
        }

        public Criteria andTboilerFuelunitLessThan(String value) {
            addCriterion("TBOILER_FUELUNIT <", value, "tboilerFuelunit");
            return (Criteria) this;
        }

        public Criteria andTboilerFuelunitLessThanOrEqualTo(String value) {
            addCriterion("TBOILER_FUELUNIT <=", value, "tboilerFuelunit");
            return (Criteria) this;
        }

        public Criteria andTboilerFuelunitLike(String value) {
            addCriterion("TBOILER_FUELUNIT like", value, "tboilerFuelunit");
            return (Criteria) this;
        }

        public Criteria andTboilerFuelunitNotLike(String value) {
            addCriterion("TBOILER_FUELUNIT not like", value, "tboilerFuelunit");
            return (Criteria) this;
        }

        public Criteria andTboilerFuelunitIn(List<String> values) {
            addCriterion("TBOILER_FUELUNIT in", values, "tboilerFuelunit");
            return (Criteria) this;
        }

        public Criteria andTboilerFuelunitNotIn(List<String> values) {
            addCriterion("TBOILER_FUELUNIT not in", values, "tboilerFuelunit");
            return (Criteria) this;
        }

        public Criteria andTboilerFuelunitBetween(String value1, String value2) {
            addCriterion("TBOILER_FUELUNIT between", value1, value2, "tboilerFuelunit");
            return (Criteria) this;
        }

        public Criteria andTboilerFuelunitNotBetween(String value1, String value2) {
            addCriterion("TBOILER_FUELUNIT not between", value1, value2, "tboilerFuelunit");
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

        public Criteria andLastCheckedTimeIsNull() {
            addCriterion("last_checked_time is null");
            return (Criteria) this;
        }

        public Criteria andLastCheckedTimeIsNotNull() {
            addCriterion("last_checked_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastCheckedTimeEqualTo(Date value) {
            addCriterion("last_checked_time =", value, "lastCheckedTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckedTimeNotEqualTo(Date value) {
            addCriterion("last_checked_time <>", value, "lastCheckedTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckedTimeGreaterThan(Date value) {
            addCriterion("last_checked_time >", value, "lastCheckedTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_checked_time >=", value, "lastCheckedTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckedTimeLessThan(Date value) {
            addCriterion("last_checked_time <", value, "lastCheckedTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckedTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_checked_time <=", value, "lastCheckedTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckedTimeIn(List<Date> values) {
            addCriterion("last_checked_time in", values, "lastCheckedTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckedTimeNotIn(List<Date> values) {
            addCriterion("last_checked_time not in", values, "lastCheckedTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckedTimeBetween(Date value1, Date value2) {
            addCriterion("last_checked_time between", value1, value2, "lastCheckedTime");
            return (Criteria) this;
        }

        public Criteria andLastCheckedTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_checked_time not between", value1, value2, "lastCheckedTime");
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