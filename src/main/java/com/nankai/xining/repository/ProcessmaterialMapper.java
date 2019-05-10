package com.nankai.xining.repository;

import com.nankai.xining.bean.Processmaterial;
import com.nankai.xining.bean.ProcessmaterialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcessmaterialMapper {
    long countByExample(ProcessmaterialExample example);

    int deleteByExample(ProcessmaterialExample example);

    int deleteByPrimaryKey(Integer processmaterialId);

    int insert(Processmaterial record);

    int insertSelective(Processmaterial record);

    List<Processmaterial> selectByExample(ProcessmaterialExample example);

    Processmaterial selectByPrimaryKey(Integer processmaterialId);

    int updateByExampleSelective(@Param("record") Processmaterial record, @Param("example") ProcessmaterialExample example);

    int updateByExample(@Param("record") Processmaterial record, @Param("example") ProcessmaterialExample example);

    int updateByPrimaryKeySelective(Processmaterial record);

    int updateByPrimaryKey(Processmaterial record);
}