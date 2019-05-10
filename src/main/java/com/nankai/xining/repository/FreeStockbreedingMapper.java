package com.nankai.xining.repository;

import com.nankai.xining.bean.FreeStockbreeding;
import com.nankai.xining.bean.FreeStockbreedingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FreeStockbreedingMapper {
    long countByExample(FreeStockbreedingExample example);

    int deleteByExample(FreeStockbreedingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FreeStockbreeding record);

    int insertSelective(FreeStockbreeding record);

    List<FreeStockbreeding> selectByExample(FreeStockbreedingExample example);

    FreeStockbreeding selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FreeStockbreeding record, @Param("example") FreeStockbreedingExample example);

    int updateByExample(@Param("record") FreeStockbreeding record, @Param("example") FreeStockbreedingExample example);

    int updateByPrimaryKeySelective(FreeStockbreeding record);

    int updateByPrimaryKey(FreeStockbreeding record);
}