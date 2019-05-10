package com.nankai.xining.repository;

import com.nankai.xining.bean.FConstructionDustSourceTemp;
import com.nankai.xining.bean.FConstructionDustSourceTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FConstructionDustSourceTempMapper {
    long countByExample(FConstructionDustSourceTempExample example);

    int deleteByExample(FConstructionDustSourceTempExample example);

    int deleteByPrimaryKey(Integer constructDustid);

    int insert(FConstructionDustSourceTemp record);

    int insertSelective(FConstructionDustSourceTemp record);

    List<FConstructionDustSourceTemp> selectByExample(FConstructionDustSourceTempExample example);

    FConstructionDustSourceTemp selectByPrimaryKey(Integer constructDustid);

    int updateByExampleSelective(@Param("record") FConstructionDustSourceTemp record, @Param("example") FConstructionDustSourceTempExample example);

    int updateByExample(@Param("record") FConstructionDustSourceTemp record, @Param("example") FConstructionDustSourceTempExample example);

    int updateByPrimaryKeySelective(FConstructionDustSourceTemp record);

    int updateByPrimaryKey(FConstructionDustSourceTemp record);
}