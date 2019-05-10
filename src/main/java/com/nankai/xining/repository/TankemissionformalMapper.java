package com.nankai.xining.repository;

import com.nankai.xining.bean.Tankemissionformal;
import com.nankai.xining.bean.TankemissionformalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TankemissionformalMapper {
    long countByExample(TankemissionformalExample example);

    int deleteByExample(TankemissionformalExample example);

    int deleteByPrimaryKey(Integer tanksurveyid);

    int insert(Tankemissionformal record);

    int insertSelective(Tankemissionformal record);

    List<Tankemissionformal> selectByExample(TankemissionformalExample example);

    Tankemissionformal selectByPrimaryKey(Integer tanksurveyid);

    int updateByExampleSelective(@Param("record") Tankemissionformal record, @Param("example") TankemissionformalExample example);

    int updateByExample(@Param("record") Tankemissionformal record, @Param("example") TankemissionformalExample example);

    int updateByPrimaryKeySelective(Tankemissionformal record);

    int updateByPrimaryKey(Tankemissionformal record);
}