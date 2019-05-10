package com.nankai.xining.bean;

import java.io.Serializable;

public class Soildrifting implements Serializable {
    private Integer id;

    private String sdSoiltype;

    private String soiltypeSub;

    private Integer tspindex;

    private Integer pm10index;

    private Integer pm25index;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSdSoiltype() {
        return sdSoiltype;
    }

    public void setSdSoiltype(String sdSoiltype) {
        this.sdSoiltype = sdSoiltype == null ? null : sdSoiltype.trim();
    }

    public String getSoiltypeSub() {
        return soiltypeSub;
    }

    public void setSoiltypeSub(String soiltypeSub) {
        this.soiltypeSub = soiltypeSub == null ? null : soiltypeSub.trim();
    }

    public Integer getTspindex() {
        return tspindex;
    }

    public void setTspindex(Integer tspindex) {
        this.tspindex = tspindex;
    }

    public Integer getPm10index() {
        return pm10index;
    }

    public void setPm10index(Integer pm10index) {
        this.pm10index = pm10index;
    }

    public Integer getPm25index() {
        return pm25index;
    }

    public void setPm25index(Integer pm25index) {
        this.pm25index = pm25index;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sdSoiltype=").append(sdSoiltype);
        sb.append(", soiltypeSub=").append(soiltypeSub);
        sb.append(", tspindex=").append(tspindex);
        sb.append(", pm10index=").append(pm10index);
        sb.append(", pm25index=").append(pm25index);
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
        Soildrifting other = (Soildrifting) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSdSoiltype() == null ? other.getSdSoiltype() == null : this.getSdSoiltype().equals(other.getSdSoiltype()))
            && (this.getSoiltypeSub() == null ? other.getSoiltypeSub() == null : this.getSoiltypeSub().equals(other.getSoiltypeSub()))
            && (this.getTspindex() == null ? other.getTspindex() == null : this.getTspindex().equals(other.getTspindex()))
            && (this.getPm10index() == null ? other.getPm10index() == null : this.getPm10index().equals(other.getPm10index()))
            && (this.getPm25index() == null ? other.getPm25index() == null : this.getPm25index().equals(other.getPm25index()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSdSoiltype() == null) ? 0 : getSdSoiltype().hashCode());
        result = prime * result + ((getSoiltypeSub() == null) ? 0 : getSoiltypeSub().hashCode());
        result = prime * result + ((getTspindex() == null) ? 0 : getTspindex().hashCode());
        result = prime * result + ((getPm10index() == null) ? 0 : getPm10index().hashCode());
        result = prime * result + ((getPm25index() == null) ? 0 : getPm25index().hashCode());
        return result;
    }
}