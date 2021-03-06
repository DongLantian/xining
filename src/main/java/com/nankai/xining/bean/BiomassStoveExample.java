package com.nankai.xining.bean;

import java.util.ArrayList;
import java.util.List;

public class BiomassStoveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BiomassStoveExample() {
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

        public Criteria andCountyIdIsNull() {
            addCriterion("county_id is null");
            return (Criteria) this;
        }

        public Criteria andCountyIdIsNotNull() {
            addCriterion("county_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountyIdEqualTo(String value) {
            addCriterion("county_id =", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotEqualTo(String value) {
            addCriterion("county_id <>", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdGreaterThan(String value) {
            addCriterion("county_id >", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdGreaterThanOrEqualTo(String value) {
            addCriterion("county_id >=", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLessThan(String value) {
            addCriterion("county_id <", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLessThanOrEqualTo(String value) {
            addCriterion("county_id <=", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLike(String value) {
            addCriterion("county_id like", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotLike(String value) {
            addCriterion("county_id not like", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdIn(List<String> values) {
            addCriterion("county_id in", values, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotIn(List<String> values) {
            addCriterion("county_id not in", values, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdBetween(String value1, String value2) {
            addCriterion("county_id between", value1, value2, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotBetween(String value1, String value2) {
            addCriterion("county_id not between", value1, value2, "countyId");
            return (Criteria) this;
        }

        public Criteria andStoveTypeIsNull() {
            addCriterion("stove_type is null");
            return (Criteria) this;
        }

        public Criteria andStoveTypeIsNotNull() {
            addCriterion("stove_type is not null");
            return (Criteria) this;
        }

        public Criteria andStoveTypeEqualTo(String value) {
            addCriterion("stove_type =", value, "stoveType");
            return (Criteria) this;
        }

        public Criteria andStoveTypeNotEqualTo(String value) {
            addCriterion("stove_type <>", value, "stoveType");
            return (Criteria) this;
        }

        public Criteria andStoveTypeGreaterThan(String value) {
            addCriterion("stove_type >", value, "stoveType");
            return (Criteria) this;
        }

        public Criteria andStoveTypeGreaterThanOrEqualTo(String value) {
            addCriterion("stove_type >=", value, "stoveType");
            return (Criteria) this;
        }

        public Criteria andStoveTypeLessThan(String value) {
            addCriterion("stove_type <", value, "stoveType");
            return (Criteria) this;
        }

        public Criteria andStoveTypeLessThanOrEqualTo(String value) {
            addCriterion("stove_type <=", value, "stoveType");
            return (Criteria) this;
        }

        public Criteria andStoveTypeLike(String value) {
            addCriterion("stove_type like", value, "stoveType");
            return (Criteria) this;
        }

        public Criteria andStoveTypeNotLike(String value) {
            addCriterion("stove_type not like", value, "stoveType");
            return (Criteria) this;
        }

        public Criteria andStoveTypeIn(List<String> values) {
            addCriterion("stove_type in", values, "stoveType");
            return (Criteria) this;
        }

        public Criteria andStoveTypeNotIn(List<String> values) {
            addCriterion("stove_type not in", values, "stoveType");
            return (Criteria) this;
        }

        public Criteria andStoveTypeBetween(String value1, String value2) {
            addCriterion("stove_type between", value1, value2, "stoveType");
            return (Criteria) this;
        }

        public Criteria andStoveTypeNotBetween(String value1, String value2) {
            addCriterion("stove_type not between", value1, value2, "stoveType");
            return (Criteria) this;
        }

        public Criteria andCropTypeIsNull() {
            addCriterion("CROP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCropTypeIsNotNull() {
            addCriterion("CROP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCropTypeEqualTo(String value) {
            addCriterion("CROP_TYPE =", value, "cropType");
            return (Criteria) this;
        }

        public Criteria andCropTypeNotEqualTo(String value) {
            addCriterion("CROP_TYPE <>", value, "cropType");
            return (Criteria) this;
        }

        public Criteria andCropTypeGreaterThan(String value) {
            addCriterion("CROP_TYPE >", value, "cropType");
            return (Criteria) this;
        }

        public Criteria andCropTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CROP_TYPE >=", value, "cropType");
            return (Criteria) this;
        }

        public Criteria andCropTypeLessThan(String value) {
            addCriterion("CROP_TYPE <", value, "cropType");
            return (Criteria) this;
        }

        public Criteria andCropTypeLessThanOrEqualTo(String value) {
            addCriterion("CROP_TYPE <=", value, "cropType");
            return (Criteria) this;
        }

        public Criteria andCropTypeLike(String value) {
            addCriterion("CROP_TYPE like", value, "cropType");
            return (Criteria) this;
        }

        public Criteria andCropTypeNotLike(String value) {
            addCriterion("CROP_TYPE not like", value, "cropType");
            return (Criteria) this;
        }

        public Criteria andCropTypeIn(List<String> values) {
            addCriterion("CROP_TYPE in", values, "cropType");
            return (Criteria) this;
        }

        public Criteria andCropTypeNotIn(List<String> values) {
            addCriterion("CROP_TYPE not in", values, "cropType");
            return (Criteria) this;
        }

        public Criteria andCropTypeBetween(String value1, String value2) {
            addCriterion("CROP_TYPE between", value1, value2, "cropType");
            return (Criteria) this;
        }

        public Criteria andCropTypeNotBetween(String value1, String value2) {
            addCriterion("CROP_TYPE not between", value1, value2, "cropType");
            return (Criteria) this;
        }

        public Criteria andCropYieldIsNull() {
            addCriterion("CROP_YIELD is null");
            return (Criteria) this;
        }

        public Criteria andCropYieldIsNotNull() {
            addCriterion("CROP_YIELD is not null");
            return (Criteria) this;
        }

        public Criteria andCropYieldEqualTo(Double value) {
            addCriterion("CROP_YIELD =", value, "cropYield");
            return (Criteria) this;
        }

        public Criteria andCropYieldNotEqualTo(Double value) {
            addCriterion("CROP_YIELD <>", value, "cropYield");
            return (Criteria) this;
        }

        public Criteria andCropYieldGreaterThan(Double value) {
            addCriterion("CROP_YIELD >", value, "cropYield");
            return (Criteria) this;
        }

        public Criteria andCropYieldGreaterThanOrEqualTo(Double value) {
            addCriterion("CROP_YIELD >=", value, "cropYield");
            return (Criteria) this;
        }

        public Criteria andCropYieldLessThan(Double value) {
            addCriterion("CROP_YIELD <", value, "cropYield");
            return (Criteria) this;
        }

        public Criteria andCropYieldLessThanOrEqualTo(Double value) {
            addCriterion("CROP_YIELD <=", value, "cropYield");
            return (Criteria) this;
        }

        public Criteria andCropYieldIn(List<Double> values) {
            addCriterion("CROP_YIELD in", values, "cropYield");
            return (Criteria) this;
        }

        public Criteria andCropYieldNotIn(List<Double> values) {
            addCriterion("CROP_YIELD not in", values, "cropYield");
            return (Criteria) this;
        }

        public Criteria andCropYieldBetween(Double value1, Double value2) {
            addCriterion("CROP_YIELD between", value1, value2, "cropYield");
            return (Criteria) this;
        }

        public Criteria andCropYieldNotBetween(Double value1, Double value2) {
            addCriterion("CROP_YIELD not between", value1, value2, "cropYield");
            return (Criteria) this;
        }

        public Criteria andSccCodeIsNull() {
            addCriterion("scc_code is null");
            return (Criteria) this;
        }

        public Criteria andSccCodeIsNotNull() {
            addCriterion("scc_code is not null");
            return (Criteria) this;
        }

        public Criteria andSccCodeEqualTo(String value) {
            addCriterion("scc_code =", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeNotEqualTo(String value) {
            addCriterion("scc_code <>", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeGreaterThan(String value) {
            addCriterion("scc_code >", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeGreaterThanOrEqualTo(String value) {
            addCriterion("scc_code >=", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeLessThan(String value) {
            addCriterion("scc_code <", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeLessThanOrEqualTo(String value) {
            addCriterion("scc_code <=", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeLike(String value) {
            addCriterion("scc_code like", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeNotLike(String value) {
            addCriterion("scc_code not like", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeIn(List<String> values) {
            addCriterion("scc_code in", values, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeNotIn(List<String> values) {
            addCriterion("scc_code not in", values, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeBetween(String value1, String value2) {
            addCriterion("scc_code between", value1, value2, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeNotBetween(String value1, String value2) {
            addCriterion("scc_code not between", value1, value2, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSourceDescripIsNull() {
            addCriterion("source_descrip is null");
            return (Criteria) this;
        }

        public Criteria andSourceDescripIsNotNull() {
            addCriterion("source_descrip is not null");
            return (Criteria) this;
        }

        public Criteria andSourceDescripEqualTo(String value) {
            addCriterion("source_descrip =", value, "sourceDescrip");
            return (Criteria) this;
        }

        public Criteria andSourceDescripNotEqualTo(String value) {
            addCriterion("source_descrip <>", value, "sourceDescrip");
            return (Criteria) this;
        }

        public Criteria andSourceDescripGreaterThan(String value) {
            addCriterion("source_descrip >", value, "sourceDescrip");
            return (Criteria) this;
        }

        public Criteria andSourceDescripGreaterThanOrEqualTo(String value) {
            addCriterion("source_descrip >=", value, "sourceDescrip");
            return (Criteria) this;
        }

        public Criteria andSourceDescripLessThan(String value) {
            addCriterion("source_descrip <", value, "sourceDescrip");
            return (Criteria) this;
        }

        public Criteria andSourceDescripLessThanOrEqualTo(String value) {
            addCriterion("source_descrip <=", value, "sourceDescrip");
            return (Criteria) this;
        }

        public Criteria andSourceDescripLike(String value) {
            addCriterion("source_descrip like", value, "sourceDescrip");
            return (Criteria) this;
        }

        public Criteria andSourceDescripNotLike(String value) {
            addCriterion("source_descrip not like", value, "sourceDescrip");
            return (Criteria) this;
        }

        public Criteria andSourceDescripIn(List<String> values) {
            addCriterion("source_descrip in", values, "sourceDescrip");
            return (Criteria) this;
        }

        public Criteria andSourceDescripNotIn(List<String> values) {
            addCriterion("source_descrip not in", values, "sourceDescrip");
            return (Criteria) this;
        }

        public Criteria andSourceDescripBetween(String value1, String value2) {
            addCriterion("source_descrip between", value1, value2, "sourceDescrip");
            return (Criteria) this;
        }

        public Criteria andSourceDescripNotBetween(String value1, String value2) {
            addCriterion("source_descrip not between", value1, value2, "sourceDescrip");
            return (Criteria) this;
        }

        public Criteria andGrassValleyRatioIsNull() {
            addCriterion("GRASS_VALLEY_RATIO is null");
            return (Criteria) this;
        }

        public Criteria andGrassValleyRatioIsNotNull() {
            addCriterion("GRASS_VALLEY_RATIO is not null");
            return (Criteria) this;
        }

        public Criteria andGrassValleyRatioEqualTo(Double value) {
            addCriterion("GRASS_VALLEY_RATIO =", value, "grassValleyRatio");
            return (Criteria) this;
        }

        public Criteria andGrassValleyRatioNotEqualTo(Double value) {
            addCriterion("GRASS_VALLEY_RATIO <>", value, "grassValleyRatio");
            return (Criteria) this;
        }

        public Criteria andGrassValleyRatioGreaterThan(Double value) {
            addCriterion("GRASS_VALLEY_RATIO >", value, "grassValleyRatio");
            return (Criteria) this;
        }

        public Criteria andGrassValleyRatioGreaterThanOrEqualTo(Double value) {
            addCriterion("GRASS_VALLEY_RATIO >=", value, "grassValleyRatio");
            return (Criteria) this;
        }

        public Criteria andGrassValleyRatioLessThan(Double value) {
            addCriterion("GRASS_VALLEY_RATIO <", value, "grassValleyRatio");
            return (Criteria) this;
        }

        public Criteria andGrassValleyRatioLessThanOrEqualTo(Double value) {
            addCriterion("GRASS_VALLEY_RATIO <=", value, "grassValleyRatio");
            return (Criteria) this;
        }

        public Criteria andGrassValleyRatioIn(List<Double> values) {
            addCriterion("GRASS_VALLEY_RATIO in", values, "grassValleyRatio");
            return (Criteria) this;
        }

        public Criteria andGrassValleyRatioNotIn(List<Double> values) {
            addCriterion("GRASS_VALLEY_RATIO not in", values, "grassValleyRatio");
            return (Criteria) this;
        }

        public Criteria andGrassValleyRatioBetween(Double value1, Double value2) {
            addCriterion("GRASS_VALLEY_RATIO between", value1, value2, "grassValleyRatio");
            return (Criteria) this;
        }

        public Criteria andGrassValleyRatioNotBetween(Double value1, Double value2) {
            addCriterion("GRASS_VALLEY_RATIO not between", value1, value2, "grassValleyRatio");
            return (Criteria) this;
        }

        public Criteria andBurningRatioStoveIsNull() {
            addCriterion("BURNING_RATIO_stove is null");
            return (Criteria) this;
        }

        public Criteria andBurningRatioStoveIsNotNull() {
            addCriterion("BURNING_RATIO_stove is not null");
            return (Criteria) this;
        }

        public Criteria andBurningRatioStoveEqualTo(Double value) {
            addCriterion("BURNING_RATIO_stove =", value, "burningRatioStove");
            return (Criteria) this;
        }

        public Criteria andBurningRatioStoveNotEqualTo(Double value) {
            addCriterion("BURNING_RATIO_stove <>", value, "burningRatioStove");
            return (Criteria) this;
        }

        public Criteria andBurningRatioStoveGreaterThan(Double value) {
            addCriterion("BURNING_RATIO_stove >", value, "burningRatioStove");
            return (Criteria) this;
        }

        public Criteria andBurningRatioStoveGreaterThanOrEqualTo(Double value) {
            addCriterion("BURNING_RATIO_stove >=", value, "burningRatioStove");
            return (Criteria) this;
        }

        public Criteria andBurningRatioStoveLessThan(Double value) {
            addCriterion("BURNING_RATIO_stove <", value, "burningRatioStove");
            return (Criteria) this;
        }

        public Criteria andBurningRatioStoveLessThanOrEqualTo(Double value) {
            addCriterion("BURNING_RATIO_stove <=", value, "burningRatioStove");
            return (Criteria) this;
        }

        public Criteria andBurningRatioStoveIn(List<Double> values) {
            addCriterion("BURNING_RATIO_stove in", values, "burningRatioStove");
            return (Criteria) this;
        }

        public Criteria andBurningRatioStoveNotIn(List<Double> values) {
            addCriterion("BURNING_RATIO_stove not in", values, "burningRatioStove");
            return (Criteria) this;
        }

        public Criteria andBurningRatioStoveBetween(Double value1, Double value2) {
            addCriterion("BURNING_RATIO_stove between", value1, value2, "burningRatioStove");
            return (Criteria) this;
        }

        public Criteria andBurningRatioStoveNotBetween(Double value1, Double value2) {
            addCriterion("BURNING_RATIO_stove not between", value1, value2, "burningRatioStove");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionIsNull() {
            addCriterion("pm10_emission is null");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionIsNotNull() {
            addCriterion("pm10_emission is not null");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionEqualTo(Double value) {
            addCriterion("pm10_emission =", value, "pm10Emission");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionNotEqualTo(Double value) {
            addCriterion("pm10_emission <>", value, "pm10Emission");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionGreaterThan(Double value) {
            addCriterion("pm10_emission >", value, "pm10Emission");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("pm10_emission >=", value, "pm10Emission");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionLessThan(Double value) {
            addCriterion("pm10_emission <", value, "pm10Emission");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionLessThanOrEqualTo(Double value) {
            addCriterion("pm10_emission <=", value, "pm10Emission");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionIn(List<Double> values) {
            addCriterion("pm10_emission in", values, "pm10Emission");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionNotIn(List<Double> values) {
            addCriterion("pm10_emission not in", values, "pm10Emission");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionBetween(Double value1, Double value2) {
            addCriterion("pm10_emission between", value1, value2, "pm10Emission");
            return (Criteria) this;
        }

        public Criteria andPm10EmissionNotBetween(Double value1, Double value2) {
            addCriterion("pm10_emission not between", value1, value2, "pm10Emission");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionIsNull() {
            addCriterion("pm25_emission is null");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionIsNotNull() {
            addCriterion("pm25_emission is not null");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionEqualTo(Double value) {
            addCriterion("pm25_emission =", value, "pm25Emission");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionNotEqualTo(Double value) {
            addCriterion("pm25_emission <>", value, "pm25Emission");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionGreaterThan(Double value) {
            addCriterion("pm25_emission >", value, "pm25Emission");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("pm25_emission >=", value, "pm25Emission");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionLessThan(Double value) {
            addCriterion("pm25_emission <", value, "pm25Emission");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionLessThanOrEqualTo(Double value) {
            addCriterion("pm25_emission <=", value, "pm25Emission");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionIn(List<Double> values) {
            addCriterion("pm25_emission in", values, "pm25Emission");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionNotIn(List<Double> values) {
            addCriterion("pm25_emission not in", values, "pm25Emission");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionBetween(Double value1, Double value2) {
            addCriterion("pm25_emission between", value1, value2, "pm25Emission");
            return (Criteria) this;
        }

        public Criteria andPm25EmissionNotBetween(Double value1, Double value2) {
            addCriterion("pm25_emission not between", value1, value2, "pm25Emission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionIsNull() {
            addCriterion("co_emission is null");
            return (Criteria) this;
        }

        public Criteria andCoEmissionIsNotNull() {
            addCriterion("co_emission is not null");
            return (Criteria) this;
        }

        public Criteria andCoEmissionEqualTo(Double value) {
            addCriterion("co_emission =", value, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionNotEqualTo(Double value) {
            addCriterion("co_emission <>", value, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionGreaterThan(Double value) {
            addCriterion("co_emission >", value, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("co_emission >=", value, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionLessThan(Double value) {
            addCriterion("co_emission <", value, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionLessThanOrEqualTo(Double value) {
            addCriterion("co_emission <=", value, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionIn(List<Double> values) {
            addCriterion("co_emission in", values, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionNotIn(List<Double> values) {
            addCriterion("co_emission not in", values, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionBetween(Double value1, Double value2) {
            addCriterion("co_emission between", value1, value2, "coEmission");
            return (Criteria) this;
        }

        public Criteria andCoEmissionNotBetween(Double value1, Double value2) {
            addCriterion("co_emission not between", value1, value2, "coEmission");
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

        public Criteria andPmEmissionIsNull() {
            addCriterion("pm_emission is null");
            return (Criteria) this;
        }

        public Criteria andPmEmissionIsNotNull() {
            addCriterion("pm_emission is not null");
            return (Criteria) this;
        }

        public Criteria andPmEmissionEqualTo(Double value) {
            addCriterion("pm_emission =", value, "pmEmission");
            return (Criteria) this;
        }

        public Criteria andPmEmissionNotEqualTo(Double value) {
            addCriterion("pm_emission <>", value, "pmEmission");
            return (Criteria) this;
        }

        public Criteria andPmEmissionGreaterThan(Double value) {
            addCriterion("pm_emission >", value, "pmEmission");
            return (Criteria) this;
        }

        public Criteria andPmEmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("pm_emission >=", value, "pmEmission");
            return (Criteria) this;
        }

        public Criteria andPmEmissionLessThan(Double value) {
            addCriterion("pm_emission <", value, "pmEmission");
            return (Criteria) this;
        }

        public Criteria andPmEmissionLessThanOrEqualTo(Double value) {
            addCriterion("pm_emission <=", value, "pmEmission");
            return (Criteria) this;
        }

        public Criteria andPmEmissionIn(List<Double> values) {
            addCriterion("pm_emission in", values, "pmEmission");
            return (Criteria) this;
        }

        public Criteria andPmEmissionNotIn(List<Double> values) {
            addCriterion("pm_emission not in", values, "pmEmission");
            return (Criteria) this;
        }

        public Criteria andPmEmissionBetween(Double value1, Double value2) {
            addCriterion("pm_emission between", value1, value2, "pmEmission");
            return (Criteria) this;
        }

        public Criteria andPmEmissionNotBetween(Double value1, Double value2) {
            addCriterion("pm_emission not between", value1, value2, "pmEmission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionIsNull() {
            addCriterion("so2_emission is null");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionIsNotNull() {
            addCriterion("so2_emission is not null");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionEqualTo(Double value) {
            addCriterion("so2_emission =", value, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionNotEqualTo(Double value) {
            addCriterion("so2_emission <>", value, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionGreaterThan(Double value) {
            addCriterion("so2_emission >", value, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("so2_emission >=", value, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionLessThan(Double value) {
            addCriterion("so2_emission <", value, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionLessThanOrEqualTo(Double value) {
            addCriterion("so2_emission <=", value, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionIn(List<Double> values) {
            addCriterion("so2_emission in", values, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionNotIn(List<Double> values) {
            addCriterion("so2_emission not in", values, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionBetween(Double value1, Double value2) {
            addCriterion("so2_emission between", value1, value2, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andSo2EmissionNotBetween(Double value1, Double value2) {
            addCriterion("so2_emission not between", value1, value2, "so2Emission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionIsNull() {
            addCriterion("nox_emission is null");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionIsNotNull() {
            addCriterion("nox_emission is not null");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionEqualTo(Double value) {
            addCriterion("nox_emission =", value, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionNotEqualTo(Double value) {
            addCriterion("nox_emission <>", value, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionGreaterThan(Double value) {
            addCriterion("nox_emission >", value, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("nox_emission >=", value, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionLessThan(Double value) {
            addCriterion("nox_emission <", value, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionLessThanOrEqualTo(Double value) {
            addCriterion("nox_emission <=", value, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionIn(List<Double> values) {
            addCriterion("nox_emission in", values, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionNotIn(List<Double> values) {
            addCriterion("nox_emission not in", values, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionBetween(Double value1, Double value2) {
            addCriterion("nox_emission between", value1, value2, "noxEmission");
            return (Criteria) this;
        }

        public Criteria andNoxEmissionNotBetween(Double value1, Double value2) {
            addCriterion("nox_emission not between", value1, value2, "noxEmission");
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

        public Criteria andOcEmissionIsNull() {
            addCriterion("oc_emission is null");
            return (Criteria) this;
        }

        public Criteria andOcEmissionIsNotNull() {
            addCriterion("oc_emission is not null");
            return (Criteria) this;
        }

        public Criteria andOcEmissionEqualTo(Double value) {
            addCriterion("oc_emission =", value, "ocEmission");
            return (Criteria) this;
        }

        public Criteria andOcEmissionNotEqualTo(Double value) {
            addCriterion("oc_emission <>", value, "ocEmission");
            return (Criteria) this;
        }

        public Criteria andOcEmissionGreaterThan(Double value) {
            addCriterion("oc_emission >", value, "ocEmission");
            return (Criteria) this;
        }

        public Criteria andOcEmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("oc_emission >=", value, "ocEmission");
            return (Criteria) this;
        }

        public Criteria andOcEmissionLessThan(Double value) {
            addCriterion("oc_emission <", value, "ocEmission");
            return (Criteria) this;
        }

        public Criteria andOcEmissionLessThanOrEqualTo(Double value) {
            addCriterion("oc_emission <=", value, "ocEmission");
            return (Criteria) this;
        }

        public Criteria andOcEmissionIn(List<Double> values) {
            addCriterion("oc_emission in", values, "ocEmission");
            return (Criteria) this;
        }

        public Criteria andOcEmissionNotIn(List<Double> values) {
            addCriterion("oc_emission not in", values, "ocEmission");
            return (Criteria) this;
        }

        public Criteria andOcEmissionBetween(Double value1, Double value2) {
            addCriterion("oc_emission between", value1, value2, "ocEmission");
            return (Criteria) this;
        }

        public Criteria andOcEmissionNotBetween(Double value1, Double value2) {
            addCriterion("oc_emission not between", value1, value2, "ocEmission");
            return (Criteria) this;
        }

        public Criteria andBcEmissionIsNull() {
            addCriterion("bc_emission is null");
            return (Criteria) this;
        }

        public Criteria andBcEmissionIsNotNull() {
            addCriterion("bc_emission is not null");
            return (Criteria) this;
        }

        public Criteria andBcEmissionEqualTo(Double value) {
            addCriterion("bc_emission =", value, "bcEmission");
            return (Criteria) this;
        }

        public Criteria andBcEmissionNotEqualTo(Double value) {
            addCriterion("bc_emission <>", value, "bcEmission");
            return (Criteria) this;
        }

        public Criteria andBcEmissionGreaterThan(Double value) {
            addCriterion("bc_emission >", value, "bcEmission");
            return (Criteria) this;
        }

        public Criteria andBcEmissionGreaterThanOrEqualTo(Double value) {
            addCriterion("bc_emission >=", value, "bcEmission");
            return (Criteria) this;
        }

        public Criteria andBcEmissionLessThan(Double value) {
            addCriterion("bc_emission <", value, "bcEmission");
            return (Criteria) this;
        }

        public Criteria andBcEmissionLessThanOrEqualTo(Double value) {
            addCriterion("bc_emission <=", value, "bcEmission");
            return (Criteria) this;
        }

        public Criteria andBcEmissionIn(List<Double> values) {
            addCriterion("bc_emission in", values, "bcEmission");
            return (Criteria) this;
        }

        public Criteria andBcEmissionNotIn(List<Double> values) {
            addCriterion("bc_emission not in", values, "bcEmission");
            return (Criteria) this;
        }

        public Criteria andBcEmissionBetween(Double value1, Double value2) {
            addCriterion("bc_emission between", value1, value2, "bcEmission");
            return (Criteria) this;
        }

        public Criteria andBcEmissionNotBetween(Double value1, Double value2) {
            addCriterion("bc_emission not between", value1, value2, "bcEmission");
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