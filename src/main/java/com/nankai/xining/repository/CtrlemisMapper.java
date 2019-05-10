package com.nankai.xining.repository;

import com.nankai.xining.bean.Ctrlemis;
import com.nankai.xining.bean.CtrlemisExample;
import com.nankai.xining.bean.CtrlemisKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtrlemisMapper {
    long countByExample(CtrlemisExample example);

    int deleteByExample(CtrlemisExample example);

    int deleteByPrimaryKey(CtrlemisKey key);

    int insert(Ctrlemis record);

    int insertSelective(Ctrlemis record);

    List<Ctrlemis> selectByExample(CtrlemisExample example);

    Ctrlemis selectByPrimaryKey(CtrlemisKey key);

    int updateByExampleSelective(@Param("record") Ctrlemis record, @Param("example") CtrlemisExample example);

    int updateByExample(@Param("record") Ctrlemis record, @Param("example") CtrlemisExample example);

    int updateByPrimaryKeySelective(Ctrlemis record);

    int updateByPrimaryKey(Ctrlemis record);
}