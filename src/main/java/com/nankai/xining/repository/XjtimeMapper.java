package com.nankai.xining.repository;

import com.nankai.xining.bean.Xjtime;
import com.nankai.xining.bean.XjtimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XjtimeMapper {
    long countByExample(XjtimeExample example);

    int deleteByExample(XjtimeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Xjtime record);

    int insertSelective(Xjtime record);

    List<Xjtime> selectByExample(XjtimeExample example);

    Xjtime selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Xjtime record, @Param("example") XjtimeExample example);

    int updateByExample(@Param("record") Xjtime record, @Param("example") XjtimeExample example);

    int updateByPrimaryKeySelective(Xjtime record);

    int updateByPrimaryKey(Xjtime record);
}