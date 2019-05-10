package com.nankai.xining.repository;

import com.nankai.xining.bean.Gridassignid;
import com.nankai.xining.bean.GridassignidExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GridassignidMapper {
    long countByExample(GridassignidExample example);

    int deleteByExample(GridassignidExample example);

    int deleteByPrimaryKey(String gridId);

    int insert(Gridassignid record);

    int insertSelective(Gridassignid record);

    List<Gridassignid> selectByExample(GridassignidExample example);

    int updateByExampleSelective(@Param("record") Gridassignid record, @Param("example") GridassignidExample example);

    int updateByExample(@Param("record") Gridassignid record, @Param("example") GridassignidExample example);
}