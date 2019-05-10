package com.nankai.xining.repository;

import com.nankai.xining.bean.Xjweektime;
import com.nankai.xining.bean.XjweektimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XjweektimeMapper {
    long countByExample(XjweektimeExample example);

    int deleteByExample(XjweektimeExample example);

    int deleteByPrimaryKey(Integer weekId);

    int insert(Xjweektime record);

    int insertSelective(Xjweektime record);

    List<Xjweektime> selectByExample(XjweektimeExample example);

    Xjweektime selectByPrimaryKey(Integer weekId);

    int updateByExampleSelective(@Param("record") Xjweektime record, @Param("example") XjweektimeExample example);

    int updateByExample(@Param("record") Xjweektime record, @Param("example") XjweektimeExample example);

    int updateByPrimaryKeySelective(Xjweektime record);

    int updateByPrimaryKey(Xjweektime record);
}