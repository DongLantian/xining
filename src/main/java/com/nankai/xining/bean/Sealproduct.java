package com.nankai.xining.bean;

import java.io.Serializable;

public class Sealproduct implements Serializable {
    private Integer productid;

    private Integer sealpointsurveyid;

    private String productname;

    private String downprocess;

    private Double production;

    private Integer factoryId;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getSealpointsurveyid() {
        return sealpointsurveyid;
    }

    public void setSealpointsurveyid(Integer sealpointsurveyid) {
        this.sealpointsurveyid = sealpointsurveyid;
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

    public Double getProduction() {
        return production;
    }

    public void setProduction(Double production) {
        this.production = production;
    }

    public Integer getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Integer factoryId) {
        this.factoryId = factoryId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productid=").append(productid);
        sb.append(", sealpointsurveyid=").append(sealpointsurveyid);
        sb.append(", productname=").append(productname);
        sb.append(", downprocess=").append(downprocess);
        sb.append(", production=").append(production);
        sb.append(", factoryId=").append(factoryId);
        sb.append(", status=").append(status);
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
        Sealproduct other = (Sealproduct) that;
        return (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getSealpointsurveyid() == null ? other.getSealpointsurveyid() == null : this.getSealpointsurveyid().equals(other.getSealpointsurveyid()))
            && (this.getProductname() == null ? other.getProductname() == null : this.getProductname().equals(other.getProductname()))
            && (this.getDownprocess() == null ? other.getDownprocess() == null : this.getDownprocess().equals(other.getDownprocess()))
            && (this.getProduction() == null ? other.getProduction() == null : this.getProduction().equals(other.getProduction()))
            && (this.getFactoryId() == null ? other.getFactoryId() == null : this.getFactoryId().equals(other.getFactoryId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getSealpointsurveyid() == null) ? 0 : getSealpointsurveyid().hashCode());
        result = prime * result + ((getProductname() == null) ? 0 : getProductname().hashCode());
        result = prime * result + ((getDownprocess() == null) ? 0 : getDownprocess().hashCode());
        result = prime * result + ((getProduction() == null) ? 0 : getProduction().hashCode());
        result = prime * result + ((getFactoryId() == null) ? 0 : getFactoryId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}