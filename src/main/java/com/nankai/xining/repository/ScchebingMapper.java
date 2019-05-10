package com.nankai.xining.repository;

import com.nankai.xining.bean.Scchebing;
import com.nankai.xining.bean.ScchebingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScchebingMapper {
    long countByExample(ScchebingExample example);

    int deleteByExample(ScchebingExample example);

    int insert(Scchebing record);

    int insertSelective(Scchebing record);

    List<Scchebing> selectByExample(ScchebingExample example);

    int updateByExampleSelective(@Param("record") Scchebing record, @Param("example") ScchebingExample example);

    int updateByExample(@Param("record") Scchebing record, @Param("example") ScchebingExample example);
}