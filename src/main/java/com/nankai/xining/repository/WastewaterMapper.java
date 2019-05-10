package com.nankai.xining.repository;

import com.nankai.xining.bean.Wastewater;
import com.nankai.xining.bean.WastewaterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WastewaterMapper {
    long countByExample(WastewaterExample example);

    int deleteByExample(WastewaterExample example);

    int deleteByPrimaryKey(Integer wastewaterid);

    int insert(Wastewater record);

    int insertSelective(Wastewater record);

    List<Wastewater> selectByExample(WastewaterExample example);

    Wastewater selectByPrimaryKey(Integer wastewaterid);

    int updateByExampleSelective(@Param("record") Wastewater record, @Param("example") WastewaterExample example);

    int updateByExample(@Param("record") Wastewater record, @Param("example") WastewaterExample example);

    int updateByPrimaryKeySelective(Wastewater record);

    int updateByPrimaryKey(Wastewater record);
}