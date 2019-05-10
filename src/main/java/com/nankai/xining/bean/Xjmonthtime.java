package com.nankai.xining.bean;

import java.io.Serializable;

public class Xjmonthtime implements Serializable {
    private Integer monthId;

    private Integer january;

    private Integer february;

    private Integer march;

    private Integer april;

    private Integer may;

    private Integer june;

    private Integer july;

    private Integer august;

    private Integer september;

    private Integer october;

    private Integer november;

    private Integer december;

    private Integer totalMonth;

    private static final long serialVersionUID = 1L;

    public Integer getMonthId() {
        return monthId;
    }

    public void setMonthId(Integer monthId) {
        this.monthId = monthId;
    }

    public Integer getJanuary() {
        return january;
    }

    public void setJanuary(Integer january) {
        this.january = january;
    }

    public Integer getFebruary() {
        return february;
    }

    public void setFebruary(Integer february) {
        this.february = february;
    }

    public Integer getMarch() {
        return march;
    }

    public void setMarch(Integer march) {
        this.march = march;
    }

    public Integer getApril() {
        return april;
    }

    public void setApril(Integer april) {
        this.april = april;
    }

    public Integer getMay() {
        return may;
    }

    public void setMay(Integer may) {
        this.may = may;
    }

    public Integer getJune() {
        return june;
    }

    public void setJune(Integer june) {
        this.june = june;
    }

    public Integer getJuly() {
        return july;
    }

    public void setJuly(Integer july) {
        this.july = july;
    }

    public Integer getAugust() {
        return august;
    }

    public void setAugust(Integer august) {
        this.august = august;
    }

    public Integer getSeptember() {
        return september;
    }

    public void setSeptember(Integer september) {
        this.september = september;
    }

    public Integer getOctober() {
        return october;
    }

    public void setOctober(Integer october) {
        this.october = october;
    }

    public Integer getNovember() {
        return november;
    }

    public void setNovember(Integer november) {
        this.november = november;
    }

    public Integer getDecember() {
        return december;
    }

    public void setDecember(Integer december) {
        this.december = december;
    }

    public Integer getTotalMonth() {
        return totalMonth;
    }

    public void setTotalMonth(Integer totalMonth) {
        this.totalMonth = totalMonth;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", monthId=").append(monthId);
        sb.append(", january=").append(january);
        sb.append(", february=").append(february);
        sb.append(", march=").append(march);
        sb.append(", april=").append(april);
        sb.append(", may=").append(may);
        sb.append(", june=").append(june);
        sb.append(", july=").append(july);
        sb.append(", august=").append(august);
        sb.append(", september=").append(september);
        sb.append(", october=").append(october);
        sb.append(", november=").append(november);
        sb.append(", december=").append(december);
        sb.append(", totalMonth=").append(totalMonth);
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
        Xjmonthtime other = (Xjmonthtime) that;
        return (this.getMonthId() == null ? other.getMonthId() == null : this.getMonthId().equals(other.getMonthId()))
            && (this.getJanuary() == null ? other.getJanuary() == null : this.getJanuary().equals(other.getJanuary()))
            && (this.getFebruary() == null ? other.getFebruary() == null : this.getFebruary().equals(other.getFebruary()))
            && (this.getMarch() == null ? other.getMarch() == null : this.getMarch().equals(other.getMarch()))
            && (this.getApril() == null ? other.getApril() == null : this.getApril().equals(other.getApril()))
            && (this.getMay() == null ? other.getMay() == null : this.getMay().equals(other.getMay()))
            && (this.getJune() == null ? other.getJune() == null : this.getJune().equals(other.getJune()))
            && (this.getJuly() == null ? other.getJuly() == null : this.getJuly().equals(other.getJuly()))
            && (this.getAugust() == null ? other.getAugust() == null : this.getAugust().equals(other.getAugust()))
            && (this.getSeptember() == null ? other.getSeptember() == null : this.getSeptember().equals(other.getSeptember()))
            && (this.getOctober() == null ? other.getOctober() == null : this.getOctober().equals(other.getOctober()))
            && (this.getNovember() == null ? other.getNovember() == null : this.getNovember().equals(other.getNovember()))
            && (this.getDecember() == null ? other.getDecember() == null : this.getDecember().equals(other.getDecember()))
            && (this.getTotalMonth() == null ? other.getTotalMonth() == null : this.getTotalMonth().equals(other.getTotalMonth()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMonthId() == null) ? 0 : getMonthId().hashCode());
        result = prime * result + ((getJanuary() == null) ? 0 : getJanuary().hashCode());
        result = prime * result + ((getFebruary() == null) ? 0 : getFebruary().hashCode());
        result = prime * result + ((getMarch() == null) ? 0 : getMarch().hashCode());
        result = prime * result + ((getApril() == null) ? 0 : getApril().hashCode());
        result = prime * result + ((getMay() == null) ? 0 : getMay().hashCode());
        result = prime * result + ((getJune() == null) ? 0 : getJune().hashCode());
        result = prime * result + ((getJuly() == null) ? 0 : getJuly().hashCode());
        result = prime * result + ((getAugust() == null) ? 0 : getAugust().hashCode());
        result = prime * result + ((getSeptember() == null) ? 0 : getSeptember().hashCode());
        result = prime * result + ((getOctober() == null) ? 0 : getOctober().hashCode());
        result = prime * result + ((getNovember() == null) ? 0 : getNovember().hashCode());
        result = prime * result + ((getDecember() == null) ? 0 : getDecember().hashCode());
        result = prime * result + ((getTotalMonth() == null) ? 0 : getTotalMonth().hashCode());
        return result;
    }
}