package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class SealpointleakinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SealpointleakinfoExample() {
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

        public Criteria andLeakidIsNull() {
            addCriterion("leakid is null");
            return (Criteria) this;
        }

        public Criteria andLeakidIsNotNull() {
            addCriterion("leakid is not null");
            return (Criteria) this;
        }

        public Criteria andLeakidEqualTo(Integer value) {
            addCriterion("leakid =", value, "leakid");
            return (Criteria) this;
        }

        public Criteria andLeakidNotEqualTo(Integer value) {
            addCriterion("leakid <>", value, "leakid");
            return (Criteria) this;
        }

        public Criteria andLeakidGreaterThan(Integer value) {
            addCriterion("leakid >", value, "leakid");
            return (Criteria) this;
        }

        public Criteria andLeakidGreaterThanOrEqualTo(Integer value) {
            addCriterion("leakid >=", value, "leakid");
            return (Criteria) this;
        }

        public Criteria andLeakidLessThan(Integer value) {
            addCriterion("leakid <", value, "leakid");
            return (Criteria) this;
        }

        public Criteria andLeakidLessThanOrEqualTo(Integer value) {
            addCriterion("leakid <=", value, "leakid");
            return (Criteria) this;
        }

        public Criteria andLeakidIn(List<Integer> values) {
            addCriterion("leakid in", values, "leakid");
            return (Criteria) this;
        }

        public Criteria andLeakidNotIn(List<Integer> values) {
            addCriterion("leakid not in", values, "leakid");
            return (Criteria) this;
        }

        public Criteria andLeakidBetween(Integer value1, Integer value2) {
            addCriterion("leakid between", value1, value2, "leakid");
            return (Criteria) this;
        }

        public Criteria andLeakidNotBetween(Integer value1, Integer value2) {
            addCriterion("leakid not between", value1, value2, "leakid");
            return (Criteria) this;
        }

        public Criteria andSealpointsurveyidIsNull() {
            addCriterion("sealpointsurveyid is null");
            return (Criteria) this;
        }

        public Criteria andSealpointsurveyidIsNotNull() {
            addCriterion("sealpointsurveyid is not null");
            return (Criteria) this;
        }

        public Criteria andSealpointsurveyidEqualTo(Integer value) {
            addCriterion("sealpointsurveyid =", value, "sealpointsurveyid");
            return (Criteria) this;
        }

        public Criteria andSealpointsurveyidNotEqualTo(Integer value) {
            addCriterion("sealpointsurveyid <>", value, "sealpointsurveyid");
            return (Criteria) this;
        }

        public Criteria andSealpointsurveyidGreaterThan(Integer value) {
            addCriterion("sealpointsurveyid >", value, "sealpointsurveyid");
            return (Criteria) this;
        }

        public Criteria andSealpointsurveyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sealpointsurveyid >=", value, "sealpointsurveyid");
            return (Criteria) this;
        }

        public Criteria andSealpointsurveyidLessThan(Integer value) {
            addCriterion("sealpointsurveyid <", value, "sealpointsurveyid");
            return (Criteria) this;
        }

        public Criteria andSealpointsurveyidLessThanOrEqualTo(Integer value) {
            addCriterion("sealpointsurveyid <=", value, "sealpointsurveyid");
            return (Criteria) this;
        }

        public Criteria andSealpointsurveyidIn(List<Integer> values) {
            addCriterion("sealpointsurveyid in", values, "sealpointsurveyid");
            return (Criteria) this;
        }

        public Criteria andSealpointsurveyidNotIn(List<Integer> values) {
            addCriterion("sealpointsurveyid not in", values, "sealpointsurveyid");
            return (Criteria) this;
        }

        public Criteria andSealpointsurveyidBetween(Integer value1, Integer value2) {
            addCriterion("sealpointsurveyid between", value1, value2, "sealpointsurveyid");
            return (Criteria) this;
        }

        public Criteria andSealpointsurveyidNotBetween(Integer value1, Integer value2) {
            addCriterion("sealpointsurveyid not between", value1, value2, "sealpointsurveyid");
            return (Criteria) this;
        }

        public Criteria andUnittypeIsNull() {
            addCriterion("unittype is null");
            return (Criteria) this;
        }

        public Criteria andUnittypeIsNotNull() {
            addCriterion("unittype is not null");
            return (Criteria) this;
        }

        public Criteria andUnittypeEqualTo(String value) {
            addCriterion("unittype =", value, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeNotEqualTo(String value) {
            addCriterion("unittype <>", value, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeGreaterThan(String value) {
            addCriterion("unittype >", value, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeGreaterThanOrEqualTo(String value) {
            addCriterion("unittype >=", value, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeLessThan(String value) {
            addCriterion("unittype <", value, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeLessThanOrEqualTo(String value) {
            addCriterion("unittype <=", value, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeLike(String value) {
            addCriterion("unittype like", value, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeNotLike(String value) {
            addCriterion("unittype not like", value, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeIn(List<String> values) {
            addCriterion("unittype in", values, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeNotIn(List<String> values) {
            addCriterion("unittype not in", values, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeBetween(String value1, String value2) {
            addCriterion("unittype between", value1, value2, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeNotBetween(String value1, String value2) {
            addCriterion("unittype not between", value1, value2, "unittype");
            return (Criteria) this;
        }

        public Criteria andGuanlianrateIsNull() {
            addCriterion("guanlianrate is null");
            return (Criteria) this;
        }

        public Criteria andGuanlianrateIsNotNull() {
            addCriterion("guanlianrate is not null");
            return (Criteria) this;
        }

        public Criteria andGuanlianrateEqualTo(Integer value) {
            addCriterion("guanlianrate =", value, "guanlianrate");
            return (Criteria) this;
        }

        public Criteria andGuanlianrateNotEqualTo(Integer value) {
            addCriterion("guanlianrate <>", value, "guanlianrate");
            return (Criteria) this;
        }

        public Criteria andGuanlianrateGreaterThan(Integer value) {
            addCriterion("guanlianrate >", value, "guanlianrate");
            return (Criteria) this;
        }

        public Criteria andGuanlianrateGreaterThanOrEqualTo(Integer value) {
            addCriterion("guanlianrate >=", value, "guanlianrate");
            return (Criteria) this;
        }

        public Criteria andGuanlianrateLessThan(Integer value) {
            addCriterion("guanlianrate <", value, "guanlianrate");
            return (Criteria) this;
        }

        public Criteria andGuanlianrateLessThanOrEqualTo(Integer value) {
            addCriterion("guanlianrate <=", value, "guanlianrate");
            return (Criteria) this;
        }

        public Criteria andGuanlianrateIn(List<Integer> values) {
            addCriterion("guanlianrate in", values, "guanlianrate");
            return (Criteria) this;
        }

        public Criteria andGuanlianrateNotIn(List<Integer> values) {
            addCriterion("guanlianrate not in", values, "guanlianrate");
            return (Criteria) this;
        }

        public Criteria andGuanlianrateBetween(Integer value1, Integer value2) {
            addCriterion("guanlianrate between", value1, value2, "guanlianrate");
            return (Criteria) this;
        }

        public Criteria andGuanlianrateNotBetween(Integer value1, Integer value2) {
            addCriterion("guanlianrate not between", value1, value2, "guanlianrate");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(Double value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(Double value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(Double value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(Double value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(Double value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(Double value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<Double> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<Double> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(Double value1, Double value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(Double value1, Double value2) {
            addCriterion("rate not between", value1, value2, "rate");
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

        public Criteria andControltechIsNull() {
            addCriterion("controltech is null");
            return (Criteria) this;
        }

        public Criteria andControltechIsNotNull() {
            addCriterion("controltech is not null");
            return (Criteria) this;
        }

        public Criteria andControltechEqualTo(Integer value) {
            addCriterion("controltech =", value, "controltech");
            return (Criteria) this;
        }

        public Criteria andControltechNotEqualTo(Integer value) {
            addCriterion("controltech <>", value, "controltech");
            return (Criteria) this;
        }

        public Criteria andControltechGreaterThan(Integer value) {
            addCriterion("controltech >", value, "controltech");
            return (Criteria) this;
        }

        public Criteria andControltechGreaterThanOrEqualTo(Integer value) {
            addCriterion("controltech >=", value, "controltech");
            return (Criteria) this;
        }

        public Criteria andControltechLessThan(Integer value) {
            addCriterion("controltech <", value, "controltech");
            return (Criteria) this;
        }

        public Criteria andControltechLessThanOrEqualTo(Integer value) {
            addCriterion("controltech <=", value, "controltech");
            return (Criteria) this;
        }

        public Criteria andControltechIn(List<Integer> values) {
            addCriterion("controltech in", values, "controltech");
            return (Criteria) this;
        }

        public Criteria andControltechNotIn(List<Integer> values) {
            addCriterion("controltech not in", values, "controltech");
            return (Criteria) this;
        }

        public Criteria andControltechBetween(Integer value1, Integer value2) {
            addCriterion("controltech between", value1, value2, "controltech");
            return (Criteria) this;
        }

        public Criteria andControltechNotBetween(Integer value1, Integer value2) {
            addCriterion("controltech not between", value1, value2, "controltech");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andLeaknumIsNull() {
            addCriterion("leaknum is null");
            return (Criteria) this;
        }

        public Criteria andLeaknumIsNotNull() {
            addCriterion("leaknum is not null");
            return (Criteria) this;
        }

        public Criteria andLeaknumEqualTo(Integer value) {
            addCriterion("leaknum =", value, "leaknum");
            return (Criteria) this;
        }

        public Criteria andLeaknumNotEqualTo(Integer value) {
            addCriterion("leaknum <>", value, "leaknum");
            return (Criteria) this;
        }

        public Criteria andLeaknumGreaterThan(Integer value) {
            addCriterion("leaknum >", value, "leaknum");
            return (Criteria) this;
        }

        public Criteria andLeaknumGreaterThanOrEqualTo(Integer value) {
            addCriterion("leaknum >=", value, "leaknum");
            return (Criteria) this;
        }

        public Criteria andLeaknumLessThan(Integer value) {
            addCriterion("leaknum <", value, "leaknum");
            return (Criteria) this;
        }

        public Criteria andLeaknumLessThanOrEqualTo(Integer value) {
            addCriterion("leaknum <=", value, "leaknum");
            return (Criteria) this;
        }

        public Criteria andLeaknumIn(List<Integer> values) {
            addCriterion("leaknum in", values, "leaknum");
            return (Criteria) this;
        }

        public Criteria andLeaknumNotIn(List<Integer> values) {
            addCriterion("leaknum not in", values, "leaknum");
            return (Criteria) this;
        }

        public Criteria andLeaknumBetween(Integer value1, Integer value2) {
            addCriterion("leaknum between", value1, value2, "leaknum");
            return (Criteria) this;
        }

        public Criteria andLeaknumNotBetween(Integer value1, Integer value2) {
            addCriterion("leaknum not between", value1, value2, "leaknum");
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