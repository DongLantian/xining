package com.nankai.xining.repository;

import com.nankai.xining.bean.Xjyearweather;
import com.nankai.xining.bean.XjyearweatherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XjyearweatherMapper {
    long countByExample(XjyearweatherExample example);

    int deleteByExample(XjyearweatherExample example);

    int deleteByPrimaryKey(Integer ywId);

    int insert(Xjyearweather record);

    int insertSelective(Xjyearweather record);

    List<Xjyearweather> selectByExample(XjyearweatherExample example);

    Xjyearweather selectByPrimaryKey(Integer ywId);

    int updateByExampleSelective(@Param("record") Xjyearweather record, @Param("example") XjyearweatherExample example);

    int updateByExample(@Param("record") Xjyearweather record, @Param("example") XjyearweatherExample example);

    int updateByPrimaryKeySelective(Xjyearweather record);

    int updateByPrimaryKey(Xjyearweather record);
}