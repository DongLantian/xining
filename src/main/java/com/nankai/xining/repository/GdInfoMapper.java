package com.nankai.xining.repository;

import com.nankai.xining.bean.GdInfo;
import com.nankai.xining.bean.GdInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GdInfoMapper {
    long countByExample(GdInfoExample example);

    int deleteByExample(GdInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GdInfo record);

    int insertSelective(GdInfo record);

    List<GdInfo> selectByExample(GdInfoExample example);

    GdInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GdInfo record, @Param("example") GdInfoExample example);

    int updateByExample(@Param("record") GdInfo record, @Param("example") GdInfoExample example);

    int updateByPrimaryKeySelective(GdInfo record);

    int updateByPrimaryKey(GdInfo record);
}