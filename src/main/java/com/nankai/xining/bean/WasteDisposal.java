package com.nankai.xining.bean;

import java.io.Serializable;

public class WasteDisposal implements Serializable {
    private Integer id;

    private String scc;

    private Integer factoryId;

    private String treatment;

    private String wasteType2;

    private String wasteType3;

    private String wasteTech;

    private Double longitude1;

    private Double latitude1;

    private Double longitude2;

    private Double latitude2;

    private Double longitude3;

    private Double latitude3;

    private Double longitude4;

    private Double latitude4;

    private Double wwaterCap;

    private String wwaterUnit;

    private Double wlandfillCap;

    private String wlandfillUnit;

    private Double wcompostCap;

    private String wcompostUnit;

    private Double wfireCap;

    private String wfireUnit;

    private Double nh3Factor;

    private String nh3Funit;

    private Double vocFactor;

    private String vocFunit;

    private Double nh3Emission;

    private String nh3Unit;

    private Double vocEmisson;

    private String vocUnit;

    private Boolean status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScc() {
        return scc;
    }

    public void setScc(String scc) {
        this.scc = scc == null ? null : scc.trim();
    }

    public Integer getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Integer factoryId) {
        this.factoryId = factoryId;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment == null ? null : treatment.trim();
    }

    public String getWasteType2() {
        return wasteType2;
    }

    public void setWasteType2(String wasteType2) {
        this.wasteType2 = wasteType2 == null ? null : wasteType2.trim();
    }

    public String getWasteType3() {
        return wasteType3;
    }

    public void setWasteType3(String wasteType3) {
        this.wasteType3 = wasteType3 == null ? null : wasteType3.trim();
    }

    public String getWasteTech() {
        return wasteTech;
    }

    public void setWasteTech(String wasteTech) {
        this.wasteTech = wasteTech == null ? null : wasteTech.trim();
    }

    public Double getLongitude1() {
        return longitude1;
    }

    public void setLongitude1(Double longitude1) {
        this.longitude1 = longitude1;
    }

    public Double getLatitude1() {
        return latitude1;
    }

    public void setLatitude1(Double latitude1) {
        this.latitude1 = latitude1;
    }

    public Double getLongitude2() {
        return longitude2;
    }

    public void setLongitude2(Double longitude2) {
        this.longitude2 = longitude2;
    }

    public Double getLatitude2() {
        return latitude2;
    }

    public void setLatitude2(Double latitude2) {
        this.latitude2 = latitude2;
    }

    public Double getLongitude3() {
        return longitude3;
    }

    public void setLongitude3(Double longitude3) {
        this.longitude3 = longitude3;
    }

    public Double getLatitude3() {
        return latitude3;
    }

    public void setLatitude3(Double latitude3) {
        this.latitude3 = latitude3;
    }

    public Double getLongitude4() {
        return longitude4;
    }

    public void setLongitude4(Double longitude4) {
        this.longitude4 = longitude4;
    }

    public Double getLatitude4() {
        return latitude4;
    }

    public void setLatitude4(Double latitude4) {
        this.latitude4 = latitude4;
    }

    public Double getWwaterCap() {
        return wwaterCap;
    }

    public void setWwaterCap(Double wwaterCap) {
        this.wwaterCap = wwaterCap;
    }

    public String getWwaterUnit() {
        return wwaterUnit;
    }

    public void setWwaterUnit(String wwaterUnit) {
        this.wwaterUnit = wwaterUnit == null ? null : wwaterUnit.trim();
    }

    public Double getWlandfillCap() {
        return wlandfillCap;
    }

    public void setWlandfillCap(Double wlandfillCap) {
        this.wlandfillCap = wlandfillCap;
    }

    public String getWlandfillUnit() {
        return wlandfillUnit;
    }

    public void setWlandfillUnit(String wlandfillUnit) {
        this.wlandfillUnit = wlandfillUnit == null ? null : wlandfillUnit.trim();
    }

    public Double getWcompostCap() {
        return wcompostCap;
    }

    public void setWcompostCap(Double wcompostCap) {
        this.wcompostCap = wcompostCap;
    }

    public String getWcompostUnit() {
        return wcompostUnit;
    }

    public void setWcompostUnit(String wcompostUnit) {
        this.wcompostUnit = wcompostUnit == null ? null : wcompostUnit.trim();
    }

    public Double getWfireCap() {
        return wfireCap;
    }

    public void setWfireCap(Double wfireCap) {
        this.wfireCap = wfireCap;
    }

    public String getWfireUnit() {
        return wfireUnit;
    }

    public void setWfireUnit(String wfireUnit) {
        this.wfireUnit = wfireUnit == null ? null : wfireUnit.trim();
    }

    public Double getNh3Factor() {
        return nh3Factor;
    }

    public void setNh3Factor(Double nh3Factor) {
        this.nh3Factor = nh3Factor;
    }

    public String getNh3Funit() {
        return nh3Funit;
    }

    public void setNh3Funit(String nh3Funit) {
        this.nh3Funit = nh3Funit == null ? null : nh3Funit.trim();
    }

    public Double getVocFactor() {
        return vocFactor;
    }

    public void setVocFactor(Double vocFactor) {
        this.vocFactor = vocFactor;
    }

    public String getVocFunit() {
        return vocFunit;
    }

    public void setVocFunit(String vocFunit) {
        this.vocFunit = vocFunit == null ? null : vocFunit.trim();
    }

    public Double getNh3Emission() {
        return nh3Emission;
    }

    public void setNh3Emission(Double nh3Emission) {
        this.nh3Emission = nh3Emission;
    }

    public String getNh3Unit() {
        return nh3Unit;
    }

    public void setNh3Unit(String nh3Unit) {
        this.nh3Unit = nh3Unit == null ? null : nh3Unit.trim();
    }

    public Double getVocEmisson() {
        return vocEmisson;
    }

    public void setVocEmisson(Double vocEmisson) {
        this.vocEmisson = vocEmisson;
    }

    public String getVocUnit() {
        return vocUnit;
    }

    public void setVocUnit(String vocUnit) {
        this.vocUnit = vocUnit == null ? null : vocUnit.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", scc=").append(scc);
        sb.append(", factoryId=").append(factoryId);
        sb.append(", treatment=").append(treatment);
        sb.append(", wasteType2=").append(wasteType2);
        sb.append(", wasteType3=").append(wasteType3);
        sb.append(", wasteTech=").append(wasteTech);
        sb.append(", longitude1=").append(longitude1);
        sb.append(", latitude1=").append(latitude1);
        sb.append(", longitude2=").append(longitude2);
        sb.append(", latitude2=").append(latitude2);
        sb.append(", longitude3=").append(longitude3);
        sb.append(", latitude3=").append(latitude3);
        sb.append(", longitude4=").append(longitude4);
        sb.append(", latitude4=").append(latitude4);
        sb.append(", wwaterCap=").append(wwaterCap);
        sb.append(", wwaterUnit=").append(wwaterUnit);
        sb.append(", wlandfillCap=").append(wlandfillCap);
        sb.append(", wlandfillUnit=").append(wlandfillUnit);
        sb.append(", wcompostCap=").append(wcompostCap);
        sb.append(", wcompostUnit=").append(wcompostUnit);
        sb.append(", wfireCap=").append(wfireCap);
        sb.append(", wfireUnit=").append(wfireUnit);
        sb.append(", nh3Factor=").append(nh3Factor);
        sb.append(", nh3Funit=").append(nh3Funit);
        sb.append(", vocFactor=").append(vocFactor);
        sb.append(", vocFunit=").append(vocFunit);
        sb.append(", nh3Emission=").append(nh3Emission);
        sb.append(", nh3Unit=").append(nh3Unit);
        sb.append(", vocEmisson=").append(vocEmisson);
        sb.append(", vocUnit=").append(vocUnit);
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
        WasteDisposal other = (WasteDisposal) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getScc() == null ? other.getScc() == null : this.getScc().equals(other.getScc()))
            && (this.getFactoryId() == null ? other.getFactoryId() == null : this.getFactoryId().equals(other.getFactoryId()))
            && (this.getTreatment() == null ? other.getTreatment() == null : this.getTreatment().equals(other.getTreatment()))
            && (this.getWasteType2() == null ? other.getWasteType2() == null : this.getWasteType2().equals(other.getWasteType2()))
            && (this.getWasteType3() == null ? other.getWasteType3() == null : this.getWasteType3().equals(other.getWasteType3()))
            && (this.getWasteTech() == null ? other.getWasteTech() == null : this.getWasteTech().equals(other.getWasteTech()))
            && (this.getLongitude1() == null ? other.getLongitude1() == null : this.getLongitude1().equals(other.getLongitude1()))
            && (this.getLatitude1() == null ? other.getLatitude1() == null : this.getLatitude1().equals(other.getLatitude1()))
            && (this.getLongitude2() == null ? other.getLongitude2() == null : this.getLongitude2().equals(other.getLongitude2()))
            && (this.getLatitude2() == null ? other.getLatitude2() == null : this.getLatitude2().equals(other.getLatitude2()))
            && (this.getLongitude3() == null ? other.getLongitude3() == null : this.getLongitude3().equals(other.getLongitude3()))
            && (this.getLatitude3() == null ? other.getLatitude3() == null : this.getLatitude3().equals(other.getLatitude3()))
            && (this.getLongitude4() == null ? other.getLongitude4() == null : this.getLongitude4().equals(other.getLongitude4()))
            && (this.getLatitude4() == null ? other.getLatitude4() == null : this.getLatitude4().equals(other.getLatitude4()))
            && (this.getWwaterCap() == null ? other.getWwaterCap() == null : this.getWwaterCap().equals(other.getWwaterCap()))
            && (this.getWwaterUnit() == null ? other.getWwaterUnit() == null : this.getWwaterUnit().equals(other.getWwaterUnit()))
            && (this.getWlandfillCap() == null ? other.getWlandfillCap() == null : this.getWlandfillCap().equals(other.getWlandfillCap()))
            && (this.getWlandfillUnit() == null ? other.getWlandfillUnit() == null : this.getWlandfillUnit().equals(other.getWlandfillUnit()))
            && (this.getWcompostCap() == null ? other.getWcompostCap() == null : this.getWcompostCap().equals(other.getWcompostCap()))
            && (this.getWcompostUnit() == null ? other.getWcompostUnit() == null : this.getWcompostUnit().equals(other.getWcompostUnit()))
            && (this.getWfireCap() == null ? other.getWfireCap() == null : this.getWfireCap().equals(other.getWfireCap()))
            && (this.getWfireUnit() == null ? other.getWfireUnit() == null : this.getWfireUnit().equals(other.getWfireUnit()))
            && (this.getNh3Factor() == null ? other.getNh3Factor() == null : this.getNh3Factor().equals(other.getNh3Factor()))
            && (this.getNh3Funit() == null ? other.getNh3Funit() == null : this.getNh3Funit().equals(other.getNh3Funit()))
            && (this.getVocFactor() == null ? other.getVocFactor() == null : this.getVocFactor().equals(other.getVocFactor()))
            && (this.getVocFunit() == null ? other.getVocFunit() == null : this.getVocFunit().equals(other.getVocFunit()))
            && (this.getNh3Emission() == null ? other.getNh3Emission() == null : this.getNh3Emission().equals(other.getNh3Emission()))
            && (this.getNh3Unit() == null ? other.getNh3Unit() == null : this.getNh3Unit().equals(other.getNh3Unit()))
            && (this.getVocEmisson() == null ? other.getVocEmisson() == null : this.getVocEmisson().equals(other.getVocEmisson()))
            && (this.getVocUnit() == null ? other.getVocUnit() == null : this.getVocUnit().equals(other.getVocUnit()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getScc() == null) ? 0 : getScc().hashCode());
        result = prime * result + ((getFactoryId() == null) ? 0 : getFactoryId().hashCode());
        result = prime * result + ((getTreatment() == null) ? 0 : getTreatment().hashCode());
        result = prime * result + ((getWasteType2() == null) ? 0 : getWasteType2().hashCode());
        result = prime * result + ((getWasteType3() == null) ? 0 : getWasteType3().hashCode());
        result = prime * result + ((getWasteTech() == null) ? 0 : getWasteTech().hashCode());
        result = prime * result + ((getLongitude1() == null) ? 0 : getLongitude1().hashCode());
        result = prime * result + ((getLatitude1() == null) ? 0 : getLatitude1().hashCode());
        result = prime * result + ((getLongitude2() == null) ? 0 : getLongitude2().hashCode());
        result = prime * result + ((getLatitude2() == null) ? 0 : getLatitude2().hashCode());
        result = prime * result + ((getLongitude3() == null) ? 0 : getLongitude3().hashCode());
        result = prime * result + ((getLatitude3() == null) ? 0 : getLatitude3().hashCode());
        result = prime * result + ((getLongitude4() == null) ? 0 : getLongitude4().hashCode());
        result = prime * result + ((getLatitude4() == null) ? 0 : getLatitude4().hashCode());
        result = prime * result + ((getWwaterCap() == null) ? 0 : getWwaterCap().hashCode());
        result = prime * result + ((getWwaterUnit() == null) ? 0 : getWwaterUnit().hashCode());
        result = prime * result + ((getWlandfillCap() == null) ? 0 : getWlandfillCap().hashCode());
        result = prime * result + ((getWlandfillUnit() == null) ? 0 : getWlandfillUnit().hashCode());
        result = prime * result + ((getWcompostCap() == null) ? 0 : getWcompostCap().hashCode());
        result = prime * result + ((getWcompostUnit() == null) ? 0 : getWcompostUnit().hashCode());
        result = prime * result + ((getWfireCap() == null) ? 0 : getWfireCap().hashCode());
        result = prime * result + ((getWfireUnit() == null) ? 0 : getWfireUnit().hashCode());
        result = prime * result + ((getNh3Factor() == null) ? 0 : getNh3Factor().hashCode());
        result = prime * result + ((getNh3Funit() == null) ? 0 : getNh3Funit().hashCode());
        result = prime * result + ((getVocFactor() == null) ? 0 : getVocFactor().hashCode());
        result = prime * result + ((getVocFunit() == null) ? 0 : getVocFunit().hashCode());
        result = prime * result + ((getNh3Emission() == null) ? 0 : getNh3Emission().hashCode());
        result = prime * result + ((getNh3Unit() == null) ? 0 : getNh3Unit().hashCode());
        result = prime * result + ((getVocEmisson() == null) ? 0 : getVocEmisson().hashCode());
        result = prime * result + ((getVocUnit() == null) ? 0 : getVocUnit().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}