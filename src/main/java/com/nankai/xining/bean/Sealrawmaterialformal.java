package com.nankai.xining.bean;

import java.io.Serializable;

public class Sealrawmaterialformal implements Serializable {
    private Integer materialid;

    private Integer sealpointsurveyid;

    private String materialname;

    private String process;

    private Double consumption;

    private Integer factoryId;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getMaterialid() {
        return materialid;
    }

    public void setMaterialid(Integer materialid) {
        this.materialid = materialid;
    }

    public Integer getSealpointsurveyid() {
        return sealpointsurveyid;
    }

    public void setSealpointsurveyid(Integer sealpointsurveyid) {
        this.sealpointsurveyid = sealpointsurveyid;
    }

    public String getMaterialname() {
        return materialname;
    }

    public void setMaterialname(String materialname) {
        this.materialname = materialname == null ? null : materialname.trim();
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process == null ? null : process.trim();
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
        sb.append(", materialid=").append(materialid);
        sb.append(", sealpointsurveyid=").append(sealpointsurveyid);
        sb.append(", materialname=").append(materialname);
        sb.append(", process=").append(process);
        sb.append(", consumption=").append(consumption);
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
        Sealrawmaterialformal other = (Sealrawmaterialformal) that;
        return (this.getMaterialid() == null ? other.getMaterialid() == null : this.getMaterialid().equals(other.getMaterialid()))
            && (this.getSealpointsurveyid() == null ? other.getSealpointsurveyid() == null : this.getSealpointsurveyid().equals(other.getSealpointsurveyid()))
            && (this.getMaterialname() == null ? other.getMaterialname() == null : this.getMaterialname().equals(other.getMaterialname()))
            && (this.getProcess() == null ? other.getProcess() == null : this.getProcess().equals(other.getProcess()))
            && (this.getConsumption() == null ? other.getConsumption() == null : this.getConsumption().equals(other.getConsumption()))
            && (this.getFactoryId() == null ? other.getFactoryId() == null : this.getFactoryId().equals(other.getFactoryId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMaterialid() == null) ? 0 : getMaterialid().hashCode());
        result = prime * result + ((getSealpointsurveyid() == null) ? 0 : getSealpointsurveyid().hashCode());
        result = prime * result + ((getMaterialname() == null) ? 0 : getMaterialname().hashCode());
        result = prime * result + ((getProcess() == null) ? 0 : getProcess().hashCode());
        result = prime * result + ((getConsumption() == null) ? 0 : getConsumption().hashCode());
        result = prime * result + ((getFactoryId() == null) ? 0 : getFactoryId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}