package com.nankai.xining.repository;

import com.nankai.xining.bean.Sealpointemissionformal;
import com.nankai.xining.bean.SealpointemissionformalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SealpointemissionformalMapper {
    long countByExample(SealpointemissionformalExample example);

    int deleteByExample(SealpointemissionformalExample example);

    int deleteByPrimaryKey(Integer sealpointsurveyid);

    int insert(Sealpointemissionformal record);

    int insertSelective(Sealpointemissionformal record);

    List<Sealpointemissionformal> selectByExample(SealpointemissionformalExample example);

    Sealpointemissionformal selectByPrimaryKey(Integer sealpointsurveyid);

    int updateByExampleSelective(@Param("record") Sealpointemissionformal record, @Param("example") SealpointemissionformalExample example);

    int updateByExample(@Param("record") Sealpointemissionformal record, @Param("example") SealpointemissionformalExample example);

    int updateByPrimaryKeySelective(Sealpointemissionformal record);

    int updateByPrimaryKey(Sealpointemissionformal record);
}