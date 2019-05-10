package com.nankai.xining.bean;

import java.io.Serializable;

public class AgricultureMachinery implements Serializable {
    private Integer id;

    private String year;

    private String countyId;

    private String sccCode;

    private String sourceDescrip;

    private String fuelType;

    private Integer holdings;

    private Double fuelUsage;

    private Double fuelAnnualUsage;

    private Double annalAverageMilage;

    private Double fuelSulfurContent;

    private Double pm10Emission;

    private Double pm25Emission;

    private Double vocsEmission;

    private Double coEmission;

    private Double noxEmission;

    private Double so2Emission;

    private Double bcEmission;

    private Double ocEmission;

    private Double nh3Emission;

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

    public String getCountyId() {
        return countyId;
    }

    public void setCountyId(String countyId) {
        this.countyId = countyId == null ? null : countyId.trim();
    }

    public String getSccCode() {
        return sccCode;
    }

    public void setSccCode(String sccCode) {
        this.sccCode = sccCode == null ? null : sccCode.trim();
    }

    public String getSourceDescrip() {
        return sourceDescrip;
    }

    public void setSourceDescrip(String sourceDescrip) {
        this.sourceDescrip = sourceDescrip == null ? null : sourceDescrip.trim();
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType == null ? null : fuelType.trim();
    }

    public Integer getHoldings() {
        return holdings;
    }

    public void setHoldings(Integer holdings) {
        this.holdings = holdings;
    }

    public Double getFuelUsage() {
        return fuelUsage;
    }

    public void setFuelUsage(Double fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    public Double getFuelAnnualUsage() {
        return fuelAnnualUsage;
    }

    public void setFuelAnnualUsage(Double fuelAnnualUsage) {
        this.fuelAnnualUsage = fuelAnnualUsage;
    }

    public Double getAnnalAverageMilage() {
        return annalAverageMilage;
    }

    public void setAnnalAverageMilage(Double annalAverageMilage) {
        this.annalAverageMilage = annalAverageMilage;
    }

    public Double getFuelSulfurContent() {
        return fuelSulfurContent;
    }

    public void setFuelSulfurContent(Double fuelSulfurContent) {
        this.fuelSulfurContent = fuelSulfurContent;
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

    public Double getVocsEmission() {
        return vocsEmission;
    }

    public void setVocsEmission(Double vocsEmission) {
        this.vocsEmission = vocsEmission;
    }

    public Double getCoEmission() {
        return coEmission;
    }

    public void setCoEmission(Double coEmission) {
        this.coEmission = coEmission;
    }

    public Double getNoxEmission() {
        return noxEmission;
    }

    public void setNoxEmission(Double noxEmission) {
        this.noxEmission = noxEmission;
    }

    public Double getSo2Emission() {
        return so2Emission;
    }

    public void setSo2Emission(Double so2Emission) {
        this.so2Emission = so2Emission;
    }

    public Double getBcEmission() {
        return bcEmission;
    }

    public void setBcEmission(Double bcEmission) {
        this.bcEmission = bcEmission;
    }

    public Double getOcEmission() {
        return ocEmission;
    }

    public void setOcEmission(Double ocEmission) {
        this.ocEmission = ocEmission;
    }

    public Double getNh3Emission() {
        return nh3Emission;
    }

    public void setNh3Emission(Double nh3Emission) {
        this.nh3Emission = nh3Emission;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", year=").append(year);
        sb.append(", countyId=").append(countyId);
        sb.append(", sccCode=").append(sccCode);
        sb.append(", sourceDescrip=").append(sourceDescrip);
        sb.append(", fuelType=").append(fuelType);
        sb.append(", holdings=").append(holdings);
        sb.append(", fuelUsage=").append(fuelUsage);
        sb.append(", fuelAnnualUsage=").append(fuelAnnualUsage);
        sb.append(", annalAverageMilage=").append(annalAverageMilage);
        sb.append(", fuelSulfurContent=").append(fuelSulfurContent);
        sb.append(", pm10Emission=").append(pm10Emission);
        sb.append(", pm25Emission=").append(pm25Emission);
        sb.append(", vocsEmission=").append(vocsEmission);
        sb.append(", coEmission=").append(coEmission);
        sb.append(", noxEmission=").append(noxEmission);
        sb.append(", so2Emission=").append(so2Emission);
        sb.append(", bcEmission=").append(bcEmission);
        sb.append(", ocEmission=").append(ocEmission);
        sb.append(", nh3Emission=").append(nh3Emission);
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
        AgricultureMachinery other = (AgricultureMachinery) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getCountyId() == null ? other.getCountyId() == null : this.getCountyId().equals(other.getCountyId()))
            && (this.getSccCode() == null ? other.getSccCode() == null : this.getSccCode().equals(other.getSccCode()))
            && (this.getSourceDescrip() == null ? other.getSourceDescrip() == null : this.getSourceDescrip().equals(other.getSourceDescrip()))
            && (this.getFuelType() == null ? other.getFuelType() == null : this.getFuelType().equals(other.getFuelType()))
            && (this.getHoldings() == null ? other.getHoldings() == null : this.getHoldings().equals(other.getHoldings()))
            && (this.getFuelUsage() == null ? other.getFuelUsage() == null : this.getFuelUsage().equals(other.getFuelUsage()))
            && (this.getFuelAnnualUsage() == null ? other.getFuelAnnualUsage() == null : this.getFuelAnnualUsage().equals(other.getFuelAnnualUsage()))
            && (this.getAnnalAverageMilage() == null ? other.getAnnalAverageMilage() == null : this.getAnnalAverageMilage().equals(other.getAnnalAverageMilage()))
            && (this.getFuelSulfurContent() == null ? other.getFuelSulfurContent() == null : this.getFuelSulfurContent().equals(other.getFuelSulfurContent()))
            && (this.getPm10Emission() == null ? other.getPm10Emission() == null : this.getPm10Emission().equals(other.getPm10Emission()))
            && (this.getPm25Emission() == null ? other.getPm25Emission() == null : this.getPm25Emission().equals(other.getPm25Emission()))
            && (this.getVocsEmission() == null ? other.getVocsEmission() == null : this.getVocsEmission().equals(other.getVocsEmission()))
            && (this.getCoEmission() == null ? other.getCoEmission() == null : this.getCoEmission().equals(other.getCoEmission()))
            && (this.getNoxEmission() == null ? other.getNoxEmission() == null : this.getNoxEmission().equals(other.getNoxEmission()))
            && (this.getSo2Emission() == null ? other.getSo2Emission() == null : this.getSo2Emission().equals(other.getSo2Emission()))
            && (this.getBcEmission() == null ? other.getBcEmission() == null : this.getBcEmission().equals(other.getBcEmission()))
            && (this.getOcEmission() == null ? other.getOcEmission() == null : this.getOcEmission().equals(other.getOcEmission()))
            && (this.getNh3Emission() == null ? other.getNh3Emission() == null : this.getNh3Emission().equals(other.getNh3Emission()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getCountyId() == null) ? 0 : getCountyId().hashCode());
        result = prime * result + ((getSccCode() == null) ? 0 : getSccCode().hashCode());
        result = prime * result + ((getSourceDescrip() == null) ? 0 : getSourceDescrip().hashCode());
        result = prime * result + ((getFuelType() == null) ? 0 : getFuelType().hashCode());
        result = prime * result + ((getHoldings() == null) ? 0 : getHoldings().hashCode());
        result = prime * result + ((getFuelUsage() == null) ? 0 : getFuelUsage().hashCode());
        result = prime * result + ((getFuelAnnualUsage() == null) ? 0 : getFuelAnnualUsage().hashCode());
        result = prime * result + ((getAnnalAverageMilage() == null) ? 0 : getAnnalAverageMilage().hashCode());
        result = prime * result + ((getFuelSulfurContent() == null) ? 0 : getFuelSulfurContent().hashCode());
        result = prime * result + ((getPm10Emission() == null) ? 0 : getPm10Emission().hashCode());
        result = prime * result + ((getPm25Emission() == null) ? 0 : getPm25Emission().hashCode());
        result = prime * result + ((getVocsEmission() == null) ? 0 : getVocsEmission().hashCode());
        result = prime * result + ((getCoEmission() == null) ? 0 : getCoEmission().hashCode());
        result = prime * result + ((getNoxEmission() == null) ? 0 : getNoxEmission().hashCode());
        result = prime * result + ((getSo2Emission() == null) ? 0 : getSo2Emission().hashCode());
        result = prime * result + ((getBcEmission() == null) ? 0 : getBcEmission().hashCode());
        result = prime * result + ((getOcEmission() == null) ? 0 : getOcEmission().hashCode());
        result = prime * result + ((getNh3Emission() == null) ? 0 : getNh3Emission().hashCode());
        return result;
    }
}