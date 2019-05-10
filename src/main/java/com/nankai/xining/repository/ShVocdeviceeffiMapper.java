package com.nankai.xining.repository;

import com.nankai.xining.bean.ShVocdeviceeffi;
import com.nankai.xining.bean.ShVocdeviceeffiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShVocdeviceeffiMapper {
    long countByExample(ShVocdeviceeffiExample example);

    int deleteByExample(ShVocdeviceeffiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShVocdeviceeffi record);

    int insertSelective(ShVocdeviceeffi record);

    List<ShVocdeviceeffi> selectByExample(ShVocdeviceeffiExample example);

    ShVocdeviceeffi selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShVocdeviceeffi record, @Param("example") ShVocdeviceeffiExample example);

    int updateByExample(@Param("record") ShVocdeviceeffi record, @Param("example") ShVocdeviceeffiExample example);

    int updateByPrimaryKeySelective(ShVocdeviceeffi record);

    int updateByPrimaryKey(ShVocdeviceeffi record);
}