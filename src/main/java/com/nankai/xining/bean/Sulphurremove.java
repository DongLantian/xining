package com.nankai.xining.bean;

import java.io.Serializable;

public class Sulphurremove implements Serializable {
    private Integer id;

    private String sulphurRemoveId;

    private String sulphurClassify;

    private String sulphurMethod;

    private Double sulphurRemoveEffi;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSulphurRemoveId() {
        return sulphurRemoveId;
    }

    public void setSulphurRemoveId(String sulphurRemoveId) {
        this.sulphurRemoveId = sulphurRemoveId == null ? null : sulphurRemoveId.trim();
    }

    public String getSulphurClassify() {
        return sulphurClassify;
    }

    public void setSulphurClassify(String sulphurClassify) {
        this.sulphurClassify = sulphurClassify == null ? null : sulphurClassify.trim();
    }

    public String getSulphurMethod() {
        return sulphurMethod;
    }

    public void setSulphurMethod(String sulphurMethod) {
        this.sulphurMethod = sulphurMethod == null ? null : sulphurMethod.trim();
    }

    public Double getSulphurRemoveEffi() {
        return sulphurRemoveEffi;
    }

    public void setSulphurRemoveEffi(Double sulphurRemoveEffi) {
        this.sulphurRemoveEffi = sulphurRemoveEffi;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sulphurRemoveId=").append(sulphurRemoveId);
        sb.append(", sulphurClassify=").append(sulphurClassify);
        sb.append(", sulphurMethod=").append(sulphurMethod);
        sb.append(", sulphurRemoveEffi=").append(sulphurRemoveEffi);
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
        Sulphurremove other = (Sulphurremove) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSulphurRemoveId() == null ? other.getSulphurRemoveId() == null : this.getSulphurRemoveId().equals(other.getSulphurRemoveId()))
            && (this.getSulphurClassify() == null ? other.getSulphurClassify() == null : this.getSulphurClassify().equals(other.getSulphurClassify()))
            && (this.getSulphurMethod() == null ? other.getSulphurMethod() == null : this.getSulphurMethod().equals(other.getSulphurMethod()))
            && (this.getSulphurRemoveEffi() == null ? other.getSulphurRemoveEffi() == null : this.getSulphurRemoveEffi().equals(other.getSulphurRemoveEffi()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSulphurRemoveId() == null) ? 0 : getSulphurRemoveId().hashCode());
        result = prime * result + ((getSulphurClassify() == null) ? 0 : getSulphurClassify().hashCode());
        result = prime * result + ((getSulphurMethod() == null) ? 0 : getSulphurMethod().hashCode());
        result = prime * result + ((getSulphurRemoveEffi() == null) ? 0 : getSulphurRemoveEffi().hashCode());
        return result;
    }
}