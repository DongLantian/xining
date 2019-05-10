package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CtrlairatmosExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CtrlairatmosExample() {
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

        public Criteria andCellidIsNull() {
            addCriterion("CellID is null");
            return (Criteria) this;
        }

        public Criteria andCellidIsNotNull() {
            addCriterion("CellID is not null");
            return (Criteria) this;
        }

        public Criteria andCellidEqualTo(String value) {
            addCriterion("CellID =", value, "cellid");
            return (Criteria) this;
        }

        public Criteria andCellidNotEqualTo(String value) {
            addCriterion("CellID <>", value, "cellid");
            return (Criteria) this;
        }

        public Criteria andCellidGreaterThan(String value) {
            addCriterion("CellID >", value, "cellid");
            return (Criteria) this;
        }

        public Criteria andCellidGreaterThanOrEqualTo(String value) {
            addCriterion("CellID >=", value, "cellid");
            return (Criteria) this;
        }

        public Criteria andCellidLessThan(String value) {
            addCriterion("CellID <", value, "cellid");
            return (Criteria) this;
        }

        public Criteria andCellidLessThanOrEqualTo(String value) {
            addCriterion("CellID <=", value, "cellid");
            return (Criteria) this;
        }

        public Criteria andCellidLike(String value) {
            addCriterion("CellID like", value, "cellid");
            return (Criteria) this;
        }

        public Criteria andCellidNotLike(String value) {
            addCriterion("CellID not like", value, "cellid");
            return (Criteria) this;
        }

        public Criteria andCellidIn(List<String> values) {
            addCriterion("CellID in", values, "cellid");
            return (Criteria) this;
        }

        public Criteria andCellidNotIn(List<String> values) {
            addCriterion("CellID not in", values, "cellid");
            return (Criteria) this;
        }

        public Criteria andCellidBetween(String value1, String value2) {
            addCriterion("CellID between", value1, value2, "cellid");
            return (Criteria) this;
        }

        public Criteria andCellidNotBetween(String value1, String value2) {
            addCriterion("CellID not between", value1, value2, "cellid");
            return (Criteria) this;
        }

        public Criteria andDateidIsNull() {
            addCriterion("DateID is null");
            return (Criteria) this;
        }

        public Criteria andDateidIsNotNull() {
            addCriterion("DateID is not null");
            return (Criteria) this;
        }

        public Criteria andDateidEqualTo(Date value) {
            addCriterion("DateID =", value, "dateid");
            return (Criteria) this;
        }

        public Criteria andDateidNotEqualTo(Date value) {
            addCriterion("DateID <>", value, "dateid");
            return (Criteria) this;
        }

        public Criteria andDateidGreaterThan(Date value) {
            addCriterion("DateID >", value, "dateid");
            return (Criteria) this;
        }

        public Criteria andDateidGreaterThanOrEqualTo(Date value) {
            addCriterion("DateID >=", value, "dateid");
            return (Criteria) this;
        }

        public Criteria andDateidLessThan(Date value) {
            addCriterion("DateID <", value, "dateid");
            return (Criteria) this;
        }

        public Criteria andDateidLessThanOrEqualTo(Date value) {
            addCriterion("DateID <=", value, "dateid");
            return (Criteria) this;
        }

        public Criteria andDateidIn(List<Date> values) {
            addCriterion("DateID in", values, "dateid");
            return (Criteria) this;
        }

        public Criteria andDateidNotIn(List<Date> values) {
            addCriterion("DateID not in", values, "dateid");
            return (Criteria) this;
        }

        public Criteria andDateidBetween(Date value1, Date value2) {
            addCriterion("DateID between", value1, value2, "dateid");
            return (Criteria) this;
        }

        public Criteria andDateidNotBetween(Date value1, Date value2) {
            addCriterion("DateID not between", value1, value2, "dateid");
            return (Criteria) this;
        }

        public Criteria andPreCoIsNull() {
            addCriterion("pre_CO is null");
            return (Criteria) this;
        }

        public Criteria andPreCoIsNotNull() {
            addCriterion("pre_CO is not null");
            return (Criteria) this;
        }

        public Criteria andPreCoEqualTo(Double value) {
            addCriterion("pre_CO =", value, "preCo");
            return (Criteria) this;
        }

        public Criteria andPreCoNotEqualTo(Double value) {
            addCriterion("pre_CO <>", value, "preCo");
            return (Criteria) this;
        }

        public Criteria andPreCoGreaterThan(Double value) {
            addCriterion("pre_CO >", value, "preCo");
            return (Criteria) this;
        }

        public Criteria andPreCoGreaterThanOrEqualTo(Double value) {
            addCriterion("pre_CO >=", value, "preCo");
            return (Criteria) this;
        }

        public Criteria andPreCoLessThan(Double value) {
            addCriterion("pre_CO <", value, "preCo");
            return (Criteria) this;
        }

        public Criteria andPreCoLessThanOrEqualTo(Double value) {
            addCriterion("pre_CO <=", value, "preCo");
            return (Criteria) this;
        }

        public Criteria andPreCoIn(List<Double> values) {
            addCriterion("pre_CO in", values, "preCo");
            return (Criteria) this;
        }

        public Criteria andPreCoNotIn(List<Double> values) {
            addCriterion("pre_CO not in", values, "preCo");
            return (Criteria) this;
        }

        public Criteria andPreCoBetween(Double value1, Double value2) {
            addCriterion("pre_CO between", value1, value2, "preCo");
            return (Criteria) this;
        }

        public Criteria andPreCoNotBetween(Double value1, Double value2) {
            addCriterion("pre_CO not between", value1, value2, "preCo");
            return (Criteria) this;
        }

        public Criteria andPreSo2IsNull() {
            addCriterion("pre_SO2 is null");
            return (Criteria) this;
        }

        public Criteria andPreSo2IsNotNull() {
            addCriterion("pre_SO2 is not null");
            return (Criteria) this;
        }

        public Criteria andPreSo2EqualTo(Double value) {
            addCriterion("pre_SO2 =", value, "preSo2");
            return (Criteria) this;
        }

        public Criteria andPreSo2NotEqualTo(Double value) {
            addCriterion("pre_SO2 <>", value, "preSo2");
            return (Criteria) this;
        }

        public Criteria andPreSo2GreaterThan(Double value) {
            addCriterion("pre_SO2 >", value, "preSo2");
            return (Criteria) this;
        }

        public Criteria andPreSo2GreaterThanOrEqualTo(Double value) {
            addCriterion("pre_SO2 >=", value, "preSo2");
            return (Criteria) this;
        }

        public Criteria andPreSo2LessThan(Double value) {
            addCriterion("pre_SO2 <", value, "preSo2");
            return (Criteria) this;
        }

        public Criteria andPreSo2LessThanOrEqualTo(Double value) {
            addCriterion("pre_SO2 <=", value, "preSo2");
            return (Criteria) this;
        }

        public Criteria andPreSo2In(List<Double> values) {
            addCriterion("pre_SO2 in", values, "preSo2");
            return (Criteria) this;
        }

        public Criteria andPreSo2NotIn(List<Double> values) {
            addCriterion("pre_SO2 not in", values, "preSo2");
            return (Criteria) this;
        }

        public Criteria andPreSo2Between(Double value1, Double value2) {
            addCriterion("pre_SO2 between", value1, value2, "preSo2");
            return (Criteria) this;
        }

        public Criteria andPreSo2NotBetween(Double value1, Double value2) {
            addCriterion("pre_SO2 not between", value1, value2, "preSo2");
            return (Criteria) this;
        }

        public Criteria andPreO3IsNull() {
            addCriterion("pre_O3 is null");
            return (Criteria) this;
        }

        public Criteria andPreO3IsNotNull() {
            addCriterion("pre_O3 is not null");
            return (Criteria) this;
        }

        public Criteria andPreO3EqualTo(Double value) {
            addCriterion("pre_O3 =", value, "preO3");
            return (Criteria) this;
        }

        public Criteria andPreO3NotEqualTo(Double value) {
            addCriterion("pre_O3 <>", value, "preO3");
            return (Criteria) this;
        }

        public Criteria andPreO3GreaterThan(Double value) {
            addCriterion("pre_O3 >", value, "preO3");
            return (Criteria) this;
        }

        public Criteria andPreO3GreaterThanOrEqualTo(Double value) {
            addCriterion("pre_O3 >=", value, "preO3");
            return (Criteria) this;
        }

        public Criteria andPreO3LessThan(Double value) {
            addCriterion("pre_O3 <", value, "preO3");
            return (Criteria) this;
        }

        public Criteria andPreO3LessThanOrEqualTo(Double value) {
            addCriterion("pre_O3 <=", value, "preO3");
            return (Criteria) this;
        }

        public Criteria andPreO3In(List<Double> values) {
            addCriterion("pre_O3 in", values, "preO3");
            return (Criteria) this;
        }

        public Criteria andPreO3NotIn(List<Double> values) {
            addCriterion("pre_O3 not in", values, "preO3");
            return (Criteria) this;
        }

        public Criteria andPreO3Between(Double value1, Double value2) {
            addCriterion("pre_O3 between", value1, value2, "preO3");
            return (Criteria) this;
        }

        public Criteria andPreO3NotBetween(Double value1, Double value2) {
            addCriterion("pre_O3 not between", value1, value2, "preO3");
            return (Criteria) this;
        }

        public Criteria andPreNoIsNull() {
            addCriterion("pre_NO is null");
            return (Criteria) this;
        }

        public Criteria andPreNoIsNotNull() {
            addCriterion("pre_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPreNoEqualTo(Double value) {
            addCriterion("pre_NO =", value, "preNo");
            return (Criteria) this;
        }

        public Criteria andPreNoNotEqualTo(Double value) {
            addCriterion("pre_NO <>", value, "preNo");
            return (Criteria) this;
        }

        public Criteria andPreNoGreaterThan(Double value) {
            addCriterion("pre_NO >", value, "preNo");
            return (Criteria) this;
        }

        public Criteria andPreNoGreaterThanOrEqualTo(Double value) {
            addCriterion("pre_NO >=", value, "preNo");
            return (Criteria) this;
        }

        public Criteria andPreNoLessThan(Double value) {
            addCriterion("pre_NO <", value, "preNo");
            return (Criteria) this;
        }

        public Criteria andPreNoLessThanOrEqualTo(Double value) {
            addCriterion("pre_NO <=", value, "preNo");
            return (Criteria) this;
        }

        public Criteria andPreNoIn(List<Double> values) {
            addCriterion("pre_NO in", values, "preNo");
            return (Criteria) this;
        }

        public Criteria andPreNoNotIn(List<Double> values) {
            addCriterion("pre_NO not in", values, "preNo");
            return (Criteria) this;
        }

        public Criteria andPreNoBetween(Double value1, Double value2) {
            addCriterion("pre_NO between", value1, value2, "preNo");
            return (Criteria) this;
        }

        public Criteria andPreNoNotBetween(Double value1, Double value2) {
            addCriterion("pre_NO not between", value1, value2, "preNo");
            return (Criteria) this;
        }

        public Criteria andPreNo2IsNull() {
            addCriterion("pre_NO2 is null");
            return (Criteria) this;
        }

        public Criteria andPreNo2IsNotNull() {
            addCriterion("pre_NO2 is not null");
            return (Criteria) this;
        }

        public Criteria andPreNo2EqualTo(Double value) {
            addCriterion("pre_NO2 =", value, "preNo2");
            return (Criteria) this;
        }

        public Criteria andPreNo2NotEqualTo(Double value) {
            addCriterion("pre_NO2 <>", value, "preNo2");
            return (Criteria) this;
        }

        public Criteria andPreNo2GreaterThan(Double value) {
            addCriterion("pre_NO2 >", value, "preNo2");
            return (Criteria) this;
        }

        public Criteria andPreNo2GreaterThanOrEqualTo(Double value) {
            addCriterion("pre_NO2 >=", value, "preNo2");
            return (Criteria) this;
        }

        public Criteria andPreNo2LessThan(Double value) {
            addCriterion("pre_NO2 <", value, "preNo2");
            return (Criteria) this;
        }

        public Criteria andPreNo2LessThanOrEqualTo(Double value) {
            addCriterion("pre_NO2 <=", value, "preNo2");
            return (Criteria) this;
        }

        public Criteria andPreNo2In(List<Double> values) {
            addCriterion("pre_NO2 in", values, "preNo2");
            return (Criteria) this;
        }

        public Criteria andPreNo2NotIn(List<Double> values) {
            addCriterion("pre_NO2 not in", values, "preNo2");
            return (Criteria) this;
        }

        public Criteria andPreNo2Between(Double value1, Double value2) {
            addCriterion("pre_NO2 between", value1, value2, "preNo2");
            return (Criteria) this;
        }

        public Criteria andPreNo2NotBetween(Double value1, Double value2) {
            addCriterion("pre_NO2 not between", value1, value2, "preNo2");
            return (Criteria) this;
        }

        public Criteria andPreNoxIsNull() {
            addCriterion("pre_NOX is null");
            return (Criteria) this;
        }

        public Criteria andPreNoxIsNotNull() {
            addCriterion("pre_NOX is not null");
            return (Criteria) this;
        }

        public Criteria andPreNoxEqualTo(Double value) {
            addCriterion("pre_NOX =", value, "preNox");
            return (Criteria) this;
        }

        public Criteria andPreNoxNotEqualTo(Double value) {
            addCriterion("pre_NOX <>", value, "preNox");
            return (Criteria) this;
        }

        public Criteria andPreNoxGreaterThan(Double value) {
            addCriterion("pre_NOX >", value, "preNox");
            return (Criteria) this;
        }

        public Criteria andPreNoxGreaterThanOrEqualTo(Double value) {
            addCriterion("pre_NOX >=", value, "preNox");
            return (Criteria) this;
        }

        public Criteria andPreNoxLessThan(Double value) {
            addCriterion("pre_NOX <", value, "preNox");
            return (Criteria) this;
        }

        public Criteria andPreNoxLessThanOrEqualTo(Double value) {
            addCriterion("pre_NOX <=", value, "preNox");
            return (Criteria) this;
        }

        public Criteria andPreNoxIn(List<Double> values) {
            addCriterion("pre_NOX in", values, "preNox");
            return (Criteria) this;
        }

        public Criteria andPreNoxNotIn(List<Double> values) {
            addCriterion("pre_NOX not in", values, "preNox");
            return (Criteria) this;
        }

        public Criteria andPreNoxBetween(Double value1, Double value2) {
            addCriterion("pre_NOX between", value1, value2, "preNox");
            return (Criteria) this;
        }

        public Criteria andPreNoxNotBetween(Double value1, Double value2) {
            addCriterion("pre_NOX not between", value1, value2, "preNox");
            return (Criteria) this;
        }

        public Criteria andPrePm25IsNull() {
            addCriterion("pre_PM25 is null");
            return (Criteria) this;
        }

        public Criteria andPrePm25IsNotNull() {
            addCriterion("pre_PM25 is not null");
            return (Criteria) this;
        }

        public Criteria andPrePm25EqualTo(Double value) {
            addCriterion("pre_PM25 =", value, "prePm25");
            return (Criteria) this;
        }

        public Criteria andPrePm25NotEqualTo(Double value) {
            addCriterion("pre_PM25 <>", value, "prePm25");
            return (Criteria) this;
        }

        public Criteria andPrePm25GreaterThan(Double value) {
            addCriterion("pre_PM25 >", value, "prePm25");
            return (Criteria) this;
        }

        public Criteria andPrePm25GreaterThanOrEqualTo(Double value) {
            addCriterion("pre_PM25 >=", value, "prePm25");
            return (Criteria) this;
        }

        public Criteria andPrePm25LessThan(Double value) {
            addCriterion("pre_PM25 <", value, "prePm25");
            return (Criteria) this;
        }

        public Criteria andPrePm25LessThanOrEqualTo(Double value) {
            addCriterion("pre_PM25 <=", value, "prePm25");
            return (Criteria) this;
        }

        public Criteria andPrePm25In(List<Double> values) {
            addCriterion("pre_PM25 in", values, "prePm25");
            return (Criteria) this;
        }

        public Criteria andPrePm25NotIn(List<Double> values) {
            addCriterion("pre_PM25 not in", values, "prePm25");
            return (Criteria) this;
        }

        public Criteria andPrePm25Between(Double value1, Double value2) {
            addCriterion("pre_PM25 between", value1, value2, "prePm25");
            return (Criteria) this;
        }

        public Criteria andPrePm25NotBetween(Double value1, Double value2) {
            addCriterion("pre_PM25 not between", value1, value2, "prePm25");
            return (Criteria) this;
        }

        public Criteria andPrePm10IsNull() {
            addCriterion("pre_PM10 is null");
            return (Criteria) this;
        }

        public Criteria andPrePm10IsNotNull() {
            addCriterion("pre_PM10 is not null");
            return (Criteria) this;
        }

        public Criteria andPrePm10EqualTo(Double value) {
            addCriterion("pre_PM10 =", value, "prePm10");
            return (Criteria) this;
        }

        public Criteria andPrePm10NotEqualTo(Double value) {
            addCriterion("pre_PM10 <>", value, "prePm10");
            return (Criteria) this;
        }

        public Criteria andPrePm10GreaterThan(Double value) {
            addCriterion("pre_PM10 >", value, "prePm10");
            return (Criteria) this;
        }

        public Criteria andPrePm10GreaterThanOrEqualTo(Double value) {
            addCriterion("pre_PM10 >=", value, "prePm10");
            return (Criteria) this;
        }

        public Criteria andPrePm10LessThan(Double value) {
            addCriterion("pre_PM10 <", value, "prePm10");
            return (Criteria) this;
        }

        public Criteria andPrePm10LessThanOrEqualTo(Double value) {
            addCriterion("pre_PM10 <=", value, "prePm10");
            return (Criteria) this;
        }

        public Criteria andPrePm10In(List<Double> values) {
            addCriterion("pre_PM10 in", values, "prePm10");
            return (Criteria) this;
        }

        public Criteria andPrePm10NotIn(List<Double> values) {
            addCriterion("pre_PM10 not in", values, "prePm10");
            return (Criteria) this;
        }

        public Criteria andPrePm10Between(Double value1, Double value2) {
            addCriterion("pre_PM10 between", value1, value2, "prePm10");
            return (Criteria) this;
        }

        public Criteria andPrePm10NotBetween(Double value1, Double value2) {
            addCriterion("pre_PM10 not between", value1, value2, "prePm10");
            return (Criteria) this;
        }

        public Criteria andPreVocIsNull() {
            addCriterion("pre_VOC is null");
            return (Criteria) this;
        }

        public Criteria andPreVocIsNotNull() {
            addCriterion("pre_VOC is not null");
            return (Criteria) this;
        }

        public Criteria andPreVocEqualTo(Double value) {
            addCriterion("pre_VOC =", value, "preVoc");
            return (Criteria) this;
        }

        public Criteria andPreVocNotEqualTo(Double value) {
            addCriterion("pre_VOC <>", value, "preVoc");
            return (Criteria) this;
        }

        public Criteria andPreVocGreaterThan(Double value) {
            addCriterion("pre_VOC >", value, "preVoc");
            return (Criteria) this;
        }

        public Criteria andPreVocGreaterThanOrEqualTo(Double value) {
            addCriterion("pre_VOC >=", value, "preVoc");
            return (Criteria) this;
        }

        public Criteria andPreVocLessThan(Double value) {
            addCriterion("pre_VOC <", value, "preVoc");
            return (Criteria) this;
        }

        public Criteria andPreVocLessThanOrEqualTo(Double value) {
            addCriterion("pre_VOC <=", value, "preVoc");
            return (Criteria) this;
        }

        public Criteria andPreVocIn(List<Double> values) {
            addCriterion("pre_VOC in", values, "preVoc");
            return (Criteria) this;
        }

        public Criteria andPreVocNotIn(List<Double> values) {
            addCriterion("pre_VOC not in", values, "preVoc");
            return (Criteria) this;
        }

        public Criteria andPreVocBetween(Double value1, Double value2) {
            addCriterion("pre_VOC between", value1, value2, "preVoc");
            return (Criteria) this;
        }

        public Criteria andPreVocNotBetween(Double value1, Double value2) {
            addCriterion("pre_VOC not between", value1, value2, "preVoc");
            return (Criteria) this;
        }

        public Criteria andPrePressureIsNull() {
            addCriterion("pre_PRESSURE is null");
            return (Criteria) this;
        }

        public Criteria andPrePressureIsNotNull() {
            addCriterion("pre_PRESSURE is not null");
            return (Criteria) this;
        }

        public Criteria andPrePressureEqualTo(Double value) {
            addCriterion("pre_PRESSURE =", value, "prePressure");
            return (Criteria) this;
        }

        public Criteria andPrePressureNotEqualTo(Double value) {
            addCriterion("pre_PRESSURE <>", value, "prePressure");
            return (Criteria) this;
        }

        public Criteria andPrePressureGreaterThan(Double value) {
            addCriterion("pre_PRESSURE >", value, "prePressure");
            return (Criteria) this;
        }

        public Criteria andPrePressureGreaterThanOrEqualTo(Double value) {
            addCriterion("pre_PRESSURE >=", value, "prePressure");
            return (Criteria) this;
        }

        public Criteria andPrePressureLessThan(Double value) {
            addCriterion("pre_PRESSURE <", value, "prePressure");
            return (Criteria) this;
        }

        public Criteria andPrePressureLessThanOrEqualTo(Double value) {
            addCriterion("pre_PRESSURE <=", value, "prePressure");
            return (Criteria) this;
        }

        public Criteria andPrePressureIn(List<Double> values) {
            addCriterion("pre_PRESSURE in", values, "prePressure");
            return (Criteria) this;
        }

        public Criteria andPrePressureNotIn(List<Double> values) {
            addCriterion("pre_PRESSURE not in", values, "prePressure");
            return (Criteria) this;
        }

        public Criteria andPrePressureBetween(Double value1, Double value2) {
            addCriterion("pre_PRESSURE between", value1, value2, "prePressure");
            return (Criteria) this;
        }

        public Criteria andPrePressureNotBetween(Double value1, Double value2) {
            addCriterion("pre_PRESSURE not between", value1, value2, "prePressure");
            return (Criteria) this;
        }

        public Criteria andPreTempIsNull() {
            addCriterion("pre_TEMP is null");
            return (Criteria) this;
        }

        public Criteria andPreTempIsNotNull() {
            addCriterion("pre_TEMP is not null");
            return (Criteria) this;
        }

        public Criteria andPreTempEqualTo(Double value) {
            addCriterion("pre_TEMP =", value, "preTemp");
            return (Criteria) this;
        }

        public Criteria andPreTempNotEqualTo(Double value) {
            addCriterion("pre_TEMP <>", value, "preTemp");
            return (Criteria) this;
        }

        public Criteria andPreTempGreaterThan(Double value) {
            addCriterion("pre_TEMP >", value, "preTemp");
            return (Criteria) this;
        }

        public Criteria andPreTempGreaterThanOrEqualTo(Double value) {
            addCriterion("pre_TEMP >=", value, "preTemp");
            return (Criteria) this;
        }

        public Criteria andPreTempLessThan(Double value) {
            addCriterion("pre_TEMP <", value, "preTemp");
            return (Criteria) this;
        }

        public Criteria andPreTempLessThanOrEqualTo(Double value) {
            addCriterion("pre_TEMP <=", value, "preTemp");
            return (Criteria) this;
        }

        public Criteria andPreTempIn(List<Double> values) {
            addCriterion("pre_TEMP in", values, "preTemp");
            return (Criteria) this;
        }

        public Criteria andPreTempNotIn(List<Double> values) {
            addCriterion("pre_TEMP not in", values, "preTemp");
            return (Criteria) this;
        }

        public Criteria andPreTempBetween(Double value1, Double value2) {
            addCriterion("pre_TEMP between", value1, value2, "preTemp");
            return (Criteria) this;
        }

        public Criteria andPreTempNotBetween(Double value1, Double value2) {
            addCriterion("pre_TEMP not between", value1, value2, "preTemp");
            return (Criteria) this;
        }

        public Criteria andPreWsIsNull() {
            addCriterion("pre_WS is null");
            return (Criteria) this;
        }

        public Criteria andPreWsIsNotNull() {
            addCriterion("pre_WS is not null");
            return (Criteria) this;
        }

        public Criteria andPreWsEqualTo(Double value) {
            addCriterion("pre_WS =", value, "preWs");
            return (Criteria) this;
        }

        public Criteria andPreWsNotEqualTo(Double value) {
            addCriterion("pre_WS <>", value, "preWs");
            return (Criteria) this;
        }

        public Criteria andPreWsGreaterThan(Double value) {
            addCriterion("pre_WS >", value, "preWs");
            return (Criteria) this;
        }

        public Criteria andPreWsGreaterThanOrEqualTo(Double value) {
            addCriterion("pre_WS >=", value, "preWs");
            return (Criteria) this;
        }

        public Criteria andPreWsLessThan(Double value) {
            addCriterion("pre_WS <", value, "preWs");
            return (Criteria) this;
        }

        public Criteria andPreWsLessThanOrEqualTo(Double value) {
            addCriterion("pre_WS <=", value, "preWs");
            return (Criteria) this;
        }

        public Criteria andPreWsIn(List<Double> values) {
            addCriterion("pre_WS in", values, "preWs");
            return (Criteria) this;
        }

        public Criteria andPreWsNotIn(List<Double> values) {
            addCriterion("pre_WS not in", values, "preWs");
            return (Criteria) this;
        }

        public Criteria andPreWsBetween(Double value1, Double value2) {
            addCriterion("pre_WS between", value1, value2, "preWs");
            return (Criteria) this;
        }

        public Criteria andPreWsNotBetween(Double value1, Double value2) {
            addCriterion("pre_WS not between", value1, value2, "preWs");
            return (Criteria) this;
        }

        public Criteria andPreWdIsNull() {
            addCriterion("pre_WD is null");
            return (Criteria) this;
        }

        public Criteria andPreWdIsNotNull() {
            addCriterion("pre_WD is not null");
            return (Criteria) this;
        }

        public Criteria andPreWdEqualTo(Double value) {
            addCriterion("pre_WD =", value, "preWd");
            return (Criteria) this;
        }

        public Criteria andPreWdNotEqualTo(Double value) {
            addCriterion("pre_WD <>", value, "preWd");
            return (Criteria) this;
        }

        public Criteria andPreWdGreaterThan(Double value) {
            addCriterion("pre_WD >", value, "preWd");
            return (Criteria) this;
        }

        public Criteria andPreWdGreaterThanOrEqualTo(Double value) {
            addCriterion("pre_WD >=", value, "preWd");
            return (Criteria) this;
        }

        public Criteria andPreWdLessThan(Double value) {
            addCriterion("pre_WD <", value, "preWd");
            return (Criteria) this;
        }

        public Criteria andPreWdLessThanOrEqualTo(Double value) {
            addCriterion("pre_WD <=", value, "preWd");
            return (Criteria) this;
        }

        public Criteria andPreWdIn(List<Double> values) {
            addCriterion("pre_WD in", values, "preWd");
            return (Criteria) this;
        }

        public Criteria andPreWdNotIn(List<Double> values) {
            addCriterion("pre_WD not in", values, "preWd");
            return (Criteria) this;
        }

        public Criteria andPreWdBetween(Double value1, Double value2) {
            addCriterion("pre_WD between", value1, value2, "preWd");
            return (Criteria) this;
        }

        public Criteria andPreWdNotBetween(Double value1, Double value2) {
            addCriterion("pre_WD not between", value1, value2, "preWd");
            return (Criteria) this;
        }

        public Criteria andPreRhIsNull() {
            addCriterion("pre_RH is null");
            return (Criteria) this;
        }

        public Criteria andPreRhIsNotNull() {
            addCriterion("pre_RH is not null");
            return (Criteria) this;
        }

        public Criteria andPreRhEqualTo(Double value) {
            addCriterion("pre_RH =", value, "preRh");
            return (Criteria) this;
        }

        public Criteria andPreRhNotEqualTo(Double value) {
            addCriterion("pre_RH <>", value, "preRh");
            return (Criteria) this;
        }

        public Criteria andPreRhGreaterThan(Double value) {
            addCriterion("pre_RH >", value, "preRh");
            return (Criteria) this;
        }

        public Criteria andPreRhGreaterThanOrEqualTo(Double value) {
            addCriterion("pre_RH >=", value, "preRh");
            return (Criteria) this;
        }

        public Criteria andPreRhLessThan(Double value) {
            addCriterion("pre_RH <", value, "preRh");
            return (Criteria) this;
        }

        public Criteria andPreRhLessThanOrEqualTo(Double value) {
            addCriterion("pre_RH <=", value, "preRh");
            return (Criteria) this;
        }

        public Criteria andPreRhIn(List<Double> values) {
            addCriterion("pre_RH in", values, "preRh");
            return (Criteria) this;
        }

        public Criteria andPreRhNotIn(List<Double> values) {
            addCriterion("pre_RH not in", values, "preRh");
            return (Criteria) this;
        }

        public Criteria andPreRhBetween(Double value1, Double value2) {
            addCriterion("pre_RH between", value1, value2, "preRh");
            return (Criteria) this;
        }

        public Criteria andPreRhNotBetween(Double value1, Double value2) {
            addCriterion("pre_RH not between", value1, value2, "preRh");
            return (Criteria) this;
        }

        public Criteria andPreHazeIsNull() {
            addCriterion("pre_haze is null");
            return (Criteria) this;
        }

        public Criteria andPreHazeIsNotNull() {
            addCriterion("pre_haze is not null");
            return (Criteria) this;
        }

        public Criteria andPreHazeEqualTo(Integer value) {
            addCriterion("pre_haze =", value, "preHaze");
            return (Criteria) this;
        }

        public Criteria andPreHazeNotEqualTo(Integer value) {
            addCriterion("pre_haze <>", value, "preHaze");
            return (Criteria) this;
        }

        public Criteria andPreHazeGreaterThan(Integer value) {
            addCriterion("pre_haze >", value, "preHaze");
            return (Criteria) this;
        }

        public Criteria andPreHazeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pre_haze >=", value, "preHaze");
            return (Criteria) this;
        }

        public Criteria andPreHazeLessThan(Integer value) {
            addCriterion("pre_haze <", value, "preHaze");
            return (Criteria) this;
        }

        public Criteria andPreHazeLessThanOrEqualTo(Integer value) {
            addCriterion("pre_haze <=", value, "preHaze");
            return (Criteria) this;
        }

        public Criteria andPreHazeIn(List<Integer> values) {
            addCriterion("pre_haze in", values, "preHaze");
            return (Criteria) this;
        }

        public Criteria andPreHazeNotIn(List<Integer> values) {
            addCriterion("pre_haze not in", values, "preHaze");
            return (Criteria) this;
        }

        public Criteria andPreHazeBetween(Integer value1, Integer value2) {
            addCriterion("pre_haze between", value1, value2, "preHaze");
            return (Criteria) this;
        }

        public Criteria andPreHazeNotBetween(Integer value1, Integer value2) {
            addCriterion("pre_haze not between", value1, value2, "preHaze");
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