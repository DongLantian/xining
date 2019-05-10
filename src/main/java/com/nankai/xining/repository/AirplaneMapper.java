package com.nankai.xining.repository;

import com.nankai.xining.bean.Airplane;
import com.nankai.xining.bean.AirplaneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AirplaneMapper {
    long countByExample(AirplaneExample example);

    int deleteByExample(AirplaneExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Airplane record);

    int insertSelective(Airplane record);

    List<Airplane> selectByExample(AirplaneExample example);

    Airplane selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Airplane record, @Param("example") AirplaneExample example);

    int updateByExample(@Param("record") Airplane record, @Param("example") AirplaneExample example);

    int updateByPrimaryKeySelective(Airplane record);

    int updateByPrimaryKey(Airplane record);
}