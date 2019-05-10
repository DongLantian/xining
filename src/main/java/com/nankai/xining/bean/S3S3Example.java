package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class S3S3Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public S3S3Example() {
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

        public Criteria and一级sccIsNull() {
            addCriterion("一级SCC is null");
            return (Criteria) this;
        }

        public Criteria and一级sccIsNotNull() {
            addCriterion("一级SCC is not null");
            return (Criteria) this;
        }

        public Criteria and一级sccEqualTo(String value) {
            addCriterion("一级SCC =", value, "一级scc");
            return (Criteria) this;
        }

        public Criteria and一级sccNotEqualTo(String value) {
            addCriterion("一级SCC <>", value, "一级scc");
            return (Criteria) this;
        }

        public Criteria and一级sccGreaterThan(String value) {
            addCriterion("一级SCC >", value, "一级scc");
            return (Criteria) this;
        }

        public Criteria and一级sccGreaterThanOrEqualTo(String value) {
            addCriterion("一级SCC >=", value, "一级scc");
            return (Criteria) this;
        }

        public Criteria and一级sccLessThan(String value) {
            addCriterion("一级SCC <", value, "一级scc");
            return (Criteria) this;
        }

        public Criteria and一级sccLessThanOrEqualTo(String value) {
            addCriterion("一级SCC <=", value, "一级scc");
            return (Criteria) this;
        }

        public Criteria and一级sccLike(String value) {
            addCriterion("一级SCC like", value, "一级scc");
            return (Criteria) this;
        }

        public Criteria and一级sccNotLike(String value) {
            addCriterion("一级SCC not like", value, "一级scc");
            return (Criteria) this;
        }

        public Criteria and一级sccIn(List<String> values) {
            addCriterion("一级SCC in", values, "一级scc");
            return (Criteria) this;
        }

        public Criteria and一级sccNotIn(List<String> values) {
            addCriterion("一级SCC not in", values, "一级scc");
            return (Criteria) this;
        }

        public Criteria and一级sccBetween(String value1, String value2) {
            addCriterion("一级SCC between", value1, value2, "一级scc");
            return (Criteria) this;
        }

        public Criteria and一级sccNotBetween(String value1, String value2) {
            addCriterion("一级SCC not between", value1, value2, "一级scc");
            return (Criteria) this;
        }

        public Criteria and一级scc描述IsNull() {
            addCriterion("一级SCC描述 is null");
            return (Criteria) this;
        }

        public Criteria and一级scc描述IsNotNull() {
            addCriterion("一级SCC描述 is not null");
            return (Criteria) this;
        }

        public Criteria and一级scc描述EqualTo(String value) {
            addCriterion("一级SCC描述 =", value, "一级scc描述");
            return (Criteria) this;
        }

        public Criteria and一级scc描述NotEqualTo(String value) {
            addCriterion("一级SCC描述 <>", value, "一级scc描述");
            return (Criteria) this;
        }

        public Criteria and一级scc描述GreaterThan(String value) {
            addCriterion("一级SCC描述 >", value, "一级scc描述");
            return (Criteria) this;
        }

        public Criteria and一级scc描述GreaterThanOrEqualTo(String value) {
            addCriterion("一级SCC描述 >=", value, "一级scc描述");
            return (Criteria) this;
        }

        public Criteria and一级scc描述LessThan(String value) {
            addCriterion("一级SCC描述 <", value, "一级scc描述");
            return (Criteria) this;
        }

        public Criteria and一级scc描述LessThanOrEqualTo(String value) {
            addCriterion("一级SCC描述 <=", value, "一级scc描述");
            return (Criteria) this;
        }

        public Criteria and一级scc描述Like(String value) {
            addCriterion("一级SCC描述 like", value, "一级scc描述");
            return (Criteria) this;
        }

        public Criteria and一级scc描述NotLike(String value) {
            addCriterion("一级SCC描述 not like", value, "一级scc描述");
            return (Criteria) this;
        }

        public Criteria and一级scc描述In(List<String> values) {
            addCriterion("一级SCC描述 in", values, "一级scc描述");
            return (Criteria) this;
        }

        public Criteria and一级scc描述NotIn(List<String> values) {
            addCriterion("一级SCC描述 not in", values, "一级scc描述");
            return (Criteria) this;
        }

        public Criteria and一级scc描述Between(String value1, String value2) {
            addCriterion("一级SCC描述 between", value1, value2, "一级scc描述");
            return (Criteria) this;
        }

        public Criteria and一级scc描述NotBetween(String value1, String value2) {
            addCriterion("一级SCC描述 not between", value1, value2, "一级scc描述");
            return (Criteria) this;
        }

        public Criteria and二级scc编码IsNull() {
            addCriterion("二级SCC编码 is null");
            return (Criteria) this;
        }

        public Criteria and二级scc编码IsNotNull() {
            addCriterion("二级SCC编码 is not null");
            return (Criteria) this;
        }

        public Criteria and二级scc编码EqualTo(String value) {
            addCriterion("二级SCC编码 =", value, "二级scc编码");
            return (Criteria) this;
        }

        public Criteria and二级scc编码NotEqualTo(String value) {
            addCriterion("二级SCC编码 <>", value, "二级scc编码");
            return (Criteria) this;
        }

        public Criteria and二级scc编码GreaterThan(String value) {
            addCriterion("二级SCC编码 >", value, "二级scc编码");
            return (Criteria) this;
        }

        public Criteria and二级scc编码GreaterThanOrEqualTo(String value) {
            addCriterion("二级SCC编码 >=", value, "二级scc编码");
            return (Criteria) this;
        }

        public Criteria and二级scc编码LessThan(String value) {
            addCriterion("二级SCC编码 <", value, "二级scc编码");
            return (Criteria) this;
        }

        public Criteria and二级scc编码LessThanOrEqualTo(String value) {
            addCriterion("二级SCC编码 <=", value, "二级scc编码");
            return (Criteria) this;
        }

        public Criteria and二级scc编码Like(String value) {
            addCriterion("二级SCC编码 like", value, "二级scc编码");
            return (Criteria) this;
        }

        public Criteria and二级scc编码NotLike(String value) {
            addCriterion("二级SCC编码 not like", value, "二级scc编码");
            return (Criteria) this;
        }

        public Criteria and二级scc编码In(List<String> values) {
            addCriterion("二级SCC编码 in", values, "二级scc编码");
            return (Criteria) this;
        }

        public Criteria and二级scc编码NotIn(List<String> values) {
            addCriterion("二级SCC编码 not in", values, "二级scc编码");
            return (Criteria) this;
        }

        public Criteria and二级scc编码Between(String value1, String value2) {
            addCriterion("二级SCC编码 between", value1, value2, "二级scc编码");
            return (Criteria) this;
        }

        public Criteria and二级scc编码NotBetween(String value1, String value2) {
            addCriterion("二级SCC编码 not between", value1, value2, "二级scc编码");
            return (Criteria) this;
        }

        public Criteria and二级scc描述IsNull() {
            addCriterion("二级SCC描述 is null");
            return (Criteria) this;
        }

        public Criteria and二级scc描述IsNotNull() {
            addCriterion("二级SCC描述 is not null");
            return (Criteria) this;
        }

        public Criteria and二级scc描述EqualTo(String value) {
            addCriterion("二级SCC描述 =", value, "二级scc描述");
            return (Criteria) this;
        }

        public Criteria and二级scc描述NotEqualTo(String value) {
            addCriterion("二级SCC描述 <>", value, "二级scc描述");
            return (Criteria) this;
        }

        public Criteria and二级scc描述GreaterThan(String value) {
            addCriterion("二级SCC描述 >", value, "二级scc描述");
            return (Criteria) this;
        }

        public Criteria and二级scc描述GreaterThanOrEqualTo(String value) {
            addCriterion("二级SCC描述 >=", value, "二级scc描述");
            return (Criteria) this;
        }

        public Criteria and二级scc描述LessThan(String value) {
            addCriterion("二级SCC描述 <", value, "二级scc描述");
            return (Criteria) this;
        }

        public Criteria and二级scc描述LessThanOrEqualTo(String value) {
            addCriterion("二级SCC描述 <=", value, "二级scc描述");
            return (Criteria) this;
        }

        public Criteria and二级scc描述Like(String value) {
            addCriterion("二级SCC描述 like", value, "二级scc描述");
            return (Criteria) this;
        }

        public Criteria and二级scc描述NotLike(String value) {
            addCriterion("二级SCC描述 not like", value, "二级scc描述");
            return (Criteria) this;
        }

        public Criteria and二级scc描述In(List<String> values) {
            addCriterion("二级SCC描述 in", values, "二级scc描述");
            return (Criteria) this;
        }

        public Criteria and二级scc描述NotIn(List<String> values) {
            addCriterion("二级SCC描述 not in", values, "二级scc描述");
            return (Criteria) this;
        }

        public Criteria and二级scc描述Between(String value1, String value2) {
            addCriterion("二级SCC描述 between", value1, value2, "二级scc描述");
            return (Criteria) this;
        }

        public Criteria and二级scc描述NotBetween(String value1, String value2) {
            addCriterion("二级SCC描述 not between", value1, value2, "二级scc描述");
            return (Criteria) this;
        }

        public Criteria and三级scc编码IsNull() {
            addCriterion("三级SCC编码 is null");
            return (Criteria) this;
        }

        public Criteria and三级scc编码IsNotNull() {
            addCriterion("三级SCC编码 is not null");
            return (Criteria) this;
        }

        public Criteria and三级scc编码EqualTo(String value) {
            addCriterion("三级SCC编码 =", value, "三级scc编码");
            return (Criteria) this;
        }

        public Criteria and三级scc编码NotEqualTo(String value) {
            addCriterion("三级SCC编码 <>", value, "三级scc编码");
            return (Criteria) this;
        }

        public Criteria and三级scc编码GreaterThan(String value) {
            addCriterion("三级SCC编码 >", value, "三级scc编码");
            return (Criteria) this;
        }

        public Criteria and三级scc编码GreaterThanOrEqualTo(String value) {
            addCriterion("三级SCC编码 >=", value, "三级scc编码");
            return (Criteria) this;
        }

        public Criteria and三级scc编码LessThan(String value) {
            addCriterion("三级SCC编码 <", value, "三级scc编码");
            return (Criteria) this;
        }

        public Criteria and三级scc编码LessThanOrEqualTo(String value) {
            addCriterion("三级SCC编码 <=", value, "三级scc编码");
            return (Criteria) this;
        }

        public Criteria and三级scc编码Like(String value) {
            addCriterion("三级SCC编码 like", value, "三级scc编码");
            return (Criteria) this;
        }

        public Criteria and三级scc编码NotLike(String value) {
            addCriterion("三级SCC编码 not like", value, "三级scc编码");
            return (Criteria) this;
        }

        public Criteria and三级scc编码In(List<String> values) {
            addCriterion("三级SCC编码 in", values, "三级scc编码");
            return (Criteria) this;
        }

        public Criteria and三级scc编码NotIn(List<String> values) {
            addCriterion("三级SCC编码 not in", values, "三级scc编码");
            return (Criteria) this;
        }

        public Criteria and三级scc编码Between(String value1, String value2) {
            addCriterion("三级SCC编码 between", value1, value2, "三级scc编码");
            return (Criteria) this;
        }

        public Criteria and三级scc编码NotBetween(String value1, String value2) {
            addCriterion("三级SCC编码 not between", value1, value2, "三级scc编码");
            return (Criteria) this;
        }

        public Criteria and三级scc描述IsNull() {
            addCriterion("三级SCC描述 is null");
            return (Criteria) this;
        }

        public Criteria and三级scc描述IsNotNull() {
            addCriterion("三级SCC描述 is not null");
            return (Criteria) this;
        }

        public Criteria and三级scc描述EqualTo(String value) {
            addCriterion("三级SCC描述 =", value, "三级scc描述");
            return (Criteria) this;
        }

        public Criteria and三级scc描述NotEqualTo(String value) {
            addCriterion("三级SCC描述 <>", value, "三级scc描述");
            return (Criteria) this;
        }

        public Criteria and三级scc描述GreaterThan(String value) {
            addCriterion("三级SCC描述 >", value, "三级scc描述");
            return (Criteria) this;
        }

        public Criteria and三级scc描述GreaterThanOrEqualTo(String value) {
            addCriterion("三级SCC描述 >=", value, "三级scc描述");
            return (Criteria) this;
        }

        public Criteria and三级scc描述LessThan(String value) {
            addCriterion("三级SCC描述 <", value, "三级scc描述");
            return (Criteria) this;
        }

        public Criteria and三级scc描述LessThanOrEqualTo(String value) {
            addCriterion("三级SCC描述 <=", value, "三级scc描述");
            return (Criteria) this;
        }

        public Criteria and三级scc描述Like(String value) {
            addCriterion("三级SCC描述 like", value, "三级scc描述");
            return (Criteria) this;
        }

        public Criteria and三级scc描述NotLike(String value) {
            addCriterion("三级SCC描述 not like", value, "三级scc描述");
            return (Criteria) this;
        }

        public Criteria and三级scc描述In(List<String> values) {
            addCriterion("三级SCC描述 in", values, "三级scc描述");
            return (Criteria) this;
        }

        public Criteria and三级scc描述NotIn(List<String> values) {
            addCriterion("三级SCC描述 not in", values, "三级scc描述");
            return (Criteria) this;
        }

        public Criteria and三级scc描述Between(String value1, String value2) {
            addCriterion("三级SCC描述 between", value1, value2, "三级scc描述");
            return (Criteria) this;
        }

        public Criteria and三级scc描述NotBetween(String value1, String value2) {
            addCriterion("三级SCC描述 not between", value1, value2, "三级scc描述");
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