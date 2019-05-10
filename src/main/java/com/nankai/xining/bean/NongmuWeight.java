package com.nankai.xining.bean;

import java.io.Serializable;

public class NongmuWeight implements Serializable {
    private Integer fishnetId;

    private Double nongtianWeight;

    private String nongtianCounty;

    private Double freestockWeight;

    private String freestockCounty;

    private Integer year;

    private static final long serialVersionUID = 1L;

    public Integer getFishnetId() {
        return fishnetId;
    }

    public void setFishnetId(Integer fishnetId) {
        this.fishnetId = fishnetId;
    }

    public Double getNongtianWeight() {
        return nongtianWeight;
    }

    public void setNongtianWeight(Double nongtianWeight) {
        this.nongtianWeight = nongtianWeight;
    }

    public String getNongtianCounty() {
        return nongtianCounty;
    }

    public void setNongtianCounty(String nongtianCounty) {
        this.nongtianCounty = nongtianCounty == null ? null : nongtianCounty.trim();
    }

    public Double getFreestockWeight() {
        return freestockWeight;
    }

    public void setFreestockWeight(Double freestockWeight) {
        this.freestockWeight = freestockWeight;
    }

    public String getFreestockCounty() {
        return freestockCounty;
    }

    public void setFreestockCounty(String freestockCounty) {
        this.freestockCounty = freestockCounty == null ? null : freestockCounty.trim();
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fishnetId=").append(fishnetId);
        sb.append(", nongtianWeight=").append(nongtianWeight);
        sb.append(", nongtianCounty=").append(nongtianCounty);
        sb.append(", freestockWeight=").append(freestockWeight);
        sb.append(", freestockCounty=").append(freestockCounty);
        sb.append(", year=").append(year);
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
        NongmuWeight other = (NongmuWeight) that;
        return (this.getFishnetId() == null ? other.getFishnetId() == null : this.getFishnetId().equals(other.getFishnetId()))
            && (this.getNongtianWeight() == null ? other.getNongtianWeight() == null : this.getNongtianWeight().equals(other.getNongtianWeight()))
            && (this.getNongtianCounty() == null ? other.getNongtianCounty() == null : this.getNongtianCounty().equals(other.getNongtianCounty()))
            && (this.getFreestockWeight() == null ? other.getFreestockWeight() == null : this.getFreestockWeight().equals(other.getFreestockWeight()))
            && (this.getFreestockCounty() == null ? other.getFreestockCounty() == null : this.getFreestockCounty().equals(other.getFreestockCounty()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFishnetId() == null) ? 0 : getFishnetId().hashCode());
        result = prime * result + ((getNongtianWeight() == null) ? 0 : getNongtianWeight().hashCode());
        result = prime * result + ((getNongtianCounty() == null) ? 0 : getNongtianCounty().hashCode());
        result = prime * result + ((getFreestockWeight() == null) ? 0 : getFreestockWeight().hashCode());
        result = prime * result + ((getFreestockCounty() == null) ? 0 : getFreestockCounty().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        return result;
    }
}