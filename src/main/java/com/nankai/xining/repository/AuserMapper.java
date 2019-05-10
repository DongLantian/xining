package com.nankai.xining.repository;

import com.nankai.xining.bean.Auser;
import com.nankai.xining.bean.AuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuserMapper {
    long countByExample(AuserExample example);

    int deleteByExample(AuserExample example);

    int insert(Auser record);

    int insertSelective(Auser record);

    List<Auser> selectByExample(AuserExample example);

    int updateByExampleSelective(@Param("record") Auser record, @Param("example") AuserExample example);

    int updateByExample(@Param("record") Auser record, @Param("example") AuserExample example);
}