package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class ExhaustTempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExhaustTempExample() {
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

        public Criteria andExfNoIsNull() {
            addCriterion("EXF_NO is null");
            return (Criteria) this;
        }

        public Criteria andExfNoIsNotNull() {
            addCriterion("EXF_NO is not null");
            return (Criteria) this;
        }

        public Criteria andExfNoEqualTo(String value) {
            addCriterion("EXF_NO =", value, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoNotEqualTo(String value) {
            addCriterion("EXF_NO <>", value, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoGreaterThan(String value) {
            addCriterion("EXF_NO >", value, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoGreaterThanOrEqualTo(String value) {
            addCriterion("EXF_NO >=", value, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoLessThan(String value) {
            addCriterion("EXF_NO <", value, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoLessThanOrEqualTo(String value) {
            addCriterion("EXF_NO <=", value, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoLike(String value) {
            addCriterion("EXF_NO like", value, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoNotLike(String value) {
            addCriterion("EXF_NO not like", value, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoIn(List<String> values) {
            addCriterion("EXF_NO in", values, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoNotIn(List<String> values) {
            addCriterion("EXF_NO not in", values, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoBetween(String value1, String value2) {
            addCriterion("EXF_NO between", value1, value2, "exfNo");
            return (Criteria) this;
        }

        public Criteria andExfNoNotBetween(String value1, String value2) {
            addCriterion("EXF_NO not between", value1, value2, "exfNo");
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

        public Criteria andExfPm10IsNull() {
            addCriterion("EXF_PM10 is null");
            return (Criteria) this;
        }

        public Criteria andExfPm10IsNotNull() {
            addCriterion("EXF_PM10 is not null");
            return (Criteria) this;
        }

        public Criteria andExfPm10EqualTo(Double value) {
            addCriterion("EXF_PM10 =", value, "exfPm10");
            return (Criteria) this;
        }

        public Criteria andExfPm10NotEqualTo(Double value) {
            addCriterion("EXF_PM10 <>", value, "exfPm10");
            return (Criteria) this;
        }

        public Criteria andExfPm10GreaterThan(Double value) {
            addCriterion("EXF_PM10 >", value, "exfPm10");
            return (Criteria) this;
        }

        public Criteria andExfPm10GreaterThanOrEqualTo(Double value) {
            addCriterion("EXF_PM10 >=", value, "exfPm10");
            return (Criteria) this;
        }

        public Criteria andExfPm10LessThan(Double value) {
            addCriterion("EXF_PM10 <", value, "exfPm10");
            return (Criteria) this;
        }

        public Criteria andExfPm10LessThanOrEqualTo(Double value) {
            addCriterion("EXF_PM10 <=", value, "exfPm10");
            return (Criteria) this;
        }

        public Criteria andExfPm10In(List<Double> values) {
            addCriterion("EXF_PM10 in", values, "exfPm10");
            return (Criteria) this;
        }

        public Criteria andExfPm10NotIn(List<Double> values) {
            addCriterion("EXF_PM10 not in", values, "exfPm10");
            return (Criteria) this;
        }

        public Criteria andExfPm10Between(Double value1, Double value2) {
            addCriterion("EXF_PM10 between", value1, value2, "exfPm10");
            return (Criteria) this;
        }

        public Criteria andExfPm10NotBetween(Double value1, Double value2) {
            addCriterion("EXF_PM10 not between", value1, value2, "exfPm10");
            return (Criteria) this;
        }

        public Criteria andExfPm25IsNull() {
            addCriterion("EXF_PM25 is null");
            return (Criteria) this;
        }

        public Criteria andExfPm25IsNotNull() {
            addCriterion("EXF_PM25 is not null");
            return (Criteria) this;
        }

        public Criteria andExfPm25EqualTo(Double value) {
            addCriterion("EXF_PM25 =", value, "exfPm25");
            return (Criteria) this;
        }

        public Criteria andExfPm25NotEqualTo(Double value) {
            addCriterion("EXF_PM25 <>", value, "exfPm25");
            return (Criteria) this;
        }

        public Criteria andExfPm25GreaterThan(Double value) {
            addCriterion("EXF_PM25 >", value, "exfPm25");
            return (Criteria) this;
        }

        public Criteria andExfPm25GreaterThanOrEqualTo(Double value) {
            addCriterion("EXF_PM25 >=", value, "exfPm25");
            return (Criteria) this;
        }

        public Criteria andExfPm25LessThan(Double value) {
            addCriterion("EXF_PM25 <", value, "exfPm25");
            return (Criteria) this;
        }

        public Criteria andExfPm25LessThanOrEqualTo(Double value) {
            addCriterion("EXF_PM25 <=", value, "exfPm25");
            return (Criteria) this;
        }

        public Criteria andExfPm25In(List<Double> values) {
            addCriterion("EXF_PM25 in", values, "exfPm25");
            return (Criteria) this;
        }

        public Criteria andExfPm25NotIn(List<Double> values) {
            addCriterion("EXF_PM25 not in", values, "exfPm25");
            return (Criteria) this;
        }

        public Criteria andExfPm25Between(Double value1, Double value2) {
            addCriterion("EXF_PM25 between", value1, value2, "exfPm25");
            return (Criteria) this;
        }

        public Criteria andExfPm25NotBetween(Double value1, Double value2) {
            addCriterion("EXF_PM25 not between", value1, value2, "exfPm25");
            return (Criteria) this;
        }

        public Criteria andExfCoIsNull() {
            addCriterion("EXF_CO is null");
            return (Criteria) this;
        }

        public Criteria andExfCoIsNotNull() {
            addCriterion("EXF_CO is not null");
            return (Criteria) this;
        }

        public Criteria andExfCoEqualTo(Double value) {
            addCriterion("EXF_CO =", value, "exfCo");
            return (Criteria) this;
        }

        public Criteria andExfCoNotEqualTo(Double value) {
            addCriterion("EXF_CO <>", value, "exfCo");
            return (Criteria) this;
        }

        public Criteria andExfCoGreaterThan(Double value) {
            addCriterion("EXF_CO >", value, "exfCo");
            return (Criteria) this;
        }

        public Criteria andExfCoGreaterThanOrEqualTo(Double value) {
            addCriterion("EXF_CO >=", value, "exfCo");
            return (Criteria) this;
        }

        public Criteria andExfCoLessThan(Double value) {
            addCriterion("EXF_CO <", value, "exfCo");
            return (Criteria) this;
        }

        public Criteria andExfCoLessThanOrEqualTo(Double value) {
            addCriterion("EXF_CO <=", value, "exfCo");
            return (Criteria) this;
        }

        public Criteria andExfCoIn(List<Double> values) {
            addCriterion("EXF_CO in", values, "exfCo");
            return (Criteria) this;
        }

        public Criteria andExfCoNotIn(List<Double> values) {
            addCriterion("EXF_CO not in", values, "exfCo");
            return (Criteria) this;
        }

        public Criteria andExfCoBetween(Double value1, Double value2) {
            addCriterion("EXF_CO between", value1, value2, "exfCo");
            return (Criteria) this;
        }

        public Criteria andExfCoNotBetween(Double value1, Double value2) {
            addCriterion("EXF_CO not between", value1, value2, "exfCo");
            return (Criteria) this;
        }

        public Criteria andExfNh3IsNull() {
            addCriterion("EXF_NH3 is null");
            return (Criteria) this;
        }

        public Criteria andExfNh3IsNotNull() {
            addCriterion("EXF_NH3 is not null");
            return (Criteria) this;
        }

        public Criteria andExfNh3EqualTo(Double value) {
            addCriterion("EXF_NH3 =", value, "exfNh3");
            return (Criteria) this;
        }

        public Criteria andExfNh3NotEqualTo(Double value) {
            addCriterion("EXF_NH3 <>", value, "exfNh3");
            return (Criteria) this;
        }

        public Criteria andExfNh3GreaterThan(Double value) {
            addCriterion("EXF_NH3 >", value, "exfNh3");
            return (Criteria) this;
        }

        public Criteria andExfNh3GreaterThanOrEqualTo(Double value) {
            addCriterion("EXF_NH3 >=", value, "exfNh3");
            return (Criteria) this;
        }

        public Criteria andExfNh3LessThan(Double value) {
            addCriterion("EXF_NH3 <", value, "exfNh3");
            return (Criteria) this;
        }

        public Criteria andExfNh3LessThanOrEqualTo(Double value) {
            addCriterion("EXF_NH3 <=", value, "exfNh3");
            return (Criteria) this;
        }

        public Criteria andExfNh3In(List<Double> values) {
            addCriterion("EXF_NH3 in", values, "exfNh3");
            return (Criteria) this;
        }

        public Criteria andExfNh3NotIn(List<Double> values) {
            addCriterion("EXF_NH3 not in", values, "exfNh3");
            return (Criteria) this;
        }

        public Criteria andExfNh3Between(Double value1, Double value2) {
            addCriterion("EXF_NH3 between", value1, value2, "exfNh3");
            return (Criteria) this;
        }

        public Criteria andExfNh3NotBetween(Double value1, Double value2) {
            addCriterion("EXF_NH3 not between", value1, value2, "exfNh3");
            return (Criteria) this;
        }

        public Criteria andExfVocIsNull() {
            addCriterion("EXF_VOC is null");
            return (Criteria) this;
        }

        public Criteria andExfVocIsNotNull() {
            addCriterion("EXF_VOC is not null");
            return (Criteria) this;
        }

        public Criteria andExfVocEqualTo(Double value) {
            addCriterion("EXF_VOC =", value, "exfVoc");
            return (Criteria) this;
        }

        public Criteria andExfVocNotEqualTo(Double value) {
            addCriterion("EXF_VOC <>", value, "exfVoc");
            return (Criteria) this;
        }

        public Criteria andExfVocGreaterThan(Double value) {
            addCriterion("EXF_VOC >", value, "exfVoc");
            return (Criteria) this;
        }

        public Criteria andExfVocGreaterThanOrEqualTo(Double value) {
            addCriterion("EXF_VOC >=", value, "exfVoc");
            return (Criteria) this;
        }

        public Criteria andExfVocLessThan(Double value) {
            addCriterion("EXF_VOC <", value, "exfVoc");
            return (Criteria) this;
        }

        public Criteria andExfVocLessThanOrEqualTo(Double value) {
            addCriterion("EXF_VOC <=", value, "exfVoc");
            return (Criteria) this;
        }

        public Criteria andExfVocIn(List<Double> values) {
            addCriterion("EXF_VOC in", values, "exfVoc");
            return (Criteria) this;
        }

        public Criteria andExfVocNotIn(List<Double> values) {
            addCriterion("EXF_VOC not in", values, "exfVoc");
            return (Criteria) this;
        }

        public Criteria andExfVocBetween(Double value1, Double value2) {
            addCriterion("EXF_VOC between", value1, value2, "exfVoc");
            return (Criteria) this;
        }

        public Criteria andExfVocNotBetween(Double value1, Double value2) {
            addCriterion("EXF_VOC not between", value1, value2, "exfVoc");
            return (Criteria) this;
        }

        public Criteria andMeasureNh3IsNull() {
            addCriterion("MEASURE_NH3 is null");
            return (Criteria) this;
        }

        public Criteria andMeasureNh3IsNotNull() {
            addCriterion("MEASURE_NH3 is not null");
            return (Criteria) this;
        }

        public Criteria andMeasureNh3EqualTo(Double value) {
            addCriterion("MEASURE_NH3 =", value, "measureNh3");
            return (Criteria) this;
        }

        public Criteria andMeasureNh3NotEqualTo(Double value) {
            addCriterion("MEASURE_NH3 <>", value, "measureNh3");
            return (Criteria) this;
        }

        public Criteria andMeasureNh3GreaterThan(Double value) {
            addCriterion("MEASURE_NH3 >", value, "measureNh3");
            return (Criteria) this;
        }

        public Criteria andMeasureNh3GreaterThanOrEqualTo(Double value) {
            addCriterion("MEASURE_NH3 >=", value, "measureNh3");
            return (Criteria) this;
        }

        public Criteria andMeasureNh3LessThan(Double value) {
            addCriterion("MEASURE_NH3 <", value, "measureNh3");
            return (Criteria) this;
        }

        public Criteria andMeasureNh3LessThanOrEqualTo(Double value) {
            addCriterion("MEASURE_NH3 <=", value, "measureNh3");
            return (Criteria) this;
        }

        public Criteria andMeasureNh3In(List<Double> values) {
            addCriterion("MEASURE_NH3 in", values, "measureNh3");
            return (Criteria) this;
        }

        public Criteria andMeasureNh3NotIn(List<Double> values) {
            addCriterion("MEASURE_NH3 not in", values, "measureNh3");
            return (Criteria) this;
        }

        public Criteria andMeasureNh3Between(Double value1, Double value2) {
            addCriterion("MEASURE_NH3 between", value1, value2, "measureNh3");
            return (Criteria) this;
        }

        public Criteria andMeasureNh3NotBetween(Double value1, Double value2) {
            addCriterion("MEASURE_NH3 not between", value1, value2, "measureNh3");
            return (Criteria) this;
        }

        public Criteria andMeasureNoxIsNull() {
            addCriterion("MEASURE_NOX is null");
            return (Criteria) this;
        }

        public Criteria andMeasureNoxIsNotNull() {
            addCriterion("MEASURE_NOX is not null");
            return (Criteria) this;
        }

        public Criteria andMeasureNoxEqualTo(Double value) {
            addCriterion("MEASURE_NOX =", value, "measureNox");
            return (Criteria) this;
        }

        public Criteria andMeasureNoxNotEqualTo(Double value) {
            addCriterion("MEASURE_NOX <>", value, "measureNox");
            return (Criteria) this;
        }

        public Criteria andMeasureNoxGreaterThan(Double value) {
            addCriterion("MEASURE_NOX >", value, "measureNox");
            return (Criteria) this;
        }

        public Criteria andMeasureNoxGreaterThanOrEqualTo(Double value) {
            addCriterion("MEASURE_NOX >=", value, "measureNox");
            return (Criteria) this;
        }

        public Criteria andMeasureNoxLessThan(Double value) {
            addCriterion("MEASURE_NOX <", value, "measureNox");
            return (Criteria) this;
        }

        public Criteria andMeasureNoxLessThanOrEqualTo(Double value) {
            addCriterion("MEASURE_NOX <=", value, "measureNox");
            return (Criteria) this;
        }

        public Criteria andMeasureNoxIn(List<Double> values) {
            addCriterion("MEASURE_NOX in", values, "measureNox");
            return (Criteria) this;
        }

        public Criteria andMeasureNoxNotIn(List<Double> values) {
            addCriterion("MEASURE_NOX not in", values, "measureNox");
            return (Criteria) this;
        }

        public Criteria andMeasureNoxBetween(Double value1, Double value2) {
            addCriterion("MEASURE_NOX between", value1, value2, "measureNox");
            return (Criteria) this;
        }

        public Criteria andMeasureNoxNotBetween(Double value1, Double value2) {
            addCriterion("MEASURE_NOX not between", value1, value2, "measureNox");
            return (Criteria) this;
        }

        public Criteria andMeasureBcIsNull() {
            addCriterion("MEASURE_BC is null");
            return (Criteria) this;
        }

        public Criteria andMeasureBcIsNotNull() {
            addCriterion("MEASURE_BC is not null");
            return (Criteria) this;
        }

        public Criteria andMeasureBcEqualTo(Double value) {
            addCriterion("MEASURE_BC =", value, "measureBc");
            return (Criteria) this;
        }

        public Criteria andMeasureBcNotEqualTo(Double value) {
            addCriterion("MEASURE_BC <>", value, "measureBc");
            return (Criteria) this;
        }

        public Criteria andMeasureBcGreaterThan(Double value) {
            addCriterion("MEASURE_BC >", value, "measureBc");
            return (Criteria) this;
        }

        public Criteria andMeasureBcGreaterThanOrEqualTo(Double value) {
            addCriterion("MEASURE_BC >=", value, "measureBc");
            return (Criteria) this;
        }

        public Criteria andMeasureBcLessThan(Double value) {
            addCriterion("MEASURE_BC <", value, "measureBc");
            return (Criteria) this;
        }

        public Criteria andMeasureBcLessThanOrEqualTo(Double value) {
            addCriterion("MEASURE_BC <=", value, "measureBc");
            return (Criteria) this;
        }

        public Criteria andMeasureBcIn(List<Double> values) {
            addCriterion("MEASURE_BC in", values, "measureBc");
            return (Criteria) this;
        }

        public Criteria andMeasureBcNotIn(List<Double> values) {
            addCriterion("MEASURE_BC not in", values, "measureBc");
            return (Criteria) this;
        }

        public Criteria andMeasureBcBetween(Double value1, Double value2) {
            addCriterion("MEASURE_BC between", value1, value2, "measureBc");
            return (Criteria) this;
        }

        public Criteria andMeasureBcNotBetween(Double value1, Double value2) {
            addCriterion("MEASURE_BC not between", value1, value2, "measureBc");
            return (Criteria) this;
        }

        public Criteria andMeasureCoIsNull() {
            addCriterion("MEASURE_CO is null");
            return (Criteria) this;
        }

        public Criteria andMeasureCoIsNotNull() {
            addCriterion("MEASURE_CO is not null");
            return (Criteria) this;
        }

        public Criteria andMeasureCoEqualTo(Double value) {
            addCriterion("MEASURE_CO =", value, "measureCo");
            return (Criteria) this;
        }

        public Criteria andMeasureCoNotEqualTo(Double value) {
            addCriterion("MEASURE_CO <>", value, "measureCo");
            return (Criteria) this;
        }

        public Criteria andMeasureCoGreaterThan(Double value) {
            addCriterion("MEASURE_CO >", value, "measureCo");
            return (Criteria) this;
        }

        public Criteria andMeasureCoGreaterThanOrEqualTo(Double value) {
            addCriterion("MEASURE_CO >=", value, "measureCo");
            return (Criteria) this;
        }

        public Criteria andMeasureCoLessThan(Double value) {
            addCriterion("MEASURE_CO <", value, "measureCo");
            return (Criteria) this;
        }

        public Criteria andMeasureCoLessThanOrEqualTo(Double value) {
            addCriterion("MEASURE_CO <=", value, "measureCo");
            return (Criteria) this;
        }

        public Criteria andMeasureCoIn(List<Double> values) {
            addCriterion("MEASURE_CO in", values, "measureCo");
            return (Criteria) this;
        }

        public Criteria andMeasureCoNotIn(List<Double> values) {
            addCriterion("MEASURE_CO not in", values, "measureCo");
            return (Criteria) this;
        }

        public Criteria andMeasureCoBetween(Double value1, Double value2) {
            addCriterion("MEASURE_CO between", value1, value2, "measureCo");
            return (Criteria) this;
        }

        public Criteria andMeasureCoNotBetween(Double value1, Double value2) {
            addCriterion("MEASURE_CO not between", value1, value2, "measureCo");
            return (Criteria) this;
        }

        public Criteria andMeasureOcIsNull() {
            addCriterion("MEASURE_OC is null");
            return (Criteria) this;
        }

        public Criteria andMeasureOcIsNotNull() {
            addCriterion("MEASURE_OC is not null");
            return (Criteria) this;
        }

        public Criteria andMeasureOcEqualTo(Double value) {
            addCriterion("MEASURE_OC =", value, "measureOc");
            return (Criteria) this;
        }

        public Criteria andMeasureOcNotEqualTo(Double value) {
            addCriterion("MEASURE_OC <>", value, "measureOc");
            return (Criteria) this;
        }

        public Criteria andMeasureOcGreaterThan(Double value) {
            addCriterion("MEASURE_OC >", value, "measureOc");
            return (Criteria) this;
        }

        public Criteria andMeasureOcGreaterThanOrEqualTo(Double value) {
            addCriterion("MEASURE_OC >=", value, "measureOc");
            return (Criteria) this;
        }

        public Criteria andMeasureOcLessThan(Double value) {
            addCriterion("MEASURE_OC <", value, "measureOc");
            return (Criteria) this;
        }

        public Criteria andMeasureOcLessThanOrEqualTo(Double value) {
            addCriterion("MEASURE_OC <=", value, "measureOc");
            return (Criteria) this;
        }

        public Criteria andMeasureOcIn(List<Double> values) {
            addCriterion("MEASURE_OC in", values, "measureOc");
            return (Criteria) this;
        }

        public Criteria andMeasureOcNotIn(List<Double> values) {
            addCriterion("MEASURE_OC not in", values, "measureOc");
            return (Criteria) this;
        }

        public Criteria andMeasureOcBetween(Double value1, Double value2) {
            addCriterion("MEASURE_OC between", value1, value2, "measureOc");
            return (Criteria) this;
        }

        public Criteria andMeasureOcNotBetween(Double value1, Double value2) {
            addCriterion("MEASURE_OC not between", value1, value2, "measureOc");
            return (Criteria) this;
        }

        public Criteria andMeasureSo2IsNull() {
            addCriterion("MEASURE_SO2 is null");
            return (Criteria) this;
        }

        public Criteria andMeasureSo2IsNotNull() {
            addCriterion("MEASURE_SO2 is not null");
            return (Criteria) this;
        }

        public Criteria andMeasureSo2EqualTo(Double value) {
            addCriterion("MEASURE_SO2 =", value, "measureSo2");
            return (Criteria) this;
        }

        public Criteria andMeasureSo2NotEqualTo(Double value) {
            addCriterion("MEASURE_SO2 <>", value, "measureSo2");
            return (Criteria) this;
        }

        public Criteria andMeasureSo2GreaterThan(Double value) {
            addCriterion("MEASURE_SO2 >", value, "measureSo2");
            return (Criteria) this;
        }

        public Criteria andMeasureSo2GreaterThanOrEqualTo(Double value) {
            addCriterion("MEASURE_SO2 >=", value, "measureSo2");
            return (Criteria) this;
        }

        public Criteria andMeasureSo2LessThan(Double value) {
            addCriterion("MEASURE_SO2 <", value, "measureSo2");
            return (Criteria) this;
        }

        public Criteria andMeasureSo2LessThanOrEqualTo(Double value) {
            addCriterion("MEASURE_SO2 <=", value, "measureSo2");
            return (Criteria) this;
        }

        public Criteria andMeasureSo2In(List<Double> values) {
            addCriterion("MEASURE_SO2 in", values, "measureSo2");
            return (Criteria) this;
        }

        public Criteria andMeasureSo2NotIn(List<Double> values) {
            addCriterion("MEASURE_SO2 not in", values, "measureSo2");
            return (Criteria) this;
        }

        public Criteria andMeasureSo2Between(Double value1, Double value2) {
            addCriterion("MEASURE_SO2 between", value1, value2, "measureSo2");
            return (Criteria) this;
        }

        public Criteria andMeasureSo2NotBetween(Double value1, Double value2) {
            addCriterion("MEASURE_SO2 not between", value1, value2, "measureSo2");
            return (Criteria) this;
        }

        public Criteria andMeasurePm25IsNull() {
            addCriterion("MEASURE_PM25 is null");
            return (Criteria) this;
        }

        public Criteria andMeasurePm25IsNotNull() {
            addCriterion("MEASURE_PM25 is not null");
            return (Criteria) this;
        }

        public Criteria andMeasurePm25EqualTo(Double value) {
            addCriterion("MEASURE_PM25 =", value, "measurePm25");
            return (Criteria) this;
        }

        public Criteria andMeasurePm25NotEqualTo(Double value) {
            addCriterion("MEASURE_PM25 <>", value, "measurePm25");
            return (Criteria) this;
        }

        public Criteria andMeasurePm25GreaterThan(Double value) {
            addCriterion("MEASURE_PM25 >", value, "measurePm25");
            return (Criteria) this;
        }

        public Criteria andMeasurePm25GreaterThanOrEqualTo(Double value) {
            addCriterion("MEASURE_PM25 >=", value, "measurePm25");
            return (Criteria) this;
        }

        public Criteria andMeasurePm25LessThan(Double value) {
            addCriterion("MEASURE_PM25 <", value, "measurePm25");
            return (Criteria) this;
        }

        public Criteria andMeasurePm25LessThanOrEqualTo(Double value) {
            addCriterion("MEASURE_PM25 <=", value, "measurePm25");
            return (Criteria) this;
        }

        public Criteria andMeasurePm25In(List<Double> values) {
            addCriterion("MEASURE_PM25 in", values, "measurePm25");
            return (Criteria) this;
        }

        public Criteria andMeasurePm25NotIn(List<Double> values) {
            addCriterion("MEASURE_PM25 not in", values, "measurePm25");
            return (Criteria) this;
        }

        public Criteria andMeasurePm25Between(Double value1, Double value2) {
            addCriterion("MEASURE_PM25 between", value1, value2, "measurePm25");
            return (Criteria) this;
        }

        public Criteria andMeasurePm25NotBetween(Double value1, Double value2) {
            addCriterion("MEASURE_PM25 not between", value1, value2, "measurePm25");
            return (Criteria) this;
        }

        public Criteria andMeasureVocIsNull() {
            addCriterion("MEASURE_VOC is null");
            return (Criteria) this;
        }

        public Criteria andMeasureVocIsNotNull() {
            addCriterion("MEASURE_VOC is not null");
            return (Criteria) this;
        }

        public Criteria andMeasureVocEqualTo(Double value) {
            addCriterion("MEASURE_VOC =", value, "measureVoc");
            return (Criteria) this;
        }

        public Criteria andMeasureVocNotEqualTo(Double value) {
            addCriterion("MEASURE_VOC <>", value, "measureVoc");
            return (Criteria) this;
        }

        public Criteria andMeasureVocGreaterThan(Double value) {
            addCriterion("MEASURE_VOC >", value, "measureVoc");
            return (Criteria) this;
        }

        public Criteria andMeasureVocGreaterThanOrEqualTo(Double value) {
            addCriterion("MEASURE_VOC >=", value, "measureVoc");
            return (Criteria) this;
        }

        public Criteria andMeasureVocLessThan(Double value) {
            addCriterion("MEASURE_VOC <", value, "measureVoc");
            return (Criteria) this;
        }

        public Criteria andMeasureVocLessThanOrEqualTo(Double value) {
            addCriterion("MEASURE_VOC <=", value, "measureVoc");
            return (Criteria) this;
        }

        public Criteria andMeasureVocIn(List<Double> values) {
            addCriterion("MEASURE_VOC in", values, "measureVoc");
            return (Criteria) this;
        }

        public Criteria andMeasureVocNotIn(List<Double> values) {
            addCriterion("MEASURE_VOC not in", values, "measureVoc");
            return (Criteria) this;
        }

        public Criteria andMeasureVocBetween(Double value1, Double value2) {
            addCriterion("MEASURE_VOC between", value1, value2, "measureVoc");
            return (Criteria) this;
        }

        public Criteria andMeasureVocNotBetween(Double value1, Double value2) {
            addCriterion("MEASURE_VOC not between", value1, value2, "measureVoc");
            return (Criteria) this;
        }

        public Criteria andMeasurePmIsNull() {
            addCriterion("MEASURE_PM is null");
            return (Criteria) this;
        }

        public Criteria andMeasurePmIsNotNull() {
            addCriterion("MEASURE_PM is not null");
            return (Criteria) this;
        }

        public Criteria andMeasurePmEqualTo(Double value) {
            addCriterion("MEASURE_PM =", value, "measurePm");
            return (Criteria) this;
        }

        public Criteria andMeasurePmNotEqualTo(Double value) {
            addCriterion("MEASURE_PM <>", value, "measurePm");
            return (Criteria) this;
        }

        public Criteria andMeasurePmGreaterThan(Double value) {
            addCriterion("MEASURE_PM >", value, "measurePm");
            return (Criteria) this;
        }

        public Criteria andMeasurePmGreaterThanOrEqualTo(Double value) {
            addCriterion("MEASURE_PM >=", value, "measurePm");
            return (Criteria) this;
        }

        public Criteria andMeasurePmLessThan(Double value) {
            addCriterion("MEASURE_PM <", value, "measurePm");
            return (Criteria) this;
        }

        public Criteria andMeasurePmLessThanOrEqualTo(Double value) {
            addCriterion("MEASURE_PM <=", value, "measurePm");
            return (Criteria) this;
        }

        public Criteria andMeasurePmIn(List<Double> values) {
            addCriterion("MEASURE_PM in", values, "measurePm");
            return (Criteria) this;
        }

        public Criteria andMeasurePmNotIn(List<Double> values) {
            addCriterion("MEASURE_PM not in", values, "measurePm");
            return (Criteria) this;
        }

        public Criteria andMeasurePmBetween(Double value1, Double value2) {
            addCriterion("MEASURE_PM between", value1, value2, "measurePm");
            return (Criteria) this;
        }

        public Criteria andMeasurePmNotBetween(Double value1, Double value2) {
            addCriterion("MEASURE_PM not between", value1, value2, "measurePm");
            return (Criteria) this;
        }

        public Criteria andMeasurePm10IsNull() {
            addCriterion("MEASURE_PM10 is null");
            return (Criteria) this;
        }

        public Criteria andMeasurePm10IsNotNull() {
            addCriterion("MEASURE_PM10 is not null");
            return (Criteria) this;
        }

        public Criteria andMeasurePm10EqualTo(Double value) {
            addCriterion("MEASURE_PM10 =", value, "measurePm10");
            return (Criteria) this;
        }

        public Criteria andMeasurePm10NotEqualTo(Double value) {
            addCriterion("MEASURE_PM10 <>", value, "measurePm10");
            return (Criteria) this;
        }

        public Criteria andMeasurePm10GreaterThan(Double value) {
            addCriterion("MEASURE_PM10 >", value, "measurePm10");
            return (Criteria) this;
        }

        public Criteria andMeasurePm10GreaterThanOrEqualTo(Double value) {
            addCriterion("MEASURE_PM10 >=", value, "measurePm10");
            return (Criteria) this;
        }

        public Criteria andMeasurePm10LessThan(Double value) {
            addCriterion("MEASURE_PM10 <", value, "measurePm10");
            return (Criteria) this;
        }

        public Criteria andMeasurePm10LessThanOrEqualTo(Double value) {
            addCriterion("MEASURE_PM10 <=", value, "measurePm10");
            return (Criteria) this;
        }

        public Criteria andMeasurePm10In(List<Double> values) {
            addCriterion("MEASURE_PM10 in", values, "measurePm10");
            return (Criteria) this;
        }

        public Criteria andMeasurePm10NotIn(List<Double> values) {
            addCriterion("MEASURE_PM10 not in", values, "measurePm10");
            return (Criteria) this;
        }

        public Criteria andMeasurePm10Between(Double value1, Double value2) {
            addCriterion("MEASURE_PM10 between", value1, value2, "measurePm10");
            return (Criteria) this;
        }

        public Criteria andMeasurePm10NotBetween(Double value1, Double value2) {
            addCriterion("MEASURE_PM10 not between", value1, value2, "measurePm10");
            return (Criteria) this;
        }

        public Criteria andExfPmIsNull() {
            addCriterion("EXF_PM is null");
            return (Criteria) this;
        }

        public Criteria andExfPmIsNotNull() {
            addCriterion("EXF_PM is not null");
            return (Criteria) this;
        }

        public Criteria andExfPmEqualTo(Double value) {
            addCriterion("EXF_PM =", value, "exfPm");
            return (Criteria) this;
        }

        public Criteria andExfPmNotEqualTo(Double value) {
            addCriterion("EXF_PM <>", value, "exfPm");
            return (Criteria) this;
        }

        public Criteria andExfPmGreaterThan(Double value) {
            addCriterion("EXF_PM >", value, "exfPm");
            return (Criteria) this;
        }

        public Criteria andExfPmGreaterThanOrEqualTo(Double value) {
            addCriterion("EXF_PM >=", value, "exfPm");
            return (Criteria) this;
        }

        public Criteria andExfPmLessThan(Double value) {
            addCriterion("EXF_PM <", value, "exfPm");
            return (Criteria) this;
        }

        public Criteria andExfPmLessThanOrEqualTo(Double value) {
            addCriterion("EXF_PM <=", value, "exfPm");
            return (Criteria) this;
        }

        public Criteria andExfPmIn(List<Double> values) {
            addCriterion("EXF_PM in", values, "exfPm");
            return (Criteria) this;
        }

        public Criteria andExfPmNotIn(List<Double> values) {
            addCriterion("EXF_PM not in", values, "exfPm");
            return (Criteria) this;
        }

        public Criteria andExfPmBetween(Double value1, Double value2) {
            addCriterion("EXF_PM between", value1, value2, "exfPm");
            return (Criteria) this;
        }

        public Criteria andExfPmNotBetween(Double value1, Double value2) {
            addCriterion("EXF_PM not between", value1, value2, "exfPm");
            return (Criteria) this;
        }

        public Criteria andExfSo2IsNull() {
            addCriterion("EXF_SO2 is null");
            return (Criteria) this;
        }

        public Criteria andExfSo2IsNotNull() {
            addCriterion("EXF_SO2 is not null");
            return (Criteria) this;
        }

        public Criteria andExfSo2EqualTo(Double value) {
            addCriterion("EXF_SO2 =", value, "exfSo2");
            return (Criteria) this;
        }

        public Criteria andExfSo2NotEqualTo(Double value) {
            addCriterion("EXF_SO2 <>", value, "exfSo2");
            return (Criteria) this;
        }

        public Criteria andExfSo2GreaterThan(Double value) {
            addCriterion("EXF_SO2 >", value, "exfSo2");
            return (Criteria) this;
        }

        public Criteria andExfSo2GreaterThanOrEqualTo(Double value) {
            addCriterion("EXF_SO2 >=", value, "exfSo2");
            return (Criteria) this;
        }

        public Criteria andExfSo2LessThan(Double value) {
            addCriterion("EXF_SO2 <", value, "exfSo2");
            return (Criteria) this;
        }

        public Criteria andExfSo2LessThanOrEqualTo(Double value) {
            addCriterion("EXF_SO2 <=", value, "exfSo2");
            return (Criteria) this;
        }

        public Criteria andExfSo2In(List<Double> values) {
            addCriterion("EXF_SO2 in", values, "exfSo2");
            return (Criteria) this;
        }

        public Criteria andExfSo2NotIn(List<Double> values) {
            addCriterion("EXF_SO2 not in", values, "exfSo2");
            return (Criteria) this;
        }

        public Criteria andExfSo2Between(Double value1, Double value2) {
            addCriterion("EXF_SO2 between", value1, value2, "exfSo2");
            return (Criteria) this;
        }

        public Criteria andExfSo2NotBetween(Double value1, Double value2) {
            addCriterion("EXF_SO2 not between", value1, value2, "exfSo2");
            return (Criteria) this;
        }

        public Criteria andExfNoxIsNull() {
            addCriterion("EXF_NOX is null");
            return (Criteria) this;
        }

        public Criteria andExfNoxIsNotNull() {
            addCriterion("EXF_NOX is not null");
            return (Criteria) this;
        }

        public Criteria andExfNoxEqualTo(Double value) {
            addCriterion("EXF_NOX =", value, "exfNox");
            return (Criteria) this;
        }

        public Criteria andExfNoxNotEqualTo(Double value) {
            addCriterion("EXF_NOX <>", value, "exfNox");
            return (Criteria) this;
        }

        public Criteria andExfNoxGreaterThan(Double value) {
            addCriterion("EXF_NOX >", value, "exfNox");
            return (Criteria) this;
        }

        public Criteria andExfNoxGreaterThanOrEqualTo(Double value) {
            addCriterion("EXF_NOX >=", value, "exfNox");
            return (Criteria) this;
        }

        public Criteria andExfNoxLessThan(Double value) {
            addCriterion("EXF_NOX <", value, "exfNox");
            return (Criteria) this;
        }

        public Criteria andExfNoxLessThanOrEqualTo(Double value) {
            addCriterion("EXF_NOX <=", value, "exfNox");
            return (Criteria) this;
        }

        public Criteria andExfNoxIn(List<Double> values) {
            addCriterion("EXF_NOX in", values, "exfNox");
            return (Criteria) this;
        }

        public Criteria andExfNoxNotIn(List<Double> values) {
            addCriterion("EXF_NOX not in", values, "exfNox");
            return (Criteria) this;
        }

        public Criteria andExfNoxBetween(Double value1, Double value2) {
            addCriterion("EXF_NOX between", value1, value2, "exfNox");
            return (Criteria) this;
        }

        public Criteria andExfNoxNotBetween(Double value1, Double value2) {
            addCriterion("EXF_NOX not between", value1, value2, "exfNox");
            return (Criteria) this;
        }

        public Criteria andExfOcIsNull() {
            addCriterion("exf_oc is null");
            return (Criteria) this;
        }

        public Criteria andExfOcIsNotNull() {
            addCriterion("exf_oc is not null");
            return (Criteria) this;
        }

        public Criteria andExfOcEqualTo(Double value) {
            addCriterion("exf_oc =", value, "exfOc");
            return (Criteria) this;
        }

        public Criteria andExfOcNotEqualTo(Double value) {
            addCriterion("exf_oc <>", value, "exfOc");
            return (Criteria) this;
        }

        public Criteria andExfOcGreaterThan(Double value) {
            addCriterion("exf_oc >", value, "exfOc");
            return (Criteria) this;
        }

        public Criteria andExfOcGreaterThanOrEqualTo(Double value) {
            addCriterion("exf_oc >=", value, "exfOc");
            return (Criteria) this;
        }

        public Criteria andExfOcLessThan(Double value) {
            addCriterion("exf_oc <", value, "exfOc");
            return (Criteria) this;
        }

        public Criteria andExfOcLessThanOrEqualTo(Double value) {
            addCriterion("exf_oc <=", value, "exfOc");
            return (Criteria) this;
        }

        public Criteria andExfOcIn(List<Double> values) {
            addCriterion("exf_oc in", values, "exfOc");
            return (Criteria) this;
        }

        public Criteria andExfOcNotIn(List<Double> values) {
            addCriterion("exf_oc not in", values, "exfOc");
            return (Criteria) this;
        }

        public Criteria andExfOcBetween(Double value1, Double value2) {
            addCriterion("exf_oc between", value1, value2, "exfOc");
            return (Criteria) this;
        }

        public Criteria andExfOcNotBetween(Double value1, Double value2) {
            addCriterion("exf_oc not between", value1, value2, "exfOc");
            return (Criteria) this;
        }

        public Criteria andExfBcIsNull() {
            addCriterion("exf_bc is null");
            return (Criteria) this;
        }

        public Criteria andExfBcIsNotNull() {
            addCriterion("exf_bc is not null");
            return (Criteria) this;
        }

        public Criteria andExfBcEqualTo(Double value) {
            addCriterion("exf_bc =", value, "exfBc");
            return (Criteria) this;
        }

        public Criteria andExfBcNotEqualTo(Double value) {
            addCriterion("exf_bc <>", value, "exfBc");
            return (Criteria) this;
        }

        public Criteria andExfBcGreaterThan(Double value) {
            addCriterion("exf_bc >", value, "exfBc");
            return (Criteria) this;
        }

        public Criteria andExfBcGreaterThanOrEqualTo(Double value) {
            addCriterion("exf_bc >=", value, "exfBc");
            return (Criteria) this;
        }

        public Criteria andExfBcLessThan(Double value) {
            addCriterion("exf_bc <", value, "exfBc");
            return (Criteria) this;
        }

        public Criteria andExfBcLessThanOrEqualTo(Double value) {
            addCriterion("exf_bc <=", value, "exfBc");
            return (Criteria) this;
        }

        public Criteria andExfBcIn(List<Double> values) {
            addCriterion("exf_bc in", values, "exfBc");
            return (Criteria) this;
        }

        public Criteria andExfBcNotIn(List<Double> values) {
            addCriterion("exf_bc not in", values, "exfBc");
            return (Criteria) this;
        }

        public Criteria andExfBcBetween(Double value1, Double value2) {
            addCriterion("exf_bc between", value1, value2, "exfBc");
            return (Criteria) this;
        }

        public Criteria andExfBcNotBetween(Double value1, Double value2) {
            addCriterion("exf_bc not between", value1, value2, "exfBc");
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