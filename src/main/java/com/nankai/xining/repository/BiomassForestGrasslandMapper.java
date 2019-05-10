package com.nankai.xining.repository;

import com.nankai.xining.bean.BiomassForestGrassland;
import com.nankai.xining.bean.BiomassForestGrasslandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BiomassForestGrasslandMapper {
    long countByExample(BiomassForestGrasslandExample example);

    int deleteByExample(BiomassForestGrasslandExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BiomassForestGrassland record);

    int insertSelective(BiomassForestGrassland record);

    List<BiomassForestGrassland> selectByExample(BiomassForestGrasslandExample example);

    BiomassForestGrassland selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BiomassForestGrassland record, @Param("example") BiomassForestGrasslandExample example);

    int updateByExample(@Param("record") BiomassForestGrassland record, @Param("example") BiomassForestGrasslandExample example);

    int updateByPrimaryKeySelective(BiomassForestGrassland record);

    int updateByPrimaryKey(BiomassForestGrassland record);
}