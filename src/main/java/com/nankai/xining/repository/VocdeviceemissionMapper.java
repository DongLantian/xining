package com.nankai.xining.repository;

import com.nankai.xining.bean.Vocdeviceemission;
import com.nankai.xining.bean.VocdeviceemissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VocdeviceemissionMapper {
    long countByExample(VocdeviceemissionExample example);

    int deleteByExample(VocdeviceemissionExample example);

    int deleteByPrimaryKey(Integer vocdevicesurveyid);

    int insert(Vocdeviceemission record);

    int insertSelective(Vocdeviceemission record);

    List<Vocdeviceemission> selectByExample(VocdeviceemissionExample example);

    Vocdeviceemission selectByPrimaryKey(Integer vocdevicesurveyid);

    int updateByExampleSelective(@Param("record") Vocdeviceemission record, @Param("example") VocdeviceemissionExample example);

    int updateByExample(@Param("record") Vocdeviceemission record, @Param("example") VocdeviceemissionExample example);

    int updateByPrimaryKeySelective(Vocdeviceemission record);

    int updateByPrimaryKey(Vocdeviceemission record);
}