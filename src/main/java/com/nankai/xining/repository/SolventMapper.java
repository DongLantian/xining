package com.nankai.xining.repository;

import com.nankai.xining.bean.Solvent;
import com.nankai.xining.bean.SolventExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SolventMapper {
    long countByExample(SolventExample example);

    int deleteByExample(SolventExample example);

    int deleteByPrimaryKey(Integer solventId);

    int insert(Solvent record);

    int insertSelective(Solvent record);

    List<Solvent> selectByExampleWithBLOBs(SolventExample example);

    List<Solvent> selectByExample(SolventExample example);

    Solvent selectByPrimaryKey(Integer solventId);

    int updateByExampleSelective(@Param("record") Solvent record, @Param("example") SolventExample example);

    int updateByExampleWithBLOBs(@Param("record") Solvent record, @Param("example") SolventExample example);

    int updateByExample(@Param("record") Solvent record, @Param("example") SolventExample example);

    int updateByPrimaryKeySelective(Solvent record);

    int updateByPrimaryKeyWithBLOBs(Solvent record);

    int updateByPrimaryKey(Solvent record);
}