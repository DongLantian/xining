package com.nankai.xining.bean;

import java.io.Serializable;

public class Wygongyiscc20160901 implements Serializable {
    private String tjScc;

    private String epaSccepaScc;

    private String l2name;

    private String l3name;

    private String l4name;

    private Double co;

    private Double nox;

    private Double so2;

    private Double nh3;

    private Double vocs;

    private Double pm25;

    private Double pm10;

    private Double bc;

    private Double oc;

    private String unit;

    private static final long serialVersionUID = 1L;

    public String getTjScc() {
        return tjScc;
    }

    public void setTjScc(String tjScc) {
        this.tjScc = tjScc == null ? null : tjScc.trim();
    }

    public String getEpaSccepaScc() {
        return epaSccepaScc;
    }

    public void setEpaSccepaScc(String epaSccepaScc) {
        this.epaSccepaScc = epaSccepaScc == null ? null : epaSccepaScc.trim();
    }

    public String getL2name() {
        return l2name;
    }

    public void setL2name(String l2name) {
        this.l2name = l2name == null ? null : l2name.trim();
    }

    public String getL3name() {
        return l3name;
    }

    public void setL3name(String l3name) {
        this.l3name = l3name == null ? null : l3name.trim();
    }

    public String getL4name() {
        return l4name;
    }

    public void setL4name(String l4name) {
        this.l4name = l4name == null ? null : l4name.trim();
    }

    public Double getCo() {
        return co;
    }

    public void setCo(Double co) {
        this.co = co;
    }

    public Double getNox() {
        return nox;
    }

    public void setNox(Double nox) {
        this.nox = nox;
    }

    public Double getSo2() {
        return so2;
    }

    public void setSo2(Double so2) {
        this.so2 = so2;
    }

    public Double getNh3() {
        return nh3;
    }

    public void setNh3(Double nh3) {
        this.nh3 = nh3;
    }

    public Double getVocs() {
        return vocs;
    }

    public void setVocs(Double vocs) {
        this.vocs = vocs;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tjScc=").append(tjScc);
        sb.append(", epaSccepaScc=").append(epaSccepaScc);
        sb.append(", l2name=").append(l2name);
        sb.append(", l3name=").append(l3name);
        sb.append(", l4name=").append(l4name);
        sb.append(", co=").append(co);
        sb.append(", nox=").append(nox);
        sb.append(", so2=").append(so2);
        sb.append(", nh3=").append(nh3);
        sb.append(", vocs=").append(vocs);
        sb.append(", pm25=").append(pm25);
        sb.append(", pm10=").append(pm10);
        sb.append(", bc=").append(bc);
        sb.append(", oc=").append(oc);
        sb.append(", unit=").append(unit);
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
        Wygongyiscc20160901 other = (Wygongyiscc20160901) that;
        return (this.getTjScc() == null ? other.getTjScc() == null : this.getTjScc().equals(other.getTjScc()))
            && (this.getEpaSccepaScc() == null ? other.getEpaSccepaScc() == null : this.getEpaSccepaScc().equals(other.getEpaSccepaScc()))
            && (this.getL2name() == null ? other.getL2name() == null : this.getL2name().equals(other.getL2name()))
            && (this.getL3name() == null ? other.getL3name() == null : this.getL3name().equals(other.getL3name()))
            && (this.getL4name() == null ? other.getL4name() == null : this.getL4name().equals(other.getL4name()))
            && (this.getCo() == null ? other.getCo() == null : this.getCo().equals(other.getCo()))
            && (this.getNox() == null ? other.getNox() == null : this.getNox().equals(other.getNox()))
            && (this.getSo2() == null ? other.getSo2() == null : this.getSo2().equals(other.getSo2()))
            && (this.getNh3() == null ? other.getNh3() == null : this.getNh3().equals(other.getNh3()))
            && (this.getVocs() == null ? other.getVocs() == null : this.getVocs().equals(other.getVocs()))
            && (this.getPm25() == null ? other.getPm25() == null : this.getPm25().equals(other.getPm25()))
            && (this.getPm10() == null ? other.getPm10() == null : this.getPm10().equals(other.getPm10()))
            && (this.getBc() == null ? other.getBc() == null : this.getBc().equals(other.getBc()))
            && (this.getOc() == null ? other.getOc() == null : this.getOc().equals(other.getOc()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTjScc() == null) ? 0 : getTjScc().hashCode());
        result = prime * result + ((getEpaSccepaScc() == null) ? 0 : getEpaSccepaScc().hashCode());
        result = prime * result + ((getL2name() == null) ? 0 : getL2name().hashCode());
        result = prime * result + ((getL3name() == null) ? 0 : getL3name().hashCode());
        result = prime * result + ((getL4name() == null) ? 0 : getL4name().hashCode());
        result = prime * result + ((getCo() == null) ? 0 : getCo().hashCode());
        result = prime * result + ((getNox() == null) ? 0 : getNox().hashCode());
        result = prime * result + ((getSo2() == null) ? 0 : getSo2().hashCode());
        result = prime * result + ((getNh3() == null) ? 0 : getNh3().hashCode());
        result = prime * result + ((getVocs() == null) ? 0 : getVocs().hashCode());
        result = prime * result + ((getPm25() == null) ? 0 : getPm25().hashCode());
        result = prime * result + ((getPm10() == null) ? 0 : getPm10().hashCode());
        result = prime * result + ((getBc() == null) ? 0 : getBc().hashCode());
        result = prime * result + ((getOc() == null) ? 0 : getOc().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return result;
    }
}