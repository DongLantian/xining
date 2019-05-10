package com.nankai.xining.repository;

import com.nankai.xining.bean.RailwayEngine;
import com.nankai.xining.bean.RailwayEngineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RailwayEngineMapper {
    long countByExample(RailwayEngineExample example);

    int deleteByExample(RailwayEngineExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RailwayEngine record);

    int insertSelective(RailwayEngine record);

    List<RailwayEngine> selectByExample(RailwayEngineExample example);

    RailwayEngine selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RailwayEngine record, @Param("example") RailwayEngineExample example);

    int updateByExample(@Param("record") RailwayEngine record, @Param("example") RailwayEngineExample example);

    int updateByPrimaryKeySelective(RailwayEngine record);

    int updateByPrimaryKey(RailwayEngine record);
}