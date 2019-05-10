package com.nankai.xining.bean;

import java.io.Serializable;

public class Tankemission implements Serializable {
    private Integer tanksurveyid;

    private String reporter;

    private String reportdate;

    private String phone;

    private Integer factoryId;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getTanksurveyid() {
        return tanksurveyid;
    }

    public void setTanksurveyid(Integer tanksurveyid) {
        this.tanksurveyid = tanksurveyid;
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
        sb.append(", tanksurveyid=").append(tanksurveyid);
        sb.append(", reporter=").append(reporter);
        sb.append(", reportdate=").append(reportdate);
        sb.append(", phone=").append(phone);
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
        Tankemission other = (Tankemission) that;
        return (this.getTanksurveyid() == null ? other.getTanksurveyid() == null : this.getTanksurveyid().equals(other.getTanksurveyid()))
            && (this.getReporter() == null ? other.getReporter() == null : this.getReporter().equals(other.getReporter()))
            && (this.getReportdate() == null ? other.getReportdate() == null : this.getReportdate().equals(other.getReportdate()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getFactoryId() == null ? other.getFactoryId() == null : this.getFactoryId().equals(other.getFactoryId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTanksurveyid() == null) ? 0 : getTanksurveyid().hashCode());
        result = prime * result + ((getReporter() == null) ? 0 : getReporter().hashCode());
        result = prime * result + ((getReportdate() == null) ? 0 : getReportdate().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getFactoryId() == null) ? 0 : getFactoryId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}