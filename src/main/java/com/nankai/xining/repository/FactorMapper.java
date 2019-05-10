package com.nankai.xining.repository;

import com.nankai.xining.bean.Factor;
import com.nankai.xining.bean.FactorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FactorMapper {
    long countByExample(FactorExample example);

    int deleteByExample(FactorExample example);

    int deleteByPrimaryKey(Integer factorid);

    int insert(Factor record);

    int insertSelective(Factor record);

    List<Factor> selectByExample(FactorExample example);

    Factor selectByPrimaryKey(Integer factorid);

    int updateByExampleSelective(@Param("record") Factor record, @Param("example") FactorExample example);

    int updateByExample(@Param("record") Factor record, @Param("example") FactorExample example);

    int updateByPrimaryKeySelective(Factor record);

    int updateByPrimaryKey(Factor record);
}