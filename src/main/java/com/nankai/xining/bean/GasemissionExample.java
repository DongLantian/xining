package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class GasemissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GasemissionExample() {
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

        public Criteria andGassurveyidIsNull() {
            addCriterion("gassurveyid is null");
            return (Criteria) this;
        }

        public Criteria andGassurveyidIsNotNull() {
            addCriterion("gassurveyid is not null");
            return (Criteria) this;
        }

        public Criteria andGassurveyidEqualTo(Integer value) {
            addCriterion("gassurveyid =", value, "gassurveyid");
            return (Criteria) this;
        }

        public Criteria andGassurveyidNotEqualTo(Integer value) {
            addCriterion("gassurveyid <>", value, "gassurveyid");
            return (Criteria) this;
        }

        public Criteria andGassurveyidGreaterThan(Integer value) {
            addCriterion("gassurveyid >", value, "gassurveyid");
            return (Criteria) this;
        }

        public Criteria andGassurveyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gassurveyid >=", value, "gassurveyid");
            return (Criteria) this;
        }

        public Criteria andGassurveyidLessThan(Integer value) {
            addCriterion("gassurveyid <", value, "gassurveyid");
            return (Criteria) this;
        }

        public Criteria andGassurveyidLessThanOrEqualTo(Integer value) {
            addCriterion("gassurveyid <=", value, "gassurveyid");
            return (Criteria) this;
        }

        public Criteria andGassurveyidIn(List<Integer> values) {
            addCriterion("gassurveyid in", values, "gassurveyid");
            return (Criteria) this;
        }

        public Criteria andGassurveyidNotIn(List<Integer> values) {
            addCriterion("gassurveyid not in", values, "gassurveyid");
            return (Criteria) this;
        }

        public Criteria andGassurveyidBetween(Integer value1, Integer value2) {
            addCriterion("gassurveyid between", value1, value2, "gassurveyid");
            return (Criteria) this;
        }

        public Criteria andGassurveyidNotBetween(Integer value1, Integer value2) {
            addCriterion("gassurveyid not between", value1, value2, "gassurveyid");
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

        public Criteria andDevicenameIsNull() {
            addCriterion("devicename is null");
            return (Criteria) this;
        }

        public Criteria andDevicenameIsNotNull() {
            addCriterion("devicename is not null");
            return (Criteria) this;
        }

        public Criteria andDevicenameEqualTo(String value) {
            addCriterion("devicename =", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameNotEqualTo(String value) {
            addCriterion("devicename <>", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameGreaterThan(String value) {
            addCriterion("devicename >", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameGreaterThanOrEqualTo(String value) {
            addCriterion("devicename >=", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameLessThan(String value) {
            addCriterion("devicename <", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameLessThanOrEqualTo(String value) {
            addCriterion("devicename <=", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameLike(String value) {
            addCriterion("devicename like", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameNotLike(String value) {
            addCriterion("devicename not like", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameIn(List<String> values) {
            addCriterion("devicename in", values, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameNotIn(List<String> values) {
            addCriterion("devicename not in", values, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameBetween(String value1, String value2) {
            addCriterion("devicename between", value1, value2, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameNotBetween(String value1, String value2) {
            addCriterion("devicename not between", value1, value2, "devicename");
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

        public Criteria andProcessflowIsNull() {
            addCriterion("processflow is null");
            return (Criteria) this;
        }

        public Criteria andProcessflowIsNotNull() {
            addCriterion("processflow is not null");
            return (Criteria) this;
        }

        public Criteria andProcessflowEqualTo(String value) {
            addCriterion("processflow =", value, "processflow");
            return (Criteria) this;
        }

        public Criteria andProcessflowNotEqualTo(String value) {
            addCriterion("processflow <>", value, "processflow");
            return (Criteria) this;
        }

        public Criteria andProcessflowGreaterThan(String value) {
            addCriterion("processflow >", value, "processflow");
            return (Criteria) this;
        }

        public Criteria andProcessflowGreaterThanOrEqualTo(String value) {
            addCriterion("processflow >=", value, "processflow");
            return (Criteria) this;
        }

        public Criteria andProcessflowLessThan(String value) {
            addCriterion("processflow <", value, "processflow");
            return (Criteria) this;
        }

        public Criteria andProcessflowLessThanOrEqualTo(String value) {
            addCriterion("processflow <=", value, "processflow");
            return (Criteria) this;
        }

        public Criteria andProcessflowLike(String value) {
            addCriterion("processflow like", value, "processflow");
            return (Criteria) this;
        }

        public Criteria andProcessflowNotLike(String value) {
            addCriterion("processflow not like", value, "processflow");
            return (Criteria) this;
        }

        public Criteria andProcessflowIn(List<String> values) {
            addCriterion("processflow in", values, "processflow");
            return (Criteria) this;
        }

        public Criteria andProcessflowNotIn(List<String> values) {
            addCriterion("processflow not in", values, "processflow");
            return (Criteria) this;
        }

        public Criteria andProcessflowBetween(String value1, String value2) {
            addCriterion("processflow between", value1, value2, "processflow");
            return (Criteria) this;
        }

        public Criteria andProcessflowNotBetween(String value1, String value2) {
            addCriterion("processflow not between", value1, value2, "processflow");
            return (Criteria) this;
        }

        public Criteria andRunhourIsNull() {
            addCriterion("runhour is null");
            return (Criteria) this;
        }

        public Criteria andRunhourIsNotNull() {
            addCriterion("runhour is not null");
            return (Criteria) this;
        }

        public Criteria andRunhourEqualTo(Double value) {
            addCriterion("runhour =", value, "runhour");
            return (Criteria) this;
        }

        public Criteria andRunhourNotEqualTo(Double value) {
            addCriterion("runhour <>", value, "runhour");
            return (Criteria) this;
        }

        public Criteria andRunhourGreaterThan(Double value) {
            addCriterion("runhour >", value, "runhour");
            return (Criteria) this;
        }

        public Criteria andRunhourGreaterThanOrEqualTo(Double value) {
            addCriterion("runhour >=", value, "runhour");
            return (Criteria) this;
        }

        public Criteria andRunhourLessThan(Double value) {
            addCriterion("runhour <", value, "runhour");
            return (Criteria) this;
        }

        public Criteria andRunhourLessThanOrEqualTo(Double value) {
            addCriterion("runhour <=", value, "runhour");
            return (Criteria) this;
        }

        public Criteria andRunhourIn(List<Double> values) {
            addCriterion("runhour in", values, "runhour");
            return (Criteria) this;
        }

        public Criteria andRunhourNotIn(List<Double> values) {
            addCriterion("runhour not in", values, "runhour");
            return (Criteria) this;
        }

        public Criteria andRunhourBetween(Double value1, Double value2) {
            addCriterion("runhour between", value1, value2, "runhour");
            return (Criteria) this;
        }

        public Criteria andRunhourNotBetween(Double value1, Double value2) {
            addCriterion("runhour not between", value1, value2, "runhour");
            return (Criteria) this;
        }

        public Criteria andProductionIsNull() {
            addCriterion("production is null");
            return (Criteria) this;
        }

        public Criteria andProductionIsNotNull() {
            addCriterion("production is not null");
            return (Criteria) this;
        }

        public Criteria andProductionEqualTo(Double value) {
            addCriterion("production =", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionNotEqualTo(Double value) {
            addCriterion("production <>", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionGreaterThan(Double value) {
            addCriterion("production >", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionGreaterThanOrEqualTo(Double value) {
            addCriterion("production >=", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionLessThan(Double value) {
            addCriterion("production <", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionLessThanOrEqualTo(Double value) {
            addCriterion("production <=", value, "production");
            return (Criteria) this;
        }

        public Criteria andProductionIn(List<Double> values) {
            addCriterion("production in", values, "production");
            return (Criteria) this;
        }

        public Criteria andProductionNotIn(List<Double> values) {
            addCriterion("production not in", values, "production");
            return (Criteria) this;
        }

        public Criteria andProductionBetween(Double value1, Double value2) {
            addCriterion("production between", value1, value2, "production");
            return (Criteria) this;
        }

        public Criteria andProductionNotBetween(Double value1, Double value2) {
            addCriterion("production not between", value1, value2, "production");
            return (Criteria) this;
        }

        public Criteria andEmissionwayIsNull() {
            addCriterion("emissionway is null");
            return (Criteria) this;
        }

        public Criteria andEmissionwayIsNotNull() {
            addCriterion("emissionway is not null");
            return (Criteria) this;
        }

        public Criteria andEmissionwayEqualTo(String value) {
            addCriterion("emissionway =", value, "emissionway");
            return (Criteria) this;
        }

        public Criteria andEmissionwayNotEqualTo(String value) {
            addCriterion("emissionway <>", value, "emissionway");
            return (Criteria) this;
        }

        public Criteria andEmissionwayGreaterThan(String value) {
            addCriterion("emissionway >", value, "emissionway");
            return (Criteria) this;
        }

        public Criteria andEmissionwayGreaterThanOrEqualTo(String value) {
            addCriterion("emissionway >=", value, "emissionway");
            return (Criteria) this;
        }

        public Criteria andEmissionwayLessThan(String value) {
            addCriterion("emissionway <", value, "emissionway");
            return (Criteria) this;
        }

        public Criteria andEmissionwayLessThanOrEqualTo(String value) {
            addCriterion("emissionway <=", value, "emissionway");
            return (Criteria) this;
        }

        public Criteria andEmissionwayLike(String value) {
            addCriterion("emissionway like", value, "emissionway");
            return (Criteria) this;
        }

        public Criteria andEmissionwayNotLike(String value) {
            addCriterion("emissionway not like", value, "emissionway");
            return (Criteria) this;
        }

        public Criteria andEmissionwayIn(List<String> values) {
            addCriterion("emissionway in", values, "emissionway");
            return (Criteria) this;
        }

        public Criteria andEmissionwayNotIn(List<String> values) {
            addCriterion("emissionway not in", values, "emissionway");
            return (Criteria) this;
        }

        public Criteria andEmissionwayBetween(String value1, String value2) {
            addCriterion("emissionway between", value1, value2, "emissionway");
            return (Criteria) this;
        }

        public Criteria andEmissionwayNotBetween(String value1, String value2) {
            addCriterion("emissionway not between", value1, value2, "emissionway");
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

        public Criteria andHandledeviceefficiencyIsNull() {
            addCriterion("handledeviceefficiency is null");
            return (Criteria) this;
        }

        public Criteria andHandledeviceefficiencyIsNotNull() {
            addCriterion("handledeviceefficiency is not null");
            return (Criteria) this;
        }

        public Criteria andHandledeviceefficiencyEqualTo(Double value) {
            addCriterion("handledeviceefficiency =", value, "handledeviceefficiency");
            return (Criteria) this;
        }

        public Criteria andHandledeviceefficiencyNotEqualTo(Double value) {
            addCriterion("handledeviceefficiency <>", value, "handledeviceefficiency");
            return (Criteria) this;
        }

        public Criteria andHandledeviceefficiencyGreaterThan(Double value) {
            addCriterion("handledeviceefficiency >", value, "handledeviceefficiency");
            return (Criteria) this;
        }

        public Criteria andHandledeviceefficiencyGreaterThanOrEqualTo(Double value) {
            addCriterion("handledeviceefficiency >=", value, "handledeviceefficiency");
            return (Criteria) this;
        }

        public Criteria andHandledeviceefficiencyLessThan(Double value) {
            addCriterion("handledeviceefficiency <", value, "handledeviceefficiency");
            return (Criteria) this;
        }

        public Criteria andHandledeviceefficiencyLessThanOrEqualTo(Double value) {
            addCriterion("handledeviceefficiency <=", value, "handledeviceefficiency");
            return (Criteria) this;
        }

        public Criteria andHandledeviceefficiencyIn(List<Double> values) {
            addCriterion("handledeviceefficiency in", values, "handledeviceefficiency");
            return (Criteria) this;
        }

        public Criteria andHandledeviceefficiencyNotIn(List<Double> values) {
            addCriterion("handledeviceefficiency not in", values, "handledeviceefficiency");
            return (Criteria) this;
        }

        public Criteria andHandledeviceefficiencyBetween(Double value1, Double value2) {
            addCriterion("handledeviceefficiency between", value1, value2, "handledeviceefficiency");
            return (Criteria) this;
        }

        public Criteria andHandledeviceefficiencyNotBetween(Double value1, Double value2) {
            addCriterion("handledeviceefficiency not between", value1, value2, "handledeviceefficiency");
            return (Criteria) this;
        }

        public Criteria andHandledevicenameIsNull() {
            addCriterion("handledevicename is null");
            return (Criteria) this;
        }

        public Criteria andHandledevicenameIsNotNull() {
            addCriterion("handledevicename is not null");
            return (Criteria) this;
        }

        public Criteria andHandledevicenameEqualTo(String value) {
            addCriterion("handledevicename =", value, "handledevicename");
            return (Criteria) this;
        }

        public Criteria andHandledevicenameNotEqualTo(String value) {
            addCriterion("handledevicename <>", value, "handledevicename");
            return (Criteria) this;
        }

        public Criteria andHandledevicenameGreaterThan(String value) {
            addCriterion("handledevicename >", value, "handledevicename");
            return (Criteria) this;
        }

        public Criteria andHandledevicenameGreaterThanOrEqualTo(String value) {
            addCriterion("handledevicename >=", value, "handledevicename");
            return (Criteria) this;
        }

        public Criteria andHandledevicenameLessThan(String value) {
            addCriterion("handledevicename <", value, "handledevicename");
            return (Criteria) this;
        }

        public Criteria andHandledevicenameLessThanOrEqualTo(String value) {
            addCriterion("handledevicename <=", value, "handledevicename");
            return (Criteria) this;
        }

        public Criteria andHandledevicenameLike(String value) {
            addCriterion("handledevicename like", value, "handledevicename");
            return (Criteria) this;
        }

        public Criteria andHandledevicenameNotLike(String value) {
            addCriterion("handledevicename not like", value, "handledevicename");
            return (Criteria) this;
        }

        public Criteria andHandledevicenameIn(List<String> values) {
            addCriterion("handledevicename in", values, "handledevicename");
            return (Criteria) this;
        }

        public Criteria andHandledevicenameNotIn(List<String> values) {
            addCriterion("handledevicename not in", values, "handledevicename");
            return (Criteria) this;
        }

        public Criteria andHandledevicenameBetween(String value1, String value2) {
            addCriterion("handledevicename between", value1, value2, "handledevicename");
            return (Criteria) this;
        }

        public Criteria andHandledevicenameNotBetween(String value1, String value2) {
            addCriterion("handledevicename not between", value1, value2, "handledevicename");
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

        public Criteria andHandledeviceflowIsNull() {
            addCriterion("handledeviceflow is null");
            return (Criteria) this;
        }

        public Criteria andHandledeviceflowIsNotNull() {
            addCriterion("handledeviceflow is not null");
            return (Criteria) this;
        }

        public Criteria andHandledeviceflowEqualTo(String value) {
            addCriterion("handledeviceflow =", value, "handledeviceflow");
            return (Criteria) this;
        }

        public Criteria andHandledeviceflowNotEqualTo(String value) {
            addCriterion("handledeviceflow <>", value, "handledeviceflow");
            return (Criteria) this;
        }

        public Criteria andHandledeviceflowGreaterThan(String value) {
            addCriterion("handledeviceflow >", value, "handledeviceflow");
            return (Criteria) this;
        }

        public Criteria andHandledeviceflowGreaterThanOrEqualTo(String value) {
            addCriterion("handledeviceflow >=", value, "handledeviceflow");
            return (Criteria) this;
        }

        public Criteria andHandledeviceflowLessThan(String value) {
            addCriterion("handledeviceflow <", value, "handledeviceflow");
            return (Criteria) this;
        }

        public Criteria andHandledeviceflowLessThanOrEqualTo(String value) {
            addCriterion("handledeviceflow <=", value, "handledeviceflow");
            return (Criteria) this;
        }

        public Criteria andHandledeviceflowLike(String value) {
            addCriterion("handledeviceflow like", value, "handledeviceflow");
            return (Criteria) this;
        }

        public Criteria andHandledeviceflowNotLike(String value) {
            addCriterion("handledeviceflow not like", value, "handledeviceflow");
            return (Criteria) this;
        }

        public Criteria andHandledeviceflowIn(List<String> values) {
            addCriterion("handledeviceflow in", values, "handledeviceflow");
            return (Criteria) this;
        }

        public Criteria andHandledeviceflowNotIn(List<String> values) {
            addCriterion("handledeviceflow not in", values, "handledeviceflow");
            return (Criteria) this;
        }

        public Criteria andHandledeviceflowBetween(String value1, String value2) {
            addCriterion("handledeviceflow between", value1, value2, "handledeviceflow");
            return (Criteria) this;
        }

        public Criteria andHandledeviceflowNotBetween(String value1, String value2) {
            addCriterion("handledeviceflow not between", value1, value2, "handledeviceflow");
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