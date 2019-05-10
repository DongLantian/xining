package com.nankai.xining.bean;

import java.io.Serializable;

public class Loadingprocess implements Serializable {
    private Integer loadingid;

    private Integer factoryId;

    private String reporter;

    private String phone;

    private String reportdate;

    private String transportation;

    private String operateschema;

    private Double loadingvolume;

    private Double factor;

    private Double realpressure;

    private Double weight;

    private Double temperature;

    private Double loadingloss;

    private Integer voczhili;

    private Double efficiency;

    private Double capcity;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getLoadingid() {
        return loadingid;
    }

    public void setLoadingid(Integer loadingid) {
        this.loadingid = loadingid;
    }

    public Integer getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Integer factoryId) {
        this.factoryId = factoryId;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter == null ? null : reporter.trim();
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

    public String getTransportation() {
        return transportation;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation == null ? null : transportation.trim();
    }

    public String getOperateschema() {
        return operateschema;
    }

    public void setOperateschema(String operateschema) {
        this.operateschema = operateschema == null ? null : operateschema.trim();
    }

    public Double getLoadingvolume() {
        return loadingvolume;
    }

    public void setLoadingvolume(Double loadingvolume) {
        this.loadingvolume = loadingvolume;
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

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getLoadingloss() {
        return loadingloss;
    }

    public void setLoadingloss(Double loadingloss) {
        this.loadingloss = loadingloss;
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
        sb.append(", loadingid=").append(loadingid);
        sb.append(", factoryId=").append(factoryId);
        sb.append(", reporter=").append(reporter);
        sb.append(", phone=").append(phone);
        sb.append(", reportdate=").append(reportdate);
        sb.append(", transportation=").append(transportation);
        sb.append(", operateschema=").append(operateschema);
        sb.append(", loadingvolume=").append(loadingvolume);
        sb.append(", factor=").append(factor);
        sb.append(", realpressure=").append(realpressure);
        sb.append(", weight=").append(weight);
        sb.append(", temperature=").append(temperature);
        sb.append(", loadingloss=").append(loadingloss);
        sb.append(", voczhili=").append(voczhili);
        sb.append(", efficiency=").append(efficiency);
        sb.append(", capcity=").append(capcity);
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
        Loadingprocess other = (Loadingprocess) that;
        return (this.getLoadingid() == null ? other.getLoadingid() == null : this.getLoadingid().equals(other.getLoadingid()))
            && (this.getFactoryId() == null ? other.getFactoryId() == null : this.getFactoryId().equals(other.getFactoryId()))
            && (this.getReporter() == null ? other.getReporter() == null : this.getReporter().equals(other.getReporter()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getReportdate() == null ? other.getReportdate() == null : this.getReportdate().equals(other.getReportdate()))
            && (this.getTransportation() == null ? other.getTransportation() == null : this.getTransportation().equals(other.getTransportation()))
            && (this.getOperateschema() == null ? other.getOperateschema() == null : this.getOperateschema().equals(other.getOperateschema()))
            && (this.getLoadingvolume() == null ? other.getLoadingvolume() == null : this.getLoadingvolume().equals(other.getLoadingvolume()))
            && (this.getFactor() == null ? other.getFactor() == null : this.getFactor().equals(other.getFactor()))
            && (this.getRealpressure() == null ? other.getRealpressure() == null : this.getRealpressure().equals(other.getRealpressure()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getTemperature() == null ? other.getTemperature() == null : this.getTemperature().equals(other.getTemperature()))
            && (this.getLoadingloss() == null ? other.getLoadingloss() == null : this.getLoadingloss().equals(other.getLoadingloss()))
            && (this.getVoczhili() == null ? other.getVoczhili() == null : this.getVoczhili().equals(other.getVoczhili()))
            && (this.getEfficiency() == null ? other.getEfficiency() == null : this.getEfficiency().equals(other.getEfficiency()))
            && (this.getCapcity() == null ? other.getCapcity() == null : this.getCapcity().equals(other.getCapcity()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLoadingid() == null) ? 0 : getLoadingid().hashCode());
        result = prime * result + ((getFactoryId() == null) ? 0 : getFactoryId().hashCode());
        result = prime * result + ((getReporter() == null) ? 0 : getReporter().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getReportdate() == null) ? 0 : getReportdate().hashCode());
        result = prime * result + ((getTransportation() == null) ? 0 : getTransportation().hashCode());
        result = prime * result + ((getOperateschema() == null) ? 0 : getOperateschema().hashCode());
        result = prime * result + ((getLoadingvolume() == null) ? 0 : getLoadingvolume().hashCode());
        result = prime * result + ((getFactor() == null) ? 0 : getFactor().hashCode());
        result = prime * result + ((getRealpressure() == null) ? 0 : getRealpressure().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getTemperature() == null) ? 0 : getTemperature().hashCode());
        result = prime * result + ((getLoadingloss() == null) ? 0 : getLoadingloss().hashCode());
        result = prime * result + ((getVoczhili() == null) ? 0 : getVoczhili().hashCode());
        result = prime * result + ((getEfficiency() == null) ? 0 : getEfficiency().hashCode());
        result = prime * result + ((getCapcity() == null) ? 0 : getCapcity().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}