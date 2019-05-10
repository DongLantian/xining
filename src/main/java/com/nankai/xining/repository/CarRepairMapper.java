package com.nankai.xining.repository;

import com.nankai.xining.bean.CarRepair;
import com.nankai.xining.bean.CarRepairExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarRepairMapper {
    long countByExample(CarRepairExample example);

    int deleteByExample(CarRepairExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CarRepair record);

    int insertSelective(CarRepair record);

    List<CarRepair> selectByExample(CarRepairExample example);

    CarRepair selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CarRepair record, @Param("example") CarRepairExample example);

    int updateByExample(@Param("record") CarRepair record, @Param("example") CarRepairExample example);

    int updateByPrimaryKeySelective(CarRepair record);

    int updateByPrimaryKey(CarRepair record);
}