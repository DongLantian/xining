package com.nankai.xining.bean;

import java.io.Serializable;

public class BiomassBoiler implements Serializable {
    private Integer id;

    private String sccCode;

    private Integer comId;

    private String sourceDescrip;

    private Integer boilerNo;

    private String fuelType;

    private Double fuelConsumption;

    private String dustRemoveTech;

    private Double pm10RemoveRatio;

    private Double pm25RemoveRatio;

    private String desulphurRemoveTech;

    private Double so2RemoveRatio;

    private String denitrificRemoveTech;

    private Double noxRemoveRatio;

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

    public String getSccCode() {
        return sccCode;
    }

    public void setSccCode(String sccCode) {
        this.sccCode = sccCode == null ? null : sccCode.trim();
    }

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public String getSourceDescrip() {
        return sourceDescrip;
    }

    public void setSourceDescrip(String sourceDescrip) {
        this.sourceDescrip = sourceDescrip == null ? null : sourceDescrip.trim();
    }

    public Integer getBoilerNo() {
        return boilerNo;
    }

    public void setBoilerNo(Integer boilerNo) {
        this.boilerNo = boilerNo;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType == null ? null : fuelType.trim();
    }

    public Double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(Double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getDustRemoveTech() {
        return dustRemoveTech;
    }

    public void setDustRemoveTech(String dustRemoveTech) {
        this.dustRemoveTech = dustRemoveTech == null ? null : dustRemoveTech.trim();
    }

    public Double getPm10RemoveRatio() {
        return pm10RemoveRatio;
    }

    public void setPm10RemoveRatio(Double pm10RemoveRatio) {
        this.pm10RemoveRatio = pm10RemoveRatio;
    }

    public Double getPm25RemoveRatio() {
        return pm25RemoveRatio;
    }

    public void setPm25RemoveRatio(Double pm25RemoveRatio) {
        this.pm25RemoveRatio = pm25RemoveRatio;
    }

    public String getDesulphurRemoveTech() {
        return desulphurRemoveTech;
    }

    public void setDesulphurRemoveTech(String desulphurRemoveTech) {
        this.desulphurRemoveTech = desulphurRemoveTech == null ? null : desulphurRemoveTech.trim();
    }

    public Double getSo2RemoveRatio() {
        return so2RemoveRatio;
    }

    public void setSo2RemoveRatio(Double so2RemoveRatio) {
        this.so2RemoveRatio = so2RemoveRatio;
    }

    public String getDenitrificRemoveTech() {
        return denitrificRemoveTech;
    }

    public void setDenitrificRemoveTech(String denitrificRemoveTech) {
        this.denitrificRemoveTech = denitrificRemoveTech == null ? null : denitrificRemoveTech.trim();
    }

    public Double getNoxRemoveRatio() {
        return noxRemoveRatio;
    }

    public void setNoxRemoveRatio(Double noxRemoveRatio) {
        this.noxRemoveRatio = noxRemoveRatio;
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
        sb.append(", sccCode=").append(sccCode);
        sb.append(", comId=").append(comId);
        sb.append(", sourceDescrip=").append(sourceDescrip);
        sb.append(", boilerNo=").append(boilerNo);
        sb.append(", fuelType=").append(fuelType);
        sb.append(", fuelConsumption=").append(fuelConsumption);
        sb.append(", dustRemoveTech=").append(dustRemoveTech);
        sb.append(", pm10RemoveRatio=").append(pm10RemoveRatio);
        sb.append(", pm25RemoveRatio=").append(pm25RemoveRatio);
        sb.append(", desulphurRemoveTech=").append(desulphurRemoveTech);
        sb.append(", so2RemoveRatio=").append(so2RemoveRatio);
        sb.append(", denitrificRemoveTech=").append(denitrificRemoveTech);
        sb.append(", noxRemoveRatio=").append(noxRemoveRatio);
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
        BiomassBoiler other = (BiomassBoiler) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSccCode() == null ? other.getSccCode() == null : this.getSccCode().equals(other.getSccCode()))
            && (this.getComId() == null ? other.getComId() == null : this.getComId().equals(other.getComId()))
            && (this.getSourceDescrip() == null ? other.getSourceDescrip() == null : this.getSourceDescrip().equals(other.getSourceDescrip()))
            && (this.getBoilerNo() == null ? other.getBoilerNo() == null : this.getBoilerNo().equals(other.getBoilerNo()))
            && (this.getFuelType() == null ? other.getFuelType() == null : this.getFuelType().equals(other.getFuelType()))
            && (this.getFuelConsumption() == null ? other.getFuelConsumption() == null : this.getFuelConsumption().equals(other.getFuelConsumption()))
            && (this.getDustRemoveTech() == null ? other.getDustRemoveTech() == null : this.getDustRemoveTech().equals(other.getDustRemoveTech()))
            && (this.getPm10RemoveRatio() == null ? other.getPm10RemoveRatio() == null : this.getPm10RemoveRatio().equals(other.getPm10RemoveRatio()))
            && (this.getPm25RemoveRatio() == null ? other.getPm25RemoveRatio() == null : this.getPm25RemoveRatio().equals(other.getPm25RemoveRatio()))
            && (this.getDesulphurRemoveTech() == null ? other.getDesulphurRemoveTech() == null : this.getDesulphurRemoveTech().equals(other.getDesulphurRemoveTech()))
            && (this.getSo2RemoveRatio() == null ? other.getSo2RemoveRatio() == null : this.getSo2RemoveRatio().equals(other.getSo2RemoveRatio()))
            && (this.getDenitrificRemoveTech() == null ? other.getDenitrificRemoveTech() == null : this.getDenitrificRemoveTech().equals(other.getDenitrificRemoveTech()))
            && (this.getNoxRemoveRatio() == null ? other.getNoxRemoveRatio() == null : this.getNoxRemoveRatio().equals(other.getNoxRemoveRatio()))
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
        result = prime * result + ((getSccCode() == null) ? 0 : getSccCode().hashCode());
        result = prime * result + ((getComId() == null) ? 0 : getComId().hashCode());
        result = prime * result + ((getSourceDescrip() == null) ? 0 : getSourceDescrip().hashCode());
        result = prime * result + ((getBoilerNo() == null) ? 0 : getBoilerNo().hashCode());
        result = prime * result + ((getFuelType() == null) ? 0 : getFuelType().hashCode());
        result = prime * result + ((getFuelConsumption() == null) ? 0 : getFuelConsumption().hashCode());
        result = prime * result + ((getDustRemoveTech() == null) ? 0 : getDustRemoveTech().hashCode());
        result = prime * result + ((getPm10RemoveRatio() == null) ? 0 : getPm10RemoveRatio().hashCode());
        result = prime * result + ((getPm25RemoveRatio() == null) ? 0 : getPm25RemoveRatio().hashCode());
        result = prime * result + ((getDesulphurRemoveTech() == null) ? 0 : getDesulphurRemoveTech().hashCode());
        result = prime * result + ((getSo2RemoveRatio() == null) ? 0 : getSo2RemoveRatio().hashCode());
        result = prime * result + ((getDenitrificRemoveTech() == null) ? 0 : getDenitrificRemoveTech().hashCode());
        result = prime * result + ((getNoxRemoveRatio() == null) ? 0 : getNoxRemoveRatio().hashCode());
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