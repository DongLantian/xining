package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class SccExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SccExample() {
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

        public Criteria andSccIsNull() {
            addCriterion("scc is null");
            return (Criteria) this;
        }

        public Criteria andSccIsNotNull() {
            addCriterion("scc is not null");
            return (Criteria) this;
        }

        public Criteria andSccEqualTo(String value) {
            addCriterion("scc =", value, "scc");
            return (Criteria) this;
        }

        public Criteria andSccNotEqualTo(String value) {
            addCriterion("scc <>", value, "scc");
            return (Criteria) this;
        }

        public Criteria andSccGreaterThan(String value) {
            addCriterion("scc >", value, "scc");
            return (Criteria) this;
        }

        public Criteria andSccGreaterThanOrEqualTo(String value) {
            addCriterion("scc >=", value, "scc");
            return (Criteria) this;
        }

        public Criteria andSccLessThan(String value) {
            addCriterion("scc <", value, "scc");
            return (Criteria) this;
        }

        public Criteria andSccLessThanOrEqualTo(String value) {
            addCriterion("scc <=", value, "scc");
            return (Criteria) this;
        }

        public Criteria andSccLike(String value) {
            addCriterion("scc like", value, "scc");
            return (Criteria) this;
        }

        public Criteria andSccNotLike(String value) {
            addCriterion("scc not like", value, "scc");
            return (Criteria) this;
        }

        public Criteria andSccIn(List<String> values) {
            addCriterion("scc in", values, "scc");
            return (Criteria) this;
        }

        public Criteria andSccNotIn(List<String> values) {
            addCriterion("scc not in", values, "scc");
            return (Criteria) this;
        }

        public Criteria andSccBetween(String value1, String value2) {
            addCriterion("scc between", value1, value2, "scc");
            return (Criteria) this;
        }

        public Criteria andSccNotBetween(String value1, String value2) {
            addCriterion("scc not between", value1, value2, "scc");
            return (Criteria) this;
        }

        public Criteria andEpaSccIsNull() {
            addCriterion("epa_scc is null");
            return (Criteria) this;
        }

        public Criteria andEpaSccIsNotNull() {
            addCriterion("epa_scc is not null");
            return (Criteria) this;
        }

        public Criteria andEpaSccEqualTo(String value) {
            addCriterion("epa_scc =", value, "epaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccNotEqualTo(String value) {
            addCriterion("epa_scc <>", value, "epaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccGreaterThan(String value) {
            addCriterion("epa_scc >", value, "epaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccGreaterThanOrEqualTo(String value) {
            addCriterion("epa_scc >=", value, "epaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccLessThan(String value) {
            addCriterion("epa_scc <", value, "epaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccLessThanOrEqualTo(String value) {
            addCriterion("epa_scc <=", value, "epaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccLike(String value) {
            addCriterion("epa_scc like", value, "epaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccNotLike(String value) {
            addCriterion("epa_scc not like", value, "epaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccIn(List<String> values) {
            addCriterion("epa_scc in", values, "epaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccNotIn(List<String> values) {
            addCriterion("epa_scc not in", values, "epaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccBetween(String value1, String value2) {
            addCriterion("epa_scc between", value1, value2, "epaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccNotBetween(String value1, String value2) {
            addCriterion("epa_scc not between", value1, value2, "epaScc");
            return (Criteria) this;
        }

        public Criteria andGridid9kIsNull() {
            addCriterion("gridid_9k is null");
            return (Criteria) this;
        }

        public Criteria andGridid9kIsNotNull() {
            addCriterion("gridid_9k is not null");
            return (Criteria) this;
        }

        public Criteria andGridid9kEqualTo(String value) {
            addCriterion("gridid_9k =", value, "gridid9k");
            return (Criteria) this;
        }

        public Criteria andGridid9kNotEqualTo(String value) {
            addCriterion("gridid_9k <>", value, "gridid9k");
            return (Criteria) this;
        }

        public Criteria andGridid9kGreaterThan(String value) {
            addCriterion("gridid_9k >", value, "gridid9k");
            return (Criteria) this;
        }

        public Criteria andGridid9kGreaterThanOrEqualTo(String value) {
            addCriterion("gridid_9k >=", value, "gridid9k");
            return (Criteria) this;
        }

        public Criteria andGridid9kLessThan(String value) {
            addCriterion("gridid_9k <", value, "gridid9k");
            return (Criteria) this;
        }

        public Criteria andGridid9kLessThanOrEqualTo(String value) {
            addCriterion("gridid_9k <=", value, "gridid9k");
            return (Criteria) this;
        }

        public Criteria andGridid9kLike(String value) {
            addCriterion("gridid_9k like", value, "gridid9k");
            return (Criteria) this;
        }

        public Criteria andGridid9kNotLike(String value) {
            addCriterion("gridid_9k not like", value, "gridid9k");
            return (Criteria) this;
        }

        public Criteria andGridid9kIn(List<String> values) {
            addCriterion("gridid_9k in", values, "gridid9k");
            return (Criteria) this;
        }

        public Criteria andGridid9kNotIn(List<String> values) {
            addCriterion("gridid_9k not in", values, "gridid9k");
            return (Criteria) this;
        }

        public Criteria andGridid9kBetween(String value1, String value2) {
            addCriterion("gridid_9k between", value1, value2, "gridid9k");
            return (Criteria) this;
        }

        public Criteria andGridid9kNotBetween(String value1, String value2) {
            addCriterion("gridid_9k not between", value1, value2, "gridid9k");
            return (Criteria) this;
        }

        public Criteria andGridid3kIsNull() {
            addCriterion("gridid_3k is null");
            return (Criteria) this;
        }

        public Criteria andGridid3kIsNotNull() {
            addCriterion("gridid_3k is not null");
            return (Criteria) this;
        }

        public Criteria andGridid3kEqualTo(String value) {
            addCriterion("gridid_3k =", value, "gridid3k");
            return (Criteria) this;
        }

        public Criteria andGridid3kNotEqualTo(String value) {
            addCriterion("gridid_3k <>", value, "gridid3k");
            return (Criteria) this;
        }

        public Criteria andGridid3kGreaterThan(String value) {
            addCriterion("gridid_3k >", value, "gridid3k");
            return (Criteria) this;
        }

        public Criteria andGridid3kGreaterThanOrEqualTo(String value) {
            addCriterion("gridid_3k >=", value, "gridid3k");
            return (Criteria) this;
        }

        public Criteria andGridid3kLessThan(String value) {
            addCriterion("gridid_3k <", value, "gridid3k");
            return (Criteria) this;
        }

        public Criteria andGridid3kLessThanOrEqualTo(String value) {
            addCriterion("gridid_3k <=", value, "gridid3k");
            return (Criteria) this;
        }

        public Criteria andGridid3kLike(String value) {
            addCriterion("gridid_3k like", value, "gridid3k");
            return (Criteria) this;
        }

        public Criteria andGridid3kNotLike(String value) {
            addCriterion("gridid_3k not like", value, "gridid3k");
            return (Criteria) this;
        }

        public Criteria andGridid3kIn(List<String> values) {
            addCriterion("gridid_3k in", values, "gridid3k");
            return (Criteria) this;
        }

        public Criteria andGridid3kNotIn(List<String> values) {
            addCriterion("gridid_3k not in", values, "gridid3k");
            return (Criteria) this;
        }

        public Criteria andGridid3kBetween(String value1, String value2) {
            addCriterion("gridid_3k between", value1, value2, "gridid3k");
            return (Criteria) this;
        }

        public Criteria andGridid3kNotBetween(String value1, String value2) {
            addCriterion("gridid_3k not between", value1, value2, "gridid3k");
            return (Criteria) this;
        }

        public Criteria andNoxIsNull() {
            addCriterion("nox is null");
            return (Criteria) this;
        }

        public Criteria andNoxIsNotNull() {
            addCriterion("nox is not null");
            return (Criteria) this;
        }

        public Criteria andNoxEqualTo(Double value) {
            addCriterion("nox =", value, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxNotEqualTo(Double value) {
            addCriterion("nox <>", value, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxGreaterThan(Double value) {
            addCriterion("nox >", value, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxGreaterThanOrEqualTo(Double value) {
            addCriterion("nox >=", value, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxLessThan(Double value) {
            addCriterion("nox <", value, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxLessThanOrEqualTo(Double value) {
            addCriterion("nox <=", value, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxIn(List<Double> values) {
            addCriterion("nox in", values, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxNotIn(List<Double> values) {
            addCriterion("nox not in", values, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxBetween(Double value1, Double value2) {
            addCriterion("nox between", value1, value2, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxNotBetween(Double value1, Double value2) {
            addCriterion("nox not between", value1, value2, "nox");
            return (Criteria) this;
        }

        public Criteria andSo2IsNull() {
            addCriterion("so2 is null");
            return (Criteria) this;
        }

        public Criteria andSo2IsNotNull() {
            addCriterion("so2 is not null");
            return (Criteria) this;
        }

        public Criteria andSo2EqualTo(Double value) {
            addCriterion("so2 =", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2NotEqualTo(Double value) {
            addCriterion("so2 <>", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2GreaterThan(Double value) {
            addCriterion("so2 >", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2GreaterThanOrEqualTo(Double value) {
            addCriterion("so2 >=", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2LessThan(Double value) {
            addCriterion("so2 <", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2LessThanOrEqualTo(Double value) {
            addCriterion("so2 <=", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2In(List<Double> values) {
            addCriterion("so2 in", values, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2NotIn(List<Double> values) {
            addCriterion("so2 not in", values, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2Between(Double value1, Double value2) {
            addCriterion("so2 between", value1, value2, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2NotBetween(Double value1, Double value2) {
            addCriterion("so2 not between", value1, value2, "so2");
            return (Criteria) this;
        }

        public Criteria andNh3IsNull() {
            addCriterion("nh3 is null");
            return (Criteria) this;
        }

        public Criteria andNh3IsNotNull() {
            addCriterion("nh3 is not null");
            return (Criteria) this;
        }

        public Criteria andNh3EqualTo(Double value) {
            addCriterion("nh3 =", value, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3NotEqualTo(Double value) {
            addCriterion("nh3 <>", value, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3GreaterThan(Double value) {
            addCriterion("nh3 >", value, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3GreaterThanOrEqualTo(Double value) {
            addCriterion("nh3 >=", value, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3LessThan(Double value) {
            addCriterion("nh3 <", value, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3LessThanOrEqualTo(Double value) {
            addCriterion("nh3 <=", value, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3In(List<Double> values) {
            addCriterion("nh3 in", values, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3NotIn(List<Double> values) {
            addCriterion("nh3 not in", values, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3Between(Double value1, Double value2) {
            addCriterion("nh3 between", value1, value2, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3NotBetween(Double value1, Double value2) {
            addCriterion("nh3 not between", value1, value2, "nh3");
            return (Criteria) this;
        }

        public Criteria andVocsIsNull() {
            addCriterion("vocs is null");
            return (Criteria) this;
        }

        public Criteria andVocsIsNotNull() {
            addCriterion("vocs is not null");
            return (Criteria) this;
        }

        public Criteria andVocsEqualTo(Double value) {
            addCriterion("vocs =", value, "vocs");
            return (Criteria) this;
        }

        public Criteria andVocsNotEqualTo(Double value) {
            addCriterion("vocs <>", value, "vocs");
            return (Criteria) this;
        }

        public Criteria andVocsGreaterThan(Double value) {
            addCriterion("vocs >", value, "vocs");
            return (Criteria) this;
        }

        public Criteria andVocsGreaterThanOrEqualTo(Double value) {
            addCriterion("vocs >=", value, "vocs");
            return (Criteria) this;
        }

        public Criteria andVocsLessThan(Double value) {
            addCriterion("vocs <", value, "vocs");
            return (Criteria) this;
        }

        public Criteria andVocsLessThanOrEqualTo(Double value) {
            addCriterion("vocs <=", value, "vocs");
            return (Criteria) this;
        }

        public Criteria andVocsIn(List<Double> values) {
            addCriterion("vocs in", values, "vocs");
            return (Criteria) this;
        }

        public Criteria andVocsNotIn(List<Double> values) {
            addCriterion("vocs not in", values, "vocs");
            return (Criteria) this;
        }

        public Criteria andVocsBetween(Double value1, Double value2) {
            addCriterion("vocs between", value1, value2, "vocs");
            return (Criteria) this;
        }

        public Criteria andVocsNotBetween(Double value1, Double value2) {
            addCriterion("vocs not between", value1, value2, "vocs");
            return (Criteria) this;
        }

        public Criteria andCoIsNull() {
            addCriterion("co is null");
            return (Criteria) this;
        }

        public Criteria andCoIsNotNull() {
            addCriterion("co is not null");
            return (Criteria) this;
        }

        public Criteria andCoEqualTo(Double value) {
            addCriterion("co =", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoNotEqualTo(Double value) {
            addCriterion("co <>", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoGreaterThan(Double value) {
            addCriterion("co >", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoGreaterThanOrEqualTo(Double value) {
            addCriterion("co >=", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoLessThan(Double value) {
            addCriterion("co <", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoLessThanOrEqualTo(Double value) {
            addCriterion("co <=", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoIn(List<Double> values) {
            addCriterion("co in", values, "co");
            return (Criteria) this;
        }

        public Criteria andCoNotIn(List<Double> values) {
            addCriterion("co not in", values, "co");
            return (Criteria) this;
        }

        public Criteria andCoBetween(Double value1, Double value2) {
            addCriterion("co between", value1, value2, "co");
            return (Criteria) this;
        }

        public Criteria andCoNotBetween(Double value1, Double value2) {
            addCriterion("co not between", value1, value2, "co");
            return (Criteria) this;
        }

        public Criteria andPm10IsNull() {
            addCriterion("pm10 is null");
            return (Criteria) this;
        }

        public Criteria andPm10IsNotNull() {
            addCriterion("pm10 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10EqualTo(Double value) {
            addCriterion("pm10 =", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10NotEqualTo(Double value) {
            addCriterion("pm10 <>", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10GreaterThan(Double value) {
            addCriterion("pm10 >", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10GreaterThanOrEqualTo(Double value) {
            addCriterion("pm10 >=", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10LessThan(Double value) {
            addCriterion("pm10 <", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10LessThanOrEqualTo(Double value) {
            addCriterion("pm10 <=", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10In(List<Double> values) {
            addCriterion("pm10 in", values, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10NotIn(List<Double> values) {
            addCriterion("pm10 not in", values, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10Between(Double value1, Double value2) {
            addCriterion("pm10 between", value1, value2, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10NotBetween(Double value1, Double value2) {
            addCriterion("pm10 not between", value1, value2, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm25IsNull() {
            addCriterion("pm25 is null");
            return (Criteria) this;
        }

        public Criteria andPm25IsNotNull() {
            addCriterion("pm25 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25EqualTo(Double value) {
            addCriterion("pm25 =", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25NotEqualTo(Double value) {
            addCriterion("pm25 <>", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25GreaterThan(Double value) {
            addCriterion("pm25 >", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25GreaterThanOrEqualTo(Double value) {
            addCriterion("pm25 >=", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25LessThan(Double value) {
            addCriterion("pm25 <", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25LessThanOrEqualTo(Double value) {
            addCriterion("pm25 <=", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25In(List<Double> values) {
            addCriterion("pm25 in", values, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25NotIn(List<Double> values) {
            addCriterion("pm25 not in", values, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25Between(Double value1, Double value2) {
            addCriterion("pm25 between", value1, value2, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25NotBetween(Double value1, Double value2) {
            addCriterion("pm25 not between", value1, value2, "pm25");
            return (Criteria) this;
        }

        public Criteria andOcIsNull() {
            addCriterion("oc is null");
            return (Criteria) this;
        }

        public Criteria andOcIsNotNull() {
            addCriterion("oc is not null");
            return (Criteria) this;
        }

        public Criteria andOcEqualTo(Double value) {
            addCriterion("oc =", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcNotEqualTo(Double value) {
            addCriterion("oc <>", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcGreaterThan(Double value) {
            addCriterion("oc >", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcGreaterThanOrEqualTo(Double value) {
            addCriterion("oc >=", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcLessThan(Double value) {
            addCriterion("oc <", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcLessThanOrEqualTo(Double value) {
            addCriterion("oc <=", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcIn(List<Double> values) {
            addCriterion("oc in", values, "oc");
            return (Criteria) this;
        }

        public Criteria andOcNotIn(List<Double> values) {
            addCriterion("oc not in", values, "oc");
            return (Criteria) this;
        }

        public Criteria andOcBetween(Double value1, Double value2) {
            addCriterion("oc between", value1, value2, "oc");
            return (Criteria) this;
        }

        public Criteria andOcNotBetween(Double value1, Double value2) {
            addCriterion("oc not between", value1, value2, "oc");
            return (Criteria) this;
        }

        public Criteria andPmIsNull() {
            addCriterion("pm is null");
            return (Criteria) this;
        }

        public Criteria andPmIsNotNull() {
            addCriterion("pm is not null");
            return (Criteria) this;
        }

        public Criteria andPmEqualTo(Double value) {
            addCriterion("pm =", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmNotEqualTo(Double value) {
            addCriterion("pm <>", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmGreaterThan(Double value) {
            addCriterion("pm >", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmGreaterThanOrEqualTo(Double value) {
            addCriterion("pm >=", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmLessThan(Double value) {
            addCriterion("pm <", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmLessThanOrEqualTo(Double value) {
            addCriterion("pm <=", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmIn(List<Double> values) {
            addCriterion("pm in", values, "pm");
            return (Criteria) this;
        }

        public Criteria andPmNotIn(List<Double> values) {
            addCriterion("pm not in", values, "pm");
            return (Criteria) this;
        }

        public Criteria andPmBetween(Double value1, Double value2) {
            addCriterion("pm between", value1, value2, "pm");
            return (Criteria) this;
        }

        public Criteria andPmNotBetween(Double value1, Double value2) {
            addCriterion("pm not between", value1, value2, "pm");
            return (Criteria) this;
        }

        public Criteria andBcIsNull() {
            addCriterion("bc is null");
            return (Criteria) this;
        }

        public Criteria andBcIsNotNull() {
            addCriterion("bc is not null");
            return (Criteria) this;
        }

        public Criteria andBcEqualTo(Double value) {
            addCriterion("bc =", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcNotEqualTo(Double value) {
            addCriterion("bc <>", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcGreaterThan(Double value) {
            addCriterion("bc >", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcGreaterThanOrEqualTo(Double value) {
            addCriterion("bc >=", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcLessThan(Double value) {
            addCriterion("bc <", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcLessThanOrEqualTo(Double value) {
            addCriterion("bc <=", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcIn(List<Double> values) {
            addCriterion("bc in", values, "bc");
            return (Criteria) this;
        }

        public Criteria andBcNotIn(List<Double> values) {
            addCriterion("bc not in", values, "bc");
            return (Criteria) this;
        }

        public Criteria andBcBetween(Double value1, Double value2) {
            addCriterion("bc between", value1, value2, "bc");
            return (Criteria) this;
        }

        public Criteria andBcNotBetween(Double value1, Double value2) {
            addCriterion("bc not between", value1, value2, "bc");
            return (Criteria) this;
        }

        public Criteria andMonthidIsNull() {
            addCriterion("monthid is null");
            return (Criteria) this;
        }

        public Criteria andMonthidIsNotNull() {
            addCriterion("monthid is not null");
            return (Criteria) this;
        }

        public Criteria andMonthidEqualTo(Integer value) {
            addCriterion("monthid =", value, "monthid");
            return (Criteria) this;
        }

        public Criteria andMonthidNotEqualTo(Integer value) {
            addCriterion("monthid <>", value, "monthid");
            return (Criteria) this;
        }

        public Criteria andMonthidGreaterThan(Integer value) {
            addCriterion("monthid >", value, "monthid");
            return (Criteria) this;
        }

        public Criteria andMonthidGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthid >=", value, "monthid");
            return (Criteria) this;
        }

        public Criteria andMonthidLessThan(Integer value) {
            addCriterion("monthid <", value, "monthid");
            return (Criteria) this;
        }

        public Criteria andMonthidLessThanOrEqualTo(Integer value) {
            addCriterion("monthid <=", value, "monthid");
            return (Criteria) this;
        }

        public Criteria andMonthidIn(List<Integer> values) {
            addCriterion("monthid in", values, "monthid");
            return (Criteria) this;
        }

        public Criteria andMonthidNotIn(List<Integer> values) {
            addCriterion("monthid not in", values, "monthid");
            return (Criteria) this;
        }

        public Criteria andMonthidBetween(Integer value1, Integer value2) {
            addCriterion("monthid between", value1, value2, "monthid");
            return (Criteria) this;
        }

        public Criteria andMonthidNotBetween(Integer value1, Integer value2) {
            addCriterion("monthid not between", value1, value2, "monthid");
            return (Criteria) this;
        }

        public Criteria andNkweekidIsNull() {
            addCriterion("nkweekid is null");
            return (Criteria) this;
        }

        public Criteria andNkweekidIsNotNull() {
            addCriterion("nkweekid is not null");
            return (Criteria) this;
        }

        public Criteria andNkweekidEqualTo(Integer value) {
            addCriterion("nkweekid =", value, "nkweekid");
            return (Criteria) this;
        }

        public Criteria andNkweekidNotEqualTo(Integer value) {
            addCriterion("nkweekid <>", value, "nkweekid");
            return (Criteria) this;
        }

        public Criteria andNkweekidGreaterThan(Integer value) {
            addCriterion("nkweekid >", value, "nkweekid");
            return (Criteria) this;
        }

        public Criteria andNkweekidGreaterThanOrEqualTo(Integer value) {
            addCriterion("nkweekid >=", value, "nkweekid");
            return (Criteria) this;
        }

        public Criteria andNkweekidLessThan(Integer value) {
            addCriterion("nkweekid <", value, "nkweekid");
            return (Criteria) this;
        }

        public Criteria andNkweekidLessThanOrEqualTo(Integer value) {
            addCriterion("nkweekid <=", value, "nkweekid");
            return (Criteria) this;
        }

        public Criteria andNkweekidIn(List<Integer> values) {
            addCriterion("nkweekid in", values, "nkweekid");
            return (Criteria) this;
        }

        public Criteria andNkweekidNotIn(List<Integer> values) {
            addCriterion("nkweekid not in", values, "nkweekid");
            return (Criteria) this;
        }

        public Criteria andNkweekidBetween(Integer value1, Integer value2) {
            addCriterion("nkweekid between", value1, value2, "nkweekid");
            return (Criteria) this;
        }

        public Criteria andNkweekidNotBetween(Integer value1, Integer value2) {
            addCriterion("nkweekid not between", value1, value2, "nkweekid");
            return (Criteria) this;
        }

        public Criteria andNkdayidIsNull() {
            addCriterion("nkdayid is null");
            return (Criteria) this;
        }

        public Criteria andNkdayidIsNotNull() {
            addCriterion("nkdayid is not null");
            return (Criteria) this;
        }

        public Criteria andNkdayidEqualTo(Integer value) {
            addCriterion("nkdayid =", value, "nkdayid");
            return (Criteria) this;
        }

        public Criteria andNkdayidNotEqualTo(Integer value) {
            addCriterion("nkdayid <>", value, "nkdayid");
            return (Criteria) this;
        }

        public Criteria andNkdayidGreaterThan(Integer value) {
            addCriterion("nkdayid >", value, "nkdayid");
            return (Criteria) this;
        }

        public Criteria andNkdayidGreaterThanOrEqualTo(Integer value) {
            addCriterion("nkdayid >=", value, "nkdayid");
            return (Criteria) this;
        }

        public Criteria andNkdayidLessThan(Integer value) {
            addCriterion("nkdayid <", value, "nkdayid");
            return (Criteria) this;
        }

        public Criteria andNkdayidLessThanOrEqualTo(Integer value) {
            addCriterion("nkdayid <=", value, "nkdayid");
            return (Criteria) this;
        }

        public Criteria andNkdayidIn(List<Integer> values) {
            addCriterion("nkdayid in", values, "nkdayid");
            return (Criteria) this;
        }

        public Criteria andNkdayidNotIn(List<Integer> values) {
            addCriterion("nkdayid not in", values, "nkdayid");
            return (Criteria) this;
        }

        public Criteria andNkdayidBetween(Integer value1, Integer value2) {
            addCriterion("nkdayid between", value1, value2, "nkdayid");
            return (Criteria) this;
        }

        public Criteria andNkdayidNotBetween(Integer value1, Integer value2) {
            addCriterion("nkdayid not between", value1, value2, "nkdayid");
            return (Criteria) this;
        }

        public Criteria andNknoxidIsNull() {
            addCriterion("nknoxid is null");
            return (Criteria) this;
        }

        public Criteria andNknoxidIsNotNull() {
            addCriterion("nknoxid is not null");
            return (Criteria) this;
        }

        public Criteria andNknoxidEqualTo(Integer value) {
            addCriterion("nknoxid =", value, "nknoxid");
            return (Criteria) this;
        }

        public Criteria andNknoxidNotEqualTo(Integer value) {
            addCriterion("nknoxid <>", value, "nknoxid");
            return (Criteria) this;
        }

        public Criteria andNknoxidGreaterThan(Integer value) {
            addCriterion("nknoxid >", value, "nknoxid");
            return (Criteria) this;
        }

        public Criteria andNknoxidGreaterThanOrEqualTo(Integer value) {
            addCriterion("nknoxid >=", value, "nknoxid");
            return (Criteria) this;
        }

        public Criteria andNknoxidLessThan(Integer value) {
            addCriterion("nknoxid <", value, "nknoxid");
            return (Criteria) this;
        }

        public Criteria andNknoxidLessThanOrEqualTo(Integer value) {
            addCriterion("nknoxid <=", value, "nknoxid");
            return (Criteria) this;
        }

        public Criteria andNknoxidIn(List<Integer> values) {
            addCriterion("nknoxid in", values, "nknoxid");
            return (Criteria) this;
        }

        public Criteria andNknoxidNotIn(List<Integer> values) {
            addCriterion("nknoxid not in", values, "nknoxid");
            return (Criteria) this;
        }

        public Criteria andNknoxidBetween(Integer value1, Integer value2) {
            addCriterion("nknoxid between", value1, value2, "nknoxid");
            return (Criteria) this;
        }

        public Criteria andNknoxidNotBetween(Integer value1, Integer value2) {
            addCriterion("nknoxid not between", value1, value2, "nknoxid");
            return (Criteria) this;
        }

        public Criteria andNkvocidIsNull() {
            addCriterion("nkvocid is null");
            return (Criteria) this;
        }

        public Criteria andNkvocidIsNotNull() {
            addCriterion("nkvocid is not null");
            return (Criteria) this;
        }

        public Criteria andNkvocidEqualTo(Integer value) {
            addCriterion("nkvocid =", value, "nkvocid");
            return (Criteria) this;
        }

        public Criteria andNkvocidNotEqualTo(Integer value) {
            addCriterion("nkvocid <>", value, "nkvocid");
            return (Criteria) this;
        }

        public Criteria andNkvocidGreaterThan(Integer value) {
            addCriterion("nkvocid >", value, "nkvocid");
            return (Criteria) this;
        }

        public Criteria andNkvocidGreaterThanOrEqualTo(Integer value) {
            addCriterion("nkvocid >=", value, "nkvocid");
            return (Criteria) this;
        }

        public Criteria andNkvocidLessThan(Integer value) {
            addCriterion("nkvocid <", value, "nkvocid");
            return (Criteria) this;
        }

        public Criteria andNkvocidLessThanOrEqualTo(Integer value) {
            addCriterion("nkvocid <=", value, "nkvocid");
            return (Criteria) this;
        }

        public Criteria andNkvocidIn(List<Integer> values) {
            addCriterion("nkvocid in", values, "nkvocid");
            return (Criteria) this;
        }

        public Criteria andNkvocidNotIn(List<Integer> values) {
            addCriterion("nkvocid not in", values, "nkvocid");
            return (Criteria) this;
        }

        public Criteria andNkvocidBetween(Integer value1, Integer value2) {
            addCriterion("nkvocid between", value1, value2, "nkvocid");
            return (Criteria) this;
        }

        public Criteria andNkvocidNotBetween(Integer value1, Integer value2) {
            addCriterion("nkvocid not between", value1, value2, "nkvocid");
            return (Criteria) this;
        }

        public Criteria andNkpm25idIsNull() {
            addCriterion("nkpm25id is null");
            return (Criteria) this;
        }

        public Criteria andNkpm25idIsNotNull() {
            addCriterion("nkpm25id is not null");
            return (Criteria) this;
        }

        public Criteria andNkpm25idEqualTo(Integer value) {
            addCriterion("nkpm25id =", value, "nkpm25id");
            return (Criteria) this;
        }

        public Criteria andNkpm25idNotEqualTo(Integer value) {
            addCriterion("nkpm25id <>", value, "nkpm25id");
            return (Criteria) this;
        }

        public Criteria andNkpm25idGreaterThan(Integer value) {
            addCriterion("nkpm25id >", value, "nkpm25id");
            return (Criteria) this;
        }

        public Criteria andNkpm25idGreaterThanOrEqualTo(Integer value) {
            addCriterion("nkpm25id >=", value, "nkpm25id");
            return (Criteria) this;
        }

        public Criteria andNkpm25idLessThan(Integer value) {
            addCriterion("nkpm25id <", value, "nkpm25id");
            return (Criteria) this;
        }

        public Criteria andNkpm25idLessThanOrEqualTo(Integer value) {
            addCriterion("nkpm25id <=", value, "nkpm25id");
            return (Criteria) this;
        }

        public Criteria andNkpm25idIn(List<Integer> values) {
            addCriterion("nkpm25id in", values, "nkpm25id");
            return (Criteria) this;
        }

        public Criteria andNkpm25idNotIn(List<Integer> values) {
            addCriterion("nkpm25id not in", values, "nkpm25id");
            return (Criteria) this;
        }

        public Criteria andNkpm25idBetween(Integer value1, Integer value2) {
            addCriterion("nkpm25id between", value1, value2, "nkpm25id");
            return (Criteria) this;
        }

        public Criteria andNkpm25idNotBetween(Integer value1, Integer value2) {
            addCriterion("nkpm25id not between", value1, value2, "nkpm25id");
            return (Criteria) this;
        }

        public Criteria andEcIsNull() {
            addCriterion("ec is null");
            return (Criteria) this;
        }

        public Criteria andEcIsNotNull() {
            addCriterion("ec is not null");
            return (Criteria) this;
        }

        public Criteria andEcEqualTo(Double value) {
            addCriterion("ec =", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcNotEqualTo(Double value) {
            addCriterion("ec <>", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcGreaterThan(Double value) {
            addCriterion("ec >", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcGreaterThanOrEqualTo(Double value) {
            addCriterion("ec >=", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcLessThan(Double value) {
            addCriterion("ec <", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcLessThanOrEqualTo(Double value) {
            addCriterion("ec <=", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcIn(List<Double> values) {
            addCriterion("ec in", values, "ec");
            return (Criteria) this;
        }

        public Criteria andEcNotIn(List<Double> values) {
            addCriterion("ec not in", values, "ec");
            return (Criteria) this;
        }

        public Criteria andEcBetween(Double value1, Double value2) {
            addCriterion("ec between", value1, value2, "ec");
            return (Criteria) this;
        }

        public Criteria andEcNotBetween(Double value1, Double value2) {
            addCriterion("ec not between", value1, value2, "ec");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andNoxRealIsNull() {
            addCriterion("nox_real is null");
            return (Criteria) this;
        }

        public Criteria andNoxRealIsNotNull() {
            addCriterion("nox_real is not null");
            return (Criteria) this;
        }

        public Criteria andNoxRealEqualTo(Double value) {
            addCriterion("nox_real =", value, "noxReal");
            return (Criteria) this;
        }

        public Criteria andNoxRealNotEqualTo(Double value) {
            addCriterion("nox_real <>", value, "noxReal");
            return (Criteria) this;
        }

        public Criteria andNoxRealGreaterThan(Double value) {
            addCriterion("nox_real >", value, "noxReal");
            return (Criteria) this;
        }

        public Criteria andNoxRealGreaterThanOrEqualTo(Double value) {
            addCriterion("nox_real >=", value, "noxReal");
            return (Criteria) this;
        }

        public Criteria andNoxRealLessThan(Double value) {
            addCriterion("nox_real <", value, "noxReal");
            return (Criteria) this;
        }

        public Criteria andNoxRealLessThanOrEqualTo(Double value) {
            addCriterion("nox_real <=", value, "noxReal");
            return (Criteria) this;
        }

        public Criteria andNoxRealIn(List<Double> values) {
            addCriterion("nox_real in", values, "noxReal");
            return (Criteria) this;
        }

        public Criteria andNoxRealNotIn(List<Double> values) {
            addCriterion("nox_real not in", values, "noxReal");
            return (Criteria) this;
        }

        public Criteria andNoxRealBetween(Double value1, Double value2) {
            addCriterion("nox_real between", value1, value2, "noxReal");
            return (Criteria) this;
        }

        public Criteria andNoxRealNotBetween(Double value1, Double value2) {
            addCriterion("nox_real not between", value1, value2, "noxReal");
            return (Criteria) this;
        }

        public Criteria andSo2RealIsNull() {
            addCriterion("so2_real is null");
            return (Criteria) this;
        }

        public Criteria andSo2RealIsNotNull() {
            addCriterion("so2_real is not null");
            return (Criteria) this;
        }

        public Criteria andSo2RealEqualTo(Double value) {
            addCriterion("so2_real =", value, "so2Real");
            return (Criteria) this;
        }

        public Criteria andSo2RealNotEqualTo(Double value) {
            addCriterion("so2_real <>", value, "so2Real");
            return (Criteria) this;
        }

        public Criteria andSo2RealGreaterThan(Double value) {
            addCriterion("so2_real >", value, "so2Real");
            return (Criteria) this;
        }

        public Criteria andSo2RealGreaterThanOrEqualTo(Double value) {
            addCriterion("so2_real >=", value, "so2Real");
            return (Criteria) this;
        }

        public Criteria andSo2RealLessThan(Double value) {
            addCriterion("so2_real <", value, "so2Real");
            return (Criteria) this;
        }

        public Criteria andSo2RealLessThanOrEqualTo(Double value) {
            addCriterion("so2_real <=", value, "so2Real");
            return (Criteria) this;
        }

        public Criteria andSo2RealIn(List<Double> values) {
            addCriterion("so2_real in", values, "so2Real");
            return (Criteria) this;
        }

        public Criteria andSo2RealNotIn(List<Double> values) {
            addCriterion("so2_real not in", values, "so2Real");
            return (Criteria) this;
        }

        public Criteria andSo2RealBetween(Double value1, Double value2) {
            addCriterion("so2_real between", value1, value2, "so2Real");
            return (Criteria) this;
        }

        public Criteria andSo2RealNotBetween(Double value1, Double value2) {
            addCriterion("so2_real not between", value1, value2, "so2Real");
            return (Criteria) this;
        }

        public Criteria andNh3RealIsNull() {
            addCriterion("nh3_real is null");
            return (Criteria) this;
        }

        public Criteria andNh3RealIsNotNull() {
            addCriterion("nh3_real is not null");
            return (Criteria) this;
        }

        public Criteria andNh3RealEqualTo(Double value) {
            addCriterion("nh3_real =", value, "nh3Real");
            return (Criteria) this;
        }

        public Criteria andNh3RealNotEqualTo(Double value) {
            addCriterion("nh3_real <>", value, "nh3Real");
            return (Criteria) this;
        }

        public Criteria andNh3RealGreaterThan(Double value) {
            addCriterion("nh3_real >", value, "nh3Real");
            return (Criteria) this;
        }

        public Criteria andNh3RealGreaterThanOrEqualTo(Double value) {
            addCriterion("nh3_real >=", value, "nh3Real");
            return (Criteria) this;
        }

        public Criteria andNh3RealLessThan(Double value) {
            addCriterion("nh3_real <", value, "nh3Real");
            return (Criteria) this;
        }

        public Criteria andNh3RealLessThanOrEqualTo(Double value) {
            addCriterion("nh3_real <=", value, "nh3Real");
            return (Criteria) this;
        }

        public Criteria andNh3RealIn(List<Double> values) {
            addCriterion("nh3_real in", values, "nh3Real");
            return (Criteria) this;
        }

        public Criteria andNh3RealNotIn(List<Double> values) {
            addCriterion("nh3_real not in", values, "nh3Real");
            return (Criteria) this;
        }

        public Criteria andNh3RealBetween(Double value1, Double value2) {
            addCriterion("nh3_real between", value1, value2, "nh3Real");
            return (Criteria) this;
        }

        public Criteria andNh3RealNotBetween(Double value1, Double value2) {
            addCriterion("nh3_real not between", value1, value2, "nh3Real");
            return (Criteria) this;
        }

        public Criteria andVocsRealIsNull() {
            addCriterion("vocs_real is null");
            return (Criteria) this;
        }

        public Criteria andVocsRealIsNotNull() {
            addCriterion("vocs_real is not null");
            return (Criteria) this;
        }

        public Criteria andVocsRealEqualTo(Double value) {
            addCriterion("vocs_real =", value, "vocsReal");
            return (Criteria) this;
        }

        public Criteria andVocsRealNotEqualTo(Double value) {
            addCriterion("vocs_real <>", value, "vocsReal");
            return (Criteria) this;
        }

        public Criteria andVocsRealGreaterThan(Double value) {
            addCriterion("vocs_real >", value, "vocsReal");
            return (Criteria) this;
        }

        public Criteria andVocsRealGreaterThanOrEqualTo(Double value) {
            addCriterion("vocs_real >=", value, "vocsReal");
            return (Criteria) this;
        }

        public Criteria andVocsRealLessThan(Double value) {
            addCriterion("vocs_real <", value, "vocsReal");
            return (Criteria) this;
        }

        public Criteria andVocsRealLessThanOrEqualTo(Double value) {
            addCriterion("vocs_real <=", value, "vocsReal");
            return (Criteria) this;
        }

        public Criteria andVocsRealIn(List<Double> values) {
            addCriterion("vocs_real in", values, "vocsReal");
            return (Criteria) this;
        }

        public Criteria andVocsRealNotIn(List<Double> values) {
            addCriterion("vocs_real not in", values, "vocsReal");
            return (Criteria) this;
        }

        public Criteria andVocsRealBetween(Double value1, Double value2) {
            addCriterion("vocs_real between", value1, value2, "vocsReal");
            return (Criteria) this;
        }

        public Criteria andVocsRealNotBetween(Double value1, Double value2) {
            addCriterion("vocs_real not between", value1, value2, "vocsReal");
            return (Criteria) this;
        }

        public Criteria andCoRealIsNull() {
            addCriterion("co_real is null");
            return (Criteria) this;
        }

        public Criteria andCoRealIsNotNull() {
            addCriterion("co_real is not null");
            return (Criteria) this;
        }

        public Criteria andCoRealEqualTo(Double value) {
            addCriterion("co_real =", value, "coReal");
            return (Criteria) this;
        }

        public Criteria andCoRealNotEqualTo(Double value) {
            addCriterion("co_real <>", value, "coReal");
            return (Criteria) this;
        }

        public Criteria andCoRealGreaterThan(Double value) {
            addCriterion("co_real >", value, "coReal");
            return (Criteria) this;
        }

        public Criteria andCoRealGreaterThanOrEqualTo(Double value) {
            addCriterion("co_real >=", value, "coReal");
            return (Criteria) this;
        }

        public Criteria andCoRealLessThan(Double value) {
            addCriterion("co_real <", value, "coReal");
            return (Criteria) this;
        }

        public Criteria andCoRealLessThanOrEqualTo(Double value) {
            addCriterion("co_real <=", value, "coReal");
            return (Criteria) this;
        }

        public Criteria andCoRealIn(List<Double> values) {
            addCriterion("co_real in", values, "coReal");
            return (Criteria) this;
        }

        public Criteria andCoRealNotIn(List<Double> values) {
            addCriterion("co_real not in", values, "coReal");
            return (Criteria) this;
        }

        public Criteria andCoRealBetween(Double value1, Double value2) {
            addCriterion("co_real between", value1, value2, "coReal");
            return (Criteria) this;
        }

        public Criteria andCoRealNotBetween(Double value1, Double value2) {
            addCriterion("co_real not between", value1, value2, "coReal");
            return (Criteria) this;
        }

        public Criteria andPm10RealIsNull() {
            addCriterion("pm10_real is null");
            return (Criteria) this;
        }

        public Criteria andPm10RealIsNotNull() {
            addCriterion("pm10_real is not null");
            return (Criteria) this;
        }

        public Criteria andPm10RealEqualTo(Double value) {
            addCriterion("pm10_real =", value, "pm10Real");
            return (Criteria) this;
        }

        public Criteria andPm10RealNotEqualTo(Double value) {
            addCriterion("pm10_real <>", value, "pm10Real");
            return (Criteria) this;
        }

        public Criteria andPm10RealGreaterThan(Double value) {
            addCriterion("pm10_real >", value, "pm10Real");
            return (Criteria) this;
        }

        public Criteria andPm10RealGreaterThanOrEqualTo(Double value) {
            addCriterion("pm10_real >=", value, "pm10Real");
            return (Criteria) this;
        }

        public Criteria andPm10RealLessThan(Double value) {
            addCriterion("pm10_real <", value, "pm10Real");
            return (Criteria) this;
        }

        public Criteria andPm10RealLessThanOrEqualTo(Double value) {
            addCriterion("pm10_real <=", value, "pm10Real");
            return (Criteria) this;
        }

        public Criteria andPm10RealIn(List<Double> values) {
            addCriterion("pm10_real in", values, "pm10Real");
            return (Criteria) this;
        }

        public Criteria andPm10RealNotIn(List<Double> values) {
            addCriterion("pm10_real not in", values, "pm10Real");
            return (Criteria) this;
        }

        public Criteria andPm10RealBetween(Double value1, Double value2) {
            addCriterion("pm10_real between", value1, value2, "pm10Real");
            return (Criteria) this;
        }

        public Criteria andPm10RealNotBetween(Double value1, Double value2) {
            addCriterion("pm10_real not between", value1, value2, "pm10Real");
            return (Criteria) this;
        }

        public Criteria andPm25RealIsNull() {
            addCriterion("pm25_real is null");
            return (Criteria) this;
        }

        public Criteria andPm25RealIsNotNull() {
            addCriterion("pm25_real is not null");
            return (Criteria) this;
        }

        public Criteria andPm25RealEqualTo(Double value) {
            addCriterion("pm25_real =", value, "pm25Real");
            return (Criteria) this;
        }

        public Criteria andPm25RealNotEqualTo(Double value) {
            addCriterion("pm25_real <>", value, "pm25Real");
            return (Criteria) this;
        }

        public Criteria andPm25RealGreaterThan(Double value) {
            addCriterion("pm25_real >", value, "pm25Real");
            return (Criteria) this;
        }

        public Criteria andPm25RealGreaterThanOrEqualTo(Double value) {
            addCriterion("pm25_real >=", value, "pm25Real");
            return (Criteria) this;
        }

        public Criteria andPm25RealLessThan(Double value) {
            addCriterion("pm25_real <", value, "pm25Real");
            return (Criteria) this;
        }

        public Criteria andPm25RealLessThanOrEqualTo(Double value) {
            addCriterion("pm25_real <=", value, "pm25Real");
            return (Criteria) this;
        }

        public Criteria andPm25RealIn(List<Double> values) {
            addCriterion("pm25_real in", values, "pm25Real");
            return (Criteria) this;
        }

        public Criteria andPm25RealNotIn(List<Double> values) {
            addCriterion("pm25_real not in", values, "pm25Real");
            return (Criteria) this;
        }

        public Criteria andPm25RealBetween(Double value1, Double value2) {
            addCriterion("pm25_real between", value1, value2, "pm25Real");
            return (Criteria) this;
        }

        public Criteria andPm25RealNotBetween(Double value1, Double value2) {
            addCriterion("pm25_real not between", value1, value2, "pm25Real");
            return (Criteria) this;
        }

        public Criteria andBcRealIsNull() {
            addCriterion("bc_real is null");
            return (Criteria) this;
        }

        public Criteria andBcRealIsNotNull() {
            addCriterion("bc_real is not null");
            return (Criteria) this;
        }

        public Criteria andBcRealEqualTo(Double value) {
            addCriterion("bc_real =", value, "bcReal");
            return (Criteria) this;
        }

        public Criteria andBcRealNotEqualTo(Double value) {
            addCriterion("bc_real <>", value, "bcReal");
            return (Criteria) this;
        }

        public Criteria andBcRealGreaterThan(Double value) {
            addCriterion("bc_real >", value, "bcReal");
            return (Criteria) this;
        }

        public Criteria andBcRealGreaterThanOrEqualTo(Double value) {
            addCriterion("bc_real >=", value, "bcReal");
            return (Criteria) this;
        }

        public Criteria andBcRealLessThan(Double value) {
            addCriterion("bc_real <", value, "bcReal");
            return (Criteria) this;
        }

        public Criteria andBcRealLessThanOrEqualTo(Double value) {
            addCriterion("bc_real <=", value, "bcReal");
            return (Criteria) this;
        }

        public Criteria andBcRealIn(List<Double> values) {
            addCriterion("bc_real in", values, "bcReal");
            return (Criteria) this;
        }

        public Criteria andBcRealNotIn(List<Double> values) {
            addCriterion("bc_real not in", values, "bcReal");
            return (Criteria) this;
        }

        public Criteria andBcRealBetween(Double value1, Double value2) {
            addCriterion("bc_real between", value1, value2, "bcReal");
            return (Criteria) this;
        }

        public Criteria andBcRealNotBetween(Double value1, Double value2) {
            addCriterion("bc_real not between", value1, value2, "bcReal");
            return (Criteria) this;
        }

        public Criteria andOcRealIsNull() {
            addCriterion("oc_real is null");
            return (Criteria) this;
        }

        public Criteria andOcRealIsNotNull() {
            addCriterion("oc_real is not null");
            return (Criteria) this;
        }

        public Criteria andOcRealEqualTo(Double value) {
            addCriterion("oc_real =", value, "ocReal");
            return (Criteria) this;
        }

        public Criteria andOcRealNotEqualTo(Double value) {
            addCriterion("oc_real <>", value, "ocReal");
            return (Criteria) this;
        }

        public Criteria andOcRealGreaterThan(Double value) {
            addCriterion("oc_real >", value, "ocReal");
            return (Criteria) this;
        }

        public Criteria andOcRealGreaterThanOrEqualTo(Double value) {
            addCriterion("oc_real >=", value, "ocReal");
            return (Criteria) this;
        }

        public Criteria andOcRealLessThan(Double value) {
            addCriterion("oc_real <", value, "ocReal");
            return (Criteria) this;
        }

        public Criteria andOcRealLessThanOrEqualTo(Double value) {
            addCriterion("oc_real <=", value, "ocReal");
            return (Criteria) this;
        }

        public Criteria andOcRealIn(List<Double> values) {
            addCriterion("oc_real in", values, "ocReal");
            return (Criteria) this;
        }

        public Criteria andOcRealNotIn(List<Double> values) {
            addCriterion("oc_real not in", values, "ocReal");
            return (Criteria) this;
        }

        public Criteria andOcRealBetween(Double value1, Double value2) {
            addCriterion("oc_real between", value1, value2, "ocReal");
            return (Criteria) this;
        }

        public Criteria andOcRealNotBetween(Double value1, Double value2) {
            addCriterion("oc_real not between", value1, value2, "ocReal");
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

        public Criteria andFlagEqualTo(Boolean value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Boolean value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Boolean value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Boolean value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Boolean> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Boolean> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("flag not between", value1, value2, "flag");
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