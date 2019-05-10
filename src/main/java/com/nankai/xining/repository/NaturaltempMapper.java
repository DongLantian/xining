package com.nankai.xining.repository;

import com.nankai.xining.bean.Naturaltemp;
import com.nankai.xining.bean.NaturaltempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NaturaltempMapper {
    long countByExample(NaturaltempExample example);

    int deleteByExample(NaturaltempExample example);

    int deleteByPrimaryKey(Integer ntId);

    int insert(Naturaltemp record);

    int insertSelective(Naturaltemp record);

    List<Naturaltemp> selectByExample(NaturaltempExample example);

    Naturaltemp selectByPrimaryKey(Integer ntId);

    int updateByExampleSelective(@Param("record") Naturaltemp record, @Param("example") NaturaltempExample example);

    int updateByExample(@Param("record") Naturaltemp record, @Param("example") NaturaltempExample example);

    int updateByPrimaryKeySelective(Naturaltemp record);

    int updateByPrimaryKey(Naturaltemp record);
}