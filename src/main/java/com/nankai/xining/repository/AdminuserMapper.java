package com.nankai.xining.repository;

import com.nankai.xining.bean.Adminuser;
import com.nankai.xining.bean.AdminuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminuserMapper {
    long countByExample(AdminuserExample example);

    int deleteByExample(AdminuserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Adminuser record);

    int insertSelective(Adminuser record);

    List<Adminuser> selectByExample(AdminuserExample example);

    Adminuser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Adminuser record, @Param("example") AdminuserExample example);

    int updateByExample(@Param("record") Adminuser record, @Param("example") AdminuserExample example);

    int updateByPrimaryKeySelective(Adminuser record);

    int updateByPrimaryKey(Adminuser record);
}