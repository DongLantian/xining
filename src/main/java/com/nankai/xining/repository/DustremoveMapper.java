package com.nankai.xining.repository;

import com.nankai.xining.bean.Dustremove;
import com.nankai.xining.bean.DustremoveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DustremoveMapper {
    long countByExample(DustremoveExample example);

    int deleteByExample(DustremoveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dustremove record);

    int insertSelective(Dustremove record);

    List<Dustremove> selectByExample(DustremoveExample example);

    Dustremove selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dustremove record, @Param("example") DustremoveExample example);

    int updateByExample(@Param("record") Dustremove record, @Param("example") DustremoveExample example);

    int updateByPrimaryKeySelective(Dustremove record);

    int updateByPrimaryKey(Dustremove record);
}