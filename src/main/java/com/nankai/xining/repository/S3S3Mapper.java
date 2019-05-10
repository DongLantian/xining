package com.nankai.xining.repository;

import com.nankai.xining.bean.S3S3;
import com.nankai.xining.bean.S3S3Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface S3S3Mapper {
    long countByExample(S3S3Example example);

    int deleteByExample(S3S3Example example);

    int insert(S3S3 record);

    int insertSelective(S3S3 record);

    List<S3S3> selectByExample(S3S3Example example);

    int updateByExampleSelective(@Param("record") S3S3 record, @Param("example") S3S3Example example);

    int updateByExample(@Param("record") S3S3 record, @Param("example") S3S3Example example);
}