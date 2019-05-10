package com.nankai.xining.bean;

import java.io.Serializable;

public class Vocdeviceemission implements Serializable {
    private Integer vocdevicesurveyid;

    private String reporter;

    private String reportdate;

    private String phone;

    private Integer factoryId;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getVocdevicesurveyid() {
        return vocdevicesurveyid;
    }

    public void setVocdevicesurveyid(Integer vocdevicesurveyid) {
        this.vocdevicesurveyid = vocdevicesurveyid;
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
        sb.append(", vocdevicesurveyid=").append(vocdevicesurveyid);
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
        Vocdeviceemission other = (Vocdeviceemission) that;
        return (this.getVocdevicesurveyid() == null ? other.getVocdevicesurveyid() == null : this.getVocdevicesurveyid().equals(other.getVocdevicesurveyid()))
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
        result = prime * result + ((getVocdevicesurveyid() == null) ? 0 : getVocdevicesurveyid().hashCode());
        result = prime * result + ((getReporter() == null) ? 0 : getReporter().hashCode());
        result = prime * result + ((getReportdate() == null) ? 0 : getReportdate().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getFactoryId() == null) ? 0 : getFactoryId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}