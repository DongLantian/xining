package com.nankai.xining.bean;

import java.io.Serializable;

public class Xjyearweather implements Serializable {
    private Integer ywId;

    private String countyId;

    private String year;

    private Double yRainfall;

    private Double yTemp;

    private Double yPoration;

    private Double yWindrate;

    private Integer rainfallThreshold;

    private static final long serialVersionUID = 1L;

    public Integer getYwId() {
        return ywId;
    }

    public void setYwId(Integer ywId) {
        this.ywId = ywId;
    }

    public String getCountyId() {
        return countyId;
    }

    public void setCountyId(String countyId) {
        this.countyId = countyId == null ? null : countyId.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public Double getyRainfall() {
        return yRainfall;
    }

    public void setyRainfall(Double yRainfall) {
        this.yRainfall = yRainfall;
    }

    public Double getyTemp() {
        return yTemp;
    }

    public void setyTemp(Double yTemp) {
        this.yTemp = yTemp;
    }

    public Double getyPoration() {
        return yPoration;
    }

    public void setyPoration(Double yPoration) {
        this.yPoration = yPoration;
    }

    public Double getyWindrate() {
        return yWindrate;
    }

    public void setyWindrate(Double yWindrate) {
        this.yWindrate = yWindrate;
    }

    public Integer getRainfallThreshold() {
        return rainfallThreshold;
    }

    public void setRainfallThreshold(Integer rainfallThreshold) {
        this.rainfallThreshold = rainfallThreshold;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ywId=").append(ywId);
        sb.append(", countyId=").append(countyId);
        sb.append(", year=").append(year);
        sb.append(", yRainfall=").append(yRainfall);
        sb.append(", yTemp=").append(yTemp);
        sb.append(", yPoration=").append(yPoration);
        sb.append(", yWindrate=").append(yWindrate);
        sb.append(", rainfallThreshold=").append(rainfallThreshold);
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
        Xjyearweather other = (Xjyearweather) that;
        return (this.getYwId() == null ? other.getYwId() == null : this.getYwId().equals(other.getYwId()))
            && (this.getCountyId() == null ? other.getCountyId() == null : this.getCountyId().equals(other.getCountyId()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getyRainfall() == null ? other.getyRainfall() == null : this.getyRainfall().equals(other.getyRainfall()))
            && (this.getyTemp() == null ? other.getyTemp() == null : this.getyTemp().equals(other.getyTemp()))
            && (this.getyPoration() == null ? other.getyPoration() == null : this.getyPoration().equals(other.getyPoration()))
            && (this.getyWindrate() == null ? other.getyWindrate() == null : this.getyWindrate().equals(other.getyWindrate()))
            && (this.getRainfallThreshold() == null ? other.getRainfallThreshold() == null : this.getRainfallThreshold().equals(other.getRainfallThreshold()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getYwId() == null) ? 0 : getYwId().hashCode());
        result = prime * result + ((getCountyId() == null) ? 0 : getCountyId().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getyRainfall() == null) ? 0 : getyRainfall().hashCode());
        result = prime * result + ((getyTemp() == null) ? 0 : getyTemp().hashCode());
        result = prime * result + ((getyPoration() == null) ? 0 : getyPoration().hashCode());
        result = prime * result + ((getyWindrate() == null) ? 0 : getyWindrate().hashCode());
        result = prime * result + ((getRainfallThreshold() == null) ? 0 : getRainfallThreshold().hashCode());
        return result;
    }
}