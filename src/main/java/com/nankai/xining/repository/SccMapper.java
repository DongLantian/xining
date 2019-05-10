package com.nankai.xining.repository;

import com.nankai.xining.bean.Scc;
import com.nankai.xining.bean.SccExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SccMapper {
    long countByExample(SccExample example);

    int deleteByExample(SccExample example);

    int deleteByPrimaryKey(String scc);

    int insert(Scc record);

    int insertSelective(Scc record);

    List<Scc> selectByExample(SccExample example);

    Scc selectByPrimaryKey(String scc);

    int updateByExampleSelective(@Param("record") Scc record, @Param("example") SccExample example);

    int updateByExample(@Param("record") Scc record, @Param("example") SccExample example);

    int updateByPrimaryKeySelective(Scc record);

    int updateByPrimaryKey(Scc record);
}