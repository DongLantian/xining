package com.nankai.xining.repository;

import com.nankai.xining.bean.SolventEqu;
import com.nankai.xining.bean.SolventEquExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SolventEquMapper {
    long countByExample(SolventEquExample example);

    int deleteByExample(SolventEquExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SolventEqu record);

    int insertSelective(SolventEqu record);

    List<SolventEqu> selectByExample(SolventEquExample example);

    SolventEqu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SolventEqu record, @Param("example") SolventEquExample example);

    int updateByExample(@Param("record") SolventEqu record, @Param("example") SolventEquExample example);

    int updateByPrimaryKeySelective(SolventEqu record);

    int updateByPrimaryKey(SolventEqu record);
}