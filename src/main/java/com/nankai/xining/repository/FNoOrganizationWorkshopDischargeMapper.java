package com.nankai.xining.repository;

import com.nankai.xining.bean.FNoOrganizationWorkshopDischarge;
import com.nankai.xining.bean.FNoOrganizationWorkshopDischargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FNoOrganizationWorkshopDischargeMapper {
    long countByExample(FNoOrganizationWorkshopDischargeExample example);

    int deleteByExample(FNoOrganizationWorkshopDischargeExample example);

    int deleteByPrimaryKey(Integer wsid);

    int insert(FNoOrganizationWorkshopDischarge record);

    int insertSelective(FNoOrganizationWorkshopDischarge record);

    List<FNoOrganizationWorkshopDischarge> selectByExample(FNoOrganizationWorkshopDischargeExample example);

    FNoOrganizationWorkshopDischarge selectByPrimaryKey(Integer wsid);

    int updateByExampleSelective(@Param("record") FNoOrganizationWorkshopDischarge record, @Param("example") FNoOrganizationWorkshopDischargeExample example);

    int updateByExample(@Param("record") FNoOrganizationWorkshopDischarge record, @Param("example") FNoOrganizationWorkshopDischargeExample example);

    int updateByPrimaryKeySelective(FNoOrganizationWorkshopDischarge record);

    int updateByPrimaryKey(FNoOrganizationWorkshopDischarge record);
}