package com.nankai.xining.repository;

import com.nankai.xining.bean.Sealproduct;
import com.nankai.xining.bean.SealproductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SealproductMapper {
    long countByExample(SealproductExample example);

    int deleteByExample(SealproductExample example);

    int deleteByPrimaryKey(Integer productid);

    int insert(Sealproduct record);

    int insertSelective(Sealproduct record);

    List<Sealproduct> selectByExample(SealproductExample example);

    Sealproduct selectByPrimaryKey(Integer productid);

    int updateByExampleSelective(@Param("record") Sealproduct record, @Param("example") SealproductExample example);

    int updateByExample(@Param("record") Sealproduct record, @Param("example") SealproductExample example);

    int updateByPrimaryKeySelective(Sealproduct record);

    int updateByPrimaryKey(Sealproduct record);
}