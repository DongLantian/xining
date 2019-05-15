package com.nankai.xining.repository;

import com.nankai.xining.bean.Scc3;
import com.nankai.xining.bean.Scc3Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Scc3Mapper {
    long countByExample(Scc3Example example);

    int deleteByExample(Scc3Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(Scc3 record);

    int insertSelective(Scc3 record);

    List<Scc3> selectByExample(Scc3Example example);

    Scc3 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Scc3 record, @Param("example") Scc3Example example);

    int updateByExample(@Param("record") Scc3 record, @Param("example") Scc3Example example);

    int updateByPrimaryKeySelective(Scc3 record);

    int updateByPrimaryKey(Scc3 record);
}