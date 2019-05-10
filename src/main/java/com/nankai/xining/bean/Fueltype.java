package com.nankai.xining.bean;

import java.io.Serializable;

public class Fueltype implements Serializable {
    private Integer fueltypeid;

    private String fuelname;

    private static final long serialVersionUID = 1L;

    public Integer getFueltypeid() {
        return fueltypeid;
    }

    public void setFueltypeid(Integer fueltypeid) {
        this.fueltypeid = fueltypeid;
    }

    public String getFuelname() {
        return fuelname;
    }

    public void setFuelname(String fuelname) {
        this.fuelname = fuelname == null ? null : fuelname.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fueltypeid=").append(fueltypeid);
        sb.append(", fuelname=").append(fuelname);
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
        Fueltype other = (Fueltype) that;
        return (this.getFueltypeid() == null ? other.getFueltypeid() == null : this.getFueltypeid().equals(other.getFueltypeid()))
            && (this.getFuelname() == null ? other.getFuelname() == null : this.getFuelname().equals(other.getFuelname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFueltypeid() == null) ? 0 : getFueltypeid().hashCode());
        result = prime * result + ((getFuelname() == null) ? 0 : getFuelname().hashCode());
        return result;
    }
}