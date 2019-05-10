package com.nankai.xining.repository;

import com.nankai.xining.bean.RoadDustSource;
import com.nankai.xining.bean.RoadDustSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoadDustSourceMapper {
    long countByExample(RoadDustSourceExample example);

    int deleteByExample(RoadDustSourceExample example);

    int deleteByPrimaryKey(Integer roadDustid);

    int insert(RoadDustSource record);

    int insertSelective(RoadDustSource record);

    List<RoadDustSource> selectByExample(RoadDustSourceExample example);

    RoadDustSource selectByPrimaryKey(Integer roadDustid);

    int updateByExampleSelective(@Param("record") RoadDustSource record, @Param("example") RoadDustSourceExample example);

    int updateByExample(@Param("record") RoadDustSource record, @Param("example") RoadDustSourceExample example);

    int updateByPrimaryKeySelective(RoadDustSource record);

    int updateByPrimaryKey(RoadDustSource record);
}