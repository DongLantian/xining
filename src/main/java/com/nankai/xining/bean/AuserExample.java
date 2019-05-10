package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class AuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuserExample() {
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

        public Criteria and统一社会信用代码IsNull() {
            addCriterion("统一社会信用代码 is null");
            return (Criteria) this;
        }

        public Criteria and统一社会信用代码IsNotNull() {
            addCriterion("统一社会信用代码 is not null");
            return (Criteria) this;
        }

        public Criteria and统一社会信用代码EqualTo(String value) {
            addCriterion("统一社会信用代码 =", value, "统一社会信用代码");
            return (Criteria) this;
        }

        public Criteria and统一社会信用代码NotEqualTo(String value) {
            addCriterion("统一社会信用代码 <>", value, "统一社会信用代码");
            return (Criteria) this;
        }

        public Criteria and统一社会信用代码GreaterThan(String value) {
            addCriterion("统一社会信用代码 >", value, "统一社会信用代码");
            return (Criteria) this;
        }

        public Criteria and统一社会信用代码GreaterThanOrEqualTo(String value) {
            addCriterion("统一社会信用代码 >=", value, "统一社会信用代码");
            return (Criteria) this;
        }

        public Criteria and统一社会信用代码LessThan(String value) {
            addCriterion("统一社会信用代码 <", value, "统一社会信用代码");
            return (Criteria) this;
        }

        public Criteria and统一社会信用代码LessThanOrEqualTo(String value) {
            addCriterion("统一社会信用代码 <=", value, "统一社会信用代码");
            return (Criteria) this;
        }

        public Criteria and统一社会信用代码Like(String value) {
            addCriterion("统一社会信用代码 like", value, "统一社会信用代码");
            return (Criteria) this;
        }

        public Criteria and统一社会信用代码NotLike(String value) {
            addCriterion("统一社会信用代码 not like", value, "统一社会信用代码");
            return (Criteria) this;
        }

        public Criteria and统一社会信用代码In(List<String> values) {
            addCriterion("统一社会信用代码 in", values, "统一社会信用代码");
            return (Criteria) this;
        }

        public Criteria and统一社会信用代码NotIn(List<String> values) {
            addCriterion("统一社会信用代码 not in", values, "统一社会信用代码");
            return (Criteria) this;
        }

        public Criteria and统一社会信用代码Between(String value1, String value2) {
            addCriterion("统一社会信用代码 between", value1, value2, "统一社会信用代码");
            return (Criteria) this;
        }

        public Criteria and统一社会信用代码NotBetween(String value1, String value2) {
            addCriterion("统一社会信用代码 not between", value1, value2, "统一社会信用代码");
            return (Criteria) this;
        }

        public Criteria and密码IsNull() {
            addCriterion("密码 is null");
            return (Criteria) this;
        }

        public Criteria and密码IsNotNull() {
            addCriterion("密码 is not null");
            return (Criteria) this;
        }

        public Criteria and密码EqualTo(String value) {
            addCriterion("密码 =", value, "密码");
            return (Criteria) this;
        }

        public Criteria and密码NotEqualTo(String value) {
            addCriterion("密码 <>", value, "密码");
            return (Criteria) this;
        }

        public Criteria and密码GreaterThan(String value) {
            addCriterion("密码 >", value, "密码");
            return (Criteria) this;
        }

        public Criteria and密码GreaterThanOrEqualTo(String value) {
            addCriterion("密码 >=", value, "密码");
            return (Criteria) this;
        }

        public Criteria and密码LessThan(String value) {
            addCriterion("密码 <", value, "密码");
            return (Criteria) this;
        }

        public Criteria and密码LessThanOrEqualTo(String value) {
            addCriterion("密码 <=", value, "密码");
            return (Criteria) this;
        }

        public Criteria and密码Like(String value) {
            addCriterion("密码 like", value, "密码");
            return (Criteria) this;
        }

        public Criteria and密码NotLike(String value) {
            addCriterion("密码 not like", value, "密码");
            return (Criteria) this;
        }

        public Criteria and密码In(List<String> values) {
            addCriterion("密码 in", values, "密码");
            return (Criteria) this;
        }

        public Criteria and密码NotIn(List<String> values) {
            addCriterion("密码 not in", values, "密码");
            return (Criteria) this;
        }

        public Criteria and密码Between(String value1, String value2) {
            addCriterion("密码 between", value1, value2, "密码");
            return (Criteria) this;
        }

        public Criteria and密码NotBetween(String value1, String value2) {
            addCriterion("密码 not between", value1, value2, "密码");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNull() {
            addCriterion("roleid is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("roleid is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(String value) {
            addCriterion("roleid =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(String value) {
            addCriterion("roleid <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(String value) {
            addCriterion("roleid >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(String value) {
            addCriterion("roleid >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(String value) {
            addCriterion("roleid <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(String value) {
            addCriterion("roleid <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLike(String value) {
            addCriterion("roleid like", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotLike(String value) {
            addCriterion("roleid not like", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<String> values) {
            addCriterion("roleid in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<String> values) {
            addCriterion("roleid not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(String value1, String value2) {
            addCriterion("roleid between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(String value1, String value2) {
            addCriterion("roleid not between", value1, value2, "roleid");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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