package com.nankai.xining.repository;

import com.nankai.xining.bean.TotalBoilerTemp;
import com.nankai.xining.bean.TotalBoilerTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TotalBoilerTempMapper {
    long countByExample(TotalBoilerTempExample example);

    int deleteByExample(TotalBoilerTempExample example);

    int deleteByPrimaryKey(Integer tboilerId);

    int insert(TotalBoilerTemp record);

    int insertSelective(TotalBoilerTemp record);

    List<TotalBoilerTemp> selectByExample(TotalBoilerTempExample example);

    TotalBoilerTemp selectByPrimaryKey(Integer tboilerId);

    int updateByExampleSelective(@Param("record") TotalBoilerTemp record, @Param("example") TotalBoilerTempExample example);

    int updateByExample(@Param("record") TotalBoilerTemp record, @Param("example") TotalBoilerTempExample example);

    int updateByPrimaryKeySelective(TotalBoilerTemp record);

    int updateByPrimaryKey(TotalBoilerTemp record);
}