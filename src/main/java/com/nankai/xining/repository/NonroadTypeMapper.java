package com.nankai.xining.repository;

import com.nankai.xining.bean.NonroadType;
import com.nankai.xining.bean.NonroadTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NonroadTypeMapper {
    long countByExample(NonroadTypeExample example);

    int deleteByExample(NonroadTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NonroadType record);

    int insertSelective(NonroadType record);

    List<NonroadType> selectByExample(NonroadTypeExample example);

    NonroadType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NonroadType record, @Param("example") NonroadTypeExample example);

    int updateByExample(@Param("record") NonroadType record, @Param("example") NonroadTypeExample example);

    int updateByPrimaryKeySelective(NonroadType record);

    int updateByPrimaryKey(NonroadType record);
}