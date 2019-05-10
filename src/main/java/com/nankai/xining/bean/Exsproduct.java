package com.nankai.xining.bean;

import java.io.Serializable;

public class Exsproduct implements Serializable {
    private Integer id;

    private Integer nkNo;

    private String type;

    private String name;

    private String tech;

    private String unit;

    private Double output;

    private Integer exsId;

    private String scccode;

    private Double pm10;

    private Double pm25;

    private Double co;

    private Double voc;

    private Double pm;

    private Double so2;

    private Double nox;

    private Double bc;

    private Double oc;

    private String exfUnit;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech == null ? null : tech.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Double getOutput() {
        return output;
    }

    public void setOutput(Double output) {
        this.output = output;
    }

    public Integer getExsId() {
        return exsId;
    }

    public void setExsId(Integer exsId) {
        this.exsId = exsId;
    }

    public String getScccode() {
        return scccode;
    }

    public void setScccode(String scccode) {
        this.scccode = scccode == null ? null : scccode.trim();
    }

    public Double getPm10() {
        return pm10;
    }

    public void setPm10(Double pm10) {
        this.pm10 = pm10;
    }

    public Double getPm25() {
        return pm25;
    }

    public void setPm25(Double pm25) {
        this.pm25 = pm25;
    }

    public Double getCo() {
        return co;
    }

    public void setCo(Double co) {
        this.co = co;
    }

    public Double getVoc() {
        return voc;
    }

    public void setVoc(Double voc) {
        this.voc = voc;
    }

    public Double getPm() {
        return pm;
    }

    public void setPm(Double pm) {
        this.pm = pm;
    }

    public Double getSo2() {
        return so2;
    }

    public void setSo2(Double so2) {
        this.so2 = so2;
    }

    public Double getNox() {
        return nox;
    }

    public void setNox(Double nox) {
        this.nox = nox;
    }

    public Double getBc() {
        return bc;
    }

    public void setBc(Double bc) {
        this.bc = bc;
    }

    public Double getOc() {
        return oc;
    }

    public void setOc(Double oc) {
        this.oc = oc;
    }

    public String getExfUnit() {
        return exfUnit;
    }

    public void setExfUnit(String exfUnit) {
        this.exfUnit = exfUnit == null ? null : exfUnit.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", nkNo=").append(nkNo);
        sb.append(", type=").append(type);
        sb.append(", name=").append(name);
        sb.append(", tech=").append(tech);
        sb.append(", unit=").append(unit);
        sb.append(", output=").append(output);
        sb.append(", exsId=").append(exsId);
        sb.append(", scccode=").append(scccode);
        sb.append(", pm10=").append(pm10);
        sb.append(", pm25=").append(pm25);
        sb.append(", co=").append(co);
        sb.append(", voc=").append(voc);
        sb.append(", pm=").append(pm);
        sb.append(", so2=").append(so2);
        sb.append(", nox=").append(nox);
        sb.append(", bc=").append(bc);
        sb.append(", oc=").append(oc);
        sb.append(", exfUnit=").append(exfUnit);
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
        Exsproduct other = (Exsproduct) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getNkNo() == null ? other.getNkNo() == null : this.getNkNo().equals(other.getNkNo()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getTech() == null ? other.getTech() == null : this.getTech().equals(other.getTech()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getOutput() == null ? other.getOutput() == null : this.getOutput().equals(other.getOutput()))
            && (this.getExsId() == null ? other.getExsId() == null : this.getExsId().equals(other.getExsId()))
            && (this.getScccode() == null ? other.getScccode() == null : this.getScccode().equals(other.getScccode()))
            && (this.getPm10() == null ? other.getPm10() == null : this.getPm10().equals(other.getPm10()))
            && (this.getPm25() == null ? other.getPm25() == null : this.getPm25().equals(other.getPm25()))
            && (this.getCo() == null ? other.getCo() == null : this.getCo().equals(other.getCo()))
            && (this.getVoc() == null ? other.getVoc() == null : this.getVoc().equals(other.getVoc()))
            && (this.getPm() == null ? other.getPm() == null : this.getPm().equals(other.getPm()))
            && (this.getSo2() == null ? other.getSo2() == null : this.getSo2().equals(other.getSo2()))
            && (this.getNox() == null ? other.getNox() == null : this.getNox().equals(other.getNox()))
            && (this.getBc() == null ? other.getBc() == null : this.getBc().equals(other.getBc()))
            && (this.getOc() == null ? other.getOc() == null : this.getOc().equals(other.getOc()))
            && (this.getExfUnit() == null ? other.getExfUnit() == null : this.getExfUnit().equals(other.getExfUnit()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getNkNo() == null) ? 0 : getNkNo().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getTech() == null) ? 0 : getTech().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getOutput() == null) ? 0 : getOutput().hashCode());
        result = prime * result + ((getExsId() == null) ? 0 : getExsId().hashCode());
        result = prime * result + ((getScccode() == null) ? 0 : getScccode().hashCode());
        result = prime * result + ((getPm10() == null) ? 0 : getPm10().hashCode());
        result = prime * result + ((getPm25() == null) ? 0 : getPm25().hashCode());
        result = prime * result + ((getCo() == null) ? 0 : getCo().hashCode());
        result = prime * result + ((getVoc() == null) ? 0 : getVoc().hashCode());
        result = prime * result + ((getPm() == null) ? 0 : getPm().hashCode());
        result = prime * result + ((getSo2() == null) ? 0 : getSo2().hashCode());
        result = prime * result + ((getNox() == null) ? 0 : getNox().hashCode());
        result = prime * result + ((getBc() == null) ? 0 : getBc().hashCode());
        result = prime * result + ((getOc() == null) ? 0 : getOc().hashCode());
        result = prime * result + ((getExfUnit() == null) ? 0 : getExfUnit().hashCode());
        return result;
    }
}