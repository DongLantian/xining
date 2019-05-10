package com.nankai.xining.repository;

import com.nankai.xining.bean.Loadingtrans;
import com.nankai.xining.bean.LoadingtransExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoadingtransMapper {
    long countByExample(LoadingtransExample example);

    int deleteByExample(LoadingtransExample example);

    int deleteByPrimaryKey(Integer transid);

    int insert(Loadingtrans record);

    int insertSelective(Loadingtrans record);

    List<Loadingtrans> selectByExample(LoadingtransExample example);

    Loadingtrans selectByPrimaryKey(Integer transid);

    int updateByExampleSelective(@Param("record") Loadingtrans record, @Param("example") LoadingtransExample example);

    int updateByExample(@Param("record") Loadingtrans record, @Param("example") LoadingtransExample example);

    int updateByPrimaryKeySelective(Loadingtrans record);

    int updateByPrimaryKey(Loadingtrans record);
}