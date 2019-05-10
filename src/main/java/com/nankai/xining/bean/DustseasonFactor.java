package com.nankai.xining.bean;

import java.io.Serializable;

public class DustseasonFactor implements Serializable {
    private Integer dsId;

    private String year;

    private String season;

    private Double soilindex;

    private Double surindex;

    private Double noindex;

    private Double pindex;

    private Double dirtratio;

    private Double waterratio;

    private Double load;

    private String pathtype;

    private Boolean ispave;

    private Double windThreshold;

    private Double uwindValue;

    private Integer mWindnum;

    private Byte dusttype;

    private static final long serialVersionUID = 1L;

    public Integer getDsId() {
        return dsId;
    }

    public void setDsId(Integer dsId) {
        this.dsId = dsId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season == null ? null : season.trim();
    }

    public Double getSoilindex() {
        return soilindex;
    }

    public void setSoilindex(Double soilindex) {
        this.soilindex = soilindex;
    }

    public Double getSurindex() {
        return surindex;
    }

    public void setSurindex(Double surindex) {
        this.surindex = surindex;
    }

    public Double getNoindex() {
        return noindex;
    }

    public void setNoindex(Double noindex) {
        this.noindex = noindex;
    }

    public Double getPindex() {
        return pindex;
    }

    public void setPindex(Double pindex) {
        this.pindex = pindex;
    }

    public Double getDirtratio() {
        return dirtratio;
    }

    public void setDirtratio(Double dirtratio) {
        this.dirtratio = dirtratio;
    }

    public Double getWaterratio() {
        return waterratio;
    }

    public void setWaterratio(Double waterratio) {
        this.waterratio = waterratio;
    }

    public Double getLoad() {
        return load;
    }

    public void setLoad(Double load) {
        this.load = load;
    }

    public String getPathtype() {
        return pathtype;
    }

    public void setPathtype(String pathtype) {
        this.pathtype = pathtype == null ? null : pathtype.trim();
    }

    public Boolean getIspave() {
        return ispave;
    }

    public void setIspave(Boolean ispave) {
        this.ispave = ispave;
    }

    public Double getWindThreshold() {
        return windThreshold;
    }

    public void setWindThreshold(Double windThreshold) {
        this.windThreshold = windThreshold;
    }

    public Double getUwindValue() {
        return uwindValue;
    }

    public void setUwindValue(Double uwindValue) {
        this.uwindValue = uwindValue;
    }

    public Integer getmWindnum() {
        return mWindnum;
    }

    public void setmWindnum(Integer mWindnum) {
        this.mWindnum = mWindnum;
    }

    public Byte getDusttype() {
        return dusttype;
    }

    public void setDusttype(Byte dusttype) {
        this.dusttype = dusttype;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dsId=").append(dsId);
        sb.append(", year=").append(year);
        sb.append(", season=").append(season);
        sb.append(", soilindex=").append(soilindex);
        sb.append(", surindex=").append(surindex);
        sb.append(", noindex=").append(noindex);
        sb.append(", pindex=").append(pindex);
        sb.append(", dirtratio=").append(dirtratio);
        sb.append(", waterratio=").append(waterratio);
        sb.append(", load=").append(load);
        sb.append(", pathtype=").append(pathtype);
        sb.append(", ispave=").append(ispave);
        sb.append(", windThreshold=").append(windThreshold);
        sb.append(", uwindValue=").append(uwindValue);
        sb.append(", mWindnum=").append(mWindnum);
        sb.append(", dusttype=").append(dusttype);
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
        DustseasonFactor other = (DustseasonFactor) that;
        return (this.getDsId() == null ? other.getDsId() == null : this.getDsId().equals(other.getDsId()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getSeason() == null ? other.getSeason() == null : this.getSeason().equals(other.getSeason()))
            && (this.getSoilindex() == null ? other.getSoilindex() == null : this.getSoilindex().equals(other.getSoilindex()))
            && (this.getSurindex() == null ? other.getSurindex() == null : this.getSurindex().equals(other.getSurindex()))
            && (this.getNoindex() == null ? other.getNoindex() == null : this.getNoindex().equals(other.getNoindex()))
            && (this.getPindex() == null ? other.getPindex() == null : this.getPindex().equals(other.getPindex()))
            && (this.getDirtratio() == null ? other.getDirtratio() == null : this.getDirtratio().equals(other.getDirtratio()))
            && (this.getWaterratio() == null ? other.getWaterratio() == null : this.getWaterratio().equals(other.getWaterratio()))
            && (this.getLoad() == null ? other.getLoad() == null : this.getLoad().equals(other.getLoad()))
            && (this.getPathtype() == null ? other.getPathtype() == null : this.getPathtype().equals(other.getPathtype()))
            && (this.getIspave() == null ? other.getIspave() == null : this.getIspave().equals(other.getIspave()))
            && (this.getWindThreshold() == null ? other.getWindThreshold() == null : this.getWindThreshold().equals(other.getWindThreshold()))
            && (this.getUwindValue() == null ? other.getUwindValue() == null : this.getUwindValue().equals(other.getUwindValue()))
            && (this.getmWindnum() == null ? other.getmWindnum() == null : this.getmWindnum().equals(other.getmWindnum()))
            && (this.getDusttype() == null ? other.getDusttype() == null : this.getDusttype().equals(other.getDusttype()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDsId() == null) ? 0 : getDsId().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getSeason() == null) ? 0 : getSeason().hashCode());
        result = prime * result + ((getSoilindex() == null) ? 0 : getSoilindex().hashCode());
        result = prime * result + ((getSurindex() == null) ? 0 : getSurindex().hashCode());
        result = prime * result + ((getNoindex() == null) ? 0 : getNoindex().hashCode());
        result = prime * result + ((getPindex() == null) ? 0 : getPindex().hashCode());
        result = prime * result + ((getDirtratio() == null) ? 0 : getDirtratio().hashCode());
        result = prime * result + ((getWaterratio() == null) ? 0 : getWaterratio().hashCode());
        result = prime * result + ((getLoad() == null) ? 0 : getLoad().hashCode());
        result = prime * result + ((getPathtype() == null) ? 0 : getPathtype().hashCode());
        result = prime * result + ((getIspave() == null) ? 0 : getIspave().hashCode());
        result = prime * result + ((getWindThreshold() == null) ? 0 : getWindThreshold().hashCode());
        result = prime * result + ((getUwindValue() == null) ? 0 : getUwindValue().hashCode());
        result = prime * result + ((getmWindnum() == null) ? 0 : getmWindnum().hashCode());
        result = prime * result + ((getDusttype() == null) ? 0 : getDusttype().hashCode());
        return result;
    }
}