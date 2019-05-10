package com.nankai.xining.repository;

import com.nankai.xining.bean.Stationinfo;
import com.nankai.xining.bean.StationinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StationinfoMapper {
    long countByExample(StationinfoExample example);

    int deleteByExample(StationinfoExample example);

    int deleteByPrimaryKey(Integer stationid);

    int insert(Stationinfo record);

    int insertSelective(Stationinfo record);

    List<Stationinfo> selectByExample(StationinfoExample example);

    Stationinfo selectByPrimaryKey(Integer stationid);

    int updateByExampleSelective(@Param("record") Stationinfo record, @Param("example") StationinfoExample example);

    int updateByExample(@Param("record") Stationinfo record, @Param("example") StationinfoExample example);

    int updateByPrimaryKeySelective(Stationinfo record);

    int updateByPrimaryKey(Stationinfo record);
}