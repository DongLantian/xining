package com.nankai.xining.repository;

import com.nankai.xining.bean.XjcydustLoad;
import com.nankai.xining.bean.XjcydustLoadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XjcydustLoadMapper {
    long countByExample(XjcydustLoadExample example);

    int deleteByExample(XjcydustLoadExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XjcydustLoad record);

    int insertSelective(XjcydustLoad record);

    List<XjcydustLoad> selectByExample(XjcydustLoadExample example);

    XjcydustLoad selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XjcydustLoad record, @Param("example") XjcydustLoadExample example);

    int updateByExample(@Param("record") XjcydustLoad record, @Param("example") XjcydustLoadExample example);

    int updateByPrimaryKeySelective(XjcydustLoad record);

    int updateByPrimaryKey(XjcydustLoad record);
}