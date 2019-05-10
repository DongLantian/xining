package com.nankai.xining.repository;

import com.nankai.xining.bean.ShGasemission;
import com.nankai.xining.bean.ShGasemissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShGasemissionMapper {
    long countByExample(ShGasemissionExample example);

    int deleteByExample(ShGasemissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShGasemission record);

    int insertSelective(ShGasemission record);

    List<ShGasemission> selectByExample(ShGasemissionExample example);

    ShGasemission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShGasemission record, @Param("example") ShGasemissionExample example);

    int updateByExample(@Param("record") ShGasemission record, @Param("example") ShGasemissionExample example);

    int updateByPrimaryKeySelective(ShGasemission record);

    int updateByPrimaryKey(ShGasemission record);
}