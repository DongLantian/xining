package com.nankai.xining.repository;

import com.nankai.xining.bean.Ctrlvisiprec;
import com.nankai.xining.bean.CtrlvisiprecExample;
import com.nankai.xining.bean.CtrlvisiprecKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtrlvisiprecMapper {
    long countByExample(CtrlvisiprecExample example);

    int deleteByExample(CtrlvisiprecExample example);

    int deleteByPrimaryKey(CtrlvisiprecKey key);

    int insert(Ctrlvisiprec record);

    int insertSelective(Ctrlvisiprec record);

    List<Ctrlvisiprec> selectByExample(CtrlvisiprecExample example);

    Ctrlvisiprec selectByPrimaryKey(CtrlvisiprecKey key);

    int updateByExampleSelective(@Param("record") Ctrlvisiprec record, @Param("example") CtrlvisiprecExample example);

    int updateByExample(@Param("record") Ctrlvisiprec record, @Param("example") CtrlvisiprecExample example);

    int updateByPrimaryKeySelective(Ctrlvisiprec record);

    int updateByPrimaryKey(Ctrlvisiprec record);
}