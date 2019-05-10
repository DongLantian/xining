package com.nankai.xining.repository;

import com.nankai.xining.bean.SccGridTemp;
import com.nankai.xining.bean.SccGridTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SccGridTempMapper {
    long countByExample(SccGridTempExample example);

    int deleteByExample(SccGridTempExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SccGridTemp record);

    int insertSelective(SccGridTemp record);

    List<SccGridTemp> selectByExample(SccGridTempExample example);

    SccGridTemp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SccGridTemp record, @Param("example") SccGridTempExample example);

    int updateByExample(@Param("record") SccGridTemp record, @Param("example") SccGridTempExample example);

    int updateByPrimaryKeySelective(SccGridTemp record);

    int updateByPrimaryKey(SccGridTemp record);
}