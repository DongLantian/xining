package com.nankai.xining.repository;

import com.nankai.xining.bean.Gasrawmaterial;
import com.nankai.xining.bean.GasrawmaterialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GasrawmaterialMapper {
    long countByExample(GasrawmaterialExample example);

    int deleteByExample(GasrawmaterialExample example);

    int deleteByPrimaryKey(Integer materialid);

    int insert(Gasrawmaterial record);

    int insertSelective(Gasrawmaterial record);

    List<Gasrawmaterial> selectByExample(GasrawmaterialExample example);

    Gasrawmaterial selectByPrimaryKey(Integer materialid);

    int updateByExampleSelective(@Param("record") Gasrawmaterial record, @Param("example") GasrawmaterialExample example);

    int updateByExample(@Param("record") Gasrawmaterial record, @Param("example") GasrawmaterialExample example);

    int updateByPrimaryKeySelective(Gasrawmaterial record);

    int updateByPrimaryKey(Gasrawmaterial record);
}