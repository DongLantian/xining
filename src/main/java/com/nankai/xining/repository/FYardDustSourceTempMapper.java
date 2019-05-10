package com.nankai.xining.repository;

import com.nankai.xining.bean.FYardDustSourceTemp;
import com.nankai.xining.bean.FYardDustSourceTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FYardDustSourceTempMapper {
    long countByExample(FYardDustSourceTempExample example);

    int deleteByExample(FYardDustSourceTempExample example);

    int deleteByPrimaryKey(Integer windDustid);

    int insert(FYardDustSourceTemp record);

    int insertSelective(FYardDustSourceTemp record);

    List<FYardDustSourceTemp> selectByExample(FYardDustSourceTempExample example);

    FYardDustSourceTemp selectByPrimaryKey(Integer windDustid);

    int updateByExampleSelective(@Param("record") FYardDustSourceTemp record, @Param("example") FYardDustSourceTempExample example);

    int updateByExample(@Param("record") FYardDustSourceTemp record, @Param("example") FYardDustSourceTempExample example);

    int updateByPrimaryKeySelective(FYardDustSourceTemp record);

    int updateByPrimaryKey(FYardDustSourceTemp record);
}