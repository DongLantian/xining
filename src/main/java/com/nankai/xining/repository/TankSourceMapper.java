package com.nankai.xining.repository;

import com.nankai.xining.bean.TankSource;
import com.nankai.xining.bean.TankSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TankSourceMapper {
    long countByExample(TankSourceExample example);

    int deleteByExample(TankSourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TankSource record);

    int insertSelective(TankSource record);

    List<TankSource> selectByExample(TankSourceExample example);

    TankSource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TankSource record, @Param("example") TankSourceExample example);

    int updateByExample(@Param("record") TankSource record, @Param("example") TankSourceExample example);

    int updateByPrimaryKeySelective(TankSource record);

    int updateByPrimaryKey(TankSource record);
}