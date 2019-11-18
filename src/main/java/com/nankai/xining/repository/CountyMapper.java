package com.nankai.xining.repository;

import com.nankai.xining.bean.County;
import com.nankai.xining.bean.CountyExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountyMapper {
    long countByExample(CountyExample example);

    int deleteByExample(CountyExample example);

    int deleteByPrimaryKey(String countyId);

    int insert(County record);

    int insertSelective(County record);

    List<County> selectByExample(CountyExample example);

    County selectByPrimaryKey(String countyId);

    int updateByExampleSelective(@Param("record") County record, @Param("example") CountyExample example);

    int updateByExample(@Param("record") County record, @Param("example") CountyExample example);

    int updateByPrimaryKeySelective(County record);

    int updateByPrimaryKey(County record);
}