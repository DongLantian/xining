package com.nankai.xining.repository;

import com.nankai.xining.bean.NaturalNow;
import com.nankai.xining.bean.NaturalNowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NaturalNowMapper {
    long countByExample(NaturalNowExample example);

    int deleteByExample(NaturalNowExample example);

    int deleteByPrimaryKey(Integer ntId);

    int insert(NaturalNow record);

    int insertSelective(NaturalNow record);

    List<NaturalNow> selectByExample(NaturalNowExample example);

    NaturalNow selectByPrimaryKey(Integer ntId);

    int updateByExampleSelective(@Param("record") NaturalNow record, @Param("example") NaturalNowExample example);

    int updateByExample(@Param("record") NaturalNow record, @Param("example") NaturalNowExample example);

    int updateByPrimaryKeySelective(NaturalNow record);

    int updateByPrimaryKey(NaturalNow record);
}