package com.nankai.xining.repository;

import com.nankai.xining.bean.Wydustdata;
import com.nankai.xining.bean.WydustdataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WydustdataMapper {
    long countByExample(WydustdataExample example);

    int deleteByExample(WydustdataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Wydustdata record);

    int insertSelective(Wydustdata record);

    List<Wydustdata> selectByExample(WydustdataExample example);

    Wydustdata selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Wydustdata record, @Param("example") WydustdataExample example);

    int updateByExample(@Param("record") Wydustdata record, @Param("example") WydustdataExample example);

    int updateByPrimaryKeySelective(Wydustdata record);

    int updateByPrimaryKey(Wydustdata record);
}