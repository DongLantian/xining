package com.nankai.xining.bean;

import java.io.Serializable;

public class Gridassignid implements Serializable {
    private String gridId;

    private static final long serialVersionUID = 1L;

    public String getGridId() {
        return gridId;
    }

    public void setGridId(String gridId) {
        this.gridId = gridId == null ? null : gridId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gridId=").append(gridId);
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
        Gridassignid other = (Gridassignid) that;
        return (this.getGridId() == null ? other.getGridId() == null : this.getGridId().equals(other.getGridId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGridId() == null) ? 0 : getGridId().hashCode());
        return result;
    }
}