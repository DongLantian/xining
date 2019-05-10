package com.nankai.xining.repository;

import com.nankai.xining.bean.LoadMc;
import com.nankai.xining.bean.LoadMcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoadMcMapper {
    long countByExample(LoadMcExample example);

    int deleteByExample(LoadMcExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LoadMc record);

    int insertSelective(LoadMc record);

    List<LoadMc> selectByExample(LoadMcExample example);

    LoadMc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LoadMc record, @Param("example") LoadMcExample example);

    int updateByExample(@Param("record") LoadMc record, @Param("example") LoadMcExample example);

    int updateByPrimaryKeySelective(LoadMc record);

    int updateByPrimaryKey(LoadMc record);
}