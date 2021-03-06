package com.nankai.xining.bean;

import java.io.Serializable;

public class Collectbreeding implements Serializable {
    private Integer id;

    private String year;

    private Integer companyId;

    private String sourceDiscrip;

    private String scccode;

    private Double activityLevel;

    private Integer computeCycle;

    private Double pm10Emission;

    private Double pm25Emission;

    private Double vocEmission;

    private Double nh3Emission;

    private Double so2Emission;

    private Double coEmission;

    private Double ocEmission;

    private Double bcEmission;

    private Double noxEmission;

    private Byte flag;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getSourceDiscrip() {
        return sourceDiscrip;
    }

    public void setSourceDiscrip(String sourceDiscrip) {
        this.sourceDiscrip = sourceDiscrip == null ? null : sourceDiscrip.trim();
    }

    public String getScccode() {
        return scccode;
    }

    public void setScccode(String scccode) {
        this.scccode = scccode == null ? null : scccode.trim();
    }

    public Double getActivityLevel() {
        return activityLevel;
    }

    public void setActivityLevel(Double activityLevel) {
        this.activityLevel = activityLevel;
    }

    public Integer getComputeCycle() {
        return computeCycle;
    }

    public void setComputeCycle(Integer computeCycle) {
        this.computeCycle = computeCycle;
    }

    public Double getPm10Emission() {
        return pm10Emission;
    }

    public void setPm10Emission(Double pm10Emission) {
        this.pm10Emission = pm10Emission;
    }

    public Double getPm25Emission() {
        return pm25Emission;
    }

    public void setPm25Emission(Double pm25Emission) {
        this.pm25Emission = pm25Emission;
    }

    public Double getVocEmission() {
        return vocEmission;
    }

    public void setVocEmission(Double vocEmission) {
        this.vocEmission = vocEmission;
    }

    public Double getNh3Emission() {
        return nh3Emission;
    }

    public void setNh3Emission(Double nh3Emission) {
        this.nh3Emission = nh3Emission;
    }

    public Double getSo2Emission() {
        return so2Emission;
    }

    public void setSo2Emission(Double so2Emission) {
        this.so2Emission = so2Emission;
    }

    public Double getCoEmission() {
        return coEmission;
    }

    public void setCoEmission(Double coEmission) {
        this.coEmission = coEmission;
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

    public Double getNoxEmission() {
        return noxEmission;
    }

    public void setNoxEmission(Double noxEmission) {
        this.noxEmission = noxEmission;
    }

    public Byte getFlag() {
        return flag;
    }

    public void setFlag(Byte flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", year=").append(year);
        sb.append(", companyId=").append(companyId);
        sb.append(", sourceDiscrip=").append(sourceDiscrip);
        sb.append(", scccode=").append(scccode);
        sb.append(", activityLevel=").append(activityLevel);
        sb.append(", computeCycle=").append(computeCycle);
        sb.append(", pm10Emission=").append(pm10Emission);
        sb.append(", pm25Emission=").append(pm25Emission);
        sb.append(", vocEmission=").append(vocEmission);
        sb.append(", nh3Emission=").append(nh3Emission);
        sb.append(", so2Emission=").append(so2Emission);
        sb.append(", coEmission=").append(coEmission);
        sb.append(", ocEmission=").append(ocEmission);
        sb.append(", bcEmission=").append(bcEmission);
        sb.append(", noxEmission=").append(noxEmission);
        sb.append(", flag=").append(flag);
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
        Collectbreeding other = (Collectbreeding) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getSourceDiscrip() == null ? other.getSourceDiscrip() == null : this.getSourceDiscrip().equals(other.getSourceDiscrip()))
            && (this.getScccode() == null ? other.getScccode() == null : this.getScccode().equals(other.getScccode()))
            && (this.getActivityLevel() == null ? other.getActivityLevel() == null : this.getActivityLevel().equals(other.getActivityLevel()))
            && (this.getComputeCycle() == null ? other.getComputeCycle() == null : this.getComputeCycle().equals(other.getComputeCycle()))
            && (this.getPm10Emission() == null ? other.getPm10Emission() == null : this.getPm10Emission().equals(other.getPm10Emission()))
            && (this.getPm25Emission() == null ? other.getPm25Emission() == null : this.getPm25Emission().equals(other.getPm25Emission()))
            && (this.getVocEmission() == null ? other.getVocEmission() == null : this.getVocEmission().equals(other.getVocEmission()))
            && (this.getNh3Emission() == null ? other.getNh3Emission() == null : this.getNh3Emission().equals(other.getNh3Emission()))
            && (this.getSo2Emission() == null ? other.getSo2Emission() == null : this.getSo2Emission().equals(other.getSo2Emission()))
            && (this.getCoEmission() == null ? other.getCoEmission() == null : this.getCoEmission().equals(other.getCoEmission()))
            && (this.getOcEmission() == null ? other.getOcEmission() == null : this.getOcEmission().equals(other.getOcEmission()))
            && (this.getBcEmission() == null ? other.getBcEmission() == null : this.getBcEmission().equals(other.getBcEmission()))
            && (this.getNoxEmission() == null ? other.getNoxEmission() == null : this.getNoxEmission().equals(other.getNoxEmission()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getSourceDiscrip() == null) ? 0 : getSourceDiscrip().hashCode());
        result = prime * result + ((getScccode() == null) ? 0 : getScccode().hashCode());
        result = prime * result + ((getActivityLevel() == null) ? 0 : getActivityLevel().hashCode());
        result = prime * result + ((getComputeCycle() == null) ? 0 : getComputeCycle().hashCode());
        result = prime * result + ((getPm10Emission() == null) ? 0 : getPm10Emission().hashCode());
        result = prime * result + ((getPm25Emission() == null) ? 0 : getPm25Emission().hashCode());
        result = prime * result + ((getVocEmission() == null) ? 0 : getVocEmission().hashCode());
        result = prime * result + ((getNh3Emission() == null) ? 0 : getNh3Emission().hashCode());
        result = prime * result + ((getSo2Emission() == null) ? 0 : getSo2Emission().hashCode());
        result = prime * result + ((getCoEmission() == null) ? 0 : getCoEmission().hashCode());
        result = prime * result + ((getOcEmission() == null) ? 0 : getOcEmission().hashCode());
        result = prime * result + ((getBcEmission() == null) ? 0 : getBcEmission().hashCode());
        result = prime * result + ((getNoxEmission() == null) ? 0 : getNoxEmission().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        return result;
    }
}