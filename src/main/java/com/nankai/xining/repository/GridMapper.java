package com.nankai.xining.repository;

import com.nankai.xining.bean.Grid;
import com.nankai.xining.bean.GridExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GridMapper {
    long countByExample(GridExample example);

    int deleteByExample(GridExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Grid record);

    int insertSelective(Grid record);

    List<Grid> selectByExample(GridExample example);

    Grid selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Grid record, @Param("example") GridExample example);

    int updateByExample(@Param("record") Grid record, @Param("example") GridExample example);

    int updateByPrimaryKeySelective(Grid record);

    int updateByPrimaryKey(Grid record);
}