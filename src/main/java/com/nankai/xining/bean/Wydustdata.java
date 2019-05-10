package com.nankai.xining.bean;

import java.io.Serializable;

public class Wydustdata implements Serializable {
    private Integer id;

    private String xjscc;

    private String epascc;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getXjscc() {
        return xjscc;
    }

    public void setXjscc(String xjscc) {
        this.xjscc = xjscc == null ? null : xjscc.trim();
    }

    public String getEpascc() {
        return epascc;
    }

    public void setEpascc(String epascc) {
        this.epascc = epascc == null ? null : epascc.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", xjscc=").append(xjscc);
        sb.append(", epascc=").append(epascc);
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
        Wydustdata other = (Wydustdata) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getXjscc() == null ? other.getXjscc() == null : this.getXjscc().equals(other.getXjscc()))
            && (this.getEpascc() == null ? other.getEpascc() == null : this.getEpascc().equals(other.getEpascc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getXjscc() == null) ? 0 : getXjscc().hashCode());
        result = prime * result + ((getEpascc() == null) ? 0 : getEpascc().hashCode());
        return result;
    }
}