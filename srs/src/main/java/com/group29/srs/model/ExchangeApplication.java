package com.group29.srs.model;

public class ExchangeApplication {
    String schoolName1;
    String schoolName2;
    String schoolName3;
    String schoolSemester1;
    String schoolSemester2;
    String schoolSemester3;

    public String getSchoolName1() {
        return schoolName1;
    }

    public void setSchoolName1(String schoolName1) {
        this.schoolName1 = schoolName1;
    }

    public String getSchoolName2() {
        return schoolName2;
    }

    public void setSchoolName2(String schoolName2) {
        this.schoolName2 = schoolName2;
    }

    public String getSchoolName3() {
        return schoolName3;
    }

    public void setSchoolName3(String schoolName3) {
        this.schoolName3 = schoolName3;
    }

    public String getSchoolSemester1() {
        return schoolSemester1;
    }

    public void setSchoolSemester1(String schoolSemester1) {
        this.schoolSemester1 = schoolSemester1;
    }

    public String getSchoolSemester2() {
        return schoolSemester2;
    }

    public void setSchoolSemester2(String schoolSemester2) {
        this.schoolSemester2 = schoolSemester2;
    }

    public String getSchoolSemester3() {
        return schoolSemester3;
    }

    public void setSchoolSemester3(String schoolSemester3) {
        this.schoolSemester3 = schoolSemester3;
    }

    @Override
    public String toString() {
        return "ExchangeApplication{" +
                "schoolName1='" + schoolName1 + '\'' +
                ", schoolName2='" + schoolName2 + '\'' +
                ", schoolName3='" + schoolName3 + '\'' +
                ", schoolSemester1='" + schoolSemester1 + '\'' +
                ", schoolSemester2='" + schoolSemester2 + '\'' +
                ", schoolSemester3='" + schoolSemester3 + '\'' +
                '}';
    }
}
