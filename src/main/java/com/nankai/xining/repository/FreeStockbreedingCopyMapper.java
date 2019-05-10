package com.nankai.xining.repository;

import com.nankai.xining.bean.FreeStockbreedingCopy;
import com.nankai.xining.bean.FreeStockbreedingCopyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FreeStockbreedingCopyMapper {
    long countByExample(FreeStockbreedingCopyExample example);

    int deleteByExample(FreeStockbreedingCopyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FreeStockbreedingCopy record);

    int insertSelective(FreeStockbreedingCopy record);

    List<FreeStockbreedingCopy> selectByExample(FreeStockbreedingCopyExample example);

    FreeStockbreedingCopy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FreeStockbreedingCopy record, @Param("example") FreeStockbreedingCopyExample example);

    int updateByExample(@Param("record") FreeStockbreedingCopy record, @Param("example") FreeStockbreedingCopyExample example);

    int updateByPrimaryKeySelective(FreeStockbreedingCopy record);

    int updateByPrimaryKey(FreeStockbreedingCopy record);
}