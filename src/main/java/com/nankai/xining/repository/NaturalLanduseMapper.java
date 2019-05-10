package com.nankai.xining.repository;

import com.nankai.xining.bean.NaturalLanduse;
import com.nankai.xining.bean.NaturalLanduseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NaturalLanduseMapper {
    long countByExample(NaturalLanduseExample example);

    int deleteByExample(NaturalLanduseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NaturalLanduse record);

    int insertSelective(NaturalLanduse record);

    List<NaturalLanduse> selectByExample(NaturalLanduseExample example);

    NaturalLanduse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NaturalLanduse record, @Param("example") NaturalLanduseExample example);

    int updateByExample(@Param("record") NaturalLanduse record, @Param("example") NaturalLanduseExample example);

    int updateByPrimaryKeySelective(NaturalLanduse record);

    int updateByPrimaryKey(NaturalLanduse record);
}