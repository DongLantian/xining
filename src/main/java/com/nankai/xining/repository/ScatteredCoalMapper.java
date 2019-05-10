package com.nankai.xining.repository;

import com.nankai.xining.bean.ScatteredCoal;
import com.nankai.xining.bean.ScatteredCoalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScatteredCoalMapper {
    long countByExample(ScatteredCoalExample example);

    int deleteByExample(ScatteredCoalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScatteredCoal record);

    int insertSelective(ScatteredCoal record);

    List<ScatteredCoal> selectByExample(ScatteredCoalExample example);

    ScatteredCoal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScatteredCoal record, @Param("example") ScatteredCoalExample example);

    int updateByExample(@Param("record") ScatteredCoal record, @Param("example") ScatteredCoalExample example);

    int updateByPrimaryKeySelective(ScatteredCoal record);

    int updateByPrimaryKey(ScatteredCoal record);
}