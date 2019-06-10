package com.nankai.xining.repository;

import com.nankai.xining.bean.FRoadDustSourceTemp;
import com.nankai.xining.bean.FRoadDustSourceTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FRoadDustSourceTempMapper {
    long countByExample(FRoadDustSourceTempExample example);

    int deleteByExample(FRoadDustSourceTempExample example);

    int deleteByPrimaryKey(Integer roadDustid);

    int insert(FRoadDustSourceTemp record);

    int insertSelective(FRoadDustSourceTemp record);

    List<FRoadDustSourceTemp> selectByExample(FRoadDustSourceTempExample example);

    FRoadDustSourceTemp selectByPrimaryKey(Integer roadDustid);

    int updateByExampleSelective(@Param("record") FRoadDustSourceTemp record, @Param("example") FRoadDustSourceTempExample example);

    int updateByExample(@Param("record") FRoadDustSourceTemp record, @Param("example") FRoadDustSourceTempExample example);

    int updateByPrimaryKeySelective(FRoadDustSourceTemp record);

    int updateByPrimaryKey(FRoadDustSourceTemp record);
}