package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class STransportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public STransportExample() {
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

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("year like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("year not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andCountyidIsNull() {
            addCriterion("countyId is null");
            return (Criteria) this;
        }

        public Criteria andCountyidIsNotNull() {
            addCriterion("countyId is not null");
            return (Criteria) this;
        }

        public Criteria andCountyidEqualTo(String value) {
            addCriterion("countyId =", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidNotEqualTo(String value) {
            addCriterion("countyId <>", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidGreaterThan(String value) {
            addCriterion("countyId >", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidGreaterThanOrEqualTo(String value) {
            addCriterion("countyId >=", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidLessThan(String value) {
            addCriterion("countyId <", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidLessThanOrEqualTo(String value) {
            addCriterion("countyId <=", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidLike(String value) {
            addCriterion("countyId like", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidNotLike(String value) {
            addCriterion("countyId not like", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidIn(List<String> values) {
            addCriterion("countyId in", values, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidNotIn(List<String> values) {
            addCriterion("countyId not in", values, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidBetween(String value1, String value2) {
            addCriterion("countyId between", value1, value2, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidNotBetween(String value1, String value2) {
            addCriterion("countyId not between", value1, value2, "countyid");
            return (Criteria) this;
        }

        public Criteria andOilnameIsNull() {
            addCriterion("oilname is null");
            return (Criteria) this;
        }

        public Criteria andOilnameIsNotNull() {
            addCriterion("oilname is not null");
            return (Criteria) this;
        }

        public Criteria andOilnameEqualTo(String value) {
            addCriterion("oilname =", value, "oilname");
            return (Criteria) this;
        }

        public Criteria andOilnameNotEqualTo(String value) {
            addCriterion("oilname <>", value, "oilname");
            return (Criteria) this;
        }

        public Criteria andOilnameGreaterThan(String value) {
            addCriterion("oilname >", value, "oilname");
            return (Criteria) this;
        }

        public Criteria andOilnameGreaterThanOrEqualTo(String value) {
            addCriterion("oilname >=", value, "oilname");
            return (Criteria) this;
        }

        public Criteria andOilnameLessThan(String value) {
            addCriterion("oilname <", value, "oilname");
            return (Criteria) this;
        }

        public Criteria andOilnameLessThanOrEqualTo(String value) {
            addCriterion("oilname <=", value, "oilname");
            return (Criteria) this;
        }

        public Criteria andOilnameLike(String value) {
            addCriterion("oilname like", value, "oilname");
            return (Criteria) this;
        }

        public Criteria andOilnameNotLike(String value) {
            addCriterion("oilname not like", value, "oilname");
            return (Criteria) this;
        }

        public Criteria andOilnameIn(List<String> values) {
            addCriterion("oilname in", values, "oilname");
            return (Criteria) this;
        }

        public Criteria andOilnameNotIn(List<String> values) {
            addCriterion("oilname not in", values, "oilname");
            return (Criteria) this;
        }

        public Criteria andOilnameBetween(String value1, String value2) {
            addCriterion("oilname between", value1, value2, "oilname");
            return (Criteria) this;
        }

        public Criteria andOilnameNotBetween(String value1, String value2) {
            addCriterion("oilname not between", value1, value2, "oilname");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(Double value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(Double value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(Double value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(Double value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<Double> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<Double> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(Double value1, Double value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(Double value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(Double value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(Double value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(Double value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<Double> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<Double> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(Double value1, Double value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
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

        public Criteria andStoreMaterialIsNull() {
            addCriterion("Store_material is null");
            return (Criteria) this;
        }

        public Criteria andStoreMaterialIsNotNull() {
            addCriterion("Store_material is not null");
            return (Criteria) this;
        }

        public Criteria andStoreMaterialEqualTo(String value) {
            addCriterion("Store_material =", value, "storeMaterial");
            return (Criteria) this;
        }

        public Criteria andStoreMaterialNotEqualTo(String value) {
            addCriterion("Store_material <>", value, "storeMaterial");
            return (Criteria) this;
        }

        public Criteria andStoreMaterialGreaterThan(String value) {
            addCriterion("Store_material >", value, "storeMaterial");
            return (Criteria) this;
        }

        public Criteria andStoreMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("Store_material >=", value, "storeMaterial");
            return (Criteria) this;
        }

        public Criteria andStoreMaterialLessThan(String value) {
            addCriterion("Store_material <", value, "storeMaterial");
            return (Criteria) this;
        }

        public Criteria andStoreMaterialLessThanOrEqualTo(String value) {
            addCriterion("Store_material <=", value, "storeMaterial");
            return (Criteria) this;
        }

        public Criteria andStoreMaterialLike(String value) {
            addCriterion("Store_material like", value, "storeMaterial");
            return (Criteria) this;
        }

        public Criteria andStoreMaterialNotLike(String value) {
            addCriterion("Store_material not like", value, "storeMaterial");
            return (Criteria) this;
        }

        public Criteria andStoreMaterialIn(List<String> values) {
            addCriterion("Store_material in", values, "storeMaterial");
            return (Criteria) this;
        }

        public Criteria andStoreMaterialNotIn(List<String> values) {
            addCriterion("Store_material not in", values, "storeMaterial");
            return (Criteria) this;
        }

        public Criteria andStoreMaterialBetween(String value1, String value2) {
            addCriterion("Store_material between", value1, value2, "storeMaterial");
            return (Criteria) this;
        }

        public Criteria andStoreMaterialNotBetween(String value1, String value2) {
            addCriterion("Store_material not between", value1, value2, "storeMaterial");
            return (Criteria) this;
        }

        public Criteria andFtkIsNull() {
            addCriterion("ftk is null");
            return (Criteria) this;
        }

        public Criteria andFtkIsNotNull() {
            addCriterion("ftk is not null");
            return (Criteria) this;
        }

        public Criteria andFtkEqualTo(Double value) {
            addCriterion("ftk =", value, "ftk");
            return (Criteria) this;
        }

        public Criteria andFtkNotEqualTo(Double value) {
            addCriterion("ftk <>", value, "ftk");
            return (Criteria) this;
        }

        public Criteria andFtkGreaterThan(Double value) {
            addCriterion("ftk >", value, "ftk");
            return (Criteria) this;
        }

        public Criteria andFtkGreaterThanOrEqualTo(Double value) {
            addCriterion("ftk >=", value, "ftk");
            return (Criteria) this;
        }

        public Criteria andFtkLessThan(Double value) {
            addCriterion("ftk <", value, "ftk");
            return (Criteria) this;
        }

        public Criteria andFtkLessThanOrEqualTo(Double value) {
            addCriterion("ftk <=", value, "ftk");
            return (Criteria) this;
        }

        public Criteria andFtkIn(List<Double> values) {
            addCriterion("ftk in", values, "ftk");
            return (Criteria) this;
        }

        public Criteria andFtkNotIn(List<Double> values) {
            addCriterion("ftk not in", values, "ftk");
            return (Criteria) this;
        }

        public Criteria andFtkBetween(Double value1, Double value2) {
            addCriterion("ftk between", value1, value2, "ftk");
            return (Criteria) this;
        }

        public Criteria andFtkNotBetween(Double value1, Double value2) {
            addCriterion("ftk not between", value1, value2, "ftk");
            return (Criteria) this;
        }

        public Criteria andSourceStorageIsNull() {
            addCriterion("Source_storage is null");
            return (Criteria) this;
        }

        public Criteria andSourceStorageIsNotNull() {
            addCriterion("Source_storage is not null");
            return (Criteria) this;
        }

        public Criteria andSourceStorageEqualTo(String value) {
            addCriterion("Source_storage =", value, "sourceStorage");
            return (Criteria) this;
        }

        public Criteria andSourceStorageNotEqualTo(String value) {
            addCriterion("Source_storage <>", value, "sourceStorage");
            return (Criteria) this;
        }

        public Criteria andSourceStorageGreaterThan(String value) {
            addCriterion("Source_storage >", value, "sourceStorage");
            return (Criteria) this;
        }

        public Criteria andSourceStorageGreaterThanOrEqualTo(String value) {
            addCriterion("Source_storage >=", value, "sourceStorage");
            return (Criteria) this;
        }

        public Criteria andSourceStorageLessThan(String value) {
            addCriterion("Source_storage <", value, "sourceStorage");
            return (Criteria) this;
        }

        public Criteria andSourceStorageLessThanOrEqualTo(String value) {
            addCriterion("Source_storage <=", value, "sourceStorage");
            return (Criteria) this;
        }

        public Criteria andSourceStorageLike(String value) {
            addCriterion("Source_storage like", value, "sourceStorage");
            return (Criteria) this;
        }

        public Criteria andSourceStorageNotLike(String value) {
            addCriterion("Source_storage not like", value, "sourceStorage");
            return (Criteria) this;
        }

        public Criteria andSourceStorageIn(List<String> values) {
            addCriterion("Source_storage in", values, "sourceStorage");
            return (Criteria) this;
        }

        public Criteria andSourceStorageNotIn(List<String> values) {
            addCriterion("Source_storage not in", values, "sourceStorage");
            return (Criteria) this;
        }

        public Criteria andSourceStorageBetween(String value1, String value2) {
            addCriterion("Source_storage between", value1, value2, "sourceStorage");
            return (Criteria) this;
        }

        public Criteria andSourceStorageNotBetween(String value1, String value2) {
            addCriterion("Source_storage not between", value1, value2, "sourceStorage");
            return (Criteria) this;
        }

        public Criteria andFueltypeIsNull() {
            addCriterion("fueltype is null");
            return (Criteria) this;
        }

        public Criteria andFueltypeIsNotNull() {
            addCriterion("fueltype is not null");
            return (Criteria) this;
        }

        public Criteria andFueltypeEqualTo(String value) {
            addCriterion("fueltype =", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeNotEqualTo(String value) {
            addCriterion("fueltype <>", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeGreaterThan(String value) {
            addCriterion("fueltype >", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeGreaterThanOrEqualTo(String value) {
            addCriterion("fueltype >=", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeLessThan(String value) {
            addCriterion("fueltype <", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeLessThanOrEqualTo(String value) {
            addCriterion("fueltype <=", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeLike(String value) {
            addCriterion("fueltype like", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeNotLike(String value) {
            addCriterion("fueltype not like", value, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeIn(List<String> values) {
            addCriterion("fueltype in", values, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeNotIn(List<String> values) {
            addCriterion("fueltype not in", values, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeBetween(String value1, String value2) {
            addCriterion("fueltype between", value1, value2, "fueltype");
            return (Criteria) this;
        }

        public Criteria andFueltypeNotBetween(String value1, String value2) {
            addCriterion("fueltype not between", value1, value2, "fueltype");
            return (Criteria) this;
        }

        public Criteria andNh3TemfIsNull() {
            addCriterion("nh3_temf is null");
            return (Criteria) this;
        }

        public Criteria andNh3TemfIsNotNull() {
            addCriterion("nh3_temf is not null");
            return (Criteria) this;
        }

        public Criteria andNh3TemfEqualTo(Double value) {
            addCriterion("nh3_temf =", value, "nh3Temf");
            return (Criteria) this;
        }

        public Criteria andNh3TemfNotEqualTo(Double value) {
            addCriterion("nh3_temf <>", value, "nh3Temf");
            return (Criteria) this;
        }

        public Criteria andNh3TemfGreaterThan(Double value) {
            addCriterion("nh3_temf >", value, "nh3Temf");
            return (Criteria) this;
        }

        public Criteria andNh3TemfGreaterThanOrEqualTo(Double value) {
            addCriterion("nh3_temf >=", value, "nh3Temf");
            return (Criteria) this;
        }

        public Criteria andNh3TemfLessThan(Double value) {
            addCriterion("nh3_temf <", value, "nh3Temf");
            return (Criteria) this;
        }

        public Criteria andNh3TemfLessThanOrEqualTo(Double value) {
            addCriterion("nh3_temf <=", value, "nh3Temf");
            return (Criteria) this;
        }

        public Criteria andNh3TemfIn(List<Double> values) {
            addCriterion("nh3_temf in", values, "nh3Temf");
            return (Criteria) this;
        }

        public Criteria andNh3TemfNotIn(List<Double> values) {
            addCriterion("nh3_temf not in", values, "nh3Temf");
            return (Criteria) this;
        }

        public Criteria andNh3TemfBetween(Double value1, Double value2) {
            addCriterion("nh3_temf between", value1, value2, "nh3Temf");
            return (Criteria) this;
        }

        public Criteria andNh3TemfNotBetween(Double value1, Double value2) {
            addCriterion("nh3_temf not between", value1, value2, "nh3Temf");
            return (Criteria) this;
        }

        public Criteria andNh3TemfunitIsNull() {
            addCriterion("nh3_temfunit is null");
            return (Criteria) this;
        }

        public Criteria andNh3TemfunitIsNotNull() {
            addCriterion("nh3_temfunit is not null");
            return (Criteria) this;
        }

        public Criteria andNh3TemfunitEqualTo(String value) {
            addCriterion("nh3_temfunit =", value, "nh3Temfunit");
            return (Criteria) this;
        }

        public Criteria andNh3TemfunitNotEqualTo(String value) {
            addCriterion("nh3_temfunit <>", value, "nh3Temfunit");
            return (Criteria) this;
        }

        public Criteria andNh3TemfunitGreaterThan(String value) {
            addCriterion("nh3_temfunit >", value, "nh3Temfunit");
            return (Criteria) this;
        }

        public Criteria andNh3TemfunitGreaterThanOrEqualTo(String value) {
            addCriterion("nh3_temfunit >=", value, "nh3Temfunit");
            return (Criteria) this;
        }

        public Criteria andNh3TemfunitLessThan(String value) {
            addCriterion("nh3_temfunit <", value, "nh3Temfunit");
            return (Criteria) this;
        }

        public Criteria andNh3TemfunitLessThanOrEqualTo(String value) {
            addCriterion("nh3_temfunit <=", value, "nh3Temfunit");
            return (Criteria) this;
        }

        public Criteria andNh3TemfunitLike(String value) {
            addCriterion("nh3_temfunit like", value, "nh3Temfunit");
            return (Criteria) this;
        }

        public Criteria andNh3TemfunitNotLike(String value) {
            addCriterion("nh3_temfunit not like", value, "nh3Temfunit");
            return (Criteria) this;
        }

        public Criteria andNh3TemfunitIn(List<String> values) {
            addCriterion("nh3_temfunit in", values, "nh3Temfunit");
            return (Criteria) this;
        }

        public Criteria andNh3TemfunitNotIn(List<String> values) {
            addCriterion("nh3_temfunit not in", values, "nh3Temfunit");
            return (Criteria) this;
        }

        public Criteria andNh3TemfunitBetween(String value1, String value2) {
            addCriterion("nh3_temfunit between", value1, value2, "nh3Temfunit");
            return (Criteria) this;
        }

        public Criteria andNh3TemfunitNotBetween(String value1, String value2) {
            addCriterion("nh3_temfunit not between", value1, value2, "nh3Temfunit");
            return (Criteria) this;
        }

        public Criteria andVocTemfIsNull() {
            addCriterion("voc_temf is null");
            return (Criteria) this;
        }

        public Criteria andVocTemfIsNotNull() {
            addCriterion("voc_temf is not null");
            return (Criteria) this;
        }

        public Criteria andVocTemfEqualTo(Double value) {
            addCriterion("voc_temf =", value, "vocTemf");
            return (Criteria) this;
        }

        public Criteria andVocTemfNotEqualTo(Double value) {
            addCriterion("voc_temf <>", value, "vocTemf");
            return (Criteria) this;
        }

        public Criteria andVocTemfGreaterThan(Double value) {
            addCriterion("voc_temf >", value, "vocTemf");
            return (Criteria) this;
        }

        public Criteria andVocTemfGreaterThanOrEqualTo(Double value) {
            addCriterion("voc_temf >=", value, "vocTemf");
            return (Criteria) this;
        }

        public Criteria andVocTemfLessThan(Double value) {
            addCriterion("voc_temf <", value, "vocTemf");
            return (Criteria) this;
        }

        public Criteria andVocTemfLessThanOrEqualTo(Double value) {
            addCriterion("voc_temf <=", value, "vocTemf");
            return (Criteria) this;
        }

        public Criteria andVocTemfIn(List<Double> values) {
            addCriterion("voc_temf in", values, "vocTemf");
            return (Criteria) this;
        }

        public Criteria andVocTemfNotIn(List<Double> values) {
            addCriterion("voc_temf not in", values, "vocTemf");
            return (Criteria) this;
        }

        public Criteria andVocTemfBetween(Double value1, Double value2) {
            addCriterion("voc_temf between", value1, value2, "vocTemf");
            return (Criteria) this;
        }

        public Criteria andVocTemfNotBetween(Double value1, Double value2) {
            addCriterion("voc_temf not between", value1, value2, "vocTemf");
            return (Criteria) this;
        }

        public Criteria andVocTemfunitIsNull() {
            addCriterion("voc_temfunit is null");
            return (Criteria) this;
        }

        public Criteria andVocTemfunitIsNotNull() {
            addCriterion("voc_temfunit is not null");
            return (Criteria) this;
        }

        public Criteria andVocTemfunitEqualTo(String value) {
            addCriterion("voc_temfunit =", value, "vocTemfunit");
            return (Criteria) this;
        }

        public Criteria andVocTemfunitNotEqualTo(String value) {
            addCriterion("voc_temfunit <>", value, "vocTemfunit");
            return (Criteria) this;
        }

        public Criteria andVocTemfunitGreaterThan(String value) {
            addCriterion("voc_temfunit >", value, "vocTemfunit");
            return (Criteria) this;
        }

        public Criteria andVocTemfunitGreaterThanOrEqualTo(String value) {
            addCriterion("voc_temfunit >=", value, "vocTemfunit");
            return (Criteria) this;
        }

        public Criteria andVocTemfunitLessThan(String value) {
            addCriterion("voc_temfunit <", value, "vocTemfunit");
            return (Criteria) this;
        }

        public Criteria andVocTemfunitLessThanOrEqualTo(String value) {
            addCriterion("voc_temfunit <=", value, "vocTemfunit");
            return (Criteria) this;
        }

        public Criteria andVocTemfunitLike(String value) {
            addCriterion("voc_temfunit like", value, "vocTemfunit");
            return (Criteria) this;
        }

        public Criteria andVocTemfunitNotLike(String value) {
            addCriterion("voc_temfunit not like", value, "vocTemfunit");
            return (Criteria) this;
        }

        public Criteria andVocTemfunitIn(List<String> values) {
            addCriterion("voc_temfunit in", values, "vocTemfunit");
            return (Criteria) this;
        }

        public Criteria andVocTemfunitNotIn(List<String> values) {
            addCriterion("voc_temfunit not in", values, "vocTemfunit");
            return (Criteria) this;
        }

        public Criteria andVocTemfunitBetween(String value1, String value2) {
            addCriterion("voc_temfunit between", value1, value2, "vocTemfunit");
            return (Criteria) this;
        }

        public Criteria andVocTemfunitNotBetween(String value1, String value2) {
            addCriterion("voc_temfunit not between", value1, value2, "vocTemfunit");
            return (Criteria) this;
        }

        public Criteria andNh3PemfIsNull() {
            addCriterion("nh3_pemf is null");
            return (Criteria) this;
        }

        public Criteria andNh3PemfIsNotNull() {
            addCriterion("nh3_pemf is not null");
            return (Criteria) this;
        }

        public Criteria andNh3PemfEqualTo(Double value) {
            addCriterion("nh3_pemf =", value, "nh3Pemf");
            return (Criteria) this;
        }

        public Criteria andNh3PemfNotEqualTo(Double value) {
            addCriterion("nh3_pemf <>", value, "nh3Pemf");
            return (Criteria) this;
        }

        public Criteria andNh3PemfGreaterThan(Double value) {
            addCriterion("nh3_pemf >", value, "nh3Pemf");
            return (Criteria) this;
        }

        public Criteria andNh3PemfGreaterThanOrEqualTo(Double value) {
            addCriterion("nh3_pemf >=", value, "nh3Pemf");
            return (Criteria) this;
        }

        public Criteria andNh3PemfLessThan(Double value) {
            addCriterion("nh3_pemf <", value, "nh3Pemf");
            return (Criteria) this;
        }

        public Criteria andNh3PemfLessThanOrEqualTo(Double value) {
            addCriterion("nh3_pemf <=", value, "nh3Pemf");
            return (Criteria) this;
        }

        public Criteria andNh3PemfIn(List<Double> values) {
            addCriterion("nh3_pemf in", values, "nh3Pemf");
            return (Criteria) this;
        }

        public Criteria andNh3PemfNotIn(List<Double> values) {
            addCriterion("nh3_pemf not in", values, "nh3Pemf");
            return (Criteria) this;
        }

        public Criteria andNh3PemfBetween(Double value1, Double value2) {
            addCriterion("nh3_pemf between", value1, value2, "nh3Pemf");
            return (Criteria) this;
        }

        public Criteria andNh3PemfNotBetween(Double value1, Double value2) {
            addCriterion("nh3_pemf not between", value1, value2, "nh3Pemf");
            return (Criteria) this;
        }

        public Criteria andNh3PemfunitIsNull() {
            addCriterion("nh3_pemfunit is null");
            return (Criteria) this;
        }

        public Criteria andNh3PemfunitIsNotNull() {
            addCriterion("nh3_pemfunit is not null");
            return (Criteria) this;
        }

        public Criteria andNh3PemfunitEqualTo(String value) {
            addCriterion("nh3_pemfunit =", value, "nh3Pemfunit");
            return (Criteria) this;
        }

        public Criteria andNh3PemfunitNotEqualTo(String value) {
            addCriterion("nh3_pemfunit <>", value, "nh3Pemfunit");
            return (Criteria) this;
        }

        public Criteria andNh3PemfunitGreaterThan(String value) {
            addCriterion("nh3_pemfunit >", value, "nh3Pemfunit");
            return (Criteria) this;
        }

        public Criteria andNh3PemfunitGreaterThanOrEqualTo(String value) {
            addCriterion("nh3_pemfunit >=", value, "nh3Pemfunit");
            return (Criteria) this;
        }

        public Criteria andNh3PemfunitLessThan(String value) {
            addCriterion("nh3_pemfunit <", value, "nh3Pemfunit");
            return (Criteria) this;
        }

        public Criteria andNh3PemfunitLessThanOrEqualTo(String value) {
            addCriterion("nh3_pemfunit <=", value, "nh3Pemfunit");
            return (Criteria) this;
        }

        public Criteria andNh3PemfunitLike(String value) {
            addCriterion("nh3_pemfunit like", value, "nh3Pemfunit");
            return (Criteria) this;
        }

        public Criteria andNh3PemfunitNotLike(String value) {
            addCriterion("nh3_pemfunit not like", value, "nh3Pemfunit");
            return (Criteria) this;
        }

        public Criteria andNh3PemfunitIn(List<String> values) {
            addCriterion("nh3_pemfunit in", values, "nh3Pemfunit");
            return (Criteria) this;
        }

        public Criteria andNh3PemfunitNotIn(List<String> values) {
            addCriterion("nh3_pemfunit not in", values, "nh3Pemfunit");
            return (Criteria) this;
        }

        public Criteria andNh3PemfunitBetween(String value1, String value2) {
            addCriterion("nh3_pemfunit between", value1, value2, "nh3Pemfunit");
            return (Criteria) this;
        }

        public Criteria andNh3PemfunitNotBetween(String value1, String value2) {
            addCriterion("nh3_pemfunit not between", value1, value2, "nh3Pemfunit");
            return (Criteria) this;
        }

        public Criteria andVocPemfIsNull() {
            addCriterion("voc_pemf is null");
            return (Criteria) this;
        }

        public Criteria andVocPemfIsNotNull() {
            addCriterion("voc_pemf is not null");
            return (Criteria) this;
        }

        public Criteria andVocPemfEqualTo(Double value) {
            addCriterion("voc_pemf =", value, "vocPemf");
            return (Criteria) this;
        }

        public Criteria andVocPemfNotEqualTo(Double value) {
            addCriterion("voc_pemf <>", value, "vocPemf");
            return (Criteria) this;
        }

        public Criteria andVocPemfGreaterThan(Double value) {
            addCriterion("voc_pemf >", value, "vocPemf");
            return (Criteria) this;
        }

        public Criteria andVocPemfGreaterThanOrEqualTo(Double value) {
            addCriterion("voc_pemf >=", value, "vocPemf");
            return (Criteria) this;
        }

        public Criteria andVocPemfLessThan(Double value) {
            addCriterion("voc_pemf <", value, "vocPemf");
            return (Criteria) this;
        }

        public Criteria andVocPemfLessThanOrEqualTo(Double value) {
            addCriterion("voc_pemf <=", value, "vocPemf");
            return (Criteria) this;
        }

        public Criteria andVocPemfIn(List<Double> values) {
            addCriterion("voc_pemf in", values, "vocPemf");
            return (Criteria) this;
        }

        public Criteria andVocPemfNotIn(List<Double> values) {
            addCriterion("voc_pemf not in", values, "vocPemf");
            return (Criteria) this;
        }

        public Criteria andVocPemfBetween(Double value1, Double value2) {
            addCriterion("voc_pemf between", value1, value2, "vocPemf");
            return (Criteria) this;
        }

        public Criteria andVocPemfNotBetween(Double value1, Double value2) {
            addCriterion("voc_pemf not between", value1, value2, "vocPemf");
            return (Criteria) this;
        }

        public Criteria andVocPemfunitIsNull() {
            addCriterion("voc_pemfunit is null");
            return (Criteria) this;
        }

        public Criteria andVocPemfunitIsNotNull() {
            addCriterion("voc_pemfunit is not null");
            return (Criteria) this;
        }

        public Criteria andVocPemfunitEqualTo(String value) {
            addCriterion("voc_pemfunit =", value, "vocPemfunit");
            return (Criteria) this;
        }

        public Criteria andVocPemfunitNotEqualTo(String value) {
            addCriterion("voc_pemfunit <>", value, "vocPemfunit");
            return (Criteria) this;
        }

        public Criteria andVocPemfunitGreaterThan(String value) {
            addCriterion("voc_pemfunit >", value, "vocPemfunit");
            return (Criteria) this;
        }

        public Criteria andVocPemfunitGreaterThanOrEqualTo(String value) {
            addCriterion("voc_pemfunit >=", value, "vocPemfunit");
            return (Criteria) this;
        }

        public Criteria andVocPemfunitLessThan(String value) {
            addCriterion("voc_pemfunit <", value, "vocPemfunit");
            return (Criteria) this;
        }

        public Criteria andVocPemfunitLessThanOrEqualTo(String value) {
            addCriterion("voc_pemfunit <=", value, "vocPemfunit");
            return (Criteria) this;
        }

        public Criteria andVocPemfunitLike(String value) {
            addCriterion("voc_pemfunit like", value, "vocPemfunit");
            return (Criteria) this;
        }

        public Criteria andVocPemfunitNotLike(String value) {
            addCriterion("voc_pemfunit not like", value, "vocPemfunit");
            return (Criteria) this;
        }

        public Criteria andVocPemfunitIn(List<String> values) {
            addCriterion("voc_pemfunit in", values, "vocPemfunit");
            return (Criteria) this;
        }

        public Criteria andVocPemfunitNotIn(List<String> values) {
            addCriterion("voc_pemfunit not in", values, "vocPemfunit");
            return (Criteria) this;
        }

        public Criteria andVocPemfunitBetween(String value1, String value2) {
            addCriterion("voc_pemfunit between", value1, value2, "vocPemfunit");
            return (Criteria) this;
        }

        public Criteria andVocPemfunitNotBetween(String value1, String value2) {
            addCriterion("voc_pemfunit not between", value1, value2, "vocPemfunit");
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

        public Criteria andNh3EmiunitIsNull() {
            addCriterion("nh3_emiunit is null");
            return (Criteria) this;
        }

        public Criteria andNh3EmiunitIsNotNull() {
            addCriterion("nh3_emiunit is not null");
            return (Criteria) this;
        }

        public Criteria andNh3EmiunitEqualTo(String value) {
            addCriterion("nh3_emiunit =", value, "nh3Emiunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmiunitNotEqualTo(String value) {
            addCriterion("nh3_emiunit <>", value, "nh3Emiunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmiunitGreaterThan(String value) {
            addCriterion("nh3_emiunit >", value, "nh3Emiunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmiunitGreaterThanOrEqualTo(String value) {
            addCriterion("nh3_emiunit >=", value, "nh3Emiunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmiunitLessThan(String value) {
            addCriterion("nh3_emiunit <", value, "nh3Emiunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmiunitLessThanOrEqualTo(String value) {
            addCriterion("nh3_emiunit <=", value, "nh3Emiunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmiunitLike(String value) {
            addCriterion("nh3_emiunit like", value, "nh3Emiunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmiunitNotLike(String value) {
            addCriterion("nh3_emiunit not like", value, "nh3Emiunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmiunitIn(List<String> values) {
            addCriterion("nh3_emiunit in", values, "nh3Emiunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmiunitNotIn(List<String> values) {
            addCriterion("nh3_emiunit not in", values, "nh3Emiunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmiunitBetween(String value1, String value2) {
            addCriterion("nh3_emiunit between", value1, value2, "nh3Emiunit");
            return (Criteria) this;
        }

        public Criteria andNh3EmiunitNotBetween(String value1, String value2) {
            addCriterion("nh3_emiunit not between", value1, value2, "nh3Emiunit");
            return (Criteria) this;
        }

        public Criteria andVocEmissionIsNull() {
            addCriterion("voc_emission is null");
            return (Criteria) this;
        }

        public Criteria andVocEmissionIsNotNull() {
            addCriterion("voc_emission is not null");
            return (Criteria) this;
        }

        public Criteria andVocEmissionEqualTo(Double value) {
            addCriterion("voc_emission =", value, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionNotEqualTo(Double value) {
            addCriterion("voc_emission <>", value, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionGreaterThan(Double value) {
            addCriterion("voc_emission >", value, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("voc_emission >=", value, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionLessThan(Double value) {
            addCriterion("voc_emission <", value, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionLessThanOrEqualTo(Double value) {
            addCriterion("voc_emission <=", value, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionIn(List<Double> values) {
            addCriterion("voc_emission in", values, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionNotIn(List<Double> values) {
            addCriterion("voc_emission not in", values, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionBetween(Double value1, Double value2) {
            addCriterion("voc_emission between", value1, value2, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmissionNotBetween(Double value1, Double value2) {
            addCriterion("voc_emission not between", value1, value2, "vocEmission");
            return (Criteria) this;
        }

        public Criteria andVocEmiunitIsNull() {
            addCriterion("voc_emiunit is null");
            return (Criteria) this;
        }

        public Criteria andVocEmiunitIsNotNull() {
            addCriterion("voc_emiunit is not null");
            return (Criteria) this;
        }

        public Criteria andVocEmiunitEqualTo(String value) {
            addCriterion("voc_emiunit =", value, "vocEmiunit");
            return (Criteria) this;
        }

        public Criteria andVocEmiunitNotEqualTo(String value) {
            addCriterion("voc_emiunit <>", value, "vocEmiunit");
            return (Criteria) this;
        }

        public Criteria andVocEmiunitGreaterThan(String value) {
            addCriterion("voc_emiunit >", value, "vocEmiunit");
            return (Criteria) this;
        }

        public Criteria andVocEmiunitGreaterThanOrEqualTo(String value) {
            addCriterion("voc_emiunit >=", value, "vocEmiunit");
            return (Criteria) this;
        }

        public Criteria andVocEmiunitLessThan(String value) {
            addCriterion("voc_emiunit <", value, "vocEmiunit");
            return (Criteria) this;
        }

        public Criteria andVocEmiunitLessThanOrEqualTo(String value) {
            addCriterion("voc_emiunit <=", value, "vocEmiunit");
            return (Criteria) this;
        }

        public Criteria andVocEmiunitLike(String value) {
            addCriterion("voc_emiunit like", value, "vocEmiunit");
            return (Criteria) this;
        }

        public Criteria andVocEmiunitNotLike(String value) {
            addCriterion("voc_emiunit not like", value, "vocEmiunit");
            return (Criteria) this;
        }

        public Criteria andVocEmiunitIn(List<String> values) {
            addCriterion("voc_emiunit in", values, "vocEmiunit");
            return (Criteria) this;
        }

        public Criteria andVocEmiunitNotIn(List<String> values) {
            addCriterion("voc_emiunit not in", values, "vocEmiunit");
            return (Criteria) this;
        }

        public Criteria andVocEmiunitBetween(String value1, String value2) {
            addCriterion("voc_emiunit between", value1, value2, "vocEmiunit");
            return (Criteria) this;
        }

        public Criteria andVocEmiunitNotBetween(String value1, String value2) {
            addCriterion("voc_emiunit not between", value1, value2, "vocEmiunit");
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