package com.nankai.xining.bean;

import java.io.Serializable;
import java.util.Date;

public class AlertInfo implements Serializable {
    private Integer aId;

    private Integer aTo;

    private Date aTime;

    private String aInfo;

    private static final long serialVersionUID = 1L;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public Integer getaTo() {
        return aTo;
    }

    public void setaTo(Integer aTo) {
        this.aTo = aTo;
    }

    public Date getaTime() {
        return aTime;
    }

    public void setaTime(Date aTime) {
        this.aTime = aTime;
    }

    public String getaInfo() {
        return aInfo;
    }

    public void setaInfo(String aInfo) {
        this.aInfo = aInfo == null ? null : aInfo.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aId=").append(aId);
        sb.append(", aTo=").append(aTo);
        sb.append(", aTime=").append(aTime);
        sb.append(", aInfo=").append(aInfo);
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
        AlertInfo other = (AlertInfo) that;
        return (this.getaId() == null ? other.getaId() == null : this.getaId().equals(other.getaId()))
            && (this.getaTo() == null ? other.getaTo() == null : this.getaTo().equals(other.getaTo()))
            && (this.getaTime() == null ? other.getaTime() == null : this.getaTime().equals(other.getaTime()))
            && (this.getaInfo() == null ? other.getaInfo() == null : this.getaInfo().equals(other.getaInfo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getaId() == null) ? 0 : getaId().hashCode());
        result = prime * result + ((getaTo() == null) ? 0 : getaTo().hashCode());
        result = prime * result + ((getaTime() == null) ? 0 : getaTime().hashCode());
        result = prime * result + ((getaInfo() == null) ? 0 : getaInfo().hashCode());
        return result;
    }
}