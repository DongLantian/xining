package com.nankai.xining.repository;

import com.nankai.xining.bean.GistotalCopy;
import com.nankai.xining.bean.GistotalCopyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GistotalCopyMapper {
    long countByExample(GistotalCopyExample example);

    int deleteByExample(GistotalCopyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GistotalCopy record);

    int insertSelective(GistotalCopy record);

    List<GistotalCopy> selectByExample(GistotalCopyExample example);

    GistotalCopy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GistotalCopy record, @Param("example") GistotalCopyExample example);

    int updateByExample(@Param("record") GistotalCopy record, @Param("example") GistotalCopyExample example);

    int updateByPrimaryKeySelective(GistotalCopy record);

    int updateByPrimaryKey(GistotalCopy record);
}