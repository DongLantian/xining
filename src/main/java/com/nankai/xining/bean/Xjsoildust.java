package com.nankai.xining.bean;

import java.io.Serializable;

public class Xjsoildust implements Serializable {
    private Integer sdId;

    private String scccode;

    private String countyId;

    private String sdYear;

    private String sdTakemeasures;

    private String sdUtype;

    private String sdSoiltype;

    private Double sdArea;

    private Double soilindexpm25;

    private Double soilindexpm10;

    private Double surindex;

    private Double noindex;

    private Double pindex;

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

    private String sccDescribe;

    private Integer flag;

    private static final long serialVersionUID = 1L;

    public Integer getSdId() {
        return sdId;
    }

    public void setSdId(Integer sdId) {
        this.sdId = sdId;
    }

    public String getScccode() {
        return scccode;
    }

    public void setScccode(String scccode) {
        this.scccode = scccode == null ? null : scccode.trim();
    }

    public String getCountyId() {
        return countyId;
    }

    public void setCountyId(String countyId) {
        this.countyId = countyId == null ? null : countyId.trim();
    }

    public String getSdYear() {
        return sdYear;
    }

    public void setSdYear(String sdYear) {
        this.sdYear = sdYear == null ? null : sdYear.trim();
    }

    public String getSdTakemeasures() {
        return sdTakemeasures;
    }

    public void setSdTakemeasures(String sdTakemeasures) {
        this.sdTakemeasures = sdTakemeasures == null ? null : sdTakemeasures.trim();
    }

    public String getSdUtype() {
        return sdUtype;
    }

    public void setSdUtype(String sdUtype) {
        this.sdUtype = sdUtype == null ? null : sdUtype.trim();
    }

    public String getSdSoiltype() {
        return sdSoiltype;
    }

    public void setSdSoiltype(String sdSoiltype) {
        this.sdSoiltype = sdSoiltype == null ? null : sdSoiltype.trim();
    }

    public Double getSdArea() {
        return sdArea;
    }

    public void setSdArea(Double sdArea) {
        this.sdArea = sdArea;
    }

    public Double getSoilindexpm25() {
        return soilindexpm25;
    }

    public void setSoilindexpm25(Double soilindexpm25) {
        this.soilindexpm25 = soilindexpm25;
    }

    public Double getSoilindexpm10() {
        return soilindexpm10;
    }

    public void setSoilindexpm10(Double soilindexpm10) {
        this.soilindexpm10 = soilindexpm10;
    }

    public Double getSurindex() {
        return surindex;
    }

    public void setSurindex(Double surindex) {
        this.surindex = surindex;
    }

    public Double getNoindex() {
        return noindex;
    }

    public void setNoindex(Double noindex) {
        this.noindex = noindex;
    }

    public Double getPindex() {
        return pindex;
    }

    public void setPindex(Double pindex) {
        this.pindex = pindex;
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
        sb.append(", sdId=").append(sdId);
        sb.append(", scccode=").append(scccode);
        sb.append(", countyId=").append(countyId);
        sb.append(", sdYear=").append(sdYear);
        sb.append(", sdTakemeasures=").append(sdTakemeasures);
        sb.append(", sdUtype=").append(sdUtype);
        sb.append(", sdSoiltype=").append(sdSoiltype);
        sb.append(", sdArea=").append(sdArea);
        sb.append(", soilindexpm25=").append(soilindexpm25);
        sb.append(", soilindexpm10=").append(soilindexpm10);
        sb.append(", surindex=").append(surindex);
        sb.append(", noindex=").append(noindex);
        sb.append(", pindex=").append(pindex);
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
        Xjsoildust other = (Xjsoildust) that;
        return (this.getSdId() == null ? other.getSdId() == null : this.getSdId().equals(other.getSdId()))
            && (this.getScccode() == null ? other.getScccode() == null : this.getScccode().equals(other.getScccode()))
            && (this.getCountyId() == null ? other.getCountyId() == null : this.getCountyId().equals(other.getCountyId()))
            && (this.getSdYear() == null ? other.getSdYear() == null : this.getSdYear().equals(other.getSdYear()))
            && (this.getSdTakemeasures() == null ? other.getSdTakemeasures() == null : this.getSdTakemeasures().equals(other.getSdTakemeasures()))
            && (this.getSdUtype() == null ? other.getSdUtype() == null : this.getSdUtype().equals(other.getSdUtype()))
            && (this.getSdSoiltype() == null ? other.getSdSoiltype() == null : this.getSdSoiltype().equals(other.getSdSoiltype()))
            && (this.getSdArea() == null ? other.getSdArea() == null : this.getSdArea().equals(other.getSdArea()))
            && (this.getSoilindexpm25() == null ? other.getSoilindexpm25() == null : this.getSoilindexpm25().equals(other.getSoilindexpm25()))
            && (this.getSoilindexpm10() == null ? other.getSoilindexpm10() == null : this.getSoilindexpm10().equals(other.getSoilindexpm10()))
            && (this.getSurindex() == null ? other.getSurindex() == null : this.getSurindex().equals(other.getSurindex()))
            && (this.getNoindex() == null ? other.getNoindex() == null : this.getNoindex().equals(other.getNoindex()))
            && (this.getPindex() == null ? other.getPindex() == null : this.getPindex().equals(other.getPindex()))
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
            && (this.getSccDescribe() == null ? other.getSccDescribe() == null : this.getSccDescribe().equals(other.getSccDescribe()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSdId() == null) ? 0 : getSdId().hashCode());
        result = prime * result + ((getScccode() == null) ? 0 : getScccode().hashCode());
        result = prime * result + ((getCountyId() == null) ? 0 : getCountyId().hashCode());
        result = prime * result + ((getSdYear() == null) ? 0 : getSdYear().hashCode());
        result = prime * result + ((getSdTakemeasures() == null) ? 0 : getSdTakemeasures().hashCode());
        result = prime * result + ((getSdUtype() == null) ? 0 : getSdUtype().hashCode());
        result = prime * result + ((getSdSoiltype() == null) ? 0 : getSdSoiltype().hashCode());
        result = prime * result + ((getSdArea() == null) ? 0 : getSdArea().hashCode());
        result = prime * result + ((getSoilindexpm25() == null) ? 0 : getSoilindexpm25().hashCode());
        result = prime * result + ((getSoilindexpm10() == null) ? 0 : getSoilindexpm10().hashCode());
        result = prime * result + ((getSurindex() == null) ? 0 : getSurindex().hashCode());
        result = prime * result + ((getNoindex() == null) ? 0 : getNoindex().hashCode());
        result = prime * result + ((getPindex() == null) ? 0 : getPindex().hashCode());
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
        result = prime * result + ((getSccDescribe() == null) ? 0 : getSccDescribe().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        return result;
    }
}