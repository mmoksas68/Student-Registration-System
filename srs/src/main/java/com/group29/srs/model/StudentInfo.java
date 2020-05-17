package com.group29.srs.model;

public class StudentInfo {
    String firstname;
    String lastname;
    String mail;
    String dept_name;
    String phone_number;
    Long student_id;
    Double gpa;
    Double cgpa;
    String current_semester;

    public StudentInfo() {
    }

    public StudentInfo(String firstname, String lastname, String mail, String dept_name, String phone_number, Long student_id, Double gpa, Double cgpa, String current_semester) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.mail = mail;
        this.dept_name = dept_name;
        this.phone_number = phone_number;
        this.student_id = student_id;
        this.gpa = gpa;
        this.cgpa = cgpa;
        this.current_semester = current_semester;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    public String getCurrent_semester() {
        return current_semester;
    }

    public void setCurrent_semester(String current_semester) {
        this.current_semester = current_semester;
    }
}
