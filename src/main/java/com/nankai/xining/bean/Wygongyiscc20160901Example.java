package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class Wygongyiscc20160901Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Wygongyiscc20160901Example() {
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

        public Criteria andTjSccIsNull() {
            addCriterion("TJ_SCC is null");
            return (Criteria) this;
        }

        public Criteria andTjSccIsNotNull() {
            addCriterion("TJ_SCC is not null");
            return (Criteria) this;
        }

        public Criteria andTjSccEqualTo(String value) {
            addCriterion("TJ_SCC =", value, "tjScc");
            return (Criteria) this;
        }

        public Criteria andTjSccNotEqualTo(String value) {
            addCriterion("TJ_SCC <>", value, "tjScc");
            return (Criteria) this;
        }

        public Criteria andTjSccGreaterThan(String value) {
            addCriterion("TJ_SCC >", value, "tjScc");
            return (Criteria) this;
        }

        public Criteria andTjSccGreaterThanOrEqualTo(String value) {
            addCriterion("TJ_SCC >=", value, "tjScc");
            return (Criteria) this;
        }

        public Criteria andTjSccLessThan(String value) {
            addCriterion("TJ_SCC <", value, "tjScc");
            return (Criteria) this;
        }

        public Criteria andTjSccLessThanOrEqualTo(String value) {
            addCriterion("TJ_SCC <=", value, "tjScc");
            return (Criteria) this;
        }

        public Criteria andTjSccLike(String value) {
            addCriterion("TJ_SCC like", value, "tjScc");
            return (Criteria) this;
        }

        public Criteria andTjSccNotLike(String value) {
            addCriterion("TJ_SCC not like", value, "tjScc");
            return (Criteria) this;
        }

        public Criteria andTjSccIn(List<String> values) {
            addCriterion("TJ_SCC in", values, "tjScc");
            return (Criteria) this;
        }

        public Criteria andTjSccNotIn(List<String> values) {
            addCriterion("TJ_SCC not in", values, "tjScc");
            return (Criteria) this;
        }

        public Criteria andTjSccBetween(String value1, String value2) {
            addCriterion("TJ_SCC between", value1, value2, "tjScc");
            return (Criteria) this;
        }

        public Criteria andTjSccNotBetween(String value1, String value2) {
            addCriterion("TJ_SCC not between", value1, value2, "tjScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccepaSccIsNull() {
            addCriterion("EPA-SCCEPA-SCC is null");
            return (Criteria) this;
        }

        public Criteria andEpaSccepaSccIsNotNull() {
            addCriterion("EPA-SCCEPA-SCC is not null");
            return (Criteria) this;
        }

        public Criteria andEpaSccepaSccEqualTo(String value) {
            addCriterion("EPA-SCCEPA-SCC =", value, "epaSccepaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccepaSccNotEqualTo(String value) {
            addCriterion("EPA-SCCEPA-SCC <>", value, "epaSccepaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccepaSccGreaterThan(String value) {
            addCriterion("EPA-SCCEPA-SCC >", value, "epaSccepaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccepaSccGreaterThanOrEqualTo(String value) {
            addCriterion("EPA-SCCEPA-SCC >=", value, "epaSccepaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccepaSccLessThan(String value) {
            addCriterion("EPA-SCCEPA-SCC <", value, "epaSccepaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccepaSccLessThanOrEqualTo(String value) {
            addCriterion("EPA-SCCEPA-SCC <=", value, "epaSccepaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccepaSccLike(String value) {
            addCriterion("EPA-SCCEPA-SCC like", value, "epaSccepaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccepaSccNotLike(String value) {
            addCriterion("EPA-SCCEPA-SCC not like", value, "epaSccepaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccepaSccIn(List<String> values) {
            addCriterion("EPA-SCCEPA-SCC in", values, "epaSccepaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccepaSccNotIn(List<String> values) {
            addCriterion("EPA-SCCEPA-SCC not in", values, "epaSccepaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccepaSccBetween(String value1, String value2) {
            addCriterion("EPA-SCCEPA-SCC between", value1, value2, "epaSccepaScc");
            return (Criteria) this;
        }

        public Criteria andEpaSccepaSccNotBetween(String value1, String value2) {
            addCriterion("EPA-SCCEPA-SCC not between", value1, value2, "epaSccepaScc");
            return (Criteria) this;
        }

        public Criteria andL2nameIsNull() {
            addCriterion("L2name is null");
            return (Criteria) this;
        }

        public Criteria andL2nameIsNotNull() {
            addCriterion("L2name is not null");
            return (Criteria) this;
        }

        public Criteria andL2nameEqualTo(String value) {
            addCriterion("L2name =", value, "l2name");
            return (Criteria) this;
        }

        public Criteria andL2nameNotEqualTo(String value) {
            addCriterion("L2name <>", value, "l2name");
            return (Criteria) this;
        }

        public Criteria andL2nameGreaterThan(String value) {
            addCriterion("L2name >", value, "l2name");
            return (Criteria) this;
        }

        public Criteria andL2nameGreaterThanOrEqualTo(String value) {
            addCriterion("L2name >=", value, "l2name");
            return (Criteria) this;
        }

        public Criteria andL2nameLessThan(String value) {
            addCriterion("L2name <", value, "l2name");
            return (Criteria) this;
        }

        public Criteria andL2nameLessThanOrEqualTo(String value) {
            addCriterion("L2name <=", value, "l2name");
            return (Criteria) this;
        }

        public Criteria andL2nameLike(String value) {
            addCriterion("L2name like", value, "l2name");
            return (Criteria) this;
        }

        public Criteria andL2nameNotLike(String value) {
            addCriterion("L2name not like", value, "l2name");
            return (Criteria) this;
        }

        public Criteria andL2nameIn(List<String> values) {
            addCriterion("L2name in", values, "l2name");
            return (Criteria) this;
        }

        public Criteria andL2nameNotIn(List<String> values) {
            addCriterion("L2name not in", values, "l2name");
            return (Criteria) this;
        }

        public Criteria andL2nameBetween(String value1, String value2) {
            addCriterion("L2name between", value1, value2, "l2name");
            return (Criteria) this;
        }

        public Criteria andL2nameNotBetween(String value1, String value2) {
            addCriterion("L2name not between", value1, value2, "l2name");
            return (Criteria) this;
        }

        public Criteria andL3nameIsNull() {
            addCriterion("L3name is null");
            return (Criteria) this;
        }

        public Criteria andL3nameIsNotNull() {
            addCriterion("L3name is not null");
            return (Criteria) this;
        }

        public Criteria andL3nameEqualTo(String value) {
            addCriterion("L3name =", value, "l3name");
            return (Criteria) this;
        }

        public Criteria andL3nameNotEqualTo(String value) {
            addCriterion("L3name <>", value, "l3name");
            return (Criteria) this;
        }

        public Criteria andL3nameGreaterThan(String value) {
            addCriterion("L3name >", value, "l3name");
            return (Criteria) this;
        }

        public Criteria andL3nameGreaterThanOrEqualTo(String value) {
            addCriterion("L3name >=", value, "l3name");
            return (Criteria) this;
        }

        public Criteria andL3nameLessThan(String value) {
            addCriterion("L3name <", value, "l3name");
            return (Criteria) this;
        }

        public Criteria andL3nameLessThanOrEqualTo(String value) {
            addCriterion("L3name <=", value, "l3name");
            return (Criteria) this;
        }

        public Criteria andL3nameLike(String value) {
            addCriterion("L3name like", value, "l3name");
            return (Criteria) this;
        }

        public Criteria andL3nameNotLike(String value) {
            addCriterion("L3name not like", value, "l3name");
            return (Criteria) this;
        }

        public Criteria andL3nameIn(List<String> values) {
            addCriterion("L3name in", values, "l3name");
            return (Criteria) this;
        }

        public Criteria andL3nameNotIn(List<String> values) {
            addCriterion("L3name not in", values, "l3name");
            return (Criteria) this;
        }

        public Criteria andL3nameBetween(String value1, String value2) {
            addCriterion("L3name between", value1, value2, "l3name");
            return (Criteria) this;
        }

        public Criteria andL3nameNotBetween(String value1, String value2) {
            addCriterion("L3name not between", value1, value2, "l3name");
            return (Criteria) this;
        }

        public Criteria andL4nameIsNull() {
            addCriterion("L4name is null");
            return (Criteria) this;
        }

        public Criteria andL4nameIsNotNull() {
            addCriterion("L4name is not null");
            return (Criteria) this;
        }

        public Criteria andL4nameEqualTo(String value) {
            addCriterion("L4name =", value, "l4name");
            return (Criteria) this;
        }

        public Criteria andL4nameNotEqualTo(String value) {
            addCriterion("L4name <>", value, "l4name");
            return (Criteria) this;
        }

        public Criteria andL4nameGreaterThan(String value) {
            addCriterion("L4name >", value, "l4name");
            return (Criteria) this;
        }

        public Criteria andL4nameGreaterThanOrEqualTo(String value) {
            addCriterion("L4name >=", value, "l4name");
            return (Criteria) this;
        }

        public Criteria andL4nameLessThan(String value) {
            addCriterion("L4name <", value, "l4name");
            return (Criteria) this;
        }

        public Criteria andL4nameLessThanOrEqualTo(String value) {
            addCriterion("L4name <=", value, "l4name");
            return (Criteria) this;
        }

        public Criteria andL4nameLike(String value) {
            addCriterion("L4name like", value, "l4name");
            return (Criteria) this;
        }

        public Criteria andL4nameNotLike(String value) {
            addCriterion("L4name not like", value, "l4name");
            return (Criteria) this;
        }

        public Criteria andL4nameIn(List<String> values) {
            addCriterion("L4name in", values, "l4name");
            return (Criteria) this;
        }

        public Criteria andL4nameNotIn(List<String> values) {
            addCriterion("L4name not in", values, "l4name");
            return (Criteria) this;
        }

        public Criteria andL4nameBetween(String value1, String value2) {
            addCriterion("L4name between", value1, value2, "l4name");
            return (Criteria) this;
        }

        public Criteria andL4nameNotBetween(String value1, String value2) {
            addCriterion("L4name not between", value1, value2, "l4name");
            return (Criteria) this;
        }

        public Criteria andCoIsNull() {
            addCriterion("CO is null");
            return (Criteria) this;
        }

        public Criteria andCoIsNotNull() {
            addCriterion("CO is not null");
            return (Criteria) this;
        }

        public Criteria andCoEqualTo(Double value) {
            addCriterion("CO =", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoNotEqualTo(Double value) {
            addCriterion("CO <>", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoGreaterThan(Double value) {
            addCriterion("CO >", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoGreaterThanOrEqualTo(Double value) {
            addCriterion("CO >=", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoLessThan(Double value) {
            addCriterion("CO <", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoLessThanOrEqualTo(Double value) {
            addCriterion("CO <=", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoIn(List<Double> values) {
            addCriterion("CO in", values, "co");
            return (Criteria) this;
        }

        public Criteria andCoNotIn(List<Double> values) {
            addCriterion("CO not in", values, "co");
            return (Criteria) this;
        }

        public Criteria andCoBetween(Double value1, Double value2) {
            addCriterion("CO between", value1, value2, "co");
            return (Criteria) this;
        }

        public Criteria andCoNotBetween(Double value1, Double value2) {
            addCriterion("CO not between", value1, value2, "co");
            return (Criteria) this;
        }

        public Criteria andNoxIsNull() {
            addCriterion("NOX is null");
            return (Criteria) this;
        }

        public Criteria andNoxIsNotNull() {
            addCriterion("NOX is not null");
            return (Criteria) this;
        }

        public Criteria andNoxEqualTo(Double value) {
            addCriterion("NOX =", value, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxNotEqualTo(Double value) {
            addCriterion("NOX <>", value, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxGreaterThan(Double value) {
            addCriterion("NOX >", value, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxGreaterThanOrEqualTo(Double value) {
            addCriterion("NOX >=", value, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxLessThan(Double value) {
            addCriterion("NOX <", value, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxLessThanOrEqualTo(Double value) {
            addCriterion("NOX <=", value, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxIn(List<Double> values) {
            addCriterion("NOX in", values, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxNotIn(List<Double> values) {
            addCriterion("NOX not in", values, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxBetween(Double value1, Double value2) {
            addCriterion("NOX between", value1, value2, "nox");
            return (Criteria) this;
        }

        public Criteria andNoxNotBetween(Double value1, Double value2) {
            addCriterion("NOX not between", value1, value2, "nox");
            return (Criteria) this;
        }

        public Criteria andSo2IsNull() {
            addCriterion("SO2 is null");
            return (Criteria) this;
        }

        public Criteria andSo2IsNotNull() {
            addCriterion("SO2 is not null");
            return (Criteria) this;
        }

        public Criteria andSo2EqualTo(Double value) {
            addCriterion("SO2 =", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2NotEqualTo(Double value) {
            addCriterion("SO2 <>", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2GreaterThan(Double value) {
            addCriterion("SO2 >", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2GreaterThanOrEqualTo(Double value) {
            addCriterion("SO2 >=", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2LessThan(Double value) {
            addCriterion("SO2 <", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2LessThanOrEqualTo(Double value) {
            addCriterion("SO2 <=", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2In(List<Double> values) {
            addCriterion("SO2 in", values, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2NotIn(List<Double> values) {
            addCriterion("SO2 not in", values, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2Between(Double value1, Double value2) {
            addCriterion("SO2 between", value1, value2, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2NotBetween(Double value1, Double value2) {
            addCriterion("SO2 not between", value1, value2, "so2");
            return (Criteria) this;
        }

        public Criteria andNh3IsNull() {
            addCriterion("NH3 is null");
            return (Criteria) this;
        }

        public Criteria andNh3IsNotNull() {
            addCriterion("NH3 is not null");
            return (Criteria) this;
        }

        public Criteria andNh3EqualTo(Double value) {
            addCriterion("NH3 =", value, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3NotEqualTo(Double value) {
            addCriterion("NH3 <>", value, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3GreaterThan(Double value) {
            addCriterion("NH3 >", value, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3GreaterThanOrEqualTo(Double value) {
            addCriterion("NH3 >=", value, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3LessThan(Double value) {
            addCriterion("NH3 <", value, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3LessThanOrEqualTo(Double value) {
            addCriterion("NH3 <=", value, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3In(List<Double> values) {
            addCriterion("NH3 in", values, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3NotIn(List<Double> values) {
            addCriterion("NH3 not in", values, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3Between(Double value1, Double value2) {
            addCriterion("NH3 between", value1, value2, "nh3");
            return (Criteria) this;
        }

        public Criteria andNh3NotBetween(Double value1, Double value2) {
            addCriterion("NH3 not between", value1, value2, "nh3");
            return (Criteria) this;
        }

        public Criteria andVocsIsNull() {
            addCriterion("VOCS is null");
            return (Criteria) this;
        }

        public Criteria andVocsIsNotNull() {
            addCriterion("VOCS is not null");
            return (Criteria) this;
        }

        public Criteria andVocsEqualTo(Double value) {
            addCriterion("VOCS =", value, "vocs");
            return (Criteria) this;
        }

        public Criteria andVocsNotEqualTo(Double value) {
            addCriterion("VOCS <>", value, "vocs");
            return (Criteria) this;
        }

        public Criteria andVocsGreaterThan(Double value) {
            addCriterion("VOCS >", value, "vocs");
            return (Criteria) this;
        }

        public Criteria andVocsGreaterThanOrEqualTo(Double value) {
            addCriterion("VOCS >=", value, "vocs");
            return (Criteria) this;
        }

        public Criteria andVocsLessThan(Double value) {
            addCriterion("VOCS <", value, "vocs");
            return (Criteria) this;
        }

        public Criteria andVocsLessThanOrEqualTo(Double value) {
            addCriterion("VOCS <=", value, "vocs");
            return (Criteria) this;
        }

        public Criteria andVocsIn(List<Double> values) {
            addCriterion("VOCS in", values, "vocs");
            return (Criteria) this;
        }

        public Criteria andVocsNotIn(List<Double> values) {
            addCriterion("VOCS not in", values, "vocs");
            return (Criteria) this;
        }

        public Criteria andVocsBetween(Double value1, Double value2) {
            addCriterion("VOCS between", value1, value2, "vocs");
            return (Criteria) this;
        }

        public Criteria andVocsNotBetween(Double value1, Double value2) {
            addCriterion("VOCS not between", value1, value2, "vocs");
            return (Criteria) this;
        }

        public Criteria andPm25IsNull() {
            addCriterion("PM25 is null");
            return (Criteria) this;
        }

        public Criteria andPm25IsNotNull() {
            addCriterion("PM25 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25EqualTo(Double value) {
            addCriterion("PM25 =", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25NotEqualTo(Double value) {
            addCriterion("PM25 <>", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25GreaterThan(Double value) {
            addCriterion("PM25 >", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25GreaterThanOrEqualTo(Double value) {
            addCriterion("PM25 >=", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25LessThan(Double value) {
            addCriterion("PM25 <", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25LessThanOrEqualTo(Double value) {
            addCriterion("PM25 <=", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25In(List<Double> values) {
            addCriterion("PM25 in", values, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25NotIn(List<Double> values) {
            addCriterion("PM25 not in", values, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25Between(Double value1, Double value2) {
            addCriterion("PM25 between", value1, value2, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25NotBetween(Double value1, Double value2) {
            addCriterion("PM25 not between", value1, value2, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm10IsNull() {
            addCriterion("PM10 is null");
            return (Criteria) this;
        }

        public Criteria andPm10IsNotNull() {
            addCriterion("PM10 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10EqualTo(Double value) {
            addCriterion("PM10 =", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10NotEqualTo(Double value) {
            addCriterion("PM10 <>", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10GreaterThan(Double value) {
            addCriterion("PM10 >", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10GreaterThanOrEqualTo(Double value) {
            addCriterion("PM10 >=", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10LessThan(Double value) {
            addCriterion("PM10 <", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10LessThanOrEqualTo(Double value) {
            addCriterion("PM10 <=", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10In(List<Double> values) {
            addCriterion("PM10 in", values, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10NotIn(List<Double> values) {
            addCriterion("PM10 not in", values, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10Between(Double value1, Double value2) {
            addCriterion("PM10 between", value1, value2, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10NotBetween(Double value1, Double value2) {
            addCriterion("PM10 not between", value1, value2, "pm10");
            return (Criteria) this;
        }

        public Criteria andBcIsNull() {
            addCriterion("BC is null");
            return (Criteria) this;
        }

        public Criteria andBcIsNotNull() {
            addCriterion("BC is not null");
            return (Criteria) this;
        }

        public Criteria andBcEqualTo(Double value) {
            addCriterion("BC =", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcNotEqualTo(Double value) {
            addCriterion("BC <>", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcGreaterThan(Double value) {
            addCriterion("BC >", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcGreaterThanOrEqualTo(Double value) {
            addCriterion("BC >=", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcLessThan(Double value) {
            addCriterion("BC <", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcLessThanOrEqualTo(Double value) {
            addCriterion("BC <=", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcIn(List<Double> values) {
            addCriterion("BC in", values, "bc");
            return (Criteria) this;
        }

        public Criteria andBcNotIn(List<Double> values) {
            addCriterion("BC not in", values, "bc");
            return (Criteria) this;
        }

        public Criteria andBcBetween(Double value1, Double value2) {
            addCriterion("BC between", value1, value2, "bc");
            return (Criteria) this;
        }

        public Criteria andBcNotBetween(Double value1, Double value2) {
            addCriterion("BC not between", value1, value2, "bc");
            return (Criteria) this;
        }

        public Criteria andOcIsNull() {
            addCriterion("OC is null");
            return (Criteria) this;
        }

        public Criteria andOcIsNotNull() {
            addCriterion("OC is not null");
            return (Criteria) this;
        }

        public Criteria andOcEqualTo(Double value) {
            addCriterion("OC =", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcNotEqualTo(Double value) {
            addCriterion("OC <>", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcGreaterThan(Double value) {
            addCriterion("OC >", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcGreaterThanOrEqualTo(Double value) {
            addCriterion("OC >=", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcLessThan(Double value) {
            addCriterion("OC <", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcLessThanOrEqualTo(Double value) {
            addCriterion("OC <=", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcIn(List<Double> values) {
            addCriterion("OC in", values, "oc");
            return (Criteria) this;
        }

        public Criteria andOcNotIn(List<Double> values) {
            addCriterion("OC not in", values, "oc");
            return (Criteria) this;
        }

        public Criteria andOcBetween(Double value1, Double value2) {
            addCriterion("OC between", value1, value2, "oc");
            return (Criteria) this;
        }

        public Criteria andOcNotBetween(Double value1, Double value2) {
            addCriterion("OC not between", value1, value2, "oc");
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