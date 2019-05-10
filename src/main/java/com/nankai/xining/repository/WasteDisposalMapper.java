package com.nankai.xining.repository;

import com.nankai.xining.bean.WasteDisposal;
import com.nankai.xining.bean.WasteDisposalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WasteDisposalMapper {
    long countByExample(WasteDisposalExample example);

    int deleteByExample(WasteDisposalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WasteDisposal record);

    int insertSelective(WasteDisposal record);

    List<WasteDisposal> selectByExample(WasteDisposalExample example);

    WasteDisposal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WasteDisposal record, @Param("example") WasteDisposalExample example);

    int updateByExample(@Param("record") WasteDisposal record, @Param("example") WasteDisposalExample example);

    int updateByPrimaryKeySelective(WasteDisposal record);

    int updateByPrimaryKey(WasteDisposal record);
}