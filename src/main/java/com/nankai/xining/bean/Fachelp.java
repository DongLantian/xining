package com.nankai.xining.bean;

import java.io.Serializable;

public class Fachelp implements Serializable {
    private String facNo;

    private static final long serialVersionUID = 1L;

    public String getFacNo() {
        return facNo;
    }

    public void setFacNo(String facNo) {
        this.facNo = facNo == null ? null : facNo.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", facNo=").append(facNo);
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
        Fachelp other = (Fachelp) that;
        return (this.getFacNo() == null ? other.getFacNo() == null : this.getFacNo().equals(other.getFacNo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFacNo() == null) ? 0 : getFacNo().hashCode());
        return result;
    }
}