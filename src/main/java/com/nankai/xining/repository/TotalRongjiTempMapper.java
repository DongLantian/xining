package com.nankai.xining.repository;

import com.nankai.xining.bean.TotalRongjiTemp;
import com.nankai.xining.bean.TotalRongjiTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TotalRongjiTempMapper {
    long countByExample(TotalRongjiTempExample example);

    int deleteByExample(TotalRongjiTempExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TotalRongjiTemp record);

    int insertSelective(TotalRongjiTemp record);

    List<TotalRongjiTemp> selectByExample(TotalRongjiTempExample example);

    TotalRongjiTemp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TotalRongjiTemp record, @Param("example") TotalRongjiTempExample example);

    int updateByExample(@Param("record") TotalRongjiTemp record, @Param("example") TotalRongjiTempExample example);

    int updateByPrimaryKeySelective(TotalRongjiTemp record);

    int updateByPrimaryKey(TotalRongjiTemp record);
}