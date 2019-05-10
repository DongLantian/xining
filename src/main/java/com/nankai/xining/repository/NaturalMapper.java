package com.nankai.xining.repository;

import com.nankai.xining.bean.Natural;
import com.nankai.xining.bean.NaturalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NaturalMapper {
    long countByExample(NaturalExample example);

    int deleteByExample(NaturalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Natural record);

    int insertSelective(Natural record);

    List<Natural> selectByExample(NaturalExample example);

    Natural selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Natural record, @Param("example") NaturalExample example);

    int updateByExample(@Param("record") Natural record, @Param("example") NaturalExample example);

    int updateByPrimaryKeySelective(Natural record);

    int updateByPrimaryKey(Natural record);
}