package com.nankai.xining.bean;

import java.io.Serializable;

public class Kiln implements Serializable {
    private Integer id;

    private Integer nkNo;

    private Integer exhustId;

    private String functio;

    private String kilnModel;

    private String model;

    private String fueltype;

    private String scccode;

    private Double kilnFuelAusage;

    private String kilnFuelAusageunit;

    private Integer nitreremoveid;

    private Integer dustremoveid;

    private Integer sulphurremoveid;

    private Double coalash;

    private Double coalVolatilisation;

    private Double coalsulfur;

    private Double pm10;

    private Double pm25;

    private Double co;

    private Double voc;

    private Double pm;

    private Double so2;

    private Double nox;

    private Double nh3;

    private Double oc;

    private Double bc;

    private Double feiqiti;

    private Double so2out;

    private Double pmout;

    private Double noxout;

    private Double janUseamount;

    private Double febUseamount;

    private Double marUseamount;

    private Double aprUseamount;

    private Double mayUseamount;

    private Double juneUseamount;

    private Double julyUseamount;

    private Double augUseamount;

    private Double septUseamount;

    private Double octUseAmount;

    private Double novUseamount;

    private Double decUseamount;

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

    public Integer getExhustId() {
        return exhustId;
    }

    public void setExhustId(Integer exhustId) {
        this.exhustId = exhustId;
    }

    public String getFunctio() {
        return functio;
    }

    public void setFunctio(String functio) {
        this.functio = functio == null ? null : functio.trim();
    }

    public String getKilnModel() {
        return kilnModel;
    }

    public void setKilnModel(String kilnModel) {
        this.kilnModel = kilnModel == null ? null : kilnModel.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype == null ? null : fueltype.trim();
    }

    public String getScccode() {
        return scccode;
    }

    public void setScccode(String scccode) {
        this.scccode = scccode == null ? null : scccode.trim();
    }

    public Double getKilnFuelAusage() {
        return kilnFuelAusage;
    }

    public void setKilnFuelAusage(Double kilnFuelAusage) {
        this.kilnFuelAusage = kilnFuelAusage;
    }

    public String getKilnFuelAusageunit() {
        return kilnFuelAusageunit;
    }

    public void setKilnFuelAusageunit(String kilnFuelAusageunit) {
        this.kilnFuelAusageunit = kilnFuelAusageunit == null ? null : kilnFuelAusageunit.trim();
    }

    public Integer getNitreremoveid() {
        return nitreremoveid;
    }

    public void setNitreremoveid(Integer nitreremoveid) {
        this.nitreremoveid = nitreremoveid;
    }

    public Integer getDustremoveid() {
        return dustremoveid;
    }

    public void setDustremoveid(Integer dustremoveid) {
        this.dustremoveid = dustremoveid;
    }

    public Integer getSulphurremoveid() {
        return sulphurremoveid;
    }

    public void setSulphurremoveid(Integer sulphurremoveid) {
        this.sulphurremoveid = sulphurremoveid;
    }

    public Double getCoalash() {
        return coalash;
    }

    public void setCoalash(Double coalash) {
        this.coalash = coalash;
    }

    public Double getCoalVolatilisation() {
        return coalVolatilisation;
    }

    public void setCoalVolatilisation(Double coalVolatilisation) {
        this.coalVolatilisation = coalVolatilisation;
    }

    public Double getCoalsulfur() {
        return coalsulfur;
    }

    public void setCoalsulfur(Double coalsulfur) {
        this.coalsulfur = coalsulfur;
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

    public Double getNh3() {
        return nh3;
    }

    public void setNh3(Double nh3) {
        this.nh3 = nh3;
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

    public Double getFeiqiti() {
        return feiqiti;
    }

    public void setFeiqiti(Double feiqiti) {
        this.feiqiti = feiqiti;
    }

    public Double getSo2out() {
        return so2out;
    }

    public void setSo2out(Double so2out) {
        this.so2out = so2out;
    }

    public Double getPmout() {
        return pmout;
    }

    public void setPmout(Double pmout) {
        this.pmout = pmout;
    }

    public Double getNoxout() {
        return noxout;
    }

    public void setNoxout(Double noxout) {
        this.noxout = noxout;
    }

    public Double getJanUseamount() {
        return janUseamount;
    }

    public void setJanUseamount(Double janUseamount) {
        this.janUseamount = janUseamount;
    }

    public Double getFebUseamount() {
        return febUseamount;
    }

    public void setFebUseamount(Double febUseamount) {
        this.febUseamount = febUseamount;
    }

    public Double getMarUseamount() {
        return marUseamount;
    }

    public void setMarUseamount(Double marUseamount) {
        this.marUseamount = marUseamount;
    }

    public Double getAprUseamount() {
        return aprUseamount;
    }

    public void setAprUseamount(Double aprUseamount) {
        this.aprUseamount = aprUseamount;
    }

    public Double getMayUseamount() {
        return mayUseamount;
    }

    public void setMayUseamount(Double mayUseamount) {
        this.mayUseamount = mayUseamount;
    }

    public Double getJuneUseamount() {
        return juneUseamount;
    }

    public void setJuneUseamount(Double juneUseamount) {
        this.juneUseamount = juneUseamount;
    }

    public Double getJulyUseamount() {
        return julyUseamount;
    }

    public void setJulyUseamount(Double julyUseamount) {
        this.julyUseamount = julyUseamount;
    }

    public Double getAugUseamount() {
        return augUseamount;
    }

    public void setAugUseamount(Double augUseamount) {
        this.augUseamount = augUseamount;
    }

    public Double getSeptUseamount() {
        return septUseamount;
    }

    public void setSeptUseamount(Double septUseamount) {
        this.septUseamount = septUseamount;
    }

    public Double getOctUseAmount() {
        return octUseAmount;
    }

    public void setOctUseAmount(Double octUseAmount) {
        this.octUseAmount = octUseAmount;
    }

    public Double getNovUseamount() {
        return novUseamount;
    }

    public void setNovUseamount(Double novUseamount) {
        this.novUseamount = novUseamount;
    }

    public Double getDecUseamount() {
        return decUseamount;
    }

    public void setDecUseamount(Double decUseamount) {
        this.decUseamount = decUseamount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", nkNo=").append(nkNo);
        sb.append(", exhustId=").append(exhustId);
        sb.append(", functio=").append(functio);
        sb.append(", kilnModel=").append(kilnModel);
        sb.append(", model=").append(model);
        sb.append(", fueltype=").append(fueltype);
        sb.append(", scccode=").append(scccode);
        sb.append(", kilnFuelAusage=").append(kilnFuelAusage);
        sb.append(", kilnFuelAusageunit=").append(kilnFuelAusageunit);
        sb.append(", nitreremoveid=").append(nitreremoveid);
        sb.append(", dustremoveid=").append(dustremoveid);
        sb.append(", sulphurremoveid=").append(sulphurremoveid);
        sb.append(", coalash=").append(coalash);
        sb.append(", coalVolatilisation=").append(coalVolatilisation);
        sb.append(", coalsulfur=").append(coalsulfur);
        sb.append(", pm10=").append(pm10);
        sb.append(", pm25=").append(pm25);
        sb.append(", co=").append(co);
        sb.append(", voc=").append(voc);
        sb.append(", pm=").append(pm);
        sb.append(", so2=").append(so2);
        sb.append(", nox=").append(nox);
        sb.append(", nh3=").append(nh3);
        sb.append(", oc=").append(oc);
        sb.append(", bc=").append(bc);
        sb.append(", feiqiti=").append(feiqiti);
        sb.append(", so2out=").append(so2out);
        sb.append(", pmout=").append(pmout);
        sb.append(", noxout=").append(noxout);
        sb.append(", janUseamount=").append(janUseamount);
        sb.append(", febUseamount=").append(febUseamount);
        sb.append(", marUseamount=").append(marUseamount);
        sb.append(", aprUseamount=").append(aprUseamount);
        sb.append(", mayUseamount=").append(mayUseamount);
        sb.append(", juneUseamount=").append(juneUseamount);
        sb.append(", julyUseamount=").append(julyUseamount);
        sb.append(", augUseamount=").append(augUseamount);
        sb.append(", septUseamount=").append(septUseamount);
        sb.append(", octUseAmount=").append(octUseAmount);
        sb.append(", novUseamount=").append(novUseamount);
        sb.append(", decUseamount=").append(decUseamount);
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
        Kiln other = (Kiln) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getNkNo() == null ? other.getNkNo() == null : this.getNkNo().equals(other.getNkNo()))
            && (this.getExhustId() == null ? other.getExhustId() == null : this.getExhustId().equals(other.getExhustId()))
            && (this.getFunctio() == null ? other.getFunctio() == null : this.getFunctio().equals(other.getFunctio()))
            && (this.getKilnModel() == null ? other.getKilnModel() == null : this.getKilnModel().equals(other.getKilnModel()))
            && (this.getModel() == null ? other.getModel() == null : this.getModel().equals(other.getModel()))
            && (this.getFueltype() == null ? other.getFueltype() == null : this.getFueltype().equals(other.getFueltype()))
            && (this.getScccode() == null ? other.getScccode() == null : this.getScccode().equals(other.getScccode()))
            && (this.getKilnFuelAusage() == null ? other.getKilnFuelAusage() == null : this.getKilnFuelAusage().equals(other.getKilnFuelAusage()))
            && (this.getKilnFuelAusageunit() == null ? other.getKilnFuelAusageunit() == null : this.getKilnFuelAusageunit().equals(other.getKilnFuelAusageunit()))
            && (this.getNitreremoveid() == null ? other.getNitreremoveid() == null : this.getNitreremoveid().equals(other.getNitreremoveid()))
            && (this.getDustremoveid() == null ? other.getDustremoveid() == null : this.getDustremoveid().equals(other.getDustremoveid()))
            && (this.getSulphurremoveid() == null ? other.getSulphurremoveid() == null : this.getSulphurremoveid().equals(other.getSulphurremoveid()))
            && (this.getCoalash() == null ? other.getCoalash() == null : this.getCoalash().equals(other.getCoalash()))
            && (this.getCoalVolatilisation() == null ? other.getCoalVolatilisation() == null : this.getCoalVolatilisation().equals(other.getCoalVolatilisation()))
            && (this.getCoalsulfur() == null ? other.getCoalsulfur() == null : this.getCoalsulfur().equals(other.getCoalsulfur()))
            && (this.getPm10() == null ? other.getPm10() == null : this.getPm10().equals(other.getPm10()))
            && (this.getPm25() == null ? other.getPm25() == null : this.getPm25().equals(other.getPm25()))
            && (this.getCo() == null ? other.getCo() == null : this.getCo().equals(other.getCo()))
            && (this.getVoc() == null ? other.getVoc() == null : this.getVoc().equals(other.getVoc()))
            && (this.getPm() == null ? other.getPm() == null : this.getPm().equals(other.getPm()))
            && (this.getSo2() == null ? other.getSo2() == null : this.getSo2().equals(other.getSo2()))
            && (this.getNox() == null ? other.getNox() == null : this.getNox().equals(other.getNox()))
            && (this.getNh3() == null ? other.getNh3() == null : this.getNh3().equals(other.getNh3()))
            && (this.getOc() == null ? other.getOc() == null : this.getOc().equals(other.getOc()))
            && (this.getBc() == null ? other.getBc() == null : this.getBc().equals(other.getBc()))
            && (this.getFeiqiti() == null ? other.getFeiqiti() == null : this.getFeiqiti().equals(other.getFeiqiti()))
            && (this.getSo2out() == null ? other.getSo2out() == null : this.getSo2out().equals(other.getSo2out()))
            && (this.getPmout() == null ? other.getPmout() == null : this.getPmout().equals(other.getPmout()))
            && (this.getNoxout() == null ? other.getNoxout() == null : this.getNoxout().equals(other.getNoxout()))
            && (this.getJanUseamount() == null ? other.getJanUseamount() == null : this.getJanUseamount().equals(other.getJanUseamount()))
            && (this.getFebUseamount() == null ? other.getFebUseamount() == null : this.getFebUseamount().equals(other.getFebUseamount()))
            && (this.getMarUseamount() == null ? other.getMarUseamount() == null : this.getMarUseamount().equals(other.getMarUseamount()))
            && (this.getAprUseamount() == null ? other.getAprUseamount() == null : this.getAprUseamount().equals(other.getAprUseamount()))
            && (this.getMayUseamount() == null ? other.getMayUseamount() == null : this.getMayUseamount().equals(other.getMayUseamount()))
            && (this.getJuneUseamount() == null ? other.getJuneUseamount() == null : this.getJuneUseamount().equals(other.getJuneUseamount()))
            && (this.getJulyUseamount() == null ? other.getJulyUseamount() == null : this.getJulyUseamount().equals(other.getJulyUseamount()))
            && (this.getAugUseamount() == null ? other.getAugUseamount() == null : this.getAugUseamount().equals(other.getAugUseamount()))
            && (this.getSeptUseamount() == null ? other.getSeptUseamount() == null : this.getSeptUseamount().equals(other.getSeptUseamount()))
            && (this.getOctUseAmount() == null ? other.getOctUseAmount() == null : this.getOctUseAmount().equals(other.getOctUseAmount()))
            && (this.getNovUseamount() == null ? other.getNovUseamount() == null : this.getNovUseamount().equals(other.getNovUseamount()))
            && (this.getDecUseamount() == null ? other.getDecUseamount() == null : this.getDecUseamount().equals(other.getDecUseamount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getNkNo() == null) ? 0 : getNkNo().hashCode());
        result = prime * result + ((getExhustId() == null) ? 0 : getExhustId().hashCode());
        result = prime * result + ((getFunctio() == null) ? 0 : getFunctio().hashCode());
        result = prime * result + ((getKilnModel() == null) ? 0 : getKilnModel().hashCode());
        result = prime * result + ((getModel() == null) ? 0 : getModel().hashCode());
        result = prime * result + ((getFueltype() == null) ? 0 : getFueltype().hashCode());
        result = prime * result + ((getScccode() == null) ? 0 : getScccode().hashCode());
        result = prime * result + ((getKilnFuelAusage() == null) ? 0 : getKilnFuelAusage().hashCode());
        result = prime * result + ((getKilnFuelAusageunit() == null) ? 0 : getKilnFuelAusageunit().hashCode());
        result = prime * result + ((getNitreremoveid() == null) ? 0 : getNitreremoveid().hashCode());
        result = prime * result + ((getDustremoveid() == null) ? 0 : getDustremoveid().hashCode());
        result = prime * result + ((getSulphurremoveid() == null) ? 0 : getSulphurremoveid().hashCode());
        result = prime * result + ((getCoalash() == null) ? 0 : getCoalash().hashCode());
        result = prime * result + ((getCoalVolatilisation() == null) ? 0 : getCoalVolatilisation().hashCode());
        result = prime * result + ((getCoalsulfur() == null) ? 0 : getCoalsulfur().hashCode());
        result = prime * result + ((getPm10() == null) ? 0 : getPm10().hashCode());
        result = prime * result + ((getPm25() == null) ? 0 : getPm25().hashCode());
        result = prime * result + ((getCo() == null) ? 0 : getCo().hashCode());
        result = prime * result + ((getVoc() == null) ? 0 : getVoc().hashCode());
        result = prime * result + ((getPm() == null) ? 0 : getPm().hashCode());
        result = prime * result + ((getSo2() == null) ? 0 : getSo2().hashCode());
        result = prime * result + ((getNox() == null) ? 0 : getNox().hashCode());
        result = prime * result + ((getNh3() == null) ? 0 : getNh3().hashCode());
        result = prime * result + ((getOc() == null) ? 0 : getOc().hashCode());
        result = prime * result + ((getBc() == null) ? 0 : getBc().hashCode());
        result = prime * result + ((getFeiqiti() == null) ? 0 : getFeiqiti().hashCode());
        result = prime * result + ((getSo2out() == null) ? 0 : getSo2out().hashCode());
        result = prime * result + ((getPmout() == null) ? 0 : getPmout().hashCode());
        result = prime * result + ((getNoxout() == null) ? 0 : getNoxout().hashCode());
        result = prime * result + ((getJanUseamount() == null) ? 0 : getJanUseamount().hashCode());
        result = prime * result + ((getFebUseamount() == null) ? 0 : getFebUseamount().hashCode());
        result = prime * result + ((getMarUseamount() == null) ? 0 : getMarUseamount().hashCode());
        result = prime * result + ((getAprUseamount() == null) ? 0 : getAprUseamount().hashCode());
        result = prime * result + ((getMayUseamount() == null) ? 0 : getMayUseamount().hashCode());
        result = prime * result + ((getJuneUseamount() == null) ? 0 : getJuneUseamount().hashCode());
        result = prime * result + ((getJulyUseamount() == null) ? 0 : getJulyUseamount().hashCode());
        result = prime * result + ((getAugUseamount() == null) ? 0 : getAugUseamount().hashCode());
        result = prime * result + ((getSeptUseamount() == null) ? 0 : getSeptUseamount().hashCode());
        result = prime * result + ((getOctUseAmount() == null) ? 0 : getOctUseAmount().hashCode());
        result = prime * result + ((getNovUseamount() == null) ? 0 : getNovUseamount().hashCode());
        result = prime * result + ((getDecUseamount() == null) ? 0 : getDecUseamount().hashCode());
        return result;
    }
}