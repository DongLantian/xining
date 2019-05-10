package com.nankai.xining.repository;

import com.nankai.xining.bean.CarNum;
import com.nankai.xining.bean.CarNumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarNumMapper {
    long countByExample(CarNumExample example);

    int deleteByExample(CarNumExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CarNum record);

    int insertSelective(CarNum record);

    List<CarNum> selectByExample(CarNumExample example);

    CarNum selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CarNum record, @Param("example") CarNumExample example);

    int updateByExample(@Param("record") CarNum record, @Param("example") CarNumExample example);

    int updateByPrimaryKeySelective(CarNum record);

    int updateByPrimaryKey(CarNum record);
}