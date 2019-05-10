package com.nankai.xining.bean;

import java.io.Serializable;

public class Factor implements Serializable {
    private Integer factorid;

    private Boolean ispave;

    private String cyDusttype;

    private Double pm25factor;

    private Double pm10factor;

    private Byte dusttype;

    private static final long serialVersionUID = 1L;

    public Integer getFactorid() {
        return factorid;
    }

    public void setFactorid(Integer factorid) {
        this.factorid = factorid;
    }

    public Boolean getIspave() {
        return ispave;
    }

    public void setIspave(Boolean ispave) {
        this.ispave = ispave;
    }

    public String getCyDusttype() {
        return cyDusttype;
    }

    public void setCyDusttype(String cyDusttype) {
        this.cyDusttype = cyDusttype == null ? null : cyDusttype.trim();
    }

    public Double getPm25factor() {
        return pm25factor;
    }

    public void setPm25factor(Double pm25factor) {
        this.pm25factor = pm25factor;
    }

    public Double getPm10factor() {
        return pm10factor;
    }

    public void setPm10factor(Double pm10factor) {
        this.pm10factor = pm10factor;
    }

    public Byte getDusttype() {
        return dusttype;
    }

    public void setDusttype(Byte dusttype) {
        this.dusttype = dusttype;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", factorid=").append(factorid);
        sb.append(", ispave=").append(ispave);
        sb.append(", cyDusttype=").append(cyDusttype);
        sb.append(", pm25factor=").append(pm25factor);
        sb.append(", pm10factor=").append(pm10factor);
        sb.append(", dusttype=").append(dusttype);
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
        Factor other = (Factor) that;
        return (this.getFactorid() == null ? other.getFactorid() == null : this.getFactorid().equals(other.getFactorid()))
            && (this.getIspave() == null ? other.getIspave() == null : this.getIspave().equals(other.getIspave()))
            && (this.getCyDusttype() == null ? other.getCyDusttype() == null : this.getCyDusttype().equals(other.getCyDusttype()))
            && (this.getPm25factor() == null ? other.getPm25factor() == null : this.getPm25factor().equals(other.getPm25factor()))
            && (this.getPm10factor() == null ? other.getPm10factor() == null : this.getPm10factor().equals(other.getPm10factor()))
            && (this.getDusttype() == null ? other.getDusttype() == null : this.getDusttype().equals(other.getDusttype()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFactorid() == null) ? 0 : getFactorid().hashCode());
        result = prime * result + ((getIspave() == null) ? 0 : getIspave().hashCode());
        result = prime * result + ((getCyDusttype() == null) ? 0 : getCyDusttype().hashCode());
        result = prime * result + ((getPm25factor() == null) ? 0 : getPm25factor().hashCode());
        result = prime * result + ((getPm10factor() == null) ? 0 : getPm10factor().hashCode());
        result = prime * result + ((getDusttype() == null) ? 0 : getDusttype().hashCode());
        return result;
    }
}