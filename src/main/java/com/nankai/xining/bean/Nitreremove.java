package com.nankai.xining.bean;

import java.io.Serializable;

public class Nitreremove implements Serializable {
    private Integer id;

    private String nitreRemoveId;

    private String nitreMethod;

    private Double noxRemoveEffi;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNitreRemoveId() {
        return nitreRemoveId;
    }

    public void setNitreRemoveId(String nitreRemoveId) {
        this.nitreRemoveId = nitreRemoveId == null ? null : nitreRemoveId.trim();
    }

    public String getNitreMethod() {
        return nitreMethod;
    }

    public void setNitreMethod(String nitreMethod) {
        this.nitreMethod = nitreMethod == null ? null : nitreMethod.trim();
    }

    public Double getNoxRemoveEffi() {
        return noxRemoveEffi;
    }

    public void setNoxRemoveEffi(Double noxRemoveEffi) {
        this.noxRemoveEffi = noxRemoveEffi;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", nitreRemoveId=").append(nitreRemoveId);
        sb.append(", nitreMethod=").append(nitreMethod);
        sb.append(", noxRemoveEffi=").append(noxRemoveEffi);
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
        Nitreremove other = (Nitreremove) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getNitreRemoveId() == null ? other.getNitreRemoveId() == null : this.getNitreRemoveId().equals(other.getNitreRemoveId()))
            && (this.getNitreMethod() == null ? other.getNitreMethod() == null : this.getNitreMethod().equals(other.getNitreMethod()))
            && (this.getNoxRemoveEffi() == null ? other.getNoxRemoveEffi() == null : this.getNoxRemoveEffi().equals(other.getNoxRemoveEffi()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getNitreRemoveId() == null) ? 0 : getNitreRemoveId().hashCode());
        result = prime * result + ((getNitreMethod() == null) ? 0 : getNitreMethod().hashCode());
        result = prime * result + ((getNoxRemoveEffi() == null) ? 0 : getNoxRemoveEffi().hashCode());
        return result;
    }
}