package com.nankai.xining.repository;

import com.nankai.xining.bean.YearHelp;
import com.nankai.xining.bean.YearHelpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YearHelpMapper {
    long countByExample(YearHelpExample example);

    int deleteByExample(YearHelpExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YearHelp record);

    int insertSelective(YearHelp record);

    List<YearHelp> selectByExample(YearHelpExample example);

    YearHelp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YearHelp record, @Param("example") YearHelpExample example);

    int updateByExample(@Param("record") YearHelp record, @Param("example") YearHelpExample example);

    int updateByPrimaryKeySelective(YearHelp record);

    int updateByPrimaryKey(YearHelp record);
}