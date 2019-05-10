package com.nankai.xining.repository;

import com.nankai.xining.bean.Xjroaddust;
import com.nankai.xining.bean.XjroaddustExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XjroaddustMapper {
    long countByExample(XjroaddustExample example);

    int deleteByExample(XjroaddustExample example);

    int deleteByPrimaryKey(Integer rdId);

    int insert(Xjroaddust record);

    int insertSelective(Xjroaddust record);

    List<Xjroaddust> selectByExample(XjroaddustExample example);

    Xjroaddust selectByPrimaryKey(Integer rdId);

    int updateByExampleSelective(@Param("record") Xjroaddust record, @Param("example") XjroaddustExample example);

    int updateByExample(@Param("record") Xjroaddust record, @Param("example") XjroaddustExample example);

    int updateByPrimaryKeySelective(Xjroaddust record);

    int updateByPrimaryKey(Xjroaddust record);
}