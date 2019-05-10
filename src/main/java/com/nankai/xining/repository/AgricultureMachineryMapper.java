package com.nankai.xining.repository;

import com.nankai.xining.bean.AgricultureMachinery;
import com.nankai.xining.bean.AgricultureMachineryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgricultureMachineryMapper {
    long countByExample(AgricultureMachineryExample example);

    int deleteByExample(AgricultureMachineryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AgricultureMachinery record);

    int insertSelective(AgricultureMachinery record);

    List<AgricultureMachinery> selectByExample(AgricultureMachineryExample example);

    AgricultureMachinery selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AgricultureMachinery record, @Param("example") AgricultureMachineryExample example);

    int updateByExample(@Param("record") AgricultureMachinery record, @Param("example") AgricultureMachineryExample example);

    int updateByPrimaryKeySelective(AgricultureMachinery record);

    int updateByPrimaryKey(AgricultureMachinery record);
}