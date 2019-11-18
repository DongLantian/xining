package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class ExhaustExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExhaustExample() {
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

        public Criteria andExfIdIsNull() {
            addCriterion("EXF_ID is null");
            return (Criteria) this;
        }

        public Criteria andExfIdIsNotNull() {
            addCriterion("EXF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExfIdEqualTo(Integer value) {
            addCriterion("EXF_ID =", value, "exfId");
            return (Criteria) this;
        }

        public Criteria andExfIdNotEqualTo(Integer value) {
            addCriterion("EXF_ID <>", value, "exfId");
            return (Criteria) this;
        }

        public Criteria andExfIdGreaterThan(Integer value) {
            addCriterion("EXF_ID >", value, "exfId");
            return (Criteria) this;
        }

        public Criteria andExfIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXF_ID >=", value, "exfId");
            return (Criteria) this;
        }

        public Criteria andExfIdLessThan(Integer value) {
            addCriterion("EXF_ID <", value, "exfId");
            return (Criteria) this;
        }

        public Criteria andExfIdLessThanOrEqualTo(Integer value) {
            addCriterion("EXF_ID <=", value, "exfId");
            return (Criteria) this;
        }

        public Criteria andExfIdIn(List<Integer> values) {
            addCriterion("EXF_ID in", values, "exfId");
            return (Criteria) this;
        }

        public Criteria andExfIdNotIn(List<Integer> values) {
            addCriterion("EXF_ID not in", values, "exfId");
            return (Criteria) this;
        }

        public Criteria andExfIdBetween(Integer value1, Integer value2) {
            addCriterion("EXF_ID between", value1, value2, "exfId");
            return (Criteria) this;
        }

        public Criteria andExfIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EXF_ID not between", value1, value2, "exfId");
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

        public Criteria andExfMaterialIsNull() {
            addCriterion("EXF_MATERIAL is null");
            return (Criteria) this;
        }

        public Criteria andExfMaterialIsNotNull() {
            addCriterion("EXF_MATERIAL is not null");
            return (Criteria) this;
        }

        public Criteria andExfMaterialEqualTo(String value) {
            addCriterion("EXF_MATERIAL =", value, "exfMaterial");
            return (Criteria) this;
        }

        public Criteria andExfMaterialNotEqualTo(String value) {
            addCriterion("EXF_MATERIAL <>", value, "exfMaterial");
            return (Criteria) this;
        }

        public Criteria andExfMaterialGreaterThan(String value) {
            addCriterion("EXF_MATERIAL >", value, "exfMaterial");
            return (Criteria) this;
        }

        public Criteria andExfMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("EXF_MATERIAL >=", value, "exfMaterial");
            return (Criteria) this;
        }

        public Criteria andExfMaterialLessThan(String value) {
            addCriterion("EXF_MATERIAL <", value, "exfMaterial");
            return (Criteria) this;
        }

        public Criteria andExfMaterialLessThanOrEqualTo(String value) {
            addCriterion("EXF_MATERIAL <=", value, "exfMaterial");
            return (Criteria) this;
        }

        public Criteria andExfMaterialLike(String value) {
            addCriterion("EXF_MATERIAL like", value, "exfMaterial");
            return (Criteria) this;
        }

        public Criteria andExfMaterialNotLike(String value) {
            addCriterion("EXF_MATERIAL not like", value, "exfMaterial");
            return (Criteria) this;
        }

        public Criteria andExfMaterialIn(List<String> values) {
            addCriterion("EXF_MATERIAL in", values, "exfMaterial");
            return (Criteria) this;
        }

        public Criteria andExfMaterialNotIn(List<String> values) {
            addCriterion("EXF_MATERIAL not in", values, "exfMaterial");
            return (Criteria) this;
        }

        public Criteria andExfMaterialBetween(String value1, String value2) {
            addCriterion("EXF_MATERIAL between", value1, value2, "exfMaterial");
            return (Criteria) this;
        }

        public Criteria andExfMaterialNotBetween(String value1, String value2) {
            addCriterion("EXF_MATERIAL not between", value1, value2, "exfMaterial");
            return (Criteria) this;
        }

        public Criteria andExfHeightIsNull() {
            addCriterion("EXF_HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andExfHeightIsNotNull() {
            addCriterion("EXF_HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andExfHeightEqualTo(Double value) {
            addCriterion("EXF_HEIGHT =", value, "exfHeight");
            return (Criteria) this;
        }

        public Criteria andExfHeightNotEqualTo(Double value) {
            addCriterion("EXF_HEIGHT <>", value, "exfHeight");
            return (Criteria) this;
        }

        public Criteria andExfHeightGreaterThan(Double value) {
            addCriterion("EXF_HEIGHT >", value, "exfHeight");
            return (Criteria) this;
        }

        public Criteria andExfHeightGreaterThanOrEqualTo(Double value) {
            addCriterion("EXF_HEIGHT >=", value, "exfHeight");
            return (Criteria) this;
        }

        public Criteria andExfHeightLessThan(Double value) {
            addCriterion("EXF_HEIGHT <", value, "exfHeight");
            return (Criteria) this;
        }

        public Criteria andExfHeightLessThanOrEqualTo(Double value) {
            addCriterion("EXF_HEIGHT <=", value, "exfHeight");
            return (Criteria) this;
        }

        public Criteria andExfHeightIn(List<Double> values) {
            addCriterion("EXF_HEIGHT in", values, "exfHeight");
            return (Criteria) this;
        }

        public Criteria andExfHeightNotIn(List<Double> values) {
            addCriterion("EXF_HEIGHT not in", values, "exfHeight");
            return (Criteria) this;
        }

        public Criteria andExfHeightBetween(Double value1, Double value2) {
            addCriterion("EXF_HEIGHT between", value1, value2, "exfHeight");
            return (Criteria) this;
        }

        public Criteria andExfHeightNotBetween(Double value1, Double value2) {
            addCriterion("EXF_HEIGHT not between", value1, value2, "exfHeight");
            return (Criteria) this;
        }

        public Criteria andSmokeOutdIsNull() {
            addCriterion("SMOKE_OUTD is null");
            return (Criteria) this;
        }

        public Criteria andSmokeOutdIsNotNull() {
            addCriterion("SMOKE_OUTD is not null");
            return (Criteria) this;
        }

        public Criteria andSmokeOutdEqualTo(Double value) {
            addCriterion("SMOKE_OUTD =", value, "smokeOutd");
            return (Criteria) this;
        }

        public Criteria andSmokeOutdNotEqualTo(Double value) {
            addCriterion("SMOKE_OUTD <>", value, "smokeOutd");
            return (Criteria) this;
        }

        public Criteria andSmokeOutdGreaterThan(Double value) {
            addCriterion("SMOKE_OUTD >", value, "smokeOutd");
            return (Criteria) this;
        }

        public Criteria andSmokeOutdGreaterThanOrEqualTo(Double value) {
            addCriterion("SMOKE_OUTD >=", value, "smokeOutd");
            return (Criteria) this;
        }

        public Criteria andSmokeOutdLessThan(Double value) {
            addCriterion("SMOKE_OUTD <", value, "smokeOutd");
            return (Criteria) this;
        }

        public Criteria andSmokeOutdLessThanOrEqualTo(Double value) {
            addCriterion("SMOKE_OUTD <=", value, "smokeOutd");
            return (Criteria) this;
        }

        public Criteria andSmokeOutdIn(List<Double> values) {
            addCriterion("SMOKE_OUTD in", values, "smokeOutd");
            return (Criteria) this;
        }

        public Criteria andSmokeOutdNotIn(List<Double> values) {
            addCriterion("SMOKE_OUTD not in", values, "smokeOutd");
            return (Criteria) this;
        }

        public Criteria andSmokeOutdBetween(Double value1, Double value2) {
            addCriterion("SMOKE_OUTD between", value1, value2, "smokeOutd");
            return (Criteria) this;
        }

        public Criteria andSmokeOutdNotBetween(Double value1, Double value2) {
            addCriterion("SMOKE_OUTD not between", value1, value2, "smokeOutd");
            return (Criteria) this;
        }

        public Criteria andSmokeOUtteMIsNull() {
            addCriterion("SMOKE_O_UTTE_M is null");
            return (Criteria) this;
        }

        public Criteria andSmokeOUtteMIsNotNull() {
            addCriterion("SMOKE_O_UTTE_M is not null");
            return (Criteria) this;
        }

        public Criteria andSmokeOUtteMEqualTo(Double value) {
            addCriterion("SMOKE_O_UTTE_M =", value, "smokeOUtteM");
            return (Criteria) this;
        }

        public Criteria andSmokeOUtteMNotEqualTo(Double value) {
            addCriterion("SMOKE_O_UTTE_M <>", value, "smokeOUtteM");
            return (Criteria) this;
        }

        public Criteria andSmokeOUtteMGreaterThan(Double value) {
            addCriterion("SMOKE_O_UTTE_M >", value, "smokeOUtteM");
            return (Criteria) this;
        }

        public Criteria andSmokeOUtteMGreaterThanOrEqualTo(Double value) {
            addCriterion("SMOKE_O_UTTE_M >=", value, "smokeOUtteM");
            return (Criteria) this;
        }

        public Criteria andSmokeOUtteMLessThan(Double value) {
            addCriterion("SMOKE_O_UTTE_M <", value, "smokeOUtteM");
            return (Criteria) this;
        }

        public Criteria andSmokeOUtteMLessThanOrEqualTo(Double value) {
            addCriterion("SMOKE_O_UTTE_M <=", value, "smokeOUtteM");
            return (Criteria) this;
        }

        public Criteria andSmokeOUtteMIn(List<Double> values) {
            addCriterion("SMOKE_O_UTTE_M in", values, "smokeOUtteM");
            return (Criteria) this;
        }

        public Criteria andSmokeOUtteMNotIn(List<Double> values) {
            addCriterion("SMOKE_O_UTTE_M not in", values, "smokeOUtteM");
            return (Criteria) this;
        }

        public Criteria andSmokeOUtteMBetween(Double value1, Double value2) {
            addCriterion("SMOKE_O_UTTE_M between", value1, value2, "smokeOUtteM");
            return (Criteria) this;
        }

        public Criteria andSmokeOUtteMNotBetween(Double value1, Double value2) {
            addCriterion("SMOKE_O_UTTE_M not between", value1, value2, "smokeOUtteM");
            return (Criteria) this;
        }

        public Criteria andSmokeOutaIsNull() {
            addCriterion("SMOKE_OUTA is null");
            return (Criteria) this;
        }

        public Criteria andSmokeOutaIsNotNull() {
            addCriterion("SMOKE_OUTA is not null");
            return (Criteria) this;
        }

        public Criteria andSmokeOutaEqualTo(Double value) {
            addCriterion("SMOKE_OUTA =", value, "smokeOuta");
            return (Criteria) this;
        }

        public Criteria andSmokeOutaNotEqualTo(Double value) {
            addCriterion("SMOKE_OUTA <>", value, "smokeOuta");
            return (Criteria) this;
        }

        public Criteria andSmokeOutaGreaterThan(Double value) {
            addCriterion("SMOKE_OUTA >", value, "smokeOuta");
            return (Criteria) this;
        }

        public Criteria andSmokeOutaGreaterThanOrEqualTo(Double value) {
            addCriterion("SMOKE_OUTA >=", value, "smokeOuta");
            return (Criteria) this;
        }

        public Criteria andSmokeOutaLessThan(Double value) {
            addCriterion("SMOKE_OUTA <", value, "smokeOuta");
            return (Criteria) this;
        }

        public Criteria andSmokeOutaLessThanOrEqualTo(Double value) {
            addCriterion("SMOKE_OUTA <=", value, "smokeOuta");
            return (Criteria) this;
        }

        public Criteria andSmokeOutaIn(List<Double> values) {
            addCriterion("SMOKE_OUTA in", values, "smokeOuta");
            return (Criteria) this;
        }

        public Criteria andSmokeOutaNotIn(List<Double> values) {
            addCriterion("SMOKE_OUTA not in", values, "smokeOuta");
            return (Criteria) this;
        }

        public Criteria andSmokeOutaBetween(Double value1, Double value2) {
            addCriterion("SMOKE_OUTA between", value1, value2, "smokeOuta");
            return (Criteria) this;
        }

        public Criteria andSmokeOutaNotBetween(Double value1, Double value2) {
            addCriterion("SMOKE_OUTA not between", value1, value2, "smokeOuta");
            return (Criteria) this;
        }

        public Criteria andSmokeOutvIsNull() {
            addCriterion("SMOKE_OUTV is null");
            return (Criteria) this;
        }

        public Criteria andSmokeOutvIsNotNull() {
            addCriterion("SMOKE_OUTV is not null");
            return (Criteria) this;
        }

        public Criteria andSmokeOutvEqualTo(Double value) {
            addCriterion("SMOKE_OUTV =", value, "smokeOutv");
            return (Criteria) this;
        }

        public Criteria andSmokeOutvNotEqualTo(Double value) {
            addCriterion("SMOKE_OUTV <>", value, "smokeOutv");
            return (Criteria) this;
        }

        public Criteria andSmokeOutvGreaterThan(Double value) {
            addCriterion("SMOKE_OUTV >", value, "smokeOutv");
            return (Criteria) this;
        }

        public Criteria andSmokeOutvGreaterThanOrEqualTo(Double value) {
            addCriterion("SMOKE_OUTV >=", value, "smokeOutv");
            return (Criteria) this;
        }

        public Criteria andSmokeOutvLessThan(Double value) {
            addCriterion("SMOKE_OUTV <", value, "smokeOutv");
            return (Criteria) this;
        }

        public Criteria andSmokeOutvLessThanOrEqualTo(Double value) {
            addCriterion("SMOKE_OUTV <=", value, "smokeOutv");
            return (Criteria) this;
        }

        public Criteria andSmokeOutvIn(List<Double> values) {
            addCriterion("SMOKE_OUTV in", values, "smokeOutv");
            return (Criteria) this;
        }

        public Criteria andSmokeOutvNotIn(List<Double> values) {
            addCriterion("SMOKE_OUTV not in", values, "smokeOutv");
            return (Criteria) this;
        }

        public Criteria andSmokeOutvBetween(Double value1, Double value2) {
            addCriterion("SMOKE_OUTV between", value1, value2, "smokeOutv");
            return (Criteria) this;
        }

        public Criteria andSmokeOutvNotBetween(Double value1, Double value2) {
            addCriterion("SMOKE_OUTV not between", value1, value2, "smokeOutv");
            return (Criteria) this;
        }

        public Criteria andExfLongitudeIsNull() {
            addCriterion("EXF_LONGITUDE is null");
            return (Criteria) this;
        }

        public Criteria andExfLongitudeIsNotNull() {
            addCriterion("EXF_LONGITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andExfLongitudeEqualTo(Double value) {
            addCriterion("EXF_LONGITUDE =", value, "exfLongitude");
            return (Criteria) this;
        }

        public Criteria andExfLongitudeNotEqualTo(Double value) {
            addCriterion("EXF_LONGITUDE <>", value, "exfLongitude");
            return (Criteria) this;
        }

        public Criteria andExfLongitudeGreaterThan(Double value) {
            addCriterion("EXF_LONGITUDE >", value, "exfLongitude");
            return (Criteria) this;
        }

        public Criteria andExfLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("EXF_LONGITUDE >=", value, "exfLongitude");
            return (Criteria) this;
        }

        public Criteria andExfLongitudeLessThan(Double value) {
            addCriterion("EXF_LONGITUDE <", value, "exfLongitude");
            return (Criteria) this;
        }

        public Criteria andExfLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("EXF_LONGITUDE <=", value, "exfLongitude");
            return (Criteria) this;
        }

        public Criteria andExfLongitudeIn(List<Double> values) {
            addCriterion("EXF_LONGITUDE in", values, "exfLongitude");
            return (Criteria) this;
        }

        public Criteria andExfLongitudeNotIn(List<Double> values) {
            addCriterion("EXF_LONGITUDE not in", values, "exfLongitude");
            return (Criteria) this;
        }

        public Criteria andExfLongitudeBetween(Double value1, Double value2) {
            addCriterion("EXF_LONGITUDE between", value1, value2, "exfLongitude");
            return (Criteria) this;
        }

        public Criteria andExfLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("EXF_LONGITUDE not between", value1, value2, "exfLongitude");
            return (Criteria) this;
        }

        public Criteria andExfLatitudeIsNull() {
            addCriterion("EXF_LATITUDE is null");
            return (Criteria) this;
        }

        public Criteria andExfLatitudeIsNotNull() {
            addCriterion("EXF_LATITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andExfLatitudeEqualTo(Double value) {
            addCriterion("EXF_LATITUDE =", value, "exfLatitude");
            return (Criteria) this;
        }

        public Criteria andExfLatitudeNotEqualTo(Double value) {
            addCriterion("EXF_LATITUDE <>", value, "exfLatitude");
            return (Criteria) this;
        }

        public Criteria andExfLatitudeGreaterThan(Double value) {
            addCriterion("EXF_LATITUDE >", value, "exfLatitude");
            return (Criteria) this;
        }

        public Criteria andExfLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("EXF_LATITUDE >=", value, "exfLatitude");
            return (Criteria) this;
        }

        public Criteria andExfLatitudeLessThan(Double value) {
            addCriterion("EXF_LATITUDE <", value, "exfLatitude");
            return (Criteria) this;
        }

        public Criteria andExfLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("EXF_LATITUDE <=", value, "exfLatitude");
            return (Criteria) this;
        }

        public Criteria andExfLatitudeIn(List<Double> values) {
            addCriterion("EXF_LATITUDE in", values, "exfLatitude");
            return (Criteria) this;
        }

        public Criteria andExfLatitudeNotIn(List<Double> values) {
            addCriterion("EXF_LATITUDE not in", values, "exfLatitude");
            return (Criteria) this;
        }

        public Criteria andExfLatitudeBetween(Double value1, Double value2) {
            addCriterion("EXF_LATITUDE between", value1, value2, "exfLatitude");
            return (Criteria) this;
        }

        public Criteria andExfLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("EXF_LATITUDE not between", value1, value2, "exfLatitude");
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