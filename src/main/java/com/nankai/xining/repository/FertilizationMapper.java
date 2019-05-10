package com.nankai.xining.repository;

import com.nankai.xining.bean.Fertilization;
import com.nankai.xining.bean.FertilizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FertilizationMapper {
    long countByExample(FertilizationExample example);

    int deleteByExample(FertilizationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Fertilization record);

    int insertSelective(Fertilization record);

    List<Fertilization> selectByExample(FertilizationExample example);

    Fertilization selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Fertilization record, @Param("example") FertilizationExample example);

    int updateByExample(@Param("record") Fertilization record, @Param("example") FertilizationExample example);

    int updateByPrimaryKeySelective(Fertilization record);

    int updateByPrimaryKey(Fertilization record);
}