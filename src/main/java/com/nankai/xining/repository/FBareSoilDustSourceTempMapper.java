package com.nankai.xining.repository;

import com.nankai.xining.bean.FBareSoilDustSourceTemp;
import com.nankai.xining.bean.FBareSoilDustSourceTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FBareSoilDustSourceTempMapper {
    long countByExample(FBareSoilDustSourceTempExample example);

    int deleteByExample(FBareSoilDustSourceTempExample example);

    int deleteByPrimaryKey(Integer bareSoilid);

    int insert(FBareSoilDustSourceTemp record);

    int insertSelective(FBareSoilDustSourceTemp record);

    List<FBareSoilDustSourceTemp> selectByExample(FBareSoilDustSourceTempExample example);

    FBareSoilDustSourceTemp selectByPrimaryKey(Integer bareSoilid);

    int updateByExampleSelective(@Param("record") FBareSoilDustSourceTemp record, @Param("example") FBareSoilDustSourceTempExample example);

    int updateByExample(@Param("record") FBareSoilDustSourceTemp record, @Param("example") FBareSoilDustSourceTempExample example);

    int updateByPrimaryKeySelective(FBareSoilDustSourceTemp record);

    int updateByPrimaryKey(FBareSoilDustSourceTemp record);
}