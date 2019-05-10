package com.nankai.xining.bean;

import java.io.Serializable;

public class CarNum implements Serializable {
    private Integer id;

    private String year;

    private String cartype;

    private String usetype;

    private String fueltype;

    private Integer guo0;

    private Integer guo1;

    private Integer guo2;

    private Integer guo3;

    private Integer guo4;

    private Integer guo5;

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

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype == null ? null : cartype.trim();
    }

    public String getUsetype() {
        return usetype;
    }

    public void setUsetype(String usetype) {
        this.usetype = usetype == null ? null : usetype.trim();
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype == null ? null : fueltype.trim();
    }

    public Integer getGuo0() {
        return guo0;
    }

    public void setGuo0(Integer guo0) {
        this.guo0 = guo0;
    }

    public Integer getGuo1() {
        return guo1;
    }

    public void setGuo1(Integer guo1) {
        this.guo1 = guo1;
    }

    public Integer getGuo2() {
        return guo2;
    }

    public void setGuo2(Integer guo2) {
        this.guo2 = guo2;
    }

    public Integer getGuo3() {
        return guo3;
    }

    public void setGuo3(Integer guo3) {
        this.guo3 = guo3;
    }

    public Integer getGuo4() {
        return guo4;
    }

    public void setGuo4(Integer guo4) {
        this.guo4 = guo4;
    }

    public Integer getGuo5() {
        return guo5;
    }

    public void setGuo5(Integer guo5) {
        this.guo5 = guo5;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", year=").append(year);
        sb.append(", cartype=").append(cartype);
        sb.append(", usetype=").append(usetype);
        sb.append(", fueltype=").append(fueltype);
        sb.append(", guo0=").append(guo0);
        sb.append(", guo1=").append(guo1);
        sb.append(", guo2=").append(guo2);
        sb.append(", guo3=").append(guo3);
        sb.append(", guo4=").append(guo4);
        sb.append(", guo5=").append(guo5);
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
        CarNum other = (CarNum) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getCartype() == null ? other.getCartype() == null : this.getCartype().equals(other.getCartype()))
            && (this.getUsetype() == null ? other.getUsetype() == null : this.getUsetype().equals(other.getUsetype()))
            && (this.getFueltype() == null ? other.getFueltype() == null : this.getFueltype().equals(other.getFueltype()))
            && (this.getGuo0() == null ? other.getGuo0() == null : this.getGuo0().equals(other.getGuo0()))
            && (this.getGuo1() == null ? other.getGuo1() == null : this.getGuo1().equals(other.getGuo1()))
            && (this.getGuo2() == null ? other.getGuo2() == null : this.getGuo2().equals(other.getGuo2()))
            && (this.getGuo3() == null ? other.getGuo3() == null : this.getGuo3().equals(other.getGuo3()))
            && (this.getGuo4() == null ? other.getGuo4() == null : this.getGuo4().equals(other.getGuo4()))
            && (this.getGuo5() == null ? other.getGuo5() == null : this.getGuo5().equals(other.getGuo5()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getCartype() == null) ? 0 : getCartype().hashCode());
        result = prime * result + ((getUsetype() == null) ? 0 : getUsetype().hashCode());
        result = prime * result + ((getFueltype() == null) ? 0 : getFueltype().hashCode());
        result = prime * result + ((getGuo0() == null) ? 0 : getGuo0().hashCode());
        result = prime * result + ((getGuo1() == null) ? 0 : getGuo1().hashCode());
        result = prime * result + ((getGuo2() == null) ? 0 : getGuo2().hashCode());
        result = prime * result + ((getGuo3() == null) ? 0 : getGuo3().hashCode());
        result = prime * result + ((getGuo4() == null) ? 0 : getGuo4().hashCode());
        result = prime * result + ((getGuo5() == null) ? 0 : getGuo5().hashCode());
        return result;
    }
}