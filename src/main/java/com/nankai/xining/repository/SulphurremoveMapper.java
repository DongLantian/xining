package com.nankai.xining.repository;

import com.nankai.xining.bean.Sulphurremove;
import com.nankai.xining.bean.SulphurremoveExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SulphurremoveMapper {
    long countByExample(SulphurremoveExample example);

    int deleteByExample(SulphurremoveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sulphurremove record);

    int insertSelective(Sulphurremove record);

    List<Sulphurremove> selectByExample(SulphurremoveExample example);

    Sulphurremove selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sulphurremove record, @Param("example") SulphurremoveExample example);

    int updateByExample(@Param("record") Sulphurremove record, @Param("example") SulphurremoveExample example);

    int updateByPrimaryKeySelective(Sulphurremove record);

    int updateByPrimaryKey(Sulphurremove record);
}