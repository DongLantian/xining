package com.nankai.xining.repository;

import com.nankai.xining.bean.Ctrlairatmos;
import com.nankai.xining.bean.CtrlairatmosExample;
import com.nankai.xining.bean.CtrlairatmosKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtrlairatmosMapper {
    long countByExample(CtrlairatmosExample example);

    int deleteByExample(CtrlairatmosExample example);

    int deleteByPrimaryKey(CtrlairatmosKey key);

    int insert(Ctrlairatmos record);

    int insertSelective(Ctrlairatmos record);

    List<Ctrlairatmos> selectByExample(CtrlairatmosExample example);

    Ctrlairatmos selectByPrimaryKey(CtrlairatmosKey key);

    int updateByExampleSelective(@Param("record") Ctrlairatmos record, @Param("example") CtrlairatmosExample example);

    int updateByExample(@Param("record") Ctrlairatmos record, @Param("example") CtrlairatmosExample example);

    int updateByPrimaryKeySelective(Ctrlairatmos record);

    int updateByPrimaryKey(Ctrlairatmos record);
}