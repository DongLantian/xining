package com.nankai.xining.bean;

import java.io.Serializable;

public class Xjdustcon implements Serializable {
    private Integer dustcontrlId;

    private String controlname;

    private Integer object;

    private Double dcTspeffi;

    private Double dcPm25effi;

    private Double dcPm10effi;

    private Double dcVoceffi;

    private Double dcNh3effi;

    private Double dcSo2effi;

    private Double dcCoeffi;

    private Double dcOceffi;

    private Double dcBceffi;

    private Double dcNoxeffi;

    private Integer dusttype;

    private String dustconNote;

    private static final long serialVersionUID = 1L;

    public Integer getDustcontrlId() {
        return dustcontrlId;
    }

    public void setDustcontrlId(Integer dustcontrlId) {
        this.dustcontrlId = dustcontrlId;
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

    public Double getDcVoceffi() {
        return dcVoceffi;
    }

    public void setDcVoceffi(Double dcVoceffi) {
        this.dcVoceffi = dcVoceffi;
    }

    public Double getDcNh3effi() {
        return dcNh3effi;
    }

    public void setDcNh3effi(Double dcNh3effi) {
        this.dcNh3effi = dcNh3effi;
    }

    public Double getDcSo2effi() {
        return dcSo2effi;
    }

    public void setDcSo2effi(Double dcSo2effi) {
        this.dcSo2effi = dcSo2effi;
    }

    public Double getDcCoeffi() {
        return dcCoeffi;
    }

    public void setDcCoeffi(Double dcCoeffi) {
        this.dcCoeffi = dcCoeffi;
    }

    public Double getDcOceffi() {
        return dcOceffi;
    }

    public void setDcOceffi(Double dcOceffi) {
        this.dcOceffi = dcOceffi;
    }

    public Double getDcBceffi() {
        return dcBceffi;
    }

    public void setDcBceffi(Double dcBceffi) {
        this.dcBceffi = dcBceffi;
    }

    public Double getDcNoxeffi() {
        return dcNoxeffi;
    }

    public void setDcNoxeffi(Double dcNoxeffi) {
        this.dcNoxeffi = dcNoxeffi;
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
        sb.append(", dustcontrlId=").append(dustcontrlId);
        sb.append(", controlname=").append(controlname);
        sb.append(", object=").append(object);
        sb.append(", dcTspeffi=").append(dcTspeffi);
        sb.append(", dcPm25effi=").append(dcPm25effi);
        sb.append(", dcPm10effi=").append(dcPm10effi);
        sb.append(", dcVoceffi=").append(dcVoceffi);
        sb.append(", dcNh3effi=").append(dcNh3effi);
        sb.append(", dcSo2effi=").append(dcSo2effi);
        sb.append(", dcCoeffi=").append(dcCoeffi);
        sb.append(", dcOceffi=").append(dcOceffi);
        sb.append(", dcBceffi=").append(dcBceffi);
        sb.append(", dcNoxeffi=").append(dcNoxeffi);
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
        Xjdustcon other = (Xjdustcon) that;
        return (this.getDustcontrlId() == null ? other.getDustcontrlId() == null : this.getDustcontrlId().equals(other.getDustcontrlId()))
            && (this.getControlname() == null ? other.getControlname() == null : this.getControlname().equals(other.getControlname()))
            && (this.getObject() == null ? other.getObject() == null : this.getObject().equals(other.getObject()))
            && (this.getDcTspeffi() == null ? other.getDcTspeffi() == null : this.getDcTspeffi().equals(other.getDcTspeffi()))
            && (this.getDcPm25effi() == null ? other.getDcPm25effi() == null : this.getDcPm25effi().equals(other.getDcPm25effi()))
            && (this.getDcPm10effi() == null ? other.getDcPm10effi() == null : this.getDcPm10effi().equals(other.getDcPm10effi()))
            && (this.getDcVoceffi() == null ? other.getDcVoceffi() == null : this.getDcVoceffi().equals(other.getDcVoceffi()))
            && (this.getDcNh3effi() == null ? other.getDcNh3effi() == null : this.getDcNh3effi().equals(other.getDcNh3effi()))
            && (this.getDcSo2effi() == null ? other.getDcSo2effi() == null : this.getDcSo2effi().equals(other.getDcSo2effi()))
            && (this.getDcCoeffi() == null ? other.getDcCoeffi() == null : this.getDcCoeffi().equals(other.getDcCoeffi()))
            && (this.getDcOceffi() == null ? other.getDcOceffi() == null : this.getDcOceffi().equals(other.getDcOceffi()))
            && (this.getDcBceffi() == null ? other.getDcBceffi() == null : this.getDcBceffi().equals(other.getDcBceffi()))
            && (this.getDcNoxeffi() == null ? other.getDcNoxeffi() == null : this.getDcNoxeffi().equals(other.getDcNoxeffi()))
            && (this.getDusttype() == null ? other.getDusttype() == null : this.getDusttype().equals(other.getDusttype()))
            && (this.getDustconNote() == null ? other.getDustconNote() == null : this.getDustconNote().equals(other.getDustconNote()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDustcontrlId() == null) ? 0 : getDustcontrlId().hashCode());
        result = prime * result + ((getControlname() == null) ? 0 : getControlname().hashCode());
        result = prime * result + ((getObject() == null) ? 0 : getObject().hashCode());
        result = prime * result + ((getDcTspeffi() == null) ? 0 : getDcTspeffi().hashCode());
        result = prime * result + ((getDcPm25effi() == null) ? 0 : getDcPm25effi().hashCode());
        result = prime * result + ((getDcPm10effi() == null) ? 0 : getDcPm10effi().hashCode());
        result = prime * result + ((getDcVoceffi() == null) ? 0 : getDcVoceffi().hashCode());
        result = prime * result + ((getDcNh3effi() == null) ? 0 : getDcNh3effi().hashCode());
        result = prime * result + ((getDcSo2effi() == null) ? 0 : getDcSo2effi().hashCode());
        result = prime * result + ((getDcCoeffi() == null) ? 0 : getDcCoeffi().hashCode());
        result = prime * result + ((getDcOceffi() == null) ? 0 : getDcOceffi().hashCode());
        result = prime * result + ((getDcBceffi() == null) ? 0 : getDcBceffi().hashCode());
        result = prime * result + ((getDcNoxeffi() == null) ? 0 : getDcNoxeffi().hashCode());
        result = prime * result + ((getDusttype() == null) ? 0 : getDusttype().hashCode());
        result = prime * result + ((getDustconNote() == null) ? 0 : getDustconNote().hashCode());
        return result;
    }
}