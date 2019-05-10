package com.nankai.xining.bean;

import java.io.Serializable;

public class SccGridTemp implements Serializable {
    private Integer id;

    private String scc;

    private String gridId;

    private String countyid;

    private String col;

    private String row;

    private Double rate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScc() {
        return scc;
    }

    public void setScc(String scc) {
        this.scc = scc == null ? null : scc.trim();
    }

    public String getGridId() {
        return gridId;
    }

    public void setGridId(String gridId) {
        this.gridId = gridId == null ? null : gridId.trim();
    }

    public String getCountyid() {
        return countyid;
    }

    public void setCountyid(String countyid) {
        this.countyid = countyid == null ? null : countyid.trim();
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col == null ? null : col.trim();
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row == null ? null : row.trim();
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", scc=").append(scc);
        sb.append(", gridId=").append(gridId);
        sb.append(", countyid=").append(countyid);
        sb.append(", col=").append(col);
        sb.append(", row=").append(row);
        sb.append(", rate=").append(rate);
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
        SccGridTemp other = (SccGridTemp) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getScc() == null ? other.getScc() == null : this.getScc().equals(other.getScc()))
            && (this.getGridId() == null ? other.getGridId() == null : this.getGridId().equals(other.getGridId()))
            && (this.getCountyid() == null ? other.getCountyid() == null : this.getCountyid().equals(other.getCountyid()))
            && (this.getCol() == null ? other.getCol() == null : this.getCol().equals(other.getCol()))
            && (this.getRow() == null ? other.getRow() == null : this.getRow().equals(other.getRow()))
            && (this.getRate() == null ? other.getRate() == null : this.getRate().equals(other.getRate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getScc() == null) ? 0 : getScc().hashCode());
        result = prime * result + ((getGridId() == null) ? 0 : getGridId().hashCode());
        result = prime * result + ((getCountyid() == null) ? 0 : getCountyid().hashCode());
        result = prime * result + ((getCol() == null) ? 0 : getCol().hashCode());
        result = prime * result + ((getRow() == null) ? 0 : getRow().hashCode());
        result = prime * result + ((getRate() == null) ? 0 : getRate().hashCode());
        return result;
    }
}