package com.nankai.xining.repository;

import com.nankai.xining.bean.RepastBarbecue;
import com.nankai.xining.bean.RepastBarbecueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepastBarbecueMapper {
    long countByExample(RepastBarbecueExample example);

    int deleteByExample(RepastBarbecueExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RepastBarbecue record);

    int insertSelective(RepastBarbecue record);

    List<RepastBarbecue> selectByExample(RepastBarbecueExample example);

    RepastBarbecue selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RepastBarbecue record, @Param("example") RepastBarbecueExample example);

    int updateByExample(@Param("record") RepastBarbecue record, @Param("example") RepastBarbecueExample example);

    int updateByPrimaryKeySelective(RepastBarbecue record);

    int updateByPrimaryKey(RepastBarbecue record);
}