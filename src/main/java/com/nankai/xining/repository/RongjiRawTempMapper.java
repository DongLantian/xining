package com.nankai.xining.repository;

import com.nankai.xining.bean.RongjiRawTemp;
import com.nankai.xining.bean.RongjiRawTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RongjiRawTempMapper {
    long countByExample(RongjiRawTempExample example);

    int deleteByExample(RongjiRawTempExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RongjiRawTemp record);

    int insertSelective(RongjiRawTemp record);

    List<RongjiRawTemp> selectByExample(RongjiRawTempExample example);

    RongjiRawTemp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RongjiRawTemp record, @Param("example") RongjiRawTempExample example);

    int updateByExample(@Param("record") RongjiRawTemp record, @Param("example") RongjiRawTempExample example);

    int updateByPrimaryKeySelective(RongjiRawTemp record);

    int updateByPrimaryKey(RongjiRawTemp record);
}