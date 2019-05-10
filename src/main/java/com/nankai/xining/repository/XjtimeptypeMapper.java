package com.nankai.xining.repository;

import com.nankai.xining.bean.Xjtimeptype;
import com.nankai.xining.bean.XjtimeptypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XjtimeptypeMapper {
    long countByExample(XjtimeptypeExample example);

    int deleteByExample(XjtimeptypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Xjtimeptype record);

    int insertSelective(Xjtimeptype record);

    List<Xjtimeptype> selectByExample(XjtimeptypeExample example);

    Xjtimeptype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Xjtimeptype record, @Param("example") XjtimeptypeExample example);

    int updateByExample(@Param("record") Xjtimeptype record, @Param("example") XjtimeptypeExample example);

    int updateByPrimaryKeySelective(Xjtimeptype record);

    int updateByPrimaryKey(Xjtimeptype record);
}