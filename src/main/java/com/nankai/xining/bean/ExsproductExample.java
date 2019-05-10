package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class ExsproductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExsproductExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNkNoIsNull() {
            addCriterion("NK_NO is null");
            return (Criteria) this;
        }

        public Criteria andNkNoIsNotNull() {
            addCriterion("NK_NO is not null");
            return (Criteria) this;
        }

        public Criteria andNkNoEqualTo(Integer value) {
            addCriterion("NK_NO =", value, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoNotEqualTo(Integer value) {
            addCriterion("NK_NO <>", value, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoGreaterThan(Integer value) {
            addCriterion("NK_NO >", value, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("NK_NO >=", value, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoLessThan(Integer value) {
            addCriterion("NK_NO <", value, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoLessThanOrEqualTo(Integer value) {
            addCriterion("NK_NO <=", value, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoIn(List<Integer> values) {
            addCriterion("NK_NO in", values, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoNotIn(List<Integer> values) {
            addCriterion("NK_NO not in", values, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoBetween(Integer value1, Integer value2) {
            addCriterion("NK_NO between", value1, value2, "nkNo");
            return (Criteria) this;
        }

        public Criteria andNkNoNotBetween(Integer value1, Integer value2) {
            addCriterion("NK_NO not between", value1, value2, "nkNo");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTechIsNull() {
            addCriterion("TECH is null");
            return (Criteria) this;
        }

        public Criteria andTechIsNotNull() {
            addCriterion("TECH is not null");
            return (Criteria) this;
        }

        public Criteria andTechEqualTo(String value) {
            addCriterion("TECH =", value, "tech");
            return (Criteria) this;
        }

        public Criteria andTechNotEqualTo(String value) {
            addCriterion("TECH <>", value, "tech");
            return (Criteria) this;
        }

        public Criteria andTechGreaterThan(String value) {
            addCriterion("TECH >", value, "tech");
            return (Criteria) this;
        }

        public Criteria andTechGreaterThanOrEqualTo(String value) {
            addCriterion("TECH >=", value, "tech");
            return (Criteria) this;
        }

        public Criteria andTechLessThan(String value) {
            addCriterion("TECH <", value, "tech");
            return (Criteria) this;
        }

        public Criteria andTechLessThanOrEqualTo(String value) {
            addCriterion("TECH <=", value, "tech");
            return (Criteria) this;
        }

        public Criteria andTechLike(String value) {
            addCriterion("TECH like", value, "tech");
            return (Criteria) this;
        }

        public Criteria andTechNotLike(String value) {
            addCriterion("TECH not like", value, "tech");
            return (Criteria) this;
        }

        public Criteria andTechIn(List<String> values) {
            addCriterion("TECH in", values, "tech");
            return (Criteria) this;
        }

        public Criteria andTechNotIn(List<String> values) {
            addCriterion("TECH not in", values, "tech");
            return (Criteria) this;
        }

        public Criteria andTechBetween(String value1, String value2) {
            addCriterion("TECH between", value1, value2, "tech");
            return (Criteria) this;
        }

        public Criteria andTechNotBetween(String value1, String value2) {
            addCriterion("TECH not between", value1, value2, "tech");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("UNIT =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("UNIT <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("UNIT >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("UNIT <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("UNIT <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("UNIT like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("UNIT not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("UNIT in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("UNIT not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("UNIT between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("UNIT not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andOutputIsNull() {
            addCriterion("OUTPUT is null");
            return (Criteria) this;
        }

        public Criteria andOutputIsNotNull() {
            addCriterion("OUTPUT is not null");
            return (Criteria) this;
        }

        public Criteria andOutputEqualTo(Double value) {
            addCriterion("OUTPUT =", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputNotEqualTo(Double value) {
            addCriterion("OUTPUT <>", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputGreaterThan(Double value) {
            addCriterion("OUTPUT >", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputGreaterThanOrEqualTo(Double value) {
            addCriterion("OUTPUT >=", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputLessThan(Double value) {
            addCriterion("OUTPUT <", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputLessThanOrEqualTo(Double value) {
            addCriterion("OUTPUT <=", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputIn(List<Double> values) {
            addCriterion("OUTPUT in", values, "output");
            return (Criteria) this;
        }

        public Criteria andOutputNotIn(List<Double> values) {
            addCriterion("OUTPUT not in", values, "output");
            return (Criteria) this;
        }

        public Criteria andOutputBetween(Double value1, Double value2) {
            addCriterion("OUTPUT between", value1, value2, "output");
            return (Criteria) this;
        }

        public Criteria andOutputNotBetween(Double value1, Double value2) {
            addCriterion("OUTPUT not between", value1, value2, "output");
            return (Criteria) this;
        }

        public Criteria andExsIdIsNull() {
            addCriterion("EXS_ID is null");
            return (Criteria) this;
        }

        public Criteria andExsIdIsNotNull() {
            addCriterion("EXS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExsIdEqualTo(Integer value) {
            addCriterion("EXS_ID =", value, "exsId");
            return (Criteria) this;
        }

        public Criteria andExsIdNotEqualTo(Integer value) {
            addCriterion("EXS_ID <>", value, "exsId");
            return (Criteria) this;
        }

        public Criteria andExsIdGreaterThan(Integer value) {
            addCriterion("EXS_ID >", value, "exsId");
            return (Criteria) this;
        }

        public Criteria andExsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXS_ID >=", value, "exsId");
            return (Criteria) this;
        }

        public Criteria andExsIdLessThan(Integer value) {
            addCriterion("EXS_ID <", value, "exsId");
            return (Criteria) this;
        }

        public Criteria andExsIdLessThanOrEqualTo(Integer value) {
            addCriterion("EXS_ID <=", value, "exsId");
            return (Criteria) this;
        }

        public Criteria andExsIdIn(List<Integer> values) {
            addCriterion("EXS_ID in", values, "exsId");
            return (Criteria) this;
        }

        public Criteria andExsIdNotIn(List<Integer> values) {
            addCriterion("EXS_ID not in", values, "exsId");
            return (Criteria) this;
        }

        public Criteria andExsIdBetween(Integer value1, Integer value2) {
            addCriterion("EXS_ID between", value1, value2, "exsId");
            return (Criteria) this;
        }

        public Criteria andExsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EXS_ID not between", value1, value2, "exsId");
            return (Criteria) this;
        }

        public Criteria andScccodeIsNull() {
            addCriterion("SCCCODE is null");
            return (Criteria) this;
        }

        public Criteria andScccodeIsNotNull() {
            addCriterion("SCCCODE is not null");
            return (Criteria) this;
        }

        public Criteria andScccodeEqualTo(String value) {
            addCriterion("SCCCODE =", value, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeNotEqualTo(String value) {
            addCriterion("SCCCODE <>", value, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeGreaterThan(String value) {
            addCriterion("SCCCODE >", value, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeGreaterThanOrEqualTo(String value) {
            addCriterion("SCCCODE >=", value, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeLessThan(String value) {
            addCriterion("SCCCODE <", value, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeLessThanOrEqualTo(String value) {
            addCriterion("SCCCODE <=", value, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeLike(String value) {
            addCriterion("SCCCODE like", value, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeNotLike(String value) {
            addCriterion("SCCCODE not like", value, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeIn(List<String> values) {
            addCriterion("SCCCODE in", values, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeNotIn(List<String> values) {
            addCriterion("SCCCODE not in", values, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeBetween(String value1, String value2) {
            addCriterion("SCCCODE between", value1, value2, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeNotBetween(String value1, String value2) {
            addCriterion("SCCCODE not between", value1, value2, "scccode");
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

        public Criteria andVocIsNull() {
            addCriterion("VOC is null");
            return (Criteria) this;
        }

        public Criteria andVocIsNotNull() {
            addCriterion("VOC is not null");
            return (Criteria) this;
        }

        public Criteria andVocEqualTo(Double value) {
            addCriterion("VOC =", value, "voc");
            return (Criteria) this;
        }

        public Criteria andVocNotEqualTo(Double value) {
            addCriterion("VOC <>", value, "voc");
            return (Criteria) this;
        }

        public Criteria andVocGreaterThan(Double value) {
            addCriterion("VOC >", value, "voc");
            return (Criteria) this;
        }

        public Criteria andVocGreaterThanOrEqualTo(Double value) {
            addCriterion("VOC >=", value, "voc");
            return (Criteria) this;
        }

        public Criteria andVocLessThan(Double value) {
            addCriterion("VOC <", value, "voc");
            return (Criteria) this;
        }

        public Criteria andVocLessThanOrEqualTo(Double value) {
            addCriterion("VOC <=", value, "voc");
            return (Criteria) this;
        }

        public Criteria andVocIn(List<Double> values) {
            addCriterion("VOC in", values, "voc");
            return (Criteria) this;
        }

        public Criteria andVocNotIn(List<Double> values) {
            addCriterion("VOC not in", values, "voc");
            return (Criteria) this;
        }

        public Criteria andVocBetween(Double value1, Double value2) {
            addCriterion("VOC between", value1, value2, "voc");
            return (Criteria) this;
        }

        public Criteria andVocNotBetween(Double value1, Double value2) {
            addCriterion("VOC not between", value1, value2, "voc");
            return (Criteria) this;
        }

        public Criteria andPmIsNull() {
            addCriterion("PM is null");
            return (Criteria) this;
        }

        public Criteria andPmIsNotNull() {
            addCriterion("PM is not null");
            return (Criteria) this;
        }

        public Criteria andPmEqualTo(Double value) {
            addCriterion("PM =", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmNotEqualTo(Double value) {
            addCriterion("PM <>", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmGreaterThan(Double value) {
            addCriterion("PM >", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmGreaterThanOrEqualTo(Double value) {
            addCriterion("PM >=", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmLessThan(Double value) {
            addCriterion("PM <", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmLessThanOrEqualTo(Double value) {
            addCriterion("PM <=", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmIn(List<Double> values) {
            addCriterion("PM in", values, "pm");
            return (Criteria) this;
        }

        public Criteria andPmNotIn(List<Double> values) {
            addCriterion("PM not in", values, "pm");
            return (Criteria) this;
        }

        public Criteria andPmBetween(Double value1, Double value2) {
            addCriterion("PM between", value1, value2, "pm");
            return (Criteria) this;
        }

        public Criteria andPmNotBetween(Double value1, Double value2) {
            addCriterion("PM not between", value1, value2, "pm");
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

        public Criteria andExfUnitIsNull() {
            addCriterion("EXF_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andExfUnitIsNotNull() {
            addCriterion("EXF_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andExfUnitEqualTo(String value) {
            addCriterion("EXF_UNIT =", value, "exfUnit");
            return (Criteria) this;
        }

        public Criteria andExfUnitNotEqualTo(String value) {
            addCriterion("EXF_UNIT <>", value, "exfUnit");
            return (Criteria) this;
        }

        public Criteria andExfUnitGreaterThan(String value) {
            addCriterion("EXF_UNIT >", value, "exfUnit");
            return (Criteria) this;
        }

        public Criteria andExfUnitGreaterThanOrEqualTo(String value) {
            addCriterion("EXF_UNIT >=", value, "exfUnit");
            return (Criteria) this;
        }

        public Criteria andExfUnitLessThan(String value) {
            addCriterion("EXF_UNIT <", value, "exfUnit");
            return (Criteria) this;
        }

        public Criteria andExfUnitLessThanOrEqualTo(String value) {
            addCriterion("EXF_UNIT <=", value, "exfUnit");
            return (Criteria) this;
        }

        public Criteria andExfUnitLike(String value) {
            addCriterion("EXF_UNIT like", value, "exfUnit");
            return (Criteria) this;
        }

        public Criteria andExfUnitNotLike(String value) {
            addCriterion("EXF_UNIT not like", value, "exfUnit");
            return (Criteria) this;
        }

        public Criteria andExfUnitIn(List<String> values) {
            addCriterion("EXF_UNIT in", values, "exfUnit");
            return (Criteria) this;
        }

        public Criteria andExfUnitNotIn(List<String> values) {
            addCriterion("EXF_UNIT not in", values, "exfUnit");
            return (Criteria) this;
        }

        public Criteria andExfUnitBetween(String value1, String value2) {
            addCriterion("EXF_UNIT between", value1, value2, "exfUnit");
            return (Criteria) this;
        }

        public Criteria andExfUnitNotBetween(String value1, String value2) {
            addCriterion("EXF_UNIT not between", value1, value2, "exfUnit");
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