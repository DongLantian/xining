package com.nankai.xining.repository;

import com.nankai.xining.bean.Kiln;
import com.nankai.xining.bean.KilnExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KilnMapper {
    long countByExample(KilnExample example);

    int deleteByExample(KilnExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Kiln record);

    int insertSelective(Kiln record);

    List<Kiln> selectByExample(KilnExample example);

    Kiln selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Kiln record, @Param("example") KilnExample example);

    int updateByExample(@Param("record") Kiln record, @Param("example") KilnExample example);

    int updateByPrimaryKeySelective(Kiln record);

    int updateByPrimaryKey(Kiln record);

    List<Kiln> selectByFactoryIdWithJoin(int factoryId);
}