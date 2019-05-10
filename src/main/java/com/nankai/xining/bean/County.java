package com.nankai.xining.bean;

import java.io.Serializable;

public class County implements Serializable {
    private String countyId;

    private String proviceCode;

    private String cityCode;

    private String countyName;

    private Integer totalgrids;

    private Double xmax;

    private Double xmin;

    private Double ymax;

    private Double ymin;

    private static final long serialVersionUID = 1L;

    public String getCountyId() {
        return countyId;
    }

    public void setCountyId(String countyId) {
        this.countyId = countyId == null ? null : countyId.trim();
    }

    public String getProviceCode() {
        return proviceCode;
    }

    public void setProviceCode(String proviceCode) {
        this.proviceCode = proviceCode == null ? null : proviceCode.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName == null ? null : countyName.trim();
    }

    public Integer getTotalgrids() {
        return totalgrids;
    }

    public void setTotalgrids(Integer totalgrids) {
        this.totalgrids = totalgrids;
    }

    public Double getXmax() {
        return xmax;
    }

    public void setXmax(Double xmax) {
        this.xmax = xmax;
    }

    public Double getXmin() {
        return xmin;
    }

    public void setXmin(Double xmin) {
        this.xmin = xmin;
    }

    public Double getYmax() {
        return ymax;
    }

    public void setYmax(Double ymax) {
        this.ymax = ymax;
    }

    public Double getYmin() {
        return ymin;
    }

    public void setYmin(Double ymin) {
        this.ymin = ymin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", countyId=").append(countyId);
        sb.append(", proviceCode=").append(proviceCode);
        sb.append(", cityCode=").append(cityCode);
        sb.append(", countyName=").append(countyName);
        sb.append(", totalgrids=").append(totalgrids);
        sb.append(", xmax=").append(xmax);
        sb.append(", xmin=").append(xmin);
        sb.append(", ymax=").append(ymax);
        sb.append(", ymin=").append(ymin);
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
        County other = (County) that;
        return (this.getCountyId() == null ? other.getCountyId() == null : this.getCountyId().equals(other.getCountyId()))
            && (this.getProviceCode() == null ? other.getProviceCode() == null : this.getProviceCode().equals(other.getProviceCode()))
            && (this.getCityCode() == null ? other.getCityCode() == null : this.getCityCode().equals(other.getCityCode()))
            && (this.getCountyName() == null ? other.getCountyName() == null : this.getCountyName().equals(other.getCountyName()))
            && (this.getTotalgrids() == null ? other.getTotalgrids() == null : this.getTotalgrids().equals(other.getTotalgrids()))
            && (this.getXmax() == null ? other.getXmax() == null : this.getXmax().equals(other.getXmax()))
            && (this.getXmin() == null ? other.getXmin() == null : this.getXmin().equals(other.getXmin()))
            && (this.getYmax() == null ? other.getYmax() == null : this.getYmax().equals(other.getYmax()))
            && (this.getYmin() == null ? other.getYmin() == null : this.getYmin().equals(other.getYmin()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCountyId() == null) ? 0 : getCountyId().hashCode());
        result = prime * result + ((getProviceCode() == null) ? 0 : getProviceCode().hashCode());
        result = prime * result + ((getCityCode() == null) ? 0 : getCityCode().hashCode());
        result = prime * result + ((getCountyName() == null) ? 0 : getCountyName().hashCode());
        result = prime * result + ((getTotalgrids() == null) ? 0 : getTotalgrids().hashCode());
        result = prime * result + ((getXmax() == null) ? 0 : getXmax().hashCode());
        result = prime * result + ((getXmin() == null) ? 0 : getXmin().hashCode());
        result = prime * result + ((getYmax() == null) ? 0 : getYmax().hashCode());
        result = prime * result + ((getYmin() == null) ? 0 : getYmin().hashCode());
        return result;
    }
}