package com.nankai.xining.bean;

import java.io.Serializable;

public class ActivityW implements Serializable {
    private Integer weekId;

    private Integer monday;

    private Integer tuesday;

    private Integer wednesday;

    private Integer thursday;

    private Integer friday;

    private Integer saturday;

    private Integer sunday;

    private Integer totalWeek;

    private static final long serialVersionUID = 1L;

    public Integer getWeekId() {
        return weekId;
    }

    public void setWeekId(Integer weekId) {
        this.weekId = weekId;
    }

    public Integer getMonday() {
        return monday;
    }

    public void setMonday(Integer monday) {
        this.monday = monday;
    }

    public Integer getTuesday() {
        return tuesday;
    }

    public void setTuesday(Integer tuesday) {
        this.tuesday = tuesday;
    }

    public Integer getWednesday() {
        return wednesday;
    }

    public void setWednesday(Integer wednesday) {
        this.wednesday = wednesday;
    }

    public Integer getThursday() {
        return thursday;
    }

    public void setThursday(Integer thursday) {
        this.thursday = thursday;
    }

    public Integer getFriday() {
        return friday;
    }

    public void setFriday(Integer friday) {
        this.friday = friday;
    }

    public Integer getSaturday() {
        return saturday;
    }

    public void setSaturday(Integer saturday) {
        this.saturday = saturday;
    }

    public Integer getSunday() {
        return sunday;
    }

    public void setSunday(Integer sunday) {
        this.sunday = sunday;
    }

    public Integer getTotalWeek() {
        return totalWeek;
    }

    public void setTotalWeek(Integer totalWeek) {
        this.totalWeek = totalWeek;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", weekId=").append(weekId);
        sb.append(", monday=").append(monday);
        sb.append(", tuesday=").append(tuesday);
        sb.append(", wednesday=").append(wednesday);
        sb.append(", thursday=").append(thursday);
        sb.append(", friday=").append(friday);
        sb.append(", saturday=").append(saturday);
        sb.append(", sunday=").append(sunday);
        sb.append(", totalWeek=").append(totalWeek);
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
        ActivityW other = (ActivityW) that;
        return (this.getWeekId() == null ? other.getWeekId() == null : this.getWeekId().equals(other.getWeekId()))
            && (this.getMonday() == null ? other.getMonday() == null : this.getMonday().equals(other.getMonday()))
            && (this.getTuesday() == null ? other.getTuesday() == null : this.getTuesday().equals(other.getTuesday()))
            && (this.getWednesday() == null ? other.getWednesday() == null : this.getWednesday().equals(other.getWednesday()))
            && (this.getThursday() == null ? other.getThursday() == null : this.getThursday().equals(other.getThursday()))
            && (this.getFriday() == null ? other.getFriday() == null : this.getFriday().equals(other.getFriday()))
            && (this.getSaturday() == null ? other.getSaturday() == null : this.getSaturday().equals(other.getSaturday()))
            && (this.getSunday() == null ? other.getSunday() == null : this.getSunday().equals(other.getSunday()))
            && (this.getTotalWeek() == null ? other.getTotalWeek() == null : this.getTotalWeek().equals(other.getTotalWeek()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWeekId() == null) ? 0 : getWeekId().hashCode());
        result = prime * result + ((getMonday() == null) ? 0 : getMonday().hashCode());
        result = prime * result + ((getTuesday() == null) ? 0 : getTuesday().hashCode());
        result = prime * result + ((getWednesday() == null) ? 0 : getWednesday().hashCode());
        result = prime * result + ((getThursday() == null) ? 0 : getThursday().hashCode());
        result = prime * result + ((getFriday() == null) ? 0 : getFriday().hashCode());
        result = prime * result + ((getSaturday() == null) ? 0 : getSaturday().hashCode());
        result = prime * result + ((getSunday() == null) ? 0 : getSunday().hashCode());
        result = prime * result + ((getTotalWeek() == null) ? 0 : getTotalWeek().hashCode());
        return result;
    }
}