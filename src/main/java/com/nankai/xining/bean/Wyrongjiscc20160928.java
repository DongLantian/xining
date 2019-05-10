package com.nankai.xining.bean;

import java.io.Serializable;

public class Wyrongjiscc20160928 implements Serializable {
    private Integer id;

    private String scc;

    private String epaScc;

    private String scc1;

    private String scc1des;

    private String scc2;

    private String scc2des;

    private String scc3;

    private String scc3des;

    private String scc4;

    private String scc4des;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getScc1() {
        return scc1;
    }

    public void setScc1(String scc1) {
        this.scc1 = scc1 == null ? null : scc1.trim();
    }

    public String getScc1des() {
        return scc1des;
    }

    public void setScc1des(String scc1des) {
        this.scc1des = scc1des == null ? null : scc1des.trim();
    }

    public String getScc2() {
        return scc2;
    }

    public void setScc2(String scc2) {
        this.scc2 = scc2 == null ? null : scc2.trim();
    }

    public String getScc2des() {
        return scc2des;
    }

    public void setScc2des(String scc2des) {
        this.scc2des = scc2des == null ? null : scc2des.trim();
    }

    public String getScc3() {
        return scc3;
    }

    public void setScc3(String scc3) {
        this.scc3 = scc3 == null ? null : scc3.trim();
    }

    public String getScc3des() {
        return scc3des;
    }

    public void setScc3des(String scc3des) {
        this.scc3des = scc3des == null ? null : scc3des.trim();
    }

    public String getScc4() {
        return scc4;
    }

    public void setScc4(String scc4) {
        this.scc4 = scc4 == null ? null : scc4.trim();
    }

    public String getScc4des() {
        return scc4des;
    }

    public void setScc4des(String scc4des) {
        this.scc4des = scc4des == null ? null : scc4des.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", scc=").append(scc);
        sb.append(", epaScc=").append(epaScc);
        sb.append(", scc1=").append(scc1);
        sb.append(", scc1des=").append(scc1des);
        sb.append(", scc2=").append(scc2);
        sb.append(", scc2des=").append(scc2des);
        sb.append(", scc3=").append(scc3);
        sb.append(", scc3des=").append(scc3des);
        sb.append(", scc4=").append(scc4);
        sb.append(", scc4des=").append(scc4des);
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
        Wyrongjiscc20160928 other = (Wyrongjiscc20160928) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getScc() == null ? other.getScc() == null : this.getScc().equals(other.getScc()))
            && (this.getEpaScc() == null ? other.getEpaScc() == null : this.getEpaScc().equals(other.getEpaScc()))
            && (this.getScc1() == null ? other.getScc1() == null : this.getScc1().equals(other.getScc1()))
            && (this.getScc1des() == null ? other.getScc1des() == null : this.getScc1des().equals(other.getScc1des()))
            && (this.getScc2() == null ? other.getScc2() == null : this.getScc2().equals(other.getScc2()))
            && (this.getScc2des() == null ? other.getScc2des() == null : this.getScc2des().equals(other.getScc2des()))
            && (this.getScc3() == null ? other.getScc3() == null : this.getScc3().equals(other.getScc3()))
            && (this.getScc3des() == null ? other.getScc3des() == null : this.getScc3des().equals(other.getScc3des()))
            && (this.getScc4() == null ? other.getScc4() == null : this.getScc4().equals(other.getScc4()))
            && (this.getScc4des() == null ? other.getScc4des() == null : this.getScc4des().equals(other.getScc4des()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getScc() == null) ? 0 : getScc().hashCode());
        result = prime * result + ((getEpaScc() == null) ? 0 : getEpaScc().hashCode());
        result = prime * result + ((getScc1() == null) ? 0 : getScc1().hashCode());
        result = prime * result + ((getScc1des() == null) ? 0 : getScc1des().hashCode());
        result = prime * result + ((getScc2() == null) ? 0 : getScc2().hashCode());
        result = prime * result + ((getScc2des() == null) ? 0 : getScc2des().hashCode());
        result = prime * result + ((getScc3() == null) ? 0 : getScc3().hashCode());
        result = prime * result + ((getScc3des() == null) ? 0 : getScc3des().hashCode());
        result = prime * result + ((getScc4() == null) ? 0 : getScc4().hashCode());
        result = prime * result + ((getScc4des() == null) ? 0 : getScc4des().hashCode());
        return result;
    }
}