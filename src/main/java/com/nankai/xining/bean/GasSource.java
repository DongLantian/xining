package com.nankai.xining.bean;

import java.io.Serializable;

public class GasSource implements Serializable {
    private Integer id;

    private Integer companyId;

    private String year;

    private String gasType;

    private String scccode;

    private String sourceDiscrip;

    private Double salesVolume;

    private Double emission;

    private Integer flag;

    private Double volume;

    private Double everyVolume;

    private Integer volumeCount;

    private Integer gunNum;

    private Integer tankNum;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getGasType() {
        return gasType;
    }

    public void setGasType(String gasType) {
        this.gasType = gasType == null ? null : gasType.trim();
    }

    public String getScccode() {
        return scccode;
    }

    public void setScccode(String scccode) {
        this.scccode = scccode == null ? null : scccode.trim();
    }

    public String getSourceDiscrip() {
        return sourceDiscrip;
    }

    public void setSourceDiscrip(String sourceDiscrip) {
        this.sourceDiscrip = sourceDiscrip == null ? null : sourceDiscrip.trim();
    }

    public Double getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(Double salesVolume) {
        this.salesVolume = salesVolume;
    }

    public Double getEmission() {
        return emission;
    }

    public void setEmission(Double emission) {
        this.emission = emission;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getEveryVolume() {
        return everyVolume;
    }

    public void setEveryVolume(Double everyVolume) {
        this.everyVolume = everyVolume;
    }

    public Integer getVolumeCount() {
        return volumeCount;
    }

    public void setVolumeCount(Integer volumeCount) {
        this.volumeCount = volumeCount;
    }

    public Integer getGunNum() {
        return gunNum;
    }

    public void setGunNum(Integer gunNum) {
        this.gunNum = gunNum;
    }

    public Integer getTankNum() {
        return tankNum;
    }

    public void setTankNum(Integer tankNum) {
        this.tankNum = tankNum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", companyId=").append(companyId);
        sb.append(", year=").append(year);
        sb.append(", gasType=").append(gasType);
        sb.append(", scccode=").append(scccode);
        sb.append(", sourceDiscrip=").append(sourceDiscrip);
        sb.append(", salesVolume=").append(salesVolume);
        sb.append(", emission=").append(emission);
        sb.append(", flag=").append(flag);
        sb.append(", volume=").append(volume);
        sb.append(", everyVolume=").append(everyVolume);
        sb.append(", volumeCount=").append(volumeCount);
        sb.append(", gunNum=").append(gunNum);
        sb.append(", tankNum=").append(tankNum);
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
        GasSource other = (GasSource) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getGasType() == null ? other.getGasType() == null : this.getGasType().equals(other.getGasType()))
            && (this.getScccode() == null ? other.getScccode() == null : this.getScccode().equals(other.getScccode()))
            && (this.getSourceDiscrip() == null ? other.getSourceDiscrip() == null : this.getSourceDiscrip().equals(other.getSourceDiscrip()))
            && (this.getSalesVolume() == null ? other.getSalesVolume() == null : this.getSalesVolume().equals(other.getSalesVolume()))
            && (this.getEmission() == null ? other.getEmission() == null : this.getEmission().equals(other.getEmission()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getVolume() == null ? other.getVolume() == null : this.getVolume().equals(other.getVolume()))
            && (this.getEveryVolume() == null ? other.getEveryVolume() == null : this.getEveryVolume().equals(other.getEveryVolume()))
            && (this.getVolumeCount() == null ? other.getVolumeCount() == null : this.getVolumeCount().equals(other.getVolumeCount()))
            && (this.getGunNum() == null ? other.getGunNum() == null : this.getGunNum().equals(other.getGunNum()))
            && (this.getTankNum() == null ? other.getTankNum() == null : this.getTankNum().equals(other.getTankNum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getGasType() == null) ? 0 : getGasType().hashCode());
        result = prime * result + ((getScccode() == null) ? 0 : getScccode().hashCode());
        result = prime * result + ((getSourceDiscrip() == null) ? 0 : getSourceDiscrip().hashCode());
        result = prime * result + ((getSalesVolume() == null) ? 0 : getSalesVolume().hashCode());
        result = prime * result + ((getEmission() == null) ? 0 : getEmission().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getVolume() == null) ? 0 : getVolume().hashCode());
        result = prime * result + ((getEveryVolume() == null) ? 0 : getEveryVolume().hashCode());
        result = prime * result + ((getVolumeCount() == null) ? 0 : getVolumeCount().hashCode());
        result = prime * result + ((getGunNum() == null) ? 0 : getGunNum().hashCode());
        result = prime * result + ((getTankNum() == null) ? 0 : getTankNum().hashCode());
        return result;
    }
}