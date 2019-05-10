package com.nankai.xining.repository;

import com.nankai.xining.bean.SolventTemp;
import com.nankai.xining.bean.SolventTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SolventTempMapper {
    long countByExample(SolventTempExample example);

    int deleteByExample(SolventTempExample example);

    int deleteByPrimaryKey(Integer solventId);

    int insert(SolventTemp record);

    int insertSelective(SolventTemp record);

    List<SolventTemp> selectByExampleWithBLOBs(SolventTempExample example);

    List<SolventTemp> selectByExample(SolventTempExample example);

    SolventTemp selectByPrimaryKey(Integer solventId);

    int updateByExampleSelective(@Param("record") SolventTemp record, @Param("example") SolventTempExample example);

    int updateByExampleWithBLOBs(@Param("record") SolventTemp record, @Param("example") SolventTempExample example);

    int updateByExample(@Param("record") SolventTemp record, @Param("example") SolventTempExample example);

    int updateByPrimaryKeySelective(SolventTemp record);

    int updateByPrimaryKeyWithBLOBs(SolventTemp record);

    int updateByPrimaryKey(SolventTemp record);
}