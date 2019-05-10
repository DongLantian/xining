package com.nankai.xining.repository;

import com.nankai.xining.bean.Boiler;
import com.nankai.xining.bean.BoilerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BoilerMapper {
    long countByExample(BoilerExample example);

    int deleteByExample(BoilerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Boiler record);

    int insertSelective(Boiler record);

    List<Boiler> selectByExample(BoilerExample example);

    Boiler selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Boiler record, @Param("example") BoilerExample example);

    int updateByExample(@Param("record") Boiler record, @Param("example") BoilerExample example);

    int updateByPrimaryKeySelective(Boiler record);

    int updateByPrimaryKey(Boiler record);
}