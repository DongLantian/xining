package com.nankai.xining.repository;

import com.nankai.xining.bean.ShEffluentemission;
import com.nankai.xining.bean.ShEffluentemissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShEffluentemissionMapper {
    long countByExample(ShEffluentemissionExample example);

    int deleteByExample(ShEffluentemissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShEffluentemission record);

    int insertSelective(ShEffluentemission record);

    List<ShEffluentemission> selectByExample(ShEffluentemissionExample example);

    ShEffluentemission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShEffluentemission record, @Param("example") ShEffluentemissionExample example);

    int updateByExample(@Param("record") ShEffluentemission record, @Param("example") ShEffluentemissionExample example);

    int updateByPrimaryKeySelective(ShEffluentemission record);

    int updateByPrimaryKey(ShEffluentemission record);
}