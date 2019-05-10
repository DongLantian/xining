package com.nankai.xining.bean;

import java.io.Serializable;

public class FBareSoilDustSource implements Serializable {
    private Integer bareSoilid;

    private String scccode;

    private Integer factoryid;

    private Double bareSoilArea;

    private Double pm10Factors;

    private Double pm25Factors;

    private Double pm25Emission;

    private Double pm10Emission;

    private Double ocEmission;

    private Double bcEmission;

    private static final long serialVersionUID = 1L;

    public Integer getBareSoilid() {
        return bareSoilid;
    }

    public void setBareSoilid(Integer bareSoilid) {
        this.bareSoilid = bareSoilid;
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

    public Double getBareSoilArea() {
        return bareSoilArea;
    }

    public void setBareSoilArea(Double bareSoilArea) {
        this.bareSoilArea = bareSoilArea;
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

    public Double getBcEmission() {
        return bcEmission;
    }

    public void setBcEmission(Double bcEmission) {
        this.bcEmission = bcEmission;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bareSoilid=").append(bareSoilid);
        sb.append(", scccode=").append(scccode);
        sb.append(", factoryid=").append(factoryid);
        sb.append(", bareSoilArea=").append(bareSoilArea);
        sb.append(", pm10Factors=").append(pm10Factors);
        sb.append(", pm25Factors=").append(pm25Factors);
        sb.append(", pm25Emission=").append(pm25Emission);
        sb.append(", pm10Emission=").append(pm10Emission);
        sb.append(", ocEmission=").append(ocEmission);
        sb.append(", bcEmission=").append(bcEmission);
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
        FBareSoilDustSource other = (FBareSoilDustSource) that;
        return (this.getBareSoilid() == null ? other.getBareSoilid() == null : this.getBareSoilid().equals(other.getBareSoilid()))
            && (this.getScccode() == null ? other.getScccode() == null : this.getScccode().equals(other.getScccode()))
            && (this.getFactoryid() == null ? other.getFactoryid() == null : this.getFactoryid().equals(other.getFactoryid()))
            && (this.getBareSoilArea() == null ? other.getBareSoilArea() == null : this.getBareSoilArea().equals(other.getBareSoilArea()))
            && (this.getPm10Factors() == null ? other.getPm10Factors() == null : this.getPm10Factors().equals(other.getPm10Factors()))
            && (this.getPm25Factors() == null ? other.getPm25Factors() == null : this.getPm25Factors().equals(other.getPm25Factors()))
            && (this.getPm25Emission() == null ? other.getPm25Emission() == null : this.getPm25Emission().equals(other.getPm25Emission()))
            && (this.getPm10Emission() == null ? other.getPm10Emission() == null : this.getPm10Emission().equals(other.getPm10Emission()))
            && (this.getOcEmission() == null ? other.getOcEmission() == null : this.getOcEmission().equals(other.getOcEmission()))
            && (this.getBcEmission() == null ? other.getBcEmission() == null : this.getBcEmission().equals(other.getBcEmission()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBareSoilid() == null) ? 0 : getBareSoilid().hashCode());
        result = prime * result + ((getScccode() == null) ? 0 : getScccode().hashCode());
        result = prime * result + ((getFactoryid() == null) ? 0 : getFactoryid().hashCode());
        result = prime * result + ((getBareSoilArea() == null) ? 0 : getBareSoilArea().hashCode());
        result = prime * result + ((getPm10Factors() == null) ? 0 : getPm10Factors().hashCode());
        result = prime * result + ((getPm25Factors() == null) ? 0 : getPm25Factors().hashCode());
        result = prime * result + ((getPm25Emission() == null) ? 0 : getPm25Emission().hashCode());
        result = prime * result + ((getPm10Emission() == null) ? 0 : getPm10Emission().hashCode());
        result = prime * result + ((getOcEmission() == null) ? 0 : getOcEmission().hashCode());
        result = prime * result + ((getBcEmission() == null) ? 0 : getBcEmission().hashCode());
        return result;
    }
}