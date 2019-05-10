package com.nankai.xining.bean;

import java.io.Serializable;
import java.util.Date;

public class MonvisimoncKey implements Serializable {
    private String cellid;

    private Date dateid;

    private static final long serialVersionUID = 1L;

    public String getCellid() {
        return cellid;
    }

    public void setCellid(String cellid) {
        this.cellid = cellid == null ? null : cellid.trim();
    }

    public Date getDateid() {
        return dateid;
    }

    public void setDateid(Date dateid) {
        this.dateid = dateid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cellid=").append(cellid);
        sb.append(", dateid=").append(dateid);
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
        MonvisimoncKey other = (MonvisimoncKey) that;
        return (this.getCellid() == null ? other.getCellid() == null : this.getCellid().equals(other.getCellid()))
            && (this.getDateid() == null ? other.getDateid() == null : this.getDateid().equals(other.getDateid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCellid() == null) ? 0 : getCellid().hashCode());
        result = prime * result + ((getDateid() == null) ? 0 : getDateid().hashCode());
        return result;
    }
}