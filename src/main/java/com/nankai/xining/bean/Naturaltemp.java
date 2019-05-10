package com.nankai.xining.bean;

import java.io.Serializable;

public class Naturaltemp implements Serializable {
    private Integer ntId;

    private String ntYear;

    private String ntDay;

    private String ntHour;

    private Integer ntRow;

    private Integer ntCol;

    private Double ntArea;

    private Double ntNo;

    private Double ntNh3;

    private Double ntCo;

    private Double ntIsop;

    private Double ntOle;

    private Double ntPar;

    private Double ntXyl;

    private Double ntForm;

    private Double ntAld2;

    private Double ntEth;

    private Double ntMeoh;

    private Double ntEtoh;

    private Double ntNr;

    private Double ntTerp;

    private Double ntAldx;

    private Double ntEtha;

    private Double ntIole;

    private static final long serialVersionUID = 1L;

    public Integer getNtId() {
        return ntId;
    }

    public void setNtId(Integer ntId) {
        this.ntId = ntId;
    }

    public String getNtYear() {
        return ntYear;
    }

    public void setNtYear(String ntYear) {
        this.ntYear = ntYear == null ? null : ntYear.trim();
    }

    public String getNtDay() {
        return ntDay;
    }

    public void setNtDay(String ntDay) {
        this.ntDay = ntDay == null ? null : ntDay.trim();
    }

    public String getNtHour() {
        return ntHour;
    }

    public void setNtHour(String ntHour) {
        this.ntHour = ntHour == null ? null : ntHour.trim();
    }

    public Integer getNtRow() {
        return ntRow;
    }

    public void setNtRow(Integer ntRow) {
        this.ntRow = ntRow;
    }

    public Integer getNtCol() {
        return ntCol;
    }

    public void setNtCol(Integer ntCol) {
        this.ntCol = ntCol;
    }

    public Double getNtArea() {
        return ntArea;
    }

    public void setNtArea(Double ntArea) {
        this.ntArea = ntArea;
    }

    public Double getNtNo() {
        return ntNo;
    }

    public void setNtNo(Double ntNo) {
        this.ntNo = ntNo;
    }

    public Double getNtNh3() {
        return ntNh3;
    }

    public void setNtNh3(Double ntNh3) {
        this.ntNh3 = ntNh3;
    }

    public Double getNtCo() {
        return ntCo;
    }

    public void setNtCo(Double ntCo) {
        this.ntCo = ntCo;
    }

    public Double getNtIsop() {
        return ntIsop;
    }

    public void setNtIsop(Double ntIsop) {
        this.ntIsop = ntIsop;
    }

    public Double getNtOle() {
        return ntOle;
    }

    public void setNtOle(Double ntOle) {
        this.ntOle = ntOle;
    }

    public Double getNtPar() {
        return ntPar;
    }

    public void setNtPar(Double ntPar) {
        this.ntPar = ntPar;
    }

    public Double getNtXyl() {
        return ntXyl;
    }

    public void setNtXyl(Double ntXyl) {
        this.ntXyl = ntXyl;
    }

    public Double getNtForm() {
        return ntForm;
    }

    public void setNtForm(Double ntForm) {
        this.ntForm = ntForm;
    }

    public Double getNtAld2() {
        return ntAld2;
    }

    public void setNtAld2(Double ntAld2) {
        this.ntAld2 = ntAld2;
    }

    public Double getNtEth() {
        return ntEth;
    }

    public void setNtEth(Double ntEth) {
        this.ntEth = ntEth;
    }

    public Double getNtMeoh() {
        return ntMeoh;
    }

    public void setNtMeoh(Double ntMeoh) {
        this.ntMeoh = ntMeoh;
    }

    public Double getNtEtoh() {
        return ntEtoh;
    }

    public void setNtEtoh(Double ntEtoh) {
        this.ntEtoh = ntEtoh;
    }

    public Double getNtNr() {
        return ntNr;
    }

    public void setNtNr(Double ntNr) {
        this.ntNr = ntNr;
    }

    public Double getNtTerp() {
        return ntTerp;
    }

    public void setNtTerp(Double ntTerp) {
        this.ntTerp = ntTerp;
    }

    public Double getNtAldx() {
        return ntAldx;
    }

    public void setNtAldx(Double ntAldx) {
        this.ntAldx = ntAldx;
    }

    public Double getNtEtha() {
        return ntEtha;
    }

    public void setNtEtha(Double ntEtha) {
        this.ntEtha = ntEtha;
    }

    public Double getNtIole() {
        return ntIole;
    }

    public void setNtIole(Double ntIole) {
        this.ntIole = ntIole;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ntId=").append(ntId);
        sb.append(", ntYear=").append(ntYear);
        sb.append(", ntDay=").append(ntDay);
        sb.append(", ntHour=").append(ntHour);
        sb.append(", ntRow=").append(ntRow);
        sb.append(", ntCol=").append(ntCol);
        sb.append(", ntArea=").append(ntArea);
        sb.append(", ntNo=").append(ntNo);
        sb.append(", ntNh3=").append(ntNh3);
        sb.append(", ntCo=").append(ntCo);
        sb.append(", ntIsop=").append(ntIsop);
        sb.append(", ntOle=").append(ntOle);
        sb.append(", ntPar=").append(ntPar);
        sb.append(", ntXyl=").append(ntXyl);
        sb.append(", ntForm=").append(ntForm);
        sb.append(", ntAld2=").append(ntAld2);
        sb.append(", ntEth=").append(ntEth);
        sb.append(", ntMeoh=").append(ntMeoh);
        sb.append(", ntEtoh=").append(ntEtoh);
        sb.append(", ntNr=").append(ntNr);
        sb.append(", ntTerp=").append(ntTerp);
        sb.append(", ntAldx=").append(ntAldx);
        sb.append(", ntEtha=").append(ntEtha);
        sb.append(", ntIole=").append(ntIole);
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
        Naturaltemp other = (Naturaltemp) that;
        return (this.getNtId() == null ? other.getNtId() == null : this.getNtId().equals(other.getNtId()))
            && (this.getNtYear() == null ? other.getNtYear() == null : this.getNtYear().equals(other.getNtYear()))
            && (this.getNtDay() == null ? other.getNtDay() == null : this.getNtDay().equals(other.getNtDay()))
            && (this.getNtHour() == null ? other.getNtHour() == null : this.getNtHour().equals(other.getNtHour()))
            && (this.getNtRow() == null ? other.getNtRow() == null : this.getNtRow().equals(other.getNtRow()))
            && (this.getNtCol() == null ? other.getNtCol() == null : this.getNtCol().equals(other.getNtCol()))
            && (this.getNtArea() == null ? other.getNtArea() == null : this.getNtArea().equals(other.getNtArea()))
            && (this.getNtNo() == null ? other.getNtNo() == null : this.getNtNo().equals(other.getNtNo()))
            && (this.getNtNh3() == null ? other.getNtNh3() == null : this.getNtNh3().equals(other.getNtNh3()))
            && (this.getNtCo() == null ? other.getNtCo() == null : this.getNtCo().equals(other.getNtCo()))
            && (this.getNtIsop() == null ? other.getNtIsop() == null : this.getNtIsop().equals(other.getNtIsop()))
            && (this.getNtOle() == null ? other.getNtOle() == null : this.getNtOle().equals(other.getNtOle()))
            && (this.getNtPar() == null ? other.getNtPar() == null : this.getNtPar().equals(other.getNtPar()))
            && (this.getNtXyl() == null ? other.getNtXyl() == null : this.getNtXyl().equals(other.getNtXyl()))
            && (this.getNtForm() == null ? other.getNtForm() == null : this.getNtForm().equals(other.getNtForm()))
            && (this.getNtAld2() == null ? other.getNtAld2() == null : this.getNtAld2().equals(other.getNtAld2()))
            && (this.getNtEth() == null ? other.getNtEth() == null : this.getNtEth().equals(other.getNtEth()))
            && (this.getNtMeoh() == null ? other.getNtMeoh() == null : this.getNtMeoh().equals(other.getNtMeoh()))
            && (this.getNtEtoh() == null ? other.getNtEtoh() == null : this.getNtEtoh().equals(other.getNtEtoh()))
            && (this.getNtNr() == null ? other.getNtNr() == null : this.getNtNr().equals(other.getNtNr()))
            && (this.getNtTerp() == null ? other.getNtTerp() == null : this.getNtTerp().equals(other.getNtTerp()))
            && (this.getNtAldx() == null ? other.getNtAldx() == null : this.getNtAldx().equals(other.getNtAldx()))
            && (this.getNtEtha() == null ? other.getNtEtha() == null : this.getNtEtha().equals(other.getNtEtha()))
            && (this.getNtIole() == null ? other.getNtIole() == null : this.getNtIole().equals(other.getNtIole()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNtId() == null) ? 0 : getNtId().hashCode());
        result = prime * result + ((getNtYear() == null) ? 0 : getNtYear().hashCode());
        result = prime * result + ((getNtDay() == null) ? 0 : getNtDay().hashCode());
        result = prime * result + ((getNtHour() == null) ? 0 : getNtHour().hashCode());
        result = prime * result + ((getNtRow() == null) ? 0 : getNtRow().hashCode());
        result = prime * result + ((getNtCol() == null) ? 0 : getNtCol().hashCode());
        result = prime * result + ((getNtArea() == null) ? 0 : getNtArea().hashCode());
        result = prime * result + ((getNtNo() == null) ? 0 : getNtNo().hashCode());
        result = prime * result + ((getNtNh3() == null) ? 0 : getNtNh3().hashCode());
        result = prime * result + ((getNtCo() == null) ? 0 : getNtCo().hashCode());
        result = prime * result + ((getNtIsop() == null) ? 0 : getNtIsop().hashCode());
        result = prime * result + ((getNtOle() == null) ? 0 : getNtOle().hashCode());
        result = prime * result + ((getNtPar() == null) ? 0 : getNtPar().hashCode());
        result = prime * result + ((getNtXyl() == null) ? 0 : getNtXyl().hashCode());
        result = prime * result + ((getNtForm() == null) ? 0 : getNtForm().hashCode());
        result = prime * result + ((getNtAld2() == null) ? 0 : getNtAld2().hashCode());
        result = prime * result + ((getNtEth() == null) ? 0 : getNtEth().hashCode());
        result = prime * result + ((getNtMeoh() == null) ? 0 : getNtMeoh().hashCode());
        result = prime * result + ((getNtEtoh() == null) ? 0 : getNtEtoh().hashCode());
        result = prime * result + ((getNtNr() == null) ? 0 : getNtNr().hashCode());
        result = prime * result + ((getNtTerp() == null) ? 0 : getNtTerp().hashCode());
        result = prime * result + ((getNtAldx() == null) ? 0 : getNtAldx().hashCode());
        result = prime * result + ((getNtEtha() == null) ? 0 : getNtEtha().hashCode());
        result = prime * result + ((getNtIole() == null) ? 0 : getNtIole().hashCode());
        return result;
    }
}