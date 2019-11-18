package com.nankai.xining.repository;

import com.nankai.xining.bean.Scc2;
import com.nankai.xining.bean.Scc2Example;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Scc2Mapper {
    long countByExample(Scc2Example example);

    int deleteByExample(Scc2Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(Scc2 record);

    int insertSelective(Scc2 record);

    List<Scc2> selectByExample(Scc2Example example);

    Scc2 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Scc2 record, @Param("example") Scc2Example example);

    int updateByExample(@Param("record") Scc2 record, @Param("example") Scc2Example example);

    int updateByPrimaryKeySelective(Scc2 record);

    int updateByPrimaryKey(Scc2 record);
}