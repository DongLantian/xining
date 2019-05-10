package com.nankai.xining.repository;

import com.nankai.xining.bean.SolventEquTemp;
import com.nankai.xining.bean.SolventEquTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SolventEquTempMapper {
    long countByExample(SolventEquTempExample example);

    int deleteByExample(SolventEquTempExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SolventEquTemp record);

    int insertSelective(SolventEquTemp record);

    List<SolventEquTemp> selectByExample(SolventEquTempExample example);

    SolventEquTemp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SolventEquTemp record, @Param("example") SolventEquTempExample example);

    int updateByExample(@Param("record") SolventEquTemp record, @Param("example") SolventEquTempExample example);

    int updateByPrimaryKeySelective(SolventEquTemp record);

    int updateByPrimaryKey(SolventEquTemp record);
}