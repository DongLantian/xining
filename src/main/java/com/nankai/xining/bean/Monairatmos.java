package com.nankai.xining.bean;

import java.io.Serializable;

public class Monairatmos extends MonairatmosKey implements Serializable {
    private Double monCo;

    private Double monSo2;

    private Double monO3;

    private Double monNo;

    private Double monNo2;

    private Double monNox;

    private Double monPm25;

    private Double monPm10;

    private Double monVoc;

    private Double monMonssure;

    private Double monTemp;

    private Double monWs;

    private Double monWd;

    private Double monRh;

    private Integer monHaze;

    private static final long serialVersionUID = 1L;

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

    public Double getMonO3() {
        return monO3;
    }

    public void setMonO3(Double monO3) {
        this.monO3 = monO3;
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

    public Double getMonNox() {
        return monNox;
    }

    public void setMonNox(Double monNox) {
        this.monNox = monNox;
    }

    public Double getMonPm25() {
        return monPm25;
    }

    public void setMonPm25(Double monPm25) {
        this.monPm25 = monPm25;
    }

    public Double getMonPm10() {
        return monPm10;
    }

    public void setMonPm10(Double monPm10) {
        this.monPm10 = monPm10;
    }

    public Double getMonVoc() {
        return monVoc;
    }

    public void setMonVoc(Double monVoc) {
        this.monVoc = monVoc;
    }

    public Double getMonMonssure() {
        return monMonssure;
    }

    public void setMonMonssure(Double monMonssure) {
        this.monMonssure = monMonssure;
    }

    public Double getMonTemp() {
        return monTemp;
    }

    public void setMonTemp(Double monTemp) {
        this.monTemp = monTemp;
    }

    public Double getMonWs() {
        return monWs;
    }

    public void setMonWs(Double monWs) {
        this.monWs = monWs;
    }

    public Double getMonWd() {
        return monWd;
    }

    public void setMonWd(Double monWd) {
        this.monWd = monWd;
    }

    public Double getMonRh() {
        return monRh;
    }

    public void setMonRh(Double monRh) {
        this.monRh = monRh;
    }

    public Integer getMonHaze() {
        return monHaze;
    }

    public void setMonHaze(Integer monHaze) {
        this.monHaze = monHaze;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", monCo=").append(monCo);
        sb.append(", monSo2=").append(monSo2);
        sb.append(", monO3=").append(monO3);
        sb.append(", monNo=").append(monNo);
        sb.append(", monNo2=").append(monNo2);
        sb.append(", monNox=").append(monNox);
        sb.append(", monPm25=").append(monPm25);
        sb.append(", monPm10=").append(monPm10);
        sb.append(", monVoc=").append(monVoc);
        sb.append(", monMonssure=").append(monMonssure);
        sb.append(", monTemp=").append(monTemp);
        sb.append(", monWs=").append(monWs);
        sb.append(", monWd=").append(monWd);
        sb.append(", monRh=").append(monRh);
        sb.append(", monHaze=").append(monHaze);
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
        Monairatmos other = (Monairatmos) that;
        return (this.getCellid() == null ? other.getCellid() == null : this.getCellid().equals(other.getCellid()))
            && (this.getDateid() == null ? other.getDateid() == null : this.getDateid().equals(other.getDateid()))
            && (this.getMonCo() == null ? other.getMonCo() == null : this.getMonCo().equals(other.getMonCo()))
            && (this.getMonSo2() == null ? other.getMonSo2() == null : this.getMonSo2().equals(other.getMonSo2()))
            && (this.getMonO3() == null ? other.getMonO3() == null : this.getMonO3().equals(other.getMonO3()))
            && (this.getMonNo() == null ? other.getMonNo() == null : this.getMonNo().equals(other.getMonNo()))
            && (this.getMonNo2() == null ? other.getMonNo2() == null : this.getMonNo2().equals(other.getMonNo2()))
            && (this.getMonNox() == null ? other.getMonNox() == null : this.getMonNox().equals(other.getMonNox()))
            && (this.getMonPm25() == null ? other.getMonPm25() == null : this.getMonPm25().equals(other.getMonPm25()))
            && (this.getMonPm10() == null ? other.getMonPm10() == null : this.getMonPm10().equals(other.getMonPm10()))
            && (this.getMonVoc() == null ? other.getMonVoc() == null : this.getMonVoc().equals(other.getMonVoc()))
            && (this.getMonMonssure() == null ? other.getMonMonssure() == null : this.getMonMonssure().equals(other.getMonMonssure()))
            && (this.getMonTemp() == null ? other.getMonTemp() == null : this.getMonTemp().equals(other.getMonTemp()))
            && (this.getMonWs() == null ? other.getMonWs() == null : this.getMonWs().equals(other.getMonWs()))
            && (this.getMonWd() == null ? other.getMonWd() == null : this.getMonWd().equals(other.getMonWd()))
            && (this.getMonRh() == null ? other.getMonRh() == null : this.getMonRh().equals(other.getMonRh()))
            && (this.getMonHaze() == null ? other.getMonHaze() == null : this.getMonHaze().equals(other.getMonHaze()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCellid() == null) ? 0 : getCellid().hashCode());
        result = prime * result + ((getDateid() == null) ? 0 : getDateid().hashCode());
        result = prime * result + ((getMonCo() == null) ? 0 : getMonCo().hashCode());
        result = prime * result + ((getMonSo2() == null) ? 0 : getMonSo2().hashCode());
        result = prime * result + ((getMonO3() == null) ? 0 : getMonO3().hashCode());
        result = prime * result + ((getMonNo() == null) ? 0 : getMonNo().hashCode());
        result = prime * result + ((getMonNo2() == null) ? 0 : getMonNo2().hashCode());
        result = prime * result + ((getMonNox() == null) ? 0 : getMonNox().hashCode());
        result = prime * result + ((getMonPm25() == null) ? 0 : getMonPm25().hashCode());
        result = prime * result + ((getMonPm10() == null) ? 0 : getMonPm10().hashCode());
        result = prime * result + ((getMonVoc() == null) ? 0 : getMonVoc().hashCode());
        result = prime * result + ((getMonMonssure() == null) ? 0 : getMonMonssure().hashCode());
        result = prime * result + ((getMonTemp() == null) ? 0 : getMonTemp().hashCode());
        result = prime * result + ((getMonWs() == null) ? 0 : getMonWs().hashCode());
        result = prime * result + ((getMonWd() == null) ? 0 : getMonWd().hashCode());
        result = prime * result + ((getMonRh() == null) ? 0 : getMonRh().hashCode());
        result = prime * result + ((getMonHaze() == null) ? 0 : getMonHaze().hashCode());
        return result;
    }
}