package com.nankai.xining.repository;

import com.nankai.xining.bean.Dustcon;
import com.nankai.xining.bean.DustconExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DustconMapper {
    long countByExample(DustconExample example);

    int deleteByExample(DustconExample example);

    int deleteByPrimaryKey(Integer dcId);

    int insert(Dustcon record);

    int insertSelective(Dustcon record);

    List<Dustcon> selectByExampleWithBLOBs(DustconExample example);

    List<Dustcon> selectByExample(DustconExample example);

    Dustcon selectByPrimaryKey(Integer dcId);

    int updateByExampleSelective(@Param("record") Dustcon record, @Param("example") DustconExample example);

    int updateByExampleWithBLOBs(@Param("record") Dustcon record, @Param("example") DustconExample example);

    int updateByExample(@Param("record") Dustcon record, @Param("example") DustconExample example);

    int updateByPrimaryKeySelective(Dustcon record);

    int updateByPrimaryKeyWithBLOBs(Dustcon record);

    int updateByPrimaryKey(Dustcon record);
}