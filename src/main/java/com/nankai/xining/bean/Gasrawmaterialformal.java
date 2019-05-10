package com.nankai.xining.bean;

import java.io.Serializable;

public class Gasrawmaterialformal implements Serializable {
    private Integer materialid;

    private String materialname;

    private String process;

    private Double rawproduction;

    private Integer factoryId;

    private Integer gassurveyid;

    private static final long serialVersionUID = 1L;

    public Integer getMaterialid() {
        return materialid;
    }

    public void setMaterialid(Integer materialid) {
        this.materialid = materialid;
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

    public Double getRawproduction() {
        return rawproduction;
    }

    public void setRawproduction(Double rawproduction) {
        this.rawproduction = rawproduction;
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
        sb.append(", materialid=").append(materialid);
        sb.append(", materialname=").append(materialname);
        sb.append(", process=").append(process);
        sb.append(", rawproduction=").append(rawproduction);
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
        Gasrawmaterialformal other = (Gasrawmaterialformal) that;
        return (this.getMaterialid() == null ? other.getMaterialid() == null : this.getMaterialid().equals(other.getMaterialid()))
            && (this.getMaterialname() == null ? other.getMaterialname() == null : this.getMaterialname().equals(other.getMaterialname()))
            && (this.getProcess() == null ? other.getProcess() == null : this.getProcess().equals(other.getProcess()))
            && (this.getRawproduction() == null ? other.getRawproduction() == null : this.getRawproduction().equals(other.getRawproduction()))
            && (this.getFactoryId() == null ? other.getFactoryId() == null : this.getFactoryId().equals(other.getFactoryId()))
            && (this.getGassurveyid() == null ? other.getGassurveyid() == null : this.getGassurveyid().equals(other.getGassurveyid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMaterialid() == null) ? 0 : getMaterialid().hashCode());
        result = prime * result + ((getMaterialname() == null) ? 0 : getMaterialname().hashCode());
        result = prime * result + ((getProcess() == null) ? 0 : getProcess().hashCode());
        result = prime * result + ((getRawproduction() == null) ? 0 : getRawproduction().hashCode());
        result = prime * result + ((getFactoryId() == null) ? 0 : getFactoryId().hashCode());
        result = prime * result + ((getGassurveyid() == null) ? 0 : getGassurveyid().hashCode());
        return result;
    }
}