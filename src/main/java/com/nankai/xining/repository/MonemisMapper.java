package com.nankai.xining.repository;

import com.nankai.xining.bean.Monemis;
import com.nankai.xining.bean.MonemisExample;
import com.nankai.xining.bean.MonemisKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MonemisMapper {
    long countByExample(MonemisExample example);

    int deleteByExample(MonemisExample example);

    int deleteByPrimaryKey(MonemisKey key);

    int insert(Monemis record);

    int insertSelective(Monemis record);

    List<Monemis> selectByExample(MonemisExample example);

    Monemis selectByPrimaryKey(MonemisKey key);

    int updateByExampleSelective(@Param("record") Monemis record, @Param("example") MonemisExample example);

    int updateByExample(@Param("record") Monemis record, @Param("example") MonemisExample example);

    int updateByPrimaryKeySelective(Monemis record);

    int updateByPrimaryKey(Monemis record);
}