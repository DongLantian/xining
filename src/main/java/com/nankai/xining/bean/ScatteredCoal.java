package com.nankai.xining.bean;

import java.io.Serializable;

public class ScatteredCoal implements Serializable {
    private Integer id;

    private String sccCode;

    private String year;

    private String countyId;

    private String activityLevel;

    private String fuelMeteringUnit;

    private Double activityLevelNum;

    private String controlMeasure;

    private Double sulfurContent;

    private Double ashContent;

    private Double pm25Emission;

    private Double pm10Emission;

    private Double coEmission;

    private Double vocEmission;

    private Double so2Emission;

    private Double noxEmission;

    private Double nh3Emission;

    private Double ocEmission;

    private Double bcEmission;

    private String sourceDescription;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSccCode() {
        return sccCode;
    }

    public void setSccCode(String sccCode) {
        this.sccCode = sccCode == null ? null : sccCode.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getCountyId() {
        return countyId;
    }

    public void setCountyId(String countyId) {
        this.countyId = countyId == null ? null : countyId.trim();
    }

    public String getActivityLevel() {
        return activityLevel;
    }

    public void setActivityLevel(String activityLevel) {
        this.activityLevel = activityLevel == null ? null : activityLevel.trim();
    }

    public String getFuelMeteringUnit() {
        return fuelMeteringUnit;
    }

    public void setFuelMeteringUnit(String fuelMeteringUnit) {
        this.fuelMeteringUnit = fuelMeteringUnit == null ? null : fuelMeteringUnit.trim();
    }

    public Double getActivityLevelNum() {
        return activityLevelNum;
    }

    public void setActivityLevelNum(Double activityLevelNum) {
        this.activityLevelNum = activityLevelNum;
    }

    public String getControlMeasure() {
        return controlMeasure;
    }

    public void setControlMeasure(String controlMeasure) {
        this.controlMeasure = controlMeasure == null ? null : controlMeasure.trim();
    }

    public Double getSulfurContent() {
        return sulfurContent;
    }

    public void setSulfurContent(Double sulfurContent) {
        this.sulfurContent = sulfurContent;
    }

    public Double getAshContent() {
        return ashContent;
    }

    public void setAshContent(Double ashContent) {
        this.ashContent = ashContent;
    }

    public Double getPm25Emission() {
        return pm25Emission;
    }

    public void setPm25Emission(Double pm25Emission) {
        this.pm25Emission = pm25Emission;
    }

    public Double getPm10Emission() {
        return pm10Emission;
    }

    public void setPm10Emission(Double pm10Emission) {
        this.pm10Emission = pm10Emission;
    }

    public Double getCoEmission() {
        return coEmission;
    }

    public void setCoEmission(Double coEmission) {
        this.coEmission = coEmission;
    }

    public Double getVocEmission() {
        return vocEmission;
    }

    public void setVocEmission(Double vocEmission) {
        this.vocEmission = vocEmission;
    }

    public Double getSo2Emission() {
        return so2Emission;
    }

    public void setSo2Emission(Double so2Emission) {
        this.so2Emission = so2Emission;
    }

    public Double getNoxEmission() {
        return noxEmission;
    }

    public void setNoxEmission(Double noxEmission) {
        this.noxEmission = noxEmission;
    }

    public Double getNh3Emission() {
        return nh3Emission;
    }

    public void setNh3Emission(Double nh3Emission) {
        this.nh3Emission = nh3Emission;
    }

    public Double getOcEmission() {
        return ocEmission;
    }

    public void setOcEmission(Double ocEmission) {
        this.ocEmission = ocEmission;
    }

    public Double getBcEmission() {
        return bcEmission;
    }

    public void setBcEmission(Double bcEmission) {
        this.bcEmission = bcEmission;
    }

    public String getSourceDescription() {
        return sourceDescription;
    }

    public void setSourceDescription(String sourceDescription) {
        this.sourceDescription = sourceDescription == null ? null : sourceDescription.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sccCode=").append(sccCode);
        sb.append(", year=").append(year);
        sb.append(", countyId=").append(countyId);
        sb.append(", activityLevel=").append(activityLevel);
        sb.append(", fuelMeteringUnit=").append(fuelMeteringUnit);
        sb.append(", activityLevelNum=").append(activityLevelNum);
        sb.append(", controlMeasure=").append(controlMeasure);
        sb.append(", sulfurContent=").append(sulfurContent);
        sb.append(", ashContent=").append(ashContent);
        sb.append(", pm25Emission=").append(pm25Emission);
        sb.append(", pm10Emission=").append(pm10Emission);
        sb.append(", coEmission=").append(coEmission);
        sb.append(", vocEmission=").append(vocEmission);
        sb.append(", so2Emission=").append(so2Emission);
        sb.append(", noxEmission=").append(noxEmission);
        sb.append(", nh3Emission=").append(nh3Emission);
        sb.append(", ocEmission=").append(ocEmission);
        sb.append(", bcEmission=").append(bcEmission);
        sb.append(", sourceDescription=").append(sourceDescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ScatteredCoal other = (ScatteredCoal) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSccCode() == null ? other.getSccCode() == null : this.getSccCode().equals(other.getSccCode()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getCountyId() == null ? other.getCountyId() == null : this.getCountyId().equals(other.getCountyId()))
            && (this.getActivityLevel() == null ? other.getActivityLevel() == null : this.getActivityLevel().equals(other.getActivityLevel()))
            && (this.getFuelMeteringUnit() == null ? other.getFuelMeteringUnit() == null : this.getFuelMeteringUnit().equals(other.getFuelMeteringUnit()))
            && (this.getActivityLevelNum() == null ? other.getActivityLevelNum() == null : this.getActivityLevelNum().equals(other.getActivityLevelNum()))
            && (this.getControlMeasure() == null ? other.getControlMeasure() == null : this.getControlMeasure().equals(other.getControlMeasure()))
            && (this.getSulfurContent() == null ? other.getSulfurContent() == null : this.getSulfurContent().equals(other.getSulfurContent()))
            && (this.getAshContent() == null ? other.getAshContent() == null : this.getAshContent().equals(other.getAshContent()))
            && (this.getPm25Emission() == null ? other.getPm25Emission() == null : this.getPm25Emission().equals(other.getPm25Emission()))
            && (this.getPm10Emission() == null ? other.getPm10Emission() == null : this.getPm10Emission().equals(other.getPm10Emission()))
            && (this.getCoEmission() == null ? other.getCoEmission() == null : this.getCoEmission().equals(other.getCoEmission()))
            && (this.getVocEmission() == null ? other.getVocEmission() == null : this.getVocEmission().equals(other.getVocEmission()))
            && (this.getSo2Emission() == null ? other.getSo2Emission() == null : this.getSo2Emission().equals(other.getSo2Emission()))
            && (this.getNoxEmission() == null ? other.getNoxEmission() == null : this.getNoxEmission().equals(other.getNoxEmission()))
            && (this.getNh3Emission() == null ? other.getNh3Emission() == null : this.getNh3Emission().equals(other.getNh3Emission()))
            && (this.getOcEmission() == null ? other.getOcEmission() == null : this.getOcEmission().equals(other.getOcEmission()))
            && (this.getBcEmission() == null ? other.getBcEmission() == null : this.getBcEmission().equals(other.getBcEmission()))
            && (this.getSourceDescription() == null ? other.getSourceDescription() == null : this.getSourceDescription().equals(other.getSourceDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSccCode() == null) ? 0 : getSccCode().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getCountyId() == null) ? 0 : getCountyId().hashCode());
        result = prime * result + ((getActivityLevel() == null) ? 0 : getActivityLevel().hashCode());
        result = prime * result + ((getFuelMeteringUnit() == null) ? 0 : getFuelMeteringUnit().hashCode());
        result = prime * result + ((getActivityLevelNum() == null) ? 0 : getActivityLevelNum().hashCode());
        result = prime * result + ((getControlMeasure() == null) ? 0 : getControlMeasure().hashCode());
        result = prime * result + ((getSulfurContent() == null) ? 0 : getSulfurContent().hashCode());
        result = prime * result + ((getAshContent() == null) ? 0 : getAshContent().hashCode());
        result = prime * result + ((getPm25Emission() == null) ? 0 : getPm25Emission().hashCode());
        result = prime * result + ((getPm10Emission() == null) ? 0 : getPm10Emission().hashCode());
        result = prime * result + ((getCoEmission() == null) ? 0 : getCoEmission().hashCode());
        result = prime * result + ((getVocEmission() == null) ? 0 : getVocEmission().hashCode());
        result = prime * result + ((getSo2Emission() == null) ? 0 : getSo2Emission().hashCode());
        result = prime * result + ((getNoxEmission() == null) ? 0 : getNoxEmission().hashCode());
        result = prime * result + ((getNh3Emission() == null) ? 0 : getNh3Emission().hashCode());
        result = prime * result + ((getOcEmission() == null) ? 0 : getOcEmission().hashCode());
        result = prime * result + ((getBcEmission() == null) ? 0 : getBcEmission().hashCode());
        result = prime * result + ((getSourceDescription() == null) ? 0 : getSourceDescription().hashCode());
        return result;
    }
}