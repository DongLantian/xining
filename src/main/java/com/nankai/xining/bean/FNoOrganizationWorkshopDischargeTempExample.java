package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class FNoOrganizationWorkshopDischargeTempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FNoOrganizationWorkshopDischargeTempExample() {
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

        public Criteria andWsidIsNull() {
            addCriterion("wsid is null");
            return (Criteria) this;
        }

        public Criteria andWsidIsNotNull() {
            addCriterion("wsid is not null");
            return (Criteria) this;
        }

        public Criteria andWsidEqualTo(Integer value) {
            addCriterion("wsid =", value, "wsid");
            return (Criteria) this;
        }

        public Criteria andWsidNotEqualTo(Integer value) {
            addCriterion("wsid <>", value, "wsid");
            return (Criteria) this;
        }

        public Criteria andWsidGreaterThan(Integer value) {
            addCriterion("wsid >", value, "wsid");
            return (Criteria) this;
        }

        public Criteria andWsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wsid >=", value, "wsid");
            return (Criteria) this;
        }

        public Criteria andWsidLessThan(Integer value) {
            addCriterion("wsid <", value, "wsid");
            return (Criteria) this;
        }

        public Criteria andWsidLessThanOrEqualTo(Integer value) {
            addCriterion("wsid <=", value, "wsid");
            return (Criteria) this;
        }

        public Criteria andWsidIn(List<Integer> values) {
            addCriterion("wsid in", values, "wsid");
            return (Criteria) this;
        }

        public Criteria andWsidNotIn(List<Integer> values) {
            addCriterion("wsid not in", values, "wsid");
            return (Criteria) this;
        }

        public Criteria andWsidBetween(Integer value1, Integer value2) {
            addCriterion("wsid between", value1, value2, "wsid");
            return (Criteria) this;
        }

        public Criteria andWsidNotBetween(Integer value1, Integer value2) {
            addCriterion("wsid not between", value1, value2, "wsid");
            return (Criteria) this;
        }

        public Criteria andWorkshopidIsNull() {
            addCriterion("workshopid is null");
            return (Criteria) this;
        }

        public Criteria andWorkshopidIsNotNull() {
            addCriterion("workshopid is not null");
            return (Criteria) this;
        }

        public Criteria andWorkshopidEqualTo(Integer value) {
            addCriterion("workshopid =", value, "workshopid");
            return (Criteria) this;
        }

        public Criteria andWorkshopidNotEqualTo(Integer value) {
            addCriterion("workshopid <>", value, "workshopid");
            return (Criteria) this;
        }

        public Criteria andWorkshopidGreaterThan(Integer value) {
            addCriterion("workshopid >", value, "workshopid");
            return (Criteria) this;
        }

        public Criteria andWorkshopidGreaterThanOrEqualTo(Integer value) {
            addCriterion("workshopid >=", value, "workshopid");
            return (Criteria) this;
        }

        public Criteria andWorkshopidLessThan(Integer value) {
            addCriterion("workshopid <", value, "workshopid");
            return (Criteria) this;
        }

        public Criteria andWorkshopidLessThanOrEqualTo(Integer value) {
            addCriterion("workshopid <=", value, "workshopid");
            return (Criteria) this;
        }

        public Criteria andWorkshopidIn(List<Integer> values) {
            addCriterion("workshopid in", values, "workshopid");
            return (Criteria) this;
        }

        public Criteria andWorkshopidNotIn(List<Integer> values) {
            addCriterion("workshopid not in", values, "workshopid");
            return (Criteria) this;
        }

        public Criteria andWorkshopidBetween(Integer value1, Integer value2) {
            addCriterion("workshopid between", value1, value2, "workshopid");
            return (Criteria) this;
        }

        public Criteria andWorkshopidNotBetween(Integer value1, Integer value2) {
            addCriterion("workshopid not between", value1, value2, "workshopid");
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

        public Criteria andFactoryidIsNull() {
            addCriterion("factoryid is null");
            return (Criteria) this;
        }

        public Criteria andFactoryidIsNotNull() {
            addCriterion("factoryid is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryidEqualTo(Integer value) {
            addCriterion("factoryid =", value, "factoryid");
            return (Criteria) this;
        }

        public Criteria andFactoryidNotEqualTo(Integer value) {
            addCriterion("factoryid <>", value, "factoryid");
            return (Criteria) this;
        }

        public Criteria andFactoryidGreaterThan(Integer value) {
            addCriterion("factoryid >", value, "factoryid");
            return (Criteria) this;
        }

        public Criteria andFactoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("factoryid >=", value, "factoryid");
            return (Criteria) this;
        }

        public Criteria andFactoryidLessThan(Integer value) {
            addCriterion("factoryid <", value, "factoryid");
            return (Criteria) this;
        }

        public Criteria andFactoryidLessThanOrEqualTo(Integer value) {
            addCriterion("factoryid <=", value, "factoryid");
            return (Criteria) this;
        }

        public Criteria andFactoryidIn(List<Integer> values) {
            addCriterion("factoryid in", values, "factoryid");
            return (Criteria) this;
        }

        public Criteria andFactoryidNotIn(List<Integer> values) {
            addCriterion("factoryid not in", values, "factoryid");
            return (Criteria) this;
        }

        public Criteria andFactoryidBetween(Integer value1, Integer value2) {
            addCriterion("factoryid between", value1, value2, "factoryid");
            return (Criteria) this;
        }

        public Criteria andFactoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("factoryid not between", value1, value2, "factoryid");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(Double value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(Double value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(Double value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(Double value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<Double> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<Double> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(Double value1, Double value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(Double value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(Double value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(Double value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(Double value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<Double> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<Double> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(Double value1, Double value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andProductionUseIsNull() {
            addCriterion("production_use is null");
            return (Criteria) this;
        }

        public Criteria andProductionUseIsNotNull() {
            addCriterion("production_use is not null");
            return (Criteria) this;
        }

        public Criteria andProductionUseEqualTo(String value) {
            addCriterion("production_use =", value, "productionUse");
            return (Criteria) this;
        }

        public Criteria andProductionUseNotEqualTo(String value) {
            addCriterion("production_use <>", value, "productionUse");
            return (Criteria) this;
        }

        public Criteria andProductionUseGreaterThan(String value) {
            addCriterion("production_use >", value, "productionUse");
            return (Criteria) this;
        }

        public Criteria andProductionUseGreaterThanOrEqualTo(String value) {
            addCriterion("production_use >=", value, "productionUse");
            return (Criteria) this;
        }

        public Criteria andProductionUseLessThan(String value) {
            addCriterion("production_use <", value, "productionUse");
            return (Criteria) this;
        }

        public Criteria andProductionUseLessThanOrEqualTo(String value) {
            addCriterion("production_use <=", value, "productionUse");
            return (Criteria) this;
        }

        public Criteria andProductionUseLike(String value) {
            addCriterion("production_use like", value, "productionUse");
            return (Criteria) this;
        }

        public Criteria andProductionUseNotLike(String value) {
            addCriterion("production_use not like", value, "productionUse");
            return (Criteria) this;
        }

        public Criteria andProductionUseIn(List<String> values) {
            addCriterion("production_use in", values, "productionUse");
            return (Criteria) this;
        }

        public Criteria andProductionUseNotIn(List<String> values) {
            addCriterion("production_use not in", values, "productionUse");
            return (Criteria) this;
        }

        public Criteria andProductionUseBetween(String value1, String value2) {
            addCriterion("production_use between", value1, value2, "productionUse");
            return (Criteria) this;
        }

        public Criteria andProductionUseNotBetween(String value1, String value2) {
            addCriterion("production_use not between", value1, value2, "productionUse");
            return (Criteria) this;
        }

        public Criteria andWorkshopAreaIsNull() {
            addCriterion("workshop_area is null");
            return (Criteria) this;
        }

        public Criteria andWorkshopAreaIsNotNull() {
            addCriterion("workshop_area is not null");
            return (Criteria) this;
        }

        public Criteria andWorkshopAreaEqualTo(Double value) {
            addCriterion("workshop_area =", value, "workshopArea");
            return (Criteria) this;
        }

        public Criteria andWorkshopAreaNotEqualTo(Double value) {
            addCriterion("workshop_area <>", value, "workshopArea");
            return (Criteria) this;
        }

        public Criteria andWorkshopAreaGreaterThan(Double value) {
            addCriterion("workshop_area >", value, "workshopArea");
            return (Criteria) this;
        }

        public Criteria andWorkshopAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("workshop_area >=", value, "workshopArea");
            return (Criteria) this;
        }

        public Criteria andWorkshopAreaLessThan(Double value) {
            addCriterion("workshop_area <", value, "workshopArea");
            return (Criteria) this;
        }

        public Criteria andWorkshopAreaLessThanOrEqualTo(Double value) {
            addCriterion("workshop_area <=", value, "workshopArea");
            return (Criteria) this;
        }

        public Criteria andWorkshopAreaIn(List<Double> values) {
            addCriterion("workshop_area in", values, "workshopArea");
            return (Criteria) this;
        }

        public Criteria andWorkshopAreaNotIn(List<Double> values) {
            addCriterion("workshop_area not in", values, "workshopArea");
            return (Criteria) this;
        }

        public Criteria andWorkshopAreaBetween(Double value1, Double value2) {
            addCriterion("workshop_area between", value1, value2, "workshopArea");
            return (Criteria) this;
        }

        public Criteria andWorkshopAreaNotBetween(Double value1, Double value2) {
            addCriterion("workshop_area not between", value1, value2, "workshopArea");
            return (Criteria) this;
        }

        public Criteria andPm10FactorsIsNull() {
            addCriterion("pm10_factors is null");
            return (Criteria) this;
        }

        public Criteria andPm10FactorsIsNotNull() {
            addCriterion("pm10_factors is not null");
            return (Criteria) this;
        }

        public Criteria andPm10FactorsEqualTo(Double value) {
            addCriterion("pm10_factors =", value, "pm10Factors");
            return (Criteria) this;
        }

        public Criteria andPm10FactorsNotEqualTo(Double value) {
            addCriterion("pm10_factors <>", value, "pm10Factors");
            return (Criteria) this;
        }

        public Criteria andPm10FactorsGreaterThan(Double value) {
            addCriterion("pm10_factors >", value, "pm10Factors");
            return (Criteria) this;
        }

        public Criteria andPm10FactorsGreaterThanOrEqualTo(Double value) {
            addCriterion("pm10_factors >=", value, "pm10Factors");
            return (Criteria) this;
        }

        public Criteria andPm10FactorsLessThan(Double value) {
            addCriterion("pm10_factors <", value, "pm10Factors");
            return (Criteria) this;
        }

        public Criteria andPm10FactorsLessThanOrEqualTo(Double value) {
            addCriterion("pm10_factors <=", value, "pm10Factors");
            return (Criteria) this;
        }

        public Criteria andPm10FactorsIn(List<Double> values) {
            addCriterion("pm10_factors in", values, "pm10Factors");
            return (Criteria) this;
        }

        public Criteria andPm10FactorsNotIn(List<Double> values) {
            addCriterion("pm10_factors not in", values, "pm10Factors");
            return (Criteria) this;
        }

        public Criteria andPm10FactorsBetween(Double value1, Double value2) {
            addCriterion("pm10_factors between", value1, value2, "pm10Factors");
            return (Criteria) this;
        }

        public Criteria andPm10FactorsNotBetween(Double value1, Double value2) {
            addCriterion("pm10_factors not between", value1, value2, "pm10Factors");
            return (Criteria) this;
        }

        public Criteria andPm25FactorsIsNull() {
            addCriterion("pm25_factors is null");
            return (Criteria) this;
        }

        public Criteria andPm25FactorsIsNotNull() {
            addCriterion("pm25_factors is not null");
            return (Criteria) this;
        }

        public Criteria andPm25FactorsEqualTo(Double value) {
            addCriterion("pm25_factors =", value, "pm25Factors");
            return (Criteria) this;
        }

        public Criteria andPm25FactorsNotEqualTo(Double value) {
            addCriterion("pm25_factors <>", value, "pm25Factors");
            return (Criteria) this;
        }

        public Criteria andPm25FactorsGreaterThan(Double value) {
            addCriterion("pm25_factors >", value, "pm25Factors");
            return (Criteria) this;
        }

        public Criteria andPm25FactorsGreaterThanOrEqualTo(Double value) {
            addCriterion("pm25_factors >=", value, "pm25Factors");
            return (Criteria) this;
        }

        public Criteria andPm25FactorsLessThan(Double value) {
            addCriterion("pm25_factors <", value, "pm25Factors");
            return (Criteria) this;
        }

        public Criteria andPm25FactorsLessThanOrEqualTo(Double value) {
            addCriterion("pm25_factors <=", value, "pm25Factors");
            return (Criteria) this;
        }

        public Criteria andPm25FactorsIn(List<Double> values) {
            addCriterion("pm25_factors in", values, "pm25Factors");
            return (Criteria) this;
        }

        public Criteria andPm25FactorsNotIn(List<Double> values) {
            addCriterion("pm25_factors not in", values, "pm25Factors");
            return (Criteria) this;
        }

        public Criteria andPm25FactorsBetween(Double value1, Double value2) {
            addCriterion("pm25_factors between", value1, value2, "pm25Factors");
            return (Criteria) this;
        }

        public Criteria andPm25FactorsNotBetween(Double value1, Double value2) {
            addCriterion("pm25_factors not between", value1, value2, "pm25Factors");
            return (Criteria) this;
        }

        public Criteria andOcFactorsIsNull() {
            addCriterion("oc_factors is null");
            return (Criteria) this;
        }

        public Criteria andOcFactorsIsNotNull() {
            addCriterion("oc_factors is not null");
            return (Criteria) this;
        }

        public Criteria andOcFactorsEqualTo(Double value) {
            addCriterion("oc_factors =", value, "ocFactors");
            return (Criteria) this;
        }

        public Criteria andOcFactorsNotEqualTo(Double value) {
            addCriterion("oc_factors <>", value, "ocFactors");
            return (Criteria) this;
        }

        public Criteria andOcFactorsGreaterThan(Double value) {
            addCriterion("oc_factors >", value, "ocFactors");
            return (Criteria) this;
        }

        public Criteria andOcFactorsGreaterThanOrEqualTo(Double value) {
            addCriterion("oc_factors >=", value, "ocFactors");
            return (Criteria) this;
        }

        public Criteria andOcFactorsLessThan(Double value) {
            addCriterion("oc_factors <", value, "ocFactors");
            return (Criteria) this;
        }

        public Criteria andOcFactorsLessThanOrEqualTo(Double value) {
            addCriterion("oc_factors <=", value, "ocFactors");
            return (Criteria) this;
        }

        public Criteria andOcFactorsIn(List<Double> values) {
            addCriterion("oc_factors in", values, "ocFactors");
            return (Criteria) this;
        }

        public Criteria andOcFactorsNotIn(List<Double> values) {
            addCriterion("oc_factors not in", values, "ocFactors");
            return (Criteria) this;
        }

        public Criteria andOcFactorsBetween(Double value1, Double value2) {
            addCriterion("oc_factors between", value1, value2, "ocFactors");
            return (Criteria) this;
        }

        public Criteria andOcFactorsNotBetween(Double value1, Double value2) {
            addCriterion("oc_factors not between", value1, value2, "ocFactors");
            return (Criteria) this;
        }

        public Criteria andEcFactorsIsNull() {
            addCriterion("ec_factors is null");
            return (Criteria) this;
        }

        public Criteria andEcFactorsIsNotNull() {
            addCriterion("ec_factors is not null");
            return (Criteria) this;
        }

        public Criteria andEcFactorsEqualTo(Double value) {
            addCriterion("ec_factors =", value, "ecFactors");
            return (Criteria) this;
        }

        public Criteria andEcFactorsNotEqualTo(Double value) {
            addCriterion("ec_factors <>", value, "ecFactors");
            return (Criteria) this;
        }

        public Criteria andEcFactorsGreaterThan(Double value) {
            addCriterion("ec_factors >", value, "ecFactors");
            return (Criteria) this;
        }

        public Criteria andEcFactorsGreaterThanOrEqualTo(Double value) {
            addCriterion("ec_factors >=", value, "ecFactors");
            return (Criteria) this;
        }

        public Criteria andEcFactorsLessThan(Double value) {
            addCriterion("ec_factors <", value, "ecFactors");
            return (Criteria) this;
        }

        public Criteria andEcFactorsLessThanOrEqualTo(Double value) {
            addCriterion("ec_factors <=", value, "ecFactors");
            return (Criteria) this;
        }

        public Criteria andEcFactorsIn(List<Double> values) {
            addCriterion("ec_factors in", values, "ecFactors");
            return (Criteria) this;
        }

        public Criteria andEcFactorsNotIn(List<Double> values) {
            addCriterion("ec_factors not in", values, "ecFactors");
            return (Criteria) this;
        }

        public Criteria andEcFactorsBetween(Double value1, Double value2) {
            addCriterion("ec_factors between", value1, value2, "ecFactors");
            return (Criteria) this;
        }

        public Criteria andEcFactorsNotBetween(Double value1, Double value2) {
            addCriterion("ec_factors not between", value1, value2, "ecFactors");
            return (Criteria) this;
        }

        public Criteria andSo2FactorsIsNull() {
            addCriterion("so2_factors is null");
            return (Criteria) this;
        }

        public Criteria andSo2FactorsIsNotNull() {
            addCriterion("so2_factors is not null");
            return (Criteria) this;
        }

        public Criteria andSo2FactorsEqualTo(Double value) {
            addCriterion("so2_factors =", value, "so2Factors");
            return (Criteria) this;
        }

        public Criteria andSo2FactorsNotEqualTo(Double value) {
            addCriterion("so2_factors <>", value, "so2Factors");
            return (Criteria) this;
        }

        public Criteria andSo2FactorsGreaterThan(Double value) {
            addCriterion("so2_factors >", value, "so2Factors");
            return (Criteria) this;
        }

        public Criteria andSo2FactorsGreaterThanOrEqualTo(Double value) {
            addCriterion("so2_factors >=", value, "so2Factors");
            return (Criteria) this;
        }

        public Criteria andSo2FactorsLessThan(Double value) {
            addCriterion("so2_factors <", value, "so2Factors");
            return (Criteria) this;
        }

        public Criteria andSo2FactorsLessThanOrEqualTo(Double value) {
            addCriterion("so2_factors <=", value, "so2Factors");
            return (Criteria) this;
        }

        public Criteria andSo2FactorsIn(List<Double> values) {
            addCriterion("so2_factors in", values, "so2Factors");
            return (Criteria) this;
        }

        public Criteria andSo2FactorsNotIn(List<Double> values) {
            addCriterion("so2_factors not in", values, "so2Factors");
            return (Criteria) this;
        }

        public Criteria andSo2FactorsBetween(Double value1, Double value2) {
            addCriterion("so2_factors between", value1, value2, "so2Factors");
            return (Criteria) this;
        }

        public Criteria andSo2FactorsNotBetween(Double value1, Double value2) {
            addCriterion("so2_factors not between", value1, value2, "so2Factors");
            return (Criteria) this;
        }

        public Criteria andNoxFactorsIsNull() {
            addCriterion("nox_factors is null");
            return (Criteria) this;
        }

        public Criteria andNoxFactorsIsNotNull() {
            addCriterion("nox_factors is not null");
            return (Criteria) this;
        }

        public Criteria andNoxFactorsEqualTo(Double value) {
            addCriterion("nox_factors =", value, "noxFactors");
            return (Criteria) this;
        }

        public Criteria andNoxFactorsNotEqualTo(Double value) {
            addCriterion("nox_factors <>", value, "noxFactors");
            return (Criteria) this;
        }

        public Criteria andNoxFactorsGreaterThan(Double value) {
            addCriterion("nox_factors >", value, "noxFactors");
            return (Criteria) this;
        }

        public Criteria andNoxFactorsGreaterThanOrEqualTo(Double value) {
            addCriterion("nox_factors >=", value, "noxFactors");
            return (Criteria) this;
        }

        public Criteria andNoxFactorsLessThan(Double value) {
            addCriterion("nox_factors <", value, "noxFactors");
            return (Criteria) this;
        }

        public Criteria andNoxFactorsLessThanOrEqualTo(Double value) {
            addCriterion("nox_factors <=", value, "noxFactors");
            return (Criteria) this;
        }

        public Criteria andNoxFactorsIn(List<Double> values) {
            addCriterion("nox_factors in", values, "noxFactors");
            return (Criteria) this;
        }

        public Criteria andNoxFactorsNotIn(List<Double> values) {
            addCriterion("nox_factors not in", values, "noxFactors");
            return (Criteria) this;
        }

        public Criteria andNoxFactorsBetween(Double value1, Double value2) {
            addCriterion("nox_factors between", value1, value2, "noxFactors");
            return (Criteria) this;
        }

        public Criteria andNoxFactorsNotBetween(Double value1, Double value2) {
            addCriterion("nox_factors not between", value1, value2, "noxFactors");
            return (Criteria) this;
        }

        public Criteria andCoFactorsIsNull() {
            addCriterion("co_factors is null");
            return (Criteria) this;
        }

        public Criteria andCoFactorsIsNotNull() {
            addCriterion("co_factors is not null");
            return (Criteria) this;
        }

        public Criteria andCoFactorsEqualTo(Double value) {
            addCriterion("co_factors =", value, "coFactors");
            return (Criteria) this;
        }

        public Criteria andCoFactorsNotEqualTo(Double value) {
            addCriterion("co_factors <>", value, "coFactors");
            return (Criteria) this;
        }

        public Criteria andCoFactorsGreaterThan(Double value) {
            addCriterion("co_factors >", value, "coFactors");
            return (Criteria) this;
        }

        public Criteria andCoFactorsGreaterThanOrEqualTo(Double value) {
            addCriterion("co_factors >=", value, "coFactors");
            return (Criteria) this;
        }

        public Criteria andCoFactorsLessThan(Double value) {
            addCriterion("co_factors <", value, "coFactors");
            return (Criteria) this;
        }

        public Criteria andCoFactorsLessThanOrEqualTo(Double value) {
            addCriterion("co_factors <=", value, "coFactors");
            return (Criteria) this;
        }

        public Criteria andCoFactorsIn(List<Double> values) {
            addCriterion("co_factors in", values, "coFactors");
            return (Criteria) this;
        }

        public Criteria andCoFactorsNotIn(List<Double> values) {
            addCriterion("co_factors not in", values, "coFactors");
            return (Criteria) this;
        }

        public Criteria andCoFactorsBetween(Double value1, Double value2) {
            addCriterion("co_factors between", value1, value2, "coFactors");
            return (Criteria) this;
        }

        public Criteria andCoFactorsNotBetween(Double value1, Double value2) {
            addCriterion("co_factors not between", value1, value2, "coFactors");
            return (Criteria) this;
        }

        public Criteria andNh3FactorsIsNull() {
            addCriterion("nh3_factors is null");
            return (Criteria) this;
        }

        public Criteria andNh3FactorsIsNotNull() {
            addCriterion("nh3_factors is not null");
            return (Criteria) this;
        }

        public Criteria andNh3FactorsEqualTo(Double value) {
            addCriterion("nh3_factors =", value, "nh3Factors");
            return (Criteria) this;
        }

        public Criteria andNh3FactorsNotEqualTo(Double value) {
            addCriterion("nh3_factors <>", value, "nh3Factors");
            return (Criteria) this;
        }

        public Criteria andNh3FactorsGreaterThan(Double value) {
            addCriterion("nh3_factors >", value, "nh3Factors");
            return (Criteria) this;
        }

        public Criteria andNh3FactorsGreaterThanOrEqualTo(Double value) {
            addCriterion("nh3_factors >=", value, "nh3Factors");
            return (Criteria) this;
        }

        public Criteria andNh3FactorsLessThan(Double value) {
            addCriterion("nh3_factors <", value, "nh3Factors");
            return (Criteria) this;
        }

        public Criteria andNh3FactorsLessThanOrEqualTo(Double value) {
            addCriterion("nh3_factors <=", value, "nh3Factors");
            return (Criteria) this;
        }

        public Criteria andNh3FactorsIn(List<Double> values) {
            addCriterion("nh3_factors in", values, "nh3Factors");
            return (Criteria) this;
        }

        public Criteria andNh3FactorsNotIn(List<Double> values) {
            addCriterion("nh3_factors not in", values, "nh3Factors");
            return (Criteria) this;
        }

        public Criteria andNh3FactorsBetween(Double value1, Double value2) {
            addCriterion("nh3_factors between", value1, value2, "nh3Factors");
            return (Criteria) this;
        }

        public Criteria andNh3FactorsNotBetween(Double value1, Double value2) {
            addCriterion("nh3_factors not between", value1, value2, "nh3Factors");
            return (Criteria) this;
        }

        public Criteria andVocsFactorsIsNull() {
            addCriterion("vocs_factors is null");
            return (Criteria) this;
        }

        public Criteria andVocsFactorsIsNotNull() {
            addCriterion("vocs_factors is not null");
            return (Criteria) this;
        }

        public Criteria andVocsFactorsEqualTo(Double value) {
            addCriterion("vocs_factors =", value, "vocsFactors");
            return (Criteria) this;
        }

        public Criteria andVocsFactorsNotEqualTo(Double value) {
            addCriterion("vocs_factors <>", value, "vocsFactors");
            return (Criteria) this;
        }

        public Criteria andVocsFactorsGreaterThan(Double value) {
            addCriterion("vocs_factors >", value, "vocsFactors");
            return (Criteria) this;
        }

        public Criteria andVocsFactorsGreaterThanOrEqualTo(Double value) {
            addCriterion("vocs_factors >=", value, "vocsFactors");
            return (Criteria) this;
        }

        public Criteria andVocsFactorsLessThan(Double value) {
            addCriterion("vocs_factors <", value, "vocsFactors");
            return (Criteria) this;
        }

        public Criteria andVocsFactorsLessThanOrEqualTo(Double value) {
            addCriterion("vocs_factors <=", value, "vocsFactors");
            return (Criteria) this;
        }

        public Criteria andVocsFactorsIn(List<Double> values) {
            addCriterion("vocs_factors in", values, "vocsFactors");
            return (Criteria) this;
        }

        public Criteria andVocsFactorsNotIn(List<Double> values) {
            addCriterion("vocs_factors not in", values, "vocsFactors");
            return (Criteria) this;
        }

        public Criteria andVocsFactorsBetween(Double value1, Double value2) {
            addCriterion("vocs_factors between", value1, value2, "vocsFactors");
            return (Criteria) this;
        }

        public Criteria andVocsFactorsNotBetween(Double value1, Double value2) {
            addCriterion("vocs_factors not between", value1, value2, "vocsFactors");
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

        public Criteria andEcEmissionIsNull() {
            addCriterion("ec_emission is null");
            return (Criteria) this;
        }

        public Criteria andEcEmissionIsNotNull() {
            addCriterion("ec_emission is not null");
            return (Criteria) this;
        }

        public Criteria andEcEmissionEqualTo(Double value) {
            addCriterion("ec_emission =", value, "ecEmission");
            return (Criteria) this;
        }

        public Criteria andEcEmissionNotEqualTo(Double value) {
            addCriterion("ec_emission <>", value, "ecEmission");
            return (Criteria) this;
        }

        public Criteria andEcEmissionGreaterThan(Double value) {
            addCriterion("ec_emission >", value, "ecEmission");
            return (Criteria) this;
        }

        public Criteria andEcEmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("ec_emission >=", value, "ecEmission");
            return (Criteria) this;
        }

        public Criteria andEcEmissionLessThan(Double value) {
            addCriterion("ec_emission <", value, "ecEmission");
            return (Criteria) this;
        }

        public Criteria andEcEmissionLessThanOrEqualTo(Double value) {
            addCriterion("ec_emission <=", value, "ecEmission");
            return (Criteria) this;
        }

        public Criteria andEcEmissionIn(List<Double> values) {
            addCriterion("ec_emission in", values, "ecEmission");
            return (Criteria) this;
        }

        public Criteria andEcEmissionNotIn(List<Double> values) {
            addCriterion("ec_emission not in", values, "ecEmission");
            return (Criteria) this;
        }

        public Criteria andEcEmissionBetween(Double value1, Double value2) {
            addCriterion("ec_emission between", value1, value2, "ecEmission");
            return (Criteria) this;
        }

        public Criteria andEcEmissionNotBetween(Double value1, Double value2) {
            addCriterion("ec_emission not between", value1, value2, "ecEmission");
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

        public Criteria andVocsEmissionIsNull() {
            addCriterion("vocs_emission is null");
            return (Criteria) this;
        }

        public Criteria andVocsEmissionIsNotNull() {
            addCriterion("vocs_emission is not null");
            return (Criteria) this;
        }

        public Criteria andVocsEmissionEqualTo(Double value) {
            addCriterion("vocs_emission =", value, "vocsEmission");
            return (Criteria) this;
        }

        public Criteria andVocsEmissionNotEqualTo(Double value) {
            addCriterion("vocs_emission <>", value, "vocsEmission");
            return (Criteria) this;
        }

        public Criteria andVocsEmissionGreaterThan(Double value) {
            addCriterion("vocs_emission >", value, "vocsEmission");
            return (Criteria) this;
        }

        public Criteria andVocsEmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("vocs_emission >=", value, "vocsEmission");
            return (Criteria) this;
        }

        public Criteria andVocsEmissionLessThan(Double value) {
            addCriterion("vocs_emission <", value, "vocsEmission");
            return (Criteria) this;
        }

        public Criteria andVocsEmissionLessThanOrEqualTo(Double value) {
            addCriterion("vocs_emission <=", value, "vocsEmission");
            return (Criteria) this;
        }

        public Criteria andVocsEmissionIn(List<Double> values) {
            addCriterion("vocs_emission in", values, "vocsEmission");
            return (Criteria) this;
        }

        public Criteria andVocsEmissionNotIn(List<Double> values) {
            addCriterion("vocs_emission not in", values, "vocsEmission");
            return (Criteria) this;
        }

        public Criteria andVocsEmissionBetween(Double value1, Double value2) {
            addCriterion("vocs_emission between", value1, value2, "vocsEmission");
            return (Criteria) this;
        }

        public Criteria andVocsEmissionNotBetween(Double value1, Double value2) {
            addCriterion("vocs_emission not between", value1, value2, "vocsEmission");
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