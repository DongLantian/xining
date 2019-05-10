package com.nankai.xining.repository;

import com.nankai.xining.bean.RoadMove;
import com.nankai.xining.bean.RoadMoveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoadMoveMapper {
    long countByExample(RoadMoveExample example);

    int deleteByExample(RoadMoveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoadMove record);

    int insertSelective(RoadMove record);

    List<RoadMove> selectByExample(RoadMoveExample example);

    RoadMove selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoadMove record, @Param("example") RoadMoveExample example);

    int updateByExample(@Param("record") RoadMove record, @Param("example") RoadMoveExample example);

    int updateByPrimaryKeySelective(RoadMove record);

    int updateByPrimaryKey(RoadMove record);
}