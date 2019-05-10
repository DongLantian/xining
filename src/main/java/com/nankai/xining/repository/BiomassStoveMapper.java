package com.nankai.xining.repository;

import com.nankai.xining.bean.BiomassStove;
import com.nankai.xining.bean.BiomassStoveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BiomassStoveMapper {
    long countByExample(BiomassStoveExample example);

    int deleteByExample(BiomassStoveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BiomassStove record);

    int insertSelective(BiomassStove record);

    List<BiomassStove> selectByExample(BiomassStoveExample example);

    BiomassStove selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BiomassStove record, @Param("example") BiomassStoveExample example);

    int updateByExample(@Param("record") BiomassStove record, @Param("example") BiomassStoveExample example);

    int updateByPrimaryKeySelective(BiomassStove record);

    int updateByPrimaryKey(BiomassStove record);
}