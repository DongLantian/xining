package com.nankai.xining.repository;

import com.nankai.xining.bean.Loadingprocess;
import com.nankai.xining.bean.LoadingprocessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoadingprocessMapper {
    long countByExample(LoadingprocessExample example);

    int deleteByExample(LoadingprocessExample example);

    int deleteByPrimaryKey(Integer loadingid);

    int insert(Loadingprocess record);

    int insertSelective(Loadingprocess record);

    List<Loadingprocess> selectByExample(LoadingprocessExample example);

    Loadingprocess selectByPrimaryKey(Integer loadingid);

    int updateByExampleSelective(@Param("record") Loadingprocess record, @Param("example") LoadingprocessExample example);

    int updateByExample(@Param("record") Loadingprocess record, @Param("example") LoadingprocessExample example);

    int updateByPrimaryKeySelective(Loadingprocess record);

    int updateByPrimaryKey(Loadingprocess record);
}