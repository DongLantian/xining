package com.nankai.xining.repository;

import com.nankai.xining.bean.ActivityM;
import com.nankai.xining.bean.ActivityMExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityMMapper {
    long countByExample(ActivityMExample example);

    int deleteByExample(ActivityMExample example);

    int deleteByPrimaryKey(Integer monthId);

    int insert(ActivityM record);

    int insertSelective(ActivityM record);

    List<ActivityM> selectByExample(ActivityMExample example);

    ActivityM selectByPrimaryKey(Integer monthId);

    int updateByExampleSelective(@Param("record") ActivityM record, @Param("example") ActivityMExample example);

    int updateByExample(@Param("record") ActivityM record, @Param("example") ActivityMExample example);

    int updateByPrimaryKeySelective(ActivityM record);

    int updateByPrimaryKey(ActivityM record);
}