package com.nankai.xining.repository;

import com.nankai.xining.bean.FNoOrganizationWorkshopDischargeTemp;
import com.nankai.xining.bean.FNoOrganizationWorkshopDischargeTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FNoOrganizationWorkshopDischargeTempMapper {
    long countByExample(FNoOrganizationWorkshopDischargeTempExample example);

    int deleteByExample(FNoOrganizationWorkshopDischargeTempExample example);

    int deleteByPrimaryKey(Integer wsid);

    int insert(FNoOrganizationWorkshopDischargeTemp record);

    int insertSelective(FNoOrganizationWorkshopDischargeTemp record);

    List<FNoOrganizationWorkshopDischargeTemp> selectByExample(FNoOrganizationWorkshopDischargeTempExample example);

    FNoOrganizationWorkshopDischargeTemp selectByPrimaryKey(Integer wsid);

    int updateByExampleSelective(@Param("record") FNoOrganizationWorkshopDischargeTemp record, @Param("example") FNoOrganizationWorkshopDischargeTempExample example);

    int updateByExample(@Param("record") FNoOrganizationWorkshopDischargeTemp record, @Param("example") FNoOrganizationWorkshopDischargeTempExample example);

    int updateByPrimaryKeySelective(FNoOrganizationWorkshopDischargeTemp record);

    int updateByPrimaryKey(FNoOrganizationWorkshopDischargeTemp record);
}