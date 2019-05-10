package com.nankai.xining.repository;

import com.nankai.xining.bean.Loadingfactor;
import com.nankai.xining.bean.LoadingfactorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoadingfactorMapper {
    long countByExample(LoadingfactorExample example);

    int deleteByExample(LoadingfactorExample example);

    int deleteByPrimaryKey(Integer factorid);

    int insert(Loadingfactor record);

    int insertSelective(Loadingfactor record);

    List<Loadingfactor> selectByExample(LoadingfactorExample example);

    Loadingfactor selectByPrimaryKey(Integer factorid);

    int updateByExampleSelective(@Param("record") Loadingfactor record, @Param("example") LoadingfactorExample example);

    int updateByExample(@Param("record") Loadingfactor record, @Param("example") LoadingfactorExample example);

    int updateByPrimaryKeySelective(Loadingfactor record);

    int updateByPrimaryKey(Loadingfactor record);
}