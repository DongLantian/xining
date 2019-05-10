package com.nankai.xining.repository;

import com.nankai.xining.bean.BaseSoil;
import com.nankai.xining.bean.BaseSoilExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseSoilMapper {
    long countByExample(BaseSoilExample example);

    int deleteByExample(BaseSoilExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseSoil record);

    int insertSelective(BaseSoil record);

    List<BaseSoil> selectByExample(BaseSoilExample example);

    BaseSoil selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseSoil record, @Param("example") BaseSoilExample example);

    int updateByExample(@Param("record") BaseSoil record, @Param("example") BaseSoilExample example);

    int updateByPrimaryKeySelective(BaseSoil record);

    int updateByPrimaryKey(BaseSoil record);
}