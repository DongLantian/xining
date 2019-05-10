package com.nankai.xining.repository;

import com.nankai.xining.bean.OilTransport;
import com.nankai.xining.bean.OilTransportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OilTransportMapper {
    long countByExample(OilTransportExample example);

    int deleteByExample(OilTransportExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OilTransport record);

    int insertSelective(OilTransport record);

    List<OilTransport> selectByExample(OilTransportExample example);

    OilTransport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OilTransport record, @Param("example") OilTransportExample example);

    int updateByExample(@Param("record") OilTransport record, @Param("example") OilTransportExample example);

    int updateByPrimaryKeySelective(OilTransport record);

    int updateByPrimaryKey(OilTransport record);
}