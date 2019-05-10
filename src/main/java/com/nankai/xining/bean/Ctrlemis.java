package com.nankai.xining.bean;

import java.io.Serializable;

public class Ctrlemis extends CtrlemisKey implements Serializable {
    private Double preVoc;

    private Double preNh3;

    private Double preNo;

    private Double preNo2;

    private Double preNox;

    private Double preCo;

    private Double preSo2;

    private Double prePm10;

    private Double prePm25;

    private static final long serialVersionUID = 1L;

    public Double getPreVoc() {
        return preVoc;
    }

    public void setPreVoc(Double preVoc) {
        this.preVoc = preVoc;
    }

    public Double getPreNh3() {
        return preNh3;
    }

    public void setPreNh3(Double preNh3) {
        this.preNh3 = preNh3;
    }

    public Double getPreNo() {
        return preNo;
    }

    public void setPreNo(Double preNo) {
        this.preNo = preNo;
    }

    public Double getPreNo2() {
        return preNo2;
    }

    public void setPreNo2(Double preNo2) {
        this.preNo2 = preNo2;
    }

    public Double getPreNox() {
        return preNox;
    }

    public void setPreNox(Double preNox) {
        this.preNox = preNox;
    }

    public Double getPreCo() {
        return preCo;
    }

    public void setPreCo(Double preCo) {
        this.preCo = preCo;
    }

    public Double getPreSo2() {
        return preSo2;
    }

    public void setPreSo2(Double preSo2) {
        this.preSo2 = preSo2;
    }

    public Double getPrePm10() {
        return prePm10;
    }

    public void setPrePm10(Double prePm10) {
        this.prePm10 = prePm10;
    }

    public Double getPrePm25() {
        return prePm25;
    }

    public void setPrePm25(Double prePm25) {
        this.prePm25 = prePm25;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", preVoc=").append(preVoc);
        sb.append(", preNh3=").append(preNh3);
        sb.append(", preNo=").append(preNo);
        sb.append(", preNo2=").append(preNo2);
        sb.append(", preNox=").append(preNox);
        sb.append(", preCo=").append(preCo);
        sb.append(", preSo2=").append(preSo2);
        sb.append(", prePm10=").append(prePm10);
        sb.append(", prePm25=").append(prePm25);
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
        Ctrlemis other = (Ctrlemis) that;
        return (this.getCellid() == null ? other.getCellid() == null : this.getCellid().equals(other.getCellid()))
            && (this.getDateid() == null ? other.getDateid() == null : this.getDateid().equals(other.getDateid()))
            && (this.getPreVoc() == null ? other.getPreVoc() == null : this.getPreVoc().equals(other.getPreVoc()))
            && (this.getPreNh3() == null ? other.getPreNh3() == null : this.getPreNh3().equals(other.getPreNh3()))
            && (this.getPreNo() == null ? other.getPreNo() == null : this.getPreNo().equals(other.getPreNo()))
            && (this.getPreNo2() == null ? other.getPreNo2() == null : this.getPreNo2().equals(other.getPreNo2()))
            && (this.getPreNox() == null ? other.getPreNox() == null : this.getPreNox().equals(other.getPreNox()))
            && (this.getPreCo() == null ? other.getPreCo() == null : this.getPreCo().equals(other.getPreCo()))
            && (this.getPreSo2() == null ? other.getPreSo2() == null : this.getPreSo2().equals(other.getPreSo2()))
            && (this.getPrePm10() == null ? other.getPrePm10() == null : this.getPrePm10().equals(other.getPrePm10()))
            && (this.getPrePm25() == null ? other.getPrePm25() == null : this.getPrePm25().equals(other.getPrePm25()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCellid() == null) ? 0 : getCellid().hashCode());
        result = prime * result + ((getDateid() == null) ? 0 : getDateid().hashCode());
        result = prime * result + ((getPreVoc() == null) ? 0 : getPreVoc().hashCode());
        result = prime * result + ((getPreNh3() == null) ? 0 : getPreNh3().hashCode());
        result = prime * result + ((getPreNo() == null) ? 0 : getPreNo().hashCode());
        result = prime * result + ((getPreNo2() == null) ? 0 : getPreNo2().hashCode());
        result = prime * result + ((getPreNox() == null) ? 0 : getPreNox().hashCode());
        result = prime * result + ((getPreCo() == null) ? 0 : getPreCo().hashCode());
        result = prime * result + ((getPreSo2() == null) ? 0 : getPreSo2().hashCode());
        result = prime * result + ((getPrePm10() == null) ? 0 : getPrePm10().hashCode());
        result = prime * result + ((getPrePm25() == null) ? 0 : getPrePm25().hashCode());
        return result;
    }
}