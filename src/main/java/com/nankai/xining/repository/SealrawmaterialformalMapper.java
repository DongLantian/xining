package com.nankai.xining.repository;

import com.nankai.xining.bean.Sealrawmaterialformal;
import com.nankai.xining.bean.SealrawmaterialformalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SealrawmaterialformalMapper {
    long countByExample(SealrawmaterialformalExample example);

    int deleteByExample(SealrawmaterialformalExample example);

    int deleteByPrimaryKey(Integer materialid);

    int insert(Sealrawmaterialformal record);

    int insertSelective(Sealrawmaterialformal record);

    List<Sealrawmaterialformal> selectByExample(SealrawmaterialformalExample example);

    Sealrawmaterialformal selectByPrimaryKey(Integer materialid);

    int updateByExampleSelective(@Param("record") Sealrawmaterialformal record, @Param("example") SealrawmaterialformalExample example);

    int updateByExample(@Param("record") Sealrawmaterialformal record, @Param("example") SealrawmaterialformalExample example);

    int updateByPrimaryKeySelective(Sealrawmaterialformal record);

    int updateByPrimaryKey(Sealrawmaterialformal record);
}