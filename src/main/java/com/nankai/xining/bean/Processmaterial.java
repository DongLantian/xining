package com.nankai.xining.bean;

import java.io.Serializable;

public class Processmaterial implements Serializable {
    private Integer processmaterialId;

    private String name;

    private Double dosage;

    private String unit;

    private Integer processId;

    private static final long serialVersionUID = 1L;

    public Integer getProcessmaterialId() {
        return processmaterialId;
    }

    public void setProcessmaterialId(Integer processmaterialId) {
        this.processmaterialId = processmaterialId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getDosage() {
        return dosage;
    }

    public void setDosage(Double dosage) {
        this.dosage = dosage;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Integer getProcessId() {
        return processId;
    }

    public void setProcessId(Integer processId) {
        this.processId = processId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", processmaterialId=").append(processmaterialId);
        sb.append(", name=").append(name);
        sb.append(", dosage=").append(dosage);
        sb.append(", unit=").append(unit);
        sb.append(", processId=").append(processId);
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
        Processmaterial other = (Processmaterial) that;
        return (this.getProcessmaterialId() == null ? other.getProcessmaterialId() == null : this.getProcessmaterialId().equals(other.getProcessmaterialId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDosage() == null ? other.getDosage() == null : this.getDosage().equals(other.getDosage()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getProcessId() == null ? other.getProcessId() == null : this.getProcessId().equals(other.getProcessId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProcessmaterialId() == null) ? 0 : getProcessmaterialId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDosage() == null) ? 0 : getDosage().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getProcessId() == null) ? 0 : getProcessId().hashCode());
        return result;
    }
}