package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class GdViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GdViewExample() {
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

        public Criteria andBoilerIdIsNull() {
            addCriterion("boiler_id is null");
            return (Criteria) this;
        }

        public Criteria andBoilerIdIsNotNull() {
            addCriterion("boiler_id is not null");
            return (Criteria) this;
        }

        public Criteria andBoilerIdEqualTo(Integer value) {
            addCriterion("boiler_id =", value, "boilerId");
            return (Criteria) this;
        }

        public Criteria andBoilerIdNotEqualTo(Integer value) {
            addCriterion("boiler_id <>", value, "boilerId");
            return (Criteria) this;
        }

        public Criteria andBoilerIdGreaterThan(Integer value) {
            addCriterion("boiler_id >", value, "boilerId");
            return (Criteria) this;
        }

        public Criteria andBoilerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("boiler_id >=", value, "boilerId");
            return (Criteria) this;
        }

        public Criteria andBoilerIdLessThan(Integer value) {
            addCriterion("boiler_id <", value, "boilerId");
            return (Criteria) this;
        }

        public Criteria andBoilerIdLessThanOrEqualTo(Integer value) {
            addCriterion("boiler_id <=", value, "boilerId");
            return (Criteria) this;
        }

        public Criteria andBoilerIdIn(List<Integer> values) {
            addCriterion("boiler_id in", values, "boilerId");
            return (Criteria) this;
        }

        public Criteria andBoilerIdNotIn(List<Integer> values) {
            addCriterion("boiler_id not in", values, "boilerId");
            return (Criteria) this;
        }

        public Criteria andBoilerIdBetween(Integer value1, Integer value2) {
            addCriterion("boiler_id between", value1, value2, "boilerId");
            return (Criteria) this;
        }

        public Criteria andBoilerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("boiler_id not between", value1, value2, "boilerId");
            return (Criteria) this;
        }

        public Criteria andBoilerModelIsNull() {
            addCriterion("boiler_model is null");
            return (Criteria) this;
        }

        public Criteria andBoilerModelIsNotNull() {
            addCriterion("boiler_model is not null");
            return (Criteria) this;
        }

        public Criteria andBoilerModelEqualTo(String value) {
            addCriterion("boiler_model =", value, "boilerModel");
            return (Criteria) this;
        }

        public Criteria andBoilerModelNotEqualTo(String value) {
            addCriterion("boiler_model <>", value, "boilerModel");
            return (Criteria) this;
        }

        public Criteria andBoilerModelGreaterThan(String value) {
            addCriterion("boiler_model >", value, "boilerModel");
            return (Criteria) this;
        }

        public Criteria andBoilerModelGreaterThanOrEqualTo(String value) {
            addCriterion("boiler_model >=", value, "boilerModel");
            return (Criteria) this;
        }

        public Criteria andBoilerModelLessThan(String value) {
            addCriterion("boiler_model <", value, "boilerModel");
            return (Criteria) this;
        }

        public Criteria andBoilerModelLessThanOrEqualTo(String value) {
            addCriterion("boiler_model <=", value, "boilerModel");
            return (Criteria) this;
        }

        public Criteria andBoilerModelLike(String value) {
            addCriterion("boiler_model like", value, "boilerModel");
            return (Criteria) this;
        }

        public Criteria andBoilerModelNotLike(String value) {
            addCriterion("boiler_model not like", value, "boilerModel");
            return (Criteria) this;
        }

        public Criteria andBoilerModelIn(List<String> values) {
            addCriterion("boiler_model in", values, "boilerModel");
            return (Criteria) this;
        }

        public Criteria andBoilerModelNotIn(List<String> values) {
            addCriterion("boiler_model not in", values, "boilerModel");
            return (Criteria) this;
        }

        public Criteria andBoilerModelBetween(String value1, String value2) {
            addCriterion("boiler_model between", value1, value2, "boilerModel");
            return (Criteria) this;
        }

        public Criteria andBoilerModelNotBetween(String value1, String value2) {
            addCriterion("boiler_model not between", value1, value2, "boilerModel");
            return (Criteria) this;
        }

        public Criteria andBoilerTonsIsNull() {
            addCriterion("boiler_tons is null");
            return (Criteria) this;
        }

        public Criteria andBoilerTonsIsNotNull() {
            addCriterion("boiler_tons is not null");
            return (Criteria) this;
        }

        public Criteria andBoilerTonsEqualTo(Double value) {
            addCriterion("boiler_tons =", value, "boilerTons");
            return (Criteria) this;
        }

        public Criteria andBoilerTonsNotEqualTo(Double value) {
            addCriterion("boiler_tons <>", value, "boilerTons");
            return (Criteria) this;
        }

        public Criteria andBoilerTonsGreaterThan(Double value) {
            addCriterion("boiler_tons >", value, "boilerTons");
            return (Criteria) this;
        }

        public Criteria andBoilerTonsGreaterThanOrEqualTo(Double value) {
            addCriterion("boiler_tons >=", value, "boilerTons");
            return (Criteria) this;
        }

        public Criteria andBoilerTonsLessThan(Double value) {
            addCriterion("boiler_tons <", value, "boilerTons");
            return (Criteria) this;
        }

        public Criteria andBoilerTonsLessThanOrEqualTo(Double value) {
            addCriterion("boiler_tons <=", value, "boilerTons");
            return (Criteria) this;
        }

        public Criteria andBoilerTonsIn(List<Double> values) {
            addCriterion("boiler_tons in", values, "boilerTons");
            return (Criteria) this;
        }

        public Criteria andBoilerTonsNotIn(List<Double> values) {
            addCriterion("boiler_tons not in", values, "boilerTons");
            return (Criteria) this;
        }

        public Criteria andBoilerTonsBetween(Double value1, Double value2) {
            addCriterion("boiler_tons between", value1, value2, "boilerTons");
            return (Criteria) this;
        }

        public Criteria andBoilerTonsNotBetween(Double value1, Double value2) {
            addCriterion("boiler_tons not between", value1, value2, "boilerTons");
            return (Criteria) this;
        }

        public Criteria andFuelIsNull() {
            addCriterion("fuel is null");
            return (Criteria) this;
        }

        public Criteria andFuelIsNotNull() {
            addCriterion("fuel is not null");
            return (Criteria) this;
        }

        public Criteria andFuelEqualTo(String value) {
            addCriterion("fuel =", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelNotEqualTo(String value) {
            addCriterion("fuel <>", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelGreaterThan(String value) {
            addCriterion("fuel >", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelGreaterThanOrEqualTo(String value) {
            addCriterion("fuel >=", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelLessThan(String value) {
            addCriterion("fuel <", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelLessThanOrEqualTo(String value) {
            addCriterion("fuel <=", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelLike(String value) {
            addCriterion("fuel like", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelNotLike(String value) {
            addCriterion("fuel not like", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelIn(List<String> values) {
            addCriterion("fuel in", values, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelNotIn(List<String> values) {
            addCriterion("fuel not in", values, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelBetween(String value1, String value2) {
            addCriterion("fuel between", value1, value2, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelNotBetween(String value1, String value2) {
            addCriterion("fuel not between", value1, value2, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelUseIsNull() {
            addCriterion("fuel_use is null");
            return (Criteria) this;
        }

        public Criteria andFuelUseIsNotNull() {
            addCriterion("fuel_use is not null");
            return (Criteria) this;
        }

        public Criteria andFuelUseEqualTo(Double value) {
            addCriterion("fuel_use =", value, "fuelUse");
            return (Criteria) this;
        }

        public Criteria andFuelUseNotEqualTo(Double value) {
            addCriterion("fuel_use <>", value, "fuelUse");
            return (Criteria) this;
        }

        public Criteria andFuelUseGreaterThan(Double value) {
            addCriterion("fuel_use >", value, "fuelUse");
            return (Criteria) this;
        }

        public Criteria andFuelUseGreaterThanOrEqualTo(Double value) {
            addCriterion("fuel_use >=", value, "fuelUse");
            return (Criteria) this;
        }

        public Criteria andFuelUseLessThan(Double value) {
            addCriterion("fuel_use <", value, "fuelUse");
            return (Criteria) this;
        }

        public Criteria andFuelUseLessThanOrEqualTo(Double value) {
            addCriterion("fuel_use <=", value, "fuelUse");
            return (Criteria) this;
        }

        public Criteria andFuelUseIn(List<Double> values) {
            addCriterion("fuel_use in", values, "fuelUse");
            return (Criteria) this;
        }

        public Criteria andFuelUseNotIn(List<Double> values) {
            addCriterion("fuel_use not in", values, "fuelUse");
            return (Criteria) this;
        }

        public Criteria andFuelUseBetween(Double value1, Double value2) {
            addCriterion("fuel_use between", value1, value2, "fuelUse");
            return (Criteria) this;
        }

        public Criteria andFuelUseNotBetween(Double value1, Double value2) {
            addCriterion("fuel_use not between", value1, value2, "fuelUse");
            return (Criteria) this;
        }

        public Criteria andExfIdIsNull() {
            addCriterion("exf_id is null");
            return (Criteria) this;
        }

        public Criteria andExfIdIsNotNull() {
            addCriterion("exf_id is not null");
            return (Criteria) this;
        }

        public Criteria andExfIdEqualTo(Integer value) {
            addCriterion("exf_id =", value, "exfId");
            return (Criteria) this;
        }

        public Criteria andExfIdNotEqualTo(Integer value) {
            addCriterion("exf_id <>", value, "exfId");
            return (Criteria) this;
        }

        public Criteria andExfIdGreaterThan(Integer value) {
            addCriterion("exf_id >", value, "exfId");
            return (Criteria) this;
        }

        public Criteria andExfIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exf_id >=", value, "exfId");
            return (Criteria) this;
        }

        public Criteria andExfIdLessThan(Integer value) {
            addCriterion("exf_id <", value, "exfId");
            return (Criteria) this;
        }

        public Criteria andExfIdLessThanOrEqualTo(Integer value) {
            addCriterion("exf_id <=", value, "exfId");
            return (Criteria) this;
        }

        public Criteria andExfIdIn(List<Integer> values) {
            addCriterion("exf_id in", values, "exfId");
            return (Criteria) this;
        }

        public Criteria andExfIdNotIn(List<Integer> values) {
            addCriterion("exf_id not in", values, "exfId");
            return (Criteria) this;
        }

        public Criteria andExfIdBetween(Integer value1, Integer value2) {
            addCriterion("exf_id between", value1, value2, "exfId");
            return (Criteria) this;
        }

        public Criteria andExfIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exf_id not between", value1, value2, "exfId");
            return (Criteria) this;
        }

        public Criteria andExfHeightIsNull() {
            addCriterion("exf_height is null");
            return (Criteria) this;
        }

        public Criteria andExfHeightIsNotNull() {
            addCriterion("exf_height is not null");
            return (Criteria) this;
        }

        public Criteria andExfHeightEqualTo(Double value) {
            addCriterion("exf_height =", value, "exfHeight");
            return (Criteria) this;
        }

        public Criteria andExfHeightNotEqualTo(Double value) {
            addCriterion("exf_height <>", value, "exfHeight");
            return (Criteria) this;
        }

        public Criteria andExfHeightGreaterThan(Double value) {
            addCriterion("exf_height >", value, "exfHeight");
            return (Criteria) this;
        }

        public Criteria andExfHeightGreaterThanOrEqualTo(Double value) {
            addCriterion("exf_height >=", value, "exfHeight");
            return (Criteria) this;
        }

        public Criteria andExfHeightLessThan(Double value) {
            addCriterion("exf_height <", value, "exfHeight");
            return (Criteria) this;
        }

        public Criteria andExfHeightLessThanOrEqualTo(Double value) {
            addCriterion("exf_height <=", value, "exfHeight");
            return (Criteria) this;
        }

        public Criteria andExfHeightIn(List<Double> values) {
            addCriterion("exf_height in", values, "exfHeight");
            return (Criteria) this;
        }

        public Criteria andExfHeightNotIn(List<Double> values) {
            addCriterion("exf_height not in", values, "exfHeight");
            return (Criteria) this;
        }

        public Criteria andExfHeightBetween(Double value1, Double value2) {
            addCriterion("exf_height between", value1, value2, "exfHeight");
            return (Criteria) this;
        }

        public Criteria andExfHeightNotBetween(Double value1, Double value2) {
            addCriterion("exf_height not between", value1, value2, "exfHeight");
            return (Criteria) this;
        }

        public Criteria andExfDiamIsNull() {
            addCriterion("exf_diam is null");
            return (Criteria) this;
        }

        public Criteria andExfDiamIsNotNull() {
            addCriterion("exf_diam is not null");
            return (Criteria) this;
        }

        public Criteria andExfDiamEqualTo(Double value) {
            addCriterion("exf_diam =", value, "exfDiam");
            return (Criteria) this;
        }

        public Criteria andExfDiamNotEqualTo(Double value) {
            addCriterion("exf_diam <>", value, "exfDiam");
            return (Criteria) this;
        }

        public Criteria andExfDiamGreaterThan(Double value) {
            addCriterion("exf_diam >", value, "exfDiam");
            return (Criteria) this;
        }

        public Criteria andExfDiamGreaterThanOrEqualTo(Double value) {
            addCriterion("exf_diam >=", value, "exfDiam");
            return (Criteria) this;
        }

        public Criteria andExfDiamLessThan(Double value) {
            addCriterion("exf_diam <", value, "exfDiam");
            return (Criteria) this;
        }

        public Criteria andExfDiamLessThanOrEqualTo(Double value) {
            addCriterion("exf_diam <=", value, "exfDiam");
            return (Criteria) this;
        }

        public Criteria andExfDiamIn(List<Double> values) {
            addCriterion("exf_diam in", values, "exfDiam");
            return (Criteria) this;
        }

        public Criteria andExfDiamNotIn(List<Double> values) {
            addCriterion("exf_diam not in", values, "exfDiam");
            return (Criteria) this;
        }

        public Criteria andExfDiamBetween(Double value1, Double value2) {
            addCriterion("exf_diam between", value1, value2, "exfDiam");
            return (Criteria) this;
        }

        public Criteria andExfDiamNotBetween(Double value1, Double value2) {
            addCriterion("exf_diam not between", value1, value2, "exfDiam");
            return (Criteria) this;
        }

        public Criteria andExfTempIsNull() {
            addCriterion("exf_temp is null");
            return (Criteria) this;
        }

        public Criteria andExfTempIsNotNull() {
            addCriterion("exf_temp is not null");
            return (Criteria) this;
        }

        public Criteria andExfTempEqualTo(Double value) {
            addCriterion("exf_temp =", value, "exfTemp");
            return (Criteria) this;
        }

        public Criteria andExfTempNotEqualTo(Double value) {
            addCriterion("exf_temp <>", value, "exfTemp");
            return (Criteria) this;
        }

        public Criteria andExfTempGreaterThan(Double value) {
            addCriterion("exf_temp >", value, "exfTemp");
            return (Criteria) this;
        }

        public Criteria andExfTempGreaterThanOrEqualTo(Double value) {
            addCriterion("exf_temp >=", value, "exfTemp");
            return (Criteria) this;
        }

        public Criteria andExfTempLessThan(Double value) {
            addCriterion("exf_temp <", value, "exfTemp");
            return (Criteria) this;
        }

        public Criteria andExfTempLessThanOrEqualTo(Double value) {
            addCriterion("exf_temp <=", value, "exfTemp");
            return (Criteria) this;
        }

        public Criteria andExfTempIn(List<Double> values) {
            addCriterion("exf_temp in", values, "exfTemp");
            return (Criteria) this;
        }

        public Criteria andExfTempNotIn(List<Double> values) {
            addCriterion("exf_temp not in", values, "exfTemp");
            return (Criteria) this;
        }

        public Criteria andExfTempBetween(Double value1, Double value2) {
            addCriterion("exf_temp between", value1, value2, "exfTemp");
            return (Criteria) this;
        }

        public Criteria andExfTempNotBetween(Double value1, Double value2) {
            addCriterion("exf_temp not between", value1, value2, "exfTemp");
            return (Criteria) this;
        }

        public Criteria andExfVeloIsNull() {
            addCriterion("exf_velo is null");
            return (Criteria) this;
        }

        public Criteria andExfVeloIsNotNull() {
            addCriterion("exf_velo is not null");
            return (Criteria) this;
        }

        public Criteria andExfVeloEqualTo(Double value) {
            addCriterion("exf_velo =", value, "exfVelo");
            return (Criteria) this;
        }

        public Criteria andExfVeloNotEqualTo(Double value) {
            addCriterion("exf_velo <>", value, "exfVelo");
            return (Criteria) this;
        }

        public Criteria andExfVeloGreaterThan(Double value) {
            addCriterion("exf_velo >", value, "exfVelo");
            return (Criteria) this;
        }

        public Criteria andExfVeloGreaterThanOrEqualTo(Double value) {
            addCriterion("exf_velo >=", value, "exfVelo");
            return (Criteria) this;
        }

        public Criteria andExfVeloLessThan(Double value) {
            addCriterion("exf_velo <", value, "exfVelo");
            return (Criteria) this;
        }

        public Criteria andExfVeloLessThanOrEqualTo(Double value) {
            addCriterion("exf_velo <=", value, "exfVelo");
            return (Criteria) this;
        }

        public Criteria andExfVeloIn(List<Double> values) {
            addCriterion("exf_velo in", values, "exfVelo");
            return (Criteria) this;
        }

        public Criteria andExfVeloNotIn(List<Double> values) {
            addCriterion("exf_velo not in", values, "exfVelo");
            return (Criteria) this;
        }

        public Criteria andExfVeloBetween(Double value1, Double value2) {
            addCriterion("exf_velo between", value1, value2, "exfVelo");
            return (Criteria) this;
        }

        public Criteria andExfVeloNotBetween(Double value1, Double value2) {
            addCriterion("exf_velo not between", value1, value2, "exfVelo");
            return (Criteria) this;
        }

        public Criteria andExfLatitudeIsNull() {
            addCriterion("exf_latitude is null");
            return (Criteria) this;
        }

        public Criteria andExfLatitudeIsNotNull() {
            addCriterion("exf_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andExfLatitudeEqualTo(Double value) {
            addCriterion("exf_latitude =", value, "exfLatitude");
            return (Criteria) this;
        }

        public Criteria andExfLatitudeNotEqualTo(Double value) {
            addCriterion("exf_latitude <>", value, "exfLatitude");
            return (Criteria) this;
        }

        public Criteria andExfLatitudeGreaterThan(Double value) {
            addCriterion("exf_latitude >", value, "exfLatitude");
            return (Criteria) this;
        }

        public Criteria andExfLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("exf_latitude >=", value, "exfLatitude");
            return (Criteria) this;
        }

        public Criteria andExfLatitudeLessThan(Double value) {
            addCriterion("exf_latitude <", value, "exfLatitude");
            return (Criteria) this;
        }

        public Criteria andExfLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("exf_latitude <=", value, "exfLatitude");
            return (Criteria) this;
        }

        public Criteria andExfLatitudeIn(List<Double> values) {
            addCriterion("exf_latitude in", values, "exfLatitude");
            return (Criteria) this;
        }

        public Criteria andExfLatitudeNotIn(List<Double> values) {
            addCriterion("exf_latitude not in", values, "exfLatitude");
            return (Criteria) this;
        }

        public Criteria andExfLatitudeBetween(Double value1, Double value2) {
            addCriterion("exf_latitude between", value1, value2, "exfLatitude");
            return (Criteria) this;
        }

        public Criteria andExfLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("exf_latitude not between", value1, value2, "exfLatitude");
            return (Criteria) this;
        }

        public Criteria andExfLongitudeIsNull() {
            addCriterion("exf_longitude is null");
            return (Criteria) this;
        }

        public Criteria andExfLongitudeIsNotNull() {
            addCriterion("exf_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andExfLongitudeEqualTo(Double value) {
            addCriterion("exf_longitude =", value, "exfLongitude");
            return (Criteria) this;
        }

        public Criteria andExfLongitudeNotEqualTo(Double value) {
            addCriterion("exf_longitude <>", value, "exfLongitude");
            return (Criteria) this;
        }

        public Criteria andExfLongitudeGreaterThan(Double value) {
            addCriterion("exf_longitude >", value, "exfLongitude");
            return (Criteria) this;
        }

        public Criteria andExfLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("exf_longitude >=", value, "exfLongitude");
            return (Criteria) this;
        }

        public Criteria andExfLongitudeLessThan(Double value) {
            addCriterion("exf_longitude <", value, "exfLongitude");
            return (Criteria) this;
        }

        public Criteria andExfLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("exf_longitude <=", value, "exfLongitude");
            return (Criteria) this;
        }

        public Criteria andExfLongitudeIn(List<Double> values) {
            addCriterion("exf_longitude in", values, "exfLongitude");
            return (Criteria) this;
        }

        public Criteria andExfLongitudeNotIn(List<Double> values) {
            addCriterion("exf_longitude not in", values, "exfLongitude");
            return (Criteria) this;
        }

        public Criteria andExfLongitudeBetween(Double value1, Double value2) {
            addCriterion("exf_longitude between", value1, value2, "exfLongitude");
            return (Criteria) this;
        }

        public Criteria andExfLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("exf_longitude not between", value1, value2, "exfLongitude");
            return (Criteria) this;
        }

        public Criteria andPlantIdIsNull() {
            addCriterion("plant_id is null");
            return (Criteria) this;
        }

        public Criteria andPlantIdIsNotNull() {
            addCriterion("plant_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlantIdEqualTo(String value) {
            addCriterion("plant_id =", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdNotEqualTo(String value) {
            addCriterion("plant_id <>", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdGreaterThan(String value) {
            addCriterion("plant_id >", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdGreaterThanOrEqualTo(String value) {
            addCriterion("plant_id >=", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdLessThan(String value) {
            addCriterion("plant_id <", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdLessThanOrEqualTo(String value) {
            addCriterion("plant_id <=", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdLike(String value) {
            addCriterion("plant_id like", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdNotLike(String value) {
            addCriterion("plant_id not like", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdIn(List<String> values) {
            addCriterion("plant_id in", values, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdNotIn(List<String> values) {
            addCriterion("plant_id not in", values, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdBetween(String value1, String value2) {
            addCriterion("plant_id between", value1, value2, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdNotBetween(String value1, String value2) {
            addCriterion("plant_id not between", value1, value2, "plantId");
            return (Criteria) this;
        }

        public Criteria andCountyIdIsNull() {
            addCriterion("county_id is null");
            return (Criteria) this;
        }

        public Criteria andCountyIdIsNotNull() {
            addCriterion("county_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountyIdEqualTo(String value) {
            addCriterion("county_id =", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotEqualTo(String value) {
            addCriterion("county_id <>", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdGreaterThan(String value) {
            addCriterion("county_id >", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdGreaterThanOrEqualTo(String value) {
            addCriterion("county_id >=", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLessThan(String value) {
            addCriterion("county_id <", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLessThanOrEqualTo(String value) {
            addCriterion("county_id <=", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLike(String value) {
            addCriterion("county_id like", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotLike(String value) {
            addCriterion("county_id not like", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdIn(List<String> values) {
            addCriterion("county_id in", values, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotIn(List<String> values) {
            addCriterion("county_id not in", values, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdBetween(String value1, String value2) {
            addCriterion("county_id between", value1, value2, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotBetween(String value1, String value2) {
            addCriterion("county_id not between", value1, value2, "countyId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIsNull() {
            addCriterion("industry_id is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIsNotNull() {
            addCriterion("industry_id is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryIdEqualTo(String value) {
            addCriterion("industry_id =", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotEqualTo(String value) {
            addCriterion("industry_id <>", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdGreaterThan(String value) {
            addCriterion("industry_id >", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdGreaterThanOrEqualTo(String value) {
            addCriterion("industry_id >=", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdLessThan(String value) {
            addCriterion("industry_id <", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdLessThanOrEqualTo(String value) {
            addCriterion("industry_id <=", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdLike(String value) {
            addCriterion("industry_id like", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotLike(String value) {
            addCriterion("industry_id not like", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIn(List<String> values) {
            addCriterion("industry_id in", values, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotIn(List<String> values) {
            addCriterion("industry_id not in", values, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdBetween(String value1, String value2) {
            addCriterion("industry_id between", value1, value2, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotBetween(String value1, String value2) {
            addCriterion("industry_id not between", value1, value2, "industryId");
            return (Criteria) this;
        }

        public Criteria andPm10FacIsNull() {
            addCriterion("pm10_fac is null");
            return (Criteria) this;
        }

        public Criteria andPm10FacIsNotNull() {
            addCriterion("pm10_fac is not null");
            return (Criteria) this;
        }

        public Criteria andPm10FacEqualTo(Double value) {
            addCriterion("pm10_fac =", value, "pm10Fac");
            return (Criteria) this;
        }

        public Criteria andPm10FacNotEqualTo(Double value) {
            addCriterion("pm10_fac <>", value, "pm10Fac");
            return (Criteria) this;
        }

        public Criteria andPm10FacGreaterThan(Double value) {
            addCriterion("pm10_fac >", value, "pm10Fac");
            return (Criteria) this;
        }

        public Criteria andPm10FacGreaterThanOrEqualTo(Double value) {
            addCriterion("pm10_fac >=", value, "pm10Fac");
            return (Criteria) this;
        }

        public Criteria andPm10FacLessThan(Double value) {
            addCriterion("pm10_fac <", value, "pm10Fac");
            return (Criteria) this;
        }

        public Criteria andPm10FacLessThanOrEqualTo(Double value) {
            addCriterion("pm10_fac <=", value, "pm10Fac");
            return (Criteria) this;
        }

        public Criteria andPm10FacIn(List<Double> values) {
            addCriterion("pm10_fac in", values, "pm10Fac");
            return (Criteria) this;
        }

        public Criteria andPm10FacNotIn(List<Double> values) {
            addCriterion("pm10_fac not in", values, "pm10Fac");
            return (Criteria) this;
        }

        public Criteria andPm10FacBetween(Double value1, Double value2) {
            addCriterion("pm10_fac between", value1, value2, "pm10Fac");
            return (Criteria) this;
        }

        public Criteria andPm10FacNotBetween(Double value1, Double value2) {
            addCriterion("pm10_fac not between", value1, value2, "pm10Fac");
            return (Criteria) this;
        }

        public Criteria andPm25FacIsNull() {
            addCriterion("pm25_fac is null");
            return (Criteria) this;
        }

        public Criteria andPm25FacIsNotNull() {
            addCriterion("pm25_fac is not null");
            return (Criteria) this;
        }

        public Criteria andPm25FacEqualTo(Double value) {
            addCriterion("pm25_fac =", value, "pm25Fac");
            return (Criteria) this;
        }

        public Criteria andPm25FacNotEqualTo(Double value) {
            addCriterion("pm25_fac <>", value, "pm25Fac");
            return (Criteria) this;
        }

        public Criteria andPm25FacGreaterThan(Double value) {
            addCriterion("pm25_fac >", value, "pm25Fac");
            return (Criteria) this;
        }

        public Criteria andPm25FacGreaterThanOrEqualTo(Double value) {
            addCriterion("pm25_fac >=", value, "pm25Fac");
            return (Criteria) this;
        }

        public Criteria andPm25FacLessThan(Double value) {
            addCriterion("pm25_fac <", value, "pm25Fac");
            return (Criteria) this;
        }

        public Criteria andPm25FacLessThanOrEqualTo(Double value) {
            addCriterion("pm25_fac <=", value, "pm25Fac");
            return (Criteria) this;
        }

        public Criteria andPm25FacIn(List<Double> values) {
            addCriterion("pm25_fac in", values, "pm25Fac");
            return (Criteria) this;
        }

        public Criteria andPm25FacNotIn(List<Double> values) {
            addCriterion("pm25_fac not in", values, "pm25Fac");
            return (Criteria) this;
        }

        public Criteria andPm25FacBetween(Double value1, Double value2) {
            addCriterion("pm25_fac between", value1, value2, "pm25Fac");
            return (Criteria) this;
        }

        public Criteria andPm25FacNotBetween(Double value1, Double value2) {
            addCriterion("pm25_fac not between", value1, value2, "pm25Fac");
            return (Criteria) this;
        }

        public Criteria andCoFacIsNull() {
            addCriterion("co_fac is null");
            return (Criteria) this;
        }

        public Criteria andCoFacIsNotNull() {
            addCriterion("co_fac is not null");
            return (Criteria) this;
        }

        public Criteria andCoFacEqualTo(Double value) {
            addCriterion("co_fac =", value, "coFac");
            return (Criteria) this;
        }

        public Criteria andCoFacNotEqualTo(Double value) {
            addCriterion("co_fac <>", value, "coFac");
            return (Criteria) this;
        }

        public Criteria andCoFacGreaterThan(Double value) {
            addCriterion("co_fac >", value, "coFac");
            return (Criteria) this;
        }

        public Criteria andCoFacGreaterThanOrEqualTo(Double value) {
            addCriterion("co_fac >=", value, "coFac");
            return (Criteria) this;
        }

        public Criteria andCoFacLessThan(Double value) {
            addCriterion("co_fac <", value, "coFac");
            return (Criteria) this;
        }

        public Criteria andCoFacLessThanOrEqualTo(Double value) {
            addCriterion("co_fac <=", value, "coFac");
            return (Criteria) this;
        }

        public Criteria andCoFacIn(List<Double> values) {
            addCriterion("co_fac in", values, "coFac");
            return (Criteria) this;
        }

        public Criteria andCoFacNotIn(List<Double> values) {
            addCriterion("co_fac not in", values, "coFac");
            return (Criteria) this;
        }

        public Criteria andCoFacBetween(Double value1, Double value2) {
            addCriterion("co_fac between", value1, value2, "coFac");
            return (Criteria) this;
        }

        public Criteria andCoFacNotBetween(Double value1, Double value2) {
            addCriterion("co_fac not between", value1, value2, "coFac");
            return (Criteria) this;
        }

        public Criteria andVocFacIsNull() {
            addCriterion("voc_fac is null");
            return (Criteria) this;
        }

        public Criteria andVocFacIsNotNull() {
            addCriterion("voc_fac is not null");
            return (Criteria) this;
        }

        public Criteria andVocFacEqualTo(Double value) {
            addCriterion("voc_fac =", value, "vocFac");
            return (Criteria) this;
        }

        public Criteria andVocFacNotEqualTo(Double value) {
            addCriterion("voc_fac <>", value, "vocFac");
            return (Criteria) this;
        }

        public Criteria andVocFacGreaterThan(Double value) {
            addCriterion("voc_fac >", value, "vocFac");
            return (Criteria) this;
        }

        public Criteria andVocFacGreaterThanOrEqualTo(Double value) {
            addCriterion("voc_fac >=", value, "vocFac");
            return (Criteria) this;
        }

        public Criteria andVocFacLessThan(Double value) {
            addCriterion("voc_fac <", value, "vocFac");
            return (Criteria) this;
        }

        public Criteria andVocFacLessThanOrEqualTo(Double value) {
            addCriterion("voc_fac <=", value, "vocFac");
            return (Criteria) this;
        }

        public Criteria andVocFacIn(List<Double> values) {
            addCriterion("voc_fac in", values, "vocFac");
            return (Criteria) this;
        }

        public Criteria andVocFacNotIn(List<Double> values) {
            addCriterion("voc_fac not in", values, "vocFac");
            return (Criteria) this;
        }

        public Criteria andVocFacBetween(Double value1, Double value2) {
            addCriterion("voc_fac between", value1, value2, "vocFac");
            return (Criteria) this;
        }

        public Criteria andVocFacNotBetween(Double value1, Double value2) {
            addCriterion("voc_fac not between", value1, value2, "vocFac");
            return (Criteria) this;
        }

        public Criteria andPmFacIsNull() {
            addCriterion("pm_fac is null");
            return (Criteria) this;
        }

        public Criteria andPmFacIsNotNull() {
            addCriterion("pm_fac is not null");
            return (Criteria) this;
        }

        public Criteria andPmFacEqualTo(Double value) {
            addCriterion("pm_fac =", value, "pmFac");
            return (Criteria) this;
        }

        public Criteria andPmFacNotEqualTo(Double value) {
            addCriterion("pm_fac <>", value, "pmFac");
            return (Criteria) this;
        }

        public Criteria andPmFacGreaterThan(Double value) {
            addCriterion("pm_fac >", value, "pmFac");
            return (Criteria) this;
        }

        public Criteria andPmFacGreaterThanOrEqualTo(Double value) {
            addCriterion("pm_fac >=", value, "pmFac");
            return (Criteria) this;
        }

        public Criteria andPmFacLessThan(Double value) {
            addCriterion("pm_fac <", value, "pmFac");
            return (Criteria) this;
        }

        public Criteria andPmFacLessThanOrEqualTo(Double value) {
            addCriterion("pm_fac <=", value, "pmFac");
            return (Criteria) this;
        }

        public Criteria andPmFacIn(List<Double> values) {
            addCriterion("pm_fac in", values, "pmFac");
            return (Criteria) this;
        }

        public Criteria andPmFacNotIn(List<Double> values) {
            addCriterion("pm_fac not in", values, "pmFac");
            return (Criteria) this;
        }

        public Criteria andPmFacBetween(Double value1, Double value2) {
            addCriterion("pm_fac between", value1, value2, "pmFac");
            return (Criteria) this;
        }

        public Criteria andPmFacNotBetween(Double value1, Double value2) {
            addCriterion("pm_fac not between", value1, value2, "pmFac");
            return (Criteria) this;
        }

        public Criteria andSo2FacIsNull() {
            addCriterion("so2_fac is null");
            return (Criteria) this;
        }

        public Criteria andSo2FacIsNotNull() {
            addCriterion("so2_fac is not null");
            return (Criteria) this;
        }

        public Criteria andSo2FacEqualTo(Double value) {
            addCriterion("so2_fac =", value, "so2Fac");
            return (Criteria) this;
        }

        public Criteria andSo2FacNotEqualTo(Double value) {
            addCriterion("so2_fac <>", value, "so2Fac");
            return (Criteria) this;
        }

        public Criteria andSo2FacGreaterThan(Double value) {
            addCriterion("so2_fac >", value, "so2Fac");
            return (Criteria) this;
        }

        public Criteria andSo2FacGreaterThanOrEqualTo(Double value) {
            addCriterion("so2_fac >=", value, "so2Fac");
            return (Criteria) this;
        }

        public Criteria andSo2FacLessThan(Double value) {
            addCriterion("so2_fac <", value, "so2Fac");
            return (Criteria) this;
        }

        public Criteria andSo2FacLessThanOrEqualTo(Double value) {
            addCriterion("so2_fac <=", value, "so2Fac");
            return (Criteria) this;
        }

        public Criteria andSo2FacIn(List<Double> values) {
            addCriterion("so2_fac in", values, "so2Fac");
            return (Criteria) this;
        }

        public Criteria andSo2FacNotIn(List<Double> values) {
            addCriterion("so2_fac not in", values, "so2Fac");
            return (Criteria) this;
        }

        public Criteria andSo2FacBetween(Double value1, Double value2) {
            addCriterion("so2_fac between", value1, value2, "so2Fac");
            return (Criteria) this;
        }

        public Criteria andSo2FacNotBetween(Double value1, Double value2) {
            addCriterion("so2_fac not between", value1, value2, "so2Fac");
            return (Criteria) this;
        }

        public Criteria andNoxFacIsNull() {
            addCriterion("nox_fac is null");
            return (Criteria) this;
        }

        public Criteria andNoxFacIsNotNull() {
            addCriterion("nox_fac is not null");
            return (Criteria) this;
        }

        public Criteria andNoxFacEqualTo(Double value) {
            addCriterion("nox_fac =", value, "noxFac");
            return (Criteria) this;
        }

        public Criteria andNoxFacNotEqualTo(Double value) {
            addCriterion("nox_fac <>", value, "noxFac");
            return (Criteria) this;
        }

        public Criteria andNoxFacGreaterThan(Double value) {
            addCriterion("nox_fac >", value, "noxFac");
            return (Criteria) this;
        }

        public Criteria andNoxFacGreaterThanOrEqualTo(Double value) {
            addCriterion("nox_fac >=", value, "noxFac");
            return (Criteria) this;
        }

        public Criteria andNoxFacLessThan(Double value) {
            addCriterion("nox_fac <", value, "noxFac");
            return (Criteria) this;
        }

        public Criteria andNoxFacLessThanOrEqualTo(Double value) {
            addCriterion("nox_fac <=", value, "noxFac");
            return (Criteria) this;
        }

        public Criteria andNoxFacIn(List<Double> values) {
            addCriterion("nox_fac in", values, "noxFac");
            return (Criteria) this;
        }

        public Criteria andNoxFacNotIn(List<Double> values) {
            addCriterion("nox_fac not in", values, "noxFac");
            return (Criteria) this;
        }

        public Criteria andNoxFacBetween(Double value1, Double value2) {
            addCriterion("nox_fac between", value1, value2, "noxFac");
            return (Criteria) this;
        }

        public Criteria andNoxFacNotBetween(Double value1, Double value2) {
            addCriterion("nox_fac not between", value1, value2, "noxFac");
            return (Criteria) this;
        }

        public Criteria andNh3FacIsNull() {
            addCriterion("nh3_fac is null");
            return (Criteria) this;
        }

        public Criteria andNh3FacIsNotNull() {
            addCriterion("nh3_fac is not null");
            return (Criteria) this;
        }

        public Criteria andNh3FacEqualTo(Double value) {
            addCriterion("nh3_fac =", value, "nh3Fac");
            return (Criteria) this;
        }

        public Criteria andNh3FacNotEqualTo(Double value) {
            addCriterion("nh3_fac <>", value, "nh3Fac");
            return (Criteria) this;
        }

        public Criteria andNh3FacGreaterThan(Double value) {
            addCriterion("nh3_fac >", value, "nh3Fac");
            return (Criteria) this;
        }

        public Criteria andNh3FacGreaterThanOrEqualTo(Double value) {
            addCriterion("nh3_fac >=", value, "nh3Fac");
            return (Criteria) this;
        }

        public Criteria andNh3FacLessThan(Double value) {
            addCriterion("nh3_fac <", value, "nh3Fac");
            return (Criteria) this;
        }

        public Criteria andNh3FacLessThanOrEqualTo(Double value) {
            addCriterion("nh3_fac <=", value, "nh3Fac");
            return (Criteria) this;
        }

        public Criteria andNh3FacIn(List<Double> values) {
            addCriterion("nh3_fac in", values, "nh3Fac");
            return (Criteria) this;
        }

        public Criteria andNh3FacNotIn(List<Double> values) {
            addCriterion("nh3_fac not in", values, "nh3Fac");
            return (Criteria) this;
        }

        public Criteria andNh3FacBetween(Double value1, Double value2) {
            addCriterion("nh3_fac between", value1, value2, "nh3Fac");
            return (Criteria) this;
        }

        public Criteria andNh3FacNotBetween(Double value1, Double value2) {
            addCriterion("nh3_fac not between", value1, value2, "nh3Fac");
            return (Criteria) this;
        }

        public Criteria andOcFacIsNull() {
            addCriterion("oc_fac is null");
            return (Criteria) this;
        }

        public Criteria andOcFacIsNotNull() {
            addCriterion("oc_fac is not null");
            return (Criteria) this;
        }

        public Criteria andOcFacEqualTo(Double value) {
            addCriterion("oc_fac =", value, "ocFac");
            return (Criteria) this;
        }

        public Criteria andOcFacNotEqualTo(Double value) {
            addCriterion("oc_fac <>", value, "ocFac");
            return (Criteria) this;
        }

        public Criteria andOcFacGreaterThan(Double value) {
            addCriterion("oc_fac >", value, "ocFac");
            return (Criteria) this;
        }

        public Criteria andOcFacGreaterThanOrEqualTo(Double value) {
            addCriterion("oc_fac >=", value, "ocFac");
            return (Criteria) this;
        }

        public Criteria andOcFacLessThan(Double value) {
            addCriterion("oc_fac <", value, "ocFac");
            return (Criteria) this;
        }

        public Criteria andOcFacLessThanOrEqualTo(Double value) {
            addCriterion("oc_fac <=", value, "ocFac");
            return (Criteria) this;
        }

        public Criteria andOcFacIn(List<Double> values) {
            addCriterion("oc_fac in", values, "ocFac");
            return (Criteria) this;
        }

        public Criteria andOcFacNotIn(List<Double> values) {
            addCriterion("oc_fac not in", values, "ocFac");
            return (Criteria) this;
        }

        public Criteria andOcFacBetween(Double value1, Double value2) {
            addCriterion("oc_fac between", value1, value2, "ocFac");
            return (Criteria) this;
        }

        public Criteria andOcFacNotBetween(Double value1, Double value2) {
            addCriterion("oc_fac not between", value1, value2, "ocFac");
            return (Criteria) this;
        }

        public Criteria andBcFacIsNull() {
            addCriterion("bc_fac is null");
            return (Criteria) this;
        }

        public Criteria andBcFacIsNotNull() {
            addCriterion("bc_fac is not null");
            return (Criteria) this;
        }

        public Criteria andBcFacEqualTo(Double value) {
            addCriterion("bc_fac =", value, "bcFac");
            return (Criteria) this;
        }

        public Criteria andBcFacNotEqualTo(Double value) {
            addCriterion("bc_fac <>", value, "bcFac");
            return (Criteria) this;
        }

        public Criteria andBcFacGreaterThan(Double value) {
            addCriterion("bc_fac >", value, "bcFac");
            return (Criteria) this;
        }

        public Criteria andBcFacGreaterThanOrEqualTo(Double value) {
            addCriterion("bc_fac >=", value, "bcFac");
            return (Criteria) this;
        }

        public Criteria andBcFacLessThan(Double value) {
            addCriterion("bc_fac <", value, "bcFac");
            return (Criteria) this;
        }

        public Criteria andBcFacLessThanOrEqualTo(Double value) {
            addCriterion("bc_fac <=", value, "bcFac");
            return (Criteria) this;
        }

        public Criteria andBcFacIn(List<Double> values) {
            addCriterion("bc_fac in", values, "bcFac");
            return (Criteria) this;
        }

        public Criteria andBcFacNotIn(List<Double> values) {
            addCriterion("bc_fac not in", values, "bcFac");
            return (Criteria) this;
        }

        public Criteria andBcFacBetween(Double value1, Double value2) {
            addCriterion("bc_fac between", value1, value2, "bcFac");
            return (Criteria) this;
        }

        public Criteria andBcFacNotBetween(Double value1, Double value2) {
            addCriterion("bc_fac not between", value1, value2, "bcFac");
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