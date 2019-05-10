package com.nankai.xining.repository;

import com.nankai.xining.bean.Wastewateremission;
import com.nankai.xining.bean.WastewateremissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WastewateremissionMapper {
    long countByExample(WastewateremissionExample example);

    int deleteByExample(WastewateremissionExample example);

    int deleteByPrimaryKey(Integer wastewatersurveyid);

    int insert(Wastewateremission record);

    int insertSelective(Wastewateremission record);

    List<Wastewateremission> selectByExample(WastewateremissionExample example);

    Wastewateremission selectByPrimaryKey(Integer wastewatersurveyid);

    int updateByExampleSelective(@Param("record") Wastewateremission record, @Param("example") WastewateremissionExample example);

    int updateByExample(@Param("record") Wastewateremission record, @Param("example") WastewateremissionExample example);

    int updateByPrimaryKeySelective(Wastewateremission record);

    int updateByPrimaryKey(Wastewateremission record);
}