package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class TotalKilnTempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TotalKilnTempExample() {
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

        public Criteria andFkilntotalIdIsNull() {
            addCriterion("fkilntotal_id is null");
            return (Criteria) this;
        }

        public Criteria andFkilntotalIdIsNotNull() {
            addCriterion("fkilntotal_id is not null");
            return (Criteria) this;
        }

        public Criteria andFkilntotalIdEqualTo(Integer value) {
            addCriterion("fkilntotal_id =", value, "fkilntotalId");
            return (Criteria) this;
        }

        public Criteria andFkilntotalIdNotEqualTo(Integer value) {
            addCriterion("fkilntotal_id <>", value, "fkilntotalId");
            return (Criteria) this;
        }

        public Criteria andFkilntotalIdGreaterThan(Integer value) {
            addCriterion("fkilntotal_id >", value, "fkilntotalId");
            return (Criteria) this;
        }

        public Criteria andFkilntotalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fkilntotal_id >=", value, "fkilntotalId");
            return (Criteria) this;
        }

        public Criteria andFkilntotalIdLessThan(Integer value) {
            addCriterion("fkilntotal_id <", value, "fkilntotalId");
            return (Criteria) this;
        }

        public Criteria andFkilntotalIdLessThanOrEqualTo(Integer value) {
            addCriterion("fkilntotal_id <=", value, "fkilntotalId");
            return (Criteria) this;
        }

        public Criteria andFkilntotalIdIn(List<Integer> values) {
            addCriterion("fkilntotal_id in", values, "fkilntotalId");
            return (Criteria) this;
        }

        public Criteria andFkilntotalIdNotIn(List<Integer> values) {
            addCriterion("fkilntotal_id not in", values, "fkilntotalId");
            return (Criteria) this;
        }

        public Criteria andFkilntotalIdBetween(Integer value1, Integer value2) {
            addCriterion("fkilntotal_id between", value1, value2, "fkilntotalId");
            return (Criteria) this;
        }

        public Criteria andFkilntotalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fkilntotal_id not between", value1, value2, "fkilntotalId");
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

        public Criteria andFuelTypeDecIsNull() {
            addCriterion("fuel_type_dec is null");
            return (Criteria) this;
        }

        public Criteria andFuelTypeDecIsNotNull() {
            addCriterion("fuel_type_dec is not null");
            return (Criteria) this;
        }

        public Criteria andFuelTypeDecEqualTo(String value) {
            addCriterion("fuel_type_dec =", value, "fuelTypeDec");
            return (Criteria) this;
        }

        public Criteria andFuelTypeDecNotEqualTo(String value) {
            addCriterion("fuel_type_dec <>", value, "fuelTypeDec");
            return (Criteria) this;
        }

        public Criteria andFuelTypeDecGreaterThan(String value) {
            addCriterion("fuel_type_dec >", value, "fuelTypeDec");
            return (Criteria) this;
        }

        public Criteria andFuelTypeDecGreaterThanOrEqualTo(String value) {
            addCriterion("fuel_type_dec >=", value, "fuelTypeDec");
            return (Criteria) this;
        }

        public Criteria andFuelTypeDecLessThan(String value) {
            addCriterion("fuel_type_dec <", value, "fuelTypeDec");
            return (Criteria) this;
        }

        public Criteria andFuelTypeDecLessThanOrEqualTo(String value) {
            addCriterion("fuel_type_dec <=", value, "fuelTypeDec");
            return (Criteria) this;
        }

        public Criteria andFuelTypeDecLike(String value) {
            addCriterion("fuel_type_dec like", value, "fuelTypeDec");
            return (Criteria) this;
        }

        public Criteria andFuelTypeDecNotLike(String value) {
            addCriterion("fuel_type_dec not like", value, "fuelTypeDec");
            return (Criteria) this;
        }

        public Criteria andFuelTypeDecIn(List<String> values) {
            addCriterion("fuel_type_dec in", values, "fuelTypeDec");
            return (Criteria) this;
        }

        public Criteria andFuelTypeDecNotIn(List<String> values) {
            addCriterion("fuel_type_dec not in", values, "fuelTypeDec");
            return (Criteria) this;
        }

        public Criteria andFuelTypeDecBetween(String value1, String value2) {
            addCriterion("fuel_type_dec between", value1, value2, "fuelTypeDec");
            return (Criteria) this;
        }

        public Criteria andFuelTypeDecNotBetween(String value1, String value2) {
            addCriterion("fuel_type_dec not between", value1, value2, "fuelTypeDec");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIsNull() {
            addCriterion("fuel_type is null");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIsNotNull() {
            addCriterion("fuel_type is not null");
            return (Criteria) this;
        }

        public Criteria andFuelTypeEqualTo(String value) {
            addCriterion("fuel_type =", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotEqualTo(String value) {
            addCriterion("fuel_type <>", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeGreaterThan(String value) {
            addCriterion("fuel_type >", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("fuel_type >=", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeLessThan(String value) {
            addCriterion("fuel_type <", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeLessThanOrEqualTo(String value) {
            addCriterion("fuel_type <=", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeLike(String value) {
            addCriterion("fuel_type like", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotLike(String value) {
            addCriterion("fuel_type not like", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIn(List<String> values) {
            addCriterion("fuel_type in", values, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotIn(List<String> values) {
            addCriterion("fuel_type not in", values, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeBetween(String value1, String value2) {
            addCriterion("fuel_type between", value1, value2, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotBetween(String value1, String value2) {
            addCriterion("fuel_type not between", value1, value2, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFkilnNumIsNull() {
            addCriterion("fkiln_num is null");
            return (Criteria) this;
        }

        public Criteria andFkilnNumIsNotNull() {
            addCriterion("fkiln_num is not null");
            return (Criteria) this;
        }

        public Criteria andFkilnNumEqualTo(Integer value) {
            addCriterion("fkiln_num =", value, "fkilnNum");
            return (Criteria) this;
        }

        public Criteria andFkilnNumNotEqualTo(Integer value) {
            addCriterion("fkiln_num <>", value, "fkilnNum");
            return (Criteria) this;
        }

        public Criteria andFkilnNumGreaterThan(Integer value) {
            addCriterion("fkiln_num >", value, "fkilnNum");
            return (Criteria) this;
        }

        public Criteria andFkilnNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("fkiln_num >=", value, "fkilnNum");
            return (Criteria) this;
        }

        public Criteria andFkilnNumLessThan(Integer value) {
            addCriterion("fkiln_num <", value, "fkilnNum");
            return (Criteria) this;
        }

        public Criteria andFkilnNumLessThanOrEqualTo(Integer value) {
            addCriterion("fkiln_num <=", value, "fkilnNum");
            return (Criteria) this;
        }

        public Criteria andFkilnNumIn(List<Integer> values) {
            addCriterion("fkiln_num in", values, "fkilnNum");
            return (Criteria) this;
        }

        public Criteria andFkilnNumNotIn(List<Integer> values) {
            addCriterion("fkiln_num not in", values, "fkilnNum");
            return (Criteria) this;
        }

        public Criteria andFkilnNumBetween(Integer value1, Integer value2) {
            addCriterion("fkiln_num between", value1, value2, "fkilnNum");
            return (Criteria) this;
        }

        public Criteria andFkilnNumNotBetween(Integer value1, Integer value2) {
            addCriterion("fkiln_num not between", value1, value2, "fkilnNum");
            return (Criteria) this;
        }

        public Criteria andFkilnUnitIsNull() {
            addCriterion("fkiln_unit is null");
            return (Criteria) this;
        }

        public Criteria andFkilnUnitIsNotNull() {
            addCriterion("fkiln_unit is not null");
            return (Criteria) this;
        }

        public Criteria andFkilnUnitEqualTo(String value) {
            addCriterion("fkiln_unit =", value, "fkilnUnit");
            return (Criteria) this;
        }

        public Criteria andFkilnUnitNotEqualTo(String value) {
            addCriterion("fkiln_unit <>", value, "fkilnUnit");
            return (Criteria) this;
        }

        public Criteria andFkilnUnitGreaterThan(String value) {
            addCriterion("fkiln_unit >", value, "fkilnUnit");
            return (Criteria) this;
        }

        public Criteria andFkilnUnitGreaterThanOrEqualTo(String value) {
            addCriterion("fkiln_unit >=", value, "fkilnUnit");
            return (Criteria) this;
        }

        public Criteria andFkilnUnitLessThan(String value) {
            addCriterion("fkiln_unit <", value, "fkilnUnit");
            return (Criteria) this;
        }

        public Criteria andFkilnUnitLessThanOrEqualTo(String value) {
            addCriterion("fkiln_unit <=", value, "fkilnUnit");
            return (Criteria) this;
        }

        public Criteria andFkilnUnitLike(String value) {
            addCriterion("fkiln_unit like", value, "fkilnUnit");
            return (Criteria) this;
        }

        public Criteria andFkilnUnitNotLike(String value) {
            addCriterion("fkiln_unit not like", value, "fkilnUnit");
            return (Criteria) this;
        }

        public Criteria andFkilnUnitIn(List<String> values) {
            addCriterion("fkiln_unit in", values, "fkilnUnit");
            return (Criteria) this;
        }

        public Criteria andFkilnUnitNotIn(List<String> values) {
            addCriterion("fkiln_unit not in", values, "fkilnUnit");
            return (Criteria) this;
        }

        public Criteria andFkilnUnitBetween(String value1, String value2) {
            addCriterion("fkiln_unit between", value1, value2, "fkilnUnit");
            return (Criteria) this;
        }

        public Criteria andFkilnUnitNotBetween(String value1, String value2) {
            addCriterion("fkiln_unit not between", value1, value2, "fkilnUnit");
            return (Criteria) this;
        }

        public Criteria andFkilnUsageIsNull() {
            addCriterion("fkiln_usage is null");
            return (Criteria) this;
        }

        public Criteria andFkilnUsageIsNotNull() {
            addCriterion("fkiln_usage is not null");
            return (Criteria) this;
        }

        public Criteria andFkilnUsageEqualTo(Double value) {
            addCriterion("fkiln_usage =", value, "fkilnUsage");
            return (Criteria) this;
        }

        public Criteria andFkilnUsageNotEqualTo(Double value) {
            addCriterion("fkiln_usage <>", value, "fkilnUsage");
            return (Criteria) this;
        }

        public Criteria andFkilnUsageGreaterThan(Double value) {
            addCriterion("fkiln_usage >", value, "fkilnUsage");
            return (Criteria) this;
        }

        public Criteria andFkilnUsageGreaterThanOrEqualTo(Double value) {
            addCriterion("fkiln_usage >=", value, "fkilnUsage");
            return (Criteria) this;
        }

        public Criteria andFkilnUsageLessThan(Double value) {
            addCriterion("fkiln_usage <", value, "fkilnUsage");
            return (Criteria) this;
        }

        public Criteria andFkilnUsageLessThanOrEqualTo(Double value) {
            addCriterion("fkiln_usage <=", value, "fkilnUsage");
            return (Criteria) this;
        }

        public Criteria andFkilnUsageIn(List<Double> values) {
            addCriterion("fkiln_usage in", values, "fkilnUsage");
            return (Criteria) this;
        }

        public Criteria andFkilnUsageNotIn(List<Double> values) {
            addCriterion("fkiln_usage not in", values, "fkilnUsage");
            return (Criteria) this;
        }

        public Criteria andFkilnUsageBetween(Double value1, Double value2) {
            addCriterion("fkiln_usage between", value1, value2, "fkilnUsage");
            return (Criteria) this;
        }

        public Criteria andFkilnUsageNotBetween(Double value1, Double value2) {
            addCriterion("fkiln_usage not between", value1, value2, "fkilnUsage");
            return (Criteria) this;
        }

        public Criteria andFkilnUsefulDecIsNull() {
            addCriterion("fkiln_useful_dec is null");
            return (Criteria) this;
        }

        public Criteria andFkilnUsefulDecIsNotNull() {
            addCriterion("fkiln_useful_dec is not null");
            return (Criteria) this;
        }

        public Criteria andFkilnUsefulDecEqualTo(String value) {
            addCriterion("fkiln_useful_dec =", value, "fkilnUsefulDec");
            return (Criteria) this;
        }

        public Criteria andFkilnUsefulDecNotEqualTo(String value) {
            addCriterion("fkiln_useful_dec <>", value, "fkilnUsefulDec");
            return (Criteria) this;
        }

        public Criteria andFkilnUsefulDecGreaterThan(String value) {
            addCriterion("fkiln_useful_dec >", value, "fkilnUsefulDec");
            return (Criteria) this;
        }

        public Criteria andFkilnUsefulDecGreaterThanOrEqualTo(String value) {
            addCriterion("fkiln_useful_dec >=", value, "fkilnUsefulDec");
            return (Criteria) this;
        }

        public Criteria andFkilnUsefulDecLessThan(String value) {
            addCriterion("fkiln_useful_dec <", value, "fkilnUsefulDec");
            return (Criteria) this;
        }

        public Criteria andFkilnUsefulDecLessThanOrEqualTo(String value) {
            addCriterion("fkiln_useful_dec <=", value, "fkilnUsefulDec");
            return (Criteria) this;
        }

        public Criteria andFkilnUsefulDecLike(String value) {
            addCriterion("fkiln_useful_dec like", value, "fkilnUsefulDec");
            return (Criteria) this;
        }

        public Criteria andFkilnUsefulDecNotLike(String value) {
            addCriterion("fkiln_useful_dec not like", value, "fkilnUsefulDec");
            return (Criteria) this;
        }

        public Criteria andFkilnUsefulDecIn(List<String> values) {
            addCriterion("fkiln_useful_dec in", values, "fkilnUsefulDec");
            return (Criteria) this;
        }

        public Criteria andFkilnUsefulDecNotIn(List<String> values) {
            addCriterion("fkiln_useful_dec not in", values, "fkilnUsefulDec");
            return (Criteria) this;
        }

        public Criteria andFkilnUsefulDecBetween(String value1, String value2) {
            addCriterion("fkiln_useful_dec between", value1, value2, "fkilnUsefulDec");
            return (Criteria) this;
        }

        public Criteria andFkilnUsefulDecNotBetween(String value1, String value2) {
            addCriterion("fkiln_useful_dec not between", value1, value2, "fkilnUsefulDec");
            return (Criteria) this;
        }

        public Criteria andFkilnUsefulIsNull() {
            addCriterion("fkiln_useful is null");
            return (Criteria) this;
        }

        public Criteria andFkilnUsefulIsNotNull() {
            addCriterion("fkiln_useful is not null");
            return (Criteria) this;
        }

        public Criteria andFkilnUsefulEqualTo(String value) {
            addCriterion("fkiln_useful =", value, "fkilnUseful");
            return (Criteria) this;
        }

        public Criteria andFkilnUsefulNotEqualTo(String value) {
            addCriterion("fkiln_useful <>", value, "fkilnUseful");
            return (Criteria) this;
        }

        public Criteria andFkilnUsefulGreaterThan(String value) {
            addCriterion("fkiln_useful >", value, "fkilnUseful");
            return (Criteria) this;
        }

        public Criteria andFkilnUsefulGreaterThanOrEqualTo(String value) {
            addCriterion("fkiln_useful >=", value, "fkilnUseful");
            return (Criteria) this;
        }

        public Criteria andFkilnUsefulLessThan(String value) {
            addCriterion("fkiln_useful <", value, "fkilnUseful");
            return (Criteria) this;
        }

        public Criteria andFkilnUsefulLessThanOrEqualTo(String value) {
            addCriterion("fkiln_useful <=", value, "fkilnUseful");
            return (Criteria) this;
        }

        public Criteria andFkilnUsefulLike(String value) {
            addCriterion("fkiln_useful like", value, "fkilnUseful");
            return (Criteria) this;
        }

        public Criteria andFkilnUsefulNotLike(String value) {
            addCriterion("fkiln_useful not like", value, "fkilnUseful");
            return (Criteria) this;
        }

        public Criteria andFkilnUsefulIn(List<String> values) {
            addCriterion("fkiln_useful in", values, "fkilnUseful");
            return (Criteria) this;
        }

        public Criteria andFkilnUsefulNotIn(List<String> values) {
            addCriterion("fkiln_useful not in", values, "fkilnUseful");
            return (Criteria) this;
        }

        public Criteria andFkilnUsefulBetween(String value1, String value2) {
            addCriterion("fkiln_useful between", value1, value2, "fkilnUseful");
            return (Criteria) this;
        }

        public Criteria andFkilnUsefulNotBetween(String value1, String value2) {
            addCriterion("fkiln_useful not between", value1, value2, "fkilnUseful");
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