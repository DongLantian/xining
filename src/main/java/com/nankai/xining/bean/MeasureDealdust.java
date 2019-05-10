package com.nankai.xining.bean;

import java.io.Serializable;

public class MeasureDealdust implements Serializable {
    private Integer dealdustid;

    private String dealtype;

    private Double pm;

    private Double pm10;

    private Double pm25;

    private static final long serialVersionUID = 1L;

    public Integer getDealdustid() {
        return dealdustid;
    }

    public void setDealdustid(Integer dealdustid) {
        this.dealdustid = dealdustid;
    }

    public String getDealtype() {
        return dealtype;
    }

    public void setDealtype(String dealtype) {
        this.dealtype = dealtype == null ? null : dealtype.trim();
    }

    public Double getPm() {
        return pm;
    }

    public void setPm(Double pm) {
        this.pm = pm;
    }

    public Double getPm10() {
        return pm10;
    }

    public void setPm10(Double pm10) {
        this.pm10 = pm10;
    }

    public Double getPm25() {
        return pm25;
    }

    public void setPm25(Double pm25) {
        this.pm25 = pm25;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dealdustid=").append(dealdustid);
        sb.append(", dealtype=").append(dealtype);
        sb.append(", pm=").append(pm);
        sb.append(", pm10=").append(pm10);
        sb.append(", pm25=").append(pm25);
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
        MeasureDealdust other = (MeasureDealdust) that;
        return (this.getDealdustid() == null ? other.getDealdustid() == null : this.getDealdustid().equals(other.getDealdustid()))
            && (this.getDealtype() == null ? other.getDealtype() == null : this.getDealtype().equals(other.getDealtype()))
            && (this.getPm() == null ? other.getPm() == null : this.getPm().equals(other.getPm()))
            && (this.getPm10() == null ? other.getPm10() == null : this.getPm10().equals(other.getPm10()))
            && (this.getPm25() == null ? other.getPm25() == null : this.getPm25().equals(other.getPm25()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDealdustid() == null) ? 0 : getDealdustid().hashCode());
        result = prime * result + ((getDealtype() == null) ? 0 : getDealtype().hashCode());
        result = prime * result + ((getPm() == null) ? 0 : getPm().hashCode());
        result = prime * result + ((getPm10() == null) ? 0 : getPm10().hashCode());
        result = prime * result + ((getPm25() == null) ? 0 : getPm25().hashCode());
        return result;
    }
}