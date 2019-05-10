package com.nankai.xining.repository;

import com.nankai.xining.bean.BiomassBoiler;
import com.nankai.xining.bean.BiomassBoilerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BiomassBoilerMapper {
    long countByExample(BiomassBoilerExample example);

    int deleteByExample(BiomassBoilerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BiomassBoiler record);

    int insertSelective(BiomassBoiler record);

    List<BiomassBoiler> selectByExample(BiomassBoilerExample example);

    BiomassBoiler selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BiomassBoiler record, @Param("example") BiomassBoilerExample example);

    int updateByExample(@Param("record") BiomassBoiler record, @Param("example") BiomassBoilerExample example);

    int updateByPrimaryKeySelective(BiomassBoiler record);

    int updateByPrimaryKey(BiomassBoiler record);
}