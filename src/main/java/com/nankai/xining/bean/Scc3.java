package com.nankai.xining.bean;

import java.io.Serializable;

public class Scc3 implements Serializable {
    private Integer id;

    private String scc1;

    private String scc2;

    private String scc3;

    private String description;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScc1() {
        return scc1;
    }

    public void setScc1(String scc1) {
        this.scc1 = scc1 == null ? null : scc1.trim();
    }

    public String getScc2() {
        return scc2;
    }

    public void setScc2(String scc2) {
        this.scc2 = scc2 == null ? null : scc2.trim();
    }

    public String getScc3() {
        return scc3;
    }

    public void setScc3(String scc3) {
        this.scc3 = scc3 == null ? null : scc3.trim();
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
        sb.append(", id=").append(id);
        sb.append(", scc1=").append(scc1);
        sb.append(", scc2=").append(scc2);
        sb.append(", scc3=").append(scc3);
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
        Scc3 other = (Scc3) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getScc1() == null ? other.getScc1() == null : this.getScc1().equals(other.getScc1()))
            && (this.getScc2() == null ? other.getScc2() == null : this.getScc2().equals(other.getScc2()))
            && (this.getScc3() == null ? other.getScc3() == null : this.getScc3().equals(other.getScc3()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getScc1() == null) ? 0 : getScc1().hashCode());
        result = prime * result + ((getScc2() == null) ? 0 : getScc2().hashCode());
        result = prime * result + ((getScc3() == null) ? 0 : getScc3().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return result;
    }
}