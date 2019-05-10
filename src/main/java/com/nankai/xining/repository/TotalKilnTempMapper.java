package com.nankai.xining.repository;

import com.nankai.xining.bean.TotalKilnTemp;
import com.nankai.xining.bean.TotalKilnTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TotalKilnTempMapper {
    long countByExample(TotalKilnTempExample example);

    int deleteByExample(TotalKilnTempExample example);

    int deleteByPrimaryKey(Integer fkilntotalId);

    int insert(TotalKilnTemp record);

    int insertSelective(TotalKilnTemp record);

    List<TotalKilnTemp> selectByExampleWithBLOBs(TotalKilnTempExample example);

    List<TotalKilnTemp> selectByExample(TotalKilnTempExample example);

    TotalKilnTemp selectByPrimaryKey(Integer fkilntotalId);

    int updateByExampleSelective(@Param("record") TotalKilnTemp record, @Param("example") TotalKilnTempExample example);

    int updateByExampleWithBLOBs(@Param("record") TotalKilnTemp record, @Param("example") TotalKilnTempExample example);

    int updateByExample(@Param("record") TotalKilnTemp record, @Param("example") TotalKilnTempExample example);

    int updateByPrimaryKeySelective(TotalKilnTemp record);

    int updateByPrimaryKeyWithBLOBs(TotalKilnTemp record);

    int updateByPrimaryKey(TotalKilnTemp record);
}