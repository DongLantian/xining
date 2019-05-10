package com.nankai.xining.repository;

import com.nankai.xining.bean.Monairatmos;
import com.nankai.xining.bean.MonairatmosExample;
import com.nankai.xining.bean.MonairatmosKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MonairatmosMapper {
    long countByExample(MonairatmosExample example);

    int deleteByExample(MonairatmosExample example);

    int deleteByPrimaryKey(MonairatmosKey key);

    int insert(Monairatmos record);

    int insertSelective(Monairatmos record);

    List<Monairatmos> selectByExample(MonairatmosExample example);

    Monairatmos selectByPrimaryKey(MonairatmosKey key);

    int updateByExampleSelective(@Param("record") Monairatmos record, @Param("example") MonairatmosExample example);

    int updateByExample(@Param("record") Monairatmos record, @Param("example") MonairatmosExample example);

    int updateByPrimaryKeySelective(Monairatmos record);

    int updateByPrimaryKey(Monairatmos record);
}