package com.nankai.xining.repository;

import com.nankai.xining.bean.DeviceProduct;
import com.nankai.xining.bean.DeviceProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceProductMapper {
    long countByExample(DeviceProductExample example);

    int deleteByExample(DeviceProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeviceProduct record);

    int insertSelective(DeviceProduct record);

    List<DeviceProduct> selectByExample(DeviceProductExample example);

    DeviceProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeviceProduct record, @Param("example") DeviceProductExample example);

    int updateByExample(@Param("record") DeviceProduct record, @Param("example") DeviceProductExample example);

    int updateByPrimaryKeySelective(DeviceProduct record);

    int updateByPrimaryKey(DeviceProduct record);
}