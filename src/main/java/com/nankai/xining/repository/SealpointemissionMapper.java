package com.nankai.xining.repository;

import com.nankai.xining.bean.Sealpointemission;
import com.nankai.xining.bean.SealpointemissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SealpointemissionMapper {
    long countByExample(SealpointemissionExample example);

    int deleteByExample(SealpointemissionExample example);

    int deleteByPrimaryKey(Integer sealpointsurveyid);

    int insert(Sealpointemission record);

    int insertSelective(Sealpointemission record);

    List<Sealpointemission> selectByExample(SealpointemissionExample example);

    Sealpointemission selectByPrimaryKey(Integer sealpointsurveyid);

    int updateByExampleSelective(@Param("record") Sealpointemission record, @Param("example") SealpointemissionExample example);

    int updateByExample(@Param("record") Sealpointemission record, @Param("example") SealpointemissionExample example);

    int updateByPrimaryKeySelective(Sealpointemission record);

    int updateByPrimaryKey(Sealpointemission record);
}