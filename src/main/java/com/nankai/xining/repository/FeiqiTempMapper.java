package com.nankai.xining.repository;

import com.nankai.xining.bean.FeiqiTemp;
import com.nankai.xining.bean.FeiqiTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FeiqiTempMapper {
    long countByExample(FeiqiTempExample example);

    int deleteByExample(FeiqiTempExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FeiqiTemp record);

    int insertSelective(FeiqiTemp record);

    List<FeiqiTemp> selectByExample(FeiqiTempExample example);

    FeiqiTemp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FeiqiTemp record, @Param("example") FeiqiTempExample example);

    int updateByExample(@Param("record") FeiqiTemp record, @Param("example") FeiqiTempExample example);

    int updateByPrimaryKeySelective(FeiqiTemp record);

    int updateByPrimaryKey(FeiqiTemp record);

}