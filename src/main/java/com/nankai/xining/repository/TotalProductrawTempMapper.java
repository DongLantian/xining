package com.nankai.xining.repository;

import com.nankai.xining.bean.TotalProductrawTemp;
import com.nankai.xining.bean.TotalProductrawTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TotalProductrawTempMapper {
    long countByExample(TotalProductrawTempExample example);

    int deleteByExample(TotalProductrawTempExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TotalProductrawTemp record);

    int insertSelective(TotalProductrawTemp record);

    List<TotalProductrawTemp> selectByExample(TotalProductrawTempExample example);

    TotalProductrawTemp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TotalProductrawTemp record, @Param("example") TotalProductrawTempExample example);

    int updateByExample(@Param("record") TotalProductrawTemp record, @Param("example") TotalProductrawTempExample example);

    int updateByPrimaryKeySelective(TotalProductrawTemp record);

    int updateByPrimaryKey(TotalProductrawTemp record);
}