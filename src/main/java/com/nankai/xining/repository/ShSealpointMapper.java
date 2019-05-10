package com.nankai.xining.repository;

import com.nankai.xining.bean.ShSealpoint;
import com.nankai.xining.bean.ShSealpointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShSealpointMapper {
    long countByExample(ShSealpointExample example);

    int deleteByExample(ShSealpointExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShSealpoint record);

    int insertSelective(ShSealpoint record);

    List<ShSealpoint> selectByExample(ShSealpointExample example);

    ShSealpoint selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShSealpoint record, @Param("example") ShSealpointExample example);

    int updateByExample(@Param("record") ShSealpoint record, @Param("example") ShSealpointExample example);

    int updateByPrimaryKeySelective(ShSealpoint record);

    int updateByPrimaryKey(ShSealpoint record);
}