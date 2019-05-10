package com.nankai.xining.repository;

import com.nankai.xining.bean.NongmuWeight;
import com.nankai.xining.bean.NongmuWeightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NongmuWeightMapper {
    long countByExample(NongmuWeightExample example);

    int deleteByExample(NongmuWeightExample example);

    int deleteByPrimaryKey(Integer fishnetId);

    int insert(NongmuWeight record);

    int insertSelective(NongmuWeight record);

    List<NongmuWeight> selectByExample(NongmuWeightExample example);

    NongmuWeight selectByPrimaryKey(Integer fishnetId);

    int updateByExampleSelective(@Param("record") NongmuWeight record, @Param("example") NongmuWeightExample example);

    int updateByExample(@Param("record") NongmuWeight record, @Param("example") NongmuWeightExample example);

    int updateByPrimaryKeySelective(NongmuWeight record);

    int updateByPrimaryKey(NongmuWeight record);
}