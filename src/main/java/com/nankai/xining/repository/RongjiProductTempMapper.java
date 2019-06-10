package com.nankai.xining.repository;

import com.nankai.xining.bean.RongjiProductTemp;
import com.nankai.xining.bean.RongjiProductTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RongjiProductTempMapper {
    long countByExample(RongjiProductTempExample example);

    int deleteByExample(RongjiProductTempExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RongjiProductTemp record);

    int insertSelective(RongjiProductTemp record);

    List<RongjiProductTemp> selectByExample(RongjiProductTempExample example);

    RongjiProductTemp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RongjiProductTemp record, @Param("example") RongjiProductTempExample example);

    int updateByExample(@Param("record") RongjiProductTemp record, @Param("example") RongjiProductTempExample example);

    int updateByPrimaryKeySelective(RongjiProductTemp record);

    int updateByPrimaryKey(RongjiProductTemp record);

    List<RongjiProductTemp> selectByFactoryIdWithJoin(int factoryId);
}