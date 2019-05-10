package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class SolventEquTempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SolventEquTempExample() {
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

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Byte value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Byte value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Byte value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Byte value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Byte value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Byte value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Byte> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Byte> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Byte value1, Byte value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Byte value1, Byte value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andSolventIdIsNull() {
            addCriterion("solvent_id is null");
            return (Criteria) this;
        }

        public Criteria andSolventIdIsNotNull() {
            addCriterion("solvent_id is not null");
            return (Criteria) this;
        }

        public Criteria andSolventIdEqualTo(Integer value) {
            addCriterion("solvent_id =", value, "solventId");
            return (Criteria) this;
        }

        public Criteria andSolventIdNotEqualTo(Integer value) {
            addCriterion("solvent_id <>", value, "solventId");
            return (Criteria) this;
        }

        public Criteria andSolventIdGreaterThan(Integer value) {
            addCriterion("solvent_id >", value, "solventId");
            return (Criteria) this;
        }

        public Criteria andSolventIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("solvent_id >=", value, "solventId");
            return (Criteria) this;
        }

        public Criteria andSolventIdLessThan(Integer value) {
            addCriterion("solvent_id <", value, "solventId");
            return (Criteria) this;
        }

        public Criteria andSolventIdLessThanOrEqualTo(Integer value) {
            addCriterion("solvent_id <=", value, "solventId");
            return (Criteria) this;
        }

        public Criteria andSolventIdIn(List<Integer> values) {
            addCriterion("solvent_id in", values, "solventId");
            return (Criteria) this;
        }

        public Criteria andSolventIdNotIn(List<Integer> values) {
            addCriterion("solvent_id not in", values, "solventId");
            return (Criteria) this;
        }

        public Criteria andSolventIdBetween(Integer value1, Integer value2) {
            addCriterion("solvent_id between", value1, value2, "solventId");
            return (Criteria) this;
        }

        public Criteria andSolventIdNotBetween(Integer value1, Integer value2) {
            addCriterion("solvent_id not between", value1, value2, "solventId");
            return (Criteria) this;
        }

        public Criteria andGasequIdIsNull() {
            addCriterion("gasequ_id is null");
            return (Criteria) this;
        }

        public Criteria andGasequIdIsNotNull() {
            addCriterion("gasequ_id is not null");
            return (Criteria) this;
        }

        public Criteria andGasequIdEqualTo(Integer value) {
            addCriterion("gasequ_id =", value, "gasequId");
            return (Criteria) this;
        }

        public Criteria andGasequIdNotEqualTo(Integer value) {
            addCriterion("gasequ_id <>", value, "gasequId");
            return (Criteria) this;
        }

        public Criteria andGasequIdGreaterThan(Integer value) {
            addCriterion("gasequ_id >", value, "gasequId");
            return (Criteria) this;
        }

        public Criteria andGasequIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gasequ_id >=", value, "gasequId");
            return (Criteria) this;
        }

        public Criteria andGasequIdLessThan(Integer value) {
            addCriterion("gasequ_id <", value, "gasequId");
            return (Criteria) this;
        }

        public Criteria andGasequIdLessThanOrEqualTo(Integer value) {
            addCriterion("gasequ_id <=", value, "gasequId");
            return (Criteria) this;
        }

        public Criteria andGasequIdIn(List<Integer> values) {
            addCriterion("gasequ_id in", values, "gasequId");
            return (Criteria) this;
        }

        public Criteria andGasequIdNotIn(List<Integer> values) {
            addCriterion("gasequ_id not in", values, "gasequId");
            return (Criteria) this;
        }

        public Criteria andGasequIdBetween(Integer value1, Integer value2) {
            addCriterion("gasequ_id between", value1, value2, "gasequId");
            return (Criteria) this;
        }

        public Criteria andGasequIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gasequ_id not between", value1, value2, "gasequId");
            return (Criteria) this;
        }

        public Criteria andGasequNameIsNull() {
            addCriterion("gasequ_name is null");
            return (Criteria) this;
        }

        public Criteria andGasequNameIsNotNull() {
            addCriterion("gasequ_name is not null");
            return (Criteria) this;
        }

        public Criteria andGasequNameEqualTo(String value) {
            addCriterion("gasequ_name =", value, "gasequName");
            return (Criteria) this;
        }

        public Criteria andGasequNameNotEqualTo(String value) {
            addCriterion("gasequ_name <>", value, "gasequName");
            return (Criteria) this;
        }

        public Criteria andGasequNameGreaterThan(String value) {
            addCriterion("gasequ_name >", value, "gasequName");
            return (Criteria) this;
        }

        public Criteria andGasequNameGreaterThanOrEqualTo(String value) {
            addCriterion("gasequ_name >=", value, "gasequName");
            return (Criteria) this;
        }

        public Criteria andGasequNameLessThan(String value) {
            addCriterion("gasequ_name <", value, "gasequName");
            return (Criteria) this;
        }

        public Criteria andGasequNameLessThanOrEqualTo(String value) {
            addCriterion("gasequ_name <=", value, "gasequName");
            return (Criteria) this;
        }

        public Criteria andGasequNameLike(String value) {
            addCriterion("gasequ_name like", value, "gasequName");
            return (Criteria) this;
        }

        public Criteria andGasequNameNotLike(String value) {
            addCriterion("gasequ_name not like", value, "gasequName");
            return (Criteria) this;
        }

        public Criteria andGasequNameIn(List<String> values) {
            addCriterion("gasequ_name in", values, "gasequName");
            return (Criteria) this;
        }

        public Criteria andGasequNameNotIn(List<String> values) {
            addCriterion("gasequ_name not in", values, "gasequName");
            return (Criteria) this;
        }

        public Criteria andGasequNameBetween(String value1, String value2) {
            addCriterion("gasequ_name between", value1, value2, "gasequName");
            return (Criteria) this;
        }

        public Criteria andGasequNameNotBetween(String value1, String value2) {
            addCriterion("gasequ_name not between", value1, value2, "gasequName");
            return (Criteria) this;
        }

        public Criteria andGasequFabriIsNull() {
            addCriterion("gasequ_fabri is null");
            return (Criteria) this;
        }

        public Criteria andGasequFabriIsNotNull() {
            addCriterion("gasequ_fabri is not null");
            return (Criteria) this;
        }

        public Criteria andGasequFabriEqualTo(String value) {
            addCriterion("gasequ_fabri =", value, "gasequFabri");
            return (Criteria) this;
        }

        public Criteria andGasequFabriNotEqualTo(String value) {
            addCriterion("gasequ_fabri <>", value, "gasequFabri");
            return (Criteria) this;
        }

        public Criteria andGasequFabriGreaterThan(String value) {
            addCriterion("gasequ_fabri >", value, "gasequFabri");
            return (Criteria) this;
        }

        public Criteria andGasequFabriGreaterThanOrEqualTo(String value) {
            addCriterion("gasequ_fabri >=", value, "gasequFabri");
            return (Criteria) this;
        }

        public Criteria andGasequFabriLessThan(String value) {
            addCriterion("gasequ_fabri <", value, "gasequFabri");
            return (Criteria) this;
        }

        public Criteria andGasequFabriLessThanOrEqualTo(String value) {
            addCriterion("gasequ_fabri <=", value, "gasequFabri");
            return (Criteria) this;
        }

        public Criteria andGasequFabriLike(String value) {
            addCriterion("gasequ_fabri like", value, "gasequFabri");
            return (Criteria) this;
        }

        public Criteria andGasequFabriNotLike(String value) {
            addCriterion("gasequ_fabri not like", value, "gasequFabri");
            return (Criteria) this;
        }

        public Criteria andGasequFabriIn(List<String> values) {
            addCriterion("gasequ_fabri in", values, "gasequFabri");
            return (Criteria) this;
        }

        public Criteria andGasequFabriNotIn(List<String> values) {
            addCriterion("gasequ_fabri not in", values, "gasequFabri");
            return (Criteria) this;
        }

        public Criteria andGasequFabriBetween(String value1, String value2) {
            addCriterion("gasequ_fabri between", value1, value2, "gasequFabri");
            return (Criteria) this;
        }

        public Criteria andGasequFabriNotBetween(String value1, String value2) {
            addCriterion("gasequ_fabri not between", value1, value2, "gasequFabri");
            return (Criteria) this;
        }

        public Criteria andRuntimeIsNull() {
            addCriterion("runtime is null");
            return (Criteria) this;
        }

        public Criteria andRuntimeIsNotNull() {
            addCriterion("runtime is not null");
            return (Criteria) this;
        }

        public Criteria andRuntimeEqualTo(Integer value) {
            addCriterion("runtime =", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeNotEqualTo(Integer value) {
            addCriterion("runtime <>", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeGreaterThan(Integer value) {
            addCriterion("runtime >", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("runtime >=", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeLessThan(Integer value) {
            addCriterion("runtime <", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeLessThanOrEqualTo(Integer value) {
            addCriterion("runtime <=", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeIn(List<Integer> values) {
            addCriterion("runtime in", values, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeNotIn(List<Integer> values) {
            addCriterion("runtime not in", values, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeBetween(Integer value1, Integer value2) {
            addCriterion("runtime between", value1, value2, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeNotBetween(Integer value1, Integer value2) {
            addCriterion("runtime not between", value1, value2, "runtime");
            return (Criteria) this;
        }

        public Criteria andMaterialName1IsNull() {
            addCriterion("material_name1 is null");
            return (Criteria) this;
        }

        public Criteria andMaterialName1IsNotNull() {
            addCriterion("material_name1 is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialName1EqualTo(String value) {
            addCriterion("material_name1 =", value, "materialName1");
            return (Criteria) this;
        }

        public Criteria andMaterialName1NotEqualTo(String value) {
            addCriterion("material_name1 <>", value, "materialName1");
            return (Criteria) this;
        }

        public Criteria andMaterialName1GreaterThan(String value) {
            addCriterion("material_name1 >", value, "materialName1");
            return (Criteria) this;
        }

        public Criteria andMaterialName1GreaterThanOrEqualTo(String value) {
            addCriterion("material_name1 >=", value, "materialName1");
            return (Criteria) this;
        }

        public Criteria andMaterialName1LessThan(String value) {
            addCriterion("material_name1 <", value, "materialName1");
            return (Criteria) this;
        }

        public Criteria andMaterialName1LessThanOrEqualTo(String value) {
            addCriterion("material_name1 <=", value, "materialName1");
            return (Criteria) this;
        }

        public Criteria andMaterialName1Like(String value) {
            addCriterion("material_name1 like", value, "materialName1");
            return (Criteria) this;
        }

        public Criteria andMaterialName1NotLike(String value) {
            addCriterion("material_name1 not like", value, "materialName1");
            return (Criteria) this;
        }

        public Criteria andMaterialName1In(List<String> values) {
            addCriterion("material_name1 in", values, "materialName1");
            return (Criteria) this;
        }

        public Criteria andMaterialName1NotIn(List<String> values) {
            addCriterion("material_name1 not in", values, "materialName1");
            return (Criteria) this;
        }

        public Criteria andMaterialName1Between(String value1, String value2) {
            addCriterion("material_name1 between", value1, value2, "materialName1");
            return (Criteria) this;
        }

        public Criteria andMaterialName1NotBetween(String value1, String value2) {
            addCriterion("material_name1 not between", value1, value2, "materialName1");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage1IsNull() {
            addCriterion("material_usage1 is null");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage1IsNotNull() {
            addCriterion("material_usage1 is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage1EqualTo(Double value) {
            addCriterion("material_usage1 =", value, "materialUsage1");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage1NotEqualTo(Double value) {
            addCriterion("material_usage1 <>", value, "materialUsage1");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage1GreaterThan(Double value) {
            addCriterion("material_usage1 >", value, "materialUsage1");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage1GreaterThanOrEqualTo(Double value) {
            addCriterion("material_usage1 >=", value, "materialUsage1");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage1LessThan(Double value) {
            addCriterion("material_usage1 <", value, "materialUsage1");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage1LessThanOrEqualTo(Double value) {
            addCriterion("material_usage1 <=", value, "materialUsage1");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage1In(List<Double> values) {
            addCriterion("material_usage1 in", values, "materialUsage1");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage1NotIn(List<Double> values) {
            addCriterion("material_usage1 not in", values, "materialUsage1");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage1Between(Double value1, Double value2) {
            addCriterion("material_usage1 between", value1, value2, "materialUsage1");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage1NotBetween(Double value1, Double value2) {
            addCriterion("material_usage1 not between", value1, value2, "materialUsage1");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit1IsNull() {
            addCriterion("material_unit1 is null");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit1IsNotNull() {
            addCriterion("material_unit1 is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit1EqualTo(String value) {
            addCriterion("material_unit1 =", value, "materialUnit1");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit1NotEqualTo(String value) {
            addCriterion("material_unit1 <>", value, "materialUnit1");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit1GreaterThan(String value) {
            addCriterion("material_unit1 >", value, "materialUnit1");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit1GreaterThanOrEqualTo(String value) {
            addCriterion("material_unit1 >=", value, "materialUnit1");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit1LessThan(String value) {
            addCriterion("material_unit1 <", value, "materialUnit1");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit1LessThanOrEqualTo(String value) {
            addCriterion("material_unit1 <=", value, "materialUnit1");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit1Like(String value) {
            addCriterion("material_unit1 like", value, "materialUnit1");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit1NotLike(String value) {
            addCriterion("material_unit1 not like", value, "materialUnit1");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit1In(List<String> values) {
            addCriterion("material_unit1 in", values, "materialUnit1");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit1NotIn(List<String> values) {
            addCriterion("material_unit1 not in", values, "materialUnit1");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit1Between(String value1, String value2) {
            addCriterion("material_unit1 between", value1, value2, "materialUnit1");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit1NotBetween(String value1, String value2) {
            addCriterion("material_unit1 not between", value1, value2, "materialUnit1");
            return (Criteria) this;
        }

        public Criteria andMaterialName2IsNull() {
            addCriterion("material_name2 is null");
            return (Criteria) this;
        }

        public Criteria andMaterialName2IsNotNull() {
            addCriterion("material_name2 is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialName2EqualTo(String value) {
            addCriterion("material_name2 =", value, "materialName2");
            return (Criteria) this;
        }

        public Criteria andMaterialName2NotEqualTo(String value) {
            addCriterion("material_name2 <>", value, "materialName2");
            return (Criteria) this;
        }

        public Criteria andMaterialName2GreaterThan(String value) {
            addCriterion("material_name2 >", value, "materialName2");
            return (Criteria) this;
        }

        public Criteria andMaterialName2GreaterThanOrEqualTo(String value) {
            addCriterion("material_name2 >=", value, "materialName2");
            return (Criteria) this;
        }

        public Criteria andMaterialName2LessThan(String value) {
            addCriterion("material_name2 <", value, "materialName2");
            return (Criteria) this;
        }

        public Criteria andMaterialName2LessThanOrEqualTo(String value) {
            addCriterion("material_name2 <=", value, "materialName2");
            return (Criteria) this;
        }

        public Criteria andMaterialName2Like(String value) {
            addCriterion("material_name2 like", value, "materialName2");
            return (Criteria) this;
        }

        public Criteria andMaterialName2NotLike(String value) {
            addCriterion("material_name2 not like", value, "materialName2");
            return (Criteria) this;
        }

        public Criteria andMaterialName2In(List<String> values) {
            addCriterion("material_name2 in", values, "materialName2");
            return (Criteria) this;
        }

        public Criteria andMaterialName2NotIn(List<String> values) {
            addCriterion("material_name2 not in", values, "materialName2");
            return (Criteria) this;
        }

        public Criteria andMaterialName2Between(String value1, String value2) {
            addCriterion("material_name2 between", value1, value2, "materialName2");
            return (Criteria) this;
        }

        public Criteria andMaterialName2NotBetween(String value1, String value2) {
            addCriterion("material_name2 not between", value1, value2, "materialName2");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage2IsNull() {
            addCriterion("material_usage2 is null");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage2IsNotNull() {
            addCriterion("material_usage2 is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage2EqualTo(Double value) {
            addCriterion("material_usage2 =", value, "materialUsage2");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage2NotEqualTo(Double value) {
            addCriterion("material_usage2 <>", value, "materialUsage2");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage2GreaterThan(Double value) {
            addCriterion("material_usage2 >", value, "materialUsage2");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage2GreaterThanOrEqualTo(Double value) {
            addCriterion("material_usage2 >=", value, "materialUsage2");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage2LessThan(Double value) {
            addCriterion("material_usage2 <", value, "materialUsage2");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage2LessThanOrEqualTo(Double value) {
            addCriterion("material_usage2 <=", value, "materialUsage2");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage2In(List<Double> values) {
            addCriterion("material_usage2 in", values, "materialUsage2");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage2NotIn(List<Double> values) {
            addCriterion("material_usage2 not in", values, "materialUsage2");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage2Between(Double value1, Double value2) {
            addCriterion("material_usage2 between", value1, value2, "materialUsage2");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage2NotBetween(Double value1, Double value2) {
            addCriterion("material_usage2 not between", value1, value2, "materialUsage2");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit2IsNull() {
            addCriterion("material_unit2 is null");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit2IsNotNull() {
            addCriterion("material_unit2 is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit2EqualTo(String value) {
            addCriterion("material_unit2 =", value, "materialUnit2");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit2NotEqualTo(String value) {
            addCriterion("material_unit2 <>", value, "materialUnit2");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit2GreaterThan(String value) {
            addCriterion("material_unit2 >", value, "materialUnit2");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit2GreaterThanOrEqualTo(String value) {
            addCriterion("material_unit2 >=", value, "materialUnit2");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit2LessThan(String value) {
            addCriterion("material_unit2 <", value, "materialUnit2");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit2LessThanOrEqualTo(String value) {
            addCriterion("material_unit2 <=", value, "materialUnit2");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit2Like(String value) {
            addCriterion("material_unit2 like", value, "materialUnit2");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit2NotLike(String value) {
            addCriterion("material_unit2 not like", value, "materialUnit2");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit2In(List<String> values) {
            addCriterion("material_unit2 in", values, "materialUnit2");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit2NotIn(List<String> values) {
            addCriterion("material_unit2 not in", values, "materialUnit2");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit2Between(String value1, String value2) {
            addCriterion("material_unit2 between", value1, value2, "materialUnit2");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit2NotBetween(String value1, String value2) {
            addCriterion("material_unit2 not between", value1, value2, "materialUnit2");
            return (Criteria) this;
        }

        public Criteria andMaterialName3IsNull() {
            addCriterion("material_name3 is null");
            return (Criteria) this;
        }

        public Criteria andMaterialName3IsNotNull() {
            addCriterion("material_name3 is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialName3EqualTo(String value) {
            addCriterion("material_name3 =", value, "materialName3");
            return (Criteria) this;
        }

        public Criteria andMaterialName3NotEqualTo(String value) {
            addCriterion("material_name3 <>", value, "materialName3");
            return (Criteria) this;
        }

        public Criteria andMaterialName3GreaterThan(String value) {
            addCriterion("material_name3 >", value, "materialName3");
            return (Criteria) this;
        }

        public Criteria andMaterialName3GreaterThanOrEqualTo(String value) {
            addCriterion("material_name3 >=", value, "materialName3");
            return (Criteria) this;
        }

        public Criteria andMaterialName3LessThan(String value) {
            addCriterion("material_name3 <", value, "materialName3");
            return (Criteria) this;
        }

        public Criteria andMaterialName3LessThanOrEqualTo(String value) {
            addCriterion("material_name3 <=", value, "materialName3");
            return (Criteria) this;
        }

        public Criteria andMaterialName3Like(String value) {
            addCriterion("material_name3 like", value, "materialName3");
            return (Criteria) this;
        }

        public Criteria andMaterialName3NotLike(String value) {
            addCriterion("material_name3 not like", value, "materialName3");
            return (Criteria) this;
        }

        public Criteria andMaterialName3In(List<String> values) {
            addCriterion("material_name3 in", values, "materialName3");
            return (Criteria) this;
        }

        public Criteria andMaterialName3NotIn(List<String> values) {
            addCriterion("material_name3 not in", values, "materialName3");
            return (Criteria) this;
        }

        public Criteria andMaterialName3Between(String value1, String value2) {
            addCriterion("material_name3 between", value1, value2, "materialName3");
            return (Criteria) this;
        }

        public Criteria andMaterialName3NotBetween(String value1, String value2) {
            addCriterion("material_name3 not between", value1, value2, "materialName3");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage3IsNull() {
            addCriterion("material_usage3 is null");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage3IsNotNull() {
            addCriterion("material_usage3 is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage3EqualTo(Double value) {
            addCriterion("material_usage3 =", value, "materialUsage3");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage3NotEqualTo(Double value) {
            addCriterion("material_usage3 <>", value, "materialUsage3");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage3GreaterThan(Double value) {
            addCriterion("material_usage3 >", value, "materialUsage3");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage3GreaterThanOrEqualTo(Double value) {
            addCriterion("material_usage3 >=", value, "materialUsage3");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage3LessThan(Double value) {
            addCriterion("material_usage3 <", value, "materialUsage3");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage3LessThanOrEqualTo(Double value) {
            addCriterion("material_usage3 <=", value, "materialUsage3");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage3In(List<Double> values) {
            addCriterion("material_usage3 in", values, "materialUsage3");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage3NotIn(List<Double> values) {
            addCriterion("material_usage3 not in", values, "materialUsage3");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage3Between(Double value1, Double value2) {
            addCriterion("material_usage3 between", value1, value2, "materialUsage3");
            return (Criteria) this;
        }

        public Criteria andMaterialUsage3NotBetween(Double value1, Double value2) {
            addCriterion("material_usage3 not between", value1, value2, "materialUsage3");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit3IsNull() {
            addCriterion("material_unit3 is null");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit3IsNotNull() {
            addCriterion("material_unit3 is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit3EqualTo(String value) {
            addCriterion("material_unit3 =", value, "materialUnit3");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit3NotEqualTo(String value) {
            addCriterion("material_unit3 <>", value, "materialUnit3");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit3GreaterThan(String value) {
            addCriterion("material_unit3 >", value, "materialUnit3");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit3GreaterThanOrEqualTo(String value) {
            addCriterion("material_unit3 >=", value, "materialUnit3");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit3LessThan(String value) {
            addCriterion("material_unit3 <", value, "materialUnit3");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit3LessThanOrEqualTo(String value) {
            addCriterion("material_unit3 <=", value, "materialUnit3");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit3Like(String value) {
            addCriterion("material_unit3 like", value, "materialUnit3");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit3NotLike(String value) {
            addCriterion("material_unit3 not like", value, "materialUnit3");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit3In(List<String> values) {
            addCriterion("material_unit3 in", values, "materialUnit3");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit3NotIn(List<String> values) {
            addCriterion("material_unit3 not in", values, "materialUnit3");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit3Between(String value1, String value2) {
            addCriterion("material_unit3 between", value1, value2, "materialUnit3");
            return (Criteria) this;
        }

        public Criteria andMaterialUnit3NotBetween(String value1, String value2) {
            addCriterion("material_unit3 not between", value1, value2, "materialUnit3");
            return (Criteria) this;
        }

        public Criteria andProductName1IsNull() {
            addCriterion("product_name1 is null");
            return (Criteria) this;
        }

        public Criteria andProductName1IsNotNull() {
            addCriterion("product_name1 is not null");
            return (Criteria) this;
        }

        public Criteria andProductName1EqualTo(String value) {
            addCriterion("product_name1 =", value, "productName1");
            return (Criteria) this;
        }

        public Criteria andProductName1NotEqualTo(String value) {
            addCriterion("product_name1 <>", value, "productName1");
            return (Criteria) this;
        }

        public Criteria andProductName1GreaterThan(String value) {
            addCriterion("product_name1 >", value, "productName1");
            return (Criteria) this;
        }

        public Criteria andProductName1GreaterThanOrEqualTo(String value) {
            addCriterion("product_name1 >=", value, "productName1");
            return (Criteria) this;
        }

        public Criteria andProductName1LessThan(String value) {
            addCriterion("product_name1 <", value, "productName1");
            return (Criteria) this;
        }

        public Criteria andProductName1LessThanOrEqualTo(String value) {
            addCriterion("product_name1 <=", value, "productName1");
            return (Criteria) this;
        }

        public Criteria andProductName1Like(String value) {
            addCriterion("product_name1 like", value, "productName1");
            return (Criteria) this;
        }

        public Criteria andProductName1NotLike(String value) {
            addCriterion("product_name1 not like", value, "productName1");
            return (Criteria) this;
        }

        public Criteria andProductName1In(List<String> values) {
            addCriterion("product_name1 in", values, "productName1");
            return (Criteria) this;
        }

        public Criteria andProductName1NotIn(List<String> values) {
            addCriterion("product_name1 not in", values, "productName1");
            return (Criteria) this;
        }

        public Criteria andProductName1Between(String value1, String value2) {
            addCriterion("product_name1 between", value1, value2, "productName1");
            return (Criteria) this;
        }

        public Criteria andProductName1NotBetween(String value1, String value2) {
            addCriterion("product_name1 not between", value1, value2, "productName1");
            return (Criteria) this;
        }

        public Criteria andProductUsage1IsNull() {
            addCriterion("product_usage1 is null");
            return (Criteria) this;
        }

        public Criteria andProductUsage1IsNotNull() {
            addCriterion("product_usage1 is not null");
            return (Criteria) this;
        }

        public Criteria andProductUsage1EqualTo(Double value) {
            addCriterion("product_usage1 =", value, "productUsage1");
            return (Criteria) this;
        }

        public Criteria andProductUsage1NotEqualTo(Double value) {
            addCriterion("product_usage1 <>", value, "productUsage1");
            return (Criteria) this;
        }

        public Criteria andProductUsage1GreaterThan(Double value) {
            addCriterion("product_usage1 >", value, "productUsage1");
            return (Criteria) this;
        }

        public Criteria andProductUsage1GreaterThanOrEqualTo(Double value) {
            addCriterion("product_usage1 >=", value, "productUsage1");
            return (Criteria) this;
        }

        public Criteria andProductUsage1LessThan(Double value) {
            addCriterion("product_usage1 <", value, "productUsage1");
            return (Criteria) this;
        }

        public Criteria andProductUsage1LessThanOrEqualTo(Double value) {
            addCriterion("product_usage1 <=", value, "productUsage1");
            return (Criteria) this;
        }

        public Criteria andProductUsage1In(List<Double> values) {
            addCriterion("product_usage1 in", values, "productUsage1");
            return (Criteria) this;
        }

        public Criteria andProductUsage1NotIn(List<Double> values) {
            addCriterion("product_usage1 not in", values, "productUsage1");
            return (Criteria) this;
        }

        public Criteria andProductUsage1Between(Double value1, Double value2) {
            addCriterion("product_usage1 between", value1, value2, "productUsage1");
            return (Criteria) this;
        }

        public Criteria andProductUsage1NotBetween(Double value1, Double value2) {
            addCriterion("product_usage1 not between", value1, value2, "productUsage1");
            return (Criteria) this;
        }

        public Criteria andProductUnit1IsNull() {
            addCriterion("product_unit1 is null");
            return (Criteria) this;
        }

        public Criteria andProductUnit1IsNotNull() {
            addCriterion("product_unit1 is not null");
            return (Criteria) this;
        }

        public Criteria andProductUnit1EqualTo(String value) {
            addCriterion("product_unit1 =", value, "productUnit1");
            return (Criteria) this;
        }

        public Criteria andProductUnit1NotEqualTo(String value) {
            addCriterion("product_unit1 <>", value, "productUnit1");
            return (Criteria) this;
        }

        public Criteria andProductUnit1GreaterThan(String value) {
            addCriterion("product_unit1 >", value, "productUnit1");
            return (Criteria) this;
        }

        public Criteria andProductUnit1GreaterThanOrEqualTo(String value) {
            addCriterion("product_unit1 >=", value, "productUnit1");
            return (Criteria) this;
        }

        public Criteria andProductUnit1LessThan(String value) {
            addCriterion("product_unit1 <", value, "productUnit1");
            return (Criteria) this;
        }

        public Criteria andProductUnit1LessThanOrEqualTo(String value) {
            addCriterion("product_unit1 <=", value, "productUnit1");
            return (Criteria) this;
        }

        public Criteria andProductUnit1Like(String value) {
            addCriterion("product_unit1 like", value, "productUnit1");
            return (Criteria) this;
        }

        public Criteria andProductUnit1NotLike(String value) {
            addCriterion("product_unit1 not like", value, "productUnit1");
            return (Criteria) this;
        }

        public Criteria andProductUnit1In(List<String> values) {
            addCriterion("product_unit1 in", values, "productUnit1");
            return (Criteria) this;
        }

        public Criteria andProductUnit1NotIn(List<String> values) {
            addCriterion("product_unit1 not in", values, "productUnit1");
            return (Criteria) this;
        }

        public Criteria andProductUnit1Between(String value1, String value2) {
            addCriterion("product_unit1 between", value1, value2, "productUnit1");
            return (Criteria) this;
        }

        public Criteria andProductUnit1NotBetween(String value1, String value2) {
            addCriterion("product_unit1 not between", value1, value2, "productUnit1");
            return (Criteria) this;
        }

        public Criteria andProductName2IsNull() {
            addCriterion("product_name2 is null");
            return (Criteria) this;
        }

        public Criteria andProductName2IsNotNull() {
            addCriterion("product_name2 is not null");
            return (Criteria) this;
        }

        public Criteria andProductName2EqualTo(String value) {
            addCriterion("product_name2 =", value, "productName2");
            return (Criteria) this;
        }

        public Criteria andProductName2NotEqualTo(String value) {
            addCriterion("product_name2 <>", value, "productName2");
            return (Criteria) this;
        }

        public Criteria andProductName2GreaterThan(String value) {
            addCriterion("product_name2 >", value, "productName2");
            return (Criteria) this;
        }

        public Criteria andProductName2GreaterThanOrEqualTo(String value) {
            addCriterion("product_name2 >=", value, "productName2");
            return (Criteria) this;
        }

        public Criteria andProductName2LessThan(String value) {
            addCriterion("product_name2 <", value, "productName2");
            return (Criteria) this;
        }

        public Criteria andProductName2LessThanOrEqualTo(String value) {
            addCriterion("product_name2 <=", value, "productName2");
            return (Criteria) this;
        }

        public Criteria andProductName2Like(String value) {
            addCriterion("product_name2 like", value, "productName2");
            return (Criteria) this;
        }

        public Criteria andProductName2NotLike(String value) {
            addCriterion("product_name2 not like", value, "productName2");
            return (Criteria) this;
        }

        public Criteria andProductName2In(List<String> values) {
            addCriterion("product_name2 in", values, "productName2");
            return (Criteria) this;
        }

        public Criteria andProductName2NotIn(List<String> values) {
            addCriterion("product_name2 not in", values, "productName2");
            return (Criteria) this;
        }

        public Criteria andProductName2Between(String value1, String value2) {
            addCriterion("product_name2 between", value1, value2, "productName2");
            return (Criteria) this;
        }

        public Criteria andProductName2NotBetween(String value1, String value2) {
            addCriterion("product_name2 not between", value1, value2, "productName2");
            return (Criteria) this;
        }

        public Criteria andProductUsage2IsNull() {
            addCriterion("product_usage2 is null");
            return (Criteria) this;
        }

        public Criteria andProductUsage2IsNotNull() {
            addCriterion("product_usage2 is not null");
            return (Criteria) this;
        }

        public Criteria andProductUsage2EqualTo(Double value) {
            addCriterion("product_usage2 =", value, "productUsage2");
            return (Criteria) this;
        }

        public Criteria andProductUsage2NotEqualTo(Double value) {
            addCriterion("product_usage2 <>", value, "productUsage2");
            return (Criteria) this;
        }

        public Criteria andProductUsage2GreaterThan(Double value) {
            addCriterion("product_usage2 >", value, "productUsage2");
            return (Criteria) this;
        }

        public Criteria andProductUsage2GreaterThanOrEqualTo(Double value) {
            addCriterion("product_usage2 >=", value, "productUsage2");
            return (Criteria) this;
        }

        public Criteria andProductUsage2LessThan(Double value) {
            addCriterion("product_usage2 <", value, "productUsage2");
            return (Criteria) this;
        }

        public Criteria andProductUsage2LessThanOrEqualTo(Double value) {
            addCriterion("product_usage2 <=", value, "productUsage2");
            return (Criteria) this;
        }

        public Criteria andProductUsage2In(List<Double> values) {
            addCriterion("product_usage2 in", values, "productUsage2");
            return (Criteria) this;
        }

        public Criteria andProductUsage2NotIn(List<Double> values) {
            addCriterion("product_usage2 not in", values, "productUsage2");
            return (Criteria) this;
        }

        public Criteria andProductUsage2Between(Double value1, Double value2) {
            addCriterion("product_usage2 between", value1, value2, "productUsage2");
            return (Criteria) this;
        }

        public Criteria andProductUsage2NotBetween(Double value1, Double value2) {
            addCriterion("product_usage2 not between", value1, value2, "productUsage2");
            return (Criteria) this;
        }

        public Criteria andProductUnit2IsNull() {
            addCriterion("product_unit2 is null");
            return (Criteria) this;
        }

        public Criteria andProductUnit2IsNotNull() {
            addCriterion("product_unit2 is not null");
            return (Criteria) this;
        }

        public Criteria andProductUnit2EqualTo(String value) {
            addCriterion("product_unit2 =", value, "productUnit2");
            return (Criteria) this;
        }

        public Criteria andProductUnit2NotEqualTo(String value) {
            addCriterion("product_unit2 <>", value, "productUnit2");
            return (Criteria) this;
        }

        public Criteria andProductUnit2GreaterThan(String value) {
            addCriterion("product_unit2 >", value, "productUnit2");
            return (Criteria) this;
        }

        public Criteria andProductUnit2GreaterThanOrEqualTo(String value) {
            addCriterion("product_unit2 >=", value, "productUnit2");
            return (Criteria) this;
        }

        public Criteria andProductUnit2LessThan(String value) {
            addCriterion("product_unit2 <", value, "productUnit2");
            return (Criteria) this;
        }

        public Criteria andProductUnit2LessThanOrEqualTo(String value) {
            addCriterion("product_unit2 <=", value, "productUnit2");
            return (Criteria) this;
        }

        public Criteria andProductUnit2Like(String value) {
            addCriterion("product_unit2 like", value, "productUnit2");
            return (Criteria) this;
        }

        public Criteria andProductUnit2NotLike(String value) {
            addCriterion("product_unit2 not like", value, "productUnit2");
            return (Criteria) this;
        }

        public Criteria andProductUnit2In(List<String> values) {
            addCriterion("product_unit2 in", values, "productUnit2");
            return (Criteria) this;
        }

        public Criteria andProductUnit2NotIn(List<String> values) {
            addCriterion("product_unit2 not in", values, "productUnit2");
            return (Criteria) this;
        }

        public Criteria andProductUnit2Between(String value1, String value2) {
            addCriterion("product_unit2 between", value1, value2, "productUnit2");
            return (Criteria) this;
        }

        public Criteria andProductUnit2NotBetween(String value1, String value2) {
            addCriterion("product_unit2 not between", value1, value2, "productUnit2");
            return (Criteria) this;
        }

        public Criteria andProductName3IsNull() {
            addCriterion("product_name3 is null");
            return (Criteria) this;
        }

        public Criteria andProductName3IsNotNull() {
            addCriterion("product_name3 is not null");
            return (Criteria) this;
        }

        public Criteria andProductName3EqualTo(String value) {
            addCriterion("product_name3 =", value, "productName3");
            return (Criteria) this;
        }

        public Criteria andProductName3NotEqualTo(String value) {
            addCriterion("product_name3 <>", value, "productName3");
            return (Criteria) this;
        }

        public Criteria andProductName3GreaterThan(String value) {
            addCriterion("product_name3 >", value, "productName3");
            return (Criteria) this;
        }

        public Criteria andProductName3GreaterThanOrEqualTo(String value) {
            addCriterion("product_name3 >=", value, "productName3");
            return (Criteria) this;
        }

        public Criteria andProductName3LessThan(String value) {
            addCriterion("product_name3 <", value, "productName3");
            return (Criteria) this;
        }

        public Criteria andProductName3LessThanOrEqualTo(String value) {
            addCriterion("product_name3 <=", value, "productName3");
            return (Criteria) this;
        }

        public Criteria andProductName3Like(String value) {
            addCriterion("product_name3 like", value, "productName3");
            return (Criteria) this;
        }

        public Criteria andProductName3NotLike(String value) {
            addCriterion("product_name3 not like", value, "productName3");
            return (Criteria) this;
        }

        public Criteria andProductName3In(List<String> values) {
            addCriterion("product_name3 in", values, "productName3");
            return (Criteria) this;
        }

        public Criteria andProductName3NotIn(List<String> values) {
            addCriterion("product_name3 not in", values, "productName3");
            return (Criteria) this;
        }

        public Criteria andProductName3Between(String value1, String value2) {
            addCriterion("product_name3 between", value1, value2, "productName3");
            return (Criteria) this;
        }

        public Criteria andProductName3NotBetween(String value1, String value2) {
            addCriterion("product_name3 not between", value1, value2, "productName3");
            return (Criteria) this;
        }

        public Criteria andProductUsage3IsNull() {
            addCriterion("product_usage3 is null");
            return (Criteria) this;
        }

        public Criteria andProductUsage3IsNotNull() {
            addCriterion("product_usage3 is not null");
            return (Criteria) this;
        }

        public Criteria andProductUsage3EqualTo(Double value) {
            addCriterion("product_usage3 =", value, "productUsage3");
            return (Criteria) this;
        }

        public Criteria andProductUsage3NotEqualTo(Double value) {
            addCriterion("product_usage3 <>", value, "productUsage3");
            return (Criteria) this;
        }

        public Criteria andProductUsage3GreaterThan(Double value) {
            addCriterion("product_usage3 >", value, "productUsage3");
            return (Criteria) this;
        }

        public Criteria andProductUsage3GreaterThanOrEqualTo(Double value) {
            addCriterion("product_usage3 >=", value, "productUsage3");
            return (Criteria) this;
        }

        public Criteria andProductUsage3LessThan(Double value) {
            addCriterion("product_usage3 <", value, "productUsage3");
            return (Criteria) this;
        }

        public Criteria andProductUsage3LessThanOrEqualTo(Double value) {
            addCriterion("product_usage3 <=", value, "productUsage3");
            return (Criteria) this;
        }

        public Criteria andProductUsage3In(List<Double> values) {
            addCriterion("product_usage3 in", values, "productUsage3");
            return (Criteria) this;
        }

        public Criteria andProductUsage3NotIn(List<Double> values) {
            addCriterion("product_usage3 not in", values, "productUsage3");
            return (Criteria) this;
        }

        public Criteria andProductUsage3Between(Double value1, Double value2) {
            addCriterion("product_usage3 between", value1, value2, "productUsage3");
            return (Criteria) this;
        }

        public Criteria andProductUsage3NotBetween(Double value1, Double value2) {
            addCriterion("product_usage3 not between", value1, value2, "productUsage3");
            return (Criteria) this;
        }

        public Criteria andProductUnit3IsNull() {
            addCriterion("product_unit3 is null");
            return (Criteria) this;
        }

        public Criteria andProductUnit3IsNotNull() {
            addCriterion("product_unit3 is not null");
            return (Criteria) this;
        }

        public Criteria andProductUnit3EqualTo(String value) {
            addCriterion("product_unit3 =", value, "productUnit3");
            return (Criteria) this;
        }

        public Criteria andProductUnit3NotEqualTo(String value) {
            addCriterion("product_unit3 <>", value, "productUnit3");
            return (Criteria) this;
        }

        public Criteria andProductUnit3GreaterThan(String value) {
            addCriterion("product_unit3 >", value, "productUnit3");
            return (Criteria) this;
        }

        public Criteria andProductUnit3GreaterThanOrEqualTo(String value) {
            addCriterion("product_unit3 >=", value, "productUnit3");
            return (Criteria) this;
        }

        public Criteria andProductUnit3LessThan(String value) {
            addCriterion("product_unit3 <", value, "productUnit3");
            return (Criteria) this;
        }

        public Criteria andProductUnit3LessThanOrEqualTo(String value) {
            addCriterion("product_unit3 <=", value, "productUnit3");
            return (Criteria) this;
        }

        public Criteria andProductUnit3Like(String value) {
            addCriterion("product_unit3 like", value, "productUnit3");
            return (Criteria) this;
        }

        public Criteria andProductUnit3NotLike(String value) {
            addCriterion("product_unit3 not like", value, "productUnit3");
            return (Criteria) this;
        }

        public Criteria andProductUnit3In(List<String> values) {
            addCriterion("product_unit3 in", values, "productUnit3");
            return (Criteria) this;
        }

        public Criteria andProductUnit3NotIn(List<String> values) {
            addCriterion("product_unit3 not in", values, "productUnit3");
            return (Criteria) this;
        }

        public Criteria andProductUnit3Between(String value1, String value2) {
            addCriterion("product_unit3 between", value1, value2, "productUnit3");
            return (Criteria) this;
        }

        public Criteria andProductUnit3NotBetween(String value1, String value2) {
            addCriterion("product_unit3 not between", value1, value2, "productUnit3");
            return (Criteria) this;
        }

        public Criteria andTreatNameIsNull() {
            addCriterion("treat_name is null");
            return (Criteria) this;
        }

        public Criteria andTreatNameIsNotNull() {
            addCriterion("treat_name is not null");
            return (Criteria) this;
        }

        public Criteria andTreatNameEqualTo(String value) {
            addCriterion("treat_name =", value, "treatName");
            return (Criteria) this;
        }

        public Criteria andTreatNameNotEqualTo(String value) {
            addCriterion("treat_name <>", value, "treatName");
            return (Criteria) this;
        }

        public Criteria andTreatNameGreaterThan(String value) {
            addCriterion("treat_name >", value, "treatName");
            return (Criteria) this;
        }

        public Criteria andTreatNameGreaterThanOrEqualTo(String value) {
            addCriterion("treat_name >=", value, "treatName");
            return (Criteria) this;
        }

        public Criteria andTreatNameLessThan(String value) {
            addCriterion("treat_name <", value, "treatName");
            return (Criteria) this;
        }

        public Criteria andTreatNameLessThanOrEqualTo(String value) {
            addCriterion("treat_name <=", value, "treatName");
            return (Criteria) this;
        }

        public Criteria andTreatNameLike(String value) {
            addCriterion("treat_name like", value, "treatName");
            return (Criteria) this;
        }

        public Criteria andTreatNameNotLike(String value) {
            addCriterion("treat_name not like", value, "treatName");
            return (Criteria) this;
        }

        public Criteria andTreatNameIn(List<String> values) {
            addCriterion("treat_name in", values, "treatName");
            return (Criteria) this;
        }

        public Criteria andTreatNameNotIn(List<String> values) {
            addCriterion("treat_name not in", values, "treatName");
            return (Criteria) this;
        }

        public Criteria andTreatNameBetween(String value1, String value2) {
            addCriterion("treat_name between", value1, value2, "treatName");
            return (Criteria) this;
        }

        public Criteria andTreatNameNotBetween(String value1, String value2) {
            addCriterion("treat_name not between", value1, value2, "treatName");
            return (Criteria) this;
        }

        public Criteria andGasprofabriIsNull() {
            addCriterion("gasprofabri is null");
            return (Criteria) this;
        }

        public Criteria andGasprofabriIsNotNull() {
            addCriterion("gasprofabri is not null");
            return (Criteria) this;
        }

        public Criteria andGasprofabriEqualTo(String value) {
            addCriterion("gasprofabri =", value, "gasprofabri");
            return (Criteria) this;
        }

        public Criteria andGasprofabriNotEqualTo(String value) {
            addCriterion("gasprofabri <>", value, "gasprofabri");
            return (Criteria) this;
        }

        public Criteria andGasprofabriGreaterThan(String value) {
            addCriterion("gasprofabri >", value, "gasprofabri");
            return (Criteria) this;
        }

        public Criteria andGasprofabriGreaterThanOrEqualTo(String value) {
            addCriterion("gasprofabri >=", value, "gasprofabri");
            return (Criteria) this;
        }

        public Criteria andGasprofabriLessThan(String value) {
            addCriterion("gasprofabri <", value, "gasprofabri");
            return (Criteria) this;
        }

        public Criteria andGasprofabriLessThanOrEqualTo(String value) {
            addCriterion("gasprofabri <=", value, "gasprofabri");
            return (Criteria) this;
        }

        public Criteria andGasprofabriLike(String value) {
            addCriterion("gasprofabri like", value, "gasprofabri");
            return (Criteria) this;
        }

        public Criteria andGasprofabriNotLike(String value) {
            addCriterion("gasprofabri not like", value, "gasprofabri");
            return (Criteria) this;
        }

        public Criteria andGasprofabriIn(List<String> values) {
            addCriterion("gasprofabri in", values, "gasprofabri");
            return (Criteria) this;
        }

        public Criteria andGasprofabriNotIn(List<String> values) {
            addCriterion("gasprofabri not in", values, "gasprofabri");
            return (Criteria) this;
        }

        public Criteria andGasprofabriBetween(String value1, String value2) {
            addCriterion("gasprofabri between", value1, value2, "gasprofabri");
            return (Criteria) this;
        }

        public Criteria andGasprofabriNotBetween(String value1, String value2) {
            addCriterion("gasprofabri not between", value1, value2, "gasprofabri");
            return (Criteria) this;
        }

        public Criteria andEffiIsNull() {
            addCriterion("effi is null");
            return (Criteria) this;
        }

        public Criteria andEffiIsNotNull() {
            addCriterion("effi is not null");
            return (Criteria) this;
        }

        public Criteria andEffiEqualTo(Double value) {
            addCriterion("effi =", value, "effi");
            return (Criteria) this;
        }

        public Criteria andEffiNotEqualTo(Double value) {
            addCriterion("effi <>", value, "effi");
            return (Criteria) this;
        }

        public Criteria andEffiGreaterThan(Double value) {
            addCriterion("effi >", value, "effi");
            return (Criteria) this;
        }

        public Criteria andEffiGreaterThanOrEqualTo(Double value) {
            addCriterion("effi >=", value, "effi");
            return (Criteria) this;
        }

        public Criteria andEffiLessThan(Double value) {
            addCriterion("effi <", value, "effi");
            return (Criteria) this;
        }

        public Criteria andEffiLessThanOrEqualTo(Double value) {
            addCriterion("effi <=", value, "effi");
            return (Criteria) this;
        }

        public Criteria andEffiIn(List<Double> values) {
            addCriterion("effi in", values, "effi");
            return (Criteria) this;
        }

        public Criteria andEffiNotIn(List<Double> values) {
            addCriterion("effi not in", values, "effi");
            return (Criteria) this;
        }

        public Criteria andEffiBetween(Double value1, Double value2) {
            addCriterion("effi between", value1, value2, "effi");
            return (Criteria) this;
        }

        public Criteria andEffiNotBetween(Double value1, Double value2) {
            addCriterion("effi not between", value1, value2, "effi");
            return (Criteria) this;
        }

        public Criteria andActivityMeasIsNull() {
            addCriterion("activity_meas is null");
            return (Criteria) this;
        }

        public Criteria andActivityMeasIsNotNull() {
            addCriterion("activity_meas is not null");
            return (Criteria) this;
        }

        public Criteria andActivityMeasEqualTo(String value) {
            addCriterion("activity_meas =", value, "activityMeas");
            return (Criteria) this;
        }

        public Criteria andActivityMeasNotEqualTo(String value) {
            addCriterion("activity_meas <>", value, "activityMeas");
            return (Criteria) this;
        }

        public Criteria andActivityMeasGreaterThan(String value) {
            addCriterion("activity_meas >", value, "activityMeas");
            return (Criteria) this;
        }

        public Criteria andActivityMeasGreaterThanOrEqualTo(String value) {
            addCriterion("activity_meas >=", value, "activityMeas");
            return (Criteria) this;
        }

        public Criteria andActivityMeasLessThan(String value) {
            addCriterion("activity_meas <", value, "activityMeas");
            return (Criteria) this;
        }

        public Criteria andActivityMeasLessThanOrEqualTo(String value) {
            addCriterion("activity_meas <=", value, "activityMeas");
            return (Criteria) this;
        }

        public Criteria andActivityMeasLike(String value) {
            addCriterion("activity_meas like", value, "activityMeas");
            return (Criteria) this;
        }

        public Criteria andActivityMeasNotLike(String value) {
            addCriterion("activity_meas not like", value, "activityMeas");
            return (Criteria) this;
        }

        public Criteria andActivityMeasIn(List<String> values) {
            addCriterion("activity_meas in", values, "activityMeas");
            return (Criteria) this;
        }

        public Criteria andActivityMeasNotIn(List<String> values) {
            addCriterion("activity_meas not in", values, "activityMeas");
            return (Criteria) this;
        }

        public Criteria andActivityMeasBetween(String value1, String value2) {
            addCriterion("activity_meas between", value1, value2, "activityMeas");
            return (Criteria) this;
        }

        public Criteria andActivityMeasNotBetween(String value1, String value2) {
            addCriterion("activity_meas not between", value1, value2, "activityMeas");
            return (Criteria) this;
        }

        public Criteria andActivityIsNull() {
            addCriterion("activity is null");
            return (Criteria) this;
        }

        public Criteria andActivityIsNotNull() {
            addCriterion("activity is not null");
            return (Criteria) this;
        }

        public Criteria andActivityEqualTo(Double value) {
            addCriterion("activity =", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotEqualTo(Double value) {
            addCriterion("activity <>", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityGreaterThan(Double value) {
            addCriterion("activity >", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityGreaterThanOrEqualTo(Double value) {
            addCriterion("activity >=", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLessThan(Double value) {
            addCriterion("activity <", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLessThanOrEqualTo(Double value) {
            addCriterion("activity <=", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityIn(List<Double> values) {
            addCriterion("activity in", values, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotIn(List<Double> values) {
            addCriterion("activity not in", values, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityBetween(Double value1, Double value2) {
            addCriterion("activity between", value1, value2, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotBetween(Double value1, Double value2) {
            addCriterion("activity not between", value1, value2, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityUnitIsNull() {
            addCriterion("activity_unit is null");
            return (Criteria) this;
        }

        public Criteria andActivityUnitIsNotNull() {
            addCriterion("activity_unit is not null");
            return (Criteria) this;
        }

        public Criteria andActivityUnitEqualTo(String value) {
            addCriterion("activity_unit =", value, "activityUnit");
            return (Criteria) this;
        }

        public Criteria andActivityUnitNotEqualTo(String value) {
            addCriterion("activity_unit <>", value, "activityUnit");
            return (Criteria) this;
        }

        public Criteria andActivityUnitGreaterThan(String value) {
            addCriterion("activity_unit >", value, "activityUnit");
            return (Criteria) this;
        }

        public Criteria andActivityUnitGreaterThanOrEqualTo(String value) {
            addCriterion("activity_unit >=", value, "activityUnit");
            return (Criteria) this;
        }

        public Criteria andActivityUnitLessThan(String value) {
            addCriterion("activity_unit <", value, "activityUnit");
            return (Criteria) this;
        }

        public Criteria andActivityUnitLessThanOrEqualTo(String value) {
            addCriterion("activity_unit <=", value, "activityUnit");
            return (Criteria) this;
        }

        public Criteria andActivityUnitLike(String value) {
            addCriterion("activity_unit like", value, "activityUnit");
            return (Criteria) this;
        }

        public Criteria andActivityUnitNotLike(String value) {
            addCriterion("activity_unit not like", value, "activityUnit");
            return (Criteria) this;
        }

        public Criteria andActivityUnitIn(List<String> values) {
            addCriterion("activity_unit in", values, "activityUnit");
            return (Criteria) this;
        }

        public Criteria andActivityUnitNotIn(List<String> values) {
            addCriterion("activity_unit not in", values, "activityUnit");
            return (Criteria) this;
        }

        public Criteria andActivityUnitBetween(String value1, String value2) {
            addCriterion("activity_unit between", value1, value2, "activityUnit");
            return (Criteria) this;
        }

        public Criteria andActivityUnitNotBetween(String value1, String value2) {
            addCriterion("activity_unit not between", value1, value2, "activityUnit");
            return (Criteria) this;
        }

        public Criteria andVocEmiIsNull() {
            addCriterion("voc_emi is null");
            return (Criteria) this;
        }

        public Criteria andVocEmiIsNotNull() {
            addCriterion("voc_emi is not null");
            return (Criteria) this;
        }

        public Criteria andVocEmiEqualTo(Double value) {
            addCriterion("voc_emi =", value, "vocEmi");
            return (Criteria) this;
        }

        public Criteria andVocEmiNotEqualTo(Double value) {
            addCriterion("voc_emi <>", value, "vocEmi");
            return (Criteria) this;
        }

        public Criteria andVocEmiGreaterThan(Double value) {
            addCriterion("voc_emi >", value, "vocEmi");
            return (Criteria) this;
        }

        public Criteria andVocEmiGreaterThanOrEqualTo(Double value) {
            addCriterion("voc_emi >=", value, "vocEmi");
            return (Criteria) this;
        }

        public Criteria andVocEmiLessThan(Double value) {
            addCriterion("voc_emi <", value, "vocEmi");
            return (Criteria) this;
        }

        public Criteria andVocEmiLessThanOrEqualTo(Double value) {
            addCriterion("voc_emi <=", value, "vocEmi");
            return (Criteria) this;
        }

        public Criteria andVocEmiIn(List<Double> values) {
            addCriterion("voc_emi in", values, "vocEmi");
            return (Criteria) this;
        }

        public Criteria andVocEmiNotIn(List<Double> values) {
            addCriterion("voc_emi not in", values, "vocEmi");
            return (Criteria) this;
        }

        public Criteria andVocEmiBetween(Double value1, Double value2) {
            addCriterion("voc_emi between", value1, value2, "vocEmi");
            return (Criteria) this;
        }

        public Criteria andVocEmiNotBetween(Double value1, Double value2) {
            addCriterion("voc_emi not between", value1, value2, "vocEmi");
            return (Criteria) this;
        }

        public Criteria andScccodeIsNull() {
            addCriterion("scccode is null");
            return (Criteria) this;
        }

        public Criteria andScccodeIsNotNull() {
            addCriterion("scccode is not null");
            return (Criteria) this;
        }

        public Criteria andScccodeEqualTo(String value) {
            addCriterion("scccode =", value, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeNotEqualTo(String value) {
            addCriterion("scccode <>", value, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeGreaterThan(String value) {
            addCriterion("scccode >", value, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeGreaterThanOrEqualTo(String value) {
            addCriterion("scccode >=", value, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeLessThan(String value) {
            addCriterion("scccode <", value, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeLessThanOrEqualTo(String value) {
            addCriterion("scccode <=", value, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeLike(String value) {
            addCriterion("scccode like", value, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeNotLike(String value) {
            addCriterion("scccode not like", value, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeIn(List<String> values) {
            addCriterion("scccode in", values, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeNotIn(List<String> values) {
            addCriterion("scccode not in", values, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeBetween(String value1, String value2) {
            addCriterion("scccode between", value1, value2, "scccode");
            return (Criteria) this;
        }

        public Criteria andScccodeNotBetween(String value1, String value2) {
            addCriterion("scccode not between", value1, value2, "scccode");
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