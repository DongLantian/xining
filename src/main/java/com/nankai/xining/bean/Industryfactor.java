package com.nankai.xining.bean;

import java.io.Serializable;

public class Industryfactor implements Serializable {
    private Integer industryfactorid;

    private String industryname;

    private Double evalatePm;

    private Double evalateNox;

    private Double evalateSo2;

    private Double localPm10;

    private Double localPm25;

    private Double referenceOcs;

    private Double referenceCo;

    private Integer fueltypeid;

    private static final long serialVersionUID = 1L;

    public Integer getIndustryfactorid() {
        return industryfactorid;
    }

    public void setIndustryfactorid(Integer industryfactorid) {
        this.industryfactorid = industryfactorid;
    }

    public String getIndustryname() {
        return industryname;
    }

    public void setIndustryname(String industryname) {
        this.industryname = industryname == null ? null : industryname.trim();
    }

    public Double getEvalatePm() {
        return evalatePm;
    }

    public void setEvalatePm(Double evalatePm) {
        this.evalatePm = evalatePm;
    }

    public Double getEvalateNox() {
        return evalateNox;
    }

    public void setEvalateNox(Double evalateNox) {
        this.evalateNox = evalateNox;
    }

    public Double getEvalateSo2() {
        return evalateSo2;
    }

    public void setEvalateSo2(Double evalateSo2) {
        this.evalateSo2 = evalateSo2;
    }

    public Double getLocalPm10() {
        return localPm10;
    }

    public void setLocalPm10(Double localPm10) {
        this.localPm10 = localPm10;
    }

    public Double getLocalPm25() {
        return localPm25;
    }

    public void setLocalPm25(Double localPm25) {
        this.localPm25 = localPm25;
    }

    public Double getReferenceOcs() {
        return referenceOcs;
    }

    public void setReferenceOcs(Double referenceOcs) {
        this.referenceOcs = referenceOcs;
    }

    public Double getReferenceCo() {
        return referenceCo;
    }

    public void setReferenceCo(Double referenceCo) {
        this.referenceCo = referenceCo;
    }

    public Integer getFueltypeid() {
        return fueltypeid;
    }

    public void setFueltypeid(Integer fueltypeid) {
        this.fueltypeid = fueltypeid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", industryfactorid=").append(industryfactorid);
        sb.append(", industryname=").append(industryname);
        sb.append(", evalatePm=").append(evalatePm);
        sb.append(", evalateNox=").append(evalateNox);
        sb.append(", evalateSo2=").append(evalateSo2);
        sb.append(", localPm10=").append(localPm10);
        sb.append(", localPm25=").append(localPm25);
        sb.append(", referenceOcs=").append(referenceOcs);
        sb.append(", referenceCo=").append(referenceCo);
        sb.append(", fueltypeid=").append(fueltypeid);
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
        Industryfactor other = (Industryfactor) that;
        return (this.getIndustryfactorid() == null ? other.getIndustryfactorid() == null : this.getIndustryfactorid().equals(other.getIndustryfactorid()))
            && (this.getIndustryname() == null ? other.getIndustryname() == null : this.getIndustryname().equals(other.getIndustryname()))
            && (this.getEvalatePm() == null ? other.getEvalatePm() == null : this.getEvalatePm().equals(other.getEvalatePm()))
            && (this.getEvalateNox() == null ? other.getEvalateNox() == null : this.getEvalateNox().equals(other.getEvalateNox()))
            && (this.getEvalateSo2() == null ? other.getEvalateSo2() == null : this.getEvalateSo2().equals(other.getEvalateSo2()))
            && (this.getLocalPm10() == null ? other.getLocalPm10() == null : this.getLocalPm10().equals(other.getLocalPm10()))
            && (this.getLocalPm25() == null ? other.getLocalPm25() == null : this.getLocalPm25().equals(other.getLocalPm25()))
            && (this.getReferenceOcs() == null ? other.getReferenceOcs() == null : this.getReferenceOcs().equals(other.getReferenceOcs()))
            && (this.getReferenceCo() == null ? other.getReferenceCo() == null : this.getReferenceCo().equals(other.getReferenceCo()))
            && (this.getFueltypeid() == null ? other.getFueltypeid() == null : this.getFueltypeid().equals(other.getFueltypeid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIndustryfactorid() == null) ? 0 : getIndustryfactorid().hashCode());
        result = prime * result + ((getIndustryname() == null) ? 0 : getIndustryname().hashCode());
        result = prime * result + ((getEvalatePm() == null) ? 0 : getEvalatePm().hashCode());
        result = prime * result + ((getEvalateNox() == null) ? 0 : getEvalateNox().hashCode());
        result = prime * result + ((getEvalateSo2() == null) ? 0 : getEvalateSo2().hashCode());
        result = prime * result + ((getLocalPm10() == null) ? 0 : getLocalPm10().hashCode());
        result = prime * result + ((getLocalPm25() == null) ? 0 : getLocalPm25().hashCode());
        result = prime * result + ((getReferenceOcs() == null) ? 0 : getReferenceOcs().hashCode());
        result = prime * result + ((getReferenceCo() == null) ? 0 : getReferenceCo().hashCode());
        result = prime * result + ((getFueltypeid() == null) ? 0 : getFueltypeid().hashCode());
        return result;
    }
}