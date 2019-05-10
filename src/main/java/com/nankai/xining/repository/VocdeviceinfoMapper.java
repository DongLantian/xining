package com.nankai.xining.repository;

import com.nankai.xining.bean.Vocdeviceinfo;
import com.nankai.xining.bean.VocdeviceinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VocdeviceinfoMapper {
    long countByExample(VocdeviceinfoExample example);

    int deleteByExample(VocdeviceinfoExample example);

    int deleteByPrimaryKey(Integer vocdeviceid);

    int insert(Vocdeviceinfo record);

    int insertSelective(Vocdeviceinfo record);

    List<Vocdeviceinfo> selectByExample(VocdeviceinfoExample example);

    Vocdeviceinfo selectByPrimaryKey(Integer vocdeviceid);

    int updateByExampleSelective(@Param("record") Vocdeviceinfo record, @Param("example") VocdeviceinfoExample example);

    int updateByExample(@Param("record") Vocdeviceinfo record, @Param("example") VocdeviceinfoExample example);

    int updateByPrimaryKeySelective(Vocdeviceinfo record);

    int updateByPrimaryKey(Vocdeviceinfo record);
}