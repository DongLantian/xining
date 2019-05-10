package com.nankai.xining.repository;

import com.nankai.xining.bean.ActivityLevel;
import com.nankai.xining.bean.ActivityLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityLevelMapper {
    long countByExample(ActivityLevelExample example);

    int deleteByExample(ActivityLevelExample example);

    int deleteByPrimaryKey(String activitysId);

    int insert(ActivityLevel record);

    int insertSelective(ActivityLevel record);

    List<ActivityLevel> selectByExample(ActivityLevelExample example);

    ActivityLevel selectByPrimaryKey(String activitysId);

    int updateByExampleSelective(@Param("record") ActivityLevel record, @Param("example") ActivityLevelExample example);

    int updateByExample(@Param("record") ActivityLevel record, @Param("example") ActivityLevelExample example);

    int updateByPrimaryKeySelective(ActivityLevel record);

    int updateByPrimaryKey(ActivityLevel record);
}