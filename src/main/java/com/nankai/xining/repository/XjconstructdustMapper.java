package com.nankai.xining.repository;

import com.nankai.xining.bean.Xjconstructdust;
import com.nankai.xining.bean.XjconstructdustExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XjconstructdustMapper {
    long countByExample(XjconstructdustExample example);

    int deleteByExample(XjconstructdustExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Xjconstructdust record);

    int insertSelective(Xjconstructdust record);

    List<Xjconstructdust> selectByExample(XjconstructdustExample example);

    Xjconstructdust selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Xjconstructdust record, @Param("example") XjconstructdustExample example);

    int updateByExample(@Param("record") Xjconstructdust record, @Param("example") XjconstructdustExample example);

    int updateByPrimaryKeySelective(Xjconstructdust record);

    int updateByPrimaryKey(Xjconstructdust record);
}