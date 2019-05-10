package com.nankai.xining.repository;

import com.nankai.xining.bean.Sealpointleakinfoformal;
import com.nankai.xining.bean.SealpointleakinfoformalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SealpointleakinfoformalMapper {
    long countByExample(SealpointleakinfoformalExample example);

    int deleteByExample(SealpointleakinfoformalExample example);

    int deleteByPrimaryKey(Integer leakid);

    int insert(Sealpointleakinfoformal record);

    int insertSelective(Sealpointleakinfoformal record);

    List<Sealpointleakinfoformal> selectByExample(SealpointleakinfoformalExample example);

    Sealpointleakinfoformal selectByPrimaryKey(Integer leakid);

    int updateByExampleSelective(@Param("record") Sealpointleakinfoformal record, @Param("example") SealpointleakinfoformalExample example);

    int updateByExample(@Param("record") Sealpointleakinfoformal record, @Param("example") SealpointleakinfoformalExample example);

    int updateByPrimaryKeySelective(Sealpointleakinfoformal record);

    int updateByPrimaryKey(Sealpointleakinfoformal record);
}