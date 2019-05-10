package com.nankai.xining.repository;

import com.nankai.xining.bean.DustseasonFactor;
import com.nankai.xining.bean.DustseasonFactorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DustseasonFactorMapper {
    long countByExample(DustseasonFactorExample example);

    int deleteByExample(DustseasonFactorExample example);

    int deleteByPrimaryKey(Integer dsId);

    int insert(DustseasonFactor record);

    int insertSelective(DustseasonFactor record);

    List<DustseasonFactor> selectByExample(DustseasonFactorExample example);

    DustseasonFactor selectByPrimaryKey(Integer dsId);

    int updateByExampleSelective(@Param("record") DustseasonFactor record, @Param("example") DustseasonFactorExample example);

    int updateByExample(@Param("record") DustseasonFactor record, @Param("example") DustseasonFactorExample example);

    int updateByPrimaryKeySelective(DustseasonFactor record);

    int updateByPrimaryKey(DustseasonFactor record);
}