package com.nankai.xining.bean;

import java.io.Serializable;

public class XjcydustLoad implements Serializable {
    private Integer id;

    private Integer loadId;

    private String year;

    private Integer comId;

    private Double materialWater;

    private String materialType;

    private Integer materialLoad;

    private Integer loadNum;

    private String mloadUnit;

    private Double uwindValue;

    private String controlname;

    private String scccode;

    private Double pm25Emission;

    private Double pm10Emission;

    private Double vocEmission;

    private Double nh3Emission;

    private Double so2Emission;

    private Double coEmission;

    private Double ocEmission;

    private Double bcEmission;

    private Double noxEmission;

    private Double pm25Max;

    private Double pm10Max;

    private Double vocMax;

    private Double nh3Max;

    private Double so2Max;

    private Double coMax;

    private Double ocMax;

    private Double bcMax;

    private Double noxMax;

    private String pm25Unit;

    private String pm10Unit;

    private String vocUnit;

    private String nh3Unit;

    private String so2Unit;

    private String coUnit;

    private String ocUnit;

    private String bcUnit;

    private String noxUnit;

    private String sccDescribe;

    private Integer flag;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLoadId() {
        return loadId;
    }

    public void setLoadId(Integer loadId) {
        this.loadId = loadId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public Double getMaterialWater() {
        return materialWater;
    }

    public void setMaterialWater(Double materialWater) {
        this.materialWater = materialWater;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType == null ? null : materialType.trim();
    }

    public Integer getMaterialLoad() {
        return materialLoad;
    }

    public void setMaterialLoad(Integer materialLoad) {
        this.materialLoad = materialLoad;
    }

    public Integer getLoadNum() {
        return loadNum;
    }

    public void setLoadNum(Integer loadNum) {
        this.loadNum = loadNum;
    }

    public String getMloadUnit() {
        return mloadUnit;
    }

    public void setMloadUnit(String mloadUnit) {
        this.mloadUnit = mloadUnit == null ? null : mloadUnit.trim();
    }

    public Double getUwindValue() {
        return uwindValue;
    }

    public void setUwindValue(Double uwindValue) {
        this.uwindValue = uwindValue;
    }

    public String getControlname() {
        return controlname;
    }

    public void setControlname(String controlname) {
        this.controlname = controlname == null ? null : controlname.trim();
    }

    public String getScccode() {
        return scccode;
    }

    public void setScccode(String scccode) {
        this.scccode = scccode == null ? null : scccode.trim();
    }

    public Double getPm25Emission() {
        return pm25Emission;
    }

    public void setPm25Emission(Double pm25Emission) {
        this.pm25Emission = pm25Emission;
    }

    public Double getPm10Emission() {
        return pm10Emission;
    }

    public void setPm10Emission(Double pm10Emission) {
        this.pm10Emission = pm10Emission;
    }

    public Double getVocEmission() {
        return vocEmission;
    }

    public void setVocEmission(Double vocEmission) {
        this.vocEmission = vocEmission;
    }

    public Double getNh3Emission() {
        return nh3Emission;
    }

    public void setNh3Emission(Double nh3Emission) {
        this.nh3Emission = nh3Emission;
    }

    public Double getSo2Emission() {
        return so2Emission;
    }

    public void setSo2Emission(Double so2Emission) {
        this.so2Emission = so2Emission;
    }

    public Double getCoEmission() {
        return coEmission;
    }

    public void setCoEmission(Double coEmission) {
        this.coEmission = coEmission;
    }

    public Double getOcEmission() {
        return ocEmission;
    }

    public void setOcEmission(Double ocEmission) {
        this.ocEmission = ocEmission;
    }

    public Double getBcEmission() {
        return bcEmission;
    }

    public void setBcEmission(Double bcEmission) {
        this.bcEmission = bcEmission;
    }

    public Double getNoxEmission() {
        return noxEmission;
    }

    public void setNoxEmission(Double noxEmission) {
        this.noxEmission = noxEmission;
    }

    public Double getPm25Max() {
        return pm25Max;
    }

    public void setPm25Max(Double pm25Max) {
        this.pm25Max = pm25Max;
    }

    public Double getPm10Max() {
        return pm10Max;
    }

    public void setPm10Max(Double pm10Max) {
        this.pm10Max = pm10Max;
    }

    public Double getVocMax() {
        return vocMax;
    }

    public void setVocMax(Double vocMax) {
        this.vocMax = vocMax;
    }

    public Double getNh3Max() {
        return nh3Max;
    }

    public void setNh3Max(Double nh3Max) {
        this.nh3Max = nh3Max;
    }

    public Double getSo2Max() {
        return so2Max;
    }

    public void setSo2Max(Double so2Max) {
        this.so2Max = so2Max;
    }

    public Double getCoMax() {
        return coMax;
    }

    public void setCoMax(Double coMax) {
        this.coMax = coMax;
    }

    public Double getOcMax() {
        return ocMax;
    }

    public void setOcMax(Double ocMax) {
        this.ocMax = ocMax;
    }

    public Double getBcMax() {
        return bcMax;
    }

    public void setBcMax(Double bcMax) {
        this.bcMax = bcMax;
    }

    public Double getNoxMax() {
        return noxMax;
    }

    public void setNoxMax(Double noxMax) {
        this.noxMax = noxMax;
    }

    public String getPm25Unit() {
        return pm25Unit;
    }

    public void setPm25Unit(String pm25Unit) {
        this.pm25Unit = pm25Unit == null ? null : pm25Unit.trim();
    }

    public String getPm10Unit() {
        return pm10Unit;
    }

    public void setPm10Unit(String pm10Unit) {
        this.pm10Unit = pm10Unit == null ? null : pm10Unit.trim();
    }

    public String getVocUnit() {
        return vocUnit;
    }

    public void setVocUnit(String vocUnit) {
        this.vocUnit = vocUnit == null ? null : vocUnit.trim();
    }

    public String getNh3Unit() {
        return nh3Unit;
    }

    public void setNh3Unit(String nh3Unit) {
        this.nh3Unit = nh3Unit == null ? null : nh3Unit.trim();
    }

    public String getSo2Unit() {
        return so2Unit;
    }

    public void setSo2Unit(String so2Unit) {
        this.so2Unit = so2Unit == null ? null : so2Unit.trim();
    }

    public String getCoUnit() {
        return coUnit;
    }

    public void setCoUnit(String coUnit) {
        this.coUnit = coUnit == null ? null : coUnit.trim();
    }

    public String getOcUnit() {
        return ocUnit;
    }

    public void setOcUnit(String ocUnit) {
        this.ocUnit = ocUnit == null ? null : ocUnit.trim();
    }

    public String getBcUnit() {
        return bcUnit;
    }

    public void setBcUnit(String bcUnit) {
        this.bcUnit = bcUnit == null ? null : bcUnit.trim();
    }

    public String getNoxUnit() {
        return noxUnit;
    }

    public void setNoxUnit(String noxUnit) {
        this.noxUnit = noxUnit == null ? null : noxUnit.trim();
    }

    public String getSccDescribe() {
        return sccDescribe;
    }

    public void setSccDescribe(String sccDescribe) {
        this.sccDescribe = sccDescribe == null ? null : sccDescribe.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", loadId=").append(loadId);
        sb.append(", year=").append(year);
        sb.append(", comId=").append(comId);
        sb.append(", materialWater=").append(materialWater);
        sb.append(", materialType=").append(materialType);
        sb.append(", materialLoad=").append(materialLoad);
        sb.append(", loadNum=").append(loadNum);
        sb.append(", mloadUnit=").append(mloadUnit);
        sb.append(", uwindValue=").append(uwindValue);
        sb.append(", controlname=").append(controlname);
        sb.append(", scccode=").append(scccode);
        sb.append(", pm25Emission=").append(pm25Emission);
        sb.append(", pm10Emission=").append(pm10Emission);
        sb.append(", vocEmission=").append(vocEmission);
        sb.append(", nh3Emission=").append(nh3Emission);
        sb.append(", so2Emission=").append(so2Emission);
        sb.append(", coEmission=").append(coEmission);
        sb.append(", ocEmission=").append(ocEmission);
        sb.append(", bcEmission=").append(bcEmission);
        sb.append(", noxEmission=").append(noxEmission);
        sb.append(", pm25Max=").append(pm25Max);
        sb.append(", pm10Max=").append(pm10Max);
        sb.append(", vocMax=").append(vocMax);
        sb.append(", nh3Max=").append(nh3Max);
        sb.append(", so2Max=").append(so2Max);
        sb.append(", coMax=").append(coMax);
        sb.append(", ocMax=").append(ocMax);
        sb.append(", bcMax=").append(bcMax);
        sb.append(", noxMax=").append(noxMax);
        sb.append(", pm25Unit=").append(pm25Unit);
        sb.append(", pm10Unit=").append(pm10Unit);
        sb.append(", vocUnit=").append(vocUnit);
        sb.append(", nh3Unit=").append(nh3Unit);
        sb.append(", so2Unit=").append(so2Unit);
        sb.append(", coUnit=").append(coUnit);
        sb.append(", ocUnit=").append(ocUnit);
        sb.append(", bcUnit=").append(bcUnit);
        sb.append(", noxUnit=").append(noxUnit);
        sb.append(", sccDescribe=").append(sccDescribe);
        sb.append(", flag=").append(flag);
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
        XjcydustLoad other = (XjcydustLoad) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLoadId() == null ? other.getLoadId() == null : this.getLoadId().equals(other.getLoadId()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getComId() == null ? other.getComId() == null : this.getComId().equals(other.getComId()))
            && (this.getMaterialWater() == null ? other.getMaterialWater() == null : this.getMaterialWater().equals(other.getMaterialWater()))
            && (this.getMaterialType() == null ? other.getMaterialType() == null : this.getMaterialType().equals(other.getMaterialType()))
            && (this.getMaterialLoad() == null ? other.getMaterialLoad() == null : this.getMaterialLoad().equals(other.getMaterialLoad()))
            && (this.getLoadNum() == null ? other.getLoadNum() == null : this.getLoadNum().equals(other.getLoadNum()))
            && (this.getMloadUnit() == null ? other.getMloadUnit() == null : this.getMloadUnit().equals(other.getMloadUnit()))
            && (this.getUwindValue() == null ? other.getUwindValue() == null : this.getUwindValue().equals(other.getUwindValue()))
            && (this.getControlname() == null ? other.getControlname() == null : this.getControlname().equals(other.getControlname()))
            && (this.getScccode() == null ? other.getScccode() == null : this.getScccode().equals(other.getScccode()))
            && (this.getPm25Emission() == null ? other.getPm25Emission() == null : this.getPm25Emission().equals(other.getPm25Emission()))
            && (this.getPm10Emission() == null ? other.getPm10Emission() == null : this.getPm10Emission().equals(other.getPm10Emission()))
            && (this.getVocEmission() == null ? other.getVocEmission() == null : this.getVocEmission().equals(other.getVocEmission()))
            && (this.getNh3Emission() == null ? other.getNh3Emission() == null : this.getNh3Emission().equals(other.getNh3Emission()))
            && (this.getSo2Emission() == null ? other.getSo2Emission() == null : this.getSo2Emission().equals(other.getSo2Emission()))
            && (this.getCoEmission() == null ? other.getCoEmission() == null : this.getCoEmission().equals(other.getCoEmission()))
            && (this.getOcEmission() == null ? other.getOcEmission() == null : this.getOcEmission().equals(other.getOcEmission()))
            && (this.getBcEmission() == null ? other.getBcEmission() == null : this.getBcEmission().equals(other.getBcEmission()))
            && (this.getNoxEmission() == null ? other.getNoxEmission() == null : this.getNoxEmission().equals(other.getNoxEmission()))
            && (this.getPm25Max() == null ? other.getPm25Max() == null : this.getPm25Max().equals(other.getPm25Max()))
            && (this.getPm10Max() == null ? other.getPm10Max() == null : this.getPm10Max().equals(other.getPm10Max()))
            && (this.getVocMax() == null ? other.getVocMax() == null : this.getVocMax().equals(other.getVocMax()))
            && (this.getNh3Max() == null ? other.getNh3Max() == null : this.getNh3Max().equals(other.getNh3Max()))
            && (this.getSo2Max() == null ? other.getSo2Max() == null : this.getSo2Max().equals(other.getSo2Max()))
            && (this.getCoMax() == null ? other.getCoMax() == null : this.getCoMax().equals(other.getCoMax()))
            && (this.getOcMax() == null ? other.getOcMax() == null : this.getOcMax().equals(other.getOcMax()))
            && (this.getBcMax() == null ? other.getBcMax() == null : this.getBcMax().equals(other.getBcMax()))
            && (this.getNoxMax() == null ? other.getNoxMax() == null : this.getNoxMax().equals(other.getNoxMax()))
            && (this.getPm25Unit() == null ? other.getPm25Unit() == null : this.getPm25Unit().equals(other.getPm25Unit()))
            && (this.getPm10Unit() == null ? other.getPm10Unit() == null : this.getPm10Unit().equals(other.getPm10Unit()))
            && (this.getVocUnit() == null ? other.getVocUnit() == null : this.getVocUnit().equals(other.getVocUnit()))
            && (this.getNh3Unit() == null ? other.getNh3Unit() == null : this.getNh3Unit().equals(other.getNh3Unit()))
            && (this.getSo2Unit() == null ? other.getSo2Unit() == null : this.getSo2Unit().equals(other.getSo2Unit()))
            && (this.getCoUnit() == null ? other.getCoUnit() == null : this.getCoUnit().equals(other.getCoUnit()))
            && (this.getOcUnit() == null ? other.getOcUnit() == null : this.getOcUnit().equals(other.getOcUnit()))
            && (this.getBcUnit() == null ? other.getBcUnit() == null : this.getBcUnit().equals(other.getBcUnit()))
            && (this.getNoxUnit() == null ? other.getNoxUnit() == null : this.getNoxUnit().equals(other.getNoxUnit()))
            && (this.getSccDescribe() == null ? other.getSccDescribe() == null : this.getSccDescribe().equals(other.getSccDescribe()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLoadId() == null) ? 0 : getLoadId().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getComId() == null) ? 0 : getComId().hashCode());
        result = prime * result + ((getMaterialWater() == null) ? 0 : getMaterialWater().hashCode());
        result = prime * result + ((getMaterialType() == null) ? 0 : getMaterialType().hashCode());
        result = prime * result + ((getMaterialLoad() == null) ? 0 : getMaterialLoad().hashCode());
        result = prime * result + ((getLoadNum() == null) ? 0 : getLoadNum().hashCode());
        result = prime * result + ((getMloadUnit() == null) ? 0 : getMloadUnit().hashCode());
        result = prime * result + ((getUwindValue() == null) ? 0 : getUwindValue().hashCode());
        result = prime * result + ((getControlname() == null) ? 0 : getControlname().hashCode());
        result = prime * result + ((getScccode() == null) ? 0 : getScccode().hashCode());
        result = prime * result + ((getPm25Emission() == null) ? 0 : getPm25Emission().hashCode());
        result = prime * result + ((getPm10Emission() == null) ? 0 : getPm10Emission().hashCode());
        result = prime * result + ((getVocEmission() == null) ? 0 : getVocEmission().hashCode());
        result = prime * result + ((getNh3Emission() == null) ? 0 : getNh3Emission().hashCode());
        result = prime * result + ((getSo2Emission() == null) ? 0 : getSo2Emission().hashCode());
        result = prime * result + ((getCoEmission() == null) ? 0 : getCoEmission().hashCode());
        result = prime * result + ((getOcEmission() == null) ? 0 : getOcEmission().hashCode());
        result = prime * result + ((getBcEmission() == null) ? 0 : getBcEmission().hashCode());
        result = prime * result + ((getNoxEmission() == null) ? 0 : getNoxEmission().hashCode());
        result = prime * result + ((getPm25Max() == null) ? 0 : getPm25Max().hashCode());
        result = prime * result + ((getPm10Max() == null) ? 0 : getPm10Max().hashCode());
        result = prime * result + ((getVocMax() == null) ? 0 : getVocMax().hashCode());
        result = prime * result + ((getNh3Max() == null) ? 0 : getNh3Max().hashCode());
        result = prime * result + ((getSo2Max() == null) ? 0 : getSo2Max().hashCode());
        result = prime * result + ((getCoMax() == null) ? 0 : getCoMax().hashCode());
        result = prime * result + ((getOcMax() == null) ? 0 : getOcMax().hashCode());
        result = prime * result + ((getBcMax() == null) ? 0 : getBcMax().hashCode());
        result = prime * result + ((getNoxMax() == null) ? 0 : getNoxMax().hashCode());
        result = prime * result + ((getPm25Unit() == null) ? 0 : getPm25Unit().hashCode());
        result = prime * result + ((getPm10Unit() == null) ? 0 : getPm10Unit().hashCode());
        result = prime * result + ((getVocUnit() == null) ? 0 : getVocUnit().hashCode());
        result = prime * result + ((getNh3Unit() == null) ? 0 : getNh3Unit().hashCode());
        result = prime * result + ((getSo2Unit() == null) ? 0 : getSo2Unit().hashCode());
        result = prime * result + ((getCoUnit() == null) ? 0 : getCoUnit().hashCode());
        result = prime * result + ((getOcUnit() == null) ? 0 : getOcUnit().hashCode());
        result = prime * result + ((getBcUnit() == null) ? 0 : getBcUnit().hashCode());
        result = prime * result + ((getNoxUnit() == null) ? 0 : getNoxUnit().hashCode());
        result = prime * result + ((getSccDescribe() == null) ? 0 : getSccDescribe().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        return result;
    }
}