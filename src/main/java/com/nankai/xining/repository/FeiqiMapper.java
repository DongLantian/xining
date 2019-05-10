package com.nankai.xining.repository;

import com.nankai.xining.bean.Feiqi;
import com.nankai.xining.bean.FeiqiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeiqiMapper {
    long countByExample(FeiqiExample example);

    int deleteByExample(FeiqiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Feiqi record);

    int insertSelective(Feiqi record);

    List<Feiqi> selectByExample(FeiqiExample example);

    Feiqi selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Feiqi record, @Param("example") FeiqiExample example);

    int updateByExample(@Param("record") Feiqi record, @Param("example") FeiqiExample example);

    int updateByPrimaryKeySelective(Feiqi record);

    int updateByPrimaryKey(Feiqi record);
}