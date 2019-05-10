package com.nankai.xining.bean;

import java.io.Serializable;

public class GdInfo implements Serializable {
    private Integer id;

    private Integer boilerId;

    private String boilerFunc;

    private Double boilerTons;

    private String fuelType;

    private Double fuelUse;

    private String fuelUnit;

    private Integer exfId;

    private Double exfHeight;

    private Double exfDiam;

    private Double exfTemp;

    private Double exfVelo;

    private Double exfLatitude;

    private Double exfLongitude;

    private String plantId;

    private String countyId;

    private String industryId;

    private String gdyear;

    private Double pmFac;

    private Double pm10Fac;

    private Double pm25Fac;

    private Double vocFac;

    private Double coFac;

    private Double noxFac;

    private Double nh3Fac;

    private Double so2Fac;

    private Double ocFac;

    private Double bcFac;

    private String scc;

    private Integer drId;

    private Integer srId;

    private Integer nrId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBoilerId() {
        return boilerId;
    }

    public void setBoilerId(Integer boilerId) {
        this.boilerId = boilerId;
    }

    public String getBoilerFunc() {
        return boilerFunc;
    }

    public void setBoilerFunc(String boilerFunc) {
        this.boilerFunc = boilerFunc == null ? null : boilerFunc.trim();
    }

    public Double getBoilerTons() {
        return boilerTons;
    }

    public void setBoilerTons(Double boilerTons) {
        this.boilerTons = boilerTons;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType == null ? null : fuelType.trim();
    }

    public Double getFuelUse() {
        return fuelUse;
    }

    public void setFuelUse(Double fuelUse) {
        this.fuelUse = fuelUse;
    }

    public String getFuelUnit() {
        return fuelUnit;
    }

    public void setFuelUnit(String fuelUnit) {
        this.fuelUnit = fuelUnit == null ? null : fuelUnit.trim();
    }

    public Integer getExfId() {
        return exfId;
    }

    public void setExfId(Integer exfId) {
        this.exfId = exfId;
    }

    public Double getExfHeight() {
        return exfHeight;
    }

    public void setExfHeight(Double exfHeight) {
        this.exfHeight = exfHeight;
    }

    public Double getExfDiam() {
        return exfDiam;
    }

    public void setExfDiam(Double exfDiam) {
        this.exfDiam = exfDiam;
    }

    public Double getExfTemp() {
        return exfTemp;
    }

    public void setExfTemp(Double exfTemp) {
        this.exfTemp = exfTemp;
    }

    public Double getExfVelo() {
        return exfVelo;
    }

    public void setExfVelo(Double exfVelo) {
        this.exfVelo = exfVelo;
    }

    public Double getExfLatitude() {
        return exfLatitude;
    }

    public void setExfLatitude(Double exfLatitude) {
        this.exfLatitude = exfLatitude;
    }

    public Double getExfLongitude() {
        return exfLongitude;
    }

    public void setExfLongitude(Double exfLongitude) {
        this.exfLongitude = exfLongitude;
    }

    public String getPlantId() {
        return plantId;
    }

    public void setPlantId(String plantId) {
        this.plantId = plantId == null ? null : plantId.trim();
    }

    public String getCountyId() {
        return countyId;
    }

    public void setCountyId(String countyId) {
        this.countyId = countyId == null ? null : countyId.trim();
    }

    public String getIndustryId() {
        return industryId;
    }

    public void setIndustryId(String industryId) {
        this.industryId = industryId == null ? null : industryId.trim();
    }

    public String getGdyear() {
        return gdyear;
    }

    public void setGdyear(String gdyear) {
        this.gdyear = gdyear == null ? null : gdyear.trim();
    }

    public Double getPmFac() {
        return pmFac;
    }

    public void setPmFac(Double pmFac) {
        this.pmFac = pmFac;
    }

    public Double getPm10Fac() {
        return pm10Fac;
    }

    public void setPm10Fac(Double pm10Fac) {
        this.pm10Fac = pm10Fac;
    }

    public Double getPm25Fac() {
        return pm25Fac;
    }

    public void setPm25Fac(Double pm25Fac) {
        this.pm25Fac = pm25Fac;
    }

    public Double getVocFac() {
        return vocFac;
    }

    public void setVocFac(Double vocFac) {
        this.vocFac = vocFac;
    }

    public Double getCoFac() {
        return coFac;
    }

    public void setCoFac(Double coFac) {
        this.coFac = coFac;
    }

    public Double getNoxFac() {
        return noxFac;
    }

    public void setNoxFac(Double noxFac) {
        this.noxFac = noxFac;
    }

    public Double getNh3Fac() {
        return nh3Fac;
    }

    public void setNh3Fac(Double nh3Fac) {
        this.nh3Fac = nh3Fac;
    }

    public Double getSo2Fac() {
        return so2Fac;
    }

    public void setSo2Fac(Double so2Fac) {
        this.so2Fac = so2Fac;
    }

    public Double getOcFac() {
        return ocFac;
    }

    public void setOcFac(Double ocFac) {
        this.ocFac = ocFac;
    }

    public Double getBcFac() {
        return bcFac;
    }

    public void setBcFac(Double bcFac) {
        this.bcFac = bcFac;
    }

    public String getScc() {
        return scc;
    }

    public void setScc(String scc) {
        this.scc = scc == null ? null : scc.trim();
    }

    public Integer getDrId() {
        return drId;
    }

    public void setDrId(Integer drId) {
        this.drId = drId;
    }

    public Integer getSrId() {
        return srId;
    }

    public void setSrId(Integer srId) {
        this.srId = srId;
    }

    public Integer getNrId() {
        return nrId;
    }

    public void setNrId(Integer nrId) {
        this.nrId = nrId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", boilerId=").append(boilerId);
        sb.append(", boilerFunc=").append(boilerFunc);
        sb.append(", boilerTons=").append(boilerTons);
        sb.append(", fuelType=").append(fuelType);
        sb.append(", fuelUse=").append(fuelUse);
        sb.append(", fuelUnit=").append(fuelUnit);
        sb.append(", exfId=").append(exfId);
        sb.append(", exfHeight=").append(exfHeight);
        sb.append(", exfDiam=").append(exfDiam);
        sb.append(", exfTemp=").append(exfTemp);
        sb.append(", exfVelo=").append(exfVelo);
        sb.append(", exfLatitude=").append(exfLatitude);
        sb.append(", exfLongitude=").append(exfLongitude);
        sb.append(", plantId=").append(plantId);
        sb.append(", countyId=").append(countyId);
        sb.append(", industryId=").append(industryId);
        sb.append(", gdyear=").append(gdyear);
        sb.append(", pmFac=").append(pmFac);
        sb.append(", pm10Fac=").append(pm10Fac);
        sb.append(", pm25Fac=").append(pm25Fac);
        sb.append(", vocFac=").append(vocFac);
        sb.append(", coFac=").append(coFac);
        sb.append(", noxFac=").append(noxFac);
        sb.append(", nh3Fac=").append(nh3Fac);
        sb.append(", so2Fac=").append(so2Fac);
        sb.append(", ocFac=").append(ocFac);
        sb.append(", bcFac=").append(bcFac);
        sb.append(", scc=").append(scc);
        sb.append(", drId=").append(drId);
        sb.append(", srId=").append(srId);
        sb.append(", nrId=").append(nrId);
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
        GdInfo other = (GdInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBoilerId() == null ? other.getBoilerId() == null : this.getBoilerId().equals(other.getBoilerId()))
            && (this.getBoilerFunc() == null ? other.getBoilerFunc() == null : this.getBoilerFunc().equals(other.getBoilerFunc()))
            && (this.getBoilerTons() == null ? other.getBoilerTons() == null : this.getBoilerTons().equals(other.getBoilerTons()))
            && (this.getFuelType() == null ? other.getFuelType() == null : this.getFuelType().equals(other.getFuelType()))
            && (this.getFuelUse() == null ? other.getFuelUse() == null : this.getFuelUse().equals(other.getFuelUse()))
            && (this.getFuelUnit() == null ? other.getFuelUnit() == null : this.getFuelUnit().equals(other.getFuelUnit()))
            && (this.getExfId() == null ? other.getExfId() == null : this.getExfId().equals(other.getExfId()))
            && (this.getExfHeight() == null ? other.getExfHeight() == null : this.getExfHeight().equals(other.getExfHeight()))
            && (this.getExfDiam() == null ? other.getExfDiam() == null : this.getExfDiam().equals(other.getExfDiam()))
            && (this.getExfTemp() == null ? other.getExfTemp() == null : this.getExfTemp().equals(other.getExfTemp()))
            && (this.getExfVelo() == null ? other.getExfVelo() == null : this.getExfVelo().equals(other.getExfVelo()))
            && (this.getExfLatitude() == null ? other.getExfLatitude() == null : this.getExfLatitude().equals(other.getExfLatitude()))
            && (this.getExfLongitude() == null ? other.getExfLongitude() == null : this.getExfLongitude().equals(other.getExfLongitude()))
            && (this.getPlantId() == null ? other.getPlantId() == null : this.getPlantId().equals(other.getPlantId()))
            && (this.getCountyId() == null ? other.getCountyId() == null : this.getCountyId().equals(other.getCountyId()))
            && (this.getIndustryId() == null ? other.getIndustryId() == null : this.getIndustryId().equals(other.getIndustryId()))
            && (this.getGdyear() == null ? other.getGdyear() == null : this.getGdyear().equals(other.getGdyear()))
            && (this.getPmFac() == null ? other.getPmFac() == null : this.getPmFac().equals(other.getPmFac()))
            && (this.getPm10Fac() == null ? other.getPm10Fac() == null : this.getPm10Fac().equals(other.getPm10Fac()))
            && (this.getPm25Fac() == null ? other.getPm25Fac() == null : this.getPm25Fac().equals(other.getPm25Fac()))
            && (this.getVocFac() == null ? other.getVocFac() == null : this.getVocFac().equals(other.getVocFac()))
            && (this.getCoFac() == null ? other.getCoFac() == null : this.getCoFac().equals(other.getCoFac()))
            && (this.getNoxFac() == null ? other.getNoxFac() == null : this.getNoxFac().equals(other.getNoxFac()))
            && (this.getNh3Fac() == null ? other.getNh3Fac() == null : this.getNh3Fac().equals(other.getNh3Fac()))
            && (this.getSo2Fac() == null ? other.getSo2Fac() == null : this.getSo2Fac().equals(other.getSo2Fac()))
            && (this.getOcFac() == null ? other.getOcFac() == null : this.getOcFac().equals(other.getOcFac()))
            && (this.getBcFac() == null ? other.getBcFac() == null : this.getBcFac().equals(other.getBcFac()))
            && (this.getScc() == null ? other.getScc() == null : this.getScc().equals(other.getScc()))
            && (this.getDrId() == null ? other.getDrId() == null : this.getDrId().equals(other.getDrId()))
            && (this.getSrId() == null ? other.getSrId() == null : this.getSrId().equals(other.getSrId()))
            && (this.getNrId() == null ? other.getNrId() == null : this.getNrId().equals(other.getNrId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBoilerId() == null) ? 0 : getBoilerId().hashCode());
        result = prime * result + ((getBoilerFunc() == null) ? 0 : getBoilerFunc().hashCode());
        result = prime * result + ((getBoilerTons() == null) ? 0 : getBoilerTons().hashCode());
        result = prime * result + ((getFuelType() == null) ? 0 : getFuelType().hashCode());
        result = prime * result + ((getFuelUse() == null) ? 0 : getFuelUse().hashCode());
        result = prime * result + ((getFuelUnit() == null) ? 0 : getFuelUnit().hashCode());
        result = prime * result + ((getExfId() == null) ? 0 : getExfId().hashCode());
        result = prime * result + ((getExfHeight() == null) ? 0 : getExfHeight().hashCode());
        result = prime * result + ((getExfDiam() == null) ? 0 : getExfDiam().hashCode());
        result = prime * result + ((getExfTemp() == null) ? 0 : getExfTemp().hashCode());
        result = prime * result + ((getExfVelo() == null) ? 0 : getExfVelo().hashCode());
        result = prime * result + ((getExfLatitude() == null) ? 0 : getExfLatitude().hashCode());
        result = prime * result + ((getExfLongitude() == null) ? 0 : getExfLongitude().hashCode());
        result = prime * result + ((getPlantId() == null) ? 0 : getPlantId().hashCode());
        result = prime * result + ((getCountyId() == null) ? 0 : getCountyId().hashCode());
        result = prime * result + ((getIndustryId() == null) ? 0 : getIndustryId().hashCode());
        result = prime * result + ((getGdyear() == null) ? 0 : getGdyear().hashCode());
        result = prime * result + ((getPmFac() == null) ? 0 : getPmFac().hashCode());
        result = prime * result + ((getPm10Fac() == null) ? 0 : getPm10Fac().hashCode());
        result = prime * result + ((getPm25Fac() == null) ? 0 : getPm25Fac().hashCode());
        result = prime * result + ((getVocFac() == null) ? 0 : getVocFac().hashCode());
        result = prime * result + ((getCoFac() == null) ? 0 : getCoFac().hashCode());
        result = prime * result + ((getNoxFac() == null) ? 0 : getNoxFac().hashCode());
        result = prime * result + ((getNh3Fac() == null) ? 0 : getNh3Fac().hashCode());
        result = prime * result + ((getSo2Fac() == null) ? 0 : getSo2Fac().hashCode());
        result = prime * result + ((getOcFac() == null) ? 0 : getOcFac().hashCode());
        result = prime * result + ((getBcFac() == null) ? 0 : getBcFac().hashCode());
        result = prime * result + ((getScc() == null) ? 0 : getScc().hashCode());
        result = prime * result + ((getDrId() == null) ? 0 : getDrId().hashCode());
        result = prime * result + ((getSrId() == null) ? 0 : getSrId().hashCode());
        result = prime * result + ((getNrId() == null) ? 0 : getNrId().hashCode());
        return result;
    }
}