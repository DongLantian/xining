package com.nankai.xining.repository;

import com.nankai.xining.bean.PathDetailed;
import com.nankai.xining.bean.PathDetailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PathDetailedMapper {
    long countByExample(PathDetailedExample example);

    int deleteByExample(PathDetailedExample example);

    int deleteByPrimaryKey(Integer pathid);

    int insert(PathDetailed record);

    int insertSelective(PathDetailed record);

    List<PathDetailed> selectByExample(PathDetailedExample example);

    PathDetailed selectByPrimaryKey(Integer pathid);

    int updateByExampleSelective(@Param("record") PathDetailed record, @Param("example") PathDetailedExample example);

    int updateByExample(@Param("record") PathDetailed record, @Param("example") PathDetailedExample example);

    int updateByPrimaryKeySelective(PathDetailed record);

    int updateByPrimaryKey(PathDetailed record);
}