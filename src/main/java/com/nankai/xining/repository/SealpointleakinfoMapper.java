package com.nankai.xining.repository;

import com.nankai.xining.bean.Sealpointleakinfo;
import com.nankai.xining.bean.SealpointleakinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SealpointleakinfoMapper {
    long countByExample(SealpointleakinfoExample example);

    int deleteByExample(SealpointleakinfoExample example);

    int deleteByPrimaryKey(Integer leakid);

    int insert(Sealpointleakinfo record);

    int insertSelective(Sealpointleakinfo record);

    List<Sealpointleakinfo> selectByExample(SealpointleakinfoExample example);

    Sealpointleakinfo selectByPrimaryKey(Integer leakid);

    int updateByExampleSelective(@Param("record") Sealpointleakinfo record, @Param("example") SealpointleakinfoExample example);

    int updateByExample(@Param("record") Sealpointleakinfo record, @Param("example") SealpointleakinfoExample example);

    int updateByPrimaryKeySelective(Sealpointleakinfo record);

    int updateByPrimaryKey(Sealpointleakinfo record);
}