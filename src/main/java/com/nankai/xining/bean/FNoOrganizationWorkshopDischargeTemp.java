package com.nankai.xining.bean;

import java.io.Serializable;

public class FNoOrganizationWorkshopDischargeTemp implements Serializable {
    private Integer wsid;

    private Integer workshopid;

    private String scccode;

    private Integer factoryid;

    private Double longitude;

    private Double latitude;

    private String productionUse;

    private Double workshopArea;

    private Double pm10Factors;

    private Double pm25Factors;

    private Double ocFactors;

    private Double ecFactors;

    private Double so2Factors;

    private Double noxFactors;

    private Double coFactors;

    private Double nh3Factors;

    private Double vocsFactors;

    private Double pm10Emission;

    private Double pm25Emission;

    private Double ocEmission;

    private Double ecEmission;

    private Double so2Emission;

    private Double noxEmission;

    private Double coEmission;

    private Double nh3Emission;

    private Double vocsEmission;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getWsid() {
        return wsid;
    }

    public void setWsid(Integer wsid) {
        this.wsid = wsid;
    }

    public Integer getWorkshopid() {
        return workshopid;
    }

    public void setWorkshopid(Integer workshopid) {
        this.workshopid = workshopid;
    }

    public String getScccode() {
        return scccode;
    }

    public void setScccode(String scccode) {
        this.scccode = scccode == null ? null : scccode.trim();
    }

    public Integer getFactoryid() {
        return factoryid;
    }

    public void setFactoryid(Integer factoryid) {
        this.factoryid = factoryid;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getProductionUse() {
        return productionUse;
    }

    public void setProductionUse(String productionUse) {
        this.productionUse = productionUse == null ? null : productionUse.trim();
    }

    public Double getWorkshopArea() {
        return workshopArea;
    }

    public void setWorkshopArea(Double workshopArea) {
        this.workshopArea = workshopArea;
    }

    public Double getPm10Factors() {
        return pm10Factors;
    }

    public void setPm10Factors(Double pm10Factors) {
        this.pm10Factors = pm10Factors;
    }

    public Double getPm25Factors() {
        return pm25Factors;
    }

    public void setPm25Factors(Double pm25Factors) {
        this.pm25Factors = pm25Factors;
    }

    public Double getOcFactors() {
        return ocFactors;
    }

    public void setOcFactors(Double ocFactors) {
        this.ocFactors = ocFactors;
    }

    public Double getEcFactors() {
        return ecFactors;
    }

    public void setEcFactors(Double ecFactors) {
        this.ecFactors = ecFactors;
    }

    public Double getSo2Factors() {
        return so2Factors;
    }

    public void setSo2Factors(Double so2Factors) {
        this.so2Factors = so2Factors;
    }

    public Double getNoxFactors() {
        return noxFactors;
    }

    public void setNoxFactors(Double noxFactors) {
        this.noxFactors = noxFactors;
    }

    public Double getCoFactors() {
        return coFactors;
    }

    public void setCoFactors(Double coFactors) {
        this.coFactors = coFactors;
    }

    public Double getNh3Factors() {
        return nh3Factors;
    }

    public void setNh3Factors(Double nh3Factors) {
        this.nh3Factors = nh3Factors;
    }

    public Double getVocsFactors() {
        return vocsFactors;
    }

    public void setVocsFactors(Double vocsFactors) {
        this.vocsFactors = vocsFactors;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wsid=").append(wsid);
        sb.append(", workshopid=").append(workshopid);
        sb.append(", scccode=").append(scccode);
        sb.append(", factoryid=").append(factoryid);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", productionUse=").append(productionUse);
        sb.append(", workshopArea=").append(workshopArea);
        sb.append(", pm10Factors=").append(pm10Factors);
        sb.append(", pm25Factors=").append(pm25Factors);
        sb.append(", ocFactors=").append(ocFactors);
        sb.append(", ecFactors=").append(ecFactors);
        sb.append(", so2Factors=").append(so2Factors);
        sb.append(", noxFactors=").append(noxFactors);
        sb.append(", coFactors=").append(coFactors);
        sb.append(", nh3Factors=").append(nh3Factors);
        sb.append(", vocsFactors=").append(vocsFactors);
        sb.append(", pm10Emission=").append(pm10Emission);
        sb.append(", pm25Emission=").append(pm25Emission);
        sb.append(", ocEmission=").append(ocEmission);
        sb.append(", ecEmission=").append(ecEmission);
        sb.append(", so2Emission=").append(so2Emission);
        sb.append(", noxEmission=").append(noxEmission);
        sb.append(", coEmission=").append(coEmission);
        sb.append(", nh3Emission=").append(nh3Emission);
        sb.append(", vocsEmission=").append(vocsEmission);
        sb.append(", status=").append(status);
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
        FNoOrganizationWorkshopDischargeTemp other = (FNoOrganizationWorkshopDischargeTemp) that;
        return (this.getWsid() == null ? other.getWsid() == null : this.getWsid().equals(other.getWsid()))
            && (this.getWorkshopid() == null ? other.getWorkshopid() == null : this.getWorkshopid().equals(other.getWorkshopid()))
            && (this.getScccode() == null ? other.getScccode() == null : this.getScccode().equals(other.getScccode()))
            && (this.getFactoryid() == null ? other.getFactoryid() == null : this.getFactoryid().equals(other.getFactoryid()))
            && (this.getLongitude() == null ? other.getLongitude() == null : this.getLongitude().equals(other.getLongitude()))
            && (this.getLatitude() == null ? other.getLatitude() == null : this.getLatitude().equals(other.getLatitude()))
            && (this.getProductionUse() == null ? other.getProductionUse() == null : this.getProductionUse().equals(other.getProductionUse()))
            && (this.getWorkshopArea() == null ? other.getWorkshopArea() == null : this.getWorkshopArea().equals(other.getWorkshopArea()))
            && (this.getPm10Factors() == null ? other.getPm10Factors() == null : this.getPm10Factors().equals(other.getPm10Factors()))
            && (this.getPm25Factors() == null ? other.getPm25Factors() == null : this.getPm25Factors().equals(other.getPm25Factors()))
            && (this.getOcFactors() == null ? other.getOcFactors() == null : this.getOcFactors().equals(other.getOcFactors()))
            && (this.getEcFactors() == null ? other.getEcFactors() == null : this.getEcFactors().equals(other.getEcFactors()))
            && (this.getSo2Factors() == null ? other.getSo2Factors() == null : this.getSo2Factors().equals(other.getSo2Factors()))
            && (this.getNoxFactors() == null ? other.getNoxFactors() == null : this.getNoxFactors().equals(other.getNoxFactors()))
            && (this.getCoFactors() == null ? other.getCoFactors() == null : this.getCoFactors().equals(other.getCoFactors()))
            && (this.getNh3Factors() == null ? other.getNh3Factors() == null : this.getNh3Factors().equals(other.getNh3Factors()))
            && (this.getVocsFactors() == null ? other.getVocsFactors() == null : this.getVocsFactors().equals(other.getVocsFactors()))
            && (this.getPm10Emission() == null ? other.getPm10Emission() == null : this.getPm10Emission().equals(other.getPm10Emission()))
            && (this.getPm25Emission() == null ? other.getPm25Emission() == null : this.getPm25Emission().equals(other.getPm25Emission()))
            && (this.getOcEmission() == null ? other.getOcEmission() == null : this.getOcEmission().equals(other.getOcEmission()))
            && (this.getEcEmission() == null ? other.getEcEmission() == null : this.getEcEmission().equals(other.getEcEmission()))
            && (this.getSo2Emission() == null ? other.getSo2Emission() == null : this.getSo2Emission().equals(other.getSo2Emission()))
            && (this.getNoxEmission() == null ? other.getNoxEmission() == null : this.getNoxEmission().equals(other.getNoxEmission()))
            && (this.getCoEmission() == null ? other.getCoEmission() == null : this.getCoEmission().equals(other.getCoEmission()))
            && (this.getNh3Emission() == null ? other.getNh3Emission() == null : this.getNh3Emission().equals(other.getNh3Emission()))
            && (this.getVocsEmission() == null ? other.getVocsEmission() == null : this.getVocsEmission().equals(other.getVocsEmission()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWsid() == null) ? 0 : getWsid().hashCode());
        result = prime * result + ((getWorkshopid() == null) ? 0 : getWorkshopid().hashCode());
        result = prime * result + ((getScccode() == null) ? 0 : getScccode().hashCode());
        result = prime * result + ((getFactoryid() == null) ? 0 : getFactoryid().hashCode());
        result = prime * result + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        result = prime * result + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        result = prime * result + ((getProductionUse() == null) ? 0 : getProductionUse().hashCode());
        result = prime * result + ((getWorkshopArea() == null) ? 0 : getWorkshopArea().hashCode());
        result = prime * result + ((getPm10Factors() == null) ? 0 : getPm10Factors().hashCode());
        result = prime * result + ((getPm25Factors() == null) ? 0 : getPm25Factors().hashCode());
        result = prime * result + ((getOcFactors() == null) ? 0 : getOcFactors().hashCode());
        result = prime * result + ((getEcFactors() == null) ? 0 : getEcFactors().hashCode());
        result = prime * result + ((getSo2Factors() == null) ? 0 : getSo2Factors().hashCode());
        result = prime * result + ((getNoxFactors() == null) ? 0 : getNoxFactors().hashCode());
        result = prime * result + ((getCoFactors() == null) ? 0 : getCoFactors().hashCode());
        result = prime * result + ((getNh3Factors() == null) ? 0 : getNh3Factors().hashCode());
        result = prime * result + ((getVocsFactors() == null) ? 0 : getVocsFactors().hashCode());
        result = prime * result + ((getPm10Emission() == null) ? 0 : getPm10Emission().hashCode());
        result = prime * result + ((getPm25Emission() == null) ? 0 : getPm25Emission().hashCode());
        result = prime * result + ((getOcEmission() == null) ? 0 : getOcEmission().hashCode());
        result = prime * result + ((getEcEmission() == null) ? 0 : getEcEmission().hashCode());
        result = prime * result + ((getSo2Emission() == null) ? 0 : getSo2Emission().hashCode());
        result = prime * result + ((getNoxEmission() == null) ? 0 : getNoxEmission().hashCode());
        result = prime * result + ((getCoEmission() == null) ? 0 : getCoEmission().hashCode());
        result = prime * result + ((getNh3Emission() == null) ? 0 : getNh3Emission().hashCode());
        result = prime * result + ((getVocsEmission() == null) ? 0 : getVocsEmission().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}