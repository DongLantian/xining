package com.nankai.xining.repository;

import com.nankai.xining.bean.Scc1;
import com.nankai.xining.bean.Scc1Example;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Scc1Mapper {
    long countByExample(Scc1Example example);

    int deleteByExample(Scc1Example example);

    int deleteByPrimaryKey(String scc1);

    int insert(Scc1 record);

    int insertSelective(Scc1 record);

    List<Scc1> selectByExample(Scc1Example example);

    Scc1 selectByPrimaryKey(String scc1);

    int updateByExampleSelective(@Param("record") Scc1 record, @Param("example") Scc1Example example);

    int updateByExample(@Param("record") Scc1 record, @Param("example") Scc1Example example);

    int updateByPrimaryKeySelective(Scc1 record);

    int updateByPrimaryKey(Scc1 record);
}