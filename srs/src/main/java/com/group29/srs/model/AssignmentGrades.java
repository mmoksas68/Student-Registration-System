package com.group29.srs.model;

public class AssignmentGrades {
    Long user_id;
    String firstname;
    String lastname;
    String course_code;
    int section_number;

    public AssignmentGrades(Long user_id, String firstname, String lastname, String course_code, int section_number) {
        this.user_id = user_id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.course_code = course_code;
        this.section_number = section_number;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public int getSection_number() {
        return section_number;
    }

    public void setSection_number(int section_number) {
        this.section_number = section_number;
    }

    public AssignmentGrades() {
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
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
}
