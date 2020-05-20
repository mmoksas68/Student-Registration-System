package com.group29.srs.model;

public class TakenCourses {
    Long course_id;
    String course_code;
    String name;
    int credits ;
    int section_number;
    String firstname;
    String lastname;

    public TakenCourses() {
    }

    public TakenCourses(String course_code, String name, int credits, int section_number, String firstname, String lastname) {
        this.course_code = course_code;
        this.name = name;
        this.credits = credits;
        this.section_number = section_number;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getSection_number() {
        return section_number;
    }

    public void setSection_number(int section_number) {
        this.section_number = section_number;
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

    @Override
    public String toString() {
        return "TakenCourses{" +
                "course_code='" + course_code + '\'' +
                ", name='" + name + '\'' +
                ", credits=" + credits +
                ", section_number=" + section_number +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public Long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
    }
}
