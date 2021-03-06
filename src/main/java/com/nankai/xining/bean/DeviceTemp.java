package com.nankai.xining.bean;

import java.io.Serializable;

public class DeviceTemp implements Serializable {
    private Integer id;

    private Integer nkNo;

    private Integer productrawtotalId;

    private String name;

    private String deviceNo;

    private String deviceFlow;

    private Double designPower;

    private Double practicalPower;

    private Integer exhustId;

    private Integer exhustNo;

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

    public Integer getProductrawtotalId() {
        return productrawtotalId;
    }

    public void setProductrawtotalId(Integer productrawtotalId) {
        this.productrawtotalId = productrawtotalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo == null ? null : deviceNo.trim();
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

    public Integer getExhustId() {
        return exhustId;
    }

    public void setExhustId(Integer exhustId) {
        this.exhustId = exhustId;
    }

    public Integer getExhustNo() {
        return exhustNo;
    }

    public void setExhustNo(Integer exhustNo) {
        this.exhustNo = exhustNo;
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
        sb.append(", productrawtotalId=").append(productrawtotalId);
        sb.append(", name=").append(name);
        sb.append(", deviceNo=").append(deviceNo);
        sb.append(", deviceFlow=").append(deviceFlow);
        sb.append(", designPower=").append(designPower);
        sb.append(", practicalPower=").append(practicalPower);
        sb.append(", exhustId=").append(exhustId);
        sb.append(", exhustNo=").append(exhustNo);
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
        DeviceTemp other = (DeviceTemp) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getNkNo() == null ? other.getNkNo() == null : this.getNkNo().equals(other.getNkNo()))
            && (this.getProductrawtotalId() == null ? other.getProductrawtotalId() == null : this.getProductrawtotalId().equals(other.getProductrawtotalId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDeviceNo() == null ? other.getDeviceNo() == null : this.getDeviceNo().equals(other.getDeviceNo()))
            && (this.getDeviceFlow() == null ? other.getDeviceFlow() == null : this.getDeviceFlow().equals(other.getDeviceFlow()))
            && (this.getDesignPower() == null ? other.getDesignPower() == null : this.getDesignPower().equals(other.getDesignPower()))
            && (this.getPracticalPower() == null ? other.getPracticalPower() == null : this.getPracticalPower().equals(other.getPracticalPower()))
            && (this.getExhustId() == null ? other.getExhustId() == null : this.getExhustId().equals(other.getExhustId()))
            && (this.getExhustNo() == null ? other.getExhustNo() == null : this.getExhustNo().equals(other.getExhustNo()))
            && (this.getYearrunDays() == null ? other.getYearrunDays() == null : this.getYearrunDays().equals(other.getYearrunDays()))
            && (this.getDesignUnit() == null ? other.getDesignUnit() == null : this.getDesignUnit().equals(other.getDesignUnit()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getNkNo() == null) ? 0 : getNkNo().hashCode());
        result = prime * result + ((getProductrawtotalId() == null) ? 0 : getProductrawtotalId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDeviceNo() == null) ? 0 : getDeviceNo().hashCode());
        result = prime * result + ((getDeviceFlow() == null) ? 0 : getDeviceFlow().hashCode());
        result = prime * result + ((getDesignPower() == null) ? 0 : getDesignPower().hashCode());
        result = prime * result + ((getPracticalPower() == null) ? 0 : getPracticalPower().hashCode());
        result = prime * result + ((getExhustId() == null) ? 0 : getExhustId().hashCode());
        result = prime * result + ((getExhustNo() == null) ? 0 : getExhustNo().hashCode());
        result = prime * result + ((getYearrunDays() == null) ? 0 : getYearrunDays().hashCode());
        result = prime * result + ((getDesignUnit() == null) ? 0 : getDesignUnit().hashCode());
        return result;
    }
}