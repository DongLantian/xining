package com.nankai.xining.bean;

import java.io.Serializable;

public class TotalKiln implements Serializable {
    private Integer fkilntotalId;

    private Integer factoryId;

    private String fuelType;

    private Integer fkilnNum;

    private String fkilnUnit;

    private Double fkilnUsage;

    private String fkilnUsefulDec;

    private String fkilnUseful;

    private Double janUseamount;

    private Double febUseamount;

    private Double marUseamount;

    private Double aprUseamount;

    private Double mayUseamount;

    private Double juneUseamount;

    private Double julyUseamount;

    private Double augUseamount;

    private Double septUseamount;

    private Double octUseAmount;

    private Double novUseamount;

    private Double decUseamount;

    private String note;

    private static final long serialVersionUID = 1L;

    public Integer getFkilntotalId() {
        return fkilntotalId;
    }

    public void setFkilntotalId(Integer fkilntotalId) {
        this.fkilntotalId = fkilntotalId;
    }

    public Integer getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Integer factoryId) {
        this.factoryId = factoryId;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType == null ? null : fuelType.trim();
    }

    public Integer getFkilnNum() {
        return fkilnNum;
    }

    public void setFkilnNum(Integer fkilnNum) {
        this.fkilnNum = fkilnNum;
    }

    public String getFkilnUnit() {
        return fkilnUnit;
    }

    public void setFkilnUnit(String fkilnUnit) {
        this.fkilnUnit = fkilnUnit == null ? null : fkilnUnit.trim();
    }

    public Double getFkilnUsage() {
        return fkilnUsage;
    }

    public void setFkilnUsage(Double fkilnUsage) {
        this.fkilnUsage = fkilnUsage;
    }

    public String getFkilnUsefulDec() {
        return fkilnUsefulDec;
    }

    public void setFkilnUsefulDec(String fkilnUsefulDec) {
        this.fkilnUsefulDec = fkilnUsefulDec == null ? null : fkilnUsefulDec.trim();
    }

    public String getFkilnUseful() {
        return fkilnUseful;
    }

    public void setFkilnUseful(String fkilnUseful) {
        this.fkilnUseful = fkilnUseful == null ? null : fkilnUseful.trim();
    }

    public Double getJanUseamount() {
        return janUseamount;
    }

    public void setJanUseamount(Double janUseamount) {
        this.janUseamount = janUseamount;
    }

    public Double getFebUseamount() {
        return febUseamount;
    }

    public void setFebUseamount(Double febUseamount) {
        this.febUseamount = febUseamount;
    }

    public Double getMarUseamount() {
        return marUseamount;
    }

    public void setMarUseamount(Double marUseamount) {
        this.marUseamount = marUseamount;
    }

    public Double getAprUseamount() {
        return aprUseamount;
    }

    public void setAprUseamount(Double aprUseamount) {
        this.aprUseamount = aprUseamount;
    }

    public Double getMayUseamount() {
        return mayUseamount;
    }

    public void setMayUseamount(Double mayUseamount) {
        this.mayUseamount = mayUseamount;
    }

    public Double getJuneUseamount() {
        return juneUseamount;
    }

    public void setJuneUseamount(Double juneUseamount) {
        this.juneUseamount = juneUseamount;
    }

    public Double getJulyUseamount() {
        return julyUseamount;
    }

    public void setJulyUseamount(Double julyUseamount) {
        this.julyUseamount = julyUseamount;
    }

    public Double getAugUseamount() {
        return augUseamount;
    }

    public void setAugUseamount(Double augUseamount) {
        this.augUseamount = augUseamount;
    }

    public Double getSeptUseamount() {
        return septUseamount;
    }

    public void setSeptUseamount(Double septUseamount) {
        this.septUseamount = septUseamount;
    }

    public Double getOctUseAmount() {
        return octUseAmount;
    }

    public void setOctUseAmount(Double octUseAmount) {
        this.octUseAmount = octUseAmount;
    }

    public Double getNovUseamount() {
        return novUseamount;
    }

    public void setNovUseamount(Double novUseamount) {
        this.novUseamount = novUseamount;
    }

    public Double getDecUseamount() {
        return decUseamount;
    }

    public void setDecUseamount(Double decUseamount) {
        this.decUseamount = decUseamount;
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
        sb.append(", fkilntotalId=").append(fkilntotalId);
        sb.append(", factoryId=").append(factoryId);
        sb.append(", fuelType=").append(fuelType);
        sb.append(", fkilnNum=").append(fkilnNum);
        sb.append(", fkilnUnit=").append(fkilnUnit);
        sb.append(", fkilnUsage=").append(fkilnUsage);
        sb.append(", fkilnUsefulDec=").append(fkilnUsefulDec);
        sb.append(", fkilnUseful=").append(fkilnUseful);
        sb.append(", janUseamount=").append(janUseamount);
        sb.append(", febUseamount=").append(febUseamount);
        sb.append(", marUseamount=").append(marUseamount);
        sb.append(", aprUseamount=").append(aprUseamount);
        sb.append(", mayUseamount=").append(mayUseamount);
        sb.append(", juneUseamount=").append(juneUseamount);
        sb.append(", julyUseamount=").append(julyUseamount);
        sb.append(", augUseamount=").append(augUseamount);
        sb.append(", septUseamount=").append(septUseamount);
        sb.append(", octUseAmount=").append(octUseAmount);
        sb.append(", novUseamount=").append(novUseamount);
        sb.append(", decUseamount=").append(decUseamount);
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
        TotalKiln other = (TotalKiln) that;
        return (this.getFkilntotalId() == null ? other.getFkilntotalId() == null : this.getFkilntotalId().equals(other.getFkilntotalId()))
            && (this.getFactoryId() == null ? other.getFactoryId() == null : this.getFactoryId().equals(other.getFactoryId()))
            && (this.getFuelType() == null ? other.getFuelType() == null : this.getFuelType().equals(other.getFuelType()))
            && (this.getFkilnNum() == null ? other.getFkilnNum() == null : this.getFkilnNum().equals(other.getFkilnNum()))
            && (this.getFkilnUnit() == null ? other.getFkilnUnit() == null : this.getFkilnUnit().equals(other.getFkilnUnit()))
            && (this.getFkilnUsage() == null ? other.getFkilnUsage() == null : this.getFkilnUsage().equals(other.getFkilnUsage()))
            && (this.getFkilnUsefulDec() == null ? other.getFkilnUsefulDec() == null : this.getFkilnUsefulDec().equals(other.getFkilnUsefulDec()))
            && (this.getFkilnUseful() == null ? other.getFkilnUseful() == null : this.getFkilnUseful().equals(other.getFkilnUseful()))
            && (this.getJanUseamount() == null ? other.getJanUseamount() == null : this.getJanUseamount().equals(other.getJanUseamount()))
            && (this.getFebUseamount() == null ? other.getFebUseamount() == null : this.getFebUseamount().equals(other.getFebUseamount()))
            && (this.getMarUseamount() == null ? other.getMarUseamount() == null : this.getMarUseamount().equals(other.getMarUseamount()))
            && (this.getAprUseamount() == null ? other.getAprUseamount() == null : this.getAprUseamount().equals(other.getAprUseamount()))
            && (this.getMayUseamount() == null ? other.getMayUseamount() == null : this.getMayUseamount().equals(other.getMayUseamount()))
            && (this.getJuneUseamount() == null ? other.getJuneUseamount() == null : this.getJuneUseamount().equals(other.getJuneUseamount()))
            && (this.getJulyUseamount() == null ? other.getJulyUseamount() == null : this.getJulyUseamount().equals(other.getJulyUseamount()))
            && (this.getAugUseamount() == null ? other.getAugUseamount() == null : this.getAugUseamount().equals(other.getAugUseamount()))
            && (this.getSeptUseamount() == null ? other.getSeptUseamount() == null : this.getSeptUseamount().equals(other.getSeptUseamount()))
            && (this.getOctUseAmount() == null ? other.getOctUseAmount() == null : this.getOctUseAmount().equals(other.getOctUseAmount()))
            && (this.getNovUseamount() == null ? other.getNovUseamount() == null : this.getNovUseamount().equals(other.getNovUseamount()))
            && (this.getDecUseamount() == null ? other.getDecUseamount() == null : this.getDecUseamount().equals(other.getDecUseamount()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFkilntotalId() == null) ? 0 : getFkilntotalId().hashCode());
        result = prime * result + ((getFactoryId() == null) ? 0 : getFactoryId().hashCode());
        result = prime * result + ((getFuelType() == null) ? 0 : getFuelType().hashCode());
        result = prime * result + ((getFkilnNum() == null) ? 0 : getFkilnNum().hashCode());
        result = prime * result + ((getFkilnUnit() == null) ? 0 : getFkilnUnit().hashCode());
        result = prime * result + ((getFkilnUsage() == null) ? 0 : getFkilnUsage().hashCode());
        result = prime * result + ((getFkilnUsefulDec() == null) ? 0 : getFkilnUsefulDec().hashCode());
        result = prime * result + ((getFkilnUseful() == null) ? 0 : getFkilnUseful().hashCode());
        result = prime * result + ((getJanUseamount() == null) ? 0 : getJanUseamount().hashCode());
        result = prime * result + ((getFebUseamount() == null) ? 0 : getFebUseamount().hashCode());
        result = prime * result + ((getMarUseamount() == null) ? 0 : getMarUseamount().hashCode());
        result = prime * result + ((getAprUseamount() == null) ? 0 : getAprUseamount().hashCode());
        result = prime * result + ((getMayUseamount() == null) ? 0 : getMayUseamount().hashCode());
        result = prime * result + ((getJuneUseamount() == null) ? 0 : getJuneUseamount().hashCode());
        result = prime * result + ((getJulyUseamount() == null) ? 0 : getJulyUseamount().hashCode());
        result = prime * result + ((getAugUseamount() == null) ? 0 : getAugUseamount().hashCode());
        result = prime * result + ((getSeptUseamount() == null) ? 0 : getSeptUseamount().hashCode());
        result = prime * result + ((getOctUseAmount() == null) ? 0 : getOctUseAmount().hashCode());
        result = prime * result + ((getNovUseamount() == null) ? 0 : getNovUseamount().hashCode());
        result = prime * result + ((getDecUseamount() == null) ? 0 : getDecUseamount().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        return result;
    }
}