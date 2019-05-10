package com.nankai.xining.repository;

import com.nankai.xining.bean.Wygongyiscc20160901;
import com.nankai.xining.bean.Wygongyiscc20160901Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Wygongyiscc20160901Mapper {
    long countByExample(Wygongyiscc20160901Example example);

    int deleteByExample(Wygongyiscc20160901Example example);

    int deleteByPrimaryKey(String tjScc);

    int insert(Wygongyiscc20160901 record);

    int insertSelective(Wygongyiscc20160901 record);

    List<Wygongyiscc20160901> selectByExample(Wygongyiscc20160901Example example);

    Wygongyiscc20160901 selectByPrimaryKey(String tjScc);

    int updateByExampleSelective(@Param("record") Wygongyiscc20160901 record, @Param("example") Wygongyiscc20160901Example example);

    int updateByExample(@Param("record") Wygongyiscc20160901 record, @Param("example") Wygongyiscc20160901Example example);

    int updateByPrimaryKeySelective(Wygongyiscc20160901 record);

    int updateByPrimaryKey(Wygongyiscc20160901 record);
}