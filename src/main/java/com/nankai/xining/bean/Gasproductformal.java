package com.nankai.xining.bean;

import java.io.Serializable;

public class Gasproductformal implements Serializable {
    private Integer productid;

    private String productname;

    private String downprocess;

    private Double consumption;

    private Integer factoryId;

    private Integer gassurveyid;

    private static final long serialVersionUID = 1L;

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getDownprocess() {
        return downprocess;
    }

    public void setDownprocess(String downprocess) {
        this.downprocess = downprocess == null ? null : downprocess.trim();
    }

    public Double getConsumption() {
        return consumption;
    }

    public void setConsumption(Double consumption) {
        this.consumption = consumption;
    }

    public Integer getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Integer factoryId) {
        this.factoryId = factoryId;
    }

    public Integer getGassurveyid() {
        return gassurveyid;
    }

    public void setGassurveyid(Integer gassurveyid) {
        this.gassurveyid = gassurveyid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productid=").append(productid);
        sb.append(", productname=").append(productname);
        sb.append(", downprocess=").append(downprocess);
        sb.append(", consumption=").append(consumption);
        sb.append(", factoryId=").append(factoryId);
        sb.append(", gassurveyid=").append(gassurveyid);
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
        Gasproductformal other = (Gasproductformal) that;
        return (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getProductname() == null ? other.getProductname() == null : this.getProductname().equals(other.getProductname()))
            && (this.getDownprocess() == null ? other.getDownprocess() == null : this.getDownprocess().equals(other.getDownprocess()))
            && (this.getConsumption() == null ? other.getConsumption() == null : this.getConsumption().equals(other.getConsumption()))
            && (this.getFactoryId() == null ? other.getFactoryId() == null : this.getFactoryId().equals(other.getFactoryId()))
            && (this.getGassurveyid() == null ? other.getGassurveyid() == null : this.getGassurveyid().equals(other.getGassurveyid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getProductname() == null) ? 0 : getProductname().hashCode());
        result = prime * result + ((getDownprocess() == null) ? 0 : getDownprocess().hashCode());
        result = prime * result + ((getConsumption() == null) ? 0 : getConsumption().hashCode());
        result = prime * result + ((getFactoryId() == null) ? 0 : getFactoryId().hashCode());
        result = prime * result + ((getGassurveyid() == null) ? 0 : getGassurveyid().hashCode());
        return result;
    }
}