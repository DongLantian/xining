package com.nankai.xining.bean;

import java.io.Serializable;
import java.util.Date;

public class YearHelp implements Serializable {
    private Integer id;

    private String oldYear;

    private String curYear;

    private Date starttime;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOldYear() {
        return oldYear;
    }

    public void setOldYear(String oldYear) {
        this.oldYear = oldYear == null ? null : oldYear.trim();
    }

    public String getCurYear() {
        return curYear;
    }

    public void setCurYear(String curYear) {
        this.curYear = curYear == null ? null : curYear.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", oldYear=").append(oldYear);
        sb.append(", curYear=").append(curYear);
        sb.append(", starttime=").append(starttime);
        sb.append(", status=").append(status);
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
        YearHelp other = (YearHelp) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOldYear() == null ? other.getOldYear() == null : this.getOldYear().equals(other.getOldYear()))
            && (this.getCurYear() == null ? other.getCurYear() == null : this.getCurYear().equals(other.getCurYear()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOldYear() == null) ? 0 : getOldYear().hashCode());
        result = prime * result + ((getCurYear() == null) ? 0 : getCurYear().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}