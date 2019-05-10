package com.nankai.xining.repository;

import com.nankai.xining.bean.DeviceTemp;
import com.nankai.xining.bean.DeviceTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceTempMapper {
    long countByExample(DeviceTempExample example);

    int deleteByExample(DeviceTempExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeviceTemp record);

    int insertSelective(DeviceTemp record);

    List<DeviceTemp> selectByExample(DeviceTempExample example);

    DeviceTemp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeviceTemp record, @Param("example") DeviceTempExample example);

    int updateByExample(@Param("record") DeviceTemp record, @Param("example") DeviceTempExample example);

    int updateByPrimaryKeySelective(DeviceTemp record);

    int updateByPrimaryKey(DeviceTemp record);
}