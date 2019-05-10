package com.nankai.xining.repository;

import com.nankai.xining.bean.Sealproductformal;
import com.nankai.xining.bean.SealproductformalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SealproductformalMapper {
    long countByExample(SealproductformalExample example);

    int deleteByExample(SealproductformalExample example);

    int deleteByPrimaryKey(Integer productid);

    int insert(Sealproductformal record);

    int insertSelective(Sealproductformal record);

    List<Sealproductformal> selectByExample(SealproductformalExample example);

    Sealproductformal selectByPrimaryKey(Integer productid);

    int updateByExampleSelective(@Param("record") Sealproductformal record, @Param("example") SealproductformalExample example);

    int updateByExample(@Param("record") Sealproductformal record, @Param("example") SealproductformalExample example);

    int updateByPrimaryKeySelective(Sealproductformal record);

    int updateByPrimaryKey(Sealproductformal record);
}