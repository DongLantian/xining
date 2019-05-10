package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class WastewaterformalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WastewaterformalExample() {
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

        public Criteria andWastewateridIsNull() {
            addCriterion("wastewaterid is null");
            return (Criteria) this;
        }

        public Criteria andWastewateridIsNotNull() {
            addCriterion("wastewaterid is not null");
            return (Criteria) this;
        }

        public Criteria andWastewateridEqualTo(Integer value) {
            addCriterion("wastewaterid =", value, "wastewaterid");
            return (Criteria) this;
        }

        public Criteria andWastewateridNotEqualTo(Integer value) {
            addCriterion("wastewaterid <>", value, "wastewaterid");
            return (Criteria) this;
        }

        public Criteria andWastewateridGreaterThan(Integer value) {
            addCriterion("wastewaterid >", value, "wastewaterid");
            return (Criteria) this;
        }

        public Criteria andWastewateridGreaterThanOrEqualTo(Integer value) {
            addCriterion("wastewaterid >=", value, "wastewaterid");
            return (Criteria) this;
        }

        public Criteria andWastewateridLessThan(Integer value) {
            addCriterion("wastewaterid <", value, "wastewaterid");
            return (Criteria) this;
        }

        public Criteria andWastewateridLessThanOrEqualTo(Integer value) {
            addCriterion("wastewaterid <=", value, "wastewaterid");
            return (Criteria) this;
        }

        public Criteria andWastewateridIn(List<Integer> values) {
            addCriterion("wastewaterid in", values, "wastewaterid");
            return (Criteria) this;
        }

        public Criteria andWastewateridNotIn(List<Integer> values) {
            addCriterion("wastewaterid not in", values, "wastewaterid");
            return (Criteria) this;
        }

        public Criteria andWastewateridBetween(Integer value1, Integer value2) {
            addCriterion("wastewaterid between", value1, value2, "wastewaterid");
            return (Criteria) this;
        }

        public Criteria andWastewateridNotBetween(Integer value1, Integer value2) {
            addCriterion("wastewaterid not between", value1, value2, "wastewaterid");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andReportdateIsNull() {
            addCriterion("reportdate is null");
            return (Criteria) this;
        }

        public Criteria andReportdateIsNotNull() {
            addCriterion("reportdate is not null");
            return (Criteria) this;
        }

        public Criteria andReportdateEqualTo(String value) {
            addCriterion("reportdate =", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateNotEqualTo(String value) {
            addCriterion("reportdate <>", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateGreaterThan(String value) {
            addCriterion("reportdate >", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateGreaterThanOrEqualTo(String value) {
            addCriterion("reportdate >=", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateLessThan(String value) {
            addCriterion("reportdate <", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateLessThanOrEqualTo(String value) {
            addCriterion("reportdate <=", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateLike(String value) {
            addCriterion("reportdate like", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateNotLike(String value) {
            addCriterion("reportdate not like", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateIn(List<String> values) {
            addCriterion("reportdate in", values, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateNotIn(List<String> values) {
            addCriterion("reportdate not in", values, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateBetween(String value1, String value2) {
            addCriterion("reportdate between", value1, value2, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateNotBetween(String value1, String value2) {
            addCriterion("reportdate not between", value1, value2, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReporterIsNull() {
            addCriterion("reporter is null");
            return (Criteria) this;
        }

        public Criteria andReporterIsNotNull() {
            addCriterion("reporter is not null");
            return (Criteria) this;
        }

        public Criteria andReporterEqualTo(String value) {
            addCriterion("reporter =", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotEqualTo(String value) {
            addCriterion("reporter <>", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterGreaterThan(String value) {
            addCriterion("reporter >", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterGreaterThanOrEqualTo(String value) {
            addCriterion("reporter >=", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterLessThan(String value) {
            addCriterion("reporter <", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterLessThanOrEqualTo(String value) {
            addCriterion("reporter <=", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterLike(String value) {
            addCriterion("reporter like", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotLike(String value) {
            addCriterion("reporter not like", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterIn(List<String> values) {
            addCriterion("reporter in", values, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotIn(List<String> values) {
            addCriterion("reporter not in", values, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterBetween(String value1, String value2) {
            addCriterion("reporter between", value1, value2, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotBetween(String value1, String value2) {
            addCriterion("reporter not between", value1, value2, "reporter");
            return (Criteria) this;
        }

        public Criteria andWasterwaterpartIsNull() {
            addCriterion("wasterwaterpart is null");
            return (Criteria) this;
        }

        public Criteria andWasterwaterpartIsNotNull() {
            addCriterion("wasterwaterpart is not null");
            return (Criteria) this;
        }

        public Criteria andWasterwaterpartEqualTo(String value) {
            addCriterion("wasterwaterpart =", value, "wasterwaterpart");
            return (Criteria) this;
        }

        public Criteria andWasterwaterpartNotEqualTo(String value) {
            addCriterion("wasterwaterpart <>", value, "wasterwaterpart");
            return (Criteria) this;
        }

        public Criteria andWasterwaterpartGreaterThan(String value) {
            addCriterion("wasterwaterpart >", value, "wasterwaterpart");
            return (Criteria) this;
        }

        public Criteria andWasterwaterpartGreaterThanOrEqualTo(String value) {
            addCriterion("wasterwaterpart >=", value, "wasterwaterpart");
            return (Criteria) this;
        }

        public Criteria andWasterwaterpartLessThan(String value) {
            addCriterion("wasterwaterpart <", value, "wasterwaterpart");
            return (Criteria) this;
        }

        public Criteria andWasterwaterpartLessThanOrEqualTo(String value) {
            addCriterion("wasterwaterpart <=", value, "wasterwaterpart");
            return (Criteria) this;
        }

        public Criteria andWasterwaterpartLike(String value) {
            addCriterion("wasterwaterpart like", value, "wasterwaterpart");
            return (Criteria) this;
        }

        public Criteria andWasterwaterpartNotLike(String value) {
            addCriterion("wasterwaterpart not like", value, "wasterwaterpart");
            return (Criteria) this;
        }

        public Criteria andWasterwaterpartIn(List<String> values) {
            addCriterion("wasterwaterpart in", values, "wasterwaterpart");
            return (Criteria) this;
        }

        public Criteria andWasterwaterpartNotIn(List<String> values) {
            addCriterion("wasterwaterpart not in", values, "wasterwaterpart");
            return (Criteria) this;
        }

        public Criteria andWasterwaterpartBetween(String value1, String value2) {
            addCriterion("wasterwaterpart between", value1, value2, "wasterwaterpart");
            return (Criteria) this;
        }

        public Criteria andWasterwaterpartNotBetween(String value1, String value2) {
            addCriterion("wasterwaterpart not between", value1, value2, "wasterwaterpart");
            return (Criteria) this;
        }

        public Criteria andHandlevolumnIsNull() {
            addCriterion("handlevolumn is null");
            return (Criteria) this;
        }

        public Criteria andHandlevolumnIsNotNull() {
            addCriterion("handlevolumn is not null");
            return (Criteria) this;
        }

        public Criteria andHandlevolumnEqualTo(Double value) {
            addCriterion("handlevolumn =", value, "handlevolumn");
            return (Criteria) this;
        }

        public Criteria andHandlevolumnNotEqualTo(Double value) {
            addCriterion("handlevolumn <>", value, "handlevolumn");
            return (Criteria) this;
        }

        public Criteria andHandlevolumnGreaterThan(Double value) {
            addCriterion("handlevolumn >", value, "handlevolumn");
            return (Criteria) this;
        }

        public Criteria andHandlevolumnGreaterThanOrEqualTo(Double value) {
            addCriterion("handlevolumn >=", value, "handlevolumn");
            return (Criteria) this;
        }

        public Criteria andHandlevolumnLessThan(Double value) {
            addCriterion("handlevolumn <", value, "handlevolumn");
            return (Criteria) this;
        }

        public Criteria andHandlevolumnLessThanOrEqualTo(Double value) {
            addCriterion("handlevolumn <=", value, "handlevolumn");
            return (Criteria) this;
        }

        public Criteria andHandlevolumnIn(List<Double> values) {
            addCriterion("handlevolumn in", values, "handlevolumn");
            return (Criteria) this;
        }

        public Criteria andHandlevolumnNotIn(List<Double> values) {
            addCriterion("handlevolumn not in", values, "handlevolumn");
            return (Criteria) this;
        }

        public Criteria andHandlevolumnBetween(Double value1, Double value2) {
            addCriterion("handlevolumn between", value1, value2, "handlevolumn");
            return (Criteria) this;
        }

        public Criteria andHandlevolumnNotBetween(Double value1, Double value2) {
            addCriterion("handlevolumn not between", value1, value2, "handlevolumn");
            return (Criteria) this;
        }

        public Criteria andFactorIsNull() {
            addCriterion("factor is null");
            return (Criteria) this;
        }

        public Criteria andFactorIsNotNull() {
            addCriterion("factor is not null");
            return (Criteria) this;
        }

        public Criteria andFactorEqualTo(Double value) {
            addCriterion("factor =", value, "factor");
            return (Criteria) this;
        }

        public Criteria andFactorNotEqualTo(Double value) {
            addCriterion("factor <>", value, "factor");
            return (Criteria) this;
        }

        public Criteria andFactorGreaterThan(Double value) {
            addCriterion("factor >", value, "factor");
            return (Criteria) this;
        }

        public Criteria andFactorGreaterThanOrEqualTo(Double value) {
            addCriterion("factor >=", value, "factor");
            return (Criteria) this;
        }

        public Criteria andFactorLessThan(Double value) {
            addCriterion("factor <", value, "factor");
            return (Criteria) this;
        }

        public Criteria andFactorLessThanOrEqualTo(Double value) {
            addCriterion("factor <=", value, "factor");
            return (Criteria) this;
        }

        public Criteria andFactorIn(List<Double> values) {
            addCriterion("factor in", values, "factor");
            return (Criteria) this;
        }

        public Criteria andFactorNotIn(List<Double> values) {
            addCriterion("factor not in", values, "factor");
            return (Criteria) this;
        }

        public Criteria andFactorBetween(Double value1, Double value2) {
            addCriterion("factor between", value1, value2, "factor");
            return (Criteria) this;
        }

        public Criteria andFactorNotBetween(Double value1, Double value2) {
            addCriterion("factor not between", value1, value2, "factor");
            return (Criteria) this;
        }

        public Criteria andRealpressureIsNull() {
            addCriterion("realpressure is null");
            return (Criteria) this;
        }

        public Criteria andRealpressureIsNotNull() {
            addCriterion("realpressure is not null");
            return (Criteria) this;
        }

        public Criteria andRealpressureEqualTo(Double value) {
            addCriterion("realpressure =", value, "realpressure");
            return (Criteria) this;
        }

        public Criteria andRealpressureNotEqualTo(Double value) {
            addCriterion("realpressure <>", value, "realpressure");
            return (Criteria) this;
        }

        public Criteria andRealpressureGreaterThan(Double value) {
            addCriterion("realpressure >", value, "realpressure");
            return (Criteria) this;
        }

        public Criteria andRealpressureGreaterThanOrEqualTo(Double value) {
            addCriterion("realpressure >=", value, "realpressure");
            return (Criteria) this;
        }

        public Criteria andRealpressureLessThan(Double value) {
            addCriterion("realpressure <", value, "realpressure");
            return (Criteria) this;
        }

        public Criteria andRealpressureLessThanOrEqualTo(Double value) {
            addCriterion("realpressure <=", value, "realpressure");
            return (Criteria) this;
        }

        public Criteria andRealpressureIn(List<Double> values) {
            addCriterion("realpressure in", values, "realpressure");
            return (Criteria) this;
        }

        public Criteria andRealpressureNotIn(List<Double> values) {
            addCriterion("realpressure not in", values, "realpressure");
            return (Criteria) this;
        }

        public Criteria andRealpressureBetween(Double value1, Double value2) {
            addCriterion("realpressure between", value1, value2, "realpressure");
            return (Criteria) this;
        }

        public Criteria andRealpressureNotBetween(Double value1, Double value2) {
            addCriterion("realpressure not between", value1, value2, "realpressure");
            return (Criteria) this;
        }

        public Criteria andVoczhiliIsNull() {
            addCriterion("voczhili is null");
            return (Criteria) this;
        }

        public Criteria andVoczhiliIsNotNull() {
            addCriterion("voczhili is not null");
            return (Criteria) this;
        }

        public Criteria andVoczhiliEqualTo(Integer value) {
            addCriterion("voczhili =", value, "voczhili");
            return (Criteria) this;
        }

        public Criteria andVoczhiliNotEqualTo(Integer value) {
            addCriterion("voczhili <>", value, "voczhili");
            return (Criteria) this;
        }

        public Criteria andVoczhiliGreaterThan(Integer value) {
            addCriterion("voczhili >", value, "voczhili");
            return (Criteria) this;
        }

        public Criteria andVoczhiliGreaterThanOrEqualTo(Integer value) {
            addCriterion("voczhili >=", value, "voczhili");
            return (Criteria) this;
        }

        public Criteria andVoczhiliLessThan(Integer value) {
            addCriterion("voczhili <", value, "voczhili");
            return (Criteria) this;
        }

        public Criteria andVoczhiliLessThanOrEqualTo(Integer value) {
            addCriterion("voczhili <=", value, "voczhili");
            return (Criteria) this;
        }

        public Criteria andVoczhiliIn(List<Integer> values) {
            addCriterion("voczhili in", values, "voczhili");
            return (Criteria) this;
        }

        public Criteria andVoczhiliNotIn(List<Integer> values) {
            addCriterion("voczhili not in", values, "voczhili");
            return (Criteria) this;
        }

        public Criteria andVoczhiliBetween(Integer value1, Integer value2) {
            addCriterion("voczhili between", value1, value2, "voczhili");
            return (Criteria) this;
        }

        public Criteria andVoczhiliNotBetween(Integer value1, Integer value2) {
            addCriterion("voczhili not between", value1, value2, "voczhili");
            return (Criteria) this;
        }

        public Criteria andEfficiencyIsNull() {
            addCriterion("efficiency is null");
            return (Criteria) this;
        }

        public Criteria andEfficiencyIsNotNull() {
            addCriterion("efficiency is not null");
            return (Criteria) this;
        }

        public Criteria andEfficiencyEqualTo(Double value) {
            addCriterion("efficiency =", value, "efficiency");
            return (Criteria) this;
        }

        public Criteria andEfficiencyNotEqualTo(Double value) {
            addCriterion("efficiency <>", value, "efficiency");
            return (Criteria) this;
        }

        public Criteria andEfficiencyGreaterThan(Double value) {
            addCriterion("efficiency >", value, "efficiency");
            return (Criteria) this;
        }

        public Criteria andEfficiencyGreaterThanOrEqualTo(Double value) {
            addCriterion("efficiency >=", value, "efficiency");
            return (Criteria) this;
        }

        public Criteria andEfficiencyLessThan(Double value) {
            addCriterion("efficiency <", value, "efficiency");
            return (Criteria) this;
        }

        public Criteria andEfficiencyLessThanOrEqualTo(Double value) {
            addCriterion("efficiency <=", value, "efficiency");
            return (Criteria) this;
        }

        public Criteria andEfficiencyIn(List<Double> values) {
            addCriterion("efficiency in", values, "efficiency");
            return (Criteria) this;
        }

        public Criteria andEfficiencyNotIn(List<Double> values) {
            addCriterion("efficiency not in", values, "efficiency");
            return (Criteria) this;
        }

        public Criteria andEfficiencyBetween(Double value1, Double value2) {
            addCriterion("efficiency between", value1, value2, "efficiency");
            return (Criteria) this;
        }

        public Criteria andEfficiencyNotBetween(Double value1, Double value2) {
            addCriterion("efficiency not between", value1, value2, "efficiency");
            return (Criteria) this;
        }

        public Criteria andCapcityIsNull() {
            addCriterion("capcity is null");
            return (Criteria) this;
        }

        public Criteria andCapcityIsNotNull() {
            addCriterion("capcity is not null");
            return (Criteria) this;
        }

        public Criteria andCapcityEqualTo(Double value) {
            addCriterion("capcity =", value, "capcity");
            return (Criteria) this;
        }

        public Criteria andCapcityNotEqualTo(Double value) {
            addCriterion("capcity <>", value, "capcity");
            return (Criteria) this;
        }

        public Criteria andCapcityGreaterThan(Double value) {
            addCriterion("capcity >", value, "capcity");
            return (Criteria) this;
        }

        public Criteria andCapcityGreaterThanOrEqualTo(Double value) {
            addCriterion("capcity >=", value, "capcity");
            return (Criteria) this;
        }

        public Criteria andCapcityLessThan(Double value) {
            addCriterion("capcity <", value, "capcity");
            return (Criteria) this;
        }

        public Criteria andCapcityLessThanOrEqualTo(Double value) {
            addCriterion("capcity <=", value, "capcity");
            return (Criteria) this;
        }

        public Criteria andCapcityIn(List<Double> values) {
            addCriterion("capcity in", values, "capcity");
            return (Criteria) this;
        }

        public Criteria andCapcityNotIn(List<Double> values) {
            addCriterion("capcity not in", values, "capcity");
            return (Criteria) this;
        }

        public Criteria andCapcityBetween(Double value1, Double value2) {
            addCriterion("capcity between", value1, value2, "capcity");
            return (Criteria) this;
        }

        public Criteria andCapcityNotBetween(Double value1, Double value2) {
            addCriterion("capcity not between", value1, value2, "capcity");
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