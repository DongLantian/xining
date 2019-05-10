package com.nankai.xining.bean;

import java.io.Serializable;

public class CarEmission implements Serializable {
    private Integer id;

    private String year;

    private String cartype;

    private Double so2;

    private Double nox;

    private Double co;

    private Double hc;

    private Double pm25;

    private Double pm10;

    private Double bc;

    private Double oc;

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

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype == null ? null : cartype.trim();
    }

    public Double getSo2() {
        return so2;
    }

    public void setSo2(Double so2) {
        this.so2 = so2;
    }

    public Double getNox() {
        return nox;
    }

    public void setNox(Double nox) {
        this.nox = nox;
    }

    public Double getCo() {
        return co;
    }

    public void setCo(Double co) {
        this.co = co;
    }

    public Double getHc() {
        return hc;
    }

    public void setHc(Double hc) {
        this.hc = hc;
    }

    public Double getPm25() {
        return pm25;
    }

    public void setPm25(Double pm25) {
        this.pm25 = pm25;
    }

    public Double getPm10() {
        return pm10;
    }

    public void setPm10(Double pm10) {
        this.pm10 = pm10;
    }

    public Double getBc() {
        return bc;
    }

    public void setBc(Double bc) {
        this.bc = bc;
    }

    public Double getOc() {
        return oc;
    }

    public void setOc(Double oc) {
        this.oc = oc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", year=").append(year);
        sb.append(", cartype=").append(cartype);
        sb.append(", so2=").append(so2);
        sb.append(", nox=").append(nox);
        sb.append(", co=").append(co);
        sb.append(", hc=").append(hc);
        sb.append(", pm25=").append(pm25);
        sb.append(", pm10=").append(pm10);
        sb.append(", bc=").append(bc);
        sb.append(", oc=").append(oc);
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
        CarEmission other = (CarEmission) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getCartype() == null ? other.getCartype() == null : this.getCartype().equals(other.getCartype()))
            && (this.getSo2() == null ? other.getSo2() == null : this.getSo2().equals(other.getSo2()))
            && (this.getNox() == null ? other.getNox() == null : this.getNox().equals(other.getNox()))
            && (this.getCo() == null ? other.getCo() == null : this.getCo().equals(other.getCo()))
            && (this.getHc() == null ? other.getHc() == null : this.getHc().equals(other.getHc()))
            && (this.getPm25() == null ? other.getPm25() == null : this.getPm25().equals(other.getPm25()))
            && (this.getPm10() == null ? other.getPm10() == null : this.getPm10().equals(other.getPm10()))
            && (this.getBc() == null ? other.getBc() == null : this.getBc().equals(other.getBc()))
            && (this.getOc() == null ? other.getOc() == null : this.getOc().equals(other.getOc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getCartype() == null) ? 0 : getCartype().hashCode());
        result = prime * result + ((getSo2() == null) ? 0 : getSo2().hashCode());
        result = prime * result + ((getNox() == null) ? 0 : getNox().hashCode());
        result = prime * result + ((getCo() == null) ? 0 : getCo().hashCode());
        result = prime * result + ((getHc() == null) ? 0 : getHc().hashCode());
        result = prime * result + ((getPm25() == null) ? 0 : getPm25().hashCode());
        result = prime * result + ((getPm10() == null) ? 0 : getPm10().hashCode());
        result = prime * result + ((getBc() == null) ? 0 : getBc().hashCode());
        result = prime * result + ((getOc() == null) ? 0 : getOc().hashCode());
        return result;
    }
}