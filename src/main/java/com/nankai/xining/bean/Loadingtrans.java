package com.nankai.xining.bean;

import java.io.Serializable;

public class Loadingtrans implements Serializable {
    private Integer transid;

    private String transportation;

    private static final long serialVersionUID = 1L;

    public Integer getTransid() {
        return transid;
    }

    public void setTransid(Integer transid) {
        this.transid = transid;
    }

    public String getTransportation() {
        return transportation;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation == null ? null : transportation.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", transid=").append(transid);
        sb.append(", transportation=").append(transportation);
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
        Loadingtrans other = (Loadingtrans) that;
        return (this.getTransid() == null ? other.getTransid() == null : this.getTransid().equals(other.getTransid()))
            && (this.getTransportation() == null ? other.getTransportation() == null : this.getTransportation().equals(other.getTransportation()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTransid() == null) ? 0 : getTransid().hashCode());
        result = prime * result + ((getTransportation() == null) ? 0 : getTransportation().hashCode());
        return result;
    }
}