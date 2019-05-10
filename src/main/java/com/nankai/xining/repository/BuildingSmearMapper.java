package com.nankai.xining.repository;

import com.nankai.xining.bean.BuildingSmear;
import com.nankai.xining.bean.BuildingSmearExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuildingSmearMapper {
    long countByExample(BuildingSmearExample example);

    int deleteByExample(BuildingSmearExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BuildingSmear record);

    int insertSelective(BuildingSmear record);

    List<BuildingSmear> selectByExample(BuildingSmearExample example);

    BuildingSmear selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BuildingSmear record, @Param("example") BuildingSmearExample example);

    int updateByExample(@Param("record") BuildingSmear record, @Param("example") BuildingSmearExample example);

    int updateByPrimaryKeySelective(BuildingSmear record);

    int updateByPrimaryKey(BuildingSmear record);
}