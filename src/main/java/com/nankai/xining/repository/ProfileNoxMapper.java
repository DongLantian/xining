package com.nankai.xining.repository;

import com.nankai.xining.bean.ProfileNox;
import com.nankai.xining.bean.ProfileNoxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProfileNoxMapper {
    long countByExample(ProfileNoxExample example);

    int deleteByExample(ProfileNoxExample example);

    int deleteByPrimaryKey(Integer noxId);

    int insert(ProfileNox record);

    int insertSelective(ProfileNox record);

    List<ProfileNox> selectByExample(ProfileNoxExample example);

    ProfileNox selectByPrimaryKey(Integer noxId);

    int updateByExampleSelective(@Param("record") ProfileNox record, @Param("example") ProfileNoxExample example);

    int updateByExample(@Param("record") ProfileNox record, @Param("example") ProfileNoxExample example);

    int updateByPrimaryKeySelective(ProfileNox record);

    int updateByPrimaryKey(ProfileNox record);
}