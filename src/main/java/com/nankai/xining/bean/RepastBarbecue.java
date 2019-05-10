package com.nankai.xining.bean;

import java.io.Serializable;

public class RepastBarbecue implements Serializable {
    private Integer id;

    private Integer factoryid;

    private String year;

    private String scccode;

    private Integer annualRuntime;

    private Double dayRunntime;

    private Double pmEmf;

    private String pmEmfunit;

    private Double pm10Emf;

    private String pm10Emfunit;

    private Double pm25Emf;

    private String pm25Emfunit;

    private Double so2Emf;

    private String so2Emfunit;

    private Double noxEmf;

    private String noxEmfunit;

    private Double coEmf;

    private String coEmfunit;

    private Double nh3Emf;

    private String nh3Emfunit;

    private Double vocEmf;

    private String vocEmfunit;

    private Double ocEmf;

    private String ocEmfunit;

    private Double bcEmf;

    private String bcEmfunit;

    private Double pmEmission;

    private String pmEmiunit;

    private Double pm10Emission;

    private String pm10Emiunit;

    private Double pm25Emission;

    private String pm25Emiunit;

    private Double so2Emission;

    private String so2Emiunit;

    private Double noxEmission;

    private String noxEmiunit;

    private Double coEmission;

    private String coEmiunit;

    private Double nh3Emission;

    private String nh3Emiunit;

    private Double vocEmission;

    private String vocEmiunit;

    private Double ocEmission;

    private String ocEmiunit;

    private Double bcEmission;

    private String bcEmiunit;

    private Boolean flag;

    private Double gasConsumption;

    private Double coalConsumption;

    private Double powerConsumption;

    private Double methanolConsumption;

    private Double otherConsumption;

    private String otherConunit;

    private Double mealConsumption;

    private String sourceDiscrip;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFactoryid() {
        return factoryid;
    }

    public void setFactoryid(Integer factoryid) {
        this.factoryid = factoryid;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getScccode() {
        return scccode;
    }

    public void setScccode(String scccode) {
        this.scccode = scccode == null ? null : scccode.trim();
    }

    public Integer getAnnualRuntime() {
        return annualRuntime;
    }

    public void setAnnualRuntime(Integer annualRuntime) {
        this.annualRuntime = annualRuntime;
    }

    public Double getDayRunntime() {
        return dayRunntime;
    }

    public void setDayRunntime(Double dayRunntime) {
        this.dayRunntime = dayRunntime;
    }

    public Double getPmEmf() {
        return pmEmf;
    }

    public void setPmEmf(Double pmEmf) {
        this.pmEmf = pmEmf;
    }

    public String getPmEmfunit() {
        return pmEmfunit;
    }

    public void setPmEmfunit(String pmEmfunit) {
        this.pmEmfunit = pmEmfunit == null ? null : pmEmfunit.trim();
    }

    public Double getPm10Emf() {
        return pm10Emf;
    }

    public void setPm10Emf(Double pm10Emf) {
        this.pm10Emf = pm10Emf;
    }

    public String getPm10Emfunit() {
        return pm10Emfunit;
    }

    public void setPm10Emfunit(String pm10Emfunit) {
        this.pm10Emfunit = pm10Emfunit == null ? null : pm10Emfunit.trim();
    }

    public Double getPm25Emf() {
        return pm25Emf;
    }

    public void setPm25Emf(Double pm25Emf) {
        this.pm25Emf = pm25Emf;
    }

    public String getPm25Emfunit() {
        return pm25Emfunit;
    }

    public void setPm25Emfunit(String pm25Emfunit) {
        this.pm25Emfunit = pm25Emfunit == null ? null : pm25Emfunit.trim();
    }

    public Double getSo2Emf() {
        return so2Emf;
    }

    public void setSo2Emf(Double so2Emf) {
        this.so2Emf = so2Emf;
    }

    public String getSo2Emfunit() {
        return so2Emfunit;
    }

    public void setSo2Emfunit(String so2Emfunit) {
        this.so2Emfunit = so2Emfunit == null ? null : so2Emfunit.trim();
    }

    public Double getNoxEmf() {
        return noxEmf;
    }

    public void setNoxEmf(Double noxEmf) {
        this.noxEmf = noxEmf;
    }

    public String getNoxEmfunit() {
        return noxEmfunit;
    }

    public void setNoxEmfunit(String noxEmfunit) {
        this.noxEmfunit = noxEmfunit == null ? null : noxEmfunit.trim();
    }

    public Double getCoEmf() {
        return coEmf;
    }

    public void setCoEmf(Double coEmf) {
        this.coEmf = coEmf;
    }

    public String getCoEmfunit() {
        return coEmfunit;
    }

    public void setCoEmfunit(String coEmfunit) {
        this.coEmfunit = coEmfunit == null ? null : coEmfunit.trim();
    }

    public Double getNh3Emf() {
        return nh3Emf;
    }

    public void setNh3Emf(Double nh3Emf) {
        this.nh3Emf = nh3Emf;
    }

    public String getNh3Emfunit() {
        return nh3Emfunit;
    }

    public void setNh3Emfunit(String nh3Emfunit) {
        this.nh3Emfunit = nh3Emfunit == null ? null : nh3Emfunit.trim();
    }

    public Double getVocEmf() {
        return vocEmf;
    }

    public void setVocEmf(Double vocEmf) {
        this.vocEmf = vocEmf;
    }

    public String getVocEmfunit() {
        return vocEmfunit;
    }

    public void setVocEmfunit(String vocEmfunit) {
        this.vocEmfunit = vocEmfunit == null ? null : vocEmfunit.trim();
    }

    public Double getOcEmf() {
        return ocEmf;
    }

    public void setOcEmf(Double ocEmf) {
        this.ocEmf = ocEmf;
    }

    public String getOcEmfunit() {
        return ocEmfunit;
    }

    public void setOcEmfunit(String ocEmfunit) {
        this.ocEmfunit = ocEmfunit == null ? null : ocEmfunit.trim();
    }

    public Double getBcEmf() {
        return bcEmf;
    }

    public void setBcEmf(Double bcEmf) {
        this.bcEmf = bcEmf;
    }

    public String getBcEmfunit() {
        return bcEmfunit;
    }

    public void setBcEmfunit(String bcEmfunit) {
        this.bcEmfunit = bcEmfunit == null ? null : bcEmfunit.trim();
    }

    public Double getPmEmission() {
        return pmEmission;
    }

    public void setPmEmission(Double pmEmission) {
        this.pmEmission = pmEmission;
    }

    public String getPmEmiunit() {
        return pmEmiunit;
    }

    public void setPmEmiunit(String pmEmiunit) {
        this.pmEmiunit = pmEmiunit == null ? null : pmEmiunit.trim();
    }

    public Double getPm10Emission() {
        return pm10Emission;
    }

    public void setPm10Emission(Double pm10Emission) {
        this.pm10Emission = pm10Emission;
    }

    public String getPm10Emiunit() {
        return pm10Emiunit;
    }

    public void setPm10Emiunit(String pm10Emiunit) {
        this.pm10Emiunit = pm10Emiunit == null ? null : pm10Emiunit.trim();
    }

    public Double getPm25Emission() {
        return pm25Emission;
    }

    public void setPm25Emission(Double pm25Emission) {
        this.pm25Emission = pm25Emission;
    }

    public String getPm25Emiunit() {
        return pm25Emiunit;
    }

    public void setPm25Emiunit(String pm25Emiunit) {
        this.pm25Emiunit = pm25Emiunit == null ? null : pm25Emiunit.trim();
    }

    public Double getSo2Emission() {
        return so2Emission;
    }

    public void setSo2Emission(Double so2Emission) {
        this.so2Emission = so2Emission;
    }

    public String getSo2Emiunit() {
        return so2Emiunit;
    }

    public void setSo2Emiunit(String so2Emiunit) {
        this.so2Emiunit = so2Emiunit == null ? null : so2Emiunit.trim();
    }

    public Double getNoxEmission() {
        return noxEmission;
    }

    public void setNoxEmission(Double noxEmission) {
        this.noxEmission = noxEmission;
    }

    public String getNoxEmiunit() {
        return noxEmiunit;
    }

    public void setNoxEmiunit(String noxEmiunit) {
        this.noxEmiunit = noxEmiunit == null ? null : noxEmiunit.trim();
    }

    public Double getCoEmission() {
        return coEmission;
    }

    public void setCoEmission(Double coEmission) {
        this.coEmission = coEmission;
    }

    public String getCoEmiunit() {
        return coEmiunit;
    }

    public void setCoEmiunit(String coEmiunit) {
        this.coEmiunit = coEmiunit == null ? null : coEmiunit.trim();
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

    public Double getOcEmission() {
        return ocEmission;
    }

    public void setOcEmission(Double ocEmission) {
        this.ocEmission = ocEmission;
    }

    public String getOcEmiunit() {
        return ocEmiunit;
    }

    public void setOcEmiunit(String ocEmiunit) {
        this.ocEmiunit = ocEmiunit == null ? null : ocEmiunit.trim();
    }

    public Double getBcEmission() {
        return bcEmission;
    }

    public void setBcEmission(Double bcEmission) {
        this.bcEmission = bcEmission;
    }

    public String getBcEmiunit() {
        return bcEmiunit;
    }

    public void setBcEmiunit(String bcEmiunit) {
        this.bcEmiunit = bcEmiunit == null ? null : bcEmiunit.trim();
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Double getGasConsumption() {
        return gasConsumption;
    }

    public void setGasConsumption(Double gasConsumption) {
        this.gasConsumption = gasConsumption;
    }

    public Double getCoalConsumption() {
        return coalConsumption;
    }

    public void setCoalConsumption(Double coalConsumption) {
        this.coalConsumption = coalConsumption;
    }

    public Double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(Double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public Double getMethanolConsumption() {
        return methanolConsumption;
    }

    public void setMethanolConsumption(Double methanolConsumption) {
        this.methanolConsumption = methanolConsumption;
    }

    public Double getOtherConsumption() {
        return otherConsumption;
    }

    public void setOtherConsumption(Double otherConsumption) {
        this.otherConsumption = otherConsumption;
    }

    public String getOtherConunit() {
        return otherConunit;
    }

    public void setOtherConunit(String otherConunit) {
        this.otherConunit = otherConunit == null ? null : otherConunit.trim();
    }

    public Double getMealConsumption() {
        return mealConsumption;
    }

    public void setMealConsumption(Double mealConsumption) {
        this.mealConsumption = mealConsumption;
    }

    public String getSourceDiscrip() {
        return sourceDiscrip;
    }

    public void setSourceDiscrip(String sourceDiscrip) {
        this.sourceDiscrip = sourceDiscrip == null ? null : sourceDiscrip.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", factoryid=").append(factoryid);
        sb.append(", year=").append(year);
        sb.append(", scccode=").append(scccode);
        sb.append(", annualRuntime=").append(annualRuntime);
        sb.append(", dayRunntime=").append(dayRunntime);
        sb.append(", pmEmf=").append(pmEmf);
        sb.append(", pmEmfunit=").append(pmEmfunit);
        sb.append(", pm10Emf=").append(pm10Emf);
        sb.append(", pm10Emfunit=").append(pm10Emfunit);
        sb.append(", pm25Emf=").append(pm25Emf);
        sb.append(", pm25Emfunit=").append(pm25Emfunit);
        sb.append(", so2Emf=").append(so2Emf);
        sb.append(", so2Emfunit=").append(so2Emfunit);
        sb.append(", noxEmf=").append(noxEmf);
        sb.append(", noxEmfunit=").append(noxEmfunit);
        sb.append(", coEmf=").append(coEmf);
        sb.append(", coEmfunit=").append(coEmfunit);
        sb.append(", nh3Emf=").append(nh3Emf);
        sb.append(", nh3Emfunit=").append(nh3Emfunit);
        sb.append(", vocEmf=").append(vocEmf);
        sb.append(", vocEmfunit=").append(vocEmfunit);
        sb.append(", ocEmf=").append(ocEmf);
        sb.append(", ocEmfunit=").append(ocEmfunit);
        sb.append(", bcEmf=").append(bcEmf);
        sb.append(", bcEmfunit=").append(bcEmfunit);
        sb.append(", pmEmission=").append(pmEmission);
        sb.append(", pmEmiunit=").append(pmEmiunit);
        sb.append(", pm10Emission=").append(pm10Emission);
        sb.append(", pm10Emiunit=").append(pm10Emiunit);
        sb.append(", pm25Emission=").append(pm25Emission);
        sb.append(", pm25Emiunit=").append(pm25Emiunit);
        sb.append(", so2Emission=").append(so2Emission);
        sb.append(", so2Emiunit=").append(so2Emiunit);
        sb.append(", noxEmission=").append(noxEmission);
        sb.append(", noxEmiunit=").append(noxEmiunit);
        sb.append(", coEmission=").append(coEmission);
        sb.append(", coEmiunit=").append(coEmiunit);
        sb.append(", nh3Emission=").append(nh3Emission);
        sb.append(", nh3Emiunit=").append(nh3Emiunit);
        sb.append(", vocEmission=").append(vocEmission);
        sb.append(", vocEmiunit=").append(vocEmiunit);
        sb.append(", ocEmission=").append(ocEmission);
        sb.append(", ocEmiunit=").append(ocEmiunit);
        sb.append(", bcEmission=").append(bcEmission);
        sb.append(", bcEmiunit=").append(bcEmiunit);
        sb.append(", flag=").append(flag);
        sb.append(", gasConsumption=").append(gasConsumption);
        sb.append(", coalConsumption=").append(coalConsumption);
        sb.append(", powerConsumption=").append(powerConsumption);
        sb.append(", methanolConsumption=").append(methanolConsumption);
        sb.append(", otherConsumption=").append(otherConsumption);
        sb.append(", otherConunit=").append(otherConunit);
        sb.append(", mealConsumption=").append(mealConsumption);
        sb.append(", sourceDiscrip=").append(sourceDiscrip);
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
        RepastBarbecue other = (RepastBarbecue) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFactoryid() == null ? other.getFactoryid() == null : this.getFactoryid().equals(other.getFactoryid()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getScccode() == null ? other.getScccode() == null : this.getScccode().equals(other.getScccode()))
            && (this.getAnnualRuntime() == null ? other.getAnnualRuntime() == null : this.getAnnualRuntime().equals(other.getAnnualRuntime()))
            && (this.getDayRunntime() == null ? other.getDayRunntime() == null : this.getDayRunntime().equals(other.getDayRunntime()))
            && (this.getPmEmf() == null ? other.getPmEmf() == null : this.getPmEmf().equals(other.getPmEmf()))
            && (this.getPmEmfunit() == null ? other.getPmEmfunit() == null : this.getPmEmfunit().equals(other.getPmEmfunit()))
            && (this.getPm10Emf() == null ? other.getPm10Emf() == null : this.getPm10Emf().equals(other.getPm10Emf()))
            && (this.getPm10Emfunit() == null ? other.getPm10Emfunit() == null : this.getPm10Emfunit().equals(other.getPm10Emfunit()))
            && (this.getPm25Emf() == null ? other.getPm25Emf() == null : this.getPm25Emf().equals(other.getPm25Emf()))
            && (this.getPm25Emfunit() == null ? other.getPm25Emfunit() == null : this.getPm25Emfunit().equals(other.getPm25Emfunit()))
            && (this.getSo2Emf() == null ? other.getSo2Emf() == null : this.getSo2Emf().equals(other.getSo2Emf()))
            && (this.getSo2Emfunit() == null ? other.getSo2Emfunit() == null : this.getSo2Emfunit().equals(other.getSo2Emfunit()))
            && (this.getNoxEmf() == null ? other.getNoxEmf() == null : this.getNoxEmf().equals(other.getNoxEmf()))
            && (this.getNoxEmfunit() == null ? other.getNoxEmfunit() == null : this.getNoxEmfunit().equals(other.getNoxEmfunit()))
            && (this.getCoEmf() == null ? other.getCoEmf() == null : this.getCoEmf().equals(other.getCoEmf()))
            && (this.getCoEmfunit() == null ? other.getCoEmfunit() == null : this.getCoEmfunit().equals(other.getCoEmfunit()))
            && (this.getNh3Emf() == null ? other.getNh3Emf() == null : this.getNh3Emf().equals(other.getNh3Emf()))
            && (this.getNh3Emfunit() == null ? other.getNh3Emfunit() == null : this.getNh3Emfunit().equals(other.getNh3Emfunit()))
            && (this.getVocEmf() == null ? other.getVocEmf() == null : this.getVocEmf().equals(other.getVocEmf()))
            && (this.getVocEmfunit() == null ? other.getVocEmfunit() == null : this.getVocEmfunit().equals(other.getVocEmfunit()))
            && (this.getOcEmf() == null ? other.getOcEmf() == null : this.getOcEmf().equals(other.getOcEmf()))
            && (this.getOcEmfunit() == null ? other.getOcEmfunit() == null : this.getOcEmfunit().equals(other.getOcEmfunit()))
            && (this.getBcEmf() == null ? other.getBcEmf() == null : this.getBcEmf().equals(other.getBcEmf()))
            && (this.getBcEmfunit() == null ? other.getBcEmfunit() == null : this.getBcEmfunit().equals(other.getBcEmfunit()))
            && (this.getPmEmission() == null ? other.getPmEmission() == null : this.getPmEmission().equals(other.getPmEmission()))
            && (this.getPmEmiunit() == null ? other.getPmEmiunit() == null : this.getPmEmiunit().equals(other.getPmEmiunit()))
            && (this.getPm10Emission() == null ? other.getPm10Emission() == null : this.getPm10Emission().equals(other.getPm10Emission()))
            && (this.getPm10Emiunit() == null ? other.getPm10Emiunit() == null : this.getPm10Emiunit().equals(other.getPm10Emiunit()))
            && (this.getPm25Emission() == null ? other.getPm25Emission() == null : this.getPm25Emission().equals(other.getPm25Emission()))
            && (this.getPm25Emiunit() == null ? other.getPm25Emiunit() == null : this.getPm25Emiunit().equals(other.getPm25Emiunit()))
            && (this.getSo2Emission() == null ? other.getSo2Emission() == null : this.getSo2Emission().equals(other.getSo2Emission()))
            && (this.getSo2Emiunit() == null ? other.getSo2Emiunit() == null : this.getSo2Emiunit().equals(other.getSo2Emiunit()))
            && (this.getNoxEmission() == null ? other.getNoxEmission() == null : this.getNoxEmission().equals(other.getNoxEmission()))
            && (this.getNoxEmiunit() == null ? other.getNoxEmiunit() == null : this.getNoxEmiunit().equals(other.getNoxEmiunit()))
            && (this.getCoEmission() == null ? other.getCoEmission() == null : this.getCoEmission().equals(other.getCoEmission()))
            && (this.getCoEmiunit() == null ? other.getCoEmiunit() == null : this.getCoEmiunit().equals(other.getCoEmiunit()))
            && (this.getNh3Emission() == null ? other.getNh3Emission() == null : this.getNh3Emission().equals(other.getNh3Emission()))
            && (this.getNh3Emiunit() == null ? other.getNh3Emiunit() == null : this.getNh3Emiunit().equals(other.getNh3Emiunit()))
            && (this.getVocEmission() == null ? other.getVocEmission() == null : this.getVocEmission().equals(other.getVocEmission()))
            && (this.getVocEmiunit() == null ? other.getVocEmiunit() == null : this.getVocEmiunit().equals(other.getVocEmiunit()))
            && (this.getOcEmission() == null ? other.getOcEmission() == null : this.getOcEmission().equals(other.getOcEmission()))
            && (this.getOcEmiunit() == null ? other.getOcEmiunit() == null : this.getOcEmiunit().equals(other.getOcEmiunit()))
            && (this.getBcEmission() == null ? other.getBcEmission() == null : this.getBcEmission().equals(other.getBcEmission()))
            && (this.getBcEmiunit() == null ? other.getBcEmiunit() == null : this.getBcEmiunit().equals(other.getBcEmiunit()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getGasConsumption() == null ? other.getGasConsumption() == null : this.getGasConsumption().equals(other.getGasConsumption()))
            && (this.getCoalConsumption() == null ? other.getCoalConsumption() == null : this.getCoalConsumption().equals(other.getCoalConsumption()))
            && (this.getPowerConsumption() == null ? other.getPowerConsumption() == null : this.getPowerConsumption().equals(other.getPowerConsumption()))
            && (this.getMethanolConsumption() == null ? other.getMethanolConsumption() == null : this.getMethanolConsumption().equals(other.getMethanolConsumption()))
            && (this.getOtherConsumption() == null ? other.getOtherConsumption() == null : this.getOtherConsumption().equals(other.getOtherConsumption()))
            && (this.getOtherConunit() == null ? other.getOtherConunit() == null : this.getOtherConunit().equals(other.getOtherConunit()))
            && (this.getMealConsumption() == null ? other.getMealConsumption() == null : this.getMealConsumption().equals(other.getMealConsumption()))
            && (this.getSourceDiscrip() == null ? other.getSourceDiscrip() == null : this.getSourceDiscrip().equals(other.getSourceDiscrip()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFactoryid() == null) ? 0 : getFactoryid().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getScccode() == null) ? 0 : getScccode().hashCode());
        result = prime * result + ((getAnnualRuntime() == null) ? 0 : getAnnualRuntime().hashCode());
        result = prime * result + ((getDayRunntime() == null) ? 0 : getDayRunntime().hashCode());
        result = prime * result + ((getPmEmf() == null) ? 0 : getPmEmf().hashCode());
        result = prime * result + ((getPmEmfunit() == null) ? 0 : getPmEmfunit().hashCode());
        result = prime * result + ((getPm10Emf() == null) ? 0 : getPm10Emf().hashCode());
        result = prime * result + ((getPm10Emfunit() == null) ? 0 : getPm10Emfunit().hashCode());
        result = prime * result + ((getPm25Emf() == null) ? 0 : getPm25Emf().hashCode());
        result = prime * result + ((getPm25Emfunit() == null) ? 0 : getPm25Emfunit().hashCode());
        result = prime * result + ((getSo2Emf() == null) ? 0 : getSo2Emf().hashCode());
        result = prime * result + ((getSo2Emfunit() == null) ? 0 : getSo2Emfunit().hashCode());
        result = prime * result + ((getNoxEmf() == null) ? 0 : getNoxEmf().hashCode());
        result = prime * result + ((getNoxEmfunit() == null) ? 0 : getNoxEmfunit().hashCode());
        result = prime * result + ((getCoEmf() == null) ? 0 : getCoEmf().hashCode());
        result = prime * result + ((getCoEmfunit() == null) ? 0 : getCoEmfunit().hashCode());
        result = prime * result + ((getNh3Emf() == null) ? 0 : getNh3Emf().hashCode());
        result = prime * result + ((getNh3Emfunit() == null) ? 0 : getNh3Emfunit().hashCode());
        result = prime * result + ((getVocEmf() == null) ? 0 : getVocEmf().hashCode());
        result = prime * result + ((getVocEmfunit() == null) ? 0 : getVocEmfunit().hashCode());
        result = prime * result + ((getOcEmf() == null) ? 0 : getOcEmf().hashCode());
        result = prime * result + ((getOcEmfunit() == null) ? 0 : getOcEmfunit().hashCode());
        result = prime * result + ((getBcEmf() == null) ? 0 : getBcEmf().hashCode());
        result = prime * result + ((getBcEmfunit() == null) ? 0 : getBcEmfunit().hashCode());
        result = prime * result + ((getPmEmission() == null) ? 0 : getPmEmission().hashCode());
        result = prime * result + ((getPmEmiunit() == null) ? 0 : getPmEmiunit().hashCode());
        result = prime * result + ((getPm10Emission() == null) ? 0 : getPm10Emission().hashCode());
        result = prime * result + ((getPm10Emiunit() == null) ? 0 : getPm10Emiunit().hashCode());
        result = prime * result + ((getPm25Emission() == null) ? 0 : getPm25Emission().hashCode());
        result = prime * result + ((getPm25Emiunit() == null) ? 0 : getPm25Emiunit().hashCode());
        result = prime * result + ((getSo2Emission() == null) ? 0 : getSo2Emission().hashCode());
        result = prime * result + ((getSo2Emiunit() == null) ? 0 : getSo2Emiunit().hashCode());
        result = prime * result + ((getNoxEmission() == null) ? 0 : getNoxEmission().hashCode());
        result = prime * result + ((getNoxEmiunit() == null) ? 0 : getNoxEmiunit().hashCode());
        result = prime * result + ((getCoEmission() == null) ? 0 : getCoEmission().hashCode());
        result = prime * result + ((getCoEmiunit() == null) ? 0 : getCoEmiunit().hashCode());
        result = prime * result + ((getNh3Emission() == null) ? 0 : getNh3Emission().hashCode());
        result = prime * result + ((getNh3Emiunit() == null) ? 0 : getNh3Emiunit().hashCode());
        result = prime * result + ((getVocEmission() == null) ? 0 : getVocEmission().hashCode());
        result = prime * result + ((getVocEmiunit() == null) ? 0 : getVocEmiunit().hashCode());
        result = prime * result + ((getOcEmission() == null) ? 0 : getOcEmission().hashCode());
        result = prime * result + ((getOcEmiunit() == null) ? 0 : getOcEmiunit().hashCode());
        result = prime * result + ((getBcEmission() == null) ? 0 : getBcEmission().hashCode());
        result = prime * result + ((getBcEmiunit() == null) ? 0 : getBcEmiunit().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getGasConsumption() == null) ? 0 : getGasConsumption().hashCode());
        result = prime * result + ((getCoalConsumption() == null) ? 0 : getCoalConsumption().hashCode());
        result = prime * result + ((getPowerConsumption() == null) ? 0 : getPowerConsumption().hashCode());
        result = prime * result + ((getMethanolConsumption() == null) ? 0 : getMethanolConsumption().hashCode());
        result = prime * result + ((getOtherConsumption() == null) ? 0 : getOtherConsumption().hashCode());
        result = prime * result + ((getOtherConunit() == null) ? 0 : getOtherConunit().hashCode());
        result = prime * result + ((getMealConsumption() == null) ? 0 : getMealConsumption().hashCode());
        result = prime * result + ((getSourceDiscrip() == null) ? 0 : getSourceDiscrip().hashCode());
        return result;
    }
}