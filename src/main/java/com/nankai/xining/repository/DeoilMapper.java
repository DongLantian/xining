package com.nankai.xining.repository;

import com.nankai.xining.bean.Deoil;
import com.nankai.xining.bean.DeoilExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeoilMapper {
    long countByExample(DeoilExample example);

    int deleteByExample(DeoilExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Deoil record);

    int insertSelective(Deoil record);

    List<Deoil> selectByExample(DeoilExample example);

    Deoil selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Deoil record, @Param("example") DeoilExample example);

    int updateByExample(@Param("record") Deoil record, @Param("example") DeoilExample example);

    int updateByPrimaryKeySelective(Deoil record);

    int updateByPrimaryKey(Deoil record);
}