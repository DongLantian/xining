package com.nankai.xining.repository;

import com.nankai.xining.bean.Industry;
import com.nankai.xining.bean.IndustryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndustryMapper {
    long countByExample(IndustryExample example);

    int deleteByExample(IndustryExample example);

    int deleteByPrimaryKey(String industryId);

    int insert(Industry record);

    int insertSelective(Industry record);

    List<Industry> selectByExampleWithBLOBs(IndustryExample example);

    List<Industry> selectByExample(IndustryExample example);

    Industry selectByPrimaryKey(String industryId);

    int updateByExampleSelective(@Param("record") Industry record, @Param("example") IndustryExample example);

    int updateByExampleWithBLOBs(@Param("record") Industry record, @Param("example") IndustryExample example);

    int updateByExample(@Param("record") Industry record, @Param("example") IndustryExample example);

    int updateByPrimaryKeySelective(Industry record);

    int updateByPrimaryKeyWithBLOBs(Industry record);

    int updateByPrimaryKey(Industry record);
}