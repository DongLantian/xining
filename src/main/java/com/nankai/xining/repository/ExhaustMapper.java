package com.nankai.xining.repository;

import com.nankai.xining.bean.Exhaust;
import com.nankai.xining.bean.ExhaustExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExhaustMapper {
    long countByExample(ExhaustExample example);

    int deleteByExample(ExhaustExample example);

    int deleteByPrimaryKey(Integer exfId);

    int insert(Exhaust record);

    int insertSelective(Exhaust record);

    List<Exhaust> selectByExample(ExhaustExample example);

    Exhaust selectByPrimaryKey(Integer exfId);

    int updateByExampleSelective(@Param("record") Exhaust record, @Param("example") ExhaustExample example);

    int updateByExample(@Param("record") Exhaust record, @Param("example") ExhaustExample example);

    int updateByPrimaryKeySelective(Exhaust record);

    int updateByPrimaryKey(Exhaust record);
}