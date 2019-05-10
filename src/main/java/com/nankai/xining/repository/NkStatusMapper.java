package com.nankai.xining.repository;

import com.nankai.xining.bean.NkStatus;
import com.nankai.xining.bean.NkStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NkStatusMapper {
    long countByExample(NkStatusExample example);

    int deleteByExample(NkStatusExample example);

    int insert(NkStatus record);

    int insertSelective(NkStatus record);

    List<NkStatus> selectByExample(NkStatusExample example);

    int updateByExampleSelective(@Param("record") NkStatus record, @Param("example") NkStatusExample example);

    int updateByExample(@Param("record") NkStatus record, @Param("example") NkStatusExample example);
}