package com.group29.srs.model;

public class TeachingAssistantGivenCourses {
    String course_code;
    String name;
    String classroom;
    String firstname;
    String lastname;

    public TeachingAssistantGivenCourses(String course_code, String name, String classroom, String firstname, String lastname) {
        this.course_code = course_code;
        this.name = name;
        this.classroom = classroom;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public TeachingAssistantGivenCourses() {
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

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
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
