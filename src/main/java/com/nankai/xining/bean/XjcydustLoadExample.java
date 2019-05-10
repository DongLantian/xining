package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class XjcydustLoadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XjcydustLoadExample() {
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

        public Criteria andLoadIdIsNull() {
            addCriterion("load_id is null");
            return (Criteria) this;
        }

        public Criteria andLoadIdIsNotNull() {
            addCriterion("load_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoadIdEqualTo(Integer value) {
            addCriterion("load_id =", value, "loadId");
            return (Criteria) this;
        }

        public Criteria andLoadIdNotEqualTo(Integer value) {
            addCriterion("load_id <>", value, "loadId");
            return (Criteria) this;
        }

        public Criteria andLoadIdGreaterThan(Integer value) {
            addCriterion("load_id >", value, "loadId");
            return (Criteria) this;
        }

        public Criteria andLoadIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("load_id >=", value, "loadId");
            return (Criteria) this;
        }

        public Criteria andLoadIdLessThan(Integer value) {
            addCriterion("load_id <", value, "loadId");
            return (Criteria) this;
        }

        public Criteria andLoadIdLessThanOrEqualTo(Integer value) {
            addCriterion("load_id <=", value, "loadId");
            return (Criteria) this;
        }

        public Criteria andLoadIdIn(List<Integer> values) {
            addCriterion("load_id in", values, "loadId");
            return (Criteria) this;
        }

        public Criteria andLoadIdNotIn(List<Integer> values) {
            addCriterion("load_id not in", values, "loadId");
            return (Criteria) this;
        }

        public Criteria andLoadIdBetween(Integer value1, Integer value2) {
            addCriterion("load_id between", value1, value2, "loadId");
            return (Criteria) this;
        }

        public Criteria andLoadIdNotBetween(Integer value1, Integer value2) {
            addCriterion("load_id not between", value1, value2, "loadId");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("year like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("year not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andComIdIsNull() {
            addCriterion("com_id is null");
            return (Criteria) this;
        }

        public Criteria andComIdIsNotNull() {
            addCriterion("com_id is not null");
            return (Criteria) this;
        }

        public Criteria andComIdEqualTo(Integer value) {
            addCriterion("com_id =", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotEqualTo(Integer value) {
            addCriterion("com_id <>", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdGreaterThan(Integer value) {
            addCriterion("com_id >", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("com_id >=", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLessThan(Integer value) {
            addCriterion("com_id <", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLessThanOrEqualTo(Integer value) {
            addCriterion("com_id <=", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdIn(List<Integer> values) {
            addCriterion("com_id in", values, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotIn(List<Integer> values) {
            addCriterion("com_id not in", values, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdBetween(Integer value1, Integer value2) {
            addCriterion("com_id between", value1, value2, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotBetween(Integer value1, Integer value2) {
            addCriterion("com_id not between", value1, value2, "comId");
            return (Criteria) this;
        }

        public Criteria andMaterialWaterIsNull() {
            addCriterion("material_water is null");
            return (Criteria) this;
        }

        public Criteria andMaterialWaterIsNotNull() {
            addCriterion("material_water is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialWaterEqualTo(Double value) {
            addCriterion("material_water =", value, "materialWater");
            return (Criteria) this;
        }

        public Criteria andMaterialWaterNotEqualTo(Double value) {
            addCriterion("material_water <>", value, "materialWater");
            return (Criteria) this;
        }

        public Criteria andMaterialWaterGreaterThan(Double value) {
            addCriterion("material_water >", value, "materialWater");
            return (Criteria) this;
        }

        public Criteria andMaterialWaterGreaterThanOrEqualTo(Double value) {
            addCriterion("material_water >=", value, "materialWater");
            return (Criteria) this;
        }

        public Criteria andMaterialWaterLessThan(Double value) {
            addCriterion("material_water <", value, "materialWater");
            return (Criteria) this;
        }

        public Criteria andMaterialWaterLessThanOrEqualTo(Double value) {
            addCriterion("material_water <=", value, "materialWater");
            return (Criteria) this;
        }

        public Criteria andMaterialWaterIn(List<Double> values) {
            addCriterion("material_water in", values, "materialWater");
            return (Criteria) this;
        }

        public Criteria andMaterialWaterNotIn(List<Double> values) {
            addCriterion("material_water not in", values, "materialWater");
            return (Criteria) this;
        }

        public Criteria andMaterialWaterBetween(Double value1, Double value2) {
            addCriterion("material_water between", value1, value2, "materialWater");
            return (Criteria) this;
        }

        public Criteria andMaterialWaterNotBetween(Double value1, Double value2) {
            addCriterion("material_water not between", value1, value2, "materialWater");
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

        public Criteria andMaterialLoadIsNull() {
            addCriterion("material_load is null");
            return (Criteria) this;
        }

        public Criteria andMaterialLoadIsNotNull() {
            addCriterion("material_load is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialLoadEqualTo(Integer value) {
            addCriterion("material_load =", value, "materialLoad");
            return (Criteria) this;
        }

        public Criteria andMaterialLoadNotEqualTo(Integer value) {
            addCriterion("material_load <>", value, "materialLoad");
            return (Criteria) this;
        }

        public Criteria andMaterialLoadGreaterThan(Integer value) {
            addCriterion("material_load >", value, "materialLoad");
            return (Criteria) this;
        }

        public Criteria andMaterialLoadGreaterThanOrEqualTo(Integer value) {
            addCriterion("material_load >=", value, "materialLoad");
            return (Criteria) this;
        }

        public Criteria andMaterialLoadLessThan(Integer value) {
            addCriterion("material_load <", value, "materialLoad");
            return (Criteria) this;
        }

        public Criteria andMaterialLoadLessThanOrEqualTo(Integer value) {
            addCriterion("material_load <=", value, "materialLoad");
            return (Criteria) this;
        }

        public Criteria andMaterialLoadIn(List<Integer> values) {
            addCriterion("material_load in", values, "materialLoad");
            return (Criteria) this;
        }

        public Criteria andMaterialLoadNotIn(List<Integer> values) {
            addCriterion("material_load not in", values, "materialLoad");
            return (Criteria) this;
        }

        public Criteria andMaterialLoadBetween(Integer value1, Integer value2) {
            addCriterion("material_load between", value1, value2, "materialLoad");
            return (Criteria) this;
        }

        public Criteria andMaterialLoadNotBetween(Integer value1, Integer value2) {
            addCriterion("material_load not between", value1, value2, "materialLoad");
            return (Criteria) this;
        }

        public Criteria andLoadNumIsNull() {
            addCriterion("load_num is null");
            return (Criteria) this;
        }

        public Criteria andLoadNumIsNotNull() {
            addCriterion("load_num is not null");
            return (Criteria) this;
        }

        public Criteria andLoadNumEqualTo(Integer value) {
            addCriterion("load_num =", value, "loadNum");
            return (Criteria) this;
        }

        public Criteria andLoadNumNotEqualTo(Integer value) {
            addCriterion("load_num <>", value, "loadNum");
            return (Criteria) this;
        }

        public Criteria andLoadNumGreaterThan(Integer value) {
            addCriterion("load_num >", value, "loadNum");
            return (Criteria) this;
        }

        public Criteria andLoadNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("load_num >=", value, "loadNum");
            return (Criteria) this;
        }

        public Criteria andLoadNumLessThan(Integer value) {
            addCriterion("load_num <", value, "loadNum");
            return (Criteria) this;
        }

        public Criteria andLoadNumLessThanOrEqualTo(Integer value) {
            addCriterion("load_num <=", value, "loadNum");
            return (Criteria) this;
        }

        public Criteria andLoadNumIn(List<Integer> values) {
            addCriterion("load_num in", values, "loadNum");
            return (Criteria) this;
        }

        public Criteria andLoadNumNotIn(List<Integer> values) {
            addCriterion("load_num not in", values, "loadNum");
            return (Criteria) this;
        }

        public Criteria andLoadNumBetween(Integer value1, Integer value2) {
            addCriterion("load_num between", value1, value2, "loadNum");
            return (Criteria) this;
        }

        public Criteria andLoadNumNotBetween(Integer value1, Integer value2) {
            addCriterion("load_num not between", value1, value2, "loadNum");
            return (Criteria) this;
        }

        public Criteria andMloadUnitIsNull() {
            addCriterion("mload_unit is null");
            return (Criteria) this;
        }

        public Criteria andMloadUnitIsNotNull() {
            addCriterion("mload_unit is not null");
            return (Criteria) this;
        }

        public Criteria andMloadUnitEqualTo(String value) {
            addCriterion("mload_unit =", value, "mloadUnit");
            return (Criteria) this;
        }

        public Criteria andMloadUnitNotEqualTo(String value) {
            addCriterion("mload_unit <>", value, "mloadUnit");
            return (Criteria) this;
        }

        public Criteria andMloadUnitGreaterThan(String value) {
            addCriterion("mload_unit >", value, "mloadUnit");
            return (Criteria) this;
        }

        public Criteria andMloadUnitGreaterThanOrEqualTo(String value) {
            addCriterion("mload_unit >=", value, "mloadUnit");
            return (Criteria) this;
        }

        public Criteria andMloadUnitLessThan(String value) {
            addCriterion("mload_unit <", value, "mloadUnit");
            return (Criteria) this;
        }

        public Criteria andMloadUnitLessThanOrEqualTo(String value) {
            addCriterion("mload_unit <=", value, "mloadUnit");
            return (Criteria) this;
        }

        public Criteria andMloadUnitLike(String value) {
            addCriterion("mload_unit like", value, "mloadUnit");
            return (Criteria) this;
        }

        public Criteria andMloadUnitNotLike(String value) {
            addCriterion("mload_unit not like", value, "mloadUnit");
            return (Criteria) this;
        }

        public Criteria andMloadUnitIn(List<String> values) {
            addCriterion("mload_unit in", values, "mloadUnit");
            return (Criteria) this;
        }

        public Criteria andMloadUnitNotIn(List<String> values) {
            addCriterion("mload_unit not in", values, "mloadUnit");
            return (Criteria) this;
        }

        public Criteria andMloadUnitBetween(String value1, String value2) {
            addCriterion("mload_unit between", value1, value2, "mloadUnit");
            return (Criteria) this;
        }

        public Criteria andMloadUnitNotBetween(String value1, String value2) {
            addCriterion("mload_unit not between", value1, value2, "mloadUnit");
            return (Criteria) this;
        }

        public Criteria andUwindValueIsNull() {
            addCriterion("uwind_value is null");
            return (Criteria) this;
        }

        public Criteria andUwindValueIsNotNull() {
            addCriterion("uwind_value is not null");
            return (Criteria) this;
        }

        public Criteria andUwindValueEqualTo(Double value) {
            addCriterion("uwind_value =", value, "uwindValue");
            return (Criteria) this;
        }

        public Criteria andUwindValueNotEqualTo(Double value) {
            addCriterion("uwind_value <>", value, "uwindValue");
            return (Criteria) this;
        }

        public Criteria andUwindValueGreaterThan(Double value) {
            addCriterion("uwind_value >", value, "uwindValue");
            return (Criteria) this;
        }

        public Criteria andUwindValueGreaterThanOrEqualTo(Double value) {
            addCriterion("uwind_value >=", value, "uwindValue");
            return (Criteria) this;
        }

        public Criteria andUwindValueLessThan(Double value) {
            addCriterion("uwind_value <", value, "uwindValue");
            return (Criteria) this;
        }

        public Criteria andUwindValueLessThanOrEqualTo(Double value) {
            addCriterion("uwind_value <=", value, "uwindValue");
            return (Criteria) this;
        }

        public Criteria andUwindValueIn(List<Double> values) {
            addCriterion("uwind_value in", values, "uwindValue");
            return (Criteria) this;
        }

        public Criteria andUwindValueNotIn(List<Double> values) {
            addCriterion("uwind_value not in", values, "uwindValue");
            return (Criteria) this;
        }

        public Criteria andUwindValueBetween(Double value1, Double value2) {
            addCriterion("uwind_value between", value1, value2, "uwindValue");
            return (Criteria) this;
        }

        public Criteria andUwindValueNotBetween(Double value1, Double value2) {
            addCriterion("uwind_value not between", value1, value2, "uwindValue");
            return (Criteria) this;
        }

        public Criteria andControlnameIsNull() {
            addCriterion("controlname is null");
            return (Criteria) this;
        }

        public Criteria andControlnameIsNotNull() {
            addCriterion("controlname is not null");
            return (Criteria) this;
        }

        public Criteria andControlnameEqualTo(String value) {
            addCriterion("controlname =", value, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameNotEqualTo(String value) {
            addCriterion("controlname <>", value, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameGreaterThan(String value) {
            addCriterion("controlname >", value, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameGreaterThanOrEqualTo(String value) {
            addCriterion("controlname >=", value, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameLessThan(String value) {
            addCriterion("controlname <", value, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameLessThanOrEqualTo(String value) {
            addCriterion("controlname <=", value, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameLike(String value) {
            addCriterion("controlname like", value, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameNotLike(String value) {
            addCriterion("controlname not like", value, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameIn(List<String> values) {
            addCriterion("controlname in", values, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameNotIn(List<String> values) {
            addCriterion("controlname not in", values, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameBetween(String value1, String value2) {
            addCriterion("controlname between", value1, value2, "controlname");
            return (Criteria) this;
        }

        public Criteria andControlnameNotBetween(String value1, String value2) {
            addCriterion("controlname not between", value1, value2, "controlname");
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

        public Criteria andVocEmissionIsNull() {
            addCriterion("voc_emission is null");
            return (Criteria) this;
        }

        public Criteria andVocEmissionIsNotNull() {
            addCriterion("voc_emission is not null");
            return (Criteria) this;
        }

        public Criteria andVocEmissionEqualTo(Double value) {
            addCriterion("voc_emission =", value, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionNotEqualTo(Double value) {
            addCriterion("voc_emission <>", value, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionGreaterThan(Double value) {
            addCriterion("voc_emission >", value, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("voc_emission >=", value, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionLessThan(Double value) {
            addCriterion("voc_emission <", value, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionLessThanOrEqualTo(Double value) {
            addCriterion("voc_emission <=", value, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionIn(List<Double> values) {
            addCriterion("voc_emission in", values, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionNotIn(List<Double> values) {
            addCriterion("voc_emission not in", values, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionBetween(Double value1, Double value2) {
            addCriterion("voc_emission between", value1, value2, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionNotBetween(Double value1, Double value2) {
            addCriterion("voc_emission not between", value1, value2, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionIsNull() {
            addCriterion("nh3_emission is null");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionIsNotNull() {
            addCriterion("nh3_emission is not null");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionEqualTo(Double value) {
            addCriterion("nh3_emission =", value, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionNotEqualTo(Double value) {
            addCriterion("nh3_emission <>", value, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionGreaterThan(Double value) {
            addCriterion("nh3_emission >", value, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("nh3_emission >=", value, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionLessThan(Double value) {
            addCriterion("nh3_emission <", value, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionLessThanOrEqualTo(Double value) {
            addCriterion("nh3_emission <=", value, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionIn(List<Double> values) {
            addCriterion("nh3_emission in", values, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionNotIn(List<Double> values) {
            addCriterion("nh3_emission not in", values, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionBetween(Double value1, Double value2) {
            addCriterion("nh3_emission between", value1, value2, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionNotBetween(Double value1, Double value2) {
            addCriterion("nh3_emission not between", value1, value2, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionIsNull() {
            addCriterion("so2_emission is null");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionIsNotNull() {
            addCriterion("so2_emission is not null");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionEqualTo(Double value) {
            addCriterion("so2_emission =", value, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionNotEqualTo(Double value) {
            addCriterion("so2_emission <>", value, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionGreaterThan(Double value) {
            addCriterion("so2_emission >", value, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("so2_emission >=", value, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionLessThan(Double value) {
            addCriterion("so2_emission <", value, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionLessThanOrEqualTo(Double value) {
            addCriterion("so2_emission <=", value, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionIn(List<Double> values) {
            addCriterion("so2_emission in", values, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionNotIn(List<Double> values) {
            addCriterion("so2_emission not in", values, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionBetween(Double value1, Double value2) {
            addCriterion("so2_emission between", value1, value2, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionNotBetween(Double value1, Double value2) {
            addCriterion("so2_emission not between", value1, value2, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionIsNull() {
            addCriterion("co_emission is null");
            return (Criteria) this;
        }

        public Criteria andCoEmissionIsNotNull() {
            addCriterion("co_emission is not null");
            return (Criteria) this;
        }

        public Criteria andCoEmissionEqualTo(Double value) {
            addCriterion("co_emission =", value, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionNotEqualTo(Double value) {
            addCriterion("co_emission <>", value, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionGreaterThan(Double value) {
            addCriterion("co_emission >", value, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("co_emission >=", value, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionLessThan(Double value) {
            addCriterion("co_emission <", value, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionLessThanOrEqualTo(Double value) {
            addCriterion("co_emission <=", value, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionIn(List<Double> values) {
            addCriterion("co_emission in", values, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionNotIn(List<Double> values) {
            addCriterion("co_emission not in", values, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionBetween(Double value1, Double value2) {
            addCriterion("co_emission between", value1, value2, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionNotBetween(Double value1, Double value2) {
            addCriterion("co_emission not between", value1, value2, "coEmission");
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

        public Criteria andNoxEmissionIsNull() {
            addCriterion("nox_emission is null");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionIsNotNull() {
            addCriterion("nox_emission is not null");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionEqualTo(Double value) {
            addCriterion("nox_emission =", value, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionNotEqualTo(Double value) {
            addCriterion("nox_emission <>", value, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionGreaterThan(Double value) {
            addCriterion("nox_emission >", value, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("nox_emission >=", value, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionLessThan(Double value) {
            addCriterion("nox_emission <", value, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionLessThanOrEqualTo(Double value) {
            addCriterion("nox_emission <=", value, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionIn(List<Double> values) {
            addCriterion("nox_emission in", values, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionNotIn(List<Double> values) {
            addCriterion("nox_emission not in", values, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionBetween(Double value1, Double value2) {
            addCriterion("nox_emission between", value1, value2, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionNotBetween(Double value1, Double value2) {
            addCriterion("nox_emission not between", value1, value2, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andPm25MaxIsNull() {
            addCriterion("pm25_max is null");
            return (Criteria) this;
        }

        public Criteria andPm25MaxIsNotNull() {
            addCriterion("pm25_max is not null");
            return (Criteria) this;
        }

        public Criteria andPm25MaxEqualTo(Double value) {
            addCriterion("pm25_max =", value, "pm25Max");
            return (Criteria) this;
        }

        public Criteria andPm25MaxNotEqualTo(Double value) {
            addCriterion("pm25_max <>", value, "pm25Max");
            return (Criteria) this;
        }

        public Criteria andPm25MaxGreaterThan(Double value) {
            addCriterion("pm25_max >", value, "pm25Max");
            return (Criteria) this;
        }

        public Criteria andPm25MaxGreaterThanOrEqualTo(Double value) {
            addCriterion("pm25_max >=", value, "pm25Max");
            return (Criteria) this;
        }

        public Criteria andPm25MaxLessThan(Double value) {
            addCriterion("pm25_max <", value, "pm25Max");
            return (Criteria) this;
        }

        public Criteria andPm25MaxLessThanOrEqualTo(Double value) {
            addCriterion("pm25_max <=", value, "pm25Max");
            return (Criteria) this;
        }

        public Criteria andPm25MaxIn(List<Double> values) {
            addCriterion("pm25_max in", values, "pm25Max");
            return (Criteria) this;
        }

        public Criteria andPm25MaxNotIn(List<Double> values) {
            addCriterion("pm25_max not in", values, "pm25Max");
            return (Criteria) this;
        }

        public Criteria andPm25MaxBetween(Double value1, Double value2) {
            addCriterion("pm25_max between", value1, value2, "pm25Max");
            return (Criteria) this;
        }

        public Criteria andPm25MaxNotBetween(Double value1, Double value2) {
            addCriterion("pm25_max not between", value1, value2, "pm25Max");
            return (Criteria) this;
        }

        public Criteria andPm10MaxIsNull() {
            addCriterion("pm10_max is null");
            return (Criteria) this;
        }

        public Criteria andPm10MaxIsNotNull() {
            addCriterion("pm10_max is not null");
            return (Criteria) this;
        }

        public Criteria andPm10MaxEqualTo(Double value) {
            addCriterion("pm10_max =", value, "pm10Max");
            return (Criteria) this;
        }

        public Criteria andPm10MaxNotEqualTo(Double value) {
            addCriterion("pm10_max <>", value, "pm10Max");
            return (Criteria) this;
        }

        public Criteria andPm10MaxGreaterThan(Double value) {
            addCriterion("pm10_max >", value, "pm10Max");
            return (Criteria) this;
        }

        public Criteria andPm10MaxGreaterThanOrEqualTo(Double value) {
            addCriterion("pm10_max >=", value, "pm10Max");
            return (Criteria) this;
        }

        public Criteria andPm10MaxLessThan(Double value) {
            addCriterion("pm10_max <", value, "pm10Max");
            return (Criteria) this;
        }

        public Criteria andPm10MaxLessThanOrEqualTo(Double value) {
            addCriterion("pm10_max <=", value, "pm10Max");
            return (Criteria) this;
        }

        public Criteria andPm10MaxIn(List<Double> values) {
            addCriterion("pm10_max in", values, "pm10Max");
            return (Criteria) this;
        }

        public Criteria andPm10MaxNotIn(List<Double> values) {
            addCriterion("pm10_max not in", values, "pm10Max");
            return (Criteria) this;
        }

        public Criteria andPm10MaxBetween(Double value1, Double value2) {
            addCriterion("pm10_max between", value1, value2, "pm10Max");
            return (Criteria) this;
        }

        public Criteria andPm10MaxNotBetween(Double value1, Double value2) {
            addCriterion("pm10_max not between", value1, value2, "pm10Max");
            return (Criteria) this;
        }

        public Criteria andVocMaxIsNull() {
            addCriterion("voc_max is null");
            return (Criteria) this;
        }

        public Criteria andVocMaxIsNotNull() {
            addCriterion("voc_max is not null");
            return (Criteria) this;
        }

        public Criteria andVocMaxEqualTo(Double value) {
            addCriterion("voc_max =", value, "vocMax");
            return (Criteria) this;
        }

        public Criteria andVocMaxNotEqualTo(Double value) {
            addCriterion("voc_max <>", value, "vocMax");
            return (Criteria) this;
        }

        public Criteria andVocMaxGreaterThan(Double value) {
            addCriterion("voc_max >", value, "vocMax");
            return (Criteria) this;
        }

        public Criteria andVocMaxGreaterThanOrEqualTo(Double value) {
            addCriterion("voc_max >=", value, "vocMax");
            return (Criteria) this;
        }

        public Criteria andVocMaxLessThan(Double value) {
            addCriterion("voc_max <", value, "vocMax");
            return (Criteria) this;
        }

        public Criteria andVocMaxLessThanOrEqualTo(Double value) {
            addCriterion("voc_max <=", value, "vocMax");
            return (Criteria) this;
        }

        public Criteria andVocMaxIn(List<Double> values) {
            addCriterion("voc_max in", values, "vocMax");
            return (Criteria) this;
        }

        public Criteria andVocMaxNotIn(List<Double> values) {
            addCriterion("voc_max not in", values, "vocMax");
            return (Criteria) this;
        }

        public Criteria andVocMaxBetween(Double value1, Double value2) {
            addCriterion("voc_max between", value1, value2, "vocMax");
            return (Criteria) this;
        }

        public Criteria andVocMaxNotBetween(Double value1, Double value2) {
            addCriterion("voc_max not between", value1, value2, "vocMax");
            return (Criteria) this;
        }

        public Criteria andNh3MaxIsNull() {
            addCriterion("nh3_max is null");
            return (Criteria) this;
        }

        public Criteria andNh3MaxIsNotNull() {
            addCriterion("nh3_max is not null");
            return (Criteria) this;
        }

        public Criteria andNh3MaxEqualTo(Double value) {
            addCriterion("nh3_max =", value, "nh3Max");
            return (Criteria) this;
        }

        public Criteria andNh3MaxNotEqualTo(Double value) {
            addCriterion("nh3_max <>", value, "nh3Max");
            return (Criteria) this;
        }

        public Criteria andNh3MaxGreaterThan(Double value) {
            addCriterion("nh3_max >", value, "nh3Max");
            return (Criteria) this;
        }

        public Criteria andNh3MaxGreaterThanOrEqualTo(Double value) {
            addCriterion("nh3_max >=", value, "nh3Max");
            return (Criteria) this;
        }

        public Criteria andNh3MaxLessThan(Double value) {
            addCriterion("nh3_max <", value, "nh3Max");
            return (Criteria) this;
        }

        public Criteria andNh3MaxLessThanOrEqualTo(Double value) {
            addCriterion("nh3_max <=", value, "nh3Max");
            return (Criteria) this;
        }

        public Criteria andNh3MaxIn(List<Double> values) {
            addCriterion("nh3_max in", values, "nh3Max");
            return (Criteria) this;
        }

        public Criteria andNh3MaxNotIn(List<Double> values) {
            addCriterion("nh3_max not in", values, "nh3Max");
            return (Criteria) this;
        }

        public Criteria andNh3MaxBetween(Double value1, Double value2) {
            addCriterion("nh3_max between", value1, value2, "nh3Max");
            return (Criteria) this;
        }

        public Criteria andNh3MaxNotBetween(Double value1, Double value2) {
            addCriterion("nh3_max not between", value1, value2, "nh3Max");
            return (Criteria) this;
        }

        public Criteria andSo2MaxIsNull() {
            addCriterion("so2_max is null");
            return (Criteria) this;
        }

        public Criteria andSo2MaxIsNotNull() {
            addCriterion("so2_max is not null");
            return (Criteria) this;
        }

        public Criteria andSo2MaxEqualTo(Double value) {
            addCriterion("so2_max =", value, "so2Max");
            return (Criteria) this;
        }

        public Criteria andSo2MaxNotEqualTo(Double value) {
            addCriterion("so2_max <>", value, "so2Max");
            return (Criteria) this;
        }

        public Criteria andSo2MaxGreaterThan(Double value) {
            addCriterion("so2_max >", value, "so2Max");
            return (Criteria) this;
        }

        public Criteria andSo2MaxGreaterThanOrEqualTo(Double value) {
            addCriterion("so2_max >=", value, "so2Max");
            return (Criteria) this;
        }

        public Criteria andSo2MaxLessThan(Double value) {
            addCriterion("so2_max <", value, "so2Max");
            return (Criteria) this;
        }

        public Criteria andSo2MaxLessThanOrEqualTo(Double value) {
            addCriterion("so2_max <=", value, "so2Max");
            return (Criteria) this;
        }

        public Criteria andSo2MaxIn(List<Double> values) {
            addCriterion("so2_max in", values, "so2Max");
            return (Criteria) this;
        }

        public Criteria andSo2MaxNotIn(List<Double> values) {
            addCriterion("so2_max not in", values, "so2Max");
            return (Criteria) this;
        }

        public Criteria andSo2MaxBetween(Double value1, Double value2) {
            addCriterion("so2_max between", value1, value2, "so2Max");
            return (Criteria) this;
        }

        public Criteria andSo2MaxNotBetween(Double value1, Double value2) {
            addCriterion("so2_max not between", value1, value2, "so2Max");
            return (Criteria) this;
        }

        public Criteria andCoMaxIsNull() {
            addCriterion("co_max is null");
            return (Criteria) this;
        }

        public Criteria andCoMaxIsNotNull() {
            addCriterion("co_max is not null");
            return (Criteria) this;
        }

        public Criteria andCoMaxEqualTo(Double value) {
            addCriterion("co_max =", value, "coMax");
            return (Criteria) this;
        }

        public Criteria andCoMaxNotEqualTo(Double value) {
            addCriterion("co_max <>", value, "coMax");
            return (Criteria) this;
        }

        public Criteria andCoMaxGreaterThan(Double value) {
            addCriterion("co_max >", value, "coMax");
            return (Criteria) this;
        }

        public Criteria andCoMaxGreaterThanOrEqualTo(Double value) {
            addCriterion("co_max >=", value, "coMax");
            return (Criteria) this;
        }

        public Criteria andCoMaxLessThan(Double value) {
            addCriterion("co_max <", value, "coMax");
            return (Criteria) this;
        }

        public Criteria andCoMaxLessThanOrEqualTo(Double value) {
            addCriterion("co_max <=", value, "coMax");
            return (Criteria) this;
        }

        public Criteria andCoMaxIn(List<Double> values) {
            addCriterion("co_max in", values, "coMax");
            return (Criteria) this;
        }

        public Criteria andCoMaxNotIn(List<Double> values) {
            addCriterion("co_max not in", values, "coMax");
            return (Criteria) this;
        }

        public Criteria andCoMaxBetween(Double value1, Double value2) {
            addCriterion("co_max between", value1, value2, "coMax");
            return (Criteria) this;
        }

        public Criteria andCoMaxNotBetween(Double value1, Double value2) {
            addCriterion("co_max not between", value1, value2, "coMax");
            return (Criteria) this;
        }

        public Criteria andOcMaxIsNull() {
            addCriterion("oc_max is null");
            return (Criteria) this;
        }

        public Criteria andOcMaxIsNotNull() {
            addCriterion("oc_max is not null");
            return (Criteria) this;
        }

        public Criteria andOcMaxEqualTo(Double value) {
            addCriterion("oc_max =", value, "ocMax");
            return (Criteria) this;
        }

        public Criteria andOcMaxNotEqualTo(Double value) {
            addCriterion("oc_max <>", value, "ocMax");
            return (Criteria) this;
        }

        public Criteria andOcMaxGreaterThan(Double value) {
            addCriterion("oc_max >", value, "ocMax");
            return (Criteria) this;
        }

        public Criteria andOcMaxGreaterThanOrEqualTo(Double value) {
            addCriterion("oc_max >=", value, "ocMax");
            return (Criteria) this;
        }

        public Criteria andOcMaxLessThan(Double value) {
            addCriterion("oc_max <", value, "ocMax");
            return (Criteria) this;
        }

        public Criteria andOcMaxLessThanOrEqualTo(Double value) {
            addCriterion("oc_max <=", value, "ocMax");
            return (Criteria) this;
        }

        public Criteria andOcMaxIn(List<Double> values) {
            addCriterion("oc_max in", values, "ocMax");
            return (Criteria) this;
        }

        public Criteria andOcMaxNotIn(List<Double> values) {
            addCriterion("oc_max not in", values, "ocMax");
            return (Criteria) this;
        }

        public Criteria andOcMaxBetween(Double value1, Double value2) {
            addCriterion("oc_max between", value1, value2, "ocMax");
            return (Criteria) this;
        }

        public Criteria andOcMaxNotBetween(Double value1, Double value2) {
            addCriterion("oc_max not between", value1, value2, "ocMax");
            return (Criteria) this;
        }

        public Criteria andBcMaxIsNull() {
            addCriterion("bc_max is null");
            return (Criteria) this;
        }

        public Criteria andBcMaxIsNotNull() {
            addCriterion("bc_max is not null");
            return (Criteria) this;
        }

        public Criteria andBcMaxEqualTo(Double value) {
            addCriterion("bc_max =", value, "bcMax");
            return (Criteria) this;
        }

        public Criteria andBcMaxNotEqualTo(Double value) {
            addCriterion("bc_max <>", value, "bcMax");
            return (Criteria) this;
        }

        public Criteria andBcMaxGreaterThan(Double value) {
            addCriterion("bc_max >", value, "bcMax");
            return (Criteria) this;
        }

        public Criteria andBcMaxGreaterThanOrEqualTo(Double value) {
            addCriterion("bc_max >=", value, "bcMax");
            return (Criteria) this;
        }

        public Criteria andBcMaxLessThan(Double value) {
            addCriterion("bc_max <", value, "bcMax");
            return (Criteria) this;
        }

        public Criteria andBcMaxLessThanOrEqualTo(Double value) {
            addCriterion("bc_max <=", value, "bcMax");
            return (Criteria) this;
        }

        public Criteria andBcMaxIn(List<Double> values) {
            addCriterion("bc_max in", values, "bcMax");
            return (Criteria) this;
        }

        public Criteria andBcMaxNotIn(List<Double> values) {
            addCriterion("bc_max not in", values, "bcMax");
            return (Criteria) this;
        }

        public Criteria andBcMaxBetween(Double value1, Double value2) {
            addCriterion("bc_max between", value1, value2, "bcMax");
            return (Criteria) this;
        }

        public Criteria andBcMaxNotBetween(Double value1, Double value2) {
            addCriterion("bc_max not between", value1, value2, "bcMax");
            return (Criteria) this;
        }

        public Criteria andNoxMaxIsNull() {
            addCriterion("nox_max is null");
            return (Criteria) this;
        }

        public Criteria andNoxMaxIsNotNull() {
            addCriterion("nox_max is not null");
            return (Criteria) this;
        }

        public Criteria andNoxMaxEqualTo(Double value) {
            addCriterion("nox_max =", value, "noxMax");
            return (Criteria) this;
        }

        public Criteria andNoxMaxNotEqualTo(Double value) {
            addCriterion("nox_max <>", value, "noxMax");
            return (Criteria) this;
        }

        public Criteria andNoxMaxGreaterThan(Double value) {
            addCriterion("nox_max >", value, "noxMax");
            return (Criteria) this;
        }

        public Criteria andNoxMaxGreaterThanOrEqualTo(Double value) {
            addCriterion("nox_max >=", value, "noxMax");
            return (Criteria) this;
        }

        public Criteria andNoxMaxLessThan(Double value) {
            addCriterion("nox_max <", value, "noxMax");
            return (Criteria) this;
        }

        public Criteria andNoxMaxLessThanOrEqualTo(Double value) {
            addCriterion("nox_max <=", value, "noxMax");
            return (Criteria) this;
        }

        public Criteria andNoxMaxIn(List<Double> values) {
            addCriterion("nox_max in", values, "noxMax");
            return (Criteria) this;
        }

        public Criteria andNoxMaxNotIn(List<Double> values) {
            addCriterion("nox_max not in", values, "noxMax");
            return (Criteria) this;
        }

        public Criteria andNoxMaxBetween(Double value1, Double value2) {
            addCriterion("nox_max between", value1, value2, "noxMax");
            return (Criteria) this;
        }

        public Criteria andNoxMaxNotBetween(Double value1, Double value2) {
            addCriterion("nox_max not between", value1, value2, "noxMax");
            return (Criteria) this;
        }

        public Criteria andPm25UnitIsNull() {
            addCriterion("pm25_unit is null");
            return (Criteria) this;
        }

        public Criteria andPm25UnitIsNotNull() {
            addCriterion("pm25_unit is not null");
            return (Criteria) this;
        }

        public Criteria andPm25UnitEqualTo(String value) {
            addCriterion("pm25_unit =", value, "pm25Unit");
            return (Criteria) this;
        }

        public Criteria andPm25UnitNotEqualTo(String value) {
            addCriterion("pm25_unit <>", value, "pm25Unit");
            return (Criteria) this;
        }

        public Criteria andPm25UnitGreaterThan(String value) {
            addCriterion("pm25_unit >", value, "pm25Unit");
            return (Criteria) this;
        }

        public Criteria andPm25UnitGreaterThanOrEqualTo(String value) {
            addCriterion("pm25_unit >=", value, "pm25Unit");
            return (Criteria) this;
        }

        public Criteria andPm25UnitLessThan(String value) {
            addCriterion("pm25_unit <", value, "pm25Unit");
            return (Criteria) this;
        }

        public Criteria andPm25UnitLessThanOrEqualTo(String value) {
            addCriterion("pm25_unit <=", value, "pm25Unit");
            return (Criteria) this;
        }

        public Criteria andPm25UnitLike(String value) {
            addCriterion("pm25_unit like", value, "pm25Unit");
            return (Criteria) this;
        }

        public Criteria andPm25UnitNotLike(String value) {
            addCriterion("pm25_unit not like", value, "pm25Unit");
            return (Criteria) this;
        }

        public Criteria andPm25UnitIn(List<String> values) {
            addCriterion("pm25_unit in", values, "pm25Unit");
            return (Criteria) this;
        }

        public Criteria andPm25UnitNotIn(List<String> values) {
            addCriterion("pm25_unit not in", values, "pm25Unit");
            return (Criteria) this;
        }

        public Criteria andPm25UnitBetween(String value1, String value2) {
            addCriterion("pm25_unit between", value1, value2, "pm25Unit");
            return (Criteria) this;
        }

        public Criteria andPm25UnitNotBetween(String value1, String value2) {
            addCriterion("pm25_unit not between", value1, value2, "pm25Unit");
            return (Criteria) this;
        }

        public Criteria andPm10UnitIsNull() {
            addCriterion("pm10_unit is null");
            return (Criteria) this;
        }

        public Criteria andPm10UnitIsNotNull() {
            addCriterion("pm10_unit is not null");
            return (Criteria) this;
        }

        public Criteria andPm10UnitEqualTo(String value) {
            addCriterion("pm10_unit =", value, "pm10Unit");
            return (Criteria) this;
        }

        public Criteria andPm10UnitNotEqualTo(String value) {
            addCriterion("pm10_unit <>", value, "pm10Unit");
            return (Criteria) this;
        }

        public Criteria andPm10UnitGreaterThan(String value) {
            addCriterion("pm10_unit >", value, "pm10Unit");
            return (Criteria) this;
        }

        public Criteria andPm10UnitGreaterThanOrEqualTo(String value) {
            addCriterion("pm10_unit >=", value, "pm10Unit");
            return (Criteria) this;
        }

        public Criteria andPm10UnitLessThan(String value) {
            addCriterion("pm10_unit <", value, "pm10Unit");
            return (Criteria) this;
        }

        public Criteria andPm10UnitLessThanOrEqualTo(String value) {
            addCriterion("pm10_unit <=", value, "pm10Unit");
            return (Criteria) this;
        }

        public Criteria andPm10UnitLike(String value) {
            addCriterion("pm10_unit like", value, "pm10Unit");
            return (Criteria) this;
        }

        public Criteria andPm10UnitNotLike(String value) {
            addCriterion("pm10_unit not like", value, "pm10Unit");
            return (Criteria) this;
        }

        public Criteria andPm10UnitIn(List<String> values) {
            addCriterion("pm10_unit in", values, "pm10Unit");
            return (Criteria) this;
        }

        public Criteria andPm10UnitNotIn(List<String> values) {
            addCriterion("pm10_unit not in", values, "pm10Unit");
            return (Criteria) this;
        }

        public Criteria andPm10UnitBetween(String value1, String value2) {
            addCriterion("pm10_unit between", value1, value2, "pm10Unit");
            return (Criteria) this;
        }

        public Criteria andPm10UnitNotBetween(String value1, String value2) {
            addCriterion("pm10_unit not between", value1, value2, "pm10Unit");
            return (Criteria) this;
        }

        public Criteria andVocUnitIsNull() {
            addCriterion("voc_unit is null");
            return (Criteria) this;
        }

        public Criteria andVocUnitIsNotNull() {
            addCriterion("voc_unit is not null");
            return (Criteria) this;
        }

        public Criteria andVocUnitEqualTo(String value) {
            addCriterion("voc_unit =", value, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitNotEqualTo(String value) {
            addCriterion("voc_unit <>", value, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitGreaterThan(String value) {
            addCriterion("voc_unit >", value, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitGreaterThanOrEqualTo(String value) {
            addCriterion("voc_unit >=", value, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitLessThan(String value) {
            addCriterion("voc_unit <", value, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitLessThanOrEqualTo(String value) {
            addCriterion("voc_unit <=", value, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitLike(String value) {
            addCriterion("voc_unit like", value, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitNotLike(String value) {
            addCriterion("voc_unit not like", value, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitIn(List<String> values) {
            addCriterion("voc_unit in", values, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitNotIn(List<String> values) {
            addCriterion("voc_unit not in", values, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitBetween(String value1, String value2) {
            addCriterion("voc_unit between", value1, value2, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitNotBetween(String value1, String value2) {
            addCriterion("voc_unit not between", value1, value2, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitIsNull() {
            addCriterion("nh3_unit is null");
            return (Criteria) this;
        }

        public Criteria andNh3UnitIsNotNull() {
            addCriterion("nh3_unit is not null");
            return (Criteria) this;
        }

        public Criteria andNh3UnitEqualTo(String value) {
            addCriterion("nh3_unit =", value, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitNotEqualTo(String value) {
            addCriterion("nh3_unit <>", value, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitGreaterThan(String value) {
            addCriterion("nh3_unit >", value, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitGreaterThanOrEqualTo(String value) {
            addCriterion("nh3_unit >=", value, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitLessThan(String value) {
            addCriterion("nh3_unit <", value, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitLessThanOrEqualTo(String value) {
            addCriterion("nh3_unit <=", value, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitLike(String value) {
            addCriterion("nh3_unit like", value, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitNotLike(String value) {
            addCriterion("nh3_unit not like", value, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitIn(List<String> values) {
            addCriterion("nh3_unit in", values, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitNotIn(List<String> values) {
            addCriterion("nh3_unit not in", values, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitBetween(String value1, String value2) {
            addCriterion("nh3_unit between", value1, value2, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitNotBetween(String value1, String value2) {
            addCriterion("nh3_unit not between", value1, value2, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andSo2UnitIsNull() {
            addCriterion("so2_unit is null");
            return (Criteria) this;
        }

        public Criteria andSo2UnitIsNotNull() {
            addCriterion("so2_unit is not null");
            return (Criteria) this;
        }

        public Criteria andSo2UnitEqualTo(String value) {
            addCriterion("so2_unit =", value, "so2Unit");
            return (Criteria) this;
        }

        public Criteria andSo2UnitNotEqualTo(String value) {
            addCriterion("so2_unit <>", value, "so2Unit");
            return (Criteria) this;
        }

        public Criteria andSo2UnitGreaterThan(String value) {
            addCriterion("so2_unit >", value, "so2Unit");
            return (Criteria) this;
        }

        public Criteria andSo2UnitGreaterThanOrEqualTo(String value) {
            addCriterion("so2_unit >=", value, "so2Unit");
            return (Criteria) this;
        }

        public Criteria andSo2UnitLessThan(String value) {
            addCriterion("so2_unit <", value, "so2Unit");
            return (Criteria) this;
        }

        public Criteria andSo2UnitLessThanOrEqualTo(String value) {
            addCriterion("so2_unit <=", value, "so2Unit");
            return (Criteria) this;
        }

        public Criteria andSo2UnitLike(String value) {
            addCriterion("so2_unit like", value, "so2Unit");
            return (Criteria) this;
        }

        public Criteria andSo2UnitNotLike(String value) {
            addCriterion("so2_unit not like", value, "so2Unit");
            return (Criteria) this;
        }

        public Criteria andSo2UnitIn(List<String> values) {
            addCriterion("so2_unit in", values, "so2Unit");
            return (Criteria) this;
        }

        public Criteria andSo2UnitNotIn(List<String> values) {
            addCriterion("so2_unit not in", values, "so2Unit");
            return (Criteria) this;
        }

        public Criteria andSo2UnitBetween(String value1, String value2) {
            addCriterion("so2_unit between", value1, value2, "so2Unit");
            return (Criteria) this;
        }

        public Criteria andSo2UnitNotBetween(String value1, String value2) {
            addCriterion("so2_unit not between", value1, value2, "so2Unit");
            return (Criteria) this;
        }

        public Criteria andCoUnitIsNull() {
            addCriterion("co_unit is null");
            return (Criteria) this;
        }

        public Criteria andCoUnitIsNotNull() {
            addCriterion("co_unit is not null");
            return (Criteria) this;
        }

        public Criteria andCoUnitEqualTo(String value) {
            addCriterion("co_unit =", value, "coUnit");
            return (Criteria) this;
        }

        public Criteria andCoUnitNotEqualTo(String value) {
            addCriterion("co_unit <>", value, "coUnit");
            return (Criteria) this;
        }

        public Criteria andCoUnitGreaterThan(String value) {
            addCriterion("co_unit >", value, "coUnit");
            return (Criteria) this;
        }

        public Criteria andCoUnitGreaterThanOrEqualTo(String value) {
            addCriterion("co_unit >=", value, "coUnit");
            return (Criteria) this;
        }

        public Criteria andCoUnitLessThan(String value) {
            addCriterion("co_unit <", value, "coUnit");
            return (Criteria) this;
        }

        public Criteria andCoUnitLessThanOrEqualTo(String value) {
            addCriterion("co_unit <=", value, "coUnit");
            return (Criteria) this;
        }

        public Criteria andCoUnitLike(String value) {
            addCriterion("co_unit like", value, "coUnit");
            return (Criteria) this;
        }

        public Criteria andCoUnitNotLike(String value) {
            addCriterion("co_unit not like", value, "coUnit");
            return (Criteria) this;
        }

        public Criteria andCoUnitIn(List<String> values) {
            addCriterion("co_unit in", values, "coUnit");
            return (Criteria) this;
        }

        public Criteria andCoUnitNotIn(List<String> values) {
            addCriterion("co_unit not in", values, "coUnit");
            return (Criteria) this;
        }

        public Criteria andCoUnitBetween(String value1, String value2) {
            addCriterion("co_unit between", value1, value2, "coUnit");
            return (Criteria) this;
        }

        public Criteria andCoUnitNotBetween(String value1, String value2) {
            addCriterion("co_unit not between", value1, value2, "coUnit");
            return (Criteria) this;
        }

        public Criteria andOcUnitIsNull() {
            addCriterion("oc_unit is null");
            return (Criteria) this;
        }

        public Criteria andOcUnitIsNotNull() {
            addCriterion("oc_unit is not null");
            return (Criteria) this;
        }

        public Criteria andOcUnitEqualTo(String value) {
            addCriterion("oc_unit =", value, "ocUnit");
            return (Criteria) this;
        }

        public Criteria andOcUnitNotEqualTo(String value) {
            addCriterion("oc_unit <>", value, "ocUnit");
            return (Criteria) this;
        }

        public Criteria andOcUnitGreaterThan(String value) {
            addCriterion("oc_unit >", value, "ocUnit");
            return (Criteria) this;
        }

        public Criteria andOcUnitGreaterThanOrEqualTo(String value) {
            addCriterion("oc_unit >=", value, "ocUnit");
            return (Criteria) this;
        }

        public Criteria andOcUnitLessThan(String value) {
            addCriterion("oc_unit <", value, "ocUnit");
            return (Criteria) this;
        }

        public Criteria andOcUnitLessThanOrEqualTo(String value) {
            addCriterion("oc_unit <=", value, "ocUnit");
            return (Criteria) this;
        }

        public Criteria andOcUnitLike(String value) {
            addCriterion("oc_unit like", value, "ocUnit");
            return (Criteria) this;
        }

        public Criteria andOcUnitNotLike(String value) {
            addCriterion("oc_unit not like", value, "ocUnit");
            return (Criteria) this;
        }

        public Criteria andOcUnitIn(List<String> values) {
            addCriterion("oc_unit in", values, "ocUnit");
            return (Criteria) this;
        }

        public Criteria andOcUnitNotIn(List<String> values) {
            addCriterion("oc_unit not in", values, "ocUnit");
            return (Criteria) this;
        }

        public Criteria andOcUnitBetween(String value1, String value2) {
            addCriterion("oc_unit between", value1, value2, "ocUnit");
            return (Criteria) this;
        }

        public Criteria andOcUnitNotBetween(String value1, String value2) {
            addCriterion("oc_unit not between", value1, value2, "ocUnit");
            return (Criteria) this;
        }

        public Criteria andBcUnitIsNull() {
            addCriterion("bc_unit is null");
            return (Criteria) this;
        }

        public Criteria andBcUnitIsNotNull() {
            addCriterion("bc_unit is not null");
            return (Criteria) this;
        }

        public Criteria andBcUnitEqualTo(String value) {
            addCriterion("bc_unit =", value, "bcUnit");
            return (Criteria) this;
        }

        public Criteria andBcUnitNotEqualTo(String value) {
            addCriterion("bc_unit <>", value, "bcUnit");
            return (Criteria) this;
        }

        public Criteria andBcUnitGreaterThan(String value) {
            addCriterion("bc_unit >", value, "bcUnit");
            return (Criteria) this;
        }

        public Criteria andBcUnitGreaterThanOrEqualTo(String value) {
            addCriterion("bc_unit >=", value, "bcUnit");
            return (Criteria) this;
        }

        public Criteria andBcUnitLessThan(String value) {
            addCriterion("bc_unit <", value, "bcUnit");
            return (Criteria) this;
        }

        public Criteria andBcUnitLessThanOrEqualTo(String value) {
            addCriterion("bc_unit <=", value, "bcUnit");
            return (Criteria) this;
        }

        public Criteria andBcUnitLike(String value) {
            addCriterion("bc_unit like", value, "bcUnit");
            return (Criteria) this;
        }

        public Criteria andBcUnitNotLike(String value) {
            addCriterion("bc_unit not like", value, "bcUnit");
            return (Criteria) this;
        }

        public Criteria andBcUnitIn(List<String> values) {
            addCriterion("bc_unit in", values, "bcUnit");
            return (Criteria) this;
        }

        public Criteria andBcUnitNotIn(List<String> values) {
            addCriterion("bc_unit not in", values, "bcUnit");
            return (Criteria) this;
        }

        public Criteria andBcUnitBetween(String value1, String value2) {
            addCriterion("bc_unit between", value1, value2, "bcUnit");
            return (Criteria) this;
        }

        public Criteria andBcUnitNotBetween(String value1, String value2) {
            addCriterion("bc_unit not between", value1, value2, "bcUnit");
            return (Criteria) this;
        }

        public Criteria andNoxUnitIsNull() {
            addCriterion("nox_unit is null");
            return (Criteria) this;
        }

        public Criteria andNoxUnitIsNotNull() {
            addCriterion("nox_unit is not null");
            return (Criteria) this;
        }

        public Criteria andNoxUnitEqualTo(String value) {
            addCriterion("nox_unit =", value, "noxUnit");
            return (Criteria) this;
        }

        public Criteria andNoxUnitNotEqualTo(String value) {
            addCriterion("nox_unit <>", value, "noxUnit");
            return (Criteria) this;
        }

        public Criteria andNoxUnitGreaterThan(String value) {
            addCriterion("nox_unit >", value, "noxUnit");
            return (Criteria) this;
        }

        public Criteria andNoxUnitGreaterThanOrEqualTo(String value) {
            addCriterion("nox_unit >=", value, "noxUnit");
            return (Criteria) this;
        }

        public Criteria andNoxUnitLessThan(String value) {
            addCriterion("nox_unit <", value, "noxUnit");
            return (Criteria) this;
        }

        public Criteria andNoxUnitLessThanOrEqualTo(String value) {
            addCriterion("nox_unit <=", value, "noxUnit");
            return (Criteria) this;
        }

        public Criteria andNoxUnitLike(String value) {
            addCriterion("nox_unit like", value, "noxUnit");
            return (Criteria) this;
        }

        public Criteria andNoxUnitNotLike(String value) {
            addCriterion("nox_unit not like", value, "noxUnit");
            return (Criteria) this;
        }

        public Criteria andNoxUnitIn(List<String> values) {
            addCriterion("nox_unit in", values, "noxUnit");
            return (Criteria) this;
        }

        public Criteria andNoxUnitNotIn(List<String> values) {
            addCriterion("nox_unit not in", values, "noxUnit");
            return (Criteria) this;
        }

        public Criteria andNoxUnitBetween(String value1, String value2) {
            addCriterion("nox_unit between", value1, value2, "noxUnit");
            return (Criteria) this;
        }

        public Criteria andNoxUnitNotBetween(String value1, String value2) {
            addCriterion("nox_unit not between", value1, value2, "noxUnit");
            return (Criteria) this;
        }

        public Criteria andSccDescribeIsNull() {
            addCriterion("scc_describe is null");
            return (Criteria) this;
        }

        public Criteria andSccDescribeIsNotNull() {
            addCriterion("scc_describe is not null");
            return (Criteria) this;
        }

        public Criteria andSccDescribeEqualTo(String value) {
            addCriterion("scc_describe =", value, "sccDescribe");
            return (Criteria) this;
        }

        public Criteria andSccDescribeNotEqualTo(String value) {
            addCriterion("scc_describe <>", value, "sccDescribe");
            return (Criteria) this;
        }

        public Criteria andSccDescribeGreaterThan(String value) {
            addCriterion("scc_describe >", value, "sccDescribe");
            return (Criteria) this;
        }

        public Criteria andSccDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("scc_describe >=", value, "sccDescribe");
            return (Criteria) this;
        }

        public Criteria andSccDescribeLessThan(String value) {
            addCriterion("scc_describe <", value, "sccDescribe");
            return (Criteria) this;
        }

        public Criteria andSccDescribeLessThanOrEqualTo(String value) {
            addCriterion("scc_describe <=", value, "sccDescribe");
            return (Criteria) this;
        }

        public Criteria andSccDescribeLike(String value) {
            addCriterion("scc_describe like", value, "sccDescribe");
            return (Criteria) this;
        }

        public Criteria andSccDescribeNotLike(String value) {
            addCriterion("scc_describe not like", value, "sccDescribe");
            return (Criteria) this;
        }

        public Criteria andSccDescribeIn(List<String> values) {
            addCriterion("scc_describe in", values, "sccDescribe");
            return (Criteria) this;
        }

        public Criteria andSccDescribeNotIn(List<String> values) {
            addCriterion("scc_describe not in", values, "sccDescribe");
            return (Criteria) this;
        }

        public Criteria andSccDescribeBetween(String value1, String value2) {
            addCriterion("scc_describe between", value1, value2, "sccDescribe");
            return (Criteria) this;
        }

        public Criteria andSccDescribeNotBetween(String value1, String value2) {
            addCriterion("scc_describe not between", value1, value2, "sccDescribe");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("flag not between", value1, value2, "flag");
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