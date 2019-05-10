package com.nankai.xining.repository;

import com.nankai.xining.bean.Cell;
import com.nankai.xining.bean.CellExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CellMapper {
    long countByExample(CellExample example);

    int deleteByExample(CellExample example);

    int deleteByPrimaryKey(String cellid);

    int insert(Cell record);

    int insertSelective(Cell record);

    List<Cell> selectByExample(CellExample example);

    Cell selectByPrimaryKey(String cellid);

    int updateByExampleSelective(@Param("record") Cell record, @Param("example") CellExample example);

    int updateByExample(@Param("record") Cell record, @Param("example") CellExample example);

    int updateByPrimaryKeySelective(Cell record);

    int updateByPrimaryKey(Cell record);
}