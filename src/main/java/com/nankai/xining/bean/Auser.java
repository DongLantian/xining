package com.nankai.xining.bean;

import java.io.Serializable;

public class Auser implements Serializable {
    private String 统一社会信用代码;

    private String 密码;

    private String roleid;

    private String status;

    private static final long serialVersionUID = 1L;

    public String get统一社会信用代码() {
        return 统一社会信用代码;
    }

    public void set统一社会信用代码(String 统一社会信用代码) {
        this.统一社会信用代码 = 统一社会信用代码 == null ? null : 统一社会信用代码.trim();
    }

    public String get密码() {
        return 密码;
    }

    public void set密码(String 密码) {
        this.密码 = 密码 == null ? null : 密码.trim();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", 统一社会信用代码=").append(统一社会信用代码);
        sb.append(", 密码=").append(密码);
        sb.append(", roleid=").append(roleid);
        sb.append(", status=").append(status);
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
        Auser other = (Auser) that;
        return (this.get统一社会信用代码() == null ? other.get统一社会信用代码() == null : this.get统一社会信用代码().equals(other.get统一社会信用代码()))
            && (this.get密码() == null ? other.get密码() == null : this.get密码().equals(other.get密码()))
            && (this.getRoleid() == null ? other.getRoleid() == null : this.getRoleid().equals(other.getRoleid()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((get统一社会信用代码() == null) ? 0 : get统一社会信用代码().hashCode());
        result = prime * result + ((get密码() == null) ? 0 : get密码().hashCode());
        result = prime * result + ((getRoleid() == null) ? 0 : getRoleid().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}