package com.nankai.xining.repository;

import com.nankai.xining.bean.Gistotaltemp;
import com.nankai.xining.bean.GistotaltempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GistotaltempMapper {
    long countByExample(GistotaltempExample example);

    int deleteByExample(GistotaltempExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Gistotaltemp record);

    int insertSelective(Gistotaltemp record);

    List<Gistotaltemp> selectByExample(GistotaltempExample example);

    Gistotaltemp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Gistotaltemp record, @Param("example") GistotaltempExample example);

    int updateByExample(@Param("record") Gistotaltemp record, @Param("example") GistotaltempExample example);

    int updateByPrimaryKeySelective(Gistotaltemp record);

    int updateByPrimaryKey(Gistotaltemp record);
}