package com.nankai.xining.repository;

import com.nankai.xining.bean.Wastewaterformal;
import com.nankai.xining.bean.WastewaterformalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WastewaterformalMapper {
    long countByExample(WastewaterformalExample example);

    int deleteByExample(WastewaterformalExample example);

    int deleteByPrimaryKey(Integer wastewaterid);

    int insert(Wastewaterformal record);

    int insertSelective(Wastewaterformal record);

    List<Wastewaterformal> selectByExample(WastewaterformalExample example);

    Wastewaterformal selectByPrimaryKey(Integer wastewaterid);

    int updateByExampleSelective(@Param("record") Wastewaterformal record, @Param("example") WastewaterformalExample example);

    int updateByExample(@Param("record") Wastewaterformal record, @Param("example") WastewaterformalExample example);

    int updateByPrimaryKeySelective(Wastewaterformal record);

    int updateByPrimaryKey(Wastewaterformal record);
}