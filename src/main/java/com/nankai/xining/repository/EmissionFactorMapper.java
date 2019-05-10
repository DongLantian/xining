package com.nankai.xining.repository;

import com.nankai.xining.bean.EmissionFactor;
import com.nankai.xining.bean.EmissionFactorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmissionFactorMapper {
    long countByExample(EmissionFactorExample example);

    int deleteByExample(EmissionFactorExample example);

    int deleteByPrimaryKey(String factorsId);

    int insert(EmissionFactor record);

    int insertSelective(EmissionFactor record);

    List<EmissionFactor> selectByExample(EmissionFactorExample example);

    EmissionFactor selectByPrimaryKey(String factorsId);

    int updateByExampleSelective(@Param("record") EmissionFactor record, @Param("example") EmissionFactorExample example);

    int updateByExample(@Param("record") EmissionFactor record, @Param("example") EmissionFactorExample example);

    int updateByPrimaryKeySelective(EmissionFactor record);

    int updateByPrimaryKey(EmissionFactor record);
}