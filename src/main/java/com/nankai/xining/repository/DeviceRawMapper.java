package com.nankai.xining.repository;

import com.nankai.xining.bean.DeviceRaw;
import com.nankai.xining.bean.DeviceRawExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRawMapper {
    long countByExample(DeviceRawExample example);

    int deleteByExample(DeviceRawExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeviceRaw record);

    int insertSelective(DeviceRaw record);

    List<DeviceRaw> selectByExample(DeviceRawExample example);

    DeviceRaw selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeviceRaw record, @Param("example") DeviceRawExample example);

    int updateByExample(@Param("record") DeviceRaw record, @Param("example") DeviceRawExample example);

    int updateByPrimaryKeySelective(DeviceRaw record);

    int updateByPrimaryKey(DeviceRaw record);

    List<DeviceRaw> selectByFactoryIdWithJoin(int factoryId);
}