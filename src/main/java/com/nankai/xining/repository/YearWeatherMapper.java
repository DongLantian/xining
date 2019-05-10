package com.nankai.xining.repository;

import com.nankai.xining.bean.YearWeather;
import com.nankai.xining.bean.YearWeatherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YearWeatherMapper {
    long countByExample(YearWeatherExample example);

    int deleteByExample(YearWeatherExample example);

    int deleteByPrimaryKey(Integer ywId);

    int insert(YearWeather record);

    int insertSelective(YearWeather record);

    List<YearWeather> selectByExample(YearWeatherExample example);

    YearWeather selectByPrimaryKey(Integer ywId);

    int updateByExampleSelective(@Param("record") YearWeather record, @Param("example") YearWeatherExample example);

    int updateByExample(@Param("record") YearWeather record, @Param("example") YearWeatherExample example);

    int updateByPrimaryKeySelective(YearWeather record);

    int updateByPrimaryKey(YearWeather record);
}