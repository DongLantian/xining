package com.nankai.xining.bean;

import java.io.Serializable;

public class Scchebing implements Serializable {
    private String 编码;

    private String 一级scc;

    private String 一级scc描述;

    private String 二级scc编码;

    private String 二级scc描述;

    private String 三级scc编码;

    private String 三级scc描述;

    private String 四级scc编码;

    private String 四级scc描述;

    private String scc编码;

    private static final long serialVersionUID = 1L;

    public String get编码() {
        return 编码;
    }

    public void set编码(String 编码) {
        this.编码 = 编码 == null ? null : 编码.trim();
    }

    public String get一级scc() {
        return 一级scc;
    }

    public void set一级scc(String 一级scc) {
        this.一级scc = 一级scc == null ? null : 一级scc.trim();
    }

    public String get一级scc描述() {
        return 一级scc描述;
    }

    public void set一级scc描述(String 一级scc描述) {
        this.一级scc描述 = 一级scc描述 == null ? null : 一级scc描述.trim();
    }

    public String get二级scc编码() {
        return 二级scc编码;
    }

    public void set二级scc编码(String 二级scc编码) {
        this.二级scc编码 = 二级scc编码 == null ? null : 二级scc编码.trim();
    }

    public String get二级scc描述() {
        return 二级scc描述;
    }

    public void set二级scc描述(String 二级scc描述) {
        this.二级scc描述 = 二级scc描述 == null ? null : 二级scc描述.trim();
    }

    public String get三级scc编码() {
        return 三级scc编码;
    }

    public void set三级scc编码(String 三级scc编码) {
        this.三级scc编码 = 三级scc编码 == null ? null : 三级scc编码.trim();
    }

    public String get三级scc描述() {
        return 三级scc描述;
    }

    public void set三级scc描述(String 三级scc描述) {
        this.三级scc描述 = 三级scc描述 == null ? null : 三级scc描述.trim();
    }

    public String get四级scc编码() {
        return 四级scc编码;
    }

    public void set四级scc编码(String 四级scc编码) {
        this.四级scc编码 = 四级scc编码 == null ? null : 四级scc编码.trim();
    }

    public String get四级scc描述() {
        return 四级scc描述;
    }

    public void set四级scc描述(String 四级scc描述) {
        this.四级scc描述 = 四级scc描述 == null ? null : 四级scc描述.trim();
    }

    public String getScc编码() {
        return scc编码;
    }

    public void setScc编码(String scc编码) {
        this.scc编码 = scc编码 == null ? null : scc编码.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", 编码=").append(编码);
        sb.append(", 一级scc=").append(一级scc);
        sb.append(", 一级scc描述=").append(一级scc描述);
        sb.append(", 二级scc编码=").append(二级scc编码);
        sb.append(", 二级scc描述=").append(二级scc描述);
        sb.append(", 三级scc编码=").append(三级scc编码);
        sb.append(", 三级scc描述=").append(三级scc描述);
        sb.append(", 四级scc编码=").append(四级scc编码);
        sb.append(", 四级scc描述=").append(四级scc描述);
        sb.append(", scc编码=").append(scc编码);
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
        Scchebing other = (Scchebing) that;
        return (this.get编码() == null ? other.get编码() == null : this.get编码().equals(other.get编码()))
            && (this.get一级scc() == null ? other.get一级scc() == null : this.get一级scc().equals(other.get一级scc()))
            && (this.get一级scc描述() == null ? other.get一级scc描述() == null : this.get一级scc描述().equals(other.get一级scc描述()))
            && (this.get二级scc编码() == null ? other.get二级scc编码() == null : this.get二级scc编码().equals(other.get二级scc编码()))
            && (this.get二级scc描述() == null ? other.get二级scc描述() == null : this.get二级scc描述().equals(other.get二级scc描述()))
            && (this.get三级scc编码() == null ? other.get三级scc编码() == null : this.get三级scc编码().equals(other.get三级scc编码()))
            && (this.get三级scc描述() == null ? other.get三级scc描述() == null : this.get三级scc描述().equals(other.get三级scc描述()))
            && (this.get四级scc编码() == null ? other.get四级scc编码() == null : this.get四级scc编码().equals(other.get四级scc编码()))
            && (this.get四级scc描述() == null ? other.get四级scc描述() == null : this.get四级scc描述().equals(other.get四级scc描述()))
            && (this.getScc编码() == null ? other.getScc编码() == null : this.getScc编码().equals(other.getScc编码()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((get编码() == null) ? 0 : get编码().hashCode());
        result = prime * result + ((get一级scc() == null) ? 0 : get一级scc().hashCode());
        result = prime * result + ((get一级scc描述() == null) ? 0 : get一级scc描述().hashCode());
        result = prime * result + ((get二级scc编码() == null) ? 0 : get二级scc编码().hashCode());
        result = prime * result + ((get二级scc描述() == null) ? 0 : get二级scc描述().hashCode());
        result = prime * result + ((get三级scc编码() == null) ? 0 : get三级scc编码().hashCode());
        result = prime * result + ((get三级scc描述() == null) ? 0 : get三级scc描述().hashCode());
        result = prime * result + ((get四级scc编码() == null) ? 0 : get四级scc编码().hashCode());
        result = prime * result + ((get四级scc描述() == null) ? 0 : get四级scc描述().hashCode());
        result = prime * result + ((getScc编码() == null) ? 0 : getScc编码().hashCode());
        return result;
    }
}