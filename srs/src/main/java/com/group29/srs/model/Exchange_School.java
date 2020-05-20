package com.group29.srs.model;

public class Exchange_School {
    Long school_id;
    String school_name;
    String department;
    String available_semester;
    String school_country;
    Double erasmus_application_point;

    public Exchange_School(Long school_id, String school_name, String department, String available_semester, String school_country, Double erasmus_application_point) {
        this.school_id = school_id;
        this.school_name = school_name;
        this.department = department;
        this.available_semester = available_semester;
        this.school_country = school_country;
        this.erasmus_application_point = erasmus_application_point;
    }

    public Exchange_School() {
    }

    public Long getSchool_id() {
        return school_id;
    }

    public void setSchool_id(Long school_id) {
        this.school_id = school_id;
    }

    public String getSchool_country() {
        return this.school_country;
    }

    public void setSchool_country(String school_country) {
        this.school_country = school_country;
    }

    public Double getErasmus_application_point() {
        return this.erasmus_application_point;
    }

    public void setErasmus_application_point(Double exchange_application_point) {
        this.erasmus_application_point = exchange_application_point;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAvailable_semester() {
        return this.available_semester;
    }

    public void setAvailable_semester(String available_semester) {
        this.available_semester = available_semester;
    }

    @Override
    public String toString() {
        return "Exchange_School{" +
                "school_name='" + school_name + '\'' +
                ", department='" + department + '\'' +
                ", available_semester='" + available_semester + '\'' +
                ", school_country='" + school_country + '\'' +
                ", erasmus_application_point=" + erasmus_application_point +
                '}';
    }
}
