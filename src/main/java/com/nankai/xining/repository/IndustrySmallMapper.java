package com.nankai.xining.repository;

import com.nankai.xining.bean.IndustrySmall;
import com.nankai.xining.bean.IndustrySmallExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IndustrySmallMapper {
    long countByExample(IndustrySmallExample example);

    int deleteByExample(IndustrySmallExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IndustrySmall record);

    int insertSelective(IndustrySmall record);

    List<IndustrySmall> selectByExample(IndustrySmallExample example);

    IndustrySmall selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IndustrySmall record, @Param("example") IndustrySmallExample example);

    int updateByExample(@Param("record") IndustrySmall record, @Param("example") IndustrySmallExample example);

    int updateByPrimaryKeySelective(IndustrySmall record);

    int updateByPrimaryKey(IndustrySmall record);
}