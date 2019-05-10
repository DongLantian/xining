package com.nankai.xining.repository;

import com.nankai.xining.bean.Sealrawmaterial;
import com.nankai.xining.bean.SealrawmaterialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SealrawmaterialMapper {
    long countByExample(SealrawmaterialExample example);

    int deleteByExample(SealrawmaterialExample example);

    int deleteByPrimaryKey(Integer materialid);

    int insert(Sealrawmaterial record);

    int insertSelective(Sealrawmaterial record);

    List<Sealrawmaterial> selectByExample(SealrawmaterialExample example);

    Sealrawmaterial selectByPrimaryKey(Integer materialid);

    int updateByExampleSelective(@Param("record") Sealrawmaterial record, @Param("example") SealrawmaterialExample example);

    int updateByExample(@Param("record") Sealrawmaterial record, @Param("example") SealrawmaterialExample example);

    int updateByPrimaryKeySelective(Sealrawmaterial record);

    int updateByPrimaryKey(Sealrawmaterial record);
}