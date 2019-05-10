package com.nankai.xining.bean;

import java.io.Serializable;

public class Shipping implements Serializable {
    private Integer id;

    private String year;

    private String countyId;

    private String sccCode;

    private String shippingType;

    private Double totalThroughput;

    private Double circularFlow;

    private Double averageWeight;

    private Double navigationDistance;

    private Double circularFlowConsuption;

    private Double ratio;

    private Double pm10Emission;

    private Double pm25Emission;

    private Double hcEmission;

    private Double coEmission;

    private Double noxEmission;

    private Double so2Emission;

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

    public String getCountyId() {
        return countyId;
    }

    public void setCountyId(String countyId) {
        this.countyId = countyId == null ? null : countyId.trim();
    }

    public String getSccCode() {
        return sccCode;
    }

    public void setSccCode(String sccCode) {
        this.sccCode = sccCode == null ? null : sccCode.trim();
    }

    public String getShippingType() {
        return shippingType;
    }

    public void setShippingType(String shippingType) {
        this.shippingType = shippingType == null ? null : shippingType.trim();
    }

    public Double getTotalThroughput() {
        return totalThroughput;
    }

    public void setTotalThroughput(Double totalThroughput) {
        this.totalThroughput = totalThroughput;
    }

    public Double getCircularFlow() {
        return circularFlow;
    }

    public void setCircularFlow(Double circularFlow) {
        this.circularFlow = circularFlow;
    }

    public Double getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(Double averageWeight) {
        this.averageWeight = averageWeight;
    }

    public Double getNavigationDistance() {
        return navigationDistance;
    }

    public void setNavigationDistance(Double navigationDistance) {
        this.navigationDistance = navigationDistance;
    }

    public Double getCircularFlowConsuption() {
        return circularFlowConsuption;
    }

    public void setCircularFlowConsuption(Double circularFlowConsuption) {
        this.circularFlowConsuption = circularFlowConsuption;
    }

    public Double getRatio() {
        return ratio;
    }

    public void setRatio(Double ratio) {
        this.ratio = ratio;
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

    public Double getHcEmission() {
        return hcEmission;
    }

    public void setHcEmission(Double hcEmission) {
        this.hcEmission = hcEmission;
    }

    public Double getCoEmission() {
        return coEmission;
    }

    public void setCoEmission(Double coEmission) {
        this.coEmission = coEmission;
    }

    public Double getNoxEmission() {
        return noxEmission;
    }

    public void setNoxEmission(Double noxEmission) {
        this.noxEmission = noxEmission;
    }

    public Double getSo2Emission() {
        return so2Emission;
    }

    public void setSo2Emission(Double so2Emission) {
        this.so2Emission = so2Emission;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", year=").append(year);
        sb.append(", countyId=").append(countyId);
        sb.append(", sccCode=").append(sccCode);
        sb.append(", shippingType=").append(shippingType);
        sb.append(", totalThroughput=").append(totalThroughput);
        sb.append(", circularFlow=").append(circularFlow);
        sb.append(", averageWeight=").append(averageWeight);
        sb.append(", navigationDistance=").append(navigationDistance);
        sb.append(", circularFlowConsuption=").append(circularFlowConsuption);
        sb.append(", ratio=").append(ratio);
        sb.append(", pm10Emission=").append(pm10Emission);
        sb.append(", pm25Emission=").append(pm25Emission);
        sb.append(", hcEmission=").append(hcEmission);
        sb.append(", coEmission=").append(coEmission);
        sb.append(", noxEmission=").append(noxEmission);
        sb.append(", so2Emission=").append(so2Emission);
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
        Shipping other = (Shipping) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getCountyId() == null ? other.getCountyId() == null : this.getCountyId().equals(other.getCountyId()))
            && (this.getSccCode() == null ? other.getSccCode() == null : this.getSccCode().equals(other.getSccCode()))
            && (this.getShippingType() == null ? other.getShippingType() == null : this.getShippingType().equals(other.getShippingType()))
            && (this.getTotalThroughput() == null ? other.getTotalThroughput() == null : this.getTotalThroughput().equals(other.getTotalThroughput()))
            && (this.getCircularFlow() == null ? other.getCircularFlow() == null : this.getCircularFlow().equals(other.getCircularFlow()))
            && (this.getAverageWeight() == null ? other.getAverageWeight() == null : this.getAverageWeight().equals(other.getAverageWeight()))
            && (this.getNavigationDistance() == null ? other.getNavigationDistance() == null : this.getNavigationDistance().equals(other.getNavigationDistance()))
            && (this.getCircularFlowConsuption() == null ? other.getCircularFlowConsuption() == null : this.getCircularFlowConsuption().equals(other.getCircularFlowConsuption()))
            && (this.getRatio() == null ? other.getRatio() == null : this.getRatio().equals(other.getRatio()))
            && (this.getPm10Emission() == null ? other.getPm10Emission() == null : this.getPm10Emission().equals(other.getPm10Emission()))
            && (this.getPm25Emission() == null ? other.getPm25Emission() == null : this.getPm25Emission().equals(other.getPm25Emission()))
            && (this.getHcEmission() == null ? other.getHcEmission() == null : this.getHcEmission().equals(other.getHcEmission()))
            && (this.getCoEmission() == null ? other.getCoEmission() == null : this.getCoEmission().equals(other.getCoEmission()))
            && (this.getNoxEmission() == null ? other.getNoxEmission() == null : this.getNoxEmission().equals(other.getNoxEmission()))
            && (this.getSo2Emission() == null ? other.getSo2Emission() == null : this.getSo2Emission().equals(other.getSo2Emission()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getCountyId() == null) ? 0 : getCountyId().hashCode());
        result = prime * result + ((getSccCode() == null) ? 0 : getSccCode().hashCode());
        result = prime * result + ((getShippingType() == null) ? 0 : getShippingType().hashCode());
        result = prime * result + ((getTotalThroughput() == null) ? 0 : getTotalThroughput().hashCode());
        result = prime * result + ((getCircularFlow() == null) ? 0 : getCircularFlow().hashCode());
        result = prime * result + ((getAverageWeight() == null) ? 0 : getAverageWeight().hashCode());
        result = prime * result + ((getNavigationDistance() == null) ? 0 : getNavigationDistance().hashCode());
        result = prime * result + ((getCircularFlowConsuption() == null) ? 0 : getCircularFlowConsuption().hashCode());
        result = prime * result + ((getRatio() == null) ? 0 : getRatio().hashCode());
        result = prime * result + ((getPm10Emission() == null) ? 0 : getPm10Emission().hashCode());
        result = prime * result + ((getPm25Emission() == null) ? 0 : getPm25Emission().hashCode());
        result = prime * result + ((getHcEmission() == null) ? 0 : getHcEmission().hashCode());
        result = prime * result + ((getCoEmission() == null) ? 0 : getCoEmission().hashCode());
        result = prime * result + ((getNoxEmission() == null) ? 0 : getNoxEmission().hashCode());
        result = prime * result + ((getSo2Emission() == null) ? 0 : getSo2Emission().hashCode());
        return result;
    }
}