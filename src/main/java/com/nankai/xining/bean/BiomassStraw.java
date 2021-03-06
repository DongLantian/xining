package com.nankai.xining.bean;

import java.io.Serializable;

public class BiomassStraw implements Serializable {
    private Integer id;

    private String countyId;

    private String sccCode;

    private String sourceDescrip;

    private String crops;

    private Double cropsOutput;

    private Double grassValleyRatio;

    private Double openBurningRatio;

    private Double burningRatio;

    private String note;

    private String year;

    private Double pm10Emission;

    private Double pm25Emission;

    private Double coEmission;

    private Double vocEmission;

    private Double pmEmission;

    private Double so2Emission;

    private Double noxEmission;

    private Double nh3Emission;

    private Double ocEmission;

    private Double bcEmission;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountyId() {
        return countyId;
    }

    public void setCountyId(String countyId) {
        this.countyId = countyId == null ? null : countyId.trim();
    }

    public String getSccCode() {
        return sccCode;
    }

    public void setSccCode(String sccCode) {
        this.sccCode = sccCode == null ? null : sccCode.trim();
    }

    public String getSourceDescrip() {
        return sourceDescrip;
    }

    public void setSourceDescrip(String sourceDescrip) {
        this.sourceDescrip = sourceDescrip == null ? null : sourceDescrip.trim();
    }

    public String getCrops() {
        return crops;
    }

    public void setCrops(String crops) {
        this.crops = crops == null ? null : crops.trim();
    }

    public Double getCropsOutput() {
        return cropsOutput;
    }

    public void setCropsOutput(Double cropsOutput) {
        this.cropsOutput = cropsOutput;
    }

    public Double getGrassValleyRatio() {
        return grassValleyRatio;
    }

    public void setGrassValleyRatio(Double grassValleyRatio) {
        this.grassValleyRatio = grassValleyRatio;
    }

    public Double getOpenBurningRatio() {
        return openBurningRatio;
    }

    public void setOpenBurningRatio(Double openBurningRatio) {
        this.openBurningRatio = openBurningRatio;
    }

    public Double getBurningRatio() {
        return burningRatio;
    }

    public void setBurningRatio(Double burningRatio) {
        this.burningRatio = burningRatio;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
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

    public Double getCoEmission() {
        return coEmission;
    }

    public void setCoEmission(Double coEmission) {
        this.coEmission = coEmission;
    }

    public Double getVocEmission() {
        return vocEmission;
    }

    public void setVocEmission(Double vocEmission) {
        this.vocEmission = vocEmission;
    }

    public Double getPmEmission() {
        return pmEmission;
    }

    public void setPmEmission(Double pmEmission) {
        this.pmEmission = pmEmission;
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

    public Double getNh3Emission() {
        return nh3Emission;
    }

    public void setNh3Emission(Double nh3Emission) {
        this.nh3Emission = nh3Emission;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", countyId=").append(countyId);
        sb.append(", sccCode=").append(sccCode);
        sb.append(", sourceDescrip=").append(sourceDescrip);
        sb.append(", crops=").append(crops);
        sb.append(", cropsOutput=").append(cropsOutput);
        sb.append(", grassValleyRatio=").append(grassValleyRatio);
        sb.append(", openBurningRatio=").append(openBurningRatio);
        sb.append(", burningRatio=").append(burningRatio);
        sb.append(", note=").append(note);
        sb.append(", year=").append(year);
        sb.append(", pm10Emission=").append(pm10Emission);
        sb.append(", pm25Emission=").append(pm25Emission);
        sb.append(", coEmission=").append(coEmission);
        sb.append(", vocEmission=").append(vocEmission);
        sb.append(", pmEmission=").append(pmEmission);
        sb.append(", so2Emission=").append(so2Emission);
        sb.append(", noxEmission=").append(noxEmission);
        sb.append(", nh3Emission=").append(nh3Emission);
        sb.append(", ocEmission=").append(ocEmission);
        sb.append(", bcEmission=").append(bcEmission);
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
        BiomassStraw other = (BiomassStraw) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCountyId() == null ? other.getCountyId() == null : this.getCountyId().equals(other.getCountyId()))
            && (this.getSccCode() == null ? other.getSccCode() == null : this.getSccCode().equals(other.getSccCode()))
            && (this.getSourceDescrip() == null ? other.getSourceDescrip() == null : this.getSourceDescrip().equals(other.getSourceDescrip()))
            && (this.getCrops() == null ? other.getCrops() == null : this.getCrops().equals(other.getCrops()))
            && (this.getCropsOutput() == null ? other.getCropsOutput() == null : this.getCropsOutput().equals(other.getCropsOutput()))
            && (this.getGrassValleyRatio() == null ? other.getGrassValleyRatio() == null : this.getGrassValleyRatio().equals(other.getGrassValleyRatio()))
            && (this.getOpenBurningRatio() == null ? other.getOpenBurningRatio() == null : this.getOpenBurningRatio().equals(other.getOpenBurningRatio()))
            && (this.getBurningRatio() == null ? other.getBurningRatio() == null : this.getBurningRatio().equals(other.getBurningRatio()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getPm10Emission() == null ? other.getPm10Emission() == null : this.getPm10Emission().equals(other.getPm10Emission()))
            && (this.getPm25Emission() == null ? other.getPm25Emission() == null : this.getPm25Emission().equals(other.getPm25Emission()))
            && (this.getCoEmission() == null ? other.getCoEmission() == null : this.getCoEmission().equals(other.getCoEmission()))
            && (this.getVocEmission() == null ? other.getVocEmission() == null : this.getVocEmission().equals(other.getVocEmission()))
            && (this.getPmEmission() == null ? other.getPmEmission() == null : this.getPmEmission().equals(other.getPmEmission()))
            && (this.getSo2Emission() == null ? other.getSo2Emission() == null : this.getSo2Emission().equals(other.getSo2Emission()))
            && (this.getNoxEmission() == null ? other.getNoxEmission() == null : this.getNoxEmission().equals(other.getNoxEmission()))
            && (this.getNh3Emission() == null ? other.getNh3Emission() == null : this.getNh3Emission().equals(other.getNh3Emission()))
            && (this.getOcEmission() == null ? other.getOcEmission() == null : this.getOcEmission().equals(other.getOcEmission()))
            && (this.getBcEmission() == null ? other.getBcEmission() == null : this.getBcEmission().equals(other.getBcEmission()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCountyId() == null) ? 0 : getCountyId().hashCode());
        result = prime * result + ((getSccCode() == null) ? 0 : getSccCode().hashCode());
        result = prime * result + ((getSourceDescrip() == null) ? 0 : getSourceDescrip().hashCode());
        result = prime * result + ((getCrops() == null) ? 0 : getCrops().hashCode());
        result = prime * result + ((getCropsOutput() == null) ? 0 : getCropsOutput().hashCode());
        result = prime * result + ((getGrassValleyRatio() == null) ? 0 : getGrassValleyRatio().hashCode());
        result = prime * result + ((getOpenBurningRatio() == null) ? 0 : getOpenBurningRatio().hashCode());
        result = prime * result + ((getBurningRatio() == null) ? 0 : getBurningRatio().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getPm10Emission() == null) ? 0 : getPm10Emission().hashCode());
        result = prime * result + ((getPm25Emission() == null) ? 0 : getPm25Emission().hashCode());
        result = prime * result + ((getCoEmission() == null) ? 0 : getCoEmission().hashCode());
        result = prime * result + ((getVocEmission() == null) ? 0 : getVocEmission().hashCode());
        result = prime * result + ((getPmEmission() == null) ? 0 : getPmEmission().hashCode());
        result = prime * result + ((getSo2Emission() == null) ? 0 : getSo2Emission().hashCode());
        result = prime * result + ((getNoxEmission() == null) ? 0 : getNoxEmission().hashCode());
        result = prime * result + ((getNh3Emission() == null) ? 0 : getNh3Emission().hashCode());
        result = prime * result + ((getOcEmission() == null) ? 0 : getOcEmission().hashCode());
        result = prime * result + ((getBcEmission() == null) ? 0 : getBcEmission().hashCode());
        return result;
    }
}