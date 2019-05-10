package com.nankai.xining.repository;

import com.nankai.xining.bean.Previsiprec;
import com.nankai.xining.bean.PrevisiprecExample;
import com.nankai.xining.bean.PrevisiprecKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrevisiprecMapper {
    long countByExample(PrevisiprecExample example);

    int deleteByExample(PrevisiprecExample example);

    int deleteByPrimaryKey(PrevisiprecKey key);

    int insert(Previsiprec record);

    int insertSelective(Previsiprec record);

    List<Previsiprec> selectByExample(PrevisiprecExample example);

    Previsiprec selectByPrimaryKey(PrevisiprecKey key);

    int updateByExampleSelective(@Param("record") Previsiprec record, @Param("example") PrevisiprecExample example);

    int updateByExample(@Param("record") Previsiprec record, @Param("example") PrevisiprecExample example);

    int updateByPrimaryKeySelective(Previsiprec record);

    int updateByPrimaryKey(Previsiprec record);
}