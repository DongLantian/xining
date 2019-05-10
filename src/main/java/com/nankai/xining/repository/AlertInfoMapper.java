package com.nankai.xining.repository;

import com.nankai.xining.bean.AlertInfo;
import com.nankai.xining.bean.AlertInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlertInfoMapper {
    long countByExample(AlertInfoExample example);

    int deleteByExample(AlertInfoExample example);

    int deleteByPrimaryKey(Integer aId);

    int insert(AlertInfo record);

    int insertSelective(AlertInfo record);

    List<AlertInfo> selectByExampleWithBLOBs(AlertInfoExample example);

    List<AlertInfo> selectByExample(AlertInfoExample example);

    AlertInfo selectByPrimaryKey(Integer aId);

    int updateByExampleSelective(@Param("record") AlertInfo record, @Param("example") AlertInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") AlertInfo record, @Param("example") AlertInfoExample example);

    int updateByExample(@Param("record") AlertInfo record, @Param("example") AlertInfoExample example);

    int updateByPrimaryKeySelective(AlertInfo record);

    int updateByPrimaryKeyWithBLOBs(AlertInfo record);

    int updateByPrimaryKey(AlertInfo record);
}