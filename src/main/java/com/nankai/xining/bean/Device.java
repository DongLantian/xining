package com.nankai.xining.bean;

import java.io.Serializable;

public class Device implements Serializable {
    private Integer id;

    private Integer nkNo;

    private Integer exhustId;

    private String name;

    private String deviceFlow;

    private Double designPower;

    private Double practicalPower;

    private Integer yearrunDays;

    private String designUnit;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNkNo() {
        return nkNo;
    }

    public void setNkNo(Integer nkNo) {
        this.nkNo = nkNo;
    }

    public Integer getExhustId() {
        return exhustId;
    }

    public void setExhustId(Integer exhustId) {
        this.exhustId = exhustId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDeviceFlow() {
        return deviceFlow;
    }

    public void setDeviceFlow(String deviceFlow) {
        this.deviceFlow = deviceFlow == null ? null : deviceFlow.trim();
    }

    public Double getDesignPower() {
        return designPower;
    }

    public void setDesignPower(Double designPower) {
        this.designPower = designPower;
    }

    public Double getPracticalPower() {
        return practicalPower;
    }

    public void setPracticalPower(Double practicalPower) {
        this.practicalPower = practicalPower;
    }

    public Integer getYearrunDays() {
        return yearrunDays;
    }

    public void setYearrunDays(Integer yearrunDays) {
        this.yearrunDays = yearrunDays;
    }

    public String getDesignUnit() {
        return designUnit;
    }

    public void setDesignUnit(String designUnit) {
        this.designUnit = designUnit == null ? null : designUnit.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", nkNo=").append(nkNo);
        sb.append(", exhustId=").append(exhustId);
        sb.append(", name=").append(name);
        sb.append(", deviceFlow=").append(deviceFlow);
        sb.append(", designPower=").append(designPower);
        sb.append(", practicalPower=").append(practicalPower);
        sb.append(", yearrunDays=").append(yearrunDays);
        sb.append(", designUnit=").append(designUnit);
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
        Device other = (Device) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getNkNo() == null ? other.getNkNo() == null : this.getNkNo().equals(other.getNkNo()))
            && (this.getExhustId() == null ? other.getExhustId() == null : this.getExhustId().equals(other.getExhustId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDeviceFlow() == null ? other.getDeviceFlow() == null : this.getDeviceFlow().equals(other.getDeviceFlow()))
            && (this.getDesignPower() == null ? other.getDesignPower() == null : this.getDesignPower().equals(other.getDesignPower()))
            && (this.getPracticalPower() == null ? other.getPracticalPower() == null : this.getPracticalPower().equals(other.getPracticalPower()))
            && (this.getYearrunDays() == null ? other.getYearrunDays() == null : this.getYearrunDays().equals(other.getYearrunDays()))
            && (this.getDesignUnit() == null ? other.getDesignUnit() == null : this.getDesignUnit().equals(other.getDesignUnit()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getNkNo() == null) ? 0 : getNkNo().hashCode());
        result = prime * result + ((getExhustId() == null) ? 0 : getExhustId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDeviceFlow() == null) ? 0 : getDeviceFlow().hashCode());
        result = prime * result + ((getDesignPower() == null) ? 0 : getDesignPower().hashCode());
        result = prime * result + ((getPracticalPower() == null) ? 0 : getPracticalPower().hashCode());
        result = prime * result + ((getYearrunDays() == null) ? 0 : getYearrunDays().hashCode());
        result = prime * result + ((getDesignUnit() == null) ? 0 : getDesignUnit().hashCode());
        return result;
    }
}