package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class WasteDisposalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WasteDisposalExample() {
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

        public Criteria andSccIsNull() {
            addCriterion("scc is null");
            return (Criteria) this;
        }

        public Criteria andSccIsNotNull() {
            addCriterion("scc is not null");
            return (Criteria) this;
        }

        public Criteria andSccEqualTo(String value) {
            addCriterion("scc =", value, "scc");
            return (Criteria) this;
        }

        public Criteria andSccNotEqualTo(String value) {
            addCriterion("scc <>", value, "scc");
            return (Criteria) this;
        }

        public Criteria andSccGreaterThan(String value) {
            addCriterion("scc >", value, "scc");
            return (Criteria) this;
        }

        public Criteria andSccGreaterThanOrEqualTo(String value) {
            addCriterion("scc >=", value, "scc");
            return (Criteria) this;
        }

        public Criteria andSccLessThan(String value) {
            addCriterion("scc <", value, "scc");
            return (Criteria) this;
        }

        public Criteria andSccLessThanOrEqualTo(String value) {
            addCriterion("scc <=", value, "scc");
            return (Criteria) this;
        }

        public Criteria andSccLike(String value) {
            addCriterion("scc like", value, "scc");
            return (Criteria) this;
        }

        public Criteria andSccNotLike(String value) {
            addCriterion("scc not like", value, "scc");
            return (Criteria) this;
        }

        public Criteria andSccIn(List<String> values) {
            addCriterion("scc in", values, "scc");
            return (Criteria) this;
        }

        public Criteria andSccNotIn(List<String> values) {
            addCriterion("scc not in", values, "scc");
            return (Criteria) this;
        }

        public Criteria andSccBetween(String value1, String value2) {
            addCriterion("scc between", value1, value2, "scc");
            return (Criteria) this;
        }

        public Criteria andSccNotBetween(String value1, String value2) {
            addCriterion("scc not between", value1, value2, "scc");
            return (Criteria) this;
        }

        public Criteria andFactoryIdIsNull() {
            addCriterion("factory_id is null");
            return (Criteria) this;
        }

        public Criteria andFactoryIdIsNotNull() {
            addCriterion("factory_id is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryIdEqualTo(Integer value) {
            addCriterion("factory_id =", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotEqualTo(Integer value) {
            addCriterion("factory_id <>", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdGreaterThan(Integer value) {
            addCriterion("factory_id >", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("factory_id >=", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdLessThan(Integer value) {
            addCriterion("factory_id <", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("factory_id <=", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdIn(List<Integer> values) {
            addCriterion("factory_id in", values, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotIn(List<Integer> values) {
            addCriterion("factory_id not in", values, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdBetween(Integer value1, Integer value2) {
            addCriterion("factory_id between", value1, value2, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("factory_id not between", value1, value2, "factoryId");
            return (Criteria) this;
        }

        public Criteria andTreatmentIsNull() {
            addCriterion("treatment is null");
            return (Criteria) this;
        }

        public Criteria andTreatmentIsNotNull() {
            addCriterion("treatment is not null");
            return (Criteria) this;
        }

        public Criteria andTreatmentEqualTo(String value) {
            addCriterion("treatment =", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentNotEqualTo(String value) {
            addCriterion("treatment <>", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentGreaterThan(String value) {
            addCriterion("treatment >", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentGreaterThanOrEqualTo(String value) {
            addCriterion("treatment >=", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentLessThan(String value) {
            addCriterion("treatment <", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentLessThanOrEqualTo(String value) {
            addCriterion("treatment <=", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentLike(String value) {
            addCriterion("treatment like", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentNotLike(String value) {
            addCriterion("treatment not like", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentIn(List<String> values) {
            addCriterion("treatment in", values, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentNotIn(List<String> values) {
            addCriterion("treatment not in", values, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentBetween(String value1, String value2) {
            addCriterion("treatment between", value1, value2, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentNotBetween(String value1, String value2) {
            addCriterion("treatment not between", value1, value2, "treatment");
            return (Criteria) this;
        }

        public Criteria andWasteType2IsNull() {
            addCriterion("waste_type2 is null");
            return (Criteria) this;
        }

        public Criteria andWasteType2IsNotNull() {
            addCriterion("waste_type2 is not null");
            return (Criteria) this;
        }

        public Criteria andWasteType2EqualTo(String value) {
            addCriterion("waste_type2 =", value, "wasteType2");
            return (Criteria) this;
        }

        public Criteria andWasteType2NotEqualTo(String value) {
            addCriterion("waste_type2 <>", value, "wasteType2");
            return (Criteria) this;
        }

        public Criteria andWasteType2GreaterThan(String value) {
            addCriterion("waste_type2 >", value, "wasteType2");
            return (Criteria) this;
        }

        public Criteria andWasteType2GreaterThanOrEqualTo(String value) {
            addCriterion("waste_type2 >=", value, "wasteType2");
            return (Criteria) this;
        }

        public Criteria andWasteType2LessThan(String value) {
            addCriterion("waste_type2 <", value, "wasteType2");
            return (Criteria) this;
        }

        public Criteria andWasteType2LessThanOrEqualTo(String value) {
            addCriterion("waste_type2 <=", value, "wasteType2");
            return (Criteria) this;
        }

        public Criteria andWasteType2Like(String value) {
            addCriterion("waste_type2 like", value, "wasteType2");
            return (Criteria) this;
        }

        public Criteria andWasteType2NotLike(String value) {
            addCriterion("waste_type2 not like", value, "wasteType2");
            return (Criteria) this;
        }

        public Criteria andWasteType2In(List<String> values) {
            addCriterion("waste_type2 in", values, "wasteType2");
            return (Criteria) this;
        }

        public Criteria andWasteType2NotIn(List<String> values) {
            addCriterion("waste_type2 not in", values, "wasteType2");
            return (Criteria) this;
        }

        public Criteria andWasteType2Between(String value1, String value2) {
            addCriterion("waste_type2 between", value1, value2, "wasteType2");
            return (Criteria) this;
        }

        public Criteria andWasteType2NotBetween(String value1, String value2) {
            addCriterion("waste_type2 not between", value1, value2, "wasteType2");
            return (Criteria) this;
        }

        public Criteria andWasteType3IsNull() {
            addCriterion("waste_type3 is null");
            return (Criteria) this;
        }

        public Criteria andWasteType3IsNotNull() {
            addCriterion("waste_type3 is not null");
            return (Criteria) this;
        }

        public Criteria andWasteType3EqualTo(String value) {
            addCriterion("waste_type3 =", value, "wasteType3");
            return (Criteria) this;
        }

        public Criteria andWasteType3NotEqualTo(String value) {
            addCriterion("waste_type3 <>", value, "wasteType3");
            return (Criteria) this;
        }

        public Criteria andWasteType3GreaterThan(String value) {
            addCriterion("waste_type3 >", value, "wasteType3");
            return (Criteria) this;
        }

        public Criteria andWasteType3GreaterThanOrEqualTo(String value) {
            addCriterion("waste_type3 >=", value, "wasteType3");
            return (Criteria) this;
        }

        public Criteria andWasteType3LessThan(String value) {
            addCriterion("waste_type3 <", value, "wasteType3");
            return (Criteria) this;
        }

        public Criteria andWasteType3LessThanOrEqualTo(String value) {
            addCriterion("waste_type3 <=", value, "wasteType3");
            return (Criteria) this;
        }

        public Criteria andWasteType3Like(String value) {
            addCriterion("waste_type3 like", value, "wasteType3");
            return (Criteria) this;
        }

        public Criteria andWasteType3NotLike(String value) {
            addCriterion("waste_type3 not like", value, "wasteType3");
            return (Criteria) this;
        }

        public Criteria andWasteType3In(List<String> values) {
            addCriterion("waste_type3 in", values, "wasteType3");
            return (Criteria) this;
        }

        public Criteria andWasteType3NotIn(List<String> values) {
            addCriterion("waste_type3 not in", values, "wasteType3");
            return (Criteria) this;
        }

        public Criteria andWasteType3Between(String value1, String value2) {
            addCriterion("waste_type3 between", value1, value2, "wasteType3");
            return (Criteria) this;
        }

        public Criteria andWasteType3NotBetween(String value1, String value2) {
            addCriterion("waste_type3 not between", value1, value2, "wasteType3");
            return (Criteria) this;
        }

        public Criteria andWasteTechIsNull() {
            addCriterion("waste_tech is null");
            return (Criteria) this;
        }

        public Criteria andWasteTechIsNotNull() {
            addCriterion("waste_tech is not null");
            return (Criteria) this;
        }

        public Criteria andWasteTechEqualTo(String value) {
            addCriterion("waste_tech =", value, "wasteTech");
            return (Criteria) this;
        }

        public Criteria andWasteTechNotEqualTo(String value) {
            addCriterion("waste_tech <>", value, "wasteTech");
            return (Criteria) this;
        }

        public Criteria andWasteTechGreaterThan(String value) {
            addCriterion("waste_tech >", value, "wasteTech");
            return (Criteria) this;
        }

        public Criteria andWasteTechGreaterThanOrEqualTo(String value) {
            addCriterion("waste_tech >=", value, "wasteTech");
            return (Criteria) this;
        }

        public Criteria andWasteTechLessThan(String value) {
            addCriterion("waste_tech <", value, "wasteTech");
            return (Criteria) this;
        }

        public Criteria andWasteTechLessThanOrEqualTo(String value) {
            addCriterion("waste_tech <=", value, "wasteTech");
            return (Criteria) this;
        }

        public Criteria andWasteTechLike(String value) {
            addCriterion("waste_tech like", value, "wasteTech");
            return (Criteria) this;
        }

        public Criteria andWasteTechNotLike(String value) {
            addCriterion("waste_tech not like", value, "wasteTech");
            return (Criteria) this;
        }

        public Criteria andWasteTechIn(List<String> values) {
            addCriterion("waste_tech in", values, "wasteTech");
            return (Criteria) this;
        }

        public Criteria andWasteTechNotIn(List<String> values) {
            addCriterion("waste_tech not in", values, "wasteTech");
            return (Criteria) this;
        }

        public Criteria andWasteTechBetween(String value1, String value2) {
            addCriterion("waste_tech between", value1, value2, "wasteTech");
            return (Criteria) this;
        }

        public Criteria andWasteTechNotBetween(String value1, String value2) {
            addCriterion("waste_tech not between", value1, value2, "wasteTech");
            return (Criteria) this;
        }

        public Criteria andLongitude1IsNull() {
            addCriterion("longitude1 is null");
            return (Criteria) this;
        }

        public Criteria andLongitude1IsNotNull() {
            addCriterion("longitude1 is not null");
            return (Criteria) this;
        }

        public Criteria andLongitude1EqualTo(Double value) {
            addCriterion("longitude1 =", value, "longitude1");
            return (Criteria) this;
        }

        public Criteria andLongitude1NotEqualTo(Double value) {
            addCriterion("longitude1 <>", value, "longitude1");
            return (Criteria) this;
        }

        public Criteria andLongitude1GreaterThan(Double value) {
            addCriterion("longitude1 >", value, "longitude1");
            return (Criteria) this;
        }

        public Criteria andLongitude1GreaterThanOrEqualTo(Double value) {
            addCriterion("longitude1 >=", value, "longitude1");
            return (Criteria) this;
        }

        public Criteria andLongitude1LessThan(Double value) {
            addCriterion("longitude1 <", value, "longitude1");
            return (Criteria) this;
        }

        public Criteria andLongitude1LessThanOrEqualTo(Double value) {
            addCriterion("longitude1 <=", value, "longitude1");
            return (Criteria) this;
        }

        public Criteria andLongitude1In(List<Double> values) {
            addCriterion("longitude1 in", values, "longitude1");
            return (Criteria) this;
        }

        public Criteria andLongitude1NotIn(List<Double> values) {
            addCriterion("longitude1 not in", values, "longitude1");
            return (Criteria) this;
        }

        public Criteria andLongitude1Between(Double value1, Double value2) {
            addCriterion("longitude1 between", value1, value2, "longitude1");
            return (Criteria) this;
        }

        public Criteria andLongitude1NotBetween(Double value1, Double value2) {
            addCriterion("longitude1 not between", value1, value2, "longitude1");
            return (Criteria) this;
        }

        public Criteria andLatitude1IsNull() {
            addCriterion("latitude1 is null");
            return (Criteria) this;
        }

        public Criteria andLatitude1IsNotNull() {
            addCriterion("latitude1 is not null");
            return (Criteria) this;
        }

        public Criteria andLatitude1EqualTo(Double value) {
            addCriterion("latitude1 =", value, "latitude1");
            return (Criteria) this;
        }

        public Criteria andLatitude1NotEqualTo(Double value) {
            addCriterion("latitude1 <>", value, "latitude1");
            return (Criteria) this;
        }

        public Criteria andLatitude1GreaterThan(Double value) {
            addCriterion("latitude1 >", value, "latitude1");
            return (Criteria) this;
        }

        public Criteria andLatitude1GreaterThanOrEqualTo(Double value) {
            addCriterion("latitude1 >=", value, "latitude1");
            return (Criteria) this;
        }

        public Criteria andLatitude1LessThan(Double value) {
            addCriterion("latitude1 <", value, "latitude1");
            return (Criteria) this;
        }

        public Criteria andLatitude1LessThanOrEqualTo(Double value) {
            addCriterion("latitude1 <=", value, "latitude1");
            return (Criteria) this;
        }

        public Criteria andLatitude1In(List<Double> values) {
            addCriterion("latitude1 in", values, "latitude1");
            return (Criteria) this;
        }

        public Criteria andLatitude1NotIn(List<Double> values) {
            addCriterion("latitude1 not in", values, "latitude1");
            return (Criteria) this;
        }

        public Criteria andLatitude1Between(Double value1, Double value2) {
            addCriterion("latitude1 between", value1, value2, "latitude1");
            return (Criteria) this;
        }

        public Criteria andLatitude1NotBetween(Double value1, Double value2) {
            addCriterion("latitude1 not between", value1, value2, "latitude1");
            return (Criteria) this;
        }

        public Criteria andLongitude2IsNull() {
            addCriterion("longitude2 is null");
            return (Criteria) this;
        }

        public Criteria andLongitude2IsNotNull() {
            addCriterion("longitude2 is not null");
            return (Criteria) this;
        }

        public Criteria andLongitude2EqualTo(Double value) {
            addCriterion("longitude2 =", value, "longitude2");
            return (Criteria) this;
        }

        public Criteria andLongitude2NotEqualTo(Double value) {
            addCriterion("longitude2 <>", value, "longitude2");
            return (Criteria) this;
        }

        public Criteria andLongitude2GreaterThan(Double value) {
            addCriterion("longitude2 >", value, "longitude2");
            return (Criteria) this;
        }

        public Criteria andLongitude2GreaterThanOrEqualTo(Double value) {
            addCriterion("longitude2 >=", value, "longitude2");
            return (Criteria) this;
        }

        public Criteria andLongitude2LessThan(Double value) {
            addCriterion("longitude2 <", value, "longitude2");
            return (Criteria) this;
        }

        public Criteria andLongitude2LessThanOrEqualTo(Double value) {
            addCriterion("longitude2 <=", value, "longitude2");
            return (Criteria) this;
        }

        public Criteria andLongitude2In(List<Double> values) {
            addCriterion("longitude2 in", values, "longitude2");
            return (Criteria) this;
        }

        public Criteria andLongitude2NotIn(List<Double> values) {
            addCriterion("longitude2 not in", values, "longitude2");
            return (Criteria) this;
        }

        public Criteria andLongitude2Between(Double value1, Double value2) {
            addCriterion("longitude2 between", value1, value2, "longitude2");
            return (Criteria) this;
        }

        public Criteria andLongitude2NotBetween(Double value1, Double value2) {
            addCriterion("longitude2 not between", value1, value2, "longitude2");
            return (Criteria) this;
        }

        public Criteria andLatitude2IsNull() {
            addCriterion("latitude2 is null");
            return (Criteria) this;
        }

        public Criteria andLatitude2IsNotNull() {
            addCriterion("latitude2 is not null");
            return (Criteria) this;
        }

        public Criteria andLatitude2EqualTo(Double value) {
            addCriterion("latitude2 =", value, "latitude2");
            return (Criteria) this;
        }

        public Criteria andLatitude2NotEqualTo(Double value) {
            addCriterion("latitude2 <>", value, "latitude2");
            return (Criteria) this;
        }

        public Criteria andLatitude2GreaterThan(Double value) {
            addCriterion("latitude2 >", value, "latitude2");
            return (Criteria) this;
        }

        public Criteria andLatitude2GreaterThanOrEqualTo(Double value) {
            addCriterion("latitude2 >=", value, "latitude2");
            return (Criteria) this;
        }

        public Criteria andLatitude2LessThan(Double value) {
            addCriterion("latitude2 <", value, "latitude2");
            return (Criteria) this;
        }

        public Criteria andLatitude2LessThanOrEqualTo(Double value) {
            addCriterion("latitude2 <=", value, "latitude2");
            return (Criteria) this;
        }

        public Criteria andLatitude2In(List<Double> values) {
            addCriterion("latitude2 in", values, "latitude2");
            return (Criteria) this;
        }

        public Criteria andLatitude2NotIn(List<Double> values) {
            addCriterion("latitude2 not in", values, "latitude2");
            return (Criteria) this;
        }

        public Criteria andLatitude2Between(Double value1, Double value2) {
            addCriterion("latitude2 between", value1, value2, "latitude2");
            return (Criteria) this;
        }

        public Criteria andLatitude2NotBetween(Double value1, Double value2) {
            addCriterion("latitude2 not between", value1, value2, "latitude2");
            return (Criteria) this;
        }

        public Criteria andLongitude3IsNull() {
            addCriterion("longitude3 is null");
            return (Criteria) this;
        }

        public Criteria andLongitude3IsNotNull() {
            addCriterion("longitude3 is not null");
            return (Criteria) this;
        }

        public Criteria andLongitude3EqualTo(Double value) {
            addCriterion("longitude3 =", value, "longitude3");
            return (Criteria) this;
        }

        public Criteria andLongitude3NotEqualTo(Double value) {
            addCriterion("longitude3 <>", value, "longitude3");
            return (Criteria) this;
        }

        public Criteria andLongitude3GreaterThan(Double value) {
            addCriterion("longitude3 >", value, "longitude3");
            return (Criteria) this;
        }

        public Criteria andLongitude3GreaterThanOrEqualTo(Double value) {
            addCriterion("longitude3 >=", value, "longitude3");
            return (Criteria) this;
        }

        public Criteria andLongitude3LessThan(Double value) {
            addCriterion("longitude3 <", value, "longitude3");
            return (Criteria) this;
        }

        public Criteria andLongitude3LessThanOrEqualTo(Double value) {
            addCriterion("longitude3 <=", value, "longitude3");
            return (Criteria) this;
        }

        public Criteria andLongitude3In(List<Double> values) {
            addCriterion("longitude3 in", values, "longitude3");
            return (Criteria) this;
        }

        public Criteria andLongitude3NotIn(List<Double> values) {
            addCriterion("longitude3 not in", values, "longitude3");
            return (Criteria) this;
        }

        public Criteria andLongitude3Between(Double value1, Double value2) {
            addCriterion("longitude3 between", value1, value2, "longitude3");
            return (Criteria) this;
        }

        public Criteria andLongitude3NotBetween(Double value1, Double value2) {
            addCriterion("longitude3 not between", value1, value2, "longitude3");
            return (Criteria) this;
        }

        public Criteria andLatitude3IsNull() {
            addCriterion("latitude3 is null");
            return (Criteria) this;
        }

        public Criteria andLatitude3IsNotNull() {
            addCriterion("latitude3 is not null");
            return (Criteria) this;
        }

        public Criteria andLatitude3EqualTo(Double value) {
            addCriterion("latitude3 =", value, "latitude3");
            return (Criteria) this;
        }

        public Criteria andLatitude3NotEqualTo(Double value) {
            addCriterion("latitude3 <>", value, "latitude3");
            return (Criteria) this;
        }

        public Criteria andLatitude3GreaterThan(Double value) {
            addCriterion("latitude3 >", value, "latitude3");
            return (Criteria) this;
        }

        public Criteria andLatitude3GreaterThanOrEqualTo(Double value) {
            addCriterion("latitude3 >=", value, "latitude3");
            return (Criteria) this;
        }

        public Criteria andLatitude3LessThan(Double value) {
            addCriterion("latitude3 <", value, "latitude3");
            return (Criteria) this;
        }

        public Criteria andLatitude3LessThanOrEqualTo(Double value) {
            addCriterion("latitude3 <=", value, "latitude3");
            return (Criteria) this;
        }

        public Criteria andLatitude3In(List<Double> values) {
            addCriterion("latitude3 in", values, "latitude3");
            return (Criteria) this;
        }

        public Criteria andLatitude3NotIn(List<Double> values) {
            addCriterion("latitude3 not in", values, "latitude3");
            return (Criteria) this;
        }

        public Criteria andLatitude3Between(Double value1, Double value2) {
            addCriterion("latitude3 between", value1, value2, "latitude3");
            return (Criteria) this;
        }

        public Criteria andLatitude3NotBetween(Double value1, Double value2) {
            addCriterion("latitude3 not between", value1, value2, "latitude3");
            return (Criteria) this;
        }

        public Criteria andLongitude4IsNull() {
            addCriterion("longitude4 is null");
            return (Criteria) this;
        }

        public Criteria andLongitude4IsNotNull() {
            addCriterion("longitude4 is not null");
            return (Criteria) this;
        }

        public Criteria andLongitude4EqualTo(Double value) {
            addCriterion("longitude4 =", value, "longitude4");
            return (Criteria) this;
        }

        public Criteria andLongitude4NotEqualTo(Double value) {
            addCriterion("longitude4 <>", value, "longitude4");
            return (Criteria) this;
        }

        public Criteria andLongitude4GreaterThan(Double value) {
            addCriterion("longitude4 >", value, "longitude4");
            return (Criteria) this;
        }

        public Criteria andLongitude4GreaterThanOrEqualTo(Double value) {
            addCriterion("longitude4 >=", value, "longitude4");
            return (Criteria) this;
        }

        public Criteria andLongitude4LessThan(Double value) {
            addCriterion("longitude4 <", value, "longitude4");
            return (Criteria) this;
        }

        public Criteria andLongitude4LessThanOrEqualTo(Double value) {
            addCriterion("longitude4 <=", value, "longitude4");
            return (Criteria) this;
        }

        public Criteria andLongitude4In(List<Double> values) {
            addCriterion("longitude4 in", values, "longitude4");
            return (Criteria) this;
        }

        public Criteria andLongitude4NotIn(List<Double> values) {
            addCriterion("longitude4 not in", values, "longitude4");
            return (Criteria) this;
        }

        public Criteria andLongitude4Between(Double value1, Double value2) {
            addCriterion("longitude4 between", value1, value2, "longitude4");
            return (Criteria) this;
        }

        public Criteria andLongitude4NotBetween(Double value1, Double value2) {
            addCriterion("longitude4 not between", value1, value2, "longitude4");
            return (Criteria) this;
        }

        public Criteria andLatitude4IsNull() {
            addCriterion("latitude4 is null");
            return (Criteria) this;
        }

        public Criteria andLatitude4IsNotNull() {
            addCriterion("latitude4 is not null");
            return (Criteria) this;
        }

        public Criteria andLatitude4EqualTo(Double value) {
            addCriterion("latitude4 =", value, "latitude4");
            return (Criteria) this;
        }

        public Criteria andLatitude4NotEqualTo(Double value) {
            addCriterion("latitude4 <>", value, "latitude4");
            return (Criteria) this;
        }

        public Criteria andLatitude4GreaterThan(Double value) {
            addCriterion("latitude4 >", value, "latitude4");
            return (Criteria) this;
        }

        public Criteria andLatitude4GreaterThanOrEqualTo(Double value) {
            addCriterion("latitude4 >=", value, "latitude4");
            return (Criteria) this;
        }

        public Criteria andLatitude4LessThan(Double value) {
            addCriterion("latitude4 <", value, "latitude4");
            return (Criteria) this;
        }

        public Criteria andLatitude4LessThanOrEqualTo(Double value) {
            addCriterion("latitude4 <=", value, "latitude4");
            return (Criteria) this;
        }

        public Criteria andLatitude4In(List<Double> values) {
            addCriterion("latitude4 in", values, "latitude4");
            return (Criteria) this;
        }

        public Criteria andLatitude4NotIn(List<Double> values) {
            addCriterion("latitude4 not in", values, "latitude4");
            return (Criteria) this;
        }

        public Criteria andLatitude4Between(Double value1, Double value2) {
            addCriterion("latitude4 between", value1, value2, "latitude4");
            return (Criteria) this;
        }

        public Criteria andLatitude4NotBetween(Double value1, Double value2) {
            addCriterion("latitude4 not between", value1, value2, "latitude4");
            return (Criteria) this;
        }

        public Criteria andWwaterCapIsNull() {
            addCriterion("wwater_cap is null");
            return (Criteria) this;
        }

        public Criteria andWwaterCapIsNotNull() {
            addCriterion("wwater_cap is not null");
            return (Criteria) this;
        }

        public Criteria andWwaterCapEqualTo(Double value) {
            addCriterion("wwater_cap =", value, "wwaterCap");
            return (Criteria) this;
        }

        public Criteria andWwaterCapNotEqualTo(Double value) {
            addCriterion("wwater_cap <>", value, "wwaterCap");
            return (Criteria) this;
        }

        public Criteria andWwaterCapGreaterThan(Double value) {
            addCriterion("wwater_cap >", value, "wwaterCap");
            return (Criteria) this;
        }

        public Criteria andWwaterCapGreaterThanOrEqualTo(Double value) {
            addCriterion("wwater_cap >=", value, "wwaterCap");
            return (Criteria) this;
        }

        public Criteria andWwaterCapLessThan(Double value) {
            addCriterion("wwater_cap <", value, "wwaterCap");
            return (Criteria) this;
        }

        public Criteria andWwaterCapLessThanOrEqualTo(Double value) {
            addCriterion("wwater_cap <=", value, "wwaterCap");
            return (Criteria) this;
        }

        public Criteria andWwaterCapIn(List<Double> values) {
            addCriterion("wwater_cap in", values, "wwaterCap");
            return (Criteria) this;
        }

        public Criteria andWwaterCapNotIn(List<Double> values) {
            addCriterion("wwater_cap not in", values, "wwaterCap");
            return (Criteria) this;
        }

        public Criteria andWwaterCapBetween(Double value1, Double value2) {
            addCriterion("wwater_cap between", value1, value2, "wwaterCap");
            return (Criteria) this;
        }

        public Criteria andWwaterCapNotBetween(Double value1, Double value2) {
            addCriterion("wwater_cap not between", value1, value2, "wwaterCap");
            return (Criteria) this;
        }

        public Criteria andWwaterUnitIsNull() {
            addCriterion("wwater_unit is null");
            return (Criteria) this;
        }

        public Criteria andWwaterUnitIsNotNull() {
            addCriterion("wwater_unit is not null");
            return (Criteria) this;
        }

        public Criteria andWwaterUnitEqualTo(String value) {
            addCriterion("wwater_unit =", value, "wwaterUnit");
            return (Criteria) this;
        }

        public Criteria andWwaterUnitNotEqualTo(String value) {
            addCriterion("wwater_unit <>", value, "wwaterUnit");
            return (Criteria) this;
        }

        public Criteria andWwaterUnitGreaterThan(String value) {
            addCriterion("wwater_unit >", value, "wwaterUnit");
            return (Criteria) this;
        }

        public Criteria andWwaterUnitGreaterThanOrEqualTo(String value) {
            addCriterion("wwater_unit >=", value, "wwaterUnit");
            return (Criteria) this;
        }

        public Criteria andWwaterUnitLessThan(String value) {
            addCriterion("wwater_unit <", value, "wwaterUnit");
            return (Criteria) this;
        }

        public Criteria andWwaterUnitLessThanOrEqualTo(String value) {
            addCriterion("wwater_unit <=", value, "wwaterUnit");
            return (Criteria) this;
        }

        public Criteria andWwaterUnitLike(String value) {
            addCriterion("wwater_unit like", value, "wwaterUnit");
            return (Criteria) this;
        }

        public Criteria andWwaterUnitNotLike(String value) {
            addCriterion("wwater_unit not like", value, "wwaterUnit");
            return (Criteria) this;
        }

        public Criteria andWwaterUnitIn(List<String> values) {
            addCriterion("wwater_unit in", values, "wwaterUnit");
            return (Criteria) this;
        }

        public Criteria andWwaterUnitNotIn(List<String> values) {
            addCriterion("wwater_unit not in", values, "wwaterUnit");
            return (Criteria) this;
        }

        public Criteria andWwaterUnitBetween(String value1, String value2) {
            addCriterion("wwater_unit between", value1, value2, "wwaterUnit");
            return (Criteria) this;
        }

        public Criteria andWwaterUnitNotBetween(String value1, String value2) {
            addCriterion("wwater_unit not between", value1, value2, "wwaterUnit");
            return (Criteria) this;
        }

        public Criteria andWlandfillCapIsNull() {
            addCriterion("wlandfill_cap is null");
            return (Criteria) this;
        }

        public Criteria andWlandfillCapIsNotNull() {
            addCriterion("wlandfill_cap is not null");
            return (Criteria) this;
        }

        public Criteria andWlandfillCapEqualTo(Double value) {
            addCriterion("wlandfill_cap =", value, "wlandfillCap");
            return (Criteria) this;
        }

        public Criteria andWlandfillCapNotEqualTo(Double value) {
            addCriterion("wlandfill_cap <>", value, "wlandfillCap");
            return (Criteria) this;
        }

        public Criteria andWlandfillCapGreaterThan(Double value) {
            addCriterion("wlandfill_cap >", value, "wlandfillCap");
            return (Criteria) this;
        }

        public Criteria andWlandfillCapGreaterThanOrEqualTo(Double value) {
            addCriterion("wlandfill_cap >=", value, "wlandfillCap");
            return (Criteria) this;
        }

        public Criteria andWlandfillCapLessThan(Double value) {
            addCriterion("wlandfill_cap <", value, "wlandfillCap");
            return (Criteria) this;
        }

        public Criteria andWlandfillCapLessThanOrEqualTo(Double value) {
            addCriterion("wlandfill_cap <=", value, "wlandfillCap");
            return (Criteria) this;
        }

        public Criteria andWlandfillCapIn(List<Double> values) {
            addCriterion("wlandfill_cap in", values, "wlandfillCap");
            return (Criteria) this;
        }

        public Criteria andWlandfillCapNotIn(List<Double> values) {
            addCriterion("wlandfill_cap not in", values, "wlandfillCap");
            return (Criteria) this;
        }

        public Criteria andWlandfillCapBetween(Double value1, Double value2) {
            addCriterion("wlandfill_cap between", value1, value2, "wlandfillCap");
            return (Criteria) this;
        }

        public Criteria andWlandfillCapNotBetween(Double value1, Double value2) {
            addCriterion("wlandfill_cap not between", value1, value2, "wlandfillCap");
            return (Criteria) this;
        }

        public Criteria andWlandfillUnitIsNull() {
            addCriterion("wlandfill_unit is null");
            return (Criteria) this;
        }

        public Criteria andWlandfillUnitIsNotNull() {
            addCriterion("wlandfill_unit is not null");
            return (Criteria) this;
        }

        public Criteria andWlandfillUnitEqualTo(String value) {
            addCriterion("wlandfill_unit =", value, "wlandfillUnit");
            return (Criteria) this;
        }

        public Criteria andWlandfillUnitNotEqualTo(String value) {
            addCriterion("wlandfill_unit <>", value, "wlandfillUnit");
            return (Criteria) this;
        }

        public Criteria andWlandfillUnitGreaterThan(String value) {
            addCriterion("wlandfill_unit >", value, "wlandfillUnit");
            return (Criteria) this;
        }

        public Criteria andWlandfillUnitGreaterThanOrEqualTo(String value) {
            addCriterion("wlandfill_unit >=", value, "wlandfillUnit");
            return (Criteria) this;
        }

        public Criteria andWlandfillUnitLessThan(String value) {
            addCriterion("wlandfill_unit <", value, "wlandfillUnit");
            return (Criteria) this;
        }

        public Criteria andWlandfillUnitLessThanOrEqualTo(String value) {
            addCriterion("wlandfill_unit <=", value, "wlandfillUnit");
            return (Criteria) this;
        }

        public Criteria andWlandfillUnitLike(String value) {
            addCriterion("wlandfill_unit like", value, "wlandfillUnit");
            return (Criteria) this;
        }

        public Criteria andWlandfillUnitNotLike(String value) {
            addCriterion("wlandfill_unit not like", value, "wlandfillUnit");
            return (Criteria) this;
        }

        public Criteria andWlandfillUnitIn(List<String> values) {
            addCriterion("wlandfill_unit in", values, "wlandfillUnit");
            return (Criteria) this;
        }

        public Criteria andWlandfillUnitNotIn(List<String> values) {
            addCriterion("wlandfill_unit not in", values, "wlandfillUnit");
            return (Criteria) this;
        }

        public Criteria andWlandfillUnitBetween(String value1, String value2) {
            addCriterion("wlandfill_unit between", value1, value2, "wlandfillUnit");
            return (Criteria) this;
        }

        public Criteria andWlandfillUnitNotBetween(String value1, String value2) {
            addCriterion("wlandfill_unit not between", value1, value2, "wlandfillUnit");
            return (Criteria) this;
        }

        public Criteria andWcompostCapIsNull() {
            addCriterion("wcompost_cap is null");
            return (Criteria) this;
        }

        public Criteria andWcompostCapIsNotNull() {
            addCriterion("wcompost_cap is not null");
            return (Criteria) this;
        }

        public Criteria andWcompostCapEqualTo(Double value) {
            addCriterion("wcompost_cap =", value, "wcompostCap");
            return (Criteria) this;
        }

        public Criteria andWcompostCapNotEqualTo(Double value) {
            addCriterion("wcompost_cap <>", value, "wcompostCap");
            return (Criteria) this;
        }

        public Criteria andWcompostCapGreaterThan(Double value) {
            addCriterion("wcompost_cap >", value, "wcompostCap");
            return (Criteria) this;
        }

        public Criteria andWcompostCapGreaterThanOrEqualTo(Double value) {
            addCriterion("wcompost_cap >=", value, "wcompostCap");
            return (Criteria) this;
        }

        public Criteria andWcompostCapLessThan(Double value) {
            addCriterion("wcompost_cap <", value, "wcompostCap");
            return (Criteria) this;
        }

        public Criteria andWcompostCapLessThanOrEqualTo(Double value) {
            addCriterion("wcompost_cap <=", value, "wcompostCap");
            return (Criteria) this;
        }

        public Criteria andWcompostCapIn(List<Double> values) {
            addCriterion("wcompost_cap in", values, "wcompostCap");
            return (Criteria) this;
        }

        public Criteria andWcompostCapNotIn(List<Double> values) {
            addCriterion("wcompost_cap not in", values, "wcompostCap");
            return (Criteria) this;
        }

        public Criteria andWcompostCapBetween(Double value1, Double value2) {
            addCriterion("wcompost_cap between", value1, value2, "wcompostCap");
            return (Criteria) this;
        }

        public Criteria andWcompostCapNotBetween(Double value1, Double value2) {
            addCriterion("wcompost_cap not between", value1, value2, "wcompostCap");
            return (Criteria) this;
        }

        public Criteria andWcompostUnitIsNull() {
            addCriterion("wcompost_unit is null");
            return (Criteria) this;
        }

        public Criteria andWcompostUnitIsNotNull() {
            addCriterion("wcompost_unit is not null");
            return (Criteria) this;
        }

        public Criteria andWcompostUnitEqualTo(String value) {
            addCriterion("wcompost_unit =", value, "wcompostUnit");
            return (Criteria) this;
        }

        public Criteria andWcompostUnitNotEqualTo(String value) {
            addCriterion("wcompost_unit <>", value, "wcompostUnit");
            return (Criteria) this;
        }

        public Criteria andWcompostUnitGreaterThan(String value) {
            addCriterion("wcompost_unit >", value, "wcompostUnit");
            return (Criteria) this;
        }

        public Criteria andWcompostUnitGreaterThanOrEqualTo(String value) {
            addCriterion("wcompost_unit >=", value, "wcompostUnit");
            return (Criteria) this;
        }

        public Criteria andWcompostUnitLessThan(String value) {
            addCriterion("wcompost_unit <", value, "wcompostUnit");
            return (Criteria) this;
        }

        public Criteria andWcompostUnitLessThanOrEqualTo(String value) {
            addCriterion("wcompost_unit <=", value, "wcompostUnit");
            return (Criteria) this;
        }

        public Criteria andWcompostUnitLike(String value) {
            addCriterion("wcompost_unit like", value, "wcompostUnit");
            return (Criteria) this;
        }

        public Criteria andWcompostUnitNotLike(String value) {
            addCriterion("wcompost_unit not like", value, "wcompostUnit");
            return (Criteria) this;
        }

        public Criteria andWcompostUnitIn(List<String> values) {
            addCriterion("wcompost_unit in", values, "wcompostUnit");
            return (Criteria) this;
        }

        public Criteria andWcompostUnitNotIn(List<String> values) {
            addCriterion("wcompost_unit not in", values, "wcompostUnit");
            return (Criteria) this;
        }

        public Criteria andWcompostUnitBetween(String value1, String value2) {
            addCriterion("wcompost_unit between", value1, value2, "wcompostUnit");
            return (Criteria) this;
        }

        public Criteria andWcompostUnitNotBetween(String value1, String value2) {
            addCriterion("wcompost_unit not between", value1, value2, "wcompostUnit");
            return (Criteria) this;
        }

        public Criteria andWfireCapIsNull() {
            addCriterion("wfire_cap is null");
            return (Criteria) this;
        }

        public Criteria andWfireCapIsNotNull() {
            addCriterion("wfire_cap is not null");
            return (Criteria) this;
        }

        public Criteria andWfireCapEqualTo(Double value) {
            addCriterion("wfire_cap =", value, "wfireCap");
            return (Criteria) this;
        }

        public Criteria andWfireCapNotEqualTo(Double value) {
            addCriterion("wfire_cap <>", value, "wfireCap");
            return (Criteria) this;
        }

        public Criteria andWfireCapGreaterThan(Double value) {
            addCriterion("wfire_cap >", value, "wfireCap");
            return (Criteria) this;
        }

        public Criteria andWfireCapGreaterThanOrEqualTo(Double value) {
            addCriterion("wfire_cap >=", value, "wfireCap");
            return (Criteria) this;
        }

        public Criteria andWfireCapLessThan(Double value) {
            addCriterion("wfire_cap <", value, "wfireCap");
            return (Criteria) this;
        }

        public Criteria andWfireCapLessThanOrEqualTo(Double value) {
            addCriterion("wfire_cap <=", value, "wfireCap");
            return (Criteria) this;
        }

        public Criteria andWfireCapIn(List<Double> values) {
            addCriterion("wfire_cap in", values, "wfireCap");
            return (Criteria) this;
        }

        public Criteria andWfireCapNotIn(List<Double> values) {
            addCriterion("wfire_cap not in", values, "wfireCap");
            return (Criteria) this;
        }

        public Criteria andWfireCapBetween(Double value1, Double value2) {
            addCriterion("wfire_cap between", value1, value2, "wfireCap");
            return (Criteria) this;
        }

        public Criteria andWfireCapNotBetween(Double value1, Double value2) {
            addCriterion("wfire_cap not between", value1, value2, "wfireCap");
            return (Criteria) this;
        }

        public Criteria andWfireUnitIsNull() {
            addCriterion("wfire_unit is null");
            return (Criteria) this;
        }

        public Criteria andWfireUnitIsNotNull() {
            addCriterion("wfire_unit is not null");
            return (Criteria) this;
        }

        public Criteria andWfireUnitEqualTo(String value) {
            addCriterion("wfire_unit =", value, "wfireUnit");
            return (Criteria) this;
        }

        public Criteria andWfireUnitNotEqualTo(String value) {
            addCriterion("wfire_unit <>", value, "wfireUnit");
            return (Criteria) this;
        }

        public Criteria andWfireUnitGreaterThan(String value) {
            addCriterion("wfire_unit >", value, "wfireUnit");
            return (Criteria) this;
        }

        public Criteria andWfireUnitGreaterThanOrEqualTo(String value) {
            addCriterion("wfire_unit >=", value, "wfireUnit");
            return (Criteria) this;
        }

        public Criteria andWfireUnitLessThan(String value) {
            addCriterion("wfire_unit <", value, "wfireUnit");
            return (Criteria) this;
        }

        public Criteria andWfireUnitLessThanOrEqualTo(String value) {
            addCriterion("wfire_unit <=", value, "wfireUnit");
            return (Criteria) this;
        }

        public Criteria andWfireUnitLike(String value) {
            addCriterion("wfire_unit like", value, "wfireUnit");
            return (Criteria) this;
        }

        public Criteria andWfireUnitNotLike(String value) {
            addCriterion("wfire_unit not like", value, "wfireUnit");
            return (Criteria) this;
        }

        public Criteria andWfireUnitIn(List<String> values) {
            addCriterion("wfire_unit in", values, "wfireUnit");
            return (Criteria) this;
        }

        public Criteria andWfireUnitNotIn(List<String> values) {
            addCriterion("wfire_unit not in", values, "wfireUnit");
            return (Criteria) this;
        }

        public Criteria andWfireUnitBetween(String value1, String value2) {
            addCriterion("wfire_unit between", value1, value2, "wfireUnit");
            return (Criteria) this;
        }

        public Criteria andWfireUnitNotBetween(String value1, String value2) {
            addCriterion("wfire_unit not between", value1, value2, "wfireUnit");
            return (Criteria) this;
        }

        public Criteria andNh3FactorIsNull() {
            addCriterion("nh3_factor is null");
            return (Criteria) this;
        }

        public Criteria andNh3FactorIsNotNull() {
            addCriterion("nh3_factor is not null");
            return (Criteria) this;
        }

        public Criteria andNh3FactorEqualTo(Double value) {
            addCriterion("nh3_factor =", value, "nh3Factor");
            return (Criteria) this;
        }

        public Criteria andNh3FactorNotEqualTo(Double value) {
            addCriterion("nh3_factor <>", value, "nh3Factor");
            return (Criteria) this;
        }

        public Criteria andNh3FactorGreaterThan(Double value) {
            addCriterion("nh3_factor >", value, "nh3Factor");
            return (Criteria) this;
        }

        public Criteria andNh3FactorGreaterThanOrEqualTo(Double value) {
            addCriterion("nh3_factor >=", value, "nh3Factor");
            return (Criteria) this;
        }

        public Criteria andNh3FactorLessThan(Double value) {
            addCriterion("nh3_factor <", value, "nh3Factor");
            return (Criteria) this;
        }

        public Criteria andNh3FactorLessThanOrEqualTo(Double value) {
            addCriterion("nh3_factor <=", value, "nh3Factor");
            return (Criteria) this;
        }

        public Criteria andNh3FactorIn(List<Double> values) {
            addCriterion("nh3_factor in", values, "nh3Factor");
            return (Criteria) this;
        }

        public Criteria andNh3FactorNotIn(List<Double> values) {
            addCriterion("nh3_factor not in", values, "nh3Factor");
            return (Criteria) this;
        }

        public Criteria andNh3FactorBetween(Double value1, Double value2) {
            addCriterion("nh3_factor between", value1, value2, "nh3Factor");
            return (Criteria) this;
        }

        public Criteria andNh3FactorNotBetween(Double value1, Double value2) {
            addCriterion("nh3_factor not between", value1, value2, "nh3Factor");
            return (Criteria) this;
        }

        public Criteria andNh3FunitIsNull() {
            addCriterion("nh3_funit is null");
            return (Criteria) this;
        }

        public Criteria andNh3FunitIsNotNull() {
            addCriterion("nh3_funit is not null");
            return (Criteria) this;
        }

        public Criteria andNh3FunitEqualTo(String value) {
            addCriterion("nh3_funit =", value, "nh3Funit");
            return (Criteria) this;
        }

        public Criteria andNh3FunitNotEqualTo(String value) {
            addCriterion("nh3_funit <>", value, "nh3Funit");
            return (Criteria) this;
        }

        public Criteria andNh3FunitGreaterThan(String value) {
            addCriterion("nh3_funit >", value, "nh3Funit");
            return (Criteria) this;
        }

        public Criteria andNh3FunitGreaterThanOrEqualTo(String value) {
            addCriterion("nh3_funit >=", value, "nh3Funit");
            return (Criteria) this;
        }

        public Criteria andNh3FunitLessThan(String value) {
            addCriterion("nh3_funit <", value, "nh3Funit");
            return (Criteria) this;
        }

        public Criteria andNh3FunitLessThanOrEqualTo(String value) {
            addCriterion("nh3_funit <=", value, "nh3Funit");
            return (Criteria) this;
        }

        public Criteria andNh3FunitLike(String value) {
            addCriterion("nh3_funit like", value, "nh3Funit");
            return (Criteria) this;
        }

        public Criteria andNh3FunitNotLike(String value) {
            addCriterion("nh3_funit not like", value, "nh3Funit");
            return (Criteria) this;
        }

        public Criteria andNh3FunitIn(List<String> values) {
            addCriterion("nh3_funit in", values, "nh3Funit");
            return (Criteria) this;
        }

        public Criteria andNh3FunitNotIn(List<String> values) {
            addCriterion("nh3_funit not in", values, "nh3Funit");
            return (Criteria) this;
        }

        public Criteria andNh3FunitBetween(String value1, String value2) {
            addCriterion("nh3_funit between", value1, value2, "nh3Funit");
            return (Criteria) this;
        }

        public Criteria andNh3FunitNotBetween(String value1, String value2) {
            addCriterion("nh3_funit not between", value1, value2, "nh3Funit");
            return (Criteria) this;
        }

        public Criteria andVocFactorIsNull() {
            addCriterion("voc_factor is null");
            return (Criteria) this;
        }

        public Criteria andVocFactorIsNotNull() {
            addCriterion("voc_factor is not null");
            return (Criteria) this;
        }

        public Criteria andVocFactorEqualTo(Double value) {
            addCriterion("voc_factor =", value, "vocFactor");
            return (Criteria) this;
        }

        public Criteria andVocFactorNotEqualTo(Double value) {
            addCriterion("voc_factor <>", value, "vocFactor");
            return (Criteria) this;
        }

        public Criteria andVocFactorGreaterThan(Double value) {
            addCriterion("voc_factor >", value, "vocFactor");
            return (Criteria) this;
        }

        public Criteria andVocFactorGreaterThanOrEqualTo(Double value) {
            addCriterion("voc_factor >=", value, "vocFactor");
            return (Criteria) this;
        }

        public Criteria andVocFactorLessThan(Double value) {
            addCriterion("voc_factor <", value, "vocFactor");
            return (Criteria) this;
        }

        public Criteria andVocFactorLessThanOrEqualTo(Double value) {
            addCriterion("voc_factor <=", value, "vocFactor");
            return (Criteria) this;
        }

        public Criteria andVocFactorIn(List<Double> values) {
            addCriterion("voc_factor in", values, "vocFactor");
            return (Criteria) this;
        }

        public Criteria andVocFactorNotIn(List<Double> values) {
            addCriterion("voc_factor not in", values, "vocFactor");
            return (Criteria) this;
        }

        public Criteria andVocFactorBetween(Double value1, Double value2) {
            addCriterion("voc_factor between", value1, value2, "vocFactor");
            return (Criteria) this;
        }

        public Criteria andVocFactorNotBetween(Double value1, Double value2) {
            addCriterion("voc_factor not between", value1, value2, "vocFactor");
            return (Criteria) this;
        }

        public Criteria andVocFunitIsNull() {
            addCriterion("voc_funit is null");
            return (Criteria) this;
        }

        public Criteria andVocFunitIsNotNull() {
            addCriterion("voc_funit is not null");
            return (Criteria) this;
        }

        public Criteria andVocFunitEqualTo(String value) {
            addCriterion("voc_funit =", value, "vocFunit");
            return (Criteria) this;
        }

        public Criteria andVocFunitNotEqualTo(String value) {
            addCriterion("voc_funit <>", value, "vocFunit");
            return (Criteria) this;
        }

        public Criteria andVocFunitGreaterThan(String value) {
            addCriterion("voc_funit >", value, "vocFunit");
            return (Criteria) this;
        }

        public Criteria andVocFunitGreaterThanOrEqualTo(String value) {
            addCriterion("voc_funit >=", value, "vocFunit");
            return (Criteria) this;
        }

        public Criteria andVocFunitLessThan(String value) {
            addCriterion("voc_funit <", value, "vocFunit");
            return (Criteria) this;
        }

        public Criteria andVocFunitLessThanOrEqualTo(String value) {
            addCriterion("voc_funit <=", value, "vocFunit");
            return (Criteria) this;
        }

        public Criteria andVocFunitLike(String value) {
            addCriterion("voc_funit like", value, "vocFunit");
            return (Criteria) this;
        }

        public Criteria andVocFunitNotLike(String value) {
            addCriterion("voc_funit not like", value, "vocFunit");
            return (Criteria) this;
        }

        public Criteria andVocFunitIn(List<String> values) {
            addCriterion("voc_funit in", values, "vocFunit");
            return (Criteria) this;
        }

        public Criteria andVocFunitNotIn(List<String> values) {
            addCriterion("voc_funit not in", values, "vocFunit");
            return (Criteria) this;
        }

        public Criteria andVocFunitBetween(String value1, String value2) {
            addCriterion("voc_funit between", value1, value2, "vocFunit");
            return (Criteria) this;
        }

        public Criteria andVocFunitNotBetween(String value1, String value2) {
            addCriterion("voc_funit not between", value1, value2, "vocFunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionIsNull() {
            addCriterion("nh3_emission is null");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionIsNotNull() {
            addCriterion("nh3_emission is not null");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionEqualTo(Double value) {
            addCriterion("nh3_emission =", value, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionNotEqualTo(Double value) {
            addCriterion("nh3_emission <>", value, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionGreaterThan(Double value) {
            addCriterion("nh3_emission >", value, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("nh3_emission >=", value, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionLessThan(Double value) {
            addCriterion("nh3_emission <", value, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionLessThanOrEqualTo(Double value) {
            addCriterion("nh3_emission <=", value, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionIn(List<Double> values) {
            addCriterion("nh3_emission in", values, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionNotIn(List<Double> values) {
            addCriterion("nh3_emission not in", values, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionBetween(Double value1, Double value2) {
            addCriterion("nh3_emission between", value1, value2, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3EmissionNotBetween(Double value1, Double value2) {
            addCriterion("nh3_emission not between", value1, value2, "nh3Emission");
            return (Criteria) this;
        }

        public Criteria andNh3UnitIsNull() {
            addCriterion("nh3_unit is null");
            return (Criteria) this;
        }

        public Criteria andNh3UnitIsNotNull() {
            addCriterion("nh3_unit is not null");
            return (Criteria) this;
        }

        public Criteria andNh3UnitEqualTo(String value) {
            addCriterion("nh3_unit =", value, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitNotEqualTo(String value) {
            addCriterion("nh3_unit <>", value, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitGreaterThan(String value) {
            addCriterion("nh3_unit >", value, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitGreaterThanOrEqualTo(String value) {
            addCriterion("nh3_unit >=", value, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitLessThan(String value) {
            addCriterion("nh3_unit <", value, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitLessThanOrEqualTo(String value) {
            addCriterion("nh3_unit <=", value, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitLike(String value) {
            addCriterion("nh3_unit like", value, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitNotLike(String value) {
            addCriterion("nh3_unit not like", value, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitIn(List<String> values) {
            addCriterion("nh3_unit in", values, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitNotIn(List<String> values) {
            addCriterion("nh3_unit not in", values, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitBetween(String value1, String value2) {
            addCriterion("nh3_unit between", value1, value2, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andNh3UnitNotBetween(String value1, String value2) {
            addCriterion("nh3_unit not between", value1, value2, "nh3Unit");
            return (Criteria) this;
        }

        public Criteria andVocEmissonIsNull() {
            addCriterion("voc_emisson is null");
            return (Criteria) this;
        }

        public Criteria andVocEmissonIsNotNull() {
            addCriterion("voc_emisson is not null");
            return (Criteria) this;
        }

        public Criteria andVocEmissonEqualTo(Double value) {
            addCriterion("voc_emisson =", value, "vocEmisson");
            return (Criteria) this;
        }

        public Criteria andVocEmissonNotEqualTo(Double value) {
            addCriterion("voc_emisson <>", value, "vocEmisson");
            return (Criteria) this;
        }

        public Criteria andVocEmissonGreaterThan(Double value) {
            addCriterion("voc_emisson >", value, "vocEmisson");
            return (Criteria) this;
        }

        public Criteria andVocEmissonGreaterThanOrEqualTo(Double value) {
            addCriterion("voc_emisson >=", value, "vocEmisson");
            return (Criteria) this;
        }

        public Criteria andVocEmissonLessThan(Double value) {
            addCriterion("voc_emisson <", value, "vocEmisson");
            return (Criteria) this;
        }

        public Criteria andVocEmissonLessThanOrEqualTo(Double value) {
            addCriterion("voc_emisson <=", value, "vocEmisson");
            return (Criteria) this;
        }

        public Criteria andVocEmissonIn(List<Double> values) {
            addCriterion("voc_emisson in", values, "vocEmisson");
            return (Criteria) this;
        }

        public Criteria andVocEmissonNotIn(List<Double> values) {
            addCriterion("voc_emisson not in", values, "vocEmisson");
            return (Criteria) this;
        }

        public Criteria andVocEmissonBetween(Double value1, Double value2) {
            addCriterion("voc_emisson between", value1, value2, "vocEmisson");
            return (Criteria) this;
        }

        public Criteria andVocEmissonNotBetween(Double value1, Double value2) {
            addCriterion("voc_emisson not between", value1, value2, "vocEmisson");
            return (Criteria) this;
        }

        public Criteria andVocUnitIsNull() {
            addCriterion("voc_unit is null");
            return (Criteria) this;
        }

        public Criteria andVocUnitIsNotNull() {
            addCriterion("voc_unit is not null");
            return (Criteria) this;
        }

        public Criteria andVocUnitEqualTo(String value) {
            addCriterion("voc_unit =", value, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitNotEqualTo(String value) {
            addCriterion("voc_unit <>", value, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitGreaterThan(String value) {
            addCriterion("voc_unit >", value, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitGreaterThanOrEqualTo(String value) {
            addCriterion("voc_unit >=", value, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitLessThan(String value) {
            addCriterion("voc_unit <", value, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitLessThanOrEqualTo(String value) {
            addCriterion("voc_unit <=", value, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitLike(String value) {
            addCriterion("voc_unit like", value, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitNotLike(String value) {
            addCriterion("voc_unit not like", value, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitIn(List<String> values) {
            addCriterion("voc_unit in", values, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitNotIn(List<String> values) {
            addCriterion("voc_unit not in", values, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitBetween(String value1, String value2) {
            addCriterion("voc_unit between", value1, value2, "vocUnit");
            return (Criteria) this;
        }

        public Criteria andVocUnitNotBetween(String value1, String value2) {
            addCriterion("voc_unit not between", value1, value2, "vocUnit");
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

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
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