package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class XjtimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XjtimeExample() {
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

        public Criteria andScc2IsNull() {
            addCriterion("scc2 is null");
            return (Criteria) this;
        }

        public Criteria andScc2IsNotNull() {
            addCriterion("scc2 is not null");
            return (Criteria) this;
        }

        public Criteria andScc2EqualTo(String value) {
            addCriterion("scc2 =", value, "scc2");
            return (Criteria) this;
        }

        public Criteria andScc2NotEqualTo(String value) {
            addCriterion("scc2 <>", value, "scc2");
            return (Criteria) this;
        }

        public Criteria andScc2GreaterThan(String value) {
            addCriterion("scc2 >", value, "scc2");
            return (Criteria) this;
        }

        public Criteria andScc2GreaterThanOrEqualTo(String value) {
            addCriterion("scc2 >=", value, "scc2");
            return (Criteria) this;
        }

        public Criteria andScc2LessThan(String value) {
            addCriterion("scc2 <", value, "scc2");
            return (Criteria) this;
        }

        public Criteria andScc2LessThanOrEqualTo(String value) {
            addCriterion("scc2 <=", value, "scc2");
            return (Criteria) this;
        }

        public Criteria andScc2Like(String value) {
            addCriterion("scc2 like", value, "scc2");
            return (Criteria) this;
        }

        public Criteria andScc2NotLike(String value) {
            addCriterion("scc2 not like", value, "scc2");
            return (Criteria) this;
        }

        public Criteria andScc2In(List<String> values) {
            addCriterion("scc2 in", values, "scc2");
            return (Criteria) this;
        }

        public Criteria andScc2NotIn(List<String> values) {
            addCriterion("scc2 not in", values, "scc2");
            return (Criteria) this;
        }

        public Criteria andScc2Between(String value1, String value2) {
            addCriterion("scc2 between", value1, value2, "scc2");
            return (Criteria) this;
        }

        public Criteria andScc2NotBetween(String value1, String value2) {
            addCriterion("scc2 not between", value1, value2, "scc2");
            return (Criteria) this;
        }

        public Criteria andScc1IsNull() {
            addCriterion("scc1 is null");
            return (Criteria) this;
        }

        public Criteria andScc1IsNotNull() {
            addCriterion("scc1 is not null");
            return (Criteria) this;
        }

        public Criteria andScc1EqualTo(String value) {
            addCriterion("scc1 =", value, "scc1");
            return (Criteria) this;
        }

        public Criteria andScc1NotEqualTo(String value) {
            addCriterion("scc1 <>", value, "scc1");
            return (Criteria) this;
        }

        public Criteria andScc1GreaterThan(String value) {
            addCriterion("scc1 >", value, "scc1");
            return (Criteria) this;
        }

        public Criteria andScc1GreaterThanOrEqualTo(String value) {
            addCriterion("scc1 >=", value, "scc1");
            return (Criteria) this;
        }

        public Criteria andScc1LessThan(String value) {
            addCriterion("scc1 <", value, "scc1");
            return (Criteria) this;
        }

        public Criteria andScc1LessThanOrEqualTo(String value) {
            addCriterion("scc1 <=", value, "scc1");
            return (Criteria) this;
        }

        public Criteria andScc1Like(String value) {
            addCriterion("scc1 like", value, "scc1");
            return (Criteria) this;
        }

        public Criteria andScc1NotLike(String value) {
            addCriterion("scc1 not like", value, "scc1");
            return (Criteria) this;
        }

        public Criteria andScc1In(List<String> values) {
            addCriterion("scc1 in", values, "scc1");
            return (Criteria) this;
        }

        public Criteria andScc1NotIn(List<String> values) {
            addCriterion("scc1 not in", values, "scc1");
            return (Criteria) this;
        }

        public Criteria andScc1Between(String value1, String value2) {
            addCriterion("scc1 between", value1, value2, "scc1");
            return (Criteria) this;
        }

        public Criteria andScc1NotBetween(String value1, String value2) {
            addCriterion("scc1 not between", value1, value2, "scc1");
            return (Criteria) this;
        }

        public Criteria andScc2idIsNull() {
            addCriterion("scc2id is null");
            return (Criteria) this;
        }

        public Criteria andScc2idIsNotNull() {
            addCriterion("scc2id is not null");
            return (Criteria) this;
        }

        public Criteria andScc2idEqualTo(Integer value) {
            addCriterion("scc2id =", value, "scc2id");
            return (Criteria) this;
        }

        public Criteria andScc2idNotEqualTo(Integer value) {
            addCriterion("scc2id <>", value, "scc2id");
            return (Criteria) this;
        }

        public Criteria andScc2idGreaterThan(Integer value) {
            addCriterion("scc2id >", value, "scc2id");
            return (Criteria) this;
        }

        public Criteria andScc2idGreaterThanOrEqualTo(Integer value) {
            addCriterion("scc2id >=", value, "scc2id");
            return (Criteria) this;
        }

        public Criteria andScc2idLessThan(Integer value) {
            addCriterion("scc2id <", value, "scc2id");
            return (Criteria) this;
        }

        public Criteria andScc2idLessThanOrEqualTo(Integer value) {
            addCriterion("scc2id <=", value, "scc2id");
            return (Criteria) this;
        }

        public Criteria andScc2idIn(List<Integer> values) {
            addCriterion("scc2id in", values, "scc2id");
            return (Criteria) this;
        }

        public Criteria andScc2idNotIn(List<Integer> values) {
            addCriterion("scc2id not in", values, "scc2id");
            return (Criteria) this;
        }

        public Criteria andScc2idBetween(Integer value1, Integer value2) {
            addCriterion("scc2id between", value1, value2, "scc2id");
            return (Criteria) this;
        }

        public Criteria andScc2idNotBetween(Integer value1, Integer value2) {
            addCriterion("scc2id not between", value1, value2, "scc2id");
            return (Criteria) this;
        }

        public Criteria andJanuaryIsNull() {
            addCriterion("january is null");
            return (Criteria) this;
        }

        public Criteria andJanuaryIsNotNull() {
            addCriterion("january is not null");
            return (Criteria) this;
        }

        public Criteria andJanuaryEqualTo(Double value) {
            addCriterion("january =", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryNotEqualTo(Double value) {
            addCriterion("january <>", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryGreaterThan(Double value) {
            addCriterion("january >", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryGreaterThanOrEqualTo(Double value) {
            addCriterion("january >=", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryLessThan(Double value) {
            addCriterion("january <", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryLessThanOrEqualTo(Double value) {
            addCriterion("january <=", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryIn(List<Double> values) {
            addCriterion("january in", values, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryNotIn(List<Double> values) {
            addCriterion("january not in", values, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryBetween(Double value1, Double value2) {
            addCriterion("january between", value1, value2, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryNotBetween(Double value1, Double value2) {
            addCriterion("january not between", value1, value2, "january");
            return (Criteria) this;
        }

        public Criteria andFebruaryIsNull() {
            addCriterion("february is null");
            return (Criteria) this;
        }

        public Criteria andFebruaryIsNotNull() {
            addCriterion("february is not null");
            return (Criteria) this;
        }

        public Criteria andFebruaryEqualTo(Double value) {
            addCriterion("february =", value, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryNotEqualTo(Double value) {
            addCriterion("february <>", value, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryGreaterThan(Double value) {
            addCriterion("february >", value, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryGreaterThanOrEqualTo(Double value) {
            addCriterion("february >=", value, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryLessThan(Double value) {
            addCriterion("february <", value, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryLessThanOrEqualTo(Double value) {
            addCriterion("february <=", value, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryIn(List<Double> values) {
            addCriterion("february in", values, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryNotIn(List<Double> values) {
            addCriterion("february not in", values, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryBetween(Double value1, Double value2) {
            addCriterion("february between", value1, value2, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryNotBetween(Double value1, Double value2) {
            addCriterion("february not between", value1, value2, "february");
            return (Criteria) this;
        }

        public Criteria andMarchIsNull() {
            addCriterion("march is null");
            return (Criteria) this;
        }

        public Criteria andMarchIsNotNull() {
            addCriterion("march is not null");
            return (Criteria) this;
        }

        public Criteria andMarchEqualTo(Double value) {
            addCriterion("march =", value, "march");
            return (Criteria) this;
        }

        public Criteria andMarchNotEqualTo(Double value) {
            addCriterion("march <>", value, "march");
            return (Criteria) this;
        }

        public Criteria andMarchGreaterThan(Double value) {
            addCriterion("march >", value, "march");
            return (Criteria) this;
        }

        public Criteria andMarchGreaterThanOrEqualTo(Double value) {
            addCriterion("march >=", value, "march");
            return (Criteria) this;
        }

        public Criteria andMarchLessThan(Double value) {
            addCriterion("march <", value, "march");
            return (Criteria) this;
        }

        public Criteria andMarchLessThanOrEqualTo(Double value) {
            addCriterion("march <=", value, "march");
            return (Criteria) this;
        }

        public Criteria andMarchIn(List<Double> values) {
            addCriterion("march in", values, "march");
            return (Criteria) this;
        }

        public Criteria andMarchNotIn(List<Double> values) {
            addCriterion("march not in", values, "march");
            return (Criteria) this;
        }

        public Criteria andMarchBetween(Double value1, Double value2) {
            addCriterion("march between", value1, value2, "march");
            return (Criteria) this;
        }

        public Criteria andMarchNotBetween(Double value1, Double value2) {
            addCriterion("march not between", value1, value2, "march");
            return (Criteria) this;
        }

        public Criteria andAprilIsNull() {
            addCriterion("april is null");
            return (Criteria) this;
        }

        public Criteria andAprilIsNotNull() {
            addCriterion("april is not null");
            return (Criteria) this;
        }

        public Criteria andAprilEqualTo(Double value) {
            addCriterion("april =", value, "april");
            return (Criteria) this;
        }

        public Criteria andAprilNotEqualTo(Double value) {
            addCriterion("april <>", value, "april");
            return (Criteria) this;
        }

        public Criteria andAprilGreaterThan(Double value) {
            addCriterion("april >", value, "april");
            return (Criteria) this;
        }

        public Criteria andAprilGreaterThanOrEqualTo(Double value) {
            addCriterion("april >=", value, "april");
            return (Criteria) this;
        }

        public Criteria andAprilLessThan(Double value) {
            addCriterion("april <", value, "april");
            return (Criteria) this;
        }

        public Criteria andAprilLessThanOrEqualTo(Double value) {
            addCriterion("april <=", value, "april");
            return (Criteria) this;
        }

        public Criteria andAprilIn(List<Double> values) {
            addCriterion("april in", values, "april");
            return (Criteria) this;
        }

        public Criteria andAprilNotIn(List<Double> values) {
            addCriterion("april not in", values, "april");
            return (Criteria) this;
        }

        public Criteria andAprilBetween(Double value1, Double value2) {
            addCriterion("april between", value1, value2, "april");
            return (Criteria) this;
        }

        public Criteria andAprilNotBetween(Double value1, Double value2) {
            addCriterion("april not between", value1, value2, "april");
            return (Criteria) this;
        }

        public Criteria andMayIsNull() {
            addCriterion("may is null");
            return (Criteria) this;
        }

        public Criteria andMayIsNotNull() {
            addCriterion("may is not null");
            return (Criteria) this;
        }

        public Criteria andMayEqualTo(Double value) {
            addCriterion("may =", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayNotEqualTo(Double value) {
            addCriterion("may <>", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayGreaterThan(Double value) {
            addCriterion("may >", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayGreaterThanOrEqualTo(Double value) {
            addCriterion("may >=", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayLessThan(Double value) {
            addCriterion("may <", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayLessThanOrEqualTo(Double value) {
            addCriterion("may <=", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayIn(List<Double> values) {
            addCriterion("may in", values, "may");
            return (Criteria) this;
        }

        public Criteria andMayNotIn(List<Double> values) {
            addCriterion("may not in", values, "may");
            return (Criteria) this;
        }

        public Criteria andMayBetween(Double value1, Double value2) {
            addCriterion("may between", value1, value2, "may");
            return (Criteria) this;
        }

        public Criteria andMayNotBetween(Double value1, Double value2) {
            addCriterion("may not between", value1, value2, "may");
            return (Criteria) this;
        }

        public Criteria andJulyIsNull() {
            addCriterion("july is null");
            return (Criteria) this;
        }

        public Criteria andJulyIsNotNull() {
            addCriterion("july is not null");
            return (Criteria) this;
        }

        public Criteria andJulyEqualTo(Double value) {
            addCriterion("july =", value, "july");
            return (Criteria) this;
        }

        public Criteria andJulyNotEqualTo(Double value) {
            addCriterion("july <>", value, "july");
            return (Criteria) this;
        }

        public Criteria andJulyGreaterThan(Double value) {
            addCriterion("july >", value, "july");
            return (Criteria) this;
        }

        public Criteria andJulyGreaterThanOrEqualTo(Double value) {
            addCriterion("july >=", value, "july");
            return (Criteria) this;
        }

        public Criteria andJulyLessThan(Double value) {
            addCriterion("july <", value, "july");
            return (Criteria) this;
        }

        public Criteria andJulyLessThanOrEqualTo(Double value) {
            addCriterion("july <=", value, "july");
            return (Criteria) this;
        }

        public Criteria andJulyIn(List<Double> values) {
            addCriterion("july in", values, "july");
            return (Criteria) this;
        }

        public Criteria andJulyNotIn(List<Double> values) {
            addCriterion("july not in", values, "july");
            return (Criteria) this;
        }

        public Criteria andJulyBetween(Double value1, Double value2) {
            addCriterion("july between", value1, value2, "july");
            return (Criteria) this;
        }

        public Criteria andJulyNotBetween(Double value1, Double value2) {
            addCriterion("july not between", value1, value2, "july");
            return (Criteria) this;
        }

        public Criteria andJuneIsNull() {
            addCriterion("june is null");
            return (Criteria) this;
        }

        public Criteria andJuneIsNotNull() {
            addCriterion("june is not null");
            return (Criteria) this;
        }

        public Criteria andJuneEqualTo(Double value) {
            addCriterion("june =", value, "june");
            return (Criteria) this;
        }

        public Criteria andJuneNotEqualTo(Double value) {
            addCriterion("june <>", value, "june");
            return (Criteria) this;
        }

        public Criteria andJuneGreaterThan(Double value) {
            addCriterion("june >", value, "june");
            return (Criteria) this;
        }

        public Criteria andJuneGreaterThanOrEqualTo(Double value) {
            addCriterion("june >=", value, "june");
            return (Criteria) this;
        }

        public Criteria andJuneLessThan(Double value) {
            addCriterion("june <", value, "june");
            return (Criteria) this;
        }

        public Criteria andJuneLessThanOrEqualTo(Double value) {
            addCriterion("june <=", value, "june");
            return (Criteria) this;
        }

        public Criteria andJuneIn(List<Double> values) {
            addCriterion("june in", values, "june");
            return (Criteria) this;
        }

        public Criteria andJuneNotIn(List<Double> values) {
            addCriterion("june not in", values, "june");
            return (Criteria) this;
        }

        public Criteria andJuneBetween(Double value1, Double value2) {
            addCriterion("june between", value1, value2, "june");
            return (Criteria) this;
        }

        public Criteria andJuneNotBetween(Double value1, Double value2) {
            addCriterion("june not between", value1, value2, "june");
            return (Criteria) this;
        }

        public Criteria andAugustIsNull() {
            addCriterion("august is null");
            return (Criteria) this;
        }

        public Criteria andAugustIsNotNull() {
            addCriterion("august is not null");
            return (Criteria) this;
        }

        public Criteria andAugustEqualTo(Double value) {
            addCriterion("august =", value, "august");
            return (Criteria) this;
        }

        public Criteria andAugustNotEqualTo(Double value) {
            addCriterion("august <>", value, "august");
            return (Criteria) this;
        }

        public Criteria andAugustGreaterThan(Double value) {
            addCriterion("august >", value, "august");
            return (Criteria) this;
        }

        public Criteria andAugustGreaterThanOrEqualTo(Double value) {
            addCriterion("august >=", value, "august");
            return (Criteria) this;
        }

        public Criteria andAugustLessThan(Double value) {
            addCriterion("august <", value, "august");
            return (Criteria) this;
        }

        public Criteria andAugustLessThanOrEqualTo(Double value) {
            addCriterion("august <=", value, "august");
            return (Criteria) this;
        }

        public Criteria andAugustIn(List<Double> values) {
            addCriterion("august in", values, "august");
            return (Criteria) this;
        }

        public Criteria andAugustNotIn(List<Double> values) {
            addCriterion("august not in", values, "august");
            return (Criteria) this;
        }

        public Criteria andAugustBetween(Double value1, Double value2) {
            addCriterion("august between", value1, value2, "august");
            return (Criteria) this;
        }

        public Criteria andAugustNotBetween(Double value1, Double value2) {
            addCriterion("august not between", value1, value2, "august");
            return (Criteria) this;
        }

        public Criteria andSeptemberIsNull() {
            addCriterion("september is null");
            return (Criteria) this;
        }

        public Criteria andSeptemberIsNotNull() {
            addCriterion("september is not null");
            return (Criteria) this;
        }

        public Criteria andSeptemberEqualTo(Double value) {
            addCriterion("september =", value, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberNotEqualTo(Double value) {
            addCriterion("september <>", value, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberGreaterThan(Double value) {
            addCriterion("september >", value, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberGreaterThanOrEqualTo(Double value) {
            addCriterion("september >=", value, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberLessThan(Double value) {
            addCriterion("september <", value, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberLessThanOrEqualTo(Double value) {
            addCriterion("september <=", value, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberIn(List<Double> values) {
            addCriterion("september in", values, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberNotIn(List<Double> values) {
            addCriterion("september not in", values, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberBetween(Double value1, Double value2) {
            addCriterion("september between", value1, value2, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberNotBetween(Double value1, Double value2) {
            addCriterion("september not between", value1, value2, "september");
            return (Criteria) this;
        }

        public Criteria andOctoberIsNull() {
            addCriterion("october is null");
            return (Criteria) this;
        }

        public Criteria andOctoberIsNotNull() {
            addCriterion("october is not null");
            return (Criteria) this;
        }

        public Criteria andOctoberEqualTo(Double value) {
            addCriterion("october =", value, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberNotEqualTo(Double value) {
            addCriterion("october <>", value, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberGreaterThan(Double value) {
            addCriterion("october >", value, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberGreaterThanOrEqualTo(Double value) {
            addCriterion("october >=", value, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberLessThan(Double value) {
            addCriterion("october <", value, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberLessThanOrEqualTo(Double value) {
            addCriterion("october <=", value, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberIn(List<Double> values) {
            addCriterion("october in", values, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberNotIn(List<Double> values) {
            addCriterion("october not in", values, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberBetween(Double value1, Double value2) {
            addCriterion("october between", value1, value2, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberNotBetween(Double value1, Double value2) {
            addCriterion("october not between", value1, value2, "october");
            return (Criteria) this;
        }

        public Criteria andNovemberIsNull() {
            addCriterion("november is null");
            return (Criteria) this;
        }

        public Criteria andNovemberIsNotNull() {
            addCriterion("november is not null");
            return (Criteria) this;
        }

        public Criteria andNovemberEqualTo(Double value) {
            addCriterion("november =", value, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberNotEqualTo(Double value) {
            addCriterion("november <>", value, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberGreaterThan(Double value) {
            addCriterion("november >", value, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberGreaterThanOrEqualTo(Double value) {
            addCriterion("november >=", value, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberLessThan(Double value) {
            addCriterion("november <", value, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberLessThanOrEqualTo(Double value) {
            addCriterion("november <=", value, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberIn(List<Double> values) {
            addCriterion("november in", values, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberNotIn(List<Double> values) {
            addCriterion("november not in", values, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberBetween(Double value1, Double value2) {
            addCriterion("november between", value1, value2, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberNotBetween(Double value1, Double value2) {
            addCriterion("november not between", value1, value2, "november");
            return (Criteria) this;
        }

        public Criteria andDecemberIsNull() {
            addCriterion("december is null");
            return (Criteria) this;
        }

        public Criteria andDecemberIsNotNull() {
            addCriterion("december is not null");
            return (Criteria) this;
        }

        public Criteria andDecemberEqualTo(Double value) {
            addCriterion("december =", value, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberNotEqualTo(Double value) {
            addCriterion("december <>", value, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberGreaterThan(Double value) {
            addCriterion("december >", value, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberGreaterThanOrEqualTo(Double value) {
            addCriterion("december >=", value, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberLessThan(Double value) {
            addCriterion("december <", value, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberLessThanOrEqualTo(Double value) {
            addCriterion("december <=", value, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberIn(List<Double> values) {
            addCriterion("december in", values, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberNotIn(List<Double> values) {
            addCriterion("december not in", values, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberBetween(Double value1, Double value2) {
            addCriterion("december between", value1, value2, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberNotBetween(Double value1, Double value2) {
            addCriterion("december not between", value1, value2, "december");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Double value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Double value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Double value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Double value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Double value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Double> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Double> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Double value1, Double value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Double value1, Double value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andMondayIsNull() {
            addCriterion("monday is null");
            return (Criteria) this;
        }

        public Criteria andMondayIsNotNull() {
            addCriterion("monday is not null");
            return (Criteria) this;
        }

        public Criteria andMondayEqualTo(Double value) {
            addCriterion("monday =", value, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayNotEqualTo(Double value) {
            addCriterion("monday <>", value, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayGreaterThan(Double value) {
            addCriterion("monday >", value, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayGreaterThanOrEqualTo(Double value) {
            addCriterion("monday >=", value, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayLessThan(Double value) {
            addCriterion("monday <", value, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayLessThanOrEqualTo(Double value) {
            addCriterion("monday <=", value, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayIn(List<Double> values) {
            addCriterion("monday in", values, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayNotIn(List<Double> values) {
            addCriterion("monday not in", values, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayBetween(Double value1, Double value2) {
            addCriterion("monday between", value1, value2, "monday");
            return (Criteria) this;
        }

        public Criteria andMondayNotBetween(Double value1, Double value2) {
            addCriterion("monday not between", value1, value2, "monday");
            return (Criteria) this;
        }

        public Criteria andTuesdayIsNull() {
            addCriterion("tuesday is null");
            return (Criteria) this;
        }

        public Criteria andTuesdayIsNotNull() {
            addCriterion("tuesday is not null");
            return (Criteria) this;
        }

        public Criteria andTuesdayEqualTo(Double value) {
            addCriterion("tuesday =", value, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayNotEqualTo(Double value) {
            addCriterion("tuesday <>", value, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayGreaterThan(Double value) {
            addCriterion("tuesday >", value, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayGreaterThanOrEqualTo(Double value) {
            addCriterion("tuesday >=", value, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayLessThan(Double value) {
            addCriterion("tuesday <", value, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayLessThanOrEqualTo(Double value) {
            addCriterion("tuesday <=", value, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayIn(List<Double> values) {
            addCriterion("tuesday in", values, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayNotIn(List<Double> values) {
            addCriterion("tuesday not in", values, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayBetween(Double value1, Double value2) {
            addCriterion("tuesday between", value1, value2, "tuesday");
            return (Criteria) this;
        }

        public Criteria andTuesdayNotBetween(Double value1, Double value2) {
            addCriterion("tuesday not between", value1, value2, "tuesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayIsNull() {
            addCriterion("wednesday is null");
            return (Criteria) this;
        }

        public Criteria andWednesdayIsNotNull() {
            addCriterion("wednesday is not null");
            return (Criteria) this;
        }

        public Criteria andWednesdayEqualTo(Double value) {
            addCriterion("wednesday =", value, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayNotEqualTo(Double value) {
            addCriterion("wednesday <>", value, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayGreaterThan(Double value) {
            addCriterion("wednesday >", value, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayGreaterThanOrEqualTo(Double value) {
            addCriterion("wednesday >=", value, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayLessThan(Double value) {
            addCriterion("wednesday <", value, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayLessThanOrEqualTo(Double value) {
            addCriterion("wednesday <=", value, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayIn(List<Double> values) {
            addCriterion("wednesday in", values, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayNotIn(List<Double> values) {
            addCriterion("wednesday not in", values, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayBetween(Double value1, Double value2) {
            addCriterion("wednesday between", value1, value2, "wednesday");
            return (Criteria) this;
        }

        public Criteria andWednesdayNotBetween(Double value1, Double value2) {
            addCriterion("wednesday not between", value1, value2, "wednesday");
            return (Criteria) this;
        }

        public Criteria andThursdayIsNull() {
            addCriterion("thursday is null");
            return (Criteria) this;
        }

        public Criteria andThursdayIsNotNull() {
            addCriterion("thursday is not null");
            return (Criteria) this;
        }

        public Criteria andThursdayEqualTo(Double value) {
            addCriterion("thursday =", value, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayNotEqualTo(Double value) {
            addCriterion("thursday <>", value, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayGreaterThan(Double value) {
            addCriterion("thursday >", value, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayGreaterThanOrEqualTo(Double value) {
            addCriterion("thursday >=", value, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayLessThan(Double value) {
            addCriterion("thursday <", value, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayLessThanOrEqualTo(Double value) {
            addCriterion("thursday <=", value, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayIn(List<Double> values) {
            addCriterion("thursday in", values, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayNotIn(List<Double> values) {
            addCriterion("thursday not in", values, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayBetween(Double value1, Double value2) {
            addCriterion("thursday between", value1, value2, "thursday");
            return (Criteria) this;
        }

        public Criteria andThursdayNotBetween(Double value1, Double value2) {
            addCriterion("thursday not between", value1, value2, "thursday");
            return (Criteria) this;
        }

        public Criteria andFridayIsNull() {
            addCriterion("friday is null");
            return (Criteria) this;
        }

        public Criteria andFridayIsNotNull() {
            addCriterion("friday is not null");
            return (Criteria) this;
        }

        public Criteria andFridayEqualTo(Double value) {
            addCriterion("friday =", value, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayNotEqualTo(Double value) {
            addCriterion("friday <>", value, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayGreaterThan(Double value) {
            addCriterion("friday >", value, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayGreaterThanOrEqualTo(Double value) {
            addCriterion("friday >=", value, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayLessThan(Double value) {
            addCriterion("friday <", value, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayLessThanOrEqualTo(Double value) {
            addCriterion("friday <=", value, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayIn(List<Double> values) {
            addCriterion("friday in", values, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayNotIn(List<Double> values) {
            addCriterion("friday not in", values, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayBetween(Double value1, Double value2) {
            addCriterion("friday between", value1, value2, "friday");
            return (Criteria) this;
        }

        public Criteria andFridayNotBetween(Double value1, Double value2) {
            addCriterion("friday not between", value1, value2, "friday");
            return (Criteria) this;
        }

        public Criteria andSaturdayIsNull() {
            addCriterion("saturday is null");
            return (Criteria) this;
        }

        public Criteria andSaturdayIsNotNull() {
            addCriterion("saturday is not null");
            return (Criteria) this;
        }

        public Criteria andSaturdayEqualTo(Double value) {
            addCriterion("saturday =", value, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayNotEqualTo(Double value) {
            addCriterion("saturday <>", value, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayGreaterThan(Double value) {
            addCriterion("saturday >", value, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayGreaterThanOrEqualTo(Double value) {
            addCriterion("saturday >=", value, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayLessThan(Double value) {
            addCriterion("saturday <", value, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayLessThanOrEqualTo(Double value) {
            addCriterion("saturday <=", value, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayIn(List<Double> values) {
            addCriterion("saturday in", values, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayNotIn(List<Double> values) {
            addCriterion("saturday not in", values, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayBetween(Double value1, Double value2) {
            addCriterion("saturday between", value1, value2, "saturday");
            return (Criteria) this;
        }

        public Criteria andSaturdayNotBetween(Double value1, Double value2) {
            addCriterion("saturday not between", value1, value2, "saturday");
            return (Criteria) this;
        }

        public Criteria andSundayIsNull() {
            addCriterion("sunday is null");
            return (Criteria) this;
        }

        public Criteria andSundayIsNotNull() {
            addCriterion("sunday is not null");
            return (Criteria) this;
        }

        public Criteria andSundayEqualTo(Double value) {
            addCriterion("sunday =", value, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayNotEqualTo(Double value) {
            addCriterion("sunday <>", value, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayGreaterThan(Double value) {
            addCriterion("sunday >", value, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayGreaterThanOrEqualTo(Double value) {
            addCriterion("sunday >=", value, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayLessThan(Double value) {
            addCriterion("sunday <", value, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayLessThanOrEqualTo(Double value) {
            addCriterion("sunday <=", value, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayIn(List<Double> values) {
            addCriterion("sunday in", values, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayNotIn(List<Double> values) {
            addCriterion("sunday not in", values, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayBetween(Double value1, Double value2) {
            addCriterion("sunday between", value1, value2, "sunday");
            return (Criteria) this;
        }

        public Criteria andSundayNotBetween(Double value1, Double value2) {
            addCriterion("sunday not between", value1, value2, "sunday");
            return (Criteria) this;
        }

        public Criteria andOnehourIsNull() {
            addCriterion("onehour is null");
            return (Criteria) this;
        }

        public Criteria andOnehourIsNotNull() {
            addCriterion("onehour is not null");
            return (Criteria) this;
        }

        public Criteria andOnehourEqualTo(Double value) {
            addCriterion("onehour =", value, "onehour");
            return (Criteria) this;
        }

        public Criteria andOnehourNotEqualTo(Double value) {
            addCriterion("onehour <>", value, "onehour");
            return (Criteria) this;
        }

        public Criteria andOnehourGreaterThan(Double value) {
            addCriterion("onehour >", value, "onehour");
            return (Criteria) this;
        }

        public Criteria andOnehourGreaterThanOrEqualTo(Double value) {
            addCriterion("onehour >=", value, "onehour");
            return (Criteria) this;
        }

        public Criteria andOnehourLessThan(Double value) {
            addCriterion("onehour <", value, "onehour");
            return (Criteria) this;
        }

        public Criteria andOnehourLessThanOrEqualTo(Double value) {
            addCriterion("onehour <=", value, "onehour");
            return (Criteria) this;
        }

        public Criteria andOnehourIn(List<Double> values) {
            addCriterion("onehour in", values, "onehour");
            return (Criteria) this;
        }

        public Criteria andOnehourNotIn(List<Double> values) {
            addCriterion("onehour not in", values, "onehour");
            return (Criteria) this;
        }

        public Criteria andOnehourBetween(Double value1, Double value2) {
            addCriterion("onehour between", value1, value2, "onehour");
            return (Criteria) this;
        }

        public Criteria andOnehourNotBetween(Double value1, Double value2) {
            addCriterion("onehour not between", value1, value2, "onehour");
            return (Criteria) this;
        }

        public Criteria andTwohourIsNull() {
            addCriterion("twohour is null");
            return (Criteria) this;
        }

        public Criteria andTwohourIsNotNull() {
            addCriterion("twohour is not null");
            return (Criteria) this;
        }

        public Criteria andTwohourEqualTo(Double value) {
            addCriterion("twohour =", value, "twohour");
            return (Criteria) this;
        }

        public Criteria andTwohourNotEqualTo(Double value) {
            addCriterion("twohour <>", value, "twohour");
            return (Criteria) this;
        }

        public Criteria andTwohourGreaterThan(Double value) {
            addCriterion("twohour >", value, "twohour");
            return (Criteria) this;
        }

        public Criteria andTwohourGreaterThanOrEqualTo(Double value) {
            addCriterion("twohour >=", value, "twohour");
            return (Criteria) this;
        }

        public Criteria andTwohourLessThan(Double value) {
            addCriterion("twohour <", value, "twohour");
            return (Criteria) this;
        }

        public Criteria andTwohourLessThanOrEqualTo(Double value) {
            addCriterion("twohour <=", value, "twohour");
            return (Criteria) this;
        }

        public Criteria andTwohourIn(List<Double> values) {
            addCriterion("twohour in", values, "twohour");
            return (Criteria) this;
        }

        public Criteria andTwohourNotIn(List<Double> values) {
            addCriterion("twohour not in", values, "twohour");
            return (Criteria) this;
        }

        public Criteria andTwohourBetween(Double value1, Double value2) {
            addCriterion("twohour between", value1, value2, "twohour");
            return (Criteria) this;
        }

        public Criteria andTwohourNotBetween(Double value1, Double value2) {
            addCriterion("twohour not between", value1, value2, "twohour");
            return (Criteria) this;
        }

        public Criteria andThreehourIsNull() {
            addCriterion("threehour is null");
            return (Criteria) this;
        }

        public Criteria andThreehourIsNotNull() {
            addCriterion("threehour is not null");
            return (Criteria) this;
        }

        public Criteria andThreehourEqualTo(Double value) {
            addCriterion("threehour =", value, "threehour");
            return (Criteria) this;
        }

        public Criteria andThreehourNotEqualTo(Double value) {
            addCriterion("threehour <>", value, "threehour");
            return (Criteria) this;
        }

        public Criteria andThreehourGreaterThan(Double value) {
            addCriterion("threehour >", value, "threehour");
            return (Criteria) this;
        }

        public Criteria andThreehourGreaterThanOrEqualTo(Double value) {
            addCriterion("threehour >=", value, "threehour");
            return (Criteria) this;
        }

        public Criteria andThreehourLessThan(Double value) {
            addCriterion("threehour <", value, "threehour");
            return (Criteria) this;
        }

        public Criteria andThreehourLessThanOrEqualTo(Double value) {
            addCriterion("threehour <=", value, "threehour");
            return (Criteria) this;
        }

        public Criteria andThreehourIn(List<Double> values) {
            addCriterion("threehour in", values, "threehour");
            return (Criteria) this;
        }

        public Criteria andThreehourNotIn(List<Double> values) {
            addCriterion("threehour not in", values, "threehour");
            return (Criteria) this;
        }

        public Criteria andThreehourBetween(Double value1, Double value2) {
            addCriterion("threehour between", value1, value2, "threehour");
            return (Criteria) this;
        }

        public Criteria andThreehourNotBetween(Double value1, Double value2) {
            addCriterion("threehour not between", value1, value2, "threehour");
            return (Criteria) this;
        }

        public Criteria andFourhourIsNull() {
            addCriterion("fourhour is null");
            return (Criteria) this;
        }

        public Criteria andFourhourIsNotNull() {
            addCriterion("fourhour is not null");
            return (Criteria) this;
        }

        public Criteria andFourhourEqualTo(Double value) {
            addCriterion("fourhour =", value, "fourhour");
            return (Criteria) this;
        }

        public Criteria andFourhourNotEqualTo(Double value) {
            addCriterion("fourhour <>", value, "fourhour");
            return (Criteria) this;
        }

        public Criteria andFourhourGreaterThan(Double value) {
            addCriterion("fourhour >", value, "fourhour");
            return (Criteria) this;
        }

        public Criteria andFourhourGreaterThanOrEqualTo(Double value) {
            addCriterion("fourhour >=", value, "fourhour");
            return (Criteria) this;
        }

        public Criteria andFourhourLessThan(Double value) {
            addCriterion("fourhour <", value, "fourhour");
            return (Criteria) this;
        }

        public Criteria andFourhourLessThanOrEqualTo(Double value) {
            addCriterion("fourhour <=", value, "fourhour");
            return (Criteria) this;
        }

        public Criteria andFourhourIn(List<Double> values) {
            addCriterion("fourhour in", values, "fourhour");
            return (Criteria) this;
        }

        public Criteria andFourhourNotIn(List<Double> values) {
            addCriterion("fourhour not in", values, "fourhour");
            return (Criteria) this;
        }

        public Criteria andFourhourBetween(Double value1, Double value2) {
            addCriterion("fourhour between", value1, value2, "fourhour");
            return (Criteria) this;
        }

        public Criteria andFourhourNotBetween(Double value1, Double value2) {
            addCriterion("fourhour not between", value1, value2, "fourhour");
            return (Criteria) this;
        }

        public Criteria andFivehourIsNull() {
            addCriterion("fivehour is null");
            return (Criteria) this;
        }

        public Criteria andFivehourIsNotNull() {
            addCriterion("fivehour is not null");
            return (Criteria) this;
        }

        public Criteria andFivehourEqualTo(Double value) {
            addCriterion("fivehour =", value, "fivehour");
            return (Criteria) this;
        }

        public Criteria andFivehourNotEqualTo(Double value) {
            addCriterion("fivehour <>", value, "fivehour");
            return (Criteria) this;
        }

        public Criteria andFivehourGreaterThan(Double value) {
            addCriterion("fivehour >", value, "fivehour");
            return (Criteria) this;
        }

        public Criteria andFivehourGreaterThanOrEqualTo(Double value) {
            addCriterion("fivehour >=", value, "fivehour");
            return (Criteria) this;
        }

        public Criteria andFivehourLessThan(Double value) {
            addCriterion("fivehour <", value, "fivehour");
            return (Criteria) this;
        }

        public Criteria andFivehourLessThanOrEqualTo(Double value) {
            addCriterion("fivehour <=", value, "fivehour");
            return (Criteria) this;
        }

        public Criteria andFivehourIn(List<Double> values) {
            addCriterion("fivehour in", values, "fivehour");
            return (Criteria) this;
        }

        public Criteria andFivehourNotIn(List<Double> values) {
            addCriterion("fivehour not in", values, "fivehour");
            return (Criteria) this;
        }

        public Criteria andFivehourBetween(Double value1, Double value2) {
            addCriterion("fivehour between", value1, value2, "fivehour");
            return (Criteria) this;
        }

        public Criteria andFivehourNotBetween(Double value1, Double value2) {
            addCriterion("fivehour not between", value1, value2, "fivehour");
            return (Criteria) this;
        }

        public Criteria andSixhourIsNull() {
            addCriterion("sixhour is null");
            return (Criteria) this;
        }

        public Criteria andSixhourIsNotNull() {
            addCriterion("sixhour is not null");
            return (Criteria) this;
        }

        public Criteria andSixhourEqualTo(Double value) {
            addCriterion("sixhour =", value, "sixhour");
            return (Criteria) this;
        }

        public Criteria andSixhourNotEqualTo(Double value) {
            addCriterion("sixhour <>", value, "sixhour");
            return (Criteria) this;
        }

        public Criteria andSixhourGreaterThan(Double value) {
            addCriterion("sixhour >", value, "sixhour");
            return (Criteria) this;
        }

        public Criteria andSixhourGreaterThanOrEqualTo(Double value) {
            addCriterion("sixhour >=", value, "sixhour");
            return (Criteria) this;
        }

        public Criteria andSixhourLessThan(Double value) {
            addCriterion("sixhour <", value, "sixhour");
            return (Criteria) this;
        }

        public Criteria andSixhourLessThanOrEqualTo(Double value) {
            addCriterion("sixhour <=", value, "sixhour");
            return (Criteria) this;
        }

        public Criteria andSixhourIn(List<Double> values) {
            addCriterion("sixhour in", values, "sixhour");
            return (Criteria) this;
        }

        public Criteria andSixhourNotIn(List<Double> values) {
            addCriterion("sixhour not in", values, "sixhour");
            return (Criteria) this;
        }

        public Criteria andSixhourBetween(Double value1, Double value2) {
            addCriterion("sixhour between", value1, value2, "sixhour");
            return (Criteria) this;
        }

        public Criteria andSixhourNotBetween(Double value1, Double value2) {
            addCriterion("sixhour not between", value1, value2, "sixhour");
            return (Criteria) this;
        }

        public Criteria andSevenhourIsNull() {
            addCriterion("sevenhour is null");
            return (Criteria) this;
        }

        public Criteria andSevenhourIsNotNull() {
            addCriterion("sevenhour is not null");
            return (Criteria) this;
        }

        public Criteria andSevenhourEqualTo(Double value) {
            addCriterion("sevenhour =", value, "sevenhour");
            return (Criteria) this;
        }

        public Criteria andSevenhourNotEqualTo(Double value) {
            addCriterion("sevenhour <>", value, "sevenhour");
            return (Criteria) this;
        }

        public Criteria andSevenhourGreaterThan(Double value) {
            addCriterion("sevenhour >", value, "sevenhour");
            return (Criteria) this;
        }

        public Criteria andSevenhourGreaterThanOrEqualTo(Double value) {
            addCriterion("sevenhour >=", value, "sevenhour");
            return (Criteria) this;
        }

        public Criteria andSevenhourLessThan(Double value) {
            addCriterion("sevenhour <", value, "sevenhour");
            return (Criteria) this;
        }

        public Criteria andSevenhourLessThanOrEqualTo(Double value) {
            addCriterion("sevenhour <=", value, "sevenhour");
            return (Criteria) this;
        }

        public Criteria andSevenhourIn(List<Double> values) {
            addCriterion("sevenhour in", values, "sevenhour");
            return (Criteria) this;
        }

        public Criteria andSevenhourNotIn(List<Double> values) {
            addCriterion("sevenhour not in", values, "sevenhour");
            return (Criteria) this;
        }

        public Criteria andSevenhourBetween(Double value1, Double value2) {
            addCriterion("sevenhour between", value1, value2, "sevenhour");
            return (Criteria) this;
        }

        public Criteria andSevenhourNotBetween(Double value1, Double value2) {
            addCriterion("sevenhour not between", value1, value2, "sevenhour");
            return (Criteria) this;
        }

        public Criteria andEighthourIsNull() {
            addCriterion("eighthour is null");
            return (Criteria) this;
        }

        public Criteria andEighthourIsNotNull() {
            addCriterion("eighthour is not null");
            return (Criteria) this;
        }

        public Criteria andEighthourEqualTo(Double value) {
            addCriterion("eighthour =", value, "eighthour");
            return (Criteria) this;
        }

        public Criteria andEighthourNotEqualTo(Double value) {
            addCriterion("eighthour <>", value, "eighthour");
            return (Criteria) this;
        }

        public Criteria andEighthourGreaterThan(Double value) {
            addCriterion("eighthour >", value, "eighthour");
            return (Criteria) this;
        }

        public Criteria andEighthourGreaterThanOrEqualTo(Double value) {
            addCriterion("eighthour >=", value, "eighthour");
            return (Criteria) this;
        }

        public Criteria andEighthourLessThan(Double value) {
            addCriterion("eighthour <", value, "eighthour");
            return (Criteria) this;
        }

        public Criteria andEighthourLessThanOrEqualTo(Double value) {
            addCriterion("eighthour <=", value, "eighthour");
            return (Criteria) this;
        }

        public Criteria andEighthourIn(List<Double> values) {
            addCriterion("eighthour in", values, "eighthour");
            return (Criteria) this;
        }

        public Criteria andEighthourNotIn(List<Double> values) {
            addCriterion("eighthour not in", values, "eighthour");
            return (Criteria) this;
        }

        public Criteria andEighthourBetween(Double value1, Double value2) {
            addCriterion("eighthour between", value1, value2, "eighthour");
            return (Criteria) this;
        }

        public Criteria andEighthourNotBetween(Double value1, Double value2) {
            addCriterion("eighthour not between", value1, value2, "eighthour");
            return (Criteria) this;
        }

        public Criteria andNinehourIsNull() {
            addCriterion("ninehour is null");
            return (Criteria) this;
        }

        public Criteria andNinehourIsNotNull() {
            addCriterion("ninehour is not null");
            return (Criteria) this;
        }

        public Criteria andNinehourEqualTo(Double value) {
            addCriterion("ninehour =", value, "ninehour");
            return (Criteria) this;
        }

        public Criteria andNinehourNotEqualTo(Double value) {
            addCriterion("ninehour <>", value, "ninehour");
            return (Criteria) this;
        }

        public Criteria andNinehourGreaterThan(Double value) {
            addCriterion("ninehour >", value, "ninehour");
            return (Criteria) this;
        }

        public Criteria andNinehourGreaterThanOrEqualTo(Double value) {
            addCriterion("ninehour >=", value, "ninehour");
            return (Criteria) this;
        }

        public Criteria andNinehourLessThan(Double value) {
            addCriterion("ninehour <", value, "ninehour");
            return (Criteria) this;
        }

        public Criteria andNinehourLessThanOrEqualTo(Double value) {
            addCriterion("ninehour <=", value, "ninehour");
            return (Criteria) this;
        }

        public Criteria andNinehourIn(List<Double> values) {
            addCriterion("ninehour in", values, "ninehour");
            return (Criteria) this;
        }

        public Criteria andNinehourNotIn(List<Double> values) {
            addCriterion("ninehour not in", values, "ninehour");
            return (Criteria) this;
        }

        public Criteria andNinehourBetween(Double value1, Double value2) {
            addCriterion("ninehour between", value1, value2, "ninehour");
            return (Criteria) this;
        }

        public Criteria andNinehourNotBetween(Double value1, Double value2) {
            addCriterion("ninehour not between", value1, value2, "ninehour");
            return (Criteria) this;
        }

        public Criteria andTenhourIsNull() {
            addCriterion("tenhour is null");
            return (Criteria) this;
        }

        public Criteria andTenhourIsNotNull() {
            addCriterion("tenhour is not null");
            return (Criteria) this;
        }

        public Criteria andTenhourEqualTo(Double value) {
            addCriterion("tenhour =", value, "tenhour");
            return (Criteria) this;
        }

        public Criteria andTenhourNotEqualTo(Double value) {
            addCriterion("tenhour <>", value, "tenhour");
            return (Criteria) this;
        }

        public Criteria andTenhourGreaterThan(Double value) {
            addCriterion("tenhour >", value, "tenhour");
            return (Criteria) this;
        }

        public Criteria andTenhourGreaterThanOrEqualTo(Double value) {
            addCriterion("tenhour >=", value, "tenhour");
            return (Criteria) this;
        }

        public Criteria andTenhourLessThan(Double value) {
            addCriterion("tenhour <", value, "tenhour");
            return (Criteria) this;
        }

        public Criteria andTenhourLessThanOrEqualTo(Double value) {
            addCriterion("tenhour <=", value, "tenhour");
            return (Criteria) this;
        }

        public Criteria andTenhourIn(List<Double> values) {
            addCriterion("tenhour in", values, "tenhour");
            return (Criteria) this;
        }

        public Criteria andTenhourNotIn(List<Double> values) {
            addCriterion("tenhour not in", values, "tenhour");
            return (Criteria) this;
        }

        public Criteria andTenhourBetween(Double value1, Double value2) {
            addCriterion("tenhour between", value1, value2, "tenhour");
            return (Criteria) this;
        }

        public Criteria andTenhourNotBetween(Double value1, Double value2) {
            addCriterion("tenhour not between", value1, value2, "tenhour");
            return (Criteria) this;
        }

        public Criteria andElevenhourIsNull() {
            addCriterion("elevenhour is null");
            return (Criteria) this;
        }

        public Criteria andElevenhourIsNotNull() {
            addCriterion("elevenhour is not null");
            return (Criteria) this;
        }

        public Criteria andElevenhourEqualTo(Double value) {
            addCriterion("elevenhour =", value, "elevenhour");
            return (Criteria) this;
        }

        public Criteria andElevenhourNotEqualTo(Double value) {
            addCriterion("elevenhour <>", value, "elevenhour");
            return (Criteria) this;
        }

        public Criteria andElevenhourGreaterThan(Double value) {
            addCriterion("elevenhour >", value, "elevenhour");
            return (Criteria) this;
        }

        public Criteria andElevenhourGreaterThanOrEqualTo(Double value) {
            addCriterion("elevenhour >=", value, "elevenhour");
            return (Criteria) this;
        }

        public Criteria andElevenhourLessThan(Double value) {
            addCriterion("elevenhour <", value, "elevenhour");
            return (Criteria) this;
        }

        public Criteria andElevenhourLessThanOrEqualTo(Double value) {
            addCriterion("elevenhour <=", value, "elevenhour");
            return (Criteria) this;
        }

        public Criteria andElevenhourIn(List<Double> values) {
            addCriterion("elevenhour in", values, "elevenhour");
            return (Criteria) this;
        }

        public Criteria andElevenhourNotIn(List<Double> values) {
            addCriterion("elevenhour not in", values, "elevenhour");
            return (Criteria) this;
        }

        public Criteria andElevenhourBetween(Double value1, Double value2) {
            addCriterion("elevenhour between", value1, value2, "elevenhour");
            return (Criteria) this;
        }

        public Criteria andElevenhourNotBetween(Double value1, Double value2) {
            addCriterion("elevenhour not between", value1, value2, "elevenhour");
            return (Criteria) this;
        }

        public Criteria andTwelvehourIsNull() {
            addCriterion("twelvehour is null");
            return (Criteria) this;
        }

        public Criteria andTwelvehourIsNotNull() {
            addCriterion("twelvehour is not null");
            return (Criteria) this;
        }

        public Criteria andTwelvehourEqualTo(Double value) {
            addCriterion("twelvehour =", value, "twelvehour");
            return (Criteria) this;
        }

        public Criteria andTwelvehourNotEqualTo(Double value) {
            addCriterion("twelvehour <>", value, "twelvehour");
            return (Criteria) this;
        }

        public Criteria andTwelvehourGreaterThan(Double value) {
            addCriterion("twelvehour >", value, "twelvehour");
            return (Criteria) this;
        }

        public Criteria andTwelvehourGreaterThanOrEqualTo(Double value) {
            addCriterion("twelvehour >=", value, "twelvehour");
            return (Criteria) this;
        }

        public Criteria andTwelvehourLessThan(Double value) {
            addCriterion("twelvehour <", value, "twelvehour");
            return (Criteria) this;
        }

        public Criteria andTwelvehourLessThanOrEqualTo(Double value) {
            addCriterion("twelvehour <=", value, "twelvehour");
            return (Criteria) this;
        }

        public Criteria andTwelvehourIn(List<Double> values) {
            addCriterion("twelvehour in", values, "twelvehour");
            return (Criteria) this;
        }

        public Criteria andTwelvehourNotIn(List<Double> values) {
            addCriterion("twelvehour not in", values, "twelvehour");
            return (Criteria) this;
        }

        public Criteria andTwelvehourBetween(Double value1, Double value2) {
            addCriterion("twelvehour between", value1, value2, "twelvehour");
            return (Criteria) this;
        }

        public Criteria andTwelvehourNotBetween(Double value1, Double value2) {
            addCriterion("twelvehour not between", value1, value2, "twelvehour");
            return (Criteria) this;
        }

        public Criteria andThirteenhourIsNull() {
            addCriterion("thirteenhour is null");
            return (Criteria) this;
        }

        public Criteria andThirteenhourIsNotNull() {
            addCriterion("thirteenhour is not null");
            return (Criteria) this;
        }

        public Criteria andThirteenhourEqualTo(Double value) {
            addCriterion("thirteenhour =", value, "thirteenhour");
            return (Criteria) this;
        }

        public Criteria andThirteenhourNotEqualTo(Double value) {
            addCriterion("thirteenhour <>", value, "thirteenhour");
            return (Criteria) this;
        }

        public Criteria andThirteenhourGreaterThan(Double value) {
            addCriterion("thirteenhour >", value, "thirteenhour");
            return (Criteria) this;
        }

        public Criteria andThirteenhourGreaterThanOrEqualTo(Double value) {
            addCriterion("thirteenhour >=", value, "thirteenhour");
            return (Criteria) this;
        }

        public Criteria andThirteenhourLessThan(Double value) {
            addCriterion("thirteenhour <", value, "thirteenhour");
            return (Criteria) this;
        }

        public Criteria andThirteenhourLessThanOrEqualTo(Double value) {
            addCriterion("thirteenhour <=", value, "thirteenhour");
            return (Criteria) this;
        }

        public Criteria andThirteenhourIn(List<Double> values) {
            addCriterion("thirteenhour in", values, "thirteenhour");
            return (Criteria) this;
        }

        public Criteria andThirteenhourNotIn(List<Double> values) {
            addCriterion("thirteenhour not in", values, "thirteenhour");
            return (Criteria) this;
        }

        public Criteria andThirteenhourBetween(Double value1, Double value2) {
            addCriterion("thirteenhour between", value1, value2, "thirteenhour");
            return (Criteria) this;
        }

        public Criteria andThirteenhourNotBetween(Double value1, Double value2) {
            addCriterion("thirteenhour not between", value1, value2, "thirteenhour");
            return (Criteria) this;
        }

        public Criteria andFourteenhourIsNull() {
            addCriterion("fourteenhour is null");
            return (Criteria) this;
        }

        public Criteria andFourteenhourIsNotNull() {
            addCriterion("fourteenhour is not null");
            return (Criteria) this;
        }

        public Criteria andFourteenhourEqualTo(Double value) {
            addCriterion("fourteenhour =", value, "fourteenhour");
            return (Criteria) this;
        }

        public Criteria andFourteenhourNotEqualTo(Double value) {
            addCriterion("fourteenhour <>", value, "fourteenhour");
            return (Criteria) this;
        }

        public Criteria andFourteenhourGreaterThan(Double value) {
            addCriterion("fourteenhour >", value, "fourteenhour");
            return (Criteria) this;
        }

        public Criteria andFourteenhourGreaterThanOrEqualTo(Double value) {
            addCriterion("fourteenhour >=", value, "fourteenhour");
            return (Criteria) this;
        }

        public Criteria andFourteenhourLessThan(Double value) {
            addCriterion("fourteenhour <", value, "fourteenhour");
            return (Criteria) this;
        }

        public Criteria andFourteenhourLessThanOrEqualTo(Double value) {
            addCriterion("fourteenhour <=", value, "fourteenhour");
            return (Criteria) this;
        }

        public Criteria andFourteenhourIn(List<Double> values) {
            addCriterion("fourteenhour in", values, "fourteenhour");
            return (Criteria) this;
        }

        public Criteria andFourteenhourNotIn(List<Double> values) {
            addCriterion("fourteenhour not in", values, "fourteenhour");
            return (Criteria) this;
        }

        public Criteria andFourteenhourBetween(Double value1, Double value2) {
            addCriterion("fourteenhour between", value1, value2, "fourteenhour");
            return (Criteria) this;
        }

        public Criteria andFourteenhourNotBetween(Double value1, Double value2) {
            addCriterion("fourteenhour not between", value1, value2, "fourteenhour");
            return (Criteria) this;
        }

        public Criteria andFifteenhourIsNull() {
            addCriterion("fifteenhour is null");
            return (Criteria) this;
        }

        public Criteria andFifteenhourIsNotNull() {
            addCriterion("fifteenhour is not null");
            return (Criteria) this;
        }

        public Criteria andFifteenhourEqualTo(Double value) {
            addCriterion("fifteenhour =", value, "fifteenhour");
            return (Criteria) this;
        }

        public Criteria andFifteenhourNotEqualTo(Double value) {
            addCriterion("fifteenhour <>", value, "fifteenhour");
            return (Criteria) this;
        }

        public Criteria andFifteenhourGreaterThan(Double value) {
            addCriterion("fifteenhour >", value, "fifteenhour");
            return (Criteria) this;
        }

        public Criteria andFifteenhourGreaterThanOrEqualTo(Double value) {
            addCriterion("fifteenhour >=", value, "fifteenhour");
            return (Criteria) this;
        }

        public Criteria andFifteenhourLessThan(Double value) {
            addCriterion("fifteenhour <", value, "fifteenhour");
            return (Criteria) this;
        }

        public Criteria andFifteenhourLessThanOrEqualTo(Double value) {
            addCriterion("fifteenhour <=", value, "fifteenhour");
            return (Criteria) this;
        }

        public Criteria andFifteenhourIn(List<Double> values) {
            addCriterion("fifteenhour in", values, "fifteenhour");
            return (Criteria) this;
        }

        public Criteria andFifteenhourNotIn(List<Double> values) {
            addCriterion("fifteenhour not in", values, "fifteenhour");
            return (Criteria) this;
        }

        public Criteria andFifteenhourBetween(Double value1, Double value2) {
            addCriterion("fifteenhour between", value1, value2, "fifteenhour");
            return (Criteria) this;
        }

        public Criteria andFifteenhourNotBetween(Double value1, Double value2) {
            addCriterion("fifteenhour not between", value1, value2, "fifteenhour");
            return (Criteria) this;
        }

        public Criteria andSixteenhourIsNull() {
            addCriterion("sixteenhour is null");
            return (Criteria) this;
        }

        public Criteria andSixteenhourIsNotNull() {
            addCriterion("sixteenhour is not null");
            return (Criteria) this;
        }

        public Criteria andSixteenhourEqualTo(Double value) {
            addCriterion("sixteenhour =", value, "sixteenhour");
            return (Criteria) this;
        }

        public Criteria andSixteenhourNotEqualTo(Double value) {
            addCriterion("sixteenhour <>", value, "sixteenhour");
            return (Criteria) this;
        }

        public Criteria andSixteenhourGreaterThan(Double value) {
            addCriterion("sixteenhour >", value, "sixteenhour");
            return (Criteria) this;
        }

        public Criteria andSixteenhourGreaterThanOrEqualTo(Double value) {
            addCriterion("sixteenhour >=", value, "sixteenhour");
            return (Criteria) this;
        }

        public Criteria andSixteenhourLessThan(Double value) {
            addCriterion("sixteenhour <", value, "sixteenhour");
            return (Criteria) this;
        }

        public Criteria andSixteenhourLessThanOrEqualTo(Double value) {
            addCriterion("sixteenhour <=", value, "sixteenhour");
            return (Criteria) this;
        }

        public Criteria andSixteenhourIn(List<Double> values) {
            addCriterion("sixteenhour in", values, "sixteenhour");
            return (Criteria) this;
        }

        public Criteria andSixteenhourNotIn(List<Double> values) {
            addCriterion("sixteenhour not in", values, "sixteenhour");
            return (Criteria) this;
        }

        public Criteria andSixteenhourBetween(Double value1, Double value2) {
            addCriterion("sixteenhour between", value1, value2, "sixteenhour");
            return (Criteria) this;
        }

        public Criteria andSixteenhourNotBetween(Double value1, Double value2) {
            addCriterion("sixteenhour not between", value1, value2, "sixteenhour");
            return (Criteria) this;
        }

        public Criteria andSeventeenhourIsNull() {
            addCriterion("seventeenhour is null");
            return (Criteria) this;
        }

        public Criteria andSeventeenhourIsNotNull() {
            addCriterion("seventeenhour is not null");
            return (Criteria) this;
        }

        public Criteria andSeventeenhourEqualTo(Double value) {
            addCriterion("seventeenhour =", value, "seventeenhour");
            return (Criteria) this;
        }

        public Criteria andSeventeenhourNotEqualTo(Double value) {
            addCriterion("seventeenhour <>", value, "seventeenhour");
            return (Criteria) this;
        }

        public Criteria andSeventeenhourGreaterThan(Double value) {
            addCriterion("seventeenhour >", value, "seventeenhour");
            return (Criteria) this;
        }

        public Criteria andSeventeenhourGreaterThanOrEqualTo(Double value) {
            addCriterion("seventeenhour >=", value, "seventeenhour");
            return (Criteria) this;
        }

        public Criteria andSeventeenhourLessThan(Double value) {
            addCriterion("seventeenhour <", value, "seventeenhour");
            return (Criteria) this;
        }

        public Criteria andSeventeenhourLessThanOrEqualTo(Double value) {
            addCriterion("seventeenhour <=", value, "seventeenhour");
            return (Criteria) this;
        }

        public Criteria andSeventeenhourIn(List<Double> values) {
            addCriterion("seventeenhour in", values, "seventeenhour");
            return (Criteria) this;
        }

        public Criteria andSeventeenhourNotIn(List<Double> values) {
            addCriterion("seventeenhour not in", values, "seventeenhour");
            return (Criteria) this;
        }

        public Criteria andSeventeenhourBetween(Double value1, Double value2) {
            addCriterion("seventeenhour between", value1, value2, "seventeenhour");
            return (Criteria) this;
        }

        public Criteria andSeventeenhourNotBetween(Double value1, Double value2) {
            addCriterion("seventeenhour not between", value1, value2, "seventeenhour");
            return (Criteria) this;
        }

        public Criteria andEighteenhourIsNull() {
            addCriterion("eighteenhour is null");
            return (Criteria) this;
        }

        public Criteria andEighteenhourIsNotNull() {
            addCriterion("eighteenhour is not null");
            return (Criteria) this;
        }

        public Criteria andEighteenhourEqualTo(Double value) {
            addCriterion("eighteenhour =", value, "eighteenhour");
            return (Criteria) this;
        }

        public Criteria andEighteenhourNotEqualTo(Double value) {
            addCriterion("eighteenhour <>", value, "eighteenhour");
            return (Criteria) this;
        }

        public Criteria andEighteenhourGreaterThan(Double value) {
            addCriterion("eighteenhour >", value, "eighteenhour");
            return (Criteria) this;
        }

        public Criteria andEighteenhourGreaterThanOrEqualTo(Double value) {
            addCriterion("eighteenhour >=", value, "eighteenhour");
            return (Criteria) this;
        }

        public Criteria andEighteenhourLessThan(Double value) {
            addCriterion("eighteenhour <", value, "eighteenhour");
            return (Criteria) this;
        }

        public Criteria andEighteenhourLessThanOrEqualTo(Double value) {
            addCriterion("eighteenhour <=", value, "eighteenhour");
            return (Criteria) this;
        }

        public Criteria andEighteenhourIn(List<Double> values) {
            addCriterion("eighteenhour in", values, "eighteenhour");
            return (Criteria) this;
        }

        public Criteria andEighteenhourNotIn(List<Double> values) {
            addCriterion("eighteenhour not in", values, "eighteenhour");
            return (Criteria) this;
        }

        public Criteria andEighteenhourBetween(Double value1, Double value2) {
            addCriterion("eighteenhour between", value1, value2, "eighteenhour");
            return (Criteria) this;
        }

        public Criteria andEighteenhourNotBetween(Double value1, Double value2) {
            addCriterion("eighteenhour not between", value1, value2, "eighteenhour");
            return (Criteria) this;
        }

        public Criteria andNineteenhourIsNull() {
            addCriterion("nineteenhour is null");
            return (Criteria) this;
        }

        public Criteria andNineteenhourIsNotNull() {
            addCriterion("nineteenhour is not null");
            return (Criteria) this;
        }

        public Criteria andNineteenhourEqualTo(Double value) {
            addCriterion("nineteenhour =", value, "nineteenhour");
            return (Criteria) this;
        }

        public Criteria andNineteenhourNotEqualTo(Double value) {
            addCriterion("nineteenhour <>", value, "nineteenhour");
            return (Criteria) this;
        }

        public Criteria andNineteenhourGreaterThan(Double value) {
            addCriterion("nineteenhour >", value, "nineteenhour");
            return (Criteria) this;
        }

        public Criteria andNineteenhourGreaterThanOrEqualTo(Double value) {
            addCriterion("nineteenhour >=", value, "nineteenhour");
            return (Criteria) this;
        }

        public Criteria andNineteenhourLessThan(Double value) {
            addCriterion("nineteenhour <", value, "nineteenhour");
            return (Criteria) this;
        }

        public Criteria andNineteenhourLessThanOrEqualTo(Double value) {
            addCriterion("nineteenhour <=", value, "nineteenhour");
            return (Criteria) this;
        }

        public Criteria andNineteenhourIn(List<Double> values) {
            addCriterion("nineteenhour in", values, "nineteenhour");
            return (Criteria) this;
        }

        public Criteria andNineteenhourNotIn(List<Double> values) {
            addCriterion("nineteenhour not in", values, "nineteenhour");
            return (Criteria) this;
        }

        public Criteria andNineteenhourBetween(Double value1, Double value2) {
            addCriterion("nineteenhour between", value1, value2, "nineteenhour");
            return (Criteria) this;
        }

        public Criteria andNineteenhourNotBetween(Double value1, Double value2) {
            addCriterion("nineteenhour not between", value1, value2, "nineteenhour");
            return (Criteria) this;
        }

        public Criteria andTwentyhourIsNull() {
            addCriterion("twentyhour is null");
            return (Criteria) this;
        }

        public Criteria andTwentyhourIsNotNull() {
            addCriterion("twentyhour is not null");
            return (Criteria) this;
        }

        public Criteria andTwentyhourEqualTo(Double value) {
            addCriterion("twentyhour =", value, "twentyhour");
            return (Criteria) this;
        }

        public Criteria andTwentyhourNotEqualTo(Double value) {
            addCriterion("twentyhour <>", value, "twentyhour");
            return (Criteria) this;
        }

        public Criteria andTwentyhourGreaterThan(Double value) {
            addCriterion("twentyhour >", value, "twentyhour");
            return (Criteria) this;
        }

        public Criteria andTwentyhourGreaterThanOrEqualTo(Double value) {
            addCriterion("twentyhour >=", value, "twentyhour");
            return (Criteria) this;
        }

        public Criteria andTwentyhourLessThan(Double value) {
            addCriterion("twentyhour <", value, "twentyhour");
            return (Criteria) this;
        }

        public Criteria andTwentyhourLessThanOrEqualTo(Double value) {
            addCriterion("twentyhour <=", value, "twentyhour");
            return (Criteria) this;
        }

        public Criteria andTwentyhourIn(List<Double> values) {
            addCriterion("twentyhour in", values, "twentyhour");
            return (Criteria) this;
        }

        public Criteria andTwentyhourNotIn(List<Double> values) {
            addCriterion("twentyhour not in", values, "twentyhour");
            return (Criteria) this;
        }

        public Criteria andTwentyhourBetween(Double value1, Double value2) {
            addCriterion("twentyhour between", value1, value2, "twentyhour");
            return (Criteria) this;
        }

        public Criteria andTwentyhourNotBetween(Double value1, Double value2) {
            addCriterion("twentyhour not between", value1, value2, "twentyhour");
            return (Criteria) this;
        }

        public Criteria andTwentyonehourIsNull() {
            addCriterion("twentyonehour is null");
            return (Criteria) this;
        }

        public Criteria andTwentyonehourIsNotNull() {
            addCriterion("twentyonehour is not null");
            return (Criteria) this;
        }

        public Criteria andTwentyonehourEqualTo(Double value) {
            addCriterion("twentyonehour =", value, "twentyonehour");
            return (Criteria) this;
        }

        public Criteria andTwentyonehourNotEqualTo(Double value) {
            addCriterion("twentyonehour <>", value, "twentyonehour");
            return (Criteria) this;
        }

        public Criteria andTwentyonehourGreaterThan(Double value) {
            addCriterion("twentyonehour >", value, "twentyonehour");
            return (Criteria) this;
        }

        public Criteria andTwentyonehourGreaterThanOrEqualTo(Double value) {
            addCriterion("twentyonehour >=", value, "twentyonehour");
            return (Criteria) this;
        }

        public Criteria andTwentyonehourLessThan(Double value) {
            addCriterion("twentyonehour <", value, "twentyonehour");
            return (Criteria) this;
        }

        public Criteria andTwentyonehourLessThanOrEqualTo(Double value) {
            addCriterion("twentyonehour <=", value, "twentyonehour");
            return (Criteria) this;
        }

        public Criteria andTwentyonehourIn(List<Double> values) {
            addCriterion("twentyonehour in", values, "twentyonehour");
            return (Criteria) this;
        }

        public Criteria andTwentyonehourNotIn(List<Double> values) {
            addCriterion("twentyonehour not in", values, "twentyonehour");
            return (Criteria) this;
        }

        public Criteria andTwentyonehourBetween(Double value1, Double value2) {
            addCriterion("twentyonehour between", value1, value2, "twentyonehour");
            return (Criteria) this;
        }

        public Criteria andTwentyonehourNotBetween(Double value1, Double value2) {
            addCriterion("twentyonehour not between", value1, value2, "twentyonehour");
            return (Criteria) this;
        }

        public Criteria andTwentytwohourIsNull() {
            addCriterion("twentytwohour is null");
            return (Criteria) this;
        }

        public Criteria andTwentytwohourIsNotNull() {
            addCriterion("twentytwohour is not null");
            return (Criteria) this;
        }

        public Criteria andTwentytwohourEqualTo(Double value) {
            addCriterion("twentytwohour =", value, "twentytwohour");
            return (Criteria) this;
        }

        public Criteria andTwentytwohourNotEqualTo(Double value) {
            addCriterion("twentytwohour <>", value, "twentytwohour");
            return (Criteria) this;
        }

        public Criteria andTwentytwohourGreaterThan(Double value) {
            addCriterion("twentytwohour >", value, "twentytwohour");
            return (Criteria) this;
        }

        public Criteria andTwentytwohourGreaterThanOrEqualTo(Double value) {
            addCriterion("twentytwohour >=", value, "twentytwohour");
            return (Criteria) this;
        }

        public Criteria andTwentytwohourLessThan(Double value) {
            addCriterion("twentytwohour <", value, "twentytwohour");
            return (Criteria) this;
        }

        public Criteria andTwentytwohourLessThanOrEqualTo(Double value) {
            addCriterion("twentytwohour <=", value, "twentytwohour");
            return (Criteria) this;
        }

        public Criteria andTwentytwohourIn(List<Double> values) {
            addCriterion("twentytwohour in", values, "twentytwohour");
            return (Criteria) this;
        }

        public Criteria andTwentytwohourNotIn(List<Double> values) {
            addCriterion("twentytwohour not in", values, "twentytwohour");
            return (Criteria) this;
        }

        public Criteria andTwentytwohourBetween(Double value1, Double value2) {
            addCriterion("twentytwohour between", value1, value2, "twentytwohour");
            return (Criteria) this;
        }

        public Criteria andTwentytwohourNotBetween(Double value1, Double value2) {
            addCriterion("twentytwohour not between", value1, value2, "twentytwohour");
            return (Criteria) this;
        }

        public Criteria andTwentythreehourIsNull() {
            addCriterion("twentythreehour is null");
            return (Criteria) this;
        }

        public Criteria andTwentythreehourIsNotNull() {
            addCriterion("twentythreehour is not null");
            return (Criteria) this;
        }

        public Criteria andTwentythreehourEqualTo(Double value) {
            addCriterion("twentythreehour =", value, "twentythreehour");
            return (Criteria) this;
        }

        public Criteria andTwentythreehourNotEqualTo(Double value) {
            addCriterion("twentythreehour <>", value, "twentythreehour");
            return (Criteria) this;
        }

        public Criteria andTwentythreehourGreaterThan(Double value) {
            addCriterion("twentythreehour >", value, "twentythreehour");
            return (Criteria) this;
        }

        public Criteria andTwentythreehourGreaterThanOrEqualTo(Double value) {
            addCriterion("twentythreehour >=", value, "twentythreehour");
            return (Criteria) this;
        }

        public Criteria andTwentythreehourLessThan(Double value) {
            addCriterion("twentythreehour <", value, "twentythreehour");
            return (Criteria) this;
        }

        public Criteria andTwentythreehourLessThanOrEqualTo(Double value) {
            addCriterion("twentythreehour <=", value, "twentythreehour");
            return (Criteria) this;
        }

        public Criteria andTwentythreehourIn(List<Double> values) {
            addCriterion("twentythreehour in", values, "twentythreehour");
            return (Criteria) this;
        }

        public Criteria andTwentythreehourNotIn(List<Double> values) {
            addCriterion("twentythreehour not in", values, "twentythreehour");
            return (Criteria) this;
        }

        public Criteria andTwentythreehourBetween(Double value1, Double value2) {
            addCriterion("twentythreehour between", value1, value2, "twentythreehour");
            return (Criteria) this;
        }

        public Criteria andTwentythreehourNotBetween(Double value1, Double value2) {
            addCriterion("twentythreehour not between", value1, value2, "twentythreehour");
            return (Criteria) this;
        }

        public Criteria andTwentyfourhourIsNull() {
            addCriterion("twentyfourhour is null");
            return (Criteria) this;
        }

        public Criteria andTwentyfourhourIsNotNull() {
            addCriterion("twentyfourhour is not null");
            return (Criteria) this;
        }

        public Criteria andTwentyfourhourEqualTo(Double value) {
            addCriterion("twentyfourhour =", value, "twentyfourhour");
            return (Criteria) this;
        }

        public Criteria andTwentyfourhourNotEqualTo(Double value) {
            addCriterion("twentyfourhour <>", value, "twentyfourhour");
            return (Criteria) this;
        }

        public Criteria andTwentyfourhourGreaterThan(Double value) {
            addCriterion("twentyfourhour >", value, "twentyfourhour");
            return (Criteria) this;
        }

        public Criteria andTwentyfourhourGreaterThanOrEqualTo(Double value) {
            addCriterion("twentyfourhour >=", value, "twentyfourhour");
            return (Criteria) this;
        }

        public Criteria andTwentyfourhourLessThan(Double value) {
            addCriterion("twentyfourhour <", value, "twentyfourhour");
            return (Criteria) this;
        }

        public Criteria andTwentyfourhourLessThanOrEqualTo(Double value) {
            addCriterion("twentyfourhour <=", value, "twentyfourhour");
            return (Criteria) this;
        }

        public Criteria andTwentyfourhourIn(List<Double> values) {
            addCriterion("twentyfourhour in", values, "twentyfourhour");
            return (Criteria) this;
        }

        public Criteria andTwentyfourhourNotIn(List<Double> values) {
            addCriterion("twentyfourhour not in", values, "twentyfourhour");
            return (Criteria) this;
        }

        public Criteria andTwentyfourhourBetween(Double value1, Double value2) {
            addCriterion("twentyfourhour between", value1, value2, "twentyfourhour");
            return (Criteria) this;
        }

        public Criteria andTwentyfourhourNotBetween(Double value1, Double value2) {
            addCriterion("twentyfourhour not between", value1, value2, "twentyfourhour");
            return (Criteria) this;
        }

        public Criteria andTotalweekxlsIsNull() {
            addCriterion("totalweekxls is null");
            return (Criteria) this;
        }

        public Criteria andTotalweekxlsIsNotNull() {
            addCriterion("totalweekxls is not null");
            return (Criteria) this;
        }

        public Criteria andTotalweekxlsEqualTo(Double value) {
            addCriterion("totalweekxls =", value, "totalweekxls");
            return (Criteria) this;
        }

        public Criteria andTotalweekxlsNotEqualTo(Double value) {
            addCriterion("totalweekxls <>", value, "totalweekxls");
            return (Criteria) this;
        }

        public Criteria andTotalweekxlsGreaterThan(Double value) {
            addCriterion("totalweekxls >", value, "totalweekxls");
            return (Criteria) this;
        }

        public Criteria andTotalweekxlsGreaterThanOrEqualTo(Double value) {
            addCriterion("totalweekxls >=", value, "totalweekxls");
            return (Criteria) this;
        }

        public Criteria andTotalweekxlsLessThan(Double value) {
            addCriterion("totalweekxls <", value, "totalweekxls");
            return (Criteria) this;
        }

        public Criteria andTotalweekxlsLessThanOrEqualTo(Double value) {
            addCriterion("totalweekxls <=", value, "totalweekxls");
            return (Criteria) this;
        }

        public Criteria andTotalweekxlsIn(List<Double> values) {
            addCriterion("totalweekxls in", values, "totalweekxls");
            return (Criteria) this;
        }

        public Criteria andTotalweekxlsNotIn(List<Double> values) {
            addCriterion("totalweekxls not in", values, "totalweekxls");
            return (Criteria) this;
        }

        public Criteria andTotalweekxlsBetween(Double value1, Double value2) {
            addCriterion("totalweekxls between", value1, value2, "totalweekxls");
            return (Criteria) this;
        }

        public Criteria andTotalweekxlsNotBetween(Double value1, Double value2) {
            addCriterion("totalweekxls not between", value1, value2, "totalweekxls");
            return (Criteria) this;
        }

        public Criteria andTotaldayxlsIsNull() {
            addCriterion("totaldayxls is null");
            return (Criteria) this;
        }

        public Criteria andTotaldayxlsIsNotNull() {
            addCriterion("totaldayxls is not null");
            return (Criteria) this;
        }

        public Criteria andTotaldayxlsEqualTo(Double value) {
            addCriterion("totaldayxls =", value, "totaldayxls");
            return (Criteria) this;
        }

        public Criteria andTotaldayxlsNotEqualTo(Double value) {
            addCriterion("totaldayxls <>", value, "totaldayxls");
            return (Criteria) this;
        }

        public Criteria andTotaldayxlsGreaterThan(Double value) {
            addCriterion("totaldayxls >", value, "totaldayxls");
            return (Criteria) this;
        }

        public Criteria andTotaldayxlsGreaterThanOrEqualTo(Double value) {
            addCriterion("totaldayxls >=", value, "totaldayxls");
            return (Criteria) this;
        }

        public Criteria andTotaldayxlsLessThan(Double value) {
            addCriterion("totaldayxls <", value, "totaldayxls");
            return (Criteria) this;
        }

        public Criteria andTotaldayxlsLessThanOrEqualTo(Double value) {
            addCriterion("totaldayxls <=", value, "totaldayxls");
            return (Criteria) this;
        }

        public Criteria andTotaldayxlsIn(List<Double> values) {
            addCriterion("totaldayxls in", values, "totaldayxls");
            return (Criteria) this;
        }

        public Criteria andTotaldayxlsNotIn(List<Double> values) {
            addCriterion("totaldayxls not in", values, "totaldayxls");
            return (Criteria) this;
        }

        public Criteria andTotaldayxlsBetween(Double value1, Double value2) {
            addCriterion("totaldayxls between", value1, value2, "totaldayxls");
            return (Criteria) this;
        }

        public Criteria andTotaldayxlsNotBetween(Double value1, Double value2) {
            addCriterion("totaldayxls not between", value1, value2, "totaldayxls");
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