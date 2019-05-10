package com.nankai.xining.repository;

import com.nankai.xining.bean.Nitreremove;
import com.nankai.xining.bean.NitreremoveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NitreremoveMapper {
    long countByExample(NitreremoveExample example);

    int deleteByExample(NitreremoveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Nitreremove record);

    int insertSelective(Nitreremove record);

    List<Nitreremove> selectByExample(NitreremoveExample example);

    Nitreremove selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Nitreremove record, @Param("example") NitreremoveExample example);

    int updateByExample(@Param("record") Nitreremove record, @Param("example") NitreremoveExample example);

    int updateByPrimaryKeySelective(Nitreremove record);

    int updateByPrimaryKey(Nitreremove record);
}