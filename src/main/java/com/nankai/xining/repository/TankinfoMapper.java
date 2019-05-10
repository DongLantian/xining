package com.nankai.xining.repository;

import com.nankai.xining.bean.Tankinfo;
import com.nankai.xining.bean.TankinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TankinfoMapper {
    long countByExample(TankinfoExample example);

    int deleteByExample(TankinfoExample example);

    int deleteByPrimaryKey(Integer tankid);

    int insert(Tankinfo record);

    int insertSelective(Tankinfo record);

    List<Tankinfo> selectByExample(TankinfoExample example);

    Tankinfo selectByPrimaryKey(Integer tankid);

    int updateByExampleSelective(@Param("record") Tankinfo record, @Param("example") TankinfoExample example);

    int updateByExample(@Param("record") Tankinfo record, @Param("example") TankinfoExample example);

    int updateByPrimaryKeySelective(Tankinfo record);

    int updateByPrimaryKey(Tankinfo record);
}