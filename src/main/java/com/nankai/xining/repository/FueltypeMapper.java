package com.nankai.xining.repository;

import com.nankai.xining.bean.Fueltype;
import com.nankai.xining.bean.FueltypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FueltypeMapper {
    long countByExample(FueltypeExample example);

    int deleteByExample(FueltypeExample example);

    int deleteByPrimaryKey(Integer fueltypeid);

    int insert(Fueltype record);

    int insertSelective(Fueltype record);

    List<Fueltype> selectByExample(FueltypeExample example);

    Fueltype selectByPrimaryKey(Integer fueltypeid);

    int updateByExampleSelective(@Param("record") Fueltype record, @Param("example") FueltypeExample example);

    int updateByExample(@Param("record") Fueltype record, @Param("example") FueltypeExample example);

    int updateByPrimaryKeySelective(Fueltype record);

    int updateByPrimaryKey(Fueltype record);
}