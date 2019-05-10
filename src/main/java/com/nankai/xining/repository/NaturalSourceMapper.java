package com.nankai.xining.repository;

import com.nankai.xining.bean.NaturalSource;
import com.nankai.xining.bean.NaturalSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NaturalSourceMapper {
    long countByExample(NaturalSourceExample example);

    int deleteByExample(NaturalSourceExample example);

    int deleteByPrimaryKey(Integer ntId);

    int insert(NaturalSource record);

    int insertSelective(NaturalSource record);

    List<NaturalSource> selectByExample(NaturalSourceExample example);

    NaturalSource selectByPrimaryKey(Integer ntId);

    int updateByExampleSelective(@Param("record") NaturalSource record, @Param("example") NaturalSourceExample example);

    int updateByExample(@Param("record") NaturalSource record, @Param("example") NaturalSourceExample example);

    int updateByPrimaryKeySelective(NaturalSource record);

    int updateByPrimaryKey(NaturalSource record);
}