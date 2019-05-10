package com.nankai.xining.repository;

import com.nankai.xining.bean.OilSource;
import com.nankai.xining.bean.OilSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OilSourceMapper {
    long countByExample(OilSourceExample example);

    int deleteByExample(OilSourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OilSource record);

    int insertSelective(OilSource record);

    List<OilSource> selectByExample(OilSourceExample example);

    OilSource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OilSource record, @Param("example") OilSourceExample example);

    int updateByExample(@Param("record") OilSource record, @Param("example") OilSourceExample example);

    int updateByPrimaryKeySelective(OilSource record);

    int updateByPrimaryKey(OilSource record);
}