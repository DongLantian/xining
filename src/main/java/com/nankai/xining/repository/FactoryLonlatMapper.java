package com.nankai.xining.repository;

import com.nankai.xining.bean.FactoryLonlat;
import com.nankai.xining.bean.FactoryLonlatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FactoryLonlatMapper {
    long countByExample(FactoryLonlatExample example);

    int deleteByExample(FactoryLonlatExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FactoryLonlat record);

    int insertSelective(FactoryLonlat record);

    List<FactoryLonlat> selectByExample(FactoryLonlatExample example);

    FactoryLonlat selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FactoryLonlat record, @Param("example") FactoryLonlatExample example);

    int updateByExample(@Param("record") FactoryLonlat record, @Param("example") FactoryLonlatExample example);

    int updateByPrimaryKeySelective(FactoryLonlat record);

    int updateByPrimaryKey(FactoryLonlat record);
}