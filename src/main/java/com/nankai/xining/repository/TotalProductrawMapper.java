package com.nankai.xining.repository;

import com.nankai.xining.bean.TotalProductraw;
import com.nankai.xining.bean.TotalProductrawExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TotalProductrawMapper {
    long countByExample(TotalProductrawExample example);

    int deleteByExample(TotalProductrawExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TotalProductraw record);

    int insertSelective(TotalProductraw record);

    List<TotalProductraw> selectByExample(TotalProductrawExample example);

    TotalProductraw selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TotalProductraw record, @Param("example") TotalProductrawExample example);

    int updateByExample(@Param("record") TotalProductraw record, @Param("example") TotalProductrawExample example);

    int updateByPrimaryKeySelective(TotalProductraw record);

    int updateByPrimaryKey(TotalProductraw record);
}