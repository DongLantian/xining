package com.nankai.xining.repository;

import com.nankai.xining.bean.GasSource;
import com.nankai.xining.bean.GasSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GasSourceMapper {
    long countByExample(GasSourceExample example);

    int deleteByExample(GasSourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GasSource record);

    int insertSelective(GasSource record);

    List<GasSource> selectByExample(GasSourceExample example);

    GasSource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GasSource record, @Param("example") GasSourceExample example);

    int updateByExample(@Param("record") GasSource record, @Param("example") GasSourceExample example);

    int updateByPrimaryKeySelective(GasSource record);

    int updateByPrimaryKey(GasSource record);
}