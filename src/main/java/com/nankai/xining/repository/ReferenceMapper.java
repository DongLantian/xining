package com.nankai.xining.repository;

import com.nankai.xining.bean.Reference;
import com.nankai.xining.bean.ReferenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReferenceMapper {
    long countByExample(ReferenceExample example);

    int deleteByExample(ReferenceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Reference record);

    int insertSelective(Reference record);

    List<Reference> selectByExample(ReferenceExample example);

    Reference selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Reference record, @Param("example") ReferenceExample example);

    int updateByExample(@Param("record") Reference record, @Param("example") ReferenceExample example);

    int updateByPrimaryKeySelective(Reference record);

    int updateByPrimaryKey(Reference record);
}