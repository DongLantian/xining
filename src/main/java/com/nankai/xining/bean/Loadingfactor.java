package com.nankai.xining.bean;

import java.io.Serializable;

public class Loadingfactor implements Serializable {
    private Integer factorid;

    private Integer operaid;

    private Double factor;

    private static final long serialVersionUID = 1L;

    public Integer getFactorid() {
        return factorid;
    }

    public void setFactorid(Integer factorid) {
        this.factorid = factorid;
    }

    public Integer getOperaid() {
        return operaid;
    }

    public void setOperaid(Integer operaid) {
        this.operaid = operaid;
    }

    public Double getFactor() {
        return factor;
    }

    public void setFactor(Double factor) {
        this.factor = factor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", factorid=").append(factorid);
        sb.append(", operaid=").append(operaid);
        sb.append(", factor=").append(factor);
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
        Loadingfactor other = (Loadingfactor) that;
        return (this.getFactorid() == null ? other.getFactorid() == null : this.getFactorid().equals(other.getFactorid()))
            && (this.getOperaid() == null ? other.getOperaid() == null : this.getOperaid().equals(other.getOperaid()))
            && (this.getFactor() == null ? other.getFactor() == null : this.getFactor().equals(other.getFactor()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFactorid() == null) ? 0 : getFactorid().hashCode());
        result = prime * result + ((getOperaid() == null) ? 0 : getOperaid().hashCode());
        result = prime * result + ((getFactor() == null) ? 0 : getFactor().hashCode());
        return result;
    }
}