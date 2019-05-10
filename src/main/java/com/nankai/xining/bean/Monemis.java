package com.nankai.xining.bean;

import java.io.Serializable;

public class Monemis extends MonemisKey implements Serializable {
    private Double monVoc;

    private Double monNh3;

    private Double monNo;

    private Double monNo2;

    private Double monCo;

    private Double monSo2;

    private Double monPm10;

    private Double monPm25;

    private static final long serialVersionUID = 1L;

    public Double getMonVoc() {
        return monVoc;
    }

    public void setMonVoc(Double monVoc) {
        this.monVoc = monVoc;
    }

    public Double getMonNh3() {
        return monNh3;
    }

    public void setMonNh3(Double monNh3) {
        this.monNh3 = monNh3;
    }

    public Double getMonNo() {
        return monNo;
    }

    public void setMonNo(Double monNo) {
        this.monNo = monNo;
    }

    public Double getMonNo2() {
        return monNo2;
    }

    public void setMonNo2(Double monNo2) {
        this.monNo2 = monNo2;
    }

    public Double getMonCo() {
        return monCo;
    }

    public void setMonCo(Double monCo) {
        this.monCo = monCo;
    }

    public Double getMonSo2() {
        return monSo2;
    }

    public void setMonSo2(Double monSo2) {
        this.monSo2 = monSo2;
    }

    public Double getMonPm10() {
        return monPm10;
    }

    public void setMonPm10(Double monPm10) {
        this.monPm10 = monPm10;
    }

    public Double getMonPm25() {
        return monPm25;
    }

    public void setMonPm25(Double monPm25) {
        this.monPm25 = monPm25;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", monVoc=").append(monVoc);
        sb.append(", monNh3=").append(monNh3);
        sb.append(", monNo=").append(monNo);
        sb.append(", monNo2=").append(monNo2);
        sb.append(", monCo=").append(monCo);
        sb.append(", monSo2=").append(monSo2);
        sb.append(", monPm10=").append(monPm10);
        sb.append(", monPm25=").append(monPm25);
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
        Monemis other = (Monemis) that;
        return (this.getCellid() == null ? other.getCellid() == null : this.getCellid().equals(other.getCellid()))
            && (this.getDateid() == null ? other.getDateid() == null : this.getDateid().equals(other.getDateid()))
            && (this.getMonVoc() == null ? other.getMonVoc() == null : this.getMonVoc().equals(other.getMonVoc()))
            && (this.getMonNh3() == null ? other.getMonNh3() == null : this.getMonNh3().equals(other.getMonNh3()))
            && (this.getMonNo() == null ? other.getMonNo() == null : this.getMonNo().equals(other.getMonNo()))
            && (this.getMonNo2() == null ? other.getMonNo2() == null : this.getMonNo2().equals(other.getMonNo2()))
            && (this.getMonCo() == null ? other.getMonCo() == null : this.getMonCo().equals(other.getMonCo()))
            && (this.getMonSo2() == null ? other.getMonSo2() == null : this.getMonSo2().equals(other.getMonSo2()))
            && (this.getMonPm10() == null ? other.getMonPm10() == null : this.getMonPm10().equals(other.getMonPm10()))
            && (this.getMonPm25() == null ? other.getMonPm25() == null : this.getMonPm25().equals(other.getMonPm25()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCellid() == null) ? 0 : getCellid().hashCode());
        result = prime * result + ((getDateid() == null) ? 0 : getDateid().hashCode());
        result = prime * result + ((getMonVoc() == null) ? 0 : getMonVoc().hashCode());
        result = prime * result + ((getMonNh3() == null) ? 0 : getMonNh3().hashCode());
        result = prime * result + ((getMonNo() == null) ? 0 : getMonNo().hashCode());
        result = prime * result + ((getMonNo2() == null) ? 0 : getMonNo2().hashCode());
        result = prime * result + ((getMonCo() == null) ? 0 : getMonCo().hashCode());
        result = prime * result + ((getMonSo2() == null) ? 0 : getMonSo2().hashCode());
        result = prime * result + ((getMonPm10() == null) ? 0 : getMonPm10().hashCode());
        result = prime * result + ((getMonPm25() == null) ? 0 : getMonPm25().hashCode());
        return result;
    }
}