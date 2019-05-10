package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class IndustryfactorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IndustryfactorExample() {
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

        public Criteria andIndustryfactoridIsNull() {
            addCriterion("industryfactorid is null");
            return (Criteria) this;
        }

        public Criteria andIndustryfactoridIsNotNull() {
            addCriterion("industryfactorid is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryfactoridEqualTo(Integer value) {
            addCriterion("industryfactorid =", value, "industryfactorid");
            return (Criteria) this;
        }

        public Criteria andIndustryfactoridNotEqualTo(Integer value) {
            addCriterion("industryfactorid <>", value, "industryfactorid");
            return (Criteria) this;
        }

        public Criteria andIndustryfactoridGreaterThan(Integer value) {
            addCriterion("industryfactorid >", value, "industryfactorid");
            return (Criteria) this;
        }

        public Criteria andIndustryfactoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("industryfactorid >=", value, "industryfactorid");
            return (Criteria) this;
        }

        public Criteria andIndustryfactoridLessThan(Integer value) {
            addCriterion("industryfactorid <", value, "industryfactorid");
            return (Criteria) this;
        }

        public Criteria andIndustryfactoridLessThanOrEqualTo(Integer value) {
            addCriterion("industryfactorid <=", value, "industryfactorid");
            return (Criteria) this;
        }

        public Criteria andIndustryfactoridIn(List<Integer> values) {
            addCriterion("industryfactorid in", values, "industryfactorid");
            return (Criteria) this;
        }

        public Criteria andIndustryfactoridNotIn(List<Integer> values) {
            addCriterion("industryfactorid not in", values, "industryfactorid");
            return (Criteria) this;
        }

        public Criteria andIndustryfactoridBetween(Integer value1, Integer value2) {
            addCriterion("industryfactorid between", value1, value2, "industryfactorid");
            return (Criteria) this;
        }

        public Criteria andIndustryfactoridNotBetween(Integer value1, Integer value2) {
            addCriterion("industryfactorid not between", value1, value2, "industryfactorid");
            return (Criteria) this;
        }

        public Criteria andIndustrynameIsNull() {
            addCriterion("industryname is null");
            return (Criteria) this;
        }

        public Criteria andIndustrynameIsNotNull() {
            addCriterion("industryname is not null");
            return (Criteria) this;
        }

        public Criteria andIndustrynameEqualTo(String value) {
            addCriterion("industryname =", value, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameNotEqualTo(String value) {
            addCriterion("industryname <>", value, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameGreaterThan(String value) {
            addCriterion("industryname >", value, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameGreaterThanOrEqualTo(String value) {
            addCriterion("industryname >=", value, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameLessThan(String value) {
            addCriterion("industryname <", value, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameLessThanOrEqualTo(String value) {
            addCriterion("industryname <=", value, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameLike(String value) {
            addCriterion("industryname like", value, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameNotLike(String value) {
            addCriterion("industryname not like", value, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameIn(List<String> values) {
            addCriterion("industryname in", values, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameNotIn(List<String> values) {
            addCriterion("industryname not in", values, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameBetween(String value1, String value2) {
            addCriterion("industryname between", value1, value2, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameNotBetween(String value1, String value2) {
            addCriterion("industryname not between", value1, value2, "industryname");
            return (Criteria) this;
        }

        public Criteria andEvalatePmIsNull() {
            addCriterion("evalate_pm is null");
            return (Criteria) this;
        }

        public Criteria andEvalatePmIsNotNull() {
            addCriterion("evalate_pm is not null");
            return (Criteria) this;
        }

        public Criteria andEvalatePmEqualTo(Double value) {
            addCriterion("evalate_pm =", value, "evalatePm");
            return (Criteria) this;
        }

        public Criteria andEvalatePmNotEqualTo(Double value) {
            addCriterion("evalate_pm <>", value, "evalatePm");
            return (Criteria) this;
        }

        public Criteria andEvalatePmGreaterThan(Double value) {
            addCriterion("evalate_pm >", value, "evalatePm");
            return (Criteria) this;
        }

        public Criteria andEvalatePmGreaterThanOrEqualTo(Double value) {
            addCriterion("evalate_pm >=", value, "evalatePm");
            return (Criteria) this;
        }

        public Criteria andEvalatePmLessThan(Double value) {
            addCriterion("evalate_pm <", value, "evalatePm");
            return (Criteria) this;
        }

        public Criteria andEvalatePmLessThanOrEqualTo(Double value) {
            addCriterion("evalate_pm <=", value, "evalatePm");
            return (Criteria) this;
        }

        public Criteria andEvalatePmIn(List<Double> values) {
            addCriterion("evalate_pm in", values, "evalatePm");
            return (Criteria) this;
        }

        public Criteria andEvalatePmNotIn(List<Double> values) {
            addCriterion("evalate_pm not in", values, "evalatePm");
            return (Criteria) this;
        }

        public Criteria andEvalatePmBetween(Double value1, Double value2) {
            addCriterion("evalate_pm between", value1, value2, "evalatePm");
            return (Criteria) this;
        }

        public Criteria andEvalatePmNotBetween(Double value1, Double value2) {
            addCriterion("evalate_pm not between", value1, value2, "evalatePm");
            return (Criteria) this;
        }

        public Criteria andEvalateNoxIsNull() {
            addCriterion("evalate_nox is null");
            return (Criteria) this;
        }

        public Criteria andEvalateNoxIsNotNull() {
            addCriterion("evalate_nox is not null");
            return (Criteria) this;
        }

        public Criteria andEvalateNoxEqualTo(Double value) {
            addCriterion("evalate_nox =", value, "evalateNox");
            return (Criteria) this;
        }

        public Criteria andEvalateNoxNotEqualTo(Double value) {
            addCriterion("evalate_nox <>", value, "evalateNox");
            return (Criteria) this;
        }

        public Criteria andEvalateNoxGreaterThan(Double value) {
            addCriterion("evalate_nox >", value, "evalateNox");
            return (Criteria) this;
        }

        public Criteria andEvalateNoxGreaterThanOrEqualTo(Double value) {
            addCriterion("evalate_nox >=", value, "evalateNox");
            return (Criteria) this;
        }

        public Criteria andEvalateNoxLessThan(Double value) {
            addCriterion("evalate_nox <", value, "evalateNox");
            return (Criteria) this;
        }

        public Criteria andEvalateNoxLessThanOrEqualTo(Double value) {
            addCriterion("evalate_nox <=", value, "evalateNox");
            return (Criteria) this;
        }

        public Criteria andEvalateNoxIn(List<Double> values) {
            addCriterion("evalate_nox in", values, "evalateNox");
            return (Criteria) this;
        }

        public Criteria andEvalateNoxNotIn(List<Double> values) {
            addCriterion("evalate_nox not in", values, "evalateNox");
            return (Criteria) this;
        }

        public Criteria andEvalateNoxBetween(Double value1, Double value2) {
            addCriterion("evalate_nox between", value1, value2, "evalateNox");
            return (Criteria) this;
        }

        public Criteria andEvalateNoxNotBetween(Double value1, Double value2) {
            addCriterion("evalate_nox not between", value1, value2, "evalateNox");
            return (Criteria) this;
        }

        public Criteria andEvalateSo2IsNull() {
            addCriterion("evalate_so2 is null");
            return (Criteria) this;
        }

        public Criteria andEvalateSo2IsNotNull() {
            addCriterion("evalate_so2 is not null");
            return (Criteria) this;
        }

        public Criteria andEvalateSo2EqualTo(Double value) {
            addCriterion("evalate_so2 =", value, "evalateSo2");
            return (Criteria) this;
        }

        public Criteria andEvalateSo2NotEqualTo(Double value) {
            addCriterion("evalate_so2 <>", value, "evalateSo2");
            return (Criteria) this;
        }

        public Criteria andEvalateSo2GreaterThan(Double value) {
            addCriterion("evalate_so2 >", value, "evalateSo2");
            return (Criteria) this;
        }

        public Criteria andEvalateSo2GreaterThanOrEqualTo(Double value) {
            addCriterion("evalate_so2 >=", value, "evalateSo2");
            return (Criteria) this;
        }

        public Criteria andEvalateSo2LessThan(Double value) {
            addCriterion("evalate_so2 <", value, "evalateSo2");
            return (Criteria) this;
        }

        public Criteria andEvalateSo2LessThanOrEqualTo(Double value) {
            addCriterion("evalate_so2 <=", value, "evalateSo2");
            return (Criteria) this;
        }

        public Criteria andEvalateSo2In(List<Double> values) {
            addCriterion("evalate_so2 in", values, "evalateSo2");
            return (Criteria) this;
        }

        public Criteria andEvalateSo2NotIn(List<Double> values) {
            addCriterion("evalate_so2 not in", values, "evalateSo2");
            return (Criteria) this;
        }

        public Criteria andEvalateSo2Between(Double value1, Double value2) {
            addCriterion("evalate_so2 between", value1, value2, "evalateSo2");
            return (Criteria) this;
        }

        public Criteria andEvalateSo2NotBetween(Double value1, Double value2) {
            addCriterion("evalate_so2 not between", value1, value2, "evalateSo2");
            return (Criteria) this;
        }

        public Criteria andLocalPm10IsNull() {
            addCriterion("local_pm10 is null");
            return (Criteria) this;
        }

        public Criteria andLocalPm10IsNotNull() {
            addCriterion("local_pm10 is not null");
            return (Criteria) this;
        }

        public Criteria andLocalPm10EqualTo(Double value) {
            addCriterion("local_pm10 =", value, "localPm10");
            return (Criteria) this;
        }

        public Criteria andLocalPm10NotEqualTo(Double value) {
            addCriterion("local_pm10 <>", value, "localPm10");
            return (Criteria) this;
        }

        public Criteria andLocalPm10GreaterThan(Double value) {
            addCriterion("local_pm10 >", value, "localPm10");
            return (Criteria) this;
        }

        public Criteria andLocalPm10GreaterThanOrEqualTo(Double value) {
            addCriterion("local_pm10 >=", value, "localPm10");
            return (Criteria) this;
        }

        public Criteria andLocalPm10LessThan(Double value) {
            addCriterion("local_pm10 <", value, "localPm10");
            return (Criteria) this;
        }

        public Criteria andLocalPm10LessThanOrEqualTo(Double value) {
            addCriterion("local_pm10 <=", value, "localPm10");
            return (Criteria) this;
        }

        public Criteria andLocalPm10In(List<Double> values) {
            addCriterion("local_pm10 in", values, "localPm10");
            return (Criteria) this;
        }

        public Criteria andLocalPm10NotIn(List<Double> values) {
            addCriterion("local_pm10 not in", values, "localPm10");
            return (Criteria) this;
        }

        public Criteria andLocalPm10Between(Double value1, Double value2) {
            addCriterion("local_pm10 between", value1, value2, "localPm10");
            return (Criteria) this;
        }

        public Criteria andLocalPm10NotBetween(Double value1, Double value2) {
            addCriterion("local_pm10 not between", value1, value2, "localPm10");
            return (Criteria) this;
        }

        public Criteria andLocalPm25IsNull() {
            addCriterion("local_pm25 is null");
            return (Criteria) this;
        }

        public Criteria andLocalPm25IsNotNull() {
            addCriterion("local_pm25 is not null");
            return (Criteria) this;
        }

        public Criteria andLocalPm25EqualTo(Double value) {
            addCriterion("local_pm25 =", value, "localPm25");
            return (Criteria) this;
        }

        public Criteria andLocalPm25NotEqualTo(Double value) {
            addCriterion("local_pm25 <>", value, "localPm25");
            return (Criteria) this;
        }

        public Criteria andLocalPm25GreaterThan(Double value) {
            addCriterion("local_pm25 >", value, "localPm25");
            return (Criteria) this;
        }

        public Criteria andLocalPm25GreaterThanOrEqualTo(Double value) {
            addCriterion("local_pm25 >=", value, "localPm25");
            return (Criteria) this;
        }

        public Criteria andLocalPm25LessThan(Double value) {
            addCriterion("local_pm25 <", value, "localPm25");
            return (Criteria) this;
        }

        public Criteria andLocalPm25LessThanOrEqualTo(Double value) {
            addCriterion("local_pm25 <=", value, "localPm25");
            return (Criteria) this;
        }

        public Criteria andLocalPm25In(List<Double> values) {
            addCriterion("local_pm25 in", values, "localPm25");
            return (Criteria) this;
        }

        public Criteria andLocalPm25NotIn(List<Double> values) {
            addCriterion("local_pm25 not in", values, "localPm25");
            return (Criteria) this;
        }

        public Criteria andLocalPm25Between(Double value1, Double value2) {
            addCriterion("local_pm25 between", value1, value2, "localPm25");
            return (Criteria) this;
        }

        public Criteria andLocalPm25NotBetween(Double value1, Double value2) {
            addCriterion("local_pm25 not between", value1, value2, "localPm25");
            return (Criteria) this;
        }

        public Criteria andReferenceOcsIsNull() {
            addCriterion("reference_ocs is null");
            return (Criteria) this;
        }

        public Criteria andReferenceOcsIsNotNull() {
            addCriterion("reference_ocs is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceOcsEqualTo(Double value) {
            addCriterion("reference_ocs =", value, "referenceOcs");
            return (Criteria) this;
        }

        public Criteria andReferenceOcsNotEqualTo(Double value) {
            addCriterion("reference_ocs <>", value, "referenceOcs");
            return (Criteria) this;
        }

        public Criteria andReferenceOcsGreaterThan(Double value) {
            addCriterion("reference_ocs >", value, "referenceOcs");
            return (Criteria) this;
        }

        public Criteria andReferenceOcsGreaterThanOrEqualTo(Double value) {
            addCriterion("reference_ocs >=", value, "referenceOcs");
            return (Criteria) this;
        }

        public Criteria andReferenceOcsLessThan(Double value) {
            addCriterion("reference_ocs <", value, "referenceOcs");
            return (Criteria) this;
        }

        public Criteria andReferenceOcsLessThanOrEqualTo(Double value) {
            addCriterion("reference_ocs <=", value, "referenceOcs");
            return (Criteria) this;
        }

        public Criteria andReferenceOcsIn(List<Double> values) {
            addCriterion("reference_ocs in", values, "referenceOcs");
            return (Criteria) this;
        }

        public Criteria andReferenceOcsNotIn(List<Double> values) {
            addCriterion("reference_ocs not in", values, "referenceOcs");
            return (Criteria) this;
        }

        public Criteria andReferenceOcsBetween(Double value1, Double value2) {
            addCriterion("reference_ocs between", value1, value2, "referenceOcs");
            return (Criteria) this;
        }

        public Criteria andReferenceOcsNotBetween(Double value1, Double value2) {
            addCriterion("reference_ocs not between", value1, value2, "referenceOcs");
            return (Criteria) this;
        }

        public Criteria andReferenceCoIsNull() {
            addCriterion("reference_co is null");
            return (Criteria) this;
        }

        public Criteria andReferenceCoIsNotNull() {
            addCriterion("reference_co is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceCoEqualTo(Double value) {
            addCriterion("reference_co =", value, "referenceCo");
            return (Criteria) this;
        }

        public Criteria andReferenceCoNotEqualTo(Double value) {
            addCriterion("reference_co <>", value, "referenceCo");
            return (Criteria) this;
        }

        public Criteria andReferenceCoGreaterThan(Double value) {
            addCriterion("reference_co >", value, "referenceCo");
            return (Criteria) this;
        }

        public Criteria andReferenceCoGreaterThanOrEqualTo(Double value) {
            addCriterion("reference_co >=", value, "referenceCo");
            return (Criteria) this;
        }

        public Criteria andReferenceCoLessThan(Double value) {
            addCriterion("reference_co <", value, "referenceCo");
            return (Criteria) this;
        }

        public Criteria andReferenceCoLessThanOrEqualTo(Double value) {
            addCriterion("reference_co <=", value, "referenceCo");
            return (Criteria) this;
        }

        public Criteria andReferenceCoIn(List<Double> values) {
            addCriterion("reference_co in", values, "referenceCo");
            return (Criteria) this;
        }

        public Criteria andReferenceCoNotIn(List<Double> values) {
            addCriterion("reference_co not in", values, "referenceCo");
            return (Criteria) this;
        }

        public Criteria andReferenceCoBetween(Double value1, Double value2) {
            addCriterion("reference_co between", value1, value2, "referenceCo");
            return (Criteria) this;
        }

        public Criteria andReferenceCoNotBetween(Double value1, Double value2) {
            addCriterion("reference_co not between", value1, value2, "referenceCo");
            return (Criteria) this;
        }

        public Criteria andFueltypeidIsNull() {
            addCriterion("fueltypeid is null");
            return (Criteria) this;
        }

        public Criteria andFueltypeidIsNotNull() {
            addCriterion("fueltypeid is not null");
            return (Criteria) this;
        }

        public Criteria andFueltypeidEqualTo(Integer value) {
            addCriterion("fueltypeid =", value, "fueltypeid");
            return (Criteria) this;
        }

        public Criteria andFueltypeidNotEqualTo(Integer value) {
            addCriterion("fueltypeid <>", value, "fueltypeid");
            return (Criteria) this;
        }

        public Criteria andFueltypeidGreaterThan(Integer value) {
            addCriterion("fueltypeid >", value, "fueltypeid");
            return (Criteria) this;
        }

        public Criteria andFueltypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fueltypeid >=", value, "fueltypeid");
            return (Criteria) this;
        }

        public Criteria andFueltypeidLessThan(Integer value) {
            addCriterion("fueltypeid <", value, "fueltypeid");
            return (Criteria) this;
        }

        public Criteria andFueltypeidLessThanOrEqualTo(Integer value) {
            addCriterion("fueltypeid <=", value, "fueltypeid");
            return (Criteria) this;
        }

        public Criteria andFueltypeidIn(List<Integer> values) {
            addCriterion("fueltypeid in", values, "fueltypeid");
            return (Criteria) this;
        }

        public Criteria andFueltypeidNotIn(List<Integer> values) {
            addCriterion("fueltypeid not in", values, "fueltypeid");
            return (Criteria) this;
        }

        public Criteria andFueltypeidBetween(Integer value1, Integer value2) {
            addCriterion("fueltypeid between", value1, value2, "fueltypeid");
            return (Criteria) this;
        }

        public Criteria andFueltypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("fueltypeid not between", value1, value2, "fueltypeid");
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