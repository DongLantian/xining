package com.nankai.xining.repository;

import com.nankai.xining.bean.XjcydustStack;
import com.nankai.xining.bean.XjcydustStackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XjcydustStackMapper {
    long countByExample(XjcydustStackExample example);

    int deleteByExample(XjcydustStackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XjcydustStack record);

    int insertSelective(XjcydustStack record);

    List<XjcydustStack> selectByExample(XjcydustStackExample example);

    XjcydustStack selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XjcydustStack record, @Param("example") XjcydustStackExample example);

    int updateByExample(@Param("record") XjcydustStack record, @Param("example") XjcydustStackExample example);

    int updateByPrimaryKeySelective(XjcydustStack record);

    int updateByPrimaryKey(XjcydustStack record);
}