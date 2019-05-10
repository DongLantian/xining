package com.nankai.xining.repository;

import com.nankai.xining.bean.Exsproduct;
import com.nankai.xining.bean.ExsproductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExsproductMapper {
    long countByExample(ExsproductExample example);

    int deleteByExample(ExsproductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Exsproduct record);

    int insertSelective(Exsproduct record);

    List<Exsproduct> selectByExample(ExsproductExample example);

    Exsproduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Exsproduct record, @Param("example") ExsproductExample example);

    int updateByExample(@Param("record") Exsproduct record, @Param("example") ExsproductExample example);

    int updateByPrimaryKeySelective(Exsproduct record);

    int updateByPrimaryKey(Exsproduct record);
}