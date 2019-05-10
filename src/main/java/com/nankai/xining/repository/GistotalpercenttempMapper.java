package com.nankai.xining.repository;

import com.nankai.xining.bean.Gistotalpercenttemp;
import com.nankai.xining.bean.GistotalpercenttempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GistotalpercenttempMapper {
    long countByExample(GistotalpercenttempExample example);

    int deleteByExample(GistotalpercenttempExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Gistotalpercenttemp record);

    int insertSelective(Gistotalpercenttemp record);

    List<Gistotalpercenttemp> selectByExample(GistotalpercenttempExample example);

    Gistotalpercenttemp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Gistotalpercenttemp record, @Param("example") GistotalpercenttempExample example);

    int updateByExample(@Param("record") Gistotalpercenttemp record, @Param("example") GistotalpercenttempExample example);

    int updateByPrimaryKeySelective(Gistotalpercenttemp record);

    int updateByPrimaryKey(Gistotalpercenttemp record);
}