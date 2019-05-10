package com.nankai.xining.repository;

import com.nankai.xining.bean.Gasrawmaterialformal;
import com.nankai.xining.bean.GasrawmaterialformalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GasrawmaterialformalMapper {
    long countByExample(GasrawmaterialformalExample example);

    int deleteByExample(GasrawmaterialformalExample example);

    int deleteByPrimaryKey(Integer materialid);

    int insert(Gasrawmaterialformal record);

    int insertSelective(Gasrawmaterialformal record);

    List<Gasrawmaterialformal> selectByExample(GasrawmaterialformalExample example);

    Gasrawmaterialformal selectByPrimaryKey(Integer materialid);

    int updateByExampleSelective(@Param("record") Gasrawmaterialformal record, @Param("example") GasrawmaterialformalExample example);

    int updateByExample(@Param("record") Gasrawmaterialformal record, @Param("example") GasrawmaterialformalExample example);

    int updateByPrimaryKeySelective(Gasrawmaterialformal record);

    int updateByPrimaryKey(Gasrawmaterialformal record);
}