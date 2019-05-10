package com.nankai.xining.repository;

import com.nankai.xining.bean.Soildrifting;
import com.nankai.xining.bean.SoildriftingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SoildriftingMapper {
    long countByExample(SoildriftingExample example);

    int deleteByExample(SoildriftingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Soildrifting record);

    int insertSelective(Soildrifting record);

    List<Soildrifting> selectByExample(SoildriftingExample example);

    Soildrifting selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Soildrifting record, @Param("example") SoildriftingExample example);

    int updateByExample(@Param("record") Soildrifting record, @Param("example") SoildriftingExample example);

    int updateByPrimaryKeySelective(Soildrifting record);

    int updateByPrimaryKey(Soildrifting record);
}