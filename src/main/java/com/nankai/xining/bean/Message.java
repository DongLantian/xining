package com.nankai.xining.bean;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable {
    private Integer mId;

    private Integer mFrom;

    private Integer mTo;

    private Date mTime;

    private String mContent;

    private static final long serialVersionUID = 1L;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public Integer getmFrom() {
        return mFrom;
    }

    public void setmFrom(Integer mFrom) {
        this.mFrom = mFrom;
    }

    public Integer getmTo() {
        return mTo;
    }

    public void setmTo(Integer mTo) {
        this.mTo = mTo;
    }

    public Date getmTime() {
        return mTime;
    }

    public void setmTime(Date mTime) {
        this.mTime = mTime;
    }

    public String getmContent() {
        return mContent;
    }

    public void setmContent(String mContent) {
        this.mContent = mContent == null ? null : mContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mId=").append(mId);
        sb.append(", mFrom=").append(mFrom);
        sb.append(", mTo=").append(mTo);
        sb.append(", mTime=").append(mTime);
        sb.append(", mContent=").append(mContent);
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
        Message other = (Message) that;
        return (this.getmId() == null ? other.getmId() == null : this.getmId().equals(other.getmId()))
            && (this.getmFrom() == null ? other.getmFrom() == null : this.getmFrom().equals(other.getmFrom()))
            && (this.getmTo() == null ? other.getmTo() == null : this.getmTo().equals(other.getmTo()))
            && (this.getmTime() == null ? other.getmTime() == null : this.getmTime().equals(other.getmTime()))
            && (this.getmContent() == null ? other.getmContent() == null : this.getmContent().equals(other.getmContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getmId() == null) ? 0 : getmId().hashCode());
        result = prime * result + ((getmFrom() == null) ? 0 : getmFrom().hashCode());
        result = prime * result + ((getmTo() == null) ? 0 : getmTo().hashCode());
        result = prime * result + ((getmTime() == null) ? 0 : getmTime().hashCode());
        result = prime * result + ((getmContent() == null) ? 0 : getmContent().hashCode());
        return result;
    }
}