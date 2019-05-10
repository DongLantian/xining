package com.nankai.xining.repository;

import com.nankai.xining.bean.Landuseinfo;
import com.nankai.xining.bean.LanduseinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LanduseinfoMapper {
    long countByExample(LanduseinfoExample example);

    int deleteByExample(LanduseinfoExample example);

    int deleteByPrimaryKey(String landcode);

    int insert(Landuseinfo record);

    int insertSelective(Landuseinfo record);

    List<Landuseinfo> selectByExample(LanduseinfoExample example);

    Landuseinfo selectByPrimaryKey(String landcode);

    int updateByExampleSelective(@Param("record") Landuseinfo record, @Param("example") LanduseinfoExample example);

    int updateByExample(@Param("record") Landuseinfo record, @Param("example") LanduseinfoExample example);

    int updateByPrimaryKeySelective(Landuseinfo record);

    int updateByPrimaryKey(Landuseinfo record);
}