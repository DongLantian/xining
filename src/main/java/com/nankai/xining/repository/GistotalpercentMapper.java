package com.nankai.xining.repository;

import com.nankai.xining.bean.Gistotalpercent;
import com.nankai.xining.bean.GistotalpercentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GistotalpercentMapper {
    long countByExample(GistotalpercentExample example);

    int deleteByExample(GistotalpercentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Gistotalpercent record);

    int insertSelective(Gistotalpercent record);

    List<Gistotalpercent> selectByExample(GistotalpercentExample example);

    Gistotalpercent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Gistotalpercent record, @Param("example") GistotalpercentExample example);

    int updateByExample(@Param("record") Gistotalpercent record, @Param("example") GistotalpercentExample example);

    int updateByPrimaryKeySelective(Gistotalpercent record);

    int updateByPrimaryKey(Gistotalpercent record);
}