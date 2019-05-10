package com.nankai.xining.bean;

import java.io.Serializable;
import java.util.Date;

public class SolventTemp implements Serializable {
    private Integer solventId;

    private Integer factoryId;

    private Short status;

    private Date lastCheckedTime;

    private Date lastChangedTime;

    private Integer totalNum;

    private String note;

    private static final long serialVersionUID = 1L;

    public Integer getSolventId() {
        return solventId;
    }

    public void setSolventId(Integer solventId) {
        this.solventId = solventId;
    }

    public Integer getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Integer factoryId) {
        this.factoryId = factoryId;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Date getLastCheckedTime() {
        return lastCheckedTime;
    }

    public void setLastCheckedTime(Date lastCheckedTime) {
        this.lastCheckedTime = lastCheckedTime;
    }

    public Date getLastChangedTime() {
        return lastChangedTime;
    }

    public void setLastChangedTime(Date lastChangedTime) {
        this.lastChangedTime = lastChangedTime;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
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
        sb.append(", solventId=").append(solventId);
        sb.append(", factoryId=").append(factoryId);
        sb.append(", status=").append(status);
        sb.append(", lastCheckedTime=").append(lastCheckedTime);
        sb.append(", lastChangedTime=").append(lastChangedTime);
        sb.append(", totalNum=").append(totalNum);
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
        SolventTemp other = (SolventTemp) that;
        return (this.getSolventId() == null ? other.getSolventId() == null : this.getSolventId().equals(other.getSolventId()))
            && (this.getFactoryId() == null ? other.getFactoryId() == null : this.getFactoryId().equals(other.getFactoryId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getLastCheckedTime() == null ? other.getLastCheckedTime() == null : this.getLastCheckedTime().equals(other.getLastCheckedTime()))
            && (this.getLastChangedTime() == null ? other.getLastChangedTime() == null : this.getLastChangedTime().equals(other.getLastChangedTime()))
            && (this.getTotalNum() == null ? other.getTotalNum() == null : this.getTotalNum().equals(other.getTotalNum()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSolventId() == null) ? 0 : getSolventId().hashCode());
        result = prime * result + ((getFactoryId() == null) ? 0 : getFactoryId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getLastCheckedTime() == null) ? 0 : getLastCheckedTime().hashCode());
        result = prime * result + ((getLastChangedTime() == null) ? 0 : getLastChangedTime().hashCode());
        result = prime * result + ((getTotalNum() == null) ? 0 : getTotalNum().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        return result;
    }
}