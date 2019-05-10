package com.nankai.xining.repository;

import com.nankai.xining.bean.Tankinfoformal;
import com.nankai.xining.bean.TankinfoformalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TankinfoformalMapper {
    long countByExample(TankinfoformalExample example);

    int deleteByExample(TankinfoformalExample example);

    int deleteByPrimaryKey(Integer tankid);

    int insert(Tankinfoformal record);

    int insertSelective(Tankinfoformal record);

    List<Tankinfoformal> selectByExample(TankinfoformalExample example);

    Tankinfoformal selectByPrimaryKey(Integer tankid);

    int updateByExampleSelective(@Param("record") Tankinfoformal record, @Param("example") TankinfoformalExample example);

    int updateByExample(@Param("record") Tankinfoformal record, @Param("example") TankinfoformalExample example);

    int updateByPrimaryKeySelective(Tankinfoformal record);

    int updateByPrimaryKey(Tankinfoformal record);
}