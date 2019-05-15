package com.nankai.xining.repository;

import com.nankai.xining.bean.Scc4;
import com.nankai.xining.bean.Scc4Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Scc4Mapper {
    long countByExample(Scc4Example example);

    int deleteByExample(Scc4Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(Scc4 record);

    int insertSelective(Scc4 record);

    List<Scc4> selectByExample(Scc4Example example);

    Scc4 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Scc4 record, @Param("example") Scc4Example example);

    int updateByExample(@Param("record") Scc4 record, @Param("example") Scc4Example example);

    int updateByPrimaryKeySelective(Scc4 record);

    int updateByPrimaryKey(Scc4 record);
}