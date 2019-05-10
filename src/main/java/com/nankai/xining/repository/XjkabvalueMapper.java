package com.nankai.xining.repository;

import com.nankai.xining.bean.Xjkabvalue;
import com.nankai.xining.bean.XjkabvalueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XjkabvalueMapper {
    long countByExample(XjkabvalueExample example);

    int deleteByExample(XjkabvalueExample example);

    int deleteByPrimaryKey(Integer sdKabvalueid);

    int insert(Xjkabvalue record);

    int insertSelective(Xjkabvalue record);

    List<Xjkabvalue> selectByExample(XjkabvalueExample example);

    Xjkabvalue selectByPrimaryKey(Integer sdKabvalueid);

    int updateByExampleSelective(@Param("record") Xjkabvalue record, @Param("example") XjkabvalueExample example);

    int updateByExample(@Param("record") Xjkabvalue record, @Param("example") XjkabvalueExample example);

    int updateByPrimaryKeySelective(Xjkabvalue record);

    int updateByPrimaryKey(Xjkabvalue record);
}