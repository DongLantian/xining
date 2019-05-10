package com.nankai.xining.repository;

import com.nankai.xining.bean.CarEmission;
import com.nankai.xining.bean.CarEmissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarEmissionMapper {
    long countByExample(CarEmissionExample example);

    int deleteByExample(CarEmissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CarEmission record);

    int insertSelective(CarEmission record);

    List<CarEmission> selectByExample(CarEmissionExample example);

    CarEmission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CarEmission record, @Param("example") CarEmissionExample example);

    int updateByExample(@Param("record") CarEmission record, @Param("example") CarEmissionExample example);

    int updateByPrimaryKeySelective(CarEmission record);

    int updateByPrimaryKey(CarEmission record);
}