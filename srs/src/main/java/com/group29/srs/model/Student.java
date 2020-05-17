package com.group29.srs.model;

import java.util.Date;

public class Student {
    Long student_id;
    String address;
    Double gpa;
    Double cpga;
    Double erasmus_application_point;
    String gender;
    Date date_of_birth;
    int age;
    String current_semester;

    public Student(Long student_id, String address, Double gpa, Double cpga, Double erasmus_application_point, String gender, Date date_of_birth, int age, String current_semester) {
        this.student_id = student_id;
        this.address = address;
        this.gpa = gpa;
        this.cpga = cpga;
        this.erasmus_application_point = erasmus_application_point;
        this.gender = gender;
        this.date_of_birth = date_of_birth;
        this.age = age;
        this.current_semester = current_semester;
    }

    public Student() {
    }

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public Double getCpga() {
        return cpga;
    }

    public void setCpga(Double cpga) {
        this.cpga = cpga;
    }

    public Double getErasmus_application_point() {
        return erasmus_application_point;
    }

    public void setErasmus_application_point(Double erasmus_application_point) {
        this.erasmus_application_point = erasmus_application_point;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCurrent_semester() {
        return current_semester;
    }

    public void setCurrent_semester(String current_semester) {
        this.current_semester = current_semester;
    }
}
