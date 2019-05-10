package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class XjkabvalueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XjkabvalueExample() {
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

        public Criteria andSdKabvalueidIsNull() {
            addCriterion("sd_kabvalueid is null");
            return (Criteria) this;
        }

        public Criteria andSdKabvalueidIsNotNull() {
            addCriterion("sd_kabvalueid is not null");
            return (Criteria) this;
        }

        public Criteria andSdKabvalueidEqualTo(Integer value) {
            addCriterion("sd_kabvalueid =", value, "sdKabvalueid");
            return (Criteria) this;
        }

        public Criteria andSdKabvalueidNotEqualTo(Integer value) {
            addCriterion("sd_kabvalueid <>", value, "sdKabvalueid");
            return (Criteria) this;
        }

        public Criteria andSdKabvalueidGreaterThan(Integer value) {
            addCriterion("sd_kabvalueid >", value, "sdKabvalueid");
            return (Criteria) this;
        }

        public Criteria andSdKabvalueidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sd_kabvalueid >=", value, "sdKabvalueid");
            return (Criteria) this;
        }

        public Criteria andSdKabvalueidLessThan(Integer value) {
            addCriterion("sd_kabvalueid <", value, "sdKabvalueid");
            return (Criteria) this;
        }

        public Criteria andSdKabvalueidLessThanOrEqualTo(Integer value) {
            addCriterion("sd_kabvalueid <=", value, "sdKabvalueid");
            return (Criteria) this;
        }

        public Criteria andSdKabvalueidIn(List<Integer> values) {
            addCriterion("sd_kabvalueid in", values, "sdKabvalueid");
            return (Criteria) this;
        }

        public Criteria andSdKabvalueidNotIn(List<Integer> values) {
            addCriterion("sd_kabvalueid not in", values, "sdKabvalueid");
            return (Criteria) this;
        }

        public Criteria andSdKabvalueidBetween(Integer value1, Integer value2) {
            addCriterion("sd_kabvalueid between", value1, value2, "sdKabvalueid");
            return (Criteria) this;
        }

        public Criteria andSdKabvalueidNotBetween(Integer value1, Integer value2) {
            addCriterion("sd_kabvalueid not between", value1, value2, "sdKabvalueid");
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

        public Criteria andKPm25valueIsNull() {
            addCriterion("k_pm25value is null");
            return (Criteria) this;
        }

        public Criteria andKPm25valueIsNotNull() {
            addCriterion("k_pm25value is not null");
            return (Criteria) this;
        }

        public Criteria andKPm25valueEqualTo(Double value) {
            addCriterion("k_pm25value =", value, "kPm25value");
            return (Criteria) this;
        }

        public Criteria andKPm25valueNotEqualTo(Double value) {
            addCriterion("k_pm25value <>", value, "kPm25value");
            return (Criteria) this;
        }

        public Criteria andKPm25valueGreaterThan(Double value) {
            addCriterion("k_pm25value >", value, "kPm25value");
            return (Criteria) this;
        }

        public Criteria andKPm25valueGreaterThanOrEqualTo(Double value) {
            addCriterion("k_pm25value >=", value, "kPm25value");
            return (Criteria) this;
        }

        public Criteria andKPm25valueLessThan(Double value) {
            addCriterion("k_pm25value <", value, "kPm25value");
            return (Criteria) this;
        }

        public Criteria andKPm25valueLessThanOrEqualTo(Double value) {
            addCriterion("k_pm25value <=", value, "kPm25value");
            return (Criteria) this;
        }

        public Criteria andKPm25valueIn(List<Double> values) {
            addCriterion("k_pm25value in", values, "kPm25value");
            return (Criteria) this;
        }

        public Criteria andKPm25valueNotIn(List<Double> values) {
            addCriterion("k_pm25value not in", values, "kPm25value");
            return (Criteria) this;
        }

        public Criteria andKPm25valueBetween(Double value1, Double value2) {
            addCriterion("k_pm25value between", value1, value2, "kPm25value");
            return (Criteria) this;
        }

        public Criteria andKPm25valueNotBetween(Double value1, Double value2) {
            addCriterion("k_pm25value not between", value1, value2, "kPm25value");
            return (Criteria) this;
        }

        public Criteria andKPm10valueIsNull() {
            addCriterion("k_pm10value is null");
            return (Criteria) this;
        }

        public Criteria andKPm10valueIsNotNull() {
            addCriterion("k_pm10value is not null");
            return (Criteria) this;
        }

        public Criteria andKPm10valueEqualTo(Double value) {
            addCriterion("k_pm10value =", value, "kPm10value");
            return (Criteria) this;
        }

        public Criteria andKPm10valueNotEqualTo(Double value) {
            addCriterion("k_pm10value <>", value, "kPm10value");
            return (Criteria) this;
        }

        public Criteria andKPm10valueGreaterThan(Double value) {
            addCriterion("k_pm10value >", value, "kPm10value");
            return (Criteria) this;
        }

        public Criteria andKPm10valueGreaterThanOrEqualTo(Double value) {
            addCriterion("k_pm10value >=", value, "kPm10value");
            return (Criteria) this;
        }

        public Criteria andKPm10valueLessThan(Double value) {
            addCriterion("k_pm10value <", value, "kPm10value");
            return (Criteria) this;
        }

        public Criteria andKPm10valueLessThanOrEqualTo(Double value) {
            addCriterion("k_pm10value <=", value, "kPm10value");
            return (Criteria) this;
        }

        public Criteria andKPm10valueIn(List<Double> values) {
            addCriterion("k_pm10value in", values, "kPm10value");
            return (Criteria) this;
        }

        public Criteria andKPm10valueNotIn(List<Double> values) {
            addCriterion("k_pm10value not in", values, "kPm10value");
            return (Criteria) this;
        }

        public Criteria andKPm10valueBetween(Double value1, Double value2) {
            addCriterion("k_pm10value between", value1, value2, "kPm10value");
            return (Criteria) this;
        }

        public Criteria andKPm10valueNotBetween(Double value1, Double value2) {
            addCriterion("k_pm10value not between", value1, value2, "kPm10value");
            return (Criteria) this;
        }

        public Criteria andKVocvalueIsNull() {
            addCriterion("k_vocvalue is null");
            return (Criteria) this;
        }

        public Criteria andKVocvalueIsNotNull() {
            addCriterion("k_vocvalue is not null");
            return (Criteria) this;
        }

        public Criteria andKVocvalueEqualTo(Double value) {
            addCriterion("k_vocvalue =", value, "kVocvalue");
            return (Criteria) this;
        }

        public Criteria andKVocvalueNotEqualTo(Double value) {
            addCriterion("k_vocvalue <>", value, "kVocvalue");
            return (Criteria) this;
        }

        public Criteria andKVocvalueGreaterThan(Double value) {
            addCriterion("k_vocvalue >", value, "kVocvalue");
            return (Criteria) this;
        }

        public Criteria andKVocvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("k_vocvalue >=", value, "kVocvalue");
            return (Criteria) this;
        }

        public Criteria andKVocvalueLessThan(Double value) {
            addCriterion("k_vocvalue <", value, "kVocvalue");
            return (Criteria) this;
        }

        public Criteria andKVocvalueLessThanOrEqualTo(Double value) {
            addCriterion("k_vocvalue <=", value, "kVocvalue");
            return (Criteria) this;
        }

        public Criteria andKVocvalueIn(List<Double> values) {
            addCriterion("k_vocvalue in", values, "kVocvalue");
            return (Criteria) this;
        }

        public Criteria andKVocvalueNotIn(List<Double> values) {
            addCriterion("k_vocvalue not in", values, "kVocvalue");
            return (Criteria) this;
        }

        public Criteria andKVocvalueBetween(Double value1, Double value2) {
            addCriterion("k_vocvalue between", value1, value2, "kVocvalue");
            return (Criteria) this;
        }

        public Criteria andKVocvalueNotBetween(Double value1, Double value2) {
            addCriterion("k_vocvalue not between", value1, value2, "kVocvalue");
            return (Criteria) this;
        }

        public Criteria andKNh3valueIsNull() {
            addCriterion("k_nh3value is null");
            return (Criteria) this;
        }

        public Criteria andKNh3valueIsNotNull() {
            addCriterion("k_nh3value is not null");
            return (Criteria) this;
        }

        public Criteria andKNh3valueEqualTo(Double value) {
            addCriterion("k_nh3value =", value, "kNh3value");
            return (Criteria) this;
        }

        public Criteria andKNh3valueNotEqualTo(Double value) {
            addCriterion("k_nh3value <>", value, "kNh3value");
            return (Criteria) this;
        }

        public Criteria andKNh3valueGreaterThan(Double value) {
            addCriterion("k_nh3value >", value, "kNh3value");
            return (Criteria) this;
        }

        public Criteria andKNh3valueGreaterThanOrEqualTo(Double value) {
            addCriterion("k_nh3value >=", value, "kNh3value");
            return (Criteria) this;
        }

        public Criteria andKNh3valueLessThan(Double value) {
            addCriterion("k_nh3value <", value, "kNh3value");
            return (Criteria) this;
        }

        public Criteria andKNh3valueLessThanOrEqualTo(Double value) {
            addCriterion("k_nh3value <=", value, "kNh3value");
            return (Criteria) this;
        }

        public Criteria andKNh3valueIn(List<Double> values) {
            addCriterion("k_nh3value in", values, "kNh3value");
            return (Criteria) this;
        }

        public Criteria andKNh3valueNotIn(List<Double> values) {
            addCriterion("k_nh3value not in", values, "kNh3value");
            return (Criteria) this;
        }

        public Criteria andKNh3valueBetween(Double value1, Double value2) {
            addCriterion("k_nh3value between", value1, value2, "kNh3value");
            return (Criteria) this;
        }

        public Criteria andKNh3valueNotBetween(Double value1, Double value2) {
            addCriterion("k_nh3value not between", value1, value2, "kNh3value");
            return (Criteria) this;
        }

        public Criteria andKSo2valueIsNull() {
            addCriterion("k_so2value is null");
            return (Criteria) this;
        }

        public Criteria andKSo2valueIsNotNull() {
            addCriterion("k_so2value is not null");
            return (Criteria) this;
        }

        public Criteria andKSo2valueEqualTo(Double value) {
            addCriterion("k_so2value =", value, "kSo2value");
            return (Criteria) this;
        }

        public Criteria andKSo2valueNotEqualTo(Double value) {
            addCriterion("k_so2value <>", value, "kSo2value");
            return (Criteria) this;
        }

        public Criteria andKSo2valueGreaterThan(Double value) {
            addCriterion("k_so2value >", value, "kSo2value");
            return (Criteria) this;
        }

        public Criteria andKSo2valueGreaterThanOrEqualTo(Double value) {
            addCriterion("k_so2value >=", value, "kSo2value");
            return (Criteria) this;
        }

        public Criteria andKSo2valueLessThan(Double value) {
            addCriterion("k_so2value <", value, "kSo2value");
            return (Criteria) this;
        }

        public Criteria andKSo2valueLessThanOrEqualTo(Double value) {
            addCriterion("k_so2value <=", value, "kSo2value");
            return (Criteria) this;
        }

        public Criteria andKSo2valueIn(List<Double> values) {
            addCriterion("k_so2value in", values, "kSo2value");
            return (Criteria) this;
        }

        public Criteria andKSo2valueNotIn(List<Double> values) {
            addCriterion("k_so2value not in", values, "kSo2value");
            return (Criteria) this;
        }

        public Criteria andKSo2valueBetween(Double value1, Double value2) {
            addCriterion("k_so2value between", value1, value2, "kSo2value");
            return (Criteria) this;
        }

        public Criteria andKSo2valueNotBetween(Double value1, Double value2) {
            addCriterion("k_so2value not between", value1, value2, "kSo2value");
            return (Criteria) this;
        }

        public Criteria andKCovalueIsNull() {
            addCriterion("k_covalue is null");
            return (Criteria) this;
        }

        public Criteria andKCovalueIsNotNull() {
            addCriterion("k_covalue is not null");
            return (Criteria) this;
        }

        public Criteria andKCovalueEqualTo(Double value) {
            addCriterion("k_covalue =", value, "kCovalue");
            return (Criteria) this;
        }

        public Criteria andKCovalueNotEqualTo(Double value) {
            addCriterion("k_covalue <>", value, "kCovalue");
            return (Criteria) this;
        }

        public Criteria andKCovalueGreaterThan(Double value) {
            addCriterion("k_covalue >", value, "kCovalue");
            return (Criteria) this;
        }

        public Criteria andKCovalueGreaterThanOrEqualTo(Double value) {
            addCriterion("k_covalue >=", value, "kCovalue");
            return (Criteria) this;
        }

        public Criteria andKCovalueLessThan(Double value) {
            addCriterion("k_covalue <", value, "kCovalue");
            return (Criteria) this;
        }

        public Criteria andKCovalueLessThanOrEqualTo(Double value) {
            addCriterion("k_covalue <=", value, "kCovalue");
            return (Criteria) this;
        }

        public Criteria andKCovalueIn(List<Double> values) {
            addCriterion("k_covalue in", values, "kCovalue");
            return (Criteria) this;
        }

        public Criteria andKCovalueNotIn(List<Double> values) {
            addCriterion("k_covalue not in", values, "kCovalue");
            return (Criteria) this;
        }

        public Criteria andKCovalueBetween(Double value1, Double value2) {
            addCriterion("k_covalue between", value1, value2, "kCovalue");
            return (Criteria) this;
        }

        public Criteria andKCovalueNotBetween(Double value1, Double value2) {
            addCriterion("k_covalue not between", value1, value2, "kCovalue");
            return (Criteria) this;
        }

        public Criteria andKOcvalueIsNull() {
            addCriterion("k_ocvalue is null");
            return (Criteria) this;
        }

        public Criteria andKOcvalueIsNotNull() {
            addCriterion("k_ocvalue is not null");
            return (Criteria) this;
        }

        public Criteria andKOcvalueEqualTo(Double value) {
            addCriterion("k_ocvalue =", value, "kOcvalue");
            return (Criteria) this;
        }

        public Criteria andKOcvalueNotEqualTo(Double value) {
            addCriterion("k_ocvalue <>", value, "kOcvalue");
            return (Criteria) this;
        }

        public Criteria andKOcvalueGreaterThan(Double value) {
            addCriterion("k_ocvalue >", value, "kOcvalue");
            return (Criteria) this;
        }

        public Criteria andKOcvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("k_ocvalue >=", value, "kOcvalue");
            return (Criteria) this;
        }

        public Criteria andKOcvalueLessThan(Double value) {
            addCriterion("k_ocvalue <", value, "kOcvalue");
            return (Criteria) this;
        }

        public Criteria andKOcvalueLessThanOrEqualTo(Double value) {
            addCriterion("k_ocvalue <=", value, "kOcvalue");
            return (Criteria) this;
        }

        public Criteria andKOcvalueIn(List<Double> values) {
            addCriterion("k_ocvalue in", values, "kOcvalue");
            return (Criteria) this;
        }

        public Criteria andKOcvalueNotIn(List<Double> values) {
            addCriterion("k_ocvalue not in", values, "kOcvalue");
            return (Criteria) this;
        }

        public Criteria andKOcvalueBetween(Double value1, Double value2) {
            addCriterion("k_ocvalue between", value1, value2, "kOcvalue");
            return (Criteria) this;
        }

        public Criteria andKOcvalueNotBetween(Double value1, Double value2) {
            addCriterion("k_ocvalue not between", value1, value2, "kOcvalue");
            return (Criteria) this;
        }

        public Criteria andKBcvalueIsNull() {
            addCriterion("k_bcvalue is null");
            return (Criteria) this;
        }

        public Criteria andKBcvalueIsNotNull() {
            addCriterion("k_bcvalue is not null");
            return (Criteria) this;
        }

        public Criteria andKBcvalueEqualTo(Double value) {
            addCriterion("k_bcvalue =", value, "kBcvalue");
            return (Criteria) this;
        }

        public Criteria andKBcvalueNotEqualTo(Double value) {
            addCriterion("k_bcvalue <>", value, "kBcvalue");
            return (Criteria) this;
        }

        public Criteria andKBcvalueGreaterThan(Double value) {
            addCriterion("k_bcvalue >", value, "kBcvalue");
            return (Criteria) this;
        }

        public Criteria andKBcvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("k_bcvalue >=", value, "kBcvalue");
            return (Criteria) this;
        }

        public Criteria andKBcvalueLessThan(Double value) {
            addCriterion("k_bcvalue <", value, "kBcvalue");
            return (Criteria) this;
        }

        public Criteria andKBcvalueLessThanOrEqualTo(Double value) {
            addCriterion("k_bcvalue <=", value, "kBcvalue");
            return (Criteria) this;
        }

        public Criteria andKBcvalueIn(List<Double> values) {
            addCriterion("k_bcvalue in", values, "kBcvalue");
            return (Criteria) this;
        }

        public Criteria andKBcvalueNotIn(List<Double> values) {
            addCriterion("k_bcvalue not in", values, "kBcvalue");
            return (Criteria) this;
        }

        public Criteria andKBcvalueBetween(Double value1, Double value2) {
            addCriterion("k_bcvalue between", value1, value2, "kBcvalue");
            return (Criteria) this;
        }

        public Criteria andKBcvalueNotBetween(Double value1, Double value2) {
            addCriterion("k_bcvalue not between", value1, value2, "kBcvalue");
            return (Criteria) this;
        }

        public Criteria andKNoxvalueIsNull() {
            addCriterion("k_noxvalue is null");
            return (Criteria) this;
        }

        public Criteria andKNoxvalueIsNotNull() {
            addCriterion("k_noxvalue is not null");
            return (Criteria) this;
        }

        public Criteria andKNoxvalueEqualTo(Double value) {
            addCriterion("k_noxvalue =", value, "kNoxvalue");
            return (Criteria) this;
        }

        public Criteria andKNoxvalueNotEqualTo(Double value) {
            addCriterion("k_noxvalue <>", value, "kNoxvalue");
            return (Criteria) this;
        }

        public Criteria andKNoxvalueGreaterThan(Double value) {
            addCriterion("k_noxvalue >", value, "kNoxvalue");
            return (Criteria) this;
        }

        public Criteria andKNoxvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("k_noxvalue >=", value, "kNoxvalue");
            return (Criteria) this;
        }

        public Criteria andKNoxvalueLessThan(Double value) {
            addCriterion("k_noxvalue <", value, "kNoxvalue");
            return (Criteria) this;
        }

        public Criteria andKNoxvalueLessThanOrEqualTo(Double value) {
            addCriterion("k_noxvalue <=", value, "kNoxvalue");
            return (Criteria) this;
        }

        public Criteria andKNoxvalueIn(List<Double> values) {
            addCriterion("k_noxvalue in", values, "kNoxvalue");
            return (Criteria) this;
        }

        public Criteria andKNoxvalueNotIn(List<Double> values) {
            addCriterion("k_noxvalue not in", values, "kNoxvalue");
            return (Criteria) this;
        }

        public Criteria andKNoxvalueBetween(Double value1, Double value2) {
            addCriterion("k_noxvalue between", value1, value2, "kNoxvalue");
            return (Criteria) this;
        }

        public Criteria andKNoxvalueNotBetween(Double value1, Double value2) {
            addCriterion("k_noxvalue not between", value1, value2, "kNoxvalue");
            return (Criteria) this;
        }

        public Criteria andAPm25valueIsNull() {
            addCriterion("a_pm25value is null");
            return (Criteria) this;
        }

        public Criteria andAPm25valueIsNotNull() {
            addCriterion("a_pm25value is not null");
            return (Criteria) this;
        }

        public Criteria andAPm25valueEqualTo(Double value) {
            addCriterion("a_pm25value =", value, "aPm25value");
            return (Criteria) this;
        }

        public Criteria andAPm25valueNotEqualTo(Double value) {
            addCriterion("a_pm25value <>", value, "aPm25value");
            return (Criteria) this;
        }

        public Criteria andAPm25valueGreaterThan(Double value) {
            addCriterion("a_pm25value >", value, "aPm25value");
            return (Criteria) this;
        }

        public Criteria andAPm25valueGreaterThanOrEqualTo(Double value) {
            addCriterion("a_pm25value >=", value, "aPm25value");
            return (Criteria) this;
        }

        public Criteria andAPm25valueLessThan(Double value) {
            addCriterion("a_pm25value <", value, "aPm25value");
            return (Criteria) this;
        }

        public Criteria andAPm25valueLessThanOrEqualTo(Double value) {
            addCriterion("a_pm25value <=", value, "aPm25value");
            return (Criteria) this;
        }

        public Criteria andAPm25valueIn(List<Double> values) {
            addCriterion("a_pm25value in", values, "aPm25value");
            return (Criteria) this;
        }

        public Criteria andAPm25valueNotIn(List<Double> values) {
            addCriterion("a_pm25value not in", values, "aPm25value");
            return (Criteria) this;
        }

        public Criteria andAPm25valueBetween(Double value1, Double value2) {
            addCriterion("a_pm25value between", value1, value2, "aPm25value");
            return (Criteria) this;
        }

        public Criteria andAPm25valueNotBetween(Double value1, Double value2) {
            addCriterion("a_pm25value not between", value1, value2, "aPm25value");
            return (Criteria) this;
        }

        public Criteria andAPm10valueIsNull() {
            addCriterion("a_pm10value is null");
            return (Criteria) this;
        }

        public Criteria andAPm10valueIsNotNull() {
            addCriterion("a_pm10value is not null");
            return (Criteria) this;
        }

        public Criteria andAPm10valueEqualTo(Double value) {
            addCriterion("a_pm10value =", value, "aPm10value");
            return (Criteria) this;
        }

        public Criteria andAPm10valueNotEqualTo(Double value) {
            addCriterion("a_pm10value <>", value, "aPm10value");
            return (Criteria) this;
        }

        public Criteria andAPm10valueGreaterThan(Double value) {
            addCriterion("a_pm10value >", value, "aPm10value");
            return (Criteria) this;
        }

        public Criteria andAPm10valueGreaterThanOrEqualTo(Double value) {
            addCriterion("a_pm10value >=", value, "aPm10value");
            return (Criteria) this;
        }

        public Criteria andAPm10valueLessThan(Double value) {
            addCriterion("a_pm10value <", value, "aPm10value");
            return (Criteria) this;
        }

        public Criteria andAPm10valueLessThanOrEqualTo(Double value) {
            addCriterion("a_pm10value <=", value, "aPm10value");
            return (Criteria) this;
        }

        public Criteria andAPm10valueIn(List<Double> values) {
            addCriterion("a_pm10value in", values, "aPm10value");
            return (Criteria) this;
        }

        public Criteria andAPm10valueNotIn(List<Double> values) {
            addCriterion("a_pm10value not in", values, "aPm10value");
            return (Criteria) this;
        }

        public Criteria andAPm10valueBetween(Double value1, Double value2) {
            addCriterion("a_pm10value between", value1, value2, "aPm10value");
            return (Criteria) this;
        }

        public Criteria andAPm10valueNotBetween(Double value1, Double value2) {
            addCriterion("a_pm10value not between", value1, value2, "aPm10value");
            return (Criteria) this;
        }

        public Criteria andAVocvalueIsNull() {
            addCriterion("a_vocvalue is null");
            return (Criteria) this;
        }

        public Criteria andAVocvalueIsNotNull() {
            addCriterion("a_vocvalue is not null");
            return (Criteria) this;
        }

        public Criteria andAVocvalueEqualTo(Double value) {
            addCriterion("a_vocvalue =", value, "aVocvalue");
            return (Criteria) this;
        }

        public Criteria andAVocvalueNotEqualTo(Double value) {
            addCriterion("a_vocvalue <>", value, "aVocvalue");
            return (Criteria) this;
        }

        public Criteria andAVocvalueGreaterThan(Double value) {
            addCriterion("a_vocvalue >", value, "aVocvalue");
            return (Criteria) this;
        }

        public Criteria andAVocvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("a_vocvalue >=", value, "aVocvalue");
            return (Criteria) this;
        }

        public Criteria andAVocvalueLessThan(Double value) {
            addCriterion("a_vocvalue <", value, "aVocvalue");
            return (Criteria) this;
        }

        public Criteria andAVocvalueLessThanOrEqualTo(Double value) {
            addCriterion("a_vocvalue <=", value, "aVocvalue");
            return (Criteria) this;
        }

        public Criteria andAVocvalueIn(List<Double> values) {
            addCriterion("a_vocvalue in", values, "aVocvalue");
            return (Criteria) this;
        }

        public Criteria andAVocvalueNotIn(List<Double> values) {
            addCriterion("a_vocvalue not in", values, "aVocvalue");
            return (Criteria) this;
        }

        public Criteria andAVocvalueBetween(Double value1, Double value2) {
            addCriterion("a_vocvalue between", value1, value2, "aVocvalue");
            return (Criteria) this;
        }

        public Criteria andAVocvalueNotBetween(Double value1, Double value2) {
            addCriterion("a_vocvalue not between", value1, value2, "aVocvalue");
            return (Criteria) this;
        }

        public Criteria andANh3valueIsNull() {
            addCriterion("a_nh3value is null");
            return (Criteria) this;
        }

        public Criteria andANh3valueIsNotNull() {
            addCriterion("a_nh3value is not null");
            return (Criteria) this;
        }

        public Criteria andANh3valueEqualTo(Double value) {
            addCriterion("a_nh3value =", value, "aNh3value");
            return (Criteria) this;
        }

        public Criteria andANh3valueNotEqualTo(Double value) {
            addCriterion("a_nh3value <>", value, "aNh3value");
            return (Criteria) this;
        }

        public Criteria andANh3valueGreaterThan(Double value) {
            addCriterion("a_nh3value >", value, "aNh3value");
            return (Criteria) this;
        }

        public Criteria andANh3valueGreaterThanOrEqualTo(Double value) {
            addCriterion("a_nh3value >=", value, "aNh3value");
            return (Criteria) this;
        }

        public Criteria andANh3valueLessThan(Double value) {
            addCriterion("a_nh3value <", value, "aNh3value");
            return (Criteria) this;
        }

        public Criteria andANh3valueLessThanOrEqualTo(Double value) {
            addCriterion("a_nh3value <=", value, "aNh3value");
            return (Criteria) this;
        }

        public Criteria andANh3valueIn(List<Double> values) {
            addCriterion("a_nh3value in", values, "aNh3value");
            return (Criteria) this;
        }

        public Criteria andANh3valueNotIn(List<Double> values) {
            addCriterion("a_nh3value not in", values, "aNh3value");
            return (Criteria) this;
        }

        public Criteria andANh3valueBetween(Double value1, Double value2) {
            addCriterion("a_nh3value between", value1, value2, "aNh3value");
            return (Criteria) this;
        }

        public Criteria andANh3valueNotBetween(Double value1, Double value2) {
            addCriterion("a_nh3value not between", value1, value2, "aNh3value");
            return (Criteria) this;
        }

        public Criteria andASo2valueIsNull() {
            addCriterion("a_so2value is null");
            return (Criteria) this;
        }

        public Criteria andASo2valueIsNotNull() {
            addCriterion("a_so2value is not null");
            return (Criteria) this;
        }

        public Criteria andASo2valueEqualTo(Double value) {
            addCriterion("a_so2value =", value, "aSo2value");
            return (Criteria) this;
        }

        public Criteria andASo2valueNotEqualTo(Double value) {
            addCriterion("a_so2value <>", value, "aSo2value");
            return (Criteria) this;
        }

        public Criteria andASo2valueGreaterThan(Double value) {
            addCriterion("a_so2value >", value, "aSo2value");
            return (Criteria) this;
        }

        public Criteria andASo2valueGreaterThanOrEqualTo(Double value) {
            addCriterion("a_so2value >=", value, "aSo2value");
            return (Criteria) this;
        }

        public Criteria andASo2valueLessThan(Double value) {
            addCriterion("a_so2value <", value, "aSo2value");
            return (Criteria) this;
        }

        public Criteria andASo2valueLessThanOrEqualTo(Double value) {
            addCriterion("a_so2value <=", value, "aSo2value");
            return (Criteria) this;
        }

        public Criteria andASo2valueIn(List<Double> values) {
            addCriterion("a_so2value in", values, "aSo2value");
            return (Criteria) this;
        }

        public Criteria andASo2valueNotIn(List<Double> values) {
            addCriterion("a_so2value not in", values, "aSo2value");
            return (Criteria) this;
        }

        public Criteria andASo2valueBetween(Double value1, Double value2) {
            addCriterion("a_so2value between", value1, value2, "aSo2value");
            return (Criteria) this;
        }

        public Criteria andASo2valueNotBetween(Double value1, Double value2) {
            addCriterion("a_so2value not between", value1, value2, "aSo2value");
            return (Criteria) this;
        }

        public Criteria andACovalueIsNull() {
            addCriterion("a_covalue is null");
            return (Criteria) this;
        }

        public Criteria andACovalueIsNotNull() {
            addCriterion("a_covalue is not null");
            return (Criteria) this;
        }

        public Criteria andACovalueEqualTo(Double value) {
            addCriterion("a_covalue =", value, "aCovalue");
            return (Criteria) this;
        }

        public Criteria andACovalueNotEqualTo(Double value) {
            addCriterion("a_covalue <>", value, "aCovalue");
            return (Criteria) this;
        }

        public Criteria andACovalueGreaterThan(Double value) {
            addCriterion("a_covalue >", value, "aCovalue");
            return (Criteria) this;
        }

        public Criteria andACovalueGreaterThanOrEqualTo(Double value) {
            addCriterion("a_covalue >=", value, "aCovalue");
            return (Criteria) this;
        }

        public Criteria andACovalueLessThan(Double value) {
            addCriterion("a_covalue <", value, "aCovalue");
            return (Criteria) this;
        }

        public Criteria andACovalueLessThanOrEqualTo(Double value) {
            addCriterion("a_covalue <=", value, "aCovalue");
            return (Criteria) this;
        }

        public Criteria andACovalueIn(List<Double> values) {
            addCriterion("a_covalue in", values, "aCovalue");
            return (Criteria) this;
        }

        public Criteria andACovalueNotIn(List<Double> values) {
            addCriterion("a_covalue not in", values, "aCovalue");
            return (Criteria) this;
        }

        public Criteria andACovalueBetween(Double value1, Double value2) {
            addCriterion("a_covalue between", value1, value2, "aCovalue");
            return (Criteria) this;
        }

        public Criteria andACovalueNotBetween(Double value1, Double value2) {
            addCriterion("a_covalue not between", value1, value2, "aCovalue");
            return (Criteria) this;
        }

        public Criteria andAOcvalueIsNull() {
            addCriterion("a_ocvalue is null");
            return (Criteria) this;
        }

        public Criteria andAOcvalueIsNotNull() {
            addCriterion("a_ocvalue is not null");
            return (Criteria) this;
        }

        public Criteria andAOcvalueEqualTo(Double value) {
            addCriterion("a_ocvalue =", value, "aOcvalue");
            return (Criteria) this;
        }

        public Criteria andAOcvalueNotEqualTo(Double value) {
            addCriterion("a_ocvalue <>", value, "aOcvalue");
            return (Criteria) this;
        }

        public Criteria andAOcvalueGreaterThan(Double value) {
            addCriterion("a_ocvalue >", value, "aOcvalue");
            return (Criteria) this;
        }

        public Criteria andAOcvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("a_ocvalue >=", value, "aOcvalue");
            return (Criteria) this;
        }

        public Criteria andAOcvalueLessThan(Double value) {
            addCriterion("a_ocvalue <", value, "aOcvalue");
            return (Criteria) this;
        }

        public Criteria andAOcvalueLessThanOrEqualTo(Double value) {
            addCriterion("a_ocvalue <=", value, "aOcvalue");
            return (Criteria) this;
        }

        public Criteria andAOcvalueIn(List<Double> values) {
            addCriterion("a_ocvalue in", values, "aOcvalue");
            return (Criteria) this;
        }

        public Criteria andAOcvalueNotIn(List<Double> values) {
            addCriterion("a_ocvalue not in", values, "aOcvalue");
            return (Criteria) this;
        }

        public Criteria andAOcvalueBetween(Double value1, Double value2) {
            addCriterion("a_ocvalue between", value1, value2, "aOcvalue");
            return (Criteria) this;
        }

        public Criteria andAOcvalueNotBetween(Double value1, Double value2) {
            addCriterion("a_ocvalue not between", value1, value2, "aOcvalue");
            return (Criteria) this;
        }

        public Criteria andABcvalueIsNull() {
            addCriterion("a_bcvalue is null");
            return (Criteria) this;
        }

        public Criteria andABcvalueIsNotNull() {
            addCriterion("a_bcvalue is not null");
            return (Criteria) this;
        }

        public Criteria andABcvalueEqualTo(Double value) {
            addCriterion("a_bcvalue =", value, "aBcvalue");
            return (Criteria) this;
        }

        public Criteria andABcvalueNotEqualTo(Double value) {
            addCriterion("a_bcvalue <>", value, "aBcvalue");
            return (Criteria) this;
        }

        public Criteria andABcvalueGreaterThan(Double value) {
            addCriterion("a_bcvalue >", value, "aBcvalue");
            return (Criteria) this;
        }

        public Criteria andABcvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("a_bcvalue >=", value, "aBcvalue");
            return (Criteria) this;
        }

        public Criteria andABcvalueLessThan(Double value) {
            addCriterion("a_bcvalue <", value, "aBcvalue");
            return (Criteria) this;
        }

        public Criteria andABcvalueLessThanOrEqualTo(Double value) {
            addCriterion("a_bcvalue <=", value, "aBcvalue");
            return (Criteria) this;
        }

        public Criteria andABcvalueIn(List<Double> values) {
            addCriterion("a_bcvalue in", values, "aBcvalue");
            return (Criteria) this;
        }

        public Criteria andABcvalueNotIn(List<Double> values) {
            addCriterion("a_bcvalue not in", values, "aBcvalue");
            return (Criteria) this;
        }

        public Criteria andABcvalueBetween(Double value1, Double value2) {
            addCriterion("a_bcvalue between", value1, value2, "aBcvalue");
            return (Criteria) this;
        }

        public Criteria andABcvalueNotBetween(Double value1, Double value2) {
            addCriterion("a_bcvalue not between", value1, value2, "aBcvalue");
            return (Criteria) this;
        }

        public Criteria andANoxvalueIsNull() {
            addCriterion("a_noxvalue is null");
            return (Criteria) this;
        }

        public Criteria andANoxvalueIsNotNull() {
            addCriterion("a_noxvalue is not null");
            return (Criteria) this;
        }

        public Criteria andANoxvalueEqualTo(Double value) {
            addCriterion("a_noxvalue =", value, "aNoxvalue");
            return (Criteria) this;
        }

        public Criteria andANoxvalueNotEqualTo(Double value) {
            addCriterion("a_noxvalue <>", value, "aNoxvalue");
            return (Criteria) this;
        }

        public Criteria andANoxvalueGreaterThan(Double value) {
            addCriterion("a_noxvalue >", value, "aNoxvalue");
            return (Criteria) this;
        }

        public Criteria andANoxvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("a_noxvalue >=", value, "aNoxvalue");
            return (Criteria) this;
        }

        public Criteria andANoxvalueLessThan(Double value) {
            addCriterion("a_noxvalue <", value, "aNoxvalue");
            return (Criteria) this;
        }

        public Criteria andANoxvalueLessThanOrEqualTo(Double value) {
            addCriterion("a_noxvalue <=", value, "aNoxvalue");
            return (Criteria) this;
        }

        public Criteria andANoxvalueIn(List<Double> values) {
            addCriterion("a_noxvalue in", values, "aNoxvalue");
            return (Criteria) this;
        }

        public Criteria andANoxvalueNotIn(List<Double> values) {
            addCriterion("a_noxvalue not in", values, "aNoxvalue");
            return (Criteria) this;
        }

        public Criteria andANoxvalueBetween(Double value1, Double value2) {
            addCriterion("a_noxvalue between", value1, value2, "aNoxvalue");
            return (Criteria) this;
        }

        public Criteria andANoxvalueNotBetween(Double value1, Double value2) {
            addCriterion("a_noxvalue not between", value1, value2, "aNoxvalue");
            return (Criteria) this;
        }

        public Criteria andBPm10valueIsNull() {
            addCriterion("b_pm10value is null");
            return (Criteria) this;
        }

        public Criteria andBPm10valueIsNotNull() {
            addCriterion("b_pm10value is not null");
            return (Criteria) this;
        }

        public Criteria andBPm10valueEqualTo(Double value) {
            addCriterion("b_pm10value =", value, "bPm10value");
            return (Criteria) this;
        }

        public Criteria andBPm10valueNotEqualTo(Double value) {
            addCriterion("b_pm10value <>", value, "bPm10value");
            return (Criteria) this;
        }

        public Criteria andBPm10valueGreaterThan(Double value) {
            addCriterion("b_pm10value >", value, "bPm10value");
            return (Criteria) this;
        }

        public Criteria andBPm10valueGreaterThanOrEqualTo(Double value) {
            addCriterion("b_pm10value >=", value, "bPm10value");
            return (Criteria) this;
        }

        public Criteria andBPm10valueLessThan(Double value) {
            addCriterion("b_pm10value <", value, "bPm10value");
            return (Criteria) this;
        }

        public Criteria andBPm10valueLessThanOrEqualTo(Double value) {
            addCriterion("b_pm10value <=", value, "bPm10value");
            return (Criteria) this;
        }

        public Criteria andBPm10valueIn(List<Double> values) {
            addCriterion("b_pm10value in", values, "bPm10value");
            return (Criteria) this;
        }

        public Criteria andBPm10valueNotIn(List<Double> values) {
            addCriterion("b_pm10value not in", values, "bPm10value");
            return (Criteria) this;
        }

        public Criteria andBPm10valueBetween(Double value1, Double value2) {
            addCriterion("b_pm10value between", value1, value2, "bPm10value");
            return (Criteria) this;
        }

        public Criteria andBPm10valueNotBetween(Double value1, Double value2) {
            addCriterion("b_pm10value not between", value1, value2, "bPm10value");
            return (Criteria) this;
        }

        public Criteria andBVocvalueIsNull() {
            addCriterion("b_vocvalue is null");
            return (Criteria) this;
        }

        public Criteria andBVocvalueIsNotNull() {
            addCriterion("b_vocvalue is not null");
            return (Criteria) this;
        }

        public Criteria andBVocvalueEqualTo(Double value) {
            addCriterion("b_vocvalue =", value, "bVocvalue");
            return (Criteria) this;
        }

        public Criteria andBVocvalueNotEqualTo(Double value) {
            addCriterion("b_vocvalue <>", value, "bVocvalue");
            return (Criteria) this;
        }

        public Criteria andBVocvalueGreaterThan(Double value) {
            addCriterion("b_vocvalue >", value, "bVocvalue");
            return (Criteria) this;
        }

        public Criteria andBVocvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("b_vocvalue >=", value, "bVocvalue");
            return (Criteria) this;
        }

        public Criteria andBVocvalueLessThan(Double value) {
            addCriterion("b_vocvalue <", value, "bVocvalue");
            return (Criteria) this;
        }

        public Criteria andBVocvalueLessThanOrEqualTo(Double value) {
            addCriterion("b_vocvalue <=", value, "bVocvalue");
            return (Criteria) this;
        }

        public Criteria andBVocvalueIn(List<Double> values) {
            addCriterion("b_vocvalue in", values, "bVocvalue");
            return (Criteria) this;
        }

        public Criteria andBVocvalueNotIn(List<Double> values) {
            addCriterion("b_vocvalue not in", values, "bVocvalue");
            return (Criteria) this;
        }

        public Criteria andBVocvalueBetween(Double value1, Double value2) {
            addCriterion("b_vocvalue between", value1, value2, "bVocvalue");
            return (Criteria) this;
        }

        public Criteria andBVocvalueNotBetween(Double value1, Double value2) {
            addCriterion("b_vocvalue not between", value1, value2, "bVocvalue");
            return (Criteria) this;
        }

        public Criteria andBNh3valueIsNull() {
            addCriterion("b_nh3value is null");
            return (Criteria) this;
        }

        public Criteria andBNh3valueIsNotNull() {
            addCriterion("b_nh3value is not null");
            return (Criteria) this;
        }

        public Criteria andBNh3valueEqualTo(Double value) {
            addCriterion("b_nh3value =", value, "bNh3value");
            return (Criteria) this;
        }

        public Criteria andBNh3valueNotEqualTo(Double value) {
            addCriterion("b_nh3value <>", value, "bNh3value");
            return (Criteria) this;
        }

        public Criteria andBNh3valueGreaterThan(Double value) {
            addCriterion("b_nh3value >", value, "bNh3value");
            return (Criteria) this;
        }

        public Criteria andBNh3valueGreaterThanOrEqualTo(Double value) {
            addCriterion("b_nh3value >=", value, "bNh3value");
            return (Criteria) this;
        }

        public Criteria andBNh3valueLessThan(Double value) {
            addCriterion("b_nh3value <", value, "bNh3value");
            return (Criteria) this;
        }

        public Criteria andBNh3valueLessThanOrEqualTo(Double value) {
            addCriterion("b_nh3value <=", value, "bNh3value");
            return (Criteria) this;
        }

        public Criteria andBNh3valueIn(List<Double> values) {
            addCriterion("b_nh3value in", values, "bNh3value");
            return (Criteria) this;
        }

        public Criteria andBNh3valueNotIn(List<Double> values) {
            addCriterion("b_nh3value not in", values, "bNh3value");
            return (Criteria) this;
        }

        public Criteria andBNh3valueBetween(Double value1, Double value2) {
            addCriterion("b_nh3value between", value1, value2, "bNh3value");
            return (Criteria) this;
        }

        public Criteria andBNh3valueNotBetween(Double value1, Double value2) {
            addCriterion("b_nh3value not between", value1, value2, "bNh3value");
            return (Criteria) this;
        }

        public Criteria andBSo2valueIsNull() {
            addCriterion("b_so2value is null");
            return (Criteria) this;
        }

        public Criteria andBSo2valueIsNotNull() {
            addCriterion("b_so2value is not null");
            return (Criteria) this;
        }

        public Criteria andBSo2valueEqualTo(Double value) {
            addCriterion("b_so2value =", value, "bSo2value");
            return (Criteria) this;
        }

        public Criteria andBSo2valueNotEqualTo(Double value) {
            addCriterion("b_so2value <>", value, "bSo2value");
            return (Criteria) this;
        }

        public Criteria andBSo2valueGreaterThan(Double value) {
            addCriterion("b_so2value >", value, "bSo2value");
            return (Criteria) this;
        }

        public Criteria andBSo2valueGreaterThanOrEqualTo(Double value) {
            addCriterion("b_so2value >=", value, "bSo2value");
            return (Criteria) this;
        }

        public Criteria andBSo2valueLessThan(Double value) {
            addCriterion("b_so2value <", value, "bSo2value");
            return (Criteria) this;
        }

        public Criteria andBSo2valueLessThanOrEqualTo(Double value) {
            addCriterion("b_so2value <=", value, "bSo2value");
            return (Criteria) this;
        }

        public Criteria andBSo2valueIn(List<Double> values) {
            addCriterion("b_so2value in", values, "bSo2value");
            return (Criteria) this;
        }

        public Criteria andBSo2valueNotIn(List<Double> values) {
            addCriterion("b_so2value not in", values, "bSo2value");
            return (Criteria) this;
        }

        public Criteria andBSo2valueBetween(Double value1, Double value2) {
            addCriterion("b_so2value between", value1, value2, "bSo2value");
            return (Criteria) this;
        }

        public Criteria andBSo2valueNotBetween(Double value1, Double value2) {
            addCriterion("b_so2value not between", value1, value2, "bSo2value");
            return (Criteria) this;
        }

        public Criteria andBCovalueIsNull() {
            addCriterion("b_covalue is null");
            return (Criteria) this;
        }

        public Criteria andBCovalueIsNotNull() {
            addCriterion("b_covalue is not null");
            return (Criteria) this;
        }

        public Criteria andBCovalueEqualTo(Double value) {
            addCriterion("b_covalue =", value, "bCovalue");
            return (Criteria) this;
        }

        public Criteria andBCovalueNotEqualTo(Double value) {
            addCriterion("b_covalue <>", value, "bCovalue");
            return (Criteria) this;
        }

        public Criteria andBCovalueGreaterThan(Double value) {
            addCriterion("b_covalue >", value, "bCovalue");
            return (Criteria) this;
        }

        public Criteria andBCovalueGreaterThanOrEqualTo(Double value) {
            addCriterion("b_covalue >=", value, "bCovalue");
            return (Criteria) this;
        }

        public Criteria andBCovalueLessThan(Double value) {
            addCriterion("b_covalue <", value, "bCovalue");
            return (Criteria) this;
        }

        public Criteria andBCovalueLessThanOrEqualTo(Double value) {
            addCriterion("b_covalue <=", value, "bCovalue");
            return (Criteria) this;
        }

        public Criteria andBCovalueIn(List<Double> values) {
            addCriterion("b_covalue in", values, "bCovalue");
            return (Criteria) this;
        }

        public Criteria andBCovalueNotIn(List<Double> values) {
            addCriterion("b_covalue not in", values, "bCovalue");
            return (Criteria) this;
        }

        public Criteria andBCovalueBetween(Double value1, Double value2) {
            addCriterion("b_covalue between", value1, value2, "bCovalue");
            return (Criteria) this;
        }

        public Criteria andBCovalueNotBetween(Double value1, Double value2) {
            addCriterion("b_covalue not between", value1, value2, "bCovalue");
            return (Criteria) this;
        }

        public Criteria andBOcvalueIsNull() {
            addCriterion("b_ocvalue is null");
            return (Criteria) this;
        }

        public Criteria andBOcvalueIsNotNull() {
            addCriterion("b_ocvalue is not null");
            return (Criteria) this;
        }

        public Criteria andBOcvalueEqualTo(Double value) {
            addCriterion("b_ocvalue =", value, "bOcvalue");
            return (Criteria) this;
        }

        public Criteria andBOcvalueNotEqualTo(Double value) {
            addCriterion("b_ocvalue <>", value, "bOcvalue");
            return (Criteria) this;
        }

        public Criteria andBOcvalueGreaterThan(Double value) {
            addCriterion("b_ocvalue >", value, "bOcvalue");
            return (Criteria) this;
        }

        public Criteria andBOcvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("b_ocvalue >=", value, "bOcvalue");
            return (Criteria) this;
        }

        public Criteria andBOcvalueLessThan(Double value) {
            addCriterion("b_ocvalue <", value, "bOcvalue");
            return (Criteria) this;
        }

        public Criteria andBOcvalueLessThanOrEqualTo(Double value) {
            addCriterion("b_ocvalue <=", value, "bOcvalue");
            return (Criteria) this;
        }

        public Criteria andBOcvalueIn(List<Double> values) {
            addCriterion("b_ocvalue in", values, "bOcvalue");
            return (Criteria) this;
        }

        public Criteria andBOcvalueNotIn(List<Double> values) {
            addCriterion("b_ocvalue not in", values, "bOcvalue");
            return (Criteria) this;
        }

        public Criteria andBOcvalueBetween(Double value1, Double value2) {
            addCriterion("b_ocvalue between", value1, value2, "bOcvalue");
            return (Criteria) this;
        }

        public Criteria andBOcvalueNotBetween(Double value1, Double value2) {
            addCriterion("b_ocvalue not between", value1, value2, "bOcvalue");
            return (Criteria) this;
        }

        public Criteria andBBcvalueIsNull() {
            addCriterion("b_bcvalue is null");
            return (Criteria) this;
        }

        public Criteria andBBcvalueIsNotNull() {
            addCriterion("b_bcvalue is not null");
            return (Criteria) this;
        }

        public Criteria andBBcvalueEqualTo(Double value) {
            addCriterion("b_bcvalue =", value, "bBcvalue");
            return (Criteria) this;
        }

        public Criteria andBBcvalueNotEqualTo(Double value) {
            addCriterion("b_bcvalue <>", value, "bBcvalue");
            return (Criteria) this;
        }

        public Criteria andBBcvalueGreaterThan(Double value) {
            addCriterion("b_bcvalue >", value, "bBcvalue");
            return (Criteria) this;
        }

        public Criteria andBBcvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("b_bcvalue >=", value, "bBcvalue");
            return (Criteria) this;
        }

        public Criteria andBBcvalueLessThan(Double value) {
            addCriterion("b_bcvalue <", value, "bBcvalue");
            return (Criteria) this;
        }

        public Criteria andBBcvalueLessThanOrEqualTo(Double value) {
            addCriterion("b_bcvalue <=", value, "bBcvalue");
            return (Criteria) this;
        }

        public Criteria andBBcvalueIn(List<Double> values) {
            addCriterion("b_bcvalue in", values, "bBcvalue");
            return (Criteria) this;
        }

        public Criteria andBBcvalueNotIn(List<Double> values) {
            addCriterion("b_bcvalue not in", values, "bBcvalue");
            return (Criteria) this;
        }

        public Criteria andBBcvalueBetween(Double value1, Double value2) {
            addCriterion("b_bcvalue between", value1, value2, "bBcvalue");
            return (Criteria) this;
        }

        public Criteria andBBcvalueNotBetween(Double value1, Double value2) {
            addCriterion("b_bcvalue not between", value1, value2, "bBcvalue");
            return (Criteria) this;
        }

        public Criteria andBNoxvalueIsNull() {
            addCriterion("b_noxvalue is null");
            return (Criteria) this;
        }

        public Criteria andBNoxvalueIsNotNull() {
            addCriterion("b_noxvalue is not null");
            return (Criteria) this;
        }

        public Criteria andBNoxvalueEqualTo(Double value) {
            addCriterion("b_noxvalue =", value, "bNoxvalue");
            return (Criteria) this;
        }

        public Criteria andBNoxvalueNotEqualTo(Double value) {
            addCriterion("b_noxvalue <>", value, "bNoxvalue");
            return (Criteria) this;
        }

        public Criteria andBNoxvalueGreaterThan(Double value) {
            addCriterion("b_noxvalue >", value, "bNoxvalue");
            return (Criteria) this;
        }

        public Criteria andBNoxvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("b_noxvalue >=", value, "bNoxvalue");
            return (Criteria) this;
        }

        public Criteria andBNoxvalueLessThan(Double value) {
            addCriterion("b_noxvalue <", value, "bNoxvalue");
            return (Criteria) this;
        }

        public Criteria andBNoxvalueLessThanOrEqualTo(Double value) {
            addCriterion("b_noxvalue <=", value, "bNoxvalue");
            return (Criteria) this;
        }

        public Criteria andBNoxvalueIn(List<Double> values) {
            addCriterion("b_noxvalue in", values, "bNoxvalue");
            return (Criteria) this;
        }

        public Criteria andBNoxvalueNotIn(List<Double> values) {
            addCriterion("b_noxvalue not in", values, "bNoxvalue");
            return (Criteria) this;
        }

        public Criteria andBNoxvalueBetween(Double value1, Double value2) {
            addCriterion("b_noxvalue between", value1, value2, "bNoxvalue");
            return (Criteria) this;
        }

        public Criteria andBNoxvalueNotBetween(Double value1, Double value2) {
            addCriterion("b_noxvalue not between", value1, value2, "bNoxvalue");
            return (Criteria) this;
        }

        public Criteria andBPm25valueIsNull() {
            addCriterion("b_pm25value is null");
            return (Criteria) this;
        }

        public Criteria andBPm25valueIsNotNull() {
            addCriterion("b_pm25value is not null");
            return (Criteria) this;
        }

        public Criteria andBPm25valueEqualTo(Double value) {
            addCriterion("b_pm25value =", value, "bPm25value");
            return (Criteria) this;
        }

        public Criteria andBPm25valueNotEqualTo(Double value) {
            addCriterion("b_pm25value <>", value, "bPm25value");
            return (Criteria) this;
        }

        public Criteria andBPm25valueGreaterThan(Double value) {
            addCriterion("b_pm25value >", value, "bPm25value");
            return (Criteria) this;
        }

        public Criteria andBPm25valueGreaterThanOrEqualTo(Double value) {
            addCriterion("b_pm25value >=", value, "bPm25value");
            return (Criteria) this;
        }

        public Criteria andBPm25valueLessThan(Double value) {
            addCriterion("b_pm25value <", value, "bPm25value");
            return (Criteria) this;
        }

        public Criteria andBPm25valueLessThanOrEqualTo(Double value) {
            addCriterion("b_pm25value <=", value, "bPm25value");
            return (Criteria) this;
        }

        public Criteria andBPm25valueIn(List<Double> values) {
            addCriterion("b_pm25value in", values, "bPm25value");
            return (Criteria) this;
        }

        public Criteria andBPm25valueNotIn(List<Double> values) {
            addCriterion("b_pm25value not in", values, "bPm25value");
            return (Criteria) this;
        }

        public Criteria andBPm25valueBetween(Double value1, Double value2) {
            addCriterion("b_pm25value between", value1, value2, "bPm25value");
            return (Criteria) this;
        }

        public Criteria andBPm25valueNotBetween(Double value1, Double value2) {
            addCriterion("b_pm25value not between", value1, value2, "bPm25value");
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