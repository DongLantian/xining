package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class NaturalSourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NaturalSourceExample() {
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

        public Criteria andNtIdIsNull() {
            addCriterion("nt_id is null");
            return (Criteria) this;
        }

        public Criteria andNtIdIsNotNull() {
            addCriterion("nt_id is not null");
            return (Criteria) this;
        }

        public Criteria andNtIdEqualTo(Integer value) {
            addCriterion("nt_id =", value, "ntId");
            return (Criteria) this;
        }

        public Criteria andNtIdNotEqualTo(Integer value) {
            addCriterion("nt_id <>", value, "ntId");
            return (Criteria) this;
        }

        public Criteria andNtIdGreaterThan(Integer value) {
            addCriterion("nt_id >", value, "ntId");
            return (Criteria) this;
        }

        public Criteria andNtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("nt_id >=", value, "ntId");
            return (Criteria) this;
        }

        public Criteria andNtIdLessThan(Integer value) {
            addCriterion("nt_id <", value, "ntId");
            return (Criteria) this;
        }

        public Criteria andNtIdLessThanOrEqualTo(Integer value) {
            addCriterion("nt_id <=", value, "ntId");
            return (Criteria) this;
        }

        public Criteria andNtIdIn(List<Integer> values) {
            addCriterion("nt_id in", values, "ntId");
            return (Criteria) this;
        }

        public Criteria andNtIdNotIn(List<Integer> values) {
            addCriterion("nt_id not in", values, "ntId");
            return (Criteria) this;
        }

        public Criteria andNtIdBetween(Integer value1, Integer value2) {
            addCriterion("nt_id between", value1, value2, "ntId");
            return (Criteria) this;
        }

        public Criteria andNtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("nt_id not between", value1, value2, "ntId");
            return (Criteria) this;
        }

        public Criteria andNtYearIsNull() {
            addCriterion("nt_year is null");
            return (Criteria) this;
        }

        public Criteria andNtYearIsNotNull() {
            addCriterion("nt_year is not null");
            return (Criteria) this;
        }

        public Criteria andNtYearEqualTo(Integer value) {
            addCriterion("nt_year =", value, "ntYear");
            return (Criteria) this;
        }

        public Criteria andNtYearNotEqualTo(Integer value) {
            addCriterion("nt_year <>", value, "ntYear");
            return (Criteria) this;
        }

        public Criteria andNtYearGreaterThan(Integer value) {
            addCriterion("nt_year >", value, "ntYear");
            return (Criteria) this;
        }

        public Criteria andNtYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("nt_year >=", value, "ntYear");
            return (Criteria) this;
        }

        public Criteria andNtYearLessThan(Integer value) {
            addCriterion("nt_year <", value, "ntYear");
            return (Criteria) this;
        }

        public Criteria andNtYearLessThanOrEqualTo(Integer value) {
            addCriterion("nt_year <=", value, "ntYear");
            return (Criteria) this;
        }

        public Criteria andNtYearIn(List<Integer> values) {
            addCriterion("nt_year in", values, "ntYear");
            return (Criteria) this;
        }

        public Criteria andNtYearNotIn(List<Integer> values) {
            addCriterion("nt_year not in", values, "ntYear");
            return (Criteria) this;
        }

        public Criteria andNtYearBetween(Integer value1, Integer value2) {
            addCriterion("nt_year between", value1, value2, "ntYear");
            return (Criteria) this;
        }

        public Criteria andNtYearNotBetween(Integer value1, Integer value2) {
            addCriterion("nt_year not between", value1, value2, "ntYear");
            return (Criteria) this;
        }

        public Criteria andNtMonthIsNull() {
            addCriterion("nt_month is null");
            return (Criteria) this;
        }

        public Criteria andNtMonthIsNotNull() {
            addCriterion("nt_month is not null");
            return (Criteria) this;
        }

        public Criteria andNtMonthEqualTo(Integer value) {
            addCriterion("nt_month =", value, "ntMonth");
            return (Criteria) this;
        }

        public Criteria andNtMonthNotEqualTo(Integer value) {
            addCriterion("nt_month <>", value, "ntMonth");
            return (Criteria) this;
        }

        public Criteria andNtMonthGreaterThan(Integer value) {
            addCriterion("nt_month >", value, "ntMonth");
            return (Criteria) this;
        }

        public Criteria andNtMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("nt_month >=", value, "ntMonth");
            return (Criteria) this;
        }

        public Criteria andNtMonthLessThan(Integer value) {
            addCriterion("nt_month <", value, "ntMonth");
            return (Criteria) this;
        }

        public Criteria andNtMonthLessThanOrEqualTo(Integer value) {
            addCriterion("nt_month <=", value, "ntMonth");
            return (Criteria) this;
        }

        public Criteria andNtMonthIn(List<Integer> values) {
            addCriterion("nt_month in", values, "ntMonth");
            return (Criteria) this;
        }

        public Criteria andNtMonthNotIn(List<Integer> values) {
            addCriterion("nt_month not in", values, "ntMonth");
            return (Criteria) this;
        }

        public Criteria andNtMonthBetween(Integer value1, Integer value2) {
            addCriterion("nt_month between", value1, value2, "ntMonth");
            return (Criteria) this;
        }

        public Criteria andNtMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("nt_month not between", value1, value2, "ntMonth");
            return (Criteria) this;
        }

        public Criteria andNtHourIsNull() {
            addCriterion("nt_hour is null");
            return (Criteria) this;
        }

        public Criteria andNtHourIsNotNull() {
            addCriterion("nt_hour is not null");
            return (Criteria) this;
        }

        public Criteria andNtHourEqualTo(Integer value) {
            addCriterion("nt_hour =", value, "ntHour");
            return (Criteria) this;
        }

        public Criteria andNtHourNotEqualTo(Integer value) {
            addCriterion("nt_hour <>", value, "ntHour");
            return (Criteria) this;
        }

        public Criteria andNtHourGreaterThan(Integer value) {
            addCriterion("nt_hour >", value, "ntHour");
            return (Criteria) this;
        }

        public Criteria andNtHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("nt_hour >=", value, "ntHour");
            return (Criteria) this;
        }

        public Criteria andNtHourLessThan(Integer value) {
            addCriterion("nt_hour <", value, "ntHour");
            return (Criteria) this;
        }

        public Criteria andNtHourLessThanOrEqualTo(Integer value) {
            addCriterion("nt_hour <=", value, "ntHour");
            return (Criteria) this;
        }

        public Criteria andNtHourIn(List<Integer> values) {
            addCriterion("nt_hour in", values, "ntHour");
            return (Criteria) this;
        }

        public Criteria andNtHourNotIn(List<Integer> values) {
            addCriterion("nt_hour not in", values, "ntHour");
            return (Criteria) this;
        }

        public Criteria andNtHourBetween(Integer value1, Integer value2) {
            addCriterion("nt_hour between", value1, value2, "ntHour");
            return (Criteria) this;
        }

        public Criteria andNtHourNotBetween(Integer value1, Integer value2) {
            addCriterion("nt_hour not between", value1, value2, "ntHour");
            return (Criteria) this;
        }

        public Criteria andNtRowIsNull() {
            addCriterion("nt_row is null");
            return (Criteria) this;
        }

        public Criteria andNtRowIsNotNull() {
            addCriterion("nt_row is not null");
            return (Criteria) this;
        }

        public Criteria andNtRowEqualTo(Integer value) {
            addCriterion("nt_row =", value, "ntRow");
            return (Criteria) this;
        }

        public Criteria andNtRowNotEqualTo(Integer value) {
            addCriterion("nt_row <>", value, "ntRow");
            return (Criteria) this;
        }

        public Criteria andNtRowGreaterThan(Integer value) {
            addCriterion("nt_row >", value, "ntRow");
            return (Criteria) this;
        }

        public Criteria andNtRowGreaterThanOrEqualTo(Integer value) {
            addCriterion("nt_row >=", value, "ntRow");
            return (Criteria) this;
        }

        public Criteria andNtRowLessThan(Integer value) {
            addCriterion("nt_row <", value, "ntRow");
            return (Criteria) this;
        }

        public Criteria andNtRowLessThanOrEqualTo(Integer value) {
            addCriterion("nt_row <=", value, "ntRow");
            return (Criteria) this;
        }

        public Criteria andNtRowIn(List<Integer> values) {
            addCriterion("nt_row in", values, "ntRow");
            return (Criteria) this;
        }

        public Criteria andNtRowNotIn(List<Integer> values) {
            addCriterion("nt_row not in", values, "ntRow");
            return (Criteria) this;
        }

        public Criteria andNtRowBetween(Integer value1, Integer value2) {
            addCriterion("nt_row between", value1, value2, "ntRow");
            return (Criteria) this;
        }

        public Criteria andNtRowNotBetween(Integer value1, Integer value2) {
            addCriterion("nt_row not between", value1, value2, "ntRow");
            return (Criteria) this;
        }

        public Criteria andNtColIsNull() {
            addCriterion("nt_col is null");
            return (Criteria) this;
        }

        public Criteria andNtColIsNotNull() {
            addCriterion("nt_col is not null");
            return (Criteria) this;
        }

        public Criteria andNtColEqualTo(Integer value) {
            addCriterion("nt_col =", value, "ntCol");
            return (Criteria) this;
        }

        public Criteria andNtColNotEqualTo(Integer value) {
            addCriterion("nt_col <>", value, "ntCol");
            return (Criteria) this;
        }

        public Criteria andNtColGreaterThan(Integer value) {
            addCriterion("nt_col >", value, "ntCol");
            return (Criteria) this;
        }

        public Criteria andNtColGreaterThanOrEqualTo(Integer value) {
            addCriterion("nt_col >=", value, "ntCol");
            return (Criteria) this;
        }

        public Criteria andNtColLessThan(Integer value) {
            addCriterion("nt_col <", value, "ntCol");
            return (Criteria) this;
        }

        public Criteria andNtColLessThanOrEqualTo(Integer value) {
            addCriterion("nt_col <=", value, "ntCol");
            return (Criteria) this;
        }

        public Criteria andNtColIn(List<Integer> values) {
            addCriterion("nt_col in", values, "ntCol");
            return (Criteria) this;
        }

        public Criteria andNtColNotIn(List<Integer> values) {
            addCriterion("nt_col not in", values, "ntCol");
            return (Criteria) this;
        }

        public Criteria andNtColBetween(Integer value1, Integer value2) {
            addCriterion("nt_col between", value1, value2, "ntCol");
            return (Criteria) this;
        }

        public Criteria andNtColNotBetween(Integer value1, Integer value2) {
            addCriterion("nt_col not between", value1, value2, "ntCol");
            return (Criteria) this;
        }

        public Criteria andNtAreaIsNull() {
            addCriterion("nt_area is null");
            return (Criteria) this;
        }

        public Criteria andNtAreaIsNotNull() {
            addCriterion("nt_area is not null");
            return (Criteria) this;
        }

        public Criteria andNtAreaEqualTo(Double value) {
            addCriterion("nt_area =", value, "ntArea");
            return (Criteria) this;
        }

        public Criteria andNtAreaNotEqualTo(Double value) {
            addCriterion("nt_area <>", value, "ntArea");
            return (Criteria) this;
        }

        public Criteria andNtAreaGreaterThan(Double value) {
            addCriterion("nt_area >", value, "ntArea");
            return (Criteria) this;
        }

        public Criteria andNtAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("nt_area >=", value, "ntArea");
            return (Criteria) this;
        }

        public Criteria andNtAreaLessThan(Double value) {
            addCriterion("nt_area <", value, "ntArea");
            return (Criteria) this;
        }

        public Criteria andNtAreaLessThanOrEqualTo(Double value) {
            addCriterion("nt_area <=", value, "ntArea");
            return (Criteria) this;
        }

        public Criteria andNtAreaIn(List<Double> values) {
            addCriterion("nt_area in", values, "ntArea");
            return (Criteria) this;
        }

        public Criteria andNtAreaNotIn(List<Double> values) {
            addCriterion("nt_area not in", values, "ntArea");
            return (Criteria) this;
        }

        public Criteria andNtAreaBetween(Double value1, Double value2) {
            addCriterion("nt_area between", value1, value2, "ntArea");
            return (Criteria) this;
        }

        public Criteria andNtAreaNotBetween(Double value1, Double value2) {
            addCriterion("nt_area not between", value1, value2, "ntArea");
            return (Criteria) this;
        }

        public Criteria andNtVocIsNull() {
            addCriterion("nt_voc is null");
            return (Criteria) this;
        }

        public Criteria andNtVocIsNotNull() {
            addCriterion("nt_voc is not null");
            return (Criteria) this;
        }

        public Criteria andNtVocEqualTo(Double value) {
            addCriterion("nt_voc =", value, "ntVoc");
            return (Criteria) this;
        }

        public Criteria andNtVocNotEqualTo(Double value) {
            addCriterion("nt_voc <>", value, "ntVoc");
            return (Criteria) this;
        }

        public Criteria andNtVocGreaterThan(Double value) {
            addCriterion("nt_voc >", value, "ntVoc");
            return (Criteria) this;
        }

        public Criteria andNtVocGreaterThanOrEqualTo(Double value) {
            addCriterion("nt_voc >=", value, "ntVoc");
            return (Criteria) this;
        }

        public Criteria andNtVocLessThan(Double value) {
            addCriterion("nt_voc <", value, "ntVoc");
            return (Criteria) this;
        }

        public Criteria andNtVocLessThanOrEqualTo(Double value) {
            addCriterion("nt_voc <=", value, "ntVoc");
            return (Criteria) this;
        }

        public Criteria andNtVocIn(List<Double> values) {
            addCriterion("nt_voc in", values, "ntVoc");
            return (Criteria) this;
        }

        public Criteria andNtVocNotIn(List<Double> values) {
            addCriterion("nt_voc not in", values, "ntVoc");
            return (Criteria) this;
        }

        public Criteria andNtVocBetween(Double value1, Double value2) {
            addCriterion("nt_voc between", value1, value2, "ntVoc");
            return (Criteria) this;
        }

        public Criteria andNtVocNotBetween(Double value1, Double value2) {
            addCriterion("nt_voc not between", value1, value2, "ntVoc");
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