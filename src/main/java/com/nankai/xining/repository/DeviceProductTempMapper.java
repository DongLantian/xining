package com.nankai.xining.repository;

import com.nankai.xining.bean.DeviceProductTemp;
import com.nankai.xining.bean.DeviceProductTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceProductTempMapper {
    long countByExample(DeviceProductTempExample example);

    int deleteByExample(DeviceProductTempExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeviceProductTemp record);

    int insertSelective(DeviceProductTemp record);

    List<DeviceProductTemp> selectByExample(DeviceProductTempExample example);

    DeviceProductTemp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeviceProductTemp record, @Param("example") DeviceProductTempExample example);

    int updateByExample(@Param("record") DeviceProductTemp record, @Param("example") DeviceProductTempExample example);

    int updateByPrimaryKeySelective(DeviceProductTemp record);

    int updateByPrimaryKey(DeviceProductTemp record);

    List<DeviceProductTemp> selectByFactoryIdWithJoin(int factoryId);
}