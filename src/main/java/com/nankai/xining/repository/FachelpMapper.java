package com.nankai.xining.repository;

import com.nankai.xining.bean.Fachelp;
import com.nankai.xining.bean.FachelpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FachelpMapper {
    long countByExample(FachelpExample example);

    int deleteByExample(FachelpExample example);

    int deleteByPrimaryKey(String facNo);

    int insert(Fachelp record);

    int insertSelective(Fachelp record);

    List<Fachelp> selectByExample(FachelpExample example);

    int updateByExampleSelective(@Param("record") Fachelp record, @Param("example") FachelpExample example);

    int updateByExample(@Param("record") Fachelp record, @Param("example") FachelpExample example);
}