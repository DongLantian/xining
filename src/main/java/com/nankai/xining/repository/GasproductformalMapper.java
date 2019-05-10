package com.nankai.xining.repository;

import com.nankai.xining.bean.Gasproductformal;
import com.nankai.xining.bean.GasproductformalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GasproductformalMapper {
    long countByExample(GasproductformalExample example);

    int deleteByExample(GasproductformalExample example);

    int deleteByPrimaryKey(Integer productid);

    int insert(Gasproductformal record);

    int insertSelective(Gasproductformal record);

    List<Gasproductformal> selectByExample(GasproductformalExample example);

    Gasproductformal selectByPrimaryKey(Integer productid);

    int updateByExampleSelective(@Param("record") Gasproductformal record, @Param("example") GasproductformalExample example);

    int updateByExample(@Param("record") Gasproductformal record, @Param("example") GasproductformalExample example);

    int updateByPrimaryKeySelective(Gasproductformal record);

    int updateByPrimaryKey(Gasproductformal record);
}