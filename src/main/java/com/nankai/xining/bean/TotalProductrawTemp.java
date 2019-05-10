package com.nankai.xining.bean;

import java.io.Serializable;

public class TotalProductrawTemp implements Serializable {
    private Integer id;

    private Integer deviceNum;

    private Integer productNum;

    private Integer rawNum;

    private Integer factoryId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeviceNum() {
        return deviceNum;
    }

    public void setDeviceNum(Integer deviceNum) {
        this.deviceNum = deviceNum;
    }

    public Integer getProductNum() {
        return productNum;
    }

    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    public Integer getRawNum() {
        return rawNum;
    }

    public void setRawNum(Integer rawNum) {
        this.rawNum = rawNum;
    }

    public Integer getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Integer factoryId) {
        this.factoryId = factoryId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", deviceNum=").append(deviceNum);
        sb.append(", productNum=").append(productNum);
        sb.append(", rawNum=").append(rawNum);
        sb.append(", factoryId=").append(factoryId);
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
        TotalProductrawTemp other = (TotalProductrawTemp) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDeviceNum() == null ? other.getDeviceNum() == null : this.getDeviceNum().equals(other.getDeviceNum()))
            && (this.getProductNum() == null ? other.getProductNum() == null : this.getProductNum().equals(other.getProductNum()))
            && (this.getRawNum() == null ? other.getRawNum() == null : this.getRawNum().equals(other.getRawNum()))
            && (this.getFactoryId() == null ? other.getFactoryId() == null : this.getFactoryId().equals(other.getFactoryId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDeviceNum() == null) ? 0 : getDeviceNum().hashCode());
        result = prime * result + ((getProductNum() == null) ? 0 : getProductNum().hashCode());
        result = prime * result + ((getRawNum() == null) ? 0 : getRawNum().hashCode());
        result = prime * result + ((getFactoryId() == null) ? 0 : getFactoryId().hashCode());
        return result;
    }
}