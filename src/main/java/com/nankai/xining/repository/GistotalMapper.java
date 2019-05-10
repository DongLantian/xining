package com.nankai.xining.repository;

import com.nankai.xining.bean.Gistotal;
import com.nankai.xining.bean.GistotalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GistotalMapper {
    long countByExample(GistotalExample example);

    int deleteByExample(GistotalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Gistotal record);

    int insertSelective(Gistotal record);

    List<Gistotal> selectByExample(GistotalExample example);

    Gistotal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Gistotal record, @Param("example") GistotalExample example);

    int updateByExample(@Param("record") Gistotal record, @Param("example") GistotalExample example);

    int updateByPrimaryKeySelective(Gistotal record);

    int updateByPrimaryKey(Gistotal record);
}