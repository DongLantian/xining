package com.nankai.xining.bean;

import java.io.Serializable;

public class TankMaterialname implements Serializable {
    private Integer tanksourceid;

    private String materialname;

    private static final long serialVersionUID = 1L;

    public Integer getTanksourceid() {
        return tanksourceid;
    }

    public void setTanksourceid(Integer tanksourceid) {
        this.tanksourceid = tanksourceid;
    }

    public String getMaterialname() {
        return materialname;
    }

    public void setMaterialname(String materialname) {
        this.materialname = materialname == null ? null : materialname.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tanksourceid=").append(tanksourceid);
        sb.append(", materialname=").append(materialname);
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
        TankMaterialname other = (TankMaterialname) that;
        return (this.getTanksourceid() == null ? other.getTanksourceid() == null : this.getTanksourceid().equals(other.getTanksourceid()))
            && (this.getMaterialname() == null ? other.getMaterialname() == null : this.getMaterialname().equals(other.getMaterialname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTanksourceid() == null) ? 0 : getTanksourceid().hashCode());
        result = prime * result + ((getMaterialname() == null) ? 0 : getMaterialname().hashCode());
        return result;
    }
}