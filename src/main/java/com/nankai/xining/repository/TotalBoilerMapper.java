package com.nankai.xining.repository;

import com.nankai.xining.bean.TotalBoiler;
import com.nankai.xining.bean.TotalBoilerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TotalBoilerMapper {
    long countByExample(TotalBoilerExample example);

    int deleteByExample(TotalBoilerExample example);

    int deleteByPrimaryKey(Integer tboilerId);

    int insert(TotalBoiler record);

    int insertSelective(TotalBoiler record);

    List<TotalBoiler> selectByExample(TotalBoilerExample example);

    TotalBoiler selectByPrimaryKey(Integer tboilerId);

    int updateByExampleSelective(@Param("record") TotalBoiler record, @Param("example") TotalBoilerExample example);

    int updateByExample(@Param("record") TotalBoiler record, @Param("example") TotalBoilerExample example);

    int updateByPrimaryKeySelective(TotalBoiler record);

    int updateByPrimaryKey(TotalBoiler record);
}