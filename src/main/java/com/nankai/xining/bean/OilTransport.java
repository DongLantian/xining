package com.nankai.xining.bean;

import java.io.Serializable;

public class OilTransport implements Serializable {
    private Integer id;

    private Integer companyId;

    private String year;

    private String oilType;

    private String scccode;

    private String sourceDiscrip;

    private Double yearVolume;

    private Integer controlRate;

    private Double emission;

    private Integer flag;

    private String note;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getOilType() {
        return oilType;
    }

    public void setOilType(String oilType) {
        this.oilType = oilType == null ? null : oilType.trim();
    }

    public String getScccode() {
        return scccode;
    }

    public void setScccode(String scccode) {
        this.scccode = scccode == null ? null : scccode.trim();
    }

    public String getSourceDiscrip() {
        return sourceDiscrip;
    }

    public void setSourceDiscrip(String sourceDiscrip) {
        this.sourceDiscrip = sourceDiscrip == null ? null : sourceDiscrip.trim();
    }

    public Double getYearVolume() {
        return yearVolume;
    }

    public void setYearVolume(Double yearVolume) {
        this.yearVolume = yearVolume;
    }

    public Integer getControlRate() {
        return controlRate;
    }

    public void setControlRate(Integer controlRate) {
        this.controlRate = controlRate;
    }

    public Double getEmission() {
        return emission;
    }

    public void setEmission(Double emission) {
        this.emission = emission;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", companyId=").append(companyId);
        sb.append(", year=").append(year);
        sb.append(", oilType=").append(oilType);
        sb.append(", scccode=").append(scccode);
        sb.append(", sourceDiscrip=").append(sourceDiscrip);
        sb.append(", yearVolume=").append(yearVolume);
        sb.append(", controlRate=").append(controlRate);
        sb.append(", emission=").append(emission);
        sb.append(", flag=").append(flag);
        sb.append(", note=").append(note);
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
        OilTransport other = (OilTransport) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getOilType() == null ? other.getOilType() == null : this.getOilType().equals(other.getOilType()))
            && (this.getScccode() == null ? other.getScccode() == null : this.getScccode().equals(other.getScccode()))
            && (this.getSourceDiscrip() == null ? other.getSourceDiscrip() == null : this.getSourceDiscrip().equals(other.getSourceDiscrip()))
            && (this.getYearVolume() == null ? other.getYearVolume() == null : this.getYearVolume().equals(other.getYearVolume()))
            && (this.getControlRate() == null ? other.getControlRate() == null : this.getControlRate().equals(other.getControlRate()))
            && (this.getEmission() == null ? other.getEmission() == null : this.getEmission().equals(other.getEmission()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getOilType() == null) ? 0 : getOilType().hashCode());
        result = prime * result + ((getScccode() == null) ? 0 : getScccode().hashCode());
        result = prime * result + ((getSourceDiscrip() == null) ? 0 : getSourceDiscrip().hashCode());
        result = prime * result + ((getYearVolume() == null) ? 0 : getYearVolume().hashCode());
        result = prime * result + ((getControlRate() == null) ? 0 : getControlRate().hashCode());
        result = prime * result + ((getEmission() == null) ? 0 : getEmission().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        return result;
    }
}