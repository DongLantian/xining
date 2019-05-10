package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MonemisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MonemisExample() {
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

        public Criteria andMonVocIsNull() {
            addCriterion("mon_VOC is null");
            return (Criteria) this;
        }

        public Criteria andMonVocIsNotNull() {
            addCriterion("mon_VOC is not null");
            return (Criteria) this;
        }

        public Criteria andMonVocEqualTo(Double value) {
            addCriterion("mon_VOC =", value, "monVoc");
            return (Criteria) this;
        }

        public Criteria andMonVocNotEqualTo(Double value) {
            addCriterion("mon_VOC <>", value, "monVoc");
            return (Criteria) this;
        }

        public Criteria andMonVocGreaterThan(Double value) {
            addCriterion("mon_VOC >", value, "monVoc");
            return (Criteria) this;
        }

        public Criteria andMonVocGreaterThanOrEqualTo(Double value) {
            addCriterion("mon_VOC >=", value, "monVoc");
            return (Criteria) this;
        }

        public Criteria andMonVocLessThan(Double value) {
            addCriterion("mon_VOC <", value, "monVoc");
            return (Criteria) this;
        }

        public Criteria andMonVocLessThanOrEqualTo(Double value) {
            addCriterion("mon_VOC <=", value, "monVoc");
            return (Criteria) this;
        }

        public Criteria andMonVocIn(List<Double> values) {
            addCriterion("mon_VOC in", values, "monVoc");
            return (Criteria) this;
        }

        public Criteria andMonVocNotIn(List<Double> values) {
            addCriterion("mon_VOC not in", values, "monVoc");
            return (Criteria) this;
        }

        public Criteria andMonVocBetween(Double value1, Double value2) {
            addCriterion("mon_VOC between", value1, value2, "monVoc");
            return (Criteria) this;
        }

        public Criteria andMonVocNotBetween(Double value1, Double value2) {
            addCriterion("mon_VOC not between", value1, value2, "monVoc");
            return (Criteria) this;
        }

        public Criteria andMonNh3IsNull() {
            addCriterion("mon_NH3 is null");
            return (Criteria) this;
        }

        public Criteria andMonNh3IsNotNull() {
            addCriterion("mon_NH3 is not null");
            return (Criteria) this;
        }

        public Criteria andMonNh3EqualTo(Double value) {
            addCriterion("mon_NH3 =", value, "monNh3");
            return (Criteria) this;
        }

        public Criteria andMonNh3NotEqualTo(Double value) {
            addCriterion("mon_NH3 <>", value, "monNh3");
            return (Criteria) this;
        }

        public Criteria andMonNh3GreaterThan(Double value) {
            addCriterion("mon_NH3 >", value, "monNh3");
            return (Criteria) this;
        }

        public Criteria andMonNh3GreaterThanOrEqualTo(Double value) {
            addCriterion("mon_NH3 >=", value, "monNh3");
            return (Criteria) this;
        }

        public Criteria andMonNh3LessThan(Double value) {
            addCriterion("mon_NH3 <", value, "monNh3");
            return (Criteria) this;
        }

        public Criteria andMonNh3LessThanOrEqualTo(Double value) {
            addCriterion("mon_NH3 <=", value, "monNh3");
            return (Criteria) this;
        }

        public Criteria andMonNh3In(List<Double> values) {
            addCriterion("mon_NH3 in", values, "monNh3");
            return (Criteria) this;
        }

        public Criteria andMonNh3NotIn(List<Double> values) {
            addCriterion("mon_NH3 not in", values, "monNh3");
            return (Criteria) this;
        }

        public Criteria andMonNh3Between(Double value1, Double value2) {
            addCriterion("mon_NH3 between", value1, value2, "monNh3");
            return (Criteria) this;
        }

        public Criteria andMonNh3NotBetween(Double value1, Double value2) {
            addCriterion("mon_NH3 not between", value1, value2, "monNh3");
            return (Criteria) this;
        }

        public Criteria andMonNoIsNull() {
            addCriterion("mon_NO is null");
            return (Criteria) this;
        }

        public Criteria andMonNoIsNotNull() {
            addCriterion("mon_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMonNoEqualTo(Double value) {
            addCriterion("mon_NO =", value, "monNo");
            return (Criteria) this;
        }

        public Criteria andMonNoNotEqualTo(Double value) {
            addCriterion("mon_NO <>", value, "monNo");
            return (Criteria) this;
        }

        public Criteria andMonNoGreaterThan(Double value) {
            addCriterion("mon_NO >", value, "monNo");
            return (Criteria) this;
        }

        public Criteria andMonNoGreaterThanOrEqualTo(Double value) {
            addCriterion("mon_NO >=", value, "monNo");
            return (Criteria) this;
        }

        public Criteria andMonNoLessThan(Double value) {
            addCriterion("mon_NO <", value, "monNo");
            return (Criteria) this;
        }

        public Criteria andMonNoLessThanOrEqualTo(Double value) {
            addCriterion("mon_NO <=", value, "monNo");
            return (Criteria) this;
        }

        public Criteria andMonNoIn(List<Double> values) {
            addCriterion("mon_NO in", values, "monNo");
            return (Criteria) this;
        }

        public Criteria andMonNoNotIn(List<Double> values) {
            addCriterion("mon_NO not in", values, "monNo");
            return (Criteria) this;
        }

        public Criteria andMonNoBetween(Double value1, Double value2) {
            addCriterion("mon_NO between", value1, value2, "monNo");
            return (Criteria) this;
        }

        public Criteria andMonNoNotBetween(Double value1, Double value2) {
            addCriterion("mon_NO not between", value1, value2, "monNo");
            return (Criteria) this;
        }

        public Criteria andMonNo2IsNull() {
            addCriterion("mon_NO2 is null");
            return (Criteria) this;
        }

        public Criteria andMonNo2IsNotNull() {
            addCriterion("mon_NO2 is not null");
            return (Criteria) this;
        }

        public Criteria andMonNo2EqualTo(Double value) {
            addCriterion("mon_NO2 =", value, "monNo2");
            return (Criteria) this;
        }

        public Criteria andMonNo2NotEqualTo(Double value) {
            addCriterion("mon_NO2 <>", value, "monNo2");
            return (Criteria) this;
        }

        public Criteria andMonNo2GreaterThan(Double value) {
            addCriterion("mon_NO2 >", value, "monNo2");
            return (Criteria) this;
        }

        public Criteria andMonNo2GreaterThanOrEqualTo(Double value) {
            addCriterion("mon_NO2 >=", value, "monNo2");
            return (Criteria) this;
        }

        public Criteria andMonNo2LessThan(Double value) {
            addCriterion("mon_NO2 <", value, "monNo2");
            return (Criteria) this;
        }

        public Criteria andMonNo2LessThanOrEqualTo(Double value) {
            addCriterion("mon_NO2 <=", value, "monNo2");
            return (Criteria) this;
        }

        public Criteria andMonNo2In(List<Double> values) {
            addCriterion("mon_NO2 in", values, "monNo2");
            return (Criteria) this;
        }

        public Criteria andMonNo2NotIn(List<Double> values) {
            addCriterion("mon_NO2 not in", values, "monNo2");
            return (Criteria) this;
        }

        public Criteria andMonNo2Between(Double value1, Double value2) {
            addCriterion("mon_NO2 between", value1, value2, "monNo2");
            return (Criteria) this;
        }

        public Criteria andMonNo2NotBetween(Double value1, Double value2) {
            addCriterion("mon_NO2 not between", value1, value2, "monNo2");
            return (Criteria) this;
        }

        public Criteria andMonCoIsNull() {
            addCriterion("mon_CO is null");
            return (Criteria) this;
        }

        public Criteria andMonCoIsNotNull() {
            addCriterion("mon_CO is not null");
            return (Criteria) this;
        }

        public Criteria andMonCoEqualTo(Double value) {
            addCriterion("mon_CO =", value, "monCo");
            return (Criteria) this;
        }

        public Criteria andMonCoNotEqualTo(Double value) {
            addCriterion("mon_CO <>", value, "monCo");
            return (Criteria) this;
        }

        public Criteria andMonCoGreaterThan(Double value) {
            addCriterion("mon_CO >", value, "monCo");
            return (Criteria) this;
        }

        public Criteria andMonCoGreaterThanOrEqualTo(Double value) {
            addCriterion("mon_CO >=", value, "monCo");
            return (Criteria) this;
        }

        public Criteria andMonCoLessThan(Double value) {
            addCriterion("mon_CO <", value, "monCo");
            return (Criteria) this;
        }

        public Criteria andMonCoLessThanOrEqualTo(Double value) {
            addCriterion("mon_CO <=", value, "monCo");
            return (Criteria) this;
        }

        public Criteria andMonCoIn(List<Double> values) {
            addCriterion("mon_CO in", values, "monCo");
            return (Criteria) this;
        }

        public Criteria andMonCoNotIn(List<Double> values) {
            addCriterion("mon_CO not in", values, "monCo");
            return (Criteria) this;
        }

        public Criteria andMonCoBetween(Double value1, Double value2) {
            addCriterion("mon_CO between", value1, value2, "monCo");
            return (Criteria) this;
        }

        public Criteria andMonCoNotBetween(Double value1, Double value2) {
            addCriterion("mon_CO not between", value1, value2, "monCo");
            return (Criteria) this;
        }

        public Criteria andMonSo2IsNull() {
            addCriterion("mon_SO2 is null");
            return (Criteria) this;
        }

        public Criteria andMonSo2IsNotNull() {
            addCriterion("mon_SO2 is not null");
            return (Criteria) this;
        }

        public Criteria andMonSo2EqualTo(Double value) {
            addCriterion("mon_SO2 =", value, "monSo2");
            return (Criteria) this;
        }

        public Criteria andMonSo2NotEqualTo(Double value) {
            addCriterion("mon_SO2 <>", value, "monSo2");
            return (Criteria) this;
        }

        public Criteria andMonSo2GreaterThan(Double value) {
            addCriterion("mon_SO2 >", value, "monSo2");
            return (Criteria) this;
        }

        public Criteria andMonSo2GreaterThanOrEqualTo(Double value) {
            addCriterion("mon_SO2 >=", value, "monSo2");
            return (Criteria) this;
        }

        public Criteria andMonSo2LessThan(Double value) {
            addCriterion("mon_SO2 <", value, "monSo2");
            return (Criteria) this;
        }

        public Criteria andMonSo2LessThanOrEqualTo(Double value) {
            addCriterion("mon_SO2 <=", value, "monSo2");
            return (Criteria) this;
        }

        public Criteria andMonSo2In(List<Double> values) {
            addCriterion("mon_SO2 in", values, "monSo2");
            return (Criteria) this;
        }

        public Criteria andMonSo2NotIn(List<Double> values) {
            addCriterion("mon_SO2 not in", values, "monSo2");
            return (Criteria) this;
        }

        public Criteria andMonSo2Between(Double value1, Double value2) {
            addCriterion("mon_SO2 between", value1, value2, "monSo2");
            return (Criteria) this;
        }

        public Criteria andMonSo2NotBetween(Double value1, Double value2) {
            addCriterion("mon_SO2 not between", value1, value2, "monSo2");
            return (Criteria) this;
        }

        public Criteria andMonPm10IsNull() {
            addCriterion("mon_PM10 is null");
            return (Criteria) this;
        }

        public Criteria andMonPm10IsNotNull() {
            addCriterion("mon_PM10 is not null");
            return (Criteria) this;
        }

        public Criteria andMonPm10EqualTo(Double value) {
            addCriterion("mon_PM10 =", value, "monPm10");
            return (Criteria) this;
        }

        public Criteria andMonPm10NotEqualTo(Double value) {
            addCriterion("mon_PM10 <>", value, "monPm10");
            return (Criteria) this;
        }

        public Criteria andMonPm10GreaterThan(Double value) {
            addCriterion("mon_PM10 >", value, "monPm10");
            return (Criteria) this;
        }

        public Criteria andMonPm10GreaterThanOrEqualTo(Double value) {
            addCriterion("mon_PM10 >=", value, "monPm10");
            return (Criteria) this;
        }

        public Criteria andMonPm10LessThan(Double value) {
            addCriterion("mon_PM10 <", value, "monPm10");
            return (Criteria) this;
        }

        public Criteria andMonPm10LessThanOrEqualTo(Double value) {
            addCriterion("mon_PM10 <=", value, "monPm10");
            return (Criteria) this;
        }

        public Criteria andMonPm10In(List<Double> values) {
            addCriterion("mon_PM10 in", values, "monPm10");
            return (Criteria) this;
        }

        public Criteria andMonPm10NotIn(List<Double> values) {
            addCriterion("mon_PM10 not in", values, "monPm10");
            return (Criteria) this;
        }

        public Criteria andMonPm10Between(Double value1, Double value2) {
            addCriterion("mon_PM10 between", value1, value2, "monPm10");
            return (Criteria) this;
        }

        public Criteria andMonPm10NotBetween(Double value1, Double value2) {
            addCriterion("mon_PM10 not between", value1, value2, "monPm10");
            return (Criteria) this;
        }

        public Criteria andMonPm25IsNull() {
            addCriterion("mon_PM25 is null");
            return (Criteria) this;
        }

        public Criteria andMonPm25IsNotNull() {
            addCriterion("mon_PM25 is not null");
            return (Criteria) this;
        }

        public Criteria andMonPm25EqualTo(Double value) {
            addCriterion("mon_PM25 =", value, "monPm25");
            return (Criteria) this;
        }

        public Criteria andMonPm25NotEqualTo(Double value) {
            addCriterion("mon_PM25 <>", value, "monPm25");
            return (Criteria) this;
        }

        public Criteria andMonPm25GreaterThan(Double value) {
            addCriterion("mon_PM25 >", value, "monPm25");
            return (Criteria) this;
        }

        public Criteria andMonPm25GreaterThanOrEqualTo(Double value) {
            addCriterion("mon_PM25 >=", value, "monPm25");
            return (Criteria) this;
        }

        public Criteria andMonPm25LessThan(Double value) {
            addCriterion("mon_PM25 <", value, "monPm25");
            return (Criteria) this;
        }

        public Criteria andMonPm25LessThanOrEqualTo(Double value) {
            addCriterion("mon_PM25 <=", value, "monPm25");
            return (Criteria) this;
        }

        public Criteria andMonPm25In(List<Double> values) {
            addCriterion("mon_PM25 in", values, "monPm25");
            return (Criteria) this;
        }

        public Criteria andMonPm25NotIn(List<Double> values) {
            addCriterion("mon_PM25 not in", values, "monPm25");
            return (Criteria) this;
        }

        public Criteria andMonPm25Between(Double value1, Double value2) {
            addCriterion("mon_PM25 between", value1, value2, "monPm25");
            return (Criteria) this;
        }

        public Criteria andMonPm25NotBetween(Double value1, Double value2) {
            addCriterion("mon_PM25 not between", value1, value2, "monPm25");
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