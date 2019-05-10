package com.nankai.xining.repository;

import com.nankai.xining.bean.TankMaterialname;
import com.nankai.xining.bean.TankMaterialnameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TankMaterialnameMapper {
    long countByExample(TankMaterialnameExample example);

    int deleteByExample(TankMaterialnameExample example);

    int deleteByPrimaryKey(Integer tanksourceid);

    int insert(TankMaterialname record);

    int insertSelective(TankMaterialname record);

    List<TankMaterialname> selectByExample(TankMaterialnameExample example);

    TankMaterialname selectByPrimaryKey(Integer tanksourceid);

    int updateByExampleSelective(@Param("record") TankMaterialname record, @Param("example") TankMaterialnameExample example);

    int updateByExample(@Param("record") TankMaterialname record, @Param("example") TankMaterialnameExample example);

    int updateByPrimaryKeySelective(TankMaterialname record);

    int updateByPrimaryKey(TankMaterialname record);
}