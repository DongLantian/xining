package com.nankai.xining.repository;

import com.nankai.xining.bean.Gasemission;
import com.nankai.xining.bean.GasemissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GasemissionMapper {
    long countByExample(GasemissionExample example);

    int deleteByExample(GasemissionExample example);

    int deleteByPrimaryKey(Integer gassurveyid);

    int insert(Gasemission record);

    int insertSelective(Gasemission record);

    List<Gasemission> selectByExample(GasemissionExample example);

    Gasemission selectByPrimaryKey(Integer gassurveyid);

    int updateByExampleSelective(@Param("record") Gasemission record, @Param("example") GasemissionExample example);

    int updateByExample(@Param("record") Gasemission record, @Param("example") GasemissionExample example);

    int updateByPrimaryKeySelective(Gasemission record);

    int updateByPrimaryKey(Gasemission record);
}