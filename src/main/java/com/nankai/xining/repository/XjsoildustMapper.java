package com.nankai.xining.repository;

import com.nankai.xining.bean.Xjsoildust;
import com.nankai.xining.bean.XjsoildustExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XjsoildustMapper {
    long countByExample(XjsoildustExample example);

    int deleteByExample(XjsoildustExample example);

    int deleteByPrimaryKey(Integer sdId);

    int insert(Xjsoildust record);

    int insertSelective(Xjsoildust record);

    List<Xjsoildust> selectByExample(XjsoildustExample example);

    Xjsoildust selectByPrimaryKey(Integer sdId);

    int updateByExampleSelective(@Param("record") Xjsoildust record, @Param("example") XjsoildustExample example);

    int updateByExample(@Param("record") Xjsoildust record, @Param("example") XjsoildustExample example);

    int updateByPrimaryKeySelective(Xjsoildust record);

    int updateByPrimaryKey(Xjsoildust record);
}