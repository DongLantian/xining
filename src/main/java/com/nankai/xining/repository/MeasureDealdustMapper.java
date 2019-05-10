package com.nankai.xining.repository;

import com.nankai.xining.bean.MeasureDealdust;
import com.nankai.xining.bean.MeasureDealdustExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeasureDealdustMapper {
    long countByExample(MeasureDealdustExample example);

    int deleteByExample(MeasureDealdustExample example);

    int deleteByPrimaryKey(Integer dealdustid);

    int insert(MeasureDealdust record);

    int insertSelective(MeasureDealdust record);

    List<MeasureDealdust> selectByExample(MeasureDealdustExample example);

    MeasureDealdust selectByPrimaryKey(Integer dealdustid);

    int updateByExampleSelective(@Param("record") MeasureDealdust record, @Param("example") MeasureDealdustExample example);

    int updateByExample(@Param("record") MeasureDealdust record, @Param("example") MeasureDealdustExample example);

    int updateByPrimaryKeySelective(MeasureDealdust record);

    int updateByPrimaryKey(MeasureDealdust record);
}