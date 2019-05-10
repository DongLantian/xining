package com.nankai.xining.bean;

import java.io.Serializable;

public class Sealpointemissionformal implements Serializable {
    private Integer sealpointsurveyid;

    private String reporter;

    private String reportdate;

    private String phone;

    private String devicename;

    private String processflow;

    private Double production;

    private Double runhour;

    private Integer factoryId;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getSealpointsurveyid() {
        return sealpointsurveyid;
    }

    public void setSealpointsurveyid(Integer sealpointsurveyid) {
        this.sealpointsurveyid = sealpointsurveyid;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter == null ? null : reporter.trim();
    }

    public String getReportdate() {
        return reportdate;
    }

    public void setReportdate(String reportdate) {
        this.reportdate = reportdate == null ? null : reportdate.trim();
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

    public String getProcessflow() {
        return processflow;
    }

    public void setProcessflow(String processflow) {
        this.processflow = processflow == null ? null : processflow.trim();
    }

    public Double getProduction() {
        return production;
    }

    public void setProduction(Double production) {
        this.production = production;
    }

    public Double getRunhour() {
        return runhour;
    }

    public void setRunhour(Double runhour) {
        this.runhour = runhour;
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
        sb.append(", sealpointsurveyid=").append(sealpointsurveyid);
        sb.append(", reporter=").append(reporter);
        sb.append(", reportdate=").append(reportdate);
        sb.append(", phone=").append(phone);
        sb.append(", devicename=").append(devicename);
        sb.append(", processflow=").append(processflow);
        sb.append(", production=").append(production);
        sb.append(", runhour=").append(runhour);
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
        Sealpointemissionformal other = (Sealpointemissionformal) that;
        return (this.getSealpointsurveyid() == null ? other.getSealpointsurveyid() == null : this.getSealpointsurveyid().equals(other.getSealpointsurveyid()))
            && (this.getReporter() == null ? other.getReporter() == null : this.getReporter().equals(other.getReporter()))
            && (this.getReportdate() == null ? other.getReportdate() == null : this.getReportdate().equals(other.getReportdate()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getDevicename() == null ? other.getDevicename() == null : this.getDevicename().equals(other.getDevicename()))
            && (this.getProcessflow() == null ? other.getProcessflow() == null : this.getProcessflow().equals(other.getProcessflow()))
            && (this.getProduction() == null ? other.getProduction() == null : this.getProduction().equals(other.getProduction()))
            && (this.getRunhour() == null ? other.getRunhour() == null : this.getRunhour().equals(other.getRunhour()))
            && (this.getFactoryId() == null ? other.getFactoryId() == null : this.getFactoryId().equals(other.getFactoryId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSealpointsurveyid() == null) ? 0 : getSealpointsurveyid().hashCode());
        result = prime * result + ((getReporter() == null) ? 0 : getReporter().hashCode());
        result = prime * result + ((getReportdate() == null) ? 0 : getReportdate().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getDevicename() == null) ? 0 : getDevicename().hashCode());
        result = prime * result + ((getProcessflow() == null) ? 0 : getProcessflow().hashCode());
        result = prime * result + ((getProduction() == null) ? 0 : getProduction().hashCode());
        result = prime * result + ((getRunhour() == null) ? 0 : getRunhour().hashCode());
        result = prime * result + ((getFactoryId() == null) ? 0 : getFactoryId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}