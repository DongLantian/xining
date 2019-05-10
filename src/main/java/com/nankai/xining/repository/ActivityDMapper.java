package com.nankai.xining.repository;

import com.nankai.xining.bean.ActivityD;
import com.nankai.xining.bean.ActivityDExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityDMapper {
    long countByExample(ActivityDExample example);

    int deleteByExample(ActivityDExample example);

    int deleteByPrimaryKey(Integer dayId);

    int insert(ActivityD record);

    int insertSelective(ActivityD record);

    List<ActivityD> selectByExample(ActivityDExample example);

    ActivityD selectByPrimaryKey(Integer dayId);

    int updateByExampleSelective(@Param("record") ActivityD record, @Param("example") ActivityDExample example);

    int updateByExample(@Param("record") ActivityD record, @Param("example") ActivityDExample example);

    int updateByPrimaryKeySelective(ActivityD record);

    int updateByPrimaryKey(ActivityD record);
}