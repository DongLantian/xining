package com.nankai.xining.repository;

import com.nankai.xining.bean.NPlant;
import com.nankai.xining.bean.NPlantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NPlantMapper {
    long countByExample(NPlantExample example);

    int deleteByExample(NPlantExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NPlant record);

    int insertSelective(NPlant record);

    List<NPlant> selectByExample(NPlantExample example);

    NPlant selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NPlant record, @Param("example") NPlantExample example);

    int updateByExample(@Param("record") NPlant record, @Param("example") NPlantExample example);

    int updateByPrimaryKeySelective(NPlant record);

    int updateByPrimaryKey(NPlant record);
}