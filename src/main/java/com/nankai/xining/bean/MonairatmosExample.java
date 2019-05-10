package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MonairatmosExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MonairatmosExample() {
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

        public Criteria andMonO3IsNull() {
            addCriterion("mon_O3 is null");
            return (Criteria) this;
        }

        public Criteria andMonO3IsNotNull() {
            addCriterion("mon_O3 is not null");
            return (Criteria) this;
        }

        public Criteria andMonO3EqualTo(Double value) {
            addCriterion("mon_O3 =", value, "monO3");
            return (Criteria) this;
        }

        public Criteria andMonO3NotEqualTo(Double value) {
            addCriterion("mon_O3 <>", value, "monO3");
            return (Criteria) this;
        }

        public Criteria andMonO3GreaterThan(Double value) {
            addCriterion("mon_O3 >", value, "monO3");
            return (Criteria) this;
        }

        public Criteria andMonO3GreaterThanOrEqualTo(Double value) {
            addCriterion("mon_O3 >=", value, "monO3");
            return (Criteria) this;
        }

        public Criteria andMonO3LessThan(Double value) {
            addCriterion("mon_O3 <", value, "monO3");
            return (Criteria) this;
        }

        public Criteria andMonO3LessThanOrEqualTo(Double value) {
            addCriterion("mon_O3 <=", value, "monO3");
            return (Criteria) this;
        }

        public Criteria andMonO3In(List<Double> values) {
            addCriterion("mon_O3 in", values, "monO3");
            return (Criteria) this;
        }

        public Criteria andMonO3NotIn(List<Double> values) {
            addCriterion("mon_O3 not in", values, "monO3");
            return (Criteria) this;
        }

        public Criteria andMonO3Between(Double value1, Double value2) {
            addCriterion("mon_O3 between", value1, value2, "monO3");
            return (Criteria) this;
        }

        public Criteria andMonO3NotBetween(Double value1, Double value2) {
            addCriterion("mon_O3 not between", value1, value2, "monO3");
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

        public Criteria andMonNoxIsNull() {
            addCriterion("mon_NOX is null");
            return (Criteria) this;
        }

        public Criteria andMonNoxIsNotNull() {
            addCriterion("mon_NOX is not null");
            return (Criteria) this;
        }

        public Criteria andMonNoxEqualTo(Double value) {
            addCriterion("mon_NOX =", value, "monNox");
            return (Criteria) this;
        }

        public Criteria andMonNoxNotEqualTo(Double value) {
            addCriterion("mon_NOX <>", value, "monNox");
            return (Criteria) this;
        }

        public Criteria andMonNoxGreaterThan(Double value) {
            addCriterion("mon_NOX >", value, "monNox");
            return (Criteria) this;
        }

        public Criteria andMonNoxGreaterThanOrEqualTo(Double value) {
            addCriterion("mon_NOX >=", value, "monNox");
            return (Criteria) this;
        }

        public Criteria andMonNoxLessThan(Double value) {
            addCriterion("mon_NOX <", value, "monNox");
            return (Criteria) this;
        }

        public Criteria andMonNoxLessThanOrEqualTo(Double value) {
            addCriterion("mon_NOX <=", value, "monNox");
            return (Criteria) this;
        }

        public Criteria andMonNoxIn(List<Double> values) {
            addCriterion("mon_NOX in", values, "monNox");
            return (Criteria) this;
        }

        public Criteria andMonNoxNotIn(List<Double> values) {
            addCriterion("mon_NOX not in", values, "monNox");
            return (Criteria) this;
        }

        public Criteria andMonNoxBetween(Double value1, Double value2) {
            addCriterion("mon_NOX between", value1, value2, "monNox");
            return (Criteria) this;
        }

        public Criteria andMonNoxNotBetween(Double value1, Double value2) {
            addCriterion("mon_NOX not between", value1, value2, "monNox");
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

        public Criteria andMonMonssureIsNull() {
            addCriterion("mon_monSSURE is null");
            return (Criteria) this;
        }

        public Criteria andMonMonssureIsNotNull() {
            addCriterion("mon_monSSURE is not null");
            return (Criteria) this;
        }

        public Criteria andMonMonssureEqualTo(Double value) {
            addCriterion("mon_monSSURE =", value, "monMonssure");
            return (Criteria) this;
        }

        public Criteria andMonMonssureNotEqualTo(Double value) {
            addCriterion("mon_monSSURE <>", value, "monMonssure");
            return (Criteria) this;
        }

        public Criteria andMonMonssureGreaterThan(Double value) {
            addCriterion("mon_monSSURE >", value, "monMonssure");
            return (Criteria) this;
        }

        public Criteria andMonMonssureGreaterThanOrEqualTo(Double value) {
            addCriterion("mon_monSSURE >=", value, "monMonssure");
            return (Criteria) this;
        }

        public Criteria andMonMonssureLessThan(Double value) {
            addCriterion("mon_monSSURE <", value, "monMonssure");
            return (Criteria) this;
        }

        public Criteria andMonMonssureLessThanOrEqualTo(Double value) {
            addCriterion("mon_monSSURE <=", value, "monMonssure");
            return (Criteria) this;
        }

        public Criteria andMonMonssureIn(List<Double> values) {
            addCriterion("mon_monSSURE in", values, "monMonssure");
            return (Criteria) this;
        }

        public Criteria andMonMonssureNotIn(List<Double> values) {
            addCriterion("mon_monSSURE not in", values, "monMonssure");
            return (Criteria) this;
        }

        public Criteria andMonMonssureBetween(Double value1, Double value2) {
            addCriterion("mon_monSSURE between", value1, value2, "monMonssure");
            return (Criteria) this;
        }

        public Criteria andMonMonssureNotBetween(Double value1, Double value2) {
            addCriterion("mon_monSSURE not between", value1, value2, "monMonssure");
            return (Criteria) this;
        }

        public Criteria andMonTempIsNull() {
            addCriterion("mon_TEMP is null");
            return (Criteria) this;
        }

        public Criteria andMonTempIsNotNull() {
            addCriterion("mon_TEMP is not null");
            return (Criteria) this;
        }

        public Criteria andMonTempEqualTo(Double value) {
            addCriterion("mon_TEMP =", value, "monTemp");
            return (Criteria) this;
        }

        public Criteria andMonTempNotEqualTo(Double value) {
            addCriterion("mon_TEMP <>", value, "monTemp");
            return (Criteria) this;
        }

        public Criteria andMonTempGreaterThan(Double value) {
            addCriterion("mon_TEMP >", value, "monTemp");
            return (Criteria) this;
        }

        public Criteria andMonTempGreaterThanOrEqualTo(Double value) {
            addCriterion("mon_TEMP >=", value, "monTemp");
            return (Criteria) this;
        }

        public Criteria andMonTempLessThan(Double value) {
            addCriterion("mon_TEMP <", value, "monTemp");
            return (Criteria) this;
        }

        public Criteria andMonTempLessThanOrEqualTo(Double value) {
            addCriterion("mon_TEMP <=", value, "monTemp");
            return (Criteria) this;
        }

        public Criteria andMonTempIn(List<Double> values) {
            addCriterion("mon_TEMP in", values, "monTemp");
            return (Criteria) this;
        }

        public Criteria andMonTempNotIn(List<Double> values) {
            addCriterion("mon_TEMP not in", values, "monTemp");
            return (Criteria) this;
        }

        public Criteria andMonTempBetween(Double value1, Double value2) {
            addCriterion("mon_TEMP between", value1, value2, "monTemp");
            return (Criteria) this;
        }

        public Criteria andMonTempNotBetween(Double value1, Double value2) {
            addCriterion("mon_TEMP not between", value1, value2, "monTemp");
            return (Criteria) this;
        }

        public Criteria andMonWsIsNull() {
            addCriterion("mon_WS is null");
            return (Criteria) this;
        }

        public Criteria andMonWsIsNotNull() {
            addCriterion("mon_WS is not null");
            return (Criteria) this;
        }

        public Criteria andMonWsEqualTo(Double value) {
            addCriterion("mon_WS =", value, "monWs");
            return (Criteria) this;
        }

        public Criteria andMonWsNotEqualTo(Double value) {
            addCriterion("mon_WS <>", value, "monWs");
            return (Criteria) this;
        }

        public Criteria andMonWsGreaterThan(Double value) {
            addCriterion("mon_WS >", value, "monWs");
            return (Criteria) this;
        }

        public Criteria andMonWsGreaterThanOrEqualTo(Double value) {
            addCriterion("mon_WS >=", value, "monWs");
            return (Criteria) this;
        }

        public Criteria andMonWsLessThan(Double value) {
            addCriterion("mon_WS <", value, "monWs");
            return (Criteria) this;
        }

        public Criteria andMonWsLessThanOrEqualTo(Double value) {
            addCriterion("mon_WS <=", value, "monWs");
            return (Criteria) this;
        }

        public Criteria andMonWsIn(List<Double> values) {
            addCriterion("mon_WS in", values, "monWs");
            return (Criteria) this;
        }

        public Criteria andMonWsNotIn(List<Double> values) {
            addCriterion("mon_WS not in", values, "monWs");
            return (Criteria) this;
        }

        public Criteria andMonWsBetween(Double value1, Double value2) {
            addCriterion("mon_WS between", value1, value2, "monWs");
            return (Criteria) this;
        }

        public Criteria andMonWsNotBetween(Double value1, Double value2) {
            addCriterion("mon_WS not between", value1, value2, "monWs");
            return (Criteria) this;
        }

        public Criteria andMonWdIsNull() {
            addCriterion("mon_WD is null");
            return (Criteria) this;
        }

        public Criteria andMonWdIsNotNull() {
            addCriterion("mon_WD is not null");
            return (Criteria) this;
        }

        public Criteria andMonWdEqualTo(Double value) {
            addCriterion("mon_WD =", value, "monWd");
            return (Criteria) this;
        }

        public Criteria andMonWdNotEqualTo(Double value) {
            addCriterion("mon_WD <>", value, "monWd");
            return (Criteria) this;
        }

        public Criteria andMonWdGreaterThan(Double value) {
            addCriterion("mon_WD >", value, "monWd");
            return (Criteria) this;
        }

        public Criteria andMonWdGreaterThanOrEqualTo(Double value) {
            addCriterion("mon_WD >=", value, "monWd");
            return (Criteria) this;
        }

        public Criteria andMonWdLessThan(Double value) {
            addCriterion("mon_WD <", value, "monWd");
            return (Criteria) this;
        }

        public Criteria andMonWdLessThanOrEqualTo(Double value) {
            addCriterion("mon_WD <=", value, "monWd");
            return (Criteria) this;
        }

        public Criteria andMonWdIn(List<Double> values) {
            addCriterion("mon_WD in", values, "monWd");
            return (Criteria) this;
        }

        public Criteria andMonWdNotIn(List<Double> values) {
            addCriterion("mon_WD not in", values, "monWd");
            return (Criteria) this;
        }

        public Criteria andMonWdBetween(Double value1, Double value2) {
            addCriterion("mon_WD between", value1, value2, "monWd");
            return (Criteria) this;
        }

        public Criteria andMonWdNotBetween(Double value1, Double value2) {
            addCriterion("mon_WD not between", value1, value2, "monWd");
            return (Criteria) this;
        }

        public Criteria andMonRhIsNull() {
            addCriterion("mon_RH is null");
            return (Criteria) this;
        }

        public Criteria andMonRhIsNotNull() {
            addCriterion("mon_RH is not null");
            return (Criteria) this;
        }

        public Criteria andMonRhEqualTo(Double value) {
            addCriterion("mon_RH =", value, "monRh");
            return (Criteria) this;
        }

        public Criteria andMonRhNotEqualTo(Double value) {
            addCriterion("mon_RH <>", value, "monRh");
            return (Criteria) this;
        }

        public Criteria andMonRhGreaterThan(Double value) {
            addCriterion("mon_RH >", value, "monRh");
            return (Criteria) this;
        }

        public Criteria andMonRhGreaterThanOrEqualTo(Double value) {
            addCriterion("mon_RH >=", value, "monRh");
            return (Criteria) this;
        }

        public Criteria andMonRhLessThan(Double value) {
            addCriterion("mon_RH <", value, "monRh");
            return (Criteria) this;
        }

        public Criteria andMonRhLessThanOrEqualTo(Double value) {
            addCriterion("mon_RH <=", value, "monRh");
            return (Criteria) this;
        }

        public Criteria andMonRhIn(List<Double> values) {
            addCriterion("mon_RH in", values, "monRh");
            return (Criteria) this;
        }

        public Criteria andMonRhNotIn(List<Double> values) {
            addCriterion("mon_RH not in", values, "monRh");
            return (Criteria) this;
        }

        public Criteria andMonRhBetween(Double value1, Double value2) {
            addCriterion("mon_RH between", value1, value2, "monRh");
            return (Criteria) this;
        }

        public Criteria andMonRhNotBetween(Double value1, Double value2) {
            addCriterion("mon_RH not between", value1, value2, "monRh");
            return (Criteria) this;
        }

        public Criteria andMonHazeIsNull() {
            addCriterion("mon_haze is null");
            return (Criteria) this;
        }

        public Criteria andMonHazeIsNotNull() {
            addCriterion("mon_haze is not null");
            return (Criteria) this;
        }

        public Criteria andMonHazeEqualTo(Integer value) {
            addCriterion("mon_haze =", value, "monHaze");
            return (Criteria) this;
        }

        public Criteria andMonHazeNotEqualTo(Integer value) {
            addCriterion("mon_haze <>", value, "monHaze");
            return (Criteria) this;
        }

        public Criteria andMonHazeGreaterThan(Integer value) {
            addCriterion("mon_haze >", value, "monHaze");
            return (Criteria) this;
        }

        public Criteria andMonHazeGreaterThanOrEqualTo(Integer value) {
            addCriterion("mon_haze >=", value, "monHaze");
            return (Criteria) this;
        }

        public Criteria andMonHazeLessThan(Integer value) {
            addCriterion("mon_haze <", value, "monHaze");
            return (Criteria) this;
        }

        public Criteria andMonHazeLessThanOrEqualTo(Integer value) {
            addCriterion("mon_haze <=", value, "monHaze");
            return (Criteria) this;
        }

        public Criteria andMonHazeIn(List<Integer> values) {
            addCriterion("mon_haze in", values, "monHaze");
            return (Criteria) this;
        }

        public Criteria andMonHazeNotIn(List<Integer> values) {
            addCriterion("mon_haze not in", values, "monHaze");
            return (Criteria) this;
        }

        public Criteria andMonHazeBetween(Integer value1, Integer value2) {
            addCriterion("mon_haze between", value1, value2, "monHaze");
            return (Criteria) this;
        }

        public Criteria andMonHazeNotBetween(Integer value1, Integer value2) {
            addCriterion("mon_haze not between", value1, value2, "monHaze");
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