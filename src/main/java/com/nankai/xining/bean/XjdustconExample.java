package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class XjdustconExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XjdustconExample() {
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

        public Criteria andDustcontrlIdIsNull() {
            addCriterion("dustcontrl_id is null");
            return (Criteria) this;
        }

        public Criteria andDustcontrlIdIsNotNull() {
            addCriterion("dustcontrl_id is not null");
            return (Criteria) this;
        }

        public Criteria andDustcontrlIdEqualTo(Integer value) {
            addCriterion("dustcontrl_id =", value, "dustcontrlId");
            return (Criteria) this;
        }

        public Criteria andDustcontrlIdNotEqualTo(Integer value) {
            addCriterion("dustcontrl_id <>", value, "dustcontrlId");
            return (Criteria) this;
        }

        public Criteria andDustcontrlIdGreaterThan(Integer value) {
            addCriterion("dustcontrl_id >", value, "dustcontrlId");
            return (Criteria) this;
        }

        public Criteria andDustcontrlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dustcontrl_id >=", value, "dustcontrlId");
            return (Criteria) this;
        }

        public Criteria andDustcontrlIdLessThan(Integer value) {
            addCriterion("dustcontrl_id <", value, "dustcontrlId");
            return (Criteria) this;
        }

        public Criteria andDustcontrlIdLessThanOrEqualTo(Integer value) {
            addCriterion("dustcontrl_id <=", value, "dustcontrlId");
            return (Criteria) this;
        }

        public Criteria andDustcontrlIdIn(List<Integer> values) {
            addCriterion("dustcontrl_id in", values, "dustcontrlId");
            return (Criteria) this;
        }

        public Criteria andDustcontrlIdNotIn(List<Integer> values) {
            addCriterion("dustcontrl_id not in", values, "dustcontrlId");
            return (Criteria) this;
        }

        public Criteria andDustcontrlIdBetween(Integer value1, Integer value2) {
            addCriterion("dustcontrl_id between", value1, value2, "dustcontrlId");
            return (Criteria) this;
        }

        public Criteria andDustcontrlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dustcontrl_id not between", value1, value2, "dustcontrlId");
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

        public Criteria andObjectIsNull() {
            addCriterion("object is null");
            return (Criteria) this;
        }

        public Criteria andObjectIsNotNull() {
            addCriterion("object is not null");
            return (Criteria) this;
        }

        public Criteria andObjectEqualTo(Integer value) {
            addCriterion("object =", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectNotEqualTo(Integer value) {
            addCriterion("object <>", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectGreaterThan(Integer value) {
            addCriterion("object >", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectGreaterThanOrEqualTo(Integer value) {
            addCriterion("object >=", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectLessThan(Integer value) {
            addCriterion("object <", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectLessThanOrEqualTo(Integer value) {
            addCriterion("object <=", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectIn(List<Integer> values) {
            addCriterion("object in", values, "object");
            return (Criteria) this;
        }

        public Criteria andObjectNotIn(List<Integer> values) {
            addCriterion("object not in", values, "object");
            return (Criteria) this;
        }

        public Criteria andObjectBetween(Integer value1, Integer value2) {
            addCriterion("object between", value1, value2, "object");
            return (Criteria) this;
        }

        public Criteria andObjectNotBetween(Integer value1, Integer value2) {
            addCriterion("object not between", value1, value2, "object");
            return (Criteria) this;
        }

        public Criteria andDcTspeffiIsNull() {
            addCriterion("dc_tspeffi is null");
            return (Criteria) this;
        }

        public Criteria andDcTspeffiIsNotNull() {
            addCriterion("dc_tspeffi is not null");
            return (Criteria) this;
        }

        public Criteria andDcTspeffiEqualTo(Double value) {
            addCriterion("dc_tspeffi =", value, "dcTspeffi");
            return (Criteria) this;
        }

        public Criteria andDcTspeffiNotEqualTo(Double value) {
            addCriterion("dc_tspeffi <>", value, "dcTspeffi");
            return (Criteria) this;
        }

        public Criteria andDcTspeffiGreaterThan(Double value) {
            addCriterion("dc_tspeffi >", value, "dcTspeffi");
            return (Criteria) this;
        }

        public Criteria andDcTspeffiGreaterThanOrEqualTo(Double value) {
            addCriterion("dc_tspeffi >=", value, "dcTspeffi");
            return (Criteria) this;
        }

        public Criteria andDcTspeffiLessThan(Double value) {
            addCriterion("dc_tspeffi <", value, "dcTspeffi");
            return (Criteria) this;
        }

        public Criteria andDcTspeffiLessThanOrEqualTo(Double value) {
            addCriterion("dc_tspeffi <=", value, "dcTspeffi");
            return (Criteria) this;
        }

        public Criteria andDcTspeffiIn(List<Double> values) {
            addCriterion("dc_tspeffi in", values, "dcTspeffi");
            return (Criteria) this;
        }

        public Criteria andDcTspeffiNotIn(List<Double> values) {
            addCriterion("dc_tspeffi not in", values, "dcTspeffi");
            return (Criteria) this;
        }

        public Criteria andDcTspeffiBetween(Double value1, Double value2) {
            addCriterion("dc_tspeffi between", value1, value2, "dcTspeffi");
            return (Criteria) this;
        }

        public Criteria andDcTspeffiNotBetween(Double value1, Double value2) {
            addCriterion("dc_tspeffi not between", value1, value2, "dcTspeffi");
            return (Criteria) this;
        }

        public Criteria andDcPm25effiIsNull() {
            addCriterion("dc_pm25effi is null");
            return (Criteria) this;
        }

        public Criteria andDcPm25effiIsNotNull() {
            addCriterion("dc_pm25effi is not null");
            return (Criteria) this;
        }

        public Criteria andDcPm25effiEqualTo(Double value) {
            addCriterion("dc_pm25effi =", value, "dcPm25effi");
            return (Criteria) this;
        }

        public Criteria andDcPm25effiNotEqualTo(Double value) {
            addCriterion("dc_pm25effi <>", value, "dcPm25effi");
            return (Criteria) this;
        }

        public Criteria andDcPm25effiGreaterThan(Double value) {
            addCriterion("dc_pm25effi >", value, "dcPm25effi");
            return (Criteria) this;
        }

        public Criteria andDcPm25effiGreaterThanOrEqualTo(Double value) {
            addCriterion("dc_pm25effi >=", value, "dcPm25effi");
            return (Criteria) this;
        }

        public Criteria andDcPm25effiLessThan(Double value) {
            addCriterion("dc_pm25effi <", value, "dcPm25effi");
            return (Criteria) this;
        }

        public Criteria andDcPm25effiLessThanOrEqualTo(Double value) {
            addCriterion("dc_pm25effi <=", value, "dcPm25effi");
            return (Criteria) this;
        }

        public Criteria andDcPm25effiIn(List<Double> values) {
            addCriterion("dc_pm25effi in", values, "dcPm25effi");
            return (Criteria) this;
        }

        public Criteria andDcPm25effiNotIn(List<Double> values) {
            addCriterion("dc_pm25effi not in", values, "dcPm25effi");
            return (Criteria) this;
        }

        public Criteria andDcPm25effiBetween(Double value1, Double value2) {
            addCriterion("dc_pm25effi between", value1, value2, "dcPm25effi");
            return (Criteria) this;
        }

        public Criteria andDcPm25effiNotBetween(Double value1, Double value2) {
            addCriterion("dc_pm25effi not between", value1, value2, "dcPm25effi");
            return (Criteria) this;
        }

        public Criteria andDcPm10effiIsNull() {
            addCriterion("dc_pm10effi is null");
            return (Criteria) this;
        }

        public Criteria andDcPm10effiIsNotNull() {
            addCriterion("dc_pm10effi is not null");
            return (Criteria) this;
        }

        public Criteria andDcPm10effiEqualTo(Double value) {
            addCriterion("dc_pm10effi =", value, "dcPm10effi");
            return (Criteria) this;
        }

        public Criteria andDcPm10effiNotEqualTo(Double value) {
            addCriterion("dc_pm10effi <>", value, "dcPm10effi");
            return (Criteria) this;
        }

        public Criteria andDcPm10effiGreaterThan(Double value) {
            addCriterion("dc_pm10effi >", value, "dcPm10effi");
            return (Criteria) this;
        }

        public Criteria andDcPm10effiGreaterThanOrEqualTo(Double value) {
            addCriterion("dc_pm10effi >=", value, "dcPm10effi");
            return (Criteria) this;
        }

        public Criteria andDcPm10effiLessThan(Double value) {
            addCriterion("dc_pm10effi <", value, "dcPm10effi");
            return (Criteria) this;
        }

        public Criteria andDcPm10effiLessThanOrEqualTo(Double value) {
            addCriterion("dc_pm10effi <=", value, "dcPm10effi");
            return (Criteria) this;
        }

        public Criteria andDcPm10effiIn(List<Double> values) {
            addCriterion("dc_pm10effi in", values, "dcPm10effi");
            return (Criteria) this;
        }

        public Criteria andDcPm10effiNotIn(List<Double> values) {
            addCriterion("dc_pm10effi not in", values, "dcPm10effi");
            return (Criteria) this;
        }

        public Criteria andDcPm10effiBetween(Double value1, Double value2) {
            addCriterion("dc_pm10effi between", value1, value2, "dcPm10effi");
            return (Criteria) this;
        }

        public Criteria andDcPm10effiNotBetween(Double value1, Double value2) {
            addCriterion("dc_pm10effi not between", value1, value2, "dcPm10effi");
            return (Criteria) this;
        }

        public Criteria andDcVoceffiIsNull() {
            addCriterion("dc_voceffi is null");
            return (Criteria) this;
        }

        public Criteria andDcVoceffiIsNotNull() {
            addCriterion("dc_voceffi is not null");
            return (Criteria) this;
        }

        public Criteria andDcVoceffiEqualTo(Double value) {
            addCriterion("dc_voceffi =", value, "dcVoceffi");
            return (Criteria) this;
        }

        public Criteria andDcVoceffiNotEqualTo(Double value) {
            addCriterion("dc_voceffi <>", value, "dcVoceffi");
            return (Criteria) this;
        }

        public Criteria andDcVoceffiGreaterThan(Double value) {
            addCriterion("dc_voceffi >", value, "dcVoceffi");
            return (Criteria) this;
        }

        public Criteria andDcVoceffiGreaterThanOrEqualTo(Double value) {
            addCriterion("dc_voceffi >=", value, "dcVoceffi");
            return (Criteria) this;
        }

        public Criteria andDcVoceffiLessThan(Double value) {
            addCriterion("dc_voceffi <", value, "dcVoceffi");
            return (Criteria) this;
        }

        public Criteria andDcVoceffiLessThanOrEqualTo(Double value) {
            addCriterion("dc_voceffi <=", value, "dcVoceffi");
            return (Criteria) this;
        }

        public Criteria andDcVoceffiIn(List<Double> values) {
            addCriterion("dc_voceffi in", values, "dcVoceffi");
            return (Criteria) this;
        }

        public Criteria andDcVoceffiNotIn(List<Double> values) {
            addCriterion("dc_voceffi not in", values, "dcVoceffi");
            return (Criteria) this;
        }

        public Criteria andDcVoceffiBetween(Double value1, Double value2) {
            addCriterion("dc_voceffi between", value1, value2, "dcVoceffi");
            return (Criteria) this;
        }

        public Criteria andDcVoceffiNotBetween(Double value1, Double value2) {
            addCriterion("dc_voceffi not between", value1, value2, "dcVoceffi");
            return (Criteria) this;
        }

        public Criteria andDcNh3effiIsNull() {
            addCriterion("dc_nh3effi is null");
            return (Criteria) this;
        }

        public Criteria andDcNh3effiIsNotNull() {
            addCriterion("dc_nh3effi is not null");
            return (Criteria) this;
        }

        public Criteria andDcNh3effiEqualTo(Double value) {
            addCriterion("dc_nh3effi =", value, "dcNh3effi");
            return (Criteria) this;
        }

        public Criteria andDcNh3effiNotEqualTo(Double value) {
            addCriterion("dc_nh3effi <>", value, "dcNh3effi");
            return (Criteria) this;
        }

        public Criteria andDcNh3effiGreaterThan(Double value) {
            addCriterion("dc_nh3effi >", value, "dcNh3effi");
            return (Criteria) this;
        }

        public Criteria andDcNh3effiGreaterThanOrEqualTo(Double value) {
            addCriterion("dc_nh3effi >=", value, "dcNh3effi");
            return (Criteria) this;
        }

        public Criteria andDcNh3effiLessThan(Double value) {
            addCriterion("dc_nh3effi <", value, "dcNh3effi");
            return (Criteria) this;
        }

        public Criteria andDcNh3effiLessThanOrEqualTo(Double value) {
            addCriterion("dc_nh3effi <=", value, "dcNh3effi");
            return (Criteria) this;
        }

        public Criteria andDcNh3effiIn(List<Double> values) {
            addCriterion("dc_nh3effi in", values, "dcNh3effi");
            return (Criteria) this;
        }

        public Criteria andDcNh3effiNotIn(List<Double> values) {
            addCriterion("dc_nh3effi not in", values, "dcNh3effi");
            return (Criteria) this;
        }

        public Criteria andDcNh3effiBetween(Double value1, Double value2) {
            addCriterion("dc_nh3effi between", value1, value2, "dcNh3effi");
            return (Criteria) this;
        }

        public Criteria andDcNh3effiNotBetween(Double value1, Double value2) {
            addCriterion("dc_nh3effi not between", value1, value2, "dcNh3effi");
            return (Criteria) this;
        }

        public Criteria andDcSo2effiIsNull() {
            addCriterion("dc_so2effi is null");
            return (Criteria) this;
        }

        public Criteria andDcSo2effiIsNotNull() {
            addCriterion("dc_so2effi is not null");
            return (Criteria) this;
        }

        public Criteria andDcSo2effiEqualTo(Double value) {
            addCriterion("dc_so2effi =", value, "dcSo2effi");
            return (Criteria) this;
        }

        public Criteria andDcSo2effiNotEqualTo(Double value) {
            addCriterion("dc_so2effi <>", value, "dcSo2effi");
            return (Criteria) this;
        }

        public Criteria andDcSo2effiGreaterThan(Double value) {
            addCriterion("dc_so2effi >", value, "dcSo2effi");
            return (Criteria) this;
        }

        public Criteria andDcSo2effiGreaterThanOrEqualTo(Double value) {
            addCriterion("dc_so2effi >=", value, "dcSo2effi");
            return (Criteria) this;
        }

        public Criteria andDcSo2effiLessThan(Double value) {
            addCriterion("dc_so2effi <", value, "dcSo2effi");
            return (Criteria) this;
        }

        public Criteria andDcSo2effiLessThanOrEqualTo(Double value) {
            addCriterion("dc_so2effi <=", value, "dcSo2effi");
            return (Criteria) this;
        }

        public Criteria andDcSo2effiIn(List<Double> values) {
            addCriterion("dc_so2effi in", values, "dcSo2effi");
            return (Criteria) this;
        }

        public Criteria andDcSo2effiNotIn(List<Double> values) {
            addCriterion("dc_so2effi not in", values, "dcSo2effi");
            return (Criteria) this;
        }

        public Criteria andDcSo2effiBetween(Double value1, Double value2) {
            addCriterion("dc_so2effi between", value1, value2, "dcSo2effi");
            return (Criteria) this;
        }

        public Criteria andDcSo2effiNotBetween(Double value1, Double value2) {
            addCriterion("dc_so2effi not between", value1, value2, "dcSo2effi");
            return (Criteria) this;
        }

        public Criteria andDcCoeffiIsNull() {
            addCriterion("dc_coeffi is null");
            return (Criteria) this;
        }

        public Criteria andDcCoeffiIsNotNull() {
            addCriterion("dc_coeffi is not null");
            return (Criteria) this;
        }

        public Criteria andDcCoeffiEqualTo(Double value) {
            addCriterion("dc_coeffi =", value, "dcCoeffi");
            return (Criteria) this;
        }

        public Criteria andDcCoeffiNotEqualTo(Double value) {
            addCriterion("dc_coeffi <>", value, "dcCoeffi");
            return (Criteria) this;
        }

        public Criteria andDcCoeffiGreaterThan(Double value) {
            addCriterion("dc_coeffi >", value, "dcCoeffi");
            return (Criteria) this;
        }

        public Criteria andDcCoeffiGreaterThanOrEqualTo(Double value) {
            addCriterion("dc_coeffi >=", value, "dcCoeffi");
            return (Criteria) this;
        }

        public Criteria andDcCoeffiLessThan(Double value) {
            addCriterion("dc_coeffi <", value, "dcCoeffi");
            return (Criteria) this;
        }

        public Criteria andDcCoeffiLessThanOrEqualTo(Double value) {
            addCriterion("dc_coeffi <=", value, "dcCoeffi");
            return (Criteria) this;
        }

        public Criteria andDcCoeffiIn(List<Double> values) {
            addCriterion("dc_coeffi in", values, "dcCoeffi");
            return (Criteria) this;
        }

        public Criteria andDcCoeffiNotIn(List<Double> values) {
            addCriterion("dc_coeffi not in", values, "dcCoeffi");
            return (Criteria) this;
        }

        public Criteria andDcCoeffiBetween(Double value1, Double value2) {
            addCriterion("dc_coeffi between", value1, value2, "dcCoeffi");
            return (Criteria) this;
        }

        public Criteria andDcCoeffiNotBetween(Double value1, Double value2) {
            addCriterion("dc_coeffi not between", value1, value2, "dcCoeffi");
            return (Criteria) this;
        }

        public Criteria andDcOceffiIsNull() {
            addCriterion("dc_oceffi is null");
            return (Criteria) this;
        }

        public Criteria andDcOceffiIsNotNull() {
            addCriterion("dc_oceffi is not null");
            return (Criteria) this;
        }

        public Criteria andDcOceffiEqualTo(Double value) {
            addCriterion("dc_oceffi =", value, "dcOceffi");
            return (Criteria) this;
        }

        public Criteria andDcOceffiNotEqualTo(Double value) {
            addCriterion("dc_oceffi <>", value, "dcOceffi");
            return (Criteria) this;
        }

        public Criteria andDcOceffiGreaterThan(Double value) {
            addCriterion("dc_oceffi >", value, "dcOceffi");
            return (Criteria) this;
        }

        public Criteria andDcOceffiGreaterThanOrEqualTo(Double value) {
            addCriterion("dc_oceffi >=", value, "dcOceffi");
            return (Criteria) this;
        }

        public Criteria andDcOceffiLessThan(Double value) {
            addCriterion("dc_oceffi <", value, "dcOceffi");
            return (Criteria) this;
        }

        public Criteria andDcOceffiLessThanOrEqualTo(Double value) {
            addCriterion("dc_oceffi <=", value, "dcOceffi");
            return (Criteria) this;
        }

        public Criteria andDcOceffiIn(List<Double> values) {
            addCriterion("dc_oceffi in", values, "dcOceffi");
            return (Criteria) this;
        }

        public Criteria andDcOceffiNotIn(List<Double> values) {
            addCriterion("dc_oceffi not in", values, "dcOceffi");
            return (Criteria) this;
        }

        public Criteria andDcOceffiBetween(Double value1, Double value2) {
            addCriterion("dc_oceffi between", value1, value2, "dcOceffi");
            return (Criteria) this;
        }

        public Criteria andDcOceffiNotBetween(Double value1, Double value2) {
            addCriterion("dc_oceffi not between", value1, value2, "dcOceffi");
            return (Criteria) this;
        }

        public Criteria andDcBceffiIsNull() {
            addCriterion("dc_bceffi is null");
            return (Criteria) this;
        }

        public Criteria andDcBceffiIsNotNull() {
            addCriterion("dc_bceffi is not null");
            return (Criteria) this;
        }

        public Criteria andDcBceffiEqualTo(Double value) {
            addCriterion("dc_bceffi =", value, "dcBceffi");
            return (Criteria) this;
        }

        public Criteria andDcBceffiNotEqualTo(Double value) {
            addCriterion("dc_bceffi <>", value, "dcBceffi");
            return (Criteria) this;
        }

        public Criteria andDcBceffiGreaterThan(Double value) {
            addCriterion("dc_bceffi >", value, "dcBceffi");
            return (Criteria) this;
        }

        public Criteria andDcBceffiGreaterThanOrEqualTo(Double value) {
            addCriterion("dc_bceffi >=", value, "dcBceffi");
            return (Criteria) this;
        }

        public Criteria andDcBceffiLessThan(Double value) {
            addCriterion("dc_bceffi <", value, "dcBceffi");
            return (Criteria) this;
        }

        public Criteria andDcBceffiLessThanOrEqualTo(Double value) {
            addCriterion("dc_bceffi <=", value, "dcBceffi");
            return (Criteria) this;
        }

        public Criteria andDcBceffiIn(List<Double> values) {
            addCriterion("dc_bceffi in", values, "dcBceffi");
            return (Criteria) this;
        }

        public Criteria andDcBceffiNotIn(List<Double> values) {
            addCriterion("dc_bceffi not in", values, "dcBceffi");
            return (Criteria) this;
        }

        public Criteria andDcBceffiBetween(Double value1, Double value2) {
            addCriterion("dc_bceffi between", value1, value2, "dcBceffi");
            return (Criteria) this;
        }

        public Criteria andDcBceffiNotBetween(Double value1, Double value2) {
            addCriterion("dc_bceffi not between", value1, value2, "dcBceffi");
            return (Criteria) this;
        }

        public Criteria andDcNoxeffiIsNull() {
            addCriterion("dc_noxeffi is null");
            return (Criteria) this;
        }

        public Criteria andDcNoxeffiIsNotNull() {
            addCriterion("dc_noxeffi is not null");
            return (Criteria) this;
        }

        public Criteria andDcNoxeffiEqualTo(Double value) {
            addCriterion("dc_noxeffi =", value, "dcNoxeffi");
            return (Criteria) this;
        }

        public Criteria andDcNoxeffiNotEqualTo(Double value) {
            addCriterion("dc_noxeffi <>", value, "dcNoxeffi");
            return (Criteria) this;
        }

        public Criteria andDcNoxeffiGreaterThan(Double value) {
            addCriterion("dc_noxeffi >", value, "dcNoxeffi");
            return (Criteria) this;
        }

        public Criteria andDcNoxeffiGreaterThanOrEqualTo(Double value) {
            addCriterion("dc_noxeffi >=", value, "dcNoxeffi");
            return (Criteria) this;
        }

        public Criteria andDcNoxeffiLessThan(Double value) {
            addCriterion("dc_noxeffi <", value, "dcNoxeffi");
            return (Criteria) this;
        }

        public Criteria andDcNoxeffiLessThanOrEqualTo(Double value) {
            addCriterion("dc_noxeffi <=", value, "dcNoxeffi");
            return (Criteria) this;
        }

        public Criteria andDcNoxeffiIn(List<Double> values) {
            addCriterion("dc_noxeffi in", values, "dcNoxeffi");
            return (Criteria) this;
        }

        public Criteria andDcNoxeffiNotIn(List<Double> values) {
            addCriterion("dc_noxeffi not in", values, "dcNoxeffi");
            return (Criteria) this;
        }

        public Criteria andDcNoxeffiBetween(Double value1, Double value2) {
            addCriterion("dc_noxeffi between", value1, value2, "dcNoxeffi");
            return (Criteria) this;
        }

        public Criteria andDcNoxeffiNotBetween(Double value1, Double value2) {
            addCriterion("dc_noxeffi not between", value1, value2, "dcNoxeffi");
            return (Criteria) this;
        }

        public Criteria andDusttypeIsNull() {
            addCriterion("dusttype is null");
            return (Criteria) this;
        }

        public Criteria andDusttypeIsNotNull() {
            addCriterion("dusttype is not null");
            return (Criteria) this;
        }

        public Criteria andDusttypeEqualTo(Integer value) {
            addCriterion("dusttype =", value, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeNotEqualTo(Integer value) {
            addCriterion("dusttype <>", value, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeGreaterThan(Integer value) {
            addCriterion("dusttype >", value, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dusttype >=", value, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeLessThan(Integer value) {
            addCriterion("dusttype <", value, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeLessThanOrEqualTo(Integer value) {
            addCriterion("dusttype <=", value, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeIn(List<Integer> values) {
            addCriterion("dusttype in", values, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeNotIn(List<Integer> values) {
            addCriterion("dusttype not in", values, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeBetween(Integer value1, Integer value2) {
            addCriterion("dusttype between", value1, value2, "dusttype");
            return (Criteria) this;
        }

        public Criteria andDusttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("dusttype not between", value1, value2, "dusttype");
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