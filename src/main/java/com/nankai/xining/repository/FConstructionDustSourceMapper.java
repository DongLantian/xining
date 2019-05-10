package com.nankai.xining.repository;

import com.nankai.xining.bean.FConstructionDustSource;
import com.nankai.xining.bean.FConstructionDustSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FConstructionDustSourceMapper {
    long countByExample(FConstructionDustSourceExample example);

    int deleteByExample(FConstructionDustSourceExample example);

    int deleteByPrimaryKey(Integer constructDustid);

    int insert(FConstructionDustSource record);

    int insertSelective(FConstructionDustSource record);

    List<FConstructionDustSource> selectByExample(FConstructionDustSourceExample example);

    FConstructionDustSource selectByPrimaryKey(Integer constructDustid);

    int updateByExampleSelective(@Param("record") FConstructionDustSource record, @Param("example") FConstructionDustSourceExample example);

    int updateByExample(@Param("record") FConstructionDustSource record, @Param("example") FConstructionDustSourceExample example);

    int updateByPrimaryKeySelective(FConstructionDustSource record);

    int updateByPrimaryKey(FConstructionDustSource record);
}