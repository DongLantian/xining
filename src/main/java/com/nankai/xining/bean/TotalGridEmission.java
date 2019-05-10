package com.nankai.xining.bean;

import java.io.Serializable;

public class TotalGridEmission implements Serializable {
    private Integer id;

    private Integer gridid;

    private String year;

    private Integer row;

    private Integer col;

    private String sourcetype;

    private Double pm;

    private Double pm25;

    private Double pm10;

    private Double so2;

    private Double nox;

    private Double nh3;

    private Double oc;

    private Double bc;

    private Double co;

    private Double hc;

    private Double voc;

    private Double no;

    private Double ec;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGridid() {
        return gridid;
    }

    public void setGridid(Integer gridid) {
        this.gridid = gridid;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getCol() {
        return col;
    }

    public void setCol(Integer col) {
        this.col = col;
    }

    public String getSourcetype() {
        return sourcetype;
    }

    public void setSourcetype(String sourcetype) {
        this.sourcetype = sourcetype == null ? null : sourcetype.trim();
    }

    public Double getPm() {
        return pm;
    }

    public void setPm(Double pm) {
        this.pm = pm;
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

    public Double getOc() {
        return oc;
    }

    public void setOc(Double oc) {
        this.oc = oc;
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

    public Double getHc() {
        return hc;
    }

    public void setHc(Double hc) {
        this.hc = hc;
    }

    public Double getVoc() {
        return voc;
    }

    public void setVoc(Double voc) {
        this.voc = voc;
    }

    public Double getNo() {
        return no;
    }

    public void setNo(Double no) {
        this.no = no;
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
        sb.append(", gridid=").append(gridid);
        sb.append(", year=").append(year);
        sb.append(", row=").append(row);
        sb.append(", col=").append(col);
        sb.append(", sourcetype=").append(sourcetype);
        sb.append(", pm=").append(pm);
        sb.append(", pm25=").append(pm25);
        sb.append(", pm10=").append(pm10);
        sb.append(", so2=").append(so2);
        sb.append(", nox=").append(nox);
        sb.append(", nh3=").append(nh3);
        sb.append(", oc=").append(oc);
        sb.append(", bc=").append(bc);
        sb.append(", co=").append(co);
        sb.append(", hc=").append(hc);
        sb.append(", voc=").append(voc);
        sb.append(", no=").append(no);
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
        TotalGridEmission other = (TotalGridEmission) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGridid() == null ? other.getGridid() == null : this.getGridid().equals(other.getGridid()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getRow() == null ? other.getRow() == null : this.getRow().equals(other.getRow()))
            && (this.getCol() == null ? other.getCol() == null : this.getCol().equals(other.getCol()))
            && (this.getSourcetype() == null ? other.getSourcetype() == null : this.getSourcetype().equals(other.getSourcetype()))
            && (this.getPm() == null ? other.getPm() == null : this.getPm().equals(other.getPm()))
            && (this.getPm25() == null ? other.getPm25() == null : this.getPm25().equals(other.getPm25()))
            && (this.getPm10() == null ? other.getPm10() == null : this.getPm10().equals(other.getPm10()))
            && (this.getSo2() == null ? other.getSo2() == null : this.getSo2().equals(other.getSo2()))
            && (this.getNox() == null ? other.getNox() == null : this.getNox().equals(other.getNox()))
            && (this.getNh3() == null ? other.getNh3() == null : this.getNh3().equals(other.getNh3()))
            && (this.getOc() == null ? other.getOc() == null : this.getOc().equals(other.getOc()))
            && (this.getBc() == null ? other.getBc() == null : this.getBc().equals(other.getBc()))
            && (this.getCo() == null ? other.getCo() == null : this.getCo().equals(other.getCo()))
            && (this.getHc() == null ? other.getHc() == null : this.getHc().equals(other.getHc()))
            && (this.getVoc() == null ? other.getVoc() == null : this.getVoc().equals(other.getVoc()))
            && (this.getNo() == null ? other.getNo() == null : this.getNo().equals(other.getNo()))
            && (this.getEc() == null ? other.getEc() == null : this.getEc().equals(other.getEc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGridid() == null) ? 0 : getGridid().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getRow() == null) ? 0 : getRow().hashCode());
        result = prime * result + ((getCol() == null) ? 0 : getCol().hashCode());
        result = prime * result + ((getSourcetype() == null) ? 0 : getSourcetype().hashCode());
        result = prime * result + ((getPm() == null) ? 0 : getPm().hashCode());
        result = prime * result + ((getPm25() == null) ? 0 : getPm25().hashCode());
        result = prime * result + ((getPm10() == null) ? 0 : getPm10().hashCode());
        result = prime * result + ((getSo2() == null) ? 0 : getSo2().hashCode());
        result = prime * result + ((getNox() == null) ? 0 : getNox().hashCode());
        result = prime * result + ((getNh3() == null) ? 0 : getNh3().hashCode());
        result = prime * result + ((getOc() == null) ? 0 : getOc().hashCode());
        result = prime * result + ((getBc() == null) ? 0 : getBc().hashCode());
        result = prime * result + ((getCo() == null) ? 0 : getCo().hashCode());
        result = prime * result + ((getHc() == null) ? 0 : getHc().hashCode());
        result = prime * result + ((getVoc() == null) ? 0 : getVoc().hashCode());
        result = prime * result + ((getNo() == null) ? 0 : getNo().hashCode());
        result = prime * result + ((getEc() == null) ? 0 : getEc().hashCode());
        return result;
    }
}