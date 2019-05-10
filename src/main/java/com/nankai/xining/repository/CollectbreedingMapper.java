package com.nankai.xining.repository;

import com.nankai.xining.bean.Collectbreeding;
import com.nankai.xining.bean.CollectbreedingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollectbreedingMapper {
    long countByExample(CollectbreedingExample example);

    int deleteByExample(CollectbreedingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Collectbreeding record);

    int insertSelective(Collectbreeding record);

    List<Collectbreeding> selectByExample(CollectbreedingExample example);

    Collectbreeding selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Collectbreeding record, @Param("example") CollectbreedingExample example);

    int updateByExample(@Param("record") Collectbreeding record, @Param("example") CollectbreedingExample example);

    int updateByPrimaryKeySelective(Collectbreeding record);

    int updateByPrimaryKey(Collectbreeding record);
}