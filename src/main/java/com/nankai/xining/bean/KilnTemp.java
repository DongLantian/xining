package com.nankai.xining.bean;

import java.io.Serializable;

public class KilnTemp implements Serializable {
    private Integer id;

    private Integer exhustId;

    private Integer tkilnId;

    private Integer nkNo;

    private String kilnNo;

    private String kilnModel;

    private String functionDec;

    private String functio;

    private String fueltypeDec;

    private String fueltype;

    private String modelDec;

    private String model;

    private Double kilnFuelAusage;

    private String kilnFuelAusageunit;

    private String nitreremoveidDec;

    private Integer nitreremoveid;

    private String dustremoveidDec;

    private Integer dustremoveid;

    private String sulphurremoveidDec;

    private Integer sulphurremoveid;

    private Byte exfNo;

    private Double coalash;

    private Double coalVolatilisation;

    private Double coalsulfur;

    private Double factorPm25;

    private Double factorPm10;

    private Double pm10;

    private Double pm25;

    private Double factorPm;

    private Double factorCo;

    private Double co;

    private Double factorVoc;

    private Double voc;

    private Double pm;

    private Double factorSo2;

    private Double so2;

    private Double factorNox;

    private Double nox;

    private Double factorNh3;

    private Double nh3;

    private Double factorOc;

    private Double oc;

    private Byte factorStatus;

    private Double factorBc;

    private Double bc;

    private String scccode;

    private Double so2out;

    private Double noxout;

    private Double pmout;

    private Double feiqiti;

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

    public Integer getExhustId() {
        return exhustId;
    }

    public void setExhustId(Integer exhustId) {
        this.exhustId = exhustId;
    }

    public Integer getTkilnId() {
        return tkilnId;
    }

    public void setTkilnId(Integer tkilnId) {
        this.tkilnId = tkilnId;
    }

    public Integer getNkNo() {
        return nkNo;
    }

    public void setNkNo(Integer nkNo) {
        this.nkNo = nkNo;
    }

    public String getKilnNo() {
        return kilnNo;
    }

    public void setKilnNo(String kilnNo) {
        this.kilnNo = kilnNo == null ? null : kilnNo.trim();
    }

    public String getKilnModel() {
        return kilnModel;
    }

    public void setKilnModel(String kilnModel) {
        this.kilnModel = kilnModel == null ? null : kilnModel.trim();
    }

    public String getFunctionDec() {
        return functionDec;
    }

    public void setFunctionDec(String functionDec) {
        this.functionDec = functionDec == null ? null : functionDec.trim();
    }

    public String getFunctio() {
        return functio;
    }

    public void setFunctio(String functio) {
        this.functio = functio == null ? null : functio.trim();
    }

    public String getFueltypeDec() {
        return fueltypeDec;
    }

    public void setFueltypeDec(String fueltypeDec) {
        this.fueltypeDec = fueltypeDec == null ? null : fueltypeDec.trim();
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype == null ? null : fueltype.trim();
    }

    public String getModelDec() {
        return modelDec;
    }

    public void setModelDec(String modelDec) {
        this.modelDec = modelDec == null ? null : modelDec.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
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

    public String getNitreremoveidDec() {
        return nitreremoveidDec;
    }

    public void setNitreremoveidDec(String nitreremoveidDec) {
        this.nitreremoveidDec = nitreremoveidDec == null ? null : nitreremoveidDec.trim();
    }

    public Integer getNitreremoveid() {
        return nitreremoveid;
    }

    public void setNitreremoveid(Integer nitreremoveid) {
        this.nitreremoveid = nitreremoveid;
    }

    public String getDustremoveidDec() {
        return dustremoveidDec;
    }

    public void setDustremoveidDec(String dustremoveidDec) {
        this.dustremoveidDec = dustremoveidDec == null ? null : dustremoveidDec.trim();
    }

    public Integer getDustremoveid() {
        return dustremoveid;
    }

    public void setDustremoveid(Integer dustremoveid) {
        this.dustremoveid = dustremoveid;
    }

    public String getSulphurremoveidDec() {
        return sulphurremoveidDec;
    }

    public void setSulphurremoveidDec(String sulphurremoveidDec) {
        this.sulphurremoveidDec = sulphurremoveidDec == null ? null : sulphurremoveidDec.trim();
    }

    public Integer getSulphurremoveid() {
        return sulphurremoveid;
    }

    public void setSulphurremoveid(Integer sulphurremoveid) {
        this.sulphurremoveid = sulphurremoveid;
    }

    public Byte getExfNo() {
        return exfNo;
    }

    public void setExfNo(Byte exfNo) {
        this.exfNo = exfNo;
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

    public Double getFactorPm25() {
        return factorPm25;
    }

    public void setFactorPm25(Double factorPm25) {
        this.factorPm25 = factorPm25;
    }

    public Double getFactorPm10() {
        return factorPm10;
    }

    public void setFactorPm10(Double factorPm10) {
        this.factorPm10 = factorPm10;
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

    public Double getFactorPm() {
        return factorPm;
    }

    public void setFactorPm(Double factorPm) {
        this.factorPm = factorPm;
    }

    public Double getFactorCo() {
        return factorCo;
    }

    public void setFactorCo(Double factorCo) {
        this.factorCo = factorCo;
    }

    public Double getCo() {
        return co;
    }

    public void setCo(Double co) {
        this.co = co;
    }

    public Double getFactorVoc() {
        return factorVoc;
    }

    public void setFactorVoc(Double factorVoc) {
        this.factorVoc = factorVoc;
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

    public Double getFactorSo2() {
        return factorSo2;
    }

    public void setFactorSo2(Double factorSo2) {
        this.factorSo2 = factorSo2;
    }

    public Double getSo2() {
        return so2;
    }

    public void setSo2(Double so2) {
        this.so2 = so2;
    }

    public Double getFactorNox() {
        return factorNox;
    }

    public void setFactorNox(Double factorNox) {
        this.factorNox = factorNox;
    }

    public Double getNox() {
        return nox;
    }

    public void setNox(Double nox) {
        this.nox = nox;
    }

    public Double getFactorNh3() {
        return factorNh3;
    }

    public void setFactorNh3(Double factorNh3) {
        this.factorNh3 = factorNh3;
    }

    public Double getNh3() {
        return nh3;
    }

    public void setNh3(Double nh3) {
        this.nh3 = nh3;
    }

    public Double getFactorOc() {
        return factorOc;
    }

    public void setFactorOc(Double factorOc) {
        this.factorOc = factorOc;
    }

    public Double getOc() {
        return oc;
    }

    public void setOc(Double oc) {
        this.oc = oc;
    }

    public Byte getFactorStatus() {
        return factorStatus;
    }

    public void setFactorStatus(Byte factorStatus) {
        this.factorStatus = factorStatus;
    }

    public Double getFactorBc() {
        return factorBc;
    }

    public void setFactorBc(Double factorBc) {
        this.factorBc = factorBc;
    }

    public Double getBc() {
        return bc;
    }

    public void setBc(Double bc) {
        this.bc = bc;
    }

    public String getScccode() {
        return scccode;
    }

    public void setScccode(String scccode) {
        this.scccode = scccode == null ? null : scccode.trim();
    }

    public Double getSo2out() {
        return so2out;
    }

    public void setSo2out(Double so2out) {
        this.so2out = so2out;
    }

    public Double getNoxout() {
        return noxout;
    }

    public void setNoxout(Double noxout) {
        this.noxout = noxout;
    }

    public Double getPmout() {
        return pmout;
    }

    public void setPmout(Double pmout) {
        this.pmout = pmout;
    }

    public Double getFeiqiti() {
        return feiqiti;
    }

    public void setFeiqiti(Double feiqiti) {
        this.feiqiti = feiqiti;
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
        sb.append(", exhustId=").append(exhustId);
        sb.append(", tkilnId=").append(tkilnId);
        sb.append(", nkNo=").append(nkNo);
        sb.append(", kilnNo=").append(kilnNo);
        sb.append(", kilnModel=").append(kilnModel);
        sb.append(", functionDec=").append(functionDec);
        sb.append(", functio=").append(functio);
        sb.append(", fueltypeDec=").append(fueltypeDec);
        sb.append(", fueltype=").append(fueltype);
        sb.append(", modelDec=").append(modelDec);
        sb.append(", model=").append(model);
        sb.append(", kilnFuelAusage=").append(kilnFuelAusage);
        sb.append(", kilnFuelAusageunit=").append(kilnFuelAusageunit);
        sb.append(", nitreremoveidDec=").append(nitreremoveidDec);
        sb.append(", nitreremoveid=").append(nitreremoveid);
        sb.append(", dustremoveidDec=").append(dustremoveidDec);
        sb.append(", dustremoveid=").append(dustremoveid);
        sb.append(", sulphurremoveidDec=").append(sulphurremoveidDec);
        sb.append(", sulphurremoveid=").append(sulphurremoveid);
        sb.append(", exfNo=").append(exfNo);
        sb.append(", coalash=").append(coalash);
        sb.append(", coalVolatilisation=").append(coalVolatilisation);
        sb.append(", coalsulfur=").append(coalsulfur);
        sb.append(", factorPm25=").append(factorPm25);
        sb.append(", factorPm10=").append(factorPm10);
        sb.append(", pm10=").append(pm10);
        sb.append(", pm25=").append(pm25);
        sb.append(", factorPm=").append(factorPm);
        sb.append(", factorCo=").append(factorCo);
        sb.append(", co=").append(co);
        sb.append(", factorVoc=").append(factorVoc);
        sb.append(", voc=").append(voc);
        sb.append(", pm=").append(pm);
        sb.append(", factorSo2=").append(factorSo2);
        sb.append(", so2=").append(so2);
        sb.append(", factorNox=").append(factorNox);
        sb.append(", nox=").append(nox);
        sb.append(", factorNh3=").append(factorNh3);
        sb.append(", nh3=").append(nh3);
        sb.append(", factorOc=").append(factorOc);
        sb.append(", oc=").append(oc);
        sb.append(", factorStatus=").append(factorStatus);
        sb.append(", factorBc=").append(factorBc);
        sb.append(", bc=").append(bc);
        sb.append(", scccode=").append(scccode);
        sb.append(", so2out=").append(so2out);
        sb.append(", noxout=").append(noxout);
        sb.append(", pmout=").append(pmout);
        sb.append(", feiqiti=").append(feiqiti);
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
        KilnTemp other = (KilnTemp) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getExhustId() == null ? other.getExhustId() == null : this.getExhustId().equals(other.getExhustId()))
            && (this.getTkilnId() == null ? other.getTkilnId() == null : this.getTkilnId().equals(other.getTkilnId()))
            && (this.getNkNo() == null ? other.getNkNo() == null : this.getNkNo().equals(other.getNkNo()))
            && (this.getKilnNo() == null ? other.getKilnNo() == null : this.getKilnNo().equals(other.getKilnNo()))
            && (this.getKilnModel() == null ? other.getKilnModel() == null : this.getKilnModel().equals(other.getKilnModel()))
            && (this.getFunctionDec() == null ? other.getFunctionDec() == null : this.getFunctionDec().equals(other.getFunctionDec()))
            && (this.getFunctio() == null ? other.getFunctio() == null : this.getFunctio().equals(other.getFunctio()))
            && (this.getFueltypeDec() == null ? other.getFueltypeDec() == null : this.getFueltypeDec().equals(other.getFueltypeDec()))
            && (this.getFueltype() == null ? other.getFueltype() == null : this.getFueltype().equals(other.getFueltype()))
            && (this.getModelDec() == null ? other.getModelDec() == null : this.getModelDec().equals(other.getModelDec()))
            && (this.getModel() == null ? other.getModel() == null : this.getModel().equals(other.getModel()))
            && (this.getKilnFuelAusage() == null ? other.getKilnFuelAusage() == null : this.getKilnFuelAusage().equals(other.getKilnFuelAusage()))
            && (this.getKilnFuelAusageunit() == null ? other.getKilnFuelAusageunit() == null : this.getKilnFuelAusageunit().equals(other.getKilnFuelAusageunit()))
            && (this.getNitreremoveidDec() == null ? other.getNitreremoveidDec() == null : this.getNitreremoveidDec().equals(other.getNitreremoveidDec()))
            && (this.getNitreremoveid() == null ? other.getNitreremoveid() == null : this.getNitreremoveid().equals(other.getNitreremoveid()))
            && (this.getDustremoveidDec() == null ? other.getDustremoveidDec() == null : this.getDustremoveidDec().equals(other.getDustremoveidDec()))
            && (this.getDustremoveid() == null ? other.getDustremoveid() == null : this.getDustremoveid().equals(other.getDustremoveid()))
            && (this.getSulphurremoveidDec() == null ? other.getSulphurremoveidDec() == null : this.getSulphurremoveidDec().equals(other.getSulphurremoveidDec()))
            && (this.getSulphurremoveid() == null ? other.getSulphurremoveid() == null : this.getSulphurremoveid().equals(other.getSulphurremoveid()))
            && (this.getExfNo() == null ? other.getExfNo() == null : this.getExfNo().equals(other.getExfNo()))
            && (this.getCoalash() == null ? other.getCoalash() == null : this.getCoalash().equals(other.getCoalash()))
            && (this.getCoalVolatilisation() == null ? other.getCoalVolatilisation() == null : this.getCoalVolatilisation().equals(other.getCoalVolatilisation()))
            && (this.getCoalsulfur() == null ? other.getCoalsulfur() == null : this.getCoalsulfur().equals(other.getCoalsulfur()))
            && (this.getFactorPm25() == null ? other.getFactorPm25() == null : this.getFactorPm25().equals(other.getFactorPm25()))
            && (this.getFactorPm10() == null ? other.getFactorPm10() == null : this.getFactorPm10().equals(other.getFactorPm10()))
            && (this.getPm10() == null ? other.getPm10() == null : this.getPm10().equals(other.getPm10()))
            && (this.getPm25() == null ? other.getPm25() == null : this.getPm25().equals(other.getPm25()))
            && (this.getFactorPm() == null ? other.getFactorPm() == null : this.getFactorPm().equals(other.getFactorPm()))
            && (this.getFactorCo() == null ? other.getFactorCo() == null : this.getFactorCo().equals(other.getFactorCo()))
            && (this.getCo() == null ? other.getCo() == null : this.getCo().equals(other.getCo()))
            && (this.getFactorVoc() == null ? other.getFactorVoc() == null : this.getFactorVoc().equals(other.getFactorVoc()))
            && (this.getVoc() == null ? other.getVoc() == null : this.getVoc().equals(other.getVoc()))
            && (this.getPm() == null ? other.getPm() == null : this.getPm().equals(other.getPm()))
            && (this.getFactorSo2() == null ? other.getFactorSo2() == null : this.getFactorSo2().equals(other.getFactorSo2()))
            && (this.getSo2() == null ? other.getSo2() == null : this.getSo2().equals(other.getSo2()))
            && (this.getFactorNox() == null ? other.getFactorNox() == null : this.getFactorNox().equals(other.getFactorNox()))
            && (this.getNox() == null ? other.getNox() == null : this.getNox().equals(other.getNox()))
            && (this.getFactorNh3() == null ? other.getFactorNh3() == null : this.getFactorNh3().equals(other.getFactorNh3()))
            && (this.getNh3() == null ? other.getNh3() == null : this.getNh3().equals(other.getNh3()))
            && (this.getFactorOc() == null ? other.getFactorOc() == null : this.getFactorOc().equals(other.getFactorOc()))
            && (this.getOc() == null ? other.getOc() == null : this.getOc().equals(other.getOc()))
            && (this.getFactorStatus() == null ? other.getFactorStatus() == null : this.getFactorStatus().equals(other.getFactorStatus()))
            && (this.getFactorBc() == null ? other.getFactorBc() == null : this.getFactorBc().equals(other.getFactorBc()))
            && (this.getBc() == null ? other.getBc() == null : this.getBc().equals(other.getBc()))
            && (this.getScccode() == null ? other.getScccode() == null : this.getScccode().equals(other.getScccode()))
            && (this.getSo2out() == null ? other.getSo2out() == null : this.getSo2out().equals(other.getSo2out()))
            && (this.getNoxout() == null ? other.getNoxout() == null : this.getNoxout().equals(other.getNoxout()))
            && (this.getPmout() == null ? other.getPmout() == null : this.getPmout().equals(other.getPmout()))
            && (this.getFeiqiti() == null ? other.getFeiqiti() == null : this.getFeiqiti().equals(other.getFeiqiti()))
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
        result = prime * result + ((getExhustId() == null) ? 0 : getExhustId().hashCode());
        result = prime * result + ((getTkilnId() == null) ? 0 : getTkilnId().hashCode());
        result = prime * result + ((getNkNo() == null) ? 0 : getNkNo().hashCode());
        result = prime * result + ((getKilnNo() == null) ? 0 : getKilnNo().hashCode());
        result = prime * result + ((getKilnModel() == null) ? 0 : getKilnModel().hashCode());
        result = prime * result + ((getFunctionDec() == null) ? 0 : getFunctionDec().hashCode());
        result = prime * result + ((getFunctio() == null) ? 0 : getFunctio().hashCode());
        result = prime * result + ((getFueltypeDec() == null) ? 0 : getFueltypeDec().hashCode());
        result = prime * result + ((getFueltype() == null) ? 0 : getFueltype().hashCode());
        result = prime * result + ((getModelDec() == null) ? 0 : getModelDec().hashCode());
        result = prime * result + ((getModel() == null) ? 0 : getModel().hashCode());
        result = prime * result + ((getKilnFuelAusage() == null) ? 0 : getKilnFuelAusage().hashCode());
        result = prime * result + ((getKilnFuelAusageunit() == null) ? 0 : getKilnFuelAusageunit().hashCode());
        result = prime * result + ((getNitreremoveidDec() == null) ? 0 : getNitreremoveidDec().hashCode());
        result = prime * result + ((getNitreremoveid() == null) ? 0 : getNitreremoveid().hashCode());
        result = prime * result + ((getDustremoveidDec() == null) ? 0 : getDustremoveidDec().hashCode());
        result = prime * result + ((getDustremoveid() == null) ? 0 : getDustremoveid().hashCode());
        result = prime * result + ((getSulphurremoveidDec() == null) ? 0 : getSulphurremoveidDec().hashCode());
        result = prime * result + ((getSulphurremoveid() == null) ? 0 : getSulphurremoveid().hashCode());
        result = prime * result + ((getExfNo() == null) ? 0 : getExfNo().hashCode());
        result = prime * result + ((getCoalash() == null) ? 0 : getCoalash().hashCode());
        result = prime * result + ((getCoalVolatilisation() == null) ? 0 : getCoalVolatilisation().hashCode());
        result = prime * result + ((getCoalsulfur() == null) ? 0 : getCoalsulfur().hashCode());
        result = prime * result + ((getFactorPm25() == null) ? 0 : getFactorPm25().hashCode());
        result = prime * result + ((getFactorPm10() == null) ? 0 : getFactorPm10().hashCode());
        result = prime * result + ((getPm10() == null) ? 0 : getPm10().hashCode());
        result = prime * result + ((getPm25() == null) ? 0 : getPm25().hashCode());
        result = prime * result + ((getFactorPm() == null) ? 0 : getFactorPm().hashCode());
        result = prime * result + ((getFactorCo() == null) ? 0 : getFactorCo().hashCode());
        result = prime * result + ((getCo() == null) ? 0 : getCo().hashCode());
        result = prime * result + ((getFactorVoc() == null) ? 0 : getFactorVoc().hashCode());
        result = prime * result + ((getVoc() == null) ? 0 : getVoc().hashCode());
        result = prime * result + ((getPm() == null) ? 0 : getPm().hashCode());
        result = prime * result + ((getFactorSo2() == null) ? 0 : getFactorSo2().hashCode());
        result = prime * result + ((getSo2() == null) ? 0 : getSo2().hashCode());
        result = prime * result + ((getFactorNox() == null) ? 0 : getFactorNox().hashCode());
        result = prime * result + ((getNox() == null) ? 0 : getNox().hashCode());
        result = prime * result + ((getFactorNh3() == null) ? 0 : getFactorNh3().hashCode());
        result = prime * result + ((getNh3() == null) ? 0 : getNh3().hashCode());
        result = prime * result + ((getFactorOc() == null) ? 0 : getFactorOc().hashCode());
        result = prime * result + ((getOc() == null) ? 0 : getOc().hashCode());
        result = prime * result + ((getFactorStatus() == null) ? 0 : getFactorStatus().hashCode());
        result = prime * result + ((getFactorBc() == null) ? 0 : getFactorBc().hashCode());
        result = prime * result + ((getBc() == null) ? 0 : getBc().hashCode());
        result = prime * result + ((getScccode() == null) ? 0 : getScccode().hashCode());
        result = prime * result + ((getSo2out() == null) ? 0 : getSo2out().hashCode());
        result = prime * result + ((getNoxout() == null) ? 0 : getNoxout().hashCode());
        result = prime * result + ((getPmout() == null) ? 0 : getPmout().hashCode());
        result = prime * result + ((getFeiqiti() == null) ? 0 : getFeiqiti().hashCode());
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