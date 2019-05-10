package com.nankai.xining.repository;

import com.nankai.xining.bean.SmallMachinery;
import com.nankai.xining.bean.SmallMachineryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmallMachineryMapper {
    long countByExample(SmallMachineryExample example);

    int deleteByExample(SmallMachineryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SmallMachinery record);

    int insertSelective(SmallMachinery record);

    List<SmallMachinery> selectByExample(SmallMachineryExample example);

    SmallMachinery selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmallMachinery record, @Param("example") SmallMachineryExample example);

    int updateByExample(@Param("record") SmallMachinery record, @Param("example") SmallMachineryExample example);

    int updateByPrimaryKeySelective(SmallMachinery record);

    int updateByPrimaryKey(SmallMachinery record);
}