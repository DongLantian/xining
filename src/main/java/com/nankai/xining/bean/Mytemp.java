package com.nankai.xining.bean;

import java.io.Serializable;

public class Mytemp implements Serializable {
    private String sourceType;

    private String model;

    private String year;

    private String countyId;

    private String factoryName;

    private String factoryNo1;

    private String industryId;

    private String address;

    private Double factoryLongitude;

    private Double factoryLatitude;

    private Integer tboilerNum;

    private Double tboilerTons;

    private Integer no;

    private Double tons;

    private String scc;

    private String fueltype;

    private Double fuelAusage;

    private String exfNo;

    private Double exfHeight;

    private Double smokeOutd;

    private Double smokeOUtteM;

    private Double smokeOutv;

    private String exfMaterial;

    private Double pm;

    private Double pm10;

    private Double pm25;

    private Double voc;

    private Double co;

    private Double nh3;

    private Double so2;

    private Double nox;

    private Double oc;

    private Double bc;

    private static final long serialVersionUID = 1L;

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType == null ? null : sourceType.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getCountyId() {
        return countyId;
    }

    public void setCountyId(String countyId) {
        this.countyId = countyId == null ? null : countyId.trim();
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName == null ? null : factoryName.trim();
    }

    public String getFactoryNo1() {
        return factoryNo1;
    }

    public void setFactoryNo1(String factoryNo1) {
        this.factoryNo1 = factoryNo1 == null ? null : factoryNo1.trim();
    }

    public String getIndustryId() {
        return industryId;
    }

    public void setIndustryId(String industryId) {
        this.industryId = industryId == null ? null : industryId.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Double getFactoryLongitude() {
        return factoryLongitude;
    }

    public void setFactoryLongitude(Double factoryLongitude) {
        this.factoryLongitude = factoryLongitude;
    }

    public Double getFactoryLatitude() {
        return factoryLatitude;
    }

    public void setFactoryLatitude(Double factoryLatitude) {
        this.factoryLatitude = factoryLatitude;
    }

    public Integer getTboilerNum() {
        return tboilerNum;
    }

    public void setTboilerNum(Integer tboilerNum) {
        this.tboilerNum = tboilerNum;
    }

    public Double getTboilerTons() {
        return tboilerTons;
    }

    public void setTboilerTons(Double tboilerTons) {
        this.tboilerTons = tboilerTons;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public Double getTons() {
        return tons;
    }

    public void setTons(Double tons) {
        this.tons = tons;
    }

    public String getScc() {
        return scc;
    }

    public void setScc(String scc) {
        this.scc = scc == null ? null : scc.trim();
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype == null ? null : fueltype.trim();
    }

    public Double getFuelAusage() {
        return fuelAusage;
    }

    public void setFuelAusage(Double fuelAusage) {
        this.fuelAusage = fuelAusage;
    }

    public String getExfNo() {
        return exfNo;
    }

    public void setExfNo(String exfNo) {
        this.exfNo = exfNo == null ? null : exfNo.trim();
    }

    public Double getExfHeight() {
        return exfHeight;
    }

    public void setExfHeight(Double exfHeight) {
        this.exfHeight = exfHeight;
    }

    public Double getSmokeOutd() {
        return smokeOutd;
    }

    public void setSmokeOutd(Double smokeOutd) {
        this.smokeOutd = smokeOutd;
    }

    public Double getSmokeOUtteM() {
        return smokeOUtteM;
    }

    public void setSmokeOUtteM(Double smokeOUtteM) {
        this.smokeOUtteM = smokeOUtteM;
    }

    public Double getSmokeOutv() {
        return smokeOutv;
    }

    public void setSmokeOutv(Double smokeOutv) {
        this.smokeOutv = smokeOutv;
    }

    public String getExfMaterial() {
        return exfMaterial;
    }

    public void setExfMaterial(String exfMaterial) {
        this.exfMaterial = exfMaterial == null ? null : exfMaterial.trim();
    }

    public Double getPm() {
        return pm;
    }

    public void setPm(Double pm) {
        this.pm = pm;
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

    public Double getVoc() {
        return voc;
    }

    public void setVoc(Double voc) {
        this.voc = voc;
    }

    public Double getCo() {
        return co;
    }

    public void setCo(Double co) {
        this.co = co;
    }

    public Double getNh3() {
        return nh3;
    }

    public void setNh3(Double nh3) {
        this.nh3 = nh3;
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

    public Double getOc() {
        return oc;
    }

    public void setOc(Double oc) {
        this.oc = oc;
    }

    public Double getBc() {
        return bc;
    }

    public void setBc(Double bc) {
        this.bc = bc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sourceType=").append(sourceType);
        sb.append(", model=").append(model);
        sb.append(", year=").append(year);
        sb.append(", countyId=").append(countyId);
        sb.append(", factoryName=").append(factoryName);
        sb.append(", factoryNo1=").append(factoryNo1);
        sb.append(", industryId=").append(industryId);
        sb.append(", address=").append(address);
        sb.append(", factoryLongitude=").append(factoryLongitude);
        sb.append(", factoryLatitude=").append(factoryLatitude);
        sb.append(", tboilerNum=").append(tboilerNum);
        sb.append(", tboilerTons=").append(tboilerTons);
        sb.append(", no=").append(no);
        sb.append(", tons=").append(tons);
        sb.append(", scc=").append(scc);
        sb.append(", fueltype=").append(fueltype);
        sb.append(", fuelAusage=").append(fuelAusage);
        sb.append(", exfNo=").append(exfNo);
        sb.append(", exfHeight=").append(exfHeight);
        sb.append(", smokeOutd=").append(smokeOutd);
        sb.append(", smokeOUtteM=").append(smokeOUtteM);
        sb.append(", smokeOutv=").append(smokeOutv);
        sb.append(", exfMaterial=").append(exfMaterial);
        sb.append(", pm=").append(pm);
        sb.append(", pm10=").append(pm10);
        sb.append(", pm25=").append(pm25);
        sb.append(", voc=").append(voc);
        sb.append(", co=").append(co);
        sb.append(", nh3=").append(nh3);
        sb.append(", so2=").append(so2);
        sb.append(", nox=").append(nox);
        sb.append(", oc=").append(oc);
        sb.append(", bc=").append(bc);
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
        Mytemp other = (Mytemp) that;
        return (this.getSourceType() == null ? other.getSourceType() == null : this.getSourceType().equals(other.getSourceType()))
            && (this.getModel() == null ? other.getModel() == null : this.getModel().equals(other.getModel()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getCountyId() == null ? other.getCountyId() == null : this.getCountyId().equals(other.getCountyId()))
            && (this.getFactoryName() == null ? other.getFactoryName() == null : this.getFactoryName().equals(other.getFactoryName()))
            && (this.getFactoryNo1() == null ? other.getFactoryNo1() == null : this.getFactoryNo1().equals(other.getFactoryNo1()))
            && (this.getIndustryId() == null ? other.getIndustryId() == null : this.getIndustryId().equals(other.getIndustryId()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getFactoryLongitude() == null ? other.getFactoryLongitude() == null : this.getFactoryLongitude().equals(other.getFactoryLongitude()))
            && (this.getFactoryLatitude() == null ? other.getFactoryLatitude() == null : this.getFactoryLatitude().equals(other.getFactoryLatitude()))
            && (this.getTboilerNum() == null ? other.getTboilerNum() == null : this.getTboilerNum().equals(other.getTboilerNum()))
            && (this.getTboilerTons() == null ? other.getTboilerTons() == null : this.getTboilerTons().equals(other.getTboilerTons()))
            && (this.getNo() == null ? other.getNo() == null : this.getNo().equals(other.getNo()))
            && (this.getTons() == null ? other.getTons() == null : this.getTons().equals(other.getTons()))
            && (this.getScc() == null ? other.getScc() == null : this.getScc().equals(other.getScc()))
            && (this.getFueltype() == null ? other.getFueltype() == null : this.getFueltype().equals(other.getFueltype()))
            && (this.getFuelAusage() == null ? other.getFuelAusage() == null : this.getFuelAusage().equals(other.getFuelAusage()))
            && (this.getExfNo() == null ? other.getExfNo() == null : this.getExfNo().equals(other.getExfNo()))
            && (this.getExfHeight() == null ? other.getExfHeight() == null : this.getExfHeight().equals(other.getExfHeight()))
            && (this.getSmokeOutd() == null ? other.getSmokeOutd() == null : this.getSmokeOutd().equals(other.getSmokeOutd()))
            && (this.getSmokeOUtteM() == null ? other.getSmokeOUtteM() == null : this.getSmokeOUtteM().equals(other.getSmokeOUtteM()))
            && (this.getSmokeOutv() == null ? other.getSmokeOutv() == null : this.getSmokeOutv().equals(other.getSmokeOutv()))
            && (this.getExfMaterial() == null ? other.getExfMaterial() == null : this.getExfMaterial().equals(other.getExfMaterial()))
            && (this.getPm() == null ? other.getPm() == null : this.getPm().equals(other.getPm()))
            && (this.getPm10() == null ? other.getPm10() == null : this.getPm10().equals(other.getPm10()))
            && (this.getPm25() == null ? other.getPm25() == null : this.getPm25().equals(other.getPm25()))
            && (this.getVoc() == null ? other.getVoc() == null : this.getVoc().equals(other.getVoc()))
            && (this.getCo() == null ? other.getCo() == null : this.getCo().equals(other.getCo()))
            && (this.getNh3() == null ? other.getNh3() == null : this.getNh3().equals(other.getNh3()))
            && (this.getSo2() == null ? other.getSo2() == null : this.getSo2().equals(other.getSo2()))
            && (this.getNox() == null ? other.getNox() == null : this.getNox().equals(other.getNox()))
            && (this.getOc() == null ? other.getOc() == null : this.getOc().equals(other.getOc()))
            && (this.getBc() == null ? other.getBc() == null : this.getBc().equals(other.getBc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        result = prime * result + ((getModel() == null) ? 0 : getModel().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getCountyId() == null) ? 0 : getCountyId().hashCode());
        result = prime * result + ((getFactoryName() == null) ? 0 : getFactoryName().hashCode());
        result = prime * result + ((getFactoryNo1() == null) ? 0 : getFactoryNo1().hashCode());
        result = prime * result + ((getIndustryId() == null) ? 0 : getIndustryId().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getFactoryLongitude() == null) ? 0 : getFactoryLongitude().hashCode());
        result = prime * result + ((getFactoryLatitude() == null) ? 0 : getFactoryLatitude().hashCode());
        result = prime * result + ((getTboilerNum() == null) ? 0 : getTboilerNum().hashCode());
        result = prime * result + ((getTboilerTons() == null) ? 0 : getTboilerTons().hashCode());
        result = prime * result + ((getNo() == null) ? 0 : getNo().hashCode());
        result = prime * result + ((getTons() == null) ? 0 : getTons().hashCode());
        result = prime * result + ((getScc() == null) ? 0 : getScc().hashCode());
        result = prime * result + ((getFueltype() == null) ? 0 : getFueltype().hashCode());
        result = prime * result + ((getFuelAusage() == null) ? 0 : getFuelAusage().hashCode());
        result = prime * result + ((getExfNo() == null) ? 0 : getExfNo().hashCode());
        result = prime * result + ((getExfHeight() == null) ? 0 : getExfHeight().hashCode());
        result = prime * result + ((getSmokeOutd() == null) ? 0 : getSmokeOutd().hashCode());
        result = prime * result + ((getSmokeOUtteM() == null) ? 0 : getSmokeOUtteM().hashCode());
        result = prime * result + ((getSmokeOutv() == null) ? 0 : getSmokeOutv().hashCode());
        result = prime * result + ((getExfMaterial() == null) ? 0 : getExfMaterial().hashCode());
        result = prime * result + ((getPm() == null) ? 0 : getPm().hashCode());
        result = prime * result + ((getPm10() == null) ? 0 : getPm10().hashCode());
        result = prime * result + ((getPm25() == null) ? 0 : getPm25().hashCode());
        result = prime * result + ((getVoc() == null) ? 0 : getVoc().hashCode());
        result = prime * result + ((getCo() == null) ? 0 : getCo().hashCode());
        result = prime * result + ((getNh3() == null) ? 0 : getNh3().hashCode());
        result = prime * result + ((getSo2() == null) ? 0 : getSo2().hashCode());
        result = prime * result + ((getNox() == null) ? 0 : getNox().hashCode());
        result = prime * result + ((getOc() == null) ? 0 : getOc().hashCode());
        result = prime * result + ((getBc() == null) ? 0 : getBc().hashCode());
        return result;
    }
}