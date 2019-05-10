package com.nankai.xining.repository;

import com.nankai.xining.bean.Status;
import com.nankai.xining.bean.StatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatusMapper {
    long countByExample(StatusExample example);

    int deleteByExample(StatusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Status record);

    int insertSelective(Status record);

    List<Status> selectByExample(StatusExample example);

    Status selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Status record, @Param("example") StatusExample example);

    int updateByExample(@Param("record") Status record, @Param("example") StatusExample example);

    int updateByPrimaryKeySelective(Status record);

    int updateByPrimaryKey(Status record);
}