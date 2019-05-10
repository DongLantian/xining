package com.nankai.xining.repository;

import com.nankai.xining.bean.ProfilePm25;
import com.nankai.xining.bean.ProfilePm25Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProfilePm25Mapper {
    long countByExample(ProfilePm25Example example);

    int deleteByExample(ProfilePm25Example example);

    int deleteByPrimaryKey(Integer pm25Id);

    int insert(ProfilePm25 record);

    int insertSelective(ProfilePm25 record);

    List<ProfilePm25> selectByExample(ProfilePm25Example example);

    ProfilePm25 selectByPrimaryKey(Integer pm25Id);

    int updateByExampleSelective(@Param("record") ProfilePm25 record, @Param("example") ProfilePm25Example example);

    int updateByExample(@Param("record") ProfilePm25 record, @Param("example") ProfilePm25Example example);

    int updateByPrimaryKeySelective(ProfilePm25 record);

    int updateByPrimaryKey(ProfilePm25 record);
}