package com.nankai.xining.bean;

import java.io.Serializable;

public class Gasemission implements Serializable {
    private Integer gassurveyid;

    private String reporter;

    private String phone;

    private String devicename;

    private String reportdate;

    private String processflow;

    private Double runhour;

    private Double production;

    private String emissionway;

    private Integer voczhili;

    private Double handledeviceefficiency;

    private String handledevicename;

    private Double capcity;

    private String handledeviceflow;

    private Integer status;

    private Integer factoryId;

    private static final long serialVersionUID = 1L;

    public Integer getGassurveyid() {
        return gassurveyid;
    }

    public void setGassurveyid(Integer gassurveyid) {
        this.gassurveyid = gassurveyid;
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

    public String getDevicename() {
        return devicename;
    }

    public void setDevicename(String devicename) {
        this.devicename = devicename == null ? null : devicename.trim();
    }

    public String getReportdate() {
        return reportdate;
    }

    public void setReportdate(String reportdate) {
        this.reportdate = reportdate == null ? null : reportdate.trim();
    }

    public String getProcessflow() {
        return processflow;
    }

    public void setProcessflow(String processflow) {
        this.processflow = processflow == null ? null : processflow.trim();
    }

    public Double getRunhour() {
        return runhour;
    }

    public void setRunhour(Double runhour) {
        this.runhour = runhour;
    }

    public Double getProduction() {
        return production;
    }

    public void setProduction(Double production) {
        this.production = production;
    }

    public String getEmissionway() {
        return emissionway;
    }

    public void setEmissionway(String emissionway) {
        this.emissionway = emissionway == null ? null : emissionway.trim();
    }

    public Integer getVoczhili() {
        return voczhili;
    }

    public void setVoczhili(Integer voczhili) {
        this.voczhili = voczhili;
    }

    public Double getHandledeviceefficiency() {
        return handledeviceefficiency;
    }

    public void setHandledeviceefficiency(Double handledeviceefficiency) {
        this.handledeviceefficiency = handledeviceefficiency;
    }

    public String getHandledevicename() {
        return handledevicename;
    }

    public void setHandledevicename(String handledevicename) {
        this.handledevicename = handledevicename == null ? null : handledevicename.trim();
    }

    public Double getCapcity() {
        return capcity;
    }

    public void setCapcity(Double capcity) {
        this.capcity = capcity;
    }

    public String getHandledeviceflow() {
        return handledeviceflow;
    }

    public void setHandledeviceflow(String handledeviceflow) {
        this.handledeviceflow = handledeviceflow == null ? null : handledeviceflow.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Integer factoryId) {
        this.factoryId = factoryId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gassurveyid=").append(gassurveyid);
        sb.append(", reporter=").append(reporter);
        sb.append(", phone=").append(phone);
        sb.append(", devicename=").append(devicename);
        sb.append(", reportdate=").append(reportdate);
        sb.append(", processflow=").append(processflow);
        sb.append(", runhour=").append(runhour);
        sb.append(", production=").append(production);
        sb.append(", emissionway=").append(emissionway);
        sb.append(", voczhili=").append(voczhili);
        sb.append(", handledeviceefficiency=").append(handledeviceefficiency);
        sb.append(", handledevicename=").append(handledevicename);
        sb.append(", capcity=").append(capcity);
        sb.append(", handledeviceflow=").append(handledeviceflow);
        sb.append(", status=").append(status);
        sb.append(", factoryId=").append(factoryId);
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
        Gasemission other = (Gasemission) that;
        return (this.getGassurveyid() == null ? other.getGassurveyid() == null : this.getGassurveyid().equals(other.getGassurveyid()))
            && (this.getReporter() == null ? other.getReporter() == null : this.getReporter().equals(other.getReporter()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getDevicename() == null ? other.getDevicename() == null : this.getDevicename().equals(other.getDevicename()))
            && (this.getReportdate() == null ? other.getReportdate() == null : this.getReportdate().equals(other.getReportdate()))
            && (this.getProcessflow() == null ? other.getProcessflow() == null : this.getProcessflow().equals(other.getProcessflow()))
            && (this.getRunhour() == null ? other.getRunhour() == null : this.getRunhour().equals(other.getRunhour()))
            && (this.getProduction() == null ? other.getProduction() == null : this.getProduction().equals(other.getProduction()))
            && (this.getEmissionway() == null ? other.getEmissionway() == null : this.getEmissionway().equals(other.getEmissionway()))
            && (this.getVoczhili() == null ? other.getVoczhili() == null : this.getVoczhili().equals(other.getVoczhili()))
            && (this.getHandledeviceefficiency() == null ? other.getHandledeviceefficiency() == null : this.getHandledeviceefficiency().equals(other.getHandledeviceefficiency()))
            && (this.getHandledevicename() == null ? other.getHandledevicename() == null : this.getHandledevicename().equals(other.getHandledevicename()))
            && (this.getCapcity() == null ? other.getCapcity() == null : this.getCapcity().equals(other.getCapcity()))
            && (this.getHandledeviceflow() == null ? other.getHandledeviceflow() == null : this.getHandledeviceflow().equals(other.getHandledeviceflow()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getFactoryId() == null ? other.getFactoryId() == null : this.getFactoryId().equals(other.getFactoryId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGassurveyid() == null) ? 0 : getGassurveyid().hashCode());
        result = prime * result + ((getReporter() == null) ? 0 : getReporter().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getDevicename() == null) ? 0 : getDevicename().hashCode());
        result = prime * result + ((getReportdate() == null) ? 0 : getReportdate().hashCode());
        result = prime * result + ((getProcessflow() == null) ? 0 : getProcessflow().hashCode());
        result = prime * result + ((getRunhour() == null) ? 0 : getRunhour().hashCode());
        result = prime * result + ((getProduction() == null) ? 0 : getProduction().hashCode());
        result = prime * result + ((getEmissionway() == null) ? 0 : getEmissionway().hashCode());
        result = prime * result + ((getVoczhili() == null) ? 0 : getVoczhili().hashCode());
        result = prime * result + ((getHandledeviceefficiency() == null) ? 0 : getHandledeviceefficiency().hashCode());
        result = prime * result + ((getHandledevicename() == null) ? 0 : getHandledevicename().hashCode());
        result = prime * result + ((getCapcity() == null) ? 0 : getCapcity().hashCode());
        result = prime * result + ((getHandledeviceflow() == null) ? 0 : getHandledeviceflow().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getFactoryId() == null) ? 0 : getFactoryId().hashCode());
        return result;
    }
}