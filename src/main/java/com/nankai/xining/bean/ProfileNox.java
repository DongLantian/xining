package com.nankai.xining.bean;

import java.io.Serializable;

public class ProfileNox implements Serializable {
    private Integer noxId;

    private Double noMolecular;

    private Double noDenominator;

    private Double noRate;

    private Double no2Molecular;

    private Double no2Denominator;

    private Double no2Rate;

    private static final long serialVersionUID = 1L;

    public Integer getNoxId() {
        return noxId;
    }

    public void setNoxId(Integer noxId) {
        this.noxId = noxId;
    }

    public Double getNoMolecular() {
        return noMolecular;
    }

    public void setNoMolecular(Double noMolecular) {
        this.noMolecular = noMolecular;
    }

    public Double getNoDenominator() {
        return noDenominator;
    }

    public void setNoDenominator(Double noDenominator) {
        this.noDenominator = noDenominator;
    }

    public Double getNoRate() {
        return noRate;
    }

    public void setNoRate(Double noRate) {
        this.noRate = noRate;
    }

    public Double getNo2Molecular() {
        return no2Molecular;
    }

    public void setNo2Molecular(Double no2Molecular) {
        this.no2Molecular = no2Molecular;
    }

    public Double getNo2Denominator() {
        return no2Denominator;
    }

    public void setNo2Denominator(Double no2Denominator) {
        this.no2Denominator = no2Denominator;
    }

    public Double getNo2Rate() {
        return no2Rate;
    }

    public void setNo2Rate(Double no2Rate) {
        this.no2Rate = no2Rate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", noxId=").append(noxId);
        sb.append(", noMolecular=").append(noMolecular);
        sb.append(", noDenominator=").append(noDenominator);
        sb.append(", noRate=").append(noRate);
        sb.append(", no2Molecular=").append(no2Molecular);
        sb.append(", no2Denominator=").append(no2Denominator);
        sb.append(", no2Rate=").append(no2Rate);
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
        ProfileNox other = (ProfileNox) that;
        return (this.getNoxId() == null ? other.getNoxId() == null : this.getNoxId().equals(other.getNoxId()))
            && (this.getNoMolecular() == null ? other.getNoMolecular() == null : this.getNoMolecular().equals(other.getNoMolecular()))
            && (this.getNoDenominator() == null ? other.getNoDenominator() == null : this.getNoDenominator().equals(other.getNoDenominator()))
            && (this.getNoRate() == null ? other.getNoRate() == null : this.getNoRate().equals(other.getNoRate()))
            && (this.getNo2Molecular() == null ? other.getNo2Molecular() == null : this.getNo2Molecular().equals(other.getNo2Molecular()))
            && (this.getNo2Denominator() == null ? other.getNo2Denominator() == null : this.getNo2Denominator().equals(other.getNo2Denominator()))
            && (this.getNo2Rate() == null ? other.getNo2Rate() == null : this.getNo2Rate().equals(other.getNo2Rate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNoxId() == null) ? 0 : getNoxId().hashCode());
        result = prime * result + ((getNoMolecular() == null) ? 0 : getNoMolecular().hashCode());
        result = prime * result + ((getNoDenominator() == null) ? 0 : getNoDenominator().hashCode());
        result = prime * result + ((getNoRate() == null) ? 0 : getNoRate().hashCode());
        result = prime * result + ((getNo2Molecular() == null) ? 0 : getNo2Molecular().hashCode());
        result = prime * result + ((getNo2Denominator() == null) ? 0 : getNo2Denominator().hashCode());
        result = prime * result + ((getNo2Rate() == null) ? 0 : getNo2Rate().hashCode());
        return result;
    }
}