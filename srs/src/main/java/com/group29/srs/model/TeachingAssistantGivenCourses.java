package com.group29.srs.model;

public class TeachingAssistantGivenCourses {
    String course_code;
    String name;

    public TeachingAssistantGivenCourses(String course_code, String name) {
        this.course_code = course_code;
        this.name = name;
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
}
