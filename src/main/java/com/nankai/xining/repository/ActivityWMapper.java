package com.nankai.xining.repository;

import com.nankai.xining.bean.ActivityW;
import com.nankai.xining.bean.ActivityWExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityWMapper {
    long countByExample(ActivityWExample example);

    int deleteByExample(ActivityWExample example);

    int deleteByPrimaryKey(Integer weekId);

    int insert(ActivityW record);

    int insertSelective(ActivityW record);

    List<ActivityW> selectByExample(ActivityWExample example);

    ActivityW selectByPrimaryKey(Integer weekId);

    int updateByExampleSelective(@Param("record") ActivityW record, @Param("example") ActivityWExample example);

    int updateByExample(@Param("record") ActivityW record, @Param("example") ActivityWExample example);

    int updateByPrimaryKeySelective(ActivityW record);

    int updateByPrimaryKey(ActivityW record);
}