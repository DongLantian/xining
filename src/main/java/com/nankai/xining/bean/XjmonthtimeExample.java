package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class XjmonthtimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XjmonthtimeExample() {
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

        public Criteria andMonthIdIsNull() {
            addCriterion("month_id is null");
            return (Criteria) this;
        }

        public Criteria andMonthIdIsNotNull() {
            addCriterion("month_id is not null");
            return (Criteria) this;
        }

        public Criteria andMonthIdEqualTo(Integer value) {
            addCriterion("month_id =", value, "monthId");
            return (Criteria) this;
        }

        public Criteria andMonthIdNotEqualTo(Integer value) {
            addCriterion("month_id <>", value, "monthId");
            return (Criteria) this;
        }

        public Criteria andMonthIdGreaterThan(Integer value) {
            addCriterion("month_id >", value, "monthId");
            return (Criteria) this;
        }

        public Criteria andMonthIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("month_id >=", value, "monthId");
            return (Criteria) this;
        }

        public Criteria andMonthIdLessThan(Integer value) {
            addCriterion("month_id <", value, "monthId");
            return (Criteria) this;
        }

        public Criteria andMonthIdLessThanOrEqualTo(Integer value) {
            addCriterion("month_id <=", value, "monthId");
            return (Criteria) this;
        }

        public Criteria andMonthIdIn(List<Integer> values) {
            addCriterion("month_id in", values, "monthId");
            return (Criteria) this;
        }

        public Criteria andMonthIdNotIn(List<Integer> values) {
            addCriterion("month_id not in", values, "monthId");
            return (Criteria) this;
        }

        public Criteria andMonthIdBetween(Integer value1, Integer value2) {
            addCriterion("month_id between", value1, value2, "monthId");
            return (Criteria) this;
        }

        public Criteria andMonthIdNotBetween(Integer value1, Integer value2) {
            addCriterion("month_id not between", value1, value2, "monthId");
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

        public Criteria andJanuaryEqualTo(Integer value) {
            addCriterion("january =", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryNotEqualTo(Integer value) {
            addCriterion("january <>", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryGreaterThan(Integer value) {
            addCriterion("january >", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("january >=", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryLessThan(Integer value) {
            addCriterion("january <", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryLessThanOrEqualTo(Integer value) {
            addCriterion("january <=", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryIn(List<Integer> values) {
            addCriterion("january in", values, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryNotIn(List<Integer> values) {
            addCriterion("january not in", values, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryBetween(Integer value1, Integer value2) {
            addCriterion("january between", value1, value2, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryNotBetween(Integer value1, Integer value2) {
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

        public Criteria andFebruaryEqualTo(Integer value) {
            addCriterion("february =", value, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryNotEqualTo(Integer value) {
            addCriterion("february <>", value, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryGreaterThan(Integer value) {
            addCriterion("february >", value, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("february >=", value, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryLessThan(Integer value) {
            addCriterion("february <", value, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryLessThanOrEqualTo(Integer value) {
            addCriterion("february <=", value, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryIn(List<Integer> values) {
            addCriterion("february in", values, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryNotIn(List<Integer> values) {
            addCriterion("february not in", values, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryBetween(Integer value1, Integer value2) {
            addCriterion("february between", value1, value2, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryNotBetween(Integer value1, Integer value2) {
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

        public Criteria andMarchEqualTo(Integer value) {
            addCriterion("march =", value, "march");
            return (Criteria) this;
        }

        public Criteria andMarchNotEqualTo(Integer value) {
            addCriterion("march <>", value, "march");
            return (Criteria) this;
        }

        public Criteria andMarchGreaterThan(Integer value) {
            addCriterion("march >", value, "march");
            return (Criteria) this;
        }

        public Criteria andMarchGreaterThanOrEqualTo(Integer value) {
            addCriterion("march >=", value, "march");
            return (Criteria) this;
        }

        public Criteria andMarchLessThan(Integer value) {
            addCriterion("march <", value, "march");
            return (Criteria) this;
        }

        public Criteria andMarchLessThanOrEqualTo(Integer value) {
            addCriterion("march <=", value, "march");
            return (Criteria) this;
        }

        public Criteria andMarchIn(List<Integer> values) {
            addCriterion("march in", values, "march");
            return (Criteria) this;
        }

        public Criteria andMarchNotIn(List<Integer> values) {
            addCriterion("march not in", values, "march");
            return (Criteria) this;
        }

        public Criteria andMarchBetween(Integer value1, Integer value2) {
            addCriterion("march between", value1, value2, "march");
            return (Criteria) this;
        }

        public Criteria andMarchNotBetween(Integer value1, Integer value2) {
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

        public Criteria andAprilEqualTo(Integer value) {
            addCriterion("april =", value, "april");
            return (Criteria) this;
        }

        public Criteria andAprilNotEqualTo(Integer value) {
            addCriterion("april <>", value, "april");
            return (Criteria) this;
        }

        public Criteria andAprilGreaterThan(Integer value) {
            addCriterion("april >", value, "april");
            return (Criteria) this;
        }

        public Criteria andAprilGreaterThanOrEqualTo(Integer value) {
            addCriterion("april >=", value, "april");
            return (Criteria) this;
        }

        public Criteria andAprilLessThan(Integer value) {
            addCriterion("april <", value, "april");
            return (Criteria) this;
        }

        public Criteria andAprilLessThanOrEqualTo(Integer value) {
            addCriterion("april <=", value, "april");
            return (Criteria) this;
        }

        public Criteria andAprilIn(List<Integer> values) {
            addCriterion("april in", values, "april");
            return (Criteria) this;
        }

        public Criteria andAprilNotIn(List<Integer> values) {
            addCriterion("april not in", values, "april");
            return (Criteria) this;
        }

        public Criteria andAprilBetween(Integer value1, Integer value2) {
            addCriterion("april between", value1, value2, "april");
            return (Criteria) this;
        }

        public Criteria andAprilNotBetween(Integer value1, Integer value2) {
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

        public Criteria andMayEqualTo(Integer value) {
            addCriterion("may =", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayNotEqualTo(Integer value) {
            addCriterion("may <>", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayGreaterThan(Integer value) {
            addCriterion("may >", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayGreaterThanOrEqualTo(Integer value) {
            addCriterion("may >=", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayLessThan(Integer value) {
            addCriterion("may <", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayLessThanOrEqualTo(Integer value) {
            addCriterion("may <=", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayIn(List<Integer> values) {
            addCriterion("may in", values, "may");
            return (Criteria) this;
        }

        public Criteria andMayNotIn(List<Integer> values) {
            addCriterion("may not in", values, "may");
            return (Criteria) this;
        }

        public Criteria andMayBetween(Integer value1, Integer value2) {
            addCriterion("may between", value1, value2, "may");
            return (Criteria) this;
        }

        public Criteria andMayNotBetween(Integer value1, Integer value2) {
            addCriterion("may not between", value1, value2, "may");
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

        public Criteria andJuneEqualTo(Integer value) {
            addCriterion("june =", value, "june");
            return (Criteria) this;
        }

        public Criteria andJuneNotEqualTo(Integer value) {
            addCriterion("june <>", value, "june");
            return (Criteria) this;
        }

        public Criteria andJuneGreaterThan(Integer value) {
            addCriterion("june >", value, "june");
            return (Criteria) this;
        }

        public Criteria andJuneGreaterThanOrEqualTo(Integer value) {
            addCriterion("june >=", value, "june");
            return (Criteria) this;
        }

        public Criteria andJuneLessThan(Integer value) {
            addCriterion("june <", value, "june");
            return (Criteria) this;
        }

        public Criteria andJuneLessThanOrEqualTo(Integer value) {
            addCriterion("june <=", value, "june");
            return (Criteria) this;
        }

        public Criteria andJuneIn(List<Integer> values) {
            addCriterion("june in", values, "june");
            return (Criteria) this;
        }

        public Criteria andJuneNotIn(List<Integer> values) {
            addCriterion("june not in", values, "june");
            return (Criteria) this;
        }

        public Criteria andJuneBetween(Integer value1, Integer value2) {
            addCriterion("june between", value1, value2, "june");
            return (Criteria) this;
        }

        public Criteria andJuneNotBetween(Integer value1, Integer value2) {
            addCriterion("june not between", value1, value2, "june");
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

        public Criteria andJulyEqualTo(Integer value) {
            addCriterion("july =", value, "july");
            return (Criteria) this;
        }

        public Criteria andJulyNotEqualTo(Integer value) {
            addCriterion("july <>", value, "july");
            return (Criteria) this;
        }

        public Criteria andJulyGreaterThan(Integer value) {
            addCriterion("july >", value, "july");
            return (Criteria) this;
        }

        public Criteria andJulyGreaterThanOrEqualTo(Integer value) {
            addCriterion("july >=", value, "july");
            return (Criteria) this;
        }

        public Criteria andJulyLessThan(Integer value) {
            addCriterion("july <", value, "july");
            return (Criteria) this;
        }

        public Criteria andJulyLessThanOrEqualTo(Integer value) {
            addCriterion("july <=", value, "july");
            return (Criteria) this;
        }

        public Criteria andJulyIn(List<Integer> values) {
            addCriterion("july in", values, "july");
            return (Criteria) this;
        }

        public Criteria andJulyNotIn(List<Integer> values) {
            addCriterion("july not in", values, "july");
            return (Criteria) this;
        }

        public Criteria andJulyBetween(Integer value1, Integer value2) {
            addCriterion("july between", value1, value2, "july");
            return (Criteria) this;
        }

        public Criteria andJulyNotBetween(Integer value1, Integer value2) {
            addCriterion("july not between", value1, value2, "july");
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

        public Criteria andAugustEqualTo(Integer value) {
            addCriterion("august =", value, "august");
            return (Criteria) this;
        }

        public Criteria andAugustNotEqualTo(Integer value) {
            addCriterion("august <>", value, "august");
            return (Criteria) this;
        }

        public Criteria andAugustGreaterThan(Integer value) {
            addCriterion("august >", value, "august");
            return (Criteria) this;
        }

        public Criteria andAugustGreaterThanOrEqualTo(Integer value) {
            addCriterion("august >=", value, "august");
            return (Criteria) this;
        }

        public Criteria andAugustLessThan(Integer value) {
            addCriterion("august <", value, "august");
            return (Criteria) this;
        }

        public Criteria andAugustLessThanOrEqualTo(Integer value) {
            addCriterion("august <=", value, "august");
            return (Criteria) this;
        }

        public Criteria andAugustIn(List<Integer> values) {
            addCriterion("august in", values, "august");
            return (Criteria) this;
        }

        public Criteria andAugustNotIn(List<Integer> values) {
            addCriterion("august not in", values, "august");
            return (Criteria) this;
        }

        public Criteria andAugustBetween(Integer value1, Integer value2) {
            addCriterion("august between", value1, value2, "august");
            return (Criteria) this;
        }

        public Criteria andAugustNotBetween(Integer value1, Integer value2) {
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

        public Criteria andSeptemberEqualTo(Integer value) {
            addCriterion("september =", value, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberNotEqualTo(Integer value) {
            addCriterion("september <>", value, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberGreaterThan(Integer value) {
            addCriterion("september >", value, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("september >=", value, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberLessThan(Integer value) {
            addCriterion("september <", value, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberLessThanOrEqualTo(Integer value) {
            addCriterion("september <=", value, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberIn(List<Integer> values) {
            addCriterion("september in", values, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberNotIn(List<Integer> values) {
            addCriterion("september not in", values, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberBetween(Integer value1, Integer value2) {
            addCriterion("september between", value1, value2, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberNotBetween(Integer value1, Integer value2) {
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

        public Criteria andOctoberEqualTo(Integer value) {
            addCriterion("october =", value, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberNotEqualTo(Integer value) {
            addCriterion("october <>", value, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberGreaterThan(Integer value) {
            addCriterion("october >", value, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberGreaterThanOrEqualTo(Integer value) {
            addCriterion("october >=", value, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberLessThan(Integer value) {
            addCriterion("october <", value, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberLessThanOrEqualTo(Integer value) {
            addCriterion("october <=", value, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberIn(List<Integer> values) {
            addCriterion("october in", values, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberNotIn(List<Integer> values) {
            addCriterion("october not in", values, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberBetween(Integer value1, Integer value2) {
            addCriterion("october between", value1, value2, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberNotBetween(Integer value1, Integer value2) {
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

        public Criteria andNovemberEqualTo(Integer value) {
            addCriterion("november =", value, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberNotEqualTo(Integer value) {
            addCriterion("november <>", value, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberGreaterThan(Integer value) {
            addCriterion("november >", value, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("november >=", value, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberLessThan(Integer value) {
            addCriterion("november <", value, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberLessThanOrEqualTo(Integer value) {
            addCriterion("november <=", value, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberIn(List<Integer> values) {
            addCriterion("november in", values, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberNotIn(List<Integer> values) {
            addCriterion("november not in", values, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberBetween(Integer value1, Integer value2) {
            addCriterion("november between", value1, value2, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberNotBetween(Integer value1, Integer value2) {
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

        public Criteria andDecemberEqualTo(Integer value) {
            addCriterion("december =", value, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberNotEqualTo(Integer value) {
            addCriterion("december <>", value, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberGreaterThan(Integer value) {
            addCriterion("december >", value, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("december >=", value, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberLessThan(Integer value) {
            addCriterion("december <", value, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberLessThanOrEqualTo(Integer value) {
            addCriterion("december <=", value, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberIn(List<Integer> values) {
            addCriterion("december in", values, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberNotIn(List<Integer> values) {
            addCriterion("december not in", values, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberBetween(Integer value1, Integer value2) {
            addCriterion("december between", value1, value2, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberNotBetween(Integer value1, Integer value2) {
            addCriterion("december not between", value1, value2, "december");
            return (Criteria) this;
        }

        public Criteria andTotalMonthIsNull() {
            addCriterion("total_month is null");
            return (Criteria) this;
        }

        public Criteria andTotalMonthIsNotNull() {
            addCriterion("total_month is not null");
            return (Criteria) this;
        }

        public Criteria andTotalMonthEqualTo(Integer value) {
            addCriterion("total_month =", value, "totalMonth");
            return (Criteria) this;
        }

        public Criteria andTotalMonthNotEqualTo(Integer value) {
            addCriterion("total_month <>", value, "totalMonth");
            return (Criteria) this;
        }

        public Criteria andTotalMonthGreaterThan(Integer value) {
            addCriterion("total_month >", value, "totalMonth");
            return (Criteria) this;
        }

        public Criteria andTotalMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_month >=", value, "totalMonth");
            return (Criteria) this;
        }

        public Criteria andTotalMonthLessThan(Integer value) {
            addCriterion("total_month <", value, "totalMonth");
            return (Criteria) this;
        }

        public Criteria andTotalMonthLessThanOrEqualTo(Integer value) {
            addCriterion("total_month <=", value, "totalMonth");
            return (Criteria) this;
        }

        public Criteria andTotalMonthIn(List<Integer> values) {
            addCriterion("total_month in", values, "totalMonth");
            return (Criteria) this;
        }

        public Criteria andTotalMonthNotIn(List<Integer> values) {
            addCriterion("total_month not in", values, "totalMonth");
            return (Criteria) this;
        }

        public Criteria andTotalMonthBetween(Integer value1, Integer value2) {
            addCriterion("total_month between", value1, value2, "totalMonth");
            return (Criteria) this;
        }

        public Criteria andTotalMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("total_month not between", value1, value2, "totalMonth");
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