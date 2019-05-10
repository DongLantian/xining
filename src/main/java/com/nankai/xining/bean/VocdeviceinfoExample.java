package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class VocdeviceinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VocdeviceinfoExample() {
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

        public Criteria andVocdeviceidIsNull() {
            addCriterion("vocdeviceid is null");
            return (Criteria) this;
        }

        public Criteria andVocdeviceidIsNotNull() {
            addCriterion("vocdeviceid is not null");
            return (Criteria) this;
        }

        public Criteria andVocdeviceidEqualTo(Integer value) {
            addCriterion("vocdeviceid =", value, "vocdeviceid");
            return (Criteria) this;
        }

        public Criteria andVocdeviceidNotEqualTo(Integer value) {
            addCriterion("vocdeviceid <>", value, "vocdeviceid");
            return (Criteria) this;
        }

        public Criteria andVocdeviceidGreaterThan(Integer value) {
            addCriterion("vocdeviceid >", value, "vocdeviceid");
            return (Criteria) this;
        }

        public Criteria andVocdeviceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vocdeviceid >=", value, "vocdeviceid");
            return (Criteria) this;
        }

        public Criteria andVocdeviceidLessThan(Integer value) {
            addCriterion("vocdeviceid <", value, "vocdeviceid");
            return (Criteria) this;
        }

        public Criteria andVocdeviceidLessThanOrEqualTo(Integer value) {
            addCriterion("vocdeviceid <=", value, "vocdeviceid");
            return (Criteria) this;
        }

        public Criteria andVocdeviceidIn(List<Integer> values) {
            addCriterion("vocdeviceid in", values, "vocdeviceid");
            return (Criteria) this;
        }

        public Criteria andVocdeviceidNotIn(List<Integer> values) {
            addCriterion("vocdeviceid not in", values, "vocdeviceid");
            return (Criteria) this;
        }

        public Criteria andVocdeviceidBetween(Integer value1, Integer value2) {
            addCriterion("vocdeviceid between", value1, value2, "vocdeviceid");
            return (Criteria) this;
        }

        public Criteria andVocdeviceidNotBetween(Integer value1, Integer value2) {
            addCriterion("vocdeviceid not between", value1, value2, "vocdeviceid");
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

        public Criteria andVocdevicesurveyidIsNull() {
            addCriterion("vocdevicesurveyid is null");
            return (Criteria) this;
        }

        public Criteria andVocdevicesurveyidIsNotNull() {
            addCriterion("vocdevicesurveyid is not null");
            return (Criteria) this;
        }

        public Criteria andVocdevicesurveyidEqualTo(Integer value) {
            addCriterion("vocdevicesurveyid =", value, "vocdevicesurveyid");
            return (Criteria) this;
        }

        public Criteria andVocdevicesurveyidNotEqualTo(Integer value) {
            addCriterion("vocdevicesurveyid <>", value, "vocdevicesurveyid");
            return (Criteria) this;
        }

        public Criteria andVocdevicesurveyidGreaterThan(Integer value) {
            addCriterion("vocdevicesurveyid >", value, "vocdevicesurveyid");
            return (Criteria) this;
        }

        public Criteria andVocdevicesurveyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vocdevicesurveyid >=", value, "vocdevicesurveyid");
            return (Criteria) this;
        }

        public Criteria andVocdevicesurveyidLessThan(Integer value) {
            addCriterion("vocdevicesurveyid <", value, "vocdevicesurveyid");
            return (Criteria) this;
        }

        public Criteria andVocdevicesurveyidLessThanOrEqualTo(Integer value) {
            addCriterion("vocdevicesurveyid <=", value, "vocdevicesurveyid");
            return (Criteria) this;
        }

        public Criteria andVocdevicesurveyidIn(List<Integer> values) {
            addCriterion("vocdevicesurveyid in", values, "vocdevicesurveyid");
            return (Criteria) this;
        }

        public Criteria andVocdevicesurveyidNotIn(List<Integer> values) {
            addCriterion("vocdevicesurveyid not in", values, "vocdevicesurveyid");
            return (Criteria) this;
        }

        public Criteria andVocdevicesurveyidBetween(Integer value1, Integer value2) {
            addCriterion("vocdevicesurveyid between", value1, value2, "vocdevicesurveyid");
            return (Criteria) this;
        }

        public Criteria andVocdevicesurveyidNotBetween(Integer value1, Integer value2) {
            addCriterion("vocdevicesurveyid not between", value1, value2, "vocdevicesurveyid");
            return (Criteria) this;
        }

        public Criteria andSectionIsNull() {
            addCriterion("section is null");
            return (Criteria) this;
        }

        public Criteria andSectionIsNotNull() {
            addCriterion("section is not null");
            return (Criteria) this;
        }

        public Criteria andSectionEqualTo(String value) {
            addCriterion("section =", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionNotEqualTo(String value) {
            addCriterion("section <>", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionGreaterThan(String value) {
            addCriterion("section >", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionGreaterThanOrEqualTo(String value) {
            addCriterion("section >=", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionLessThan(String value) {
            addCriterion("section <", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionLessThanOrEqualTo(String value) {
            addCriterion("section <=", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionLike(String value) {
            addCriterion("section like", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionNotLike(String value) {
            addCriterion("section not like", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionIn(List<String> values) {
            addCriterion("section in", values, "section");
            return (Criteria) this;
        }

        public Criteria andSectionNotIn(List<String> values) {
            addCriterion("section not in", values, "section");
            return (Criteria) this;
        }

        public Criteria andSectionBetween(String value1, String value2) {
            addCriterion("section between", value1, value2, "section");
            return (Criteria) this;
        }

        public Criteria andSectionNotBetween(String value1, String value2) {
            addCriterion("section not between", value1, value2, "section");
            return (Criteria) this;
        }

        public Criteria andHandleprocessIsNull() {
            addCriterion("handleprocess is null");
            return (Criteria) this;
        }

        public Criteria andHandleprocessIsNotNull() {
            addCriterion("handleprocess is not null");
            return (Criteria) this;
        }

        public Criteria andHandleprocessEqualTo(String value) {
            addCriterion("handleprocess =", value, "handleprocess");
            return (Criteria) this;
        }

        public Criteria andHandleprocessNotEqualTo(String value) {
            addCriterion("handleprocess <>", value, "handleprocess");
            return (Criteria) this;
        }

        public Criteria andHandleprocessGreaterThan(String value) {
            addCriterion("handleprocess >", value, "handleprocess");
            return (Criteria) this;
        }

        public Criteria andHandleprocessGreaterThanOrEqualTo(String value) {
            addCriterion("handleprocess >=", value, "handleprocess");
            return (Criteria) this;
        }

        public Criteria andHandleprocessLessThan(String value) {
            addCriterion("handleprocess <", value, "handleprocess");
            return (Criteria) this;
        }

        public Criteria andHandleprocessLessThanOrEqualTo(String value) {
            addCriterion("handleprocess <=", value, "handleprocess");
            return (Criteria) this;
        }

        public Criteria andHandleprocessLike(String value) {
            addCriterion("handleprocess like", value, "handleprocess");
            return (Criteria) this;
        }

        public Criteria andHandleprocessNotLike(String value) {
            addCriterion("handleprocess not like", value, "handleprocess");
            return (Criteria) this;
        }

        public Criteria andHandleprocessIn(List<String> values) {
            addCriterion("handleprocess in", values, "handleprocess");
            return (Criteria) this;
        }

        public Criteria andHandleprocessNotIn(List<String> values) {
            addCriterion("handleprocess not in", values, "handleprocess");
            return (Criteria) this;
        }

        public Criteria andHandleprocessBetween(String value1, String value2) {
            addCriterion("handleprocess between", value1, value2, "handleprocess");
            return (Criteria) this;
        }

        public Criteria andHandleprocessNotBetween(String value1, String value2) {
            addCriterion("handleprocess not between", value1, value2, "handleprocess");
            return (Criteria) this;
        }

        public Criteria andYearruntimeIsNull() {
            addCriterion("yearruntime is null");
            return (Criteria) this;
        }

        public Criteria andYearruntimeIsNotNull() {
            addCriterion("yearruntime is not null");
            return (Criteria) this;
        }

        public Criteria andYearruntimeEqualTo(Double value) {
            addCriterion("yearruntime =", value, "yearruntime");
            return (Criteria) this;
        }

        public Criteria andYearruntimeNotEqualTo(Double value) {
            addCriterion("yearruntime <>", value, "yearruntime");
            return (Criteria) this;
        }

        public Criteria andYearruntimeGreaterThan(Double value) {
            addCriterion("yearruntime >", value, "yearruntime");
            return (Criteria) this;
        }

        public Criteria andYearruntimeGreaterThanOrEqualTo(Double value) {
            addCriterion("yearruntime >=", value, "yearruntime");
            return (Criteria) this;
        }

        public Criteria andYearruntimeLessThan(Double value) {
            addCriterion("yearruntime <", value, "yearruntime");
            return (Criteria) this;
        }

        public Criteria andYearruntimeLessThanOrEqualTo(Double value) {
            addCriterion("yearruntime <=", value, "yearruntime");
            return (Criteria) this;
        }

        public Criteria andYearruntimeIn(List<Double> values) {
            addCriterion("yearruntime in", values, "yearruntime");
            return (Criteria) this;
        }

        public Criteria andYearruntimeNotIn(List<Double> values) {
            addCriterion("yearruntime not in", values, "yearruntime");
            return (Criteria) this;
        }

        public Criteria andYearruntimeBetween(Double value1, Double value2) {
            addCriterion("yearruntime between", value1, value2, "yearruntime");
            return (Criteria) this;
        }

        public Criteria andYearruntimeNotBetween(Double value1, Double value2) {
            addCriterion("yearruntime not between", value1, value2, "yearruntime");
            return (Criteria) this;
        }

        public Criteria andDayruntimeIsNull() {
            addCriterion("dayruntime is null");
            return (Criteria) this;
        }

        public Criteria andDayruntimeIsNotNull() {
            addCriterion("dayruntime is not null");
            return (Criteria) this;
        }

        public Criteria andDayruntimeEqualTo(Double value) {
            addCriterion("dayruntime =", value, "dayruntime");
            return (Criteria) this;
        }

        public Criteria andDayruntimeNotEqualTo(Double value) {
            addCriterion("dayruntime <>", value, "dayruntime");
            return (Criteria) this;
        }

        public Criteria andDayruntimeGreaterThan(Double value) {
            addCriterion("dayruntime >", value, "dayruntime");
            return (Criteria) this;
        }

        public Criteria andDayruntimeGreaterThanOrEqualTo(Double value) {
            addCriterion("dayruntime >=", value, "dayruntime");
            return (Criteria) this;
        }

        public Criteria andDayruntimeLessThan(Double value) {
            addCriterion("dayruntime <", value, "dayruntime");
            return (Criteria) this;
        }

        public Criteria andDayruntimeLessThanOrEqualTo(Double value) {
            addCriterion("dayruntime <=", value, "dayruntime");
            return (Criteria) this;
        }

        public Criteria andDayruntimeIn(List<Double> values) {
            addCriterion("dayruntime in", values, "dayruntime");
            return (Criteria) this;
        }

        public Criteria andDayruntimeNotIn(List<Double> values) {
            addCriterion("dayruntime not in", values, "dayruntime");
            return (Criteria) this;
        }

        public Criteria andDayruntimeBetween(Double value1, Double value2) {
            addCriterion("dayruntime between", value1, value2, "dayruntime");
            return (Criteria) this;
        }

        public Criteria andDayruntimeNotBetween(Double value1, Double value2) {
            addCriterion("dayruntime not between", value1, value2, "dayruntime");
            return (Criteria) this;
        }

        public Criteria andPreprocessIsNull() {
            addCriterion("preprocess is null");
            return (Criteria) this;
        }

        public Criteria andPreprocessIsNotNull() {
            addCriterion("preprocess is not null");
            return (Criteria) this;
        }

        public Criteria andPreprocessEqualTo(String value) {
            addCriterion("preprocess =", value, "preprocess");
            return (Criteria) this;
        }

        public Criteria andPreprocessNotEqualTo(String value) {
            addCriterion("preprocess <>", value, "preprocess");
            return (Criteria) this;
        }

        public Criteria andPreprocessGreaterThan(String value) {
            addCriterion("preprocess >", value, "preprocess");
            return (Criteria) this;
        }

        public Criteria andPreprocessGreaterThanOrEqualTo(String value) {
            addCriterion("preprocess >=", value, "preprocess");
            return (Criteria) this;
        }

        public Criteria andPreprocessLessThan(String value) {
            addCriterion("preprocess <", value, "preprocess");
            return (Criteria) this;
        }

        public Criteria andPreprocessLessThanOrEqualTo(String value) {
            addCriterion("preprocess <=", value, "preprocess");
            return (Criteria) this;
        }

        public Criteria andPreprocessLike(String value) {
            addCriterion("preprocess like", value, "preprocess");
            return (Criteria) this;
        }

        public Criteria andPreprocessNotLike(String value) {
            addCriterion("preprocess not like", value, "preprocess");
            return (Criteria) this;
        }

        public Criteria andPreprocessIn(List<String> values) {
            addCriterion("preprocess in", values, "preprocess");
            return (Criteria) this;
        }

        public Criteria andPreprocessNotIn(List<String> values) {
            addCriterion("preprocess not in", values, "preprocess");
            return (Criteria) this;
        }

        public Criteria andPreprocessBetween(String value1, String value2) {
            addCriterion("preprocess between", value1, value2, "preprocess");
            return (Criteria) this;
        }

        public Criteria andPreprocessNotBetween(String value1, String value2) {
            addCriterion("preprocess not between", value1, value2, "preprocess");
            return (Criteria) this;
        }

        public Criteria andInconcentrationIsNull() {
            addCriterion("inconcentration is null");
            return (Criteria) this;
        }

        public Criteria andInconcentrationIsNotNull() {
            addCriterion("inconcentration is not null");
            return (Criteria) this;
        }

        public Criteria andInconcentrationEqualTo(Double value) {
            addCriterion("inconcentration =", value, "inconcentration");
            return (Criteria) this;
        }

        public Criteria andInconcentrationNotEqualTo(Double value) {
            addCriterion("inconcentration <>", value, "inconcentration");
            return (Criteria) this;
        }

        public Criteria andInconcentrationGreaterThan(Double value) {
            addCriterion("inconcentration >", value, "inconcentration");
            return (Criteria) this;
        }

        public Criteria andInconcentrationGreaterThanOrEqualTo(Double value) {
            addCriterion("inconcentration >=", value, "inconcentration");
            return (Criteria) this;
        }

        public Criteria andInconcentrationLessThan(Double value) {
            addCriterion("inconcentration <", value, "inconcentration");
            return (Criteria) this;
        }

        public Criteria andInconcentrationLessThanOrEqualTo(Double value) {
            addCriterion("inconcentration <=", value, "inconcentration");
            return (Criteria) this;
        }

        public Criteria andInconcentrationIn(List<Double> values) {
            addCriterion("inconcentration in", values, "inconcentration");
            return (Criteria) this;
        }

        public Criteria andInconcentrationNotIn(List<Double> values) {
            addCriterion("inconcentration not in", values, "inconcentration");
            return (Criteria) this;
        }

        public Criteria andInconcentrationBetween(Double value1, Double value2) {
            addCriterion("inconcentration between", value1, value2, "inconcentration");
            return (Criteria) this;
        }

        public Criteria andInconcentrationNotBetween(Double value1, Double value2) {
            addCriterion("inconcentration not between", value1, value2, "inconcentration");
            return (Criteria) this;
        }

        public Criteria andInairIsNull() {
            addCriterion("inair is null");
            return (Criteria) this;
        }

        public Criteria andInairIsNotNull() {
            addCriterion("inair is not null");
            return (Criteria) this;
        }

        public Criteria andInairEqualTo(Double value) {
            addCriterion("inair =", value, "inair");
            return (Criteria) this;
        }

        public Criteria andInairNotEqualTo(Double value) {
            addCriterion("inair <>", value, "inair");
            return (Criteria) this;
        }

        public Criteria andInairGreaterThan(Double value) {
            addCriterion("inair >", value, "inair");
            return (Criteria) this;
        }

        public Criteria andInairGreaterThanOrEqualTo(Double value) {
            addCriterion("inair >=", value, "inair");
            return (Criteria) this;
        }

        public Criteria andInairLessThan(Double value) {
            addCriterion("inair <", value, "inair");
            return (Criteria) this;
        }

        public Criteria andInairLessThanOrEqualTo(Double value) {
            addCriterion("inair <=", value, "inair");
            return (Criteria) this;
        }

        public Criteria andInairIn(List<Double> values) {
            addCriterion("inair in", values, "inair");
            return (Criteria) this;
        }

        public Criteria andInairNotIn(List<Double> values) {
            addCriterion("inair not in", values, "inair");
            return (Criteria) this;
        }

        public Criteria andInairBetween(Double value1, Double value2) {
            addCriterion("inair between", value1, value2, "inair");
            return (Criteria) this;
        }

        public Criteria andInairNotBetween(Double value1, Double value2) {
            addCriterion("inair not between", value1, value2, "inair");
            return (Criteria) this;
        }

        public Criteria andOutconcentrationIsNull() {
            addCriterion("outconcentration is null");
            return (Criteria) this;
        }

        public Criteria andOutconcentrationIsNotNull() {
            addCriterion("outconcentration is not null");
            return (Criteria) this;
        }

        public Criteria andOutconcentrationEqualTo(Double value) {
            addCriterion("outconcentration =", value, "outconcentration");
            return (Criteria) this;
        }

        public Criteria andOutconcentrationNotEqualTo(Double value) {
            addCriterion("outconcentration <>", value, "outconcentration");
            return (Criteria) this;
        }

        public Criteria andOutconcentrationGreaterThan(Double value) {
            addCriterion("outconcentration >", value, "outconcentration");
            return (Criteria) this;
        }

        public Criteria andOutconcentrationGreaterThanOrEqualTo(Double value) {
            addCriterion("outconcentration >=", value, "outconcentration");
            return (Criteria) this;
        }

        public Criteria andOutconcentrationLessThan(Double value) {
            addCriterion("outconcentration <", value, "outconcentration");
            return (Criteria) this;
        }

        public Criteria andOutconcentrationLessThanOrEqualTo(Double value) {
            addCriterion("outconcentration <=", value, "outconcentration");
            return (Criteria) this;
        }

        public Criteria andOutconcentrationIn(List<Double> values) {
            addCriterion("outconcentration in", values, "outconcentration");
            return (Criteria) this;
        }

        public Criteria andOutconcentrationNotIn(List<Double> values) {
            addCriterion("outconcentration not in", values, "outconcentration");
            return (Criteria) this;
        }

        public Criteria andOutconcentrationBetween(Double value1, Double value2) {
            addCriterion("outconcentration between", value1, value2, "outconcentration");
            return (Criteria) this;
        }

        public Criteria andOutconcentrationNotBetween(Double value1, Double value2) {
            addCriterion("outconcentration not between", value1, value2, "outconcentration");
            return (Criteria) this;
        }

        public Criteria andOutairIsNull() {
            addCriterion("outair is null");
            return (Criteria) this;
        }

        public Criteria andOutairIsNotNull() {
            addCriterion("outair is not null");
            return (Criteria) this;
        }

        public Criteria andOutairEqualTo(Double value) {
            addCriterion("outair =", value, "outair");
            return (Criteria) this;
        }

        public Criteria andOutairNotEqualTo(Double value) {
            addCriterion("outair <>", value, "outair");
            return (Criteria) this;
        }

        public Criteria andOutairGreaterThan(Double value) {
            addCriterion("outair >", value, "outair");
            return (Criteria) this;
        }

        public Criteria andOutairGreaterThanOrEqualTo(Double value) {
            addCriterion("outair >=", value, "outair");
            return (Criteria) this;
        }

        public Criteria andOutairLessThan(Double value) {
            addCriterion("outair <", value, "outair");
            return (Criteria) this;
        }

        public Criteria andOutairLessThanOrEqualTo(Double value) {
            addCriterion("outair <=", value, "outair");
            return (Criteria) this;
        }

        public Criteria andOutairIn(List<Double> values) {
            addCriterion("outair in", values, "outair");
            return (Criteria) this;
        }

        public Criteria andOutairNotIn(List<Double> values) {
            addCriterion("outair not in", values, "outair");
            return (Criteria) this;
        }

        public Criteria andOutairBetween(Double value1, Double value2) {
            addCriterion("outair between", value1, value2, "outair");
            return (Criteria) this;
        }

        public Criteria andOutairNotBetween(Double value1, Double value2) {
            addCriterion("outair not between", value1, value2, "outair");
            return (Criteria) this;
        }

        public Criteria andOffefficiencyIsNull() {
            addCriterion("offefficiency is null");
            return (Criteria) this;
        }

        public Criteria andOffefficiencyIsNotNull() {
            addCriterion("offefficiency is not null");
            return (Criteria) this;
        }

        public Criteria andOffefficiencyEqualTo(Double value) {
            addCriterion("offefficiency =", value, "offefficiency");
            return (Criteria) this;
        }

        public Criteria andOffefficiencyNotEqualTo(Double value) {
            addCriterion("offefficiency <>", value, "offefficiency");
            return (Criteria) this;
        }

        public Criteria andOffefficiencyGreaterThan(Double value) {
            addCriterion("offefficiency >", value, "offefficiency");
            return (Criteria) this;
        }

        public Criteria andOffefficiencyGreaterThanOrEqualTo(Double value) {
            addCriterion("offefficiency >=", value, "offefficiency");
            return (Criteria) this;
        }

        public Criteria andOffefficiencyLessThan(Double value) {
            addCriterion("offefficiency <", value, "offefficiency");
            return (Criteria) this;
        }

        public Criteria andOffefficiencyLessThanOrEqualTo(Double value) {
            addCriterion("offefficiency <=", value, "offefficiency");
            return (Criteria) this;
        }

        public Criteria andOffefficiencyIn(List<Double> values) {
            addCriterion("offefficiency in", values, "offefficiency");
            return (Criteria) this;
        }

        public Criteria andOffefficiencyNotIn(List<Double> values) {
            addCriterion("offefficiency not in", values, "offefficiency");
            return (Criteria) this;
        }

        public Criteria andOffefficiencyBetween(Double value1, Double value2) {
            addCriterion("offefficiency between", value1, value2, "offefficiency");
            return (Criteria) this;
        }

        public Criteria andOffefficiencyNotBetween(Double value1, Double value2) {
            addCriterion("offefficiency not between", value1, value2, "offefficiency");
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