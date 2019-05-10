package com.nankai.xining.bean;

import java.io.Serializable;

public class NaturalLanduse implements Serializable {
    private Integer id;

    private Integer row;

    private Integer col;

    private String landcode;

    private Double proportion;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getCol() {
        return col;
    }

    public void setCol(Integer col) {
        this.col = col;
    }

    public String getLandcode() {
        return landcode;
    }

    public void setLandcode(String landcode) {
        this.landcode = landcode == null ? null : landcode.trim();
    }

    public Double getProportion() {
        return proportion;
    }

    public void setProportion(Double proportion) {
        this.proportion = proportion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", row=").append(row);
        sb.append(", col=").append(col);
        sb.append(", landcode=").append(landcode);
        sb.append(", proportion=").append(proportion);
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
        NaturalLanduse other = (NaturalLanduse) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRow() == null ? other.getRow() == null : this.getRow().equals(other.getRow()))
            && (this.getCol() == null ? other.getCol() == null : this.getCol().equals(other.getCol()))
            && (this.getLandcode() == null ? other.getLandcode() == null : this.getLandcode().equals(other.getLandcode()))
            && (this.getProportion() == null ? other.getProportion() == null : this.getProportion().equals(other.getProportion()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRow() == null) ? 0 : getRow().hashCode());
        result = prime * result + ((getCol() == null) ? 0 : getCol().hashCode());
        result = prime * result + ((getLandcode() == null) ? 0 : getLandcode().hashCode());
        result = prime * result + ((getProportion() == null) ? 0 : getProportion().hashCode());
        return result;
    }
}