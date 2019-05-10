package com.nankai.xining.bean;

import java.io.Serializable;

public class Wastewater implements Serializable {
    private Integer wastewaterid;

    private String phone;

    private String reportdate;

    private String reporter;

    private String wasterwaterpart;

    private Double handlevolumn;

    private Double factor;

    private Double realpressure;

    private Integer voczhili;

    private Double efficiency;

    private Double capcity;

    private Integer factoryId;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getWastewaterid() {
        return wastewaterid;
    }

    public void setWastewaterid(Integer wastewaterid) {
        this.wastewaterid = wastewaterid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getReportdate() {
        return reportdate;
    }

    public void setReportdate(String reportdate) {
        this.reportdate = reportdate == null ? null : reportdate.trim();
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter == null ? null : reporter.trim();
    }

    public String getWasterwaterpart() {
        return wasterwaterpart;
    }

    public void setWasterwaterpart(String wasterwaterpart) {
        this.wasterwaterpart = wasterwaterpart == null ? null : wasterwaterpart.trim();
    }

    public Double getHandlevolumn() {
        return handlevolumn;
    }

    public void setHandlevolumn(Double handlevolumn) {
        this.handlevolumn = handlevolumn;
    }

    public Double getFactor() {
        return factor;
    }

    public void setFactor(Double factor) {
        this.factor = factor;
    }

    public Double getRealpressure() {
        return realpressure;
    }

    public void setRealpressure(Double realpressure) {
        this.realpressure = realpressure;
    }

    public Integer getVoczhili() {
        return voczhili;
    }

    public void setVoczhili(Integer voczhili) {
        this.voczhili = voczhili;
    }

    public Double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(Double efficiency) {
        this.efficiency = efficiency;
    }

    public Double getCapcity() {
        return capcity;
    }

    public void setCapcity(Double capcity) {
        this.capcity = capcity;
    }

    public Integer getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Integer factoryId) {
        this.factoryId = factoryId;
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
        sb.append(", wastewaterid=").append(wastewaterid);
        sb.append(", phone=").append(phone);
        sb.append(", reportdate=").append(reportdate);
        sb.append(", reporter=").append(reporter);
        sb.append(", wasterwaterpart=").append(wasterwaterpart);
        sb.append(", handlevolumn=").append(handlevolumn);
        sb.append(", factor=").append(factor);
        sb.append(", realpressure=").append(realpressure);
        sb.append(", voczhili=").append(voczhili);
        sb.append(", efficiency=").append(efficiency);
        sb.append(", capcity=").append(capcity);
        sb.append(", factoryId=").append(factoryId);
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
        Wastewater other = (Wastewater) that;
        return (this.getWastewaterid() == null ? other.getWastewaterid() == null : this.getWastewaterid().equals(other.getWastewaterid()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getReportdate() == null ? other.getReportdate() == null : this.getReportdate().equals(other.getReportdate()))
            && (this.getReporter() == null ? other.getReporter() == null : this.getReporter().equals(other.getReporter()))
            && (this.getWasterwaterpart() == null ? other.getWasterwaterpart() == null : this.getWasterwaterpart().equals(other.getWasterwaterpart()))
            && (this.getHandlevolumn() == null ? other.getHandlevolumn() == null : this.getHandlevolumn().equals(other.getHandlevolumn()))
            && (this.getFactor() == null ? other.getFactor() == null : this.getFactor().equals(other.getFactor()))
            && (this.getRealpressure() == null ? other.getRealpressure() == null : this.getRealpressure().equals(other.getRealpressure()))
            && (this.getVoczhili() == null ? other.getVoczhili() == null : this.getVoczhili().equals(other.getVoczhili()))
            && (this.getEfficiency() == null ? other.getEfficiency() == null : this.getEfficiency().equals(other.getEfficiency()))
            && (this.getCapcity() == null ? other.getCapcity() == null : this.getCapcity().equals(other.getCapcity()))
            && (this.getFactoryId() == null ? other.getFactoryId() == null : this.getFactoryId().equals(other.getFactoryId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWastewaterid() == null) ? 0 : getWastewaterid().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getReportdate() == null) ? 0 : getReportdate().hashCode());
        result = prime * result + ((getReporter() == null) ? 0 : getReporter().hashCode());
        result = prime * result + ((getWasterwaterpart() == null) ? 0 : getWasterwaterpart().hashCode());
        result = prime * result + ((getHandlevolumn() == null) ? 0 : getHandlevolumn().hashCode());
        result = prime * result + ((getFactor() == null) ? 0 : getFactor().hashCode());
        result = prime * result + ((getRealpressure() == null) ? 0 : getRealpressure().hashCode());
        result = prime * result + ((getVoczhili() == null) ? 0 : getVoczhili().hashCode());
        result = prime * result + ((getEfficiency() == null) ? 0 : getEfficiency().hashCode());
        result = prime * result + ((getCapcity() == null) ? 0 : getCapcity().hashCode());
        result = prime * result + ((getFactoryId() == null) ? 0 : getFactoryId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}