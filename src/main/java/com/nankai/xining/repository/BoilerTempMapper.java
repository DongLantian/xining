package com.nankai.xining.repository;

import com.nankai.xining.bean.BoilerTemp;
import com.nankai.xining.bean.BoilerTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BoilerTempMapper {
    long countByExample(BoilerTempExample example);

    int deleteByExample(BoilerTempExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BoilerTemp record);

    int insertSelective(BoilerTemp record);

    List<BoilerTemp> selectByExample(BoilerTempExample example);

    List<BoilerTemp> selectByFactoryIdWithJoin(@Param("factoryId")Integer factoryId);

    BoilerTemp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BoilerTemp record, @Param("example") BoilerTempExample example);

    int updateByExample(@Param("record") BoilerTemp record, @Param("example") BoilerTempExample example);

    int updateByPrimaryKeySelective(BoilerTemp record);

    int updateByPrimaryKey(BoilerTemp record);
}