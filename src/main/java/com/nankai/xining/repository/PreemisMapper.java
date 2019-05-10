package com.nankai.xining.repository;

import com.nankai.xining.bean.Preemis;
import com.nankai.xining.bean.PreemisExample;
import com.nankai.xining.bean.PreemisKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PreemisMapper {
    long countByExample(PreemisExample example);

    int deleteByExample(PreemisExample example);

    int deleteByPrimaryKey(PreemisKey key);

    int insert(Preemis record);

    int insertSelective(Preemis record);

    List<Preemis> selectByExample(PreemisExample example);

    Preemis selectByPrimaryKey(PreemisKey key);

    int updateByExampleSelective(@Param("record") Preemis record, @Param("example") PreemisExample example);

    int updateByExample(@Param("record") Preemis record, @Param("example") PreemisExample example);

    int updateByPrimaryKeySelective(Preemis record);

    int updateByPrimaryKey(Preemis record);
}