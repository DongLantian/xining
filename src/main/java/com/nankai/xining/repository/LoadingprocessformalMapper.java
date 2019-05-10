package com.nankai.xining.repository;

import com.nankai.xining.bean.Loadingprocessformal;
import com.nankai.xining.bean.LoadingprocessformalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoadingprocessformalMapper {
    long countByExample(LoadingprocessformalExample example);

    int deleteByExample(LoadingprocessformalExample example);

    int deleteByPrimaryKey(Integer loadingid);

    int insert(Loadingprocessformal record);

    int insertSelective(Loadingprocessformal record);

    List<Loadingprocessformal> selectByExample(LoadingprocessformalExample example);

    Loadingprocessformal selectByPrimaryKey(Integer loadingid);

    int updateByExampleSelective(@Param("record") Loadingprocessformal record, @Param("example") LoadingprocessformalExample example);

    int updateByExample(@Param("record") Loadingprocessformal record, @Param("example") LoadingprocessformalExample example);

    int updateByPrimaryKeySelective(Loadingprocessformal record);

    int updateByPrimaryKey(Loadingprocessformal record);
}