package com.nankai.xining.bean;

import java.io.Serializable;

public class XjtimeptypeCopy implements Serializable {
    private Integer id;

    private String cid;

    private String year;

    private String scc1;

    private String scc2;

    private Double bc;

    private Double co;

    private Double pm10;

    private Double pm25;

    private Double vocs;

    private Double oc;

    private Double so2;

    private Double nox;

    private Double nh3;

    private Double ec;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getScc1() {
        return scc1;
    }

    public void setScc1(String scc1) {
        this.scc1 = scc1 == null ? null : scc1.trim();
    }

    public String getScc2() {
        return scc2;
    }

    public void setScc2(String scc2) {
        this.scc2 = scc2 == null ? null : scc2.trim();
    }

    public Double getBc() {
        return bc;
    }

    public void setBc(Double bc) {
        this.bc = bc;
    }

    public Double getCo() {
        return co;
    }

    public void setCo(Double co) {
        this.co = co;
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

    public Double getVocs() {
        return vocs;
    }

    public void setVocs(Double vocs) {
        this.vocs = vocs;
    }

    public Double getOc() {
        return oc;
    }

    public void setOc(Double oc) {
        this.oc = oc;
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

    public Double getNh3() {
        return nh3;
    }

    public void setNh3(Double nh3) {
        this.nh3 = nh3;
    }

    public Double getEc() {
        return ec;
    }

    public void setEc(Double ec) {
        this.ec = ec;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cid=").append(cid);
        sb.append(", year=").append(year);
        sb.append(", scc1=").append(scc1);
        sb.append(", scc2=").append(scc2);
        sb.append(", bc=").append(bc);
        sb.append(", co=").append(co);
        sb.append(", pm10=").append(pm10);
        sb.append(", pm25=").append(pm25);
        sb.append(", vocs=").append(vocs);
        sb.append(", oc=").append(oc);
        sb.append(", so2=").append(so2);
        sb.append(", nox=").append(nox);
        sb.append(", nh3=").append(nh3);
        sb.append(", ec=").append(ec);
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
        XjtimeptypeCopy other = (XjtimeptypeCopy) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCid() == null ? other.getCid() == null : this.getCid().equals(other.getCid()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getScc1() == null ? other.getScc1() == null : this.getScc1().equals(other.getScc1()))
            && (this.getScc2() == null ? other.getScc2() == null : this.getScc2().equals(other.getScc2()))
            && (this.getBc() == null ? other.getBc() == null : this.getBc().equals(other.getBc()))
            && (this.getCo() == null ? other.getCo() == null : this.getCo().equals(other.getCo()))
            && (this.getPm10() == null ? other.getPm10() == null : this.getPm10().equals(other.getPm10()))
            && (this.getPm25() == null ? other.getPm25() == null : this.getPm25().equals(other.getPm25()))
            && (this.getVocs() == null ? other.getVocs() == null : this.getVocs().equals(other.getVocs()))
            && (this.getOc() == null ? other.getOc() == null : this.getOc().equals(other.getOc()))
            && (this.getSo2() == null ? other.getSo2() == null : this.getSo2().equals(other.getSo2()))
            && (this.getNox() == null ? other.getNox() == null : this.getNox().equals(other.getNox()))
            && (this.getNh3() == null ? other.getNh3() == null : this.getNh3().equals(other.getNh3()))
            && (this.getEc() == null ? other.getEc() == null : this.getEc().equals(other.getEc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCid() == null) ? 0 : getCid().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getScc1() == null) ? 0 : getScc1().hashCode());
        result = prime * result + ((getScc2() == null) ? 0 : getScc2().hashCode());
        result = prime * result + ((getBc() == null) ? 0 : getBc().hashCode());
        result = prime * result + ((getCo() == null) ? 0 : getCo().hashCode());
        result = prime * result + ((getPm10() == null) ? 0 : getPm10().hashCode());
        result = prime * result + ((getPm25() == null) ? 0 : getPm25().hashCode());
        result = prime * result + ((getVocs() == null) ? 0 : getVocs().hashCode());
        result = prime * result + ((getOc() == null) ? 0 : getOc().hashCode());
        result = prime * result + ((getSo2() == null) ? 0 : getSo2().hashCode());
        result = prime * result + ((getNox() == null) ? 0 : getNox().hashCode());
        result = prime * result + ((getNh3() == null) ? 0 : getNh3().hashCode());
        result = prime * result + ((getEc() == null) ? 0 : getEc().hashCode());
        return result;
    }
}