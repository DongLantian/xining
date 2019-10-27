package com.nankai.xining.repository;

import com.nankai.xining.bean.RongjiProduct;
import com.nankai.xining.bean.RongjiProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RongjiProductMapper {
    long countByExample(RongjiProductExample example);

    int deleteByExample(RongjiProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RongjiProduct record);

    int insertSelective(RongjiProduct record);

    List<RongjiProduct> selectByExample(RongjiProductExample example);

    RongjiProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RongjiProduct record, @Param("example") RongjiProductExample example);

    int updateByExample(@Param("record") RongjiProduct record, @Param("example") RongjiProductExample example);

    int updateByPrimaryKeySelective(RongjiProduct record);

    int updateByPrimaryKey(RongjiProduct record);

    List<RongjiProduct> selectByFactoryIdWithJoin(int factoryId);
}