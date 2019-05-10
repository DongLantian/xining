package com.nankai.xining.repository;

import com.nankai.xining.bean.Gasemissionformal;
import com.nankai.xining.bean.GasemissionformalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GasemissionformalMapper {
    long countByExample(GasemissionformalExample example);

    int deleteByExample(GasemissionformalExample example);

    int deleteByPrimaryKey(Integer gassurveyid);

    int insert(Gasemissionformal record);

    int insertSelective(Gasemissionformal record);

    List<Gasemissionformal> selectByExample(GasemissionformalExample example);

    Gasemissionformal selectByPrimaryKey(Integer gassurveyid);

    int updateByExampleSelective(@Param("record") Gasemissionformal record, @Param("example") GasemissionformalExample example);

    int updateByExample(@Param("record") Gasemissionformal record, @Param("example") GasemissionformalExample example);

    int updateByPrimaryKeySelective(Gasemissionformal record);

    int updateByPrimaryKey(Gasemissionformal record);
}