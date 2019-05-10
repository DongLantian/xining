package com.nankai.xining.repository;

import com.nankai.xining.bean.S2S2;
import com.nankai.xining.bean.S2S2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface S2S2Mapper {
    long countByExample(S2S2Example example);

    int deleteByExample(S2S2Example example);

    int insert(S2S2 record);

    int insertSelective(S2S2 record);

    List<S2S2> selectByExample(S2S2Example example);

    int updateByExampleSelective(@Param("record") S2S2 record, @Param("example") S2S2Example example);

    int updateByExample(@Param("record") S2S2 record, @Param("example") S2S2Example example);
}