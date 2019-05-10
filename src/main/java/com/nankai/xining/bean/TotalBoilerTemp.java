package com.nankai.xining.bean;

import java.io.Serializable;
import java.util.Date;

public class TotalBoilerTemp implements Serializable {
    private Integer tboilerId;

    private Integer factoryId;

    private Integer tboilerNum;

    private Double tboilerTons;

    private String tboilerFunctionDec;

    private String tboilerFunction;

    private Double decUseamount;

    private Double novUseamount;

    private Double octUseAmount;

    private Double septUseamount;

    private Double augUseamount;

    private Double julyUseamount;

    private Double juneUseamount;

    private Double mayUseamount;

    private Double aprUseamount;

    private Double marUseamount;

    private Double febUseamount;

    private Double janUseamount;

    private Byte tboilerStatus;

    private Integer chimneyNum;

    private String tboilerFueltypeDec;

    private String tboilerFueltype;

    private Double tboilerFuelausage;

    private String tboilerFuelunit;

    private Date lastChangedTime;

    private Date lastCheckedTime;

    private String note;

    private static final long serialVersionUID = 1L;

    public Integer getTboilerId() {
        return tboilerId;
    }

    public void setTboilerId(Integer tboilerId) {
        this.tboilerId = tboilerId;
    }

    public Integer getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Integer factoryId) {
        this.factoryId = factoryId;
    }

    public Integer getTboilerNum() {
        return tboilerNum;
    }

    public void setTboilerNum(Integer tboilerNum) {
        this.tboilerNum = tboilerNum;
    }

    public Double getTboilerTons() {
        return tboilerTons;
    }

    public void setTboilerTons(Double tboilerTons) {
        this.tboilerTons = tboilerTons;
    }

    public String getTboilerFunctionDec() {
        return tboilerFunctionDec;
    }

    public void setTboilerFunctionDec(String tboilerFunctionDec) {
        this.tboilerFunctionDec = tboilerFunctionDec == null ? null : tboilerFunctionDec.trim();
    }

    public String getTboilerFunction() {
        return tboilerFunction;
    }

    public void setTboilerFunction(String tboilerFunction) {
        this.tboilerFunction = tboilerFunction == null ? null : tboilerFunction.trim();
    }

    public Double getDecUseamount() {
        return decUseamount;
    }

    public void setDecUseamount(Double decUseamount) {
        this.decUseamount = decUseamount;
    }

    public Double getNovUseamount() {
        return novUseamount;
    }

    public void setNovUseamount(Double novUseamount) {
        this.novUseamount = novUseamount;
    }

    public Double getOctUseAmount() {
        return octUseAmount;
    }

    public void setOctUseAmount(Double octUseAmount) {
        this.octUseAmount = octUseAmount;
    }

    public Double getSeptUseamount() {
        return septUseamount;
    }

    public void setSeptUseamount(Double septUseamount) {
        this.septUseamount = septUseamount;
    }

    public Double getAugUseamount() {
        return augUseamount;
    }

    public void setAugUseamount(Double augUseamount) {
        this.augUseamount = augUseamount;
    }

    public Double getJulyUseamount() {
        return julyUseamount;
    }

    public void setJulyUseamount(Double julyUseamount) {
        this.julyUseamount = julyUseamount;
    }

    public Double getJuneUseamount() {
        return juneUseamount;
    }

    public void setJuneUseamount(Double juneUseamount) {
        this.juneUseamount = juneUseamount;
    }

    public Double getMayUseamount() {
        return mayUseamount;
    }

    public void setMayUseamount(Double mayUseamount) {
        this.mayUseamount = mayUseamount;
    }

    public Double getAprUseamount() {
        return aprUseamount;
    }

    public void setAprUseamount(Double aprUseamount) {
        this.aprUseamount = aprUseamount;
    }

    public Double getMarUseamount() {
        return marUseamount;
    }

    public void setMarUseamount(Double marUseamount) {
        this.marUseamount = marUseamount;
    }

    public Double getFebUseamount() {
        return febUseamount;
    }

    public void setFebUseamount(Double febUseamount) {
        this.febUseamount = febUseamount;
    }

    public Double getJanUseamount() {
        return janUseamount;
    }

    public void setJanUseamount(Double janUseamount) {
        this.janUseamount = janUseamount;
    }

    public Byte getTboilerStatus() {
        return tboilerStatus;
    }

    public void setTboilerStatus(Byte tboilerStatus) {
        this.tboilerStatus = tboilerStatus;
    }

    public Integer getChimneyNum() {
        return chimneyNum;
    }

    public void setChimneyNum(Integer chimneyNum) {
        this.chimneyNum = chimneyNum;
    }

    public String getTboilerFueltypeDec() {
        return tboilerFueltypeDec;
    }

    public void setTboilerFueltypeDec(String tboilerFueltypeDec) {
        this.tboilerFueltypeDec = tboilerFueltypeDec == null ? null : tboilerFueltypeDec.trim();
    }

    public String getTboilerFueltype() {
        return tboilerFueltype;
    }

    public void setTboilerFueltype(String tboilerFueltype) {
        this.tboilerFueltype = tboilerFueltype == null ? null : tboilerFueltype.trim();
    }

    public Double getTboilerFuelausage() {
        return tboilerFuelausage;
    }

    public void setTboilerFuelausage(Double tboilerFuelausage) {
        this.tboilerFuelausage = tboilerFuelausage;
    }

    public String getTboilerFuelunit() {
        return tboilerFuelunit;
    }

    public void setTboilerFuelunit(String tboilerFuelunit) {
        this.tboilerFuelunit = tboilerFuelunit == null ? null : tboilerFuelunit.trim();
    }

    public Date getLastChangedTime() {
        return lastChangedTime;
    }

    public void setLastChangedTime(Date lastChangedTime) {
        this.lastChangedTime = lastChangedTime;
    }

    public Date getLastCheckedTime() {
        return lastCheckedTime;
    }

    public void setLastCheckedTime(Date lastCheckedTime) {
        this.lastCheckedTime = lastCheckedTime;
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
        sb.append(", tboilerId=").append(tboilerId);
        sb.append(", factoryId=").append(factoryId);
        sb.append(", tboilerNum=").append(tboilerNum);
        sb.append(", tboilerTons=").append(tboilerTons);
        sb.append(", tboilerFunctionDec=").append(tboilerFunctionDec);
        sb.append(", tboilerFunction=").append(tboilerFunction);
        sb.append(", decUseamount=").append(decUseamount);
        sb.append(", novUseamount=").append(novUseamount);
        sb.append(", octUseAmount=").append(octUseAmount);
        sb.append(", septUseamount=").append(septUseamount);
        sb.append(", augUseamount=").append(augUseamount);
        sb.append(", julyUseamount=").append(julyUseamount);
        sb.append(", juneUseamount=").append(juneUseamount);
        sb.append(", mayUseamount=").append(mayUseamount);
        sb.append(", aprUseamount=").append(aprUseamount);
        sb.append(", marUseamount=").append(marUseamount);
        sb.append(", febUseamount=").append(febUseamount);
        sb.append(", janUseamount=").append(janUseamount);
        sb.append(", tboilerStatus=").append(tboilerStatus);
        sb.append(", chimneyNum=").append(chimneyNum);
        sb.append(", tboilerFueltypeDec=").append(tboilerFueltypeDec);
        sb.append(", tboilerFueltype=").append(tboilerFueltype);
        sb.append(", tboilerFuelausage=").append(tboilerFuelausage);
        sb.append(", tboilerFuelunit=").append(tboilerFuelunit);
        sb.append(", lastChangedTime=").append(lastChangedTime);
        sb.append(", lastCheckedTime=").append(lastCheckedTime);
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
        TotalBoilerTemp other = (TotalBoilerTemp) that;
        return (this.getTboilerId() == null ? other.getTboilerId() == null : this.getTboilerId().equals(other.getTboilerId()))
            && (this.getFactoryId() == null ? other.getFactoryId() == null : this.getFactoryId().equals(other.getFactoryId()))
            && (this.getTboilerNum() == null ? other.getTboilerNum() == null : this.getTboilerNum().equals(other.getTboilerNum()))
            && (this.getTboilerTons() == null ? other.getTboilerTons() == null : this.getTboilerTons().equals(other.getTboilerTons()))
            && (this.getTboilerFunctionDec() == null ? other.getTboilerFunctionDec() == null : this.getTboilerFunctionDec().equals(other.getTboilerFunctionDec()))
            && (this.getTboilerFunction() == null ? other.getTboilerFunction() == null : this.getTboilerFunction().equals(other.getTboilerFunction()))
            && (this.getDecUseamount() == null ? other.getDecUseamount() == null : this.getDecUseamount().equals(other.getDecUseamount()))
            && (this.getNovUseamount() == null ? other.getNovUseamount() == null : this.getNovUseamount().equals(other.getNovUseamount()))
            && (this.getOctUseAmount() == null ? other.getOctUseAmount() == null : this.getOctUseAmount().equals(other.getOctUseAmount()))
            && (this.getSeptUseamount() == null ? other.getSeptUseamount() == null : this.getSeptUseamount().equals(other.getSeptUseamount()))
            && (this.getAugUseamount() == null ? other.getAugUseamount() == null : this.getAugUseamount().equals(other.getAugUseamount()))
            && (this.getJulyUseamount() == null ? other.getJulyUseamount() == null : this.getJulyUseamount().equals(other.getJulyUseamount()))
            && (this.getJuneUseamount() == null ? other.getJuneUseamount() == null : this.getJuneUseamount().equals(other.getJuneUseamount()))
            && (this.getMayUseamount() == null ? other.getMayUseamount() == null : this.getMayUseamount().equals(other.getMayUseamount()))
            && (this.getAprUseamount() == null ? other.getAprUseamount() == null : this.getAprUseamount().equals(other.getAprUseamount()))
            && (this.getMarUseamount() == null ? other.getMarUseamount() == null : this.getMarUseamount().equals(other.getMarUseamount()))
            && (this.getFebUseamount() == null ? other.getFebUseamount() == null : this.getFebUseamount().equals(other.getFebUseamount()))
            && (this.getJanUseamount() == null ? other.getJanUseamount() == null : this.getJanUseamount().equals(other.getJanUseamount()))
            && (this.getTboilerStatus() == null ? other.getTboilerStatus() == null : this.getTboilerStatus().equals(other.getTboilerStatus()))
            && (this.getChimneyNum() == null ? other.getChimneyNum() == null : this.getChimneyNum().equals(other.getChimneyNum()))
            && (this.getTboilerFueltypeDec() == null ? other.getTboilerFueltypeDec() == null : this.getTboilerFueltypeDec().equals(other.getTboilerFueltypeDec()))
            && (this.getTboilerFueltype() == null ? other.getTboilerFueltype() == null : this.getTboilerFueltype().equals(other.getTboilerFueltype()))
            && (this.getTboilerFuelausage() == null ? other.getTboilerFuelausage() == null : this.getTboilerFuelausage().equals(other.getTboilerFuelausage()))
            && (this.getTboilerFuelunit() == null ? other.getTboilerFuelunit() == null : this.getTboilerFuelunit().equals(other.getTboilerFuelunit()))
            && (this.getLastChangedTime() == null ? other.getLastChangedTime() == null : this.getLastChangedTime().equals(other.getLastChangedTime()))
            && (this.getLastCheckedTime() == null ? other.getLastCheckedTime() == null : this.getLastCheckedTime().equals(other.getLastCheckedTime()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTboilerId() == null) ? 0 : getTboilerId().hashCode());
        result = prime * result + ((getFactoryId() == null) ? 0 : getFactoryId().hashCode());
        result = prime * result + ((getTboilerNum() == null) ? 0 : getTboilerNum().hashCode());
        result = prime * result + ((getTboilerTons() == null) ? 0 : getTboilerTons().hashCode());
        result = prime * result + ((getTboilerFunctionDec() == null) ? 0 : getTboilerFunctionDec().hashCode());
        result = prime * result + ((getTboilerFunction() == null) ? 0 : getTboilerFunction().hashCode());
        result = prime * result + ((getDecUseamount() == null) ? 0 : getDecUseamount().hashCode());
        result = prime * result + ((getNovUseamount() == null) ? 0 : getNovUseamount().hashCode());
        result = prime * result + ((getOctUseAmount() == null) ? 0 : getOctUseAmount().hashCode());
        result = prime * result + ((getSeptUseamount() == null) ? 0 : getSeptUseamount().hashCode());
        result = prime * result + ((getAugUseamount() == null) ? 0 : getAugUseamount().hashCode());
        result = prime * result + ((getJulyUseamount() == null) ? 0 : getJulyUseamount().hashCode());
        result = prime * result + ((getJuneUseamount() == null) ? 0 : getJuneUseamount().hashCode());
        result = prime * result + ((getMayUseamount() == null) ? 0 : getMayUseamount().hashCode());
        result = prime * result + ((getAprUseamount() == null) ? 0 : getAprUseamount().hashCode());
        result = prime * result + ((getMarUseamount() == null) ? 0 : getMarUseamount().hashCode());
        result = prime * result + ((getFebUseamount() == null) ? 0 : getFebUseamount().hashCode());
        result = prime * result + ((getJanUseamount() == null) ? 0 : getJanUseamount().hashCode());
        result = prime * result + ((getTboilerStatus() == null) ? 0 : getTboilerStatus().hashCode());
        result = prime * result + ((getChimneyNum() == null) ? 0 : getChimneyNum().hashCode());
        result = prime * result + ((getTboilerFueltypeDec() == null) ? 0 : getTboilerFueltypeDec().hashCode());
        result = prime * result + ((getTboilerFueltype() == null) ? 0 : getTboilerFueltype().hashCode());
        result = prime * result + ((getTboilerFuelausage() == null) ? 0 : getTboilerFuelausage().hashCode());
        result = prime * result + ((getTboilerFuelunit() == null) ? 0 : getTboilerFuelunit().hashCode());
        result = prime * result + ((getLastChangedTime() == null) ? 0 : getLastChangedTime().hashCode());
        result = prime * result + ((getLastCheckedTime() == null) ? 0 : getLastCheckedTime().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        return result;
    }
}