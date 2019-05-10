package com.nankai.xining.bean;

import java.io.Serializable;

public class Vocdeviceinfo implements Serializable {
    private Integer vocdeviceid;

    private Integer factoryId;

    private Integer vocdevicesurveyid;

    private String section;

    private String handleprocess;

    private Double yearruntime;

    private Double dayruntime;

    private String preprocess;

    private Double inconcentration;

    private Double inair;

    private Double outconcentration;

    private Double outair;

    private Double offefficiency;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getVocdeviceid() {
        return vocdeviceid;
    }

    public void setVocdeviceid(Integer vocdeviceid) {
        this.vocdeviceid = vocdeviceid;
    }

    public Integer getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Integer factoryId) {
        this.factoryId = factoryId;
    }

    public Integer getVocdevicesurveyid() {
        return vocdevicesurveyid;
    }

    public void setVocdevicesurveyid(Integer vocdevicesurveyid) {
        this.vocdevicesurveyid = vocdevicesurveyid;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section == null ? null : section.trim();
    }

    public String getHandleprocess() {
        return handleprocess;
    }

    public void setHandleprocess(String handleprocess) {
        this.handleprocess = handleprocess == null ? null : handleprocess.trim();
    }

    public Double getYearruntime() {
        return yearruntime;
    }

    public void setYearruntime(Double yearruntime) {
        this.yearruntime = yearruntime;
    }

    public Double getDayruntime() {
        return dayruntime;
    }

    public void setDayruntime(Double dayruntime) {
        this.dayruntime = dayruntime;
    }

    public String getPreprocess() {
        return preprocess;
    }

    public void setPreprocess(String preprocess) {
        this.preprocess = preprocess == null ? null : preprocess.trim();
    }

    public Double getInconcentration() {
        return inconcentration;
    }

    public void setInconcentration(Double inconcentration) {
        this.inconcentration = inconcentration;
    }

    public Double getInair() {
        return inair;
    }

    public void setInair(Double inair) {
        this.inair = inair;
    }

    public Double getOutconcentration() {
        return outconcentration;
    }

    public void setOutconcentration(Double outconcentration) {
        this.outconcentration = outconcentration;
    }

    public Double getOutair() {
        return outair;
    }

    public void setOutair(Double outair) {
        this.outair = outair;
    }

    public Double getOffefficiency() {
        return offefficiency;
    }

    public void setOffefficiency(Double offefficiency) {
        this.offefficiency = offefficiency;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", vocdeviceid=").append(vocdeviceid);
        sb.append(", factoryId=").append(factoryId);
        sb.append(", vocdevicesurveyid=").append(vocdevicesurveyid);
        sb.append(", section=").append(section);
        sb.append(", handleprocess=").append(handleprocess);
        sb.append(", yearruntime=").append(yearruntime);
        sb.append(", dayruntime=").append(dayruntime);
        sb.append(", preprocess=").append(preprocess);
        sb.append(", inconcentration=").append(inconcentration);
        sb.append(", inair=").append(inair);
        sb.append(", outconcentration=").append(outconcentration);
        sb.append(", outair=").append(outair);
        sb.append(", offefficiency=").append(offefficiency);
        sb.append(", status=").append(status);
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
        Vocdeviceinfo other = (Vocdeviceinfo) that;
        return (this.getVocdeviceid() == null ? other.getVocdeviceid() == null : this.getVocdeviceid().equals(other.getVocdeviceid()))
            && (this.getFactoryId() == null ? other.getFactoryId() == null : this.getFactoryId().equals(other.getFactoryId()))
            && (this.getVocdevicesurveyid() == null ? other.getVocdevicesurveyid() == null : this.getVocdevicesurveyid().equals(other.getVocdevicesurveyid()))
            && (this.getSection() == null ? other.getSection() == null : this.getSection().equals(other.getSection()))
            && (this.getHandleprocess() == null ? other.getHandleprocess() == null : this.getHandleprocess().equals(other.getHandleprocess()))
            && (this.getYearruntime() == null ? other.getYearruntime() == null : this.getYearruntime().equals(other.getYearruntime()))
            && (this.getDayruntime() == null ? other.getDayruntime() == null : this.getDayruntime().equals(other.getDayruntime()))
            && (this.getPreprocess() == null ? other.getPreprocess() == null : this.getPreprocess().equals(other.getPreprocess()))
            && (this.getInconcentration() == null ? other.getInconcentration() == null : this.getInconcentration().equals(other.getInconcentration()))
            && (this.getInair() == null ? other.getInair() == null : this.getInair().equals(other.getInair()))
            && (this.getOutconcentration() == null ? other.getOutconcentration() == null : this.getOutconcentration().equals(other.getOutconcentration()))
            && (this.getOutair() == null ? other.getOutair() == null : this.getOutair().equals(other.getOutair()))
            && (this.getOffefficiency() == null ? other.getOffefficiency() == null : this.getOffefficiency().equals(other.getOffefficiency()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVocdeviceid() == null) ? 0 : getVocdeviceid().hashCode());
        result = prime * result + ((getFactoryId() == null) ? 0 : getFactoryId().hashCode());
        result = prime * result + ((getVocdevicesurveyid() == null) ? 0 : getVocdevicesurveyid().hashCode());
        result = prime * result + ((getSection() == null) ? 0 : getSection().hashCode());
        result = prime * result + ((getHandleprocess() == null) ? 0 : getHandleprocess().hashCode());
        result = prime * result + ((getYearruntime() == null) ? 0 : getYearruntime().hashCode());
        result = prime * result + ((getDayruntime() == null) ? 0 : getDayruntime().hashCode());
        result = prime * result + ((getPreprocess() == null) ? 0 : getPreprocess().hashCode());
        result = prime * result + ((getInconcentration() == null) ? 0 : getInconcentration().hashCode());
        result = prime * result + ((getInair() == null) ? 0 : getInair().hashCode());
        result = prime * result + ((getOutconcentration() == null) ? 0 : getOutconcentration().hashCode());
        result = prime * result + ((getOutair() == null) ? 0 : getOutair().hashCode());
        result = prime * result + ((getOffefficiency() == null) ? 0 : getOffefficiency().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}