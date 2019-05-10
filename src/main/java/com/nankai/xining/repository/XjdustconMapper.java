package com.nankai.xining.repository;

import com.nankai.xining.bean.Xjdustcon;
import com.nankai.xining.bean.XjdustconExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XjdustconMapper {
    long countByExample(XjdustconExample example);

    int deleteByExample(XjdustconExample example);

    int deleteByPrimaryKey(Integer dustcontrlId);

    int insert(Xjdustcon record);

    int insertSelective(Xjdustcon record);

    List<Xjdustcon> selectByExampleWithBLOBs(XjdustconExample example);

    List<Xjdustcon> selectByExample(XjdustconExample example);

    Xjdustcon selectByPrimaryKey(Integer dustcontrlId);

    int updateByExampleSelective(@Param("record") Xjdustcon record, @Param("example") XjdustconExample example);

    int updateByExampleWithBLOBs(@Param("record") Xjdustcon record, @Param("example") XjdustconExample example);

    int updateByExample(@Param("record") Xjdustcon record, @Param("example") XjdustconExample example);

    int updateByPrimaryKeySelective(Xjdustcon record);

    int updateByPrimaryKeyWithBLOBs(Xjdustcon record);

    int updateByPrimaryKey(Xjdustcon record);
}