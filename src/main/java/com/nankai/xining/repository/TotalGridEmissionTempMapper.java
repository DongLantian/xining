package com.nankai.xining.repository;

import com.nankai.xining.bean.TotalGridEmissionTemp;
import com.nankai.xining.bean.TotalGridEmissionTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TotalGridEmissionTempMapper {
    long countByExample(TotalGridEmissionTempExample example);

    int deleteByExample(TotalGridEmissionTempExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TotalGridEmissionTemp record);

    int insertSelective(TotalGridEmissionTemp record);

    List<TotalGridEmissionTemp> selectByExample(TotalGridEmissionTempExample example);

    TotalGridEmissionTemp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TotalGridEmissionTemp record, @Param("example") TotalGridEmissionTempExample example);

    int updateByExample(@Param("record") TotalGridEmissionTemp record, @Param("example") TotalGridEmissionTempExample example);

    int updateByPrimaryKeySelective(TotalGridEmissionTemp record);

    int updateByPrimaryKey(TotalGridEmissionTemp record);
}