package com.nankai.xining.repository;

import com.nankai.xining.bean.WasteDisposalTemp;
import com.nankai.xining.bean.WasteDisposalTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WasteDisposalTempMapper {
    long countByExample(WasteDisposalTempExample example);

    int deleteByExample(WasteDisposalTempExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WasteDisposalTemp record);

    int insertSelective(WasteDisposalTemp record);

    List<WasteDisposalTemp> selectByExample(WasteDisposalTempExample example);

    WasteDisposalTemp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WasteDisposalTemp record, @Param("example") WasteDisposalTempExample example);

    int updateByExample(@Param("record") WasteDisposalTemp record, @Param("example") WasteDisposalTempExample example);

    int updateByPrimaryKeySelective(WasteDisposalTemp record);

    int updateByPrimaryKey(WasteDisposalTemp record);
}