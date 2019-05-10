package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class TankinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TankinfoExample() {
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

        public Criteria andTankidIsNull() {
            addCriterion("tankid is null");
            return (Criteria) this;
        }

        public Criteria andTankidIsNotNull() {
            addCriterion("tankid is not null");
            return (Criteria) this;
        }

        public Criteria andTankidEqualTo(Integer value) {
            addCriterion("tankid =", value, "tankid");
            return (Criteria) this;
        }

        public Criteria andTankidNotEqualTo(Integer value) {
            addCriterion("tankid <>", value, "tankid");
            return (Criteria) this;
        }

        public Criteria andTankidGreaterThan(Integer value) {
            addCriterion("tankid >", value, "tankid");
            return (Criteria) this;
        }

        public Criteria andTankidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tankid >=", value, "tankid");
            return (Criteria) this;
        }

        public Criteria andTankidLessThan(Integer value) {
            addCriterion("tankid <", value, "tankid");
            return (Criteria) this;
        }

        public Criteria andTankidLessThanOrEqualTo(Integer value) {
            addCriterion("tankid <=", value, "tankid");
            return (Criteria) this;
        }

        public Criteria andTankidIn(List<Integer> values) {
            addCriterion("tankid in", values, "tankid");
            return (Criteria) this;
        }

        public Criteria andTankidNotIn(List<Integer> values) {
            addCriterion("tankid not in", values, "tankid");
            return (Criteria) this;
        }

        public Criteria andTankidBetween(Integer value1, Integer value2) {
            addCriterion("tankid between", value1, value2, "tankid");
            return (Criteria) this;
        }

        public Criteria andTankidNotBetween(Integer value1, Integer value2) {
            addCriterion("tankid not between", value1, value2, "tankid");
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

        public Criteria andSamenumIsNull() {
            addCriterion("samenum is null");
            return (Criteria) this;
        }

        public Criteria andSamenumIsNotNull() {
            addCriterion("samenum is not null");
            return (Criteria) this;
        }

        public Criteria andSamenumEqualTo(Integer value) {
            addCriterion("samenum =", value, "samenum");
            return (Criteria) this;
        }

        public Criteria andSamenumNotEqualTo(Integer value) {
            addCriterion("samenum <>", value, "samenum");
            return (Criteria) this;
        }

        public Criteria andSamenumGreaterThan(Integer value) {
            addCriterion("samenum >", value, "samenum");
            return (Criteria) this;
        }

        public Criteria andSamenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("samenum >=", value, "samenum");
            return (Criteria) this;
        }

        public Criteria andSamenumLessThan(Integer value) {
            addCriterion("samenum <", value, "samenum");
            return (Criteria) this;
        }

        public Criteria andSamenumLessThanOrEqualTo(Integer value) {
            addCriterion("samenum <=", value, "samenum");
            return (Criteria) this;
        }

        public Criteria andSamenumIn(List<Integer> values) {
            addCriterion("samenum in", values, "samenum");
            return (Criteria) this;
        }

        public Criteria andSamenumNotIn(List<Integer> values) {
            addCriterion("samenum not in", values, "samenum");
            return (Criteria) this;
        }

        public Criteria andSamenumBetween(Integer value1, Integer value2) {
            addCriterion("samenum between", value1, value2, "samenum");
            return (Criteria) this;
        }

        public Criteria andSamenumNotBetween(Integer value1, Integer value2) {
            addCriterion("samenum not between", value1, value2, "samenum");
            return (Criteria) this;
        }

        public Criteria andTanktypeIsNull() {
            addCriterion("tanktype is null");
            return (Criteria) this;
        }

        public Criteria andTanktypeIsNotNull() {
            addCriterion("tanktype is not null");
            return (Criteria) this;
        }

        public Criteria andTanktypeEqualTo(String value) {
            addCriterion("tanktype =", value, "tanktype");
            return (Criteria) this;
        }

        public Criteria andTanktypeNotEqualTo(String value) {
            addCriterion("tanktype <>", value, "tanktype");
            return (Criteria) this;
        }

        public Criteria andTanktypeGreaterThan(String value) {
            addCriterion("tanktype >", value, "tanktype");
            return (Criteria) this;
        }

        public Criteria andTanktypeGreaterThanOrEqualTo(String value) {
            addCriterion("tanktype >=", value, "tanktype");
            return (Criteria) this;
        }

        public Criteria andTanktypeLessThan(String value) {
            addCriterion("tanktype <", value, "tanktype");
            return (Criteria) this;
        }

        public Criteria andTanktypeLessThanOrEqualTo(String value) {
            addCriterion("tanktype <=", value, "tanktype");
            return (Criteria) this;
        }

        public Criteria andTanktypeLike(String value) {
            addCriterion("tanktype like", value, "tanktype");
            return (Criteria) this;
        }

        public Criteria andTanktypeNotLike(String value) {
            addCriterion("tanktype not like", value, "tanktype");
            return (Criteria) this;
        }

        public Criteria andTanktypeIn(List<String> values) {
            addCriterion("tanktype in", values, "tanktype");
            return (Criteria) this;
        }

        public Criteria andTanktypeNotIn(List<String> values) {
            addCriterion("tanktype not in", values, "tanktype");
            return (Criteria) this;
        }

        public Criteria andTanktypeBetween(String value1, String value2) {
            addCriterion("tanktype between", value1, value2, "tanktype");
            return (Criteria) this;
        }

        public Criteria andTanktypeNotBetween(String value1, String value2) {
            addCriterion("tanktype not between", value1, value2, "tanktype");
            return (Criteria) this;
        }

        public Criteria andTanklengthIsNull() {
            addCriterion("tanklength is null");
            return (Criteria) this;
        }

        public Criteria andTanklengthIsNotNull() {
            addCriterion("tanklength is not null");
            return (Criteria) this;
        }

        public Criteria andTanklengthEqualTo(Double value) {
            addCriterion("tanklength =", value, "tanklength");
            return (Criteria) this;
        }

        public Criteria andTanklengthNotEqualTo(Double value) {
            addCriterion("tanklength <>", value, "tanklength");
            return (Criteria) this;
        }

        public Criteria andTanklengthGreaterThan(Double value) {
            addCriterion("tanklength >", value, "tanklength");
            return (Criteria) this;
        }

        public Criteria andTanklengthGreaterThanOrEqualTo(Double value) {
            addCriterion("tanklength >=", value, "tanklength");
            return (Criteria) this;
        }

        public Criteria andTanklengthLessThan(Double value) {
            addCriterion("tanklength <", value, "tanklength");
            return (Criteria) this;
        }

        public Criteria andTanklengthLessThanOrEqualTo(Double value) {
            addCriterion("tanklength <=", value, "tanklength");
            return (Criteria) this;
        }

        public Criteria andTanklengthIn(List<Double> values) {
            addCriterion("tanklength in", values, "tanklength");
            return (Criteria) this;
        }

        public Criteria andTanklengthNotIn(List<Double> values) {
            addCriterion("tanklength not in", values, "tanklength");
            return (Criteria) this;
        }

        public Criteria andTanklengthBetween(Double value1, Double value2) {
            addCriterion("tanklength between", value1, value2, "tanklength");
            return (Criteria) this;
        }

        public Criteria andTanklengthNotBetween(Double value1, Double value2) {
            addCriterion("tanklength not between", value1, value2, "tanklength");
            return (Criteria) this;
        }

        public Criteria andTankdiameterIsNull() {
            addCriterion("tankdiameter is null");
            return (Criteria) this;
        }

        public Criteria andTankdiameterIsNotNull() {
            addCriterion("tankdiameter is not null");
            return (Criteria) this;
        }

        public Criteria andTankdiameterEqualTo(Double value) {
            addCriterion("tankdiameter =", value, "tankdiameter");
            return (Criteria) this;
        }

        public Criteria andTankdiameterNotEqualTo(Double value) {
            addCriterion("tankdiameter <>", value, "tankdiameter");
            return (Criteria) this;
        }

        public Criteria andTankdiameterGreaterThan(Double value) {
            addCriterion("tankdiameter >", value, "tankdiameter");
            return (Criteria) this;
        }

        public Criteria andTankdiameterGreaterThanOrEqualTo(Double value) {
            addCriterion("tankdiameter >=", value, "tankdiameter");
            return (Criteria) this;
        }

        public Criteria andTankdiameterLessThan(Double value) {
            addCriterion("tankdiameter <", value, "tankdiameter");
            return (Criteria) this;
        }

        public Criteria andTankdiameterLessThanOrEqualTo(Double value) {
            addCriterion("tankdiameter <=", value, "tankdiameter");
            return (Criteria) this;
        }

        public Criteria andTankdiameterIn(List<Double> values) {
            addCriterion("tankdiameter in", values, "tankdiameter");
            return (Criteria) this;
        }

        public Criteria andTankdiameterNotIn(List<Double> values) {
            addCriterion("tankdiameter not in", values, "tankdiameter");
            return (Criteria) this;
        }

        public Criteria andTankdiameterBetween(Double value1, Double value2) {
            addCriterion("tankdiameter between", value1, value2, "tankdiameter");
            return (Criteria) this;
        }

        public Criteria andTankdiameterNotBetween(Double value1, Double value2) {
            addCriterion("tankdiameter not between", value1, value2, "tankdiameter");
            return (Criteria) this;
        }

        public Criteria andWorkingvolumnIsNull() {
            addCriterion("workingvolumn is null");
            return (Criteria) this;
        }

        public Criteria andWorkingvolumnIsNotNull() {
            addCriterion("workingvolumn is not null");
            return (Criteria) this;
        }

        public Criteria andWorkingvolumnEqualTo(Double value) {
            addCriterion("workingvolumn =", value, "workingvolumn");
            return (Criteria) this;
        }

        public Criteria andWorkingvolumnNotEqualTo(Double value) {
            addCriterion("workingvolumn <>", value, "workingvolumn");
            return (Criteria) this;
        }

        public Criteria andWorkingvolumnGreaterThan(Double value) {
            addCriterion("workingvolumn >", value, "workingvolumn");
            return (Criteria) this;
        }

        public Criteria andWorkingvolumnGreaterThanOrEqualTo(Double value) {
            addCriterion("workingvolumn >=", value, "workingvolumn");
            return (Criteria) this;
        }

        public Criteria andWorkingvolumnLessThan(Double value) {
            addCriterion("workingvolumn <", value, "workingvolumn");
            return (Criteria) this;
        }

        public Criteria andWorkingvolumnLessThanOrEqualTo(Double value) {
            addCriterion("workingvolumn <=", value, "workingvolumn");
            return (Criteria) this;
        }

        public Criteria andWorkingvolumnIn(List<Double> values) {
            addCriterion("workingvolumn in", values, "workingvolumn");
            return (Criteria) this;
        }

        public Criteria andWorkingvolumnNotIn(List<Double> values) {
            addCriterion("workingvolumn not in", values, "workingvolumn");
            return (Criteria) this;
        }

        public Criteria andWorkingvolumnBetween(Double value1, Double value2) {
            addCriterion("workingvolumn between", value1, value2, "workingvolumn");
            return (Criteria) this;
        }

        public Criteria andWorkingvolumnNotBetween(Double value1, Double value2) {
            addCriterion("workingvolumn not between", value1, value2, "workingvolumn");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNull() {
            addCriterion("frequency is null");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNotNull() {
            addCriterion("frequency is not null");
            return (Criteria) this;
        }

        public Criteria andFrequencyEqualTo(Double value) {
            addCriterion("frequency =", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotEqualTo(Double value) {
            addCriterion("frequency <>", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThan(Double value) {
            addCriterion("frequency >", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThanOrEqualTo(Double value) {
            addCriterion("frequency >=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThan(Double value) {
            addCriterion("frequency <", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThanOrEqualTo(Double value) {
            addCriterion("frequency <=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyIn(List<Double> values) {
            addCriterion("frequency in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotIn(List<Double> values) {
            addCriterion("frequency not in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyBetween(Double value1, Double value2) {
            addCriterion("frequency between", value1, value2, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotBetween(Double value1, Double value2) {
            addCriterion("frequency not between", value1, value2, "frequency");
            return (Criteria) this;
        }

        public Criteria andCapacityIsNull() {
            addCriterion("capacity is null");
            return (Criteria) this;
        }

        public Criteria andCapacityIsNotNull() {
            addCriterion("capacity is not null");
            return (Criteria) this;
        }

        public Criteria andCapacityEqualTo(Double value) {
            addCriterion("capacity =", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotEqualTo(Double value) {
            addCriterion("capacity <>", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityGreaterThan(Double value) {
            addCriterion("capacity >", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityGreaterThanOrEqualTo(Double value) {
            addCriterion("capacity >=", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLessThan(Double value) {
            addCriterion("capacity <", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLessThanOrEqualTo(Double value) {
            addCriterion("capacity <=", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityIn(List<Double> values) {
            addCriterion("capacity in", values, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotIn(List<Double> values) {
            addCriterion("capacity not in", values, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityBetween(Double value1, Double value2) {
            addCriterion("capacity between", value1, value2, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotBetween(Double value1, Double value2) {
            addCriterion("capacity not between", value1, value2, "capacity");
            return (Criteria) this;
        }

        public Criteria andMaxheightIsNull() {
            addCriterion("maxheight is null");
            return (Criteria) this;
        }

        public Criteria andMaxheightIsNotNull() {
            addCriterion("maxheight is not null");
            return (Criteria) this;
        }

        public Criteria andMaxheightEqualTo(Double value) {
            addCriterion("maxheight =", value, "maxheight");
            return (Criteria) this;
        }

        public Criteria andMaxheightNotEqualTo(Double value) {
            addCriterion("maxheight <>", value, "maxheight");
            return (Criteria) this;
        }

        public Criteria andMaxheightGreaterThan(Double value) {
            addCriterion("maxheight >", value, "maxheight");
            return (Criteria) this;
        }

        public Criteria andMaxheightGreaterThanOrEqualTo(Double value) {
            addCriterion("maxheight >=", value, "maxheight");
            return (Criteria) this;
        }

        public Criteria andMaxheightLessThan(Double value) {
            addCriterion("maxheight <", value, "maxheight");
            return (Criteria) this;
        }

        public Criteria andMaxheightLessThanOrEqualTo(Double value) {
            addCriterion("maxheight <=", value, "maxheight");
            return (Criteria) this;
        }

        public Criteria andMaxheightIn(List<Double> values) {
            addCriterion("maxheight in", values, "maxheight");
            return (Criteria) this;
        }

        public Criteria andMaxheightNotIn(List<Double> values) {
            addCriterion("maxheight not in", values, "maxheight");
            return (Criteria) this;
        }

        public Criteria andMaxheightBetween(Double value1, Double value2) {
            addCriterion("maxheight between", value1, value2, "maxheight");
            return (Criteria) this;
        }

        public Criteria andMaxheightNotBetween(Double value1, Double value2) {
            addCriterion("maxheight not between", value1, value2, "maxheight");
            return (Criteria) this;
        }

        public Criteria andAverageheightIsNull() {
            addCriterion("averageheight is null");
            return (Criteria) this;
        }

        public Criteria andAverageheightIsNotNull() {
            addCriterion("averageheight is not null");
            return (Criteria) this;
        }

        public Criteria andAverageheightEqualTo(Double value) {
            addCriterion("averageheight =", value, "averageheight");
            return (Criteria) this;
        }

        public Criteria andAverageheightNotEqualTo(Double value) {
            addCriterion("averageheight <>", value, "averageheight");
            return (Criteria) this;
        }

        public Criteria andAverageheightGreaterThan(Double value) {
            addCriterion("averageheight >", value, "averageheight");
            return (Criteria) this;
        }

        public Criteria andAverageheightGreaterThanOrEqualTo(Double value) {
            addCriterion("averageheight >=", value, "averageheight");
            return (Criteria) this;
        }

        public Criteria andAverageheightLessThan(Double value) {
            addCriterion("averageheight <", value, "averageheight");
            return (Criteria) this;
        }

        public Criteria andAverageheightLessThanOrEqualTo(Double value) {
            addCriterion("averageheight <=", value, "averageheight");
            return (Criteria) this;
        }

        public Criteria andAverageheightIn(List<Double> values) {
            addCriterion("averageheight in", values, "averageheight");
            return (Criteria) this;
        }

        public Criteria andAverageheightNotIn(List<Double> values) {
            addCriterion("averageheight not in", values, "averageheight");
            return (Criteria) this;
        }

        public Criteria andAverageheightBetween(Double value1, Double value2) {
            addCriterion("averageheight between", value1, value2, "averageheight");
            return (Criteria) this;
        }

        public Criteria andAverageheightNotBetween(Double value1, Double value2) {
            addCriterion("averageheight not between", value1, value2, "averageheight");
            return (Criteria) this;
        }

        public Criteria andInnerstateIsNull() {
            addCriterion("innerstate is null");
            return (Criteria) this;
        }

        public Criteria andInnerstateIsNotNull() {
            addCriterion("innerstate is not null");
            return (Criteria) this;
        }

        public Criteria andInnerstateEqualTo(String value) {
            addCriterion("innerstate =", value, "innerstate");
            return (Criteria) this;
        }

        public Criteria andInnerstateNotEqualTo(String value) {
            addCriterion("innerstate <>", value, "innerstate");
            return (Criteria) this;
        }

        public Criteria andInnerstateGreaterThan(String value) {
            addCriterion("innerstate >", value, "innerstate");
            return (Criteria) this;
        }

        public Criteria andInnerstateGreaterThanOrEqualTo(String value) {
            addCriterion("innerstate >=", value, "innerstate");
            return (Criteria) this;
        }

        public Criteria andInnerstateLessThan(String value) {
            addCriterion("innerstate <", value, "innerstate");
            return (Criteria) this;
        }

        public Criteria andInnerstateLessThanOrEqualTo(String value) {
            addCriterion("innerstate <=", value, "innerstate");
            return (Criteria) this;
        }

        public Criteria andInnerstateLike(String value) {
            addCriterion("innerstate like", value, "innerstate");
            return (Criteria) this;
        }

        public Criteria andInnerstateNotLike(String value) {
            addCriterion("innerstate not like", value, "innerstate");
            return (Criteria) this;
        }

        public Criteria andInnerstateIn(List<String> values) {
            addCriterion("innerstate in", values, "innerstate");
            return (Criteria) this;
        }

        public Criteria andInnerstateNotIn(List<String> values) {
            addCriterion("innerstate not in", values, "innerstate");
            return (Criteria) this;
        }

        public Criteria andInnerstateBetween(String value1, String value2) {
            addCriterion("innerstate between", value1, value2, "innerstate");
            return (Criteria) this;
        }

        public Criteria andInnerstateNotBetween(String value1, String value2) {
            addCriterion("innerstate not between", value1, value2, "innerstate");
            return (Criteria) this;
        }

        public Criteria andTankcolorIsNull() {
            addCriterion("tankcolor is null");
            return (Criteria) this;
        }

        public Criteria andTankcolorIsNotNull() {
            addCriterion("tankcolor is not null");
            return (Criteria) this;
        }

        public Criteria andTankcolorEqualTo(String value) {
            addCriterion("tankcolor =", value, "tankcolor");
            return (Criteria) this;
        }

        public Criteria andTankcolorNotEqualTo(String value) {
            addCriterion("tankcolor <>", value, "tankcolor");
            return (Criteria) this;
        }

        public Criteria andTankcolorGreaterThan(String value) {
            addCriterion("tankcolor >", value, "tankcolor");
            return (Criteria) this;
        }

        public Criteria andTankcolorGreaterThanOrEqualTo(String value) {
            addCriterion("tankcolor >=", value, "tankcolor");
            return (Criteria) this;
        }

        public Criteria andTankcolorLessThan(String value) {
            addCriterion("tankcolor <", value, "tankcolor");
            return (Criteria) this;
        }

        public Criteria andTankcolorLessThanOrEqualTo(String value) {
            addCriterion("tankcolor <=", value, "tankcolor");
            return (Criteria) this;
        }

        public Criteria andTankcolorLike(String value) {
            addCriterion("tankcolor like", value, "tankcolor");
            return (Criteria) this;
        }

        public Criteria andTankcolorNotLike(String value) {
            addCriterion("tankcolor not like", value, "tankcolor");
            return (Criteria) this;
        }

        public Criteria andTankcolorIn(List<String> values) {
            addCriterion("tankcolor in", values, "tankcolor");
            return (Criteria) this;
        }

        public Criteria andTankcolorNotIn(List<String> values) {
            addCriterion("tankcolor not in", values, "tankcolor");
            return (Criteria) this;
        }

        public Criteria andTankcolorBetween(String value1, String value2) {
            addCriterion("tankcolor between", value1, value2, "tankcolor");
            return (Criteria) this;
        }

        public Criteria andTankcolorNotBetween(String value1, String value2) {
            addCriterion("tankcolor not between", value1, value2, "tankcolor");
            return (Criteria) this;
        }

        public Criteria andPaintstateIsNull() {
            addCriterion("paintstate is null");
            return (Criteria) this;
        }

        public Criteria andPaintstateIsNotNull() {
            addCriterion("paintstate is not null");
            return (Criteria) this;
        }

        public Criteria andPaintstateEqualTo(String value) {
            addCriterion("paintstate =", value, "paintstate");
            return (Criteria) this;
        }

        public Criteria andPaintstateNotEqualTo(String value) {
            addCriterion("paintstate <>", value, "paintstate");
            return (Criteria) this;
        }

        public Criteria andPaintstateGreaterThan(String value) {
            addCriterion("paintstate >", value, "paintstate");
            return (Criteria) this;
        }

        public Criteria andPaintstateGreaterThanOrEqualTo(String value) {
            addCriterion("paintstate >=", value, "paintstate");
            return (Criteria) this;
        }

        public Criteria andPaintstateLessThan(String value) {
            addCriterion("paintstate <", value, "paintstate");
            return (Criteria) this;
        }

        public Criteria andPaintstateLessThanOrEqualTo(String value) {
            addCriterion("paintstate <=", value, "paintstate");
            return (Criteria) this;
        }

        public Criteria andPaintstateLike(String value) {
            addCriterion("paintstate like", value, "paintstate");
            return (Criteria) this;
        }

        public Criteria andPaintstateNotLike(String value) {
            addCriterion("paintstate not like", value, "paintstate");
            return (Criteria) this;
        }

        public Criteria andPaintstateIn(List<String> values) {
            addCriterion("paintstate in", values, "paintstate");
            return (Criteria) this;
        }

        public Criteria andPaintstateNotIn(List<String> values) {
            addCriterion("paintstate not in", values, "paintstate");
            return (Criteria) this;
        }

        public Criteria andPaintstateBetween(String value1, String value2) {
            addCriterion("paintstate between", value1, value2, "paintstate");
            return (Criteria) this;
        }

        public Criteria andPaintstateNotBetween(String value1, String value2) {
            addCriterion("paintstate not between", value1, value2, "paintstate");
            return (Criteria) this;
        }

        public Criteria andUptanktopcolorIsNull() {
            addCriterion("uptanktopcolor is null");
            return (Criteria) this;
        }

        public Criteria andUptanktopcolorIsNotNull() {
            addCriterion("uptanktopcolor is not null");
            return (Criteria) this;
        }

        public Criteria andUptanktopcolorEqualTo(String value) {
            addCriterion("uptanktopcolor =", value, "uptanktopcolor");
            return (Criteria) this;
        }

        public Criteria andUptanktopcolorNotEqualTo(String value) {
            addCriterion("uptanktopcolor <>", value, "uptanktopcolor");
            return (Criteria) this;
        }

        public Criteria andUptanktopcolorGreaterThan(String value) {
            addCriterion("uptanktopcolor >", value, "uptanktopcolor");
            return (Criteria) this;
        }

        public Criteria andUptanktopcolorGreaterThanOrEqualTo(String value) {
            addCriterion("uptanktopcolor >=", value, "uptanktopcolor");
            return (Criteria) this;
        }

        public Criteria andUptanktopcolorLessThan(String value) {
            addCriterion("uptanktopcolor <", value, "uptanktopcolor");
            return (Criteria) this;
        }

        public Criteria andUptanktopcolorLessThanOrEqualTo(String value) {
            addCriterion("uptanktopcolor <=", value, "uptanktopcolor");
            return (Criteria) this;
        }

        public Criteria andUptanktopcolorLike(String value) {
            addCriterion("uptanktopcolor like", value, "uptanktopcolor");
            return (Criteria) this;
        }

        public Criteria andUptanktopcolorNotLike(String value) {
            addCriterion("uptanktopcolor not like", value, "uptanktopcolor");
            return (Criteria) this;
        }

        public Criteria andUptanktopcolorIn(List<String> values) {
            addCriterion("uptanktopcolor in", values, "uptanktopcolor");
            return (Criteria) this;
        }

        public Criteria andUptanktopcolorNotIn(List<String> values) {
            addCriterion("uptanktopcolor not in", values, "uptanktopcolor");
            return (Criteria) this;
        }

        public Criteria andUptanktopcolorBetween(String value1, String value2) {
            addCriterion("uptanktopcolor between", value1, value2, "uptanktopcolor");
            return (Criteria) this;
        }

        public Criteria andUptanktopcolorNotBetween(String value1, String value2) {
            addCriterion("uptanktopcolor not between", value1, value2, "uptanktopcolor");
            return (Criteria) this;
        }

        public Criteria andUptanktoppaintstateIsNull() {
            addCriterion("uptanktoppaintstate is null");
            return (Criteria) this;
        }

        public Criteria andUptanktoppaintstateIsNotNull() {
            addCriterion("uptanktoppaintstate is not null");
            return (Criteria) this;
        }

        public Criteria andUptanktoppaintstateEqualTo(String value) {
            addCriterion("uptanktoppaintstate =", value, "uptanktoppaintstate");
            return (Criteria) this;
        }

        public Criteria andUptanktoppaintstateNotEqualTo(String value) {
            addCriterion("uptanktoppaintstate <>", value, "uptanktoppaintstate");
            return (Criteria) this;
        }

        public Criteria andUptanktoppaintstateGreaterThan(String value) {
            addCriterion("uptanktoppaintstate >", value, "uptanktoppaintstate");
            return (Criteria) this;
        }

        public Criteria andUptanktoppaintstateGreaterThanOrEqualTo(String value) {
            addCriterion("uptanktoppaintstate >=", value, "uptanktoppaintstate");
            return (Criteria) this;
        }

        public Criteria andUptanktoppaintstateLessThan(String value) {
            addCriterion("uptanktoppaintstate <", value, "uptanktoppaintstate");
            return (Criteria) this;
        }

        public Criteria andUptanktoppaintstateLessThanOrEqualTo(String value) {
            addCriterion("uptanktoppaintstate <=", value, "uptanktoppaintstate");
            return (Criteria) this;
        }

        public Criteria andUptanktoppaintstateLike(String value) {
            addCriterion("uptanktoppaintstate like", value, "uptanktoppaintstate");
            return (Criteria) this;
        }

        public Criteria andUptanktoppaintstateNotLike(String value) {
            addCriterion("uptanktoppaintstate not like", value, "uptanktoppaintstate");
            return (Criteria) this;
        }

        public Criteria andUptanktoppaintstateIn(List<String> values) {
            addCriterion("uptanktoppaintstate in", values, "uptanktoppaintstate");
            return (Criteria) this;
        }

        public Criteria andUptanktoppaintstateNotIn(List<String> values) {
            addCriterion("uptanktoppaintstate not in", values, "uptanktoppaintstate");
            return (Criteria) this;
        }

        public Criteria andUptanktoppaintstateBetween(String value1, String value2) {
            addCriterion("uptanktoppaintstate between", value1, value2, "uptanktoppaintstate");
            return (Criteria) this;
        }

        public Criteria andUptanktoppaintstateNotBetween(String value1, String value2) {
            addCriterion("uptanktoppaintstate not between", value1, value2, "uptanktoppaintstate");
            return (Criteria) this;
        }

        public Criteria andUptanktoptypeIsNull() {
            addCriterion("uptanktoptype is null");
            return (Criteria) this;
        }

        public Criteria andUptanktoptypeIsNotNull() {
            addCriterion("uptanktoptype is not null");
            return (Criteria) this;
        }

        public Criteria andUptanktoptypeEqualTo(String value) {
            addCriterion("uptanktoptype =", value, "uptanktoptype");
            return (Criteria) this;
        }

        public Criteria andUptanktoptypeNotEqualTo(String value) {
            addCriterion("uptanktoptype <>", value, "uptanktoptype");
            return (Criteria) this;
        }

        public Criteria andUptanktoptypeGreaterThan(String value) {
            addCriterion("uptanktoptype >", value, "uptanktoptype");
            return (Criteria) this;
        }

        public Criteria andUptanktoptypeGreaterThanOrEqualTo(String value) {
            addCriterion("uptanktoptype >=", value, "uptanktoptype");
            return (Criteria) this;
        }

        public Criteria andUptanktoptypeLessThan(String value) {
            addCriterion("uptanktoptype <", value, "uptanktoptype");
            return (Criteria) this;
        }

        public Criteria andUptanktoptypeLessThanOrEqualTo(String value) {
            addCriterion("uptanktoptype <=", value, "uptanktoptype");
            return (Criteria) this;
        }

        public Criteria andUptanktoptypeLike(String value) {
            addCriterion("uptanktoptype like", value, "uptanktoptype");
            return (Criteria) this;
        }

        public Criteria andUptanktoptypeNotLike(String value) {
            addCriterion("uptanktoptype not like", value, "uptanktoptype");
            return (Criteria) this;
        }

        public Criteria andUptanktoptypeIn(List<String> values) {
            addCriterion("uptanktoptype in", values, "uptanktoptype");
            return (Criteria) this;
        }

        public Criteria andUptanktoptypeNotIn(List<String> values) {
            addCriterion("uptanktoptype not in", values, "uptanktoptype");
            return (Criteria) this;
        }

        public Criteria andUptanktoptypeBetween(String value1, String value2) {
            addCriterion("uptanktoptype between", value1, value2, "uptanktoptype");
            return (Criteria) this;
        }

        public Criteria andUptanktoptypeNotBetween(String value1, String value2) {
            addCriterion("uptanktoptype not between", value1, value2, "uptanktoptype");
            return (Criteria) this;
        }

        public Criteria andUptanktopheightIsNull() {
            addCriterion("uptanktopheight is null");
            return (Criteria) this;
        }

        public Criteria andUptanktopheightIsNotNull() {
            addCriterion("uptanktopheight is not null");
            return (Criteria) this;
        }

        public Criteria andUptanktopheightEqualTo(Double value) {
            addCriterion("uptanktopheight =", value, "uptanktopheight");
            return (Criteria) this;
        }

        public Criteria andUptanktopheightNotEqualTo(Double value) {
            addCriterion("uptanktopheight <>", value, "uptanktopheight");
            return (Criteria) this;
        }

        public Criteria andUptanktopheightGreaterThan(Double value) {
            addCriterion("uptanktopheight >", value, "uptanktopheight");
            return (Criteria) this;
        }

        public Criteria andUptanktopheightGreaterThanOrEqualTo(Double value) {
            addCriterion("uptanktopheight >=", value, "uptanktopheight");
            return (Criteria) this;
        }

        public Criteria andUptanktopheightLessThan(Double value) {
            addCriterion("uptanktopheight <", value, "uptanktopheight");
            return (Criteria) this;
        }

        public Criteria andUptanktopheightLessThanOrEqualTo(Double value) {
            addCriterion("uptanktopheight <=", value, "uptanktopheight");
            return (Criteria) this;
        }

        public Criteria andUptanktopheightIn(List<Double> values) {
            addCriterion("uptanktopheight in", values, "uptanktopheight");
            return (Criteria) this;
        }

        public Criteria andUptanktopheightNotIn(List<Double> values) {
            addCriterion("uptanktopheight not in", values, "uptanktopheight");
            return (Criteria) this;
        }

        public Criteria andUptanktopheightBetween(Double value1, Double value2) {
            addCriterion("uptanktopheight between", value1, value2, "uptanktopheight");
            return (Criteria) this;
        }

        public Criteria andUptanktopheightNotBetween(Double value1, Double value2) {
            addCriterion("uptanktopheight not between", value1, value2, "uptanktopheight");
            return (Criteria) this;
        }

        public Criteria andUproundradiusIsNull() {
            addCriterion("uproundradius is null");
            return (Criteria) this;
        }

        public Criteria andUproundradiusIsNotNull() {
            addCriterion("uproundradius is not null");
            return (Criteria) this;
        }

        public Criteria andUproundradiusEqualTo(Double value) {
            addCriterion("uproundradius =", value, "uproundradius");
            return (Criteria) this;
        }

        public Criteria andUproundradiusNotEqualTo(Double value) {
            addCriterion("uproundradius <>", value, "uproundradius");
            return (Criteria) this;
        }

        public Criteria andUproundradiusGreaterThan(Double value) {
            addCriterion("uproundradius >", value, "uproundradius");
            return (Criteria) this;
        }

        public Criteria andUproundradiusGreaterThanOrEqualTo(Double value) {
            addCriterion("uproundradius >=", value, "uproundradius");
            return (Criteria) this;
        }

        public Criteria andUproundradiusLessThan(Double value) {
            addCriterion("uproundradius <", value, "uproundradius");
            return (Criteria) this;
        }

        public Criteria andUproundradiusLessThanOrEqualTo(Double value) {
            addCriterion("uproundradius <=", value, "uproundradius");
            return (Criteria) this;
        }

        public Criteria andUproundradiusIn(List<Double> values) {
            addCriterion("uproundradius in", values, "uproundradius");
            return (Criteria) this;
        }

        public Criteria andUproundradiusNotIn(List<Double> values) {
            addCriterion("uproundradius not in", values, "uproundradius");
            return (Criteria) this;
        }

        public Criteria andUproundradiusBetween(Double value1, Double value2) {
            addCriterion("uproundradius between", value1, value2, "uproundradius");
            return (Criteria) this;
        }

        public Criteria andUproundradiusNotBetween(Double value1, Double value2) {
            addCriterion("uproundradius not between", value1, value2, "uproundradius");
            return (Criteria) this;
        }

        public Criteria andUptanktopgradeIsNull() {
            addCriterion("uptanktopgrade is null");
            return (Criteria) this;
        }

        public Criteria andUptanktopgradeIsNotNull() {
            addCriterion("uptanktopgrade is not null");
            return (Criteria) this;
        }

        public Criteria andUptanktopgradeEqualTo(Double value) {
            addCriterion("uptanktopgrade =", value, "uptanktopgrade");
            return (Criteria) this;
        }

        public Criteria andUptanktopgradeNotEqualTo(Double value) {
            addCriterion("uptanktopgrade <>", value, "uptanktopgrade");
            return (Criteria) this;
        }

        public Criteria andUptanktopgradeGreaterThan(Double value) {
            addCriterion("uptanktopgrade >", value, "uptanktopgrade");
            return (Criteria) this;
        }

        public Criteria andUptanktopgradeGreaterThanOrEqualTo(Double value) {
            addCriterion("uptanktopgrade >=", value, "uptanktopgrade");
            return (Criteria) this;
        }

        public Criteria andUptanktopgradeLessThan(Double value) {
            addCriterion("uptanktopgrade <", value, "uptanktopgrade");
            return (Criteria) this;
        }

        public Criteria andUptanktopgradeLessThanOrEqualTo(Double value) {
            addCriterion("uptanktopgrade <=", value, "uptanktopgrade");
            return (Criteria) this;
        }

        public Criteria andUptanktopgradeIn(List<Double> values) {
            addCriterion("uptanktopgrade in", values, "uptanktopgrade");
            return (Criteria) this;
        }

        public Criteria andUptanktopgradeNotIn(List<Double> values) {
            addCriterion("uptanktopgrade not in", values, "uptanktopgrade");
            return (Criteria) this;
        }

        public Criteria andUptanktopgradeBetween(Double value1, Double value2) {
            addCriterion("uptanktopgrade between", value1, value2, "uptanktopgrade");
            return (Criteria) this;
        }

        public Criteria andUptanktopgradeNotBetween(Double value1, Double value2) {
            addCriterion("uptanktopgrade not between", value1, value2, "uptanktopgrade");
            return (Criteria) this;
        }

        public Criteria andVacuumsetIsNull() {
            addCriterion("vacuumset is null");
            return (Criteria) this;
        }

        public Criteria andVacuumsetIsNotNull() {
            addCriterion("vacuumset is not null");
            return (Criteria) this;
        }

        public Criteria andVacuumsetEqualTo(Double value) {
            addCriterion("vacuumset =", value, "vacuumset");
            return (Criteria) this;
        }

        public Criteria andVacuumsetNotEqualTo(Double value) {
            addCriterion("vacuumset <>", value, "vacuumset");
            return (Criteria) this;
        }

        public Criteria andVacuumsetGreaterThan(Double value) {
            addCriterion("vacuumset >", value, "vacuumset");
            return (Criteria) this;
        }

        public Criteria andVacuumsetGreaterThanOrEqualTo(Double value) {
            addCriterion("vacuumset >=", value, "vacuumset");
            return (Criteria) this;
        }

        public Criteria andVacuumsetLessThan(Double value) {
            addCriterion("vacuumset <", value, "vacuumset");
            return (Criteria) this;
        }

        public Criteria andVacuumsetLessThanOrEqualTo(Double value) {
            addCriterion("vacuumset <=", value, "vacuumset");
            return (Criteria) this;
        }

        public Criteria andVacuumsetIn(List<Double> values) {
            addCriterion("vacuumset in", values, "vacuumset");
            return (Criteria) this;
        }

        public Criteria andVacuumsetNotIn(List<Double> values) {
            addCriterion("vacuumset not in", values, "vacuumset");
            return (Criteria) this;
        }

        public Criteria andVacuumsetBetween(Double value1, Double value2) {
            addCriterion("vacuumset between", value1, value2, "vacuumset");
            return (Criteria) this;
        }

        public Criteria andVacuumsetNotBetween(Double value1, Double value2) {
            addCriterion("vacuumset not between", value1, value2, "vacuumset");
            return (Criteria) this;
        }

        public Criteria andPressuresetIsNull() {
            addCriterion("pressureset is null");
            return (Criteria) this;
        }

        public Criteria andPressuresetIsNotNull() {
            addCriterion("pressureset is not null");
            return (Criteria) this;
        }

        public Criteria andPressuresetEqualTo(Double value) {
            addCriterion("pressureset =", value, "pressureset");
            return (Criteria) this;
        }

        public Criteria andPressuresetNotEqualTo(Double value) {
            addCriterion("pressureset <>", value, "pressureset");
            return (Criteria) this;
        }

        public Criteria andPressuresetGreaterThan(Double value) {
            addCriterion("pressureset >", value, "pressureset");
            return (Criteria) this;
        }

        public Criteria andPressuresetGreaterThanOrEqualTo(Double value) {
            addCriterion("pressureset >=", value, "pressureset");
            return (Criteria) this;
        }

        public Criteria andPressuresetLessThan(Double value) {
            addCriterion("pressureset <", value, "pressureset");
            return (Criteria) this;
        }

        public Criteria andPressuresetLessThanOrEqualTo(Double value) {
            addCriterion("pressureset <=", value, "pressureset");
            return (Criteria) this;
        }

        public Criteria andPressuresetIn(List<Double> values) {
            addCriterion("pressureset in", values, "pressureset");
            return (Criteria) this;
        }

        public Criteria andPressuresetNotIn(List<Double> values) {
            addCriterion("pressureset not in", values, "pressureset");
            return (Criteria) this;
        }

        public Criteria andPressuresetBetween(Double value1, Double value2) {
            addCriterion("pressureset between", value1, value2, "pressureset");
            return (Criteria) this;
        }

        public Criteria andPressuresetNotBetween(Double value1, Double value2) {
            addCriterion("pressureset not between", value1, value2, "pressureset");
            return (Criteria) this;
        }

        public Criteria andIssetheatIsNull() {
            addCriterion("issetheat is null");
            return (Criteria) this;
        }

        public Criteria andIssetheatIsNotNull() {
            addCriterion("issetheat is not null");
            return (Criteria) this;
        }

        public Criteria andIssetheatEqualTo(String value) {
            addCriterion("issetheat =", value, "issetheat");
            return (Criteria) this;
        }

        public Criteria andIssetheatNotEqualTo(String value) {
            addCriterion("issetheat <>", value, "issetheat");
            return (Criteria) this;
        }

        public Criteria andIssetheatGreaterThan(String value) {
            addCriterion("issetheat >", value, "issetheat");
            return (Criteria) this;
        }

        public Criteria andIssetheatGreaterThanOrEqualTo(String value) {
            addCriterion("issetheat >=", value, "issetheat");
            return (Criteria) this;
        }

        public Criteria andIssetheatLessThan(String value) {
            addCriterion("issetheat <", value, "issetheat");
            return (Criteria) this;
        }

        public Criteria andIssetheatLessThanOrEqualTo(String value) {
            addCriterion("issetheat <=", value, "issetheat");
            return (Criteria) this;
        }

        public Criteria andIssetheatLike(String value) {
            addCriterion("issetheat like", value, "issetheat");
            return (Criteria) this;
        }

        public Criteria andIssetheatNotLike(String value) {
            addCriterion("issetheat not like", value, "issetheat");
            return (Criteria) this;
        }

        public Criteria andIssetheatIn(List<String> values) {
            addCriterion("issetheat in", values, "issetheat");
            return (Criteria) this;
        }

        public Criteria andIssetheatNotIn(List<String> values) {
            addCriterion("issetheat not in", values, "issetheat");
            return (Criteria) this;
        }

        public Criteria andIssetheatBetween(String value1, String value2) {
            addCriterion("issetheat between", value1, value2, "issetheat");
            return (Criteria) this;
        }

        public Criteria andIssetheatNotBetween(String value1, String value2) {
            addCriterion("issetheat not between", value1, value2, "issetheat");
            return (Criteria) this;
        }

        public Criteria andIsundergroundIsNull() {
            addCriterion("isunderground is null");
            return (Criteria) this;
        }

        public Criteria andIsundergroundIsNotNull() {
            addCriterion("isunderground is not null");
            return (Criteria) this;
        }

        public Criteria andIsundergroundEqualTo(String value) {
            addCriterion("isunderground =", value, "isunderground");
            return (Criteria) this;
        }

        public Criteria andIsundergroundNotEqualTo(String value) {
            addCriterion("isunderground <>", value, "isunderground");
            return (Criteria) this;
        }

        public Criteria andIsundergroundGreaterThan(String value) {
            addCriterion("isunderground >", value, "isunderground");
            return (Criteria) this;
        }

        public Criteria andIsundergroundGreaterThanOrEqualTo(String value) {
            addCriterion("isunderground >=", value, "isunderground");
            return (Criteria) this;
        }

        public Criteria andIsundergroundLessThan(String value) {
            addCriterion("isunderground <", value, "isunderground");
            return (Criteria) this;
        }

        public Criteria andIsundergroundLessThanOrEqualTo(String value) {
            addCriterion("isunderground <=", value, "isunderground");
            return (Criteria) this;
        }

        public Criteria andIsundergroundLike(String value) {
            addCriterion("isunderground like", value, "isunderground");
            return (Criteria) this;
        }

        public Criteria andIsundergroundNotLike(String value) {
            addCriterion("isunderground not like", value, "isunderground");
            return (Criteria) this;
        }

        public Criteria andIsundergroundIn(List<String> values) {
            addCriterion("isunderground in", values, "isunderground");
            return (Criteria) this;
        }

        public Criteria andIsundergroundNotIn(List<String> values) {
            addCriterion("isunderground not in", values, "isunderground");
            return (Criteria) this;
        }

        public Criteria andIsundergroundBetween(String value1, String value2) {
            addCriterion("isunderground between", value1, value2, "isunderground");
            return (Criteria) this;
        }

        public Criteria andIsundergroundNotBetween(String value1, String value2) {
            addCriterion("isunderground not between", value1, value2, "isunderground");
            return (Criteria) this;
        }

        public Criteria andOuttanktoptypeIsNull() {
            addCriterion("outtanktoptype is null");
            return (Criteria) this;
        }

        public Criteria andOuttanktoptypeIsNotNull() {
            addCriterion("outtanktoptype is not null");
            return (Criteria) this;
        }

        public Criteria andOuttanktoptypeEqualTo(String value) {
            addCriterion("outtanktoptype =", value, "outtanktoptype");
            return (Criteria) this;
        }

        public Criteria andOuttanktoptypeNotEqualTo(String value) {
            addCriterion("outtanktoptype <>", value, "outtanktoptype");
            return (Criteria) this;
        }

        public Criteria andOuttanktoptypeGreaterThan(String value) {
            addCriterion("outtanktoptype >", value, "outtanktoptype");
            return (Criteria) this;
        }

        public Criteria andOuttanktoptypeGreaterThanOrEqualTo(String value) {
            addCriterion("outtanktoptype >=", value, "outtanktoptype");
            return (Criteria) this;
        }

        public Criteria andOuttanktoptypeLessThan(String value) {
            addCriterion("outtanktoptype <", value, "outtanktoptype");
            return (Criteria) this;
        }

        public Criteria andOuttanktoptypeLessThanOrEqualTo(String value) {
            addCriterion("outtanktoptype <=", value, "outtanktoptype");
            return (Criteria) this;
        }

        public Criteria andOuttanktoptypeLike(String value) {
            addCriterion("outtanktoptype like", value, "outtanktoptype");
            return (Criteria) this;
        }

        public Criteria andOuttanktoptypeNotLike(String value) {
            addCriterion("outtanktoptype not like", value, "outtanktoptype");
            return (Criteria) this;
        }

        public Criteria andOuttanktoptypeIn(List<String> values) {
            addCriterion("outtanktoptype in", values, "outtanktoptype");
            return (Criteria) this;
        }

        public Criteria andOuttanktoptypeNotIn(List<String> values) {
            addCriterion("outtanktoptype not in", values, "outtanktoptype");
            return (Criteria) this;
        }

        public Criteria andOuttanktoptypeBetween(String value1, String value2) {
            addCriterion("outtanktoptype between", value1, value2, "outtanktoptype");
            return (Criteria) this;
        }

        public Criteria andOuttanktoptypeNotBetween(String value1, String value2) {
            addCriterion("outtanktoptype not between", value1, value2, "outtanktoptype");
            return (Criteria) this;
        }

        public Criteria andOuttanktopconfigIsNull() {
            addCriterion("outtanktopconfig is null");
            return (Criteria) this;
        }

        public Criteria andOuttanktopconfigIsNotNull() {
            addCriterion("outtanktopconfig is not null");
            return (Criteria) this;
        }

        public Criteria andOuttanktopconfigEqualTo(String value) {
            addCriterion("outtanktopconfig =", value, "outtanktopconfig");
            return (Criteria) this;
        }

        public Criteria andOuttanktopconfigNotEqualTo(String value) {
            addCriterion("outtanktopconfig <>", value, "outtanktopconfig");
            return (Criteria) this;
        }

        public Criteria andOuttanktopconfigGreaterThan(String value) {
            addCriterion("outtanktopconfig >", value, "outtanktopconfig");
            return (Criteria) this;
        }

        public Criteria andOuttanktopconfigGreaterThanOrEqualTo(String value) {
            addCriterion("outtanktopconfig >=", value, "outtanktopconfig");
            return (Criteria) this;
        }

        public Criteria andOuttanktopconfigLessThan(String value) {
            addCriterion("outtanktopconfig <", value, "outtanktopconfig");
            return (Criteria) this;
        }

        public Criteria andOuttanktopconfigLessThanOrEqualTo(String value) {
            addCriterion("outtanktopconfig <=", value, "outtanktopconfig");
            return (Criteria) this;
        }

        public Criteria andOuttanktopconfigLike(String value) {
            addCriterion("outtanktopconfig like", value, "outtanktopconfig");
            return (Criteria) this;
        }

        public Criteria andOuttanktopconfigNotLike(String value) {
            addCriterion("outtanktopconfig not like", value, "outtanktopconfig");
            return (Criteria) this;
        }

        public Criteria andOuttanktopconfigIn(List<String> values) {
            addCriterion("outtanktopconfig in", values, "outtanktopconfig");
            return (Criteria) this;
        }

        public Criteria andOuttanktopconfigNotIn(List<String> values) {
            addCriterion("outtanktopconfig not in", values, "outtanktopconfig");
            return (Criteria) this;
        }

        public Criteria andOuttanktopconfigBetween(String value1, String value2) {
            addCriterion("outtanktopconfig between", value1, value2, "outtanktopconfig");
            return (Criteria) this;
        }

        public Criteria andOuttanktopconfigNotBetween(String value1, String value2) {
            addCriterion("outtanktopconfig not between", value1, value2, "outtanktopconfig");
            return (Criteria) this;
        }

        public Criteria andTankstructureIsNull() {
            addCriterion("tankstructure is null");
            return (Criteria) this;
        }

        public Criteria andTankstructureIsNotNull() {
            addCriterion("tankstructure is not null");
            return (Criteria) this;
        }

        public Criteria andTankstructureEqualTo(String value) {
            addCriterion("tankstructure =", value, "tankstructure");
            return (Criteria) this;
        }

        public Criteria andTankstructureNotEqualTo(String value) {
            addCriterion("tankstructure <>", value, "tankstructure");
            return (Criteria) this;
        }

        public Criteria andTankstructureGreaterThan(String value) {
            addCriterion("tankstructure >", value, "tankstructure");
            return (Criteria) this;
        }

        public Criteria andTankstructureGreaterThanOrEqualTo(String value) {
            addCriterion("tankstructure >=", value, "tankstructure");
            return (Criteria) this;
        }

        public Criteria andTankstructureLessThan(String value) {
            addCriterion("tankstructure <", value, "tankstructure");
            return (Criteria) this;
        }

        public Criteria andTankstructureLessThanOrEqualTo(String value) {
            addCriterion("tankstructure <=", value, "tankstructure");
            return (Criteria) this;
        }

        public Criteria andTankstructureLike(String value) {
            addCriterion("tankstructure like", value, "tankstructure");
            return (Criteria) this;
        }

        public Criteria andTankstructureNotLike(String value) {
            addCriterion("tankstructure not like", value, "tankstructure");
            return (Criteria) this;
        }

        public Criteria andTankstructureIn(List<String> values) {
            addCriterion("tankstructure in", values, "tankstructure");
            return (Criteria) this;
        }

        public Criteria andTankstructureNotIn(List<String> values) {
            addCriterion("tankstructure not in", values, "tankstructure");
            return (Criteria) this;
        }

        public Criteria andTankstructureBetween(String value1, String value2) {
            addCriterion("tankstructure between", value1, value2, "tankstructure");
            return (Criteria) this;
        }

        public Criteria andTankstructureNotBetween(String value1, String value2) {
            addCriterion("tankstructure not between", value1, value2, "tankstructure");
            return (Criteria) this;
        }

        public Criteria andIntanktopcolorIsNull() {
            addCriterion("intanktopcolor is null");
            return (Criteria) this;
        }

        public Criteria andIntanktopcolorIsNotNull() {
            addCriterion("intanktopcolor is not null");
            return (Criteria) this;
        }

        public Criteria andIntanktopcolorEqualTo(String value) {
            addCriterion("intanktopcolor =", value, "intanktopcolor");
            return (Criteria) this;
        }

        public Criteria andIntanktopcolorNotEqualTo(String value) {
            addCriterion("intanktopcolor <>", value, "intanktopcolor");
            return (Criteria) this;
        }

        public Criteria andIntanktopcolorGreaterThan(String value) {
            addCriterion("intanktopcolor >", value, "intanktopcolor");
            return (Criteria) this;
        }

        public Criteria andIntanktopcolorGreaterThanOrEqualTo(String value) {
            addCriterion("intanktopcolor >=", value, "intanktopcolor");
            return (Criteria) this;
        }

        public Criteria andIntanktopcolorLessThan(String value) {
            addCriterion("intanktopcolor <", value, "intanktopcolor");
            return (Criteria) this;
        }

        public Criteria andIntanktopcolorLessThanOrEqualTo(String value) {
            addCriterion("intanktopcolor <=", value, "intanktopcolor");
            return (Criteria) this;
        }

        public Criteria andIntanktopcolorLike(String value) {
            addCriterion("intanktopcolor like", value, "intanktopcolor");
            return (Criteria) this;
        }

        public Criteria andIntanktopcolorNotLike(String value) {
            addCriterion("intanktopcolor not like", value, "intanktopcolor");
            return (Criteria) this;
        }

        public Criteria andIntanktopcolorIn(List<String> values) {
            addCriterion("intanktopcolor in", values, "intanktopcolor");
            return (Criteria) this;
        }

        public Criteria andIntanktopcolorNotIn(List<String> values) {
            addCriterion("intanktopcolor not in", values, "intanktopcolor");
            return (Criteria) this;
        }

        public Criteria andIntanktopcolorBetween(String value1, String value2) {
            addCriterion("intanktopcolor between", value1, value2, "intanktopcolor");
            return (Criteria) this;
        }

        public Criteria andIntanktopcolorNotBetween(String value1, String value2) {
            addCriterion("intanktopcolor not between", value1, value2, "intanktopcolor");
            return (Criteria) this;
        }

        public Criteria andIntanktoppaintstateIsNull() {
            addCriterion("intanktoppaintstate is null");
            return (Criteria) this;
        }

        public Criteria andIntanktoppaintstateIsNotNull() {
            addCriterion("intanktoppaintstate is not null");
            return (Criteria) this;
        }

        public Criteria andIntanktoppaintstateEqualTo(String value) {
            addCriterion("intanktoppaintstate =", value, "intanktoppaintstate");
            return (Criteria) this;
        }

        public Criteria andIntanktoppaintstateNotEqualTo(String value) {
            addCriterion("intanktoppaintstate <>", value, "intanktoppaintstate");
            return (Criteria) this;
        }

        public Criteria andIntanktoppaintstateGreaterThan(String value) {
            addCriterion("intanktoppaintstate >", value, "intanktoppaintstate");
            return (Criteria) this;
        }

        public Criteria andIntanktoppaintstateGreaterThanOrEqualTo(String value) {
            addCriterion("intanktoppaintstate >=", value, "intanktoppaintstate");
            return (Criteria) this;
        }

        public Criteria andIntanktoppaintstateLessThan(String value) {
            addCriterion("intanktoppaintstate <", value, "intanktoppaintstate");
            return (Criteria) this;
        }

        public Criteria andIntanktoppaintstateLessThanOrEqualTo(String value) {
            addCriterion("intanktoppaintstate <=", value, "intanktoppaintstate");
            return (Criteria) this;
        }

        public Criteria andIntanktoppaintstateLike(String value) {
            addCriterion("intanktoppaintstate like", value, "intanktoppaintstate");
            return (Criteria) this;
        }

        public Criteria andIntanktoppaintstateNotLike(String value) {
            addCriterion("intanktoppaintstate not like", value, "intanktoppaintstate");
            return (Criteria) this;
        }

        public Criteria andIntanktoppaintstateIn(List<String> values) {
            addCriterion("intanktoppaintstate in", values, "intanktoppaintstate");
            return (Criteria) this;
        }

        public Criteria andIntanktoppaintstateNotIn(List<String> values) {
            addCriterion("intanktoppaintstate not in", values, "intanktoppaintstate");
            return (Criteria) this;
        }

        public Criteria andIntanktoppaintstateBetween(String value1, String value2) {
            addCriterion("intanktoppaintstate between", value1, value2, "intanktoppaintstate");
            return (Criteria) this;
        }

        public Criteria andIntanktoppaintstateNotBetween(String value1, String value2) {
            addCriterion("intanktoppaintstate not between", value1, value2, "intanktoppaintstate");
            return (Criteria) this;
        }

        public Criteria andInissupportIsNull() {
            addCriterion("inissupport is null");
            return (Criteria) this;
        }

        public Criteria andInissupportIsNotNull() {
            addCriterion("inissupport is not null");
            return (Criteria) this;
        }

        public Criteria andInissupportEqualTo(String value) {
            addCriterion("inissupport =", value, "inissupport");
            return (Criteria) this;
        }

        public Criteria andInissupportNotEqualTo(String value) {
            addCriterion("inissupport <>", value, "inissupport");
            return (Criteria) this;
        }

        public Criteria andInissupportGreaterThan(String value) {
            addCriterion("inissupport >", value, "inissupport");
            return (Criteria) this;
        }

        public Criteria andInissupportGreaterThanOrEqualTo(String value) {
            addCriterion("inissupport >=", value, "inissupport");
            return (Criteria) this;
        }

        public Criteria andInissupportLessThan(String value) {
            addCriterion("inissupport <", value, "inissupport");
            return (Criteria) this;
        }

        public Criteria andInissupportLessThanOrEqualTo(String value) {
            addCriterion("inissupport <=", value, "inissupport");
            return (Criteria) this;
        }

        public Criteria andInissupportLike(String value) {
            addCriterion("inissupport like", value, "inissupport");
            return (Criteria) this;
        }

        public Criteria andInissupportNotLike(String value) {
            addCriterion("inissupport not like", value, "inissupport");
            return (Criteria) this;
        }

        public Criteria andInissupportIn(List<String> values) {
            addCriterion("inissupport in", values, "inissupport");
            return (Criteria) this;
        }

        public Criteria andInissupportNotIn(List<String> values) {
            addCriterion("inissupport not in", values, "inissupport");
            return (Criteria) this;
        }

        public Criteria andInissupportBetween(String value1, String value2) {
            addCriterion("inissupport between", value1, value2, "inissupport");
            return (Criteria) this;
        }

        public Criteria andInissupportNotBetween(String value1, String value2) {
            addCriterion("inissupport not between", value1, value2, "inissupport");
            return (Criteria) this;
        }

        public Criteria andInsupportnumIsNull() {
            addCriterion("insupportnum is null");
            return (Criteria) this;
        }

        public Criteria andInsupportnumIsNotNull() {
            addCriterion("insupportnum is not null");
            return (Criteria) this;
        }

        public Criteria andInsupportnumEqualTo(Integer value) {
            addCriterion("insupportnum =", value, "insupportnum");
            return (Criteria) this;
        }

        public Criteria andInsupportnumNotEqualTo(Integer value) {
            addCriterion("insupportnum <>", value, "insupportnum");
            return (Criteria) this;
        }

        public Criteria andInsupportnumGreaterThan(Integer value) {
            addCriterion("insupportnum >", value, "insupportnum");
            return (Criteria) this;
        }

        public Criteria andInsupportnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("insupportnum >=", value, "insupportnum");
            return (Criteria) this;
        }

        public Criteria andInsupportnumLessThan(Integer value) {
            addCriterion("insupportnum <", value, "insupportnum");
            return (Criteria) this;
        }

        public Criteria andInsupportnumLessThanOrEqualTo(Integer value) {
            addCriterion("insupportnum <=", value, "insupportnum");
            return (Criteria) this;
        }

        public Criteria andInsupportnumIn(List<Integer> values) {
            addCriterion("insupportnum in", values, "insupportnum");
            return (Criteria) this;
        }

        public Criteria andInsupportnumNotIn(List<Integer> values) {
            addCriterion("insupportnum not in", values, "insupportnum");
            return (Criteria) this;
        }

        public Criteria andInsupportnumBetween(Integer value1, Integer value2) {
            addCriterion("insupportnum between", value1, value2, "insupportnum");
            return (Criteria) this;
        }

        public Criteria andInsupportnumNotBetween(Integer value1, Integer value2) {
            addCriterion("insupportnum not between", value1, value2, "insupportnum");
            return (Criteria) this;
        }

        public Criteria andInsupportradiusIsNull() {
            addCriterion("insupportradius is null");
            return (Criteria) this;
        }

        public Criteria andInsupportradiusIsNotNull() {
            addCriterion("insupportradius is not null");
            return (Criteria) this;
        }

        public Criteria andInsupportradiusEqualTo(Double value) {
            addCriterion("insupportradius =", value, "insupportradius");
            return (Criteria) this;
        }

        public Criteria andInsupportradiusNotEqualTo(Double value) {
            addCriterion("insupportradius <>", value, "insupportradius");
            return (Criteria) this;
        }

        public Criteria andInsupportradiusGreaterThan(Double value) {
            addCriterion("insupportradius >", value, "insupportradius");
            return (Criteria) this;
        }

        public Criteria andInsupportradiusGreaterThanOrEqualTo(Double value) {
            addCriterion("insupportradius >=", value, "insupportradius");
            return (Criteria) this;
        }

        public Criteria andInsupportradiusLessThan(Double value) {
            addCriterion("insupportradius <", value, "insupportradius");
            return (Criteria) this;
        }

        public Criteria andInsupportradiusLessThanOrEqualTo(Double value) {
            addCriterion("insupportradius <=", value, "insupportradius");
            return (Criteria) this;
        }

        public Criteria andInsupportradiusIn(List<Double> values) {
            addCriterion("insupportradius in", values, "insupportradius");
            return (Criteria) this;
        }

        public Criteria andInsupportradiusNotIn(List<Double> values) {
            addCriterion("insupportradius not in", values, "insupportradius");
            return (Criteria) this;
        }

        public Criteria andInsupportradiusBetween(Double value1, Double value2) {
            addCriterion("insupportradius between", value1, value2, "insupportradius");
            return (Criteria) this;
        }

        public Criteria andInsupportradiusNotBetween(Double value1, Double value2) {
            addCriterion("insupportradius not between", value1, value2, "insupportradius");
            return (Criteria) this;
        }

        public Criteria andInfloatconnectIsNull() {
            addCriterion("infloatconnect is null");
            return (Criteria) this;
        }

        public Criteria andInfloatconnectIsNotNull() {
            addCriterion("infloatconnect is not null");
            return (Criteria) this;
        }

        public Criteria andInfloatconnectEqualTo(String value) {
            addCriterion("infloatconnect =", value, "infloatconnect");
            return (Criteria) this;
        }

        public Criteria andInfloatconnectNotEqualTo(String value) {
            addCriterion("infloatconnect <>", value, "infloatconnect");
            return (Criteria) this;
        }

        public Criteria andInfloatconnectGreaterThan(String value) {
            addCriterion("infloatconnect >", value, "infloatconnect");
            return (Criteria) this;
        }

        public Criteria andInfloatconnectGreaterThanOrEqualTo(String value) {
            addCriterion("infloatconnect >=", value, "infloatconnect");
            return (Criteria) this;
        }

        public Criteria andInfloatconnectLessThan(String value) {
            addCriterion("infloatconnect <", value, "infloatconnect");
            return (Criteria) this;
        }

        public Criteria andInfloatconnectLessThanOrEqualTo(String value) {
            addCriterion("infloatconnect <=", value, "infloatconnect");
            return (Criteria) this;
        }

        public Criteria andInfloatconnectLike(String value) {
            addCriterion("infloatconnect like", value, "infloatconnect");
            return (Criteria) this;
        }

        public Criteria andInfloatconnectNotLike(String value) {
            addCriterion("infloatconnect not like", value, "infloatconnect");
            return (Criteria) this;
        }

        public Criteria andInfloatconnectIn(List<String> values) {
            addCriterion("infloatconnect in", values, "infloatconnect");
            return (Criteria) this;
        }

        public Criteria andInfloatconnectNotIn(List<String> values) {
            addCriterion("infloatconnect not in", values, "infloatconnect");
            return (Criteria) this;
        }

        public Criteria andInfloatconnectBetween(String value1, String value2) {
            addCriterion("infloatconnect between", value1, value2, "infloatconnect");
            return (Criteria) this;
        }

        public Criteria andInfloatconnectNotBetween(String value1, String value2) {
            addCriterion("infloatconnect not between", value1, value2, "infloatconnect");
            return (Criteria) this;
        }

        public Criteria andInweldtypeIsNull() {
            addCriterion("inweldtype is null");
            return (Criteria) this;
        }

        public Criteria andInweldtypeIsNotNull() {
            addCriterion("inweldtype is not null");
            return (Criteria) this;
        }

        public Criteria andInweldtypeEqualTo(String value) {
            addCriterion("inweldtype =", value, "inweldtype");
            return (Criteria) this;
        }

        public Criteria andInweldtypeNotEqualTo(String value) {
            addCriterion("inweldtype <>", value, "inweldtype");
            return (Criteria) this;
        }

        public Criteria andInweldtypeGreaterThan(String value) {
            addCriterion("inweldtype >", value, "inweldtype");
            return (Criteria) this;
        }

        public Criteria andInweldtypeGreaterThanOrEqualTo(String value) {
            addCriterion("inweldtype >=", value, "inweldtype");
            return (Criteria) this;
        }

        public Criteria andInweldtypeLessThan(String value) {
            addCriterion("inweldtype <", value, "inweldtype");
            return (Criteria) this;
        }

        public Criteria andInweldtypeLessThanOrEqualTo(String value) {
            addCriterion("inweldtype <=", value, "inweldtype");
            return (Criteria) this;
        }

        public Criteria andInweldtypeLike(String value) {
            addCriterion("inweldtype like", value, "inweldtype");
            return (Criteria) this;
        }

        public Criteria andInweldtypeNotLike(String value) {
            addCriterion("inweldtype not like", value, "inweldtype");
            return (Criteria) this;
        }

        public Criteria andInweldtypeIn(List<String> values) {
            addCriterion("inweldtype in", values, "inweldtype");
            return (Criteria) this;
        }

        public Criteria andInweldtypeNotIn(List<String> values) {
            addCriterion("inweldtype not in", values, "inweldtype");
            return (Criteria) this;
        }

        public Criteria andInweldtypeBetween(String value1, String value2) {
            addCriterion("inweldtype between", value1, value2, "inweldtype");
            return (Criteria) this;
        }

        public Criteria andInweldtypeNotBetween(String value1, String value2) {
            addCriterion("inweldtype not between", value1, value2, "inweldtype");
            return (Criteria) this;
        }

        public Criteria andInfloatpantypeIsNull() {
            addCriterion("infloatpantype is null");
            return (Criteria) this;
        }

        public Criteria andInfloatpantypeIsNotNull() {
            addCriterion("infloatpantype is not null");
            return (Criteria) this;
        }

        public Criteria andInfloatpantypeEqualTo(String value) {
            addCriterion("infloatpantype =", value, "infloatpantype");
            return (Criteria) this;
        }

        public Criteria andInfloatpantypeNotEqualTo(String value) {
            addCriterion("infloatpantype <>", value, "infloatpantype");
            return (Criteria) this;
        }

        public Criteria andInfloatpantypeGreaterThan(String value) {
            addCriterion("infloatpantype >", value, "infloatpantype");
            return (Criteria) this;
        }

        public Criteria andInfloatpantypeGreaterThanOrEqualTo(String value) {
            addCriterion("infloatpantype >=", value, "infloatpantype");
            return (Criteria) this;
        }

        public Criteria andInfloatpantypeLessThan(String value) {
            addCriterion("infloatpantype <", value, "infloatpantype");
            return (Criteria) this;
        }

        public Criteria andInfloatpantypeLessThanOrEqualTo(String value) {
            addCriterion("infloatpantype <=", value, "infloatpantype");
            return (Criteria) this;
        }

        public Criteria andInfloatpantypeLike(String value) {
            addCriterion("infloatpantype like", value, "infloatpantype");
            return (Criteria) this;
        }

        public Criteria andInfloatpantypeNotLike(String value) {
            addCriterion("infloatpantype not like", value, "infloatpantype");
            return (Criteria) this;
        }

        public Criteria andInfloatpantypeIn(List<String> values) {
            addCriterion("infloatpantype in", values, "infloatpantype");
            return (Criteria) this;
        }

        public Criteria andInfloatpantypeNotIn(List<String> values) {
            addCriterion("infloatpantype not in", values, "infloatpantype");
            return (Criteria) this;
        }

        public Criteria andInfloatpantypeBetween(String value1, String value2) {
            addCriterion("infloatpantype between", value1, value2, "infloatpantype");
            return (Criteria) this;
        }

        public Criteria andInfloatpantypeNotBetween(String value1, String value2) {
            addCriterion("infloatpantype not between", value1, value2, "infloatpantype");
            return (Criteria) this;
        }

        public Criteria andInstructuretypeIsNull() {
            addCriterion("instructuretype is null");
            return (Criteria) this;
        }

        public Criteria andInstructuretypeIsNotNull() {
            addCriterion("instructuretype is not null");
            return (Criteria) this;
        }

        public Criteria andInstructuretypeEqualTo(String value) {
            addCriterion("instructuretype =", value, "instructuretype");
            return (Criteria) this;
        }

        public Criteria andInstructuretypeNotEqualTo(String value) {
            addCriterion("instructuretype <>", value, "instructuretype");
            return (Criteria) this;
        }

        public Criteria andInstructuretypeGreaterThan(String value) {
            addCriterion("instructuretype >", value, "instructuretype");
            return (Criteria) this;
        }

        public Criteria andInstructuretypeGreaterThanOrEqualTo(String value) {
            addCriterion("instructuretype >=", value, "instructuretype");
            return (Criteria) this;
        }

        public Criteria andInstructuretypeLessThan(String value) {
            addCriterion("instructuretype <", value, "instructuretype");
            return (Criteria) this;
        }

        public Criteria andInstructuretypeLessThanOrEqualTo(String value) {
            addCriterion("instructuretype <=", value, "instructuretype");
            return (Criteria) this;
        }

        public Criteria andInstructuretypeLike(String value) {
            addCriterion("instructuretype like", value, "instructuretype");
            return (Criteria) this;
        }

        public Criteria andInstructuretypeNotLike(String value) {
            addCriterion("instructuretype not like", value, "instructuretype");
            return (Criteria) this;
        }

        public Criteria andInstructuretypeIn(List<String> values) {
            addCriterion("instructuretype in", values, "instructuretype");
            return (Criteria) this;
        }

        public Criteria andInstructuretypeNotIn(List<String> values) {
            addCriterion("instructuretype not in", values, "instructuretype");
            return (Criteria) this;
        }

        public Criteria andInstructuretypeBetween(String value1, String value2) {
            addCriterion("instructuretype between", value1, value2, "instructuretype");
            return (Criteria) this;
        }

        public Criteria andInstructuretypeNotBetween(String value1, String value2) {
            addCriterion("instructuretype not between", value1, value2, "instructuretype");
            return (Criteria) this;
        }

        public Criteria andInconnectwidthIsNull() {
            addCriterion("inconnectwidth is null");
            return (Criteria) this;
        }

        public Criteria andInconnectwidthIsNotNull() {
            addCriterion("inconnectwidth is not null");
            return (Criteria) this;
        }

        public Criteria andInconnectwidthEqualTo(Double value) {
            addCriterion("inconnectwidth =", value, "inconnectwidth");
            return (Criteria) this;
        }

        public Criteria andInconnectwidthNotEqualTo(Double value) {
            addCriterion("inconnectwidth <>", value, "inconnectwidth");
            return (Criteria) this;
        }

        public Criteria andInconnectwidthGreaterThan(Double value) {
            addCriterion("inconnectwidth >", value, "inconnectwidth");
            return (Criteria) this;
        }

        public Criteria andInconnectwidthGreaterThanOrEqualTo(Double value) {
            addCriterion("inconnectwidth >=", value, "inconnectwidth");
            return (Criteria) this;
        }

        public Criteria andInconnectwidthLessThan(Double value) {
            addCriterion("inconnectwidth <", value, "inconnectwidth");
            return (Criteria) this;
        }

        public Criteria andInconnectwidthLessThanOrEqualTo(Double value) {
            addCriterion("inconnectwidth <=", value, "inconnectwidth");
            return (Criteria) this;
        }

        public Criteria andInconnectwidthIn(List<Double> values) {
            addCriterion("inconnectwidth in", values, "inconnectwidth");
            return (Criteria) this;
        }

        public Criteria andInconnectwidthNotIn(List<Double> values) {
            addCriterion("inconnectwidth not in", values, "inconnectwidth");
            return (Criteria) this;
        }

        public Criteria andInconnectwidthBetween(Double value1, Double value2) {
            addCriterion("inconnectwidth between", value1, value2, "inconnectwidth");
            return (Criteria) this;
        }

        public Criteria andInconnectwidthNotBetween(Double value1, Double value2) {
            addCriterion("inconnectwidth not between", value1, value2, "inconnectwidth");
            return (Criteria) this;
        }

        public Criteria andInplatesizeIsNull() {
            addCriterion("inplatesize is null");
            return (Criteria) this;
        }

        public Criteria andInplatesizeIsNotNull() {
            addCriterion("inplatesize is not null");
            return (Criteria) this;
        }

        public Criteria andInplatesizeEqualTo(String value) {
            addCriterion("inplatesize =", value, "inplatesize");
            return (Criteria) this;
        }

        public Criteria andInplatesizeNotEqualTo(String value) {
            addCriterion("inplatesize <>", value, "inplatesize");
            return (Criteria) this;
        }

        public Criteria andInplatesizeGreaterThan(String value) {
            addCriterion("inplatesize >", value, "inplatesize");
            return (Criteria) this;
        }

        public Criteria andInplatesizeGreaterThanOrEqualTo(String value) {
            addCriterion("inplatesize >=", value, "inplatesize");
            return (Criteria) this;
        }

        public Criteria andInplatesizeLessThan(String value) {
            addCriterion("inplatesize <", value, "inplatesize");
            return (Criteria) this;
        }

        public Criteria andInplatesizeLessThanOrEqualTo(String value) {
            addCriterion("inplatesize <=", value, "inplatesize");
            return (Criteria) this;
        }

        public Criteria andInplatesizeLike(String value) {
            addCriterion("inplatesize like", value, "inplatesize");
            return (Criteria) this;
        }

        public Criteria andInplatesizeNotLike(String value) {
            addCriterion("inplatesize not like", value, "inplatesize");
            return (Criteria) this;
        }

        public Criteria andInplatesizeIn(List<String> values) {
            addCriterion("inplatesize in", values, "inplatesize");
            return (Criteria) this;
        }

        public Criteria andInplatesizeNotIn(List<String> values) {
            addCriterion("inplatesize not in", values, "inplatesize");
            return (Criteria) this;
        }

        public Criteria andInplatesizeBetween(String value1, String value2) {
            addCriterion("inplatesize between", value1, value2, "inplatesize");
            return (Criteria) this;
        }

        public Criteria andInplatesizeNotBetween(String value1, String value2) {
            addCriterion("inplatesize not between", value1, value2, "inplatesize");
            return (Criteria) this;
        }

        public Criteria andOutinfirstsealIsNull() {
            addCriterion("outinfirstseal is null");
            return (Criteria) this;
        }

        public Criteria andOutinfirstsealIsNotNull() {
            addCriterion("outinfirstseal is not null");
            return (Criteria) this;
        }

        public Criteria andOutinfirstsealEqualTo(String value) {
            addCriterion("outinfirstseal =", value, "outinfirstseal");
            return (Criteria) this;
        }

        public Criteria andOutinfirstsealNotEqualTo(String value) {
            addCriterion("outinfirstseal <>", value, "outinfirstseal");
            return (Criteria) this;
        }

        public Criteria andOutinfirstsealGreaterThan(String value) {
            addCriterion("outinfirstseal >", value, "outinfirstseal");
            return (Criteria) this;
        }

        public Criteria andOutinfirstsealGreaterThanOrEqualTo(String value) {
            addCriterion("outinfirstseal >=", value, "outinfirstseal");
            return (Criteria) this;
        }

        public Criteria andOutinfirstsealLessThan(String value) {
            addCriterion("outinfirstseal <", value, "outinfirstseal");
            return (Criteria) this;
        }

        public Criteria andOutinfirstsealLessThanOrEqualTo(String value) {
            addCriterion("outinfirstseal <=", value, "outinfirstseal");
            return (Criteria) this;
        }

        public Criteria andOutinfirstsealLike(String value) {
            addCriterion("outinfirstseal like", value, "outinfirstseal");
            return (Criteria) this;
        }

        public Criteria andOutinfirstsealNotLike(String value) {
            addCriterion("outinfirstseal not like", value, "outinfirstseal");
            return (Criteria) this;
        }

        public Criteria andOutinfirstsealIn(List<String> values) {
            addCriterion("outinfirstseal in", values, "outinfirstseal");
            return (Criteria) this;
        }

        public Criteria andOutinfirstsealNotIn(List<String> values) {
            addCriterion("outinfirstseal not in", values, "outinfirstseal");
            return (Criteria) this;
        }

        public Criteria andOutinfirstsealBetween(String value1, String value2) {
            addCriterion("outinfirstseal between", value1, value2, "outinfirstseal");
            return (Criteria) this;
        }

        public Criteria andOutinfirstsealNotBetween(String value1, String value2) {
            addCriterion("outinfirstseal not between", value1, value2, "outinfirstseal");
            return (Criteria) this;
        }

        public Criteria andOutinsecondsealIsNull() {
            addCriterion("outinsecondseal is null");
            return (Criteria) this;
        }

        public Criteria andOutinsecondsealIsNotNull() {
            addCriterion("outinsecondseal is not null");
            return (Criteria) this;
        }

        public Criteria andOutinsecondsealEqualTo(String value) {
            addCriterion("outinsecondseal =", value, "outinsecondseal");
            return (Criteria) this;
        }

        public Criteria andOutinsecondsealNotEqualTo(String value) {
            addCriterion("outinsecondseal <>", value, "outinsecondseal");
            return (Criteria) this;
        }

        public Criteria andOutinsecondsealGreaterThan(String value) {
            addCriterion("outinsecondseal >", value, "outinsecondseal");
            return (Criteria) this;
        }

        public Criteria andOutinsecondsealGreaterThanOrEqualTo(String value) {
            addCriterion("outinsecondseal >=", value, "outinsecondseal");
            return (Criteria) this;
        }

        public Criteria andOutinsecondsealLessThan(String value) {
            addCriterion("outinsecondseal <", value, "outinsecondseal");
            return (Criteria) this;
        }

        public Criteria andOutinsecondsealLessThanOrEqualTo(String value) {
            addCriterion("outinsecondseal <=", value, "outinsecondseal");
            return (Criteria) this;
        }

        public Criteria andOutinsecondsealLike(String value) {
            addCriterion("outinsecondseal like", value, "outinsecondseal");
            return (Criteria) this;
        }

        public Criteria andOutinsecondsealNotLike(String value) {
            addCriterion("outinsecondseal not like", value, "outinsecondseal");
            return (Criteria) this;
        }

        public Criteria andOutinsecondsealIn(List<String> values) {
            addCriterion("outinsecondseal in", values, "outinsecondseal");
            return (Criteria) this;
        }

        public Criteria andOutinsecondsealNotIn(List<String> values) {
            addCriterion("outinsecondseal not in", values, "outinsecondseal");
            return (Criteria) this;
        }

        public Criteria andOutinsecondsealBetween(String value1, String value2) {
            addCriterion("outinsecondseal between", value1, value2, "outinsecondseal");
            return (Criteria) this;
        }

        public Criteria andOutinsecondsealNotBetween(String value1, String value2) {
            addCriterion("outinsecondseal not between", value1, value2, "outinsecondseal");
            return (Criteria) this;
        }

        public Criteria andSolutiontypeIsNull() {
            addCriterion("solutiontype is null");
            return (Criteria) this;
        }

        public Criteria andSolutiontypeIsNotNull() {
            addCriterion("solutiontype is not null");
            return (Criteria) this;
        }

        public Criteria andSolutiontypeEqualTo(String value) {
            addCriterion("solutiontype =", value, "solutiontype");
            return (Criteria) this;
        }

        public Criteria andSolutiontypeNotEqualTo(String value) {
            addCriterion("solutiontype <>", value, "solutiontype");
            return (Criteria) this;
        }

        public Criteria andSolutiontypeGreaterThan(String value) {
            addCriterion("solutiontype >", value, "solutiontype");
            return (Criteria) this;
        }

        public Criteria andSolutiontypeGreaterThanOrEqualTo(String value) {
            addCriterion("solutiontype >=", value, "solutiontype");
            return (Criteria) this;
        }

        public Criteria andSolutiontypeLessThan(String value) {
            addCriterion("solutiontype <", value, "solutiontype");
            return (Criteria) this;
        }

        public Criteria andSolutiontypeLessThanOrEqualTo(String value) {
            addCriterion("solutiontype <=", value, "solutiontype");
            return (Criteria) this;
        }

        public Criteria andSolutiontypeLike(String value) {
            addCriterion("solutiontype like", value, "solutiontype");
            return (Criteria) this;
        }

        public Criteria andSolutiontypeNotLike(String value) {
            addCriterion("solutiontype not like", value, "solutiontype");
            return (Criteria) this;
        }

        public Criteria andSolutiontypeIn(List<String> values) {
            addCriterion("solutiontype in", values, "solutiontype");
            return (Criteria) this;
        }

        public Criteria andSolutiontypeNotIn(List<String> values) {
            addCriterion("solutiontype not in", values, "solutiontype");
            return (Criteria) this;
        }

        public Criteria andSolutiontypeBetween(String value1, String value2) {
            addCriterion("solutiontype between", value1, value2, "solutiontype");
            return (Criteria) this;
        }

        public Criteria andSolutiontypeNotBetween(String value1, String value2) {
            addCriterion("solutiontype not between", value1, value2, "solutiontype");
            return (Criteria) this;
        }

        public Criteria andSolutionnameIsNull() {
            addCriterion("solutionname is null");
            return (Criteria) this;
        }

        public Criteria andSolutionnameIsNotNull() {
            addCriterion("solutionname is not null");
            return (Criteria) this;
        }

        public Criteria andSolutionnameEqualTo(String value) {
            addCriterion("solutionname =", value, "solutionname");
            return (Criteria) this;
        }

        public Criteria andSolutionnameNotEqualTo(String value) {
            addCriterion("solutionname <>", value, "solutionname");
            return (Criteria) this;
        }

        public Criteria andSolutionnameGreaterThan(String value) {
            addCriterion("solutionname >", value, "solutionname");
            return (Criteria) this;
        }

        public Criteria andSolutionnameGreaterThanOrEqualTo(String value) {
            addCriterion("solutionname >=", value, "solutionname");
            return (Criteria) this;
        }

        public Criteria andSolutionnameLessThan(String value) {
            addCriterion("solutionname <", value, "solutionname");
            return (Criteria) this;
        }

        public Criteria andSolutionnameLessThanOrEqualTo(String value) {
            addCriterion("solutionname <=", value, "solutionname");
            return (Criteria) this;
        }

        public Criteria andSolutionnameLike(String value) {
            addCriterion("solutionname like", value, "solutionname");
            return (Criteria) this;
        }

        public Criteria andSolutionnameNotLike(String value) {
            addCriterion("solutionname not like", value, "solutionname");
            return (Criteria) this;
        }

        public Criteria andSolutionnameIn(List<String> values) {
            addCriterion("solutionname in", values, "solutionname");
            return (Criteria) this;
        }

        public Criteria andSolutionnameNotIn(List<String> values) {
            addCriterion("solutionname not in", values, "solutionname");
            return (Criteria) this;
        }

        public Criteria andSolutionnameBetween(String value1, String value2) {
            addCriterion("solutionname between", value1, value2, "solutionname");
            return (Criteria) this;
        }

        public Criteria andSolutionnameNotBetween(String value1, String value2) {
            addCriterion("solutionname not between", value1, value2, "solutionname");
            return (Criteria) this;
        }

        public Criteria andSolutionversionIsNull() {
            addCriterion("solutionversion is null");
            return (Criteria) this;
        }

        public Criteria andSolutionversionIsNotNull() {
            addCriterion("solutionversion is not null");
            return (Criteria) this;
        }

        public Criteria andSolutionversionEqualTo(String value) {
            addCriterion("solutionversion =", value, "solutionversion");
            return (Criteria) this;
        }

        public Criteria andSolutionversionNotEqualTo(String value) {
            addCriterion("solutionversion <>", value, "solutionversion");
            return (Criteria) this;
        }

        public Criteria andSolutionversionGreaterThan(String value) {
            addCriterion("solutionversion >", value, "solutionversion");
            return (Criteria) this;
        }

        public Criteria andSolutionversionGreaterThanOrEqualTo(String value) {
            addCriterion("solutionversion >=", value, "solutionversion");
            return (Criteria) this;
        }

        public Criteria andSolutionversionLessThan(String value) {
            addCriterion("solutionversion <", value, "solutionversion");
            return (Criteria) this;
        }

        public Criteria andSolutionversionLessThanOrEqualTo(String value) {
            addCriterion("solutionversion <=", value, "solutionversion");
            return (Criteria) this;
        }

        public Criteria andSolutionversionLike(String value) {
            addCriterion("solutionversion like", value, "solutionversion");
            return (Criteria) this;
        }

        public Criteria andSolutionversionNotLike(String value) {
            addCriterion("solutionversion not like", value, "solutionversion");
            return (Criteria) this;
        }

        public Criteria andSolutionversionIn(List<String> values) {
            addCriterion("solutionversion in", values, "solutionversion");
            return (Criteria) this;
        }

        public Criteria andSolutionversionNotIn(List<String> values) {
            addCriterion("solutionversion not in", values, "solutionversion");
            return (Criteria) this;
        }

        public Criteria andSolutionversionBetween(String value1, String value2) {
            addCriterion("solutionversion between", value1, value2, "solutionversion");
            return (Criteria) this;
        }

        public Criteria andSolutionversionNotBetween(String value1, String value2) {
            addCriterion("solutionversion not between", value1, value2, "solutionversion");
            return (Criteria) this;
        }

        public Criteria andSolutioncompositionIsNull() {
            addCriterion("solutioncomposition is null");
            return (Criteria) this;
        }

        public Criteria andSolutioncompositionIsNotNull() {
            addCriterion("solutioncomposition is not null");
            return (Criteria) this;
        }

        public Criteria andSolutioncompositionEqualTo(String value) {
            addCriterion("solutioncomposition =", value, "solutioncomposition");
            return (Criteria) this;
        }

        public Criteria andSolutioncompositionNotEqualTo(String value) {
            addCriterion("solutioncomposition <>", value, "solutioncomposition");
            return (Criteria) this;
        }

        public Criteria andSolutioncompositionGreaterThan(String value) {
            addCriterion("solutioncomposition >", value, "solutioncomposition");
            return (Criteria) this;
        }

        public Criteria andSolutioncompositionGreaterThanOrEqualTo(String value) {
            addCriterion("solutioncomposition >=", value, "solutioncomposition");
            return (Criteria) this;
        }

        public Criteria andSolutioncompositionLessThan(String value) {
            addCriterion("solutioncomposition <", value, "solutioncomposition");
            return (Criteria) this;
        }

        public Criteria andSolutioncompositionLessThanOrEqualTo(String value) {
            addCriterion("solutioncomposition <=", value, "solutioncomposition");
            return (Criteria) this;
        }

        public Criteria andSolutioncompositionLike(String value) {
            addCriterion("solutioncomposition like", value, "solutioncomposition");
            return (Criteria) this;
        }

        public Criteria andSolutioncompositionNotLike(String value) {
            addCriterion("solutioncomposition not like", value, "solutioncomposition");
            return (Criteria) this;
        }

        public Criteria andSolutioncompositionIn(List<String> values) {
            addCriterion("solutioncomposition in", values, "solutioncomposition");
            return (Criteria) this;
        }

        public Criteria andSolutioncompositionNotIn(List<String> values) {
            addCriterion("solutioncomposition not in", values, "solutioncomposition");
            return (Criteria) this;
        }

        public Criteria andSolutioncompositionBetween(String value1, String value2) {
            addCriterion("solutioncomposition between", value1, value2, "solutioncomposition");
            return (Criteria) this;
        }

        public Criteria andSolutioncompositionNotBetween(String value1, String value2) {
            addCriterion("solutioncomposition not between", value1, value2, "solutioncomposition");
            return (Criteria) this;
        }

        public Criteria andSolutionfractionIsNull() {
            addCriterion("solutionfraction is null");
            return (Criteria) this;
        }

        public Criteria andSolutionfractionIsNotNull() {
            addCriterion("solutionfraction is not null");
            return (Criteria) this;
        }

        public Criteria andSolutionfractionEqualTo(String value) {
            addCriterion("solutionfraction =", value, "solutionfraction");
            return (Criteria) this;
        }

        public Criteria andSolutionfractionNotEqualTo(String value) {
            addCriterion("solutionfraction <>", value, "solutionfraction");
            return (Criteria) this;
        }

        public Criteria andSolutionfractionGreaterThan(String value) {
            addCriterion("solutionfraction >", value, "solutionfraction");
            return (Criteria) this;
        }

        public Criteria andSolutionfractionGreaterThanOrEqualTo(String value) {
            addCriterion("solutionfraction >=", value, "solutionfraction");
            return (Criteria) this;
        }

        public Criteria andSolutionfractionLessThan(String value) {
            addCriterion("solutionfraction <", value, "solutionfraction");
            return (Criteria) this;
        }

        public Criteria andSolutionfractionLessThanOrEqualTo(String value) {
            addCriterion("solutionfraction <=", value, "solutionfraction");
            return (Criteria) this;
        }

        public Criteria andSolutionfractionLike(String value) {
            addCriterion("solutionfraction like", value, "solutionfraction");
            return (Criteria) this;
        }

        public Criteria andSolutionfractionNotLike(String value) {
            addCriterion("solutionfraction not like", value, "solutionfraction");
            return (Criteria) this;
        }

        public Criteria andSolutionfractionIn(List<String> values) {
            addCriterion("solutionfraction in", values, "solutionfraction");
            return (Criteria) this;
        }

        public Criteria andSolutionfractionNotIn(List<String> values) {
            addCriterion("solutionfraction not in", values, "solutionfraction");
            return (Criteria) this;
        }

        public Criteria andSolutionfractionBetween(String value1, String value2) {
            addCriterion("solutionfraction between", value1, value2, "solutionfraction");
            return (Criteria) this;
        }

        public Criteria andSolutionfractionNotBetween(String value1, String value2) {
            addCriterion("solutionfraction not between", value1, value2, "solutionfraction");
            return (Criteria) this;
        }

        public Criteria andStreampressureIsNull() {
            addCriterion("streampressure is null");
            return (Criteria) this;
        }

        public Criteria andStreampressureIsNotNull() {
            addCriterion("streampressure is not null");
            return (Criteria) this;
        }

        public Criteria andStreampressureEqualTo(Double value) {
            addCriterion("streampressure =", value, "streampressure");
            return (Criteria) this;
        }

        public Criteria andStreampressureNotEqualTo(Double value) {
            addCriterion("streampressure <>", value, "streampressure");
            return (Criteria) this;
        }

        public Criteria andStreampressureGreaterThan(Double value) {
            addCriterion("streampressure >", value, "streampressure");
            return (Criteria) this;
        }

        public Criteria andStreampressureGreaterThanOrEqualTo(Double value) {
            addCriterion("streampressure >=", value, "streampressure");
            return (Criteria) this;
        }

        public Criteria andStreampressureLessThan(Double value) {
            addCriterion("streampressure <", value, "streampressure");
            return (Criteria) this;
        }

        public Criteria andStreampressureLessThanOrEqualTo(Double value) {
            addCriterion("streampressure <=", value, "streampressure");
            return (Criteria) this;
        }

        public Criteria andStreampressureIn(List<Double> values) {
            addCriterion("streampressure in", values, "streampressure");
            return (Criteria) this;
        }

        public Criteria andStreampressureNotIn(List<Double> values) {
            addCriterion("streampressure not in", values, "streampressure");
            return (Criteria) this;
        }

        public Criteria andStreampressureBetween(Double value1, Double value2) {
            addCriterion("streampressure between", value1, value2, "streampressure");
            return (Criteria) this;
        }

        public Criteria andStreampressureNotBetween(Double value1, Double value2) {
            addCriterion("streampressure not between", value1, value2, "streampressure");
            return (Criteria) this;
        }

        public Criteria andStreamfractionIsNull() {
            addCriterion("streamfraction is null");
            return (Criteria) this;
        }

        public Criteria andStreamfractionIsNotNull() {
            addCriterion("streamfraction is not null");
            return (Criteria) this;
        }

        public Criteria andStreamfractionEqualTo(Double value) {
            addCriterion("streamfraction =", value, "streamfraction");
            return (Criteria) this;
        }

        public Criteria andStreamfractionNotEqualTo(Double value) {
            addCriterion("streamfraction <>", value, "streamfraction");
            return (Criteria) this;
        }

        public Criteria andStreamfractionGreaterThan(Double value) {
            addCriterion("streamfraction >", value, "streamfraction");
            return (Criteria) this;
        }

        public Criteria andStreamfractionGreaterThanOrEqualTo(Double value) {
            addCriterion("streamfraction >=", value, "streamfraction");
            return (Criteria) this;
        }

        public Criteria andStreamfractionLessThan(Double value) {
            addCriterion("streamfraction <", value, "streamfraction");
            return (Criteria) this;
        }

        public Criteria andStreamfractionLessThanOrEqualTo(Double value) {
            addCriterion("streamfraction <=", value, "streamfraction");
            return (Criteria) this;
        }

        public Criteria andStreamfractionIn(List<Double> values) {
            addCriterion("streamfraction in", values, "streamfraction");
            return (Criteria) this;
        }

        public Criteria andStreamfractionNotIn(List<Double> values) {
            addCriterion("streamfraction not in", values, "streamfraction");
            return (Criteria) this;
        }

        public Criteria andStreamfractionBetween(Double value1, Double value2) {
            addCriterion("streamfraction between", value1, value2, "streamfraction");
            return (Criteria) this;
        }

        public Criteria andStreamfractionNotBetween(Double value1, Double value2) {
            addCriterion("streamfraction not between", value1, value2, "streamfraction");
            return (Criteria) this;
        }

        public Criteria andLiquidfractionIsNull() {
            addCriterion("liquidfraction is null");
            return (Criteria) this;
        }

        public Criteria andLiquidfractionIsNotNull() {
            addCriterion("liquidfraction is not null");
            return (Criteria) this;
        }

        public Criteria andLiquidfractionEqualTo(Double value) {
            addCriterion("liquidfraction =", value, "liquidfraction");
            return (Criteria) this;
        }

        public Criteria andLiquidfractionNotEqualTo(Double value) {
            addCriterion("liquidfraction <>", value, "liquidfraction");
            return (Criteria) this;
        }

        public Criteria andLiquidfractionGreaterThan(Double value) {
            addCriterion("liquidfraction >", value, "liquidfraction");
            return (Criteria) this;
        }

        public Criteria andLiquidfractionGreaterThanOrEqualTo(Double value) {
            addCriterion("liquidfraction >=", value, "liquidfraction");
            return (Criteria) this;
        }

        public Criteria andLiquidfractionLessThan(Double value) {
            addCriterion("liquidfraction <", value, "liquidfraction");
            return (Criteria) this;
        }

        public Criteria andLiquidfractionLessThanOrEqualTo(Double value) {
            addCriterion("liquidfraction <=", value, "liquidfraction");
            return (Criteria) this;
        }

        public Criteria andLiquidfractionIn(List<Double> values) {
            addCriterion("liquidfraction in", values, "liquidfraction");
            return (Criteria) this;
        }

        public Criteria andLiquidfractionNotIn(List<Double> values) {
            addCriterion("liquidfraction not in", values, "liquidfraction");
            return (Criteria) this;
        }

        public Criteria andLiquidfractionBetween(Double value1, Double value2) {
            addCriterion("liquidfraction between", value1, value2, "liquidfraction");
            return (Criteria) this;
        }

        public Criteria andLiquidfractionNotBetween(Double value1, Double value2) {
            addCriterion("liquidfraction not between", value1, value2, "liquidfraction");
            return (Criteria) this;
        }

        public Criteria andLiquiddensityIsNull() {
            addCriterion("liquiddensity is null");
            return (Criteria) this;
        }

        public Criteria andLiquiddensityIsNotNull() {
            addCriterion("liquiddensity is not null");
            return (Criteria) this;
        }

        public Criteria andLiquiddensityEqualTo(Double value) {
            addCriterion("liquiddensity =", value, "liquiddensity");
            return (Criteria) this;
        }

        public Criteria andLiquiddensityNotEqualTo(Double value) {
            addCriterion("liquiddensity <>", value, "liquiddensity");
            return (Criteria) this;
        }

        public Criteria andLiquiddensityGreaterThan(Double value) {
            addCriterion("liquiddensity >", value, "liquiddensity");
            return (Criteria) this;
        }

        public Criteria andLiquiddensityGreaterThanOrEqualTo(Double value) {
            addCriterion("liquiddensity >=", value, "liquiddensity");
            return (Criteria) this;
        }

        public Criteria andLiquiddensityLessThan(Double value) {
            addCriterion("liquiddensity <", value, "liquiddensity");
            return (Criteria) this;
        }

        public Criteria andLiquiddensityLessThanOrEqualTo(Double value) {
            addCriterion("liquiddensity <=", value, "liquiddensity");
            return (Criteria) this;
        }

        public Criteria andLiquiddensityIn(List<Double> values) {
            addCriterion("liquiddensity in", values, "liquiddensity");
            return (Criteria) this;
        }

        public Criteria andLiquiddensityNotIn(List<Double> values) {
            addCriterion("liquiddensity not in", values, "liquiddensity");
            return (Criteria) this;
        }

        public Criteria andLiquiddensityBetween(Double value1, Double value2) {
            addCriterion("liquiddensity between", value1, value2, "liquiddensity");
            return (Criteria) this;
        }

        public Criteria andLiquiddensityNotBetween(Double value1, Double value2) {
            addCriterion("liquiddensity not between", value1, value2, "liquiddensity");
            return (Criteria) this;
        }

        public Criteria andLiquidmaxtemIsNull() {
            addCriterion("liquidmaxtem is null");
            return (Criteria) this;
        }

        public Criteria andLiquidmaxtemIsNotNull() {
            addCriterion("liquidmaxtem is not null");
            return (Criteria) this;
        }

        public Criteria andLiquidmaxtemEqualTo(Double value) {
            addCriterion("liquidmaxtem =", value, "liquidmaxtem");
            return (Criteria) this;
        }

        public Criteria andLiquidmaxtemNotEqualTo(Double value) {
            addCriterion("liquidmaxtem <>", value, "liquidmaxtem");
            return (Criteria) this;
        }

        public Criteria andLiquidmaxtemGreaterThan(Double value) {
            addCriterion("liquidmaxtem >", value, "liquidmaxtem");
            return (Criteria) this;
        }

        public Criteria andLiquidmaxtemGreaterThanOrEqualTo(Double value) {
            addCriterion("liquidmaxtem >=", value, "liquidmaxtem");
            return (Criteria) this;
        }

        public Criteria andLiquidmaxtemLessThan(Double value) {
            addCriterion("liquidmaxtem <", value, "liquidmaxtem");
            return (Criteria) this;
        }

        public Criteria andLiquidmaxtemLessThanOrEqualTo(Double value) {
            addCriterion("liquidmaxtem <=", value, "liquidmaxtem");
            return (Criteria) this;
        }

        public Criteria andLiquidmaxtemIn(List<Double> values) {
            addCriterion("liquidmaxtem in", values, "liquidmaxtem");
            return (Criteria) this;
        }

        public Criteria andLiquidmaxtemNotIn(List<Double> values) {
            addCriterion("liquidmaxtem not in", values, "liquidmaxtem");
            return (Criteria) this;
        }

        public Criteria andLiquidmaxtemBetween(Double value1, Double value2) {
            addCriterion("liquidmaxtem between", value1, value2, "liquidmaxtem");
            return (Criteria) this;
        }

        public Criteria andLiquidmaxtemNotBetween(Double value1, Double value2) {
            addCriterion("liquidmaxtem not between", value1, value2, "liquidmaxtem");
            return (Criteria) this;
        }

        public Criteria andLiquidmintemIsNull() {
            addCriterion("liquidmintem is null");
            return (Criteria) this;
        }

        public Criteria andLiquidmintemIsNotNull() {
            addCriterion("liquidmintem is not null");
            return (Criteria) this;
        }

        public Criteria andLiquidmintemEqualTo(Double value) {
            addCriterion("liquidmintem =", value, "liquidmintem");
            return (Criteria) this;
        }

        public Criteria andLiquidmintemNotEqualTo(Double value) {
            addCriterion("liquidmintem <>", value, "liquidmintem");
            return (Criteria) this;
        }

        public Criteria andLiquidmintemGreaterThan(Double value) {
            addCriterion("liquidmintem >", value, "liquidmintem");
            return (Criteria) this;
        }

        public Criteria andLiquidmintemGreaterThanOrEqualTo(Double value) {
            addCriterion("liquidmintem >=", value, "liquidmintem");
            return (Criteria) this;
        }

        public Criteria andLiquidmintemLessThan(Double value) {
            addCriterion("liquidmintem <", value, "liquidmintem");
            return (Criteria) this;
        }

        public Criteria andLiquidmintemLessThanOrEqualTo(Double value) {
            addCriterion("liquidmintem <=", value, "liquidmintem");
            return (Criteria) this;
        }

        public Criteria andLiquidmintemIn(List<Double> values) {
            addCriterion("liquidmintem in", values, "liquidmintem");
            return (Criteria) this;
        }

        public Criteria andLiquidmintemNotIn(List<Double> values) {
            addCriterion("liquidmintem not in", values, "liquidmintem");
            return (Criteria) this;
        }

        public Criteria andLiquidmintemBetween(Double value1, Double value2) {
            addCriterion("liquidmintem between", value1, value2, "liquidmintem");
            return (Criteria) this;
        }

        public Criteria andLiquidmintemNotBetween(Double value1, Double value2) {
            addCriterion("liquidmintem not between", value1, value2, "liquidmintem");
            return (Criteria) this;
        }

        public Criteria andLiquidavertemIsNull() {
            addCriterion("liquidavertem is null");
            return (Criteria) this;
        }

        public Criteria andLiquidavertemIsNotNull() {
            addCriterion("liquidavertem is not null");
            return (Criteria) this;
        }

        public Criteria andLiquidavertemEqualTo(Double value) {
            addCriterion("liquidavertem =", value, "liquidavertem");
            return (Criteria) this;
        }

        public Criteria andLiquidavertemNotEqualTo(Double value) {
            addCriterion("liquidavertem <>", value, "liquidavertem");
            return (Criteria) this;
        }

        public Criteria andLiquidavertemGreaterThan(Double value) {
            addCriterion("liquidavertem >", value, "liquidavertem");
            return (Criteria) this;
        }

        public Criteria andLiquidavertemGreaterThanOrEqualTo(Double value) {
            addCriterion("liquidavertem >=", value, "liquidavertem");
            return (Criteria) this;
        }

        public Criteria andLiquidavertemLessThan(Double value) {
            addCriterion("liquidavertem <", value, "liquidavertem");
            return (Criteria) this;
        }

        public Criteria andLiquidavertemLessThanOrEqualTo(Double value) {
            addCriterion("liquidavertem <=", value, "liquidavertem");
            return (Criteria) this;
        }

        public Criteria andLiquidavertemIn(List<Double> values) {
            addCriterion("liquidavertem in", values, "liquidavertem");
            return (Criteria) this;
        }

        public Criteria andLiquidavertemNotIn(List<Double> values) {
            addCriterion("liquidavertem not in", values, "liquidavertem");
            return (Criteria) this;
        }

        public Criteria andLiquidavertemBetween(Double value1, Double value2) {
            addCriterion("liquidavertem between", value1, value2, "liquidavertem");
            return (Criteria) this;
        }

        public Criteria andLiquidavertemNotBetween(Double value1, Double value2) {
            addCriterion("liquidavertem not between", value1, value2, "liquidavertem");
            return (Criteria) this;
        }

        public Criteria andSubjecttemIsNull() {
            addCriterion("subjecttem is null");
            return (Criteria) this;
        }

        public Criteria andSubjecttemIsNotNull() {
            addCriterion("subjecttem is not null");
            return (Criteria) this;
        }

        public Criteria andSubjecttemEqualTo(Double value) {
            addCriterion("subjecttem =", value, "subjecttem");
            return (Criteria) this;
        }

        public Criteria andSubjecttemNotEqualTo(Double value) {
            addCriterion("subjecttem <>", value, "subjecttem");
            return (Criteria) this;
        }

        public Criteria andSubjecttemGreaterThan(Double value) {
            addCriterion("subjecttem >", value, "subjecttem");
            return (Criteria) this;
        }

        public Criteria andSubjecttemGreaterThanOrEqualTo(Double value) {
            addCriterion("subjecttem >=", value, "subjecttem");
            return (Criteria) this;
        }

        public Criteria andSubjecttemLessThan(Double value) {
            addCriterion("subjecttem <", value, "subjecttem");
            return (Criteria) this;
        }

        public Criteria andSubjecttemLessThanOrEqualTo(Double value) {
            addCriterion("subjecttem <=", value, "subjecttem");
            return (Criteria) this;
        }

        public Criteria andSubjecttemIn(List<Double> values) {
            addCriterion("subjecttem in", values, "subjecttem");
            return (Criteria) this;
        }

        public Criteria andSubjecttemNotIn(List<Double> values) {
            addCriterion("subjecttem not in", values, "subjecttem");
            return (Criteria) this;
        }

        public Criteria andSubjecttemBetween(Double value1, Double value2) {
            addCriterion("subjecttem between", value1, value2, "subjecttem");
            return (Criteria) this;
        }

        public Criteria andSubjecttemNotBetween(Double value1, Double value2) {
            addCriterion("subjecttem not between", value1, value2, "subjecttem");
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