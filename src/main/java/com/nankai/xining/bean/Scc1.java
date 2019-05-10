package com.nankai.xining.bean;

import java.io.Serializable;

public class Scc1 implements Serializable {
    private String scc1;

    private String description;

    private static final long serialVersionUID = 1L;

    public String getScc1() {
        return scc1;
    }

    public void setScc1(String scc1) {
        this.scc1 = scc1 == null ? null : scc1.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", scc1=").append(scc1);
        sb.append(", description=").append(description);
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
        Scc1 other = (Scc1) that;
        return (this.getScc1() == null ? other.getScc1() == null : this.getScc1().equals(other.getScc1()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getScc1() == null) ? 0 : getScc1().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return result;
    }
}