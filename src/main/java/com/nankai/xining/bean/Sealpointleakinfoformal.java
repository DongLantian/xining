package com.nankai.xining.bean;

import java.io.Serializable;

public class Sealpointleakinfoformal implements Serializable {
    private Integer leakid;

    private Integer sealpointsurveyid;

    private String unittype;

    private Integer guanlianrate;

    private Double rate;

    private Double runhour;

    private Integer controltech;

    private Double efficiency;

    private Double capcity;

    private Integer factoryId;

    private Integer status;

    private String type;

    private Integer leaknum;

    private static final long serialVersionUID = 1L;

    public Integer getLeakid() {
        return leakid;
    }

    public void setLeakid(Integer leakid) {
        this.leakid = leakid;
    }

    public Integer getSealpointsurveyid() {
        return sealpointsurveyid;
    }

    public void setSealpointsurveyid(Integer sealpointsurveyid) {
        this.sealpointsurveyid = sealpointsurveyid;
    }

    public String getUnittype() {
        return unittype;
    }

    public void setUnittype(String unittype) {
        this.unittype = unittype == null ? null : unittype.trim();
    }

    public Integer getGuanlianrate() {
        return guanlianrate;
    }

    public void setGuanlianrate(Integer guanlianrate) {
        this.guanlianrate = guanlianrate;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getRunhour() {
        return runhour;
    }

    public void setRunhour(Double runhour) {
        this.runhour = runhour;
    }

    public Integer getControltech() {
        return controltech;
    }

    public void setControltech(Integer controltech) {
        this.controltech = controltech;
    }

    public Double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(Double efficiency) {
        this.efficiency = efficiency;
    }

    public Double getCapcity() {
        return capcity;
    }

    public void setCapcity(Double capcity) {
        this.capcity = capcity;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getLeaknum() {
        return leaknum;
    }

    public void setLeaknum(Integer leaknum) {
        this.leaknum = leaknum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", leakid=").append(leakid);
        sb.append(", sealpointsurveyid=").append(sealpointsurveyid);
        sb.append(", unittype=").append(unittype);
        sb.append(", guanlianrate=").append(guanlianrate);
        sb.append(", rate=").append(rate);
        sb.append(", runhour=").append(runhour);
        sb.append(", controltech=").append(controltech);
        sb.append(", efficiency=").append(efficiency);
        sb.append(", capcity=").append(capcity);
        sb.append(", factoryId=").append(factoryId);
        sb.append(", status=").append(status);
        sb.append(", type=").append(type);
        sb.append(", leaknum=").append(leaknum);
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
        Sealpointleakinfoformal other = (Sealpointleakinfoformal) that;
        return (this.getLeakid() == null ? other.getLeakid() == null : this.getLeakid().equals(other.getLeakid()))
            && (this.getSealpointsurveyid() == null ? other.getSealpointsurveyid() == null : this.getSealpointsurveyid().equals(other.getSealpointsurveyid()))
            && (this.getUnittype() == null ? other.getUnittype() == null : this.getUnittype().equals(other.getUnittype()))
            && (this.getGuanlianrate() == null ? other.getGuanlianrate() == null : this.getGuanlianrate().equals(other.getGuanlianrate()))
            && (this.getRate() == null ? other.getRate() == null : this.getRate().equals(other.getRate()))
            && (this.getRunhour() == null ? other.getRunhour() == null : this.getRunhour().equals(other.getRunhour()))
            && (this.getControltech() == null ? other.getControltech() == null : this.getControltech().equals(other.getControltech()))
            && (this.getEfficiency() == null ? other.getEfficiency() == null : this.getEfficiency().equals(other.getEfficiency()))
            && (this.getCapcity() == null ? other.getCapcity() == null : this.getCapcity().equals(other.getCapcity()))
            && (this.getFactoryId() == null ? other.getFactoryId() == null : this.getFactoryId().equals(other.getFactoryId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getLeaknum() == null ? other.getLeaknum() == null : this.getLeaknum().equals(other.getLeaknum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLeakid() == null) ? 0 : getLeakid().hashCode());
        result = prime * result + ((getSealpointsurveyid() == null) ? 0 : getSealpointsurveyid().hashCode());
        result = prime * result + ((getUnittype() == null) ? 0 : getUnittype().hashCode());
        result = prime * result + ((getGuanlianrate() == null) ? 0 : getGuanlianrate().hashCode());
        result = prime * result + ((getRate() == null) ? 0 : getRate().hashCode());
        result = prime * result + ((getRunhour() == null) ? 0 : getRunhour().hashCode());
        result = prime * result + ((getControltech() == null) ? 0 : getControltech().hashCode());
        result = prime * result + ((getEfficiency() == null) ? 0 : getEfficiency().hashCode());
        result = prime * result + ((getCapcity() == null) ? 0 : getCapcity().hashCode());
        result = prime * result + ((getFactoryId() == null) ? 0 : getFactoryId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getLeaknum() == null) ? 0 : getLeaknum().hashCode());
        return result;
    }
}