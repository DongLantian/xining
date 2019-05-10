package com.nankai.xining.repository;

import com.nankai.xining.bean.Xjdaytime;
import com.nankai.xining.bean.XjdaytimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XjdaytimeMapper {
    long countByExample(XjdaytimeExample example);

    int deleteByExample(XjdaytimeExample example);

    int deleteByPrimaryKey(Integer dayId);

    int insert(Xjdaytime record);

    int insertSelective(Xjdaytime record);

    List<Xjdaytime> selectByExample(XjdaytimeExample example);

    Xjdaytime selectByPrimaryKey(Integer dayId);

    int updateByExampleSelective(@Param("record") Xjdaytime record, @Param("example") XjdaytimeExample example);

    int updateByExample(@Param("record") Xjdaytime record, @Param("example") XjdaytimeExample example);

    int updateByPrimaryKeySelective(Xjdaytime record);

    int updateByPrimaryKey(Xjdaytime record);
}