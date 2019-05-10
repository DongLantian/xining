package com.nankai.xining.repository;

import com.nankai.xining.bean.ExhaustTemp;
import com.nankai.xining.bean.ExhaustTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExhaustTempMapper {
    long countByExample(ExhaustTempExample example);

    int deleteByExample(ExhaustTempExample example);

    int deleteByPrimaryKey(Integer exfId);

    int insert(ExhaustTemp record);

    int insertSelective(ExhaustTemp record);

    List<ExhaustTemp> selectByExample(ExhaustTempExample example);

    ExhaustTemp selectByPrimaryKey(Integer exfId);

    int updateByExampleSelective(@Param("record") ExhaustTemp record, @Param("example") ExhaustTempExample example);

    int updateByExample(@Param("record") ExhaustTemp record, @Param("example") ExhaustTempExample example);

    int updateByPrimaryKeySelective(ExhaustTemp record);

    int updateByPrimaryKey(ExhaustTemp record);
}