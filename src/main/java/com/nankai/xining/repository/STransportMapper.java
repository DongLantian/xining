package com.nankai.xining.repository;

import com.nankai.xining.bean.STransport;
import com.nankai.xining.bean.STransportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface STransportMapper {
    long countByExample(STransportExample example);

    int deleteByExample(STransportExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(STransport record);

    int insertSelective(STransport record);

    List<STransport> selectByExample(STransportExample example);

    STransport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") STransport record, @Param("example") STransportExample example);

    int updateByExample(@Param("record") STransport record, @Param("example") STransportExample example);

    int updateByPrimaryKeySelective(STransport record);

    int updateByPrimaryKey(STransport record);
}