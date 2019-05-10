package com.nankai.xining.repository;

import com.nankai.xining.bean.Monvisimonc;
import com.nankai.xining.bean.MonvisimoncExample;
import com.nankai.xining.bean.MonvisimoncKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MonvisimoncMapper {
    long countByExample(MonvisimoncExample example);

    int deleteByExample(MonvisimoncExample example);

    int deleteByPrimaryKey(MonvisimoncKey key);

    int insert(Monvisimonc record);

    int insertSelective(Monvisimonc record);

    List<Monvisimonc> selectByExample(MonvisimoncExample example);

    Monvisimonc selectByPrimaryKey(MonvisimoncKey key);

    int updateByExampleSelective(@Param("record") Monvisimonc record, @Param("example") MonvisimoncExample example);

    int updateByExample(@Param("record") Monvisimonc record, @Param("example") MonvisimoncExample example);

    int updateByPrimaryKeySelective(Monvisimonc record);

    int updateByPrimaryKey(Monvisimonc record);
}