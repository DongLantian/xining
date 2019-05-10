package com.nankai.xining.repository;

import com.nankai.xining.bean.Wyrongjiscc20160928;
import com.nankai.xining.bean.Wyrongjiscc20160928Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Wyrongjiscc20160928Mapper {
    long countByExample(Wyrongjiscc20160928Example example);

    int deleteByExample(Wyrongjiscc20160928Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(Wyrongjiscc20160928 record);

    int insertSelective(Wyrongjiscc20160928 record);

    List<Wyrongjiscc20160928> selectByExample(Wyrongjiscc20160928Example example);

    Wyrongjiscc20160928 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Wyrongjiscc20160928 record, @Param("example") Wyrongjiscc20160928Example example);

    int updateByExample(@Param("record") Wyrongjiscc20160928 record, @Param("example") Wyrongjiscc20160928Example example);

    int updateByPrimaryKeySelective(Wyrongjiscc20160928 record);

    int updateByPrimaryKey(Wyrongjiscc20160928 record);
}