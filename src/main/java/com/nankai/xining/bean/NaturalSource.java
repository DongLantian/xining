package com.nankai.xining.bean;

import java.io.Serializable;

public class NaturalSource implements Serializable {
    private Integer ntId;

    private Integer ntYear;

    private Integer ntMonth;

    private Integer ntHour;

    private Integer ntRow;

    private Integer ntCol;

    private Double ntArea;

    private Double ntVoc;

    private static final long serialVersionUID = 1L;

    public Integer getNtId() {
        return ntId;
    }

    public void setNtId(Integer ntId) {
        this.ntId = ntId;
    }

    public Integer getNtYear() {
        return ntYear;
    }

    public void setNtYear(Integer ntYear) {
        this.ntYear = ntYear;
    }

    public Integer getNtMonth() {
        return ntMonth;
    }

    public void setNtMonth(Integer ntMonth) {
        this.ntMonth = ntMonth;
    }

    public Integer getNtHour() {
        return ntHour;
    }

    public void setNtHour(Integer ntHour) {
        this.ntHour = ntHour;
    }

    public Integer getNtRow() {
        return ntRow;
    }

    public void setNtRow(Integer ntRow) {
        this.ntRow = ntRow;
    }

    public Integer getNtCol() {
        return ntCol;
    }

    public void setNtCol(Integer ntCol) {
        this.ntCol = ntCol;
    }

    public Double getNtArea() {
        return ntArea;
    }

    public void setNtArea(Double ntArea) {
        this.ntArea = ntArea;
    }

    public Double getNtVoc() {
        return ntVoc;
    }

    public void setNtVoc(Double ntVoc) {
        this.ntVoc = ntVoc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ntId=").append(ntId);
        sb.append(", ntYear=").append(ntYear);
        sb.append(", ntMonth=").append(ntMonth);
        sb.append(", ntHour=").append(ntHour);
        sb.append(", ntRow=").append(ntRow);
        sb.append(", ntCol=").append(ntCol);
        sb.append(", ntArea=").append(ntArea);
        sb.append(", ntVoc=").append(ntVoc);
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
        NaturalSource other = (NaturalSource) that;
        return (this.getNtId() == null ? other.getNtId() == null : this.getNtId().equals(other.getNtId()))
            && (this.getNtYear() == null ? other.getNtYear() == null : this.getNtYear().equals(other.getNtYear()))
            && (this.getNtMonth() == null ? other.getNtMonth() == null : this.getNtMonth().equals(other.getNtMonth()))
            && (this.getNtHour() == null ? other.getNtHour() == null : this.getNtHour().equals(other.getNtHour()))
            && (this.getNtRow() == null ? other.getNtRow() == null : this.getNtRow().equals(other.getNtRow()))
            && (this.getNtCol() == null ? other.getNtCol() == null : this.getNtCol().equals(other.getNtCol()))
            && (this.getNtArea() == null ? other.getNtArea() == null : this.getNtArea().equals(other.getNtArea()))
            && (this.getNtVoc() == null ? other.getNtVoc() == null : this.getNtVoc().equals(other.getNtVoc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNtId() == null) ? 0 : getNtId().hashCode());
        result = prime * result + ((getNtYear() == null) ? 0 : getNtYear().hashCode());
        result = prime * result + ((getNtMonth() == null) ? 0 : getNtMonth().hashCode());
        result = prime * result + ((getNtHour() == null) ? 0 : getNtHour().hashCode());
        result = prime * result + ((getNtRow() == null) ? 0 : getNtRow().hashCode());
        result = prime * result + ((getNtCol() == null) ? 0 : getNtCol().hashCode());
        result = prime * result + ((getNtArea() == null) ? 0 : getNtArea().hashCode());
        result = prime * result + ((getNtVoc() == null) ? 0 : getNtVoc().hashCode());
        return result;
    }
}