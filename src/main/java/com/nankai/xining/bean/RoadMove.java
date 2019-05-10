package com.nankai.xining.bean;

import java.io.Serializable;

public class RoadMove implements Serializable {
    private Integer id;

    private String scccode;

    private String sourceDiscrip;

    private String year;

    private String countyCity;

    private String countyId;

    private Double averageMile;

    private Double carAmount;

    private Double carSpeed;

    private String fuelType;

    private Double carFuelamount;

    private Double orvrPercentage;

    private Double averageSamount;

    private Double pm25Emission;

    private Double pm10Emission;

    private Double ocEmission;

    private Double ecEmission;

    private Double so2Emission;

    private Double noxEmission;

    private Double coEmission;

    private Double nh3Emission;

    private Double vocsEmission;

    private Integer flag;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getCountyCity() {
        return countyCity;
    }

    public void setCountyCity(String countyCity) {
        this.countyCity = countyCity == null ? null : countyCity.trim();
    }

    public String getCountyId() {
        return countyId;
    }

    public void setCountyId(String countyId) {
        this.countyId = countyId == null ? null : countyId.trim();
    }

    public Double getAverageMile() {
        return averageMile;
    }

    public void setAverageMile(Double averageMile) {
        this.averageMile = averageMile;
    }

    public Double getCarAmount() {
        return carAmount;
    }

    public void setCarAmount(Double carAmount) {
        this.carAmount = carAmount;
    }

    public Double getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(Double carSpeed) {
        this.carSpeed = carSpeed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType == null ? null : fuelType.trim();
    }

    public Double getCarFuelamount() {
        return carFuelamount;
    }

    public void setCarFuelamount(Double carFuelamount) {
        this.carFuelamount = carFuelamount;
    }

    public Double getOrvrPercentage() {
        return orvrPercentage;
    }

    public void setOrvrPercentage(Double orvrPercentage) {
        this.orvrPercentage = orvrPercentage;
    }

    public Double getAverageSamount() {
        return averageSamount;
    }

    public void setAverageSamount(Double averageSamount) {
        this.averageSamount = averageSamount;
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

    public Double getOcEmission() {
        return ocEmission;
    }

    public void setOcEmission(Double ocEmission) {
        this.ocEmission = ocEmission;
    }

    public Double getEcEmission() {
        return ecEmission;
    }

    public void setEcEmission(Double ecEmission) {
        this.ecEmission = ecEmission;
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

    public Double getCoEmission() {
        return coEmission;
    }

    public void setCoEmission(Double coEmission) {
        this.coEmission = coEmission;
    }

    public Double getNh3Emission() {
        return nh3Emission;
    }

    public void setNh3Emission(Double nh3Emission) {
        this.nh3Emission = nh3Emission;
    }

    public Double getVocsEmission() {
        return vocsEmission;
    }

    public void setVocsEmission(Double vocsEmission) {
        this.vocsEmission = vocsEmission;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", scccode=").append(scccode);
        sb.append(", sourceDiscrip=").append(sourceDiscrip);
        sb.append(", year=").append(year);
        sb.append(", countyCity=").append(countyCity);
        sb.append(", countyId=").append(countyId);
        sb.append(", averageMile=").append(averageMile);
        sb.append(", carAmount=").append(carAmount);
        sb.append(", carSpeed=").append(carSpeed);
        sb.append(", fuelType=").append(fuelType);
        sb.append(", carFuelamount=").append(carFuelamount);
        sb.append(", orvrPercentage=").append(orvrPercentage);
        sb.append(", averageSamount=").append(averageSamount);
        sb.append(", pm25Emission=").append(pm25Emission);
        sb.append(", pm10Emission=").append(pm10Emission);
        sb.append(", ocEmission=").append(ocEmission);
        sb.append(", ecEmission=").append(ecEmission);
        sb.append(", so2Emission=").append(so2Emission);
        sb.append(", noxEmission=").append(noxEmission);
        sb.append(", coEmission=").append(coEmission);
        sb.append(", nh3Emission=").append(nh3Emission);
        sb.append(", vocsEmission=").append(vocsEmission);
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
        RoadMove other = (RoadMove) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getScccode() == null ? other.getScccode() == null : this.getScccode().equals(other.getScccode()))
            && (this.getSourceDiscrip() == null ? other.getSourceDiscrip() == null : this.getSourceDiscrip().equals(other.getSourceDiscrip()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getCountyCity() == null ? other.getCountyCity() == null : this.getCountyCity().equals(other.getCountyCity()))
            && (this.getCountyId() == null ? other.getCountyId() == null : this.getCountyId().equals(other.getCountyId()))
            && (this.getAverageMile() == null ? other.getAverageMile() == null : this.getAverageMile().equals(other.getAverageMile()))
            && (this.getCarAmount() == null ? other.getCarAmount() == null : this.getCarAmount().equals(other.getCarAmount()))
            && (this.getCarSpeed() == null ? other.getCarSpeed() == null : this.getCarSpeed().equals(other.getCarSpeed()))
            && (this.getFuelType() == null ? other.getFuelType() == null : this.getFuelType().equals(other.getFuelType()))
            && (this.getCarFuelamount() == null ? other.getCarFuelamount() == null : this.getCarFuelamount().equals(other.getCarFuelamount()))
            && (this.getOrvrPercentage() == null ? other.getOrvrPercentage() == null : this.getOrvrPercentage().equals(other.getOrvrPercentage()))
            && (this.getAverageSamount() == null ? other.getAverageSamount() == null : this.getAverageSamount().equals(other.getAverageSamount()))
            && (this.getPm25Emission() == null ? other.getPm25Emission() == null : this.getPm25Emission().equals(other.getPm25Emission()))
            && (this.getPm10Emission() == null ? other.getPm10Emission() == null : this.getPm10Emission().equals(other.getPm10Emission()))
            && (this.getOcEmission() == null ? other.getOcEmission() == null : this.getOcEmission().equals(other.getOcEmission()))
            && (this.getEcEmission() == null ? other.getEcEmission() == null : this.getEcEmission().equals(other.getEcEmission()))
            && (this.getSo2Emission() == null ? other.getSo2Emission() == null : this.getSo2Emission().equals(other.getSo2Emission()))
            && (this.getNoxEmission() == null ? other.getNoxEmission() == null : this.getNoxEmission().equals(other.getNoxEmission()))
            && (this.getCoEmission() == null ? other.getCoEmission() == null : this.getCoEmission().equals(other.getCoEmission()))
            && (this.getNh3Emission() == null ? other.getNh3Emission() == null : this.getNh3Emission().equals(other.getNh3Emission()))
            && (this.getVocsEmission() == null ? other.getVocsEmission() == null : this.getVocsEmission().equals(other.getVocsEmission()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getScccode() == null) ? 0 : getScccode().hashCode());
        result = prime * result + ((getSourceDiscrip() == null) ? 0 : getSourceDiscrip().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getCountyCity() == null) ? 0 : getCountyCity().hashCode());
        result = prime * result + ((getCountyId() == null) ? 0 : getCountyId().hashCode());
        result = prime * result + ((getAverageMile() == null) ? 0 : getAverageMile().hashCode());
        result = prime * result + ((getCarAmount() == null) ? 0 : getCarAmount().hashCode());
        result = prime * result + ((getCarSpeed() == null) ? 0 : getCarSpeed().hashCode());
        result = prime * result + ((getFuelType() == null) ? 0 : getFuelType().hashCode());
        result = prime * result + ((getCarFuelamount() == null) ? 0 : getCarFuelamount().hashCode());
        result = prime * result + ((getOrvrPercentage() == null) ? 0 : getOrvrPercentage().hashCode());
        result = prime * result + ((getAverageSamount() == null) ? 0 : getAverageSamount().hashCode());
        result = prime * result + ((getPm25Emission() == null) ? 0 : getPm25Emission().hashCode());
        result = prime * result + ((getPm10Emission() == null) ? 0 : getPm10Emission().hashCode());
        result = prime * result + ((getOcEmission() == null) ? 0 : getOcEmission().hashCode());
        result = prime * result + ((getEcEmission() == null) ? 0 : getEcEmission().hashCode());
        result = prime * result + ((getSo2Emission() == null) ? 0 : getSo2Emission().hashCode());
        result = prime * result + ((getNoxEmission() == null) ? 0 : getNoxEmission().hashCode());
        result = prime * result + ((getCoEmission() == null) ? 0 : getCoEmission().hashCode());
        result = prime * result + ((getNh3Emission() == null) ? 0 : getNh3Emission().hashCode());
        result = prime * result + ((getVocsEmission() == null) ? 0 : getVocsEmission().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        return result;
    }
}