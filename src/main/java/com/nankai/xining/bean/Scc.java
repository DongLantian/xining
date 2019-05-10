package com.nankai.xining.bean;

import java.io.Serializable;

public class Scc implements Serializable {
    private String scc;

    private String epaScc;

    private String gridid9k;

    private String gridid3k;

    private Double nox;

    private Double so2;

    private Double nh3;

    private Double vocs;

    private Double co;

    private Double pm10;

    private Double pm25;

    private Double oc;

    private Double pm;

    private Double bc;

    private Integer monthid;

    private Integer nkweekid;

    private Integer nkdayid;

    private Integer nknoxid;

    private Integer nkvocid;

    private Integer nkpm25id;

    private Double ec;

    private String unit;

    private Double noxReal;

    private Double so2Real;

    private Double nh3Real;

    private Double vocsReal;

    private Double coReal;

    private Double pm10Real;

    private Double pm25Real;

    private Double bcReal;

    private Double ocReal;

    private Boolean flag;

    private static final long serialVersionUID = 1L;

    public String getScc() {
        return scc;
    }

    public void setScc(String scc) {
        this.scc = scc == null ? null : scc.trim();
    }

    public String getEpaScc() {
        return epaScc;
    }

    public void setEpaScc(String epaScc) {
        this.epaScc = epaScc == null ? null : epaScc.trim();
    }

    public String getGridid9k() {
        return gridid9k;
    }

    public void setGridid9k(String gridid9k) {
        this.gridid9k = gridid9k == null ? null : gridid9k.trim();
    }

    public String getGridid3k() {
        return gridid3k;
    }

    public void setGridid3k(String gridid3k) {
        this.gridid3k = gridid3k == null ? null : gridid3k.trim();
    }

    public Double getNox() {
        return nox;
    }

    public void setNox(Double nox) {
        this.nox = nox;
    }

    public Double getSo2() {
        return so2;
    }

    public void setSo2(Double so2) {
        this.so2 = so2;
    }

    public Double getNh3() {
        return nh3;
    }

    public void setNh3(Double nh3) {
        this.nh3 = nh3;
    }

    public Double getVocs() {
        return vocs;
    }

    public void setVocs(Double vocs) {
        this.vocs = vocs;
    }

    public Double getCo() {
        return co;
    }

    public void setCo(Double co) {
        this.co = co;
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

    public Double getOc() {
        return oc;
    }

    public void setOc(Double oc) {
        this.oc = oc;
    }

    public Double getPm() {
        return pm;
    }

    public void setPm(Double pm) {
        this.pm = pm;
    }

    public Double getBc() {
        return bc;
    }

    public void setBc(Double bc) {
        this.bc = bc;
    }

    public Integer getMonthid() {
        return monthid;
    }

    public void setMonthid(Integer monthid) {
        this.monthid = monthid;
    }

    public Integer getNkweekid() {
        return nkweekid;
    }

    public void setNkweekid(Integer nkweekid) {
        this.nkweekid = nkweekid;
    }

    public Integer getNkdayid() {
        return nkdayid;
    }

    public void setNkdayid(Integer nkdayid) {
        this.nkdayid = nkdayid;
    }

    public Integer getNknoxid() {
        return nknoxid;
    }

    public void setNknoxid(Integer nknoxid) {
        this.nknoxid = nknoxid;
    }

    public Integer getNkvocid() {
        return nkvocid;
    }

    public void setNkvocid(Integer nkvocid) {
        this.nkvocid = nkvocid;
    }

    public Integer getNkpm25id() {
        return nkpm25id;
    }

    public void setNkpm25id(Integer nkpm25id) {
        this.nkpm25id = nkpm25id;
    }

    public Double getEc() {
        return ec;
    }

    public void setEc(Double ec) {
        this.ec = ec;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Double getNoxReal() {
        return noxReal;
    }

    public void setNoxReal(Double noxReal) {
        this.noxReal = noxReal;
    }

    public Double getSo2Real() {
        return so2Real;
    }

    public void setSo2Real(Double so2Real) {
        this.so2Real = so2Real;
    }

    public Double getNh3Real() {
        return nh3Real;
    }

    public void setNh3Real(Double nh3Real) {
        this.nh3Real = nh3Real;
    }

    public Double getVocsReal() {
        return vocsReal;
    }

    public void setVocsReal(Double vocsReal) {
        this.vocsReal = vocsReal;
    }

    public Double getCoReal() {
        return coReal;
    }

    public void setCoReal(Double coReal) {
        this.coReal = coReal;
    }

    public Double getPm10Real() {
        return pm10Real;
    }

    public void setPm10Real(Double pm10Real) {
        this.pm10Real = pm10Real;
    }

    public Double getPm25Real() {
        return pm25Real;
    }

    public void setPm25Real(Double pm25Real) {
        this.pm25Real = pm25Real;
    }

    public Double getBcReal() {
        return bcReal;
    }

    public void setBcReal(Double bcReal) {
        this.bcReal = bcReal;
    }

    public Double getOcReal() {
        return ocReal;
    }

    public void setOcReal(Double ocReal) {
        this.ocReal = ocReal;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", scc=").append(scc);
        sb.append(", epaScc=").append(epaScc);
        sb.append(", gridid9k=").append(gridid9k);
        sb.append(", gridid3k=").append(gridid3k);
        sb.append(", nox=").append(nox);
        sb.append(", so2=").append(so2);
        sb.append(", nh3=").append(nh3);
        sb.append(", vocs=").append(vocs);
        sb.append(", co=").append(co);
        sb.append(", pm10=").append(pm10);
        sb.append(", pm25=").append(pm25);
        sb.append(", oc=").append(oc);
        sb.append(", pm=").append(pm);
        sb.append(", bc=").append(bc);
        sb.append(", monthid=").append(monthid);
        sb.append(", nkweekid=").append(nkweekid);
        sb.append(", nkdayid=").append(nkdayid);
        sb.append(", nknoxid=").append(nknoxid);
        sb.append(", nkvocid=").append(nkvocid);
        sb.append(", nkpm25id=").append(nkpm25id);
        sb.append(", ec=").append(ec);
        sb.append(", unit=").append(unit);
        sb.append(", noxReal=").append(noxReal);
        sb.append(", so2Real=").append(so2Real);
        sb.append(", nh3Real=").append(nh3Real);
        sb.append(", vocsReal=").append(vocsReal);
        sb.append(", coReal=").append(coReal);
        sb.append(", pm10Real=").append(pm10Real);
        sb.append(", pm25Real=").append(pm25Real);
        sb.append(", bcReal=").append(bcReal);
        sb.append(", ocReal=").append(ocReal);
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
        Scc other = (Scc) that;
        return (this.getScc() == null ? other.getScc() == null : this.getScc().equals(other.getScc()))
            && (this.getEpaScc() == null ? other.getEpaScc() == null : this.getEpaScc().equals(other.getEpaScc()))
            && (this.getGridid9k() == null ? other.getGridid9k() == null : this.getGridid9k().equals(other.getGridid9k()))
            && (this.getGridid3k() == null ? other.getGridid3k() == null : this.getGridid3k().equals(other.getGridid3k()))
            && (this.getNox() == null ? other.getNox() == null : this.getNox().equals(other.getNox()))
            && (this.getSo2() == null ? other.getSo2() == null : this.getSo2().equals(other.getSo2()))
            && (this.getNh3() == null ? other.getNh3() == null : this.getNh3().equals(other.getNh3()))
            && (this.getVocs() == null ? other.getVocs() == null : this.getVocs().equals(other.getVocs()))
            && (this.getCo() == null ? other.getCo() == null : this.getCo().equals(other.getCo()))
            && (this.getPm10() == null ? other.getPm10() == null : this.getPm10().equals(other.getPm10()))
            && (this.getPm25() == null ? other.getPm25() == null : this.getPm25().equals(other.getPm25()))
            && (this.getOc() == null ? other.getOc() == null : this.getOc().equals(other.getOc()))
            && (this.getPm() == null ? other.getPm() == null : this.getPm().equals(other.getPm()))
            && (this.getBc() == null ? other.getBc() == null : this.getBc().equals(other.getBc()))
            && (this.getMonthid() == null ? other.getMonthid() == null : this.getMonthid().equals(other.getMonthid()))
            && (this.getNkweekid() == null ? other.getNkweekid() == null : this.getNkweekid().equals(other.getNkweekid()))
            && (this.getNkdayid() == null ? other.getNkdayid() == null : this.getNkdayid().equals(other.getNkdayid()))
            && (this.getNknoxid() == null ? other.getNknoxid() == null : this.getNknoxid().equals(other.getNknoxid()))
            && (this.getNkvocid() == null ? other.getNkvocid() == null : this.getNkvocid().equals(other.getNkvocid()))
            && (this.getNkpm25id() == null ? other.getNkpm25id() == null : this.getNkpm25id().equals(other.getNkpm25id()))
            && (this.getEc() == null ? other.getEc() == null : this.getEc().equals(other.getEc()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getNoxReal() == null ? other.getNoxReal() == null : this.getNoxReal().equals(other.getNoxReal()))
            && (this.getSo2Real() == null ? other.getSo2Real() == null : this.getSo2Real().equals(other.getSo2Real()))
            && (this.getNh3Real() == null ? other.getNh3Real() == null : this.getNh3Real().equals(other.getNh3Real()))
            && (this.getVocsReal() == null ? other.getVocsReal() == null : this.getVocsReal().equals(other.getVocsReal()))
            && (this.getCoReal() == null ? other.getCoReal() == null : this.getCoReal().equals(other.getCoReal()))
            && (this.getPm10Real() == null ? other.getPm10Real() == null : this.getPm10Real().equals(other.getPm10Real()))
            && (this.getPm25Real() == null ? other.getPm25Real() == null : this.getPm25Real().equals(other.getPm25Real()))
            && (this.getBcReal() == null ? other.getBcReal() == null : this.getBcReal().equals(other.getBcReal()))
            && (this.getOcReal() == null ? other.getOcReal() == null : this.getOcReal().equals(other.getOcReal()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getScc() == null) ? 0 : getScc().hashCode());
        result = prime * result + ((getEpaScc() == null) ? 0 : getEpaScc().hashCode());
        result = prime * result + ((getGridid9k() == null) ? 0 : getGridid9k().hashCode());
        result = prime * result + ((getGridid3k() == null) ? 0 : getGridid3k().hashCode());
        result = prime * result + ((getNox() == null) ? 0 : getNox().hashCode());
        result = prime * result + ((getSo2() == null) ? 0 : getSo2().hashCode());
        result = prime * result + ((getNh3() == null) ? 0 : getNh3().hashCode());
        result = prime * result + ((getVocs() == null) ? 0 : getVocs().hashCode());
        result = prime * result + ((getCo() == null) ? 0 : getCo().hashCode());
        result = prime * result + ((getPm10() == null) ? 0 : getPm10().hashCode());
        result = prime * result + ((getPm25() == null) ? 0 : getPm25().hashCode());
        result = prime * result + ((getOc() == null) ? 0 : getOc().hashCode());
        result = prime * result + ((getPm() == null) ? 0 : getPm().hashCode());
        result = prime * result + ((getBc() == null) ? 0 : getBc().hashCode());
        result = prime * result + ((getMonthid() == null) ? 0 : getMonthid().hashCode());
        result = prime * result + ((getNkweekid() == null) ? 0 : getNkweekid().hashCode());
        result = prime * result + ((getNkdayid() == null) ? 0 : getNkdayid().hashCode());
        result = prime * result + ((getNknoxid() == null) ? 0 : getNknoxid().hashCode());
        result = prime * result + ((getNkvocid() == null) ? 0 : getNkvocid().hashCode());
        result = prime * result + ((getNkpm25id() == null) ? 0 : getNkpm25id().hashCode());
        result = prime * result + ((getEc() == null) ? 0 : getEc().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getNoxReal() == null) ? 0 : getNoxReal().hashCode());
        result = prime * result + ((getSo2Real() == null) ? 0 : getSo2Real().hashCode());
        result = prime * result + ((getNh3Real() == null) ? 0 : getNh3Real().hashCode());
        result = prime * result + ((getVocsReal() == null) ? 0 : getVocsReal().hashCode());
        result = prime * result + ((getCoReal() == null) ? 0 : getCoReal().hashCode());
        result = prime * result + ((getPm10Real() == null) ? 0 : getPm10Real().hashCode());
        result = prime * result + ((getPm25Real() == null) ? 0 : getPm25Real().hashCode());
        result = prime * result + ((getBcReal() == null) ? 0 : getBcReal().hashCode());
        result = prime * result + ((getOcReal() == null) ? 0 : getOcReal().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        return result;
    }
}