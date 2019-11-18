package com.nankai.xining.repository;

import com.nankai.xining.bean.Factory;
import com.nankai.xining.bean.FactoryExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FactoryMapper {
    long countByExample(FactoryExample example);

    int deleteByExample(FactoryExample example);

    int deleteByPrimaryKey(Integer factoryId);

    int insert(Factory record);

    int insertSelective(Factory record);

    List<Factory> selectByExampleWithBLOBs(FactoryExample example);

    List<Factory> selectByExample(FactoryExample example);

    Factory selectByPrimaryKey(Integer factoryId);

    int updateByExampleSelective(@Param("record") Factory record, @Param("example") FactoryExample example);

    int updateByExampleWithBLOBs(@Param("record") Factory record, @Param("example") FactoryExample example);

    int updateByExample(@Param("record") Factory record, @Param("example") FactoryExample example);

    int updateByPrimaryKeySelective(Factory record);

    int updateByPrimaryKeyWithBLOBs(Factory record);

    int updateByPrimaryKey(Factory record);

    String getCitybyCountry(@Param("countryID")String countryID);
}