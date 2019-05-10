package com.nankai.xining.bean;

import java.io.Serializable;

public class Landuseinfo implements Serializable {
    private String landcode;

    private String landname;

    private static final long serialVersionUID = 1L;

    public String getLandcode() {
        return landcode;
    }

    public void setLandcode(String landcode) {
        this.landcode = landcode == null ? null : landcode.trim();
    }

    public String getLandname() {
        return landname;
    }

    public void setLandname(String landname) {
        this.landname = landname == null ? null : landname.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", landcode=").append(landcode);
        sb.append(", landname=").append(landname);
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
        Landuseinfo other = (Landuseinfo) that;
        return (this.getLandcode() == null ? other.getLandcode() == null : this.getLandcode().equals(other.getLandcode()))
            && (this.getLandname() == null ? other.getLandname() == null : this.getLandname().equals(other.getLandname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLandcode() == null) ? 0 : getLandcode().hashCode());
        result = prime * result + ((getLandname() == null) ? 0 : getLandname().hashCode());
        return result;
    }
}