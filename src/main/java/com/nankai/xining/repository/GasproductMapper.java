package com.nankai.xining.repository;

import com.nankai.xining.bean.Gasproduct;
import com.nankai.xining.bean.GasproductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GasproductMapper {
    long countByExample(GasproductExample example);

    int deleteByExample(GasproductExample example);

    int deleteByPrimaryKey(Integer productid);

    int insert(Gasproduct record);

    int insertSelective(Gasproduct record);

    List<Gasproduct> selectByExample(GasproductExample example);

    Gasproduct selectByPrimaryKey(Integer productid);

    int updateByExampleSelective(@Param("record") Gasproduct record, @Param("example") GasproductExample example);

    int updateByExample(@Param("record") Gasproduct record, @Param("example") GasproductExample example);

    int updateByPrimaryKeySelective(Gasproduct record);

    int updateByPrimaryKey(Gasproduct record);
}