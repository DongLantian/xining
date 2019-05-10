package com.nankai.xining.bean;

import java.io.Serializable;

public class STransport implements Serializable {
    private Integer id;

    private String year;

    private String countyid;

    private String oilname;

    private String address;

    private Double longitude;

    private Double latitude;

    private String scccode;

    private String storeMaterial;

    private Double ftk;

    private String sourceStorage;

    private String fueltype;

    private Double nh3Temf;

    private String nh3Temfunit;

    private Double vocTemf;

    private String vocTemfunit;

    private Double nh3Pemf;

    private String nh3Pemfunit;

    private Double vocPemf;

    private String vocPemfunit;

    private Double nh3Emission;

    private String nh3Emiunit;

    private Double vocEmission;

    private String vocEmiunit;

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

    public String getCountyid() {
        return countyid;
    }

    public void setCountyid(String countyid) {
        this.countyid = countyid == null ? null : countyid.trim();
    }

    public String getOilname() {
        return oilname;
    }

    public void setOilname(String oilname) {
        this.oilname = oilname == null ? null : oilname.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getScccode() {
        return scccode;
    }

    public void setScccode(String scccode) {
        this.scccode = scccode == null ? null : scccode.trim();
    }

    public String getStoreMaterial() {
        return storeMaterial;
    }

    public void setStoreMaterial(String storeMaterial) {
        this.storeMaterial = storeMaterial == null ? null : storeMaterial.trim();
    }

    public Double getFtk() {
        return ftk;
    }

    public void setFtk(Double ftk) {
        this.ftk = ftk;
    }

    public String getSourceStorage() {
        return sourceStorage;
    }

    public void setSourceStorage(String sourceStorage) {
        this.sourceStorage = sourceStorage == null ? null : sourceStorage.trim();
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype == null ? null : fueltype.trim();
    }

    public Double getNh3Temf() {
        return nh3Temf;
    }

    public void setNh3Temf(Double nh3Temf) {
        this.nh3Temf = nh3Temf;
    }

    public String getNh3Temfunit() {
        return nh3Temfunit;
    }

    public void setNh3Temfunit(String nh3Temfunit) {
        this.nh3Temfunit = nh3Temfunit == null ? null : nh3Temfunit.trim();
    }

    public Double getVocTemf() {
        return vocTemf;
    }

    public void setVocTemf(Double vocTemf) {
        this.vocTemf = vocTemf;
    }

    public String getVocTemfunit() {
        return vocTemfunit;
    }

    public void setVocTemfunit(String vocTemfunit) {
        this.vocTemfunit = vocTemfunit == null ? null : vocTemfunit.trim();
    }

    public Double getNh3Pemf() {
        return nh3Pemf;
    }

    public void setNh3Pemf(Double nh3Pemf) {
        this.nh3Pemf = nh3Pemf;
    }

    public String getNh3Pemfunit() {
        return nh3Pemfunit;
    }

    public void setNh3Pemfunit(String nh3Pemfunit) {
        this.nh3Pemfunit = nh3Pemfunit == null ? null : nh3Pemfunit.trim();
    }

    public Double getVocPemf() {
        return vocPemf;
    }

    public void setVocPemf(Double vocPemf) {
        this.vocPemf = vocPemf;
    }

    public String getVocPemfunit() {
        return vocPemfunit;
    }

    public void setVocPemfunit(String vocPemfunit) {
        this.vocPemfunit = vocPemfunit == null ? null : vocPemfunit.trim();
    }

    public Double getNh3Emission() {
        return nh3Emission;
    }

    public void setNh3Emission(Double nh3Emission) {
        this.nh3Emission = nh3Emission;
    }

    public String getNh3Emiunit() {
        return nh3Emiunit;
    }

    public void setNh3Emiunit(String nh3Emiunit) {
        this.nh3Emiunit = nh3Emiunit == null ? null : nh3Emiunit.trim();
    }

    public Double getVocEmission() {
        return vocEmission;
    }

    public void setVocEmission(Double vocEmission) {
        this.vocEmission = vocEmission;
    }

    public String getVocEmiunit() {
        return vocEmiunit;
    }

    public void setVocEmiunit(String vocEmiunit) {
        this.vocEmiunit = vocEmiunit == null ? null : vocEmiunit.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", year=").append(year);
        sb.append(", countyid=").append(countyid);
        sb.append(", oilname=").append(oilname);
        sb.append(", address=").append(address);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", scccode=").append(scccode);
        sb.append(", storeMaterial=").append(storeMaterial);
        sb.append(", ftk=").append(ftk);
        sb.append(", sourceStorage=").append(sourceStorage);
        sb.append(", fueltype=").append(fueltype);
        sb.append(", nh3Temf=").append(nh3Temf);
        sb.append(", nh3Temfunit=").append(nh3Temfunit);
        sb.append(", vocTemf=").append(vocTemf);
        sb.append(", vocTemfunit=").append(vocTemfunit);
        sb.append(", nh3Pemf=").append(nh3Pemf);
        sb.append(", nh3Pemfunit=").append(nh3Pemfunit);
        sb.append(", vocPemf=").append(vocPemf);
        sb.append(", vocPemfunit=").append(vocPemfunit);
        sb.append(", nh3Emission=").append(nh3Emission);
        sb.append(", nh3Emiunit=").append(nh3Emiunit);
        sb.append(", vocEmission=").append(vocEmission);
        sb.append(", vocEmiunit=").append(vocEmiunit);
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
        STransport other = (STransport) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getCountyid() == null ? other.getCountyid() == null : this.getCountyid().equals(other.getCountyid()))
            && (this.getOilname() == null ? other.getOilname() == null : this.getOilname().equals(other.getOilname()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getLongitude() == null ? other.getLongitude() == null : this.getLongitude().equals(other.getLongitude()))
            && (this.getLatitude() == null ? other.getLatitude() == null : this.getLatitude().equals(other.getLatitude()))
            && (this.getScccode() == null ? other.getScccode() == null : this.getScccode().equals(other.getScccode()))
            && (this.getStoreMaterial() == null ? other.getStoreMaterial() == null : this.getStoreMaterial().equals(other.getStoreMaterial()))
            && (this.getFtk() == null ? other.getFtk() == null : this.getFtk().equals(other.getFtk()))
            && (this.getSourceStorage() == null ? other.getSourceStorage() == null : this.getSourceStorage().equals(other.getSourceStorage()))
            && (this.getFueltype() == null ? other.getFueltype() == null : this.getFueltype().equals(other.getFueltype()))
            && (this.getNh3Temf() == null ? other.getNh3Temf() == null : this.getNh3Temf().equals(other.getNh3Temf()))
            && (this.getNh3Temfunit() == null ? other.getNh3Temfunit() == null : this.getNh3Temfunit().equals(other.getNh3Temfunit()))
            && (this.getVocTemf() == null ? other.getVocTemf() == null : this.getVocTemf().equals(other.getVocTemf()))
            && (this.getVocTemfunit() == null ? other.getVocTemfunit() == null : this.getVocTemfunit().equals(other.getVocTemfunit()))
            && (this.getNh3Pemf() == null ? other.getNh3Pemf() == null : this.getNh3Pemf().equals(other.getNh3Pemf()))
            && (this.getNh3Pemfunit() == null ? other.getNh3Pemfunit() == null : this.getNh3Pemfunit().equals(other.getNh3Pemfunit()))
            && (this.getVocPemf() == null ? other.getVocPemf() == null : this.getVocPemf().equals(other.getVocPemf()))
            && (this.getVocPemfunit() == null ? other.getVocPemfunit() == null : this.getVocPemfunit().equals(other.getVocPemfunit()))
            && (this.getNh3Emission() == null ? other.getNh3Emission() == null : this.getNh3Emission().equals(other.getNh3Emission()))
            && (this.getNh3Emiunit() == null ? other.getNh3Emiunit() == null : this.getNh3Emiunit().equals(other.getNh3Emiunit()))
            && (this.getVocEmission() == null ? other.getVocEmission() == null : this.getVocEmission().equals(other.getVocEmission()))
            && (this.getVocEmiunit() == null ? other.getVocEmiunit() == null : this.getVocEmiunit().equals(other.getVocEmiunit()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getCountyid() == null) ? 0 : getCountyid().hashCode());
        result = prime * result + ((getOilname() == null) ? 0 : getOilname().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        result = prime * result + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        result = prime * result + ((getScccode() == null) ? 0 : getScccode().hashCode());
        result = prime * result + ((getStoreMaterial() == null) ? 0 : getStoreMaterial().hashCode());
        result = prime * result + ((getFtk() == null) ? 0 : getFtk().hashCode());
        result = prime * result + ((getSourceStorage() == null) ? 0 : getSourceStorage().hashCode());
        result = prime * result + ((getFueltype() == null) ? 0 : getFueltype().hashCode());
        result = prime * result + ((getNh3Temf() == null) ? 0 : getNh3Temf().hashCode());
        result = prime * result + ((getNh3Temfunit() == null) ? 0 : getNh3Temfunit().hashCode());
        result = prime * result + ((getVocTemf() == null) ? 0 : getVocTemf().hashCode());
        result = prime * result + ((getVocTemfunit() == null) ? 0 : getVocTemfunit().hashCode());
        result = prime * result + ((getNh3Pemf() == null) ? 0 : getNh3Pemf().hashCode());
        result = prime * result + ((getNh3Pemfunit() == null) ? 0 : getNh3Pemfunit().hashCode());
        result = prime * result + ((getVocPemf() == null) ? 0 : getVocPemf().hashCode());
        result = prime * result + ((getVocPemfunit() == null) ? 0 : getVocPemfunit().hashCode());
        result = prime * result + ((getNh3Emission() == null) ? 0 : getNh3Emission().hashCode());
        result = prime * result + ((getNh3Emiunit() == null) ? 0 : getNh3Emiunit().hashCode());
        result = prime * result + ((getVocEmission() == null) ? 0 : getVocEmission().hashCode());
        result = prime * result + ((getVocEmiunit() == null) ? 0 : getVocEmiunit().hashCode());
        return result;
    }
}