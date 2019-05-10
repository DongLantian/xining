package com.nankai.xining.repository;

import com.nankai.xining.bean.IndustryBig;
import com.nankai.xining.bean.IndustryBigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndustryBigMapper {
    long countByExample(IndustryBigExample example);

    int deleteByExample(IndustryBigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IndustryBig record);

    int insertSelective(IndustryBig record);

    List<IndustryBig> selectByExample(IndustryBigExample example);

    IndustryBig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IndustryBig record, @Param("example") IndustryBigExample example);

    int updateByExample(@Param("record") IndustryBig record, @Param("example") IndustryBigExample example);

    int updateByPrimaryKeySelective(IndustryBig record);

    int updateByPrimaryKey(IndustryBig record);
}