package com.nankai.xining.repository;

import com.nankai.xining.bean.BiomassStraw;
import com.nankai.xining.bean.BiomassStrawExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BiomassStrawMapper {
    long countByExample(BiomassStrawExample example);

    int deleteByExample(BiomassStrawExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BiomassStraw record);

    int insertSelective(BiomassStraw record);

    List<BiomassStraw> selectByExample(BiomassStrawExample example);

    BiomassStraw selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BiomassStraw record, @Param("example") BiomassStrawExample example);

    int updateByExample(@Param("record") BiomassStraw record, @Param("example") BiomassStrawExample example);

    int updateByPrimaryKeySelective(BiomassStraw record);

    int updateByPrimaryKey(BiomassStraw record);
}