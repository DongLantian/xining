package com.nankai.xining.bean;

import java.io.Serializable;

public class Tankinfo implements Serializable {
    private Integer tankid;

    private String reportdate;

    private String phone;

    private String reporter;

    private Integer status;

    private Integer factoryId;

    private Integer samenum;

    private String tanktype;

    private Double tanklength;

    private Double tankdiameter;

    private Double workingvolumn;

    private Double frequency;

    private Double capacity;

    private Double maxheight;

    private Double averageheight;

    private String innerstate;

    private String tankcolor;

    private String paintstate;

    private String uptanktopcolor;

    private String uptanktoppaintstate;

    private String uptanktoptype;

    private Double uptanktopheight;

    private Double uproundradius;

    private Double uptanktopgrade;

    private Double vacuumset;

    private Double pressureset;

    private String issetheat;

    private String isunderground;

    private String outtanktoptype;

    private String outtanktopconfig;

    private String tankstructure;

    private String intanktopcolor;

    private String intanktoppaintstate;

    private String inissupport;

    private Integer insupportnum;

    private Double insupportradius;

    private String infloatconnect;

    private String inweldtype;

    private String infloatpantype;

    private String instructuretype;

    private Double inconnectwidth;

    private String inplatesize;

    private String outinfirstseal;

    private String outinsecondseal;

    private String solutiontype;

    private String solutionname;

    private String solutionversion;

    private String solutioncomposition;

    private String solutionfraction;

    private Double streampressure;

    private Double streamfraction;

    private Double liquidfraction;

    private Double liquiddensity;

    private Double liquidmaxtem;

    private Double liquidmintem;

    private Double liquidavertem;

    private Double subjecttem;

    private static final long serialVersionUID = 1L;

    public Integer getTankid() {
        return tankid;
    }

    public void setTankid(Integer tankid) {
        this.tankid = tankid;
    }

    public String getReportdate() {
        return reportdate;
    }

    public void setReportdate(String reportdate) {
        this.reportdate = reportdate == null ? null : reportdate.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter == null ? null : reporter.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Integer factoryId) {
        this.factoryId = factoryId;
    }

    public Integer getSamenum() {
        return samenum;
    }

    public void setSamenum(Integer samenum) {
        this.samenum = samenum;
    }

    public String getTanktype() {
        return tanktype;
    }

    public void setTanktype(String tanktype) {
        this.tanktype = tanktype == null ? null : tanktype.trim();
    }

    public Double getTanklength() {
        return tanklength;
    }

    public void setTanklength(Double tanklength) {
        this.tanklength = tanklength;
    }

    public Double getTankdiameter() {
        return tankdiameter;
    }

    public void setTankdiameter(Double tankdiameter) {
        this.tankdiameter = tankdiameter;
    }

    public Double getWorkingvolumn() {
        return workingvolumn;
    }

    public void setWorkingvolumn(Double workingvolumn) {
        this.workingvolumn = workingvolumn;
    }

    public Double getFrequency() {
        return frequency;
    }

    public void setFrequency(Double frequency) {
        this.frequency = frequency;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public Double getMaxheight() {
        return maxheight;
    }

    public void setMaxheight(Double maxheight) {
        this.maxheight = maxheight;
    }

    public Double getAverageheight() {
        return averageheight;
    }

    public void setAverageheight(Double averageheight) {
        this.averageheight = averageheight;
    }

    public String getInnerstate() {
        return innerstate;
    }

    public void setInnerstate(String innerstate) {
        this.innerstate = innerstate == null ? null : innerstate.trim();
    }

    public String getTankcolor() {
        return tankcolor;
    }

    public void setTankcolor(String tankcolor) {
        this.tankcolor = tankcolor == null ? null : tankcolor.trim();
    }

    public String getPaintstate() {
        return paintstate;
    }

    public void setPaintstate(String paintstate) {
        this.paintstate = paintstate == null ? null : paintstate.trim();
    }

    public String getUptanktopcolor() {
        return uptanktopcolor;
    }

    public void setUptanktopcolor(String uptanktopcolor) {
        this.uptanktopcolor = uptanktopcolor == null ? null : uptanktopcolor.trim();
    }

    public String getUptanktoppaintstate() {
        return uptanktoppaintstate;
    }

    public void setUptanktoppaintstate(String uptanktoppaintstate) {
        this.uptanktoppaintstate = uptanktoppaintstate == null ? null : uptanktoppaintstate.trim();
    }

    public String getUptanktoptype() {
        return uptanktoptype;
    }

    public void setUptanktoptype(String uptanktoptype) {
        this.uptanktoptype = uptanktoptype == null ? null : uptanktoptype.trim();
    }

    public Double getUptanktopheight() {
        return uptanktopheight;
    }

    public void setUptanktopheight(Double uptanktopheight) {
        this.uptanktopheight = uptanktopheight;
    }

    public Double getUproundradius() {
        return uproundradius;
    }

    public void setUproundradius(Double uproundradius) {
        this.uproundradius = uproundradius;
    }

    public Double getUptanktopgrade() {
        return uptanktopgrade;
    }

    public void setUptanktopgrade(Double uptanktopgrade) {
        this.uptanktopgrade = uptanktopgrade;
    }

    public Double getVacuumset() {
        return vacuumset;
    }

    public void setVacuumset(Double vacuumset) {
        this.vacuumset = vacuumset;
    }

    public Double getPressureset() {
        return pressureset;
    }

    public void setPressureset(Double pressureset) {
        this.pressureset = pressureset;
    }

    public String getIssetheat() {
        return issetheat;
    }

    public void setIssetheat(String issetheat) {
        this.issetheat = issetheat == null ? null : issetheat.trim();
    }

    public String getIsunderground() {
        return isunderground;
    }

    public void setIsunderground(String isunderground) {
        this.isunderground = isunderground == null ? null : isunderground.trim();
    }

    public String getOuttanktoptype() {
        return outtanktoptype;
    }

    public void setOuttanktoptype(String outtanktoptype) {
        this.outtanktoptype = outtanktoptype == null ? null : outtanktoptype.trim();
    }

    public String getOuttanktopconfig() {
        return outtanktopconfig;
    }

    public void setOuttanktopconfig(String outtanktopconfig) {
        this.outtanktopconfig = outtanktopconfig == null ? null : outtanktopconfig.trim();
    }

    public String getTankstructure() {
        return tankstructure;
    }

    public void setTankstructure(String tankstructure) {
        this.tankstructure = tankstructure == null ? null : tankstructure.trim();
    }

    public String getIntanktopcolor() {
        return intanktopcolor;
    }

    public void setIntanktopcolor(String intanktopcolor) {
        this.intanktopcolor = intanktopcolor == null ? null : intanktopcolor.trim();
    }

    public String getIntanktoppaintstate() {
        return intanktoppaintstate;
    }

    public void setIntanktoppaintstate(String intanktoppaintstate) {
        this.intanktoppaintstate = intanktoppaintstate == null ? null : intanktoppaintstate.trim();
    }

    public String getInissupport() {
        return inissupport;
    }

    public void setInissupport(String inissupport) {
        this.inissupport = inissupport == null ? null : inissupport.trim();
    }

    public Integer getInsupportnum() {
        return insupportnum;
    }

    public void setInsupportnum(Integer insupportnum) {
        this.insupportnum = insupportnum;
    }

    public Double getInsupportradius() {
        return insupportradius;
    }

    public void setInsupportradius(Double insupportradius) {
        this.insupportradius = insupportradius;
    }

    public String getInfloatconnect() {
        return infloatconnect;
    }

    public void setInfloatconnect(String infloatconnect) {
        this.infloatconnect = infloatconnect == null ? null : infloatconnect.trim();
    }

    public String getInweldtype() {
        return inweldtype;
    }

    public void setInweldtype(String inweldtype) {
        this.inweldtype = inweldtype == null ? null : inweldtype.trim();
    }

    public String getInfloatpantype() {
        return infloatpantype;
    }

    public void setInfloatpantype(String infloatpantype) {
        this.infloatpantype = infloatpantype == null ? null : infloatpantype.trim();
    }

    public String getInstructuretype() {
        return instructuretype;
    }

    public void setInstructuretype(String instructuretype) {
        this.instructuretype = instructuretype == null ? null : instructuretype.trim();
    }

    public Double getInconnectwidth() {
        return inconnectwidth;
    }

    public void setInconnectwidth(Double inconnectwidth) {
        this.inconnectwidth = inconnectwidth;
    }

    public String getInplatesize() {
        return inplatesize;
    }

    public void setInplatesize(String inplatesize) {
        this.inplatesize = inplatesize == null ? null : inplatesize.trim();
    }

    public String getOutinfirstseal() {
        return outinfirstseal;
    }

    public void setOutinfirstseal(String outinfirstseal) {
        this.outinfirstseal = outinfirstseal == null ? null : outinfirstseal.trim();
    }

    public String getOutinsecondseal() {
        return outinsecondseal;
    }

    public void setOutinsecondseal(String outinsecondseal) {
        this.outinsecondseal = outinsecondseal == null ? null : outinsecondseal.trim();
    }

    public String getSolutiontype() {
        return solutiontype;
    }

    public void setSolutiontype(String solutiontype) {
        this.solutiontype = solutiontype == null ? null : solutiontype.trim();
    }

    public String getSolutionname() {
        return solutionname;
    }

    public void setSolutionname(String solutionname) {
        this.solutionname = solutionname == null ? null : solutionname.trim();
    }

    public String getSolutionversion() {
        return solutionversion;
    }

    public void setSolutionversion(String solutionversion) {
        this.solutionversion = solutionversion == null ? null : solutionversion.trim();
    }

    public String getSolutioncomposition() {
        return solutioncomposition;
    }

    public void setSolutioncomposition(String solutioncomposition) {
        this.solutioncomposition = solutioncomposition == null ? null : solutioncomposition.trim();
    }

    public String getSolutionfraction() {
        return solutionfraction;
    }

    public void setSolutionfraction(String solutionfraction) {
        this.solutionfraction = solutionfraction == null ? null : solutionfraction.trim();
    }

    public Double getStreampressure() {
        return streampressure;
    }

    public void setStreampressure(Double streampressure) {
        this.streampressure = streampressure;
    }

    public Double getStreamfraction() {
        return streamfraction;
    }

    public void setStreamfraction(Double streamfraction) {
        this.streamfraction = streamfraction;
    }

    public Double getLiquidfraction() {
        return liquidfraction;
    }

    public void setLiquidfraction(Double liquidfraction) {
        this.liquidfraction = liquidfraction;
    }

    public Double getLiquiddensity() {
        return liquiddensity;
    }

    public void setLiquiddensity(Double liquiddensity) {
        this.liquiddensity = liquiddensity;
    }

    public Double getLiquidmaxtem() {
        return liquidmaxtem;
    }

    public void setLiquidmaxtem(Double liquidmaxtem) {
        this.liquidmaxtem = liquidmaxtem;
    }

    public Double getLiquidmintem() {
        return liquidmintem;
    }

    public void setLiquidmintem(Double liquidmintem) {
        this.liquidmintem = liquidmintem;
    }

    public Double getLiquidavertem() {
        return liquidavertem;
    }

    public void setLiquidavertem(Double liquidavertem) {
        this.liquidavertem = liquidavertem;
    }

    public Double getSubjecttem() {
        return subjecttem;
    }

    public void setSubjecttem(Double subjecttem) {
        this.subjecttem = subjecttem;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tankid=").append(tankid);
        sb.append(", reportdate=").append(reportdate);
        sb.append(", phone=").append(phone);
        sb.append(", reporter=").append(reporter);
        sb.append(", status=").append(status);
        sb.append(", factoryId=").append(factoryId);
        sb.append(", samenum=").append(samenum);
        sb.append(", tanktype=").append(tanktype);
        sb.append(", tanklength=").append(tanklength);
        sb.append(", tankdiameter=").append(tankdiameter);
        sb.append(", workingvolumn=").append(workingvolumn);
        sb.append(", frequency=").append(frequency);
        sb.append(", capacity=").append(capacity);
        sb.append(", maxheight=").append(maxheight);
        sb.append(", averageheight=").append(averageheight);
        sb.append(", innerstate=").append(innerstate);
        sb.append(", tankcolor=").append(tankcolor);
        sb.append(", paintstate=").append(paintstate);
        sb.append(", uptanktopcolor=").append(uptanktopcolor);
        sb.append(", uptanktoppaintstate=").append(uptanktoppaintstate);
        sb.append(", uptanktoptype=").append(uptanktoptype);
        sb.append(", uptanktopheight=").append(uptanktopheight);
        sb.append(", uproundradius=").append(uproundradius);
        sb.append(", uptanktopgrade=").append(uptanktopgrade);
        sb.append(", vacuumset=").append(vacuumset);
        sb.append(", pressureset=").append(pressureset);
        sb.append(", issetheat=").append(issetheat);
        sb.append(", isunderground=").append(isunderground);
        sb.append(", outtanktoptype=").append(outtanktoptype);
        sb.append(", outtanktopconfig=").append(outtanktopconfig);
        sb.append(", tankstructure=").append(tankstructure);
        sb.append(", intanktopcolor=").append(intanktopcolor);
        sb.append(", intanktoppaintstate=").append(intanktoppaintstate);
        sb.append(", inissupport=").append(inissupport);
        sb.append(", insupportnum=").append(insupportnum);
        sb.append(", insupportradius=").append(insupportradius);
        sb.append(", infloatconnect=").append(infloatconnect);
        sb.append(", inweldtype=").append(inweldtype);
        sb.append(", infloatpantype=").append(infloatpantype);
        sb.append(", instructuretype=").append(instructuretype);
        sb.append(", inconnectwidth=").append(inconnectwidth);
        sb.append(", inplatesize=").append(inplatesize);
        sb.append(", outinfirstseal=").append(outinfirstseal);
        sb.append(", outinsecondseal=").append(outinsecondseal);
        sb.append(", solutiontype=").append(solutiontype);
        sb.append(", solutionname=").append(solutionname);
        sb.append(", solutionversion=").append(solutionversion);
        sb.append(", solutioncomposition=").append(solutioncomposition);
        sb.append(", solutionfraction=").append(solutionfraction);
        sb.append(", streampressure=").append(streampressure);
        sb.append(", streamfraction=").append(streamfraction);
        sb.append(", liquidfraction=").append(liquidfraction);
        sb.append(", liquiddensity=").append(liquiddensity);
        sb.append(", liquidmaxtem=").append(liquidmaxtem);
        sb.append(", liquidmintem=").append(liquidmintem);
        sb.append(", liquidavertem=").append(liquidavertem);
        sb.append(", subjecttem=").append(subjecttem);
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
        Tankinfo other = (Tankinfo) that;
        return (this.getTankid() == null ? other.getTankid() == null : this.getTankid().equals(other.getTankid()))
            && (this.getReportdate() == null ? other.getReportdate() == null : this.getReportdate().equals(other.getReportdate()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getReporter() == null ? other.getReporter() == null : this.getReporter().equals(other.getReporter()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getFactoryId() == null ? other.getFactoryId() == null : this.getFactoryId().equals(other.getFactoryId()))
            && (this.getSamenum() == null ? other.getSamenum() == null : this.getSamenum().equals(other.getSamenum()))
            && (this.getTanktype() == null ? other.getTanktype() == null : this.getTanktype().equals(other.getTanktype()))
            && (this.getTanklength() == null ? other.getTanklength() == null : this.getTanklength().equals(other.getTanklength()))
            && (this.getTankdiameter() == null ? other.getTankdiameter() == null : this.getTankdiameter().equals(other.getTankdiameter()))
            && (this.getWorkingvolumn() == null ? other.getWorkingvolumn() == null : this.getWorkingvolumn().equals(other.getWorkingvolumn()))
            && (this.getFrequency() == null ? other.getFrequency() == null : this.getFrequency().equals(other.getFrequency()))
            && (this.getCapacity() == null ? other.getCapacity() == null : this.getCapacity().equals(other.getCapacity()))
            && (this.getMaxheight() == null ? other.getMaxheight() == null : this.getMaxheight().equals(other.getMaxheight()))
            && (this.getAverageheight() == null ? other.getAverageheight() == null : this.getAverageheight().equals(other.getAverageheight()))
            && (this.getInnerstate() == null ? other.getInnerstate() == null : this.getInnerstate().equals(other.getInnerstate()))
            && (this.getTankcolor() == null ? other.getTankcolor() == null : this.getTankcolor().equals(other.getTankcolor()))
            && (this.getPaintstate() == null ? other.getPaintstate() == null : this.getPaintstate().equals(other.getPaintstate()))
            && (this.getUptanktopcolor() == null ? other.getUptanktopcolor() == null : this.getUptanktopcolor().equals(other.getUptanktopcolor()))
            && (this.getUptanktoppaintstate() == null ? other.getUptanktoppaintstate() == null : this.getUptanktoppaintstate().equals(other.getUptanktoppaintstate()))
            && (this.getUptanktoptype() == null ? other.getUptanktoptype() == null : this.getUptanktoptype().equals(other.getUptanktoptype()))
            && (this.getUptanktopheight() == null ? other.getUptanktopheight() == null : this.getUptanktopheight().equals(other.getUptanktopheight()))
            && (this.getUproundradius() == null ? other.getUproundradius() == null : this.getUproundradius().equals(other.getUproundradius()))
            && (this.getUptanktopgrade() == null ? other.getUptanktopgrade() == null : this.getUptanktopgrade().equals(other.getUptanktopgrade()))
            && (this.getVacuumset() == null ? other.getVacuumset() == null : this.getVacuumset().equals(other.getVacuumset()))
            && (this.getPressureset() == null ? other.getPressureset() == null : this.getPressureset().equals(other.getPressureset()))
            && (this.getIssetheat() == null ? other.getIssetheat() == null : this.getIssetheat().equals(other.getIssetheat()))
            && (this.getIsunderground() == null ? other.getIsunderground() == null : this.getIsunderground().equals(other.getIsunderground()))
            && (this.getOuttanktoptype() == null ? other.getOuttanktoptype() == null : this.getOuttanktoptype().equals(other.getOuttanktoptype()))
            && (this.getOuttanktopconfig() == null ? other.getOuttanktopconfig() == null : this.getOuttanktopconfig().equals(other.getOuttanktopconfig()))
            && (this.getTankstructure() == null ? other.getTankstructure() == null : this.getTankstructure().equals(other.getTankstructure()))
            && (this.getIntanktopcolor() == null ? other.getIntanktopcolor() == null : this.getIntanktopcolor().equals(other.getIntanktopcolor()))
            && (this.getIntanktoppaintstate() == null ? other.getIntanktoppaintstate() == null : this.getIntanktoppaintstate().equals(other.getIntanktoppaintstate()))
            && (this.getInissupport() == null ? other.getInissupport() == null : this.getInissupport().equals(other.getInissupport()))
            && (this.getInsupportnum() == null ? other.getInsupportnum() == null : this.getInsupportnum().equals(other.getInsupportnum()))
            && (this.getInsupportradius() == null ? other.getInsupportradius() == null : this.getInsupportradius().equals(other.getInsupportradius()))
            && (this.getInfloatconnect() == null ? other.getInfloatconnect() == null : this.getInfloatconnect().equals(other.getInfloatconnect()))
            && (this.getInweldtype() == null ? other.getInweldtype() == null : this.getInweldtype().equals(other.getInweldtype()))
            && (this.getInfloatpantype() == null ? other.getInfloatpantype() == null : this.getInfloatpantype().equals(other.getInfloatpantype()))
            && (this.getInstructuretype() == null ? other.getInstructuretype() == null : this.getInstructuretype().equals(other.getInstructuretype()))
            && (this.getInconnectwidth() == null ? other.getInconnectwidth() == null : this.getInconnectwidth().equals(other.getInconnectwidth()))
            && (this.getInplatesize() == null ? other.getInplatesize() == null : this.getInplatesize().equals(other.getInplatesize()))
            && (this.getOutinfirstseal() == null ? other.getOutinfirstseal() == null : this.getOutinfirstseal().equals(other.getOutinfirstseal()))
            && (this.getOutinsecondseal() == null ? other.getOutinsecondseal() == null : this.getOutinsecondseal().equals(other.getOutinsecondseal()))
            && (this.getSolutiontype() == null ? other.getSolutiontype() == null : this.getSolutiontype().equals(other.getSolutiontype()))
            && (this.getSolutionname() == null ? other.getSolutionname() == null : this.getSolutionname().equals(other.getSolutionname()))
            && (this.getSolutionversion() == null ? other.getSolutionversion() == null : this.getSolutionversion().equals(other.getSolutionversion()))
            && (this.getSolutioncomposition() == null ? other.getSolutioncomposition() == null : this.getSolutioncomposition().equals(other.getSolutioncomposition()))
            && (this.getSolutionfraction() == null ? other.getSolutionfraction() == null : this.getSolutionfraction().equals(other.getSolutionfraction()))
            && (this.getStreampressure() == null ? other.getStreampressure() == null : this.getStreampressure().equals(other.getStreampressure()))
            && (this.getStreamfraction() == null ? other.getStreamfraction() == null : this.getStreamfraction().equals(other.getStreamfraction()))
            && (this.getLiquidfraction() == null ? other.getLiquidfraction() == null : this.getLiquidfraction().equals(other.getLiquidfraction()))
            && (this.getLiquiddensity() == null ? other.getLiquiddensity() == null : this.getLiquiddensity().equals(other.getLiquiddensity()))
            && (this.getLiquidmaxtem() == null ? other.getLiquidmaxtem() == null : this.getLiquidmaxtem().equals(other.getLiquidmaxtem()))
            && (this.getLiquidmintem() == null ? other.getLiquidmintem() == null : this.getLiquidmintem().equals(other.getLiquidmintem()))
            && (this.getLiquidavertem() == null ? other.getLiquidavertem() == null : this.getLiquidavertem().equals(other.getLiquidavertem()))
            && (this.getSubjecttem() == null ? other.getSubjecttem() == null : this.getSubjecttem().equals(other.getSubjecttem()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTankid() == null) ? 0 : getTankid().hashCode());
        result = prime * result + ((getReportdate() == null) ? 0 : getReportdate().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getReporter() == null) ? 0 : getReporter().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getFactoryId() == null) ? 0 : getFactoryId().hashCode());
        result = prime * result + ((getSamenum() == null) ? 0 : getSamenum().hashCode());
        result = prime * result + ((getTanktype() == null) ? 0 : getTanktype().hashCode());
        result = prime * result + ((getTanklength() == null) ? 0 : getTanklength().hashCode());
        result = prime * result + ((getTankdiameter() == null) ? 0 : getTankdiameter().hashCode());
        result = prime * result + ((getWorkingvolumn() == null) ? 0 : getWorkingvolumn().hashCode());
        result = prime * result + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        result = prime * result + ((getCapacity() == null) ? 0 : getCapacity().hashCode());
        result = prime * result + ((getMaxheight() == null) ? 0 : getMaxheight().hashCode());
        result = prime * result + ((getAverageheight() == null) ? 0 : getAverageheight().hashCode());
        result = prime * result + ((getInnerstate() == null) ? 0 : getInnerstate().hashCode());
        result = prime * result + ((getTankcolor() == null) ? 0 : getTankcolor().hashCode());
        result = prime * result + ((getPaintstate() == null) ? 0 : getPaintstate().hashCode());
        result = prime * result + ((getUptanktopcolor() == null) ? 0 : getUptanktopcolor().hashCode());
        result = prime * result + ((getUptanktoppaintstate() == null) ? 0 : getUptanktoppaintstate().hashCode());
        result = prime * result + ((getUptanktoptype() == null) ? 0 : getUptanktoptype().hashCode());
        result = prime * result + ((getUptanktopheight() == null) ? 0 : getUptanktopheight().hashCode());
        result = prime * result + ((getUproundradius() == null) ? 0 : getUproundradius().hashCode());
        result = prime * result + ((getUptanktopgrade() == null) ? 0 : getUptanktopgrade().hashCode());
        result = prime * result + ((getVacuumset() == null) ? 0 : getVacuumset().hashCode());
        result = prime * result + ((getPressureset() == null) ? 0 : getPressureset().hashCode());
        result = prime * result + ((getIssetheat() == null) ? 0 : getIssetheat().hashCode());
        result = prime * result + ((getIsunderground() == null) ? 0 : getIsunderground().hashCode());
        result = prime * result + ((getOuttanktoptype() == null) ? 0 : getOuttanktoptype().hashCode());
        result = prime * result + ((getOuttanktopconfig() == null) ? 0 : getOuttanktopconfig().hashCode());
        result = prime * result + ((getTankstructure() == null) ? 0 : getTankstructure().hashCode());
        result = prime * result + ((getIntanktopcolor() == null) ? 0 : getIntanktopcolor().hashCode());
        result = prime * result + ((getIntanktoppaintstate() == null) ? 0 : getIntanktoppaintstate().hashCode());
        result = prime * result + ((getInissupport() == null) ? 0 : getInissupport().hashCode());
        result = prime * result + ((getInsupportnum() == null) ? 0 : getInsupportnum().hashCode());
        result = prime * result + ((getInsupportradius() == null) ? 0 : getInsupportradius().hashCode());
        result = prime * result + ((getInfloatconnect() == null) ? 0 : getInfloatconnect().hashCode());
        result = prime * result + ((getInweldtype() == null) ? 0 : getInweldtype().hashCode());
        result = prime * result + ((getInfloatpantype() == null) ? 0 : getInfloatpantype().hashCode());
        result = prime * result + ((getInstructuretype() == null) ? 0 : getInstructuretype().hashCode());
        result = prime * result + ((getInconnectwidth() == null) ? 0 : getInconnectwidth().hashCode());
        result = prime * result + ((getInplatesize() == null) ? 0 : getInplatesize().hashCode());
        result = prime * result + ((getOutinfirstseal() == null) ? 0 : getOutinfirstseal().hashCode());
        result = prime * result + ((getOutinsecondseal() == null) ? 0 : getOutinsecondseal().hashCode());
        result = prime * result + ((getSolutiontype() == null) ? 0 : getSolutiontype().hashCode());
        result = prime * result + ((getSolutionname() == null) ? 0 : getSolutionname().hashCode());
        result = prime * result + ((getSolutionversion() == null) ? 0 : getSolutionversion().hashCode());
        result = prime * result + ((getSolutioncomposition() == null) ? 0 : getSolutioncomposition().hashCode());
        result = prime * result + ((getSolutionfraction() == null) ? 0 : getSolutionfraction().hashCode());
        result = prime * result + ((getStreampressure() == null) ? 0 : getStreampressure().hashCode());
        result = prime * result + ((getStreamfraction() == null) ? 0 : getStreamfraction().hashCode());
        result = prime * result + ((getLiquidfraction() == null) ? 0 : getLiquidfraction().hashCode());
        result = prime * result + ((getLiquiddensity() == null) ? 0 : getLiquiddensity().hashCode());
        result = prime * result + ((getLiquidmaxtem() == null) ? 0 : getLiquidmaxtem().hashCode());
        result = prime * result + ((getLiquidmintem() == null) ? 0 : getLiquidmintem().hashCode());
        result = prime * result + ((getLiquidavertem() == null) ? 0 : getLiquidavertem().hashCode());
        result = prime * result + ((getSubjecttem() == null) ? 0 : getSubjecttem().hashCode());
        return result;
    }
}