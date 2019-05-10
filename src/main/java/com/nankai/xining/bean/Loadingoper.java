package com.nankai.xining.bean;

import java.io.Serializable;

public class Loadingoper implements Serializable {
    private Integer operaid;

    private Integer transid;

    private String operateschema;

    private static final long serialVersionUID = 1L;

    public Integer getOperaid() {
        return operaid;
    }

    public void setOperaid(Integer operaid) {
        this.operaid = operaid;
    }

    public Integer getTransid() {
        return transid;
    }

    public void setTransid(Integer transid) {
        this.transid = transid;
    }

    public String getOperateschema() {
        return operateschema;
    }

    public void setOperateschema(String operateschema) {
        this.operateschema = operateschema == null ? null : operateschema.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", operaid=").append(operaid);
        sb.append(", transid=").append(transid);
        sb.append(", operateschema=").append(operateschema);
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
        Loadingoper other = (Loadingoper) that;
        return (this.getOperaid() == null ? other.getOperaid() == null : this.getOperaid().equals(other.getOperaid()))
            && (this.getTransid() == null ? other.getTransid() == null : this.getTransid().equals(other.getTransid()))
            && (this.getOperateschema() == null ? other.getOperateschema() == null : this.getOperateschema().equals(other.getOperateschema()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOperaid() == null) ? 0 : getOperaid().hashCode());
        result = prime * result + ((getTransid() == null) ? 0 : getTransid().hashCode());
        result = prime * result + ((getOperateschema() == null) ? 0 : getOperateschema().hashCode());
        return result;
    }
}