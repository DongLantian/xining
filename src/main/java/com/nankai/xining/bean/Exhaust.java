package com.nankai.xining.bean;

import java.io.Serializable;

public class Exhaust implements Serializable {
    private Integer exfId;

    private Integer nkNo;

    private Integer factoryId;

    private String exfMaterial;

    private Double exfHeight;

    private Double smokeOutd;

    private Double smokeOUtteM;

    private Double smokeOuta;

    private Double smokeOutv;

    private Double exfLongitude;

    private Double exfLatitude;

    private static final long serialVersionUID = 1L;

    public Integer getExfId() {
        return exfId;
    }

    public void setExfId(Integer exfId) {
        this.exfId = exfId;
    }

    public Integer getNkNo() {
        return nkNo;
    }

    public void setNkNo(Integer nkNo) {
        this.nkNo = nkNo;
    }

    public Integer getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Integer factoryId) {
        this.factoryId = factoryId;
    }

    public String getExfMaterial() {
        return exfMaterial;
    }

    public void setExfMaterial(String exfMaterial) {
        this.exfMaterial = exfMaterial == null ? null : exfMaterial.trim();
    }

    public Double getExfHeight() {
        return exfHeight;
    }

    public void setExfHeight(Double exfHeight) {
        this.exfHeight = exfHeight;
    }

    public Double getSmokeOutd() {
        return smokeOutd;
    }

    public void setSmokeOutd(Double smokeOutd) {
        this.smokeOutd = smokeOutd;
    }

    public Double getSmokeOUtteM() {
        return smokeOUtteM;
    }

    public void setSmokeOUtteM(Double smokeOUtteM) {
        this.smokeOUtteM = smokeOUtteM;
    }

    public Double getSmokeOuta() {
        return smokeOuta;
    }

    public void setSmokeOuta(Double smokeOuta) {
        this.smokeOuta = smokeOuta;
    }

    public Double getSmokeOutv() {
        return smokeOutv;
    }

    public void setSmokeOutv(Double smokeOutv) {
        this.smokeOutv = smokeOutv;
    }

    public Double getExfLongitude() {
        return exfLongitude;
    }

    public void setExfLongitude(Double exfLongitude) {
        this.exfLongitude = exfLongitude;
    }

    public Double getExfLatitude() {
        return exfLatitude;
    }

    public void setExfLatitude(Double exfLatitude) {
        this.exfLatitude = exfLatitude;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", exfId=").append(exfId);
        sb.append(", nkNo=").append(nkNo);
        sb.append(", factoryId=").append(factoryId);
        sb.append(", exfMaterial=").append(exfMaterial);
        sb.append(", exfHeight=").append(exfHeight);
        sb.append(", smokeOutd=").append(smokeOutd);
        sb.append(", smokeOUtteM=").append(smokeOUtteM);
        sb.append(", smokeOuta=").append(smokeOuta);
        sb.append(", smokeOutv=").append(smokeOutv);
        sb.append(", exfLongitude=").append(exfLongitude);
        sb.append(", exfLatitude=").append(exfLatitude);
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
        Exhaust other = (Exhaust) that;
        return (this.getExfId() == null ? other.getExfId() == null : this.getExfId().equals(other.getExfId()))
            && (this.getNkNo() == null ? other.getNkNo() == null : this.getNkNo().equals(other.getNkNo()))
            && (this.getFactoryId() == null ? other.getFactoryId() == null : this.getFactoryId().equals(other.getFactoryId()))
            && (this.getExfMaterial() == null ? other.getExfMaterial() == null : this.getExfMaterial().equals(other.getExfMaterial()))
            && (this.getExfHeight() == null ? other.getExfHeight() == null : this.getExfHeight().equals(other.getExfHeight()))
            && (this.getSmokeOutd() == null ? other.getSmokeOutd() == null : this.getSmokeOutd().equals(other.getSmokeOutd()))
            && (this.getSmokeOUtteM() == null ? other.getSmokeOUtteM() == null : this.getSmokeOUtteM().equals(other.getSmokeOUtteM()))
            && (this.getSmokeOuta() == null ? other.getSmokeOuta() == null : this.getSmokeOuta().equals(other.getSmokeOuta()))
            && (this.getSmokeOutv() == null ? other.getSmokeOutv() == null : this.getSmokeOutv().equals(other.getSmokeOutv()))
            && (this.getExfLongitude() == null ? other.getExfLongitude() == null : this.getExfLongitude().equals(other.getExfLongitude()))
            && (this.getExfLatitude() == null ? other.getExfLatitude() == null : this.getExfLatitude().equals(other.getExfLatitude()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getExfId() == null) ? 0 : getExfId().hashCode());
        result = prime * result + ((getNkNo() == null) ? 0 : getNkNo().hashCode());
        result = prime * result + ((getFactoryId() == null) ? 0 : getFactoryId().hashCode());
        result = prime * result + ((getExfMaterial() == null) ? 0 : getExfMaterial().hashCode());
        result = prime * result + ((getExfHeight() == null) ? 0 : getExfHeight().hashCode());
        result = prime * result + ((getSmokeOutd() == null) ? 0 : getSmokeOutd().hashCode());
        result = prime * result + ((getSmokeOUtteM() == null) ? 0 : getSmokeOUtteM().hashCode());
        result = prime * result + ((getSmokeOuta() == null) ? 0 : getSmokeOuta().hashCode());
        result = prime * result + ((getSmokeOutv() == null) ? 0 : getSmokeOutv().hashCode());
        result = prime * result + ((getExfLongitude() == null) ? 0 : getExfLongitude().hashCode());
        result = prime * result + ((getExfLatitude() == null) ? 0 : getExfLatitude().hashCode());
        return result;
    }
}