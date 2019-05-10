package com.nankai.xining.bean;

import java.io.Serializable;

public class Previsiprec extends PrevisiprecKey implements Serializable {
    private Double preVisibility;

    private Double prePto;

    private Double prePte;

    private static final long serialVersionUID = 1L;

    public Double getPreVisibility() {
        return preVisibility;
    }

    public void setPreVisibility(Double preVisibility) {
        this.preVisibility = preVisibility;
    }

    public Double getPrePto() {
        return prePto;
    }

    public void setPrePto(Double prePto) {
        this.prePto = prePto;
    }

    public Double getPrePte() {
        return prePte;
    }

    public void setPrePte(Double prePte) {
        this.prePte = prePte;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", preVisibility=").append(preVisibility);
        sb.append(", prePto=").append(prePto);
        sb.append(", prePte=").append(prePte);
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
        Previsiprec other = (Previsiprec) that;
        return (this.getCellid() == null ? other.getCellid() == null : this.getCellid().equals(other.getCellid()))
            && (this.getDateid() == null ? other.getDateid() == null : this.getDateid().equals(other.getDateid()))
            && (this.getPreVisibility() == null ? other.getPreVisibility() == null : this.getPreVisibility().equals(other.getPreVisibility()))
            && (this.getPrePto() == null ? other.getPrePto() == null : this.getPrePto().equals(other.getPrePto()))
            && (this.getPrePte() == null ? other.getPrePte() == null : this.getPrePte().equals(other.getPrePte()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCellid() == null) ? 0 : getCellid().hashCode());
        result = prime * result + ((getDateid() == null) ? 0 : getDateid().hashCode());
        result = prime * result + ((getPreVisibility() == null) ? 0 : getPreVisibility().hashCode());
        result = prime * result + ((getPrePto() == null) ? 0 : getPrePto().hashCode());
        result = prime * result + ((getPrePte() == null) ? 0 : getPrePte().hashCode());
        return result;
    }
}