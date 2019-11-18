package com.nankai.xining.repository;

import com.nankai.xining.bean.FRoadDustSource;
import com.nankai.xining.bean.FRoadDustSourceExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FRoadDustSourceMapper {
    long countByExample(FRoadDustSourceExample example);

    int deleteByExample(FRoadDustSourceExample example);

    int deleteByPrimaryKey(Integer roadDustid);

    int insert(FRoadDustSource record);

    int insertSelective(FRoadDustSource record);

    List<FRoadDustSource> selectByExample(FRoadDustSourceExample example);

    FRoadDustSource selectByPrimaryKey(Integer roadDustid);

    int updateByExampleSelective(@Param("record") FRoadDustSource record, @Param("example") FRoadDustSourceExample example);

    int updateByExample(@Param("record") FRoadDustSource record, @Param("example") FRoadDustSourceExample example);

    int updateByPrimaryKeySelective(FRoadDustSource record);

    int updateByPrimaryKey(FRoadDustSource record);
}