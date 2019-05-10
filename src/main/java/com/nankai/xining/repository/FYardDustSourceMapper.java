package com.nankai.xining.repository;

import com.nankai.xining.bean.FYardDustSource;
import com.nankai.xining.bean.FYardDustSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FYardDustSourceMapper {
    long countByExample(FYardDustSourceExample example);

    int deleteByExample(FYardDustSourceExample example);

    int deleteByPrimaryKey(Integer windDustid);

    int insert(FYardDustSource record);

    int insertSelective(FYardDustSource record);

    List<FYardDustSource> selectByExample(FYardDustSourceExample example);

    FYardDustSource selectByPrimaryKey(Integer windDustid);

    int updateByExampleSelective(@Param("record") FYardDustSource record, @Param("example") FYardDustSourceExample example);

    int updateByExample(@Param("record") FYardDustSource record, @Param("example") FYardDustSourceExample example);

    int updateByPrimaryKeySelective(FYardDustSource record);

    int updateByPrimaryKey(FYardDustSource record);
}