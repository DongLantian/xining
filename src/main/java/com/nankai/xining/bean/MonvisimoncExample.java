package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MonvisimoncExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MonvisimoncExample() {
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

        public Criteria andCellidIsNull() {
            addCriterion("CellID is null");
            return (Criteria) this;
        }

        public Criteria andCellidIsNotNull() {
            addCriterion("CellID is not null");
            return (Criteria) this;
        }

        public Criteria andCellidEqualTo(String value) {
            addCriterion("CellID =", value, "cellid");
            return (Criteria) this;
        }

        public Criteria andCellidNotEqualTo(String value) {
            addCriterion("CellID <>", value, "cellid");
            return (Criteria) this;
        }

        public Criteria andCellidGreaterThan(String value) {
            addCriterion("CellID >", value, "cellid");
            return (Criteria) this;
        }

        public Criteria andCellidGreaterThanOrEqualTo(String value) {
            addCriterion("CellID >=", value, "cellid");
            return (Criteria) this;
        }

        public Criteria andCellidLessThan(String value) {
            addCriterion("CellID <", value, "cellid");
            return (Criteria) this;
        }

        public Criteria andCellidLessThanOrEqualTo(String value) {
            addCriterion("CellID <=", value, "cellid");
            return (Criteria) this;
        }

        public Criteria andCellidLike(String value) {
            addCriterion("CellID like", value, "cellid");
            return (Criteria) this;
        }

        public Criteria andCellidNotLike(String value) {
            addCriterion("CellID not like", value, "cellid");
            return (Criteria) this;
        }

        public Criteria andCellidIn(List<String> values) {
            addCriterion("CellID in", values, "cellid");
            return (Criteria) this;
        }

        public Criteria andCellidNotIn(List<String> values) {
            addCriterion("CellID not in", values, "cellid");
            return (Criteria) this;
        }

        public Criteria andCellidBetween(String value1, String value2) {
            addCriterion("CellID between", value1, value2, "cellid");
            return (Criteria) this;
        }

        public Criteria andCellidNotBetween(String value1, String value2) {
            addCriterion("CellID not between", value1, value2, "cellid");
            return (Criteria) this;
        }

        public Criteria andDateidIsNull() {
            addCriterion("DateID is null");
            return (Criteria) this;
        }

        public Criteria andDateidIsNotNull() {
            addCriterion("DateID is not null");
            return (Criteria) this;
        }

        public Criteria andDateidEqualTo(Date value) {
            addCriterion("DateID =", value, "dateid");
            return (Criteria) this;
        }

        public Criteria andDateidNotEqualTo(Date value) {
            addCriterion("DateID <>", value, "dateid");
            return (Criteria) this;
        }

        public Criteria andDateidGreaterThan(Date value) {
            addCriterion("DateID >", value, "dateid");
            return (Criteria) this;
        }

        public Criteria andDateidGreaterThanOrEqualTo(Date value) {
            addCriterion("DateID >=", value, "dateid");
            return (Criteria) this;
        }

        public Criteria andDateidLessThan(Date value) {
            addCriterion("DateID <", value, "dateid");
            return (Criteria) this;
        }

        public Criteria andDateidLessThanOrEqualTo(Date value) {
            addCriterion("DateID <=", value, "dateid");
            return (Criteria) this;
        }

        public Criteria andDateidIn(List<Date> values) {
            addCriterion("DateID in", values, "dateid");
            return (Criteria) this;
        }

        public Criteria andDateidNotIn(List<Date> values) {
            addCriterion("DateID not in", values, "dateid");
            return (Criteria) this;
        }

        public Criteria andDateidBetween(Date value1, Date value2) {
            addCriterion("DateID between", value1, value2, "dateid");
            return (Criteria) this;
        }

        public Criteria andDateidNotBetween(Date value1, Date value2) {
            addCriterion("DateID not between", value1, value2, "dateid");
            return (Criteria) this;
        }

        public Criteria andMonVisibilityIsNull() {
            addCriterion("mon_VISIBILITY is null");
            return (Criteria) this;
        }

        public Criteria andMonVisibilityIsNotNull() {
            addCriterion("mon_VISIBILITY is not null");
            return (Criteria) this;
        }

        public Criteria andMonVisibilityEqualTo(Double value) {
            addCriterion("mon_VISIBILITY =", value, "monVisibility");
            return (Criteria) this;
        }

        public Criteria andMonVisibilityNotEqualTo(Double value) {
            addCriterion("mon_VISIBILITY <>", value, "monVisibility");
            return (Criteria) this;
        }

        public Criteria andMonVisibilityGreaterThan(Double value) {
            addCriterion("mon_VISIBILITY >", value, "monVisibility");
            return (Criteria) this;
        }

        public Criteria andMonVisibilityGreaterThanOrEqualTo(Double value) {
            addCriterion("mon_VISIBILITY >=", value, "monVisibility");
            return (Criteria) this;
        }

        public Criteria andMonVisibilityLessThan(Double value) {
            addCriterion("mon_VISIBILITY <", value, "monVisibility");
            return (Criteria) this;
        }

        public Criteria andMonVisibilityLessThanOrEqualTo(Double value) {
            addCriterion("mon_VISIBILITY <=", value, "monVisibility");
            return (Criteria) this;
        }

        public Criteria andMonVisibilityIn(List<Double> values) {
            addCriterion("mon_VISIBILITY in", values, "monVisibility");
            return (Criteria) this;
        }

        public Criteria andMonVisibilityNotIn(List<Double> values) {
            addCriterion("mon_VISIBILITY not in", values, "monVisibility");
            return (Criteria) this;
        }

        public Criteria andMonVisibilityBetween(Double value1, Double value2) {
            addCriterion("mon_VISIBILITY between", value1, value2, "monVisibility");
            return (Criteria) this;
        }

        public Criteria andMonVisibilityNotBetween(Double value1, Double value2) {
            addCriterion("mon_VISIBILITY not between", value1, value2, "monVisibility");
            return (Criteria) this;
        }

        public Criteria andMonPtoIsNull() {
            addCriterion("mon_PTO is null");
            return (Criteria) this;
        }

        public Criteria andMonPtoIsNotNull() {
            addCriterion("mon_PTO is not null");
            return (Criteria) this;
        }

        public Criteria andMonPtoEqualTo(Double value) {
            addCriterion("mon_PTO =", value, "monPto");
            return (Criteria) this;
        }

        public Criteria andMonPtoNotEqualTo(Double value) {
            addCriterion("mon_PTO <>", value, "monPto");
            return (Criteria) this;
        }

        public Criteria andMonPtoGreaterThan(Double value) {
            addCriterion("mon_PTO >", value, "monPto");
            return (Criteria) this;
        }

        public Criteria andMonPtoGreaterThanOrEqualTo(Double value) {
            addCriterion("mon_PTO >=", value, "monPto");
            return (Criteria) this;
        }

        public Criteria andMonPtoLessThan(Double value) {
            addCriterion("mon_PTO <", value, "monPto");
            return (Criteria) this;
        }

        public Criteria andMonPtoLessThanOrEqualTo(Double value) {
            addCriterion("mon_PTO <=", value, "monPto");
            return (Criteria) this;
        }

        public Criteria andMonPtoIn(List<Double> values) {
            addCriterion("mon_PTO in", values, "monPto");
            return (Criteria) this;
        }

        public Criteria andMonPtoNotIn(List<Double> values) {
            addCriterion("mon_PTO not in", values, "monPto");
            return (Criteria) this;
        }

        public Criteria andMonPtoBetween(Double value1, Double value2) {
            addCriterion("mon_PTO between", value1, value2, "monPto");
            return (Criteria) this;
        }

        public Criteria andMonPtoNotBetween(Double value1, Double value2) {
            addCriterion("mon_PTO not between", value1, value2, "monPto");
            return (Criteria) this;
        }

        public Criteria andMonPteIsNull() {
            addCriterion("mon_PTE is null");
            return (Criteria) this;
        }

        public Criteria andMonPteIsNotNull() {
            addCriterion("mon_PTE is not null");
            return (Criteria) this;
        }

        public Criteria andMonPteEqualTo(Double value) {
            addCriterion("mon_PTE =", value, "monPte");
            return (Criteria) this;
        }

        public Criteria andMonPteNotEqualTo(Double value) {
            addCriterion("mon_PTE <>", value, "monPte");
            return (Criteria) this;
        }

        public Criteria andMonPteGreaterThan(Double value) {
            addCriterion("mon_PTE >", value, "monPte");
            return (Criteria) this;
        }

        public Criteria andMonPteGreaterThanOrEqualTo(Double value) {
            addCriterion("mon_PTE >=", value, "monPte");
            return (Criteria) this;
        }

        public Criteria andMonPteLessThan(Double value) {
            addCriterion("mon_PTE <", value, "monPte");
            return (Criteria) this;
        }

        public Criteria andMonPteLessThanOrEqualTo(Double value) {
            addCriterion("mon_PTE <=", value, "monPte");
            return (Criteria) this;
        }

        public Criteria andMonPteIn(List<Double> values) {
            addCriterion("mon_PTE in", values, "monPte");
            return (Criteria) this;
        }

        public Criteria andMonPteNotIn(List<Double> values) {
            addCriterion("mon_PTE not in", values, "monPte");
            return (Criteria) this;
        }

        public Criteria andMonPteBetween(Double value1, Double value2) {
            addCriterion("mon_PTE between", value1, value2, "monPte");
            return (Criteria) this;
        }

        public Criteria andMonPteNotBetween(Double value1, Double value2) {
            addCriterion("mon_PTE not between", value1, value2, "monPte");
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