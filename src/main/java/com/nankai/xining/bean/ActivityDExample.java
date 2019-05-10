package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class ActivityDExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityDExample() {
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

        public Criteria andDayIdIsNull() {
            addCriterion("day_id is null");
            return (Criteria) this;
        }

        public Criteria andDayIdIsNotNull() {
            addCriterion("day_id is not null");
            return (Criteria) this;
        }

        public Criteria andDayIdEqualTo(Integer value) {
            addCriterion("day_id =", value, "dayId");
            return (Criteria) this;
        }

        public Criteria andDayIdNotEqualTo(Integer value) {
            addCriterion("day_id <>", value, "dayId");
            return (Criteria) this;
        }

        public Criteria andDayIdGreaterThan(Integer value) {
            addCriterion("day_id >", value, "dayId");
            return (Criteria) this;
        }

        public Criteria andDayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("day_id >=", value, "dayId");
            return (Criteria) this;
        }

        public Criteria andDayIdLessThan(Integer value) {
            addCriterion("day_id <", value, "dayId");
            return (Criteria) this;
        }

        public Criteria andDayIdLessThanOrEqualTo(Integer value) {
            addCriterion("day_id <=", value, "dayId");
            return (Criteria) this;
        }

        public Criteria andDayIdIn(List<Integer> values) {
            addCriterion("day_id in", values, "dayId");
            return (Criteria) this;
        }

        public Criteria andDayIdNotIn(List<Integer> values) {
            addCriterion("day_id not in", values, "dayId");
            return (Criteria) this;
        }

        public Criteria andDayIdBetween(Integer value1, Integer value2) {
            addCriterion("day_id between", value1, value2, "dayId");
            return (Criteria) this;
        }

        public Criteria andDayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("day_id not between", value1, value2, "dayId");
            return (Criteria) this;
        }

        public Criteria andAmOneIsNull() {
            addCriterion("am_one is null");
            return (Criteria) this;
        }

        public Criteria andAmOneIsNotNull() {
            addCriterion("am_one is not null");
            return (Criteria) this;
        }

        public Criteria andAmOneEqualTo(Integer value) {
            addCriterion("am_one =", value, "amOne");
            return (Criteria) this;
        }

        public Criteria andAmOneNotEqualTo(Integer value) {
            addCriterion("am_one <>", value, "amOne");
            return (Criteria) this;
        }

        public Criteria andAmOneGreaterThan(Integer value) {
            addCriterion("am_one >", value, "amOne");
            return (Criteria) this;
        }

        public Criteria andAmOneGreaterThanOrEqualTo(Integer value) {
            addCriterion("am_one >=", value, "amOne");
            return (Criteria) this;
        }

        public Criteria andAmOneLessThan(Integer value) {
            addCriterion("am_one <", value, "amOne");
            return (Criteria) this;
        }

        public Criteria andAmOneLessThanOrEqualTo(Integer value) {
            addCriterion("am_one <=", value, "amOne");
            return (Criteria) this;
        }

        public Criteria andAmOneIn(List<Integer> values) {
            addCriterion("am_one in", values, "amOne");
            return (Criteria) this;
        }

        public Criteria andAmOneNotIn(List<Integer> values) {
            addCriterion("am_one not in", values, "amOne");
            return (Criteria) this;
        }

        public Criteria andAmOneBetween(Integer value1, Integer value2) {
            addCriterion("am_one between", value1, value2, "amOne");
            return (Criteria) this;
        }

        public Criteria andAmOneNotBetween(Integer value1, Integer value2) {
            addCriterion("am_one not between", value1, value2, "amOne");
            return (Criteria) this;
        }

        public Criteria andAmTwoIsNull() {
            addCriterion("am_two is null");
            return (Criteria) this;
        }

        public Criteria andAmTwoIsNotNull() {
            addCriterion("am_two is not null");
            return (Criteria) this;
        }

        public Criteria andAmTwoEqualTo(Integer value) {
            addCriterion("am_two =", value, "amTwo");
            return (Criteria) this;
        }

        public Criteria andAmTwoNotEqualTo(Integer value) {
            addCriterion("am_two <>", value, "amTwo");
            return (Criteria) this;
        }

        public Criteria andAmTwoGreaterThan(Integer value) {
            addCriterion("am_two >", value, "amTwo");
            return (Criteria) this;
        }

        public Criteria andAmTwoGreaterThanOrEqualTo(Integer value) {
            addCriterion("am_two >=", value, "amTwo");
            return (Criteria) this;
        }

        public Criteria andAmTwoLessThan(Integer value) {
            addCriterion("am_two <", value, "amTwo");
            return (Criteria) this;
        }

        public Criteria andAmTwoLessThanOrEqualTo(Integer value) {
            addCriterion("am_two <=", value, "amTwo");
            return (Criteria) this;
        }

        public Criteria andAmTwoIn(List<Integer> values) {
            addCriterion("am_two in", values, "amTwo");
            return (Criteria) this;
        }

        public Criteria andAmTwoNotIn(List<Integer> values) {
            addCriterion("am_two not in", values, "amTwo");
            return (Criteria) this;
        }

        public Criteria andAmTwoBetween(Integer value1, Integer value2) {
            addCriterion("am_two between", value1, value2, "amTwo");
            return (Criteria) this;
        }

        public Criteria andAmTwoNotBetween(Integer value1, Integer value2) {
            addCriterion("am_two not between", value1, value2, "amTwo");
            return (Criteria) this;
        }

        public Criteria andAmThreeIsNull() {
            addCriterion("am_three is null");
            return (Criteria) this;
        }

        public Criteria andAmThreeIsNotNull() {
            addCriterion("am_three is not null");
            return (Criteria) this;
        }

        public Criteria andAmThreeEqualTo(Integer value) {
            addCriterion("am_three =", value, "amThree");
            return (Criteria) this;
        }

        public Criteria andAmThreeNotEqualTo(Integer value) {
            addCriterion("am_three <>", value, "amThree");
            return (Criteria) this;
        }

        public Criteria andAmThreeGreaterThan(Integer value) {
            addCriterion("am_three >", value, "amThree");
            return (Criteria) this;
        }

        public Criteria andAmThreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("am_three >=", value, "amThree");
            return (Criteria) this;
        }

        public Criteria andAmThreeLessThan(Integer value) {
            addCriterion("am_three <", value, "amThree");
            return (Criteria) this;
        }

        public Criteria andAmThreeLessThanOrEqualTo(Integer value) {
            addCriterion("am_three <=", value, "amThree");
            return (Criteria) this;
        }

        public Criteria andAmThreeIn(List<Integer> values) {
            addCriterion("am_three in", values, "amThree");
            return (Criteria) this;
        }

        public Criteria andAmThreeNotIn(List<Integer> values) {
            addCriterion("am_three not in", values, "amThree");
            return (Criteria) this;
        }

        public Criteria andAmThreeBetween(Integer value1, Integer value2) {
            addCriterion("am_three between", value1, value2, "amThree");
            return (Criteria) this;
        }

        public Criteria andAmThreeNotBetween(Integer value1, Integer value2) {
            addCriterion("am_three not between", value1, value2, "amThree");
            return (Criteria) this;
        }

        public Criteria andAmFourIsNull() {
            addCriterion("am_four is null");
            return (Criteria) this;
        }

        public Criteria andAmFourIsNotNull() {
            addCriterion("am_four is not null");
            return (Criteria) this;
        }

        public Criteria andAmFourEqualTo(Integer value) {
            addCriterion("am_four =", value, "amFour");
            return (Criteria) this;
        }

        public Criteria andAmFourNotEqualTo(Integer value) {
            addCriterion("am_four <>", value, "amFour");
            return (Criteria) this;
        }

        public Criteria andAmFourGreaterThan(Integer value) {
            addCriterion("am_four >", value, "amFour");
            return (Criteria) this;
        }

        public Criteria andAmFourGreaterThanOrEqualTo(Integer value) {
            addCriterion("am_four >=", value, "amFour");
            return (Criteria) this;
        }

        public Criteria andAmFourLessThan(Integer value) {
            addCriterion("am_four <", value, "amFour");
            return (Criteria) this;
        }

        public Criteria andAmFourLessThanOrEqualTo(Integer value) {
            addCriterion("am_four <=", value, "amFour");
            return (Criteria) this;
        }

        public Criteria andAmFourIn(List<Integer> values) {
            addCriterion("am_four in", values, "amFour");
            return (Criteria) this;
        }

        public Criteria andAmFourNotIn(List<Integer> values) {
            addCriterion("am_four not in", values, "amFour");
            return (Criteria) this;
        }

        public Criteria andAmFourBetween(Integer value1, Integer value2) {
            addCriterion("am_four between", value1, value2, "amFour");
            return (Criteria) this;
        }

        public Criteria andAmFourNotBetween(Integer value1, Integer value2) {
            addCriterion("am_four not between", value1, value2, "amFour");
            return (Criteria) this;
        }

        public Criteria andAmFiveIsNull() {
            addCriterion("am_five is null");
            return (Criteria) this;
        }

        public Criteria andAmFiveIsNotNull() {
            addCriterion("am_five is not null");
            return (Criteria) this;
        }

        public Criteria andAmFiveEqualTo(Integer value) {
            addCriterion("am_five =", value, "amFive");
            return (Criteria) this;
        }

        public Criteria andAmFiveNotEqualTo(Integer value) {
            addCriterion("am_five <>", value, "amFive");
            return (Criteria) this;
        }

        public Criteria andAmFiveGreaterThan(Integer value) {
            addCriterion("am_five >", value, "amFive");
            return (Criteria) this;
        }

        public Criteria andAmFiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("am_five >=", value, "amFive");
            return (Criteria) this;
        }

        public Criteria andAmFiveLessThan(Integer value) {
            addCriterion("am_five <", value, "amFive");
            return (Criteria) this;
        }

        public Criteria andAmFiveLessThanOrEqualTo(Integer value) {
            addCriterion("am_five <=", value, "amFive");
            return (Criteria) this;
        }

        public Criteria andAmFiveIn(List<Integer> values) {
            addCriterion("am_five in", values, "amFive");
            return (Criteria) this;
        }

        public Criteria andAmFiveNotIn(List<Integer> values) {
            addCriterion("am_five not in", values, "amFive");
            return (Criteria) this;
        }

        public Criteria andAmFiveBetween(Integer value1, Integer value2) {
            addCriterion("am_five between", value1, value2, "amFive");
            return (Criteria) this;
        }

        public Criteria andAmFiveNotBetween(Integer value1, Integer value2) {
            addCriterion("am_five not between", value1, value2, "amFive");
            return (Criteria) this;
        }

        public Criteria andAmSixIsNull() {
            addCriterion("am_six is null");
            return (Criteria) this;
        }

        public Criteria andAmSixIsNotNull() {
            addCriterion("am_six is not null");
            return (Criteria) this;
        }

        public Criteria andAmSixEqualTo(Integer value) {
            addCriterion("am_six =", value, "amSix");
            return (Criteria) this;
        }

        public Criteria andAmSixNotEqualTo(Integer value) {
            addCriterion("am_six <>", value, "amSix");
            return (Criteria) this;
        }

        public Criteria andAmSixGreaterThan(Integer value) {
            addCriterion("am_six >", value, "amSix");
            return (Criteria) this;
        }

        public Criteria andAmSixGreaterThanOrEqualTo(Integer value) {
            addCriterion("am_six >=", value, "amSix");
            return (Criteria) this;
        }

        public Criteria andAmSixLessThan(Integer value) {
            addCriterion("am_six <", value, "amSix");
            return (Criteria) this;
        }

        public Criteria andAmSixLessThanOrEqualTo(Integer value) {
            addCriterion("am_six <=", value, "amSix");
            return (Criteria) this;
        }

        public Criteria andAmSixIn(List<Integer> values) {
            addCriterion("am_six in", values, "amSix");
            return (Criteria) this;
        }

        public Criteria andAmSixNotIn(List<Integer> values) {
            addCriterion("am_six not in", values, "amSix");
            return (Criteria) this;
        }

        public Criteria andAmSixBetween(Integer value1, Integer value2) {
            addCriterion("am_six between", value1, value2, "amSix");
            return (Criteria) this;
        }

        public Criteria andAmSixNotBetween(Integer value1, Integer value2) {
            addCriterion("am_six not between", value1, value2, "amSix");
            return (Criteria) this;
        }

        public Criteria andAmSevenIsNull() {
            addCriterion("am_seven is null");
            return (Criteria) this;
        }

        public Criteria andAmSevenIsNotNull() {
            addCriterion("am_seven is not null");
            return (Criteria) this;
        }

        public Criteria andAmSevenEqualTo(Integer value) {
            addCriterion("am_seven =", value, "amSeven");
            return (Criteria) this;
        }

        public Criteria andAmSevenNotEqualTo(Integer value) {
            addCriterion("am_seven <>", value, "amSeven");
            return (Criteria) this;
        }

        public Criteria andAmSevenGreaterThan(Integer value) {
            addCriterion("am_seven >", value, "amSeven");
            return (Criteria) this;
        }

        public Criteria andAmSevenGreaterThanOrEqualTo(Integer value) {
            addCriterion("am_seven >=", value, "amSeven");
            return (Criteria) this;
        }

        public Criteria andAmSevenLessThan(Integer value) {
            addCriterion("am_seven <", value, "amSeven");
            return (Criteria) this;
        }

        public Criteria andAmSevenLessThanOrEqualTo(Integer value) {
            addCriterion("am_seven <=", value, "amSeven");
            return (Criteria) this;
        }

        public Criteria andAmSevenIn(List<Integer> values) {
            addCriterion("am_seven in", values, "amSeven");
            return (Criteria) this;
        }

        public Criteria andAmSevenNotIn(List<Integer> values) {
            addCriterion("am_seven not in", values, "amSeven");
            return (Criteria) this;
        }

        public Criteria andAmSevenBetween(Integer value1, Integer value2) {
            addCriterion("am_seven between", value1, value2, "amSeven");
            return (Criteria) this;
        }

        public Criteria andAmSevenNotBetween(Integer value1, Integer value2) {
            addCriterion("am_seven not between", value1, value2, "amSeven");
            return (Criteria) this;
        }

        public Criteria andAmEightIsNull() {
            addCriterion("am_eight is null");
            return (Criteria) this;
        }

        public Criteria andAmEightIsNotNull() {
            addCriterion("am_eight is not null");
            return (Criteria) this;
        }

        public Criteria andAmEightEqualTo(Integer value) {
            addCriterion("am_eight =", value, "amEight");
            return (Criteria) this;
        }

        public Criteria andAmEightNotEqualTo(Integer value) {
            addCriterion("am_eight <>", value, "amEight");
            return (Criteria) this;
        }

        public Criteria andAmEightGreaterThan(Integer value) {
            addCriterion("am_eight >", value, "amEight");
            return (Criteria) this;
        }

        public Criteria andAmEightGreaterThanOrEqualTo(Integer value) {
            addCriterion("am_eight >=", value, "amEight");
            return (Criteria) this;
        }

        public Criteria andAmEightLessThan(Integer value) {
            addCriterion("am_eight <", value, "amEight");
            return (Criteria) this;
        }

        public Criteria andAmEightLessThanOrEqualTo(Integer value) {
            addCriterion("am_eight <=", value, "amEight");
            return (Criteria) this;
        }

        public Criteria andAmEightIn(List<Integer> values) {
            addCriterion("am_eight in", values, "amEight");
            return (Criteria) this;
        }

        public Criteria andAmEightNotIn(List<Integer> values) {
            addCriterion("am_eight not in", values, "amEight");
            return (Criteria) this;
        }

        public Criteria andAmEightBetween(Integer value1, Integer value2) {
            addCriterion("am_eight between", value1, value2, "amEight");
            return (Criteria) this;
        }

        public Criteria andAmEightNotBetween(Integer value1, Integer value2) {
            addCriterion("am_eight not between", value1, value2, "amEight");
            return (Criteria) this;
        }

        public Criteria andAmNineIsNull() {
            addCriterion("am_nine is null");
            return (Criteria) this;
        }

        public Criteria andAmNineIsNotNull() {
            addCriterion("am_nine is not null");
            return (Criteria) this;
        }

        public Criteria andAmNineEqualTo(Integer value) {
            addCriterion("am_nine =", value, "amNine");
            return (Criteria) this;
        }

        public Criteria andAmNineNotEqualTo(Integer value) {
            addCriterion("am_nine <>", value, "amNine");
            return (Criteria) this;
        }

        public Criteria andAmNineGreaterThan(Integer value) {
            addCriterion("am_nine >", value, "amNine");
            return (Criteria) this;
        }

        public Criteria andAmNineGreaterThanOrEqualTo(Integer value) {
            addCriterion("am_nine >=", value, "amNine");
            return (Criteria) this;
        }

        public Criteria andAmNineLessThan(Integer value) {
            addCriterion("am_nine <", value, "amNine");
            return (Criteria) this;
        }

        public Criteria andAmNineLessThanOrEqualTo(Integer value) {
            addCriterion("am_nine <=", value, "amNine");
            return (Criteria) this;
        }

        public Criteria andAmNineIn(List<Integer> values) {
            addCriterion("am_nine in", values, "amNine");
            return (Criteria) this;
        }

        public Criteria andAmNineNotIn(List<Integer> values) {
            addCriterion("am_nine not in", values, "amNine");
            return (Criteria) this;
        }

        public Criteria andAmNineBetween(Integer value1, Integer value2) {
            addCriterion("am_nine between", value1, value2, "amNine");
            return (Criteria) this;
        }

        public Criteria andAmNineNotBetween(Integer value1, Integer value2) {
            addCriterion("am_nine not between", value1, value2, "amNine");
            return (Criteria) this;
        }

        public Criteria andAmTenIsNull() {
            addCriterion("am_ten is null");
            return (Criteria) this;
        }

        public Criteria andAmTenIsNotNull() {
            addCriterion("am_ten is not null");
            return (Criteria) this;
        }

        public Criteria andAmTenEqualTo(Integer value) {
            addCriterion("am_ten =", value, "amTen");
            return (Criteria) this;
        }

        public Criteria andAmTenNotEqualTo(Integer value) {
            addCriterion("am_ten <>", value, "amTen");
            return (Criteria) this;
        }

        public Criteria andAmTenGreaterThan(Integer value) {
            addCriterion("am_ten >", value, "amTen");
            return (Criteria) this;
        }

        public Criteria andAmTenGreaterThanOrEqualTo(Integer value) {
            addCriterion("am_ten >=", value, "amTen");
            return (Criteria) this;
        }

        public Criteria andAmTenLessThan(Integer value) {
            addCriterion("am_ten <", value, "amTen");
            return (Criteria) this;
        }

        public Criteria andAmTenLessThanOrEqualTo(Integer value) {
            addCriterion("am_ten <=", value, "amTen");
            return (Criteria) this;
        }

        public Criteria andAmTenIn(List<Integer> values) {
            addCriterion("am_ten in", values, "amTen");
            return (Criteria) this;
        }

        public Criteria andAmTenNotIn(List<Integer> values) {
            addCriterion("am_ten not in", values, "amTen");
            return (Criteria) this;
        }

        public Criteria andAmTenBetween(Integer value1, Integer value2) {
            addCriterion("am_ten between", value1, value2, "amTen");
            return (Criteria) this;
        }

        public Criteria andAmTenNotBetween(Integer value1, Integer value2) {
            addCriterion("am_ten not between", value1, value2, "amTen");
            return (Criteria) this;
        }

        public Criteria andAmElevenIsNull() {
            addCriterion("am_eleven is null");
            return (Criteria) this;
        }

        public Criteria andAmElevenIsNotNull() {
            addCriterion("am_eleven is not null");
            return (Criteria) this;
        }

        public Criteria andAmElevenEqualTo(Integer value) {
            addCriterion("am_eleven =", value, "amEleven");
            return (Criteria) this;
        }

        public Criteria andAmElevenNotEqualTo(Integer value) {
            addCriterion("am_eleven <>", value, "amEleven");
            return (Criteria) this;
        }

        public Criteria andAmElevenGreaterThan(Integer value) {
            addCriterion("am_eleven >", value, "amEleven");
            return (Criteria) this;
        }

        public Criteria andAmElevenGreaterThanOrEqualTo(Integer value) {
            addCriterion("am_eleven >=", value, "amEleven");
            return (Criteria) this;
        }

        public Criteria andAmElevenLessThan(Integer value) {
            addCriterion("am_eleven <", value, "amEleven");
            return (Criteria) this;
        }

        public Criteria andAmElevenLessThanOrEqualTo(Integer value) {
            addCriterion("am_eleven <=", value, "amEleven");
            return (Criteria) this;
        }

        public Criteria andAmElevenIn(List<Integer> values) {
            addCriterion("am_eleven in", values, "amEleven");
            return (Criteria) this;
        }

        public Criteria andAmElevenNotIn(List<Integer> values) {
            addCriterion("am_eleven not in", values, "amEleven");
            return (Criteria) this;
        }

        public Criteria andAmElevenBetween(Integer value1, Integer value2) {
            addCriterion("am_eleven between", value1, value2, "amEleven");
            return (Criteria) this;
        }

        public Criteria andAmElevenNotBetween(Integer value1, Integer value2) {
            addCriterion("am_eleven not between", value1, value2, "amEleven");
            return (Criteria) this;
        }

        public Criteria andAmTwelveIsNull() {
            addCriterion("am_twelve is null");
            return (Criteria) this;
        }

        public Criteria andAmTwelveIsNotNull() {
            addCriterion("am_twelve is not null");
            return (Criteria) this;
        }

        public Criteria andAmTwelveEqualTo(Integer value) {
            addCriterion("am_twelve =", value, "amTwelve");
            return (Criteria) this;
        }

        public Criteria andAmTwelveNotEqualTo(Integer value) {
            addCriterion("am_twelve <>", value, "amTwelve");
            return (Criteria) this;
        }

        public Criteria andAmTwelveGreaterThan(Integer value) {
            addCriterion("am_twelve >", value, "amTwelve");
            return (Criteria) this;
        }

        public Criteria andAmTwelveGreaterThanOrEqualTo(Integer value) {
            addCriterion("am_twelve >=", value, "amTwelve");
            return (Criteria) this;
        }

        public Criteria andAmTwelveLessThan(Integer value) {
            addCriterion("am_twelve <", value, "amTwelve");
            return (Criteria) this;
        }

        public Criteria andAmTwelveLessThanOrEqualTo(Integer value) {
            addCriterion("am_twelve <=", value, "amTwelve");
            return (Criteria) this;
        }

        public Criteria andAmTwelveIn(List<Integer> values) {
            addCriterion("am_twelve in", values, "amTwelve");
            return (Criteria) this;
        }

        public Criteria andAmTwelveNotIn(List<Integer> values) {
            addCriterion("am_twelve not in", values, "amTwelve");
            return (Criteria) this;
        }

        public Criteria andAmTwelveBetween(Integer value1, Integer value2) {
            addCriterion("am_twelve between", value1, value2, "amTwelve");
            return (Criteria) this;
        }

        public Criteria andAmTwelveNotBetween(Integer value1, Integer value2) {
            addCriterion("am_twelve not between", value1, value2, "amTwelve");
            return (Criteria) this;
        }

        public Criteria andPmOneIsNull() {
            addCriterion("pm_one is null");
            return (Criteria) this;
        }

        public Criteria andPmOneIsNotNull() {
            addCriterion("pm_one is not null");
            return (Criteria) this;
        }

        public Criteria andPmOneEqualTo(Integer value) {
            addCriterion("pm_one =", value, "pmOne");
            return (Criteria) this;
        }

        public Criteria andPmOneNotEqualTo(Integer value) {
            addCriterion("pm_one <>", value, "pmOne");
            return (Criteria) this;
        }

        public Criteria andPmOneGreaterThan(Integer value) {
            addCriterion("pm_one >", value, "pmOne");
            return (Criteria) this;
        }

        public Criteria andPmOneGreaterThanOrEqualTo(Integer value) {
            addCriterion("pm_one >=", value, "pmOne");
            return (Criteria) this;
        }

        public Criteria andPmOneLessThan(Integer value) {
            addCriterion("pm_one <", value, "pmOne");
            return (Criteria) this;
        }

        public Criteria andPmOneLessThanOrEqualTo(Integer value) {
            addCriterion("pm_one <=", value, "pmOne");
            return (Criteria) this;
        }

        public Criteria andPmOneIn(List<Integer> values) {
            addCriterion("pm_one in", values, "pmOne");
            return (Criteria) this;
        }

        public Criteria andPmOneNotIn(List<Integer> values) {
            addCriterion("pm_one not in", values, "pmOne");
            return (Criteria) this;
        }

        public Criteria andPmOneBetween(Integer value1, Integer value2) {
            addCriterion("pm_one between", value1, value2, "pmOne");
            return (Criteria) this;
        }

        public Criteria andPmOneNotBetween(Integer value1, Integer value2) {
            addCriterion("pm_one not between", value1, value2, "pmOne");
            return (Criteria) this;
        }

        public Criteria andPmTwoIsNull() {
            addCriterion("pm_two is null");
            return (Criteria) this;
        }

        public Criteria andPmTwoIsNotNull() {
            addCriterion("pm_two is not null");
            return (Criteria) this;
        }

        public Criteria andPmTwoEqualTo(Integer value) {
            addCriterion("pm_two =", value, "pmTwo");
            return (Criteria) this;
        }

        public Criteria andPmTwoNotEqualTo(Integer value) {
            addCriterion("pm_two <>", value, "pmTwo");
            return (Criteria) this;
        }

        public Criteria andPmTwoGreaterThan(Integer value) {
            addCriterion("pm_two >", value, "pmTwo");
            return (Criteria) this;
        }

        public Criteria andPmTwoGreaterThanOrEqualTo(Integer value) {
            addCriterion("pm_two >=", value, "pmTwo");
            return (Criteria) this;
        }

        public Criteria andPmTwoLessThan(Integer value) {
            addCriterion("pm_two <", value, "pmTwo");
            return (Criteria) this;
        }

        public Criteria andPmTwoLessThanOrEqualTo(Integer value) {
            addCriterion("pm_two <=", value, "pmTwo");
            return (Criteria) this;
        }

        public Criteria andPmTwoIn(List<Integer> values) {
            addCriterion("pm_two in", values, "pmTwo");
            return (Criteria) this;
        }

        public Criteria andPmTwoNotIn(List<Integer> values) {
            addCriterion("pm_two not in", values, "pmTwo");
            return (Criteria) this;
        }

        public Criteria andPmTwoBetween(Integer value1, Integer value2) {
            addCriterion("pm_two between", value1, value2, "pmTwo");
            return (Criteria) this;
        }

        public Criteria andPmTwoNotBetween(Integer value1, Integer value2) {
            addCriterion("pm_two not between", value1, value2, "pmTwo");
            return (Criteria) this;
        }

        public Criteria andPmThreeIsNull() {
            addCriterion("pm_three is null");
            return (Criteria) this;
        }

        public Criteria andPmThreeIsNotNull() {
            addCriterion("pm_three is not null");
            return (Criteria) this;
        }

        public Criteria andPmThreeEqualTo(Integer value) {
            addCriterion("pm_three =", value, "pmThree");
            return (Criteria) this;
        }

        public Criteria andPmThreeNotEqualTo(Integer value) {
            addCriterion("pm_three <>", value, "pmThree");
            return (Criteria) this;
        }

        public Criteria andPmThreeGreaterThan(Integer value) {
            addCriterion("pm_three >", value, "pmThree");
            return (Criteria) this;
        }

        public Criteria andPmThreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pm_three >=", value, "pmThree");
            return (Criteria) this;
        }

        public Criteria andPmThreeLessThan(Integer value) {
            addCriterion("pm_three <", value, "pmThree");
            return (Criteria) this;
        }

        public Criteria andPmThreeLessThanOrEqualTo(Integer value) {
            addCriterion("pm_three <=", value, "pmThree");
            return (Criteria) this;
        }

        public Criteria andPmThreeIn(List<Integer> values) {
            addCriterion("pm_three in", values, "pmThree");
            return (Criteria) this;
        }

        public Criteria andPmThreeNotIn(List<Integer> values) {
            addCriterion("pm_three not in", values, "pmThree");
            return (Criteria) this;
        }

        public Criteria andPmThreeBetween(Integer value1, Integer value2) {
            addCriterion("pm_three between", value1, value2, "pmThree");
            return (Criteria) this;
        }

        public Criteria andPmThreeNotBetween(Integer value1, Integer value2) {
            addCriterion("pm_three not between", value1, value2, "pmThree");
            return (Criteria) this;
        }

        public Criteria andPmFourIsNull() {
            addCriterion("pm_four is null");
            return (Criteria) this;
        }

        public Criteria andPmFourIsNotNull() {
            addCriterion("pm_four is not null");
            return (Criteria) this;
        }

        public Criteria andPmFourEqualTo(Integer value) {
            addCriterion("pm_four =", value, "pmFour");
            return (Criteria) this;
        }

        public Criteria andPmFourNotEqualTo(Integer value) {
            addCriterion("pm_four <>", value, "pmFour");
            return (Criteria) this;
        }

        public Criteria andPmFourGreaterThan(Integer value) {
            addCriterion("pm_four >", value, "pmFour");
            return (Criteria) this;
        }

        public Criteria andPmFourGreaterThanOrEqualTo(Integer value) {
            addCriterion("pm_four >=", value, "pmFour");
            return (Criteria) this;
        }

        public Criteria andPmFourLessThan(Integer value) {
            addCriterion("pm_four <", value, "pmFour");
            return (Criteria) this;
        }

        public Criteria andPmFourLessThanOrEqualTo(Integer value) {
            addCriterion("pm_four <=", value, "pmFour");
            return (Criteria) this;
        }

        public Criteria andPmFourIn(List<Integer> values) {
            addCriterion("pm_four in", values, "pmFour");
            return (Criteria) this;
        }

        public Criteria andPmFourNotIn(List<Integer> values) {
            addCriterion("pm_four not in", values, "pmFour");
            return (Criteria) this;
        }

        public Criteria andPmFourBetween(Integer value1, Integer value2) {
            addCriterion("pm_four between", value1, value2, "pmFour");
            return (Criteria) this;
        }

        public Criteria andPmFourNotBetween(Integer value1, Integer value2) {
            addCriterion("pm_four not between", value1, value2, "pmFour");
            return (Criteria) this;
        }

        public Criteria andPmFiveIsNull() {
            addCriterion("pm_five is null");
            return (Criteria) this;
        }

        public Criteria andPmFiveIsNotNull() {
            addCriterion("pm_five is not null");
            return (Criteria) this;
        }

        public Criteria andPmFiveEqualTo(Integer value) {
            addCriterion("pm_five =", value, "pmFive");
            return (Criteria) this;
        }

        public Criteria andPmFiveNotEqualTo(Integer value) {
            addCriterion("pm_five <>", value, "pmFive");
            return (Criteria) this;
        }

        public Criteria andPmFiveGreaterThan(Integer value) {
            addCriterion("pm_five >", value, "pmFive");
            return (Criteria) this;
        }

        public Criteria andPmFiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("pm_five >=", value, "pmFive");
            return (Criteria) this;
        }

        public Criteria andPmFiveLessThan(Integer value) {
            addCriterion("pm_five <", value, "pmFive");
            return (Criteria) this;
        }

        public Criteria andPmFiveLessThanOrEqualTo(Integer value) {
            addCriterion("pm_five <=", value, "pmFive");
            return (Criteria) this;
        }

        public Criteria andPmFiveIn(List<Integer> values) {
            addCriterion("pm_five in", values, "pmFive");
            return (Criteria) this;
        }

        public Criteria andPmFiveNotIn(List<Integer> values) {
            addCriterion("pm_five not in", values, "pmFive");
            return (Criteria) this;
        }

        public Criteria andPmFiveBetween(Integer value1, Integer value2) {
            addCriterion("pm_five between", value1, value2, "pmFive");
            return (Criteria) this;
        }

        public Criteria andPmFiveNotBetween(Integer value1, Integer value2) {
            addCriterion("pm_five not between", value1, value2, "pmFive");
            return (Criteria) this;
        }

        public Criteria andPmSixIsNull() {
            addCriterion("pm_six is null");
            return (Criteria) this;
        }

        public Criteria andPmSixIsNotNull() {
            addCriterion("pm_six is not null");
            return (Criteria) this;
        }

        public Criteria andPmSixEqualTo(Integer value) {
            addCriterion("pm_six =", value, "pmSix");
            return (Criteria) this;
        }

        public Criteria andPmSixNotEqualTo(Integer value) {
            addCriterion("pm_six <>", value, "pmSix");
            return (Criteria) this;
        }

        public Criteria andPmSixGreaterThan(Integer value) {
            addCriterion("pm_six >", value, "pmSix");
            return (Criteria) this;
        }

        public Criteria andPmSixGreaterThanOrEqualTo(Integer value) {
            addCriterion("pm_six >=", value, "pmSix");
            return (Criteria) this;
        }

        public Criteria andPmSixLessThan(Integer value) {
            addCriterion("pm_six <", value, "pmSix");
            return (Criteria) this;
        }

        public Criteria andPmSixLessThanOrEqualTo(Integer value) {
            addCriterion("pm_six <=", value, "pmSix");
            return (Criteria) this;
        }

        public Criteria andPmSixIn(List<Integer> values) {
            addCriterion("pm_six in", values, "pmSix");
            return (Criteria) this;
        }

        public Criteria andPmSixNotIn(List<Integer> values) {
            addCriterion("pm_six not in", values, "pmSix");
            return (Criteria) this;
        }

        public Criteria andPmSixBetween(Integer value1, Integer value2) {
            addCriterion("pm_six between", value1, value2, "pmSix");
            return (Criteria) this;
        }

        public Criteria andPmSixNotBetween(Integer value1, Integer value2) {
            addCriterion("pm_six not between", value1, value2, "pmSix");
            return (Criteria) this;
        }

        public Criteria andPmSevenIsNull() {
            addCriterion("pm_seven is null");
            return (Criteria) this;
        }

        public Criteria andPmSevenIsNotNull() {
            addCriterion("pm_seven is not null");
            return (Criteria) this;
        }

        public Criteria andPmSevenEqualTo(Integer value) {
            addCriterion("pm_seven =", value, "pmSeven");
            return (Criteria) this;
        }

        public Criteria andPmSevenNotEqualTo(Integer value) {
            addCriterion("pm_seven <>", value, "pmSeven");
            return (Criteria) this;
        }

        public Criteria andPmSevenGreaterThan(Integer value) {
            addCriterion("pm_seven >", value, "pmSeven");
            return (Criteria) this;
        }

        public Criteria andPmSevenGreaterThanOrEqualTo(Integer value) {
            addCriterion("pm_seven >=", value, "pmSeven");
            return (Criteria) this;
        }

        public Criteria andPmSevenLessThan(Integer value) {
            addCriterion("pm_seven <", value, "pmSeven");
            return (Criteria) this;
        }

        public Criteria andPmSevenLessThanOrEqualTo(Integer value) {
            addCriterion("pm_seven <=", value, "pmSeven");
            return (Criteria) this;
        }

        public Criteria andPmSevenIn(List<Integer> values) {
            addCriterion("pm_seven in", values, "pmSeven");
            return (Criteria) this;
        }

        public Criteria andPmSevenNotIn(List<Integer> values) {
            addCriterion("pm_seven not in", values, "pmSeven");
            return (Criteria) this;
        }

        public Criteria andPmSevenBetween(Integer value1, Integer value2) {
            addCriterion("pm_seven between", value1, value2, "pmSeven");
            return (Criteria) this;
        }

        public Criteria andPmSevenNotBetween(Integer value1, Integer value2) {
            addCriterion("pm_seven not between", value1, value2, "pmSeven");
            return (Criteria) this;
        }

        public Criteria andPmEightIsNull() {
            addCriterion("pm_eight is null");
            return (Criteria) this;
        }

        public Criteria andPmEightIsNotNull() {
            addCriterion("pm_eight is not null");
            return (Criteria) this;
        }

        public Criteria andPmEightEqualTo(Integer value) {
            addCriterion("pm_eight =", value, "pmEight");
            return (Criteria) this;
        }

        public Criteria andPmEightNotEqualTo(Integer value) {
            addCriterion("pm_eight <>", value, "pmEight");
            return (Criteria) this;
        }

        public Criteria andPmEightGreaterThan(Integer value) {
            addCriterion("pm_eight >", value, "pmEight");
            return (Criteria) this;
        }

        public Criteria andPmEightGreaterThanOrEqualTo(Integer value) {
            addCriterion("pm_eight >=", value, "pmEight");
            return (Criteria) this;
        }

        public Criteria andPmEightLessThan(Integer value) {
            addCriterion("pm_eight <", value, "pmEight");
            return (Criteria) this;
        }

        public Criteria andPmEightLessThanOrEqualTo(Integer value) {
            addCriterion("pm_eight <=", value, "pmEight");
            return (Criteria) this;
        }

        public Criteria andPmEightIn(List<Integer> values) {
            addCriterion("pm_eight in", values, "pmEight");
            return (Criteria) this;
        }

        public Criteria andPmEightNotIn(List<Integer> values) {
            addCriterion("pm_eight not in", values, "pmEight");
            return (Criteria) this;
        }

        public Criteria andPmEightBetween(Integer value1, Integer value2) {
            addCriterion("pm_eight between", value1, value2, "pmEight");
            return (Criteria) this;
        }

        public Criteria andPmEightNotBetween(Integer value1, Integer value2) {
            addCriterion("pm_eight not between", value1, value2, "pmEight");
            return (Criteria) this;
        }

        public Criteria andPmNineIsNull() {
            addCriterion("pm_nine is null");
            return (Criteria) this;
        }

        public Criteria andPmNineIsNotNull() {
            addCriterion("pm_nine is not null");
            return (Criteria) this;
        }

        public Criteria andPmNineEqualTo(Integer value) {
            addCriterion("pm_nine =", value, "pmNine");
            return (Criteria) this;
        }

        public Criteria andPmNineNotEqualTo(Integer value) {
            addCriterion("pm_nine <>", value, "pmNine");
            return (Criteria) this;
        }

        public Criteria andPmNineGreaterThan(Integer value) {
            addCriterion("pm_nine >", value, "pmNine");
            return (Criteria) this;
        }

        public Criteria andPmNineGreaterThanOrEqualTo(Integer value) {
            addCriterion("pm_nine >=", value, "pmNine");
            return (Criteria) this;
        }

        public Criteria andPmNineLessThan(Integer value) {
            addCriterion("pm_nine <", value, "pmNine");
            return (Criteria) this;
        }

        public Criteria andPmNineLessThanOrEqualTo(Integer value) {
            addCriterion("pm_nine <=", value, "pmNine");
            return (Criteria) this;
        }

        public Criteria andPmNineIn(List<Integer> values) {
            addCriterion("pm_nine in", values, "pmNine");
            return (Criteria) this;
        }

        public Criteria andPmNineNotIn(List<Integer> values) {
            addCriterion("pm_nine not in", values, "pmNine");
            return (Criteria) this;
        }

        public Criteria andPmNineBetween(Integer value1, Integer value2) {
            addCriterion("pm_nine between", value1, value2, "pmNine");
            return (Criteria) this;
        }

        public Criteria andPmNineNotBetween(Integer value1, Integer value2) {
            addCriterion("pm_nine not between", value1, value2, "pmNine");
            return (Criteria) this;
        }

        public Criteria andPmTenIsNull() {
            addCriterion("pm_ten is null");
            return (Criteria) this;
        }

        public Criteria andPmTenIsNotNull() {
            addCriterion("pm_ten is not null");
            return (Criteria) this;
        }

        public Criteria andPmTenEqualTo(Integer value) {
            addCriterion("pm_ten =", value, "pmTen");
            return (Criteria) this;
        }

        public Criteria andPmTenNotEqualTo(Integer value) {
            addCriterion("pm_ten <>", value, "pmTen");
            return (Criteria) this;
        }

        public Criteria andPmTenGreaterThan(Integer value) {
            addCriterion("pm_ten >", value, "pmTen");
            return (Criteria) this;
        }

        public Criteria andPmTenGreaterThanOrEqualTo(Integer value) {
            addCriterion("pm_ten >=", value, "pmTen");
            return (Criteria) this;
        }

        public Criteria andPmTenLessThan(Integer value) {
            addCriterion("pm_ten <", value, "pmTen");
            return (Criteria) this;
        }

        public Criteria andPmTenLessThanOrEqualTo(Integer value) {
            addCriterion("pm_ten <=", value, "pmTen");
            return (Criteria) this;
        }

        public Criteria andPmTenIn(List<Integer> values) {
            addCriterion("pm_ten in", values, "pmTen");
            return (Criteria) this;
        }

        public Criteria andPmTenNotIn(List<Integer> values) {
            addCriterion("pm_ten not in", values, "pmTen");
            return (Criteria) this;
        }

        public Criteria andPmTenBetween(Integer value1, Integer value2) {
            addCriterion("pm_ten between", value1, value2, "pmTen");
            return (Criteria) this;
        }

        public Criteria andPmTenNotBetween(Integer value1, Integer value2) {
            addCriterion("pm_ten not between", value1, value2, "pmTen");
            return (Criteria) this;
        }

        public Criteria andPmElevenIsNull() {
            addCriterion("pm_eleven is null");
            return (Criteria) this;
        }

        public Criteria andPmElevenIsNotNull() {
            addCriterion("pm_eleven is not null");
            return (Criteria) this;
        }

        public Criteria andPmElevenEqualTo(Integer value) {
            addCriterion("pm_eleven =", value, "pmEleven");
            return (Criteria) this;
        }

        public Criteria andPmElevenNotEqualTo(Integer value) {
            addCriterion("pm_eleven <>", value, "pmEleven");
            return (Criteria) this;
        }

        public Criteria andPmElevenGreaterThan(Integer value) {
            addCriterion("pm_eleven >", value, "pmEleven");
            return (Criteria) this;
        }

        public Criteria andPmElevenGreaterThanOrEqualTo(Integer value) {
            addCriterion("pm_eleven >=", value, "pmEleven");
            return (Criteria) this;
        }

        public Criteria andPmElevenLessThan(Integer value) {
            addCriterion("pm_eleven <", value, "pmEleven");
            return (Criteria) this;
        }

        public Criteria andPmElevenLessThanOrEqualTo(Integer value) {
            addCriterion("pm_eleven <=", value, "pmEleven");
            return (Criteria) this;
        }

        public Criteria andPmElevenIn(List<Integer> values) {
            addCriterion("pm_eleven in", values, "pmEleven");
            return (Criteria) this;
        }

        public Criteria andPmElevenNotIn(List<Integer> values) {
            addCriterion("pm_eleven not in", values, "pmEleven");
            return (Criteria) this;
        }

        public Criteria andPmElevenBetween(Integer value1, Integer value2) {
            addCriterion("pm_eleven between", value1, value2, "pmEleven");
            return (Criteria) this;
        }

        public Criteria andPmElevenNotBetween(Integer value1, Integer value2) {
            addCriterion("pm_eleven not between", value1, value2, "pmEleven");
            return (Criteria) this;
        }

        public Criteria andPmTwelveIsNull() {
            addCriterion("pm_twelve is null");
            return (Criteria) this;
        }

        public Criteria andPmTwelveIsNotNull() {
            addCriterion("pm_twelve is not null");
            return (Criteria) this;
        }

        public Criteria andPmTwelveEqualTo(Integer value) {
            addCriterion("pm_twelve =", value, "pmTwelve");
            return (Criteria) this;
        }

        public Criteria andPmTwelveNotEqualTo(Integer value) {
            addCriterion("pm_twelve <>", value, "pmTwelve");
            return (Criteria) this;
        }

        public Criteria andPmTwelveGreaterThan(Integer value) {
            addCriterion("pm_twelve >", value, "pmTwelve");
            return (Criteria) this;
        }

        public Criteria andPmTwelveGreaterThanOrEqualTo(Integer value) {
            addCriterion("pm_twelve >=", value, "pmTwelve");
            return (Criteria) this;
        }

        public Criteria andPmTwelveLessThan(Integer value) {
            addCriterion("pm_twelve <", value, "pmTwelve");
            return (Criteria) this;
        }

        public Criteria andPmTwelveLessThanOrEqualTo(Integer value) {
            addCriterion("pm_twelve <=", value, "pmTwelve");
            return (Criteria) this;
        }

        public Criteria andPmTwelveIn(List<Integer> values) {
            addCriterion("pm_twelve in", values, "pmTwelve");
            return (Criteria) this;
        }

        public Criteria andPmTwelveNotIn(List<Integer> values) {
            addCriterion("pm_twelve not in", values, "pmTwelve");
            return (Criteria) this;
        }

        public Criteria andPmTwelveBetween(Integer value1, Integer value2) {
            addCriterion("pm_twelve between", value1, value2, "pmTwelve");
            return (Criteria) this;
        }

        public Criteria andPmTwelveNotBetween(Integer value1, Integer value2) {
            addCriterion("pm_twelve not between", value1, value2, "pmTwelve");
            return (Criteria) this;
        }

        public Criteria andTotalDayIsNull() {
            addCriterion("total_day is null");
            return (Criteria) this;
        }

        public Criteria andTotalDayIsNotNull() {
            addCriterion("total_day is not null");
            return (Criteria) this;
        }

        public Criteria andTotalDayEqualTo(Integer value) {
            addCriterion("total_day =", value, "totalDay");
            return (Criteria) this;
        }

        public Criteria andTotalDayNotEqualTo(Integer value) {
            addCriterion("total_day <>", value, "totalDay");
            return (Criteria) this;
        }

        public Criteria andTotalDayGreaterThan(Integer value) {
            addCriterion("total_day >", value, "totalDay");
            return (Criteria) this;
        }

        public Criteria andTotalDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_day >=", value, "totalDay");
            return (Criteria) this;
        }

        public Criteria andTotalDayLessThan(Integer value) {
            addCriterion("total_day <", value, "totalDay");
            return (Criteria) this;
        }

        public Criteria andTotalDayLessThanOrEqualTo(Integer value) {
            addCriterion("total_day <=", value, "totalDay");
            return (Criteria) this;
        }

        public Criteria andTotalDayIn(List<Integer> values) {
            addCriterion("total_day in", values, "totalDay");
            return (Criteria) this;
        }

        public Criteria andTotalDayNotIn(List<Integer> values) {
            addCriterion("total_day not in", values, "totalDay");
            return (Criteria) this;
        }

        public Criteria andTotalDayBetween(Integer value1, Integer value2) {
            addCriterion("total_day between", value1, value2, "totalDay");
            return (Criteria) this;
        }

        public Criteria andTotalDayNotBetween(Integer value1, Integer value2) {
            addCriterion("total_day not between", value1, value2, "totalDay");
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