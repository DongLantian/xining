package com.nankai.xining.bean;

import java.io.Serializable;

public class Industry implements Serializable {
    private String industryId;

    private String industryName;

    private String industryDesc;

    private static final long serialVersionUID = 1L;

    public String getIndustryId() {
        return industryId;
    }

    public void setIndustryId(String industryId) {
        this.industryId = industryId == null ? null : industryId.trim();
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName == null ? null : industryName.trim();
    }

    public String getIndustryDesc() {
        return industryDesc;
    }

    public void setIndustryDesc(String industryDesc) {
        this.industryDesc = industryDesc == null ? null : industryDesc.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", industryId=").append(industryId);
        sb.append(", industryName=").append(industryName);
        sb.append(", industryDesc=").append(industryDesc);
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
        Industry other = (Industry) that;
        return (this.getIndustryId() == null ? other.getIndustryId() == null : this.getIndustryId().equals(other.getIndustryId()))
            && (this.getIndustryName() == null ? other.getIndustryName() == null : this.getIndustryName().equals(other.getIndustryName()))
            && (this.getIndustryDesc() == null ? other.getIndustryDesc() == null : this.getIndustryDesc().equals(other.getIndustryDesc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIndustryId() == null) ? 0 : getIndustryId().hashCode());
        result = prime * result + ((getIndustryName() == null) ? 0 : getIndustryName().hashCode());
        result = prime * result + ((getIndustryDesc() == null) ? 0 : getIndustryDesc().hashCode());
        return result;
    }
}