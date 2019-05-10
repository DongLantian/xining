package com.nankai.xining.repository;

import com.nankai.xining.bean.Pesticide;
import com.nankai.xining.bean.PesticideExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PesticideMapper {
    long countByExample(PesticideExample example);

    int deleteByExample(PesticideExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Pesticide record);

    int insertSelective(Pesticide record);

    List<Pesticide> selectByExample(PesticideExample example);

    Pesticide selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Pesticide record, @Param("example") PesticideExample example);

    int updateByExample(@Param("record") Pesticide record, @Param("example") PesticideExample example);

    int updateByPrimaryKeySelective(Pesticide record);

    int updateByPrimaryKey(Pesticide record);
}