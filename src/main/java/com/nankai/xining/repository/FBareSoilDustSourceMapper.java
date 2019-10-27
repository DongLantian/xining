package com.nankai.xining.repository;

import com.nankai.xining.bean.FBareSoilDustSource;
import com.nankai.xining.bean.FBareSoilDustSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FBareSoilDustSourceMapper {
    long countByExample(FBareSoilDustSourceExample example);

    int deleteByExample(FBareSoilDustSourceExample example);

    int deleteByPrimaryKey(Integer bareSoilid);

    int insert(FBareSoilDustSource record);

    int insertSelective(FBareSoilDustSource record);

    List<FBareSoilDustSource> selectByExample(FBareSoilDustSourceExample example);

    FBareSoilDustSource selectByPrimaryKey(Integer bareSoilid);

    int updateByExampleSelective(@Param("record") FBareSoilDustSource record, @Param("example") FBareSoilDustSourceExample example);

    int updateByExample(@Param("record") FBareSoilDustSource record, @Param("example") FBareSoilDustSourceExample example);

    int updateByPrimaryKeySelective(FBareSoilDustSource record);

    int updateByPrimaryKey(FBareSoilDustSource record);
}