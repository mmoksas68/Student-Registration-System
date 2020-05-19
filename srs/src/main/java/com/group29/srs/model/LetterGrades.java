package com.group29.srs.model;

public class LetterGrades {
    Long user_id;
    String firstname;
    String lastname;
    Double final_grade;
    String course_code;
    long section_id;

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public long getSection_id() {
        return section_id;
    }

    public void setSection_id(long section_id) {
        this.section_id = section_id;
    }

    public LetterGrades(Long user_id, String firstname, String lastname, Double final_grade, String course_code, long section_id) {
        this.user_id = user_id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.final_grade = final_grade;
        this.course_code = course_code;
        this.section_id = section_id;
    }

    public LetterGrades() {
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

    public Double getFinal_grade() {
        return final_grade;
    }

    public void setFinal_grade(Double final_grade) {
        this.final_grade = final_grade;
    }
}
