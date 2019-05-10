package com.nankai.xining.repository;

import com.nankai.xining.bean.TotalKiln;
import com.nankai.xining.bean.TotalKilnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TotalKilnMapper {
    long countByExample(TotalKilnExample example);

    int deleteByExample(TotalKilnExample example);

    int deleteByPrimaryKey(Integer fkilntotalId);

    int insert(TotalKiln record);

    int insertSelective(TotalKiln record);

    List<TotalKiln> selectByExampleWithBLOBs(TotalKilnExample example);

    List<TotalKiln> selectByExample(TotalKilnExample example);

    TotalKiln selectByPrimaryKey(Integer fkilntotalId);

    int updateByExampleSelective(@Param("record") TotalKiln record, @Param("example") TotalKilnExample example);

    int updateByExampleWithBLOBs(@Param("record") TotalKiln record, @Param("example") TotalKilnExample example);

    int updateByExample(@Param("record") TotalKiln record, @Param("example") TotalKilnExample example);

    int updateByPrimaryKeySelective(TotalKiln record);

    int updateByPrimaryKeyWithBLOBs(TotalKiln record);

    int updateByPrimaryKey(TotalKiln record);
}