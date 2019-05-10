package com.nankai.xining.bean;

import java.io.Serializable;

public class Dustcon implements Serializable {
    private Integer dcId;

    private String controlname;

    private Integer object;

    private Double dcTspeffi;

    private Double dcPm25effi;

    private Double dcPm10effi;

    private Integer dusttype;

    private String dustconNote;

    private static final long serialVersionUID = 1L;

    public Integer getDcId() {
        return dcId;
    }

    public void setDcId(Integer dcId) {
        this.dcId = dcId;
    }

    public String getControlname() {
        return controlname;
    }

    public void setControlname(String controlname) {
        this.controlname = controlname == null ? null : controlname.trim();
    }

    public Integer getObject() {
        return object;
    }

    public void setObject(Integer object) {
        this.object = object;
    }

    public Double getDcTspeffi() {
        return dcTspeffi;
    }

    public void setDcTspeffi(Double dcTspeffi) {
        this.dcTspeffi = dcTspeffi;
    }

    public Double getDcPm25effi() {
        return dcPm25effi;
    }

    public void setDcPm25effi(Double dcPm25effi) {
        this.dcPm25effi = dcPm25effi;
    }

    public Double getDcPm10effi() {
        return dcPm10effi;
    }

    public void setDcPm10effi(Double dcPm10effi) {
        this.dcPm10effi = dcPm10effi;
    }

    public Integer getDusttype() {
        return dusttype;
    }

    public void setDusttype(Integer dusttype) {
        this.dusttype = dusttype;
    }

    public String getDustconNote() {
        return dustconNote;
    }

    public void setDustconNote(String dustconNote) {
        this.dustconNote = dustconNote == null ? null : dustconNote.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dcId=").append(dcId);
        sb.append(", controlname=").append(controlname);
        sb.append(", object=").append(object);
        sb.append(", dcTspeffi=").append(dcTspeffi);
        sb.append(", dcPm25effi=").append(dcPm25effi);
        sb.append(", dcPm10effi=").append(dcPm10effi);
        sb.append(", dusttype=").append(dusttype);
        sb.append(", dustconNote=").append(dustconNote);
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
        Dustcon other = (Dustcon) that;
        return (this.getDcId() == null ? other.getDcId() == null : this.getDcId().equals(other.getDcId()))
            && (this.getControlname() == null ? other.getControlname() == null : this.getControlname().equals(other.getControlname()))
            && (this.getObject() == null ? other.getObject() == null : this.getObject().equals(other.getObject()))
            && (this.getDcTspeffi() == null ? other.getDcTspeffi() == null : this.getDcTspeffi().equals(other.getDcTspeffi()))
            && (this.getDcPm25effi() == null ? other.getDcPm25effi() == null : this.getDcPm25effi().equals(other.getDcPm25effi()))
            && (this.getDcPm10effi() == null ? other.getDcPm10effi() == null : this.getDcPm10effi().equals(other.getDcPm10effi()))
            && (this.getDusttype() == null ? other.getDusttype() == null : this.getDusttype().equals(other.getDusttype()))
            && (this.getDustconNote() == null ? other.getDustconNote() == null : this.getDustconNote().equals(other.getDustconNote()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDcId() == null) ? 0 : getDcId().hashCode());
        result = prime * result + ((getControlname() == null) ? 0 : getControlname().hashCode());
        result = prime * result + ((getObject() == null) ? 0 : getObject().hashCode());
        result = prime * result + ((getDcTspeffi() == null) ? 0 : getDcTspeffi().hashCode());
        result = prime * result + ((getDcPm25effi() == null) ? 0 : getDcPm25effi().hashCode());
        result = prime * result + ((getDcPm10effi() == null) ? 0 : getDcPm10effi().hashCode());
        result = prime * result + ((getDusttype() == null) ? 0 : getDusttype().hashCode());
        result = prime * result + ((getDustconNote() == null) ? 0 : getDustconNote().hashCode());
        return result;
    }
}