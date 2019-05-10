package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class OilTransportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OilTransportExample() {
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

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
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

        public Criteria andOilTypeIsNull() {
            addCriterion("oil_type is null");
            return (Criteria) this;
        }

        public Criteria andOilTypeIsNotNull() {
            addCriterion("oil_type is not null");
            return (Criteria) this;
        }

        public Criteria andOilTypeEqualTo(String value) {
            addCriterion("oil_type =", value, "oilType");
            return (Criteria) this;
        }

        public Criteria andOilTypeNotEqualTo(String value) {
            addCriterion("oil_type <>", value, "oilType");
            return (Criteria) this;
        }

        public Criteria andOilTypeGreaterThan(String value) {
            addCriterion("oil_type >", value, "oilType");
            return (Criteria) this;
        }

        public Criteria andOilTypeGreaterThanOrEqualTo(String value) {
            addCriterion("oil_type >=", value, "oilType");
            return (Criteria) this;
        }

        public Criteria andOilTypeLessThan(String value) {
            addCriterion("oil_type <", value, "oilType");
            return (Criteria) this;
        }

        public Criteria andOilTypeLessThanOrEqualTo(String value) {
            addCriterion("oil_type <=", value, "oilType");
            return (Criteria) this;
        }

        public Criteria andOilTypeLike(String value) {
            addCriterion("oil_type like", value, "oilType");
            return (Criteria) this;
        }

        public Criteria andOilTypeNotLike(String value) {
            addCriterion("oil_type not like", value, "oilType");
            return (Criteria) this;
        }

        public Criteria andOilTypeIn(List<String> values) {
            addCriterion("oil_type in", values, "oilType");
            return (Criteria) this;
        }

        public Criteria andOilTypeNotIn(List<String> values) {
            addCriterion("oil_type not in", values, "oilType");
            return (Criteria) this;
        }

        public Criteria andOilTypeBetween(String value1, String value2) {
            addCriterion("oil_type between", value1, value2, "oilType");
            return (Criteria) this;
        }

        public Criteria andOilTypeNotBetween(String value1, String value2) {
            addCriterion("oil_type not between", value1, value2, "oilType");
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

        public Criteria andSourceDiscripIsNull() {
            addCriterion("source_discrip is null");
            return (Criteria) this;
        }

        public Criteria andSourceDiscripIsNotNull() {
            addCriterion("source_discrip is not null");
            return (Criteria) this;
        }

        public Criteria andSourceDiscripEqualTo(String value) {
            addCriterion("source_discrip =", value, "sourceDiscrip");
            return (Criteria) this;
        }

        public Criteria andSourceDiscripNotEqualTo(String value) {
            addCriterion("source_discrip <>", value, "sourceDiscrip");
            return (Criteria) this;
        }

        public Criteria andSourceDiscripGreaterThan(String value) {
            addCriterion("source_discrip >", value, "sourceDiscrip");
            return (Criteria) this;
        }

        public Criteria andSourceDiscripGreaterThanOrEqualTo(String value) {
            addCriterion("source_discrip >=", value, "sourceDiscrip");
            return (Criteria) this;
        }

        public Criteria andSourceDiscripLessThan(String value) {
            addCriterion("source_discrip <", value, "sourceDiscrip");
            return (Criteria) this;
        }

        public Criteria andSourceDiscripLessThanOrEqualTo(String value) {
            addCriterion("source_discrip <=", value, "sourceDiscrip");
            return (Criteria) this;
        }

        public Criteria andSourceDiscripLike(String value) {
            addCriterion("source_discrip like", value, "sourceDiscrip");
            return (Criteria) this;
        }

        public Criteria andSourceDiscripNotLike(String value) {
            addCriterion("source_discrip not like", value, "sourceDiscrip");
            return (Criteria) this;
        }

        public Criteria andSourceDiscripIn(List<String> values) {
            addCriterion("source_discrip in", values, "sourceDiscrip");
            return (Criteria) this;
        }

        public Criteria andSourceDiscripNotIn(List<String> values) {
            addCriterion("source_discrip not in", values, "sourceDiscrip");
            return (Criteria) this;
        }

        public Criteria andSourceDiscripBetween(String value1, String value2) {
            addCriterion("source_discrip between", value1, value2, "sourceDiscrip");
            return (Criteria) this;
        }

        public Criteria andSourceDiscripNotBetween(String value1, String value2) {
            addCriterion("source_discrip not between", value1, value2, "sourceDiscrip");
            return (Criteria) this;
        }

        public Criteria andYearVolumeIsNull() {
            addCriterion("year_volume is null");
            return (Criteria) this;
        }

        public Criteria andYearVolumeIsNotNull() {
            addCriterion("year_volume is not null");
            return (Criteria) this;
        }

        public Criteria andYearVolumeEqualTo(Double value) {
            addCriterion("year_volume =", value, "yearVolume");
            return (Criteria) this;
        }

        public Criteria andYearVolumeNotEqualTo(Double value) {
            addCriterion("year_volume <>", value, "yearVolume");
            return (Criteria) this;
        }

        public Criteria andYearVolumeGreaterThan(Double value) {
            addCriterion("year_volume >", value, "yearVolume");
            return (Criteria) this;
        }

        public Criteria andYearVolumeGreaterThanOrEqualTo(Double value) {
            addCriterion("year_volume >=", value, "yearVolume");
            return (Criteria) this;
        }

        public Criteria andYearVolumeLessThan(Double value) {
            addCriterion("year_volume <", value, "yearVolume");
            return (Criteria) this;
        }

        public Criteria andYearVolumeLessThanOrEqualTo(Double value) {
            addCriterion("year_volume <=", value, "yearVolume");
            return (Criteria) this;
        }

        public Criteria andYearVolumeIn(List<Double> values) {
            addCriterion("year_volume in", values, "yearVolume");
            return (Criteria) this;
        }

        public Criteria andYearVolumeNotIn(List<Double> values) {
            addCriterion("year_volume not in", values, "yearVolume");
            return (Criteria) this;
        }

        public Criteria andYearVolumeBetween(Double value1, Double value2) {
            addCriterion("year_volume between", value1, value2, "yearVolume");
            return (Criteria) this;
        }

        public Criteria andYearVolumeNotBetween(Double value1, Double value2) {
            addCriterion("year_volume not between", value1, value2, "yearVolume");
            return (Criteria) this;
        }

        public Criteria andControlRateIsNull() {
            addCriterion("control_rate is null");
            return (Criteria) this;
        }

        public Criteria andControlRateIsNotNull() {
            addCriterion("control_rate is not null");
            return (Criteria) this;
        }

        public Criteria andControlRateEqualTo(Integer value) {
            addCriterion("control_rate =", value, "controlRate");
            return (Criteria) this;
        }

        public Criteria andControlRateNotEqualTo(Integer value) {
            addCriterion("control_rate <>", value, "controlRate");
            return (Criteria) this;
        }

        public Criteria andControlRateGreaterThan(Integer value) {
            addCriterion("control_rate >", value, "controlRate");
            return (Criteria) this;
        }

        public Criteria andControlRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("control_rate >=", value, "controlRate");
            return (Criteria) this;
        }

        public Criteria andControlRateLessThan(Integer value) {
            addCriterion("control_rate <", value, "controlRate");
            return (Criteria) this;
        }

        public Criteria andControlRateLessThanOrEqualTo(Integer value) {
            addCriterion("control_rate <=", value, "controlRate");
            return (Criteria) this;
        }

        public Criteria andControlRateIn(List<Integer> values) {
            addCriterion("control_rate in", values, "controlRate");
            return (Criteria) this;
        }

        public Criteria andControlRateNotIn(List<Integer> values) {
            addCriterion("control_rate not in", values, "controlRate");
            return (Criteria) this;
        }

        public Criteria andControlRateBetween(Integer value1, Integer value2) {
            addCriterion("control_rate between", value1, value2, "controlRate");
            return (Criteria) this;
        }

        public Criteria andControlRateNotBetween(Integer value1, Integer value2) {
            addCriterion("control_rate not between", value1, value2, "controlRate");
            return (Criteria) this;
        }

        public Criteria andEmissionIsNull() {
            addCriterion("emission is null");
            return (Criteria) this;
        }

        public Criteria andEmissionIsNotNull() {
            addCriterion("emission is not null");
            return (Criteria) this;
        }

        public Criteria andEmissionEqualTo(Double value) {
            addCriterion("emission =", value, "emission");
            return (Criteria) this;
        }

        public Criteria andEmissionNotEqualTo(Double value) {
            addCriterion("emission <>", value, "emission");
            return (Criteria) this;
        }

        public Criteria andEmissionGreaterThan(Double value) {
            addCriterion("emission >", value, "emission");
            return (Criteria) this;
        }

        public Criteria andEmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("emission >=", value, "emission");
            return (Criteria) this;
        }

        public Criteria andEmissionLessThan(Double value) {
            addCriterion("emission <", value, "emission");
            return (Criteria) this;
        }

        public Criteria andEmissionLessThanOrEqualTo(Double value) {
            addCriterion("emission <=", value, "emission");
            return (Criteria) this;
        }

        public Criteria andEmissionIn(List<Double> values) {
            addCriterion("emission in", values, "emission");
            return (Criteria) this;
        }

        public Criteria andEmissionNotIn(List<Double> values) {
            addCriterion("emission not in", values, "emission");
            return (Criteria) this;
        }

        public Criteria andEmissionBetween(Double value1, Double value2) {
            addCriterion("emission between", value1, value2, "emission");
            return (Criteria) this;
        }

        public Criteria andEmissionNotBetween(Double value1, Double value2) {
            addCriterion("emission not between", value1, value2, "emission");
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