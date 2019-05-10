package com.nankai.xining.bean;

import java.io.Serializable;

public class ShVocdeviceeffi implements Serializable {
    private Integer id;

    private String year;

    private Integer factoryId;

    private String workshopSection;

    private String gyName;

    private Double exitAirvolume;

    private Double annualRuntime;

    private Double exitConcentration;

    private Double efficency;

    private Double pm10Emission;

    private Double pm25Emission;

    private Double so2Emission;

    private Double noxEmission;

    private Double vocEmission;

    private Double nh3Emission;

    private Double coEmission;

    private Double ocEmission;

    private Double bcEmission;

    private String emissionUnit;

    private String scccode;

    private String sourceDiscrip;

    private Integer flag;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public Integer getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Integer factoryId) {
        this.factoryId = factoryId;
    }

    public String getWorkshopSection() {
        return workshopSection;
    }

    public void setWorkshopSection(String workshopSection) {
        this.workshopSection = workshopSection == null ? null : workshopSection.trim();
    }

    public String getGyName() {
        return gyName;
    }

    public void setGyName(String gyName) {
        this.gyName = gyName == null ? null : gyName.trim();
    }

    public Double getExitAirvolume() {
        return exitAirvolume;
    }

    public void setExitAirvolume(Double exitAirvolume) {
        this.exitAirvolume = exitAirvolume;
    }

    public Double getAnnualRuntime() {
        return annualRuntime;
    }

    public void setAnnualRuntime(Double annualRuntime) {
        this.annualRuntime = annualRuntime;
    }

    public Double getExitConcentration() {
        return exitConcentration;
    }

    public void setExitConcentration(Double exitConcentration) {
        this.exitConcentration = exitConcentration;
    }

    public Double getEfficency() {
        return efficency;
    }

    public void setEfficency(Double efficency) {
        this.efficency = efficency;
    }

    public Double getPm10Emission() {
        return pm10Emission;
    }

    public void setPm10Emission(Double pm10Emission) {
        this.pm10Emission = pm10Emission;
    }

    public Double getPm25Emission() {
        return pm25Emission;
    }

    public void setPm25Emission(Double pm25Emission) {
        this.pm25Emission = pm25Emission;
    }

    public Double getSo2Emission() {
        return so2Emission;
    }

    public void setSo2Emission(Double so2Emission) {
        this.so2Emission = so2Emission;
    }

    public Double getNoxEmission() {
        return noxEmission;
    }

    public void setNoxEmission(Double noxEmission) {
        this.noxEmission = noxEmission;
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

    public String getEmissionUnit() {
        return emissionUnit;
    }

    public void setEmissionUnit(String emissionUnit) {
        this.emissionUnit = emissionUnit == null ? null : emissionUnit.trim();
    }

    public String getScccode() {
        return scccode;
    }

    public void setScccode(String scccode) {
        this.scccode = scccode == null ? null : scccode.trim();
    }

    public String getSourceDiscrip() {
        return sourceDiscrip;
    }

    public void setSourceDiscrip(String sourceDiscrip) {
        this.sourceDiscrip = sourceDiscrip == null ? null : sourceDiscrip.trim();
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
        sb.append(", year=").append(year);
        sb.append(", factoryId=").append(factoryId);
        sb.append(", workshopSection=").append(workshopSection);
        sb.append(", gyName=").append(gyName);
        sb.append(", exitAirvolume=").append(exitAirvolume);
        sb.append(", annualRuntime=").append(annualRuntime);
        sb.append(", exitConcentration=").append(exitConcentration);
        sb.append(", efficency=").append(efficency);
        sb.append(", pm10Emission=").append(pm10Emission);
        sb.append(", pm25Emission=").append(pm25Emission);
        sb.append(", so2Emission=").append(so2Emission);
        sb.append(", noxEmission=").append(noxEmission);
        sb.append(", vocEmission=").append(vocEmission);
        sb.append(", nh3Emission=").append(nh3Emission);
        sb.append(", coEmission=").append(coEmission);
        sb.append(", ocEmission=").append(ocEmission);
        sb.append(", bcEmission=").append(bcEmission);
        sb.append(", emissionUnit=").append(emissionUnit);
        sb.append(", scccode=").append(scccode);
        sb.append(", sourceDiscrip=").append(sourceDiscrip);
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
        ShVocdeviceeffi other = (ShVocdeviceeffi) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getFactoryId() == null ? other.getFactoryId() == null : this.getFactoryId().equals(other.getFactoryId()))
            && (this.getWorkshopSection() == null ? other.getWorkshopSection() == null : this.getWorkshopSection().equals(other.getWorkshopSection()))
            && (this.getGyName() == null ? other.getGyName() == null : this.getGyName().equals(other.getGyName()))
            && (this.getExitAirvolume() == null ? other.getExitAirvolume() == null : this.getExitAirvolume().equals(other.getExitAirvolume()))
            && (this.getAnnualRuntime() == null ? other.getAnnualRuntime() == null : this.getAnnualRuntime().equals(other.getAnnualRuntime()))
            && (this.getExitConcentration() == null ? other.getExitConcentration() == null : this.getExitConcentration().equals(other.getExitConcentration()))
            && (this.getEfficency() == null ? other.getEfficency() == null : this.getEfficency().equals(other.getEfficency()))
            && (this.getPm10Emission() == null ? other.getPm10Emission() == null : this.getPm10Emission().equals(other.getPm10Emission()))
            && (this.getPm25Emission() == null ? other.getPm25Emission() == null : this.getPm25Emission().equals(other.getPm25Emission()))
            && (this.getSo2Emission() == null ? other.getSo2Emission() == null : this.getSo2Emission().equals(other.getSo2Emission()))
            && (this.getNoxEmission() == null ? other.getNoxEmission() == null : this.getNoxEmission().equals(other.getNoxEmission()))
            && (this.getVocEmission() == null ? other.getVocEmission() == null : this.getVocEmission().equals(other.getVocEmission()))
            && (this.getNh3Emission() == null ? other.getNh3Emission() == null : this.getNh3Emission().equals(other.getNh3Emission()))
            && (this.getCoEmission() == null ? other.getCoEmission() == null : this.getCoEmission().equals(other.getCoEmission()))
            && (this.getOcEmission() == null ? other.getOcEmission() == null : this.getOcEmission().equals(other.getOcEmission()))
            && (this.getBcEmission() == null ? other.getBcEmission() == null : this.getBcEmission().equals(other.getBcEmission()))
            && (this.getEmissionUnit() == null ? other.getEmissionUnit() == null : this.getEmissionUnit().equals(other.getEmissionUnit()))
            && (this.getScccode() == null ? other.getScccode() == null : this.getScccode().equals(other.getScccode()))
            && (this.getSourceDiscrip() == null ? other.getSourceDiscrip() == null : this.getSourceDiscrip().equals(other.getSourceDiscrip()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getFactoryId() == null) ? 0 : getFactoryId().hashCode());
        result = prime * result + ((getWorkshopSection() == null) ? 0 : getWorkshopSection().hashCode());
        result = prime * result + ((getGyName() == null) ? 0 : getGyName().hashCode());
        result = prime * result + ((getExitAirvolume() == null) ? 0 : getExitAirvolume().hashCode());
        result = prime * result + ((getAnnualRuntime() == null) ? 0 : getAnnualRuntime().hashCode());
        result = prime * result + ((getExitConcentration() == null) ? 0 : getExitConcentration().hashCode());
        result = prime * result + ((getEfficency() == null) ? 0 : getEfficency().hashCode());
        result = prime * result + ((getPm10Emission() == null) ? 0 : getPm10Emission().hashCode());
        result = prime * result + ((getPm25Emission() == null) ? 0 : getPm25Emission().hashCode());
        result = prime * result + ((getSo2Emission() == null) ? 0 : getSo2Emission().hashCode());
        result = prime * result + ((getNoxEmission() == null) ? 0 : getNoxEmission().hashCode());
        result = prime * result + ((getVocEmission() == null) ? 0 : getVocEmission().hashCode());
        result = prime * result + ((getNh3Emission() == null) ? 0 : getNh3Emission().hashCode());
        result = prime * result + ((getCoEmission() == null) ? 0 : getCoEmission().hashCode());
        result = prime * result + ((getOcEmission() == null) ? 0 : getOcEmission().hashCode());
        result = prime * result + ((getBcEmission() == null) ? 0 : getBcEmission().hashCode());
        result = prime * result + ((getEmissionUnit() == null) ? 0 : getEmissionUnit().hashCode());
        result = prime * result + ((getScccode() == null) ? 0 : getScccode().hashCode());
        result = prime * result + ((getSourceDiscrip() == null) ? 0 : getSourceDiscrip().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        return result;
    }
}