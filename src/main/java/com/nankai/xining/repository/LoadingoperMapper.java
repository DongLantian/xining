package com.nankai.xining.repository;

import com.nankai.xining.bean.Loadingoper;
import com.nankai.xining.bean.LoadingoperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoadingoperMapper {
    long countByExample(LoadingoperExample example);

    int deleteByExample(LoadingoperExample example);

    int deleteByPrimaryKey(Integer operaid);

    int insert(Loadingoper record);

    int insertSelective(Loadingoper record);

    List<Loadingoper> selectByExample(LoadingoperExample example);

    Loadingoper selectByPrimaryKey(Integer operaid);

    int updateByExampleSelective(@Param("record") Loadingoper record, @Param("example") LoadingoperExample example);

    int updateByExample(@Param("record") Loadingoper record, @Param("example") LoadingoperExample example);

    int updateByPrimaryKeySelective(Loadingoper record);

    int updateByPrimaryKey(Loadingoper record);
}