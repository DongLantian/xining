package com.nankai.xining.bean;

import java.io.Serializable;

public class FellReference implements Serializable {
    private Integer id;

    private String nkM;

    private Double nkValue;

    private String nkUnit;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNkM() {
        return nkM;
    }

    public void setNkM(String nkM) {
        this.nkM = nkM == null ? null : nkM.trim();
    }

    public Double getNkValue() {
        return nkValue;
    }

    public void setNkValue(Double nkValue) {
        this.nkValue = nkValue;
    }

    public String getNkUnit() {
        return nkUnit;
    }

    public void setNkUnit(String nkUnit) {
        this.nkUnit = nkUnit == null ? null : nkUnit.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", nkM=").append(nkM);
        sb.append(", nkValue=").append(nkValue);
        sb.append(", nkUnit=").append(nkUnit);
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
        FellReference other = (FellReference) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getNkM() == null ? other.getNkM() == null : this.getNkM().equals(other.getNkM()))
            && (this.getNkValue() == null ? other.getNkValue() == null : this.getNkValue().equals(other.getNkValue()))
            && (this.getNkUnit() == null ? other.getNkUnit() == null : this.getNkUnit().equals(other.getNkUnit()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getNkM() == null) ? 0 : getNkM().hashCode());
        result = prime * result + ((getNkValue() == null) ? 0 : getNkValue().hashCode());
        result = prime * result + ((getNkUnit() == null) ? 0 : getNkUnit().hashCode());
        return result;
    }
}