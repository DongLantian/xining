package com.nankai.xining.bean;

import java.io.Serializable;

public class GdView implements Serializable {
    private Integer boilerId;

    private String boilerModel;

    private Double boilerTons;

    private String fuel;

    private Double fuelUse;

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

    private Double pm10Fac;

    private Double pm25Fac;

    private Double coFac;

    private Double vocFac;

    private Double pmFac;

    private Double so2Fac;

    private Double noxFac;

    private Double nh3Fac;

    private Double ocFac;

    private Double bcFac;

    private String scc;

    private Integer nitreremoveId;

    private Integer sulphurremoveId;

    private Integer dustremoveId;

    private static final long serialVersionUID = 1L;

    public Integer getBoilerId() {
        return boilerId;
    }

    public void setBoilerId(Integer boilerId) {
        this.boilerId = boilerId;
    }

    public String getBoilerModel() {
        return boilerModel;
    }

    public void setBoilerModel(String boilerModel) {
        this.boilerModel = boilerModel == null ? null : boilerModel.trim();
    }

    public Double getBoilerTons() {
        return boilerTons;
    }

    public void setBoilerTons(Double boilerTons) {
        this.boilerTons = boilerTons;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel == null ? null : fuel.trim();
    }

    public Double getFuelUse() {
        return fuelUse;
    }

    public void setFuelUse(Double fuelUse) {
        this.fuelUse = fuelUse;
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

    public Double getCoFac() {
        return coFac;
    }

    public void setCoFac(Double coFac) {
        this.coFac = coFac;
    }

    public Double getVocFac() {
        return vocFac;
    }

    public void setVocFac(Double vocFac) {
        this.vocFac = vocFac;
    }

    public Double getPmFac() {
        return pmFac;
    }

    public void setPmFac(Double pmFac) {
        this.pmFac = pmFac;
    }

    public Double getSo2Fac() {
        return so2Fac;
    }

    public void setSo2Fac(Double so2Fac) {
        this.so2Fac = so2Fac;
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

    public Integer getNitreremoveId() {
        return nitreremoveId;
    }

    public void setNitreremoveId(Integer nitreremoveId) {
        this.nitreremoveId = nitreremoveId;
    }

    public Integer getSulphurremoveId() {
        return sulphurremoveId;
    }

    public void setSulphurremoveId(Integer sulphurremoveId) {
        this.sulphurremoveId = sulphurremoveId;
    }

    public Integer getDustremoveId() {
        return dustremoveId;
    }

    public void setDustremoveId(Integer dustremoveId) {
        this.dustremoveId = dustremoveId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", boilerId=").append(boilerId);
        sb.append(", boilerModel=").append(boilerModel);
        sb.append(", boilerTons=").append(boilerTons);
        sb.append(", fuel=").append(fuel);
        sb.append(", fuelUse=").append(fuelUse);
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
        sb.append(", pm10Fac=").append(pm10Fac);
        sb.append(", pm25Fac=").append(pm25Fac);
        sb.append(", coFac=").append(coFac);
        sb.append(", vocFac=").append(vocFac);
        sb.append(", pmFac=").append(pmFac);
        sb.append(", so2Fac=").append(so2Fac);
        sb.append(", noxFac=").append(noxFac);
        sb.append(", nh3Fac=").append(nh3Fac);
        sb.append(", ocFac=").append(ocFac);
        sb.append(", bcFac=").append(bcFac);
        sb.append(", scc=").append(scc);
        sb.append(", nitreremoveId=").append(nitreremoveId);
        sb.append(", sulphurremoveId=").append(sulphurremoveId);
        sb.append(", dustremoveId=").append(dustremoveId);
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
        GdView other = (GdView) that;
        return (this.getBoilerId() == null ? other.getBoilerId() == null : this.getBoilerId().equals(other.getBoilerId()))
            && (this.getBoilerModel() == null ? other.getBoilerModel() == null : this.getBoilerModel().equals(other.getBoilerModel()))
            && (this.getBoilerTons() == null ? other.getBoilerTons() == null : this.getBoilerTons().equals(other.getBoilerTons()))
            && (this.getFuel() == null ? other.getFuel() == null : this.getFuel().equals(other.getFuel()))
            && (this.getFuelUse() == null ? other.getFuelUse() == null : this.getFuelUse().equals(other.getFuelUse()))
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
            && (this.getPm10Fac() == null ? other.getPm10Fac() == null : this.getPm10Fac().equals(other.getPm10Fac()))
            && (this.getPm25Fac() == null ? other.getPm25Fac() == null : this.getPm25Fac().equals(other.getPm25Fac()))
            && (this.getCoFac() == null ? other.getCoFac() == null : this.getCoFac().equals(other.getCoFac()))
            && (this.getVocFac() == null ? other.getVocFac() == null : this.getVocFac().equals(other.getVocFac()))
            && (this.getPmFac() == null ? other.getPmFac() == null : this.getPmFac().equals(other.getPmFac()))
            && (this.getSo2Fac() == null ? other.getSo2Fac() == null : this.getSo2Fac().equals(other.getSo2Fac()))
            && (this.getNoxFac() == null ? other.getNoxFac() == null : this.getNoxFac().equals(other.getNoxFac()))
            && (this.getNh3Fac() == null ? other.getNh3Fac() == null : this.getNh3Fac().equals(other.getNh3Fac()))
            && (this.getOcFac() == null ? other.getOcFac() == null : this.getOcFac().equals(other.getOcFac()))
            && (this.getBcFac() == null ? other.getBcFac() == null : this.getBcFac().equals(other.getBcFac()))
            && (this.getScc() == null ? other.getScc() == null : this.getScc().equals(other.getScc()))
            && (this.getNitreremoveId() == null ? other.getNitreremoveId() == null : this.getNitreremoveId().equals(other.getNitreremoveId()))
            && (this.getSulphurremoveId() == null ? other.getSulphurremoveId() == null : this.getSulphurremoveId().equals(other.getSulphurremoveId()))
            && (this.getDustremoveId() == null ? other.getDustremoveId() == null : this.getDustremoveId().equals(other.getDustremoveId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBoilerId() == null) ? 0 : getBoilerId().hashCode());
        result = prime * result + ((getBoilerModel() == null) ? 0 : getBoilerModel().hashCode());
        result = prime * result + ((getBoilerTons() == null) ? 0 : getBoilerTons().hashCode());
        result = prime * result + ((getFuel() == null) ? 0 : getFuel().hashCode());
        result = prime * result + ((getFuelUse() == null) ? 0 : getFuelUse().hashCode());
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
        result = prime * result + ((getPm10Fac() == null) ? 0 : getPm10Fac().hashCode());
        result = prime * result + ((getPm25Fac() == null) ? 0 : getPm25Fac().hashCode());
        result = prime * result + ((getCoFac() == null) ? 0 : getCoFac().hashCode());
        result = prime * result + ((getVocFac() == null) ? 0 : getVocFac().hashCode());
        result = prime * result + ((getPmFac() == null) ? 0 : getPmFac().hashCode());
        result = prime * result + ((getSo2Fac() == null) ? 0 : getSo2Fac().hashCode());
        result = prime * result + ((getNoxFac() == null) ? 0 : getNoxFac().hashCode());
        result = prime * result + ((getNh3Fac() == null) ? 0 : getNh3Fac().hashCode());
        result = prime * result + ((getOcFac() == null) ? 0 : getOcFac().hashCode());
        result = prime * result + ((getBcFac() == null) ? 0 : getBcFac().hashCode());
        result = prime * result + ((getScc() == null) ? 0 : getScc().hashCode());
        result = prime * result + ((getNitreremoveId() == null) ? 0 : getNitreremoveId().hashCode());
        result = prime * result + ((getSulphurremoveId() == null) ? 0 : getSulphurremoveId().hashCode());
        result = prime * result + ((getDustremoveId() == null) ? 0 : getDustremoveId().hashCode());
        return result;
    }
}