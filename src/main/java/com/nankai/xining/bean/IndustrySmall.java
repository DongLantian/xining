package com.nankai.xining.bean;

import java.io.Serializable;

public class IndustrySmall implements Serializable {
    private Integer id;

    private String industryBig;

    private String industrySmall;

    private String industryName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIndustryBig() {
        return industryBig;
    }

    public void setIndustryBig(String industryBig) {
        this.industryBig = industryBig == null ? null : industryBig.trim();
    }

    public String getIndustrySmall() {
        return industrySmall;
    }

    public void setIndustrySmall(String industrySmall) {
        this.industrySmall = industrySmall == null ? null : industrySmall.trim();
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName == null ? null : industryName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", industryBig=").append(industryBig);
        sb.append(", industrySmall=").append(industrySmall);
        sb.append(", industryName=").append(industryName);
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
        IndustrySmall other = (IndustrySmall) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getIndustryBig() == null ? other.getIndustryBig() == null : this.getIndustryBig().equals(other.getIndustryBig()))
            && (this.getIndustrySmall() == null ? other.getIndustrySmall() == null : this.getIndustrySmall().equals(other.getIndustrySmall()))
            && (this.getIndustryName() == null ? other.getIndustryName() == null : this.getIndustryName().equals(other.getIndustryName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getIndustryBig() == null) ? 0 : getIndustryBig().hashCode());
        result = prime * result + ((getIndustrySmall() == null) ? 0 : getIndustrySmall().hashCode());
        result = prime * result + ((getIndustryName() == null) ? 0 : getIndustryName().hashCode());
        return result;
    }
}