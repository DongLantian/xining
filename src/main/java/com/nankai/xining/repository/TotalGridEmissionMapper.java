package com.nankai.xining.repository;

import com.nankai.xining.bean.TotalGridEmission;
import com.nankai.xining.bean.TotalGridEmissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TotalGridEmissionMapper {
    long countByExample(TotalGridEmissionExample example);

    int deleteByExample(TotalGridEmissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TotalGridEmission record);

    int insertSelective(TotalGridEmission record);

    List<TotalGridEmission> selectByExample(TotalGridEmissionExample example);

    TotalGridEmission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TotalGridEmission record, @Param("example") TotalGridEmissionExample example);

    int updateByExample(@Param("record") TotalGridEmission record, @Param("example") TotalGridEmissionExample example);

    int updateByPrimaryKeySelective(TotalGridEmission record);

    int updateByPrimaryKey(TotalGridEmission record);
}