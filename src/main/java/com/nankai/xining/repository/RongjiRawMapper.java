package com.nankai.xining.repository;

import com.nankai.xining.bean.RongjiRaw;
import com.nankai.xining.bean.RongjiRawExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RongjiRawMapper {
    long countByExample(RongjiRawExample example);

    int deleteByExample(RongjiRawExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RongjiRaw record);

    int insertSelective(RongjiRaw record);

    List<RongjiRaw> selectByExample(RongjiRawExample example);

    RongjiRaw selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RongjiRaw record, @Param("example") RongjiRawExample example);

    int updateByExample(@Param("record") RongjiRaw record, @Param("example") RongjiRawExample example);

    int updateByPrimaryKeySelective(RongjiRaw record);

    int updateByPrimaryKey(RongjiRaw record);

    List<RongjiRaw> selectByFactoryIdWithJoin(int factoryId);
}