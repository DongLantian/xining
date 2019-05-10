package com.nankai.xining.repository;

import com.nankai.xining.bean.Tankemission;
import com.nankai.xining.bean.TankemissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TankemissionMapper {
    long countByExample(TankemissionExample example);

    int deleteByExample(TankemissionExample example);

    int deleteByPrimaryKey(Integer tanksurveyid);

    int insert(Tankemission record);

    int insertSelective(Tankemission record);

    List<Tankemission> selectByExample(TankemissionExample example);

    Tankemission selectByPrimaryKey(Integer tanksurveyid);

    int updateByExampleSelective(@Param("record") Tankemission record, @Param("example") TankemissionExample example);

    int updateByExample(@Param("record") Tankemission record, @Param("example") TankemissionExample example);

    int updateByPrimaryKeySelective(Tankemission record);

    int updateByPrimaryKey(Tankemission record);
}