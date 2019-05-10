package com.nankai.xining.repository;

import com.nankai.xining.bean.Railway;
import com.nankai.xining.bean.RailwayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RailwayMapper {
    long countByExample(RailwayExample example);

    int deleteByExample(RailwayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Railway record);

    int insertSelective(Railway record);

    List<Railway> selectByExample(RailwayExample example);

    Railway selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Railway record, @Param("example") RailwayExample example);

    int updateByExample(@Param("record") Railway record, @Param("example") RailwayExample example);

    int updateByPrimaryKeySelective(Railway record);

    int updateByPrimaryKey(Railway record);
}