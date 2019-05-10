package com.nankai.xining.repository;

import com.nankai.xining.bean.Repast;
import com.nankai.xining.bean.RepastExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepastMapper {
    long countByExample(RepastExample example);

    int deleteByExample(RepastExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Repast record);

    int insertSelective(Repast record);

    List<Repast> selectByExample(RepastExample example);

    Repast selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Repast record, @Param("example") RepastExample example);

    int updateByExample(@Param("record") Repast record, @Param("example") RepastExample example);

    int updateByPrimaryKeySelective(Repast record);

    int updateByPrimaryKey(Repast record);
}