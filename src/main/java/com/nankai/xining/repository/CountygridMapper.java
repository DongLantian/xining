package com.nankai.xining.repository;

import com.nankai.xining.bean.Countygrid;
import com.nankai.xining.bean.CountygridExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CountygridMapper {
    long countByExample(CountygridExample example);

    int deleteByExample(CountygridExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Countygrid record);

    int insertSelective(Countygrid record);

    List<Countygrid> selectByExample(CountygridExample example);

    Countygrid selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Countygrid record, @Param("example") CountygridExample example);

    int updateByExample(@Param("record") Countygrid record, @Param("example") CountygridExample example);

    int updateByPrimaryKeySelective(Countygrid record);

    int updateByPrimaryKey(Countygrid record);
}