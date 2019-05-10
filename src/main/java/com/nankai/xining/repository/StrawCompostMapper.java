package com.nankai.xining.repository;

import com.nankai.xining.bean.StrawCompost;
import com.nankai.xining.bean.StrawCompostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StrawCompostMapper {
    long countByExample(StrawCompostExample example);

    int deleteByExample(StrawCompostExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StrawCompost record);

    int insertSelective(StrawCompost record);

    List<StrawCompost> selectByExample(StrawCompostExample example);

    StrawCompost selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StrawCompost record, @Param("example") StrawCompostExample example);

    int updateByExample(@Param("record") StrawCompost record, @Param("example") StrawCompostExample example);

    int updateByPrimaryKeySelective(StrawCompost record);

    int updateByPrimaryKey(StrawCompost record);
}