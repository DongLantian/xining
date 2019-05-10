package com.nankai.xining.repository;

import com.nankai.xining.bean.FellReference;
import com.nankai.xining.bean.FellReferenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FellReferenceMapper {
    long countByExample(FellReferenceExample example);

    int deleteByExample(FellReferenceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FellReference record);

    int insertSelective(FellReference record);

    List<FellReference> selectByExample(FellReferenceExample example);

    FellReference selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FellReference record, @Param("example") FellReferenceExample example);

    int updateByExample(@Param("record") FellReference record, @Param("example") FellReferenceExample example);

    int updateByPrimaryKeySelective(FellReference record);

    int updateByPrimaryKey(FellReference record);
}