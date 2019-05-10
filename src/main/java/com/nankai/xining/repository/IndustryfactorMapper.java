package com.nankai.xining.repository;

import com.nankai.xining.bean.Industryfactor;
import com.nankai.xining.bean.IndustryfactorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndustryfactorMapper {
    long countByExample(IndustryfactorExample example);

    int deleteByExample(IndustryfactorExample example);

    int deleteByPrimaryKey(Integer industryfactorid);

    int insert(Industryfactor record);

    int insertSelective(Industryfactor record);

    List<Industryfactor> selectByExample(IndustryfactorExample example);

    Industryfactor selectByPrimaryKey(Integer industryfactorid);

    int updateByExampleSelective(@Param("record") Industryfactor record, @Param("example") IndustryfactorExample example);

    int updateByExample(@Param("record") Industryfactor record, @Param("example") IndustryfactorExample example);

    int updateByPrimaryKeySelective(Industryfactor record);

    int updateByPrimaryKey(Industryfactor record);
}