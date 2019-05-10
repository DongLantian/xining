package com.nankai.xining.repository;

import com.nankai.xining.bean.RoadPave;
import com.nankai.xining.bean.RoadPaveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoadPaveMapper {
    long countByExample(RoadPaveExample example);

    int deleteByExample(RoadPaveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoadPave record);

    int insertSelective(RoadPave record);

    List<RoadPave> selectByExample(RoadPaveExample example);

    RoadPave selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoadPave record, @Param("example") RoadPaveExample example);

    int updateByExample(@Param("record") RoadPave record, @Param("example") RoadPaveExample example);

    int updateByPrimaryKeySelective(RoadPave record);

    int updateByPrimaryKey(RoadPave record);
}