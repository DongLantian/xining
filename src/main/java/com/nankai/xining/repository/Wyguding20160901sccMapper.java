package com.nankai.xining.repository;

import com.nankai.xining.bean.Wyguding20160901scc;
import com.nankai.xining.bean.Wyguding20160901sccExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Wyguding20160901sccMapper {
    long countByExample(Wyguding20160901sccExample example);

    int deleteByExample(Wyguding20160901sccExample example);

    int deleteByPrimaryKey(String xjScc);

    int insert(Wyguding20160901scc record);

    int insertSelective(Wyguding20160901scc record);

    List<Wyguding20160901scc> selectByExample(Wyguding20160901sccExample example);

    Wyguding20160901scc selectByPrimaryKey(String xjScc);

    int updateByExampleSelective(@Param("record") Wyguding20160901scc record, @Param("example") Wyguding20160901sccExample example);

    int updateByExample(@Param("record") Wyguding20160901scc record, @Param("example") Wyguding20160901sccExample example);

    int updateByPrimaryKeySelective(Wyguding20160901scc record);

    int updateByPrimaryKey(Wyguding20160901scc record);
}