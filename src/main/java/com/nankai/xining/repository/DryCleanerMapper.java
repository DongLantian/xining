package com.nankai.xining.repository;

import com.nankai.xining.bean.DryCleaner;
import com.nankai.xining.bean.DryCleanerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DryCleanerMapper {
    long countByExample(DryCleanerExample example);

    int deleteByExample(DryCleanerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DryCleaner record);

    int insertSelective(DryCleaner record);

    List<DryCleaner> selectByExample(DryCleanerExample example);

    DryCleaner selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DryCleaner record, @Param("example") DryCleanerExample example);

    int updateByExample(@Param("record") DryCleaner record, @Param("example") DryCleanerExample example);

    int updateByPrimaryKeySelective(DryCleaner record);

    int updateByPrimaryKey(DryCleaner record);
}