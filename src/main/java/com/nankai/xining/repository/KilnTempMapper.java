package com.nankai.xining.repository;

import com.nankai.xining.bean.KilnTemp;
import com.nankai.xining.bean.KilnTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface KilnTempMapper {
    long countByExample(KilnTempExample example);

    int deleteByExample(KilnTempExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(KilnTemp record);

    int insertSelective(KilnTemp record);

    List<KilnTemp> selectByExample(KilnTempExample example);

    KilnTemp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") KilnTemp record, @Param("example") KilnTempExample example);

    int updateByExample(@Param("record") KilnTemp record, @Param("example") KilnTempExample example);

    int updateByPrimaryKeySelective(KilnTemp record);

    int updateByPrimaryKey(KilnTemp record);

    List<KilnTemp> selectByFactoryIdWithJoin(int factoryId);
}