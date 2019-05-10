package com.nankai.xining.repository;

import com.nankai.xining.bean.Preairatmos;
import com.nankai.xining.bean.PreairatmosExample;
import com.nankai.xining.bean.PreairatmosKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PreairatmosMapper {
    long countByExample(PreairatmosExample example);

    int deleteByExample(PreairatmosExample example);

    int deleteByPrimaryKey(PreairatmosKey key);

    int insert(Preairatmos record);

    int insertSelective(Preairatmos record);

    List<Preairatmos> selectByExample(PreairatmosExample example);

    Preairatmos selectByPrimaryKey(PreairatmosKey key);

    int updateByExampleSelective(@Param("record") Preairatmos record, @Param("example") PreairatmosExample example);

    int updateByExample(@Param("record") Preairatmos record, @Param("example") PreairatmosExample example);

    int updateByPrimaryKeySelective(Preairatmos record);

    int updateByPrimaryKey(Preairatmos record);
}