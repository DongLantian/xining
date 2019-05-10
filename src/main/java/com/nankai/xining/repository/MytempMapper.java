package com.nankai.xining.repository;

import com.nankai.xining.bean.Mytemp;
import com.nankai.xining.bean.MytempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MytempMapper {
    long countByExample(MytempExample example);

    int deleteByExample(MytempExample example);

    int insert(Mytemp record);

    int insertSelective(Mytemp record);

    List<Mytemp> selectByExample(MytempExample example);

    int updateByExampleSelective(@Param("record") Mytemp record, @Param("example") MytempExample example);

    int updateByExample(@Param("record") Mytemp record, @Param("example") MytempExample example);
}