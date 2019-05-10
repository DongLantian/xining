package com.nankai.xining.bean;

import java.io.Serializable;

public class EmissionFactor implements Serializable {
    private String factorsId;

    private Integer factorsQuantity;

    private String factorsDiscritions;

    private String factor1Name;

    private String factor2Name;

    private String factor3Name;

    private String factor4Name;

    private String factor5Name;

    private String factor6Name;

    private String factor7Name;

    private String factor8Name;

    private String factor9Name;

    private String factor10Name;

    private static final long serialVersionUID = 1L;

    public String getFactorsId() {
        return factorsId;
    }

    public void setFactorsId(String factorsId) {
        this.factorsId = factorsId == null ? null : factorsId.trim();
    }

    public Integer getFactorsQuantity() {
        return factorsQuantity;
    }

    public void setFactorsQuantity(Integer factorsQuantity) {
        this.factorsQuantity = factorsQuantity;
    }

    public String getFactorsDiscritions() {
        return factorsDiscritions;
    }

    public void setFactorsDiscritions(String factorsDiscritions) {
        this.factorsDiscritions = factorsDiscritions == null ? null : factorsDiscritions.trim();
    }

    public String getFactor1Name() {
        return factor1Name;
    }

    public void setFactor1Name(String factor1Name) {
        this.factor1Name = factor1Name == null ? null : factor1Name.trim();
    }

    public String getFactor2Name() {
        return factor2Name;
    }

    public void setFactor2Name(String factor2Name) {
        this.factor2Name = factor2Name == null ? null : factor2Name.trim();
    }

    public String getFactor3Name() {
        return factor3Name;
    }

    public void setFactor3Name(String factor3Name) {
        this.factor3Name = factor3Name == null ? null : factor3Name.trim();
    }

    public String getFactor4Name() {
        return factor4Name;
    }

    public void setFactor4Name(String factor4Name) {
        this.factor4Name = factor4Name == null ? null : factor4Name.trim();
    }

    public String getFactor5Name() {
        return factor5Name;
    }

    public void setFactor5Name(String factor5Name) {
        this.factor5Name = factor5Name == null ? null : factor5Name.trim();
    }

    public String getFactor6Name() {
        return factor6Name;
    }

    public void setFactor6Name(String factor6Name) {
        this.factor6Name = factor6Name == null ? null : factor6Name.trim();
    }

    public String getFactor7Name() {
        return factor7Name;
    }

    public void setFactor7Name(String factor7Name) {
        this.factor7Name = factor7Name == null ? null : factor7Name.trim();
    }

    public String getFactor8Name() {
        return factor8Name;
    }

    public void setFactor8Name(String factor8Name) {
        this.factor8Name = factor8Name == null ? null : factor8Name.trim();
    }

    public String getFactor9Name() {
        return factor9Name;
    }

    public void setFactor9Name(String factor9Name) {
        this.factor9Name = factor9Name == null ? null : factor9Name.trim();
    }

    public String getFactor10Name() {
        return factor10Name;
    }

    public void setFactor10Name(String factor10Name) {
        this.factor10Name = factor10Name == null ? null : factor10Name.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", factorsId=").append(factorsId);
        sb.append(", factorsQuantity=").append(factorsQuantity);
        sb.append(", factorsDiscritions=").append(factorsDiscritions);
        sb.append(", factor1Name=").append(factor1Name);
        sb.append(", factor2Name=").append(factor2Name);
        sb.append(", factor3Name=").append(factor3Name);
        sb.append(", factor4Name=").append(factor4Name);
        sb.append(", factor5Name=").append(factor5Name);
        sb.append(", factor6Name=").append(factor6Name);
        sb.append(", factor7Name=").append(factor7Name);
        sb.append(", factor8Name=").append(factor8Name);
        sb.append(", factor9Name=").append(factor9Name);
        sb.append(", factor10Name=").append(factor10Name);
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
        EmissionFactor other = (EmissionFactor) that;
        return (this.getFactorsId() == null ? other.getFactorsId() == null : this.getFactorsId().equals(other.getFactorsId()))
            && (this.getFactorsQuantity() == null ? other.getFactorsQuantity() == null : this.getFactorsQuantity().equals(other.getFactorsQuantity()))
            && (this.getFactorsDiscritions() == null ? other.getFactorsDiscritions() == null : this.getFactorsDiscritions().equals(other.getFactorsDiscritions()))
            && (this.getFactor1Name() == null ? other.getFactor1Name() == null : this.getFactor1Name().equals(other.getFactor1Name()))
            && (this.getFactor2Name() == null ? other.getFactor2Name() == null : this.getFactor2Name().equals(other.getFactor2Name()))
            && (this.getFactor3Name() == null ? other.getFactor3Name() == null : this.getFactor3Name().equals(other.getFactor3Name()))
            && (this.getFactor4Name() == null ? other.getFactor4Name() == null : this.getFactor4Name().equals(other.getFactor4Name()))
            && (this.getFactor5Name() == null ? other.getFactor5Name() == null : this.getFactor5Name().equals(other.getFactor5Name()))
            && (this.getFactor6Name() == null ? other.getFactor6Name() == null : this.getFactor6Name().equals(other.getFactor6Name()))
            && (this.getFactor7Name() == null ? other.getFactor7Name() == null : this.getFactor7Name().equals(other.getFactor7Name()))
            && (this.getFactor8Name() == null ? other.getFactor8Name() == null : this.getFactor8Name().equals(other.getFactor8Name()))
            && (this.getFactor9Name() == null ? other.getFactor9Name() == null : this.getFactor9Name().equals(other.getFactor9Name()))
            && (this.getFactor10Name() == null ? other.getFactor10Name() == null : this.getFactor10Name().equals(other.getFactor10Name()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFactorsId() == null) ? 0 : getFactorsId().hashCode());
        result = prime * result + ((getFactorsQuantity() == null) ? 0 : getFactorsQuantity().hashCode());
        result = prime * result + ((getFactorsDiscritions() == null) ? 0 : getFactorsDiscritions().hashCode());
        result = prime * result + ((getFactor1Name() == null) ? 0 : getFactor1Name().hashCode());
        result = prime * result + ((getFactor2Name() == null) ? 0 : getFactor2Name().hashCode());
        result = prime * result + ((getFactor3Name() == null) ? 0 : getFactor3Name().hashCode());
        result = prime * result + ((getFactor4Name() == null) ? 0 : getFactor4Name().hashCode());
        result = prime * result + ((getFactor5Name() == null) ? 0 : getFactor5Name().hashCode());
        result = prime * result + ((getFactor6Name() == null) ? 0 : getFactor6Name().hashCode());
        result = prime * result + ((getFactor7Name() == null) ? 0 : getFactor7Name().hashCode());
        result = prime * result + ((getFactor8Name() == null) ? 0 : getFactor8Name().hashCode());
        result = prime * result + ((getFactor9Name() == null) ? 0 : getFactor9Name().hashCode());
        result = prime * result + ((getFactor10Name() == null) ? 0 : getFactor10Name().hashCode());
        return result;
    }
}