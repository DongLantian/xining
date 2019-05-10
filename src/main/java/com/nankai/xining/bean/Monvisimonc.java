package com.nankai.xining.bean;

import java.io.Serializable;

public class Monvisimonc extends MonvisimoncKey implements Serializable {
    private Double monVisibility;

    private Double monPto;

    private Double monPte;

    private static final long serialVersionUID = 1L;

    public Double getMonVisibility() {
        return monVisibility;
    }

    public void setMonVisibility(Double monVisibility) {
        this.monVisibility = monVisibility;
    }

    public Double getMonPto() {
        return monPto;
    }

    public void setMonPto(Double monPto) {
        this.monPto = monPto;
    }

    public Double getMonPte() {
        return monPte;
    }

    public void setMonPte(Double monPte) {
        this.monPte = monPte;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", monVisibility=").append(monVisibility);
        sb.append(", monPto=").append(monPto);
        sb.append(", monPte=").append(monPte);
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
        Monvisimonc other = (Monvisimonc) that;
        return (this.getCellid() == null ? other.getCellid() == null : this.getCellid().equals(other.getCellid()))
            && (this.getDateid() == null ? other.getDateid() == null : this.getDateid().equals(other.getDateid()))
            && (this.getMonVisibility() == null ? other.getMonVisibility() == null : this.getMonVisibility().equals(other.getMonVisibility()))
            && (this.getMonPto() == null ? other.getMonPto() == null : this.getMonPto().equals(other.getMonPto()))
            && (this.getMonPte() == null ? other.getMonPte() == null : this.getMonPte().equals(other.getMonPte()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCellid() == null) ? 0 : getCellid().hashCode());
        result = prime * result + ((getDateid() == null) ? 0 : getDateid().hashCode());
        result = prime * result + ((getMonVisibility() == null) ? 0 : getMonVisibility().hashCode());
        result = prime * result + ((getMonPto() == null) ? 0 : getMonPto().hashCode());
        result = prime * result + ((getMonPte() == null) ? 0 : getMonPte().hashCode());
        return result;
    }
}