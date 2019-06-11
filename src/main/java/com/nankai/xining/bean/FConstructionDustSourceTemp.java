package com.nankai.xining.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class FConstructionDustSourceTemp implements Serializable {
    private Integer constructDustid;

    private String scccode;

    private Integer factoryid;

    private String year;

    private String companyName;

    private String constructState;

    private Double constructArea;

    private String constructMonths;

    private String controlMeasures;

    private Double finisharea;

    private Double nowkgarea;

    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startdate;

    private Double pm25Factors;

    private Double pm10Factors;

    private Double ocFactors;

    private Double bcFactors;

    private Double pm10Emission;

    private Double pm25Emission;

    private Double ocEmission;

    private Double bcEmission;

    private Double longitude1;

    private Double latitude1;

    private Double longitude2;

    private Double latitude2;

    private Double longitude3;

    private Double latitude3;

    private Double longitude4;

    private Double latitude4;

    private String constructionType;

    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date finishdate;

    private String shenheStatus;

    private String note;

    private static final long serialVersionUID = 1L;

    public Integer getConstructDustid() {
        return constructDustid;
    }

    public void setConstructDustid(Integer constructDustid) {
        this.constructDustid = constructDustid;
    }

    public String getScccode() {
        return scccode;
    }

    public void setScccode(String scccode) {
        this.scccode = scccode == null ? null : scccode.trim();
    }

    public Integer getFactoryid() {
        return factoryid;
    }

    public void setFactoryid(Integer factoryid) {
        this.factoryid = factoryid;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getConstructState() {
        return constructState;
    }

    public void setConstructState(String constructState) {
        this.constructState = constructState == null ? null : constructState.trim();
    }

    public Double getConstructArea() {
        return constructArea;
    }

    public void setConstructArea(Double constructArea) {
        this.constructArea = constructArea;
    }

    public String getConstructMonths() {
        return constructMonths;
    }

    public void setConstructMonths(String constructMonths) {
        this.constructMonths = constructMonths == null ? null : constructMonths.trim();
    }

    public String getControlMeasures() {
        return controlMeasures;
    }

    public void setControlMeasures(String controlMeasures) {
        this.controlMeasures = controlMeasures == null ? null : controlMeasures.trim();
    }

    public Double getFinisharea() {
        return finisharea;
    }

    public void setFinisharea(Double finisharea) {
        this.finisharea = finisharea;
    }

    public Double getNowkgarea() {
        return nowkgarea;
    }

    public void setNowkgarea(Double nowkgarea) {
        this.nowkgarea = nowkgarea;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Double getPm25Factors() {
        return pm25Factors;
    }

    public void setPm25Factors(Double pm25Factors) {
        this.pm25Factors = pm25Factors;
    }

    public Double getPm10Factors() {
        return pm10Factors;
    }

    public void setPm10Factors(Double pm10Factors) {
        this.pm10Factors = pm10Factors;
    }

    public Double getOcFactors() {
        return ocFactors;
    }

    public void setOcFactors(Double ocFactors) {
        this.ocFactors = ocFactors;
    }

    public Double getBcFactors() {
        return bcFactors;
    }

    public void setBcFactors(Double bcFactors) {
        this.bcFactors = bcFactors;
    }

    public Double getPm10Emission() {
        return pm10Emission;
    }

    public void setPm10Emission(Double pm10Emission) {
        this.pm10Emission = pm10Emission;
    }

    public Double getPm25Emission() {
        return pm25Emission;
    }

    public void setPm25Emission(Double pm25Emission) {
        this.pm25Emission = pm25Emission;
    }

    public Double getOcEmission() {
        return ocEmission;
    }

    public void setOcEmission(Double ocEmission) {
        this.ocEmission = ocEmission;
    }

    public Double getBcEmission() {
        return bcEmission;
    }

    public void setBcEmission(Double bcEmission) {
        this.bcEmission = bcEmission;
    }

    public Double getLongitude1() {
        return longitude1;
    }

    public void setLongitude1(Double longitude1) {
        this.longitude1 = longitude1;
    }

    public Double getLatitude1() {
        return latitude1;
    }

    public void setLatitude1(Double latitude1) {
        this.latitude1 = latitude1;
    }

    public Double getLongitude2() {
        return longitude2;
    }

    public void setLongitude2(Double longitude2) {
        this.longitude2 = longitude2;
    }

    public Double getLatitude2() {
        return latitude2;
    }

    public void setLatitude2(Double latitude2) {
        this.latitude2 = latitude2;
    }

    public Double getLongitude3() {
        return longitude3;
    }

    public void setLongitude3(Double longitude3) {
        this.longitude3 = longitude3;
    }

    public Double getLatitude3() {
        return latitude3;
    }

    public void setLatitude3(Double latitude3) {
        this.latitude3 = latitude3;
    }

    public Double getLongitude4() {
        return longitude4;
    }

    public void setLongitude4(Double longitude4) {
        this.longitude4 = longitude4;
    }

    public Double getLatitude4() {
        return latitude4;
    }

    public void setLatitude4(Double latitude4) {
        this.latitude4 = latitude4;
    }

    public String getConstructionType() {
        return constructionType;
    }

    public void setConstructionType(String constructionType) {
        this.constructionType = constructionType == null ? null : constructionType.trim();
    }

    public Date getFinishdate() {
        return finishdate;
    }

    public void setFinishdate(Date finishdate) {
        this.finishdate = finishdate;
    }

    public String getShenheStatus() {
        return shenheStatus;
    }

    public void setShenheStatus(String shenheStatus) {
        this.shenheStatus = shenheStatus == null ? null : shenheStatus.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", constructDustid=").append(constructDustid);
        sb.append(", scccode=").append(scccode);
        sb.append(", factoryid=").append(factoryid);
        sb.append(", year=").append(year);
        sb.append(", companyName=").append(companyName);
        sb.append(", constructState=").append(constructState);
        sb.append(", constructArea=").append(constructArea);
        sb.append(", constructMonths=").append(constructMonths);
        sb.append(", controlMeasures=").append(controlMeasures);
        sb.append(", finisharea=").append(finisharea);
        sb.append(", nowkgarea=").append(nowkgarea);
        sb.append(", startdate=").append(startdate);
        sb.append(", pm25Factors=").append(pm25Factors);
        sb.append(", pm10Factors=").append(pm10Factors);
        sb.append(", ocFactors=").append(ocFactors);
        sb.append(", bcFactors=").append(bcFactors);
        sb.append(", pm10Emission=").append(pm10Emission);
        sb.append(", pm25Emission=").append(pm25Emission);
        sb.append(", ocEmission=").append(ocEmission);
        sb.append(", bcEmission=").append(bcEmission);
        sb.append(", longitude1=").append(longitude1);
        sb.append(", latitude1=").append(latitude1);
        sb.append(", longitude2=").append(longitude2);
        sb.append(", latitude2=").append(latitude2);
        sb.append(", longitude3=").append(longitude3);
        sb.append(", latitude3=").append(latitude3);
        sb.append(", longitude4=").append(longitude4);
        sb.append(", latitude4=").append(latitude4);
        sb.append(", constructionType=").append(constructionType);
        sb.append(", finishdate=").append(finishdate);
        sb.append(", shenheStatus=").append(shenheStatus);
        sb.append(", note=").append(note);
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
        FConstructionDustSourceTemp other = (FConstructionDustSourceTemp) that;
        return (this.getConstructDustid() == null ? other.getConstructDustid() == null : this.getConstructDustid().equals(other.getConstructDustid()))
            && (this.getScccode() == null ? other.getScccode() == null : this.getScccode().equals(other.getScccode()))
            && (this.getFactoryid() == null ? other.getFactoryid() == null : this.getFactoryid().equals(other.getFactoryid()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getCompanyName() == null ? other.getCompanyName() == null : this.getCompanyName().equals(other.getCompanyName()))
            && (this.getConstructState() == null ? other.getConstructState() == null : this.getConstructState().equals(other.getConstructState()))
            && (this.getConstructArea() == null ? other.getConstructArea() == null : this.getConstructArea().equals(other.getConstructArea()))
            && (this.getConstructMonths() == null ? other.getConstructMonths() == null : this.getConstructMonths().equals(other.getConstructMonths()))
            && (this.getControlMeasures() == null ? other.getControlMeasures() == null : this.getControlMeasures().equals(other.getControlMeasures()))
            && (this.getFinisharea() == null ? other.getFinisharea() == null : this.getFinisharea().equals(other.getFinisharea()))
            && (this.getNowkgarea() == null ? other.getNowkgarea() == null : this.getNowkgarea().equals(other.getNowkgarea()))
            && (this.getStartdate() == null ? other.getStartdate() == null : this.getStartdate().equals(other.getStartdate()))
            && (this.getPm25Factors() == null ? other.getPm25Factors() == null : this.getPm25Factors().equals(other.getPm25Factors()))
            && (this.getPm10Factors() == null ? other.getPm10Factors() == null : this.getPm10Factors().equals(other.getPm10Factors()))
            && (this.getOcFactors() == null ? other.getOcFactors() == null : this.getOcFactors().equals(other.getOcFactors()))
            && (this.getBcFactors() == null ? other.getBcFactors() == null : this.getBcFactors().equals(other.getBcFactors()))
            && (this.getPm10Emission() == null ? other.getPm10Emission() == null : this.getPm10Emission().equals(other.getPm10Emission()))
            && (this.getPm25Emission() == null ? other.getPm25Emission() == null : this.getPm25Emission().equals(other.getPm25Emission()))
            && (this.getOcEmission() == null ? other.getOcEmission() == null : this.getOcEmission().equals(other.getOcEmission()))
            && (this.getBcEmission() == null ? other.getBcEmission() == null : this.getBcEmission().equals(other.getBcEmission()))
            && (this.getLongitude1() == null ? other.getLongitude1() == null : this.getLongitude1().equals(other.getLongitude1()))
            && (this.getLatitude1() == null ? other.getLatitude1() == null : this.getLatitude1().equals(other.getLatitude1()))
            && (this.getLongitude2() == null ? other.getLongitude2() == null : this.getLongitude2().equals(other.getLongitude2()))
            && (this.getLatitude2() == null ? other.getLatitude2() == null : this.getLatitude2().equals(other.getLatitude2()))
            && (this.getLongitude3() == null ? other.getLongitude3() == null : this.getLongitude3().equals(other.getLongitude3()))
            && (this.getLatitude3() == null ? other.getLatitude3() == null : this.getLatitude3().equals(other.getLatitude3()))
            && (this.getLongitude4() == null ? other.getLongitude4() == null : this.getLongitude4().equals(other.getLongitude4()))
            && (this.getLatitude4() == null ? other.getLatitude4() == null : this.getLatitude4().equals(other.getLatitude4()))
            && (this.getConstructionType() == null ? other.getConstructionType() == null : this.getConstructionType().equals(other.getConstructionType()))
            && (this.getFinishdate() == null ? other.getFinishdate() == null : this.getFinishdate().equals(other.getFinishdate()))
            && (this.getShenheStatus() == null ? other.getShenheStatus() == null : this.getShenheStatus().equals(other.getShenheStatus()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getConstructDustid() == null) ? 0 : getConstructDustid().hashCode());
        result = prime * result + ((getScccode() == null) ? 0 : getScccode().hashCode());
        result = prime * result + ((getFactoryid() == null) ? 0 : getFactoryid().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getCompanyName() == null) ? 0 : getCompanyName().hashCode());
        result = prime * result + ((getConstructState() == null) ? 0 : getConstructState().hashCode());
        result = prime * result + ((getConstructArea() == null) ? 0 : getConstructArea().hashCode());
        result = prime * result + ((getConstructMonths() == null) ? 0 : getConstructMonths().hashCode());
        result = prime * result + ((getControlMeasures() == null) ? 0 : getControlMeasures().hashCode());
        result = prime * result + ((getFinisharea() == null) ? 0 : getFinisharea().hashCode());
        result = prime * result + ((getNowkgarea() == null) ? 0 : getNowkgarea().hashCode());
        result = prime * result + ((getStartdate() == null) ? 0 : getStartdate().hashCode());
        result = prime * result + ((getPm25Factors() == null) ? 0 : getPm25Factors().hashCode());
        result = prime * result + ((getPm10Factors() == null) ? 0 : getPm10Factors().hashCode());
        result = prime * result + ((getOcFactors() == null) ? 0 : getOcFactors().hashCode());
        result = prime * result + ((getBcFactors() == null) ? 0 : getBcFactors().hashCode());
        result = prime * result + ((getPm10Emission() == null) ? 0 : getPm10Emission().hashCode());
        result = prime * result + ((getPm25Emission() == null) ? 0 : getPm25Emission().hashCode());
        result = prime * result + ((getOcEmission() == null) ? 0 : getOcEmission().hashCode());
        result = prime * result + ((getBcEmission() == null) ? 0 : getBcEmission().hashCode());
        result = prime * result + ((getLongitude1() == null) ? 0 : getLongitude1().hashCode());
        result = prime * result + ((getLatitude1() == null) ? 0 : getLatitude1().hashCode());
        result = prime * result + ((getLongitude2() == null) ? 0 : getLongitude2().hashCode());
        result = prime * result + ((getLatitude2() == null) ? 0 : getLatitude2().hashCode());
        result = prime * result + ((getLongitude3() == null) ? 0 : getLongitude3().hashCode());
        result = prime * result + ((getLatitude3() == null) ? 0 : getLatitude3().hashCode());
        result = prime * result + ((getLongitude4() == null) ? 0 : getLongitude4().hashCode());
        result = prime * result + ((getLatitude4() == null) ? 0 : getLatitude4().hashCode());
        result = prime * result + ((getConstructionType() == null) ? 0 : getConstructionType().hashCode());
        result = prime * result + ((getFinishdate() == null) ? 0 : getFinishdate().hashCode());
        result = prime * result + ((getShenheStatus() == null) ? 0 : getShenheStatus().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        return result;
    }
}