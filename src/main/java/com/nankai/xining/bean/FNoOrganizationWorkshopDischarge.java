package com.nankai.xining.bean;

import java.io.Serializable;

public class FNoOrganizationWorkshopDischarge implements Serializable {
    private Integer wsid;

    private Integer workshopid;

    private Integer factoryid;

    private String scccode;

    private Double longitude;

    private Double latitude;

    private String productionUse;

    private Double workshopArea;

    private Double pm10Emission;

    private Double ocEmission;

    private Double pm25Emission;

    private Double ecEmission;

    private Double so2Emission;

    private Double noxEmission;

    private Double coEmission;

    private Double nh3Emission;

    private Double vocsEmission;

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

    public Integer getFactoryid() {
        return factoryid;
    }

    public void setFactoryid(Integer factoryid) {
        this.factoryid = factoryid;
    }

    public String getScccode() {
        return scccode;
    }

    public void setScccode(String scccode) {
        this.scccode = scccode == null ? null : scccode.trim();
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

    public Double getPm25Emission() {
        return pm25Emission;
    }

    public void setPm25Emission(Double pm25Emission) {
        this.pm25Emission = pm25Emission;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wsid=").append(wsid);
        sb.append(", workshopid=").append(workshopid);
        sb.append(", factoryid=").append(factoryid);
        sb.append(", scccode=").append(scccode);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", productionUse=").append(productionUse);
        sb.append(", workshopArea=").append(workshopArea);
        sb.append(", pm10Emission=").append(pm10Emission);
        sb.append(", ocEmission=").append(ocEmission);
        sb.append(", pm25Emission=").append(pm25Emission);
        sb.append(", ecEmission=").append(ecEmission);
        sb.append(", so2Emission=").append(so2Emission);
        sb.append(", noxEmission=").append(noxEmission);
        sb.append(", coEmission=").append(coEmission);
        sb.append(", nh3Emission=").append(nh3Emission);
        sb.append(", vocsEmission=").append(vocsEmission);
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
        FNoOrganizationWorkshopDischarge other = (FNoOrganizationWorkshopDischarge) that;
        return (this.getWsid() == null ? other.getWsid() == null : this.getWsid().equals(other.getWsid()))
            && (this.getWorkshopid() == null ? other.getWorkshopid() == null : this.getWorkshopid().equals(other.getWorkshopid()))
            && (this.getFactoryid() == null ? other.getFactoryid() == null : this.getFactoryid().equals(other.getFactoryid()))
            && (this.getScccode() == null ? other.getScccode() == null : this.getScccode().equals(other.getScccode()))
            && (this.getLongitude() == null ? other.getLongitude() == null : this.getLongitude().equals(other.getLongitude()))
            && (this.getLatitude() == null ? other.getLatitude() == null : this.getLatitude().equals(other.getLatitude()))
            && (this.getProductionUse() == null ? other.getProductionUse() == null : this.getProductionUse().equals(other.getProductionUse()))
            && (this.getWorkshopArea() == null ? other.getWorkshopArea() == null : this.getWorkshopArea().equals(other.getWorkshopArea()))
            && (this.getPm10Emission() == null ? other.getPm10Emission() == null : this.getPm10Emission().equals(other.getPm10Emission()))
            && (this.getOcEmission() == null ? other.getOcEmission() == null : this.getOcEmission().equals(other.getOcEmission()))
            && (this.getPm25Emission() == null ? other.getPm25Emission() == null : this.getPm25Emission().equals(other.getPm25Emission()))
            && (this.getEcEmission() == null ? other.getEcEmission() == null : this.getEcEmission().equals(other.getEcEmission()))
            && (this.getSo2Emission() == null ? other.getSo2Emission() == null : this.getSo2Emission().equals(other.getSo2Emission()))
            && (this.getNoxEmission() == null ? other.getNoxEmission() == null : this.getNoxEmission().equals(other.getNoxEmission()))
            && (this.getCoEmission() == null ? other.getCoEmission() == null : this.getCoEmission().equals(other.getCoEmission()))
            && (this.getNh3Emission() == null ? other.getNh3Emission() == null : this.getNh3Emission().equals(other.getNh3Emission()))
            && (this.getVocsEmission() == null ? other.getVocsEmission() == null : this.getVocsEmission().equals(other.getVocsEmission()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWsid() == null) ? 0 : getWsid().hashCode());
        result = prime * result + ((getWorkshopid() == null) ? 0 : getWorkshopid().hashCode());
        result = prime * result + ((getFactoryid() == null) ? 0 : getFactoryid().hashCode());
        result = prime * result + ((getScccode() == null) ? 0 : getScccode().hashCode());
        result = prime * result + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        result = prime * result + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        result = prime * result + ((getProductionUse() == null) ? 0 : getProductionUse().hashCode());
        result = prime * result + ((getWorkshopArea() == null) ? 0 : getWorkshopArea().hashCode());
        result = prime * result + ((getPm10Emission() == null) ? 0 : getPm10Emission().hashCode());
        result = prime * result + ((getOcEmission() == null) ? 0 : getOcEmission().hashCode());
        result = prime * result + ((getPm25Emission() == null) ? 0 : getPm25Emission().hashCode());
        result = prime * result + ((getEcEmission() == null) ? 0 : getEcEmission().hashCode());
        result = prime * result + ((getSo2Emission() == null) ? 0 : getSo2Emission().hashCode());
        result = prime * result + ((getNoxEmission() == null) ? 0 : getNoxEmission().hashCode());
        result = prime * result + ((getCoEmission() == null) ? 0 : getCoEmission().hashCode());
        result = prime * result + ((getNh3Emission() == null) ? 0 : getNh3Emission().hashCode());
        result = prime * result + ((getVocsEmission() == null) ? 0 : getVocsEmission().hashCode());
        return result;
    }
}