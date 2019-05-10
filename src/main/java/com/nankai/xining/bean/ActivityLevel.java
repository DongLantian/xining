package com.nankai.xining.bean;

import java.io.Serializable;

public class ActivityLevel implements Serializable {
    private String activitysId;

    private Integer activitysQuantity;

    private String level1Name;

    private String level2Name;

    private String level3Name;

    private String level4Name;

    private String level5Name;

    private String level6Name;

    private String level7Name;

    private String level8Name;

    private String level9Name;

    private String level10Name;

    private static final long serialVersionUID = 1L;

    public String getActivitysId() {
        return activitysId;
    }

    public void setActivitysId(String activitysId) {
        this.activitysId = activitysId == null ? null : activitysId.trim();
    }

    public Integer getActivitysQuantity() {
        return activitysQuantity;
    }

    public void setActivitysQuantity(Integer activitysQuantity) {
        this.activitysQuantity = activitysQuantity;
    }

    public String getLevel1Name() {
        return level1Name;
    }

    public void setLevel1Name(String level1Name) {
        this.level1Name = level1Name == null ? null : level1Name.trim();
    }

    public String getLevel2Name() {
        return level2Name;
    }

    public void setLevel2Name(String level2Name) {
        this.level2Name = level2Name == null ? null : level2Name.trim();
    }

    public String getLevel3Name() {
        return level3Name;
    }

    public void setLevel3Name(String level3Name) {
        this.level3Name = level3Name == null ? null : level3Name.trim();
    }

    public String getLevel4Name() {
        return level4Name;
    }

    public void setLevel4Name(String level4Name) {
        this.level4Name = level4Name == null ? null : level4Name.trim();
    }

    public String getLevel5Name() {
        return level5Name;
    }

    public void setLevel5Name(String level5Name) {
        this.level5Name = level5Name == null ? null : level5Name.trim();
    }

    public String getLevel6Name() {
        return level6Name;
    }

    public void setLevel6Name(String level6Name) {
        this.level6Name = level6Name == null ? null : level6Name.trim();
    }

    public String getLevel7Name() {
        return level7Name;
    }

    public void setLevel7Name(String level7Name) {
        this.level7Name = level7Name == null ? null : level7Name.trim();
    }

    public String getLevel8Name() {
        return level8Name;
    }

    public void setLevel8Name(String level8Name) {
        this.level8Name = level8Name == null ? null : level8Name.trim();
    }

    public String getLevel9Name() {
        return level9Name;
    }

    public void setLevel9Name(String level9Name) {
        this.level9Name = level9Name == null ? null : level9Name.trim();
    }

    public String getLevel10Name() {
        return level10Name;
    }

    public void setLevel10Name(String level10Name) {
        this.level10Name = level10Name == null ? null : level10Name.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", activitysId=").append(activitysId);
        sb.append(", activitysQuantity=").append(activitysQuantity);
        sb.append(", level1Name=").append(level1Name);
        sb.append(", level2Name=").append(level2Name);
        sb.append(", level3Name=").append(level3Name);
        sb.append(", level4Name=").append(level4Name);
        sb.append(", level5Name=").append(level5Name);
        sb.append(", level6Name=").append(level6Name);
        sb.append(", level7Name=").append(level7Name);
        sb.append(", level8Name=").append(level8Name);
        sb.append(", level9Name=").append(level9Name);
        sb.append(", level10Name=").append(level10Name);
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
        ActivityLevel other = (ActivityLevel) that;
        return (this.getActivitysId() == null ? other.getActivitysId() == null : this.getActivitysId().equals(other.getActivitysId()))
            && (this.getActivitysQuantity() == null ? other.getActivitysQuantity() == null : this.getActivitysQuantity().equals(other.getActivitysQuantity()))
            && (this.getLevel1Name() == null ? other.getLevel1Name() == null : this.getLevel1Name().equals(other.getLevel1Name()))
            && (this.getLevel2Name() == null ? other.getLevel2Name() == null : this.getLevel2Name().equals(other.getLevel2Name()))
            && (this.getLevel3Name() == null ? other.getLevel3Name() == null : this.getLevel3Name().equals(other.getLevel3Name()))
            && (this.getLevel4Name() == null ? other.getLevel4Name() == null : this.getLevel4Name().equals(other.getLevel4Name()))
            && (this.getLevel5Name() == null ? other.getLevel5Name() == null : this.getLevel5Name().equals(other.getLevel5Name()))
            && (this.getLevel6Name() == null ? other.getLevel6Name() == null : this.getLevel6Name().equals(other.getLevel6Name()))
            && (this.getLevel7Name() == null ? other.getLevel7Name() == null : this.getLevel7Name().equals(other.getLevel7Name()))
            && (this.getLevel8Name() == null ? other.getLevel8Name() == null : this.getLevel8Name().equals(other.getLevel8Name()))
            && (this.getLevel9Name() == null ? other.getLevel9Name() == null : this.getLevel9Name().equals(other.getLevel9Name()))
            && (this.getLevel10Name() == null ? other.getLevel10Name() == null : this.getLevel10Name().equals(other.getLevel10Name()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getActivitysId() == null) ? 0 : getActivitysId().hashCode());
        result = prime * result + ((getActivitysQuantity() == null) ? 0 : getActivitysQuantity().hashCode());
        result = prime * result + ((getLevel1Name() == null) ? 0 : getLevel1Name().hashCode());
        result = prime * result + ((getLevel2Name() == null) ? 0 : getLevel2Name().hashCode());
        result = prime * result + ((getLevel3Name() == null) ? 0 : getLevel3Name().hashCode());
        result = prime * result + ((getLevel4Name() == null) ? 0 : getLevel4Name().hashCode());
        result = prime * result + ((getLevel5Name() == null) ? 0 : getLevel5Name().hashCode());
        result = prime * result + ((getLevel6Name() == null) ? 0 : getLevel6Name().hashCode());
        result = prime * result + ((getLevel7Name() == null) ? 0 : getLevel7Name().hashCode());
        result = prime * result + ((getLevel8Name() == null) ? 0 : getLevel8Name().hashCode());
        result = prime * result + ((getLevel9Name() == null) ? 0 : getLevel9Name().hashCode());
        result = prime * result + ((getLevel10Name() == null) ? 0 : getLevel10Name().hashCode());
        return result;
    }
}