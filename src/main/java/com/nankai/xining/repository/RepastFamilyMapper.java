package com.nankai.xining.repository;

import com.nankai.xining.bean.RepastFamily;
import com.nankai.xining.bean.RepastFamilyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepastFamilyMapper {
    long countByExample(RepastFamilyExample example);

    int deleteByExample(RepastFamilyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RepastFamily record);

    int insertSelective(RepastFamily record);

    List<RepastFamily> selectByExample(RepastFamilyExample example);

    RepastFamily selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RepastFamily record, @Param("example") RepastFamilyExample example);

    int updateByExample(@Param("record") RepastFamily record, @Param("example") RepastFamilyExample example);

    int updateByPrimaryKeySelective(RepastFamily record);

    int updateByPrimaryKey(RepastFamily record);
}