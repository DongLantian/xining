package com.nankai.xining.repository;

import com.nankai.xining.bean.XjtimeptypeCopy;
import com.nankai.xining.bean.XjtimeptypeCopyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XjtimeptypeCopyMapper {
    long countByExample(XjtimeptypeCopyExample example);

    int deleteByExample(XjtimeptypeCopyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XjtimeptypeCopy record);

    int insertSelective(XjtimeptypeCopy record);

    List<XjtimeptypeCopy> selectByExample(XjtimeptypeCopyExample example);

    XjtimeptypeCopy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XjtimeptypeCopy record, @Param("example") XjtimeptypeCopyExample example);

    int updateByExample(@Param("record") XjtimeptypeCopy record, @Param("example") XjtimeptypeCopyExample example);

    int updateByPrimaryKeySelective(XjtimeptypeCopy record);

    int updateByPrimaryKey(XjtimeptypeCopy record);
}