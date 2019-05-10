package com.nankai.xining.repository;

import com.nankai.xining.bean.GridDetailed;
import com.nankai.xining.bean.GridDetailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GridDetailedMapper {
    long countByExample(GridDetailedExample example);

    int deleteByExample(GridDetailedExample example);

    int deleteByPrimaryKey(Integer gridid);

    int insert(GridDetailed record);

    int insertSelective(GridDetailed record);

    List<GridDetailed> selectByExample(GridDetailedExample example);

    GridDetailed selectByPrimaryKey(Integer gridid);

    int updateByExampleSelective(@Param("record") GridDetailed record, @Param("example") GridDetailedExample example);

    int updateByExample(@Param("record") GridDetailed record, @Param("example") GridDetailedExample example);

    int updateByPrimaryKeySelective(GridDetailed record);

    int updateByPrimaryKey(GridDetailed record);
}