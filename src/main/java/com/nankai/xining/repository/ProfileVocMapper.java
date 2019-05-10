package com.nankai.xining.repository;

import com.nankai.xining.bean.ProfileVoc;
import com.nankai.xining.bean.ProfileVocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProfileVocMapper {
    long countByExample(ProfileVocExample example);

    int deleteByExample(ProfileVocExample example);

    int deleteByPrimaryKey(Integer vocId);

    int insert(ProfileVoc record);

    int insertSelective(ProfileVoc record);

    List<ProfileVoc> selectByExample(ProfileVocExample example);

    ProfileVoc selectByPrimaryKey(Integer vocId);

    int updateByExampleSelective(@Param("record") ProfileVoc record, @Param("example") ProfileVocExample example);

    int updateByExample(@Param("record") ProfileVoc record, @Param("example") ProfileVocExample example);

    int updateByPrimaryKeySelective(ProfileVoc record);

    int updateByPrimaryKey(ProfileVoc record);
}