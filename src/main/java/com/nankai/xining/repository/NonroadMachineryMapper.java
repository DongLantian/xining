package com.nankai.xining.repository;

import com.nankai.xining.bean.NonroadMachinery;
import com.nankai.xining.bean.NonroadMachineryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NonroadMachineryMapper {
    long countByExample(NonroadMachineryExample example);

    int deleteByExample(NonroadMachineryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NonroadMachinery record);

    int insertSelective(NonroadMachinery record);

    List<NonroadMachinery> selectByExample(NonroadMachineryExample example);

    NonroadMachinery selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NonroadMachinery record, @Param("example") NonroadMachineryExample example);

    int updateByExample(@Param("record") NonroadMachinery record, @Param("example") NonroadMachineryExample example);

    int updateByPrimaryKeySelective(NonroadMachinery record);

    int updateByPrimaryKey(NonroadMachinery record);
}