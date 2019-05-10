package com.nankai.xining.bean;

import java.io.Serializable;

public class Dustremove implements Serializable {
    private Integer id;

    private String dustRemoveId;

    private String dustRemoveName;

    private Double pmRemoveEffi;

    private Double pm10RemoveEffi;

    private Double pm25RemoveEffi;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDustRemoveId() {
        return dustRemoveId;
    }

    public void setDustRemoveId(String dustRemoveId) {
        this.dustRemoveId = dustRemoveId == null ? null : dustRemoveId.trim();
    }

    public String getDustRemoveName() {
        return dustRemoveName;
    }

    public void setDustRemoveName(String dustRemoveName) {
        this.dustRemoveName = dustRemoveName == null ? null : dustRemoveName.trim();
    }

    public Double getPmRemoveEffi() {
        return pmRemoveEffi;
    }

    public void setPmRemoveEffi(Double pmRemoveEffi) {
        this.pmRemoveEffi = pmRemoveEffi;
    }

    public Double getPm10RemoveEffi() {
        return pm10RemoveEffi;
    }

    public void setPm10RemoveEffi(Double pm10RemoveEffi) {
        this.pm10RemoveEffi = pm10RemoveEffi;
    }

    public Double getPm25RemoveEffi() {
        return pm25RemoveEffi;
    }

    public void setPm25RemoveEffi(Double pm25RemoveEffi) {
        this.pm25RemoveEffi = pm25RemoveEffi;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", dustRemoveId=").append(dustRemoveId);
        sb.append(", dustRemoveName=").append(dustRemoveName);
        sb.append(", pmRemoveEffi=").append(pmRemoveEffi);
        sb.append(", pm10RemoveEffi=").append(pm10RemoveEffi);
        sb.append(", pm25RemoveEffi=").append(pm25RemoveEffi);
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
        Dustremove other = (Dustremove) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDustRemoveId() == null ? other.getDustRemoveId() == null : this.getDustRemoveId().equals(other.getDustRemoveId()))
            && (this.getDustRemoveName() == null ? other.getDustRemoveName() == null : this.getDustRemoveName().equals(other.getDustRemoveName()))
            && (this.getPmRemoveEffi() == null ? other.getPmRemoveEffi() == null : this.getPmRemoveEffi().equals(other.getPmRemoveEffi()))
            && (this.getPm10RemoveEffi() == null ? other.getPm10RemoveEffi() == null : this.getPm10RemoveEffi().equals(other.getPm10RemoveEffi()))
            && (this.getPm25RemoveEffi() == null ? other.getPm25RemoveEffi() == null : this.getPm25RemoveEffi().equals(other.getPm25RemoveEffi()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDustRemoveId() == null) ? 0 : getDustRemoveId().hashCode());
        result = prime * result + ((getDustRemoveName() == null) ? 0 : getDustRemoveName().hashCode());
        result = prime * result + ((getPmRemoveEffi() == null) ? 0 : getPmRemoveEffi().hashCode());
        result = prime * result + ((getPm10RemoveEffi() == null) ? 0 : getPm10RemoveEffi().hashCode());
        result = prime * result + ((getPm25RemoveEffi() == null) ? 0 : getPm25RemoveEffi().hashCode());
        return result;
    }
}