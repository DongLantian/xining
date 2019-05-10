package com.nankai.xining.repository;

import com.nankai.xining.bean.RoadDustSourceTemp;
import com.nankai.xining.bean.RoadDustSourceTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoadDustSourceTempMapper {
    long countByExample(RoadDustSourceTempExample example);

    int deleteByExample(RoadDustSourceTempExample example);

    int deleteByPrimaryKey(Integer roadDustid);

    int insert(RoadDustSourceTemp record);

    int insertSelective(RoadDustSourceTemp record);

    List<RoadDustSourceTemp> selectByExample(RoadDustSourceTempExample example);

    RoadDustSourceTemp selectByPrimaryKey(Integer roadDustid);

    int updateByExampleSelective(@Param("record") RoadDustSourceTemp record, @Param("example") RoadDustSourceTempExample example);

    int updateByExample(@Param("record") RoadDustSourceTemp record, @Param("example") RoadDustSourceTempExample example);

    int updateByPrimaryKeySelective(RoadDustSourceTemp record);

    int updateByPrimaryKey(RoadDustSourceTemp record);
}