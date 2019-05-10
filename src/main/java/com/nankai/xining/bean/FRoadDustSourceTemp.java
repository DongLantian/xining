package com.nankai.xining.bean;

import java.io.Serializable;

public class FRoadDustSourceTemp implements Serializable {
    private Integer roadDustid;

    private String scccode;

    private Integer factoryid;

    private String companyName;

    private Double startLongitude;

    private Double startLatitude;

    private Double endLongitude;

    private Double endLatitude;

    private String roadType;

    private Double pathLength;

    private String ispave;

    private Double averWidth;

    private Double averWeight;

    private Integer carFlow;

    private Double averSpeed;

    private Double clearTimeInstall;

    private Double clearTimeUninstall;

    private Double sweepSpring;

    private Double sweepSummer;

    private Double sweepFall;

    private Double waterTimesSpring;

    private Double waterTimesSummer;

    private Double waterTimesFall;

    private Integer dustSuppression;

    private String controlMeasures;

    private Double pm10Factors;

    private Double pm25Factors;

    private Double pm25Emission;

    private Double pm10Emission;

    private Double ocEmission;

    private Double bcEmission;

    private static final long serialVersionUID = 1L;

    public Integer getRoadDustid() {
        return roadDustid;
    }

    public void setRoadDustid(Integer roadDustid) {
        this.roadDustid = roadDustid;
    }

    public String getScccode() {
        return scccode;
    }

    public void setScccode(String scccode) {
        this.scccode = scccode == null ? null : scccode.trim();
    }

    public Integer getFactoryid() {
        return factoryid;
    }

    public void setFactoryid(Integer factoryid) {
        this.factoryid = factoryid;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public Double getStartLongitude() {
        return startLongitude;
    }

    public void setStartLongitude(Double startLongitude) {
        this.startLongitude = startLongitude;
    }

    public Double getStartLatitude() {
        return startLatitude;
    }

    public void setStartLatitude(Double startLatitude) {
        this.startLatitude = startLatitude;
    }

    public Double getEndLongitude() {
        return endLongitude;
    }

    public void setEndLongitude(Double endLongitude) {
        this.endLongitude = endLongitude;
    }

    public Double getEndLatitude() {
        return endLatitude;
    }

    public void setEndLatitude(Double endLatitude) {
        this.endLatitude = endLatitude;
    }

    public String getRoadType() {
        return roadType;
    }

    public void setRoadType(String roadType) {
        this.roadType = roadType == null ? null : roadType.trim();
    }

    public Double getPathLength() {
        return pathLength;
    }

    public void setPathLength(Double pathLength) {
        this.pathLength = pathLength;
    }

    public String getIspave() {
        return ispave;
    }

    public void setIspave(String ispave) {
        this.ispave = ispave == null ? null : ispave.trim();
    }

    public Double getAverWidth() {
        return averWidth;
    }

    public void setAverWidth(Double averWidth) {
        this.averWidth = averWidth;
    }

    public Double getAverWeight() {
        return averWeight;
    }

    public void setAverWeight(Double averWeight) {
        this.averWeight = averWeight;
    }

    public Integer getCarFlow() {
        return carFlow;
    }

    public void setCarFlow(Integer carFlow) {
        this.carFlow = carFlow;
    }

    public Double getAverSpeed() {
        return averSpeed;
    }

    public void setAverSpeed(Double averSpeed) {
        this.averSpeed = averSpeed;
    }

    public Double getClearTimeInstall() {
        return clearTimeInstall;
    }

    public void setClearTimeInstall(Double clearTimeInstall) {
        this.clearTimeInstall = clearTimeInstall;
    }

    public Double getClearTimeUninstall() {
        return clearTimeUninstall;
    }

    public void setClearTimeUninstall(Double clearTimeUninstall) {
        this.clearTimeUninstall = clearTimeUninstall;
    }

    public Double getSweepSpring() {
        return sweepSpring;
    }

    public void setSweepSpring(Double sweepSpring) {
        this.sweepSpring = sweepSpring;
    }

    public Double getSweepSummer() {
        return sweepSummer;
    }

    public void setSweepSummer(Double sweepSummer) {
        this.sweepSummer = sweepSummer;
    }

    public Double getSweepFall() {
        return sweepFall;
    }

    public void setSweepFall(Double sweepFall) {
        this.sweepFall = sweepFall;
    }

    public Double getWaterTimesSpring() {
        return waterTimesSpring;
    }

    public void setWaterTimesSpring(Double waterTimesSpring) {
        this.waterTimesSpring = waterTimesSpring;
    }

    public Double getWaterTimesSummer() {
        return waterTimesSummer;
    }

    public void setWaterTimesSummer(Double waterTimesSummer) {
        this.waterTimesSummer = waterTimesSummer;
    }

    public Double getWaterTimesFall() {
        return waterTimesFall;
    }

    public void setWaterTimesFall(Double waterTimesFall) {
        this.waterTimesFall = waterTimesFall;
    }

    public Integer getDustSuppression() {
        return dustSuppression;
    }

    public void setDustSuppression(Integer dustSuppression) {
        this.dustSuppression = dustSuppression;
    }

    public String getControlMeasures() {
        return controlMeasures;
    }

    public void setControlMeasures(String controlMeasures) {
        this.controlMeasures = controlMeasures == null ? null : controlMeasures.trim();
    }

    public Double getPm10Factors() {
        return pm10Factors;
    }

    public void setPm10Factors(Double pm10Factors) {
        this.pm10Factors = pm10Factors;
    }

    public Double getPm25Factors() {
        return pm25Factors;
    }

    public void setPm25Factors(Double pm25Factors) {
        this.pm25Factors = pm25Factors;
    }

    public Double getPm25Emission() {
        return pm25Emission;
    }

    public void setPm25Emission(Double pm25Emission) {
        this.pm25Emission = pm25Emission;
    }

    public Double getPm10Emission() {
        return pm10Emission;
    }

    public void setPm10Emission(Double pm10Emission) {
        this.pm10Emission = pm10Emission;
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
        sb.append(", roadDustid=").append(roadDustid);
        sb.append(", scccode=").append(scccode);
        sb.append(", factoryid=").append(factoryid);
        sb.append(", companyName=").append(companyName);
        sb.append(", startLongitude=").append(startLongitude);
        sb.append(", startLatitude=").append(startLatitude);
        sb.append(", endLongitude=").append(endLongitude);
        sb.append(", endLatitude=").append(endLatitude);
        sb.append(", roadType=").append(roadType);
        sb.append(", pathLength=").append(pathLength);
        sb.append(", ispave=").append(ispave);
        sb.append(", averWidth=").append(averWidth);
        sb.append(", averWeight=").append(averWeight);
        sb.append(", carFlow=").append(carFlow);
        sb.append(", averSpeed=").append(averSpeed);
        sb.append(", clearTimeInstall=").append(clearTimeInstall);
        sb.append(", clearTimeUninstall=").append(clearTimeUninstall);
        sb.append(", sweepSpring=").append(sweepSpring);
        sb.append(", sweepSummer=").append(sweepSummer);
        sb.append(", sweepFall=").append(sweepFall);
        sb.append(", waterTimesSpring=").append(waterTimesSpring);
        sb.append(", waterTimesSummer=").append(waterTimesSummer);
        sb.append(", waterTimesFall=").append(waterTimesFall);
        sb.append(", dustSuppression=").append(dustSuppression);
        sb.append(", controlMeasures=").append(controlMeasures);
        sb.append(", pm10Factors=").append(pm10Factors);
        sb.append(", pm25Factors=").append(pm25Factors);
        sb.append(", pm25Emission=").append(pm25Emission);
        sb.append(", pm10Emission=").append(pm10Emission);
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
        FRoadDustSourceTemp other = (FRoadDustSourceTemp) that;
        return (this.getRoadDustid() == null ? other.getRoadDustid() == null : this.getRoadDustid().equals(other.getRoadDustid()))
            && (this.getScccode() == null ? other.getScccode() == null : this.getScccode().equals(other.getScccode()))
            && (this.getFactoryid() == null ? other.getFactoryid() == null : this.getFactoryid().equals(other.getFactoryid()))
            && (this.getCompanyName() == null ? other.getCompanyName() == null : this.getCompanyName().equals(other.getCompanyName()))
            && (this.getStartLongitude() == null ? other.getStartLongitude() == null : this.getStartLongitude().equals(other.getStartLongitude()))
            && (this.getStartLatitude() == null ? other.getStartLatitude() == null : this.getStartLatitude().equals(other.getStartLatitude()))
            && (this.getEndLongitude() == null ? other.getEndLongitude() == null : this.getEndLongitude().equals(other.getEndLongitude()))
            && (this.getEndLatitude() == null ? other.getEndLatitude() == null : this.getEndLatitude().equals(other.getEndLatitude()))
            && (this.getRoadType() == null ? other.getRoadType() == null : this.getRoadType().equals(other.getRoadType()))
            && (this.getPathLength() == null ? other.getPathLength() == null : this.getPathLength().equals(other.getPathLength()))
            && (this.getIspave() == null ? other.getIspave() == null : this.getIspave().equals(other.getIspave()))
            && (this.getAverWidth() == null ? other.getAverWidth() == null : this.getAverWidth().equals(other.getAverWidth()))
            && (this.getAverWeight() == null ? other.getAverWeight() == null : this.getAverWeight().equals(other.getAverWeight()))
            && (this.getCarFlow() == null ? other.getCarFlow() == null : this.getCarFlow().equals(other.getCarFlow()))
            && (this.getAverSpeed() == null ? other.getAverSpeed() == null : this.getAverSpeed().equals(other.getAverSpeed()))
            && (this.getClearTimeInstall() == null ? other.getClearTimeInstall() == null : this.getClearTimeInstall().equals(other.getClearTimeInstall()))
            && (this.getClearTimeUninstall() == null ? other.getClearTimeUninstall() == null : this.getClearTimeUninstall().equals(other.getClearTimeUninstall()))
            && (this.getSweepSpring() == null ? other.getSweepSpring() == null : this.getSweepSpring().equals(other.getSweepSpring()))
            && (this.getSweepSummer() == null ? other.getSweepSummer() == null : this.getSweepSummer().equals(other.getSweepSummer()))
            && (this.getSweepFall() == null ? other.getSweepFall() == null : this.getSweepFall().equals(other.getSweepFall()))
            && (this.getWaterTimesSpring() == null ? other.getWaterTimesSpring() == null : this.getWaterTimesSpring().equals(other.getWaterTimesSpring()))
            && (this.getWaterTimesSummer() == null ? other.getWaterTimesSummer() == null : this.getWaterTimesSummer().equals(other.getWaterTimesSummer()))
            && (this.getWaterTimesFall() == null ? other.getWaterTimesFall() == null : this.getWaterTimesFall().equals(other.getWaterTimesFall()))
            && (this.getDustSuppression() == null ? other.getDustSuppression() == null : this.getDustSuppression().equals(other.getDustSuppression()))
            && (this.getControlMeasures() == null ? other.getControlMeasures() == null : this.getControlMeasures().equals(other.getControlMeasures()))
            && (this.getPm10Factors() == null ? other.getPm10Factors() == null : this.getPm10Factors().equals(other.getPm10Factors()))
            && (this.getPm25Factors() == null ? other.getPm25Factors() == null : this.getPm25Factors().equals(other.getPm25Factors()))
            && (this.getPm25Emission() == null ? other.getPm25Emission() == null : this.getPm25Emission().equals(other.getPm25Emission()))
            && (this.getPm10Emission() == null ? other.getPm10Emission() == null : this.getPm10Emission().equals(other.getPm10Emission()))
            && (this.getOcEmission() == null ? other.getOcEmission() == null : this.getOcEmission().equals(other.getOcEmission()))
            && (this.getBcEmission() == null ? other.getBcEmission() == null : this.getBcEmission().equals(other.getBcEmission()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoadDustid() == null) ? 0 : getRoadDustid().hashCode());
        result = prime * result + ((getScccode() == null) ? 0 : getScccode().hashCode());
        result = prime * result + ((getFactoryid() == null) ? 0 : getFactoryid().hashCode());
        result = prime * result + ((getCompanyName() == null) ? 0 : getCompanyName().hashCode());
        result = prime * result + ((getStartLongitude() == null) ? 0 : getStartLongitude().hashCode());
        result = prime * result + ((getStartLatitude() == null) ? 0 : getStartLatitude().hashCode());
        result = prime * result + ((getEndLongitude() == null) ? 0 : getEndLongitude().hashCode());
        result = prime * result + ((getEndLatitude() == null) ? 0 : getEndLatitude().hashCode());
        result = prime * result + ((getRoadType() == null) ? 0 : getRoadType().hashCode());
        result = prime * result + ((getPathLength() == null) ? 0 : getPathLength().hashCode());
        result = prime * result + ((getIspave() == null) ? 0 : getIspave().hashCode());
        result = prime * result + ((getAverWidth() == null) ? 0 : getAverWidth().hashCode());
        result = prime * result + ((getAverWeight() == null) ? 0 : getAverWeight().hashCode());
        result = prime * result + ((getCarFlow() == null) ? 0 : getCarFlow().hashCode());
        result = prime * result + ((getAverSpeed() == null) ? 0 : getAverSpeed().hashCode());
        result = prime * result + ((getClearTimeInstall() == null) ? 0 : getClearTimeInstall().hashCode());
        result = prime * result + ((getClearTimeUninstall() == null) ? 0 : getClearTimeUninstall().hashCode());
        result = prime * result + ((getSweepSpring() == null) ? 0 : getSweepSpring().hashCode());
        result = prime * result + ((getSweepSummer() == null) ? 0 : getSweepSummer().hashCode());
        result = prime * result + ((getSweepFall() == null) ? 0 : getSweepFall().hashCode());
        result = prime * result + ((getWaterTimesSpring() == null) ? 0 : getWaterTimesSpring().hashCode());
        result = prime * result + ((getWaterTimesSummer() == null) ? 0 : getWaterTimesSummer().hashCode());
        result = prime * result + ((getWaterTimesFall() == null) ? 0 : getWaterTimesFall().hashCode());
        result = prime * result + ((getDustSuppression() == null) ? 0 : getDustSuppression().hashCode());
        result = prime * result + ((getControlMeasures() == null) ? 0 : getControlMeasures().hashCode());
        result = prime * result + ((getPm10Factors() == null) ? 0 : getPm10Factors().hashCode());
        result = prime * result + ((getPm25Factors() == null) ? 0 : getPm25Factors().hashCode());
        result = prime * result + ((getPm25Emission() == null) ? 0 : getPm25Emission().hashCode());
        result = prime * result + ((getPm10Emission() == null) ? 0 : getPm10Emission().hashCode());
        result = prime * result + ((getOcEmission() == null) ? 0 : getOcEmission().hashCode());
        result = prime * result + ((getBcEmission() == null) ? 0 : getBcEmission().hashCode());
        return result;
    }
}