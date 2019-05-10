package com.nankai.xining.repository;

import com.nankai.xining.bean.ConstructionMashinery;
import com.nankai.xining.bean.ConstructionMashineryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConstructionMashineryMapper {
    long countByExample(ConstructionMashineryExample example);

    int deleteByExample(ConstructionMashineryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConstructionMashinery record);

    int insertSelective(ConstructionMashinery record);

    List<ConstructionMashinery> selectByExample(ConstructionMashineryExample example);

    ConstructionMashinery selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConstructionMashinery record, @Param("example") ConstructionMashineryExample example);

    int updateByExample(@Param("record") ConstructionMashinery record, @Param("example") ConstructionMashineryExample example);

    int updateByPrimaryKeySelective(ConstructionMashinery record);

    int updateByPrimaryKey(ConstructionMashinery record);
}