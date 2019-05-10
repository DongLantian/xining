package com.nankai.xining.repository;

import com.nankai.xining.bean.TotalRongji;
import com.nankai.xining.bean.TotalRongjiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TotalRongjiMapper {
    long countByExample(TotalRongjiExample example);

    int deleteByExample(TotalRongjiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TotalRongji record);

    int insertSelective(TotalRongji record);

    List<TotalRongji> selectByExample(TotalRongjiExample example);

    TotalRongji selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TotalRongji record, @Param("example") TotalRongjiExample example);

    int updateByExample(@Param("record") TotalRongji record, @Param("example") TotalRongjiExample example);

    int updateByPrimaryKeySelective(TotalRongji record);

    int updateByPrimaryKey(TotalRongji record);
}