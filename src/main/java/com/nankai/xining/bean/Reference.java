package com.nankai.xining.bean;

import java.io.Serializable;

public class Reference implements Serializable {
    private Integer id;

    private Double kTsp;

    private Double kPm10;

    private Double kPm25;

    private Double vkc;

    private Double velocityHeight;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getkTsp() {
        return kTsp;
    }

    public void setkTsp(Double kTsp) {
        this.kTsp = kTsp;
    }

    public Double getkPm10() {
        return kPm10;
    }

    public void setkPm10(Double kPm10) {
        this.kPm10 = kPm10;
    }

    public Double getkPm25() {
        return kPm25;
    }

    public void setkPm25(Double kPm25) {
        this.kPm25 = kPm25;
    }

    public Double getVkc() {
        return vkc;
    }

    public void setVkc(Double vkc) {
        this.vkc = vkc;
    }

    public Double getVelocityHeight() {
        return velocityHeight;
    }

    public void setVelocityHeight(Double velocityHeight) {
        this.velocityHeight = velocityHeight;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", kTsp=").append(kTsp);
        sb.append(", kPm10=").append(kPm10);
        sb.append(", kPm25=").append(kPm25);
        sb.append(", vkc=").append(vkc);
        sb.append(", velocityHeight=").append(velocityHeight);
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
        Reference other = (Reference) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getkTsp() == null ? other.getkTsp() == null : this.getkTsp().equals(other.getkTsp()))
            && (this.getkPm10() == null ? other.getkPm10() == null : this.getkPm10().equals(other.getkPm10()))
            && (this.getkPm25() == null ? other.getkPm25() == null : this.getkPm25().equals(other.getkPm25()))
            && (this.getVkc() == null ? other.getVkc() == null : this.getVkc().equals(other.getVkc()))
            && (this.getVelocityHeight() == null ? other.getVelocityHeight() == null : this.getVelocityHeight().equals(other.getVelocityHeight()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getkTsp() == null) ? 0 : getkTsp().hashCode());
        result = prime * result + ((getkPm10() == null) ? 0 : getkPm10().hashCode());
        result = prime * result + ((getkPm25() == null) ? 0 : getkPm25().hashCode());
        result = prime * result + ((getVkc() == null) ? 0 : getVkc().hashCode());
        result = prime * result + ((getVelocityHeight() == null) ? 0 : getVelocityHeight().hashCode());
        return result;
    }
}