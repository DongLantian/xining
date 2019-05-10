package com.nankai.xining.repository;

import com.nankai.xining.bean.DeviceRawTemp;
import com.nankai.xining.bean.DeviceRawTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceRawTempMapper {
    long countByExample(DeviceRawTempExample example);

    int deleteByExample(DeviceRawTempExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeviceRawTemp record);

    int insertSelective(DeviceRawTemp record);

    List<DeviceRawTemp> selectByExample(DeviceRawTempExample example);

    DeviceRawTemp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeviceRawTemp record, @Param("example") DeviceRawTempExample example);

    int updateByExample(@Param("record") DeviceRawTemp record, @Param("example") DeviceRawTempExample example);

    int updateByPrimaryKeySelective(DeviceRawTemp record);

    int updateByPrimaryKey(DeviceRawTemp record);
}