package com.nankai.xining.repository;

import com.nankai.xining.bean.GdView;
import com.nankai.xining.bean.GdViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GdViewMapper {
    long countByExample(GdViewExample example);

    int deleteByExample(GdViewExample example);

    int insert(GdView record);

    int insertSelective(GdView record);

    List<GdView> selectByExample(GdViewExample example);

    int updateByExampleSelective(@Param("record") GdView record, @Param("example") GdViewExample example);

    int updateByExample(@Param("record") GdView record, @Param("example") GdViewExample example);
}